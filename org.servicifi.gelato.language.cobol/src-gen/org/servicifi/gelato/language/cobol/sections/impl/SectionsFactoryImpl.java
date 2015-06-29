/**
 */
package org.servicifi.gelato.language.cobol.sections.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.sections.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SectionsFactoryImpl extends EFactoryImpl implements SectionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SectionsFactory init() {
		try {
			SectionsFactory theSectionsFactory = (SectionsFactory)EPackage.Registry.INSTANCE.getEFactory(SectionsPackage.eNS_URI);
			if (theSectionsFactory != null) {
				return theSectionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SectionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionsFactoryImpl() {
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
			case SectionsPackage.SECTION: return createSection();
			case SectionsPackage.WORKING_STORAGE_SECTION: return createWorkingStorageSection();
			case SectionsPackage.LOCAL_STORAGE_SECTION: return createLocalStorageSection();
			case SectionsPackage.LINKAGE_STORAGE_SECTION: return createLinkageStorageSection();
			case SectionsPackage.IO_SECTION: return createIOSection();
			case SectionsPackage.CONFIGURATION_SECTION: return createConfigurationSection();
			case SectionsPackage.FILE_SECTION: return createFileSection();
			case SectionsPackage.DECLARATIVE_SECTION: return createDeclarativeSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingStorageSection createWorkingStorageSection() {
		WorkingStorageSectionImpl workingStorageSection = new WorkingStorageSectionImpl();
		return workingStorageSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalStorageSection createLocalStorageSection() {
		LocalStorageSectionImpl localStorageSection = new LocalStorageSectionImpl();
		return localStorageSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageStorageSection createLinkageStorageSection() {
		LinkageStorageSectionImpl linkageStorageSection = new LinkageStorageSectionImpl();
		return linkageStorageSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOSection createIOSection() {
		IOSectionImpl ioSection = new IOSectionImpl();
		return ioSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSection createConfigurationSection() {
		ConfigurationSectionImpl configurationSection = new ConfigurationSectionImpl();
		return configurationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSection createFileSection() {
		FileSectionImpl fileSection = new FileSectionImpl();
		return fileSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativeSection createDeclarativeSection() {
		DeclarativeSectionImpl declarativeSection = new DeclarativeSectionImpl();
		return declarativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionsPackage getSectionsPackage() {
		return (SectionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SectionsPackage getPackage() {
		return SectionsPackage.eINSTANCE;
	}

} //SectionsFactoryImpl
