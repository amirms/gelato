/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.references.MnemonicNameReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus#getMnemonicNames <em>Mnemonic Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSwitchStatus()
 * @model
 * @generated
 */
public interface SwitchStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Status
	 * @see #setStatus(Status)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSwitchStatus_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Mnemonic Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.references.MnemonicNameReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mnemonic Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mnemonic Names</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSwitchStatus_MnemonicNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MnemonicNameReference> getMnemonicNames();

} // SwitchStatus
