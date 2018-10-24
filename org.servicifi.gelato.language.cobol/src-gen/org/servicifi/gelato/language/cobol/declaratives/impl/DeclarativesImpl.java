/**
 */
package org.servicifi.gelato.language.cobol.declaratives.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.declaratives.Declaratives;
import org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage;

import org.servicifi.gelato.language.cobol.sections.DeclarativeSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaratives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.declaratives.impl.DeclarativesImpl#getDeclarativeSections <em>Declarative Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativesImpl extends EObjectImpl implements Declaratives {
	/**
	 * The cached value of the '{@link #getDeclarativeSections() <em>Declarative Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarativeSections()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclarativeSection> declarativeSections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarativesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarativesPackage.Literals.DECLARATIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclarativeSection> getDeclarativeSections() {
		if (declarativeSections == null) {
			declarativeSections = new EObjectContainmentEList<DeclarativeSection>(DeclarativeSection.class, this, DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS);
		}
		return declarativeSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS:
				return ((InternalEList<?>)getDeclarativeSections()).basicRemove(otherEnd, msgs);
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
			case DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS:
				return getDeclarativeSections();
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
			case DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS:
				getDeclarativeSections().clear();
				getDeclarativeSections().addAll((Collection<? extends DeclarativeSection>)newValue);
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
			case DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS:
				getDeclarativeSections().clear();
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
			case DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS:
				return declarativeSections != null && !declarativeSections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclarativesImpl
