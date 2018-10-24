/**
 */
package org.servicifi.gelato.analysis.framework.commons.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;
import org.servicifi.gelato.analysis.framework.commons.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.VARIABLE;
	}

} //VariableImpl
