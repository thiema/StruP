/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.ui.GlobalConfig;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.ToolPackage;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolvedParamImpl extends DefaultToolElementImpl implements ResolvedParam {
	
	protected static final Logger logger = Logger.getLogger(ResolvedParam.class);
	
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolvedParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.RESOLVED_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.RESOLVED_PARAM__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<Object>(Object.class, this, ToolPackage.RESOLVED_PARAM__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * to generate the prefix:
	 * 1.) use parameter definition
	 * 2.) use template definition (template param)
	 * 3.) use default (from configuration)
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	
	
	public EList<String> generateCommandString(EMap<String, Object> constraints, Parameter templateParam)
	{
		ResolvedParam p = this;
		EList<String> res = getParameter().generateCommandString(constraints, getValue(), templateParam);
		return res;
		//return getParameter().generateCommandString(constraints, getValue(), templateParam);
	}
/*	
	public String generateCommandString1(EMap<String, Object> constraints, Parameter templateParam) {

		String cmd = "";
		
		Boolean defaultIsNamed           = templateParam != null ? templateParam.getNamed()                 : null;
		String  defaultPrefix            = templateParam != null ? templateParam.getPrefix(null)            : null;
		
		String  defaultArgDelimiter      = templateParam != null ? templateParam.getArgDelimiter
																		(null, templateParam.getNamed())    : null;
		String  defaultArgValueDelimiter = templateParam != null ? templateParam.getArgValueDelimiter(null) : null;
		boolean omitPrefixIfNoArgKey     = (Boolean) (constraints != null && constraints.containsKey(GlobalConfig.CONFIG_TOOL_OMIT_PREFIX_IF_NO_ARG_KEY) ?
				constraints.get(GlobalConfig.CONFIG_TOOL_OMIT_PREFIX_IF_NO_ARG_KEY) : GlobalConfig.omitPrefixIfNoArgKey());
		
		ResolvedParam p = this;
		
		String  argKey = "";
		if ((getName() == null || getName().equals("")) && omitPrefixIfNoArgKey)
			;
		else
			argKey = getParameter().getArgKey(defaultPrefix, defaultIsNamed);
		
		if (argKey != null && !argKey.equals(""))
			cmd+=argKey + getParameter().getArgDelimiter(defaultArgDelimiter, defaultIsNamed);
		else if (templateParam != null)
		{
			argKey = templateParam.getArgKey(defaultPrefix, defaultIsNamed);
			if (argKey != null && !argKey.equals(""))
				cmd+=argKey + templateParam.getArgDelimiter(defaultArgDelimiter, defaultIsNamed);
		}
		
		if (constraints != null && constraints.containsKey("value"))
			// if (constraints.get("value") )
			cmd += constraints.get("value");
		else if (!getArgValue().isEmpty())
			cmd += StringUtils.join(getArgValue(), getParameter().getArgValueDelimiter(defaultArgValueDelimiter));
		else
		{
			cmd = "";
			logger.error("generateCommandString(): no argument set.");
		}
			

		return cmd;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getArgValue() {
		
		Iterator<Object> it = getValue().iterator();
		EList<String> values = new BasicEList<String>();
		int i=0;
		while (it.hasNext())
		{
			Object v=it.next();
			if (v instanceof String)
			//logger.debug(v.getClass().getCanonicalName());
			//if (v.getClass().getCanonicalName().endsWith("java.lang.String"))
				values.add((String) v);
			else if (v instanceof URI)
				values.add(((URI)v).getPath());
		}
		if (i==0 && getParameter().getDefaultValue() != null 
				&& !getParameter().getDefaultValue().equals("")
				&& GlobalConfig.useDefaultValue())
			value.add(getParameter().getDefaultValue());
		
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case ToolPackage.RESOLVED_PARAM__VALUE:
				return getValue();
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
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Object>)newValue);
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
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				setParameter((Parameter)null);
				return;
			case ToolPackage.RESOLVED_PARAM__VALUE:
				getValue().clear();
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
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				return parameter != null;
			case ToolPackage.RESOLVED_PARAM__VALUE:
				return value != null && !value.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ResolvedParamImpl
