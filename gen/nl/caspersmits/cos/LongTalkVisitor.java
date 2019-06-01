// Generated from /Users/casper/src/saxion/2.3CompOSs/Z7LongTalk/src/LongTalk.g4 by ANTLR 4.7.2
package nl.caspersmits.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LongTalkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LongTalkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LongTalkParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LongTalkParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(LongTalkParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#elseifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstatement(LongTalkParser.ElseifstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LongTalkParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LongTalkParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LongTalkParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstatement(LongTalkParser.PrintstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIdentifier}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIdentifier(LongTalkParser.ExIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMathOp}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMathOp(LongTalkParser.ExMathOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExLogicOp}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExLogicOp(LongTalkParser.ExLogicOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBooleanLiteral}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBooleanLiteral(LongTalkParser.ExBooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAndOrOp}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAndOrOp(LongTalkParser.ExAndOrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExParenthesis}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParenthesis(LongTalkParser.ExParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIntegerLiteral}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIntegerLiteral(LongTalkParser.ExIntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExStringLiteral}
	 * labeled alternative in {@link LongTalkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExStringLiteral(LongTalkParser.ExStringLiteralContext ctx);
}