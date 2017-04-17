package org.servicifi.gelato.transformation.core.transformation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.internal.qvt.oml.InternalTransformationExecutor;
import org.eclipse.m2m.internal.qvt.oml.Messages;
import org.eclipse.m2m.internal.qvt.oml.ModelExtentHelper;
import org.eclipse.m2m.internal.qvt.oml.NLS;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.TransformationRunner;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.servicifi.gelato.transformation.core.util.QVTOModelExtentHelper;

@SuppressWarnings("restriction")
public class QVTOTransformationRunner extends TransformationRunner {

	protected static class Executor extends InternalTransformationExecutor {
		
		Trace fTraces;
		
		public Executor(URI uri, Registry registry) {
			super(uri, registry);
		}

		public Executor(URI uri) {
			super(uri);
		}

		@Override
		protected void handleExecutionTraces(Trace traces) {				
			super.handleExecutionTraces(traces);
			fTraces = traces;
		};
	}
		
	//private final URI fTransformationURI;	
	private final Executor fExecutor;
	private final List<URI> fModelParamURIs;
	private URI fTraceFileURI;
	
	private BasicDiagnostic fDiagnostic;
	private List<ModelExtent> fModelParams;		
	private QVTOModelExtentHelper fExtentHelper;
	private EPackage.Registry fPackageRegistry;
	private ResourceSet rs;
	private boolean writeTraceFile; 
	
	public QVTOTransformationRunner(URI transformationURI, 
			Registry packageRegistry,
			List<URI> modelParamURIs,
			boolean writeTraceFile,
			ResourceSetImpl rs) {
		
		super(transformationURI, packageRegistry, modelParamURIs);

		fExecutor = new Executor(transformationURI, packageRegistry);
		fPackageRegistry = packageRegistry;
		//fTransformationURI = transformationURI;
		fModelParamURIs = modelParamURIs;
		this.rs = rs;
		createResourceSet(rs, fPackageRegistry);
		this.writeTraceFile = writeTraceFile;
	}
	
	@Override
	public Diagnostic initialize() {
		if(fDiagnostic != null) {
			return fDiagnostic;
		}
		fDiagnostic = QvtPlugin.createDiagnostic("Transformation runner initialize");

		//monitor = new NullProgressMonitor();
		Diagnostic loadDiagnostic = fExecutor.loadTransformation(new NullProgressMonitor());

		if (!QvtPlugin.isSuccess(loadDiagnostic)) {
			fDiagnostic.add(loadDiagnostic);
		}
		
		if (writeTraceFile) {
			//System.out.println("Load diagnostic: " + loadDiagnostic);
		}

		handleLoadTransformation(loadDiagnostic);

		OperationalTransformation transformation = fExecutor.getTransformation();

		if (transformation == null) {
			System.err.println("MyTransformationExecutor.initialize() transformation is null");
			return fDiagnostic;
		}

		// Note: initialized here already loaded transformation is required
		fExtentHelper = new QVTOModelExtentHelper(transformation, fModelParamURIs, rs);

		// java.lang.NoClassDefFoundError:
		Diagnostic extentsDiagnostic = null;
//		extentsDiagnostic = Diagnostic.OK_INSTANCE;

		try {

			fModelParams = fExtentHelper.loadExtents();
			
			
			
			

		} catch (DiagnosticException e) {
			extentsDiagnostic = e.getDiagnostic();
		}
		
		handleLoadExtents(extentsDiagnostic);
		if (extentsDiagnostic != null) {
			if (!QvtPlugin.isSuccess(extentsDiagnostic)) {
				System.err.println("MyTransformationExecutor.initialize() failed");
				fDiagnostic.add(extentsDiagnostic);
			}
		}
		return fDiagnostic;
	}
	
	
	
	@Override
	public Diagnostic execute(ExecutionContext context) {
		
		fExecutor.fTraces = null;
		
		Diagnostic diagnostic = initialize();
		
		if (!isSuccess(diagnostic)) {
			return diagnostic;
		}

		fExecutor.setEnvironmentFactory(getEnvFactory());
		try {
//			System.out.println("fModel Parameters");
//			System.out.println(fModelParams.size());
			
			ModelExtent[] params = fModelParams.toArray(new ModelExtent[fModelParams.size()]);
			
			ExecutionDiagnostic execDiagnostic = fExecutor.execute(context, params);
			handleExecution(execDiagnostic);
			
			Trace traces = fExecutor.fTraces;
			
			if (!isSuccess(execDiagnostic)) {
				// skip saving any output
				return execDiagnostic;
			}

			// can continue and save output
			Diagnostic saveExtentsDiagnostic = fExtentHelper.saveExtents();
			handleSaveExtents(saveExtentsDiagnostic);
			
			if (!isSuccess(saveExtentsDiagnostic)) {
				return saveExtentsDiagnostic;
			}

			if (writeTraceFile) {
				Diagnostic saveTracesDiagnostic = saveTraces(traces);
				if (!isSuccess(saveTracesDiagnostic)) {
					return saveTracesDiagnostic;
				}
			}

			return execDiagnostic;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			fExecutor.setEnvironmentFactory(null);
		}			
	}
	
	
	
	public void setTraceFile(URI traceFileURI) {
		fTraceFileURI = traceFileURI;
	}
	
	public Trace getTrace(){
		return fExecutor.fTraces;
	}
	
	private Diagnostic saveTraces(Trace trace) { 
		if(fTraceFileURI != null) {
			Resource resource = rs.createResource(fTraceFileURI);
			resource.getContents().add(trace);
			try {
		        Map<String, String> options = new HashMap<String, String>();
		        options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
				resource.save(options);
			} catch (IOException e) {
				String message = NLS.bind("Failed to save trace model uri={0}", fTraceFileURI);
				return new BasicDiagnostic(Diagnostic.ERROR, QvtPlugin.ID, 0,
						message, new Object[] { e });
			}
		}
		
		return Diagnostic.OK_INSTANCE;
	}
	
	private void createResourceSet(ResourceSetImpl rs, EPackage.Registry registry) {
		Map<URI, Resource> resourceMap = new HashMap<URI, Resource>();
		for (String key : registry.keySet()) {
			Object value = registry.get(key);
			if (value instanceof EPackage) {
				EPackage ePackage = (EPackage) value;
				Resource res = ePackage.eResource();
				if (res != null && res.getURI() != null) {
					resourceMap.put(res.getURI(), res);
				}
			}
		}
//		ResourceSetImpl rs = new ResourceSetImpl();
		rs.setURIResourceMap(resourceMap);
		/*rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());*/
		//return rs;
	}
	
	private static boolean isSuccess(Diagnostic diagnostic) {
		int severity = diagnostic.getSeverity();
		return severity != Diagnostic.ERROR && severity != Diagnostic.CANCEL;
	}
}