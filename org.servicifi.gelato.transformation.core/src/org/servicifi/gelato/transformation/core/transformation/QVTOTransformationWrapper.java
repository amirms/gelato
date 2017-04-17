package org.servicifi.gelato.transformation.core.transformation;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.servicifi.gelato.language.cobol.containers.CobolRoot;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.containers.ContainersPackage;
import org.servicifi.gelato.language.cobol.containers.impl.CompilationGroupImpl;
import org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource;
import org.servicifi.gelato.language.cobol.resource.cobol.util.CobolResourceUtil;
import org.servicifi.gelato.transformation.core.statistics.AbstractStatisticsCollector;
import org.servicifi.gelato.transformation.core.util.MetamodelUtil;

@SuppressWarnings("restriction")
public class QVTOTransformationWrapper extends AbstractTransformationWrapper {
	
	private URI inputURI;
	private URI outputURI;
	private URI transformationFileURI;
	private boolean debug = false;
	private boolean isInPlace = false;
	
	public QVTOTransformationWrapper(
			URI inputURI, 
			URI outputURI, 
			URI transformationFileUri, 
			boolean isInPlace, 
			boolean debug,
			AbstractStatisticsCollector statisticUtil) {
		
		super(statisticUtil);
		
		this.inputURI = inputURI;
		this.outputURI = outputURI;
		this.transformationFileURI = transformationFileUri;
		this.isInPlace = isInPlace;
		this.debug = debug;
	}

	protected void registerResourceFactories() {
		super.registerResourceFactories();
		new QVTORegisteringUtil().registerQVTResourceFactory(getResourceSet());
	}

//	private void setStartTime() {
//		getStatisticsCollector().setStartTime(System.currentTimeMillis());
//	}
//	
//	private void setEndTime() {
//		getStatisticsCollector().setEndTime(System.currentTimeMillis());
//	}
	
	private void writeStatistics() {
		getStatisticsCollector().writeStatistic();
	}
	
