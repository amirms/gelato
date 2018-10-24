/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.strings.Tallying;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tallying In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.TallyingIn#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.TallyingIn#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getTallyingIn()
 * @model
 * @generated
 */
public interface TallyingIn extends EObject {
	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.strings.Tallying}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getTallyingIn_Occurrences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tallying> getOccurrences();

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
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getTallyingIn_Counter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getCounter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.TallyingIn#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Identifier value);

} // TallyingIn
