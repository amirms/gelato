/**
 */
package org.servicifi.gelato.language.cobol.conditions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.conditions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage
 * @generated
 */
public class ConditionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConditionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConditionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConditionsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION: {
				ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression)theEObject;
				T result = caseConditionalOrExpression(conditionalOrExpression);
				if (result == null) result = caseCondition(conditionalOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION_CHILD: {
				ConditionalOrExpressionChild conditionalOrExpressionChild = (ConditionalOrExpressionChild)theEObject;
				T result = caseConditionalOrExpressionChild(conditionalOrExpressionChild);
				if (result == null) result = caseCondition(conditionalOrExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION: {
				NegatedConditionalExpression negatedConditionalExpression = (NegatedConditionalExpression)theEObject;
				T result = caseNegatedConditionalExpression(negatedConditionalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(negatedConditionalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(negatedConditionalExpression);
				if (result == null) result = caseCondition(negatedConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION_CHILD: {
				NegatedConditionalExpressionChild negatedConditionalExpressionChild = (NegatedConditionalExpressionChild)theEObject;
				T result = caseNegatedConditionalExpressionChild(negatedConditionalExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(negatedConditionalExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(negatedConditionalExpressionChild);
				if (result == null) result = caseCondition(negatedConditionalExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SIMPLE_CONDITION_CHILD: {
				SimpleConditionChild simpleConditionChild = (SimpleConditionChild)theEObject;
				T result = caseSimpleConditionChild(simpleConditionChild);
				if (result == null) result = caseNegatedConditionalExpressionChild(simpleConditionChild);
				if (result == null) result = caseConditionalAndExpressionChild(simpleConditionChild);
				if (result == null) result = caseConditionalOrExpressionChild(simpleConditionChild);
				if (result == null) result = caseCondition(simpleConditionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseNegatedConditionalExpressionChild(relationalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(relationalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(relationalExpression);
				if (result == null) result = caseCondition(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.EXPRESSION_LIST: {
				ExpressionList expressionList = (ExpressionList)theEObject;
				T result = caseExpressionList(expressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.CONDITIONAL_AND_EXPRESSION_CHILD: {
				ConditionalAndExpressionChild conditionalAndExpressionChild = (ConditionalAndExpressionChild)theEObject;
				T result = caseConditionalAndExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(conditionalAndExpressionChild);
				if (result == null) result = caseCondition(conditionalAndExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.CONDITIONAL_AND_EXPRESSION: {
				ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression)theEObject;
				T result = caseConditionalAndExpression(conditionalAndExpression);
				if (result == null) result = caseConditionalOrExpressionChild(conditionalAndExpression);
				if (result == null) result = caseCondition(conditionalAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.ABBREVIATED_CONDITIONAL_EXPRESSION: {
				AbbreviatedConditionalExpression abbreviatedConditionalExpression = (AbbreviatedConditionalExpression)theEObject;
				T result = caseAbbreviatedConditionalExpression(abbreviatedConditionalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(abbreviatedConditionalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(abbreviatedConditionalExpression);
				if (result == null) result = caseCondition(abbreviatedConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD: {
				AbbreviatedConditionalExpressionChild abbreviatedConditionalExpressionChild = (AbbreviatedConditionalExpressionChild)theEObject;
				T result = caseAbbreviatedConditionalExpressionChild(abbreviatedConditionalExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(abbreviatedConditionalExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(abbreviatedConditionalExpressionChild);
				if (result == null) result = caseCondition(abbreviatedConditionalExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION: {
				NegatedAbbreviatedConditionalExpression negatedAbbreviatedConditionalExpression = (NegatedAbbreviatedConditionalExpression)theEObject;
				T result = caseNegatedAbbreviatedConditionalExpression(negatedAbbreviatedConditionalExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(negatedAbbreviatedConditionalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(negatedAbbreviatedConditionalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(negatedAbbreviatedConditionalExpression);
				if (result == null) result = caseCondition(negatedAbbreviatedConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD: {
				NegatedAbbreviatedConditionalExpressionChild negatedAbbreviatedConditionalExpressionChild = (NegatedAbbreviatedConditionalExpressionChild)theEObject;
				T result = caseNegatedAbbreviatedConditionalExpressionChild(negatedAbbreviatedConditionalExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(negatedAbbreviatedConditionalExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(negatedAbbreviatedConditionalExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(negatedAbbreviatedConditionalExpressionChild);
				if (result == null) result = caseCondition(negatedAbbreviatedConditionalExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION: {
				AbbreviatedRelationalExpression abbreviatedRelationalExpression = (AbbreviatedRelationalExpression)theEObject;
				T result = caseAbbreviatedRelationalExpression(abbreviatedRelationalExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(abbreviatedRelationalExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(abbreviatedRelationalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(abbreviatedRelationalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(abbreviatedRelationalExpression);
				if (result == null) result = caseCondition(abbreviatedRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION: {
				NestedAbbreviatedConditionalExpression nestedAbbreviatedConditionalExpression = (NestedAbbreviatedConditionalExpression)theEObject;
				T result = caseNestedAbbreviatedConditionalExpression(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseAbbreviatedRelationalExpressionChild(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseConditionalAndExpressionChild(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseConditionalOrExpressionChild(nestedAbbreviatedConditionalExpression);
				if (result == null) result = caseCondition(nestedAbbreviatedConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.SIGN_CONDITION: {
				SignCondition signCondition = (SignCondition)theEObject;
				T result = caseSignCondition(signCondition);
				if (result == null) result = caseNegatedConditionalExpressionChild(signCondition);
				if (result == null) result = caseConditionalAndExpressionChild(signCondition);
				if (result == null) result = caseConditionalOrExpressionChild(signCondition);
				if (result == null) result = caseCondition(signCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.CLASS_CONDITION: {
				ClassCondition classCondition = (ClassCondition)theEObject;
				T result = caseClassCondition(classCondition);
				if (result == null) result = caseNegatedConditionalExpressionChild(classCondition);
				if (result == null) result = caseConditionalAndExpressionChild(classCondition);
				if (result == null) result = caseConditionalOrExpressionChild(classCondition);
				if (result == null) result = caseCondition(classCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION_CHILD: {
				AbbreviatedRelationalExpressionChild abbreviatedRelationalExpressionChild = (AbbreviatedRelationalExpressionChild)theEObject;
				T result = caseAbbreviatedRelationalExpressionChild(abbreviatedRelationalExpressionChild);
				if (result == null) result = caseNegatedAbbreviatedConditionalExpressionChild(abbreviatedRelationalExpressionChild);
				if (result == null) result = caseAbbreviatedConditionalExpressionChild(abbreviatedRelationalExpressionChild);
				if (result == null) result = caseConditionalAndExpressionChild(abbreviatedRelationalExpressionChild);
				if (result == null) result = caseConditionalOrExpressionChild(abbreviatedRelationalExpressionChild);
				if (result == null) result = caseCondition(abbreviatedRelationalExpressionChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConditionsPackage.NESTED_CONDITION: {
				NestedCondition nestedCondition = (NestedCondition)theEObject;
				T result = caseNestedCondition(nestedCondition);
				if (result == null) result = caseSimpleConditionChild(nestedCondition);
				if (result == null) result = caseNegatedConditionalExpressionChild(nestedCondition);
				if (result == null) result = caseConditionalAndExpressionChild(nestedCondition);
				if (result == null) result = caseConditionalOrExpressionChild(nestedCondition);
				if (result == null) result = caseCondition(nestedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpression(ConditionalOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedConditionalExpression(NegatedConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedConditionalExpressionChild(NegatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Condition Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Condition Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleConditionChild(SimpleConditionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionList(ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAndExpression(ConditionalAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedConditionalExpression(AbbreviatedConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedConditionalExpressionChild(AbbreviatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedAbbreviatedConditionalExpression(NegatedAbbreviatedConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negated Abbreviated Conditional Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatedAbbreviatedConditionalExpressionChild(NegatedAbbreviatedConditionalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedRelationalExpression(AbbreviatedRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Abbreviated Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedAbbreviatedConditionalExpression(NestedAbbreviatedConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sign Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sign Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignCondition(SignCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassCondition(ClassCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviated Relational Expression Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviatedRelationalExpressionChild(AbbreviatedRelationalExpressionChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedCondition(NestedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConditionsSwitch
