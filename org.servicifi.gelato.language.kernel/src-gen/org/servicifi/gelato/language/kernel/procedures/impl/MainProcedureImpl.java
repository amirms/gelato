/**
 */
package org.servicifi.gelato.language.kernel.procedures.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.commons.CommonsFactory;
import org.servicifi.gelato.analysis.framework.commons.End;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;

import org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.ProceduresPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Main
 * Procedure</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl#getMembers
 * <em>Members</em>}</li>
 * <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl#getStart
 * <em>Start</em>}</li>
 * <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.MainProcedureImpl#getEnd
 * <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainProcedureImpl extends LabellableElementImpl implements MainProcedure {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MainProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProceduresPackage.Literals.MAIN_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this,
					ProceduresPackage.MAIN_PROCEDURE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Start getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProceduresPackage.MAIN_PROCEDURE__START, oldStart, newStart);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStart(Start newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProceduresPackage.MAIN_PROCEDURE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProceduresPackage.MAIN_PROCEDURE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProceduresPackage.MAIN_PROCEDURE__START, newStart,
					newStart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProceduresPackage.MAIN_PROCEDURE__END, oldEnd, newEnd);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject) end).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProceduresPackage.MAIN_PROCEDURE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject) newEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProceduresPackage.MAIN_PROCEDURE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProceduresPackage.MAIN_PROCEDURE__END, newEnd,
					newEnd));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProceduresPackage.MAIN_PROCEDURE__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
		case ProceduresPackage.MAIN_PROCEDURE__START:
			return basicSetStart(null, msgs);
		case ProceduresPackage.MAIN_PROCEDURE__END:
			return basicSetEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProceduresPackage.MAIN_PROCEDURE__MEMBERS:
			return getMembers();
		case ProceduresPackage.MAIN_PROCEDURE__START:
			return getStart();
		case ProceduresPackage.MAIN_PROCEDURE__END:
			return getEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProceduresPackage.MAIN_PROCEDURE__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Member>) newValue);
			return;
		case ProceduresPackage.MAIN_PROCEDURE__START:
			setStart((Start) newValue);
			return;
		case ProceduresPackage.MAIN_PROCEDURE__END:
			setEnd((End) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProceduresPackage.MAIN_PROCEDURE__MEMBERS:
			getMembers().clear();
			return;
		case ProceduresPackage.MAIN_PROCEDURE__START:
			setStart((Start) null);
			return;
		case ProceduresPackage.MAIN_PROCEDURE__END:
			setEnd((End) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProceduresPackage.MAIN_PROCEDURE__MEMBERS:
			return members != null && !members.isEmpty();
		case ProceduresPackage.MAIN_PROCEDURE__START:
			return start != null;
		case ProceduresPackage.MAIN_PROCEDURE__END:
			return end != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LabellableElement first() {
		if (getStart() == null)
			this.setStart(CommonsFactory.eINSTANCE.createStart());
		return getStart();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		if (getEnd() == null)
			this.setEnd(CommonsFactory.eINSTANCE.createEnd());
		res.add(getEnd());
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();

		if (getStart() == null)
			this.setStart(CommonsFactory.eINSTANCE.createStart());

		if (getEnd() == null)
			this.setEnd(CommonsFactory.eINSTANCE.createEnd());
		
		// set labels for start and end
		getStart().setLabel(0 - getLabel());
		getEnd().setLabel(Long.MAX_VALUE - getLabel());

		// If no statements, i.e. {}
		if (getMembers().isEmpty()) {
			res.add(GraphsFactory.eINSTANCE.createRegularFlow(getStart(), getEnd()));
			return res;
		}

		LabellableElement firstMember = (LabellableElement) getMembers().get(0);
		res.add(GraphsFactory.eINSTANCE.createRegularFlow(getStart(), firstMember.first()));

		EList<LabellableElement> prev = new BasicEList<>();
		prev.addAll(firstMember.last());
		res.addAll(firstMember.internalFlow());
		for (int i = 1; i < getMembers().size(); i++) {
			LabellableElement elem = (LabellableElement) getMembers().get(i);

			for (LabellableElement e : prev)
				res.add(GraphsFactory.eINSTANCE.createRegularFlow(e, elem.first()));
			System.out.println(elem);
			res.addAll(elem.internalFlow());
			prev = elem.last();
		}

		for (LabellableElement element : prev)
			res.add(GraphsFactory.eINSTANCE.createRegularFlow(element, getEnd()));

		return res;
	}

} // MainProcedureImpl
