/**
 */
package org.servicifi.gelato.language.kernel.flows;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.flows.Flow#getTo <em>To</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.flows.Flow#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.flows.FlowsPackage#getFlow()
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #isSetTo()
	 * @see #unsetTo()
	 * @see #setTo(LabellableElement)
	 * @see org.servicifi.gelato.language.kernel.flows.FlowsPackage#getFlow_To()
	 * @generated
	 */
	LabellableElement getTo();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.flows.Flow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #isSetTo()
	 * @see #unsetTo()
	 * @see #getTo()
	 * @generated
	 */
	void setTo(LabellableElement value);

	/**
	 * Unsets the value of the '{@link org.servicifi.gelato.language.kernel.flows.Flow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTo()
	 * @see #getTo()
	 * @see #setTo(LabellableElement)
	 * @generated
	 */
	void unsetTo();

	/**
	 * Returns whether the value of the '{@link org.servicifi.gelato.language.kernel.flows.Flow#getTo <em>To</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>To</em>' reference is set.
	 * @see #unsetTo()
	 * @see #getTo()
	 * @see #setTo(LabellableElement)
	 * @generated
	 */
	boolean isSetTo();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(LabellableElement)
	 * @see org.servicifi.gelato.language.kernel.flows.FlowsPackage#getFlow_From()
	 * @generated
	 */
	LabellableElement getFrom();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.flows.Flow#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(LabellableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Flow reverse();

} // Flow
