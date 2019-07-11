package org.servicifi.gelato.analysis.framework.sdg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

import org.servicifi.gelato.analysis.framework.commons.LabellableElement;

/**
 * .idea For path generation, use a better technique: 1) use nodes which have
 * use or definition as a starting point, OR 2) remove paths that have no
 * use/def in them.
 * 
 * 3) Must remove duplicate paths.
 */

public class RandomPathGenerator {
	public static Set<List<Node>> generateRandomly(SDG sdg, double samplePercent) {

		Set<List<Node>> paths = new HashSet<>();

		// take a sample of nodes
		List<Node> nodes = new ArrayList(sdg.vertexSet());

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

			// XXX also check if path at some point contains a single use or def variable

			paths.add(path);
		}

		return paths;
	}

	public static Set<List<Node>> generateForUseDefNodes(SDG sdg, double count) {

		Map<Node, Set<List<Node>>> paths = new HashMap<>();

		// take a sample of nodes
		List<Node> nodes = new ArrayList();
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

		Set<List<Node>> result = new HashSet<>();

		for (Node n : paths.keySet()) {
			Set<List<Node>> ps = paths.get(n);

			for (List<Node> p : ps) {
				result.add(p);
			}
		}

		return result;
	}

	private static List<Node> generate(Node currentNode) {

		Set<Node> visitedNodes = new HashSet<>();
		Deque<String> clsStack = new ArrayDeque<>();
		List<Node> path = new ArrayList<>();

		path.add(currentNode);
		visitedNodes.add(currentNode);

		Random rand = new Random();

		List<Node> currentOuts = new ArrayList(currentNode.getOuts());

		// while(currentOuts.length > 0)
		// get a node: is it in the same call and
		while (currentOuts.size() > 0) {
			String containerName = currentNode.getContainerName();

			int index = rand.nextInt(currentOuts.size());
			Node nextNode = currentOuts.get(index);

			if (visitedNodes.contains(nextNode)) {
				currentOuts.remove(nextNode);
				continue;
			}

			// how to tell if going to a procedure call, or returning
			if (!nextNode.getContainerName().equals(containerName)) {
				if (nextNode.getType() == NodeType.ACTUAL_OUT) {
					if (clsStack.isEmpty()) {
						currentOuts.remove(nextNode);
						continue;
					} else {
						clsStack.pop();
					}
				} else if (nextNode.getType() == NodeType.ENTRY || nextNode.getType() == NodeType.FORMAL_IN) {
					clsStack.push(nextNode.getContainerName());
				} else {
					throw new Error("Container changed moving from " + currentNode + " to " + nextNode);
				}
			}

			visitedNodes.add(nextNode);
			path.add(nextNode);

			currentNode = nextNode;
			currentOuts = new ArrayList(currentNode.getOuts());
		}

		return path;
	}
}
