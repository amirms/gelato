/**
 */
package org.servicifi.gelato.language.cobol.sections.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;

import org.servicifi.gelato.language.cobol.sections.DataDivisionSection;
import org.servicifi.gelato.language.cobol.sections.SectionsPackage;

import org.servicifi.gelato.language.cobol.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Division Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.DataDivisionSectionImpl#getRecords <em>Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataDivisionSectionImpl extends SectionImpl implements DataDivisionSection {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> records;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDivisionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SectionsPackage.Literals.DATA_DIVISION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<DataItem>(DataItem.class, this, SectionsPackage.DATA_DIVISION_SECTION__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case SectionsPackage.DATA_DIVISION_SECTION__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
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
			case SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS:
				return getStatements();
			case SectionsPackage.DATA_DIVISION_SECTION__RECORDS:
				return getRecords();
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
			case SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case SectionsPackage.DATA_DIVISION_SECTION__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends DataItem>)newValue);
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
			case SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS:
				getStatements().clear();
				return;
			case SectionsPackage.DATA_DIVISION_SECTION__RECORDS:
				getRecords().clear();
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
			case SectionsPackage.DATA_DIVISION_SECTION__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case SectionsPackage.DATA_DIVISION_SECTION__RECORDS:
				return records != null && !records.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataDivisionSectionImpl
