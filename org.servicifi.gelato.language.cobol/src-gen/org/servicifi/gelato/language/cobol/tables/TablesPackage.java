/**
 */
package org.servicifi.gelato.language.cobol.tables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.commons.CommonsPackage;

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;

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
 * @see org.servicifi.gelato.language.cobol.tables.TablesFactory
 * @model kind="package"
 * @generated
 */
public interface TablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/tables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablesPackage eINSTANCE = org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TableImpl
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = DataitemsPackage.DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALIASES_TO = DataitemsPackage.DATA_ITEM__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALIASES_FROM = DataitemsPackage.DATA_ITEM__ALIASES_FROM;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WATER = DataitemsPackage.DATA_ITEM__WATER;

	/**
	 * The feature id for the '<em><b>Level Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LEVEL_NUMBER = DataitemsPackage.DATA_ITEM__LEVEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = DataitemsPackage.DATA_ITEM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Subentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SUBENTRIES = DataitemsPackage.DATA_ITEM__SUBENTRIES;

	/**
	 * The feature id for the '<em><b>Superentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SUPERENTRY = DataitemsPackage.DATA_ITEM__SUPERENTRY;

	/**
	 * The feature id for the '<em><b>Table Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_DIMENSION = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEXED_BY = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keys Are</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KEYS_ARE = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Table Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MAX_TABLE_DIMENSION = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DEPENDS_ON = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DataitemsPackage.DATA_ITEM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl <em>Key Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getKeyName()
	 * @generated
	 */
	int KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_NAME__KEYS = 0;

	/**
	 * The feature id for the '<em><b>Key Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_NAME__KEY_ORDER = 1;

	/**
	 * The number of structural features of the '<em>Key Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl <em>Index Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getIndexName()
	 * @generated
	 */
	int INDEX_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME__ALIASES_TO = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME__ALIASES_FROM = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Index Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME__ADDITIONAL_INDEX_NAMES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_NAME_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.impl.TableDimensionImpl <em>Table Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TableDimensionImpl
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getTableDimension()
	 * @generated
	 */
	int TABLE_DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DIMENSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Table Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DIMENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.impl.AdditionalIndexNameImpl <em>Additional Index Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.impl.AdditionalIndexNameImpl
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getAdditionalIndexName()
	 * @generated
	 */
	int ADDITIONAL_INDEX_NAME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INDEX_NAME__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INDEX_NAME__ALIASES_TO = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_TO;

	/**
	 * The feature id for the '<em><b>Aliases From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INDEX_NAME__ALIASES_FROM = ReferencesPackage.REFERENCEABLE_ELEMENT__ALIASES_FROM;

	/**
	 * The number of structural features of the '<em>Additional Index Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INDEX_NAME_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.tables.SortingOrder <em>Sorting Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.tables.SortingOrder
	 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getSortingOrder()
	 * @generated
	 */
	int SORTING_ORDER = 5;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.tables.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.tables.Table#getTableDimension <em>Table Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Dimension</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table#getTableDimension()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableDimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.tables.Table#getIndexedBy <em>Indexed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexed By</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table#getIndexedBy()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IndexedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.tables.Table#getKeysAre <em>Keys Are</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys Are</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table#getKeysAre()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_KeysAre();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.tables.Table#getMaxTableDimension <em>Max Table Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Table Dimension</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table#getMaxTableDimension()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_MaxTableDimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.tables.Table#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends On</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.Table#getDependsOn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_DependsOn();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.tables.KeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.KeyName
	 * @generated
	 */
	EClass getKeyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.tables.KeyName#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.KeyName#getKeys()
	 * @see #getKeyName()
	 * @generated
	 */
	EReference getKeyName_Keys();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.tables.KeyName#getKeyOrder <em>Key Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Order</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.KeyName#getKeyOrder()
	 * @see #getKeyName()
	 * @generated
	 */
	EAttribute getKeyName_KeyOrder();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.tables.IndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.IndexName
	 * @generated
	 */
	EClass getIndexName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.tables.IndexName#getAdditionalIndexNames <em>Additional Index Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Index Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.IndexName#getAdditionalIndexNames()
	 * @see #getIndexName()
	 * @generated
	 */
	EReference getIndexName_AdditionalIndexNames();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.tables.TableDimension <em>Table Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Dimension</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.TableDimension
	 * @generated
	 */
	EClass getTableDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.tables.TableDimension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.TableDimension#getValue()
	 * @see #getTableDimension()
	 * @generated
	 */
	EAttribute getTableDimension_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.tables.AdditionalIndexName <em>Additional Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Index Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.AdditionalIndexName
	 * @generated
	 */
	EClass getAdditionalIndexName();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.tables.SortingOrder <em>Sorting Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Order</em>'.
	 * @see org.servicifi.gelato.language.cobol.tables.SortingOrder
	 * @generated
	 */
	EEnum getSortingOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TablesFactory getTablesFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TableImpl
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_DIMENSION = eINSTANCE.getTable_TableDimension();

		/**
		 * The meta object literal for the '<em><b>Indexed By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__INDEXED_BY = eINSTANCE.getTable_IndexedBy();

		/**
		 * The meta object literal for the '<em><b>Keys Are</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__KEYS_ARE = eINSTANCE.getTable_KeysAre();

		/**
		 * The meta object literal for the '<em><b>Max Table Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__MAX_TABLE_DIMENSION = eINSTANCE.getTable_MaxTableDimension();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DEPENDS_ON = eINSTANCE.getTable_DependsOn();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl <em>Key Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getKeyName()
		 * @generated
		 */
		EClass KEY_NAME = eINSTANCE.getKeyName();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_NAME__KEYS = eINSTANCE.getKeyName_Keys();

		/**
		 * The meta object literal for the '<em><b>Key Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_NAME__KEY_ORDER = eINSTANCE.getKeyName_KeyOrder();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl <em>Index Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.impl.IndexNameImpl
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getIndexName()
		 * @generated
		 */
		EClass INDEX_NAME = eINSTANCE.getIndexName();

		/**
		 * The meta object literal for the '<em><b>Additional Index Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_NAME__ADDITIONAL_INDEX_NAMES = eINSTANCE.getIndexName_AdditionalIndexNames();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.impl.TableDimensionImpl <em>Table Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TableDimensionImpl
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getTableDimension()
		 * @generated
		 */
		EClass TABLE_DIMENSION = eINSTANCE.getTableDimension();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_DIMENSION__VALUE = eINSTANCE.getTableDimension_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.impl.AdditionalIndexNameImpl <em>Additional Index Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.impl.AdditionalIndexNameImpl
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getAdditionalIndexName()
		 * @generated
		 */
		EClass ADDITIONAL_INDEX_NAME = eINSTANCE.getAdditionalIndexName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.tables.SortingOrder <em>Sorting Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.tables.SortingOrder
		 * @see org.servicifi.gelato.language.cobol.tables.impl.TablesPackageImpl#getSortingOrder()
		 * @generated
		 */
		EEnum SORTING_ORDER = eINSTANCE.getSortingOrder();

	}

} //TablesPackage
