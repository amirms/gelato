/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.conditions.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.Value#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends DataItemAttribute {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage#getValue_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getValues();

} // Value
