package easyflow.custom.jgraphx.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.util.GlobalVar;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;


public class EasyFlowToolBar extends JToolBar
{
	private static final Logger              logger = Logger.getLogger(EasyFlowToolBar.class);
	private        final EasyFlowGraphEditor editor;
	private              Examples            examples;
	private              String         defaultProjectType = "sequencing";
	private static final boolean		isFromJar	       = false;
	private static final String         repositoryJar      = "/easyflow/custom/examples";
	private static String               repositoryFS       = "easyflow/custom/examples";
	private static final String         repositoryFS_src   = "src/easyflow/custom/examples";
	// when running from ../easyflow/build folder the path is 
	private static final String         repositoryFS_bin   = "build/classes/easyflow/custom/examples";

	
	final Action configureProjectAction    = new ConfigureProjectAction();
	final Action initWorkflowAction        = new InitWorkflowAction();
	final Action deleteGraphAction         = new DeleteGraphAction();
	
	final Action genAbstractWorkflowAction = new GenAbstractWorkflowAction();
	final Action applyTraversalCritAction  = new ApplyTraversalCritAction();
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
	final JButton btnApplyTraversalCrit    = add(applyTraversalCritAction);
	final JButton btnApplyParameterCrit    = add(applyParameterCritAction);
	final JButton btnResolveUtilityTasks   = add(resolveUtilityTasksAction);
	final JButton btnResolveToolDeps         = add(resolveToolDepsAction);
	final JButton btnGenerateExecWorkflow    = add(generateExecWorkflowAction);

	final JButton btnCalcAll                 = add(calcAllProjectAction);
	final JButton btnApplyNextTraversalEvent = add(applyNextTraversalEvent);

	
	public EasyFlowToolBar(EasyFlowGraphEditor easyFlowGraphEditor,
			int horizontal) {
		editor = easyFlowGraphEditor;
		
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
				repositoryFS=repositoryFS_bin;
			else
				repositoryFS=null;
		}
		logger.debug("Constructor: set editor. graph="+editor.getGraphComponent().getGraph()
				+" fs repo="+repositoryFS+" read from jar="+isFromJar+" jar repo="+repositoryJar);
		
		DefaultProject defaultProject = getExamples(true).getExamples().get(defaultProjectType);
		if (defaultProject == null)
		{
			logger.warn("Couldnt read default project definition.");
			btnInitWorkflow.setEnabled(false);
		}
		else
			GlobalVar.setDefaultProject(defaultProject);
		
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
					editor.getGraphComponent().getY());
			
			GlobalVar.setDefaultProject(dialog.getSelectedProject());

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
			GlobalVar.getDefaultProject().init((EasyFlowGraph) editor.getGraphComponent().getGraph());
			
			btnDeleteGraph.setEnabled(true);
			btnGenAbstractWorkflow.setEnabled(true);
			btnCalcAll.setEnabled(true);
			btnInitWorkflow.setEnabled(false);
		}
	}
		
	private class DeleteGraphAction extends AbstractAction {

		public DeleteGraphAction() {
			putValue(NAME, "DeleteGraph");
			putValue(SHORT_DESCRIPTION, "Delete Graph.");
			
		}
		@Override
		public void actionPerformed(ActionEvent ae) {}
	}
	
	private class CalcAllProjectAction extends AbstractAction {
		public CalcAllProjectAction() {
			putValue(NAME, "CalcAll");
			putValue(SHORT_DESCRIPTION, "Perform whole analysis.");
		}
		@Override
		public void actionPerformed(ActionEvent ae) {}
	}

	private class GenAbstractWorkflowAction extends AbstractAction {
		public GenAbstractWorkflowAction() {
			putValue(NAME, "GenAbsW");
			putValue(SHORT_DESCRIPTION, "Initialize workflow from template file");
		}
		public void actionPerformed(ActionEvent ae) {
			
			try {
				if (GlobalVar.getDefaultProject().generateAbstractGraph() && 
					GlobalVar.getDefaultProject().resolveTraversalCriteria())
				{
					btnApplyTraversalCrit.setEnabled(true);
					btnApplyParameterCrit.setEnabled(true);
				}
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
			System.out.println("ApplyGroupingCrit");
		}
	}
	
	private class ApplyParameterCritAction extends AbstractAction {

		public ApplyParameterCritAction() {
			putValue(NAME, "paramCrit");
			putValue(SHORT_DESCRIPTION, "apply all defined parameter criterion");

		}
		@Override
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ApplyTraversalCritAction extends AbstractAction {
		public ApplyTraversalCritAction() {
			putValue(NAME, "travCrit");
			putValue(SHORT_DESCRIPTION, "apply all defined splitting criterion");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("ApplySplitCrit");

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
	
	private class ResolveUtilityTaskAction extends AbstractAction
	{
		public ResolveUtilityTaskAction()
		{
			putValue(NAME, "util");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	private class ResolveToolDepsAction extends AbstractAction {
		public ResolveToolDepsAction() {
			putValue(NAME, "resovleTool");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class GenerateExecWorkflowAction extends AbstractAction {
		public GenerateExecWorkflowAction() {
			putValue(NAME, "genExecWorkflow");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}
