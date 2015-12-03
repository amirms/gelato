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

import org.servicifi.gelato.language.cobol.functions.Argument;
import org.servicifi.gelato.language.cobol.functions.Argumentable;
import org.servicifi.gelato.language.cobol.functions.FunctionsPackage;

import org.servicifi.gelato.language.cobol.handlers.Handler;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.Call;
import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl#getReturning <em>Returning</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl#getSubprogram <em>Subprogram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends StatementImpl implements Call {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturning()
	 * @generated
	 * @ordered
	 */
	protected Argument returning;

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
	 * The cached value of the '{@link #getSubprogram() <em>Subprogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogram()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand subprogram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, StatementsPackage.CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getReturning() {
		return returning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturning(Argument newReturning, NotificationChain msgs) {
		Argument oldReturning = returning;
		returning = newReturning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.CALL__RETURNING, oldReturning, newReturning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturning(Argument newReturning) {
		if (newReturning != returning) {
			NotificationChain msgs = null;
			if (returning != null)
				msgs = ((InternalEObject)returning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.CALL__RETURNING, null, msgs);
			if (newReturning != null)
				msgs = ((InternalEObject)newReturning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.CALL__RETURNING, null, msgs);
			msgs = basicSetReturning(newReturning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CALL__RETURNING, newReturning, newReturning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, StatementsPackage.CALL__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getSubprogram() {
		return subprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubprogram(PrimaryOperand newSubprogram, NotificationChain msgs) {
		PrimaryOperand oldSubprogram = subprogram;
		subprogram = newSubprogram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.CALL__SUBPROGRAM, oldSubprogram, newSubprogram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubprogram(PrimaryOperand newSubprogram) {
		if (newSubprogram != subprogram) {
			NotificationChain msgs = null;
			if (subprogram != null)
				msgs = ((InternalEObject)subprogram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.CALL__SUBPROGRAM, null, msgs);
			if (newSubprogram != null)
				msgs = ((InternalEObject)newSubprogram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.CALL__SUBPROGRAM, null, msgs);
			msgs = basicSetSubprogram(newSubprogram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CALL__SUBPROGRAM, newSubprogram, newSubprogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case StatementsPackage.CALL__RETURNING:
				return basicSetReturning(null, msgs);
			case StatementsPackage.CALL__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.CALL__SUBPROGRAM:
				return basicSetSubprogram(null, msgs);
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
			case StatementsPackage.CALL__ARGUMENTS:
				return getArguments();
			case StatementsPackage.CALL__RETURNING:
				return getReturning();
			case StatementsPackage.CALL__HANDLERS:
				return getHandlers();
			case StatementsPackage.CALL__SUBPROGRAM:
				return getSubprogram();
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
			case StatementsPackage.CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case StatementsPackage.CALL__RETURNING:
				setReturning((Argument)newValue);
				return;
			case StatementsPackage.CALL__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case StatementsPackage.CALL__SUBPROGRAM:
				setSubprogram((PrimaryOperand)newValue);
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
			case StatementsPackage.CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case StatementsPackage.CALL__RETURNING:
				setReturning((Argument)null);
				return;
			case StatementsPackage.CALL__HANDLERS:
				getHandlers().clear();
				return;
			case StatementsPackage.CALL__SUBPROGRAM:
				setSubprogram((PrimaryOperand)null);
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
			case StatementsPackage.CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case StatementsPackage.CALL__RETURNING:
				return returning != null;
			case StatementsPackage.CALL__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case StatementsPackage.CALL__SUBPROGRAM:
				return subprogram != null;
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
		if (baseClass == Argumentable.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.CALL__ARGUMENTS: return FunctionsPackage.ARGUMENTABLE__ARGUMENTS;
				case StatementsPackage.CALL__RETURNING: return FunctionsPackage.ARGUMENTABLE__RETURNING;
				default: return -1;
			}
		}
		if (baseClass == ErrorHandled.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.CALL__HANDLERS: return StatementsPackage.ERROR_HANDLED__HANDLERS;
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
		if (baseClass == Argumentable.class) {
			switch (baseFeatureID) {
				case FunctionsPackage.ARGUMENTABLE__ARGUMENTS: return StatementsPackage.CALL__ARGUMENTS;
				case FunctionsPackage.ARGUMENTABLE__RETURNING: return StatementsPackage.CALL__RETURNING;
				default: return -1;
			}
		}
		if (baseClass == ErrorHandled.class) {
			switch (baseFeatureID) {
				case StatementsPackage.ERROR_HANDLED__HANDLERS: return StatementsPackage.CALL__HANDLERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CallImpl
