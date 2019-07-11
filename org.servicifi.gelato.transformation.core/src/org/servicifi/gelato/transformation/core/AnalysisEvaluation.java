package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.RandomPathGenerator;
import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.SDGFactory;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileLoader;
import org.servicifi.gelato.transformation.core.statistics.StatisticsCollector;

public class AnalysisEvaluation {

	private static StatisticsCollector collector = new StatisticsCollector();

	private void evaluate(String projectName, String filename) {
		KernelSourceFileLoader loader = new KernelSourceFileLoader(filename);

		try {
			collector.setStartTime(System.currentTimeMillis(), 2);
			collector.setStartMemory(Runtime.getRuntime().freeMemory(), 2);
			CompilationUnit program = loader.parse();

			SDG sdg = SDGFactory.createSDG(program);
			sdg.exportAsDot("./output", "sdg");


			Map<Node, List<Node>> paths = RandomPathGenerator.generateRandomly(sdg, 0.4);

			for (List<Node> path : paths.values()) {
				for (Node node : path) {
					System.out.print(node.toDefUse() + "->");
				}
				System.out.println();
			}
			
			collector.setEndTime(System.currentTimeMillis(), 2);
			collector.setEndMemory(Runtime.getRuntime().freeMemory(), 2);
//			System.out.println(results);
			
//			Map<EObject, List<EObject>> call2kernels = new TraceAnalyzer().getKernelStatements4CobolCall(projectName);
//			Iterator<EObject> callIterator = call2kernels.keySet().iterator();
//
//			ResourceSetImpl rs = new ResourceSetImpl();
//
//			while (callIterator.hasNext()) {
//
//				EObject callKey = callIterator.next();
//
//				List<EObject> statements = call2kernels.get(callKey);
//
//				EObject resolved = EcoreUtil.resolve(statements.get(0), rs);
//				if (resolved instanceof ExpressionStatement) {
//					ExpressionStatement expressionsStatement = (ExpressionStatement) resolved;
//					System.out.println(results.get(expressionsStatement.getExpression().getLabel()));
//				}
//			}

			collector.printTime();
			collector.printMemory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File currentDirFile = new File("input/program.kernel");
		String filename = currentDirFile.getAbsolutePath();

		new AnalysisEvaluation().evaluate("XX", filename);
	}
}