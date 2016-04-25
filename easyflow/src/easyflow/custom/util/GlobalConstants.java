package easyflow.custom.util;

public class GlobalConstants {

	private static final String METADATA = "metadata";

	public static final double defaultCellXPos = 400;
	public static final double defaultCellYPos = 100;
	public static final double defaultCellWidth = 200;
	public static final double defaultCellHeight = 40;

	public static final String TRAVERSAL_CRITERION_RECORD = "Record";
	public static final String METADATA_INPUT = "InputFiles";
	public static final String GROUPING_MODE_JOINT = "joint";
	public static final String GROUPING_MODE_BATCH = "batch";
	public static final String DEFAULT_TEMPLATE_PARAM_NAME = "default_param";
	public static final String ANY_TEMPLATE_PARAM_NAME = "any";
	public static final String PARAM_OPTIONAL = "opt";
	public static final String PARAM_POSITIONAL = "pos";
	public static final String PARAM_INPUT = "in";
	public static final String PARAM_OUTPUT = "out";

	public static final String NAME_FILE_HANDLE = "file";
	public static final String NAME_PIPE_HANDLE = "pipe";
	public static final String NAME_STDIN_HANDLE = "stdin";
	public static final String NAME_STDOUT_HANDLE = "stdout";
	public static final String DEFAULT_PIPE_OPERATOR = "|";
	public static final String FILE_HANDLE_PARAM_NAME = "file_handle";
	public static final String DEFAULT_STDOUT_HANDLE = "";
	public static final String DEFAULT_STDIN_HANDLE = "-";
	public static final String PREFERRED_HANDLE_PARAM_NAME = "preferred_handle";

	public static final String BOOLEAN_TRUE_VALUE = "true";
	public static final String BOOLEAN_FALSE_VALUE = "false";
	
	public static final String UTILITY_TASK_FILTER_NAME = "filter";
	public static final String UTILITY_TASK_MERGE_NAME = "merge";

	//
	public static final String ABSTRACT_NODES_RESOLVED = "abstractNodesResovled";
	public static final String ABSTRACT_WORKFLOW_GENERATED = "abstractWorkflowGenerated";
	public static final String TRAVERSAL_EVENTS_RESOLVED = "traversalEventsResolved";
	public static final String GROUPING_APPLIED = "groupingCriteriaApplied";
	public static final String PARAMETER_APPLIED = "parameterCriteriaApplied";
	public static final String INCOMPATIBLE_GROUPINGS_RESOLVED = "incompatibleGroupingsResolved";
	public static final String PREPROCESSING_TASKS_RESPOLVED = "preprocessingTasksResolved";
	public static final String TOOL_DEPS_RESOLVED = "toolDepsResolved";
	public static final String EXEC_WORKFLOW_GENERATED = "execWorkflowGenerated";
	public static final String FINISHED = "finished";
	public static final String START = "start";

	//
	public static final String GENERATE_EXECUTABLE_WORKFLOW = "genExecWorkflow";
	public static final String RESOLVE_TOOL_DEPS = "resolveToolDeps";
	public static final String RESOLVE_PREPROCESSING_TASKS = "resolvePreocessingTasks";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS = "resolveIncompatibleGroupings";
	public static final String APPLY_GROUPINGS = "applyGroupings";
	public static final String APPLY_PARAMETERS = "applyParameters";
	public static final String RESOLVE_TRAVERSAL_EVENTS = "resolveTraversalEvents";
	public static final String GENERATE_ABSTRACT_WORKFLOW = "generateAbstractWorfklow";

