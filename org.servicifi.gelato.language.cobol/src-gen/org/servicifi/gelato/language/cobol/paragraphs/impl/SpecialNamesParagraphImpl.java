/**
 */
package org.servicifi.gelato.language.cobol.paragraphs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage;
import org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph;

import org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement;

import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Names Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl#getSpecialNameStatements <em>Special Name Statements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SpecialNamesParagraphImpl#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialNamesParagraphImpl extends ConfigurationSectionParagraphImpl implements SpecialNamesParagraph {
	/**
	 * The cached value of the '{@link #getSpecialNameStatements() <em>Special Name Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNameStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialNameStatement> specialNameStatements;

	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialNamesParagraphWater> water;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialNamesParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParagraphsPackage.Literals.SPECIAL_NAMES_PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialNameStatement> getSpecialNameStatements() {
		if (specialNameStatements == null) {
			specialNameStatements = new EObjectContainmentEList<SpecialNameStatement>(SpecialNameStatement.class, this, ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS);
		}
		return specialNameStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialNamesParagraphWater> getWater() {
		if (water == null) {
			water = new EObjectContainmentEList<SpecialNamesParagraphWater>(SpecialNamesParagraphWater.class, this, ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER);
		}
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS:
				return ((InternalEList<?>)getSpecialNameStatements()).basicRemove(otherEnd, msgs);
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER:
				return ((InternalEList<?>)getWater()).basicRemove(otherEnd, msgs);
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
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS:
				return getSpecialNameStatements();
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER:
				return getWater();
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
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS:
				getSpecialNameStatements().clear();
				getSpecialNameStatements().addAll((Collection<? extends SpecialNameStatement>)newValue);
				return;
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER:
				getWater().clear();
				getWater().addAll((Collection<? extends SpecialNamesParagraphWater>)newValue);
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
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS:
				getSpecialNameStatements().clear();
				return;
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER:
				getWater().clear();
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
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS:
				return specialNameStatements != null && !specialNameStatements.isEmpty();
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER:
				return water != null && !water.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecialNamesParagraphImpl
