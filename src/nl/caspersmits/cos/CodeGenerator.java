package nl.caspersmits.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class CodeGenerator extends LongTalkBaseVisitor<ArrayList<String>> {
    private ParseTreeProperty<DataType> types;
    private Scope currentScope;

    public CodeGenerator(ParseTreeProperty<DataType> types, Scope currentScope ) {
        this.types = types;
        this.currentScope = currentScope;
    }

    @Override
    public ArrayList<String> visitProgram( LongTalkParser.ProgramContext ctx ) {
        ArrayList<String> code = new ArrayList<>();

        for( LongTalkParser.StatementContext statement : ctx.statement() )
            code.addAll(visit(statement));

        code.add("return");

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
