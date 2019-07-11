/**
 */
package org.servicifi.gelato.language.kernel.references;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.references.ReferencesPackage
 * @generated
 */
public interface ReferencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesFactory eINSTANCE = org.servicifi.gelato.language.kernel.references.impl.ReferencesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Argument Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Reference</em>'.
	 * @generated
	 */
	ArgumentReference createArgumentReference();

	/**
	 * Returns a new object of class '<em>Empty Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Argument</em>'.
	 * @generated
	 */
	EmptyArgument createEmptyArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReferencesPackage getReferencesPackage();

} //ReferencesFactory
