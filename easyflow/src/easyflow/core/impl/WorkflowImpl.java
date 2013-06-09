/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxICell;
import com.mxgraph.shape.mxBasicShape;
import com.mxgraph.shape.mxDefaultTextShape;
import com.mxgraph.shape.mxIShape;

import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import com.mxgraph.view.mxStylesheet;
import com.mxgraph.view.mxCellState;



import easyflow.core.Command;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DataPort;
import easyflow.core.DefaultMetaData;
import easyflow.core.DefaultRecord;
import easyflow.core.GroupingInstance;
import easyflow.core.TraversalChunk;


import easyflow.core.DefaultWorkflowTemplate;


import easyflow.core.StringToToolMap;
import easyflow.core.Task;

import easyflow.core.Tool;
import easyflow.core.TraversalEvent;
import easyflow.core.Workflow;

import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.graph.jgraphx.Util;
import easyflow.custom.util.XMLUtil;
import easyflow.sequencing.MetaData;



import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.IOException;
import java.io.InputStream;

import java.util.Collection;
import java.util.HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;

import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


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
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getToolsSchemaDefinition <em>Tools Schema Definition</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getToolsDescription <em>Tools Description</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getGraphUtil <em>Graph Util</em>}</li>
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
	 * The default value of the '{@link #getToolsSchemaDefinition() <em>Tools Schema Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsSchemaDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final URI TOOLS_SCHEMA_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolsSchemaDefinition() <em>Tools Schema Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsSchemaDefinition()
	 * @generated
	 * @ordered
	 */
	protected URI toolsSchemaDefinition = TOOLS_SCHEMA_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolsDescription() <em>Tools Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsDescription()
	 * @generated
	 * @ordered
	 */
	protected static final URI TOOLS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolsDescription() <em>Tools Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolsDescription()
	 * @generated
	 * @ordered
	 */
	protected URI toolsDescription = TOOLS_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getGraphUtil() <em>Graph Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphUtil()
	 * @generated
	 * @ordered
	 */
	protected Util graphUtil;

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
			genericAttributes = new EcoreEMap<String,Object>(CorePackage.Literals.STRING_TO_OBJECT_MAP, StringToObjectMapImpl.class, this, CorePackage.WORKFLOW__GENERIC_ATTRIBUTES);
		}
		return genericAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getToolsSchemaDefinition() {
		return toolsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolsSchemaDefinition(URI newToolsSchemaDefinition) {
		URI oldToolsSchemaDefinition = toolsSchemaDefinition;
		toolsSchemaDefinition = newToolsSchemaDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__TOOLS_SCHEMA_DEFINITION, oldToolsSchemaDefinition, toolsSchemaDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getToolsDescription() {
		return toolsDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolsDescription(URI newToolsDescription) {
		URI oldToolsDescription = toolsDescription;
		toolsDescription = newToolsDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__TOOLS_DESCRIPTION, oldToolsDescription, toolsDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(CorePackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, CorePackage.WORKFLOW__TOOLS);
		}
		return tools;
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

	private static void setStyleSheet(mxGraph graph) {

        
        mxStylesheet stylesheet = graph.getStylesheet();

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
	public void generateGraphFromTemplate() {
		
		((EasyflowTemplateImpl) getWorkflowTemplate()).readTemplate(getMode(), getDefaultGroupingCriteria());
		//Iterator<Task> taskIterator=getWorkflowTemplate().getTasks().iterator();
		
		// create styles
        setStyleSheet(graph);
        
		//Object parent=graph.getDefaultParent();
		Object parent = null;
		Map<String,Object> map=new HashMap<String,Object>();
		
		graph.getModel().beginUpdate();
        try {
        	for (Task task:getWorkflowTemplate().getTasks()) {
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
        	// in all subsequent processed graphs
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
        	

        	
		//Stack<String> stack=new Stack<String>();
		for (Task task : getWorkflowTemplate().getTasks()) {
			
			//logger.debug(task.getUniqueString());
			
			if (!task.isUtil()) {
			//Object target=graph.insertVertex(parent, null, 
				//	XMLUtil.getElement(task), 400, 100, 100, 30, "ROUNDED;VERTEX_STYLE");
			//Object target=((EasyFlowGraph)graph).insertVertexEasyFlow(parent, null, task);
			Object target=getGraphUtil().getCells().get(task.getUniqueString());
			if (getLastTasks().isEmpty()) {
				//setFirstNode(target);
				graph.insertEdgeEasyFlow(parent, null, rootTarget, target);
				
			} else {
				Iterator<DataPort> itDP=task.getInDataPorts().iterator();
				while (itDP.hasNext()) {
					DataPort dataPort=itDP.next();
					EList<Task> parentTaskList=new BasicEList<Task>();
					
					if (validateLastTaskOutDataPort(dataPort)){
					
						parentTaskList.addAll(getParentTasksByOutDataPort(dataPort));
					}
					if (validateParentTaskOutDataPort(dataPort, task)) {
						if (! parentTaskList.contains(getParentTaskByOutDataPort(dataPort, task)))
							parentTaskList.add(getParentTaskByOutDataPort(dataPort, task));
					}
					
					//}
					if (parentTaskList.isEmpty()) {
						//parentTask=getTasks().get("Root");
						logger.warn("No parent found."+" known parent:"+task.getParents());
					} else {
						logger.trace("generateGraphFromTemplate(): parentTaskList="+parentTaskList);
					}
					for (Task pTask:parentTaskList) {
						
						Object source=map.get(pTask.getName());
						//if (!task.getParents().contains(pTask.getName()))
							//task.getParentsString().add(pTask.getName());
						logger.trace("generateGraphFromTemplate(): "+
								"adding mxgraph edge:"+
								//source+"=>"+target+
								" ("+pTask.getName()+"=>"+task.getName()+":"+dataPort.getDataFormat().getName()+")");
						graph.insertEdgeEasyFlow(parent, null, source, target);
						//reset the vertex value
					}
					//((mxCell)target).setValue(XMLUtil.getElement(task));
				}
			}
			}
			//if (!task.getParents().isEmpty())
				//logger.debug(task.getName()+"->"+task.getParents().get(0)+" ("+task.getParents().size()+")");
			getLastTasks().add(task);
		}
        } finally {
            graph.getModel().endUpdate();
        }
        
        XMLUtil.container.put("tasks", getGraphUtil().getTasks());
        
        //mxICell tmpMX=(mxICell)getFirstNode();
        //XMLUtil.printMxCell(tmpMX);
        //XMLUtil.printMxCell((mxICell) getGraphUtil().getCells().values().toArray()[1]);
        Task tmp=XMLUtil.loadTaskFromVertex(getFirstNode());
        logger.debug("generateGraphFromTemplate(): root="+tmp.getUniqueString()+" graphsize="+getGraphUtil().getTasks().size());
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
	 */
	public void readTaskImplementation() {
		
		InputStream isXML=getClass().getResourceAsStream(getToolsDescription().toFileString());
		InputStream isXSD=getClass().getResourceAsStream(getToolsSchemaDefinition().toFileString());
		Source schemaFile=new StreamSource(isXSD);
		Source xmlFile = new StreamSource(isXML);
		SchemaFactory schemaFactory = SchemaFactory
			    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema;
		try {
			schema = schemaFactory.newSchema(schemaFile);
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
			System.out.println(xmlFile.getSystemId() + " is valid");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(getClass().getResourceAsStream(getToolsDescription().toFileString()));
			for (int i=0; i<doc.getDocumentElement().getChildNodes().getLength(); i++) {
				Node node=doc.getDocumentElement().getChildNodes().item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					logger.debug(node.getNodeName()+" "+node.getNodeValue()
							+" "+node.getNodeType()+" "+(Element) node
							+" "+((Element) node).getChildNodes().item(1)
							+" "+((Element) node).getAttributes().item(0)
							+" "+(Element) node
							);
					logger.debug(Element.class);
					Tool tool=CoreFactory.eINSTANCE.createTool();
					tool.readImplementation((Element) node);
				}
			}
			
			
		} catch (SAXException e) {
			System.out.println(xmlFile.getSystemId() + " is NOT valid");
			System.out.println("Reason: " + e.getLocalizedMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
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
		 * currently assume easyflow.core.DefaultMetaData
		 */
		logger.trace("readMetaData(): filename="+((DefaultMetaData) getMetaData()).getFileName());
		((DefaultMetaData) getMetaData()).readMetaData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void readProjectMetaData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			if (lastTask.isCompatibleWithInDataPortFor(dataPort)) tasks.add(lastTask);
		}
		
		//logger.warn("No parent found for DataPort "+dataPort.getDataFormat().getName());
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateParentTaskOutDataPort(DataPort dataPort, Task task) {
		return (task.getParentTaskByOutDataPort(dataPort)!=null) ? true:false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateLastTaskOutDataPort(DataPort dataPort) {
		return (!getParentTasksByOutDataPort(dataPort).isEmpty()) ? true:false;
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
	
	private String traversalEventToString(TraversalEvent traversalEvent) {
		String parentTasks="(";
		for (Task parentTask : traversalEvent.getParentTask()) {
			parentTasks+=parentTask.getUniqueString()+" ";
		}
		parentTasks+=")";
		String mergeTasks="(";
		for (Task mergeTask : traversalEvent.getMergeTask()) {
			mergeTasks+=mergeTask.getUniqueString()+" ";
		}
		
		mergeTasks+=")";

		return "applyTraversalEvents(): "
				+traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="+parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="+mergeTasks
				+" #instances="+((DefaultMetaData)getMetaData()).getGroupingInstances().get(traversalEvent.getTraversalCriterion().getId()).getInstances().size()
				;
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
		
		//mxICell rootCell = (mxICell) getFirstNode();
		for (TraversalEvent traversalEventTmp : getGraphUtil().getTraversalEvents(
				(mxICell) getFirstNode(), true))
		{	
			printGraph();
			logger.debug(traversalEventToString(traversalEventTmp));
///*
			EList<mxICell> subGraphList = new BasicEList<mxICell>();
			for (TraversalEvent traversalEvent : getGraphUtil().getNewTraversalEvents(
					traversalEventTmp, 
					(mxICell) getFirstNode()))
			{
				logger.debug(traversalEventToString(traversalEvent));
				//traversalEvent = getGraphUtil().getNewTraversalEvent(traversalEvent,(mxICell) getFirstNode()));
				
				// update traversalEvents with respect to parent, splitting and merging task
				// (they might have became outdated due to a previously applied traversal event)
				//getGraphUtil().updateTraversalEvent(traversalEvent);
				//logger.trace("applyTraversalEvents(): graphUtil: "+getGraphUtil().getTasks().keySet().size()+" "+getGraphUtil().getTasks().keySet());
				mxICell subGraphRoot = getGraphUtil().computeSubgraph(traversalEvent, true);
				subGraphList.add(subGraphRoot);
				if (subGraphRoot != null)
				{
				EList<GroupingInstance> groupingInstances = getGraphUtil().getGroupingInstances(traversalEvent);
				if (traversalEvent.getTraversalCriterion().getMode().equals("batch"))
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
				}
				
			}
			for (mxICell subGraphRoot : subGraphList)
				// remove deprecated cells (from both: graph and graph/cell map)
				getGraphUtil().removeSubGraph(subGraphRoot, traversalEventTmp.getTraversalCriterion().getId());

			// logger.debug(getGraph().getVertices(root).size());
			getGraphUtil().resetFlags();

 //*/
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvent(Task task, TraversalEvent traversalEvent, String parentToFix) {
		
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents() {
		
		//EList<TraversalEvent> traversalEvents=new BasicEList<TraversalEvent>();
		//mxCell lastCell=null;
		
		return getGraphUtil().resolveTraversalEvents((mxICell)getFirstNode());
			
		//getGraph().traverse_iterativeBreadthFirstSearch((mxICell)getFirstNode());
			
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
			case CorePackage.WORKFLOW__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case CorePackage.WORKFLOW__TOOLS_SCHEMA_DEFINITION:
				return getToolsSchemaDefinition();
			case CorePackage.WORKFLOW__TOOLS_DESCRIPTION:
				return getToolsDescription();
			case CorePackage.WORKFLOW__TOOLS:
				if (coreType) return getTools();
				else return getTools().map();
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				if (resolve) return getGraphUtil();
				return basicGetGraphUtil();
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
			case CorePackage.WORKFLOW__TOOLS_SCHEMA_DEFINITION:
				setToolsSchemaDefinition((URI)newValue);
				return;
			case CorePackage.WORKFLOW__TOOLS_DESCRIPTION:
				setToolsDescription((URI)newValue);
				return;
			case CorePackage.WORKFLOW__TOOLS:
				((EStructuralFeature.Setting)getTools()).set(newValue);
				return;
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				setGraphUtil((Util)newValue);
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
			case CorePackage.WORKFLOW__TOOLS_SCHEMA_DEFINITION:
				setToolsSchemaDefinition(TOOLS_SCHEMA_DEFINITION_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__TOOLS_DESCRIPTION:
				setToolsDescription(TOOLS_DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__TOOLS:
				getTools().clear();
				return;
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				setGraphUtil((Util)null);
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
			case CorePackage.WORKFLOW__TOOLS_SCHEMA_DEFINITION:
				return TOOLS_SCHEMA_DEFINITION_EDEFAULT == null ? toolsSchemaDefinition != null : !TOOLS_SCHEMA_DEFINITION_EDEFAULT.equals(toolsSchemaDefinition);
			case CorePackage.WORKFLOW__TOOLS_DESCRIPTION:
				return TOOLS_DESCRIPTION_EDEFAULT == null ? toolsDescription != null : !TOOLS_DESCRIPTION_EDEFAULT.equals(toolsDescription);
			case CorePackage.WORKFLOW__TOOLS:
				return tools != null && !tools.isEmpty();
			case CorePackage.WORKFLOW__GRAPH_UTIL:
				return graphUtil != null;
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
		result.append(", toolsSchemaDefinition: ");
		result.append(toolsSchemaDefinition);
		result.append(", toolsDescription: ");
		result.append(toolsDescription);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
