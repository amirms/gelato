/**
 */
package org.servicifi.gelato.language.cobol.labels;

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
 * @see org.servicifi.gelato.language.cobol.labels.LabelsFactory
 * @model kind="package"
 * @generated
 */
public interface LabelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/labels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "labels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelsPackage eINSTANCE = org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 5;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeLabelImpl <em>Procedure Range Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeLabelImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRangeLabel()
	 * @generated
	 */
	int PROCEDURE_RANGE_LABEL = 1;

	/**
	 * The number of structural features of the '<em>Procedure Range Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl <em>Procedure Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRange()
	 * @generated
	 */
	int PROCEDURE_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE__CHILDREN = PROCEDURE_RANGE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Through Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE__THROUGH_OPERATOR = PROCEDURE_RANGE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE_FEATURE_COUNT = PROCEDURE_RANGE_LABEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeChildImpl <em>Procedure Range Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeChildImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRangeChild()
	 * @generated
	 */
	int PROCEDURE_RANGE_CHILD = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE_CHILD__TARGET = PROCEDURE_RANGE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Procedure Range Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_RANGE_CHILD_FEATURE_COUNT = PROCEDURE_RANGE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureLabelImpl <em>Procedure Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureLabelImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureLabel()
	 * @generated
	 */
	int PROCEDURE_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_LABEL__TARGET = PROCEDURE_RANGE_CHILD__TARGET;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_LABEL__SECTION = PROCEDURE_RANGE_CHILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Procedure Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_LABEL_FEATURE_COUNT = PROCEDURE_RANGE_CHILD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 4;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.StopLabelImpl <em>Stop Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.StopLabelImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getStopLabel()
	 * @generated
	 */
	int STOP_LABEL = 6;

	/**
	 * The number of structural features of the '<em>Stop Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.labels.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.labels.impl.RunImpl
	 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 7;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = STOP_LABEL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange <em>Procedure Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Range</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRange
	 * @generated
	 */
	EClass getProcedureRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRange#getChildren()
	 * @see #getProcedureRange()
	 * @generated
	 */
	EReference getProcedureRange_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRange#getThroughOperator <em>Through Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Through Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRange#getThroughOperator()
	 * @see #getProcedureRange()
	 * @generated
	 */
	EReference getProcedureRange_ThroughOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel <em>Procedure Range Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Range Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel
	 * @generated
	 */
	EClass getProcedureRangeLabel();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild <em>Procedure Range Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Range Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild
	 * @generated
	 */
	EClass getProcedureRangeChild();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild#getTarget()
	 * @see #getProcedureRangeChild()
	 * @generated
	 */
	EReference getProcedureRangeChild_Target();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.ProcedureLabel <em>Procedure Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureLabel
	 * @generated
	 */
	EClass getProcedureLabel();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.labels.ProcedureLabel#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.ProcedureLabel#getSection()
	 * @see #getProcedureLabel()
	 * @generated
	 */
	EReference getProcedureLabel_Section();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.StopLabel <em>Stop Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.StopLabel
	 * @generated
	 */
	EClass getStopLabel();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.labels.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see org.servicifi.gelato.language.cobol.labels.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LabelsFactory getLabelsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl <em>Procedure Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRange()
		 * @generated
		 */
		EClass PROCEDURE_RANGE = eINSTANCE.getProcedureRange();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_RANGE__CHILDREN = eINSTANCE.getProcedureRange_Children();

		/**
		 * The meta object literal for the '<em><b>Through Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_RANGE__THROUGH_OPERATOR = eINSTANCE.getProcedureRange_ThroughOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeLabelImpl <em>Procedure Range Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeLabelImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRangeLabel()
		 * @generated
		 */
		EClass PROCEDURE_RANGE_LABEL = eINSTANCE.getProcedureRangeLabel();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeChildImpl <em>Procedure Range Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeChildImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureRangeChild()
		 * @generated
		 */
		EClass PROCEDURE_RANGE_CHILD = eINSTANCE.getProcedureRangeChild();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_RANGE_CHILD__TARGET = eINSTANCE.getProcedureRangeChild_Target();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureLabelImpl <em>Procedure Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureLabelImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedureLabel()
		 * @generated
		 */
		EClass PROCEDURE_LABEL = eINSTANCE.getProcedureLabel();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_LABEL__SECTION = eINSTANCE.getProcedureLabel_Section();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.ProcedureImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.StopLabelImpl <em>Stop Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.StopLabelImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getStopLabel()
		 * @generated
		 */
		EClass STOP_LABEL = eINSTANCE.getStopLabel();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.labels.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.labels.impl.RunImpl
		 * @see org.servicifi.gelato.language.cobol.labels.impl.LabelsPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

	}

} //LabelsPackage
