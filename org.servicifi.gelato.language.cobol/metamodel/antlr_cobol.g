/*
 * This Cobol grammar inspired cobol.ecore and cobol.cs
 * (more information at the end of the file)
 */
grammar Cobol;
options {backtrack=true; memoize=true;}

@lexer::members {
  protected boolean enumIsKeyword = true;
  protected boolean assertIsKeyword = true;
}

/* Naming Conventions:
 * 1- water for each production rule: 
 * 'water' + hyphen + the first letters of the production rule in small letters
 *
 */

compilationGroup
  : ( compilationUnit )+
  ;

// ========================================================
// copybook
// ........................................................

copybook
  : copybookHoldingData | copybookHoldingBehaviour
  ;

// ========================================================
// copybookHoldingData
// ........................................................

copybookHoldingData
  : ( dataDescriptionEntry
    | specialNameStatement
    | ( fileDescriptionEntry ( recordDescriptionEntry )*  )
    | ( selectStatement ( '.' )? )
    | copyStatement
    | replaceStatement
    | ( execStatement ( '.' )? )
    )+
  ;

// ========================================================
// copybookHoldingBehaviour
// ........................................................
 
copybookHoldingBehaviour
  : ( sentence )*
    ( paragraph )*
    ( section )*
  ;

// ========================================================
// compilationUnit
// ........................................................

compilationUnit
  : identificationDivision
    ( environmentDivision )?
    ( dataDivision )?
    ( procedureDivision )?
    ( ( compilationUnit )* 'END' 'PROGRAM' programName '.' )?
  ;

 
// ========================================================
// identificationDivision
// ........................................................

identificationDivision
  : ( 'ID'  | 'IDENTIFICATION' ) 'DIVISION' '.'
  		'PROGRAM-ID' ( '.' )?  programName
        programAttributes?
        ( '.' )?
        // water-id refers to descriptive information about the program
        (water-id)*
    ;

//'Recursive' clause is Enterprise Cobol-specific
// ========================================================
// environmentDivision
// Changed the grammar to only capture the attributes - order doesn't matter
// ........................................................  
  
programAttributes 
  : ( 'IS' )?
    ( ( 'RECURSIVE' ) | ( 'INITIAL' ) | ( 'COMMON' ) )*
    ( 'PROGRAM' )?
  ;
  
water-id 
  :	'AUTHOR' 
  | 'INSTALLATION' 
  | 'DATE-WRITTEN' 
  | 'DATE-COMPLETED' 
  | 'SECURITY'
  | DOT
  | CommentEntry
  ;
	
programName
  :  cobolWord | alphanumeric
  ;
  
// ========================================================
// environmentDivision
// ........................................................  
  
environmentDivision
  : 'ENVIRONMENT' 'DIVISION' '.'
    ( configurationSection )?
    ( ioSection )?
  ;   
  
// ========================================================
// configurationSection
// ........................................................
// Deliberately made the paragraphs repetitive to conform to the Koopa grammar
// According to the Enterprise cobol, the ordering of the paragraphs:
// source, object, special and last repository 

configurationSection
  : 'CONFIGURATION' 'SECTION' '.'
        ( sourceComputerParagraph
        | objectComputerParagraph
        | specialNamesParagraph
        | repositoryParagraph
        )*
  ;
  
// ========================================================
// sourceComputerParagraph
// ........................................................

sourceComputerParagraph
  : 'SOURCE-COMPUTER' '.'
   		// We are not interested in the computerName, the name
  		// of the computer on which the source is to be compiled.
     ( computerName ( withDebuggingMode )? '.' )?
  ;
  
// ========================================================
// withDebuggingMode
// ........................................................

withDebuggingMode
  : ( 'WITH' )? 'DEBUGGING' 'MODE'
  ;
  
// ========================================================
// objectComputerParagraph
// ........................................................

objectComputerParagraph
  : 'OBJECT-COMPUTER' '.'
  	( computerName 
  	( water-memorySize | water-programCollatingSequence )* 
  	'.' )? 
  ;  
 
//waterObjectComputerParagraph
//  : 'MEMORY' | 'SIZE' | integer | 'WORDS' | 'CHARACTERS' 
//  | 'MODULES' | 'PROGRAM' | 'COLLATING' | 'SEQUENCE' | 'IS' 
//  | alphabetName | 'SEGMENT-LIMIT'| priorityNumber
//  ;
  
// ========================================================
// water-memorySize
// ........................................................
water-memorySize
  : 'MEMORY' | 'SIZE' | integer 
  	| 'WORDS' | 'CHARACTERS' | 'MODULES'
  ; 

// ========================================================
// programCollatingSequence
// ........................................................
 
water-programCollatingSequence
  : 'PROGRAM' | 'COLLATING' | 'SEQUENCE' | 'IS' 
  | alphabetName | 'SEGMENT-LIMIT'| priorityNumber
  ; 
  
// ========================================================
// specialNamesParagraph
// ........................................................

specialNamesParagraph
  : 'SPECIAL-NAMES' '.'        
     //This seperator period is optional when no clauses are selected.
     //If any of the clauses is selected, 
     // the period must be inserted after the last clause.
     // reformatted this to make it into one rule
     //( ( '.' )? 
     //| (  specialNameStatement )+ '.')
     ( specialNameStatement )* ( '.' )?
     
  ;

// ========================================================
// specialNameStatement
// ........................................................
// Deliberately made the paragraphs repetitive to conform to the Koopa grammar
// According to the Enterprise cobol, the ordering of the clauses:
// from top to bottom

specialNameStatement
  : ( environmentStatement
    | classIs
    | symbolicChars
    | alphabetIs
    | currencySignIs
    | water-specialNames
    )
  ;

// ========================================================
// environmentIs
// ........................................................

environmentStatement
  :	environmentIs | switchStatusIs
;

environmentIs
  : environmentName ('IS')? mnemonicName
 ;

switchStatusIs
  : upsiSwitch 
  	(
  	  ( ('IS')? mnemonicName ( switchStatusStatement )?  )
  	  | ( switchStatusStatement )
  	)
  	
// ========================================================
// switchStatusStatement
// ........................................................
switchStatusStatement
  : ( onStatusIs | offStatusIs )+
  ;
   
onStatusIs
  : 'ON' ( 'Status' )? ( 'IS' )? conditionName
  ;
   
offStatusIs
  : 'OFF' ( 'Status' )? ( 'IS' )? conditionName
  ;

// ========================================================
// currencySignIs
// ........................................................

currencySignIs
  : 'CURRENCY' 'SIGN' ( 'IS' )? currencySign
  ;

// waterSpecialNames
//  : 'DECIMAL-POINT' | 'IS' | 'COMMA' | 
//  | 'XML-SCHEMA' | literal | xmlSchemaName | externalFileId
//  ;
  	
// ========================================================
// water-specialNames
// ........................................................
water-specialNames
  : water-decimalIsComma |  water-xmlSchema
  ;

water-decimalIsComma
  : 'DECIMAL-POINT' | 'IS' | 'COMMA'
  ;
  
water-xmlSchema
  : 'XML-SCHEMA' | 'IS' | xmlSchemaName | literal | externalFileId
  ;  

// ========================================================
// classIs
// ........................................................

classIs
  : 'CLASS' identifier ( 'IS' )?
        ( throughLiteral | literal )+
  ;

// ========================================================
// literalRange
// ........................................................

literalRange
  : throughLiteral | ( alsoLiteral )+ 
  ;
  
// ========================================================
// throughLiteral
// ........................................................
 
throughLiteral
  : literal ( 'THROUGH' | 'THRU' ) literal
  ;
  
alsoLiteral
  : 'ALSO' literal
  ;

// ========================================================
// symbolicChars
// ........................................................

