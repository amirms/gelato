/**
 */
package org.servicifi.gelato.language.cobol.divisions;

import org.servicifi.gelato.language.cobol.declaratives.Declaratives;

import org.servicifi.gelato.language.cobol.parameters.Parametrizable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.ProcedureDivision#getDeclaratives <em>Declaratives</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getProcedureDivision()
 * @model
 * @generated
 */
public interface ProcedureDivision extends Division, Parametrizable {
	/**
	 * Returns the value of the '<em><b>Declaratives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaratives</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaratives</em>' containment reference.
	 * @see #setDeclaratives(Declaratives)
	 * @see org.servicifi.gelato.language.cobol.divisions.DivisionsPackage#getProcedureDivision_Declaratives()
	 * @model containment="true"
	 * @generated
	 */
	Declaratives getDeclaratives();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.divisions.ProcedureDivision#getDeclaratives <em>Declaratives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaratives</em>' containment reference.
	 * @see #getDeclaratives()
	 * @generated
	 */
	void setDeclaratives(Declaratives value);

} // ProcedureDivision
