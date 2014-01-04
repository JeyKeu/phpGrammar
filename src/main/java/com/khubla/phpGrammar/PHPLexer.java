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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2Z\u02f1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u00c1\n\2\3\2\3\2\3\3\3\3\3\4\6\4\u00c8\n\4\r\4\16\4\u00c9"+
		"\3\5\6\5\u00cd\n\5\r\5\16\5\u00ce\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\7C\u01df\nC\fC\16C\u01e2"+
		"\13C\3C\3C\3C\3D\3D\3D\3D\7D\u01eb\nD\fD\16D\u01ee\13D\3E\3E\7E\u01f2"+
		"\nE\fE\16E\u01f5\13E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\5G\u0223\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0242\nH\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u025a\nI\3J\6"+
		"J\u025d\nJ\rJ\16J\u025e\3K\3K\3K\6K\u0264\nK\rK\16K\u0265\3L\3L\6L\u026a"+
		"\nL\rL\16L\u026b\3M\7M\u026f\nM\fM\16M\u0272\13M\3M\3M\6M\u0276\nM\rM"+
		"\16M\u0277\3N\6N\u027b\nN\rN\16N\u027c\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0288"+
		"\nO\3P\3P\3P\3P\3P\3P\3P\7P\u0291\nP\fP\16P\u0294\13P\3P\3P\3Q\3Q\5Q\u029a"+
		"\nQ\3R\3R\3R\3R\3R\7R\u02a1\nR\fR\16R\u02a4\13R\3R\3R\3S\3S\7S\u02aa\n"+
		"S\fS\16S\u02ad\13S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\5T\u02c7\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u02d3"+
		"\nU\3V\3V\3V\3V\3V\3V\3V\3V\5V\u02dd\nV\3W\3W\3W\3W\5W\u02e3\nW\3X\3X"+
		"\3X\3X\5X\u02e9\nX\3Y\6Y\u02ec\nY\rY\16Y\u02ed\3Y\3Y\2Z\4\3\2\6\4\1\b"+
		"\5\1\n\6\3\f\7\4\16\b\1\20\t\1\22\n\1\24\13\1\26\f\1\30\r\1\32\16\1\34"+
		"\17\1\36\20\1 \21\1\"\22\1$\23\1&\24\1(\25\1*\26\1,\27\1.\30\1\60\31\1"+
		"\62\32\1\64\33\1\66\34\18\35\1:\36\1<\37\1> \1@!\1B\"\1D#\1F$\1H%\1J&"+
		"\1L\'\1N(\1P)\1R*\1T+\1V,\1X-\1Z.\1\\/\1^\60\1`\61\1b\62\1d\63\1f\64\1"+
		"h\65\1j\66\1l\67\1n8\1p9\1r:\1t;\1v<\1x=\1z>\1|?\1~@\1\u0080A\1\u0082"+
		"B\1\u0084C\1\u0086D\1\u0088E\1\u008aF\1\u008cG\1\u008eH\1\u0090I\1\u0092"+
		"J\1\u0094K\1\u0096L\1\u0098M\1\u009aN\1\u009cO\1\u009eP\1\u00a0Q\1\u00a2"+
		"R\1\u00a4S\1\u00a6T\1\u00a8U\1\u00aaV\1\u00acW\1\u00aeX\1\u00b0Y\1\u00b2"+
		"Z\5\4\2\3\22\4\2))>>\5\2\f\f\17\17\"\"\4\2GGgg\3\2,,\4\2\f\f\17\17\4\2"+
		"CCcc\4\2TTtt\4\2[[{{\4\2ZZzz\5\2\62;CHch\4\2))^^\b\2$$&&^^ppttvv\4\2$"+
		"$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0325\2\4\3\2\2\2\2\6"+
		"\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2"+
		"\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34"+
		"\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3("+
		"\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3"+
		"\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3"+
		"@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3"+
		"\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2"+
		"\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2\3`\3\2\2\2\3b\3\2\2\2\3d\3\2\2\2"+
		"\3f\3\2\2\2\3h\3\2\2\2\3j\3\2\2\2\3l\3\2\2\2\3n\3\2\2\2\3p\3\2\2\2\3r"+
		"\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\3x\3\2\2\2\3z\3\2\2\2\3|\3\2\2\2\3~\3\2"+
		"\2\2\3\u0080\3\2\2\2\3\u0082\3\2\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\3"+
		"\u0088\3\2\2\2\3\u008a\3\2\2\2\3\u008c\3\2\2\2\3\u008e\3\2\2\2\3\u0090"+
		"\3\2\2\2\3\u0092\3\2\2\2\3\u0094\3\2\2\2\3\u0096\3\2\2\2\3\u0098\3\2\2"+
		"\2\3\u009a\3\2\2\2\3\u009c\3\2\2\2\3\u009e\3\2\2\2\3\u00a0\3\2\2\2\3\u00a2"+
		"\3\2\2\2\3\u00a4\3\2\2\2\3\u00a6\3\2\2\2\3\u00a8\3\2\2\2\3\u00aa\3\2\2"+
		"\2\3\u00ac\3\2\2\2\3\u00ae\3\2\2\2\3\u00b0\3\2\2\2\3\u00b2\3\2\2\2\4\u00c0"+
		"\3\2\2\2\6\u00c4\3\2\2\2\b\u00c7\3\2\2\2\n\u00cc\3\2\2\2\f\u00d2\3\2\2"+
		"\2\16\u00d7\3\2\2\2\20\u00d9\3\2\2\2\22\u00dc\3\2\2\2\24\u00de\3\2\2\2"+
		"\26\u00e9\3\2\2\2\30\u00ed\3\2\2\2\32\u00f2\3\2\2\2\34\u00f8\3\2\2\2\36"+
		"\u00fb\3\2\2\2 \u00ff\3\2\2\2\"\u0106\3\2\2\2$\u010f\3\2\2\2&\u0116\3"+
		"\2\2\2(\u0121\3\2\2\2*\u0125\3\2\2\2,\u012b\3\2\2\2.\u0133\3\2\2\2\60"+
		"\u0136\3\2\2\2\62\u013d\3\2\2\2\64\u0142\3\2\2\2\66\u014a\3\2\2\28\u0153"+
		"\3\2\2\2:\u0159\3\2\2\2<\u015c\3\2\2\2>\u0161\3\2\2\2@\u0168\3\2\2\2B"+
		"\u016c\3\2\2\2D\u0174\3\2\2\2F\u017a\3\2\2\2H\u017c\3\2\2\2J\u0180\3\2"+
		"\2\2L\u0186\3\2\2\2N\u0188\3\2\2\2P\u018a\3\2\2\2R\u018c\3\2\2\2T\u018e"+
		"\3\2\2\2V\u0190\3\2\2\2X\u0192\3\2\2\2Z\u0194\3\2\2\2\\\u0196\3\2\2\2"+
		"^\u0198\3\2\2\2`\u019b\3\2\2\2b\u019d\3\2\2\2d\u019f\3\2\2\2f\u01a1\3"+
		"\2\2\2h\u01a4\3\2\2\2j\u01a7\3\2\2\2l\u01aa\3\2\2\2n\u01ad\3\2\2\2p\u01af"+
		"\3\2\2\2r\u01b1\3\2\2\2t\u01b3\3\2\2\2v\u01b5\3\2\2\2x\u01b7\3\2\2\2z"+
		"\u01b9\3\2\2\2|\u01bb\3\2\2\2~\u01c5\3\2\2\2\u0080\u01c7\3\2\2\2\u0082"+
		"\u01c9\3\2\2\2\u0084\u01d2\3\2\2\2\u0086\u01d9\3\2\2\2\u0088\u01e6\3\2"+
		"\2\2\u008a\u01ef\3\2\2\2\u008c\u01f6\3\2\2\2\u008e\u0222\3\2\2\2\u0090"+
		"\u0241\3\2\2\2\u0092\u0259\3\2\2\2\u0094\u025c\3\2\2\2\u0096\u0260\3\2"+
		"\2\2\u0098\u0267\3\2\2\2\u009a\u0270\3\2\2\2\u009c\u027a\3\2\2\2\u009e"+
		"\u0287\3\2\2\2\u00a0\u0289\3\2\2\2\u00a2\u0299\3\2\2\2\u00a4\u029b\3\2"+
		"\2\2\u00a6\u02a7\3\2\2\2\u00a8\u02c6\3\2\2\2\u00aa\u02d2\3\2\2\2\u00ac"+
		"\u02dc\3\2\2\2\u00ae\u02e2\3\2\2\2\u00b0\u02e8\3\2\2\2\u00b2\u02eb\3\2"+
		"\2\2\u00b4\u00b5\7>\2\2\u00b5\u00c1\7A\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8"+
		"\7A\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7j\2\2\u00ba\u00c1\7r\2\2\u00bb"+
		"\u00bc\7>\2\2\u00bc\u00bd\7A\2\2\u00bd\u00be\7R\2\2\u00be\u00bf\7J\2\2"+
		"\u00bf\u00c1\7R\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00bb"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\2\2\2\u00c3\5\3\2\2\2\u00c4"+
		"\u00c5\7>\2\2\u00c5\7\3\2\2\2\u00c6\u00c8\n\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\t\3"+
		"\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\5"+
		"\3\2\u00d1\13\3\2\2\2\u00d2\u00d3\7A\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\b\6\4\2\u00d6\r\3\2\2\2\u00d7\u00d8\t\4\2\2\u00d8"+
		"\17\3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7u\2\2\u00db\21\3\2\2\2\u00dc"+
		"\u00dd\7=\2\2\u00dd\23\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7p\2\2"+
		"\u00e4\u00e5\7e\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7h\2\2\u00e8\25\3\2\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7f\2\2\u00ec\27\3\2\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7u\2\2\u00f0\u00f1\7v\2\2\u00f1\31\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\33\3\2\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00fa\35\3\2\2\2\u00fb"+
		"\u00fc\7z\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\37\3\2\2\2\u00ff"+
		"\u0100\7i\2\2\u0100\u0101\7n\2\2\u0101\u0102\7q\2\2\u0102\u0103\7d\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105!\3\2\2\2\u0106\u0107\7e\2"+
		"\2\u0107\u0108\7q\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b"+
		"\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7w\2\2\u010d\u010e\7g\2\2\u010e"+
		"#\3\2\2\2\u010f\u0110\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7v\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\7t\2\2\u0114\u0115\7p\2\2\u0115%\3\2\2\2\u0116"+
		"\u0117\7k\2\2\u0117\u0118\7o\2\2\u0118\u0119\7r\2\2\u0119\u011a\7n\2\2"+
		"\u011a\u011b\7g\2\2\u011b\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e"+
		"\7p\2\2\u011e\u011f\7v\2\2\u011f\u0120\7u\2\2\u0120\'\3\2\2\2\u0121\u0122"+
		"\7x\2\2\u0122\u0123\7c\2\2\u0123\u0124\7t\2\2\u0124)\3\2\2\2\u0125\u0126"+
		"\7e\2\2\u0126\u0127\7n\2\2\u0127\u0128\7c\2\2\u0128\u0129\7u\2\2\u0129"+
		"\u012a\7u\2\2\u012a+\3\2\2\2\u012b\u012c\7g\2\2\u012c\u012d\7z\2\2\u012d"+
		"\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131\7f\2\2"+
		"\u0131\u0132\7u\2\2\u0132-\3\2\2\2\u0133\u0134\7f\2\2\u0134\u0135\7q\2"+
		"\2\u0135/\3\2\2\2\u0136\u0137\7u\2\2\u0137\u0138\7y\2\2\u0138\u0139\7"+
		"k\2\2\u0139\u013a\7v\2\2\u013a\u013b\7e\2\2\u013b\u013c\7j\2\2\u013c\61"+
		"\3\2\2\2\u013d\u013e\7e\2\2\u013e\u013f\7c\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7g\2\2\u0141\63\3\2\2\2\u0142\u0143\7f\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7h\2\2\u0145\u0146\7c\2\2\u0146\u0147\7w\2\2\u0147\u0148\7n\2\2"+
		"\u0148\u0149\7v\2\2\u0149\65\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c\7"+
		"w\2\2\u014c\u014d\7p\2\2\u014d\u014e\7e\2\2\u014e\u014f\7v\2\2\u014f\u0150"+
		"\7k\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2\u0152\67\3\2\2\2\u0153\u0154"+
		"\7d\2\2\u0154\u0155\7t\2\2\u0155\u0156\7g\2\2\u0156\u0157\7c\2\2\u0157"+
		"\u0158\7m\2\2\u01589\3\2\2\2\u0159\u015a\7k\2\2\u015a\u015b\7h\2\2\u015b"+
		";\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7g\2\2\u0160=\3\2\2\2\u0161\u0162\7g\2\2\u0162\u0163\7n\2\2\u0163"+
		"\u0164\7u\2\2\u0164\u0165\7g\2\2\u0165\u0166\7k\2\2\u0166\u0167\7h\2\2"+
		"\u0167?\3\2\2\2\u0168\u0169\7h\2\2\u0169\u016a\7q\2\2\u016a\u016b\7t\2"+
		"\2\u016bA\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7q\2\2\u016e\u016f\7"+
		"t\2\2\u016f\u0170\7g\2\2\u0170\u0171\7c\2\2\u0171\u0172\7e\2\2\u0172\u0173"+
		"\7j\2\2\u0173C\3\2\2\2\u0174\u0175\7y\2\2\u0175\u0176\7j\2\2\u0176\u0177"+
		"\7k\2\2\u0177\u0178\7n\2\2\u0178\u0179\7g\2\2\u0179E\3\2\2\2\u017a\u017b"+
		"\7?\2\2\u017bG\3\2\2\2\u017c\u017d\7p\2\2\u017d\u017e\7g\2\2\u017e\u017f"+
		"\7y\2\2\u017fI\3\2\2\2\u0180\u0181\7e\2\2\u0181\u0182\7n\2\2\u0182\u0183"+
		"\7q\2\2\u0183\u0184\7p\2\2\u0184\u0185\7g\2\2\u0185K\3\2\2\2\u0186\u0187"+
		"\7(\2\2\u0187M\3\2\2\2\u0188\u0189\7~\2\2\u0189O\3\2\2\2\u018a\u018b\7"+
		"#\2\2\u018bQ\3\2\2\2\u018c\u018d\7-\2\2\u018dS\3\2\2\2\u018e\u018f\7/"+
		"\2\2\u018fU\3\2\2\2\u0190\u0191\7,\2\2\u0191W\3\2\2\2\u0192\u0193\7\'"+
		"\2\2\u0193Y\3\2\2\2\u0194\u0195\7\61\2\2\u0195[\3\2\2\2\u0196\u0197\7"+
		"\u0080\2\2\u0197]\3\2\2\2\u0198\u0199\7/\2\2\u0199\u019a\7@\2\2\u019a"+
		"_\3\2\2\2\u019b\u019c\7B\2\2\u019ca\3\2\2\2\u019d\u019e\7&\2\2\u019ec"+
		"\3\2\2\2\u019f\u01a0\7\60\2\2\u01a0e\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2"+
		"\u01a3\7@\2\2\u01a3g\3\2\2\2\u01a4\u01a5\7~\2\2\u01a5\u01a6\7~\2\2\u01a6"+
		"i\3\2\2\2\u01a7\u01a8\7(\2\2\u01a8\u01a9\7(\2\2\u01a9k\3\2\2\2\u01aa\u01ab"+
		"\7<\2\2\u01ab\u01ac\7<\2\2\u01acm\3\2\2\2\u01ad\u01ae\7A\2\2\u01aeo\3"+
		"\2\2\2\u01af\u01b0\7*\2\2\u01b0q\3\2\2\2\u01b1\u01b2\7+\2\2\u01b2s\3\2"+
		"\2\2\u01b3\u01b4\7]\2\2\u01b4u\3\2\2\2\u01b5\u01b6\7_\2\2\u01b6w\3\2\2"+
		"\2\u01b7\u01b8\7}\2\2\u01b8y\3\2\2\2\u01b9\u01ba\7\177\2\2\u01ba{\3\2"+
		"\2\2\u01bb\u01bc\7K\2\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7v\2\2\u01be\u01bf"+
		"\7g\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7h\2\2\u01c1\u01c2\7c\2\2\u01c2"+
		"\u01c3\7e\2\2\u01c3\u01c4\7g\2\2\u01c4}\3\2\2\2\u01c5\u01c6\7.\2\2\u01c6"+
		"\177\3\2\2\2\u01c7\u01c8\7<\2\2\u01c8\u0081\3\2\2\2\u01c9\u01ca\7c\2\2"+
		"\u01ca\u01cb\7d\2\2\u01cb\u01cc\7u\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce"+
		"\7t\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7v\2\2\u01d1"+
		"\u0083\3\2\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7c\2"+
		"\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7e\2\2\u01d8\u0085"+
		"\3\2\2\2\u01d9\u01da\7\61\2\2\u01da\u01db\7,\2\2\u01db\u01e0\3\2\2\2\u01dc"+
		"\u01df\7,\2\2\u01dd\u01df\n\5\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2"+
		"\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7,\2\2\u01e4\u01e5\7\61"+
		"\2\2\u01e5\u0087\3\2\2\2\u01e6\u01e7\7\61\2\2\u01e7\u01e8\7\61\2\2\u01e8"+
		"\u01ec\3\2\2\2\u01e9\u01eb\n\6\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0089\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f3\7%\2\2\u01f0\u01f2\n\6\2\2\u01f1\u01f0\3\2"+
		"\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u008b\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\t\7\2\2\u01f7\u01f8\t\b"+
		"\2\2\u01f8\u01f9\t\b\2\2\u01f9\u01fa\t\7\2\2\u01fa\u01fb\t\t\2\2\u01fb"+
		"\u008d\3\2\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7s\2"+
		"\2\u01ff\u0200\7w\2\2\u0200\u0201\7k\2\2\u0201\u0202\7t\2\2\u0202\u0223"+
		"\7g\2\2\u0203\u0204\7t\2\2\u0204\u0205\7g\2\2\u0205\u0206\7s\2\2\u0206"+
		"\u0207\7w\2\2\u0207\u0208\7k\2\2\u0208\u0209\7t\2\2\u0209\u020a\7g\2\2"+
		"\u020a\u020b\7a\2\2\u020b\u020c\7q\2\2\u020c\u020d\7p\2\2\u020d\u020e"+
		"\7e\2\2\u020e\u0223\7g\2\2\u020f\u0210\7k\2\2\u0210\u0211\7p\2\2\u0211"+
		"\u0212\7e\2\2\u0212\u0213\7n\2\2\u0213\u0214\7w\2\2\u0214\u0215\7f\2\2"+
		"\u0215\u0223\7g\2\2\u0216\u0217\7k\2\2\u0217\u0218\7p\2\2\u0218\u0219"+
		"\7e\2\2\u0219\u021a\7n\2\2\u021a\u021b\7w\2\2\u021b\u021c\7f\2\2\u021c"+
		"\u021d\7g\2\2\u021d\u021e\7a\2\2\u021e\u021f\7q\2\2\u021f\u0220\7p\2\2"+
		"\u0220\u0221\7e\2\2\u0221\u0223\7g\2\2\u0222\u01fc\3\2\2\2\u0222\u0203"+
		"\3\2\2\2\u0222\u020f\3\2\2\2\u0222\u0216\3\2\2\2\u0223\u008f\3\2\2\2\u0224"+
		"\u0225\7k\2\2\u0225\u0226\7p\2\2\u0226\u0242\7v\2\2\u0227\u0228\7h\2\2"+
		"\u0228\u0229\7n\2\2\u0229\u022a\7q\2\2\u022a\u022b\7c\2\2\u022b\u0242"+
		"\7v\2\2\u022c\u022d\7u\2\2\u022d\u022e\7v\2\2\u022e\u022f\7t\2\2\u022f"+
		"\u0230\7k\2\2\u0230\u0231\7p\2\2\u0231\u0242\7i\2\2\u0232\u0233\7c\2\2"+
		"\u0233\u0234\7t\2\2\u0234\u0235\7t\2\2\u0235\u0236\7c\2\2\u0236\u0242"+
		"\7{\2\2\u0237\u0238\7q\2\2\u0238\u0239\7d\2\2\u0239\u023a\7l\2\2\u023a"+
		"\u023b\7g\2\2\u023b\u023c\7e\2\2\u023c\u0242\7v\2\2\u023d\u023e\7d\2\2"+
		"\u023e\u023f\7q\2\2\u023f\u0240\7q\2\2\u0240\u0242\7n\2\2\u0241\u0224"+
		"\3\2\2\2\u0241\u0227\3\2\2\2\u0241\u022c\3\2\2\2\u0241\u0232\3\2\2\2\u0241"+
		"\u0237\3\2\2\2\u0241\u023d\3\2\2\2\u0242\u0091\3\2\2\2\u0243\u0244\7r"+
		"\2\2\u0244\u0245\7w\2\2\u0245\u0246\7d\2\2\u0246\u0247\7n\2\2\u0247\u0248"+
		"\7k\2\2\u0248\u025a\7e\2\2\u0249\u024a\7r\2\2\u024a\u024b\7t\2\2\u024b"+
		"\u024c\7k\2\2\u024c\u024d\7x\2\2\u024d\u024e\7c\2\2\u024e\u024f\7v\2\2"+
		"\u024f\u025a\7g\2\2\u0250\u0251\7r\2\2\u0251\u0252\7t\2\2\u0252\u0253"+
		"\7q\2\2\u0253\u0254\7v\2\2\u0254\u0255\7g\2\2\u0255\u0256\7e\2\2\u0256"+
		"\u0257\7v\2\2\u0257\u0258\7g\2\2\u0258\u025a\7f\2\2\u0259\u0243\3\2\2"+
		"\2\u0259\u0249\3\2\2\2\u0259\u0250\3\2\2\2\u025a\u0093\3\2\2\2\u025b\u025d"+
		"\4\62;\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0095\3\2\2\2\u0260\u0261\7\62\2\2\u0261\u0263\t"+
		"\n\2\2\u0262\u0264\t\13\2\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0097\3\2\2\2\u0267\u0269\7\62"+
		"\2\2\u0268\u026a\4\629\2\u0269\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0099\3\2\2\2\u026d\u026f\4\62"+
		";\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\7\60"+
		"\2\2\u0274\u0276\4\62;\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u009b\3\2\2\2\u0279\u027b\4\62"+
		";\2\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u009d\3\2\2\2\u027e\u027f\7v\2\2\u027f\u0280\7t\2"+
		"\2\u0280\u0281\7w\2\2\u0281\u0288\7g\2\2\u0282\u0283\7h\2\2\u0283\u0284"+
		"\7c\2\2\u0284\u0285\7n\2\2\u0285\u0286\7u\2\2\u0286\u0288\7g\2\2\u0287"+
		"\u027e\3\2\2\2\u0287\u0282\3\2\2\2\u0288\u009f\3\2\2\2\u0289\u0292\7)"+
		"\2\2\u028a\u028b\7^\2\2\u028b\u0291\7)\2\2\u028c\u028d\7^\2\2\u028d\u0291"+
		"\7^\2\2\u028e\u0291\7^\2\2\u028f\u0291\n\f\2\2\u0290\u028a\3\2\2\2\u0290"+
		"\u028c\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0295\u0296\7)\2\2\u0296\u00a1\3\2\2\2\u0297\u029a\t\r"+
		"\2\2\u0298\u029a\5\u009cN\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\u00a3\3\2\2\2\u029b\u02a2\7$\2\2\u029c\u029d\7^\2\2\u029d\u02a1\5\u00a2"+
		"Q\2\u029e\u02a1\7^\2\2\u029f\u02a1\n\16\2\2\u02a0\u029c\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5"+
		"\u02a6\7$\2\2\u02a6\u00a5\3\2\2\2\u02a7\u02ab\t\17\2\2\u02a8\u02aa\t\20"+
		"\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u00a7\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7-"+
		"\2\2\u02af\u02c7\7?\2\2\u02b0\u02b1\7/\2\2\u02b1\u02c7\7?\2\2\u02b2\u02b3"+
		"\7,\2\2\u02b3\u02c7\7?\2\2\u02b4\u02b5\7\61\2\2\u02b5\u02c7\7?\2\2\u02b6"+
		"\u02b7\7\60\2\2\u02b7\u02c7\7?\2\2\u02b8\u02b9\7\'\2\2\u02b9\u02c7\7?"+
		"\2\2\u02ba\u02bb\7(\2\2\u02bb\u02c7\7?\2\2\u02bc\u02bd\7~\2\2\u02bd\u02c7"+
		"\7?\2\2\u02be\u02bf\7`\2\2\u02bf\u02c7\7?\2\2\u02c0\u02c1\7>\2\2\u02c1"+
		"\u02c2\7>\2\2\u02c2\u02c7\7?\2\2\u02c3\u02c4\7@\2\2\u02c4\u02c5\7@\2\2"+
		"\u02c5\u02c7\7?\2\2\u02c6\u02ae\3\2\2\2\u02c6\u02b0\3\2\2\2\u02c6\u02b2"+
		"\3\2\2\2\u02c6\u02b4\3\2\2\2\u02c6\u02b6\3\2\2\2\u02c6\u02b8\3\2\2\2\u02c6"+
		"\u02ba\3\2\2\2\u02c6\u02bc\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02c0\3\2"+
		"\2\2\u02c6\u02c3\3\2\2\2\u02c7\u00a9\3\2\2\2\u02c8\u02c9\7?\2\2\u02c9"+
		"\u02d3\7?\2\2\u02ca\u02cb\7#\2\2\u02cb\u02d3\7?\2\2\u02cc\u02cd\7?\2\2"+
		"\u02cd\u02ce\7?\2\2\u02ce\u02d3\7?\2\2\u02cf\u02d0\7#\2\2\u02d0\u02d1"+
		"\7?\2\2\u02d1\u02d3\7?\2\2\u02d2\u02c8\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d2"+
		"\u02cc\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d3\u00ab\3\2\2\2\u02d4\u02dd\7>"+
		"\2\2\u02d5\u02d6\7>\2\2\u02d6\u02dd\7?\2\2\u02d7\u02dd\7@\2\2\u02d8\u02d9"+
		"\7@\2\2\u02d9\u02dd\7?\2\2\u02da\u02db\7>\2\2\u02db\u02dd\7@\2\2\u02dc"+
		"\u02d4\3\2\2\2\u02dc\u02d5\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2"+
		"\2\2\u02dc\u02da\3\2\2\2\u02dd\u00ad\3\2\2\2\u02de\u02df\7>\2\2\u02df"+
		"\u02e3\7>\2\2\u02e0\u02e1\7@\2\2\u02e1\u02e3\7@\2\2\u02e2\u02de\3\2\2"+
		"\2\u02e2\u02e0\3\2\2\2\u02e3\u00af\3\2\2\2\u02e4\u02e5\7/\2\2\u02e5\u02e9"+
		"\7/\2\2\u02e6\u02e7\7-\2\2\u02e7\u02e9\7-\2\2\u02e8\u02e4\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u00b1\3\2\2\2\u02ea\u02ec\t\21\2\2\u02eb\u02ea\3"+
		"\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\bY\5\2\u02f0\u00b3\3\2\2\2!\2\3\u00c0\u00c9"+
		"\u00ce\u01de\u01e0\u01ec\u01f3\u0222\u0241\u0259\u025e\u0265\u026b\u0270"+
		"\u0277\u027c\u0287\u0290\u0292\u0299\u02a0\u02a2\u02ab\u02c6\u02d2\u02dc"+
		"\u02e2\u02e8\u02ed";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}