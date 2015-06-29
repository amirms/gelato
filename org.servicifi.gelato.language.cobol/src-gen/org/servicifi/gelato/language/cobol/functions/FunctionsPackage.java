/**
 */
package org.servicifi.gelato.language.cobol.functions;

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
 * @see org.servicifi.gelato.language.cobol.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl <em>Argumentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getArgumentable()
	 * @generated
	 */
	int ARGUMENTABLE = 6;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__ARGUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE__RETURNING = 1;

	/**
	 * The number of structural features of the '<em>Argumentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = ARGUMENTABLE__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__RETURNING = ARGUMENTABLE__RETURNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NAME = ARGUMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__MODIFIER = ARGUMENTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = ARGUMENTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.ArgumentImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__OPERANDS = 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByReferenceArgumentImpl <em>By Reference Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.ByReferenceArgumentImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByReferenceArgument()
	 * @generated
	 */
	int BY_REFERENCE_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ARGUMENT__OPERANDS = ARGUMENT__OPERANDS;

	/**
	 * The number of structural features of the '<em>By Reference Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByValueArgumentImpl <em>By Value Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.ByValueArgumentImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByValueArgument()
	 * @generated
	 */
	int BY_VALUE_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ARGUMENT__OPERANDS = ARGUMENT__OPERANDS;

	/**
	 * The number of structural features of the '<em>By Value Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByContentArgumentImpl <em>By Content Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.ByContentArgumentImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByContentArgument()
	 * @generated
	 */
	int BY_CONTENT_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_CONTENT_ARGUMENT__OPERANDS = ARGUMENT__OPERANDS;

	/**
	 * The number of structural features of the '<em>By Content Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_CONTENT_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.functions.impl.OmittedArgumentImpl <em>Omitted Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.functions.impl.OmittedArgumentImpl
	 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getOmittedArgument()
	 * @generated
	 */
	int OMITTED_ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMITTED_ARGUMENT__OPERANDS = ARGUMENT__OPERANDS;

	/**
	 * The number of structural features of the '<em>Omitted Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMITTED_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.functions.Argument#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.Argument#getOperands()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Operands();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.ByReferenceArgument <em>By Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Reference Argument</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.ByReferenceArgument
	 * @generated
	 */
	EClass getByReferenceArgument();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.ByValueArgument <em>By Value Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Value Argument</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.ByValueArgument
	 * @generated
	 */
	EClass getByValueArgument();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.ByContentArgument <em>By Content Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Content Argument</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.ByContentArgument
	 * @generated
	 */
	EClass getByContentArgument();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.OmittedArgument <em>Omitted Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Omitted Argument</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.OmittedArgument
	 * @generated
	 */
	EClass getOmittedArgument();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.functions.Argumentable <em>Argumentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumentable</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.Argumentable
	 * @generated
	 */
	EClass getArgumentable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.functions.Argumentable#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.Argumentable#getArguments()
	 * @see #getArgumentable()
	 * @generated
	 */
	EReference getArgumentable_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.functions.Argumentable#getReturning <em>Returning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returning</em>'.
	 * @see org.servicifi.gelato.language.cobol.functions.Argumentable#getReturning()
	 * @see #getArgumentable()
	 * @generated
	 */
	EReference getArgumentable_Returning();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.ArgumentImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__OPERANDS = eINSTANCE.getArgument_Operands();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByReferenceArgumentImpl <em>By Reference Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.ByReferenceArgumentImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByReferenceArgument()
		 * @generated
		 */
		EClass BY_REFERENCE_ARGUMENT = eINSTANCE.getByReferenceArgument();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByValueArgumentImpl <em>By Value Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.ByValueArgumentImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByValueArgument()
		 * @generated
		 */
		EClass BY_VALUE_ARGUMENT = eINSTANCE.getByValueArgument();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ByContentArgumentImpl <em>By Content Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.ByContentArgumentImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getByContentArgument()
		 * @generated
		 */
		EClass BY_CONTENT_ARGUMENT = eINSTANCE.getByContentArgument();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.OmittedArgumentImpl <em>Omitted Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.OmittedArgumentImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getOmittedArgument()
		 * @generated
		 */
		EClass OMITTED_ARGUMENT = eINSTANCE.getOmittedArgument();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl <em>Argumentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl
		 * @see org.servicifi.gelato.language.cobol.functions.impl.FunctionsPackageImpl#getArgumentable()
		 * @generated
		 */
		EClass ARGUMENTABLE = eINSTANCE.getArgumentable();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTABLE__ARGUMENTS = eINSTANCE.getArgumentable_Arguments();

		/**
		 * The meta object literal for the '<em><b>Returning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTABLE__RETURNING = eINSTANCE.getArgumentable_Returning();

	}

} //FunctionsPackage
