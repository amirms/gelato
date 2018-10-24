/**
 */
package org.servicifi.gelato.language.cobol.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Names Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClause#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSpecialNamesClause()
 * @model
 * @generated
 */
public interface SpecialNamesClause extends SpecialNamesParagraphWater {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.water.SpecialNamesClauses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClauses
	 * @see #setValue(SpecialNamesClauses)
	 * @see org.servicifi.gelato.language.cobol.water.WaterPackage#getSpecialNamesClause_Value()
	 * @model required="true"
	 * @generated
	 */
	SpecialNamesClauses getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClause#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClauses
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SpecialNamesClauses value);

} // SpecialNamesClause
