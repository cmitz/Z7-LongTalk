grammar LongTalk;

program: 'program do' statement* 'stop' EOF;

statement: ifstatement
         | indexedloopstatement
         | whileloopstatement
         | declaration
         | assignment
         | printstatement
         ;
ifstatement: 'if' NEGATION? compareExpression=expression thenstatements+=statement* elseifstatement* ('else' elsestatements+=statement*)? 'stop';
elseifstatement: 'else if' NEGATION? compareExpression=expression thenstatements+=statement*;

indexedloopstatement: 'indexed loop from' from=expression 'to' to=expression 'as' IDENTIFIER 'do' thenstatements+=statement* 'stop';

whileloopstatement: 'loop while' compareExpression=expression 'do' thenstatements+=statement* 'stop';

declaration: 'remember that' IDENTIFIER ('is a' | 'is an') declaredType=('int' | 'string' | 'boolean');

assignment: IDENTIFIER 'is now' expression;

printstatement: 'print' expression;

expression: '(' expression ')'                                      # ExParenthesis
          | left=expression op=MATHOP right=expression              # ExMathOp
          | left=expression op=LOGICOP right=expression             # ExLogicOp
          | left=expression and=('&&' | '||') right=expression      # ExAndOrOp
          | IDENTIFIER                                              # ExIdentifier
          | BOOLEAN                                                 # ExBooleanLiteral
          | INT                                                     # ExIntegerLiteral
          | STRING                                                  # ExStringLiteral
          ;

NEGATION: '!';
MATHOP: '*' | '/' | '+' | '-';
LOGICOP: '<' | '<=' | '>'| '>=' | '==' | '!=';

BOOLEAN: 'TRUE' | 'FALSE';
INT: '0' | [1-9][0-9]*;
STRING: '"' ~('\n'|'\r')* '"';
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;

WS: [\r\n\t ]+ -> skip;
COMMENT: '#'.*? [\n\r]+ -> skip;