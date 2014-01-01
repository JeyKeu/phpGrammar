// Generated from com/khubla/phpGrammar/PHP.g4 by ANTLR 4.1
package com.khubla.phpGrammar;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class PHPParser extends Parser {
   public static class AdditionContext extends ParserRuleContext {
      public AdditionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Dot() {
         return getTokens(PHPParser.Dot);
      }

      public TerminalNode Dot(int i) {
         return getToken(PHPParser.Dot, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterAddition(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitAddition(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_addition;
      }

      public List<TerminalNode> Minus() {
         return getTokens(PHPParser.Minus);
      }

      public TerminalNode Minus(int i) {
         return getToken(PHPParser.Minus, i);
      }

      public List<MultiplicationContext> multiplication() {
         return getRuleContexts(MultiplicationContext.class);
      }

      public MultiplicationContext multiplication(int i) {
         return getRuleContext(MultiplicationContext.class, i);
      }

      public List<TerminalNode> Plus() {
         return getTokens(PHPParser.Plus);
      }

      public TerminalNode Plus(int i) {
         return getToken(PHPParser.Plus, i);
      }
   }

   public static class ArrayDeclarationContext extends ParserRuleContext {
      public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Array() {
         return getToken(PHPParser.Array, 0);
      }

      public List<ArrayEntryContext> arrayEntry() {
         return getRuleContexts(ArrayEntryContext.class);
      }

      public ArrayEntryContext arrayEntry(int i) {
         return getRuleContext(ArrayEntryContext.class, i);
      }

      public TerminalNode CloseRoundBracket() {
         return getToken(PHPParser.CloseRoundBracket, 0);
      }

      public List<TerminalNode> Comma() {
         return getTokens(PHPParser.Comma);
      }

      public TerminalNode Comma(int i) {
         return getToken(PHPParser.Comma, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterArrayDeclaration(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitArrayDeclaration(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayDeclaration;
      }

      public TerminalNode OpenRoundBracket() {
         return getToken(PHPParser.OpenRoundBracket, 0);
      }
   }

   public static class ArrayEntryContext extends ParserRuleContext {
      public ArrayEntryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterArrayEntry(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitArrayEntry(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayEntry;
      }

      public KeyValuePairContext keyValuePair() {
         return getRuleContext(KeyValuePairContext.class, 0);
      }
   }

   public static class AssignmentContext extends ParserRuleContext {
      public AssignmentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AssignmentContext assignment() {
         return getRuleContext(AssignmentContext.class, 0);
      }

      public TerminalNode AssignmentOperator() {
         return getToken(PHPParser.AssignmentOperator, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterAssignment(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitAssignment(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_assignment;
      }

      public ListVariablesContext listVariables() {
         return getRuleContext(ListVariablesContext.class, 0);
      }

      public TernaryContext ternary() {
         return getRuleContext(TernaryContext.class, 0);
      }
   }

   public static class AtomContext extends ParserRuleContext {
      public AtomContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public ArrayDeclarationContext arrayDeclaration() {
         return getRuleContext(ArrayDeclarationContext.class, 0);
      }

      public BoolContext bool() {
         return getRuleContext(BoolContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterAtom(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitAtom(this);
         }
      }

      public FunctionInvocationContext functionInvocation() {
         return getRuleContext(FunctionInvocationContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_atom;
      }

      public NumberContext number() {
         return getRuleContext(NumberContext.class, 0);
      }

      public StringContext string() {
         return getRuleContext(StringContext.class, 0);
      }
   }

   public static class AtomOrReferenceContext extends ParserRuleContext {
      public AtomOrReferenceContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterAtomOrReference(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitAtomOrReference(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_atomOrReference;
      }

      public ReferenceContext reference() {
         return getRuleContext(ReferenceContext.class, 0);
      }
   }

   public static class BitWiseAndContext extends ParserRuleContext {
      public BitWiseAndContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Ampersand() {
         return getTokens(PHPParser.Ampersand);
      }

      public TerminalNode Ampersand(int i) {
         return getToken(PHPParser.Ampersand, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBitWiseAnd(this);
         }
      }

      public List<EqualityCheckContext> equalityCheck() {
         return getRuleContexts(EqualityCheckContext.class);
      }

      public EqualityCheckContext equalityCheck(int i) {
         return getRuleContext(EqualityCheckContext.class, i);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBitWiseAnd(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_bitWiseAnd;
      }
   }

   public static class BitwiseOrContext extends ParserRuleContext {
      public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<BitWiseAndContext> bitWiseAnd() {
         return getRuleContexts(BitWiseAndContext.class);
      }

      public BitWiseAndContext bitWiseAnd(int i) {
         return getRuleContext(BitWiseAndContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBitwiseOr(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBitwiseOr(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_bitwiseOr;
      }

      public List<TerminalNode> Pipe() {
         return getTokens(PHPParser.Pipe);
      }

      public TerminalNode Pipe(int i) {
         return getToken(PHPParser.Pipe, i);
      }
   }

   public static class BitWiseShiftContext extends ParserRuleContext {
      public BitWiseShiftContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<AdditionContext> addition() {
         return getRuleContexts(AdditionContext.class);
      }

      public AdditionContext addition(int i) {
         return getRuleContext(AdditionContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBitWiseShift(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBitWiseShift(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_bitWiseShift;
      }

      public List<TerminalNode> ShiftOperator() {
         return getTokens(PHPParser.ShiftOperator);
      }

      public TerminalNode ShiftOperator(int i) {
         return getToken(PHPParser.ShiftOperator, i);
      }
   }

   public static class BoolContext extends ParserRuleContext {
      public BoolContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Boolean() {
         return getToken(PHPParser.Boolean, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBool(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBool(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_bool;
      }
   }

   public static class BracketedBlockContext extends ParserRuleContext {
      public BracketedBlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBracketedBlock(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBracketedBlock(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_bracketedBlock;
      }

      public List<StatementContext> statement() {
         return getRuleContexts(StatementContext.class);
      }

      public StatementContext statement(int i) {
         return getRuleContext(StatementContext.class, i);
      }
   }

   public static class BreakStatementContext extends ParserRuleContext {
      public BreakStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Break() {
         return getToken(PHPParser.Break, 0);
      }

      public TerminalNode DecimalNumber() {
         return getToken(PHPParser.DecimalNumber, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterBreakStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitBreakStatement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_breakStatement;
      }
   }

   public static class CasesContext extends ParserRuleContext {
      public CasesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<CasestatementContext> casestatement() {
         return getRuleContexts(CasestatementContext.class);
      }

      public CasestatementContext casestatement(int i) {
         return getRuleContext(CasestatementContext.class, i);
      }

      public DefaultcaseContext defaultcase() {
         return getRuleContext(DefaultcaseContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterCases(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitCases(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_cases;
      }
   }

   public static class CasestatementContext extends ParserRuleContext {
      public CasestatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Case() {
         return getToken(PHPParser.Case, 0);
      }

      public TerminalNode Colon() {
         return getToken(PHPParser.Colon, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterCasestatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitCasestatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_casestatement;
      }

      public List<StatementContext> statement() {
         return getRuleContexts(StatementContext.class);
      }

      public StatementContext statement(int i) {
         return getRuleContext(StatementContext.class, i);
      }
   }

   public static class ClassDefinitionContext extends ParserRuleContext {
      public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Class() {
         return getToken(PHPParser.Class, 0);
      }

      public ClassImplementsContext classImplements() {
         return getRuleContext(ClassImplementsContext.class, 0);
      }

      public List<ClassMemberContext> classMember() {
         return getRuleContexts(ClassMemberContext.class);
      }

      public ClassMemberContext classMember(int i) {
         return getRuleContext(ClassMemberContext.class, i);
      }

      public ClassModifierContext classModifier() {
         return getRuleContext(ClassModifierContext.class, 0);
      }

      public List<ClassNameContext> className() {
         return getRuleContexts(ClassNameContext.class);
      }

      public ClassNameContext className(int i) {
         return getRuleContext(ClassNameContext.class, i);
      }

      public TerminalNode CloseCurlyBracket() {
         return getToken(PHPParser.CloseCurlyBracket, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterClassDefinition(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitClassDefinition(this);
         }
      }

      public TerminalNode Extends() {
         return getToken(PHPParser.Extends, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classDefinition;
      }

      public TerminalNode OpenCurlyBracket() {
         return getToken(PHPParser.OpenCurlyBracket, 0);
      }
   }

   public static class ClassImplementsContext extends ParserRuleContext {
      public ClassImplementsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Comma() {
         return getTokens(PHPParser.Comma);
      }

      public TerminalNode Comma(int i) {
         return getToken(PHPParser.Comma, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterClassImplements(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitClassImplements(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_classImplements;
      }

      public TerminalNode Implements() {
         return getToken(PHPParser.Implements, 0);
      }

      public List<InterfaceNameContext> interfaceName() {
         return getRuleContexts(InterfaceNameContext.class);
      }

      public InterfaceNameContext interfaceName(int i) {
         return getRuleContext(InterfaceNameContext.class, i);
      }
   }

   public static class ClassMemberContext extends ParserRuleContext {
      public ClassMemberContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public BracketedBlockContext bracketedBlock() {
         return getRuleContext(BracketedBlockContext.class, 0);
      }

      public ConstDefinitionContext constDefinition() {
         return getRuleContext(ConstDefinitionContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterClassMember(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitClassMember(this);
         }
      }

      public FieldDefinitionContext fieldDefinition() {
         return getRuleContext(FieldDefinitionContext.class, 0);
      }

      public List<FieldModifierContext> fieldModifier() {
         return getRuleContexts(FieldModifierContext.class);
      }

      public FieldModifierContext fieldModifier(int i) {
         return getRuleContext(FieldModifierContext.class, i);
      }

      public TerminalNode Function() {
         return getToken(PHPParser.Function, 0);
      }

      public FunctionNameContext functionName() {
         return getRuleContext(FunctionNameContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classMember;
      }

      public ParametersDefinitionContext parametersDefinition() {
         return getRuleContext(ParametersDefinitionContext.class, 0);
      }

      public TerminalNode Var() {
         return getToken(PHPParser.Var, 0);
      }
   }

   public static class ClassModifierContext extends ParserRuleContext {
      public ClassModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Abstract() {
         return getToken(PHPParser.Abstract, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterClassModifier(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitClassModifier(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_classModifier;
      }
   }

   public static class ClassNameContext extends ParserRuleContext {
      public ClassNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterClassName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitClassName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_className;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }
   }

   public static class CommaListContext extends ParserRuleContext {
      public CommaListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterCommaList(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitCommaList(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_commaList;
      }
   }

   public static class ComparisionCheckContext extends ParserRuleContext {
      public ComparisionCheckContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<BitWiseShiftContext> bitWiseShift() {
         return getRuleContexts(BitWiseShiftContext.class);
      }

      public BitWiseShiftContext bitWiseShift(int i) {
         return getRuleContext(BitWiseShiftContext.class, i);
      }

      public TerminalNode ComparisionOperator() {
         return getToken(PHPParser.ComparisionOperator, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterComparisionCheck(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitComparisionCheck(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_comparisionCheck;
      }
   }

   public static class ComplexStatementContext extends ParserRuleContext {
      public ComplexStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public DostatementContext dostatement() {
         return getRuleContext(DostatementContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterComplexStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitComplexStatement(this);
         }
      }

      public ForeachstatementContext foreachstatement() {
         return getRuleContext(ForeachstatementContext.class, 0);
      }

      public ForstatementContext forstatement() {
         return getRuleContext(ForstatementContext.class, 0);
      }

      public FunctionDefinitionContext functionDefinition() {
         return getRuleContext(FunctionDefinitionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_complexStatement;
      }

      public IfstatementContext ifstatement() {
         return getRuleContext(IfstatementContext.class, 0);
      }

      public SwitchstatementContext switchstatement() {
         return getRuleContext(SwitchstatementContext.class, 0);
      }

      public WhilestatementContext whilestatement() {
         return getRuleContext(WhilestatementContext.class, 0);
      }
   }

   public static class ConstDefinitionContext extends ParserRuleContext {
      public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      public TerminalNode Const() {
         return getToken(PHPParser.Const, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterConstDefinition(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitConstDefinition(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_constDefinition;
      }

      public VariablenameContext variablename() {
         return getRuleContext(VariablenameContext.class, 0);
      }
   }

   public static class ContinueStatementContext extends ParserRuleContext {
      public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Continue() {
         return getToken(PHPParser.Continue, 0);
      }

      public TerminalNode DecimalNumber() {
         return getToken(PHPParser.DecimalNumber, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterContinueStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitContinueStatement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_continueStatement;
      }
   }

   public static class DefaultcaseContext extends ParserRuleContext {
      public DefaultcaseContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Colon() {
         return getToken(PHPParser.Colon, 0);
      }

      public TerminalNode Default() {
         return getToken(PHPParser.Default, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterDefaultcase(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitDefaultcase(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_defaultcase;
      }

      public List<StatementContext> statement() {
         return getRuleContexts(StatementContext.class);
      }

      public StatementContext statement(int i) {
         return getRuleContext(StatementContext.class, i);
      }
   }

   public static class DostatementContext extends ParserRuleContext {
      public DostatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Do() {
         return getToken(PHPParser.Do, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterDostatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitDostatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_dostatement;
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public TerminalNode While() {
         return getToken(PHPParser.While, 0);
      }
   }

   public static class EqualityCheckContext extends ParserRuleContext {
      public EqualityCheckContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<ComparisionCheckContext> comparisionCheck() {
         return getRuleContexts(ComparisionCheckContext.class);
      }

      public ComparisionCheckContext comparisionCheck(int i) {
         return getRuleContext(ComparisionCheckContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterEqualityCheck(this);
         }
      }

      public TerminalNode EqualityOperator() {
         return getToken(PHPParser.EqualityOperator, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitEqualityCheck(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_equalityCheck;
      }
   }

   public static class ExpressionContext extends ParserRuleContext {
      public ExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitExpression(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_expression;
      }

      public WeakLogicalOrContext weakLogicalOr() {
         return getRuleContext(WeakLogicalOrContext.class, 0);
      }
   }

   public static class FieldDefinitionContext extends ParserRuleContext {
      public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFieldDefinition(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFieldDefinition(this);
         }
      }

      public FieldNameContext fieldName() {
         return getRuleContext(FieldNameContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldDefinition;
      }
   }

   public static class FieldModifierContext extends ParserRuleContext {
      public FieldModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Abstract() {
         return getToken(PHPParser.Abstract, 0);
      }

      public TerminalNode AccessModifier() {
         return getToken(PHPParser.AccessModifier, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFieldModifier(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFieldModifier(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldModifier;
      }

      public TerminalNode Static() {
         return getToken(PHPParser.Static, 0);
      }
   }

   public static class FieldNameContext extends ParserRuleContext {
      public FieldNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Dollar() {
         return getToken(PHPParser.Dollar, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFieldName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFieldName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldName;
      }

      public VariablenameContext variablename() {
         return getRuleContext(VariablenameContext.class, 0);
      }
   }

   public static class ForeachstatementContext extends ParserRuleContext {
      public ForeachstatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public ArrayEntryContext arrayEntry() {
         return getRuleContext(ArrayEntryContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterForeachstatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitForeachstatement(this);
         }
      }

      public TerminalNode Foreach() {
         return getToken(PHPParser.Foreach, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_foreachstatement;
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public VariableContext variable() {
         return getRuleContext(VariableContext.class, 0);
      }
   }

   public static class ForstatementContext extends ParserRuleContext {
      public ForstatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterForstatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitForstatement(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      public TerminalNode For() {
         return getToken(PHPParser.For, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forstatement;
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }
   }

   public static class FunctionDefinitionContext extends ParserRuleContext {
      public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public BracketedBlockContext bracketedBlock() {
         return getRuleContext(BracketedBlockContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFunctionDefinition(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFunctionDefinition(this);
         }
      }

      public TerminalNode Function() {
         return getToken(PHPParser.Function, 0);
      }

      public FunctionNameContext functionName() {
         return getRuleContext(FunctionNameContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_functionDefinition;
      }

      public ParametersDefinitionContext parametersDefinition() {
         return getRuleContext(ParametersDefinitionContext.class, 0);
      }
   }

   public static class FunctionInvocationContext extends ParserRuleContext {
      public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFunctionInvocation(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFunctionInvocation(this);
         }
      }

      public FunctionInvocationParametersContext functionInvocationParameters() {
         return getRuleContext(FunctionInvocationParametersContext.class, 0);
      }

      public FunctionNameContext functionName() {
         return getRuleContext(FunctionNameContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_functionInvocation;
      }
   }

   public static class FunctionInvocationParametersContext extends ParserRuleContext {
      public FunctionInvocationParametersContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CloseRoundBracket() {
         return getToken(PHPParser.CloseRoundBracket, 0);
      }

      public CommaListContext commaList() {
         return getRuleContext(CommaListContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFunctionInvocationParameters(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFunctionInvocationParameters(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_functionInvocationParameters;
      }

      public TerminalNode OpenRoundBracket() {
         return getToken(PHPParser.OpenRoundBracket, 0);
      }
   }

   public static class FunctionNameContext extends ParserRuleContext {
      public FunctionNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterFunctionName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitFunctionName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_functionName;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }
   }

   public static class GlobalStatementContext extends ParserRuleContext {
      public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Comma() {
         return getTokens(PHPParser.Comma);
      }

      public TerminalNode Comma(int i) {
         return getToken(PHPParser.Comma, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterGlobalStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitGlobalStatement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_globalStatement;
      }

      public TerminalNode Global() {
         return getToken(PHPParser.Global, 0);
      }

      public List<NameContext> name() {
         return getRuleContexts(NameContext.class);
      }

      public NameContext name(int i) {
         return getRuleContext(NameContext.class, i);
      }
   }

   public static class IfstatementContext extends ParserRuleContext {
      public IfstatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Else() {
         return getToken(PHPParser.Else, 0);
      }

      public List<TerminalNode> ElseIf() {
         return getTokens(PHPParser.ElseIf);
      }

      public TerminalNode ElseIf(int i) {
         return getToken(PHPParser.ElseIf, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterIfstatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitIfstatement(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifstatement;
      }

      public TerminalNode If() {
         return getToken(PHPParser.If, 0);
      }

      public List<StatementContext> statement() {
         return getRuleContexts(StatementContext.class);
      }

      public StatementContext statement(int i) {
         return getRuleContext(StatementContext.class, i);
      }
   }

   public static class IncrementContext extends ParserRuleContext {
      public IncrementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterIncrement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitIncrement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_increment;
      }

      public TerminalNode IncrementOperator() {
         return getToken(PHPParser.IncrementOperator, 0);
      }

      public NameContext name() {
         return getRuleContext(NameContext.class, 0);
      }

      public NewOrCloneContext newOrClone() {
         return getRuleContext(NewOrCloneContext.class, 0);
      }
   }

   public static class InstanceOfContext extends ParserRuleContext {
      public InstanceOfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInstanceOf(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInstanceOf(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_instanceOf;
      }

      public TerminalNode Instanceof() {
         return getToken(PHPParser.Instanceof, 0);
      }

      public List<NegateOrCastContext> negateOrCast() {
         return getRuleContexts(NegateOrCastContext.class);
      }

      public NegateOrCastContext negateOrCast(int i) {
         return getRuleContext(NegateOrCastContext.class, i);
      }
   }

   public static class IntegerContext extends ParserRuleContext {
      public IntegerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode DecimalNumber() {
         return getToken(PHPParser.DecimalNumber, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInteger(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInteger(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_integer;
      }

      public TerminalNode HexNumber() {
         return getToken(PHPParser.HexNumber, 0);
      }

      public TerminalNode OctalNumber() {
         return getToken(PHPParser.OctalNumber, 0);
      }
   }

   public static class InterfaceDefinitionContext extends ParserRuleContext {
      public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CloseCurlyBracket() {
         return getToken(PHPParser.CloseCurlyBracket, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInterfaceDefinition(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInterfaceDefinition(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceDefinition;
      }

      public TerminalNode Interface() {
         return getToken(PHPParser.Interface, 0);
      }

      public InterfaceExtendsContext interfaceExtends() {
         return getRuleContext(InterfaceExtendsContext.class, 0);
      }

      public List<InterfaceMemberContext> interfaceMember() {
         return getRuleContexts(InterfaceMemberContext.class);
      }

      public InterfaceMemberContext interfaceMember(int i) {
         return getRuleContext(InterfaceMemberContext.class, i);
      }

      public InterfaceNameContext interfaceName() {
         return getRuleContext(InterfaceNameContext.class, 0);
      }

      public TerminalNode OpenCurlyBracket() {
         return getToken(PHPParser.OpenCurlyBracket, 0);
      }
   }

   public static class InterfaceExtendsContext extends ParserRuleContext {
      public InterfaceExtendsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Comma() {
         return getTokens(PHPParser.Comma);
      }

      public TerminalNode Comma(int i) {
         return getToken(PHPParser.Comma, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInterfaceExtends(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInterfaceExtends(this);
         }
      }

      public TerminalNode Extends() {
         return getToken(PHPParser.Extends, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceExtends;
      }

      public List<InterfaceNameContext> interfaceName() {
         return getRuleContexts(InterfaceNameContext.class);
      }

      public InterfaceNameContext interfaceName(int i) {
         return getRuleContext(InterfaceNameContext.class, i);
      }
   }

   public static class InterfaceMemberContext extends ParserRuleContext {
      public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      public TerminalNode Const() {
         return getToken(PHPParser.Const, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInterfaceMember(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInterfaceMember(this);
         }
      }

      public List<FieldModifierContext> fieldModifier() {
         return getRuleContexts(FieldModifierContext.class);
      }

      public FieldModifierContext fieldModifier(int i) {
         return getRuleContext(FieldModifierContext.class, i);
      }

      public TerminalNode Function() {
         return getToken(PHPParser.Function, 0);
      }

      public FunctionNameContext functionName() {
         return getRuleContext(FunctionNameContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceMember;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }

      public ParametersDefinitionContext parametersDefinition() {
         return getRuleContext(ParametersDefinitionContext.class, 0);
      }
   }

   public static class InterfaceNameContext extends ParserRuleContext {
      public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterInterfaceName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitInterfaceName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceName;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }
   }

   public static class KeyValuePairContext extends ParserRuleContext {
      public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ArrayAssign() {
         return getToken(PHPParser.ArrayAssign, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterKeyValuePair(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitKeyValuePair(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_keyValuePair;
      }
   }

   public static class ListVariablesContext extends ParserRuleContext {
      public ListVariablesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CloseRoundBracket() {
         return getToken(PHPParser.CloseRoundBracket, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterListVariables(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitListVariables(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_listVariables;
      }

      public TerminalNode List() {
         return getToken(PHPParser.List, 0);
      }

      public List<NameContext> name() {
         return getRuleContexts(NameContext.class);
      }

      public NameContext name(int i) {
         return getRuleContext(NameContext.class, i);
      }

      public TerminalNode OpenRoundBracket() {
         return getToken(PHPParser.OpenRoundBracket, 0);
      }
   }

   public static class LogicalAndContext extends ParserRuleContext {
      public LogicalAndContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<BitwiseOrContext> bitwiseOr() {
         return getRuleContexts(BitwiseOrContext.class);
      }

      public BitwiseOrContext bitwiseOr(int i) {
         return getRuleContext(BitwiseOrContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterLogicalAnd(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitLogicalAnd(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_logicalAnd;
      }

      public List<TerminalNode> LogicalAnd() {
         return getTokens(PHPParser.LogicalAnd);
      }

      public TerminalNode LogicalAnd(int i) {
         return getToken(PHPParser.LogicalAnd, i);
      }
   }

   public static class LogicalNotContext extends ParserRuleContext {
      public LogicalNotContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Bang() {
         return getToken(PHPParser.Bang, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterLogicalNot(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitLogicalNot(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_logicalNot;
      }

      public InstanceOfContext instanceOf() {
         return getRuleContext(InstanceOfContext.class, 0);
      }

      public LogicalNotContext logicalNot() {
         return getRuleContext(LogicalNotContext.class, 0);
      }
   }

   public static class LogicalOrContext extends ParserRuleContext {
      public LogicalOrContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterLogicalOr(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitLogicalOr(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_logicalOr;
      }

      public List<LogicalAndContext> logicalAnd() {
         return getRuleContexts(LogicalAndContext.class);
      }

      public LogicalAndContext logicalAnd(int i) {
         return getRuleContext(LogicalAndContext.class, i);
      }

      public List<TerminalNode> LogicalOr() {
         return getTokens(PHPParser.LogicalOr);
      }

      public TerminalNode LogicalOr(int i) {
         return getToken(PHPParser.LogicalOr, i);
      }
   }

   public static class MemberAccessContext extends ParserRuleContext {
      public MemberAccessContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> CloseSquareBracket() {
         return getTokens(PHPParser.CloseSquareBracket);
      }

      public TerminalNode CloseSquareBracket(int i) {
         return getToken(PHPParser.CloseSquareBracket, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterMemberAccess(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitMemberAccess(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_memberAccess;
      }

      public List<TerminalNode> OpenSquareBracket() {
         return getTokens(PHPParser.OpenSquareBracket);
      }

      public TerminalNode OpenSquareBracket(int i) {
         return getToken(PHPParser.OpenSquareBracket, i);
      }

      public VariableContext variable() {
         return getRuleContext(VariableContext.class, 0);
      }
   }

   public static class MultiplicationContext extends ParserRuleContext {
      public MultiplicationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> Asterisk() {
         return getTokens(PHPParser.Asterisk);
      }

      public TerminalNode Asterisk(int i) {
         return getToken(PHPParser.Asterisk, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterMultiplication(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitMultiplication(this);
         }
      }

      public List<TerminalNode> Forwardslash() {
         return getTokens(PHPParser.Forwardslash);
      }

      public TerminalNode Forwardslash(int i) {
         return getToken(PHPParser.Forwardslash, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_multiplication;
      }

      public List<LogicalNotContext> logicalNot() {
         return getRuleContexts(LogicalNotContext.class);
      }

      public LogicalNotContext logicalNot(int i) {
         return getRuleContext(LogicalNotContext.class, i);
      }

      public List<TerminalNode> Percent() {
         return getTokens(PHPParser.Percent);
      }

      public TerminalNode Percent(int i) {
         return getToken(PHPParser.Percent, i);
      }
   }

   public static class NameContext extends ParserRuleContext {
      public NameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_name;
      }

      public MemberAccessContext memberAccess() {
         return getRuleContext(MemberAccessContext.class, 0);
      }

      public StaticMemberAccessContext staticMemberAccess() {
         return getRuleContext(StaticMemberAccessContext.class, 0);
      }

      public VariableContext variable() {
         return getRuleContext(VariableContext.class, 0);
      }
   }

   public static class NegateOrCastContext extends ParserRuleContext {
      public NegateOrCastContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CloseRoundBracket() {
         return getToken(PHPParser.CloseRoundBracket, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterNegateOrCast(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitNegateOrCast(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_negateOrCast;
      }

      public IncrementContext increment() {
         return getRuleContext(IncrementContext.class, 0);
      }

      public TerminalNode Minus() {
         return getToken(PHPParser.Minus, 0);
      }

      public TerminalNode OpenRoundBracket() {
         return getToken(PHPParser.OpenRoundBracket, 0);
      }

      public TerminalNode PrimitiveType() {
         return getToken(PHPParser.PrimitiveType, 0);
      }

      public TerminalNode SuppressWarnings() {
         return getToken(PHPParser.SuppressWarnings, 0);
      }

      public TerminalNode Tilde() {
         return getToken(PHPParser.Tilde, 0);
      }

      public WeakLogicalAndContext weakLogicalAnd() {
         return getRuleContext(WeakLogicalAndContext.class, 0);
      }
   }

   public static class NewOrCloneContext extends ParserRuleContext {
      public NewOrCloneContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomOrReferenceContext atomOrReference() {
         return getRuleContext(AtomOrReferenceContext.class, 0);
      }

      public TerminalNode Clone() {
         return getToken(PHPParser.Clone, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterNewOrClone(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitNewOrClone(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_newOrClone;
      }

      public NameContext name() {
         return getRuleContext(NameContext.class, 0);
      }

      public TerminalNode New() {
         return getToken(PHPParser.New, 0);
      }
   }

   public static class NumberContext extends ParserRuleContext {
      public NumberContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterNumber(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitNumber(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_number;
      }

      public IntegerContext integer() {
         return getRuleContext(IntegerContext.class, 0);
      }

      public RealContext real() {
         return getRuleContext(RealContext.class, 0);
      }
   }

   public static class ParamDefContext extends ParserRuleContext {
      public ParamDefContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterParamDef(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitParamDef(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_paramDef;
      }

      public ParamNameContext paramName() {
         return getRuleContext(ParamNameContext.class, 0);
      }
   }

   public static class ParametersDefinitionContext extends ParserRuleContext {
      public ParametersDefinitionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CloseRoundBracket() {
         return getToken(PHPParser.CloseRoundBracket, 0);
      }

      public List<TerminalNode> Comma() {
         return getTokens(PHPParser.Comma);
      }

      public TerminalNode Comma(int i) {
         return getToken(PHPParser.Comma, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterParametersDefinition(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitParametersDefinition(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_parametersDefinition;
      }

      public TerminalNode OpenRoundBracket() {
         return getToken(PHPParser.OpenRoundBracket, 0);
      }

      public List<ParamDefContext> paramDef() {
         return getRuleContexts(ParamDefContext.class);
      }

      public ParamDefContext paramDef(int i) {
         return getRuleContext(ParamDefContext.class, i);
      }
   }

   public static class ParamNameContext extends ParserRuleContext {
      public ParamNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Ampersand() {
         return getToken(PHPParser.Ampersand, 0);
      }

      public TerminalNode Dollar() {
         return getToken(PHPParser.Dollar, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterParamName(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitParamName(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_paramName;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }
   }

   public static class ProgContext extends ParserRuleContext {
      public ProgContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterProg(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitProg(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_prog;
      }

      public List<StatementContext> statement() {
         return getRuleContexts(StatementContext.class);
      }

      public StatementContext statement(int i) {
         return getRuleContext(StatementContext.class, i);
      }
   }

   public static class RealContext extends ParserRuleContext {
      public RealContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> DecimalNumber() {
         return getTokens(PHPParser.DecimalNumber);
      }

      public TerminalNode DecimalNumber(int i) {
         return getToken(PHPParser.DecimalNumber, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterReal(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitReal(this);
         }
      }

      public List<TerminalNode> Float() {
         return getTokens(PHPParser.Float);
      }

      public TerminalNode Float(int i) {
         return getToken(PHPParser.Float, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_real;
      }

      public List<TerminalNode> RealE() {
         return getTokens(PHPParser.RealE);
      }

      public TerminalNode RealE(int i) {
         return getToken(PHPParser.RealE, i);
      }
   }

   public static class ReferenceContext extends ParserRuleContext {
      public ReferenceContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Ampersand() {
         return getToken(PHPParser.Ampersand, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterReference(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitReference(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_reference;
      }

      public NameContext name() {
         return getRuleContext(NameContext.class, 0);
      }
   }

   public static class RequireStatementContext extends ParserRuleContext {
      public RequireStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterRequireStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitRequireStatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_requireStatement;
      }

      public TerminalNode RequireOperator() {
         return getToken(PHPParser.RequireOperator, 0);
      }
   }

   public static class ReturnStatementContext extends ParserRuleContext {
      public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterReturnStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitReturnStatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_returnStatement;
      }

      public TerminalNode Return() {
         return getToken(PHPParser.Return, 0);
      }
   }

   public static class SimpleStatementContext extends ParserRuleContext {
      public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public BreakStatementContext breakStatement() {
         return getRuleContext(BreakStatementContext.class, 0);
      }

      public ContinueStatementContext continueStatement() {
         return getRuleContext(ContinueStatementContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterSimpleStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitSimpleStatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_simpleStatement;
      }

      public GlobalStatementContext globalStatement() {
         return getRuleContext(GlobalStatementContext.class, 0);
      }

      public RequireStatementContext requireStatement() {
         return getRuleContext(RequireStatementContext.class, 0);
      }

      public ReturnStatementContext returnStatement() {
         return getRuleContext(ReturnStatementContext.class, 0);
      }

      public StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() {
         return getRuleContext(StaticVariableAssignmentStatementContext.class, 0);
      }
   }

   public static class SinglelinecommentContext extends ParserRuleContext {
      public SinglelinecommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterSinglelinecomment(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitSinglelinecomment(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_singlelinecomment;
      }

      public TerminalNode SinglelineComment() {
         return getToken(PHPParser.SinglelineComment, 0);
      }
   }

   public static class StatementContext extends ParserRuleContext {
      public StatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public BracketedBlockContext bracketedBlock() {
         return getRuleContext(BracketedBlockContext.class, 0);
      }

      public ClassDefinitionContext classDefinition() {
         return getRuleContext(ClassDefinitionContext.class, 0);
      }

      public ComplexStatementContext complexStatement() {
         return getRuleContext(ComplexStatementContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitStatement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_statement;
      }

      public InterfaceDefinitionContext interfaceDefinition() {
         return getRuleContext(InterfaceDefinitionContext.class, 0);
      }

      public SimpleStatementContext simpleStatement() {
         return getRuleContext(SimpleStatementContext.class, 0);
      }

      public SinglelinecommentContext singlelinecomment() {
         return getRuleContext(SinglelinecommentContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }
   }

   public static class StaticMemberAccessContext extends ParserRuleContext {
      public StaticMemberAccessContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ClassMember() {
         return getToken(PHPParser.ClassMember, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterStaticMemberAccess(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitStaticMemberAccess(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_staticMemberAccess;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }

      public VariableContext variable() {
         return getRuleContext(VariableContext.class, 0);
      }
   }

   public static class StaticVariableAssignmentStatementContext extends ParserRuleContext {
      public StaticVariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterStaticVariableAssignmentStatement(this);
         }
      }

      public TerminalNode Equals() {
         return getToken(PHPParser.Equals, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitStaticVariableAssignmentStatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_staticVariableAssignmentStatement;
      }

      public TerminalNode Static() {
         return getToken(PHPParser.Static, 0);
      }

      public VariableContext variable() {
         return getRuleContext(VariableContext.class, 0);
      }
   }

   public static class StringContext extends ParserRuleContext {
      public StringContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode DoubleQuotedString() {
         return getToken(PHPParser.DoubleQuotedString, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterString(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitString(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_string;
      }

      public TerminalNode SingleQuotedString() {
         return getToken(PHPParser.SingleQuotedString, 0);
      }
   }

   public static class SwitchstatementContext extends ParserRuleContext {
      public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public CasesContext cases() {
         return getRuleContext(CasesContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterSwitchstatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitSwitchstatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchstatement;
      }

      public TerminalNode Switch() {
         return getToken(PHPParser.Switch, 0);
      }
   }

   public static class TernaryContext extends ParserRuleContext {
      public TernaryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Colon() {
         return getToken(PHPParser.Colon, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterTernary(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitTernary(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ternary;
      }

      public LogicalOrContext logicalOr() {
         return getRuleContext(LogicalOrContext.class, 0);
      }

      public TerminalNode QuestionMark() {
         return getToken(PHPParser.QuestionMark, 0);
      }
   }

   public static class VariableContext extends ParserRuleContext {
      public VariableContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode Dollar() {
         return getToken(PHPParser.Dollar, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterVariable(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitVariable(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_variable;
      }

      public TerminalNode InstanceMember() {
         return getToken(PHPParser.InstanceMember, 0);
      }

      public List<VariablenameContext> variablename() {
         return getRuleContexts(VariablenameContext.class);
      }

      public VariablenameContext variablename(int i) {
         return getRuleContext(VariablenameContext.class, i);
      }
   }

   public static class VariablenameContext extends ParserRuleContext {
      public VariablenameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterVariablename(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitVariablename(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_variablename;
      }

      public TerminalNode Identifier() {
         return getToken(PHPParser.Identifier, 0);
      }
   }

   public static class WeakLogicalAndContext extends ParserRuleContext {
      public WeakLogicalAndContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> And() {
         return getTokens(PHPParser.And);
      }

      public TerminalNode And(int i) {
         return getToken(PHPParser.And, i);
      }

      public List<AssignmentContext> assignment() {
         return getRuleContexts(AssignmentContext.class);
      }

      public AssignmentContext assignment(int i) {
         return getRuleContext(AssignmentContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterWeakLogicalAnd(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitWeakLogicalAnd(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_weakLogicalAnd;
      }
   }

   public static class WeakLogicalOrContext extends ParserRuleContext {
      public WeakLogicalOrContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterWeakLogicalOr(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitWeakLogicalOr(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_weakLogicalOr;
      }

      public List<TerminalNode> Or() {
         return getTokens(PHPParser.Or);
      }

      public TerminalNode Or(int i) {
         return getToken(PHPParser.Or, i);
      }

      public List<WeakLogicalXorContext> weakLogicalXor() {
         return getRuleContexts(WeakLogicalXorContext.class);
      }

      public WeakLogicalXorContext weakLogicalXor(int i) {
         return getRuleContext(WeakLogicalXorContext.class, i);
      }
   }

   public static class WeakLogicalXorContext extends ParserRuleContext {
      public WeakLogicalXorContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterWeakLogicalXor(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitWeakLogicalXor(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_weakLogicalXor;
      }

      public List<WeakLogicalAndContext> weakLogicalAnd() {
         return getRuleContexts(WeakLogicalAndContext.class);
      }

      public WeakLogicalAndContext weakLogicalAnd(int i) {
         return getRuleContext(WeakLogicalAndContext.class, i);
      }

      public List<TerminalNode> Xor() {
         return getTokens(PHPParser.Xor);
      }

      public TerminalNode Xor(int i) {
         return getToken(PHPParser.Xor, i);
      }
   }

   public static class WhilestatementContext extends ParserRuleContext {
      public WhilestatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).enterWhilestatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PHPListener) {
            ((PHPListener) listener).exitWhilestatement(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_whilestatement;
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public TerminalNode While() {
         return getToken(PHPParser.While, 0);
      }
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int RealE = 1, As = 2, SemiColon = 3, Instanceof = 4, And = 5, List = 6, Const = 7, Or = 8, Xor = 9, Global = 10, Continue = 11, Return = 12, Implements = 13, Var = 14,
         Class = 15, Extends = 16, Do = 17, Switch = 18, Case = 19, Default = 20, Function = 21, Break = 22, If = 23, Else = 24, ElseIf = 25, For = 26, Foreach = 27, While = 28, Equals = 29,
         New = 30, Clone = 31, Ampersand = 32, Pipe = 33, Bang = 34, Plus = 35, Minus = 36, Asterisk = 37, Percent = 38, Forwardslash = 39, Tilde = 40, InstanceMember = 41, SuppressWarnings = 42,
         Dollar = 43, Dot = 44, ArrayAssign = 45, LogicalOr = 46, LogicalAnd = 47, ClassMember = 48, QuestionMark = 49, OpenRoundBracket = 50, CloseRoundBracket = 51, OpenSquareBracket = 52,
         CloseSquareBracket = 53, OpenCurlyBracket = 54, CloseCurlyBracket = 55, Interface = 56, Comma = 57, Colon = 58, Abstract = 59, Static = 60, MultilineComment = 61, SinglelineComment = 62,
         UnixComment = 63, Array = 64, RequireOperator = 65, PrimitiveType = 66, AccessModifier = 67, DecimalNumber = 68, HexNumber = 69, OctalNumber = 70, Float = 71, Digits = 72, Boolean = 73,
         SingleQuotedString = 74, EscapeCharacter = 75, DoubleQuotedString = 76, Identifier = 77, AssignmentOperator = 78, EqualityOperator = 79, ComparisionOperator = 80, ShiftOperator = 81,
         IncrementOperator = 82, WS = 83;
   public static final String[] tokenNames = { "<INVALID>", "RealE", "'as'", "';'", "'instanceof'", "'and'", "'list'", "'const'", "'or'", "'xor'", "'global'", "'continue'", "'return'",
         "'implements'", "'var'", "'class'", "'extends'", "'do'", "'switch'", "'case'", "'default'", "'function'", "'break'", "'if'", "'else'", "'elseif'", "'for'", "'foreach'", "'while'", "'='",
         "'new'", "'clone'", "'&'", "'|'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'~'", "'->'", "'@'", "'$'", "'.'", "'=>'", "'||'", "'&&'", "'::'", "'?'", "'('", "')'", "'['", "']'", "'{'",
         "'}'", "'Interface'", "','", "':'", "'abstract'", "'static'", "MultilineComment", "SinglelineComment", "UnixComment", "Array", "RequireOperator", "PrimitiveType", "AccessModifier",
         "DecimalNumber", "HexNumber", "OctalNumber", "Float", "Digits", "Boolean", "SingleQuotedString", "EscapeCharacter", "DoubleQuotedString", "Identifier", "AssignmentOperator",
         "EqualityOperator", "ComparisionOperator", "ShiftOperator", "IncrementOperator", "WS" };
   public static final int RULE_prog = 0, RULE_statement = 1, RULE_complexStatement = 2, RULE_forstatement = 3, RULE_ifstatement = 4, RULE_foreachstatement = 5, RULE_whilestatement = 6,
         RULE_dostatement = 7, RULE_switchstatement = 8, RULE_simpleStatement = 9, RULE_globalStatement = 10, RULE_staticVariableAssignmentStatement = 11, RULE_breakStatement = 12,
         RULE_continueStatement = 13, RULE_returnStatement = 14, RULE_requireStatement = 15, RULE_cases = 16, RULE_casestatement = 17, RULE_defaultcase = 18, RULE_singlelinecomment = 19,
         RULE_variable = 20, RULE_variablename = 21, RULE_name = 22, RULE_staticMemberAccess = 23, RULE_memberAccess = 24, RULE_bracketedBlock = 25, RULE_interfaceDefinition = 26,
         RULE_interfaceName = 27, RULE_interfaceExtends = 28, RULE_interfaceMember = 29, RULE_className = 30, RULE_classDefinition = 31, RULE_classImplements = 32, RULE_classMember = 33,
         RULE_classModifier = 34, RULE_constDefinition = 35, RULE_fieldDefinition = 36, RULE_fieldModifier = 37, RULE_fieldName = 38, RULE_functionDefinition = 39, RULE_parametersDefinition = 40,
         RULE_functionInvocation = 41, RULE_functionName = 42, RULE_functionInvocationParameters = 43, RULE_paramDef = 44, RULE_paramName = 45, RULE_commaList = 46, RULE_expression = 47,
         RULE_weakLogicalOr = 48, RULE_weakLogicalXor = 49, RULE_weakLogicalAnd = 50, RULE_assignment = 51, RULE_listVariables = 52, RULE_ternary = 53, RULE_logicalOr = 54, RULE_logicalAnd = 55,
         RULE_bitwiseOr = 56, RULE_bitWiseAnd = 57, RULE_equalityCheck = 58, RULE_comparisionCheck = 59, RULE_bitWiseShift = 60, RULE_addition = 61, RULE_multiplication = 62, RULE_logicalNot = 63,
         RULE_instanceOf = 64, RULE_negateOrCast = 65, RULE_increment = 66, RULE_newOrClone = 67, RULE_atomOrReference = 68, RULE_arrayDeclaration = 69, RULE_arrayEntry = 70, RULE_keyValuePair = 71,
         RULE_atom = 72, RULE_reference = 73, RULE_bool = 74, RULE_number = 75, RULE_integer = 76, RULE_real = 77, RULE_string = 78;
   public static final String[] ruleNames = { "prog", "statement", "complexStatement", "forstatement", "ifstatement", "foreachstatement", "whilestatement", "dostatement", "switchstatement",
         "simpleStatement", "globalStatement", "staticVariableAssignmentStatement", "breakStatement", "continueStatement", "returnStatement", "requireStatement", "cases", "casestatement",
         "defaultcase", "singlelinecomment", "variable", "variablename", "name", "staticMemberAccess", "memberAccess", "bracketedBlock", "interfaceDefinition", "interfaceName", "interfaceExtends",
         "interfaceMember", "className", "classDefinition", "classImplements", "classMember", "classModifier", "constDefinition", "fieldDefinition", "fieldModifier", "fieldName",
         "functionDefinition", "parametersDefinition", "functionInvocation", "functionName", "functionInvocationParameters", "paramDef", "paramName", "commaList", "expression", "weakLogicalOr",
         "weakLogicalXor", "weakLogicalAnd", "assignment", "listVariables", "ternary", "logicalOr", "logicalAnd", "bitwiseOr", "bitWiseAnd", "equalityCheck", "comparisionCheck", "bitWiseShift",
         "addition", "multiplication", "logicalNot", "instanceOf", "negateOrCast", "increment", "newOrClone", "atomOrReference", "arrayDeclaration", "arrayEntry", "keyValuePair", "atom", "reference",
         "bool", "number", "integer", "real", "string" };
   public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3U\u02ee\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
         + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
         + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
         + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
         + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\7\2\u00a2\n\2\f\2\16"
         + "\2\u00a5\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b3" + "\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00bc\n\4\3\5\3\5\3\5\3\5\3\5\3\5"
         + "\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00d2\n\6" + "\f\6\16\6\u00d5\13\6\3\6\3\6\5\6\u00d9\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"
         + "\3\7\3\b\3\b\3\b\5\b\u00e6\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t" + "\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"
         + "\5\13\u0102\n\13\3\f\3\f\3\f\3\f\7\f\u0108\n\f\f\f\16\f\u010b\13\f\3\r" + "\5\r\u010e\n\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0116\n\16\3\17\3\17\5\17"
         + "\u011a\n\17\3\20\3\20\5\20\u011e\n\20\3\21\3\21\3\21\3\22\7\22\u0124\n" + "\22\f\22\16\22\u0127\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u012f\n"
         + "\23\f\23\16\23\u0132\13\23\3\24\3\24\3\24\7\24\u0137\n\24\f\24\16\24\u013a" + "\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0145\n\26\3"
         + "\27\3\27\3\30\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\3\32\3\32" + "\3\32\3\32\3\32\7\32\u0157\n\32\f\32\16\32\u015a\13\32\3\33\3\33\7\33"
         + "\u015e\n\33\f\33\16\33\u0161\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u0168" + "\n\34\3\34\3\34\7\34\u016c\n\34\f\34\16\34\u016f\13\34\3\34\3\34\3\35"
         + "\3\35\3\36\3\36\3\36\3\36\7\36\u0179\n\36\f\36\16\36\u017c\13\36\3\37" + "\3\37\3\37\3\37\5\37\u0182\n\37\3\37\3\37\7\37\u0186\n\37\f\37\16\37\u0189"
         + "\13\37\3\37\3\37\3\37\3\37\3\37\5\37\u0190\n\37\3 \3 \3!\5!\u0195\n!\3" + "!\3!\3!\3!\5!\u019b\n!\3!\5!\u019e\n!\3!\3!\7!\u01a2\n!\f!\16!\u01a5\13"
         + "!\3!\3!\3\"\3\"\3\"\3\"\7\"\u01ad\n\"\f\"\16\"\u01b0\13\"\3#\7#\u01b3" + "\n#\f#\16#\u01b6\13#\3#\3#\3#\3#\3#\5#\u01bd\n#\3#\3#\3#\3#\5#\u01c3\n"
         + "#\3#\7#\u01c6\n#\f#\16#\u01c9\13#\3#\3#\3#\5#\u01ce\n#\3$\3$\3%\3%\3%" + "\3%\3%\3&\3&\3&\5&\u01da\n&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3"
         + "*\7*\u01ea\n*\f*\16*\u01ed\13*\5*\u01ef\n*\3*\3*\3+\3+\3+\3,\3,\3-\5-" + "\u01f9\n-\3-\5-\u01fc\n-\3-\5-\u01ff\n-\3.\3.\3.\5.\u0204\n.\3/\3/\3/"
         + "\3/\3/\5/\u020b\n/\3\60\3\60\3\60\7\60\u0210\n\60\f\60\16\60\u0213\13" + "\60\3\61\3\61\3\62\3\62\3\62\7\62\u021a\n\62\f\62\16\62\u021d\13\62\3"
         + "\63\3\63\3\63\7\63\u0222\n\63\f\63\16\63\u0225\13\63\3\64\3\64\3\64\7" + "\64\u022a\n\64\f\64\16\64\u022d\13\64\3\65\3\65\3\65\3\65\3\65\5\65\u0234"
         + "\n\65\3\66\3\66\3\66\3\66\3\66\7\66\u023b\n\66\f\66\16\66\u023e\13\66" + "\3\66\3\66\3\66\5\66\u0243\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"
         + "\u024c\n\67\38\38\38\78\u0251\n8\f8\168\u0254\138\39\39\39\79\u0259\n" + "9\f9\169\u025c\139\3:\3:\3:\7:\u0261\n:\f:\16:\u0264\13:\3;\3;\3;\7;\u0269"
         + "\n;\f;\16;\u026c\13;\3<\3<\3<\5<\u0271\n<\3=\3=\3=\5=\u0276\n=\3>\3>\3" + ">\7>\u027b\n>\f>\16>\u027e\13>\3?\3?\3?\7?\u0283\n?\f?\16?\u0286\13?\3"
         + "@\3@\3@\7@\u028b\n@\f@\16@\u028e\13@\3A\3A\3A\5A\u0293\nA\3B\3B\3B\5B" + "\u0298\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u02a5\nC\3D\3D\3D\3D\3D"
         + "\3D\5D\u02ad\nD\3E\3E\3E\3E\3E\5E\u02b4\nE\3F\3F\5F\u02b8\nF\3G\3G\3G" + "\3G\3G\7G\u02bf\nG\fG\16G\u02c2\13G\5G\u02c4\nG\3G\3G\3H\3H\5H\u02ca\n"
         + "H\3I\3I\3I\3I\3J\3J\3J\3J\3J\5J\u02d5\nJ\3K\3K\3K\5K\u02da\nK\3L\3L\3" + "M\3M\5M\u02e0\nM\3N\3N\3O\3O\3O\7O\u02e7\nO\fO\16O\u02ea\13O\3P\3P\3P"
         + "\2Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B" + "DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"
         + "\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\n\4\2=>EE\4\2" + "\37\37PP\4\2%&..\3\2\')\5\2&&**,,\3\2FH\4\2FFII\4\2LLNN\u02ff\2\u00a3"
         + "\3\2\2\2\4\u00b2\3\2\2\2\6\u00bb\3\2\2\2\b\u00bd\3\2\2\2\n\u00c7\3\2\2" + "\2\f\u00da\3\2\2\2\16\u00e2\3\2\2\2\20\u00ea\3\2\2\2\22\u00f2\3\2\2\2"
         + "\24\u0101\3\2\2\2\26\u0103\3\2\2\2\30\u010d\3\2\2\2\32\u0113\3\2\2\2\34" + "\u0117\3\2\2\2\36\u011b\3\2\2\2 \u011f\3\2\2\2\"\u0125\3\2\2\2$\u012a"
         + "\3\2\2\2&\u0133\3\2\2\2(\u013b\3\2\2\2*\u0144\3\2\2\2,\u0146\3\2\2\2." + "\u014b\3\2\2\2\60\u014d\3\2\2\2\62\u0151\3\2\2\2\64\u015b\3\2\2\2\66\u0164"
         + "\3\2\2\28\u0172\3\2\2\2:\u0174\3\2\2\2<\u018f\3\2\2\2>\u0191\3\2\2\2@" + "\u0194\3\2\2\2B\u01a8\3\2\2\2D\u01cd\3\2\2\2F\u01cf\3\2\2\2H\u01d1\3\2"
         + "\2\2J\u01d6\3\2\2\2L\u01db\3\2\2\2N\u01dd\3\2\2\2P\u01e0\3\2\2\2R\u01e5" + "\3\2\2\2T\u01f2\3\2\2\2V\u01f5\3\2\2\2X\u01f8\3\2\2\2Z\u0200\3\2\2\2\\"
         + "\u020a\3\2\2\2^\u020c\3\2\2\2`\u0214\3\2\2\2b\u0216\3\2\2\2d\u021e\3\2" + "\2\2f\u0226\3\2\2\2h\u0233\3\2\2\2j\u0242\3\2\2\2l\u024b\3\2\2\2n\u024d"
         + "\3\2\2\2p\u0255\3\2\2\2r\u025d\3\2\2\2t\u0265\3\2\2\2v\u026d\3\2\2\2x" + "\u0272\3\2\2\2z\u0277\3\2\2\2|\u027f\3\2\2\2~\u0287\3\2\2\2\u0080\u0292"
         + "\3\2\2\2\u0082\u0294\3\2\2\2\u0084\u02a4\3\2\2\2\u0086\u02ac\3\2\2\2\u0088" + "\u02b3\3\2\2\2\u008a\u02b7\3\2\2\2\u008c\u02b9\3\2\2\2\u008e\u02c9\3\2"
         + "\2\2\u0090\u02cb\3\2\2\2\u0092\u02d4\3\2\2\2\u0094\u02d9\3\2\2\2\u0096" + "\u02db\3\2\2\2\u0098\u02df\3\2\2\2\u009a\u02e1\3\2\2\2\u009c\u02e3\3\2"
         + "\2\2\u009e\u02eb\3\2\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a2" + "\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\3\3\2\2\2"
         + "\u00a5\u00a3\3\2\2\2\u00a6\u00a7\78\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9" + "\79\2\2\u00a9\u00b3\3\2\2\2\u00aa\u00b3\5\64\33\2\u00ab\u00b3\5@!\2\u00ac"
         + "\u00b3\5\66\34\2\u00ad\u00b3\5\6\4\2\u00ae\u00af\5\24\13\2\u00af\u00b0" + "\7\5\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\5(\25\2\u00b2\u00a6\3\2\2\2\u00b2"
         + "\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2" + "\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\5\3\2\2\2\u00b4\u00bc"
         + "\5\n\6\2\u00b5\u00bc\5\b\5\2\u00b6\u00bc\5\f\7\2\u00b7\u00bc\5\16\b\2" + "\u00b8\u00bc\5\20\t\2\u00b9\u00bc\5\22\n\2\u00ba\u00bc\5P)\2\u00bb\u00b4"
         + "\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb" + "\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\7\3\2\2\2"
         + "\u00bd\u00be\7\34\2\2\u00be\u00bf\7\64\2\2\u00bf\u00c0\5`\61\2\u00c0\u00c1" + "\7\5\2\2\u00c1\u00c2\5`\61\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5`\61\2\u00c4"
         + "\u00c5\7\65\2\2\u00c5\u00c6\5\4\3\2\u00c6\t\3\2\2\2\u00c7\u00c8\7\31\2" + "\2\u00c8\u00c9\7\64\2\2\u00c9\u00ca\5`\61\2\u00ca\u00cb\7\65\2\2\u00cb"
         + "\u00d3\5\4\3\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\5" + "`\61\2\u00cf\u00d0\7\65\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2"
         + "\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\3\2" + "\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d9\5\4\3\2\u00d8"
         + "\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\13\3\2\2\2\u00da\u00db\7\35\2" + "\2\u00db\u00dc\7\64\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7\4\2\2\u00de"
         + "\u00df\5\u008eH\2\u00df\u00e0\7\65\2\2\u00e0\u00e1\5\4\3\2\u00e1\r\3\2" + "\2\2\u00e2\u00e3\7\36\2\2\u00e3\u00e5\7\64\2\2\u00e4\u00e6\5`\61\2\u00e5"
         + "\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\65" + "\2\2\u00e8\u00e9\5\4\3\2\u00e9\17\3\2\2\2\u00ea\u00eb\7\23\2\2\u00eb\u00ec"
         + "\5\4\3\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\7\64\2\2\u00ee\u00ef\5`\61\2" + "\u00ef\u00f0\7\65\2\2\u00f0\u00f1\7\5\2\2\u00f1\21\3\2\2\2\u00f2\u00f3"
         + "\7\24\2\2\u00f3\u00f4\7\64\2\2\u00f4\u00f5\5`\61\2\u00f5\u00f6\7\65\2" + "\2\u00f6\u00f7\78\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\79\2\2\u00f9\23"
         + "\3\2\2\2\u00fa\u0102\5\26\f\2\u00fb\u0102\5\30\r\2\u00fc\u0102\5\32\16" + "\2\u00fd\u0102\5\34\17\2\u00fe\u0102\5\36\20\2\u00ff\u0102\5 \21\2\u0100"
         + "\u0102\5`\61\2\u0101\u00fa\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2" + "\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"
         + "\u0100\3\2\2\2\u0102\25\3\2\2\2\u0103\u0104\7\f\2\2\u0104\u0109\5.\30" + "\2\u0105\u0106\7;\2\2\u0106\u0108\5.\30\2\u0107\u0105\3\2\2\2\u0108\u010b"
         + "\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\27\3\2\2\2\u010b" + "\u0109\3\2\2\2\u010c\u010e\7>\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2"
         + "\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5*\26\2\u0110\u0111\7\37\2\2\u0111" + "\u0112\5`\61\2\u0112\31\3\2\2\2\u0113\u0115\7\30\2\2\u0114\u0116\7F\2"
         + "\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\33\3\2\2\2\u0117\u0119" + "\7\r\2\2\u0118\u011a\7F\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"
         + "\35\3\2\2\2\u011b\u011d\7\16\2\2\u011c\u011e\5`\61\2\u011d\u011c\3\2\2" + "\2\u011d\u011e\3\2\2\2\u011e\37\3\2\2\2\u011f\u0120\7C\2\2\u0120\u0121"
         + "\5`\61\2\u0121!\3\2\2\2\u0122\u0124\5$\23\2\u0123\u0122\3\2\2\2\u0124" + "\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"
         + "\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5&\24\2\u0129#\3\2\2\2\u012a\u012b" + "\7\25\2\2\u012b\u012c\5`\61\2\u012c\u0130\7<\2\2\u012d\u012f\5\4\3\2\u012e"
         + "\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2" + "\2\2\u0131%\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\26\2\2\u0134\u0138"
         + "\7<\2\2\u0135\u0137\5\4\3\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138" + "\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\'\3\2\2\2\u013a\u0138\3\2\2\2"
         + "\u013b\u013c\7@\2\2\u013c)\3\2\2\2\u013d\u013e\7-\2\2\u013e\u0145\5,\27" + "\2\u013f\u0140\7-\2\2\u0140\u0141\5,\27\2\u0141\u0142\7+\2\2\u0142\u0143"
         + "\5,\27\2\u0143\u0145\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013f\3\2\2\2\u0145" + "+\3\2\2\2\u0146\u0147\7O\2\2\u0147-\3\2\2\2\u0148\u014c\5\60\31\2\u0149"
         + "\u014c\5\62\32\2\u014a\u014c\5*\26\2\u014b\u0148\3\2\2\2\u014b\u0149\3" + "\2\2\2\u014b\u014a\3\2\2\2\u014c/\3\2\2\2\u014d\u014e\7O\2\2\u014e\u014f"
         + "\7\62\2\2\u014f\u0150\5*\26\2\u0150\61\3\2\2\2\u0151\u0158\5*\26\2\u0152" + "\u0153\7\66\2\2\u0153\u0154\5`\61\2\u0154\u0155\7\67\2\2\u0155\u0157\3"
         + "\2\2\2\u0156\u0152\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158" + "\u0159\3\2\2\2\u0159\63\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015f\78\2\2"
         + "\u015c\u015e\5\4\3\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d" + "\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"
         + "\u0163\79\2\2\u0163\65\3\2\2\2\u0164\u0165\7:\2\2\u0165\u0167\58\35\2" + "\u0166\u0168\5:\36\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169"
         + "\3\2\2\2\u0169\u016d\78\2\2\u016a\u016c\5<\37\2\u016b\u016a\3\2\2\2\u016c" + "\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2"
         + "\2\2\u016f\u016d\3\2\2\2\u0170\u0171\79\2\2\u0171\67\3\2\2\2\u0172\u0173" + "\7O\2\2\u01739\3\2\2\2\u0174\u0175\7\22\2\2\u0175\u017a\58\35\2\u0176"
         + "\u0177\7;\2\2\u0177\u0179\58\35\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2" + "\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b;\3\2\2\2\u017c\u017a"
         + "\3\2\2\2\u017d\u017e\7\t\2\2\u017e\u0181\7O\2\2\u017f\u0180\7\37\2\2\u0180" + "\u0182\5\u0092J\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"
         + "\3\2\2\2\u0183\u0190\7\5\2\2\u0184\u0186\5L\'\2\u0185\u0184\3\2\2\2\u0186" + "\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"
         + "\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\27\2\2\u018b\u018c\5V,\2\u018c" + "\u018d\5R*\2\u018d\u018e\7\5\2\2\u018e\u0190\3\2\2\2\u018f\u017d\3\2\2"
         + "\2\u018f\u0187\3\2\2\2\u0190=\3\2\2\2\u0191\u0192\7O\2\2\u0192?\3\2\2" + "\2\u0193\u0195\5F$\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196"
         + "\3\2\2\2\u0196\u0197\7\21\2\2\u0197\u019a\5> \2\u0198\u0199\7\22\2\2\u0199" + "\u019b\5> \2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2"
         + "\2\u019c\u019e\5B\"\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f" + "\3\2\2\2\u019f\u01a3\78\2\2\u01a0\u01a2\5D#\2\u01a1\u01a0\3\2\2\2\u01a2"
         + "\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2" + "\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\79\2\2\u01a7A\3\2\2\2\u01a8\u01a9"
         + "\7\17\2\2\u01a9\u01ae\58\35\2\u01aa\u01ab\7;\2\2\u01ab\u01ad\58\35\2\u01ac" + "\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"
         + "\2\2\u01afC\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\5L\'\2\u01b2\u01b1" + "\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"
         + "\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7\27\2\2\u01b8\u01b9\5" + "V,\2\u01b9\u01bc\5R*\2\u01ba\u01bd\5\64\33\2\u01bb\u01bd\7\5\2\2\u01bc"
         + "\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01ce\3\2\2\2\u01be\u01bf\5H" + "%\2\u01bf\u01c0\7\5\2\2\u01c0\u01ce\3\2\2\2\u01c1\u01c3\7\20\2\2\u01c2"
         + "\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c6\5L" + "\'\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"
         + "\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\5J" + "&\2\u01cb\u01cc\7\5\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01b4\3\2\2\2\u01cd"
         + "\u01be\3\2\2\2\u01cd\u01c2\3\2\2\2\u01ceE\3\2\2\2\u01cf\u01d0\7=\2\2\u01d0" + "G\3\2\2\2\u01d1\u01d2\7\t\2\2\u01d2\u01d3\5,\27\2\u01d3\u01d4\7\37\2\2"
         + "\u01d4\u01d5\5\u0092J\2\u01d5I\3\2\2\2\u01d6\u01d9\5N(\2\u01d7\u01d8\7" + "\37\2\2\u01d8\u01da\5\u0092J\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2"
         + "\u01daK\3\2\2\2\u01db\u01dc\t\2\2\2\u01dcM\3\2\2\2\u01dd\u01de\7-\2\2" + "\u01de\u01df\5,\27\2\u01dfO\3\2\2\2\u01e0\u01e1\7\27\2\2\u01e1\u01e2\5"
         + "V,\2\u01e2\u01e3\5R*\2\u01e3\u01e4\5\64\33\2\u01e4Q\3\2\2\2\u01e5\u01ee" + "\7\64\2\2\u01e6\u01eb\5Z.\2\u01e7\u01e8\7;\2\2\u01e8\u01ea\5Z.\2\u01e9"
         + "\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2" + "\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01e6\3\2\2\2\u01ee"
         + "\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\65\2\2\u01f1S\3\2\2\2" + "\u01f2\u01f3\5V,\2\u01f3\u01f4\5X-\2\u01f4U\3\2\2\2\u01f5\u01f6\7O\2\2"
         + "\u01f6W\3\2\2\2\u01f7\u01f9\7\64\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3" + "\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\5^\60\2\u01fb\u01fa\3\2\2\2\u01fb"
         + "\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\7\65\2\2\u01fe\u01fd\3" + "\2\2\2\u01fe\u01ff\3\2\2\2\u01ffY\3\2\2\2\u0200\u0203\5\\/\2\u0201\u0202"
         + "\7\37\2\2\u0202\u0204\5\u0092J\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2" + "\2\u0204[\3\2\2\2\u0205\u0206\7-\2\2\u0206\u020b\7O\2\2\u0207\u0208\7"
         + "\"\2\2\u0208\u0209\7-\2\2\u0209\u020b\7O\2\2\u020a\u0205\3\2\2\2\u020a" + "\u0207\3\2\2\2\u020b]\3\2\2\2\u020c\u0211\5`\61\2\u020d\u020e\7;\2\2\u020e"
         + "\u0210\5`\61\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2" + "\2\2\u0211\u0212\3\2\2\2\u0212_\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215"
         + "\5b\62\2\u0215a\3\2\2\2\u0216\u021b\5d\63\2\u0217\u0218\7\n\2\2\u0218" + "\u021a\5d\63\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2"
         + "\2\2\u021b\u021c\3\2\2\2\u021cc\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0223" + "\5f\64\2\u021f\u0220\7\13\2\2\u0220\u0222\5f\64\2\u0221\u021f\3\2\2\2"
         + "\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224e\3" + "\2\2\2\u0225\u0223\3\2\2\2\u0226\u022b\5h\65\2\u0227\u0228\7\7\2\2\u0228"
         + "\u022a\5h\65\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2" + "\2\2\u022b\u022c\3\2\2\2\u022cg\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f"
         + "\5j\66\2\u022f\u0230\t\3\2\2\u0230\u0231\5h\65\2\u0231\u0234\3\2\2\2\u0232" + "\u0234\5l\67\2\u0233\u022e\3\2\2\2\u0233\u0232\3\2\2\2\u0234i\3\2\2\2"
         + "\u0235\u0236\7\b\2\2\u0236\u0237\7\64\2\2\u0237\u023c\5.\30\2\u0238\u0239" + "\7;\2\2\u0239\u023b\5.\30\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c"
         + "\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2" + "\2\2\u023f\u0240\7\65\2\2\u0240\u0243\3\2\2\2\u0241\u0243\5.\30\2\u0242"
         + "\u0235\3\2\2\2\u0242\u0241\3\2\2\2\u0243k\3\2\2\2\u0244\u0245\5n8\2\u0245" + "\u0246\7\63\2\2\u0246\u0247\5`\61\2\u0247\u0248\7<\2\2\u0248\u0249\5`"
         + "\61\2\u0249\u024c\3\2\2\2\u024a\u024c\5n8\2\u024b\u0244\3\2\2\2\u024b" + "\u024a\3\2\2\2\u024cm\3\2\2\2\u024d\u0252\5p9\2\u024e\u024f\7\60\2\2\u024f"
         + "\u0251\5p9\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2" + "\2\u0252\u0253\3\2\2\2\u0253o\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u025a"
         + "\5r:\2\u0256\u0257\7\61\2\2\u0257\u0259\5r:\2\u0258\u0256\3\2\2\2\u0259" + "\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bq\3\2\2\2"
         + "\u025c\u025a\3\2\2\2\u025d\u0262\5t;\2\u025e\u025f\7#\2\2\u025f\u0261" + "\5t;\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"
         + "\u0263\3\2\2\2\u0263s\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u026a\5v<\2\u0266" + "\u0267\7\"\2\2\u0267\u0269\5v<\2\u0268\u0266\3\2\2\2\u0269\u026c\3\2\2"
         + "\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026bu\3\2\2\2\u026c\u026a" + "\3\2\2\2\u026d\u0270\5x=\2\u026e\u026f\7Q\2\2\u026f\u0271\5x=\2\u0270"
         + "\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271w\3\2\2\2\u0272\u0275\5z>\2\u0273" + "\u0274\7R\2\2\u0274\u0276\5z>\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2"
         + "\2\u0276y\3\2\2\2\u0277\u027c\5|?\2\u0278\u0279\7S\2\2\u0279\u027b\5|" + "?\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"
         + "\u027d\3\2\2\2\u027d{\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0284\5~@\2\u0280" + "\u0281\t\4\2\2\u0281\u0283\5~@\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2"
         + "\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285}\3\2\2\2\u0286\u0284" + "\3\2\2\2\u0287\u028c\5\u0080A\2\u0288\u0289\t\5\2\2\u0289\u028b\5\u0080"
         + "A\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c" + "\u028d\3\2\2\2\u028d\177\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7$\2"
         + "\2\u0290\u0293\5\u0080A\2\u0291\u0293\5\u0082B\2\u0292\u028f\3\2\2\2\u0292" + "\u0291\3\2\2\2\u0293\u0081\3\2\2\2\u0294\u0297\5\u0084C\2\u0295\u0296"
         + "\7\6\2\2\u0296\u0298\5\u0084C\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2" + "\2\u0298\u0083\3\2\2\2\u0299\u029a\t\6\2\2\u029a\u02a5\5\u0086D\2\u029b"
         + "\u029c\7\64\2\2\u029c\u029d\7D\2\2\u029d\u029e\7\65\2\2\u029e\u02a5\5" + "\u0086D\2\u029f\u02a0\7\64\2\2\u02a0\u02a1\5f\64\2\u02a1\u02a2\7\65\2"
         + "\2\u02a2\u02a5\3\2\2\2\u02a3\u02a5\5\u0086D\2\u02a4\u0299\3\2\2\2\u02a4" + "\u029b\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u0085\3\2"
         + "\2\2\u02a6\u02a7\7T\2\2\u02a7\u02ad\5.\30\2\u02a8\u02a9\5.\30\2\u02a9" + "\u02aa\7T\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02ad\5\u0088E\2\u02ac\u02a6\3"
         + "\2\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad\u0087\3\2\2\2\u02ae" + "\u02af\7 \2\2\u02af\u02b4\5.\30\2\u02b0\u02b1\7!\2\2\u02b1\u02b4\5.\30"
         + "\2\u02b2\u02b4\5\u008aF\2\u02b3\u02ae\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3" + "\u02b2\3\2\2\2\u02b4\u0089\3\2\2\2\u02b5\u02b8\5\u0092J\2\u02b6\u02b8"
         + "\5\u0094K\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2\2\2\u02b8\u008b\3\2\2" + "\2\u02b9\u02ba\7B\2\2\u02ba\u02c3\7\64\2\2\u02bb\u02c0\5\u008eH\2\u02bc"
         + "\u02bd\7;\2\2\u02bd\u02bf\5\u008eH\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3" + "\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2"
         + "\u02c0\3\2\2\2\u02c3\u02bb\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2" + "\2\2\u02c5\u02c6\7\65\2\2\u02c6\u008d\3\2\2\2\u02c7\u02ca\5\u0090I\2\u02c8"
         + "\u02ca\5`\61\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u008f\3\2" + "\2\2\u02cb\u02cc\5`\61\2\u02cc\u02cd\7/\2\2\u02cd\u02ce\5`\61\2\u02ce"
         + "\u0091\3\2\2\2\u02cf\u02d5\5\u0098M\2\u02d0\u02d5\5\u009eP\2\u02d1\u02d5" + "\5\u0096L\2\u02d2\u02d5\5\u008cG\2\u02d3\u02d5\5T+\2\u02d4\u02cf\3\2\2"
         + "\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3" + "\3\2\2\2\u02d5\u0093\3\2\2\2\u02d6\u02d7\7\"\2\2\u02d7\u02da\5.\30\2\u02d8"
         + "\u02da\5.\30\2\u02d9\u02d6\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\u0095\3\2" + "\2\2\u02db\u02dc\7K\2\2\u02dc\u0097\3\2\2\2\u02dd\u02e0\5\u009aN\2\u02de"
         + "\u02e0\5\u009cO\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0\u0099" + "\3\2\2\2\u02e1\u02e2\t\7\2\2\u02e2\u009b\3\2\2\2\u02e3\u02e8\7I\2\2\u02e4"
         + "\u02e5\7\3\2\2\u02e5\u02e7\t\b\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02ea\3\2" + "\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u009d\3\2\2\2\u02ea"
         + "\u02e8\3\2\2\2\u02eb\u02ec\t\t\2\2\u02ec\u009f\3\2\2\2K\u00a3\u00b2\u00bb" + "\u00d3\u00d8\u00e5\u0101\u0109\u010d\u0115\u0119\u011d\u0125\u0130\u0138"
         + "\u0144\u014b\u0158\u015f\u0167\u016d\u017a\u0181\u0187\u018f\u0194\u019a" + "\u019d\u01a3\u01ae\u01b4\u01bc\u01c2\u01c7\u01cd\u01d9\u01eb\u01ee\u01f8"
         + "\u01fb\u01fe\u0203\u020a\u0211\u021b\u0223\u022b\u0233\u023c\u0242\u024b" + "\u0252\u025a\u0262\u026a\u0270\u0275\u027c\u0284\u028c\u0292\u0297\u02a4"
         + "\u02ac\u02b3\u02b7\u02c0\u02c3\u02c9\u02d4\u02d9\u02df\u02e8";
   public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }

   public PHPParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public final AdditionContext addition() throws RecognitionException {
      final AdditionContext _localctx = new AdditionContext(_ctx, getState());
      enterRule(_localctx, 122, RULE_addition);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(637);
            multiplication();
            setState(642);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(638);
                        _la = _input.LA(1);
                        if (!(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Dot))) != 0)))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(639);
                        multiplication();
                     }
                  }
               }
               setState(644);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
      final ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
      enterRule(_localctx, 138, RULE_arrayDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(695);
            match(Array);
            setState(696);
            match(OpenRoundBracket);
            setState(705);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings)
                  | (1L << Dollar) | (1L << OpenRoundBracket))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64))
                        | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  setState(697);
                  arrayEntry();
                  setState(702);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == Comma) {
                     {
                        {
                           setState(698);
                           match(Comma);
                           setState(699);
                           arrayEntry();
                        }
                     }
                     setState(704);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
               }
            }
            setState(707);
            match(CloseRoundBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ArrayEntryContext arrayEntry() throws RecognitionException {
      final ArrayEntryContext _localctx = new ArrayEntryContext(_ctx, getState());
      enterRule(_localctx, 140, RULE_arrayEntry);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(711);
            switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
               case 1: {
                  setState(709);
                  keyValuePair();
               }
                  break;
               case 2: {
                  setState(710);
                  expression();
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AssignmentContext assignment() throws RecognitionException {
      final AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
      enterRule(_localctx, 102, RULE_assignment);
      int _la;
      try {
         setState(561);
         switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(556);
                  listVariables();
                  {
                     setState(557);
                     _la = _input.LA(1);
                     if (!((_la == Equals) || (_la == AssignmentOperator))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                     setState(558);
                     assignment();
                  }
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(560);
                  ternary();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AtomContext atom() throws RecognitionException {
      final AtomContext _localctx = new AtomContext(_ctx, getState());
      enterRule(_localctx, 144, RULE_atom);
      try {
         setState(722);
         switch (_input.LA(1)) {
            case DecimalNumber:
            case HexNumber:
            case OctalNumber:
            case Float:
               enterOuterAlt(_localctx, 1);
               {
                  setState(717);
                  number();
               }
               break;
            case SingleQuotedString:
            case DoubleQuotedString:
               enterOuterAlt(_localctx, 2);
               {
                  setState(718);
                  string();
               }
               break;
            case Boolean:
               enterOuterAlt(_localctx, 3);
               {
                  setState(719);
                  bool();
               }
               break;
            case Array:
               enterOuterAlt(_localctx, 4);
               {
                  setState(720);
                  arrayDeclaration();
               }
               break;
            case Identifier:
               enterOuterAlt(_localctx, 5);
               {
                  setState(721);
                  functionInvocation();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AtomOrReferenceContext atomOrReference() throws RecognitionException {
      final AtomOrReferenceContext _localctx = new AtomOrReferenceContext(_ctx, getState());
      enterRule(_localctx, 136, RULE_atomOrReference);
      try {
         setState(693);
         switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(691);
                  atom();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(692);
                  reference();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BitWiseAndContext bitWiseAnd() throws RecognitionException {
      final BitWiseAndContext _localctx = new BitWiseAndContext(_ctx, getState());
      enterRule(_localctx, 114, RULE_bitWiseAnd);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(611);
            equalityCheck();
            setState(616);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 54, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(612);
                        match(Ampersand);
                        setState(613);
                        equalityCheck();
                     }
                  }
               }
               setState(618);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 54, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BitwiseOrContext bitwiseOr() throws RecognitionException {
      final BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
      enterRule(_localctx, 112, RULE_bitwiseOr);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(603);
            bitWiseAnd();
            setState(608);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(604);
                        match(Pipe);
                        setState(605);
                        bitWiseAnd();
                     }
                  }
               }
               setState(610);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BitWiseShiftContext bitWiseShift() throws RecognitionException {
      final BitWiseShiftContext _localctx = new BitWiseShiftContext(_ctx, getState());
      enterRule(_localctx, 120, RULE_bitWiseShift);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(629);
            addition();
            setState(634);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(630);
                        match(ShiftOperator);
                        setState(631);
                        addition();
                     }
                  }
               }
               setState(636);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BoolContext bool() throws RecognitionException {
      final BoolContext _localctx = new BoolContext(_ctx, getState());
      enterRule(_localctx, 148, RULE_bool);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(729);
            match(Boolean);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BracketedBlockContext bracketedBlock() throws RecognitionException {
      final BracketedBlockContext _localctx = new BracketedBlockContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_bracketedBlock);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(345);
            match(OpenCurlyBracket);
            setState(349);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function)
                  | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde)
                  | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface) | (1L << Abstract) | (1L << Static) | (1L << SinglelineComment))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64))
                        | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64))
                        | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  {
                     setState(346);
                     statement();
                  }
               }
               setState(351);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(352);
            match(CloseCurlyBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final BreakStatementContext breakStatement() throws RecognitionException {
      final BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_breakStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(273);
            match(Break);
            setState(275);
            _la = _input.LA(1);
            if (_la == DecimalNumber) {
               {
                  setState(274);
                  match(DecimalNumber);
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final CasesContext cases() throws RecognitionException {
      final CasesContext _localctx = new CasesContext(_ctx, getState());
      enterRule(_localctx, 32, RULE_cases);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(291);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == Case) {
               {
                  {
                     setState(288);
                     casestatement();
                  }
               }
               setState(293);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(294);
            defaultcase();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final CasestatementContext casestatement() throws RecognitionException {
      final CasestatementContext _localctx = new CasestatementContext(_ctx, getState());
      enterRule(_localctx, 34, RULE_casestatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(296);
            match(Case);
            setState(297);
            expression();
            setState(298);
            match(Colon);
            setState(302);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function)
                  | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde)
                  | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface) | (1L << Abstract) | (1L << Static) | (1L << SinglelineComment))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64))
                        | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64))
                        | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  {
                     setState(299);
                     statement();
                  }
               }
               setState(304);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ClassDefinitionContext classDefinition() throws RecognitionException {
      final ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
      enterRule(_localctx, 62, RULE_classDefinition);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(402);
            _la = _input.LA(1);
            if (_la == Abstract) {
               {
                  setState(401);
                  classModifier();
               }
            }
            setState(404);
            match(Class);
            setState(405);
            className();
            setState(408);
            _la = _input.LA(1);
            if (_la == Extends) {
               {
                  setState(406);
                  match(Extends);
                  setState(407);
                  className();
               }
            }
            setState(411);
            _la = _input.LA(1);
            if (_la == Implements) {
               {
                  setState(410);
                  classImplements();
               }
            }
            setState(413);
            match(OpenCurlyBracket);
            setState(417);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((((_la - 7)) & ~0x3f) == 0) && (((1L << (_la - 7)) & ((1L << (Const - 7)) | (1L << (Var - 7)) | (1L << (Function - 7)) | (1L << (Dollar - 7)) | (1L << (Abstract - 7))
                  | (1L << (Static - 7)) | (1L << (AccessModifier - 7)))) != 0))) {
               {
                  {
                     setState(414);
                     classMember();
                  }
               }
               setState(419);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(420);
            match(CloseCurlyBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ClassImplementsContext classImplements() throws RecognitionException {
      final ClassImplementsContext _localctx = new ClassImplementsContext(_ctx, getState());
      enterRule(_localctx, 64, RULE_classImplements);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(422);
            match(Implements);
            {
               setState(423);
               interfaceName();
               setState(428);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == Comma) {
                  {
                     {
                        setState(424);
                        match(Comma);
                        setState(425);
                        interfaceName();
                     }
                  }
                  setState(430);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ClassMemberContext classMember() throws RecognitionException {
      final ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
      enterRule(_localctx, 66, RULE_classMember);
      int _la;
      try {
         setState(459);
         switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(434);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while ((((((_la - 59)) & ~0x3f) == 0) && (((1L << (_la - 59)) & ((1L << (Abstract - 59)) | (1L << (Static - 59)) | (1L << (AccessModifier - 59)))) != 0))) {
                     {
                        {
                           setState(431);
                           fieldModifier();
                        }
                     }
                     setState(436);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(437);
                  match(Function);
                  setState(438);
                  functionName();
                  setState(439);
                  parametersDefinition();
                  setState(442);
                  switch (_input.LA(1)) {
                     case OpenCurlyBracket: {
                        setState(440);
                        bracketedBlock();
                     }
                        break;
                     case SemiColon: {
                        setState(441);
                        match(SemiColon);
                     }
                        break;
                     default:
                        throw new NoViableAltException(this);
                  }
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(444);
                  constDefinition();
                  setState(445);
                  match(SemiColon);
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(448);
                  _la = _input.LA(1);
                  if (_la == Var) {
                     {
                        setState(447);
                        match(Var);
                     }
                  }
                  setState(453);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while ((((((_la - 59)) & ~0x3f) == 0) && (((1L << (_la - 59)) & ((1L << (Abstract - 59)) | (1L << (Static - 59)) | (1L << (AccessModifier - 59)))) != 0))) {
                     {
                        {
                           setState(450);
                           fieldModifier();
                        }
                     }
                     setState(455);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(456);
                  fieldDefinition();
                  setState(457);
                  match(SemiColon);
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ClassModifierContext classModifier() throws RecognitionException {
      final ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_classModifier);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(461);
            match(Abstract);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ClassNameContext className() throws RecognitionException {
      final ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
      enterRule(_localctx, 60, RULE_className);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(399);
            match(Identifier);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final CommaListContext commaList() throws RecognitionException {
      final CommaListContext _localctx = new CommaListContext(_ctx, getState());
      enterRule(_localctx, 92, RULE_commaList);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(522);
            expression();
            setState(527);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(523);
                        match(Comma);
                        setState(524);
                        expression();
                     }
                  }
               }
               setState(529);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ComparisionCheckContext comparisionCheck() throws RecognitionException {
      final ComparisionCheckContext _localctx = new ComparisionCheckContext(_ctx, getState());
      enterRule(_localctx, 118, RULE_comparisionCheck);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(624);
            bitWiseShift();
            setState(627);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
               case 1: {
                  setState(625);
                  match(ComparisionOperator);
                  setState(626);
                  bitWiseShift();
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ComplexStatementContext complexStatement() throws RecognitionException {
      final ComplexStatementContext _localctx = new ComplexStatementContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_complexStatement);
      try {
         setState(185);
         switch (_input.LA(1)) {
            case If:
               enterOuterAlt(_localctx, 1);
               {
                  setState(178);
                  ifstatement();
               }
               break;
            case For:
               enterOuterAlt(_localctx, 2);
               {
                  setState(179);
                  forstatement();
               }
               break;
            case Foreach:
               enterOuterAlt(_localctx, 3);
               {
                  setState(180);
                  foreachstatement();
               }
               break;
            case While:
               enterOuterAlt(_localctx, 4);
               {
                  setState(181);
                  whilestatement();
               }
               break;
            case Do:
               enterOuterAlt(_localctx, 5);
               {
                  setState(182);
                  dostatement();
               }
               break;
            case Switch:
               enterOuterAlt(_localctx, 6);
               {
                  setState(183);
                  switchstatement();
               }
               break;
            case Function:
               enterOuterAlt(_localctx, 7);
               {
                  setState(184);
                  functionDefinition();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ConstDefinitionContext constDefinition() throws RecognitionException {
      final ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
      enterRule(_localctx, 70, RULE_constDefinition);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(463);
            match(Const);
            setState(464);
            variablename();
            setState(465);
            match(Equals);
            setState(466);
            atom();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ContinueStatementContext continueStatement() throws RecognitionException {
      final ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_continueStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(277);
            match(Continue);
            setState(279);
            _la = _input.LA(1);
            if (_la == DecimalNumber) {
               {
                  setState(278);
                  match(DecimalNumber);
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DefaultcaseContext defaultcase() throws RecognitionException {
      final DefaultcaseContext _localctx = new DefaultcaseContext(_ctx, getState());
      enterRule(_localctx, 36, RULE_defaultcase);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(305);
               match(Default);
               setState(306);
               match(Colon);
               setState(310);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function)
                     | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde)
                     | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface) | (1L << Abstract) | (1L << Static) | (1L << SinglelineComment))) != 0))
                     || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64))
                           | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64))
                           | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
                  {
                     {
                        setState(307);
                        statement();
                     }
                  }
                  setState(312);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DostatementContext dostatement() throws RecognitionException {
      final DostatementContext _localctx = new DostatementContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_dostatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(232);
            match(Do);
            setState(233);
            statement();
            setState(234);
            match(While);
            setState(235);
            match(OpenRoundBracket);
            setState(236);
            expression();
            setState(237);
            match(CloseRoundBracket);
            setState(238);
            match(SemiColon);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final EqualityCheckContext equalityCheck() throws RecognitionException {
      final EqualityCheckContext _localctx = new EqualityCheckContext(_ctx, getState());
      enterRule(_localctx, 116, RULE_equalityCheck);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(619);
            comparisionCheck();
            setState(622);
            switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
               case 1: {
                  setState(620);
                  match(EqualityOperator);
                  setState(621);
                  comparisionCheck();
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ExpressionContext expression() throws RecognitionException {
      final ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
      enterRule(_localctx, 94, RULE_expression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(530);
            weakLogicalOr();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
      final FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
      enterRule(_localctx, 72, RULE_fieldDefinition);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(468);
            fieldName();
            setState(471);
            _la = _input.LA(1);
            if (_la == Equals) {
               {
                  setState(469);
                  match(Equals);
                  setState(470);
                  atom();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FieldModifierContext fieldModifier() throws RecognitionException {
      final FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
      enterRule(_localctx, 74, RULE_fieldModifier);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(473);
            _la = _input.LA(1);
            if (!((((((_la - 59)) & ~0x3f) == 0) && (((1L << (_la - 59)) & ((1L << (Abstract - 59)) | (1L << (Static - 59)) | (1L << (AccessModifier - 59)))) != 0)))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FieldNameContext fieldName() throws RecognitionException {
      final FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
      enterRule(_localctx, 76, RULE_fieldName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(475);
            match(Dollar);
            setState(476);
            variablename();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ForeachstatementContext foreachstatement() throws RecognitionException {
      final ForeachstatementContext _localctx = new ForeachstatementContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_foreachstatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(216);
            match(Foreach);
            setState(217);
            match(OpenRoundBracket);
            setState(218);
            variable();
            setState(219);
            match(As);
            setState(220);
            arrayEntry();
            setState(221);
            match(CloseRoundBracket);
            setState(222);
            statement();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ForstatementContext forstatement() throws RecognitionException {
      final ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_forstatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(187);
            match(For);
            setState(188);
            match(OpenRoundBracket);
            setState(189);
            expression();
            setState(190);
            match(SemiColon);
            setState(191);
            expression();
            setState(192);
            match(SemiColon);
            setState(193);
            expression();
            setState(194);
            match(CloseRoundBracket);
            setState(195);
            statement();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
      final FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
      enterRule(_localctx, 78, RULE_functionDefinition);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(478);
            match(Function);
            setState(479);
            functionName();
            setState(480);
            parametersDefinition();
            setState(481);
            bracketedBlock();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FunctionInvocationContext functionInvocation() throws RecognitionException {
      final FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
      enterRule(_localctx, 82, RULE_functionInvocation);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(496);
            functionName();
            setState(497);
            functionInvocationParameters();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FunctionInvocationParametersContext functionInvocationParameters() throws RecognitionException {
      final FunctionInvocationParametersContext _localctx = new FunctionInvocationParametersContext(_ctx, getState());
      enterRule(_localctx, 86, RULE_functionInvocationParameters);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(502);
            switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
               case 1: {
                  setState(501);
                  match(OpenRoundBracket);
               }
                  break;
            }
            setState(505);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
               case 1: {
                  setState(504);
                  commaList();
               }
                  break;
            }
            setState(508);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
               case 1: {
                  setState(507);
                  match(CloseRoundBracket);
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FunctionNameContext functionName() throws RecognitionException {
      final FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
      enterRule(_localctx, 84, RULE_functionName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(499);
            match(Identifier);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   @Override
   public String getGrammarFileName() {
      return "PHP.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   @Override
   public String[] getTokenNames() {
      return tokenNames;
   }

   public final GlobalStatementContext globalStatement() throws RecognitionException {
      final GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_globalStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(257);
            match(Global);
            setState(258);
            name();
            setState(263);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == Comma) {
               {
                  {
                     setState(259);
                     match(Comma);
                     setState(260);
                     name();
                  }
               }
               setState(265);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IfstatementContext ifstatement() throws RecognitionException {
      final IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_ifstatement);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(197);
            match(If);
            setState(198);
            match(OpenRoundBracket);
            setState(199);
            expression();
            setState(200);
            match(CloseRoundBracket);
            setState(201);
            statement();
            setState(209);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(202);
                        match(ElseIf);
                        setState(203);
                        match(OpenRoundBracket);
                        setState(204);
                        expression();
                        setState(205);
                        match(CloseRoundBracket);
                     }
                  }
               }
               setState(211);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            }
            setState(214);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
               case 1: {
                  setState(212);
                  match(Else);
                  setState(213);
                  statement();
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IncrementContext increment() throws RecognitionException {
      final IncrementContext _localctx = new IncrementContext(_ctx, getState());
      enterRule(_localctx, 132, RULE_increment);
      try {
         setState(682);
         switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(676);
                  match(IncrementOperator);
                  setState(677);
                  name();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(678);
                  name();
                  setState(679);
                  match(IncrementOperator);
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(681);
                  newOrClone();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InstanceOfContext instanceOf() throws RecognitionException {
      final InstanceOfContext _localctx = new InstanceOfContext(_ctx, getState());
      enterRule(_localctx, 128, RULE_instanceOf);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(658);
            negateOrCast();
            setState(661);
            switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
               case 1: {
                  setState(659);
                  match(Instanceof);
                  setState(660);
                  negateOrCast();
               }
                  break;
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IntegerContext integer() throws RecognitionException {
      final IntegerContext _localctx = new IntegerContext(_ctx, getState());
      enterRule(_localctx, 152, RULE_integer);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(735);
            _la = _input.LA(1);
            if (!((((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (DecimalNumber - 68)) | (1L << (HexNumber - 68)) | (1L << (OctalNumber - 68)))) != 0)))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
      final InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
      enterRule(_localctx, 52, RULE_interfaceDefinition);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(354);
            match(Interface);
            setState(355);
            interfaceName();
            setState(357);
            _la = _input.LA(1);
            if (_la == Extends) {
               {
                  setState(356);
                  interfaceExtends();
               }
            }
            setState(359);
            match(OpenCurlyBracket);
            setState(363);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((((_la - 7)) & ~0x3f) == 0) && (((1L << (_la - 7)) & ((1L << (Const - 7)) | (1L << (Function - 7)) | (1L << (Abstract - 7)) | (1L << (Static - 7)) | (1L << (AccessModifier - 7)))) != 0))) {
               {
                  {
                     setState(360);
                     interfaceMember();
                  }
               }
               setState(365);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(366);
            match(CloseCurlyBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InterfaceExtendsContext interfaceExtends() throws RecognitionException {
      final InterfaceExtendsContext _localctx = new InterfaceExtendsContext(_ctx, getState());
      enterRule(_localctx, 56, RULE_interfaceExtends);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(370);
            match(Extends);
            setState(371);
            interfaceName();
            setState(376);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == Comma) {
               {
                  {
                     setState(372);
                     match(Comma);
                     setState(373);
                     interfaceName();
                  }
               }
               setState(378);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InterfaceMemberContext interfaceMember() throws RecognitionException {
      final InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
      enterRule(_localctx, 58, RULE_interfaceMember);
      int _la;
      try {
         setState(397);
         switch (_input.LA(1)) {
            case Const:
               enterOuterAlt(_localctx, 1);
               {
                  setState(379);
                  match(Const);
                  setState(380);
                  match(Identifier);
                  setState(383);
                  _la = _input.LA(1);
                  if (_la == Equals) {
                     {
                        setState(381);
                        match(Equals);
                        setState(382);
                        atom();
                     }
                  }
                  setState(385);
                  match(SemiColon);
               }
               break;
            case Function:
            case Abstract:
            case Static:
            case AccessModifier:
               enterOuterAlt(_localctx, 2);
               {
                  setState(389);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while ((((((_la - 59)) & ~0x3f) == 0) && (((1L << (_la - 59)) & ((1L << (Abstract - 59)) | (1L << (Static - 59)) | (1L << (AccessModifier - 59)))) != 0))) {
                     {
                        {
                           setState(386);
                           fieldModifier();
                        }
                     }
                     setState(391);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(392);
                  match(Function);
                  setState(393);
                  functionName();
                  setState(394);
                  parametersDefinition();
                  setState(395);
                  match(SemiColon);
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InterfaceNameContext interfaceName() throws RecognitionException {
      final InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
      enterRule(_localctx, 54, RULE_interfaceName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(368);
            match(Identifier);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final KeyValuePairContext keyValuePair() throws RecognitionException {
      final KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
      enterRule(_localctx, 142, RULE_keyValuePair);
      try {
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(713);
               expression();
               setState(714);
               match(ArrayAssign);
               setState(715);
               expression();
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ListVariablesContext listVariables() throws RecognitionException {
      final ListVariablesContext _localctx = new ListVariablesContext(_ctx, getState());
      enterRule(_localctx, 104, RULE_listVariables);
      int _la;
      try {
         setState(576);
         switch (_input.LA(1)) {
            case List:
               enterOuterAlt(_localctx, 1);
               {
                  setState(563);
                  match(List);
                  setState(564);
                  match(OpenRoundBracket);
                  setState(565);
                  name();
                  setState(570);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == Comma) {
                     {
                        {
                           setState(566);
                           match(Comma);
                           setState(567);
                           name();
                        }
                     }
                     setState(572);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(573);
                  match(CloseRoundBracket);
               }
               break;
            case Dollar:
            case Identifier:
               enterOuterAlt(_localctx, 2);
               {
                  setState(575);
                  name();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LogicalAndContext logicalAnd() throws RecognitionException {
      final LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
      enterRule(_localctx, 110, RULE_logicalAnd);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(595);
            bitwiseOr();
            setState(600);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(596);
                        match(LogicalAnd);
                        setState(597);
                        bitwiseOr();
                     }
                  }
               }
               setState(602);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LogicalNotContext logicalNot() throws RecognitionException {
      final LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
      enterRule(_localctx, 126, RULE_logicalNot);
      try {
         setState(656);
         switch (_input.LA(1)) {
            case Bang:
               enterOuterAlt(_localctx, 1);
               {
                  setState(653);
                  match(Bang);
                  setState(654);
                  logicalNot();
               }
               break;
            case New:
            case Clone:
            case Ampersand:
            case Minus:
            case Tilde:
            case SuppressWarnings:
            case Dollar:
            case OpenRoundBracket:
            case Array:
            case DecimalNumber:
            case HexNumber:
            case OctalNumber:
            case Float:
            case Boolean:
            case SingleQuotedString:
            case DoubleQuotedString:
            case Identifier:
            case IncrementOperator:
               enterOuterAlt(_localctx, 2);
               {
                  setState(655);
                  instanceOf();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LogicalOrContext logicalOr() throws RecognitionException {
      final LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
      enterRule(_localctx, 108, RULE_logicalOr);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(587);
            logicalAnd();
            setState(592);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 51, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(588);
                        match(LogicalOr);
                        setState(589);
                        logicalAnd();
                     }
                  }
               }
               setState(594);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 51, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final MemberAccessContext memberAccess() throws RecognitionException {
      final MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
      enterRule(_localctx, 48, RULE_memberAccess);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(335);
            variable();
            setState(342);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OpenSquareBracket) {
               {
                  {
                     setState(336);
                     match(OpenSquareBracket);
                     setState(337);
                     expression();
                     setState(338);
                     match(CloseSquareBracket);
                  }
               }
               setState(344);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final MultiplicationContext multiplication() throws RecognitionException {
      final MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
      enterRule(_localctx, 124, RULE_multiplication);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(645);
            logicalNot();
            setState(650);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(646);
                        _la = _input.LA(1);
                        if (!(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << Asterisk) | (1L << Percent) | (1L << Forwardslash))) != 0)))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(647);
                        logicalNot();
                     }
                  }
               }
               setState(652);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NameContext name() throws RecognitionException {
      final NameContext _localctx = new NameContext(_ctx, getState());
      enterRule(_localctx, 44, RULE_name);
      try {
         setState(329);
         switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(326);
                  staticMemberAccess();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(327);
                  memberAccess();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(328);
                  variable();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NegateOrCastContext negateOrCast() throws RecognitionException {
      final NegateOrCastContext _localctx = new NegateOrCastContext(_ctx, getState());
      enterRule(_localctx, 130, RULE_negateOrCast);
      int _la;
      try {
         setState(674);
         switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(663);
                  _la = _input.LA(1);
                  if (!(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings))) != 0)))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
                  setState(664);
                  increment();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(665);
                  match(OpenRoundBracket);
                  setState(666);
                  match(PrimitiveType);
                  setState(667);
                  match(CloseRoundBracket);
                  setState(668);
                  increment();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(669);
                  match(OpenRoundBracket);
                  setState(670);
                  weakLogicalAnd();
                  setState(671);
                  match(CloseRoundBracket);
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(673);
                  increment();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NewOrCloneContext newOrClone() throws RecognitionException {
      final NewOrCloneContext _localctx = new NewOrCloneContext(_ctx, getState());
      enterRule(_localctx, 134, RULE_newOrClone);
      try {
         setState(689);
         switch (_input.LA(1)) {
            case New:
               enterOuterAlt(_localctx, 1);
               {
                  setState(684);
                  match(New);
                  setState(685);
                  name();
               }
               break;
            case Clone:
               enterOuterAlt(_localctx, 2);
               {
                  setState(686);
                  match(Clone);
                  setState(687);
                  name();
               }
               break;
            case Ampersand:
            case Dollar:
            case Array:
            case DecimalNumber:
            case HexNumber:
            case OctalNumber:
            case Float:
            case Boolean:
            case SingleQuotedString:
            case DoubleQuotedString:
            case Identifier:
               enterOuterAlt(_localctx, 3);
               {
                  setState(688);
                  atomOrReference();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NumberContext number() throws RecognitionException {
      final NumberContext _localctx = new NumberContext(_ctx, getState());
      enterRule(_localctx, 150, RULE_number);
      try {
         setState(733);
         switch (_input.LA(1)) {
            case DecimalNumber:
            case HexNumber:
            case OctalNumber:
               enterOuterAlt(_localctx, 1);
               {
                  setState(731);
                  integer();
               }
               break;
            case Float:
               enterOuterAlt(_localctx, 2);
               {
                  setState(732);
                  real();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ParamDefContext paramDef() throws RecognitionException {
      final ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
      enterRule(_localctx, 88, RULE_paramDef);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(510);
            paramName();
            setState(513);
            _la = _input.LA(1);
            if (_la == Equals) {
               {
                  setState(511);
                  match(Equals);
                  setState(512);
                  atom();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ParametersDefinitionContext parametersDefinition() throws RecognitionException {
      final ParametersDefinitionContext _localctx = new ParametersDefinitionContext(_ctx, getState());
      enterRule(_localctx, 80, RULE_parametersDefinition);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(483);
            match(OpenRoundBracket);
            setState(492);
            _la = _input.LA(1);
            if ((_la == Ampersand) || (_la == Dollar)) {
               {
                  setState(484);
                  paramDef();
                  setState(489);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == Comma) {
                     {
                        {
                           setState(485);
                           match(Comma);
                           setState(486);
                           paramDef();
                        }
                     }
                     setState(491);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
               }
            }
            setState(494);
            match(CloseRoundBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ParamNameContext paramName() throws RecognitionException {
      final ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
      enterRule(_localctx, 90, RULE_paramName);
      try {
         setState(520);
         switch (_input.LA(1)) {
            case Dollar:
               enterOuterAlt(_localctx, 1);
               {
                  setState(515);
                  match(Dollar);
                  setState(516);
                  match(Identifier);
               }
               break;
            case Ampersand:
               enterOuterAlt(_localctx, 2);
               {
                  setState(517);
                  match(Ampersand);
                  setState(518);
                  match(Dollar);
                  setState(519);
                  match(Identifier);
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ProgContext prog() throws RecognitionException {
      final ProgContext _localctx = new ProgContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_prog);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(161);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function)
                  | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde)
                  | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface) | (1L << Abstract) | (1L << Static) | (1L << SinglelineComment))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64))
                        | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64))
                        | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  {
                     setState(158);
                     statement();
                  }
               }
               setState(163);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RealContext real() throws RecognitionException {
      final RealContext _localctx = new RealContext(_ctx, getState());
      enterRule(_localctx, 154, RULE_real);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(737);
            match(Float);
            setState(742);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == RealE) {
               {
                  {
                     setState(738);
                     match(RealE);
                     setState(739);
                     _la = _input.LA(1);
                     if (!((_la == DecimalNumber) || (_la == Float))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                  }
               }
               setState(744);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ReferenceContext reference() throws RecognitionException {
      final ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
      enterRule(_localctx, 146, RULE_reference);
      try {
         setState(727);
         switch (_input.LA(1)) {
            case Ampersand:
               enterOuterAlt(_localctx, 1);
               {
                  setState(724);
                  match(Ampersand);
                  setState(725);
                  name();
               }
               break;
            case Dollar:
            case Identifier:
               enterOuterAlt(_localctx, 2);
               {
                  setState(726);
                  name();
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RequireStatementContext requireStatement() throws RecognitionException {
      final RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
      enterRule(_localctx, 30, RULE_requireStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(285);
            match(RequireOperator);
            setState(286);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ReturnStatementContext returnStatement() throws RecognitionException {
      final ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_returnStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(281);
            match(Return);
            setState(283);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings)
                  | (1L << Dollar) | (1L << OpenRoundBracket))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64))
                        | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  setState(282);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SimpleStatementContext simpleStatement() throws RecognitionException {
      final SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_simpleStatement);
      try {
         setState(255);
         switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(248);
                  globalStatement();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(249);
                  staticVariableAssignmentStatement();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(250);
                  breakStatement();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(251);
                  continueStatement();
               }
               break;
            case 5:
               enterOuterAlt(_localctx, 5);
               {
                  setState(252);
                  returnStatement();
               }
               break;
            case 6:
               enterOuterAlt(_localctx, 6);
               {
                  setState(253);
                  requireStatement();
               }
               break;
            case 7:
               enterOuterAlt(_localctx, 7);
               {
                  setState(254);
                  expression();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SinglelinecommentContext singlelinecomment() throws RecognitionException {
      final SinglelinecommentContext _localctx = new SinglelinecommentContext(_ctx, getState());
      enterRule(_localctx, 38, RULE_singlelinecomment);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(313);
            match(SinglelineComment);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StatementContext statement() throws RecognitionException {
      final StatementContext _localctx = new StatementContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_statement);
      try {
         setState(176);
         switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(164);
                  match(OpenCurlyBracket);
                  setState(165);
                  statement();
                  setState(166);
                  match(CloseCurlyBracket);
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(168);
                  bracketedBlock();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(169);
                  classDefinition();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(170);
                  interfaceDefinition();
               }
               break;
            case 5:
               enterOuterAlt(_localctx, 5);
               {
                  setState(171);
                  complexStatement();
               }
               break;
            case 6:
               enterOuterAlt(_localctx, 6);
               {
                  setState(172);
                  simpleStatement();
                  setState(173);
                  match(SemiColon);
               }
               break;
            case 7:
               enterOuterAlt(_localctx, 7);
               {
                  setState(175);
                  singlelinecomment();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StaticMemberAccessContext staticMemberAccess() throws RecognitionException {
      final StaticMemberAccessContext _localctx = new StaticMemberAccessContext(_ctx, getState());
      enterRule(_localctx, 46, RULE_staticMemberAccess);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(331);
            match(Identifier);
            setState(332);
            match(ClassMember);
            setState(333);
            variable();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() throws RecognitionException {
      final StaticVariableAssignmentStatementContext _localctx = new StaticVariableAssignmentStatementContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_staticVariableAssignmentStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(267);
            _la = _input.LA(1);
            if (_la == Static) {
               {
                  setState(266);
                  match(Static);
               }
            }
            setState(269);
            variable();
            setState(270);
            match(Equals);
            setState(271);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StringContext string() throws RecognitionException {
      final StringContext _localctx = new StringContext(_ctx, getState());
      enterRule(_localctx, 156, RULE_string);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(745);
            _la = _input.LA(1);
            if (!((_la == SingleQuotedString) || (_la == DoubleQuotedString))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SwitchstatementContext switchstatement() throws RecognitionException {
      final SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_switchstatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(240);
            match(Switch);
            setState(241);
            match(OpenRoundBracket);
            setState(242);
            expression();
            setState(243);
            match(CloseRoundBracket);
            setState(244);
            match(OpenCurlyBracket);
            setState(245);
            cases();
            setState(246);
            match(CloseCurlyBracket);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final TernaryContext ternary() throws RecognitionException {
      final TernaryContext _localctx = new TernaryContext(_ctx, getState());
      enterRule(_localctx, 106, RULE_ternary);
      try {
         setState(585);
         switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(578);
                  logicalOr();
                  setState(579);
                  match(QuestionMark);
                  setState(580);
                  expression();
                  setState(581);
                  match(Colon);
                  setState(582);
                  expression();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(584);
                  logicalOr();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VariableContext variable() throws RecognitionException {
      final VariableContext _localctx = new VariableContext(_ctx, getState());
      enterRule(_localctx, 40, RULE_variable);
      try {
         setState(322);
         switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(315);
                  match(Dollar);
                  setState(316);
                  variablename();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(317);
                  match(Dollar);
                  setState(318);
                  variablename();
                  setState(319);
                  match(InstanceMember);
                  setState(320);
                  variablename();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VariablenameContext variablename() throws RecognitionException {
      final VariablenameContext _localctx = new VariablenameContext(_ctx, getState());
      enterRule(_localctx, 42, RULE_variablename);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(324);
            match(Identifier);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final WeakLogicalAndContext weakLogicalAnd() throws RecognitionException {
      final WeakLogicalAndContext _localctx = new WeakLogicalAndContext(_ctx, getState());
      enterRule(_localctx, 100, RULE_weakLogicalAnd);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(548);
            assignment();
            setState(553);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(549);
                        match(And);
                        setState(550);
                        assignment();
                     }
                  }
               }
               setState(555);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final WeakLogicalOrContext weakLogicalOr() throws RecognitionException {
      final WeakLogicalOrContext _localctx = new WeakLogicalOrContext(_ctx, getState());
      enterRule(_localctx, 96, RULE_weakLogicalOr);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(532);
            weakLogicalXor();
            setState(537);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(533);
                        match(Or);
                        setState(534);
                        weakLogicalXor();
                     }
                  }
               }
               setState(539);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final WeakLogicalXorContext weakLogicalXor() throws RecognitionException {
      final WeakLogicalXorContext _localctx = new WeakLogicalXorContext(_ctx, getState());
      enterRule(_localctx, 98, RULE_weakLogicalXor);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(540);
            weakLogicalAnd();
            setState(545);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(541);
                        match(Xor);
                        setState(542);
                        weakLogicalAnd();
                     }
                  }
               }
               setState(547);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final WhilestatementContext whilestatement() throws RecognitionException {
      final WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_whilestatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(224);
            match(While);
            setState(225);
            match(OpenRoundBracket);
            setState(227);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings)
                  | (1L << Dollar) | (1L << OpenRoundBracket))) != 0))
                  || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (Array - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64))
                        | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0))) {
               {
                  setState(226);
                  expression();
               }
            }
            setState(229);
            match(CloseRoundBracket);
            setState(230);
            statement();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }
}