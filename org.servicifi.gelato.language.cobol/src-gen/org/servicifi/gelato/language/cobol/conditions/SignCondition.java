/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.SignOperator;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sign Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getSignOperator <em>Sign Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getIs <em>Is</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getSignCondition()
 * @model
 * @generated
 */
public interface SignCondition extends NegatedConditionalExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(SimpleConditionChild)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getSignCondition_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleConditionChild getChild();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(SimpleConditionChild value);

	/**
	 * Returns the value of the '<em><b>Sign Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Operator</em>' containment reference.
	 * @see #setSignOperator(SignOperator)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getSignCondition_SignOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignOperator getSignOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getSignOperator <em>Sign Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Operator</em>' containment reference.
	 * @see #getSignOperator()
	 * @generated
	 */
	void setSignOperator(SignOperator value);

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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getSignCondition_NegateOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Negate getNegateOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getNegateOperator <em>Negate Operator</em>}' containment reference.
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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getSignCondition_Is()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Is getIs();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Is value);

} // SignCondition
