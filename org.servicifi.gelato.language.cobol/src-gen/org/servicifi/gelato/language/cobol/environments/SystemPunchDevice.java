/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Punch Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevice#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemPunchDevice()
 * @model
 * @generated
 */
public interface SystemPunchDevice extends SystemDevice {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevices
	 * @see #setValue(SystemPunchDevices)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemPunchDevice_Value()
	 * @model required="true"
	 * @generated
	 */
	SystemPunchDevices getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevice#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevices
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemPunchDevices value);

} // SystemPunchDevice
