package nl.caspersmits.cos;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

/**
 * The checker typechecks all declarations, assignments, checks. It also checks scoping and prevents out of scope errors
 */
public class Checker extends LongTalkBaseVisitor<DataType> {
    private ParseTreeProperty<DataType> types = new ParseTreeProperty<>();
    private ArrayList<String> errors = new ArrayList<>();

    private Scope currentScope = new Scope();

    public ParseTreeProperty<DataType> getTypes() {
        return types;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void addError(ParserRuleContext ctx, String string) {
        if (ctx != null) {
            errors.add(String.format("Error on line %d: %s", ctx.start.getLine(), string));
        } else {
            errors.add(string);
        }
    }

    @Override
    public DataType visitProgram(LongTalkParser.ProgramContext ctx ) {
        currentScope = currentScope.createChildScope();

        for( LongTalkParser.StatementContext statement : ctx.statement() )
            visit(statement);

        currentScope = currentScope.getParentScope();
        return null;
    }

    @Override
    public DataType visitDeclaration(LongTalkParser.DeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
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
                addError(ctx, "Not a valid declaration, use \"int\", \"string\" or \"boolean\"");
                return null;
        }

        currentScope.declareVariable(new Symbol(variableName, dataType));

        return null;
    }

    @Override
    public DataType visitAssignment(LongTalkParser.AssignmentContext ctx) {
        DataType valueType = visit(ctx.expression());

        if (valueType == null) {
            addError(ctx, "Invalid type of assignment NULL");
            return null;
        }

        Symbol symbol = currentScope.lookupVariable(ctx.IDENTIFIER().getText());

        if (symbol.type != valueType) {
            addError(ctx, String.format("Cannot assign value of type %s to symbol of type %s", valueType, symbol.type));
        }

        //TODO: put ctx in types?
        types.put(ctx, symbol.type);

        return null;
    }

    @Override
    public DataType visitPrintstatement(LongTalkParser.PrintstatementContext ctx) {
        DataType expressionType = visit(ctx.expression());

        types.put(ctx, expressionType);

        return expressionType;
    }

    @Override
    public DataType visitExMathOp(LongTalkParser.ExMathOpContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != rightType && leftType != DataType.INT) {
            addError(ctx, "Only INT types support mathematical operations");
        }

        types.put(ctx, leftType);

        return leftType;
    }

    @Override
    public DataType visitExIdentifier(LongTalkParser.ExIdentifierContext ctx) {
        Symbol symbol = currentScope.lookupVariable(ctx.getText());

        // Some error occured, see this.errors
        if(symbol == null) {
            addError(ctx, String.format("Variable %s not declared.", ctx.getText()));
            return null;
        }

        types.put(ctx, symbol.type);

        return symbol.type;
    }


    @Override
    public DataType visitExIntegerLiteral(LongTalkParser.ExIntegerLiteralContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitExStringLiteral(LongTalkParser.ExStringLiteralContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitExBooleanLiteral(LongTalkParser.ExBooleanLiteralContext ctx) {
        return DataType.BOOLEAN;
    }
}
