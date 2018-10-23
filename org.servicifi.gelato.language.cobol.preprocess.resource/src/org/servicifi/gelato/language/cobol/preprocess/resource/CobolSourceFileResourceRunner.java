package org.servicifi.gelato.language.cobol.preprocess.resource;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.eclipse.emf.common.util.URI;

public class CobolSourceFileResourceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "C:/src/git/gelato/org.servicifi.gelato.language.cobol.preprocessor/COBOL/RT00000";

			CobolSourceFileResource result = new CobolSourceFileResource(URI.createFileURI(fileName));

			result.load(null);
			System.out.println(result.getContents().get(0));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
