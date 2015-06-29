/**
 */
package org.servicifi.gelato.language.cobol.sections.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl;

import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;

import org.servicifi.gelato.language.cobol.sections.Section;
import org.servicifi.gelato.language.cobol.sections.SectionsPackage;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.SectionImpl#getSentences <em>Sentences</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.SectionImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.SectionImpl#getSegmentNumber <em>Segment Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends NamedElementImpl implements Section {
	/**
	 * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentences()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementContainer> sentences;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * The default value of the '{@link #getSegmentNumber() <em>Segment Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentNumber() <em>Segment Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentNumber()
	 * @generated
	 * @ordered
	 */
	protected String segmentNumber = SEGMENT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SectionsPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatementContainer> getSentences() {
		if (sentences == null) {
			sentences = new EObjectContainmentEList<StatementContainer>(StatementContainer.class, this, SectionsPackage.SECTION__SENTENCES);
		}
		return sentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this, SectionsPackage.SECTION__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSegmentNumber() {
		return segmentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentNumber(String newSegmentNumber) {
		String oldSegmentNumber = segmentNumber;
		segmentNumber = newSegmentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SectionsPackage.SECTION__SEGMENT_NUMBER, oldSegmentNumber, segmentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SectionsPackage.SECTION__SENTENCES:
				return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
			case SectionsPackage.SECTION__PARAGRAPHS:
				return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
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
			case SectionsPackage.SECTION__SENTENCES:
				return getSentences();
			case SectionsPackage.SECTION__PARAGRAPHS:
				return getParagraphs();
			case SectionsPackage.SECTION__SEGMENT_NUMBER:
				return getSegmentNumber();
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
			case SectionsPackage.SECTION__SENTENCES:
				getSentences().clear();
				getSentences().addAll((Collection<? extends StatementContainer>)newValue);
				return;
			case SectionsPackage.SECTION__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case SectionsPackage.SECTION__SEGMENT_NUMBER:
				setSegmentNumber((String)newValue);
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
			case SectionsPackage.SECTION__SENTENCES:
				getSentences().clear();
				return;
			case SectionsPackage.SECTION__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case SectionsPackage.SECTION__SEGMENT_NUMBER:
				setSegmentNumber(SEGMENT_NUMBER_EDEFAULT);
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
			case SectionsPackage.SECTION__SENTENCES:
				return sentences != null && !sentences.isEmpty();
			case SectionsPackage.SECTION__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
			case SectionsPackage.SECTION__SEGMENT_NUMBER:
				return SEGMENT_NUMBER_EDEFAULT == null ? segmentNumber != null : !SEGMENT_NUMBER_EDEFAULT.equals(segmentNumber);
		}
		return super.eIsSet(featureID);
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
		result.append(" (segmentNumber: ");
		result.append(segmentNumber);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
