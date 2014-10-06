package easyflow.custom.ui;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.context.Context;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.URIUtil;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionFactory;
import easyflow.execution.makeflow.MakeflowFactory;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;

public class GlobalConfig {

	
	protected static final Logger logger = Logger.getLogger(GlobalConfig.class);
	
	//##############################################################
	//######### global user configuration (default.json) ###########
	//##############################################################
	
	public static final String WORKFLOW_DIR           = "workflow";
	public static final String INPUT_DIR              = "input";
	public static final String TOOL_CONFIG            = "tool_configuration";
	public static final String TOOL_DEF               = "tool_definitions";
	public static final String CONFIG_FILE            = "main.json";
	public static final String WORKFLOW_TEMPLATE_FILE = "workflow.wtpl";
	public static final String METADATA_FILE          = "metadata.tsv";
	public static final String TOOL_CONFIG_FILE       = "tool_config.json";
	public static final String PKG_CONFIG_FILE        = "pkg_config.json";
	public static final String TOOL_CONFIG_DIR        = URIUtil.createPath(TOOL_CONFIG, "tool");
	public static final String PKG_CONFIG_DIR         = URIUtil.createPath(TOOL_CONFIG, "pkg");
	
	//##############################################################
	//############ configuration file (main.json) ##################
	//##############################################################

	// processing options (keys)
	public static final String   CONFIG_PROCESSING_DEFAULT_HANDLE       = "default_handle";
	public static final String   CONFIG_PROCESSING_ALLOW_PIPE           = "allow_pipe";

	// processing options (defaults)
	public  static final String   CONFIG_PROCESSING_HANDLE_FILE          = GlobalConstants.NAME_FILE_HANDLE;
	public  static final String   CONFIG_PROCESSING_HANDLE_PIPE          = GlobalConstants.NAME_PIPE_HANDLE;
	public  static final String   CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE = CONFIG_PROCESSING_HANDLE_FILE;
	public  static final boolean  CONFIG_PROCESSING_ALLOW_PIPE_VALUE    = true;
	public  static final String[] CONFIG_PROCESSING_HANDLES            = {
										CONFIG_PROCESSING_HANDLE_FILE, CONFIG_PROCESSING_HANDLE_FILE };
	private static final String   CONFIG_PROCESSING_EXECUTION_SYSTEM = "execution_system";
	private static final String   CONFIG_PROCESSING_EXECUTION_SYSTEM_OUTPUT_FILE = "execution_system_output_file";
	private static final String   CONFIG_PROCESSING_DEFAULT_EXECUTION_SYSTEM_VALUE = "exec_rules.txt";
	private static final String   CONFIG_PROCESSING_DEFAULT_EXECUTION_SYSTEM_OUTPUT_FILE_VALUE = "makeflow.out";

	// tool options	
	public static final String   CONFIG_TOOL_DEFAULT_COMMAND_PATTERN_VALUE            = "pos opt in out";
	public static final String   CONFIG_TOOL_COMMAND_PATTERN                          = "command_pattern";
	
	public  static final String[]  CONFIG_TOOL_VALID_COMMAND_PATTERN_PARTS            = {"pos", "opt", "in", "out"};
	
	private static final String    CONFIG_TOOL_DEFAULT_CMD_PART_DELIMITER             = "cmd_part_delimiter";
	private static final String    CONFIG_TOOL_DEFAULT_CMD_PART_DELIMITER_VALUE       = " ";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_VALUE_DELIMITER            = "value_delimiter";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_VALUE_DELIMITER_VALUE      = ",";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_DELIMITER                  = "arg_delimiter";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_DELIMITER_VALUE            = " ";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX                 = "arg_key_prefix";
	private static final String    CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX            = "long_arg_key_prefix";
	private static final String    CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX_VALUE           = "-";
	private static final String    CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX_VALUE      = "--";
	private static final String    CONFIG_TOOL_DEFAULT_WRITE_DEFAULT                  = "write_default_value_to_command_line";
	private static final boolean   CONFIG_TOOL_DEFAULT_WRITE_DEFAULT_VALUE            = false;
	
