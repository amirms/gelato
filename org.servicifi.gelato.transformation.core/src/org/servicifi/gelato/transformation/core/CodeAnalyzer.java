package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.util.List;

import org.servicifi.gelato.transformation.core.statistics.CodeAnalytics;
import org.servicifi.gelato.transformation.core.util.FileFinder;


public class CodeAnalyzer {

	public static void main(String[] args) {
		
		String projectName = "art";
		
		File file = new File("C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input\\" + projectName);
		List<File> files = new FileFinder().findAllFilesInFolder(file, new String[] {".cob"}, new String[0]);
		System.out.println(projectName + "\t" + files.size());
//		eva.run("c2k.qvto", "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input", projectName, files);
		String transformedFile = "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\output_qvto\\" 
		+ projectName + "\\"
		+files.get(0).getName().substring(0, files.get(0).getName().indexOf('.'))+ "_transformed.kernel";

		new CodeAnalytics(transformedFile).getDeadCode1();
		
		
	}
	
}
