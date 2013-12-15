/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;


import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DataPort;
import easyflow.core.Task;

import easyflow.core.ToolMatch;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.XMLUtil;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.Grouping;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Data;
import easyflow.tool.DataFormat;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;
import easyflow.tool.ToolFactory;

import easyflow.traversal.GroupingCriterion;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToChunksMapImpl;
import easyflow.util.maps.impl.StringToStringListMapImpl;
import easyflow.util.maps.impl.StringToStringMapImpl;
import easyflow.util.maps.impl.StringToTaskMapImpl;
import easyflow.util.maps.impl.StringToToolMapImpl;
import easyflow.util.maps.impl.StringToToolMatchMapImpl;
import easyflow.util.maps.impl.StringToTraversalEventMapImpl;
import easyflow.util.maps.impl.StringToURIMapImpl;
import java.net.URI;
import easyflow.traversal.TraversalFactory;
import easyflow.traversal.TraversalOperation;

import java.lang.Object;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.regex.Pattern;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.apache.commons.jexl2.JexlEngine;
import org.apache.log4j.Logger;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.TaskImpl#getInDataPorts <em>In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutDataPorts <em>Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getJexlString <em>Jexl String</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#isUtil <em>Util</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getJexlEngine <em>Jexl Engine</em>}</li>
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
 *   <li>{@link easyflow.core.impl.TaskImpl#getInputDataPortValidator <em>Input Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getOutputDataPortValidator <em>Output Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getAnalysisTypes <em>Analysis Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getInDataPorts() <em>In Data Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> inDataPorts;

	/**
	 * The cached value of the '{@link #getOutDataPorts() <em>Out Data Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> outDataPorts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJexlString() <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJexlString()
	 * @generated
	 * @ordered
	 */
	protected static final String JEXL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJexlString() <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJexlString()
	 * @generated
	 * @ordered
	 */
	protected String jexlString = JEXL_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUtil()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UTIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUtil()
	 * @generated
	 * @ordered
	 */
	protected boolean util = UTIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJexlEngine() <em>Jexl Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJexlEngine()
	 * @generated not
	 * @ordered
	 */
	protected static final JexlEngine JEXL_ENGINE_EDEFAULT = new JexlEngine();

	/**
	 * The cached value of the '{@link #getJexlEngine() <em>Jexl Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJexlEngine()
	 * @generated
	 * @ordered
	 */
	protected JexlEngine jexlEngine = JEXL_ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Task.class);

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
	 * The cached value of the '{@link #getTraversalEvents() <em>Traversal Events</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversalEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, TraversalEvent> traversalEvents;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Task> parents;

	/**
	 * The cached value of the '{@link #getChunks() <em>Chunks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<TraversalChunk>> chunks;

	/**
	 * The cached value of the '{@link #getToolNames() <em>Tool Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<String>> toolNames;

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
	 * The cached value of the '{@link #getToolMatches() <em>Tool Matches</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolMatches()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ToolMatch> toolMatches;

	/**
	 * The default value of the '{@link #getPreviousTaskStr() <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTaskStr()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_TASK_STR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPreviousTaskStr() <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTaskStr()
	 * @generated
	 * @ordered
	 */
	protected String previousTaskStr = PREVIOUS_TASK_STR_EDEFAULT;

	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected int flags = FLAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroupingCriteria() <em>Grouping Criteria</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> groupingCriteria;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> outputs;

	/**
	 * The cached value of the '{@link #getInputDataPortValidator() <em>Input Data Port Validator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataPortValidator()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> inputDataPortValidator;

	/**
	 * The cached value of the '{@link #getOutputDataPortValidator() <em>Output Data Port Validator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataPortValidator()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> outputDataPortValidator;

	/**
	 * The cached value of the '{@link #getAnalysisTypes() <em>Analysis Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> analysisTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getInDataPorts() {
		if (inDataPorts == null) {
			inDataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.TASK__IN_DATA_PORTS);
		}
		return inDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getOutDataPorts() {
		if (outDataPorts == null) {
			outDataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.TASK__OUT_DATA_PORTS);
		}
		return outDataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJexlString() {
		return jexlString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJexlString(String newJexlString) {
		String oldJexlString = jexlString;
		jexlString = newJexlString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__JEXL_STRING, oldJexlString, jexlString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUtil() {
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtil(boolean newUtil) {
		boolean oldUtil = util;
		util = newUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__UTIL, oldUtil, util));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexlEngine getJexlEngine() {
		return jexlEngine;
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
	public void setLogger(Logger newLogger) {
		Logger oldLogger = logger;
		logger = newLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__LOGGER, oldLogger, logger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, TraversalEvent> getTraversalEvents() {
		if (traversalEvents == null) {
			traversalEvents = new EcoreEMap<String,TraversalEvent>(MapsPackage.Literals.STRING_TO_TRAVERSAL_EVENT_MAP, StringToTraversalEventMapImpl.class, this, CorePackage.TASK__TRAVERSAL_EVENTS);
		}
		return traversalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Task> getParents() {
		if (parents == null) {
			parents = new EcoreEMap<String,Task>(MapsPackage.Literals.STRING_TO_TASK_MAP, StringToTaskMapImpl.class, this, CorePackage.TASK__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<TraversalChunk>> getChunks() {
		if (chunks == null) {
			chunks = new EcoreEMap<String,EList<TraversalChunk>>(MapsPackage.Literals.STRING_TO_CHUNKS_MAP, StringToChunksMapImpl.class, this, CorePackage.TASK__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<String>> getToolNames() {
		if (toolNames == null) {
			toolNames = new EcoreEMap<String,EList<String>>(MapsPackage.Literals.STRING_TO_STRING_LIST_MAP, StringToStringListMapImpl.class, this, CorePackage.TASK__TOOL_NAMES);
		}
		return toolNames;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(MapsPackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, CorePackage.TASK__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ToolMatch> getToolMatches() {
		if (toolMatches == null) {
			toolMatches = new EcoreEMap<String,ToolMatch>(MapsPackage.Literals.STRING_TO_TOOL_MATCH_MAP, StringToToolMatchMapImpl.class, this, CorePackage.TASK__TOOL_MATCHES);
		}
		return toolMatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousTaskStr() {
		return previousTaskStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTaskStr(String newPreviousTaskStr) {
		String oldPreviousTaskStr = previousTaskStr;
		previousTaskStr = newPreviousTaskStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__PREVIOUS_TASK_STR, oldPreviousTaskStr, previousTaskStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(boolean newRoot) {
		boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(int newFlags) {
		int oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, CorePackage.TASK__GROUPING_CRITERIA);
		}
		return groupingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getInputs() {
		if (inputs == null) {
			inputs = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, CorePackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getOutputs() {
		if (outputs == null) {
			outputs = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, CorePackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getInputDataPortValidator() {
		if (inputDataPortValidator == null) {
			inputDataPortValidator = new EDataTypeUniqueEList<Pattern>(Pattern.class, this, CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR);
		}
		return inputDataPortValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getOutputDataPortValidator() {
		if (outputDataPortValidator == null) {
			outputDataPortValidator = new EDataTypeUniqueEList<Pattern>(Pattern.class, this, CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR);
		}
		return outputDataPortValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnalysisTypes() {
		if (analysisTypes == null) {
			analysisTypes = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.TASK__ANALYSIS_TYPES);
		}
		return analysisTypes;
	}

	/*private EList<String> enumerateInstances(String regexp)
	{
		regexp = "ab(c|d){2,3}";
		RegExp r = new RegExp(regexp);
		Automaton a = r.toAutomaton();
		String s = "abcccdc";
		System.out.println("Match: " + a.run(s)); // prints: true
		
		logger.debug(regexp+": "+a.getFiniteStrings());
		
		return null;
	}*/
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readTask(String wtplLine, String defaultMode, EList<String> defaultGroupingCriteria) {
		
		short taskField          = 0;
		short taskType           = 1;
		short toolField          = 2;
		short inDataPortField    = 3;
		short outDataPortField   = 4;
		short groupingCritField  = 5;
		short traversalCritField = 6;
		short jexlField          = 7;
		//String[] defaultGroupingCriteria={};
		//defaultGroupingCriteria=new String[] {"Sample"};
		/**
		 * Read string into an array of strings.
		 * Process array and set  task attributes
		 * appropriately.
		 */
		String[] wtplArray=wtplLine.split("\t");
		
		String[] tmp;
		//logger.debug(wtplArray[0]);
		setName(wtplArray[taskField]);
		for (String parent:wtplArray[taskType].split(","))
		{
			tmp=parent.split(":");
			if (tmp[0].equals("STATIC"))
			{
				setUtil(true);
				if (tmp.length>1)
					getAnalysisTypes().add(tmp[1]);
			}
			// the actual parents are resolved by class EasyflowTemplate 
			//else
				//getParents().put(tmp[0], null);	
		}
		/**
		 * Parse the tools field. Check for multiple implementing tools
		 */
        tmp=wtplArray[toolField].split(",");
        for (int i=0; i<tmp.length; i++) {
        	getToolNames().put(tmp[i], new BasicEList<String>());
        }

        
        /**
         * Read DataFormatIn/Out. and set DataPorts
         */
        short bitPos=0;
        for (String dataPortField:wtplArray[inDataPortField].split(";"))
        {
        	DataPort dataPort=parseDataPortField(dataPortField, inputDataPortValidator);
        	getInDataPorts().add(dataPort);
        	dataPort.setBitPos(bitPos++);
        }
        
        bitPos=0;
        for (String dataPortField:wtplArray[outDataPortField].split(";"))
        {
        	DataPort dataPort=parseDataPortField(dataPortField, outputDataPortValidator);
        	getOutDataPorts().add(dataPort);
        	dataPort.setBitPos(bitPos++);
        }
        
        //EList<DataPort> x=getInDataPorts();
        /**
         * Read Data(Grouping)Criteria. 
         */
        //skip if line ended or record empty
        String groupingStr="";
        if ((wtplArray.length>5)) {
        	groupingStr=wtplArray[groupingCritField];
        }
        	//if (!wtplArray[groupingCritField].equals(""))
        	//{
        	
        	short dataPortNo=0;
        	for (String groupingString:groupingStr.split(";"))
        	{
	        	DataPort dataPort=null;
	        	if (groupingString.equals(""))
	        	{
	        		tmp=(String[])defaultGroupingCriteria.toArray();
	        		dataPort=getInDataPorts().get(dataPortNo++);
	        	}
	        	else
	        	{	tmp=groupingString.split(";");
	        		if (tmp.length>1)
	        		{
	        			dataPort=getDataPortByName(tmp[0], false);
	        			groupingString=tmp[1];
	        		}
	        		else
	        			dataPort=getInDataPorts().get(dataPortNo++);
	        		tmp=groupingString.split(",");
	        	}
	        	logger.trace("readTask(): "+getName()+" "+groupingString+" dataPort="+dataPort+" ("+getInDataPorts().size()+","+getOutDataPorts().size()+")");
	        	
	        	if (tmp.length>0) {
			        for (int i=0;i<tmp.length;i++) {
			        	
			        	TraversalCriterion traversalCriterion=TraversalFactory.eINSTANCE.createTraversalCriterion();
			        	traversalCriterion.setDataPort(dataPort);
			        	//dataPort.getGroupingCriteria().add(traversalCriterion);
			        	//GroupingCriterion traversalCriterion=TraversalFactory.eINSTANCE.createGroupingCriterion();
			        	String[] group=tmp[i].split(":");
			        	if (group.length>1)	traversalCriterion.setMode(group[1]);
			        	else traversalCriterion.setMode(defaultMode); 
			        	//GroupingCriterion groupingCriterion=CoreFactory.eINSTANCE.createGroupingCriterion();
			        	TraversalEvent traversalEvent=TraversalFactory.eINSTANCE.createTraversalEvent();
			        	//TraversalChunk traversalChunk=CoreFactory.eINSTANCE.createTraversalChunk();
			        	traversalCriterion.setId(group[0]);
			        	logger.trace("readTask(): "+" set traversal criterion="+traversalCriterion);
			        	//traversalEvent.setSplitTask(this);
			        	TraversalOperation traversalOperation=TraversalFactory.eINSTANCE.createTraversalOperation();
			        	//traversalOperation.setName();
			        	traversalOperation.setType("grouping");
			        	traversalCriterion.setOperation(traversalOperation);
			        	//traversalCriterion.setChunkSource();
			        	traversalEvent.setTraversalCriterion(traversalCriterion);
			        	traversalEvent.setSplitTask(this);
			        	logger.trace("readTask(): "+"adding travcrit: "+traversalCriterion.getId()+" "+traversalCriterion);
			        	getTraversalEvents().put(traversalCriterion.getId(), traversalEvent);
			        	
			        	
			        	getGroupingCriteria().put(traversalCriterion.getId(), traversalCriterion.getMode());
			        }
	        	}
        	}
        	//}
        //}

		/**
		 * Read the traversal Expression
		 * 
		 * for example: splitting and merging criteria
		 */
        
		if ((wtplArray.length>6)) {
			if (!wtplArray[6].equals("")) {
				tmp=wtplArray[6].split(";");
				//logger.debug(tmp.length);
				for (int i=0;i<tmp.length;i++) {
					String[] tmp1=tmp[i].split(":");
					//logger.debug(tmp1.length);
					if (!tmp1[0].equals("")) {
						
						TraversalCriterion traversalCriterion=TraversalFactory.eINSTANCE.createTraversalCriterion();
						traversalCriterion.setId(tmp1[0]);
						traversalCriterion.setMode("batch");
						TraversalOperation traversalOperation=TraversalFactory.eINSTANCE.createTraversalOperation();
						traversalOperation.setName(tmp1[1]);
						traversalOperation.setType("traversal");
						//if (traversalOperation.getName().equals("merge")) {	
						//} else {
						TraversalEvent traversalEvent=TraversalFactory.eINSTANCE.createTraversalEvent();
						if (tmp1.length>2) {
							String[] tmp2=tmp1[2].split(",");
							if (tmp2.length==1) traversalCriterion.setChunkSource(tmp1[2]);
							else {
								for (String tmp3:tmp2) {
									TraversalChunk traversalChunk=TraversalFactory.eINSTANCE.createTraversalChunk();
									traversalChunk.setName(tmp3);
									traversalCriterion.getChunks().put(tmp3, traversalChunk);
								}
							}


						}
						//else traversalChunks.setName(value)
						traversalCriterion.setOperation(traversalOperation);
						traversalEvent.setTraversalCriterion(traversalCriterion);
						if (traversalOperation.getName().equals("split"))
							traversalEvent.setSplitTask(this);
						else if (traversalOperation.getName().equals("merge"))
							traversalEvent.getMergeTask().add(this);
						logger.trace("readTask(): "+"adding travcrit: "+traversalCriterion.getId()+" "+traversalEvent);
						getTraversalEvents().put(traversalCriterion.getId(), traversalEvent);
						//}
					}	
				}
			}
		}
		/**
		 * Read JEXL
		 */
        if (wtplArray.length>7) {
        	setJexlString(wtplArray[7]);
        	//logger.debug(shallProcessJEXL);
        	
		}
        setPreviousTaskStr(getUniqueString());
        logger.debug("readTask(): "+getUniqueString()+" traversalEvents="+getTraversalEvents().keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean shallProcess(EList<GroupingInstance> groupingInstances, String forGrouping) {
		
		Object evalObject=evaluateJexl(createMetaDataMapForJexl(groupingInstances, forGrouping));
		if (evalObject instanceof Boolean)
			return (Boolean) evalObject;
			//return true;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Object evaluateJexl(EMap<String, Object> metaDataMap) {
		//evaluate the tasks jexl expression against metaDataMap
		logger.debug("shallProcessJEXL: "+getJexlString()+" map:"+metaDataMap.keySet());
		if (getJexlString()==null || getJexlString().equals("")) return true;
		if (metaDataMap.isEmpty()) return true;
		Expression e = jexlEngine.createExpression(getJexlString());
		JexlContext context = new MapContext(metaDataMap.map());
		logger.debug(e+" "+metaDataMap.values()+" "+e.evaluate(context));
    	return e.evaluate(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * we need to create a map of the kind:
	 * Platform -> "Illumina"
	 * InputFiles -> ["a","b","c"]
	 * Group -> "g1"
	 * ReadGroup -> ["rg1"," rg2"]
	 * Records -> ["rec1", "rec2, "rec3"]
	 * 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, Object> createMetaDataMapForJexl(EList<GroupingInstance> groupingInstances, String forGrouping) {
		
		EMap<String, Object> metaDataMap=new BasicEMap<String, Object>();
		//logger.debug(forGrouping);
		//for (GroupingInstance groupingInstance:groupingInstances)
			//logger.debug(groupingInstance.getName());
		
		DefaultMetaData metaData=GlobalVar.getGraphUtil().getMetaData();
		for (GroupingInstance groupingInstance:groupingInstances)
		{
			EList<GroupingInstance> recordInstances=metaData.getInstances(groupingInstance, "Record");
			for (GroupingInstance recordInstance:recordInstances)
				for (Entry<String, Object> entry:metaData.getRecord(recordInstance).entrySet())
				{
					Object value=entry.getValue();
					if (metaDataMap.containsKey(entry.getKey()))
					{
						mergeValue(metaDataMap.get(entry.getKey()), value);
					}
					metaDataMap.put(entry.getKey(), value);
				}
		}
		//for (Entry<String, Grouping> entry:metaData.getGroupings().entrySet())
		//{			metaData.g		}
		return metaDataMap;
	}

	private Object mergeValue(Object o1, Object o2)
	{
		Object ret=null;
		if (o1 instanceof List)
		{
			if (o2 instanceof List)
				((List)o1).addAll((List)o2);
			else
				((List)o1).add(o2);
			ret=o1;
		}
		else
		{
			if (o2 instanceof List)
			{
				((List)o2).add(o2);
				ret=o2;
			}
			else
			{
				Object[] o={o1, o2};
				ret = o;
			}
		}
		return ret;
	}
	
	private DataPort parseDataPortField(String field, EList<Pattern> pattern)
	{
		DataPort dataPort = CoreFactory.eINSTANCE.createDataPort();
		String[] tmp=field.split(":");
		String dataPortString = tmp[0];
		String dataFormatString;
		if (tmp.length>1)
		{
			dataPort.setName(dataPortString);
			dataFormatString = tmp[1];
			if (tmp.length>2)
				logger.warn("unexpected format detected: multiple occurance of ':'.");
		}
		else
			dataFormatString = dataPortString;
		
		Iterator<DataFormat> it=parseDataFormatField(dataFormatString, pattern).iterator();
        
        while (it.hasNext()) {
        	
        	DataFormat dataFormat = it.next();
        	//enumerateInstances(dataFormat.getName());
        	dataPort.getDataFormats().put(dataFormat.getName(), dataFormat);
        	if (dataPort.getName()==null || dataPort.getName().equals(""))
        		dataPort.setName(dataFormat.getName());
        }
		
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<DataFormat> parseDataFormatField(String dataFormatString, EList<Pattern> pattern) {
		String[] overall=dataFormatString.split(";");
		if (overall.length>1)
		{
			//String[] tmp=overall[1].split(regex)
			int i=1;
			while (i<overall.length)
				pattern.add(Pattern.compile(overall[i++]));
		}
		String[] tmp=overall[0].split(",");
		EList<DataFormat> list=new BasicEList<DataFormat>();
		for (int i=0;i<tmp.length;i++) {
			//System.out.println(tmp[i]);
			DataFormat dataFormat=ToolFactory.eINSTANCE.createDataFormat();
			dataFormat.setName(tmp[i]);
			list.add(dataFormat);
		}
		return list;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private void shallProcess(Map<String, Object> metaDataMap) {
			/* =====EXAMPLES====
			 * 
			 */
			/*
			String jexlStr = "((G1 + G2 + G3) * 0.1) + G4=='9.541'";
		    Expression e1 = jexl.createExpression( jexlStr );

		    // populate the context
		    JexlContext context = new MapContext();
		    context.set("G1", 10);
		    context.set("G2", 5.4);
		    context.set("G3", 0.01);
		    context.set("G4", 8);
		    // ...
		 // work it out
		    System.out.println(""+e1.evaluate(context));
		    e1 = jexl.createExpression("Platform =~ [\"Illumina\",'b',\"c\",\"d\",\"e\",\"f\"]");
		    context = new MapContext();
		    context.set("Platform", "Illumina");
		    System.out.println(""+e1.evaluate(context));
		    
		    jexlStr = "Platform =~ [ 3,4]";
		    //e1 = jexl.createExpression(StringParser.buildString(jexlStr, true));
		    e1 = jexl.createExpression(jexlStr);
		    context = new MapContext();
		    context.set("Platform", 3);
		    System.out.println(""+e1.evaluate(context));
		    
		    */
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueString() {
		String uniq=getName();
		//Iterator<?,?> it = (Iterator<Map.Entry<String,?>>)(Iterator<?>)delegateEList.iterator()
		Iterator<Entry<String, EList<TraversalChunk>>> it = getChunks().iterator();
		//for (String key:getChunks().keySet())
		while (it.hasNext())
		{
			String key=it.next().getKey();
			//logger.debug();
			

			uniq+="_"+key+":";
			String[] tmp=new String[getChunks().get(key).size()];
			//logger.debug("getUniqueString(): "+key+" "+tmp.length+" "+getChunks().get(key));
			for (int i=0; i<tmp.length; i++) {
				tmp[i]=getChunks().get(key).get(i).getName();
				//logger.debug(tmp[i]);
			}
			uniq+=StringUtils.join(tmp, "-");
		}
		/*
        Iterator<DataPort> it1=getInDataPorts().iterator();
        
        while (it1.hasNext()) {
        	Iterator<GroupingCriterion> it2=it1.next().getGroupingCriteria().iterator();
        	while (it2.hasNext()) {
        		GroupingCriterion groupingCriterion=it2.next();
        		uniq+="_"+groupingCriterion.getName();
        		//groupingCriterion.g
        	}
        }*/
		return uniq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatibleWithOutDataPortFor(DataPort dataPort) {
		Iterator<DataPort> it1=getInDataPorts().iterator();
		while (it1.hasNext()) {
			DataPort parentDataPort=it1.next();
			if (parentDataPort.isCompatible(dataPort)) return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatibleWithInDataPortFor(DataPort dataPort) {
		Iterator<DataPort> it1=getOutDataPorts().iterator();
		while (it1.hasNext()) {
			DataPort parentDataPort=it1.next();
			if (parentDataPort.isCompatible(dataPort)) return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Task getParentTaskByOutDataPort(DataPort dataPort) {
		Iterator<Task> it=getParents().values().iterator();
		EList<Task> tasks=new BasicEList<Task>();
		while (it.hasNext()) {
			Task parentTask=it.next();
			logger.trace("getParentTaskByOutDataPort(): is task="
					+parentTask.getUniqueString()+" compatible with dataPort=" 
					+dataPort.getName()+" :"+(parentTask.isCompatibleWithInDataPortFor(dataPort)?"yes":"no"));
			if (parentTask.isCompatibleWithInDataPortFor(dataPort))
				tasks.add(parentTask);
		}
		if (tasks.size()>1) 
			logger.debug("getParentTaskByOutDataPort(): "+"More than one compatible parents found with DataPort="+
				dataPort.getName()+". Return only first.");
		else if (tasks.isEmpty()) 
			logger.debug("getParentTaskByOutDataPort(): "+"No compatible parent with DataPort="+
				dataPort.getName()+" found. Returning null.");
		return (tasks.size()>0) ? tasks.get(0):null;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, EList<TraversalChunk>> getNonOveralppingTraversalChunksFor(Task task) {
		EMap<String, EList<TraversalChunk>> nonOverlappingChunks = new BasicEMap<String, EList<TraversalChunk>>();
		for (String key : task.getChunks().keySet())
		{
			logger.trace("getNonOveralppingTraversalChunksFor(): "+key+" add:"+!getChunks().containsKey(key));
			if (!getChunks().containsKey(key))
			{
				int i=0;
				String tmp[] = new String[task.getChunks().get(key).size()];
				for (TraversalChunk traversalChunk : task.getChunks().get(key))
					tmp[i++]=traversalChunk.getName();
				nonOverlappingChunks.put(StringUtils.join(tmp, "-"), task.getChunks().get(key));
				logger.trace("getNonOveralppingTraversalChunksFor(): "+StringUtils.join(tmp, "-"));
			}
		}		
		return nonOverlappingChunks;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void readTools(EList<Tool> tools) {
		for (Tool tool : tools)
		{
			if (getToolNames().containsKey(tool.getName()))
			{
				logger.debug("found tool with name:"+tool.getName());
				if (getTools().containsKey(tool.getId()))
					logger.warn("override tool:"+tool.getId());
				getTools().put(tool.getId(), tool);
			}
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Tool getPreferredTool() {
		if (getTools().isEmpty())
			return null;
		else
		{
			Iterator<Entry<String, Tool>> it=getTools().iterator();
			while(it.hasNext())
			{
				Entry<String,Tool> entry=it.next();
				if (getToolMatches().containsKey(entry.getKey()))
					if (getToolMatches().get(entry.getKey()).isValid())
						return entry.getValue();
			}
		}
			
		return getTools().get(0).getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<DataPort> getOverlappingDataPorts(EList<DataPort> dataPorts1,
			EList<DataPort> dataPorts2) {
		EList<DataPort> dataPorts=new BasicEList<DataPort>();
		for (DataPort dataPort1:dataPorts1)
			for (DataPort dataPort2:dataPorts2)
				if (dataPort2.isCompatible(dataPort1))
					dataPorts.add(dataPort1);
		return dataPorts;
					
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean resolveToolDependencies() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<String, String> createCommandLineMap() {
		EMap<String, String> map = new BasicEMap<String, String>();
		if (getPreferredTool().getExecutables().containsKey("interpreter"))
			map.put("interpreter", getPreferredTool().getExecutables().get("interpreter").getPath());
		if (getPreferredTool().getExecutables().containsKey("executable"))
			map.put("executable", getPreferredTool().getExecutables().get("executable").getPath());
		//set submodule
		//set positional args
		//if (getPreferredTool().getCommand().get)
		if (getPreferredTool().getCommand().getParameters() != null)
			map.put("optional_args", getPreferredTool().getCommand().generateCommandString(null));
		if (getInputs() != null)
			map.put("input", list2String(getInputs()));
		if (getOutputs() != null)
			map.put("output", list2String(getOutputs()));
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateTool(Tool tool) {
		boolean rc = false;
		ToolMatch toolMatch = CoreFactory.eINSTANCE.createToolMatch();
		toolMatch.setTask(this);
		toolMatch.setTool(tool);
		
		getToolMatches().put(tool.getName(), toolMatch);
		long score=toolMatch.computeScore();
		long expectedScore=toolMatch.computeExpectedScore();
		logger.trace(Long.toBinaryString(score)+" ");
		logger.trace(Long.toBinaryString(expectedScore)+" (exp)");
		//logger.debug(Long.toHexString(score)+" vs "+Long.toHexString(expectedScore));
		if (score==expectedScore)
		{
			rc=true;
			toolMatch.setValid(true);
		}
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateTools() {
		boolean rc = false;
		for (Entry<String, Tool> toolEntry:getTools())
		{
			logger.trace("validate tool="+toolEntry.getKey());
			if (validateTool(toolEntry.getValue()))
			{
				rc = true;
			}
		}
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataPort getDataPortByDataPort(DataPort testDataPort, boolean isOutDataPort) {
		EList<DataPort> dataPorts=isOutDataPort?getOutDataPorts():getInDataPorts();
		for (DataPort dataPort:dataPorts)
			if (dataPort.isCompatible(testDataPort))
				return dataPort;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataPort getDataPortByNameOfFormat(String formatName, boolean isOutDataPort) {
		EList<DataPort> dataPorts=isOutDataPort?getOutDataPorts():getInDataPorts();
		for (DataPort dataPort:dataPorts)
		{
			for (DataFormat dataFormat:dataPort.getDataFormats().values())
				if (dataFormat.getName().equals(formatName))
					return dataPort;
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataPort getDataPortByName(String dataPortName, boolean isOutDataPort) {
		EList<DataPort> dataPorts=isOutDataPort?getOutDataPorts():getInDataPorts();
		for (DataPort dataPort:dataPorts)
		{
			if (dataPort.getName().equals(dataPortName))
				return dataPort;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<Task, EList<DataPort>> resolveMissingDataPortsByTool(EList<Task> tasks) {
		for (ToolMatch toolMatch:getToolMatches().values())
		{
			if (!toolMatch.isValid())
				return toolMatch.resolveReverseMissingInDataPorts(tasks);
		}
		return null;	
	}


	private String list2String(EMap<String, URI> map)
	{
		Iterator<Entry<String, URI>> it = map.iterator();
		String array[] = new String[getOutputs().size()];
		int i=0;
		while (it.hasNext())
			array[i++]=it.next().getValue().getPath();
		return StringUtils.join(array, " ");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
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
			case CorePackage.TASK__JEXL_ENGINE:
				return getJexlEngine();
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
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				return getInputDataPortValidator();
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				return getOutputDataPortValidator();
			case CorePackage.TASK__ANALYSIS_TYPES:
				return getAnalysisTypes();
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
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				getInputDataPortValidator().clear();
				return;
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				getOutputDataPortValidator().clear();
				return;
			case CorePackage.TASK__ANALYSIS_TYPES:
				getAnalysisTypes().clear();
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
			case CorePackage.TASK__JEXL_ENGINE:
				return JEXL_ENGINE_EDEFAULT == null ? jexlEngine != null : !JEXL_ENGINE_EDEFAULT.equals(jexlEngine);
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
			case CorePackage.TASK__INPUT_DATA_PORT_VALIDATOR:
				return inputDataPortValidator != null && !inputDataPortValidator.isEmpty();
			case CorePackage.TASK__OUTPUT_DATA_PORT_VALIDATOR:
				return outputDataPortValidator != null && !outputDataPortValidator.isEmpty();
			case CorePackage.TASK__ANALYSIS_TYPES:
				return analysisTypes != null && !analysisTypes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", jexlString: ");
		result.append(jexlString);
		result.append(", util: ");
		result.append(util);
		result.append(", jexlEngine: ");
		result.append(jexlEngine);
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
		result.append(')');
		return result.toString();
	}

} //TaskImpl
