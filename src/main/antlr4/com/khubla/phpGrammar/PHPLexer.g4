/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar PHPLexer;

//
//
// PHP start and end tokens
//
//

PHPStart
    : ('<?' | '<?php' | '<?PHP') -> pushMode(PHPMode)
    ;

PHPO
    : '<'
    ;

Html
    : ~ ['<']+
    ;

HtmlWS : [ \r\n]+ -> skip
    ;

//
//
// PHP 
//
//
mode PHPMode;

PHPEnd
    : '?>' -> popMode
    ;

MultiLineComment
     : '/*' .*? '*/' -> channel(HIDDEN) 
     ;

SinglelineComment
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;

UnixComment
    : '#' ~[\r\n]* -> channel(HIDDEN)
    ;

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





