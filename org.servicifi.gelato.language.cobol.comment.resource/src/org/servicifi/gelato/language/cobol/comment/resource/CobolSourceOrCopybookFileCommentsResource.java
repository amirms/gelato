package org.servicifi.gelato.language.cobol.comment.resource;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.cobol.comment.Comment;
import org.servicifi.gelato.language.cobol.comment.Unit;
import org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentResource;
import org.servicifi.gelato.language.cobol.CobolClasspath;

public class CobolSourceOrCopybookFileCommentsResource extends CommentResource{

	public CobolSourceOrCopybookFileCommentsResource(URI uri){
		
		super(uri);
		
		//extractComments();
	}

	private void extractComments() {
		if (!getContentsInternal().isEmpty()) {
			
			CobolClasspath cobolClasspath = CobolClasspath.get();
			
			EObject root = getContentsInternal().get(0);
			if(root instanceof Unit) {
				Unit unit = (Unit) root;

				Iterator<Comment> it = unit.getComments().iterator();
				
				while (it.hasNext()) {
					
					Comment comment = it.next();
					cobolClasspath.addComments(comment.getValue());
					
				}
				
				
			}
			
			
			
		}
	}

	
}
