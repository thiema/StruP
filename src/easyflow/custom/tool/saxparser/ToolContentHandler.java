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

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.URIUtil;
import easyflow.data.Data;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataPort;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Command;
import easyflow.tool.Condition;
import easyflow.tool.DocumentProperties;
import easyflow.tool.InOutParameter;
import easyflow.tool.Key;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;
import easyflow.tool.Package;

public class ToolContentHandler implements ContentHandler {
	
	Logger                  logger         = Logger.getLogger(ToolContentHandler.class);
	
	List<Tool>              tools          = new ArrayList<Tool>();
	Map<String,Package>     packages       = GlobalVar.getPackages();
	Map<String, String>     conditionalMap = new HashMap<String, String>();
	Map<String, URI>        importMap      = new HashMap<String, URI>();

	
	Stack<Tag>              tagStack       = new Stack<Tag>();
	Stack<ResolvedParam>    paramStack     = new Stack<ResolvedParam>();
	
	Package     pkg         = null;
	Tool        tool        = null;
	//Parameter   parameter   = null;
	//Parameter   subParam    = null;
	ResolvedParam subResolvedParam = null;
	ResolvedParam resolvedParam = null;
	OptionValue optionValue = null;
	Data        data        = null;
	DataPort    dataPort    = null;
	
	Key key = null;
	Requirement requirement = null;
	int no_requirement;
	Tag curTag    = null;
	Tag lastTag   = null;
	Tag parentTag = null;
	
	DocumentProperties documentProperties = null;
	String lastMainAttributeValue = null;
	String xmlKey           = null;
	String condition        = null;
	String conditionValue   = null;
	String conditionType    = null;
	String conditionName    = null;
	String conditionExp     = null;
	String grouping         = null;
	String action           = null;
	
	boolean xmlKeyFound     = false;
	
	boolean withinParam       = false;
	boolean withinData        = false;
	boolean withinPackage     = false;
	boolean withinTool        = false;
	boolean withinInterpreter = false;
	boolean withinConditional = false;
	boolean withinMetadataMap = false;
	boolean withinOption      = false;
	boolean isAbstractParam   = false;
	
	Map<String, String> dataStrings=new HashMap<String, String>();
	//Package -> Tool -> InfoType (e.g. Parameter, metadata) -> Map
	Map<String, Map<String, Map<String, Map<String, String>>>> masterMap = null;
	
	private static Map<String, Map<String, Map<String, String>>> createNewMap3()
	{
		return new HashMap<String, Map<String, Map<String, String>>>();
	}

	private static Map<String, Map<String, String>> createNewMap2()
	{
		return new HashMap<String, Map<String, String>>();
	}

	private static Map<String, String> createNewMap1()
	{
		return new HashMap<String, String>();
	}

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
		masterMap = GlobalVar.getMasterMap();
		logger.trace("startDoc: parentTag="+parentTag
				+" lastAttrib="+lastMainAttributeValue
				+" parameter="+(resolvedParam != null ? resolvedParam.resolveName() : null));
		no_requirement = 0;
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
/*
	private void setDataPort(String format)
	{
		List<String> formats = new ArrayList<String>();
		formats.add(format);
		setDataPort(formats);
	}

	Map<String, DataFormat> dataFormatMap  = new HashMap<String, DataFormat>();
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
				dataFormat = DataFactory.eINSTANCE.createDataFormat();
				dataFormat.setName(format);
			}
			dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
		}
	}
	
	void addToToolData(Parameter param, Data data, Tool tool)
	{
		EList<Data> dataList = tool.getData().get(param.getName());
		if (dataList == null)
		{
			dataList = new BasicEList<Data>();
			tool.getData().put(param.getName(), dataList);
			
		}
		tool.getData().get(param.getName()).add(data);
	}

//*/	
	private Parameter createParameter(Attributes atts)
	{
		Parameter param;
		if (atts.getValue("type").equals("data"))
		{
			param = ToolFactory.eINSTANCE.createInOutParameter();
		}
		else if (atts.getValue("dataport") != null || atts.getValue("format") != null)
		{
			param = ToolFactory.eINSTANCE.createInOutParameter();
		}
		else
		{
			param = ToolFactory.eINSTANCE.createParameter();
		}
		return param;
	}
	
	private void initParam(Parameter curParam)
	{
		curParam.setPrefix        (null);
		curParam.setDelimiter     (null);
		curParam.setValueDelimiter(null);
	}

	
	private InOutParameter setInOutParam(Attributes atts, Parameter curParam)
	{
		InOutParameter curInOutParam = (InOutParameter)curParam;
		boolean isOutput = false;
		
		if (atts.getValue("output") != null)
		{
			if (atts.getValue("output").equalsIgnoreCase("true"))
				isOutput = true;
		}
		else if ("output".equalsIgnoreCase(curParam.getName()))
		{
			isOutput = true;
		}
		curInOutParam.setOutput(isOutput);
		
		if (atts.getValue("format") != null)
			for (String format:atts.getValue("format").split(","))
				curInOutParam.getFormats().add(format);
		if (atts.getValue("dataport") != null)
			curInOutParam.setDataPort(atts.getValue("dataport"));
		
		return curInOutParam;
	}
	
	private void setParamDefaults(Parameter curParam)
	{
		curParam.setOptional(null);
		curParam.setPositional(null);
		curParam.setMultiple(null);
		curParam.setMultipleInstancesPerDataport(null);
		curParam.setMultipleInstances(null);
		curParam.setMultipleValue(null);
	}
	
	private boolean setParam(Attributes atts, Parameter curParam)
	{
		initParam(curParam);
		isAbstractParam = isAbstract(atts);
		
		if (isAbstractParam)
		{	
			curParam.setAbstract(true);
		}
		else
			curParam.setAbstract(false);

		if (isAbstractParam || withinPackage)
			if (atts.getValue("overrideAttributes") != null)
				for (String attrib:atts.getValue("overrideAttributes").split(","))
					curParam.getOverrideAttributes().add(attrib);

		
		if (atts.getValue("name") != null)
			curParam.setName(atts.getValue("name"));
		
		else if (!isAbstractParam && !isAnalysisType(atts))
		{
			logger.error("cannot process parameter with undefined name for "
					+(withinPackage ? "pkg="+pkg.getName() : "tool="+tool.getName()));
			return false;
		}
		
		if (atts.getValue("type") != null)
			curParam.setType(atts.getValue("type"));
		if (atts.getValue("cmd_part") != null)
			curParam.setCmdPart(atts.getValue("cmd_part"));

		//if (curParam.getName() == null && curParam.getType() != null)
			//curParam.setName(curParam.getType());
		
		if (atts.getValue("optional") != null)
			curParam.setOptional(atts.getValue("optional").equals("true") ? true : false);
		else
			curParam.setOptional(null);
		
		if (atts.getValue("positional") != null)
			curParam.setPositional(atts.getValue("positional").equals("true") ? true : false);
		else
			curParam.setPositional(null);
		
		if (atts.getValue("multiple") != null)
			curParam.setMultiple(atts.getValue("multiple").equals("true") ? true : false);
		else
			curParam.setMultiple(null);
		
		if (atts.getValue("multiple_instances") != null)
			curParam.setMultipleInstances(atts.getValue("multiple_instances").equals("true") ? true : false);
		else
			curParam.setMultipleInstances(null);

		if (atts.getValue("multiple_instances_per_dataport") != null)
			curParam.setMultipleInstancesPerDataport(atts.getValue("multiple_instances_per_dataport").equals("true") ? true : false);
		else
			curParam.setMultipleInstancesPerDataport(null);

		if (atts.getValue("multiple_value") != null)
			curParam.setMultipleValue(atts.getValue("multiple_value").equals("true") ? true : false);
		else
			curParam.setMultipleValue(null);
		
		if (atts.getValue("default_value") != null)
			curParam.setDefaultValue(atts.getValue("default_value"));
		if (atts.getValue("value_type") != null)
			curParam.setValueType(atts.getValue("value_type"));

		// relevant for package
		if (atts.getValue("value") != null)
			curParam.getGeneralValue().add(atts.getValue("value"));

		if (atts.getValue("separator") != null)
			curParam.setDelimiter(atts.getValue("separator"));
		if (atts.getValue("prefix") != null)
			curParam.setPrefix(atts.getValue("prefix"));
		
		if (atts.getValue("key") != null)
		{
			Key newKey = ToolFactory.eINSTANCE.createKey();
			newKey.setName(atts.getValue("key"));
			if (atts.getValue("value") != null)
				newKey.setValue(atts.getValue("value"));
			else
				newKey.setValue(newKey.getName());
			curParam.getKeys().add(newKey);
		}
		if (atts.getValue("arg_value_separator") != null)
			curParam.setValueDelimiter(atts.getValue("arg_value_separator"));
		
		if (atts.getValue("fixed") != null)
			curParam.setFixedArgValue(atts.getValue("fixed").equals("true") ? true : false);
		else
			curParam.setFixedArgValue(null);
		
		if (atts.getValue("output_arg_value_for_boolean_param") != null)
			curParam.setOutputArgValueForBooleanParam(atts.getValue("output_arg_value_for_boolean_param").equals("true") ? true : false);
		else
			curParam.setOutputArgValueForBooleanParam(null);
		
		if (atts.getValue("output_default_param") != null)
			curParam.setOutputDefaultParam(atts.getValue("output_default_param").equals("true") ? true : false);
		else
			curParam.setOutputDefaultParam(null);
			
		if (atts.getValue("label") != null)
			curParam.setLabel(atts.getValue("label"));
		if (atts.getValue("help") != null)
			curParam.setHelp(atts.getValue("help"));
		if (atts.getValue("description") != null)
			curParam.setDescription(atts.getValue("description"));
		if (atts.getValue("minOcc") != null)
			curParam.setMinOcc(new Integer(atts.getValue("minOcc")));
		if (atts.getValue("maxOCc") != null)
			curParam.setMaxOcc(new Integer(atts.getValue("maxOcc")));
		if (atts.getValue("named") != null)
			curParam.setNamed(atts.getValue("named").equals("true") ? true : false);
		else if (!curParam.getKeys().isEmpty())
			curParam.setNamed(true);
		else
			curParam.setNamed(null);
		
		if (atts.getValue("hidden") != null)
			curParam.setHidden(atts.getValue("hidden").equals("true"));
		else
			curParam.setHidden(false);
		
		if (atts.getValue("tool_ref") != null)
			for (String toolRef:atts.getValue("tool_ref").split(","))
				curParam.getToolRefs().add(toolRef);

		if (atts.getValue("advanced") != null)
			curParam.setAdvanced(atts.getValue("advanced").equals("true") ? true : false);
		
		if (atts.getValue("handle") != null)
			for (String handle:atts.getValue("handle").split(","))
				(curParam).getHandles().add(handle);
		else
			curParam.getHandles().add(GlobalConstants.NAME_FILE_HANDLE);
		
		if (atts.getValue("grouping") != null)
			for (String group:atts.getValue("grouping").split(","))
				curParam.getGrouping().add(group);
		
		if (atts.getValue("data") != null)
			dataStrings.put(curParam.getName(), atts.getValue("data"));
		
		if (withinInterpreter)
		{
			curParam.setCmdPart(GlobalConstants.COMMAND_PART_VALUE_INTERPRETER_PARAM);
		}

		if ("data".equals(atts.getValue("type")))
		{
			//boolean isOutput   = false;

			curParam.setDataParam(true);
			if (!withinPackage)
				logger.debug("param id="+curParam.hashCode()+" "+curParam.getName()+" ("+tool.getName()+")");
			
			InOutParameter curInOutParam = setInOutParam(atts, curParam);
						
			if (atts.getValue("extension") != null)
			{
				if (atts.getValue("extension").equals("true"))
					curInOutParam.setExtension(true);
				else
					curInOutParam.setExtension(false);
			}
			if (atts.getValue("filename_creation") != null)
			{
				curInOutParam.setFilenameCreation(atts.getValue("filename_creation"));
			}
			
			if (atts.getValue("convert_grouping") != null)
				curInOutParam.setConvertGrouping("any");
			else
				curInOutParam.setConvertGrouping(null);

				
			if (!isAbstractParam)
			{
				/*
				Data data = DataFactory.eINSTANCE.createData();
				data.setOutput(curInOutParam.isOutput());
				data.setName(curParam.getName());
				data.setParameter(curParam);
				
				if (!withinPackage)
				{
					if (tool.getData().containsKey(data.getName()))
						logger.warn("overiding data="+data.getName()+" of tool="+tool.getId());
					else
						logger.debug("adding data="+data.getName()+ " for tool="+tool.getId());
				}
				
				if (withinTool)
					addToToolData(getParamParent(curParam), data, tool);
	
				dataPort = DataFactory.eINSTANCE.createDataPort();
				dataPort.setName(curParam.getName());
				if (withinTool)
					dataPort.getTools().put(tool.getName(), tool);
				data.setPort(dataPort);
				setDataPort(((InOutParameter) curParam).getFormats());
				*/
				if (withinTool)
					tool.createData(curInOutParam, null, null);

			}
		}
		else if (atts.getValue("format") != null || atts.getValue("dataport") != null)
		{
			setInOutParam(atts, curParam);
			logger.debug("data specifying param found.");
		}
		
		return true;
	}

