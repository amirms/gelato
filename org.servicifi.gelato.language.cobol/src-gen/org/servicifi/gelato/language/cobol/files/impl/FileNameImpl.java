/**
 */
package org.servicifi.gelato.language.cobol.files.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.CommonsPackage;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;

import org.servicifi.gelato.language.cobol.files.FileDescriptors;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.files.FilesPackage;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

import org.servicifi.gelato.language.cobol.sentences.StatementContainer;

import org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getAliasesTo <em>Aliases To</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getAliasesFrom <em>Aliases From</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getFileDescriptor <em>File Descriptor</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileNameImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileNameImpl extends IncompleteElementImpl implements FileName {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasesTo() <em>Aliases To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> aliasesTo;

	/**
	 * The cached value of the '{@link #getAliasesFrom() <em>Aliases From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceableElement> aliasesFrom;

	/**
	 * The default value of the '{@link #getFileDescriptor() <em>File Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final FileDescriptors FILE_DESCRIPTOR_EDEFAULT = FileDescriptors.FD;

	/**
	 * The cached value of the '{@link #getFileDescriptor() <em>File Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDescriptor()
	 * @generated
	 * @ordered
	 */
	protected FileDescriptors fileDescriptor = FILE_DESCRIPTOR_EDEFAULT;

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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItemAttribute> attributes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.FILE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getAliasesTo() {
		if (aliasesTo == null) {
			aliasesTo = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, FilesPackage.FILE_NAME__ALIASES_TO, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM);
		}
		return aliasesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceableElement> getAliasesFrom() {
		if (aliasesFrom == null) {
			aliasesFrom = new EObjectWithInverseResolvingEList.ManyInverse<ReferenceableElement>(ReferenceableElement.class, this, FilesPackage.FILE_NAME__ALIASES_FROM, ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO);
		}
		return aliasesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDescriptors getFileDescriptor() {
		return fileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileDescriptor(FileDescriptors newFileDescriptor) {
		FileDescriptors oldFileDescriptor = fileDescriptor;
		fileDescriptor = newFileDescriptor == null ? FILE_DESCRIPTOR_EDEFAULT : newFileDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_NAME__FILE_DESCRIPTOR, oldFileDescriptor, fileDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<DataItem>(DataItem.class, this, FilesPackage.FILE_NAME__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItemAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<DataItemAttribute>(DataItemAttribute.class, this, FilesPackage.FILE_NAME__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatementContainer> getSentences() {
		if (sentences == null) {
			sentences = new EObjectContainmentEList<StatementContainer>(StatementContainer.class, this, FilesPackage.FILE_NAME__SENTENCES);
		}
		return sentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.FILE_NAME__ALIASES_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliasesTo()).basicAdd(otherEnd, msgs);
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAliasesFrom()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.FILE_NAME__ALIASES_TO:
				return ((InternalEList<?>)getAliasesTo()).basicRemove(otherEnd, msgs);
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				return ((InternalEList<?>)getAliasesFrom()).basicRemove(otherEnd, msgs);
			case FilesPackage.FILE_NAME__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
			case FilesPackage.FILE_NAME__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FilesPackage.FILE_NAME__SENTENCES:
				return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
			case FilesPackage.FILE_NAME__NAME:
				return getName();
			case FilesPackage.FILE_NAME__ALIASES_TO:
				return getAliasesTo();
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				return getAliasesFrom();
			case FilesPackage.FILE_NAME__FILE_DESCRIPTOR:
				return getFileDescriptor();
			case FilesPackage.FILE_NAME__RECORDS:
				return getRecords();
			case FilesPackage.FILE_NAME__ATTRIBUTES:
				return getAttributes();
			case FilesPackage.FILE_NAME__SENTENCES:
				return getSentences();
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
			case FilesPackage.FILE_NAME__NAME:
				setName((String)newValue);
				return;
			case FilesPackage.FILE_NAME__ALIASES_TO:
				getAliasesTo().clear();
				getAliasesTo().addAll((Collection<? extends ReferenceableElement>)newValue);
				return;
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				getAliasesFrom().clear();
				getAliasesFrom().addAll((Collection<? extends ReferenceableElement>)newValue);
				return;
			case FilesPackage.FILE_NAME__FILE_DESCRIPTOR:
				setFileDescriptor((FileDescriptors)newValue);
				return;
			case FilesPackage.FILE_NAME__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends DataItem>)newValue);
				return;
			case FilesPackage.FILE_NAME__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DataItemAttribute>)newValue);
				return;
			case FilesPackage.FILE_NAME__SENTENCES:
				getSentences().clear();
				getSentences().addAll((Collection<? extends StatementContainer>)newValue);
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
			case FilesPackage.FILE_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FilesPackage.FILE_NAME__ALIASES_TO:
				getAliasesTo().clear();
				return;
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				getAliasesFrom().clear();
				return;
			case FilesPackage.FILE_NAME__FILE_DESCRIPTOR:
				setFileDescriptor(FILE_DESCRIPTOR_EDEFAULT);
				return;
			case FilesPackage.FILE_NAME__RECORDS:
				getRecords().clear();
				return;
			case FilesPackage.FILE_NAME__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FilesPackage.FILE_NAME__SENTENCES:
				getSentences().clear();
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
			case FilesPackage.FILE_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FilesPackage.FILE_NAME__ALIASES_TO:
				return aliasesTo != null && !aliasesTo.isEmpty();
			case FilesPackage.FILE_NAME__ALIASES_FROM:
				return aliasesFrom != null && !aliasesFrom.isEmpty();
			case FilesPackage.FILE_NAME__FILE_DESCRIPTOR:
				return fileDescriptor != FILE_DESCRIPTOR_EDEFAULT;
			case FilesPackage.FILE_NAME__RECORDS:
				return records != null && !records.isEmpty();
			case FilesPackage.FILE_NAME__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FilesPackage.FILE_NAME__SENTENCES:
				return sentences != null && !sentences.isEmpty();
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
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case FilesPackage.FILE_NAME__NAME: return CommonsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				case FilesPackage.FILE_NAME__ALIASES_TO: return ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;
				case FilesPackage.FILE_NAME__ALIASES_FROM: return ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;
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
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAMED_ELEMENT__NAME: return FilesPackage.FILE_NAME__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO: return FilesPackage.FILE_NAME__ALIASES_TO;
				case ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM: return FilesPackage.FILE_NAME__ALIASES_FROM;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fileDescriptor: ");
		result.append(fileDescriptor);
		result.append(')');
		return result.toString();
	}

} //FileNameImpl
