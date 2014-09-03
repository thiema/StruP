/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.BaseCommand;
import java.util.Iterator;
import java.util.Map.Entry;
import easyflow.custom.util.GlobalConstants;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.tool.ToolPackage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToResolvedParamMapImpl;
import easyflow.util.maps.impl.StringToURIMapImpl;
import java.net.URI;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getCommandPattern <em>Command Pattern</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getTemplateParams <em>Template Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getResolvedParams <em>Resolved Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link easyflow.tool.impl.PackageImpl#getResolveUriMap <em>Resolve Uri Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements easyflow.tool.Package {
	
	Logger logger = Logger.getLogger(Package.class);
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
	 * The cached value of the '{@link #getResolvedParams() <em>Resolved Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedParam> resolvedParams;
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
	 * The cached value of the '{@link #getResolveUriMap() <em>Resolve Uri Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveUriMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, URI> resolveUriMap;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__COMMAND_PATTERN, oldCommandPattern, commandPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getTemplateParams() {
		if (templateParams == null) {
			templateParams = new EObjectResolvingEList<Parameter>(Parameter.class, this, ToolPackage.PACKAGE__TEMPLATE_PARAMS);
		}
		return templateParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResolvedParam> getResolvedParams() {
		if (resolvedParams == null) {
			resolvedParams = new EObjectResolvingEList<ResolvedParam>(ResolvedParam.class, this, ToolPackage.PACKAGE__RESOLVED_PARAMS);
		}
		return resolvedParams;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, URI> getResolveUriMap() {
		if (resolveUriMap == null) {
			resolveUriMap = new EcoreEMap<String,URI>(MapsPackage.Literals.STRING_TO_URI_MAP, StringToURIMapImpl.class, this, ToolPackage.PACKAGE__RESOLVE_URI_MAP);
		}
		return resolveUriMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<ResolvedParam> getInterpreterParams() {

		EList<ResolvedParam> paramList = new BasicEList<ResolvedParam>();
		Iterator<ResolvedParam> it = getResolvedParams().iterator();
		while (it.hasNext())
		{
			ResolvedParam e = it.next();
			if (GlobalConstants.COMMAND_PART_VALUE_INTERPRETER_PARAM.equals(e.getParameter().getCmdPart()))
				paramList.add(e);
		}
		return paramList;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam getInterpreter() {
		
		for (ResolvedParam resolvedParam : getResolvedParams())
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
		
		for (ResolvedParam resolvedParam : getResolvedParams())
			if (GlobalConstants.COMMAND_PART_VALUE_EXE.equals(resolvedParam.getParameter().getCmdPart()))
				return resolvedParam;
		return null; 
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL, oldAssumeDataParamPositional, assumeDataParamPositional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PACKAGE__CMD_PART_DELIMITER, oldCmdPartDelimiter, cmdPartDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.PACKAGE__RESOLVE_URI_MAP:
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
			case ToolPackage.PACKAGE__NAME:
				return getName();
			case ToolPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case ToolPackage.PACKAGE__COMMAND_PATTERN:
				return getCommandPattern();
			case ToolPackage.PACKAGE__TEMPLATE_PARAMS:
				return getTemplateParams();
			case ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL:
				return getAssumeDataParamPositional();
			case ToolPackage.PACKAGE__CMD_PART_DELIMITER:
				return getCmdPartDelimiter();
			case ToolPackage.PACKAGE__RESOLVED_PARAMS:
				return getResolvedParams();
			case ToolPackage.PACKAGE__ID:
				return getId();
			case ToolPackage.PACKAGE__VERSION:
				return getVersion();
			case ToolPackage.PACKAGE__RESOLVE_URI_MAP:
				if (coreType) return getResolveUriMap();
				else return getResolveUriMap().map();
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
			case ToolPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.PACKAGE__COMMAND_PATTERN:
				setCommandPattern((String)newValue);
				return;
			case ToolPackage.PACKAGE__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				getTemplateParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional((Boolean)newValue);
				return;
			case ToolPackage.PACKAGE__CMD_PART_DELIMITER:
				setCmdPartDelimiter((String)newValue);
				return;
			case ToolPackage.PACKAGE__RESOLVED_PARAMS:
				getResolvedParams().clear();
				getResolvedParams().addAll((Collection<? extends ResolvedParam>)newValue);
				return;
			case ToolPackage.PACKAGE__ID:
				setId((String)newValue);
				return;
			case ToolPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case ToolPackage.PACKAGE__RESOLVE_URI_MAP:
				((EStructuralFeature.Setting)getResolveUriMap()).set(newValue);
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
			case ToolPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__COMMAND_PATTERN:
				setCommandPattern(COMMAND_PATTERN_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				return;
			case ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional(ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__CMD_PART_DELIMITER:
				setCmdPartDelimiter(CMD_PART_DELIMITER_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__RESOLVED_PARAMS:
				getResolvedParams().clear();
				return;
			case ToolPackage.PACKAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ToolPackage.PACKAGE__RESOLVE_URI_MAP:
				getResolveUriMap().clear();
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
			case ToolPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.PACKAGE__COMMAND_PATTERN:
				return COMMAND_PATTERN_EDEFAULT == null ? commandPattern != null : !COMMAND_PATTERN_EDEFAULT.equals(commandPattern);
			case ToolPackage.PACKAGE__TEMPLATE_PARAMS:
				return templateParams != null && !templateParams.isEmpty();
			case ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL:
				return ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT == null ? assumeDataParamPositional != null : !ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT.equals(assumeDataParamPositional);
			case ToolPackage.PACKAGE__CMD_PART_DELIMITER:
				return CMD_PART_DELIMITER_EDEFAULT == null ? cmdPartDelimiter != null : !CMD_PART_DELIMITER_EDEFAULT.equals(cmdPartDelimiter);
			case ToolPackage.PACKAGE__RESOLVED_PARAMS:
				return resolvedParams != null && !resolvedParams.isEmpty();
			case ToolPackage.PACKAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToolPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ToolPackage.PACKAGE__RESOLVE_URI_MAP:
				return resolveUriMap != null && !resolveUriMap.isEmpty();
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
				case ToolPackage.PACKAGE__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.PACKAGE__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == BaseCommand.class) {
			switch (derivedFeatureID) {
				case ToolPackage.PACKAGE__COMMAND_PATTERN: return ToolPackage.BASE_COMMAND__COMMAND_PATTERN;
				case ToolPackage.PACKAGE__TEMPLATE_PARAMS: return ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS;
				case ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL: return ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL;
				case ToolPackage.PACKAGE__CMD_PART_DELIMITER: return ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER;
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
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.PACKAGE__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.PACKAGE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == BaseCommand.class) {
			switch (baseFeatureID) {
				case ToolPackage.BASE_COMMAND__COMMAND_PATTERN: return ToolPackage.PACKAGE__COMMAND_PATTERN;
				case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS: return ToolPackage.PACKAGE__TEMPLATE_PARAMS;
				case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL: return ToolPackage.PACKAGE__ASSUME_DATA_PARAM_POSITIONAL;
				case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER: return ToolPackage.PACKAGE__CMD_PART_DELIMITER;
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
		result.append(", cmdPartDelimiter: ");
		result.append(cmdPartDelimiter);
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
