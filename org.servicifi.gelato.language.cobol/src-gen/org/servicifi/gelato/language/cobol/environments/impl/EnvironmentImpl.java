/**
 */
package org.servicifi.gelato.language.cobol.environments.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.cobol.environments.Environment;
import org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage;

import org.servicifi.gelato.language.cobol.water.impl.AcceptStatementWaterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class EnvironmentImpl extends AcceptStatementWaterImpl implements Environment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentsPackage.Literals.ENVIRONMENT;
	}

} //EnvironmentImpl
