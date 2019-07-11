package org.servicifi.gelato.transformation.core.resource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.jcl.containers.JCLRoot;
import org.servicifi.gelato.language.jcl.containers.JobUnit;
import org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem;
import org.servicifi.gelato.language.jcl.resource.jcl.IJclTextDiagnostic;
import org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType;
import org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource;
import org.servicifi.gelato.language.jcl.statements.ExecuteProgram;
import org.servicifi.gelato.transformation.core.util.JclUtil;

public class JclSourceFileLoader {
	private String filename;
	private JclResource jclRes;

	public JclSourceFileLoader(String filename) {

		this.filename = filename;
		this.jclRes = null;
	}

	public JclResource getResource() throws IOException {

		if (jclRes != null)
			return jclRes;

		JclUtil.initialize();

		File file = new File(filename);
		URI uri = URI.createFileURI(file.getAbsolutePath());

		jclRes = (JclResource) parseResource(file, uri);

		return jclRes;
	}

	public List<String> extractProgramCalls() throws IOException {

		List<String> res = new ArrayList<String>();
		jclRes = getResource();

		JCLRoot root = (JCLRoot) jclRes.getContents().get(0);

		if (root instanceof JobUnit) {

			JobUnit unit = (JobUnit) root;

			Iterator<ExecuteProgram> executesIterator = unit.getExecutes().iterator();

			while (executesIterator.hasNext()) {
				ExecuteProgram execute = executesIterator.next();

				res.add(execute.getProgramName());
			}
		}

		return res;

	}

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
				IJclTextDiagnostic diagnostic = (IJclTextDiagnostic) error;

				IJclProblem problem = diagnostic.getProblem();

				if (!problem.getType().equals(JclEProblemType.UNRESOLVED_REFERENCE))
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
