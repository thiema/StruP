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
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Error Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ERROR_CONTROL = 21;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 22;

	/**
	 * The operation id for the '<em>Generate Graph From Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GENERATE_GRAPH_FROM_TEMPLATE__EMAP = 0;

	/**
	 * The operation id for the '<em>Get Parent Task By Out Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT_TASK = 1;

	/**
	 * The operation id for the '<em>Get Parent Tasks By Out Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_PARENT_TASKS_BY_OUT_DATA_PORT__DATAPORT = 2;

	/**
	 * The operation id for the '<em>Validate Parent Task Out Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___VALIDATE_PARENT_TASK_OUT_DATA_PORT__DATAPORT_TASK = 3;

	/**
	 * The operation id for the '<em>Validate Last Task Out Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___VALIDATE_LAST_TASK_OUT_DATA_PORT__DATAPORT = 4;

	/**
	 * The operation id for the '<em>Read Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___READ_META_DATA = 5;

	/**
	 * The operation id for the '<em>Get Parent Tasks For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_PARENT_TASKS_FOR__TASK = 6;

	/**
	 * The operation id for the '<em>Resolve Missing Data Ports By Tool For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESOLVE_MISSING_DATA_PORTS_BY_TOOL_FOR__TASK = 7;

	/**
	 * The operation id for the '<em>Read Workfow Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___READ_WORKFOW_TEMPLATE = 8;

	/**
	 * The operation id for the '<em>Generate Abstract Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GENERATE_ABSTRACT_WORKFLOW = 9;

	/**
	 * The operation id for the '<em>Apply Grouping Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___APPLY_GROUPING_CRITERIA = 10;

	/**
	 * The operation id for the '<em>Apply Parameter Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___APPLY_PARAMETER_CRITERIA = 11;

	/**
	 * The operation id for the '<em>Apply Traversal Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___APPLY_TRAVERSAL_EVENT__TRAVERSALEVENT = 12;

	/**
	 * The operation id for the '<em>Resolve Traversal Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESOLVE_TRAVERSAL_EVENTS = 13;

	/**
	 * The operation id for the '<em>Resolve Incompatible Groupings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESOLVE_INCOMPATIBLE_GROUPINGS = 14;

	/**
	 * The operation id for the '<em>Resolve Preprocessing Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESOLVE_PREPROCESSING_TASKS = 15;

	/**
	 * The operation id for the '<em>Resolve Tool Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESOLVE_TOOL_DEPENDENCIES = 16;

	/**
	 * The operation id for the '<em>Generate Worklow For Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM = 17;

	/**
	 * The operation id for the '<em>Run Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RUN_NEXT_WORKFLOW_STEP = 18;

	/**
	 * The operation id for the '<em>Run Prev Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RUN_PREV_WORKFLOW_STEP = 19;

	/**
	 * The operation id for the '<em>Run Entire Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RUN_ENTIRE_WORKFLOW = 20;

	/**
	 * The operation id for the '<em>Has Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___HAS_NEXT_WORKFLOW_STEP = 21;

	/**
	 * The operation id for the '<em>Get Total Number Of Workflow Steps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS = 22;

	/**
	 * The operation id for the '<em>Get Workflow Step Label For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_WORKFLOW_STEP_LABEL_FOR__STRING = 23;

	/**
	 * The operation id for the '<em>Get Workflow Step Desc For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_WORKFLOW_STEP_DESC_FOR__STRING = 24;

	/**
	 * The operation id for the '<em>Get Number Of Current Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP = 25;

	/**
	 * The operation id for the '<em>Get Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_NEXT_WORKFLOW_STEP = 26;

	/**
	 * The operation id for the '<em>Get Cur Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___GET_CUR_WORKFLOW_STEP = 27;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___DELETE = 28;

	/**
	 * The operation id for the '<em>Reset Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RESET_WORKFLOW_STEP = 29;

	/**
	 * The operation id for the '<em>Print Workflow Step Msg On Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_START__STRING = 30;

	/**
	 * The operation id for the '<em>Print Workflow Step Msg On End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_END__BOOLEAN_STRING = 31;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___INIT = 32;

	/**
	 * The operation id for the '<em>Render To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RENDER_TO_STRING = 33;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 34;

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
	 * The operation id for the '<em>Read Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___READ_TASK__STRING_STRING_ELIST = 0;

	/**
	 * The operation id for the '<em>Shall Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SHALL_PROCESS__ELIST_STRING = 1;

	/**
	 * The operation id for the '<em>Shall Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SHALL_PROCESS__ELIST_STRING_ELIST_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Parse Data Format Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___PARSE_DATA_FORMAT_FIELD__STRING_ELIST = 3;

	/**
	 * The operation id for the '<em>Get Unique String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_UNIQUE_STRING = 4;

	/**
	 * The operation id for the '<em>Get Unique URI String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_UNIQUE_URI_STRING = 5;

	/**
	 * The operation id for the '<em>Is Compatible With Out Data Port For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_COMPATIBLE_WITH_OUT_DATA_PORT_FOR__DATAPORT = 6;

	/**
	 * The operation id for the '<em>Is Compatible With In Data Port For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_COMPATIBLE_WITH_IN_DATA_PORT_FOR__DATAPORT = 7;

	/**
	 * The operation id for the '<em>Get Parent Task By Out Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT = 8;

	/**
	 * The operation id for the '<em>Get Non Overalpping Traversal Chunks For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_NON_OVERALPPING_TRAVERSAL_CHUNKS_FOR__TASK = 9;

	/**
	 * The operation id for the '<em>Read Tools</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___READ_TOOLS__ELIST = 10;

	/**
	 * The operation id for the '<em>Get Preferred Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PREFERRED_TOOL = 11;

	/**
	 * The operation id for the '<em>Get Overlapping Data Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_OVERLAPPING_DATA_PORTS__ELIST_ELIST = 12;

	/**
	 * The operation id for the '<em>Resolve Command Line Part Interpreter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_COMMAND_LINE_PART_INTERPRETER = 13;

	/**
	 * The operation id for the '<em>Resolve Command Line Part Exe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_COMMAND_LINE_PART_EXE = 14;

	/**
	 * The operation id for the '<em>Resolve Command Line Part Analysis Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_COMMAND_LINE_PART_ANALYSIS_TYPE = 15;

	/**
	 * The operation id for the '<em>Resolve Command Line Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_COMMAND_LINE_PART__STRING_BOOLEAN_BOOLEAN = 16;

	/**
	 * The operation id for the '<em>Get Command Line Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_COMMAND_LINE_PATTERN = 17;

	/**
	 * The operation id for the '<em>Validate Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___VALIDATE_TOOL__TOOL = 18;

	/**
	 * The operation id for the '<em>Validate Tools</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___VALIDATE_TOOLS = 19;

	/**
	 * The operation id for the '<em>Get Data Port By Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DATA_PORT_BY_DATA_PORT__DATAPORT_BOOLEAN = 20;

	/**
	 * The operation id for the '<em>Get Data Port By Name Of Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DATA_PORT_BY_NAME_OF_FORMAT__STRING_BOOLEAN = 21;

	/**
	 * The operation id for the '<em>Get Data Port By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DATA_PORT_BY_NAME__STRING_BOOLEAN = 22;

	/**
	 * The operation id for the '<em>Resolve Missing Data Ports By Tool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_MISSING_DATA_PORTS_BY_TOOL__ELIST = 23;

	/**
	 * The operation id for the '<em>Get Overlapping Chunks For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_OVERLAPPING_CHUNKS_FOR__TASK_STRING = 24;

	/**
	 * The operation id for the '<em>Get Required Groupings For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_REQUIRED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN = 25;

	/**
	 * The operation id for the '<em>Get Provided Groupings For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PROVIDED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN = 26;

	/**
	 * The operation id for the '<em>Can Provide Multiple Groupings For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROVIDE_MULTIPLE_GROUPINGS_FOR__TOOL_DATAPORT = 27;

	/**
	 * The operation id for the '<em>Can Provide Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = 28;

	/**
	 * The operation id for the '<em>Can Provide Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = 29;

	/**
	 * The operation id for the '<em>Can Provide Multiple Instances Per Input For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = 30;

	/**
	 * The operation id for the '<em>Can Process Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = 31;

	/**
	 * The operation id for the '<em>Can Process Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = 32;

	/**
	 * The operation id for the '<em>Can Process Multiple Instances Per Input For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = 33;

	/**
	 * The operation id for the '<em>Set Process Multiple Instances Per Input For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = 34;

	/**
	 * The operation id for the '<em>Set Process Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = 35;

	/**
	 * The operation id for the '<em>Set Process Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = 36;

	/**
	 * The operation id for the '<em>Set Provide Multiple Instances Per Input For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = 37;

	/**
	 * The operation id for the '<em>Set Provide Multiple Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = 38;

	/**
	 * The operation id for the '<em>Set Provide Multiple Inputs For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = 39;

	/**
	 * The operation id for the '<em>Can Filter Instances For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_FILTER_INSTANCES_FOR__TOOL_DATAPORT = 40;

	/**
	 * The operation id for the '<em>Get Records</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_RECORDS__BOOLEAN = 41;

	/**
	 * The operation id for the '<em>Get Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_INPUTS__BOOLEAN = 42;

	/**
	 * The operation id for the '<em>Get Overlapping Records Provided By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_OVERLAPPING_RECORDS_PROVIDED_BY__TASK = 43;

	/**
	 * The operation id for the '<em>Can Provide Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PROVIDE_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN = 44;

	/**
	 * The operation id for the '<em>Can Comsume Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_COMSUME_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN = 45;

	/**
	 * The operation id for the '<em>Get Outputs For Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_OUTPUTS_FOR_DATA_PORT__DATAPORT = 46;

	/**
	 * The operation id for the '<em>Get Inputs For Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_INPUTS_FOR_DATA_PORT__DATAPORT = 47;

	/**
	 * The operation id for the '<em>Resolve Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_PARAMS = 48;

	/**
	 * The operation id for the '<em>Is Identity Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_IDENTITY_TRANSFORMATION = 49;

	/**
	 * The operation id for the '<em>Is Identity Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_IDENTITY_TRANSFORMATION__DATAPORT = 50;

	/**
	 * The operation id for the '<em>Resolve Conditional Static Param</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_CONDITIONAL_STATIC_PARAM__RESOLVEDPARAM = 51;

	/**
	 * The operation id for the '<em>Read From Pipe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___READ_FROM_PIPE = 52;

	/**
	 * The operation id for the '<em>Write To Pipe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___WRITE_TO_PIPE = 53;

	/**
	 * The operation id for the '<em>Create Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CREATE_RULE = 54;

	/**
	 * The operation id for the '<em>Retrieve Data Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RETRIEVE_DATA_PORT__BOOLEAN_INT = 55;

	/**
	 * The operation id for the '<em>Resolve Data Port Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_DATA_PORT_PARAMS__EMAP_TOOL_BOOLEAN = 56;

	/**
	 * The operation id for the '<em>Resolve Static Params</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RESOLVE_STATIC_PARAMS__EMAP = 57;

	/**
	 * The operation id for the '<em>Get Detailed String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DETAILED_STRING = 58;

	/**
	 * The operation id for the '<em>Get Valid In Out Data Port Combinations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_VALID_IN_OUT_DATA_PORT_COMBINATIONS = 59;

	/**
	 * The operation id for the '<em>Read Traversal Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___READ_TRAVERSAL_CRITERIA__STRING = 60;

	/**
	 * The operation id for the '<em>Read Grouping Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___READ_GROUPING_CRITERIA__STRING_ELIST_STRING = 61;

	/**
	 * The operation id for the '<em>Create Grouping Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CREATE_GROUPING_CRITERIA__STRING_DATAPORT_STRING = 62;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 63;

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
	 * The number of operations of the '<em>Preprocessing Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_TASK_OPERATION_COUNT = 0;

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
	 * The operation id for the '<em>Compute Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___COMPUTE_SCORE__EMAP = 0;

	/**
	 * The operation id for the '<em>Compute Expected Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___COMPUTE_EXPECTED_SCORE = 1;

	/**
	 * The operation id for the '<em>Validate Data Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___VALIDATE_DATA_PORTS__ELIST_ELIST = 2;

	/**
	 * The operation id for the '<em>Resolve Reverse Missing In Data Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___RESOLVE_REVERSE_MISSING_IN_DATA_PORTS__ELIST = 3;

	/**
	 * The operation id for the '<em>Resolve Reverse Missing Out Data Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___RESOLVE_REVERSE_MISSING_OUT_DATA_PORTS__ELIST = 4;

	/**
	 * The operation id for the '<em>Get Data Port Providing Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH___GET_DATA_PORT_PROVIDING_TASKS__ELIST_ELIST = 5;

	/**
	 * The number of operations of the '<em>Tool Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_MATCH_OPERATION_COUNT = 6;

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
	 * The operation id for the '<em>Read Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST = 0;

	/**
	 * The number of operations of the '<em>IWorkflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_TEMPLATE_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Util Task Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__LOGGER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Error Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Default Workflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE_FEATURE_COUNT = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Read Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST = IWORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST;

	/**
	 * The number of operations of the '<em>Default Workflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_WORKFLOW_TEMPLATE_OPERATION_COUNT = IWORKFLOW_TEMPLATE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Util Task Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__UTIL_TASK_READER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__LOGGER = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Error Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE__ERROR_CONTROL = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Easyflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE_FEATURE_COUNT = IWORKFLOW_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Read Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST = IWORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST;

	/**
	 * The number of operations of the '<em>Easyflow Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASYFLOW_TEMPLATE_OPERATION_COUNT = IWORKFLOW_TEMPLATE_OPERATION_COUNT + 0;

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
	 * The operation id for the '<em>Read Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_READER___READ_TASK = 0;

	/**
	 * The number of operations of the '<em>ITask Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_READER_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Read Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_TASK_READER___READ_TASK = ITASK_READER___READ_TASK;

	/**
	 * The number of operations of the '<em>Galaxy Task Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALAXY_TASK_READER_OPERATION_COUNT = ITASK_READER_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Default Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_RECORD_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Parent Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TASK_RESULT_OPERATION_COUNT = 0;

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
	 * The operation id for the '<em>Is Unconditional</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_UNCONDITIONAL = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Generate Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL___GENERATE_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Generate Error String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL___GENERATE_ERROR_STRING__STRING_CATEGORY_SEVERITY_ELIST = 1;

	/**
	 * The number of operations of the '<em>Error Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CONTROL_OPERATION_COUNT = 2;

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
	 * Returns the meta object for the reference '{@link easyflow.core.Workflow#getErrorControl <em>Error Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Control</em>'.
	 * @see easyflow.core.Workflow#getErrorControl()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ErrorControl();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#generateGraphFromTemplate(org.eclipse.emf.common.util.EMap) <em>Generate Graph From Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Graph From Template</em>' operation.
	 * @see easyflow.core.Workflow#generateGraphFromTemplate(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getWorkflow__GenerateGraphFromTemplate__EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getParentTaskByOutDataPort(easyflow.data.DataPort, easyflow.core.Task) <em>Get Parent Task By Out Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Task By Out Data Port</em>' operation.
	 * @see easyflow.core.Workflow#getParentTaskByOutDataPort(easyflow.data.DataPort, easyflow.core.Task)
	 * @generated
	 */
	EOperation getWorkflow__GetParentTaskByOutDataPort__DataPort_Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getParentTasksByOutDataPort(easyflow.data.DataPort) <em>Get Parent Tasks By Out Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Tasks By Out Data Port</em>' operation.
	 * @see easyflow.core.Workflow#getParentTasksByOutDataPort(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getWorkflow__GetParentTasksByOutDataPort__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#validateParentTaskOutDataPort(easyflow.data.DataPort, easyflow.core.Task) <em>Validate Parent Task Out Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Parent Task Out Data Port</em>' operation.
	 * @see easyflow.core.Workflow#validateParentTaskOutDataPort(easyflow.data.DataPort, easyflow.core.Task)
	 * @generated
	 */
	EOperation getWorkflow__ValidateParentTaskOutDataPort__DataPort_Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#validateLastTaskOutDataPort(easyflow.data.DataPort) <em>Validate Last Task Out Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Last Task Out Data Port</em>' operation.
	 * @see easyflow.core.Workflow#validateLastTaskOutDataPort(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getWorkflow__ValidateLastTaskOutDataPort__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#readMetaData() <em>Read Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Meta Data</em>' operation.
	 * @see easyflow.core.Workflow#readMetaData()
	 * @generated
	 */
	EOperation getWorkflow__ReadMetaData();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getParentTasksFor(easyflow.core.Task) <em>Get Parent Tasks For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Tasks For</em>' operation.
	 * @see easyflow.core.Workflow#getParentTasksFor(easyflow.core.Task)
	 * @generated
	 */
	EOperation getWorkflow__GetParentTasksFor__Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resolveMissingDataPortsByToolFor(easyflow.core.Task) <em>Resolve Missing Data Ports By Tool For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Missing Data Ports By Tool For</em>' operation.
	 * @see easyflow.core.Workflow#resolveMissingDataPortsByToolFor(easyflow.core.Task)
	 * @generated
	 */
	EOperation getWorkflow__ResolveMissingDataPortsByToolFor__Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#readWorkfowTemplate() <em>Read Workfow Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Workfow Template</em>' operation.
	 * @see easyflow.core.Workflow#readWorkfowTemplate()
	 * @generated
	 */
	EOperation getWorkflow__ReadWorkfowTemplate();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#generateAbstractWorkflow() <em>Generate Abstract Workflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Abstract Workflow</em>' operation.
	 * @see easyflow.core.Workflow#generateAbstractWorkflow()
	 * @generated
	 */
	EOperation getWorkflow__GenerateAbstractWorkflow();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#applyGroupingCriteria() <em>Apply Grouping Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Grouping Criteria</em>' operation.
	 * @see easyflow.core.Workflow#applyGroupingCriteria()
	 * @generated
	 */
	EOperation getWorkflow__ApplyGroupingCriteria();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#applyParameterCriteria() <em>Apply Parameter Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Parameter Criteria</em>' operation.
	 * @see easyflow.core.Workflow#applyParameterCriteria()
	 * @generated
	 */
	EOperation getWorkflow__ApplyParameterCriteria();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#applyTraversalEvent(easyflow.traversal.TraversalEvent) <em>Apply Traversal Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Traversal Event</em>' operation.
	 * @see easyflow.core.Workflow#applyTraversalEvent(easyflow.traversal.TraversalEvent)
	 * @generated
	 */
	EOperation getWorkflow__ApplyTraversalEvent__TraversalEvent();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resolveTraversalEvents() <em>Resolve Traversal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Traversal Events</em>' operation.
	 * @see easyflow.core.Workflow#resolveTraversalEvents()
	 * @generated
	 */
	EOperation getWorkflow__ResolveTraversalEvents();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resolveIncompatibleGroupings() <em>Resolve Incompatible Groupings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Incompatible Groupings</em>' operation.
	 * @see easyflow.core.Workflow#resolveIncompatibleGroupings()
	 * @generated
	 */
	EOperation getWorkflow__ResolveIncompatibleGroupings();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resolvePreprocessingTasks() <em>Resolve Preprocessing Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Preprocessing Tasks</em>' operation.
	 * @see easyflow.core.Workflow#resolvePreprocessingTasks()
	 * @generated
	 */
	EOperation getWorkflow__ResolvePreprocessingTasks();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resolveToolDependencies() <em>Resolve Tool Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Tool Dependencies</em>' operation.
	 * @see easyflow.core.Workflow#resolveToolDependencies()
	 * @generated
	 */
	EOperation getWorkflow__ResolveToolDependencies();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#generateWorklowForExecutionSystem() <em>Generate Worklow For Execution System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Worklow For Execution System</em>' operation.
	 * @see easyflow.core.Workflow#generateWorklowForExecutionSystem()
	 * @generated
	 */
	EOperation getWorkflow__GenerateWorklowForExecutionSystem();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#runNextWorkflowStep() <em>Run Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Next Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#runNextWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__RunNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#runPrevWorkflowStep() <em>Run Prev Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Prev Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#runPrevWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__RunPrevWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#runEntireWorkflow() <em>Run Entire Workflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Entire Workflow</em>' operation.
	 * @see easyflow.core.Workflow#runEntireWorkflow()
	 * @generated
	 */
	EOperation getWorkflow__RunEntireWorkflow();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#hasNextWorkflowStep() <em>Has Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Next Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#hasNextWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__HasNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getTotalNumberOfWorkflowSteps() <em>Get Total Number Of Workflow Steps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Number Of Workflow Steps</em>' operation.
	 * @see easyflow.core.Workflow#getTotalNumberOfWorkflowSteps()
	 * @generated
	 */
	EOperation getWorkflow__GetTotalNumberOfWorkflowSteps();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getWorkflowStepLabelFor(java.lang.String) <em>Get Workflow Step Label For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workflow Step Label For</em>' operation.
	 * @see easyflow.core.Workflow#getWorkflowStepLabelFor(java.lang.String)
	 * @generated
	 */
	EOperation getWorkflow__GetWorkflowStepLabelFor__String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getWorkflowStepDescFor(java.lang.String) <em>Get Workflow Step Desc For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workflow Step Desc For</em>' operation.
	 * @see easyflow.core.Workflow#getWorkflowStepDescFor(java.lang.String)
	 * @generated
	 */
	EOperation getWorkflow__GetWorkflowStepDescFor__String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getNumberOfCurrentWorkflowStep() <em>Get Number Of Current Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Current Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#getNumberOfCurrentWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__GetNumberOfCurrentWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getNextWorkflowStep() <em>Get Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#getNextWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__GetNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#getCurWorkflowStep() <em>Get Cur Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cur Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#getCurWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__GetCurWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see easyflow.core.Workflow#delete()
	 * @generated
	 */
	EOperation getWorkflow__Delete();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#resetWorkflowStep() <em>Reset Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Workflow Step</em>' operation.
	 * @see easyflow.core.Workflow#resetWorkflowStep()
	 * @generated
	 */
	EOperation getWorkflow__ResetWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#printWorkflowStepMsgOnStart(java.lang.String) <em>Print Workflow Step Msg On Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Workflow Step Msg On Start</em>' operation.
	 * @see easyflow.core.Workflow#printWorkflowStepMsgOnStart(java.lang.String)
	 * @generated
	 */
	EOperation getWorkflow__PrintWorkflowStepMsgOnStart__String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#printWorkflowStepMsgOnEnd(boolean, java.lang.String) <em>Print Workflow Step Msg On End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Workflow Step Msg On End</em>' operation.
	 * @see easyflow.core.Workflow#printWorkflowStepMsgOnEnd(boolean, java.lang.String)
	 * @generated
	 */
	EOperation getWorkflow__PrintWorkflowStepMsgOnEnd__boolean_String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see easyflow.core.Workflow#init()
	 * @generated
	 */
	EOperation getWorkflow__Init();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Workflow#renderToString() <em>Render To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render To String</em>' operation.
	 * @see easyflow.core.Workflow#renderToString()
	 * @generated
	 */
	EOperation getWorkflow__RenderToString();

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
	 * Returns the meta object for the '{@link easyflow.core.Task#readTask(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Read Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Task</em>' operation.
	 * @see easyflow.core.Task#readTask(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__ReadTask__String_String_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#shallProcess(org.eclipse.emf.common.util.EList, java.lang.String) <em>Shall Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shall Process</em>' operation.
	 * @see easyflow.core.Task#shallProcess(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getTask__ShallProcess__EList_String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#shallProcess(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, boolean) <em>Shall Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shall Process</em>' operation.
	 * @see easyflow.core.Task#shallProcess(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getTask__ShallProcess__EList_String_EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#parseDataFormatField(java.lang.String, org.eclipse.emf.common.util.EList) <em>Parse Data Format Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Data Format Field</em>' operation.
	 * @see easyflow.core.Task#parseDataFormatField(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__ParseDataFormatField__String_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getUniqueString() <em>Get Unique String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique String</em>' operation.
	 * @see easyflow.core.Task#getUniqueString()
	 * @generated
	 */
	EOperation getTask__GetUniqueString();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getUniqueURIString() <em>Get Unique URI String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique URI String</em>' operation.
	 * @see easyflow.core.Task#getUniqueURIString()
	 * @generated
	 */
	EOperation getTask__GetUniqueURIString();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#isCompatibleWithOutDataPortFor(easyflow.data.DataPort) <em>Is Compatible With Out Data Port For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With Out Data Port For</em>' operation.
	 * @see easyflow.core.Task#isCompatibleWithOutDataPortFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__IsCompatibleWithOutDataPortFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#isCompatibleWithInDataPortFor(easyflow.data.DataPort) <em>Is Compatible With In Data Port For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With In Data Port For</em>' operation.
	 * @see easyflow.core.Task#isCompatibleWithInDataPortFor(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__IsCompatibleWithInDataPortFor__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getParentTaskByOutDataPort(easyflow.data.DataPort) <em>Get Parent Task By Out Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent Task By Out Data Port</em>' operation.
	 * @see easyflow.core.Task#getParentTaskByOutDataPort(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__GetParentTaskByOutDataPort__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getNonOveralppingTraversalChunksFor(easyflow.core.Task) <em>Get Non Overalpping Traversal Chunks For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Non Overalpping Traversal Chunks For</em>' operation.
	 * @see easyflow.core.Task#getNonOveralppingTraversalChunksFor(easyflow.core.Task)
	 * @generated
	 */
	EOperation getTask__GetNonOveralppingTraversalChunksFor__Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#readTools(org.eclipse.emf.common.util.EList) <em>Read Tools</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Tools</em>' operation.
	 * @see easyflow.core.Task#readTools(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__ReadTools__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getPreferredTool() <em>Get Preferred Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Preferred Tool</em>' operation.
	 * @see easyflow.core.Task#getPreferredTool()
	 * @generated
	 */
	EOperation getTask__GetPreferredTool();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getOverlappingDataPorts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Overlapping Data Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Overlapping Data Ports</em>' operation.
	 * @see easyflow.core.Task#getOverlappingDataPorts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__GetOverlappingDataPorts__EList_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveCommandLinePartInterpreter() <em>Resolve Command Line Part Interpreter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Command Line Part Interpreter</em>' operation.
	 * @see easyflow.core.Task#resolveCommandLinePartInterpreter()
	 * @generated
	 */
	EOperation getTask__ResolveCommandLinePartInterpreter();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveCommandLinePartExe() <em>Resolve Command Line Part Exe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Command Line Part Exe</em>' operation.
	 * @see easyflow.core.Task#resolveCommandLinePartExe()
	 * @generated
	 */
	EOperation getTask__ResolveCommandLinePartExe();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveCommandLinePartAnalysisType() <em>Resolve Command Line Part Analysis Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Command Line Part Analysis Type</em>' operation.
	 * @see easyflow.core.Task#resolveCommandLinePartAnalysisType()
	 * @generated
	 */
	EOperation getTask__ResolveCommandLinePartAnalysisType();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveCommandLinePart(java.lang.String, boolean, boolean) <em>Resolve Command Line Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Command Line Part</em>' operation.
	 * @see easyflow.core.Task#resolveCommandLinePart(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getTask__ResolveCommandLinePart__String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getCommandLinePattern() <em>Get Command Line Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Command Line Pattern</em>' operation.
	 * @see easyflow.core.Task#getCommandLinePattern()
	 * @generated
	 */
	EOperation getTask__GetCommandLinePattern();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#validateTool(easyflow.tool.Tool) <em>Validate Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Tool</em>' operation.
	 * @see easyflow.core.Task#validateTool(easyflow.tool.Tool)
	 * @generated
	 */
	EOperation getTask__ValidateTool__Tool();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#validateTools() <em>Validate Tools</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Tools</em>' operation.
	 * @see easyflow.core.Task#validateTools()
	 * @generated
	 */
	EOperation getTask__ValidateTools();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getDataPortByDataPort(easyflow.data.DataPort, boolean) <em>Get Data Port By Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Port By Data Port</em>' operation.
	 * @see easyflow.core.Task#getDataPortByDataPort(easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getTask__GetDataPortByDataPort__DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getDataPortByNameOfFormat(java.lang.String, boolean) <em>Get Data Port By Name Of Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Port By Name Of Format</em>' operation.
	 * @see easyflow.core.Task#getDataPortByNameOfFormat(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getTask__GetDataPortByNameOfFormat__String_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getDataPortByName(java.lang.String, boolean) <em>Get Data Port By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Port By Name</em>' operation.
	 * @see easyflow.core.Task#getDataPortByName(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getTask__GetDataPortByName__String_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveMissingDataPortsByTool(org.eclipse.emf.common.util.EList) <em>Resolve Missing Data Ports By Tool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Missing Data Ports By Tool</em>' operation.
	 * @see easyflow.core.Task#resolveMissingDataPortsByTool(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__ResolveMissingDataPortsByTool__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getOverlappingChunksFor(easyflow.core.Task, java.lang.String) <em>Get Overlapping Chunks For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Overlapping Chunks For</em>' operation.
	 * @see easyflow.core.Task#getOverlappingChunksFor(easyflow.core.Task, java.lang.String)
	 * @generated
	 */
	EOperation getTask__GetOverlappingChunksFor__Task_String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getRequiredGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort, boolean) <em>Get Required Groupings For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Required Groupings For</em>' operation.
	 * @see easyflow.core.Task#getRequiredGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getTask__GetRequiredGroupingsFor__Tool_DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getProvidedGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort, boolean) <em>Get Provided Groupings For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Provided Groupings For</em>' operation.
	 * @see easyflow.core.Task#getProvidedGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort, boolean)
	 * @generated
	 */
	EOperation getTask__GetProvidedGroupingsFor__Tool_DataPort_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProvideMultipleGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Provide Multiple Groupings For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Groupings For</em>' operation.
	 * @see easyflow.core.Task#canProvideMultipleGroupingsFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProvideMultipleGroupingsFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProvideMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Provide Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Inputs For</em>' operation.
	 * @see easyflow.core.Task#canProvideMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProvideMultipleInputsFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProvideMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Provide Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Instances For</em>' operation.
	 * @see easyflow.core.Task#canProvideMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProvideMultipleInstancesFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProvideMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Provide Multiple Instances Per Input For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Multiple Instances Per Input For</em>' operation.
	 * @see easyflow.core.Task#canProvideMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProvideMultipleInstancesPerInputFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProcessMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Process Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Inputs For</em>' operation.
	 * @see easyflow.core.Task#canProcessMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProcessMultipleInputsFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProcessMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Process Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Instances For</em>' operation.
	 * @see easyflow.core.Task#canProcessMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProcessMultipleInstancesFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProcessMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Process Multiple Instances Per Input For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Process Multiple Instances Per Input For</em>' operation.
	 * @see easyflow.core.Task#canProcessMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanProcessMultipleInstancesPerInputFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProcessMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Process Multiple Instances Per Input For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Process Multiple Instances Per Input For</em>' operation.
	 * @see easyflow.core.Task#setProcessMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProcessMultipleInstancesPerInputFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProcessMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Process Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Process Multiple Instances For</em>' operation.
	 * @see easyflow.core.Task#setProcessMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProcessMultipleInstancesFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProcessMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Process Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Process Multiple Inputs For</em>' operation.
	 * @see easyflow.core.Task#setProcessMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProcessMultipleInputsFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProvideMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Provide Multiple Instances Per Input For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Provide Multiple Instances Per Input For</em>' operation.
	 * @see easyflow.core.Task#setProvideMultipleInstancesPerInputFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProvideMultipleInstancesPerInputFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProvideMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Provide Multiple Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Provide Multiple Instances For</em>' operation.
	 * @see easyflow.core.Task#setProvideMultipleInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProvideMultipleInstancesFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#setProvideMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Set Provide Multiple Inputs For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Provide Multiple Inputs For</em>' operation.
	 * @see easyflow.core.Task#setProvideMultipleInputsFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__SetProvideMultipleInputsFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canFilterInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort) <em>Can Filter Instances For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Filter Instances For</em>' operation.
	 * @see easyflow.core.Task#canFilterInstancesFor(easyflow.tool.Tool, easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__CanFilterInstancesFor__Tool_DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getRecords(boolean) <em>Get Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Records</em>' operation.
	 * @see easyflow.core.Task#getRecords(boolean)
	 * @generated
	 */
	EOperation getTask__GetRecords__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getInputs(boolean) <em>Get Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs</em>' operation.
	 * @see easyflow.core.Task#getInputs(boolean)
	 * @generated
	 */
	EOperation getTask__GetInputs__boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getOverlappingRecordsProvidedBy(easyflow.core.Task) <em>Get Overlapping Records Provided By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Overlapping Records Provided By</em>' operation.
	 * @see easyflow.core.Task#getOverlappingRecordsProvidedBy(easyflow.core.Task)
	 * @generated
	 */
	EOperation getTask__GetOverlappingRecordsProvidedBy__Task();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canProvideDataPort(easyflow.tool.Tool, easyflow.data.DataPort, java.lang.String, org.eclipse.emf.common.util.EList, boolean) <em>Can Provide Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Provide Data Port</em>' operation.
	 * @see easyflow.core.Task#canProvideDataPort(easyflow.tool.Tool, easyflow.data.DataPort, java.lang.String, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getTask__CanProvideDataPort__Tool_DataPort_String_EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#canComsumeDataPort(easyflow.tool.Tool, easyflow.data.DataPort, java.lang.String, org.eclipse.emf.common.util.EList, boolean) <em>Can Comsume Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Comsume Data Port</em>' operation.
	 * @see easyflow.core.Task#canComsumeDataPort(easyflow.tool.Tool, easyflow.data.DataPort, java.lang.String, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getTask__CanComsumeDataPort__Tool_DataPort_String_EList_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getOutputsForDataPort(easyflow.data.DataPort) <em>Get Outputs For Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outputs For Data Port</em>' operation.
	 * @see easyflow.core.Task#getOutputsForDataPort(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__GetOutputsForDataPort__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getInputsForDataPort(easyflow.data.DataPort) <em>Get Inputs For Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inputs For Data Port</em>' operation.
	 * @see easyflow.core.Task#getInputsForDataPort(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__GetInputsForDataPort__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveParams() <em>Resolve Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Params</em>' operation.
	 * @see easyflow.core.Task#resolveParams()
	 * @generated
	 */
	EOperation getTask__ResolveParams();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#isIdentityTransformation() <em>Is Identity Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Identity Transformation</em>' operation.
	 * @see easyflow.core.Task#isIdentityTransformation()
	 * @generated
	 */
	EOperation getTask__IsIdentityTransformation();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#isIdentityTransformation(easyflow.data.DataPort) <em>Is Identity Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Identity Transformation</em>' operation.
	 * @see easyflow.core.Task#isIdentityTransformation(easyflow.data.DataPort)
	 * @generated
	 */
	EOperation getTask__IsIdentityTransformation__DataPort();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveConditionalStaticParam(easyflow.tool.ResolvedParam) <em>Resolve Conditional Static Param</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Conditional Static Param</em>' operation.
	 * @see easyflow.core.Task#resolveConditionalStaticParam(easyflow.tool.ResolvedParam)
	 * @generated
	 */
	EOperation getTask__ResolveConditionalStaticParam__ResolvedParam();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#readFromPipe() <em>Read From Pipe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read From Pipe</em>' operation.
	 * @see easyflow.core.Task#readFromPipe()
	 * @generated
	 */
	EOperation getTask__ReadFromPipe();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#writeToPipe() <em>Write To Pipe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write To Pipe</em>' operation.
	 * @see easyflow.core.Task#writeToPipe()
	 * @generated
	 */
	EOperation getTask__WriteToPipe();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#createRule() <em>Create Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rule</em>' operation.
	 * @see easyflow.core.Task#createRule()
	 * @generated
	 */
	EOperation getTask__CreateRule();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#retrieveDataPort(boolean, int) <em>Retrieve Data Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retrieve Data Port</em>' operation.
	 * @see easyflow.core.Task#retrieveDataPort(boolean, int)
	 * @generated
	 */
	EOperation getTask__RetrieveDataPort__boolean_int();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveDataPortParams(org.eclipse.emf.common.util.EMap, easyflow.tool.Tool, boolean) <em>Resolve Data Port Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Data Port Params</em>' operation.
	 * @see easyflow.core.Task#resolveDataPortParams(org.eclipse.emf.common.util.EMap, easyflow.tool.Tool, boolean)
	 * @generated
	 */
	EOperation getTask__ResolveDataPortParams__EMap_Tool_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#resolveStaticParams(org.eclipse.emf.common.util.EMap) <em>Resolve Static Params</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Static Params</em>' operation.
	 * @see easyflow.core.Task#resolveStaticParams(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getTask__ResolveStaticParams__EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getDetailedString() <em>Get Detailed String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Detailed String</em>' operation.
	 * @see easyflow.core.Task#getDetailedString()
	 * @generated
	 */
	EOperation getTask__GetDetailedString();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#getValidInOutDataPortCombinations() <em>Get Valid In Out Data Port Combinations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Valid In Out Data Port Combinations</em>' operation.
	 * @see easyflow.core.Task#getValidInOutDataPortCombinations()
	 * @generated
	 */
	EOperation getTask__GetValidInOutDataPortCombinations();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#readTraversalCriteria(java.lang.String) <em>Read Traversal Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Traversal Criteria</em>' operation.
	 * @see easyflow.core.Task#readTraversalCriteria(java.lang.String)
	 * @generated
	 */
	EOperation getTask__ReadTraversalCriteria__String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#readGroupingCriteria(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String) <em>Read Grouping Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Grouping Criteria</em>' operation.
	 * @see easyflow.core.Task#readGroupingCriteria(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getTask__ReadGroupingCriteria__String_EList_String();

	/**
	 * Returns the meta object for the '{@link easyflow.core.Task#createGroupingCriteria(java.lang.String, easyflow.data.DataPort, java.lang.String) <em>Create Grouping Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Grouping Criteria</em>' operation.
	 * @see easyflow.core.Task#createGroupingCriteria(java.lang.String, easyflow.data.DataPort, java.lang.String)
	 * @generated
	 */
	EOperation getTask__CreateGroupingCriteria__String_DataPort_String();

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
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#computeScore(org.eclipse.emf.common.util.EMap) <em>Compute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Score</em>' operation.
	 * @see easyflow.core.ToolMatch#computeScore(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getToolMatch__ComputeScore__EMap();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#computeExpectedScore() <em>Compute Expected Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Expected Score</em>' operation.
	 * @see easyflow.core.ToolMatch#computeExpectedScore()
	 * @generated
	 */
	EOperation getToolMatch__ComputeExpectedScore();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#validateDataPorts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Validate Data Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Data Ports</em>' operation.
	 * @see easyflow.core.ToolMatch#validateDataPorts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getToolMatch__ValidateDataPorts__EList_EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#resolveReverseMissingInDataPorts(org.eclipse.emf.common.util.EList) <em>Resolve Reverse Missing In Data Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Reverse Missing In Data Ports</em>' operation.
	 * @see easyflow.core.ToolMatch#resolveReverseMissingInDataPorts(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getToolMatch__ResolveReverseMissingInDataPorts__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#resolveReverseMissingOutDataPorts(org.eclipse.emf.common.util.EList) <em>Resolve Reverse Missing Out Data Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Reverse Missing Out Data Ports</em>' operation.
	 * @see easyflow.core.ToolMatch#resolveReverseMissingOutDataPorts(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getToolMatch__ResolveReverseMissingOutDataPorts__EList();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ToolMatch#getDataPortProvidingTasks(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Data Port Providing Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Port Providing Tasks</em>' operation.
	 * @see easyflow.core.ToolMatch#getDataPortProvidingTasks(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getToolMatch__GetDataPortProvidingTasks__EList_EList();

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
	 * Returns the meta object for the '{@link easyflow.core.IWorkflowTemplate#readTemplate(java.lang.String, org.eclipse.emf.common.util.EList) <em>Read Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Template</em>' operation.
	 * @see easyflow.core.IWorkflowTemplate#readTemplate(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIWorkflowTemplate__ReadTemplate__String_EList();

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
	 * Returns the meta object for the attribute '{@link easyflow.core.DefaultWorkflowTemplate#getUtilTaskReader <em>Util Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Util Task Reader</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate#getUtilTaskReader()
	 * @see #getDefaultWorkflowTemplate()
	 * @generated
	 */
	EAttribute getDefaultWorkflowTemplate_UtilTaskReader();

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
	 * Returns the meta object for the reference '{@link easyflow.core.DefaultWorkflowTemplate#getErrorControl <em>Error Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Control</em>'.
	 * @see easyflow.core.DefaultWorkflowTemplate#getErrorControl()
	 * @see #getDefaultWorkflowTemplate()
	 * @generated
	 */
	EReference getDefaultWorkflowTemplate_ErrorControl();

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
	 * Returns the meta object for the '{@link easyflow.core.ITaskReader#readTask() <em>Read Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Task</em>' operation.
	 * @see easyflow.core.ITaskReader#readTask()
	 * @generated
	 */
	EOperation getITaskReader__ReadTask();

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
	 * Returns the meta object for the '{@link easyflow.core.Condition#isUnconditional() <em>Is Unconditional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Unconditional</em>' operation.
	 * @see easyflow.core.Condition#isUnconditional()
	 * @generated
	 */
	EOperation getCondition__IsUnconditional();

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
	 * Returns the meta object for the '{@link easyflow.core.ErrorControl#generateDescription() <em>Generate Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Description</em>' operation.
	 * @see easyflow.core.ErrorControl#generateDescription()
	 * @generated
	 */
	EOperation getErrorControl__GenerateDescription();

	/**
	 * Returns the meta object for the '{@link easyflow.core.ErrorControl#generateErrorString(java.lang.String, easyflow.core.Category, easyflow.core.Severity, org.eclipse.emf.common.util.EList) <em>Generate Error String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Error String</em>' operation.
	 * @see easyflow.core.ErrorControl#generateErrorString(java.lang.String, easyflow.core.Category, easyflow.core.Severity, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getErrorControl__GenerateErrorString__String_Category_Severity_EList();

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
		 * The meta object literal for the '<em><b>Error Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ERROR_CONTROL = eINSTANCE.getWorkflow_ErrorControl();

		/**
		 * The meta object literal for the '<em><b>Generate Graph From Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GENERATE_GRAPH_FROM_TEMPLATE__EMAP = eINSTANCE.getWorkflow__GenerateGraphFromTemplate__EMap();

		/**
		 * The meta object literal for the '<em><b>Get Parent Task By Out Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT_TASK = eINSTANCE.getWorkflow__GetParentTaskByOutDataPort__DataPort_Task();

		/**
		 * The meta object literal for the '<em><b>Get Parent Tasks By Out Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_PARENT_TASKS_BY_OUT_DATA_PORT__DATAPORT = eINSTANCE.getWorkflow__GetParentTasksByOutDataPort__DataPort();

		/**
		 * The meta object literal for the '<em><b>Validate Parent Task Out Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___VALIDATE_PARENT_TASK_OUT_DATA_PORT__DATAPORT_TASK = eINSTANCE.getWorkflow__ValidateParentTaskOutDataPort__DataPort_Task();

		/**
		 * The meta object literal for the '<em><b>Validate Last Task Out Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___VALIDATE_LAST_TASK_OUT_DATA_PORT__DATAPORT = eINSTANCE.getWorkflow__ValidateLastTaskOutDataPort__DataPort();

		/**
		 * The meta object literal for the '<em><b>Read Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___READ_META_DATA = eINSTANCE.getWorkflow__ReadMetaData();

		/**
		 * The meta object literal for the '<em><b>Get Parent Tasks For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_PARENT_TASKS_FOR__TASK = eINSTANCE.getWorkflow__GetParentTasksFor__Task();

		/**
		 * The meta object literal for the '<em><b>Resolve Missing Data Ports By Tool For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESOLVE_MISSING_DATA_PORTS_BY_TOOL_FOR__TASK = eINSTANCE.getWorkflow__ResolveMissingDataPortsByToolFor__Task();

		/**
		 * The meta object literal for the '<em><b>Read Workfow Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___READ_WORKFOW_TEMPLATE = eINSTANCE.getWorkflow__ReadWorkfowTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate Abstract Workflow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GENERATE_ABSTRACT_WORKFLOW = eINSTANCE.getWorkflow__GenerateAbstractWorkflow();

		/**
		 * The meta object literal for the '<em><b>Apply Grouping Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___APPLY_GROUPING_CRITERIA = eINSTANCE.getWorkflow__ApplyGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Apply Parameter Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___APPLY_PARAMETER_CRITERIA = eINSTANCE.getWorkflow__ApplyParameterCriteria();

		/**
		 * The meta object literal for the '<em><b>Apply Traversal Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___APPLY_TRAVERSAL_EVENT__TRAVERSALEVENT = eINSTANCE.getWorkflow__ApplyTraversalEvent__TraversalEvent();

		/**
		 * The meta object literal for the '<em><b>Resolve Traversal Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESOLVE_TRAVERSAL_EVENTS = eINSTANCE.getWorkflow__ResolveTraversalEvents();

		/**
		 * The meta object literal for the '<em><b>Resolve Incompatible Groupings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESOLVE_INCOMPATIBLE_GROUPINGS = eINSTANCE.getWorkflow__ResolveIncompatibleGroupings();

		/**
		 * The meta object literal for the '<em><b>Resolve Preprocessing Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESOLVE_PREPROCESSING_TASKS = eINSTANCE.getWorkflow__ResolvePreprocessingTasks();

		/**
		 * The meta object literal for the '<em><b>Resolve Tool Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESOLVE_TOOL_DEPENDENCIES = eINSTANCE.getWorkflow__ResolveToolDependencies();

		/**
		 * The meta object literal for the '<em><b>Generate Worklow For Execution System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM = eINSTANCE.getWorkflow__GenerateWorklowForExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Run Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RUN_NEXT_WORKFLOW_STEP = eINSTANCE.getWorkflow__RunNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Run Prev Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RUN_PREV_WORKFLOW_STEP = eINSTANCE.getWorkflow__RunPrevWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Run Entire Workflow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RUN_ENTIRE_WORKFLOW = eINSTANCE.getWorkflow__RunEntireWorkflow();

		/**
		 * The meta object literal for the '<em><b>Has Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___HAS_NEXT_WORKFLOW_STEP = eINSTANCE.getWorkflow__HasNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Total Number Of Workflow Steps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS = eINSTANCE.getWorkflow__GetTotalNumberOfWorkflowSteps();

		/**
		 * The meta object literal for the '<em><b>Get Workflow Step Label For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_WORKFLOW_STEP_LABEL_FOR__STRING = eINSTANCE.getWorkflow__GetWorkflowStepLabelFor__String();

		/**
		 * The meta object literal for the '<em><b>Get Workflow Step Desc For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_WORKFLOW_STEP_DESC_FOR__STRING = eINSTANCE.getWorkflow__GetWorkflowStepDescFor__String();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Current Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP = eINSTANCE.getWorkflow__GetNumberOfCurrentWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_NEXT_WORKFLOW_STEP = eINSTANCE.getWorkflow__GetNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Cur Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___GET_CUR_WORKFLOW_STEP = eINSTANCE.getWorkflow__GetCurWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___DELETE = eINSTANCE.getWorkflow__Delete();

		/**
		 * The meta object literal for the '<em><b>Reset Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RESET_WORKFLOW_STEP = eINSTANCE.getWorkflow__ResetWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Print Workflow Step Msg On Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_START__STRING = eINSTANCE.getWorkflow__PrintWorkflowStepMsgOnStart__String();

		/**
		 * The meta object literal for the '<em><b>Print Workflow Step Msg On End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_END__BOOLEAN_STRING = eINSTANCE.getWorkflow__PrintWorkflowStepMsgOnEnd__boolean_String();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___INIT = eINSTANCE.getWorkflow__Init();

		/**
		 * The meta object literal for the '<em><b>Render To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___RENDER_TO_STRING = eINSTANCE.getWorkflow__RenderToString();

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
		 * The meta object literal for the '<em><b>Read Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___READ_TASK__STRING_STRING_ELIST = eINSTANCE.getTask__ReadTask__String_String_EList();

		/**
		 * The meta object literal for the '<em><b>Shall Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SHALL_PROCESS__ELIST_STRING = eINSTANCE.getTask__ShallProcess__EList_String();

		/**
		 * The meta object literal for the '<em><b>Shall Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SHALL_PROCESS__ELIST_STRING_ELIST_BOOLEAN = eINSTANCE.getTask__ShallProcess__EList_String_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Parse Data Format Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___PARSE_DATA_FORMAT_FIELD__STRING_ELIST = eINSTANCE.getTask__ParseDataFormatField__String_EList();

		/**
		 * The meta object literal for the '<em><b>Get Unique String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_UNIQUE_STRING = eINSTANCE.getTask__GetUniqueString();

		/**
		 * The meta object literal for the '<em><b>Get Unique URI String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_UNIQUE_URI_STRING = eINSTANCE.getTask__GetUniqueURIString();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With Out Data Port For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_COMPATIBLE_WITH_OUT_DATA_PORT_FOR__DATAPORT = eINSTANCE.getTask__IsCompatibleWithOutDataPortFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With In Data Port For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_COMPATIBLE_WITH_IN_DATA_PORT_FOR__DATAPORT = eINSTANCE.getTask__IsCompatibleWithInDataPortFor__DataPort();

		/**
		 * The meta object literal for the '<em><b>Get Parent Task By Out Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT = eINSTANCE.getTask__GetParentTaskByOutDataPort__DataPort();

		/**
		 * The meta object literal for the '<em><b>Get Non Overalpping Traversal Chunks For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_NON_OVERALPPING_TRAVERSAL_CHUNKS_FOR__TASK = eINSTANCE.getTask__GetNonOveralppingTraversalChunksFor__Task();

		/**
		 * The meta object literal for the '<em><b>Read Tools</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___READ_TOOLS__ELIST = eINSTANCE.getTask__ReadTools__EList();

		/**
		 * The meta object literal for the '<em><b>Get Preferred Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_PREFERRED_TOOL = eINSTANCE.getTask__GetPreferredTool();

		/**
		 * The meta object literal for the '<em><b>Get Overlapping Data Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_OVERLAPPING_DATA_PORTS__ELIST_ELIST = eINSTANCE.getTask__GetOverlappingDataPorts__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Resolve Command Line Part Interpreter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_COMMAND_LINE_PART_INTERPRETER = eINSTANCE.getTask__ResolveCommandLinePartInterpreter();

		/**
		 * The meta object literal for the '<em><b>Resolve Command Line Part Exe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_COMMAND_LINE_PART_EXE = eINSTANCE.getTask__ResolveCommandLinePartExe();

		/**
		 * The meta object literal for the '<em><b>Resolve Command Line Part Analysis Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_COMMAND_LINE_PART_ANALYSIS_TYPE = eINSTANCE.getTask__ResolveCommandLinePartAnalysisType();

		/**
		 * The meta object literal for the '<em><b>Resolve Command Line Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_COMMAND_LINE_PART__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getTask__ResolveCommandLinePart__String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Command Line Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_COMMAND_LINE_PATTERN = eINSTANCE.getTask__GetCommandLinePattern();

		/**
		 * The meta object literal for the '<em><b>Validate Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___VALIDATE_TOOL__TOOL = eINSTANCE.getTask__ValidateTool__Tool();

		/**
		 * The meta object literal for the '<em><b>Validate Tools</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___VALIDATE_TOOLS = eINSTANCE.getTask__ValidateTools();

		/**
		 * The meta object literal for the '<em><b>Get Data Port By Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_DATA_PORT_BY_DATA_PORT__DATAPORT_BOOLEAN = eINSTANCE.getTask__GetDataPortByDataPort__DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Data Port By Name Of Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_DATA_PORT_BY_NAME_OF_FORMAT__STRING_BOOLEAN = eINSTANCE.getTask__GetDataPortByNameOfFormat__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Data Port By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_DATA_PORT_BY_NAME__STRING_BOOLEAN = eINSTANCE.getTask__GetDataPortByName__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Resolve Missing Data Ports By Tool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_MISSING_DATA_PORTS_BY_TOOL__ELIST = eINSTANCE.getTask__ResolveMissingDataPortsByTool__EList();

		/**
		 * The meta object literal for the '<em><b>Get Overlapping Chunks For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_OVERLAPPING_CHUNKS_FOR__TASK_STRING = eINSTANCE.getTask__GetOverlappingChunksFor__Task_String();

		/**
		 * The meta object literal for the '<em><b>Get Required Groupings For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_REQUIRED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN = eINSTANCE.getTask__GetRequiredGroupingsFor__Tool_DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Provided Groupings For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_PROVIDED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN = eINSTANCE.getTask__GetProvidedGroupingsFor__Tool_DataPort_boolean();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Groupings For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROVIDE_MULTIPLE_GROUPINGS_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProvideMultipleGroupingsFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProvideMultipleInputsFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProvideMultipleInstancesFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Provide Multiple Instances Per Input For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProvideMultipleInstancesPerInputFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProcessMultipleInputsFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProcessMultipleInstancesFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Process Multiple Instances Per Input For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanProcessMultipleInstancesPerInputFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Process Multiple Instances Per Input For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProcessMultipleInstancesPerInputFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Process Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProcessMultipleInstancesFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Process Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProcessMultipleInputsFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Provide Multiple Instances Per Input For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProvideMultipleInstancesPerInputFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Provide Multiple Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProvideMultipleInstancesFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Set Provide Multiple Inputs For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT = eINSTANCE.getTask__SetProvideMultipleInputsFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Can Filter Instances For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_FILTER_INSTANCES_FOR__TOOL_DATAPORT = eINSTANCE.getTask__CanFilterInstancesFor__Tool_DataPort();

		/**
		 * The meta object literal for the '<em><b>Get Records</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_RECORDS__BOOLEAN = eINSTANCE.getTask__GetRecords__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_INPUTS__BOOLEAN = eINSTANCE.getTask__GetInputs__boolean();

		/**
		 * The meta object literal for the '<em><b>Get Overlapping Records Provided By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_OVERLAPPING_RECORDS_PROVIDED_BY__TASK = eINSTANCE.getTask__GetOverlappingRecordsProvidedBy__Task();

		/**
		 * The meta object literal for the '<em><b>Can Provide Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_PROVIDE_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN = eINSTANCE.getTask__CanProvideDataPort__Tool_DataPort_String_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Can Comsume Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_COMSUME_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN = eINSTANCE.getTask__CanComsumeDataPort__Tool_DataPort_String_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Outputs For Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_OUTPUTS_FOR_DATA_PORT__DATAPORT = eINSTANCE.getTask__GetOutputsForDataPort__DataPort();

		/**
		 * The meta object literal for the '<em><b>Get Inputs For Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_INPUTS_FOR_DATA_PORT__DATAPORT = eINSTANCE.getTask__GetInputsForDataPort__DataPort();

		/**
		 * The meta object literal for the '<em><b>Resolve Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_PARAMS = eINSTANCE.getTask__ResolveParams();

		/**
		 * The meta object literal for the '<em><b>Is Identity Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_IDENTITY_TRANSFORMATION = eINSTANCE.getTask__IsIdentityTransformation();

		/**
		 * The meta object literal for the '<em><b>Is Identity Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_IDENTITY_TRANSFORMATION__DATAPORT = eINSTANCE.getTask__IsIdentityTransformation__DataPort();

		/**
		 * The meta object literal for the '<em><b>Resolve Conditional Static Param</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_CONDITIONAL_STATIC_PARAM__RESOLVEDPARAM = eINSTANCE.getTask__ResolveConditionalStaticParam__ResolvedParam();

		/**
		 * The meta object literal for the '<em><b>Read From Pipe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___READ_FROM_PIPE = eINSTANCE.getTask__ReadFromPipe();

		/**
		 * The meta object literal for the '<em><b>Write To Pipe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___WRITE_TO_PIPE = eINSTANCE.getTask__WriteToPipe();

		/**
		 * The meta object literal for the '<em><b>Create Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CREATE_RULE = eINSTANCE.getTask__CreateRule();

		/**
		 * The meta object literal for the '<em><b>Retrieve Data Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RETRIEVE_DATA_PORT__BOOLEAN_INT = eINSTANCE.getTask__RetrieveDataPort__boolean_int();

		/**
		 * The meta object literal for the '<em><b>Resolve Data Port Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_DATA_PORT_PARAMS__EMAP_TOOL_BOOLEAN = eINSTANCE.getTask__ResolveDataPortParams__EMap_Tool_boolean();

		/**
		 * The meta object literal for the '<em><b>Resolve Static Params</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___RESOLVE_STATIC_PARAMS__EMAP = eINSTANCE.getTask__ResolveStaticParams__EMap();

		/**
		 * The meta object literal for the '<em><b>Get Detailed String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_DETAILED_STRING = eINSTANCE.getTask__GetDetailedString();

		/**
		 * The meta object literal for the '<em><b>Get Valid In Out Data Port Combinations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_VALID_IN_OUT_DATA_PORT_COMBINATIONS = eINSTANCE.getTask__GetValidInOutDataPortCombinations();

		/**
		 * The meta object literal for the '<em><b>Read Traversal Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___READ_TRAVERSAL_CRITERIA__STRING = eINSTANCE.getTask__ReadTraversalCriteria__String();

		/**
		 * The meta object literal for the '<em><b>Read Grouping Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___READ_GROUPING_CRITERIA__STRING_ELIST_STRING = eINSTANCE.getTask__ReadGroupingCriteria__String_EList_String();

		/**
		 * The meta object literal for the '<em><b>Create Grouping Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CREATE_GROUPING_CRITERIA__STRING_DATAPORT_STRING = eINSTANCE.getTask__CreateGroupingCriteria__String_DataPort_String();

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
		 * The meta object literal for the '<em><b>Compute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___COMPUTE_SCORE__EMAP = eINSTANCE.getToolMatch__ComputeScore__EMap();

		/**
		 * The meta object literal for the '<em><b>Compute Expected Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___COMPUTE_EXPECTED_SCORE = eINSTANCE.getToolMatch__ComputeExpectedScore();

		/**
		 * The meta object literal for the '<em><b>Validate Data Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___VALIDATE_DATA_PORTS__ELIST_ELIST = eINSTANCE.getToolMatch__ValidateDataPorts__EList_EList();

		/**
		 * The meta object literal for the '<em><b>Resolve Reverse Missing In Data Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___RESOLVE_REVERSE_MISSING_IN_DATA_PORTS__ELIST = eINSTANCE.getToolMatch__ResolveReverseMissingInDataPorts__EList();

		/**
		 * The meta object literal for the '<em><b>Resolve Reverse Missing Out Data Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___RESOLVE_REVERSE_MISSING_OUT_DATA_PORTS__ELIST = eINSTANCE.getToolMatch__ResolveReverseMissingOutDataPorts__EList();

		/**
		 * The meta object literal for the '<em><b>Get Data Port Providing Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_MATCH___GET_DATA_PORT_PROVIDING_TASKS__ELIST_ELIST = eINSTANCE.getToolMatch__GetDataPortProvidingTasks__EList_EList();

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
		 * The meta object literal for the '<em><b>Read Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IWORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST = eINSTANCE.getIWorkflowTemplate__ReadTemplate__String_EList();

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
		 * The meta object literal for the '<em><b>Util Task Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER = eINSTANCE.getDefaultWorkflowTemplate_UtilTaskReader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_WORKFLOW_TEMPLATE__LOGGER = eINSTANCE.getDefaultWorkflowTemplate_Logger();

		/**
		 * The meta object literal for the '<em><b>Error Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_WORKFLOW_TEMPLATE__ERROR_CONTROL = eINSTANCE.getDefaultWorkflowTemplate_ErrorControl();

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
		 * The meta object literal for the '<em><b>Read Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK_READER___READ_TASK = eINSTANCE.getITaskReader__ReadTask();

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
		 * The meta object literal for the '<em><b>Is Unconditional</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___IS_UNCONDITIONAL = eINSTANCE.getCondition__IsUnconditional();

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
		 * The meta object literal for the '<em><b>Generate Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ERROR_CONTROL___GENERATE_DESCRIPTION = eINSTANCE.getErrorControl__GenerateDescription();

		/**
		 * The meta object literal for the '<em><b>Generate Error String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ERROR_CONTROL___GENERATE_ERROR_STRING__STRING_CATEGORY_SEVERITY_ELIST = eINSTANCE.getErrorControl__GenerateErrorString__String_Category_Severity_EList();

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
