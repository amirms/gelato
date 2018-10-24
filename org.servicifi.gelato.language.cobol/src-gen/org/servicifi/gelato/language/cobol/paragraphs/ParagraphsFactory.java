/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage
 * @generated
 */
public interface ParagraphsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParagraphsFactory eINSTANCE = org.servicifi.gelato.language.cobol.paragraphs.impl.ParagraphsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Source Computer Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Computer Paragraph</em>'.
	 * @generated
	 */
	SourceComputerParagraph createSourceComputerParagraph();

	/**
	 * Returns a new object of class '<em>Object Computer Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Computer Paragraph</em>'.
	 * @generated
	 */
	ObjectComputerParagraph createObjectComputerParagraph();

	/**
	 * Returns a new object of class '<em>File Control Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Control Paragraph</em>'.
	 * @generated
	 */
	FileControlParagraph createFileControlParagraph();

	/**
	 * Returns a new object of class '<em>IO Control Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Control Paragraph</em>'.
	 * @generated
	 */
	IOControlParagraph createIOControlParagraph();

	/**
	 * Returns a new object of class '<em>Special Names Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Names Paragraph</em>'.
	 * @generated
	 */
	SpecialNamesParagraph createSpecialNamesParagraph();

	/**
	 * Returns a new object of class '<em>Repository Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Paragraph</em>'.
	 * @generated
	 */
	RepositoryParagraph createRepositoryParagraph();

	/**
	 * Returns a new object of class '<em>Debugging Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debugging Mode</em>'.
	 * @generated
	 */
	DebuggingMode createDebuggingMode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParagraphsPackage getParagraphsPackage();

} //ParagraphsFactory
