package easyflow.custom.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.lang.StringUtils;

import easyflow.data.DataLink;
import easyflow.core.Task;
import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.EasyFlowGraphEditor;
import easyflow.graph.jgraphx.Util;
import easyflow.ui.DefaultProject;

import sun.security.action.GetLongAction;

public class GlobalVar {

	
	private static Map<String, Object> defaultEdgeStyle   = new HashMap<String, Object>();
	private static Map<String, Object> defaultVertexStyle = new HashMap<String, Object>();
	
	public static final double defaultCellXPos   = 400;
	public static final double defaultCellYPos   = 100;
	public static final double defaultCellWidth  = 200;
	public static final double defaultCellHeight =  40;
	public static final String TRAVERSAL_CRITERION_RECORD = "Record";
	public static final String METADATA_INPUT             = "InputFiles";
	
	
	public static String executionSystemFileName = null;
	public static File   executionSystemFile     = null;
	public static BufferedWriter executionSystemWriter   = null;

	
	private static final JexlEngine jexlEngine = new JexlEngine();
	
	private static Util graphUtil = null;
	private static Util util      = null;
	
	private static Map<String, easyflow.tool.Package> packages = new HashMap<String, easyflow.tool.Package>();
	private static EasyFlowGraphEditor  editor               = null;
	private static ComposeWorkflowPanel composeWorkflowPanel = null;
	private static DefaultProject       defaultProject       = null;
	private static Task     templateTask = null;
	private static DataLink templateLink = null;
	
	
	private static boolean guiMode = false;
	
	public static Util getGraphUtil()
	{
		return graphUtil;
	}
	
	public static void setGraphUtil (
			Util newGraphUtil)
	{
		graphUtil=newGraphUtil;
	}
	
	public static DefaultProject getDefaultProject() {
		return defaultProject;
	}

	public static void setDefaultProject(DefaultProject defaultProject) {
		GlobalVar.defaultProject = defaultProject;
	}

	public static EasyFlowGraphEditor getEditor() {
		return editor;
	}

	public static void setEditor(EasyFlowGraphEditor editor) {
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

	public static Task getTemplateTask() {
		return templateTask;
	}

	public static void setTemplateTask(Task templateTask) {
		GlobalVar.templateTask = templateTask;
	}

	public static DataLink getTemplateLink() {
		return templateLink;
	}

	public static void setTemplateLink(DataLink templateLink) {
		GlobalVar.templateLink = templateLink;
	}
	public static Map<String, Object> getDefaultEdgeStyle() {
		return defaultEdgeStyle;
	}

	public static void setDefaultEdgeStyle(Map<String, Object> defaultEdgeStyle)
	{
		GlobalVar.defaultEdgeStyle=defaultEdgeStyle;
	}
	
	public static Map<String, Object> getDefaultVertexStyle() {
		return defaultVertexStyle;
	}

	public static void setDefaultVertexStyle(Map<String, Object> defaultVertexStyle)
	{
		GlobalVar.defaultVertexStyle=defaultVertexStyle;
	}

	public static Task getRootTask()
	{
		return getGraphUtil().getTasks().get(GlobalConstants.ROOT_TASK_NAME);
	}

	public static String getExecutionSystemOutputFileName() {
		return executionSystemFileName;
	}
	public static File getExecutionSystemOutputFile() {
		return executionSystemFile;
	}
	
	public static void setExecutionSystemOutputFileName(String filename) {
		executionSystemFileName = filename;
		if (executionSystemFile == null 
				|| !executionSystemFile.getAbsolutePath().equalsIgnoreCase(filename))
			executionSystemFile = new File(filename);
	}

	public static BufferedWriter getExecutionSystemOutputWriter() {

		if (executionSystemWriter == null)
		{
			try {
				executionSystemWriter = new BufferedWriter(new FileWriter(getExecutionSystemOutputFile()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return executionSystemWriter;
	}

	public static Map<String, easyflow.tool.Package> getPackages() {
		return packages;
	}

	public static JexlEngine getJexlengine() {
		return jexlEngine;
	}

}
