/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.strings.Replacement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Inspect#getTallyingIns <em>Tallying Ins</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Inspect#getReplacements <em>Replacements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Inspect#getConversions <em>Conversions</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Inspect#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInspect()
 * @model
 * @generated
 */
public interface Inspect extends Statement {
	/**
	 * Returns the value of the '<em><b>Tallying Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.statements.TallyingIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tallying Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tallying Ins</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInspect_TallyingIns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TallyingIn> getTallyingIns();

	/**
	 * Returns the value of the '<em><b>Replacements</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Replacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacements</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInspect_Replacements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replacement> getReplacements();

	/**
	 * Returns the value of the '<em><b>Conversions</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Replacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversions</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInspect_Conversions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replacement> getConversions();

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(PrimaryOperand)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getInspect_String()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryOperand getString();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Inspect#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(PrimaryOperand value);

} // Inspect
