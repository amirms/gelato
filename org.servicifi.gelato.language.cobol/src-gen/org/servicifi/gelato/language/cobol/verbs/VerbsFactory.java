/**
 */
package org.servicifi.gelato.language.cobol.verbs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.verbs.VerbsPackage
 * @generated
 */
public interface VerbsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VerbsFactory eINSTANCE = org.servicifi.gelato.language.cobol.verbs.impl.VerbsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is</em>'.
	 * @generated
	 */
	Is createIs();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VerbsPackage getVerbsPackage();

} //VerbsFactory
