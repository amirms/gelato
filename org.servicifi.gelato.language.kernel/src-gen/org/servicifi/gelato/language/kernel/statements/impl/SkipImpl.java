/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.statements.Skip;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SkipImpl extends StatementImpl implements Skip {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.SKIP;
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
		res.add(this);
		return res;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	@Override
	public EList<Flow> internalFlow() {
		return new BasicEList<>();
	}

} //SkipImpl
