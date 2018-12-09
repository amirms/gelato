/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.Node;
import org.servicifi.gelato.analysis.framework.graphs.SummaryFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summary Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SummaryFlowImpl extends FlowImpl implements SummaryFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryFlowImpl() {
		super();
	}
	
	protected SummaryFlowImpl(Node to, Node from) {
		super(to, from);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphsPackage.Literals.SUMMARY_FLOW;
	}
	
	@Override
	public Flow reverse() {
		return new ProcedureFlowImpl(to, from);
	}

} //SummaryFlowImpl
