/**
 */
package org.servicifi.gelato.language.cobol.strings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.strings.Occurrence;
import org.servicifi.gelato.language.cobol.strings.Occurrences;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;
import org.servicifi.gelato.language.cobol.strings.Tallying;
import org.servicifi.gelato.language.cobol.strings.TallyingOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tallying Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.TallyingOccurrenceImpl#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TallyingOccurrenceImpl extends TallyingImpl implements TallyingOccurrence {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Occurrences TYPE_EDEFAULT = Occurrences.ALL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Occurrences type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TallyingOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.TALLYING_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occurrences getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Occurrences newType) {
		Occurrences oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringsPackage.TALLYING_OCCURRENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tallying> getOccurrences() {
		if (occurrences == null) {
			occurrences = new EObjectContainmentEList<Tallying>(Tallying.class, this, StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES);
		}
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES:
				return ((InternalEList<?>)getOccurrences()).basicRemove(otherEnd, msgs);
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
			case StringsPackage.TALLYING_OCCURRENCE__TYPE:
				return getType();
			case StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES:
				return getOccurrences();
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
			case StringsPackage.TALLYING_OCCURRENCE__TYPE:
				setType((Occurrences)newValue);
				return;
			case StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES:
				getOccurrences().clear();
				getOccurrences().addAll((Collection<? extends Tallying>)newValue);
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
			case StringsPackage.TALLYING_OCCURRENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES:
				getOccurrences().clear();
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
			case StringsPackage.TALLYING_OCCURRENCE__TYPE:
				return type != TYPE_EDEFAULT;
			case StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES:
				return occurrences != null && !occurrences.isEmpty();
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
		if (baseClass == Occurrence.class) {
			switch (derivedFeatureID) {
				case StringsPackage.TALLYING_OCCURRENCE__TYPE: return StringsPackage.OCCURRENCE__TYPE;
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
		if (baseClass == Occurrence.class) {
			switch (baseFeatureID) {
				case StringsPackage.OCCURRENCE__TYPE: return StringsPackage.TALLYING_OCCURRENCE__TYPE;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TallyingOccurrenceImpl
