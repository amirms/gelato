/**
 */
package org.servicifi.gelato.language.kernel.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;

import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

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
 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PREDECESSORS = CommonsPackage.LABELLABLE_ELEMENT__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SUCCESSORS = CommonsPackage.LABELLABLE_ELEMENT__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LABEL = CommonsPackage.LABELLABLE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CHILDREN = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = CommonsPackage.LABELLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.SubExpressionImpl <em>Sub Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.SubExpressionImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getSubExpression()
	 * @generated
	 */
	int SUB_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EXPRESSION__TARGET = ReferencesPackage.ELEMENT_REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Sub Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EXPRESSION_FEATURE_COUNT = ReferencesPackage.ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.DefinitionImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TARGET = SUB_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Reaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__REACHES = SUB_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = SUB_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.DefinesImpl <em>Defines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.DefinesImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getDefines()
	 * @generated
	 */
	int DEFINES = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES__TARGET = DEFINITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES__REACHES = DEFINITION__REACHES;

	/**
	 * The number of structural features of the '<em>Defines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINES_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.AffectsImpl <em>Affects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.AffectsImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getAffects()
	 * @generated
	 */
	int AFFECTS = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS__TARGET = DEFINITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS__REACHES = DEFINITION__REACHES;

	/**
	 * The number of structural features of the '<em>Affects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTS_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.UsageImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TARGET = SUB_EXPRESSION__TARGET;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = SUB_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.UsesImpl
	 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getUses()
	 * @generated
	 */
	int USES = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TARGET = USAGE__TARGET;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = USAGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.kernel.expressions.Expression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Expression#getChildren()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Children();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.SubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Expression</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.SubExpression
	 * @generated
	 */
	EClass getSubExpression();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Defines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defines</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Defines
	 * @generated
	 */
	EClass getDefines();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Affects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affects</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Affects
	 * @generated
	 */
	EClass getAffects();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.servicifi.gelato.language.kernel.expressions.Definition#getReaches <em>Reaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reaches</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Definition#getReaches()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Reaches();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.expressions.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see org.servicifi.gelato.language.kernel.expressions.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__CHILDREN = eINSTANCE.getExpression_Children();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.SubExpressionImpl <em>Sub Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.SubExpressionImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getSubExpression()
		 * @generated
		 */
		EClass SUB_EXPRESSION = eINSTANCE.getSubExpression();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.DefinesImpl <em>Defines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.DefinesImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getDefines()
		 * @generated
		 */
		EClass DEFINES = eINSTANCE.getDefines();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.AffectsImpl <em>Affects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.AffectsImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getAffects()
		 * @generated
		 */
		EClass AFFECTS = eINSTANCE.getAffects();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.UsesImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.DefinitionImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Reaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__REACHES = eINSTANCE.getDefinition_Reaches();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.expressions.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.UsageImpl
		 * @see org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsPackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

	}

} //ExpressionsPackage
