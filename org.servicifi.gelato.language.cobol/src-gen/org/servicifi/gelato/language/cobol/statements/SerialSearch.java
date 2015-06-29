/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serial Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.SerialSearch#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSerialSearch()
 * @model
 * @generated
 */
public interface SerialSearch extends SearchStatement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Identifier)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getSerialSearch_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getVariable();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.SerialSearch#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Identifier value);

} // SerialSearch