	private static final String    CONFIG_TOOL_DEFAULT_IS_MULTIPLE_ARG_VALUE          = "multiple_arg_value";
	private static final boolean   CONFIG_TOOL_DEFAULT_IS_MULTIPLE_ARG_VALUE_VALUE    = false;
	
	private static final String    CONFIG_TOOL_DEFAULT_BOOLEAN_VALUE_REQUIRED         = "boolean_value_required";
	private static final boolean   CONFIG_TOOL_DEFAULT_BOOLEAN_VALUE_REQUIRED_VALUE   = false;

	private static final String    CONFIG_TOOL_OUTPUT_VALUE_FOR_BOOLEAN_PARAM_PARAM_NAME  = "output_value_for_boolean_param";
	private static final boolean   CONFIG_TOOL_OUTPUT_VALUE_FOR_BOOLEAN_PARAM_VALUE       = false;
	
	private static final String    CONFIG_TOOL_DEFAULT_ASSUME_DATA_PARAM_POSITIONAL       = "assume_positional_data_param";
	private static final boolean   CONFIG_TOOL_DEFAULT_ASSUME_DATA_PARAM_POSITIONAL_VALUE = false; // true means that in/out data params are processed as postional param
	                                                                                      // -> no key/prefix/delimiter by default, even if defined in pacakge/tool
	private static final String    CONFIG_TOOL_DEFAULT_OMIT_PREFIX_IF_NO_ARG_KEY          = "default_omit_prefix_if_no_arg_key";
	private static final boolean   CONFIG_TOOL_DEFAULT_OMIT_PREFIX_IF_NO_ARG_KEY_VALUE    = true;
	public  static final String    CONFIG_TOOL_OMIT_PREFIX_IF_NO_ARG_KEY                  = "omit_prefix_if_no_arg_key";
	
	private static final String    CONFIG_TOOL_DEFAULT_OPTION_TYPE                        = "default_option_type";
	private static final String    CONFIG_TOOL_DEFAULT_OPTION_TYPE_VALUE                  = "long";//short
	
	private static final String    CONFIG_TOOL_RESOLVE_PATH_NAME                          = "resolve_path";
	private static final boolean   CONFIG_TOOL_RESOLVE_PATH_DEFAULT_VALUE                 = true;
		
	private static final Parameter positionalParamTemplate = ToolFactory.eINSTANCE.createParameter();
	private static final Parameter exeParameterDefault     = positionalParamTemplate;
	
	
	// config maps
	private static final EMap<String, String> toolConfig       = new BasicEMap<String, String>();
	private static final EMap<String, EMap<String, String>> interpreterMap = new BasicEMap<String, EMap<String,String>>();
	private static final EMap<String, EMap<String, String>> pkgMap         = new BasicEMap<String, EMap<String,String>>();
	private static final EMap<String, Tool>                 tools          = new BasicEMap<String, Tool>();
	private static final EMap<String, EMap<String, String>> toolMap        = new BasicEMap<String, EMap<String,String>>();
	private static final Context varMap           = new VelocityContext();
	private static final EMap<String, String> projectConfig    = new BasicEMap<String, String>();
	private static final EMap<String, String> processingConfig = new BasicEMap<String, String>();
	//private static final EMap<String, String> catalogConfig    = new BasicEMap<String, String>();
	private static final EMap<String, String> workflowConfig   = new BasicEMap<String, String>();

	private static final Boolean CONFIG_WORKFLOW_MULTIPLE_INPUTS_DEFAULT_VALUE              = false;
	private static final Boolean CONFIG_WORKFLOW_MULTIPLE_INSTANCES_DEFAULT_VALUE           = false;
	private static final Boolean CONFIG_WORKFLOW_MULTIPLE_INSTANCES_PER_INPUT_DEFAULT_VALUE = false;
	
	private static final Boolean CONFIG_WORKFLOW_ROOT_MULTIPLE_INPUTS_DEFAULT_VALUE              = true;
	private static final Boolean CONFIG_WORKFLOW_ROOT_MULTIPLE_INSTANCES_DEFAULT_VALUE           = true;
	private static final Boolean CONFIG_WORKFLOW_ROOT_MULTIPLE_INSTANCES_PER_INPUT_DEFAULT_VALUE = false;
	
