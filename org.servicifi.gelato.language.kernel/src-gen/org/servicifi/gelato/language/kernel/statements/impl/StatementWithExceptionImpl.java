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
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementContainer;
import org.servicifi.gelato.language.kernel.statements.StatementWithException;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Statement With Exception</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl#getStatement
 * <em>Statement</em>}</li>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.StatementWithExceptionImpl#getExceptionStatements
 * <em>Exception Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementWithExceptionImpl extends StatementImpl implements StatementWithException {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The cached value of the '{@link #getExceptionStatements() <em>Exception
	 * Statements</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExceptionStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandlerStatement> exceptionStatements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatementWithExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.STATEMENT_WITH_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT, oldStatement, newStatement);
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
	public void setStatement(Statement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject) statement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject) newStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT,
					newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExceptionHandlerStatement> getExceptionStatements() {
		if (exceptionStatements == null) {
			exceptionStatements = new EObjectContainmentEList<ExceptionHandlerStatement>(
					ExceptionHandlerStatement.class, this,
					StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS);
		}
		return exceptionStatements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
			return basicSetStatement(null, msgs);
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
			return ((InternalEList<?>) getExceptionStatements()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
			return getStatement();
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
			return getExceptionStatements();
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
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
			setStatement((Statement) newValue);
			return;
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
			getExceptionStatements().clear();
			getExceptionStatements().addAll((Collection<? extends ExceptionHandlerStatement>) newValue);
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
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
			setStatement((Statement) null);
			return;
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
			getExceptionStatements().clear();
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
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
			return statement != null;
		case StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS:
			return exceptionStatements != null && !exceptionStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StatementContainer.class) {
			switch (derivedFeatureID) {
			case StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT:
				return StatementsPackage.STATEMENT_CONTAINER__STATEMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StatementContainer.class) {
			switch (baseFeatureID) {
			case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
				return StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LabellableElement first() {
		return getStatement().first();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<LabellableElement>();
		res.addAll(getStatement().last());

		for (int i = 0; i < this.getExceptionStatements().size(); i++)
			res.addAll(this.getExceptionStatements().get(i).getStatement().last());

		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();

		res.addAll(getStatement().internalFlow());

		EList<LabellableElement> prev = new BasicEList<>();
		prev.addAll(getStatement().last());

		// for each exception statement -> create a flow from last of statement
		for (int i = 0; i < getExceptionStatements().size(); i++) {
			ExceptionHandlerStatement exceptionStatement = getExceptionStatements().get(i);

			for (LabellableElement e : prev)
				res.add(GraphsFactory.eINSTANCE.createRegularFlow(e, exceptionStatement.getStatement().first()));

			res.addAll(exceptionStatement.getStatement().internalFlow());
		}

		return res;
	}

} // StatementWithExceptionImpl
