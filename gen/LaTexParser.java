// Generated from E:/Учёба/Программная инженерия/TeX_grammar/src/main/antlr4/org/example\LaTex.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaTexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_DOCUMENTCLASS=1, KW_USEPKG=2, KW_DOCAUTHOR=3, KW_DOCTITLE=4, KW_DOCDATE=5, 
		KW_BEGIN=6, KW_END=7, KW_PARAGRAPH=8, KW_NEWLINE=9, KW_MAKETITLE=10, KW_SECTION=11, 
		KW_SUBSECTION=12, KW_SUBSUBSECTION=13, KW_UNDERLINE=14, KW_EMPH=15, KW_BOLD=16, 
		KW_ITEM=17, KW_HLINE=18, KW_CT_NAME=19, KW_PAPERTYPE=20, KW_DOCUMENT=21, 
		KW_ENV_NAME=22, KW_TODAY=23, KW_SLASH=24, KW_TEXTBACKSLASH=25, KW_LDOTS=26, 
		KW_CELSIUS=27, KW_EURO=28, KW_GREEK_CGAMMA=29, KW_GREEK_CDELTA=30, KW_GREEK_CTHETA=31, 
		KW_GREEK_CLAMBDA=32, KW_GREEK_CPI=33, KW_GREEK_CSIGMA=34, KW_GREEK_CPHI=35, 
		KW_GREEK_CPSI=36, KW_GREEK_COMEGA=37, KW_GREEK_ALFA=38, KW_GREEK_BETA=39, 
		KW_GREEK_GAMMA=40, KW_GREEK_DELTA=41, KW_GREEK_EPSILON=42, KW_GREEK_ETA=43, 
		KW_GREEK_THETA=44, KW_GREEK_IOTA=45, KW_GREEK_KAPPA=46, KW_GREEK_LAMBDA=47, 
		KW_GREEK_MU=48, KW_GREEK_NU=49, KW_GREEK_XI=50, KW_GREEK_PI=51, KW_GREEK_RHO=52, 
		KW_GREEK_SIGMA=53, KW_GREEK_TAU=54, KW_GREEK_UPSILON=55, KW_GREEK_PHI=56, 
		KW_GREEK_CHI=57, KW_GREEK_PSI=58, KW_GREEK_OMEGA=59, KW_TEXTHEIGHT=60, 
		LSB=61, RSB=62, LCB=63, RCB=64, NEWCELL=65, NEWROW=66, COMMA=67, HYPHEN=68, 
		ENDASH=69, EMDASH=70, OQM=71, CQM=72, HASH=73, DOLAR=74, PERCENT=75, CARET=76, 
		AMPERSAND=77, UNDERSCORE=78, CH_LCB=79, CH_RCB=80, TILDE=81, LINE_COMMENT=82, 
		WS=83, FONTSIZE=84, QUOTE=85, STRING=86, CLASSOPT=87, CLASSARG=88, DOCARG=89, 
		ENVARG=90, OPT=91, ARG=92;
	public static final int
		RULE_document = 0, RULE_preamble = 1, RULE_docclass = 2, RULE_classopt = 3, 
		RULE_usepkg = 4, RULE_arg = 5, RULE_opt = 6, RULE_docinfo = 7, RULE_authorinfo = 8, 
		RULE_titleinfo = 9, RULE_dateinfo = 10, RULE_body = 11, RULE_begindoc = 12, 
		RULE_enddoc = 13, RULE_content = 14, RULE_anything = 15, RULE_inserttitle = 16, 
		RULE_text = 17, RULE_string = 18, RULE_expr = 19, RULE_command = 20, RULE_underline = 21, 
		RULE_emph = 22, RULE_bold = 23, RULE_greek = 24, RULE_environment = 25, 
		RULE_envcontent = 26, RULE_beginenv = 27, RULE_endenv = 28, RULE_item = 29, 
		RULE_table = 30, RULE_row = 31, RULE_cell = 32, RULE_quote = 33, RULE_specialchar = 34, 
		RULE_section = 35, RULE_subsection = 36, RULE_subsubsection = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "preamble", "docclass", "classopt", "usepkg", "arg", "opt", 
			"docinfo", "authorinfo", "titleinfo", "dateinfo", "body", "begindoc", 
			"enddoc", "content", "anything", "inserttitle", "text", "string", "expr", 
			"command", "underline", "emph", "bold", "greek", "environment", "envcontent", 
			"beginenv", "endenv", "item", "table", "row", "cell", "quote", "specialchar", 
			"section", "subsection", "subsubsection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\documentclass'", "'\\usepackage'", "'\\author'", "'\\title'", 
			"'\\date'", "'\\begin'", "'\\end'", "'\\par'", "'\\newline'", "'\\maketitle'", 
			"'\\section'", "'\\subsection'", "'\\subsubsection'", "'\\underline'", 
			"'\\emph'", "'\\textbf'", "'\\item'", "'\\hline'", "'article'", "'a4paper'", 
			"'document'", null, "'\\today{}'", "'\\slash{}'", "'\\textbackslash{}'", 
			"'\\ldots{}'", "'\\textcelsius{}'", "'\\texteuro{}'", "'\\textGamma{}'", 
			"'\\textDelta{}'", "'\\textTheta{}'", "'\\textLambda{}'", "'\\textPi{}'", 
			"'\\textSigma{}'", "'\\textPhi{}'", "'\\textPsi{}'", "'\\textOmega{}'", 
			"'\\textalpha{}'", "'\\textbeta{}'", "'\\textgamma{}'", "'\\textdelta{}'", 
			"'\\textepsilon{}'", "'\\texteta{}'", "'\\texttheta{}'", "'\\textiota{}'", 
			"'\\textkappa{}'", "'\\textlambda{}'", "'\\textmugreek{}'", "'\\textnu{}'", 
			"'\\textxi{}'", "'\\textpi{}'", "'\\textrho{}'", "'\\textsigma{}'", "'\\texttau{}'", 
			"'\\textupsilon{}'", "'\\textphi{}'", "'\\textchi{}'", "'\\textpsi{}'", 
			"'\\textomega{}'", "'\\textheight'", "'['", "']'", "'{'", "'}'", "'&'", 
			"'\\\\'", "','", "'-'", "'--'", "'---'", "'``'", "''''", "'\\#'", "'\\$'", 
			"'\\%'", "'\\^{}'", "'\\&'", "'\\_'", "'\\{'", "'\\}'", "'\\~{}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_DOCUMENTCLASS", "KW_USEPKG", "KW_DOCAUTHOR", "KW_DOCTITLE", 
			"KW_DOCDATE", "KW_BEGIN", "KW_END", "KW_PARAGRAPH", "KW_NEWLINE", "KW_MAKETITLE", 
			"KW_SECTION", "KW_SUBSECTION", "KW_SUBSUBSECTION", "KW_UNDERLINE", "KW_EMPH", 
			"KW_BOLD", "KW_ITEM", "KW_HLINE", "KW_CT_NAME", "KW_PAPERTYPE", "KW_DOCUMENT", 
			"KW_ENV_NAME", "KW_TODAY", "KW_SLASH", "KW_TEXTBACKSLASH", "KW_LDOTS", 
			"KW_CELSIUS", "KW_EURO", "KW_GREEK_CGAMMA", "KW_GREEK_CDELTA", "KW_GREEK_CTHETA", 
			"KW_GREEK_CLAMBDA", "KW_GREEK_CPI", "KW_GREEK_CSIGMA", "KW_GREEK_CPHI", 
			"KW_GREEK_CPSI", "KW_GREEK_COMEGA", "KW_GREEK_ALFA", "KW_GREEK_BETA", 
			"KW_GREEK_GAMMA", "KW_GREEK_DELTA", "KW_GREEK_EPSILON", "KW_GREEK_ETA", 
			"KW_GREEK_THETA", "KW_GREEK_IOTA", "KW_GREEK_KAPPA", "KW_GREEK_LAMBDA", 
			"KW_GREEK_MU", "KW_GREEK_NU", "KW_GREEK_XI", "KW_GREEK_PI", "KW_GREEK_RHO", 
			"KW_GREEK_SIGMA", "KW_GREEK_TAU", "KW_GREEK_UPSILON", "KW_GREEK_PHI", 
			"KW_GREEK_CHI", "KW_GREEK_PSI", "KW_GREEK_OMEGA", "KW_TEXTHEIGHT", "LSB", 
			"RSB", "LCB", "RCB", "NEWCELL", "NEWROW", "COMMA", "HYPHEN", "ENDASH", 
			"EMDASH", "OQM", "CQM", "HASH", "DOLAR", "PERCENT", "CARET", "AMPERSAND", 
			"UNDERSCORE", "CH_LCB", "CH_RCB", "TILDE", "LINE_COMMENT", "WS", "FONTSIZE", 
			"QUOTE", "STRING", "CLASSOPT", "CLASSARG", "DOCARG", "ENVARG", "OPT", 
			"ARG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LaTex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaTexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			preamble();
			setState(77);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreambleContext extends ParserRuleContext {
		public DocclassContext docclass() {
			return getRuleContext(DocclassContext.class,0);
		}
		public List<UsepkgContext> usepkg() {
			return getRuleContexts(UsepkgContext.class);
		}
		public UsepkgContext usepkg(int i) {
			return getRuleContext(UsepkgContext.class,i);
		}
		public List<DocinfoContext> docinfo() {
			return getRuleContexts(DocinfoContext.class);
		}
		public DocinfoContext docinfo(int i) {
			return getRuleContext(DocinfoContext.class,i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			docclass();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_USEPKG) {
				{
				{
				setState(80);
				usepkg();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(86);
				docinfo();
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89);
				docinfo();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_DOCAUTHOR) | (1L << KW_DOCTITLE) | (1L << KW_DOCDATE))) != 0)) {
				{
				setState(92);
				docinfo();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocclassContext extends ParserRuleContext {
		public TerminalNode KW_DOCUMENTCLASS() { return getToken(LaTexParser.KW_DOCUMENTCLASS, 0); }
		public TerminalNode CLASSARG() { return getToken(LaTexParser.CLASSARG, 0); }
		public ClassoptContext classopt() {
			return getRuleContext(ClassoptContext.class,0);
		}
		public DocclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterDocclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitDocclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitDocclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocclassContext docclass() throws RecognitionException {
		DocclassContext _localctx = new DocclassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_docclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(KW_DOCUMENTCLASS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASSOPT) {
				{
				setState(96);
				classopt();
				}
			}

			setState(99);
			match(CLASSARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassoptContext extends ParserRuleContext {
		public TerminalNode CLASSOPT() { return getToken(LaTexParser.CLASSOPT, 0); }
		public ClassoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterClassopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitClassopt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitClassopt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassoptContext classopt() throws RecognitionException {
		ClassoptContext _localctx = new ClassoptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classopt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CLASSOPT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsepkgContext extends ParserRuleContext {
		public TerminalNode KW_USEPKG() { return getToken(LaTexParser.KW_USEPKG, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public OptContext opt() {
			return getRuleContext(OptContext.class,0);
		}
		public UsepkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usepkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterUsepkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitUsepkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitUsepkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsepkgContext usepkg() throws RecognitionException {
		UsepkgContext _localctx = new UsepkgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usepkg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(KW_USEPKG);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPT) {
				{
				setState(104);
				opt();
				}
			}

			setState(107);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ARG() { return getToken(LaTexParser.ARG, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptContext extends ParserRuleContext {
		public TerminalNode OPT() { return getToken(LaTexParser.OPT, 0); }
		public OptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptContext opt() throws RecognitionException {
		OptContext _localctx = new OptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(OPT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocinfoContext extends ParserRuleContext {
		public AuthorinfoContext authorinfo() {
			return getRuleContext(AuthorinfoContext.class,0);
		}
		public TitleinfoContext titleinfo() {
			return getRuleContext(TitleinfoContext.class,0);
		}
		public DateinfoContext dateinfo() {
			return getRuleContext(DateinfoContext.class,0);
		}
		public DocinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterDocinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitDocinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitDocinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocinfoContext docinfo() throws RecognitionException {
		DocinfoContext _localctx = new DocinfoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_docinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DOCAUTHOR:
				{
				setState(113);
				authorinfo();
				}
				break;
			case KW_DOCTITLE:
				{
				setState(114);
				titleinfo();
				}
				break;
			case KW_DOCDATE:
				{
				setState(115);
				dateinfo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorinfoContext extends ParserRuleContext {
		public TerminalNode KW_DOCAUTHOR() { return getToken(LaTexParser.KW_DOCAUTHOR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public AuthorinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterAuthorinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitAuthorinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitAuthorinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorinfoContext authorinfo() throws RecognitionException {
		AuthorinfoContext _localctx = new AuthorinfoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_authorinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(KW_DOCAUTHOR);
			setState(119);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleinfoContext extends ParserRuleContext {
		public TerminalNode KW_DOCTITLE() { return getToken(LaTexParser.KW_DOCTITLE, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TitleinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterTitleinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitTitleinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitTitleinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleinfoContext titleinfo() throws RecognitionException {
		TitleinfoContext _localctx = new TitleinfoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_titleinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(KW_DOCTITLE);
			setState(122);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateinfoContext extends ParserRuleContext {
		public TerminalNode KW_DOCDATE() { return getToken(LaTexParser.KW_DOCDATE, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public DateinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterDateinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitDateinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitDateinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateinfoContext dateinfo() throws RecognitionException {
		DateinfoContext _localctx = new DateinfoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dateinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(KW_DOCDATE);
			setState(125);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BegindocContext begindoc() {
			return getRuleContext(BegindocContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public EnddocContext enddoc() {
			return getRuleContext(EnddocContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			begindoc();
			setState(128);
			content();
			setState(129);
			enddoc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BegindocContext extends ParserRuleContext {
		public TerminalNode KW_BEGIN() { return getToken(LaTexParser.KW_BEGIN, 0); }
		public TerminalNode DOCARG() { return getToken(LaTexParser.DOCARG, 0); }
		public BegindocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begindoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterBegindoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitBegindoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitBegindoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BegindocContext begindoc() throws RecognitionException {
		BegindocContext _localctx = new BegindocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_begindoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(KW_BEGIN);
			setState(132);
			match(DOCARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnddocContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(LaTexParser.KW_END, 0); }
		public TerminalNode DOCARG() { return getToken(LaTexParser.DOCARG, 0); }
		public EnddocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enddoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterEnddoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitEnddoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitEnddoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnddocContext enddoc() throws RecognitionException {
		EnddocContext _localctx = new EnddocContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enddoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(KW_END);
			setState(135);
			match(DOCARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<DocinfoContext> docinfo() {
			return getRuleContexts(DocinfoContext.class);
		}
		public DocinfoContext docinfo(int i) {
			return getRuleContext(DocinfoContext.class,i);
		}
		public InserttitleContext inserttitle() {
			return getRuleContext(InserttitleContext.class,0);
		}
		public List<AnythingContext> anything() {
			return getRuleContexts(AnythingContext.class);
		}
		public AnythingContext anything(int i) {
			return getRuleContext(AnythingContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(137);
				docinfo();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140);
				docinfo();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_DOCAUTHOR) | (1L << KW_DOCTITLE) | (1L << KW_DOCDATE))) != 0)) {
				{
				setState(143);
				docinfo();
				}
			}

			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MAKETITLE) {
				{
				setState(146);
				inserttitle();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BEGIN) | (1L << KW_PARAGRAPH) | (1L << KW_NEWLINE) | (1L << KW_SECTION) | (1L << KW_UNDERLINE) | (1L << KW_EMPH) | (1L << KW_BOLD) | (1L << KW_TODAY) | (1L << KW_SLASH) | (1L << KW_TEXTBACKSLASH) | (1L << KW_LDOTS) | (1L << KW_CELSIUS) | (1L << KW_EURO) | (1L << KW_GREEK_CGAMMA) | (1L << KW_GREEK_CDELTA) | (1L << KW_GREEK_CTHETA) | (1L << KW_GREEK_CLAMBDA) | (1L << KW_GREEK_CPI) | (1L << KW_GREEK_CSIGMA) | (1L << KW_GREEK_CPHI) | (1L << KW_GREEK_CPSI) | (1L << KW_GREEK_COMEGA) | (1L << KW_GREEK_ALFA) | (1L << KW_GREEK_BETA) | (1L << KW_GREEK_GAMMA) | (1L << KW_GREEK_DELTA) | (1L << KW_GREEK_EPSILON) | (1L << KW_GREEK_ETA) | (1L << KW_GREEK_THETA) | (1L << KW_GREEK_IOTA) | (1L << KW_GREEK_KAPPA) | (1L << KW_GREEK_LAMBDA) | (1L << KW_GREEK_MU) | (1L << KW_GREEK_NU) | (1L << KW_GREEK_XI) | (1L << KW_GREEK_PI) | (1L << KW_GREEK_RHO) | (1L << KW_GREEK_SIGMA) | (1L << KW_GREEK_TAU) | (1L << KW_GREEK_UPSILON) | (1L << KW_GREEK_PHI) | (1L << KW_GREEK_CHI) | (1L << KW_GREEK_PSI) | (1L << KW_GREEK_OMEGA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (HYPHEN - 68)) | (1L << (ENDASH - 68)) | (1L << (EMDASH - 68)) | (1L << (HASH - 68)) | (1L << (DOLAR - 68)) | (1L << (PERCENT - 68)) | (1L << (CARET - 68)) | (1L << (AMPERSAND - 68)) | (1L << (UNDERSCORE - 68)) | (1L << (CH_LCB - 68)) | (1L << (CH_RCB - 68)) | (1L << (TILDE - 68)) | (1L << (QUOTE - 68)) | (1L << (STRING - 68)))) != 0)) {
				{
				{
				setState(149);
				anything();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnythingContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public EnvironmentContext environment() {
			return getRuleContext(EnvironmentContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_anything);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PARAGRAPH:
			case KW_NEWLINE:
			case KW_UNDERLINE:
			case KW_EMPH:
			case KW_BOLD:
			case KW_TODAY:
			case KW_SLASH:
			case KW_TEXTBACKSLASH:
			case KW_LDOTS:
			case KW_CELSIUS:
			case KW_EURO:
			case KW_GREEK_CGAMMA:
			case KW_GREEK_CDELTA:
			case KW_GREEK_CTHETA:
			case KW_GREEK_CLAMBDA:
			case KW_GREEK_CPI:
			case KW_GREEK_CSIGMA:
			case KW_GREEK_CPHI:
			case KW_GREEK_CPSI:
			case KW_GREEK_COMEGA:
			case KW_GREEK_ALFA:
			case KW_GREEK_BETA:
			case KW_GREEK_GAMMA:
			case KW_GREEK_DELTA:
			case KW_GREEK_EPSILON:
			case KW_GREEK_ETA:
			case KW_GREEK_THETA:
			case KW_GREEK_IOTA:
			case KW_GREEK_KAPPA:
			case KW_GREEK_LAMBDA:
			case KW_GREEK_MU:
			case KW_GREEK_NU:
			case KW_GREEK_XI:
			case KW_GREEK_PI:
			case KW_GREEK_RHO:
			case KW_GREEK_SIGMA:
			case KW_GREEK_TAU:
			case KW_GREEK_UPSILON:
			case KW_GREEK_PHI:
			case KW_GREEK_CHI:
			case KW_GREEK_PSI:
			case KW_GREEK_OMEGA:
			case HYPHEN:
			case ENDASH:
			case EMDASH:
			case HASH:
			case DOLAR:
			case PERCENT:
			case CARET:
			case AMPERSAND:
			case UNDERSCORE:
			case CH_LCB:
			case CH_RCB:
			case TILDE:
			case QUOTE:
			case STRING:
				{
				setState(155);
				text();
				}
				break;
			case KW_BEGIN:
				{
				setState(156);
				environment();
				}
				break;
			case KW_SECTION:
				{
				setState(157);
				section();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InserttitleContext extends ParserRuleContext {
		public TerminalNode KW_MAKETITLE() { return getToken(LaTexParser.KW_MAKETITLE, 0); }
		public InserttitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inserttitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterInserttitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitInserttitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitInserttitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InserttitleContext inserttitle() throws RecognitionException {
		InserttitleContext _localctx = new InserttitleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inserttitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(KW_MAKETITLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public List<SpecialcharContext> specialchar() {
			return getRuleContexts(SpecialcharContext.class);
		}
		public SpecialcharContext specialchar(int i) {
			return getRuleContext(SpecialcharContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(166);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(162);
						string();
						}
						break;
					case KW_PARAGRAPH:
					case KW_NEWLINE:
					case KW_UNDERLINE:
					case KW_EMPH:
					case KW_BOLD:
					case KW_TODAY:
					case KW_SLASH:
					case KW_TEXTBACKSLASH:
					case KW_LDOTS:
					case KW_CELSIUS:
					case KW_EURO:
					case KW_GREEK_CGAMMA:
					case KW_GREEK_CDELTA:
					case KW_GREEK_CTHETA:
					case KW_GREEK_CLAMBDA:
					case KW_GREEK_CPI:
					case KW_GREEK_CSIGMA:
					case KW_GREEK_CPHI:
					case KW_GREEK_CPSI:
					case KW_GREEK_COMEGA:
					case KW_GREEK_ALFA:
					case KW_GREEK_BETA:
					case KW_GREEK_GAMMA:
					case KW_GREEK_DELTA:
					case KW_GREEK_EPSILON:
					case KW_GREEK_ETA:
					case KW_GREEK_THETA:
					case KW_GREEK_IOTA:
					case KW_GREEK_KAPPA:
					case KW_GREEK_LAMBDA:
					case KW_GREEK_MU:
					case KW_GREEK_NU:
					case KW_GREEK_XI:
					case KW_GREEK_PI:
					case KW_GREEK_RHO:
					case KW_GREEK_SIGMA:
					case KW_GREEK_TAU:
					case KW_GREEK_UPSILON:
					case KW_GREEK_PHI:
					case KW_GREEK_CHI:
					case KW_GREEK_PSI:
					case KW_GREEK_OMEGA:
						{
						setState(163);
						expr();
						}
						break;
					case QUOTE:
						{
						setState(164);
						quote();
						}
						break;
					case HYPHEN:
					case ENDASH:
					case EMDASH:
					case HASH:
					case DOLAR:
					case PERCENT:
					case CARET:
					case AMPERSAND:
					case UNDERSCORE:
					case CH_LCB:
					case CH_RCB:
					case TILDE:
						{
						setState(165);
						specialchar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LaTexParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode KW_PARAGRAPH() { return getToken(LaTexParser.KW_PARAGRAPH, 0); }
		public TerminalNode KW_NEWLINE() { return getToken(LaTexParser.KW_NEWLINE, 0); }
		public TerminalNode KW_SLASH() { return getToken(LaTexParser.KW_SLASH, 0); }
		public TerminalNode KW_TEXTBACKSLASH() { return getToken(LaTexParser.KW_TEXTBACKSLASH, 0); }
		public TerminalNode KW_LDOTS() { return getToken(LaTexParser.KW_LDOTS, 0); }
		public TerminalNode KW_CELSIUS() { return getToken(LaTexParser.KW_CELSIUS, 0); }
		public TerminalNode KW_EURO() { return getToken(LaTexParser.KW_EURO, 0); }
		public UnderlineContext underline() {
			return getRuleContext(UnderlineContext.class,0);
		}
		public EmphContext emph() {
			return getRuleContext(EmphContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public TerminalNode KW_TODAY() { return getToken(LaTexParser.KW_TODAY, 0); }
		public GreekContext greek() {
			return getRuleContext(GreekContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PARAGRAPH:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(KW_PARAGRAPH);
				}
				break;
			case KW_NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(KW_NEWLINE);
				}
				break;
			case KW_SLASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(KW_SLASH);
				}
				break;
			case KW_TEXTBACKSLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(KW_TEXTBACKSLASH);
				}
				break;
			case KW_LDOTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(KW_LDOTS);
				}
				break;
			case KW_CELSIUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(KW_CELSIUS);
				}
				break;
			case KW_EURO:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(KW_EURO);
				}
				break;
			case KW_UNDERLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				underline();
				}
				break;
			case KW_EMPH:
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
				emph();
				}
				break;
			case KW_BOLD:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				bold();
				}
				break;
			case KW_TODAY:
				enterOuterAlt(_localctx, 11);
				{
				setState(184);
				match(KW_TODAY);
				}
				break;
			case KW_GREEK_CGAMMA:
			case KW_GREEK_CDELTA:
			case KW_GREEK_CTHETA:
			case KW_GREEK_CLAMBDA:
			case KW_GREEK_CPI:
			case KW_GREEK_CSIGMA:
			case KW_GREEK_CPHI:
			case KW_GREEK_CPSI:
			case KW_GREEK_COMEGA:
			case KW_GREEK_ALFA:
			case KW_GREEK_BETA:
			case KW_GREEK_GAMMA:
			case KW_GREEK_DELTA:
			case KW_GREEK_EPSILON:
			case KW_GREEK_ETA:
			case KW_GREEK_THETA:
			case KW_GREEK_IOTA:
			case KW_GREEK_KAPPA:
			case KW_GREEK_LAMBDA:
			case KW_GREEK_MU:
			case KW_GREEK_NU:
			case KW_GREEK_XI:
			case KW_GREEK_PI:
			case KW_GREEK_RHO:
			case KW_GREEK_SIGMA:
			case KW_GREEK_TAU:
			case KW_GREEK_UPSILON:
			case KW_GREEK_PHI:
			case KW_GREEK_CHI:
			case KW_GREEK_PSI:
			case KW_GREEK_OMEGA:
				enterOuterAlt(_localctx, 12);
				{
				setState(185);
				greek();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnderlineContext extends ParserRuleContext {
		public TerminalNode KW_UNDERLINE() { return getToken(LaTexParser.KW_UNDERLINE, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public UnderlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterUnderline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitUnderline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitUnderline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderlineContext underline() throws RecognitionException {
		UnderlineContext _localctx = new UnderlineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_underline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(KW_UNDERLINE);
			setState(189);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmphContext extends ParserRuleContext {
		public TerminalNode KW_EMPH() { return getToken(LaTexParser.KW_EMPH, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public EmphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterEmph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitEmph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitEmph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmphContext emph() throws RecognitionException {
		EmphContext _localctx = new EmphContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KW_EMPH);
			setState(192);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoldContext extends ParserRuleContext {
		public TerminalNode KW_BOLD() { return getToken(LaTexParser.KW_BOLD, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitBold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitBold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(KW_BOLD);
			setState(195);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreekContext extends ParserRuleContext {
		public TerminalNode KW_GREEK_CGAMMA() { return getToken(LaTexParser.KW_GREEK_CGAMMA, 0); }
		public TerminalNode KW_GREEK_CDELTA() { return getToken(LaTexParser.KW_GREEK_CDELTA, 0); }
		public TerminalNode KW_GREEK_CTHETA() { return getToken(LaTexParser.KW_GREEK_CTHETA, 0); }
		public TerminalNode KW_GREEK_CLAMBDA() { return getToken(LaTexParser.KW_GREEK_CLAMBDA, 0); }
		public TerminalNode KW_GREEK_CPI() { return getToken(LaTexParser.KW_GREEK_CPI, 0); }
		public TerminalNode KW_GREEK_CSIGMA() { return getToken(LaTexParser.KW_GREEK_CSIGMA, 0); }
		public TerminalNode KW_GREEK_CPHI() { return getToken(LaTexParser.KW_GREEK_CPHI, 0); }
		public TerminalNode KW_GREEK_CPSI() { return getToken(LaTexParser.KW_GREEK_CPSI, 0); }
		public TerminalNode KW_GREEK_COMEGA() { return getToken(LaTexParser.KW_GREEK_COMEGA, 0); }
		public TerminalNode KW_GREEK_ALFA() { return getToken(LaTexParser.KW_GREEK_ALFA, 0); }
		public TerminalNode KW_GREEK_BETA() { return getToken(LaTexParser.KW_GREEK_BETA, 0); }
		public TerminalNode KW_GREEK_GAMMA() { return getToken(LaTexParser.KW_GREEK_GAMMA, 0); }
		public TerminalNode KW_GREEK_DELTA() { return getToken(LaTexParser.KW_GREEK_DELTA, 0); }
		public TerminalNode KW_GREEK_EPSILON() { return getToken(LaTexParser.KW_GREEK_EPSILON, 0); }
		public TerminalNode KW_GREEK_ETA() { return getToken(LaTexParser.KW_GREEK_ETA, 0); }
		public TerminalNode KW_GREEK_THETA() { return getToken(LaTexParser.KW_GREEK_THETA, 0); }
		public TerminalNode KW_GREEK_IOTA() { return getToken(LaTexParser.KW_GREEK_IOTA, 0); }
		public TerminalNode KW_GREEK_KAPPA() { return getToken(LaTexParser.KW_GREEK_KAPPA, 0); }
		public TerminalNode KW_GREEK_LAMBDA() { return getToken(LaTexParser.KW_GREEK_LAMBDA, 0); }
		public TerminalNode KW_GREEK_MU() { return getToken(LaTexParser.KW_GREEK_MU, 0); }
		public TerminalNode KW_GREEK_NU() { return getToken(LaTexParser.KW_GREEK_NU, 0); }
		public TerminalNode KW_GREEK_XI() { return getToken(LaTexParser.KW_GREEK_XI, 0); }
		public TerminalNode KW_GREEK_PI() { return getToken(LaTexParser.KW_GREEK_PI, 0); }
		public TerminalNode KW_GREEK_RHO() { return getToken(LaTexParser.KW_GREEK_RHO, 0); }
		public TerminalNode KW_GREEK_SIGMA() { return getToken(LaTexParser.KW_GREEK_SIGMA, 0); }
		public TerminalNode KW_GREEK_TAU() { return getToken(LaTexParser.KW_GREEK_TAU, 0); }
		public TerminalNode KW_GREEK_UPSILON() { return getToken(LaTexParser.KW_GREEK_UPSILON, 0); }
		public TerminalNode KW_GREEK_PHI() { return getToken(LaTexParser.KW_GREEK_PHI, 0); }
		public TerminalNode KW_GREEK_CHI() { return getToken(LaTexParser.KW_GREEK_CHI, 0); }
		public TerminalNode KW_GREEK_PSI() { return getToken(LaTexParser.KW_GREEK_PSI, 0); }
		public TerminalNode KW_GREEK_OMEGA() { return getToken(LaTexParser.KW_GREEK_OMEGA, 0); }
		public GreekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterGreek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitGreek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitGreek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreekContext greek() throws RecognitionException {
		GreekContext _localctx = new GreekContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_greek);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GREEK_CGAMMA) | (1L << KW_GREEK_CDELTA) | (1L << KW_GREEK_CTHETA) | (1L << KW_GREEK_CLAMBDA) | (1L << KW_GREEK_CPI) | (1L << KW_GREEK_CSIGMA) | (1L << KW_GREEK_CPHI) | (1L << KW_GREEK_CPSI) | (1L << KW_GREEK_COMEGA) | (1L << KW_GREEK_ALFA) | (1L << KW_GREEK_BETA) | (1L << KW_GREEK_GAMMA) | (1L << KW_GREEK_DELTA) | (1L << KW_GREEK_EPSILON) | (1L << KW_GREEK_ETA) | (1L << KW_GREEK_THETA) | (1L << KW_GREEK_IOTA) | (1L << KW_GREEK_KAPPA) | (1L << KW_GREEK_LAMBDA) | (1L << KW_GREEK_MU) | (1L << KW_GREEK_NU) | (1L << KW_GREEK_XI) | (1L << KW_GREEK_PI) | (1L << KW_GREEK_RHO) | (1L << KW_GREEK_SIGMA) | (1L << KW_GREEK_TAU) | (1L << KW_GREEK_UPSILON) | (1L << KW_GREEK_PHI) | (1L << KW_GREEK_CHI) | (1L << KW_GREEK_PSI) | (1L << KW_GREEK_OMEGA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentContext extends ParserRuleContext {
		public BeginenvContext beginenv() {
			return getRuleContext(BeginenvContext.class,0);
		}
		public EnvcontentContext envcontent() {
			return getRuleContext(EnvcontentContext.class,0);
		}
		public EndenvContext endenv() {
			return getRuleContext(EndenvContext.class,0);
		}
		public EnvironmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterEnvironment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitEnvironment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitEnvironment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentContext environment() throws RecognitionException {
		EnvironmentContext _localctx = new EnvironmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_environment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			beginenv();
			setState(200);
			envcontent();
			setState(201);
			endenv();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvcontentContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public EnvcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterEnvcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitEnvcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitEnvcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvcontentContext envcontent() throws RecognitionException {
		EnvcontentContext _localctx = new EnvcontentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_envcontent);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PARAGRAPH:
			case KW_NEWLINE:
			case KW_UNDERLINE:
			case KW_EMPH:
			case KW_BOLD:
			case KW_ITEM:
			case KW_TODAY:
			case KW_SLASH:
			case KW_TEXTBACKSLASH:
			case KW_LDOTS:
			case KW_CELSIUS:
			case KW_EURO:
			case KW_GREEK_CGAMMA:
			case KW_GREEK_CDELTA:
			case KW_GREEK_CTHETA:
			case KW_GREEK_CLAMBDA:
			case KW_GREEK_CPI:
			case KW_GREEK_CSIGMA:
			case KW_GREEK_CPHI:
			case KW_GREEK_CPSI:
			case KW_GREEK_COMEGA:
			case KW_GREEK_ALFA:
			case KW_GREEK_BETA:
			case KW_GREEK_GAMMA:
			case KW_GREEK_DELTA:
			case KW_GREEK_EPSILON:
			case KW_GREEK_ETA:
			case KW_GREEK_THETA:
			case KW_GREEK_IOTA:
			case KW_GREEK_KAPPA:
			case KW_GREEK_LAMBDA:
			case KW_GREEK_MU:
			case KW_GREEK_NU:
			case KW_GREEK_XI:
			case KW_GREEK_PI:
			case KW_GREEK_RHO:
			case KW_GREEK_SIGMA:
			case KW_GREEK_TAU:
			case KW_GREEK_UPSILON:
			case KW_GREEK_PHI:
			case KW_GREEK_CHI:
			case KW_GREEK_PSI:
			case KW_GREEK_OMEGA:
			case HYPHEN:
			case ENDASH:
			case EMDASH:
			case HASH:
			case DOLAR:
			case PERCENT:
			case CARET:
			case AMPERSAND:
			case UNDERSCORE:
			case CH_LCB:
			case CH_RCB:
			case TILDE:
			case QUOTE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(205);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PARAGRAPH:
					case KW_NEWLINE:
					case KW_UNDERLINE:
					case KW_EMPH:
					case KW_BOLD:
					case KW_TODAY:
					case KW_SLASH:
					case KW_TEXTBACKSLASH:
					case KW_LDOTS:
					case KW_CELSIUS:
					case KW_EURO:
					case KW_GREEK_CGAMMA:
					case KW_GREEK_CDELTA:
					case KW_GREEK_CTHETA:
					case KW_GREEK_CLAMBDA:
					case KW_GREEK_CPI:
					case KW_GREEK_CSIGMA:
					case KW_GREEK_CPHI:
					case KW_GREEK_CPSI:
					case KW_GREEK_COMEGA:
					case KW_GREEK_ALFA:
					case KW_GREEK_BETA:
					case KW_GREEK_GAMMA:
					case KW_GREEK_DELTA:
					case KW_GREEK_EPSILON:
					case KW_GREEK_ETA:
					case KW_GREEK_THETA:
					case KW_GREEK_IOTA:
					case KW_GREEK_KAPPA:
					case KW_GREEK_LAMBDA:
					case KW_GREEK_MU:
					case KW_GREEK_NU:
					case KW_GREEK_XI:
					case KW_GREEK_PI:
					case KW_GREEK_RHO:
					case KW_GREEK_SIGMA:
					case KW_GREEK_TAU:
					case KW_GREEK_UPSILON:
					case KW_GREEK_PHI:
					case KW_GREEK_CHI:
					case KW_GREEK_PSI:
					case KW_GREEK_OMEGA:
					case HYPHEN:
					case ENDASH:
					case EMDASH:
					case HASH:
					case DOLAR:
					case PERCENT:
					case CARET:
					case AMPERSAND:
					case UNDERSCORE:
					case CH_LCB:
					case CH_RCB:
					case TILDE:
					case QUOTE:
					case STRING:
						{
						setState(203);
						text();
						}
						break;
					case KW_ITEM:
						{
						setState(204);
						item();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PARAGRAPH) | (1L << KW_NEWLINE) | (1L << KW_UNDERLINE) | (1L << KW_EMPH) | (1L << KW_BOLD) | (1L << KW_ITEM) | (1L << KW_TODAY) | (1L << KW_SLASH) | (1L << KW_TEXTBACKSLASH) | (1L << KW_LDOTS) | (1L << KW_CELSIUS) | (1L << KW_EURO) | (1L << KW_GREEK_CGAMMA) | (1L << KW_GREEK_CDELTA) | (1L << KW_GREEK_CTHETA) | (1L << KW_GREEK_CLAMBDA) | (1L << KW_GREEK_CPI) | (1L << KW_GREEK_CSIGMA) | (1L << KW_GREEK_CPHI) | (1L << KW_GREEK_CPSI) | (1L << KW_GREEK_COMEGA) | (1L << KW_GREEK_ALFA) | (1L << KW_GREEK_BETA) | (1L << KW_GREEK_GAMMA) | (1L << KW_GREEK_DELTA) | (1L << KW_GREEK_EPSILON) | (1L << KW_GREEK_ETA) | (1L << KW_GREEK_THETA) | (1L << KW_GREEK_IOTA) | (1L << KW_GREEK_KAPPA) | (1L << KW_GREEK_LAMBDA) | (1L << KW_GREEK_MU) | (1L << KW_GREEK_NU) | (1L << KW_GREEK_XI) | (1L << KW_GREEK_PI) | (1L << KW_GREEK_RHO) | (1L << KW_GREEK_SIGMA) | (1L << KW_GREEK_TAU) | (1L << KW_GREEK_UPSILON) | (1L << KW_GREEK_PHI) | (1L << KW_GREEK_CHI) | (1L << KW_GREEK_PSI) | (1L << KW_GREEK_OMEGA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (HYPHEN - 68)) | (1L << (ENDASH - 68)) | (1L << (EMDASH - 68)) | (1L << (HASH - 68)) | (1L << (DOLAR - 68)) | (1L << (PERCENT - 68)) | (1L << (CARET - 68)) | (1L << (AMPERSAND - 68)) | (1L << (UNDERSCORE - 68)) | (1L << (CH_LCB - 68)) | (1L << (CH_RCB - 68)) | (1L << (TILDE - 68)) | (1L << (QUOTE - 68)) | (1L << (STRING - 68)))) != 0) );
				}
				break;
			case KW_HLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				table();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginenvContext extends ParserRuleContext {
		public TerminalNode KW_BEGIN() { return getToken(LaTexParser.KW_BEGIN, 0); }
		public TerminalNode ENVARG() { return getToken(LaTexParser.ENVARG, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public BeginenvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginenv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterBeginenv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitBeginenv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitBeginenv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginenvContext beginenv() throws RecognitionException {
		BeginenvContext _localctx = new BeginenvContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_beginenv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(KW_BEGIN);
			setState(213);
			match(ENVARG);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARG) {
				{
				setState(214);
				arg();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndenvContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(LaTexParser.KW_END, 0); }
		public TerminalNode ENVARG() { return getToken(LaTexParser.ENVARG, 0); }
		public EndenvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endenv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterEndenv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitEndenv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitEndenv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndenvContext endenv() throws RecognitionException {
		EndenvContext _localctx = new EndenvContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_endenv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KW_END);
			setState(218);
			match(ENVARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode KW_ITEM() { return getToken(LaTexParser.KW_ITEM, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(KW_ITEM);
			setState(221);
			text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TerminalNode KW_HLINE() { return getToken(LaTexParser.KW_HLINE, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(KW_HLINE);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				row();
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PARAGRAPH) | (1L << KW_NEWLINE) | (1L << KW_UNDERLINE) | (1L << KW_EMPH) | (1L << KW_BOLD) | (1L << KW_TODAY) | (1L << KW_SLASH) | (1L << KW_TEXTBACKSLASH) | (1L << KW_LDOTS) | (1L << KW_CELSIUS) | (1L << KW_EURO) | (1L << KW_GREEK_CGAMMA) | (1L << KW_GREEK_CDELTA) | (1L << KW_GREEK_CTHETA) | (1L << KW_GREEK_CLAMBDA) | (1L << KW_GREEK_CPI) | (1L << KW_GREEK_CSIGMA) | (1L << KW_GREEK_CPHI) | (1L << KW_GREEK_CPSI) | (1L << KW_GREEK_COMEGA) | (1L << KW_GREEK_ALFA) | (1L << KW_GREEK_BETA) | (1L << KW_GREEK_GAMMA) | (1L << KW_GREEK_DELTA) | (1L << KW_GREEK_EPSILON) | (1L << KW_GREEK_ETA) | (1L << KW_GREEK_THETA) | (1L << KW_GREEK_IOTA) | (1L << KW_GREEK_KAPPA) | (1L << KW_GREEK_LAMBDA) | (1L << KW_GREEK_MU) | (1L << KW_GREEK_NU) | (1L << KW_GREEK_XI) | (1L << KW_GREEK_PI) | (1L << KW_GREEK_RHO) | (1L << KW_GREEK_SIGMA) | (1L << KW_GREEK_TAU) | (1L << KW_GREEK_UPSILON) | (1L << KW_GREEK_PHI) | (1L << KW_GREEK_CHI) | (1L << KW_GREEK_PSI) | (1L << KW_GREEK_OMEGA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (HYPHEN - 68)) | (1L << (ENDASH - 68)) | (1L << (EMDASH - 68)) | (1L << (HASH - 68)) | (1L << (DOLAR - 68)) | (1L << (PERCENT - 68)) | (1L << (CARET - 68)) | (1L << (AMPERSAND - 68)) | (1L << (UNDERSCORE - 68)) | (1L << (CH_LCB - 68)) | (1L << (CH_RCB - 68)) | (1L << (TILDE - 68)) | (1L << (QUOTE - 68)) | (1L << (STRING - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
		}
		public TerminalNode NEWROW() { return getToken(LaTexParser.NEWROW, 0); }
		public TerminalNode KW_HLINE() { return getToken(LaTexParser.KW_HLINE, 0); }
		public List<TerminalNode> NEWCELL() { return getTokens(LaTexParser.NEWCELL); }
		public TerminalNode NEWCELL(int i) {
			return getToken(LaTexParser.NEWCELL, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			cell();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWCELL) {
				{
				{
				setState(230);
				match(NEWCELL);
				setState(231);
				cell();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(NEWROW);
			setState(238);
			match(KW_HLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CellContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(LaTexParser.QUOTE, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialcharContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(LaTexParser.HASH, 0); }
		public TerminalNode DOLAR() { return getToken(LaTexParser.DOLAR, 0); }
		public TerminalNode PERCENT() { return getToken(LaTexParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(LaTexParser.CARET, 0); }
		public TerminalNode AMPERSAND() { return getToken(LaTexParser.AMPERSAND, 0); }
		public TerminalNode UNDERSCORE() { return getToken(LaTexParser.UNDERSCORE, 0); }
		public TerminalNode CH_LCB() { return getToken(LaTexParser.CH_LCB, 0); }
		public TerminalNode CH_RCB() { return getToken(LaTexParser.CH_RCB, 0); }
		public TerminalNode TILDE() { return getToken(LaTexParser.TILDE, 0); }
		public TerminalNode ENDASH() { return getToken(LaTexParser.ENDASH, 0); }
		public TerminalNode EMDASH() { return getToken(LaTexParser.EMDASH, 0); }
		public TerminalNode HYPHEN() { return getToken(LaTexParser.HYPHEN, 0); }
		public SpecialcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterSpecialchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitSpecialchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitSpecialchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialcharContext specialchar() throws RecognitionException {
		SpecialcharContext _localctx = new SpecialcharContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_specialchar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (HYPHEN - 68)) | (1L << (ENDASH - 68)) | (1L << (EMDASH - 68)) | (1L << (HASH - 68)) | (1L << (DOLAR - 68)) | (1L << (PERCENT - 68)) | (1L << (CARET - 68)) | (1L << (AMPERSAND - 68)) | (1L << (UNDERSCORE - 68)) | (1L << (CH_LCB - 68)) | (1L << (CH_RCB - 68)) | (1L << (TILDE - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode KW_SECTION() { return getToken(LaTexParser.KW_SECTION, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<EnvironmentContext> environment() {
			return getRuleContexts(EnvironmentContext.class);
		}
		public EnvironmentContext environment(int i) {
			return getRuleContext(EnvironmentContext.class,i);
		}
		public List<SubsectionContext> subsection() {
			return getRuleContexts(SubsectionContext.class);
		}
		public SubsectionContext subsection(int i) {
			return getRuleContext(SubsectionContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KW_SECTION);
			setState(247);
			arg();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(251);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PARAGRAPH:
					case KW_NEWLINE:
					case KW_UNDERLINE:
					case KW_EMPH:
					case KW_BOLD:
					case KW_TODAY:
					case KW_SLASH:
					case KW_TEXTBACKSLASH:
					case KW_LDOTS:
					case KW_CELSIUS:
					case KW_EURO:
					case KW_GREEK_CGAMMA:
					case KW_GREEK_CDELTA:
					case KW_GREEK_CTHETA:
					case KW_GREEK_CLAMBDA:
					case KW_GREEK_CPI:
					case KW_GREEK_CSIGMA:
					case KW_GREEK_CPHI:
					case KW_GREEK_CPSI:
					case KW_GREEK_COMEGA:
					case KW_GREEK_ALFA:
					case KW_GREEK_BETA:
					case KW_GREEK_GAMMA:
					case KW_GREEK_DELTA:
					case KW_GREEK_EPSILON:
					case KW_GREEK_ETA:
					case KW_GREEK_THETA:
					case KW_GREEK_IOTA:
					case KW_GREEK_KAPPA:
					case KW_GREEK_LAMBDA:
					case KW_GREEK_MU:
					case KW_GREEK_NU:
					case KW_GREEK_XI:
					case KW_GREEK_PI:
					case KW_GREEK_RHO:
					case KW_GREEK_SIGMA:
					case KW_GREEK_TAU:
					case KW_GREEK_UPSILON:
					case KW_GREEK_PHI:
					case KW_GREEK_CHI:
					case KW_GREEK_PSI:
					case KW_GREEK_OMEGA:
					case HYPHEN:
					case ENDASH:
					case EMDASH:
					case HASH:
					case DOLAR:
					case PERCENT:
					case CARET:
					case AMPERSAND:
					case UNDERSCORE:
					case CH_LCB:
					case CH_RCB:
					case TILDE:
					case QUOTE:
					case STRING:
						{
						setState(248);
						text();
						}
						break;
					case KW_BEGIN:
						{
						setState(249);
						environment();
						}
						break;
					case KW_SUBSECTION:
						{
						setState(250);
						subsection();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubsectionContext extends ParserRuleContext {
		public TerminalNode KW_SUBSECTION() { return getToken(LaTexParser.KW_SUBSECTION, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<EnvironmentContext> environment() {
			return getRuleContexts(EnvironmentContext.class);
		}
		public EnvironmentContext environment(int i) {
			return getRuleContext(EnvironmentContext.class,i);
		}
		public List<SubsubsectionContext> subsubsection() {
			return getRuleContexts(SubsubsectionContext.class);
		}
		public SubsubsectionContext subsubsection(int i) {
			return getRuleContext(SubsubsectionContext.class,i);
		}
		public SubsectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterSubsection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitSubsection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitSubsection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsectionContext subsection() throws RecognitionException {
		SubsectionContext _localctx = new SubsectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subsection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(KW_SUBSECTION);
			setState(257);
			arg();
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(261);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PARAGRAPH:
					case KW_NEWLINE:
					case KW_UNDERLINE:
					case KW_EMPH:
					case KW_BOLD:
					case KW_TODAY:
					case KW_SLASH:
					case KW_TEXTBACKSLASH:
					case KW_LDOTS:
					case KW_CELSIUS:
					case KW_EURO:
					case KW_GREEK_CGAMMA:
					case KW_GREEK_CDELTA:
					case KW_GREEK_CTHETA:
					case KW_GREEK_CLAMBDA:
					case KW_GREEK_CPI:
					case KW_GREEK_CSIGMA:
					case KW_GREEK_CPHI:
					case KW_GREEK_CPSI:
					case KW_GREEK_COMEGA:
					case KW_GREEK_ALFA:
					case KW_GREEK_BETA:
					case KW_GREEK_GAMMA:
					case KW_GREEK_DELTA:
					case KW_GREEK_EPSILON:
					case KW_GREEK_ETA:
					case KW_GREEK_THETA:
					case KW_GREEK_IOTA:
					case KW_GREEK_KAPPA:
					case KW_GREEK_LAMBDA:
					case KW_GREEK_MU:
					case KW_GREEK_NU:
					case KW_GREEK_XI:
					case KW_GREEK_PI:
					case KW_GREEK_RHO:
					case KW_GREEK_SIGMA:
					case KW_GREEK_TAU:
					case KW_GREEK_UPSILON:
					case KW_GREEK_PHI:
					case KW_GREEK_CHI:
					case KW_GREEK_PSI:
					case KW_GREEK_OMEGA:
					case HYPHEN:
					case ENDASH:
					case EMDASH:
					case HASH:
					case DOLAR:
					case PERCENT:
					case CARET:
					case AMPERSAND:
					case UNDERSCORE:
					case CH_LCB:
					case CH_RCB:
					case TILDE:
					case QUOTE:
					case STRING:
						{
						setState(258);
						text();
						}
						break;
					case KW_BEGIN:
						{
						setState(259);
						environment();
						}
						break;
					case KW_SUBSUBSECTION:
						{
						setState(260);
						subsubsection();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubsubsectionContext extends ParserRuleContext {
		public TerminalNode KW_SUBSUBSECTION() { return getToken(LaTexParser.KW_SUBSUBSECTION, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<EnvironmentContext> environment() {
			return getRuleContexts(EnvironmentContext.class);
		}
		public EnvironmentContext environment(int i) {
			return getRuleContext(EnvironmentContext.class,i);
		}
		public SubsubsectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsubsection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).enterSubsubsection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTexListener ) ((LaTexListener)listener).exitSubsubsection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTexVisitor ) return ((LaTexVisitor<? extends T>)visitor).visitSubsubsection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsubsectionContext subsubsection() throws RecognitionException {
		SubsubsectionContext _localctx = new SubsubsectionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subsubsection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(KW_SUBSUBSECTION);
			setState(267);
			arg();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PARAGRAPH:
					case KW_NEWLINE:
					case KW_UNDERLINE:
					case KW_EMPH:
					case KW_BOLD:
					case KW_TODAY:
					case KW_SLASH:
					case KW_TEXTBACKSLASH:
					case KW_LDOTS:
					case KW_CELSIUS:
					case KW_EURO:
					case KW_GREEK_CGAMMA:
					case KW_GREEK_CDELTA:
					case KW_GREEK_CTHETA:
					case KW_GREEK_CLAMBDA:
					case KW_GREEK_CPI:
					case KW_GREEK_CSIGMA:
					case KW_GREEK_CPHI:
					case KW_GREEK_CPSI:
					case KW_GREEK_COMEGA:
					case KW_GREEK_ALFA:
					case KW_GREEK_BETA:
					case KW_GREEK_GAMMA:
					case KW_GREEK_DELTA:
					case KW_GREEK_EPSILON:
					case KW_GREEK_ETA:
					case KW_GREEK_THETA:
					case KW_GREEK_IOTA:
					case KW_GREEK_KAPPA:
					case KW_GREEK_LAMBDA:
					case KW_GREEK_MU:
					case KW_GREEK_NU:
					case KW_GREEK_XI:
					case KW_GREEK_PI:
					case KW_GREEK_RHO:
					case KW_GREEK_SIGMA:
					case KW_GREEK_TAU:
					case KW_GREEK_UPSILON:
					case KW_GREEK_PHI:
					case KW_GREEK_CHI:
					case KW_GREEK_PSI:
					case KW_GREEK_OMEGA:
					case HYPHEN:
					case ENDASH:
					case EMDASH:
					case HASH:
					case DOLAR:
					case PERCENT:
					case CARET:
					case AMPERSAND:
					case UNDERSCORE:
					case CH_LCB:
					case CH_RCB:
					case TILDE:
					case QUOTE:
					case STRING:
						{
						setState(268);
						text();
						}
						break;
					case KW_BEGIN:
						{
						setState(269);
						environment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001R\b\u0001\n\u0001\f\u0001U\t\u0001"+
		"\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001"+
		"\u0001\u0003\u0001^\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004j\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"u\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u008b\b\u000e"+
		"\u0001\u000e\u0003\u000e\u008e\b\u000e\u0001\u000e\u0003\u000e\u0091\b"+
		"\u000e\u0001\u000e\u0003\u000e\u0094\b\u000e\u0001\u000e\u0005\u000e\u0097"+
		"\b\u000e\n\u000e\f\u000e\u009a\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u009f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00a7\b\u0011\u000b\u0011\f\u0011"+
		"\u00a8\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00bb"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0004"+
		"\u001a\u00ce\b\u001a\u000b\u001a\f\u001a\u00cf\u0001\u001a\u0003\u001a"+
		"\u00d3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00d8\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0004\u001e\u00e2\b\u001e\u000b\u001e\f"+
		"\u001e\u00e3\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u00e9\b\u001f"+
		"\n\u001f\f\u001f\u00ec\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u00fc\b#\n#\f#\u00ff\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u0106\b$\n$\f$\u0109\t$\u0001%\u0001%\u0001%\u0001%\u0005%\u010f\b%"+
		"\n%\f%\u0112\t%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\u0002\u0001\u0000\u001d;\u0002\u0000DFIQ\u0119\u0000L\u0001\u0000"+
		"\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000"+
		"\u0006e\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\nm\u0001\u0000"+
		"\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000"+
		"\u0010v\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014|"+
		"\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0083"+
		"\u0001\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u008a"+
		"\u0001\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a0\u0001"+
		"\u0000\u0000\u0000\"\u00a6\u0001\u0000\u0000\u0000$\u00aa\u0001\u0000"+
		"\u0000\u0000&\u00ac\u0001\u0000\u0000\u0000(\u00ba\u0001\u0000\u0000\u0000"+
		"*\u00bc\u0001\u0000\u0000\u0000,\u00bf\u0001\u0000\u0000\u0000.\u00c2"+
		"\u0001\u0000\u0000\u00000\u00c5\u0001\u0000\u0000\u00002\u00c7\u0001\u0000"+
		"\u0000\u00004\u00d2\u0001\u0000\u0000\u00006\u00d4\u0001\u0000\u0000\u0000"+
		"8\u00d9\u0001\u0000\u0000\u0000:\u00dc\u0001\u0000\u0000\u0000<\u00df"+
		"\u0001\u0000\u0000\u0000>\u00e5\u0001\u0000\u0000\u0000@\u00f0\u0001\u0000"+
		"\u0000\u0000B\u00f2\u0001\u0000\u0000\u0000D\u00f4\u0001\u0000\u0000\u0000"+
		"F\u00f6\u0001\u0000\u0000\u0000H\u0100\u0001\u0000\u0000\u0000J\u010a"+
		"\u0001\u0000\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0003\u0016\u000b"+
		"\u0000N\u0001\u0001\u0000\u0000\u0000OS\u0003\u0004\u0002\u0000PR\u0003"+
		"\b\u0004\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VX\u0003\u000e\u0007\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000Y[\u0003\u000e"+
		"\u0007\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\^\u0003\u000e\u0007\u0000]\\\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000_a\u0005\u0001"+
		"\u0000\u0000`b\u0003\u0006\u0003\u0000a`\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005X\u0000\u0000d\u0005"+
		"\u0001\u0000\u0000\u0000ef\u0005W\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gi\u0005\u0002\u0000\u0000hj\u0003\f\u0006\u0000ih\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003\n\u0005"+
		"\u0000l\t\u0001\u0000\u0000\u0000mn\u0005\\\u0000\u0000n\u000b\u0001\u0000"+
		"\u0000\u0000op\u0005[\u0000\u0000p\r\u0001\u0000\u0000\u0000qu\u0003\u0010"+
		"\b\u0000ru\u0003\u0012\t\u0000su\u0003\u0014\n\u0000tq\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\u000f\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0003\n\u0005\u0000x\u0011"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0004\u0000\u0000z{\u0003\n\u0005\u0000"+
		"{\u0013\u0001\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003\n\u0005"+
		"\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0018\f\u0000"+
		"\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0082\u0003\u001a\r\u0000\u0082"+
		"\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084"+
		"\u0085\u0005Y\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005\u0007\u0000\u0000\u0087\u0088\u0005Y\u0000\u0000\u0088\u001b\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0003\u000e\u0007\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0003 \u0010\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0098\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0003\u001e\u000f\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001d\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009f\u0003\"\u0011"+
		"\u0000\u009c\u009f\u00032\u0019\u0000\u009d\u009f\u0003F#\u0000\u009e"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\n\u0000\u0000\u00a1!\u0001\u0000\u0000\u0000\u00a2\u00a7"+
		"\u0003$\u0012\u0000\u00a3\u00a7\u0003&\u0013\u0000\u00a4\u00a7\u0003B"+
		"!\u0000\u00a5\u00a7\u0003D\"\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9#\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005V\u0000\u0000\u00ab%"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\'\u0001"+
		"\u0000\u0000\u0000\u00ae\u00bb\u0005\b\u0000\u0000\u00af\u00bb\u0005\t"+
		"\u0000\u0000\u00b0\u00bb\u0005\u0018\u0000\u0000\u00b1\u00bb\u0005\u0019"+
		"\u0000\u0000\u00b2\u00bb\u0005\u001a\u0000\u0000\u00b3\u00bb\u0005\u001b"+
		"\u0000\u0000\u00b4\u00bb\u0005\u001c\u0000\u0000\u00b5\u00bb\u0003*\u0015"+
		"\u0000\u00b6\u00bb\u0003,\u0016\u0000\u00b7\u00bb\u0003.\u0017\u0000\u00b8"+
		"\u00bb\u0005\u0017\u0000\u0000\u00b9\u00bb\u00030\u0018\u0000\u00ba\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ba\u00af\u0001\u0000\u0000\u0000\u00ba\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b2"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000\u00ba\u00b4"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b6"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb)\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00be\u0003"+
		"\n\u0005\u0000\u00be+\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u000f"+
		"\u0000\u0000\u00c0\u00c1\u0003\n\u0005\u0000\u00c1-\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0010\u0000\u0000\u00c3\u00c4\u0003\n\u0005\u0000"+
		"\u00c4/\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0000\u0000\u0000\u00c6"+
		"1\u0001\u0000\u0000\u0000\u00c7\u00c8\u00036\u001b\u0000\u00c8\u00c9\u0003"+
		"4\u001a\u0000\u00c9\u00ca\u00038\u001c\u0000\u00ca3\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0003\"\u0011\u0000\u00cc\u00ce\u0003:\u001d\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0003<\u001e\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d35\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0006\u0000\u0000\u00d5\u00d7\u0005Z\u0000\u0000\u00d6\u00d8\u0003"+
		"\n\u0005\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d87\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0007\u0000"+
		"\u0000\u00da\u00db\u0005Z\u0000\u0000\u00db9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0011\u0000\u0000\u00dd\u00de\u0003\"\u0011\u0000\u00de;"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\u0012\u0000\u0000\u00e0\u00e2"+
		"\u0003>\u001f\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4=\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003@ "+
		"\u0000\u00e6\u00e7\u0005A\u0000\u0000\u00e7\u00e9\u0003@ \u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005B\u0000\u0000\u00ee\u00ef\u0005\u0012\u0000\u0000\u00ef?\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0003\"\u0011\u0000\u00f1A\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0005U\u0000\u0000\u00f3C\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0007\u0001\u0000\u0000\u00f5E\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u000b\u0000\u0000\u00f7\u00fd\u0003\n\u0005\u0000\u00f8\u00fc"+
		"\u0003\"\u0011\u0000\u00f9\u00fc\u00032\u0019\u0000\u00fa\u00fc\u0003"+
		"H$\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00feG\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\f\u0000\u0000\u0101\u0107\u0003\n\u0005\u0000\u0102"+
		"\u0106\u0003\"\u0011\u0000\u0103\u0106\u00032\u0019\u0000\u0104\u0106"+
		"\u0003J%\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108I\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005\r\u0000\u0000\u010b\u0110\u0003\n\u0005\u0000"+
		"\u010c\u010f\u0003\"\u0011\u0000\u010d\u010f\u00032\u0019\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111K\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u001cSWZ]ait\u008a\u008d\u0090\u0093\u0098\u009e"+
		"\u00a6\u00a8\u00ba\u00cd\u00cf\u00d2\u00d7\u00e3\u00ea\u00fb\u00fd\u0105"+
		"\u0107\u010e\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}