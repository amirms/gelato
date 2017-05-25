/**
 */
package org.servicifi.gelato.analysis.framework.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.analysis.framework.flows.Flow;
import org.servicifi.gelato.analysis.framework.flows.FlowsPackage;
import org.servicifi.gelato.analysis.framework.flows.ProcedureFlow;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;

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
	
	@Override
	public Flow reverse() {
		return new ProcedureFlowImpl(to, from);
	}

} //ProcedureFlowImpl
