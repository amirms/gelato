/**
 */
package org.servicifi.gelato.language.cobol.handlers;

import org.servicifi.gelato.language.cobol.statements.EOP;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At End Of Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.handlers.AtEndOfPage#getEop <em>Eop</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage#getAtEndOfPage()
 * @model
 * @generated
 */
public interface AtEndOfPage extends Handler {
	/**
	 * Returns the value of the '<em><b>Eop</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.statements.EOP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eop</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.EOP
	 * @see #setEop(EOP)
	 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage#getAtEndOfPage_Eop()
	 * @model required="true"
	 * @generated
	 */
	EOP getEop();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.handlers.AtEndOfPage#getEop <em>Eop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eop</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.statements.EOP
	 * @see #getEop()
	 * @generated
	 */
	void setEop(EOP value);

} // AtEndOfPage