symbolicChars
  : 'SYMBOLIC' ( 'CHARACTER' | 'CHARACTERS' )?
  	symbolic+
    // IN phrase specifies the character set that
    // the symbolic  characters belong to 
  	( 'IN' identifier )?
  ;

// ========================================================
// symbolic
// ........................................................

symbolic
  : ( literal )+ ( 'IS' | 'ARE' )? ( integer )+
  ;
  
// ========================================================
// alphabetIs
// ........................................................

alphabetIs
  : 'ALPHABET' identifier ( 'IS' )? alphabetType
  ;

// ========================================================
// alphabetType
// ........................................................

alphabetType
  : ( standard1AlphabetType
      | standard2AlphabetType
      | nativeAlphabetType
      | ebcdicAlphabetType
      | explicitAlphabetType
      | codeNameAlphabetType
    )
  ;

// ========================================================
// standard1AlphabetType
// ........................................................

standard1AlphabetType
  : 'STANDARD-1'
  ;

// ========================================================
// standard2AlphabetType
// ........................................................

standard2AlphabetType
  : 'STANDARD-2'
  ;

// ========================================================
// nativeAlphabetType
// ........................................................

nativeAlphabetType
  : 'NATIVE'
  ;
  
// ========================================================
// ebcdidAlphabetType
// ........................................................

ebcdicAlphabetType
  : 'EBCDIC'
  ;  

// ========================================================
// explicitAlphabetType
// ........................................................

explicitAlphabetType
  : ( literalRange )+
  
  ;

// ========================================================
// codeNameAlphabetType
// ........................................................

codeNameAlphabetType
  : cobolWord
  ;


// ========================================================
// environmentName
// ........................................................

environmentName
  : //System Logical Input Unit - Allowed in ACCEPT
  	( 'SYSIN' | 'SYSIPT' ) 
  	
  	//System Logical Output Unit - Allowed in DISPLAY
    | ( 'SYSOUT' | 'SYSLIST' | 'SYSLST' )
   
    //System Punch Device - Allowed in DISPLAY 
    | ( 'SYSPUNCH' | 'SYSPCH' )
   
    //Console - Allowed in ACCEPT and DISPLAY
    | 'CONSOLE'
   
    //Skip to Channel 1-12 - Allowed in WRITE ADVANCING
    | ( 'C01' | 'C02' | 'C03' | 'C04' | 'C05' | 'C06'  
      | 'C07' | 'C08' | 'C09' | 'C10' | 'C11' | 'C12' )
   	  
    //Suppress spacing - Allowed in WRITE ADVANCING	  
    | 'CSP'
   
    //Pocket select 1-5 - Allowed in WRITE ADVANCING
    | ( 'S01' | 'S02' | 'S03' | 'S04' | 'S05')
   
    //Advanced Function Printing - Allowed in WRITE ADVANCING 
    | 'AFP-5A'
 ;
 
upsiSwitch
  : ( 'UPSI-0' | 'UPSI-1' | 'UPSI-2' | 'UPSI-3' 
  	| 'UPSI-4' | 'UPSI-5' | 'UPSI-6' | 'UPSI-7' )
  ;
 
 
 // ========================================================
// mnemonicName - Is this true?
// ........................................................

mnemonicName
  : cobolWord | identifier
  ;
  
  
// ========================================================
// respositoryParagraph
// ........................................................  
  
repositoryParagraph
  : 'REPOSITORY' '.'  (classReference )*
  ;
  
classReference
  : 'CLASS' classname 
  	( ('IS')? (externalClassname | javaArrayClassReference)  )?
  ;
  
// ========================================================
// ioSection
// ........................................................

ioSection
  : 'INPUT-OUTPUT' 'SECTION'  '.'
     fileControlParagraph
     ( ioControlParagraph )?
  ;  

// ========================================================
// fileControlParagraph
// ........................................................

fileControlParagraph
  : 'FILE-CONTROL' '.'
    ( selectStatement
    | copyStatement
    )*
  ;

// ========================================================
// selectStatement
// ........................................................

selectStatement
  : selectClause assignClause
    ( fileStatusClause
  //  | keyClause
  //  | alternateKeyClause
  //  | passwordClause
  //  | recordDelimiterClause
  //  | paddingCharacterClause
    | water-selectStatement
    )*  '.'
  ;
  
// ========================================================
// selectClause
// ........................................................

selectClause
  : 'SELECT' ( 'OPTIONAL' )? fileName
  ;

// ========================================================
// assignClause
// ........................................................

assignClause
  : 'ASSIGN' ( 'TO' )? assignmentName
  ;
 
// ========================================================
// fileStatusClause
// ........................................................
 
fileStatusClause
  : ( 'FILE' )? 'STATUS' ( 'IS' )?
        dataName  ( dataName )?
  ;

// waterSelectStatementWithFileStatusOnly
// : 'PASSWORD' |  dataName
//  | 'ALTERNATE' | 'RECORD' |'KEY'
//  | 'RELATIVE' | 'DELIMITER' | 'STANDARD-1'
//  | 'PADDING' | 'CHARACTER' | literal
//  | 'RESERVE' | integer | 'AREA'| 'AREAS'
//  | 'ACCESS' | 'MODE' | 'IS' | 'SEQUENTIAL' 
//  | 'RANDOM' | 'DYNAMIC' | 'RELATIVE'
//  | 'ORGANIZATION' | 'WITH' | 'DUPLICATES'
//  ;  

  
  
// ========================================================
// passwordClause
// ........................................................

passwordClause
  : 'PASSWORD' ( 'IS' )?  dataName
  ;

// ========================================================
// KeyClause - Record Key, Alternate Record Key, Relative Key
// ........................................................

keyClause
  : alternateKeyClaue | relativeKeyClause | recordKeyClause
  ;

alternateKeyClause
  : 'ALTERNATE' ( 'RECORD' )? ( 'KEY' )? ( 'IS' )? dataName
  	( ('WITH')? 'DUPLICATES' )?
  ;
  
relativeKeyClause
  : 'RELATIVE'  ( 'KEY' )? ( 'IS' )? dataName
  ;
  
recordKeyClause
  : 'RECORD' ( 'KEY' )? ( 'IS' )? dataName
  ;

// ========================================================
// recordDelimiterClause
// ........................................................
// Do something about the standard-1  
recordDelimiterClause
  : 'RECORD' 'DELIMITER' (dataname | 'STANDARD-1' )
  ;
 
// ========================================================
// paddingCharacterClause
// ........................................................ 
  
paddingCharacterClause  
  : 'PADDING' ( 'CHARACTER' )? ( 'IS' )? (dataName | literal) 
  ;
   
// ========================================================
// water-selectStatement
// ........................................................ 

water-selectStatement
  : water-reserve |  water-organizationClause
  | water-accessMode | water-alternateKey
  ;
  
water-reserve
  : 'RESERVE' | integer | 'AREA'| 'AREAS'
  ;

water-accessMode
  : 'ACCESS' | 'MODE' | 'IS' | 'SEQUENTIAL' 
  | 'RANDOM' | 'DYNAMIC' | 'RELATIVE' 
  ;
  
water-organizationClause
  : 'ORGANIZATION' | 'IS' | 'RELATIVE' 
  | 'LINE' | 'SEQUENTIAL' | 'INDEXED'
  ;
  
// ========================================================
// ioControlParagraph
// ........................................................

ioControlParagraph
  : 'I-O-CONTROL' '.'
     ( water-qsam | water-vsam 
     | water-linesequential | water-sortmerge )*
  ;  

//waterIOControlParagraph
//  : 'RERUN' | 'ON' | 'OF' | 'RECORD' | 'RECORDS'
//  | 'EVERY' | 'SAME' | 'AREA' | 'FOR' 
//  | 'MULTIPLE' | 'FILE' | 'TAPE' | 'CONTAINS'
//  | 'POSITION'  | 'APPLY' | 'WRITE-ONLY'
//  | 'SORT'  | 'SORT-MERGE'
//  |  'REEL' | 'UNIT' | integer | assignmentname | filename
//  ;


