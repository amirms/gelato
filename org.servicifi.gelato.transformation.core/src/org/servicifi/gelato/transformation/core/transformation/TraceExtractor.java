package org.servicifi.gelato.transformation.core.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.internal.qvt.oml.trace.EMappingOperation;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.internal.qvt.oml.trace.TraceRecord;
import org.eclipse.m2m.internal.qvt.oml.trace.VarParameterValue;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource;
import org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResourceFactory;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.transformation.core.statistics.AbstractStatisticsCollector;
import org.servicifi.gelato.transformation.core.util.FileFinder;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl;
import org.servicifi.language.cobol.resource.PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl;

@SuppressWarnings("restriction")
public class TraceExtractor{


	public void extractOperationCalls(Trace trace, AbstractStatisticsCollector statisticUtil) {
		System.out.println("Number of trace records: " + trace.getTraceRecords().size());
		
		for (TraceRecord entryData : trace.getTraceRecords()) {
			EMappingOperation mappingOperation = entryData.getMappingOperation();
			String mappingOperationName = mappingOperation.getName();
			
			statisticUtil.registerOperationCall(mappingOperationName);
		}
	}
	
	
	public static void init() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("kernel", new KernelResourceFactory());
		
		map.put("cob", 
				new PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl());
		
		map.put("cobol", 
				new PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl());
		
	}
	
	
	
//	public Resource createKernelResource(List<File> inputFiles) throws IOException{
//		
//List<URI> inFileURIs = new ArrayList<URI>();
//		
//
//		for (File file : inputFiles)
//			inFileURIs.add(URI.createFileURI(file.getAbsoluteFile().getCanonicalPath()));
//		
//		
//		//Resource metaResource = \
//		//metaResourceSet.createResource(URI.createURI("./bookStore.ecore"));
//		//FIXME just create a URI resource with no physical file
////		File inMergedFile = new File("C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input\\x.cobol");
////		URI inMergedFileURI = URI.createFileURI(inMergedFile.getAbsoluteFile().getCanonicalPath());
//
//		
//		ResourceSetImpl resourceSet = new ResourceSetImpl();
//		EcoreUtil.resolveAll(resourceSet);
//		
//		EList<CompilationUnit> cus = new BasicEList<CompilationUnit>();
//
//		Resource inputResource;
//		
//		//TODO Make this generic
//		for (URI inFileURI : inFileURIs) {
//			inputResource = resourceSet.getResource(inFileURI, true);
//			
//			if (inputResource instanceof CobolResource){
//				
//				Collection<EObject> unresolvedProxies = CobolResourceUtil.findUnresolvedProxies(inputResource);
////				for (EObject unresolvedProxy : unresolvedProxies) {
////					System.err.println("found unresolvedProxy in " + inFileURI.lastSegment() + ": " + unresolvedProxy);
////				}
//				
//				//Merge
//				CobolResource cobRes = (CobolResource) inputResource;
//			    
//				//check if the cobol root is an instanceof compilation group
//				CompilationGroup cg = (CompilationGroup) cobRes.getContents().get(0);
//				cus.addAll(cg.getCompilationUnits());
//
//			}
//			
//		}
//		
//		return inputResource;
//		
//	}
	
	public Resource createKernelResource(){
		
		ResourceSet resSet = new ResourceSetImpl();
		
//		resSet.getResource(modelElement, true);
		
		String transformedFile = "C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\output_qvto\\" 
		+ "art" + "\\"
		+"RT00000_transformed.kernel";
		
		Resource res = resSet.getResource(URI.createFileURI(transformedFile), true);
		
		return res;
		
	}
	
	
	public void extractDynamicCalls(Trace trace, AbstractStatisticsCollector statisticUtil) {
		System.out.println("Number of trace records: " + trace.getTraceRecords().size());
		
		
		for (TraceRecord entryData : trace.getTraceRecords()) {
			if (entryData.getContext().getContext().getType().equals("Call")){
				EObject callStatement = entryData.getContext().getContext().getValue().getModelElement();
				
				System.out.println(entryData.getContext().getContext().getType());
				
				Iterator<VarParameterValue> resIterator = entryData.getResult().getResult().iterator();
			
				List<EObject> kernelStatements = new BasicEList<EObject>();
				while(resIterator.hasNext())	{
					VarParameterValue value = resIterator.next();
					
					kernelStatements.add(value.getValue().getModelElement());
					
				}
				
				System.out.println("Registering call statement: " + callStatement + " with Kernel statements: " + kernelStatements);
				statisticUtil.registerCobolCall(callStatement, kernelStatements);
					
			}
		
			
//			EObject modelElement = entryData.getResult().getResult().get(0).getValue().getModelElement();
//			if (modelElement != null){
//
//				String uri = EcoreUtil.getURI(modelElement).fragment();
//				
//				uri = "//@declarations." + uri.substring(1);
//				System.out.println("uri fragment: " + uri);
//				
//				EObject resolved = res.getEObject(uri);
//				System.out.println("resolved: " + resolved);
//				
//				if ((resolved != null))
//			}
			
		}
	}
	
}