/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.debug;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <p>
 * A DebuggableInterpreter is a facade for interpreters that adds debug support.
 * </p>
 * 
 * @param <ResultType> the result type of the actual interpreter
 * @param <ContextType> the context type of the actual interpreter
 */
public class KernelDebuggableInterpreter<ResultType, ContextType> extends org.servicifi.gelato.language.kernel.resource.kernel.debug.AbstractKernelDebuggable {
	
	/**
	 * The actual interpreter. Interpretation is delegated to this object.
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.util.AbstractKernelInterpreter<ResultType, ContextType> interpreterDelegate;
	
	/**
	 * To check whether we must stop the execution after step over/into/return, we use
	 * a closure
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<EObject> stopCondition;
	
	/**
	 * The port of the socket that is used to send debug events to the Eclipse
	 * debugging framework
	 */
	private int eventPort;
	
	/**
	 * This map is used to remember the IDs of stack frame elements
	 */
	Map<Integer, EObject> stackFrameMap = new LinkedHashMap<Integer, EObject>();
	
	/**
	 * The ID of the last stack frame element
	 */
	int stackFrameID = 0;
	
	public KernelDebuggableInterpreter(org.servicifi.gelato.language.kernel.resource.kernel.util.AbstractKernelInterpreter<ResultType, ContextType> interpreterDelegate, int eventPort) {
		this.eventPort = eventPort;
		this.interpreterDelegate = interpreterDelegate;
		this.interpreterDelegate.addListener(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelInterpreterListener() {
			
			public void handleInterpreteObject(EObject element) {
				// check whether we have hit an element after a step over/into/return
				evaluateStep(element);
				// if we are stepping we do ignore breakpoints
				if (stopCondition != null) {
					return;
				}
				// check whether we have hit a line breakpoint
				int line = getLine(element);
				EObject parent = element.eContainer();
				if (parent != null) {
					int parentLine = getLine(parent);
					if (line == parentLine) {
						return;
					}
				}
				if (line >= 0) {
					evaluateLineBreakpoint(element.eResource().getURI(), line);
				}
			}
		});
	}
	
	private ResultType interprete(ContextType context) {
		startUpAndWait();
		// start interpretation when the debugger has sent the resume signal
		ResultType result = interpreterDelegate.interprete(context);
		terminate();
		return result;
	}
	
	public ResultType interprete(ContextType context, boolean debugMode) {
		setDebugMode(debugMode);
		startEventSocket(eventPort);
		
		ResultType result = interprete(context);
		return result;
	}
	
	public String[] getStack() {
		EObject next = interpreterDelegate.getNextObjectToInterprete();
		List<EObject> parents = new ArrayList<EObject>();
		EObject current = next;
		while (current != null) {
			parents.add(current);
			current = current.eContainer();
		}
		String[] stack = new String[parents.size()];
		int i = parents.size();
		for (EObject parent : parents) {
			String serializedStackElement = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.encode(',', new String[] {parent.eClass().getName(), Integer.toString(stackFrameID), parent.eResource().getURI().toString(), Integer.toString(getLine(parent)), Integer.toString(getCharStart(parent)), Integer.toString(getCharEnd(parent))});
			stack[--i] = serializedStackElement;
			stackFrameMap.put(stackFrameID++, parent);
		}
		return stack;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.util.AbstractKernelInterpreter<ResultType, ContextType> getInterpreterDelegate() {
		return interpreterDelegate;
	}
	
	private int getLine(EObject element) {
		int line = -1;
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			line = locationMap.getLine(element);
		}
		return line;
	}
	
	private int getCharStart(EObject element) {
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			return locationMap.getCharStart(element);
		}
		return -1;
	}
	
	private int getCharEnd(EObject element) {
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = getLocationMap(element);
		if (locationMap != null) {
			return locationMap.getCharEnd(element) + 1;
		}
		return -1;
	}
	
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap getLocationMap(EObject element) {
		Resource resource = element.eResource();
		if (resource instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) {
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource textResource = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource) resource;
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = textResource.getLocationMap();
			return locationMap;
		}
		return null;
	}
	
	private void evaluateStep(EObject element) {
		// create local copy to avoid race conditions
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<EObject> stopCheck = stopCondition;
		if (stopCheck != null && stopCheck.execute(element)) {
			stopCondition = null;
			// suspending after step...
			setSuspend(true);
			sendEvent(org.servicifi.gelato.language.kernel.resource.kernel.debug.EKernelDebugMessageTypes.SUSPENDED, true);
			return;
		}
		waitIfSuspended();
	}
	
	public void terminate() {
		interpreterDelegate.terminate();
		super.terminate();
	}
	
	public void stepOver() {
		final EObject current = interpreterDelegate.getNextObjectToInterprete();
		final int currentLevel = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getDepth(current);
		stopCondition = new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step over, we stop at the next object that is at the same level or higher
				int depth = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getDepth(element);
				boolean sameOrHigher = depth <= currentLevel;
				boolean differentElement = element != current;
				return sameOrHigher && differentElement;
			}
		};
		resume();
	}
	
	public void stepInto() {
		stopCondition = new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step into, we stop at the next object
				return true;
			}
		};
		resume();
	}
	
	public void stepReturn() {
		EObject current = interpreterDelegate.getNextObjectToInterprete();
		final int parentLevel = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getDepth(current) - 1;
		stopCondition = new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<EObject>() {
			public boolean execute(EObject element) {
				// For step return, we stop at the next object that is at least one level higher
				int depth = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getDepth(element);
				return depth <= parentLevel;
			}
		};
		resume();
	}
	
	public Map<String, Object> getFrameVariables(String stackFrame) {
		int stackFrameID = Integer.parseInt(stackFrame);
		Map<String, Object> frameVariables = new LinkedHashMap<String, Object>();
		frameVariables.put("this", stackFrameMap.get(stackFrameID));
		frameVariables.put("context", getInterpreterDelegate().getCurrentContext());
		return frameVariables;
	}
	
}
