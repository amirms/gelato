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

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.Inspect;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.TallyingIn;

import org.servicifi.gelato.language.cobol.strings.Replacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl#getTallyingIns <em>Tallying Ins</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl#getReplacements <em>Replacements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl#getConversions <em>Conversions</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectImpl extends StatementImpl implements Inspect {
	/**
	 * The cached value of the '{@link #getTallyingIns() <em>Tallying Ins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTallyingIns()
	 * @generated
	 * @ordered
	 */
	protected EList<TallyingIn> tallyingIns;

	/**
	 * The cached value of the '{@link #getReplacements() <em>Replacements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacements()
	 * @generated
	 * @ordered
	 */
	protected EList<Replacement> replacements;

	/**
	 * The cached value of the '{@link #getConversions() <em>Conversions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversions()
	 * @generated
	 * @ordered
	 */
	protected EList<Replacement> conversions;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand string;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.INSPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TallyingIn> getTallyingIns() {
		if (tallyingIns == null) {
			tallyingIns = new EObjectContainmentEList<TallyingIn>(TallyingIn.class, this, StatementsPackage.INSPECT__TALLYING_INS);
		}
		return tallyingIns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replacement> getReplacements() {
		if (replacements == null) {
			replacements = new EObjectContainmentEList<Replacement>(Replacement.class, this, StatementsPackage.INSPECT__REPLACEMENTS);
		}
		return replacements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replacement> getConversions() {
		if (conversions == null) {
			conversions = new EObjectContainmentEList<Replacement>(Replacement.class, this, StatementsPackage.INSPECT__CONVERSIONS);
		}
		return conversions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(PrimaryOperand newString, NotificationChain msgs) {
		PrimaryOperand oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.INSPECT__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(PrimaryOperand newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.INSPECT__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.INSPECT__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.INSPECT__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.INSPECT__TALLYING_INS:
				return ((InternalEList<?>)getTallyingIns()).basicRemove(otherEnd, msgs);
			case StatementsPackage.INSPECT__REPLACEMENTS:
				return ((InternalEList<?>)getReplacements()).basicRemove(otherEnd, msgs);
			case StatementsPackage.INSPECT__CONVERSIONS:
				return ((InternalEList<?>)getConversions()).basicRemove(otherEnd, msgs);
			case StatementsPackage.INSPECT__STRING:
				return basicSetString(null, msgs);
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
			case StatementsPackage.INSPECT__TALLYING_INS:
				return getTallyingIns();
			case StatementsPackage.INSPECT__REPLACEMENTS:
				return getReplacements();
			case StatementsPackage.INSPECT__CONVERSIONS:
				return getConversions();
			case StatementsPackage.INSPECT__STRING:
				return getString();
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
			case StatementsPackage.INSPECT__TALLYING_INS:
				getTallyingIns().clear();
				getTallyingIns().addAll((Collection<? extends TallyingIn>)newValue);
				return;
			case StatementsPackage.INSPECT__REPLACEMENTS:
				getReplacements().clear();
				getReplacements().addAll((Collection<? extends Replacement>)newValue);
				return;
			case StatementsPackage.INSPECT__CONVERSIONS:
				getConversions().clear();
				getConversions().addAll((Collection<? extends Replacement>)newValue);
				return;
			case StatementsPackage.INSPECT__STRING:
				setString((PrimaryOperand)newValue);
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
			case StatementsPackage.INSPECT__TALLYING_INS:
				getTallyingIns().clear();
				return;
			case StatementsPackage.INSPECT__REPLACEMENTS:
				getReplacements().clear();
				return;
			case StatementsPackage.INSPECT__CONVERSIONS:
				getConversions().clear();
				return;
			case StatementsPackage.INSPECT__STRING:
				setString((PrimaryOperand)null);
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
			case StatementsPackage.INSPECT__TALLYING_INS:
				return tallyingIns != null && !tallyingIns.isEmpty();
			case StatementsPackage.INSPECT__REPLACEMENTS:
				return replacements != null && !replacements.isEmpty();
			case StatementsPackage.INSPECT__CONVERSIONS:
				return conversions != null && !conversions.isEmpty();
			case StatementsPackage.INSPECT__STRING:
				return string != null;
		}
		return super.eIsSet(featureID);
	}

} //InspectImpl
