/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.labels.Procedure;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.Paragraph#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends NamedElement, Procedure {
	/**
	 * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.sentences.StatementContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentences</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getParagraph_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementContainer> getSentences();

} // Paragraph
