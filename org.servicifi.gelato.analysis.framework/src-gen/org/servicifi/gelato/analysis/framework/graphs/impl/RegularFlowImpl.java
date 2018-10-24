/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.Node;
import org.servicifi.gelato.analysis.framework.graphs.RegularFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RegularFlowImpl extends FlowImpl implements RegularFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularFlowImpl() {
		super();
	}
	
	protected RegularFlowImpl(Node from, Node to) {
		super(from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphsPackage.Literals.REGULAR_FLOW;
	}	
	
	@Override
	public Flow reverse() {
		return new RegularFlowImpl(to, from);
	}

} //RegularFlowImpl
