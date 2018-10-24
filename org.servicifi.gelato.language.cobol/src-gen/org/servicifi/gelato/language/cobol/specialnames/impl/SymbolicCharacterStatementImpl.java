/**
 */
package org.servicifi.gelato.language.cobol.specialnames.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.references.AlphabetNameReference;
import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Reference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;
import org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter;
import org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Character Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl#getSymbolicCharacters <em>Symbolic Characters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterStatementImpl#getAlphabetNameReference <em>Alphabet Name Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolicCharacterStatementImpl extends SpecialNameStatementImpl implements SymbolicCharacterStatement {
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
	 * The cached value of the '{@link #getSymbolicCharacters() <em>Symbolic Characters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicCharacters()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolicCharacter> symbolicCharacters;

	/**
	 * The cached value of the '{@link #getAlphabetNameReference() <em>Alphabet Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabetNameReference()
	 * @generated
	 * @ordered
	 */
	protected AlphabetNameReference alphabetNameReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicCharacterStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecialnamesPackage.Literals.SYMBOLIC_CHARACTER_STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolicCharacter> getSymbolicCharacters() {
		if (symbolicCharacters == null) {
			symbolicCharacters = new EObjectContainmentEList<SymbolicCharacter>(SymbolicCharacter.class, this, SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS);
		}
		return symbolicCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabetNameReference getAlphabetNameReference() {
		return alphabetNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabetNameReference(AlphabetNameReference newAlphabetNameReference, NotificationChain msgs) {
		AlphabetNameReference oldAlphabetNameReference = alphabetNameReference;
		alphabetNameReference = newAlphabetNameReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE, oldAlphabetNameReference, newAlphabetNameReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabetNameReference(AlphabetNameReference newAlphabetNameReference) {
		if (newAlphabetNameReference != alphabetNameReference) {
			NotificationChain msgs = null;
			if (alphabetNameReference != null)
				msgs = ((InternalEObject)alphabetNameReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE, null, msgs);
			if (newAlphabetNameReference != null)
				msgs = ((InternalEObject)newAlphabetNameReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE, null, msgs);
			msgs = basicSetAlphabetNameReference(newAlphabetNameReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE, newAlphabetNameReference, newAlphabetNameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS:
				return ((InternalEList<?>)getSymbolicCharacters()).basicRemove(otherEnd, msgs);
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE:
				return basicSetAlphabetNameReference(null, msgs);
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS:
				return getSymbolicCharacters();
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE:
				return getAlphabetNameReference();
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET:
				setTarget((ReferenceableElement)newValue);
				return;
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS:
				getSymbolicCharacters().clear();
				getSymbolicCharacters().addAll((Collection<? extends SymbolicCharacter>)newValue);
				return;
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE:
				setAlphabetNameReference((AlphabetNameReference)newValue);
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET:
				setTarget((ReferenceableElement)null);
				return;
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS:
				getSymbolicCharacters().clear();
				return;
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE:
				setAlphabetNameReference((AlphabetNameReference)null);
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET:
				return target != null;
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS:
				return symbolicCharacters != null && !symbolicCharacters.isEmpty();
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE:
				return alphabetNameReference != null;
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
				case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET: return ReferencesPackage.ELEMENT_REFERENCE__TARGET;
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
				case ReferencesPackage.ELEMENT_REFERENCE__TARGET: return SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SymbolicCharacterStatementImpl
