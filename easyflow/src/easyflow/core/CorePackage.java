/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Generic Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__GENERIC_ATTRIBUTES = 11;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CATALOG = 12;

	/**
	 * The feature id for the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ROOT_TASK = 13;

	/**
	 * The feature id for the '<em><b>Static Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__STATIC_TASKS = 14;

	/**
	 * The feature id for the '<em><b>Processed States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PROCESSED_STATES = 15;

	/**
	 * The feature id for the '<em><b>Previous Task Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PREVIOUS_TASK_NAME = 16;

	/**
	 * The feature id for the '<em><b>Worker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WORKER = 17;

	/**
	 * The feature id for the '<em><b>Execution System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__EXECUTION_SYSTEM = 18;

	/**
	 * The feature id for the '<em><b>Current Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CURRENT_RULE = 19;

	/**
	 * The feature id for the '<em><b>Jgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__JGRAPH = 20;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 21;

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
	 * The feature id for the '<em><b>Jexl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__JEXL_STRING = 3;

	/**
	 * The feature id for the '<em><b>Util</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UTIL = 4;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOGGER = 5;

	/**
	 * The feature id for the '<em><b>Traversal Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRAVERSAL_EVENTS = 6;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENTS = 7;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHUNKS = 8;

	/**
	 * The feature id for the '<em><b>Tool Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOL_NAMES = 9;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOLS = 10;

	/**
	 * The feature id for the '<em><b>Tool Matches</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TOOL_MATCHES = 11;

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
	 * The feature id for the '<em><b>Inputs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = 16;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = 17;

	/**
	 * The feature id for the '<em><b>Inputs By Data Port</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS_BY_DATA_PORT = 18;

	/**
	 * The feature id for the '<em><b>Outputs By Data Port</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS_BY_DATA_PORT = 19;

	/**
	 * The feature id for the '<em><b>Input Data Port Validator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT_DATA_PORT_VALIDATOR = 20;

	/**
	 * The feature id for the '<em><b>Output Data Port Validator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUT_DATA_PORT_VALIDATOR = 21;

	/**
	 * The feature id for the '<em><b>Analysis Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ANALYSIS_TYPES = 22;

	/**
	 * The feature id for the '<em><b>Circumventing Parents</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CIRCUMVENTING_PARENTS = 23;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RECORDS = 24;

	/**
	 * The feature id for the '<em><b>Preprocessing Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREPROCESSING_TASKS = 25;

	/**
	 * The feature id for the '<em><b>Resolved Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESOLVED_COMMAND = 26;

	/**
	 * The feature id for the '<em><b>Unresolved Out Data Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UNRESOLVED_OUT_DATA_PORTS = 27;

	/**
	 * The feature id for the '<em><b>Params</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARAMS = 28;

	/**
	 * The feature id for the '<em><b>Static Params</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATIC_PARAMS = 29;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RULE = 30;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.PreprocessingTaskImpl <em>Preprocessing Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.PreprocessingTaskImpl
	 * @see easyflow.core.impl.CorePackageImpl#getPreprocessingTask()
	 * @generated
	 */
	int PREPROCESSING_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK__TASK = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Data Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK__DATA_PORT_INDEX = 3;

	/**
	 * The number of structural features of the '<em>Preprocessing Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.ToolMatchImpl <em>Tool Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.ToolMatchImpl
	 * @see easyflow.core.impl.CorePackageImpl#getToolMatch()
	 * @generated
	 */
	int TOOL_MATCH = 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__LOGGER = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__TASK = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__TOOL = 2;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__SCORE = 3;

	/**
	 * The feature id for the '<em><b>Expected Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__EXPECTED_SCORE = 4;

	/**
	 * The feature id for the '<em><b>Expected Tool Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__EXPECTED_TOOL_SCORE = 5;

	/**
	 * The feature id for the '<em><b>Missing In Data Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__MISSING_IN_DATA_PORTS = 6;

	/**
	 * The feature id for the '<em><b>Missing Out Data Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__MISSING_OUT_DATA_PORTS = 7;

	/**
	 * The feature id for the '<em><b>Missing Grouping Criteria</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__MISSING_GROUPING_CRITERIA = 8;

	/**
	 * The feature id for the '<em><b>Reverse Missing In Data Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS = 9;

	/**
	 * The feature id for the '<em><b>Reverse Missing Out Data Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS = 10;

	/**
	 * The feature id for the '<em><b>Reverse Missing Grouping Criteria</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA = 11;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH__VALID = 12;

	/**
	 * The number of structural features of the '<em>Tool Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.IWorkflowTemplate
	 * @see easyflow.core.impl.CorePackageImpl#getIWorkflowTemplate()
	 * @generated
	 */
	int IWORKFLOW_TEMPLATE = 4;

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
	int DEFAULT_WORKFLOW_TEMPLATE = 5;

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
	int EASYFLOW_TEMPLATE = 6;

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
	int ITASK_READER = 7;

	/**
	 * The number of structural features of the '<em>ITask Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_READER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.GalaxyTaskReaderImpl <em>Galaxy Task Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.GalaxyTaskReaderImpl
	 * @see easyflow.core.impl.CorePackageImpl#getGalaxyTaskReader()
	 * @generated
	 */
	int GALAXY_TASK_READER = 8;

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
	int DEFAULT_RECORD = 9;

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
	 * The meta object id for the '{@link easyflow.core.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.CatalogImpl
	 * @see easyflow.core.impl.CorePackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 10;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.ParentTaskResultImpl <em>Parent Task Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.ParentTaskResultImpl
	 * @see easyflow.core.impl.CorePackageImpl#getParentTaskResult()
	 * @generated
	 */
	int PARENT_TASK_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Parent Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__PARENT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Covered Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__COVERED_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__GENERIC = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__RANK = 4;

	/**
	 * The feature id for the '<em><b>Potential Circumventing Tasks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT__POTENTIAL_CIRCUMVENTING_TASKS = 5;

	/**
	 * The number of structural features of the '<em>Parent Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link easyflow.core.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.ConditionImpl
	 * @see easyflow.core.impl.CorePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FORBIDDEN = 0;

	/**
	 * The feature id for the '<em><b>Circumventing Parents</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CIRCUMVENTING_PARENTS = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link easyflow.core.impl.ErrorControlImpl <em>Error Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.impl.ErrorControlImpl
	 * @see easyflow.core.impl.CorePackageImpl#getErrorControl()
	 * @generated
	 */
	int ERROR_CONTROL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Resolve Error Tipp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__RESOLVE_ERROR_TIPP = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__SEVERITY = 4;

	/**
	 * The feature id for the '<em><b>Val Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__VAL_NUM = 5;

	/**
	 * The feature id for the '<em><b>Vals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL__VALS = 6;

	/**
	 * The number of structural features of the '<em>Error Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link easyflow.core.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.Severity
	 * @see easyflow.core.impl.CorePackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 14;

	/**
	 * The meta object id for the '{@link easyflow.core.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.core.Category
	 * @see easyflow.core.impl.CorePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 15;


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
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalog</em>'.
	 * @see easyflow.core.Workflow#getCatalog()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Catalog();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getRootTask <em>Root Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Task</em>'.
	 * @see easyflow.core.Workflow#getRootTask()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_RootTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Workflow#getStaticTasks <em>Static Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Static Tasks</em>'.
	 * @see easyflow.core.Workflow#getStaticTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_StaticTasks();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Workflow#getProcessedStates <em>Processed States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Processed States</em>'.
	 * @see easyflow.core.Workflow#getProcessedStates()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ProcessedStates();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Workflow#getPreviousTaskName <em>Previous Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Previous Task Name</em>'.
	 * @see easyflow.core.Workflow#getPreviousTaskName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_PreviousTaskName();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.Workflow#getWorker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker</em>'.
	 * @see easyflow.core.Workflow#getWorker()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Worker();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getExecutionSystem <em>Execution System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution System</em>'.
	 * @see easyflow.core.Workflow#getExecutionSystem()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ExecutionSystem();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getCurrentRule <em>Current Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Rule</em>'.
	 * @see easyflow.core.Workflow#getCurrentRule()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_CurrentRule();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getJgraph <em>Jgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jgraph</em>'.
	 * @see easyflow.core.Workflow#getJgraph()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Jgraph();

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
	 * Returns the meta object for the attribute '{@link easyflow.core.Task#getJexlString <em>Jexl String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jexl String</em>'.
	 * @see easyflow.core.Task#getJexlString()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_JexlString();

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
	 * Returns the meta object for the map '{@link easyflow.core.Task#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parents</em>'.
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
	 * Returns the meta object for the map '{@link easyflow.core.Task#getToolMatches <em>Tool Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tool Matches</em>'.
	 * @see easyflow.core.Task#getToolMatches()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ToolMatches();

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
	 * Returns the meta object for the map '{@link easyflow.core.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Inputs</em>'.
	 * @see easyflow.core.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Outputs</em>'.
	 * @see easyflow.core.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getInputsByDataPort <em>Inputs By Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Inputs By Data Port</em>'.
	 * @see easyflow.core.Task#getInputsByDataPort()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputsByDataPort();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getOutputsByDataPort <em>Outputs By Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Outputs By Data Port</em>'.
	 * @see easyflow.core.Task#getOutputsByDataPort()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OutputsByDataPort();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Task#getInputDataPortValidator <em>Input Data Port Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Data Port Validator</em>'.
	 * @see easyflow.core.Task#getInputDataPortValidator()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_InputDataPortValidator();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Task#getOutputDataPortValidator <em>Output Data Port Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Data Port Validator</em>'.
	 * @see easyflow.core.Task#getOutputDataPortValidator()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_OutputDataPortValidator();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Task#getAnalysisTypes <em>Analysis Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Analysis Types</em>'.
	 * @see easyflow.core.Task#getAnalysisTypes()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_AnalysisTypes();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Task#getCircumventingParents <em>Circumventing Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Circumventing Parents</em>'.
	 * @see easyflow.core.Task#getCircumventingParents()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_CircumventingParents();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see easyflow.core.Task#getRecords()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Records();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getPreprocessingTasks <em>Preprocessing Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preprocessing Tasks</em>'.
	 * @see easyflow.core.Task#getPreprocessingTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreprocessingTasks();

	/**
	 * Returns the meta object for the containment reference '{@link easyflow.core.Task#getResolvedCommand <em>Resolved Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolved Command</em>'.
	 * @see easyflow.core.Task#getResolvedCommand()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ResolvedCommand();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.Task#getUnresolvedOutDataPorts <em>Unresolved Out Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unresolved Out Data Ports</em>'.
	 * @see easyflow.core.Task#getUnresolvedOutDataPorts()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_UnresolvedOutDataPorts();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Params</em>'.
	 * @see easyflow.core.Task#getParams()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Params();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Task#getStaticParams <em>Static Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Static Params</em>'.
	 * @see easyflow.core.Task#getStaticParams()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StaticParams();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.Task#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see easyflow.core.Task#getRule()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Rule();

	/**
	 * Returns the meta object for class '{@link easyflow.core.PreprocessingTask <em>Preprocessing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessing Task</em>'.
	 * @see easyflow.core.PreprocessingTask
	 * @generated
	 */
	EClass getPreprocessingTask();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.PreprocessingTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.PreprocessingTask#getName()
	 * @see #getPreprocessingTask()
	 * @generated
	 */
	EAttribute getPreprocessingTask_Name();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.PreprocessingTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see easyflow.core.PreprocessingTask#getTask()
	 * @see #getPreprocessingTask()
	 * @generated
	 */
	EReference getPreprocessingTask_Task();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.PreprocessingTask#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see easyflow.core.PreprocessingTask#getExpression()
	 * @see #getPreprocessingTask()
	 * @generated
	 */
	EAttribute getPreprocessingTask_Expression();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.PreprocessingTask#getDataPortIndex <em>Data Port Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Port Index</em>'.
	 * @see easyflow.core.PreprocessingTask#getDataPortIndex()
	 * @see #getPreprocessingTask()
	 * @generated
	 */
	EAttribute getPreprocessingTask_DataPortIndex();

	/**
	 * Returns the meta object for class '{@link easyflow.core.ToolMatch <em>Tool Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Match</em>'.
	 * @see easyflow.core.ToolMatch
	 * @generated
	 */
	EClass getToolMatch();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ToolMatch#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.core.ToolMatch#getLogger()
	 * @see #getToolMatch()
	 * @generated
	 */
	EAttribute getToolMatch_Logger();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.ToolMatch#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see easyflow.core.ToolMatch#getTask()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_Task();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.ToolMatch#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see easyflow.core.ToolMatch#getTool()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_Tool();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ToolMatch#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see easyflow.core.ToolMatch#getScore()
	 * @see #getToolMatch()
	 * @generated
	 */
	EAttribute getToolMatch_Score();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ToolMatch#getExpectedScore <em>Expected Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Score</em>'.
	 * @see easyflow.core.ToolMatch#getExpectedScore()
	 * @see #getToolMatch()
	 * @generated
	 */
	EAttribute getToolMatch_ExpectedScore();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ToolMatch#getExpectedToolScore <em>Expected Tool Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Tool Score</em>'.
	 * @see easyflow.core.ToolMatch#getExpectedToolScore()
	 * @see #getToolMatch()
	 * @generated
	 */
	EAttribute getToolMatch_ExpectedToolScore();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.core.ToolMatch#getMissingInDataPorts <em>Missing In Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missing In Data Ports</em>'.
	 * @see easyflow.core.ToolMatch#getMissingInDataPorts()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_MissingInDataPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.core.ToolMatch#getMissingOutDataPorts <em>Missing Out Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Missing Out Data Ports</em>'.
	 * @see easyflow.core.ToolMatch#getMissingOutDataPorts()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_MissingOutDataPorts();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.ToolMatch#getMissingGroupingCriteria <em>Missing Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Missing Grouping Criteria</em>'.
	 * @see easyflow.core.ToolMatch#getMissingGroupingCriteria()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_MissingGroupingCriteria();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.core.ToolMatch#getReverseMissingInDataPorts <em>Reverse Missing In Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reverse Missing In Data Ports</em>'.
	 * @see easyflow.core.ToolMatch#getReverseMissingInDataPorts()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_ReverseMissingInDataPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link easyflow.core.ToolMatch#getReverseMissingOutDataPorts <em>Reverse Missing Out Data Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reverse Missing Out Data Ports</em>'.
	 * @see easyflow.core.ToolMatch#getReverseMissingOutDataPorts()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_ReverseMissingOutDataPorts();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.ToolMatch#getReverseMissingGroupingCriteria <em>Reverse Missing Grouping Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Reverse Missing Grouping Criteria</em>'.
	 * @see easyflow.core.ToolMatch#getReverseMissingGroupingCriteria()
	 * @see #getToolMatch()
	 * @generated
	 */
	EReference getToolMatch_ReverseMissingGroupingCriteria();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ToolMatch#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see easyflow.core.ToolMatch#isValid()
	 * @see #getToolMatch()
	 * @generated
	 */
	EAttribute getToolMatch_Valid();

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
	 * Returns the meta object for class '{@link easyflow.core.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see easyflow.core.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the map '{@link easyflow.core.Catalog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see easyflow.core.Catalog#getEntries()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Entries();

	/**
	 * Returns the meta object for class '{@link easyflow.core.ParentTaskResult <em>Parent Task Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Task Result</em>'.
	 * @see easyflow.core.ParentTaskResult
	 * @generated
	 */
	EClass getParentTaskResult();

	/**
	 * Returns the meta object for the reference '{@link easyflow.core.ParentTaskResult#getParentTask <em>Parent Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Task</em>'.
	 * @see easyflow.core.ParentTaskResult#getParentTask()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EReference getParentTaskResult_ParentTask();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.core.ParentTaskResult#getCoveredPorts <em>Covered Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered Ports</em>'.
	 * @see easyflow.core.ParentTaskResult#getCoveredPorts()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EReference getParentTaskResult_CoveredPorts();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ParentTaskResult#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see easyflow.core.ParentTaskResult#getCondition()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EAttribute getParentTaskResult_Condition();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ParentTaskResult#isGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic</em>'.
	 * @see easyflow.core.ParentTaskResult#isGeneric()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EAttribute getParentTaskResult_Generic();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ParentTaskResult#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see easyflow.core.ParentTaskResult#getRank()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EAttribute getParentTaskResult_Rank();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.ParentTaskResult#getPotentialCircumventingTasks <em>Potential Circumventing Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Potential Circumventing Tasks</em>'.
	 * @see easyflow.core.ParentTaskResult#getPotentialCircumventingTasks()
	 * @see #getParentTaskResult()
	 * @generated
	 */
	EAttribute getParentTaskResult_PotentialCircumventingTasks();

	/**
	 * Returns the meta object for class '{@link easyflow.core.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see easyflow.core.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Condition#getForbidden <em>Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Forbidden</em>'.
	 * @see easyflow.core.Condition#getForbidden()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Forbidden();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.Condition#getCircumventingParents <em>Circumventing Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Circumventing Parents</em>'.
	 * @see easyflow.core.Condition#getCircumventingParents()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_CircumventingParents();

	/**
	 * Returns the meta object for class '{@link easyflow.core.ErrorControl <em>Error Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Control</em>'.
	 * @see easyflow.core.ErrorControl
	 * @generated
	 */
	EClass getErrorControl();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.core.ErrorControl#getName()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.core.ErrorControl#getDescription()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_Description();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getResolveErrorTipp <em>Resolve Error Tipp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Error Tipp</em>'.
	 * @see easyflow.core.ErrorControl#getResolveErrorTipp()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_ResolveErrorTipp();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see easyflow.core.ErrorControl#getCategory()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_Category();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see easyflow.core.ErrorControl#getSeverity()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_Severity();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.core.ErrorControl#getValNum <em>Val Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Num</em>'.
	 * @see easyflow.core.ErrorControl#getValNum()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_ValNum();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.core.ErrorControl#getVals <em>Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vals</em>'.
	 * @see easyflow.core.ErrorControl#getVals()
	 * @see #getErrorControl()
	 * @generated
	 */
	EAttribute getErrorControl_Vals();

	/**
	 * Returns the meta object for enum '{@link easyflow.core.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see easyflow.core.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link easyflow.core.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see easyflow.core.Category
	 * @generated
	 */
	EEnum getCategory();

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
		 * The meta object literal for the '<em><b>Generic Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__GENERIC_ATTRIBUTES = eINSTANCE.getWorkflow_GenericAttributes();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CATALOG = eINSTANCE.getWorkflow_Catalog();

		/**
		 * The meta object literal for the '<em><b>Root Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ROOT_TASK = eINSTANCE.getWorkflow_RootTask();

		/**
		 * The meta object literal for the '<em><b>Static Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__STATIC_TASKS = eINSTANCE.getWorkflow_StaticTasks();

		/**
		 * The meta object literal for the '<em><b>Processed States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PROCESSED_STATES = eINSTANCE.getWorkflow_ProcessedStates();

		/**
		 * The meta object literal for the '<em><b>Previous Task Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PREVIOUS_TASK_NAME = eINSTANCE.getWorkflow_PreviousTaskName();

		/**
		 * The meta object literal for the '<em><b>Worker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__WORKER = eINSTANCE.getWorkflow_Worker();

		/**
		 * The meta object literal for the '<em><b>Execution System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__EXECUTION_SYSTEM = eINSTANCE.getWorkflow_ExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Current Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CURRENT_RULE = eINSTANCE.getWorkflow_CurrentRule();

		/**
		 * The meta object literal for the '<em><b>Jgraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__JGRAPH = eINSTANCE.getWorkflow_Jgraph();

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
		 * The meta object literal for the '<em><b>Jexl String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__JEXL_STRING = eINSTANCE.getTask_JexlString();

		/**
		 * The meta object literal for the '<em><b>Util</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__UTIL = eINSTANCE.getTask_Util();

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
		 * The meta object literal for the '<em><b>Parents</b></em>' map feature.
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
		 * The meta object literal for the '<em><b>Tool Matches</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TOOL_MATCHES = eINSTANCE.getTask_ToolMatches();

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
		 * The meta object literal for the '<em><b>Inputs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs By Data Port</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS_BY_DATA_PORT = eINSTANCE.getTask_InputsByDataPort();

		/**
		 * The meta object literal for the '<em><b>Outputs By Data Port</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS_BY_DATA_PORT = eINSTANCE.getTask_OutputsByDataPort();

		/**
		 * The meta object literal for the '<em><b>Input Data Port Validator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__INPUT_DATA_PORT_VALIDATOR = eINSTANCE.getTask_InputDataPortValidator();

		/**
		 * The meta object literal for the '<em><b>Output Data Port Validator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__OUTPUT_DATA_PORT_VALIDATOR = eINSTANCE.getTask_OutputDataPortValidator();

		/**
		 * The meta object literal for the '<em><b>Analysis Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ANALYSIS_TYPES = eINSTANCE.getTask_AnalysisTypes();

		/**
		 * The meta object literal for the '<em><b>Circumventing Parents</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CIRCUMVENTING_PARENTS = eINSTANCE.getTask_CircumventingParents();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RECORDS = eINSTANCE.getTask_Records();

		/**
		 * The meta object literal for the '<em><b>Preprocessing Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREPROCESSING_TASKS = eINSTANCE.getTask_PreprocessingTasks();

		/**
		 * The meta object literal for the '<em><b>Resolved Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RESOLVED_COMMAND = eINSTANCE.getTask_ResolvedCommand();

		/**
		 * The meta object literal for the '<em><b>Unresolved Out Data Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__UNRESOLVED_OUT_DATA_PORTS = eINSTANCE.getTask_UnresolvedOutDataPorts();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARAMS = eINSTANCE.getTask_Params();

		/**
		 * The meta object literal for the '<em><b>Static Params</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STATIC_PARAMS = eINSTANCE.getTask_StaticParams();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RULE = eINSTANCE.getTask_Rule();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.PreprocessingTaskImpl <em>Preprocessing Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.PreprocessingTaskImpl
		 * @see easyflow.core.impl.CorePackageImpl#getPreprocessingTask()
		 * @generated
		 */
		EClass PREPROCESSING_TASK = eINSTANCE.getPreprocessingTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESSING_TASK__NAME = eINSTANCE.getPreprocessingTask_Name();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPROCESSING_TASK__TASK = eINSTANCE.getPreprocessingTask_Task();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESSING_TASK__EXPRESSION = eINSTANCE.getPreprocessingTask_Expression();

		/**
		 * The meta object literal for the '<em><b>Data Port Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESSING_TASK__DATA_PORT_INDEX = eINSTANCE.getPreprocessingTask_DataPortIndex();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.ToolMatchImpl <em>Tool Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.ToolMatchImpl
		 * @see easyflow.core.impl.CorePackageImpl#getToolMatch()
		 * @generated
		 */
		EClass TOOL_MATCH = eINSTANCE.getToolMatch();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_MATCH__LOGGER = eINSTANCE.getToolMatch_Logger();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__TASK = eINSTANCE.getToolMatch_Task();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__TOOL = eINSTANCE.getToolMatch_Tool();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_MATCH__SCORE = eINSTANCE.getToolMatch_Score();

		/**
		 * The meta object literal for the '<em><b>Expected Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_MATCH__EXPECTED_SCORE = eINSTANCE.getToolMatch_ExpectedScore();

		/**
		 * The meta object literal for the '<em><b>Expected Tool Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_MATCH__EXPECTED_TOOL_SCORE = eINSTANCE.getToolMatch_ExpectedToolScore();

		/**
		 * The meta object literal for the '<em><b>Missing In Data Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__MISSING_IN_DATA_PORTS = eINSTANCE.getToolMatch_MissingInDataPorts();

		/**
		 * The meta object literal for the '<em><b>Missing Out Data Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__MISSING_OUT_DATA_PORTS = eINSTANCE.getToolMatch_MissingOutDataPorts();

		/**
		 * The meta object literal for the '<em><b>Missing Grouping Criteria</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__MISSING_GROUPING_CRITERIA = eINSTANCE.getToolMatch_MissingGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Reverse Missing In Data Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS = eINSTANCE.getToolMatch_ReverseMissingInDataPorts();

		/**
		 * The meta object literal for the '<em><b>Reverse Missing Out Data Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS = eINSTANCE.getToolMatch_ReverseMissingOutDataPorts();

		/**
		 * The meta object literal for the '<em><b>Reverse Missing Grouping Criteria</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA = eINSTANCE.getToolMatch_ReverseMissingGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_MATCH__VALID = eINSTANCE.getToolMatch_Valid();

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

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.CatalogImpl
		 * @see easyflow.core.impl.CorePackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__ENTRIES = eINSTANCE.getCatalog_Entries();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.ParentTaskResultImpl <em>Parent Task Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.ParentTaskResultImpl
		 * @see easyflow.core.impl.CorePackageImpl#getParentTaskResult()
		 * @generated
		 */
		EClass PARENT_TASK_RESULT = eINSTANCE.getParentTaskResult();

		/**
		 * The meta object literal for the '<em><b>Parent Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_TASK_RESULT__PARENT_TASK = eINSTANCE.getParentTaskResult_ParentTask();

		/**
		 * The meta object literal for the '<em><b>Covered Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_TASK_RESULT__COVERED_PORTS = eINSTANCE.getParentTaskResult_CoveredPorts();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_TASK_RESULT__CONDITION = eINSTANCE.getParentTaskResult_Condition();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_TASK_RESULT__GENERIC = eINSTANCE.getParentTaskResult_Generic();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_TASK_RESULT__RANK = eINSTANCE.getParentTaskResult_Rank();

		/**
		 * The meta object literal for the '<em><b>Potential Circumventing Tasks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT_TASK_RESULT__POTENTIAL_CIRCUMVENTING_TASKS = eINSTANCE.getParentTaskResult_PotentialCircumventingTasks();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.ConditionImpl
		 * @see easyflow.core.impl.CorePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Forbidden</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__FORBIDDEN = eINSTANCE.getCondition_Forbidden();

		/**
		 * The meta object literal for the '<em><b>Circumventing Parents</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CIRCUMVENTING_PARENTS = eINSTANCE.getCondition_CircumventingParents();

		/**
		 * The meta object literal for the '{@link easyflow.core.impl.ErrorControlImpl <em>Error Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.impl.ErrorControlImpl
		 * @see easyflow.core.impl.CorePackageImpl#getErrorControl()
		 * @generated
		 */
		EClass ERROR_CONTROL = eINSTANCE.getErrorControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__NAME = eINSTANCE.getErrorControl_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__DESCRIPTION = eINSTANCE.getErrorControl_Description();

		/**
		 * The meta object literal for the '<em><b>Resolve Error Tipp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__RESOLVE_ERROR_TIPP = eINSTANCE.getErrorControl_ResolveErrorTipp();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__CATEGORY = eINSTANCE.getErrorControl_Category();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__SEVERITY = eINSTANCE.getErrorControl_Severity();

		/**
		 * The meta object literal for the '<em><b>Val Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__VAL_NUM = eINSTANCE.getErrorControl_ValNum();

		/**
		 * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CONTROL__VALS = eINSTANCE.getErrorControl_Vals();

		/**
		 * The meta object literal for the '{@link easyflow.core.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.Severity
		 * @see easyflow.core.impl.CorePackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link easyflow.core.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.core.Category
		 * @see easyflow.core.impl.CorePackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

	}

} //CorePackage
