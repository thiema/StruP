/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
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
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.data.DataFactory;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Command;
import easyflow.tool.InOutParameter;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
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
 *   <li>{@link easyflow.core.impl.TaskImpl#getCommand <em>Command</em>}</li>
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
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

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
	public Command getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TASK__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TASK__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TASK__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__COMMAND, newCommand, newCommand));
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

		short taskField = 0;
		short taskType = 1;
		short toolField = 2;
		short inDataPortField = 3;
		short outDataPortField = 4;
		short groupingCritField = 5;
		short traversalCritField = 6;
		short jexlField = 7;
		// String[] defaultGroupingCriteria={};
		// defaultGroupingCriteria=new String[] {"Sample"};
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
					inputDataPortValidator);
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
					outputDataPortValidator);
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

		if (hasIndataPorts) {
			short dataPortNo = 0;

			// String[] groupingStrA=groupingStr.split(";");
			for (String groupingString : groupingStr.split(";")) {
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
				logger.trace("readTask(): " + getName() + " " + groupingString
						+ " dataPort=" + dataPort.getName() + " ("
						+ getInDataPorts().size() + ","
						+ getOutDataPorts().size() + ")");

				if (tmp.length > 0) {
					for (int i = 0; i < tmp.length; i++) {

						TraversalCriterion traversalCriterion = TraversalFactory.eINSTANCE
								.createTraversalCriterion();
						traversalCriterion.setDataPort(dataPort);
						String[] group = tmp[i].split(":");
						if (group.length > 1)
							traversalCriterion.setMode(group[1]);
						else
							traversalCriterion.setMode(defaultMode);

						TraversalEvent traversalEvent = TraversalFactory.eINSTANCE
								.createTraversalEvent();
						traversalCriterion.setId(group[0]);
						logger.trace("readTask(): "
								+ " set traversal criterion="
								+ traversalCriterion.getId());

						TraversalOperation traversalOperation = TraversalFactory.eINSTANCE
								.createTraversalOperation();
						traversalOperation.setType("grouping");
						traversalCriterion.setOperation(traversalOperation);

						traversalEvent
								.setTraversalCriterion(traversalCriterion);
						traversalEvent.setSplitTask(this);
						logger.trace("readTask(): " + "adding travcrit: "
								+ traversalCriterion.getId() + " ");
						getTraversalEvents().put(traversalCriterion.getId(),
								traversalEvent);
						getGroupingCriteria().put(traversalCriterion.getId(),
								traversalCriterion.getMode());
						dataPort.getGroupingCriteria().add(traversalCriterion);
					}
				}
			}
		}

		/**
		 * Read the traversal Expression
		 * 
		 * for example: splitting and merging criteria
		 */

		if (wtplArray.length > 6) {
			if (!wtplArray[6].equals("")) {
				tmp = wtplArray[6].split(";");
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
					if (traversalOperation.getType().equals("split"))
						traversalEvent.setSplitTask(this);
					else if (traversalOperation.getType().equals("merge"))
						traversalEvent.getMergeTask().add(this);
					logger.trace("readTask(): " + "adding travcrit: "
							+ traversalCriterion.getId() + " ");
					getTraversalEvents().put(traversalCriterion.getId(),
							traversalEvent);
					// }
					// }
				}
			}
		}

		/**
		 * Read the preprocessing tasks
		 */
		if (wtplArray.length > 7 && !wtplArray[7].equals("")) {
			tmp = wtplArray[7].split(";");
			for (String allPrepStr : tmp) {
				String[] allPreps = allPrepStr.split(",");
				for (String prepTaskStr : allPreps) {
					String[] tmp2 = prepTaskStr.split(":");
					PreprocessingTask prepTask = CoreFactory.eINSTANCE
							.createPreprocessingTask();
					prepTask.setName(tmp2[0]);
					if (tmp2.length > 1)
						prepTask.setExpression(tmp2[1]);
					getPreprocessingTasks().add(prepTask);
				}
			}
		}

		/**
		 * Read JEXL
		 */
		if (wtplArray.length > 8) {
			setJexlString(wtplArray[8]);
			// logger.debug(shallProcessJEXL);

		}
		setPreviousTaskStr(getUniqueString());

		String out = "";
		for (String key : getTraversalEvents().keySet()) {
			TraversalEvent te = getTraversalEvents().get(key);
			out += "key="
					+ key
					+ " split="
					+ (te.getSplitTask() != null ? te.getSplitTask()
							.getUniqueString() : null)
					+ " merge="
					+ (te.getMergeTask() != null ? StringUtils.join(
							toStringList(te.getMergeTask()), ",") : null)
					+ "; ";
		}
		logger.debug("readTask(): " + getUniqueString() + " traversalEvents="
				+ getTraversalEvents().keySet() + " (" + out + ") "
				+ debugDataPort + " jexl exp='" + getJexlString() + "'");
	}

	private EList<String> toStringList(EList<Task> tasks) {
		EList<String> list = new BasicEList<String>();
		for (Task t : tasks)
			list.add(t.getUniqueString());
		return list;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean shallProcess(EList<GroupingInstance> groupingInstances,
			String forGrouping) {

		Object evalObject = easyflow.custom.util.Util.evaluateJexl(
				easyflow.custom.util.Util.createMetaDataMapForJexl(
						groupingInstances, forGrouping), getJexlString());
		return shallProcess(evalObject);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean shallProcess(EList<GroupingInstance> groupingInstances,
			String forGrouping, EList<String> jexlStrings, boolean isInverse) {

		EMap<String, Object> map = easyflow.custom.util.Util.
				createMetaDataMapForJexl
					(groupingInstances,	forGrouping);
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


	private DataPort parseDataPortField(String field, EList<Pattern> pattern) {
		DataPort dataPort = DataFactory.eINSTANCE.createDataPort();
		String[] tmp = field.split(":");
		String dataPortString = tmp[0];
		String dataFormatString;
		if (tmp.length > 1) {
			dataPort.setName(dataPortString);
			dataFormatString = tmp[1];
			if (tmp.length > 2)
				logger.warn("unexpected format detected: multiple occurance of ':'.");
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

	
	//private void shallProcess(Map<String, Object> metaDataMap) {
		/*
		 * =====EXAMPLES====
		 */
		/*
		 * String jexlStr = "((G1 + G2 + G3) * 0.1) + G4=='9.541'"; Expression
		 * e1 = jexl.createExpression( jexlStr );
		 * 
		 * // populate the context JexlContext context = new MapContext();
		 * context.set("G1", 10); context.set("G2", 5.4); context.set("G3",
		 * 0.01); context.set("G4", 8); // ... // work it out
		 * System.out.println(""+e1.evaluate(context)); e1 =
		 * jexl.createExpression
		 * ("Platform =~ [\"Illumina\",'b',\"c\",\"d\",\"e\",\"f\"]"); context =
		 * new MapContext(); context.set("Platform", "Illumina");
		 * System.out.println(""+e1.evaluate(context));
		 * 
		 * jexlStr = "Platform =~ [ 3,4]"; //e1 =
		 * jexl.createExpression(StringParser.buildString(jexlStr, true)); e1 =
		 * jexl.createExpression(jexlStr); context = new MapContext();
		 * context.set("Platform", 3);
		 * System.out.println(""+e1.evaluate(context));
		 */
	//}

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
		return getUniqueString_("-", "_", "=");
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
						+ dataPort1.getName() + " vs " + dataPort2.getName());
				if (dataPort2.isCompatible(dataPort1))
					dataPorts.add(dataPort1);
			}
		return dataPorts;

	}

	/**
	 * <!-- begin-user-doc -->
	 * produce the command line by evaluating the command pattern
	 * 
	 * the following patterns are understood:
	 *  1.) in out opt pos (and any permuation) //meaning: makes sure that in/out/opt/pos params come at it proposed position
	 *                                          //         input parameter come at it proposed position, even if they are optional/positional 
	 *  2.) opt pos                             //meaning: optional params first, positional params afterwards
	 *                                          //         inputs and outputs are mapped to opt and pos, depending on
	 *                                          //         whether they are optional ore positional
	 *  3.) pos in out                          //meaning: no optional parameters are produced
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String createCommandLine(String commandPattern) {

		Tool           tool        = getPreferredTool();
		EList<String>  commandLineParts = new BasicEList<String>();
		
		commandLineParts.add(createCommandLinePart1(tool));
		
		String[] commandPatterns = commandPattern.split(" ");
		logger.debug("createCommandLine(): create command line for tool="+tool.getId()+" and pattern="+commandPattern);
		
		
		// check if commandpatterns contains input and or output 
		boolean isInputDefined = false;
		boolean isOutputDefined = false;
		for (String part : commandPatterns)
		{
			if (part.equalsIgnoreCase("in"))
				isInputDefined = true;
			else if (part.equalsIgnoreCase("out"))
				isOutputDefined = true;
		}
			

		
		for (String commandLinePart : commandPatterns)
		{
			//logger.trace("createCommandLine(): "+commandLinePart);
			if (GlobalConfig.getValidCommandPatternParts().contains(commandLinePart))
			{
				commandLineParts.add(createCommandLinePart2(null, isInputDefined, isOutputDefined, commandLinePart));
			}
			else
			{
				logger.error("createCommandLine(): invalid command part "+commandLinePart+" found for tool="+tool.getId());
			}
			/*
			if (commandLineParts.containsKey(commandLinePart))
			{
				EList<String> keys = commandLineParts.get(commandLinePart);
				
					for (String key : keys)
					{
					
							String tmp = getCommand().getResolvedParams().
							get(key).generateCommandString(null);
							logger.debug("process cmd part="+commandLinePart+" "+key+"="+tmp);
							commandLine += " "+tmp;

					}
			}*/
		}
		logger.debug(commandLineParts);
		return StringUtils.join(commandLineParts, " ");
	}

	
	private String createCommandLinePart1(Tool tool)
	{
		EList<String>  exe  = new BasicEList<String>();
		
		// resolve Interpreter
		if (tool.getExecutables().containsKey("interpreter"))
			exe.add(getPreferredTool().getExecutables().get("interpreter")
					.getPath());
		else if (tool.getPackage() != null && tool.getPackage().getInterpreter() != null)
			exe.add(tool.getPackage().getInterpreter());
		
		
		// resolve interpreter options
		
		
		// resolve the executable
		
		if (tool.getExecutables().containsKey("executable"))
			exe.add(tool.getExecutables().get("executable").getPath());
		else if (tool.getPackage() != null)
		{
			if (tool.getPackage().getExe()!=null)
			{
				exe.add(tool.getPackage().getExe());
			} else
				exe.add(tool.getPackage().getId());
		}
		
		if (exe.isEmpty())
			logger.error("createCommandLinePart1(): no executables found for tool="+tool.getId());
		
		// check submodule
		String anaType = tool.getAnalysisTypeOfPackage(getRecords());
		if (anaType != null)
		{
			logger.debug("add module="+anaType+" for tool="+tool.getName()+" ("+tool.getId()+")");
			exe.add(anaType);
			//map.put("module", module);
		}

		
		return StringUtils.join(exe, " ");

	}
	
	/**
	 * creates commandline or parts of it with respect to the requested part (type). 
	 * 
	 *  
	 * Example usage: 
	 * 
	 * -get input part of command line, the omit-params dont care:
	 * 
	 *     createCommandLinePart2(tool, constraints, xxx, xxx, "in")
	 * 
	 *  -get output part of command line, the omit-params dont care:
	 *  
	 *     createCommandLinePart2(tool, constraints, xxx, xxx, "out")
	 *     
	 *  -get optional params of command line:
	 *     createCommandLinePart2(tool, constraints, true, true, "opt")   - omit any inputs/output parameter
	 *     createCommandLinePart2(tool, constraints, false, false, "opt") - include in/out
	 *     
	 *  -get positional part of command line:
	 *     createCommandLinePart2(tool, constraints, true, false, "pos")  - include input, exclude output
	 *     createCommandLinePart2(tool, constraints, false, true, "pos")  - ...
	 * 
	 * @param tool
	 * @param constaints
	 * @param omitInput
	 * @param omitOutput
	 * @param type
	 * @return
	 */
	private String createCommandLinePart2(
			EMap<String, Object> constaints,
			boolean omitInput,
			boolean omitOutput,
			String type)
	{
		EList<String> commandLineList = new BasicEList<String>();
		Iterator<Entry<String, ResolvedParam>> it = getCommand().getResolvedParams().entrySet().iterator();  
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e      = it.next();
			ResolvedParam    resolvedParam      = e.getValue();
			Parameter        parameter          = resolvedParam.getParameter();
			EList<Parameter> effectiveParams    =  parameter.getEffectiveParameters(null);
			Parameter        effectiveParameter = null;
			if (!effectiveParams.isEmpty())
				effectiveParameter = retrieveEffectiveParam(effectiveParams, constaints);
			
			
			InOutParameter   inOutParameter = null;
			boolean          isInOutParam   = false;
			boolean          shallGenerate  = false;
			if (parameter instanceof InOutParameter)
			{
				inOutParameter = (InOutParameter) parameter;
				isInOutParam   = true;
			}
			else if (effectiveParameter.isDataParam())
			{
				isInOutParam = true;
				inOutParameter = (InOutParameter) effectiveParameter;
			}
			
			
			if (type == null)
			{
				shallGenerate = true;
			}
			else if (isInOutParam && !inOutParameter.isOutput())
			{
				if ("in".equals(type)) 
					shallGenerate = true;
				else if (!omitInput && (("opt".equals(type) && parameter.isOptional()) || ("pos".equals(type) && !parameter.isOptional())))
					shallGenerate = true;
			}
			else if (isInOutParam && inOutParameter.isOutput())
			{
				if ("out".equals(type)) 
					shallGenerate = true;
				else if (!omitOutput && (("opt".equals(type) && parameter.isOptional()) || ("pos".equals(type) && !parameter.isOptional())))
					shallGenerate = true;
			}
			else if ("opt".equals(type) && parameter.isOptional())
			{
				shallGenerate = true;
			}
			else if ("pos".equals(type) && !parameter.isOptional())
			{
				shallGenerate = true;
			}
			
			logger.debug("shallGenerate="+shallGenerate+" omitIn="+omitInput+" omitOut="+omitOutput
					+" param type="+type+" of param="+resolvedParam.getParameter().getName()
					+" type="+resolvedParam.getParameter().getType()
					+" output="+parameter.isOutput()
					);
			if (shallGenerate)
			{
				//logger.trace("add param="+resolvedParam.getParameter().getName()+" "+parameter.getName()
						//		+" cmd="+getCommand().hashCode()+" map="+getCommand().getResolvedParams().hashCode()+" "
						//		+" resolvedparam="+resolvedParam.hashCode()+" param="+resolvedParam.getParameter().hashCode()
					//			);
				String res = resolvedParam.generateCommandString(constaints);
				if (res != null)
					commandLineList.add(res);
			}
			
		}
		
		return StringUtils.join(commandLineList, " ");
	}
	
	
	private Parameter retrieveEffectiveParam(EList<Parameter> effectiveParams, EMap<String, Object> constraints) {
		for (Parameter param:effectiveParams)
		{
			if (constraints != null && 
				constraints.containsKey("handle") && 
				param.getSupportedHandles(true).contains(constraints.get("handle")))
				return param;
			else
				return param;
		}
		return null;
	}

	private void resolveDataPorts(EMap<String, DataLink> map, Tool tool, boolean isOutput) throws ParameterNotFoundException, NoValidInOutDataException {
		
		//EList<String> list = new BasicEList<String>();
		
		Iterator<Entry<String, DataLink>> it = map.iterator();
		while (it.hasNext()) {
			Entry<String, DataLink> e = it.next();
			DataLink  dataLink  = e.getValue();
			Parameter dataParam = dataLink.getData().getParameter().getEffectiveParentParameter(true); 
			String    paramName = null;
			
			if (isOutput)
				paramName = dataLink.getInDataPort().getParameterName();
				//paramName = dataParam.getName();
			else
			{
				paramName = dataLink.getDataPort().getParameterName();
				if (paramName == null)
					paramName = dataParam.getName();
			}
			//dataLink.getData().getDataResourceName().getPath();
			if (getCommand()==null)
				logger.debug("cmd null");
			logger.debug("dataPorts2ParamStringList(): out="+isOutput
					+" datalink="+dataLink.hashCode()+" "+dataLink.getDataPort().hashCode()+" "+dataLink.getInDataPort().hashCode()
					+"\n dataLink="+dataLink.getUniqueString(true) 
					+"; in="+dataLink.getInDataPort().getParameterName()+" out="+dataLink.getDataPort().getParameterName()
					+"; data param="+paramName+" (default="+dataParam.getName()+")"
					+"; data resource="+dataLink.getData().getDataResourceName().toString()+" "+getInputs().hashCode());
			if (paramName == null || !getCommand().getResolvedParams().containsKey(paramName))
			{
				//throw new ParameterNotFoundException();
				logger.warn("dataPorts2ParamStringList(): no parameter defined. This is ok for hidden/implicit input/output data."+
						"in="+dataLink.getInDataPort().getParameterName()+" out="+dataLink.getDataPort().getParameterName()
						+" dataLink="+dataLink.getUniqueString(true)
						+"; data resource="+dataLink.getData().getDataResourceName().toString());
				continue;
			}
			ResolvedParam parameter = getCommand().getResolvedParams().get(paramName);
			
			//logger.trace("dataPorts2ParamStringList(): cmd param keyset="+getCommand().getResolvedParams().keySet());
			//parameter.getValue().clear();
			if (dataLink.getData().getDataResourceName()==null)
				throw new NoValidInOutDataException();
			parameter.getValue().add(dataLink.getData().getDataResourceName());
			//logger.debug("param id="+parameter.hashCode()
				//	+" getParam()="+getCommand().getResolvedParams().get(paramName).hashCode()
				//	+" map id="+getCommand().getResolvedParams().hashCode()
				//	+" cmd id="+getCommand().hashCode()+" tool="+tool.hashCode()+" task="+hashCode());
			//list.add(paramName);

		}
	}

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
		setCommand(EcoreUtil.copy(tool.getCommand()));
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
	public boolean canProcessMultiplesInstancesFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		if (tool == null)
			tool = getPreferredTool();
		if (tool == null)
			throw new ToolNotFoundException();
		return tool.canProcessMultiplesInstancesFor(dataPort);
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
	public EList<TraversalChunk> getRecords(boolean intersect) {

		boolean modeUnion = !intersect;
		boolean firstTC = true;
		// if (!getRecords().isEmpty())
		// {
		// logger.warn("getRecords(): record already processed. Return cached value.");
		// return getRecords();
		getRecords().clear();
		// }
		EMap<String, TraversalChunk> chunks = new BasicEMap<String, TraversalChunk>();
		for (String groupingStr : getChunks().keySet()) {
			logger.trace("getRecords(): find records for grouping "
					+ groupingStr
					+ " of task"
					+ getUniqueString()
					+ " (is contained="
					+ GlobalVar.getGraphUtil().getMetaData()
							.containsColumn(groupingStr) + ")");
			if (GlobalVar.getGraphUtil().getMetaData()
					.containsColumn(groupingStr)) {
				if (!groupingStr.equals("Record")) {
					if (modeUnion || firstTC) {
						firstTC = false;
						for (TraversalChunk traversalChunk : getChunks().get(
								groupingStr)) {

							EList<String> recs = GlobalVar
									.getGraphUtil()
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
									+ StringUtils.join(
											GlobalVar
													.getGraphUtil()
													.getMetaData()
													.getRecordsBy(
															groupingStr,
															traversalChunk
																	.getName())
													.iterator(), ", ") + ")");
							for (String rec : GlobalVar
									.getGraphUtil()
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
			} else {
				logger.info("getRecords(): no records can be retrieved for grouping="
						+ groupingStr
						+ ", because it is not contained in metadata table.");
			}
		}
		logger.debug("getRecords(): result=" + chunks.values().size());
		getRecords().addAll(new BasicEList<TraversalChunk>(chunks.values()));
		return getRecords();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public EList<TraversalChunk> getOverlappingRecordsProvidedBy(Task testTask) {

		EList<TraversalChunk> overlappingTraversalChunks = new BasicEList<TraversalChunk>();
		logger.debug("getOverlappingRecordsProvidedBy(): retrieve records for task "
				+ testTask.getUniqueString());
		EList<TraversalChunk> providedTraversalChunks = testTask
				.getRecords(true);

		logger.debug("getOverlappingRecordsProvidedBy(): retrieve records for task "
				+ getUniqueString());
		for (TraversalChunk traversalChunk : getRecords(true)) {
			logger.debug("getOverlappingRecordsProvidedBy(): test required chunk "
					+ traversalChunk.getName());
			for (TraversalChunk providedTraversalChunk : providedTraversalChunks) {
				logger.debug("getOverlappingRecordsProvidedBy(): "
						+ providedTraversalChunk.getName()
						+ " match="
						+ traversalChunk.getName().equals(
								providedTraversalChunk.getName()));
				if (traversalChunk.getName().equals(
						providedTraversalChunk.getName())) {

					overlappingTraversalChunks.add(traversalChunk);
				}
			}
		}
		return overlappingTraversalChunks;
	}

	/**
	 * <!-- begin-user-doc --> Tell, if the task and its implementing tool is
	 * able to generate the outputs that match the given dataPort. To refine the
	 * evaluation specify grouping string and, optional, a list of chunks for
	 * the given grouping. Usually the most granular grouping is used (e.g. ID
	 * or records) to precisely define which outputs are of interest. <!--
	 * end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean canProvideDataPort(Tool tool, DataPort dataPort,
			String grouping, EList<TraversalChunk> traversalChunks)
			throws DataPortNotFoundException, ToolNotFoundException {

		if (traversalChunks == null) {
			// todo: if the the chunks for the grouping criteria can be provided
			// (-> check with tool definition)
		} else if (grouping != null
				&& grouping.equals(GlobalConstants.TRAVERSAL_CRITERION_RECORD)) {
			EList<TraversalChunk> recs = getRecords(true);
			if (recs.size() == traversalChunks.size()) {
				for (TraversalChunk requiredChunk : traversalChunks) {
					TraversalChunk rec = null;
					for (TraversalChunk provdiedChunk : recs) {
						if (requiredChunk.getName().equals(
								provdiedChunk.getName())) {
							rec = provdiedChunk;
							break;
						}
					}
					if (rec == null)
						break;
					recs.remove(rec);
				}
				return recs.isEmpty();
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean canComsumeDataPort(Tool tool, DataPort dataPort,
			String grouping, EList<TraversalChunk> traverslChunks)
			throws DataPortNotFoundException, ToolNotFoundException {
		return false;
	}

	private URI convertToURI(Object value) {
		URI uriValue = null;
		if (value instanceof TraversalChunk)
			value = ((TraversalChunk) value).getName();

		if (value instanceof URI)
			uriValue = (URI) value;
		else if (value instanceof String)
			try {
				uriValue = new URI((String) value);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return uriValue;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean setOutputForDataPort(String key, Object value,
			DataPort dataPort, String parameterName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
		/*
		 * URI uriValue = convertToURI(value); boolean rc = true; Tool t =
		 * getPreferredTool();
		 * 
		 * if (uriValue != null) { getOutputs().put(key, uriValue);
		 * getPreferredTool().getCommand().setOutputParameterValue(uriValue,
		 * parameterName, dataPort);
		 * 
		 * String dataPortKey = dataPort.getName(); EList<String> ports; if
		 * (getOutputsByDataPort().containsKey(dataPortKey)) { ports =
		 * getOutputsByDataPort().get(dataPortKey); } else { ports = new
		 * BasicEList<String>(); getOutputsByDataPort().put(dataPortKey, ports);
		 * } ports.add(key);
		 * 
		 * } else { rc = false; } return rc;
		 */
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public boolean setInputForDataPort(String key, Object value,
			DataPort dataPort, String parameterName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
		/*
		 * URI uriValue = convertToURI(value); boolean rc = true;
		 * 
		 * if (uriValue != null) { getInputs().put(key, uriValue);
		 * getPreferredTool().getCommand().setInputParameterValue(uriValue,
		 * parameterName, dataPort);
		 * 
		 * String dataPortKey = dataPort.getName(); EList<String> ports; if
		 * (getInputsByDataPort().containsKey(dataPortKey)) { ports =
		 * getInputsByDataPort().get(dataPortKey); } else { ports = new
		 * BasicEList<String>(); getInputsByDataPort().put(dataPortKey, ports);
		 * } ports.add(key);
		 * 
		 * } else { rc = false; } return rc;
		 */
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
				outputs.add(getOutputs().get(key).getData()
						.getDataResourceName());
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
				inputs.add(getInputs().get(key).getData().getDataResourceName());
			}
			return inputs;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws DataLinkNotFoundException
	 * @throws NoValidInOutDataException 
	 * @throws ParameterNotFoundException 
	 * @generated not
	 */
	public void resolveInputs() throws DataLinkNotFoundException, ParameterNotFoundException, NoValidInOutDataException {
		for (Object edge : GlobalVar
				.getGraphUtil()
					.getGraph()
						.getIncomingEdges(
								GlobalVar.getGraphUtil().getCells()
									.get(getUniqueString()))) {
			DataLink dataLink = GlobalVar.getGraphUtil().loadDataLink(edge);

			// getInputs().put(dataLink.getUniqueString(null, null, null),
			// dataLink);
			getInputs().put(new Integer(dataLink.getId()).toString(), dataLink);
		}
		resolveDataPorts(getInputs(), getPreferredTool(), false);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @throws ParameterNotFoundException 
	 * 
	 * @generated not
	 */
	public void resolveOutputs() throws DataLinkNotFoundException, ParameterNotFoundException, NoValidInOutDataException {
		if (GlobalVar.getGraphUtil().getCells().get(getUniqueString())==null)
			logger.error("resolveOutputs(): no cell found for "+getUniqueString());
		for (Object edge : GlobalVar
				.getGraphUtil()
					.getGraph()
						.getOutgoingEdges(
								GlobalVar.getGraphUtil().getCells()
									.get(getUniqueString()))) {
			DataLink dataLink = GlobalVar.getGraphUtil().loadDataLink(edge);

			// getOutputs().put(dataLink.getUniqueString(null, null, null),
			// dataLink);
			getOutputs().put(new Integer(dataLink.getId()).toString(), dataLink);
		}
		resolveDataPorts(getOutputs(), getPreferredTool(), true);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasMultipleInputsFor(DataPort dataPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasMultipleInstancesFor(DataPort dataPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasMultipleGroupingsFor(DataPort dataPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canProcessMultipleInputsFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canProcessMultipleInstancesFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canProcessMultipleGroupingsFor(Tool tool, DataPort dataPort)
			throws DataPortNotFoundException, ToolNotFoundException {
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
			String groupingStr) {

		EList<TraversalChunk> tc = new BasicEList<TraversalChunk>();
		if (getChunks().containsKey(groupingStr))
			for (TraversalChunk traversalChunk : getChunks().get(groupingStr)) {
				if (parentTask.getChunks().containsKey(groupingStr)) {
					for (TraversalChunk parentTraversalChunk : parentTask
							.getChunks().get(groupingStr)) {
						if (traversalChunk.getName().equals(
								parentTraversalChunk.getName()))
							tc.add(traversalChunk);
					}

				}
			}
		return tc;
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
			case CorePackage.TASK__COMMAND:
				return basicSetCommand(null, msgs);
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
			case CorePackage.TASK__COMMAND:
				return getCommand();
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
			case CorePackage.TASK__COMMAND:
				setCommand((Command)newValue);
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
			case CorePackage.TASK__COMMAND:
				setCommand((Command)null);
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
			case CorePackage.TASK__COMMAND:
				return command != null;
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
			case CorePackage.TASK___CREATE_COMMAND_LINE__STRING:
				try {
					return createCommandLine((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
			case CorePackage.TASK___HAS_MULTIPLE_INPUTS_FOR__DATAPORT:
				return hasMultipleInputsFor((DataPort)arguments.get(0));
			case CorePackage.TASK___HAS_MULTIPLE_INSTANCES_FOR__DATAPORT:
				return hasMultipleInstancesFor((DataPort)arguments.get(0));
			case CorePackage.TASK___HAS_MULTIPLE_GROUPINGS_FOR__DATAPORT:
				return hasMultipleGroupingsFor((DataPort)arguments.get(0));
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
			case CorePackage.TASK___CAN_PROCESS_MULTIPLE_GROUPINGS_FOR__TOOL_DATAPORT:
				try {
					return canProcessMultipleGroupingsFor((Tool)arguments.get(0), (DataPort)arguments.get(1));
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
			case CorePackage.TASK___GET_OVERLAPPING_RECORDS_PROVIDED_BY__TASK:
				return getOverlappingRecordsProvidedBy((Task)arguments.get(0));
			case CorePackage.TASK___CAN_PROVIDE_DATA_PORT__TOOL_DATAPORT_STRING_ELIST:
				try {
					return canProvideDataPort((Tool)arguments.get(0), (DataPort)arguments.get(1), (String)arguments.get(2), (EList<TraversalChunk>)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___CAN_COMSUME_DATA_PORT__TOOL_DATAPORT_STRING_ELIST:
				try {
					return canComsumeDataPort((Tool)arguments.get(0), (DataPort)arguments.get(1), (String)arguments.get(2), (EList<TraversalChunk>)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___GET_OUTPUTS_FOR_DATA_PORT__DATAPORT:
				return getOutputsForDataPort((DataPort)arguments.get(0));
			case CorePackage.TASK___GET_INPUTS_FOR_DATA_PORT__DATAPORT:
				return getInputsForDataPort((DataPort)arguments.get(0));
			case CorePackage.TASK___RESOLVE_INPUTS:
				try {
					resolveInputs();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case CorePackage.TASK___RESOLVE_OUTPUTS:
				try {
					resolveOutputs();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