	private void initTool(Tool curTool)
	{
		
	}
	
	private void setTool(Attributes atts)
	{
		tool = ToolFactory.eINSTANCE.createTool();
		initTool(tool);
		tools.add(tool);
		Command command = ToolFactory.eINSTANCE.createCommand();
		tool.setCommand(command);
		
		tool.setName(atts.getValue("name"));
		if (atts.getValue("id") == null)
			tool.setId(tool.getName());
		else
			tool.setId(atts.getValue("id"));
		if (tool.getName() == null)
			tool.setName(tool.getId());
		
		logger.debug("processing tool="+tool.getId());
		tool.setVersion(atts.getValue("version"));
		if (atts.getValue("package") != null && packages.containsKey(atts.getValue("package")))
			tool.setPackage(packages.get(atts.getValue("package")));
		if (atts.getValue("analysis_type") != null)
			tool.setAnalysisType(atts.getValue("analysis_type"));
	}
	
	Parameter getParamParent(Parameter curParam)
	{
		if (curParam.getParent()==null)
			return curParam;
		
		return curParam.getParent();
	}	
	
	boolean isAbstract(Attributes atts)
	{
		return atts.getValue("abstract") != null && atts.getValue("abstract").equals("true");
	}
	
	boolean isAnalysisType(Attributes atts)
	{
		return atts.getValue("type") != null && atts.getValue("type").equals("analysis_type");
	}
	
