/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Logical Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemLogicalOutput()
 * @model
 * @generated
 */
public interface SystemLogicalOutput extends SystemDevice {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.SystemOutputs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemOutputs
	 * @see #setValue(SystemOutputs)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getSystemLogicalOutput_Value()
	 * @model required="true"
	 * @generated
	 */
	SystemOutputs getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemOutputs
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemOutputs value);

} // SystemLogicalOutput