	public static final String GENERATE_EXECUTABLE_WORKFLOW_DESCRIPTION = "Generate executable workflow.";
	public static final String RESOLVE_TOOL_DEPS_DESCRIPTION = "Resolve tools input and output parameters.";
	public static final String RESOLVE_PREPROCESSING_TASKS_DESCRIPTION = "Resolve preprocessing tasks.";
	public static final String GENERATE_ABSTRACT_GRAPH_DESCRIPTION = "The abstract Workflow is computed based on the Workflow template.";
	public static final String RESOLVE_TRAVERSAL_EVENTS_DESCRIPTION = "Defined parameter and grouping criteria are resolved.";
	public static final String APPLY_GROUPING_DESCRIPTION = "The metadata are applied to generate a concrete graph.";
	public static final String APPLY_PARAMETER_DESCRIPTION = "The paremeter definitions are applied to generate a concrete graph.";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS_DESCRIPTION = "Utility Tasks are included in case of incompatible groupings.";

	public static final String GENERATE_ABSTRACT_GRAPH_LABEL = "Generate Abstract Graph";
	public static final String RESOLVE_TRAVERSAL_EVENTS_LABEL = "Resolve Traversal Criteria";
	public static final String APPLY_GROUPING_LABEL = "Apply Grouping Criteria";
	public static final String APPLY_PARAMETER_LABEL = "Apply Parameter Criteria";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS_LABEL = "Resolve incompatible Groupings";
	public static final String RESOLVE_TOOL_DEPS_LABEL = "Resolve tools input and output parameters";
	public static final String RESOLVE_PREPROCESSING_TASKS_LABEL = "Resolve preprocessing tasks";
	public static final String RESOVLE_UTILTY_LABEL = "Resolve utility tasks";
	public static final String GENERATE_EXECUTABLE_WORKFLOW_LABEL = "Generate executable workflow";

	public static final String FINISHED_LABEL = "finished";
	public static final String START_LABEL = "Initialization";
	public static final String FINISHED_DESCRIPTION = "Workflow composition finished";
	public static final String START_DESCRIPTION = "Workflow composition not yet started";

	public static final String TEMPLATE_TASK_NAME = "_EasyFlowTemplateTask_";
	public static final String TEMPLATE_DATA_PORT_NAME = "_EasyFlowTemplatePort_";
	public static final String ROOT_TASK_NAME = "_root_";

	public static final String TRAVERSAL_CHUNK_SOURCE_TYPE_METADATA = METADATA;

	public static final String VERTEX_STYLE = "EASYFLOW_VERTEX_STYLE";
	public static final String EDGE_STYLE = "EASYFLOW_EDGE_STYLE";
	public static final String CIRCUMVENTING_TASK_EDGE_STYLE = "EASYFLOW_CIRCUMVENTING_TASK_EDGE_STYLE";
	public static final String MISSING_IN_OUT_DATAPORT_EDGE_STYLE = "EASYFLOW_MISSING_IN_OUT_DATAPORT_EDGE_STYLE";

	public static final String COMMAND_PART_VALUE_INTERPRETER = "interpreter";
	public static final String COMMAND_PART_VALUE_INTERPRETER_PARAM = "interpreter_param";
	public static final String COMMAND_PART_VALUE_EXE = "exe";
	public static final String COMMAND_PART_VALUE_MODULE = "module";
	public static final String COMMAND_PART_VALUE_PARAM = "param";

	public static final String DATA_INPUT_DIR = "input_dir";
	public static final String DATA_WORK_DIR = "work_dir";
	public static final String DATA_TMP_DIR = "tmp_dir";
	public static final String ANALYSIS_TYPE_INDEX = "index";

	public static final String ADD_EXTENSION_TO_FILENAME = "addExtensionToInput";
	public static final String REPLACE_EXTENSION_OF_FILENAME = "replaceExtensionOfInput";

	public static final String HOME_DIR = ".strup";
	public static final String DFLT_CONFIG_FILE = URIUtil.createPath(HOME_DIR,
			"config.json");

	public static final String WORKFLOW_DEF_FILE_PARAM_NAME = "workflow_definition_file";
	public static final String UTILITY_DEF_FILE_PARAM_NAME = "utility_definition_file";
	public static final String WORKFLOW_DIR_PARAM_NAME = "workflow_dir";

	public static final String PKG_CFG_FILE_PARAM_NAME = "pkg_config_file";

	public static final String METADATA_FILE_PARAM_NAME = "metadata_file";
	public static final String METADATA_DIR_PARAM_NAME = "metadata_dir";

	public static final String EXEC_SYS_PARAM_NAME = "execution_system";
	public static final String EXEC_SYS_OUT_FILE_PARAM_NAME = "execution_system_output_file";
	public static final String INPUT_DIR_PARAM_NAME = "input_dir";
	public static final String WORK_DIR_PARAM_NAME = "work_dir";
	public static final String TMP_DIR_PARAM_NAME = "tmp_dir";
	public static final String CMD_PATTERN_PARAM_NAME = "command_pattern";
	public static final String TOOL_DEF_DIR_PARAM_NAME = "def_dir";
	public static final String TOOL_CFG_FILE_PARAM_NAME = "tool_config_file";
	public static final String TOOL_CFG_DIR_PARAM_NAME = "config_dir";

	public static final String WORKFLOW_CFG_INPUT_PARAM_NAME = "inputs";
	public static final String WORKFLOW_CFG_STATIC_INPUT_PARAM_NAME = "static_inputs";

	public static final String DEFAULT_PKG_CONFIG_FILE_NAME = "pkg_config.json";
	public static final String DEFAULT_TOOL_CONFIG_FILE_NAME = "tool_config.json";
	public static final String DEFAULT_TOOL_CONFIG_DIR_NAME = "tool_configuration";
	public static final String DEFAULT_TOOL_DEF_DIR_NAME = "tool_definition";
	public static final String DEFAULT_TOOL_CONFIG_FILES_DIR_NAME = "tool";
	public static final String DEFAULT_PKG_CONFIG_FILES_DIR_NAME = "pkg";
	public static final String DEFAULT_GROUPING_CRITERIA_PARAM_NAME = "default_grouping_criteria";
	public static final String DEFAULT_WORKFLOW_MODE_PARAM_NAME = "default_mode";

	public static final String IS_CONTRAST_PARAM_NAME = "is_contrast";
	public static final String USE_INTERVAL_PARAM_NAME = "use_interval_list";
	public static final String SPLIT_BY_CHUNKS_PARAM_NAME = "split_by_chunks";

	public static final String PARAM_TYPE_BOOLEAN_VALUE = "boolean";

	public static final String CONDITION_TYPE_DATA_PORT = "data_port";
	public static final String CONDITION_TYPE_DATA_FORMAT = "data_format";
	public static final String CONDITION_TYPE_FILE_HANDLE = "file_handle";

	public static final String CONDITION_TYPE_METADATA = METADATA;

	public static final int ANY_HANDLE  = 0;
	public static final int FILE_HANDLE = 1;
	public static final int PIPE_HANDLE = 2;
	
	public static final int UTILITY_TASK_DO_NOT_FILTER            = 0x1000;
	public static final int UTILITY_TASK_DO_NOT_MERGE             = 0x2000;
	public static final int UTILITY_TASK_DO_NOT_FILTER_BIT_POS    = 12;
	public static final int UTILITY_TASK_DO_NOT_MERGE_BIT_POS     = 13;
	
	public static final int MULTIPLE_DATAPORTS                    = 0x01;
	public static final int MULTIPLE_INSTANCES                    = 0x02;
	public static final int MULTIPLE_INSTANCES_PER_DATAPORT       = 0x04;

	public static final int PARAM_DATA_MATCH_STRATEGY_ANY         = 0;
	public static final int PARAM_DATA_MATCH_STRATEGY_DATA_PORT   = 1;
	public static final int PARAM_DATA_MATCH_STRATEGY_DATA_FORMAT = 2;
	public static final int PARAM_DATA_MATCH_STRATEGY_PARAM_KEY   = 3;

	public static final int RETRIEVE_DATA_PORT_STRATEGY_FIRST   = 0;
	public static final int RETRIEVE_DATA_PORT_STRATEGY_LAST    = 1;
	public static final int RETRIEVE_DATA_PORT_STRATEGY_PRIMARY = 2;

	public static final String COMMAND_LINE_PART_INPUT          = PARAM_INPUT;
	public static final String COMMAND_LINE_PART_OUTPUT         = PARAM_OUTPUT;
	public static final String COMMAND_LINE_PART_OPT_PARAMS     = PARAM_OPTIONAL;
	public static final String COMMAND_LINE_PART_POS_PARAMS     = PARAM_POSITIONAL;

	public static final String EXAMPLE_REPO_HEADER_NAME         = "Name";
	public static final String EXAMPLE_REPO_HEADER_CONFIG       = "Config";
	public static final String EXAMPLE_REPO_HEADER_WORKFLOW     = "Workflow";
	public static final String EXAMPLE_REPO_HEADER_UTIL         = "Utility";
	public static final String EXAMPLE_REPO_HEADER_FOLDER       = "Folder";

	public static final String EXAMPLE_REPO_HEADER_METADATA     = "Metadata";

	public static final String WORKFLOW_INPUT_GROUPING_CRITERION_PARAM_NAME = "input_grouping_criterion";

	public static final String CONFIGURATION_FILE_SECTION_PROJECT    = "project";
	public static final String CONFIGURATION_FILE_SECTION_WORKFLOW   = "workflow";
	public static final String CONFIGURATION_FILE_SECTION_TOOL       = "tool";
	public static final String CONFIGURATION_FILE_SECTION_CONTRAST   = "contrast";
	public static final String CONFIGURATION_FILE_SECTION_PROCESSING = "processing";
	public static final String CONFIGURATION_FILE_SECTION_CATALOG    = "catalog";

	public static final String GUI_LOG_MSG_STYLE_CATEGORY            = "LOG_MSG_STYLE_CATEGORY";
	public static final String GUI_LOG_MSG_STYLE_SEVERITY_LOW        = "LOG_MSG_STYLE_SEVERITY_LOW";
	public static final String GUI_LOG_MSG_STYLE_SEVERITY_HIGH       = "LOG_MSG_STYLE_SEVERITY_HIGH";
	public static final String GUI_LOG_MSG_STYLE_SEVERITY_MEDIUM     = "LOG_MSG_STYLE_SEVERITY_MEDIUM";
	public static final String GUI_LOG_MSG_STYLE_TEXT                = "LOG_MSG_STYLE_TEXT";

	public static final String GUI_LOG_MSG_STYLE_SEVERITY            = "LOG_MSG_STYLE_SEVERITY";

	// error/log msg descriptions
	// public static final String ERROR_STRING_VAR_PLACEHOLDERS[] =
	// {"$VAL1, $VAL2, $VAL3, $VAL4, $VAL5"};
	public static final String ERROR_STRING_VAR_PLACEHOLDER           = "$VAL";
	public static final String LOG_MSG_NO_VALID_DATA_HANDLE_AVAILABLE_BY_TOOL_1   = "No valid data handle found for tool \"$VAL\".";
	public static final String LOG_MSG_NO_VALID_DATA_HANDLE_AVAILABLE_BY_CONFIG_0 = "No valid data handle found due to configuration.";
	public static final String LOG_MSG_NO_TOOL_DEFINITION_FOUND_FOR_TOOL_1        = "Unable to find definition of tool \"$VAL\".";
	public static final String LOG_MSG_TOOL_DEFINITION_NOT_VALID_2                = "Unable to validate tool definition \"$VAL\" against schema \"$VAL\".";

	public static final String LOG_MSG_CONFIGURATION_FILE_NOT_FOUND_1             = "Could not find the specified/default configuration file \"$VAL\".";
	public static final String LOG_MSG_METADATA_FILE_NOT_FOUND_1                  = "Could not find the metadata file \"$VAL\".";
	public static final String LOG_MSG_WORKFLOW_TEMPLATE_NOT_FOUND_1              = "Could not find the workflow template \"$VAL\".";
	public static final String LOG_MSG_CONFIGRUATION_FILE_NOT_SPECIFIED_0         = "No configuration file specified.";
	public static final String LOG_MSG_METADATA_FILE_NOT_SPECIFIED_0              = "No metadata file specified.";
	public static final String LOG_MSG_WORKFLOW_TEMPLATE_NOT_SPECIFIED_0          = "No workflow template provided.";
	public static final String LOG_MSG_TOOL_DEFINITION_NOT_SPECIFIED_0            = "No tool definition provided.";

	public static final String LOG_MSG_CONFIGURATION_SECTION_MISSING_2            = "Section \"$VAL\" missing in configuration file \"$VAL\".";
	public static final String LOG_MSG_CONFIGURATION_PARAM_MISSING_1              = "Configuration file does not contain parameter \"$VAL\".";

	public static final String LOG_MSG_NO_VALID_DATA_HANDLE_AVAILABLE_0           = "No valid data handle provided.";
	// public static final String
	// LOG_MSG_NO_VALID_DATA_HANDLE_AVAILABLE_BY_CONFIG =
	// "Configuration does not provide a valid data handle.";

	public static final String LOG_MSG_WORKFLOW_TEMPLATE_FAILED_TO_READ_2         = "Failed to read workflow template \"$VAL\" with error: \"$VAL\".";

	public static final String LOG_MSG_GENERAL_IO_1 = "IO Error: \"$VAL\".";
	public static final String LOG_MSG_GENERAL_IO_2 = "IO Error: \"$VAL\". Filename: \"$VAL\"";

	public static final String LOG_MSG_CONFIGURATION_SECTION_MISSING_1 = "Section \"$VAL\" missing in configuration.";

	public static final String LOG_MSG_WORKFLOW_TEMPLATE_INVALID_TASK_2 = "Invalid task definition in workflow template detected: \"$VAL\". Detailed Error description: \"$VAL\".";
	public static final String LOG_MSG_WORKFLOW_TEMPLATE_INVALID_LINE_AT_2 = "Unable to process line \"$VAL\". Error: \"$VAL\".";
	public static final String LOG_MSG_METADATA_INVALID_METADATA_2 = "Invalid metadata definition detected: \"$VAL\". Detailed Error description: \"$VAL\".";
	public static final String LOG_MSG_METADATA_INVALID_LINE_AT_2 = "Unable to process line \"$VAL\". Error: \"$VAL\".";
	public static final String LOG_MSG_GENERIC_1 = "$VAL";
	public static final String LOG_MSG_METADATA_FAILED_TO_READ_2 = "Failed to read metadata \"$VAL\" with error: \"$VAL\".";
	public static final String LOG_MSG_TOOL_DEFINITION_FAILED_TO_VALIDATE_1 = "Failed to validate Tool definition from file \"$VAL\".";
	public static final String LOG_MSG_TOOL_DEFINITION_FAILED_TO_READ_2 = "Failed to read tool definition from file \"$VAL\". Error: \"$VAL\".";
	public static final String LOG_MSG_TOOL_DEFINITION_FAILED_TO_PARSE_2 = "Unable to parse tool definition from file \"$VAL\". Error \"$VAL\".";
	public static final String LOG_MSG_CREATE_URI_3 = "Unable to create URI from parts: \"$VAL\" and \"$VAL\". Error: \"$VAL\".";
	public static final String LOG_MSG_FAILED_TO_CREATE_JSON_OBJECT_2 = "Failed to create JSON Object from JSON File \"$VAL\" for section \"$VAL\".";
	public static final String LOG_MSG_WORKFLOW_TEMPLATE_FAILED_TO_READ_AT_LINE_3 = "Failed to read workflow template \"$VAL\" at line \"$VAL\" with error: \"$VAL\".";

	public static final String LOG_MSG_TOOL_DEFINITION_NOT_FOUND_FOR_TASK_2 = "Could not find definition for tool \"$VAL\" of task \"$VAL\".";

	public static final String LOG_MSG_TOOL_DEFINITION_PKG_NAME_DOES_NOT_MATCH_NAME_IN_WORKFLOW_4 = "The package name \"$VAL\" of tool \"$VAL\" does not match "
			+ "the package name \"$VAL\" as defined in workflow for task \"$VAL\".";

	public static final String LOG_MSG_ABSTRACT_GRAPH_LINK_TASK_TO_ROOT_2 = "Could not find matching Dataport for task \"$VAL\" (Dataport=\"$VAL\"). Link to root node.";

	public static final String LOG_MSG_ABSTRACT_GRAPH_NO_IMPLEMENTING_TOOL_FOR_TASK_1 = "Could not find tool that implements all Dataports for Task \"$VAL\".";

	public static final String LOG_MSG_ABSTRACT_GRAPH_NUM_VERTEX_CREATED_1 = "$VAL vertices created.";

	public static final String LOG_MSG_ABSTRACT_GRAPH_NUM_TOOLS_AVAILABLE_1 = "$VAL tools available.";

	public static final String LOG_MSG_ABSTRACT_GRAPH_NUM_EDGES_CREATED_2 = "$VAL edges inserted. ($VAL edges inserted to root node.)";

	public static final String LOG_MSG_SUBGRAPH_COMPUTE_START_1 = "Compute Subgraph for traversal event $VAL";
	public static final String LOG_MSG_SUBGRAPH_NO_MERGE_TASK_IN_TRAVERSAL_EVENT_1 = "No merge task found for traversal event $VAL";
	public static final String LOG_MSG_SUBGRAPH_COMPUTE_END_1 = "Compute Subgraph finished with $VAL vertices.";
	public static final String LOG_MSG_SUBGRAPH_COMPUTE_END_2 = "Compute Subgraph for traversal event $VAL finished with $VAL vertices.";

	public static final String LOG_MSG_CONFIGURATION_READ_METADATA_FILE_1 = "Metadata file set as \"$VAL\".";

	public static final String LOG_MSG_CONFIGURATION_READ_WORKFLOW_FILE_1 = "Workflow definition file set as \"$VAL\".";

	public static final String LOG_MSG_CONFIGURATION_READ_CONFIG_FILE_1 = "Configuration file set as \"$VAL\".";

	public static final String LOG_MSG_CONFIGURATION_BASE_URI_1 = "Base URI set to \"$VAL\".";

	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_COPY_GRAPH_END_1 = "Number of vertices copied: $VAL.";

	public static final String WORKFLOW_CFG_INPUT_MAP_PARAM_NAME = "inputs_map";
	public static final String WORKFLOW_CFG_STATIC_INPUT_MAP_PARAM_NAME = "static_inputs_map";

	public static final String LOG_MSG_GRAPH_UTIL_INVALID_DATAPORRT_FOR_TASK_3 = "$VAL Dataport is invalid/undefined while computing Utilitytask \"$VAL\" for Task \"$VAL\".";

	public static final String LOG_MSG_WORKFLOW_FAILED_0 = "Workflow composition failed.";

	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_COPY_GRAPH_NO_VERTICES_COPIED_0 = "No vertices selected.";

	public static final String LOG_MSG_WORKFLOW_PROCESS_NUM_TRAVERSAL_EVENTS_2 = "Process $VAL traversal events of type \"$VAL\".";

	public static final String LOG_MSG_TASK_NOT_FOUND_EXCEPTION_0 = "Task not found for vertex.";

	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_GROUPING_5 = "Resolve local graph [$VAL]->[$VAL] "
			+ "in $VAL-mode for Group \"$VAL\" and Metadata instances [$VAL].";
	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_PARAMETER_5 = "Resolve local graph [$VAL]->[$VAL] "
			+ "in $VAL-mode for Parameter \"$VAL\" and values [$VAL].";

