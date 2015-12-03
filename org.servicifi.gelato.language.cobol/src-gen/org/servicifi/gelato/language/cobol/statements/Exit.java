/**
 */
package org.servicifi.gelato.language.cobol.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Exit#getExitLabel <em>Exit Label</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends Statement {
	/**
	 * Returns the value of the '<em><b>Exit Label</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.ExitLabels}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Label</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.ExitLabels
	 * @see #setExitLabel(ExitLabels)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getExit_ExitLabel()
	 * @model
	 * @generated
	 */
	ExitLabels getExitLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Exit#getExitLabel <em>Exit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Label</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.ExitLabels
	 * @see #getExitLabel()
	 * @generated
	 */
	void setExitLabel(ExitLabels value);

} // Exit
