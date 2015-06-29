/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class CobolAbstractExpectedElement implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<org.servicifi.gelato.language.cobol.resource.cobol.util.CobolPair<org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[]>> followers = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.util.CobolPair<org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[]>>();
	
	public CobolAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement follower, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[] path) {
		followers.add(new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolPair<org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[]>(follower, path));
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.util.CobolPair<org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
