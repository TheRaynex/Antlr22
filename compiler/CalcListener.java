// Generated from Calc.g4 by ANTLR 4.10.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(CalcParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(CalcParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(CalcParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(CalcParser.MulExprContext ctx);
}