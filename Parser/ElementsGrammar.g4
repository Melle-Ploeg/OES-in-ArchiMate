grammar ElementsGrammar;

line : PAR IDENTIFIER PAR COM PAR (object | event)PAR COM PAR NAME PAR COM PAR PAR COM PAR PAR ;

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
        | SYSTEMSOFTWARE;

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
        |OUTCOME;

NAME : (LOWERCASE | UPPERCASE | DIGIT)+;


/** Archi object types */
RESOURCE : 'Resource';
BUSINESSOBJECT : 'BusinessObject';
CONTRACT : 'Contract';
PRODUCT : 'Product';
DATAOBJECT : 'DataObject';
COMMUNICATIONNETWORK : 'CommunicationNetwork';
DEVICE : 'Device';
DISTRIBUTIONNETWORK : 'DistributionNetwork';
EQUIPMENT : 'Equipment';
FACILITY : 'Facility';
NODE : 'Node';
SYSTEMSOFTWARE : 'SystemSoftware';

/** Archi event types */
BUSINESSCOLLABORATION : 'BusinessCollaboration';
BUSNESSEVENT : 'BusinessEvent';
BUSSINESSFUNCTION : 'BusinessFunction';
BUSINESSINTERACTION : 'BusinessInteraction';
BUSINESSPROCESS : 'BusinessProcess';
BUSINESSSERVICE : 'BusinessService';
APPLICATIONCOLLABORATION : 'ApplicationCollaboration';
APPLICATIONPROCESS : 'ApplicationProcess';
APPLICATIONSERVICE : 'ApplicationService';
TECHNOLOGYCOLLABORATION : 'TechnologyCollaboration';
TECHNOLOGYEVENT : 'TechnologyEvent';
TECHNOLOGYFUNCTION : 'TechnologyFunction';
TECHNOLOGYINTERACTION : 'TechnologyInteraction';
TECHNOLOGYPROCESS : 'TechnologyProcess';
TECHNOLOGYSERVICE : 'TechnologyService';
OUTCOME : 'Outcome';

/** Punctuation */
PAR : '"';
COM : ',';
ID : 'id-';
IDENTIFIER : ID (LOWERCASE | DIGIT)+;
fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
fragment DIGIT : [0-9];