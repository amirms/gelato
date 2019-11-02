/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import java.util.LinkedHashMap;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.IEditorInput;

/**
 * The EditingDomainProvider is used by the editor to obtain an EMF editing
 * domain. This default implementation creates a new editing domain for each
 * editor input.
 */
public class KernelEditingDomainProvider {
	
	public EditingDomain getEditingDomain(IEditorInput editorInput) {
		return createEditingDomain();
	}
	
	private EditingDomain createEditingDomain() {
		AdapterFactory adapterFactory = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelAdapterFactoryProvider().getAdapterFactory();
		
		BasicCommandStack commandStack = new BasicCommandStack();
		
		// Register resource factories (esp. for additional extensions).
		new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation().registerResourceFactory();
		
		return new AdapterFactoryEditingDomain(adapterFactory, commandStack, new LinkedHashMap<Resource, Boolean>());
	}
	
}