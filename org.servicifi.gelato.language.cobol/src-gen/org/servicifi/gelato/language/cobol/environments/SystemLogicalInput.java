/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Logical Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalInput#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemLogicalInput()
 * @model
 * @generated
 */
public interface SystemLogicalInput extends SystemDevice {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.SystemInputs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemInputs
	 * @see #setValue(SystemInputs)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemLogicalInput_Value()
	 * @model required="true"
	 * @generated
	 */
	SystemInputs getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalInput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemInputs
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemInputs value);

} // SystemLogicalInput
