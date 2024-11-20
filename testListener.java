// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
}