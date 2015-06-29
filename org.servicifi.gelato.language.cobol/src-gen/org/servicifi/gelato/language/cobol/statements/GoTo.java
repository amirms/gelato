/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.GoTo#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getGoTo()
 * @model
 * @generated
 */
public interface GoTo extends Jump {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getGoTo_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	IdentifierReference getDependsOn();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.GoTo#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(IdentifierReference value);

} // GoTo
