package org.servicifi.gelato.analysis.framework.sdg;

import org.eclipse.emf.common.util.EList;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

public class NodeFactory {

	private static final String OUT_POSTFIX = "_out";
	private static final String IN_POSTFIX = "_in";

	private SDGFactoryConfig sdgConfig;

	int id = -1;

	public NodeFactory(SDGFactoryConfig sdgConfig) {
		this.sdgConfig = sdgConfig;
	}

	private void setId(Node result) {
		// TODO Auto-generated method stub

	}

	public Node whileLoop(WhileLoop n) {
		final Expression cond = n.getCondition();
		final String label = cond.getLabel() + "";
		final Node result = new Node(label, NodeType.CTRL, cond);
		setId(result);
//	    setLine(result, n);
		setRefs(cond, result);
		setSubtypes(result, cond);
		return result;
	}

	public Node procedure(Procedure n) {
		final String label = n.getLabel() + "";
		final Node result = new Node(label, NodeType.ENTRY, n);
		setId(result);
//	    setLine(result, n);
		return result;
	}

	public Node parameter(Parameter parameter) {
		final String label = getParameterLabel(parameter);
		final Node result = new Node(label, NodeType.FORMAL_IN, (Procedure) parameter.eContainer());

		result.addUsage(parameter.getName() + IN_POSTFIX);
		result.setDef(parameter.getName());

		return result;
	}

	public static String getParameterLabel(Parameter parameter) {
		Procedure procedure = (Procedure) parameter.eContainer();
		if (procedure == null) {
			throw new Error("Parameter " + parameter + " has no procedure container");
		}

		EList<Parameter> parameters = procedure.getParameters();
		for (int i = 0; i < parameters.size(); i++) {
			if (parameters.get(i).equals(parameter)) {
				return procedure.getLabel() + "." + (i + 1);
			}
		}

		throw new Error("Parameter " + parameter + " could not be found");
	}

	public Node formalOut(Parameter parameter, Procedure procedure) {
		final String label = "FO" + getParameterLabel(parameter);
		final Node result = new Node(label, NodeType.FORMAL_OUT, procedure);
		// formal out: parameter name + "_out"
		result.addUsage(parameter.getName());
		result.setDef(parameter.getName() + OUT_POSTFIX);
		return result;
	}

	public Node actualOut(Argument argument, ProcedureCall call) {
		// TODO calculate actual out label
		final String label = "AO" + getArgumentLabel(argument);
		final Node result = new Node(label, NodeType.ACTUAL_OUT, call);

		// formal out: parameter name + "_out"
		result.addUsage(argument.getCorrespondingParameter().getName() + OUT_POSTFIX);
		result.setDef(argument.getTarget().getName());
		return result;
	}

	public Node ifStmt(Condition n) {
		final Expression cond = n.getCondition();
		final String label = cond.getLabel() + "";
		final Node result = new Node(label, NodeType.CTRL, cond);
		setId(result);
		setRefs(cond, result);
		setSubtypes(result, cond);
		return result;
	}

	private void setSubtypes(Node result, Expression cond) {
		// TODO Auto-generated method stub

	}

	private void setRefs(Expression cond, Node result) {
		// TODO Auto-generated method stub

	}

	public Node procedureCall(ProcedureCall statement) {
		final String label = statement.getLabel() + "";
		final Node result = new Node(label, NodeType.CALL, statement);
		setId(result);
//	    setLine(result, n);
//	    setSubtypes(result, n);
		return result;
	}

	public Node assignExpr(ExpressionStatement n) {
//		setId(result);
//	    setLine(result, n);
//	    setDef(n.getTarget(), result);
//	    setRefs(n.getValue(), result);
//	    setSubtypes(result, n);
		final Expression value = n.getExpression();

		final String label = value.getLabel() + "";
		final Node result = new Node(label, NodeType.NORMAL, n);

		EList<DataItem> definedVariables = value.getDefinedVariables();

		if (definedVariables.size() > 1) {
			throw new Error("Multiple definitions not supported");
		} else if (definedVariables.size() == 1) {
			// FIXME defined variable should be singleton
			result.setDef(definedVariables.get(0).getName());
		}

		EList<DataItem> usedVariables = value.getUsedVariables();
		usedVariables.stream().forEach(uv -> result.addUsage(uv.getName()));
		return result;
	}

	public Node returnStmt(Return statement) {
		final String label = statement.getLabel() + "";
		final Node result = new Node(label, NodeType.RETURN, statement);
		return result;
	}

	public Node mainprocedure(MainProcedure proc) {
		final String label = proc.getLabel() + "";
		final Node result = new Node(label, NodeType.ENTRY, proc);
		setId(result);
//	    setLine(result, n);
		return result;
	}

	public Node argument(Argument argument) {
		final String label = getArgumentLabel(argument);
		final Node result = new Node(label, NodeType.ACTUAL_IN, (ProcedureCall) argument.eContainer());

		result.addUsage(argument.getTarget().getName());
		result.setDef(argument.getCorrespondingParameter().getName() + IN_POSTFIX);
		return result;
	}

	// here how to map nodes from control dependencies

	// may be build control dependencies first.

	public static String getArgumentLabel(Argument argument) {
		ProcedureCall pc = (ProcedureCall) argument.eContainer();
		if (pc == null) {
			throw new Error("Argument " + argument + " has no procedure call container");
		}

		EList<Argument> arguments = pc.getArguments();
		for (int i = 0; i < arguments.size(); i++) {
			if (arguments.get(i).equals(argument)) {
				return pc.getLabel() + "." + (i + 1);
			}
		}

		throw new Error("Argument " + argument + " could not be found");
	}
}
