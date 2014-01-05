package easyflow.custom.util;

import org.apache.log4j.Logger;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.editor.EasyFlowToolBar;
import easyflow.ui.DefaultProject;

public class EasyFlowUtil {

	private static final Logger         logger         = Logger.getLogger(EasyFlowUtil.class);
	
	
	public static boolean composeEntireWorkflow()
	{
		//logger.debug(GlobalVar.getDefaultProject().hashCode());
		//GlobalVar.getGraphUtil().setGraph((EasyFlowGraph) GlobalVar.getEditor().getGraphComponent().getGraph());
		
		try {
			GlobalVar.getDefaultProject().autoSetup();
			GlobalVar.getDefaultProject().applyTraversalEvents();
			GlobalVar.getDefaultProject().resolveUtilityTasks();
			GlobalVar.getGraphUtil().layoutGraph();
			return true;
			
		} catch (CellNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (TaskNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (GroupingCriterionInstanceNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DataLinkNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataPortNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ToolNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UtilityTaskNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;

	}

	public static boolean resolveIncompatibleGroupings()
	{
		// TODO Auto-generated method stub
		try {
			GlobalVar.getDefaultProject().resolveUtilityTasks();
			GlobalVar.getGraphUtil().layoutGraph();
			return true;
		} catch (DataLinkNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DataPortNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ToolNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UtilityTaskNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (TaskNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
	
	public static boolean generateAbstractWorkflow()
	{
		try {
			GlobalVar.getDefaultProject().autoSetup();
			GlobalVar.getGraphUtil().layoutGraph();
			return true;
		} catch (CellNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TaskNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean applyGroupingCriteria()
	{
		try {
			GlobalVar.getDefaultProject().applyTraversalEvents();
			GlobalVar.getGraphUtil().layoutGraph();
			return true;
		} catch (CellNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TaskNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GroupingCriterionInstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
