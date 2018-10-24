/**
 */
package org.servicifi.gelato.language.cobol.operators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.operators.LessThan#isThan <em>Than</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getLessThan()
 * @model abstract="true"
 * @generated
 */
public interface LessThan extends RelationalOperator {
	/**
	 * Returns the value of the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Than</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Than</em>' attribute.
	 * @see #setThan(boolean)
	 * @see org.servicifi.gelato.language.cobol.operators.OperatorsPackage#getLessThan_Than()
	 * @model
	 * @generated
	 */
	boolean isThan();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.operators.LessThan#isThan <em>Than</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Than</em>' attribute.
	 * @see #isThan()
	 * @generated
	 */
	void setThan(boolean value);

} // LessThan
