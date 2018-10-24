/**
 */
package org.servicifi.gelato.language.cobol.tables.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

import org.servicifi.gelato.language.cobol.tables.AdditionalIndexName;
import org.servicifi.gelato.language.cobol.tables.IndexName;
import org.servicifi.gelato.language.cobol.tables.TablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl#getAliasesTo <em>Aliases To</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl#getAliasesFrom <em>Aliases From</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl#getAdditionalIndexNames <em>Additional Index Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexNameImpl extends NamedElementImpl implements IndexName {
	/**
	 * The cached value of the '{@link #getAliasesTo() <em>Aliases To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> aliasesTo;

	/**
	 * The cached value of the '{@link #getAliasesFrom() <em>Aliases From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> aliasesFrom;

	/**
	 * The cached value of the '{@link #getAdditionalIndexNames() <em>Additional Index Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalIndexNames()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalIndexName> additionalIndexNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.INDEX_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getAliasesTo() {
		if (aliasesTo == null) {
			aliasesTo = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, TablesPackage.INDEX_NAME__ALIASES_TO, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM);
		}
		return aliasesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getAliasesFrom() {
		if (aliasesFrom == null) {
			aliasesFrom = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, TablesPackage.INDEX_NAME__ALIASES_FROM, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO);
		}
		return aliasesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalIndexName> getAdditionalIndexNames() {
		if (additionalIndexNames == null) {
			additionalIndexNames = new EObjectContainmentEList<AdditionalIndexName>(AdditionalIndexName.class, this, TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES);
		}
		return additionalIndexNames;
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliasesTo()).basicAdd(otherEnd, msgs);
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliasesFrom()).basicAdd(otherEnd, msgs);
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				return ((InternalEList<?>)getAliasesTo()).basicRemove(otherEnd, msgs);
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				return ((InternalEList<?>)getAliasesFrom()).basicRemove(otherEnd, msgs);
			case TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES:
				return ((InternalEList<?>)getAdditionalIndexNames()).basicRemove(otherEnd, msgs);
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				return getAliasesTo();
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				return getAliasesFrom();
			case TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES:
				return getAdditionalIndexNames();
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				getAliasesTo().clear();
				getAliasesTo().addAll((Collection<? extends ReferenceableElement>)newValue);
				return;
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				getAliasesFrom().clear();
				getAliasesFrom().addAll((Collection<? extends ReferenceableElement>)newValue);
				return;
			case TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES:
				getAdditionalIndexNames().clear();
				getAdditionalIndexNames().addAll((Collection<? extends AdditionalIndexName>)newValue);
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				getAliasesTo().clear();
				return;
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				getAliasesFrom().clear();
				return;
			case TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES:
				getAdditionalIndexNames().clear();
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
			case TablesPackage.INDEX_NAME__ALIASES_TO:
				return aliasesTo != null && !aliasesTo.isEmpty();
			case TablesPackage.INDEX_NAME__ALIASES_FROM:
				return aliasesFrom != null && !aliasesFrom.isEmpty();
			case TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES:
				return additionalIndexNames != null && !additionalIndexNames.isEmpty();
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
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				case TablesPackage.INDEX_NAME__ALIASES_TO: return ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;
				case TablesPackage.INDEX_NAME__ALIASES_FROM: return ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;
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
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO: return TablesPackage.INDEX_NAME__ALIASES_TO;
				case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM: return TablesPackage.INDEX_NAME__ALIASES_FROM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IndexNameImpl
