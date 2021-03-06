/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviated Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedConditionalExpression()
 * @model
 * @generated
 */
public interface AbbreviatedConditionalExpression extends ConditionalAndExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getAbbreviatedConditionalExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbbreviatedConditionalExpressionChild> getChildren();

} // AbbreviatedConditionalExpression
