/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.data.Data;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.URIUtil;
import easyflow.custom.util.Util;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.Key;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;
import easyflow.traversal.TraversalChunk;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToParameterListMapImpl;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
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
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getOptionValues <em>Option Values</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMultipleValue <em>Multiple Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getOptionKey <em>Option Key</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getValueDelimiter <em>Value Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMinOcc <em>Min Occ</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMaxOcc <em>Max Occ</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getPositional <em>Positional</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getDataDeprecated <em>Data Deprecated</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getFixedArgValue <em>Fixed Arg Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getHandles <em>Handles</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getGeneralValue <em>General Value</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#isDataParam <em>Data Param</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getCmdPart <em>Cmd Part</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMultipleInstances <em>Multiple Instances</em>}</li>
 *   <li>{@link easyflow.tool.impl.ParameterImpl#getMultipleInstancesPerInput <em>Multiple Instances Per Input</em>}</li>
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
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Parameter.class);

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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<Parameter>> values;

	/**
	 * The cached value of the '{@link #getOptionValues() <em>Option Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionValues()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionValue> optionValues;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPTIONAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected Boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleValue() <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_VALUE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMultipleValue() <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean multipleValue = MULTIPLE_VALUE_EDEFAULT;

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
	protected static final String PREFIX_EDEFAULT = "";

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
	 * The default value of the '{@link #getNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NAMED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getNamed() <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamed()
	 * @generated
	 * @ordered
	 */
	protected Boolean named = NAMED_EDEFAULT;

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
	 * The default value of the '{@link #getPositional() <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POSITIONAL_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPositional() <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositional()
	 * @generated
	 * @ordered
	 */
	protected Boolean positional = POSITIONAL_EDEFAULT;

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
	 * The cached value of the '{@link #getDataDeprecated() <em>Data Deprecated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDeprecated()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> dataDeprecated;

	/**
	 * The default value of the '{@link #getFixedArgValue() <em>Fixed Arg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedArgValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FIXED_ARG_VALUE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFixedArgValue() <em>Fixed Arg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedArgValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean fixedArgValue = FIXED_ARG_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Parameter parent;

	/**
	 * The cached value of the '{@link #getHandles() <em>Handles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> handles;

	/**
	 * The cached value of the '{@link #getGeneralValue() <em>General Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> generalValue;

	/**
	 * The default value of the '{@link #isDataParam() <em>Data Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataParam()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_PARAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataParam() <em>Data Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataParam()
	 * @generated
	 * @ordered
	 */
	protected boolean dataParam = DATA_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCmdPart() <em>Cmd Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdPart()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmdPart() <em>Cmd Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdPart()
	 * @generated
	 * @ordered
	 */
	protected String cmdPart = CMD_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleInstances() <em>Multiple Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleInstances() <em>Multiple Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstances()
	 * @generated
	 * @ordered
	 */
	protected Boolean multipleInstances = MULTIPLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleInstancesPerInput() <em>Multiple Instances Per Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstancesPerInput()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIPLE_INSTANCES_PER_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleInstancesPerInput() <em>Multiple Instances Per Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleInstancesPerInput()
	 * @generated
	 * @ordered
	 */
	protected Boolean multipleInstancesPerInput = MULTIPLE_INSTANCES_PER_INPUT_EDEFAULT;

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
	public EMap<String, EList<Parameter>> getValues() {
		if (values == null) {
			values = new EcoreEMap<String,EList<Parameter>>(MapsPackage.Literals.STRING_TO_PARAMETER_LIST_MAP, StringToParameterListMapImpl.class, this, ToolPackage.PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionValue> getOptionValues() {
		if (optionValues == null) {
			optionValues = new EObjectResolvingEList<OptionValue>(OptionValue.class, this, ToolPackage.PARAMETER__OPTION_VALUES);
		}
		return optionValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(Boolean newOptional) {
		Boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(Boolean newMultiple) {
		Boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultipleValue() {
		return multipleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleValue(Boolean newMultipleValue) {
		Boolean oldMultipleValue = multipleValue;
		multipleValue = newMultipleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE_VALUE, oldMultipleValue, multipleValue));
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
	public EList<Data> getDataDeprecated() {
		if (dataDeprecated == null) {
			dataDeprecated = new EObjectResolvingEList<Data>(Data.class, this, ToolPackage.PARAMETER__DATA_DEPRECATED);
		}
		return dataDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFixedArgValue() {
		return fixedArgValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedArgValue(Boolean newFixedArgValue) {
		Boolean oldFixedArgValue = fixedArgValue;
		fixedArgValue = newFixedArgValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__FIXED_ARG_VALUE, oldFixedArgValue, fixedArgValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Parameter)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.PARAMETER__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Parameter newParent) {
		Parameter oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHandles() {
		if (handles == null) {
			handles = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.PARAMETER__HANDLES);
		}
		return handles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getGeneralValue() {
		if (generalValue == null) {
			generalValue = new EDataTypeUniqueEList<Object>(Object.class, this, ToolPackage.PARAMETER__GENERAL_VALUE);
		}
		return generalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataParam() {
		return dataParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataParam(boolean newDataParam) {
		boolean oldDataParam = dataParam;
		dataParam = newDataParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__DATA_PARAM, oldDataParam, dataParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCmdPart() {
		return cmdPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdPart(String newCmdPart) {
		String oldCmdPart = cmdPart;
		cmdPart = newCmdPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__CMD_PART, oldCmdPart, cmdPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultipleInstances() {
		return multipleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleInstances(Boolean newMultipleInstances) {
		Boolean oldMultipleInstances = multipleInstances;
		multipleInstances = newMultipleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE_INSTANCES, oldMultipleInstances, multipleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultipleInstancesPerInput() {
		return multipleInstancesPerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleInstancesPerInput(Boolean newMultipleInstancesPerInput) {
		Boolean oldMultipleInstancesPerInput = multipleInstancesPerInput;
		multipleInstancesPerInput = newMultipleInstancesPerInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__MULTIPLE_INSTANCES_PER_INPUT, oldMultipleInstancesPerInput, multipleInstancesPerInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgKey(String defaultPrefix, Key defaultKey) {

		String argKey = "";
		if (!getKeys().isEmpty())
			argKey = resolveArgKey(defaultPrefix, defaultKey);
		else if (defaultKey != null)
			return defaultKey.resolveArgKey(defaultPrefix);
		else
		{
			if (getPrefix() != null)// && isNamed(defaultIsNamed))
				argKey = getPrefix();
			else if (defaultPrefix != null)// && isNamed(defaultIsNamed))
				argKey = defaultPrefix;
			else 
				argKey = GlobalConfig.getArgPrefix();
			argKey += defaultKey == null ? getName() : defaultKey;
		}
		return argKey;
	}

	private String resolveArgKey(String defaultPrefix, Key defaultKey)
	{
		String preferredType = GlobalConfig.getPreferredOptionType();
		for (Key key : getKeys())
		{
			if (key.getType() != null && key.getType().equalsIgnoreCase(preferredType))
				return key.resolveArgKey(defaultPrefix);
		}
		if (defaultKey != null)
			return defaultKey.resolveArgKey(defaultPrefix);
		
		return getKeys().get(0).resolveArgKey(defaultPrefix);
	}
	
	private String resolveArgKeyDelimiter(String defaultDelimiter)
	{
		String preferredType = GlobalConfig.getPreferredOptionType();
		for (Key key : getKeys())
		{
			if (key.getType() != null && key.getType().equalsIgnoreCase(preferredType))
				return key.getDelimiter() != null ? key.getDelimiter() : defaultDelimiter; 
		}
		if (getKeys().get(0).getDelimiter() != null)
			return getKeys().get(0).getDelimiter();
		else if (getDelimiter() != null)
			return getDelimiter();
		else 
			return defaultDelimiter;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgDelimiter(String defaultDelimiter) {
		if (!getKeys().isEmpty())
			return resolveArgKeyDelimiter(defaultDelimiter);
		else if (getDelimiter() != null)
			return getDelimiter();
		else if (defaultDelimiter != null)
			return defaultDelimiter;
		else 
			return GlobalConfig.getArgDelimiter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getArgValueDelimiter(String defaultDelimiter) {
		if (getValueDelimiter() != null && !getValueDelimiter().equals(""))
			return getValueDelimiter();
		else if (defaultDelimiter != null)
			return defaultDelimiter;
		else 
			return GlobalConfig.getArgValueDelimiter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getPrefix(String defaultPrefix) {
		if (getPrefix() != null)
			return getPrefix();
		else if (defaultPrefix != null)
			return defaultPrefix;
		else
			return GlobalConfig.getArgPrefix();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	/*public boolean isOutput() {
		
		
		for (Data data:getData())
		{
			if (data.isOutput())
				return true;
		}
		return false;
	}
	*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Parameter getParameterForAnalysisType(EList<TraversalChunk> records) {
		// check only tools parameter for type analysis type,
		// if found, check if one of them is applicable
		// Example: tool=xampe contains parameter of type analysisType
		//          

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isAnalysisType() {
		
		if (getType()!=null && getType().equalsIgnoreCase("analysis_type"))
			return true;
		
		return false;
		
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getSupportedHandles(boolean applyConfig) {

		EList<String> handles = new BasicEList<String>();
		
		if (getHandles()==null || getHandles().isEmpty())
		{
			handles.add(GlobalConfig.CONFIG_PROCESSING_DEFAULT_HANDLE_VALUE);
			return handles;
		}

		else if (applyConfig)
		{
			for (String handle:GlobalConfig.getAllowedHandles())
			{
				if (getHandles().contains(handle))
				{
					handles.add(handle);
					
				}
			}
			return handles;
		}
		else
		{
			return getHandles();
		}

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Parameter getEffectiveParentParameter(boolean first) {
		if (getParent() == null)
			return this;
		else
			if (first)
				return getParent();
		
		return getEffectiveParentParameter(first);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<Parameter> getEffectiveParameters(EList<Parameter> effectiveParams) {
		if (effectiveParams == null)
			effectiveParams = new BasicEList<Parameter>(); 
		if (getValues().isEmpty())
		{
			effectiveParams.add(this);
			return effectiveParams;
		}
		for (Entry<String, EList<Parameter>> parameters : getValues())
			for (Parameter parameter:parameters.getValue())
				parameter.getEffectiveParameters(effectiveParams);
		
		return effectiveParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> generateCommandStringURI(EMap<String, Object> constraints, EList<URI> value, Parameter templateParam) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * transforms the parameter to a command line string, so it can be used in the command line
	 * - the constraints map is no yet specified
	 * - the value specifies the arguments value(s) 
	 * - the template parameter is used, when a particular attribute of the parameter is not set
	 * 
	 * the command line parameter has the following general layout:
	 *  <prefix><key><delimiter><arg1><arg-delimiter><arg2>
	 *  
	 *  examples:
	 *  
	 *  1.) named short/long (GATK style)
	 *   prefix        : -/--
	 *   named         : true
	 *   key           : I/input
	 *   delimiter     : " "
	 *   multipleValue : false
	 *   multiple      : true
	 *   
	 *    short: -I file1.bam -I file2.bam
	 *    long: --input_files file1.bam --input_files file2.bam
	 *   
	 *  2.) named short/long (Picard style)
	 *   prefix        : ""
	 *   named         : true
	 *   key           : I/INPUT
	 *   delimiter     : "="
	 *   multipleValue : false
	 *   multiple      : true
	 *   
	 *    short: I=file1.bam 
	 *    long:  INPUT=file1.bam
	 *    
	 *  3.) positional (samtools) 
	 *   prefix        : ""
	 *   named         : false
	 *   key           : ""
	 *   delimiter     : ""
	 *   multipleValue : false //doesnt matter, at least one of
	 *   multiple      : true  //them should be true, if arg can occur multiple times
	 *  
	 *          file1.bam file2.bam
	 *  
	 * 
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> generateCommandString(EMap<String, Object> constraints, EList<Object> value, Parameter templateParam) {
		
		EList<String> cmdString = new BasicEList<String>();
		
		EList<String> argValue  = null;
		Boolean defaultIsFixed  = templateParam != null ? templateParam.getFixedArgValue() : null;
		String path             = resolvePath(constraints.containsKey("path") ? constraints.get("path") : null);
		
		try {
			if (getCmdPart() != null && 
					(GlobalConstants.COMMAND_PART_VALUE_EXE.equals(getCmdPart()) || 
					 GlobalConstants.COMMAND_PART_VALUE_INTERPRETER.equals(getCmdPart())))
			{
				String res = null;
				if (getDefaultValue() != null)
					res = getDefaultValue();
				else if (getName() != null)
					res = getName();
				return resolveValues(res, path);
			}
			
		if (constraints != null && constraints.containsKey("value"))
		{
			argValue = resolveValues(constraints.get("value"), path);
		}
		else if (value != null && !value.isEmpty()) 
		{
			argValue = resolveValues(value, path);
		}
		else if (getGeneralValue() != null && !getGeneralValue().isEmpty())
		{
			argValue = resolveValues(getGeneralValue(), path);
		}
		else if (getDefaultValue() != null && !getDefaultValue().equals("") && isFixedArgValue(defaultIsFixed))
		{
			//argValue = new BasicEList<String>();
			//argValue.add(resolveValues(getDefaultValue(), path));
			
			argValue = resolveValues(getDefaultValue(), path);
		}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Boolean defaultIsNamed           = templateParam != null ? templateParam.getNamed() : null;
		String  defaultArgDelimiter      = templateParam != null ? templateParam.getArgDelimiter(null) : null;
		String  defaultPrefix            = templateParam != null ? templateParam.getPrefix() : null;
		Key     defaultKey               = templateParam != null ? (templateParam.getKeys().isEmpty() ? null : templateParam.getKeys().get(0)) : null;
		boolean omitPrefixIfNoArgKey     = (Boolean) (constraints != null && constraints.containsKey(GlobalConfig.CONFIG_TOOL_OMIT_PREFIX_IF_NO_ARG_KEY) ?
				constraints.get(GlobalConfig.CONFIG_TOOL_OMIT_PREFIX_IF_NO_ARG_KEY) : GlobalConfig.omitPrefixIfNoArgKey());
		
		if (isAnalysisType())
		{
			EList<Parameter> pl = getEffectiveParameters(null);
			logger.debug("generateCommandString(): param="+resolveName()+" no of effective params="+pl.size());
		}
		// resolve prefix and key
		if ((getName() == null || getName().equals("")) && omitPrefixIfNoArgKey)
			;
		else if (isNamed(defaultIsNamed) || argValue == null)
		{
			cmdString.add(getArgKey(defaultPrefix, defaultKey));
		}
		// resolve delimiter
		if (argValue != null && isNamed(defaultIsNamed))
			cmdString.add(getArgDelimiter(defaultArgDelimiter));
		
		if (argValue != null)
			return resolveMultiplicity(cmdString, argValue, templateParam);
		else
			return cmdString;
		
	}
	
	private EList<String> resolveMultiplicity(EList<String> cmdString, EList<String> argValue, Parameter templateParam)
	{
		Boolean          defaultIsMultiple      = templateParam != null ? templateParam.isMultiple(null) : null;
		Boolean          defaultIsMultipleValue = templateParam != null ? templateParam.isMultipleValue(null) : null;
		String         defaultArgValueDelimiter = templateParam != null ? templateParam.getArgValueDelimiter(null) : null;
		EList<String>    res = new BasicEList<String>();
		
		if (isMultiple(defaultIsMultiple) && isMultipleValue(defaultIsMultipleValue))
		{
			String tmp  = StringUtils.join(cmdString, "");
			tmp        += StringUtils.join(argValue, getArgValueDelimiter(defaultArgValueDelimiter));
			res.add(tmp);
		}
		else
		{
			Iterator<String> it  = argValue.iterator();
			while (it.hasNext())
			{
				String tmp  = StringUtils.join(cmdString, "");
				tmp        += it.next();
				res.add(tmp);
			}
		}
		
		return res;
	}
	
	private String resolvePath(Object path)
	{
		if (path == null)
			return null;
		else if (path instanceof String)
			return (String) path;
		else if (path instanceof URI)
			return path.toString();
		else
			return null;
	}
	
	private EList<String> resolveValues(Object value, String path) throws URISyntaxException
	{
		EList<String> finalValue = new BasicEList<String>();
		if (value == null)
			logger.error("generateCommandString(): couldnt resolve value. Null value given.");
		else if (value instanceof EList)
		{
			Iterator<Object> it = ((EList<Object>) value).iterator();
			while (it.hasNext())
			{
				Object v = it.next();
				if (v instanceof String)
					finalValue.add(URIUtil.createPath(path, (String) v));
				else if (v instanceof URI)
					finalValue.add(URIUtil.addPathToUri(path, ((URI)v)).toString());
				else if (v instanceof TraversalChunk)
					finalValue.add(URIUtil.createPath(path, ((TraversalChunk)v).getName()));
				else
					logger.error("generateCommandString(): couldnt resolve value. Unknown instance.");
			}
		}
		else if (value instanceof String)
			finalValue.add(URIUtil.createPath(path, (String) value));
		else if (value instanceof URI)
			finalValue.add(URIUtil.addPathToUri(path, (URI) value).toString());
		else
			logger.error("generateCommandString(): couldnt resolve value. Unknown instance.");
		return finalValue;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> generateCommandString(EMap<String, Object> constraints, Object value, Parameter templateParam) {
		EList<Object> values = new BasicEList<Object>();
		values.add(value);
		return generateCommandString(constraints, values, templateParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> generateCommandString(EMap<String, Object> constraints, OptionValue value, Parameter templateParam) {
		String strValue = null;
		if (value.getExe() != null)
			strValue = value.getExe();
		else if (value.getName() != null)
			strValue = value.getName();
		return generateCommandString(constraints, strValue, templateParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> generateCommandString(EMap<String, Object> constraints, URI value, Parameter templateParam) {
		EList<URI> values = new BasicEList<URI>();
		values.add(value);
		return generateCommandStringURI(constraints, values, templateParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isOptional(Boolean default_) {
		if (getOptional() != null)
			return getOptional();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsOptional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isMultiple(Boolean default_) {
		if (getMultiple() != null)
			return getMultiple();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsMultiple();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isMultipleInstances(Boolean default_) {
		if (getMultipleInstances() != null)
			return getMultipleInstances();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsMultipleInstances();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isMultipleInstancesPerInput(Boolean default_) {
		if (getMultipleInstancesPerInput() != null)
			return getMultipleInstancesPerInput();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsMultipleInstancesPerInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isNamed(Boolean default_) {
		if (getNamed() != null)
			return getNamed();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsNamed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPositional(Boolean default_) {
		if (getPositional() != null)
			return getPositional();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsPositional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isFixedArgValue(Boolean default_) {
		if (getFixedArgValue() != null)
			return getFixedArgValue();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.paramIsFixedArgValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isMultipleValue(Boolean default_) {
		if (getMultipleValue() != null)
			return getMultipleValue();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.isMultipleArgValue();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void merge(Parameter parameter) {
		
		setNamed(parameter.isNamed(getNamed()));
		if (getPrefix() == null)
			setPrefix(parameter.getPrefix());
		if (getDelimiter() == null)
			setDelimiter(parameter.getDelimiter());
		mergeKeys(parameter.getKeys());
			
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getUniqueString()
	{
		String uniqueString = getName() != null ? getName() : "noname";
		if ("noname".equals(uniqueString))
		{
			logger.debug("no name set.");
		}
		uniqueString += "_" + (getKeys().isEmpty() ? "nokey" : getKeys().get(0).resolveName());
		//uniqueString += "_" + (getLabel() != null ? getLabel(): "nolabel");
		return uniqueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String resolveName() {
		if (getName() != null)
			return getName();
		else if (!getKeys().isEmpty())
			return getKeys().get(0).resolveName();
		else
			return null;

	}

	private void mergeKeys(EList<Key> newKeys)
	{
		for (Key newKey:newKeys)
		{
			boolean contained = false;
			for (Key key:getKeys())
			{
				if (newKey.getValue().equals(key.getValue()))
					contained = true;
			}
			if (!contained)
				getKeys().add(newKey);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean matches(Parameter templateParameter) {
		
		
		boolean doesNameMatch = true;
		boolean doesTypeMatch = false;
		
		if (templateParameter.getType().equals(getType()) || 
				templateParameter.getType().equals(GlobalConstants.ANY_TEMPLATE_PARAM_NAME))
			doesTypeMatch = true;
		
		if (templateParameter.getName() != null)
		{
			if (!templateParameter.getName().equals(getName()))
				doesNameMatch = false;
		}

		if (!doesNameMatch && (GlobalConstants.DEFAULT_TEMPLATE_PARAM_NAME.equals(templateParameter.getName())
				|| GlobalConstants.ANY_TEMPLATE_PARAM_NAME.equals(templateParameter.getName())))
			doesNameMatch = true;
		
		return doesNameMatch && doesTypeMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matches(InOutParameter templateParameter) {
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
	public Boolean getNamed() {
		return named;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamed(Boolean newNamed) {
		Boolean oldNamed = named;
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
	public Boolean getPositional() {
		return positional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositional(Boolean newPositional) {
		Boolean oldPositional = positional;
		positional = newPositional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PARAMETER__POSITIONAL, oldPositional, positional));
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
			case ToolPackage.PARAMETER__TYPE:
				return getType();
			case ToolPackage.PARAMETER__VALUES:
				if (coreType) return getValues();
				else return getValues().map();
			case ToolPackage.PARAMETER__OPTION_VALUES:
				return getOptionValues();
			case ToolPackage.PARAMETER__OPTIONAL:
				return getOptional();
			case ToolPackage.PARAMETER__MULTIPLE:
				return getMultiple();
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				return getMultipleValue();
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
				return getNamed();
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
			case ToolPackage.PARAMETER__POSITIONAL:
				return getPositional();
			case ToolPackage.PARAMETER__GROUPING:
				return getGrouping();
			case ToolPackage.PARAMETER__DATA_DEPRECATED:
				return getDataDeprecated();
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				return getFixedArgValue();
			case ToolPackage.PARAMETER__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ToolPackage.PARAMETER__HANDLES:
				return getHandles();
			case ToolPackage.PARAMETER__GENERAL_VALUE:
				return getGeneralValue();
			case ToolPackage.PARAMETER__DATA_PARAM:
				return isDataParam();
			case ToolPackage.PARAMETER__CMD_PART:
				return getCmdPart();
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES:
				return getMultipleInstances();
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES_PER_INPUT:
				return getMultipleInstancesPerInput();
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
			case ToolPackage.PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case ToolPackage.PARAMETER__VALUES:
				((EStructuralFeature.Setting)getValues()).set(newValue);
				return;
			case ToolPackage.PARAMETER__OPTION_VALUES:
				getOptionValues().clear();
				getOptionValues().addAll((Collection<? extends OptionValue>)newValue);
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
			case ToolPackage.PARAMETER__POSITIONAL:
				setPositional((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__GROUPING:
				getGrouping().clear();
				getGrouping().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.PARAMETER__DATA_DEPRECATED:
				getDataDeprecated().clear();
				getDataDeprecated().addAll((Collection<? extends Data>)newValue);
				return;
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				setFixedArgValue((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__PARENT:
				setParent((Parameter)newValue);
				return;
			case ToolPackage.PARAMETER__HANDLES:
				getHandles().clear();
				getHandles().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.PARAMETER__GENERAL_VALUE:
				getGeneralValue().clear();
				getGeneralValue().addAll((Collection<? extends Object>)newValue);
				return;
			case ToolPackage.PARAMETER__DATA_PARAM:
				setDataParam((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__CMD_PART:
				setCmdPart((String)newValue);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES:
				setMultipleInstances((Boolean)newValue);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES_PER_INPUT:
				setMultipleInstancesPerInput((Boolean)newValue);
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
			case ToolPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__VALUES:
				getValues().clear();
				return;
			case ToolPackage.PARAMETER__OPTION_VALUES:
				getOptionValues().clear();
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
			case ToolPackage.PARAMETER__POSITIONAL:
				setPositional(POSITIONAL_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__GROUPING:
				getGrouping().clear();
				return;
			case ToolPackage.PARAMETER__DATA_DEPRECATED:
				getDataDeprecated().clear();
				return;
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				setFixedArgValue(FIXED_ARG_VALUE_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__PARENT:
				setParent((Parameter)null);
				return;
			case ToolPackage.PARAMETER__HANDLES:
				getHandles().clear();
				return;
			case ToolPackage.PARAMETER__GENERAL_VALUE:
				getGeneralValue().clear();
				return;
			case ToolPackage.PARAMETER__DATA_PARAM:
				setDataParam(DATA_PARAM_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__CMD_PART:
				setCmdPart(CMD_PART_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES:
				setMultipleInstances(MULTIPLE_INSTANCES_EDEFAULT);
				return;
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES_PER_INPUT:
				setMultipleInstancesPerInput(MULTIPLE_INSTANCES_PER_INPUT_EDEFAULT);
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
			case ToolPackage.PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ToolPackage.PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case ToolPackage.PARAMETER__OPTION_VALUES:
				return optionValues != null && !optionValues.isEmpty();
			case ToolPackage.PARAMETER__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
			case ToolPackage.PARAMETER__MULTIPLE:
				return MULTIPLE_EDEFAULT == null ? multiple != null : !MULTIPLE_EDEFAULT.equals(multiple);
			case ToolPackage.PARAMETER__MULTIPLE_VALUE:
				return MULTIPLE_VALUE_EDEFAULT == null ? multipleValue != null : !MULTIPLE_VALUE_EDEFAULT.equals(multipleValue);
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
				return NAMED_EDEFAULT == null ? named != null : !NAMED_EDEFAULT.equals(named);
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
			case ToolPackage.PARAMETER__POSITIONAL:
				return POSITIONAL_EDEFAULT == null ? positional != null : !POSITIONAL_EDEFAULT.equals(positional);
			case ToolPackage.PARAMETER__GROUPING:
				return grouping != null && !grouping.isEmpty();
			case ToolPackage.PARAMETER__DATA_DEPRECATED:
				return dataDeprecated != null && !dataDeprecated.isEmpty();
			case ToolPackage.PARAMETER__FIXED_ARG_VALUE:
				return FIXED_ARG_VALUE_EDEFAULT == null ? fixedArgValue != null : !FIXED_ARG_VALUE_EDEFAULT.equals(fixedArgValue);
			case ToolPackage.PARAMETER__PARENT:
				return parent != null;
			case ToolPackage.PARAMETER__HANDLES:
				return handles != null && !handles.isEmpty();
			case ToolPackage.PARAMETER__GENERAL_VALUE:
				return generalValue != null && !generalValue.isEmpty();
			case ToolPackage.PARAMETER__DATA_PARAM:
				return dataParam != DATA_PARAM_EDEFAULT;
			case ToolPackage.PARAMETER__CMD_PART:
				return CMD_PART_EDEFAULT == null ? cmdPart != null : !CMD_PART_EDEFAULT.equals(cmdPart);
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES:
				return MULTIPLE_INSTANCES_EDEFAULT == null ? multipleInstances != null : !MULTIPLE_INSTANCES_EDEFAULT.equals(multipleInstances);
			case ToolPackage.PARAMETER__MULTIPLE_INSTANCES_PER_INPUT:
				return MULTIPLE_INSTANCES_PER_INPUT_EDEFAULT == null ? multipleInstancesPerInput != null : !MULTIPLE_INSTANCES_PER_INPUT_EDEFAULT.equals(multipleInstancesPerInput);
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
		result.append(", handles: ");
		result.append(handles);
		result.append(", generalValue: ");
		result.append(generalValue);
		result.append(", dataParam: ");
		result.append(dataParam);
		result.append(", cmdPart: ");
		result.append(cmdPart);
		result.append(", multipleInstances: ");
		result.append(multipleInstances);
		result.append(", multipleInstancesPerInput: ");
		result.append(multipleInstancesPerInput);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
