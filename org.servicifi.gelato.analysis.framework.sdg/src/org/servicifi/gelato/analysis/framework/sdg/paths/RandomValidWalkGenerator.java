package org.servicifi.gelato.analysis.framework.sdg.paths;

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
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.NodeType;
import org.servicifi.gelato.analysis.framework.sdg.SDG;

public class RandomValidWalkGenerator extends RandomGenerator {
	@Override
	protected List<Node> generate(Node currentNode) {
		Deque<String> clsStack = new ArrayDeque<>();
		List<Node> walk = new ArrayList<>();

		walk.add(currentNode);

		Random rand = new Random();

		List<Node> currentOuts = new ArrayList<>(currentNode.getOuts());

		// while(currentOuts.length > 0)
		// get a node: is it in the same call and
		while (currentOuts.size() > 0) {
			String containerName = currentNode.getContainerName();

			int index = rand.nextInt(currentOuts.size());
			Node nextNode = currentOuts.get(index);

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

			walk.add(nextNode);

			currentNode = nextNode;
			currentOuts = new ArrayList<>(currentNode.getOuts());
		}

		return walk;
	}
}
