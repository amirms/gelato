/**
 */
package org.servicifi.gelato.language.kernel.references.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Argument</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ArgumentImpl extends ElementReferenceImpl implements Argument {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Parameter getCorrespondingParameter() {
		if (!(eContainer() instanceof ProcedureCall)) {
			throw new Error("Argument has no call container");
		}

		ProcedureCall caller = (ProcedureCall) eContainer();

		int index = 0;
		while (!caller.getArguments().get(index).equals(this)) {
			index++;
		}

		if (!(caller.getTarget() instanceof Procedure)) {
			throw new Error("Procedure call has no target procedure");
		}

		Procedure callee = (Procedure) caller.getTarget();
		
		if (callee.getParameters().size() != caller.getArguments().size()) {
			throw new Error("Procedure does not have as many parameters as arguments of the procedure call");
		}
		
		return callee.getParameters().get(index);
	}

} // ArgumentImpl
