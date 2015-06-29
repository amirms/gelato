/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Statement Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.SQLStatementToken#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSQLStatementToken()
 * @model
 * @generated
 */
public interface SQLStatementToken extends SQLStatementWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.SQLStatementTokens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementTokens
	 * @see #setValue(SQLStatementTokens)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSQLStatementToken_Value()
	 * @model required="true"
	 * @generated
	 */
	SQLStatementTokens getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.SQLStatementToken#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementTokens
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SQLStatementTokens value);

} // SQLStatementToken
