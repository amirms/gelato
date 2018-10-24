/**
 */
package org.servicifi.gelato.language.cobol.identifiers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.operands.OperandsPackage;

import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

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
 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifiersFactory
 * @model kind="package"
 * @generated
 */
public interface IdentifiersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "identifiers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/identifiers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "identifiers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifiersPackage eINSTANCE = org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.SubscriptImpl <em>Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.SubscriptImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getSubscript()
	 * @generated
	 */
	int SUBSCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SUBSCRIPT = 0;

	/**
	 * The number of structural features of the '<em>Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__MODIFIER = OperandsPackage.PRIMARY_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = OperandsPackage.PRIMARY_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getIdentifierReference()
	 * @generated
	 */
	int IDENTIFIER_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__MODIFIER = IDENTIFIER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__TARGET = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__QUALIFIER = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__SUBSCRIPTS = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__QUALIFIERS = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identifier Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.DirectSubscriptImpl <em>Direct Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.DirectSubscriptImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getDirectSubscript()
	 * @generated
	 */
	int DIRECT_SUBSCRIPT = 8;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_SUBSCRIPT__SUBSCRIPT = SUBSCRIPT__SUBSCRIPT;

	/**
	 * The number of structural features of the '<em>Direct Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_SUBSCRIPT_FEATURE_COUNT = SUBSCRIPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.AllImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 3;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__SUBSCRIPT = DIRECT_SUBSCRIPT__SUBSCRIPT;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = DIRECT_SUBSCRIPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.ReferenceModifierImpl <em>Reference Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.ReferenceModifierImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getReferenceModifier()
	 * @generated
	 */
	int REFERENCE_MODIFIER = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODIFIER__START = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODIFIER__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Reference Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.LinageCounterImpl <em>Linage Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.LinageCounterImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getLinageCounter()
	 * @generated
	 */
	int LINAGE_COUNTER = 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINAGE_COUNTER__MODIFIER = IDENTIFIER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINAGE_COUNTER__QUALIFIER = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linage Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINAGE_COUNTER_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.QualifierImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__TARGET = ReferencesPackage.ELEMENT_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = ReferencesPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl <em>Relative Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl
	 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getRelativeSubscript()
	 * @generated
	 */
	int RELATIVE_SUBSCRIPT = 7;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SUBSCRIPT__SUBSCRIPT = SUBSCRIPT__SUBSCRIPT;

	/**
	 * The feature id for the '<em><b>Additive Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR = SUBSCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SUBSCRIPT__INTEGER = SUBSCRIPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SUBSCRIPT_FEATURE_COUNT = SUBSCRIPT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.Subscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscript</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.Subscript
	 * @generated
	 */
	EClass getSubscript();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.Subscript#getSubscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscript</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.Subscript#getSubscript()
	 * @see #getSubscript()
	 * @generated
	 */
	EReference getSubscript_Subscript();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.Identifier#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.Identifier#getModifier()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Modifier();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference <em>Identifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Reference</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifierReference
	 * @generated
	 */
	EClass getIdentifierReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getSubscripts <em>Subscripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscripts</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getSubscripts()
	 * @see #getIdentifierReference()
	 * @generated
	 */
	EReference getIdentifierReference_Subscripts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifiers</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.IdentifierReference#getQualifiers()
	 * @see #getIdentifierReference()
	 * @generated
	 */
	EReference getIdentifierReference_Qualifiers();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier <em>Reference Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Modifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier
	 * @generated
	 */
	EClass getReferenceModifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getStart()
	 * @see #getReferenceModifier()
	 * @generated
	 */
	EReference getReferenceModifier_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier#getLength()
	 * @see #getReferenceModifier()
	 * @generated
	 */
	EReference getReferenceModifier_Length();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.LinageCounter <em>Linage Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linage Counter</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.LinageCounter
	 * @generated
	 */
	EClass getLinageCounter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript <em>Relative Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Subscript</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript
	 * @generated
	 */
	EClass getRelativeSubscript();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getAdditiveOperator <em>Additive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additive Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getAdditiveOperator()
	 * @see #getRelativeSubscript()
	 * @generated
	 */
	EReference getRelativeSubscript_AdditiveOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript#getInteger()
	 * @see #getRelativeSubscript()
	 * @generated
	 */
	EReference getRelativeSubscript_Integer();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.identifiers.DirectSubscript <em>Direct Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Subscript</em>'.
	 * @see org.servicifi.gelato.language.cobol.identifiers.DirectSubscript
	 * @generated
	 */
	EClass getDirectSubscript();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdentifiersFactory getIdentifiersFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.SubscriptImpl <em>Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.SubscriptImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getSubscript()
		 * @generated
		 */
		EClass SUBSCRIPT = eINSTANCE.getSubscript();

		/**
		 * The meta object literal for the '<em><b>Subscript</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__SUBSCRIPT = eINSTANCE.getSubscript_Subscript();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__MODIFIER = eINSTANCE.getIdentifier_Modifier();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifierReferenceImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getIdentifierReference()
		 * @generated
		 */
		EClass IDENTIFIER_REFERENCE = eINSTANCE.getIdentifierReference();

		/**
		 * The meta object literal for the '<em><b>Subscripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_REFERENCE__SUBSCRIPTS = eINSTANCE.getIdentifierReference_Subscripts();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_REFERENCE__QUALIFIERS = eINSTANCE.getIdentifierReference_Qualifiers();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.AllImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.ReferenceModifierImpl <em>Reference Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.ReferenceModifierImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getReferenceModifier()
		 * @generated
		 */
		EClass REFERENCE_MODIFIER = eINSTANCE.getReferenceModifier();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODIFIER__START = eINSTANCE.getReferenceModifier_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODIFIER__LENGTH = eINSTANCE.getReferenceModifier_Length();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.LinageCounterImpl <em>Linage Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.LinageCounterImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getLinageCounter()
		 * @generated
		 */
		EClass LINAGE_COUNTER = eINSTANCE.getLinageCounter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.QualifierImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl <em>Relative Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.RelativeSubscriptImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getRelativeSubscript()
		 * @generated
		 */
		EClass RELATIVE_SUBSCRIPT = eINSTANCE.getRelativeSubscript();

		/**
		 * The meta object literal for the '<em><b>Additive Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR = eINSTANCE.getRelativeSubscript_AdditiveOperator();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SUBSCRIPT__INTEGER = eINSTANCE.getRelativeSubscript_Integer();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.identifiers.impl.DirectSubscriptImpl <em>Direct Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.DirectSubscriptImpl
		 * @see org.servicifi.gelato.language.cobol.identifiers.impl.IdentifiersPackageImpl#getDirectSubscript()
		 * @generated
		 */
		EClass DIRECT_SUBSCRIPT = eINSTANCE.getDirectSubscript();

	}

} //IdentifiersPackage
