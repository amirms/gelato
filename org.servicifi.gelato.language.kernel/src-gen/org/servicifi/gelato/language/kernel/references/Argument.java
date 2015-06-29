/**
 */
package org.servicifi.gelato.language.kernel.references;

import org.servicifi.gelato.language.kernel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.references.Argument#isByReference <em>By Reference</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.references.Argument#getCorrespondingParameter <em>Corresponding Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.references.ReferencesPackage#getArgument()
 * @generated
 */
public interface Argument extends ElementReference {
	/**
	 * Returns the value of the '<em><b>By Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Reference</em>' attribute.
	 * @see #setByReference(boolean)
	 * @see org.servicifi.gelato.language.kernel.references.ReferencesPackage#getArgument_ByReference()
	 * @generated
	 */
	boolean isByReference();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.references.Argument#isByReference <em>By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Reference</em>' attribute.
	 * @see #isByReference()
	 * @generated
	 */
	void setByReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Corresponding Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Parameter</em>' reference.
	 * @see #setCorrespondingParameter(Parameter)
	 * @see org.servicifi.gelato.language.kernel.references.ReferencesPackage#getArgument_CorrespondingParameter()
	 * @generated
	 */
	Parameter getCorrespondingParameter();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.references.Argument#getCorrespondingParameter <em>Corresponding Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Parameter</em>' reference.
	 * @see #getCorrespondingParameter()
	 * @generated
	 */
	void setCorrespondingParameter(Parameter value);

} // Argument
