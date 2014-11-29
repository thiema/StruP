/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.util.GlobalConstants;
import easyflow.data.DataFormat;
import easyflow.tool.Condition;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.Parameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.ToolFactory;
import easyflow.tool.ToolPackage;

import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToConditionMapImpl;
import easyflow.util.maps.impl.StringToResolvedParamListMapImpl;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getConditionalParam <em>Conditional Param</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getChildParams <em>Child Params</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link easyflow.tool.impl.ResolvedParamImpl#isPipe <em>Pipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolvedParamImpl extends EObjectImpl implements ResolvedParam {
	
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
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected DataFormat dataFormat;

	/**
	 * The default value of the '{@link #getConditionalParam() <em>Conditional Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalParam()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionalParam() <em>Conditional Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalParam()
	 * @generated
	 * @ordered
	 */
	protected String conditionalParam = CONDITIONAL_PARAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildParams() <em>Child Params</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildParams()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<ResolvedParam>> childParams;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Condition> conditions;

	/**
	 * The default value of the '{@link #isPipe() <em>Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPipe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PIPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPipe() <em>Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPipe()
	 * @generated
	 * @ordered
	 */
	protected boolean pipe = PIPE_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__DESCRIPTION, oldDescription, description));
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat getDataFormat() {
		if (dataFormat != null && dataFormat.eIsProxy()) {
			InternalEObject oldDataFormat = (InternalEObject)dataFormat;
			dataFormat = (DataFormat)eResolveProxy(oldDataFormat);
			if (dataFormat != oldDataFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.RESOLVED_PARAM__DATA_FORMAT, oldDataFormat, dataFormat));
			}
		}
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat basicGetDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormat(DataFormat newDataFormat) {
		DataFormat oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionalParam() {
		return conditionalParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalParam(String newConditionalParam) {
		String oldConditionalParam = conditionalParam;
		conditionalParam = newConditionalParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__CONDITIONAL_PARAM, oldConditionalParam, conditionalParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EList<ResolvedParam>> getChildParams() {
		if (childParams == null) {
			childParams = new EcoreEMap<String,EList<ResolvedParam>>(MapsPackage.Literals.STRING_TO_RESOLVED_PARAM_LIST_MAP, StringToResolvedParamListMapImpl.class, this, ToolPackage.RESOLVED_PARAM__CHILD_PARAMS);
		}
		return childParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Condition> getConditions() {
		if (conditions == null) {
			conditions = new EcoreEMap<String,Condition>(MapsPackage.Literals.STRING_TO_CONDITION_MAP, StringToConditionMapImpl.class, this, ToolPackage.RESOLVED_PARAM__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPipe() {
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipe(boolean newPipe) {
		boolean oldPipe = pipe;
		pipe = newPipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RESOLVED_PARAM__PIPE, oldPipe, pipe));
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
		Parameter param = getParameter();
		//ResolvedParam p = this;
		constraints.put(GlobalConstants.FILE_HANDLE_PARAM_NAME, getHandle());
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
		//int i=0;
		while (it.hasNext())
		{
			Object v=it.next();
			String stringValue = null;
			if (v instanceof String)
			//logger.debug(v.getClass().getCanonicalName());
			//if (v.getClass().getCanonicalName().endsWith("java.lang.String"))
				stringValue = ((String) v);
			else if (v instanceof URI)
				stringValue = ((URI)v).getPath();
			
			if (stringValue != null)
				values.add(stringValue);
			//i++;
		}
		/*
		if (i==0 && getParameter().getDefaultValue() != null 
				&& !getParameter().getDefaultValue().equals("")
				&& GlobalConfig.useDefaultValue())
			value.add(getParameter().getDefaultValue());
		*/
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
			return getParameter().resolveName();
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<ResolvedParam> getEffectiveParameters(EList<ResolvedParam> effectiveParams, EMap<String, String> constraints) {
		
		//boolean onlyLeaves = true;
		//ResolvedParam tmp = this;
		if (effectiveParams == null)
		{
			effectiveParams = new BasicEList<ResolvedParam>();
		}
		
		String key = null;
		if (constraints           == null && 
			getConditionalParam() != null && 
			getChildParams().containsKey(getConditionalParam()))
			key = getConditionalParam();
		else if (constraints                       != null &&
				 getParameter().getConditionType() != null &&
				 constraints.containsKey(getParameter().getConditionType()))
			 key = constraints.get(getParameter().getConditionType());
			 
		if (key != null)
		{
			Iterator<ResolvedParam> it = getChildParams().get(key).iterator();
			while (it.hasNext())
			{
				ResolvedParam rp = it.next();
				rp.getEffectiveParameters(effectiveParams, constraints);
			}
			return effectiveParams;
		}
		
		if (getChildParams().isEmpty())
		{
			effectiveParams.add(this);
			return effectiveParams;
		}
/*		else if (!isAbstract())
		{
			effectiveParams.add(getParameter());
			return effectiveParams;			
		}
*/	
		Iterator<Entry<String, EList<ResolvedParam>>> itValue = getChildParams().iterator();
		while (itValue.hasNext())
		{
			Entry<String, EList<ResolvedParam>> e = itValue.next();
			if (!e.getKey().equals(key))
				continue;
			Iterator<ResolvedParam> itParam = e.getValue().iterator();
			while (itParam.hasNext())
			{
				itParam.next().getEffectiveParameters(effectiveParams, constraints);
			}
		}
		return effectiveParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getSupportedHandles() {
		
		//logger.debug(renderToString()+" "+getParameter().renderToString());
		//EList<String> handles = new BasicEList<String>();
		
		//case 1: conditionType=="file_handle"
		if (getParameter().getConditionType() != null && getParameter().getConditionType().equals(GlobalConstants.CONDITION_TYPE_FILE_HANDLE))
			return getSupportedHandles_();
		//case 2: condition==file/pipe/... or handle==
		if (getParameter().getHandles() != null && !getParameter().getHandles().isEmpty())
			return getParameter().getHandles();
		
		return new BasicEList<String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ResolvedParam deepCopy() {
		
		ResolvedParam rp = EcoreUtil.copy(this);
		
		if (getChildParams() != null)
		{
			Iterator<Entry<String, EList<ResolvedParam>>> it = getChildParams().iterator();
			while (it.hasNext())
			{
				Entry<String, EList<ResolvedParam>> e = it.next();
				rp.getChildParams().put(e.getKey(), deepCopy(e.getValue()));
			}
		}
		return rp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void resolveCondititionalParam(String param, String setter, String value) {
		
		if (value == null)
			value = param;
		
		if ("setHandle".equals(setter))
			setHandle(value);
		
		if (getChildParams() != null && getChildParams().containsKey(param))
		{
			
			setConditionalParam(param);
			
			for (ResolvedParam rp : getChildParams().get(param))
			{
				rp.resolveCondititionalParam(param, setter, value);
			}
		}
	}

	EList<ResolvedParam> deepCopy(EList<ResolvedParam> rps)
	{
		EList<ResolvedParam> rpsCopy = new BasicEList<ResolvedParam>();
		Iterator<ResolvedParam> it = rps.iterator();
		while (it.hasNext())
		{
			rpsCopy.add(it.next().deepCopy());
		}
		return rpsCopy;
	}
	private EList<String> getSupportedHandles_()
	{
		EList<String> handles = new BasicEList<String>();
		Iterator<Entry<String, EList<ResolvedParam>>> it = getChildParams().iterator();
		while (it.hasNext())
		{
			Entry<String, EList<ResolvedParam>> e = it.next();
			handles.add(e.getKey());
			/*
			Iterator<ResolvedParam> it2 = e.getValue().iterator();
			while (it2.hasNext())
			{
				ResolvedParam child = it2.next();
				logger.debug(child.renderToString());
				if (child.getConditionalParam() != null)
					handles.add(child.getConditionalParam());

				else if (child.getParameter().getHandles() != null)
					for (String handle : child.getParameter().getHandles())
						if (!handles.contains(handle))
							handles.add(handle);

				
				handles.addAll(((ResolvedParamImpl)child).getSupportedHandles_());
				
			}
			*/
		}
		return handles;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String renderToString() {
		String res = "name="+resolveName()
				+" cond="+getConditionalParam()
				+" handle="+getHandle()
				+" childs="+(getChildParams() != null ? getChildParams().keySet() : null);
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.RESOLVED_PARAM__CHILD_PARAMS:
				return ((InternalEList<?>)getChildParams()).basicRemove(otherEnd, msgs);
			case ToolPackage.RESOLVED_PARAM__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case ToolPackage.RESOLVED_PARAM__NAME:
				return getName();
			case ToolPackage.RESOLVED_PARAM__DESCRIPTION:
				return getDescription();
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case ToolPackage.RESOLVED_PARAM__VALUE:
				return getValue();
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				return getHandle();
			case ToolPackage.RESOLVED_PARAM__DATA_FORMAT:
				if (resolve) return getDataFormat();
				return basicGetDataFormat();
			case ToolPackage.RESOLVED_PARAM__CONDITIONAL_PARAM:
				return getConditionalParam();
			case ToolPackage.RESOLVED_PARAM__CHILD_PARAMS:
				if (coreType) return getChildParams();
				else return getChildParams().map();
			case ToolPackage.RESOLVED_PARAM__CONDITIONS:
				if (coreType) return getConditions();
				else return getConditions().map();
			case ToolPackage.RESOLVED_PARAM__PIPE:
				return isPipe();
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
			case ToolPackage.RESOLVED_PARAM__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
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
			case ToolPackage.RESOLVED_PARAM__DATA_FORMAT:
				setDataFormat((DataFormat)newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__CONDITIONAL_PARAM:
				setConditionalParam((String)newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__CHILD_PARAMS:
				((EStructuralFeature.Setting)getChildParams()).set(newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__CONDITIONS:
				((EStructuralFeature.Setting)getConditions()).set(newValue);
				return;
			case ToolPackage.RESOLVED_PARAM__PIPE:
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
			case ToolPackage.RESOLVED_PARAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.RESOLVED_PARAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				setParameter((Parameter)null);
				return;
			case ToolPackage.RESOLVED_PARAM__VALUE:
				getValue().clear();
				return;
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				setHandle(HANDLE_EDEFAULT);
				return;
			case ToolPackage.RESOLVED_PARAM__DATA_FORMAT:
				setDataFormat((DataFormat)null);
				return;
			case ToolPackage.RESOLVED_PARAM__CONDITIONAL_PARAM:
				setConditionalParam(CONDITIONAL_PARAM_EDEFAULT);
				return;
			case ToolPackage.RESOLVED_PARAM__CHILD_PARAMS:
				getChildParams().clear();
				return;
			case ToolPackage.RESOLVED_PARAM__CONDITIONS:
				getConditions().clear();
				return;
			case ToolPackage.RESOLVED_PARAM__PIPE:
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
			case ToolPackage.RESOLVED_PARAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.RESOLVED_PARAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.RESOLVED_PARAM__PARAMETER:
				return parameter != null;
			case ToolPackage.RESOLVED_PARAM__VALUE:
				return value != null && !value.isEmpty();
			case ToolPackage.RESOLVED_PARAM__HANDLE:
				return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
			case ToolPackage.RESOLVED_PARAM__DATA_FORMAT:
				return dataFormat != null;
			case ToolPackage.RESOLVED_PARAM__CONDITIONAL_PARAM:
				return CONDITIONAL_PARAM_EDEFAULT == null ? conditionalParam != null : !CONDITIONAL_PARAM_EDEFAULT.equals(conditionalParam);
			case ToolPackage.RESOLVED_PARAM__CHILD_PARAMS:
				return childParams != null && !childParams.isEmpty();
			case ToolPackage.RESOLVED_PARAM__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case ToolPackage.RESOLVED_PARAM__PIPE:
				return pipe != PIPE_EDEFAULT;
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
				case ToolPackage.RESOLVED_PARAM__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.RESOLVED_PARAM__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
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
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.RESOLVED_PARAM__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.RESOLVED_PARAM__DESCRIPTION;
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
		result.append(", value: ");
		result.append(value);
		result.append(", handle: ");
		result.append(handle);
		result.append(", conditionalParam: ");
		result.append(conditionalParam);
		result.append(", pipe: ");
		result.append(pipe);
		result.append(')');
		return result.toString();
	}

} //ResolvedParamImpl
