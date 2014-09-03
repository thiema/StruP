/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.ToolPackage;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getHandle <em>Handle</em>}</li>
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
	 * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected String handle = HANDLE_EDEFAULT;

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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandle(String newHandle) {
		String oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__HANDLE, oldHandle, handle));
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
		Parameter param = EcoreUtil.copy(getParameter());
		Parameter p = getParameter();
		if (GlobalConstants.NAME_FILE_HANDLE.equals(getHandle()))
			param.merge(getParameter().getValues().get(GlobalConstants.NAME_FILE_HANDLE).get(0));
		else if (GlobalConstants.NAME_PIPE_HANDLE.equals(getHandle()))
			param.merge(getParameter().getValues().get(GlobalConstants.NAME_PIPE_HANDLE).get(0));
		
		EList<String> res = param.generateCommandString(constraints, getValue(), templateParam);
		return res;
	}

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
	 * @generated not
	 */
	public String resolveName() {
		if (getName() != null)
			return getName();
		else if (getParameter() != null)
		{
			return getParameter().resolveName();
		}
		return null;
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
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				return getHandle();
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
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				setHandle((String)newValue);
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
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				setHandle(HANDLE_EDEFAULT);
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
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
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
		result.append(", handle: ");
		result.append(handle);
		result.append(')');
		return result.toString();
	}

} //ResolvedParamImpl
