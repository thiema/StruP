package easyflow.custom.ui;

import org.apache.log4j.Logger;

import easyflow.core.impl.WorkflowImpl;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;

public class Easyflow {
	
	private static final boolean isFromJar = false;
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		
		Examples examples = ExampleFactory.eINSTANCE.createExamples();
		if (isFromJar)
			examples.setLocator("/easyflow/custom/examples");
		else
		{
			//examples.setLocator("/home/heinz/git/easyflow/easyflow/src/easyflow/custom/examples");
			examples.setLocator("./src/easyflow/custom/examples");
			examples.setFromJar(false);
		}
		
		examples.readRepository();
		logger.debug("Available projects:"+examples.getExamples().keySet());
		//DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
		//defaultProject.setBasePath("/easyflow/custom/examples/sequencing/");
		if (!examples.getExamples().isEmpty())
		{
			DefaultProject defaultProject = examples.getExamples().get(0).getValue();
			if (!isFromJar)
				defaultProject.setFromJar(false);
			try {
				defaultProject.init(null);
				defaultProject.generateAbstractGraph();
				//((WorkflowImpl)defaultProject.getActiveWorkflow()).printGraph();
				defaultProject.resolveTraversalCriteria();
				
				defaultProject.applyGroupingCriteria();
				defaultProject.applyParameterCriteria();
				
				defaultProject.resolveUtilityTasks();
				defaultProject.resolvePreprocessingTasks();
				
				defaultProject.resolveToolDependencies();
				
				defaultProject.generateWorklowForExecutionSystem();
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
			catch (DataLinkNotFoundException e) {	e.printStackTrace();}
			catch (DataPortNotFoundException e) {e.printStackTrace();}
			catch (ToolNotFoundException e) {e.printStackTrace();}
			catch (UtilityTaskNotFoundException e) {e.printStackTrace();}
			catch (NoValidInOutDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}

			
		}
	}	
}
