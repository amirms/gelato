package org.servicifi.gelato.language.cobol.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.dataitems.ConditionName;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
* The CobolModelRepairer is used to repair parts of the model that was
* wrongly created. This involves parts of the language that are not
* context-free.
* @author Amir
*/
public class CobolModelRepairer {
	
	/**
	 * Repairs the syntax tree as produced for the condition expressions containing
	 * abbreviated conditions. This problem arises due to the context-sensitivity of the
	 * abbreviated conditions. Depending on the type of the variables in the condition 
	 * expression, the root of the tree may differ.  
	 *
	 * @param resource
	 */
	public static void repair(Resource resource) {
			//Logger.log("Repairing the model: " + resource.getURI());
		for(Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) {
			EObject next = i.next();
			if (next instanceof ConditionalOrExpression) {
				ConditionalOrExpression condExpression = (ConditionalOrExpression) next;
				repairWrongCombinedConditions(condExpression, resource);
			}
			
		}
	}

	/**
	 * Fixes the abbreviated part of condition expression 
	 * if the leaf of the abbreviated part is an identifier that maps to 
	 * a condition name
	 * 
	 * @author Amir
	 */
	private static void repairWrongCombinedConditions(
			ConditionalOrExpression condExpression, Resource resource) {
		// TODO Auto-generated method stub
		
		for(ConditionalOrExpressionChild orTerm : condExpression.getChildren())
			for(ConditionalAndExpressionChild andTerm : ((ConditionalAndExpression)orTerm).getChildren())
				//This is where I should look for subexpressions, which are not condition names.
				if (andTerm instanceof AbbreviatedConditionalExpression) 
					for (AbbreviatedConditionalExpressionChild abbTerm 
							: ((AbbreviatedConditionalExpression)andTerm).getChildren()){
						//EObject conditionname = getSingleConditionNameReference(abbTerm);
						
						//here need to reconstruct the abbreviated part as a non-abbreviated combined expression
						
						//NegatedAbbreviatedConditionalExpression negateAbbTerm =
						//		(NegatedAbbreviatedConditionalExpression)abbTerm;
						
						
					}
					
		
		
	}
	/*
	private static EObject getSingleConditionNameReference(EObject parent) {
		
		if (parent instanceof IdentifierReference) {
			IdentifierReference tempRef = (IdentifierReference) parent;
			
			if (tempRef.getTarget() instanceof ConditionName) 
				return tempRef;
			else 
				return null;
		}

		for(EObject contained : parent.eContents())
			return getSingleConditionNameReference(contained);
		
		return null;
	
	}
	*/
	
}