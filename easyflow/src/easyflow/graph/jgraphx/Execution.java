/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;
import easyflow.execution.IExecutionSystem;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.Execution#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getExecution_Graph()
	 * @model
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Execution#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean generateWorkflowForExecutionSystem(mxICell root, IExecutionSystem executionSystem);
} // Execution
