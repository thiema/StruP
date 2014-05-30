package easyflow.custom.ui;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import easyflow.custom.util.GlobalConstants;

public class GlobalConfig {

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

	public static String getDefaultHandle()
	{
		if (getProcessingConfig().containsKey(GlobalConstants.CONFIG_PROCESSING_DEFAULT_HANDLE))
			return getProcessingConfig().get(GlobalConstants.CONFIG_PROCESSING_DEFAULT_HANDLE);
		else
			return GlobalConstants.CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE;
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
		if (getProcessingConfig().containsKey(GlobalConstants.CONFIG_PROCESSING_ALLOW_PIPE))
			return string2bool(getProcessingConfig().get(GlobalConstants.CONFIG_PROCESSING_ALLOW_PIPE));
		else
			return GlobalConstants.CONFIG_PROCESSING_ALLOW_PIPE_VALUE;
	}
	
	public static EList<String> getAllowedHandles()
	{
		EList<String> allowedHandles = new BasicEList<String>();
		for (String handle : GlobalConstants.CONFIG_PROCESSING_HANDLES)
		{
			if (getDefaultHandle().equals(handle))
				allowedHandles.add(handle);
			else if (handle.equals(GlobalConstants.CONFIG_PROCESSING_HANDLE_PIPE) 
					&& isPipeAllowed())
				allowedHandles.add(handle);
		}
		return allowedHandles;
	}
	
}
