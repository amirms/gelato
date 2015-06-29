/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

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
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.FlowsFactory;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementWithException;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement With Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl#getExceptionStatements <em>Exception Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementWithExceptionImpl extends StatementContainerImpl implements StatementWithException {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final long LABEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected long label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExceptionStatements() <em>Exception Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandlerStatement> exceptionStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementWithExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.STATEMENT_WITH_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(long newLabel) {
		long oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandlerStatement> getExceptionStatements() {
		if (exceptionStatements == null) {
			exceptionStatements = new EObjectContainmentEList<ExceptionHandlerStatement>(ExceptionHandlerStatement.class, this, StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS);
		}
		return exceptionStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LabellableElement first() {
		return getStatement().first();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();
		
		res.addAll(getStatement().internalFlow());
		
		EList<LabellableElement> prev = new BasicEList<>();
		prev.addAll(getStatement().last());
		
		//for each exception statement -> create a flow from last of statement 
		for (int i = 0; i < getExceptionStatements().size(); i++) {
			ExceptionHandlerStatement exceptionStatement  = getExceptionStatements().get(i);
			
			for (LabellableElement e : prev) 
				res.add(FlowsFactory.eINSTANCE.createRegularFlow(e, exceptionStatement.first()));
				
			res.addAll(exceptionStatement.internalFlow());

		}
		
		return res;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
				return ((InternalEList<?>)getExceptionStatements()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL:
				return getLabel();
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
				return getExceptionStatements();
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
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL:
				setLabel((Long)newValue);
				return;
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
				getExceptionStatements().clear();
				getExceptionStatements().addAll((Collection<? extends ExceptionHandlerStatement>)newValue);
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
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
				getExceptionStatements().clear();
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
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL:
				return label != LABEL_EDEFAULT;
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
				return exceptionStatements != null && !exceptionStatements.isEmpty();
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
		if (baseClass == LabellableElement.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL: return CommonsPackage.LABELLABLE_ELEMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
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
		if (baseClass == LabellableElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.LABELLABLE_ELEMENT__LABEL: return StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //StatementWithExceptionImpl
