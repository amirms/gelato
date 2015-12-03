/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used when computing code completion proposals hold groups of
 * expected elements which belong to the same follow set.
 */
public class CobolFollowSetGroupList {
	
	private int lastFollowSetID = -1;
	private List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup> followSetGroups = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup>();
	
	public CobolFollowSetGroupList(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedTerminals) {
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal : expectedTerminals) {
			addExpectedTerminal(expectedTerminal);
		}
	}
	
	private void addExpectedTerminal(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal) {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup group;
		
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
	
	public List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup> getFollowSetGroups() {
		return followSetGroups;
	}
	
	private org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup addNewGroup() {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup group = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup();
		followSetGroups.add(group);
		return group;
	}
	
}