water-qsam
  : 'RERUN' | 'ON' | 'OF' | 'RECORD' | 'RECORDS'
  | 'EVERY' | 'SAME' | 'AREA' | 'FOR'
  | 'MULTIPLE' | 'FILE' | 'TAPE' | 'CONTAINS'
  | 'POSITION'  | 'APPLY' | 'WRITE-ONLY'
  |  'REEL' | 'UNIT' | integer | assignmentname | filename
  ;
  
water-vsam
  : 'RERUN' | 'ON' | 'EVERY' | 'SAME' | 'RECORD' 
  | 'RECORDS' | 'AREA' | 'FOR' | 'OF' 
  | assignmentname | filename | integer 
  ;    

water-linesequential
  : 'SAME' | 'RECORD' | 'AREA' | 'FOR' | filename
  ;
  
water-sortmerge
  : 'RERUN' | 'ON' | 'SAME' | 'RECORD' 
  | 'SORT'  | 'SORT-MERGE' | 'AREA' 
  | 'FOR' | assignmentname | filename 
  ;  

// ========================================================
// dataDivision
// ........................................................

dataDivision
  : 'DATA' 'DIVISION' '.'
        ( fileSection )?
        ( workingStorageSection )?
        ( localStorageSection )?
        ( linkageSection )?
  ;


// ========================================================
// fileSection
// ........................................................

fileSection
  : 'FILE' 'SECTION' '.'
     ( copyStatement 
     | ( fileDescriptionEntry ( recordDescriptionEntry )* ) )*
  ;
  
fileDescriptionEntry
  : fdFileDescriptionEntry | sdFileDescriptionEntry
  ;

// ========================================================
// fdFileDescriptionEntry
// ........................................................

fdFileDescriptionEntry
  : 'FD' fileName ( external | global | water-fileDescriptioneEntry )*  '.'
  ;
  
// ========================================================
// sdFileDescriptionEntry
// ........................................................

sdFileDescriptionEntry
  : 'SD' fileName ( water-fileDescriptioneEntry )*  '.'
  ;  

// ========================================================
// water-FileDescription
// ........................................................

water-fileDescriptioneEntry
  : water-blockContains | water-codeSet | water-dataRecords	| 
  	water-labelRecords 	| water-linage 	| water-record		|
  	water-recordingMode | water-valueOf | water-report
  ;

//The water production rule corresponding to the File Description Entry
//waterFileDescriptionEntry
//  : 'BLOCK' | 'CONTAINS' | 'TO' | 'CHARACTERS' | 'RECORDS'
//  | integer | 'CODE-SET' | 'IS' | alphabetName | 'DATA' 
//  | 'RECORD' | 'ARE' | dataName | 'LABEL' |  'OMITTED'  
//  | 'STANDARD' | 'LINAGE' | 'LINES' | 'WITH' | 'FOOTING' 
//  | 'AT' | 'TOP' | 'BOTTOM' | 'CHARACTERS' | 'VARYING' 
//  | 'IN' | 'SIZE' | 'FROM' | 'DEPENDING' | 'ON' | filename
//  | 'RECORDING' | 'MODE' | 'IS' | 'F' | 'V' | 'U' | 'S'
//  | 'VALUE' | 'OF' | 'IDENTIFICATION' | 'ID' | cobolWord
//  | 'REPORT' | 'REPORTS' | reportName
//  ;
  
waterlinesAtTop
  : 'LINES' | 'AT' | 'TOP' | dataName | integer
  ;
  
waterlinesAtBottom
  : 'LINES' | 'AT' | 'BOTTOM' | dataName | integer
 
 
 ;  
waterblockContains
  : 'BLOCK' | 'CONTAINS' |  integer | 'TO' |
  	'CHARACTERS' | 'RECORDS'
  	;

watercodeSet
  : 'CODE-SET' | 'IS' | alphabetName
  ;

waterdataRecords
  : 'DATA' | 'RECORD' | 'RECORDS'
     'IS' | 'ARE' | dataName
  ;

waterlabelRecords
  : 'LABEL' | 'RECORD' | 'RECORDS' | 'IS' | 
  	'ARE' | 'OMITTED'  | 'STANDARD' | dataName
  ;

waterlinage
  : 'LINAGE' | 'IS' | dataName | integer | 'LINES' | 
  	 water-footing | water-linesAtTop | water-linesAtBottom
  ;
 
waterfooting
  : 'WITH' | 'FOOTING' | 'AT' | dataName | integer  
  ;
  
waterlinesAtTop
  : 'LINES' | 'AT' | 'TOP' | dataName | integer
  ;
  
waterlinesAtBottom
  : 'LINES' | 'AT' | 'BOTTOM' | dataName | integer
  ;
  
waterrecord
  : 'RECORD' | 'CONTAINS' | 'TO' | integer | 'CHARACTERS'
  	| 'IS' | 'VARYING' | 'IN' | 'SIZE' | 'FROM'
  	| 'DEPENDING' | 'ON' | filename
  ;

waterrecordingMode
  : 'RECORDING' | 'MODE' | 'IS' | 'F' | 'V' | 'U' | 'S'
  ;

watervalueOf
  : 'VALUE' | 'OF' | 'IDENTIFICATION' | 'ID' | cobolWord
    | 'IS' | dataName | literal
  ;

//This isn't part of the grammar specification of Enterprise Cobol
water-report
  : 'REPORT' | 'REPORTS' | 'IS' | 'ARE' | reportName
  ; 
    	
// ========================================================
// recordDescriptionEntry
// ........................................................

recordDescriptionEntry
  : dataDescriptionEntry | copyStatement
  ;

// ========================================================
// dataDescriptionEntry
// ........................................................
  
dataDescriptionEntry
  : dataDescriptionEntry_default  
  	| dataDescriptionEntry_level66
  	| dataDescriptionEntry_level77
    | dataDescriptionEntry_level88
  ;  
    
// ========================================================
// dataDescriptionEntry_default
// ........................................................
  
dataDescriptionEntry_default
  :  levelNumber ( dataName )?
        ( redefines )?
        ( external
        | global
        | groupUsage
        | occurs
        | picture
        | usage
        | value
        | water-dataDescriptionEntry
        )*
        '.'
  ;
  
// ========================================================
// dataDescriptionEntry_level66
// ........................................................

dataDescriptionEntry_level66
  : '66' dataName renames '.'
  ;
  
// ========================================================
// renames
// ........................................................
  
renames
  : 'RENAMES' throughDataName
  ;  

// ========================================================
// throughDataName
// ........................................................

throughDataName
  : dataName ( qualifier )* 
  	( ( 'THROUGH' | 'THRU' )  dataName ( qualifier )* )?  
  ;  

// ========================================================
// dataDescriptionEntry_77
// ........................................................
  
dataDescriptionEntry_level77
  :  '77' ( dataName )?
        ( redefines )?
        ( external
        | global
        | groupUsage
        | occurs
        | picture
        | usage
        | value
        | water-dataDescriptionEntry
        )*
        '.'
  ;

// ========================================================
// dataDescriptionEntry_level88 - conditionName: CobolWord
// ........................................................

dataDescriptionEntry_level88
  : '88' conditionName
    ( ( 'VALUE'  ( 'IS' )?  )  | ( 'VALUES' ( 'ARE' )? ) )
        ( literal | throughLiteral )+  '.'
  ;  
  
// ========================================================
// external
// ........................................................

external
  : ( 'IS' )? 'EXTERNAL'
  ;  

// ========================================================
// global
// ........................................................

global
  : ( 'IS' )? 'GLOBAL'
  ;

// ========================================================
// groupUsage
// ........................................................

