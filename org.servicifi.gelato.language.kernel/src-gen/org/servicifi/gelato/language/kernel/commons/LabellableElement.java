/**
 */
package org.servicifi.gelato.language.kernel.commons;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.kernel.flows.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labellable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.commons.LabellableElement#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.commons.CommonsPackage#getLabellableElement()
 * @generated
 */
public interface LabellableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(long)
	 * @see org.servicifi.gelato.language.kernel.commons.CommonsPackage#getLabellableElement_Label()
	 * @generated
	 */
	long getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.kernel.commons.LabellableElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabellableElement first();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<LabellableElement> last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<Flow> internalFlow();

} // LabellableElement
