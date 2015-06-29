/**
 */
package org.servicifi.gelato.language.cobol.sections;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage
 * @generated
 */
public interface SectionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SectionsFactory eINSTANCE = org.servicifi.gelato.language.cobol.sections.impl.SectionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Working Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Working Storage Section</em>'.
	 * @generated
	 */
	WorkingStorageSection createWorkingStorageSection();

	/**
	 * Returns a new object of class '<em>Local Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Storage Section</em>'.
	 * @generated
	 */
	LocalStorageSection createLocalStorageSection();

	/**
	 * Returns a new object of class '<em>Linkage Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage Storage Section</em>'.
	 * @generated
	 */
	LinkageStorageSection createLinkageStorageSection();

	/**
	 * Returns a new object of class '<em>IO Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Section</em>'.
	 * @generated
	 */
	IOSection createIOSection();

	/**
	 * Returns a new object of class '<em>Configuration Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Section</em>'.
	 * @generated
	 */
	ConfigurationSection createConfigurationSection();

	/**
	 * Returns a new object of class '<em>File Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Section</em>'.
	 * @generated
	 */
	FileSection createFileSection();

	/**
	 * Returns a new object of class '<em>Declarative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declarative Section</em>'.
	 * @generated
	 */
	DeclarativeSection createDeclarativeSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SectionsPackage getSectionsPackage();

} //SectionsFactory