groupUsage
  : 'GROUP-USAGE' ( 'IS' )? 'NATIONAL'
  ; 

// ========================================================
// picture
// ........................................................

picture
  : ( 'PIC' | 'PICTURE' ) ( 'IS' )?  pictureString
  ;

// ========================================================
// redefines
// ........................................................

redefines
  : 'REDEFINES' cobolWord  
  ;
    
// ========================================================
// occurs
// ........................................................

occurs
  : 'OCCURS' integer ( 'TO'  integer )? ( 'TIMES' )?
        ( ( 'DEPENDING' ( 'ON' )? dataName ( qualifier )* ) )?
        ( ( 'ASCENDING' | 'DESCENDING' )
          ( 'KEY' )? ( 'IS' )?
          ( dataName  ( qualifier )* )+
        )*
        ( 'INDEXED' ( 'BY' )? ( indexName )+ )?
  ;


// ========================================================
// usage
// ........................................................

usage
  : ( 'USAGE'( 'IS' )? )?
    ( 'BINARY'
     | 'COMPUTATIONAL'
     | 'COMP'
     | 'DISPLAY'
     | 'DISPLAY-1'
     | 'INDEX'
     | 'PACKED-DECIMAL'
     | 'COMPUTATIONAL-1'
     | 'COMP-1'
     | 'COMPUTATIONAL-2'
     | 'COMP-2'
     | 'COMPUTATIONAL-3'
     | 'COMP-3'
     | 'COMPUTATIONAL-4'
     | 'COMP-4'
     | 'COMPUTATIONAL-5'
     | 'COMP-5'
     | 'POINTER'
     | 'PROCEDURE-POINTER'
     | 'FUNCTION-POINTER'
     | 'NATIONAL'
    )
    ('NATIVE')?
  ;
  
// ========================================================
// value
// ........................................................

value
  : 'VALUE' ( 'IS' )? literal  
  ;

// waterDataDescriptionEntry
//  : 'BLANK' | 'WHEN' | 'ZERO' | 'ZEROS' | 'ZEROES'
//  | 'JUSTIFIED' | 'JUST' | 'RIGHT' | 'SIGN' | 'IS' 
//  | 'LEADING' | 'TRAILING' | 'SEPARATE' | 'CHARACTER'
//  | 'DATE' | 'FORMAT' | datePattern | 'SYNCHRONIZED' 
//  | 'SYNC' | 'LEFT' 
//  ;
  
//dateFormat Added
water-dataDescriptionEntry
  : water-blankWhenZero | water-justified | water-sign 
  | water-dateFormat | water-sync
  ;
  
water-sync
  :  'SYNCHRONIZED' | 'SYNC' | 'LEFT' | 'RIGHT'   
  ;  

water-blankWhenZero
  : 'BLANK' | 'WHEN' | 'ZERO' | 'ZEROS' | 'ZEROES'
  ;

water-justified
  : 'JUSTIFIED' | 'JUST' | 'RIGHT'
  ;
  
water-sign 
  : 'SIGN' | 'IS' | 'LEADING' | 'TRAILING'
  | 'SEPARATE' | 'CHARACTER'
  ;

  
water-dateFormat
  : 'DATE' | 'FORMAT' | 'IS' | datePattern
  ;  
    
  
// ========================================================
// localStorageSection
// ........................................................
  
localStorageSection
  : 'LOCAL-STORAGE' 'SECTION' '.'
        ( recordDescriptionEntry
        | replaceStatement
        | ( execStatement ( '.' )? )
        )*
  ;

// ========================================================
// workingStorageSection
// ........................................................

workingStorageSection
  : 'WORKING-STORAGE' 'SECTION' '.'
        ( recordDescriptionEntry
        | replaceStatement
        | ( execStatement ( '.' )? )
        )*
  ;

// ========================================================
// linkageSection
// ........................................................

linkageSection
  : 'LINKAGE' 'SECTION' '.'
        ( recordDescriptionEntry
        | replaceStatement
        | ( execStatement ( '.' )? )
        )*
  ;  


// ========================================================
// procedureDivision
// ........................................................

procedureDivision
  : 'PROCEDURE' 'DIVISION'
     ( usingPhrase )? ( returningPhrase )? '.'
        ( declaratives )?
        ( sentence )*
        ( paragraph )*
        ( section )*
  ;

// ========================================================
// declaratives
// ........................................................

declaratives
  : 'DECLARATIVES' '.'
    ( declarativeSection )+
    'END' 'DECLARATIVES' '.'
  ;

// ========================================================
// declarativeSection
// ........................................................

declarativeSection
  : sectionName 'SECTION' '.'
    useStatement
    ( paragraph )*
  ;

// ========================================================
// useStatement
// ........................................................

useStatement
  : 'USE'
    ( errorDeclarative | debugDeclarative | labelDeclarative )  
    '.'
  ;
  
water-useStatement
   : 'GLOBAL' | 'AFTER' | 'STANDARD' | 'ERROR' | 'EXCEPTION' 
    | 'PROCEDURE' | 'ON' |  'INPUT' | 'OUTPUT' | 'I-O' 
    | 'EXTEND' | fileName | 'FOR' | 'DEBUGGING' | procedureName
    | 'ALL' | 'PROCEDURES' | 'BEGINNING' | 'ENDING'
    | 'FILE' | 'REEL' | 'UNIT' | 'LABEL'
;
// ========================================================
// errorDeclarative
// ........................................................

errorDeclarative
  : ( 'GLOBAL' )?  'AFTER' ( 'STANDARD' )?
    ( 'ERROR' | 'EXCEPTION'  )
    'PROCEDURE' ( 'ON' )?
    ( 'INPUT' | 'OUTPUT' | 'I-O' | 'EXTEND' | fileName )+
  ;

// ========================================================
// debugDeclarative
// ........................................................

debugDeclarative
  : ( 'FOR' )? 'DEBUGGING' ( 'ON' )?
    ( procedureName
    | ( 'ALL' 'PROCEDURES' ) )+
  ;

// ========================================================
// labelDeclarative
// ........................................................

labelDeclarative
  : ( 'GLOBAL' )? 'AFTER'
    ( 'STANDARD' )?
    ( 'BEGINNING' | 'ENDING' )?
    ( 'FILE' | 'REEL' | 'UNIT' )?
    'LABEL'  'PROCEDURE' ( 'ON' )?
    ( 'INPUT' | 'OUTPUT' | 'I-O' | 'EXTEND' | fileName )+
  ;

// ========================================================
// dataReference - data is reference by default
// ........................................................

dataReference
  : ( ( 'BY' )?  'REFERENCE' )? dataName
  ;

// ========================================================
// dataValue
// ........................................................

dataValue
  : ( 'BY' )? 'VALUE' dataName
  ;

// ========================================================
// returningPhrase
// ........................................................

returningPhrase
  : 'RETURNING' dataName
  ;
  
// ========================================================
// section
// ........................................................

section
  : sectionName 'SECTION' ( priorityNumber )?  '.'
    ( sentence )*
    ( paragraph )*
  ;
  
// ========================================================
// paragraph
// ........................................................

paragraph
  : paragraphName '.' ( sentence )*
  ;
 
// ========================================================
// sentence
// some statements amount to a sentence, 
// such as altered Goto, exit statement
// ........................................................

sentence
  :  ( statement ( statement | continuationOfStatement )*  '.' )
      | copyStatement
      | replaceStatement
      | useStatement
      | exitStatement
      | alteredGoToStatement
      | '.'
      )
  ;
  
// ========================================================
// exitStatement
// ........................................................

exitStatement : 'EXIT' '.';

alteredGoToStatement : 'GO' 'TO' '.'
 
 
// ========================================================
// statement
// ........................................................

