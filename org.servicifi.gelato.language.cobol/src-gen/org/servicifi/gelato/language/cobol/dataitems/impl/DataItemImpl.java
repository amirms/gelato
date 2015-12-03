/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;
import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;

import org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;
import org.servicifi.gelato.language.cobol.water.Water;
import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl#getWater <em>Water</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl#getLevelNumber <em>Level Number</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl#getSubentries <em>Subentries</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl#getSuperentry <em>Superentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataItemImpl extends ReferenceableElementImpl implements DataItem {
	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected EList<Water> water;

	/**
	 * The default value of the '{@link #getLevelNumber() <em>Level Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelNumber() <em>Level Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelNumber()
	 * @generated
	 * @ordered
	 */
	protected String levelNumber = LEVEL_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItemAttribute> attributes;

	/**
	 * The cached value of the '{@link #getSubentries() <em>Subentries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubentries()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> subentries;

	/**
	 * The cached value of the '{@link #getSuperentry() <em>Superentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperentry()
	 * @generated
	 * @ordered
	 */
	protected DataItem superentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataitemsPackage.Literals.DATA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Water> getWater() {
		if (water == null) {
			water = new EObjectContainmentEList<Water>(Water.class, this, DataitemsPackage.DATA_ITEM__WATER);
		}
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelNumber() {
		return levelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelNumber(String newLevelNumber) {
		String oldLevelNumber = levelNumber;
		levelNumber = newLevelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.DATA_ITEM__LEVEL_NUMBER, oldLevelNumber, levelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItemAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DataItemAttribute>(DataItemAttribute.class, this, DataitemsPackage.DATA_ITEM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getSubentries() {
		if (subentries == null) {
			subentries = new EObjectWithInverseResolvingEList<DataItem>(DataItem.class, this, DataitemsPackage.DATA_ITEM__SUBENTRIES, DataitemsPackage.DATA_ITEM__SUPERENTRY);
		}
		return subentries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getSuperentry() {
		if (superentry != null && superentry.eIsProxy()) {
			InternalEObject oldSuperentry = (InternalEObject)superentry;
			superentry = (DataItem)eResolveProxy(oldSuperentry);
			if (superentry != oldSuperentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataitemsPackage.DATA_ITEM__SUPERENTRY, oldSuperentry, superentry));
			}
		}
		return superentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem basicGetSuperentry() {
		return superentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperentry(DataItem newSuperentry, NotificationChain msgs) {
		DataItem oldSuperentry = superentry;
		superentry = newSuperentry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataitemsPackage.DATA_ITEM__SUPERENTRY, oldSuperentry, newSuperentry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperentry(DataItem newSuperentry) {
		if (newSuperentry != superentry) {
			NotificationChain msgs = null;
			if (superentry != null)
				msgs = ((InternalEObject)superentry).eInverseRemove(this, DataitemsPackage.DATA_ITEM__SUBENTRIES, DataItem.class, msgs);
			if (newSuperentry != null)
				msgs = ((InternalEObject)newSuperentry).eInverseAdd(this, DataitemsPackage.DATA_ITEM__SUBENTRIES, DataItem.class, msgs);
			msgs = basicSetSuperentry(newSuperentry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.DATA_ITEM__SUPERENTRY, newSuperentry, newSuperentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubentries()).basicAdd(otherEnd, msgs);
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				if (superentry != null)
					msgs = ((InternalEObject)superentry).eInverseRemove(this, DataitemsPackage.DATA_ITEM__SUBENTRIES, DataItem.class, msgs);
				return basicSetSuperentry((DataItem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataitemsPackage.DATA_ITEM__WATER:
				return ((InternalEList<?>)getWater()).basicRemove(otherEnd, msgs);
			case DataitemsPackage.DATA_ITEM__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				return ((InternalEList<?>)getSubentries()).basicRemove(otherEnd, msgs);
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				return basicSetSuperentry(null, msgs);
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
			case DataitemsPackage.DATA_ITEM__WATER:
				return getWater();
			case DataitemsPackage.DATA_ITEM__LEVEL_NUMBER:
				return getLevelNumber();
			case DataitemsPackage.DATA_ITEM__ATTRIBUTES:
				return getAttributes();
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				return getSubentries();
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				if (resolve) return getSuperentry();
				return basicGetSuperentry();
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
			case DataitemsPackage.DATA_ITEM__WATER:
				getWater().clear();
				getWater().addAll((Collection<? extends Water>)newValue);
				return;
			case DataitemsPackage.DATA_ITEM__LEVEL_NUMBER:
				setLevelNumber((String)newValue);
				return;
			case DataitemsPackage.DATA_ITEM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DataItemAttribute>)newValue);
				return;
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				getSubentries().clear();
				getSubentries().addAll((Collection<? extends DataItem>)newValue);
				return;
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				setSuperentry((DataItem)newValue);
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
			case DataitemsPackage.DATA_ITEM__WATER:
				getWater().clear();
				return;
			case DataitemsPackage.DATA_ITEM__LEVEL_NUMBER:
				setLevelNumber(LEVEL_NUMBER_EDEFAULT);
				return;
			case DataitemsPackage.DATA_ITEM__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				getSubentries().clear();
				return;
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				setSuperentry((DataItem)null);
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
			case DataitemsPackage.DATA_ITEM__WATER:
				return water != null && !water.isEmpty();
			case DataitemsPackage.DATA_ITEM__LEVEL_NUMBER:
				return LEVEL_NUMBER_EDEFAULT == null ? levelNumber != null : !LEVEL_NUMBER_EDEFAULT.equals(levelNumber);
			case DataitemsPackage.DATA_ITEM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DataitemsPackage.DATA_ITEM__SUBENTRIES:
				return subentries != null && !subentries.isEmpty();
			case DataitemsPackage.DATA_ITEM__SUPERENTRY:
				return superentry != null;
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
		if (baseClass == IncompleteElement.class) {
			switch (derivedFeatureID) {
				case DataitemsPackage.DATA_ITEM__WATER: return WaterPackage.INCOMPLETE_ELEMENT__WATER;
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
		if (baseClass == IncompleteElement.class) {
			switch (baseFeatureID) {
				case WaterPackage.INCOMPLETE_ELEMENT__WATER: return DataitemsPackage.DATA_ITEM__WATER;
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
		result.append(" (levelNumber: ");
		result.append(levelNumber);
		result.append(')');
		return result.toString();
	}

} //DataItemImpl
