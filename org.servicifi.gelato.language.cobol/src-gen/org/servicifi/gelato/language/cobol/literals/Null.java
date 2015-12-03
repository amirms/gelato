/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.Null#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getNull()
 * @model
 * @generated
 */
public interface Null extends ConstantLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.literals.Nulls}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Nulls
	 * @see #setValue(Nulls)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getNull_Value()
	 * @model required="true"
	 * @generated
	 */
	Nulls getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.Null#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.literals.Nulls
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Nulls value);

} // Null
