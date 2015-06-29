/**
 */
package org.servicifi.gelato.language.cobol.water.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.water.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage
 * @generated
 */
public class WaterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WaterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WaterPackage.eINSTANCE;
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
	protected WaterSwitch<Adapter> modelSwitch =
		new WaterSwitch<Adapter>() {
			@Override
			public Adapter caseIncompleteElement(IncompleteElement object) {
				return createIncompleteElementAdapter();
			}
			@Override
			public Adapter caseIdentificationDivisionWater(IdentificationDivisionWater object) {
				return createIdentificationDivisionWaterAdapter();
			}
			@Override
			public Adapter caseWater(Water object) {
				return createWaterAdapter();
			}
			@Override
			public Adapter caseProgramDescription(ProgramDescription object) {
				return createProgramDescriptionAdapter();
			}
			@Override
			public Adapter caseDot(Dot object) {
				return createDotAdapter();
			}
			@Override
			public Adapter caseObjectComputerParagraphWater(ObjectComputerParagraphWater object) {
				return createObjectComputerParagraphWaterAdapter();
			}
			@Override
			public Adapter caseObjectComputerDescription(ObjectComputerDescription object) {
				return createObjectComputerDescriptionAdapter();
			}
			@Override
			public Adapter casePriorityNumber(PriorityNumber object) {
				return createPriorityNumberAdapter();
			}
			@Override
			public Adapter caseSelectStatementWater(SelectStatementWater object) {
				return createSelectStatementWaterAdapter();
			}
			@Override
			public Adapter caseSelectStatementClause(SelectStatementClause object) {
				return createSelectStatementClauseAdapter();
			}
			@Override
			public Adapter caseSpecialNamesParagraphWater(SpecialNamesParagraphWater object) {
				return createSpecialNamesParagraphWaterAdapter();
			}
			@Override
			public Adapter caseSpecialNamesClause(SpecialNamesClause object) {
				return createSpecialNamesClauseAdapter();
			}
			@Override
			public Adapter caseFileDescriptorWater(FileDescriptorWater object) {
				return createFileDescriptorWaterAdapter();
			}
			@Override
			public Adapter caseFileDescription(FileDescription object) {
				return createFileDescriptionAdapter();
			}
			@Override
			public Adapter caseDataDescriptorWater(DataDescriptorWater object) {
				return createDataDescriptorWaterAdapter();
			}
			@Override
			public Adapter caseDataDescription(DataDescription object) {
				return createDataDescriptionAdapter();
			}
			@Override
			public Adapter caseIOControlParagraphWater(IOControlParagraphWater object) {
				return createIOControlParagraphWaterAdapter();
			}
			@Override
			public Adapter caseIOControlDescription(IOControlDescription object) {
				return createIOControlDescriptionAdapter();
			}
			@Override
			public Adapter caseRepositoryParagraphWater(RepositoryParagraphWater object) {
				return createRepositoryParagraphWaterAdapter();
			}
			@Override
			public Adapter caseRepositoryDescription(RepositoryDescription object) {
				return createRepositoryDescriptionAdapter();
			}
			@Override
			public Adapter caseSQLStatementWater(SQLStatementWater object) {
				return createSQLStatementWaterAdapter();
			}
			@Override
			public Adapter caseCICSStatementWater(CICSStatementWater object) {
				return createCICSStatementWaterAdapter();
			}
			@Override
			public Adapter caseSQLStatementToken(SQLStatementToken object) {
				return createSQLStatementTokenAdapter();
			}
			@Override
			public Adapter caseCICSStatementToken(CICSStatementToken object) {
				return createCICSStatementTokenAdapter();
			}
			@Override
			public Adapter caseAcceptStatementWater(AcceptStatementWater object) {
				return createAcceptStatementWaterAdapter();
			}
			@Override
			public Adapter caseAcceptStatementToken(AcceptStatementToken object) {
				return createAcceptStatementTokenAdapter();
			}
			@Override
			public Adapter caseUseStatementWater(UseStatementWater object) {
				return createUseStatementWaterAdapter();
			}
			@Override
			public Adapter caseUseStatementToken(UseStatementToken object) {
				return createUseStatementTokenAdapter();
			}
			@Override
			public Adapter caseCloseStatementWater(CloseStatementWater object) {
				return createCloseStatementWaterAdapter();
			}
			@Override
			public Adapter caseCloseStatementToken(CloseStatementToken object) {
				return createCloseStatementTokenAdapter();
			}
			@Override
			public Adapter caseInvokeStatementWater(InvokeStatementWater object) {
				return createInvokeStatementWaterAdapter();
			}
			@Override
			public Adapter caseInvokeStatementToken(InvokeStatementToken object) {
				return createInvokeStatementTokenAdapter();
			}
			@Override
			public Adapter caseOpenStatementWater(OpenStatementWater object) {
				return createOpenStatementWaterAdapter();
			}
			@Override
			public Adapter caseOpenStatementToken(OpenStatementToken object) {
				return createOpenStatementTokenAdapter();
			}
			@Override
			public Adapter caseSortPhraseToken(SortPhraseToken object) {
				return createSortPhraseTokenAdapter();
			}
			@Override
			public Adapter caseSortPhraseWater(SortPhraseWater object) {
				return createSortPhraseWaterAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.IncompleteElement <em>Incomplete Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.IncompleteElement
	 * @generated
	 */
	public Adapter createIncompleteElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater <em>Identification Division Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater
	 * @generated
	 */
	public Adapter createIdentificationDivisionWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.Water <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.Water
	 * @generated
	 */
	public Adapter createWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.ProgramDescription <em>Program Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.ProgramDescription
	 * @generated
	 */
	public Adapter createProgramDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.Dot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.Dot
	 * @generated
	 */
	public Adapter createDotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater <em>Object Computer Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater
	 * @generated
	 */
	public Adapter createObjectComputerParagraphWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.ObjectComputerDescription <em>Object Computer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.ObjectComputerDescription
	 * @generated
	 */
	public Adapter createObjectComputerDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.PriorityNumber <em>Priority Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.PriorityNumber
	 * @generated
	 */
	public Adapter createPriorityNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SelectStatementWater <em>Select Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementWater
	 * @generated
	 */
	public Adapter createSelectStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SelectStatementClause <em>Select Statement Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SelectStatementClause
	 * @generated
	 */
	public Adapter createSelectStatementClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater <em>Special Names Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater
	 * @generated
	 */
	public Adapter createSpecialNamesParagraphWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SpecialNamesClause <em>Special Names Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SpecialNamesClause
	 * @generated
	 */
	public Adapter createSpecialNamesClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.FileDescriptorWater <em>File Descriptor Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescriptorWater
	 * @generated
	 */
	public Adapter createFileDescriptorWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.FileDescription <em>File Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.FileDescription
	 * @generated
	 */
	public Adapter createFileDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.DataDescriptorWater <em>Data Descriptor Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescriptorWater
	 * @generated
	 */
	public Adapter createDataDescriptorWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.DataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.DataDescription
	 * @generated
	 */
	public Adapter createDataDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.IOControlParagraphWater <em>IO Control Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlParagraphWater
	 * @generated
	 */
	public Adapter createIOControlParagraphWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.IOControlDescription <em>IO Control Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.IOControlDescription
	 * @generated
	 */
	public Adapter createIOControlDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater <em>Repository Paragraph Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater
	 * @generated
	 */
	public Adapter createRepositoryParagraphWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.RepositoryDescription <em>Repository Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.RepositoryDescription
	 * @generated
	 */
	public Adapter createRepositoryDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SQLStatementWater <em>SQL Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementWater
	 * @generated
	 */
	public Adapter createSQLStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.CICSStatementWater <em>CICS Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementWater
	 * @generated
	 */
	public Adapter createCICSStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SQLStatementToken <em>SQL Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SQLStatementToken
	 * @generated
	 */
	public Adapter createSQLStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.CICSStatementToken <em>CICS Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.CICSStatementToken
	 * @generated
	 */
	public Adapter createCICSStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementWater <em>Accept Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementWater
	 * @generated
	 */
	public Adapter createAcceptStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.AcceptStatementToken <em>Accept Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.AcceptStatementToken
	 * @generated
	 */
	public Adapter createAcceptStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.UseStatementWater <em>Use Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementWater
	 * @generated
	 */
	public Adapter createUseStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.UseStatementToken <em>Use Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.UseStatementToken
	 * @generated
	 */
	public Adapter createUseStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.CloseStatementWater <em>Close Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementWater
	 * @generated
	 */
	public Adapter createCloseStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.CloseStatementToken <em>Close Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.CloseStatementToken
	 * @generated
	 */
	public Adapter createCloseStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementWater <em>Invoke Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementWater
	 * @generated
	 */
	public Adapter createInvokeStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.InvokeStatementToken <em>Invoke Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.InvokeStatementToken
	 * @generated
	 */
	public Adapter createInvokeStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.OpenStatementWater <em>Open Statement Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementWater
	 * @generated
	 */
	public Adapter createOpenStatementWaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.OpenStatementToken <em>Open Statement Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.OpenStatementToken
	 * @generated
	 */
	public Adapter createOpenStatementTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SortPhraseToken <em>Sort Phrase Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseToken
	 * @generated
	 */
	public Adapter createSortPhraseTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.water.SortPhraseWater <em>Sort Phrase Water</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.water.SortPhraseWater
	 * @generated
	 */
	public Adapter createSortPhraseWaterAdapter() {
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

} //WaterAdapterFactory
