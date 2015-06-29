/**
 */
package org.servicifi.gelato.language.cobol.parameters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable#getReturning <em>Returning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.parameters.ParametersPackage#getParametrizable()
 * @model abstract="true"
 * @generated
 */
public interface Parametrizable extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.parameters.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.parameters.ParametersPackage#getParametrizable_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returning</em>' containment reference.
	 * @see #setReturning(Parameter)
	 * @see org.servicifi.gelato.language.cobol.parameters.ParametersPackage#getParametrizable_Returning()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getReturning();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.parameters.Parametrizable#getReturning <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returning</em>' containment reference.
	 * @see #getReturning()
	 * @generated
	 */
	void setReturning(Parameter value);

} // Parametrizable
