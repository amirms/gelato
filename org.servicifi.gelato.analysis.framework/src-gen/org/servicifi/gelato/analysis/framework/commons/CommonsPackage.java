/**
 */
package org.servicifi.gelato.analysis.framework.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;

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
 * @see org.servicifi.gelato.analysis.framework.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/analysis/framework/commons";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl <em>Labellable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getLabellableElement()
	 * @generated
	 */
	int LABELLABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT__PREDECESSORS = GraphsPackage.NODE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT__SUCCESSORS = GraphsPackage.NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT__LABEL = GraphsPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labellable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT_FEATURE_COUNT = GraphsPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT___FIRST = GraphsPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Last</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT___LAST = GraphsPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Internal Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT___INTERNAL_FLOW = GraphsPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labellable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT_OPERATION_COUNT = GraphsPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.VariableImpl
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.StartImpl
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getStart()
	 * @generated
	 */
	int START = 2;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PREDECESSORS = LABELLABLE_ELEMENT__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SUCCESSORS = LABELLABLE_ELEMENT__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LABEL = LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___FIRST = LABELLABLE_ELEMENT___FIRST;

	/**
	 * The operation id for the '<em>Last</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___LAST = LABELLABLE_ELEMENT___LAST;

	/**
	 * The operation id for the '<em>Internal Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___INTERNAL_FLOW = LABELLABLE_ELEMENT___INTERNAL_FLOW;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = LABELLABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.EndImpl
	 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getEnd()
	 * @generated
	 */
	int END = 3;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__PREDECESSORS = LABELLABLE_ELEMENT__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__SUCCESSORS = LABELLABLE_ELEMENT__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LABEL = LABELLABLE_ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>First</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___FIRST = LABELLABLE_ELEMENT___FIRST;

	/**
	 * The operation id for the '<em>Last</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___LAST = LABELLABLE_ELEMENT___LAST;

	/**
	 * The operation id for the '<em>Internal Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END___INTERNAL_FLOW = LABELLABLE_ELEMENT___INTERNAL_FLOW;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = LABELLABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement <em>Labellable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labellable Element</em>'.
	 * @see org.servicifi.gelato.analysis.framework.commons.LabellableElement
	 * @generated
	 */
	EClass getLabellableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.servicifi.gelato.analysis.framework.commons.LabellableElement#getLabel()
	 * @see #getLabellableElement()
	 * @generated
	 */
	EAttribute getLabellableElement_Label();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#first() <em>First</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>First</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.commons.LabellableElement#first()
	 * @generated
	 */
	EOperation getLabellableElement__First();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#last() <em>Last</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Last</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.commons.LabellableElement#last()
	 * @generated
	 */
	EOperation getLabellableElement__Last();

	/**
	 * Returns the meta object for the '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#internalFlow() <em>Internal Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Internal Flow</em>' operation.
	 * @see org.servicifi.gelato.analysis.framework.commons.LabellableElement#internalFlow()
	 * @generated
	 */
	EOperation getLabellableElement__InternalFlow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.commons.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.servicifi.gelato.analysis.framework.commons.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.commons.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.servicifi.gelato.analysis.framework.commons.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.analysis.framework.commons.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.servicifi.gelato.analysis.framework.commons.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl <em>Labellable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getLabellableElement()
		 * @generated
		 */
		EClass LABELLABLE_ELEMENT = eINSTANCE.getLabellableElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELLABLE_ELEMENT__LABEL = eINSTANCE.getLabellableElement_Label();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELLABLE_ELEMENT___FIRST = eINSTANCE.getLabellableElement__First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELLABLE_ELEMENT___LAST = eINSTANCE.getLabellableElement__Last();

		/**
		 * The meta object literal for the '<em><b>Internal Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABELLABLE_ELEMENT___INTERNAL_FLOW = eINSTANCE.getLabellableElement__InternalFlow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.VariableImpl
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.StartImpl
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.analysis.framework.commons.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.EndImpl
		 * @see org.servicifi.gelato.analysis.framework.commons.impl.CommonsPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

	}

} //CommonsPackage
