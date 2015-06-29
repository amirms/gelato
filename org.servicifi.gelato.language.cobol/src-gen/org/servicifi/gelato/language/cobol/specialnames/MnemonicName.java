/**
 */
package org.servicifi.gelato.language.cobol.specialnames;

import org.servicifi.gelato.language.cobol.environments.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mnemonic Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.MnemonicName#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getMnemonicName()
 * @model abstract="true"
 * @generated
 */
public interface MnemonicName extends SpecialName {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage#getMnemonicName_Environment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.specialnames.MnemonicName#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // MnemonicName
