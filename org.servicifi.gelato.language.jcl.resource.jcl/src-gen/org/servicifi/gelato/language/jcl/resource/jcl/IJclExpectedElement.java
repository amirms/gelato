/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IJclExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement follower, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>> getFollowers();
	
}
