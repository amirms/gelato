/**
 */
package org.servicifi.gelato.language.cobol.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.literals.AllLiteral#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getAllLiteral()
 * @model
 * @generated
 */
public interface AllLiteral extends FigurativeConstantLiteral {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(ConstantLiteral)
	 * @see org.servicifi.gelato.language.cobol.literals.LiteralsPackage#getAllLiteral_Constant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstantLiteral getConstant();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.literals.AllLiteral#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(ConstantLiteral value);

} // AllLiteral
