/**
 */
package org.servicifi.gelato.language.kernel.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.FlowsPackage;
import org.servicifi.gelato.language.kernel.flows.ProcedureFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ProcedureFlowImpl(LabellableElement from, LabellableElement to) {
		super(from, to);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowsPackage.Literals.PROCEDURE_FLOW;
	}

} //ProcedureFlowImpl