	private static final String    CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY                = "resolve_parent_task_strategy";
	public  static final String    CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_NEAREST_PARENT = "nearest_parents_first";
	public  static final String    CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_MAX_RANK       = "max_rank_first";
	public  static final String    CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_ALL_PARENTS    = "all_parents";
	private static final String    CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_DEFAULT_VALUE  = CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_NEAREST_PARENT;
	

	private static       JSONObject           jsonConfig       = null; 
	
	//public static JSONObject getJsonCfg() {
		//return jsonConfig;
	//}

	public static void setJsonCfg(JSONObject jsonCfg) {
		GlobalConfig.jsonConfig = jsonCfg;
	}

	public static EMap<String, EMap<String, String>> getInterpreterMap() {
		return interpreterMap;
	}

	public static EMap<String, EMap<String, String>> getPkgMap() {
		return pkgMap;
	}

	public static EMap<String, Tool> getTools()
	{
		return tools;
	}
	
	public static EMap<String, EMap<String, String>> getToolMap() {
		return toolMap;
	}

	public static Context getVarMap() {
		return varMap;
	}
	
	public static String resolveContextVars(String tpl)
	{
		StringWriter w = new StringWriter();
		Velocity.evaluate(getVarMap(), w, "mystring", tpl);
		logger.debug(w);
		return w.toString();
	}

	public static EMap<String, String> getToolConfig() 
	{
		return toolConfig;
	}

	public static EMap<String, String> getProcessingConfig() {
		return processingConfig;
	}

	public static EMap<String, String> getProjectConfig() {
		return projectConfig;
	}

	public static EMap<String, String> getWorkflowConfig()
	{
		return workflowConfig;
	}
	
	// processing
	public static String getDefaultHandle()
	{
		if (getProcessingConfig().containsKey(CONFIG_PROCESSING_DEFAULT_HANDLE))
			return getProcessingConfig().get(CONFIG_PROCESSING_DEFAULT_HANDLE);
		else
			return CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE;
	}
	
	public static boolean string2bool(String string)
	{
		String[] trueValues={"true", "1", "yes"};
		for (String trueValue : trueValues)
		{
			if (trueValue.equalsIgnoreCase(string))
				return true;
		}
		return false;
	}
	
	public static boolean isPipeAllowed()
	{
		if (getProcessingConfig().containsKey(CONFIG_PROCESSING_ALLOW_PIPE))
			return string2bool(getProcessingConfig().get(CONFIG_PROCESSING_ALLOW_PIPE));
		else
			return CONFIG_PROCESSING_ALLOW_PIPE_VALUE;
	}
	
	public static EList<String> getAllowedHandles()
	{
		EList<String> allowedHandles = new BasicEList<String>();
		for (String handle : CONFIG_PROCESSING_HANDLES)
		{
			if (getDefaultHandle().equals(handle))
				allowedHandles.add(handle);
			else if (handle.equals(CONFIG_PROCESSING_HANDLE_PIPE) 
					&& isPipeAllowed())
				allowedHandles.add(handle);
		}
		return allowedHandles;
	}
	
