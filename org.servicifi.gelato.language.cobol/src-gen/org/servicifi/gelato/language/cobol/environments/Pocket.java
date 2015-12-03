/**
 */
package org.servicifi.gelato.language.cobol.environments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pocket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.environments.Pocket#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getPocket()
 * @model
 * @generated
 */
public interface Pocket extends SystemDevice {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.servicifi.gelato.language.cobol.environments.Selects}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.Selects
	 * @see #setValue(Selects)
	 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage#getPocket_Value()
	 * @model required="true"
	 * @generated
	 */
	Selects getValue();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.environments.Pocket#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.servicifi.gelato.language.cobol.environments.Selects
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Selects value);

} // Pocket
