package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.util.List;

import org.servicifi.gelato.transformation.core.resource.JclSourceFileLoader;
import org.servicifi.gelato.transformation.core.util.FileFinder;

public class JCLAnalysis {
	public static void main(String[] args) {
		KernelTransformation eva = new KernelTransformation();
		//run(String qvtScript, String inputDir, String framework, File inputFile) 
		
		try {
			String[] projects = new String[] {
				"caro"
			};

			for (String projectName : projects) {
				File file = new File("C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input\\" + projectName);
				List<File> files = new FileFinder().findAllFilesInFolder(file, new String[] {".jcl"}, new String[0]);
				
				for (File jclFile : files){
				
				JclSourceFileLoader loader = 
						new JclSourceFileLoader(jclFile.getAbsolutePath());
			
				System.out.println(jclFile.getName() + " " + loader.extractProgramCalls());
				}
//				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
