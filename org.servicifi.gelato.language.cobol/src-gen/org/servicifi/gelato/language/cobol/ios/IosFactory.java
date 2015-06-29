/**
 */
package org.servicifi.gelato.language.cobol.ios;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.ios.IosPackage
 * @generated
 */
public interface IosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IosFactory eINSTANCE = org.servicifi.gelato.language.cobol.ios.impl.IosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Procedure</em>'.
	 * @generated
	 */
	InputProcedure createInputProcedure();

	/**
	 * Returns a new object of class '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input File</em>'.
	 * @generated
	 */
	InputFile createInputFile();

	/**
	 * Returns a new object of class '<em>Output Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Procedure</em>'.
	 * @generated
	 */
	OutputProcedure createOutputProcedure();

	/**
	 * Returns a new object of class '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output File</em>'.
	 * @generated
	 */
	OutputFile createOutputFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IosPackage getIosPackage();

} //IosFactory
