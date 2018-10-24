/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.Zero#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getZero()
 * @model
 * @generated
 */
public interface Zero extends ConstantLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.literals.Zeroes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Zeroes
	 * @see #setValue(Zeroes)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getZero_Value()
	 * @model required="true"
	 * @generated
	 */
	Zeroes getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.Zero#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Zeroes
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Zeroes value);

} // Zero
