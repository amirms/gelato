/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class JclAbstractExpectedElement implements org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>> followers = new LinkedHashSet<org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>>();
	
	public JclAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement follower, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] path) {
		followers.add(new org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>(follower, path));
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
