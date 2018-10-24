/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Statement Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.OpenStatementToken#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getOpenStatementToken()
 * @model
 * @generated
 */
public interface OpenStatementToken extends OpenStatementWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.OpenStatementTokens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementTokens
	 * @see #setValue(OpenStatementTokens)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getOpenStatementToken_Value()
	 * @model required="true"
	 * @generated
	 */
	OpenStatementTokens getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.OpenStatementToken#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementTokens
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OpenStatementTokens value);

} // OpenStatementToken
