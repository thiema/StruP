/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui.impl;

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
import java.util.Map.Entry;
import javax.xml.validation.Schema;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.velocity.context.Context;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import easyflow.core.Catalog;
import easyflow.core.Category;
import easyflow.core.CoreFactory;
import easyflow.core.Severity;
import easyflow.core.Task;
import easyflow.core.EasyflowTemplate;
import easyflow.core.LogMessage;
import easyflow.core.Workflow;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.IMetaData;
import easyflow.metadata.MetadataFactory;
import easyflow.tool.DocumentProperties;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
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
import easyflow.execution.IExecutionSystem;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.tool.saxparser.ToolContentHandler;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.URIUtil;
import easyflow.custom.util.Util;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataPort;
import easyflow.graph.jgraphx.Graph;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiPackage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToPackageMapImpl;
import easyflow.util.maps.impl.StringToResolvedParamMapImpl;

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
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getDefaultConfigSourceString <em>Default Config Source String</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getConfigWorkflowDefFile <em>Config Workflow Def File</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getConfigUtilityDefFile <em>Config Utility Def File</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getConfigMetadataFile <em>Config Metadata File</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultProjectImpl extends MinimalEObjectImpl.Container implements DefaultProject {
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
	 * The default value of the '{@link #getConfigWorkflowDefFile() <em>Config Workflow Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigWorkflowDefFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_WORKFLOW_DEF_FILE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConfigWorkflowDefFile() <em>Config Workflow Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigWorkflowDefFile()
	 * @generated
	 * @ordered
	 */
	protected String configWorkflowDefFile = CONFIG_WORKFLOW_DEF_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigUtilityDefFile() <em>Config Utility Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigUtilityDefFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_UTILITY_DEF_FILE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConfigUtilityDefFile() <em>Config Utility Def File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigUtilityDefFile()
	 * @generated
	 * @ordered
	 */
	protected String configUtilityDefFile = CONFIG_UTILITY_DEF_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigMetadataFile() <em>Config Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMetadataFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_METADATA_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigMetadataFile() <em>Config Metadata File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMetadataFile()
	 * @generated
	 * @ordered
	 */
	protected String configMetadataFile = CONFIG_METADATA_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogMessage() <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected LogMessage logMessage;

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
	public String getConfigWorkflowDefFile() {
		return configWorkflowDefFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigWorkflowDefFile(String newConfigWorkflowDefFile) {
		String oldConfigWorkflowDefFile = configWorkflowDefFile;
		configWorkflowDefFile = newConfigWorkflowDefFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE, oldConfigWorkflowDefFile, configWorkflowDefFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigUtilityDefFile() {
		return configUtilityDefFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigUtilityDefFile(String newConfigUtilityDefFile) {
		String oldConfigUtilityDefFile = configUtilityDefFile;
		configUtilityDefFile = newConfigUtilityDefFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE, oldConfigUtilityDefFile, configUtilityDefFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigMetadataFile() {
		return configMetadataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigMetadataFile(String newConfigMetadataFile) {
		String oldConfigMetadataFile = configMetadataFile;
		configMetadataFile = newConfigMetadataFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__CONFIG_METADATA_FILE, oldConfigMetadataFile, configMetadataFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessage getLogMessage() {
		if (logMessage != null && logMessage.eIsProxy()) {
			InternalEObject oldLogMessage = (InternalEObject)logMessage;
			logMessage = (LogMessage)eResolveProxy(oldLogMessage);
			if (logMessage != oldLogMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.DEFAULT_PROJECT__LOG_MESSAGE, oldLogMessage, logMessage));
			}
		}
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessage basicGetLogMessage() {
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMessage(LogMessage newLogMessage) {
		LogMessage oldLogMessage = logMessage;
		logMessage = newLogMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__LOG_MESSAGE, oldLogMessage, logMessage));
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
	 * @generated not
	 */
	public void initLogMessage() {
		if (getLogMessage() == null)
		{
			setLogMessage(CoreFactory.eINSTANCE.createLogMessage());
			getLogMessage().setCategory(Category.PROJECT_CONFIGURATION);
		}
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
	public JSONObject readJson(URI source, boolean isDefault) {
		
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
				//setJsonObject(JSONObject.fromObject(IOUtils.toString(is)));
				return JSONObject.fromObject(IOUtils.toString(is));
			else
				logger.warn("no Input stream found.");
		} catch (FileNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.ERROR_CONFIGURATION_FILE_NOT_FOUND_1, 
					(isDefault ? Severity.ERROR : Severity.INFO),
					source.toString()	);
		} catch (IOException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.ERROR_GENERAL_IO_2, 
					(isDefault ? Severity.ERROR : Severity.INFO),
					Util.generateStringList(source.toString(), e.getMessage())	
					);
		}
		return null;
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
	
	
	private EMap<String, String> readParamValues(JSONObject jsonObject)
	{
		
		EMap<String, String> map = new BasicEMap<String, String>();
		for (Object key : jsonObject.keySet())
		{
			String value = jsonObject.getString((String) key);
			if (GlobalConfig.resolvePath())
				value = GlobalConfig.resolveContextVars(value);
			map.put((String) key, value);
		}
		return map;
	}
	
	private void readParamValues(EMap<String, EMap<String, String>> map, JSONObject jsonObject)
	{
		
		logger.debug(jsonObject+" "+jsonObject.isArray());
		String defaultKey = "exe";
		if (!jsonObject.isEmpty())
			for (Object key : jsonObject.keySet())
			{
				Object o = jsonObject.get(key);
				if (o instanceof String)
				{
					logger.debug(jsonObject.getString((String) key));
					EMap<String, String> submap = new BasicEMap<String, String>();
					submap.put(defaultKey, o.toString());
					map.put((String)key, submap);
				}
				else
					map.put((String)key, readParamValues(jsonObject.getJSONObject((String) key)));
			}
		//else
			
	}
	
	
	private boolean readMainConfig(JSONObject object)
	{
		boolean rc = true;
		return rc;
	}
		
	private EasyflowTemplate readWorkflowTemplate(String workflowTplFile, String utilDefFile)
	{
		
		EasyflowTemplate workflowTemplate = CoreFactory.eINSTANCE.createEasyflowTemplate();
		BufferedReader bfReader = getReader(getBaseURI(), workflowTplFile, true);
		if (bfReader != null)
		{
			workflowTemplate.setReader(bfReader);
			if (utilDefFile != null)
			{
				BufferedReader bfReader1 = getReader(getBaseURI(), utilDefFile, true);
				workflowTemplate.setUtilTaskReader(bfReader1);
			}
			return workflowTemplate;
		}
		
		return null;
	}
	
	private DefaultMetaData readMetadata(String metadataFile)
	{
		DefaultMetaData metaData = MetadataFactory.eINSTANCE.createDefaultMetaData();		

		BufferedReader bfReader;
		bfReader = getReader(getBaseURI(), metadataFile, true);
		if (bfReader != null)
		{
			metaData.setReader(bfReader);
			metaData.initMetaData();
				
			bfReader = getReader(getBaseURI(), metadataFile, true);
				
			metaData.setReader(bfReader);
			return metaData;
		}
		return null;
	}
	
	private boolean readToolConfiguration(JSONObject toolCfg)
	{
		boolean rc = true;
		
		
		/*
		if (toolCfg.has("command_pattern"))
			GlobalConfig.getToolConfig().put("command_pattern", 
					(String) toolCfg.get("command_pattern"));
		if (toolCfg.has("write_default_value_to_command_line"))
			GlobalConfig.getToolConfig().put("write_default_value_to_command_line", 
					(String) toolCfg.get("write_default_value_to_command_line"));
		else
			GlobalConfig.getToolConfig().put("write_default_value_to_command_line", "0");
*/
		for (String paramName : GlobalConfig.getToolConfigParams())
		{
			if (toolCfg.has(paramName))
				GlobalConfig.getToolConfig().put(paramName, (String) toolCfg.get(paramName));
		}

		
		Context varMap = GlobalConfig.getVarMap();
		if (toolCfg.has("var"))
		{	
			JSONObject jo = toolCfg.getJSONObject("var");
			for (Object key : jo.keySet())
			{
				varMap.put((String)key, (String)jo.get(key));
				logger.debug("added var "+key+"="+varMap.get((String)key));
			}
		}

		return rc;		
	}

	private boolean readProcessingConfiguration(JSONObject processingCfg)
	{
		boolean rc = true;
		
		for (String paramName : GlobalConfig.getProcessingConfigParams())
		{
			if (processingCfg.has(paramName))
				GlobalConfig.getToolConfig().put(paramName, (String) processingCfg.get(paramName));
		}

		return rc;		
	}

	private Catalog readCatalogConfiguration(JSONObject jsonObject)
	{
		Catalog catalog = CoreFactory.eINSTANCE.createCatalog();
		
		Iterator<String> it = jsonObject.keys();
		while (it.hasNext())
		{
			String key = it.next();
			logger.trace("read catalog key="+key);
			catalog.getEntries().put(key, jsonObject.getString(key));
		}

		return catalog;		
	}

	private boolean readWorkflowConfiguration(JSONObject workflowCfg)
	{
		boolean rc = true;
		
		for (String paramName : GlobalConfig.getWorkflowConfigParams())
		{
			if (workflowCfg.has(paramName))
				GlobalConfig.getToolConfig().put(paramName, (String) workflowCfg.get(paramName));
		}

		return rc;		
	}
	
	
	private ToolSchemata readToolSchemata(JSONObject toolCfg, URI toolDefPath)
	{
		if (!toolCfg.has("schemata"))
			return null;
		
		JSONArray schemata = toolCfg.getJSONArray("schemata");
		ToolSchemata    toolSchemata   = ToolFactory.eINSTANCE.createToolSchemata();

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
		
		return toolSchemata;
	}

	private boolean readToolDefinition(JSONObject toolCfg, URI toolDefPath, ToolSchemata toolSchemata,
			EMap<String, EMap<String, String>> interpreterMap,
			EMap<String, EMap<String, String>> toolMap,
			EMap<String, EMap<String, String>> pkgMap)
	{
		boolean rc = true;
		ToolDefinitions toolDefintions = ToolFactory.eINSTANCE.createToolDefinitions();
		// read tool definitions
		toolDefintions.setToolSchemata(toolSchemata);
		if (!toolCfg.has("tools"))
			rc = false;
		else
		{
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
							// check for configured package path
							if (tool.getPackage() != null 
									&& pkgMap.containsKey(tool.getPackage().getId()))
							{
								for (Entry<String, String> e : pkgMap.get(tool.getPackage().getId()))
								{
									tool.getPackage().getResolveUriMap().put(e.getKey(), URIUtil.createURI(e.getValue(), null));
								}
							}
							// check for configured tool path
							if (toolMap.containsKey(tool.getId()))
							{
								for (Entry<String, String> e : toolMap.get(tool.getId()))
								{
									tool.getResolveUriMap().put(e.getKey(), URIUtil.createURI(e.getValue(), null));
								}
							}
							if (interpreterMap.containsKey(tool.getId()))
							{
								for (Entry<String, String> e : interpreterMap.get(tool.getId()))
								{
									tool.getResolveUriMap().put(e.getKey(), URIUtil.createURI(e.getValue(), null));
								}								
							}
							logger.debug("SAX parser returned tool: "+tool.getId()
									+" pkg="+(tool.getPackage() == null ? null : tool.getPackage().getId())
									+" params="+tool.getCommand().getResolvedParams().keySet());
							GlobalConfig.getTools().put(tool.getId(), tool);
							
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
				e.printStackTrace();
				rc = false;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				rc = false;
			}
		}
		
		return rc;		
	}
	
	private boolean readToolParamValues()
	{
		boolean rc = true;
		return rc;		
	}

	private boolean readPkgParamValues()
	{
		boolean rc = true;
		return rc;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readConfiguration(JSONObject config, boolean isDefault) {
		
		boolean rc = true;
		
		// general (project) config

		logger.debug("readConfiguration(): "+config.entrySet());
		Workflow workflow = getActiveWorkflow();
		// ####### READ PROJECT CONFIGURATION ########
		if (config.has(GlobalConstants.CONFIGURATION_FILE_SECTION_PROJECT))
		{
			JSONObject projectCfg=config.getJSONObject(GlobalConstants.CONFIGURATION_FILE_SECTION_PROJECT);
		
			logger.debug("readConfiguration(): project configuration keys="+projectCfg.keySet());
			if (projectCfg.containsKey(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME))
				logger.debug("readConfiguration(): "+projectCfg.get(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME)
						+" "+getConfigSource()+" "+getBaseURI());
			else
			{
				getLogMessage().generateLogMsg(GlobalConstants.ERROR_CONFIGURATION_PARAM_MISSING_1, Severity.ERROR, 
						Util.generateStringList(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME));
			}
			
			
			// ####### read workflow base-config ######
			if (getConfigWorkflowDefFile() != null && !"".equals(getConfigWorkflowDefFile()))
				GlobalConfig.getProjectConfig().put(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME, getConfigWorkflowDefFile());
			else if (projectCfg.has(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME))
				GlobalConfig.getProjectConfig().put(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME, projectCfg.getString(GlobalConstants.WORKFLOW_DEF_FILE_PARAM_NAME));
			if (getConfigUtilityDefFile() != null && !"".equals(getConfigUtilityDefFile()))
				GlobalConfig.getProjectConfig().put(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME, getConfigUtilityDefFile());
			else if (projectCfg.has(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME))
				GlobalConfig.getProjectConfig().put(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME, projectCfg.getString(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME));
			
			if (projectCfg.has(GlobalConstants.WORKFLOW_DIR_PARAM_NAME))
				GlobalConfig.getProjectConfig().put(GlobalConstants.WORKFLOW_DIR_PARAM_NAME, projectCfg.getString(GlobalConstants.WORKFLOW_DIR_PARAM_NAME));
			if (projectCfg.has(GlobalConstants.METADATA_FILE_PARAM_NAME))
				GlobalConfig.getProjectConfig().put(GlobalConstants.METADATA_FILE_PARAM_NAME, projectCfg.getString(GlobalConstants.METADATA_FILE_PARAM_NAME));
			if (projectCfg.has(GlobalConstants.METADATA_DIR_PARAM_NAME))
				GlobalConfig.getProjectConfig().put(GlobalConstants.METADATA_DIR_PARAM_NAME, projectCfg.getString(GlobalConstants.METADATA_DIR_PARAM_NAME));
			//GlobalConfig.getProjectconfig().put(GlobalConstants.IS_CONTRAST, projectCfg.getString(GlobalConstants.IS_CONTRAST));
			
			for (Object key:projectCfg.keySet()) {
				workflow.getGenericAttributes().put((String) key, projectCfg.get(key));
			}
		}
		else
		{
			if (isDefault)
				getLogMessage().generateLogMsg(GlobalConstants.ERROR_CONFIGURATION_SECTION_MISSING_1, 
					Severity.INFO,
					Util.generateStringList(GlobalConstants.CONFIGURATION_FILE_SECTION_PROJECT));
			else
				getLogMessage().generateLogMsg(GlobalConstants.ERROR_CONFIGURATION_SECTION_MISSING_1, 
						Severity.WARN,
						Util.generateStringList(GlobalConstants.CONFIGURATION_FILE_SECTION_PROJECT));					
		}
		// ####### set workflow ########
		
		if (!isDefault)
		{
			String workflowTplFile = GlobalConfig.getWorkflowTemplateFileName();
			workflowTplFile = URIUtil.createPath(GlobalConfig.getWorkflowTemplateDirName(), workflowTplFile);
			
			String utilDefFile = null;
			if (GlobalConfig.getProjectConfig().containsKey(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME))
			{
				utilDefFile = GlobalConfig.getProjectConfig().get(GlobalConstants.UTILITY_DEF_FILE_PARAM_NAME);
				utilDefFile = URIUtil.createPath(GlobalConfig.getWorkflowTemplateDirName(), utilDefFile);
			}
			EasyflowTemplate workflowTemplate = readWorkflowTemplate(workflowTplFile, utilDefFile);
			if (workflowTemplate != null)
			{
				workflow.setWorkflowTemplate(workflowTemplate);
				logger.debug("readConfiguration(): workflow template read. Read "
						+workflow.getWorkflowTemplate().getTasks().size()
						+" ("+workflow.getLastTasks().size()+") tasks. ");
			}
			else
			{
				getLogMessage().generateLogMsg(GlobalConstants.ERROR_WORKFLOW_TEMPLATE_FAILED_TO_READ_1, 
						Severity.FATAL, Util.generateStringList(workflow.getLogMessage().getLogMsg()));
				logger.error("readConfiguration(): Could not read workflow template from file: "+workflowTplFile);
			}
			
			// ####### set metadata ########
			String metadataFile = getConfigMetadataFile();
			if (metadataFile == null && !"".equals(getConfigMetadataFile()))
				metadataFile = GlobalConfig.getMetadataFileName();
			
			metadataFile = URIUtil.createPath(GlobalConfig.getMetadataDirName(), metadataFile);
			DefaultMetaData metaData = readMetadata(metadataFile);
			if (metaData != null)
			{
				workflow.setMetaData(metaData);
			}
			else
			{
				logger.error("readConfiguration(): Could not read metadata from file: "+metadataFile+"");
				rc = false;
			}
		}
		
		// ####### READ PROECESSING CONFIGURATION ########
		if (config.has(GlobalConstants.CONFIGURATION_FILE_SECTION_PROCESSING))
		{
			JSONObject processingCfg=config.getJSONObject(GlobalConstants.CONFIGURATION_FILE_SECTION_PROCESSING);
			Iterator<String> it = processingCfg.keys();
			while (it.hasNext())
			{
				String key = it.next();
				logger.trace("readConfiguration(): read processing config key="+key);
				GlobalConfig.getProcessingConfig().put(key, processingCfg.getString(key));
			}
		}
		workflow.setExecutionSystem(GlobalConfig.getExecutionSystem());
		
		// ####### READ CATALOG CONFIGURATION ########
		if (config.has(GlobalConstants.CONFIGURATION_FILE_SECTION_CATALOG))
		{
			Catalog catalog = readCatalogConfiguration(config.getJSONObject(GlobalConstants.CONFIGURATION_FILE_SECTION_CATALOG));
			if (catalog != null)
				workflow.setCatalog(catalog);
		}
		else
		{
			logger.info("readConfiguration(): No catalog section configured.");
		}
		
		// ####### READ WORKFLOW CONFIGURATION ########
		JSONObject workflowCfg = null;
		if (config.has(GlobalConstants.CONFIGURATION_FILE_SECTION_WORKFLOW))
		{
			workflowCfg = config.getJSONObject(GlobalConstants.CONFIGURATION_FILE_SECTION_WORKFLOW);
			if (workflowCfg.has(GlobalConstants.DEFAULT_GROUPING_CRITERIA_PARAM_NAME))
			{
				for (int i=0; i<workflowCfg.getJSONArray(GlobalConstants.DEFAULT_GROUPING_CRITERIA_PARAM_NAME).size();i++)
					workflow.getDefaultGroupingCriteria().add(workflowCfg.getJSONArray(GlobalConstants.DEFAULT_GROUPING_CRITERIA_PARAM_NAME).getString(i));
			}
			else
			{
				logger.info("readConfiguration(): no default grouping criteria defined. Set default automatically.");
				workflow.getDefaultGroupingCriteria().add(GlobalConfig.getDefaultGroupingCriterion());
			}

			if (workflowCfg.has(GlobalConstants.DEFAULT_WORKFLOW_MODE_PARAM_NAME))
				workflow.setMode(workflowCfg.getString(GlobalConstants.DEFAULT_WORKFLOW_MODE_PARAM_NAME));

		}
		else if (!isDefault)
		{
			logger.warn("readConfiguration(): no workflow section configured.");
			logger.info("readConfiguration(): no default grouping criteria defined. Set default automatically.");
			workflow.getDefaultGroupingCriteria().add(GlobalConfig.getDefaultGroupingCriterion());
		}
				
    	// create the special root task/cell which is the root
    	// in all subsequent processed graphs, the root should link any
    	// task from the workflow template that has no incoming task
		Task rootTask = workflow.getRootTask();
		if (rootTask == null)
		{
	    	rootTask = CoreFactory.eINSTANCE.createTask();
	    	rootTask.setName(GlobalConstants.ROOT_TASK_NAME);
	    	rootTask.setRoot(true);
	    	workflow.setRootTask(rootTask);
	    	GlobalVar.setRootTask(rootTask);
		}
    	if (!isDefault)
    	{
    		if (workflowCfg != null)
    		{
    			readInputs(workflowCfg, rootTask);
    			if (workflowCfg.has(GlobalConstants.WORKFLOW_INPUT_GROUPING_CRITERION_PARAM_NAME))
    				rootTask.createGroupingCriteria(workflowCfg.getString(GlobalConstants.WORKFLOW_INPUT_GROUPING_CRITERION_PARAM_NAME),
    					rootTask.getOutDataPorts().get(0), workflow.getMode());
    			//rootTask.readGroupingCriteria(
    				//	workflowCfg.getString(GlobalConstants.PROCESSING_METADATA_INPUT_FIELD_PARAM_NAME), 
    					//		workflow.getDefaultGroupingCriteria(), workflow.getMode()    							);
    		}
    		else
    		{
    			logger.debug("readConfiguration(): no default inputs and no default grouping criterion read due to missing workflow section.");
    		}
    	}
    	logger.debug("readConfiguration(): "+rootTask.getDetailedString());
		
		// ####### READ TOOL CONFIGURATION ########		
		// tool config (dir, tools, schemata)
		if (config.has(GlobalConstants.CONFIGURATION_FILE_SECTION_TOOL))
		{
			JSONObject toolCfg = config.getJSONObject(GlobalConstants.CONFIGURATION_FILE_SECTION_TOOL);
			
			EMap<String, EMap<String, String>> interpreterMap = GlobalConfig.getInterpreterMap();
			EMap<String, EMap<String, String>> pkgMap         = GlobalConfig.getPkgMap();
			EMap<String, EMap<String, String>> toolMap        = GlobalConfig.getToolMap();

			readToolConfiguration(toolCfg);
			if (toolCfg.has("interpreter"))
				readParamValues(interpreterMap, toolCfg.getJSONObject("interpreter"));
			if (toolCfg.has("pkg"))
				readParamValues(pkgMap, toolCfg.getJSONObject("pkg"));
			if (toolCfg.has("tool"))
				readParamValues(toolMap, toolCfg.getJSONObject("tool"));
			
			
			// ####### READ TOOL DEFINITIONS ########
			
			if (toolCfg.has(GlobalConstants.TOOL_DEF_DIR_PARAM_NAME))
			{
				GlobalConfig.setToolDefDirName(toolCfg.getString(GlobalConstants.TOOL_DEF_DIR_PARAM_NAME));
			}
			
			URI toolDefPath = getBaseURI();
			try 
			{
				toolDefPath = URIUtil.addToURI(toolDefPath, GlobalConfig.getToolDefDirName());
				
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ToolSchemata toolSchemata = readToolSchemata(toolCfg, toolDefPath);
			if (toolSchemata == null)
				logger.info("readConfiguration(): No tool schemata read.");
			boolean toolsOK = readToolDefinition(toolCfg, toolDefPath, toolSchemata, interpreterMap, toolMap, pkgMap);
			logger.debug("readConfiguration(): "+GlobalConfig.getTools().keySet());
			if (toolsOK)
			{
				for (String toolId : GlobalConfig.getTools().keySet())
				{
					Tool tool = GlobalConfig.getTools().get(toolId);
					logger.debug("readConfiguration(): check for additional parameters of tool="+tool.getId());
					easyflow.tool.Package pkg = tool.getPackage();
					if (pkg != null)
						logger.debug("readConfiguration(): check for additional parameters of tool="+tool.getId()+" as defined by package="+pkg.getName());
					else
						continue;
					
					if (pkg != null)
					{
						int i = 0;
						EMap<String, Integer> indexMap        = new BasicEMap<String, Integer>();
						EMap<String, Integer> byParamIndexMap = new BasicEMap<String, Integer>();
						for (ResolvedParam rp : pkg.getResolvedParams())
						{
							Parameter p = rp.getParameter(); 
							if (!p.isAbstract() && !p.getToolRefs().isEmpty())
							{
								if (p.getToolRefs().get(0).equalsIgnoreCase("All")
										|| p.getToolRefs().contains(tool.getId()))
								{
									logger.debug("readConfiguration(): param "+rp.renderToString()
											+" (dataparam="+p.isDataParam()+")"
											+" refers to tool="+tool.renderToString()
											);
									
									if (p.isPreferred())
										tool.createData(rp, indexMap, byParamIndexMap);
									else
										tool.createData(rp, null, null);
									//logger.debug(""+tool.getCommand().getResolvedParams().keySet());
									
									StringToResolvedParamMapImpl entry = 
											(StringToResolvedParamMapImpl)EcoreUtil.create(MapsPackage.Literals.STRING_TO_RESOLVED_PARAM_MAP);
									entry.setKey(rp.resolveName());
									entry.setValue(rp);
									if (p.isPreferred())
										tool.getCommand().getResolvedParams().add(i++, entry);
									else
										tool.getCommand().getResolvedParams().add(entry);
									
									//logger.debug(""+tool.getCommand().getResolvedParams().keySet());
								}
								else
								{
									logger.debug("readConfiguration(): param "+rp.renderToString()+" does not refer to tool="+tool.renderToString());
								}
							}
						}
					}
				}
			}
			
			if (toolCfg.has(GlobalConstants.TOOL_CFG_DIR_PARAM_NAME))
			{
				GlobalConfig.setToolConfigDirName(toolCfg.getString(GlobalConstants.TOOL_CFG_DIR_PARAM_NAME));
			}
		}
		else
		{
			logger.error("readConfiguration(): No tool section configured");
			rc = false;
		}
		
		//############# read constant param values for tool/pkg ################
		
		
		if (!isDefault)
		{
			URI toolConfigPath  = getBaseURI();
			URI pkgFilesPath    = getBaseURI();
			URI toolFilesPath   = getBaseURI();

			try 
			{
				toolConfigPath = URIUtil.addToURI(toolConfigPath, GlobalConfig.getToolConfigDirName());
				
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try 
			{
				toolFilesPath = URIUtil.addToURI(toolConfigPath, GlobalConfig.getToolConfigFilesDirName());
			} 
			catch (URISyntaxException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try 
			{
				pkgFilesPath = URIUtil.addToURI(toolConfigPath, GlobalConfig.getPkgConfigFilesDirName());
			} 
			catch (URISyntaxException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			BufferedReader bfReader;
			JSONObject     toolCfg;
			// try to find tool_config.json
			bfReader = getReader(toolConfigPath, GlobalConfig.getToolConfigFileName(), true);
			try {
				toolCfg= JSONObject.fromObject(IOUtils.toString(bfReader));
				readToolConfig(toolCfg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			// try to find pkg_config.json
			bfReader = getReader(toolConfigPath, GlobalConfig.getPkgConfigFileName(), true);
			try {
				toolCfg= JSONObject.fromObject(IOUtils.toString(bfReader));
				readPkgConfig(toolCfg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// try to find <toolname>_config.json
			for (Tool tool : GlobalConfig.getTools().values())
			{
				bfReader = getReader(toolFilesPath, tool.getId(), false);
				
				if (tool.getPackage() != null)
				{
					bfReader = getReader(pkgFilesPath, tool.getPackage().getId(), false);
				}
			}
		}
		getWorkflows().add(workflow);

		return rc;
	}
	
	private boolean readToolConfig(JSONObject toolCfg)
	{
		boolean rc = true;
		logger.debug(GlobalConfig.getTools().keySet());
		Iterator<String> it = toolCfg.keys();
		for (String key = null; it.hasNext(); key=it.next())
		{
			if (key == null)
				continue;
			if (GlobalConfig.getTools().keySet().contains(key))
			{
				Tool t = GlobalConfig.getTools().get(key);
				logger.debug("found configuration for tool="+key);
				JSONObject to = toolCfg.getJSONObject(key);
				Iterator<String> pit = to.keys();
				while (pit.hasNext())
				{
					String pkey = pit.next();
					toolConfigController(to.getJSONObject(pkey), new BasicEList<ResolvedParam>(t.getCommand().getResolvedParams().values()));
				}
			}
			//if (o.a)
		}
		//if ()
		return rc;
	}
	private boolean readPkgConfig(JSONObject pkgCfg)
	{
		boolean rc = true;
		logger.debug(GlobalConfig.getTools().keySet());
		Iterator<Entry<String, Tool>> it = GlobalConfig.getTools().iterator();
		
		for (Entry<String, Tool> key = null; it.hasNext(); key=it.next())
		{
			if (key == null)
				continue;
			easyflow.tool.Package pkg = key.getValue().getPackage();
			if (pkg != null)
				if (pkgCfg.containsKey(pkg.getId()))
				{
					JSONObject o = pkgCfg.getJSONObject(pkg.getId());
					toolConfigController(o, pkg.getResolvedParams());
				}

			
		}
		return rc;
	}
	
	private boolean toolConfigController(JSONObject o, EList<ResolvedParam> rpList)
	{
		boolean rc = true;
		
		if (o.has("param"))
		{
			JSONObject p = o.getJSONObject("param");
			enumerateToolConfigParameter(p, rpList);
			
			// do something with the remaining sections/properties
			if (o.has("interpreter"))
			{
					
			}
			if (o.has("pkg"))
			{
					
			}
		}			
		else
			enumerateToolConfigParameter(o, rpList);
		
		return rc;
	}
	
	private void enumerateToolConfigParameter(JSONObject params, EList<ResolvedParam> rpList)
	{
		
		Iterator<String> pit = params.keys();
		while (pit.hasNext())
		{
			String param = pit.next();
			ResolvedParam rp = findParamByName(param, rpList);
			if (rp != null)
			{
				logger.debug("found config for known parameter="+rp.resolveName());
				resolveToolConfigParameter(params, param, rp);
			}
			else
				logger.debug("config for unknown parameter="+param+" detected");
		
		}

	}
	
	private ResolvedParam findParamByName(String paramName, EList<ResolvedParam> rpList)
	{
		for (ResolvedParam rp : rpList)
			if (rp.resolveName().equals(paramName))
				return rp;
		return null;
	}
	
	private boolean resolveToolConfigParameter(JSONObject o, String paramName, ResolvedParam rp)
	{
		boolean rc = true;
		logger.debug("resolve parameter="+rp.resolveName()+" with config="+o);
		//check what kind of object we have:
		//1. string:
		Object value = o.getString(paramName);
		if (value instanceof String)
			rp.getValue().add(value);
		else
		{
			logger.warn("no handling for value="+value+" implemented.");
			rc = false;
		}
		return rc;
	}
	
	private BufferedReader getReader(URI baseUri, String path, boolean createWarning)
	{
		try {
			InputStreamReader isReader;
			URI uri = URIUtil.addToURI(baseUri, path);
			try 
			{
				isReader = URIUtil.getInputStreamReader(uri, isFromJar());
				return new BufferedReader(isReader);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				if (createWarning)
					logger.info("Could not read resource with uri="+uri.toString());
			}
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return null;
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
	 * @generated not
	 */
	public boolean init(EasyFlowGraph graph) {
		
		logger.debug("loglevel of logger="+logger.getName()+" "+logger.getLevel()+" "+logger.hashCode()+" "+Logger.getRootLogger().hashCode());
		//System.exit(1);
		boolean rc = true;
		initLogMessage();
		clearWorkflows();
		GlobalVar.setDefaultProject(this);
		
		
		
		Workflow workflow;
		if (getActiveWorkflow() != null)
			workflow = getActiveWorkflow();
		else
		{
			workflow = CoreFactory.eINSTANCE.createWorkflow();
			workflow.init();
			getWorkflows().add(workflow);
		}

		if (getActiveWorkflow().getJgraph() == null)
		{
			Graph jGraph = JgraphxFactory.eINSTANCE.createGraph();
			getActiveWorkflow().setJgraph(jGraph);
			jGraph.init();
			jGraph.setGraph(graph);
			JGraphXUtil.setGraph(jGraph);
		}
		if (getActiveWorkflow().getGraph() == null)
			getActiveWorkflow().setGraph(graph);
		if (GlobalVar.getGraph() == null)
			GlobalVar.setGraph(graph);
		
		JSONObject dfltConfig;
		try {
			URI dfltSrc = URIUtil.createURI(System.getProperty("user.home"), GlobalConstants.DFLT_CONFIG_FILE);
			dfltConfig = readJson(dfltSrc, true);
			if (dfltConfig != null)
			{
				rc = readConfiguration(dfltConfig, true);
			}
			JSONObject mainConfig = readJson(getConfigSource(), false);
			if (mainConfig != null)
			{
				GlobalConfig.setJsonCfg(mainConfig);
		        if (readConfiguration(mainConfig, false))
		        {
					if (getActiveWorkflow().readWorkfowTemplate())
					{	
						GlobalVar.setMetaData((DefaultMetaData) getActiveWorkflow().getMetaData());
						getActiveWorkflow().getJgraph().setMetaData((DefaultMetaData) getActiveWorkflow().getMetaData());
						applyMetaData();
					}
					else
					{
						rc = false;
					}
		        }
		        else
		        {
		        	rc = false;
		        }
			}
			else
			{
				rc = false;
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public boolean runEntireWorkflow() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException {
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
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public int runNextWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException {
		return getActiveWorkflow().runNextWorkflowStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public int runPrevWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException, NoValidInOutDataException {
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
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return isFromJar();
			case UiPackage.DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING:
				return getDefaultConfigSourceString();
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				if (resolve) return getToolDefinitions();
				return basicGetToolDefinitions();
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				if (coreType) return getPackages();
				else return getPackages().map();
			case UiPackage.DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE:
				return getConfigWorkflowDefFile();
			case UiPackage.DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE:
				return getConfigUtilityDefFile();
			case UiPackage.DEFAULT_PROJECT__CONFIG_METADATA_FILE:
				return getConfigMetadataFile();
			case UiPackage.DEFAULT_PROJECT__LOG_MESSAGE:
				if (resolve) return getLogMessage();
				return basicGetLogMessage();
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
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar((Boolean)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				setToolDefinitions((ToolDefinitions)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				((EStructuralFeature.Setting)getPackages()).set(newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE:
				setConfigWorkflowDefFile((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE:
				setConfigUtilityDefFile((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_METADATA_FILE:
				setConfigMetadataFile((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__LOG_MESSAGE:
				setLogMessage((LogMessage)newValue);
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
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar(FROM_JAR_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				setToolDefinitions((ToolDefinitions)null);
				return;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				getPackages().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE:
				setConfigWorkflowDefFile(CONFIG_WORKFLOW_DEF_FILE_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE:
				setConfigUtilityDefFile(CONFIG_UTILITY_DEF_FILE_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__CONFIG_METADATA_FILE:
				setConfigMetadataFile(CONFIG_METADATA_FILE_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__LOG_MESSAGE:
				setLogMessage((LogMessage)null);
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
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return fromJar != FROM_JAR_EDEFAULT;
			case UiPackage.DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING:
				return DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT == null ? defaultConfigSourceString != null : !DEFAULT_CONFIG_SOURCE_STRING_EDEFAULT.equals(defaultConfigSourceString);
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				return toolDefinitions != null;
			case UiPackage.DEFAULT_PROJECT__PACKAGES:
				return packages != null && !packages.isEmpty();
			case UiPackage.DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE:
				return CONFIG_WORKFLOW_DEF_FILE_EDEFAULT == null ? configWorkflowDefFile != null : !CONFIG_WORKFLOW_DEF_FILE_EDEFAULT.equals(configWorkflowDefFile);
			case UiPackage.DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE:
				return CONFIG_UTILITY_DEF_FILE_EDEFAULT == null ? configUtilityDefFile != null : !CONFIG_UTILITY_DEF_FILE_EDEFAULT.equals(configUtilityDefFile);
			case UiPackage.DEFAULT_PROJECT__CONFIG_METADATA_FILE:
				return CONFIG_METADATA_FILE_EDEFAULT == null ? configMetadataFile != null : !CONFIG_METADATA_FILE_EDEFAULT.equals(configMetadataFile);
			case UiPackage.DEFAULT_PROJECT__LOG_MESSAGE:
				return logMessage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UiPackage.DEFAULT_PROJECT___VALIDATE:
				return validate();
			case UiPackage.DEFAULT_PROJECT___GET_ACTIVE_WORKFLOW:
				return getActiveWorkflow();
			case UiPackage.DEFAULT_PROJECT___CLEAR_WORKFLOWS:
				clearWorkflows();
				return null;
			case UiPackage.DEFAULT_PROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN:
				return readConfiguration((JSONObject)arguments.get(0), (Boolean)arguments.get(1));
			case UiPackage.DEFAULT_PROJECT___READ_JSON__URI_BOOLEAN:
				return readJson((URI)arguments.get(0), (Boolean)arguments.get(1));
			case UiPackage.DEFAULT_PROJECT___SET_CONFIG_AND_BASE_PATH__STRING:
				setConfigAndBasePath((String)arguments.get(0));
				return null;
			case UiPackage.DEFAULT_PROJECT___APPLY_META_DATA:
				applyMetaData();
				return null;
			case UiPackage.DEFAULT_PROJECT___INIT__EASYFLOWGRAPH:
				return init((EasyFlowGraph)arguments.get(0));
			case UiPackage.DEFAULT_PROJECT___DELETE:
				return delete();
			case UiPackage.DEFAULT_PROJECT___RUN_ENTIRE_WORKFLOW:
				try {
					return runEntireWorkflow();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___RESOLVE_TRAVERSAL_CRITERIA:
				try {
					return resolveTraversalCriteria();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___GENERATE_ABSTRACT_GRAPH:
				return generateAbstractGraph();
			case UiPackage.DEFAULT_PROJECT___APPLY_GROUPING_CRITERIA:
				try {
					return applyGroupingCriteria();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___APPLY_PARAMETER_CRITERIA:
				try {
					return applyParameterCriteria();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___RESOLVE_UTILITY_TASKS:
				try {
					return resolveUtilityTasks();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___RESOLVE_PREPROCESSING_TASKS:
				try {
					return resolvePreprocessingTasks();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___RESOLVE_TOOL_DEPENDENCIES:
				try {
					return resolveToolDependencies();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM:
				return generateWorklowForExecutionSystem();
			case UiPackage.DEFAULT_PROJECT___SET_WORKER__EASYFLOWOVERALLWORKER:
				setWorker((EasyFlowOverallWorker)arguments.get(0));
				return null;
			case UiPackage.DEFAULT_PROJECT___RUN_NEXT_WORKFLOW_STEP:
				try {
					return runNextWorkflowStep();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___RUN_PREV_WORKFLOW_STEP:
				try {
					return runPrevWorkflowStep();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case UiPackage.DEFAULT_PROJECT___HAS_NEXT_WORKFLOW_STEP:
				return hasNextWorkflowStep();
			case UiPackage.DEFAULT_PROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING:
				return getWorkflowStepLabelFor((String)arguments.get(0));
			case UiPackage.DEFAULT_PROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING:
				return getWorkflowStepDescFor((String)arguments.get(0));
			case UiPackage.DEFAULT_PROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS:
				return getTotalNumberOfWorkflowSteps();
			case UiPackage.DEFAULT_PROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP:
				return getNumberOfCurrentWorkflowStep();
			case UiPackage.DEFAULT_PROJECT___GET_NEXT_WORKFLOW_STEP:
				return getNextWorkflowStep();
			case UiPackage.DEFAULT_PROJECT___GET_CUR_WORKFLOW_STEP:
				return getCurWorkflowStep();
			case UiPackage.DEFAULT_PROJECT___RESET_WORKFLOW_STEP:
				return resetWorkflowStep();
			case UiPackage.DEFAULT_PROJECT___GET_EXECUTION_SYSTEM:
				return getExecutionSystem();
			case UiPackage.DEFAULT_PROJECT___INIT_LOG_MESSAGE:
				initLogMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", DefaultConfigSourceString: ");
		result.append(defaultConfigSourceString);
		result.append(", configWorkflowDefFile: ");
		result.append(configWorkflowDefFile);
		result.append(", configUtilityDefFile: ");
		result.append(configUtilityDefFile);
		result.append(", configMetadataFile: ");
		result.append(configMetadataFile);
		result.append(')');
		return result.toString();
	}

} //DefaultProjectImpl
