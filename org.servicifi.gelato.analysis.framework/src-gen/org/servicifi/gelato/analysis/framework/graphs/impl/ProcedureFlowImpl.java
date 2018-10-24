/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.Node;
import org.servicifi.gelato.analysis.framework.graphs.ProcedureFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureFlowImpl extends FlowImpl implements ProcedureFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureFlowImpl() {
		super();
	}
	
	protected ProcedureFlowImpl(Node from, Node to) {
		super(from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphsPackage.Literals.PROCEDURE_FLOW;
	}
	
	@Override
	public Flow reverse() {
		return new ProcedureFlowImpl(to, from);
	}

} //ProcedureFlowImpl
