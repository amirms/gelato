package org.servicifi.gelato.language.cobol.preprocessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;

public class InputPreprocessor {

	private InputStream inputStream;
	
	private static final int INDICATOR_AREA = 6;
	private static final char COMMENT_SIGN1 = '*';
	private static final char COMMENT_SIGN2 = '/';
	private static final char CONTINUATION_SIGN = '-';
	private static final char DEBUGGING_SIGN = 'D';
	private static final char NEW_LINE = '\n';
	private static final char LITERAL_QUOTE_OPEN = '\'';
	private static final char LITERAL_DBL_QUOTE_OPEN = '"';
	
	private static final char DISAMBIGUATED_COMMENT_SIGN = '#';
	
	private static final int RECORD_LENGTH = 72;
	
	private static final char WHITE_SPACE = ' ';
	
	private Stack<Character> stack666 = new Stack<Character>();
	private Stack<Character> stack = new Stack<Character>();
	
	private int col = 0;
	private int row = 1;
	
	private boolean comment = false;
	private int picstate = 0;
	private int decstate = 0;

	private boolean progstarted = false;

	public InputPreprocessor(InputStream inputStream){
		this.inputStream = inputStream;
	}
		
	public int read(boolean sourcefile) throws IOException {
		
		int next, read;
		char c, nextchar;
		
		if (!stack.empty())
			read = stack.pop();
		else
			read = read666();

		if ( read > 0) {
			
			c = (char) read;
			
			if(c==DISAMBIGUATED_COMMENT_SIGN)
				comment = true;

			if (comment && (c == NEW_LINE ))
				comment = false;
			
			char[] n = new char[14];
			
			int idstate = 0;
			
			n[0] = c;
			
			if (!comment && !progstarted && sourcefile)
			{
				while(!progstarted )
				{				
					switch(idstate){
					case 0:
						
						idstate = (n[idstate] == 'I')?1:0;
						n[idstate] = (char) read666();
						break;
					case 1:
						
						idstate = (n[idstate] == 'D')?2:0;
						n[idstate] = (char) read666();
						break;
					case 2:
						
						idstate = (n[idstate] == 'E')?3:0;
						n[idstate] = (char) read666();
						break;
					case 3:
						
						idstate = (n[idstate] == 'N')?4:0;
						n[idstate] = (char) read666();
						break;
					case 4:
						
						idstate = (n[idstate] == 'T')?5:0;
						n[idstate] = (char) read666();
						break;
					case 5:
						
						idstate = (n[idstate] == 'I')?6:0;
						n[idstate] = (char) read666();
						break;
					case 6:
						
						idstate = (n[idstate] == 'F')?7:0;
						n[idstate] = (char) read666();
						break;
					case 7:
						
						idstate = (n[idstate] == 'I')?8:0;
						n[idstate] = (char) read666();
						break;
					case 8:
						
						idstate = (n[idstate] == 'C')?9:0;
						n[idstate] = (char) read666();
						break;
					case 9:
						
						idstate = (n[idstate] == 'A')?10:0;
						n[idstate] = (char) read666();
						break;
					case 10:
						
						idstate = (n[idstate] == 'T')?11:0;
						n[idstate] = (char) read666();
						break;
					case 11:
						
						idstate = (n[idstate] == 'I')?12:0;
						n[idstate] = (char) read666();
						break;
					case 12:
						
						idstate = (n[idstate] == 'O')?13:0;
						n[idstate] = (char) read666();
						break;
					case 13:
						
						idstate = (n[idstate] == 'N')?14:0;
						if(idstate!=14)
							n[idstate] = (char) read666();
						break;
					case 14:
						progstarted = true;
						break;
					}
				}	
				for (int j = n.length-1; j > 0; j-- )
					stack.push(n[j]);
					
				return n[0];
					
			}
			
			
			
			
			if (!comment && picstate <= 10)
				switch (picstate) {
					case 0: 
						picstate = (c == 'P')?1:0;
						break;
					case 1: 
						picstate = (c == 'I')?2:0;
						break;
					case 2: 
						picstate = (c == 'C')?3:0;
						break;
					case 3: 
						picstate = (c == 'T')?4:(c==WHITE_SPACE||c==NEW_LINE)?8:0;
						break;
					case 4: 
						picstate = (c == 'U')?5:0;
						break;
					case 5: 
						picstate = (c == 'R')?6:0;
						break;
					case 6: 
						picstate = (c == 'E')?7:0;
						break;
					case 7: 
						picstate = (c==WHITE_SPACE || c==NEW_LINE)?8:0;
						break;
					//WS	
					case 8: 
						picstate = (c == WHITE_SPACE || c==NEW_LINE)?8:(c=='I')?9:11;	
						break;
					case 9:
						picstate = (c=='S')?10:0;
						break;
						
						//TODO introduce a new picstate
					case 10:
						picstate = (c == WHITE_SPACE || c==NEW_LINE)?10:11;
						break;
				}
			
			if (!comment && picstate <= 10 && decstate <= 2)
				switch (decstate) {
				case 0: 
					decstate = (('0' <= c) && ( c <= '9'))?1:0;
					break;
				case 1: 
					decstate = ((c == '.') || (c == ','))?2:(('0' <= c) && ( c <= '9'))?1:0;
					break;
				
				}
			
			if (picstate==11){
				
				nextchar = (char) read666();
				stack.push( nextchar);
				if (nextchar == WHITE_SPACE || nextchar == NEW_LINE) {
					if (c != '.')
						c = disambiguate(c);			
				
					picstate = 0;
				}
				else
					c = disambiguate(c);	 

			}else if (decstate==2){
				
				nextchar = (char) read666();
				stack.push(nextchar);
				if (('0' <= nextchar) && ( nextchar <= '9')){
					c = disambiguate(c);
				}
				
				decstate = 0;
			}
			
			return c;
		}
		return -1;
		
	}

	
	private static char disambiguate(char c) {
		//System.out.println("changing character: "+ c);
		switch(c) {
			
			case ':' : return ';';
			case '(' : return '[';
			case ')' : return ']';
			case '.' : return '!';
			case ',' : return '~';
		}
		
		return c;
	}


