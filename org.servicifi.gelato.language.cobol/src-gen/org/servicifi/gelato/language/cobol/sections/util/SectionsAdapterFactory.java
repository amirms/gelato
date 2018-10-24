/**
 */
package org.servicifi.gelato.language.cobol.sections.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.labels.Procedure;

import org.servicifi.gelato.language.cobol.sections.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage
 * @generated
 */
public class SectionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SectionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SectionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionsSwitch<Adapter> modelSwitch =
		new SectionsSwitch<Adapter>() {
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseWorkingStorageSection(WorkingStorageSection object) {
				return createWorkingStorageSectionAdapter();
			}
			@Override
			public Adapter caseLocalStorageSection(LocalStorageSection object) {
				return createLocalStorageSectionAdapter();
			}
			@Override
			public Adapter caseLinkageStorageSection(LinkageStorageSection object) {
				return createLinkageStorageSectionAdapter();
			}
			@Override
			public Adapter caseIOSection(IOSection object) {
				return createIOSectionAdapter();
			}
			@Override
			public Adapter caseConfigurationSection(ConfigurationSection object) {
				return createConfigurationSectionAdapter();
			}
			@Override
			public Adapter caseEnvironmentDivisionSection(EnvironmentDivisionSection object) {
				return createEnvironmentDivisionSectionAdapter();
			}
			@Override
			public Adapter caseDataDivisionSection(DataDivisionSection object) {
				return createDataDivisionSectionAdapter();
			}
			@Override
			public Adapter caseFileSection(FileSection object) {
				return createFileSectionAdapter();
			}
			@Override
			public Adapter caseDeclarativeSection(DeclarativeSection object) {
				return createDeclarativeSectionAdapter();
			}
			@Override
			public Adapter caseCommentable(Commentable object) {
				return createCommentableAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.WorkingStorageSection <em>Working Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.WorkingStorageSection
	 * @generated
	 */
	public Adapter createWorkingStorageSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.LocalStorageSection <em>Local Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.LocalStorageSection
	 * @generated
	 */
	public Adapter createLocalStorageSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.LinkageStorageSection <em>Linkage Storage Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.LinkageStorageSection
	 * @generated
	 */
	public Adapter createLinkageStorageSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.IOSection <em>IO Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.IOSection
	 * @generated
	 */
	public Adapter createIOSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.ConfigurationSection <em>Configuration Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.ConfigurationSection
	 * @generated
	 */
	public Adapter createConfigurationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection <em>Environment Division Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection
	 * @generated
	 */
	public Adapter createEnvironmentDivisionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.DataDivisionSection <em>Data Division Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.DataDivisionSection
	 * @generated
	 */
	public Adapter createDataDivisionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.FileSection <em>File Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.FileSection
	 * @generated
	 */
	public Adapter createFileSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.sections.DeclarativeSection <em>Declarative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.sections.DeclarativeSection
	 * @generated
	 */
	public Adapter createDeclarativeSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.commons.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.commons.Commentable
	 * @generated
	 */
	public Adapter createCommentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.commons.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.commons.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.labels.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.labels.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SectionsAdapterFactory
