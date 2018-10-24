/**
 */
package org.servicifi.gelato.language.cobol.handlers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage
 * @generated
 */
public interface HandlersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HandlersFactory eINSTANCE = org.servicifi.gelato.language.cobol.handlers.impl.HandlersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>On Size Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Size Error</em>'.
	 * @generated
	 */
	OnSizeError createOnSizeError();

	/**
	 * Returns a new object of class '<em>Not On Size Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not On Size Error</em>'.
	 * @generated
	 */
	NotOnSizeError createNotOnSizeError();

	/**
	 * Returns a new object of class '<em>On Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Overflow</em>'.
	 * @generated
	 */
	OnOverflow createOnOverflow();

	/**
	 * Returns a new object of class '<em>On Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Exception</em>'.
	 * @generated
	 */
	OnException createOnException();

	/**
	 * Returns a new object of class '<em>Not On Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not On Exception</em>'.
	 * @generated
	 */
	NotOnException createNotOnException();

	/**
	 * Returns a new object of class '<em>Not On Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not On Overflow</em>'.
	 * @generated
	 */
	NotOnOverflow createNotOnOverflow();

	/**
	 * Returns a new object of class '<em>Not At End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not At End</em>'.
	 * @generated
	 */
	NotAtEnd createNotAtEnd();

	/**
	 * Returns a new object of class '<em>At End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At End</em>'.
	 * @generated
	 */
	AtEnd createAtEnd();

	/**
	 * Returns a new object of class '<em>At End Of Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At End Of Page</em>'.
	 * @generated
	 */
	AtEndOfPage createAtEndOfPage();

	/**
	 * Returns a new object of class '<em>Invalid Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Key</em>'.
	 * @generated
	 */
	InvalidKey createInvalidKey();

	/**
	 * Returns a new object of class '<em>Not At End Of Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not At End Of Page</em>'.
	 * @generated
	 */
	NotAtEndOfPage createNotAtEndOfPage();

	/**
	 * Returns a new object of class '<em>Not Invalid Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Invalid Key</em>'.
	 * @generated
	 */
	NotInvalidKey createNotInvalidKey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HandlersPackage getHandlersPackage();

} //HandlersFactory
