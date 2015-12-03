/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.handlers.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Handled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.ErrorHandled#getHandlers <em>Handlers</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getErrorHandled()
 * @model abstract="true"
 * @generated
 */
public interface ErrorHandled extends EObject {
	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.handlers.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage#getErrorHandled_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Handler> getHandlers();

} // ErrorHandled
