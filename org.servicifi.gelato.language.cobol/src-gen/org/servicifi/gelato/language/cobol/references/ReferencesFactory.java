/**
 */
package org.servicifi.gelato.language.cobol.references;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.references.ReferencesPackage
 * @generated
 */
public interface ReferencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferencesFactory eINSTANCE = org.servicifi.gelato.language.cobol.references.impl.ReferencesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Special Names Condition Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Names Condition Name Reference</em>'.
	 * @generated
	 */
	SpecialNamesConditionNameReference createSpecialNamesConditionNameReference();

	/**
	 * Returns a new object of class '<em>File Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Name Reference</em>'.
	 * @generated
	 */
	FileNameReference createFileNameReference();

	/**
	 * Returns a new object of class '<em>Index Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Name Reference</em>'.
	 * @generated
	 */
	IndexNameReference createIndexNameReference();

	/**
	 * Returns a new object of class '<em>Mnemonic Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mnemonic Name Reference</em>'.
	 * @generated
	 */
	MnemonicNameReference createMnemonicNameReference();

	/**
	 * Returns a new object of class '<em>Alphabet Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alphabet Name Reference</em>'.
	 * @generated
	 */
	AlphabetNameReference createAlphabetNameReference();

	/**
	 * Returns a new object of class '<em>Condition Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Name Reference</em>'.
	 * @generated
	 */
	ConditionNameReference createConditionNameReference();

	/**
	 * Returns a new object of class '<em>Data Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Name Reference</em>'.
	 * @generated
	 */
	DataNameReference createDataNameReference();

	/**
	 * Returns a new object of class '<em>Identifier Reference Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Reference Qualifier</em>'.
	 * @generated
	 */
	IdentifierReferenceQualifier createIdentifierReferenceQualifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReferencesPackage getReferencesPackage();

} //ReferencesFactory
