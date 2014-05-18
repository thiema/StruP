/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.data.Data;
import easyflow.custom.ui.GlobalConfig;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.Key;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;

import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToParameterMapImpl;

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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isMultipleValue <em>Multiple Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getOptionKey <em>Option Key</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValueDelimiter <em>Value Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMinOcc <em>Min Occ</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMaxOcc <em>Max Occ</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isPositional <em>Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isFixedArgValue <em>Fixed Arg Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
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
	 * @generated
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = null;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> value;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleValue() <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleValue() <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleValue()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleValue = MULTIPLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionKey() <em>Option Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionKey() <em>Option Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionKey()
	 * @generated
	 * @ordered
	 */
	protected String optionKey = OPTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDelimiter() <em>Value Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDelimiter() <em>Value Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String valueDelimiter = VALUE_DELIMITER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> keys;

	/**
	 * The default value of the '{@link #isNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNamed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNamed()
	 * @generated
	 * @ordered
	 */
	protected boolean named = NAMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOcc() <em>Min Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOcc()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_OCC_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinOcc() <em>Min Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOcc()
	 * @generated
	 * @ordered
	 */
	protected int minOcc = MIN_OCC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOcc() <em>Max Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOcc()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OCC_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxOcc() <em>Max Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOcc()
	 * @generated
	 * @ordered
	 */
	protected int maxOcc = MAX_OCC_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvanced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADVANCED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdvanced()
	 * @generated
	 * @ordered
	 */
	protected boolean advanced = ADVANCED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Parameter> values;

	/**
	 * The default value of the '{@link #isPositional() <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIONAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPositional() <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositional()
	 * @generated
	 * @ordered
	 */
	protected boolean positional = POSITIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected EList<String> grouping;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The default value of the '{@link #isFixedArgValue() <em>Fixed Arg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedArgValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_ARG_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixedArgValue() <em>Fixed Arg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedArgValue()
	 * @generated
	 * @ordered
	 */
	protected boolean fixedArgValue = FIXED_ARG_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleValue() {
		return multipleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleValue(boolean newMultipleValue) {
		boolean oldMultipleValue = multipleValue;
		multipleValue = newMultipleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE_VALUE, oldMultipleValue, multipleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Parameter> getValues() {
		if (values == null) {
			values = new EcoreEMap<String,Parameter>(MapsPackage.Literals.STRING_TO_PARAMETER_MAP, StringToParameterMapImpl.class, this, ToolPackage.PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositional() {
		return positional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositional(boolean newPositional) {
		boolean oldPositional = positional;
		positional = newPositional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__POSITIONAL, oldPositional, positional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGrouping() {
		if (grouping == null) {
			grouping = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.PARAMETER__GROUPING);
		}
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, ToolPackage.PARAMETER__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixedArgValue() {
		return fixedArgValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedArgValue(boolean newFixedArgValue) {
		boolean oldFixedArgValue = fixedArgValue;
		fixedArgValue = newFixedArgValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__FIXED_ARG_VALUE, oldFixedArgValue, fixedArgValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateCommandString(EMap<String, Object> constaints) {
		return getArgKey()
				+getArgDelimiter()
				+StringUtils.join(getArgValue(), getValueDelimiter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgKey() {
		if (isNamed() && !getKeys().isEmpty())
			return getKeys().get(0).getPrefix()+getKeys().get(0).getValue();
		else
			return "";
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
		if (i==0 && getDefaultValue() != null && !getDefaultValue().equals("") 
				&& GlobalConfig.getToolConfig().containsKey("write_default_value_to_command_line")
				&& GlobalConfig.getToolConfig().get("write_default_value_to_command_line").equals("1"))
			value.add(getDefaultValue());
		
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgDelimiter() {
		if (isNamed() && !getKeys().isEmpty())
			return getKeys().get(0).getDelimiter();
		else
			return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgValueDelimiter() {
		if (getValueDelimiter()!=null && !getValueDelimiter().equals(""))
			return getValueDelimiter();
		else if (GlobalConfig.getToolConfig().containsKey("default_value_delimiter"))
			return GlobalConfig.getToolConfig().get("default_value_delimiter");
		else
			return ",";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueDelimiter() {
		return valueDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDelimiter(String newValueDelimiter) {
		String oldValueDelimiter = valueDelimiter;
		valueDelimiter = newValueDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__VALUE_DELIMITER, oldValueDelimiter, valueDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionKey() {
		return optionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionKey(String newOptionKey) {
		String oldOptionKey = optionKey;
		optionKey = newOptionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__OPTION_KEY, oldOptionKey, optionKey));
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
	public EList<Object> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<Object>(Object.class, this, ToolPackage.PARAMETER__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Key> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Key>(Key.class, this, ToolPackage.PARAMETER__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNamed() {
		return named;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamed(boolean newNamed) {
		boolean oldNamed = named;
		named = newNamed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__NAMED, oldNamed, named));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelp(String newHelp) {
		String oldHelp = help;
		help = newHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__HELP, oldHelp, help));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinOcc() {
		return minOcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOcc(int newMinOcc) {
		int oldMinOcc = minOcc;
		minOcc = newMinOcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MIN_OCC, oldMinOcc, minOcc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOcc() {
		return maxOcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOcc(int newMaxOcc) {
		int oldMaxOcc = maxOcc;
		maxOcc = newMaxOcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MAX_OCC, oldMaxOcc, maxOcc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdvanced() {
		return advanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdvanced(boolean newAdvanced) {
		boolean oldAdvanced = advanced;
		advanced = newAdvanced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__ADVANCED, oldAdvanced, advanced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.PARAMETER__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ToolPackage.PARAMETER__NAME:
				return getName();
			case ToolPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case ToolPackage.PARAMETER__LOGGER:
				return getLogger();
			case ToolPackage.PARAMETER__VALUE:
				return getValue();
			case ToolPackage.PARAMETER__TYPE:
				return getType();
			case ToolPackage.PARAMETER__OPTIONAL:
				return isOptional();
			case ToolPackage.PARAMETER__MULTIPLE:
				return isMultiple();
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				return isMultipleValue();
			case ToolPackage.PARAMETER__VALUE_TYPE:
				return getValueType();
			case ToolPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case ToolPackage.PARAMETER__PREFIX:
				return getPrefix();
			case ToolPackage.PARAMETER__OPTION_KEY:
				return getOptionKey();
			case ToolPackage.PARAMETER__DELIMITER:
				return getDelimiter();
			case ToolPackage.PARAMETER__VALUE_DELIMITER:
				return getValueDelimiter();
			case ToolPackage.PARAMETER__KEYS:
				return getKeys();
			case ToolPackage.PARAMETER__NAMED:
				return isNamed();
			case ToolPackage.PARAMETER__LABEL:
				return getLabel();
			case ToolPackage.PARAMETER__HELP:
				return getHelp();
			case ToolPackage.PARAMETER__MIN_OCC:
				return getMinOcc();
			case ToolPackage.PARAMETER__MAX_OCC:
				return getMaxOcc();
			case ToolPackage.PARAMETER__ADVANCED:
				return isAdvanced();
			case ToolPackage.PARAMETER__VALUES:
				if (coreType) return getValues();
				else return getValues().map();
			case ToolPackage.PARAMETER__POSITIONAL:
				return isPositional();
			case ToolPackage.PARAMETER__GROUPING:
				return getGrouping();
			case ToolPackage.PARAMETER__DATA:
				return getData();
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				return isFixedArgValue();
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
			case ToolPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.PARAMETER__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Object>)newValue);
				return;
			case ToolPackage.PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case ToolPackage.PARAMETER__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				setMultipleValue((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__VALUE_TYPE:
				setValueType((String)newValue);
				return;
			case ToolPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ToolPackage.PARAMETER__PREFIX:
				setPrefix((String)newValue);
				return;
			case ToolPackage.PARAMETER__OPTION_KEY:
				setOptionKey((String)newValue);
				return;
			case ToolPackage.PARAMETER__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case ToolPackage.PARAMETER__VALUE_DELIMITER:
				setValueDelimiter((String)newValue);
				return;
			case ToolPackage.PARAMETER__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Key>)newValue);
				return;
			case ToolPackage.PARAMETER__NAMED:
				setNamed((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__LABEL:
				setLabel((String)newValue);
				return;
			case ToolPackage.PARAMETER__HELP:
				setHelp((String)newValue);
				return;
			case ToolPackage.PARAMETER__MIN_OCC:
				setMinOcc((Integer)newValue);
				return;
			case ToolPackage.PARAMETER__MAX_OCC:
				setMaxOcc((Integer)newValue);
				return;
			case ToolPackage.PARAMETER__ADVANCED:
				setAdvanced((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__VALUES:
				((EStructuralFeature.Setting)getValues()).set(newValue);
				return;
			case ToolPackage.PARAMETER__POSITIONAL:
				setPositional((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__GROUPING:
				getGrouping().clear();
				getGrouping().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.PARAMETER__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				setFixedArgValue((Boolean)newValue);
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
			case ToolPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__VALUE:
				getValue().clear();
				return;
			case ToolPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				setMultipleValue(MULTIPLE_VALUE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__OPTION_KEY:
				setOptionKey(OPTION_KEY_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__VALUE_DELIMITER:
				setValueDelimiter(VALUE_DELIMITER_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__KEYS:
				getKeys().clear();
				return;
			case ToolPackage.PARAMETER__NAMED:
				setNamed(NAMED_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__HELP:
				setHelp(HELP_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MIN_OCC:
				setMinOcc(MIN_OCC_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MAX_OCC:
				setMaxOcc(MAX_OCC_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__ADVANCED:
				setAdvanced(ADVANCED_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__VALUES:
				getValues().clear();
				return;
			case ToolPackage.PARAMETER__POSITIONAL:
				setPositional(POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__GROUPING:
				getGrouping().clear();
				return;
			case ToolPackage.PARAMETER__DATA:
				getData().clear();
				return;
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				setFixedArgValue(FIXED_ARG_VALUE_EDEFAULT);
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
			case ToolPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.PARAMETER__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case ToolPackage.PARAMETER__VALUE:
				return value != null && !value.isEmpty();
			case ToolPackage.PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ToolPackage.PARAMETER__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ToolPackage.PARAMETER__MULTIPLE:
				return multiple != MULTIPLE_EDEFAULT;
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				return multipleValue != MULTIPLE_VALUE_EDEFAULT;
			case ToolPackage.PARAMETER__VALUE_TYPE:
				return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
			case ToolPackage.PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ToolPackage.PARAMETER__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case ToolPackage.PARAMETER__OPTION_KEY:
				return OPTION_KEY_EDEFAULT == null ? optionKey != null : !OPTION_KEY_EDEFAULT.equals(optionKey);
			case ToolPackage.PARAMETER__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case ToolPackage.PARAMETER__VALUE_DELIMITER:
				return VALUE_DELIMITER_EDEFAULT == null ? valueDelimiter != null : !VALUE_DELIMITER_EDEFAULT.equals(valueDelimiter);
			case ToolPackage.PARAMETER__KEYS:
				return keys != null && !keys.isEmpty();
			case ToolPackage.PARAMETER__NAMED:
				return named != NAMED_EDEFAULT;
			case ToolPackage.PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ToolPackage.PARAMETER__HELP:
				return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
			case ToolPackage.PARAMETER__MIN_OCC:
				return minOcc != MIN_OCC_EDEFAULT;
			case ToolPackage.PARAMETER__MAX_OCC:
				return maxOcc != MAX_OCC_EDEFAULT;
			case ToolPackage.PARAMETER__ADVANCED:
				return advanced != ADVANCED_EDEFAULT;
			case ToolPackage.PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case ToolPackage.PARAMETER__POSITIONAL:
				return positional != POSITIONAL_EDEFAULT;
			case ToolPackage.PARAMETER__GROUPING:
				return grouping != null && !grouping.isEmpty();
			case ToolPackage.PARAMETER__DATA:
				return data != null && !data.isEmpty();
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				return fixedArgValue != FIXED_ARG_VALUE_EDEFAULT;
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
				case ToolPackage.PARAMETER__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.PARAMETER__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
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
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.PARAMETER__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.PARAMETER__DESCRIPTION;
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
		result.append(", logger: ");
		result.append(logger);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", optional: ");
		result.append(optional);
		result.append(", multiple: ");
		result.append(multiple);
		result.append(", multipleValue: ");
		result.append(multipleValue);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", optionKey: ");
		result.append(optionKey);
		result.append(", delimiter: ");
		result.append(delimiter);
		result.append(", valueDelimiter: ");
		result.append(valueDelimiter);
		result.append(", named: ");
		result.append(named);
		result.append(", label: ");
		result.append(label);
		result.append(", help: ");
		result.append(help);
		result.append(", minOcc: ");
		result.append(minOcc);
		result.append(", maxOcc: ");
		result.append(maxOcc);
		result.append(", advanced: ");
		result.append(advanced);
		result.append(", positional: ");
		result.append(positional);
		result.append(", grouping: ");
		result.append(grouping);
		result.append(", fixedArgValue: ");
		result.append(fixedArgValue);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
