package parser;

// Generated from C:\Users\User1\Downloads\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull CalcParser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#FunCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(@NotNull CalcParser.FunCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull CalcParser.DefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull CalcParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull CalcParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#BinaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(@NotNull CalcParser.BinaryExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(@NotNull CalcParser.ParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull CalcParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#CondExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExp(@NotNull CalcParser.CondExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CalcParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionId(@NotNull CalcParser.FunctionIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(@NotNull CalcParser.VariableIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(@NotNull CalcParser.HeadContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#UnaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(@NotNull CalcParser.UnaryExpContext ctx);
}