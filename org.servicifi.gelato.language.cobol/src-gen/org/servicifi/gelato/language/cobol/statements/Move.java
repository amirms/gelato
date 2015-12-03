/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Move#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Move#getCorresponding <em>Corresponding</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Move#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Statement {
	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMove_Receivers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryOperand> getReceivers();

	/**
	 * Returns the value of the '<em><b>Corresponding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.Corresponding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @see #setCorresponding(Corresponding)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMove_Corresponding()
	 * @model
	 * @generated
	 */
	Corresponding getCorresponding();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Move#getCorresponding <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @see #getCorresponding()
	 * @generated
	 */
	void setCorresponding(Corresponding value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getMove_Sender()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryOperand> getSender();

} // Move
