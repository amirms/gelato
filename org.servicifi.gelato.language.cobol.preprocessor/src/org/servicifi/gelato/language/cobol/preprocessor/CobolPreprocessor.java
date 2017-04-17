package org.servicifi.gelato.language.cobol.preprocessor;
import java.io.*;
import java.util.List;

public class CobolPreprocessor {

	/**
	 * @param args
	 */
	
	private static final String COBOL_INPUT_FOLDER = ".\\COBOL";
	private static final String COBOL_COPYBOOK_INPUT_FOLDER = ".\\COPYBOOK";
	private static final String PREPROCESSED_COBOL_OUTPUT_FOLDER = ".\\preprocessed\\cobol\\";
	private static final String PREPROCESSED_COBOL_COPYBOOK_OUTPUT_FOLDER = ".\\preprocessed\\copybook\\";
	
	public static void main(String[] args) {
		
		File inputFolder = new File(COBOL_INPUT_FOLDER).getAbsoluteFile();
		preprocessFilesForFolder(inputFolder, PREPROCESSED_COBOL_OUTPUT_FOLDER, ".cob", true);
		
		//File inputFolder = new File(COBOL_COPYBOOK_INPUT_FOLDER).getAbsoluteFile();
		//preprocessFilesForFolder(inputFolder, PREPROCESSED_COBOL_COPYBOOK_OUTPUT_FOLDER, ".cpy", false);
		
		
	}
	
	public static void preprocessFilesForFolder(File inputFolder, String outputFolderPath, String extension, boolean srcfile)
	{
		File[] listOfFiles = inputFolder.listFiles();
		
		System.out.println("Found files: " + listOfFiles.length);
		
		FileInputStream reader;
		
		FileOutputStream writer;
		
		int filenumber = 0;
		//File file = listOfFiles[0];
		for (File file : listOfFiles) 
		{
			try {
				
				String filename = file.getName();
				// new a reader and point the reader to the file
				reader = new FileInputStream(file);
	 
				// new a writer and point the writer to the file
				writer = new FileOutputStream(outputFolderPath + filename + extension);
				
				System.out.println("Reader and Writer created");
				
				preprocess(reader, writer, srcfile);
				
				filenumber++;
				
				System.out.println("Finished preprocessing filenumber: " + filenumber);
				reader.close();
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void preprocess(InputStream reader, OutputStream writer, boolean srcfile) throws IOException {
		// TODO Auto-generated method stub
		InputPreprocessor inputPreprocessor = new InputPreprocessor(reader);
		
		int read;
		while ((read = inputPreprocessor.read(srcfile)) > 0)
		{
			writer.write(read);
		}
		
	}
	
	
	/*
	private static void preprocess(BufferedReader reader, BufferedWriter writer) throws IOException{
		String line = "";
		int lastIndex = -1;
		
		while ((line = reader.readLine()) != null) {
			// writer the content to the file
			if (line.length() >= RECORD_LENGTH)
				lastIndex = RECORD_LENGTH;
			else
				lastIndex = line.length();
			
			if (line.charAt(INDICATOR_AREA) == COMMENT_SIGN1 ||  line.charAt(INDICATOR_AREA) == COMMENT_SIGN2)
				writer.write(DISAMBIGUATED_COMMENT_SIGN 
						+ line.substring(INDICATOR_AREA+1, lastIndex) + "\n");
			else if (line.charAt(INDICATOR_AREA) == CONTINUATION_SIGN )
				writer.write(' ' + line.substring(INDICATOR_AREA+1, lastIndex) + "\n");
			else if (line.charAt(INDICATOR_AREA) == DEBUGGING_SIGN)
				writer.write(DISAMBIGUATED_COMMENT_SIGN 
						+ line.substring(INDICATOR_AREA+1, lastIndex) + "\n");
			else
				writer.write(line.substring(INDICATOR_AREA, lastIndex) + "\n" );
		}
		
		
	}
	*/

}
