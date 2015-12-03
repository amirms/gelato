/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement;

import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Names Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getSpecialNameStatements <em>Special Name Statements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getSpecialNamesParagraph()
 * @model
 * @generated
 */
public interface SpecialNamesParagraph extends ConfigurationSectionParagraph {
	/**
	 * Returns the value of the '<em><b>Special Name Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Name Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Name Statements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getSpecialNamesParagraph_SpecialNameStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecialNameStatement> getSpecialNameStatements();

	/**
	 * Returns the value of the '<em><b>Water</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getSpecialNamesParagraph_Water()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecialNamesParagraphWater> getWater();

} // SpecialNamesParagraph
