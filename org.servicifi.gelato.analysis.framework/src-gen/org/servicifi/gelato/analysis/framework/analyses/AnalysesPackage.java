/**
 */
package org.servicifi.gelato.analysis.framework.analyses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analyses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/analysis/framework/analyses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "analyses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysesPackage eINSTANCE = org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CFG = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Exit Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__EXIT_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Entry Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ENTRY_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___ENTRY__LABELLABLEELEMENT_INT = 0;

	/**
	 * The operation id for the '<em>Exit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___EXIT__LABELLABLEELEMENT_INT = 1;

	/**
	 * The operation id for the '<em>Perform Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___PERFORM_ANALYSIS = 2;

	/**
	 * The operation id for the '<em>Get All Nodes With Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS = 3;

	/**
	 * The operation id for the '<em>Meet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___MEET__ELIST = 4;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 3;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisResultImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisResult()
	 * @generated
	 */
	int ANALYSIS_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT__LABEL = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl <em>Exit Entry Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getExitEntryPair()
	 * @generated
	 */
	int EXIT_ENTRY_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ENTRY_PAIR__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ENTRY_PAIR__EXIT = 1;

	/**
	 * The number of structural features of the '<em>Exit Entry Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ENTRY_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exit Entry Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ENTRY_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.IteratorElementImpl <em>Iterator Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.IteratorElementImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getIteratorElement()
	 * @generated
	 */
	int ITERATOR_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_ELEMENT__ITERATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_ELEMENT__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Iterator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Iterator Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl <em>Analysis Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisConfiguration()
	 * @generated
	 */
	int ANALYSIS_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONFIGURATION__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONFIGURATION__ANALYSIS_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Analysis Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Analysis Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.IntraproceduralAnalysisImpl <em>Intraprocedural Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.IntraproceduralAnalysisImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getIntraproceduralAnalysis()
	 * @generated
	 */
	int INTRAPROCEDURAL_ANALYSIS = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__DIRECTION = ANALYSIS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__CFG = ANALYSIS__CFG;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__RESULT = ANALYSIS__RESULT;

	/**
	 * The feature id for the '<em><b>Exit Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__EXIT_TABLE = ANALYSIS__EXIT_TABLE;

	/**
	 * The feature id for the '<em><b>Entry Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__ENTRY_TABLE = ANALYSIS__ENTRY_TABLE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS__CONFIGURATION = ANALYSIS__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Intraprocedural Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS___ENTRY__LABELLABLEELEMENT_INT = ANALYSIS___ENTRY__LABELLABLEELEMENT_INT;

	/**
	 * The operation id for the '<em>Exit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS___EXIT__LABELLABLEELEMENT_INT = ANALYSIS___EXIT__LABELLABLEELEMENT_INT;

	/**
	 * The operation id for the '<em>Perform Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS___PERFORM_ANALYSIS = ANALYSIS___PERFORM_ANALYSIS;

	/**
	 * The operation id for the '<em>Get All Nodes With Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS = ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS;

	/**
	 * The operation id for the '<em>Meet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS___MEET__ELIST = ANALYSIS___MEET__ELIST;

	/**
	 * The number of operations of the '<em>Intraprocedural Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRAPROCEDURAL_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.InterproceduralAnalysisImpl <em>Interprocedural Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.InterproceduralAnalysisImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getInterproceduralAnalysis()
	 * @generated
	 */
	int INTERPROCEDURAL_ANALYSIS = 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__DIRECTION = ANALYSIS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__CFG = ANALYSIS__CFG;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__RESULT = ANALYSIS__RESULT;

	/**
	 * The feature id for the '<em><b>Exit Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__EXIT_TABLE = ANALYSIS__EXIT_TABLE;

	/**
	 * The feature id for the '<em><b>Entry Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__ENTRY_TABLE = ANALYSIS__ENTRY_TABLE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS__CONFIGURATION = ANALYSIS__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Interprocedural Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS___ENTRY__LABELLABLEELEMENT_INT = ANALYSIS___ENTRY__LABELLABLEELEMENT_INT;

	/**
	 * The operation id for the '<em>Exit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS___EXIT__LABELLABLEELEMENT_INT = ANALYSIS___EXIT__LABELLABLEELEMENT_INT;

	/**
	 * The operation id for the '<em>Perform Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS___PERFORM_ANALYSIS = ANALYSIS___PERFORM_ANALYSIS;

	/**
	 * The operation id for the '<em>Get All Nodes With Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS = ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS;

	/**
	 * The operation id for the '<em>Meet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS___MEET__ELIST = ANALYSIS___MEET__ELIST;

	/**
	 * The number of operations of the '<em>Interprocedural Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCEDURAL_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisConfigurationImpl <em>Reaching Definitions Analysis Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisConfigurationImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysisConfiguration()
	 * @generated
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__DIRECTION = ANALYSIS_CONFIGURATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ANALYSIS_TYPE = ANALYSIS_CONFIGURATION__ANALYSIS_TYPE;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS = ANALYSIS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reaching Definitions Analysis Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION_FEATURE_COUNT = ANALYSIS_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reaching Definitions Analysis Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION_OPERATION_COUNT = ANALYSIS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisResultImpl <em>Reaching Definitions Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisResultImpl
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysisResult()
	 * @generated
	 */
	int REACHING_DEFINITIONS_ANALYSIS_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_RESULT__LABEL = ANALYSIS_RESULT__LABEL;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE = ANALYSIS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reaching Definitions Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_RESULT_FEATURE_COUNT = ANALYSIS_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reaching Definitions Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_RESULT_OPERATION_COUNT = ANALYSIS_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection <em>Analysis Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisDirection()
	 * @generated
	 */
	int ANALYSIS_DIRECTION = 10;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisType <em>Analysis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisType
	 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisType()
	 * @generated
	 */
	int ANALYSIS_TYPE = 11;

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getDirection()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Direction();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cfg</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getCfg()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getResult()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getExitTable <em>Exit Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Table</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getExitTable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_ExitTable();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getEntryTable <em>Entry Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Table</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getEntryTable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_EntryTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getConfiguration()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Configuration();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#entry(org.servicifi.gelato.analysis.framework.commons.LabellableElement, int) <em>Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entry</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#entry(org.servicifi.gelato.analysis.framework.commons.LabellableElement, int)
	 * @generated
	 */
	EOperation getAnalysis__Entry__LabellableElement_int();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#exit(org.servicifi.gelato.analysis.framework.commons.LabellableElement, int) <em>Exit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#exit(org.servicifi.gelato.analysis.framework.commons.LabellableElement, int)
	 * @generated
	 */
	EOperation getAnalysis__Exit__LabellableElement_int();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#performAnalysis() <em>Perform Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Analysis</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#performAnalysis()
	 * @generated
	 */
	EOperation getAnalysis__PerformAnalysis();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#getAllNodesWithDirection(org.servicifi.gelato.analysis.framework.commons.LabellableElement, org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection, org.eclipse.emf.ecore.EClass) <em>Get All Nodes With Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Nodes With Direction</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#getAllNodesWithDirection(org.servicifi.gelato.analysis.framework.commons.LabellableElement, org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getAnalysis__GetAllNodesWithDirection__LabellableElement_AnalysisDirection_EClass();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.analyses.Analysis#meet(org.eclipse.emf.common.util.EList) <em>Meet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Meet</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.analyses.Analysis#meet(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAnalysis__Meet__EList();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisResult
	 * @generated
	 */
	EClass getAnalysisResult();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisResult#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisResult#getLabel()
	 * @see #getAnalysisResult()
	 * @generated
	 */
	EAttribute getAnalysisResult_Label();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair <em>Exit Entry Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Entry Pair</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair
	 * @generated
	 */
	EClass getExitEntryPair();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getEntry()
	 * @see #getExitEntryPair()
	 * @generated
	 */
	EReference getExitEntryPair_Entry();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair#getExit()
	 * @see #getExitEntryPair()
	 * @generated
	 */
	EReference getExitEntryPair_Exit();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="Comparable"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.IteratorElement <em>Iterator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Element</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.IteratorElement
	 * @generated
	 */
	EClass getIteratorElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.IteratorElement#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.IteratorElement#getIteration()
	 * @see #getIteratorElement()
	 * @generated
	 */
	EAttribute getIteratorElement_Iteration();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.analysis.framework.analyses.IteratorElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.IteratorElement#getElement()
	 * @see #getIteratorElement()
	 * @generated
	 */
	EReference getIteratorElement_Element();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration <em>Analysis Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Configuration</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration
	 * @generated
	 */
	EClass getAnalysisConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getDirection()
	 * @see #getAnalysisConfiguration()
	 * @generated
	 */
	EAttribute getAnalysisConfiguration_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getAnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Type</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration#getAnalysisType()
	 * @see #getAnalysisConfiguration()
	 * @generated
	 */
	EAttribute getAnalysisConfiguration_AnalysisType();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis <em>Intraprocedural Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intraprocedural Analysis</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis
	 * @generated
	 */
	EClass getIntraproceduralAnalysis();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis <em>Interprocedural Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interprocedural Analysis</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis
	 * @generated
	 */
	EClass getInterproceduralAnalysis();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration <em>Reaching Definitions Analysis Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaching Definitions Analysis Configuration</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration
	 * @generated
	 */
	EClass getReachingDefinitionsAnalysisConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignments</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration#getAssignments()
	 * @see #getReachingDefinitionsAnalysisConfiguration()
	 * @generated
	 */
	EAttribute getReachingDefinitionsAnalysisConfiguration_Assignments();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult <em>Reaching Definitions Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaching Definitions Analysis Result</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult
	 * @generated
	 */
	EClass getReachingDefinitionsAnalysisResult();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult#getVariable()
	 * @see #getReachingDefinitionsAnalysisResult()
	 * @generated
	 */
	EReference getReachingDefinitionsAnalysisResult_Variable();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection <em>Analysis Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Direction</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
	 * @generated
	 */
	EEnum getAnalysisDirection();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Type</em>'.
	 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisType
	 * @generated
	 */
	EEnum getAnalysisType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysesFactory getAnalysesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__DIRECTION = eINSTANCE.getAnalysis_Direction();

		/**
		 * The meta object literal for the '<em><b>Cfg</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__CFG = eINSTANCE.getAnalysis_Cfg();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__RESULT = eINSTANCE.getAnalysis_Result();

		/**
		 * The meta object literal for the '<em><b>Exit Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__EXIT_TABLE = eINSTANCE.getAnalysis_ExitTable();

		/**
		 * The meta object literal for the '<em><b>Entry Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__ENTRY_TABLE = eINSTANCE.getAnalysis_EntryTable();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__CONFIGURATION = eINSTANCE.getAnalysis_Configuration();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___ENTRY__LABELLABLEELEMENT_INT = eINSTANCE.getAnalysis__Entry__LabellableElement_int();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___EXIT__LABELLABLEELEMENT_INT = eINSTANCE.getAnalysis__Exit__LabellableElement_int();

		/**
		 * The meta object literal for the '<em><b>Perform Analysis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___PERFORM_ANALYSIS = eINSTANCE.getAnalysis__PerformAnalysis();

		/**
		 * The meta object literal for the '<em><b>Get All Nodes With Direction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS = eINSTANCE.getAnalysis__GetAllNodesWithDirection__LabellableElement_AnalysisDirection_EClass();

		/**
		 * The meta object literal for the '<em><b>Meet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___MEET__ELIST = eINSTANCE.getAnalysis__Meet__EList();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisResultImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisResult()
		 * @generated
		 */
		EClass ANALYSIS_RESULT = eINSTANCE.getAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_RESULT__LABEL = eINSTANCE.getAnalysisResult_Label();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl <em>Exit Entry Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getExitEntryPair()
		 * @generated
		 */
		EClass EXIT_ENTRY_PAIR = eINSTANCE.getExitEntryPair();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_ENTRY_PAIR__ENTRY = eINSTANCE.getExitEntryPair_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_ENTRY_PAIR__EXIT = eINSTANCE.getExitEntryPair_Exit();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.IteratorElementImpl <em>Iterator Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.IteratorElementImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getIteratorElement()
		 * @generated
		 */
		EClass ITERATOR_ELEMENT = eINSTANCE.getIteratorElement();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_ELEMENT__ITERATION = eINSTANCE.getIteratorElement_Iteration();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_ELEMENT__ELEMENT = eINSTANCE.getIteratorElement_Element();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl <em>Analysis Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisConfiguration()
		 * @generated
		 */
		EClass ANALYSIS_CONFIGURATION = eINSTANCE.getAnalysisConfiguration();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONFIGURATION__DIRECTION = eINSTANCE.getAnalysisConfiguration_Direction();

		/**
		 * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_CONFIGURATION__ANALYSIS_TYPE = eINSTANCE.getAnalysisConfiguration_AnalysisType();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.IntraproceduralAnalysisImpl <em>Intraprocedural Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.IntraproceduralAnalysisImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getIntraproceduralAnalysis()
		 * @generated
		 */
		EClass INTRAPROCEDURAL_ANALYSIS = eINSTANCE.getIntraproceduralAnalysis();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.InterproceduralAnalysisImpl <em>Interprocedural Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.InterproceduralAnalysisImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getInterproceduralAnalysis()
		 * @generated
		 */
		EClass INTERPROCEDURAL_ANALYSIS = eINSTANCE.getInterproceduralAnalysis();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisConfigurationImpl <em>Reaching Definitions Analysis Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisConfigurationImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysisConfiguration()
		 * @generated
		 */
		EClass REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION = eINSTANCE.getReachingDefinitionsAnalysisConfiguration();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION__ASSIGNMENTS = eINSTANCE.getReachingDefinitionsAnalysisConfiguration_Assignments();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisResultImpl <em>Reaching Definitions Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.ReachingDefinitionsAnalysisResultImpl
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysisResult()
		 * @generated
		 */
		EClass REACHING_DEFINITIONS_ANALYSIS_RESULT = eINSTANCE.getReachingDefinitionsAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHING_DEFINITIONS_ANALYSIS_RESULT__VARIABLE = eINSTANCE.getReachingDefinitionsAnalysisResult_Variable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection <em>Analysis Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisDirection()
		 * @generated
		 */
		EEnum ANALYSIS_DIRECTION = eINSTANCE.getAnalysisDirection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.analyses.AnalysisType <em>Analysis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.analyses.AnalysisType
		 * @see org.servicifi.gelato.analysis.framework.analyses.impl.AnalysesPackageImpl#getAnalysisType()
		 * @generated
		 */
		EEnum ANALYSIS_TYPE = eINSTANCE.getAnalysisType();

	}

} //AnalysesPackage
