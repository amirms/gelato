/**
 */
package org.servicifi.gelato.language.cobol.operators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Through</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operators.Through#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getThrough()
 * @model
 * @generated
 */
public interface Through extends Operator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.operators.ThroughPhrase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.operators.ThroughPhrase
	 * @see #setValue(ThroughPhrase)
	 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getThrough_Value()
	 * @model required="true"
	 * @generated
	 */
	ThroughPhrase getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.operators.Through#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.operators.ThroughPhrase
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ThroughPhrase value);

} // Through
