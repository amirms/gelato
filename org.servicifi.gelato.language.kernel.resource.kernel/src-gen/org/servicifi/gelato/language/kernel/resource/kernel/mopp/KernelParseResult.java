/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class KernelParseResult implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelParseResult {
	
	private EObject root;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap;
	
	private Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>> commands = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>>();
	
	public KernelParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
