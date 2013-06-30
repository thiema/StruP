package easyflow.sequencing.examples;

import org.apache.log4j.Logger;


import easyflow.sequencing.ResequencingProject;
import easyflow.sequencing.SequencingFactory;

public class Easyflow {
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		ResequencingProject resequencingProject=SequencingFactory.eINSTANCE.createResequencingProject();
		resequencingProject.setBasePath("/easyflow/sequencing/examples/");
		resequencingProject.autoSetup();
		resequencingProject.applyTraversalEvents();
		//resequencingProject.applyTraversalEvents();
	}
	
}
