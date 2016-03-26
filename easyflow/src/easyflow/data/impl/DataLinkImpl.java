/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data.impl;

import easyflow.core.Condition;
import easyflow.core.PreprocessingTask;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.Util;
import easyflow.data.Data;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPackage;
import easyflow.data.DataPort;
import easyflow.tool.Parameter;
import easyflow.traversal.TraversalChunk;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToChunksMapImpl;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getInDataPort <em>In Data Port</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getGroupingStr <em>Grouping Str</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getParentGroupingStr <em>Parent Grouping Str</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getParamStr <em>Param Str</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getParamNameStr <em>Param Name Str</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getParamChunks <em>Param Chunks</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#isIdenticalGrouping <em>Identical Grouping</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getIntermediateTasks <em>Intermediate Tasks</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getInData <em>In Data</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#isProcessed <em>Processed</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link easyflow.data.impl.DataLinkImpl#getPipe <em>Pipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataLinkImpl extends MinimalEObjectImpl.Container implements DataLink {
	
	Logger logger = Logger.getLogger(DataLink.class);
	/**
	 * The cached value of the '{@link #getDataPort() <em>Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPort()
	 * @generated
	 * @ordered
	 */
	protected DataPort dataPort;

	/**
	 * The cached value of the '{@link #getInDataPort() <em>In Data Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDataPort()
	 * @generated
	 * @ordered
	 */
	protected DataPort inDataPort;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupingStr() <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPING_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupingStr() <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected String groupingStr = GROUPING_STR_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentGroupingStr() <em>Parent Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_GROUPING_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentGroupingStr() <em>Parent Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected String parentGroupingStr = PARENT_GROUPING_STR_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamStr() <em>Param Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamStr()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_STR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getParamStr() <em>Param Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamStr()
	 * @generated
	 * @ordered
	 */
	protected String paramStr = PARAM_STR_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamNameStr() <em>Param Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamNameStr()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_NAME_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamNameStr() <em>Param Name Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamNameStr()
	 * @generated
	 * @ordered
	 */
	protected String paramNameStr = PARAM_NAME_STR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamChunks() <em>Param Chunks</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamChunks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<TraversalChunk>> paramChunks;

	/**
	 * The default value of the '{@link #isIdenticalGrouping() <em>Identical Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdenticalGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTICAL_GROUPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdenticalGrouping() <em>Identical Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdenticalGrouping()
	 * @generated
	 * @ordered
	 */
	protected boolean identicalGrouping = IDENTICAL_GROUPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getIntermediateTasks() <em>Intermediate Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingTask> intermediateTasks;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getInData() <em>In Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInData()
	 * @generated
	 * @ordered
	 */
	protected Data inData;

	/**
	 * The default value of the '{@link #isTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminal()
	 * @generated
	 * @ordered
	 */
	protected boolean terminal = TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected boolean processed = PROCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final URI DATA_RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected URI dataResourceName = DATA_RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPipe() <em>Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipe()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PIPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPipe() <em>Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipe()
	 * @generated
	 * @ordered
	 */
	protected Boolean pipe = PIPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort getDataPort() {
		if (dataPort != null && dataPort.eIsProxy()) {
			InternalEObject oldDataPort = (InternalEObject)dataPort;
			dataPort = (DataPort)eResolveProxy(oldDataPort);
			if (dataPort != oldDataPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LINK__DATA_PORT, oldDataPort, dataPort));
			}
		}
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort basicGetDataPort() {
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPort(DataPort newDataPort) {
		DataPort oldDataPort = dataPort;
		dataPort = newDataPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__DATA_PORT, oldDataPort, dataPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort getInDataPort() {
		if (inDataPort != null && inDataPort.eIsProxy()) {
			InternalEObject oldInDataPort = (InternalEObject)inDataPort;
			inDataPort = (DataPort)eResolveProxy(oldInDataPort);
			if (inDataPort != oldInDataPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LINK__IN_DATA_PORT, oldInDataPort, inDataPort));
			}
		}
		return inDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort basicGetInDataPort() {
		return inDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInDataPort(DataPort newInDataPort) {
		DataPort oldInDataPort = inDataPort;
		inDataPort = newInDataPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__IN_DATA_PORT, oldInDataPort, inDataPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<TraversalChunk>> getChunks() {
		if (chunks == null) {
			chunks = new EcoreEMap<String,EList<TraversalChunk>>(MapsPackage.Literals.STRING_TO_CHUNKS_MAP, StringToChunksMapImpl.class, this, DataPackage.DATA_LINK__CHUNKS);
		}
		return chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupingStr() {
		return groupingStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingStr(String newGroupingStr) {
		String oldGroupingStr = groupingStr;
		groupingStr = newGroupingStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__GROUPING_STR, oldGroupingStr, groupingStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentGroupingStr() {
		return parentGroupingStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroupingStr(String newParentGroupingStr) {
		String oldParentGroupingStr = parentGroupingStr;
		parentGroupingStr = newParentGroupingStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__PARENT_GROUPING_STR, oldParentGroupingStr, parentGroupingStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdenticalGrouping() {
		return identicalGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdenticalGrouping(boolean newIdenticalGrouping) {
		boolean oldIdenticalGrouping = identicalGrouping;
		identicalGrouping = newIdenticalGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__IDENTICAL_GROUPING, oldIdenticalGrouping, identicalGrouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LINK__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessingTask> getIntermediateTasks() {
		if (intermediateTasks == null) {
			intermediateTasks = new EObjectResolvingEList<PreprocessingTask>(PreprocessingTask.class, this, DataPackage.DATA_LINK__INTERMEDIATE_TASKS);
		}
		return intermediateTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LINK__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__DATA, oldData, data));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getInData() {
		if (inData != null && inData.eIsProxy()) {
			InternalEObject oldInData = (InternalEObject)inData;
			inData = (Data)eResolveProxy(oldInData);
			if (inData != oldInData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_LINK__IN_DATA, oldInData, inData));
			}
		}
		return inData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetInData() {
		return inData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInData(Data newInData) {
		Data oldInData = inData;
		inData = newInData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__IN_DATA, oldInData, inData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(boolean newTerminal) {
		boolean oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessed(boolean newProcessed) {
		boolean oldProcessed = processed;
		processed = newProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__PROCESSED, oldProcessed, processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getDataResourceName() {
		return dataResourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataResourceName(URI newDataResourceName) {
		URI oldDataResourceName = dataResourceName;
		dataResourceName = newDataResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__DATA_RESOURCE_NAME, oldDataResourceName, dataResourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPipe() {
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipe(Boolean newPipe) {
		Boolean oldPipe = pipe;
		pipe = newPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__PIPE, oldPipe, pipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamStr() {
		return paramStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamStr(String newParamStr) {
		String oldParamStr = paramStr;
		paramStr = newParamStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__PARAM_STR, oldParamStr, paramStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamNameStr() {
		return paramNameStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamNameStr(String newParamNameStr) {
		String oldParamNameStr = paramNameStr;
		paramNameStr = newParamNameStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_LINK__PARAM_NAME_STR, oldParamNameStr, paramNameStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<TraversalChunk>> getParamChunks() {
		if (paramChunks == null) {
			paramChunks = new EcoreEMap<String,EList<TraversalChunk>>(MapsPackage.Literals.STRING_TO_CHUNKS_MAP, StringToChunksMapImpl.class, this, DataPackage.DATA_LINK__PARAM_CHUNKS);
		}
		return paramChunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isUnconditional() {
		return (getCondition() == null || getCondition().isUnconditional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueString(String prefix, String suffix, String sep1) {
		
		String sep = sep1 == null ? "_" : sep1;
		String uniqueString = getUniqueString();
		
		if (prefix != null && !prefix.equals(""))
			uniqueString = prefix + sep + uniqueString;
		if (suffix != null && !suffix.equals(""))
			uniqueString += sep + suffix;
		
		return uniqueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueString() {
		
		String sep1="_";
		String sep2="=";
		String sep3="-";
		
		String uniqueString = getGroupingStr();
		if (getChunks().containsKey(uniqueString) && !getChunks().get(getGroupingStr()).isEmpty())
			uniqueString+=sep2+Util.list2String(getChunks().get(getGroupingStr()), sep3);
		
		
			if (getData() != null && getData().getName() != null && !"".equals(getData().getName()))
				uniqueString+=sep1+getData().getName();
			else 
			{
				if (getData() != null && getData().getPort() != null)
				{
					if (getData().getPort().getName() != null && !"".equals(getData().getPort().getName()))
						uniqueString+=sep1+getData().getPort().getName();					
				}
				else if (getDataPort() != null && getDataPort().getName()!=null && !"".equals(getDataPort().getName()))
				{
					uniqueString+=sep1+getDataPort().getName();
				}
 
			}

		return uniqueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueString(boolean isVerbose) {
		
		String uniqueStr1 = "";
		String uniqueStr2 = "";
		EList<String> uniqueStrs = new BasicEList<String>();
		String sep1="_";
		String sep2="=";
		String sep3="-";
		String dataPortStr1 = "";
		String dataPortStr2 = "";
		String dataPortStr  = "";
		
		if (getParamStr()!=null && !getParamStr().equals(""))
		{
			uniqueStr1+=getParamStr();
			if (getChunks().containsKey(getParamStr()) && isVerbose)
				uniqueStr1+=sep2+Util.list2String(getChunks().get(getParamStr()), sep3);
			uniqueStrs.add(uniqueStr1);
		}
		
		if (getGroupingStr() != null && !getGroupingStr().equals(""))
		{
			uniqueStr2+=getGroupingStr();
			if (getChunks().containsKey(getGroupingStr()) && isVerbose)
				uniqueStr2+=sep2+Util.list2String(getChunks().get(getGroupingStr()), sep3);
			uniqueStrs.add(uniqueStr2);
		}
		
		if (isVerbose)
		{
			if (getInDataPort() != null)
			{
				dataPortStr1 += "DataPort (In): "+getInDataPort().getName()
						+" (FileExension="+getInDataPort().getFormat().renderAsFileExtension()+")";
			}
			if (getInData() != null)
			{
				dataPortStr1 += "Data (In): "+getInData().getFormatStr();
				
				if (getInData().getParameter() != null)
				{
					Parameter param = getInData().getParameter();
					dataPortStr1 += "Parameter (In): "+(param.getLabel() == null ? param.getName() : param.getLabel());
				}
			}
			if (!"".equals(dataPortStr1))
				dataPortStr+=dataPortStr1;

			if (getDataPort() != null)
			{
				dataPortStr2 += "DataPort (Out): "+getDataPort().getName()
					+" (FileExension="+getDataPort().getFormat().renderAsFileExtension()+")";
			}
			if (getData() != null)
			{
				dataPortStr2 += "Data (Out): "+getData().getFormatStr();
				
				if (getData().getParameter() != null)
				{
					Parameter param = getData().getParameter();
					dataPortStr2 += "Parameter (Out): "+(param.getLabel() == null ? param.getName() : param.getLabel());
				}
			}
			if (!"".equals(dataPortStr2))
				dataPortStr+=dataPortStr2;
			/*
			if (getChunks() != null)
			{
				tip += "Data:<br>";
				for (String chunkType : getChunks().keySet())
				{
					tip += "  -"+chunkType+": "+Util.list2String(getChunks().get(chunkType), ",");
					tip += "<br>";
				}
			}
			
			if (getDataPort() != null && !getDataPort().isStatic())
			{
				tip += "Data:<br>";
				for (TraversalCriterion traversalCriterion : getDataPort().getGroupingCriteria())
				{
					for (String chunkType : traversalCriterion.getChunks().keySet())
					{
						tip += "  -"+chunkType+": "+Util.list2String(getChunks().get(chunkType), ",");
						tip += "<br>";
					}
				}
			}
			else
			{
				tip += "No DataPort defined.<br>";
			}
			*/
		}
		
		if (!"".equals(dataPortStr))
			return StringUtils.join(uniqueStrs, sep1)+" "+dataPortStr;
		else
			return StringUtils.join(uniqueStrs, sep1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataFormat getFormat() {
		
		DataFormat format = null;
		
		boolean formatInAvail = false;
		boolean formatOutAvail= false;
		
		if (getDataPort() != null)
			formatOutAvail = true;
		if (getInDataPort() != null)
			formatInAvail = true;
		
		if (formatInAvail && formatOutAvail)
			for (DataFormat in : getInDataPort().getDataFormats().values())
				for (DataFormat out : getDataPort().getDataFormats().values())
					if (in.match(out))
						format = in;
		
		if (format == null)
		{
			formatInAvail = false;
			formatOutAvail= false;
		
		logger.debug((getData() != null ? getData().getFormat() : "no out data defined ")
				+" -- "
				+(getInData() != null ? getInData().getFormat() : "no in data defined"));
		
		if (getData() != null && getData().getFormat() != null && !"".equals(getData().getFormat()))
		{
			formatOutAvail = true;
		}
		else if (getInData() != null && getInData().getFormat() != null && !"".equals(getInData().getFormat()))
		{
			formatInAvail = true;
		}
		
		if (formatOutAvail && formatInAvail)
		{
			for (DataFormat in : getInData().getPort().getDataFormats().values())
				for (DataFormat out : getData().getPort().getDataFormats().values())
					if (in.match(out))
						format = in;
			if (format == null)
				format = getInData().getFormat();
		}
		else if (formatInAvail)
			format = getInData().getFormat();
		else if (formatOutAvail)
			format = getData().getFormat();
		else 
		{
			if (getData() != null && getData().getPort() != null 
					&& getData().getPort().getDataFormats() != null 
					&& !getData().getPort().getDataFormats().isEmpty())
			{
				format = getData().getPort().getFormat();
			}
			else if (getDataPort() != null && getDataPort().getDataFormats() != null && !getDataPort().getDataFormats().isEmpty())
			{
				format = getDataPort().getFormat();
			}
			else if (getInDataPort() != null && getInDataPort().getDataFormats() != null && !getInDataPort().getDataFormats().isEmpty())
			{
				format = getInDataPort().getFormat();
			}
		}
		}
		return format;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPipeable() {
		
		if (getPipe() != null)
			return getPipe();
		
		//boolean applyConfig = true;
		boolean isPipeable = false;
		boolean rootProvidesPipe = false;
		EList<String> handles;
		if (getInData() != null)
		{
			handles = getInData().resolveSupportedHandles();
			if (handles.contains(GlobalConstants.NAME_PIPE_HANDLE) || handles.contains(GlobalConstants.NAME_STDOUT_HANDLE))
				isPipeable = true;
		}
		else
		{
			isPipeable = rootProvidesPipe;
		}
		
		if (getData() != null)
		{
			handles = getData().resolveSupportedHandles();
			if (!(handles.contains(GlobalConstants.NAME_PIPE_HANDLE) || handles.contains(GlobalConstants.NAME_STDIN_HANDLE)))
				isPipeable = false;
		}
		else if (getInData() == null)
			isPipeable = false;
		
		return isPipeable;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws NoValidInOutDataException 
	 * @generated not
	 */
	public EList<Data> getMatchingDataFor(EList<Data> dataList, EList<String> allowedHandles, boolean useOutDataPort) throws NoValidInOutDataException {
		
		EList<Data> data = new BasicEList<Data>();
		
		if (dataList.isEmpty())
		{
			logger.error("getMatchingDataFor(): to tool-data provied.");
		}
		else
		{
			Iterator<Data> it = dataList.iterator();
			while (it.hasNext())
			{
				Data curData = it.next();
					DataPort tmp = useOutDataPort ? getDataPort() : getInDataPort();
					boolean add = (((useOutDataPort && !curData.isOutput()) || (!useOutDataPort && curData.isOutput())) &&
								   curData.isAllowed() && 
								   curData.getPort().isCompatible(tmp));
					logger.debug("getToolDataForDataLink(): "+curData.getPort().getFormat().getName()+" ("+curData.getPort().getName()+") vs: "
								+tmp.getFormat().getName()+"("+tmp.getName()+") iscompatible="+(curData.getPort().isCompatible(tmp))
							+" isAllowed="+curData.isAllowed()+" isOutput="+curData.isOutput()
							+" matching in-out port="+((useOutDataPort && !curData.isOutput()) || (!useOutDataPort && curData.isOutput()))
							+" add to list="+add
							);
					if (add)
					{
						if (curData.getParameter().getToolRefs() != null && !curData.getParameter().getToolRefs().isEmpty())
							data.add(0, curData);
						else
							data.add(curData);
					}
			}

			/*if (data.isEmpty())
			{
				throw new NoValidInOutDataException();
			}*/
		}
		//if (data.size()==0)
			//logger.error("getMatchingDataFor(): could not find tool for datalink="+getUniqueString(true));
		
		return data;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	/*
	public boolean isHidden(boolean in) {
		
		boolean hidden = GlobalConfig.paramIsHidden();
		//boolean hidden = false; 
		Data data = in ? getInData() : getData();
		
		if (data != null && data.getParameter() != null && data.getParameter().isHidden())
			hidden = true;
			
		return hidden;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_LINK__CHUNKS:
				return ((InternalEList<?>)getChunks()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_LINK__PARAM_CHUNKS:
				return ((InternalEList<?>)getParamChunks()).basicRemove(otherEnd, msgs);
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
			case DataPackage.DATA_LINK__DATA_PORT:
				if (resolve) return getDataPort();
				return basicGetDataPort();
			case DataPackage.DATA_LINK__IN_DATA_PORT:
				if (resolve) return getInDataPort();
				return basicGetInDataPort();
			case DataPackage.DATA_LINK__CHUNKS:
				if (coreType) return getChunks();
				else return getChunks().map();
			case DataPackage.DATA_LINK__ID:
				return getId();
			case DataPackage.DATA_LINK__GROUPING_STR:
				return getGroupingStr();
			case DataPackage.DATA_LINK__PARENT_GROUPING_STR:
				return getParentGroupingStr();
			case DataPackage.DATA_LINK__PARAM_STR:
				return getParamStr();
			case DataPackage.DATA_LINK__PARAM_NAME_STR:
				return getParamNameStr();
			case DataPackage.DATA_LINK__PARAM_CHUNKS:
				if (coreType) return getParamChunks();
				else return getParamChunks().map();
			case DataPackage.DATA_LINK__IDENTICAL_GROUPING:
				return isIdenticalGrouping();
			case DataPackage.DATA_LINK__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case DataPackage.DATA_LINK__INTERMEDIATE_TASKS:
				return getIntermediateTasks();
			case DataPackage.DATA_LINK__DATA:
				if (resolve) return getData();
				return basicGetData();
			case DataPackage.DATA_LINK__IN_DATA:
				if (resolve) return getInData();
				return basicGetInData();
			case DataPackage.DATA_LINK__TERMINAL:
				return isTerminal();
			case DataPackage.DATA_LINK__PROCESSED:
				return isProcessed();
			case DataPackage.DATA_LINK__DATA_RESOURCE_NAME:
				return getDataResourceName();
			case DataPackage.DATA_LINK__PIPE:
				return getPipe();
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
			case DataPackage.DATA_LINK__DATA_PORT:
				setDataPort((DataPort)newValue);
				return;
			case DataPackage.DATA_LINK__IN_DATA_PORT:
				setInDataPort((DataPort)newValue);
				return;
			case DataPackage.DATA_LINK__CHUNKS:
				((EStructuralFeature.Setting)getChunks()).set(newValue);
				return;
			case DataPackage.DATA_LINK__ID:
				setId((Integer)newValue);
				return;
			case DataPackage.DATA_LINK__GROUPING_STR:
				setGroupingStr((String)newValue);
				return;
			case DataPackage.DATA_LINK__PARENT_GROUPING_STR:
				setParentGroupingStr((String)newValue);
				return;
			case DataPackage.DATA_LINK__PARAM_STR:
				setParamStr((String)newValue);
				return;
			case DataPackage.DATA_LINK__PARAM_NAME_STR:
				setParamNameStr((String)newValue);
				return;
			case DataPackage.DATA_LINK__PARAM_CHUNKS:
				((EStructuralFeature.Setting)getParamChunks()).set(newValue);
				return;
			case DataPackage.DATA_LINK__IDENTICAL_GROUPING:
				setIdenticalGrouping((Boolean)newValue);
				return;
			case DataPackage.DATA_LINK__CONDITION:
				setCondition((Condition)newValue);
				return;
			case DataPackage.DATA_LINK__INTERMEDIATE_TASKS:
				getIntermediateTasks().clear();
				getIntermediateTasks().addAll((Collection<? extends PreprocessingTask>)newValue);
				return;
			case DataPackage.DATA_LINK__DATA:
				setData((Data)newValue);
				return;
			case DataPackage.DATA_LINK__IN_DATA:
				setInData((Data)newValue);
				return;
			case DataPackage.DATA_LINK__TERMINAL:
				setTerminal((Boolean)newValue);
				return;
			case DataPackage.DATA_LINK__PROCESSED:
				setProcessed((Boolean)newValue);
				return;
			case DataPackage.DATA_LINK__DATA_RESOURCE_NAME:
				setDataResourceName((URI)newValue);
				return;
			case DataPackage.DATA_LINK__PIPE:
				setPipe((Boolean)newValue);
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
			case DataPackage.DATA_LINK__DATA_PORT:
				setDataPort((DataPort)null);
				return;
			case DataPackage.DATA_LINK__IN_DATA_PORT:
				setInDataPort((DataPort)null);
				return;
			case DataPackage.DATA_LINK__CHUNKS:
				getChunks().clear();
				return;
			case DataPackage.DATA_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__GROUPING_STR:
				setGroupingStr(GROUPING_STR_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PARENT_GROUPING_STR:
				setParentGroupingStr(PARENT_GROUPING_STR_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PARAM_STR:
				setParamStr(PARAM_STR_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PARAM_NAME_STR:
				setParamNameStr(PARAM_NAME_STR_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PARAM_CHUNKS:
				getParamChunks().clear();
				return;
			case DataPackage.DATA_LINK__IDENTICAL_GROUPING:
				setIdenticalGrouping(IDENTICAL_GROUPING_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__CONDITION:
				setCondition((Condition)null);
				return;
			case DataPackage.DATA_LINK__INTERMEDIATE_TASKS:
				getIntermediateTasks().clear();
				return;
			case DataPackage.DATA_LINK__DATA:
				setData((Data)null);
				return;
			case DataPackage.DATA_LINK__IN_DATA:
				setInData((Data)null);
				return;
			case DataPackage.DATA_LINK__TERMINAL:
				setTerminal(TERMINAL_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PROCESSED:
				setProcessed(PROCESSED_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__DATA_RESOURCE_NAME:
				setDataResourceName(DATA_RESOURCE_NAME_EDEFAULT);
				return;
			case DataPackage.DATA_LINK__PIPE:
				setPipe(PIPE_EDEFAULT);
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
			case DataPackage.DATA_LINK__DATA_PORT:
				return dataPort != null;
			case DataPackage.DATA_LINK__IN_DATA_PORT:
				return inDataPort != null;
			case DataPackage.DATA_LINK__CHUNKS:
				return chunks != null && !chunks.isEmpty();
			case DataPackage.DATA_LINK__ID:
				return id != ID_EDEFAULT;
			case DataPackage.DATA_LINK__GROUPING_STR:
				return GROUPING_STR_EDEFAULT == null ? groupingStr != null : !GROUPING_STR_EDEFAULT.equals(groupingStr);
			case DataPackage.DATA_LINK__PARENT_GROUPING_STR:
				return PARENT_GROUPING_STR_EDEFAULT == null ? parentGroupingStr != null : !PARENT_GROUPING_STR_EDEFAULT.equals(parentGroupingStr);
			case DataPackage.DATA_LINK__PARAM_STR:
				return PARAM_STR_EDEFAULT == null ? paramStr != null : !PARAM_STR_EDEFAULT.equals(paramStr);
			case DataPackage.DATA_LINK__PARAM_NAME_STR:
				return PARAM_NAME_STR_EDEFAULT == null ? paramNameStr != null : !PARAM_NAME_STR_EDEFAULT.equals(paramNameStr);
			case DataPackage.DATA_LINK__PARAM_CHUNKS:
				return paramChunks != null && !paramChunks.isEmpty();
			case DataPackage.DATA_LINK__IDENTICAL_GROUPING:
				return identicalGrouping != IDENTICAL_GROUPING_EDEFAULT;
			case DataPackage.DATA_LINK__CONDITION:
				return condition != null;
			case DataPackage.DATA_LINK__INTERMEDIATE_TASKS:
				return intermediateTasks != null && !intermediateTasks.isEmpty();
			case DataPackage.DATA_LINK__DATA:
				return data != null;
			case DataPackage.DATA_LINK__IN_DATA:
				return inData != null;
			case DataPackage.DATA_LINK__TERMINAL:
				return terminal != TERMINAL_EDEFAULT;
			case DataPackage.DATA_LINK__PROCESSED:
				return processed != PROCESSED_EDEFAULT;
			case DataPackage.DATA_LINK__DATA_RESOURCE_NAME:
				return DATA_RESOURCE_NAME_EDEFAULT == null ? dataResourceName != null : !DATA_RESOURCE_NAME_EDEFAULT.equals(dataResourceName);
			case DataPackage.DATA_LINK__PIPE:
				return PIPE_EDEFAULT == null ? pipe != null : !PIPE_EDEFAULT.equals(pipe);
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
			case DataPackage.DATA_LINK___IS_UNCONDITIONAL:
				return isUnconditional();
			case DataPackage.DATA_LINK___GET_UNIQUE_STRING__STRING_STRING_STRING:
				return getUniqueString((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DataPackage.DATA_LINK___GET_UNIQUE_STRING:
				return getUniqueString();
			case DataPackage.DATA_LINK___GET_UNIQUE_STRING__BOOLEAN:
				return getUniqueString((Boolean)arguments.get(0));
			case DataPackage.DATA_LINK___GET_FORMAT:
				return getFormat();
			case DataPackage.DATA_LINK___IS_PIPEABLE:
				return isPipeable();
			case DataPackage.DATA_LINK___GET_MATCHING_DATA_FOR__ELIST_ELIST_BOOLEAN:
				try {
					return getMatchingDataFor((EList<Data>)arguments.get(0), (EList<String>)arguments.get(1), (Boolean)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (id: ");
		result.append(id);
		result.append(", groupingStr: ");
		result.append(groupingStr);
		result.append(", parentGroupingStr: ");
		result.append(parentGroupingStr);
		result.append(", paramStr: ");
		result.append(paramStr);
		result.append(", paramNameStr: ");
		result.append(paramNameStr);
		result.append(", identicalGrouping: ");
		result.append(identicalGrouping);
		result.append(", terminal: ");
		result.append(terminal);
		result.append(", processed: ");
		result.append(processed);
		result.append(", dataResourceName: ");
		result.append(dataResourceName);
		result.append(", pipe: ");
		result.append(pipe);
		result.append(')');
		return result.toString();
	}

} //DataLinkImpl
