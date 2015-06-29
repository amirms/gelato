/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class CobolParseResult implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolParseResult {
	
	private EObject root;
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolLocationMap locationMap;
	
	private Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolCommand<org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource>> commands = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolCommand<org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource>>();
	
	public CobolParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(org.servicifi.gelato.language.cobol.resource.cobol.ICobolLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolCommand<org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
