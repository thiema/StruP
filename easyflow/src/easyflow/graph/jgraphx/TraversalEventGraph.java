/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.graph.DefaultGraph;
import easyflow.metadata.GroupingInstance;
import easyflow.traversal.TraversalEvent;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traversal Event Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.TraversalEventGraph#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getTraversalEventGraph()
 * @model
 * @generated
 */
public interface TraversalEventGraph extends DefaultGraph {
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getTraversalEventGraph_Graph()
	 * @model
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.TraversalEventGraph#getGraph <em>Graph</em>}' reference.
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
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, GroupingInstance groupingInstance) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell" groupingInstancesMany="true"
	 * @generated
	 */
	void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, EList<GroupingInstance> groupingInstances) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	mxICell applyTraversalEventCopyGraph(mxICell root, TraversalEvent traversalEvent, GroupingInstance groupingInstance) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell" groupingInstancesMany="true"
	 * @generated
	 */
	mxICell applyTraversalEventCopyGraph(mxICell root, TraversalEvent traversalEvent, EList<GroupingInstance> groupingInstances) throws CellNotFoundException, TaskNotFoundException;

} // TraversalEventGraph
