// Generated from E:/Учёба/Программная инженерия/TeX_grammar/src/main/antlr4/org/example\LaTex.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaTexParser}.
 */
public interface LaTexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaTexParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(LaTexParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(LaTexParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(LaTexParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(LaTexParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#docclass}.
	 * @param ctx the parse tree
	 */
	void enterDocclass(LaTexParser.DocclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#docclass}.
	 * @param ctx the parse tree
	 */
	void exitDocclass(LaTexParser.DocclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#classopt}.
	 * @param ctx the parse tree
	 */
	void enterClassopt(LaTexParser.ClassoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#classopt}.
	 * @param ctx the parse tree
	 */
	void exitClassopt(LaTexParser.ClassoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#usepkg}.
	 * @param ctx the parse tree
	 */
	void enterUsepkg(LaTexParser.UsepkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#usepkg}.
	 * @param ctx the parse tree
	 */
	void exitUsepkg(LaTexParser.UsepkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(LaTexParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(LaTexParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#opt}.
	 * @param ctx the parse tree
	 */
	void enterOpt(LaTexParser.OptContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#opt}.
	 * @param ctx the parse tree
	 */
	void exitOpt(LaTexParser.OptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#docinfo}.
	 * @param ctx the parse tree
	 */
	void enterDocinfo(LaTexParser.DocinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#docinfo}.
	 * @param ctx the parse tree
	 */
	void exitDocinfo(LaTexParser.DocinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#authorinfo}.
	 * @param ctx the parse tree
	 */
	void enterAuthorinfo(LaTexParser.AuthorinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#authorinfo}.
	 * @param ctx the parse tree
	 */
	void exitAuthorinfo(LaTexParser.AuthorinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#titleinfo}.
	 * @param ctx the parse tree
	 */
	void enterTitleinfo(LaTexParser.TitleinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#titleinfo}.
	 * @param ctx the parse tree
	 */
	void exitTitleinfo(LaTexParser.TitleinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#dateinfo}.
	 * @param ctx the parse tree
	 */
	void enterDateinfo(LaTexParser.DateinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#dateinfo}.
	 * @param ctx the parse tree
	 */
	void exitDateinfo(LaTexParser.DateinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LaTexParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LaTexParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#begindoc}.
	 * @param ctx the parse tree
	 */
	void enterBegindoc(LaTexParser.BegindocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#begindoc}.
	 * @param ctx the parse tree
	 */
	void exitBegindoc(LaTexParser.BegindocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#enddoc}.
	 * @param ctx the parse tree
	 */
	void enterEnddoc(LaTexParser.EnddocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#enddoc}.
	 * @param ctx the parse tree
	 */
	void exitEnddoc(LaTexParser.EnddocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(LaTexParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(LaTexParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(LaTexParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(LaTexParser.AnythingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#inserttitle}.
	 * @param ctx the parse tree
	 */
	void enterInserttitle(LaTexParser.InserttitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#inserttitle}.
	 * @param ctx the parse tree
	 */
	void exitInserttitle(LaTexParser.InserttitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(LaTexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(LaTexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LaTexParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LaTexParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LaTexParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LaTexParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LaTexParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LaTexParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderline(LaTexParser.UnderlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderline(LaTexParser.UnderlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#emph}.
	 * @param ctx the parse tree
	 */
	void enterEmph(LaTexParser.EmphContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#emph}.
	 * @param ctx the parse tree
	 */
	void exitEmph(LaTexParser.EmphContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(LaTexParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(LaTexParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#greek}.
	 * @param ctx the parse tree
	 */
	void enterGreek(LaTexParser.GreekContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#greek}.
	 * @param ctx the parse tree
	 */
	void exitGreek(LaTexParser.GreekContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#environment}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment(LaTexParser.EnvironmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#environment}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment(LaTexParser.EnvironmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#envcontent}.
	 * @param ctx the parse tree
	 */
	void enterEnvcontent(LaTexParser.EnvcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#envcontent}.
	 * @param ctx the parse tree
	 */
	void exitEnvcontent(LaTexParser.EnvcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#beginenv}.
	 * @param ctx the parse tree
	 */
	void enterBeginenv(LaTexParser.BeginenvContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#beginenv}.
	 * @param ctx the parse tree
	 */
	void exitBeginenv(LaTexParser.BeginenvContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#endenv}.
	 * @param ctx the parse tree
	 */
	void enterEndenv(LaTexParser.EndenvContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#endenv}.
	 * @param ctx the parse tree
	 */
	void exitEndenv(LaTexParser.EndenvContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(LaTexParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(LaTexParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(LaTexParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(LaTexParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(LaTexParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(LaTexParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(LaTexParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(LaTexParser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(LaTexParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(LaTexParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#specialchar}.
	 * @param ctx the parse tree
	 */
	void enterSpecialchar(LaTexParser.SpecialcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#specialchar}.
	 * @param ctx the parse tree
	 */
	void exitSpecialchar(LaTexParser.SpecialcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(LaTexParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(LaTexParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#subsection}.
	 * @param ctx the parse tree
	 */
	void enterSubsection(LaTexParser.SubsectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#subsection}.
	 * @param ctx the parse tree
	 */
	void exitSubsection(LaTexParser.SubsectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTexParser#subsubsection}.
	 * @param ctx the parse tree
	 */
	void enterSubsubsection(LaTexParser.SubsubsectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTexParser#subsubsection}.
	 * @param ctx the parse tree
	 */
	void exitSubsubsection(LaTexParser.SubsubsectionContext ctx);
}