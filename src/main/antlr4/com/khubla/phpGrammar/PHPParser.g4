/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar PHPParser;

options { tokenVocab=PHPLexer; }

prog 
    : (phpBlock | htmlblock)*
    ;

//
//
// HTML
//
//
htmlblock
    : PHPO? html+ 
    ;

html
    : Html 
    ;

//
//
// PHP start and End
//
//
phpBlock 
    : prolog statement* epilog?
    ;

prolog
    : PHPStart
    ;

epilog
    : PHPEnd
    ;
      
//
//
// statement
//
//

statement
    : '{' statement '}'
    | bracketedBlock
    | classDefinition
    | interfaceDefinition
    | complexStatement
    | simpleStatement ';'
    ;

complexStatement
    : ifstatement
    | forstatement 
    | foreachstatement
    | whilestatement
    | dostatement
    | switchstatement 
    | functionDefinition
    ;


forstatement
    : For '(' expression ';' expression ';'  expression ')' statement 
    ;

ifstatement
    : If '(' expression ')' statement (ElseIf '(' expression ')')* (Else statement)?
    ;

foreachstatement
    : Foreach '(' variable 'as' arrayEntry ')' statement 
    ;

whilestatement
    : While '(' expression? ')' statement
    ;

dostatement
    : Do statement While '(' expression ')' ';' 
    ;

switchstatement
    : Switch '(' expression ')' '{'cases'}' 
    ;

simpleStatement
    : globalStatement
    | staticVariableAssignmentStatement
    | breakStatement
    | continueStatement
    | returnStatement
    | requireStatement
    | expression
    ;

globalStatement
    : Global name (Comma name)*
    ;

staticVariableAssignmentStatement
    : Static? variable Equals expression
    ;

breakStatement
    : Break DecimalNumber?
    ;    

continueStatement
    : Continue DecimalNumber?
    ;

returnStatement
    : Return expression?
    ;

requireStatement
    : RequireOperator expression
    ;

cases 
    : casestatement*  defaultcase
    ;

casestatement
    : Case expression Colon statement*
    ;

defaultcase 
    : (Default Colon statement*)
    ;

//
//
// variable
//
//

variable
    : Dollar variablename
    | Dollar variablename InstanceMember variablename
    ;

variablename
    : Identifier
    ;


//
//
// name
//
//

name: staticMemberAccess
    | memberAccess
    | variable
    ;
    
staticMemberAccess
    : Identifier ClassMember variable
    ;

memberAccess
    : variable 
        ( OpenSquareBracket expression CloseSquareBracket
         )*
    ;

//
//
// block
//
//

bracketedBlock
    : '{' statement* '}'
    ;

//
//
// interface
//
//

interfaceDefinition
    : Interface interfaceName interfaceExtends?
        OpenCurlyBracket
        interfaceMember*
        CloseCurlyBracket
    ;

interfaceName
    : Identifier
    ;

interfaceExtends
    : Extends interfaceName (Comma interfaceName)*
    ;
interfaceMember
    : Const Identifier (Equals atom)? ';' 
    | fieldModifier* Function functionName parametersDefinition ';'
    ;

//
//
// class
//
//

className
    : Identifier
    ;

classDefinition
    :   classModifier? 
        Class className 
        (Extends className)? 
        classImplements?
        OpenCurlyBracket
        classMember*
        CloseCurlyBracket 
    ;
    
classImplements
    :  Implements (interfaceName (Comma interfaceName)*)
    ;

classMember
    : fieldModifier* Function functionName parametersDefinition 
        (bracketedBlock | ';')
    | constDefinition ';' 
    | Var? fieldModifier* fieldDefinition ';'      
    ;

classModifier
    : Abstract;

//
//
// const
//
//
constDefinition
    : Const variablename Equals atom;

//
//
// field
//
//

fieldDefinition
    : fieldName (Equals atom)? 
    ;
    
fieldModifier
    : AccessModifier | Abstract | Static 
    ;

fieldName
    : Dollar variablename
    ;

//
//
// functions
//
//

functionDefinition
    : Function functionName parametersDefinition bracketedBlock 
    ;

parametersDefinition
    : OpenRoundBracket (paramDef (Comma paramDef)*)? CloseRoundBracket 
    ;

functionInvocation
    : functionName functionInvocationParameters
    ;

functionName
    : Identifier
    ;

functionInvocationParameters
    : OpenRoundBracket? (commaList)? CloseRoundBracket? 
    ;

paramDef
    : paramName (Equals atom)?
    ;

paramName
    : Dollar Identifier
    | Ampersand Dollar Identifier 
    ;

commaList
    : expression (',' expression)* 
    ;
    
//
//
// expression
//
//

expression
    : weakLogicalOr 
    ;

weakLogicalOr
    : weakLogicalXor (Or weakLogicalXor)*
    ;

weakLogicalXor
    : weakLogicalAnd (Xor weakLogicalAnd)*
    ;
    
weakLogicalAnd
    : assignment (And assignment)*
    ;

assignment
    : listVariables ((Equals | AssignmentOperator) assignment) 
    | ternary
    ;

listVariables
    : List OpenRoundBracket name (',' name)* CloseRoundBracket 
    | name
    ;

ternary
    : logicalOr QuestionMark expression Colon expression 
    | logicalOr
    ;
    
logicalOr
    : logicalAnd (LogicalOr logicalAnd)*
    ;

logicalAnd
    : bitwiseOr (LogicalAnd bitwiseOr)*
    ;
    
bitwiseOr
    : bitWiseAnd (Pipe bitWiseAnd)*
    ;

bitWiseAnd
    : equalityCheck (Ampersand equalityCheck)*
    ;

equalityCheck
    : comparisionCheck (EqualityOperator comparisionCheck)?
    ;
    
comparisionCheck
    : bitWiseShift (ComparisionOperator bitWiseShift)?
    ;

bitWiseShift
    : addition (ShiftOperator addition)*
    ;
    
addition
    : multiplication ((Plus | Minus | Dot) multiplication)*
    ;

multiplication
    : logicalNot ((Asterisk | Forwardslash | Percent) logicalNot)*
    ;

logicalNot
    : Bang logicalNot
    | instanceOf
    ;

instanceOf
    : negateOrCast (Instanceof negateOrCast)?
    ;

negateOrCast
    : (Tilde | Minus | SuppressWarnings) increment
    | OpenRoundBracket PrimitiveType CloseRoundBracket increment 
    | OpenRoundBracket weakLogicalAnd CloseRoundBracket
    | increment
    ;

increment
    : IncrementOperator name 
    | name IncrementOperator
    | newOrClone
    ;

newOrClone
    : New name
    | Clone name
    | atomOrReference
    ;

atomOrReference
    : atom
    | reference
    ;

arrayDeclaration
    : Array OpenRoundBracket (arrayEntry (Comma arrayEntry)*)? CloseRoundBracket 
    ;

arrayEntry
    : (keyValuePair | expression)
    ;

keyValuePair
    : (expression ArrayAssign expression) 
    ;

atom: number
    | string 
    | bool
    | arrayDeclaration 
    | functionInvocation
    ;

reference
    : Ampersand name
    | name
    ;

bool
    : Boolean
    ;

number
    :  integer  
    | real
    ; 

integer
    : DecimalNumber
    | HexNumber
    | OctalNumber
    ;

real: Float ( RealE (Float | DecimalNumber))*
    ;
    
string
    : SingleQuotedString
    | DoubleQuotedString
    ;
