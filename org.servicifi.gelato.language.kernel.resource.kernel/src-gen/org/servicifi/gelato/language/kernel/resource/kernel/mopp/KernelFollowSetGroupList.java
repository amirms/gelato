/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used when computing code completion proposals hold groups of
 * expected elements which belong to the same follow set.
 */
public class KernelFollowSetGroupList {
	
	private int lastFollowSetID = -1;
	private List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup> followSetGroups = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup>();
	
	public KernelFollowSetGroupList(List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> expectedTerminals) {
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedTerminal : expectedTerminals) {
			addExpectedTerminal(expectedTerminal);
		}
	}
	
	private void addExpectedTerminal(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedTerminal) {
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup group;
		
		int followSetID = expectedTerminal.getFollowSetID();
		if (followSetID == lastFollowSetID) {
			if (followSetGroups.isEmpty()) {
				group = addNewGroup();
			} else {
				group = followSetGroups.get(followSetGroups.size() - 1);
			}
		} else {
			group = addNewGroup();
			lastFollowSetID = followSetID;
		}
		
		group.add(expectedTerminal);
	}
	
	public List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup> getFollowSetGroups() {
		return followSetGroups;
	}
	
	private org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup addNewGroup() {
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup group = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelFollowSetGroup();
		followSetGroups.add(group);
		return group;
	}
	
}
