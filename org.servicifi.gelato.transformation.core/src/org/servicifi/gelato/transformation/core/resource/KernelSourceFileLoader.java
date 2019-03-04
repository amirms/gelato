package org.servicifi.gelato.transformation.core.resource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.RandomPathGenerator;
import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.SDGFactory;
import org.servicifi.gelato.analysis.framework.sdg.util.GraphExporter;
import org.servicifi.gelato.language.kernel.KernelPackage;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.KernelRoot;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.resource.kernel.IKernelProblem;
import org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextDiagnostic;
import org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.transformation.core.util.KernelUtil;

public class KernelSourceFileLoader {

	private String filename;
	private KernelResource kernelRes;

	public KernelSourceFileLoader(String filename) {

		this.filename = filename;
		this.kernelRes = null;
	}

	private CompilationUnit populateArg2Params(CompilationUnit cu) {
		// TODO Auto-generated method stub

		EList<ProcedureCall> calls = new BasicEList<>();
		EList<Procedure> procedures = new BasicEList<>();

		TreeIterator<EObject> objs = cu.eAllContents();

		while (objs.hasNext()) {
			EObject obj = objs.next();
			if (obj instanceof ProcedureCall)
				calls.add((ProcedureCall) obj);

			if (obj instanceof Procedure)
				procedures.add((Procedure) obj);

		}

		for (ProcedureCall call : calls) {
			Procedure callee = (Procedure) call.getTarget();

			for (int i = 0; i < call.getArguments().size(); i++) {

				Argument arg = call.getArguments().get(i);
				Parameter param = callee.getParameters().get(i);

				Map<ProcedureCall, Argument> p2a = param.getCorrespondingArgument();

				if (p2a == null)
					p2a = new HashMap<ProcedureCall, Argument>();

				// System.out.println(param.getCorrespondingArgument().size());
				p2a.put(call, arg);

				param.setCorrespondingArgument(p2a);

				System.out.println(param.getCorrespondingArgument().size());

			}

		}

		return cu;

	}

	public KernelResource getResource() throws IOException {

		if (kernelRes != null)
			return kernelRes;

		KernelUtil.initialize();

		File file = new File(filename);
		URI uri = URI.createFileURI(file.getAbsolutePath());

		kernelRes = (KernelResource) parseResource(file, uri);

		return kernelRes;

	}

	public Map<Long, ExitEntryPair> parse() throws IOException {

		Map<Long, ExitEntryPair> res = new HashMap<Long, ExitEntryPair>();

		kernelRes = getResource();

		KernelRoot root = (KernelRoot) kernelRes.getContents().get(0);

		if (root instanceof CompilationUnit) {
			CompilationUnit program = (CompilationUnit) root;

			populateArg2Params(program);

			EList<Flow> cfg = program.internalFlow();

//	    	System.out.println(cfg);

			for (Flow f : cfg) {
				if ((f.getTo() == null) || (f.getFrom() == null))
					System.out.println(f);

			}

			ReachingDefinitionsAnalysisConfiguration configuration = AnalysesFactory.eINSTANCE
					.createReachingDefinitionsAnalysisConfiguration();
			IntraproceduralAnalysis analysis = AnalysesFactory.eINSTANCE.createIntraproceduralAnalysis(cfg,
					configuration);
			res.putAll(analysis.performAnalysis());
			
			SDG sdg = SDGFactory.createSDG(program, res);
			GraphExporter.exportAsDot(sdg, "/Users/asa/Desktop", "sdg");

//			Map<Variable, EList<Long>> assignments = configuration.getAssignments();
//
//			for (Variable var : assignments.keySet()) {
//				System.out.println("variable: " + var + ", " + assignments.get(var));
//			}
			
			Map<Node, List<Node>> paths = RandomPathGenerator.generate(sdg, 0.2);
			
			for(List<Node> path : paths.values()) {
				for (Node node : path) {
					System.out.print(node.toString() + "->");
				}
				System.out.println();
			}
		}

		return res;

//	    root.

	}

//	public static void main(String[] args) {
//		KernelSourceFileLoader loader = new KernelSourceFileLoader();
//		try {
//			loader.parse();
//		}
//		catch(IOException e) {
//			
//		}
//	}

	private Resource parseResource(File file, URI uri) throws IOException {
		// TODO Auto-generated method stub
		Resource resource = loadResource(uri);

		if (resource == null)
			return null;

		return resource;
	}

	protected Resource loadResource(URI uri) throws IOException {

		boolean errorfound = false;
		boolean firsterror = true;
		ResourceSet rs = getResourceSet();
		Resource resource = rs.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
		List<Diagnostic> errors = resource.getErrors();
		for (Diagnostic error : errors) {
			if (error instanceof Diagnostic) {
				IKernelTextDiagnostic diagnostic = (IKernelTextDiagnostic) error;

				IKernelProblem problem = diagnostic.getProblem();

				if (!problem.getType().equals(KernelEProblemType.UNRESOLVED_REFERENCE))
					System.out.println("Found error in " + uri.toString() + ": " + error);
			}
		}

		if (errorfound)
			return null;

		return resource;
	}

	protected ResourceSet getResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		return rs;
	}

}