	private int read666() throws IOException{
		if (!stack666.empty()) {
			int result = stack666.pop();
			return result;
		}
		
		int next, read;
		char c, nextchar;
		read = inputStream.read();
		if (read >= 0) {
			c = (char) read;
			col++;
			
			if (col==1 && row ==1)
				c = WHITE_SPACE;
			
			if (col > RECORD_LENGTH)
				while(c!=NEW_LINE)
				{
					c = (char) inputStream.read();
					col++;
				}
			
			if (c == NEW_LINE) {
				
				row++;
				col=0;	
				
			}
			if ((col == 0) || (col == 1)) 	
			{
				int temp = col;
				for (int i=0; i<INDICATOR_AREA - temp; i++)
				{
					if (inputStream.read() < 0)
						return -1;					
					col++;
				}	
			
				//indicator area
				next = inputStream.read();
				nextchar = (char) next;
				
				col++;
				
				//reached the indicator area
				//Do the conversion
				switch (nextchar){
					
					case (COMMENT_SIGN1) : 
						stack666.push(DISAMBIGUATED_COMMENT_SIGN);
						break;
					case (COMMENT_SIGN2) : 
						stack666.push(DISAMBIGUATED_COMMENT_SIGN);
						break;
					case (DEBUGGING_SIGN) : 
						stack666.push(DISAMBIGUATED_COMMENT_SIGN);
						break;
					case (CONTINUATION_SIGN) :
					//Keep reading until you see a non-blank charater
					//TODO what if there is none
						next = inputStream.read();
						nextchar = (char) next;
						col++;
						while (nextchar == WHITE_SPACE){
							
							next = inputStream.read();
							nextchar = (char) next;
							col++;
						}
						
						if (nextchar == LITERAL_QUOTE_OPEN || nextchar == LITERAL_DBL_QUOTE_OPEN)
						{
							next = inputStream.read();
							nextchar = (char) next;
							col++; 
						}
						
						return nextchar;
					
					default: stack666.push(nextchar);
						break;
				}
					
			}
			return c;
				
		}
			
		return -1;	
			
	
	}

}
