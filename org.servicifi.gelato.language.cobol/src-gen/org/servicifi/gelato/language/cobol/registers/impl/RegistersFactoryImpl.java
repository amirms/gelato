/**
 */
package org.servicifi.gelato.language.cobol.registers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.registers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegistersFactoryImpl extends EFactoryImpl implements RegistersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegistersFactory init() {
		try {
			RegistersFactory theRegistersFactory = (RegistersFactory)EPackage.Registry.INSTANCE.getEFactory(RegistersPackage.eNS_URI);
			if (theRegistersFactory != null) {
				return theRegistersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegistersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistersFactoryImpl() {
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
			case RegistersPackage.SHIFT_IN: return createShiftIn();
			case RegistersPackage.SHIFT_OUT: return createShiftOut();
			case RegistersPackage.ADDRESS_OF: return createAddressOf();
			case RegistersPackage.LENGTH_OF: return createLengthOf();
			case RegistersPackage.RETURN_CODE: return createReturnCode();
			case RegistersPackage.WHEN_COMPILED: return createWhenCompiled();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftIn createShiftIn() {
		ShiftInImpl shiftIn = new ShiftInImpl();
		return shiftIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftOut createShiftOut() {
		ShiftOutImpl shiftOut = new ShiftOutImpl();
		return shiftOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressOf createAddressOf() {
		AddressOfImpl addressOf = new AddressOfImpl();
		return addressOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthOf createLengthOf() {
		LengthOfImpl lengthOf = new LengthOfImpl();
		return lengthOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnCode createReturnCode() {
		ReturnCodeImpl returnCode = new ReturnCodeImpl();
		return returnCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenCompiled createWhenCompiled() {
		WhenCompiledImpl whenCompiled = new WhenCompiledImpl();
		return whenCompiled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistersPackage getRegistersPackage() {
		return (RegistersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegistersPackage getPackage() {
		return RegistersPackage.eINSTANCE;
	}

} //RegistersFactoryImpl
