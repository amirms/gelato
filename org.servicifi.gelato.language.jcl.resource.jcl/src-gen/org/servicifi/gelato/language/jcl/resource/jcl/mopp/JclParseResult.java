/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class JclParseResult implements org.servicifi.gelato.language.jcl.resource.jcl.IJclParseResult {
	
	private EObject root;
	
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap;
	
	private Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>> commands = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>>();
	
	public JclParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
