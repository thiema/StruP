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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.mxgraph.model.mxCell;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;
import easyflow.core.EasyflowTemplate;
import easyflow.core.IMetaData;
import easyflow.core.Tool;
import easyflow.core.Workflow;
import easyflow.core.impl.StringToSchemaMapImpl;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;
import easyflow.graph.jgraphx.Util;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getConfigFileName <em>Config File Name</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getGraphUtil <em>Graph Util</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#isFromJar <em>From Jar</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getToolDefinitions <em>Tool Definitions</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getSchemata <em>Schemata</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getJsonObject <em>Json Object</em>}</li>
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
	 * The default value of the '{@link #getConfigFileName() <em>Config File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigFileName() <em>Config File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFileName()
	 * @generated
	 * @ordered
	 */
	protected String configFileName = CONFIG_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

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
	protected static final boolean FROM_JAR_EDEFAULT = false;

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
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected Examples examples;

	/**
	 * The cached value of the '{@link #getToolDefinitions() <em>Tool Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> toolDefinitions;

	/**
	 * The cached value of the '{@link #getSchemata() <em>Schemata</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemata()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Schema> schemata;

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
	public String getConfigFileName() {
		return configFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigFileName(String newConfigFileName) {
		String oldConfigFileName = configFileName;
		configFileName = newConfigFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__CONFIG_FILE_NAME, oldConfigFileName, configFileName));
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
	public Examples getExamples() {
		if (examples != null && examples.eIsProxy()) {
			InternalEObject oldExamples = (InternalEObject)examples;
			examples = (Examples)eResolveProxy(oldExamples);
			if (examples != oldExamples) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.DEFAULT_PROJECT__EXAMPLES, oldExamples, examples));
			}
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examples basicGetExamples() {
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamples(Examples newExamples) {
		Examples oldExamples = examples;
		examples = newExamples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__EXAMPLES, oldExamples, examples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getToolDefinitions() {
		if (toolDefinitions == null) {
			toolDefinitions = new EDataTypeUniqueEList<Document>(Document.class, this, UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS);
		}
		return toolDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Schema> getSchemata() {
		if (schemata == null) {
			schemata = new EcoreEMap<String,Schema>(CorePackage.Literals.STRING_TO_SCHEMA_MAP, StringToSchemaMapImpl.class, this, UiPackage.DEFAULT_PROJECT__SCHEMATA);
		}
		return schemata;
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
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readProjectJson(URI source) {
		
		//JSONObject jsonObject=null;
		try {
			InputStream is = getClass().getResourceAsStream(source.toString());
			setJsonObject(JSONObject.fromObject(IOUtils.toString(is))); 
		//} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */	 
	public String createPath(String fileName) {
		
		String path = getBasePath()+fileName; 
		logger.debug(path);
		return path;

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
	public void applyTraversalEvents() {
		getActiveWorkflow().applyTraversalEvents();
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
	 * @return 
	 * @throws FileNotFoundException 
	 * @generated not
	 */
	public Schema readSchema(URI xsdSource) throws FileNotFoundException {
		InputStream xsdStream;
		if (isFromJar())
			xsdStream = getClass().getResourceAsStream(xsdSource.toString());
		else
			xsdStream = new FileInputStream(new File(xsdSource.toString()));

		Source schemaFile = new StreamSource(xsdStream);

		SchemaFactory schemaFactory = SchemaFactory
			    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		try {
			return schemaFactory.newSchema(schemaFile); 
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}

	private InputStream getInputStream(URI uri) throws FileNotFoundException
	{
		InputStream inputStream;
		if (isFromJar())
			inputStream = getClass().getResourceAsStream(uri.toString());
		else
			inputStream = new FileInputStream(new File(uri.toString()));
		
		return inputStream;
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Document readToolDefinition(URI xmlSource) throws FileNotFoundException {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(getInputStream(xmlSource));
			Schema schema = getSchemaFor(doc);
			if (schema != null)
			{
				Validator validator = schema.newValidator();
				validator.validate(new StreamSource(getInputStream(xmlSource)));
			}
			// TODO: handle schema not found/unvalidated xml source
			
			return doc;
				
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Source xmlFile = new StreamSource(xmlStream);
		return null;
		
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws FileNotFoundException 
	 * @generated not
	 */
	public void readConfiguration() throws FileNotFoundException {
		// general (project) config
		JSONObject projectCfg=jsonObject.getJSONObject("project");
		//logger.debug(jsonObject.entrySet());
		logger.debug(projectCfg.get("workflowTemplateFile")+" "+getConfigFileName());
		
		Workflow workflow=CoreFactory.eINSTANCE.createWorkflow();
		EasyflowTemplate workflowTemplate=CoreFactory.eINSTANCE.createEasyflowTemplate();
		
		InputStreamReader isReader; 
		if (isFromJar())
		{			
			isReader = new InputStreamReader(getClass().getResourceAsStream(
					createPath(projectCfg.getString("workflowTemplateFile"))));
		}
		else
		{
			isReader = new FileReader(createPath(projectCfg.getString("workflowTemplateFile")));
		}
		workflowTemplate.setReader(new BufferedReader(isReader));
		workflow.setWorkflowTemplate(workflowTemplate);
		logger.debug(workflow.getWorkflowTemplate()+" "+workflow.getLastTasks().size());

		DefaultMetaData metaData=CoreFactory.eINSTANCE.createDefaultMetaData();		
		metaData.setFileName(createPath(projectCfg.getString("metadataFile")));

		workflow.setMetaData(metaData);

		
		// workflow config
		JSONObject workflowCfg=jsonObject.getJSONObject("workflow");
		workflow.setMode(workflowCfg.getString("mode"));
		//JSONArray tmp=workflowCfg.getJSONArray("defaultGroupingCriteria");

		for (int i=0; i<workflowCfg.getJSONArray("defaultGroupingCriteria").size();i++)
			workflow.getDefaultGroupingCriteria().add(workflowCfg.getJSONArray("defaultGroupingCriteria").getString(i));
		
		logger.debug(projectCfg.keySet()+" "+workflow.getGraphUtil());
		
		for (Object key:projectCfg.keySet()) {
			workflow.getGenericAttributes().put((String) key, projectCfg.get(key));	
		}

		// tool config (dir, tools, schemata)
		JSONObject toolCfg = jsonObject.getJSONObject("tool");
		JSONArray schemata = toolCfg.getJSONArray("schemata");
		String toolDefPath = basePath;
		if (toolCfg.has("dir"))
		{
			toolDefPath = new File(basePath+"/"+toolCfg.getString("dir")).getPath();
		}
		for (int i=0; i<schemata.size(); i++)
		{
			try {
				
				URI source = createURI(toolDefPath, schemata.getString(i));
				Schema schema = readSchema(source);
				if (schema != null)
					getSchemata().put(source.toString(), schema);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		JSONArray toolsArray = toolCfg.getJSONArray("tools");
		EList<Tool> tools = new BasicEList<Tool>();
		for (int i=0; i<toolsArray.size(); i++)
			try {
				
				Document doc = readToolDefinition(createURI(toolDefPath, toolsArray.getString(i)));
				
				for (int j=0; j<doc.getDocumentElement().getChildNodes().getLength(); j++) {
					Node node=doc.getDocumentElement().getChildNodes().item(j);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Tool tool=CoreFactory.eINSTANCE.createTool();
						tool.readImplementation((Element) node);
						//getActiveWorkflow().getTools().put(tool.getId(), tool);
						tools.add(tool);
					}
				}
				

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		getWorkflows().add(workflow);

		/*JSONArray cms = jsonObject.getJSONArray("project");
		for (Object o : cms) {
		   JSONObject cm = (JSONObject) o;
		   logger.debug(cm.get(0));
		}*/
		
		// read examples
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getSchemaFor(URI sourceXML) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema getSchemaFor(Document document) {
		
		if (!document.getDocumentElement().hasAttribute("xsi:schemaLocation"))
		{
			logger.warn("no schema location attribute found.");
			return null;
		}
		Attr attr = document.getDocumentElement().getAttributeNode("xsi:schemaLocation");
		
		String[] tmp = StringUtils.split(attr.getValue(), " ");
		String key = tmp.length == 1 ? tmp[0] : tmp[1];
		return getSchemata().containsKey(key) ? getSchemata().get(key) : null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Schema getDefaultSchema() {
		return getSchemata().isEmpty() ? null : getSchemata().get(0).getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__SCHEMATA:
				return ((InternalEList<?>)getSchemata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void initProject() {

		setFromJar(true);
		try {
			readConfiguration();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setExamples(ExampleFactory.eINSTANCE.createExamples());
		getExamples().setLocator("/easyflow/custom/examples");
		
		if (getGraphUtil() == null)
			setGraphUtil(JgraphxFactory.eINSTANCE.createUtil());
		getActiveWorkflow().setGraphUtil(getGraphUtil());
		getActiveWorkflow().setGraph(getGraphUtil().getGraph());
		getActiveWorkflow().readWorkfowTemplate();
		
		getActiveWorkflow().generateGraphFromTemplate();
		getGraphUtil().setMetaData((DefaultMetaData) getActiveWorkflow().getMetaData());
		
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void autoSetup() {
		
		setBasePath("/easyflow/custom/examples/sequencing/");
		
		clearWorkflows();
		if (getConfigFileName() == null || getConfigFileName().equals(""))
			setConfigFileName("main.json");
		try {
			readProjectJson(createURI(basePath, getConfigFileName()));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		initProject();
		applyMetaData();
		getActiveWorkflow().resolveTraversalEvents();
	}

	private URI createURI(String basePath, String fileName) throws URISyntaxException
	{
		logger.debug("crate uri: "+basePath+" "+fileName);
		return new URI(fileName == null ?
								basePath :
								new File(basePath +"/" +fileName).getPath());
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
			case UiPackage.DEFAULT_PROJECT__CONFIG_FILE_NAME:
				return getConfigFileName();
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				return getBasePath();
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return getLogger();
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				if (resolve) return getGraphUtil();
				return basicGetGraphUtil();
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return isFromJar();
			case UiPackage.DEFAULT_PROJECT__EXAMPLES:
				if (resolve) return getExamples();
				return basicGetExamples();
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				return getToolDefinitions();
			case UiPackage.DEFAULT_PROJECT__SCHEMATA:
				if (coreType) return getSchemata();
				else return getSchemata().map();
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				return getJsonObject();
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
			case UiPackage.DEFAULT_PROJECT__CONFIG_FILE_NAME:
				setConfigFileName((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				setGraphUtil((Util)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar((Boolean)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__EXAMPLES:
				setExamples((Examples)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				getToolDefinitions().clear();
				getToolDefinitions().addAll((Collection<? extends Document>)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__SCHEMATA:
				((EStructuralFeature.Setting)getSchemata()).set(newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				setJsonObject((JSONObject)newValue);
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
			case UiPackage.DEFAULT_PROJECT__CONFIG_FILE_NAME:
				setConfigFileName(CONFIG_FILE_NAME_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				setGraphUtil((Util)null);
				return;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				setFromJar(FROM_JAR_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__EXAMPLES:
				setExamples((Examples)null);
				return;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				getToolDefinitions().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__SCHEMATA:
				getSchemata().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				setJsonObject(JSON_OBJECT_EDEFAULT);
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
			case UiPackage.DEFAULT_PROJECT__CONFIG_FILE_NAME:
				return CONFIG_FILE_NAME_EDEFAULT == null ? configFileName != null : !CONFIG_FILE_NAME_EDEFAULT.equals(configFileName);
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case UiPackage.DEFAULT_PROJECT__GRAPH_UTIL:
				return graphUtil != null;
			case UiPackage.DEFAULT_PROJECT__FROM_JAR:
				return fromJar != FROM_JAR_EDEFAULT;
			case UiPackage.DEFAULT_PROJECT__EXAMPLES:
				return examples != null;
			case UiPackage.DEFAULT_PROJECT__TOOL_DEFINITIONS:
				return toolDefinitions != null && !toolDefinitions.isEmpty();
			case UiPackage.DEFAULT_PROJECT__SCHEMATA:
				return schemata != null && !schemata.isEmpty();
			case UiPackage.DEFAULT_PROJECT__JSON_OBJECT:
				return JSON_OBJECT_EDEFAULT == null ? jsonObject != null : !JSON_OBJECT_EDEFAULT.equals(jsonObject);
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
		result.append(" (configFileName: ");
		result.append(configFileName);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", logger: ");
		result.append(logger);
		result.append(", fromJar: ");
		result.append(fromJar);
		result.append(", toolDefinitions: ");
		result.append(toolDefinitions);
		result.append(", jsonObject: ");
		result.append(jsonObject);
		result.append(')');
		return result.toString();
	}

} //DefaultProjectImpl
