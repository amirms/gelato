/**
 */
package org.servicifi.gelato.language.cobol.containers;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.divisions.DataDivision;
import org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision;
import org.servicifi.gelato.language.cobol.divisions.IdentificationDivision;
import org.servicifi.gelato.language.cobol.divisions.ProcedureDivision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getIdentificationDivision <em>Identification Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getEnvironmentDivision <em>Environment Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getDataDivision <em>Data Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getProcedureDivision <em>Procedure Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getNestedCompilationUnits <em>Nested Compilation Units</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Identification Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Division</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Division</em>' containment reference.
	 * @see #setIdentificationDivision(IdentificationDivision)
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit_IdentificationDivision()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentificationDivision getIdentificationDivision();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getIdentificationDivision <em>Identification Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Division</em>' containment reference.
	 * @see #getIdentificationDivision()
	 * @generated
	 */
	void setIdentificationDivision(IdentificationDivision value);

	/**
	 * Returns the value of the '<em><b>Environment Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Division</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Division</em>' containment reference.
	 * @see #setEnvironmentDivision(EnvironmentDivision)
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit_EnvironmentDivision()
	 * @model containment="true"
	 * @generated
	 */
	EnvironmentDivision getEnvironmentDivision();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getEnvironmentDivision <em>Environment Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Division</em>' containment reference.
	 * @see #getEnvironmentDivision()
	 * @generated
	 */
	void setEnvironmentDivision(EnvironmentDivision value);

	/**
	 * Returns the value of the '<em><b>Data Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Division</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Division</em>' containment reference.
	 * @see #setDataDivision(DataDivision)
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit_DataDivision()
	 * @model containment="true"
	 * @generated
	 */
	DataDivision getDataDivision();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getDataDivision <em>Data Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Division</em>' containment reference.
	 * @see #getDataDivision()
	 * @generated
	 */
	void setDataDivision(DataDivision value);

	/**
	 * Returns the value of the '<em><b>Procedure Division</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Division</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Division</em>' containment reference.
	 * @see #setProcedureDivision(ProcedureDivision)
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit_ProcedureDivision()
	 * @model containment="true"
	 * @generated
	 */
	ProcedureDivision getProcedureDivision();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.containers.CompilationUnit#getProcedureDivision <em>Procedure Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Division</em>' containment reference.
	 * @see #getProcedureDivision()
	 * @generated
	 */
	void setProcedureDivision(ProcedureDivision value);

	/**
	 * Returns the value of the '<em><b>Nested Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.containers.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Compilation Units</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.containers.ContainersPackage#getCompilationUnit_NestedCompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getNestedCompilationUnits();

} // CompilationUnit
