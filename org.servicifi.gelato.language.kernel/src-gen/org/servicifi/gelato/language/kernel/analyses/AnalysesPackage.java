/**
 */
package org.servicifi.gelato.language.kernel.analyses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.servicifi.gelato.language.kernel.analyses.AnalysesFactory
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
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/analyses";

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
	AnalysesPackage eINSTANCE = org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysis()
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
	 * The feature id for the '<em><b>Cfg</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ANALYSIS_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsAnalysisImpl <em>Reaching Definitions Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsAnalysisImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysis()
	 * @generated
	 */
	int REACHING_DEFINITIONS_ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__DIRECTION = ANALYSIS__DIRECTION;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__CFG = ANALYSIS__CFG;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__RESULT = ANALYSIS__RESULT;

	/**
	 * The feature id for the '<em><b>Exit Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__EXIT_TABLE = ANALYSIS__EXIT_TABLE;

	/**
	 * The feature id for the '<em><b>Entry Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__ENTRY_TABLE = ANALYSIS__ENTRY_TABLE;

	/**
	 * The feature id for the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__ANALYSIS_TYPE = ANALYSIS__ANALYSIS_TYPE;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reaching Definitions Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Comparable <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Comparable
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 5;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysisResultImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisResult()
	 * @generated
	 */
	int ANALYSIS_RESULT = 2;

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
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsResultImpl <em>Reaching Definitions Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsResultImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsResult()
	 * @generated
	 */
	int REACHING_DEFINITIONS_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_RESULT__LABEL = ANALYSIS_RESULT__LABEL;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_RESULT__VARIABLE = ANALYSIS_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reaching Definitions Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHING_DEFINITIONS_RESULT_FEATURE_COUNT = ANALYSIS_RESULT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ExitEntryPairImpl <em>Exit Entry Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.ExitEntryPairImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getExitEntryPair()
	 * @generated
	 */
	int EXIT_ENTRY_PAIR = 4;

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
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.IteratorElementImpl <em>Iterator Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.IteratorElementImpl
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getIteratorElement()
	 * @generated
	 */
	int ITERATOR_ELEMENT = 6;

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
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisDirection <em>Analysis Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisDirection
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisDirection()
	 * @generated
	 */
	int ANALYSIS_DIRECTION = 7;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisType <em>Analysis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisType
	 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisType()
	 * @generated
	 */
	int ANALYSIS_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getDirection()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfg</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getCfg()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getResult()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getExitTable <em>Exit Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Table</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getExitTable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_ExitTable();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getEntryTable <em>Entry Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Table</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getEntryTable()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_EntryTable();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.Analysis#getAnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Type</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.Analysis#getAnalysisType()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_AnalysisType();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis <em>Reaching Definitions Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaching Definitions Analysis</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis
	 * @generated
	 */
	EClass getReachingDefinitionsAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignments</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsAnalysis#getAssignments()
	 * @see #getReachingDefinitionsAnalysis()
	 * @generated
	 */
	EAttribute getReachingDefinitionsAnalysis_Assignments();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisResult
	 * @generated
	 */
	EClass getAnalysisResult();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisResult#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisResult#getLabel()
	 * @see #getAnalysisResult()
	 * @generated
	 */
	EAttribute getAnalysisResult_Label();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult <em>Reaching Definitions Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaching Definitions Result</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult
	 * @generated
	 */
	EClass getReachingDefinitionsResult();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ReachingDefinitionsResult#getVariable()
	 * @see #getReachingDefinitionsResult()
	 * @generated
	 */
	EReference getReachingDefinitionsResult_Variable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.ExitEntryPair <em>Exit Entry Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Entry Pair</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ExitEntryPair
	 * @generated
	 */
	EClass getExitEntryPair();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.kernel.analyses.ExitEntryPair#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ExitEntryPair#getEntry()
	 * @see #getExitEntryPair()
	 * @generated
	 */
	EReference getExitEntryPair_Entry();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.kernel.analyses.ExitEntryPair#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.ExitEntryPair#getExit()
	 * @see #getExitEntryPair()
	 * @generated
	 */
	EReference getExitEntryPair_Exit();

	/**
	 * Returns the meta object for class '{@link Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see Comparable
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement <em>Iterator Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Element</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.IteratorElement
	 * @generated
	 */
	EClass getIteratorElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.IteratorElement#getIteration()
	 * @see #getIteratorElement()
	 * @generated
	 */
	EAttribute getIteratorElement_Iteration();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.analyses.IteratorElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.IteratorElement#getElement()
	 * @see #getIteratorElement()
	 * @generated
	 */
	EReference getIteratorElement_Element();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisDirection <em>Analysis Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Direction</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisDirection
	 * @generated
	 */
	EEnum getAnalysisDirection();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Type</em>'.
	 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisType
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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysis()
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
		 * The meta object literal for the '<em><b>Cfg</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Analysis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__ANALYSIS_TYPE = eINSTANCE.getAnalysis_AnalysisType();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsAnalysisImpl <em>Reaching Definitions Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsAnalysisImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsAnalysis()
		 * @generated
		 */
		EClass REACHING_DEFINITIONS_ANALYSIS = eINSTANCE.getReachingDefinitionsAnalysis();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACHING_DEFINITIONS_ANALYSIS__ASSIGNMENTS = eINSTANCE.getReachingDefinitionsAnalysis_Assignments();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysisResultImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisResult()
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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsResultImpl <em>Reaching Definitions Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.ReachingDefinitionsResultImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getReachingDefinitionsResult()
		 * @generated
		 */
		EClass REACHING_DEFINITIONS_RESULT = eINSTANCE.getReachingDefinitionsResult();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHING_DEFINITIONS_RESULT__VARIABLE = eINSTANCE.getReachingDefinitionsResult_Variable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.ExitEntryPairImpl <em>Exit Entry Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.ExitEntryPairImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getExitEntryPair()
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
		 * The meta object literal for the '{@link Comparable <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Comparable
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.impl.IteratorElementImpl <em>Iterator Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.IteratorElementImpl
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getIteratorElement()
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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisDirection <em>Analysis Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisDirection
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisDirection()
		 * @generated
		 */
		EEnum ANALYSIS_DIRECTION = eINSTANCE.getAnalysisDirection();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.analyses.AnalysisType <em>Analysis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.analyses.AnalysisType
		 * @see org.servicifi.gelato.language.kernel.analyses.impl.AnalysesPackageImpl#getAnalysisType()
		 * @generated
		 */
		EEnum ANALYSIS_TYPE = eINSTANCE.getAnalysisType();

	}

} //AnalysesPackage
