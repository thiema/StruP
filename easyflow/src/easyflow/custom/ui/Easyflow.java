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
import easyflow.custom.util.URIUtil;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;

public class Easyflow {
	
	private static boolean isFromJar;
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		
		Examples examples = ExampleFactory.eINSTANCE.createExamples();
			
		if (URIUtil.isFromJar("easyflow/custom/ui/Easyflow.class"))
		{
			// when this program is started as a jar (i.e. not within eclipse) this behaviour should be applied:
			
			// this works until a directory is given and all xml files from the directory should be taken...
			//examples.setLocator("/easyflow/custom/examples");
			//examples.setFromJar(true);
			//isFromJar = true;
			
			// currently we assume that after unzipping the zip (easyflow.zip, as it is shipped to the user)
			// the following folder structure/files exists and files can be read from filesystem directly, instead
			// of from the jar
			// easyflow/
			// easyflow/examples -> this is essentially for providing the examples
			// easyflow/jar
			// easyflow/start.sh
			
			examples.setLocator("./examples");
			examples.setFromJar(false);
			isFromJar = false;
		}
		else
		{
			//examples.setLocator("/home/heinz/git/easyflow/easyflow/src/easyflow/custom/examples");
			examples.setLocator("./src/easyflow/custom/examples");
			examples.setFromJar(false);
			isFromJar = false;
		}
		
		examples.readRepository();
		logger.debug("Available projects:"+examples.getExamples().keySet());
		//DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
		//defaultProject.setBasePath("/easyflow/custom/examples/sequencing/");
		if (!examples.getExamples().isEmpty())
		{
			
			DefaultProject defaultProject = examples.getExamples().get(0).getValue();
			//DefaultProject defaultProject = examples.getExamples().get("abstract_simple");
			//DefaultProject defaultProject = examples.getExamples().get("abstract1");
			//DefaultProject defaultProject = examples.getExamples().get("abstract2");
			if (defaultProject != null)
			{
			
			defaultProject.setFromJar(isFromJar);
			try {
				defaultProject.init(null);
				defaultProject.generateAbstractGraph();
				//((WorkflowImpl)defaultProject.getActiveWorkflow()).printGraph();
				defaultProject.resolveTraversalCriteria();
				
				defaultProject.applyGroupingCriteria();
				//defaultProject.applyParameterCriteria();
				
				defaultProject.resolveUtilityTasks();
				defaultProject.resolvePreprocessingTasks();
				
				// datalinks grouping criterion is possibly changed to param crit name   
				//defaultProject.applyParameterCriteria();
				
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
}
