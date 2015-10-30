/**
 */
package org.servicifi.gelato.language.kernel.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.FlowsPackage;
import org.servicifi.gelato.language.kernel.flows.SummaryFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summary Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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

	public SummaryFlowImpl(LabellableElement from, LabellableElement to) {
		super(from, to);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowsPackage.Literals.SUMMARY_FLOW;
	}

	@Override
	public Flow reverse() {
		return new SummaryFlowImpl(to, from);
	}

} //SummaryFlowImpl
