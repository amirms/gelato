/**
 */
package org.servicifi.gelato.language.kernel.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.FlowsPackage;
import org.servicifi.gelato.language.kernel.flows.RegularFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
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

} //RegularFlowImpl
