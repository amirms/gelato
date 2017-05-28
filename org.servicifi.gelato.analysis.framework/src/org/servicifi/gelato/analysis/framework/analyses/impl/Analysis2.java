package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.awt.Label;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.flows.Flow;
import org.servicifi.gelato.language.kernel.analyses.AnalysisDirection;
import org.servicifi.gelato.language.kernel.analyses.AnalysisResult;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;

import com.google.common.collect.Lists;

public class Analysis2 extends AnalysisImpl {
	
	AnalysisConfiguration<UEnvironment, UContext, UResult, UNode> configuration;

	public Map<Long, ExitEntryPair> performAnalysis() {
		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
		for (int i = 0; i < this.cfg.size(); i++) {
			map = new TreeMap<>();
			for (Flow f : this.cfg) {
				// FIXME replace it with the factory
				ExitEntryPair pair = new ExitEntryPairImpl(exit(f.getFrom(), i), entry(f.getFrom(), i));
				map.put(f.getFrom().getLabel(), pair);
			}
		}

		map.remove(1); // Thats the Program.START one
		map.remove(2); // Thats the Program.END one
		result = map;
		return map;
	}

	Map<Long, ExitEntryPair> performInterprocedualAnalysis<UEnvironment,UContext,UResult,UNode extends Node>(
	AnalysisConfiguration<UEnvironment, UContext, UResult, UNode> configuration, Graph graph)
	{
			/**
			 * Represents start, end and, in case of a jump, the original start of the edge.
			 * If the edge a->b is replaced by a jump to function f, and f_end is an exit label of f,
			 * then [f_end, b, a] is the edge that represents the edge from the exit label to the call site.
			 */
			//Edge = [GraphNode<ts.Node>, UContext, GraphNode<ts.Node>, UContext, GraphNode<ts.Node> | undefined, UContext | undefined];

			List<Flow> worklist= new ArrayList<Flow>();
			for (Flow f: this.cfg) {
				LabellableElement from = f.getFrom();
				LabellableElement to = f.getTo();
				List<AnalysisContext> fromContext = configuration.getInitialContexts(from);
				List<AnalysisContext> toContext = configuration.getInitialContexts(to);
				for (AnalysisContext context: fromContext) {
					if (toContext.indexOf(context) != -1) {
						Flow flow = new ContextualFlow(from, context, to, context, null, null);
						worklist.add(flow);
					}
				}
			}
			if (configuration.getDirection().equals(AnalysisDirection.FORWARDS)) {
				// Reverse worklist
				worklist = Lists.reverse(worklist);
//				worklist = worklist.map((value, index) => worklist[worklist.length - index - 1]);
			}

			
			
			Map<LabellableElement, Map<AnalysisContext, ExitEntryPair>> envs =
					new HashMap<LabellableElement, Map<AnalysisContext, ExitEntryPair>>();
			// Jumps in configuration.direction
			Map<LabellableElement,  Map<AnalysisContext, JumpBack<LabellableElement, AnalysisContext>[]>> jumpTo = 
					new HashMap<LabellableElement,  Map<AnalysisContext, JumpBack<LabellableElement, AnalysisContext>[]>>();
			// Jumps in reverse direction
			Map<LabellableElement,  Map<AnalysisContext, JumpBack<LabellableElement, AnalysisContext>[]>> jumpBack = 
					new HashMap<LabellableElement,  Map<AnalysisContext, JumpBack<LabellableElement, AnalysisContext>[]>>();

			while (worklist.size() != 0) {
//				const [from, fromContext, to, toContext, beforeJump, beforeJumpContext] = worklist.pop()!;
				
				Flow currentFlow =  worklist.remove(worklist.size() - 1);

				LabellableElement from = currentFlow.getFrom();
				AnalysisContext fromContext = currentFlow.getFromContext();
				
				LabellableElement to = currentFlow.getTo();
				AnalysisContext toContext = currentFlow.getToContext();
				
				JumpBack beforeJump = currentFlow.getBeforeJump();
				AnalysisContext beforeJumpContext = currentFlow.getBeforeJumpContext();
						
				AnalysisResult envFrom = get(from, fromContext);

				AnalysisResult envOut = get(to, toContext);
				
				ExitEntryPair<AnalysisContext, AnaysisResult> transferred = null; 
						
				if (beforeJump != null){
					transferred = transferMerge(beforeJump, from, get(beforeJump, beforeJumpContext!), transfer(from, fromContext, envFrom).env)
					
				} else {
					transferred = transfer(from, fromContext, envFrom);
				}
				
				for (Jump jump : transferred.jumps) {
					Procedure procedureGraph = cfg.getProcedure(jump.to); //get the procedure graph for the callee
					if (configuration.getDirection().equals(AnalysisDirection.FORWARDS)) {
						AnaysisEnvironment envJumpTo = get(procedureGraph.entry, jump.toContext);
						AnaysisEnvironment newEnvJumpTo = this.join(jump.env, envJumpTo); //data facts 
						const transformed = join(envJumpTo, newEnvJumpTo);
						if (!configuration.equals(envJumpTo, transformed)) {
							set(procedureGraph.entry, jump.toContext, transformed);
							addWork(procedureGraph.entry, jump.toContext);

							if (envJumpTo.equals(configuration.bottom)) {
								// Add edges to worklist
								Set<LabellableElement> visited = new HashSet<LabellableElement>();
								let visit = (node: GraphNode<ts.Node>) => {
									if (visited.has(node)) return;
									visited.add(node);
									for (const next of node.next) {
										worklist.push([node, toContext, next, toContext, undefined, undefined]);
										visit(next);
									}
								};
								visit(to);

								for (const exit of functionGraph.exit) {
									addJumpEdge(exit, jump.toContext, to, toContext, from, fromContext);
								}
							}
						}
					} else {
						throw new Error("Jumps not implemented for backward analysis");
					}
				}
				const transformed = configuration.join(
					transferred.env,
					envOut
				);
				if (configuration.equal(transformed, envOut)) continue;
				set(to, toContext, transformed);
				addWork(to, toContext);
			}

			return configuration.result(getState, contextsForNode);

			
		}

