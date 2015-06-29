/**
 */
package org.servicifi.gelato.language.jcl.statements.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.jcl.commons.impl.NamedElementImpl;

import org.servicifi.gelato.language.jcl.statements.Statement;
import org.servicifi.gelato.language.jcl.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StatementImpl extends NamedElementImpl implements Statement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.STATEMENT;
	}

} //StatementImpl
