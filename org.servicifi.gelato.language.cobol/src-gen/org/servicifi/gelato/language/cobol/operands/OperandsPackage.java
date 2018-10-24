/**
 */
package org.servicifi.gelato.language.cobol.operands;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.servicifi.gelato.language.cobol.operands.OperandsFactory
 * @model kind="package"
 * @generated
 */
public interface OperandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/operands";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperandsPackage eINSTANCE = org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 4;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.ReplacementOperandImpl <em>Replacement Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.ReplacementOperandImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getReplacementOperand()
	 * @generated
	 */
	int REPLACEMENT_OPERAND = 2;

	/**
	 * The number of structural features of the '<em>Replacement Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEMENT_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.PrimaryOperandImpl <em>Primary Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.PrimaryOperandImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getPrimaryOperand()
	 * @generated
	 */
	int PRIMARY_OPERAND = 0;

	/**
	 * The number of structural features of the '<em>Primary Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OPERAND_FEATURE_COUNT = REPLACEMENT_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.ArithmeticOperandImpl <em>Arithmetic Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.ArithmeticOperandImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getArithmeticOperand()
	 * @generated
	 */
	int ARITHMETIC_OPERAND = 5;

	/**
	 * The number of structural features of the '<em>Arithmetic Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.RoundedIdentifierImpl <em>Rounded Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.RoundedIdentifierImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getRoundedIdentifier()
	 * @generated
	 */
	int ROUNDED_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_IDENTIFIER__IDENTIFIER = ARITHMETIC_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rounded Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_IDENTIFIER_FEATURE_COUNT = ARITHMETIC_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.impl.EncodingImpl <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.impl.EncodingImpl
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__TYPE = REPLACEMENT_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = REPLACEMENT_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operands.EncodingTypes <em>Encoding Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operands.EncodingTypes
	 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getEncodingTypes()
	 * @generated
	 */
	int ENCODING_TYPES = 6;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand <em>Primary Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Operand</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.PrimaryOperand
	 * @generated
	 */
	EClass getPrimaryOperand();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.RoundedIdentifier <em>Rounded Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Identifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.RoundedIdentifier
	 * @generated
	 */
	EClass getRoundedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.operands.RoundedIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.RoundedIdentifier#getIdentifier()
	 * @see #getRoundedIdentifier()
	 * @generated
	 */
	EReference getRoundedIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.ReplacementOperand <em>Replacement Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replacement Operand</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.ReplacementOperand
	 * @generated
	 */
	EClass getReplacementOperand();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operands.Encoding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.Encoding#getType()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_Type();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand <em>Arithmetic Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operand</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.ArithmeticOperand
	 * @generated
	 */
	EClass getArithmeticOperand();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.operands.EncodingTypes <em>Encoding Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Types</em>'.
	 * @see org.servicifi.gelato.language.cobol.operands.EncodingTypes
	 * @generated
	 */
	EEnum getEncodingTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperandsFactory getOperandsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.PrimaryOperandImpl <em>Primary Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.PrimaryOperandImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getPrimaryOperand()
		 * @generated
		 */
		EClass PRIMARY_OPERAND = eINSTANCE.getPrimaryOperand();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.RoundedIdentifierImpl <em>Rounded Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.RoundedIdentifierImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getRoundedIdentifier()
		 * @generated
		 */
		EClass ROUNDED_IDENTIFIER = eINSTANCE.getRoundedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUNDED_IDENTIFIER__IDENTIFIER = eINSTANCE.getRoundedIdentifier_Identifier();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.ReplacementOperandImpl <em>Replacement Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.ReplacementOperandImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getReplacementOperand()
		 * @generated
		 */
		EClass REPLACEMENT_OPERAND = eINSTANCE.getReplacementOperand();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.EncodingImpl <em>Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.EncodingImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getEncoding()
		 * @generated
		 */
		EClass ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__TYPE = eINSTANCE.getEncoding_Type();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.impl.ArithmeticOperandImpl <em>Arithmetic Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.impl.ArithmeticOperandImpl
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getArithmeticOperand()
		 * @generated
		 */
		EClass ARITHMETIC_OPERAND = eINSTANCE.getArithmeticOperand();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operands.EncodingTypes <em>Encoding Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operands.EncodingTypes
		 * @see org.servicifi.gelato.language.cobol.operands.impl.OperandsPackageImpl#getEncodingTypes()
		 * @generated
		 */
		EEnum ENCODING_TYPES = eINSTANCE.getEncodingTypes();

	}

} //OperandsPackage
