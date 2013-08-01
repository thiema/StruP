/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/core/easyflow.core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = easyflow.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.core.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.WorkflowImpl
	 * @see easyflow.core.impl.CorePackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>First Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__FIRST_NODE = 1;

	/**
	 * The feature id for the '<em><b>Known Grouping Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__KNOWN_GROUPING_CRITERIA = 2;

	/**
	 * The feature id for the '<em><b>Known Data Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__KNOWN_DATA_FORMATS = 3;

	/**
	 * The feature id for the '<em><b>Known Traversal Criteria</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__KNOWN_TRAVERSAL_CRITERIA = 4;

	/**
	 * The feature id for the '<em><b>Workflow Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKFLOW_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Last Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LAST_TASKS = 6;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LOGGER = 7;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__META_DATA = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__MODE = 9;

	/**
	 * The feature id for the '<em><b>Default Grouping Criteria</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DEFAULT_GROUPING_CRITERIA = 10;

	/**
	 * The feature id for the '<em><b>Previous Task Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PREVIOUS_TASK_NAME = 11;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GENERIC_ATTRIBUTES = 12;

	/**
	 * The feature id for the '<em><b>Graph Util</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GRAPH_UTIL = 13;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.TaskImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>In Data Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IN_DATA_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Out Data Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUT_DATA_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 2;

	/**
	 * The feature id for the '<em><b>Shall Process JEXL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SHALL_PROCESS_JEXL = 3;

	/**
	 * The feature id for the '<em><b>Util</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UTIL = 4;

	/**
	 * The feature id for the '<em><b>Jexl Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__JEXL_ENGINE = 5;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOGGER = 6;

	/**
	 * The feature id for the '<em><b>Traversal Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRAVERSAL_EVENTS = 7;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENTS = 8;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHUNKS = 9;

	/**
	 * The feature id for the '<em><b>Tool Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOL_NAMES = 10;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOLS = 11;

	/**
	 * The feature id for the '<em><b>Previous Task Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_TASK_STR = 12;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ROOT = 13;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FLAGS = 14;

	/**
	 * The feature id for the '<em><b>Grouping Criteria</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GROUPING_CRITERIA = 15;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.IWorkflowTemplate
	 * @see easyflow.core.impl.CorePackageImpl#getIWorkflowTemplate()
	 * @generated
	 */
	int IWORKFLOW_TEMPLATE = 2;

	/**
	 * The number of structural features of the '<em>IWorkflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_TEMPLATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DefaultWorkflowTemplateImpl <em>Default Workflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DefaultWorkflowTemplateImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDefaultWorkflowTemplate()
	 * @generated
	 */
	int DEFAULT_WORKFLOW_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__TASKS = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__READER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__LOGGER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Workflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE_FEATURE_COUNT = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.EasyflowTemplateImpl <em>Easyflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.EasyflowTemplateImpl
	 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTemplate()
	 * @generated
	 */
	int EASYFLOW_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__TASKS = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__READER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__LOGGER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Easyflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE_FEATURE_COUNT = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.ITaskReader
	 * @see easyflow.core.impl.CorePackageImpl#getITaskReader()
	 * @generated
	 */
	int ITASK_READER = 5;

	/**
	 * The number of structural features of the '<em>ITask Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_READER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.EasyflowTaskReaderImpl <em>Easyflow Task Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.EasyflowTaskReaderImpl
	 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTaskReader()
	 * @generated
	 */
	int EASYFLOW_TASK_READER = 6;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TASK_READER__LOGGER = ITASK_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Easyflow Task Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TASK_READER_FEATURE_COUNT = ITASK_READER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GalaxyTaskReaderImpl <em>Galaxy Task Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GalaxyTaskReaderImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGalaxyTaskReader()
	 * @generated
	 */
	int GALAXY_TASK_READER = 7;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_TASK_READER__LOGGER = ITASK_READER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Galaxy Task Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_TASK_READER_FEATURE_COUNT = ITASK_READER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DefaultRecordImpl <em>Default Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DefaultRecordImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDefaultRecord()
	 * @generated
	 */
	int DEFAULT_RECORD = 8;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RECORD__GENERIC_ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Default Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RECORD_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link easyflow.core.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see easyflow.core.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph</em>'.
	 * @see easyflow.core.Workflow#getGraph()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Graph();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getFirstNode <em>First Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Node</em>'.
	 * @see easyflow.core.Workflow#getFirstNode()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_FirstNode();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getKnownGroupingCriteria <em>Known Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Known Grouping Criteria</em>'.
	 * @see easyflow.core.Workflow#getKnownGroupingCriteria()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_KnownGroupingCriteria();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Workflow#getKnownDataFormats <em>Known Data Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Known Data Formats</em>'.
	 * @see easyflow.core.Workflow#getKnownDataFormats()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_KnownDataFormats();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Workflow#getKnownTraversalCriteria <em>Known Traversal Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Known Traversal Criteria</em>'.
	 * @see easyflow.core.Workflow#getKnownTraversalCriteria()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_KnownTraversalCriteria();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getWorkflowTemplate <em>Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow Template</em>'.
	 * @see easyflow.core.Workflow#getWorkflowTemplate()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_WorkflowTemplate();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getLastTasks <em>Last Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Tasks</em>'.
	 * @see easyflow.core.Workflow#getLastTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_LastTasks();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.Workflow#getLogger()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see easyflow.core.Workflow#getMetaData()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see easyflow.core.Workflow#getMode()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Mode();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Workflow#getDefaultGroupingCriteria <em>Default Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Grouping Criteria</em>'.
	 * @see easyflow.core.Workflow#getDefaultGroupingCriteria()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_DefaultGroupingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getPreviousTaskName <em>Previous Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Task Name</em>'.
	 * @see easyflow.core.Workflow#getPreviousTaskName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_PreviousTaskName();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Workflow#getGenericAttributes <em>Generic Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Generic Attributes</em>'.
	 * @see easyflow.core.Workflow#getGenericAttributes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_GenericAttributes();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getGraphUtil <em>Graph Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph Util</em>'.
	 * @see easyflow.core.Workflow#getGraphUtil()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_GraphUtil();

	/**
	 * Returns the meta object for class '{@link easyflow.core.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see easyflow.core.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getInDataPorts <em>In Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Data Ports</em>'.
	 * @see easyflow.core.Task#getInDataPorts()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InDataPorts();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getOutDataPorts <em>Out Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Data Ports</em>'.
	 * @see easyflow.core.Task#getOutDataPorts()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutDataPorts();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getShallProcessJEXL <em>Shall Process JEXL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shall Process JEXL</em>'.
	 * @see easyflow.core.Task#getShallProcessJEXL()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ShallProcessJEXL();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#isUtil <em>Util</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Util</em>'.
	 * @see easyflow.core.Task#isUtil()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Util();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getJexlEngine <em>Jexl Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jexl Engine</em>'.
	 * @see easyflow.core.Task#getJexlEngine()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_JexlEngine();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.Task#getLogger()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getTraversalEvents <em>Traversal Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Traversal Events</em>'.
	 * @see easyflow.core.Task#getTraversalEvents()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TraversalEvents();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see easyflow.core.Task#getParents()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parents();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Chunks</em>'.
	 * @see easyflow.core.Task#getChunks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Chunks();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getToolNames <em>Tool Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tool Names</em>'.
	 * @see easyflow.core.Task#getToolNames()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ToolNames();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tools</em>'.
	 * @see easyflow.core.Task#getTools()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Tools();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getPreviousTaskStr <em>Previous Task Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Task Str</em>'.
	 * @see easyflow.core.Task#getPreviousTaskStr()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PreviousTaskStr();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see easyflow.core.Task#isRoot()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Root();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see easyflow.core.Task#getFlags()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Flags();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getGroupingCriteria <em>Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Grouping Criteria</em>'.
	 * @see easyflow.core.Task#getGroupingCriteria()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_GroupingCriteria();

	/**
	 * Returns the meta object for class '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkflow Template</em>'.
	 * @see easyflow.core.IWorkflowTemplate
	 * @generated
	 */
	EClass getIWorkflowTemplate();

	/**
	 * Returns the meta object for class '{@link easyflow.core.DefaultWorkflowTemplate <em>Default Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Workflow Template</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate
	 * @generated
	 */
	EClass getDefaultWorkflowTemplate();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.DefaultWorkflowTemplate#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate#getTasks()
	 * @see #getDefaultWorkflowTemplate()
	 * @generated
	 */
	EReference getDefaultWorkflowTemplate_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DefaultWorkflowTemplate#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate#getReader()
	 * @see #getDefaultWorkflowTemplate()
	 * @generated
	 */
	EAttribute getDefaultWorkflowTemplate_Reader();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DefaultWorkflowTemplate#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate#getLogger()
	 * @see #getDefaultWorkflowTemplate()
	 * @generated
	 */
	EAttribute getDefaultWorkflowTemplate_Logger();

	/**
	 * Returns the meta object for class '{@link easyflow.core.EasyflowTemplate <em>Easyflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easyflow Template</em>'.
	 * @see easyflow.core.EasyflowTemplate
	 * @generated
	 */
	EClass getEasyflowTemplate();

	/**
	 * Returns the meta object for class '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITask Reader</em>'.
	 * @see easyflow.core.ITaskReader
	 * @generated
	 */
	EClass getITaskReader();

	/**
	 * Returns the meta object for class '{@link easyflow.core.EasyflowTaskReader <em>Easyflow Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Easyflow Task Reader</em>'.
	 * @see easyflow.core.EasyflowTaskReader
	 * @generated
	 */
	EClass getEasyflowTaskReader();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.EasyflowTaskReader#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.EasyflowTaskReader#getLogger()
	 * @see #getEasyflowTaskReader()
	 * @generated
	 */
	EAttribute getEasyflowTaskReader_Logger();

	/**
	 * Returns the meta object for class '{@link easyflow.core.GalaxyTaskReader <em>Galaxy Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galaxy Task Reader</em>'.
	 * @see easyflow.core.GalaxyTaskReader
	 * @generated
	 */
	EClass getGalaxyTaskReader();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GalaxyTaskReader#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.GalaxyTaskReader#getLogger()
	 * @see #getGalaxyTaskReader()
	 * @generated
	 */
	EAttribute getGalaxyTaskReader_Logger();

	/**
	 * Returns the meta object for class '{@link easyflow.core.DefaultRecord <em>Default Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Record</em>'.
	 * @see easyflow.core.DefaultRecord
	 * @generated
	 */
	EClass getDefaultRecord();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.DefaultRecord#getGenericAttributes <em>Generic Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Generic Attributes</em>'.
	 * @see easyflow.core.DefaultRecord#getGenericAttributes()
	 * @see #getDefaultRecord()
	 * @generated
	 */
	EReference getDefaultRecord_GenericAttributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.core.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.WorkflowImpl
		 * @see easyflow.core.impl.CorePackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__GRAPH = eINSTANCE.getWorkflow_Graph();

		/**
		 * The meta object literal for the '<em><b>First Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__FIRST_NODE = eINSTANCE.getWorkflow_FirstNode();

		/**
		 * The meta object literal for the '<em><b>Known Grouping Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__KNOWN_GROUPING_CRITERIA = eINSTANCE.getWorkflow_KnownGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Known Data Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__KNOWN_DATA_FORMATS = eINSTANCE.getWorkflow_KnownDataFormats();

		/**
		 * The meta object literal for the '<em><b>Known Traversal Criteria</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__KNOWN_TRAVERSAL_CRITERIA = eINSTANCE.getWorkflow_KnownTraversalCriteria();

		/**
		 * The meta object literal for the '<em><b>Workflow Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WORKFLOW_TEMPLATE = eINSTANCE.getWorkflow_WorkflowTemplate();

		/**
		 * The meta object literal for the '<em><b>Last Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__LAST_TASKS = eINSTANCE.getWorkflow_LastTasks();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__LOGGER = eINSTANCE.getWorkflow_Logger();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__META_DATA = eINSTANCE.getWorkflow_MetaData();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__MODE = eINSTANCE.getWorkflow_Mode();

		/**
		 * The meta object literal for the '<em><b>Default Grouping Criteria</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__DEFAULT_GROUPING_CRITERIA = eINSTANCE.getWorkflow_DefaultGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Previous Task Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__PREVIOUS_TASK_NAME = eINSTANCE.getWorkflow_PreviousTaskName();

		/**
		 * The meta object literal for the '<em><b>Generic Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__GENERIC_ATTRIBUTES = eINSTANCE.getWorkflow_GenericAttributes();

		/**
		 * The meta object literal for the '<em><b>Graph Util</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__GRAPH_UTIL = eINSTANCE.getWorkflow_GraphUtil();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.TaskImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>In Data Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IN_DATA_PORTS = eINSTANCE.getTask_InDataPorts();

		/**
		 * The meta object literal for the '<em><b>Out Data Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUT_DATA_PORTS = eINSTANCE.getTask_OutDataPorts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Shall Process JEXL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SHALL_PROCESS_JEXL = eINSTANCE.getTask_ShallProcessJEXL();

		/**
		 * The meta object literal for the '<em><b>Util</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__UTIL = eINSTANCE.getTask_Util();

		/**
		 * The meta object literal for the '<em><b>Jexl Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__JEXL_ENGINE = eINSTANCE.getTask_JexlEngine();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__LOGGER = eINSTANCE.getTask_Logger();

		/**
		 * The meta object literal for the '<em><b>Traversal Events</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRAVERSAL_EVENTS = eINSTANCE.getTask_TraversalEvents();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENTS = eINSTANCE.getTask_Parents();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CHUNKS = eINSTANCE.getTask_Chunks();

		/**
		 * The meta object literal for the '<em><b>Tool Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TOOL_NAMES = eINSTANCE.getTask_ToolNames();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TOOLS = eINSTANCE.getTask_Tools();

		/**
		 * The meta object literal for the '<em><b>Previous Task Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PREVIOUS_TASK_STR = eINSTANCE.getTask_PreviousTaskStr();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ROOT = eINSTANCE.getTask_Root();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FLAGS = eINSTANCE.getTask_Flags();

		/**
		 * The meta object literal for the '<em><b>Grouping Criteria</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__GROUPING_CRITERIA = eINSTANCE.getTask_GroupingCriteria();

		/**
		 * The meta object literal for the '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.IWorkflowTemplate
		 * @see easyflow.core.impl.CorePackageImpl#getIWorkflowTemplate()
		 * @generated
		 */
		EClass IWORKFLOW_TEMPLATE = eINSTANCE.getIWorkflowTemplate();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.DefaultWorkflowTemplateImpl <em>Default Workflow Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.DefaultWorkflowTemplateImpl
		 * @see easyflow.core.impl.CorePackageImpl#getDefaultWorkflowTemplate()
		 * @generated
		 */
		EClass DEFAULT_WORKFLOW_TEMPLATE = eINSTANCE.getDefaultWorkflowTemplate();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_WORKFLOW_TEMPLATE__TASKS = eINSTANCE.getDefaultWorkflowTemplate_Tasks();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_WORKFLOW_TEMPLATE__READER = eINSTANCE.getDefaultWorkflowTemplate_Reader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_WORKFLOW_TEMPLATE__LOGGER = eINSTANCE.getDefaultWorkflowTemplate_Logger();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.EasyflowTemplateImpl <em>Easyflow Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.EasyflowTemplateImpl
		 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTemplate()
		 * @generated
		 */
		EClass EASYFLOW_TEMPLATE = eINSTANCE.getEasyflowTemplate();

		/**
		 * The meta object literal for the '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.ITaskReader
		 * @see easyflow.core.impl.CorePackageImpl#getITaskReader()
		 * @generated
		 */
		EClass ITASK_READER = eINSTANCE.getITaskReader();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.EasyflowTaskReaderImpl <em>Easyflow Task Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.EasyflowTaskReaderImpl
		 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTaskReader()
		 * @generated
		 */
		EClass EASYFLOW_TASK_READER = eINSTANCE.getEasyflowTaskReader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASYFLOW_TASK_READER__LOGGER = eINSTANCE.getEasyflowTaskReader_Logger();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GalaxyTaskReaderImpl <em>Galaxy Task Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GalaxyTaskReaderImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGalaxyTaskReader()
		 * @generated
		 */
		EClass GALAXY_TASK_READER = eINSTANCE.getGalaxyTaskReader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALAXY_TASK_READER__LOGGER = eINSTANCE.getGalaxyTaskReader_Logger();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.DefaultRecordImpl <em>Default Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.DefaultRecordImpl
		 * @see easyflow.core.impl.CorePackageImpl#getDefaultRecord()
		 * @generated
		 */
		EClass DEFAULT_RECORD = eINSTANCE.getDefaultRecord();

		/**
		 * The meta object literal for the '<em><b>Generic Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_RECORD__GENERIC_ATTRIBUTES = eINSTANCE.getDefaultRecord_GenericAttributes();

	}

} //CorePackage
