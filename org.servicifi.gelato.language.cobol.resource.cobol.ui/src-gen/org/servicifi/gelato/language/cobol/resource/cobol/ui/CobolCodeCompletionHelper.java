/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A CodeCompletionHelper can be used to derive completion proposals for partial
 * documents. It runs the parser generated by EMFText in a special mode (i.e., the
 * rememberExpectedElements mode). Based on the elements that are expected by the
 * parser for different regions in the document, valid proposals are computed.
 */
public class CobolCodeCompletionHelper {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAttributeValueProvider attributeValueProvider = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAttributeValueProvider();
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolMetaInformation metaInformation = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation();
	
	/**
	 * <p>
	 * Computes a set of proposals for the given document assuming the cursor is at
	 * 'cursorOffset'. The proposals are derived using the meta information, i.e., the
	 * generated language plug-in.
	 * </p>
	 * 
	 * @param originalResource the resource to compute completions for
	 * @param content the documents content
	 * @param cursorOffset the current offset of the cursor
	 * 
	 * @return an array of completion proposals
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal[] computeCompletionProposals(org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource originalResource, String content, int cursorOffset) {
		ResourceSet resourceSet = new ResourceSetImpl();
		// the shadow resource needs the same URI because reference resolvers may use the
		// URI to resolve external references
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource = (org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource) resourceSet.createResource(originalResource.getURI());
		ByteArrayInputStream inputStream = new ByteArrayInputStream(content.getBytes());
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolMetaInformation metaInformation = resource.getMetaInformation();
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextParser parser = metaInformation.createParser(inputStream, null);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[] expectedElements = parseToExpectedElements(parser, resource, cursorOffset);
		if (expectedElements == null) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal[0];
		}
		if (expectedElements.length == 0) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal[0];
		}
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedAfterCursor = Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset));
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedBeforeCursor = Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset - 1));
		setPrefixes(expectedAfterCursor, content, cursorOffset);
		setPrefixes(expectedBeforeCursor, content, cursorOffset);
		
		// First, we derive all possible proposals from the set of elements that are
		// expected at the cursor position.
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> allProposals = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> rightProposals = deriveProposals(expectedAfterCursor, content, resource, cursorOffset);
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> leftProposals = deriveProposals(expectedBeforeCursor, content, resource, cursorOffset - 1);
		removeKeywordsEndingBeforeIndex(leftProposals, cursorOffset);
		
		// Second, the set of left proposals (i.e., the ones before the cursor) is checked
		// for emptiness. If the set is empty, the right proposals (i.e., the ones after
		// the cursor) are also considered. If the set is not empty, the right proposal
		// are discarded, because it does not make sense to propose them until the element
		// before the cursor was completed.
		allProposals.addAll(leftProposals);
		// Count the proposals before the cursor that match the prefix
		int leftMatchingProposals = 0;
		for (org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal leftProposal : leftProposals) {
			if (leftProposal.isMatchesPrefix()) {
				leftMatchingProposals++;
			}
		}
		if (leftMatchingProposals == 0) {
			allProposals.addAll(rightProposals);
		}
		
		// Third, the proposals are sorted according to their relevance. Proposals that
		// matched the prefix are preferred over ones that did not. Finally, proposals are
		// sorted alphabetically.
		final List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> sortedProposals = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>(allProposals);
		Collections.sort(sortedProposals);
		EObject root = null;
		if (!resource.getContents().isEmpty()) {
			root = resource.getContents().get(0);
		}
		for (org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal proposal : sortedProposals) {
			proposal.setRoot(root);
		}
		
		return sortedProposals.toArray(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal[sortedProposals.size()]);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[] parseToExpectedElements(org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextParser parser, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource, int cursorOffset) {
		final List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements = parser.parseToExpectedElements(null, resource, cursorOffset);
		if (expectedElements == null) {
			return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[0];
		}
		removeDuplicateEntries(expectedElements);
		removeInvalidEntriesAtEnd(expectedElements);
		return expectedElements.toArray(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[expectedElements.size()]);
	}
	
	/**
	 * Removes all expected elements that refer to the same terminal and that start at
	 * the same position.
	 */
	protected void removeDuplicateEntries(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements) {
		int size = expectedElements.size();
		// We split the list of expected elements into buckets where each bucket contains
		// the elements that start at the same position.
		Map<Integer, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal>> map = new LinkedHashMap<Integer, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal>>();
		for (int i = 0; i < size; i++) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal elementAtIndex = expectedElements.get(i);
			int start1 = elementAtIndex.getStartExcludingHiddenTokens();
			List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> list = map.get(start1);
			if (list == null) {
				list = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal>();
				map.put(start1, list);
			}
			list.add(elementAtIndex);
		}
		
