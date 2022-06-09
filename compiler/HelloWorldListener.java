// Generated from HelloWorld.g4 by ANTLR 4.10.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterGreeting(HelloWorldParser.GreetingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitGreeting(HelloWorldParser.GreetingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HelloWorldParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HelloWorldParser.IdentifierContext ctx);
}