	public static final int DEBUG_LEVEL_TRACE = 5;
	public static final int DEBUG_LEVEL_DEBUG = 4;
	public static final int DEBUG_LEVEL_INFO = 3;
	public static final int DEBUG_LEVEL_WARN = 2;
	public static final int DEBUG_LEVEL_ERROR = 1;
	public static final int DEBUG_LEVEL_FATAL = 0;
	public static final int DEFAULT_DEBUG_LEVEL = DEBUG_LEVEL_INFO;

	public static final String WORKFLOW_CFG_DEBUG_LEVEL_PARAM_NAME = "debug_level";

	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_REMOVE_MERGE_TASK_DUE_TO_CONDITION_2 = "Task \"$VAL\" to be removed because no ingoing dataports other than the one omitted by condition \"$VAL\".";

	public static final String LOG_MSG_APPLY_TRAVERSAL_EVENT_SKIP_CONDITIONAL_TASK_2 = "Skip task \"$VAL\" due to unmet condition: \"$VAL\"";

	public static final String LOG_MSG_GRAPH_UTIL_NO_TASK_FOR_ANALYSIS_TYPE_3 = "No Utility Task found for Dataport $VAL and Task $VAL and Analysis type $VAL.";

	public static final String LOG_MSG_GRAPH_UTIL_NO_TASK_FOR_UTILLITY_TASK_4 = "Could not find Utility Task $VAL to resolve Datalink \"$VAL\"."
			+ "between \"$VAL\" and \"$VAL\".";

	public static final String LOG_MSG_TASK_NOT_FOUND_0 = "Could not find Task.";

	public static final String LOG_MSG_DATALINK_NOT_FOUND_0 = "Could not find Datalink.";

	public static final String LOG_MSG_GROUPING_CRITERION_INSTANCE_NOT_FOUND_0 = "Could not find grouping instance.";

	public static final String LOG_MSG_DATAPORT_NOT_FOUND_0 = "Could not find dataport.";

	public static final String LOG_MSG_TOOL_NOT_FOUND_0 = "Could not find tool.";

	public static final String LOG_MSG_UTILITY_TASK_NOT_FOUND_0 = "Could not find utility task.";

	public static final String LOG_MSG_INVALID_DATA_PORT_FOUND_0 = "Invalid Dataport found.";

	public static final String LOG_MSG_UTILITY_ADD_UTILITY_TASK_3 = "Add utility task \"$VAL\" for task \"$VAL\" and datalink \"$VAL\".";

	public static final String LOG_MSG_WORKFLOW_RESOLVE_INCOMPATIBLE_GROUPING_FOR_TASK_1 = "Resolve incompatible grouping for task \"$VAL\".";

	public static final String LOG_MSG_WORKFLOW_FOUND_NUM_INCOMPATIBLE_GROUPINGS_1 = "Found $VAL incompatible groupings.";

	public static final String LOG_MSG_UTILITY_MERGE_TASKS_3 = "Add merge \"$VAL\" for [$VAL] and task \"$VAL\".";

	public static final String LOG_MSG_TOOL_DEPENDENCY_FAILED_TO_RETRIEVE_TOOL_DATA_4 = "Failed to retrieve $VAL data for task \"$VAL\", tool \"$VAL\" and datalink \"$VAL\".";

	public static final String LOG_MSG_TOOL_DEPENDENCY_FAILED_TO_RETRIEVE_TOOL_DATA_PARAMETER_5 = "Failed to retrieve data parameter name for task \"$VAL\", tool \"$VAL\", data port \"$VAL\", parameter \"$VAL\".";

	public static final String CONVERT_GROUPING_ANY = "any";

	public static final String CONVERT_GROUPING_NONE = "none";	

}
