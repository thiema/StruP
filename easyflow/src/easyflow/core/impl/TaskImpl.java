/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.PreprocessingTask;
import easyflow.core.Task;
import easyflow.core.ToolMatch;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.ResolvingParameterFailedException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GlobalVarMetaData;
import easyflow.custom.util.Tuple;
import easyflow.custom.util.Util;
import easyflow.data.Data;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Command;
import easyflow.tool.Condition;
import easyflow.tool.InOutParameter;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Rule;
import easyflow.tool.Tool;
import easyflow.tool.impl.RuleImpl;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;
import easyflow.traversal.TraversalOperation;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToChunksMapImpl;
import easyflow.util.maps.impl.StringToDataLinkMapImpl;
import easyflow.util.maps.impl.StringToStringListMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import easyflow.util.maps.impl.StringToTaskMapImpl;
import easyflow.util.maps.impl.StringToToolMapImpl;
import easyflow.util.maps.impl.StringToToolMatchMapImpl;
import easyflow.util.maps.impl.StringToTraversalEventMapImpl;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.TaskImpl#getInDataPorts <em>In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutDataPorts <em>Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getJexlString <em>Jexl String</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#isUtil <em>Util</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getToolNames <em>Tool Names</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getToolMatches <em>Tool Matches</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getPreviousTaskStr <em>Previous Task Str</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getInputsByDataPort <em>Inputs By Data Port</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutputsByDataPort <em>Outputs By Data Port</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getInputDataPortValidator <em>Input Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutputDataPortValidator <em>Output Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getAnalysisTypes <em>Analysis Types</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getCircumventingParents <em>Circumventing Parents</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getPreprocessingTasks <em>Preprocessing Tasks</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getResolvedCommand <em>Resolved Command</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getUnresolvedOutDataPorts <em>Unresolved Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getParams <em>Params</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getStaticParams <em>Static Params</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getInDataPorts() <em>In Data Ports</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> inDataPorts;

	/**
	 * The cached value of the '{@link #getOutDataPorts() <em>Out Data Ports</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> outDataPorts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJexlString() <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJexlString()
	 * @generated
	 * @ordered
	 */
	protected static final String JEXL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJexlString() <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJexlString()
	 * @generated
	 * @ordered
	 */
	protected String jexlString = JEXL_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUtil()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UTIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUtil() <em>Util</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isUtil()
	 * @generated
	 * @ordered
	 */
	protected boolean util = UTIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger
			.getLogger(Task.class);

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraversalEvents() <em>Traversal Events</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTraversalEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, TraversalEvent> traversalEvents;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Task> parents;

	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<TraversalChunk>> chunks;

	/**
	 * The cached value of the '{@link #getToolNames() <em>Tool Names</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getToolNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<String>> toolNames;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Tool> tools;

	/**
	 * The cached value of the '{@link #getToolMatches() <em>Tool Matches</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getToolMatches()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ToolMatch> toolMatches;

	/**
	 * The default value of the '{@link #getPreviousTaskStr() <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreviousTaskStr()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_TASK_STR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPreviousTaskStr() <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreviousTaskStr()
	 * @generated
	 * @ordered
	 */
	protected String previousTaskStr = PREVIOUS_TASK_STR_EDEFAULT;

	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected int flags = FLAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupingCriteria() <em>Grouping Criteria</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> groupingCriteria;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DataLink> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DataLink> outputs;

	/**
	 * The cached value of the '{@link #getInputsByDataPort() <em>Inputs By Data Port</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInputsByDataPort()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<String>> inputsByDataPort;

	/**
	 * The cached value of the '{@link #getOutputsByDataPort() <em>Outputs By Data Port</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutputsByDataPort()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<String>> outputsByDataPort;

	/**
	 * The cached value of the '{@link #getInputDataPortValidator() <em>Input Data Port Validator</em>}' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInputDataPortValidator()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> inputDataPortValidator;

	/**
	 * The cached value of the '{@link #getOutputDataPortValidator() <em>Output Data Port Validator</em>}' attribute list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getOutputDataPortValidator()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> outputDataPortValidator;

	/**
	 * The cached value of the '{@link #getAnalysisTypes() <em>Analysis Types</em>}' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAnalysisTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> analysisTypes;

	/**
	 * The cached value of the '{@link #getCircumventingParents() <em>Circumventing Parents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircumventingParents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> circumventingParents;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<TraversalChunk> records;

	/**
	 * The cached value of the '{@link #getPreprocessingTasks() <em>Preprocessing Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessingTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingTask> preprocessingTasks;

	/**
	 * The cached value of the '{@link #getResolvedCommand() <em>Resolved Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedCommand()
	 * @generated
	 * @ordered
	 */
	protected Command resolvedCommand;

	/**
	 * The cached value of the '{@link #getUnresolvedOutDataPorts() <em>Unresolved Out Data Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedOutDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> unresolvedOutDataPorts;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> params;

	/**
	 * The cached value of the '{@link #getStaticParams() <em>Static Params</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticParams()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> staticParams;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getInDataPorts() {
		if (inDataPorts == null) {
			inDataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.TASK__IN_DATA_PORTS);
		}
		return inDataPorts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getOutDataPorts() {
		if (outDataPorts == null) {
			outDataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.TASK__OUT_DATA_PORTS);
		}
		return outDataPorts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getJexlString() {
		return jexlString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJexlString(String newJexlString) {
		String oldJexlString = jexlString;
		jexlString = newJexlString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__JEXL_STRING, oldJexlString, jexlString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUtil() {
		return util;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtil(boolean newUtil) {
		boolean oldUtil = util;
		util = newUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__UTIL, oldUtil, util));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogger(Logger newLogger) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, TraversalEvent> getTraversalEvents() {
		if (traversalEvents == null) {
			traversalEvents = new EcoreEMap<String,TraversalEvent>(MapsPackage.Literals.STRING_TO_TRAVERSAL_EVENT_MAP, StringToTraversalEventMapImpl.class, this, CorePackage.TASK__TRAVERSAL_EVENTS);
		}
		return traversalEvents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Task> getParents() {
		if (parents == null) {
			parents = new EcoreEMap<String,Task>(MapsPackage.Literals.STRING_TO_TASK_MAP, StringToTaskMapImpl.class, this, CorePackage.TASK__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<TraversalChunk>> getChunks() {
		if (chunks == null) {
			chunks = new EcoreEMap<String,EList<TraversalChunk>>(MapsPackage.Literals.STRING_TO_CHUNKS_MAP, StringToChunksMapImpl.class, this, CorePackage.TASK__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<String>> getToolNames() {
		if (toolNames == null) {
			toolNames = new EcoreEMap<String,EList<String>>(MapsPackage.Literals.STRING_TO_STRING_LIST_MAP, StringToStringListMapImpl.class, this, CorePackage.TASK__TOOL_NAMES);
		}
		return toolNames;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(MapsPackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, CorePackage.TASK__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ToolMatch> getToolMatches() {
		if (toolMatches == null) {
			toolMatches = new EcoreEMap<String,ToolMatch>(MapsPackage.Literals.STRING_TO_TOOL_MATCH_MAP, StringToToolMatchMapImpl.class, this, CorePackage.TASK__TOOL_MATCHES);
		}
		return toolMatches;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousTaskStr() {
		return previousTaskStr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTaskStr(String newPreviousTaskStr) {
		String oldPreviousTaskStr = previousTaskStr;
		previousTaskStr = newPreviousTaskStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__PREVIOUS_TASK_STR, oldPreviousTaskStr, previousTaskStr));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(boolean newRoot) {
		boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(int newFlags) {
		int oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TASK__GROUPING_CRITERIA);
		}
		return groupingCriteria;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, DataLink> getInputs() {
		if (inputs == null) {
			inputs = new EcoreEMap<String,DataLink>(MapsPackage.Literals.STRING_TO_DATA_LINK_MAP, StringToDataLinkMapImpl.class, this, CorePackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, DataLink> getOutputs() {
		if (outputs == null) {
			outputs = new EcoreEMap<String,DataLink>(MapsPackage.Literals.STRING_TO_DATA_LINK_MAP, StringToDataLinkMapImpl.class, this, CorePackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<String>> getInputsByDataPort() {
		if (inputsByDataPort == null) {
			inputsByDataPort = new EcoreEMap<String,EList<String>>(MapsPackage.Literals.STRING_TO_STRING_LIST_MAP, StringToStringListMapImpl.class, this, CorePackage.TASK__INPUTS_BY_DATA_PORT);
		}
		return inputsByDataPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<String>> getOutputsByDataPort() {
		if (outputsByDataPort == null) {
			outputsByDataPort = new EcoreEMap<String,EList<String>>(MapsPackage.Literals.STRING_TO_STRING_LIST_MAP, StringToStringListMapImpl.class, this, CorePackage.TASK__OUTPUTS_BY_DATA_PORT);
		}
		return outputsByDataPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getInputDataPortValidator() {
		if (inputDataPortValidator == null) {
			inputDataPortValidator = new EDataTypeUniqueEList<Pattern>(Pattern.class, this, CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR);
		}
		return inputDataPortValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getOutputDataPortValidator() {
		if (outputDataPortValidator == null) {
			outputDataPortValidator = new EDataTypeUniqueEList<Pattern>(Pattern.class, this, CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR);
		}
		return outputDataPortValidator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnalysisTypes() {
		if (analysisTypes == null) {
			analysisTypes = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.TASK__ANALYSIS_TYPES);
		}
		return analysisTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCircumventingParents() {
		if (circumventingParents == null) {
			circumventingParents = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.TASK__CIRCUMVENTING_PARENTS);
		}
		return circumventingParents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraversalChunk> getRecords() {
		if (records == null) {
			records = new EObjectResolvingEList<TraversalChunk>(TraversalChunk.class, this, CorePackage.TASK__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessingTask> getPreprocessingTasks() {
		if (preprocessingTasks == null) {
			preprocessingTasks = new EObjectResolvingEList<PreprocessingTask>(PreprocessingTask.class, this, CorePackage.TASK__PREPROCESSING_TASKS);
		}
		return preprocessingTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getResolvedCommand() {
		return resolvedCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolvedCommand(Command newResolvedCommand, NotificationChain msgs) {
		Command oldResolvedCommand = resolvedCommand;
		resolvedCommand = newResolvedCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TASK__RESOLVED_COMMAND, oldResolvedCommand, newResolvedCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedCommand(Command newResolvedCommand) {
		if (newResolvedCommand != resolvedCommand) {
			NotificationChain msgs = null;
			if (resolvedCommand != null)
				msgs = ((InternalEObject)resolvedCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TASK__RESOLVED_COMMAND, null, msgs);
			if (newResolvedCommand != null)
				msgs = ((InternalEObject)newResolvedCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TASK__RESOLVED_COMMAND, null, msgs);
			msgs = basicSetResolvedCommand(newResolvedCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__RESOLVED_COMMAND, newResolvedCommand, newResolvedCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getUnresolvedOutDataPorts() {
		if (unresolvedOutDataPorts == null) {
			unresolvedOutDataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.TASK__UNRESOLVED_OUT_DATA_PORTS);
		}
		return unresolvedOutDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParams() {
		if (params == null) {
			params = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TASK__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getStaticParams() {
		if (staticParams == null) {
			staticParams = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TASK__STATIC_PARAMS);
		}
		return staticParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (Rule)eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TASK__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__RULE, oldRule, rule));
	}

	/*
	 * private EList<String> enumerateInstances(String regexp) { regexp =
	 * "ab(c|d){2,3}"; RegExp r = new RegExp(regexp); Automaton a =
	 * r.toAutomaton(); String s = "abcccdc"; System.out.println("Match: " +
	 * a.run(s)); // prints: true
	 * 
	 * logger.debug(regexp+": "+a.getFiniteStrings());
	 * 
	 * return null; }
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void readTask(String wtplLine, String defaultMode,
			EList<String> defaultGroupingCriteria) {

		short taskField          =  0;
		short taskType           =  1;
		short toolField          =  2;
		short inDataPortField    =  3;
		short outDataPortField   =  4;
		short groupingCritField  =  5;
		short traversalCritField =  6;
		short preprocessField    =  7;
		short jexlField          =  8;
		short paramField         =  9;
		short staticParamField   = 10;

		/**
		 * Read string into an array of strings. Process array and set task
		 * attributes appropriately.
		 */
		String[] wtplArray = wtplLine.split("\t");

		String[] tmp;
		// logger.debug(wtplArray[0]);
		setName(wtplArray[taskField]);
		for (String parent : wtplArray[taskType].split(",")) {
			tmp = parent.split(":");
			if (tmp[0].equals("STATIC")) {
				setUtil(true);
				if (tmp.length > 1)
					getAnalysisTypes().add(tmp[1]);
			}
			// the actual parents are resolved by class EasyflowTemplate
			// else
			// getParents().put(tmp[0], null);
		}
		/**
		 * Parse the tools field. Check for multiple implementing tools
		 */
		if (!wtplArray[toolField].isEmpty()) {
			tmp = wtplArray[toolField].split(",");
			for (int i = 0; i < tmp.length; i++) {
				getToolNames().put(tmp[i], new BasicEList<String>());
			}
		}

		/**
		 * Read DataFormatIn/Out. and set DataPorts
		 */
		String debugDataPort = "in=(";
		short bitPos = 0;
		boolean hasIndataPorts = false;
		for (String dataPortField : wtplArray[inDataPortField].split(";")) {
			DataPort dataPort = parseDataPortField(dataPortField,
					inputDataPortValidator, false);
			if (dataPort == null || dataPort.getName().equals(""))
				break;
			else
				hasIndataPorts = true;
			getInDataPorts().add(dataPort);
			dataPort.setBitPos(bitPos++);
			debugDataPort += dataPort.getName() + ", ";
		}
		debugDataPort += ") out=(";
		bitPos = 0;
		boolean hasOutdataPorts = false;
		for (String dataPortField : wtplArray[outDataPortField].split(";")) {
			DataPort dataPort = parseDataPortField(dataPortField,
					outputDataPortValidator, true);
			if (dataPort == null || dataPort.getName().equals(""))
				break;
			else
				hasOutdataPorts = true;
			getOutDataPorts().add(dataPort);
			dataPort.setBitPos(bitPos++);
			debugDataPort += dataPort.getName() + ", ";
		}
		debugDataPort += ") ";
		
		/**
		 * Read Data(Grouping)Criteria.
		 */
		// skip if line ended or record empty
		String groupingStr = "";
		if ((wtplArray.length > 5)) {
			groupingStr = wtplArray[groupingCritField];
		}
		// create grouping cirt for any task
		if (hasIndataPorts) {
			readGroupingCriteria(groupingStr, defaultGroupingCriteria, defaultMode);
		}
		// create a grouping crit for root as well
		else if (hasOutdataPorts)
		{
			createGroupingCriteria(groupingStr, getOutDataPorts().get(0), defaultMode);
		}


		/**
		 * Read the traversal Expression
		 * 
		 * for example: splitting and merging criteria
		 */

		if (wtplArray.length > 6) {
			readTraversalCriteria(wtplArray[traversalCritField]);
		}

		/**
		 * Read the preprocessing tasks
		 */
		if (wtplArray.length > 7 && !wtplArray[preprocessField].equals("")) {
			tmp = wtplArray[preprocessField].split(";");
			int dpIdx = 0;
			for (String allPrepStr : tmp) {
				
				if (allPrepStr.equals(""))
				{
					dpIdx++;
					continue;
				}
				String[] allPreps = allPrepStr.split(",");
				for (String prepTaskStr : allPreps) {
					String[] tmp2 = prepTaskStr.split(":");
					PreprocessingTask prepTask = CoreFactory.eINSTANCE
							.createPreprocessingTask();
					prepTask.setName(tmp2[0]);
					prepTask.setDataPortIndex(dpIdx);
					if (tmp2.length > 1)
						prepTask.setExpression(tmp2[1]);
					getPreprocessingTasks().add(prepTask);
				}
				dpIdx++;
			}
		}

		/**
		 * Read JEXL
		 */
		if (wtplArray.length > 8) {
			setJexlString(wtplArray[jexlField]);
			// logger.debug(shallProcessJEXL);
		}
		
		// read params
		if (wtplArray.length > 9 && !wtplArray[paramField].equals(""))
		{
			tmp = wtplArray[paramField].split(":");
			getParams().put(tmp[0], tmp.length > 1 ? tmp[1] : "");
		}
		
		// read static param (optional first)
		if (wtplArray.length > 10 && !wtplArray[staticParamField].equals(""))
		{
			getStaticParams().put(GlobalConstants.PARAM_OPTIONAL, wtplArray[staticParamField]);
		}
		// positional afterwards
		if (wtplArray.length > 11 && !wtplArray[staticParamField+1].equals(""))
		{
			getStaticParams().put(GlobalConstants.PARAM_POSITIONAL, wtplArray[staticParamField+1]);
		}
		setPreviousTaskStr(getUniqueString());

		String out = Util.traversalEvents2String(getTraversalEvents());
		logger.debug("readTask(): " + getUniqueString() + " (traversalEvents: "+ out + ") "
				+ debugDataPort + " jexl exp='" + getJexlString() + "'");
		
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean readGroupingCriteria(String field, EList<String> defaultGroupingCriteria, String defaultMode)
	{
		boolean rc = true;
		short dataPortNo = 0;
		
		// String[] groupingStrA=groupingStr.split(";");
		for (String groupingString : field.split(";")) {
			String[] tmp;
			DataPort dataPort = null;
			if (groupingString.equals("")) {
				tmp = (String[]) defaultGroupingCriteria.toArray();
				dataPort = getInDataPorts().get(dataPortNo++);
			} else {
				tmp = groupingString.split(";");
				if (tmp.length > 1) {
					dataPort = getDataPortByName(tmp[0], false);
					groupingString = tmp[1];
				} else
					dataPort = getInDataPorts().get(dataPortNo++);
				tmp = groupingString.split(",");
			}
			logger.trace("readTask(): task=" + getName() + " grouping=" + groupingString
					+ " dataPort=" + dataPort.getName() + " ("
					+ getInDataPorts().size() + ","
					+ getOutDataPorts().size() + ")");

			if (tmp.length > 0) {
				for (int i = 0; i < tmp.length; i++) {
					createGroupingCriteria(tmp[i], dataPort, defaultMode);
				}
			}
		}
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean readTraversalCriteria(String field)
	{
		boolean rc = true;
		if (!field.equals("")) {
			String[] tmp = field.split(";");
			// logger.debug(tmp.length);
			for (int i = 0; i < tmp.length; i++) {
				// travParamExp, expected of the form:
				// <TraversalName(ID)>:<Tools ParamName>:<instances enclosed
				// in brackets or name of operation that produces/retrieves
				// instances>
				String[] travParamExp = tmp[i].split(":");
				// logger.debug(tmp1.length);
				// if (!travParamExp[0].equals("")) {

				TraversalCriterion traversalCriterion = TraversalFactory.eINSTANCE
						.createTraversalCriterion();
				traversalCriterion.setId(travParamExp[0]);
				if (getInDataPorts().size() > i
						&& getInDataPorts().get(i) != null) {
					traversalCriterion.setDataPort(getInDataPorts().get(0));
				}
				traversalCriterion.setName(travParamExp[1]);
				traversalCriterion.setMode("batch");
				TraversalOperation traversalOperation = TraversalFactory.eINSTANCE
						.createTraversalOperation();
				String[] operation = null;
				if (travParamExp.length > 2) {
					operation = travParamExp[2].split("=");
					if (operation.length > 1) {
						traversalOperation.setName(operation[0]);
						traversalOperation.setType("split");
					} else {
						traversalOperation.setName(travParamExp[2]);
						traversalOperation.setType("merge");
					}
				} else {
					traversalOperation.setName("default");
					traversalOperation.setType("merge");
				}

				TraversalEvent traversalEvent = TraversalFactory.eINSTANCE
						.createTraversalEvent();

				// here we parse the 3rd part of the parameter traversal
				// expression like TraversalName:ParamName:values=[a,b,c]
				if (operation != null && operation.length > 1) {
					if (!operation[1].startsWith("["))
						traversalCriterion.setChunkSource(operation[1]);
					else {
						String noBrackets = operation[1].substring(1,
								operation[1].length() - 1);
						logger.debug("readTask(): parsed values for parameter traversal expression to '"
								+ noBrackets + "' for name=" + operation[0]);
						String[] tmp2 = noBrackets.split(",");
						for (String tmp3 : tmp2) {
							TraversalChunk traversalChunk = TraversalFactory.eINSTANCE
									.createTraversalChunk();
							traversalChunk.setName(tmp3);
							traversalCriterion.getChunks().put(tmp3,
									traversalChunk);
						}
					}
				}

				traversalCriterion.setOperation(traversalOperation);
				traversalEvent.setTraversalCriterion(traversalCriterion);
				//if (traversalOperation.getType().equals("split"))
					
				if (traversalOperation.getType().equals("merge"))
					traversalEvent.getMergeTask().add(this);
				else
					traversalEvent.setSplitTask(this);
				logger.trace("readTask(): " + "adding travcrit: "
						+ traversalCriterion.getId() + " ");
				getTraversalEvents().put(traversalCriterion.getId(),
						traversalEvent);
				// }
				// }
			}
		}
		return rc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean createGroupingCriteria(String groupingCritStr, DataPort dataPort, String defaultMode)
	{
		boolean rc = true;
		TraversalCriterion traversalCriterion = TraversalFactory.eINSTANCE
				.createTraversalCriterion();
		traversalCriterion.setDataPort(dataPort);
		//String[] group = tmp[i].split(":");
		String[] group = groupingCritStr.split(":");
		if (group.length > 1)
			traversalCriterion.setMode(group[1]);
		else
			traversalCriterion.setMode(defaultMode);

		TraversalEvent traversalEvent = TraversalFactory.eINSTANCE
				.createTraversalEvent();
		traversalCriterion.setId(group[0]);
		logger.trace("readTask(): "
				+ " set grouping criterion="
				+ traversalCriterion.getId());

		TraversalOperation traversalOperation = TraversalFactory.eINSTANCE
				.createTraversalOperation();
		traversalOperation.setType("grouping");
		traversalCriterion.setOperation(traversalOperation);

		traversalEvent.setTraversalCriterion(traversalCriterion);
		traversalEvent.setSplitTask(this);
		logger.trace("readTask(): " + "adding grouping "
				+ "criterion="+ traversalCriterion.getId() 
				+ " with mode="+traversalCriterion.getMode());
		getTraversalEvents().put(traversalCriterion.getId(),
				traversalEvent);
		getGroupingCriteria().put(traversalCriterion.getId(),
				traversalCriterion.getMode());
		dataPort.getGroupingCriteria().add(traversalCriterion);
		return rc;
	}
	
	private DataPort parseDataPortField(String field, EList<Pattern> pattern, boolean isOutDataPort) {
	
		//the dataport consists of: DataPort1=[PortName:]DataFormat,DataFormat2,...
		DataPort dataPort = DataFactory.eINSTANCE.createDataPort();
		String[] tmp = field.split(":");
		String dataPortString = tmp[0];
		String dataFormatString;
		
		if (tmp.length > 1) {
			dataPort.setName(dataPortString);
			dataFormatString = tmp[1];
			if (tmp.length > 2)
				logger.warn("readTask(): unexpected format detected: multiple occurance of ':'.");
		} else
			dataFormatString = dataPortString;

		Iterator<DataFormat> it = parseDataFormatField(dataFormatString,
				pattern).iterator();

		while (it.hasNext()) {

			DataFormat dataFormat = it.next();
			// enumerateInstances(dataFormat.getName());
			dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
			if (dataPort.getName() == null || dataPort.getName().equals(""))
				dataPort.setName(dataFormat.getName());
		}
		
		DataPort knownDataPort = getDataPortByDataPort(dataPort, isOutDataPort);
		if (knownDataPort != null)
		{
			if (isOutDataPort)
				getOutDataPorts().remove(knownDataPort);
			else
				getInDataPorts().remove(knownDataPort);
		}
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<DataFormat> parseDataFormatField(String dataFormatString,
			EList<Pattern> pattern) {
		
		String[] overall = dataFormatString.split(";");
		if (overall.length > 1) {
			// String[] tmp=overall[1].split(regex)
			int i = 1;
			while (i < overall.length)
				pattern.add(Pattern.compile(overall[i++]));
		}
		String[] tmp = overall[0].split(",");
		EList<DataFormat> list = new BasicEList<DataFormat>();
		for (int i = 0; i < tmp.length; i++) {
			// System.out.println(tmp[i]);
			DataFormat dataFormat = DataFactory.eINSTANCE.createDataFormat();
			dataFormat.setName(tmp[i]);
			list.add(dataFormat);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean shallProcess(EList<GroupingInstance> groupingInstances,
			String forGrouping) {
		
		boolean requireAll = false;
		
		String exp = getJexlString();
		for (EMap<String, Object> map : easyflow.custom.util.Util.createMetaDataMapForJexl(groupingInstances, forGrouping))
		{
			logger.debug("shallProcess(): exp="+exp+" map="+map);
			
			Object evalObject = easyflow.custom.util.Util.evaluateJexl(map, getJexlString());
			
			boolean shallProcess = shallProcess(evalObject);
			if (!requireAll && shallProcess)
				return true;
			else if (requireAll && !shallProcess)
				return false;
		}
		if (requireAll)
			return true;
		return false; 
	}
	
	public boolean shallProcess(EList<GroupingInstance> groupingInstances,
			String forGrouping, EList<String> jexlStrings, boolean isInverse)
	{
		boolean requireAll = false;
		
		for (EMap<String, Object> map : easyflow.custom.util.Util.
				createMetaDataMapForJexl
					(groupingInstances,	forGrouping))
		{
			boolean shallProcess =shallProcess(groupingInstances, forGrouping, jexlStrings, isInverse, map);
			if (!requireAll && shallProcess)
				return true;
			else if (requireAll && !shallProcess)
				return false;
			
		}
		if (requireAll)
			return true;
		return false; 
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean shallProcess(EList<GroupingInstance> groupingInstances,
			String forGrouping, EList<String> jexlStrings, boolean isInverse, EMap<String, Object> map) {

		
		if (jexlString != null)
			for (String jexlString : jexlStrings) {
				boolean shallProcess = shallProcess(
						easyflow.custom.util.Util.
							evaluateJexl(map, jexlString));
				if (isInverse)
					shallProcess = !shallProcess;
				if (!shallProcess)
					return false;
			}
		return true;
	}

	private boolean shallProcess(Object evalObject) {
		if (evalObject instanceof Boolean) {
			return (Boolean) evalObject;
			// return true;
		}
		return true;

	}

	private String getUniqueString_(String sep1, String sep2, String sep3)
	{
		String uniq = getName();
		// Iterator<?,?> it =
		// (Iterator<Map.Entry<String,?>>)(Iterator<?>)delegateEList.iterator()
		Iterator<Entry<String, EList<TraversalChunk>>> it = getChunks()
				.iterator();
		// for (String key:getChunks().keySet())
		while (it.hasNext()) {
			String key = it.next().getKey();
			// logger.debug();

			uniq += sep2 + key + sep3;
			String[] tmp = new String[getChunks().get(key).size()];
			// logger.debug("getUniqueString(): "+key+" "+tmp.length+" "+getChunks().get(key));
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = getChunks().get(key).get(i).getName();
				// logger.debug(tmp[i]);
			}
			uniq += StringUtils.join(tmp, sep1);
		}
		/*
		 * Iterator<DataPort> it1=getInDataPorts().iterator();
		 * 
		 * while (it1.hasNext()) { Iterator<GroupingCriterion>
		 * it2=it1.next().getGroupingCriteria().iterator(); while
		 * (it2.hasNext()) { GroupingCriterion groupingCriterion=it2.next();
		 * uniq+="_"+groupingCriterion.getName(); //groupingCriterion.g } }
		 */
		return uniq;

	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public String getUniqueString() {
		return getUniqueString_("-", "_", ":");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueURIString() {
		return getUniqueString_("-", "_", "_");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean isCompatibleWithOutDataPortFor(DataPort dataPort) {
		
		Iterator<DataPort> it1 = getInDataPorts().iterator();
		while (it1.hasNext()) {
			DataPort parentDataPort = it1.next();
			if (parentDataPort.isCompatible(dataPort))
				return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean isCompatibleWithInDataPortFor(DataPort dataPort) {
		
		Iterator<DataPort> it1 = getOutDataPorts().iterator();
		while (it1.hasNext()) {
			DataPort parentDataPort = it1.next();
			if (parentDataPort.isCompatible(dataPort))
				return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public Task getParentTaskByOutDataPort(DataPort dataPort) {
		Iterator<Task> it = getParents().values().iterator();
		EList<Task> tasks = new BasicEList<Task>();
		while (it.hasNext()) {
			Task parentTask = it.next();
			logger.trace("getParentTaskByOutDataPort(): is task="
					+ parentTask.getUniqueString()
					+ " compatible with dataPort="
					+ dataPort.getName()
					+ " :"
					+ (parentTask.isCompatibleWithInDataPortFor(dataPort) ? "yes"
							: "no"));
			if (parentTask.isCompatibleWithInDataPortFor(dataPort))
				tasks.add(parentTask);
		}
		if (tasks.size() > 1)
			logger.debug("getParentTaskByOutDataPort(): "
					+ "More than one compatible parents found with DataPort="
					+ dataPort.getName() + ". Return only first.");
		else if (tasks.isEmpty())
			logger.debug("getParentTaskByOutDataPort(): "
					+ "No compatible parent with DataPort="
					+ dataPort.getName() + " found. Returning null.");
		return (tasks.size() > 0) ? tasks.get(0) : null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, String> getValidInOutDataPortCombinations()
	{
		EMap<String, String> combis = new BasicEMap<String, String>();
		for (DataPort dataPortIn : getInDataPorts())
			for (DataPort dataPortOut : getOutDataPorts())
				combis.put(dataPortIn.getFormat().getName(), dataPortOut.getFormat().getName());
		return combis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EMap<String, EList<TraversalChunk>> getNonOveralppingTraversalChunksFor(
			Task task) {
		EMap<String, EList<TraversalChunk>> nonOverlappingChunks = new BasicEMap<String, EList<TraversalChunk>>();
		for (String key : task.getChunks().keySet()) {
			logger.trace("getNonOveralppingTraversalChunksFor(): " + key
					+ " add:" + !getChunks().containsKey(key));
			if (!getChunks().containsKey(key)) {
				int i = 0;
				String tmp[] = new String[task.getChunks().get(key).size()];
				for (TraversalChunk traversalChunk : task.getChunks().get(key))
					tmp[i++] = traversalChunk.getName();
				nonOverlappingChunks.put(StringUtils.join(tmp, "-"), task
						.getChunks().get(key));
				logger.trace("getNonOveralppingTraversalChunksFor(): "
						+ StringUtils.join(tmp, "-"));
			}
		}
		return nonOverlappingChunks;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void readTools(EList<Tool> tools) {
		for (Tool tool : tools) {
			if (getToolNames().containsKey(tool.getName())) {
				logger.debug("found tool with name:" + tool.getName());
				if (getTools().containsKey(tool.getId()))
					logger.warn("override tool:" + tool.getId());
				getTools().put(tool.getId(), tool);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public Tool getPreferredTool() {
		if (getTools().isEmpty())
			return null;
		else {
			Iterator<Entry<String, Tool>> it = getTools().iterator();
			while (it.hasNext()) {
				Entry<String, Tool> entry = it.next();
				if (getToolMatches().containsKey(entry.getKey()))
					if (getToolMatches().get(entry.getKey()).isValid())
						return entry.getValue();
			}
		}

		return getTools().get(0).getValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<DataPort> getOverlappingDataPorts(EList<DataPort> dataPorts1,
			EList<DataPort> dataPorts2) {
		EList<DataPort> dataPorts = new BasicEList<DataPort>();
		for (DataPort dataPort1 : dataPorts1)
			for (DataPort dataPort2 : dataPorts2) {
				logger.trace("getOverlappingDataPorts(): check "
						+ dataPort1.getName() + " "+dataPort1.getDataFormats().keySet() + " vs " 
						+ dataPort2.getName()+ " "+dataPort2.getDataFormats().keySet()+" "+dataPort2.isCompatible(dataPort1));
				if (dataPort2.isCompatible(dataPort1))
					dataPorts.add(dataPort1);
			}
		return dataPorts;

	}

	public String getCommandLinePattern()
	{
		if (getResolvedCommand().getCommandPattern() != null)
			return getResolvedCommand().getCommandPattern();
		else if (getPreferredTool().getPackage().getCommandPattern() != null)
			return getPreferredTool().getPackage().getCommandPattern();
		else
			return GlobalConfig.getCommandPattern();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<URI> getOutputsForDataPort(DataPort dataPort) {
		String dataPortName = dataPort.getName();
		EList<URI> outputs = new BasicEList<URI>();
		if (getOutputsByDataPort().containsKey(dataPortName)) {
			for (String key : getOutputsByDataPort().get(dataPortName)) {
				outputs.add(getOutputs().get(key).getDataResourceName());
			}
			return outputs;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<URI> getInputsForDataPort(DataPort dataPort) {
		String dataPortName = dataPort.getName();
		EList<URI> inputs = new BasicEList<URI>();
		if (getInputsByDataPort().containsKey(dataPortName)) {
			for (String key : getInputsByDataPort().get(dataPortName)) {
				inputs.add(getInputs().get(key).getDataResourceName());
			}
			return inputs;
		}
		return null;
	}


	public void resolveParams() throws DataLinkNotFoundException, ParameterNotFoundException, NoValidInOutDataException
	{
		
//		resolveParams(getInputs(),  getPreferredTool(), false);
	//	resolveParams(getOutputs(), getPreferredTool(), true);
		/*
		if (GlobalVar.getCells().get(getUniqueString()) == null)
			logger.error("resolveParams(): no cell found for "+getUniqueString());
		
		EMap<String, DataLink> inputParams = new BasicEMap<String, DataLink>();
		
		for (Object edge : GlobalVar
					.getGraph()
						.getIncomingEdges(
								GlobalVar.getCells()
									.get(getUniqueString()))) 
		{
			DataLink dataLink = JGraphXUtil.loadDataLink(edge);
			if (dataLink.getParamStr() != null && !dataLink.getParamStr().equals(""))
				inputParams.put(new Integer(dataLink.getId()).toString(), dataLink);
		}
		resolveParams(inputParams, getPreferredTool(), false);

		
		EMap<String, DataLink> outputParams = new BasicEMap<String, DataLink>();
		
		Object edges[] = GlobalVar
				.getGraph()
					.getOutgoingEdges(
							GlobalVar.getCells()
								.get(getUniqueString()));
		
		EList<String> unique = new BasicEList<String>();
		for (Object edge : edges) 
		{
			DataLink dataLink = JGraphXUtil.loadDataLink(edge);
			if (dataLink.getParamStr() != null && !dataLink.getParamStr().equals("")
					&& !unique.contains(dataLink.getParamStr()))
			{
				outputParams.put(new Integer(dataLink.getId()).toString(), dataLink);
				unique.add(dataLink.getParamNameStr());
			}
		}
		resolveParams(outputParams, getPreferredTool(), true);
		*/
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isIdentityTransformation() {
		
		return isCompatibleWithInDataPortFor(getOutDataPorts().get(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isIdentityTransformation(DataPort dataPort) {
		
		return (getDataPortByDataPort(dataPort, true)  != null &&
				getDataPortByDataPort(dataPort, false) != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataPort retrieveDataPort(boolean isOutput, int strategy) {
		
		Iterator<DataPort> it;
		if (isOutput)
			it = getOutDataPorts().iterator();
		else
			it = getInDataPorts().iterator();
		
		if (strategy == GlobalConstants.RETRIEVE_DATA_PORT_STRATEGY_FIRST)
			return it.next();

		while (it.hasNext())
		{
			DataPort dataPort = it.next();
			if (strategy == GlobalConstants.RETRIEVE_DATA_PORT_STRATEGY_PRIMARY)
				return dataPort;
			if (strategy == GlobalConstants.RETRIEVE_DATA_PORT_STRATEGY_LAST && !it.hasNext())
				return dataPort;
		}
		
		return null;
	}	

	
	static EMap<String, Object> constraints = new BasicEMap<String, Object>();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> resolveCommandLinePartExe() {
		
		//EMap<String, Object> constraints = new BasicEMap<String, Object>();
		Tool           tool = getPreferredTool();
		ResolvedParam  exe              = tool.getExe();
		EList<String>  cmdParts         = new BasicEList<String>();
		Parameter      defaultParameter = GlobalConfig.getExeParameterTemplate();
		EList<String>  cmd;
		
		if (Util.debugTool(tool))
		{
			tool.getCommand();
		}
				
		if (exe != null)
		{
			logger.debug("resolveCommandLinePartExe(): "+exe.resolveName());
			
			EMap<String, URI>  resolvingMap = tool.getPackage() != null ? 
				tool.getPackage().getResolveUriMap() : null;
			if (resolvingMap != null && resolvingMap.containsKey(exe.resolveName()))
				constraints.put("path", resolvingMap.get(exe.resolveName()));
			else
				constraints.removeKey("path");
			
			cmd = exe.generateCommandString(constraints, defaultParameter);
			if (!cmd.isEmpty())
				//cmdParts.add(StringUtils.join(cmd, tool.getCmdPartDelimiter()));
				cmdParts.addAll(cmd);

			for (ResolvedParam param : tool.getModuleParams())
			{
				logger.debug("resolveCommandLinePartExe(): "+param.getName()+" "+param.resolveName());
				cmd = param.generateCommandString(constraints, defaultParameter);
				if (!cmd.isEmpty())
					cmdParts.add(StringUtils.join(cmd, tool.getCmdPartDelimiter()));
					//cmdParts.addAll(cmd);
			}
			
			// check submodule
		}
		else
		{
			logger.debug("resolveCommandLinePartExe(): no exe part defined.");
		}
		
		if (!cmdParts.isEmpty())
		{
		} 
		else if (exe != null)
		{
			logger.warn("resolveCommandLinePartExe(): could not resolve exe part.");
		}
		
		return cmdParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String resolveCommandLinePartAnalysisType() throws ParameterNotFoundException, NoValidInOutDataException {
		
		//EList<String>  cmdParts         = new BasicEList<String>();
		EList<String>      cmd;
		Tool               tool             = getPreferredTool();
		Parameter          defaultParameter = GlobalConfig.getExeParameterTemplate();
		EMap<String, URI>  pkgResolvingMap  = tool.getPackage() != null ? 
				tool.getPackage().getResolveUriMap() : null;
		Tuple<Parameter, OptionValue> anaType = tool.getAnalysisTypeOfPackage(getRecords());
		//logger.debug("createCommandLinePart(): get analysis type with records="+Util.list2String(getRecords(), null));
		
		if (Util.debugTool(tool))
		{
			tool.getCommand();
		}
		
		if (anaType != null)
		{
			Parameter   param = anaType.parent;
			OptionValue value = anaType.child;
			
			EMap<String, URI>  resolvingMap = tool.getResolveUriMap();
			
			if (resolvingMap != null && resolvingMap.containsKey(param.resolveName()))
				constraints.put("path", resolvingMap.get(param.resolveName()));
			else if (pkgResolvingMap != null && pkgResolvingMap.containsKey(param.resolveName()))
				constraints.put("path", pkgResolvingMap.get(param.resolveName()));
			else
				constraints.removeKey("path");

			logger.debug("resolveCommandLinePartAnalysisType(): add module="+param.resolveName()+" for tool="+tool.getName()
					+" ("+tool.getId()+") cmdline="+param.generateCommandString(constraints, value, defaultParameter));

			cmd = param.generateCommandString(constraints, value, defaultParameter);
			if (!cmd.isEmpty())
				return StringUtils.join(cmd, tool.getCmdPartDelimiter());

		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> resolveCommandLinePartInterpreter() {

		//EMap<String, Object> constraints = new BasicEMap<String, Object>();
		Tool           tool             = getPreferredTool();
		Parameter      defaultParameter = GlobalConfig.getExeParameterTemplate();
		EList<String>  cmdParts         = new BasicEList<String>();
		ResolvedParam  interpreter      = tool.getInterpreter();
		
		EList<String>  cmd;
		Tool           interpreterTool  = null;
		
		String         defaultDelimiter = GlobalConfig.getArgDelimiter();
		String         interpreterDelim = defaultDelimiter;

		EMap<String, URI>  pkgResolvingMap = tool.getPackage() != null ? 
				tool.getPackage().getResolveUriMap() : null;
				
		//Command c = getCommand();
		if (Util.debugTool(interpreterTool) || Util.debugTool(tool))
		{
			tool.getCommand();
		}

		if (interpreter != null)
		{
			String interpreterName = interpreter.getParameter().getName();
			logger.debug("resolveCommandLinePartInterpreter(): create cmd for interpreter="+interpreterName);
			
			EMap<String, URI>  resolvingMap = null;
			if (GlobalConfig.getTools().containsKey(interpreterName))
			{
				interpreterTool  = GlobalConfig.getTools().get(interpreterName);
				resolvingMap     = interpreterTool.getResolveUriMap();
				interpreterDelim = interpreterTool.getCmdPartDelimiter();
			}
			
			if (resolvingMap != null && resolvingMap.containsKey(GlobalConstants.COMMAND_PART_VALUE_EXE))
				constraints.put("path", resolvingMap.get(GlobalConstants.COMMAND_PART_VALUE_EXE));
			else
				constraints.removeKey("path");

			cmd = interpreter.generateCommandString(constraints, defaultParameter);
			
			if (!cmd.isEmpty())
			{
				cmdParts.addAll(cmd);
				
				for (ResolvedParam param : tool.getInterpreterParams())
				{
					if (!cmd.isEmpty())
					{
						//Parameter curDefaultParam = tool.getTemplateParameter(param.getParameter()) 
						Parameter curDefaultParam = interpreterTool.getTemplateParameter(param.getParameter());
						
						logger.debug("resolveCommandLinePartInterpreter():  param name="+param.resolveName()+" keys="+(pkgResolvingMap != null ? pkgResolvingMap.keySet() : null));
						constraints.removeKey("path");
						if (pkgResolvingMap != null && pkgResolvingMap.containsKey(param.resolveName()))
						{
							if (param.getValue().isEmpty())
								param.getValue().add(pkgResolvingMap.get(param.resolveName()));
							else if (!param.getValue().contains(pkgResolvingMap.get(param.resolveName())))
								constraints.put("path", pkgResolvingMap.get(param.resolveName()));
						}
						else if (resolvingMap != null && resolvingMap.containsKey(param.resolveName()))
						{
							if (param.getValue().isEmpty())
								param.getValue().add(resolvingMap.get(param.resolveName()));
							else if (!param.getValue().contains(resolvingMap.get(param.resolveName())))
								constraints.put("path", resolvingMap.get(param.resolveName()));
						}
						else
							constraints.removeKey("path");
	
						cmd = param.generateCommandString(constraints, curDefaultParam != null ? curDefaultParam : defaultParameter);
						if (cmd != null && !cmd.isEmpty())
							cmdParts.add(StringUtils.join(cmd, interpreterDelim));						
							//cmdParts.addAll(cmd);
					}
					else
						logger.debug("resolveCommandLinePartInterpreter(): found interpreter param: "+param.resolveName()+" "
								+param.getParameter().getName()+" (skip, because no interpreter found.)");
				}					
			}
			else
			{
				logger.debug("resolveCommandLinePartInterpreter(): could not resolve interpreter part.");
			}
		}
		else
		{
			logger.debug("resolveCommandLinePartInterpreter(): no interpreter defined.");
		}
		
		return cmdParts;
	}
	
	/**
	 * creates commandline or parts of it with respect to the requested part (type). 
	 * 
	 *  
	 * Example usage: 
	 * 
	 *  -get input part of command line, the omit-params dont care: 
	 *     createCommandLinePart2("in", xxx, xxx)
	 * 
	 *  -get output part of command line, the omit-params dont care:
	 *     createCommandLinePart2("out", xxx, xxx)
	 *     
	 *  -get optional params of command line:
	 *     createCommandLinePart2("opt", true, true)   - omit any inputs/output parameter
	 *     createCommandLinePart2("opt", false, false) - include in/out
	 *     
	 *  -get positional part of command line:
	 *     createCommandLinePart2("pos", true, false)  - include input, exclude output
	 *     createCommandLinePart2("pos", false, true)  - ...
	 *     
	 * @param cmdLinePart
	 * @param omitInput
	 * @param omitOutput

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */	
	public EList<String> resolveCommandLinePart(String cmdLinePart, boolean omitInput, boolean omitOutput) throws ParameterNotFoundException, NoValidInOutDataException 
	{
		//EMap<String, Object> constraints = new BasicEMap<String, Object>();
		constraints.removeKey("path");
		EList<String> commandLinePart = new BasicEList<String>();
		Parameter     effectiveTemplateParam;
		Tool          tool = getPreferredTool();
		String        type = cmdLinePart;
		
		if (type == null)
		{
			logger.error("resolveCommandLinePart(): command line part specifier empty.");
			return commandLinePart;
		}
		
		if (tool == null)
			tool = getPreferredTool();
		
		//Command c = getCommand();
		if (Util.debugTool(tool))
		{
			tool.getCommand();
		}

		Iterator<Entry<String, ResolvedParam>> it = getResolvedCommand().getResolvedParams().iterator();
		logger.debug("resolveCommandLinePart(): all (unfiltered) params: "+getResolvedCommand().getResolvedParams().keySet());
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e      = it.next();
			ResolvedParam    resolvedParam      = e.getValue();
			logger.debug("createCommandLinePart(): process parameter "+resolvedParam.renderToString());
			boolean          isConditional      = resolvedParam.getConditionalParam() != null && 
					resolvedParam.getChildParams().containsKey(resolvedParam.getConditionalParam());
			//Parameter        parameter          = resolvedParam.getParameter();
			//Parameter        effectiveParameter = null;
			EList<ResolvedParam> effectiveResolvedParams    = resolvedParam.getEffectiveParameters(null, null);
			effectiveTemplateParam = null;
			//if (!effectiveParams.isEmpty())
				//effectiveParameter = retrieveEffectiveParam(effectiveParams, constraints);
			//String s = null;
			Iterator<ResolvedParam> itEffParam = effectiveResolvedParams.iterator();
			while (itEffParam.hasNext())
			{
				
				ResolvedParam effectiveResolvedParam = itEffParam.next();
				//if (!effectiveResolvedParam.isResolved())
					//continue;
				//else 
				//if (effectiveResolvedParam.getParameter().getType().equalsIgnoreCase("select"))
					//continue;
				logger.debug("createCommandLinePart():  process parameter "+effectiveResolvedParam.renderToString());
				
				if (effectiveResolvedParam.getValue() == null || effectiveResolvedParam.getValue().isEmpty())
					effectiveResolvedParam.getValue().addAll(resolvedParam.getValue());
			//overwrite current resolved param if conditional param occurred
				Parameter parameter = effectiveResolvedParam.getParameter().getMergedParameter(null, false);
				
				InOutParameter   inOutParameter = null;
				boolean          isInOutParam   = false;
				boolean          shallGenerate  = false;
				
				if (parameter instanceof InOutParameter)
				{
					inOutParameter = (InOutParameter) parameter;
					isInOutParam   = true;
				}
				/*else if (effectiveParameter.isDataParam())
				{
					inOutParameter = (InOutParameter) effectiveParameter;
					isInOutParam   = true;
				}*/
				logger.trace("createCommandLinePart(): search template param for param="+parameter.renderToString());
				{}
				effectiveTemplateParam = tool.getTemplateParameter(parameter);
				if (effectiveTemplateParam == null)
					effectiveTemplateParam = tool.getTemplateParameter();
				else
					logger.trace("createCommandLinePart(): found template param="+effectiveTemplateParam.renderToString());
				
				boolean isOptional   = parameter.isOptional  (effectiveTemplateParam == null ? null : effectiveTemplateParam.isOptional(null));
				boolean isPositional = parameter.isPositional(effectiveTemplateParam == null ? null : effectiveTemplateParam.isPositional(null));
				if (!isOptional && !isPositional)
				{
					if (isInOutParam)
					{
						if (GlobalConfig.assumePositionalDataParam())
							isPositional = true;
						else
							isOptional = true;
					}
					else
					{
						if (GlobalConfig.assumePositionalParam())
							isPositional = true;
						else
							isOptional = true;						
					}
					
				}
				if (isInOutParam && !inOutParameter.isOutput())
				{
					if (GlobalConstants.PARAM_INPUT.equals(type)) 
						shallGenerate = true;
					else if (!omitInput && ((GlobalConstants.PARAM_OPTIONAL.equals(type) && isOptional) 
							|| (GlobalConstants.PARAM_POSITIONAL.equals(type) && isPositional)))
						shallGenerate = true;
				}
				else if (isInOutParam && inOutParameter.isOutput())
				{
					if (GlobalConstants.PARAM_OUTPUT.equals(type)) 
						shallGenerate = true;
					else if (!omitOutput && ((GlobalConstants.PARAM_OPTIONAL.equals(type) && isOptional) 
							|| (GlobalConstants.PARAM_POSITIONAL.equals(type) && isPositional)))
						shallGenerate = true;
				}
				else if (GlobalConstants.PARAM_OPTIONAL.equals(type) && isOptional)
				{
					shallGenerate = true;
				}
				else if (GlobalConstants.PARAM_POSITIONAL.equals(type) && isPositional)
				{
					shallGenerate = true;
				}
				
				if (shallGenerate)
				{
					// check if parameters value is set, if not, check default value
					if (effectiveResolvedParam.getValue() == null || effectiveResolvedParam.getValue().isEmpty())
					{
						if (parameter.isBoolean() && isConditional && effectiveResolvedParam.isResolved())
							effectiveResolvedParam.getValue().add(GlobalConstants.BOOLEAN_TRUE_VALUE);
					}
					
					logger.debug("createCommandLinePart():  generate command line for parameter="+effectiveResolvedParam.resolveName()
							+" conditional="+isConditional
							+" (using template: "+(effectiveTemplateParam != null ? 
									(" name="+effectiveTemplateParam.resolveName()
											+" named="+effectiveTemplateParam.isNamed(null)
											+" prefix="+effectiveTemplateParam.getPrefix()
											+" delimiter="+effectiveTemplateParam.getDelimiter()
											+" fileHandle="+effectiveTemplateParam.getHandles()+" ("+effectiveResolvedParam.getParameter().getHandles()+")"
											+" first key:"+(effectiveTemplateParam.getKeys().isEmpty() ? null : 
												("name="+effectiveTemplateParam.getKeys().get(0).getName())
												+" value="+effectiveTemplateParam.getKeys().get(0).getValue()))
									: null)+")");

					
					String res = StringUtils.join(
								effectiveResolvedParam.generateCommandString(constraints, effectiveTemplateParam),
								tool.getCmdPartDelimiter());
					if (res != null)
					{
						if  ("".equals(res))
						{
							logger.debug("resolveCommandLinePart(): param "+effectiveResolvedParam.resolveName()+" resolved to empty string");
						}
						else
						{
							logger.debug("resolveCommandLinePart(): param "+effectiveResolvedParam.resolveName()+" resolved to \""+res+"\"");
							commandLinePart.add(res);
						}
					}
					else
						logger.warn("resolveCommandLinePart(): could not resolve parameter "+effectiveResolvedParam.resolveName());
				}
			}
		}
		return commandLinePart;
	}


	private DataPort getDataPortByFormats(EList<String> formats, boolean isOutDataPort)
	{
		DataPort dataPort;
		for (String format: formats)
		{
			dataPort = getDataPortByNameOfFormat(format, isOutDataPort);
			if (dataPort != null)
				return dataPort;
		}
		return null;
	}
	/*
	private boolean doesConditionalParameterMatchFormat(InOutParameter ioParam, String condition, DataFormat dataFormat)
	{
		DataPort dataPort = findDataPortForDataSpecifyingParam(ioParam);
		
		boolean matchFormat = false;
		
		if (ioParam.getFormats() != null && !ioParam.getFormats().isEmpty())
		{
			for (String formatStr : ioParam.getFormats())
				if (formatStr.equalsIgnoreCase(dataFormat.getName()))
					matchFormat = true;
		}
		else if (condition != null)
		{
			if (condition.equalsIgnoreCase(dataFormat.getName()))
				matchFormat = true;
		}
		
		if (dataPort != null && matchFormat && dataPort.matches(dataFormat))
			return true;
		
		return false;
					
	}
	*/
	private DataPort findDataPortForDataSpecifyingParam(InOutParameter ioParam)
	{
		DataPort dataPort = null;
		if (ioParam.getDataPort() != null)
			dataPort = getDataPortByName(ioParam.getDataPort(), ioParam.isOutput());
		
		if (dataPort == null && ioParam.getFormats() != null && !ioParam.getFormats().isEmpty())
			dataPort = getDataPortByFormats(ioParam.getFormats(), ioParam.isOutput());
		
		//default to first tasks dataport
		if (dataPort == null)
			dataPort = ioParam.isOutput() ? 
					(getOutDataPorts()!= null && !getOutDataPorts().isEmpty()) ? getOutDataPorts().get(0) : null :
					(getInDataPorts() != null && !getInDataPorts().isEmpty() ? getInDataPorts().get(0) : null);
		
		if (dataPort == null)
			logger.warn("findDataPortForDataSpecifyingParam(): could not find a data port for param="+ioParam.resolveName());
		else
			logger.debug("findDataPortForDataSpecifyingParam(): found data port="+dataPort.getName()+" for param="+ioParam.resolveName());
		
		return dataPort;
	}
	
	public void resolveDataPortParams(EMap<String, DataLink> map, Tool tool, boolean isOutput) 
			throws ParameterNotFoundException, NoValidInOutDataException, ResolvingParameterFailedException {
		
		
		Iterator<Entry<String, DataLink>> it = map.iterator();
		while (it.hasNext()) {
			Entry<String, DataLink> e         = it.next();
			DataLink                dataLink  = e.getValue();
			Data data = isOutput ? dataLink.getInData() : dataLink.getData();
			if (data == null)
			{
				logger.error("resolveDataPorts(): skip dataport. (undefined)");
				continue;
					
			}
			ResolvedParam resolvedParam = data.getResolvedParam();
			String                  paramName = null;	
			
			if (resolvedParam == null)
			{
				logger.error("resolveDataPorts(): could not retrieve parameter (for task="+getUniqueString()+" and datalink="+dataLink.getUniqueString()+")");
				continue;
			}
			else
				paramName = data.getName();

			/*
			if (getResolvedCommand() == null)
				logger.error("resolveDataPorts(): cmd null");
			
			if (paramName == null || !getResolvedCommand().getResolvedParams().containsKey(paramName))
			{
				//throw new ParameterNotFoundException();
				logger.warn("resolveDataPorts(): no parameter defined. This is ok for hidden/implicit input/output data."
						+" param="+paramName+" in="+dataLink.getInDataPort().getParameterName()+" out="+dataLink.getDataPort().getParameterName()
						+" dataLink="+dataLink.getUniqueString(true)
						+"; data resource="+(dataLink.getData() != null ?
								dataLink.getDataResourceName() != null ? dataLink.getDataResourceName().toString():null:null));
				continue;
			}
			*/
			
			if (dataLink.getFormat() == null)
				logger.error("resolveDataPorts(): no format defined for datalink="+dataLink.getUniqueString()+" cannot resolve dataformat for param="+resolvedParam.resolveName());
			
			resolvedParam.setDataFormat(dataLink.getFormat());
			EList<String> supportedHandles = resolvedParam.getSupportedHandles();
			//parameter.setHandle();
			logger.debug("resolveDataPorts(): "+getUniqueString()+" paramname="+paramName+" param="+resolvedParam.resolveName()+" set data port to:"+resolvedParam.getDataFormat().getName()+" childs="
					+(resolvedParam.getChildParams() != null && !resolvedParam.getChildParams().isEmpty() ? 
							(resolvedParam.getChildParams().keySet()+" "+resolvedParam.getChildParams().containsKey(GlobalConstants.NAME_FILE_HANDLE)) 
							: null)
					+"\n\t\t use pipe="+dataLink.getPipe()
					+" handle: in="+(dataLink.getData() != null ? dataLink.getData().getHandle() : null)
					+" out="+(dataLink.getInData() != null ? dataLink.getInData().getHandle() : null)
					+" resolved handle="+resolvedParam.getHandle()+" sup. handles: "+supportedHandles+" params handles: "+resolvedParam.getParameter().getHandles());
						
			/*
			boolean resolvedFileHandle = true;
			if (dataLink.getPipe() != null && dataLink.getPipe())
			{
				if (!GlobalConfig.isPipeAllowed())
					resolvedFileHandle = false;
				
				else if (isOutput)
				{
					if (supportedHandles.contains(GlobalConstants.NAME_STDOUT_HANDLE) || supportedHandles.contains(GlobalConstants.NAME_PIPE_HANDLE))
						parameter.resolveCondititionalParam(GlobalConstants.NAME_PIPE_HANDLE, "setHandle", GlobalConstants.NAME_STDOUT_HANDLE);		
					else
						resolvedFileHandle = false;
				}
				else
				{
					if (supportedHandles.contains(GlobalConstants.NAME_STDIN_HANDLE) || supportedHandles.contains(GlobalConstants.NAME_PIPE_HANDLE))
						parameter.resolveCondititionalParam(GlobalConstants.NAME_PIPE_HANDLE, "setHandle", GlobalConstants.NAME_STDIN_HANDLE);		
					else
						resolvedFileHandle = false;
				}
			}
			else
			{
				if (!GlobalConfig.isFileAllowed())
					resolvedFileHandle = false;
				else
					parameter.resolveCondititionalParam(GlobalConstants.NAME_FILE_HANDLE, "setHandle", null);
			}
			
			if (!resolvedFileHandle)
				throw new ResolvingParameterFailedException();
			*/
			
			if (dataLink.getDataResourceName() == null)
				throw new NoValidInOutDataException();
			
			if (dataLink.isPipeable())
			{
				String handle = isOutput ? GlobalConstants.DEFAULT_STDOUT_HANDLE : GlobalConstants.DEFAULT_STDIN_HANDLE;
				resolvedParam.resolveCondititionalParam(GlobalConstants.NAME_PIPE_HANDLE, handle);
				ResolvedParam childParam = resolvedParam.getChildParam(paramName, GlobalConstants.NAME_PIPE_HANDLE);
				//if (!resolvedParam.resolveName().equals(paramName))
				//if (childParam != resolvedParam)
				{
					//resolvedParam.get
					//resolvedParam.getValue().add(childParam.resolvePipe(handle));
					childParam.getValue().add(childParam.resolvePipe(handle));
					childParam.setResolved(true);
				}
				
				//else
					//resolvedParam.getValue().add(resolvedParam.resolvePipe(handle));
			}
			else
			{
				resolvedParam.resolveCondititionalParam(GlobalConstants.NAME_FILE_HANDLE, null);
				ResolvedParam childParam = resolvedParam.getChildParam(paramName, GlobalConstants.NAME_FILE_HANDLE);
				if (childParam == null)
					logger.error("failed to resolve param="+resolvedParam.resolveName());
				//resolvedParam.getValue().add(dataLink.getDataResourceName());
				childParam.getValue().add(dataLink.getDataResourceName());
				childParam.setResolved(true);
			}
			resolvedParam.setResolved(true);
			
		}
	}
	
	/*
	 * resolve the in/out data params
	 * iterate over given datalinks, retrieve associated parameter and set the parameters value(s)  
	 */
	/*
	private void resolveParams(EMap<String, DataLink> map, Tool tool, boolean isOutput) throws ParameterNotFoundException
	{
		Iterator<Entry<String, DataLink>> it = map.iterator();
		while (it.hasNext()) {
			Entry<String, DataLink> e         = it.next();
			DataLink                dataLink  = e.getValue();
			String                  paramName = dataLink.getParamNameStr();
			
			if (!dataLink.getChunks().containsKey(dataLink.getParamStr()))
			{
				logger.error("resolveParams(): could not find chunks for param="+paramName+" ("+dataLink.getParamStr()+")");
				//throw new ParameterNotFoundException();
				continue;
			}
			
			if (!getResolvedCommand().getResolvedParams().containsKey(paramName))
			{
				logger.error("resolveParams(): could not find param="+paramName+" ("+dataLink.getParamStr()+")");
				//throw new ParameterNotFoundException();
				continue;
				
			}
			ResolvedParam parameter = getResolvedCommand().getResolvedParams().get(paramName);
			parameter.getValue().addAll(dataLink.getChunks().get(dataLink.getParamStr()));
			parameter.setResolved(true);
		}
	}
	*/
	
	public void resolveStaticParams(EMap<String, ResolvedParam> resolvedParams)
	{
		Iterator<Entry<String, ResolvedParam>> it = resolvedParams.iterator();

		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			ResolvedParam resolvedParam = e.getValue();
			resolveNestedParams(resolvedParam);
			resolveStaticParam(resolvedParam);
			/*
			Iterator<ResolvedParam> it2 = e.getValue().getEffectiveParameters(null, null).iterator();
			while (it2.hasNext())
			{
				ResolvedParam rp = it2.next();
				resolveStaticParam(rp);
			}
			*/
		}		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getDetailedString() {
		return getUniqueString()
				+" dataportIn="+Util.list2String(getInDataPorts(), ",")
				+" dataportOut="+Util.list2String(getOutDataPorts(), ",")
				+" traversalEvents="+Util.list2String(Util.traversalEvents2String(getTraversalEvents()), ",")
				+" "
				;
	}

	private void resolveConditionalStaticParam_DataPort(ResolvedParam resolvedParam)
	{
		throw new UnsupportedOperationException();
	}
	
	private void resolveConditionalStaticParam_DataFormat(ResolvedParam resolvedParam)
	{
		InOutParameter parameter = (InOutParameter) resolvedParam.getParameter();
		DataPort dataPort = findDataPortForDataSpecifyingParam(parameter);

		if (dataPort == null)
		{
			logger.error("resolveConditionalStaticParam_DataFormat(): could not find dataport for param="+resolvedParam.resolveName()+".");
			return;
		}
		ResolvedParam resolvedDataParam = getResolvedCommand().getDataParamForDataPort(dataPort, parameter.isOutput());
		
		if (resolvedDataParam == null)
		{
			logger.error("resolveConditionalStaticParam_DataFormat(): could not find corresponding param for dataport="
					+dataPort.getName()+" of param="+resolvedParam.resolveName()+"");
			return;			
		}
		else
		{
			logger.debug("resolveConditionalStaticParam_DataFormat(): found param="+resolvedDataParam.resolveName());
		}
		
		for (String key : resolvedParam.getChildParams().keySet())
		{
			/*
			if (resolvedDataParam.getChildParams() != null && resolvedDataParam.getChildParams().containsKey(resolvedDataParam.getConditionalParam()))
			{
				for (ResolvedParam effectiveResolvedDataParam : resolvedDataParam.getEffectiveParameters(null, null))
				{
					if (effectiveResolvedDataParam.isConditionResolving() && key.equalsIgnoreCase(effectiveResolvedDataParam.getDataFormat().getName()))
					{
						resolvedParam.setConditionalParam(key);
						resolvedParam.setResolved(true);
						logger.debug("resolveConditionalStaticParam_DataFormat(): set conditional param key="+key);
						return;
					}
				}
			}
			else*/
			{
				if (key.equalsIgnoreCase(resolvedDataParam.getDataFormat().getName()))
				{
					resolvedParam.setConditionalParam(key);
					ResolvedParam child = resolvedParam.getConditionResolvingChildParam(key, false);
					
					/*if (!resolvedParam.getChildParams().get(key).isEmpty() && 
						resolvedParam.getChildParams().get(key).get(0).isConditionResolving())
						resolvedParam.getChildParams().get(key).get(0).setResolved(true);*/
					if (child != null)
					{
						child.setResolved(true);
						logger.debug("resolveConditionalStaticParam_DataFormat(): set conditional param key="+key);
					}
					else
					{
						logger.error("resolveConditionalStaticParam_DataFormat(): retrieve condition resolving Child failed for param="+resolvedParam.resolveName()+" and condition="+key);
					}
					return;
				}
			}
		}
		logger.error("resolveConditionalStaticParam_DataFormat(): no key found matching condition");
	}
	
	private void resolveConditionalStaticParam_Grouping(ResolvedParam resolvedParam)
	{
		
		if (resolvedParam.getChildParams() != null && !resolvedParam.getChildParams().isEmpty() &&
			resolvedParam.getConditions()  != null && !resolvedParam.getConditions().isEmpty()
			)
		{
			logger.debug(resolvedParam.getConditions().keySet()+" "+getChunks().keySet());
			for (String key : resolvedParam.getConditions().keySet())
			{
				Condition c = resolvedParam.getConditions().get(key); 
			//	boolean conditionHeld = false;
				if (resolvedParam.getParameter().getGrouping() != null && !resolvedParam.getParameter().getGrouping().isEmpty())
				{
				//for (String group : resolvedParam.getParameter().getGrouping())
				//{
					
					EList<EMap<String, Object>> metaDataMaps;
					
					metaDataMaps = Util.createMetaDataMapForJexl(getRecords());
					Boolean tmp = null;
				//	boolean isConsistent = true;
					for (EMap<String, Object> metaDataMap : metaDataMaps)
					{
						
						Object o = Util.evaluateJexl(metaDataMap, c.getExpression());
						boolean evalRes = shallProcess(o); 
						if (tmp == null)
							tmp = evalRes;
						else if (!(tmp && evalRes || !tmp && !evalRes))
						{
						//	isConsistent = false;
							tmp = false;
						}	
						logger.debug("resolveConditionalStaticParam_Grouping(): eval result="+evalRes+" (exp="+c.getExpression()+" against context="+metaDataMap+")");
					}
					if (tmp)
					{
						resolvedParam.setConditionalParam(key);
						ResolvedParam child = resolvedParam.getConditionResolvingChildParam(key, false);
						if (child != null)
						{
							logger.debug("resolveConditionalStaticParam_Grouping(): resolved conditional param="+resolvedParam.resolveName()+" to "+key);
							child.setResolved(true);
						}
						else
							logger.error("resolveConditionalStaticParam_Grouping(): retrieve condition resolving Child failed for param="+resolvedParam.resolveName()+" and condition="+key);
						
						break;
					}
				//}
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * choose the param (among param.getValues()) that matches the condition
	 * and set attribute conditionalParam accordingly.
	 * 
	 * for data related param (param.isDataParam()) this means a parameter is only valid/should be applied if either 
	 * case 1: dataport is resolved to a certain dataformat (condition == data_format) (default)
	 *   1. retrieve the dataport, the parameter is related to
	 *   2. get the corresponding InOutParameter
	 *   3. check the format of this InOutParameter to decide which condition is held
	 *   
	 * or case 2: a certain dataport is required (condition == data_port)
	 *   1. get all resolvedparams (which are data params) and evaluate dataport attribute  
	 *   2. try to find a condition that matches the dataport attribute
	 *   todo: how to behave in case where more than one condition can be fulfilled
	 *   
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void resolveConditionalStaticParam(ResolvedParam resolvedParam) {
		
		Parameter                          param     = resolvedParam.getParameter();
		//EMap<String, EList<ResolvedParam>> subParams = param.getValues();
		if (param.isDataSpecifyingParam())
		{
			if (param.getConditionType() == null || param.getConditionType().equals(GlobalConstants.CONDITION_TYPE_DATA_FORMAT))
			{
				resolveConditionalStaticParam_DataFormat(resolvedParam);
			}
			else if (param.getConditionType().equals(GlobalConstants.CONDITION_TYPE_DATA_PORT))
			{
				resolveConditionalStaticParam_DataPort(resolvedParam);
			}
			else
				logger.error("resolveConditionalStaticParam(): unknown condition type="+param.getConditionType()+" for param="+param.resolveName()+" found.");
		}
		else
			logger.error("resolveConditionalStaticParam(): unknown condition type="+param.getConditionType()+" for param="+param.resolveName()+" found.");
			
	}

	
	private void resolveMetadataParam(ResolvedParam resolvedParam)
	{
		
		Parameter param = resolvedParam.getParameter();
		logger.debug("resolveStaticParams(): grouping parameter found. name="+resolvedParam.resolveName()
				+" "+param.getGrouping()+" "+getChunks().keySet());
		
		EList<GroupingInstance> groupingInstances = new BasicEList<GroupingInstance>();
		EList<TraversalChunk>   chunks            = getRecords(true);
		DefaultMetaData         metaData          = GlobalVar.getMetaData();
		Iterator<String>        groupingStrIt     = param.getGrouping().iterator();
		while (groupingStrIt.hasNext())
		{
			String groupingStr = groupingStrIt.next();
			if (!groupingStr.equalsIgnoreCase(GlobalConstants.TRAVERSAL_CRITERION_RECORD))
				for (TraversalChunk chunk : chunks)
				{
					EList<GroupingInstance> tmp = metaData.getInstances(		
							GlobalConstants.TRAVERSAL_CRITERION_RECORD,
							groupingStr, 
							chunk.getName());
					if (!tmp.isEmpty())
					{
						logger.debug("param="+resolvedParam.resolveName()+" instance="
								+easyflow.custom.util.Util.list2String(tmp, null)
								+" found for grouping="+groupingStr);
						
					}
					else
					{
						logger.debug("param="+resolvedParam.resolveName()+" no instances found for grouping="+groupingStr);
					}

					groupingInstances.addAll(tmp);
					
				}
			//GlobalVarMetaData
			
			//if (getChunks().containsKey(groupingStr))
		}
		resolvedParam.getValue().addAll(groupingInstances);
		resolvedParam.setResolved(true);

	}
	
	private void resolveNestedParams(ResolvedParam param)
	{
		// recursively resolve all nested parameters
		if (param.getChildParams() != null && !param.getChildParams().isEmpty())
		{
			Iterator<Entry<String, EList<ResolvedParam>>> it = param.getChildParams().iterator();
			while (it.hasNext())
			{
				Entry<String, EList<ResolvedParam>> e = it.next();
				Iterator<ResolvedParam> itr = e.getValue().iterator();
				while (itr.hasNext())
					resolveStaticParam(itr.next());
			}
		}
	}
	
	private void resolveStaticParam(ResolvedParam resolvedParam)
	{
		
		Parameter param = resolvedParam.getParameter();
		
		if (Util.debugTool(getPreferredTool()))
		{
			logger.debug("resolved:"+resolvedParam.renderToString()+" param: "+param.renderToString());
			logger.debug("param="+resolvedParam.resolveName()+" grouping is empty="+param.getGrouping().isEmpty());
			
		}
		if (param.isMetaDataParam())
		{
			if (param.getConditionType() != null && param.getConditionType().equals(GlobalConstants.CONDITION_TYPE_METADATA))
			{
				resolveConditionalStaticParam_Grouping(resolvedParam);
			}
			else
				resolveMetadataParam(resolvedParam);
		}
		
/*		else if (param.isDataSpecifyingParam())
		{
			//else
				//resolvedParam.getValue().addAll(resolveDataSpecifyingParam((InOutParameter) param));
		}
		else if (param.getDefaultValue() != null && !param.getDefaultValue().isEmpty())
		{
			//resolvedParam.getValue().add(param.getDefaultValue());
		}
		else if (param.getGeneralValue() != null && !param.getGeneralValue().isEmpty())
		{
			//resolvedParam.getValue().add(param.getGeneralValue());
		}
		*/
		
		else if (resolvedParam.getChildParams() != null && !resolvedParam.getChildParams().isEmpty())
			resolveConditionalStaticParam(resolvedParam);
		else
			logger.trace("no conditional params defined for param="+param.resolveName());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean readFromPipe() {
		
		if (!GlobalConfig.isPipeAllowed())
			return false;
				
		Iterator<Entry<String, DataLink>> it = getInputs().iterator();
		while (it.hasNext())
		{
			Entry<String, DataLink> e = it.next();
			DataLink dataLink = e.getValue();
			if (dataLink.getPipe() != null && dataLink.getPipe())
			//if (dataLink.getDataPort().isCompatible(testDataPort)
				//&& dataLink.isPipeable())
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean writeToPipe() {

		if (!GlobalConfig.isPipeAllowed())
			return false;
		
		Iterator<Entry<String, DataLink>> it = getOutputs().iterator();
		while (it.hasNext())
		{
			Entry<String, DataLink> e = it.next();
			DataLink dataLink = e.getValue();
			if (dataLink.getPipe() != null && dataLink.getPipe())
			//if (dataLink.getDataPort().isCompatible(testDataPort)
				//&& dataLink.isPipeable())
				return true;
		}
		return false;
	}

	/*
	 * pick data according to the file handle strategy:
	 * - pipe_only
	 * - file_only
	 * - any
	 */
	private EList<String> getFiles(EMap<String, DataLink> data, int fileHandleStrategy)
	{
		EList<String> files = new BasicEList<String>();
		Iterator<Entry<String, DataLink>> it = data.iterator();
		while (it.hasNext())
		{
			boolean add = false;
			Entry<String, DataLink> e = it.next();
			DataLink         dataLink = e.getValue();
			if (fileHandleStrategy == GlobalConstants.ANY_HANDLE)
				add = true;
			else 
			{
				/*Data d = e.getValue().getData();
				if (d != null)
				{
					EList<String> h = d.resolveSupportedHandles();
					
					if (fileHandleStrategy == GlobalConstants.FILE_HANDLE &&
						h.contains(GlobalConstants.NAME_FILE_HANDLE))
						add = true;
					if (fileHandleStrategy == GlobalConstants.PIPE_HANDLE &&
						//e.getValue().getData().getHandle().equals(GlobalConstants.NAME_PIPE_HANDLE))
						h.contains(GlobalConstants.NAME_PIPE_HANDLE))
						add = true;
				}
				else*/
				if (dataLink.getPipe() == null)
					add = true;
				else if (!dataLink.getPipe())
				{
					if (fileHandleStrategy == GlobalConstants.FILE_HANDLE)
						add = true;
				}
			}
				
			//if (dataLink.getData() == null || dataLink.getInData() == null)
			if (add)
				files.add(dataLink.getDataResourceName().getPath());
			else if (dataLink.getDataResourceName() != null)
				logger.debug("getFiles(): skip dataresource="+dataLink.getDataResourceName());
		}
		return files;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws ResolvingParameterFailedException 
	 * @throws DataLinkNotFoundException 
	 * @generated not
	 */
	public Rule createRule()
	{

		//resolveInputs();
		//resolveOutputs();
		//resolveParams();
		
		int fileHandleStrategy = GlobalConstants.ANY_HANDLE;
		
		Rule rule = getRule();
		if (rule == null)
			rule = GlobalVar.getDefaultProject().getActiveWorkflow().getCurrentRule();
		//rule.setTask(this);
		rule.setReadFromPipe(readFromPipe());
		rule.setWriteToPipe(writeToPipe());
		logger.debug("createRule(): task="+getUniqueString()+" preferredTool="+getPreferredTool().getName()
				+" (all: "+getTools().keySet().toString()+") "
				+" task="+hashCode()
				+" rule="+rule.hashCode()
		);

		if (rule.isReadFromPipe())
		{
			((RuleImpl) rule).clearCmdParts();
			fileHandleStrategy = GlobalConstants.FILE_HANDLE;
		}
		else
			rule.clear();
			
		rule.getDependencies().addAll(getFiles(getInputs(), fileHandleStrategy));
		if (rule.isWriteToPipe())
			fileHandleStrategy = GlobalConstants.FILE_HANDLE;
		else
			fileHandleStrategy = GlobalConstants.ANY_HANDLE;
		
		rule.getTargets().addAll(getFiles(getOutputs(), fileHandleStrategy));
				
		logger.debug("createRule(): cmd="+rule.getCmdLine()+" targets="+rule.getTargets()+" deps="+rule.getDependencies());
		return rule;
	}
	
	/*
	private boolean resolveCmdPartParam(ResolvedParam resolvedParam)
	{
		boolean rc = false;
		String cmdParts[] = {GlobalConstants.COMMAND_PART_VALUE_EXE, 
				GlobalConstants.COMMAND_PART_VALUE_INTERPRETER, GlobalConstants.COMMAND_PART_VALUE_MODULE}; 
		if (resolvedParam.getParameter().getCmdPart() != null
				&& Arrays.asList(cmdParts).contains(resolvedParam.getParameter().getCmdPart()))
		{
			if (resolvedParam.getName() != null)
			{
				resolvedParam.getValue().add(resolvedParam.getName());
				rc = true;
			}
			else if (resolvedParam.getParameter().getName() != null)
			{
				resolvedParam.getValue().add(resolvedParam.getParameter().getName());
				rc = true;
			}
		}
		return rc;
	}
	*/
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean validateTool(Tool tool) {
		
		boolean rc = false;
		
		ToolMatch toolMatch = CoreFactory.eINSTANCE.createToolMatch();
		toolMatch.setTask(this);
		toolMatch.setTool(tool);
		setResolvedCommand(EcoreUtil.copy(tool.getCommand()));
		getToolMatches().put(tool.getName(), toolMatch);
		long score = toolMatch.computeScore(null);
		long expectedScore = toolMatch.computeExpectedScore();
		logger.trace(Long.toBinaryString(score) + " ");
		logger.trace(Long.toBinaryString(expectedScore) + " (exp)");
		// logger.debug(Long.toHexString(score)+" vs "+Long.toHexString(expectedScore));
		if (score == expectedScore) {
			rc = true;
			toolMatch.setValid(true);
		}
		return rc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean validateTools() {
		boolean rc = false;
		for (Entry<String, Tool> toolEntry : getTools()) {
			logger.trace("validate tool=" + toolEntry.getKey());
			if (validateTool(toolEntry.getValue())) {
				rc = true;
			}
		}
		return rc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public DataPort getDataPortByDataPort(DataPort testDataPort,
			boolean isOutDataPort) {
		EList<DataPort> dataPorts = isOutDataPort ? getOutDataPorts()
				: getInDataPorts();
		for (DataPort dataPort : dataPorts)
			if (dataPort.isCompatible(testDataPort))
				return dataPort;
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public DataPort getDataPortByNameOfFormat(String formatName,
			boolean isOutDataPort) {
		EList<DataPort> dataPorts = isOutDataPort ? getOutDataPorts()
				: getInDataPorts();
		for (DataPort dataPort : dataPorts) {
			for (DataFormat dataFormat : dataPort.getDataFormats().values())
				if (dataFormat.getName().equals(formatName))
					return dataPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public DataPort getDataPortByName(String dataPortName, boolean isOutDataPort) {
		EList<DataPort> dataPorts = isOutDataPort ? getOutDataPorts()
				: getInDataPorts();
		for (DataPort dataPort : dataPorts) {
			if (dataPort.getName().equals(dataPortName))
				return dataPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EMap<Task, EList<DataPort>> resolveMissingDataPortsByTool(
			EList<Task> tasks) {
		for (ToolMatch toolMatch : getToolMatches().values()) {
			if (!toolMatch.isValid())
				return toolMatch.resolveReverseMissingInDataPorts(tasks);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean canFilterInstancesFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canFilterInstancesFor(dataPort);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<TraversalChunk> getInputs(boolean intersect)
	{
		EList<TraversalChunk> recs = getRecords(intersect);
		EList<TraversalChunk> inputs = new BasicEList<TraversalChunk>();
		List<String> processedSoFar = new ArrayList<String>();
		
		for (TraversalChunk rec : recs)
		{
			List<String> ina = GlobalVarMetaData.getMultiFieldValues(rec.getName(), GlobalConstants.METADATA_INPUT);
			if (ina.size() == 0)
			{
				TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
				traversalChunk.setName(
						GlobalVarMetaData.getMetaDataTableEntry(rec.getName(), GlobalConstants.METADATA_INPUT));
				inputs.add(traversalChunk);
			}
			else
				for (String in:ina)
				{
					if (!processedSoFar.contains(in))
					{
						processedSoFar.add(in);
						TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
						traversalChunk.setName(in);
						inputs.add(traversalChunk);
					}
				}
		}
		
		logger.debug("getInputs(): retrieved "+inputs.size()+" inputs: "+processedSoFar);
		return inputs;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<TraversalChunk> getRecords(boolean intersect) {

		boolean modeUnion = !intersect;
		boolean firstTC   = true;
		// if (!getRecords().isEmpty())
		// {
		// logger.warn("getRecords(): record already processed. Return cached value.");
		// return getRecords();
		getRecords().clear();
		// }
		logger.trace("getRecords(): retrieve records for "+getUniqueString());
		EMap<String, TraversalChunk> chunks = new BasicEMap<String, TraversalChunk>();
		for (String groupingStr : getChunks().keySet()) {
			logger.trace("getRecords(): find records for grouping "
					+ groupingStr
					+ " of task"
					+ getUniqueString()
					+ " (is contained="
					+ GlobalVar.getMetaData()
							.containsColumn(groupingStr) + ")");
			if (GlobalVar.getMetaData()
					.containsColumn(groupingStr)) {
				if (!groupingStr.equals(GlobalConstants.TRAVERSAL_CRITERION_RECORD)) {
					if (modeUnion || firstTC) {
						firstTC = false;
						for (TraversalChunk traversalChunk : getChunks().get(
								groupingStr)) {
							EList<String> recs = GlobalVar
									.getMetaData()
									.getRecordsBy(groupingStr,
											traversalChunk.getName());
							for (String rec : recs) {
								if (!chunks.containsKey(rec)) {
									TraversalChunk newTC = TraversalFactory.eINSTANCE
											.createTraversalChunk();
									newTC.setName(rec);
									/**
									 * criterion for a 1-1 mapping of a chunk
									 */
									if (recs.size() == 1
											&& getChunks().size() == 1) {
										newTC.setDerived1by1(true);
									}
									chunks.put(rec, newTC);
									logger.trace("getRecords(): traversal chunk "
											+ rec
											+ " added. derived1by1="
											+ newTC.isDerived1by1());
								}
							}
						}
					} else {
						EList<String> missingChunks = new BasicEList<String>(
								chunks.keySet());
						for (TraversalChunk traversalChunk : getChunks().get(
								groupingStr)) {
							logger.trace("getRecords(): traversalChunk="
									+ traversalChunk.getName()
									+ " resolved to records=("
									+ StringUtils.join(GlobalVar
														.getMetaData().getRecordsBy(groupingStr,
															traversalChunk.getName())
															.iterator(),
															", ") + ")");
							for (String rec : GlobalVar
									.getMetaData()
									.getRecordsBy(groupingStr,
											traversalChunk.getName())) {
								if (!chunks.containsKey(rec)) {
								} else if (missingChunks.contains(rec)) {
									missingChunks.remove(rec);
								}

							}
						}
						for (String rec : missingChunks) {
							chunks.removeKey(rec);
							logger.trace("getRecords(): remove traversal chunk "
									+ rec
									+ "because it doesnt intersect with a previous seen chunk.");
						}

					}
				} else {
					if (modeUnion || firstTC) {
						firstTC = false;
						for (TraversalChunk traversalChunk : getChunks().get(
								groupingStr)) {
							if (!chunks.containsKey(traversalChunk.getName())) {
								chunks.put(traversalChunk.getName(),
										traversalChunk);
							}
						}
					} else {
						EList<String> missingChunks = new BasicEList<String>(
								chunks.keySet());
						for (TraversalChunk traversalChunk : getChunks().get(
								groupingStr)) {
							if (missingChunks
									.contains(traversalChunk.getName()))
								missingChunks.remove(traversalChunk.getName());
						}
						for (String rec : missingChunks) {
							chunks.removeKey(rec);
							logger.trace("getRecords(): remove traversal chunk "
									+ rec
									+ "because it doesnt intersect with a previous seen chunk.");

						}
					}
				}
			} else
			{
				logger.info("getRecords(): no records can be retrieved for grouping="
						+ groupingStr
						+ ", because it is not contained in metadata table.");
			}
		}
		logger.debug("getRecords(): result=" + chunks.values().size()+" ("+Util.list2String(chunks.values(), ", ")+")");
		getRecords().addAll(new BasicEList<TraversalChunk>(chunks.values()));
		return getRecords();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<TraversalChunk> getOverlappingRecordsProvidedBy(Task testTask)
	{
		EList<TraversalChunk> overlappingTraversalChunks = new BasicEList<TraversalChunk>();
		logger.trace("getOverlappingRecordsProvidedBy(): retrieve records for task "
				+ testTask.getUniqueString());
		EList<TraversalChunk> providedTraversalChunks = testTask
				.getRecords(true);

		logger.trace("getOverlappingRecordsProvidedBy(): retrieve records for task "
				+ getUniqueString());
		for (TraversalChunk traversalChunk : getRecords(true))
		{
			logger.trace("getOverlappingRecordsProvidedBy(): test required chunk "
					+ traversalChunk.getName());
			for (TraversalChunk providedTraversalChunk : providedTraversalChunks)
			{
				logger.trace("getOverlappingRecordsProvidedBy(): "
						+ providedTraversalChunk.getName()
						+ " match="
						+ traversalChunk.getName().equals(
								providedTraversalChunk.getName()));
				if (traversalChunk.getName().equals(
						providedTraversalChunk.getName()))
				{
					overlappingTraversalChunks.add(traversalChunk);
				}
			}
		}
		return overlappingTraversalChunks;
	}

	public boolean isEqual(EList<TraversalChunk> requiredChunks, 
			EList<TraversalChunk> providedChunks,
			boolean contain)
	{
		EList<TraversalChunk> controlList = new BasicEList<TraversalChunk>();
		if (providedChunks != null && requiredChunks != null 
				&& (providedChunks.size() == requiredChunks.size() || contain))
		{
			for (TraversalChunk requiredChunk : requiredChunks)
			{
				TraversalChunk rec = null;
				for (TraversalChunk providedChunk : providedChunks)
				{
					if (requiredChunk.getName().equals(
							providedChunk.getName()))
					{
						rec = requiredChunk;
						break;
					}
				}
				if (rec == null)
					break;
				controlList.add(rec);
			}
			return controlList.size() == requiredChunks.size();
		}
		else if (requiredChunks == null || requiredChunks.isEmpty())
			return true;
		
		return false;
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * Tell, if the task and its implementing tool is
	 * able to generate the outputs that match the given dataPort. To refine the
	 * evaluation specify grouping string and, optional, a list of chunks for
	 * the given grouping. Usually the most granular grouping is used (e.g. ID
	 * or records) to precisely define which outputs are of interest. 
	 * <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean canProvideDataPort(Tool tool, DataPort dataPort,
			String grouping, EList<TraversalChunk> traversalChunks, boolean isPartial)
			throws DataPortNotFoundException, ToolNotFoundException {

		/*if (tool == null)
			tool = getPreferredTool();
		
		if (tool != null)
			tool.canFilterInstancesFor(dataPort); 
		*/
		if (traversalChunks == null) {
			// todo: if the the chunks for the grouping criteria cannot be provided
			// (-> check with tool definition)
			logger.debug("canProvideDataPort(): no traversal chunks provided.");
		}
		else if (grouping != null)
		{
			EList<TraversalChunk> recs = null;
			logger.debug("canProvideDataPort(): "+Util.list2String(traversalChunks, null));
			if (GlobalConstants.TRAVERSAL_CRITERION_RECORD.equals(grouping))
			{
				recs = getRecords(true);
				logger.debug("canProvideDataPort(): found "+recs.size()+" chunks for grouping="+grouping);
			}
			else if (GlobalConstants.METADATA_INPUT.equals(grouping))
			{
				recs = getInputs(true);
				logger.debug("canProvideDataPort(): found "+recs.size()+" chunks for grouping="+grouping);
			}
			
			/*if (isRoot() && 
					getTraversalEvents().get(grouping).getTraversalCriterion()
					.getMode().equals(GlobalConstants.GROUPING_MODE_JOINT))
			{
				return isEqual(traversalChunks, recs, true);
			}
			else*/
			if (isPartial)
				//return isContained(recs, traversalChunks);
				return isEqual(traversalChunks, recs, false);
			else
				return isEqual(traversalChunks, recs, false);
			
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean canComsumeDataPort(Tool tool, DataPort dataPort,
			String grouping, EList<TraversalChunk> traverslChunks, boolean isPartial)
			throws DataPortNotFoundException, ToolNotFoundException {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws ToolNotFoundException
	 * @generated not
	 */
	public EList<String> getRequiredGroupingsFor(Tool tool, DataPort dataPort,
			boolean required) throws ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.getGroupingsForInputPort(dataPort, required);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws ToolNotFoundException
	 * @generated not
	 */
	public EList<String> getProvidedGroupingsFor(Tool tool, DataPort dataPort,
			boolean required) throws ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.getGroupingsForOutputPort(dataPort, required);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canProvideMultipleGroupingsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProvideMultipleInputsFor(Tool tool, DataPort dataPort) throws ToolNotFoundException, DataPortNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProvideMultipleInputsFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProvideMultipleInstancesFor(Tool tool, DataPort dataPort) throws ToolNotFoundException, DataPortNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProvideMultipleInstancesFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProvideMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProvideMultipleInstancesPerInputFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInputsFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProcessMultipleInputsFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInstancesFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProcessMultipleInstancesFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws ToolNotFoundException, DataPortNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProcessMultipleInstancesPerInputFor(dataPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvideMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvideMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvideMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<TraversalChunk> getOverlappingChunksFor(Task parentTask,
			String groupingStr)
	{

		EList<TraversalChunk> overlap      = new BasicEList<TraversalChunk>();
		EList<TraversalChunk> chunks       = null;
		EList<TraversalChunk> parentChunks = null;
		boolean intersect = true;
		//GlobalVarMetaData
		//GlobalVar.getGraphUtil().getMetaData().get
		if (getChunks().containsKey(groupingStr))
		{
			chunks = getChunks().get(groupingStr);
		}
		if (chunks == null && GlobalConstants.METADATA_INPUT.equals(groupingStr))
		{
			chunks = getInputs(intersect);
		}
		else if (chunks == null)
		{
			chunks = getRecords(intersect);
		}
		
		if (parentTask.getChunks().containsKey(groupingStr)) 
		{
			parentChunks = parentTask.getChunks().get(groupingStr);
		}
		if (chunks == null && GlobalConstants.METADATA_INPUT.equals(groupingStr))
		{
			parentChunks = ((TaskImpl)parentTask).getInputs(intersect);
		}
		else if (chunks == null)
		{
			parentChunks = parentTask.getRecords(intersect);
		}
		
		if (chunks == null || parentChunks == null)
			return overlap;
		
		for (TraversalChunk traversalChunk : chunks) 
		{
			for (TraversalChunk parentTraversalChunk : parentChunks) 
			{
				if (traversalChunk.getName().equals(
					parentTraversalChunk.getName()))
					overlap.add(traversalChunk);
			}
		}	
		return overlap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				return ((InternalEList<?>)getTraversalEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__TOOL_NAMES:
				return ((InternalEList<?>)getToolNames()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__TOOL_MATCHES:
				return ((InternalEList<?>)getToolMatches()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__GROUPING_CRITERIA:
				return ((InternalEList<?>)getGroupingCriteria()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__INPUTS_BY_DATA_PORT:
				return ((InternalEList<?>)getInputsByDataPort()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__OUTPUTS_BY_DATA_PORT:
				return ((InternalEList<?>)getOutputsByDataPort()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__RESOLVED_COMMAND:
				return basicSetResolvedCommand(null, msgs);
			case CorePackage.TASK__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__STATIC_PARAMS:
				return ((InternalEList<?>)getStaticParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TASK__IN_DATA_PORTS:
				return getInDataPorts();
			case CorePackage.TASK__OUT_DATA_PORTS:
				return getOutDataPorts();
			case CorePackage.TASK__NAME:
				return getName();
			case CorePackage.TASK__JEXL_STRING:
				return getJexlString();
			case CorePackage.TASK__UTIL:
				return isUtil();
			case CorePackage.TASK__LOGGER:
				return getLogger();
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				if (coreType) return getTraversalEvents();
				else return getTraversalEvents().map();
			case CorePackage.TASK__PARENTS:
				if (coreType) return getParents();
				else return getParents().map();
			case CorePackage.TASK__CHUNKS:
				if (coreType) return getChunks();
				else return getChunks().map();
			case CorePackage.TASK__TOOL_NAMES:
				if (coreType) return getToolNames();
				else return getToolNames().map();
			case CorePackage.TASK__TOOLS:
				if (coreType) return getTools();
				else return getTools().map();
			case CorePackage.TASK__TOOL_MATCHES:
				if (coreType) return getToolMatches();
				else return getToolMatches().map();
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				return getPreviousTaskStr();
			case CorePackage.TASK__ROOT:
				return isRoot();
			case CorePackage.TASK__FLAGS:
				return getFlags();
			case CorePackage.TASK__GROUPING_CRITERIA:
				if (coreType) return getGroupingCriteria();
				else return getGroupingCriteria().map();
			case CorePackage.TASK__INPUTS:
				if (coreType) return getInputs();
				else return getInputs().map();
			case CorePackage.TASK__OUTPUTS:
				if (coreType) return getOutputs();
				else return getOutputs().map();
			case CorePackage.TASK__INPUTS_BY_DATA_PORT:
				if (coreType) return getInputsByDataPort();
				else return getInputsByDataPort().map();
			case CorePackage.TASK__OUTPUTS_BY_DATA_PORT:
				if (coreType) return getOutputsByDataPort();
				else return getOutputsByDataPort().map();
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				return getInputDataPortValidator();
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				return getOutputDataPortValidator();
			case CorePackage.TASK__ANALYSIS_TYPES:
				return getAnalysisTypes();
			case CorePackage.TASK__CIRCUMVENTING_PARENTS:
				return getCircumventingParents();
			case CorePackage.TASK__RECORDS:
				return getRecords();
			case CorePackage.TASK__PREPROCESSING_TASKS:
				return getPreprocessingTasks();
			case CorePackage.TASK__RESOLVED_COMMAND:
				return getResolvedCommand();
			case CorePackage.TASK__UNRESOLVED_OUT_DATA_PORTS:
				return getUnresolvedOutDataPorts();
			case CorePackage.TASK__PARAMS:
				if (coreType) return getParams();
				else return getParams().map();
			case CorePackage.TASK__STATIC_PARAMS:
				if (coreType) return getStaticParams();
				else return getStaticParams().map();
			case CorePackage.TASK__RULE:
				if (resolve) return getRule();
				return basicGetRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.TASK__IN_DATA_PORTS:
				getInDataPorts().clear();
				getInDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TASK__OUT_DATA_PORTS:
				getOutDataPorts().clear();
				getOutDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TASK__NAME:
				setName((String)newValue);
				return;
			case CorePackage.TASK__JEXL_STRING:
				setJexlString((String)newValue);
				return;
			case CorePackage.TASK__UTIL:
				setUtil((Boolean)newValue);
				return;
			case CorePackage.TASK__LOGGER:
				setLogger((Logger)newValue);
				return;
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				((EStructuralFeature.Setting)getTraversalEvents()).set(newValue);
				return;
			case CorePackage.TASK__PARENTS:
				((EStructuralFeature.Setting)getParents()).set(newValue);
				return;
			case CorePackage.TASK__CHUNKS:
				((EStructuralFeature.Setting)getChunks()).set(newValue);
				return;
			case CorePackage.TASK__TOOL_NAMES:
				((EStructuralFeature.Setting)getToolNames()).set(newValue);
				return;
			case CorePackage.TASK__TOOLS:
				((EStructuralFeature.Setting)getTools()).set(newValue);
				return;
			case CorePackage.TASK__TOOL_MATCHES:
				((EStructuralFeature.Setting)getToolMatches()).set(newValue);
				return;
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				setPreviousTaskStr((String)newValue);
				return;
			case CorePackage.TASK__ROOT:
				setRoot((Boolean)newValue);
				return;
			case CorePackage.TASK__FLAGS:
				setFlags((Integer)newValue);
				return;
			case CorePackage.TASK__GROUPING_CRITERIA:
				((EStructuralFeature.Setting)getGroupingCriteria()).set(newValue);
				return;
			case CorePackage.TASK__INPUTS:
				((EStructuralFeature.Setting)getInputs()).set(newValue);
				return;
			case CorePackage.TASK__OUTPUTS:
				((EStructuralFeature.Setting)getOutputs()).set(newValue);
				return;
			case CorePackage.TASK__INPUTS_BY_DATA_PORT:
				((EStructuralFeature.Setting)getInputsByDataPort()).set(newValue);
				return;
			case CorePackage.TASK__OUTPUTS_BY_DATA_PORT:
				((EStructuralFeature.Setting)getOutputsByDataPort()).set(newValue);
				return;
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				getInputDataPortValidator().clear();
				getInputDataPortValidator().addAll((Collection<? extends Pattern>)newValue);
				return;
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				getOutputDataPortValidator().clear();
				getOutputDataPortValidator().addAll((Collection<? extends Pattern>)newValue);
				return;
			case CorePackage.TASK__ANALYSIS_TYPES:
				getAnalysisTypes().clear();
				getAnalysisTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.TASK__CIRCUMVENTING_PARENTS:
				getCircumventingParents().clear();
				getCircumventingParents().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.TASK__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends TraversalChunk>)newValue);
				return;
			case CorePackage.TASK__PREPROCESSING_TASKS:
				getPreprocessingTasks().clear();
				getPreprocessingTasks().addAll((Collection<? extends PreprocessingTask>)newValue);
				return;
			case CorePackage.TASK__RESOLVED_COMMAND:
				setResolvedCommand((Command)newValue);
				return;
			case CorePackage.TASK__UNRESOLVED_OUT_DATA_PORTS:
				getUnresolvedOutDataPorts().clear();
				getUnresolvedOutDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.TASK__PARAMS:
				((EStructuralFeature.Setting)getParams()).set(newValue);
				return;
			case CorePackage.TASK__STATIC_PARAMS:
				((EStructuralFeature.Setting)getStaticParams()).set(newValue);
				return;
			case CorePackage.TASK__RULE:
				setRule((Rule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.TASK__IN_DATA_PORTS:
				getInDataPorts().clear();
				return;
			case CorePackage.TASK__OUT_DATA_PORTS:
				getOutDataPorts().clear();
				return;
			case CorePackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.TASK__JEXL_STRING:
				setJexlString(JEXL_STRING_EDEFAULT);
				return;
			case CorePackage.TASK__UTIL:
				setUtil(UTIL_EDEFAULT);
				return;
			case CorePackage.TASK__LOGGER:
				setLogger(LOGGER_EDEFAULT);
				return;
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				getTraversalEvents().clear();
				return;
			case CorePackage.TASK__PARENTS:
				getParents().clear();
				return;
			case CorePackage.TASK__CHUNKS:
				getChunks().clear();
				return;
			case CorePackage.TASK__TOOL_NAMES:
				getToolNames().clear();
				return;
			case CorePackage.TASK__TOOLS:
				getTools().clear();
				return;
			case CorePackage.TASK__TOOL_MATCHES:
				getToolMatches().clear();
				return;
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				setPreviousTaskStr(PREVIOUS_TASK_STR_EDEFAULT);
				return;
			case CorePackage.TASK__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case CorePackage.TASK__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case CorePackage.TASK__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				return;
			case CorePackage.TASK__INPUTS:
				getInputs().clear();
				return;
			case CorePackage.TASK__OUTPUTS:
				getOutputs().clear();
				return;
			case CorePackage.TASK__INPUTS_BY_DATA_PORT:
				getInputsByDataPort().clear();
				return;
			case CorePackage.TASK__OUTPUTS_BY_DATA_PORT:
				getOutputsByDataPort().clear();
				return;
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				getInputDataPortValidator().clear();
				return;
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				getOutputDataPortValidator().clear();
				return;
			case CorePackage.TASK__ANALYSIS_TYPES:
				getAnalysisTypes().clear();
				return;
			case CorePackage.TASK__CIRCUMVENTING_PARENTS:
				getCircumventingParents().clear();
				return;
			case CorePackage.TASK__RECORDS:
				getRecords().clear();
				return;
			case CorePackage.TASK__PREPROCESSING_TASKS:
				getPreprocessingTasks().clear();
				return;
			case CorePackage.TASK__RESOLVED_COMMAND:
				setResolvedCommand((Command)null);
				return;
			case CorePackage.TASK__UNRESOLVED_OUT_DATA_PORTS:
				getUnresolvedOutDataPorts().clear();
				return;
			case CorePackage.TASK__PARAMS:
				getParams().clear();
				return;
			case CorePackage.TASK__STATIC_PARAMS:
				getStaticParams().clear();
				return;
			case CorePackage.TASK__RULE:
				setRule((Rule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.TASK__IN_DATA_PORTS:
				return inDataPorts != null && !inDataPorts.isEmpty();
			case CorePackage.TASK__OUT_DATA_PORTS:
				return outDataPorts != null && !outDataPorts.isEmpty();
			case CorePackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.TASK__JEXL_STRING:
				return JEXL_STRING_EDEFAULT == null ? jexlString != null : !JEXL_STRING_EDEFAULT.equals(jexlString);
			case CorePackage.TASK__UTIL:
				return util != UTIL_EDEFAULT;
			case CorePackage.TASK__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				return traversalEvents != null && !traversalEvents.isEmpty();
			case CorePackage.TASK__PARENTS:
				return parents != null && !parents.isEmpty();
			case CorePackage.TASK__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case CorePackage.TASK__TOOL_NAMES:
				return toolNames != null && !toolNames.isEmpty();
			case CorePackage.TASK__TOOLS:
				return tools != null && !tools.isEmpty();
			case CorePackage.TASK__TOOL_MATCHES:
				return toolMatches != null && !toolMatches.isEmpty();
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				return PREVIOUS_TASK_STR_EDEFAULT == null ? previousTaskStr != null : !PREVIOUS_TASK_STR_EDEFAULT.equals(previousTaskStr);
			case CorePackage.TASK__ROOT:
				return root != ROOT_EDEFAULT;
			case CorePackage.TASK__FLAGS:
				return flags != FLAGS_EDEFAULT;
			case CorePackage.TASK__GROUPING_CRITERIA:
				return groupingCriteria != null && !groupingCriteria.isEmpty();
			case CorePackage.TASK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CorePackage.TASK__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CorePackage.TASK__INPUTS_BY_DATA_PORT:
				return inputsByDataPort != null && !inputsByDataPort.isEmpty();
			case CorePackage.TASK__OUTPUTS_BY_DATA_PORT:
				return outputsByDataPort != null && !outputsByDataPort.isEmpty();
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				return inputDataPortValidator != null && !inputDataPortValidator.isEmpty();
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				return outputDataPortValidator != null && !outputDataPortValidator.isEmpty();
			case CorePackage.TASK__ANALYSIS_TYPES:
				return analysisTypes != null && !analysisTypes.isEmpty();
			case CorePackage.TASK__CIRCUMVENTING_PARENTS:
				return circumventingParents != null && !circumventingParents.isEmpty();
			case CorePackage.TASK__RECORDS:
				return records != null && !records.isEmpty();
			case CorePackage.TASK__PREPROCESSING_TASKS:
				return preprocessingTasks != null && !preprocessingTasks.isEmpty();
			case CorePackage.TASK__RESOLVED_COMMAND:
				return resolvedCommand != null;
			case CorePackage.TASK__UNRESOLVED_OUT_DATA_PORTS:
				return unresolvedOutDataPorts != null && !unresolvedOutDataPorts.isEmpty();
			case CorePackage.TASK__PARAMS:
				return params != null && !params.isEmpty();
			case CorePackage.TASK__STATIC_PARAMS:
				return staticParams != null && !staticParams.isEmpty();
			case CorePackage.TASK__RULE:
				return rule != null;
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
			case CorePackage.TASK___READ_TASK__STRING_STRING_ELIST:
				readTask((String)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2));
				return null;
			case CorePackage.TASK___SHALL_PROCESS__ELIST_STRING:
				return shallProcess((EList<GroupingInstance>)arguments.get(0), (String)arguments.get(1));
			case CorePackage.TASK___SHALL_PROCESS__ELIST_STRING_ELIST_BOOLEAN:
				return shallProcess((EList<GroupingInstance>)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (Boolean)arguments.get(3));
			case CorePackage.TASK___PARSE_DATA_FORMAT_FIELD__STRING_ELIST:
				return parseDataFormatField((String)arguments.get(0), (EList<Pattern>)arguments.get(1));
			case CorePackage.TASK___GET_UNIQUE_STRING:
				return getUniqueString();
			case CorePackage.TASK___GET_UNIQUE_URI_STRING:
				return getUniqueURIString();
			case CorePackage.TASK___IS_COMPATIBLE_WITH_OUT_DATA_PORT_FOR__DATAPORT:
				return isCompatibleWithOutDataPortFor((DataPort)arguments.get(0));
			case CorePackage.TASK___IS_COMPATIBLE_WITH_IN_DATA_PORT_FOR__DATAPORT:
				return isCompatibleWithInDataPortFor((DataPort)arguments.get(0));
			case CorePackage.TASK___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT:
				return getParentTaskByOutDataPort((DataPort)arguments.get(0));
			case CorePackage.TASK___GET_NON_OVERALPPING_TRAVERSAL_CHUNKS_FOR__TASK:
				return getNonOveralppingTraversalChunksFor((Task)arguments.get(0));
			case CorePackage.TASK___READ_TOOLS__ELIST:
				readTools((EList<Tool>)arguments.get(0));
				return null;
			case CorePackage.TASK___GET_PREFERRED_TOOL:
				return getPreferredTool();
			case CorePackage.TASK___GET_OVERLAPPING_DATA_PORTS__ELIST_ELIST:
				return getOverlappingDataPorts((EList<DataPort>)arguments.get(0), (EList<DataPort>)arguments.get(1));
			case CorePackage.TASK___RESOLVE_COMMAND_LINE_PART_INTERPRETER:
				try {
					return resolveCommandLinePartInterpreter();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RESOLVE_COMMAND_LINE_PART_EXE:
				try {
					return resolveCommandLinePartExe();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RESOLVE_COMMAND_LINE_PART_ANALYSIS_TYPE:
				try {
					return resolveCommandLinePartAnalysisType();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RESOLVE_COMMAND_LINE_PART__STRING_BOOLEAN_BOOLEAN:
				try {
					return resolveCommandLinePart((String)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___GET_COMMAND_LINE_PATTERN:
				return getCommandLinePattern();
			case CorePackage.TASK___VALIDATE_TOOL__TOOL:
				return validateTool((Tool)arguments.get(0));
			case CorePackage.TASK___VALIDATE_TOOLS:
				return validateTools();
			case CorePackage.TASK___GET_DATA_PORT_BY_DATA_PORT__DATAPORT_BOOLEAN:
				return getDataPortByDataPort((DataPort)arguments.get(0), (Boolean)arguments.get(1));
			case CorePackage.TASK___GET_DATA_PORT_BY_NAME_OF_FORMAT__STRING_BOOLEAN:
				return getDataPortByNameOfFormat((String)arguments.get(0), (Boolean)arguments.get(1));
			case CorePackage.TASK___GET_DATA_PORT_BY_NAME__STRING_BOOLEAN:
				return getDataPortByName((String)arguments.get(0), (Boolean)arguments.get(1));
			case CorePackage.TASK___RESOLVE_MISSING_DATA_PORTS_BY_TOOL__ELIST:
				return resolveMissingDataPortsByTool((EList<Task>)arguments.get(0));
			case CorePackage.TASK___GET_OVERLAPPING_CHUNKS_FOR__TASK_STRING:
				return getOverlappingChunksFor((Task)arguments.get(0), (String)arguments.get(1));
			case CorePackage.TASK___GET_REQUIRED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN:
				try {
					return getRequiredGroupingsFor((Tool)arguments.get(0), (DataPort)arguments.get(1), (Boolean)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___GET_PROVIDED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN:
				try {
					return getProvidedGroupingsFor((Tool)arguments.get(0), (DataPort)arguments.get(1), (Boolean)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROVIDE_MULTIPLE_GROUPINGS_FOR__TOOL_DATAPORT:
				try {
					return canProvideMultipleGroupingsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT:
				try {
					return canProvideMultipleInputsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT:
				try {
					return canProvideMultipleInstancesFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT:
				try {
					return canProvideMultipleInstancesPerInputFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT:
				try {
					return canProcessMultipleInputsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT:
				try {
					return canProcessMultipleInstancesFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT:
				try {
					return canProcessMultipleInstancesPerInputFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT:
				try {
					setProcessMultipleInstancesPerInputFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT:
				try {
					setProcessMultipleInstancesFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT:
				try {
					setProcessMultipleInputsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__TOOL_DATAPORT:
				try {
					setProvideMultipleInstancesPerInputFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT:
				try {
					setProvideMultipleInstancesFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___SET_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT:
				try {
					setProvideMultipleInputsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_FILTER_INSTANCES_FOR__TOOL_DATAPORT:
				try {
					return canFilterInstancesFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___GET_RECORDS__BOOLEAN:
				return getRecords((Boolean)arguments.get(0));
			case CorePackage.TASK___GET_INPUTS__BOOLEAN:
				return getInputs((Boolean)arguments.get(0));
			case CorePackage.TASK___GET_OVERLAPPING_RECORDS_PROVIDED_BY__TASK:
				return getOverlappingRecordsProvidedBy((Task)arguments.get(0));
			case CorePackage.TASK___CAN_PROVIDE_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN:
				try {
					return canProvideDataPort((Tool)arguments.get(0), (DataPort)arguments.get(1), (String)arguments.get(2), (EList<TraversalChunk>)arguments.get(3), (Boolean)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_COMSUME_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN:
				try {
					return canComsumeDataPort((Tool)arguments.get(0), (DataPort)arguments.get(1), (String)arguments.get(2), (EList<TraversalChunk>)arguments.get(3), (Boolean)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___GET_OUTPUTS_FOR_DATA_PORT__DATAPORT:
				return getOutputsForDataPort((DataPort)arguments.get(0));
			case CorePackage.TASK___GET_INPUTS_FOR_DATA_PORT__DATAPORT:
				return getInputsForDataPort((DataPort)arguments.get(0));
			case CorePackage.TASK___RESOLVE_PARAMS:
				try {
					resolveParams();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___IS_IDENTITY_TRANSFORMATION:
				return isIdentityTransformation();
			case CorePackage.TASK___IS_IDENTITY_TRANSFORMATION__DATAPORT:
				return isIdentityTransformation((DataPort)arguments.get(0));
			case CorePackage.TASK___RESOLVE_CONDITIONAL_STATIC_PARAM__RESOLVEDPARAM:
				resolveConditionalStaticParam((ResolvedParam)arguments.get(0));
				return null;
			case CorePackage.TASK___READ_FROM_PIPE:
				return readFromPipe();
			case CorePackage.TASK___WRITE_TO_PIPE:
				return writeToPipe();
			case CorePackage.TASK___CREATE_RULE:
				try {
					return createRule();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RETRIEVE_DATA_PORT__BOOLEAN_INT:
				return retrieveDataPort((Boolean)arguments.get(0), (Integer)arguments.get(1));
			case CorePackage.TASK___RESOLVE_DATA_PORT_PARAMS__EMAP_TOOL_BOOLEAN:
				try {
					resolveDataPortParams((EMap<String, DataLink>)arguments.get(0), (Tool)arguments.get(1), (Boolean)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RESOLVE_STATIC_PARAMS__EMAP:
				resolveStaticParams((EMap<String, ResolvedParam>)arguments.get(0));
				return null;
			case CorePackage.TASK___GET_DETAILED_STRING:
				return getDetailedString();
			case CorePackage.TASK___GET_VALID_IN_OUT_DATA_PORT_COMBINATIONS:
				return getValidInOutDataPortCombinations();
			case CorePackage.TASK___READ_TRAVERSAL_CRITERIA__STRING:
				return readTraversalCriteria((String)arguments.get(0));
			case CorePackage.TASK___READ_GROUPING_CRITERIA__STRING_ELIST_STRING:
				return readGroupingCriteria((String)arguments.get(0), (EList<String>)arguments.get(1), (String)arguments.get(2));
			case CorePackage.TASK___CREATE_GROUPING_CRITERIA__STRING_DATAPORT_STRING:
				return createGroupingCriteria((String)arguments.get(0), (DataPort)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", jexlString: ");
		result.append(jexlString);
		result.append(", util: ");
		result.append(util);
		result.append(", logger: ");
		result.append(logger);
		result.append(", previousTaskStr: ");
		result.append(previousTaskStr);
		result.append(", root: ");
		result.append(root);
		result.append(", flags: ");
		result.append(flags);
		result.append(", inputDataPortValidator: ");
		result.append(inputDataPortValidator);
		result.append(", outputDataPortValidator: ");
		result.append(outputDataPortValidator);
		result.append(", analysisTypes: ");
		result.append(analysisTypes);
		result.append(", circumventingParents: ");
		result.append(circumventingParents);
		result.append(')');
		return result.toString();
	}

} // TaskImpl
