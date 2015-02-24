grammar Calc;

// syntactic rules

program  : function* body
         ;
function : '(' 'define' head body ')'
         ;
head     : '(' functionId variableId* ')'
         ;
body     : definition* expression
         ;
definition : '(' '=' variableId expression ')'
           ;
expression : functionId '(' expression* ')' # FunCall
           | '(' expression ')' # Parentheses
           | ('-'|'!') expression # UnaryExp
           | expression ('*'|'/') expression  # BinaryExp
           | expression ('+'|'-') expression # BinaryExp
           | expression ('<'|'>'|'<='|'>=') expression # BinaryExp
           | expression ('=='|'!=') expression # BinaryExp
           | expression ('&&') expression # BinaryExp
           | expression ('||') expression # BinaryExp
           | expression '?'<assoc=right> expression ':' expression # CondExp
           | LITERAL # Literal
           | variableId # Variable
           ;
variableId : IDENTIFIER
           ;
functionId : IDENTIFIER
           ;

// lexical rules

IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
LITERAL  : '0' | ('1'..'9')('0'..'9')*              
         ;
BOOLEAN : 'true' | 'false'
        ;
WS       : ('\t' | '\n' | '\r' | ' ') -> skip
         ;
