/**
 */
package org.servicifi.gelato.language.cobol.parameters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

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
 * @see org.servicifi.gelato.language.cobol.parameters.ParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/parameters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParametersPackage eINSTANCE = org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getParametrizable()
	 * @generated
	 */
	int PARAMETRIZABLE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZABLE__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZABLE__RETURNING = 1;

	/**
	 * The number of structural features of the '<em>Parametrizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIZABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParameterImpl
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALIASES_TO = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALIASES_FROM = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ByReferenceParameterImpl <em>By Reference Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ByReferenceParameterImpl
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getByReferenceParameter()
	 * @generated
	 */
	int BY_REFERENCE_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_PARAMETER__ALIASES_TO = PARAMETER__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_PARAMETER__ALIASES_FROM = PARAMETER__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>By Reference Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ByValueParameterImpl <em>By Value Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ByValueParameterImpl
	 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getByValueParameter()
	 * @generated
	 */
	int BY_VALUE_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_PARAMETER__ALIASES_TO = PARAMETER__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_PARAMETER__ALIASES_FROM = PARAMETER__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>By Value Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable <em>Parametrizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametrizable</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.Parametrizable
	 * @generated
	 */
	EClass getParametrizable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.Parametrizable#getParameters()
	 * @see #getParametrizable()
	 * @generated
	 */
	EReference getParametrizable_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable#getReturning <em>Returning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returning</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.Parametrizable#getReturning()
	 * @see #getParametrizable()
	 * @generated
	 */
	EReference getParametrizable_Returning();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.parameters.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter <em>By Reference Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Reference Parameter</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter
	 * @generated
	 */
	EClass getByReferenceParameter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.parameters.ByValueParameter <em>By Value Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Value Parameter</em>'.
	 * @see org.servicifi.gelato.language.cobol.parameters.ByValueParameter
	 * @generated
	 */
	EClass getByValueParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParametersFactory getParametersFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getParametrizable()
		 * @generated
		 */
		EClass PARAMETRIZABLE = eINSTANCE.getParametrizable();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIZABLE__PARAMETERS = eINSTANCE.getParametrizable_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIZABLE__RETURNING = eINSTANCE.getParametrizable_Returning();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParameterImpl
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ByReferenceParameterImpl <em>By Reference Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ByReferenceParameterImpl
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getByReferenceParameter()
		 * @generated
		 */
		EClass BY_REFERENCE_PARAMETER = eINSTANCE.getByReferenceParameter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.parameters.impl.ByValueParameterImpl <em>By Value Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ByValueParameterImpl
		 * @see org.servicifi.gelato.language.cobol.parameters.impl.ParametersPackageImpl#getByValueParameter()
		 * @generated
		 */
		EClass BY_VALUE_PARAMETER = eINSTANCE.getByValueParameter();

	}

} //ParametersPackage
