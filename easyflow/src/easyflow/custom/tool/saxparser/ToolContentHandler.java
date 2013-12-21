package easyflow.custom.tool.saxparser;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import easyflow.core.CoreFactory;
import easyflow.core.DataPort;
import easyflow.custom.util.URIUtil;
import easyflow.tool.Command;
import easyflow.tool.Data;
import easyflow.tool.DataFormat;
import easyflow.tool.DocumentProperties;
import easyflow.tool.InOutParameter;
import easyflow.tool.Interpreter;
import easyflow.tool.Key;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
import easyflow.tool.Tool;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolFactory;
import easyflow.tool.Package;

public class ToolContentHandler implements ContentHandler {
	
	List<Tool> tools = new ArrayList<Tool>();
	Map<String,Package> packages= new HashMap<String,Package>();
	Logger logger = Logger.getLogger(ToolContentHandler.class);
	Map<String, String> conditionalMap = new HashMap<String, String>();
	Map<String, URI> importMap = new HashMap<String, URI>();
	Map<String, DataFormat> dataFormatMap = new HashMap<String, DataFormat>();
	Stack<Tag> tagStack = new Stack<Tag>();
	Tool tool = null;
	Package pkg = null;
	Parameter parameter = null;
	Parameter subParam = null;
	Data data = null;
	DataPort dataPort = null;
	Key key = null;
	Requirement requirement = null;
	Tag curTag = null;
	Tag lastTag = null;
	Tag parentTag = null;
	String lastMainAttributeValue = null;
	DocumentProperties documentProperties = null;
	String xmlKey = null;
	String condition = null;
	String conditionValue = null;
	String action = null;
	boolean xmlKeyFound = false;
	boolean withinParam = false;
	boolean withinData = false;
	Map<String, String> dataStrings=new HashMap<String, String>();
	
