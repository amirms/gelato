/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.statements.Abort;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbortImpl extends StatementImpl implements Abort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbortImpl() {
		super();
	}
	
//	@Override
//	public LabellableElement first() {
//		this.eC
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.ABORT;
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
		while (!(container instanceof CompilationUnit))
			container = container.eContainer();
			
		CompilationUnit cu = (CompilationUnit) container;
		
		res.add(cu.getEnd());
		return res;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	@Override
	public EList<Flow> internalFlow() {
		
		EObject container = this.eContainer();
		while (!(container instanceof CompilationUnit))
			container = container.eContainer();
			
		CompilationUnit cu = (CompilationUnit) container;
		
		EList<Flow> res = new BasicEList<Flow>();
		
		res.add(GraphsFactory.eINSTANCE.createRegularFlow(this, cu.getEnd()));
		return res;
	}

} //AbortImpl
