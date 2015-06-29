/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.jcl.commons.NamedElement;
import org.servicifi.gelato.language.jcl.containers.JCLRoot;
import org.servicifi.gelato.language.jcl.containers.JobUnit;
import org.servicifi.gelato.language.jcl.parameters.Parameter;
import org.servicifi.gelato.language.jcl.statements.Condition;
import org.servicifi.gelato.language.jcl.statements.Execute;
import org.servicifi.gelato.language.jcl.statements.Statement;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractJclInterpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<org.servicifi.gelato.language.jcl.resource.jcl.IJclInterpreterListener> listeners = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclInterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.servicifi.gelato.language.jcl.commons.NamedElement) {
			result = interprete_org_servicifi_gelato_language_jcl_commons_NamedElement((org.servicifi.gelato.language.jcl.commons.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.containers.JCLRoot) {
			result = interprete_org_servicifi_gelato_language_jcl_containers_JCLRoot((org.servicifi.gelato.language.jcl.containers.JCLRoot) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.containers.JobUnit) {
			result = interprete_org_servicifi_gelato_language_jcl_containers_JobUnit((org.servicifi.gelato.language.jcl.containers.JobUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.statements.Condition) {
			result = interprete_org_servicifi_gelato_language_jcl_statements_Condition((org.servicifi.gelato.language.jcl.statements.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.statements.Execute) {
			result = interprete_org_servicifi_gelato_language_jcl_statements_Execute((org.servicifi.gelato.language.jcl.statements.Execute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.statements.Statement) {
			result = interprete_org_servicifi_gelato_language_jcl_statements_Statement((org.servicifi.gelato.language.jcl.statements.Statement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.jcl.parameters.Parameter) {
			result = interprete_org_servicifi_gelato_language_jcl_parameters_Parameter((org.servicifi.gelato.language.jcl.parameters.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_commons_NamedElement(NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_containers_JCLRoot(JCLRoot jCLRoot, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_containers_JobUnit(JobUnit jobUnit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_statements_Condition(Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_statements_Statement(Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_statements_Execute(Execute execute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_jcl_parameters_Parameter(Parameter parameter, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (org.servicifi.gelato.language.jcl.resource.jcl.IJclInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.servicifi.gelato.language.jcl.resource.jcl.IJclInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.servicifi.gelato.language.jcl.resource.jcl.IJclInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
