/**
 */
package org.servicifi.gelato.analysis.framework.graphs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsPackage;
import org.servicifi.gelato.analysis.framework.graphs.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Flow</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.graphs.impl.FlowImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Node to;

	/**
	 * This is true if the To reference has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toESet;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Node from;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	protected FlowImpl(Node from, Node to) {
		setFrom(from);
		setFrom(to);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphsPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Node)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphsPackage.FLOW__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Node newTo) {
		Node oldTo = to;
		to = newTo;
		boolean oldToESet = toESet;
		toESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphsPackage.FLOW__TO, oldTo, to, !oldToESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTo() {
		Node oldTo = to;
		boolean oldToESet = toESet;
		to = null;
		toESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GraphsPackage.FLOW__TO, oldTo, null, oldToESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTo() {
		return toESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Node)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphsPackage.FLOW__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Node newFrom) {
		Node oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphsPackage.FLOW__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Flow reverse();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphsPackage.FLOW__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case GraphsPackage.FLOW__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphsPackage.FLOW__TO:
				setTo((Node)newValue);
				return;
			case GraphsPackage.FLOW__FROM:
				setFrom((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphsPackage.FLOW__TO:
				unsetTo();
				return;
			case GraphsPackage.FLOW__FROM:
				setFrom((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphsPackage.FLOW__TO:
				return isSetTo();
			case GraphsPackage.FLOW__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphsPackage.FLOW___REVERSE:
				return reverse();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		return "An edge from " + from + " to " + to;
	}

} // FlowImpl
