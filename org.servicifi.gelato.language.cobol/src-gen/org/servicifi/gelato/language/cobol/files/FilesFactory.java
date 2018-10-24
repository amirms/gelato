/**
 */
package org.servicifi.gelato.language.cobol.files;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.files.FilesPackage
 * @generated
 */
public interface FilesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesFactory eINSTANCE = org.servicifi.gelato.language.cobol.files.impl.FilesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Name</em>'.
	 * @generated
	 */
	FileName createFileName();

	/**
	 * Returns a new object of class '<em>Select Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Statement</em>'.
	 * @generated
	 */
	SelectStatement createSelectStatement();

	/**
	 * Returns a new object of class '<em>File Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Status</em>'.
	 * @generated
	 */
	FileStatus createFileStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilesPackage getFilesPackage();

} //FilesFactory
