package org.servicifi.gelato.analysis.framework.sdg;

import java.util.Map;

import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;

public final class SDGFactory {
	public static SDG createSDG(CompilationUnit cu, Map<Long, ExitEntryPair> label2Maps) {
		SDG sdg = build(cu);

		addDataDependencies(sdg, label2Maps);

		return sdg;
	}

	private static void addDataDependencies(SDG sdg, Map<Long, ExitEntryPair> label2Maps) {
		for (long label : label2Maps.keySet()) {
			Node node = sdg.getVertex(label);
			
			if(node == null) {
				continue;
			}
			
			setDataDependencies(node, label2Maps.get(label), sdg);
		}
	}

	private static void setDataDependencies(Node vertex, ExitEntryPair exitEntryPair, SDG sdg) {
		if (exitEntryPair == null) {
			System.out.println("No exit entry pair for: " + vertex.toString());

			return;
		}

		for (AnalysisResult entry : exitEntryPair.getEntry()) {
			if (!(entry instanceof ReachingDefinitionsAnalysisResult)) {
				continue;
			}

			ReachingDefinitionsAnalysisResult result = (ReachingDefinitionsAnalysisResult) entry;

			vertex.getUsages().stream().forEach(usage -> {
				Long label = getDataDefinitionLabel(usage, result);

				if (label == null) {
					return;
				}

				// TODO Is label.toString() === label + ""
				Node source = sdg.getNodeWithLabel(label.toString());

				if (source == null) {
					return;
				}

				sdg.addEdge(source, vertex, new Edge(source, vertex, EdgeType.DATA));
			});
		}

	}

	private static Long getDataDefinitionLabel(String usage, ReachingDefinitionsAnalysisResult result) {
		// TODO why is there no name on variable?
		Variable variable = result.getVariable();

		if (!(variable instanceof DataItem)) {
			return null;
		}

		DataItem di = (DataItem) variable;

//		boolean f = true;
//		if(f) {
//			throw new Error("Usage is "+ usage + ", but di name is "+ di.getName());
//		}

		if (usage == di.getName()) {
			return result.getLabel();
		}

		return null;
	}

	private static SDG build(CompilationUnit cu) {
		CDGBuilder cdgBuilder = new CDGBuilder(cu);
		cdgBuilder.build(null);

		return cdgBuilder.cdg;
	}

//	public static SDG createSDG(EList<Flow> cfg, Map<Long, ExitEntryPair> label2Maps) {
//
//		SDG sdg = new SDG();
//
//		Map<Long, Node> label2Nodes = new HashMap<>();
//
//		Set<org.servicifi.gelato.analysis.framework.graphs.Node> cfgNodes = new HashSet<>();
//		for (Flow flow : cfg) {
//			cfgNodes.add(flow.getFrom());
//			cfgNodes.add(flow.getTo());
//		}
//
//		populateNodes(cfgNodes, label2Nodes);
//
//		// this should iterate over flows
//		Set<Edge> edges = populateEdges(cfg, label2Nodes);
//
//		// rewrite this
//		label2Nodes.values().stream().forEach(v -> sdg.addVertex(v));
//
//		// XXX the problem is cfg has no node for PROCEDURE, but a dummy start point,
//		// denoting the entry point for SDG.
//
//		for (Node v : sdg.vertexSet()) {
//			System.out.println("vertex is: "+ v);
//		}
//		
//		for (Edge e : edges) {
//			Node source = sdg.getNodeWithLabel(e.getSource().getLabel());
//			Node target = sdg.getNodeWithLabel(e.getTarget().getLabel());
//
//			if (source == null || target == null) {
//				throw new Error("source or target is null");
//			}
//
//			System.out.println("Source is " + source + ", and target is " + target);
//
//			// sdg.addEdge(source, target);
//		}
//
////		edges.stream().forEach(e -> sdg.addEdge(sdg.getNodeWithLabel(e.getSource().getLabel()),
////				sdg.getNodeWithLabel(e.getTarget().getLabel())));
//
//		return sdg;
//	}

//	private static Set<Edge> populateEdges(EList<Flow> cfg, Map<Long, Node> label2Nodes) {
//
//		Set<Edge> edges = new HashSet<>();
//
//		for (Flow flow : cfg) {
//			LabellableElement sourceCFGNode = (LabellableElement) flow.getFrom();
//			LabellableElement targetCFGNode = (LabellableElement) flow.getTo();
//
//			Node source = label2Nodes.get(sourceCFGNode.getLabel());
//
//			if (sourceCFGNode instanceof StatementListContainer) {
//				// this probably never happens
//				StatementListContainer statementContainer = (StatementListContainer) sourceCFGNode;
//			} else if (sourceCFGNode instanceof ProcedureCall) {
////				ReferenceableElement procedure = ((ProcedureCall) cfgLE).getTarget();
//				Node target = label2Nodes.get(targetCFGNode.getLabel());
//
//				Edge edge = new Edge(source, target, EdgeType.CALL);
//				edges.add(edge);
//			}
////			else if (cfgLE instanceof ReturnSite) {
////				type = NodeType.RETURN_SITE;
////			};
//		}
//
//		return edges;
//	}

//	private static void populateNodes(Set<org.servicifi.gelato.analysis.framework.graphs.Node> cfg,
//			Map<Long, Node> label2Nodes) {
//		for (org.servicifi.gelato.analysis.framework.graphs.Node cfgNode : cfg) {
//
//			LabellableElement cfgLE = (LabellableElement) cfgNode;
//
//			NodeType type = NodeType.NORMAL;
//
//			if (cfgLE instanceof ProcedureCall) {
//				type = NodeType.CALL_SITE;
//			} else if (cfgLE instanceof ReturnSite) {
//				type = NodeType.RETURN_SITE;
//			}
//
//			Node node = new Node(cfgLE.getLabel(), type);
//			label2Nodes.put(node.getLabel(), node);
//
//			if (cfgLE instanceof Procedure) {
//
//				Procedure procedure = (Procedure) cfgLE;
//				EList<Parameter> parameters = procedure.getParameters();
//				for (int i = 0; i < parameters.size(); i++) {
//					long pLabel = getParameterLabel(node, i);
//					Node pNode = new Node(pLabel, NodeType.FORMAL_IN);
//					label2Nodes.put(pNode.getLabel(), node);
//				}
//			} else if (cfgLE instanceof ProcedureCall) {
//				ProcedureCall call = (ProcedureCall) cfgLE;
//				EList<Argument> arguments = call.getArguments();
//				for (int i = 0; i < arguments.size(); i++) {
//					long aLabel = getParameterLabel(node, i);
//					Node aNode = new Node(aLabel, NodeType.ACTUAL_IN);
//					label2Nodes.put(aNode.getLabel(), node);
//				}
//			}
//		}
//	}
}
