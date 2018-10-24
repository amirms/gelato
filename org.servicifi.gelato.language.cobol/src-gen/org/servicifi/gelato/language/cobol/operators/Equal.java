/**
 */
package org.servicifi.gelato.language.cobol.operators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operators.Equal#isTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getEqual()
 * @model abstract="true"
 * @generated
 */
public interface Equal extends RelationalOperator {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(boolean)
	 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getEqual_To()
	 * @model
	 * @generated
	 */
	boolean isTo();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.operators.Equal#isTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #isTo()
	 * @generated
	 */
	void setTo(boolean value);

} // Equal
