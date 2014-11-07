/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.util;

import easyflow.graph.jgraphx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see easyflow.graph.jgraphx.JgraphxPackage
 * @generated
 */
public class JgraphxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JgraphxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxSwitch() {
		if (modelPackage == null) {
			modelPackage = JgraphxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JgraphxPackage.ABSTRACT_GRAPH: {
				AbstractGraph abstractGraph = (AbstractGraph)theEObject;
				T result = caseAbstractGraph(abstractGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.TRAVERSAL_EVENT_GRAPH: {
				TraversalEventGraph traversalEventGraph = (TraversalEventGraph)theEObject;
				T result = caseTraversalEventGraph(traversalEventGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.PREPROCESSING_GRAPH: {
				PreprocessingGraph preprocessingGraph = (PreprocessingGraph)theEObject;
				T result = casePreprocessingGraph(preprocessingGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH: {
				ToolDependencyGraph toolDependencyGraph = (ToolDependencyGraph)theEObject;
				T result = caseToolDependencyGraph(toolDependencyGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.EXECUTION_GRAPH: {
				ExecutionGraph executionGraph = (ExecutionGraph)theEObject;
				T result = caseExecutionGraph(executionGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.SUB_GRAPH: {
				SubGraph subGraph = (SubGraph)theEObject;
				T result = caseSubGraph(subGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JgraphxPackage.GRAPH: {
				Graph graph = (Graph)theEObject;
				T result = caseGraph(graph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGraph(AbstractGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversal Event Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversal Event Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversalEventGraph(TraversalEventGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessing Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessing Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessingGraph(PreprocessingGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Dependency Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Dependency Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolDependencyGraph(ToolDependencyGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionGraph(ExecutionGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubGraph(SubGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JgraphxSwitch
