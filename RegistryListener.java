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
}