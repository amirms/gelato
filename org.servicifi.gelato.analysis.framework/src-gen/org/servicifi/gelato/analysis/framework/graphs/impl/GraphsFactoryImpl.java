/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.servicifi.gelato.analysis.framework.graphs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphsFactoryImpl extends EFactoryImpl implements GraphsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphsFactory init() {
		try {
			GraphsFactory theGraphsFactory = (GraphsFactory)EPackage.Registry.INSTANCE.getEFactory(GraphsPackage.eNS_URI);
			if (theGraphsFactory != null) {
				return theGraphsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsFactoryImpl() {
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
			case GraphsPackage.REGULAR_FLOW: return createRegularFlow();
			case GraphsPackage.PROCEDURE_FLOW: return createProcedureFlow();
			case GraphsPackage.SUMMARY_FLOW: return createSummaryFlow();
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
	
	public RegularFlow createRegularFlow(Node from, Node to) {
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
	

	public ProcedureFlow createProcedureFlow(Node from, Node to) {
		ProcedureFlowImpl procedureFlow = new ProcedureFlowImpl(from, to);
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
	
	@Override
	public SummaryFlow createSummaryFlow(Node from, Node to) {
		SummaryFlowImpl summaryFlow = new SummaryFlowImpl(from, to);
		return summaryFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphsPackage getGraphsPackage() {
		return (GraphsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphsPackage getPackage() {
		return GraphsPackage.eINSTANCE;
	}

} //GraphsFactoryImpl
