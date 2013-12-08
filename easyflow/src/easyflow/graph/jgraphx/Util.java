/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;

import easyflow.core.Catalog;
import easyflow.core.DataLink;
import easyflow.core.DataPort;
import easyflow.core.Task;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingInstanceNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.TaskToCellMapKeyNotFoundException;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import easyflow.execution.IExecutionSystem;

import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;

import easyflow.traversal.TraversalEvent;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.Util#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getTasks <em>Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getCells <em>Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getDepricatedTasks <em>Depricated Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getMostProcessedTasks <em>Most Processed Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getDefaultRootCell <em>Default Root Cell</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getProcessedEdges <em>Processed Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getAddEdges <em>Add Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getCopiedCells <em>Copied Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getCurrentSubGraphs <em>Current Sub Graphs</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getNewTraversalEvents <em>New Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Util#getDataLinks <em>Data Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil()
 * @model
 * @generated
 */
public interface Util extends EObject {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' attribute.
	 * @see #setGraph(EasyFlowGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_Graph()
	 * @model dataType="easyflow.EasyFlowGraph"
	 * @generated
	 */
	EasyFlowGraph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Util#getGraph <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' attribute.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(EasyFlowGraph value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.Task},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_Tasks()
	 * @model mapType="easyflow.util.maps.StringToTaskMap<org.eclipse.emf.ecore.EString, easyflow.core.Task>"
	 * @generated
	 */
	EMap<String, Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link com.mxgraph.model.mxICell},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_Cells()
	 * @model mapType="easyflow.util.maps.StringToGraphCellMap<org.eclipse.emf.ecore.EString, easyflow.mxICell>"
	 * @generated
	 */
	EMap<String, mxICell> getCells();

	/**
	 * Returns the value of the '<em><b>Depricated Tasks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depricated Tasks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depricated Tasks</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_DepricatedTasks()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getDepricatedTasks();

	/**
	 * Returns the value of the '<em><b>Most Processed Tasks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Most Processed Tasks</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Most Processed Tasks</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_MostProcessedTasks()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getMostProcessedTasks();

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' reference.
	 * @see #setMetaData(DefaultMetaData)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_MetaData()
	 * @model
	 * @generated
	 */
	DefaultMetaData getMetaData();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Util#getMetaData <em>Meta Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(DefaultMetaData value);

	/**
	 * Returns the value of the '<em><b>Default Root Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Root Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Root Cell</em>' attribute.
	 * @see #setDefaultRootCell(mxICell)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_DefaultRootCell()
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	mxICell getDefaultRootCell();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Util#getDefaultRootCell <em>Default Root Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Root Cell</em>' attribute.
	 * @see #getDefaultRootCell()
	 * @generated
	 */
	void setDefaultRootCell(mxICell value);

	/**
	 * Returns the value of the '<em><b>Processed Edges Copy Graph</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed Edges Copy Graph</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Edges Copy Graph</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_ProcessedEdgesCopyGraph()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getProcessedEdgesCopyGraph();

	/**
	 * Returns the value of the '<em><b>Processed Edges</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed Edges</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Edges</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_ProcessedEdges()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getProcessedEdges();

	/**
	 * Returns the value of the '<em><b>Add Edges</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Edges</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Edges</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_AddEdges()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getAddEdges();

	/**
	 * Returns the value of the '<em><b>Copied Cells</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link com.mxgraph.model.mxICell},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copied Cells</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copied Cells</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_CopiedCells()
	 * @model mapType="easyflow.util.maps.StringToGraphCellMap<org.eclipse.emf.ecore.EString, easyflow.mxICell>"
	 * @generated
	 */
	EMap<String, mxICell> getCopiedCells();

	/**
	 * Returns the value of the '<em><b>Current Sub Graphs</b></em>' attribute list.
	 * The list contents are of type {@link com.mxgraph.model.mxICell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Sub Graphs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Sub Graphs</em>' attribute list.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_CurrentSubGraphs()
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	EList<mxICell> getCurrentSubGraphs();

	/**
	 * Returns the value of the '<em><b>Traversal Events</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Events</em>' reference list.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_TraversalEvents()
	 * @model
	 * @generated
	 */
	EList<TraversalEvent> getTraversalEvents();

	/**
	 * Returns the value of the '<em><b>New Traversal Events</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Traversal Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Traversal Events</em>' reference list.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_NewTraversalEvents()
	 * @model
	 * @generated
	 */
	EList<TraversalEvent> getNewTraversalEvents();

	/**
	 * Returns the value of the '<em><b>Data Links</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.DataLink},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Links</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Links</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_DataLinks()
	 * @model mapType="easyflow.util.maps.StringToDataLinkMap<org.eclipse.emf.ecore.EString, easyflow.core.DataLink>"
	 * @generated
	 */
	EMap<String, DataLink> getDataLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolveTraversalEvents(mxICell root) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	mxICell computeSubgraph(TraversalEvent traversalEvent, boolean isComplete) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, String instanceStr) throws CellNotFoundException, TaskNotFoundException;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	EList<TraversalEvent> getTraversalEvents(mxICell root, boolean isGrouping) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	EList<TraversalEvent> getNewTraversalEvents(TraversalEvent traversalEvent, mxICell root) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	TraversalEvent getNextTraversalEvent() throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" tasksMany="true"
	 * @generated
	 */
	EList<mxICell> getCells(EList<Task> tasks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean removeSubGraph(mxICell root, TraversalEvent traversalEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.GroupingInstanceNotFoundException"
	 * @generated
	 */
	EList<GroupingInstance> getGroupingInstances(TraversalEvent traversalEvent) throws GroupingInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetFlags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String traversalEventToString(TraversalEvent traversalEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void testSomething();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void layoutGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	void fixOffTargetCells(mxICell root, String groupingStr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.TaskToCellMapKeyNotFoundException"
	 * @generated
	 */
	boolean isChildOf(Task parent, Task child) throws TaskToCellMapKeyNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean generateWorklowForExecutionSystem(mxICell root, IExecutionSystem executionSystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolveToolDependencies(mxICell root, Catalog catalog);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException"
	 * @generated
	 */
	EList<DataPort> getParentDataPortsFor(Task task) throws CellNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException"
	 * @generated
	 */
	EList<DataPort> getChildDataPortsFor(Task task) throws CellNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.TaskNotFoundException" vertexDataType="easyflow.Object"
	 * @generated
	 */
	Task loadTask(Object vertex) throws TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException" edgeDataType="easyflow.Object"
	 * @generated
	 */
	DataLink loadDataLink(Object edge) throws DataLinkNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	EList<Task> getChildTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	EList<Task> getSiblingTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	EList<Task> getParentTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException;

} // Util
