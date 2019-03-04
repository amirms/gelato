/**
 */
package org.servicifi.gelato.language.kernel.references;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.servicifi.gelato.language.kernel.references.ReferencesFactory
 * @generated
 */
public interface ReferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "references";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/references";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "references";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesPackage eINSTANCE = org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferenceableElementImpl
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getReferenceableElement()
	 * @generated
	 */
	int REFERENCEABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Referenceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.references.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferenceImpl
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl
	 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TARGET = ELEMENT_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.references.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see org.servicifi.gelato.language.kernel.references.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.kernel.references.ElementReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.servicifi.gelato.language.kernel.references.ElementReference#getTarget()
	 * @see #getElementReference()
	 * @generated
	 */
	EReference getElementReference_Target();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenceable Element</em>'.
	 * @see org.servicifi.gelato.language.kernel.references.ReferenceableElement
	 * @generated
	 */
	EClass getReferenceableElement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.references.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.servicifi.gelato.language.kernel.references.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.references.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.servicifi.gelato.language.kernel.references.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferencesFactory getReferencesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE__TARGET = eINSTANCE.getElementReference_Target();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferenceableElementImpl
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getReferenceableElement()
		 * @generated
		 */
		EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.references.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferenceImpl
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl
		 * @see org.servicifi.gelato.language.kernel.references.impl.ReferencesPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

	}

} //ReferencesPackage