		// Then, we remove all duplicate elements from each bucket individually.
		for (int position : map.keySet()) {
			List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> list = map.get(position);
			removeDuplicateEntriesFromBucket(list);
		}
		
		// After removing all duplicates, we merge the buckets.
		expectedElements.clear();
		for (int position : map.keySet()) {
			List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> list = map.get(position);
			expectedElements.addAll(list);
		}
	}
	
	/**
	 * Removes all expected elements that refer to the same terminal. Attention: This
	 * method assumes that the given list of expected terminals contains only elements
	 * that start at the same position.
	 */
	protected void removeDuplicateEntriesFromBucket(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements) {
		int size = expectedElements.size();
		for (int i = 0; i < size - 1; i++) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal elementAtIndex = expectedElements.get(i);
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement terminal = elementAtIndex.getTerminal();
			for (int j = i + 1; j < size;) {
				org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal elementAtNext = expectedElements.get(j);
				EClass metaClass = elementAtIndex.getContainmentTrace().getStartClass();
				EClass nextMetaClass = elementAtNext.getContainmentTrace().getStartClass();
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement nextTerminal = elementAtNext.getTerminal();
				// Terminals that have a different root meta class in the containment trace must
				// be kept because they can the decision whether an expected terminals is valid or
				// not depends on the root of the containment trace.
				boolean differentMetaclass = metaClass != nextMetaClass;
				if (terminal.equals(nextTerminal) && !differentMetaclass) {
					expectedElements.remove(j);
					size--;
				} else {
					j++;
				}
			}
		}
	}
	
	protected void removeInvalidEntriesAtEnd(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements) {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroupList followSetGroupList = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroupList(expectedElements);
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup> followSetGroups = followSetGroupList.getFollowSetGroups();
		int lastStartExcludingHiddenTokens = -1;
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolFollowSetGroup followSetGroup : followSetGroups) {
			boolean sameStartExcludingHiddenTokens = followSetGroup.hasSameStartExcludingHiddenTokens(lastStartExcludingHiddenTokens);
			lastStartExcludingHiddenTokens = followSetGroup.getStartExcludingHiddenTokens();
			EObject container = followSetGroup.getContainer();
			EClass currentRule = null;
			if (container != null) {
				currentRule = container.eClass();
			}
			List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedTerminals = followSetGroup.getExpectedTerminals();
			for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal : expectedTerminals) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement terminalAtIndex = expectedTerminal.getTerminal();
				EClass ruleMetaclass = terminalAtIndex.getRuleMetaclass();
				boolean differentRule = currentRule != ruleMetaclass;
				// If the two expected elements have a different parent in the syntax definition,
				// we must not discard the second element, because it probably stems from a parent
				// rule.
				org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainmentTrace containmentTrace = expectedTerminal.getContainmentTrace();
				boolean fitsAtCurrentPosition = fitsAtCurrentPosition(container, containmentTrace);
				boolean inContainmentTrace = pathToRootContains(container, expectedTerminal.getTerminal().getRuleMetaclass());
				boolean keepElement = true;
				if (differentRule && !inContainmentTrace) {
					if (!fitsAtCurrentPosition) {
						keepElement = false;
					}
				}
				if (sameStartExcludingHiddenTokens) {
					keepElement = false;
				}
				
				if (keepElement) {
				} else {
					// We must not call expectedElements.remove(expectedTerminal) because the
					// hashCode() method of ExpectedTerminal does not consider the start positions and
					// remove the wrong elements.
					for (int i = 0; i < expectedElements.size(); i++) {
						org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal next = expectedElements.get(i);
						if (next == expectedTerminal) {
							expectedElements.remove(i);
							break;
						}
					}
				}
			}
		}
	}
	
	private boolean fitsAtCurrentPosition(EObject container, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainmentTrace containmentTrace) {
		if (container == null) {
			// If no container is available, there is no model yet because we're before the
			// first token. In this case we assume that everything fits here.
			return true;
		}
		return containmentTrace.getStartClass() == container.eClass();
	}
	
	private boolean pathToRootContains(EObject leafObject, EClass metaclass) {
		EObject current = leafObject;
		while (current != null) {
			if (current.eClass() == metaclass) {
				return true;
			}
			current = current.eContainer();
		}
		return false;
	}
	
	/**
	 * Removes all proposals for keywords that end before the given index.
	 */
	protected void removeKeywordsEndingBeforeIndex(Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> proposals, int index) {
		List<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> toRemove = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		for (org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal proposal : proposals) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal = proposal.getExpectedTerminal();
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement terminal = expectedTerminal.getTerminal();
			if (terminal instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString) {
				org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString csString = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString) terminal;
				int startExcludingHiddenTokens = expectedTerminal.getStartExcludingHiddenTokens();
				if (startExcludingHiddenTokens + csString.getValue().length() - 1 < index) {
					toRemove.add(proposal);
				}
			}
		}
		proposals.removeAll(toRemove);
	}
	
	protected String findPrefix(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedAtCursor, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return "";
		}
		
		int end = 0;
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedElement : expectedElements) {
			if (expectedElement == expectedAtCursor) {
				final int start = expectedElement.getStartExcludingHiddenTokens();
				if (start >= 0  && start < Integer.MAX_VALUE) {
					end = start;
				}
				break;
			}
		}
		end = Math.min(end, cursorOffset);
		final String prefix = content.substring(end, Math.min(content.length(), cursorOffset));
		return prefix;
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> deriveProposals(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements, String content, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource, int cursorOffset) {
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> resultSet = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedElement : expectedElements) {
			resultSet.addAll(deriveProposals(expectedElement, content, resource, cursorOffset));
		}
		return resultSet;
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> deriveProposals(final org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, String content, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource, int cursorOffset) {
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement expectedElement = (org.servicifi.gelato.language.cobol.resource.cobol.ICobolExpectedElement) expectedTerminal.getTerminal();
		if (expectedElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString csString = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString) expectedElement;
			return handleKeyword(expectedTerminal, csString, expectedTerminal.getPrefix(), expectedTerminal.getContainer());
		} else if (expectedElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedBooleanTerminal) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedBooleanTerminal expectedBooleanTerminal = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedBooleanTerminal) expectedElement;
			return handleBooleanTerminal(expectedTerminal, expectedBooleanTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedEnumerationTerminal) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedEnumerationTerminal expectedEnumerationTerminal = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedEnumerationTerminal) expectedElement;
			return handleEnumerationTerminal(expectedTerminal, expectedEnumerationTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedStructuralFeature) {
			final org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedStructuralFeature expectedFeature = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedStructuralFeature) expectedElement;
			final EStructuralFeature feature = expectedFeature.getFeature();
			final EClassifier featureType = feature.getEType();
			final EObject container = findCorrectContainer(expectedTerminal);
			
			// Here it gets really crazy. We need to modify the model in a way that reflects
			// the state the model would be in, if the expected terminal were present. After
			// computing the corresponding completion proposals, the original state of the
			// model is restored. This procedure is required, because different models can be
			// required for different completion situations. This can be particularly observed
			// when the user has not yet typed a character that starts an element to be
			// completed.
			final Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> proposals = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
			expectedTerminal.materialize(new Runnable() {
				
				public void run() {
					if (feature instanceof EReference) {
						EReference reference = (EReference) feature;
						if (featureType instanceof EClass) {
							if (reference.isContainment()) {
								// the FOLLOW set should contain only non-containment references
								assert false;
							} else {
								proposals.addAll(handleNCReference(expectedTerminal, container, reference, expectedTerminal.getPrefix(), expectedFeature.getTokenName()));
							}
						}
					} else if (feature instanceof EAttribute) {
						EAttribute attribute = (EAttribute) feature;
						if (featureType instanceof EEnum) {
							EEnum enumType = (EEnum) featureType;
							proposals.addAll(handleEnumAttribute(expectedTerminal, expectedFeature, enumType, expectedTerminal.getPrefix(), container));
						} else {
							// handle EAttributes (derive default value depending on the type of the
							// attribute, figure out token resolver, and call deResolve())
							proposals.addAll(handleAttribute(expectedTerminal, expectedFeature, container, attribute, expectedTerminal.getPrefix()));
						}
					} else {
						// there should be no other subclass of EStructuralFeature
						assert false;
					}
				}
			});
			// Return the proposals that were computed in the closure call.
			return proposals;
		} else {
			// there should be no other class implementing IExpectedElement
			assert false;
		}
		return Collections.emptyList();
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleEnumAttribute(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedStructuralFeature expectedFeature, EEnum enumType, String prefix, EObject container) {
		Collection<EEnumLiteral> enumLiterals = enumType.getELiterals();
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> result = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		for (EEnumLiteral literal : enumLiterals) {
			String unResolvedLiteral = literal.getLiteral();
			// use token resolver to get de-resolved value of the literal
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(expectedFeature.getTokenName());
			String resolvedLiteral = tokenResolver.deResolve(unResolvedLiteral, expectedFeature.getFeature(), container);
			boolean matchesPrefix = matches(resolvedLiteral, prefix);
			result.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal(expectedTerminal, resolvedLiteral, prefix, matchesPrefix, expectedFeature.getFeature(), container));
		}
		return result;
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleNCReference(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, EObject container, EReference reference, String prefix, String tokenName) {
		// proposals for non-containment references are derived by calling the reference
		// resolver switch in fuzzy mode.
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolverSwitch resolverSwitch = metaInformation.getReferenceResolverSwitch();
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<EObject> result = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolReferenceResolveResult<EObject>(true);
		resolverSwitch.resolveFuzzy(prefix, container, reference, 0, result);
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<EObject>> mappings = result.getMappings();
		if (mappings != null) {
			Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> resultSet = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
			for (org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<EObject> mapping : mappings) {
				Image image = null;
				if (mapping instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolElementMapping<?>) {
					org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolElementMapping<?> elementMapping = (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolElementMapping<?>) mapping;
					Object target = elementMapping.getTargetElement();
					// de-resolve reference to obtain correct identifier
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
					final String identifier = tokenResolver.deResolve(elementMapping.getIdentifier(), reference, container);
					if (target instanceof EObject) {
						image = getImage((EObject) target);
					}
					boolean matchesPrefix = matches(identifier, prefix);
					org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal proposal = new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal(expectedTerminal, identifier, prefix, matchesPrefix, reference, container, image);
					proposal.setReferenceTarget(target);
					resultSet.add(proposal);
				}
			}
			return resultSet;
		}
		return Collections.emptyList();
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleAttribute(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedStructuralFeature expectedFeature, EObject container, EAttribute attribute, String prefix) {
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> resultSet = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>();
		Object[] defaultValues = attributeValueProvider.getDefaultValues(attribute);
		if (defaultValues != null) {
			for (Object defaultValue : defaultValues) {
				if (defaultValue != null) {
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
					String tokenName = expectedFeature.getTokenName();
					if (tokenName != null) {
						org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
						if (tokenResolver != null) {
							String defaultValueAsString = tokenResolver.deResolve(defaultValue, attribute, container);
							boolean matchesPrefix = matches(defaultValueAsString, prefix);
							resultSet.add(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal(expectedTerminal, defaultValueAsString, prefix, matchesPrefix, expectedFeature.getFeature(), container));
						}
					}
				}
			}
		}
		return resultSet;
	}
	
	/**
	 * Creates a set of completion proposals from the given keyword.
	 */
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleKeyword(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedCsString csString, String prefix, EObject container) {
		String proposal = csString.getValue();
		boolean matchesPrefix = matches(proposal, prefix);
		return Collections.singleton(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal(expectedTerminal, proposal, prefix, matchesPrefix, null, container));
	}
	
	/**
	 * Creates a set of (two) completion proposals from the given boolean terminal.
	 */
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleBooleanTerminal(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedBooleanTerminal expectedBooleanTerminal, String prefix) {
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> result = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>(2);
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolBooleanTerminal booleanTerminal = expectedBooleanTerminal.getBooleanTerminal();
		result.addAll(handleLiteral(expectedTerminal, booleanTerminal.getAttribute(), prefix, booleanTerminal.getTrueLiteral()));
		result.addAll(handleLiteral(expectedTerminal, booleanTerminal.getAttribute(), prefix, booleanTerminal.getFalseLiteral()));
		return result;
	}
	
	/**
	 * Creates a set of completion proposals from the given enumeration terminal. For
	 * each enumeration literal one proposal is created.
	 */
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleEnumerationTerminal(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedEnumerationTerminal expectedEnumerationTerminal, String prefix) {
		Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> result = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal>(2);
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolEnumerationTerminal enumerationTerminal = expectedEnumerationTerminal.getEnumerationTerminal();
		Map<String, String> literalMapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : literalMapping.keySet()) {
			result.addAll(handleLiteral(expectedTerminal, enumerationTerminal.getAttribute(), prefix, literalMapping.get(literalName)));
		}
		return result;
	}
	
	protected Collection<org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal> handleLiteral(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal, EAttribute attribute, String prefix, String literal) {
		if ("".equals(literal)) {
			return Collections.emptySet();
		}
		boolean matchesPrefix = matches(literal, prefix);
		return Collections.singleton(new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolCompletionProposal(expectedTerminal, literal, prefix, matchesPrefix, null, null));
	}
	
	/**
	 * Calculates the prefix for each given expected element. The prefix depends on
	 * the current document content, the cursor position, and the position where the
	 * element is expected.
	 */
	protected void setPrefixes(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedElements, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return;
		}
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedElement : expectedElements) {
			String prefix = findPrefix(expectedElements, expectedElement, content, cursorOffset);
			expectedElement.setPrefix(prefix);
		}
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[] getElementsExpectedAt(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[] allExpectedElements, int cursorOffset) {
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal> expectedAtCursor = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal>();
		for (int i = 0; i < allExpectedElements.length; i++) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedElement = allExpectedElements[i];
			int startIncludingHidden = expectedElement.getStartIncludingHiddenTokens();
			int end = getEnd(allExpectedElements, i);
			if (cursorOffset >= startIncludingHidden && cursorOffset <= end) {
				expectedAtCursor.add(expectedElement);
			}
		}
		return expectedAtCursor.toArray(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[expectedAtCursor.size()]);
	}
	
	/**
	 * Calculates the end index of the expected element at allExpectedElements[index].
	 * To determine the end, the subsequent expected elements from the array of all
	 * expected elements are used. An element is considered to end one character
	 * before the next elements starts.
	 */
	protected int getEnd(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal[] allExpectedElements, int indexInList) {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal elementAtIndex = allExpectedElements[indexInList];
		int startIncludingHidden = elementAtIndex.getStartIncludingHiddenTokens();
		int startExcludingHidden = elementAtIndex.getStartExcludingHiddenTokens();
		for (int i = indexInList + 1; i < allExpectedElements.length; i++) {
			org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal elementAtI = allExpectedElements[i];
			int startIncludingHiddenForI = elementAtI.getStartIncludingHiddenTokens();
			int startExcludingHiddenForI = elementAtI.getStartExcludingHiddenTokens();
			if (startIncludingHidden != startIncludingHiddenForI || startExcludingHidden != startExcludingHiddenForI) {
				return startIncludingHiddenForI - 1;
			}
		}
		return Integer.MAX_VALUE;
	}
	
	/**
	 * Checks whether the given proposed string matches the prefix. The two strings
	 * are compared ignoring the case. The prefix is also considered to match if is a
	 * camel case representation of the proposal.
	 */
	protected boolean matches(String proposal, String prefix) {
		if (proposal == null || prefix == null) {
			return false;
		}
		return (proposal.toLowerCase().startsWith(prefix.toLowerCase()) || org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.matchCamelCase(prefix, proposal) != null) && !proposal.equals(prefix);
	}
	
	protected Image getImage(EObject element) {
		if (!Platform.isRunning()) {
			return null;
		}
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		return labelProvider.getImage(element);
	}
	
	protected EObject findCorrectContainer(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolExpectedTerminal expectedTerminal) {
		EObject container = expectedTerminal.getContainer();
		EClass ruleMetaclass = expectedTerminal.getTerminal().getRuleMetaclass();
		if (ruleMetaclass.isInstance(container)) {
			// container is correct for expected terminal
			return container;
		}
		// the container is wrong
		EObject parent = null;
		EObject previousParent = null;
		EObject correctContainer = null;
		EObject hookableParent = null;
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainmentTrace containmentTrace = expectedTerminal.getContainmentTrace();
		EClass startClass = containmentTrace.getStartClass();
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature currentLink = null;
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature previousLink = null;
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature[] containedFeatures = containmentTrace.getPath();
		for (int i = 0; i < containedFeatures.length; i++) {
			currentLink = containedFeatures[i];
			if (i > 0) {
				previousLink = containedFeatures[i - 1];
			}
			EClass containerClass = currentLink.getContainerClass();
			hookableParent = findHookParent(container, startClass, currentLink, parent);
			if (hookableParent != null) {
				// we found the correct parent
				break;
			} else {
				previousParent = parent;
				parent = containerClass.getEPackage().getEFactoryInstance().create(containerClass);
				if (parent != null) {
					if (previousParent == null) {
						// replace container for expectedTerminal with correctContainer
						correctContainer = parent;
					} else {
						// This assignment is only performed to get rid of a warning about a potential
						// null pointer access. Variable 'previousLink' cannot be null here, because it is
						// initialized for all loop iterations where 'i' is greather than 0 and for the
						// case where 'i' equals zero, this path is never executed, because
						// 'previousParent' is null in this case.
						org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature link = previousLink;
						org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.setFeature(parent, link.getFeature(), previousParent, false);
					}
				}
			}
		}
		
		if (correctContainer == null) {
			correctContainer = container;
		}
		
		if (currentLink == null) {
			return correctContainer;
		}
		
		hookableParent = findHookParent(container, startClass, currentLink, parent);
		
		final EObject finalHookableParent = hookableParent;
		final EStructuralFeature finalFeature = currentLink.getFeature();
		final EObject finalParent = parent;
		if (parent != null && hookableParent != null) {
			expectedTerminal.setAttachmentCode(new Runnable() {
				
				public void run() {
					org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.setFeature(finalHookableParent, finalFeature, finalParent, false);
				}
			});
		}
		return correctContainer;
	}
	
	/**
	 * Walks up the containment hierarchy to find an EObject that is able to hold
	 * (contain) the given object.
	 */
	protected EObject findHookParent(EObject container, EClass startClass, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContainedFeature currentLink, EObject object) {
		EClass containerClass = currentLink.getContainerClass();
		while (container != null) {
			if (containerClass.isInstance(object)) {
				if (startClass.equals(container.eClass())) {
					return container;
				}
			}
			container = container.eContainer();
		}
		return null;
	}
	
}
