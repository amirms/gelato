/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.servicifi.gelato.language.cobol.operators.ClassOperator;
import org.servicifi.gelato.language.cobol.operators.Negate;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getClassOperator <em>Class Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getIs <em>Is</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getClassCondition()
 * @model
 * @generated
 */
public interface ClassCondition extends NegatedConditionalExpressionChild {
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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getClassCondition_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleConditionChild getChild();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(SimpleConditionChild value);

	/**
	 * Returns the value of the '<em><b>Class Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Operator</em>' containment reference.
	 * @see #setClassOperator(ClassOperator)
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getClassCondition_ClassOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassOperator getClassOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getClassOperator <em>Class Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Operator</em>' containment reference.
	 * @see #getClassOperator()
	 * @generated
	 */
	void setClassOperator(ClassOperator value);

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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getClassCondition_NegateOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Negate getNegateOperator();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getNegateOperator <em>Negate Operator</em>}' containment reference.
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
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage#getClassCondition_Is()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Is getIs();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Is value);

} // ClassCondition
