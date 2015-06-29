/**
 */
package org.servicifi.gelato.language.cobol.references.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl#getAliasesTo <em>Aliases To</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.references.impl.ReferenceableElementImpl#getAliasesFrom <em>Aliases From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReferenceableElementImpl extends NamedElementImpl implements ReferenceableElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.REFERENCEABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getAliasesTo() {
		if (aliasesTo == null) {
			aliasesTo = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM);
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
			aliasesFrom = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO);
		}
		return aliasesFrom;
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliasesTo()).basicAdd(otherEnd, msgs);
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				return ((InternalEList<?>)getAliasesTo()).basicRemove(otherEnd, msgs);
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
				return ((InternalEList<?>)getAliasesFrom()).basicRemove(otherEnd, msgs);
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				return getAliasesTo();
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
				return getAliasesFrom();
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				getAliasesTo().clear();
				getAliasesTo().addAll((Collection<? extends ReferenceableElement>)newValue);
				return;
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
				getAliasesFrom().clear();
				getAliasesFrom().addAll((Collection<? extends ReferenceableElement>)newValue);
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				getAliasesTo().clear();
				return;
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
				getAliasesFrom().clear();
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
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO:
				return aliasesTo != null && !aliasesTo.isEmpty();
			case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM:
				return aliasesFrom != null && !aliasesFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceableElementImpl
