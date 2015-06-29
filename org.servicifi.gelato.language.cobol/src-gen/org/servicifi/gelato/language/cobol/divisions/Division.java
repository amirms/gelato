/**
 */
package org.servicifi.gelato.language.cobol.divisions;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;

import org.servicifi.gelato.language.cobol.sections.Section;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.Division#getSections <em>Sections</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.Division#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.Division#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getDivision()
 * @model abstract="true"
 * @generated
 */
public interface Division extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.sections.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getDivision_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

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
	 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getDivision_Paragraphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

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
	 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getDivision_Sentences()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementContainer> getSentences();

} // Division
