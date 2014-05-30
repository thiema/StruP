package easyflow.custom.ui;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import easyflow.custom.util.GlobalConstants;

public class GlobalConfig {

	private static EMap<String, String> toolCfgMap       = new BasicEMap<String, String>();
	private static EMap<String, String> projectCfgMap    = new BasicEMap<String, String>();
	private static EMap<String, String> processingCfgMap = new BasicEMap<String, String>();
	private static EMap<String, String> catalogCfgMap    = new BasicEMap<String, String>();
	private static EMap<String, String> workflowCfgMap   = new BasicEMap<String, String>();
	private static JSONObject           jsonCfg          = null; 
	
	public static EMap<String, String> getToolConfig() 
	{
		return toolCfgMap;
	}
	
	public static JSONObject getJsonCfg() {
		return jsonCfg;
	}

	public static void setJsonCfg(JSONObject jsonCfg) {
		GlobalConfig.jsonCfg = jsonCfg;
	}

	public static EList<String> getAllowedHandles()
	{
		if (constraints.containsKey(GlobalConstants.CONFIG_PROCESSING_DEFAULT_HANDLE))
	}
	
}
