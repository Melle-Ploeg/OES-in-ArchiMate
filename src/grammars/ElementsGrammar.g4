grammar ElementsGrammar;

csvFile : hdr row+ EOF ;
hdr : field ',' field ',' field ',' field ',' field '\r'? '\n' ;
row : IDENTIFIER ',' type ',' name ',' field ',' field '\r'? '\n'? ;
field : STRING ;
name : STRING ;

type : object
        | event
        | other
        | ARCHIMATEMODEL ;

object : RESOURCE
        | BUSINESSOBJECT
        | CONTRACT
        | PRODUCT
        | DATAOBJECT
        | COMMUNICATIONNETWORK
        | DEVICE
        | DISTRIBUTIONNETWORK
        | EQUIPMENT
        | FACILITY
        | NODE
        | SYSTEMSOFTWARE ;

event : BUSINESSCOLLABORATION
        | BUSNESSEVENT
        | BUSSINESSFUNCTION
        | BUSINESSINTERACTION
        | BUSINESSPROCESS
        | BUSINESSSERVICE
        | APPLICATIONCOLLABORATION
        | APPLICATIONPROCESS
        | APPLICATIONSERVICE
        | TECHNOLOGYCOLLABORATION
        | TECHNOLOGYEVENT
        | TECHNOLOGYFUNCTION
        | TECHNOLOGYINTERACTION
        | TECHNOLOGYPROCESS
        | TECHNOLOGYSERVICE
        | OUTCOME ;

other : ASSESSMENT
        | CONSTRAINT
        | VALUE ;

/** Other element types */
ASSESSMENT : '"Assessment"';
CONSTRAINT : '"Constraint"';
VALUE : '"Value"';
ARCHIMATEMODEL : '"ArchimateModel"';

/** Archi object types */
RESOURCE : '"Resource"';
BUSINESSOBJECT : '"BusinessObject"';
CONTRACT : '"Contract"';
PRODUCT : '"Product"';
DATAOBJECT : '"DataObject"';
COMMUNICATIONNETWORK : '"CommunicationNetwork"';
DEVICE : '"Device"';
DISTRIBUTIONNETWORK : '"DistributionNetwork"';
EQUIPMENT : '"Equipment"';
FACILITY : '"Facility"';
NODE : '"Node"';
SYSTEMSOFTWARE : '"SystemSoftware"';

/** Archi event types */
BUSINESSCOLLABORATION : '"BusinessCollaboration"';
BUSNESSEVENT : '"BusinessEvent"';
BUSSINESSFUNCTION : '"BusinessFunction"';
BUSINESSINTERACTION : '"BusinessInteraction"';
BUSINESSPROCESS : '"BusinessProcess"';
BUSINESSSERVICE : '"BusinessService"';
APPLICATIONCOLLABORATION : '"ApplicationCollaboration"';
APPLICATIONPROCESS : '"ApplicationProcess"';
APPLICATIONSERVICE : '"ApplicationService"';
TECHNOLOGYCOLLABORATION : '"TechnologyCollaboration"';
TECHNOLOGYEVENT : '"TechnologyEvent"';
TECHNOLOGYFUNCTION : '"TechnologyFunction"';
TECHNOLOGYINTERACTION : '"TechnologyInteraction"';
TECHNOLOGYPROCESS : '"TechnologyProcess"';
TECHNOLOGYSERVICE : '"TechnologyService"';
OUTCOME : '"Outcome"';

/** Punctuation */
PAR : '"';
COM : ',';
ID : 'id-';
IDENTIFIER : '"' ID (LOWERCASE | DIGIT)+ '"' ;
STRING : '"' ('""' | ~'"')* '"' ;
NUMBER : DIGIT+ ;
DOUBLE : DIGIT ('.' DIGIT)? ;
fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
fragment DIGIT : [0-9];