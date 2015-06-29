/**
 */
package org.servicifi.gelato.language.kernel.dataitems.impl;

import org.eclipse.emf.ecore.EClass;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.kernel.references.impl.ReferenceableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataItemImpl extends ReferenceableElementImpl implements DataItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataitemsPackage.Literals.DATA_ITEM;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof DataItem) {
			DataItem other = (DataItem) obj;
			return (getName().equals(other.getName()));
		}
		return false;
	}
	
//	@Override 
//	public int hashCode() {
//		return 3 * getName().hashCode();
//	}

} //DataItemImpl
