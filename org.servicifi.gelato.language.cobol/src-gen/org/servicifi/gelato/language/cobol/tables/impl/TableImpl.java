/**
 */
package org.servicifi.gelato.language.cobol.tables.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.tables.IndexName;
import org.servicifi.gelato.language.cobol.tables.KeyName;
import org.servicifi.gelato.language.cobol.tables.Table;
import org.servicifi.gelato.language.cobol.tables.TableDimension;
import org.servicifi.gelato.language.cobol.tables.TablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl#getTableDimension <em>Table Dimension</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl#getIndexedBy <em>Indexed By</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl#getKeysAre <em>Keys Are</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl#getMaxTableDimension <em>Max Table Dimension</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends DataItemImpl implements Table {
	/**
	 * The cached value of the '{@link #getTableDimension() <em>Table Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableDimension()
	 * @generated
	 * @ordered
	 */
	protected TableDimension tableDimension;

	/**
	 * The cached value of the '{@link #getIndexedBy() <em>Indexed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexedBy()
	 * @generated
	 * @ordered
	 */
	protected IndexName indexedBy;

	/**
	 * The cached value of the '{@link #getKeysAre() <em>Keys Are</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysAre()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyName> keysAre;

	/**
	 * The cached value of the '{@link #getMaxTableDimension() <em>Max Table Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTableDimension()
	 * @generated
	 * @ordered
	 */
	protected TableDimension maxTableDimension;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference dependsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDimension getTableDimension() {
		return tableDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableDimension(TableDimension newTableDimension, NotificationChain msgs) {
		TableDimension oldTableDimension = tableDimension;
		tableDimension = newTableDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__TABLE_DIMENSION, oldTableDimension, newTableDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableDimension(TableDimension newTableDimension) {
		if (newTableDimension != tableDimension) {
			NotificationChain msgs = null;
			if (tableDimension != null)
				msgs = ((InternalEObject)tableDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__TABLE_DIMENSION, null, msgs);
			if (newTableDimension != null)
				msgs = ((InternalEObject)newTableDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__TABLE_DIMENSION, null, msgs);
			msgs = basicSetTableDimension(newTableDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__TABLE_DIMENSION, newTableDimension, newTableDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexName getIndexedBy() {
		return indexedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexedBy(IndexName newIndexedBy, NotificationChain msgs) {
		IndexName oldIndexedBy = indexedBy;
		indexedBy = newIndexedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__INDEXED_BY, oldIndexedBy, newIndexedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexedBy(IndexName newIndexedBy) {
		if (newIndexedBy != indexedBy) {
			NotificationChain msgs = null;
			if (indexedBy != null)
				msgs = ((InternalEObject)indexedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__INDEXED_BY, null, msgs);
			if (newIndexedBy != null)
				msgs = ((InternalEObject)newIndexedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__INDEXED_BY, null, msgs);
			msgs = basicSetIndexedBy(newIndexedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__INDEXED_BY, newIndexedBy, newIndexedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyName> getKeysAre() {
		if (keysAre == null) {
			keysAre = new EObjectContainmentEList<KeyName>(KeyName.class, this, TablesPackage.TABLE__KEYS_ARE);
		}
		return keysAre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDimension getMaxTableDimension() {
		return maxTableDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxTableDimension(TableDimension newMaxTableDimension, NotificationChain msgs) {
		TableDimension oldMaxTableDimension = maxTableDimension;
		maxTableDimension = newMaxTableDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__MAX_TABLE_DIMENSION, oldMaxTableDimension, newMaxTableDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTableDimension(TableDimension newMaxTableDimension) {
		if (newMaxTableDimension != maxTableDimension) {
			NotificationChain msgs = null;
			if (maxTableDimension != null)
				msgs = ((InternalEObject)maxTableDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__MAX_TABLE_DIMENSION, null, msgs);
			if (newMaxTableDimension != null)
				msgs = ((InternalEObject)newMaxTableDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__MAX_TABLE_DIMENSION, null, msgs);
			msgs = basicSetMaxTableDimension(newMaxTableDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__MAX_TABLE_DIMENSION, newMaxTableDimension, newMaxTableDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(IdentifierReference newDependsOn, NotificationChain msgs) {
		IdentifierReference oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(IdentifierReference newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.TABLE__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.TABLE__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.TABLE__TABLE_DIMENSION:
				return basicSetTableDimension(null, msgs);
			case TablesPackage.TABLE__INDEXED_BY:
				return basicSetIndexedBy(null, msgs);
			case TablesPackage.TABLE__KEYS_ARE:
				return ((InternalEList<?>)getKeysAre()).basicRemove(otherEnd, msgs);
			case TablesPackage.TABLE__MAX_TABLE_DIMENSION:
				return basicSetMaxTableDimension(null, msgs);
			case TablesPackage.TABLE__DEPENDS_ON:
				return basicSetDependsOn(null, msgs);
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
			case TablesPackage.TABLE__TABLE_DIMENSION:
				return getTableDimension();
			case TablesPackage.TABLE__INDEXED_BY:
				return getIndexedBy();
			case TablesPackage.TABLE__KEYS_ARE:
				return getKeysAre();
			case TablesPackage.TABLE__MAX_TABLE_DIMENSION:
				return getMaxTableDimension();
			case TablesPackage.TABLE__DEPENDS_ON:
				return getDependsOn();
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
			case TablesPackage.TABLE__TABLE_DIMENSION:
				setTableDimension((TableDimension)newValue);
				return;
			case TablesPackage.TABLE__INDEXED_BY:
				setIndexedBy((IndexName)newValue);
				return;
			case TablesPackage.TABLE__KEYS_ARE:
				getKeysAre().clear();
				getKeysAre().addAll((Collection<? extends KeyName>)newValue);
				return;
			case TablesPackage.TABLE__MAX_TABLE_DIMENSION:
				setMaxTableDimension((TableDimension)newValue);
				return;
			case TablesPackage.TABLE__DEPENDS_ON:
				setDependsOn((IdentifierReference)newValue);
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
			case TablesPackage.TABLE__TABLE_DIMENSION:
				setTableDimension((TableDimension)null);
				return;
			case TablesPackage.TABLE__INDEXED_BY:
				setIndexedBy((IndexName)null);
				return;
			case TablesPackage.TABLE__KEYS_ARE:
				getKeysAre().clear();
				return;
			case TablesPackage.TABLE__MAX_TABLE_DIMENSION:
				setMaxTableDimension((TableDimension)null);
				return;
			case TablesPackage.TABLE__DEPENDS_ON:
				setDependsOn((IdentifierReference)null);
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
			case TablesPackage.TABLE__TABLE_DIMENSION:
				return tableDimension != null;
			case TablesPackage.TABLE__INDEXED_BY:
				return indexedBy != null;
			case TablesPackage.TABLE__KEYS_ARE:
				return keysAre != null && !keysAre.isEmpty();
			case TablesPackage.TABLE__MAX_TABLE_DIMENSION:
				return maxTableDimension != null;
			case TablesPackage.TABLE__DEPENDS_ON:
				return dependsOn != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
