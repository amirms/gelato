/**
 */
package org.servicifi.gelato.language.kernel.procedures;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.commons.NamedElement;

import org.servicifi.gelato.language.kernel.containers.End;
import org.servicifi.gelato.language.kernel.containers.Start;
import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getMembers <em>Members</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getCallers <em>Callers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure()
 * @generated
 */
public interface Procedure extends LabellableElement, Member, ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.members.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure_Members()
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.parameters.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure_Parameters()
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Callers</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.statements.ProcedureCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callers</em>' reference list.
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure_Callers()
	 * @generated
	 */
	EList<ProcedureCall> getCallers();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure_Start()
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getProcedure_End()
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.procedures.Procedure#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // Procedure
