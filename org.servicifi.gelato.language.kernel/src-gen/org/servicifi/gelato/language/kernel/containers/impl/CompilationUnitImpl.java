/**
 */
package org.servicifi.gelato.language.kernel.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.commons.CommonsFactory;
import org.servicifi.gelato.analysis.framework.commons.End;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.ContainersFactory;
import org.servicifi.gelato.language.kernel.containers.ContainersPackage;

import org.servicifi.gelato.language.kernel.members.Member;

import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl#getMainProcedure <em>Main Procedure</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.containers.impl.CompilationUnitImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends KernelRootImpl implements CompilationUnit {
	/**
	 * The cached value of the '{@link #getMainProcedure() <em>Main Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainProcedure()
	 * @generated
	 * @ordered
	 */
	protected MainProcedure mainProcedure;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> declarations;

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
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainProcedure getMainProcedure() {
		return mainProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainProcedure(MainProcedure newMainProcedure, NotificationChain msgs) {
		MainProcedure oldMainProcedure = mainProcedure;
		mainProcedure = newMainProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE, oldMainProcedure, newMainProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainProcedure(MainProcedure newMainProcedure) {
		if (newMainProcedure != mainProcedure) {
			NotificationChain msgs = null;
			if (mainProcedure != null)
				msgs = ((InternalEObject)mainProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE, null, msgs);
			if (newMainProcedure != null)
				msgs = ((InternalEObject)newMainProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE, null, msgs);
			msgs = basicSetMainProcedure(newMainProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE, newMainProcedure, newMainProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<Member>(Member.class, this, ContainersPackage.COMPILATION_UNIT__DECLARATIONS);
		}
		return declarations;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__START, oldStart, newStart);
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
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__START, newStart, newStart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE:
				return basicSetMainProcedure(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case ContainersPackage.COMPILATION_UNIT__START:
				return basicSetStart(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__END:
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
			case ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE:
				return getMainProcedure();
			case ContainersPackage.COMPILATION_UNIT__DECLARATIONS:
				return getDeclarations();
			case ContainersPackage.COMPILATION_UNIT__START:
				return getStart();
			case ContainersPackage.COMPILATION_UNIT__END:
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
			case ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE:
				setMainProcedure((MainProcedure)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Member>)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__START:
				setStart((Start)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__END:
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
			case ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE:
				setMainProcedure((MainProcedure)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__DECLARATIONS:
				getDeclarations().clear();
				return;
			case ContainersPackage.COMPILATION_UNIT__START:
				setStart((Start)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__END:
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
			case ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE:
				return mainProcedure != null;
			case ContainersPackage.COMPILATION_UNIT__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case ContainersPackage.COMPILATION_UNIT__START:
				return start != null;
			case ContainersPackage.COMPILATION_UNIT__END:
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
		return getStart();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		res.add(getEnd());
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	// Add start and end to program start
	public EList<Flow> internalFlow() {
		EList<Flow> result = new BasicEList<>();
		LabellableElement mainproc = getMainProcedure();

		if (getStart() == null)
			this.setStart(CommonsFactory.eINSTANCE.createStart());

		if (getEnd() == null)
			this.setEnd(CommonsFactory.eINSTANCE.createEnd());

		// set labels for start and end
		getStart().setLabel(0);
		getEnd().setLabel(Long.MAX_VALUE);

		// Main Procedure
		result.add(GraphsFactory.eINSTANCE.createRegularFlow(getStart(), mainproc.first()));
		result.addAll(mainproc.internalFlow());
		EList<LabellableElement> endmainproc = new BasicEList<LabellableElement>();
		endmainproc.addAll(mainproc.last());
		for (LabellableElement e : endmainproc)
			result.add(GraphsFactory.eINSTANCE.createRegularFlow(e, getEnd()));

		// Declared Procedures
		for (Member member : getDeclarations())
			if (member instanceof Procedure)
				result.addAll(((Procedure) member).internalFlow());

		// get all procedure calls in the entire program
		TreeIterator<EObject> allContents = eAllContents();

		while (allContents.hasNext()) {
			EObject obj = allContents.next();
			if (obj instanceof ProcedureCall) {
				ProcedureCall procedureCall = (ProcedureCall) obj;
				Procedure callee = (Procedure) procedureCall.getTarget();
				result.add(GraphsFactory.eINSTANCE.createProcedureFlow(procedureCall.first(), callee.first()));
				for (LabellableElement e : callee.last()) {
					// FIXME is this a procedure flow, or just a regular flow
					result.add(GraphsFactory.eINSTANCE.createRegularFlow(e, procedureCall.first())); 
				}
			}
		}

		return result;
	}

} //CompilationUnitImpl
