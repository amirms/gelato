package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.kernel.analyses.ExitEntryPair;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileLoader;
import org.servicifi.gelato.transformation.core.statistics.StatisticsCollector;
import org.servicifi.gelato.transformation.core.util.FileFinder;


public class Evaluation {

	private static StatisticsCollector collector = new StatisticsCollector();
	
	public static void main(String[] args) {
		KernelTransformation eva = new KernelTransformation();
		//run(String qvtScript, String inputDir, String framework, File inputFile) 
		
		try {
			String[] projects = new String[] {
				"caro"
			};

			for (String projectName : projects) {
				File file = new File("C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input\\" + projectName);
				List<File> files = new FileFinder().findAllFilesInFolder(file, new String[] {".cob"}, new String[0]);
				System.out.println(projectName + "\t" + files.size());
				eva.run("c2k.qvto", "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input", projectName, files, collector);
				String transformedFile = "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\output_qvto\\" 
				+ projectName + "\\"
				+files.get(0).getName().substring(0, files.get(0).getName().indexOf('.'))+ "_transformed.kernel";
				
//				KernelSourceFileLoader loader = 
//						new KernelSourceFileLoader(transformedFile);
//			
//				
//				collector.setStartTime(System.currentTimeMillis(), 2);
//				collector.setStartMemory(Runtime.getRuntime().freeMemory(), 2);
//
//				Map<Long, ExitEntryPair> results = loader.parse();	
//				collector.setEndTime(System.currentTimeMillis(), 2);
//				collector.setEndMemory(Runtime.getRuntime().freeMemory(), 2);
//				System.out.println(results);
//				
//				Map<EObject, List<EObject>> call2kernels = new TraceAnalyzer().getKernelStatements4CobolCall(projectName);				
//				Iterator<EObject> callIterator = call2kernels.keySet().iterator();
//			
//				ResourceSetImpl rs = new ResourceSetImpl();
//				
//				while(callIterator.hasNext()){
//					
//					EObject callKey = callIterator.next();	
//
//					List<EObject> statements = call2kernels.get(callKey);
//					
//					EObject resolved =  EcoreUtil.resolve(statements.get(0), rs);
//					if (resolved instanceof ExpressionStatement){
//						
//						ExpressionStatement expressionsStatement = (ExpressionStatement)resolved;
//						
//						System.out.println(results.get(expressionsStatement.getExpression().getLabel()));
//						
//					}
//					
//				}
				
				collector.printTime();
				collector.printMemory();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
