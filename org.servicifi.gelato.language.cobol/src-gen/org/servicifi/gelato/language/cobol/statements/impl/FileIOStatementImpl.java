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

import org.servicifi.gelato.language.cobol.ios.InputDirective;
import org.servicifi.gelato.language.cobol.ios.OutputDirective;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.statements.FileIOStatement;
import org.servicifi.gelato.language.cobol.statements.KeyDescriptor;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File IO Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl#getKeyDescriptors <em>Key Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FileIOStatementImpl extends StatementImpl implements FileIOStatement {
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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected InputDirective input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputDirective output;

	/**
	 * The cached value of the '{@link #getKeyDescriptors() <em>Key Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyDescriptor> keyDescriptors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileIOStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.FILE_IO_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__FILE_NAME, oldFileName, newFileName);
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
				msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__FILE_NAME, null, msgs);
			if (newFileName != null)
				msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__FILE_NAME, null, msgs);
			msgs = basicSetFileName(newFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__FILE_NAME, newFileName, newFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDirective getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(InputDirective newInput, NotificationChain msgs) {
		InputDirective oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputDirective newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDirective getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(OutputDirective newOutput, NotificationChain msgs) {
		OutputDirective oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(OutputDirective newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.FILE_IO_STATEMENT__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FILE_IO_STATEMENT__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyDescriptor> getKeyDescriptors() {
		if (keyDescriptors == null) {
			keyDescriptors = new EObjectContainmentEList<KeyDescriptor>(KeyDescriptor.class, this, StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS);
		}
		return keyDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.FILE_IO_STATEMENT__FILE_NAME:
				return basicSetFileName(null, msgs);
			case StatementsPackage.FILE_IO_STATEMENT__INPUT:
				return basicSetInput(null, msgs);
			case StatementsPackage.FILE_IO_STATEMENT__OUTPUT:
				return basicSetOutput(null, msgs);
			case StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS:
				return ((InternalEList<?>)getKeyDescriptors()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.FILE_IO_STATEMENT__FILE_NAME:
				return getFileName();
			case StatementsPackage.FILE_IO_STATEMENT__INPUT:
				return getInput();
			case StatementsPackage.FILE_IO_STATEMENT__OUTPUT:
				return getOutput();
			case StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS:
				return getKeyDescriptors();
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
			case StatementsPackage.FILE_IO_STATEMENT__FILE_NAME:
				setFileName((FileNameReference)newValue);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__INPUT:
				setInput((InputDirective)newValue);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__OUTPUT:
				setOutput((OutputDirective)newValue);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS:
				getKeyDescriptors().clear();
				getKeyDescriptors().addAll((Collection<? extends KeyDescriptor>)newValue);
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
			case StatementsPackage.FILE_IO_STATEMENT__FILE_NAME:
				setFileName((FileNameReference)null);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__INPUT:
				setInput((InputDirective)null);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__OUTPUT:
				setOutput((OutputDirective)null);
				return;
			case StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS:
				getKeyDescriptors().clear();
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
			case StatementsPackage.FILE_IO_STATEMENT__FILE_NAME:
				return fileName != null;
			case StatementsPackage.FILE_IO_STATEMENT__INPUT:
				return input != null;
			case StatementsPackage.FILE_IO_STATEMENT__OUTPUT:
				return output != null;
			case StatementsPackage.FILE_IO_STATEMENT__KEY_DESCRIPTORS:
				return keyDescriptors != null && !keyDescriptors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileIOStatementImpl
