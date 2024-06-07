// Generated from C:/Users/melle/IdeaProjects/OES-in-ArchiMate/src/grammars/ElementsGrammar.g4 by ANTLR 4.13.1
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElementsGrammarParser}.
 */
public interface ElementsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void enterCsvFile(ElementsGrammarParser.CsvFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#csvFile}.
	 * @param ctx the parse tree
	 */
	void exitCsvFile(ElementsGrammarParser.CsvFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(ElementsGrammarParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(ElementsGrammarParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(ElementsGrammarParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(ElementsGrammarParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ElementsGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ElementsGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ElementsGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ElementsGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ElementsGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ElementsGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ElementsGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ElementsGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(ElementsGrammarParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(ElementsGrammarParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElementsGrammarParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(ElementsGrammarParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElementsGrammarParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(ElementsGrammarParser.OtherContext ctx);
}