/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.conditions.Condition;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.statements.Statement;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.Unstring;

import org.servicifi.gelato.language.cobol.strings.SplittedString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#isEndVerb <em>End Verb</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getTally <em>Tally</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstringImpl extends ErrorHandledImpl implements Unstring {
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
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected Identifier pointer;

	/**
	 * The cached value of the '{@link #getTally() <em>Tally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTally()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference tally;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Identifier sender;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<SplittedString> receivers;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Condition delimiter;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Identifier counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.UNSTRING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.UNSTRING__NEXT, oldNext, next));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__NEXT, oldNext, next));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__END_VERB, oldEndVerb, endVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPointer() {
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointer(Identifier newPointer, NotificationChain msgs) {
		Identifier oldPointer = pointer;
		pointer = newPointer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__POINTER, oldPointer, newPointer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointer(Identifier newPointer) {
		if (newPointer != pointer) {
			NotificationChain msgs = null;
			if (pointer != null)
				msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__POINTER, null, msgs);
			if (newPointer != null)
				msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__POINTER, null, msgs);
			msgs = basicSetPointer(newPointer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__POINTER, newPointer, newPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getTally() {
		return tally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTally(IdentifierReference newTally, NotificationChain msgs) {
		IdentifierReference oldTally = tally;
		tally = newTally;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__TALLY, oldTally, newTally);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTally(IdentifierReference newTally) {
		if (newTally != tally) {
			NotificationChain msgs = null;
			if (tally != null)
				msgs = ((InternalEObject)tally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__TALLY, null, msgs);
			if (newTally != null)
				msgs = ((InternalEObject)newTally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__TALLY, null, msgs);
			msgs = basicSetTally(newTally, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__TALLY, newTally, newTally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Identifier newSender, NotificationChain msgs) {
		Identifier oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Identifier newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplittedString> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<SplittedString>(SplittedString.class, this, StatementsPackage.UNSTRING__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelimiter(Condition newDelimiter, NotificationChain msgs) {
		Condition oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__DELIMITER, oldDelimiter, newDelimiter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiter(Condition newDelimiter) {
		if (newDelimiter != delimiter) {
			NotificationChain msgs = null;
			if (delimiter != null)
				msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__DELIMITER, null, msgs);
			if (newDelimiter != null)
				msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__DELIMITER, null, msgs);
			msgs = basicSetDelimiter(newDelimiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__DELIMITER, newDelimiter, newDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounter(Identifier newCounter, NotificationChain msgs) {
		Identifier oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__COUNTER, oldCounter, newCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Identifier newCounter) {
		if (newCounter != counter) {
			NotificationChain msgs = null;
			if (counter != null)
				msgs = ((InternalEObject)counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__COUNTER, null, msgs);
			if (newCounter != null)
				msgs = ((InternalEObject)newCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.UNSTRING__COUNTER, null, msgs);
			msgs = basicSetCounter(newCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.UNSTRING__COUNTER, newCounter, newCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.UNSTRING__POINTER:
				return basicSetPointer(null, msgs);
			case StatementsPackage.UNSTRING__TALLY:
				return basicSetTally(null, msgs);
			case StatementsPackage.UNSTRING__SENDER:
				return basicSetSender(null, msgs);
			case StatementsPackage.UNSTRING__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.UNSTRING__DELIMITER:
				return basicSetDelimiter(null, msgs);
			case StatementsPackage.UNSTRING__COUNTER:
				return basicSetCounter(null, msgs);
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
			case StatementsPackage.UNSTRING__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case StatementsPackage.UNSTRING__END_VERB:
				return isEndVerb();
			case StatementsPackage.UNSTRING__POINTER:
				return getPointer();
			case StatementsPackage.UNSTRING__TALLY:
				return getTally();
			case StatementsPackage.UNSTRING__SENDER:
				return getSender();
			case StatementsPackage.UNSTRING__RECEIVERS:
				return getReceivers();
			case StatementsPackage.UNSTRING__DELIMITER:
				return getDelimiter();
			case StatementsPackage.UNSTRING__COUNTER:
				return getCounter();
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
			case StatementsPackage.UNSTRING__NEXT:
				setNext((Statement)newValue);
				return;
			case StatementsPackage.UNSTRING__END_VERB:
				setEndVerb((Boolean)newValue);
				return;
			case StatementsPackage.UNSTRING__POINTER:
				setPointer((Identifier)newValue);
				return;
			case StatementsPackage.UNSTRING__TALLY:
				setTally((IdentifierReference)newValue);
				return;
			case StatementsPackage.UNSTRING__SENDER:
				setSender((Identifier)newValue);
				return;
			case StatementsPackage.UNSTRING__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends SplittedString>)newValue);
				return;
			case StatementsPackage.UNSTRING__DELIMITER:
				setDelimiter((Condition)newValue);
				return;
			case StatementsPackage.UNSTRING__COUNTER:
				setCounter((Identifier)newValue);
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
			case StatementsPackage.UNSTRING__NEXT:
				setNext((Statement)null);
				return;
			case StatementsPackage.UNSTRING__END_VERB:
				setEndVerb(END_VERB_EDEFAULT);
				return;
			case StatementsPackage.UNSTRING__POINTER:
				setPointer((Identifier)null);
				return;
			case StatementsPackage.UNSTRING__TALLY:
				setTally((IdentifierReference)null);
				return;
			case StatementsPackage.UNSTRING__SENDER:
				setSender((Identifier)null);
				return;
			case StatementsPackage.UNSTRING__RECEIVERS:
				getReceivers().clear();
				return;
			case StatementsPackage.UNSTRING__DELIMITER:
				setDelimiter((Condition)null);
				return;
			case StatementsPackage.UNSTRING__COUNTER:
				setCounter((Identifier)null);
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
			case StatementsPackage.UNSTRING__NEXT:
				return next != null;
			case StatementsPackage.UNSTRING__END_VERB:
				return endVerb != END_VERB_EDEFAULT;
			case StatementsPackage.UNSTRING__POINTER:
				return pointer != null;
			case StatementsPackage.UNSTRING__TALLY:
				return tally != null;
			case StatementsPackage.UNSTRING__SENDER:
				return sender != null;
			case StatementsPackage.UNSTRING__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case StatementsPackage.UNSTRING__DELIMITER:
				return delimiter != null;
			case StatementsPackage.UNSTRING__COUNTER:
				return counter != null;
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
				case StatementsPackage.UNSTRING__NEXT: return StatementsPackage.STATEMENT__NEXT;
				case StatementsPackage.UNSTRING__END_VERB: return StatementsPackage.STATEMENT__END_VERB;
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
				case StatementsPackage.STATEMENT__NEXT: return StatementsPackage.UNSTRING__NEXT;
				case StatementsPackage.STATEMENT__END_VERB: return StatementsPackage.UNSTRING__END_VERB;
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

} //UnstringImpl
