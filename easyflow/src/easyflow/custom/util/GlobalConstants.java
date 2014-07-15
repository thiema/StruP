package easyflow.custom.util;

public class GlobalConstants {

	public static final double defaultCellXPos   = 400;
	public static final double defaultCellYPos   = 100;
	public static final double defaultCellWidth  = 200;
	public static final double defaultCellHeight =  40;
	public static final String TRAVERSAL_CRITERION_RECORD = "Record";
	public static final String METADATA_INPUT             = "InputFiles";

	
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
	
	public static final String TRAVERSAL_CHUNK_SOURCE_TYPE_METADATA = "metadata";
	
	public static final String VERTEX_STYLE = "EASYFLOW_VERTEX_STYLE";
	public static final String EDGE_STYLE   = "EASYFLOW_EDGE_STYLE";
	public static final String TASK_CIRCUMVENTING_EDGE_STYLE      = "EASYFLOW_TASK_CIRC_EDGE_STYLE";
	public static final String MISSING_IN_OUT_DATAPORT_EDGE_STYLE = "EASYFLOW_MISSING_IN_OUT_DATAPORT_EDGE_STYLE";
	
	public static final String COMMAND_PART_VALUE_INTERPRETER       = "interpreter";
	public static final String COMMAND_PART_VALUE_INTERPRETER_PARAM = "interpreter_param";
	public static final String COMMAND_PART_VALUE_EXE               = "exe";
	public static final String COMMAND_PART_VALUE_MODULE            = "module";
	public static final String COMMAND_PART_VALUE_PARAM             = "param";

}
