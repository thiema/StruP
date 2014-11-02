package easyflow.custom.util;

import easyflow.tool.ResolvedParam;

public class GlobalConstants {

	private static final String METADATA = "metadata";
	
	
	public static final double defaultCellXPos   = 400;
	public static final double defaultCellYPos   = 100;
	public static final double defaultCellWidth  = 200;
	public static final double defaultCellHeight =  40;
	public static final String TRAVERSAL_CRITERION_RECORD = "Record";
	public static final String METADATA_INPUT             = "InputFiles";
	public static final String GROUPING_MODE_JOINT        = "joint";
	public static final String GROUPING_MODE_BATCH        = "batch";
	public static final String DEFAULT_TEMPLATE_PARAM_NAME= "default_param";
	public static final String ANY_TEMPLATE_PARAM_NAME    = "any";
	public static final String PARAM_OPTIONAL             = "opt";
	public static final String PARAM_POSITIONAL           = "pos";
	public static final String PARAM_INPUT                = "in";
	public static final String PARAM_OUTPUT               = "out";
	
	public static final String NAME_FILE_HANDLE = "file";
	public static final String NAME_PIPE_HANDLE = "pipe";
	
	
	//
	public static final String ABSTRACT_NODES_RESOLVED           = "abstractNodesResovled";
	public static final String ABSTRACT_WORKFLOW_GENERATED       = "abstractWorkflowGenerated";
	public static final String TRAVERSAL_EVENTS_RESOLVED         = "traversalEventsResolved";
	public static final String GROUPING_APPLIED                  = "groupingCriteriaApplied";
	public static final String PARAMETER_APPLIED                 = "parameterCriteriaApplied";
	public static final String INCOMPATIBLE_GROUPINGS_RESOLVED   = "incompatibleGroupingsResolved";
	public static final String PREPROCESSING_TASKS_RESPOLVED     = "preprocessingTasksResolved";
	public static final String TOOL_DEPS_RESOLVED                = "toolDepsResolved";
	public static final String EXEC_WORKFLOW_GENERATED           = "execWorkflowGenerated";
	public static final String FINISHED                          = "finished";
	public static final String START                             = "start";
	
	// 
	public static final String GENERATE_EXECUTABLE_WORKFLOW      = "genExecWorkflow";
	public static final String RESOLVE_TOOL_DEPS                 = "resolveToolDeps";
	public static final String RESOLVE_PREPROCESSING_TASKS       = "resolvePreocessingTasks";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS    = "resolveIncompatibleGroupings";
	public static final String APPLY_GROUPINGS                   = "applyGroupings";
	public static final String APPLY_PARAMETERS                  = "applyParameters";
	public static final String RESOLVE_TRAVERSAL_EVENTS          = "resolveTraversalEvents";
	public static final String GENERATE_ABSTRACT_WORKFLOW        = "generateAbstractWorfklow";
	
	public static final String GENERATE_EXECUTABLE_WORKFLOW_DESCRIPTION   = "Generate executable workflow.";
	public static final String RESOLVE_TOOL_DEPS_DESCRIPTION              = "Resolve tools input and output parameters.";
	public static final String RESOLVE_PREPROCESSING_TASKS_DESCRIPTION    = "Resolve preprocessing tasks.";
	public static final String GENERATE_ABSTRACT_GRAPH_DESCRIPTION        = "The abstract Workflow is computed based on the Workflow template.";
	public static final String RESOLVE_TRAVERSAL_EVENTS_DESCRIPTION       = "Defined parameter and grouping criteria are resolved.";
	public static final String APPLY_GROUPING_DESCRIPTION                 = "The metadata are applied to generate a concrete graph.";
	public static final String APPLY_PARAMETER_DESCRIPTION                = "The paremeter definitions are applied to generate a concrete graph.";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS_DESCRIPTION = "Utility Tasks are included in case of incompatible groupings.";
	
	public static final String GENERATE_ABSTRACT_GRAPH_LABEL         = "Generate Abstract Graph";
	public static final String RESOLVE_TRAVERSAL_EVENTS_LABEL        = "Resolve Traversal Criteria";
	public static final String APPLY_GROUPING_LABEL                  = "Apply Grouping Criteria";
	public static final String APPLY_PARAMETER_LABEL                 = "Apply Parameter Criteria";
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS_LABEL  = "Resolve incompatible Groupings";
	public static final String RESOLVE_TOOL_DEPS_LABEL               = "Resolve tools input and output parameters";
	public static final String RESOLVE_PREPROCESSING_TASKS_LABEL     = "Resolve preprocessing tasks";
	public static final String RESOVLE_UTILTY_LABEL                  = "Resolve utility tasks";
	public static final String GENERATE_EXECUTABLE_WORKFLOW_LABEL    = "Generate executable workflow";
	
	public static final String FINISHED_LABEL                        = "finished";
	public static final String START_LABEL                           = "start";
	public static final String FINISHED_DESCRIPTION                  = "Workflow composition finished";
	public static final String START_DESCRIPTION                     = "Workflow composition not yet started";
	
	public static final String TEMPLATE_TASK_NAME       = "_EasyFlowTemplateTask_";
	public static final String TEMPLATE_DATA_PORT_NAME  = "_EasyFlowTemplatePort_";
	public static final String ROOT_TASK_NAME           = "_root_";
	
