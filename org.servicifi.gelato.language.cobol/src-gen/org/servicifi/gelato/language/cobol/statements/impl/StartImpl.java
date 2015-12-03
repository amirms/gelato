/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.statements.Start;
import org.servicifi.gelato.language.cobol.statements.Statement;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#isEndVerb <em>End Verb</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#getDataName <em>Data Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.StartImpl#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartImpl extends ErrorHandledImpl implements Start {
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
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected FileNameReference fileName;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperator operator;

	/**
	 * The cached value of the '{@link #getDataName() <em>Data Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataName()
	 * @generated
	 * @ordered
	 */
	protected Identifier dataName;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected Negate not;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.START;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.START__NEXT, oldNext, next));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__NEXT, oldNext, next));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__END_VERB, oldEndVerb, endVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameReference getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName(FileNameReference newFileName, NotificationChain msgs) {
		FileNameReference oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.START__FILE_NAME, oldFileName, newFileName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(FileNameReference newFileName) {
		if (newFileName != fileName) {
			NotificationChain msgs = null;
			if (fileName != null)
				msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__FILE_NAME, null, msgs);
			if (newFileName != null)
				msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__FILE_NAME, null, msgs);
			msgs = basicSetFileName(newFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__FILE_NAME, newFileName, newFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(RelationalOperator newOperator, NotificationChain msgs) {
		RelationalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.START__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(RelationalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getDataName() {
		return dataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataName(Identifier newDataName, NotificationChain msgs) {
		Identifier oldDataName = dataName;
		dataName = newDataName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.START__DATA_NAME, oldDataName, newDataName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataName(Identifier newDataName) {
		if (newDataName != dataName) {
			NotificationChain msgs = null;
			if (dataName != null)
				msgs = ((InternalEObject)dataName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__DATA_NAME, null, msgs);
			if (newDataName != null)
				msgs = ((InternalEObject)newDataName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__DATA_NAME, null, msgs);
			msgs = basicSetDataName(newDataName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__DATA_NAME, newDataName, newDataName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(Negate newNot, NotificationChain msgs) {
		Negate oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.START__NOT, oldNot, newNot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(Negate newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.START__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.START__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.START__FILE_NAME:
				return basicSetFileName(null, msgs);
			case StatementsPackage.START__OPERATOR:
				return basicSetOperator(null, msgs);
			case StatementsPackage.START__DATA_NAME:
				return basicSetDataName(null, msgs);
			case StatementsPackage.START__NOT:
				return basicSetNot(null, msgs);
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
			case StatementsPackage.START__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case StatementsPackage.START__END_VERB:
				return isEndVerb();
			case StatementsPackage.START__FILE_NAME:
				return getFileName();
			case StatementsPackage.START__OPERATOR:
				return getOperator();
			case StatementsPackage.START__DATA_NAME:
				return getDataName();
			case StatementsPackage.START__NOT:
				return getNot();
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
			case StatementsPackage.START__NEXT:
				setNext((Statement)newValue);
				return;
			case StatementsPackage.START__END_VERB:
				setEndVerb((Boolean)newValue);
				return;
			case StatementsPackage.START__FILE_NAME:
				setFileName((FileNameReference)newValue);
				return;
			case StatementsPackage.START__OPERATOR:
				setOperator((RelationalOperator)newValue);
				return;
			case StatementsPackage.START__DATA_NAME:
				setDataName((Identifier)newValue);
				return;
			case StatementsPackage.START__NOT:
				setNot((Negate)newValue);
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
			case StatementsPackage.START__NEXT:
				setNext((Statement)null);
				return;
			case StatementsPackage.START__END_VERB:
				setEndVerb(END_VERB_EDEFAULT);
				return;
			case StatementsPackage.START__FILE_NAME:
				setFileName((FileNameReference)null);
				return;
			case StatementsPackage.START__OPERATOR:
				setOperator((RelationalOperator)null);
				return;
			case StatementsPackage.START__DATA_NAME:
				setDataName((Identifier)null);
				return;
			case StatementsPackage.START__NOT:
				setNot((Negate)null);
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
			case StatementsPackage.START__NEXT:
				return next != null;
			case StatementsPackage.START__END_VERB:
				return endVerb != END_VERB_EDEFAULT;
			case StatementsPackage.START__FILE_NAME:
				return fileName != null;
			case StatementsPackage.START__OPERATOR:
				return operator != null;
			case StatementsPackage.START__DATA_NAME:
				return dataName != null;
			case StatementsPackage.START__NOT:
				return not != null;
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
				case StatementsPackage.START__NEXT: return StatementsPackage.STATEMENT__NEXT;
				case StatementsPackage.START__END_VERB: return StatementsPackage.STATEMENT__END_VERB;
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
				case StatementsPackage.STATEMENT__NEXT: return StatementsPackage.START__NEXT;
				case StatementsPackage.STATEMENT__END_VERB: return StatementsPackage.START__END_VERB;
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

} //StartImpl
