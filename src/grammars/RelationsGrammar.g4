grammar RelationsGrammar;

csvFile : hdr row+ EOF ;
hdr : field ',' field ',' field ',' field ',' field ',' field ',' field '\r'? '\n' ;
row : IDENTIFIER ',' type ',' name ',' field ',' IDENTIFIER ',' IDENTIFIER ',' field '\r'? '\n'? ;
field : STRING ;
name : STRING ;

type : ASSOCIATIONRELATIONSHIP
        | INFLUENCERELATIONSHIP
        | TRIGGERINGRELATIONSHIP;

/** Archi relation types */
ASSOCIATIONRELATIONSHIP : '"AssociationRelationship"';
INFLUENCERELATIONSHIP : '"InfluenceRelationship"';
TRIGGERINGRELATIONSHIP : '"TriggeringRelationship"';


PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
ID : 'id-';
IDENTIFIER : '"' ID (LOWERCASE | DIGIT)+ '"' ;
STRING : '"' ('""' | ~'"')* '"' ;
fragment LOWERCASE : [a-z];
fragment DIGIT : [0-9];