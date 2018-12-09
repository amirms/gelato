/**
 */
package org.servicifi.gelato.language.kernel.procedures;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.analysis.framework.commons.End;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;

import org.servicifi.gelato.language.kernel.members.Member;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getMembers <em>Members</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getMainProcedure()
 * @generated
 */
public interface MainProcedure extends LabellableElement {
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
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getMainProcedure_Members()
	 * @generated
	 */
	EList<Member> getMembers();

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
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getMainProcedure_Start()
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getStart <em>Start</em>}' containment reference.
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
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see org.servicifi.gelato.language.kernel.procedures.ProceduresPackage#getMainProcedure_End()
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.procedures.MainProcedure#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // MainProcedure
