/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.operands.Operand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.Subscript#getSubscript <em>Subscript</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getSubscript()
 * @model abstract="true"
 * @generated
 */
public interface Subscript extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscript</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' containment reference.
	 * @see #setSubscript(Operand)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getSubscript_Subscript()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operand getSubscript();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.Subscript#getSubscript <em>Subscript</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscript</em>' containment reference.
	 * @see #getSubscript()
	 * @generated
	 */
	void setSubscript(Operand value);

} // Subscript
