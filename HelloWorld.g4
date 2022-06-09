grammar HelloWorld;
greeting: 'Hello' identifier;
identifier: STRINGNUMBER;
NUMBER: [0-9]+;
STRINGNUMBER: [a-zA-Z0-9]+;
ID: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;