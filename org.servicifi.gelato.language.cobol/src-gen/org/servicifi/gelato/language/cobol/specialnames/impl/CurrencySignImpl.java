/**
 */
package org.servicifi.gelato.language.cobol.specialnames.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.literals.Literal;

import org.servicifi.gelato.language.cobol.specialnames.CurrencySign;
import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Sign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl#getPictureSymbol <em>Picture Symbol</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.CurrencySignImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencySignImpl extends SpecialNameImpl implements CurrencySign {
	/**
	 * The default value of the '{@link #getPictureSymbol() <em>Picture Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPictureSymbol() <em>Picture Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureSymbol()
	 * @generated
	 * @ordered
	 */
	protected String pictureSymbol = PICTURE_SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Literal currency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencySignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecialnamesPackage.Literals.CURRENCY_SIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPictureSymbol() {
		return pictureSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPictureSymbol(String newPictureSymbol) {
		String oldPictureSymbol = pictureSymbol;
		pictureSymbol = newPictureSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL, oldPictureSymbol, pictureSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(Literal newCurrency, NotificationChain msgs) {
		Literal oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.CURRENCY_SIGN__CURRENCY, oldCurrency, newCurrency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Literal newCurrency) {
		if (newCurrency != currency) {
			NotificationChain msgs = null;
			if (currency != null)
				msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecialnamesPackage.CURRENCY_SIGN__CURRENCY, null, msgs);
			if (newCurrency != null)
				msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecialnamesPackage.CURRENCY_SIGN__CURRENCY, null, msgs);
			msgs = basicSetCurrency(newCurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecialnamesPackage.CURRENCY_SIGN__CURRENCY, newCurrency, newCurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecialnamesPackage.CURRENCY_SIGN__CURRENCY:
				return basicSetCurrency(null, msgs);
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
			case SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL:
				return getPictureSymbol();
			case SpecialnamesPackage.CURRENCY_SIGN__CURRENCY:
				return getCurrency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL:
				setPictureSymbol((String)newValue);
				return;
			case SpecialnamesPackage.CURRENCY_SIGN__CURRENCY:
				setCurrency((Literal)newValue);
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
			case SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL:
				setPictureSymbol(PICTURE_SYMBOL_EDEFAULT);
				return;
			case SpecialnamesPackage.CURRENCY_SIGN__CURRENCY:
				setCurrency((Literal)null);
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
			case SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL:
				return PICTURE_SYMBOL_EDEFAULT == null ? pictureSymbol != null : !PICTURE_SYMBOL_EDEFAULT.equals(pictureSymbol);
			case SpecialnamesPackage.CURRENCY_SIGN__CURRENCY:
				return currency != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (pictureSymbol: ");
		result.append(pictureSymbol);
		result.append(')');
		return result.toString();
	}

} //CurrencySignImpl
