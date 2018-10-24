/**
 */
package org.servicifi.gelato.language.cobol.environments.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.environments.*;

import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.Water;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage
 * @generated
 */
public class EnvironmentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnvironmentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EnvironmentsPackage.eINSTANCE;
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
	protected EnvironmentsSwitch<Adapter> modelSwitch =
		new EnvironmentsSwitch<Adapter>() {
			@Override
			public Adapter caseSystemDevice(SystemDevice object) {
				return createSystemDeviceAdapter();
			}
			@Override
			public Adapter caseSystemLogicalInput(SystemLogicalInput object) {
				return createSystemLogicalInputAdapter();
			}
			@Override
			public Adapter caseUPSI(UPSI object) {
				return createUPSIAdapter();
			}
			@Override
			public Adapter caseSystemLogicalOutput(SystemLogicalOutput object) {
				return createSystemLogicalOutputAdapter();
			}
			@Override
			public Adapter caseSystemPunchDevice(SystemPunchDevice object) {
				return createSystemPunchDeviceAdapter();
			}
			@Override
			public Adapter caseConsole(Console object) {
				return createConsoleAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseAdvancedFunctionPrinting(AdvancedFunctionPrinting object) {
				return createAdvancedFunctionPrintingAdapter();
			}
			@Override
			public Adapter caseSuppressSpacing(SuppressSpacing object) {
				return createSuppressSpacingAdapter();
			}
			@Override
			public Adapter casePocket(Pocket object) {
				return createPocketAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseWater(Water object) {
				return createWaterAdapter();
			}
			@Override
			public Adapter caseAcceptStatementWater(AcceptStatementWater object) {
				return createAcceptStatementWaterAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.SystemDevice <em>System Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemDevice
	 * @generated
	 */
	public Adapter createSystemDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalInput <em>System Logical Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalInput
	 * @generated
	 */
	public Adapter createSystemLogicalInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.UPSI <em>UPSI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSI
	 * @generated
	 */
	public Adapter createUPSIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput <em>System Logical Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput
	 * @generated
	 */
	public Adapter createSystemLogicalOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevice <em>System Punch Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevice
	 * @generated
	 */
	public Adapter createSystemPunchDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.Console <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.Console
	 * @generated
	 */
	public Adapter createConsoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting <em>Advanced Function Printing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting
	 * @generated
	 */
	public Adapter createAdvancedFunctionPrintingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.SuppressSpacing <em>Suppress Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.SuppressSpacing
	 * @generated
	 */
	public Adapter createSuppressSpacingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.Pocket <em>Pocket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.Pocket
	 * @generated
	 */
	public Adapter createPocketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.environments.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.environments.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
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

} //EnvironmentsAdapterFactory