	// tool
	public static String getCommandPattern()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_COMMAND_PATTERN))
		{
			return getToolConfig().get(CONFIG_TOOL_COMMAND_PATTERN);
		}
		else
			return CONFIG_TOOL_DEFAULT_COMMAND_PATTERN_VALUE;
	}
	
	public static EList<String> getValidCommandPatternParts()
	{
		return new BasicEList<String>(Arrays.asList(CONFIG_TOOL_VALID_COMMAND_PATTERN_PARTS));
	}
	
	public static String getArgValueDelimiter()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_ARG_VALUE_DELIMITER))
			return GlobalConfig.getToolConfig().get(CONFIG_TOOL_DEFAULT_ARG_VALUE_DELIMITER);
		else
			return CONFIG_TOOL_DEFAULT_ARG_VALUE_DELIMITER_VALUE;
	}
	
	public static String getArgDelimiter()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_ARG_DELIMITER))
			return GlobalConfig.getToolConfig().get(CONFIG_TOOL_DEFAULT_ARG_DELIMITER);
		else
			return CONFIG_TOOL_DEFAULT_ARG_DELIMITER_VALUE;		
	}
	
	public static String getArgPrefix()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX))
			return GlobalConfig.getToolConfig().get(CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX);
		else
			return CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX_VALUE;
	}
	
	public static String getLongArgPrefix()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX))
			return GlobalConfig.getToolConfig().get(CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX);
		else
			return CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX_VALUE;
	}
	
	public static boolean useDefaultValue()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_WRITE_DEFAULT))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_DEFAULT_WRITE_DEFAULT));
		else
			return CONFIG_TOOL_DEFAULT_WRITE_DEFAULT_VALUE;
	}

	public static boolean paramIsPositional() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean paramIsNamed() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean paramIsMultiple() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean paramIsOptional() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean paramIsFixedArgValue() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static boolean paramIsMultipleInstances() {
		// TODO Auto-generated method stub
		return false;		
	}

	public static boolean paramIsMultipleInstancesPerInput() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static final Parameter getPositonalParamTemplate()
	{
		if (!positionalParamTemplate.getPositional())
		{
			positionalParamTemplate.setNamed(false);
			positionalParamTemplate.setPositional(true);
			positionalParamTemplate.setPrefix("");
			positionalParamTemplate.setDelimiter("");
		}
		return positionalParamTemplate;
	}
	
	public static boolean assumePositionalDataParam()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_ASSUME_DATA_PARAM_POSITIONAL))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_DEFAULT_ASSUME_DATA_PARAM_POSITIONAL));
		else
			return CONFIG_TOOL_DEFAULT_ASSUME_DATA_PARAM_POSITIONAL_VALUE;
	}
	
	public static final Parameter getExeParameterTemplate()
	{
		return exeParameterDefault;
	}
	
	public static boolean omitPrefixIfNoArgKey()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_OMIT_PREFIX_IF_NO_ARG_KEY))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_DEFAULT_OMIT_PREFIX_IF_NO_ARG_KEY));
		return CONFIG_TOOL_DEFAULT_OMIT_PREFIX_IF_NO_ARG_KEY_VALUE;
	}
	
	public static String getCmdPartDelimiter()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_CMD_PART_DELIMITER))
			return getToolConfig().get(CONFIG_TOOL_DEFAULT_CMD_PART_DELIMITER);
		return CONFIG_TOOL_DEFAULT_CMD_PART_DELIMITER_VALUE;		
	}
	
	//changed from Boolean to boolean
	public static boolean isMultipleArgValue()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_IS_MULTIPLE_ARG_VALUE))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_DEFAULT_IS_MULTIPLE_ARG_VALUE));
		else
			return CONFIG_TOOL_DEFAULT_IS_MULTIPLE_ARG_VALUE_VALUE; 
	}
	
	public static Boolean isBooleanValueRequired()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_BOOLEAN_VALUE_REQUIRED))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_DEFAULT_BOOLEAN_VALUE_REQUIRED));
		else
			return CONFIG_TOOL_DEFAULT_BOOLEAN_VALUE_REQUIRED_VALUE;
	}
	
	public static boolean outputValueForBooleanParam()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_OUTPUT_VALUE_FOR_BOOLEAN_PARAM_PARAM_NAME))
			return new Boolean(getToolConfig().get(CONFIG_TOOL_OUTPUT_VALUE_FOR_BOOLEAN_PARAM_PARAM_NAME));
		else
			return CONFIG_TOOL_OUTPUT_VALUE_FOR_BOOLEAN_PARAM_VALUE;		
	}
	

	public static String getPreferredOptionType()
	{
		String type = null;
		if (getToolConfig().containsKey(CONFIG_TOOL_DEFAULT_OPTION_TYPE))
			type = getToolConfig().get(CONFIG_TOOL_DEFAULT_OPTION_TYPE);
		else
			type = CONFIG_TOOL_DEFAULT_OPTION_TYPE_VALUE;
		
		return type;
	}

	public static String getShortPrefix()
	{
		return CONFIG_TOOL_DEFAULT_ARG_KEY_PREFIX_VALUE;
	}

	public static String getLongPrefix()
	{
		return CONFIG_TOOL_DEFAULT_LONG_ARG_KEY_PREFIX_VALUE;
	}
	
	public static String getArgPrefixForType(String type) {
		
		if ("short".equalsIgnoreCase(type))
			return getShortPrefix();
		else if ("long".equalsIgnoreCase(type))
			return getLongPrefix();
		else
			return null;
	}
	
	public static DefaultExecutionSystem getExecutionSystem()
	{
		DefaultExecutionSystem executionSystem = null;
		String exeSystem = CONFIG_PROCESSING_DEFAULT_EXECUTION_SYSTEM_VALUE;
		
		if (getProcessingConfig().containsKey(CONFIG_PROCESSING_EXECUTION_SYSTEM))
			exeSystem = getProcessingConfig().get(CONFIG_PROCESSING_EXECUTION_SYSTEM);
		
		GlobalVar.setExecutionSystemOutputFileName(getExecutionSystemOutputFile());
		
		if (GlobalConfig.getProcessingConfig().containsKey("execution_system"))
		{
			if ("makeflow".equalsIgnoreCase(exeSystem))
			{
				executionSystem = MakeflowFactory.eINSTANCE.createMakeflow();
				
			}
			else
			{
				executionSystem = ExecutionFactory.eINSTANCE.createDefaultExecutionSystem();
			}
		}
		else
		{
			executionSystem = ExecutionFactory.eINSTANCE.createDefaultExecutionSystem();
			
		}
		executionSystem.setWriter(GlobalVar.getExecutionSystemOutputWriter());
		logger.debug(executionSystem.getWriter());

		return executionSystem;
	}
	
	public static String getExecutionSystemOutputFile()
	{
		if (getProcessingConfig().containsKey(CONFIG_PROCESSING_EXECUTION_SYSTEM_OUTPUT_FILE))
			return getProcessingConfig().get(CONFIG_PROCESSING_EXECUTION_SYSTEM_OUTPUT_FILE);
		else
			return CONFIG_PROCESSING_DEFAULT_EXECUTION_SYSTEM_OUTPUT_FILE_VALUE;
		
	}
	
	public static String getResolveParentTasksStrategy()
	{
		if (getWorkflowConfig().containsKey(CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY))
			return getWorkflowConfig().get(CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY);
		else
			return CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_DEFAULT_VALUE;
	}

	public static String getGroupingCriterionForFilterTask() {
		//return "ReadGroup";
		return GlobalConstants.METADATA_INPUT;
	}

	public static Boolean getMultipleInputsDefaultValue()
	{
		return CONFIG_WORKFLOW_MULTIPLE_INPUTS_DEFAULT_VALUE;
	}
	
	public static Boolean getMultipleInstancesDefaultValue()
	{
		return CONFIG_WORKFLOW_MULTIPLE_INSTANCES_DEFAULT_VALUE;
	}
	
	public static Boolean getMultipleInstancesPerInputDefaultValue()
	{
		return CONFIG_WORKFLOW_MULTIPLE_INSTANCES_PER_INPUT_DEFAULT_VALUE;
	}
	
	public static Boolean getMultipleInputsForRootTaskValue()
	{
		return CONFIG_WORKFLOW_ROOT_MULTIPLE_INPUTS_DEFAULT_VALUE;
	}
	
	public static Boolean getMultipleInstancesForRootTaskValue()
	{
		return CONFIG_WORKFLOW_ROOT_MULTIPLE_INSTANCES_DEFAULT_VALUE;
	}
	
	public static Boolean getMultipleInstancesPerInputForRootTaskValue()
	{
		return CONFIG_WORKFLOW_ROOT_MULTIPLE_INSTANCES_PER_INPUT_DEFAULT_VALUE;
	}
	
	public static boolean resolvePath()
	{
		if (getToolConfig().containsKey(CONFIG_TOOL_RESOLVE_PATH_NAME))
			return getToolConfig().get(CONFIG_TOOL_RESOLVE_PATH_NAME).equals("true"); 
		else
			return CONFIG_TOOL_RESOLVE_PATH_DEFAULT_VALUE;
	}
	
	private static String toolConfigFileName = null;
	private static String toolConfigDirName  = null;
	private static String pkgConfigFileName  = null;
	private static String toolDefDirName     = null;
	

	
	public static String getToolConfigFileName()
	{
		if (toolConfigFileName != null)
			return toolConfigFileName;
		else if (getToolConfig().containsKey(GlobalConstants.TOOL_CFG_FILE_PARAM_NAME))
			return getToolConfig().get(GlobalConstants.TOOL_CFG_FILE_PARAM_NAME);
		else
			return GlobalConstants.DEFAULT_TOOL_CONFIG_FILE_NAME;
	}

	public static String getPkgConfigFileName()
	{
		if (pkgConfigFileName != null)
			return pkgConfigFileName;
		else if (getToolConfig().containsKey(GlobalConstants.PKG_CFG_FILE_PARAM_NAME))
			return getToolConfig().get(GlobalConstants.PKG_CFG_FILE_PARAM_NAME);
		else
			return GlobalConstants.DEFAULT_PKG_CONFIG_FILE_NAME;
	}
	
	public static String getToolConfigDirName()
	{
		if (toolConfigDirName != null)
			return toolConfigDirName;
		else if (getToolConfig().containsKey(GlobalConstants.TOOL_CFG_DIR_PARAM_NAME))
			return getToolConfig().get(GlobalConstants.TOOL_CFG_DIR_PARAM_NAME);
		else
			return GlobalConstants.DEFAULT_TOOL_CONFIG_DIR_NAME;
	}
	
	public static void setToolConfigFileName(String fileName)
	{
		toolConfigFileName = fileName;
	}
	public static void setPkgConfigFileName(String fileName)
	{
		pkgConfigFileName = fileName;
	}
	public static void setToolConfigDirName(String dirName)
	{
		toolConfigDirName = dirName;
	}

	public static void setToolDefDirName(String dirName) 
	{
		toolDefDirName = dirName;
	}

	public static String getToolDefDirName() 
	{
		if (toolDefDirName != null)
			return toolDefDirName;
		else if (getToolConfig().containsKey(GlobalConstants.TOOL_DEF_DIR_PARAM_NAME))
			return getToolConfig().get(GlobalConstants.TOOL_DEF_DIR_PARAM_NAME);
		else
			return GlobalConstants.DEFAULT_TOOL_DEF_DIR_NAME;
	}

	public static String getToolConfigFilesDirName() {
		return GlobalConstants.DEFAULT_TOOL_CONFIG_FILES_DIR_NAME;
	}

	public static String getPkgConfigFilesDirName() {
		return GlobalConstants.DEFAULT_PKG_CONFIG_FILES_DIR_NAME;
	}

	public static String getWorkflowTemplateFileName()
	{
		if (getProjectConfig().containsKey(GlobalConstants.WORKFLOW_TPL_FILE_PARAM_NAME))
			return getProjectConfig().get(GlobalConstants.WORKFLOW_TPL_FILE_PARAM_NAME);
		else
			return WORKFLOW_TEMPLATE_FILE;
	}

	public static String getWorkflowTemplateDirName()
	{
		if (getProjectConfig().containsKey(GlobalConstants.WORKFLOW_DIR_PARAM_NAME))
			return getProjectConfig().get(GlobalConstants.WORKFLOW_DIR_PARAM_NAME);
		else
			return WORKFLOW_DIR;
	}
	
	public static String getMetadataFileName()
	{
		if (getProjectConfig().containsKey(GlobalConstants.METADATA_FILE_PARAM_NAME))
			return getProjectConfig().get(GlobalConstants.METADATA_FILE_PARAM_NAME);
		else
			return METADATA_FILE;		
	}
	
	public static String getMetadataDirName()
	{
		if (getProjectConfig().containsKey(GlobalConstants.METADATA_DIR_PARAM_NAME))
			return getProjectConfig().get(GlobalConstants.METADATA_DIR_PARAM_NAME);
		else
			return WORKFLOW_DIR;
	}

	public static String getDefaultGroupingCriterion() {
		return GlobalConstants.TRAVERSAL_CRITERION_RECORD;
	}
}
