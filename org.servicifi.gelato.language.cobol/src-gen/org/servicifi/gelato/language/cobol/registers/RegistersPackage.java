/**
 */
package org.servicifi.gelato.language.cobol.registers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.operands.OperandsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.registers.RegistersFactory
 * @model kind="package"
 * @generated
 */
public interface RegistersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "registers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/registers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "registers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistersPackage eINSTANCE = org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegisterImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__OPERAND = OperandsPackage.PRIMARY_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = OperandsPackage.PRIMARY_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ShiftInImpl <em>Shift In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.ShiftInImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getShiftIn()
	 * @generated
	 */
	int SHIFT_IN = 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_IN__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>Shift In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_IN_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ShiftOutImpl <em>Shift Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.ShiftOutImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getShiftOut()
	 * @generated
	 */
	int SHIFT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OUT__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>Shift Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OUT_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.AddressOfImpl <em>Address Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.AddressOfImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getAddressOf()
	 * @generated
	 */
	int ADDRESS_OF = 3;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>Address Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.LengthOfImpl <em>Length Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.LengthOfImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getLengthOf()
	 * @generated
	 */
	int LENGTH_OF = 4;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OF__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>Length Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OF_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ReturnCodeImpl <em>Return Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.ReturnCodeImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getReturnCode()
	 * @generated
	 */
	int RETURN_CODE = 5;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CODE__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>Return Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CODE_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.registers.impl.WhenCompiledImpl <em>When Compiled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.registers.impl.WhenCompiledImpl
	 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getWhenCompiled()
	 * @generated
	 */
	int WHEN_COMPILED = 6;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPILED__OPERAND = REGISTER__OPERAND;

	/**
	 * The number of structural features of the '<em>When Compiled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPILED_FEATURE_COUNT = REGISTER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.registers.Register#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.Register#getOperand()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_Operand();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.ShiftIn <em>Shift In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift In</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.ShiftIn
	 * @generated
	 */
	EClass getShiftIn();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.ShiftOut <em>Shift Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Out</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.ShiftOut
	 * @generated
	 */
	EClass getShiftOut();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.AddressOf <em>Address Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Of</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.AddressOf
	 * @generated
	 */
	EClass getAddressOf();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.LengthOf <em>Length Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Of</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.LengthOf
	 * @generated
	 */
	EClass getLengthOf();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.ReturnCode <em>Return Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Code</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.ReturnCode
	 * @generated
	 */
	EClass getReturnCode();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.registers.WhenCompiled <em>When Compiled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Compiled</em>'.
	 * @see org.servicifi.gelato.language.cobol.registers.WhenCompiled
	 * @generated
	 */
	EClass getWhenCompiled();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegistersFactory getRegistersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegisterImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__OPERAND = eINSTANCE.getRegister_Operand();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ShiftInImpl <em>Shift In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.ShiftInImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getShiftIn()
		 * @generated
		 */
		EClass SHIFT_IN = eINSTANCE.getShiftIn();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ShiftOutImpl <em>Shift Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.ShiftOutImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getShiftOut()
		 * @generated
		 */
		EClass SHIFT_OUT = eINSTANCE.getShiftOut();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.AddressOfImpl <em>Address Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.AddressOfImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getAddressOf()
		 * @generated
		 */
		EClass ADDRESS_OF = eINSTANCE.getAddressOf();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.LengthOfImpl <em>Length Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.LengthOfImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getLengthOf()
		 * @generated
		 */
		EClass LENGTH_OF = eINSTANCE.getLengthOf();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.ReturnCodeImpl <em>Return Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.ReturnCodeImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getReturnCode()
		 * @generated
		 */
		EClass RETURN_CODE = eINSTANCE.getReturnCode();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.registers.impl.WhenCompiledImpl <em>When Compiled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.registers.impl.WhenCompiledImpl
		 * @see org.servicifi.gelato.language.cobol.registers.impl.RegistersPackageImpl#getWhenCompiled()
		 * @generated
		 */
		EClass WHEN_COMPILED = eINSTANCE.getWhenCompiled();

	}

} //RegistersPackage