statement
  : ( acceptStatement //x
  	 | addStatement //x
     | callStatement //x
     | cancelStatement //x
     | closeStatement //x
     | computeStatement //x
     | deleteStatement
     | divideStatement //x
     | entryStatement //x
     | evaluateStatement 
     | execStatement //x
     | exitProgramStatement //x
     | gobackStatement //x
     | goToStatement //x
     | ifStatement //x
     | invokeStatement //x
     | moveStatement //x
     | multiplyStatement //x
     | openStatement //x
     | performStatement //x
     | readStatement
     | releaseStatement
     | returnStatement //x
     | rewriteStatement
     | searchStatement
     | startStatement
     | stopStatement //x
     | stringStatement
     | subtractStatement //x
     | unstringStatement //x
     | writeStatement
     | setStatement //x
     | initializeStatement //x
     | displayStatement //x
     | inspectStatement 
    )
  ;

// ========================================================
// nestedStatements
// ........................................................
  
  nestedStatements
  : ( statement )+
  ;    


// ========================================================
// acceptStatement
// ........................................................

acceptStatement
  : 'ACCEPT' identifier water-acceptStatement
  ;
  
water-acceptStatement
  : 'FROM' | mnemonicName | environmentName 
  | 'DATE' | 'DAY' | 'DAY-OF-WEEK' | 'TIME'
  | 'YYYMMDD' | 'YYYYDDD'
  ;
  
// ========================================================
// addStatement
// ........................................................

addStatement
  : 'ADD'
    ( addition_format1
    | addition_format2
    | addition_format3
    )
    ( sizeErrorStatement )?
    ( notSizeErrorStatement )?
    ( 'END-ADD' )?
  ;

sizeErrorStatement
  : ( 'ON' )? 'SIZE' 'ERROR'  nestedStatements   
  ;
  
notSizeErrorStatement
  : 'NOT' sizeErrorStatement
  ;  

// ========================================================
// addition_format1
// ........................................................

addition_format1
  : ( 'CORRESPONDING' | 'CORR' ) identifier
     'TO' identifier ( 'ROUNDED' )?
  ;

// ========================================================
// addition_format2
// ........................................................

addition_format2
  : ( identifier | literal )+
    ( 'TO' ( identifier | literal ) )?
    'GIVING' ( identifier ( 'ROUNDED' )? )+ 
  ;

// ========================================================
// addition_format3
// ........................................................

addition_format3
  : ( identifier | literal )+
   'TO' ( identifier ( 'ROUNDED' )? )+
  ;
  
// ========================================================
// alterStatement - deprecated since COBOL 1987
// ........................................................

alterStatement
  : 'ALTER' 
  	( procedureName 'TO' ( 'PROCEED' 'TO' )? procedureName )+
  ;

// ========================================================
// callStatement
// ........................................................

callStatement
  : 'CALL'  programID
    ( callUsing )?
    ( returning )?
    ( onOverflowStatement
    | ( onExceptionStatement ( notOnExceptionStatement )? )
    | notOnExceptionStatement
    )?
    ( 'END-CALL' )?
  ;

// ========================================================
// callUsing
// ........................................................

callUsing
  : 'USING' ( byReference | byContent | byValue )+
  ;
  
// ========================================================
// byReference
// ........................................................  
  
byReference
  : ( ( 'BY' )? 'REFERENCE' )? ( literal | identifier | 'OMITTED' )+
  ;

// ========================================================
// byContent
// ........................................................  
  
byContent
  : ( 'BY' )? 'CONTENT' ( literal | identifier | 'OMITTED' )+
  ;

// ========================================================
// byValue
// ........................................................  
  
byValue
  : ( 'BY' )? 'VALUE' ( literal | identifier )+
  ;

// ========================================================
// returning
// ........................................................  
  
returning
  : 'RETURNING' identifier
  ;
  
// ========================================================
// onOverflowStatement
// ........................................................

onOverflowStatement
  : ( 'ON' )? 'OVERFLOW' nestedStatements
  ;

// ========================================================
// onExceptionStatement
// ........................................................

onExceptionStatement
  : ( 'ON' )? 'EXCEPTION' nestedStatements
  ;

// ========================================================
// notOnExceptionStatement
// ........................................................

notOnExceptionStatement
  : 'NOT' onExceptionStatement
  ;
  
// ========================================================
// cancelStatement
// ........................................................

cancelStatement
  : 'CANCEL' ( identifier | alphanumeric )+
  ;  
 
 // ========================================================
// closeStatement
// ........................................................

closeStatement
  : 'CLOSE' ( fileName (water-closeStatement)* )+
  ;

water-closeStatement
  : 'WITH' | 'NO' | 'REWIND' | 'LOCK'
  | 'REEL' | 'UNIT' | 'FOR' | 'REMOVAL'
  ;
  
  
// ========================================================
// computeStatement
// ........................................................

computeStatement
  : 'COMPUTE' ( identifier  ( 'ROUNDED' )? )+
        ( '=' | 'EQUAL' )  arithmeticExpression
        ( onSizeErrorStatement )?
        ( notOnSizeErrorStatement )?
        ( 'END-COMPUTE' )?
  ;  

// ========================================================
// deleteStatement
// ........................................................

deleteStatement
  : 'DELETE' fileName ( 'RECORD' )?
     ( invalidKeyStatement )?   
     ( notInvalidKeyStatement )?
     ( 'END-DELETE' )?
  ;

// ========================================================
// invalidKeyStatement
// ........................................................

invalidKeyStatement
  : 'INVALID' ( 'KEY' )? nestedStatements
  ;
  
// ========================================================
// notInvalidKeyStatement
// ........................................................

notInvalidKeyStatement
  : 'NOT' invalidKeyStatement
  ;

// ========================================================
// displayStatement
// ........................................................

displayStatement
  : 'DISPLAY' ( identifier | literal )+
    uponClause
    ( water-displayStatement )*
  ;

// ========================================================
// uponClause
// ........................................................

uponClause
  : 'UPON' ( environmentName | mnemonicName )
  ;  
  
water-displayStatement
  : 'WITH' | 'NO' | 'ADVANCING'
  ;  

// ========================================================
// divideStatement
// ........................................................

divideStatement
  : 'DIVIDE'
    ( division_format1
    | division_format2
    | division_format3
    )
    ( onSizeErrorStatement )?
    ( notOnSizeErrorStatement )?
    ( 'END-DIVIDE' )?
  ;
  
// ========================================================
// division_format1
// ........................................................

division_format1
  : ( identifier | literal )
    ( 'INTO' | 'BY' ) ( identifier | literal )
    'GIVING' identifier ( 'ROUNDED' )?
    'REMAINDER' identifier
  ;
  
// ========================================================
// division_format2
// ........................................................

division_format2
  : ( identifier | literal )
    ( 'INTO' | 'BY' ) ( identifier | literal )
    'GIVING' ( identifier  ( 'ROUNDED' )? )+
  ;
  
// ========================================================
// division_format3
// ........................................................

division_format3
  : ( identifier | literal )
    'INTO' ( identifier  ( 'ROUNDED' )? )+
  ;
  
// ========================================================
// entryStatement
// double check the dot at the end of the statement
// ........................................................

entryStatement
  : 'ENTRY' alphanumeric  ( 'USING' ( dataName )+ )? '.'
  ;     


// ========================================================
// usingPhrase
// ........................................................

usingPhrase
  : 'USING' ( dataReference | dataValue )+
  ;

// ========================================================
// dataReference
// ........................................................

dataReference
  : ( ( 'BY' )? 'REFERENCE' )?  dataName
  ;

// ========================================================
// dataValue
// ........................................................

dataValue
  : ( 'BY' )?  'VALUE'  dataName
  ;
  
// ========================================================
// evaluateStatement
// ........................................................

evaluateStatement
  : 'EVALUATE'  subject ( 'ALSO' subject )*
    ( when )+
    ( whenOther )?
    ( 'END-EVALUATE' )?
  ;  

