package easyflow.core.impl;

import easyflow.core.Catalog;
import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.model.mxICell;
import com.mxgraph.shape.mxBasicShape;
import com.mxgraph.shape.mxDefaultTextShape;
import com.mxgraph.shape.mxIShape;

import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import com.mxgraph.view.mxStylesheet;
import com.mxgraph.view.mxCellState;

import easyflow.EasyflowFactory;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultRecord;


import easyflow.core.DefaultWorkflowTemplate;

import easyflow.core.Task;

import easyflow.core.Workflow;

import easyflow.custom.exception.GroupingInstanceNotFoundException;
import easyflow.custom.exception.TaskToCellMapKeyNotFoundException;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.graph.jgraphx.Util;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.IMetaData;
import easyflow.tool.DataPort;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;
import easyflow.traversal.TraversalEvent;

import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToObjectMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import easyflow.custom.util.XMLUtil;
import easyflow.execution.makeflow.Makeflow;
import easyflow.execution.makeflow.MakeflowFactory;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import java.util.Stack;


import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.groovy.util.StringUtil;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;

import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getKnownGroupingCriteria <em>Known Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getKnownDataFormats <em>Known Data Formats</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getKnownTraversalCriteria <em>Known Traversal Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getWorkflowTemplate <em>Workflow Template</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getLastTasks <em>Last Tasks</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getDefaultGroupingCriteria <em>Default Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getPreviousTaskName <em>Previous Task Name</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getGraphUtil <em>Graph Util</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getProcessingConfig <em>Processing Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
	/**
	 * The default value of the '{@link #getGraph() <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated not
	 * @ordered
	 */
	//protected static final mxGraph GRAPH_EDEFAULT = new mxGraph();
	protected static final EasyFlowGraph GRAPH_EDEFAULT = new EasyFlowGraph();

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowGraph graph = GRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstNode() <em>First Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNode()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIRST_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstNode() <em>First Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNode()
	 * @generated
	 * @ordered
	 */
	protected Object firstNode = FIRST_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKnownGroupingCriteria() <em>Known Grouping Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWN_GROUPING_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKnownGroupingCriteria() <em>Known Grouping Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected String knownGroupingCriteria = KNOWN_GROUPING_CRITERIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKnownDataFormats() <em>Known Data Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownDataFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<String> knownDataFormats;

	/**
	 * The cached value of the '{@link #getKnownTraversalCriteria() <em>Known Traversal Criteria</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownTraversalCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<String> knownTraversalCriteria;

	/**
	 * The cached value of the '{@link #getWorkflowTemplate() <em>Workflow Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowTemplate()
	 * @generated
	 * @ordered
	 */
	protected DefaultWorkflowTemplate workflowTemplate;

	/**
	 * The default value of the '{@link #getLastTasks() <em>Last Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTasks()
	 * @generated not
	 * @ordered
	 */
	protected static final Stack<Task> LAST_TASKS_EDEFAULT = new Stack<Task>();

	/**
	 * The cached value of the '{@link #getLastTasks() <em>Last Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTasks()
	 * @generated not
	 * @ordered
	 */
	protected Stack<Task> lastTasks = new Stack<Task>();//LAST_TASKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Workflow.class);

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
	 * The default value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected static final Object META_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected Object metaData = META_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultGroupingCriteria() <em>Default Grouping Criteria</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultGroupingCriteria;

	/**
	 * The cached value of the '{@link #getPreviousTaskName() <em>Previous Task Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTaskName()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> previousTaskName;

	/**
	 * The cached value of the '{@link #getGenericAttributes() <em>Generic Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> genericAttributes;

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
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected Catalog catalog;

	/**
	 * The cached value of the '{@link #getProcessingConfig() <em>Processing Config</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingConfig()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> processingConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowGraph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(EasyFlowGraph newGraph) {
		EasyFlowGraph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__GRAPH, oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFirstNode() {
		return firstNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstNode(Object newFirstNode) {
		Object oldFirstNode = firstNode;
		firstNode = newFirstNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__FIRST_NODE, oldFirstNode, firstNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKnownGroupingCriteria() {
		return knownGroupingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnownGroupingCriteria(String newKnownGroupingCriteria) {
		String oldKnownGroupingCriteria = knownGroupingCriteria;
		knownGroupingCriteria = newKnownGroupingCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__KNOWN_GROUPING_CRITERIA, oldKnownGroupingCriteria, knownGroupingCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKnownDataFormats() {
		if (knownDataFormats == null) {
			knownDataFormats = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.WORKFLOW__KNOWN_DATA_FORMATS);
		}
		return knownDataFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKnownTraversalCriteria() {
		if (knownTraversalCriteria == null) {
			knownTraversalCriteria = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.WORKFLOW__KNOWN_TRAVERSAL_CRITERIA);
		}
		return knownTraversalCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultWorkflowTemplate getWorkflowTemplate() {
		if (workflowTemplate != null && workflowTemplate.eIsProxy()) {
			InternalEObject oldWorkflowTemplate = (InternalEObject)workflowTemplate;
			workflowTemplate = (DefaultWorkflowTemplate)eResolveProxy(oldWorkflowTemplate);
			if (workflowTemplate != oldWorkflowTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__WORKFLOW_TEMPLATE, oldWorkflowTemplate, workflowTemplate));
			}
		}
		return workflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultWorkflowTemplate basicGetWorkflowTemplate() {
		return workflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflowTemplate(DefaultWorkflowTemplate newWorkflowTemplate) {
		DefaultWorkflowTemplate oldWorkflowTemplate = workflowTemplate;
		workflowTemplate = newWorkflowTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__WORKFLOW_TEMPLATE, oldWorkflowTemplate, workflowTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Stack<Task> getLastTasks() {
		return lastTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastTasks(Stack newLastTasks) {
		Stack oldLastTasks = lastTasks;
		lastTasks = newLastTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__LAST_TASKS, oldLastTasks, lastTasks));
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
	public Object getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(Object newMetaData) {
		Object oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultGroupingCriteria() {
		if (defaultGroupingCriteria == null) {
			defaultGroupingCriteria = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.WORKFLOW__DEFAULT_GROUPING_CRITERIA);
		}
		return defaultGroupingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getPreviousTaskName() {
		return previousTaskName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTaskName(Map<String, String> newPreviousTaskName) {
		Map<String, String> oldPreviousTaskName = previousTaskName;
		previousTaskName = newPreviousTaskName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__PREVIOUS_TASK_NAME, oldPreviousTaskName, previousTaskName));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Object> getGenericAttributes() {
		if (genericAttributes == null) {
			genericAttributes = new EcoreEMap<String,Object>(MapsPackage.Literals.STRING_TO_OBJECT_MAP, StringToObjectMapImpl.class, this, CorePackage.WORKFLOW__GENERIC_ATTRIBUTES);
		}
		return genericAttributes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__GRAPH_UTIL, oldGraphUtil, graphUtil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__GRAPH_UTIL, oldGraphUtil, graphUtil));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog getCatalog() {
		if (catalog != null && catalog.eIsProxy()) {
			InternalEObject oldCatalog = (InternalEObject)catalog;
			catalog = (Catalog)eResolveProxy(oldCatalog);
			if (catalog != oldCatalog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__CATALOG, oldCatalog, catalog));
			}
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog basicGetCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(Catalog newCatalog) {
		Catalog oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getProcessingConfig() {
		if (processingConfig == null) {
			processingConfig = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.WORKFLOW__PROCESSING_CONFIG);
		}
		return processingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * - read the general tools implementation xml and xsd
	 * - iterate over graph and read each tasks implementing tool by calling
	 * readImplementation() of class Tool.
	 * Tool definition is expected to be in xml.
	 * - 1. check if definition is available in general tools.xml
	 * - 2. check if <toolName>.xml exists (this definition has precedence )
	 * <!-- end-user-doc -->
	 * @generated not
	 
	public void readToolDefinitions(String basePath) {
		
		logger.debug("tool def="+getToolsDescription().toString()+
				" tool schema="+getToolsSchemaDefinition().toString());
		for (Tool tool : readToolDefinition(getToolsDescription(), getToolsSchemaDefinition()))
		{
			getTools().put(tool.getId()+"_default", tool);
		}		
		//File file = new File(createURI(basePath, "tool_definitions").toFileString());
		String fileName = getClass().getResource(basePath+"tool_definitions").toString();
		logger.debug("check dir="+fileName +" for tool definitions files...");
		File[] peers = new File(fileName).listFiles();
		
		if (peers != null)
		for (File file1 : peers)
		{
			try {
				for (Tool tool : readToolDefinition(createURI(basePath, file1.getName()), 
									getToolsSchemaDefinition()))
					getTools().put(tool.getId(), tool);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		for (Task task:getWorkflowTemplate().getTasks()) {
			logger.debug(task.getUniqueString()+": "+task.getToolNames().keySet());
			
			EList<Tool> help = new BasicEList<Tool>();
			help.addAll(getTools().values());
			task.readTools(help);
			
			logger.debug(task.getUniqueString()+": "+task.getTools().keySet());
			// assume path of tool definition files based on the task-name
			//logger.debug("check tool definition for task"+task.getUniqueString()+
				//	" URI="+createURI(basePath, task.getUniqueString())+
				//	" tools="+task.getTools().keySet());
			//for (String toolName:task.getTools().keySet())
				//tools = readToolDefinition(createURI(basePath, toolName), 
					//	getToolsSchemaDefinition());				
			
		}
		logger.debug("known tools: "+getTools().keySet());
	}

	
	
	public EList<Tool> readToolDefinition(URI xmlSource, URI xsdSource) {
		InputStream isXML=getClass().getResourceAsStream(xmlSource.toString());
		Source xmlFile = new StreamSource(isXML);
		EList<Tool> tools = new BasicEList<Tool>();
		try {
			logger.debug(xmlFile.getSystemId() + " is valid");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(getClass().getResourceAsStream(getToolsDescription().toString()));
			
			
			
		} catch (SAXException e) {
			System.out.println(xmlFile.getSystemId() + " is NOT valid");
			System.out.println("Reason: " + e.getLocalizedMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (MalformedURLException e) {
			logger.info("malformed resource string: "+xmlSource.toString());
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.info("no resource found: "+xmlSource.toString());
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}		
		return tools;
	}
	*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readWorkfowTemplate() {
		return ((EasyflowTemplateImpl) getWorkflowTemplate()).readTemplate(getMode(), 
				getDefaultGroupingCriteria());
	}

	private static void setStyleSheet(mxStylesheet stylesheet) {

        // base style
        Hashtable<String, Object> baseStyle = new Hashtable<String, Object>();
        baseStyle.put(mxConstants.STYLE_STROKECOLOR, "#FF0000");

        // custom vertex style
        Hashtable<String, Object> style = new Hashtable<String, Object>(baseStyle);
        //style.put(mxConstants.STYLE_FILLCOLOR, "#000000");
        //style.put(mxConstants.STYLE_STROKECOLOR, "#000000");
        //style.put(mxConstants.STYLE_AUTOSIZE, 1);
        style.put(mxConstants.STYLE_RESIZABLE, 0);
        stylesheet.putCellStyle("VERTEX_STYLE", style);

        // custom edge style
        Hashtable<String, Object> edgeStyle = new Hashtable<String, Object>(baseStyle);
        edgeStyle.put(mxConstants.STYLE_STROKEWIDTH, 3);
        
        stylesheet.putCellStyle("EDGE_STYLE", edgeStyle);
        
        mxDefaultTextShape textShape=new mxDefaultTextShape(){
        	public void paintShape(mxGraphics2DCanvas canvas, String text,
                    mxCellState state, Map<String, Object> style)
        	{
        		Rectangle rect = state.getLabelBounds().getRectangle();
        		Graphics2D g = canvas.getGraphics();
        	}

        };
        mxGraphics2DCanvas.putTextShape("default", textShape);
        mxIShape shape=new mxBasicShape() {
        	
        };
        
        mxGraphics2DCanvas.putShape("default", shape);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateGraphFromTemplate(EMap<String, Tool> tools) {
		
		//Iterator<Task> taskIterator=getWorkflowTemplate().getTasks().iterator();
		setStyleSheet(getGraph().getStylesheet());
		//Object parent=graph.getDefaultParent();
		Object parent = null;
		Map<String,Object> map=new HashMap<String,Object>();
		
		getGraph().getModel().beginUpdate();
		// create styles
        
        try {
        	logger.debug("got definition for tools: "+(tools!=null?tools.keySet():null));
        	for (Task task:getWorkflowTemplate().getTasks()) {
        		// try to find tool definition/implementation
        		logger.debug(task.getToolNames().keySet());
        		if (tools!=null)
        			for (String toolName:task.getToolNames().keySet())
        			{
        				logger.debug("trying to find tool implementation definition for "+toolName);
        				// if tool name is separated by ":" -> assume package:tool and parse both entities
        				String tmp[] = toolName.split(":");
        				String packageName=null;
        				if (tmp.length==2)
        				{
        					packageName=tmp[0];
        					toolName=tmp[1];
        				}
        				if (tools.containsKey(toolName))
        				{
        					Tool tool=tools.get(toolName);
        					logger.debug("add tool="+toolName);
        					if (packageName!=null)
        						if (tool.getPackage() != null && !tool.getPackage().getName().equals(packageName))
        							logger.warn("package name ("+packageName
        									+") from workflow template for task "+task.getName()
        									+" differs from tool defintion ( "+tool.getPackage().getName()+") !");
        						else if(tool.getPackage()==null)
        						{
        							easyflow.tool.Package pkg = ToolFactory.eINSTANCE.createPackage();
        							pkg.setName(toolName);
        							tool.setPackage(pkg);
        						}
        					task.getTools().put(toolName, tool);
        				}
        			}
        		
        		Object target=getGraph().insertVertexEasyFlow(parent, null, task);
        		getGraphUtil().getCells().put(task.getUniqueString(), (mxICell)target);
        		logger.trace("generateGraphFromTemplate(): "
        				+"add to cell map: key="+task.getUniqueString()
        				+" cell="+getGraph().getLabel(target));
        		map.put(task.getName(), target);
        		getGraphUtil().getTasks().put(task.getUniqueString(), task);
        		//((mxCell)target).setValue(XMLUtil.getElement(task));
        		
        		
        	}

        	// create the special root task/cell which is the root
        	// in all subsequent processed graphs, the root should link any
        	// task from the workflow template that has no incoming task
        	Task rootTask = CoreFactory.eINSTANCE.createTask();
        	rootTask.setName("_root_");
        	rootTask.setRoot(true);
        	getGraphUtil().getTasks().put(rootTask.getUniqueString(), rootTask);
        	//logger.trace("insert dedicated root cell"+" "+rootTask.getUniqueString());
        	Object rootTarget=getGraph().insertVertexEasyFlow(parent, null, rootTask);
        	getGraphUtil().getCells().put(rootTask.getUniqueString(), (mxICell)rootTarget);
        	setFirstNode(rootTarget);
        	getGraphUtil().setDefaultRootCell((mxICell) rootTarget);
        	//logger.debug(getGraph().getLabel(rootTarget));
        	

        logger.debug(getWorkflowTemplate().getTasks());
        Iterator<Task> it=getWorkflowTemplate().getTasks().iterator();
		while (it.hasNext()) {
			Task task=it.next();
			logger.debug("#######task="+task.getUniqueString()+" "+task.isUtil());
			if (!task.isUtil()) {
				Object target=getGraphUtil().getCells().get(task.getUniqueString());
				//logger.debug("determine parents for "+task.getUniqueString());
				if (getLastTasks().isEmpty()) {
					//setFirstNode(target);
					graph.insertEdgeEasyFlow(parent, null, rootTarget, target);
				
				} else {
					
					EList<Task> parentTaskList=getParentTasksFor(task);
					//if (parentTaskList.isEmpty())
						//parentTaskList.add(getLastTasks().peek());					
					for (Task pTask:parentTaskList) {
						
						Object source=map.get(pTask.getName());
						//logger.trace("generateGraphFromTemplate(): adding mxgraph edge: ("+pTask.getName()+"=>"+task.getName()+")");
						graph.insertEdgeEasyFlow(parent, null, source, target);
					}
					/*
					Iterator<DataPort> itDP=task.getInDataPorts().iterator();
					while (itDP.hasNext()) {
						DataPort dataPort=itDP.next();
						
						EList<Task> parentTaskList=new BasicEList<Task>();
						
						if (validateLastTaskOutDataPort(dataPort))
							parentTaskList.addAll(getParentTasksByOutDataPort(dataPort));
						logger.debug(parentTaskList.size());
						if (validateParentTaskOutDataPort(dataPort, task))
							if (! parentTaskList.contains(getParentTaskByOutDataPort(dataPort, task)))
								parentTaskList.add(getParentTaskByOutDataPort(dataPort, task));
								
						logger.debug(parentTaskList.size());
						if (parentTaskList.isEmpty()) {
							logger.warn("No parent found. Known parent:"+task.getParents());
						} else {
							logger.trace("generateGraphFromTemplate(): parentTaskList="+parentTaskList);
						}
						for (Task pTask:parentTaskList) {
							
							Object source=map.get(pTask.getName());
							//if (!task.getParents().contains(pTask.getName()))
								//task.getParentsString().add(pTask.getName());
							logger.trace("generateGraphFromTemplate(): adding mxgraph edge: ("
								+pTask.getName()+"=>"+task.getName()+":"+dataPort.getDataFormat().getName()+")");
							graph.insertEdgeEasyFlow(parent, null, source, target);
						}
					}*/
				}
				getLastTasks().add(task);
				//logger.debug(getWorkflowTemplate().getTasks().size()+" "+getLastTasks().size());
			}
		}
        } finally {
        	getGraph().getModel().endUpdate();
        }
        
        XMLUtil.container.put("tasks", getGraphUtil().getTasks());        
        Task tmp=XMLUtil.loadTaskFromVertex(getFirstNode());
        logger.debug("generateGraphFromTemplate(): root="+tmp.getUniqueString()+" graphsize="+getGraphUtil().getTasks().size());
        return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readMetaData() {
		/*
		 * would be best to generically pick an implementation for metadata 
		 * possible solution could be achieved using java.util.ServiceLoader
		 * 
		 * currently assume easyflow.core.IMetaData
		 */
		((IMetaData) getMetaData()).readMetaData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Task getParentTaskByOutDataPort(DataPort dataPort, Task task) {
		return task.getParentTaskByOutDataPort(dataPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<Task> getParentTasksByOutDataPort(DataPort dataPort) {
		Iterator<Task> it=getLastTasks().iterator();
		EList<Task> tasks=new BasicEList<Task>();
		logger.trace("getParentTasksByOutDataPort(): last tasks size="+getLastTasks().size());
		while (it.hasNext()) {
			Task lastTask=it.next();
			if (lastTask.isCompatibleWithInDataPortFor(dataPort)) 
				tasks.add(lastTask);
		}
		//logger.warn("No parent found for DataPort "+dataPort.getDataFormat().getName());
		return tasks;
	}
	
	public EList<Task> getParentTasksFor(Task task) {
		
		EList<Task> tasks=new BasicEList<Task>();
		
		// data structure to track not yet resolved data ports
		EList<DataPort> unresolvedDataPorts = new BasicEList<DataPort>();
		
		for (DataPort dataPort:task.getInDataPorts())
			unresolvedDataPorts.add(dataPort);
		
		logger.trace("parents so far="+task.getParents().keySet());
		for (Task parent:task.getParents().values())
		{
			boolean found=false;
			//if (parent.getOutDataPorts()!=null)
			for (DataPort outDataPort:parent.getOutDataPorts())
			{
				unresolvedDataPorts.remove(outDataPort);
				found=true;
			}
			if (found)
				tasks.add(parent);
		}

		// find possible tasks compatible with the unresolved ports
		// the tasks are to be ranked:
		// providing more ports gets higher rank
		EMap<String, EList<Task>> lastTasksByDataPort=new BasicEMap<String, EList<Task>>();
		Map<String,Integer> rankMap = new HashMap<String,Integer>();
		for (EList<DataPort> dataPorts:enumeratePowerSet(task.getInDataPorts()))
		{
			EList<Task> lastTasksForDataPort=getLastTasksForDataPort(dataPorts, getLastTasks(), tasks);
			String joinedName=joinDataPortNamesToString(dataPorts);
			if (!lastTasksForDataPort.isEmpty())
			{
				lastTasksByDataPort.put(joinedName, lastTasksForDataPort);
				rankMap.put(joinedName, dataPorts.size());
			}
		}
		
		// resolve incoming data ports for task beginning with highest rank
		// i.e. prefer constellations where more ports can be resolved by less
		// incoming tasks
		Map<String,Integer> sortedRankMap = easyflow.custom.util.Util.sortByValue(rankMap);
    	if (!unresolvedDataPorts.isEmpty())
			for (Map.Entry<String, Integer> entry : sortedRankMap.entrySet()) {
				
				EList<Task> curTasks=lastTasksByDataPort.get(entry.getKey());
				logger.trace("process lastTasks="
						+ tasks2String(curTasks)
						+ " with rank=" + entry.getValue());
				curTasks=removeParentsFromLastTasks(curTasks);
				logger.trace("lastTasks after distant parents removed="
						+ tasks2String(curTasks));

				ListIterator<Task> it = curTasks.listIterator(curTasks.size());
				while (it.hasPrevious()) {
					if (unresolvedDataPorts.isEmpty())
						break;

					Task curTask = it.previous();
					EList<DataPort> resolvedDataPorts = task
							.getOverlappingDataPorts(unresolvedDataPorts,
									curTask.getOutDataPorts());
					if (!resolvedDataPorts.isEmpty())
						tasks.add(curTask);
				}
			}
      logger.debug(tasks.size()+" parents ("+tasks2String(tasks)+") found.");
/*
		if (!unresolvedDataPorts.isEmpty())
		{
			EMap<String,Integer> rankMap = new BasicEMap<String,Integer>();
			//logger.debug(unresolvedDataPorts);
			//logger.debug(getLastTasks());
			ListIterator<Task> it=getLastTasks().listIterator(getLastTasks().size());
			while (it.hasPrevious())
			{
				
				Task tmp=it.previous();
				logger.debug("test last task="+tmp.getUniqueString());
				EList<DataPort> unresolvedOutDataPorts=
						task.getOverlappingDataPorts(unresolvedDataPorts, tmp.getOutDataPorts());
				int i=unresolvedOutDataPorts.size();
				if (i>0)
				{
					logger.debug("would insert task"+tmp.getUniqueString()+" "+getWorkflowTemplate().getTasks().size());
					insertTaskIntoParentTaskList(tmp, tasks2, i, rankMap);
				}
			}
		}
		
		
		for (String taskName:isDistantParentMap.keySet())
			logger.debug("Task="+taskName+" is distant="+isDistantParentMap.get(taskName));
		tasks.addAll(tasks2);
*/
		return tasks;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorklowForExecutionSystem() {
		Makeflow makeflow = MakeflowFactory.eINSTANCE.createMakeflow();
		return getGraphUtil().generateWorklowForExecutionSystem((mxICell) getFirstNode(), makeflow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveToolDependencies() {
		return getGraphUtil().computeToolDeps((mxICell) getFirstNode(), getCatalog());
	}

	private String tasks2String(EList<Task> tasks)
	{
		String tmp[]=new String[tasks.size()];
		
		for (int i=0; i<tmp.length; i++)
			tmp[i]=tasks.get(i).getUniqueString();
		return StringUtils.join(tmp, " ");
	}
	private void insertTaskIntoParentTaskList(Task task, 
			EList<Task> tasks, 
			int rank, EMap<String,Integer> rankMap)
	{
		Iterator<Task> it = tasks.iterator();
		int i = 0;
		while(it.hasNext())
		{
			Task tmp = it.next();
			if (rank > rankMap.get(tmp.getName()))
				break;
			i++;
		}
		tasks.add(i, task);
		rankMap.put(task.getName(), i);
	}

	private String joinDataPortNamesToString(EList<DataPort> dataPorts)
	{
		String names[]=new String[dataPorts.size()];
		
		Iterator<DataPort> it = dataPorts.iterator();
		int i=0;
		while (it.hasNext())
			names[i++]=it.next().getDataFormat().getName();
		return StringUtils.join(names, "_");
		
	}
	
	private EList<Task> getLastTasksForDataPort(EList<DataPort> dataPorts, Stack<Task> lastTasks,
			EList<Task> resolvedTasks)
	{
		EList<Task> tasks=new BasicEList<Task>();
		Iterator<Task> it = lastTasks.iterator();
		while (it.hasNext())
		{
			Task lastTask = it.next();
			EList<DataPort> overlappingDataPorts=lastTask.getOverlappingDataPorts(dataPorts, lastTask.getOutDataPorts());
			if (overlappingDataPorts.size() == dataPorts.size())
				if (resolvedTasks!=null && !resolvedTasks.contains(lastTask))
					tasks.add(lastTask);
		}
		return tasks;
	}
	
	private EList<EList<DataPort>> enumeratePowerSet(EList<DataPort> dataPorts)
	{
		EList<EList<DataPort>> powerSet=new BasicEList<EList<DataPort>>();
		int N=dataPorts.size();
		int allMasks = (1 << N);
		
		for (int i = 1; i < allMasks; i++)
		{
			EList<DataPort> subSet=new BasicEList<DataPort>();
		    for (int j = 0; j < N; j++)
		        if ((i & (1 << j)) > 0) //The j-th element is used
		        {
		           //System.out.print((j + 1) + ": "+dataPorts.get(j).getDataFormat().getName()+"; ");
		           subSet.add(dataPorts.get(j));
		        }
		    powerSet.add(subSet);
		    //System.out.println();
		}
		return powerSet;
	}
	
	private EList<Task> removeParentsFromLastTasks(EList<Task> tasks) {
		// remove those tasks that can be exchanged by a closer task.
		// (i.e. a task that is a parent of another one, providing the same
		// port)
		//EMap<String, Boolean> isDistantParentMap = new BasicEMap<String, Boolean>();
		EList<Task> newTasks=new BasicEList<Task>();
		for (Task possibleParent : tasks) {
			//logger.debug("test " + possibleParent.getUniqueString());
			boolean childFound=false;
			for (Task possibleChild : tasks)
				if (possibleChild != possibleParent)
					try {
						childFound=getGraphUtil().isChildOf(possibleChild, possibleParent);
//						isDistantParentMap.put(
	//							possibleParent.getName(),
		//						getGraphUtil().isChildOf(possibleParent,possibleChild));
					} catch (TaskToCellMapKeyNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			if (!childFound)
			{
				logger.debug("add "+possibleParent.getUniqueString());
				newTasks.add(possibleParent);
			}
		
		}
		return newTasks;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateParentTaskOutDataPort(DataPort dataPort, Task task) {
		return task.getParentTaskByOutDataPort(dataPort)!=null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateLastTaskOutDataPort(DataPort dataPort) {
		return !getParentTasksByOutDataPort(dataPort).isEmpty();
	}

	private void printGraph()
	{
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String lastParent = null;
			//String path1 = "";
			@Override
			public boolean visit(Object vertex, Object edge) {
				String path = "";
				// set the current task
				Task task = XMLUtil.loadTaskFromVertex(vertex);
				path += task.getUniqueString();
				Task parentTask = null;
				//Object parent = null;
				
				if (edge != null)
				{
					parentTask = XMLUtil.loadTaskFromVertex(getGraph().getView().getVisibleTerminal(edge, true));
					//logger.debug(lastParent+" "+parentTask.getUniqueString());
					if (lastParent != null && !parentTask.getUniqueString().equals(lastParent))
					{
						System.out.println("");
						
					}
					lastParent = task.getUniqueString();
				}
				else
					lastParent = null;
				//path += "("+(parentTask == null ? null : parentTask.getUniqueString())+")";
				
				if (getGraph().getOutgoingEdges(vertex).length > 0)
					path +="=>";
				System.out.print(path);
				return true;
			}
		};
		System.out.println("======start=======");
		System.out.println("traverse");
		getGraph().traverse(getFirstNode(), true, visitor);
		System.out.println("\ntraverse all paths");
		getGraph().traverseAllPaths(getFirstNode(), true, visitor, null);
		System.out.println("\ntraverse topological order");
		getGraph().traverseTopologicalOrder((mxICell) getFirstNode(), visitor);
		System.out.println("\n=======end========");
	}
	
	private void printAllCells(Object root) {
		logger.debug("Totalsize: "+getGraph().getVertices(root).size());
		for (Object o:getGraph().getVertices(root))
			logger.debug("label "+getGraph().getLabel(o)+" ");
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * iterate over graph and do for each defined/resolved traversal event:
	 *    - get the spanning tree (subgraph) that corresponds to the traversal event (split/merge cells)
	 *      from the still abstract tree
	 *    - applyMetadata to the traversal event (i.e. resolve the 'chunks': e.g. instances of grouping 
	 *      criterion or different strategies to enumerate the instances of the traversal criterion)
	 *    - traverse the subgraph in order to magnify according to chunks (i.e. create new subgraph and properly
	 *    	connect to parent/merge tasks); one per resolved instance of traversal criterion
	 *      
	 *  
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvents() {
		TraversalEvent traversalEvent = getGraphUtil().getNextTraversalEvent();
		while (traversalEvent != null)
		{
			logger.debug(getGraphUtil().traversalEventToString(traversalEvent)
					+" "+traversalEvent.getTraversalCriterion().getId().isEmpty());
			applyTraversalEvent(traversalEvent);
			traversalEvent = getGraphUtil().getNextTraversalEvent();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvent(TraversalEvent traversalEvent) {
		
		mxICell subGraphRoot = getGraphUtil().computeSubgraph(traversalEvent, true);
		getGraphUtil().getCurrentSubGraphs().add(subGraphRoot);
		if (subGraphRoot != null)
		{
			EList<GroupingInstance> groupingInstances;
			try {
				groupingInstances = getGraphUtil().getGroupingInstances(traversalEvent);
			if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
			{
				for (GroupingInstance groupingInstance : groupingInstances)
				{
					//String instanceStr = groupingInstance.getName();
					logger.debug("applyTraversalEvents(): applying metadata "+groupingInstance.getName()+" with features="+
							groupingInstance.getFeatures().keySet()+" for criterion="+traversalEvent.getTraversalCriterion().getId());
					
					
					mxICell copyRoot = getGraphUtil().applyTraversalEventCopyGraph(subGraphRoot, 
							traversalEvent.getTraversalCriterion().getId(), 
							groupingInstance);
		
					//logger.trace("applyTraversalEvents(): graphUtil: "+getGraphUtil().getTasks().keySet().size()+" "+getGraphUtil().getTasks().keySet());
					
					getGraphUtil().applyTraversalEvent(copyRoot, traversalEvent, 
							traversalEvent.getTraversalCriterion().getId(),
							groupingInstance.getName());
					logger.trace("applyTraversalEvents(): XMLUtil:"+((EMap<String,Task>)XMLUtil.container.get("tasks")).size()+" "+((EMap<String,Task>)XMLUtil.container.get("tasks")).keySet());
				}
			}
			else
			{
				logger.debug("applyTraversalEvents(): joint mode, "+" for criterion="+traversalEvent.getTraversalCriterion().getId());
				mxICell copyRoot = getGraphUtil().applyTraversalEventCopyGraph(subGraphRoot, 
						traversalEvent.getTraversalCriterion().getId(), 
						groupingInstances);
				logger.debug("applyTraversalEvents(): copy graph applied in joint mode.");
				getGraphUtil().applyTraversalEvent(copyRoot, traversalEvent, 
						traversalEvent.getTraversalCriterion().getId(),
						"");
				logger.debug("applyTraversalEvents(): traversals applied in joint mode.");
	
			}
			} catch (GroupingInstanceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if (getGraphUtil().getNewTraversalEvents().isEmpty())
		{
			getGraphUtil().fixOffTargetCells((mxICell) getFirstNode(), traversalEvent.getTraversalCriterion().getId());
			// clearup and reset
			for (mxICell subGraphRoot1 : getGraphUtil().getCurrentSubGraphs())
				getGraphUtil().removeSubGraph(
						subGraphRoot1, 
						traversalEvent.getTraversalCriterion().getId());
			getGraphUtil().resetFlags();
			getGraphUtil().getCurrentSubGraphs().clear();
		}

	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents() {
		
		return getGraphUtil().resolveTraversalEvents((mxICell)getFirstNode());			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean shallProcessTask(Task task) {
		EMap<String, Object> records=(EMap<String, Object>) ((EObject) getMetaData()).eGet(((EObject)getMetaData()).eClass().getEStructuralFeature("records"));
		for (String key:records.keySet()) {
			DefaultRecord defaultRecord=(DefaultRecord)records.get(key);
			if (task.shallProcess(defaultRecord.getGenericAttributes().map())) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluateJEXLString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean shallProcessTask(Task task, TraversalEvent traversalEvent) {
		EMap<String, Object> records=(EMap<String, Object>) ((EObject) getMetaData()).eGet(((EObject)getMetaData()).eClass().getEStructuralFeature("records"));
		logger.debug(task.getUniqueString()+" "+traversalEvent.getTraversalCriterion().getId());
		boolean shallProcess=false;
		for (String key:records.keySet()) {
			DefaultRecord defaultRecord=(DefaultRecord)records.get(key);
			Object o=task.evaluateJexl(traversalEvent, defaultRecord.getGenericAttributes().map());
			logger.debug(" "+o);
			
		}
		return shallProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				return ((InternalEList<?>)getGenericAttributes()).basicRemove(otherEnd, msgs);
			case CorePackage.WORKFLOW__PROCESSING_CONFIG:
				return ((InternalEList<?>)getProcessingConfig()).basicRemove(otherEnd, msgs);
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
			case CorePackage.WORKFLOW__GRAPH:
				return getGraph();
			case CorePackage.WORKFLOW__FIRST_NODE:
				return getFirstNode();
			case CorePackage.WORKFLOW__KNOWN_GROUPING_CRITERIA:
				return getKnownGroupingCriteria();
			case CorePackage.WORKFLOW__KNOWN_DATA_FORMATS:
				return getKnownDataFormats();
			case CorePackage.WORKFLOW__KNOWN_TRAVERSAL_CRITERIA:
				return getKnownTraversalCriteria();
			case CorePackage.WORKFLOW__WORKFLOW_TEMPLATE:
				if (resolve) return getWorkflowTemplate();
				return basicGetWorkflowTemplate();
			case CorePackage.WORKFLOW__LAST_TASKS:
				return getLastTasks();
			case CorePackage.WORKFLOW__LOGGER:
				return getLogger();
			case CorePackage.WORKFLOW__META_DATA:
				return getMetaData();
			case CorePackage.WORKFLOW__MODE:
				return getMode();
			case CorePackage.WORKFLOW__DEFAULT_GROUPING_CRITERIA:
				return getDefaultGroupingCriteria();
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				return getPreviousTaskName();
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				if (coreType) return getGenericAttributes();
				else return getGenericAttributes().map();
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				if (resolve) return getGraphUtil();
				return basicGetGraphUtil();
			case CorePackage.WORKFLOW__CATALOG:
				if (resolve) return getCatalog();
				return basicGetCatalog();
			case CorePackage.WORKFLOW__PROCESSING_CONFIG:
				if (coreType) return getProcessingConfig();
				else return getProcessingConfig().map();
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
			case CorePackage.WORKFLOW__GRAPH:
				setGraph((EasyFlowGraph)newValue);
				return;
			case CorePackage.WORKFLOW__FIRST_NODE:
				setFirstNode(newValue);
				return;
			case CorePackage.WORKFLOW__KNOWN_GROUPING_CRITERIA:
				setKnownGroupingCriteria((String)newValue);
				return;
			case CorePackage.WORKFLOW__KNOWN_DATA_FORMATS:
				getKnownDataFormats().clear();
				getKnownDataFormats().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.WORKFLOW__KNOWN_TRAVERSAL_CRITERIA:
				getKnownTraversalCriteria().clear();
				getKnownTraversalCriteria().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.WORKFLOW__WORKFLOW_TEMPLATE:
				setWorkflowTemplate((DefaultWorkflowTemplate)newValue);
				return;
			case CorePackage.WORKFLOW__LAST_TASKS:
				setLastTasks((Stack)newValue);
				return;
			case CorePackage.WORKFLOW__META_DATA:
				setMetaData(newValue);
				return;
			case CorePackage.WORKFLOW__MODE:
				setMode((String)newValue);
				return;
			case CorePackage.WORKFLOW__DEFAULT_GROUPING_CRITERIA:
				getDefaultGroupingCriteria().clear();
				getDefaultGroupingCriteria().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				setPreviousTaskName((Map<String, String>)newValue);
				return;
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				((EStructuralFeature.Setting)getGenericAttributes()).set(newValue);
				return;
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				setGraphUtil((Util)newValue);
				return;
			case CorePackage.WORKFLOW__CATALOG:
				setCatalog((Catalog)newValue);
				return;
			case CorePackage.WORKFLOW__PROCESSING_CONFIG:
				((EStructuralFeature.Setting)getProcessingConfig()).set(newValue);
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
			case CorePackage.WORKFLOW__GRAPH:
				setGraph(GRAPH_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__FIRST_NODE:
				setFirstNode(FIRST_NODE_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__KNOWN_GROUPING_CRITERIA:
				setKnownGroupingCriteria(KNOWN_GROUPING_CRITERIA_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__KNOWN_DATA_FORMATS:
				getKnownDataFormats().clear();
				return;
			case CorePackage.WORKFLOW__KNOWN_TRAVERSAL_CRITERIA:
				getKnownTraversalCriteria().clear();
				return;
			case CorePackage.WORKFLOW__WORKFLOW_TEMPLATE:
				setWorkflowTemplate((DefaultWorkflowTemplate)null);
				return;
			case CorePackage.WORKFLOW__LAST_TASKS:
				setLastTasks(LAST_TASKS_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__META_DATA:
				setMetaData(META_DATA_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__DEFAULT_GROUPING_CRITERIA:
				getDefaultGroupingCriteria().clear();
				return;
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				setPreviousTaskName((Map<String, String>)null);
				return;
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				getGenericAttributes().clear();
				return;
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				setGraphUtil((Util)null);
				return;
			case CorePackage.WORKFLOW__CATALOG:
				setCatalog((Catalog)null);
				return;
			case CorePackage.WORKFLOW__PROCESSING_CONFIG:
				getProcessingConfig().clear();
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
			case CorePackage.WORKFLOW__GRAPH:
				return GRAPH_EDEFAULT == null ? graph != null : !GRAPH_EDEFAULT.equals(graph);
			case CorePackage.WORKFLOW__FIRST_NODE:
				return FIRST_NODE_EDEFAULT == null ? firstNode != null : !FIRST_NODE_EDEFAULT.equals(firstNode);
			case CorePackage.WORKFLOW__KNOWN_GROUPING_CRITERIA:
				return KNOWN_GROUPING_CRITERIA_EDEFAULT == null ? knownGroupingCriteria != null : !KNOWN_GROUPING_CRITERIA_EDEFAULT.equals(knownGroupingCriteria);
			case CorePackage.WORKFLOW__KNOWN_DATA_FORMATS:
				return knownDataFormats != null && !knownDataFormats.isEmpty();
			case CorePackage.WORKFLOW__KNOWN_TRAVERSAL_CRITERIA:
				return knownTraversalCriteria != null && !knownTraversalCriteria.isEmpty();
			case CorePackage.WORKFLOW__WORKFLOW_TEMPLATE:
				return workflowTemplate != null;
			case CorePackage.WORKFLOW__LAST_TASKS:
				return LAST_TASKS_EDEFAULT == null ? lastTasks != null : !LAST_TASKS_EDEFAULT.equals(lastTasks);
			case CorePackage.WORKFLOW__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.WORKFLOW__META_DATA:
				return META_DATA_EDEFAULT == null ? metaData != null : !META_DATA_EDEFAULT.equals(metaData);
			case CorePackage.WORKFLOW__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case CorePackage.WORKFLOW__DEFAULT_GROUPING_CRITERIA:
				return defaultGroupingCriteria != null && !defaultGroupingCriteria.isEmpty();
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				return previousTaskName != null;
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				return genericAttributes != null && !genericAttributes.isEmpty();
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				return graphUtil != null;
			case CorePackage.WORKFLOW__CATALOG:
				return catalog != null;
			case CorePackage.WORKFLOW__PROCESSING_CONFIG:
				return processingConfig != null && !processingConfig.isEmpty();
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
		result.append(" (graph: ");
		result.append(graph);
		result.append(", firstNode: ");
		result.append(firstNode);
		result.append(", knownGroupingCriteria: ");
		result.append(knownGroupingCriteria);
		result.append(", knownDataFormats: ");
		result.append(knownDataFormats);
		result.append(", knownTraversalCriteria: ");
		result.append(knownTraversalCriteria);
		result.append(", lastTasks: ");
		result.append(lastTasks);
		result.append(", logger: ");
		result.append(logger);
		result.append(", metaData: ");
		result.append(metaData);
		result.append(", mode: ");
		result.append(mode);
		result.append(", defaultGroupingCriteria: ");
		result.append(defaultGroupingCriteria);
		result.append(", previousTaskName: ");
		result.append(previousTaskName);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
