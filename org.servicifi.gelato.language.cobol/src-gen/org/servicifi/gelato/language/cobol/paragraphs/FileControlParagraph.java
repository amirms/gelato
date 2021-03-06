/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.files.SelectStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Control Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph#getSelectStatements <em>Select Statements</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getFileControlParagraph()
 * @model
 * @generated
 */
public interface FileControlParagraph extends IOSectionParagraph {
	/**
	 * Returns the value of the '<em><b>Select Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.files.SelectStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Statements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getFileControlParagraph_SelectStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectStatement> getSelectStatements();

} // FileControlParagraph
