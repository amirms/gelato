/**
 */
package org.servicifi.gelato.language.cobol.divisions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage
 * @generated
 */
public interface DivisionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionsFactory eINSTANCE = org.servicifi.gelato.language.cobol.divisions.impl.DivisionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Division</em>'.
	 * @generated
	 */
	DataDivision createDataDivision();

	/**
	 * Returns a new object of class '<em>Environment Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Division</em>'.
	 * @generated
	 */
	EnvironmentDivision createEnvironmentDivision();

	/**
	 * Returns a new object of class '<em>Identification Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identification Division</em>'.
	 * @generated
	 */
	IdentificationDivision createIdentificationDivision();

	/**
	 * Returns a new object of class '<em>Procedure Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Division</em>'.
	 * @generated
	 */
	ProcedureDivision createProcedureDivision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DivisionsPackage getDivisionsPackage();

} //DivisionsFactory
