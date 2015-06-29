/**
 */
package org.servicifi.gelato.language.cobol.functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.CommonsPackage;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.functions.FunctionCall;
import org.servicifi.gelato.language.cobol.functions.FunctionsPackage;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;
import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.DataDescriptorWater;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater;
import org.servicifi.gelato.language.cobol.water.SQLStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SortPhraseWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.UseStatementWater;
import org.servicifi.gelato.language.cobol.water.Water;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.impl.FunctionCallImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallImpl extends ArgumentableImpl implements FunctionCall {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected ReferenceModifier modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(ReferenceModifier newModifier, NotificationChain msgs) {
		ReferenceModifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__MODIFIER, oldModifier, newModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(ReferenceModifier newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION_CALL__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.FUNCTION_CALL__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.FUNCTION_CALL__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__MODIFIER:
				return basicSetModifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__NAME:
				return getName();
			case FunctionsPackage.FUNCTION_CALL__MODIFIER:
				return getModifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__NAME:
				setName((String)newValue);
				return;
			case FunctionsPackage.FUNCTION_CALL__MODIFIER:
				setModifier((ReferenceModifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionsPackage.FUNCTION_CALL__MODIFIER:
				setModifier((ReferenceModifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionsPackage.FUNCTION_CALL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionsPackage.FUNCTION_CALL__MODIFIER:
				return modifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FUNCTION_CALL__NAME: return CommonsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReplacementOperand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Condition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbbreviatedConditionalExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatedAbbreviatedConditionalExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbbreviatedRelationalExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatedConditionalExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleConditionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArithmeticExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RangeExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditiveArithmeticExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeArithmeticExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PowerArithmeticExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryArithmeticExpressionChild.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArithmeticOperand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryOperand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Water.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AcceptStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CICSStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SpecialNamesParagraphWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectComputerParagraphWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RepositoryParagraphWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IOControlParagraphWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IdentificationDivisionWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvokeStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SQLStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UseStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FileDescriptorWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataDescriptorWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SelectStatementWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SortPhraseWater.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
				case FunctionsPackage.FUNCTION_CALL__MODIFIER: return IdentifiersPackage.IDENTIFIER__MODIFIER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAMED_ELEMENT__NAME: return FunctionsPackage.FUNCTION_CALL__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReplacementOperand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Condition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalOrExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalAndExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbbreviatedConditionalExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatedAbbreviatedConditionalExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbbreviatedRelationalExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NegatedConditionalExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleConditionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArithmeticExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RangeExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditiveArithmeticExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicativeArithmeticExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PowerArithmeticExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnaryArithmeticExpressionChild.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArithmeticOperand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryOperand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Water.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AcceptStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CICSStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SpecialNamesParagraphWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectComputerParagraphWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RepositoryParagraphWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IOControlParagraphWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IdentificationDivisionWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvokeStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SQLStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UseStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FileDescriptorWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataDescriptorWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SelectStatementWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SortPhraseWater.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
				case IdentifiersPackage.IDENTIFIER__MODIFIER: return FunctionsPackage.FUNCTION_CALL__MODIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionCallImpl
