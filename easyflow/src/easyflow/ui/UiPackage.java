/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see easyflow.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/ui/easyflow.core/1.0.0";

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
	UiPackage eINSTANCE = easyflow.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.IProject
	 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 0;

	/**
	 * The number of structural features of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___VALIDATE = 0;

	/**
	 * The operation id for the '<em>Get Active Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_ACTIVE_WORKFLOW = 1;

	/**
	 * The operation id for the '<em>Clear Workflows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___CLEAR_WORKFLOWS = 2;

	/**
	 * The operation id for the '<em>Read Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Read Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___READ_JSON__URI_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Set Config And Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___SET_CONFIG_AND_BASE_PATH__STRING = 5;

	/**
	 * The operation id for the '<em>Apply Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___APPLY_META_DATA = 6;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___INIT__EASYFLOWGRAPH = 7;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___DELETE = 8;

	/**
	 * The operation id for the '<em>Run Entire Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RUN_ENTIRE_WORKFLOW = 9;

	/**
	 * The operation id for the '<em>Resolve Traversal Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RESOLVE_TRAVERSAL_CRITERIA = 10;

	/**
	 * The operation id for the '<em>Generate Abstract Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GENERATE_ABSTRACT_GRAPH = 11;

	/**
	 * The operation id for the '<em>Apply Grouping Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___APPLY_GROUPING_CRITERIA = 12;

	/**
	 * The operation id for the '<em>Apply Parameter Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___APPLY_PARAMETER_CRITERIA = 13;

	/**
	 * The operation id for the '<em>Resolve Utility Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RESOLVE_UTILITY_TASKS = 14;

	/**
	 * The operation id for the '<em>Resolve Preprocessing Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RESOLVE_PREPROCESSING_TASKS = 15;

	/**
	 * The operation id for the '<em>Resolve Tool Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RESOLVE_TOOL_DEPENDENCIES = 16;

	/**
	 * The operation id for the '<em>Generate Worklow For Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM = 17;

	/**
	 * The operation id for the '<em>Set Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___SET_WORKER__EASYFLOWOVERALLWORKER = 18;

	/**
	 * The operation id for the '<em>Run Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RUN_NEXT_WORKFLOW_STEP = 19;

	/**
	 * The operation id for the '<em>Run Prev Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RUN_PREV_WORKFLOW_STEP = 20;

	/**
	 * The operation id for the '<em>Has Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___HAS_NEXT_WORKFLOW_STEP = 21;

	/**
	 * The operation id for the '<em>Get Workflow Step Label For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING = 22;

	/**
	 * The operation id for the '<em>Get Workflow Step Desc For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING = 23;

	/**
	 * The operation id for the '<em>Get Total Number Of Workflow Steps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS = 24;

	/**
	 * The operation id for the '<em>Get Number Of Current Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP = 25;

	/**
	 * The operation id for the '<em>Get Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_NEXT_WORKFLOW_STEP = 26;

	/**
	 * The operation id for the '<em>Get Cur Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_CUR_WORKFLOW_STEP = 27;

	/**
	 * The operation id for the '<em>Reset Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___RESET_WORKFLOW_STEP = 28;

	/**
	 * The operation id for the '<em>Get Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___GET_EXECUTION_SYSTEM = 29;

	/**
	 * The operation id for the '<em>Init Log Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT___INIT_LOG_MESSAGE = 30;

	/**
	 * The number of operations of the '<em>IProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_OPERATION_COUNT = 31;

	/**
	 * The meta object id for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.ui.impl.DefaultProjectImpl
	 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
	 * @generated
	 */
	int DEFAULT_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__WORKFLOWS = IPROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__META_DATA = IPROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__CONFIG_SOURCE = IPROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__BASE_URI = IPROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__LOGGER = IPROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__FROM_JAR = IPROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Config Source String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING = IPROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tool Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__TOOL_DEFINITIONS = IPROJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__PACKAGES = IPROJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Config Workflow Def File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE = IPROJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Config Utility Def File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE = IPROJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Config Metadata File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__CONFIG_METADATA_FILE = IPROJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT__LOG_MESSAGE = IPROJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Default Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT_FEATURE_COUNT = IPROJECT_FEATURE_COUNT + 13;


	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___VALIDATE = IPROJECT___VALIDATE;

	/**
	 * The operation id for the '<em>Get Active Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_ACTIVE_WORKFLOW = IPROJECT___GET_ACTIVE_WORKFLOW;

	/**
	 * The operation id for the '<em>Clear Workflows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___CLEAR_WORKFLOWS = IPROJECT___CLEAR_WORKFLOWS;

	/**
	 * The operation id for the '<em>Read Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN = IPROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN;

	/**
	 * The operation id for the '<em>Read Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___READ_JSON__URI_BOOLEAN = IPROJECT___READ_JSON__URI_BOOLEAN;

	/**
	 * The operation id for the '<em>Set Config And Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___SET_CONFIG_AND_BASE_PATH__STRING = IPROJECT___SET_CONFIG_AND_BASE_PATH__STRING;

	/**
	 * The operation id for the '<em>Apply Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___APPLY_META_DATA = IPROJECT___APPLY_META_DATA;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___INIT__EASYFLOWGRAPH = IPROJECT___INIT__EASYFLOWGRAPH;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___DELETE = IPROJECT___DELETE;

	/**
	 * The operation id for the '<em>Run Entire Workflow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RUN_ENTIRE_WORKFLOW = IPROJECT___RUN_ENTIRE_WORKFLOW;

	/**
	 * The operation id for the '<em>Resolve Traversal Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RESOLVE_TRAVERSAL_CRITERIA = IPROJECT___RESOLVE_TRAVERSAL_CRITERIA;

	/**
	 * The operation id for the '<em>Generate Abstract Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GENERATE_ABSTRACT_GRAPH = IPROJECT___GENERATE_ABSTRACT_GRAPH;

	/**
	 * The operation id for the '<em>Apply Grouping Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___APPLY_GROUPING_CRITERIA = IPROJECT___APPLY_GROUPING_CRITERIA;

	/**
	 * The operation id for the '<em>Apply Parameter Criteria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___APPLY_PARAMETER_CRITERIA = IPROJECT___APPLY_PARAMETER_CRITERIA;

	/**
	 * The operation id for the '<em>Resolve Utility Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RESOLVE_UTILITY_TASKS = IPROJECT___RESOLVE_UTILITY_TASKS;

	/**
	 * The operation id for the '<em>Resolve Preprocessing Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RESOLVE_PREPROCESSING_TASKS = IPROJECT___RESOLVE_PREPROCESSING_TASKS;

	/**
	 * The operation id for the '<em>Resolve Tool Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RESOLVE_TOOL_DEPENDENCIES = IPROJECT___RESOLVE_TOOL_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Generate Worklow For Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM = IPROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM;

	/**
	 * The operation id for the '<em>Set Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___SET_WORKER__EASYFLOWOVERALLWORKER = IPROJECT___SET_WORKER__EASYFLOWOVERALLWORKER;

	/**
	 * The operation id for the '<em>Run Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RUN_NEXT_WORKFLOW_STEP = IPROJECT___RUN_NEXT_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Run Prev Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RUN_PREV_WORKFLOW_STEP = IPROJECT___RUN_PREV_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Has Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___HAS_NEXT_WORKFLOW_STEP = IPROJECT___HAS_NEXT_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Get Workflow Step Label For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING = IPROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING;

	/**
	 * The operation id for the '<em>Get Workflow Step Desc For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING = IPROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING;

	/**
	 * The operation id for the '<em>Get Total Number Of Workflow Steps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS = IPROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS;

	/**
	 * The operation id for the '<em>Get Number Of Current Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP = IPROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Get Next Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_NEXT_WORKFLOW_STEP = IPROJECT___GET_NEXT_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Get Cur Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_CUR_WORKFLOW_STEP = IPROJECT___GET_CUR_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Reset Workflow Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___RESET_WORKFLOW_STEP = IPROJECT___RESET_WORKFLOW_STEP;

	/**
	 * The operation id for the '<em>Get Execution System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___GET_EXECUTION_SYSTEM = IPROJECT___GET_EXECUTION_SYSTEM;

	/**
	 * The operation id for the '<em>Init Log Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT___INIT_LOG_MESSAGE = IPROJECT___INIT_LOG_MESSAGE;

	/**
	 * The number of operations of the '<em>Default Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PROJECT_OPERATION_COUNT = IPROJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link easyflow.ui.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject</em>'.
	 * @see easyflow.ui.IProject
	 * @generated
	 */
	EClass getIProject();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see easyflow.ui.IProject#validate()
	 * @generated
	 */
	EOperation getIProject__Validate();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getActiveWorkflow() <em>Get Active Workflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Workflow</em>' operation.
	 * @see easyflow.ui.IProject#getActiveWorkflow()
	 * @generated
	 */
	EOperation getIProject__GetActiveWorkflow();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#clearWorkflows() <em>Clear Workflows</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Workflows</em>' operation.
	 * @see easyflow.ui.IProject#clearWorkflows()
	 * @generated
	 */
	EOperation getIProject__ClearWorkflows();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#readConfiguration(net.sf.json.JSONObject, boolean) <em>Read Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Configuration</em>' operation.
	 * @see easyflow.ui.IProject#readConfiguration(net.sf.json.JSONObject, boolean)
	 * @generated
	 */
	EOperation getIProject__ReadConfiguration__JSONObject_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#readJson(java.net.URI, boolean) <em>Read Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Json</em>' operation.
	 * @see easyflow.ui.IProject#readJson(java.net.URI, boolean)
	 * @generated
	 */
	EOperation getIProject__ReadJson__URI_boolean();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#setConfigAndBasePath(java.lang.String) <em>Set Config And Base Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Config And Base Path</em>' operation.
	 * @see easyflow.ui.IProject#setConfigAndBasePath(java.lang.String)
	 * @generated
	 */
	EOperation getIProject__SetConfigAndBasePath__String();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#applyMetaData() <em>Apply Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Meta Data</em>' operation.
	 * @see easyflow.ui.IProject#applyMetaData()
	 * @generated
	 */
	EOperation getIProject__ApplyMetaData();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#init(easyflow.custom.jgraphx.editor.EasyFlowGraph) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see easyflow.ui.IProject#init(easyflow.custom.jgraphx.editor.EasyFlowGraph)
	 * @generated
	 */
	EOperation getIProject__Init__EasyFlowGraph();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see easyflow.ui.IProject#delete()
	 * @generated
	 */
	EOperation getIProject__Delete();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#runEntireWorkflow() <em>Run Entire Workflow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Entire Workflow</em>' operation.
	 * @see easyflow.ui.IProject#runEntireWorkflow()
	 * @generated
	 */
	EOperation getIProject__RunEntireWorkflow();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#resolveTraversalCriteria() <em>Resolve Traversal Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Traversal Criteria</em>' operation.
	 * @see easyflow.ui.IProject#resolveTraversalCriteria()
	 * @generated
	 */
	EOperation getIProject__ResolveTraversalCriteria();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#generateAbstractGraph() <em>Generate Abstract Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Abstract Graph</em>' operation.
	 * @see easyflow.ui.IProject#generateAbstractGraph()
	 * @generated
	 */
	EOperation getIProject__GenerateAbstractGraph();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#applyGroupingCriteria() <em>Apply Grouping Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Grouping Criteria</em>' operation.
	 * @see easyflow.ui.IProject#applyGroupingCriteria()
	 * @generated
	 */
	EOperation getIProject__ApplyGroupingCriteria();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#applyParameterCriteria() <em>Apply Parameter Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Parameter Criteria</em>' operation.
	 * @see easyflow.ui.IProject#applyParameterCriteria()
	 * @generated
	 */
	EOperation getIProject__ApplyParameterCriteria();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#resolveUtilityTasks() <em>Resolve Utility Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Utility Tasks</em>' operation.
	 * @see easyflow.ui.IProject#resolveUtilityTasks()
	 * @generated
	 */
	EOperation getIProject__ResolveUtilityTasks();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#resolvePreprocessingTasks() <em>Resolve Preprocessing Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Preprocessing Tasks</em>' operation.
	 * @see easyflow.ui.IProject#resolvePreprocessingTasks()
	 * @generated
	 */
	EOperation getIProject__ResolvePreprocessingTasks();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#resolveToolDependencies() <em>Resolve Tool Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Tool Dependencies</em>' operation.
	 * @see easyflow.ui.IProject#resolveToolDependencies()
	 * @generated
	 */
	EOperation getIProject__ResolveToolDependencies();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#generateWorklowForExecutionSystem() <em>Generate Worklow For Execution System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Worklow For Execution System</em>' operation.
	 * @see easyflow.ui.IProject#generateWorklowForExecutionSystem()
	 * @generated
	 */
	EOperation getIProject__GenerateWorklowForExecutionSystem();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#setWorker(easyflow.custom.jgraphx.EasyFlowOverallWorker) <em>Set Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Worker</em>' operation.
	 * @see easyflow.ui.IProject#setWorker(easyflow.custom.jgraphx.EasyFlowOverallWorker)
	 * @generated
	 */
	EOperation getIProject__SetWorker__EasyFlowOverallWorker();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#runNextWorkflowStep() <em>Run Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Next Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#runNextWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__RunNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#runPrevWorkflowStep() <em>Run Prev Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Prev Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#runPrevWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__RunPrevWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#hasNextWorkflowStep() <em>Has Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Next Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#hasNextWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__HasNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getWorkflowStepLabelFor(java.lang.String) <em>Get Workflow Step Label For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workflow Step Label For</em>' operation.
	 * @see easyflow.ui.IProject#getWorkflowStepLabelFor(java.lang.String)
	 * @generated
	 */
	EOperation getIProject__GetWorkflowStepLabelFor__String();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getWorkflowStepDescFor(java.lang.String) <em>Get Workflow Step Desc For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workflow Step Desc For</em>' operation.
	 * @see easyflow.ui.IProject#getWorkflowStepDescFor(java.lang.String)
	 * @generated
	 */
	EOperation getIProject__GetWorkflowStepDescFor__String();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getTotalNumberOfWorkflowSteps() <em>Get Total Number Of Workflow Steps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Number Of Workflow Steps</em>' operation.
	 * @see easyflow.ui.IProject#getTotalNumberOfWorkflowSteps()
	 * @generated
	 */
	EOperation getIProject__GetTotalNumberOfWorkflowSteps();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getNumberOfCurrentWorkflowStep() <em>Get Number Of Current Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Of Current Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#getNumberOfCurrentWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__GetNumberOfCurrentWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getNextWorkflowStep() <em>Get Next Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#getNextWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__GetNextWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getCurWorkflowStep() <em>Get Cur Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cur Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#getCurWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__GetCurWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#resetWorkflowStep() <em>Reset Workflow Step</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Workflow Step</em>' operation.
	 * @see easyflow.ui.IProject#resetWorkflowStep()
	 * @generated
	 */
	EOperation getIProject__ResetWorkflowStep();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#getExecutionSystem() <em>Get Execution System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Execution System</em>' operation.
	 * @see easyflow.ui.IProject#getExecutionSystem()
	 * @generated
	 */
	EOperation getIProject__GetExecutionSystem();

	/**
	 * Returns the meta object for the '{@link easyflow.ui.IProject#initLogMessage() <em>Init Log Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Log Message</em>' operation.
	 * @see easyflow.ui.IProject#initLogMessage()
	 * @generated
	 */
	EOperation getIProject__InitLogMessage();

	/**
	 * Returns the meta object for class '{@link easyflow.ui.DefaultProject <em>Default Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Project</em>'.
	 * @see easyflow.ui.DefaultProject
	 * @generated
	 */
	EClass getDefaultProject();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see easyflow.ui.DefaultProject#getWorkflows()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Workflows();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.ui.DefaultProject#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Data</em>'.
	 * @see easyflow.ui.DefaultProject#getMetaData()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getConfigSource <em>Config Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Source</em>'.
	 * @see easyflow.ui.DefaultProject#getConfigSource()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_ConfigSource();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see easyflow.ui.DefaultProject#getBaseURI()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_BaseURI();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.ui.DefaultProject#getLogger()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_Logger();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#isFromJar <em>From Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Jar</em>'.
	 * @see easyflow.ui.DefaultProject#isFromJar()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_FromJar();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getDefaultConfigSourceString <em>Default Config Source String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Config Source String</em>'.
	 * @see easyflow.ui.DefaultProject#getDefaultConfigSourceString()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_DefaultConfigSourceString();

	/**
	 * Returns the meta object for the reference '{@link easyflow.ui.DefaultProject#getToolDefinitions <em>Tool Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool Definitions</em>'.
	 * @see easyflow.ui.DefaultProject#getToolDefinitions()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_ToolDefinitions();

	/**
	 * Returns the meta object for the map '{@link easyflow.ui.DefaultProject#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Packages</em>'.
	 * @see easyflow.ui.DefaultProject#getPackages()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_Packages();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getConfigWorkflowDefFile <em>Config Workflow Def File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Workflow Def File</em>'.
	 * @see easyflow.ui.DefaultProject#getConfigWorkflowDefFile()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_ConfigWorkflowDefFile();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getConfigUtilityDefFile <em>Config Utility Def File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Utility Def File</em>'.
	 * @see easyflow.ui.DefaultProject#getConfigUtilityDefFile()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_ConfigUtilityDefFile();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.ui.DefaultProject#getConfigMetadataFile <em>Config Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Metadata File</em>'.
	 * @see easyflow.ui.DefaultProject#getConfigMetadataFile()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EAttribute getDefaultProject_ConfigMetadataFile();

	/**
	 * Returns the meta object for the reference '{@link easyflow.ui.DefaultProject#getLogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log Message</em>'.
	 * @see easyflow.ui.DefaultProject#getLogMessage()
	 * @see #getDefaultProject()
	 * @generated
	 */
	EReference getDefaultProject_LogMessage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link easyflow.ui.IProject <em>IProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.IProject
		 * @see easyflow.ui.impl.UiPackageImpl#getIProject()
		 * @generated
		 */
		EClass IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___VALIDATE = eINSTANCE.getIProject__Validate();

		/**
		 * The meta object literal for the '<em><b>Get Active Workflow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_ACTIVE_WORKFLOW = eINSTANCE.getIProject__GetActiveWorkflow();

		/**
		 * The meta object literal for the '<em><b>Clear Workflows</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___CLEAR_WORKFLOWS = eINSTANCE.getIProject__ClearWorkflows();

		/**
		 * The meta object literal for the '<em><b>Read Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN = eINSTANCE.getIProject__ReadConfiguration__JSONObject_boolean();

		/**
		 * The meta object literal for the '<em><b>Read Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___READ_JSON__URI_BOOLEAN = eINSTANCE.getIProject__ReadJson__URI_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Config And Base Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___SET_CONFIG_AND_BASE_PATH__STRING = eINSTANCE.getIProject__SetConfigAndBasePath__String();

		/**
		 * The meta object literal for the '<em><b>Apply Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___APPLY_META_DATA = eINSTANCE.getIProject__ApplyMetaData();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___INIT__EASYFLOWGRAPH = eINSTANCE.getIProject__Init__EasyFlowGraph();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___DELETE = eINSTANCE.getIProject__Delete();

		/**
		 * The meta object literal for the '<em><b>Run Entire Workflow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RUN_ENTIRE_WORKFLOW = eINSTANCE.getIProject__RunEntireWorkflow();

		/**
		 * The meta object literal for the '<em><b>Resolve Traversal Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RESOLVE_TRAVERSAL_CRITERIA = eINSTANCE.getIProject__ResolveTraversalCriteria();

		/**
		 * The meta object literal for the '<em><b>Generate Abstract Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GENERATE_ABSTRACT_GRAPH = eINSTANCE.getIProject__GenerateAbstractGraph();

		/**
		 * The meta object literal for the '<em><b>Apply Grouping Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___APPLY_GROUPING_CRITERIA = eINSTANCE.getIProject__ApplyGroupingCriteria();

		/**
		 * The meta object literal for the '<em><b>Apply Parameter Criteria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___APPLY_PARAMETER_CRITERIA = eINSTANCE.getIProject__ApplyParameterCriteria();

		/**
		 * The meta object literal for the '<em><b>Resolve Utility Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RESOLVE_UTILITY_TASKS = eINSTANCE.getIProject__ResolveUtilityTasks();

		/**
		 * The meta object literal for the '<em><b>Resolve Preprocessing Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RESOLVE_PREPROCESSING_TASKS = eINSTANCE.getIProject__ResolvePreprocessingTasks();

		/**
		 * The meta object literal for the '<em><b>Resolve Tool Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RESOLVE_TOOL_DEPENDENCIES = eINSTANCE.getIProject__ResolveToolDependencies();

		/**
		 * The meta object literal for the '<em><b>Generate Worklow For Execution System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM = eINSTANCE.getIProject__GenerateWorklowForExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Set Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___SET_WORKER__EASYFLOWOVERALLWORKER = eINSTANCE.getIProject__SetWorker__EasyFlowOverallWorker();

		/**
		 * The meta object literal for the '<em><b>Run Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RUN_NEXT_WORKFLOW_STEP = eINSTANCE.getIProject__RunNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Run Prev Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RUN_PREV_WORKFLOW_STEP = eINSTANCE.getIProject__RunPrevWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Has Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___HAS_NEXT_WORKFLOW_STEP = eINSTANCE.getIProject__HasNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Workflow Step Label For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING = eINSTANCE.getIProject__GetWorkflowStepLabelFor__String();

		/**
		 * The meta object literal for the '<em><b>Get Workflow Step Desc For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING = eINSTANCE.getIProject__GetWorkflowStepDescFor__String();

		/**
		 * The meta object literal for the '<em><b>Get Total Number Of Workflow Steps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS = eINSTANCE.getIProject__GetTotalNumberOfWorkflowSteps();

		/**
		 * The meta object literal for the '<em><b>Get Number Of Current Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP = eINSTANCE.getIProject__GetNumberOfCurrentWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Next Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_NEXT_WORKFLOW_STEP = eINSTANCE.getIProject__GetNextWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Cur Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_CUR_WORKFLOW_STEP = eINSTANCE.getIProject__GetCurWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Reset Workflow Step</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___RESET_WORKFLOW_STEP = eINSTANCE.getIProject__ResetWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Get Execution System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___GET_EXECUTION_SYSTEM = eINSTANCE.getIProject__GetExecutionSystem();

		/**
		 * The meta object literal for the '<em><b>Init Log Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROJECT___INIT_LOG_MESSAGE = eINSTANCE.getIProject__InitLogMessage();

		/**
		 * The meta object literal for the '{@link easyflow.ui.impl.DefaultProjectImpl <em>Default Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.ui.impl.DefaultProjectImpl
		 * @see easyflow.ui.impl.UiPackageImpl#getDefaultProject()
		 * @generated
		 */
		EClass DEFAULT_PROJECT = eINSTANCE.getDefaultProject();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__WORKFLOWS = eINSTANCE.getDefaultProject_Workflows();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__META_DATA = eINSTANCE.getDefaultProject_MetaData();

		/**
		 * The meta object literal for the '<em><b>Config Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__CONFIG_SOURCE = eINSTANCE.getDefaultProject_ConfigSource();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__BASE_URI = eINSTANCE.getDefaultProject_BaseURI();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__LOGGER = eINSTANCE.getDefaultProject_Logger();

		/**
		 * The meta object literal for the '<em><b>From Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__FROM_JAR = eINSTANCE.getDefaultProject_FromJar();

		/**
		 * The meta object literal for the '<em><b>Default Config Source String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING = eINSTANCE.getDefaultProject_DefaultConfigSourceString();

		/**
		 * The meta object literal for the '<em><b>Tool Definitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__TOOL_DEFINITIONS = eINSTANCE.getDefaultProject_ToolDefinitions();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__PACKAGES = eINSTANCE.getDefaultProject_Packages();

		/**
		 * The meta object literal for the '<em><b>Config Workflow Def File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE = eINSTANCE.getDefaultProject_ConfigWorkflowDefFile();

		/**
		 * The meta object literal for the '<em><b>Config Utility Def File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE = eINSTANCE.getDefaultProject_ConfigUtilityDefFile();

		/**
		 * The meta object literal for the '<em><b>Config Metadata File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_PROJECT__CONFIG_METADATA_FILE = eINSTANCE.getDefaultProject_ConfigMetadataFile();

		/**
		 * The meta object literal for the '<em><b>Log Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_PROJECT__LOG_MESSAGE = eINSTANCE.getDefaultProject_LogMessage();

	}

} //UiPackage
