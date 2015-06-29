ID DIVISION.
PROGRAM-ID EX01

ENVIRONMENT DIVISION.
CONFIGURATION SECTION.                                                   
SOURCE-COMPUTER. IBM-3090 WITH DEBUGGING MODE.                           
	SPECIAL-NAMES.                                                           
           DECIMAL-POINT IS COMMA.                                              
INPUT-OUTPUT SECTION.                                                    
   	FILE-CONTROL.                                                            
   
    SELECT RRSI01  ASSIGN TO RRSI01.                                   
                   
    SELECT RRSI02 ASSIGN TO RRSI02.                                    
                
    SELECT RRSO  ASSIGN TO RRSO.
     
DATA DIVISION.
       FILE SECTION.                                                                  
       FD  RRSI01 .                                                                               
       FD  RRSI02.    
       FD  RRSO.
WORKING-STORAGE SECTION.

EXEC SQL                                                             
         INCLUDE RTTB100                                                 
    END-EXEC                                                             
    EXEC SQL                                                             
         INCLUDE SQLCA                                                   
    END-EXEC                                                             
    EXEC SQL                                                                                        
         SELECT REK_ID                                                   
               ,VAL_DAT                                                  
               ,DB_BEDR                                                  
               ,CR_BEDR                                                  
         FROM   RTTB100                                              
    END-EXEC

01 THE-MESSAGE PIC XX99X .
      
01 THE-NUMBER PIC ZZ99XXBCR .
	05 XX12 REDEFINES THE-MESSAGE.
01 ANSWER PIC X .
01 A-SPACE PIC X USAGE IS POINTER.
66 B-SPACE RENAMES THE-NUMBER.

PROCEDURE DIVISION.

PROGRAM-BEGIN.
PERFORM PROGRAM-INITIALIZATION.
PERFORM MAIN-LOGIC.

PROGRAM-DONE.
STOP RUN.

PROGRAM-INITIALIZATION.
MOVE SPACE TO A-SPACE
MOVE 50 TO THE-NUMBER.

DISPLAY 'Is the answer Yes or No? (Y/N)'.
ACCEPT ANSWER.

DISPLAY-THE-ANSWER.
IF ANSWER=  111.
PERFORM IT-IS-VALID.
DISPLAY "You answered Yes.".

PERFORM ACCEPT ANSWER ACCEPT ANSWER END-PERFORM.

EVALUATE ANSWER                                                                                                   
 WHEN OTHER                                                        
    DISPLAY 'RRSO, OPEN BESTAND, STATUS '             
                                         
     STOP RUN                                                    
   .
IT-IS-VALID.
DISPLAY "Your answer is valid".

MAIN-LOGIC.
MOVE "There once was a lady from Eiger,"
TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

MOVE "Who smiled and rode forth on a tiger."
TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

MOVE "They returned from the ride" TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

MOVE "With the lady inside," TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

 MOVE "And the smile on the face of the tiger."
TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

ADD-NUMBER-AND-DISPLAY.
ADD ZERO TO THE-NUMBER.
DISPLAY THE-NUMBER 
A-SPACE 
THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY THROUGH THE-MESSAGE.
STOP RUN.