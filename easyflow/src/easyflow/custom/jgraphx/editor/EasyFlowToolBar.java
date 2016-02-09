package easyflow.custom.jgraphx.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.ui.IProject;


public class EasyFlowToolBar extends JToolBar
{
	private static final Logger              logger = Logger.getLogger(EasyFlowToolBar.class);
	private        final EasyFlowGraphEditor editor;
	private              Examples            examples;
	private              String         defaultProjectType = "reseq";
	private static final boolean		isFromJar	       = false;
	private static final String         repositoryJar      = "/easyflow/custom/examples";
	private static String               repositoryFS       = "easyflow/custom/examples";
	private static final String         repositoryFS_src   = "src/easyflow/custom/examples";
	// when running from ../easyflow/build folder the path is 
	//private static final String         repositoryFS_bin   = "build/classes/easyflow/custom/examples";
	// when running from the unzipped archive folder
	private static final String         repositoryFS_bin   = "examples";

	
	final Action configureProjectAction    = new ConfigureProjectAction();
	final Action initWorkflowAction        = new InitWorkflowAction();
	final Action deleteGraphAction         = new DeleteGraphAction();
	
	final Action genAbstractWorkflowAction = new GenAbstractWorkflowAction();
	final Action applyGroupingCritAction   = new ApplyGroupingCritAction();
	final Action applyParameterCritAction  = new ApplyParameterCritAction();
	final Action resolveUtilityTasksAction = new ResolveUtilityTaskAction();
	final Action resolveToolDepsAction     = new ResolveToolDepsAction();
	final Action generateExecWorkflowAction= new GenerateExecWorkflowAction();

	final Action applyNextTraversalEvent   = new ApplyNextTraversalEventAction();
	final Action computeNext               = new ComputeNextAction();
	final Action calcAllProjectAction      = new CalcAllProjectAction();
	
	
	final JButton btnConfigureProject      = add(configureProjectAction);
	final JButton btnInitWorkflow          = add(initWorkflowAction);
	final JButton btnDeleteGraph           = add(deleteGraphAction);

	final JButton btnGenAbstractWorkflow   = add(genAbstractWorkflowAction);
	final JButton btnApplyGroupingCrit     = add(applyGroupingCritAction);
	final JButton btnApplyParameterCrit    = add(applyParameterCritAction);
	final JButton btnResolveUtilityTasks   = add(resolveUtilityTasksAction);
	final JButton btnResolveToolDeps         = add(resolveToolDepsAction);
	final JButton btnGenerateExecWorkflow    = add(generateExecWorkflowAction);

	final JButton btnCalcAll                 = add(calcAllProjectAction);
	//final JButton btnApplyNextTraversalEvent = add(applyNextTraversalEvent);

	
	private void initButtons()
	{
		
		btnConfigureProject.setEnabled(true);
		if (GlobalVar.getDefaultProject()!=null)
			btnInitWorkflow.setEnabled(true);
		else
			btnInitWorkflow.setEnabled(false);
		
		btnGenAbstractWorkflow.setEnabled(false);
		btnApplyParameterCrit.setEnabled(false);
		btnApplyGroupingCrit.setEnabled(false);
		btnResolveUtilityTasks.setEnabled(false);
		btnResolveToolDeps.setEnabled(false);
		
		btnCalcAll.setEnabled(false);
		btnDeleteGraph.setEnabled(false);
		btnGenerateExecWorkflow.setEnabled(false);	
	}
	
	public EasyFlowToolBar(EasyFlowGraphEditor easyFlowGraphEditor,
			int horizontal) {
		editor = easyFlowGraphEditor;
		
		initButtons();
		
		File repoSrcFile = new File (repositoryFS_src);
		File repoBinFile = new File (repositoryFS_bin);
		File repoFile = new File(repositoryFS);
		if (!repoFile.isAbsolute())
		{
			// this should be the case when started from within eclipse
			if (repoSrcFile.exists())
				repositoryFS=repositoryFS_src;
			// from command line
			else if (repoBinFile.exists())
			{
				repositoryFS=repositoryFS_bin;
			}
			else
				repositoryFS=null;
		}
		logger.debug("EasyFlowToolBar(): set editor. graph="+editor.getGraphComponent().getGraph()
				+" fs repo="+repositoryFS+" read from jar="+isFromJar+" jar repo="+repositoryJar);
		
		DefaultProject defaultProject = getExamples(true).getExamples().get(defaultProjectType);
		if (defaultProject == null)
		{
			logger.warn("EasyFlowToolBar(): Couldn't read default project definition.");
			btnInitWorkflow.setEnabled(false);
		}
		else
		{
			GlobalVar.setDefaultProject(defaultProject);
			defaultProject.getActiveWorkflow();
			btnInitWorkflow.setEnabled(true);
		}
		
	}

