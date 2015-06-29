/**
 */
package org.servicifi.gelato.language.cobol.declaratives;

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
 * @see org.servicifi.gelato.language.cobol.declaratives.DeclarativesFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarativesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declaratives";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/declaratives";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declaratives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarativesPackage eINSTANCE = org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesImpl <em>Declaratives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesImpl
	 * @see org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesPackageImpl#getDeclaratives()
	 * @generated
	 */
	int DECLARATIVES = 0;

	/**
	 * The feature id for the '<em><b>Declarative Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVES__DECLARATIVE_SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Declaratives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVES_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.declaratives.Declaratives <em>Declaratives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaratives</em>'.
	 * @see org.servicifi.gelato.language.cobol.declaratives.Declaratives
	 * @generated
	 */
	EClass getDeclaratives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.declaratives.Declaratives#getDeclarativeSections <em>Declarative Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Sections</em>'.
	 * @see org.servicifi.gelato.language.cobol.declaratives.Declaratives#getDeclarativeSections()
	 * @see #getDeclaratives()
	 * @generated
	 */
	EReference getDeclaratives_DeclarativeSections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarativesFactory getDeclarativesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesImpl <em>Declaratives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesImpl
		 * @see org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesPackageImpl#getDeclaratives()
		 * @generated
		 */
		EClass DECLARATIVES = eINSTANCE.getDeclaratives();

		/**
		 * The meta object literal for the '<em><b>Declarative Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVES__DECLARATIVE_SECTIONS = eINSTANCE.getDeclaratives_DeclarativeSections();

	}

} //DeclarativesPackage
