/**
 */
package org.servicifi.gelato.language.kernel.expressions;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.expressions.Expression#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage#getExpression()
 * @generated
 */
public interface Expression extends LabellableElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.expressions.SubExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage#getExpression_Children()
	 * @generated
	 */
	EList<SubExpression> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<org.servicifi.gelato.language.kernel.dataitems.DataItem> getDefinedVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EList<org.servicifi.gelato.language.kernel.dataitems.DataItem> getUsedVariables();

} // Expression