	void addParam(boolean isAbstract)
	{
		if (withinPackage)
		{
			if (isAbstract)
				pkg.getTemplateParams().add(resolvedParam.getParameter());
			else
				pkg.getResolvedParams().add(resolvedParam);

		}
		else if (withinTool)
		{
			if (isAbstract)
			{
				tool.getCommand().getTemplateParams().add(resolvedParam.getParameter());
			}
			else
			{
				tool.getCommand().getResolvedParams().put(resolvedParam.resolveName(), resolvedParam);
			}
		}
	}
	
	ResolvedParam createResolvedParam(Parameter param)
	{
		ResolvedParam resolvedParam = ToolFactory.eINSTANCE.createResolvedParam();
		resolvedParam.setParameter(param);
		
		return resolvedParam;
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		
		curTag  = Tag.valueOf(localName.toUpperCase());
		tagStack.push(curTag);
		//logger.trace("curTag="+curTag+" lastTag="+lastTag+" parentTag="+parentTag+" stack="+tagStack.toString());

		if (shallProcess(null))
		{
		
		switch (curTag) {
			case TOOLS:
				break;				
			case PACKAGE:
				pkg = ToolFactory.eINSTANCE.createPackage();
				pkg.setDescription(atts.getValue("description"));
				if (atts.getValue("name")!=null)
					pkg.setName(atts.getValue("name"));
				if (atts.getValue("id") == null)
					pkg.setId(pkg.getName());
				else
					pkg.setId(atts.getValue("id"));
				if (pkg.getName() == null && pkg.getId() != null)
					pkg.setName(pkg.getId());
				pkg.setVersion(atts.getValue("version"));
				packages.put(pkg.getId(), pkg);
				logger.debug(pkg.getId());
				withinPackage = true;
				break;
			case TOOL:
				withinTool = true;
				dataStrings.clear();
				setTool(atts);
				break;
			case METADATA_MAP:
				withinMetadataMap = true;
			case MAP_ENTRY:
				if (withinParam && withinPackage && withinOption)
					if (atts.getValue("key") != null && atts.getValue("value") != null)
					{
						if (!masterMap.containsKey(pkg.getId()))
							masterMap.put(pkg.getId(), createNewMap3());
						if (!masterMap.get(pkg.getId()).containsKey(optionValue.getName()))
							masterMap.get(pkg.getId()).put(optionValue.getName(), createNewMap2());
						if (!masterMap.get(pkg.getId()).get(optionValue.getName()).containsKey("metadata"))
							masterMap.get(pkg.getId()).get(optionValue.getName()).put("metadata", createNewMap1());
						masterMap.get(pkg.getId()).get(optionValue.getName()).get("metadata").put(atts.getValue("key"), atts.getValue("value"));
					}
					
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
				if (withinPackage)
				{
					if (atts.getValue("pattern") != null)
						pkg.setCommandPattern(atts.getValue("pattern"));
					if (atts.getValue("assume_data_param_positional") != null
							&& atts.getValue("assume_data_param_positional").equals("true"))
						pkg.setAssumeDataParamPositional(true);
					if (atts.getValue("assume_param_positional") != null
							&& atts.getValue("assume_param_positional").equals("true"))
						pkg.setAssumeParamPositional(true);						
				}
				else
				{
					if (atts.getValue("exe") != null || atts.getValue("name") != null)
					{
						ResolvedParam resolvedParam = ToolFactory.eINSTANCE.createResolvedParam();
						if (atts.getValue("exe") != null)
						{
							resolvedParam.setName(atts.getValue("exe"));
						}
						else if (atts.getValue("name") != null)
						{
							resolvedParam.setName(atts.getValue("name"));
						}
						else
						{
							//resolvedParam.setName(tool.getId());
							logger.warn("set to default.");
							resolvedParam.setName("dummy_name");
						}
						
						Parameter param = ToolFactory.eINSTANCE.createParameter();
						param.setName(resolvedParam.getName());
						param.setCmdPart(GlobalConstants.COMMAND_PART_VALUE_EXE);
						resolvedParam.setParameter(param);
						tool.getResolvedParams().put(resolvedParam.getName(), resolvedParam);
						logger.debug("add tool param: "+resolvedParam.getName());
					}
					if (atts.getValue("pattern") != null)
						tool.getCommand().setCommandPattern(atts.getValue("pattern"));
					if (atts.getValue("assume_data_param_positional") != null
							&& atts.getValue("assume_data_param_positional").equals("true"))
						tool.getCommand().setAssumeDataParamPositional(true);
					if (atts.getValue("assume_param_positional") != null
							&& atts.getValue("assume_param_positional").equals("true"))
						tool.getCommand().setAssumeParamPositional(true);
				}
				break;
			case REQUIREMENTS:
				break;
			case EXE:
				if (withinPackage)
				{
					ResolvedParam resolvedParam = ToolFactory.eINSTANCE.createResolvedParam();
					resolvedParam.setName(atts.getValue("name"));
					Parameter param = ToolFactory.eINSTANCE.createParameter();
					param.setName(resolvedParam.getName());
					param.setCmdPart(GlobalConstants.COMMAND_PART_VALUE_EXE);
					resolvedParam.setParameter(param);
					pkg.getResolvedParams().add(resolvedParam);
				}
				break;
			case INTERPRETER:
				withinInterpreter = true;
				if (withinPackage)
				{
					ResolvedParam resolvedParam = ToolFactory.eINSTANCE.createResolvedParam();
					resolvedParam.setName(atts.getValue("exe"));
					Parameter param = ToolFactory.eINSTANCE.createParameter();
					param.setName(resolvedParam.getName());
					param.setCmdPart(GlobalConstants.COMMAND_PART_VALUE_INTERPRETER);
					resolvedParam.setParameter(param);
					pkg.getResolvedParams().add(resolvedParam);
				}
				else if (withinTool)
				{
					logger.warn("no handling defined for this tag within tool.");
				}
				else
				{
					// interpreter definition is treated as tool definitions
					setTool(atts);	
				}
				break;
			case PARAM:
				Parameter p_tmp = createParameter(atts);
				ResolvedParam p = createResolvedParam(p_tmp);
				
				if (resolvedParam != null && condition != null && (withinParam || withinConditional))
					p_tmp.setParent(resolvedParam.getParameter());
				
				if (!setParam(atts, p_tmp))
					break;
				
				if (withinConditional && conditionType != null && !isAbstractParam)
					if (lastTag.equals(Tag.CONDITIONAL))
						p_tmp.setConditionType(conditionType);

				if (withinConditional && condition != null && !isAbstractParam)
				{
					if (lastTag.equals(Tag.CONDITIONAL))
					{
						paramStack.add(p);
					}
					if (resolvedParam == null)
					{
						resolvedParam = p;
					}
					else
					{
						subResolvedParam = p;
						subResolvedParam.getParameter().setParent(resolvedParam.getParameter());
						if (grouping != null && !p_tmp.getGrouping().contains(grouping))
							p_tmp.getGrouping().add(grouping);
						
						if (resolvedParam.getChildParams().containsKey(condition))
							resolvedParam.getChildParams().get(condition).add(subResolvedParam);
						else
						{
							EList<ResolvedParam> pl = new BasicEList<ResolvedParam>();
							pl.add(subResolvedParam);
							// assume first parameter as relevant param when resolving the condition
							subResolvedParam.setConditionResolving(true);
							resolvedParam.getChildParams().put(condition, pl);
							if (conditionExp != null && !resolvedParam.getConditions().containsKey(condition))
							{
								Condition cond = ToolFactory.eINSTANCE.createCondition();
								cond.setName(condition);
								cond.setExpression(conditionExp);
								resolvedParam.getConditions().put(condition, cond);
							}
						}
					}
				}
				else
				{
					resolvedParam=p;
				}
				
				if (subResolvedParam != p)
				{
					addParam(isAbstractParam);
				}
				withinParam = true;
				break;
			case KEY:
				key = ToolFactory.eINSTANCE.createKey();
				key.setName(atts.getValue("name"));
				if (atts.getValue("value") != null)
					key.setValue(atts.getValue("value"));
				else
					key.setValue(key.getName());
				if (atts.getValue("type") != null)
					key.setType(atts.getValue("type"));
				if (atts.getValue("prefix") != null)
					key.setPrefix(atts.getValue("prefix"));
				if (atts.getValue("separator") != null)
					key.setDelimiter(atts.getValue("separator"));
				resolvedParam.getParameter().getKeys().add(key);
				break;
			case OPTION:
				withinOption  = true;
				optionValue   = ToolFactory.eINSTANCE.createOptionValue();
				if (atts.getValue("name")!=null)
					optionValue.setName(atts.getValue("name"));
				else if (atts.getValue("value")!=null)
				{
					optionValue.setName(atts.getValue("value"));
				}
				if (atts.getValue("help")!=null)
					optionValue.setHelp(atts.getValue("help"));
				if (atts.getValue("condition")!=null)
					optionValue.setCondition(atts.getValue("condition"));
				
				if (withinData)
				{
					if (conditionalMap.containsKey("name"))
					{
						throw new UnsupportedOperationException();
					}
				}
				else if (withinParam)
				{
					resolvedParam.getParameter().getOptionValues().add(optionValue);
					if (atts.getValue("exe")!=null)
						optionValue.setExe(atts.getValue("exe"));
				}
				break;
			case ACTIONS:
				break;
			case CONDITIONAL:
				//conditionalMap.put("name", atts.getValue("name"));
				conditionName = atts.getValue("name");
				withinConditional = true;
				if (atts.getValue("type") != null)
					conditionType = atts.getValue("type");
				if (atts.getValue("grouping") != null)
					grouping = atts.getValue("grouping");
				break;
			case WHEN:
				//lastMainAttributeValue = atts.getValue("value");
				conditionalMap.put("when_value", atts.getValue("value"));
				condition = atts.getValue("value");
				if (atts.getValue("condition") != null)
					conditionExp = atts.getValue("condition");
				if (lastTag.equals(Tag.CONDITIONAL) && withinConditional)
				{
					resolvedParam = ToolFactory.eINSTANCE.createResolvedParam();
					resolvedParam.setName(conditionName);
					
					Parameter parameter = ToolFactory.eINSTANCE.createParameter();
					initParam(parameter);
					parameter.setName(resolvedParam.getName());
					parameter.setType("select");
					if (conditionType != null)
						parameter.setConditionType(conditionType);
					if (grouping != null)
						parameter.getGrouping().add(grouping);
					resolvedParam.setParameter(parameter);
					addParam(false);
				}
				break;
			case ACTION:
				conditionalMap.put("action_type", atts.getValue("type"));
				if (atts.getValue("type").equals("format"))
				{
					String format = conditionalMap.get("when_value");
					//setDataPort(format);
					dataPort.setFormat(format);
				}
				break;
			case DATA:
				withinData = true;
				data = DataFactory.eINSTANCE.createData();
				DataFormat dataFormat = null;
				if (atts.getValue("description") !=null)
					data.setDescription(atts.getValue("description"));
				if (atts.getValue("name") !=null)
					data.setName(atts.getValue("name"));
				if (atts.getValue("label") !=null)
					data.setLabel(atts.getValue("label"));
				if (atts.getValue("format") != null)
				{
					dataFormat = DataFactory.eINSTANCE.createDataFormat();
					dataFormat.setName(atts.getValue("format"));
				}
				data.setOutput(atts.getValue("output")==null?
						false:atts.getValue("output").equals("true"));
				EList<Data> dataList = null;
				if (tool.getData().containsKey(data.getName()))
				{
					logger.warn("data with name="+data.getName()+" of tool="+tool.getId()+" already known");
					dataList = tool.getData().get(data.getName());
					boolean merged = false;
					// do a basic check, to avoid overriding known data
					for (Data d:dataList)
					{
						if (d.getName().equals(data.getName()))
						{
							//data.merge(d);
							merged=true;
						}
					}
					if (!merged)
						dataList.add(data);	
				}
				else
				{
					dataList = new BasicEList<Data>();
					tool.getData().put(data.getName(), dataList);
					dataList.add(data);
				}
				
				
				dataPort = DataFactory.eINSTANCE.createDataPort();
				dataPort.setName(data.getName());
				if (dataFormat!=null)
					dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
				data.setPort(dataPort);
				//if (tool.getCommand().getParameters().containsKey(data.getName()))
					//data.setParameter(tool.getCommand().getParameters().get(data.getName()));
				
				break;
			default: 
				break;
		}
		
			if (tagStack.size()>=2)
				parentTag = tagStack.get(tagStack.size()-2);
			logger.trace(" parent="+parentTag+" cur="+curTag+" "+tagStack);
		}
		lastTag = curTag;
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		
		tagStack.pop();		


		logger.trace("endElement(): curTag="+curTag+" parentTag="+parentTag);
		//if (curTag!=null)
		switch (curTag) {
			case ACTIONS:
				conditionalMap.clear();
				break;
			case WHEN:
				condition=null;
				break;
			case CONDITIONAL:
				
				if (!paramStack.isEmpty())
					paramStack.pop();
				if (!paramStack.isEmpty())
					 resolvedParam = paramStack.peek();
					
				if (!tagStack.contains(Tag.CONDITIONAL))
				{
					withinConditional = false;
					resolvedParam = null;
				}
				conditionType = null;
				conditionName = null;
				conditionExp  = null; 
				grouping      = null;
				break;
			case METADATA_MAP:
				withinMetadataMap = false;
				break;
			case DATA:
				withinData = false;
				logger.debug(data);
				if (data != null && (data.getPort().getDataFormats() == null || data.getPort().getDataFormats().isEmpty()))
				{
					String format = data.getFormat().getName();
					//setDataPort(format);
					dataPort.setFormat(format);
				}
				data = null;
				break;
			case PARAM:
				if (resolvedParam != null)
					logger.debug(resolvedParam.renderToString());
				else
					logger.debug("resolvedparam is null");
				if (!withinConditional)
					resolvedParam = null;
				withinParam = false;
				break;
			case OPTION:
				withinOption  = false;
				break;
			case PACKAGE:
				withinPackage = false;
				break;
			case INTERPRETER:
				withinInterpreter = false;
				break;
			case TOOL:
				// test all elements in dataStrings
				// add data with name dataString from tools data to parameter data 
				logger.debug("process data for tool="+tool.getName()+" "+tool.getId());
				for (Entry<String, String> e:dataStrings.entrySet())
				{
					logger.debug("key="+e.getKey()+" value="+e.getValue()
							+" "+tool.getCommand().getResolvedParams().containsKey(e.getKey()));
					if (tool.getCommand().getResolvedParams().containsKey(e.getKey()))
					{
						ResolvedParam p=tool.getCommand().getResolvedParams().get(e.getKey());
						
						for (String dataString:StringUtils.split(e.getValue()))
						{
							if (tool.getData().containsKey(dataString))
							{
								for (Data d:tool.getData().get(dataString))
								{
								//Data d=tool.getData().get(dataString);
									logger.debug("add data="+d.getName()+" to param="+p.getName());
									//p.getParameter().getData().add(d);
								}
							}
							else
							{
								logger.warn("couldnt find data: "+dataString+" which is referenced by parameter "+e.getKey()+" for tool="+tool.getName()+"/"+tool.getId() );
							}
						}
					}
					else
					{
						logger.warn("couldnt find parameter "+e.getKey());
					}
				}
				
				if (tool.getPackage() != null && masterMap.containsKey(tool.getPackage().getId()))
					if (masterMap.get(tool.getPackage().getId()).containsKey(tool.getId()))
						if (masterMap.get(tool.getPackage().getId()).get(tool.getId()).containsKey("metadata"))
							for (Entry<String, String> e:masterMap.get(tool.getPackage().getId()).get(tool.getId()).get("metadata").entrySet())
							{
								if (tool.getCommand().getResolvedParams().containsKey(e.getValue()))
									if (!tool.getCommand().getResolvedParams().get(e.getValue()).getParameter().getGrouping().contains(e.getKey()))
									{
										logger.debug("set metadata info "+e.getValue()+" for parameter="+e.getKey()+" of tool="+tool.getId()+" (pkg="+tool.getPackage().getId()+")");
										tool.getCommand().getResolvedParams().get(e.getValue()).getParameter().getGrouping().add(e.getKey());
									}
							}
				logger.debug("");
				withinTool = false;
			default:
				break;
		}

		if (tagStack.isEmpty())
			parentTag = null;
		else
			parentTag = tagStack.peek(); 

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
						subResolvedParam.getParameter().setName(curValue);
						break;
					case REQUIREMENT:
						requirement.setValue(curValue);
						if (no_requirement==0)
							if (packages.containsKey(requirement.getValue()))
								tool.setPackage(packages.get(requirement.getValue()));
						no_requirement++;
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
        PACKAGE, METADATA_MAP, MAP_ENTRY,
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
