/**
 */
package org.servicifi.gelato.analysis.framework.commons.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.graphs.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StartImpl extends LabellableElementImpl implements Start {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.START;
	}
	
	@Override
	public LabellableElement first() {
		return this;
	}

	@Override
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		res.add(this);
		return res;
	}

	@Override
	public EList<Flow> internalFlow() {
		return new BasicEList<>();
	}

} //StartImpl
