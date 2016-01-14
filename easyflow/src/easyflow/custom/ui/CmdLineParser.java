package easyflow.custom.ui;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CmdLineParser {
	
	private static Options     options = null;
	private static CommandLine cmdLine = null;
	private static CommandLineParser parser = null;
	private boolean optionsParsedResult = true;
	
	public CmdLineParser()
	{
		if (options == null)
			options = new Options();
	}
	
	
	
	public void initOptions()
	{
		// create Options object
		

		options.addOption("c", "config",   true, "main configuration file (json format)");
		options.addOption("p", "basePath", true, "basic path to configuration files.");
		options.addOption("l", "logLevel", true, "log level.");
	}
	
	public void printHelp()
	{
		HelpFormatter formatter = new HelpFormatter();
		String header = "Do something useful with an input file\n\n";
		String footer = "\nPlease report issues at http://example.com/issues";
		formatter.printHelp("strup", header, options, footer, true);
	}
	
	public boolean parseOptions(String[] args)
	{
		
		// create the parser
		if (parser == null)
		{
			parser = new GnuParser();
		    try {
		        // parse the command line arguments
		        cmdLine = parser.parse( options, args );
		    }
		    catch( ParseException exp ) {
		        // oops, something went wrong
		        System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
		        printHelp();
		        optionsParsedResult = false;
		    }
		}
	    return optionsParsedResult;
	}
	
	public Options getOptions()
	{
		return options;
	}
	
	public CommandLine getCommandLine()
	{
		return cmdLine;
	}
	
	public String getConfigFile()
	{
		return cmdLine.getOptionValue("config");
	}
	
	public String getBasePath()
	{
		return cmdLine.getOptionValue("basePath");
	}
	
	public String getLogLevel()
	{
		return cmdLine.getOptionValue("logLevel");
	}
	
}