	private Examples getExamples(boolean refresh)
	{
		logger.trace("getExamples(): refresh="+refresh+" "+examples);
		if ((refresh) || examples == null)
		{
			logger.trace("getExamples(): create examples. isFromJar="+isFromJar+" location (FS)="+repositoryFS+" location (jar)="+repositoryJar);
			examples = ExampleFactory.eINSTANCE.createExamples();
			if (isFromJar)
				examples.setLocator(repositoryJar);
			else
				examples.setLocator(repositoryFS);
			examples.readRepository();
			logger.trace("getExamples(): "+examples.getExamples().size()+" example project(s) found.");
		}
		
		return examples;
	}
	
	private class ConfigureProjectAction extends AbstractAction {
		
		public ConfigureProjectAction() {
			putValue(NAME, "Config");
			putValue(SHORT_DESCRIPTION, "Configure Project.");
		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			logger.debug("configure");
			ConfigureProjectDialog dialog = new ConfigureProjectDialog(
					examples.getExamples(), 
					editor.getGraphComponent().getX(), 
					editor.getGraphComponent().getY(), repositoryFS);
			GlobalVar.setDefaultProject(dialog.getSelectedProject());
			if (GlobalVar.getDefaultProject() != null)
				btnInitWorkflow.setEnabled(true);
		}
	}
	
	private class InitWorkflowAction extends AbstractAction {
		public InitWorkflowAction() {
			putValue(NAME, "Init");
			putValue(SHORT_DESCRIPTION, "Initialize Workflow.");	
		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			logger.debug("Init: ");
			GlobalVar.getDefaultProject().setFromJar(isFromJar);
			boolean rc = GlobalVar.getDefaultProject().init((EasyFlowGraph) editor.getGraphComponent().getGraph());
			GlobalVar.getDefaultProject().getActiveWorkflow().setWorker(editor.getComposeWorkflowPanel().getWorker());
			btnDeleteGraph.setEnabled(true);
			btnGenAbstractWorkflow.setEnabled(true);
			btnCalcAll.setEnabled(true);
			btnInitWorkflow.setEnabled(false);
			GlobalVar.getDefaultProject().getActiveWorkflow().
				printWorkflowStepMsgOnEnd(rc, GlobalConstants.START);
			/*
			//Testing... how the graph is displayed
			//Adds cells to the model in a single step
			mxGraph graph = editor.getGraphComponent().getGraph();
			graph.getModel().beginUpdate();
			try
			{
			   Object v1 = graph.insertVertex(graph.getDefaultParent(), null, "Hello,", 20, 20, 80, 30);
			   Object v2 = graph.insertVertex(graph.getDefaultParent(), null, "World!", 200, 150, 80, 30);
			   Object e1 = graph.insertEdge(graph.getDefaultParent(), null, "", v1, v2);
			}
			finally
			{
			   // Updates the display
			   graph.getModel().endUpdate();
			}
			*/
		}
	}
		
	private class DeleteGraphAction extends AbstractAction {

		public DeleteGraphAction() {
			putValue(NAME, "DeleteGraph");
			putValue(SHORT_DESCRIPTION, "Delete Graph.");
			
		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			IProject defaultProject = GlobalVar.getDefaultProject();
			if (defaultProject .getActiveWorkflow()!=null)
				defaultProject.resetWorkflowStep();
			defaultProject.delete();
			//btnDeleteGraph.setEnabled(false);
			//btnInitWorkflow.setEnabled(true);
			initButtons();
		}
	}
	
