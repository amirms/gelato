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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.commons.CommonsFactory;
import org.servicifi.gelato.analysis.framework.commons.End;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;

import org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.commons.NamedElement;

import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.parameters.Parameter;

import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.procedures.ProceduresPackage;

import org.servicifi.gelato.language.kernel.references.ReferenceableElement;

import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getCallers <em>Callers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends LabellableElementImpl implements Procedure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getCallers() <em>Callers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureCall> callers;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProceduresPackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProceduresPackage.PROCEDURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, ProceduresPackage.PROCEDURE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ProceduresPackage.PROCEDURE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureCall> getCallers() {
		if (callers == null) {
			callers = new EObjectResolvingEList<ProcedureCall>(ProcedureCall.class, this, ProceduresPackage.PROCEDURE__CALLERS);
		}
		return callers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProceduresPackage.PROCEDURE__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Start newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProceduresPackage.PROCEDURE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProceduresPackage.PROCEDURE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProceduresPackage.PROCEDURE__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProceduresPackage.PROCEDURE__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProceduresPackage.PROCEDURE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProceduresPackage.PROCEDURE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProceduresPackage.PROCEDURE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ProceduresPackage.PROCEDURE__START:
				return basicSetStart(null, msgs);
			case ProceduresPackage.PROCEDURE__END:
				return basicSetEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__NAME:
				return getName();
			case ProceduresPackage.PROCEDURE__MEMBERS:
				return getMembers();
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				return getParameters();
			case ProceduresPackage.PROCEDURE__CALLERS:
				return getCallers();
			case ProceduresPackage.PROCEDURE__START:
				return getStart();
			case ProceduresPackage.PROCEDURE__END:
				return getEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__NAME:
				setName((String)newValue);
				return;
			case ProceduresPackage.PROCEDURE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ProceduresPackage.PROCEDURE__CALLERS:
				getCallers().clear();
				getCallers().addAll((Collection<? extends ProcedureCall>)newValue);
				return;
			case ProceduresPackage.PROCEDURE__START:
				setStart((Start)newValue);
				return;
			case ProceduresPackage.PROCEDURE__END:
				setEnd((End)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProceduresPackage.PROCEDURE__MEMBERS:
				getMembers().clear();
				return;
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				getParameters().clear();
				return;
			case ProceduresPackage.PROCEDURE__CALLERS:
				getCallers().clear();
				return;
			case ProceduresPackage.PROCEDURE__START:
				setStart((Start)null);
				return;
			case ProceduresPackage.PROCEDURE__END:
				setEnd((End)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProceduresPackage.PROCEDURE__MEMBERS:
				return members != null && !members.isEmpty();
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ProceduresPackage.PROCEDURE__CALLERS:
				return callers != null && !callers.isEmpty();
			case ProceduresPackage.PROCEDURE__START:
				return start != null;
			case ProceduresPackage.PROCEDURE__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ProceduresPackage.PROCEDURE__NAME: return CommonsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAMED_ELEMENT__NAME: return ProceduresPackage.PROCEDURE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LabellableElement first() {
		if(getStart() == null)
			this.setStart(CommonsFactory.eINSTANCE.createStart());
		
		return getStart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		if(getEnd() == null)
			this.setEnd(CommonsFactory.eINSTANCE.createEnd());
		res.add(getEnd());
		return res;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
//	public LabellableElement first() {
//		
//		if (getMembers().size() == 0)
//			return this;
//		
//		//first member - must be a procedure or a statement
//		return ((LabellableElement)getMembers().get(0)).first();
//		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
//	public EList<LabellableElement> last() {
//		if (getMembers().size() == 0){
//			//return this.last();
//			EList<LabellableElement> res =new BasicEList<LabellableElement>();
//			res.add(this);
//			return res;
//		}
//		
//		return ((LabellableElement)getMembers().get(getMembers().size() - 1)).last();
//
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();
		
		if(getStart() == null)
			this.setStart(CommonsFactory.eINSTANCE.createStart());
		
		if(getEnd() == null)
			this.setEnd(CommonsFactory.eINSTANCE.createEnd());
		
		//set labels for start and end
		getStart().setLabel(0 - getLabel());
		getEnd().setLabel(Long.MAX_VALUE - getLabel());
		
		//If no statements, i.e. {}
		if (getMembers().isEmpty()){
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

} //ProcedureImpl
