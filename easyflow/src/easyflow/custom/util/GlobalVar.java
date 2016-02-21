package easyflow.custom.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

import org.apache.commons.jexl2.JexlEngine;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import com.mxgraph.model.mxICell;

import easyflow.data.DataLink;
import easyflow.core.Task;
import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.EasyFlowGraphEditor;
import easyflow.metadata.DefaultMetaData;
import easyflow.traversal.TraversalChunk;
import easyflow.ui.DefaultProject;

public class GlobalVar {

	
	private static Map<String, Object> defaultEdgeStyle   = new HashMap<String, Object>();
	private static Map<String, Object> defaultVertexStyle = new HashMap<String, Object>();
	
	private static String lastErrorString = null;
	
	public static String executionSystemFileName = null;
	public static File   executionSystemFile     = null;
	public static BufferedWriter executionSystemWriter   = null;

	
	private static final JexlEngine jexlEngine = new JexlEngine();
	
	
	private static Util util      = null;
	
	private static Map<String, easyflow.tool.Package> packages = new HashMap<String, easyflow.tool.Package>();
	private static Map<String, Map<String, Map<String, Map<String, String>>>> masterMap = new HashMap<String, Map<String, Map<String, Map<String, String>>>>();
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
	
	
	
	private static boolean guiMode = false;
	private static JTextPane txtAreaForLogMsg;
	
	
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

	public static String getLastErrorString() {
		return lastErrorString;
	}

	public static void setLastErrorString(String lastErrorString) {
		GlobalVar.lastErrorString = lastErrorString;
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

	public static EMap<String, EList<TraversalChunk>> getTraversalChunks() {
		// TODO Auto-generated method stub
		return null;
	}

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

}
