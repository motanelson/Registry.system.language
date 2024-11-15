// Generated from Registry.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegistryParser}.
 */
public interface RegistryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegistryParser#registryFile}.
	 * @param ctx the parse tree
	 */
	void enterRegistryFile(RegistryParser.RegistryFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegistryParser#registryFile}.
	 * @param ctx the parse tree
	 */
	void exitRegistryFile(RegistryParser.RegistryFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegistryParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(RegistryParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegistryParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(RegistryParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegistryParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(RegistryParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegistryParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(RegistryParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegistryParser#keyPath}.
	 * @param ctx the parse tree
	 */
	void enterKeyPath(RegistryParser.KeyPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegistryParser#keyPath}.
	 * @param ctx the parse tree
	 */
	void exitKeyPath(RegistryParser.KeyPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegistryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegistryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegistryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegistryParser.ValueContext ctx);
}