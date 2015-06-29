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
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.commons.NamedElement;
import org.servicifi.gelato.language.kernel.commons.impl.LabellableElementImpl;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.FlowsFactory;
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
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.procedures.impl.ProcedureImpl#getCallers <em>Callers</em>}</li>
 * </ul>
 * </p>
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProceduresPackage.PROCEDURE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case ProceduresPackage.PROCEDURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LabellableElement first() {
		
		if (getMembers().size() == 0)
			return this;
		
		//first member - must be a procedure or a statement
		return ((LabellableElement)getMembers().get(0)).first();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<LabellableElement> last() {
		if (getMembers().size() == 0)
			return this.last();
		
		
		return ((LabellableElement)getMembers().get(getMembers().size() - 1)).last();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();
		//If no statements, i.e. {}
		if (getMembers().isEmpty())
			return res;
		
		LabellableElement firstMember = (LabellableElement) getMembers().get(0);
		EList<LabellableElement> prev = new BasicEList<>();
		prev.addAll(firstMember.last());
		res.addAll(firstMember.internalFlow());
		for (int i = 1; i < getMembers().size(); i++) {
			LabellableElement elem = (LabellableElement) getMembers().get(i);

			for (LabellableElement e : prev)
				res.add(FlowsFactory.eINSTANCE.createRegularFlow(e, elem.first()));
			System.out.println(elem);
			res.addAll(elem.internalFlow());
			prev = elem.last();
		}
		
		return res;
	}

} //ProcedureImpl
