/**
 */
package org.servicifi.gelato.language.kernel.parameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;
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
 * @see org.servicifi.gelato.language.kernel.parameters.ParametersFactory
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
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/parameters";

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
	ParametersPackage eINSTANCE = org.servicifi.gelato.language.kernel.parameters.impl.ParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl
	 * @see org.servicifi.gelato.language.kernel.parameters.impl.ParametersPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = DataitemsPackage.DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Corresponding Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CORRESPONDING_ARGUMENT = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>By Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BY_REFERENCE = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.parameters.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.servicifi.gelato.language.kernel.parameters.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.parameters.Parameter#getCorrespondingArgument <em>Corresponding Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Argument</em>'.
	 * @see org.servicifi.gelato.language.kernel.parameters.Parameter#getCorrespondingArgument()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_CorrespondingArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.kernel.parameters.Parameter#isByReference <em>By Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Reference</em>'.
	 * @see org.servicifi.gelato.language.kernel.parameters.Parameter#isByReference()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ByReference();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl
		 * @see org.servicifi.gelato.language.kernel.parameters.impl.ParametersPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Corresponding Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CORRESPONDING_ARGUMENT = eINSTANCE.getParameter_CorrespondingArgument();

		/**
		 * The meta object literal for the '<em><b>By Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__BY_REFERENCE = eINSTANCE.getParameter_ByReference();

	}

} //ParametersPackage