// ========================================================
// subject
// ........................................................

subject
  : ( condition
    | identifier
    | arithmeticExpression
    | literal
    )
  ;

// ========================================================
// when
// ........................................................

when
  : ( 'WHEN' object ( 'ALSO' object )* )+ 
  	nestedStatements
  ;

// ========================================================
// whenOther
// ........................................................

whenOther
  : 'WHEN' 'OTHER'  nestedStatements
  ;

// ========================================================
// object
// ........................................................

object
  : 'ANY'
    | 'TRUE'
    | 'FALSE'
    | condition
    | rangeExpression
    | notRangeExpression
  ;

// ========================================================
// rangeExpression
// ........................................................

rangeExpression
  : ( identifier | literal  | arithmeticExpression )
  	( throughExpression )?
  ;
  
// ========================================================
// notRangeExpression
// ........................................................ 
notRangeExpression
  : 'NOT' rangeExpression
  ;
  
// ========================================================
// throughExpression
// ........................................................

throughExpression
  :  ( 'THROUGH' | 'THRU' )
     ( identifier
     | literal
     | arithmeticExpression
     )
  ;

// ========================================================
// execStatement
// ........................................................

execStatement
  : ( execSQLStatement | execCICSStatement )
  ;

// ========================================================
// execSQLStatement
// ........................................................

execSQLStatement
  : 'EXEC' 'SQL'
    sqlStatement
    'END-EXEC'
  ;
// ========================================================
// cicsStatement
// ........................................................
  
sqlStatement 
  : ( water-sqlStatements )+
  ;
  
water-sqlStatements
  : 'INCLUDE' | textName | 'SELECT' | 'DECLARE'
  | 'FROM' | identifier | '.' | cobolWord
  | 'INSERT' | 'INTO' | 'UPDATE' | 'DELETE' | 'FROM'
  ;   

// ========================================================
// execCICSStatement
// ........................................................

execCICSStatement
  : 'EXEC' 'CICS'
    cicsStatement
    'END-EXEC'
  ;

// ========================================================
// cicsStatement
// ........................................................
  
cicsStatement 
  : ( water-cicsStatements )+
  ;

water-cicsStatements 
  : 'TS' | 'QUEUE' | 'QNAME' | '(' | ')'
  | 'SYSID' | 'SYS' | 'SET' | 'INTO'
  | 'LENGTH' | 'ITEM' | 'NEXT' | 'NUMITEMS'
  | 'TD' | 'WRITEQ'  | 'FROM'  | 'REWRITE' 
  | 'NOSUSPEND' | 'MAIN' | 'AUXILIARY'
  | 'DELETEQ' | 'READ' | 'FILE' | 'DATASET'
  | 'RIDFLD' | 'KEYLENGTH' | 'GENERIC' 
  | 'GTEQ' | 'EQUAL' | 'UNCOMMITTED' | 'CONSISTENT' 
  | 'REPEATABLE' | 'UPDATE' | 'TOKEN' | 'NOSUSPEND'
  | 'RBA' | 'XRBA' | 'RRN' | 'WRITE' | 'MASSINSERT'
  | 'PROGRAM' | 'COMMAREA' | 'DATALENGTH'
  | 'SYNCONRETURN' | 'TRANSID' | 'INPUTMSG'
  | 'INPUTMSGLEN' | 'CHANNEL'
  | 'XCTL' | 'LOAD' | 'START' | 'TRANSID' | 'TR' 
  | literal | identifier | programID | fileName 
  ;


// ========================================================
// exitStatement - I've excluded the term PARAGRAPH
// ........................................................

exitStatement
  : 'EXIT' 'PROGRAM'
  ;
  
// ========================================================
// gobackStatement
// ........................................................

gobackStatement
  : 'GOBACK' ;
  
// ========================================================
// goToStatement - separate altered goto statement from
// conditional and unconditional goto
// ........................................................

goToStatement
  : 'GO' ( 'TO' )? 
   ( procedureName )+ // target
   ( 'DEPENDING' ( 'ON' )?  identifier )? //condition
  ;  

// ========================================================
// ifStatement
// ........................................................

ifStatement
  : 'IF' condition  ( 'THEN' )?
    ( conditionalBlock )
    ( 'ELSE' conditionalBlock )? 
    ( 'END-IF' )?
  ;

// ========================================================
// conditionalBlock - Not happy with the naming
// ........................................................
conditionalBlock
  : nestedStatements | ( 'NEXT' 'SENTENCE' )
  ;
  
// ========================================================
// initializeStatement
// ........................................................

initializeStatement
  : 'INITIALIZE' ( identifier )+
     ( replacingInitClause )?
  ;

// ========================================================
// replacingInitClause
// ........................................................

replacingInitClause
  : 'REPLACING'  replacementTarget
    ( 'DATA' )?  'BY' ( identifier | literal )
  ;

// ========================================================
// replacementTarget
// ........................................................

replacementTarget
  : ( 'ALPHABETIC'
    | 'ALPHANUMERIC'
    | 'ALPHANUMERIC-EDITED'
    | 'NATIONAL'
    | 'NATIONAL-EDITED'
    | 'NUMERIC'
    | 'NUMERIC-EDITED'
    | 'DBCS'
    | 'EGCS'
    )
  ;  
 
// ========================================================
//  Statement
// ........................................................

inspectStatement
  : 'INSPECT'  identifier
   ( convertingPhrase
   | ( tallyingPhrase ( replacingPhrase )?  )
   | replacingPhrase
   )
  ;

// ========================================================
// convertingPhrase
// ........................................................

convertingPhrase
  : 'CONVERTING'  ( identifier | literal  )
    'TO' ( identifier | literal )
    ( locationPhrase )*
  ;

// ========================================================
// tallyingPhrase
// ........................................................

tallyingPhrase
  : 'TALLYING'
     ( identifier 'FOR'
        ( tallyingCharactersPhrase
        | tallyingAllLeadingPhrase
        )+
     )+
  ;

// ========================================================
// tallyingCharactersPhrase
// ........................................................

tallyingCharactersPhrase
  : 'CHARACTERS' ( locationPhrase )*
  ;

// ========================================================
// tallyingAllLeadingPhrase
// ........................................................

tallyingAllLeadingPhrase
  : ( 'ALL' | 'LEADING' )
    ( 
      ( identifier | literal )
      ( locationPhrase )*
    )+
  ;

// ========================================================
// replacingPhrase
// ........................................................

replacingPhrase
  : 'REPLACING'
    ( replacingCharactersPhrase
    | replacingAllLeadingFirstPhrase
    )+
  ;

// ========================================================
// replacingCharactersPhrase
// ........................................................

replacingCharactersPhrase
  : 'CHARACTERS'  'BY'
    ( identifier | literal )
    ( locationPhrase )*
  ;

// ========================================================
// replacingAllLeadingFirstPhrase
// ........................................................

replacingAllLeadingFirstPhrase
  : ( 'ALL' | 'LEADING' | 'FIRST' )
    ( 
      ( identifier | literal )
      'BY'
      ( identifier | literal )
      ( locationPhrase )*
    )+
  ;

// ========================================================
// locationPhrase
// ........................................................

locationPhrase
  : ( 'BEFORE' | 'AFTER' )
    ( 'INITIAL' )?
    ( identifier | literal )
  ;
  

// ========================================================
// water-invokeStatement
// ........................................................

invokeStatement
  : (water-invokeStatement)+
  ;
 
water-invokeStatement
  : 'INVOKE' | 'SELF' | 'SUPER' | 'NEW' | 'USING'
  | 'BY' | 'VALUE' | 'LENGTH' | 'OF' | 'RETURNING'
  | 'END-INVOKE' | identifier | literal | className 
  | onExceptionStatement | notOnExceptionStatement
  ;
 
