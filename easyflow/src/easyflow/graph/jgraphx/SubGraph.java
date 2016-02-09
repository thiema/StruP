/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;

import easyflow.core.ErrorControl;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;

import easyflow.traversal.TraversalEvent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.SubGraph#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.SubGraph#getErrorControl <em>Error Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getSubGraph()
 * @model
 * @generated
 */
public interface SubGraph extends EObject {
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getSubGraph_Graph()
	 * @model
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.SubGraph#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Error Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Control</em>' reference.
	 * @see #setErrorControl(ErrorControl)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getSubGraph_ErrorControl()
	 * @model
	 * @generated
	 */
	ErrorControl getErrorControl();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.SubGraph#getErrorControl <em>Error Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Control</em>' reference.
	 * @see #getErrorControl()
	 * @generated
	 */
	void setErrorControl(ErrorControl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	mxICell computeSubgraph(TraversalEvent traversalEvent, boolean isComplete) throws CellNotFoundException, TaskNotFoundException;

} // SubGraph
