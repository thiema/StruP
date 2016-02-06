/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;

import easyflow.custom.jgraphx.EasyFlowOverallWorker;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import easyflow.data.DataLink;
import easyflow.data.DataPort;

import easyflow.execution.IExecutionSystem;

import easyflow.graph.jgraphx.Graph;

import easyflow.tool.Rule;
import easyflow.tool.Tool;

import easyflow.traversal.TraversalEvent;

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
 *   <li>{@link easyflow.core.Workflow#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getRootTask <em>Root Task</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getStaticTasks <em>Static Tasks</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getProcessedStates <em>Processed States</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getPreviousTaskName <em>Previous Task Name</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getWorker <em>Worker</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getExecutionSystem <em>Execution System</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getCurrentRule <em>Current Rule</em>}</li>
 *   <li>{@link easyflow.core.Workflow#getJgraph <em>Jgraph</em>}</li>
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
	 * @model mapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EMap<String, Object> getGenericAttributes();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' reference.
	 * @see #setCatalog(Catalog)
	 * @see easyflow.core.CorePackage#getWorkflow_Catalog()
	 * @model
	 * @generated
	 */
	Catalog getCatalog();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getCatalog <em>Catalog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog value);

	/**
	 * Returns the value of the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Task</em>' reference.
	 * @see #setRootTask(Task)
	 * @see easyflow.core.CorePackage#getWorkflow_RootTask()
	 * @model
	 * @generated
	 */
	Task getRootTask();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getRootTask <em>Root Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Task</em>' reference.
	 * @see #getRootTask()
	 * @generated
	 */
	void setRootTask(Task value);

	/**
	 * Returns the value of the '<em><b>Static Tasks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Tasks</em>' reference list.
	 * @see easyflow.core.CorePackage#getWorkflow_StaticTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getStaticTasks();

	/**
	 * Returns the value of the '<em><b>Processed States</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Boolean},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed States</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed States</em>' map.
	 * @see easyflow.core.CorePackage#getWorkflow_ProcessedStates()
	 * @model mapType="easyflow.util.maps.StringToBooleanMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EBooleanObject>"
	 * @generated
	 */
	EMap<String, Boolean> getProcessedStates();

	/**
	 * Returns the value of the '<em><b>Previous Task Name</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task Name</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task Name</em>' map.
	 * @see easyflow.core.CorePackage#getWorkflow_PreviousTaskName()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getPreviousTaskName();

	/**
	 * Returns the value of the '<em><b>Worker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker</em>' attribute.
	 * @see #setWorker(EasyFlowOverallWorker)
	 * @see easyflow.core.CorePackage#getWorkflow_Worker()
	 * @model dataType="easyflow.EasyFlowOverallWorker"
	 * @generated
	 */
	EasyFlowOverallWorker getWorker();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getWorker <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker</em>' attribute.
	 * @see #getWorker()
	 * @generated
	 */
	void setWorker(EasyFlowOverallWorker value);

	/**
	 * Returns the value of the '<em><b>Execution System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution System</em>' reference.
	 * @see #setExecutionSystem(IExecutionSystem)
	 * @see easyflow.core.CorePackage#getWorkflow_ExecutionSystem()
	 * @model
	 * @generated
	 */
	IExecutionSystem getExecutionSystem();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getExecutionSystem <em>Execution System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution System</em>' reference.
	 * @see #getExecutionSystem()
	 * @generated
	 */
	void setExecutionSystem(IExecutionSystem value);

	/**
	 * Returns the value of the '<em><b>Current Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Rule</em>' reference.
	 * @see #setCurrentRule(Rule)
	 * @see easyflow.core.CorePackage#getWorkflow_CurrentRule()
	 * @model
	 * @generated
	 */
	Rule getCurrentRule();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getCurrentRule <em>Current Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Rule</em>' reference.
	 * @see #getCurrentRule()
	 * @generated
	 */
	void setCurrentRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Jgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jgraph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jgraph</em>' reference.
	 * @see #setJgraph(Graph)
	 * @see easyflow.core.CorePackage#getWorkflow_Jgraph()
	 * @model
	 * @generated
	 */
	Graph getJgraph();

	/**
	 * Sets the value of the '{@link easyflow.core.Workflow#getJgraph <em>Jgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jgraph</em>' reference.
	 * @see #getJgraph()
	 * @generated
	 */
	void setJgraph(Graph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model toolsMapType="easyflow.util.maps.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.tool.Tool>"
	 * @generated
	 */
	boolean generateGraphFromTemplate(EMap<String, Tool> tools);

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
	 * @model mapType="easyflow.util.maps.TaskToDataLinkListMap<easyflow.core.Task, easyflow.data.DataLink>"
	 * @generated
	 */
	EMap<Task, EList<DataLink>> getParentTasksFor(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean resolveMissingDataPortsByToolFor(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean readWorkfowTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateAbstractWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * breadth first iteration of graph. compute new graph with 
	 * given traversal event applied.
	 * <!-- end-model-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean applyGroupingCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean applyParameterCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean applyTraversalEvent(TraversalEvent traversalEvent) throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * breadth first iteration of graph and completing/checking the traversal events of each task
	 * in order to combine splitting and merging events into a single events. Usually each
	 * merging event complements a splitting event.
	 * Moreover the parent for each splitting event is set.
	 * <!-- end-model-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolveTraversalEvents() throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolveIncompatibleGroupings() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolvePreprocessingTasks() throws DataLinkNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.NoValidInOutDataException"
	 * @generated
	 */
	boolean resolveToolDependencies() throws NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateWorklowForExecutionSystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	int runNextWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	int runPrevWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	int runEntireWorkflow() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasNextWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getTotalNumberOfWorkflowSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getWorkflowStepLabelFor(String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getWorkflowStepDescFor(String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNumberOfCurrentWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNextWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCurWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean resetWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printWorkflowStepMsgOnStart(String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printWorkflowStepMsgOnEnd(boolean rc, String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String renderToString();

} // Workflow
