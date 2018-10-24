/**
 */
package org.servicifi.gelato.language.cobol.literals.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.cobol.literals.Literal;
import org.servicifi.gelato.language.cobol.literals.LiteralsPackage;

import org.servicifi.gelato.language.cobol.water.impl.SelectStatementWaterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralImpl extends SelectStatementWaterImpl implements Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiteralsPackage.Literals.LITERAL;
	}

} //LiteralImpl
