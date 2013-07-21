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
	 * The meta object id for the '{@link easyflow.core.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.ToolImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__LOGGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DataPortImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 5;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DataFormatImpl <em>Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DataFormatImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDataFormat()
	 * @generated
	 */
	int DATA_FORMAT = 6;

	/**
	 * The meta object id for the '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.IWorkflowTemplate
	 * @see easyflow.core.impl.CorePackageImpl#getIWorkflowTemplate()
	 * @generated
	 */
	int IWORKFLOW_TEMPLATE = 7;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DefaultWorkflowTemplateImpl <em>Default Workflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DefaultWorkflowTemplateImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDefaultWorkflowTemplate()
	 * @generated
	 */
	int DEFAULT_WORKFLOW_TEMPLATE = 8;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.EasyflowTemplateImpl <em>Easyflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.EasyflowTemplateImpl
	 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTemplate()
	 * @generated
	 */
	int EASYFLOW_TEMPLATE = 9;

	/**
	 * The meta object id for the '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.ITaskReader
	 * @see easyflow.core.impl.CorePackageImpl#getITaskReader()
	 * @generated
	 */
	int ITASK_READER = 10;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.EasyflowTaskReaderImpl <em>Easyflow Task Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.EasyflowTaskReaderImpl
	 * @see easyflow.core.impl.CorePackageImpl#getEasyflowTaskReader()
	 * @generated
	 */
	int EASYFLOW_TASK_READER = 11;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GalaxyTaskReaderImpl <em>Galaxy Task Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GalaxyTaskReaderImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGalaxyTaskReader()
	 * @generated
	 */
	int GALAXY_TASK_READER = 12;

	/**
	 * The meta object id for the '{@link easyflow.core.IMetaData <em>IMeta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.IMetaData
	 * @see easyflow.core.impl.CorePackageImpl#getIMetaData()
	 * @generated
	 */
	int IMETA_DATA = 13;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DefaultMetaDataImpl <em>Default Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DefaultMetaDataImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDefaultMetaData()
	 * @generated
	 */
	int DEFAULT_META_DATA = 14;

	/**
	 * The meta object id for the '{@link easyflow.core.IProjectMetaData <em>IProject Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.IProjectMetaData
	 * @see easyflow.core.impl.CorePackageImpl#getIProjectMetaData()
	 * @generated
	 */
	int IPROJECT_META_DATA = 15;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GroupingCriterionImpl <em>Grouping Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GroupingCriterionImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGroupingCriterion()
	 * @generated
	 */
	int GROUPING_CRITERION = 16;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.TraversalCriterionImpl <em>Traversal Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.TraversalCriterionImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTraversalCriterion()
	 * @generated
	 */
	int TRAVERSAL_CRITERION = 17;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.InterpreterImpl <em>Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.InterpreterImpl
	 * @see easyflow.core.impl.CorePackageImpl#getInterpreter()
	 * @generated
	 */
	int INTERPRETER = 3;

	/**
	 * The feature id for the '<em><b>Exe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__EXE = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER__LOGGER = 1;

	/**
	 * The number of structural features of the '<em>Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.CommandImpl
	 * @see easyflow.core.impl.CorePackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROGRAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__EXECUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__LOGGER = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Grouping Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__GROUPING_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__DATA_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORMAT_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>IWorkflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_TEMPLATE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>ITask Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_READER_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>IMeta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETA_DATA_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__READER = IMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__LOGGER = IMETA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groupings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__GROUPINGS = IMETA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grouping Instances</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__GROUPING_INSTANCES = IMETA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grouping Instances By Group</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP = IMETA_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Default Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA_FEATURE_COUNT = IMETA_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IProject Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_META_DATA_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__MODE = 2;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__MULTIPLE_INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__SEPERATE_INPUT_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION__LOGGER = 5;

	/**
	 * The number of structural features of the '<em>Grouping Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_CRITERION_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__ID = GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__DESCRIPTION = GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__MODE = GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__MULTIPLE_INSTANCES = GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__SEPERATE_INPUT_PORTS = GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__LOGGER = GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__OPERATION = GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__CHUNKS = GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chunk Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION__CHUNK_SOURCE = GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traversal Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CRITERION_FEATURE_COUNT = GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToTaskMapImpl <em>String To Task Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToTaskMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToTaskMap()
	 * @generated
	 */
	int STRING_TO_TASK_MAP = 22;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.TraversalEventImpl <em>Traversal Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.TraversalEventImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTraversalEvent()
	 * @generated
	 */
	int TRAVERSAL_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Merge Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__MERGE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Split Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__SPLIT_TASK = 1;

	/**
	 * The feature id for the '<em><b>Parent Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__PARENT_TASK = 2;

	/**
	 * The feature id for the '<em><b>Parent Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__PARENT_CELLS = 3;

	/**
	 * The feature id for the '<em><b>Traversal Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__TRAVERSAL_CRITERION = 4;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__LOGGER = 5;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT__META_DATA = 6;

	/**
	 * The number of structural features of the '<em>Traversal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_EVENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.TraversalOperationImpl <em>Traversal Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.TraversalOperationImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTraversalOperation()
	 * @generated
	 */
	int TRAVERSAL_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__LOGGER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Traversal Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.TraversalChunkImpl <em>Traversal Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.TraversalChunkImpl
	 * @see easyflow.core.impl.CorePackageImpl#getTraversalChunk()
	 * @generated
	 */
	int TRAVERSAL_CHUNK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK__LOGGER = 1;

	/**
	 * The number of structural features of the '<em>Traversal Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSAL_CHUNK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToTraversalEventMapImpl <em>String To Traversal Event Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToTraversalEventMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToTraversalEventMap()
	 * @generated
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP = 23;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToGraphCellMapImpl <em>String To Graph Cell Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToGraphCellMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToGraphCellMap()
	 * @generated
	 */
	int STRING_TO_GRAPH_CELL_MAP = 24;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToTraversalCriterionMapImpl <em>String To Traversal Criterion Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToTraversalCriterionMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToTraversalCriterionMap()
	 * @generated
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP = 25;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.DefaultRecordImpl <em>Default Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.DefaultRecordImpl
	 * @see easyflow.core.impl.CorePackageImpl#getDefaultRecord()
	 * @generated
	 */
	int DEFAULT_RECORD = 21;

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
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Task Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Traversal Event Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Graph Cell Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Traversal Criterion Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToObjectMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToObjectMap()
	 * @generated
	 */
	int STRING_TO_OBJECT_MAP = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToChunksMapImpl <em>String To Chunks Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToChunksMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToChunksMap()
	 * @generated
	 */
	int STRING_TO_CHUNKS_MAP = 27;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Chunks Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToChunkMapImpl <em>String To Chunk Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToChunkMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToChunkMap()
	 * @generated
	 */
	int STRING_TO_CHUNK_MAP = 28;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Chunk Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToToolMapImpl <em>String To Tool Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToToolMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToToolMap()
	 * @generated
	 */
	int STRING_TO_TOOL_MAP = 29;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Tool Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToStringMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 30;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToGroupingMapImpl <em>String To Grouping Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToGroupingMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_MAP = 31;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GroupingImpl <em>Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GroupingImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGrouping()
	 * @generated
	 */
	int GROUPING = 37;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GroupingInstanceImpl <em>Grouping Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GroupingInstanceImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGroupingInstance()
	 * @generated
	 */
	int GROUPING_INSTANCE = 38;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GroupingFeatureImpl <em>Grouping Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GroupingFeatureImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGroupingFeature()
	 * @generated
	 */
	int GROUPING_FEATURE = 39;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToGroupingFeatureMapImpl <em>String To Grouping Feature Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToGroupingFeatureMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingFeatureMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_FEATURE_MAP = 32;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToGroupingInstanceListMapImpl <em>String To Grouping Instance List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToGroupingInstanceListMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingInstanceListMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Instance List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToStringListMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToStringListMap()
	 * @generated
	 */
	int STRING_TO_STRING_LIST_MAP = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToURIMapImpl <em>String To URI Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToURIMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToURIMap()
	 * @generated
	 */
	int STRING_TO_URI_MAP = 35;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To URI Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToSchemaMapImpl <em>String To Schema Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToSchemaMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToSchemaMap()
	 * @generated
	 */
	int STRING_TO_SCHEMA_MAP = 36;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Schema Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Grouping Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Grouping Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GroupingInstanceListImpl <em>Grouping Instance List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GroupingInstanceListImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGroupingInstanceList()
	 * @generated
	 */
	int GROUPING_INSTANCE_LIST = 40;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_LIST__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Grouping Instance List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.StringToProjectMapImpl <em>String To Project Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.StringToProjectMapImpl
	 * @see easyflow.core.impl.CorePackageImpl#getStringToProjectMap()
	 * @generated
	 */
	int STRING_TO_PROJECT_MAP = 41;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Project Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP_FEATURE_COUNT = 2;

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
	 * Returns the meta object for class '{@link easyflow.core.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see easyflow.core.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Tool#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.Tool#getLogger()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Tool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.core.Tool#getId()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see easyflow.core.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Tool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.core.Tool#getDescription()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Description();

	/**
	 * Returns the meta object for class '{@link easyflow.core.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see easyflow.core.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.DataPort#getGroupingCriteria <em>Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouping Criteria</em>'.
	 * @see easyflow.core.DataPort#getGroupingCriteria()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_GroupingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DataPort#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see easyflow.core.DataPort#getCardinality()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.DataPort#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Format</em>'.
	 * @see easyflow.core.DataPort#getDataFormat()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_DataFormat();

	/**
	 * Returns the meta object for class '{@link easyflow.core.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Format</em>'.
	 * @see easyflow.core.DataFormat
	 * @generated
	 */
	EClass getDataFormat();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DataFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.DataFormat#getName()
	 * @see #getDataFormat()
	 * @generated
	 */
	EAttribute getDataFormat_Name();

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
	 * Returns the meta object for class '{@link easyflow.core.IMetaData <em>IMeta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMeta Data</em>'.
	 * @see easyflow.core.IMetaData
	 * @generated
	 */
	EClass getIMetaData();

	/**
	 * Returns the meta object for class '{@link easyflow.core.DefaultMetaData <em>Default Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Meta Data</em>'.
	 * @see easyflow.core.DefaultMetaData
	 * @generated
	 */
	EClass getDefaultMetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DefaultMetaData#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader</em>'.
	 * @see easyflow.core.DefaultMetaData#getReader()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EAttribute getDefaultMetaData_Reader();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.DefaultMetaData#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.DefaultMetaData#getLogger()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EAttribute getDefaultMetaData_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.DefaultMetaData#getGroupingInstances <em>Grouping Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Grouping Instances</em>'.
	 * @see easyflow.core.DefaultMetaData#getGroupingInstances()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_GroupingInstances();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.DefaultMetaData#getGroupingInstancesByGroup <em>Grouping Instances By Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Grouping Instances By Group</em>'.
	 * @see easyflow.core.DefaultMetaData#getGroupingInstancesByGroup()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_GroupingInstancesByGroup();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.DefaultMetaData#getGroupings <em>Groupings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Groupings</em>'.
	 * @see easyflow.core.DefaultMetaData#getGroupings()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_Groupings();

	/**
	 * Returns the meta object for class '{@link easyflow.core.IProjectMetaData <em>IProject Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject Meta Data</em>'.
	 * @see easyflow.core.IProjectMetaData
	 * @generated
	 */
	EClass getIProjectMetaData();

	/**
	 * Returns the meta object for class '{@link easyflow.core.GroupingCriterion <em>Grouping Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Criterion</em>'.
	 * @see easyflow.core.GroupingCriterion
	 * @generated
	 */
	EClass getGroupingCriterion();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#isMultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Instances</em>'.
	 * @see easyflow.core.GroupingCriterion#isMultipleInstances()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_MultipleInstances();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#isSeperateInputPorts <em>Seperate Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seperate Input Ports</em>'.
	 * @see easyflow.core.GroupingCriterion#isSeperateInputPorts()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_SeperateInputPorts();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.GroupingCriterion#getLogger()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see easyflow.core.GroupingCriterion#getId()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Id();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.core.GroupingCriterion#getDescription()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Description();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingCriterion#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see easyflow.core.GroupingCriterion#getMode()
	 * @see #getGroupingCriterion()
	 * @generated
	 */
	EAttribute getGroupingCriterion_Mode();

	/**
	 * Returns the meta object for class '{@link easyflow.core.TraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversal Criterion</em>'.
	 * @see easyflow.core.TraversalCriterion
	 * @generated
	 */
	EClass getTraversalCriterion();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.TraversalCriterion#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see easyflow.core.TraversalCriterion#getOperation()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EReference getTraversalCriterion_Operation();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.TraversalCriterion#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Chunks</em>'.
	 * @see easyflow.core.TraversalCriterion#getChunks()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EReference getTraversalCriterion_Chunks();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalCriterion#getChunkSource <em>Chunk Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk Source</em>'.
	 * @see easyflow.core.TraversalCriterion#getChunkSource()
	 * @see #getTraversalCriterion()
	 * @generated
	 */
	EAttribute getTraversalCriterion_ChunkSource();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Task Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Task Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.Task"
	 * @generated
	 */
	EClass getStringToTaskMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTaskMap()
	 * @generated
	 */
	EAttribute getStringToTaskMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTaskMap()
	 * @generated
	 */
	EReference getStringToTaskMap_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.core.TraversalEvent <em>Traversal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversal Event</em>'.
	 * @see easyflow.core.TraversalEvent
	 * @generated
	 */
	EClass getTraversalEvent();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.TraversalEvent#getMergeTask <em>Merge Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merge Task</em>'.
	 * @see easyflow.core.TraversalEvent#getMergeTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_MergeTask();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.TraversalEvent#getSplitTask <em>Split Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Split Task</em>'.
	 * @see easyflow.core.TraversalEvent#getSplitTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_SplitTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.TraversalEvent#getParentTask <em>Parent Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Task</em>'.
	 * @see easyflow.core.TraversalEvent#getParentTask()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_ParentTask();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.TraversalEvent#getTraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traversal Criterion</em>'.
	 * @see easyflow.core.TraversalEvent#getTraversalCriterion()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EReference getTraversalEvent_TraversalCriterion();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalEvent#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.TraversalEvent#getLogger()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalEvent#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see easyflow.core.TraversalEvent#getMetaData()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_MetaData();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.TraversalEvent#getParentCells <em>Parent Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Cells</em>'.
	 * @see easyflow.core.TraversalEvent#getParentCells()
	 * @see #getTraversalEvent()
	 * @generated
	 */
	EAttribute getTraversalEvent_ParentCells();

	/**
	 * Returns the meta object for class '{@link easyflow.core.TraversalOperation <em>Traversal Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversal Operation</em>'.
	 * @see easyflow.core.TraversalOperation
	 * @generated
	 */
	EClass getTraversalOperation();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.TraversalOperation#getName()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalOperation#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.TraversalOperation#getLogger()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see easyflow.core.TraversalOperation#getType()
	 * @see #getTraversalOperation()
	 * @generated
	 */
	EAttribute getTraversalOperation_Type();

	/**
	 * Returns the meta object for class '{@link easyflow.core.TraversalChunk <em>Traversal Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traversal Chunk</em>'.
	 * @see easyflow.core.TraversalChunk
	 * @generated
	 */
	EClass getTraversalChunk();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalChunk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.TraversalChunk#getName()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EAttribute getTraversalChunk_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.TraversalChunk#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.TraversalChunk#getLogger()
	 * @see #getTraversalChunk()
	 * @generated
	 */
	EAttribute getTraversalChunk_Logger();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Traversal Event Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Traversal Event Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.TraversalEvent"
	 * @generated
	 */
	EClass getStringToTraversalEventMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalEventMap()
	 * @generated
	 */
	EAttribute getStringToTraversalEventMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalEventMap()
	 * @generated
	 */
	EReference getStringToTraversalEventMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Graph Cell Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Graph Cell Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.mxICell"
	 * @generated
	 */
	EClass getStringToGraphCellMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGraphCellMap()
	 * @generated
	 */
	EAttribute getStringToGraphCellMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGraphCellMap()
	 * @generated
	 */
	EAttribute getStringToGraphCellMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Traversal Criterion Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Traversal Criterion Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.TraversalCriterion"
	 * @generated
	 */
	EClass getStringToTraversalCriterionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalCriterionMap()
	 * @generated
	 */
	EAttribute getStringToTraversalCriterionMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalCriterionMap()
	 * @generated
	 */
	EReference getStringToTraversalCriterionMap_Value();

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
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.Object"
	 * @generated
	 */
	EClass getStringToObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Chunks Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Chunks Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.TraversalChunk" valueMany="true"
	 * @generated
	 */
	EClass getStringToChunksMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunksMap()
	 * @generated
	 */
	EAttribute getStringToChunksMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunksMap()
	 * @generated
	 */
	EReference getStringToChunksMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Chunk Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Chunk Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.TraversalChunk"
	 * @generated
	 */
	EClass getStringToChunkMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunkMap()
	 * @generated
	 */
	EAttribute getStringToChunkMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunkMap()
	 * @generated
	 */
	EReference getStringToChunkMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Tool Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Tool Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.Tool"
	 * @generated
	 */
	EClass getStringToToolMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMap()
	 * @generated
	 */
	EAttribute getStringToToolMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMap()
	 * @generated
	 */
	EReference getStringToToolMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.Grouping"
	 * @generated
	 */
	EClass getStringToGroupingMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingMap()
	 * @generated
	 */
	EAttribute getStringToGroupingMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingMap()
	 * @generated
	 */
	EReference getStringToGroupingMap_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.core.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping</em>'.
	 * @see easyflow.core.Grouping
	 * @generated
	 */
	EClass getGrouping();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Grouping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.Grouping#getName()
	 * @see #getGrouping()
	 * @generated
	 */
	EAttribute getGrouping_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Grouping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.core.Grouping#getDescription()
	 * @see #getGrouping()
	 * @generated
	 */
	EAttribute getGrouping_Description();

	/**
	 * Returns the meta object for class '{@link easyflow.core.GroupingInstance <em>Grouping Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Instance</em>'.
	 * @see easyflow.core.GroupingInstance
	 * @generated
	 */
	EClass getGroupingInstance();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.GroupingInstance#getName()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EAttribute getGroupingInstance_Name();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.GroupingInstance#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see easyflow.core.GroupingInstance#getFeatures()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EReference getGroupingInstance_Features();

	/**
	 * Returns the meta object for class '{@link easyflow.core.GroupingFeature <em>Grouping Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Feature</em>'.
	 * @see easyflow.core.GroupingFeature
	 * @generated
	 */
	EClass getGroupingFeature();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.GroupingFeature#getName()
	 * @see #getGroupingFeature()
	 * @generated
	 */
	EAttribute getGroupingFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.GroupingFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see easyflow.core.GroupingFeature#getValue()
	 * @see #getGroupingFeature()
	 * @generated
	 */
	EAttribute getGroupingFeature_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Feature Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.GroupingFeature"
	 * @generated
	 */
	EClass getStringToGroupingFeatureMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingFeatureMap()
	 * @generated
	 */
	EAttribute getStringToGroupingFeatureMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingFeatureMap()
	 * @generated
	 */
	EReference getStringToGroupingFeatureMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Instance List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Instance List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.GroupingInstanceList"
	 * @generated
	 */
	EClass getStringToGroupingInstanceListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceListMap()
	 * @generated
	 */
	EAttribute getStringToGroupingInstanceListMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceListMap()
	 * @generated
	 */
	EReference getStringToGroupingInstanceListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueMany="true"
	 * @generated
	 */
	EClass getStringToStringListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To URI Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To URI Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.URI"
	 * @generated
	 */
	EClass getStringToURIMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToURIMap()
	 * @generated
	 */
	EAttribute getStringToURIMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToURIMap()
	 * @generated
	 */
	EAttribute getStringToURIMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Schema Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Schema Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.Schema"
	 * @generated
	 */
	EClass getStringToSchemaMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSchemaMap()
	 * @generated
	 */
	EAttribute getStringToSchemaMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSchemaMap()
	 * @generated
	 */
	EAttribute getStringToSchemaMap_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.core.GroupingInstanceList <em>Grouping Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Instance List</em>'.
	 * @see easyflow.core.GroupingInstanceList
	 * @generated
	 */
	EClass getGroupingInstanceList();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.GroupingInstanceList#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see easyflow.core.GroupingInstanceList#getInstances()
	 * @see #getGroupingInstanceList()
	 * @generated
	 */
	EReference getGroupingInstanceList_Instances();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Project Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Project Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.ui.DefaultProject"
	 * @generated
	 */
	EClass getStringToProjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToProjectMap()
	 * @generated
	 */
	EAttribute getStringToProjectMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToProjectMap()
	 * @generated
	 */
	EReference getStringToProjectMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Key();

	/**
	 * Returns the meta object for class '{@link easyflow.core.Interpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpreter</em>'.
	 * @see easyflow.core.Interpreter
	 * @generated
	 */
	EClass getInterpreter();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Interpreter#getExe <em>Exe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exe</em>'.
	 * @see easyflow.core.Interpreter#getExe()
	 * @see #getInterpreter()
	 * @generated
	 */
	EAttribute getInterpreter_Exe();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Interpreter#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.Interpreter#getLogger()
	 * @see #getInterpreter()
	 * @generated
	 */
	EAttribute getInterpreter_Logger();

	/**
	 * Returns the meta object for class '{@link easyflow.core.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see easyflow.core.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Command#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see easyflow.core.Command#getProgramName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_ProgramName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Command#isExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see easyflow.core.Command#isExecutable()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Executable();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Command#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see easyflow.core.Command#getOptions()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Options();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Command#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.Command#getLogger()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Logger();

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
		 * The meta object literal for the '<em><b>Grouping Criteria</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__GROUPING_CRITERIA = eINSTANCE.getTask_GroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FLAGS = eINSTANCE.getTask_Flags();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.ToolImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__LOGGER = eINSTANCE.getTool_Logger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ID = eINSTANCE.getTool_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__VERSION = eINSTANCE.getTool_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__DESCRIPTION = eINSTANCE.getTool_Description();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.DataPortImpl
		 * @see easyflow.core.impl.CorePackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Grouping Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__GROUPING_CRITERIA = eINSTANCE.getDataPort_GroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__CARDINALITY = eINSTANCE.getDataPort_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__DATA_FORMAT = eINSTANCE.getDataPort_DataFormat();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.DataFormatImpl <em>Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.DataFormatImpl
		 * @see easyflow.core.impl.CorePackageImpl#getDataFormat()
		 * @generated
		 */
		EClass DATA_FORMAT = eINSTANCE.getDataFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORMAT__NAME = eINSTANCE.getDataFormat_Name();

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
		 * The meta object literal for the '{@link easyflow.core.IMetaData <em>IMeta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.IMetaData
		 * @see easyflow.core.impl.CorePackageImpl#getIMetaData()
		 * @generated
		 */
		EClass IMETA_DATA = eINSTANCE.getIMetaData();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.DefaultMetaDataImpl <em>Default Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.DefaultMetaDataImpl
		 * @see easyflow.core.impl.CorePackageImpl#getDefaultMetaData()
		 * @generated
		 */
		EClass DEFAULT_META_DATA = eINSTANCE.getDefaultMetaData();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_META_DATA__READER = eINSTANCE.getDefaultMetaData_Reader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_META_DATA__LOGGER = eINSTANCE.getDefaultMetaData_Logger();

		/**
		 * The meta object literal for the '<em><b>Grouping Instances</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__GROUPING_INSTANCES = eINSTANCE.getDefaultMetaData_GroupingInstances();

		/**
		 * The meta object literal for the '<em><b>Grouping Instances By Group</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP = eINSTANCE.getDefaultMetaData_GroupingInstancesByGroup();

		/**
		 * The meta object literal for the '<em><b>Groupings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__GROUPINGS = eINSTANCE.getDefaultMetaData_Groupings();

		/**
		 * The meta object literal for the '{@link easyflow.core.IProjectMetaData <em>IProject Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.IProjectMetaData
		 * @see easyflow.core.impl.CorePackageImpl#getIProjectMetaData()
		 * @generated
		 */
		EClass IPROJECT_META_DATA = eINSTANCE.getIProjectMetaData();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GroupingCriterionImpl <em>Grouping Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GroupingCriterionImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGroupingCriterion()
		 * @generated
		 */
		EClass GROUPING_CRITERION = eINSTANCE.getGroupingCriterion();

		/**
		 * The meta object literal for the '<em><b>Multiple Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__MULTIPLE_INSTANCES = eINSTANCE.getGroupingCriterion_MultipleInstances();

		/**
		 * The meta object literal for the '<em><b>Seperate Input Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__SEPERATE_INPUT_PORTS = eINSTANCE.getGroupingCriterion_SeperateInputPorts();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__LOGGER = eINSTANCE.getGroupingCriterion_Logger();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__ID = eINSTANCE.getGroupingCriterion_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__DESCRIPTION = eINSTANCE.getGroupingCriterion_Description();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_CRITERION__MODE = eINSTANCE.getGroupingCriterion_Mode();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.TraversalCriterionImpl <em>Traversal Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.TraversalCriterionImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTraversalCriterion()
		 * @generated
		 */
		EClass TRAVERSAL_CRITERION = eINSTANCE.getTraversalCriterion();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_CRITERION__OPERATION = eINSTANCE.getTraversalCriterion_Operation();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_CRITERION__CHUNKS = eINSTANCE.getTraversalCriterion_Chunks();

		/**
		 * The meta object literal for the '<em><b>Chunk Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CRITERION__CHUNK_SOURCE = eINSTANCE.getTraversalCriterion_ChunkSource();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToTaskMapImpl <em>String To Task Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToTaskMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToTaskMap()
		 * @generated
		 */
		EClass STRING_TO_TASK_MAP = eINSTANCE.getStringToTaskMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TASK_MAP__KEY = eINSTANCE.getStringToTaskMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TASK_MAP__VALUE = eINSTANCE.getStringToTaskMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.TraversalEventImpl <em>Traversal Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.TraversalEventImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTraversalEvent()
		 * @generated
		 */
		EClass TRAVERSAL_EVENT = eINSTANCE.getTraversalEvent();

		/**
		 * The meta object literal for the '<em><b>Merge Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__MERGE_TASK = eINSTANCE.getTraversalEvent_MergeTask();

		/**
		 * The meta object literal for the '<em><b>Split Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__SPLIT_TASK = eINSTANCE.getTraversalEvent_SplitTask();

		/**
		 * The meta object literal for the '<em><b>Parent Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__PARENT_TASK = eINSTANCE.getTraversalEvent_ParentTask();

		/**
		 * The meta object literal for the '<em><b>Traversal Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSAL_EVENT__TRAVERSAL_CRITERION = eINSTANCE.getTraversalEvent_TraversalCriterion();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__LOGGER = eINSTANCE.getTraversalEvent_Logger();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__META_DATA = eINSTANCE.getTraversalEvent_MetaData();

		/**
		 * The meta object literal for the '<em><b>Parent Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_EVENT__PARENT_CELLS = eINSTANCE.getTraversalEvent_ParentCells();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.TraversalOperationImpl <em>Traversal Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.TraversalOperationImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTraversalOperation()
		 * @generated
		 */
		EClass TRAVERSAL_OPERATION = eINSTANCE.getTraversalOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__NAME = eINSTANCE.getTraversalOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__LOGGER = eINSTANCE.getTraversalOperation_Logger();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_OPERATION__TYPE = eINSTANCE.getTraversalOperation_Type();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.TraversalChunkImpl <em>Traversal Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.TraversalChunkImpl
		 * @see easyflow.core.impl.CorePackageImpl#getTraversalChunk()
		 * @generated
		 */
		EClass TRAVERSAL_CHUNK = eINSTANCE.getTraversalChunk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CHUNK__NAME = eINSTANCE.getTraversalChunk_Name();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVERSAL_CHUNK__LOGGER = eINSTANCE.getTraversalChunk_Logger();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToTraversalEventMapImpl <em>String To Traversal Event Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToTraversalEventMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToTraversalEventMap()
		 * @generated
		 */
		EClass STRING_TO_TRAVERSAL_EVENT_MAP = eINSTANCE.getStringToTraversalEventMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TRAVERSAL_EVENT_MAP__KEY = eINSTANCE.getStringToTraversalEventMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TRAVERSAL_EVENT_MAP__VALUE = eINSTANCE.getStringToTraversalEventMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToGraphCellMapImpl <em>String To Graph Cell Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToGraphCellMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToGraphCellMap()
		 * @generated
		 */
		EClass STRING_TO_GRAPH_CELL_MAP = eINSTANCE.getStringToGraphCellMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GRAPH_CELL_MAP__KEY = eINSTANCE.getStringToGraphCellMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GRAPH_CELL_MAP__VALUE = eINSTANCE.getStringToGraphCellMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToTraversalCriterionMapImpl <em>String To Traversal Criterion Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToTraversalCriterionMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToTraversalCriterionMap()
		 * @generated
		 */
		EClass STRING_TO_TRAVERSAL_CRITERION_MAP = eINSTANCE.getStringToTraversalCriterionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TRAVERSAL_CRITERION_MAP__KEY = eINSTANCE.getStringToTraversalCriterionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TRAVERSAL_CRITERION_MAP__VALUE = eINSTANCE.getStringToTraversalCriterionMap_Value();

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

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToObjectMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToObjectMap()
		 * @generated
		 */
		EClass STRING_TO_OBJECT_MAP = eINSTANCE.getStringToObjectMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_OBJECT_MAP__VALUE = eINSTANCE.getStringToObjectMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToChunksMapImpl <em>String To Chunks Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToChunksMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToChunksMap()
		 * @generated
		 */
		EClass STRING_TO_CHUNKS_MAP = eINSTANCE.getStringToChunksMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CHUNKS_MAP__KEY = eINSTANCE.getStringToChunksMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CHUNKS_MAP__VALUE = eINSTANCE.getStringToChunksMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToChunkMapImpl <em>String To Chunk Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToChunkMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToChunkMap()
		 * @generated
		 */
		EClass STRING_TO_CHUNK_MAP = eINSTANCE.getStringToChunkMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CHUNK_MAP__KEY = eINSTANCE.getStringToChunkMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CHUNK_MAP__VALUE = eINSTANCE.getStringToChunkMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToToolMapImpl <em>String To Tool Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToToolMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToToolMap()
		 * @generated
		 */
		EClass STRING_TO_TOOL_MAP = eINSTANCE.getStringToToolMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TOOL_MAP__KEY = eINSTANCE.getStringToToolMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TOOL_MAP__VALUE = eINSTANCE.getStringToToolMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToStringMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToGroupingMapImpl <em>String To Grouping Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToGroupingMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_MAP = eINSTANCE.getStringToGroupingMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_MAP__KEY = eINSTANCE.getStringToGroupingMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_MAP__VALUE = eINSTANCE.getStringToGroupingMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GroupingImpl <em>Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GroupingImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGrouping()
		 * @generated
		 */
		EClass GROUPING = eINSTANCE.getGrouping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING__NAME = eINSTANCE.getGrouping_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING__DESCRIPTION = eINSTANCE.getGrouping_Description();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GroupingInstanceImpl <em>Grouping Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GroupingInstanceImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGroupingInstance()
		 * @generated
		 */
		EClass GROUPING_INSTANCE = eINSTANCE.getGroupingInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_INSTANCE__NAME = eINSTANCE.getGroupingInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_INSTANCE__FEATURES = eINSTANCE.getGroupingInstance_Features();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GroupingFeatureImpl <em>Grouping Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GroupingFeatureImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGroupingFeature()
		 * @generated
		 */
		EClass GROUPING_FEATURE = eINSTANCE.getGroupingFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_FEATURE__NAME = eINSTANCE.getGroupingFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_FEATURE__VALUE = eINSTANCE.getGroupingFeature_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToGroupingFeatureMapImpl <em>String To Grouping Feature Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToGroupingFeatureMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingFeatureMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_FEATURE_MAP = eINSTANCE.getStringToGroupingFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_FEATURE_MAP__KEY = eINSTANCE.getStringToGroupingFeatureMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_FEATURE_MAP__VALUE = eINSTANCE.getStringToGroupingFeatureMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToGroupingInstanceListMapImpl <em>String To Grouping Instance List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToGroupingInstanceListMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToGroupingInstanceListMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_INSTANCE_LIST_MAP = eINSTANCE.getStringToGroupingInstanceListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_INSTANCE_LIST_MAP__KEY = eINSTANCE.getStringToGroupingInstanceListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_INSTANCE_LIST_MAP__VALUE = eINSTANCE.getStringToGroupingInstanceListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToStringListMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToStringListMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_LIST_MAP = eINSTANCE.getStringToStringListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__KEY = eINSTANCE.getStringToStringListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__VALUE = eINSTANCE.getStringToStringListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToURIMapImpl <em>String To URI Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToURIMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToURIMap()
		 * @generated
		 */
		EClass STRING_TO_URI_MAP = eINSTANCE.getStringToURIMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_URI_MAP__KEY = eINSTANCE.getStringToURIMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_URI_MAP__VALUE = eINSTANCE.getStringToURIMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToSchemaMapImpl <em>String To Schema Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToSchemaMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToSchemaMap()
		 * @generated
		 */
		EClass STRING_TO_SCHEMA_MAP = eINSTANCE.getStringToSchemaMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_SCHEMA_MAP__KEY = eINSTANCE.getStringToSchemaMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_SCHEMA_MAP__VALUE = eINSTANCE.getStringToSchemaMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.GroupingInstanceListImpl <em>Grouping Instance List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.GroupingInstanceListImpl
		 * @see easyflow.core.impl.CorePackageImpl#getGroupingInstanceList()
		 * @generated
		 */
		EClass GROUPING_INSTANCE_LIST = eINSTANCE.getGroupingInstanceList();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_INSTANCE_LIST__INSTANCES = eINSTANCE.getGroupingInstanceList_Instances();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.StringToProjectMapImpl <em>String To Project Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.StringToProjectMapImpl
		 * @see easyflow.core.impl.CorePackageImpl#getStringToProjectMap()
		 * @generated
		 */
		EClass STRING_TO_PROJECT_MAP = eINSTANCE.getStringToProjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PROJECT_MAP__KEY = eINSTANCE.getStringToProjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PROJECT_MAP__VALUE = eINSTANCE.getStringToProjectMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_OBJECT_MAP__KEY = eINSTANCE.getStringToObjectMap_Key();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.InterpreterImpl <em>Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.InterpreterImpl
		 * @see easyflow.core.impl.CorePackageImpl#getInterpreter()
		 * @generated
		 */
		EClass INTERPRETER = eINSTANCE.getInterpreter();

		/**
		 * The meta object literal for the '<em><b>Exe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETER__EXE = eINSTANCE.getInterpreter_Exe();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPRETER__LOGGER = eINSTANCE.getInterpreter_Logger();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.CommandImpl
		 * @see easyflow.core.impl.CorePackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PROGRAM_NAME = eINSTANCE.getCommand_ProgramName();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__EXECUTABLE = eINSTANCE.getCommand_Executable();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__OPTIONS = eINSTANCE.getCommand_Options();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__LOGGER = eINSTANCE.getCommand_Logger();

	}

} //CorePackage
