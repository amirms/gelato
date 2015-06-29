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

import org.servicifi.gelato.language.cobol.files.SelectStatement;

import org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Control Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.impl.FileControlParagraphImpl#getSelectStatements <em>Select Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileControlParagraphImpl extends IOSectionParagraphImpl implements FileControlParagraph {
	/**
	 * The cached value of the '{@link #getSelectStatements() <em>Select Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectStatement> selectStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileControlParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParagraphsPackage.Literals.FILE_CONTROL_PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectStatement> getSelectStatements() {
		if (selectStatements == null) {
			selectStatements = new EObjectContainmentEList<SelectStatement>(SelectStatement.class, this, ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS);
		}
		return selectStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS:
				return ((InternalEList<?>)getSelectStatements()).basicRemove(otherEnd, msgs);
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
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS:
				return getSelectStatements();
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
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS:
				getSelectStatements().clear();
				getSelectStatements().addAll((Collection<? extends SelectStatement>)newValue);
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
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS:
				getSelectStatements().clear();
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
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS:
				return selectStatements != null && !selectStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileControlParagraphImpl
