/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.dataitems.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataitemsFactoryImpl extends EFactoryImpl implements DataitemsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataitemsFactory init() {
		try {
			DataitemsFactory theDataitemsFactory = (DataitemsFactory)EPackage.Registry.INSTANCE.getEFactory(DataitemsPackage.eNS_URI);
			if (theDataitemsFactory != null) {
				return theDataitemsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataitemsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataitemsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataitemsPackage.PICTURE_STRING: return createPictureString();
			case DataitemsPackage.RENAMING_DATA_NAME: return createRenamingDataName();
			case DataitemsPackage.CONDITION_NAME: return createConditionName();
			case DataitemsPackage.GLOBAL: return createGlobal();
			case DataitemsPackage.EXTERNAL: return createExternal();
			case DataitemsPackage.VALUE: return createValue();
			case DataitemsPackage.USAGE: return createUsage();
			case DataitemsPackage.GROUP_USAGE: return createGroupUsage();
			case DataitemsPackage.DATA_ITEM: return createDataItem();
			case DataitemsPackage.RECORD_NAME: return createRecordName();
			case DataitemsPackage.DATA_NAME: return createDataName();
			case DataitemsPackage.REDEFINES: return createRedefines();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataitemsPackage.USAGES:
				return createUsagesFromString(eDataType, initialValue);
			case DataitemsPackage.PICTURE_STRING_CHARACTERS:
				return createPictureStringCharactersFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataitemsPackage.USAGES:
				return convertUsagesToString(eDataType, instanceValue);
			case DataitemsPackage.PICTURE_STRING_CHARACTERS:
				return convertPictureStringCharactersToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureString createPictureString() {
		PictureStringImpl pictureString = new PictureStringImpl();
		return pictureString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenamingDataName createRenamingDataName() {
		RenamingDataNameImpl renamingDataName = new RenamingDataNameImpl();
		return renamingDataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionName createConditionName() {
		ConditionNameImpl conditionName = new ConditionNameImpl();
		return conditionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Global createGlobal() {
		GlobalImpl global = new GlobalImpl();
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupUsage createGroupUsage() {
		GroupUsageImpl groupUsage = new GroupUsageImpl();
		return groupUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem createDataItem() {
		DataItemImpl dataItem = new DataItemImpl();
		return dataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordName createRecordName() {
		RecordNameImpl recordName = new RecordNameImpl();
		return recordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataName createDataName() {
		DataNameImpl dataName = new DataNameImpl();
		return dataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redefines createRedefines() {
		RedefinesImpl redefines = new RedefinesImpl();
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usages createUsagesFromString(EDataType eDataType, String initialValue) {
		Usages result = Usages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureStringCharacters createPictureStringCharactersFromString(EDataType eDataType, String initialValue) {
		PictureStringCharacters result = PictureStringCharacters.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPictureStringCharactersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataitemsPackage getDataitemsPackage() {
		return (DataitemsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataitemsPackage getPackage() {
		return DataitemsPackage.eINSTANCE;
	}

} //DataitemsFactoryImpl
