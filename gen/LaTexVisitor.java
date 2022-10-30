// Generated from E:/Учёба/Программная инженерия/TeX_grammar/src/main/antlr4/org/example\LaTex.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaTexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaTexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaTexParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(LaTexParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(LaTexParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#docclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocclass(LaTexParser.DocclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#classopt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassopt(LaTexParser.ClassoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#usepkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsepkg(LaTexParser.UsepkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(LaTexParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt(LaTexParser.OptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#docinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocinfo(LaTexParser.DocinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#authorinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorinfo(LaTexParser.AuthorinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#titleinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleinfo(LaTexParser.TitleinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#dateinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateinfo(LaTexParser.DateinfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LaTexParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#begindoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegindoc(LaTexParser.BegindocContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#enddoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnddoc(LaTexParser.EnddocContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(LaTexParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#anything}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnything(LaTexParser.AnythingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#inserttitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInserttitle(LaTexParser.InserttitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(LaTexParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LaTexParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LaTexParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LaTexParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#underline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderline(LaTexParser.UnderlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#emph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmph(LaTexParser.EmphContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(LaTexParser.BoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#greek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreek(LaTexParser.GreekContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#environment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironment(LaTexParser.EnvironmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#envcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvcontent(LaTexParser.EnvcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#beginenv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginenv(LaTexParser.BeginenvContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#endenv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndenv(LaTexParser.EndenvContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(LaTexParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(LaTexParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(LaTexParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(LaTexParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(LaTexParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#specialchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialchar(LaTexParser.SpecialcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LaTexParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#subsection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsection(LaTexParser.SubsectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTexParser#subsubsection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsubsection(LaTexParser.SubsubsectionContext ctx);
}