/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.conditions.Condition;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.strings.SplittedString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getTally <em>Tally</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getSender <em>Sender</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Unstring#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring()
 * @model
 * @generated
 */
public interface Unstring extends ErrorHandled, Statement {
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
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPointer();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(Identifier value);

	/**
	 * Returns the value of the '<em><b>Tally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tally</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tally</em>' containment reference.
	 * @see #setTally(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Tally()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getTally();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getTally <em>Tally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tally</em>' containment reference.
	 * @see #getTally()
	 * @generated
	 */
	void setTally(IdentifierReference value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Sender()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getSender();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Identifier value);

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.SplittedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Receivers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SplittedString> getReceivers();

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' containment reference.
	 * @see #setDelimiter(Condition)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Delimiter()
	 * @model containment="true"
	 * @generated
	 */
	Condition getDelimiter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getDelimiter <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' containment reference.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(Condition value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getUnstring_Counter()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getCounter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Identifier value);

} // Unstring
