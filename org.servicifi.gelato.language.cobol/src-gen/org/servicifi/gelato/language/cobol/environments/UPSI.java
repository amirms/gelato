/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UPSI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.UPSI#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getUPSI()
 * @model
 * @generated
 */
public interface UPSI extends Environment {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.UPSISwitches}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSISwitches
	 * @see #setValue(UPSISwitches)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getUPSI_Value()
	 * @model required="true"
	 * @generated
	 */
	UPSISwitches getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.UPSI#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSISwitches
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UPSISwitches value);

} // UPSI
