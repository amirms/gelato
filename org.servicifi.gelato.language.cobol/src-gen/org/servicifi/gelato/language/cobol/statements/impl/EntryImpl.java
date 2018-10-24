/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl;

import org.servicifi.gelato.language.cobol.statements.Entry;
import org.servicifi.gelato.language.cobol.statements.Statement;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.EntryImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.EntryImpl#isEndVerb <em>End Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends ParametrizableImpl implements Entry {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Statement next;

	/**
	 * The default value of the '{@link #isEndVerb() <em>End Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndVerb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_VERB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEndVerb() <em>End Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndVerb()
	 * @generated
	 * @ordered
	 */
	protected boolean endVerb = END_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Statement)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.ENTRY__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Statement newNext) {
		Statement oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ENTRY__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndVerb() {
		return endVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndVerb(boolean newEndVerb) {
		boolean oldEndVerb = endVerb;
		endVerb = newEndVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ENTRY__END_VERB, oldEndVerb, endVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementsPackage.ENTRY__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case StatementsPackage.ENTRY__END_VERB:
				return isEndVerb();
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
			case StatementsPackage.ENTRY__NEXT:
				setNext((Statement)newValue);
				return;
			case StatementsPackage.ENTRY__END_VERB:
				setEndVerb((Boolean)newValue);
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
			case StatementsPackage.ENTRY__NEXT:
				setNext((Statement)null);
				return;
			case StatementsPackage.ENTRY__END_VERB:
				setEndVerb(END_VERB_EDEFAULT);
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
			case StatementsPackage.ENTRY__NEXT:
				return next != null;
			case StatementsPackage.ENTRY__END_VERB:
				return endVerb != END_VERB_EDEFAULT;
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
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.ENTRY__NEXT: return StatementsPackage.STATEMENT__NEXT;
				case StatementsPackage.ENTRY__END_VERB: return StatementsPackage.STATEMENT__END_VERB;
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
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case StatementsPackage.STATEMENT__NEXT: return StatementsPackage.ENTRY__NEXT;
				case StatementsPackage.STATEMENT__END_VERB: return StatementsPackage.ENTRY__END_VERB;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (endVerb: ");
		result.append(endVerb);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
