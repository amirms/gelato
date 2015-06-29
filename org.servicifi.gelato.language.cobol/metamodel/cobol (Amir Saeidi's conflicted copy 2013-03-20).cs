SYNTAXDEF cobol
FOR <http://www.servicifi.org/gelato/language/cobol> <cobol.genmodel>
START containers.CompilationGroup, copybooks.BehaviorCopybook, copybooks.DataCopybook

IMPORTS {
	verbs : <http://www.servicifi.org/gelato/language/cobol/verbs>
	copybooks : <http://www.servicifi.org/gelato/language/cobol/copybooks>
	labels : <http://www.servicifi.org/gelato/language/cobol/labels>
	commons : <http://www.servicifi.org/gelato/language/cobol/commons>
	containers : <http://www.servicifi.org/gelato/language/cobol/containers>
	statements : <http://www.servicifi.org/gelato/language/cobol/statements>
	sentences : <http://www.servicifi.org/gelato/language/cobol/sentences>
	divisions : <http://www.servicifi.org/gelato/language/cobol/divisions>
	sections : <http://www.servicifi.org/gelato/language/cobol/sections>
	paragraphs : <http://www.servicifi.org/gelato/language/cobol/paragraphs>
	references : <http://www.servicifi.org/gelato/language/cobol/references>
	literals : <http://www.servicifi.org/gelato/language/cobol/literals>
	phrases : <http://www.servicifi.org/gelato/language/cobol/phrases>
	arithmetics : <http://www.servicifi.org/gelato/language/cobol/arithmetics>
	conditions : <http://www.servicifi.org/gelato/language/cobol/conditions>
	operators : <http://www.servicifi.org/gelato/language/cobol/operators>
	operands : <http://www.servicifi.org/gelato/language/cobol/operands>
	subscripts : <http://www.servicifi.org/gelato/language/cobol/subscripts>
	water : <http://www.servicifi.org/gelato/language/cobol/water>
	registers : <http://www.servicifi.org/gelato/language/cobol/registers>
	environments : <http://www.servicifi.org/gelato/language/cobol/environments>
	dataitems : <http://www.servicifi.org/gelato/language/cobol/dataitems>
	specialnames : <http://www.servicifi.org/gelato/language/cobol/specialnames>
	tables : <http://www.servicifi.org/gelato/language/cobol/tables>
	files : <http://www.servicifi.org/gelato/language/cobol/files>
	parameters : <http://www.servicifi.org/gelato/language/cobol/parameters>
	declaratives : <http://www.servicifi.org/gelato/language/cobol/declaratives>
	functions : <http://www.servicifi.org/gelato/language/cobol/functions>
}

OPTIONS {	
	defaultTokenName = "COBOL_WORD";
	//disableTokenSorting = "true";
	generateCodeFromGeneratorModel = "false";
	backtracking = "true";
	memoize = "true";
	usePredefinedTokens = "false";
	//resolveProxyElementsAfterParsing = "true";
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
	ignoreTypeRestrictionsForPrinting = "true";
	//overrideResourcePostProcessor = "false";
	
}

TOKENS {

	//Need to fix the overlapping lexical rules involving the following:
	// PictureString and Decimal Integers
	//Level Number, Segment Number and Priority Number, and that of decimal integers
	//The comment marker is changed to #
	DEFINE SL_COMMENT $'#'(~('\n'|'\r'|'\uffff'))* $;
	
	//@SuppressWarnings(tokenOverlapping)
	//DEFINE BOOLEAN_LITERAL $ 'TRUE' | 'FALSE'$;
	
	//removed this and changed all occurrences of level-number with decimal integer
	//@SuppressWarnings(tokenOverlapping)
	//DEFINE LEVEL_NUMBER $('1'..'9' | '0'..'4''0'..'9' | ('7''7'))$;

	//DEFINE FRAGMENT DOT $'.'$;
	
	DEFINE FRAGMENT COMMA $','$;

	DEFINE FRAGMENT ZERO $'0'$;
	
	DEFINE FRAGMENT SLASH $'//'$;

	DEFINE FRAGMENT PICTURE_STRING_CHARACTER $'X'|'S'|'P'|'9'|'V'|'A'|'N'$;
	
	DEFINE FRAGMENT PICTURE_STRING_EDITED_CHARACTER 
		$'B'|'E'|'Z'|('C''R')|('D''B')|$ + COMMA + $|$ + ZERO;

	DEFINE LEVEL_NUMBER $ (('0')? ('0'..'9')) | ('1'..'4')('0'..'9') | '7''8' $;
			
//	DEFINE FRAGMENT UNICODE_CHARACTER $'\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')$;
	
	//Basic Alphanumeric Literals 
	DEFINE FRAGMENT ESCAPE_QUOTE_CHARACTER  $'"''"'$;	
	DEFINE FRAGMENT ESCAPE_APOST_CHARACTER  $'\'''\''$;	
	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_LITERAL $'"' ($ + ESCAPE_QUOTE_CHARACTER + $| ~('"'))* '"' $; 	
	DEFINE FRAGMENT ALPHANUMERIC_APOST_LITERAL $'\'' ($ + ESCAPE_APOST_CHARACTER + $| ~('\''))* '\'' $; 		
	
	//@SuppressWarnings(tokenOverlapping)
	DEFINE ALPHANUMERIC_LITERAL ALPHANUMERIC_QUOTE_LITERAL + $|$ + ALPHANUMERIC_APOST_LITERAL;
	
	//Hexadecimal Notation for Alphanumeric Literals	
	DEFINE FRAGMENT HEX_CHARACTERS $('0'..'9'|'a'..'f'|'A'..'F')+$;	
	DEFINE FRAGMENT ALPHANUMERIC_APOST_HEX_LITERAL $('x'|'X')'\'' $ + HEX_CHARACTERS + $ '\'' $;	
	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_HEX_LITERAL $('x'|'X')'"' $ + HEX_CHARACTERS + $ '"' $;
	
	DEFINE ALPHANUMERIC_HEX_LITERAL ALPHANUMERIC_QUOTE_HEX_LITERAL + $|$ + ALPHANUMERIC_APOST_HEX_LITERAL;
	
	//Null-terminated Alphanumeric Literals	
//	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_NULL_LITERAL $('z'|'Z')$ + ALPHANUMERIC_QUOTE_LITERAL;	
//	DEFINE FRAGMENT ALPHANUMERIC_APOST_NULL_LITERAL $('z'|'Z')$ + ALPHANUMERIC_APOST_LITERAL;
	
//	DEFINE ALPHANUMERIC_NULL_LITERAL ALPHANUMERIC_QUOTE_NULL_LITERAL + $|$ + ALPHANUMERIC_APOST_NULL_LITERAL;
	
	//Numeric Literals
	@SuppressWarnings(tokenOverlapping)
	DEFINE DECIMAL_INTEGER_LITERAL $('0'..'9''0'..'9'*)$;
	@SuppressWarnings(tokenOverlapping)
	DEFINE DECIMAL_FIXED_LITERAL $('+'|'-')? ('0'..'9')+ '.' ('0'..'9')*$;
	@SuppressWarnings(tokenOverlapping)
	DEFINE DECIMAL_FLOAT_LITERAL $('+'|'-')? ('0'..'9')+ '.' ('0'..'9')* ('e'|'E') ('+'|'-')? ('0'..'9')+$;	
	
	@SuppressWarnings(tokenOverlapping)
	DEFINE PICTURE_STRING $(($ + PICTURE_STRING_CHARACTER + $)('('('0'..'9')+')')? )+$;
	
	@SuppressWarnings(tokenOverlapping)
	DEFINE PICTURE_STRING_EDITED 
		$(($ + PICTURE_STRING_CHARACTER + $|$ + PICTURE_STRING_EDITED_CHARACTER + $|'.')('('('0'..'9')+')')?  )*$
		+ $ (($ + PICTURE_STRING_CHARACTER + $|$ + PICTURE_STRING_EDITED_CHARACTER + $)('('('0'..'9')+')')? )$;
	
	
	//DEFINE NUMERIC_LITERAL DECIMAL_FLOAT_LITERAL + $|$ + DECIMAL_FIXED_LITERAL + $|$ + DECIMAL_INTEGER_LITERAL;
	
	//DBCS Literals
	
//	DEFINE FRAGMENT DBCS_CHARACTERS $'<'(~('>'))'>'$;
		
//	DEFINE FRAGMENT DBCS_APOST_LITERAL $('g'|'G')'\'' $ + DBCS_CHARACTERS + $ '\'' $;
//	DEFINE FRAGMENT DBCS_QUOTE_LITERAL $('g'|'G')'"' $ + DBCS_CHARACTERS + $ '"' $;	
	
	//If the NSYMBOL(DBCS) compiler option is in effect, 
	// the opening delimiter N' and N" identifies a DBCS literal
//	DEFINE FRAGMENT NATIONAL_QUOTE_DBCS_LITERAL $('n'|'N')'"' $ + DBCS_CHARACTERS + $ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_DBCS_LITERAL $('n'|'N')'\'' $ + DBCS_CHARACTERS + $ '\'' $;
	
//	DEFINE DBCS_LITERAL	DBCS_APOST_LITERAL + $|$ + DBCS_QUOTE_LITERAL 
//		+ $|$ + NATIONAL_QUOTE_DBCS_LITERAL + $|$ + NATIONAL_APOST_DBCS_LITERAL;
	
	//National Literals 
//	DEFINE FRAGMENT NATIONAL_QUOTE_LITERAL $('n'|'N')'"' $ + UNICODE_CHARACTER + $+ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_LITERAL $('n'|'N')'\'' $ + UNICODE_CHARACTER + $+ '\'' $;
	
//	DEFINE NATIONAL_LITERAL NATIONAL_QUOTE_LITERAL + $|$ + NATIONAL_APOST_LITERAL;
	
	//Hexadecimal Notation for National Literals 
// 	DEFINE FRAGMENT NATIONAL_QUOTE_HEX_LITERAL $('n''x'|'N''X')'"' $ + HEX_CHARACTERS + $ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_HEX_LITERAL $('n''x'|'N''X')'\'' $ + HEX_CHARACTERS + $ '\'' $;
	
	//DEFINE NATIONAL_HEX_LITERAL NATIONAL_QUOTE_HEX_LITERAL + $|$ + NATIONAL_APOST_HEX_LITERAL;

	DEFINE PSEUDO_LITERAL $'=''='~('=')'=''='$;
		
	@SuppressWarnings(tokenOverlapping)
	DEFINE COBOL_WORD $('A'..'Z' | 'a'..'z' | '0'..'9')+ ( ('-' | '_')+  ('A'..'Z' | 'a'..'z' | '0'..'9')+ )*$;	
	
	@SuppressWarnings(unusedToken)		
	DEFINE COMMA_SEPARATOR COMMA + $' '$;
	
	@SuppressWarnings(unusedToken)
	DEFINE SEPARATOR $(' ' | '\t'|'\f' |'\n' |'\r')+$;
}

TOKENSTYLES {
	//"SL_COMMENT" COLOR #000080, ITALIC;
	
	"ALPHANUMERIC_LITERAL" COLOR #2A00FF;
	"COBOL_WORD" COLOR #000000;
	"PICTURE_STRING" COLOR #3A00FF;
	"PICTURE_STRING_EDITED" COLOR #3A00FF;
	
	//"CICS", , "CONVERTING", "COMMUNICATION", "END-ACCEPT", "LINE"
	//, "SQL" , "END-OF-PAGE", "END-DELETE", "END-DISPLAY",
	//"END-WRITE", "END-START", "END-REWRITE", "END-READ"
	//, "INVALID", "FIRST", "FALSE", "READQ", "CURSOR", "EOP"
	//, "LINK", "LINKAGE", "PAGE", "PREVIOUS", "READNEXT"
	
	//CICS-Related
	//"TD", "TOKEN", "SYS", "SYSID", "RRN", "SYNCONRETURN",
	//"REPEATABLE", "RIDFLD", "QUEUE", "RBA", "NUMITEMS",
	//"QNAME", "MASSINSERT", "NOSUSPEND", "LOAD", "MAIN",
	//"XRBA", "XCTL", "WRITEQ", "UNCOMMITTED", "TS",
	//"TRANSID", "TR", "DATASET", "DATALENGTH",  "GENERIC",
	//"DELETEQ", "INPUTMSGLEN", "INPUTMSG", "KEYLENGTH",
	//"ITEM", "CHANNEL", "AUXILIARY", "CONSISTENT", "COMMAREA", 
	
	//DataDescription
	// "SYNCHRONIZED", "SYNC", "TRAILING", "LEFT",
	// "RIGHT", "SEPARATE", "BLANK", "JUST", "JUSTIFIED", "LEADING", 
	
	//Others
	"FOOTING", "LINAGE", "LINES", "ORGANIZATION", "BLOCK",
	"BOTTOM", "CODE-SET", "F","V",  "SEQUENTIAL", "SD",
	"U","TOP", "REPORT", "RECORDING", "REPORTS", "S",
	"BY", "SQL", "FROM",
	"ADD", "ADDRESS", "ADVANCING", "AFP-5A", 
	"AFTER", "ALL", "ALPHABETIC", "ALPHANUMERIC", 
	"ALPHANUMERIC-EDITED", "ALSO", "ALTER", "ANY", "ARE", 
	"ASCENDING", "ASSIGN", "AT",  "BEFORE", 
	"BINARY",  "BY", "C01", 
	"C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", 
	"C10", "C11", "C12", "CALL", "CANCEL", 
	"CHARACTER", "CHARACTERS",  "CLOSE", 
	"COMMA", "COMMON", "COMP", 
	"COMP-1", "COMP-2", "COMP-3", "COMP-4", "COMP-5", 
	"COMPUTATIONAL", "COMPUTATIONAL-1", "COMPUTATIONAL-2", 
	"COMPUTATIONAL-3", "COMPUTATIONAL-4", "COMPUTATIONAL-5", 
	"COMPUTE", "CONFIGURATION",  "CONSOLE", 
	"CONTAINS", "CONTENT", "CONTINUE", "COPY", 
	"CORR", "CORRESPONDING", "COUNT", "CSP", "DATA", 
	"DBCS", "DEBUGGING", "DECIMAL-POINT", 
	"DECLARATIVES", "DECLARE", "DELETE", "DELIMITED", 
	"DELIMITER", "DEPENDING", "DESCENDING", "DISABLE", "DISPLAY", 
	"DIVIDE", "DIVISION", "EGCS", "ELSE", "ENABLE", "END", 
	"END-ADD", "END-CALL", "END-COMPUTE", 
	"END-DIVIDE", "END-EVALUATE", 
	"END-EXEC", "END-IF", "END-MULTIPLY",  
	"END-PERFORM", "END-RETURN", 
	"END-SEARCH", "END-STRING", "END-SUBTRACT", 
	"END-UNSTRING",  "ENTRY", "ENVIRONMENT", 
	"EQUAL", "ERROR", "EVALUATE", "EXCEPTION", "EXEC", "EXIT", 
	"EXTEND", "EXTERNAL",  "FD", "FILE", "FILE-CONTROL", 
	"FILLER", "FOR", "FROM", "FUNCTION", 
	"GENERATE", "GIVING", "GLOBAL", "GO", "GOBACK", 
	"GREATER", "HIGH-VALUE", "HIGH-VALUES", "I-O", "I-O-CONTROL", 
	"ID", "IDENTIFICATION", "IF", "IN", "INCLUDE", "INDEX", 
	"INDEXED", "INITIAL", "INITIALIZE", "INITIATE", "INPUT", 
	"INPUT-OUTPUT",  "INSERT", "INSPECT", 
	"INTO", "IS",  "KEY", 
	"LABEL",  "LENGTH", "LESS",  "LINKAGE",
	 "LOCAL-STORAGE", "WHERE", "ORDER",
	"LOCK", "LOW-VALUE", "LOW-VALUES",  
	"MERGE", "MODE", "MOVE", "MULTIPLY", "NATIONAL", "NATIONAL-EDITED", 
	"NEXT", "NO", "NOT", "NULL", "NULLS", "NUMERIC", 
	"NUMERIC-EDITED", "OBJECT-COMPUTER", "OCCURS", "OF", 
	"OFF", "OMITTED", "ON", "OPEN", "OPTIONAL", "OR",  
	"OTHER", "OUTPUT", "OVERFLOW", "PACKED-DECIMAL", 
	"PARAGRAPH", "PERFORM", "PIC", "PICTURE", "POINTER", 
	"PROCEDURE", "PROGRAM", "PROGRAM-ID", "PURGE", 
	"QUOTE", "QUOTES", "READ", "RECEIVE", "BY",
	"RECORD",  "RECORDS", "REDEFINES", "REEL", 
	"REFERENCE", "RELEASE", "REMAINDER", "REMOVAL", "RENAMES", 
	"REPLACE", "REPLACING",  
	"RETURN", "RETURNING", "REVERSED", "REWIND", "REWRITE", 
	"ROUNDED", "RUN",  "S01", "S02", 
	"S03", "S04", "S05", "SEARCH", "SECTION", "SELECT", 
	"SEND", "SENTENCE", "SET", "SIGN", 
	"SIZE", "SORT", "SOURCE-COMPUTER", "SPACE", "SPACES", 
	"SPECIAL-NAMES", "STANDARD", "START", "STATUS", "STOP",
	"STRING", "SUBTRACT", "SUPPRESS", 
	"SYSIN", "SYSIPT", "SYSLIST", 
	"SYSLST", "SYSOUT", "SYSPCH", "SYSPUNCH", "TALLYING", 
	"TERMINATE", "TEST", "THAN", "THEN", "THROUGH", "THRU", "TIMES", "TO", 
	 "TRUE",   
	"UNIT", "UNSTRING", "UNTIL", "UPDATE", "UPON", 
	"USAGE", "USE", "USING",  "VALUE", "VALUES", "VARYING", 
	"WHEN", "WITH", "WORKING-STORAGE", "WRITE", 
	 "ZERO", "ZEROES", "ZEROS" COLOR #7F0055, BOLD;
}

RULES {

//containers.EmptyModel
//	::= ( identificationDivisions !0)*
//	;

@SuppressWarnings(optionalKeyword)
@SuppressWarnings(featureWithoutSyntax) //name is set by CobolSourceOrClassFileResource.load()
containers.CompilationGroup 
   ::= (compilationUnits  !0 )*
   ;

@SuppressWarnings(optionalKeyword)
@SuppressWarnings(featureWithoutSyntax) //name is set by CobolSourceOrClassFileResource 
containers.CompilationUnit 
   ::=
    //IDENTIFICATION DIVISION		
	( identificationDivision )
    !0 
    //ENVIORNMENT DIVISION
    ( environmentDivision )?   
    !0 
    //DATA DIVISION
    ( dataDivision )? 
    !0 
    //PROCEDURE DIVISION
    ( procedureDivision )?
    !0
	( ( nestedCompilationUnits )* 
	"END" "PROGRAM" name[] "." )?
	 ("\u001a")?
  ;
 
 //copybooks
  
copybooks.DataCopybook ::= ( units )+;

copybooks.BehaviorCopybook ::=
		 ( sentences )*
	     ( paragraphs )*
	     ( sections )*
    ;
  
@SuppressWarnings(featureWithoutSyntax)  
divisions.IdentificationDivision
  ::= ("ID" | "IDENTIFICATION" ) #1 "DIVISION" "." 
	!0
	"PROGRAM-ID" ( "." )?     
    name[]  
    ( "IS" 
    ( isRecursive["RECURSIVE" : ""] 
    | isInitial["INITIAL" :  ""] 
    | isCommon["COMMON" : ""] )+
    
    (water:water.IdentificationDivisionWater)*
    
    "PROGRAM" )?  (".")?
    ;  

divisions.EnvironmentDivision
  ::=  "ENVIRONMENT" #1 "DIVISION"  "."
    	( sections:sections.ConfigurationSection, 
    		sections.IOSection )*
  ;

divisions.DataDivision 
  ::= "DATA" #1 "DIVISION"  "."
        ( sections:sections.DataDivisionSection )*
  ;      

sections.ConfigurationSection
  ::= "CONFIGURATION" "SECTION" "."
  	(paragraphs:paragraphs.ConfigurationSectionParagraph )*
  ;

sections.IOSection
  ::= "INPUT-OUTPUT" #1 "SECTION"  "."
     paragraphs:paragraphs.FileControlParagraph
     ( paragraphs:paragraphs.IOControlParagraph )?
  ; 


@SuppressWarnings(featureWithoutSyntax)
sections.FileSection
  ::= "FILE" #1 "SECTION" "." 
     ( fileDescriptors
     | sentences:sentences.CopySentence )*
  ;
      
//removed the dot in the exec statement      
@SuppressWarnings(featureWithoutSyntax)
sections.WorkingStorageSection
  ::= "WORKING-STORAGE" #1 "SECTION" "." 
	( dataItems
	| sentences:sentences.ReplaceSentence, sentences.ExecuteSentence
	| (statements:statements.Execute ) )*
  ;

//removed the dot in the exec statement       
@SuppressWarnings(featureWithoutSyntax)
sections.LocalStorageSection
  ::= "LOCAL-STORAGE" #1 "SECTION"  "." 
	( dataItems
	| sentences:sentences.ReplaceSentence, sentences.ExecuteSentence )*
  ;

//removed the dot in the exec statement   
@SuppressWarnings(featureWithoutSyntax)
sections.LinkageStorageSection
  ::= ( "LINKAGE-STORAGE" | "LINKAGE" ) #1 "SECTION"  "." 
	( dataItems
	| sentences:sentences.ReplaceSentence, sentences.ExecuteSentence )*
  ;   

//paragraphs
  
paragraphs.SourceComputerParagraph
  ::= "SOURCE-COMPUTER"  "."
   	// We are not interested in the computerName, the name
  	// of the computer on which the source is to be compiled.
     ( name[] ( withDebuggingMode )? "." )?
  ;
  
paragraphs.DebuggingMode
  ::= ( "WITH" #1 )? "DEBUGGING" #1 "MODE"
  ;  

paragraphs.ObjectComputerParagraph
  ::= "OBJECT-COMPUTER"  "."
  	( name[] ( water:water.ObjectComputerParagraphWater )* "." )? 
  ;
  
paragraphs.SpecialNamesParagraph
  ::= "SPECIAL-NAMES"  "."        
     ( specialNameStatements | water:water.SpecialNamesParagraphWater )* ( "." )?
  ;
  
paragraphs.RepositoryParagraph
  ::= "REPOSITORY"  "." ( water:water.RepositoryParagraphWater )*
  ;
  
paragraphs.FileControlParagraph
  ::= "FILE-CONTROL"  "."
    ( selectStatements 
    | sentences:sentences.CopySentence )*
  ;  

paragraphs.IOControlParagraph
  ::=  "I-O-CONTROL" "." ( water:water.IOControlParagraphWater )*
  ;

//Special Names Statement
specialnames.SystemDeviceIs
  ::= environment:environments.SystemDevice ("IS")? name[]
  ;

specialnames.UPSISwitchIs
  ::=  environment:environments.UPSI
  	  ( ("IS")? name[])? ( conditionNames )*
  	;
  	
specialnames.OnStatus
  ::= "ON" #1 ( "Status" #1 )? ( "IS" #1 )? name[]
  ;
  
specialnames.OffStatus
  ::= "OFF" #1 ( "Status" #1 )? ( "IS" #1 )? name[]
  ;  	

//name has to be a literal, not the default cobol-word
specialnames.CurrencySign
  ::= "CURRENCY" "SIGN" ( "IS" )? name[] //literal
  	( ( "WITH" )? "PICTURE" "SYMBOL" pictureSymbol[] ) ;

specialnames.ClassName
  ::= "CLASS" #1 name[] ( "IS" #1 )?
      ( range )+
  ;          
 
specialnames.SymbolicCharacterStatement
  ::= "SYMBOLIC" #1 ( "CHARACTER" | "CHARACTERS" )?
  	symbolicCharacters+
    // IN phrase specifies the character set that
    // the symbolic  characters belong to 
  	//target points to an alphabetname
  	( "IN" target[] )?
  ;

specialnames.SymbolicCharacter
  ::= name[] //( additionalSymbolicCharacters )* 
  ( "IS" | "ARE" )? ( integers )+
  ;

//TODO Fix the symbolic character
//name has to be a literal, not the default cobol-word  
//specialnames.AdditionalSymbolicCharacter
//  ::= name[] 
//  ;

specialnames.AlphabetName 
	::= "ALPHABET" #1 name[] ( "IS" )? type;

//specialnames.ExplicitAlphabetType
//	::= ( range )+
//	;

specialnames.PredefinedAlphabetType
	::= value[standard1 : "STANDARD-1", standard2 : "STANDARD-2", 
		ebcdic : "EBCDIC", native : "NATIVE"]
	;
	
specialnames.CodeNameAlphabetType
	::= value[];
	
//files
//Needs to be fixed
files.FDFileDescriptor
  ::= "FD" name[] 
//  ( ( attributes:dataitems.Global, dataitems.External) 
  //| water:water.FileDescriptorWater 
//  )*  
  "."
  	( recordDescriptors:dataitems.DefaultDataItem )*
  ;
  
//files.SDFileDescriptor
//  ::= "SD" name[] ( water:water.FileDescriptorWater)*  "."
//   	( recordDescriptors:dataitems.DefaultDataItem )*
 // ;  

files.SelectStatement
  ::= selectFD assignTo
//  ( fileStatus | water:water.SelectStatementWater )*  
"."
  ;
  
//The external data file names must be defined in DD statement in JCL  
files.AssignTo  
  ::= "ASSIGN" ( #1 "TO"  )? ( externalFileNames[] )+
  ; 

files.SelectFileDescriptor
  ::= "SELECT" isOptional["OPTIONAL" : ""] filename
  ;
  
files.FileStatus
  ::= ( "FILE" )? "STATUS" ( "IS" )?
        identifier  ( vsamFileStatus )?
  ;
  
files.VSAMFileStatus
 ::= identifier;  
    
// I thought ElementReference is a subtype of NamedElement, 
// just to find out that it isn't
// DataItem is a subtype of NamedElement
@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
dataitems.DefaultDataItem
	::= 
	levelNumber[LEVEL_NUMBER] ( name[] )?
	( attributes )*  "."       
	;
	
dataitems.RenamingDataItem
 	::= "66" name[] "RENAMES" nameRange "."
 	;	

dataitems.FillerRenamingDataItem
	::= "66" "FILLER" "RENAMES" nameRange "."
	;

dataitems.ConditionName
	::= "88" name[] attributes:dataitems.Value "."
  	;
  	
dataitems.RedefiningDataItem
	::= levelNumber[DECIMAL_INTEGER_LITERAL] ( name[] )? "REDEFINES" target[] "."
	;	

//should this be a subclass of NamedClass	
dataitems.PictureString
	::= ( "PIC" | "PICTURE" ) ( #1 "IS" #1 )? picture[PICTURE_STRING]
	;
	
dataitems.EditedPictureString
	::= ( "PIC" | "PICTURE" ) ( #1 "IS" #1 )? picture[PICTURE_STRING_EDITED]
	;
	
//value is a literal
//P.S. Merged the clauses for value definition of condition-names and normal data items
dataitems.Value
	::= ( "VALUE" | "VALUES" ) ( #1 "IS" | "ARE" #1 )? 
		( values:arithmetics.RangeExpression )+
	;

dataitems.External
  ::= ( "IS" )? "EXTERNAL"
  ;

dataitems.Global
  ::= ( "IS" )? "GLOBAL"
 ;	

dataitems.GroupUsage
  ::= "GROUP-USAGE" ( "IS" )? "NATIONAL" 
  ;

dataitems.Usage
  ::= ( "USAGE" ( "IS" )? )?
       usage[binary : "BINARY", computational : "COMPUTATIONAL", comp : "COMP", 
       		display : "DISPLAY", display1 : "DISPLAY-1", index : "INDEX", packedDecimal : "PACKED-DECIMAL",
       		computational1 : "COMPUTATIONAL-1", comp1 : "COMP-1", 
       		computational2 : "COMPUTATIONAL-2", comp2 : "COMP-2",
        	computational3 : "COMPUTATIONAL-3", comp3 : "COMP-3", 
        	computational4 : "COMPUTATIONAL-4", comp4 : "COMP-4", 
        	computational5 : "COMPUTATIONAL-5", comp5 : "COMP-5", 
        	pointer : "POINTER", procedurePointer : "PROCEDURE-POINTER",
        	functionPointer : "FUNCTION-POINTER", national : "NATIONAL"]
 //       ( "NATIVE" )?	
 		isNative["NATIVE" : ""]
  ;
	
//tables
tables.FixedLengthTable 
  ::= levelNumber[DECIMAL_INTEGER_LITERAL] ( name[] )?
	( attributes
  	| ( "OCCURS" tableDimension ( "TIMES" )?
        ( keysAre )*
        ( indexedBy )? )
    )*   "."
  ;

tables.VariableLengthTable 
  ::= levelNumber[DECIMAL_INTEGER_LITERAL] ( name[] )?
	( attributes
  	| ( "OCCURS" tableDimension ( "TO"  maxTableDimension ) ( "TIMES" )?
  		dependsOn
        ( keysAre )*
        ( indexedBy )? )
    )*   "."
  ;

tables.DependingOn
  ::= "DEPENDING" ( "ON" )? operand:references.IdentifierReference
  ;
  
tables.KeyName 
  ::= keyOrder[asc : "ASCENDING", dsc : "DESCENDING"]
          ( "KEY" )? ( "IS" )?
          ( identifiers )+
   ;
   
tables.IndexName
  ::= "INDEXED" ( "BY" )? name[] ( additionalIndexNames )*
  ;     


tables.AdditionalIndexName
  ::= name[]
  ;
  
tables.TableDimension ::= value[DECIMAL_INTEGER_LITERAL];

// ========================================================
// procedureDivision
// ........................................................

@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
divisions.ProcedureDivision
  ::= "PROCEDURE" #1 "DIVISION" 
      ( "USING" ( parameters )+ )?
      ( "RETURNING" returning )? #1 "."
        ( declaratives )?
        ( sentences )*
        ( paragraphs )*
        ( sections )*
  ;

//declaratives
declaratives.Declaratives
  ::= "DECLARATIVES" "."
    ( declarativeSections )+
    "END" "DECLARATIVES" "."
  ;
  
sections.DeclarativeSection
  ::= name[] "SECTION" "."
    sentences:sentences.UseSentence
    ( paragraphs )*
  ;  

// Section Name can either be a CobolWord or Integer ??
// sectionName : ( COBOLWORD | INTEGER);
//
// Segment Number can only be Integer
// segmentNumber :  INTEGER ;

@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
sections.Section
	::=  name[] "SECTION" ( segmentNumber[DECIMAL_INTEGER_LITERAL] )? "."
        ( sentences )*
        ( paragraphs )*
;

// Paragraph Name can either be a CobolWord or Integer ??
// paragraphName : ( COBOLWORD | INTEGER );
@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
paragraphs.Paragraph
	::= name[] "." ( sentences )*
;

//sentences
sentences.ExecuteSentence ::= (statements:statements.Execute) ".";

sentences.UseSentence ::= (statements:statements.Use) ".";

sentences.CopySentence ::= (statements:statements.Copy) ".";

sentences.GoToSentence ::= (statements:statements.GoTo) ".";

sentences.ExitSentence ::= (statements:statements.Exit) ".";

//sentences.EntrySentence ::= (statements:statements.Entry) ".";

sentences.ReplaceSentence ::= (statements:statements.Replace) ".";

sentences.Sentence ::= (statements:statements.MultiplyScopedStatement)+ ".";

@SuppressWarnings(featureWithoutSyntax)
sentences.EmptySentence ::= ".";

//statements
statements.Copy
  ::= "COPY" target[]
    ( ( "OF" | "IN" )  (  libraryName[] ) )?
    suppress[ "SUPPRESS" : ""]
    ( phrases:phrases.Replacing  )?
	;
	
	
statements.Replace
  ::=  "REPLACE" replaceSwitch["OFF" : "ON"]
  	( phrases:phrases.ReplacingBy )*
  ;
	

statements.Use
  ::= "USE" ( water:water.UseStatementWater )*
  ;

//operand must be an alphanumeric literal
//I elevated it to the sentences
//sentences.Entry
//  ::= "ENTRY" operand ( "USING" ( parameters )+ )? "."
//  ;   

statements.Unstring
  ::= "UNSTRING" operands:references.IdentifierReference, literals.Literal
  	phrases:phrases.DelimitedBy
  	
  	( phrases:phrases.WithPointer )?
  	( phrases:phrases.Tallying )?
  	
  	( errors:statements.Overflow)?
    ( errors:statements.NotOverflow)?
  	( "END-UNSTRING" )? 
  ;
  

statements.Inspect
  ::= "INSPECT" operands:operands.PrimaryOperand
   (phrases:phrases.Converting, phrases.Tallying, phrases.Replacing )+
  ;


statements.Set
  ::= "SET" ( operands:operands.PrimaryOperand )+ phrases:phrases.To;
  
statements.SetSwitches
  ::= "SET" ( operands:references.IdentifierReference )+ 
  	  "TO" switch[on : "ON", off : "OFF"];
  
statements.SetConditionNamesToTrue
  ::= "SET" ( operands:references.IdentifierReference )+
    "TO" "TRUE"
  ;    

statements.SetIndexNames
  ::= ( operands:references.IdentifierReference )+ 
  	adjust[ up : "UP", down : "DOWN"] 
	phrases:phrases.By
  ;

statements.Return
  ::= "RETURN"  (operands:references.IdentifierReference)
    ( "RECORD" )? ( phrases:phrases.Into )?
    ( errors:statements.AtEnd )?
    ( errors:statements.NotAtEnd )?
    ( "END-RETURN" )?
  ;  

statements.ExecSQLStatement
  ::= "EXEC" (water:water.SQLStatementWater)* "END-EXEC"
  ;
  
statements.ExecCICSStatement
  ::= "EXEC" (water:water.CICSStatementWater)* "END-EXEC"
  ;  
  
statements.Accept
  ::= "ACCEPT" operands:references.IdentifierReference 
  ( water:water.AcceptStatementWater )*
  ;
 
//For all arithmetic statements, merged all the formats into one, for the sake of simplicity
@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
statements.Add
	::=  "ADD" ( operands:references.IdentifierReference, literals.Literal )+ 
        ( phrases:phrases.To)? ( phrases:phrases.Giving)?
        ( errors:statements.SizeError)?
        ( errors:statements.NotSizeError)?
        ( "END-ADD" )?
	;	

@SuppressWarnings(featureWithoutSyntax) 
statements.Multiply
	::= "MULTIPLY"
   		( operands:references.IdentifierReference, literals.Literal )+ 
    	( phrases:phrases.By )? ( phrases:phrases.Giving )?
		( errors:statements.SizeError)?
    	( errors:statements.NotSizeError)?
    	( "END-MULTIPLY" )?
  ;


statements.Subtract
	::= "SUBTRACT"
		( operands:references.IdentifierReference, literals.Literal )+
        ( phrases:phrases.From)? ( phrases:phrases.Giving )?
        ( errors:statements.SizeError)?
    	( errors:statements.NotSizeError)?
        ( "END-SUBTRACT" )?
	;

//remainder can only be an identifier

statements.Divide
	::= "DIVIDE"
       ( operands:references.IdentifierReference, literals.Literal )+
       ( phrases:phrases.Into, phrases.By)? ( phrases:phrases.Giving )? 
       ( phrases:phrases.Remainder)?
       ( errors:statements.SizeError)?
       ( errors:statements.NotSizeError)?
       ( "END-DIVIDE" )?
 	;
  
statements.Compute
	::= "COMPUTE"
        expression:arithmetics.AssignmentExpression
       // expression:expressions.SimpleExpression
        ( errors:statements.SizeError)?
    	( errors:statements.NotSizeError)?
        ( "END-COMPUTE" )?
	;

statements.Display
	::= "DISPLAY" ( operands:references.IdentifierReference, literals.Literal )+
        ( phrases:phrases.Upon )?
   //     ( ( "WITH" #1 )? "NO" #1 "ADVANCING")?
	;
	
statements.SizeError
::=  ( "ON" #1 )? "SIZE"  #1 "ERROR" statements+      
;  

statements.Overflow
  ::= ( "ON" #1 )? "OVERFLOW" statements+
  ;

statements.Exception
  ::= ( "ON" #1 )? "EXCEPTION" statements+ 
  ;

statements.AtEnd 
  ::= ( "AT" )? "END" statements+    
  ;

statements.NotSizeError
  ::= "NOT" #1 errorStatement:statements.SizeError
  ;
  
statements.NotOverflow
  ::= "NOT" #1 errorStatement:statements.Overflow
  ;	  

statements.NotException
  ::= "NOT" #1 errorStatement:statements.Exception
  ;
  
statements.NotAtEnd
  ::= "NOT" #1 errorStatement:statements.AtEnd   
  ;  	

statements.Move
  ::= "MOVE" #1 operands:operands.PrimaryOperand phrases:phrases.To
  ;

statements.PerformNestedStatement
	::= "PERFORM"
		(  phrases:phrases.Times, phrases.Until, phrases.Varying  )*
        //Optionality (?) of nested statement removed
        ( statements+ )
        "END-PERFORM"
	;
        
// target[] is the procedureName
// Not sure what 'THROUGH' procedure name is?!? I'll call it throughTarget[]       
statements.PerformProcedure
	::= "PERFORM" label:labels.ProcedureRange
		(  phrases:phrases.Times, phrases.Until, phrases.Varying  )*
  ;
  
  
//labels 


labels.Run ::= "RUN";

labels.ProcedureRange
	::= children:labels.ParagraphLabel, labels.SectionLabel 
		( ("THRU" | "THROUGH")  children:labels.ParagraphLabel, labels.SectionLabel)?
		;

labels.SectionLabel
	::= target[]
	;
	
labels.ParagraphLabel
	::= target[] ( ( "IN" | "OF") section[])?
	;		  
  
statements.String
  ::= "STRING"  operands:operands.DelimitedOperands+ 
    phrases:phrases.Into 
    ( phrases:phrases.WithPointer )?
    ( errors:statements.Overflow)?
    ( errors:statements.NotOverflow)?
    ( "END-STRING" )?
  ;  


// condition points to ConditionExpression in Conditions Package

statements.Condition 
 ::= "IF" condition:conditions.ConditionalOrExpression ( #1 "THEN" )?
 	//	"IF" condition:expressions.SimpleExpression ( #1 "THEN" )?  
 		//true part can be nestedstatements or next statement
        //statements:statements.NestedStatement, statements.Next
        statements+
        //else part can be nestedstatements or next statement
        ( !0 "ELSE" !0 elseStatements+ )?
        ("END-IF")?
  ;
  
statements.NextSentence ::= "NEXT" #1 "SENTENCE";

//Need to recheck if this is the only possible stop statement
//stop label ::= "STOP" | literal 
//
statements.Stop ::= "STOP" label;

statements.GoBack ::= "GOBACK";

statements.GoTo
  ::=  "GO" ( "TO" )? 
  		( labels:labels.ProcedureRange )* // target
  		( phrases:phrases.DependingOn )? //condition
  ;  
  
statements.Exit
  ::= "EXIT" #1 ( exitLabel[program : "PROGRAM", paragraph : "PARAGRAPH", method : "METHOD"])?
  ;
 
statements.Cancel
  ::= "CANCEL" operands:references.IdentifierReference, literals.AlphanumericLiteral+
  ;  

statements.Close
  ::= "CLOSE" ( operands:references.IdentifierReference// (water:water.CloseStatementWater)* 
  )+
  ;

statements.Call
  ::= "CALL"  operands:references.IdentifierReference, literals.Literal
    ( "USING" ( arguments )+ )?
    ( "RETURNING" returning )?
    ( errors:statements.Overflow, statements.Exception, statements.NotException) *
    ( "END-CALL" )?
  ;
  
statements.Initialize
  ::= "INITIALIZE" ( operands:references.IdentifierReference )+
     ( phrases:phrases.Replacing )?
  ;
  
statements.Invoke
  ::= "INVOKE" (water:water.InvokeStatementWater)*
  	( errors:statements.Exception )?
  	( errors:statements.NotException )?
   	( "END-INVOKE" )?
  ;
  

statements.Open
  ::= "OPEN" type[input : "INPUT", output : "OUTPUT", io : "I-O", extend : "EXTEND"]
     ( operands:references.IdentifierReference (water:water.OpenStatementWater) )+
  ;
  
//AllOperand should become AllIdentifier  
statements.SerialSearch
  ::= "SEARCH" 
    operands:references.IdentifierReference phrases:phrases.Varying
    ( errors:statements.AtEnd )?
    whens+
    ( "END-SEARCH" )?
  ;  
  
statements.BinarySearch
  ::= "SEARCH" operands:operands.AllOperand
    ( errors:statements.AtEnd )?
    whens+
    ( "END-SEARCH" )?
  ;  
  
//The arguments esp. the omitted clause does not conform to the grammar
functions.ByReferenceArgument
  ::= ( ( "BY" )? "REFERENCE" )? ( operands:references.IdentifierReference )+
  ;

functions.ByContentArgument
  ::= ( "BY" )? "CONTENT" ( operands:references.IdentifierReference )+
  ;
  
functions.OmittedArgument
  ::= "OMITTED" 
  ;  

functions.ByValueArgument
  ::= ( "BY" )? "VALUE" ( operands:references.IdentifierReference )+
  ;

 
//here the subjects = operands  
statements.Evaluate
  ::= "EVALUATE" subject:conditions.ExpressionList
    ( cases )+
    ( "END-EVALUATE" )?
  ;    

statements.NormalEvaluateCase
  ::= ( whenCases )+ 
  	statements+
  ;
  
statements.When
  ::= "WHEN" object:conditions.ExpressionList ;  

// ========================================================
// whenOther
// ........................................................

statements.OtherEvaluateCase
  ::= "WHEN" "OTHER"  statements+
  ;
  
  
//Expressions

//Investigate further
conditions.ExpressionList
    ::= expressions:conditions.ConditionalOrExpression ("ALSO" expressions:conditions.ConditionalOrExpression)*
    ; 

conditions.ConditionalOrExpression
	::= children:conditions.ConditionalAndExpression 
		("OR" #1 children:conditions.ConditionalAndExpression)*
    ;

@SuppressWarnings(minOccurenceMismatch)
conditions.ConditionalAndExpression
	::= children:conditions.NegatedConditionalExpression, conditions.AbbreviatedConditionalExpression
		("AND" #1 children:conditions.NegatedConditionalExpression, conditions.AbbreviatedConditionalExpression)*
    ;
    
@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
conditions.NegatedConditionalExpression
	::=  (negateOperator)? child:conditions.RelationalExpression, 
			 conditions.SignCondition, conditions.ClassCondition, 
							references.ConditionNameReference
    ;

conditions.NestedCondition
	::= "(" condition:conditions.ConditionalOrExpression ")"
	;

//TODO removed the optionality of the right hand side
conditions.RelationalExpression
	::= children:arithmetics.RangeExpression 
		( (is)? (negateOperator)? relationalOperator children:arithmetics.RangeExpression )
	;
	
conditions.SignCondition
	::= child:references.IdentifierReference ( (is)? (negateOperator)? signOperator )	
	;
	
conditions.ClassCondition
	::= child:references.IdentifierReference ( (is)? (negateOperator)? classOperator )
	;	
	
conditions.AbbreviatedConditionalExpression
	::= ( children:conditions.NegatedAbbreviatedConditionalExpression )+
	;
	
conditions.NegatedAbbreviatedConditionalExpression
	::= ( negateOperator )? child:conditions.AbbreviatedRelationalExpression	
	;	

conditions.AbbreviatedRelationalExpression
	::= ( (is)? (negateOperator)? relationalOperator ) 
		child:arithmetics.RangeExpression, conditions.NestedAbbreviatedConditionalExpression
	;
	
conditions.NestedAbbreviatedConditionalExpression
	::= "(" expression:arithmetics.RangeExpression  rest:conditions.NegatedAbbreviatedConditionalExpression ")"
	;	

//A range expression consisting of the THRU | THROUGH expression 

arithmetics.RangeExpression
	::= children:arithmetics.AdditiveArithmeticExpression
		( throughOperator children:arithmetics.AdditiveArithmeticExpression)?
		;
//A simple expression language consisting of arithmetic expressions
//Assignment Expression is made-up

// All literals can be terminals instead of only numeric literals

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.AssignmentExpression
::= ( children:operands.RoundedIdentifier, references.IdentifierReference )+ 
		( assignmentOperator #1 value:arithmetics.AdditiveArithmeticExpression)
    ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.AdditiveArithmeticExpression
    ::= children:arithmetics.MultiplicativeArithmeticExpression 
   	( #1 additiveOperators #1 children:arithmetics.MultiplicativeArithmeticExpression )*
   ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.MultiplicativeArithmeticExpression
   ::=	children:arithmetics.PowerArithmeticExpression 
    	( #1 multiplicativeOperators #1 children:arithmetics.PowerArithmeticExpression )*
    ;
         
@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.PowerArithmeticExpression
    ::= children:arithmetics.UnaryArithmeticExpression ( #1 "**" #1 children:arithmetics.PrimaryExpression)*
    ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match 	
arithmetics.UnaryArithmeticExpression 
	::= (unaryOperator)? child:arithmetics.PrimaryExpression
	;

 // arguments is connected to Operand

functions.FunctionCall 
	::= "FUNCTION" name[]
		( "(" ( arguments )+ ")" )?
		( modifier )?
	;	

//references
	
references.IdentifierReference
	::= target[]
		( ("IN" | "OF") dataNames[])*
		( ("IN" | "OF")  fileName[])?
        (  "("  subscripts + ")" )?
        ( modifier )? 
  ;


references.DataDivisionConditionNameReference
	::= target[]
		( ("IN" | "OF") dataNames[] )*
		( ("IN" | "OF")  fileName[] )?
        (  "("  subscripts + ")" )? 
  ;

references.SpecialNameConditionNameReference
	::= target[]
		( ("IN" | "OF")  mnemonicNames[] )*
		;
  
references.LinageCounter 
	::= "LINAGE-COUNTER" ( ( "IN" | "OF" ) fileName[] )?
	;

subscripts.RelativeSubscript
  ::= reference additiveOperator integer
  ;
  
references.ReferenceModifier
  ::= "(" expressions:arithmetics.AdditiveArithmeticExpression ":"
        ( expressions:arithmetics.AdditiveArithmeticExpression )? ")"
  ;
  

phrases.Converting 
	::= "CONVERTING" (phrases:phrases.ReplacingBy)
  ;

phrases.Replacing
	::= "REPLACING" ( option[all : "ALL", leading : "LEADING", first : "FIRST"] )?
		( phrases:phrases.ReplacingBy )+ ;

phrases.ReplacingBy
	::= operands:operands.ReplacementOperand phrases:phrases.By (locations)*;

phrases.Location 
	::= position[before: "BEFORE", after: "AFTER"]
		isInitial["INITIAL" : ""]
		operands:references.IdentifierReference, literals.Literal
	;	
  
phrases.Delimiter
  ::= "DELIMITER" ( "IN" )? operands:references.IdentifierReference, literals.Literal
  ;
  
phrases.Count
  ::= "COUNT" ( "IN" )? operands:references.IdentifierReference, literals.Literal 
  ;
  
phrases.Tallying
  ::= "TALLYING"  (phrases:phrases.In)+
  ;     	
  
phrases.In  
  ::= ( "IN" )? operands:references.IdentifierReference (phrases:phrases.For)?
  ;
  
phrases.For  
    ::= "FOR" ( option[all:"ALL", leading:"LEADING"] )? ( phrases:phrases.Tallied )+ 
    ;
    
phrases.Tallied
	::= operands:references.IdentifierReference, literals.Literal ( locations )*
	;
    
//May change the settings for the size  
phrases.DelimitedBy
  ::= "DELIMITED"  ( "BY" )?
   ( operands:references.IdentifierReference, literals.Literal );
   
phrases.DelimitedBySize
  ::= "DELIMITED"  ( "BY" )? "SIZE" 
  ; 

phrases.WithPointer
  ::= ( "WITH" )?  "POINTER"  operands:references.IdentifierReference
  ;  


phrases.Upon
  ::= "UPON" operands:references.IdentifierReference //environmentName, MneomincName
  ;  	

phrases.Times 		::= operands:references.IdentifierReference, literals.IntegerLiteral "TIMES"
	;
//changed from ConditionExpression to ConditionalLogicExpression
phrases.Until 		::= "UNTIL" condition:conditions.ConditionalOrExpression
//"UNTIL" condition:expressions.SimpleExpression
	;
	
phrases.Varying		::= "VARYING" operands:references.IdentifierReference
        			from by
        			until
       	 			( afters )*
    ;
    
phrases.After		::= "AFTER" operands:references.IdentifierReference
          			from by
          			until
    ;     
          					
phrases.To 			::= "TO" ( operands:references.IdentifierReference,
								literals.Literal, operands.RoundedIdentifier )+
	;
	
phrases.Giving		::= "GIVING" ( operands:operands.RoundedIdentifier, references.IdentifierReference )+
	;

phrases.From		::= "FROM" ( operands:references.IdentifierReference,
								literals.Literal, operands.RoundedIdentifier )+
	;

// changed the operands from operands:references.IdentifierReference,
// literals.Literal, operands.RoundedIdentifier
// to operands:operands.ReplacementOperand
phrases.By			::=	"BY" ( operands:operands.ReplacementOperand )+
	;
	
phrases.Remainder	::= "REMAINDER" ( operands:references.IdentifierReference )+
	;
	
phrases.Into		::=  "INTO" ( operands:references.IdentifierReference,
								literals.Literal, operands.RoundedIdentifier )+
	;

//target is an identifier reference
phrases.DependingOn
  ::= "DEPENDING" ( "ON" )?  operands:references.IdentifierReference,literals.Literal, operands.RoundedIdentifier;


@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match 	
phrases.TestPosition
  ::= ( "WITH" #1 )? "TEST" position[before: "BEFORE", after : "AFTER"]
  ;


// paramters
parameters.ByReferenceParameter 
	::= (( "BY" )?  "REFERENCE" )? target[] ;

parameters.ByValueParameter
	::= ( "BY" )? "VALUE" target[];
	
	
 //operands


operands.UnstringedIdentifier
  ::= operands:references.IdentifierReference 
  	( phrases:phrases.Delimiter, phrases.Count )+
  	;

//this is a OR conditional operand  	
operands.AllOperand
  ::= "ALL" operands:references.IdentifierReference, literals.Literal
  ;  	

operands.Encoding ::=  type[ alphabetic : "ALPHABETIC", alphanumeric : "ALPHANUMERIC",
    alphanumericEdited : "ALPHANUMERIC-EDITED", national : "NATIONAL",
    nationalEdited : "NATIONAL-EDITED", numeric : "NUMERIC", 
    numericEdited : "NUMERIC-EDITED", dbcs : "DBCS", egcs : "EGCS"] ("DATA")?
    ;
    
operands.Characters ::= "CHARACTERS";

operands.DelimitedOperands
  ::= (operands:references.IdentifierReference, literals.Literal)+ delimitedBy
  ;
  
operands.RoundedIdentifier			::= operands:references.IdentifierReference "ROUNDED";

operands.CorrespondingIdentifier	::= ("CORRESPONDING" | "CORR") operands:references.IdentifierReference;

operands.CobolWord ::= value[];	

//verbs
	
verbs.Verb
	::= value[add : "ADD", call : "CALL", cancel : "CANCEL",
		close : "CLOSE", delete : "DELETE", divide : "DIVIDE",
		entry : "ENTRY", evaluate : "EVALUATE", exec : "EXEC",
		exit : "EXIT", goback : "GOBACK", go : "GO", if : "IF", 
		move : "MOVE", multiply : "MULTIPLY",  open : "OPEN",
		perform : "PERFORM", read : "READ", release : "RELEASE",
		return : "RETURN",  rewrite : "REWRITE", search : "SEARCH",
		stop : "STOP", string : "STRING", subtract : "SUBTRACT",
		unstring : "UNSTRING", write : "WRITE", set : "SET",
		initialize : "INITIALIZE", display : "DISPLAY", 
		compute : "COMPUTE", inspect : "INSPECT", start : "START",
		use : "USE", accept : "ACCEPT", alter : "ALTER", 
		continue : "CONTINUE", merge : "MERGE", sort : "SORT", 
		enable : "ENABLE", disable : "DISABLE", send : "SEND",
		receive : "RECEIVE", purge : "PURGE", initiate : "INITIATE",
		generate : "GENERATE", terminate : "TERMINATE"]
  ;
  
verbs.Is ::= "IS";   


// operators

operators.Addition				::= "+";
operators.Subtraction       	::= "-";
		
operators.Multiplication    	::= "*" ;
operators.Division         		::= "/" ;

operators.Power					::= "**";
operators.Negate 				::= "NOT" ;	

operators.ConditionAnd 			::= "AND";
operators.ConditionOr 			::= "OR";	

//EQUAL, I added manually
operators.EqualSign				::= "=";
operators.EqualPhrase			::= "EQUAL" to["TO" : ""] ;

//relational operators
operators.LTSign 				::= "<";
operators.LTPhrase				::= "LESS" than["THAN" : ""] ;

operators.GTSign				::=  ">" ;
operators.GTPhrase			::= "GREATER" than["THAN" : ""] ;

//the relational operators with equal sign cannot have the negate operators

operators.LTEQSign				::= "<" "=" ;
operators.LTEQPhrase			::= "LESS" than["THAN" : ""] "OR" "EQUAL" to["TO":""] ;

operators.GTEQSign				::= ">" "=" ;
operators.GTEQPhrase			::= "GREATER" than["THAN" : ""] "OR" "EQUAL" to["TO":""] ;

//sign operators
operators.Positive				::= "POSITIVE";
operators.Negative				::= "NEGATIVE";
operators.Zero					::= "ZERO";										

//class operators
operators.Numeric				::= "NUMERIC";
operators.Alphabetic			::= "ALPHABETIC";
operators.AlphabeticLower		::= "ALPHABETIC-LOWER";
operators.AlphabeticUpper		::= "ALPHABETIC-UPPER";
operators.DBCS					::= "DBCS";
operators.Kanji					::= "KANJI";

//operators.ClassName				::= target[];										

operators.Through				::= value[through :"THROUGH", thru :"THRU"] ;
	
// do not change the order of the literals!

literals.IntegerLiteral
	::= value[DECIMAL_INTEGER_LITERAL];
	
literals.FixedDecimalLiteral
	::= value[DECIMAL_FIXED_LITERAL];

literals.FloatingDecimalLiteral
	::= value[DECIMAL_FLOAT_LITERAL];	
	
literals.AlphanumericLiteral
	::= value[ALPHANUMERIC_LITERAL];	

//literals.NationalLiteral
//	::= value[NATIONAL_LITERAL];

//literals.NationalHexLiteral
//	::= value[NATIONAL_HEX_LITERAL];	
	
	
literals.PseudoLiteral
	::= value[PSEUDO_LITERAL];
	
//literals.BooleanLiteral 
//	::= value[BOOLEAN_LITERAL];

// All Literal 'value' needs to point something that is a superset of both ConstantLiteral and an Identifier	
//literals.AllLiteral ::= "ALL" constant;
	

literals.Null ::= value[null: "NULL", nulls : "NULLS"];

literals.Zero ::= value[zero : "ZERO", zeros : "ZEROS", zeroes : "ZEROES"];

literals.Quote ::= value[quote : "QUOTE", quotes : "QUOTES"];

literals.LowValue ::= value [lowValue : "LOW-VALUE", lowValues : "LOW-VALUES"];
		
literals.HighValue ::= value[highValue : "HIGH-VALUE", highValues : "HIGH-VALUES"];

literals.Space ::= value [space : "SPACE", spaces : "SPACES"];

literals.Any ::= "ANY";

//environments

//System Logical Input Unit - Allowed in ACCEPT
environments.SystemLogicalInput
  ::= value[sysin : "SYSIN", sysipt : "SYSIPT" ] 
  ;
  	
//System Logical Output Unit - Allowed in DISPLAY
environments.SystemLogicalOutput
  ::= value[ sysout : "SYSOUT", syslist : "SYSLIST", 
  			syslst : "SYSLST" ]
  ;
   
    //System Punch Device - Allowed in DISPLAY 
environments.SystemPunchDevice
  ::= value[syspunch : "SYSPUNCH", syspch : "SYSPCH" ]
   ;
    //Console - Allowed in ACCEPT and DISPLAY
environments.Console ::= "CONSOLE" ;
   
//Skip to Channel 1-12 - Allowed in WRITE ADVANCING
environments.Channel 
	::= value[c1 : "C01", c2 : "C02", c3 : "C03", 
			  c4 : "C04", c5 : "C05", c6 : "C06", 
			  c7 : "C07", c8 : "C08", c9 : "C09",
			  c10: "C10", c11: "C11", c12: "C12" ]
	;
	  
//Suppress spacing - Allowed in WRITE ADVANCING	  
environments.SuppressSpacing ::= "CSP" ;
   
//Pocket select 1-5 - Allowed in WRITE ADVANCING
environments.Pocket
  ::= value[s1 : "S01", s2 : "S02", s3: "S03", 
  			s4 : "S04", s5 : "S05"]
  ;		
     
    //Advanced Function Printing - Allowed in WRITE ADVANCING 
environments.AdvancedFunctionPrinting ::= "AFP-5A";
 
environments.UPSI
  ::= value[upsi0 : "UPSI-0", upsi1 : "UPSI-1",
  			upsi2 : "UPSI-2", upsi3 : "UPSI-3",
  			upsi4 : "UPSI-4", upsi5 : "UPSI-5", 
  			upsi6 : "UPSI-6", upsi7 : "UPSI-7" ]
  	;

//Registers

@SuppressWarnings(featureWithoutSyntax)
registers.ShiftIn ::= "SHIFT-IN" ;

@SuppressWarnings(featureWithoutSyntax)
registers.ShiftOut ::= "SHIFT-OUT" ;

@SuppressWarnings(featureWithoutSyntax)
registers.AddressOf ::= "ADDRESS" ( "OF" )? operands:references.IdentifierReference ;

@SuppressWarnings(featureWithoutSyntax)
registers.LengthOf ::= "LENGTH" ( "OF" )? operands:references.IdentifierReference ;

@SuppressWarnings(featureWithoutSyntax)
registers.ReturnCode ::= "RETURN-CODE" ;

@SuppressWarnings(featureWithoutSyntax)
registers.WhenCompiled ::= "WHEN-COMPILED" ;

//Water Section  
water.CobolWord
  ::= value[]
  ;

water.Dot ::= "." ;

water.ProgramDescription
  ::= value[author : "AUTHOR", installation : "INSTALLATION", dateWritten : "DATE-WRITTEN",
  		dateCompleted : "DATE-COMPLETED", security : "SECUTIRY"]
   ;

water.ObjectComputerDescription 
  ::= value[memory : "MEMORY", size : "SIZE", words : "WORDS",
  characters : "CHARACTERS", modules : "MODULES", segment : "SEGMENT",
  program : "PROGRAM", collating : "COLLATING", sequence : "SEQUENCE",
  segmentLimit : "SEGMENT-LIMIT" ]
;

water.SpecialNamesClause
  ::= value[decimalPoint : "DECIMAL-POINT", is : "IS", 
  			comma : "COMMA", xmlSchema : "XML-SCHEMA"]
  	;

//water.SelectStatementClause
//  ::= value[alternate : "ALTERNATE", record : "RECORD", key : "KEY",
//	relative : "RELATIVE", delimiter : "DELIMITER", standard1 : "STANDARD-1",
//	padding : "PADDING", character : "CHARACTER", reserve : "RESERVE",
//	area : "AREA", areas : "AREAS", access : "ACCESS", mode : "MODE",
//	is : "IS", sequential : "SEQUENTIAL", random : "RANDOM", 
//	with : "WITH", dynamic : "DYNAMIC", 
//	organization : "ORGANIZATION", duplicates : "DUPLICATES"]
//	;
	
//water.FileDescription
//	::=   value [block : "BLOCK", contains : "CONTAINS", to : "TO",
//  	characters : "CHARACTERS", records : "RECORDS",
//  	codeSet : "CODE-SET", is : "IS",  data : "DATA", 
//  	record : "RECORD", are : "ARE", label : "LABEL", omitted : "OMITTED",  
//  	standard : "STANDARD", linage : "LINAGE", lines : "LINES", 
//  	with : "WITH", footing : "FOOTING",   at : "AT", top : "TOP", 
//  	bottom : "BOTTOM", varying : "VARYING",  in : "IN", size : "SIZE", 
//  	from : "FROM", depending : "DEPENDING", on : "ON", mode : "MODE",
//  	recording : "RECORDING", f : "F", v : "V",  u : "U", s : "S",  
//  	value : "VALUE", of : "OF", identification : "IDENTIFICATION",
//  	id : "ID", report : "REPORT", reports : "REPORTS"]
// ;	
// intege, alphabetName, dataName, filename, cobolWord, reportName 
	
//water.DataDescription
//  ::= value [blank : "BLANK", when : "WHEN", zero : "ZERO",
//  	  zeros : "ZEROS", zeroes : "ZEROES",
//	  justified : "JUSTIFIED", just : "JUST", right : "RIGHT",
//	  sign : "SIGN", is : "IS",
//	  leading : "LEADING", trailing : "TRAILING",
//	  separate : "SEPARATE", character : "CHARACTER",
//	  date : "DATE", format : "FORMAT", synchronized : "SYNCHRONIZED",
//	  sync : "SYNC", left : "LEFT"]
//	  ; //datepattern
	  
water.IOControlDescription
  ::= value [ rerun : "RERUN", on : "ON", of : "OF", record : "RECORD",
  	  records : "RECORDS", every : "EVERY", same : "SAME",
  	  area : "AREA", for : "FOR", multiple :"MULTIPLE",
  	  file : "FILE", tape : "TAPE", contains : "CONTAINS",
  	  position : "POSITION", apply : "APPLY", writeOnly : "WRITE-ONLY",
	  sort : "SORT", sortMerge : "SORT-MERGE",
	  reel : "REEL", unit : "UNIT"] 
  ;	  
// integer | assignmentname | filename

water.RepositoryDescription
  ::= value [ class : "CLASS", is : "IS"]
  ;
  //cobolword
  
water.SQLStatementToken
  ::= value [ include : "INCLUDE", select : "SELECT", declare : "DECLARE",
  	  from : "FROM", insert : "INSERT", into : "INTO",
  	  update : "UPDATE", delete : "DELETE"]
  ;   

//water.CICSStatementToken
//  ::= value[ts : "TS", queue : "QUEUE", qname :"QNAME", openpar: "(",
//  	closepar : ")",  sysid : "SYSID", sys : "SYS", set : "SET", into : "INTO",
//  	length : "LENGTH", item : "ITEM", next : "NEXT", numitems : "NUMITEMS",
//	td : "TD", writeq : "WRITEQ", from : "FROM", rewrite : "REWRITE", 
//	nosuspend : "NOSUSPEND", main : "MAIN", auxiliary : "AUXILIARY",
//	deleteq : "DELETEQ", read : "READ", file : "FILE", dataset : "DATASET",
//	ridfld : "RIDFLD", keylength : "KEYLENGTH", generic : "GENERIC", 
//	gteq : "GTEQ", equal : "EQUAL", uncommitted : "UNCOMMITTED", tr : "TR",
//	consistent : "CONSISTENT",  repeatable : "REPEATABLE", update : "UPDATE", 
//	token : "TOKEN", rba : "RBA", xrba : "XRBA", rrn : "RRN", write : "WRITE",
//	massinsert : "MASSINSERT", program : "PROGRAM", commarea : "COMMAREA", 
//	datalength : "DATALENGTH",  synconreturn : "SYNCONRETURN", 
//	transid : "TRANSID", inputmsg : "INPUTMSG", inputmsglen : "INPUTMSGLEN",
//	channel : "CHANNEL", xctl : "XCTL", load : "LOAD", start : "START" ]
//  ;

water.AcceptStatementToken
  ::= value[from : "FROM", date : "DATE", day : "DAY", dow : "DAY-OF-WEEK",
  		time : "TIME", dateformat1 : "YYYMMDD" , dateformat2 : "YYYYDDD"]
  ;
  
water.UseStatementToken
  ::= value[ global : "GLOBAL", after : "AFTER", standard : "STANDARD",
  		error : "ERROR", exception : "EXCEPTION", procedure : "PROCEDURE",
  		on : "ON", input : "INPUT", output : "OUTPUT", io : "I-O",
    	extend : "EXTEND", for : "FOR", debugging : "DEBUGGING",
    	all : "ALL", procedures : "PROCEDURES", beginning : "BEGINNING",
    	ending : "ENDING", file : "FILE", reel : "REEL", unit : "UNIT",
    	label : "LABEL"]  
	;
// fileName  | procedureName

water.CloseStatementToken
  ::= value [with : "WITH", no : "NO", rewind : "REWIND", lock : "LOCK",
  reel : "REEL", unit : "UNIT", for : "FOR", removal : "REMOVAL"]
  ; 

water.OpenStatementToken
  ::= value [ reversed : "REVERSED", with : "WITH", no : "NO", rewind : "REWIND"]
  ;
  
water.InvokeStatementToken    
  ::= value[self : "SELF", super : "SUPER", new : "NEW", using : "USING", 
  	by : "BY", value : "VALUE", length : "LENGTH", of : "OF", returning : "RETURNING"]
   ;
   //classname, identifier, literal
  
//water.DisplayStatementToken
//  ::= value [with : "WITH", no : "NO", advancing : "ADVANCING"]
//  ;  

//change the levelnumber lexer rule to something more general
water.PriorityNumber
  ::= value [DECIMAL_INTEGER_LITERAL]
  ;
    
}