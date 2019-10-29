import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.SDGFactory;
import org.servicifi.gelato.analysis.framework.sdg.paths.RandomValidPathGenerator;
import org.servicifi.gelato.analysis.framework.sdg.paths.RandomVertexSequenceGenerator;
import org.servicifi.gelato.analysis.framework.sdg.paths.VertexSequenceType;
import org.servicifi.gelato.analysis.framework.sdg.util.GraphExporter;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.KernelRoot;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.ExtraKernelOptionProvider;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.resource.kernel.ExtraKernelResourcePostProcessor;
import org.servicifi.gelato.language.kernel.resource.kernel.util.KernelResourceUtil;

public class CAnalyzer {

	private static final String OUTPUT_DIR = "./output/";

	public static void analyze(String filepath, String filename) {
		try {
			ParseTree tree = CParserRunner.parse(filepath + filename + ".c");

			Rewrite2Kernel k = new Rewrite2Kernel();
			List cus = k.visit(tree);

			MappingStore store = k.getStore();

			CompilationUnit cu = (CompilationUnit) cus.get(0);

			outputIdentifierMappingsPerContext(store, cu, OUTPUT_DIR, filename);
			outputIdentifierMappings(store, cu, OUTPUT_DIR, filename);

			KernelResource rs = new KernelResource();
			rs.getContents().add(cu);

			// perform post-processing
			new ExtraKernelResourcePostProcessor().process(rs);

			File file = new File(OUTPUT_DIR + filename + "/" + filename + ".kernel");
			KernelResourceUtil.saveResource(file, rs);

			KernelResourceUtil.resolveAll(rs);

			KernelRoot root = (KernelRoot) rs.getContents().get(0);

			if (root instanceof CompilationUnit) {
				CompilationUnit program = (CompilationUnit) root;

				// TODO
				// may be should move to postporocessor
				// populateArg2Params(program);

				SDG sdg = SDGFactory.createSDG(program);
				sdg.exportAsDot(OUTPUT_DIR + filename, filename);

				// generate both random valid walk and paths of SDG
				for (VertexSequenceType seqType : VertexSequenceType.values()) {
//					Set<List<Node>> vertexSeqs = RandomVertexSequenceGenerator.generateForUseDefNodes(sdg, 2, seqType);
					Set<List<Node>> vertexSeqs = RandomVertexSequenceGenerator.generateRandomly(sdg, 1, seqType);

					outputNodeSequences(vertexSeqs, store, OUTPUT_DIR + filename, seqType);
					outputNodes(vertexSeqs, store, OUTPUT_DIR + filename, seqType);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void outputIdentifierMappingsPerContext(MappingStore store, CompilationUnit cu, String outputDir,
			String filename) {
		try {
			new File(outputDir + filename).mkdir();

			File file = new File(outputDir + filename + "/mappings.txt");
			FileWriter fw = new FileWriter(file);

			String text = "";

			TreeIterator<EObject> iterator = cu.eAllContents();
			while (iterator.hasNext()) {
				EObject object = iterator.next();

				if (object instanceof Procedure) {
					Procedure proc = (Procedure) object;
					Map<String, String> mapping = store.getContextIdentifiers(proc.getName());

					text += "Mappings for procedure " + proc.getName() + "\n";

					for (String key : mapping.keySet()) {
						text += key + ": " + mapping.get(key) + "\n";
					}
					text += "-----------------------------" + "\n";
				}
			}

			Map<String, String> mapping = store.getContextIdentifiers("__GLOBAL__");

			if (mapping != null) {
				text += "Mappings for GLOBAL" + "\n";

				for (String key : mapping.keySet()) {
					text += key + ": " + mapping.get(key) + "\n";
				}
				text += "-----------------------------" + "\n";
			}

			System.out.println(text);
			fw.write(text);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputIdentifierMappings(MappingStore store, CompilationUnit cu, String outputDir,
			String filename) {
		try {
			new File(outputDir + filename).mkdir();

			File file = new File(outputDir + filename + "/variables.txt");
			FileWriter fw = new FileWriter(file);

			String text = "";

			TreeIterator<EObject> iterator = cu.eAllContents();
			while (iterator.hasNext()) {
				EObject object = iterator.next();

				if (object instanceof Procedure) {
					Procedure proc = (Procedure) object;
					Map<String, String> mapping = store.getContextIdentifiers(proc.getName());

					for (String key : mapping.keySet()) {
						text += mapping.get(key) + ":" + key + "\n";
					}
				}
			}

			Map<String, String> mapping = store.getContextIdentifiers("__GLOBAL__");

			if (mapping != null) {
				for (String key : mapping.keySet()) {
					text += mapping.get(key) + ": " + key + "\n";
				}
			}

			fw.write(text);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputNodeSequences(Set<List<Node>> vertexSequences, MappingStore store, String outputDir,
			VertexSequenceType seqType) {
		String type = seqType == VertexSequenceType.PATH ? "paths" : "walks";

		try {
			File sdgSeqsfile = new File(outputDir + "/" + type + ".txt");
			FileWriter sdgSeqsfw = new FileWriter(sdgSeqsfile);

			File cSeqsfile = new File(outputDir + "/original-" + type + ".txt");
			FileWriter cSeqsfw = new FileWriter(cSeqsfile);

			String sdgSeqsText = "";
			String cSeqsText = "";

			for (List<Node> sequence : vertexSequences) {
				List<String> originalPath = sequence.stream().map(node -> getNodeRule(node, store))
						.collect(Collectors.toList());

				// remove paths that have an empty original path
				if (!originalPath.stream().anyMatch(n -> !n.isEmpty())) {
					continue;
				}

				cSeqsText += originalPath.stream().collect(Collectors.joining("->")) + "\n";

				sdgSeqsText += sequence.stream().map(node -> node.toDefUse()).collect(Collectors.joining("->")) + "\n";
			}

			sdgSeqsfw.write(sdgSeqsText);
			System.out.println("SDG " + type);
			System.out.print(sdgSeqsText);

			cSeqsfw.write(cSeqsText);
			System.out.println("C " + type);
			System.out.print(cSeqsText);

			sdgSeqsfw.close();
			cSeqsfw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void outputNodes(Set<List<Node>> vertexSequences, MappingStore store, String outputDir,
			VertexSequenceType seqType) {
		String type = seqType == VertexSequenceType.PATH ? "paths" : "walks";

		try {
			File sdgSeqsfile = new File(outputDir + "/labels-" + type + ".txt");
			FileWriter sdgSeqsfw = new FileWriter(sdgSeqsfile);

			File cSeqsfile = new File(outputDir + "/original-labels-" + type + ".txt");
			FileWriter cSeqsfw = new FileWriter(cSeqsfile);

			Set<String> allLabels = new HashSet<>();

			for (List<Node> sequences : vertexSequences) {
				for (Node node : sequences) {
					String label = node.getLabel();
					if (allLabels.contains(label)) {
						continue;
					}

					sdgSeqsfw.write(label + "> " + node.toDefUse() + "\n");
					cSeqsfw.write(label + "> " + getNodeRule(node, store) + "\n");
					allLabels.add(label);
				}
			}

			sdgSeqsfw.close();
			cSeqsfw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static String getNodeRule(Node node, MappingStore store) {
		String nodeLabel = node.getLabel();

		switch (node.getType()) {
		case ENTRY:
			return getRuleText(nodeLabel, store);
		case FORMAL_IN:
			return getFormalInAndOutParameterRule(nodeLabel, store);
		case FORMAL_OUT:
			return getFormalInAndOutParameterRule(nodeLabel.substring(2), store);
		case ACTUAL_IN:
			return getActuallInAndOutArgumentRule(nodeLabel, store);
		case ACTUAL_OUT:
			return getActuallInAndOutArgumentRule(nodeLabel.substring(2), store);
		case NORMAL:
			return getRuleText(nodeLabel, store);
		case CTRL:
			return getRuleText(nodeLabel, store);
		case CALL:
			return getCallRuleText(nodeLabel, store);
		case RETURN:
			return getRuleText(nodeLabel, store);
		default:
			throw new Error("node type not found: " + node);
		}
	}

	private static String getCallRuleText(String nodeLabel, MappingStore store) {
		ParserRuleContext ruleContext = getRuleContext(nodeLabel, store);

		if (ruleContext == null) {
			return "";
		}

		// C-specific
//		System.out.println(ruleContext.getClass() + " : " + ruleContext.getText());

		if (!(ruleContext instanceof CParser.PostfixExpressionContext)) {
			throw new Error("The corresponding actual in/out does not belong to a procedure call.");
		}

		CParser.PostfixExpressionContext ctx = (CParser.PostfixExpressionContext) ruleContext;

		if (ctx.postfixExpression() == null) {
			throw new Error("The procedure call has no name");
		}

		return Utils.getFullText(ctx.postfixExpression());
	}

	private static String getRuleText(String nodeLabel, MappingStore store) {
		ParserRuleContext ruleContext = getRuleContext(nodeLabel, store);
		if (ruleContext == null) {
			return "";
		}

		return Utils.getFullText(ruleContext);
	}

	private static ParserRuleContext getRuleContext(String nodeLabel, MappingStore store) {
		double label = Double.parseDouble(nodeLabel);

		if (!store.hasRuleContext(label)) {
			return null;
		}
		return store.getRuleContext(label);
	}

	private static String getActuallInAndOutArgumentRule(String nodeLabel, MappingStore store) {
		int argumentIndex = getParameterOrArgumentIndex(nodeLabel);

		ParserRuleContext ruleContext = getRuleContext(nodeLabel, store);

		String text = ruleContext.getText();
		System.out.println("ruleContext: " + text);

		// C-specific
//		System.out.println(ruleContext.getClass() + " : " + ruleContext.getText());

		if (!(ruleContext instanceof CParser.PostfixExpressionContext)) {
			throw new Error("The corresponding actual in/out does not belong to a procedure call.");
		}

		CParser.PostfixExpressionContext ctx = (CParser.PostfixExpressionContext) ruleContext;

		if (ctx.argumentExpressionList() == null) {
			return "";
		}

		List<ParserRuleContext> argumentRules = visitArgumentExpressionList(ctx.argumentExpressionList());

//		for (ParserRuleContext p : argumentRules) {
//			System.out.println(p.getText());
//		}
//

		if (argumentRules.size() <= argumentIndex) {
			return "";
		}

		String argumentText = argumentRules.get(argumentIndex).getText();
		String fullText = Utils.getFullText(argumentRules.get(argumentIndex));

		return Utils.getFullText(argumentRules.get(argumentIndex));
	}

	private static List<ParserRuleContext> visitArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {
		List<ParserRuleContext> result = new ArrayList<>();

		if (ctx.Comma() != null) {
			result.addAll(visitArgumentExpressionList(ctx.argumentExpressionList()));
		}

		result.add(ctx.assignmentExpression());

		return result;
	}

	private static List<ParserRuleContext> visitParameterList(CParser.ParameterListContext ctx) {
		List<ParserRuleContext> result = new ArrayList<>();

		if (ctx.Comma() != null) {
			result.addAll(visitParameterList(ctx.parameterList()));
		}

		result.add(ctx.parameterDeclaration());

		return result;
	}

	private static int getParameterOrArgumentIndex(String nodeLabel) throws Error {
		String decimalDigits = nodeLabel.substring(nodeLabel.indexOf('.') + 1);

		if (decimalDigits.length() != 2) {
			throw new Error("The label has to few decimal digits to match a parameter or argument node");
		}

		// normalize the index for parameter or argument
		return Integer.parseInt(decimalDigits.charAt(1) + "") - 1;
	}

	private static String getFormalInAndOutParameterRule(String nodeLabel, MappingStore store) {
		int parameterIndex = getParameterOrArgumentIndex(nodeLabel);

		ParserRuleContext ruleContext = getRuleContext(nodeLabel, store);

		String text = ruleContext.getText();
		System.out.println("ruleContext: " + text);

		// C-specific
		if (!(ruleContext instanceof CParser.DirectDeclaratorContext)) {
			throw new Error("The corresponding formal in/out does not belong to a procedure.");
		}

		CParser.DirectDeclaratorContext ctx = (CParser.DirectDeclaratorContext) ruleContext;

		if (ctx.parameterTypeList() == null) {
			return "";
		}

		List<ParserRuleContext> parameterRules = visitParameterList(ctx.parameterTypeList().parameterList());

		if (parameterRules.size() <= parameterIndex) {
			return "";
		}

//		String parameterDescription = parameterRules.get(parameterIndex).children.stream().map(c -> c.getText())
//				.collect(Collectors.joining(" "));
//
//		return parameterDescription;

		String x = Utils.getFullText(parameterRules.get(parameterIndex));

		return x;
	}

	public static void main(String[] args) {
		analyze("./input/", "refined");
	}

}
