/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import easyflow.graph.jgraphx.Util;
import java.net.URI;
import java.util.Map;
import java.util.Stack;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Workflow is modelled using a graph representing data processing Tasks and its connections. E.g. the inputs and outputs and its parent and child tasks. The Workflow provides basic methods to generate and manipulate data processing workflows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.Workflow#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getKnownGroupingCriteria <em>Known Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getKnownDataFormats <em>Known Data Formats</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getKnownTraversalCriteria <em>Known Traversal Criteria</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getWorkflowTemplate <em>Workflow Template</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getLastTasks <em>Last Tasks</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getMode <em>Mode</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getDefaultGroupingCriteria <em>Default Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getPreviousTaskName <em>Previous Task Name</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getGraphUtil <em>Graph Util</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
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
	 * @see easyflow.core.CorePackage#getWorkflow_Graph()
	 * @model dataType="easyflow.EasyFlowGraph"
	 * @generated
	 */
	EasyFlowGraph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getGraph <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' attribute.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(EasyFlowGraph value);

	/**
	 * Returns the value of the '<em><b>First Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Node</em>' attribute.
	 * @see #setFirstNode(Object)
	 * @see easyflow.core.CorePackage#getWorkflow_FirstNode()
	 * @model dataType="easyflow.Object"
	 * @generated
	 */
	Object getFirstNode();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getFirstNode <em>First Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Node</em>' attribute.
	 * @see #getFirstNode()
	 * @generated
	 */
	void setFirstNode(Object value);

	/**
	 * Returns the value of the '<em><b>Known Grouping Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Grouping Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Grouping Criteria</em>' attribute.
	 * @see #setKnownGroupingCriteria(String)
	 * @see easyflow.core.CorePackage#getWorkflow_KnownGroupingCriteria()
	 * @model
	 * @generated
	 */
	String getKnownGroupingCriteria();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getKnownGroupingCriteria <em>Known Grouping Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Known Grouping Criteria</em>' attribute.
	 * @see #getKnownGroupingCriteria()
	 * @generated
	 */
	void setKnownGroupingCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Known Data Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Data Formats</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Data Formats</em>' attribute list.
	 * @see easyflow.core.CorePackage#getWorkflow_KnownDataFormats()
	 * @model
	 * @generated
	 */
	EList<String> getKnownDataFormats();

	/**
	 * Returns the value of the '<em><b>Known Traversal Criteria</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Traversal Criteria</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Traversal Criteria</em>' attribute list.
	 * @see easyflow.core.CorePackage#getWorkflow_KnownTraversalCriteria()
	 * @model
	 * @generated
	 */
	EList<String> getKnownTraversalCriteria();

	/**
	 * Returns the value of the '<em><b>Workflow Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Template</em>' reference.
	 * @see #setWorkflowTemplate(DefaultWorkflowTemplate)
	 * @see easyflow.core.CorePackage#getWorkflow_WorkflowTemplate()
	 * @model
	 * @generated
	 */
	DefaultWorkflowTemplate getWorkflowTemplate();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getWorkflowTemplate <em>Workflow Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Template</em>' reference.
	 * @see #getWorkflowTemplate()
	 * @generated
	 */
	void setWorkflowTemplate(DefaultWorkflowTemplate value);

	/**
	 * Returns the value of the '<em><b>Last Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Tasks</em>' attribute.
	 * @see #setLastTasks(Stack)
	 * @see easyflow.core.CorePackage#getWorkflow_LastTasks()
	 * @model dataType="easyflow.Stack"
	 * @generated
	 */
	Stack getLastTasks();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getLastTasks <em>Last Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Tasks</em>' attribute.
	 * @see #getLastTasks()
	 * @generated
	 */
	void setLastTasks(Stack value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.core.CorePackage#getWorkflow_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' attribute.
	 * @see #setMetaData(Object)
	 * @see easyflow.core.CorePackage#getWorkflow_MetaData()
	 * @model dataType="easyflow.Object"
	 * @generated
	 */
	Object getMetaData();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getMetaData <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' attribute.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(Object value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see easyflow.core.CorePackage#getWorkflow_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Default Grouping Criteria</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Grouping Criteria</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Grouping Criteria</em>' attribute list.
	 * @see easyflow.core.CorePackage#getWorkflow_DefaultGroupingCriteria()
	 * @model
	 * @generated
	 */
	EList<String> getDefaultGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Previous Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task Name</em>' attribute.
	 * @see #setPreviousTaskName(Map)
	 * @see easyflow.core.CorePackage#getWorkflow_PreviousTaskName()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getPreviousTaskName();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getPreviousTaskName <em>Previous Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task Name</em>' attribute.
	 * @see #getPreviousTaskName()
	 * @generated
	 */
	void setPreviousTaskName(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Generic Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Attributes</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attributes</em>' map.
	 * @see easyflow.core.CorePackage#getWorkflow_GenericAttributes()
	 * @model mapType="easyflow.core.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EMap<String, Object> getGenericAttributes();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.Tool},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' map.
	 * @see easyflow.core.CorePackage#getWorkflow_Tools()
	 * @model mapType="easyflow.core.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.core.Tool>"
	 * @generated
	 */
	EMap<String, Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Graph Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Util</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Util</em>' reference.
	 * @see #setGraphUtil(Util)
	 * @see easyflow.core.CorePackage#getWorkflow_GraphUtil()
	 * @model
	 * @generated
	 */
	Util getGraphUtil();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getGraphUtil <em>Graph Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Util</em>' reference.
	 * @see #getGraphUtil()
	 * @generated
	 */
	void setGraphUtil(Util value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void generateGraphFromTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void readProjectMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tasks that are explicitely set in the parentTasks attribute. It is assumed that
	 * only one task will match the given DataPort. However only the first is returned.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Task getParentTaskByOutDataPort(DataPort dataPort, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all tasks with compatible outgoing DataPorts.
	 * <!-- end-model-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<Task> getParentTasksByOutDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateParentTaskOutDataPort(DataPort dataPort, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateLastTaskOutDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void readMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * breadth first iteration of graph. compute new graph with 
	 * given traversal event applied.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void applyTraversalEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyTraversalEvent(TraversalEvent traversalEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * breadth first iteration of graph and completing/checking the traversal events of each task
	 * in order to combine splitting and merging events into a single events. Usually each
	 * merging event complements a splitting event.
	 * Moreover the parent for each splitting event is set.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean resolveTraversalEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * evaluate the task's jexl expression to decide if the task's grouping instance
	 * violates the constains given by jexl. Assume grouping criteria was already applied.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean shallProcessTask(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iterate over tasks of the graph and call shallProcessTask(Task).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void evaluateJEXLString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readWorkfowTemplate();

} // Workflow
