/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;

import easyflow.core.Catalog;
import easyflow.core.Task;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import easyflow.data.DataLink;

import easyflow.execution.IExecutionSystem;
import easyflow.metadata.DefaultMetaData;

import easyflow.metadata.GroupingInstance;
import easyflow.traversal.TraversalEvent;

import java.util.Map;
import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getMostProcessedTasks <em>Most Processed Tasks</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getDefaultRootCell <em>Default Root Cell</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getProcessedEdgesCopyGraph <em>Processed Edges Copy Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getDeprecatedEdges <em>Deprecated Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getAddEdges <em>Add Edges</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getCopiedCells <em>Copied Cells</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getCurrentSubGraphs <em>Current Sub Graphs</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getNewTraversalEvents <em>New Traversal Events</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getAbstractGraph <em>Abstract Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getSubGraph <em>Sub Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getTraversalEventGraph <em>Traversal Event Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getPreprocessingGraph <em>Preprocessing Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getToolDependencyGraph <em>Tool Dependency Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.Graph#getExecutionGraph <em>Execution Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_Logger()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_Graph()
	 * @model dataType="easyflow.EasyFlowGraph"
	 * @generated
	 */
	EasyFlowGraph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getGraph <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' attribute.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(EasyFlowGraph value);

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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_MostProcessedTasks()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_MetaData()
	 * @model
	 * @generated
	 */
	DefaultMetaData getMetaData();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getMetaData <em>Meta Data</em>}' reference.
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_DefaultRootCell()
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	mxICell getDefaultRootCell();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getDefaultRootCell <em>Default Root Cell</em>}' attribute.
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_ProcessedEdgesCopyGraph()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getProcessedEdgesCopyGraph();

	/**
	 * Returns the value of the '<em><b>Deprecated Edges</b></em>' attribute list.
	 * The list contents are of type {@link com.mxgraph.model.mxICell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated Edges</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated Edges</em>' attribute list.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_DeprecatedEdges()
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	EList<mxICell> getDeprecatedEdges();

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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_AddEdges()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_CopiedCells()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_CurrentSubGraphs()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_TraversalEvents()
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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_NewTraversalEvents()
	 * @model
	 * @generated
	 */
	EList<TraversalEvent> getNewTraversalEvents();

	/**
	 * Returns the value of the '<em><b>Abstract Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Graph</em>' reference.
	 * @see #setAbstractGraph(AbstractGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_AbstractGraph()
	 * @model
	 * @generated
	 */
	AbstractGraph getAbstractGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getAbstractGraph <em>Abstract Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Graph</em>' reference.
	 * @see #getAbstractGraph()
	 * @generated
	 */
	void setAbstractGraph(AbstractGraph value);

	/**
	 * Returns the value of the '<em><b>Sub Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Graph</em>' reference.
	 * @see #setSubGraph(SubGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_SubGraph()
	 * @model
	 * @generated
	 */
	SubGraph getSubGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getSubGraph <em>Sub Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Graph</em>' reference.
	 * @see #getSubGraph()
	 * @generated
	 */
	void setSubGraph(SubGraph value);

	/**
	 * Returns the value of the '<em><b>Traversal Event Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Event Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Event Graph</em>' reference.
	 * @see #setTraversalEventGraph(TraversalEventGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_TraversalEventGraph()
	 * @model
	 * @generated
	 */
	TraversalEventGraph getTraversalEventGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getTraversalEventGraph <em>Traversal Event Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Event Graph</em>' reference.
	 * @see #getTraversalEventGraph()
	 * @generated
	 */
	void setTraversalEventGraph(TraversalEventGraph value);

	/**
	 * Returns the value of the '<em><b>Preprocessing Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessing Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing Graph</em>' reference.
	 * @see #setPreprocessingGraph(PreprocessingGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_PreprocessingGraph()
	 * @model
	 * @generated
	 */
	PreprocessingGraph getPreprocessingGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getPreprocessingGraph <em>Preprocessing Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessing Graph</em>' reference.
	 * @see #getPreprocessingGraph()
	 * @generated
	 */
	void setPreprocessingGraph(PreprocessingGraph value);

	/**
	 * Returns the value of the '<em><b>Tool Dependency Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Dependency Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Dependency Graph</em>' reference.
	 * @see #setToolDependencyGraph(ToolDependencyGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_ToolDependencyGraph()
	 * @model
	 * @generated
	 */
	ToolDependencyGraph getToolDependencyGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getToolDependencyGraph <em>Tool Dependency Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Dependency Graph</em>' reference.
	 * @see #getToolDependencyGraph()
	 * @generated
	 */
	void setToolDependencyGraph(ToolDependencyGraph value);

	/**
	 * Returns the value of the '<em><b>Execution Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Graph</em>' reference.
	 * @see #setExecutionGraph(ExecutionGraph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getGraph_ExecutionGraph()
	 * @model
	 * @generated
	 */
	ExecutionGraph getExecutionGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.Graph#getExecutionGraph <em>Execution Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Graph</em>' reference.
	 * @see #getExecutionGraph()
	 * @generated
	 */
	void setExecutionGraph(ExecutionGraph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	TraversalEvent getNextTraversalEvent(boolean isGrouping) throws CellNotFoundException, TaskNotFoundException;

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
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean removeSubGraph(mxICell root, TraversalEvent traversalEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

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
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean generateWorkflowForExecutionSystem(mxICell root, IExecutionSystem executionSystem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.NoValidInOutDataException" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolveToolDependencies(mxICell root, Catalog catalog) throws NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.TaskNotFoundException" vertexDataType="easyflow.mxICell" cellDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolvePreprocessingTask(mxICell vertex, mxICell cell) throws DataLinkNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.CellToCellListMap<easyflow.mxICell, easyflow.mxICell>"
	 * @generated
	 */
	EMap<mxICell, EList<mxICell>> findCellsWherePreprocessingIsRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.CellToCellListMap<easyflow.mxICell, easyflow.mxICell>"
	 * @generated
	 */
	EMap<mxICell, EList<mxICell>> findCellsWithUntranslatedDataLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.TaskNotFoundException easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException" entryMapType="easyflow.util.maps.CellToCellListMap<easyflow.mxICell, easyflow.mxICell>"
	 * @generated
	 */
	boolean resolveEdge(Map.Entry<mxICell, EList<mxICell>> entry) throws TaskNotFoundException, DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException;

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
	 * @model
	 * @generated
	 */
	void resetFlag(int mask);

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
	 * @model exceptions="easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	EList<GroupingInstance> getGroupingInstances(TraversalEvent traversalEvent) throws GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean init();

} // Graph
