/**
 */
package org.servicifi.gelato.language.kernel.procedures;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.kernel.commons.CommonsPackage;

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
 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresFactory
 * @generated
 */
public interface ProceduresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "procedures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/procedures";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "procedures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProceduresPackage eINSTANCE = org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl
	 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MEMBERS = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETERS = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Callers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CALLERS = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__START = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__END = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl <em>Main Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl
	 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl#getMainProcedure()
	 * @generated
	 */
	int MAIN_PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROCEDURE__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROCEDURE__MEMBERS = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROCEDURE__START = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROCEDURE__END = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Main Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROCEDURE_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.procedures.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure#getMembers()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure#getParameters()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getCallers <em>Callers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Callers</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure#getCallers()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Callers();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure#getStart()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.Procedure#getEnd()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_End();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure <em>Main Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Procedure</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.MainProcedure
	 * @generated
	 */
	EClass getMainProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.MainProcedure#getMembers()
	 * @see #getMainProcedure()
	 * @generated
	 */
	EReference getMainProcedure_Members();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.MainProcedure#getStart()
	 * @see #getMainProcedure()
	 * @generated
	 */
	EReference getMainProcedure_Start();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.servicifi.gelato.language.kernel.procedures.MainProcedure#getEnd()
	 * @see #getMainProcedure()
	 * @generated
	 */
	EReference getMainProcedure_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProceduresFactory getProceduresFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl
		 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__MEMBERS = eINSTANCE.getProcedure_Members();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARAMETERS = eINSTANCE.getProcedure_Parameters();

		/**
		 * The meta object literal for the '<em><b>Callers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__CALLERS = eINSTANCE.getProcedure_Callers();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__START = eINSTANCE.getProcedure_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__END = eINSTANCE.getProcedure_End();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl <em>Main Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl
		 * @see org.servicifi.gelato.language.kernel.procedures.impl.ProceduresPackageImpl#getMainProcedure()
		 * @generated
		 */
		EClass MAIN_PROCEDURE = eINSTANCE.getMainProcedure();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROCEDURE__MEMBERS = eINSTANCE.getMainProcedure_Members();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROCEDURE__START = eINSTANCE.getMainProcedure_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROCEDURE__END = eINSTANCE.getMainProcedure_End();

	}

} //ProceduresPackage
