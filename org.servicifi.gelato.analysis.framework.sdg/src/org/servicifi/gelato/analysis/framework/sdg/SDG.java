package org.servicifi.gelato.analysis.framework.sdg;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DirectedAcyclicGraph;

public class SDG extends DefaultDirectedGraph<Node, Edge> {	
	
	private static final long serialVersionUID = 1L;

	public SDG() {
		super(Edge.class);
	}

	public Node actualOut(final Node v) {
		final Set<Edge> edges = outgoingEdgesOf(v);
		Node successor = null;
		for (final Edge e : edges) {
			successor = e.getTarget();
			if (NodeType.ACTUAL_OUT.equals(successor.getType())) {
				return successor;
			}
		}
		return null;
	}
	
	public Set<Edge> outgoingEdgesOf(Node v) {
		Set<Edge> es = edgeSet().stream().filter(e -> e.getSource() == v).collect(Collectors.toSet());
		return es;
	}

	public Node getNodeWithLabel(final String label) {
		final Optional<Node> v = vertexSet().stream().filter(u -> u.getLabel().equals(label)).findFirst();
		if (v.isPresent())
			return v.get();
		return null;
	}

	public Node getEntry() {
		return vertexSet().stream().filter(n -> NodeType.ENTRY.equals(n.getType())).findFirst().get();
	}

	public Set<Node> backwardSlice(final Set<Node> S) {
//		return PDGSlicer.backward(this, S);
		return new HashSet<>();
	}

	public Set<Node> forwardSlice(final Set<Node> S) {
//		return PDGSlicer.forward(this, S);
		return new HashSet<>();

	}

}
