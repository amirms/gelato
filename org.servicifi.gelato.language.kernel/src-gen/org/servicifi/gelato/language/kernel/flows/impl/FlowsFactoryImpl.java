/**
 */
package org.servicifi.gelato.language.kernel.flows.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowsFactoryImpl extends EFactoryImpl implements FlowsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlowsFactory init() {
		try {
			FlowsFactory theFlowsFactory = (FlowsFactory)EPackage.Registry.INSTANCE.getEFactory(FlowsPackage.eNS_URI);
			if (theFlowsFactory != null) {
				return theFlowsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlowsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FlowsPackage.REGULAR_FLOW: return createRegularFlow();
			case FlowsPackage.PROCEDURE_FLOW: return createProcedureFlow();
			case FlowsPackage.SUMMARY_FLOW: return createSummaryFlow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularFlow createRegularFlow() {
		RegularFlowImpl regularFlow = new RegularFlowImpl();
		return regularFlow;
	}
	
	public RegularFlow createRegularFlow(LabellableElement from, LabellableElement to) {
		RegularFlowImpl regularFlow = new RegularFlowImpl(from, to);
		return regularFlow;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFlow createProcedureFlow() {
		ProcedureFlowImpl procedureFlow = new ProcedureFlowImpl();
		return procedureFlow;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryFlow createSummaryFlow() {
		SummaryFlowImpl summaryFlow = new SummaryFlowImpl();
		return summaryFlow;
	}
	
	public SummaryFlow createSummaryFlow(LabellableElement from, LabellableElement to) {
		SummaryFlowImpl summaryFlow = new SummaryFlowImpl(from, to);
		return summaryFlow;
	}

	public ProcedureFlow createProcedureFlow(LabellableElement from, LabellableElement to) {
		ProcedureFlowImpl procedureFlow = new ProcedureFlowImpl(from, to);
		return procedureFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowsPackage getFlowsPackage() {
		return (FlowsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlowsPackage getPackage() {
		return FlowsPackage.eINSTANCE;
	}


} //FlowsFactoryImpl