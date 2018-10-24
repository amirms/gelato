/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage
 * @generated
 */
public interface IdentifiersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifiersFactory eINSTANCE = org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Reference</em>'.
	 * @generated
	 */
	IdentifierReference createIdentifierReference();

	/**
	 * Returns a new object of class '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All</em>'.
	 * @generated
	 */
	All createAll();

	/**
	 * Returns a new object of class '<em>Reference Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Modifier</em>'.
	 * @generated
	 */
	ReferenceModifier createReferenceModifier();

	/**
	 * Returns a new object of class '<em>Linage Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linage Counter</em>'.
	 * @generated
	 */
	LinageCounter createLinageCounter();

	/**
	 * Returns a new object of class '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier</em>'.
	 * @generated
	 */
	Qualifier createQualifier();

	/**
	 * Returns a new object of class '<em>Relative Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Subscript</em>'.
	 * @generated
	 */
	RelativeSubscript createRelativeSubscript();

	/**
	 * Returns a new object of class '<em>Direct Subscript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Subscript</em>'.
	 * @generated
	 */
	DirectSubscript createDirectSubscript();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdentifiersPackage getIdentifiersPackage();

} //IdentifiersFactory
