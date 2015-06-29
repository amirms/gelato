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
#asasasaasasasas
EXEC SQL                                                             
         INCLUDE RTTB100                                                 
    END-EXEC                                                             
    EXEC SQL                                                             
         INCLUDE SQLCA                                                   
    END-EXEC                                                             
    EXEC SQL                                                                                        
                                                  
         FROM   RTTB100                                              
    END-EXEC

01 THE-MESSAGE PIC 9999.
      
01 THE-NUMBER PIC ZZ99XXBCR.
01 ANSWER PIC X VALUE 9. .
01 A-SPACE PIC X USAGE IS POINTER.
66 B-SPACE RENAMES THE-NUMBER.


PROCEDURE DIVISION.

PROGRAM-BEGIN.
PERFORM PROGRAM-INITIALIZATION.
PERFORM MAIN-LOGIC.
COPY X12.
GO TO PROGRAM-DONE IN PROGRAM-INITIALIZATION.

PROGRAM-DONE.
STOP RUN.

PROGRAM-INITIALIZATION SECTION.
MOVE SPACE TO A-SPACE
MOVE 50 TO THE-NUMBER.

DISPLAY 'Is the answer Yes or No? (Y/N)'.
ACCEPT ANSWER.

DISPLAY-THE-ANSWER.
IF ANSWER=  111.
PERFORM IT-IS-VALID.
DISPLAY "You answered Yes.".

PERFORM ACCEPT ANSWER END-PERFORM.

EVALUATE ANSWER                                                                                                   
 WHEN OTHER                                                        
    DISPLAY 'RRSO, OPEN BESTAND, STATUS '             
                                         
     STOP RUN                                                    
   .
IT-IS-VALID.
DISPLAY "Your answer is valid".
IF A-SPACE IS NOT > 55 AND NOT < THE-NUMBER THEN
	DISPLAY "Your answer is valid"
	END-IF.
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
#I am nothing
MOVE "And the smile on the face of the tiger."
TO THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.

ADD-NUMBER-AND-DISPLAY.
ADD ZERO TO THE-NUMBER
DISPLAY THE-NUMBER 
A-SPACE 
THE-MESSAGE.
PERFORM ADD-NUMBER-AND-DISPLAY.
STOP RUN.