    
/*
 *   PHP ANTLR4 Grammar Copyright 2013, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

grammar PHP;

prog : statement*;

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
    | singlelinecomment
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
// comment
//
//

singlelinecomment
    : SinglelineComment
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
      
//
//
// Lexer tokens
//
//
RealE
    : 'e' | 'E';
As
    : 'as';
SemiColon
    : ';';
Instanceof
    : 'instanceof';
And
    : 'and';
List
    : 'list';
Const
    : 'const';
Or
    : 'or';
Xor
    : 'xor';
Global
    : 'global';
Continue
    : 'continue';
Return
    : 'return';
Implements
    : 'implements';
Var
    : 'var';
Class
    : 'class';
Extends
    : 'extends';
Do
    : 'do';
Switch
    : 'switch';
Case
    : 'case';
Default
    : 'default';
Function
    : 'function';
Break
    : 'break';
If
    : 'if';
Else
    : 'else';
ElseIf
    : 'elseif';
For
    : 'for';
Foreach
    : 'foreach';
While
    : 'while';
Equals
    : '=';
New
    : 'new';
Clone
    : 'clone';
Ampersand
    : '&';
Pipe
    : '|';
Bang
    : '!';
Plus
    : '+';
Minus
    : '-';
Asterisk
    : '*';
Percent
    : '%';
Forwardslash
    : '/';
Tilde
    : '~';
InstanceMember
    : '->';
SuppressWarnings
    : '@';
Dollar
    : '$';
Dot
    : '.';
ArrayAssign
    : '=>';
LogicalOr
    : '||';
LogicalAnd
    : '&&';
ClassMember
    : '::';
QuestionMark
    : '?';    
OpenRoundBracket
    : '(';
CloseRoundBracket
    : ')';
OpenSquareBracket
    : '[';
CloseSquareBracket
    : ']';
OpenCurlyBracket
    : '{';
CloseCurlyBracket
    : '}';
Interface
    : 'Interface';
Comma
    : ',';
Colon
    : ':';
Abstract
    : 'abstract';
Static
    : 'static';

MultilineComment    
    : '/*' ('*' | ~ '*')* '*/' 
    ;

SinglelineComment
    : '//' ~[\r\n]*
    ;

UnixComment
    : '#' ~[\r\n]* 
    ;
    
Array
    : ('a'|'A')('r'|'R')('r'|'R')('a'|'A')('y'|'Y')
    ;

RequireOperator
    : 'require' | 'require_once' | 'include' | 'include_once'
    ;

PrimitiveType
    : 'int'|'float'|'string'|'array'|'object'|'bool'
    ;

AccessModifier
    : 'public' | 'private' | 'protected' 
    ;

DecimalNumber 
    : ('0'..'9')+ 
    ;

HexNumber
    : '0'('x'|'X')('0'..'9'|'a'..'f'|'A'..'F')+
    ;

OctalNumber
    : '0'('0'..'7')+
    ;

Float: ('0'..'9')* '.' ('0'..'9')+;
	
Digits
    : '0'..'9'+
    ;

Boolean
    : 'true' | 'false'
    ;

SingleQuotedString
    : '\'' ('\\' '\''
    |         '\\' '\\' 
    |         '\\' | ~ ('\'' | '\\'))* 
      '\''
    ;

EscapeCharacter
    : 'n' | 'r' | 't' | '\\' | '$' | '"' | Digits
    ;

DoubleQuotedString
    : '"'  (  '\\' EscapeCharacter 
    | '\\' 
    | ~('\\'|'"') )* 
      '"'
    ;

Identifier
    : ('a'..'z' | 'A'..'Z' | '_')  ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
   ;
   
AssignmentOperator
    : '+='|'-='|'*='|'/='|'.='|'%='|'&='|'|='|'^='|'<<='|'>>='
    ;
    
EqualityOperator
    : '==' | '!=' | '===' | '!=='
    ;

ComparisionOperator
    : '<' | '<=' | '>' | '>=' | '<>'
    ;
    
ShiftOperator
    : '<<' | '>>'
    ;

IncrementOperator
    : '--'|'++'
    ;
    
WS : [ \t\r\n]+ -> skip;
