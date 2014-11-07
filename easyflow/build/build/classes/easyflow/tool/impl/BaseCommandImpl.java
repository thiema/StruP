/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.BaseCommand;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.BaseCommandImpl#getCommandPattern <em>Command Pattern</em>}</li>
 *   <li>{@link easyflow.tool.impl.BaseCommandImpl#getTemplateParams <em>Template Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.BaseCommandImpl#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.BaseCommandImpl#getAssumeParamPositional <em>Assume Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.BaseCommandImpl#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseCommandImpl extends EObjectImpl implements BaseCommand {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.BASE_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.BASE_COMMAND__COMMAND_PATTERN, oldCommandPattern, commandPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getTemplateParams() {
		if (templateParams == null) {
			templateParams = new EObjectResolvingEList<Parameter>(Parameter.class, this, ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS);
		}
		return templateParams;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL, oldAssumeDataParamPositional, assumeDataParamPositional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL, oldAssumeParamPositional, assumeParamPositional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER, oldCmdPartDelimiter, cmdPartDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.BASE_COMMAND__COMMAND_PATTERN:
				return getCommandPattern();
			case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS:
				return getTemplateParams();
			case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				return getAssumeDataParamPositional();
			case ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL:
				return getAssumeParamPositional();
			case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER:
				return getCmdPartDelimiter();
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
			case ToolPackage.BASE_COMMAND__COMMAND_PATTERN:
				setCommandPattern((String)newValue);
				return;
			case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				getTemplateParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional((Boolean)newValue);
				return;
			case ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL:
				setAssumeParamPositional((Boolean)newValue);
				return;
			case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER:
				setCmdPartDelimiter((String)newValue);
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
			case ToolPackage.BASE_COMMAND__COMMAND_PATTERN:
				setCommandPattern(COMMAND_PATTERN_EDEFAULT);
				return;
			case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS:
				getTemplateParams().clear();
				return;
			case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				setAssumeDataParamPositional(ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL:
				setAssumeParamPositional(ASSUME_PARAM_POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER:
				setCmdPartDelimiter(CMD_PART_DELIMITER_EDEFAULT);
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
			case ToolPackage.BASE_COMMAND__COMMAND_PATTERN:
				return COMMAND_PATTERN_EDEFAULT == null ? commandPattern != null : !COMMAND_PATTERN_EDEFAULT.equals(commandPattern);
			case ToolPackage.BASE_COMMAND__TEMPLATE_PARAMS:
				return templateParams != null && !templateParams.isEmpty();
			case ToolPackage.BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL:
				return ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT == null ? assumeDataParamPositional != null : !ASSUME_DATA_PARAM_POSITIONAL_EDEFAULT.equals(assumeDataParamPositional);
			case ToolPackage.BASE_COMMAND__ASSUME_PARAM_POSITIONAL:
				return ASSUME_PARAM_POSITIONAL_EDEFAULT == null ? assumeParamPositional != null : !ASSUME_PARAM_POSITIONAL_EDEFAULT.equals(assumeParamPositional);
			case ToolPackage.BASE_COMMAND__CMD_PART_DELIMITER:
				return CMD_PART_DELIMITER_EDEFAULT == null ? cmdPartDelimiter != null : !CMD_PART_DELIMITER_EDEFAULT.equals(cmdPartDelimiter);
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
		result.append(" (commandPattern: ");
		result.append(commandPattern);
		result.append(", assumeDataParamPositional: ");
		result.append(assumeDataParamPositional);
		result.append(", assumeParamPositional: ");
		result.append(assumeParamPositional);
		result.append(", cmdPartDelimiter: ");
		result.append(cmdPartDelimiter);
		result.append(')');
		return result.toString();
	}

} //BaseCommandImpl