	addWork(LabellableElement node, AnalysisContext context) {
		for (Flow edge : successors(node, context)) {
			worklist.add(edge);
			LabellableElement to = edge.to;
			AnalysisContext toContext = edge.toContext;
			AnalysisContext original = edge.original;

			if (original == null) {
				List<Jump> jumps = jumpBack.get(node, context);
				if (jumps == null) continue;
				for (Jump jump : jumps) {
					if (jump.original.equals(node) && jump.originalContext.equals(context)) {
						worklist.add(new Flow{
							[jump.node, jump.context, to, toContext, undefined, undefined])
						};
					}
				}
			}
		}
	}

	private TransferResult<AnalysisContext, AnaysisEnvironment> transfer(LabellableElement from,
			AnalysisContext fromContext, AnalysisResult envFrom) {
		return configuration.kinds.indexOf(graphNode.kind) != -1 && configuration.filter(graphNode.node)
				? this.transfer(graphNode.node, graphNode.kind, context, env) : ExitEntryPair<UContext, UEnvironment>(env);
	}

	private TransferResult<AnalysisContext, AnaysisEnvironment> transferMerge(
			LabellableElement original, 
			LabellableElement from, 
			AnalysisEnvironment beforeEnv, 
			AnalysisEnvironment jumpEnv) {
		if (configuration.transferMerge != null) {
			return ExitEntryPair<UContext, UEnvironment>(configuration.transferMerge(original.node as UNode, original.kind, from.node, from.kind, beforeEnv, jumpEnv));
		}
		return ExitEntryPair<UContext, UEnvironment>(jumpEnv);
	}

	int addJumpEdge(LabellableElement from, AnalysisContext fromContext, 
			LabellableElement to, AnalysisContext toContext, 
			LabellableElement original, AnalysisContext originalContext) {
		List<Flow> fromEdges = jumpTo.getOrCreate(from, fromContext, []);
		for (Flow edge : fromEdges) {
			if (edge.node.equals(to) && edge.original.equals(original) && edge.context.equals(toContext)) {
				// Edge exists
				return;
			}
		}
		// Edge does not exist yet
		fromEdges.add({ node: to, context: toContext, original, originalContext });
		const toEdges = jumpBack.getOrCreate(to, toContext, []);
		toEdges.push({ node: from, context: fromContext, original, originalContext });
	}

	boolean isEntry(LabellableElement node) {
		if (configuration.isEntry) return configuration.isEntry(node);
		List<LabellableElement> predecessors = configuration.direction === Direction.Forward ? node.next : node.previous;
		return predecessors.length === 0;
	}

	private AnalysisResult get(LabellableElement from, AnalysisContext fromContext) {
		AnalysisEnvironment stored = envs.get(node, context);
		if (stored != null) return stored;
		const value = isEntry(node) ? configuration.entry(node) : configuration.bottom;
		envs.set(node, context, value);
		return value;
	}

	function set(LabellableElement node, AnalysisContext context, AnalysisEnvironment value) {
		envs.set(node, context, value);
	}

	AnalysisEnvironment getState(LabellableElement node, GraphNodeKind kind, AnalysisContext context, boolean out) {
		Labellable graphNode = graph.get(node, kind);
		AnalysisEnvironment env = get(graphNode, context);
		if (out)
			return transfer(graphNode, context, env).env;
		return env;
	}

	void contextsForNode(Labellable node, GraphNodeKind kind) {
		Labellable graphNode = graph.get(node, kind);
		return envs.keysForKey(graphNode);
	}

	// Returns tuple with a predecessor and, in case of a jump, the original
	// target of the edge (before adding jump)
	IterableIterator<Edge>  predecessors(LabellableElement node, AnalysisContext context) {
		List<LabellableElement> nodes = configuration.direction === AnalysisDirection.BACKWARDS ? node.next : node.previous);
		for (LabellableElement n : nodes) {
			yield [node, context, n, context, undefined, undefined];
		}
		for (const jump of jumpBack.get(node, context) || []) {
			yield [node, context, jump.node, jump.context, jump.original, jump.originalContext];
		}
	}function*

	successors(node: GraphNode<ts.Node>, context: UContext): IterableIterator<Edge> {
		for (const n of configuration.direction === Direction.Forward ? node.next : node.previous) {
			yield [node, context, n, context, undefined, undefined];
		}
		for (const jump of jumpTo.get(node, context) || []) {
			yield [node, context, jump.node, jump.context, jump.original, jump.originalContext];
		}
	}
}
