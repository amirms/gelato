/**
 */
package org.servicifi.gelato.language.cobol.commons;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.servicifi.gelato.language.cobol.commons.CommonsFactory
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
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/commons";

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
	CommonsPackage eINSTANCE = org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.commons.impl.CommentableImpl <em>Commentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.commons.impl.CommentableImpl
	 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getCommentable()
	 * @generated
	 */
	int COMMENTABLE = 1;

	/**
	 * The number of structural features of the '<em>Commentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl
	 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.commons.impl.LabellableElementImpl <em>Labellable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.commons.impl.LabellableElementImpl
	 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getLabellableElement()
	 * @generated
	 */
	int LABELLABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT__LABEL = COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labellable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLABLE_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.commons.impl.URIableElementImpl <em>UR Iable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.commons.impl.URIableElementImpl
	 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getURIableElement()
	 * @generated
	 */
	int UR_IABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IABLE_ELEMENT__URI = COMMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UR Iable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_IABLE_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.commons.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.Commentable
	 * @generated
	 */
	EClass getCommentable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.commons.LabellableElement <em>Labellable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labellable Element</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.LabellableElement
	 * @generated
	 */
	EClass getLabellableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.commons.LabellableElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.LabellableElement#getLabel()
	 * @see #getLabellableElement()
	 * @generated
	 */
	EAttribute getLabellableElement_Label();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.commons.URIableElement <em>UR Iable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Iable Element</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.URIableElement
	 * @generated
	 */
	EClass getURIableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.commons.URIableElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.servicifi.gelato.language.cobol.commons.URIableElement#getUri()
	 * @see #getURIableElement()
	 * @generated
	 */
	EAttribute getURIableElement_Uri();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl
		 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.commons.impl.CommentableImpl <em>Commentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.commons.impl.CommentableImpl
		 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getCommentable()
		 * @generated
		 */
		EClass COMMENTABLE = eINSTANCE.getCommentable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.commons.impl.LabellableElementImpl <em>Labellable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.commons.impl.LabellableElementImpl
		 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getLabellableElement()
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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.commons.impl.URIableElementImpl <em>UR Iable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.commons.impl.URIableElementImpl
		 * @see org.servicifi.gelato.language.cobol.commons.impl.CommonsPackageImpl#getURIableElement()
		 * @generated
		 */
		EClass UR_IABLE_ELEMENT = eINSTANCE.getURIableElement();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_IABLE_ELEMENT__URI = eINSTANCE.getURIableElement_Uri();

	}

} //CommonsPackage
