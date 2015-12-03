/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.Redefines#getDataName <em>Data Name</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRedefines()
 * @model
 * @generated
 */
public interface Redefines extends DataItemAttribute {
	/**
	 * Returns the value of the '<em><b>Data Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Name</em>' containment reference.
	 * @see #setDataName(IdentifierReference)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRedefines_DataName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentifierReference getDataName();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.Redefines#getDataName <em>Data Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Name</em>' containment reference.
	 * @see #getDataName()
	 * @generated
	 */
	void setDataName(IdentifierReference value);

} // Redefines
