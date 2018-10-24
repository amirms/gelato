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

import org.servicifi.gelato.language.cobol.environments.Environment;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.Display;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends StatementImpl implements Display {
	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryOperand> operands;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Environment output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryOperand> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList<PrimaryOperand>(PrimaryOperand.class, this, StatementsPackage.DISPLAY__OPERANDS);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Environment newOutput, NotificationChain msgs) {
		Environment oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.DISPLAY__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Environment newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.DISPLAY__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.DISPLAY__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.DISPLAY__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.DISPLAY__OPERANDS:
				return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
			case StatementsPackage.DISPLAY__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case StatementsPackage.DISPLAY__OPERANDS:
				return getOperands();
			case StatementsPackage.DISPLAY__OUTPUT:
				return getOutput();
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
			case StatementsPackage.DISPLAY__OPERANDS:
				getOperands().clear();
				getOperands().addAll((Collection<? extends PrimaryOperand>)newValue);
				return;
			case StatementsPackage.DISPLAY__OUTPUT:
				setOutput((Environment)newValue);
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
			case StatementsPackage.DISPLAY__OPERANDS:
				getOperands().clear();
				return;
			case StatementsPackage.DISPLAY__OUTPUT:
				setOutput((Environment)null);
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
			case StatementsPackage.DISPLAY__OPERANDS:
				return operands != null && !operands.isEmpty();
			case StatementsPackage.DISPLAY__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

} //DisplayImpl
