/**
 */
package org.servicifi.gelato.language.cobol.operands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operands.Encoding#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage#getEncoding()
 * @model
 * @generated
 */
public interface Encoding extends ReplacementOperand {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.operands.EncodingTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.operands.EncodingTypes
	 * @see #setType(EncodingTypes)
	 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage#getEncoding_Type()
	 * @model required="true"
	 * @generated
	 */
	EncodingTypes getType();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.operands.Encoding#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.operands.EncodingTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(EncodingTypes value);

} // Encoding
