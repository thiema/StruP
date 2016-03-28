package easyflow.core.impl;

import easyflow.core.Catalog;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.util.Category;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.EasyflowTemplate;
import easyflow.core.ParentTaskResult;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.util.Severity;
import easyflow.core.Task;
import easyflow.core.Workflow;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.EasyFlowOverallWorker;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.data.Data;
import easyflow.data.DataFactory;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.execution.IExecutionSystem;
import easyflow.graph.jgraphx.Graph;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GraphUtil;
import easyflow.custom.util.Util;
import easyflow.tool.Rule;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.IMetaData;
import easyflow.tool.Command;
import easyflow.tool.InOutParameter;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;
import easyflow.traversal.TraversalEvent;
import easyflow.util.LogMessage;
import easyflow.util.ReturnValue;
import easyflow.util.UtilFactory;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToBooleanMapImpl;
import easyflow.util.maps.impl.StringToObjectMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getRootTask <em>Root Task</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getStaticTasks <em>Static Tasks</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getProcessedStates <em>Processed States</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getPreviousTaskName <em>Previous Task Name</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getWorker <em>Worker</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getExecutionSystem <em>Execution System</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getCurrentRule <em>Current Rule</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getJgraph <em>Jgraph</em>}</li>
 *   <li>{@link easyflow.core.impl.WorkflowImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	
	protected static int totSteps = 5;
	/**
	 * The default value of the '{@link #getGraph() <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated not
	 * @ordered
	 */
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
	 * The cached value of the '{@link #getGenericAttributes() <em>Generic Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> genericAttributes;

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
	 * The cached value of the '{@link #getRootTask() <em>Root Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTask()
	 * @generated
	 * @ordered
	 */
	protected Task rootTask;

	/**
	 * The cached value of the '{@link #getStaticTasks() <em>Static Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> staticTasks;

	/**
	 * The cached value of the '{@link #getProcessedStates() <em>Processed States</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedStates()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Boolean> processedStates;

	/**
	 * The cached value of the '{@link #getPreviousTaskName() <em>Previous Task Name</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTaskName()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> previousTaskName;

	/**
	 * The default value of the '{@link #getWorker() <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected static final EasyFlowOverallWorker WORKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorker() <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected EasyFlowOverallWorker worker = WORKER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutionSystem() <em>Execution System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionSystem()
	 * @generated
	 * @ordered
	 */
	protected IExecutionSystem executionSystem;

	/**
	 * The cached value of the '{@link #getCurrentRule() <em>Current Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRule()
	 * @generated
	 * @ordered
	 */
	protected Rule currentRule;

	/**
	 * The cached value of the '{@link #getJgraph() <em>Jgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJgraph()
	 * @generated
	 * @ordered
	 */
	protected Graph jgraph;

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
	public EMap<String, String> getPreviousTaskName() {
		if (previousTaskName == null) {
			previousTaskName = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.WORKFLOW__PREVIOUS_TASK_NAME);
		}
		return previousTaskName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowOverallWorker getWorker() {
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorker(EasyFlowOverallWorker newWorker) {
		EasyFlowOverallWorker oldWorker = worker;
		worker = newWorker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__WORKER, oldWorker, worker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExecutionSystem getExecutionSystem() {
		if (executionSystem != null && executionSystem.eIsProxy()) {
			InternalEObject oldExecutionSystem = (InternalEObject)executionSystem;
			executionSystem = (IExecutionSystem)eResolveProxy(oldExecutionSystem);
			if (executionSystem != oldExecutionSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__EXECUTION_SYSTEM, oldExecutionSystem, executionSystem));
			}
		}
		return executionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExecutionSystem basicGetExecutionSystem() {
		return executionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionSystem(IExecutionSystem newExecutionSystem) {
		IExecutionSystem oldExecutionSystem = executionSystem;
		executionSystem = newExecutionSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__EXECUTION_SYSTEM, oldExecutionSystem, executionSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getCurrentRule() {
		if (currentRule != null && currentRule.eIsProxy()) {
			InternalEObject oldCurrentRule = (InternalEObject)currentRule;
			currentRule = (Rule)eResolveProxy(oldCurrentRule);
			if (currentRule != oldCurrentRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__CURRENT_RULE, oldCurrentRule, currentRule));
			}
		}
		return currentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetCurrentRule() {
		return currentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRule(Rule newCurrentRule) {
		Rule oldCurrentRule = currentRule;
		currentRule = newCurrentRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__CURRENT_RULE, oldCurrentRule, currentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getJgraph() {
		if (jgraph != null && jgraph.eIsProxy()) {
			InternalEObject oldJgraph = (InternalEObject)jgraph;
			jgraph = (Graph)eResolveProxy(oldJgraph);
			if (jgraph != oldJgraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__JGRAPH, oldJgraph, jgraph));
			}
		}
		return jgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetJgraph() {
		return jgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJgraph(Graph newJgraph) {
		Graph oldJgraph = jgraph;
		jgraph = newJgraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__JGRAPH, oldJgraph, jgraph));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__LOG_MESSAGE, oldLogMessage, logMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__LOG_MESSAGE, oldLogMessage, logMessage));
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
	public Task getRootTask() {
		if (rootTask != null && rootTask.eIsProxy()) {
			InternalEObject oldRootTask = (InternalEObject)rootTask;
			rootTask = (Task)eResolveProxy(oldRootTask);
			if (rootTask != oldRootTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.WORKFLOW__ROOT_TASK, oldRootTask, rootTask));
			}
		}
		return rootTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetRootTask() {
		return rootTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootTask(Task newRootTask) {
		Task oldRootTask = rootTask;
		rootTask = newRootTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.WORKFLOW__ROOT_TASK, oldRootTask, rootTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getStaticTasks() {
		if (staticTasks == null) {
			staticTasks = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.WORKFLOW__STATIC_TASKS);
		}
		return staticTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Boolean> getProcessedStates() {
		if (processedStates == null) {
			processedStates = new EcoreEMap<String,Boolean>(MapsPackage.Literals.STRING_TO_BOOLEAN_MAP, StringToBooleanMapImpl.class, this, CorePackage.WORKFLOW__PROCESSED_STATES);
		}
		return processedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void init()
	{
		getProcessedStates().put(GlobalConstants.ABSTRACT_NODES_RESOLVED, false);
		getProcessedStates().put(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED, false);
		getProcessedStates().put(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED, false);
		getProcessedStates().put(GlobalConstants.GROUPING_APPLIED, false);
		getProcessedStates().put(GlobalConstants.PARAMETER_APPLIED, false);
		getProcessedStates().put(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED, false);
		getProcessedStates().put(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED, false);
		getProcessedStates().put(GlobalConstants.TOOL_DEPS_RESOLVED, false);
		getProcessedStates().put(GlobalConstants.EXEC_WORKFLOW_GENERATED, false);
		
		setCurrentRule(ToolFactory.eINSTANCE.createRule());
		initLogMessage();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String renderToString() {
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
			setLogMessage(UtilFactory.eINSTANCE.createLogMessage());
			getLogMessage().setCategory(Category.WORKFLOW);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean delete() {
		boolean rc = true;
		
		getGraph().getModel().beginUpdate();
		try
		{
			//graph.removeCells(cells, true);
			Object[] cells=getGraph().removeCells(GlobalVar.getCells().keySet().toArray(), true);
			logger.debug("removed "+cells.length+ " cells.");
			//graph.getView().clear(defaultProject.getActiveWorkflow().getFirstNode(), true, true);
			getGraph().removeCells(getGraph().getChildVertices(graph.getDefaultParent()));
			getGraph().removeCells(GlobalVar.getUtilityTaskCells().toArray());
		}
		finally
		{
			GlobalVar.getCells().clear();
			GlobalVar.getTasks().clear();
			GlobalVar.getUtilityTaskCells().clear();
//			GlobalVar.setDefaultRootCell(null);
			GlobalVar.setMetaData(null);
			GlobalVar.getUtilityTasks().clear();
			GlobalVar.getUtilityTaskCells().clear();
			
			getJgraph().clear();
			if (getWorker() != null && getWorker().getComposeWorkflowPanel() != null)
			{
				getWorker().getComposeWorkflowPanel().getTextAreaTaskProgress().setText("");
			}
		}
		
		getGraph().getModel().endUpdate();
		GlobalConfig.getTools().clear();
		getLastTasks().clear();
		setFirstNode(null);
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resetWorkflowStep() {
		boolean rc = true;
		
		getProcessedStates().clear();		
		return rc;
	}

	
	public String getCurWorkflowStep()
	{
		if (getProcessedStates().containsKey(GlobalConstants.EXEC_WORKFLOW_GENERATED) && 
				getProcessedStates().get(GlobalConstants.EXEC_WORKFLOW_GENERATED))
			return GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW;
		else if (getProcessedStates().containsKey(GlobalConstants.TOOL_DEPS_RESOLVED) && 
				getProcessedStates().get(GlobalConstants.TOOL_DEPS_RESOLVED))
			return GlobalConstants.RESOLVE_TOOL_DEPS;
		else if (getProcessedStates().containsKey(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED) && 
				getProcessedStates().get(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED))
			return GlobalConstants.RESOLVE_PREPROCESSING_TASKS;
		else if (getProcessedStates().containsKey(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED) && 
				getProcessedStates().get(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED))
			return GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS;
		else if (getProcessedStates().containsKey(GlobalConstants.GROUPING_APPLIED) &&
				getProcessedStates().get(GlobalConstants.GROUPING_APPLIED))
			return GlobalConstants.APPLY_GROUPINGS;
		else if (getProcessedStates().containsKey(GlobalConstants.PARAMETER_APPLIED) &&
				getProcessedStates().get(GlobalConstants.PARAMETER_APPLIED))
			return GlobalConstants.APPLY_PARAMETERS;
		else if (getProcessedStates().containsKey(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED) &&
				getProcessedStates().get(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED))
			return GlobalConstants.RESOLVE_TRAVERSAL_EVENTS;
		else if (getProcessedStates().containsKey(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED) &&
				getProcessedStates().get(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED))
			return GlobalConstants.GENERATE_ABSTRACT_WORKFLOW;
		//else if (getProcessedStates().containsKey(GlobalConstants.FINISHED) &&
			//	getProcessedStates().get(GlobalConstants.FINISHED))
			//return GlobalConstants.FINISHED;
		else
			return GlobalConstants.START;
	}
	

	
	public String getNextWorkflowStep()
	{
		if (getProcessedStates().containsKey(GlobalConstants.EXEC_WORKFLOW_GENERATED) && 
				getProcessedStates().get(GlobalConstants.EXEC_WORKFLOW_GENERATED))
			return GlobalConstants.FINISHED;
		else if (getProcessedStates().containsKey(GlobalConstants.TOOL_DEPS_RESOLVED) && 
				getProcessedStates().get(GlobalConstants.TOOL_DEPS_RESOLVED))
			return GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW;
		else if (getProcessedStates().containsKey(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED) && 
				getProcessedStates().get(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED))
			return GlobalConstants.RESOLVE_TOOL_DEPS;
		else if (getProcessedStates().containsKey(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED) && 
				getProcessedStates().get(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED))
			return GlobalConstants.RESOLVE_PREPROCESSING_TASKS;
		else if (getProcessedStates().containsKey(GlobalConstants.GROUPING_APPLIED) &&
				getProcessedStates().get(GlobalConstants.GROUPING_APPLIED))
			return GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS;
		else if (getProcessedStates().containsKey(GlobalConstants.PARAMETER_APPLIED) &&
				getProcessedStates().get(GlobalConstants.PARAMETER_APPLIED))
			return GlobalConstants.APPLY_GROUPINGS;
		else if (getProcessedStates().containsKey(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED) &&
				getProcessedStates().get(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED))
			return GlobalConstants.APPLY_PARAMETERS;
		else if (getProcessedStates().containsKey(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED) &&
				getProcessedStates().get(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED))
			return GlobalConstants.RESOLVE_TRAVERSAL_EVENTS;
		//else if (getProcessedStates().containsKey(GlobalConstants.FINISHED) &&
				//getProcessedStates().get(GlobalConstants.FINISHED))
			//return GlobalConstants.
		else
			return GlobalConstants.GENERATE_ABSTRACT_WORKFLOW;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws CellNotFoundException 
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws UtilityTaskNotFoundException 
	 * @throws ToolNotFoundException 
	 * @throws DataPortNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public int runNextWorkflowStep() {
		
		if (getNextWorkflowStep().equals(GlobalConstants.START) || 
				getNextWorkflowStep().equals(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW))
			return generateAbstractWorkflow()     ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.RESOLVE_TRAVERSAL_EVENTS))
			return resolveTraversalEvents()       ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.APPLY_PARAMETERS))
			return applyParameterCriteria()       ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.APPLY_GROUPINGS))
			return applyGroupingCriteria()        ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS))
			return resolveIncompatibleGroupings() ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS) || 
				getNextWorkflowStep().equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS))
			return resolveIncompatibleGroupings()     ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.RESOLVE_PREPROCESSING_TASKS) || 
				getNextWorkflowStep().equals(GlobalConstants.RESOLVE_PREPROCESSING_TASKS))
			return resolvePreprocessingTasks()     ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.RESOLVE_TOOL_DEPS) || 
				getNextWorkflowStep().equals(GlobalConstants.RESOLVE_TOOL_DEPS))
			return resolveToolDependencies()     ?  0:1;
		else if (getNextWorkflowStep().equals(GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW) || 
				getNextWorkflowStep().equals(GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW))
			return generateWorklowForExecutionSystem()?  0:1;
		return 2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int runPrevWorkflowStep() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws CellNotFoundException 
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws UtilityTaskNotFoundException 
	 * @throws ToolNotFoundException 
	 * @throws DataPortNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public int runEntireWorkflow() {
		int rc = 0;
		if (getNextWorkflowStep().equals(GlobalConstants.START) || 
				getNextWorkflowStep().equals(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW))
			rc = generateAbstractWorkflow()     ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.RESOLVE_TRAVERSAL_EVENTS))
			rc = resolveTraversalEvents()       ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.APPLY_PARAMETERS))
			rc = applyParameterCriteria()       ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.APPLY_GROUPINGS))
			rc = applyGroupingCriteria()        ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS))
			rc = resolveIncompatibleGroupings() ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.RESOLVE_PREPROCESSING_TASKS))
			rc = resolvePreprocessingTasks() ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.RESOLVE_TOOL_DEPS))
			rc = resolveToolDependencies() ? 0:1;
		if (rc == 0 && getNextWorkflowStep().equals(GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW))
			rc = generateWorklowForExecutionSystem() ? 0:1;


		if (getNextWorkflowStep().equals(GlobalConstants.FINISHED))
			return 0;
		return rc;
 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean hasNextWorkflowStep() {
		return !(getNextWorkflowStep().equals(GlobalConstants.FINISHED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getWorkflowStepLabelFor(String step) {
		
		if (step == null)
			step = getCurWorkflowStep();
		
		if (step.equals(GlobalConstants.FINISHED))
			return GlobalConstants.FINISHED_LABEL;
		else if (step.equals(GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW))
			return GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW_LABEL;
		else if (step.equals(GlobalConstants.RESOLVE_TOOL_DEPS))
			return GlobalConstants.RESOLVE_TOOL_DEPS;
		else if (step.equals(GlobalConstants.RESOLVE_PREPROCESSING_TASKS))
			return GlobalConstants.RESOLVE_PREPROCESSING_TASKS_LABEL;
		else if (step.equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS))
			return GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS_LABEL;
		else if (step.equals(GlobalConstants.APPLY_PARAMETERS))
			return GlobalConstants.APPLY_PARAMETER_LABEL;
		else if (step.equals(GlobalConstants.APPLY_GROUPINGS))
			return GlobalConstants.APPLY_GROUPING_LABEL;
		else if (step.equals(GlobalConstants.RESOLVE_TRAVERSAL_EVENTS))
			return GlobalConstants.RESOLVE_TRAVERSAL_EVENTS_LABEL;
		else if (step.equals(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW))
			return GlobalConstants.GENERATE_ABSTRACT_GRAPH_LABEL;
		else if (step.equals(GlobalConstants.START))
			return GlobalConstants.START_LABEL;
		return "Unkown";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getWorkflowStepDescFor(String step) {
		if (step==null)
			step=getCurWorkflowStep();
		if (step.equals(GlobalConstants.FINISHED))
			return GlobalConstants.FINISHED_DESCRIPTION;
		else if (step.equals(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS))
			return GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS_DESCRIPTION;
		else if (step.equals(GlobalConstants.APPLY_PARAMETERS))
			return GlobalConstants.APPLY_PARAMETER_DESCRIPTION;
		else if (step.equals(GlobalConstants.APPLY_GROUPINGS))
			return GlobalConstants.APPLY_GROUPING_DESCRIPTION;
		else if (step.equals(GlobalConstants.RESOLVE_TRAVERSAL_EVENTS))
			return GlobalConstants.RESOLVE_TRAVERSAL_EVENTS_DESCRIPTION;
		else if (step.equals(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW))
			return GlobalConstants.GENERATE_ABSTRACT_GRAPH_DESCRIPTION;
		else if (step.equals(GlobalConstants.START))
			return GlobalConstants.START_DESCRIPTION;
		return "Unkown";

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getNumberOfCurrentWorkflowStep() {
		//String step=getCurWorkflowStep();
		int curStep=0;
		if (getProcessedStates().containsKey(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED) && 
				getProcessedStates().get(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED))
			curStep++;
		if (getProcessedStates().containsKey(GlobalConstants.GROUPING_APPLIED) &&
				getProcessedStates().get(GlobalConstants.GROUPING_APPLIED))
			curStep++;
		if (getProcessedStates().containsKey(GlobalConstants.PARAMETER_APPLIED) &&
				getProcessedStates().get(GlobalConstants.PARAMETER_APPLIED))
			curStep++;
		if (getProcessedStates().containsKey(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED) &&
				getProcessedStates().get(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED))
			curStep++;
		if (getProcessedStates().containsKey(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED) &&
				getProcessedStates().get(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED))
			curStep++;
		//else if (getProcessedStates().containsKey(GlobalConstants.FINISHED) &&
			//	getProcessedStates().get(GlobalConstants.FINISHED))
			//curStep++;
		return curStep;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getTotalNumberOfWorkflowSteps() {
		return totSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * find utility task by evaluating tasks analysisTypes attribute
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Task findUtilityTaskForAnalysisType(String analysisType, DataPort dataPortIn, DataPort dataPortOut) {
		
		Task utilityTask=null;
		for (Task task:getStaticTasks())
			if ((dataPortIn == null || task.isCompatibleWithInDataPortFor(dataPortIn)) 
					&& (dataPortOut == null || task.isCompatibleWithOutDataPortFor(dataPortOut))
					&& task.getAnalysisTypes().contains(analysisType))
			{
				utilityTask=task;
			}
		return utilityTask;
	}
	
	public boolean registerUtilityTasks()
	{
		boolean rc = true;
		
		
		/*
    	// filter and merge must be defined, when PreprocessingTasks of Type 1 (grouping data dependent) should be resolved.
    	String utilityTasks[] = {"filter", "merge", "index", "sort", "view"};
    	Task utilTask = null;
		for (String utility : utilityTasks)
		{
			utilTask = findUtilityTaskForAnalysisType(utility, null, null);
			if (utilTask != null)
			{	
				for (Entry<DataPort, DataPort> e : utilTask.getValidInOutDataPortCombinations())
				{
				
					getGraphUtil().getUtilityTasks().put(e.getKey().getName()
							+"_"+e.getValue().getName()
							+"_"+utility, utilTask);
				}
			}
			else
				logger.error("generateAbstractWorkflow(): no utility task found for utility="+utility);
		}
*/
		for (Task utilTask : getStaticTasks())
		{
			for (Entry<String, String> e : ((TaskImpl)utilTask).getValidInOutDataPortCombinations())
			{
				for (String analysisType : utilTask.getAnalysisTypes())
				{
					String combi = e.getKey()+"_"+e.getValue();
					GlobalVar.getUtilityTasks().put(
							combi+"_"+analysisType, utilTask);
					logger.debug("registerUtilityTasks(): utility task "+analysisType
							+" for combination="+combi
							+" (task "+combi+"_"+analysisType+" added)");
				}
			}
		}
		
		// add the "input"-splitting task, which actually doesnt do anything
		Task dummyTask = CoreFactory.eINSTANCE.createTask();
		dummyTask.initLogMessage();
		dummyTask.setUtil(true);
		GlobalVar.getUtilityTasks().put(GlobalConstants.METADATA_INPUT, dummyTask);
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readWorkfowTemplate() {
		
		EasyflowTemplate eTpl = (EasyflowTemplate) getWorkflowTemplate();
		logger.debug("readWorkfowTemplate(): read workflow template using defaults: mode="+getMode()+" grouping="+getDefaultGroupingCriteria());
			
		boolean rc = eTpl.readTemplate(getMode(), 
				getDefaultGroupingCriteria());
		
		if (rc)
			for (Task t:eTpl.getTasks())
				if (GlobalConstants.ROOT_TASK_NAME.equals(t.getName()))
				{
					setRootTask(t);
					logger.debug("readWorkfowTemplate(): rootTask="+t.getDetailedString());
				}
		
		return rc;
	}
	
	public void printWorkflowStepMsgOnStart(String step)
	{
		if (getWorker() != null && getWorker().getInformable() != null)
		{
			String curstep = getWorkflowStepLabelFor(getNextWorkflowStep());
			if (step != null)
				curstep = getWorkflowStepLabelFor(step);
			//getWorker().getInformable().messageChanged(curstep+" (started)");
		}
	}
	
	public void printWorkflowStepMsgOnEnd(boolean rc, String step, String errorMsg, String helpMsg)
	{
		if (getWorker() != null && getWorker().getInformable() != null)
		{
			String curstep = getCurWorkflowStep();
			if (step != null)
				curstep = getWorkflowStepLabelFor(step);
			//String msg=curstep+" (ended with result: "+(rc ? "OK" : "Error")+")";
			String msg = curstep+": OK";
			if (!rc)
				msg = curstep+": Failed.";
			getWorker().getInformable().messageChanged(msg);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateAbstractWorkflow() {

		
		//Testing... how the graph is displayed
		//Adds cells to the model in a single step
		logger.debug(GlobalVar.getGraph()+" "+graph);
		graph=GlobalVar.getGraph();
		/*
		graph.getModel().beginUpdate();
		try
		{
		   Object v1 = graph.insertVertex(getJgraph().getDefaultRootCell(), null, "Hello,", 20, 200, 80, 30);
		   Object v2 = graph.insertVertex(graph.getDefaultParent(), null, "World!", 200, 250, 80, 30);
		   Object e1 = graph.insertEdge(graph.getDefaultParent(), null, "", v1, v2);
		}
		finally
		{
		   // Updates the display
		   graph.getModel().endUpdate();
		}
		//mxGraphComponent graphComponent = new mxGraphComponent(graph);
		//getContentPane().add(graphComponent);
		return false;
		*/
		
		//printWorkflowStepMsgOnStart(GlobalConstants.GENERATE_ABSTRACT_WORKFLOW);
		getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_NUM_TOOLS_AVAILABLE_1, 
				Severity.DEBUG, Integer.toString(GlobalConfig.getTools().size()));

    	int res = generateGraphFromTemplate(GlobalConfig.getTools());

    	if (res > 0)
    	{
    		registerUtilityTasks();
    		//printGraph();
    		res = generateAbstractGraphEdges();
    		//printGraph();
/*
	        Task tmp;
			try {
				tmp = JGraphXUtil.loadTask(getFirstNode());
				logger.debug("generateAbstractWorkflow(): root="+tmp.getDetailedString()
						+" graphsize="+GlobalVar.getTasks().size());
			} catch (TaskNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
    	}
    	
    	printWorkflowStepMsgOnEnd(res > 0, 
    			GlobalConstants.GENERATE_ABSTRACT_WORKFLOW, 
    			getLogMessage().getLogMsg(),
    			getLogMessage().getHelpMsg());
    	
    	return res > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int generateGraphFromTemplate(EMap<String, Tool> tools) {
		
		int res = 0;
		getGraph().getModel().beginUpdate();
		
		logger.debug("generateGraphFromTemplate(): got definition for tools: "+(tools!=null?tools.keySet():null));
		
        try {

        	// iterate through tasks and do for each task:
        	//  -associate tools and validate them (if available)
        	//	-create a corresponding vertex in the graph
        	for (Task task : getWorkflowTemplate().getTasks()) {
        		// try to find tool definition/implementation
        		logger.debug("generateGraphFromTemplate(): check tool definitions for task="+task.getUniqueString());
        		if (tools!=null)
        			for (String toolName:task.getToolNames().keySet())
        			{
        				logger.trace("generateGraphFromTemplate(): trying to find tool implementation definition for "+toolName);
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
        					if (packageName!=null)
        						if (tool.getPackage() != null && !tool.getPackage().getName().equals(packageName))
        						{
        							logger.warn("generateGraphFromTemplate(): package name ("+packageName
        									+") from workflow template for task "+task.getName()
        									+" differs from tool defintion ( "+tool.getPackage().getName()+") !");
                					getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_TOOL_DEFINITION_PKG_NAME_DOES_NOT_MATCH_NAME_IN_WORKFLOW_4, Severity.WARN,
                							Util.generateStringList(tool.getPackage().getName(), tool.getName(), packageName, task.getUniqueString()));
        							
        						}
        						else if(tool.getPackage()==null)
        						{
        							easyflow.tool.Package pkg = ToolFactory.eINSTANCE.createPackage();
        							pkg.setName(toolName);
        							tool.setPackage(pkg);
        						}
        					logger.debug("generateGraphFromTemplate(): add tool definition "+tool.getName()+"/"+tool.getId()+" to tasks tool map");
        					task.getTools().put(toolName, tool);
        					if (task.getPreferredTool().getCommand() == null)
        					{
        						logger.error("generateGraphFromTemplate(): no command provided by tool.");
        					}
        					//task.setCommand(task.getPreferredTool().getCommand());
        					//logger.debug("validation result for tool="+toolName+" "+task.validateTool(tool));
        				}
        				else
        				{
        					logger.warn("generateGraphFromTemplate(): no tool matching name="+toolName+" for task="+task.getUniqueString()+" found.");
        					getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_TOOL_DEFINITION_NOT_FOUND_FOR_TASK_2, Severity.WARN,
        							Util.generateStringList(toolName, task.getUniqueString()));
        				}
        			}
        		if (!task.isUtil())
        		{
	        		Object target=getGraph().insertVertexEasyFlow(null, null, task);
					for (DataPort dataPort:task.getOutDataPorts())
					{
						task.getUnresolvedOutDataPorts().add(dataPort);
					}
					GlobalVar.getCells().put(task.getUniqueString(), (mxICell)target);
	        		logger.trace("generateGraphFromTemplate(): "
	        				+"add to cell map: key="+task.getUniqueString()
	        				+" cmd="+task.getResolvedCommand()
	        				+" cell="+getGraph().getLabel(target));
	        		res++;
	        		//map.put(task.getName(), target);
        		}
        		else
        		{
        			getStaticTasks().add(task);
        		}
        		if (task.getUniqueString().equalsIgnoreCase(getRootTask().getUniqueString()))
        		{
        			/*Task t = getRootTask();
        			t.getInDataPorts().clear();
        			t.getInDataPorts().addAll(task.getInDataPorts());
        			t.getOutDataPorts().clear();
        			t.getOutDataPorts().addAll(task.getOutDataPorts());
        			t.getTraversalEvents().clear();
        			t.getTraversalEvents().addAll(task.getTraversalEvents());
        			t.getGroupingCriteria().clear();
        			t.getGroupingCriteria().addAll(task.getGroupingCriteria());
        			logger.debug(t.getUniqueString()+" "+task.getUniqueString());
        			t.setJexlString(task.getJexlString());*/
        			
        		}
        		else
        			GlobalVar.getTasks().put(task.getUniqueString(), task);
        	}
        	
        	Tool    rootTool    = ToolFactory.eINSTANCE.createTool();
        	rootTool.initLogMessage();
			Command rootCommand = ToolFactory.eINSTANCE.createCommand();
			getRootTask().setResolvedCommand(rootCommand);
			for (DataPort dataPort : getRootTask().getOutDataPorts())
			{
				logger.debug("generateGraphFromTemplate(): add data="+dataPort.getFormat()+" to root tool");
				Data           data  = DataFactory.eINSTANCE.createData();
				InOutParameter param = ToolFactory.eINSTANCE.createInOutParameter();
				param.setDataParam(true);
				param.setOutput(true);
				data.setOutput(true);
				data.setParameter(param);
				data.setPort(dataPort);
				EList<Data> dataList = new BasicEList<Data>();
				dataList.add(data);
				rootTool.getData().put(dataPort.getName(), dataList);
				rootTool.setRoot(true);
			}
			getRootTask().getTools().put("rootTool", rootTool);
			GlobalVar.getTasks().put(getRootTask().getUniqueString(), getRootTask());        	
        	getProcessedStates().put(GlobalConstants.ABSTRACT_NODES_RESOLVED, true);

        } finally {
        	getGraph().getModel().endUpdate();
        }
        
		getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_NUM_VERTEX_CREATED_1, 
				(res > 0 ? Severity.INFO : Severity.WARN),
				Integer.toString(res));

        return res;
	}

	private DataLink createDataLinkForRoot(Task parent, Task child, DataPort dataPort)
	{
		DataLink dataLink = DataFactory.eINSTANCE.createDataLink();
		dataLink.setDataPort(dataPort);
		dataLink.setParentGroupingStr(GlobalConstants.METADATA_INPUT);
		dataLink.setInDataPort(parent.getDataPortByDataPort(dataPort, true));
		
		//dataLink.setGroupingStr(GlobalConstants.METADATA_INPUT);
		return dataLink;
	}
	
	private int generateAbstractGraphEdges()
	{
		int edgesIns = 0;
		int edgesToRootIns = 0;
		try {
			Object rootCell = GlobalVar.getCells().get(getRootTask().getUniqueString());
			if (rootCell==null)
			{
				rootCell=getGraph().insertVertexEasyFlow(null, null, getRootTask());
				//map.put(getRootTask().getName(), rootCell);
				GlobalVar.getCells().put(getRootTask().getUniqueString(), (mxICell)rootCell);
			}
	    	setFirstNode(rootCell);
	    	getJgraph().setDefaultRootCell((mxICell) rootCell);
	    	if (!getLastTasks().contains(getRootTask()))
	    		getLastTasks().add(getRootTask());
	        //logger.trace("generateAbstractGraphEdges(): "+getWorkflowTemplate().getTasks());
	        Iterator<Task> it=getWorkflowTemplate().getTasks().iterator();
			while (it.hasNext())
			{
				Task task=it.next();
				if (task.getUniqueString().equalsIgnoreCase(getRootTask().getUniqueString()))
					continue;
					
				logger.debug("generateAbstractGraphEdges(): #######task="+task.getUniqueString()+" "+task.isUtil()+" #in="+(task.getInDataPorts().size())+" "
						+" first dataport="+task.getInDataPorts().get(0).getFormat().getName()
						+" first dataports grouping="+easyflow.custom.util.Util.list2String(task.getInDataPorts().get(0).getGroupingCriteria(),null));
				if (!task.isUtil()) 
				{
					Object target = GlobalVar.getCells().get(task.getUniqueString());
					EMap<Task, EList<DataLink>> parentTaskList = getParentTasksFor(task);
					logger.debug("generateAbstractGraphEdges(): got "+parentTaskList.size()+" parents.");
					if (parentTaskList.isEmpty())
					{
						for (DataPort dataPort:task.getInDataPorts())
						{
        					getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_LINK_TASK_TO_ROOT_2, Severity.WARN,
        							Util.generateStringList(task.getUniqueString(), dataPort.getName()));
							logger.warn("generateAbstractGraphEdges(): no parent found. link task with root using data port="+dataPort.getName());
							
							getGraph().insertEdgeEasyFlow(null, null, rootCell, target, createDataLinkForRoot(getRootTask(), task, dataPort));
							edgesToRootIns++;
						}
					}
					else
					{
						for (Task pTask:parentTaskList.keySet())
						{
							//Object source=map.get(pTask.getName());
							Object source=GlobalVar.getCells().get(pTask.getUniqueString());
							/*if (parentTaskList.get(pTask)==null)
							{
								logger.trace("generateGraphFromTemplate(): adding mxgraph edge: ("+pTask.getName()+"=>"+task.getName()+") (no edge label)");
								
								Object o=getGraph().insertEdgeEasyFlow(null, null, source, target);
								if (pTask.isUtil())
									getGraph().setCellUnvisible(o);
							}
							else*/
							{
								logger.trace("generateAbstractGraphEdges():  adding mxgraph edge: ("+pTask.getName()+"=>"+task.getName()+")");
								for (DataLink dataLink:parentTaskList.get(pTask))
								{
									dataLink.setInDataPort(pTask.getDataPortByDataPort(dataLink.getDataPort(), true));
									logger.trace("generateAbstractGraphEdges():  add dataLink: "+dataLink.getUniqueString()+" ingoing port="+dataLink.getInDataPort().getName());
									Object o=getGraph().insertEdgeEasyFlow(null, null, source, target, dataLink);
									if (pTask.isRoot())
										edgesToRootIns++;
									else
										edgesIns++;
									if (dataLink.getDataPort().isStatic() || pTask.isUtil())
										getGraph().setCellUnvisible(o);
									pTask.getUnresolvedOutDataPorts().remove(dataLink.getInDataPort());
								}
							}
						}
					}
					if (!task.validateTools())
					{
						logger.debug("generateAbstractGraphEdges():  validation for "+task.getUniqueString()+" failed. Trying to resolve tool dependencies...");
						if (resolveMissingDataPortsByToolFor(task))
							logger.debug("generateAbstractGraphEdges():  resolved data port by Tool !");
						else
							getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_NO_IMPLEMENTING_TOOL_FOR_TASK_1, Severity.WARN,
        							Util.generateStringList(task.getUniqueString()));
					}
					logger.debug("generateAbstractGraphEdges():  "+task.getUniqueString()+" cmd found="+(task.getResolvedCommand()!=null));
					getLastTasks().add(task);
					//logger.debug(getWorkflowTemplate().getTasks().size()+" "+getLastTasks().size());
				}
			}
		} finally {
        	getGraph().getModel().endUpdate();
        	//JGraphXUtil.layoutGraph();
        }
		if (edgesToRootIns > 0)
		{
			getProcessedStates().put(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED, true);
			
			getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_NUM_EDGES_CREATED_2, 
					(edgesIns > 0 ? Severity.INFO : Severity.WARN),
					Util.generateStringList(Integer.toString(edgesIns+edgesToRootIns), Integer.toString(edgesToRootIns)));
		}
		else
		{
			getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_ABSTRACT_GRAPH_NUM_EDGES_CREATED_2, Severity.ERROR,
					Util.generateStringList(Integer.toString(edgesIns), Integer.toString(edgesToRootIns)));
			getProcessedStates().put(GlobalConstants.ABSTRACT_WORKFLOW_GENERATED, false);
		}
		
		return edgesIns + edgesToRootIns;
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
	
/*	
	private void copyDPforTasks(EMap<Task, EList<DataPort>> tasks)
	{
		EList<EList<DataPort>> tmp = new BasicEList<EList<DataPort>>();
		
		for (int i=0;i<tasks.size();i++)
		{
			Entry<Task, EList<DataPort>> entry = tasks.get(i);
			EList<DataPort> newDataPortSet = new BasicEList<DataPort>();
			for (DataPort dp:entry.getValue())
			{
				newDataPortSet.add(EcoreUtil.copy(dp));
			}
			tmp.add(i, newDataPortSet);
			
		}
		for (int i=0;i<tasks.size();i++)
		{
			tasks.get(i).setValue(tmp.get(i));
		}
	}
	*/
	
	
	public EMap<Task, EList<DataLink>> getParentTasksFor(Task task)
	{
		
		// options:
		boolean allowGenericParents = true;  // - must be true in order to search for parents by dataport
		boolean pinPrimaryParents   = false; // - if true, only use the first/best (primary) parents
		
		// get parents as defined in the workflow template
		EList<ParentTaskResult> results = getFixedParentTasksFor(task);
		logger.debug("getParentTasksFor(): obtained "+results.size()+" fixed parents");
		if (allowGenericParents)
		{
			// get parents which cover at least one port
			EList<Task> tmp = getTasksFromParentTaskList(results);
			//logger.debug("getParentTasksFor(): found "+tmp.size()+" tasks from parents task list");
			results.addAll(getParentTasksFor(task, tmp));
		}
		logger.debug("getParentTasksFor(): obtained " + results.size() + " fixed/generic parents");
		for (ParentTaskResult result : results)
		{
			logger.debug("getParentTasksFor(): "
					+"task="+task.getUniqueString()
					+" parent="+result.getParentTask().getUniqueString()
					+" condition="+result.getCondition()
					+" potential circuments="+result.getPotentialCircumventingTasks()
					+" ports="    +easyflow.custom.util.Util.list2String(result.getCoveredPorts(), null)
					+" ");
		}
		
		// produce the resulting map
		EMap<Task, EList<DataLink>> tasks = getParents(task, results);
		return tasks;
	}
	
	private EMap<Task, EList<DataLink>> getParents(Task task, EList<ParentTaskResult> results)
	{
		logger.debug("getParents(): evaluate "+results.size()+" parents for task "+task.getUniqueString());
		EMap<Task, EList<DataLink>> tasks = new BasicEMap<Task, EList<DataLink>>();
		
		tasks.addAll(getAllParentsByStrategy(task, results, null, null));
		
		// evaluate conditions
		String uconds[] = new String[results.size()];
		String ctasks[] = new String[results.size()];
		int i=0;
		for (ParentTaskResult result : results)
		{
			if (result.getCondition() != null && !result.getCondition().equals(""))
			{
				uconds[i]=result.getCondition();
				ctasks[i]=result.getParentTask().getUniqueString();
				i++;
				//conditions.add(result.getCondition());
			}
		}
		if (i>0)
		{
			EList<Integer[]> powerSet = enumerateIntPowerSet(i);
			logger.debug("getParents(): evaluate set of "+powerSet.size()+" combinations.");
			for (Integer[] conditions : powerSet)
			{
				
				EList<String> conditionSet = new BasicEList<String>();
				EList<String> taskSet = new BasicEList<String>();
				for (int j:conditions)
				{
					if (!conditionSet.contains(uconds[j]))
						conditionSet.add(uconds[j]);
					taskSet.add(ctasks[j]);
				}
				logger.debug("getParents(): test condition set="+conditionSet+" "+Util.list2String(taskSet, ","));
				// find parents which circumvent the given set of conditions
				EMap<Task, EList<DataLink>> allTasks = getAllParentsByStrategy(task, 
						getMatchingParentTasks(results, conditionSet), 
						conditionSet, taskSet);
				Iterator<Entry<Task, EList<DataLink>>> it = allTasks.iterator();
				while (it.hasNext())
				{
					Entry<Task, EList<DataLink>> e = it.next();
					if (tasks.containsKey(e.getKey()))
					{
						EList<DataLink> knownDLs = tasks.get(e.getKey());
						if (e.getValue().size() == knownDLs.size())
						{
							boolean matchAll = true;
							for (DataLink d : e.getValue())
							{
								boolean match = false;
								for (DataLink knownDL : knownDLs)
								{
									if (
											((d.getInDataPort() == null && knownDL.getInDataPort() == null) ||
											(d.getInDataPort() != null && d.getInDataPort().isCompatible(knownDL.getInDataPort()))
											) &&
											((d.getDataPort() == null && knownDL.getDataPort() == null) ||
											(d.getDataPort() != null &&
											d.getDataPort().isCompatible(knownDL.getDataPort())))
										)
									{
										match = true;
										break;
									}
								}
								if (!match)
								{
									matchAll = false;
									break;
								}
							}
							if (!matchAll)
								tasks.add(e);		
						}
					}
					else
					{
						tasks.add(e);
					}
				}
				//tasks.addAll(allTasks);
			}
		}
		logger.debug("getParents(): produced "+tasks.size()+" parents with datalinks.");
		return tasks;
	}
	
	private EMap<Task, EList<DataLink>> getAllParentsByStrategy(Task task, 
			EList<ParentTaskResult> results,
			EList<String> conditionsToCircumvent,
			EList<String> tasksToCircumvent)
	{
		logger.debug("getAllParentsByStrategy(): find parents for "
				+ "task="+task.getUniqueString()
				+" coditions2circumvent="+conditionsToCircumvent
				+" tasts2circumvent="+tasksToCircumvent
				+" strategy="+GlobalConfig.getResolveParentTasksStrategy());
		// find parents which circumvent the given set of conditions
		EMap<Task, EList<DataLink>> allTasks = getAllParents(task, results, conditionsToCircumvent, tasksToCircumvent);
		logger.debug("getAllParentsByStrategy(): all="+allTasks.size());
		
		EMap<Task, EList<DataLink>> tasks = new BasicEMap<Task, EList<DataLink>>();
		
		if (GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_NEAREST_PARENT.equals(GlobalConfig.getResolveParentTasksStrategy()))
		{
			allTasks = getNearestParentsFirst(task, allTasks);
			logger.debug("getAllParentsByStrategy(): restrict by strategy="+GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_NEAREST_PARENT
					+" to="+allTasks.size());
			tasks.addAll(allTasks);
		}
		else if (GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_MAX_RANK.equals(GlobalConfig.getResolveParentTasksStrategy()))
		{
			allTasks = getParentsOfMaxRank(task, allTasks);
			logger.debug("getAllParentsByStrategy(): restrict by strategy="+GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_MAX_RANK
					+" to="+allTasks.size());
			tasks.addAll(allTasks);
		}
		else if (!GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_ALL_PARENTS.equals(GlobalConfig.getResolveParentTasksStrategy()))
			logger.error("getAllParentsByStrategy(): Unkown Resolve-Parent-Tasks Strategy. Default to "+GlobalConfig.CONFIG_WORKFLOW_RESOLVE_PARENT_TASKS_STRATEGY_ALL_PARENTS);
				
		if (logger.getParent().getLevel().toInt()<=Priority.DEBUG_INT)
		{
			for (Task t:tasks.keySet())
				logger.debug("getAllParentsByStrategy(): return parent task="+t.getUniqueString());
		}
		
		return tasks;
	}
			
	
	private EMap<Task, EList<DataLink>> getAllParents(Task task, 
			EList<ParentTaskResult> results,
			EList<String> conditionsToCircumvent,
			EList<String> tasksToCircumvent)
	{
		EMap<Task, EList<DataLink>> tasks = new BasicEMap<Task, EList<DataLink>>();
		
		for (ParentTaskResult result : results)
		{
			logger.debug("getAllParents(): parent="+result.getParentTask().getUniqueString()
					+" cond="+result.getCondition()
					+" potential circumvents="+result.getPotentialCircumventingTasks()
					+" ports="+Util.list2String(result.getCoveredPorts(), ","));
			EList<DataLink> dataLinks = new BasicEList<DataLink>();
			for (DataPort dataPort : result.getCoveredPorts())
			{
				DataLink dataLink = DataFactory.eINSTANCE.createDataLink();
				dataLink.setDataPort(dataPort);
				if (result.getParentTask().isRoot())
					dataLink.setParentGroupingStr(GlobalConstants.METADATA_INPUT);
				if (dataLink.getCondition() == null)
					dataLink.setCondition(CoreFactory.eINSTANCE.createCondition());

				if (conditionsToCircumvent != null)
					dataLink.getCondition().getForbidden().addAll(conditionsToCircumvent);
				if (tasksToCircumvent != null)
					dataLink.getCondition().getCircumventingParents().addAll(tasksToCircumvent);
				//if (result.getCondition()!=null && !result.getCondition().equals(""))
					//dataLink.getCondition().getForbidden().add(result.getCondition());
				dataLinks.add(dataLink);
				dataLink.getCondition().getCircumventingParents().addAll(result.getPotentialCircumventingTasks());
				logger.trace("getAllParents(): add new datalink="+dataLink.getDataPort().getName()
						+" cirumvent: cond="+dataLink.getCondition().getForbidden()
						+" task="+dataLink.getCondition().getCircumventingParents()
						+" result object="+result.getCondition()
						//+" "+dataLink.hashCode()
				);
			}
			
			tasks.put(result.getParentTask(), dataLinks);
			logger.trace("getAllParents(): parent="+result.getParentTask().getUniqueString()
					+" (resolving "+result.getCoveredPorts().size()+" ports) added."+" (tot="+tasks.size()+")"
					//+" "+dataLinks.hashCode()
					);
		}
		return tasks;
	}
	
	private EMap<Task, EList<DataLink>> getParentsOfMaxRank(Task task, EMap<Task, EList<DataLink>> allTasks)
	{
		
		
		// get first parents which cover all the ports
		return getNearestParentsFirst(task, allTasks);
	}
	
	// find those results which, taken together, cover all dataports of the given task and create
	// a corresponding map
	private EMap<Task, EList<DataLink>> getNearestParentsFirst(Task task, EMap<Task, EList<DataLink>> allTasks)
	{
		EMap<Task, EList<DataLink>> tasks = new BasicEMap<Task, EList<DataLink>>();
		// track the resolved dataports
		EList<DataPort> resolvedDataPorts = new BasicEList<DataPort>();

		for (Entry<Task, EList<DataLink>> e:allTasks)
		{
		
			EList<DataPort> unresolvedDataPorts = new BasicEList<DataPort>();
			EList<DataLink> dataLinks           = new BasicEList<DataLink>();
			for (DataLink dataLink : e.getValue())
			{
				DataPort coveredPort = dataLink.getDataPort();
			
				boolean add = true;
				for (DataPort resolvedPort:resolvedDataPorts)
					if (coveredPort.isCompatible(resolvedPort))
						add = false;
				if (add)
				{
					unresolvedDataPorts.add(coveredPort);
					dataLinks.add(dataLink);
				}
			}
			resolvedDataPorts.addAll(unresolvedDataPorts);
			
			tasks.put(e.getKey(), dataLinks);
			// break, as soon as all ports are resolved
			if (task.getInDataPorts().size() == resolvedDataPorts.size())
				break;
		}
		return tasks;

	}
	
	private EList<ParentTaskResult> getMatchingParentTasks(EList<ParentTaskResult> results, 
			EList<String> conditionsToCircumvent)
	{
		EList<ParentTaskResult> filteredResults = new BasicEList<ParentTaskResult>();
		Iterator<ParentTaskResult> it = results.iterator();
		while (it.hasNext())
		{
			ParentTaskResult result = it.next();
			if (conditionsToCircumvent.contains(result.getCondition()))
			{
				ParentTaskResult match = findParentBehindOf(results, result, conditionsToCircumvent);
				if (match != null)
				{
					filteredResults.add(match);
					logger.trace("getMatchingParentTasks(): found alternate parent to cirumvent "
							+ "cond="+conditionsToCircumvent+" introduced by "
							+ "task="+match.getPotentialCircumventingTasks());
				}
				else
				{
					logger.trace("getMatchingParentTasks():no alternate parent found to cirumvent "
							+ "cond="+conditionsToCircumvent);
				}
			}
			else
				break;
		}
		return filteredResults;
	}
	
	// find a parent which circumvent the condition and provides at least one 
	// of the ports the current parent provides as well.
	private ParentTaskResult findParentBehindOf(EList<ParentTaskResult> results,
			ParentTaskResult result,
			EList<String> conditionsToCircumvent)
	{
		Iterator<ParentTaskResult> it = results.iterator();
		boolean active = false; 
		while (it.hasNext())
		{
			ParentTaskResult current = it.next();
			if (active)
				if (current.getParentTask().getOverlappingDataPorts(
						result.getCoveredPorts(), 
						current.getParentTask().getOutDataPorts()
						).size()==current.getCoveredPorts().size())
					if (!conditionsToCircumvent.contains(current.getCondition()))
						return current;
			if (result == current)
				active = true;
		}
		return null;
	}
	
	private EList<Task> getTasksFromParentTaskList(EList<ParentTaskResult> results)
	{
		EList<Task> tasks = new BasicEList<Task>();
		for (ParentTaskResult parentTaskResult:results)
			tasks.add(parentTaskResult.getParentTask());
		logger.trace("getTasksFromParentTaskList(): "+tasks.size()+" parents found in parent task list.");
		return tasks;
	}
	
	private EList<ParentTaskResult> getFixedParentTasksFor(Task task)
	{
		
		EList<ParentTaskResult> results=new BasicEList<ParentTaskResult>();
		Iterator<Task> it=task.getParents().values().iterator();
		
		while (it.hasNext())
		{
			
			Task parent = it.next();
			EList<DataPort> overlappingDataPorts = task
					.getOverlappingDataPorts(task.getInDataPorts(),
							parent.getOutDataPorts());
			logger.debug("getFixedParentTasksFor(): check fixed parent "+parent.getUniqueString()+" with overlap="+overlappingDataPorts.size());
			if (!overlappingDataPorts.isEmpty()) {
				ParentTaskResult parentTaskResult = CoreFactory.eINSTANCE.createParentTaskResult();
				parentTaskResult.setParentTask(parent);
				parentTaskResult.setCondition(parent.getJexlString());
				parentTaskResult.getCoveredPorts().addAll(overlappingDataPorts);
				parentTaskResult.setRank(overlappingDataPorts.size());
				results.add(parentTaskResult);
			}
		}
		
		return results;
	}
	
	
	private EList<ParentTaskResult> getParentTasksFor(Task task, EList<Task> resolvedTasks)
	{
		EList<ParentTaskResult> results = new BasicEList<ParentTaskResult>();
		logger.trace("getParentTasksFor(): check last tasks list of size="+getLastTasks().size());
		ListIterator<Task> it = getLastTasks().listIterator(getLastTasks().size());
		ParentTaskResult lastResult = null;
		while (it.hasPrevious())
		{
			Task lastTask = it.previous();
			logger.trace("getParentTasksFor(): test last task="+lastTask.getUniqueString());
			if ((resolvedTasks == null || resolvedTasks.isEmpty())  || 
					(resolvedTasks != null && !resolvedTasks.contains(lastTask)))
			{
				logger.trace("getParentTasksFor(): unresolved task detected out="+lastTask.getOutDataPorts().size()+" in="+task.getInDataPorts().size()); 
				EList<DataPort> overlappingDataPorts = task
						.getOverlappingDataPorts(task.getInDataPorts(), lastTask.getOutDataPorts());
				if (!overlappingDataPorts.isEmpty())
				{
					logger.trace("getParentTasksFor(): "+overlappingDataPorts.size()+" overlapping ports found");
					ParentTaskResult parentTaskResult = CoreFactory.eINSTANCE.createParentTaskResult();
					parentTaskResult.setParentTask(lastTask);
					if (lastTask.getJexlString()!=null && !lastTask.getJexlString().equals(""))
					{
						//parentTaskResult.getPotentialCircumventingTasks().add(lastTask.getUniqueString());
						parentTaskResult.setCondition(lastTask.getJexlString());
					}
					parentTaskResult.getCoveredPorts().addAll(overlappingDataPorts);
					parentTaskResult.setRank(overlappingDataPorts.size());
					parentTaskResult.setGeneric(true);
					
					lastResult = parentTaskResult;
					results.add(parentTaskResult);
				}
			}
		}
		
		if (lastResult != null && (lastResult.getCondition() != null && !lastResult.getCondition().equals("")))
			lastResult.setCondition(null);
		
		return results;
	}
	
/*	
	private EList<EList<Object>> enumerateObjectPowerSet(EList<Object> dataPorts)
	{
		EList<EList<Object>> powerSet=new BasicEList<EList<Object>>();
		int N=dataPorts.size();
		int allMasks = (1 << N);
		
		for (int i = 1; i < allMasks; i++)
		{
			EList<Object> subSet=new BasicEList<Object>();
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
*/	
	private EList<Integer[]> enumerateIntPowerSet(int N)
	{
		EList<Integer[]> powerSet=new BasicEList<Integer[]>();
		Integer ia[] = new Integer[N];
		for (int i=0;i<N;i++)
			ia[i]=i;
		//int N=ia.length;
		int allMasks = (1 << N);
		
		for (int i = 1; i < allMasks; i++)
		{
			EList<Integer> subSet=new BasicEList<Integer>();
		    for (int j = 0; j < N; j++)
		        if ((i & (1 << j)) > 0) //The j-th element is used
		        {
		           subSet.add(ia[j]);
		        }
		    Integer sa[] = new Integer[subSet.size()];
		    for (int k=0;k<subSet.size();k++)
		    	sa[k]=subSet.get(k);
		    powerSet.add(sa);
		    //System.out.println();
		}
		return powerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveMissingDataPortsByToolFor(Task task) {
		
		Object target = GlobalVar.getCells().get(task.getUniqueString());
		EList<Task> defaultTasks = new BasicEList<Task>();
		defaultTasks.add(getRootTask());
		EMap<Task,EList<DataPort>> tasks = task.resolveMissingDataPortsByTool(defaultTasks);
		if (tasks==null)
			return false;
		
		for (Task tmpTask:tasks.keySet())
		{
			Object source = GlobalVar.getCells().get(tmpTask.getUniqueString());
			for (DataPort dataPort:tasks.get(tmpTask))
			{
				
				task.getInDataPorts().add(dataPort);
				DataLink dataLink = DataFactory.eINSTANCE.createDataLink();
				dataLink.setDataPort(dataPort);
				
				dataLink.setInDataPort(tmpTask.getDataPortByDataPort(dataPort, true));
				GlobalVar.getDataLinks().put(Integer.toString(dataLink.hashCode()), dataLink);
				Object   o  = getGraph().insertEdgeEasyFlow(null, null, source, target, dataLink);
				DataPort dp = tmpTask.getDataPortByDataPort(dataPort, true);
				if (dp!=null)
					dataPort.setStatic(dp.isStatic());
				if (dataPort.isStatic()||tmpTask.isUtil())
					getGraph().setCellUnvisible(o);
			}
		}
		
		return task.validateTools();
	}

	/*
	private EList<Task> removeParentsFromLastTasks(EList<Task> tasks)
	{
		// remove those tasks that can be exchanged by a closer task.
		// (i.e. a task that is a parent of another one, providing the same
		// port)

		EList<Task> newTasks=new BasicEList<Task>();
		for (Task possibleParent : tasks) {

			boolean childFound=false;
			for (Task possibleChild : tasks)
				if (possibleChild != possibleParent)
					childFound=getGraphUtil().isChildOf(possibleChild, possibleParent);

			if (!childFound)
			{
				if (!newTasks.contains(possibleParent))
				{
					logger.trace("add "+possibleParent.getUniqueString()+" as possible parent.");
					newTasks.add(possibleParent);
				}
			}
		
		}
		return newTasks;

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
			names[i++]=it.next().getName();
		return StringUtils.join(names, "_");
		
	}
*/	
	
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

	public void printGraph()
	{
		final String printmode = "simple";
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String lastParent = null;
			//String path1 = "";
			@Override
			public boolean visit(Object vertex, Object edge) {
				String path = "";
				// set the current task
				Task task;
				try {
					task = JGraphXUtil.loadTask(vertex);
				
				if (printmode.equals("simple"))
				{
					System.out.println(task.getUniqueString());
				}
				else
				{
				path += task.getUniqueString();
				Task parentTask = null;
				//Object parent = null;
				
				if (edge != null)
				{
					try {
						parentTask = JGraphXUtil.loadTask(getGraph().getView().getVisibleTerminal(edge, true));
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
				}
				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return true;
			}
		};
		System.out.println("======start=======");
		System.out.println("traverse");
		getGraph().traverse(getFirstNode(), true, visitor);
		//System.out.println("\ntraverse all paths");
		//getGraph().traverseAllPaths(getFirstNode(), true, visitor, null);
		//System.out.println("\ntraverse topological order");
		//getGraph().traverseTopologicalOrder((mxICell) getFirstNode(), visitor);
		System.out.println("\n=======end========");
	}
	
	private void printAllCells(Object root) {
		logger.debug("Totalsize: "+getGraph().getVertices(root).size());
		for (Object o:getGraph().getVertices(root))
			logger.debug("label "+getGraph().getLabel(o)+" #out="+getGraph().getOutgoingEdges(o).length);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveTraversalEvents() {
		
		
		try {
			if (getJgraph().resolveTraversalEvents((mxICell)getFirstNode()))
			{
				getProcessedStates().put(GlobalConstants.TRAVERSAL_EVENTS_RESOLVED, true);
				return true;
			}
		} catch (TaskNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0,
					Category.TRAVERSAL_EVENT_CREATION,
					Severity.ERROR, e, null
					);
		} catch (DataLinkNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
					Category.TRAVERSAL_EVENT_CREATION,
					Severity.ERROR, e, null
					);
		}
		return false;
	}

	
	public boolean applyTraversalCriteria(boolean isGrouping) {
		
		String step = isGrouping ? GlobalConstants.APPLY_GROUPINGS : GlobalConstants.APPLY_PARAMETERS;
		//getWorker().
		printWorkflowStepMsgOnStart(step);
		boolean rc = true;
		
		TraversalEvent traversalEvent;
		try {
			traversalEvent = getJgraph().getNextTraversalEvent(isGrouping);
		} catch (TaskNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
					Category.TRAVERSAL_EVENT_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		} catch (DataLinkNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
					Category.TRAVERSAL_EVENT_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		}
		TraversalEvent oldTraversalEvent = null;
		logger.debug("applyTraversalCriteria(): found "+getJgraph().getTraversalEvents().size()+" traversal events. Grouping="+isGrouping);
		getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_WORKFLOW_PROCESS_NUM_TRAVERSAL_EVENTS_2, Severity.INFO, 
				Util.generateStringList(Integer.toString(getJgraph().getTraversalEvents().size()), isGrouping ? "grouping" : "parameter"));
		while (traversalEvent != null)
		{
			logger.debug("applyTraversalCriteria(): te="+GraphUtil.traversalEventToString(traversalEvent)
					+" empty id?="+traversalEvent.getTraversalCriterion().getId().isEmpty());
			
			boolean cont = false;
			if (!applyTraversalEvent(traversalEvent))
			{
				cont = true;
				//rc = false;
				logger.error("applyTraversalCriteria(): error occured for te="
						+traversalEvent.getTraversalCriterion().getId()+" "
						+traversalEvent.getTraversalCriterion().getName()+" split task="
						+traversalEvent.getSplitTask().getUniqueString()
						);
			}
			oldTraversalEvent = traversalEvent;
			try {
				traversalEvent = getJgraph().getNextTraversalEvent(isGrouping);
			} catch (TaskNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
						Category.TRAVERSAL_EVENT_RESOLUTION,
						Severity.ERROR, e,
						null);
				return false;
			} catch (DataLinkNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
						Category.TRAVERSAL_EVENT_RESOLUTION,
						Severity.ERROR, e,
						null);
				return false;
			}
			
			if (cont)
				continue;
			
			for (mxICell subGraphRoot1 : getJgraph().getCurrentSubGraphs())
			{
				getJgraph().removeSubGraph(
						subGraphRoot1, 
						oldTraversalEvent);
			}
			getJgraph().resetFlags();
			getJgraph().getCurrentSubGraphs().clear();
		}
		logger.debug("applyTraversalCriteria(): finished with return code="+rc);
		printWorkflowStepMsgOnEnd(rc, step,
				getLogMessage().getLogMsg(),
				getLogMessage().getHelpMsg());
		setFirstNode(getJgraph().getDefaultRootCell());
		//printGraph();
		printAllCells(getJgraph().getDefaultRootCell());
		return rc;
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
	 * @throws TaskNotFoundException 
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @generated not
	 */
	public boolean applyGroupingCriteria() {
		
		boolean rc = applyTraversalCriteria(true); 
		if (rc)
			getProcessedStates().put(GlobalConstants.GROUPING_APPLIED, true);
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @generated not
	 */
	public boolean applyParameterCriteria() {
		
		boolean rc = applyTraversalCriteria(false);
		if (rc)
			getProcessedStates().put(GlobalConstants.PARAMETER_APPLIED, true);
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws GroupingCriterionInstanceNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @generated not
	 */
	public boolean applyTraversalEvent(TraversalEvent traversalEvent) {
		
		boolean rc;
		final ReturnValue returnCell = UtilFactory.eINSTANCE.createReturnValue();
		
		EList<GroupingInstance> groupingInstances;
		try {
			groupingInstances = getJgraph()
					.getGroupingInstances(traversalEvent);
		} catch (GroupingCriterionInstanceNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_GROUPING_CRITERION_INSTANCE_NOT_FOUND_0, 
					Category.TRAVERSAL_EVENT_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		}
		if (groupingInstances.isEmpty())
			return false;

		if (traversalEvent.isGrouping())
			getLogMessage().generateLogMsg(
				GlobalConstants.LOG_MSG_APPLY_TRAVERSAL_EVENT_GROUPING_5,
				Severity.INFO,
				Util.generateStringList(
						traversalEvent.getSplitTask().getUniqueString(),
						Util.list2String(Util.tasksToStringList(traversalEvent.getMergeTask()), ","),
						traversalEvent.getTraversalCriterion().getMode(),
						traversalEvent.getTraversalCriterion().getId(),
						Util.list2String(groupingInstances, ",")));
		else
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_APPLY_TRAVERSAL_EVENT_PARAMETER_5,
					Severity.INFO,
					Util.generateStringList(
							traversalEvent.getSplitTask().getUniqueString(),
							Util.list2String(Util.tasksToStringList(traversalEvent.getMergeTask()), ","),
							traversalEvent.getTraversalCriterion().getMode(),
							traversalEvent.getTraversalCriterion().getName(),
							Util.list2String(groupingInstances, ",")));

		try {
			rc = getJgraph()
					.computeSubgraph(traversalEvent, true, returnCell);
		} catch (TaskNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
					Category.TRAVERSAL_EVENT_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		} catch (DataLinkNotFoundException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
					Category.TRAVERSAL_EVENT_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		}

		if (rc && returnCell.getObject() != null)
			rc = getJgraph().getCurrentSubGraphs().add((mxICell) returnCell.getObject());

		if (rc && returnCell.getObject() != null)
		{
			mxICell subGraphRoot = (mxICell) returnCell.getObject();
			if (traversalEvent.getTraversalCriterion().getMode()
					.equals(GlobalConstants.GROUPING_MODE_BATCH)) {
				int numEventsResolved = 0;
				for (GroupingInstance groupingInstance : groupingInstances) {
					logger.debug("applyTraversalEvents(): applying grouping instance="
							+ groupingInstance.getName()
							+ " with features="
							+ groupingInstance.getFeatures().keySet()
							+ " for criterion="
							+ traversalEvent.getTraversalCriterion().getId());

					try {
						rc = getJgraph()
								.applyTraversalEventCopyGraph(subGraphRoot,
										traversalEvent, groupingInstance, returnCell);
						if (rc && returnCell.getObject() != null) {
							rc = getJgraph().applyTraversalEvent((mxICell) returnCell.getObject(),
									traversalEvent,
									traversalEvent.getTraversalCriterion().getId(),
									groupingInstance);
							if (!rc)
								break;
							numEventsResolved++;
						}
					} catch (TaskNotFoundException e) {
						getLogMessage().generateLogMsg(
								GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
								Category.TRAVERSAL_EVENT_RESOLUTION,
								Severity.ERROR, e,
								null);
						return false;
					} catch (DataLinkNotFoundException e) {
						getLogMessage().generateLogMsg(
								GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
								Category.TRAVERSAL_EVENT_RESOLUTION,
								Severity.ERROR, e,
								null);
						return false;
					}
				}
				if (numEventsResolved == 0)
					rc = false;
					
			} else {
				logger.debug("applyTraversalEvents(): joint mode, "
						+ " for criterion="
						+ traversalEvent.getTraversalCriterion().getId());
				try {
					rc = getJgraph().applyTraversalEventCopyGraph(
							subGraphRoot, traversalEvent, groupingInstances, returnCell);
					logger.debug("applyTraversalEvents(): copy graph applied in joint mode.");
					if (rc && returnCell != null) {
						rc = getJgraph().applyTraversalEvent((mxICell) returnCell.getObject(), traversalEvent,
								traversalEvent.getTraversalCriterion().getId(),
								groupingInstances);
						logger.debug("applyTraversalEvents(): traversals applied in joint mode.");
					}
				} catch (TaskNotFoundException e) {
					getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
							Category.TRAVERSAL_EVENT_RESOLUTION,
							Severity.ERROR, e,
							null);
					return false;
				} catch (DataLinkNotFoundException e) {
					getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
							Category.TRAVERSAL_EVENT_RESOLUTION,
							Severity.ERROR, e,
							null);
					return false;
				}
			}
		}

		return rc;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * insert filter/merge tasks as necessary to resolve incompatible groupings
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveIncompatibleGroupings() {
		
		printWorkflowStepMsgOnStart(GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS);
		boolean rc = true;
		//Iterator<Entry<mxICell, EList<mxICell>>> it = getGraphUtil().findCellsWithUntranslatedDataLinks().entrySet().iterator();
		EMap<mxICell, EList<mxICell>> untranslatedDLs = getJgraph().findCellsWithUntranslatedDataLinks();
		getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_WORKFLOW_FOUND_NUM_INCOMPATIBLE_GROUPINGS_1, Severity.INFO,
				Integer.toString(untranslatedDLs.size()));
		ListIterator<Entry<mxICell, EList<mxICell>>> it = untranslatedDLs.listIterator(untranslatedDLs.size()); 
		while (it.hasPrevious())
		//while (it.hasNext())
		{
			Entry<mxICell, EList<mxICell>> entry = //it.next(); 
					it.previous();
			try {
				logger.debug("resolveIncompatibleGroupings(): resolve for task="+JGraphXUtil.loadTask(entry.getKey()).getUniqueString());
			} catch (TaskNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION, 
						Severity.ERROR, e,
						Util.generateStringList("resolveIncompatibleGroupings"));
				return false;
			}
			/*
			for (mxICell cell:entry.getValue())
			{
				DataLink dataLink;
				try {
					dataLink = JGraphXUtil.loadDataLink(cell);
				} catch (DataLinkNotFoundException e) {
					getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0, 
							Category.INCOMPATIBLE_GROUPING_RESOLUTION,
							Severity.ERROR, e,
							null);
					return false;
				}
				logger.debug("resolveIncompatibleGroupings(): "+dataLink.getParentGroupingStr()+"->"+dataLink.getGroupingStr());
			}*/
			try {
				Task task = JGraphXUtil.loadTask(entry.getKey());
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_WORKFLOW_RESOLVE_INCOMPATIBLE_GROUPING_FOR_TASK_1,
						Severity.INFO,
						task.getUniqueString());
				rc = getJgraph().resolveEdge(entry);
			} catch (TaskNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION,
						Severity.ERROR, e);
				return false;
			} catch (DataLinkNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION,
						Severity.ERROR, e);
				return false;
			} catch (DataPortNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_DATAPORT_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION,
						Severity.ERROR, e);
				return false;
			} catch (ToolNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_TOOL_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION,
						Severity.ERROR, e);
				return false;
			} catch (UtilityTaskNotFoundException e) {
				getLogMessage().generateLogMsg(
						GlobalConstants.LOG_MSG_UTILITY_TASK_NOT_FOUND_0, 
						Category.INCOMPATIBLE_GROUPING_RESOLUTION,
						Severity.ERROR, e);
				return false;
			}
		}
		JGraphXUtil.layoutGraph();
		if (rc)
		{
			getProcessedStates().put(GlobalConstants.INCOMPATIBLE_GROUPINGS_RESOLVED, true);
		}
		printWorkflowStepMsgOnEnd(rc, GlobalConstants.RESOLVE_INCOMPATIBLE_GROUPINGS,
				getLogMessage().getLogMsg(),
				getLogMessage().getHelpMsg());
		//printAllCells(getGraphUtil().getDefaultRootCell());
		return rc;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * insert preprocessing tasks (e.g. index, sort, ...) as defined in workflow template
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolvePreprocessingTasks() {
		
		boolean rc = true;
		printWorkflowStepMsgOnStart(GlobalConstants.RESOLVE_PREPROCESSING_TASKS);
		EMap<mxICell, EList<mxICell>> prepRequired = getJgraph().findCellsWherePreprocessingIsRequired();
		logger.debug("resolvePreprocessingTasks(): found "+prepRequired.size()+" tasks with unresolved preprocessings");
		Iterator<Entry<mxICell, EList<mxICell>>> it = prepRequired.iterator(); 
		while (it.hasNext())
		{
			Entry<mxICell, EList<mxICell>> entry = it.next();
			for (mxICell edge:entry.getValue())
			{
				try {
					rc = getJgraph().resolvePreprocessingTask(entry.getKey(), edge);
				} catch (TaskNotFoundException e) {
					getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_TASK_NOT_FOUND_0, 
							Category.UTILITY_TASK_RESOLUTION,
							Severity.ERROR, e,
							null);
					return false;
				} catch (DataLinkNotFoundException e) {
					getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_DATALINK_NOT_FOUND_0,
							Category.UTILITY_TASK_RESOLUTION,
							Severity.ERROR, e,
							null);
					return false;
				}
				logger.debug("resolvePreprocessingTasks(): rc="+rc);
			}
			//rc = getGraphUtil().resolvePreprocessingTask(entry.getKey(), null);
		}
		if (rc)
			getProcessedStates().put(GlobalConstants.PREPROCESSING_TASKS_RESPOLVED, true);
		printWorkflowStepMsgOnEnd(rc, GlobalConstants.RESOLVE_PREPROCESSING_TASKS,
				getLogMessage().getLogMsg(),
				getLogMessage().getHelpMsg());
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public boolean resolveToolDependencies() {
		
		printWorkflowStepMsgOnStart(GlobalConstants.RESOLVE_TOOL_DEPS);
		boolean rc;
		try {
			rc = getJgraph().resolveToolDependencies((mxICell) getFirstNode(), getCatalog());
		} catch (NoValidInOutDataException e) {
			getLogMessage().generateLogMsg(
					GlobalConstants.LOG_MSG_INVALID_DATA_PORT_FOUND_0,
					Category.TOOL_RESOLUTION,
					Severity.ERROR, e,
					null);
			return false;
		}
		printWorkflowStepMsgOnEnd(rc, GlobalConstants.RESOLVE_TOOL_DEPS,
				getLogMessage().getLogMsg(),
				getLogMessage().getHelpMsg());
		if (rc)
			getProcessedStates().put(GlobalConstants.TOOL_DEPS_RESOLVED, true);
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorklowForExecutionSystem() {
		
		printWorkflowStepMsgOnStart(GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW);
		boolean rc = false;
		rc = getJgraph().generateWorkflowForExecutionSystem((mxICell) getFirstNode(), getExecutionSystem());
		if (rc)
			getProcessedStates().put(GlobalConstants.EXEC_WORKFLOW_GENERATED, true);
		printWorkflowStepMsgOnEnd(rc, 
				GlobalConstants.GENERATE_EXECUTABLE_WORKFLOW,
				getLogMessage().getLogMsg(),
				getLogMessage().getHelpMsg());
		return rc;
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
			case CorePackage.WORKFLOW__PROCESSED_STATES:
				return ((InternalEList<?>)getProcessedStates()).basicRemove(otherEnd, msgs);
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				return ((InternalEList<?>)getPreviousTaskName()).basicRemove(otherEnd, msgs);
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
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				if (coreType) return getGenericAttributes();
				else return getGenericAttributes().map();
			case CorePackage.WORKFLOW__CATALOG:
				if (resolve) return getCatalog();
				return basicGetCatalog();
			case CorePackage.WORKFLOW__ROOT_TASK:
				if (resolve) return getRootTask();
				return basicGetRootTask();
			case CorePackage.WORKFLOW__STATIC_TASKS:
				return getStaticTasks();
			case CorePackage.WORKFLOW__PROCESSED_STATES:
				if (coreType) return getProcessedStates();
				else return getProcessedStates().map();
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				if (coreType) return getPreviousTaskName();
				else return getPreviousTaskName().map();
			case CorePackage.WORKFLOW__WORKER:
				return getWorker();
			case CorePackage.WORKFLOW__EXECUTION_SYSTEM:
				if (resolve) return getExecutionSystem();
				return basicGetExecutionSystem();
			case CorePackage.WORKFLOW__CURRENT_RULE:
				if (resolve) return getCurrentRule();
				return basicGetCurrentRule();
			case CorePackage.WORKFLOW__JGRAPH:
				if (resolve) return getJgraph();
				return basicGetJgraph();
			case CorePackage.WORKFLOW__LOG_MESSAGE:
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
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				((EStructuralFeature.Setting)getGenericAttributes()).set(newValue);
				return;
			case CorePackage.WORKFLOW__CATALOG:
				setCatalog((Catalog)newValue);
				return;
			case CorePackage.WORKFLOW__ROOT_TASK:
				setRootTask((Task)newValue);
				return;
			case CorePackage.WORKFLOW__STATIC_TASKS:
				getStaticTasks().clear();
				getStaticTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.WORKFLOW__PROCESSED_STATES:
				((EStructuralFeature.Setting)getProcessedStates()).set(newValue);
				return;
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				((EStructuralFeature.Setting)getPreviousTaskName()).set(newValue);
				return;
			case CorePackage.WORKFLOW__WORKER:
				setWorker((EasyFlowOverallWorker)newValue);
				return;
			case CorePackage.WORKFLOW__EXECUTION_SYSTEM:
				setExecutionSystem((IExecutionSystem)newValue);
				return;
			case CorePackage.WORKFLOW__CURRENT_RULE:
				setCurrentRule((Rule)newValue);
				return;
			case CorePackage.WORKFLOW__JGRAPH:
				setJgraph((Graph)newValue);
				return;
			case CorePackage.WORKFLOW__LOG_MESSAGE:
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
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				getGenericAttributes().clear();
				return;
			case CorePackage.WORKFLOW__CATALOG:
				setCatalog((Catalog)null);
				return;
			case CorePackage.WORKFLOW__ROOT_TASK:
				setRootTask((Task)null);
				return;
			case CorePackage.WORKFLOW__STATIC_TASKS:
				getStaticTasks().clear();
				return;
			case CorePackage.WORKFLOW__PROCESSED_STATES:
				getProcessedStates().clear();
				return;
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				getPreviousTaskName().clear();
				return;
			case CorePackage.WORKFLOW__WORKER:
				setWorker(WORKER_EDEFAULT);
				return;
			case CorePackage.WORKFLOW__EXECUTION_SYSTEM:
				setExecutionSystem((IExecutionSystem)null);
				return;
			case CorePackage.WORKFLOW__CURRENT_RULE:
				setCurrentRule((Rule)null);
				return;
			case CorePackage.WORKFLOW__JGRAPH:
				setJgraph((Graph)null);
				return;
			case CorePackage.WORKFLOW__LOG_MESSAGE:
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
			case CorePackage.WORKFLOW__GENERIC_ATTRIBUTES:
				return genericAttributes != null && !genericAttributes.isEmpty();
			case CorePackage.WORKFLOW__CATALOG:
				return catalog != null;
			case CorePackage.WORKFLOW__ROOT_TASK:
				return rootTask != null;
			case CorePackage.WORKFLOW__STATIC_TASKS:
				return staticTasks != null && !staticTasks.isEmpty();
			case CorePackage.WORKFLOW__PROCESSED_STATES:
				return processedStates != null && !processedStates.isEmpty();
			case CorePackage.WORKFLOW__PREVIOUS_TASK_NAME:
				return previousTaskName != null && !previousTaskName.isEmpty();
			case CorePackage.WORKFLOW__WORKER:
				return WORKER_EDEFAULT == null ? worker != null : !WORKER_EDEFAULT.equals(worker);
			case CorePackage.WORKFLOW__EXECUTION_SYSTEM:
				return executionSystem != null;
			case CorePackage.WORKFLOW__CURRENT_RULE:
				return currentRule != null;
			case CorePackage.WORKFLOW__JGRAPH:
				return jgraph != null;
			case CorePackage.WORKFLOW__LOG_MESSAGE:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.WORKFLOW___GENERATE_GRAPH_FROM_TEMPLATE__EMAP:
				return generateGraphFromTemplate((EMap<String, Tool>)arguments.get(0));
			case CorePackage.WORKFLOW___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT_TASK:
				return getParentTaskByOutDataPort((DataPort)arguments.get(0), (Task)arguments.get(1));
			case CorePackage.WORKFLOW___GET_PARENT_TASKS_BY_OUT_DATA_PORT__DATAPORT:
				return getParentTasksByOutDataPort((DataPort)arguments.get(0));
			case CorePackage.WORKFLOW___VALIDATE_PARENT_TASK_OUT_DATA_PORT__DATAPORT_TASK:
				return validateParentTaskOutDataPort((DataPort)arguments.get(0), (Task)arguments.get(1));
			case CorePackage.WORKFLOW___VALIDATE_LAST_TASK_OUT_DATA_PORT__DATAPORT:
				return validateLastTaskOutDataPort((DataPort)arguments.get(0));
			case CorePackage.WORKFLOW___READ_META_DATA:
				readMetaData();
				return null;
			case CorePackage.WORKFLOW___GET_PARENT_TASKS_FOR__TASK:
				return getParentTasksFor((Task)arguments.get(0));
			case CorePackage.WORKFLOW___RESOLVE_MISSING_DATA_PORTS_BY_TOOL_FOR__TASK:
				return resolveMissingDataPortsByToolFor((Task)arguments.get(0));
			case CorePackage.WORKFLOW___READ_WORKFOW_TEMPLATE:
				return readWorkfowTemplate();
			case CorePackage.WORKFLOW___GENERATE_ABSTRACT_WORKFLOW:
				return generateAbstractWorkflow();
			case CorePackage.WORKFLOW___APPLY_GROUPING_CRITERIA:
				return applyGroupingCriteria();
			case CorePackage.WORKFLOW___APPLY_PARAMETER_CRITERIA:
				return applyParameterCriteria();
			case CorePackage.WORKFLOW___APPLY_TRAVERSAL_EVENT__TRAVERSALEVENT:
				return applyTraversalEvent((TraversalEvent)arguments.get(0));
			case CorePackage.WORKFLOW___RESOLVE_TRAVERSAL_EVENTS:
				return resolveTraversalEvents();
			case CorePackage.WORKFLOW___RESOLVE_INCOMPATIBLE_GROUPINGS:
				return resolveIncompatibleGroupings();
			case CorePackage.WORKFLOW___RESOLVE_PREPROCESSING_TASKS:
				return resolvePreprocessingTasks();
			case CorePackage.WORKFLOW___RESOLVE_TOOL_DEPENDENCIES:
				return resolveToolDependencies();
			case CorePackage.WORKFLOW___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM:
				return generateWorklowForExecutionSystem();
			case CorePackage.WORKFLOW___RUN_NEXT_WORKFLOW_STEP:
				return runNextWorkflowStep();
			case CorePackage.WORKFLOW___RUN_PREV_WORKFLOW_STEP:
				return runPrevWorkflowStep();
			case CorePackage.WORKFLOW___RUN_ENTIRE_WORKFLOW:
				return runEntireWorkflow();
			case CorePackage.WORKFLOW___HAS_NEXT_WORKFLOW_STEP:
				return hasNextWorkflowStep();
			case CorePackage.WORKFLOW___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS:
				return getTotalNumberOfWorkflowSteps();
			case CorePackage.WORKFLOW___GET_WORKFLOW_STEP_LABEL_FOR__STRING:
				return getWorkflowStepLabelFor((String)arguments.get(0));
			case CorePackage.WORKFLOW___GET_WORKFLOW_STEP_DESC_FOR__STRING:
				return getWorkflowStepDescFor((String)arguments.get(0));
			case CorePackage.WORKFLOW___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP:
				return getNumberOfCurrentWorkflowStep();
			case CorePackage.WORKFLOW___GET_NEXT_WORKFLOW_STEP:
				return getNextWorkflowStep();
			case CorePackage.WORKFLOW___GET_CUR_WORKFLOW_STEP:
				return getCurWorkflowStep();
			case CorePackage.WORKFLOW___DELETE:
				return delete();
			case CorePackage.WORKFLOW___RESET_WORKFLOW_STEP:
				return resetWorkflowStep();
			case CorePackage.WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_START__STRING:
				printWorkflowStepMsgOnStart((String)arguments.get(0));
				return null;
			case CorePackage.WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_END__BOOLEAN_STRING_STRING_STRING:
				printWorkflowStepMsgOnEnd((Boolean)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case CorePackage.WORKFLOW___INIT:
				init();
				return null;
			case CorePackage.WORKFLOW___RENDER_TO_STRING:
				return renderToString();
			case CorePackage.WORKFLOW___INIT_LOG_MESSAGE:
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
		result.append(", worker: ");
		result.append(worker);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
