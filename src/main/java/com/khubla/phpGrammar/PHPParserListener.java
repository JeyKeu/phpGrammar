// Generated from com/khubla/phpGrammar/PHPParser.g4 by ANTLR 4.1
package com.khubla.phpGrammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PHPParser}.
 */
public interface PHPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PHPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PHPParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull PHPParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull PHPParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#atomOrReference}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrReference(@NotNull PHPParser.AtomOrReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#atomOrReference}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrReference(@NotNull PHPParser.AtomOrReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#variablename}.
	 * @param ctx the parse tree
	 */
	void enterVariablename(@NotNull PHPParser.VariablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#variablename}.
	 * @param ctx the parse tree
	 */
	void exitVariablename(@NotNull PHPParser.VariablenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#bitWiseShift}.
	 * @param ctx the parse tree
	 */
	void enterBitWiseShift(@NotNull PHPParser.BitWiseShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitWiseShift}.
	 * @param ctx the parse tree
	 */
	void exitBitWiseShift(@NotNull PHPParser.BitWiseShiftContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull PHPParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull PHPParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(@NotNull PHPParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(@NotNull PHPParser.FieldDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#bitWiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitWiseAnd(@NotNull PHPParser.BitWiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitWiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitWiseAnd(@NotNull PHPParser.BitWiseAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(@NotNull PHPParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(@NotNull PHPParser.WhilestatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalOr}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalOr(@NotNull PHPParser.WeakLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalOr}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalOr(@NotNull PHPParser.WeakLogicalOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(@NotNull PHPParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(@NotNull PHPParser.SimpleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#newOrClone}.
	 * @param ctx the parse tree
	 */
	void enterNewOrClone(@NotNull PHPParser.NewOrCloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#newOrClone}.
	 * @param ctx the parse tree
	 */
	void exitNewOrClone(@NotNull PHPParser.NewOrCloneContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(@NotNull PHPParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(@NotNull PHPParser.FunctionInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(@NotNull PHPParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(@NotNull PHPParser.IfstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(@NotNull PHPParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(@NotNull PHPParser.MemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#staticMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterStaticMemberAccess(@NotNull PHPParser.StaticMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#staticMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitStaticMemberAccess(@NotNull PHPParser.StaticMemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(@NotNull PHPParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(@NotNull PHPParser.ClassDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalAnd(@NotNull PHPParser.WeakLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalAnd(@NotNull PHPParser.WeakLogicalAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#listVariables}.
	 * @param ctx the parse tree
	 */
	void enterListVariables(@NotNull PHPParser.ListVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#listVariables}.
	 * @param ctx the parse tree
	 */
	void exitListVariables(@NotNull PHPParser.ListVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#weakLogicalXor}.
	 * @param ctx the parse tree
	 */
	void enterWeakLogicalXor(@NotNull PHPParser.WeakLogicalXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#weakLogicalXor}.
	 * @param ctx the parse tree
	 */
	void exitWeakLogicalXor(@NotNull PHPParser.WeakLogicalXorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(@NotNull PHPParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(@NotNull PHPParser.FieldNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#bracketedBlock}.
	 * @param ctx the parse tree
	 */
	void enterBracketedBlock(@NotNull PHPParser.BracketedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bracketedBlock}.
	 * @param ctx the parse tree
	 */
	void exitBracketedBlock(@NotNull PHPParser.BracketedBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(@NotNull PHPParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(@NotNull PHPParser.LogicalAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull PHPParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull PHPParser.IncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#negateOrCast}.
	 * @param ctx the parse tree
	 */
	void enterNegateOrCast(@NotNull PHPParser.NegateOrCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#negateOrCast}.
	 * @param ctx the parse tree
	 */
	void exitNegateOrCast(@NotNull PHPParser.NegateOrCastContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#commaList}.
	 * @param ctx the parse tree
	 */
	void enterCommaList(@NotNull PHPParser.CommaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#commaList}.
	 * @param ctx the parse tree
	 */
	void exitCommaList(@NotNull PHPParser.CommaListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull PHPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull PHPParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#instanceOf}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOf(@NotNull PHPParser.InstanceOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#instanceOf}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOf(@NotNull PHPParser.InstanceOfContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull PHPParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull PHPParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOr(@NotNull PHPParser.BitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOr(@NotNull PHPParser.BitwiseOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PHPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PHPParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(@NotNull PHPParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(@NotNull PHPParser.PrologContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#comparisionCheck}.
	 * @param ctx the parse tree
	 */
	void enterComparisionCheck(@NotNull PHPParser.ComparisionCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#comparisionCheck}.
	 * @param ctx the parse tree
	 */
	void exitComparisionCheck(@NotNull PHPParser.ComparisionCheckContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull PHPParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull PHPParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#epilog}.
	 * @param ctx the parse tree
	 */
	void enterEpilog(@NotNull PHPParser.EpilogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#epilog}.
	 * @param ctx the parse tree
	 */
	void exitEpilog(@NotNull PHPParser.EpilogContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#defaultcase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultcase(@NotNull PHPParser.DefaultcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#defaultcase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultcase(@NotNull PHPParser.DefaultcaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(@NotNull PHPParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(@NotNull PHPParser.GlobalStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(@NotNull PHPParser.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(@NotNull PHPParser.ParamDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull PHPParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull PHPParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(@NotNull PHPParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(@NotNull PHPParser.ClassMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull PHPParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull PHPParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(@NotNull PHPParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(@NotNull PHPParser.ParamNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void enterCasestatement(@NotNull PHPParser.CasestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#casestatement}.
	 * @param ctx the parse tree
	 */
	void exitCasestatement(@NotNull PHPParser.CasestatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(@NotNull PHPParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(@NotNull PHPParser.InterfaceDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(@NotNull PHPParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(@NotNull PHPParser.ArrayDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#parametersDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParametersDefinition(@NotNull PHPParser.ParametersDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#parametersDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParametersDefinition(@NotNull PHPParser.ParametersDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(@NotNull PHPParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(@NotNull PHPParser.FieldModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#htmlblock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlblock(@NotNull PHPParser.HtmlblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#htmlblock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlblock(@NotNull PHPParser.HtmlblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#arrayEntry}.
	 * @param ctx the parse tree
	 */
	void enterArrayEntry(@NotNull PHPParser.ArrayEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#arrayEntry}.
	 * @param ctx the parse tree
	 */
	void exitArrayEntry(@NotNull PHPParser.ArrayEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#equalityCheck}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCheck(@NotNull PHPParser.EqualityCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#equalityCheck}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCheck(@NotNull PHPParser.EqualityCheckContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull PHPParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull PHPParser.RealContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PHPParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PHPParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(@NotNull PHPParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(@NotNull PHPParser.InterfaceNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#singlelinecomment}.
	 * @param ctx the parse tree
	 */
	void enterSinglelinecomment(@NotNull PHPParser.SinglelinecommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#singlelinecomment}.
	 * @param ctx the parse tree
	 */
	void exitSinglelinecomment(@NotNull PHPParser.SinglelinecommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(@NotNull PHPParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(@NotNull PHPParser.MultiplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#foreachstatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachstatement(@NotNull PHPParser.ForeachstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#foreachstatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachstatement(@NotNull PHPParser.ForeachstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull PHPParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull PHPParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(@NotNull PHPParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(@NotNull PHPParser.LogicalOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(@NotNull PHPParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(@NotNull PHPParser.TernaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(@NotNull PHPParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(@NotNull PHPParser.ForstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull PHPParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull PHPParser.ClassNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtends(@NotNull PHPParser.InterfaceExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtends(@NotNull PHPParser.InterfaceExtendsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(@NotNull PHPParser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(@NotNull PHPParser.ConstDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void enterRequireStatement(@NotNull PHPParser.RequireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#requireStatement}.
	 * @param ctx the parse tree
	 */
	void exitRequireStatement(@NotNull PHPParser.RequireStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(@NotNull PHPParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(@NotNull PHPParser.CasesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull PHPParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull PHPParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(@NotNull PHPParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(@NotNull PHPParser.KeyValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#staticVariableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterStaticVariableAssignmentStatement(@NotNull PHPParser.StaticVariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#staticVariableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitStaticVariableAssignmentStatement(@NotNull PHPParser.StaticVariableAssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstatement(@NotNull PHPParser.SwitchstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#switchstatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstatement(@NotNull PHPParser.SwitchstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull PHPParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull PHPParser.AdditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull PHPParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull PHPParser.ContinueStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull PHPParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull PHPParser.ReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#dostatement}.
	 * @param ctx the parse tree
	 */
	void enterDostatement(@NotNull PHPParser.DostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#dostatement}.
	 * @param ctx the parse tree
	 */
	void exitDostatement(@NotNull PHPParser.DostatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void enterPhpBlock(@NotNull PHPParser.PhpBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void exitPhpBlock(@NotNull PHPParser.PhpBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PHPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PHPParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void enterComplexStatement(@NotNull PHPParser.ComplexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#complexStatement}.
	 * @param ctx the parse tree
	 */
	void exitComplexStatement(@NotNull PHPParser.ComplexStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull PHPParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull PHPParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(@NotNull PHPParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(@NotNull PHPParser.InterfaceMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(@NotNull PHPParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(@NotNull PHPParser.HtmlContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull PHPParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull PHPParser.BoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#functionInvocationParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocationParameters(@NotNull PHPParser.FunctionInvocationParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#functionInvocationParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocationParameters(@NotNull PHPParser.FunctionInvocationParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull PHPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull PHPParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(@NotNull PHPParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(@NotNull PHPParser.LogicalNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHPParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void enterClassImplements(@NotNull PHPParser.ClassImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHPParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void exitClassImplements(@NotNull PHPParser.ClassImplementsContext ctx);
}