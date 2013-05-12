package easyflow.sequencing.examples;

import org.apache.log4j.Logger;

import easyflow.impl.EasyflowFactoryImpl;
import easyflow.ui.DefaultProject;
import easyflow.ui.ResequencingProject;
import easyflow.ui.UiFactory;

public class Easyflow {
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		ResequencingProject resequencingProject=UiFactory.eINSTANCE.createResequencingProject();
		resequencingProject.setBasePath("/easyflow/sequencing/examples/");
		resequencingProject.autoSetup();
		resequencingProject.applyTraversalEvents();
		//resequencingProject.applyTraversalEvents();
	}
	
}
