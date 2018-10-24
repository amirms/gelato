/**
 */
package org.servicifi.gelato.language.cobol.dataitems.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.dataitems.*;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage
 * @generated
 */
public class DataitemsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataitemsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataitemsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataitemsPackage.eINSTANCE;
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
	protected DataitemsSwitch<Adapter> modelSwitch =
		new DataitemsSwitch<Adapter>() {
			@Override
			public Adapter casePictureString(PictureString object) {
				return createPictureStringAdapter();
			}
			@Override
			public Adapter caseRenamingDataName(RenamingDataName object) {
				return createRenamingDataNameAdapter();
			}
			@Override
			public Adapter caseConditionName(ConditionName object) {
				return createConditionNameAdapter();
			}
			@Override
			public Adapter caseGlobal(Global object) {
				return createGlobalAdapter();
			}
			@Override
			public Adapter caseExternal(External object) {
				return createExternalAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseDataItemAttribute(DataItemAttribute object) {
				return createDataItemAttributeAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object) {
				return createUsageAdapter();
			}
			@Override
			public Adapter caseGroupUsage(GroupUsage object) {
				return createGroupUsageAdapter();
			}
			@Override
			public Adapter caseDataItem(DataItem object) {
				return createDataItemAdapter();
			}
			@Override
			public Adapter caseRecordName(RecordName object) {
				return createRecordNameAdapter();
			}
			@Override
			public Adapter caseDataName(DataName object) {
				return createDataNameAdapter();
			}
			@Override
			public Adapter caseRedefines(Redefines object) {
				return createRedefinesAdapter();
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
			public Adapter caseReferenceableElement(ReferenceableElement object) {
				return createReferenceableElementAdapter();
			}
			@Override
			public Adapter caseIncompleteElement(IncompleteElement object) {
				return createIncompleteElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.PictureString <em>Picture String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.PictureString
	 * @generated
	 */
	public Adapter createPictureStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.RenamingDataName <em>Renaming Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RenamingDataName
	 * @generated
	 */
	public Adapter createRenamingDataNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.ConditionName <em>Condition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.ConditionName
	 * @generated
	 */
	public Adapter createConditionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Global
	 * @generated
	 */
	public Adapter createGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute <em>Data Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute
	 * @generated
	 */
	public Adapter createDataItemAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.GroupUsage <em>Group Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.GroupUsage
	 * @generated
	 */
	public Adapter createGroupUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataItem
	 * @generated
	 */
	public Adapter createDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.RecordName <em>Record Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.RecordName
	 * @generated
	 */
	public Adapter createRecordNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.DataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.DataName
	 * @generated
	 */
	public Adapter createDataNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.dataitems.Redefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.dataitems.Redefines
	 * @generated
	 */
	public Adapter createRedefinesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.references.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.references.ReferenceableElement
	 * @generated
	 */
	public Adapter createReferenceableElementAdapter() {
		return null;
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

} //DataitemsAdapterFactory
