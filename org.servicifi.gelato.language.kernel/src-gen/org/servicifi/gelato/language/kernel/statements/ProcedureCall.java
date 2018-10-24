/**
 */
package org.servicifi.gelato.language.kernel.statements;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ElementReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall#getReturnSite <em>Return Site</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getProcedureCall()
 * @generated
 */
public interface ProcedureCall extends Statement, ElementReference {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.references.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getProcedureCall_Arguments()
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Return Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Site</em>' containment reference.
	 * @see #setReturnSite(ReturnSite)
	 * @see org.servicifi.gelato.language.kernel.statements.StatementsPackage#getProcedureCall_ReturnSite()
	 * @generated
	 */
	ReturnSite getReturnSite();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.statements.ProcedureCall#getReturnSite <em>Return Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Site</em>' containment reference.
	 * @see #getReturnSite()
	 * @generated
	 */
	void setReturnSite(ReturnSite value);

} // ProcedureCall
