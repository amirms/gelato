/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;

import org.servicifi.gelato.analysis.framework.commons.*;

import org.servicifi.gelato.language.kernel.containers.CompilationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReturnImpl extends StatementImpl implements Return {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.RETURN;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public LabellableElement first() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	@Override
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		EObject container = this.eContainer();
		EObject previousContainer = container; // the outmost procedure in the compilation unit
		while (!(container instanceof CompilationUnit)){
			previousContainer = container;
			container = container.eContainer();
		}
			
		Procedure proc = (Procedure) previousContainer;
		
		res.add(proc.getEnd());
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Flow> internalFlow() {
		EObject container = this.eContainer();
		EObject previousContainer = container; // the outmost procedure in the compilation unit
		while (!(container instanceof CompilationUnit)){
			previousContainer = container;
			container = container.eContainer();
		}
			
		Procedure proc = (Procedure) previousContainer;
		
		EList<Flow> res = new BasicEList<Flow>();
		
		res.add(GraphsFactory.eINSTANCE.createRegularFlow(this, proc.getEnd()));
		return res;
	}

} //ReturnImpl
