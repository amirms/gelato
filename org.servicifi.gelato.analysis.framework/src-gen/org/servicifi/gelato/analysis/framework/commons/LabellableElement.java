/**
 */
package org.servicifi.gelato.analysis.framework.commons;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labellable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.analysis.framework.commons.CommonsPackage#getLabellableElement()
 * @model abstract="true"
 * @generated
 */
public interface LabellableElement extends Node {
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
	 * @see org.servicifi.gelato.analysis.framework.commons.CommonsPackage#getLabellableElement_Label()
	 * @model required="true"
	 * @generated
	 */
	long getLabel();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.analysis.framework.commons.LabellableElement#getLabel <em>Label</em>}' attribute.
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
	 * @model required="true"
	 * @generated
	 */
	LabellableElement first();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	EList<EList<LabellableElement>> last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	EList<EList<Flow>> internalFlow();

} // LabellableElement
