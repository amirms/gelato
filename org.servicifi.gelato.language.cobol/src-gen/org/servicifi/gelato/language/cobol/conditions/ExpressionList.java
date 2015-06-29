/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ExpressionList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getExpressionList_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getExpressions();

} // ExpressionList
