/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Low Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.LowValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getLowValue()
 * @model
 * @generated
 */
public interface LowValue extends ConstantLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.literals.LowValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.LowValues
	 * @see #setValue(LowValues)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getLowValue_Value()
	 * @model required="true"
	 * @generated
	 */
	LowValues getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.LowValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.LowValues
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LowValues value);

} // LowValue
