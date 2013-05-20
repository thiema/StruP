/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;

import easyflow.core.DefaultMetaData;
import easyflow.core.Task;
import easyflow.core.TraversalChunk;
import easyflow.core.TraversalEvent;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.sequencing.MetaData;
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
	 * @model mapType="easyflow.core.StringToTaskMap<org.eclipse.emf.ecore.EString, easyflow.core.Task>"
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
	 * @model mapType="easyflow.core.StringToGraphCellMap<org.eclipse.emf.ecore.EString, easyflow.mxICell>"
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
	 * @model mapType="easyflow.core.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getDepricatedTasks();

	/**
	 * Returns the value of the '<em><b>Most Processed Tasks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Most Processed Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Most Processed Tasks</em>' map.
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getUtil_MostProcessedTasks()
	 * @model mapType="easyflow.core.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell"
	 * @generated
	 */
	mxICell computeSubgraph(TraversalEvent traversalEvent, boolean isComplete);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	EList<TraversalEvent> getNewTraversalEvents(TraversalEvent traversalEvent, mxICell root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	void applyTraversalEvent(mxICell root, TraversalEvent traversalEvent, String groupingStr, String instanceStr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolveTraversalEvents(mxICell root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	void printGraph(mxICell root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.mxICell" rootDataType="easyflow.mxICell"
	 * @generated
	 */
	mxICell applyTraversalEventCopyGraph(mxICell root, String groupingStr, String instanceStr);

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
	boolean removeSubGraph(mxICell root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootDataType="easyflow.mxICell"
	 * @generated
	 */
	EList<TraversalEvent> getTraversalEvents(mxICell root, boolean isGrouping);

} // Util
