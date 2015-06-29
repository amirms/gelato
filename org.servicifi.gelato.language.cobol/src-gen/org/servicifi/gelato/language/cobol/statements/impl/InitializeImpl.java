/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.statements.Initialize;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

import org.servicifi.gelato.language.cobol.strings.Replacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl#getSubprograms <em>Subprograms</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl#getReplacements <em>Replacements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitializeImpl extends StatementImpl implements Initialize {
	/**
	 * The cached value of the '{@link #getSubprograms() <em>Subprograms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> subprograms;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.INITIALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getSubprograms() {
		if (subprograms == null) {
			subprograms = new EObjectContainmentEList<Identifier>(Identifier.class, this, StatementsPackage.INITIALIZE__SUBPROGRAMS);
		}
		return subprograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replacement> getReplacements() {
		if (replacements == null) {
			replacements = new EObjectContainmentEList<Replacement>(Replacement.class, this, StatementsPackage.INITIALIZE__REPLACEMENTS);
		}
		return replacements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.INITIALIZE__SUBPROGRAMS:
				return ((InternalEList<?>)getSubprograms()).basicRemove(otherEnd, msgs);
			case StatementsPackage.INITIALIZE__REPLACEMENTS:
				return ((InternalEList<?>)getReplacements()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.INITIALIZE__SUBPROGRAMS:
				return getSubprograms();
			case StatementsPackage.INITIALIZE__REPLACEMENTS:
				return getReplacements();
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
			case StatementsPackage.INITIALIZE__SUBPROGRAMS:
				getSubprograms().clear();
				getSubprograms().addAll((Collection<? extends Identifier>)newValue);
				return;
			case StatementsPackage.INITIALIZE__REPLACEMENTS:
				getReplacements().clear();
				getReplacements().addAll((Collection<? extends Replacement>)newValue);
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
			case StatementsPackage.INITIALIZE__SUBPROGRAMS:
				getSubprograms().clear();
				return;
			case StatementsPackage.INITIALIZE__REPLACEMENTS:
				getReplacements().clear();
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
			case StatementsPackage.INITIALIZE__SUBPROGRAMS:
				return subprograms != null && !subprograms.isEmpty();
			case StatementsPackage.INITIALIZE__REPLACEMENTS:
				return replacements != null && !replacements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InitializeImpl
