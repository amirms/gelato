/**
 */
package org.servicifi.gelato.language.cobol.paragraphs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode;
import org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage;
import org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Computer Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.impl.SourceComputerParagraphImpl#getWithDebuggingMode <em>With Debugging Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceComputerParagraphImpl extends ConfigurationSectionParagraphImpl implements SourceComputerParagraph {
	/**
	 * The cached value of the '{@link #getWithDebuggingMode() <em>With Debugging Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithDebuggingMode()
	 * @generated
	 * @ordered
	 */
	protected DebuggingMode withDebuggingMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceComputerParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParagraphsPackage.Literals.SOURCE_COMPUTER_PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebuggingMode getWithDebuggingMode() {
		return withDebuggingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithDebuggingMode(DebuggingMode newWithDebuggingMode, NotificationChain msgs) {
		DebuggingMode oldWithDebuggingMode = withDebuggingMode;
		withDebuggingMode = newWithDebuggingMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE, oldWithDebuggingMode, newWithDebuggingMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithDebuggingMode(DebuggingMode newWithDebuggingMode) {
		if (newWithDebuggingMode != withDebuggingMode) {
			NotificationChain msgs = null;
			if (withDebuggingMode != null)
				msgs = ((InternalEObject)withDebuggingMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE, null, msgs);
			if (newWithDebuggingMode != null)
				msgs = ((InternalEObject)newWithDebuggingMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE, null, msgs);
			msgs = basicSetWithDebuggingMode(newWithDebuggingMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE, newWithDebuggingMode, newWithDebuggingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE:
				return basicSetWithDebuggingMode(null, msgs);
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
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE:
				return getWithDebuggingMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE:
				setWithDebuggingMode((DebuggingMode)newValue);
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
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE:
				setWithDebuggingMode((DebuggingMode)null);
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
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE:
				return withDebuggingMode != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceComputerParagraphImpl
