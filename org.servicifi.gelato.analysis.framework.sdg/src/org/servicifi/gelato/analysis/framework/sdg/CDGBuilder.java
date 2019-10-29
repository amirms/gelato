package org.servicifi.gelato.analysis.framework.sdg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.alg.util.Pair;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ArgumentReference;
import org.servicifi.gelato.language.kernel.statements.Abort;
import org.servicifi.gelato.language.kernel.statements.Block;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.Goto;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

public class CDGBuilder {
	private Map<String, Integer> unmatchedAstNodes;

	private final CompilationUnit cu;
	private NodeFactory nodeCreator;

	private HashMap<String, Pair<Node, List<Node>>> procedureParams;
	private HashMap<String, Set<Pair<Node, List<Node>>>> calls;

	// TODO I can just find it in cdg.vertexset()
	private Map<String, Node> procedure2nodes;
	private Map<String, Node> call2nodes;
	private Map<String, Node> goto2nodes;
	private Map<String, Node> argument2nodes;
	private Map<String, Node> parameter2nodes;

	private Map<Parameter, Node> formalOuts;
	private Map<Argument, Node> actualOuts;

	public SDG cdg;
	private Deque<List<Node>> inScopeStack;
	private List<Node> inScope;
	private Deque<Node> loopStack;

	// FIXME Think about label
//	private static final Node EXIT = new Node("Main Exit", NodeType.EXIT);

	public CDGBuilder(final CompilationUnit cu) {
		this.cu = cu;
	}

	public void build(SDGFactoryConfig sdgConfig) {
		unmatchedAstNodes = new HashMap<>();
		nodeCreator = new NodeFactory(sdgConfig);
		cdg = new SDG();
		inScopeStack = new ArrayDeque<>();
		inScope = new ArrayList<>();
		loopStack = new ArrayDeque<>();
		procedureParams = new HashMap<>();
		calls = new HashMap<>();
		procedure2nodes = new HashMap<>();
		goto2nodes = new HashMap<>();
		call2nodes = new HashMap<>();
		argument2nodes = new HashMap<>();
		parameter2nodes = new HashMap<>();
		formalOuts = new HashMap<>();
		actualOuts = new HashMap<>();

		final MainProcedure mainProcedure = cu.getMainProcedure();
		_build(mainProcedure);

		for (Member memb : cu.getDeclarations()) {
			if (memb instanceof LabellableElement) {
				_build((LabellableElement) memb);
			}
		}

		reportUnmatched();

		connectProcedures();

		connectGotos();
	}

	private void connectGotos() {
		TreeIterator<EObject> iterator = this.cu.eAllContents();

		while (iterator.hasNext()) {
			EObject element = iterator.next();

			if (element instanceof Goto) {
				Goto gotoStatement = (Goto) element;

				LabellableElement targetElement = gotoStatement.getTarget();
				if (targetElement == null) {
					throw new Error("Goto statement does not have a target label");
				}

				Node source = cdg.getVertex(gotoStatement.getLabel());

				if (source == null) {
					throw new Error("Source goto statement cannot be found");
				}

				Node target = cdg.getVertex(targetElement.getLabel());

				if (target == null) {
					throw new Error(
							"Target of goto statement with label(" + targetElement.getLabel() + ") cannot be found");
				}

				addEdge(EdgeType.CTRL_TRUE, source, target);
			}
		}
	}

	private void connectProcedures() {

		TreeIterator<EObject> iterator = this.cu.eAllContents();

		while (iterator.hasNext()) {
			EObject element = iterator.next();

			if (element instanceof ProcedureCall) {
				ProcedureCall procedureCall = (ProcedureCall) element;
				Procedure procedure = (Procedure) procedureCall.getTarget();

				Node caller = call2nodes.get(procedureCall.getLabel() + "");
				Node callee = procedure2nodes.get(procedure.getLabel() + "");

				if (caller == null) {
					call2nodes.keySet().stream().forEach(s -> System.out.println(s));
					throw new Error("Caller " + procedureCall.getLabel() + " doesnot exist");
				} else if (callee == null) {
					throw new Error("Callee " + procedure + " doesnot exist");
				}

				cdg.addEdge(caller, callee, new Edge(caller, callee, EdgeType.CALL));
				for (int i = 0; i < procedureCall.getArguments().size(); i++) {
					Argument argument = procedureCall.getArguments().get(i);

					if (argument instanceof ArgumentReference) {
						ArgumentReference argReference = (ArgumentReference) argument;
						final Node callArg = getArgumentNode(argReference);

						Parameter correspondingParameter = procedure.getParameters().get(i);
						final Node defParam = getParameterNode(correspondingParameter);

						cdg.addEdge(callArg, defParam, new Edge(callArg, defParam, EdgeType.PARAM_IN));

						if (correspondingParameter.isByReference()) {
							final Node actualOut = actualOuts.get(argument);

							final Node formalOut = formalOuts.get(correspondingParameter);

							cdg.addEdge(formalOut, actualOut, new Edge(formalOut, actualOut, EdgeType.PARAM_OUT));
						}
					}
				}
			}
		}
	}

	private Node getParameterNode(Parameter parameter) {
		return parameter2nodes.get(NodeFactory.getParameterLabel(parameter));
	}

	private Node getArgumentNode(ArgumentReference argument) {
		return argument2nodes.get(NodeFactory.getArgumentLabel(argument));
	}

	private void reportUnmatched() {
		for (String node : unmatchedAstNodes.keySet()) {
			System.out.println("Node " + node + " was not matched " + unmatchedAstNodes.get(node) + " times");
		}
	}

	private void _build(LabellableElement child) {
		if (child instanceof MainProcedure) {
			buildMainProcedure((MainProcedure) child);
		} else if (child instanceof Procedure) {
			buildProcedure((Procedure) child);
		} else if (child instanceof Statement) {
			buildStatement((Statement) child);
		} else if (child instanceof DataItem) {

		} else {
			logUnmatched(child);
		}

	}

	private void buildStatement(Statement statement) {
		if (statement instanceof WhileLoop) {
			whileStmt((WhileLoop) statement);
		} else if (statement instanceof Condition) {
			ifStmt((Condition) statement);
		} else if (statement instanceof ProcedureCall) {
			procedureCall((ProcedureCall) statement);
		} else if (statement instanceof ExpressionStatement) {
			expressionStatement((ExpressionStatement) statement);
		} else if (statement instanceof Block) {
			blockStatement((Block) statement);
		} else if (statement instanceof Return) {
			returnStatement((Return) statement);
		} else if (statement instanceof Goto) {
			gotoStatement((Goto) statement);
		} else if (statement instanceof Abort) {
			abortStatement((Abort) statement);
		} else {
			logUnmatched(statement);
		}
	}

	private void abortStatement(Abort statement) {
		final Node v = nodeCreator.abortStmt(statement);
		cdg.addVertex(v);
		inScope.add(v);
	}

	private void gotoStatement(Goto statement) {
		final Node v = nodeCreator.gotoStmt(statement);
		cdg.addVertex(v);
		inScope.add(v);
	}

	private void logUnmatched(LabellableElement element) {
		final String nodeName = element.getClass().getSimpleName();
		Integer count = unmatchedAstNodes.get(nodeName);
		if (count == null)
			count = 0;
		unmatchedAstNodes.put(nodeName, count + 1);
	}

	private void returnStatement(Return statement) {
		final Node v = nodeCreator.returnStmt(statement);
		cdg.addVertex(v);
		inScope.add(v);
		// TODO only include by ref parameters
//		if (statement.getReturnValue() != null) {
		// FIXME the following is not correct
//		if (statement != null) {
//			final Node formalOut = formalOutStack.peek();
//			if (formalOut == null)
//				throw new IllegalStateException("Is " + statement + " inside a method that returns void?");
//			else
//				addEdge(EdgeType.DATA, v, formalOut);
//		}

		// addEdge(EdgeType.CTRL_TRUE, v, CDGBuilder.EXIT);
	}

	private void expressionStatement(ExpressionStatement n) {
		final Node v = nodeCreator.assignExpr(n);
		cdg.addVertex(v);
		inScope.add(v);
//	    ControlFlow result = new ControlFlow(v, v);
		// Check for call
	}

	private void blockStatement(Block statement) {
//		final List<ControlFlow> flow = new ArrayList<>();
		for (final Statement s : statement.getStatements())
			_build(s);
//	    return cfgBuilder.seq(flow);

	}

	// build calls later
	private void procedureCall(ProcedureCall statement) {
		final Node v = nodeCreator.procedureCall(statement);
		cdg.addVertex(v);
		inScope.add(v);

		call2nodes.put(v.getLabel(), v);

		buildArgs(v, statement);

	}

	private void whileStmt(final WhileLoop n) {
		final Node v = nodeCreator.whileLoop(n);
		cdg.addVertex(v);
		loopStack.push(v);
		inScope.add(v);
		pushScope();
		final Statement body = n.getStatement();
		// final Edge bodyFlow =
		_build(body);
		addEdges(EdgeType.CTRL_TRUE, v, inScope);
		// Self edge
		addEdge(EdgeType.CTRL_TRUE, v, v);
		loopStack.pop();
		popScope();
		// return v;
	}

	private void buildProcedure(final Procedure proc) {
		final Node v = getProcedureNode(proc);

		cdg.addVertex(v);
		inScope.add(v);
		pushScope();

		final EList<Parameter> params = proc.getParameters();
		buildParameters(params, v, proc.getName());

		buildFormalOuts(params, v);

		final EList<Member> body = proc.getMembers();

		for (Member member : body) {
			if (member instanceof LabellableElement)
				_build((LabellableElement) member);
		}
		addEdges(EdgeType.CTRL_TRUE, v, inScope);
		popScope();
		// return result;
	}

	private void buildFormalOuts(EList<Parameter> params, Node v) {

		for (Parameter parameter : params) {
			if (parameter.isByReference()) {
				final Node formalOut = formalOut(parameter, (Procedure) parameter.eContainer());
				formalOuts.put(parameter, formalOut);
			}
		}
	}

	private Node getProcedureNode(Procedure proc) {
		if (procedure2nodes.containsKey(proc.getLabel())) {
			return procedure2nodes.get(proc.getLabel());
		}

		final Node v = nodeCreator.procedure(proc);
		procedure2nodes.put(v.getLabel(), v);
		cdg.addVertex(v);

		return v;
	}

	private void buildMainProcedure(final MainProcedure proc) {
		final Node v = nodeCreator.mainprocedure(proc);

		cdg.addVertex(v);

		final EList<Member> body = proc.getMembers();
		// Edge bodyFlow = null;
		// if (body.isEmpty())
		// bodyFlow =
		for (Member member : body) {
			if (member instanceof LabellableElement)
				_build((LabellableElement) member);
		}
		addEdges(EdgeType.CTRL_TRUE, v, inScope);
	}

	private void buildParameters(EList<Parameter> params, Node v, String procedureName) {
		final List<Node> paramVtcs = new ArrayList<>();
		for (final Parameter p : params) {
			final Node paramVtx = buildParameter(p);
			paramVtcs.add(paramVtx);
		}

		procedureParams.put(procedureName, new Pair<>(v, paramVtcs));
	}

	private Node buildParameter(final Parameter parameter) {
		final Node v = nodeCreator.parameter(parameter);
		cdg.addVertex(v);
		inScope.add(v);

		parameter2nodes.put(v.getLabel(), v);

		return v;
	}

	private Node formalOut(final Parameter parameter, final Procedure procedure) {
		final Node v = nodeCreator.formalOut(parameter, procedure);
		cdg.addVertex(v);
		inScope.add(v);
		return v;
	}

	private Node actualOut(final Node v, final Argument argument, final ProcedureCall call) {
		final Node a = nodeCreator.actualOut(argument, call);
		cdg.addVertex(a);
		addEdge(EdgeType.CTRL_TRUE, v, a);

		return a;
	}

	private void ifStmt(final Condition n) {
		final Node v = nodeCreator.ifStmt(n);
		cdg.addVertex(v);
		inScope.add(v);
		pushScope();
		// Then branch
		final Statement thenStmt = n.getStatement();
		// final Edge thenFlow =
		_build(thenStmt);
		addEdges(EdgeType.CTRL_TRUE, v, inScope);
		// Reset scope
		clearScope();
		// Else branch
		final Statement elseStmt = n.getElseStatement();
		// Control flow
		if (elseStmt != null) {
			_build(elseStmt);
			addEdges(EdgeType.CTRL_FALSE, v, inScope);
		}
		popScope();
	}

	private void buildArgs(final Node v, final ProcedureCall call) {
		// , final Expression, scope) {
		final List<Node> paramVtcs = new ArrayList<>();
		for (final Argument argument : call.getArguments()) {
			if (argument instanceof ArgumentReference) {
				ArgumentReference argReference = (ArgumentReference) argument;

				final Node actualIn = actualIn(argReference);
				addEdge(EdgeType.CTRL_TRUE, v, actualIn);
				paramVtcs.add(actualIn);

				Parameter correspondingParameter = argument.getCorrespondingParameter();
				if (correspondingParameter.isByReference()) {
					final Node actualOut = actualOut(v, argument, call);
					actualOuts.put(argument, actualOut);

					addEdge(EdgeType.CTRL_TRUE, v, actualOut);
					paramVtcs.add(actualIn);
				}
			}
		}
		// final String methodName = callName(name, scope);
		// final String methodName = callName(name);
		putCall(call.getTarget().getName(), new Pair<>(v, paramVtcs));
		// return cfgBuilder.seq(result);// , n.o().orElse(null));
	}

	private Node actualIn(ArgumentReference argument) {
		final Node v = nodeCreator.argument(argument);
		argument2nodes.put(v.getLabel(), v);
		cdg.addVertex(v);
		return v;
	}

	private void putCall(final String method, final Pair<Node, List<Node>> pair) {
		Set<Pair<Node, List<Node>>> callPairs = calls.get(method);
		if (callPairs == null) {
			callPairs = new HashSet<>();
			calls.put(method, callPairs);
		}
		callPairs.add(pair);
	}

	private void addEdge(final EdgeType type, final Node source, final Node target) {
		cdg.addEdge(source, target, new Edge(source, target, type));
	}

	private void addEdges(final EdgeType type, final Node source, final List<Node> target) {
		for (final Node v : target)
			addEdge(type, source, v);
	}

	private void pushScope() {
		inScopeStack.push(inScope);
		clearScope();
	}

	private void clearScope() {
		inScope = new ArrayList<>();
	}

	private void popScope() {
		inScope = inScopeStack.pop();
	}
}
