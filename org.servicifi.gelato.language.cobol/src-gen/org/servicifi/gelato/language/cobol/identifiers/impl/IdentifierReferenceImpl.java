/**
 */
package org.servicifi.gelato.language.cobol.identifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.identifiers.Qualifier;
import org.servicifi.gelato.language.cobol.identifiers.Subscript;

import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Qualifiable;
import org.servicifi.gelato.language.cobol.references.Reference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl#getSubscripts <em>Subscripts</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierReferenceImpl extends IdentifierImpl implements IdentifierReference {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ReferenceableElement target;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected ElementReference qualifier;

	/**
	 * The cached value of the '{@link #getSubscripts() <em>Subscripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscript> subscripts;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualifier> qualifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentifiersPackage.Literals.IDENTIFIER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ReferenceableElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ReferenceableElement newTarget) {
		ReferenceableElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReference getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(ElementReference newQualifier, NotificationChain msgs) {
		ElementReference oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(ElementReference newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscript> getSubscripts() {
		if (subscripts == null) {
			subscripts = new EObjectContainmentEList<Subscript>(Subscript.class, this, IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS);
		}
		return subscripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualifier> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<Qualifier>(Qualifier.class, this, IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER:
				return basicSetQualifier(null, msgs);
			case IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS:
				return ((InternalEList<?>)getSubscripts()).basicRemove(otherEnd, msgs);
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS:
				return ((InternalEList<?>)getQualifiers()).basicRemove(otherEnd, msgs);
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
			case IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER:
				return getQualifier();
			case IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS:
				return getSubscripts();
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS:
				return getQualifiers();
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
			case IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET:
				setTarget((ReferenceableElement)newValue);
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER:
				setQualifier((ElementReference)newValue);
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS:
				getSubscripts().clear();
				getSubscripts().addAll((Collection<? extends Subscript>)newValue);
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends Qualifier>)newValue);
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
			case IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET:
				setTarget((ReferenceableElement)null);
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER:
				setQualifier((ElementReference)null);
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS:
				getSubscripts().clear();
				return;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS:
				getQualifiers().clear();
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
			case IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET:
				return target != null;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER:
				return qualifier != null;
			case IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS:
				return subscripts != null && !subscripts.isEmpty();
			case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
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
		if (baseClass == Reference.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ElementReference.class) {
			switch (derivedFeatureID) {
				case IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET: return ReferencesPackage.ELEMENT_REFERENCE__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (derivedFeatureID) {
				case IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER: return ReferencesPackage.QUALIFIABLE__QUALIFIER;
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
		if (baseClass == Reference.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ElementReference.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.ELEMENT_REFERENCE__TARGET: return IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Qualifiable.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.QUALIFIABLE__QUALIFIER: return IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IdentifierReferenceImpl
