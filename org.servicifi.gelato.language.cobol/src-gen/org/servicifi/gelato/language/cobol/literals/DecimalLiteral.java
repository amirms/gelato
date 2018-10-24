/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.DecimalLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getDecimalLiteral()
 * @model abstract="true"
 * @generated
 */
public interface DecimalLiteral extends NumericLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getDecimalLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.DecimalLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DecimalLiteral
