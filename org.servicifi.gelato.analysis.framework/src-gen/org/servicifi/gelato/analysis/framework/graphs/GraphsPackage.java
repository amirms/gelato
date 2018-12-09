/**
 */
package org.servicifi.gelato.analysis.framework.graphs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.analysis.framework.graphs.GraphsFactory
 * @model kind="package"
 * @generated
 */
public interface GraphsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/analysis/framework/graphs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphsPackage eINSTANCE = org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getFlow()
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
	 * The operation id for the '<em>Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW___REVERSE = 0;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.RegularFlowImpl <em>Regular Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.RegularFlowImpl
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getRegularFlow()
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
	 * The operation id for the '<em>Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FLOW___REVERSE = FLOW___REVERSE;

	/**
	 * The number of operations of the '<em>Regular Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.ProcedureFlowImpl <em>Procedure Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.ProcedureFlowImpl
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getProcedureFlow()
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
	 * The operation id for the '<em>Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FLOW___REVERSE = FLOW___REVERSE;

	/**
	 * The number of operations of the '<em>Procedure Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.NodeImpl
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREDECESSORS = 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUCCESSORS = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.SummaryFlowImpl <em>Summary Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.SummaryFlowImpl
	 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getSummaryFlow()
	 * @generated
	 */
	int SUMMARY_FLOW = 4;

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
	 * The operation id for the '<em>Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FLOW___REVERSE = FLOW___REVERSE;

	/**
	 * The number of operations of the '<em>Summary Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.graphs.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.analysis.framework.graphs.Flow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Flow#getTo()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_To();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.analysis.framework.graphs.Flow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Flow#getFrom()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_From();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.graphs.Flow#reverse() <em>Reverse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reverse</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Flow#reverse()
	 * @generated
	 */
	EOperation getFlow__Reverse();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.graphs.RegularFlow <em>Regular Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Flow</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.RegularFlow
	 * @generated
	 */
	EClass getRegularFlow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.graphs.ProcedureFlow <em>Procedure Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Flow</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.ProcedureFlow
	 * @generated
	 */
	EClass getProcedureFlow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.graphs.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.analysis.framework.graphs.Node#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Node#getPredecessors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Predecessors();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.analysis.framework.graphs.Node#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.Node#getSuccessors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Successors();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.graphs.SummaryFlow <em>Summary Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Flow</em>'.
	 * @see org.servicifi.gelato.analysis.framework.graphs.SummaryFlow
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
	GraphsFactory getGraphsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getFlow()
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
		 * The meta object literal for the '<em><b>Reverse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOW___REVERSE = eINSTANCE.getFlow__Reverse();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.RegularFlowImpl <em>Regular Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.RegularFlowImpl
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getRegularFlow()
		 * @generated
		 */
		EClass REGULAR_FLOW = eINSTANCE.getRegularFlow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.ProcedureFlowImpl <em>Procedure Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.ProcedureFlowImpl
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getProcedureFlow()
		 * @generated
		 */
		EClass PROCEDURE_FLOW = eINSTANCE.getProcedureFlow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.NodeImpl
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PREDECESSORS = eINSTANCE.getNode_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUCCESSORS = eINSTANCE.getNode_Successors();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.graphs.impl.SummaryFlowImpl <em>Summary Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.SummaryFlowImpl
		 * @see org.servicifi.gelato.analysis.framework.graphs.impl.GraphsPackageImpl#getSummaryFlow()
		 * @generated
		 */
		EClass SUMMARY_FLOW = eINSTANCE.getSummaryFlow();

	}

} //GraphsPackage
