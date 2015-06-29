/**
 */
package org.servicifi.gelato.language.kernel.references.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.servicifi.gelato.language.kernel.commons.impl.NamedElementImpl;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ReferenceableElementImpl extends NamedElementImpl implements ReferenceableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.REFERENCEABLE_ELEMENT;
	}

} //ReferenceableElementImpl
