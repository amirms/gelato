/**
 */
package org.servicifi.gelato.language.cobol.sentences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage
 * @generated
 */
public interface SentencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SentencesFactory eINSTANCE = org.servicifi.gelato.language.cobol.sentences.impl.SentencesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Empty Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Sentence</em>'.
	 * @generated
	 */
	EmptySentence createEmptySentence();

	/**
	 * Returns a new object of class '<em>Use Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Sentence</em>'.
	 * @generated
	 */
	UseSentence createUseSentence();

	/**
	 * Returns a new object of class '<em>Altered Go To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Altered Go To</em>'.
	 * @generated
	 */
	AlteredGoTo createAlteredGoTo();

	/**
	 * Returns a new object of class '<em>Exit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Procedure</em>'.
	 * @generated
	 */
	ExitProcedure createExitProcedure();

	/**
	 * Returns a new object of class '<em>Entry Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Sentence</em>'.
	 * @generated
	 */
	EntrySentence createEntrySentence();

	/**
	 * Returns a new object of class '<em>Execute Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Sentence</em>'.
	 * @generated
	 */
	ExecuteSentence createExecuteSentence();

	/**
	 * Returns a new object of class '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentence</em>'.
	 * @generated
	 */
	Sentence createSentence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SentencesPackage getSentencesPackage();

} //SentencesFactory
