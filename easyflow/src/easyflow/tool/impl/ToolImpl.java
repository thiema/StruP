/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.util.Category;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.Tuple;
import easyflow.data.Data;
import easyflow.data.DataFactory;
import easyflow.data.DataPort;
import easyflow.tool.Command;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.tool.ToolPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.util.LogMessage;
import easyflow.util.UtilFactory;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataListMapImpl;
import easyflow.util.maps.impl.StringToResolvedParamMapImpl;
import easyflow.util.maps.impl.StringToURIMapImpl;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getExecutables <em>Executables</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getFilenamePrefix <em>Filename Prefix</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getResolvedParams <em>Resolved Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getResolveUriMap <em>Resolve Uri Map</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolImpl extends MinimalEObjectImpl.Container implements Tool {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Tool.class);

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected easyflow.tool.Package package_;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getExecutables() <em>Executables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> executables;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<Data>> data;

	/**
	 * The default value of the '{@link #getFilenamePrefix() <em>Filename Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilenamePrefix() <em>Filename Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String filenamePrefix = FILENAME_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected static final String ANALYSIS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected String analysisType = ANALYSIS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The cached value of the '{@link #getResolvedParams() <em>Resolved Params</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedParams()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ResolvedParam> resolvedParams;

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
	 * The cached value of the '{@link #getResolveUriMap() <em>Resolve Uri Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveUriMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> resolveUriMap;

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
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.TOOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__DESCRIPTION, oldDescription, description));
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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public easyflow.tool.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (easyflow.tool.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public easyflow.tool.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(easyflow.tool.Package newPackage) {
		easyflow.tool.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, ToolPackage.TOOL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getExecutables() {
		if (executables == null) {
			executables = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, ToolPackage.TOOL__EXECUTABLES);
		}
		return executables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<Data>> getData() {
		if (data == null) {
			data = new EcoreEMap<String,EList<Data>>(MapsPackage.Literals.STRING_TO_DATA_LIST_MAP, StringToDataListMapImpl.class, this, ToolPackage.TOOL__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilenamePrefix() {
		return filenamePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilenamePrefix(String newFilenamePrefix) {
		String oldFilenamePrefix = filenamePrefix;
		filenamePrefix = newFilenamePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__FILENAME_PREFIX, oldFilenamePrefix, filenamePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnalysisType() {
		return analysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisType(String newAnalysisType) {
		String oldAnalysisType = analysisType;
		analysisType = newAnalysisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__ANALYSIS_TYPE, oldAnalysisType, analysisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Command)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ResolvedParam> getResolvedParams() {
		if (resolvedParams == null) {
			resolvedParams = new EcoreEMap<String,ResolvedParam>(MapsPackage.Literals.STRING_TO_RESOLVED_PARAM_MAP, StringToResolvedParamMapImpl.class, this, ToolPackage.TOOL__RESOLVED_PARAMS);
		}
		return resolvedParams;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getResolveUriMap() {
		if (resolveUriMap == null) {
			resolveUriMap = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, ToolPackage.TOOL__RESOLVE_URI_MAP);
		}
		return resolveUriMap;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL__LOG_MESSAGE, oldLogMessage, logMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__LOG_MESSAGE, oldLogMessage, logMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeModelToXML() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canFilterInstancesFor(DataPort dataPort) throws DataPortNotFoundException {
		throw new UnsupportedOperationException();
		/*Data data = getData().get(dataPort.getName());
		if (data==null)
			throw new DataPortNotFoundException();
		return false;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean requiresGrouping(String groupingCriterion, DataPort dataPort) {
		throw new UnsupportedOperationException();
		/*for (Entry<String, Data> e:getData().entrySet())
			if (!e.getValue().isOutput() && e.getValue().getPort().isCompatible(dataPort))
				return true;
		return false;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean providesGrouping(String groupingCriterion, DataPort dataPort) {
		throw new UnsupportedOperationException();
		/*for (Entry<String, Data> e:getData().entrySet())
			if (e.getValue().isOutput() && e.getValue().getPort().isCompatible(dataPort))
				return true;
		return false;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getGroupingsForInputPort(DataPort dataPort, boolean isRequired) {
		throw new UnsupportedOperationException();
		/*EList<String> groupings=new BasicEList<String>();
		for (Entry<String, Data> e:getData().entrySet())
			if (!e.getValue().isOutput())
				if (dataPort.isCompatible(e.getValue().getPort()))
					groupings.addAll(getCommand().getGroupingsForDataPort(dataPort, true));
		
		return groupings;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getGroupingsForOutputPort(DataPort dataPort, boolean isRequired) {
		throw new UnsupportedOperationException();
		/*EList<String> groupings=new BasicEList<String>();
		for (Entry<String, Data> e:getData().entrySet())
			if (e.getValue().isOutput())
				if (dataPort.isCompatible(e.getValue().getPort()))
					groupings.addAll(getCommand().getGroupingsForDataPort(dataPort, true));
				
		return groupings;*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * return 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Tuple<Parameter, OptionValue> getAnalysisTypeOfPackage(EList<TraversalChunk> records) {
		
		//Parameter returnParam = null;
		OptionValue returnValue = null;
		// Example: 
		//   jexlString=
		//   
		
		// get package and check whether parameter analysis type
		// matches the tools analysis type and/or if condition set, if condition matches the metadata
		
		// Example1: package=gatk with parameter analysisType and option values contain UnifiedGenotyper;
		//          tool=UnifiedGenotyper;
		// Example2: package=bwa, with parameter analysisType and option values contain 
		//              sampe with cond="size(InputFiles)==2" and samse with cond="size(InputFiles)==1"
		if (getPackage()!=null)
		{
			for (ResolvedParam resolvedParam : getPackage().getResolvedParams())
			{
				Parameter parameter = resolvedParam.getParameter();
				if (parameter.isAnalysisType())
				{
					String matchByNameStr = null;
					String matchByCondStr = null;
					logger.debug("getAnalysisTypeOfPackage(): "+"tool="+getId()+"/"+getName()+" for anatype="+getAnalysisType());
					for (OptionValue optionValue : parameter.getOptionValues())
					{
						logger.debug("getAnalysisTypeOfPackage(): check option="+optionValue.getName()+" "+optionValue.getCondition());
						if (getAnalysisType() != null && optionValue.getName().equals(getAnalysisType()))
						{
							matchByNameStr = optionValue.getExe()!=null ? optionValue.getExe() : getAnalysisType();
							returnValue = optionValue;
							returnValue.setExe(matchByNameStr);
							break;
						}
						else if (optionValue.getName().equals(getId()))
						{
							matchByNameStr = optionValue.getExe() != null ? optionValue.getExe() : getId();
							returnValue = optionValue;
							returnValue.setExe(matchByNameStr);
							break;
						}
						else if (optionValue.getName().equals(getName()))
						{
							matchByNameStr = optionValue.getExe() != null ? optionValue.getExe() : getName();
							returnValue = optionValue;
							returnValue.setExe(matchByNameStr);
							break;
						}	
						else if (optionValue.getCondition() != null)
						{
							for (EMap<String, Object> map:easyflow.custom.util.Util.createMetaDataMapForJexl(
									records))
							{
								Object evalObject = easyflow.custom.util.Util.evaluateJexl(
										map, optionValue.getCondition());
								if (evalObject instanceof Boolean) 
								{
									if (((Boolean) evalObject).booleanValue())
									{
										matchByCondStr = optionValue.getExe() != null ? optionValue.getExe() : optionValue.getName();
										returnValue = optionValue;
										break;
									}
								}
							}
						}
					}
					if (matchByNameStr != null)
					{
						return new Tuple<Parameter, OptionValue>(parameter, returnValue);
					}
					else if (matchByCondStr != null)
					{
						return new Tuple<Parameter, OptionValue>(parameter, returnValue);
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Parameter getTemplateParameter()
	{
		return getTemplateParameter(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Parameter getTemplateParameter(Parameter parameter) {
		
		Parameter toolParam     = null;
		Parameter pkgParam      = null;
		Parameter dfltParam     = null;
		//String s;
		Parameter templateParam = null;
		//easyflow.tool.Package pkg = getPackage();
		if (!getCommand().getTemplateParams().isEmpty())
			toolParam = getMatchingParameter(getCommand().getTemplateParams(), parameter);
		
		if (getPackage() != null && !getPackage().getTemplateParams().isEmpty())
			pkgParam = getMatchingParameter(getPackage().getTemplateParams(), parameter);
		
		if (parameter != null)
		{
			if ((parameter.isDataParam() && assumeDataParamPositional()) ||
				(!parameter.isDataParam()) && assumeParamPositional())
				dfltParam = GlobalConfig.getPositonalParamTemplate();
			else
				dfltParam = GlobalConfig.getOptionalParamTemplate();
		}

		// merging parameters
		if (toolParam != null)
			templateParam = toolParam;
		if (templateParam != null && pkgParam != null)
			templateParam.merge(pkgParam);
		else if (pkgParam != null)
			templateParam = pkgParam;
		if (templateParam != null && dfltParam != null)
			templateParam.merge(dfltParam);
		else if (dfltParam != null)
			templateParam = dfltParam;

		return templateParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Parameter getMatchingParameter(EList<Parameter> parameters, Parameter parameter) {
		
		//logger.trace("getMatchingParameter()");
		if (parameter == null && !parameters.isEmpty())
			return parameters.get(0);
		
		Parameter      res      = null;
		//InOutParameter resInOut = null;
		InOutParameter dataParameter         = null;
		if (parameter.isDataParam())
			dataParameter = (InOutParameter) parameter;
		
		Iterator<Parameter> it = parameters.iterator();
		while (it.hasNext())
		{
			Parameter templateParameter = it.next();
			
			if (templateParameter != null)
			{
				boolean match = false;
				InOutParameter templateDataParameter = null;

				if (templateParameter.isDataParam())
					templateDataParameter = (InOutParameter) templateParameter;

				if (dataParameter != null && templateDataParameter != null)
					match = dataParameter.matches(templateDataParameter);
				else if (dataParameter == null && templateDataParameter == null)
					match = parameter.matches(templateParameter);
				// what should be done in a mixed (non-data/data) situation ?
				else
				{
					if (dataParameter != null && templateDataParameter == null)
						match = true;
					else
						logger.trace("getMatchingParameter(): skip non-data/data parameter pair. "
								+ " (test: "
								+ parameter.getName()
								+ " against "
								+ templateParameter.getName()
								+ ")");
				}
				
				if (match) 
				{
					if (templateParameter.getMultiple() != null && templateParameter.getMultiple())
					{
					logger.debug("getMatchingParameter(): "+getName()+": found "
							+ (res == null ? "" : "(add) ") + "template param="
							+ " name="+ templateParameter.getName()
							+ " named="+ templateParameter.isNamed(null)
							+ " prefix="+ templateParameter.getPrefix()
							+ " delim="+ templateParameter.getDelimiter()
							+ " handles="+ templateParameter.getHandles()
							+ " output="+ templateParameter.getOutputDefaultParam()
							+ " multiple="+templateParameter.getMultiple()
							);
					}
					if (res == null)
						res = EcoreUtil.copy(templateParameter);
					else
						res.merge(templateParameter);
				} 
				else
				{
					logger.trace("getMatchingParameter(): skip template param="
							+ templateParameter.getName() + " "
							+ templateParameter.isNamed(null) + " "
							+ templateParameter.getPrefix() + " "
							+ templateParameter.getDelimiter()+ " "
							+ templateParameter.hashCode());
				}

			} else {
				logger.trace("getMatchingParameter(): in/out port not matching"
						+ " (test: " + parameter.getName());
			}
		}
		return res;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getMatchingParameterByName(EList<Parameter> parameters, Parameter parameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<ResolvedParam> getInterpreterParams() {
		
		EList<ResolvedParam> paramList = getPackage() != null ? getPackage().getInterpreterParams() : new BasicEList<ResolvedParam>();
		Iterator<Entry<String, ResolvedParam>> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			if (GlobalConstants.COMMAND_PART_VALUE_INTERPRETER_PARAM.equals(e.getValue().getParameter().getCmdPart()))
				paramList.add(e.getValue());
		}
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getExe() {
		
		ResolvedParam param = getPackage() != null ? getPackage().getExe() : null;
		Iterator<Entry<String, ResolvedParam>> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			if (GlobalConstants.COMMAND_PART_VALUE_EXE.equals(e.getValue().getParameter().getCmdPart()))
				param = e.getValue();
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<ResolvedParam> getModuleParams() {
		
		EList<ResolvedParam> paramList = new BasicEList<ResolvedParam>();
		Iterator<Entry<String, ResolvedParam>> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			if (GlobalConstants.COMMAND_PART_VALUE_MODULE.equals(e.getValue().getParameter().getCmdPart()))
				paramList.add(e.getValue());
		}
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean assumeDataParamPositional() {
		
		if (getCommand().getAssumeDataParamPositional() != null)
			return getCommand().getAssumeDataParamPositional();
		else if (getPackage() != null && getPackage().getAssumeDataParamPositional() != null)
			return getPackage().getAssumeDataParamPositional();
		else
			return GlobalConfig.assumePositionalDataParam();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean assumeParamPositional() {
		
		if (getCommand().getAssumeParamPositional() != null)
			return getCommand().getAssumeParamPositional();
		else if (getPackage() != null && getPackage().getAssumeParamPositional() != null)
			return getPackage().getAssumeParamPositional();
		else
			return GlobalConfig.assumePositionalParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * if index map is provided, the parameter is inserted into the specific position 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void createData(InOutParameter parameter, EMap<String, Integer> indexMap, EMap<String, Integer> byParamIndexMap) {
		
		Data data = DataFactory.eINSTANCE.createData();
		data.setOutput(parameter.isOutput());
		data.setName(parameter.getName());
		data.setParameter(parameter);
		
		DataPort dataPort = DataFactory.eINSTANCE.createDataPort();
		dataPort.setName(parameter.getName());
		//if (withinTool)
			//dataPort.getTools().put(getName(), this);
		data.setPort(dataPort);
		dataPort.setFormats(((InOutParameter) parameter).getFormats());
		
		EList<Data> dataList = getData().get(parameter.getName());
		if (dataList == null)
		{
			dataList = new BasicEList<Data>();
			if (indexMap != null)
			{
				if (!indexMap.containsKey(parameter.resolveName()))
				{
					indexMap.put(parameter.resolveName(), 0);
				}
				int i = indexMap.get(parameter.resolveName());
				StringToDataListMapImpl entry = (StringToDataListMapImpl) EcoreUtil.create(MapsPackage.Literals.STRING_TO_DATA_LIST_MAP);
				entry.setKey(parameter.resolveName());
				entry.setValue(dataList);
				getData().add(i, entry);
				indexMap.put(parameter.resolveName(), i+1);
			}
			else
				getData().put(parameter.resolveName(), dataList);
		}
		if (byParamIndexMap != null)
		{
			if (!byParamIndexMap.containsKey(parameter.resolveName()))
			{
				byParamIndexMap.put(parameter.resolveName(), 0);
			}
			int i = byParamIndexMap.get(parameter.resolveName());
			getData().get(parameter.resolveName()).add(i, data);
			byParamIndexMap.put(parameter.resolveName(), i+1);
		}
		else
			getData().get(parameter.resolveName()).add(data);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void createData(ResolvedParam resolvedParameter, EMap<String, Integer> indexMap, EMap<String, Integer> byParamIndexMap) {
		
		if (resolvedParameter.getParameter().isDataParam())
			createData((InOutParameter) resolvedParameter.getParameter(), indexMap, byParamIndexMap);
		
		if (resolvedParameter.getChildParams() != null)
		{
			Iterator<Entry<String, EList<ResolvedParam>>> it = resolvedParameter.getChildParams().iterator();
			//for (EList<ResolvedParam> childParams : resolvedParameter.getChildParams().values())
			while (it.hasNext())
			{
				Entry<String, EList<ResolvedParam>> e = it.next();
				Iterator<ResolvedParam> it2 = e.getValue().iterator();
				while (it2.hasNext())
				//for (ResolvedParam resolvedChildParam : childParams)
					createData(it2.next(), indexMap, byParamIndexMap);
			}
		}
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
			getLogMessage().setCategory(Category.TOOL_DEFINITION);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isAllowedConversion(DataPort dataPort, String groupingStrFrom, String groupingStrTo) throws DataPortNotFoundException {
		
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			InOutParameter p = (InOutParameter) matchingData.getParameter();
			return p.isAllowedConversion(groupingStrFrom, groupingStrTo);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String renderToString() {
		return getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean omitPrefixIfNoArgKey() {
		
		return GlobalConfig.omitPrefixIfNoArgKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getCmdPartDelimiter() {
		if (getCommand().getCmdPartDelimiter() != null)
			return getCommand().getCmdPartDelimiter();
		else
			return GlobalConfig.getCmdPartDelimiter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getInterpreter() {
		
		ResolvedParam param = getPackage() != null ? getPackage().getInterpreter() : null;
		Iterator<Entry<String, ResolvedParam>> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			if (GlobalConstants.COMMAND_PART_VALUE_INTERPRETER.equals(e.getValue().getParameter().getCmdPart()))
				param = e.getValue();
		}
		return param;
	}
	
	private Data getDataForDataPort(DataPort dataPort)
	{
		//EList<Data> dataList = getData().get(dataPort.getName());
		//boolean found = false;
		for (EList<Data> data : getData().values())
		{
			for (Data d : data)
			{
				if (d.getPort().isCompatible(dataPort))
				{
					return d;
				}
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws DataPortNotFoundException 
	 * @generated not
	 */
	public boolean canProvideMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException {
		
		if (dataPort == null)
			throw new DataPortNotFoundException();
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			if (isRoot())
				return GlobalConfig.getMultipleDataportsForRootTaskValue();
			Parameter p = matchingData.getParameter();
			return p.isMultiple(GlobalConfig.getMultipleDataportsDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProvideMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException {
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			if (isRoot())
				return GlobalConfig.getMultipleInstancesForRootTaskValue();
			Parameter p = matchingData.getParameter();
			return p.isMultipleInstances(GlobalConfig.getMultipleInstancesDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProvideMultipleInstancesPerDataportFor(DataPort dataPort) throws DataPortNotFoundException {
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			if (isRoot())
				return GlobalConfig.getMultipleInstancesForRootTaskValue();
			Parameter p = matchingData.getParameter();
			return p.isMultipleInstancesPerDataport(GlobalConfig.getMultipleInstancesPerDataportDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException {
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			Parameter p = matchingData.getParameter();
			return p.isMultiple(GlobalConfig.getMultipleDataportsDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInstancesPerDataportFor(DataPort dataPort) throws DataPortNotFoundException {
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			Parameter p = matchingData.getParameter();
			return p.isMultipleInstances(GlobalConfig.getMultipleInstancesPerDataportDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canProcessMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException {
		Data matchingData = getDataForDataPort(dataPort);
		if (matchingData == null || matchingData.getPort() == null)
			throw new DataPortNotFoundException();
		else 
		{
			Parameter p = matchingData.getParameter();
			return p.isMultipleInstancesPerDataport(GlobalConfig.getMultipleInstancesPerDataportDefaultValue());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI resolvePath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.TOOL__EXECUTABLES:
				return ((InternalEList<?>)getExecutables()).basicRemove(otherEnd, msgs);
			case ToolPackage.TOOL__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case ToolPackage.TOOL__RESOLVED_PARAMS:
				return ((InternalEList<?>)getResolvedParams()).basicRemove(otherEnd, msgs);
			case ToolPackage.TOOL__RESOLVE_URI_MAP:
				return ((InternalEList<?>)getResolveUriMap()).basicRemove(otherEnd, msgs);
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
			case ToolPackage.TOOL__NAME:
				return getName();
			case ToolPackage.TOOL__DESCRIPTION:
				return getDescription();
			case ToolPackage.TOOL__LOGGER:
				return getLogger();
			case ToolPackage.TOOL__ID:
				return getId();
			case ToolPackage.TOOL__VERSION:
				return getVersion();
			case ToolPackage.TOOL__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ToolPackage.TOOL__REQUIREMENTS:
				return getRequirements();
			case ToolPackage.TOOL__EXECUTABLES:
				if (coreType) return getExecutables();
				else return getExecutables().map();
			case ToolPackage.TOOL__DATA:
				if (coreType) return getData();
				else return getData().map();
			case ToolPackage.TOOL__FILENAME_PREFIX:
				return getFilenamePrefix();
			case ToolPackage.TOOL__ANALYSIS_TYPE:
				return getAnalysisType();
			case ToolPackage.TOOL__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case ToolPackage.TOOL__RESOLVED_PARAMS:
				if (coreType) return getResolvedParams();
				else return getResolvedParams().map();
			case ToolPackage.TOOL__ROOT:
				return isRoot();
			case ToolPackage.TOOL__RESOLVE_URI_MAP:
				if (coreType) return getResolveUriMap();
				else return getResolveUriMap().map();
			case ToolPackage.TOOL__LOG_MESSAGE:
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
			case ToolPackage.TOOL__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.TOOL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.TOOL__ID:
				setId((String)newValue);
				return;
			case ToolPackage.TOOL__VERSION:
				setVersion((String)newValue);
				return;
			case ToolPackage.TOOL__PACKAGE:
				setPackage((easyflow.tool.Package)newValue);
				return;
			case ToolPackage.TOOL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ToolPackage.TOOL__EXECUTABLES:
				((EStructuralFeature.Setting)getExecutables()).set(newValue);
				return;
			case ToolPackage.TOOL__DATA:
				((EStructuralFeature.Setting)getData()).set(newValue);
				return;
			case ToolPackage.TOOL__FILENAME_PREFIX:
				setFilenamePrefix((String)newValue);
				return;
			case ToolPackage.TOOL__ANALYSIS_TYPE:
				setAnalysisType((String)newValue);
				return;
			case ToolPackage.TOOL__COMMAND:
				setCommand((Command)newValue);
				return;
			case ToolPackage.TOOL__RESOLVED_PARAMS:
				((EStructuralFeature.Setting)getResolvedParams()).set(newValue);
				return;
			case ToolPackage.TOOL__ROOT:
				setRoot((Boolean)newValue);
				return;
			case ToolPackage.TOOL__RESOLVE_URI_MAP:
				((EStructuralFeature.Setting)getResolveUriMap()).set(newValue);
				return;
			case ToolPackage.TOOL__LOG_MESSAGE:
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
			case ToolPackage.TOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.TOOL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.TOOL__ID:
				setId(ID_EDEFAULT);
				return;
			case ToolPackage.TOOL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ToolPackage.TOOL__PACKAGE:
				setPackage((easyflow.tool.Package)null);
				return;
			case ToolPackage.TOOL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ToolPackage.TOOL__EXECUTABLES:
				getExecutables().clear();
				return;
			case ToolPackage.TOOL__DATA:
				getData().clear();
				return;
			case ToolPackage.TOOL__FILENAME_PREFIX:
				setFilenamePrefix(FILENAME_PREFIX_EDEFAULT);
				return;
			case ToolPackage.TOOL__ANALYSIS_TYPE:
				setAnalysisType(ANALYSIS_TYPE_EDEFAULT);
				return;
			case ToolPackage.TOOL__COMMAND:
				setCommand((Command)null);
				return;
			case ToolPackage.TOOL__RESOLVED_PARAMS:
				getResolvedParams().clear();
				return;
			case ToolPackage.TOOL__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case ToolPackage.TOOL__RESOLVE_URI_MAP:
				getResolveUriMap().clear();
				return;
			case ToolPackage.TOOL__LOG_MESSAGE:
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
			case ToolPackage.TOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.TOOL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.TOOL__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ToolPackage.TOOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToolPackage.TOOL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ToolPackage.TOOL__PACKAGE:
				return package_ != null;
			case ToolPackage.TOOL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ToolPackage.TOOL__EXECUTABLES:
				return executables != null && !executables.isEmpty();
			case ToolPackage.TOOL__DATA:
				return data != null && !data.isEmpty();
			case ToolPackage.TOOL__FILENAME_PREFIX:
				return FILENAME_PREFIX_EDEFAULT == null ? filenamePrefix != null : !FILENAME_PREFIX_EDEFAULT.equals(filenamePrefix);
			case ToolPackage.TOOL__ANALYSIS_TYPE:
				return ANALYSIS_TYPE_EDEFAULT == null ? analysisType != null : !ANALYSIS_TYPE_EDEFAULT.equals(analysisType);
			case ToolPackage.TOOL__COMMAND:
				return command != null;
			case ToolPackage.TOOL__RESOLVED_PARAMS:
				return resolvedParams != null && !resolvedParams.isEmpty();
			case ToolPackage.TOOL__ROOT:
				return root != ROOT_EDEFAULT;
			case ToolPackage.TOOL__RESOLVE_URI_MAP:
				return resolveUriMap != null && !resolveUriMap.isEmpty();
			case ToolPackage.TOOL__LOG_MESSAGE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultToolElement.class) {
			switch (derivedFeatureID) {
				case ToolPackage.TOOL__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.TOOL__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultToolElement.class) {
			switch (baseFeatureID) {
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.TOOL__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.TOOL__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case ToolPackage.TOOL___WRITE_MODEL_TO_XML:
				writeModelToXML();
				return null;
			case ToolPackage.TOOL___CAN_FILTER_INSTANCES_FOR__DATAPORT:
				try {
					return canFilterInstancesFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___REQUIRES_GROUPING__STRING_DATAPORT:
				return requiresGrouping((String)arguments.get(0), (DataPort)arguments.get(1));
			case ToolPackage.TOOL___PROVIDES_GROUPING__STRING_DATAPORT:
				return providesGrouping((String)arguments.get(0), (DataPort)arguments.get(1));
			case ToolPackage.TOOL___GET_GROUPINGS_FOR_INPUT_PORT__DATAPORT_BOOLEAN:
				return getGroupingsForInputPort((DataPort)arguments.get(0), (Boolean)arguments.get(1));
			case ToolPackage.TOOL___GET_GROUPINGS_FOR_OUTPUT_PORT__DATAPORT_BOOLEAN:
				return getGroupingsForOutputPort((DataPort)arguments.get(0), (Boolean)arguments.get(1));
			case ToolPackage.TOOL___GET_ANALYSIS_TYPE_OF_PACKAGE__ELIST:
				return getAnalysisTypeOfPackage((EList<TraversalChunk>)arguments.get(0));
			case ToolPackage.TOOL___GET_TEMPLATE_PARAMETER__PARAMETER:
				return getTemplateParameter((Parameter)arguments.get(0));
			case ToolPackage.TOOL___GET_TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case ToolPackage.TOOL___GET_MATCHING_PARAMETER__ELIST_PARAMETER:
				return getMatchingParameter((EList<Parameter>)arguments.get(0), (Parameter)arguments.get(1));
			case ToolPackage.TOOL___GET_MATCHING_PARAMETER_BY_NAME__ELIST_PARAMETER:
				return getMatchingParameterByName((EList<Parameter>)arguments.get(0), (Parameter)arguments.get(1));
			case ToolPackage.TOOL___ASSUME_DATA_PARAM_POSITIONAL:
				return assumeDataParamPositional();
			case ToolPackage.TOOL___OMIT_PREFIX_IF_NO_ARG_KEY:
				return omitPrefixIfNoArgKey();
			case ToolPackage.TOOL___GET_CMD_PART_DELIMITER:
				return getCmdPartDelimiter();
			case ToolPackage.TOOL___GET_INTERPRETER_PARAMS:
				return getInterpreterParams();
			case ToolPackage.TOOL___GET_EXE:
				return getExe();
			case ToolPackage.TOOL___GET_MODULE_PARAMS:
				return getModuleParams();
			case ToolPackage.TOOL___GET_INTERPRETER:
				return getInterpreter();
			case ToolPackage.TOOL___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__DATAPORT:
				try {
					return canProvideMultipleInputsFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__DATAPORT:
				try {
					return canProvideMultipleInstancesFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT:
				try {
					return canProvideMultipleInstancesPerDataportFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___CAN_PROCESS_MULTIPLE_INPUTS_FOR__DATAPORT:
				try {
					return canProcessMultipleInputsFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__DATAPORT:
				try {
					return canProcessMultipleInstancesPerDataportFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__DATAPORT:
				try {
					return canProcessMultipleInstancesFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___RESOLVE_PATH:
				return resolvePath();
			case ToolPackage.TOOL___ASSUME_PARAM_POSITIONAL:
				return assumeParamPositional();
			case ToolPackage.TOOL___CREATE_DATA__INOUTPARAMETER_EMAP_EMAP:
				createData((InOutParameter)arguments.get(0), (EMap<String, Integer>)arguments.get(1), (EMap<String, Integer>)arguments.get(2));
				return null;
			case ToolPackage.TOOL___CREATE_DATA__RESOLVEDPARAM_EMAP_EMAP:
				createData((ResolvedParam)arguments.get(0), (EMap<String, Integer>)arguments.get(1), (EMap<String, Integer>)arguments.get(2));
				return null;
			case ToolPackage.TOOL___INIT_LOG_MESSAGE:
				initLogMessage();
				return null;
			case ToolPackage.TOOL___IS_ALLOWED_CONVERSION__DATAPORT_STRING_STRING:
				try {
					return isAllowedConversion((DataPort)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ToolPackage.TOOL___RENDER_TO_STRING:
				return renderToString();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", logger: ");
		result.append(logger);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", filenamePrefix: ");
		result.append(filenamePrefix);
		result.append(", analysisType: ");
		result.append(analysisType);
		result.append(", root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
