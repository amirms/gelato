/**
 */
package org.servicifi.gelato.analysis.framework.flows;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.flows.Flow#getTo <em>To</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.flows.Flow#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.flows.FlowsPackage#getFlow()
 * @model
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
	 * @see org.servicifi.gelato.analysis.framework.flows.FlowsPackage#getFlow_To()
	 * @model unsettable="true"
	 * @generated
	 */
	LabellableElement getTo();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.flows.Flow#getTo <em>To</em>}' reference.
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
	 * Unsets the value of the '{@link org.servicifi.gelato.analysis.framework.flows.Flow#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTo()
	 * @see #getTo()
	 * @see #setTo(LabellableElement)
	 * @generated
	 */
	void unsetTo();

	/**
	 * Returns whether the value of the '{@link org.servicifi.gelato.analysis.framework.flows.Flow#getTo <em>To</em>}' reference is set.
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
	 * @see org.servicifi.gelato.analysis.framework.flows.FlowsPackage#getFlow_From()
	 * @model
	 * @generated
	 */
	LabellableElement getFrom();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.flows.Flow#getFrom <em>From</em>}' reference.
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
	 * @model
	 * @generated
	 */
	Flow reverse();

} // Flow
