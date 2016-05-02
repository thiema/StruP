package easyflow.custom.ui;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.URIUtil;
import easyflow.custom.util.Util;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;

public class Easyflow {
	
	private static boolean isFromJar;
	//private static final Logger logger = Logger.getRootLogger();
	private static final Logger logger = Logger.getLogger(Easyflow.class);
	
	public static void main(String args[]) {
		
		CmdLineParser cmdLineParser = new CmdLineParser();
		cmdLineParser.initOptions();
		cmdLineParser.parseOptions(args);
		boolean readFromExamples = false;

		if (cmdLineParser.getLogLevel() != null)
		{
			String loglevel = cmdLineParser.getLogLevel();
			Level level = null;
			if (loglevel.equalsIgnoreCase("FATAL"))
				level = Level.FATAL;
			else if (loglevel.equalsIgnoreCase("ERROR"))
				level = Level.ERROR;
			else if (loglevel.equalsIgnoreCase("WARN"))
				level = Level.WARN;
			else if (loglevel.equalsIgnoreCase("INFO"))
				level = Level.INFO;
			else if (loglevel.equalsIgnoreCase("DEBUG"))
				level = Level.DEBUG;
			else if (loglevel.equalsIgnoreCase("TRACE"))
				level = Level.TRACE;
			if (level != null)
			{
				//LogManager.getRootLogger().setLevel((Level) Level.ERROR);
/*				System.setProperty("log4j.defaultInitOverride", "true");
				BasicConfigurator.configure();
				File log4jPropertiesFile = new File("dummy.log4j");
				PropertyConfigurator.configure(log4jPropertiesFile.getAbsolutePath());
				Logger.getRootLogger().setLevel(level);*/
				//logger.setLevel(level);
				//logger.debug("set loglevel to value="+level);
				//System.exit(1);
				Properties props = new Properties();
				try {
					InputStream configStream = Easyflow.class
							.getResourceAsStream("/log4j.properties");
					props.load(configStream);
					configStream.close();
				} catch (IOException e) {
					System.out
							.println("Error: Cannot laod configuration file ");
				}
				// props.setProperty("log4j.rootLogger","DEBUG, file");
				// props.setProperty("log4j.appender.file.File","out.log");
				props.setProperty("log4j.rootLogger", level.toString()
						+ ", stdout");
				props.setProperty("log4j.logger.easyflow", level.toString());
				LogManager.resetConfiguration();
				PropertyConfigurator.configure(props);
			}
			else
				logger.warn("did not understand loglevel value="+loglevel);
			
		}
		//System.exit(1);
		logger.debug("loglevel="+logger.getLevel()+" "+Logger.getRootLogger().getLevel()+" logger="+logger.hashCode()+" rootLogger="+Logger.getRootLogger().hashCode());
		Examples examples = ExampleFactory.eINSTANCE.createExamples();
		
		DefaultProject defaultProject = null;
		if (cmdLineParser.getConfigFile() != null)
		{
			defaultProject = UiFactory.eINSTANCE.createDefaultProject();
			
			//defaultProject.setConfigAndBasePath("./");
			try {
				defaultProject.setConfigSource(URIUtil.createURI(cmdLineParser.getConfigFile(), null));
				if (cmdLineParser.getBasePath() != null)
					defaultProject.setBaseURI(URIUtil.createURI(cmdLineParser.getBasePath(), null));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (URIUtil.isFromJar("easyflow/custom/ui/Easyflow.class"))
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
			readFromExamples = true;
		}
		else
		{
			//examples.setLocator("/home/heinz/git/easyflow/easyflow/src/easyflow/custom/examples");
			examples.setLocator("./src/easyflow/custom/examples");
			examples.setFromJar(false);
			isFromJar = false;
			readFromExamples = true;
		}
		
		if (readFromExamples)
		{
			examples.readRepository();
			logger.debug("Available projects:"+examples.getExamples().keySet());
			if (!examples.getExamples().isEmpty())
			{
				defaultProject = examples.getExamples().get(0).getValue();
				//DefaultProject defaultProject = examples.getExamples().get("abstract_simple");
				//DefaultProject defaultProject = examples.getExamples().get("abstract1");
				//DefaultProject defaultProject = examples.getExamples().get("abstract2");
			}
		}
		else
		{
		}
		logger.debug("logger name="+logger.getName()+" level="+logger.getLevel());
		
		if (defaultProject != null)
		{
			defaultProject.setFromJar(isFromJar);
			try {
				EasyFlowGraph graph = new EasyFlowGraph();
				defaultProject.init(graph);
				defaultProject.generateAbstractGraph();
				//((WorkflowImpl)defaultProject.getActiveWorkflow()).printGraph();
				defaultProject.resolveTraversalCriteria();
				defaultProject.applyGroupingCriteria();
				//defaultProject.applyParameterCriteria();
				
				defaultProject.resolveUtilityTasks();
				defaultProject.resolvePreprocessingTasks();
				
				// datalinks grouping criterion is possibly changed to param crit name   
				defaultProject.applyParameterCriteria();
				
				defaultProject.resolveToolDependencies();
				
				defaultProject.generateWorklowForExecutionSystem();
			}
			catch (Exception e) 
			{ 
				Util.printLastErrorInfo(e, null);
			}
		}
	}	
}
