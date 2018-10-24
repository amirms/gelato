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

import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;

import org.servicifi.gelato.language.cobol.strings.Location;
import org.servicifi.gelato.language.cobol.strings.Replacement;
import org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence;
import org.servicifi.gelato.language.cobol.strings.StringManipulation;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replacement Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.ReplacementOccurrenceImpl#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplacementOccurrenceImpl extends OccurrenceImpl implements ReplacementOccurrence {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ReplacementOperand target;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected EList<Replacement> occurrences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplacementOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.REPLACEMENT_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacementOperand getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ReplacementOperand newTarget, NotificationChain msgs) {
		ReplacementOperand oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringsPackage.REPLACEMENT_OCCURRENCE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ReplacementOperand newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringsPackage.REPLACEMENT_OCCURRENCE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringsPackage.REPLACEMENT_OCCURRENCE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringsPackage.REPLACEMENT_OCCURRENCE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replacement> getOccurrences() {
		if (occurrences == null) {
			occurrences = new EObjectContainmentEList<Replacement>(Replacement.class, this, StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES);
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
			case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET:
				return basicSetTarget(null, msgs);
			case StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES:
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
			case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS:
				return getLocations();
			case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET:
				return getTarget();
			case StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES:
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
			case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET:
				setTarget((ReplacementOperand)newValue);
				return;
			case StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES:
				getOccurrences().clear();
				getOccurrences().addAll((Collection<? extends Replacement>)newValue);
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
			case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS:
				getLocations().clear();
				return;
			case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET:
				setTarget((ReplacementOperand)null);
				return;
			case StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES:
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
			case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET:
				return target != null;
			case StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES:
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
		if (baseClass == org.servicifi.gelato.language.cobol.strings.String.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringManipulation.class) {
			switch (derivedFeatureID) {
				case StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS: return StringsPackage.STRING_MANIPULATION__LOCATIONS;
				default: return -1;
			}
		}
		if (baseClass == Replacement.class) {
			switch (derivedFeatureID) {
				case StringsPackage.REPLACEMENT_OCCURRENCE__TARGET: return StringsPackage.REPLACEMENT__TARGET;
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
		if (baseClass == org.servicifi.gelato.language.cobol.strings.String.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringManipulation.class) {
			switch (baseFeatureID) {
				case StringsPackage.STRING_MANIPULATION__LOCATIONS: return StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS;
				default: return -1;
			}
		}
		if (baseClass == Replacement.class) {
			switch (baseFeatureID) {
				case StringsPackage.REPLACEMENT__TARGET: return StringsPackage.REPLACEMENT_OCCURRENCE__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReplacementOccurrenceImpl
