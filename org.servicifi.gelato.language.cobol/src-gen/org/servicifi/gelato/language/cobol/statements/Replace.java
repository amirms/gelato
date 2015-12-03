/**
 */
package org.servicifi.gelato.language.cobol.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Replace#isReplaceSwitch <em>Replace Switch</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getReplace()
 * @model
 * @generated
 */
public interface Replace extends Statement {
	/**
	 * Returns the value of the '<em><b>Replace Switch</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace Switch</em>' attribute.
	 * @see #setReplaceSwitch(boolean)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getReplace_ReplaceSwitch()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReplaceSwitch();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Replace#isReplaceSwitch <em>Replace Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace Switch</em>' attribute.
	 * @see #isReplaceSwitch()
	 * @generated
	 */
	void setReplaceSwitch(boolean value);

} // Replace
