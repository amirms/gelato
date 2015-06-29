/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.DataDescriptorWater;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater;
import org.servicifi.gelato.language.cobol.water.SQLStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SortPhraseWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.UseStatementWater;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.Identifier#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getIdentifier()
 * @model abstract="true"
 * @generated
 */
public interface Identifier extends PrimaryOperand, AcceptStatementWater, CICSStatementWater, SpecialNamesParagraphWater, ObjectComputerParagraphWater, RepositoryParagraphWater, IOControlParagraphWater, IdentificationDivisionWater, InvokeStatementWater, SQLStatementWater, UseStatementWater, FileDescriptorWater, DataDescriptorWater, SelectStatementWater, SortPhraseWater {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(ReferenceModifier)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getIdentifier_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceModifier getModifier();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.Identifier#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(ReferenceModifier value);

} // Identifier
