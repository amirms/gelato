/**
 */
package org.servicifi.gelato.language.kernel.flows;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.flows.FlowsFactory
 * @generated
 */
public interface FlowsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flows";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/flows";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flows";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowsPackage eINSTANCE = org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.flows.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowImpl
	 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FROM = 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.flows.impl.RegularFlowImpl <em>Regular Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.flows.impl.RegularFlowImpl
	 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getRegularFlow()
	 * @generated
	 */
	int REGULAR_FLOW = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FLOW__TO = FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FLOW__FROM = FLOW__FROM;

	/**
	 * The number of structural features of the '<em>Regular Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.flows.impl.ProcedureFlowImpl <em>Procedure Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.flows.impl.ProcedureFlowImpl
	 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getProcedureFlow()
	 * @generated
	 */
	int PROCEDURE_FLOW = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FLOW__TO = FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FLOW__FROM = FLOW__FROM;

	/**
	 * The number of structural features of the '<em>Procedure Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.flows.impl.SummaryFlowImpl <em>Summary Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.flows.impl.SummaryFlowImpl
	 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getSummaryFlow()
	 * @generated
	 */
	int SUMMARY_FLOW = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FLOW__TO = FLOW__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FLOW__FROM = FLOW__FROM;

	/**
	 * The number of structural features of the '<em>Summary Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.flows.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.flows.Flow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.Flow#getTo()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_To();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.flows.Flow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.Flow#getFrom()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_From();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.flows.RegularFlow <em>Regular Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Flow</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.RegularFlow
	 * @generated
	 */
	EClass getRegularFlow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.flows.ProcedureFlow <em>Procedure Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Flow</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.ProcedureFlow
	 * @generated
	 */
	EClass getProcedureFlow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.flows.SummaryFlow <em>Summary Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Flow</em>'.
	 * @see org.servicifi.gelato.language.kernel.flows.SummaryFlow
	 * @generated
	 */
	EClass getSummaryFlow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowsFactory getFlowsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.flows.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowImpl
		 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TO = eINSTANCE.getFlow_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FROM = eINSTANCE.getFlow_From();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.flows.impl.RegularFlowImpl <em>Regular Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.flows.impl.RegularFlowImpl
		 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getRegularFlow()
		 * @generated
		 */
		EClass REGULAR_FLOW = eINSTANCE.getRegularFlow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.flows.impl.ProcedureFlowImpl <em>Procedure Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.flows.impl.ProcedureFlowImpl
		 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getProcedureFlow()
		 * @generated
		 */
		EClass PROCEDURE_FLOW = eINSTANCE.getProcedureFlow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.flows.impl.SummaryFlowImpl <em>Summary Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.flows.impl.SummaryFlowImpl
		 * @see org.servicifi.gelato.language.kernel.flows.impl.FlowsPackageImpl#getSummaryFlow()
		 * @generated
		 */
		EClass SUMMARY_FLOW = eINSTANCE.getSummaryFlow();

	}

} //FlowsPackage
