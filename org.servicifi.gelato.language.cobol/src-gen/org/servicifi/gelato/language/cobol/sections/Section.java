/**
 */
package org.servicifi.gelato.language.cobol.sections;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.labels.Procedure;

import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.Section#getSentences <em>Sentences</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.Section#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.Section#getSegmentNumber <em>Segment Number</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends NamedElement, Procedure {
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
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getSection_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementContainer> getSentences();

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.paragraphs.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getSection_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Segment Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Number</em>' attribute.
	 * @see #setSegmentNumber(String)
	 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage#getSection_SegmentNumber()
	 * @model
	 * @generated
	 */
	String getSegmentNumber();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.sections.Section#getSegmentNumber <em>Segment Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Number</em>' attribute.
	 * @see #getSegmentNumber()
	 * @generated
	 */
	void setSegmentNumber(String value);

} // Section
