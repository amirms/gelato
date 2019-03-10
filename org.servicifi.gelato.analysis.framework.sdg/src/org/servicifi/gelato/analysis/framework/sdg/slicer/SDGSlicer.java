package org.servicifi.gelato.analysis.framework.sdg.slicer;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.Edge;
import org.servicifi.gelato.analysis.framework.sdg.EdgeType;

public class SDGSlicer {
	public static Set<Node> backward(final SDG sdg, final Set<Node> S) {
	    Set<EdgeType> k1 = new HashSet<>();
	    k1.add(EdgeType.PARAM_OUT);
	    Set<EdgeType> k2 = new HashSet<>();
	    Collections.addAll(k2, EdgeType.PARAM_IN, EdgeType.CALL);
	    final Set<Node> S2 = backwardSlice(sdg, S, k1);
	    final Set<Node> result = backwardSlice(sdg, S2, k2);
	    result.addAll(S2);
	    return result;
	  }

	  private static Set<Node> backwardSlice(final SDG sdg, final Set<Node> S,
	      final Set<EdgeType> kinds) {
	    final Set<Node> result = new HashSet<>();
	    final Set<Node> worklist = new HashSet<>(S);
	    while (!worklist.isEmpty()) {
	      final Node v = next(worklist);
	      result.add(v);
	      final Set<Node> w = incoming(sdg, result, v, kinds);
	      worklist.addAll(w);
	    }
	    return result;
	  }

	  private static Set<Node> incoming(final SDG sdg, final Collection<Node> marked,
	      final Node v, final Set<EdgeType> kinds) {
	    final Set<Node> result = new HashSet<>();
	    final Set<Edge> edges = sdg.incomingEdgesOf(v);
	    for (final Edge e : edges) {
	      if (!kinds.contains(e.getType()) && !marked.contains(e.getSource()))
	        result.add(e.getSource());
	    }
	    return result;
	  }

	  public static Set<Node> forward(final SDG sdg, final Set<Node> S) {
	    Set<EdgeType> k1 = new HashSet<>();
	    Collections.addAll(k1, EdgeType.PARAM_IN, EdgeType.CALL);
	    Set<EdgeType> k2 = new HashSet<>();
	    k2.add(EdgeType.PARAM_OUT);
	    final Set<Node> S2 = forwardSlice(sdg, S, k1);
	    final Set<Node> result = forwardSlice(sdg, S2, k2);
	    result.addAll(S2);
	    return result;
	  }

	  private static Set<Node> forwardSlice(final SDG sdg, final Set<Node> S,
	      final Set<EdgeType> kinds) {
	    final Set<Node> result = new HashSet<>();
	    final Set<Node> worklist = new HashSet<>(S);
	    while (!worklist.isEmpty()) {
	      final Node v = next(worklist);
	      result.add(v);
	      final Set<Node> w = outgoing(sdg, result, v, kinds);
	      worklist.addAll(w);
	    }
	    return result;
	  }

	  private static Set<Node> outgoing(final SDG sdg, final Collection<Node> marked,
	      final Node v, final Set<EdgeType> kinds) {
	    final Set<Node> result = new HashSet<>();
	    final Set<Edge> edges = sdg.outgoingEdgesOf(v);
	    for (final Edge e : edges) {
	      if (!kinds.contains(e.getType()) && !marked.contains(e.getTarget()))
	        result.add(e.getTarget());
	    }
	    return result;
	  }

	  private static Node next(final Set<Node> S) {
	    final Iterator<Node> it = S.iterator();
	    final Node result = it.next();
	    it.remove();
	    return result;
	  }
}
