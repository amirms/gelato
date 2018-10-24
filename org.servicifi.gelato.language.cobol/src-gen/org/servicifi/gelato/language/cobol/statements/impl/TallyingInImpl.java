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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.TallyingIn;

import org.servicifi.gelato.language.cobol.strings.Tallying;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tallying In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TallyingInImpl extends EObjectImpl implements TallyingIn {
	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected EList<Tallying> occurrences;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Identifier counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TallyingInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.TALLYING_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tallying> getOccurrences() {
		if (occurrences == null) {
			occurrences = new EObjectContainmentEList<Tallying>(Tallying.class, this, StatementsPackage.TALLYING_IN__OCCURRENCES);
		}
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounter(Identifier newCounter, NotificationChain msgs) {
		Identifier oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.TALLYING_IN__COUNTER, oldCounter, newCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Identifier newCounter) {
		if (newCounter != counter) {
			NotificationChain msgs = null;
			if (counter != null)
				msgs = ((InternalEObject)counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TALLYING_IN__COUNTER, null, msgs);
			if (newCounter != null)
				msgs = ((InternalEObject)newCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TALLYING_IN__COUNTER, null, msgs);
			msgs = basicSetCounter(newCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.TALLYING_IN__COUNTER, newCounter, newCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.TALLYING_IN__OCCURRENCES:
				return ((InternalEList<?>)getOccurrences()).basicRemove(otherEnd, msgs);
			case StatementsPackage.TALLYING_IN__COUNTER:
				return basicSetCounter(null, msgs);
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
			case StatementsPackage.TALLYING_IN__OCCURRENCES:
				return getOccurrences();
			case StatementsPackage.TALLYING_IN__COUNTER:
				return getCounter();
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
			case StatementsPackage.TALLYING_IN__OCCURRENCES:
				getOccurrences().clear();
				getOccurrences().addAll((Collection<? extends Tallying>)newValue);
				return;
			case StatementsPackage.TALLYING_IN__COUNTER:
				setCounter((Identifier)newValue);
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
			case StatementsPackage.TALLYING_IN__OCCURRENCES:
				getOccurrences().clear();
				return;
			case StatementsPackage.TALLYING_IN__COUNTER:
				setCounter((Identifier)null);
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
			case StatementsPackage.TALLYING_IN__OCCURRENCES:
				return occurrences != null && !occurrences.isEmpty();
			case StatementsPackage.TALLYING_IN__COUNTER:
				return counter != null;
		}
		return super.eIsSet(featureID);
	}

} //TallyingInImpl
