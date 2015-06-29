/**
 */
package org.servicifi.gelato.language.cobol.declaratives;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage
 * @generated
 */
public interface DeclarativesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarativesFactory eINSTANCE = org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declaratives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaratives</em>'.
	 * @generated
	 */
	Declaratives createDeclaratives();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeclarativesPackage getDeclarativesPackage();

} //DeclarativesFactory
