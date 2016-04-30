package easyflow.custom.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextPane;
import javax.swing.text.Style;

import org.apache.commons.jexl2.JexlEngine;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;






import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxRectangle;

import easyflow.data.DataLink;
import easyflow.util.Category;
import easyflow.util.ErrorInfo;
import easyflow.util.LogMsgOutputMode;
import easyflow.util.UtilFactory;
import easyflow.util.Severity;
import easyflow.core.Task;
import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.EasyFlowGraphEditor;
import easyflow.metadata.DefaultMetaData;
import easyflow.ui.DefaultProject;

public class GlobalVar {

	
	private static Map<String, Object> defaultEdgeStyle   = new HashMap<String, Object>();
	private static Map<String, Object> defaultVertexStyle = new HashMap<String, Object>();
	
	//private static String      lastErrorString = null;
	private static ErrorInfo   lastErrorInfo   = UtilFactory.eINSTANCE.createErrorInfo();
	
	
	public static        String            executionSystemFileName = null;
	public static        File              executionSystemFile     = null;
	public static        BufferedWriter    executionSystemWriter   = null;

	
	private static final JexlEngine jexlEngine = new JexlEngine();
	
	
	private static Util util      = null;
	
	private static Map<String, easyflow.tool.Package> packages = new HashMap<String, easyflow.tool.Package>();
	private static Map<String, 
						Map<String, 
							Map<String, 
								Map<String, String>
								>
							>
						> 				masterMap = new HashMap<String, Map<String, Map<String, Map<String, String>>>>();
	private static EasyFlowGraphEditor  editor               = null;
	private static ComposeWorkflowPanel composeWorkflowPanel = null;
	private static DefaultProject       defaultProject       = null;
	private static Task     templateTask = null;
	private static DataLink templateLink = null;
	
	private static DefaultMetaData metaData     = null;
	private static EasyFlowGraph   graph        = null;
	static EMap<String, Task>      tasks        = new BasicEMap<String, Task>();
	static EMap<String, Task>      utilityTasks = new BasicEMap<String, Task>();
	static EMap<String, Object>    cells        = new BasicEMap<String, Object>();
	static EMap<String, DataLink>  dataLinks    = new BasicEMap<String, DataLink>();
	static EList<Object>           utilityCells = new BasicEList<Object>();
	
	private static LogMsgOutputMode outputMode = LogMsgOutputMode.GUI;
	private static JTextPane txtAreaForLogMsg;
	private static boolean isDeveloperMode = false;
	private static Style defaultStyle;
	private static int debugLevel = GlobalConstants.DEFAULT_DEBUG_LEVEL;
	private static mxGraphComponent graphComponent;
	
	
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

	public static boolean outputToGUI() {
		return outputMode.getValue() > LogMsgOutputMode.CONSOLE_VALUE;
	}

	public static void setOutputMode(LogMsgOutputMode outputMode) {
		GlobalVar.outputMode = outputMode;
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
	
	public static Task getRootTask()
	{
		return getTasks().get(GlobalConstants.ROOT_TASK_NAME);
	}

	public static void setRootTask(Task task) {
		getTasks().put(GlobalConstants.ROOT_TASK_NAME, task);		
	}
	
	public static EMap<String, Task> getTasks() {
		return tasks;
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

	public static ErrorInfo getLastErrorInfo() {
		return lastErrorInfo;
	}

	public static void setLastErrorInfo(ErrorInfo lastErrorInfo) {
		GlobalVar.lastErrorInfo = lastErrorInfo;
	}

	public static Map<String, Map<String, Map<String, Map<String, String>>>> getMasterMap() {
		return masterMap;
	}

	public static void setMasterMap(Map<String, Map<String, Map<String, Map<String, String>>>> masterMap) {
		GlobalVar.masterMap = masterMap;
	}

	public static DefaultMetaData getMetaData() {
		return metaData;
	}
/*
	public static EMap<String, EList<TraversalChunk>> getTraversalChunks() {
		// TODO Auto-generated method stub
		return null;
	}
*/
	public static EMap<String, Object> getCells() {
		return cells;
	}

	public static EMap<String, DataLink> getDataLinks() {
		return dataLinks;
	}

	public static EasyFlowGraph getGraph() {
		return graph;
	}

	public static EMap<String, Task> getUtilityTasks() {
		return utilityTasks;
	}
	
	public static EList<Object> getUtilityTaskCells() {
		return utilityCells;
	}

	/*
	public static void setDefaultRootCell(mxICell rootCell) {
		// TODO Auto-generated method stub
		
	}
*/
	public static void setMetaData(DefaultMetaData metaData_) {
		metaData = metaData_;
		
	}

	public static void setGraph(EasyFlowGraph graph_) {

		graph = graph_;
	}

	public static void setTextAreaForLogMsg(JTextPane logMsgTextArea) {
		GlobalVar.txtAreaForLogMsg = logMsgTextArea;	
	}
	
	public static JTextPane getTextAreaForLogMsg()
	{
		return GlobalVar.txtAreaForLogMsg;
	}

	public static void setDeveloperMode(boolean isDeveloperMode)
	{
		GlobalVar.isDeveloperMode = isDeveloperMode;
	}
	
	public static boolean isDevloperMode() {
		
		return isDeveloperMode;
	}

	public static boolean outputToConsole() {
		return outputMode.getValue() != LogMsgOutputMode.GUI_VALUE;
	}

	public static void setLastErrorInfo(Category category, Task task, DataLink dataLink, String info, boolean isFinal) {
		if (!lastErrorInfo.isFinal() || isFinal)
		{
			lastErrorInfo.clear();
			lastErrorInfo.setCategory(category);
			lastErrorInfo.setTask(task);
			lastErrorInfo.setInfo(info);
			lastErrorInfo.setFinal(isFinal);
			lastErrorInfo.setDataLink(dataLink);
		}
	}

	public static void setDefaultDocStyle(Style defaultStyle) {
		GlobalVar.defaultStyle = defaultStyle;
		
	}

	public static Style getDefaultDocStyle() {
		return defaultStyle;
	}

	public static void setDebugLevel(String severity)
	{
		if (severity.equalsIgnoreCase("trace"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_TRACE;
		else if (severity.equalsIgnoreCase("debug"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_DEBUG;
		else if (severity.equalsIgnoreCase("info"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_INFO;
		else if (severity.equalsIgnoreCase("warn"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_WARN;
		else if (severity.equalsIgnoreCase("error"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_ERROR;
		else if (severity.equalsIgnoreCase("fatal"))
			debugLevel = GlobalConstants.DEBUG_LEVEL_FATAL;
		else
			debugLevel = GlobalConstants.DEFAULT_DEBUG_LEVEL;
	}
	
	public static boolean isRequiredDebugLevelReached(Severity severity) {
		return severity.getValue() <= debugLevel ;
	}

	public static void setGraphComponent(mxGraphComponent graphComponent) {
		GlobalVar.graphComponent = graphComponent;
	}

	public static mxGraphComponent getGraphComponent() {
		return graphComponent;
	}
}