	public static List<Tool> parse(URI source, DocumentProperties documentProperties, 
			ToolContentHandler toolContentHandler, String xmlKey)
	{
		if (toolContentHandler == null)
			toolContentHandler = new ToolContentHandler();
		
		if (xmlKey != null)
			toolContentHandler.setXMLKey(xmlKey);
		try {
			// XMLReader erzeugen
			//SAXParserFactory factory = SAXParserFactory.newInstance();
			//factory.setValidating(true);
			XMLReader xmlReader = XMLReaderFactory.createXMLReader();
			InputSource inputSource = new InputSource(URIUtil.getInputStreamReader(source, documentProperties.isFromJar()));
			toolContentHandler.setDocumentProperties(documentProperties);
			xmlReader.setContentHandler(toolContentHandler);
			xmlReader.parse(inputSource);
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return toolContentHandler.getTools();
	}

	public boolean shallProcess(String curValue)
	{
		if (xmlKey == null || (xmlKey != null && xmlKeyFound))
			if (curValue == null || curValue.trim().length()>0)
				return true;
		return false;
	}

	
	public void setXMLKey(String xmlKey)
	{
		this.xmlKey = xmlKey;
	}
	
	public List<Tool> getTools() 
	{
		return tools;
	}
	
	public void setDocumentProperties(DocumentProperties documentProperties) 
	{
		this.documentProperties = documentProperties;
	}
		
	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void startDocument() throws SAXException {
		logger.trace("startDoc: lastTag="+lastTag+" lastAttrib="+lastMainAttributeValue+" parameter="+parameter);
	}

	@Override
	public void endDocument() throws SAXException {
		
		logger.trace("endDoc: reset xmlKey: "+xmlKey+" "+xmlKeyFound);
		if (xmlKeyFound)
			xmlKeyFound = false;
		if (xmlKey != null)
			xmlKey = null;
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	private void setDataPort(String format)
	{
		List<String> formats = new ArrayList<String>();
		formats.add(format);
		setDataPort(formats);
	}
	private void setDataPort(List<String> formats)
	{
		for (String format:formats)
		{
			DataFormat dataFormat = null;
			if (dataFormatMap.containsKey(format))
			{
				dataFormat = dataFormatMap.get(format);
			}
			else
			{
				dataFormat = ToolFactory.eINSTANCE.createDataFormat();
				dataFormat.setName(format);
			}
			dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
		}
	}
	private void setParam(Attributes atts, Parameter parameter)
	{
		parameter.setName(atts.getValue("name"));
		parameter.setType(atts.getValue("type"));
		if (atts.getValue("optional")!=null)
			parameter.setOptional(atts.getValue("optional").equals("true")?true:false);
		if (atts.getValue("multiple")!=null)
			parameter.setMultiple(atts.getValue("multiple").equals("true")?true:false);
		if (atts.getValue("multipleValue")!=null)
			parameter.setMultipleValue(atts.getValue("multipleValue").equals("true")?true:false);
		if (atts.getValue("defaultValue")!=null)
			parameter.setDefaultValue(atts.getValue("defaultValue"));
		if (atts.getValue("valueType")!=null)
			parameter.setValueType(atts.getValue("valueType"));
		if (atts.getValue("label")!=null)
			parameter.setLabel(atts.getValue("label"));
		if (atts.getValue("help")!=null)
			parameter.setHelp(atts.getValue("help"));
		if (atts.getValue("description")!=null)
			parameter.setDescription(atts.getValue("description"));
		if (atts.getValue("separator")!=null)
			parameter.setDelimiter(atts.getValue("separator"));
		if (atts.getValue("prefix")!=null)
			parameter.setPrefix(atts.getValue("prefix"));
		if (atts.getValue("minOcc")!=null)
			parameter.setMinOcc(new Integer(atts.getValue("minOcc")));
		if (atts.getValue("maxOCc")!=null)
			parameter.setMaxOcc(new Integer(atts.getValue("maxOcc")));
		if (atts.getValue("named")!=null)
			parameter.setNamed(atts.getValue("named").equals("true")?true:false);
		if (atts.getValue("advanced")!=null)
			parameter.setAdvanced(atts.getValue("advanced").equals("true")?true:false);
		if (atts.getValue("grouping")!=null)
			for (String group:atts.getValue("grouping").split(","))
				parameter.getGrouping().add(group);
		if (atts.getValue("data")!=null)
		{
			dataStrings.put(parameter.getName(), atts.getValue("data"));
		}
		if (atts.getValue("type").equals("data"))
		{
			Data data = ToolFactory.eINSTANCE.createData();
			
			data.setName(parameter.getName());
			if (atts.getValue("output")!=null)
			{
				if (atts.getValue("output").equalsIgnoreCase("true"))
					data.setOutput(true);
				else
					data.setOutput(false);
			}
			else
				data.setOutput(false);
			
			if (tool.getData().containsKey(data.getName()))
				logger.warn("overiding data="+data.getName()+ "of tool="+tool.getId());
			tool.getData().put(data.getName(), data);
			if (atts.getValue("format")!=null)
				for (String format:atts.getValue("format").split(","))
					((InOutParameter)parameter).getFormats().add(format);
			if (atts.getValue("handle")!=null)
				for (String handle:atts.getValue("handle").split(","))
					((InOutParameter)parameter).getHandles().add(handle);
			dataPort = CoreFactory.eINSTANCE.createDataPort();
			dataPort.setName(parameter.getName());
			dataPort.getTools().put(tool.getName(), tool);
			data.setPort(dataPort);
			setDataPort(((InOutParameter)parameter).getFormats());
			
		}
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		

		Tag tag = Tag.valueOf(localName.toUpperCase());
		curTag  = tag;
		tagStack.push(curTag);
		//init parent and lastTag
		if (parentTag==null)
		{
			parentTag = curTag;
			lastTag   = curTag;
		}
		//logger.trace("curTag="+curTag+" lastTag="+lastTag+" parentTag="+parentTag+" stack="+tagStack.toString());
		if (shallProcess(null))
		{
		
		
		
		switch (tag) {
			case TOOLS:
				break;
			case PACKAGE:
				pkg = ToolFactory.eINSTANCE.createPackage();
				pkg.setDescription(atts.getValue("description"));
				pkg.setName(atts.getValue("name"));
				if (atts.getValue("id")==null)
					pkg.setId(pkg.getName());
				else
					pkg.setId(atts.getValue("id"));
				pkg.setVersion(atts.getValue("version"));
				packages.put(pkg.getName(), pkg);
			case TOOL:
				dataStrings.clear();
				tool=ToolFactory.eINSTANCE.createTool();
				tools.add(tool);
				Command command=ToolFactory.eINSTANCE.createCommand();
				tool.setCommand(command);
				tool.setName(atts.getValue("name"));
				if (atts.getValue("id")==null)
					tool.setId(tool.getName());
				else
					tool.setId(atts.getValue("id"));
				tool.setVersion(atts.getValue("version"));
				break;
			case MACROS:
				break;
			case IMPORT:
				break;
			case EXPAND:
				for (URI source:importMap.values())
				{
					logger.debug("parse macro defintion: "+source+" for key "+atts.getValue("macro"));
					parse(source, documentProperties, this, atts.getValue("macro"));
				}
				break;
			case XML:
				xmlKeyFound = true;
			case YIELD:
				xmlKeyFound = false;
			case REQUIREMENT:
				requirement = ToolFactory.eINSTANCE.createRequirement();
				requirement.setType(atts.getValue("type"));
				requirement.setVersion(atts.getValue("version"));
				tool.getRequirements().add(requirement);
			case DESCRIPTION:
				break;
			case COMMAND:
				tool.getCommand().setName(atts.getValue("name"));
				break;
			case REQUIREMENTS:
				break;
			case INTERPRETER:
				break;
			case PARAM:
				withinParam = true;
				if ("WHEN".equals(lastTag))
				{
					if (parameter.getValues().containsKey(lastMainAttributeValue))
					{
						subParam = parameter.getValues().get(lastMainAttributeValue);
						setParam(atts, subParam);
					}
				}
				else
				{
					if (atts.getValue("type").equals("data"))
					{
						parameter = ToolFactory.eINSTANCE.createInOutParameter();
					}
					else
					{
						parameter = ToolFactory.eINSTANCE.createParameter();
					}
					setParam(atts, parameter);
					
					tool.getCommand().getParameters().put(parameter.getName(), parameter);
					if ("PACKAGE".equals(parentTag))
						pkg.getParameters().put(parameter.getName(), parameter);
					
				}
				break;
			case KEY:
				key = ToolFactory.eINSTANCE.createKey();
				key.setName(atts.getValue("name"));
				if (atts.getValue("type")!=null)
					key.setType(atts.getValue("type"));
				if (atts.getValue("prefix")!=null)
					key.setPrefix(atts.getValue("prefix"));
				if (atts.getValue("separator")!=null)
					key.setDelimiter(atts.getValue("separator"));
				
				parameter.getKeys().add(key);
				break;
			case OPTION:
				if (withinData)
				{
					if (conditionalMap.containsKey("name"))
					{
					}
				}
				else
				{
					subParam = ToolFactory.eINSTANCE.createParameter();
					parameter.getValues().put(atts.getValue("value"), subParam);
				}
				break;
			case ACTIONS:
				break;
			case CONDITIONAL:
				conditionalMap.put("name", atts.getValue("name"));
				break;
			case WHEN:
				lastMainAttributeValue = atts.getValue("value");
				conditionalMap.put("when_value", atts.getValue("value"));
				break;
			case ACTION:
				conditionalMap.put("action_type", atts.getValue("type"));
				if (atts.getValue("type").equals("format"))
				{
					String format = conditionalMap.get("when_value");
					setDataPort(format);

				}
					
				break;
			case DATA:
				withinData = true;
				data = ToolFactory.eINSTANCE.createData();
				if (atts.getValue("description") !=null)
					data.setDescription(atts.getValue("description"));
				if (atts.getValue("name") !=null)
					data.setName(atts.getValue("name"));
				if (atts.getValue("label") !=null)
					data.setLabel(atts.getValue("label"));
				if (atts.getValue("format") != null)
					data.setFormat(atts.getValue("format"));
				data.setOutput(atts.getValue("output")==null?
						false:atts.getValue("output").equals("true"));
				if (tool.getData().containsKey(data.getName()))
					logger.warn("overiding data="+data.getName()+ "of tool="+tool.getId());
				tool.getData().put(data.getName(), data);
				dataPort = CoreFactory.eINSTANCE.createDataPort();
				dataPort.setName(data.getName());
				data.setPort(dataPort);
				break;
			default: 
				break;
		}
		
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		lastTag   = tagStack.pop();
		if (tagStack.isEmpty())
			parentTag=null;
		else
			parentTag = tagStack.peek();
		//logger.trace("curTag="+curTag+" lastTag="+lastTag+" parentTag="+parentTag);
		
		switch (curTag) {
			case ACTIONS:
				conditionalMap.clear();
				break;
			case DATA:
				withinData = false;
				if (data.getPort().getDataFormats() == null || data.getPort().getDataFormats().isEmpty())
				{
					String format = data.getFormat();
					setDataPort(format);
				}
				data = null;
				
				break;
			case PARAM:
				withinParam = false;
				break;
			case TOOL:
				for (Entry<String, String> e:dataStrings.entrySet())
				{
					if (tool.getCommand().getParameters().containsKey(e.getKey()))
					{
						Parameter p=tool.getCommand().getParameters().get(e.getKey());
					
						for (String dataString:StringUtils.split(e.getValue()))
						{
							if (tool.getData().containsKey(dataString))
							{
								Data d=tool.getData().get(dataString);
								p.getData().add(d);
							}
							else
							{
								logger.warn("couldnt find data "+dataString+" which is referenced by parameter "+e.getKey() );
							}
						}
					}
					else
					{
						logger.warn("couldnt find parameter "+e.getKey());
					}
				}
			default:
				break;
		}
		curTag=parentTag;
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		String curValue=new String(ch, start, length);
		if (shallProcess(curValue))
		{
			if (curTag != null)
			{
				//logger.debug(curValue.length()+" chars="+curValue+" curTag="+curTag+" ");
				switch(curTag)
				{
					case KEY:
						key.setValue(curValue);
						break;
					case OPTION:
						subParam.setName(curValue);
						break;
					case REQUIREMENT:
						requirement.setValue(curValue);
						break;
					case IMPORT:				
						try {
							logger.debug("import macro="+curValue);
							URI source = URIUtil.addToURI(URIUtil.getDirnameUri(documentProperties.getSourceURI()), curValue);
							importMap.put(curValue, source);
						} catch (URISyntaxException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					default: 
						break;
				}
			}
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public enum Tag {
		EASYFLOW, TOOLS, MACROS, IMPORT,
        XML, EXPAND, YIELD,
        PACKAGE,
        TOOL, DESCRIPTION, INTERPRETER, EXE,
        HELP, REQUIREMENTS, REQUIREMENT, COMMAND, PARAM, DATA,
        CONDITIONAL, 
        ACTIONS, WHEN, KEY, OPTION, ACTION, FILTER, 
        VALIDATOR, OPTIONS,
        TEMPLATE, TOKEN,
        CHANGE_FORMAT, 
        TOOL_DEPENDENCY, INSTALL, SOURCE_DIRECTORY, ENVIRONMENT_VARIABLE, DESTINATION_DIRECTORY, README,REPOSITORY

	};
}
