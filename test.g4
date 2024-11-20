grammar test;

program: FUNC * EOF;
FUNC : ID* '='* ID '(' SUBFUBCTION* (',' SUBFUBCTION)*  ')' [\n]*;
SUBFUBCTION :ID '(' ID* (',' ID)*  ')' [\n]* | ID | NUMBER;
NUMBER : [0-9]+ ('.' [0-9])*;
ID: [a-zA-Z]+;
WS : [ \t\r\n] ->skip;