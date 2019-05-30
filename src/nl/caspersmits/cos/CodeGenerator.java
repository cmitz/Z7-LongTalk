package nl.caspersmits.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends LongTalkBaseVisitor<ArrayList<String>> {
    private ParseTreeProperty<DataType> types;
    private Scope scope;
    private int currentVariableSlot = 1;

    public CodeGenerator(ParseTreeProperty<DataType> types, Scope scope ) {
        this.types = types;
        this.scope = scope;
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
            code.add("; Oops... should have a println()-call here...");
        return code;
    }

    @Override
    public ArrayList<String> visitAssignment( LongTalkParser.AssignmentContext ctx ) {
        ArrayList<String> code = visit(ctx.expression());

        String variableName = ctx.getChild(0).getText();
        int slot = currentVariableSlot++;

        DataType expressionType = types.get(ctx);

        if( expressionType == DataType.INT || expressionType == DataType.BOOLEAN)
            code.add(String.format("istore %d", slot));
        else if( expressionType == DataType.STRING )
            code.add(String.format("astore %d", slot));

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
