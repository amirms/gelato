/**
 */
package org.servicifi.gelato.language.cobol.paragraphs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.paragraphs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParagraphsFactoryImpl extends EFactoryImpl implements ParagraphsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParagraphsFactory init() {
		try {
			ParagraphsFactory theParagraphsFactory = (ParagraphsFactory)EPackage.Registry.INSTANCE.getEFactory(ParagraphsPackage.eNS_URI);
			if (theParagraphsFactory != null) {
				return theParagraphsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParagraphsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphsFactoryImpl() {
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
			case ParagraphsPackage.PARAGRAPH: return createParagraph();
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH: return createSourceComputerParagraph();
			case ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH: return createObjectComputerParagraph();
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH: return createFileControlParagraph();
			case ParagraphsPackage.IO_CONTROL_PARAGRAPH: return createIOControlParagraph();
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH: return createSpecialNamesParagraph();
			case ParagraphsPackage.REPOSITORY_PARAGRAPH: return createRepositoryParagraph();
			case ParagraphsPackage.DEBUGGING_MODE: return createDebuggingMode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceComputerParagraph createSourceComputerParagraph() {
		SourceComputerParagraphImpl sourceComputerParagraph = new SourceComputerParagraphImpl();
		return sourceComputerParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComputerParagraph createObjectComputerParagraph() {
		ObjectComputerParagraphImpl objectComputerParagraph = new ObjectComputerParagraphImpl();
		return objectComputerParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileControlParagraph createFileControlParagraph() {
		FileControlParagraphImpl fileControlParagraph = new FileControlParagraphImpl();
		return fileControlParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlParagraph createIOControlParagraph() {
		IOControlParagraphImpl ioControlParagraph = new IOControlParagraphImpl();
		return ioControlParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialNamesParagraph createSpecialNamesParagraph() {
		SpecialNamesParagraphImpl specialNamesParagraph = new SpecialNamesParagraphImpl();
		return specialNamesParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryParagraph createRepositoryParagraph() {
		RepositoryParagraphImpl repositoryParagraph = new RepositoryParagraphImpl();
		return repositoryParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebuggingMode createDebuggingMode() {
		DebuggingModeImpl debuggingMode = new DebuggingModeImpl();
		return debuggingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphsPackage getParagraphsPackage() {
		return (ParagraphsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParagraphsPackage getPackage() {
		return ParagraphsPackage.eINSTANCE;
	}

} //ParagraphsFactoryImpl
