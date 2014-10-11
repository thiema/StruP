/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.BaseCommand;
import easyflow.custom.util.GlobalConstants;
import easyflow.data.DataPort;

import java.util.Map.Entry;
import easyflow.tool.Command;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.ToolPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToResolvedParamMapImpl;
import java.util.Collection;
import java.util.Iterator;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getCommandPattern <em>Command Pattern</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getTemplateParams <em>Template Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getAssumeParamPositional <em>Assume Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#isExecutable <em>Executable</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.impl.CommandImpl#getResolvedParams <em>Resolved Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends EObjectImpl implements Command {
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
	 * The default value of the '{@link #getCommandPattern() <em>Command Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandPattern() <em>Command Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPattern()
	 * @generated
	 * @ordered
	 */
	protected String commandPattern = COMMAND_PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateParams() <em>Template Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> templateParams;

	/**
	 * The default value of the '{@link #getAssumeDataParamPositional() <em>Assume Data Param Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeDataParamPositional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumeDataParamPositional() <em>Assume Data Param Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeDataParamPositional()
	 * @generated
	 * @ordered
	 */
	protected Boolean assumeDataParamPositional = ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssumeParamPositional() <em>Assume Param Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeParamPositional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSUME_PARAM_POSITIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumeParamPositional() <em>Assume Param Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumeParamPositional()
	 * @generated
	 * @ordered
	 */
	protected Boolean assumeParamPositional = ASSUME_PARAM_POSITIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCmdPartDelimiter() <em>Cmd Part Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdPartDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_PART_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmdPartDelimiter() <em>Cmd Part Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdPartDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String cmdPartDelimiter = CMD_PART_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean executable = EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Command.class);

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
	 * The cached value of the '{@link #getResolvedParams() <em>Resolved Params</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedParams()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ResolvedParam> resolvedParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandPattern() {
		return commandPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandPattern(String newCommandPattern) {
		String oldCommandPattern = commandPattern;
		commandPattern = newCommandPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__COMMAND_PATTERN, oldCommandPattern, commandPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getTemplateParams() {
		if (templateParams == null) {
			templateParams = new EObjectResolvingEList<Parameter>(Parameter.class, this, ToolPackage.COMMAND__TEMPLATE_PARAMS);
		}
		return templateParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(boolean newExecutable) {
		boolean oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__EXECUTABLE, oldExecutable, executable));
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
	public EMap<String, ResolvedParam> getResolvedParams() {
		if (resolvedParams == null) {
			resolvedParams = new EcoreEMap<String,ResolvedParam>(MapsPackage.Literals.STRING_TO_RESOLVED_PARAM_MAP, StringToResolvedParamMapImpl.class, this, ToolPackage.COMMAND__RESOLVED_PARAMS);
		}
		return resolvedParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAssumeDataParamPositional() {
		return assumeDataParamPositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumeDataParamPositional(Boolean newAssumeDataParamPositional) {
		Boolean oldAssumeDataParamPositional = assumeDataParamPositional;
		assumeDataParamPositional = newAssumeDataParamPositional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL, oldAssumeDataParamPositional, assumeDataParamPositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAssumeParamPositional() {
		return assumeParamPositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumeParamPositional(Boolean newAssumeParamPositional) {
		Boolean oldAssumeParamPositional = assumeParamPositional;
		assumeParamPositional = newAssumeParamPositional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL, oldAssumeParamPositional, assumeParamPositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCmdPartDelimiter() {
		return cmdPartDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdPartDelimiter(String newCmdPartDelimiter) {
		String oldCmdPartDelimiter = cmdPartDelimiter;
		cmdPartDelimiter = newCmdPartDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.COMMAND__CMD_PART_DELIMITER, oldCmdPartDelimiter, cmdPartDelimiter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getPositionalParameterNames() {
		
		EList<String> paramNames = new BasicEList<String>();
		
		for (Entry<String, ResolvedParam> e:getResolvedParams())
		{
			ResolvedParam parameter = e.getValue();
			if (parameter.getParameter().isPositional(null))
				if (!parameter.getValue().isEmpty())
					paramNames.add(e.getKey());
		}
		return paramNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getOptionalParameterNames() {

		EList<String> paramNames = new BasicEList<String>();
		for (Entry<String, ResolvedParam> e:getResolvedParams())
		{
			ResolvedParam parameter = e.getValue();
			if (parameter.getParameter().isOptional(null) && !parameter.getParameter().isPositional(null))
				if (!parameter.getValue().isEmpty())
					paramNames.add(e.getKey());
		}
		return paramNames;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getInterperter() {
		
		for (ResolvedParam resolvedParam:getResolvedParams().values())
			if (GlobalConstants.COMMAND_PART_VALUE_INTERPRETER.equals(resolvedParam.getParameter().getCmdPart()))
				return resolvedParam;
		return null; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getExe() {
		
		for (ResolvedParam resolvedParam:getResolvedParams().values())
			if (GlobalConstants.COMMAND_PART_VALUE_EXE.equals(resolvedParam.getParameter().getCmdPart()))
				return resolvedParam;
		return null;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveParameter(String paramName, EList<TraversalChunk> chunks) {
		boolean rc = false;
		
		logger.debug("resolveParameter(): trying to resolve param="+paramName+". Available param set="+getResolvedParams().keySet());
		if (getResolvedParams().containsKey(paramName))
		{
			ResolvedParam resolvedParam = getResolvedParams().get(paramName);
			resolvedParam.getValue().addAll(chunks);
			rc = true;
		}
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getDataParamForDataPort(DataPort dataPort, boolean isOutput) {
		
		Iterator<Entry<String, ResolvedParam>> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			Entry<String, ResolvedParam> e = it.next();
			
			if (e.getValue().getParameter().isDataParam())
			{
				InOutParameter ioParam = (InOutParameter) e.getValue().getParameter();
				if ((ioParam.isOutput() && isOutput) || (!ioParam.isOutput() && !isOutput))
				{
					if (ioParam.getDataPort() != null && ioParam.getDataPort().equals(dataPort.getName()))
						return e.getValue();
					else if (ioParam.getFormats() != null && dataPort.isCompatibleStr(ioParam.getFormats()))
						return e.getValue();
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.COMMAND__RESOLVED_PARAMS:
				return ((InternalEList<?>)getResolvedParams()).basicRemove(otherEnd, msgs);
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
			case ToolPackage.COMMAND__NAME:
				return getName();
			case ToolPackage.COMMAND__DESCRIPTION:
				return getDescription();
			case ToolPackage.COMMAND__COMMAND_PATTERN:
				return getCommandPattern();
			case ToolPackage.COMMAND__TEMPLATE_PARAMS:
				return getTemplateParams();
			case ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				return getAssumeDataParamPositional();
			case ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL:
				return getAssumeParamPositional();
			case ToolPackage.COMMAND__CMD_PART_DELIMITER:
				return getCmdPartDelimiter();
			case ToolPackage.COMMAND__EXECUTABLE:
				return isExecutable();
			case ToolPackage.COMMAND__LOGGER:
				return getLogger();
			case ToolPackage.COMMAND__RESOLVED_PARAMS:
				if (coreType) return getResolvedParams();
				else return getResolvedParams().map();
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
			case ToolPackage.COMMAND__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.COMMAND__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.COMMAND__COMMAND_PATTERN:
				setCommandPattern((String)newValue);
				return;
			case ToolPackage.COMMAND__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				getTemplateParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional((Boolean)newValue);
				return;
			case ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL:
				setAssumeParamPositional((Boolean)newValue);
				return;
			case ToolPackage.COMMAND__CMD_PART_DELIMITER:
				setCmdPartDelimiter((String)newValue);
				return;
			case ToolPackage.COMMAND__EXECUTABLE:
				setExecutable((Boolean)newValue);
				return;
			case ToolPackage.COMMAND__RESOLVED_PARAMS:
				((EStructuralFeature.Setting)getResolvedParams()).set(newValue);
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
			case ToolPackage.COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.COMMAND__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.COMMAND__COMMAND_PATTERN:
				setCommandPattern(COMMAND_PATTERN_EDEFAULT);
				return;
			case ToolPackage.COMMAND__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				return;
			case ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional(ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL:
				setAssumeParamPositional(ASSUME_PARAM_POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.COMMAND__CMD_PART_DELIMITER:
				setCmdPartDelimiter(CMD_PART_DELIMITER_EDEFAULT);
				return;
			case ToolPackage.COMMAND__EXECUTABLE:
				setExecutable(EXECUTABLE_EDEFAULT);
				return;
			case ToolPackage.COMMAND__RESOLVED_PARAMS:
				getResolvedParams().clear();
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
			case ToolPackage.COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.COMMAND__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.COMMAND__COMMAND_PATTERN:
				return COMMAND_PATTERN_EDEFAULT == null ? commandPattern != null : !COMMAND_PATTERN_EDEFAULT.equals(commandPattern);
			case ToolPackage.COMMAND__TEMPLATE_PARAMS:
				return templateParams != null && !templateParams.isEmpty();
			case ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				return ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT == null ? assumeDataParamPositional != null : !ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT.equals(assumeDataParamPositional);
			case ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL:
				return ASSUME_PARAM_POSITIONAL_EDEFAULT == null ? assumeParamPositional != null : !ASSUME_PARAM_POSITIONAL_EDEFAULT.equals(assumeParamPositional);
			case ToolPackage.COMMAND__CMD_PART_DELIMITER:
				return CMD_PART_DELIMITER_EDEFAULT == null ? cmdPartDelimiter != null : !CMD_PART_DELIMITER_EDEFAULT.equals(cmdPartDelimiter);
			case ToolPackage.COMMAND__EXECUTABLE:
				return executable != EXECUTABLE_EDEFAULT;
			case ToolPackage.COMMAND__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ToolPackage.COMMAND__RESOLVED_PARAMS:
				return resolvedParams != null && !resolvedParams.isEmpty();
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
				case ToolPackage.COMMAND__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.COMMAND__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == BaseCommand.class) {
			switch (derivedFeatureID) {
				case ToolPackage.COMMAND__COMMAND_PATTERN: return ToolPackage.BASE_COMMAND__COMMAND_PATTERN;
				case ToolPackage.COMMAND__TEMPLATE_PARAMS: return ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS;
				case ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL: return ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL;
				case ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL: return ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL;
				case ToolPackage.COMMAND__CMD_PART_DELIMITER: return ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER;
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
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.COMMAND__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.COMMAND__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == BaseCommand.class) {
			switch (baseFeatureID) {
				case ToolPackage.BASE_COMMAND__COMMAND_PATTERN: return ToolPackage.COMMAND__COMMAND_PATTERN;
				case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS: return ToolPackage.COMMAND__TEMPLATE_PARAMS;
				case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL: return ToolPackage.COMMAND__ASSUME_DATA_PARAM_POSITIONAL;
				case ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL: return ToolPackage.COMMAND__ASSUME_PARAM_POSITIONAL;
				case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER: return ToolPackage.COMMAND__CMD_PART_DELIMITER;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", commandPattern: ");
		result.append(commandPattern);
		result.append(", assumeDataParamPositional: ");
		result.append(assumeDataParamPositional);
		result.append(", assumeParamPositional: ");
		result.append(assumeParamPositional);
		result.append(", cmdPartDelimiter: ");
		result.append(cmdPartDelimiter);
		result.append(", executable: ");
		result.append(executable);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
