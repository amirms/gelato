package org.servicifi.gelato.analysis.framework.sdg.paths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.SDG;

public abstract class RandomGenerator {
	public Set<List<Node>> generateRandomly(SDG sdg, double samplePercent) {

		Set<List<Node>> paths = new HashSet<>();

		// take a sample of nodes
		List<Node> nodes = new ArrayList<>(sdg.vertexSet());

		int numberOfSamples = (int) Math.ceil(nodes.size() * samplePercent);

		Collections.shuffle(nodes);

		// find nodes that

		for (int i = 0; i < numberOfSamples; i++) {
			Node currentNode = nodes.get(i);
			List<Node> path = generate(currentNode);

			// do not add single node path
			if (path.size() < 2) {
				continue;
			}

			// also check if path at some point contains a single use or def variable
			if (path.stream().allMatch(v -> v.getUsages().size() == 0 && v.getDef() == null)) {
				continue;
			}
			
			paths.add(path);
		}

		return paths;
	}

	public Set<List<Node>> generateForUseDefNodes(SDG sdg, double count) {

		Map<Node, Set<List<Node>>> paths = new HashMap<>();

		// take a sample of nodes
		List<Node> nodes = new ArrayList<>();
		for (Node v : sdg.vertexSet()) {
			if (v.getUsages().size() > 0 || v.getDef() != null) {
				nodes.add(v);
			}
		}

		// find nodes thatco

		for (Node currentNode : nodes) {
			Set<List<Node>> nodePaths = new HashSet<>();
			for (int i = 0; i < count; i++) {
				List<Node> path = generate(currentNode);

				if (path.size() < 2) {
					continue;
				}

				nodePaths.add(path);
			}

			paths.put(currentNode, nodePaths);
		}

		// Only get the unique ones
		Set<List<Node>> result = new HashSet<>();
		for (Set<List<Node>> ps : paths.values()) {
			for (List<Node> p : ps) {
				result.add(p);
			}
		}

		return result;
	}
	
	protected abstract List<Node> generate(Node currentNode);
}