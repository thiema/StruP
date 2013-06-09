/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DataFormat;
import easyflow.core.DataPort;
import easyflow.core.StringToToolMap;
import easyflow.core.SplittingEvent;
import easyflow.core.GroupingCriterion;
import easyflow.core.Task;
import easyflow.core.Tool_old;
import easyflow.core.TraversalChunks;
import easyflow.core.TraversalCriterion;
import easyflow.core.TraversalOperation;

import easyflow.core.Tool;
import easyflow.core.TraversalChunk;
import easyflow.sequencing.grouping.Group;
import easyflow.sequencing.grouping.GroupingPackage;
import easyflow.sequencing.grouping.impl.StringToGroupMapImpl;
import easyflow.core.TraversalEvent;
import easyflow.ui.UiFactory;
import easyflow.ui.impl.DefaultProjectImpl;

import java.lang.Object;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import java.util.Map.Entry;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link easyflow.core.impl.TaskImpl#getShallProcessJEXL <em>Shall Process JEXL</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#isUtil <em>Util</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getJexlEngine <em>Jexl Engine</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getFullNameDEPRECATED <em>Full Name DEPRECATED</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getPreviousTaskStr <em>Previous Task Str</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.TaskImpl#getFlags <em>Flags</em>}</li>
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
	 * The default value of the '{@link #getShallProcessJEXL() <em>Shall Process JEXL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShallProcessJEXL()
	 * @generated
	 * @ordered
	 */
	protected static final String SHALL_PROCESS_JEXL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShallProcessJEXL() <em>Shall Process JEXL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShallProcessJEXL()
	 * @generated
	 * @ordered
	 */
	protected String shallProcessJEXL = SHALL_PROCESS_JEXL_EDEFAULT;

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
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> parents;

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
	 * The default value of the '{@link #getFullNameDEPRECATED() <em>Full Name DEPRECATED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullNameDEPRECATED()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullNameDEPRECATED() <em>Full Name DEPRECATED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullNameDEPRECATED()
	 * @generated
	 * @ordered
	 */
	protected String fullNameDEPRECATED = FULL_NAME_DEPRECATED_EDEFAULT;

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
	 * The cached value of the '{@link #getGroupingCriteria() <em>Grouping Criteria</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<String> groupingCriteria;

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
	public String getShallProcessJEXL() {
		return shallProcessJEXL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setShallProcessJEXL(String newShallProcessJEXL) {
		String oldShallProcessJEXL = shallProcessJEXL;
		shallProcessJEXL = newShallProcessJEXL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__SHALL_PROCESS_JEXL, oldShallProcessJEXL, shallProcessJEXL));
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
			traversalEvents = new EcoreEMap<String,TraversalEvent>(CorePackage.Literals.STRING_TO_TRAVERSAL_EVENT_MAP, StringToTraversalEventMapImpl.class, this, CorePackage.TASK__TRAVERSAL_EVENTS);
		}
		return traversalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Task>(Task.class, this, CorePackage.TASK__PARENTS);
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
			chunks = new EcoreEMap<String,EList<TraversalChunk>>(CorePackage.Literals.STRING_TO_CHUNKS_MAP, StringToChunksMapImpl.class, this, CorePackage.TASK__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullNameDEPRECATED() {
		return fullNameDEPRECATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullNameDEPRECATED(String newFullNameDEPRECATED) {
		String oldFullNameDEPRECATED = fullNameDEPRECATED;
		fullNameDEPRECATED = newFullNameDEPRECATED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TASK__FULL_NAME_DEPRECATED, oldFullNameDEPRECATED, fullNameDEPRECATED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Tool> getTools() {
		if (tools == null) {
			tools = new EcoreEMap<String,Tool>(CorePackage.Literals.STRING_TO_TOOL_MAP, StringToToolMapImpl.class, this, CorePackage.TASK__TOOLS);
		}
		return tools;
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
	public EList<String> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.TASK__GROUPING_CRITERIA);
		}
		return groupingCriteria;
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
	 * @generated not
	 */
	public void readTask(String wtplLine, String defaultMode, EList<String> defaultGroupingCriteria) {
		
		//String[] defaultGroupingCriteria={};
		//defaultGroupingCriteria=new String[] {"Sample"};
		/**
		 * Read string into an array of strings.
		 * Process array and set  task attributes
		 * appropriately.
		 */
		
		String[] wtplArray=wtplLine.split("\t");
		//logger.debug(wtplArray[0]);
		setName(wtplArray[0]);
		util= wtplArray[1].equals("STATIC") ? true :false;
		
		/**
		 * Parse the tools field. Check for multiple implementing tools
		 */
        String[] tmp=wtplArray[2].split(",");
        for (int i=0; i<tmp.length; i++) {
        	getTools().put(tmp[i], CoreFactory.eINSTANCE.createTool());
        }

        

        /**
         * Read DataFormatIn/Out. and set DataPorts
         */
        Iterator<DataFormat> it=parseDataFormatField(wtplArray[3]).iterator();
        while (it.hasNext()) {
        	DataPort dataPort=new CoreFactoryImpl().eINSTANCE.createDataPort();
        	dataPort.setDataFormat(it.next());
            getInDataPorts().add(dataPort);
        }
        it=parseDataFormatField(wtplArray[4]).iterator();
        while (it.hasNext()) {
        	DataPort dataPort=new CoreFactoryImpl().eINSTANCE.createDataPort();
        	dataPort.setDataFormat(it.next());
            getOutDataPorts().add(dataPort);
        }        
        
        
        /**
         * Read Data(Grouping)Criteria. 
         */
        //skip if line ended or record empty
        if ((wtplArray.length>5)) {
        	
        	tmp= (wtplArray[5].equals("") ? (String[])defaultGroupingCriteria.toArray():wtplArray[5].split(","));
        	logger.trace("readTask(): "+tmp[0]+" "+wtplArray[5]);
        	if (tmp.length>0) {
		        
		        for (int i=0;i<tmp.length;i++) {
		        	
		        	TraversalCriterion traversalCriterion=CoreFactory.eINSTANCE.createTraversalCriterion();
		        	String[] group=tmp[i].split(":");
		        	if (group.length>1)	traversalCriterion.setMode(group[1]);
		        	else traversalCriterion.setMode(defaultMode); 
		        	//GroupingCriterion groupingCriterion=CoreFactory.eINSTANCE.createGroupingCriterion();
		        	TraversalEvent traversalEvent=CoreFactory.eINSTANCE.createTraversalEvent();
		        	//TraversalChunk traversalChunk=CoreFactory.eINSTANCE.createTraversalChunk();
		        	traversalCriterion.setId(group[0]);
		        	logger.trace("readTask(): "+" set traversal criterion="+traversalCriterion);
		        	//traversalEvent.setSplitTask(this);
		        	TraversalOperation traversalOperation=CoreFactory.eINSTANCE.createTraversalOperation();
		        	//traversalOperation.setName();
		        	traversalOperation.setType("grouping");
		        	traversalCriterion.setOperation(traversalOperation);
		        	//traversalCriterion.setChunkSource();
		        	traversalEvent.setTraversalCriterion(traversalCriterion);
		        	traversalEvent.setSplitTask(this);
		        	logger.trace("readTask(): "+"adding travcrit: "+traversalCriterion.getId()+" "+traversalCriterion);
		        	getTraversalEvents().put(traversalCriterion.getId(), traversalEvent);
		        	getInDataPorts().get(0).getGroupingCriteria().add(traversalCriterion);
		        	getGroupingCriteria().add(traversalCriterion.getId());
		        }
        	}
        }

		/**
		 * Read the traversal Expression
		 * 
		 * for example: splitting and merging criteria
		 */
        
		if ((wtplArray.length>6)) {
			if (!wtplArray[6].equals("")) {
				tmp=wtplArray[6].split(",");
				//logger.debug(tmp.length);
				for (int i=0;i<tmp.length;i++) {
					String[] tmp1=tmp[i].split(":");
					//logger.debug(tmp1.length);
					if (!tmp1[0].equals("")) {
						
						TraversalCriterion traversalCriterion=CoreFactory.eINSTANCE.createTraversalCriterion();
						traversalCriterion.setId(tmp1[0]);
						traversalCriterion.setMode("batch");
						TraversalOperation traversalOperation=CoreFactory.eINSTANCE.createTraversalOperation();
						traversalOperation.setName(tmp1[1]);
						traversalOperation.setType("traversal");
						//if (traversalOperation.getName().equals("merge")) {	
						//} else {
						TraversalEvent traversalEvent=CoreFactory.eINSTANCE.createTraversalEvent();
						if (tmp1.length>2) {
							String[] tmp2=tmp1[2].split(";");
							if (tmp2.length==1) traversalCriterion.setChunkSource(tmp1[2]);
							else {
								for (String tmp3:tmp2) {
									TraversalChunk traversalChunk=CoreFactory.eINSTANCE.createTraversalChunk();
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
        	shallProcessJEXL=wtplArray[7];
        	//logger.debug(shallProcessJEXL);
        	
		}
        setPreviousTaskStr(getUniqueString());
        logger.trace("readTask(): traversalEvents="+getTraversalEvents().keySet());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean shallProcess(Map<String, Object> metaDataMap) {
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

		
			//evaluate the tasks jexl expression against metaDataMap
			logger.debug("shallProcessJEXL: "+shallProcessJEXL+" map:"+metaDataMap.keySet());
			if (shallProcessJEXL==null) return true;
			if (metaDataMap.isEmpty()) return true;
			Expression e = jexlEngine.createExpression(shallProcessJEXL);
			JexlContext context = new MapContext(metaDataMap);
			logger.debug(e+" "+metaDataMap.values()+" "+e.evaluate(context));
	    	return (Boolean) e.evaluate(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Object evaluateJexl(TraversalEvent traversalEvent, Map<String, Object> metaDataMap) {
		//evaluate the traversalEvent against metaDataMap
		String jexl=traversalEvent.getTraversalCriterion().getChunkSource();
		//logger.debug(jexl+" "+metaDataMap);
		if (jexl==null) return true;
		if (jexl.equals("")) return true;
		if (jexl.equals("GENERIC")) return true;
		if (metaDataMap.isEmpty()) return true;
		Expression e = jexlEngine.createExpression(jexl);
		JexlContext context = new MapContext(metaDataMap);
		//logger.debug(e+" "+e.evaluate(context));
		return e.evaluate(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<DataFormat> parseDataFormatField(String dataFormatString) {
		String[] tmp=dataFormatString.split(",");
		EList<DataFormat> list=new BasicEList<DataFormat>();
		for (int i=0;i<tmp.length;i++) {
			//System.out.println(tmp[i]);
			DataFormat dataFormat=CoreFactory.eINSTANCE.createDataFormat();
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
			if (parentDataPort.getDataFormat().getName().
					equals(dataPort.getDataFormat().getName())) return true;
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
			if (parentDataPort.getDataFormat().getName().
					equals(dataPort.getDataFormat().getName())) return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Task getParentTaskByOutDataPort(DataPort dataPort) {
		Iterator<Task> it=getParents().iterator();
		EList<Task> tasks=new BasicEList<Task>();
		while (it.hasNext()) {
			Task parentTask=it.next();
			logger.trace("getParentTaskByOutDataPort(): is task="
					+parentTask.getUniqueString()+" compatible with dataPort=" 
					+dataPort.getDataFormat().getName()+" :"+(parentTask.isCompatibleWithInDataPortFor(dataPort)?"yes":"no"));
			if (parentTask.isCompatibleWithInDataPortFor(dataPort))
				tasks.add(parentTask);
		}
		if (tasks.size()>1) logger.debug("getParentTaskByOutDataPort(): "+"More than one compatible parents found with DataPort="+
				dataPort.getDataFormat().getName()+". Return only first.");
		else if (tasks.isEmpty()) logger.debug("getParentTaskByOutDataPort(): "+"No compatible parent with DataPort="+
				dataPort.getDataFormat().getName()+" found. Returning null.");
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TASK__TRAVERSAL_EVENTS:
				return ((InternalEList<?>)getTraversalEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
			case CorePackage.TASK__TOOLS:
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
			case CorePackage.TASK__IN_DATA_PORTS:
				return getInDataPorts();
			case CorePackage.TASK__OUT_DATA_PORTS:
				return getOutDataPorts();
			case CorePackage.TASK__NAME:
				return getName();
			case CorePackage.TASK__SHALL_PROCESS_JEXL:
				return getShallProcessJEXL();
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
				return getParents();
			case CorePackage.TASK__CHUNKS:
				if (coreType) return getChunks();
				else return getChunks().map();
			case CorePackage.TASK__FULL_NAME_DEPRECATED:
				return getFullNameDEPRECATED();
			case CorePackage.TASK__TOOLS:
				if (coreType) return getTools();
				else return getTools().map();
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				return getPreviousTaskStr();
			case CorePackage.TASK__ROOT:
				return isRoot();
			case CorePackage.TASK__GROUPING_CRITERIA:
				return getGroupingCriteria();
			case CorePackage.TASK__FLAGS:
				return getFlags();
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
			case CorePackage.TASK__SHALL_PROCESS_JEXL:
				setShallProcessJEXL((String)newValue);
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
				getParents().clear();
				getParents().addAll((Collection<? extends Task>)newValue);
				return;
			case CorePackage.TASK__CHUNKS:
				((EStructuralFeature.Setting)getChunks()).set(newValue);
				return;
			case CorePackage.TASK__FULL_NAME_DEPRECATED:
				setFullNameDEPRECATED((String)newValue);
				return;
			case CorePackage.TASK__TOOLS:
				((EStructuralFeature.Setting)getTools()).set(newValue);
				return;
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				setPreviousTaskStr((String)newValue);
				return;
			case CorePackage.TASK__ROOT:
				setRoot((Boolean)newValue);
				return;
			case CorePackage.TASK__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				getGroupingCriteria().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.TASK__FLAGS:
				setFlags((Integer)newValue);
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
			case CorePackage.TASK__SHALL_PROCESS_JEXL:
				setShallProcessJEXL(SHALL_PROCESS_JEXL_EDEFAULT);
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
			case CorePackage.TASK__FULL_NAME_DEPRECATED:
				setFullNameDEPRECATED(FULL_NAME_DEPRECATED_EDEFAULT);
				return;
			case CorePackage.TASK__TOOLS:
				getTools().clear();
				return;
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				setPreviousTaskStr(PREVIOUS_TASK_STR_EDEFAULT);
				return;
			case CorePackage.TASK__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case CorePackage.TASK__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				return;
			case CorePackage.TASK__FLAGS:
				setFlags(FLAGS_EDEFAULT);
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
			case CorePackage.TASK__SHALL_PROCESS_JEXL:
				return SHALL_PROCESS_JEXL_EDEFAULT == null ? shallProcessJEXL != null : !SHALL_PROCESS_JEXL_EDEFAULT.equals(shallProcessJEXL);
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
			case CorePackage.TASK__FULL_NAME_DEPRECATED:
				return FULL_NAME_DEPRECATED_EDEFAULT == null ? fullNameDEPRECATED != null : !FULL_NAME_DEPRECATED_EDEFAULT.equals(fullNameDEPRECATED);
			case CorePackage.TASK__TOOLS:
				return tools != null && !tools.isEmpty();
			case CorePackage.TASK__PREVIOUS_TASK_STR:
				return PREVIOUS_TASK_STR_EDEFAULT == null ? previousTaskStr != null : !PREVIOUS_TASK_STR_EDEFAULT.equals(previousTaskStr);
			case CorePackage.TASK__ROOT:
				return root != ROOT_EDEFAULT;
			case CorePackage.TASK__GROUPING_CRITERIA:
				return groupingCriteria != null && !groupingCriteria.isEmpty();
			case CorePackage.TASK__FLAGS:
				return flags != FLAGS_EDEFAULT;
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
		result.append(", shallProcessJEXL: ");
		result.append(shallProcessJEXL);
		result.append(", util: ");
		result.append(util);
		result.append(", jexlEngine: ");
		result.append(jexlEngine);
		result.append(", logger: ");
		result.append(logger);
		result.append(", fullNameDEPRECATED: ");
		result.append(fullNameDEPRECATED);
		result.append(", previousTaskStr: ");
		result.append(previousTaskStr);
		result.append(", root: ");
		result.append(root);
		result.append(", groupingCriteria: ");
		result.append(groupingCriteria);
		result.append(", flags: ");
		result.append(flags);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
