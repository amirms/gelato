/**
 */
package org.servicifi.gelato.language.kernel.containers;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getMainProcedure <em>Main Procedure</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.containers.ContainersPackage#getCompilationUnit()
 * @generated
 */
public interface CompilationUnit extends KernelRoot, LabellableElement {
	/**
	 * Returns the value of the '<em><b>Main Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Procedure</em>' containment reference.
	 * @see #setMainProcedure(MainProcedure)
	 * @see org.servicifi.gelato.language.kernel.containers.ContainersPackage#getCompilationUnit_MainProcedure()
	 * @generated
	 */
	MainProcedure getMainProcedure();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getMainProcedure <em>Main Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Procedure</em>' containment reference.
	 * @see #getMainProcedure()
	 * @generated
	 */
	void setMainProcedure(MainProcedure value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.members.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.containers.ContainersPackage#getCompilationUnit_Declarations()
	 * @generated
	 */
	EList<Member> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see org.servicifi.gelato.language.kernel.containers.ContainersPackage#getCompilationUnit_Start()
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getStart <em>Start</em>}' containment reference.
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
	 * @see org.servicifi.gelato.language.kernel.containers.ContainersPackage#getCompilationUnit_End()
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.containers.CompilationUnit#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // CompilationUnit
