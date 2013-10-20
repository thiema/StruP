package easyflow.custom.ui;

import java.util.HashMap;
import java.util.Map;

public class GlobalConfig {

	private static Map<String, String> toolCfgMap = new HashMap<String, String>();
	
	public static Map<String, String> getToolConfig() 
	{
		return toolCfgMap;
	}
	
}
