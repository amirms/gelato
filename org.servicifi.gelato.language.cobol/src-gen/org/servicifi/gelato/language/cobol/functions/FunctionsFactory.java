/**
 */
package org.servicifi.gelato.language.cobol.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsFactory eINSTANCE = org.servicifi.gelato.language.cobol.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>By Reference Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>By Reference Argument</em>'.
	 * @generated
	 */
	ByReferenceArgument createByReferenceArgument();

	/**
	 * Returns a new object of class '<em>By Value Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>By Value Argument</em>'.
	 * @generated
	 */
	ByValueArgument createByValueArgument();

	/**
	 * Returns a new object of class '<em>By Content Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>By Content Argument</em>'.
	 * @generated
	 */
	ByContentArgument createByContentArgument();

	/**
	 * Returns a new object of class '<em>Omitted Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Omitted Argument</em>'.
	 * @generated
	 */
	OmittedArgument createOmittedArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
