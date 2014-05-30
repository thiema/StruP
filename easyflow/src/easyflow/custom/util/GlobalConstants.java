package easyflow.custom.util;

public class GlobalConstants {

	
	//
	public static final String ABSTRACT_NODES                    = "abstractNodes";
	public static final String ABSTRACT_WORKFLOW                 = "abstractWorkflow";
	public static final String TRAVERSAL_EVENTS_RESOLVED         = "traversalEventsResolved";
	public static final String GROUPING_APPLIED                  = "groupingCriteriaApplied";
	public static final String PARAMETER_APPLIED                 = "parameterCriteriaApplied";
	public static final String INCOMPATIBLE_GROUPINGS_RESOLVED   = "incompatibleGroupingsResolved";
	public static final String FINISHED                          = "finished";
	public static final String START                             = "start";
	
	// 
	public static final String RESOLVE_INCOMPATIBLE_GROUPINGS    = "resolveIncompatibleGroupings";
	public static final String APPLY_GROUPINGS                   = "applyGroupings";
	public static final String APPLY_PARAMETERS                  = "applyParameters";
	public static final String RESOLVE_TRAVERSAL_EVENTS          = "resolveTraversalEvents";
	public static final String GENERATE_ABSTRACT_WORKFLOW        = "generateAbstractWorfklow";
	
	
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
	
	// configuration file (main.json)
	
	// processing options (keys)
	public static final String CONFIG_PROCESSING_DEFAULT_HANDLE = "default_handle";
	public static final String CONFIG_PROCESSING_ALLOW_PIPE     = "allow_pipe";
	
	// processing options (defaults)
	public static final String   CONFIG_PROCESSING_HANDLE_FILE           = "file";
	public static final String   CONFIG_PROCESSING_HANDLE_PIPE           = "pipe";
	public static final String   CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE  = CONFIG_PROCESSING_HANDLE_FILE;
	public static final boolean  CONFIG_PROCESSING_ALLOW_PIPE_VALUE      = true;
	public static final String[] CONFIG_PROCESSING_HANDLES               = {CONFIG_PROCESSING_HANDLE_FILE, CONFIG_PROCESSING_HANDLE_FILE};
	

}
