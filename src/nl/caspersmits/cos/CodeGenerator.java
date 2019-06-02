package nl.caspersmits.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends LongTalkBaseVisitor<ArrayList<String>> {
    private ParseTreeProperty<DataType> types;
    private ArrayList<String> errors = new ArrayList<>();

    private int currentVariableSlot = 1;
    private int branchCounter = 0;
    private int ifInnerBranchCounter = 0;

    private Scope currentScope = new Scope();

    public ArrayList<String> getErrors() {
        return errors;
    }

    public CodeGenerator(ParseTreeProperty<DataType> types ) {
        this.types = types;
    }

    @Override
    public ArrayList<String> visitProgram( LongTalkParser.ProgramContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        // Main method
        code.add(".method public static main([Ljava/lang/String;)V");
        code.add(".limit stack 99");
        code.add(".limit locals 99");
        code.add("");

        for( LongTalkParser.StatementContext statement : ctx.statement() )
            code.addAll(visit(statement));

        code.add("return");

        return code;
    }

    @Override
    public ArrayList<String> visitIfstatement( LongTalkParser.IfstatementContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        // Increment branchCounter so next loop has proper labels
        int branch = ++branchCounter;

        code.addAll(visit(ctx.compareExpression));

        code.add("ldc " + (ctx.NEGATION() != null ? "0" : "1"));
        code.add("if_icmpeq ifthen" + branch);

        code.addAll( visit(ctx.elseifstatement(0) ));

        code.addAll(visit(ctx.elsestatements));

        code.add("goto ifend" + branch);

        code.add("ifthen" + branch + ":");

        code.addAll(visit(ctx.thenstatements));

        code.add("ifend" + branch + ":");

        // Reset innerBranchCounter
        ifInnerBranchCounter = 0;

        return code;
    }

    @Override
    public ArrayList<String> visitElseifstatement( LongTalkParser.ElseifstatementContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        int parentBranch = branchCounter;
        int innerBranch = ++ifInnerBranchCounter;

        code.addAll(visit(ctx.compareExpression));

        code.add("ldc " + (ctx.NEGATION() != null ? "0" : "1"));

        // Go to end of this elseif block if false (opposite of ifstatement!)
        code.add("if_icmpne ifend" + parentBranch + "_" + innerBranch);

        code.addAll( visit(ctx.thenstatements) );

        // If done, go to end of parent block
        code.add("goto ifend" + parentBranch);

        // End of elseif block
        code.add("ifend" + parentBranch + "_" + innerBranch + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitDeclaration( LongTalkParser.DeclarationContext ctx ) {
        // Generate extra slot
        Integer slot = currentVariableSlot++;
        DataType dataType;

        String declaredType = ctx.declaredType.getText();
        switch (declaredType) {
            case "int":
                dataType = DataType.INT;
                break;
            case "string":
                dataType = DataType.STRING;
                break;
            case "boolean":
                dataType = DataType.BOOLEAN;
                break;
            default:
                errors.add("Bad declaration");
                return null;
        }

        currentScope.declareVariable(new Symbol(ctx.IDENTIFIER().getText(), dataType, slot));

        return new ArrayList<>();
    }

    @Override
    public ArrayList<String> visitAssignment( LongTalkParser.AssignmentContext ctx ) {
        ArrayList<String> code = visit(ctx.expression());

        Symbol symbol = currentScope.lookupVariable(ctx.IDENTIFIER().getText());

        if( symbol.type == DataType.INT || symbol.type == DataType.BOOLEAN)
            code.add(String.format("istore %d", symbol.slot));
        else if( symbol.type == DataType.STRING )
            code.add(String.format("astore %d", symbol.slot));

        return code;
    }

    @Override
    public ArrayList<String> visitPrintstatement( LongTalkParser.PrintstatementContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        code.addAll( visit(ctx.expression()) );

        DataType expressionType = types.get(ctx);

        if( expressionType == DataType.INT )
            code.add("invokevirtual java/io/PrintStream/println(I)V");
        else if( expressionType == DataType.STRING )
            code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else if( expressionType == DataType.BOOLEAN )
            code.add("invokevirtual java/io/PrintStream/println(Z)V");
        else
            errors.add("Not a valid println found for " + ctx.expression().getText());
        return code;
    }

    @Override
    public ArrayList<String> visitExParenthesis( LongTalkParser.ExParenthesisContext ctx ) {
        return new ArrayList<>(visit(ctx.expression()));
    }

    @Override
    public ArrayList<String> visitExMathOp( LongTalkParser.ExMathOpContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll( visit( ctx.left ));
        code.addAll( visit( ctx.right ));

        switch (ctx.op.getText()) {
            case "*":
                code.add("imul");
                break;
            case "/":
                code.add("idiv");
                break;
            case "+":
                code.add("iadd");
                break;
            case "-":
                code.add("isub");
                break;
            default:
                errors.add("Unknown operator found");
        }

        return code;
    }

    @Override
    public ArrayList<String> visitExLogicOp( LongTalkParser.ExLogicOpContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        code.addAll( visit( ctx.left ) );
        code.addAll( visit( ctx.right ) );

        int branch = branchCounter++;

        String operator = ctx.op.getText();
        String operatorInstruction = "";
        switch(operator) {
            case "<=":
                operatorInstruction = "if_icmple";
                break;
            case "<":
                operatorInstruction = "if_icmplt";
                break;
            case ">=":
                operatorInstruction = "if_icmpge";
                break;
            case ">":
                operatorInstruction = "if_icmpgt";
                break;
            case "==":
                operatorInstruction = "if_icmpeq";
                break;
            case "!=":
                operatorInstruction = "if_icmpne";
                break;
            default:
                errors.add("Unknown operator found");
        }

        code.add(operatorInstruction + " lgctrue" + branch);
        code.add("ldc 0"); //false
        code.add("goto lgcend" + branch);
        code.add("lgctrue" + branch + ":");
        code.add("ldc 1"); //true
        code.add("lgcend" + branch + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitExAndOrOp( LongTalkParser.ExAndOrOpContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        int branch = branchCounter++;

        // Visit both boolean statements
        code.addAll( visit(ctx.left) );
        code.addAll( visit(ctx.right) );

        // add them both up
        code.add("iadd");

        String operator = ctx.and.getText();
        switch(operator) {
            case "&&": // Both must be true, so added they need == `2`
                code.add("ldc 2");
                break;
            case "||": // At least one must be true, so added they need >= `1`
                code.add("ldc 1");
                break;
        }

        code.add("if_icmpge lgctrue" + branch);
        code.add("ldc 0"); //false
        code.add("goto lgcend" + branch);
        code.add("lgctrue" + branch + ":");
        code.add("ldc 1"); //true
        code.add("lgcend" + branch + ":");

        return code;
    }

    @Override
    public ArrayList<String> visitExIdentifier( LongTalkParser.ExIdentifierContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        Symbol symbol = currentScope.lookupVariable(ctx.IDENTIFIER().getText());

        if (symbol == null) {
            errors.add("Symbol was null; " + ctx.IDENTIFIER().getText());
            return new ArrayList<>();
        }

        DataType type = symbol.type;
        if (type == null || symbol.slot == null) {
            errors.add("DataType or slot was null; " + ctx.IDENTIFIER().getText());
            return new ArrayList<>();
        }

        if( type == DataType.INT  || type == DataType.BOOLEAN)
            code.add("iload " + symbol.slot);
        else if( type == DataType.STRING )
            code.add("aload " + symbol.slot);

        return code;
    }

    @Override
    public ArrayList<String> visitExIntegerLiteral( LongTalkParser.ExIntegerLiteralContext ctx ) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.INT().getText() );
        return code;
    }

    @Override
    public ArrayList<String> visitExStringLiteral( LongTalkParser.ExStringLiteralContext ctx ) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.STRING().getText() );
        return code;
    }

    @Override
    public ArrayList<String> visitExBooleanLiteral( LongTalkParser.ExBooleanLiteralContext ctx ) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + (ctx.BOOLEAN().getText().equals("TRUE") ? 1 : 0) );
        return code;
    }
}
