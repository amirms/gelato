/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is used when computing code completion proposals to group a set of
 * expected elements which belong to the same follow set.
 */
public class CobolFollowSetGroup {
	
	private List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedTerminals = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal>();
	
	public void add(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal) {
		expectedTerminals.add(expectedTerminal);
	}
	
	public List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> getExpectedTerminals() {
		return expectedTerminals;
	}
	
	public int getStartExcludingHiddenTokens() {
		int lastStart = -1;
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal : expectedTerminals) {
			int nextStart = expectedTerminal.getStartExcludingHiddenTokens();
			if (lastStart < 0) {
				lastStart = nextStart;
			} else if (lastStart != nextStart) {
				System.err.println("Found terminals in same follow set with different start.");
			}
		}
		
		return lastStart;
	}
	
	public EClass getRule() {
		EClass lastRule = null;
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal : expectedTerminals) {
			EClass nextRule = expectedTerminal.getTerminal().getRuleMetaclass();
			if (lastRule == null) {
				lastRule = nextRule;
			} else if (lastRule != nextRule) {
				System.err.println("Found terminals in same follow set with different rule.");
			}
		}
		
		return lastRule;
	}
	
	public boolean hasSameStartExcludingHiddenTokens(int lastStartExcludingHiddenTokens) {
		if (lastStartExcludingHiddenTokens < 0) {
			return false;
		}
		
		return lastStartExcludingHiddenTokens == getStartExcludingHiddenTokens();
	}
	
	public boolean hasDifferentRule(EClass lastRule) {
		if (lastRule == null) {
			return true;
		}
		
		return lastRule != getRule();
	}
	
	public EObject getContainer() {
		EObject lastContainer = null;
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal : expectedTerminals) {
			EObject nextContainer = expectedTerminal.getContainer();
			if (lastContainer == null) {
				lastContainer = nextContainer;
			} else if (lastContainer != nextContainer) {
				System.err.println("Found terminals in same follow set with different container.");
			}
		}
		
		return lastContainer;
	}
	
	@Override
	public String toString() {
		return "CobolFollowSetGroup" + expectedTerminals;
	}
	
}
