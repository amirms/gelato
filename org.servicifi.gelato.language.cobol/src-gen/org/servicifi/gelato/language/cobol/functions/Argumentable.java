/**
 */
package org.servicifi.gelato.language.cobol.functions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.Argumentable#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.Argumentable#getReturning <em>Returning</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends EObject {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.functions.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage#getArgumentable_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returning</em>' containment reference.
	 * @see #setReturning(Argument)
	 * @see org.servicifi.gelato.language.cobol.functions.FunctionsPackage#getArgumentable_Returning()
	 * @model containment="true"
	 * @generated
	 */
	Argument getReturning();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.functions.Argumentable#getReturning <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returning</em>' containment reference.
	 * @see #getReturning()
	 * @generated
	 */
	void setReturning(Argument value);

} // Argumentable
