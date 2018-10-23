package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.cobol.preprocess.CobolPreprocessClasspath;
import org.servicifi.gelato.language.cobol.preprocess.literals.PseudoLiteral;
import org.servicifi.gelato.language.cobol.preprocess.operands.Operand;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTextResource;
import org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.grammar.PreprocessFormattingElement;
import org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence;
import org.servicifi.gelato.language.cobol.preprocess.sentences.Replacing;

public class CobolSourceFilePrinter extends PreprocessPrinter2 {

	public CobolSourceFilePrinter(OutputStream outputStream, IPreprocessTextResource resource) {
		super(outputStream, resource);
	}

	protected ResourceSet getResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		return rs;
	}

	protected Resource loadResource(URI uri) throws IOException {

		ResourceSet rs = getResourceSet();
		Resource resource = rs.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
		List<Diagnostic> errors = resource.getErrors();

		for (Diagnostic error : errors)
			System.out.println(error);

		return resource;
	}

	@Override
	protected void doPrint(EObject element, List<PreprocessFormattingElement> foundFormattingElements) {

		try {
			if (element instanceof CopySentence) {
				// do something;
				CopySentence cpysen = (CopySentence) element;

				String startCopy = "\n# Start: " + cpysen.toString() + "\n";

				String endCopy = "\n# End: " + cpysen.toString() + "\n";

				// resolve the copybook

				CobolPreprocessClasspath cobolPreprocessClasspath = CobolPreprocessClasspath.get();

				System.out.println("CPY Name: " + cpysen.getName());

				createDataDependency(element.eResource().getURI(),
						cobolPreprocessClasspath.getCobolCopybook(cpysen.getName()));

				// URI uri =
				// cobolPreprocessClasspath.getCobolCopybook(cpysen.getName());
				String cpycontents = "";
				try {
					BufferedReader br = new BufferedReader(new FileReader(
							"C:\\Users\\Administrator\\Desktop\\QVT\\workspace\\org.servicifi.gelato.language.cobol.preprocessor\\preprocessed2\\copybook\\"
									+ cpysen.getName() + ".cpy"));

					cobolPreprocessClasspath.addUsedCopybook(cpysen.getName());

					String sCurrentLine;

					while ((sCurrentLine = br.readLine()) != null) {
						cpycontents += sCurrentLine + "\n";
					}
				} catch (IOException e) {

					cobolPreprocessClasspath.addMissingCopybook(cpysen.getName());
					e.printStackTrace();
				}

				EList<Replacing> replacings = cpysen.getReplacings();

				// TODO Needs to change
				String text = processCopybook(cpycontents, replacings);

				text = startCopy + text;
				// + endCopy ;

				System.out.println(text);

				PreprocessResource cpyRes = (PreprocessResource) loadExpandedCopybook(text);

				// System.out.println(cpyRes.getContentsInternal());

				element = cpyRes.getContents().get(0);

				TreeIterator<EObject> objects = element.eAllContents();

				while (objects.hasNext()) {
					EObject object = objects.next();

					System.out.println("object is: " + object);
				}
			}

			super.doPrint(element, foundFormattingElements);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Resource loadExpandedCopybook(String text) {
		ResourceSet rs = getResourceSet();
		URI uri = URI.createURI("temp.cpy");
		Resource resource = rs.createResource(uri);
		if (resource == null) {
			return null;
		}
		ByteArrayInputStream inputStream = new ByteArrayInputStream(text.getBytes());
		try {
			resource.load(inputStream, null);
			List<Diagnostic> errors = resource.getErrors();
			for (Diagnostic error : errors)
				System.out.println(error);
		} catch (java.io.IOException ioe) {
			return null;
		}
		return resource;
	}

	private void createDataDependency(URI containerUri, URI cpUri) {

		// DataDependency cobolDataDependency = DataDependency.get();
		//
		// cobolDataDependency.addDataDependency(containerUri, cpUri);
	}

	private String processCopybook(String cpytext, EList<Replacing> replacings) throws IOException {

		for (Replacing replacing : replacings) {

			Operand srcop = replacing.getSource();

			Operand tgtop = replacing.getTarget();

			String source, target;

			if (srcop instanceof PseudoLiteral)
				source = ((PseudoLiteral) srcop).getValue();
			else
				source = srcop.toString();

			if (tgtop instanceof PseudoLiteral)
				target = ((PseudoLiteral) tgtop).getValue();
			else
				target = tgtop.toString();

			// need to re-implement this

			System.out.println("Replacing " + source + " by " + target);

			cpytext = cpytext.replace(source, target);

		}

		return cpytext;

	}

}
