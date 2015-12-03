/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming Data Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.RenamingDataName#getNameRange <em>Name Range</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRenamingDataName()
 * @model
 * @generated
 */
public interface RenamingDataName extends DataName {
	/**
	 * Returns the value of the '<em><b>Name Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Range</em>' containment reference.
	 * @see #setNameRange(RangeExpression)
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getRenamingDataName_NameRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RangeExpression getNameRange();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.dataitems.RenamingDataName#getNameRange <em>Name Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Range</em>' containment reference.
	 * @see #getNameRange()
	 * @generated
	 */
	void setNameRange(RangeExpression value);

} // RenamingDataName
