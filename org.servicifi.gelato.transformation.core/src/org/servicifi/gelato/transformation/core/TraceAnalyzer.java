package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.internal.qvt.oml.trace.TracePackage;
import org.servicifi.gelato.transformation.core.statistics.StatisticsCollector;
import org.servicifi.gelato.transformation.core.transformation.QVTORegisteringUtil;
import org.servicifi.gelato.transformation.core.transformation.TraceExtractor;
import org.servicifi.gelato.transformation.core.util.FileFinder;
@SuppressWarnings("restriction")
public class TraceAnalyzer {

	public static void main(String[] args) {

//		TraceExtractor.init();
		
		String traceFolder = "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\output_qvto\\";

		String[] projects = new String[] {
				"art"
			};
		TracePackage.eINSTANCE.getTrace();
		

			for (String projectName : projects) {
				ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
				new QVTORegisteringUtil().registerQVTResourceFactory(resourceSetImpl);
				
				
				File folder = new File(traceFolder + projectName);
				List<File> traces = new FileFinder().findAllFilesInFolder(folder, new String[] {".qvtotrace"}, new String[0]);
				System.out.println("Found " + traces.size() + " traces in " + folder.getName());
				StatisticsCollector statisticUtil = new StatisticsCollector();
//				System.out.println("statisticUtil loaded");
				for (File traceFile : traces) {
					System.out.println(traceFile.getAbsolutePath());
					Resource resource = resourceSetImpl.getResource(URI.createFileURI(traceFile.getAbsolutePath()), true);

					EList<EObject> contents = resource.getContents();
					
					System.out.println("content size: " + contents.size());
					if (contents.size() == 0) {
						continue;
					}
					EObject root = contents.get(0);
					if (root instanceof Trace) {
						Trace trace = (Trace) root;
						TraceExtractor traceExecutor = new TraceExtractor();
								
						//traceExecutor.extractOperationCalls(trace, statisticUtil);
						traceExecutor.extractDynamicCalls(trace, statisticUtil);
					}
				}
				
				
				Map<String, Integer> operationCalls = statisticUtil.getOperationCalls();
				System.out.println(projectName + " & " + 
						operationCalls.get("transformCU2ProcedureCall"));
//						+ " & " + operationCalls.get("countForLoops"));
			}
	}
	
	
	public Map<EObject, List<EObject>> getKernelStatements4CobolCall(String projectName){
		
		String traceFolder = "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\output_qvto\\";

		String[] projects = new String[] {
				"art"
			};
		TracePackage.eINSTANCE.getTrace();

		
		Map<EObject, List<EObject>> Call2Kernel = new HashMap<EObject, List<EObject>>();
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		new QVTORegisteringUtil().registerQVTResourceFactory(resourceSetImpl);
				
				
		File folder = new File(traceFolder + projectName);
		List<File> traces = new FileFinder().findAllFilesInFolder(folder, new String[] {".qvtotrace"}, new String[0]);
		System.out.println("Found " + traces.size() + " traces in " + folder.getName());
		StatisticsCollector statisticUtil = new StatisticsCollector();
//				System.out.println("statisticUtil loaded");
		for (File traceFile : traces) {
			System.out.println(traceFile.getAbsolutePath());
			Resource resource = resourceSetImpl.getResource(URI.createFileURI(traceFile.getAbsolutePath()), true);

			EList<EObject> contents = resource.getContents();
					
			System.out.println("content size: " + contents.size());
			if (contents.size() == 0) {
				continue;
			}
			EObject root = contents.get(0);
			if (root instanceof Trace) {
				Trace trace = (Trace) root;
				TraceExtractor traceExecutor = new TraceExtractor();
								
						//traceExecutor.extractOperationCalls(trace, statisticUtil);
				traceExecutor.extractDynamicCalls(trace, statisticUtil);
				}
			}
				
		
			return statisticUtil.getAllKernelStatements4CobolCall();
//			Map<String, Integer> operationCalls = statisticUtil.getOperationCalls();
//			System.out.println(projectName + " & " + 
//				operationCalls.get("transformCU2ProcedureCall"));
////						+ " & " + operationCalls.get("countForLoops"));
			
		
		
	}
	
}