// ========================================================
// moveStatement
// Is it appropriate to put Length Of phrase here
// ........................................................

moveStatement
  : 'MOVE'
    ( 'LENGTH' ( 'OF' )?  identifier
    | ( ( 'CORRESPONDING' | 'CORR' )?  identifier )
    | literal
    )
    'TO' ( identifier )+
  ;
  
// ========================================================
// multiplyStatement
// ........................................................

multiplyStatement
  : 'MULTIPLY'
    ( multiplication_format1
    | multiplication_format2
    )
    ( sizeErrorStatement )?
    ( notSizeErrorStatement )?
    ( 'END-MULTIPLY' )?
  ;

// ========================================================
// multiplication_format1
// ........................................................

multiplication_format1
  : ( identifier | literal )
    'BY' ( identifier | literal )
    'GIVING' ( identifier ( 'ROUNDED' )? )+
  ;

// ========================================================
// multiplication_format2
// ........................................................

multiplication_format2
  : ( identifier | literal )
    'BY' ( identifier  ( 'ROUNDED' )? )+
  ;

// ========================================================
// openStatement
// ........................................................

openStatement
  : 'OPEN'
     ( inputFile | outputFile | ioFile | extendFile )+
  ;

water-inputOutputFile
  : 'REVERSED' | 'WITH' | 'NO' | 'REWIND'
  ;

inputFile
  : 'INPUT'
    ( fileName ( water-openFileStatement )* )+
  ;
  
outputFile
  : 'OUTPUT'
    ( fileName ( water-openFileStatement )* )+
  ;  

ioFile
  : 'I-O' ( fileName )+
  ;  
  
extendFile  
  : 'EXTEND' ( fileName )+
  ;
 
// ========================================================
// performStatement
// ........................................................

performStatement
  : 'PERFORM'
    ( ( times | until  | varying )?
      ( nestedStatements )?
      'END-PERFORM' )
    | ( procedureName  ( ( 'THROUGH' | 'THRU'  )  procedureName  )?
      ( times | until | varying )?
    )
  ;

// ========================================================
// times
// ........................................................

times
  : ( identifier | integer ) 'TIMES'
  ;

// ========================================================
// until
// ........................................................

until
  : ( testPosition )? 'UNTIL' condition
  ;

// ========================================================
// testPosition
// ........................................................

testPosition
  : ( 'WITH' )? 'TEST' ( 'BEFORE' | 'AFTER' )
  ; 
  

// ========================================================
// varying
// ........................................................

varying
  :  ( testPosition )?
     'VARYING' ( identifier | indexName )
     'FROM' ( literal | identifier | indexName )
     'BY' ( literal | identifier | indexName )
     'UNTIL'  condition
     ( 'AFTER' ( identifier | indexName )
       'FROM' ( literal | identifier | indexName )
       'BY' ( literal | identifier )
       'UNTIL' condition
     )+
  ;
  
// ========================================================
// readStatement
// ........................................................

readStatement
  : 'READ' fileName
    ( 'NEXT' )? ( 'RECORD' )?
    ( 'INTO' identifier )?
    ( 'KEY' ( 'IS' )?  dataName )?
    ( atEndStatement )?
    ( notAtEndStatement )?
    ( invalidKeyStatement )?
    ( notInvalidKeyStatement )?
    ( 'END-READ' )?
  ; 

// ========================================================
// atEndStatement
// ........................................................  
atEndStatement 
  : ( 'AT' )? 'END' nestedStatements    
  ;

// ========================================================
// notAtEndStatement
// ........................................................  
notAtEndStatement 
  : ( 'NOT' )? atEndStatement    
  ;
  
// ========================================================
// returnStatement
// ........................................................

returnStatement
  : 'RETURN'  fileName
    ( 'RECORD' )? ( 'INTO' identifier )?
    ( atEndStatement )?
    ( notAtEndStatement )?
    ( 'END-RETURN' )?
  ;  

// ========================================================
// rewriteStatement
// ........................................................

rewriteStatement
  : 'REWRITE' recordName
     ( 'FROM'  identifier )?
     ( invalidKeyStatement )?
     ( notInvalidKeyStatement )?
     ( 'END-REWRITE' )?
  ;
  
// ========================================================
// searchStatement - serial & binary search integrated into one production rule
// ........................................................

searchStatement
  : 'SEARCH'
    (serialSearchItem | binarySearchItem)
    ( atEndStatement )?
    ( 'WHEN'  condition
    	( nestedStatements  | ( 'NEXT' 'SENTENCE' ) )
    )+
    ( 'END-SEARCH' )?
  ;  
  
// ========================================================
// serial search item
// ........................................................
  
serialSearchItem
  : identifier ( 'VARYING' ( identifier | indexName ) )?
  ;
  
// ========================================================
// binary search item
// ........................................................  
  
binarySearchItem
  : 'ALL' identifier
  ;
  
// ========================================================
// setStatement
// ........................................................

setStatement
  : 'SET'
    ( setTableFields
     | setSwitches
     | setConditionNames
     | setAdjustIndexes
     | setPointers
    )
  ;

// ========================================================
// setTableFields - used for basic table handling 
// ........................................................

setTableFields
  : ( indexName
    | identifier
    )+
    'TO'
    ( indexName
    | identifier
    | integer
    )
  ;

// ========================================================
// setSwitches -  used for setting external switches associated with mnemonic-names
// ........................................................

setSwitches
  : ( setSwitch )+
  ;
  
setSwitch
  : ( mnemonicName )+
    'TO' ( 'ON' | 'OFF' ) 
  ;  

// ========================================================
// setConditionNames - idenitifer ?= conditionName
// ........................................................

setConditionNames
  : ( conditionName )+
    'TO' 'TRUE'
  ;
 
// ========================================================
// setAdjustIndex - used for adjusting indexes (increment or decrement)
// ........................................................
  
setAdjustIndexes
  : ( indexName )+ 
  	( 'UP' | 'DOWN' ) 'BY'
  	( identifier | integer )
  ;    
  
// ========================================================
// setPointers - used for setting address values to pointers
// ........................................................

setPointers
  : ( pointerUsageIdentifier | addressOfIdentifier )+
   'TO' ( pointerUsageIdentifier | addressOfIdentifier | 'NULL' | 'NULLS' )
  ;
  
// ========================================================
// sortStatement
// ........................................................
  
sortStatement
  : 'SORT' fileName 
  ( ( 'ON' )? ( 'ASCENDING' | 'DESCENDING' ) 
  	( 'KEY' )? ( dataName )+ )+
  ( water-sortStatement )*
  usingInputPhrase
  givingOutputPhrase
  ;  
  
