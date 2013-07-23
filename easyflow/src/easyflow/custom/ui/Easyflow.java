package easyflow.custom.ui;

import org.apache.log4j.Logger;

import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;

public class Easyflow {
	
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		Examples examples = ExampleFactory.eINSTANCE.createExamples();
		examples.setLocator("/easyflow/custom/examples");
		examples.readRepository();
		logger.debug("Available projects:"+examples.getExamples().keySet());
		//DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
		//defaultProject.setBasePath("/easyflow/custom/examples/sequencing/");
		if (!examples.getExamples().isEmpty())
		{
			DefaultProject defaultProject = examples.getExamples().get(0).getValue();
			defaultProject.autoSetup();
			defaultProject.applyTraversalEvents();
		}
	}	
}
