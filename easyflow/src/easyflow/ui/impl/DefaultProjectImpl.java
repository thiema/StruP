/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui.impl;

import easyflow.EasyflowFactory;
import easyflow.EasyflowPackage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import javax.xml.validation.Schema;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import easyflow.core.Catalog;
import easyflow.core.CoreFactory;
import easyflow.core.Task;
import easyflow.core.EasyflowTemplate;
import easyflow.core.Workflow;
import easyflow.graph.jgraphx.Util;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.IMetaData;
import easyflow.metadata.MetadataFactory;
import easyflow.tool.DocumentProperties;
import easyflow.tool.Tool;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolFactory;
import easyflow.tool.ToolSchemata;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.EasyFlowOverallWorker;
import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionFactory;
import easyflow.execution.IExecutionSystem;
import easyflow.execution.makeflow.MakeflowFactory;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.tool.saxparser.ToolContentHandler;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.URIUtil;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataPort;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiPackage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToPackageMapImpl;
import easyflow.util.maps.impl.StringToToolMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getConfigSource <em>Config Source</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getGraphUtil <em>Graph Util</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getJsonObject <em>Json Object</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getDefaultConfigSourceString <em>Default Config Source String</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultProjectImpl extends EObjectImpl implements DefaultProject {
	/**
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflows;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<IMetaData> metaData;

	/**
	 * The default value of the '{@link #getConfigSource() <em>Config Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigSource()
	 * @generated
	 * @ordered
	 */
	protected static final URI CONFIG_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigSource() <em>Config Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigSource()
	 * @generated
	 * @ordered
	 */
	protected URI configSource = CONFIG_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected URI baseURI = BASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	//protected static final Logger LOGGER_EDEFAULT = (Logger)EasyflowFactory.eINSTANCE.createFromString(EasyflowPackage.eINSTANCE.getLogger(), "");
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(DefaultProject.class);

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGraphUtil() <em>Graph Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphUtil()
	 * @generated
	 * @ordered
	 */
	protected Util graphUtil;

	/**
	 * The default value of the '{@link #isFromJar() <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromJar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_JAR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFromJar() <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromJar()
	 * @generated
	 * @ordered
	 */
	protected boolean fromJar = FROM_JAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonObject() <em>Json Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonObject()
	 * @generated
	 * @ordered
	 */
	protected static final JSONObject JSON_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonObject() <em>Json Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonObject()
	 * @generated
	 * @ordered
	 */
	protected JSONObject jsonObject = JSON_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Tool> tools;

	/**
	 * The default value of the '{@link #getDefaultConfigSourceString() <em>Default Config Source String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfigSourceString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT = "main.json";

	/**
	 * The cached value of the '{@link #getDefaultConfigSourceString() <em>Default Config Source String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfigSourceString()
	 * @generated
	 * @ordered
	 */
	protected String defaultConfigSourceString = DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToolDefinitions() <em>Tool Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ToolDefinitions toolDefinitions;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, easyflow.tool.Package> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.DEFAULT_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectResolvingEList<Workflow>(Workflow.class, this, UiPackage.DEFAULT_PROJECT__WORKFLOWS);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IMetaData> getMetaData() {
		if (metaData == null) {
			metaData = new EObjectResolvingEList<IMetaData>(IMetaData.class, this, UiPackage.DEFAULT_PROJECT__META_DATA);
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getConfigSource() {
		return configSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigSource(URI newConfigSource) {
		URI oldConfigSource = configSource;
		configSource = newConfigSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__CONFIG_SOURCE, oldConfigSource, configSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getBaseURI() {
		return baseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURI(URI newBaseURI) {
		URI oldBaseURI = baseURI;
		baseURI = newBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__BASE_URI, oldBaseURI, baseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getGraphUtil() {
		if (graphUtil != null && graphUtil.eIsProxy()) {
			InternalEObject oldGraphUtil = (InternalEObject)graphUtil;
			graphUtil = (Util)eResolveProxy(oldGraphUtil);
			if (graphUtil != oldGraphUtil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.DEFAULT_PROJECT__GRAPH_UTIL, oldGraphUtil, graphUtil));
			}
		}
		return graphUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetGraphUtil() {
		return graphUtil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphUtil(Util newGraphUtil) {
		Util oldGraphUtil = graphUtil;
		graphUtil = newGraphUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__GRAPH_UTIL, oldGraphUtil, graphUtil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromJar() {
		return fromJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromJar(boolean newFromJar) {
		boolean oldFromJar = fromJar;
		fromJar = newFromJar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__FROM_JAR, oldFromJar, fromJar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinitions getToolDefinitions() {
		if (toolDefinitions != null && toolDefinitions.eIsProxy()) {
			InternalEObject oldToolDefinitions = (InternalEObject)toolDefinitions;
			toolDefinitions = (ToolDefinitions)eResolveProxy(oldToolDefinitions);
			if (toolDefinitions != oldToolDefinitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS, oldToolDefinitions, toolDefinitions));
			}
		}
		return toolDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinitions basicGetToolDefinitions() {
		return toolDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolDefinitions(ToolDefinitions newToolDefinitions) {
		ToolDefinitions oldToolDefinitions = toolDefinitions;
		toolDefinitions = newToolDefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS, oldToolDefinitions, toolDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, easyflow.tool.Package> getPackages() {
		if (packages == null) {
			packages = new EcoreEMap<String,easyflow.tool.Package>(MapsPackage.Literals.STRING_TO_PACKAGE_MAP, StringToPackageMapImpl.class, this, UiPackage.DEFAULT_PROJECT__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExecutionSystem getExecutionSystem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject getJsonObject() {
		return jsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonObject(JSONObject newJsonObject) {
		JSONObject oldJsonObject = jsonObject;
		jsonObject = newJsonObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__JSON_OBJECT, oldJsonObject, jsonObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(MapsPackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, UiPackage.DEFAULT_PROJECT__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultConfigSourceString() {
		return defaultConfigSourceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validate() {
		boolean rc = true;
		if (getConfigSource() == null)
			rc = false;
		logger.debug("config="+getConfigSource()+" base="+getBaseURI());
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readProjectJson(URI source) {
		
		//JSONObject jsonObject=null;
		if (source == null)
			source = getConfigSource();
		try {
			logger.debug(source);
			String schema = source.getScheme();
			InputStream is = null;
			if (isFromJar())
				is = URIUtil.getInputStream(source, true);
				//is = getClass().getResourceAsStream(source.toString());
			else if (schema == null)
				is = URIUtil.getInputStream(source, false);
			else if (schema.equals("http") || schema.equals("https"))
				is = source.toURL().openStream();
			if (is != null)
				setJsonObject(JSONObject.fromObject(IOUtils.toString(is)));
			else
				logger.warn("no Input stream found.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	private DataPort readInput(String dataPortName, String dataFormatName, short bitPos) 
	{
		DataFormat dataFormat = DataFactory.eINSTANCE.createDataFormat();
		dataFormat.setName(dataFormatName);
		DataPort dataPort = DataFactory.eINSTANCE.createDataPort();
		dataPort.setBitPos(bitPos);
		dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
		dataPort.setName(dataPortName);
		return dataPort;
	}
	
	
	private boolean readInputsMap(JSONObject workflowCfg, Task rootTask, String key, boolean isStatic, EMap<String, String> processedFormats)
	{
		short bitPos = (short) rootTask.getOutDataPorts().size();
		
    	if (workflowCfg.has(key))
    	{
    		JSONObject inputs = workflowCfg.getJSONObject(key);
    		Iterator<String> it = inputs.keys(); 
	    	while (it.hasNext())
	    	{
	    		String name=it.next();
	    		String format=inputs.getString(name);
	    		processedFormats.put(name, format);
	    		DataPort dataPort = readInput(name, format, bitPos++);
	    		dataPort.setStatic(isStatic);
	    		rootTask.getOutDataPorts().add(dataPort);
	    	}
	    	return true;
    	}
    	
		return false;
	}
	
	private boolean readInputs(JSONObject workflowCfg, Task rootTask)
	{
    	short bitPos=0;
    	
    	EMap<String, String> processedFormats = new BasicEMap<String, String>();
    	readInputsMap(workflowCfg, rootTask, "inputs_map", false, processedFormats);
    	readInputsMap(workflowCfg, rootTask, "static_inputs_map", true, processedFormats);
    	
    	for (int i=0; i<workflowCfg.getJSONArray("inputs").size();i++)
    	{
    		String name=workflowCfg.getJSONArray("inputs").getString(i);
    		if (!processedFormats.containsValue(name))
    			rootTask.getOutDataPorts().add(readInput(name, name, bitPos++));
    	}
    	
    	for (int i=0; i<workflowCfg.getJSONArray("static_inputs").size();i++)
    	{
    		String name = workflowCfg.getJSONArray("inputs").getString(i);
    		if (!processedFormats.containsValue(name))
    		{
    			DataPort dataPort = readInput(name, name, bitPos++);
    			dataPort.setStatic(true);
    			rootTask.getOutDataPorts().add(dataPort);
    		}
    	}
    	return true;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readConfiguration() {
		boolean rc = true;
		// general (project) config
		logger.debug(jsonObject);
		logger.debug(jsonObject.entrySet());
		JSONObject projectCfg=jsonObject.getJSONObject("project");
		GlobalConfig.setJsonCfg(jsonObject);
		
		logger.debug(projectCfg.get("workflowTemplateFile")+" "+getConfigSource()+" "+getBaseURI());
		
		Workflow workflow=CoreFactory.eINSTANCE.createWorkflow();
		workflow.getProcessedStates().put(GlobalConstants.ABSTRACT_NODES, false);
		workflow.getProcessedStates().put(GlobalConstants.ABSTRACT_WORKFLOW, false);
		workflow.getProcessedStates().put(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED, false);
		workflow.getProcessedStates().put(GlobalConstants.GROUPING_APPLIED, false);
		workflow.getProcessedStates().put(GlobalConstants.PARAMETER_APPLIED, false);
		workflow.getProcessedStates().put(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED, false);
		
		EasyflowTemplate workflowTemplate=CoreFactory.eINSTANCE.createEasyflowTemplate();
		
		InputStreamReader isReader;
		try {
			isReader = URIUtil.getInputStreamReader(URIUtil.addToURI(
					getBaseURI(), projectCfg.getString("workflowTemplateFile"))
					, isFromJar());
			workflowTemplate.setReader(new BufferedReader(isReader));
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			rc = false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rc = false;
		}
		
		workflow.setWorkflowTemplate(workflowTemplate);
		logger.debug(workflow.getWorkflowTemplate()+" "+workflow.getLastTasks().size());

		DefaultMetaData metaData=MetadataFactory.eINSTANCE.createDefaultMetaData();		
		//metaData.setFileName(URIUtil.createPath(getBasePath(), projectCfg.getString("metadataFile")));
		try {
			isReader = URIUtil.getInputStreamReader(
					URIUtil.addToURI(getBaseURI(), projectCfg.getString("metadataFile"))
					, isFromJar());
			metaData.setReader(new BufferedReader(isReader));
			metaData.initMetaData();
			
			isReader = URIUtil.getInputStreamReader(
					URIUtil.addToURI(getBaseURI(), projectCfg.getString("metadataFile"))
					, isFromJar());
			metaData.setReader(new BufferedReader(isReader));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		workflow.setMetaData(metaData);

		
		// ####### READ PROECESSING CONFIGURATION ########
		if (jsonObject.has("processing"))
		{
			JSONObject processingCfg=jsonObject.getJSONObject("processing");
			Iterator<String> it = processingCfg.keys();
			while (it.hasNext())
			{
				String key = it.next();
				logger.trace("read processing config key="+key);
				GlobalConfig.getProcessingConfig().put(key, processingCfg.getString(key));
			}
		}
		workflow.setExecutionSystem(GlobalConfig.getExecutionSystem());
		
		// ####### READ CATALOG CONFIGURATION ########
		if (jsonObject.has("catalog"))
		{
			JSONObject catalogCfg=jsonObject.getJSONObject("catalog");
			
			Catalog catalog = CoreFactory.eINSTANCE.createCatalog();
			workflow.setCatalog(catalog);
			Iterator<String> it = catalogCfg.keys();
			while (it.hasNext())
			{
				String key = it.next();
				logger.trace("read catalog key="+key);
				catalog.getEntries().put(key, catalogCfg.getString(key));
			}

		}		
		
		
		// ####### READ WORKFLOW CONFIGURATION ########
		JSONObject workflowCfg = jsonObject.getJSONObject("workflow");
		workflow.setMode(workflowCfg.getString("defaultMode"));
    	// create the special root task/cell which is the root
    	// in all subsequent processed graphs, the root should link any
    	// task from the workflow template that has no incoming task
    	Task rootTask = CoreFactory.eINSTANCE.createTask();
    	rootTask.setName("_root_");
    	rootTask.setRoot(true);

    	readInputs(workflowCfg, rootTask);
    	
    	workflow.setRootTask(rootTask);

		for (int i=0; i<workflowCfg.getJSONArray("defaultGroupingCriteria").size();i++)
			workflow.getDefaultGroupingCriteria().add(workflowCfg.getJSONArray("defaultGroupingCriteria").getString(i));
		
		logger.debug(projectCfg.keySet()+" "+workflow.getGraphUtil());
		
		for (Object key:projectCfg.keySet()) {
			workflow.getGenericAttributes().put((String) key, projectCfg.get(key));	
		}

		
		// ####### READ TOOL CONFIGURATION ########
		// tool config (dir, tools, schemata)
		JSONObject toolCfg = jsonObject.getJSONObject("tool");
		if (toolCfg.has("command_pattern"))
			GlobalConfig.getToolConfig().put("command_pattern", 
					(String) toolCfg.get("command_pattern"));
		if (toolCfg.has("write_default_value_to_command_line"))
			GlobalConfig.getToolConfig().put("write_default_value_to_command_line", 
					(String) toolCfg.get("write_default_value_to_command_line"));
		else
			GlobalConfig.getToolConfig().put("write_default_value_to_command_line", "0");
		//if (toolCfg.has(""))
			//GlobalConfig.getToolConfig().put("", toolCfg.get(""));
		
		
		// ####### READ TOOL DEFINITIONS ########
		JSONArray schemata = toolCfg.getJSONArray("schemata");
		// String toolDefPath = basePath;
		URI toolDefPath = getBaseURI();
		if (toolCfg.has("dir"))
		{
			//toolDefPath = new File(basePath+"/"+toolCfg.getString("dir")).getPath();
			try {
				toolDefPath = URIUtil.addToURI(toolDefPath, toolCfg.getString("dir"));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		ToolSchemata    toolSchemata   = ToolFactory.eINSTANCE.createToolSchemata();
		ToolDefinitions toolDefintions = ToolFactory.eINSTANCE.createToolDefinitions();
		
		// read schemata one by one
		for (int i=0; i<schemata.size(); i++)
		{
			try {
				URI source = URIUtil.addToURI(toolDefPath, schemata.getString(i));
				logger.debug(source.toString());
				Schema schema = toolSchemata.readSchema(source, isFromJar());
				
				//if (schema != null)
					//toolSchemata.getSchemata().put(source.toString(), schema);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// read tool definitions
		toolDefintions.setToolSchemata(toolSchemata);
		JSONArray toolsArray = toolCfg.getJSONArray("tools");
		//EList<Tool> tools = new BasicEList<Tool>();
		for (int i=0; i<toolsArray.size(); i++)
			try {
				for (URI source:URIUtil.getSources(URIUtil.addToURI(toolDefPath, toolsArray.getString(i)), isFromJar())) {
					logger.debug(toolsArray.getString(i)+" "+source.toString());
					if (toolDefintions.validateToolDefinition(source, isFromJar()))
					{
						DocumentProperties documentProperties = ToolFactory.eINSTANCE.createDocumentProperties();
						documentProperties.setSourceURI(source);
						documentProperties.setFromJar(isFromJar());
						//ToolContentHandler toolContentHandler = new ToolContentHandler();
						for (Tool tool : ToolContentHandler.parse(source, documentProperties, null, null))
						{
							logger.debug("SAX parser returned tool: "+tool.getId()
									+" pkg="+(tool.getPackage()==null?null:tool.getPackage().getId())
									+" params="+tool.getCommand().getResolvedParams().keySet());
							getTools().put(tool.getId(), tool);
							
						}
					}
					else
					{
						logger.error("Could not parse tool definition.");
					}
				}
				
				/*
				for (int j=0; j<doc.getDocumentElement().getChildNodes().getLength(); j++) {
					Node node=doc.getDocumentElement().getChildNodes().item(j);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Tool tool=ToolFactory.eINSTANCE.createTool();
						tool.readImplementation((Element) node);
						//getActiveWorkflow().getTools().put(tool.getId(), tool);
						getTools().put(tool.getId(), tool);
					}
				}
				*/

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		workflow.getTools().addAll(tools);
		getWorkflows().add(workflow);

		/*JSONArray cms = jsonObject.getJSONArray("project");
		for (Object o : cms) {
		   JSONObject cm = (JSONObject) o;
		   logger.debug(cm.get(0));
		}*/
		
		// read examples
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setConfigAndBasePath(String path) {
		try {
			logger.debug("Set base path to "+path);
			String baseName = URIUtil.getDirname(path);
			if (baseName != null)
				setBaseURI(URIUtil.createURI(baseName, null));
			String fileName = URIUtil.getFilename(path);
			logger.debug("Filename="+fileName+" dir="+baseName);
			if (fileName == null)
				setConfigSource(URIUtil.addToURI(getBaseURI(), DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT));
			else
				setConfigSource(URIUtil.createURI(path, null));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 
	public boolean init(EasyFlowGraph graph) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean init(EasyFlowGraph graph) {

		
		clearWorkflows();
		readProjectJson(getConfigSource());
		
		boolean rc = readConfiguration();
		
		if (getGraphUtil() == null)
			setGraphUtil(JgraphxFactory.eINSTANCE.createUtil());
		if (graph != null) //&& getGraphUtil().getGraph() == null)
			getGraphUtil().setGraph(graph);
        GlobalVar.setGraphUtil(getGraphUtil());
		getActiveWorkflow().setGraphUtil(getGraphUtil());
		getActiveWorkflow().setGraph(getGraphUtil().getGraph());
		getActiveWorkflow().readWorkfowTemplate();
		
		getGraphUtil().setMetaData((DefaultMetaData) getActiveWorkflow().getMetaData());
		
		applyMetaData();
		
		return rc;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean delete() {

		boolean rc = true;
		
		Workflow w = getActiveWorkflow();
		if (w!=null)
		{
			if (!w.delete())
			{
				logger.warn("couldnt delete workflow.");
				rc = false;
			}
			if (!getWorkflows().remove(getActiveWorkflow()))
			{
				logger.warn("couldnt remove workflow from list of workflows.");
				rc = false;
			}
		}
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyMetaData() {
		getActiveWorkflow().readMetaData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateAbstractGraph() {
		return getActiveWorkflow().generateAbstractWorkflow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean applyGroupingCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException {
		return getActiveWorkflow().applyGroupingCriteria();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws TaskNotFoundException 
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public boolean applyParameterCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException {
		return getActiveWorkflow().applyParameterCriteria();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public boolean resolveTraversalCriteria() throws CellNotFoundException, TaskNotFoundException {
		return getActiveWorkflow().resolveTraversalEvents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public boolean resolveToolDependencies() throws NoValidInOutDataException {
		return getActiveWorkflow().resolveToolDependencies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveUtilityTasks() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException {
		return getActiveWorkflow().resolveIncompatibleGroupings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @generated not
	 */
	public boolean resolvePreprocessingTasks() throws DataLinkNotFoundException, TaskNotFoundException {
		return getActiveWorkflow().resolvePreprocessingTasks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean runEntireWorkflow() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException {
		return getActiveWorkflow().runEntireWorkflow()==0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void clearWorkflows() {
		if (getWorkflows().size()>0) getWorkflows().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Workflow getActiveWorkflow() {
		return getWorkflows().isEmpty() ? null : getWorkflows().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorklowForExecutionSystem() {
		return getActiveWorkflow().generateWorklowForExecutionSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setWorker(EasyFlowOverallWorker worker) {
		logger.debug(getActiveWorkflow()+" "+worker);
		getActiveWorkflow().setWorker(worker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int runNextWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException {
		return getActiveWorkflow().runNextWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int runPrevWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException {
		return getActiveWorkflow().runPrevWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean hasNextWorkflowStep() {
		return getActiveWorkflow().hasNextWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getWorkflowStepLabelFor(String step) {
		return getActiveWorkflow().getWorkflowStepLabelFor(step);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getWorkflowStepDescFor(String step) {
		return getActiveWorkflow().getWorkflowStepDescFor(step);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getTotalNumberOfWorkflowSteps() {
		return getActiveWorkflow().getTotalNumberOfWorkflowSteps();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getNumberOfCurrentWorkflowStep() {
		return getActiveWorkflow().getNumberOfCurrentWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getNextWorkflowStep() {
		return getActiveWorkflow().getNextWorkflowStep();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getCurWorkflowStep() {
		return getActiveWorkflow().getCurWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resetWorkflowStep() {
		return getActiveWorkflow().resetWorkflowStep();
	}


	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				return getWorkflows();
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				return getMetaData();
			case UiPackage.DEFAULT_PROJECT__CONFIG_SOURCE:
				return getConfigSource();
			case UiPackage.DEFAULT_PROJECT__BASE_URI:
				return getBaseURI();
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return getLogger();
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				if (resolve) return getGraphUtil();
				return basicGetGraphUtil();
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return isFromJar();
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				return getJsonObject();
			case UiPackage.DEFAULT_PROJECT__TOOLS:
				if (coreType) return getTools();
				else return getTools().map();
			case UiPackage.DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING:
				return getDefaultConfigSourceString();
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				if (resolve) return getToolDefinitions();
				return basicGetToolDefinitions();
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				if (coreType) return getPackages();
				else return getPackages().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				getWorkflows().clear();
				getWorkflows().addAll((Collection<? extends Workflow>)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				getMetaData().clear();
				getMetaData().addAll((Collection<? extends IMetaData>)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_SOURCE:
				setConfigSource((URI)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_URI:
				setBaseURI((URI)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				setGraphUtil((Util)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar((Boolean)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				setJsonObject((JSONObject)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOLS:
				((EStructuralFeature.Setting)getTools()).set(newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				setToolDefinitions((ToolDefinitions)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				((EStructuralFeature.Setting)getPackages()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				getWorkflows().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				getMetaData().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_SOURCE:
				setConfigSource(CONFIG_SOURCE_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_URI:
				setBaseURI(BASE_URI_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				setGraphUtil((Util)null);
				return;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar(FROM_JAR_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				setJsonObject(JSON_OBJECT_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOLS:
				getTools().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				setToolDefinitions((ToolDefinitions)null);
				return;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				getPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				return workflows != null && !workflows.isEmpty();
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				return metaData != null && !metaData.isEmpty();
			case UiPackage.DEFAULT_PROJECT__CONFIG_SOURCE:
				return CONFIG_SOURCE_EDEFAULT == null ? configSource != null : !CONFIG_SOURCE_EDEFAULT.equals(configSource);
			case UiPackage.DEFAULT_PROJECT__BASE_URI:
				return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				return graphUtil != null;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return fromJar != FROM_JAR_EDEFAULT;
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				return JSON_OBJECT_EDEFAULT == null ? jsonObject != null : !JSON_OBJECT_EDEFAULT.equals(jsonObject);
			case UiPackage.DEFAULT_PROJECT__TOOLS:
				return tools != null && !tools.isEmpty();
			case UiPackage.DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING:
				return DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT == null ? defaultConfigSourceString != null : !DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT.equals(defaultConfigSourceString);
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				return toolDefinitions != null;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (configSource: ");
		result.append(configSource);
		result.append(", baseURI: ");
		result.append(baseURI);
		result.append(", logger: ");
		result.append(logger);
		result.append(", fromJar: ");
		result.append(fromJar);
		result.append(", jsonObject: ");
		result.append(jsonObject);
		result.append(", DefaultConfigSourceString: ");
		result.append(defaultConfigSourceString);
		result.append(')');
		return result.toString();
	}

} //DefaultProjectImpl
