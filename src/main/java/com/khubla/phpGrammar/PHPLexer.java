// Generated from com/khubla/phpGrammar/PHPLexer.g4 by ANTLR 4.1
package com.khubla.phpGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PHPStart=1, PHPO=2, Html=3, HtmlWS=4, PHPEnd=5, RealE=6, As=7, SemiColon=8, 
		Instanceof=9, And=10, List=11, Const=12, Or=13, Xor=14, Global=15, Continue=16, 
		Return=17, Implements=18, Var=19, Class=20, Extends=21, Do=22, Switch=23, 
		Case=24, Default=25, Function=26, Break=27, If=28, Else=29, ElseIf=30, 
		For=31, Foreach=32, While=33, Equals=34, New=35, Clone=36, Ampersand=37, 
		Pipe=38, Bang=39, Plus=40, Minus=41, Asterisk=42, Percent=43, Forwardslash=44, 
		Tilde=45, InstanceMember=46, SuppressWarnings=47, Dollar=48, Dot=49, ArrayAssign=50, 
		LogicalOr=51, LogicalAnd=52, ClassMember=53, QuestionMark=54, OpenRoundBracket=55, 
		CloseRoundBracket=56, OpenSquareBracket=57, CloseSquareBracket=58, OpenCurlyBracket=59, 
		CloseCurlyBracket=60, Interface=61, Comma=62, Colon=63, Abstract=64, Static=65, 
		MultilineComment=66, SinglelineComment=67, UnixComment=68, Array=69, RequireOperator=70, 
		PrimitiveType=71, AccessModifier=72, DecimalNumber=73, HexNumber=74, OctalNumber=75, 
		Float=76, Digits=77, Boolean=78, SingleQuotedString=79, EscapeCharacter=80, 
		DoubleQuotedString=81, Identifier=82, AssignmentOperator=83, EqualityOperator=84, 
		ComparisionOperator=85, ShiftOperator=86, IncrementOperator=87, WS=88;
	public static final int PHP = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "PHP"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"PHPStart", "'<'", "Html", "HtmlWS", "'?>'", "RealE", "'as'", "';'", "'instanceof'", 
		"'and'", "'list'", "'const'", "'or'", "'xor'", "'global'", "'continue'", 
		"'return'", "'implements'", "'var'", "'class'", "'extends'", "'do'", "'switch'", 
		"'case'", "'default'", "'function'", "'break'", "'if'", "'else'", "'elseif'", 
		"'for'", "'foreach'", "'while'", "'='", "'new'", "'clone'", "'&'", "'|'", 
		"'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'~'", "'->'", "'@'", "'$'", 
		"'.'", "'=>'", "'||'", "'&&'", "'::'", "'?'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'Interface'", "','", "':'", "'abstract'", "'static'", "MultilineComment", 
		"SinglelineComment", "UnixComment", "Array", "RequireOperator", "PrimitiveType", 
		"AccessModifier", "DecimalNumber", "HexNumber", "OctalNumber", "Float", 
		"Digits", "Boolean", "SingleQuotedString", "EscapeCharacter", "DoubleQuotedString", 
		"Identifier", "AssignmentOperator", "EqualityOperator", "ComparisionOperator", 
		"ShiftOperator", "IncrementOperator", "WS"
	};
	public static final String[] ruleNames = {
		"PHPStart", "PHPO", "Html", "HtmlWS", "PHPEnd", "RealE", "As", "SemiColon", 
		"Instanceof", "And", "List", "Const", "Or", "Xor", "Global", "Continue", 
		"Return", "Implements", "Var", "Class", "Extends", "Do", "Switch", "Case", 
		"Default", "Function", "Break", "If", "Else", "ElseIf", "For", "Foreach", 
		"While", "Equals", "New", "Clone", "Ampersand", "Pipe", "Bang", "Plus", 
		"Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "InstanceMember", 
		"SuppressWarnings", "Dollar", "Dot", "ArrayAssign", "LogicalOr", "LogicalAnd", 
		"ClassMember", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
		"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
		"Interface", "Comma", "Colon", "Abstract", "Static", "MultilineComment", 
		"SinglelineComment", "UnixComment", "Array", "RequireOperator", "PrimitiveType", 
		"AccessModifier", "DecimalNumber", "HexNumber", "OctalNumber", "Float", 
		"Digits", "Boolean", "SingleQuotedString", "EscapeCharacter", "DoubleQuotedString", 
		"Identifier", "AssignmentOperator", "EqualityOperator", "ComparisionOperator", 
		"ShiftOperator", "IncrementOperator", "WS"
	};


	public PHPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PHPLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: PHPStart_action((RuleContext)_localctx, actionIndex); break;

		case 3: HtmlWS_action((RuleContext)_localctx, actionIndex); break;

		case 4: PHPEnd_action((RuleContext)_localctx, actionIndex); break;

		case 87: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void PHPStart_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(PHP);  break;
		}
	}
	private void HtmlWS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void PHPEnd_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2Z\u02e9\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00bc"+
		"\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\u00c5\n\5\r\5\16\5\u00c6\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\7C\u01d7\nC\fC\16C\u01da\13C\3C\3C\3C\3D\3D\3D\3D\7D\u01e3\nD\fD\16"+
		"D\u01e6\13D\3E\3E\7E\u01ea\nE\fE\16E\u01ed\13E\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u021b\nG\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\5H\u023a\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\5I\u0252\nI\3J\6J\u0255\nJ\rJ\16J\u0256\3K\3K\3K\6K\u025c\n"+
		"K\rK\16K\u025d\3L\3L\6L\u0262\nL\rL\16L\u0263\3M\7M\u0267\nM\fM\16M\u026a"+
		"\13M\3M\3M\6M\u026e\nM\rM\16M\u026f\3N\6N\u0273\nN\rN\16N\u0274\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\5O\u0280\nO\3P\3P\3P\3P\3P\3P\3P\7P\u0289\nP\fP"+
		"\16P\u028c\13P\3P\3P\3Q\3Q\5Q\u0292\nQ\3R\3R\3R\3R\3R\7R\u0299\nR\fR\16"+
		"R\u029c\13R\3R\3R\3S\3S\7S\u02a2\nS\fS\16S\u02a5\13S\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u02bf\nT\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u02cb\nU\3V\3V\3V\3V\3V\3V\3V\3V\5V\u02d5"+
		"\nV\3W\3W\3W\3W\5W\u02db\nW\3X\3X\3X\3X\5X\u02e1\nX\3Y\6Y\u02e4\nY\rY"+
		"\16Y\u02e5\3Y\3Y\2Z\4\3\2\6\4\1\b\5\1\n\6\3\f\7\4\16\b\1\20\t\1\22\n\1"+
		"\24\13\1\26\f\1\30\r\1\32\16\1\34\17\1\36\20\1 \21\1\"\22\1$\23\1&\24"+
		"\1(\25\1*\26\1,\27\1.\30\1\60\31\1\62\32\1\64\33\1\66\34\18\35\1:\36\1"+
		"<\37\1> \1@!\1B\"\1D#\1F$\1H%\1J&\1L\'\1N(\1P)\1R*\1T+\1V,\1X-\1Z.\1\\"+
		"/\1^\60\1`\61\1b\62\1d\63\1f\64\1h\65\1j\66\1l\67\1n8\1p9\1r:\1t;\1v<"+
		"\1x=\1z>\1|?\1~@\1\u0080A\1\u0082B\1\u0084C\1\u0086D\1\u0088E\1\u008a"+
		"F\1\u008cG\1\u008eH\1\u0090I\1\u0092J\1\u0094K\1\u0096L\1\u0098M\1\u009a"+
		"N\1\u009cO\1\u009eP\1\u00a0Q\1\u00a2R\1\u00a4S\1\u00a6T\1\u00a8U\1\u00aa"+
		"V\1\u00acW\1\u00aeX\1\u00b0Y\1\u00b2Z\5\4\2\3\22\4\2))>>\5\2\f\f\17\17"+
		"\"\"\4\2GGgg\3\2,,\4\2\f\f\17\17\4\2CCcc\4\2TTtt\4\2[[{{\4\2ZZzz\5\2\62"+
		";CHch\4\2))^^\b\2$$&&^^ppttvv\4\2$$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\u031b\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f"+
		"\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2"+
		"\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3"+
		"\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3"+
		"\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2"+
		"\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F"+
		"\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2"+
		"\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2"+
		"\2\3`\3\2\2\2\3b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\3j\3\2\2\2\3"+
		"l\3\2\2\2\3n\3\2\2\2\3p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\3x\3"+
		"\2\2\2\3z\3\2\2\2\3|\3\2\2\2\3~\3\2\2\2\3\u0080\3\2\2\2\3\u0082\3\2\2"+
		"\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\3\u0088\3\2\2\2\3\u008a\3\2\2\2\3\u008c"+
		"\3\2\2\2\3\u008e\3\2\2\2\3\u0090\3\2\2\2\3\u0092\3\2\2\2\3\u0094\3\2\2"+
		"\2\3\u0096\3\2\2\2\3\u0098\3\2\2\2\3\u009a\3\2\2\2\3\u009c\3\2\2\2\3\u009e"+
		"\3\2\2\2\3\u00a0\3\2\2\2\3\u00a2\3\2\2\2\3\u00a4\3\2\2\2\3\u00a6\3\2\2"+
		"\2\3\u00a8\3\2\2\2\3\u00aa\3\2\2\2\3\u00ac\3\2\2\2\3\u00ae\3\2\2\2\3\u00b0"+
		"\3\2\2\2\3\u00b2\3\2\2\2\4\u00bb\3\2\2\2\6\u00bf\3\2\2\2\b\u00c1\3\2\2"+
		"\2\n\u00c4\3\2\2\2\f\u00ca\3\2\2\2\16\u00cf\3\2\2\2\20\u00d1\3\2\2\2\22"+
		"\u00d4\3\2\2\2\24\u00d6\3\2\2\2\26\u00e1\3\2\2\2\30\u00e5\3\2\2\2\32\u00ea"+
		"\3\2\2\2\34\u00f0\3\2\2\2\36\u00f3\3\2\2\2 \u00f7\3\2\2\2\"\u00fe\3\2"+
		"\2\2$\u0107\3\2\2\2&\u010e\3\2\2\2(\u0119\3\2\2\2*\u011d\3\2\2\2,\u0123"+
		"\3\2\2\2.\u012b\3\2\2\2\60\u012e\3\2\2\2\62\u0135\3\2\2\2\64\u013a\3\2"+
		"\2\2\66\u0142\3\2\2\28\u014b\3\2\2\2:\u0151\3\2\2\2<\u0154\3\2\2\2>\u0159"+
		"\3\2\2\2@\u0160\3\2\2\2B\u0164\3\2\2\2D\u016c\3\2\2\2F\u0172\3\2\2\2H"+
		"\u0174\3\2\2\2J\u0178\3\2\2\2L\u017e\3\2\2\2N\u0180\3\2\2\2P\u0182\3\2"+
		"\2\2R\u0184\3\2\2\2T\u0186\3\2\2\2V\u0188\3\2\2\2X\u018a\3\2\2\2Z\u018c"+
		"\3\2\2\2\\\u018e\3\2\2\2^\u0190\3\2\2\2`\u0193\3\2\2\2b\u0195\3\2\2\2"+
		"d\u0197\3\2\2\2f\u0199\3\2\2\2h\u019c\3\2\2\2j\u019f\3\2\2\2l\u01a2\3"+
		"\2\2\2n\u01a5\3\2\2\2p\u01a7\3\2\2\2r\u01a9\3\2\2\2t\u01ab\3\2\2\2v\u01ad"+
		"\3\2\2\2x\u01af\3\2\2\2z\u01b1\3\2\2\2|\u01b3\3\2\2\2~\u01bd\3\2\2\2\u0080"+
		"\u01bf\3\2\2\2\u0082\u01c1\3\2\2\2\u0084\u01ca\3\2\2\2\u0086\u01d1\3\2"+
		"\2\2\u0088\u01de\3\2\2\2\u008a\u01e7\3\2\2\2\u008c\u01ee\3\2\2\2\u008e"+
		"\u021a\3\2\2\2\u0090\u0239\3\2\2\2\u0092\u0251\3\2\2\2\u0094\u0254\3\2"+
		"\2\2\u0096\u0258\3\2\2\2\u0098\u025f\3\2\2\2\u009a\u0268\3\2\2\2\u009c"+
		"\u0272\3\2\2\2\u009e\u027f\3\2\2\2\u00a0\u0281\3\2\2\2\u00a2\u0291\3\2"+
		"\2\2\u00a4\u0293\3\2\2\2\u00a6\u029f\3\2\2\2\u00a8\u02be\3\2\2\2\u00aa"+
		"\u02ca\3\2\2\2\u00ac\u02d4\3\2\2\2\u00ae\u02da\3\2\2\2\u00b0\u02e0\3\2"+
		"\2\2\u00b2\u02e3\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00bc\7A\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b7\u00b8\7A\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\u00bc\7r\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\b\2\2\2\u00be\5\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\7\3"+
		"\2\2\2\u00c1\u00c2\n\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\b\5\3\2\u00c9\13\3\2\2\2\u00ca\u00cb\7A\2\2"+
		"\u00cb\u00cc\7@\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\6\4\2\u00ce\r\3"+
		"\2\2\2\u00cf\u00d0\t\4\2\2\u00d0\17\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\21\3\2\2\2\u00d4\u00d5\7=\2\2\u00d5\23\3\2\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7q\2\2\u00df\u00e0\7h\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\7"+
		"c\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4\27\3\2\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\31\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\33\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\7z\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7i\2\2\u00f8\u00f9\7n\2\2\u00f9"+
		"\u00fa\7q\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2"+
		"\u00fd!\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7p\2"+
		"\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7w\2\2\u0105\u0106\7g\2\2\u0106#\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7v\2\2\u010a\u010b\7w\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7p\2\2\u010d%\3\2\2\2\u010e\u010f\7k\2\2\u010f\u0110\7o\2\2\u0110"+
		"\u0111\7r\2\2\u0111\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113\u0114\7o\2\2"+
		"\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118"+
		"\7u\2\2\u0118\'\3\2\2\2\u0119\u011a\7x\2\2\u011a\u011b\7c\2\2\u011b\u011c"+
		"\7t\2\2\u011c)\3\2\2\2\u011d\u011e\7e\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7c\2\2\u0120\u0121\7u\2\2\u0121\u0122\7u\2\2\u0122+\3\2\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7z\2\2\u0125\u0126\7v\2\2\u0126\u0127\7g\2\2\u0127"+
		"\u0128\7p\2\2\u0128\u0129\7f\2\2\u0129\u012a\7u\2\2\u012a-\3\2\2\2\u012b"+
		"\u012c\7f\2\2\u012c\u012d\7q\2\2\u012d/\3\2\2\2\u012e\u012f\7u\2\2\u012f"+
		"\u0130\7y\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2\u0132\u0133\7e\2\2"+
		"\u0133\u0134\7j\2\2\u0134\61\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7"+
		"c\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139\63\3\2\2\2\u013a\u013b"+
		"\7f\2\2\u013b\u013c\7g\2\2\u013c\u013d\7h\2\2\u013d\u013e\7c\2\2\u013e"+
		"\u013f\7w\2\2\u013f\u0140\7n\2\2\u0140\u0141\7v\2\2\u0141\65\3\2\2\2\u0142"+
		"\u0143\7h\2\2\u0143\u0144\7w\2\2\u0144\u0145\7p\2\2\u0145\u0146\7e\2\2"+
		"\u0146\u0147\7v\2\2\u0147\u0148\7k\2\2\u0148\u0149\7q\2\2\u0149\u014a"+
		"\7p\2\2\u014a\67\3\2\2\2\u014b\u014c\7d\2\2\u014c\u014d\7t\2\2\u014d\u014e"+
		"\7g\2\2\u014e\u014f\7c\2\2\u014f\u0150\7m\2\2\u01509\3\2\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7h\2\2\u0153;\3\2\2\2\u0154\u0155\7g\2\2\u0155\u0156"+
		"\7n\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158=\3\2\2\2\u0159\u015a"+
		"\7g\2\2\u015a\u015b\7n\2\2\u015b\u015c\7u\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\7k\2\2\u015e\u015f\7h\2\2\u015f?\3\2\2\2\u0160\u0161\7h\2\2\u0161"+
		"\u0162\7q\2\2\u0162\u0163\7t\2\2\u0163A\3\2\2\2\u0164\u0165\7h\2\2\u0165"+
		"\u0166\7q\2\2\u0166\u0167\7t\2\2\u0167\u0168\7g\2\2\u0168\u0169\7c\2\2"+
		"\u0169\u016a\7e\2\2\u016a\u016b\7j\2\2\u016bC\3\2\2\2\u016c\u016d\7y\2"+
		"\2\u016d\u016e\7j\2\2\u016e\u016f\7k\2\2\u016f\u0170\7n\2\2\u0170\u0171"+
		"\7g\2\2\u0171E\3\2\2\2\u0172\u0173\7?\2\2\u0173G\3\2\2\2\u0174\u0175\7"+
		"p\2\2\u0175\u0176\7g\2\2\u0176\u0177\7y\2\2\u0177I\3\2\2\2\u0178\u0179"+
		"\7e\2\2\u0179\u017a\7n\2\2\u017a\u017b\7q\2\2\u017b\u017c\7p\2\2\u017c"+
		"\u017d\7g\2\2\u017dK\3\2\2\2\u017e\u017f\7(\2\2\u017fM\3\2\2\2\u0180\u0181"+
		"\7~\2\2\u0181O\3\2\2\2\u0182\u0183\7#\2\2\u0183Q\3\2\2\2\u0184\u0185\7"+
		"-\2\2\u0185S\3\2\2\2\u0186\u0187\7/\2\2\u0187U\3\2\2\2\u0188\u0189\7,"+
		"\2\2\u0189W\3\2\2\2\u018a\u018b\7\'\2\2\u018bY\3\2\2\2\u018c\u018d\7\61"+
		"\2\2\u018d[\3\2\2\2\u018e\u018f\7\u0080\2\2\u018f]\3\2\2\2\u0190\u0191"+
		"\7/\2\2\u0191\u0192\7@\2\2\u0192_\3\2\2\2\u0193\u0194\7B\2\2\u0194a\3"+
		"\2\2\2\u0195\u0196\7&\2\2\u0196c\3\2\2\2\u0197\u0198\7\60\2\2\u0198e\3"+
		"\2\2\2\u0199\u019a\7?\2\2\u019a\u019b\7@\2\2\u019bg\3\2\2\2\u019c\u019d"+
		"\7~\2\2\u019d\u019e\7~\2\2\u019ei\3\2\2\2\u019f\u01a0\7(\2\2\u01a0\u01a1"+
		"\7(\2\2\u01a1k\3\2\2\2\u01a2\u01a3\7<\2\2\u01a3\u01a4\7<\2\2\u01a4m\3"+
		"\2\2\2\u01a5\u01a6\7A\2\2\u01a6o\3\2\2\2\u01a7\u01a8\7*\2\2\u01a8q\3\2"+
		"\2\2\u01a9\u01aa\7+\2\2\u01aas\3\2\2\2\u01ab\u01ac\7]\2\2\u01acu\3\2\2"+
		"\2\u01ad\u01ae\7_\2\2\u01aew\3\2\2\2\u01af\u01b0\7}\2\2\u01b0y\3\2\2\2"+
		"\u01b1\u01b2\7\177\2\2\u01b2{\3\2\2\2\u01b3\u01b4\7K\2\2\u01b4\u01b5\7"+
		"p\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9"+
		"\7h\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7g\2\2\u01bc"+
		"}\3\2\2\2\u01bd\u01be\7.\2\2\u01be\177\3\2\2\2\u01bf\u01c0\7<\2\2\u01c0"+
		"\u0081\3\2\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7d\2\2\u01c3\u01c4\7u\2"+
		"\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8"+
		"\7e\2\2\u01c8\u01c9\7v\2\2\u01c9\u0083\3\2\2\2\u01ca\u01cb\7u\2\2\u01cb"+
		"\u01cc\7v\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7k\2\2"+
		"\u01cf\u01d0\7e\2\2\u01d0\u0085\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2\u01d3"+
		"\7,\2\2\u01d3\u01d8\3\2\2\2\u01d4\u01d7\7,\2\2\u01d5\u01d7\n\5\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01dc\7,\2\2\u01dc\u01dd\7\61\2\2\u01dd\u0087\3\2\2\2\u01de\u01df\7\61"+
		"\2\2\u01df\u01e0\7\61\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e3\n\6\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u0089\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\7%\2\2\u01e8"+
		"\u01ea\n\6\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u008b\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\t\7\2\2\u01ef\u01f0\t\b\2\2\u01f0\u01f1\t\b\2\2\u01f1\u01f2\t\7"+
		"\2\2\u01f2\u01f3\t\t\2\2\u01f3\u008d\3\2\2\2\u01f4\u01f5\7t\2\2\u01f5"+
		"\u01f6\7g\2\2\u01f6\u01f7\7s\2\2\u01f7\u01f8\7w\2\2\u01f8\u01f9\7k\2\2"+
		"\u01f9\u01fa\7t\2\2\u01fa\u021b\7g\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd"+
		"\7g\2\2\u01fd\u01fe\7s\2\2\u01fe\u01ff\7w\2\2\u01ff\u0200\7k\2\2\u0200"+
		"\u0201\7t\2\2\u0201\u0202\7g\2\2\u0202\u0203\7a\2\2\u0203\u0204\7q\2\2"+
		"\u0204\u0205\7p\2\2\u0205\u0206\7e\2\2\u0206\u021b\7g\2\2\u0207\u0208"+
		"\7k\2\2\u0208\u0209\7p\2\2\u0209\u020a\7e\2\2\u020a\u020b\7n\2\2\u020b"+
		"\u020c\7w\2\2\u020c\u020d\7f\2\2\u020d\u021b\7g\2\2\u020e\u020f\7k\2\2"+
		"\u020f\u0210\7p\2\2\u0210\u0211\7e\2\2\u0211\u0212\7n\2\2\u0212\u0213"+
		"\7w\2\2\u0213\u0214\7f\2\2\u0214\u0215\7g\2\2\u0215\u0216\7a\2\2\u0216"+
		"\u0217\7q\2\2\u0217\u0218\7p\2\2\u0218\u0219\7e\2\2\u0219\u021b\7g\2\2"+
		"\u021a\u01f4\3\2\2\2\u021a\u01fb\3\2\2\2\u021a\u0207\3\2\2\2\u021a\u020e"+
		"\3\2\2\2\u021b\u008f\3\2\2\2\u021c\u021d\7k\2\2\u021d\u021e\7p\2\2\u021e"+
		"\u023a\7v\2\2\u021f\u0220\7h\2\2\u0220\u0221\7n\2\2\u0221\u0222\7q\2\2"+
		"\u0222\u0223\7c\2\2\u0223\u023a\7v\2\2\u0224\u0225\7u\2\2\u0225\u0226"+
		"\7v\2\2\u0226\u0227\7t\2\2\u0227\u0228\7k\2\2\u0228\u0229\7p\2\2\u0229"+
		"\u023a\7i\2\2\u022a\u022b\7c\2\2\u022b\u022c\7t\2\2\u022c\u022d\7t\2\2"+
		"\u022d\u022e\7c\2\2\u022e\u023a\7{\2\2\u022f\u0230\7q\2\2\u0230\u0231"+
		"\7d\2\2\u0231\u0232\7l\2\2\u0232\u0233\7g\2\2\u0233\u0234\7e\2\2\u0234"+
		"\u023a\7v\2\2\u0235\u0236\7d\2\2\u0236\u0237\7q\2\2\u0237\u0238\7q\2\2"+
		"\u0238\u023a\7n\2\2\u0239\u021c\3\2\2\2\u0239\u021f\3\2\2\2\u0239\u0224"+
		"\3\2\2\2\u0239\u022a\3\2\2\2\u0239\u022f\3\2\2\2\u0239\u0235\3\2\2\2\u023a"+
		"\u0091\3\2\2\2\u023b\u023c\7r\2\2\u023c\u023d\7w\2\2\u023d\u023e\7d\2"+
		"\2\u023e\u023f\7n\2\2\u023f\u0240\7k\2\2\u0240\u0252\7e\2\2\u0241\u0242"+
		"\7r\2\2\u0242\u0243\7t\2\2\u0243\u0244\7k\2\2\u0244\u0245\7x\2\2\u0245"+
		"\u0246\7c\2\2\u0246\u0247\7v\2\2\u0247\u0252\7g\2\2\u0248\u0249\7r\2\2"+
		"\u0249\u024a\7t\2\2\u024a\u024b\7q\2\2\u024b\u024c\7v\2\2\u024c\u024d"+
		"\7g\2\2\u024d\u024e\7e\2\2\u024e\u024f\7v\2\2\u024f\u0250\7g\2\2\u0250"+
		"\u0252\7f\2\2\u0251\u023b\3\2\2\2\u0251\u0241\3\2\2\2\u0251\u0248\3\2"+
		"\2\2\u0252\u0093\3\2\2\2\u0253\u0255\4\62;\2\u0254\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0095\3\2"+
		"\2\2\u0258\u0259\7\62\2\2\u0259\u025b\t\n\2\2\u025a\u025c\t\13\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u0097\3\2\2\2\u025f\u0261\7\62\2\2\u0260\u0262\4\629\2\u0261"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0099\3\2\2\2\u0265\u0267\4\62;\2\u0266\u0265\3\2\2\2\u0267"+
		"\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0268\3\2\2\2\u026b\u026d\7\60\2\2\u026c\u026e\4\62;\2\u026d"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u009b\3\2\2\2\u0271\u0273\4\62;\2\u0272\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u009d\3\2"+
		"\2\2\u0276\u0277\7v\2\2\u0277\u0278\7t\2\2\u0278\u0279\7w\2\2\u0279\u0280"+
		"\7g\2\2\u027a\u027b\7h\2\2\u027b\u027c\7c\2\2\u027c\u027d\7n\2\2\u027d"+
		"\u027e\7u\2\2\u027e\u0280\7g\2\2\u027f\u0276\3\2\2\2\u027f\u027a\3\2\2"+
		"\2\u0280\u009f\3\2\2\2\u0281\u028a\7)\2\2\u0282\u0283\7^\2\2\u0283\u0289"+
		"\7)\2\2\u0284\u0285\7^\2\2\u0285\u0289\7^\2\2\u0286\u0289\7^\2\2\u0287"+
		"\u0289\n\f\2\2\u0288\u0282\3\2\2\2\u0288\u0284\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\7)"+
		"\2\2\u028e\u00a1\3\2\2\2\u028f\u0292\t\r\2\2\u0290\u0292\5\u009cN\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292\u00a3\3\2\2\2\u0293\u029a\7$"+
		"\2\2\u0294\u0295\7^\2\2\u0295\u0299\5\u00a2Q\2\u0296\u0299\7^\2\2\u0297"+
		"\u0299\n\16\2\2\u0298\u0294\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3"+
		"\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7$\2\2\u029e\u00a5\3\2"+
		"\2\2\u029f\u02a3\t\17\2\2\u02a0\u02a2\t\20\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u00a7\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7-\2\2\u02a7\u02bf\7?\2\2\u02a8\u02a9"+
		"\7/\2\2\u02a9\u02bf\7?\2\2\u02aa\u02ab\7,\2\2\u02ab\u02bf\7?\2\2\u02ac"+
		"\u02ad\7\61\2\2\u02ad\u02bf\7?\2\2\u02ae\u02af\7\60\2\2\u02af\u02bf\7"+
		"?\2\2\u02b0\u02b1\7\'\2\2\u02b1\u02bf\7?\2\2\u02b2\u02b3\7(\2\2\u02b3"+
		"\u02bf\7?\2\2\u02b4\u02b5\7~\2\2\u02b5\u02bf\7?\2\2\u02b6\u02b7\7`\2\2"+
		"\u02b7\u02bf\7?\2\2\u02b8\u02b9\7>\2\2\u02b9\u02ba\7>\2\2\u02ba\u02bf"+
		"\7?\2\2\u02bb\u02bc\7@\2\2\u02bc\u02bd\7@\2\2\u02bd\u02bf\7?\2\2\u02be"+
		"\u02a6\3\2\2\2\u02be\u02a8\3\2\2\2\u02be\u02aa\3\2\2\2\u02be\u02ac\3\2"+
		"\2\2\u02be\u02ae\3\2\2\2\u02be\u02b0\3\2\2\2\u02be\u02b2\3\2\2\2\u02be"+
		"\u02b4\3\2\2\2\u02be\u02b6\3\2\2\2\u02be\u02b8\3\2\2\2\u02be\u02bb\3\2"+
		"\2\2\u02bf\u00a9\3\2\2\2\u02c0\u02c1\7?\2\2\u02c1\u02cb\7?\2\2\u02c2\u02c3"+
		"\7#\2\2\u02c3\u02cb\7?\2\2\u02c4\u02c5\7?\2\2\u02c5\u02c6\7?\2\2\u02c6"+
		"\u02cb\7?\2\2\u02c7\u02c8\7#\2\2\u02c8\u02c9\7?\2\2\u02c9\u02cb\7?\2\2"+
		"\u02ca\u02c0\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c7"+
		"\3\2\2\2\u02cb\u00ab\3\2\2\2\u02cc\u02d5\7>\2\2\u02cd\u02ce\7>\2\2\u02ce"+
		"\u02d5\7?\2\2\u02cf\u02d5\7@\2\2\u02d0\u02d1\7@\2\2\u02d1\u02d5\7?\2\2"+
		"\u02d2\u02d3\7>\2\2\u02d3\u02d5\7@\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cd"+
		"\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u00ad\3\2\2\2\u02d6\u02d7\7>\2\2\u02d7\u02db\7>\2\2\u02d8\u02d9\7@\2"+
		"\2\u02d9\u02db\7@\2\2\u02da\u02d6\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u00af"+
		"\3\2\2\2\u02dc\u02dd\7/\2\2\u02dd\u02e1\7/\2\2\u02de\u02df\7-\2\2\u02df"+
		"\u02e1\7-\2\2\u02e0\u02dc\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u00b1\3\2"+
		"\2\2\u02e2\u02e4\t\21\2\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\bY"+
		"\5\2\u02e8\u00b3\3\2\2\2 \2\3\u00bb\u00c6\u01d6\u01d8\u01e4\u01eb\u021a"+
		"\u0239\u0251\u0256\u025d\u0263\u0268\u026f\u0274\u027f\u0288\u028a\u0291"+
		"\u0298\u029a\u02a3\u02be\u02ca\u02d4\u02da\u02e0\u02e5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}