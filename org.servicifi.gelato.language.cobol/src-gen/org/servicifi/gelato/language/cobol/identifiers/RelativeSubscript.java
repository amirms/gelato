/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

import org.servicifi.gelato.language.cobol.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Subscript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getAdditiveOperator <em>Additive Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getInteger <em>Integer</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getRelativeSubscript()
 * @model
 * @generated
 */
public interface RelativeSubscript extends Subscript {
	/**
	 * Returns the value of the '<em><b>Additive Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Operator</em>' containment reference.
	 * @see #setAdditiveOperator(AdditiveOperator)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getRelativeSubscript_AdditiveOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdditiveOperator getAdditiveOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getAdditiveOperator <em>Additive Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Operator</em>' containment reference.
	 * @see #getAdditiveOperator()
	 * @generated
	 */
	void setAdditiveOperator(AdditiveOperator value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerLiteral)
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage#getRelativeSubscript_Integer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerLiteral getInteger();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(IntegerLiteral value);

} // RelativeSubscript
