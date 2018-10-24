/**
 */
package org.servicifi.gelato.language.cobol.verbs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.servicifi.gelato.language.cobol.verbs.VerbsFactory
 * @model kind="package"
 * @generated
 */
public interface VerbsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verbs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/verbs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "verbs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerbsPackage eINSTANCE = org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.verbs.impl.VerbImpl <em>Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbImpl
	 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl#getVerb()
	 * @generated
	 */
	int VERB = 1;

	/**
	 * The number of structural features of the '<em>Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.verbs.impl.IsImpl <em>Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.verbs.impl.IsImpl
	 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl#getIs()
	 * @generated
	 */
	int IS = 0;

	/**
	 * The number of structural features of the '<em>Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FEATURE_COUNT = VERB_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.verbs.Is <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.verbs.Is
	 * @generated
	 */
	EClass getIs();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.verbs.Verb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb</em>'.
	 * @see org.servicifi.gelato.language.cobol.verbs.Verb
	 * @generated
	 */
	EClass getVerb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerbsFactory getVerbsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.verbs.impl.IsImpl <em>Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.verbs.impl.IsImpl
		 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl#getIs()
		 * @generated
		 */
		EClass IS = eINSTANCE.getIs();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.verbs.impl.VerbImpl <em>Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbImpl
		 * @see org.servicifi.gelato.language.cobol.verbs.impl.VerbsPackageImpl#getVerb()
		 * @generated
		 */
		EClass VERB = eINSTANCE.getVerb();

	}

} //VerbsPackage
