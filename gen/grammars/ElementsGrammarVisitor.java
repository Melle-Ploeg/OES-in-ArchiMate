// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/ElementsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ElementsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ElementsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvFile(ElementsGrammarParser.CsvFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(ElementsGrammarParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(ElementsGrammarParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ElementsGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ElementsGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ElementsGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ElementsGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(ElementsGrammarParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElementsGrammarParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(ElementsGrammarParser.OtherContext ctx);
}