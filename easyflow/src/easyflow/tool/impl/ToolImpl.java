/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.data.Data;
import easyflow.data.DataPort;
import easyflow.tool.Command;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.Interpreter;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
import easyflow.tool.Tool;
import easyflow.tool.ToolPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataListMapImpl;
import easyflow.util.maps.impl.StringToURIMapImpl;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
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
 *   <li>{@link easyflow.tool.impl.ToolImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getExecutables <em>Executables</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getFilenamePrefix <em>Filename Prefix</em>}</li>
 *   <li>{@link easyflow.tool.impl.ToolImpl#getAnalysisType <em>Analysis Type</em>}</li>
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
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected Interpreter interpreter;

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
	public Interpreter getInterpreter() {
		if (interpreter != null && interpreter.eIsProxy()) {
			InternalEObject oldInterpreter = (InternalEObject)interpreter;
			interpreter = (Interpreter)eResolveProxy(oldInterpreter);
			if (interpreter != oldInterpreter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.TOOL__INTERPRETER, oldInterpreter, interpreter));
			}
		}
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpreter basicGetInterpreter() {
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpreter(Interpreter newInterpreter) {
		Interpreter oldInterpreter = interpreter;
		interpreter = newInterpreter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__INTERPRETER, oldInterpreter, interpreter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__COMMAND, oldCommand, newCommand);
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
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToolPackage.TOOL__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToolPackage.TOOL__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.TOOL__COMMAND, newCommand, newCommand));
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
	public boolean canProcessMultiplesInstancesFor(DataPort dataPort) throws DataPortNotFoundException {
		Data data = getData().get(dataPort.getName());
		if (data==null)
			throw new DataPortNotFoundException();
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean canFilterInstancesFor(DataPort dataPort) throws DataPortNotFoundException {
		Data data = getData().get(dataPort.getName());
		if (data==null)
			throw new DataPortNotFoundException();
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean requiresGrouping(String groupingCriterion, DataPort dataPort) {
		for (Entry<String, Data> e:getData().entrySet())
			if (!e.getValue().isOutput() && e.getValue().getPort().isCompatible(dataPort))
				return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean providesGrouping(String groupingCriterion, DataPort dataPort) {
		for (Entry<String, Data> e:getData().entrySet())
			if (e.getValue().isOutput() && e.getValue().getPort().isCompatible(dataPort))
				return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getGroupingsForInputPort(DataPort dataPort, boolean isRequired) {
		EList<String> groupings=new BasicEList<String>();
		for (Entry<String, Data> e:getData().entrySet())
			if (!e.getValue().isOutput())
				if (dataPort.isCompatible(e.getValue().getPort()))
					groupings.addAll(getCommand().getGroupingsForDataPort(dataPort, true));
		
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getGroupingsForOutputPort(DataPort dataPort, boolean isRequired) {
		EList<String> groupings=new BasicEList<String>();
		for (Entry<String, Data> e:getData().entrySet())
			if (e.getValue().isOutput())
				if (dataPort.isCompatible(e.getValue().getPort()))
					groupings.addAll(getCommand().getGroupingsForDataPort(dataPort, true));
				
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * return 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getAnalysisTypeOfPackage(EList<TraversalChunk> records) {
		
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
			for (Parameter parameter : getPackage().getParameters().values())
			{
				if (parameter.isAnalysisType())
				{
					String matchByNameStr = null;
					String matchByCondStr = null;
					logger.debug("getAnalysisTypeOfPackage(): "+"tool="+getId()+"/"+getName());
					for (OptionValue optionValue:parameter.getOptionValues())
					{
						logger.debug("getAnalysisTypeOfPackage(): check option="+optionValue.getName()+" "+optionValue.getCondition());
						if (getAnalysisType()!=null && optionValue.getName().equals(getAnalysisType()))
							matchByNameStr = getAnalysisType();
						else if (optionValue.getName().equals(getId()))
							matchByNameStr = getId();
						else if (optionValue.getName().equals(getName()))
							matchByNameStr = getName();
							
						else if (optionValue.getCondition()!=null)
						{
							Object evalObject = easyflow.custom.util.Util.evaluateJexl(
									easyflow.custom.util.Util.createMetaDataMapForJexl(
											records), optionValue.getCondition());
							if (evalObject instanceof Boolean) {
								if (((Boolean) evalObject).booleanValue())
								{
									matchByCondStr = optionValue.getName();
								}
							}
						}
					}
					if (matchByNameStr != null)
						return matchByNameStr;
					else if (matchByCondStr != null)
						return matchByCondStr;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDataForParam(Parameter parameter, Map.Entry<String, String> constraints) {
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
			case ToolPackage.TOOL__COMMAND:
				return basicSetCommand(null, msgs);
			case ToolPackage.TOOL__EXECUTABLES:
				return ((InternalEList<?>)getExecutables()).basicRemove(otherEnd, msgs);
			case ToolPackage.TOOL__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ToolPackage.TOOL__INTERPRETER:
				if (resolve) return getInterpreter();
				return basicGetInterpreter();
			case ToolPackage.TOOL__COMMAND:
				return getCommand();
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
			case ToolPackage.TOOL__INTERPRETER:
				setInterpreter((Interpreter)newValue);
				return;
			case ToolPackage.TOOL__COMMAND:
				setCommand((Command)newValue);
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
			case ToolPackage.TOOL__INTERPRETER:
				setInterpreter((Interpreter)null);
				return;
			case ToolPackage.TOOL__COMMAND:
				setCommand((Command)null);
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
			case ToolPackage.TOOL__INTERPRETER:
				return interpreter != null;
			case ToolPackage.TOOL__COMMAND:
				return command != null;
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
			case ToolPackage.TOOL___CAN_PROCESS_MULTIPLES_INSTANCES_FOR__DATAPORT:
				try {
					return canProcessMultiplesInstancesFor((DataPort)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
			case ToolPackage.TOOL___GET_DATA_FOR_PARAM__PARAMETER_EMAP:
				return getDataForParam((Parameter)arguments.get(0), (Map.Entry<String, String>)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //ToolImpl
