/**
 */
package org.servicifi.gelato.language.kernel.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.expressions.Definition#getReaches <em>Reaches</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage#getDefinition()
 * @generated
 */
public interface Definition extends SubExpression {
	/**
	 * Returns the value of the '<em><b>Reaches</b></em>' reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.kernel.expressions.Usage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaches</em>' reference list.
	 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage#getDefinition_Reaches()
	 * @generated
	 */
	EList<Usage> getReaches();

} // Definition
