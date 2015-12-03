/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.handlers.Handler;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

import org.servicifi.gelato.language.cobol.statements.ArithmeticStatement;
import org.servicifi.gelato.language.cobol.statements.Corresponding;
import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl#getCorresponding <em>Corresponding</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl#getGivings <em>Givings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArithmeticStatementImpl extends StatementImpl implements ArithmeticStatement {
	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> handlers;

	/**
	 * The default value of the '{@link #getCorresponding() <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresponding()
	 * @generated
	 * @ordered
	 */
	protected static final Corresponding CORRESPONDING_EDEFAULT = Corresponding.CORR;

	/**
	 * The cached value of the '{@link #getCorresponding() <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresponding()
	 * @generated
	 * @ordered
	 */
	protected Corresponding corresponding = CORRESPONDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperand> operands;

	/**
	 * The cached value of the '{@link #getGivings() <em>Givings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivings()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperand> givings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ARITHMETIC_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corresponding getCorresponding() {
		return corresponding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorresponding(Corresponding newCorresponding) {
		Corresponding oldCorresponding = corresponding;
		corresponding = newCorresponding == null ? CORRESPONDING_EDEFAULT : newCorresponding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ARITHMETIC_STATEMENT__CORRESPONDING, oldCorresponding, corresponding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperand> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList<ArithmeticOperand>(ArithmeticOperand.class, this, StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperand> getGivings() {
		if (givings == null) {
			givings = new EObjectContainmentEList<ArithmeticOperand>(ArithmeticOperand.class, this, StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS);
		}
		return givings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS:
				return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
			case StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS:
				return ((InternalEList<?>)getGivings()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS:
				return getHandlers();
			case StatementsPackage.ARITHMETIC_STATEMENT__CORRESPONDING:
				return getCorresponding();
			case StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS:
				return getOperands();
			case StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS:
				return getGivings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__CORRESPONDING:
				setCorresponding((Corresponding)newValue);
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS:
				getOperands().clear();
				getOperands().addAll((Collection<? extends ArithmeticOperand>)newValue);
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS:
				getGivings().clear();
				getGivings().addAll((Collection<? extends ArithmeticOperand>)newValue);
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
			case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS:
				getHandlers().clear();
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__CORRESPONDING:
				setCorresponding(CORRESPONDING_EDEFAULT);
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS:
				getOperands().clear();
				return;
			case StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS:
				getGivings().clear();
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
			case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case StatementsPackage.ARITHMETIC_STATEMENT__CORRESPONDING:
				return corresponding != CORRESPONDING_EDEFAULT;
			case StatementsPackage.ARITHMETIC_STATEMENT__OPERANDS:
				return operands != null && !operands.isEmpty();
			case StatementsPackage.ARITHMETIC_STATEMENT__GIVINGS:
				return givings != null && !givings.isEmpty();
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
		if (baseClass == ErrorHandled.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS: return StatementsPackage.ERROR_HANDLED__HANDLERS;
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
		if (baseClass == ErrorHandled.class) {
			switch (baseFeatureID) {
				case StatementsPackage.ERROR_HANDLED__HANDLERS: return StatementsPackage.ARITHMETIC_STATEMENT__HANDLERS;
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
		result.append(" (corresponding: ");
		result.append(corresponding);
		result.append(')');
		return result.toString();
	}

} //ArithmeticStatementImpl
