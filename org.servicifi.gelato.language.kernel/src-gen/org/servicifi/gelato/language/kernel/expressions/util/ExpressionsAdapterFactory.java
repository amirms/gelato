/**
 */
package org.servicifi.gelato.language.kernel.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.kernel.commons.LabellableElement;

import org.servicifi.gelato.language.kernel.expressions.*;
import org.servicifi.gelato.language.kernel.references.ElementReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionsPackage.eINSTANCE;
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
	protected ExpressionsSwitch<Adapter> modelSwitch =
		new ExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseSubExpression(SubExpression object) {
				return createSubExpressionAdapter();
			}
			@Override
			public Adapter caseDefines(Defines object) {
				return createDefinesAdapter();
			}
			@Override
			public Adapter casePostDefines(PostDefines object) {
				return createPostDefinesAdapter();
			}
			@Override
			public Adapter caseAffects(Affects object) {
				return createAffectsAdapter();
			}
			@Override
			public Adapter casePostAffects(PostAffects object) {
				return createPostAffectsAdapter();
			}
			@Override
			public Adapter caseUses(Uses object) {
				return createUsesAdapter();
			}
			@Override
			public Adapter casePreUses(PreUses object) {
				return createPreUsesAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object) {
				return createUsageAdapter();
			}
			@Override
			public Adapter caseLabellableElement(LabellableElement object) {
				return createLabellableElementAdapter();
			}
			@Override
			public Adapter caseElementReference(ElementReference object) {
				return createElementReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.SubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.SubExpression
	 * @generated
	 */
	public Adapter createSubExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Defines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Defines
	 * @generated
	 */
	public Adapter createDefinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.PostDefines <em>Post Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.PostDefines
	 * @generated
	 */
	public Adapter createPostDefinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Affects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Affects
	 * @generated
	 */
	public Adapter createAffectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.PostAffects <em>Post Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.PostAffects
	 * @generated
	 */
	public Adapter createPostAffectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Uses
	 * @generated
	 */
	public Adapter createUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.PreUses <em>Pre Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.PreUses
	 * @generated
	 */
	public Adapter createPreUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.expressions.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.expressions.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.commons.LabellableElement <em>Labellable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.commons.LabellableElement
	 * @generated
	 */
	public Adapter createLabellableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.kernel.references.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.kernel.references.ElementReference
	 * @generated
	 */
	public Adapter createElementReferenceAdapter() {
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

} //ExpressionsAdapterFactory
