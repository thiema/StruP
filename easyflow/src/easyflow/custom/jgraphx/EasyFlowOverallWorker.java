package easyflow.custom.jgraphx;

import org.apache.log4j.Logger;

import easyflow.custom.util.GlobalVar;
import easyflow.ui.DefaultProject;

public class EasyFlowOverallWorker extends EasyFlowWorker {


	
	private static final Logger         logger = Logger.getLogger(EasyFlowOverallWorker.class);
	private final ComposeWorkflowPanel composeWorkflowPanel;
	
	private boolean generateAbstractGraph   = true;
	private boolean resolveTraversalCriterion = true;
	private boolean applyGroupingCriterion  = true;
	private boolean addUtilityTask          = true;
	private boolean applyParameterCriterion = true;
	
	private boolean processNextStepOnly     = true;
	
	
	public EasyFlowOverallWorker(DefaultProject defaultProject, 
			Informable informable, ComposeWorkflowPanel composeWorkflowPanel) {
		super(defaultProject, informable);
		this.composeWorkflowPanel = composeWorkflowPanel;
		setProgress(0);
		// TODO Auto-generated constructor stub
	}

	public EasyFlowOverallWorker(Informable informable, ComposeWorkflowPanel composeWorkflowPanel) {
		super(informable);
		this.composeWorkflowPanel = composeWorkflowPanel;
		setProgress(0);
		// TODO Auto-generated constructor stub
	}

	public boolean isAddUtilityTask() {
		return addUtilityTask;
	}

	public void setAddUtilityTask(boolean addUtilityTask) {
		this.addUtilityTask = addUtilityTask;
	}

	public boolean isApplyGroupingCriterion() {
		return applyGroupingCriterion;
	}

	public void setApplyGroupingCriterion(boolean applyGroupingCriterion) {
		this.applyGroupingCriterion = applyGroupingCriterion;
	}

	public boolean isApplyParameterCriterion() {
		return applyParameterCriterion;
	}

	public void setApplyParameterCriterion(boolean applyParameterCriterion) {
		this.applyParameterCriterion = applyParameterCriterion;
	}

	public boolean isGenerateAbstractGraph() {
		return generateAbstractGraph;
	}

	public void setGenerateAbstractGraph(boolean generateAbstractGraph) {
		this.generateAbstractGraph = generateAbstractGraph;
	}

	public boolean isResolveTraversalCriterion() {
		return resolveTraversalCriterion;
	}

	public void setResolveTraversalCriterion(boolean resolveTraversalCriterion) {
		this.resolveTraversalCriterion = resolveTraversalCriterion;
	}

	public boolean isProcessNextStepOnly() {
		return processNextStepOnly;
	}

	public void setProcessNextStepOnly(boolean processNextStepOnly) {
		this.processNextStepOnly = processNextStepOnly;
	}
	
	private int getCurrentProgress(int cur, int tot)
	{
		return (int) ((cur)/((double)tot)*100);
	}
	
	private void runAndWait(EasyFlowWorker w) throws InterruptedException
	{
		w.execute();
		while (!w.isDone())
			Thread.sleep(200);
	}
	
	private void updateProgress(int cur, int tot)
	{
		setProgress(getCurrentProgress(cur, tot));
		composeWorkflowPanel.getTaskLabel().setText(getDefaultProject().getWorkflowStepLabelFor(getDefaultProject().getNextWorkflowStep()));
		composeWorkflowPanel.getTextAreaTaskDesc().setText(getDefaultProject().getWorkflowStepDescFor(getDefaultProject().getNextWorkflowStep()));
		getInformable().messageChanged("dummy");
		logger.trace(cur+" "+tot+" "+getCurrentProgress(cur, tot)+" "+getProgress());
	}
		
	@Override
	public Integer doInBackground() throws Exception {
		
		int i=getDefaultProject().getNumberOfCurrentWorkflowStep();
		int rc=0;
		int numberOfTasks=getDefaultProject().getTotalNumberOfWorkflowSteps();
		
		
		logger.debug(getDefaultProject().getNextWorkflowStep()+" "+getDefaultProject().hasNextWorkflowStep());
		while (getDefaultProject().hasNextWorkflowStep())
		{
			logger.debug(getDefaultProject().getWorkflowStepLabelFor(getDefaultProject().getNextWorkflowStep()));
			if (isCancelled())
				break;
			updateProgress(++i,numberOfTasks);
			rc = getDefaultProject().runNextWorkflowStep();
			GlobalVar.getGraphUtil().layoutGraph();
			if (rc != 0)
				break;
			if (isProcessNextStepOnly())
				break;
		}
		logger.debug(getProgress()+" "+getDefaultProject().hasNextWorkflowStep());
		if (isProcessNextStepOnly() && getDefaultProject().hasNextWorkflowStep())
			return 1;
		logger.debug(isDone()+" "+isWorkflowDone());
		if (rc == 0)
		{
			//updateProgress(++i, numberOfTasks);
			composeWorkflowPanel.getTaskLabel().setText("finished");
			composeWorkflowPanel.getTextAreaTaskDesc().setText("");
		}
		else if (isCancelled())
		{
			composeWorkflowPanel.getTaskLabel().setText("cancelled");
		}
		else
		{
			composeWorkflowPanel.getTaskLabel().setText("internal error");
		}

		logger.debug(isDone()+" "+isWorkflowDone());
		if (isDone() || isWorkflowDone())
		{
			composeWorkflowPanel.getStopButton().setEnabled(false);
			composeWorkflowPanel.getRunButton().setEnabled(false);
			composeWorkflowPanel.getNextButton().setEnabled(false);
		}

		
		return 1;
		
	}
	
	public boolean isWorkflowDone()
	{
		return getProgress()==100;
	}

}
