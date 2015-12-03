/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.SelectStatementClause#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSelectStatementClause()
 * @model
 * @generated
 */
public interface SelectStatementClause extends SelectStatementWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.SelectStatementClauses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClauses
	 * @see #setValue(SelectStatementClauses)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSelectStatementClause_Value()
	 * @model required="true"
	 * @generated
	 */
	SelectStatementClauses getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClause#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClauses
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SelectStatementClauses value);

} // SelectStatementClause
