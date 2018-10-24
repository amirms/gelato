/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close Statement Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.CloseStatementToken#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getCloseStatementToken()
 * @model
 * @generated
 */
public interface CloseStatementToken extends CloseStatementWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.CloseStatementTokens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementTokens
	 * @see #setValue(CloseStatementTokens)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getCloseStatementToken_Value()
	 * @model required="true"
	 * @generated
	 */
	CloseStatementTokens getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.CloseStatementToken#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementTokens
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CloseStatementTokens value);

} // CloseStatementToken