	/**
	 * Executes the QVT transformation using the given file as input model.
	 */
	@Override
	public void launch(File file) throws Exception {
		init();
		URI inFileURI = URI.createFileURI(file.getAbsoluteFile().getCanonicalPath());
		URI outFileURI = MetamodelUtil.getTargetFileURI(
					inputURI, file, outputURI, super.getResourceSet());
		
		// setup the execution environment details -> 
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
//		context.setConfigProperty("keepModeling", true);
		
		// set logger
		if (debug) {
			PrintWriter printWriter = new PrintWriter(System.out);
			printWriter.flush();
			context.setLog(new WriterLog(printWriter));
		}
		
		// run the transformation assigned to the executor with the given 
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		
		List<URI> models = new ArrayList<URI>();
		models.add(inFileURI);
		if (!isInPlace) {
			models.add(outFileURI);
		}
		
		ResourceSetImpl resourceSet = getResourceSet();
		EcoreUtil.resolveAll(resourceSet);
		Resource inputResource = resourceSet.getResource(inFileURI, true);
		Collection<EObject> unresolvedProxies = CobolResourceUtil.findUnresolvedProxies(inputResource);
		for (EObject unresolvedProxy : unresolvedProxies) {
			System.err.println("found unresolvedProxy in " + inFileURI.lastSegment() + ": " + unresolvedProxy);
		}
		// new Executor
		
		
		QVTOTransformationRunner executor = 
			new QVTOTransformationRunner(transformationFileURI, super.getRegistry(), models, debug, resourceSet);
		
		
		if (debug) {
			URI traceFileURI =  outFileURI;
			traceFileURI = outFileURI.trimFileExtension().appendFileExtension("qvtotrace");
			executor.setTraceFile(traceFileURI);
		}
		
		System.out.println("Transforming file: " + file);
		getStatisticsCollector().setStartTime(System.currentTimeMillis(), 1);
		getStatisticsCollector().setStartMemory(Runtime.getRuntime().freeMemory(), 1); //changed from totalmemory
		// do transformation
		Diagnostic result = executor.execute(context);
		getStatisticsCollector().setEndTime(System.currentTimeMillis(), 1);
		getStatisticsCollector().setEndMemory(Runtime.getRuntime().freeMemory(), 1);


		if (debug) {
			System.out.println("result = " + result);
			System.out.println("outFileURI = " + outFileURI);
		}
		
		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
	
			Trace trace = executor.getTrace();
			// get statistics from trace file
			addStatistics(trace);
			
		} else {
			// turn the result diagnostic into status and send it to error log			
			IStatus status = BasicDiagnostic.toIStatus(result);
			//Activator.getDefault().getLog().log(status);
			if (!status.isOK()) {
				System.err.println(status);
				throw new RuntimeException("Error while running transformation");
			}
		}
	}

	@Override
	public void addStatistics(Object object) {
		if (object == null) {
			return;
		}
		Trace trace = null;
		if (object instanceof Trace) {
			trace = (Trace) object;
		}
		new TraceExtractor().extractOperationCalls(trace, getStatisticsCollector());
	}

	//TODO no need for two launches, one suffices.
	@Override
	public void launch(List<File> inputFiles) throws Exception{
		init();
		
		List<URI> inFileURIs = new ArrayList<URI>();
		
		for (File file : inputFiles)
			inFileURIs.add(URI.createFileURI(file.getAbsoluteFile().getCanonicalPath()));
		
		
		//Resource metaResource = \
		//metaResourceSet.createResource(URI.createURI("./bookStore.ecore"));
		//FIXME just create a URI resource with no physical file
//		File inMergedFile = new File("C:\\Users\\AmirM\\Documents\\workspace\\eclipse\\org.servicifi.gelato.transformation.core\\input\\x.cobol");
//		URI inMergedFileURI = URI.createFileURI(inMergedFile.getAbsoluteFile().getCanonicalPath());

		
		ResourceSetImpl resourceSet = getResourceSet();
		EcoreUtil.resolveAll(resourceSet);
		
		EList<CompilationUnit> cus = new BasicEList<CompilationUnit>();

		getStatisticsCollector().setStartMemory(Runtime.getRuntime().freeMemory(), 0);
		getStatisticsCollector().setStartTime(System.currentTimeMillis(), 0);

		//TODO Make this generic
		for (URI inFileURI : inFileURIs) {
			Resource inputResource = resourceSet.getResource(inFileURI, true);
			
			if (inputResource instanceof CobolResource){
				
				Collection<EObject> unresolvedProxies = CobolResourceUtil.findUnresolvedProxies(inputResource);
//				for (EObject unresolvedProxy : unresolvedProxies) {
//					System.err.println("found unresolvedProxy in " + inFileURI.lastSegment() + ": " + unresolvedProxy);
//				}
				
				//Merge
				CobolResource cobRes = (CobolResource) inputResource;
			    
				//check if the cobol root is an instanceof compilation group
				CompilationGroup cg = (CompilationGroup) cobRes.getContents().get(0);
				cus.addAll(cg.getCompilationUnits());

			}
			
		}
		getStatisticsCollector().setEndTime(System.currentTimeMillis(), 0);
		getStatisticsCollector().setEndMemory(Runtime.getRuntime().freeMemory(), 0);

		
		System.out.println("the number of compilation units");
		System.out.println(cus.size());
		
		//TODO Add the compilation units into one big compilation group
		Resource inputResource = resourceSet.getResource(inFileURIs.get(0), true);
		
		CobolResource mergedCobRes = (CobolResource) inputResource;
		CompilationGroupImpl root = (CompilationGroupImpl) mergedCobRes.getContents().get(0);
		
		
		root.eSet(ContainersPackage.COMPILATION_GROUP__COMPILATION_UNITS, cus);
		
		System.out.println("the number of compilation units");
		
		System.out.println(root.getCompilationUnits().size());
		
		URI outFileURI = MetamodelUtil.getTargetFileURI(
					inputURI, inputFiles.get(0), outputURI, super.getResourceSet());
		
		// setup the execution environment details -> 
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
//		context.setConfigProperty("keepModeling", true);
		
		// set logger
		if (debug) {
			PrintWriter printWriter = new PrintWriter(System.out);
			printWriter.flush();
			context.setLog(new WriterLog(printWriter));
		}
		
		// run the transformation assigned to the executor with the given 
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		
		List<URI> models = new ArrayList<URI>();
		models.add(inFileURIs.get(0));
		if (!isInPlace) {
			models.add(outFileURI);
		}
		

		// new Executor
		
		
		QVTOTransformationRunner executor = 
			new QVTOTransformationRunner(transformationFileURI, super.getRegistry(), models, debug, resourceSet);
		
		
		if (debug) {
			URI traceFileURI =  outFileURI;
			traceFileURI = outFileURI.trimFileExtension().appendFileExtension("qvtotrace");
			executor.setTraceFile(traceFileURI);
		}
		
//		System.out.println("Transforming file: " + inMergedFile);
		getStatisticsCollector().setStartTime(System.currentTimeMillis(), 1);
		getStatisticsCollector().setStartMemory(Runtime.getRuntime().freeMemory(), 1);
		// do transformation
		Diagnostic result = executor.execute(context);
		getStatisticsCollector().setEndTime(System.currentTimeMillis(), 1);
		getStatisticsCollector().setEndMemory(Runtime.getRuntime().freeMemory(), 1);
		if (debug) {
			System.out.println("result = " + result);
			System.out.println("outFileURI = " + outFileURI);
		}
		
		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
	
			Trace trace = executor.getTrace();
			// get statistics from trace file
			addStatistics(trace);
			
		} else {
			// turn the result diagnostic into status and send it to error log			
			IStatus status = BasicDiagnostic.toIStatus(result);
			//Activator.getDefault().getLog().log(status);
			if (!status.isOK()) {
				System.err.println(status);
				throw new RuntimeException("Error while running transformation");
			}
		}
		
	}
}