// ========================================================
// usingInputPhrase
// ........................................................  
usingInputPhrase
  : ( 'USING' ( fileName )+ )
  | ( 'INPUT' 'PROCEDURE' ( 'IS' )? procedureName 
  	( ( 'THROUGH' | 'THRU' ) procedureName )?
  ;
  
// ========================================================
// givingsOutputPhrase
// ........................................................  
givingsOutputPhrase
  : ( 'GIVING' ( fileName )+ )
  | ( 'OUTPUT' 'PROCEDURE' ( 'IS' )? procedureName 
  	( ( 'THROUGH' | 'THRU' ) procedureName )?
  ;  
  
water-sortStatement
  : 'WITH' | 'DUPLICATES' | 'IN' | 'ORDER'
  ;
  
// ========================================================
// startStatement
// ........................................................

startStatement
  : 'START' fileName
     ( keyModifier )?
     ( invalidKeyStatement )?
     ( notInvalidKeyStatement )?
     ( 'END-START' )?
  ;
  
// ========================================================
// keyModifier - dataName ?= identifier
// ........................................................

keyModifier
  : 'KEY' ( 'IS' )?
     ( water-keyRelationOperator )*
     dataName    
  ;
  
water-keyRelationOperator
  : 'EQUAL' | 'TO' | '='
  | 'GREATER' | 'THAN' | '>'
  | 'NOT' | 'LESS' | '<'
  | 'OR' | ( '>''=' )
  ;  
   
   
// ========================================================
// stopStatement
// ........................................................

stopStatement
  : 'STOP' ( 'RUN' | literal )
  ;
  
// ========================================================
// stringStatement
// ........................................................

stringStatement
  : 'STRING'
  	( ( identifier | literal  )+ delimitedByPhrase )+
    'INTO' identifier   
    ( ( 'WITH' )?  'POINTER'  identifier )?
    ( onOverflowStatement )? 
    ( notOnOverflowStatement )?
    ( 'END-STRING' )?
  ;  

// ========================================================
// delimitedByPhrase
// ........................................................
  
delimitedByPhrase
  : 'DELIMITED'  ( 'BY' )?
   ( 'SIZE' | identifier | literal  )
  ;  
      
// ========================================================
// subtractStatement
// ........................................................

subtractStatement
  : 'SUBTRACT'
    ( subtraction_format1
    | subtraction_format2
    | subtraction_format3
    )
    ( onSizeErrorStatement )?
    ( notOnSizeErrorStatement )?
    ( 'END-SUBTRACT' )?
  ;

// ========================================================
// subtraction_format1
// ........................................................

subtraction_format1
  : ( 'CORRESPONDING' | 'CORR' ) identifier
    'FROM' identifier ( 'ROUNDED' )?
  ;

// ========================================================
// subtraction_format2
// ........................................................

subtraction_format2
  : ( identifier | literal )+
    'FROM' ( identifier | literal  )
    'GIVING' ( identifier  ( 'ROUNDED' )? )+
  ;

// ========================================================
// subtraction_format3
// ........................................................

subtraction_format3
  : ( identifier | literal )+
    'FROM' ( identifier  ( 'ROUNDED' )?  )+
  ;
  
// ========================================================
// writeStatement - Left unfinished
// ........................................................

writeStatement
  : 'WRITE' recordName
    ( 'FROM' identifier )?
    ( 
    ( ( 'AFTER'
        | 'BEFORE'
        )
          ( 'ADVANCING' )?
          ( ( ( identifier
          | integer
          | 'ZERO'
          )
            ( ( 'LINE'
            | 'LINES'
            ) )?
          )
          | mnemonicName
          | 'PAGE'
          )
        ) )?
        ( ( ( 'AT' )?
          ( 'END-OF-PAGE'
          | 'EOP'
          )
          nestedStatements
        ) )?
        ( ( 'NOT'
          ( 'AT' )?
          ( 'END-OF-PAGE'
          | 'EOP'
          )
          nestedStatements
        ) )?
        ( invalidKeyStatement )?
        ( notInvalidKeyStatement )?
        ( 'END-WRITE' )?
      )
    )
  ;

// ========================================================
// atEOPStatement
// ........................................................

atEOPstatement
  : ( 'AT' )? ( 'END-OF-PAGE' | 'EOP' ) nestedStatements
  ;

// ========================================================
// notAtEOPStatement
// ........................................................

notAtEOPstatement
  : 'NOT' atEOPStatement
  ;

// ========================================================
// water-otherStatements - contains Exception Statements
// ........................................................

water-otherStatements
  : water-xml-generate | water-xml-parse
  ;

// ========================================================
// waterXMLProcessing
// ........................................................
//waterXMLProcessing
//  : 'XML' | 'GENERATE' | 'FROM' | 'COUNT' | 'IN' | 'WITH'
//  | 'ENCODING' | 'XML-DECLARATION' | 'WITH' | 'ATTRIBUTES'
//  | 'NAMESPACE' | 'IS' | 'NAMESPACE-PREFIX' | 'END-XML'
//  | 'PARSE' | 'RETURNING' | 'NATIONAL' | 'THROUGH' | 'THRU'
//  | 'VALIDATING' | 'FILE' | 'PROCESSING' | 'PROCEDURE'  
//  | onExceptionStatement | notOnExceptionStatement
//	| codePage | xmlSchemaName | procedureName | identifier | literal
//  ;

  
water-xml-generate
  : 'XML' | 'GENERATE' | 'FROM' | 'COUNT' | 'IN'
  | 'ENCODING' | 'XML-DECLARATION' | 'WITH' | 'ATTRIBUTES'
  | 'NAMESPACE' | 'IS' | 'NAMESPACE-PREFIX' | 
  | onExceptionStatement | notOnExceptionStatement
  | 'END-XML' | identifier | literal
  ;  

water-xml-parse
  : 'XML' | 'PARSE' | 'WITH' | 'ENCODING' | 'RETURNING' 
  | 'NATIONAL' | 'VALIDATING' | 'FILE' | 'PROCESSING' 
  | 'PROCEDURE' | 'IS' | 'THROUGH' | 'THRU' | 'END-XML'
  | onExceptionStatement | notOnExceptionStatement
  | codePage | xmlSchemaName | procedureName
  ;
  
// ========================================================
// copyStatement
// ........................................................

copyStatement
  : 'COPY' ( textName | literal )
    ( ( 'OF' | 'IN' )  ( libraryName | literal ) )?
    ( 'SUPPRESS' )?
    ( copyReplacingPhrase )?  '.'
  ;

// ========================================================
// copyReplacingPhrase
// ........................................................

copyReplacingPhrase
  : 'REPLACING' ( replacementInstruction )+
  ;

// ========================================================
// copyReplacementInstruction
// ........................................................

copyReplacementInstruction
  : copyOperandName 'BY' copyOperandName
  ;

// ========================================================
// copyOperandName
// ........................................................

copyOperandName
  : pseudoLiteral
    | verb
    | literal
    | identifier
    | cobolWord
  ;
  
  
verb 
  : 'ADD' | 'CALL' | 'CANCEL' | 'CLOSE' | 'DELETE'
  | 'DIVIDE' | 'ENTRY' | 'EVALUATE' | 'EXEC' | 'EXIT'
  | 'GOBACK' | 'GO' | 'IF' | 'MOVE' | 'MULTIPLY'
  | 'OPEN' | 'PERFORM' | 'READ' | 'RELEASE' | 'RETURN'
  | 'REWRITE' | 'SEARCH' | 'STOP' | 'STRING' | 'SUBTRACT'
  | 'UNSTRING' | 'WRITE' | 'SET' | 'INITIALIZE' | 'DISPLAY'
  | 'COMPUTE' | 'INSPECT' | 'START' | 'USE' | 'ACCEPT'
  | 'ALTER' | 'CONTINUE' | 'MERGE' | 'SORT' | 'ENABLE'
  | 'DISABLE' | 'SEND' | 'RECEIVE' | 'PURGE' | 'INITIATE'
  | 'GENERATE' | 'TERMINATE'
  ;  

// ========================================================
// replaceStatement - replacementInstruction is too liberal
// ........................................................

replaceStatement
  : 'REPLACE' 
  	( ( copyReplacementInstruction )+ | 'OFF' ) '.'
  ; 
  
 
// ========================================================
// identifier
// ........................................................

identifier
  : functionIdentifier
   | dataItemIdentifier
  ;

// ========================================================
// functionIdentifier
// ........................................................

functionIdentifier
  : 'FUNCTION' functionName
    ( '(' ( argument )+ ')' )?
    ( referenceModifier )?
  ;
  
// ========================================================
// identifier_format2
// ........................................................

identifier_format2
  : dataName ( qualifier )*
    ('(' ( subscript )+ ')' )?
    ( referenceModifier )?
  ;    
     
//The comment-entry can be any combination of characters from the character set.  
CommentEntry:;

LevelNumber : ('0'..'4')('0'..'9')
