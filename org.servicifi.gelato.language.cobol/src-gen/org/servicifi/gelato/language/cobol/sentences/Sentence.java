/**
 */
package org.servicifi.gelato.language.cobol.sentences;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sentences.Sentence#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage#getSentence()
 * @model
 * @generated
 */
public interface Sentence extends StatementContainer {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Sentence)
	 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage#getSentence_Next()
	 * @model
	 * @generated
	 */
	Sentence getNext();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.sentences.Sentence#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Sentence value);

} // Sentence
