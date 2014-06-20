package easyflow.custom.ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import easyflow.custom.util.GlobalConstants;

public class GlobalConfig {

	
	//##############################################################
	// ############ configuration file (main.json) ##################
	// ##############################################################

	// processing options (keys)
	public static final String CONFIG_PROCESSING_DEFAULT_HANDLE = "default_handle";
	public static final String CONFIG_PROCESSING_ALLOW_PIPE = "allow_pipe";

	// processing options (defaults)
	public static final String CONFIG_PROCESSING_HANDLE_FILE = "file";
	public static final String CONFIG_PROCESSING_HANDLE_PIPE = "pipe";
	public static final String CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE = CONFIG_PROCESSING_HANDLE_FILE;
	public static final boolean CONFIG_PROCESSING_ALLOW_PIPE_VALUE = true;
	public static final String[] CONFIG_PROCESSING_HANDLES = {
			CONFIG_PROCESSING_HANDLE_FILE, CONFIG_PROCESSING_HANDLE_FILE };

	public static final String ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_TOOL = "No valid data handle found for tool.";
	public static final String ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_CONFIG = "No valid data handle found due to configuration.";

	// tool options	
	public static final String CONFIG_TOOL_DEFAULT_COMMAND_PATTERN_VALUE = "pos opt in out";
	public static final String CONFIG_TOOL_COMMAND_PATTERN               = "command_pattern";
	
	public static final String[] CONFIG_TOOL_VALID_COMMAND_PATTERN_PARTS = {"pos", "opt", "in", "out"};
	
	// config maps
	private static final EMap<String, String> toolConfig       = new BasicEMap<String, String>();
	private static final EMap<String, String> projectConfig    = new BasicEMap<String, String>();
	private static final EMap<String, String> processingConfig = new BasicEMap<String, String>();
	private static final EMap<String, String> catalogConfig    = new BasicEMap<String, String>();
	private static final EMap<String, String> workflowConfig   = new BasicEMap<String, String>();
	private static       JSONObject           jsonConfig       = null; 
	
	public static JSONObject getJsonCfg() {
		return jsonConfig;
	}

	public static void setJsonCfg(JSONObject jsonCfg) {
		GlobalConfig.jsonConfig = jsonCfg;
	}

	public static EMap<String, String> getToolConfig() 
	{
		return toolConfig;
	}

	public static EMap<String, String> getProcessingConfig() {
		return processingConfig;
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
	
}