	private class CalcAllProjectAction extends AbstractAction {
		public CalcAllProjectAction() {
			putValue(NAME, "CalcAll");
			putValue(SHORT_DESCRIPTION, "Perform whole composition cycle.");
		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			try {
				DefaultProject defaultProject = GlobalVar.getDefaultProject();
				logger.debug(defaultProject.getActiveWorkflow());
				
					if (defaultProject.generateAbstractGraph()
							&& defaultProject.resolveTraversalCriteria()
							&& defaultProject.applyGroupingCriteria()
							&& defaultProject.applyParameterCriteria()
							&& defaultProject.resolveUtilityTasks()
							&& defaultProject.resolvePreprocessingTasks()
							&& defaultProject.resolveToolDependencies()
							&& defaultProject.generateWorklowForExecutionSystem()
						)
					{
						//btnResolveUtilityTasks.setEnabled(true);
					}
					btnCalcAll.setEnabled(false);
					btnGenAbstractWorkflow.setEnabled(false);
					
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

				} catch (CellNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (GroupingCriterionInstanceNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoValidInOutDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private class GenAbstractWorkflowAction extends AbstractAction {
		public GenAbstractWorkflowAction() {
			putValue(NAME, "GenAbsW");
			putValue(SHORT_DESCRIPTION, "Initialize workflow from template file");
		}
		public void actionPerformed(ActionEvent ae) {
			
			try {
				GlobalVar.getDefaultProject().getActiveWorkflow().printWorkflowStepMsgOnStart(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW);
				if (GlobalVar.getDefaultProject().generateAbstractGraph() && 
					GlobalVar.getDefaultProject().resolveTraversalCriteria())
				{
					btnApplyGroupingCrit.setEnabled(true);
					btnApplyParameterCrit.setEnabled(true);
				}
				btnGenAbstractWorkflow.setEnabled(false);
				btnCalcAll.setEnabled(false);
			} catch (CellNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TaskNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	private class ApplyGroupingCritAction extends AbstractAction {
		public ApplyGroupingCritAction() {
			putValue(NAME, "groupCrit");
			putValue(SHORT_DESCRIPTION, "apply metadata (i.e. sample, readgroup, group, ...)");
		}
		public void actionPerformed(ActionEvent ae) {
			try {
				if (GlobalVar.getDefaultProject().applyGroupingCriteria())
				{
					
					btnResolveUtilityTasks.setEnabled(true);
				}
				btnApplyGroupingCrit.setEnabled(false);
				btnGenAbstractWorkflow.setEnabled(false);
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
		}
	}
	
	private class ApplyParameterCritAction extends AbstractAction {

		public ApplyParameterCritAction() {
			putValue(NAME, "paramCrit");
			putValue(SHORT_DESCRIPTION, "apply all defined parameter criterion");

		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			try {
				if (GlobalVar.getDefaultProject().applyParameterCriteria())
				{
					
					//btnResolveUtilityTasks.setEnabled(true);
				}
				btnApplyParameterCrit.setEnabled(false);
				btnGenAbstractWorkflow.setEnabled(false);
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
			
		}
		
	}
	
	private class ResolveUtilityTaskAction extends AbstractAction
	{
		public ResolveUtilityTaskAction()
		{
			putValue(NAME, "util");
		}
		public void actionPerformed(ActionEvent ae) {
			try {
				if (GlobalVar.getDefaultProject().resolveUtilityTasks()
					&& GlobalVar.getDefaultProject().resolvePreprocessingTasks()
					)
				{
					btnResolveToolDeps.setEnabled(true);
					
				}
				btnResolveUtilityTasks.setEnabled(false);
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
			} catch (TaskNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private class ResolveToolDepsAction extends AbstractAction {
		public ResolveToolDepsAction() {
			putValue(NAME, "resovleTool");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if (GlobalVar.getDefaultProject().resolveToolDependencies())
				{

					btnGenerateExecWorkflow.setEnabled(true);
				}
				btnResolveToolDeps.setEnabled(false);
			} catch (NoValidInOutDataException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private class GenerateExecWorkflowAction extends AbstractAction {
		public GenerateExecWorkflowAction() {
			putValue(NAME, "genExecWorkflow");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (GlobalVar.getDefaultProject().generateWorklowForExecutionSystem())
			{
				
			}
			btnGenerateExecWorkflow.setEnabled(false);
		}
	}
	
	private class ValidateGraphComponentAction extends AbstractAction {
		public ValidateGraphComponentAction() {
			putValue(NAME, "validate");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}

	private class ComputeNextAction extends AbstractAction {
		public ComputeNextAction() {
			putValue(NAME, "Next");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class ApplyNextTraversalEventAction extends AbstractAction {
		public ApplyNextTraversalEventAction() {
			putValue(NAME, "next");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}

}
