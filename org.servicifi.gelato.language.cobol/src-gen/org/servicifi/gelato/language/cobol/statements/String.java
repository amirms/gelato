/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.String#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.String#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.String#getSenders <em>Senders</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getString()
 * @model
 * @generated
 */
public interface String extends Statement, ErrorHandled {
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference.
	 * @see #setPointer(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getString_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPointer();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.String#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(Identifier value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getString_Receiver()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getReceiver();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.String#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Identifier value);

	/**
	 * Returns the value of the '<em><b>Senders</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getString_Senders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConcatenatingStrings> getSenders();

} // String
