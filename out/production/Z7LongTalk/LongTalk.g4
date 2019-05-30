grammar LongTalk;

program: 'program do' statement* 'stop' EOF;

statement: ifstatement
         | declaration
         | assignment
         | printstatement
         ;
ifstatement: 'if' NEGATION? expression 'do' statement* ('else if' expression 'do' statement*)* ('else do' statement*)? 'stop';

declaration: 'remember that' IDENTIFIER ('is a' | 'is an') ('int' | 'string' | 'boolean');

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