grammar water;

options {
  language = Java;
}

rule: ;
waterObjectComputerParagraph
  : 'MEMORY' | 'SIZE' | integer | 'WORDS' | 'CHARACTERS' 
  | 'MODULES' | 'PROGRAM' | 'COLLATING' | 'SEQUENCE' | 'IS' 
  | alphabetName | 'SEGMENT-LIMIT'| priorityNumber
  ;
  
waterSpecialNames
  : 'DECIMAL-POINT' | 'IS' | 'COMMA' | 'CURRENCY' 
  | 'SIGN' | 'XML-SCHEMA' | literal | xmlSchemaName | externalFileId
  ;
  
waterSelectStatementWithFileStatusOnly
  : 'PASSWORD' |  dataName | 'ALTERNATE' | 'RECORD' 
  | 'KEY' | 'RELATIVE' | 'DELIMITER' | 'STANDARD-1'
  | 'PADDING' | 'CHARACTER' | literal | 'RESERVE'
  | integer | 'AREA'| 'AREAS' | 'ACCESS' | 'MODE' 
  | 'IS' | 'SEQUENTIAL' | 'RANDOM' | 'DYNAMIC' 
  | 'RELATIVE' | 'ORGANIZATION' | 'WITH' | 'DUPLICATES'
  ;
  
waterIOControlParagraph
  : 'RERUN' | 'ON' | 'OF' | 'RECORD' | 'RECORDS'
  | 'EVERY' | 'SAME' | 'AREA' | 'FOR' 
  | 'MULTIPLE' | 'FILE' | 'TAPE' | 'CONTAINS'
  | 'POSITION'  | 'APPLY' | 'WRITE-ONLY'
  | 'SORT'  | 'SORT-MERGE'
  |  'REEL' | 'UNIT' | integer | assignmentname | filename
  ;  