package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.NodeFactory;
import org.servicifi.gelato.analysis.framework.sdg.RandomPathGenerator;
import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.SDGFactory;
import org.servicifi.gelato.analysis.framework.sdg.slicer.SDGSlicer;
import org.servicifi.gelato.analysis.framework.sdg.util.GraphExporter;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileLoader;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileSaver;

public class Slicer {
	public static void main(final String[] args) throws Exception {
		File currentDirFile = new File("input/linechars.kernel");
		String filename = currentDirFile.getAbsolutePath();

		KernelSourceFileLoader loader = new KernelSourceFileLoader(filename);

		try {
			CompilationUnit program = loader.parse();

			SDG sdg = SDGFactory.createSDG(program);

			String x = sdg.vertexSet().stream().map(v -> v.getLabel()).collect(Collectors.joining(" and "));

			System.out.println(x);

			// TODO rewrite/check
			final Node v = sdg.vertexSet().stream().filter(u -> u.getLabel().equals("9.0")).findFirst().get();

//			    final Set<Node> S =
//			        sdg.outgoingEdgesOf(v).stream().map(e -> e.getTarget()).collect(Collectors.toSet());
//			    S.add(v);

			Set<Node> S = new HashSet<>();
			S.add(v);

			S.forEach(vertex -> System.out.println("slicing criterion vertex: " + vertex));

			final Set<Node> slice = SDGSlicer.backward(sdg, S);
			for (final Node w : slice) {
				w.setFillColor("yellow");
			}
			sdg.exportAsDot("./output", "graph");

			writeKernel(slice, program, "output/linechars-" + v + ".kernel");

			System.out.println(slice);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void writeKernel(Set<Node> slice, CompilationUnit program, String filename) {
		residualizeObject(program, slice);

		new KernelSourceFileSaver().save(filename, program);
	}

	private static void residualizeObject(EObject container, Set<Node> slice) {
		EList<EObject> contents = container.eContents();

		for (int i = contents.size()-1; i >= 0; i--) {
			System.out.println("contents.size(): " + contents.size());
			
			EObject object = contents.get(i);
			if (object instanceof LabellableElement) {
				LabellableElement le = (LabellableElement) object;

				// if slice does not contain the labellableElement, remove the element
				if (!slice.stream().anyMatch(s -> s.getLabellableElement().equals(le))) {
//					Collection found = EcoreUtil.UsageCrossReferencer.find(object, preRefactoring.eResource());
					System.out.println("removing non-slice object: " + le);
					EcoreUtil.remove(object);
				}
			} else if (object instanceof Parameter) {
				// reconstruct the label, if a parameter and check
				Parameter parameter = (Parameter) object;
				String label = NodeFactory.getParameterLabel(parameter);

				if (!slice.stream().anyMatch(s -> s.getLabel().equals(label))) {
//					Collection found = EcoreUtil.UsageCrossReferencer.find(object, preRefactoring.eResource());
					System.out.println("removing non-slice parameter: " + parameter);
					EcoreUtil.remove(object);
				}

			} else if (object instanceof Argument) {
				// reconstruct the label, if an argument and check
				Argument argument = (Argument) object;
				String label = NodeFactory.getArgumentLabel(argument);

				if (!slice.stream().anyMatch(s -> s.getLabel().equals(label))) {
//					Collection found = EcoreUtil.UsageCrossReferencer.find(object, preRefactoring.eResource());
					System.out.println("removing non-slice argument: " + argument);
					EcoreUtil.remove(object);
				}
			}
		}

		contents = container.eContents();
		contents.forEach(obj -> residualizeObject(obj, slice));
	}
}
