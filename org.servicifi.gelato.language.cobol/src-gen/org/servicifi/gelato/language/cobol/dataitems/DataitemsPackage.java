/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsFactory
 * @model kind="package"
 * @generated
 */
public interface DataitemsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataitems";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/dataitems";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataitems";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataitemsPackage eINSTANCE = org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemAttributeImpl <em>Data Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataItemAttributeImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataItemAttribute()
	 * @generated
	 */
	int DATA_ITEM_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Data Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.PictureStringImpl <em>Picture String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.PictureStringImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getPictureString()
	 * @generated
	 */
	int PICTURE_STRING = 0;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STRING__PICTURE = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Picture String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STRING_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl <em>Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__ALIASES_TO = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__ALIASES_FROM = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__WATER = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__LEVEL_NUMBER = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__ATTRIBUTES = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__SUBENTRIES = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__SUPERENTRY = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataNameImpl <em>Data Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataNameImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataName()
	 * @generated
	 */
	int DATA_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__ALIASES_TO = DATA_ITEM__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__ALIASES_FROM = DATA_ITEM__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__WATER = DATA_ITEM__WATER;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__LEVEL_NUMBER = DATA_ITEM__LEVEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__ATTRIBUTES = DATA_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__SUBENTRIES = DATA_ITEM__SUBENTRIES;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME__SUPERENTRY = DATA_ITEM__SUPERENTRY;

	/**
	 * The number of structural features of the '<em>Data Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NAME_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RenamingDataNameImpl <em>Renaming Data Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RenamingDataNameImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRenamingDataName()
	 * @generated
	 */
	int RENAMING_DATA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__NAME = DATA_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__ALIASES_TO = DATA_NAME__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__ALIASES_FROM = DATA_NAME__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__WATER = DATA_NAME__WATER;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__LEVEL_NUMBER = DATA_NAME__LEVEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__ATTRIBUTES = DATA_NAME__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__SUBENTRIES = DATA_NAME__SUBENTRIES;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__SUPERENTRY = DATA_NAME__SUPERENTRY;

	/**
	 * The feature id for the '<em><b>Name Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME__NAME_RANGE = DATA_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Renaming Data Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_DATA_NAME_FEATURE_COUNT = DATA_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ConditionNameImpl <em>Condition Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ConditionNameImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getConditionName()
	 * @generated
	 */
	int CONDITION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__ALIASES_TO = DATA_ITEM__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__ALIASES_FROM = DATA_ITEM__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__WATER = DATA_ITEM__WATER;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__LEVEL_NUMBER = DATA_ITEM__LEVEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__ATTRIBUTES = DATA_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__SUBENTRIES = DATA_ITEM__SUBENTRIES;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME__SUPERENTRY = DATA_ITEM__SUPERENTRY;

	/**
	 * The number of structural features of the '<em>Condition Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NAME_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.GlobalImpl <em>Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.GlobalImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getGlobal()
	 * @generated
	 */
	int GLOBAL = 3;

	/**
	 * The number of structural features of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ExternalImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 4;

	/**
	 * The number of structural features of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ValueImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUES = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 7;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__USAGE = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__IS_NATIVE = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.GroupUsageImpl <em>Group Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.GroupUsageImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getGroupUsage()
	 * @generated
	 */
	int GROUP_USAGE = 8;

	/**
	 * The number of structural features of the '<em>Group Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_USAGE_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RecordNameImpl <em>Record Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RecordNameImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRecordName()
	 * @generated
	 */
	int RECORD_NAME = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__ALIASES_TO = DATA_ITEM__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__ALIASES_FROM = DATA_ITEM__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__WATER = DATA_ITEM__WATER;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__LEVEL_NUMBER = DATA_ITEM__LEVEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__ATTRIBUTES = DATA_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__SUBENTRIES = DATA_ITEM__SUBENTRIES;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__SUPERENTRY = DATA_ITEM__SUPERENTRY;

	/**
	 * The feature id for the '<em><b>Elems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME__ELEMS = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NAME_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RedefinesImpl <em>Redefines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RedefinesImpl
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRedefines()
	 * @generated
	 */
	int REDEFINES = 12;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES__DATA_NAME = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Redefines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINES_FEATURE_COUNT = DATA_ITEM_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.Usages <em>Usages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usages
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getUsages()
	 * @generated
	 */
	int USAGES = 13;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters <em>Picture String Characters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters
	 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getPictureStringCharacters()
	 * @generated
	 */
	int PICTURE_STRING_CHARACTERS = 14;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.PictureString <em>Picture String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture String</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.PictureString
	 * @generated
	 */
	EClass getPictureString();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.dataitems.PictureString#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.PictureString#getPicture()
	 * @see #getPictureString()
	 * @generated
	 */
	EAttribute getPictureString_Picture();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.RenamingDataName <em>Renaming Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming Data Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RenamingDataName
	 * @generated
	 */
	EClass getRenamingDataName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.dataitems.RenamingDataName#getNameRange <em>Name Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Range</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RenamingDataName#getNameRange()
	 * @see #getRenamingDataName()
	 * @generated
	 */
	EReference getRenamingDataName_NameRange();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.ConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.ConditionName
	 * @generated
	 */
	EClass getConditionName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Global
	 * @generated
	 */
	EClass getGlobal();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.dataitems.Value#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Value#getValues()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Values();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute <em>Data Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item Attribute</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute
	 * @generated
	 */
	EClass getDataItemAttribute();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.dataitems.Usage#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usage#getUsage()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.dataitems.Usage#isIsNative <em>Is Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Native</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usage#isIsNative()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_IsNative();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.GroupUsage <em>Group Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Usage</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.GroupUsage
	 * @generated
	 */
	EClass getGroupUsage();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getLevelNumber <em>Level Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Number</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getLevelNumber()
	 * @see #getDataItem()
	 * @generated
	 */
	EAttribute getDataItem_LevelNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getAttributes()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSubentries <em>Subentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subentries</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getSubentries()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Subentries();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry <em>Superentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superentry</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem#getSuperentry()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Superentry();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.RecordName <em>Record Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RecordName
	 * @generated
	 */
	EClass getRecordName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.dataitems.RecordName#getElems <em>Elems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elems</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RecordName#getElems()
	 * @see #getRecordName()
	 * @generated
	 */
	EReference getRecordName_Elems();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.DataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataName
	 * @generated
	 */
	EClass getDataName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.dataitems.Redefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefines</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Redefines
	 * @generated
	 */
	EClass getRedefines();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.dataitems.Redefines#getDataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Redefines#getDataName()
	 * @see #getRedefines()
	 * @generated
	 */
	EReference getRedefines_DataName();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.dataitems.Usages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usages</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usages
	 * @generated
	 */
	EEnum getUsages();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters <em>Picture String Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Picture String Characters</em>'.
	 * @see org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters
	 * @generated
	 */
	EEnum getPictureStringCharacters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataitemsFactory getDataitemsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.PictureStringImpl <em>Picture String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.PictureStringImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getPictureString()
		 * @generated
		 */
		EClass PICTURE_STRING = eINSTANCE.getPictureString();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE_STRING__PICTURE = eINSTANCE.getPictureString_Picture();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RenamingDataNameImpl <em>Renaming Data Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RenamingDataNameImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRenamingDataName()
		 * @generated
		 */
		EClass RENAMING_DATA_NAME = eINSTANCE.getRenamingDataName();

		/**
		 * The meta object literal for the '<em><b>Name Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING_DATA_NAME__NAME_RANGE = eINSTANCE.getRenamingDataName_NameRange();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ConditionNameImpl <em>Condition Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ConditionNameImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getConditionName()
		 * @generated
		 */
		EClass CONDITION_NAME = eINSTANCE.getConditionName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.GlobalImpl <em>Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.GlobalImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getGlobal()
		 * @generated
		 */
		EClass GLOBAL = eINSTANCE.getGlobal();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ExternalImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.ValueImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__VALUES = eINSTANCE.getValue_Values();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemAttributeImpl <em>Data Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataItemAttributeImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataItemAttribute()
		 * @generated
		 */
		EClass DATA_ITEM_ATTRIBUTE = eINSTANCE.getDataItemAttribute();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__USAGE = eINSTANCE.getUsage_Usage();

		/**
		 * The meta object literal for the '<em><b>Is Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__IS_NATIVE = eINSTANCE.getUsage_IsNative();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.GroupUsageImpl <em>Group Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.GroupUsageImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getGroupUsage()
		 * @generated
		 */
		EClass GROUP_USAGE = eINSTANCE.getGroupUsage();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl <em>Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataItemImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

		/**
		 * The meta object literal for the '<em><b>Level Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM__LEVEL_NUMBER = eINSTANCE.getDataItem_LevelNumber();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__ATTRIBUTES = eINSTANCE.getDataItem_Attributes();

		/**
		 * The meta object literal for the '<em><b>Subentries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__SUBENTRIES = eINSTANCE.getDataItem_Subentries();

		/**
		 * The meta object literal for the '<em><b>Superentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__SUPERENTRY = eINSTANCE.getDataItem_Superentry();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RecordNameImpl <em>Record Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RecordNameImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRecordName()
		 * @generated
		 */
		EClass RECORD_NAME = eINSTANCE.getRecordName();

		/**
		 * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_NAME__ELEMS = eINSTANCE.getRecordName_Elems();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.DataNameImpl <em>Data Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataNameImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getDataName()
		 * @generated
		 */
		EClass DATA_NAME = eINSTANCE.getDataName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.impl.RedefinesImpl <em>Redefines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.RedefinesImpl
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getRedefines()
		 * @generated
		 */
		EClass REDEFINES = eINSTANCE.getRedefines();

		/**
		 * The meta object literal for the '<em><b>Data Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINES__DATA_NAME = eINSTANCE.getRedefines_DataName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.Usages <em>Usages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.Usages
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getUsages()
		 * @generated
		 */
		EEnum USAGES = eINSTANCE.getUsages();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters <em>Picture String Characters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.dataitems.PictureStringCharacters
		 * @see org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsPackageImpl#getPictureStringCharacters()
		 * @generated
		 */
		EEnum PICTURE_STRING_CHARACTERS = eINSTANCE.getPictureStringCharacters();

	}

} //DataitemsPackage
