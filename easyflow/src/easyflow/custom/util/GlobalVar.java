package easyflow.custom.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.jgraphx.editor.EasyFlowGraphUtil;
import easyflow.custom.jgraphx.editor.SchemaEditor;
import easyflow.graph.jgraphx.Util;
import easyflow.ui.DefaultProject;

import sun.security.action.GetLongAction;

public class GlobalVar {

	public static final String ABSTRACT_NODES = "abstractNodes";
	public static final String ABSTRACT_WORKFLOW = "abstractWorkflow";
	public static final String TRAVERSAL_EVENTS_RESOLVED = "traversalEventsResolved";
	public static final String GROUPING_APPLIED = "groupingCriteriaApplied";
	public static final String PARAMETER_APPLIED = "parameterCriteriaApplied";
	public static final String INCOMPATIBLE_GROUPINGS_RESOLVED = "incompatibleGroupingsResolved";
	
	private static easyflow.graph.jgraphx.Util graphUtil = null;
	private static DefaultProject defaultProject = null;
	private static Util util = null;
	private static boolean guiMode = false;
	private static SchemaEditor editor = null;
	private static ComposeWorkflowPanel composeWorkflowPanel = null;
	
	public static easyflow.graph.jgraphx.Util getGraphUtil()
	{
		return graphUtil;
	}
	
	public static void setGraphUtil (
			easyflow.graph.jgraphx.Util newGraphUtil)
	{
		graphUtil=newGraphUtil;
	}
	
	public static DefaultProject getDefaultProject() {
		return defaultProject;
	}

	public static void setDefaultProject(DefaultProject defaultProject) {
		GlobalVar.defaultProject = defaultProject;
	}

	public static SchemaEditor getEditor() {
		return editor;
	}

	public static void setEditor(SchemaEditor editor) {
		GlobalVar.editor = editor;
	}

	public static Util getUtil() {
		return util;
	}

	public static void setUtil(Util util) {
		GlobalVar.util = util;
	}

	public static boolean isGuiMode() {
		return guiMode;
	}

	public static void setGuiMode(boolean guiMode) {
		GlobalVar.guiMode = guiMode;
	}

	public static ComposeWorkflowPanel getComposeWorkflowPanel() {
		return composeWorkflowPanel;
	}

	public static void setComposeWorkflowPanel(ComposeWorkflowPanel composeWorkflowPanel) {
		GlobalVar.composeWorkflowPanel = composeWorkflowPanel;
	}

}
