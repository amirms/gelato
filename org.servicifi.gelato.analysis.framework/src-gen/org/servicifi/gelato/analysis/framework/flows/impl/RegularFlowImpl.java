/**
 */
package org.servicifi.gelato.analysis.framework.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.flows.Flow;
import org.servicifi.gelato.analysis.framework.flows.FlowsPackage;
import org.servicifi.gelato.analysis.framework.flows.RegularFlow;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;

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
	
	protected RegularFlowImpl(LabellableElement from, LabellableElement to) {
		super(from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowsPackage.Literals.REGULAR_FLOW;
	}
	
	@Override
	public Flow reverse() {
		return new RegularFlowImpl(to, from);
	}

} //RegularFlowImpl
