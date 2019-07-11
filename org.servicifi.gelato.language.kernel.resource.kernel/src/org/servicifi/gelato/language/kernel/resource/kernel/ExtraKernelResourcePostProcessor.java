package org.servicifi.gelato.language.kernel.resource.kernel;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Defines;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.expressions.Uses;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;

public class ExtraKernelResourcePostProcessor implements IKernelResourcePostProcessor {

	@Override
	public void process(KernelResource resource) {
		processExpressions(resource);
		processExpressionStatements(resource);
	}

	private void processExpressionStatements(KernelResource resource) {
		TreeIterator<EObject> iterator = resource.getAllContents();

		Set<ExpressionStatement> exprStatements = new HashSet<>();

		while (iterator.hasNext()) {
			EObject object = iterator.next();

			if (!(object instanceof ExpressionStatement)) {
				continue;
			}

			exprStatements.add((ExpressionStatement) object);
		}
		
//		removeEmptyExpressionStatements(exprStatements);
		
	}

	private void removeEmptyExpressionStatements(Set<ExpressionStatement> exprStatements) {
		for(ExpressionStatement exprStatement : exprStatements) {
			if (exprStatement.getExpression().getChildren().size() <= 0) {
				EcoreUtil.remove(exprStatement);
			}
		}
	}

	private void processExpressions(KernelResource resource) {
		TreeIterator<EObject> iterator = resource.getAllContents();

		Set<Expression> expressions = new HashSet<>();

		while (iterator.hasNext()) {
			EObject object = iterator.next();

			if (!(object instanceof Expression)) {
				continue;
			}

			expressions.add((Expression) object);
		}

		eliminateDuplicateSubExpressions(expressions);
		breakupCompositeSubExpressions(expressions);
	}

	private void breakupCompositeSubExpressions(Set<Expression> expressions) {
		for (Expression expr : expressions) {
			
			EList<SubExpression> children = expr.getChildren();			
			Set<ReferenceableElement> definitionReferences = new HashSet<>();
			for (SubExpression subExpr : children) {
				if (subExpr instanceof Defines) {
					definitionReferences.add(((Defines) subExpr).getTarget());
				}
			}
			
			EList<SubExpression> subExpressions;
			// if definition before a usage, add before it
			// [uses(a); defines(b); defines(a)] => a,b:=a
			// [uses(b); defines(a); uses(a)] => a.b 
			
		}
	}

	private void eliminateDuplicateSubExpressions(Set<Expression> expressions) {
		for (Expression expr : expressions) {
			// find unique ones

			EList<SubExpression> children = expr.getChildren();

			Set<ReferenceableElement> usageReferences = new HashSet<>();
			for (SubExpression subExpr : children) {
				if (subExpr instanceof Uses) {
					usageReferences.add(((Uses) subExpr).getTarget());
				}
			}

			for (int i = children.size() - 1; i >= 0; i--) {
				SubExpression subExpr = children.get(i);

				if (subExpr instanceof Uses) {
					ReferenceableElement target = ((Uses) subExpr).getTarget();

					if (usageReferences.contains(target)) {
						usageReferences.remove(target);
					} else {
						children.remove(subExpr);
					}
				}
			}

			children = expr.getChildren();

			Set<ReferenceableElement> definitionReferences = new HashSet<>();
			for (SubExpression subExpr : children) {
				if (subExpr instanceof Defines) {
					definitionReferences.add(((Defines) subExpr).getTarget());
				}
			}

			for (int i = children.size() - 1; i >= 0; i--) {
				SubExpression subExpr = children.get(i);

				if (subExpr instanceof Defines) {
					ReferenceableElement target = ((Defines) subExpr).getTarget();

					if (definitionReferences.contains(target)) {
						definitionReferences.remove(target);
					} else {
						children.remove(subExpr);
					}
				}
			}
		}
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

}
