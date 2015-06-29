/**
 */
package org.servicifi.gelato.language.cobol.handlers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Error Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.handlers.NotErrorHandler#getHandlerStatement <em>Handler Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage#getNotErrorHandler()
 * @model abstract="true"
 * @generated
 */
public interface NotErrorHandler extends Handler {
	/**
	 * Returns the value of the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Statement</em>' containment reference.
	 * @see #setHandlerStatement(Handler)
	 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage#getNotErrorHandler_HandlerStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Handler getHandlerStatement();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.handlers.NotErrorHandler#getHandlerStatement <em>Handler Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Statement</em>' containment reference.
	 * @see #getHandlerStatement()
	 * @generated
	 */
	void setHandlerStatement(Handler value);

} // NotErrorHandler