	// error descriptions
	public static final String ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_TOOL    = "No valid data handle found for tool.";
	public static final String ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_CONFIG  = "No valid data handle found due to configuration.";

	public static final String TRAVERSAL_CHUNK_SOURCE_TYPE_METADATA = METADATA;
	
	public static final String VERTEX_STYLE = "EASYFLOW_VERTEX_STYLE";
	public static final String EDGE_STYLE   = "EASYFLOW_EDGE_STYLE";
	public static final String TASK_CIRCUMVENTING_EDGE_STYLE      = "EASYFLOW_TASK_CIRC_EDGE_STYLE";
	public static final String MISSING_IN_OUT_DATAPORT_EDGE_STYLE = "EASYFLOW_MISSING_IN_OUT_DATAPORT_EDGE_STYLE";
	
	public static final String COMMAND_PART_VALUE_INTERPRETER       = "interpreter";
	public static final String COMMAND_PART_VALUE_INTERPRETER_PARAM = "interpreter_param";
	public static final String COMMAND_PART_VALUE_EXE               = "exe";
	public static final String COMMAND_PART_VALUE_MODULE            = "module";
	public static final String COMMAND_PART_VALUE_PARAM             = "param";
	
	public static final String DATA_INPUT_DIR    = "input_dir";
	public static final String DATA_WORK_DIR     = "work_dir";
	public static final String DATA_TMP_DIR      = "tmp_dir";
	public static final String ANALYSIS_TYPE_INDEX = "index";
	
	public static final String ADD_EXTENSION_TO_FILENAME      = "addExtensionToInput";
	public static final String REPLACE_EXTENSION_OF_FILENAME  = "replaceExtensionOfInput";
	
	public static final String HOME_DIR         = ".strup";
	public static final String DFLT_CONFIG_FILE = URIUtil.createPath(HOME_DIR, "config.json");
	
	public static final String WORKFLOW_TPL_FILE_PARAM_NAME = "workflow_template_file";
	public static final String METADATA_FILE_PARAM_NAME     = "metadata_file";
	public static final String WORKFLOW_DIR_PARAM_NAME      = "workflow_dir";
	public static final String METADATA_DIR_PARAM_NAME      = "metadata_dir";
	public static final String EXEC_SYS_PARAM_NAME          = "execution_system";
	public static final String EXEC_SYS_OUT_FILE_PARAM_NAME = "execution_system_output_file";
	public static final String INPUT_DIR_PARAM_NAME         = "input_dir";
	public static final String WORK_DIR_PARAM_NAME          = "work_dir";
	public static final String TMP_DIR_PARAM_NAME           = "tmp_dir";
	public static final String CMD_PATTERN_PARAM_NAME       = "command_pattern";
	public static final String TOOL_DEF_DIR_PARAM_NAME      = "def_dir";
	public static final String TOOL_CFG_FILE_PARAM_NAME     = "tool_config_file";
	public static final String PKG_CFG_FILE_PARAM_NAME      = "pkg_config_file";
	public static final String TOOL_CFG_DIR_PARAM_NAME      = "config_dir";
	public static final String DEFAULT_PKG_CONFIG_FILE_NAME           = "pkg_config.json";
	public static final String DEFAULT_TOOL_CONFIG_FILE_NAME          = "tool_config.json";
	public static final String DEFAULT_TOOL_CONFIG_DIR_NAME           = "tool_configuration";
	public static final String DEFAULT_TOOL_DEF_DIR_NAME              = "tool_definition";
	public static final String DEFAULT_TOOL_CONFIG_FILES_DIR_NAME     = "tool";
	public static final String DEFAULT_PKG_CONFIG_FILES_DIR_NAME      = "pkg";
	
	public static final String DEFAULT_GROUPING_CRITERIA_PARAM_NAME   = "default_grouping_criteria";
	public static final String DEFAULT_WORKFLOW_MODE_PARAM_NAME       = "default_mode";
	public static final String IS_CONTRAST_PARAM_NAME                 = "is_contrast";
	public static final String USE_INTERVAL_PARAM_NAME                = "use_interval_list";
	public static final String SPLIT_BY_CHUNKS_PARAM_NAME             = "split_by_chunks";
	
	public static final String PARAM_TYPE_BOOLEAN_VALUE               = "boolean";
	
	public static final String CONDITION_TYPE_DATA_PORT               = "data_port";
	public static final String CONDITION_TYPE_DATA_FORMAT             = "data_format";
	public static final String CONDITION_TYPE_FILE_HANDLE             = "file_handle";
	public static final String CONDITION_TYPE_METADATA                = METADATA;
	public static final int ANY_HANDLE  = 0;
	public static final int FILE_HANDLE = 1;
	public static final int PIPE_HANDLE = 2;
	public static final int PARAM_DATA_MATCH_STRATEGY_ANY         = 0;
	public static final int PARAM_DATA_MATCH_STRATEGY_DATA_PORT   = 1;
	public static final int PARAM_DATA_MATCH_STRATEGY_DATA_FORMAT = 2;
	public static final int RETRIEVE_DATA_PORT_STRATEGY_FIRST     = 0;
	public static final int RETRIEVE_DATA_PORT_STRATEGY_LAST      = 1;
	public static final int RETRIEVE_DATA_PORT_STRATEGY_PRIMARY   = 2;
	
	
}

