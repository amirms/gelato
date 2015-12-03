/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.Channel#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends SystemDevice {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.Channels}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.Channels
	 * @see #setValue(Channels)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getChannel_Value()
	 * @model required="true"
	 * @generated
	 */
	Channels getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.Channel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.Channels
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Channels value);

} // Channel
