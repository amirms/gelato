/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.Space#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends ConstantLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.literals.Spaces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Spaces
	 * @see #setValue(Spaces)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getSpace_Value()
	 * @model required="true"
	 * @generated
	 */
	Spaces getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.Space#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Spaces
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Spaces value);

} // Space
