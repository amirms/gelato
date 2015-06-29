/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.common.util.EList;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends NegatedConditionalExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getRelationalExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleConditionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' containment reference.
	 * @see #setRelationalOperator(RelationalOperator)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getRelationalExpression_RelationalOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationalOperator getRelationalOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' containment reference.
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate Operator</em>' containment reference.
	 * @see #setNegateOperator(Negate)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getRelationalExpression_NegateOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Negate getNegateOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getNegateOperator <em>Negate Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate Operator</em>' containment reference.
	 * @see #getNegateOperator()
	 * @generated
	 */
	void setNegateOperator(Negate value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Is)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getRelationalExpression_Is()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Is getIs();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Is value);

} // RelationalExpression
