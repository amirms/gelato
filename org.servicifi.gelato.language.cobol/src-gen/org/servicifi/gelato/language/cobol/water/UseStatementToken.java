/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Statement Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.UseStatementToken#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getUseStatementToken()
 * @model
 * @generated
 */
public interface UseStatementToken extends UseStatementWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.UseStatementTokens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementTokens
	 * @see #setValue(UseStatementTokens)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getUseStatementToken_Value()
	 * @model required="true"
	 * @generated
	 */
	UseStatementTokens getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.UseStatementToken#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementTokens
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UseStatementTokens value);

} // UseStatementToken
