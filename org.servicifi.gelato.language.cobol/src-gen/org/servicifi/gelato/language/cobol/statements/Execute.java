/**
 */
package org.servicifi.gelato.language.cobol.statements;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.Execute#getWater <em>Water</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends Statement {
	/**
	 * Returns the value of the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' attribute.
	 * @see #setWater(String)
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getExecute_Water()
	 * @model
	 * @generated
	 */
	String getWater();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.statements.Execute#getWater <em>Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water</em>' attribute.
	 * @see #getWater()
	 * @generated
	 */
	void setWater(String value);

} // Execute
