/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data.impl;

import easyflow.custom.tool.saxparser.ToolContentHandler;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.data.Data;
import easyflow.data.DataFormat;
import easyflow.data.DataPackage;
import easyflow.data.DataPort;
import easyflow.tool.Parameter;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.data.impl.DataImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getPort <em>Port</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link easyflow.data.impl.DataImpl#getPreferredHandle <em>Preferred Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends EObjectImpl implements Data {
	
	Logger logger = Logger.getLogger(Data.class);
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected DataPort port;

	/**
	 * The default value of the '{@link #isOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final URI DATA_RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected URI dataResourceName = DATA_RESOURCE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getPreferredHandle() <em>Preferred Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredHandle() <em>Preferred Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredHandle()
	 * @generated
	 * @ordered
	 */
	protected String preferredHandle = PREFERRED_HANDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (DataPort)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(DataPort newPort) {
		DataPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(boolean newOutput) {
		boolean oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public DataFormat getFormat() {
		DataFormat dataFormat = null;
		Iterator<DataFormat> it = getPort().getDataFormats().values().iterator(); 
		while (it.hasNext())
			return it.next();
		return dataFormat;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getFormatStr() {
		DataFormat format = getFormat();
		return format == null ? null : format.getName();
	}


	/**
	 * <!-- begin-user-doc -->
	 * assume GlobalConfigs allowed handles to be sorted according priority/preference
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isAllowed() {

		//InOutParameter iop = ((InOutParameter)getParameter());
		
		// check handles
		if (getSupportedHandles(true).isEmpty())
		{
			if (getSupportedHandles(false).isEmpty())
				GlobalVar.setLastErrorString(GlobalConstants.ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_TOOL);
			else
				GlobalVar.setLastErrorString(GlobalConstants.ERROR_NO_VALID_DATA_HANDLE_AVAILABLE_BY_CONFIG);
			return false;
		}
		return true;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getSupportedHandles(boolean applyConfig) {
		return getParameter().getSupportedHandles(applyConfig);
	}

	/**
	 * TODO check formats defined by parameter
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean match(Data testData, boolean applyConfig) {

		boolean match = false;
		//check formats defined by parameter
		
		
		// check handles
		EList<String>  handles1 = getSupportedHandles(true);
		EList<String>  handles2 = testData.getSupportedHandles(true);
		if (getParameter() != null && testData.getParameter()!=null)
		{
			if (handles1.isEmpty() && handles2.isEmpty())
			{
				
			}
			else if (!handles1.isEmpty() && !handles2.isEmpty())
			{
				for (String handle:handles1)
					if (handles2.contains(handle))
					{
						match = true;
						setPreferredHandle(handle);
						testData.setPreferredHandle(handle);
					}
			}
			else
			{
				
			}
		}
		if (match)
		{
			match = false;
			for (Entry<String, DataFormat> testDataFormat:testData.getPort().getDataFormats())
			{
				if (matchFormat(testDataFormat.getValue()))
					match = true;
			}
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean matchFormat(DataFormat testDataFormat) {
		
		for (Entry<String, DataFormat> dataFormat:getPort().getDataFormats())
		{
			//logger.debug(testDataFormat+" "+dataFormat);
			if (testDataFormat.match(dataFormat.getValue()))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getDataResourceName() {
		return dataResourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataResourceName(URI newDataResourceName) {
		URI oldDataResourceName = dataResourceName;
		dataResourceName = newDataResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__DATA_RESOURCE_NAME, oldDataResourceName, dataResourceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA__PARAMETER, oldParameter, parameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreferredHandle() {
		return preferredHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredHandle(String newPreferredHandle) {
		String oldPreferredHandle = preferredHandle;
		preferredHandle = newPreferredHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA__PREFERRED_HANDLE, oldPreferredHandle, preferredHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA__LABEL:
				return getLabel();
			case DataPackage.DATA__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case DataPackage.DATA__OUTPUT:
				return isOutput();
			case DataPackage.DATA__DATA_RESOURCE_NAME:
				return getDataResourceName();
			case DataPackage.DATA__NAME:
				return getName();
			case DataPackage.DATA__DESCRIPTION:
				return getDescription();
			case DataPackage.DATA__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case DataPackage.DATA__PREFERRED_HANDLE:
				return getPreferredHandle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA__LABEL:
				setLabel((String)newValue);
				return;
			case DataPackage.DATA__PORT:
				setPort((DataPort)newValue);
				return;
			case DataPackage.DATA__OUTPUT:
				setOutput((Boolean)newValue);
				return;
			case DataPackage.DATA__DATA_RESOURCE_NAME:
				setDataResourceName((URI)newValue);
				return;
			case DataPackage.DATA__NAME:
				setName((String)newValue);
				return;
			case DataPackage.DATA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DataPackage.DATA__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case DataPackage.DATA__PREFERRED_HANDLE:
				setPreferredHandle((String)newValue);
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
			case DataPackage.DATA__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataPackage.DATA__PORT:
				setPort((DataPort)null);
				return;
			case DataPackage.DATA__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case DataPackage.DATA__DATA_RESOURCE_NAME:
				setDataResourceName(DATA_RESOURCE_NAME_EDEFAULT);
				return;
			case DataPackage.DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DataPackage.DATA__PARAMETER:
				setParameter((Parameter)null);
				return;
			case DataPackage.DATA__PREFERRED_HANDLE:
				setPreferredHandle(PREFERRED_HANDLE_EDEFAULT);
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
			case DataPackage.DATA__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataPackage.DATA__PORT:
				return port != null;
			case DataPackage.DATA__OUTPUT:
				return output != OUTPUT_EDEFAULT;
			case DataPackage.DATA__DATA_RESOURCE_NAME:
				return DATA_RESOURCE_NAME_EDEFAULT == null ? dataResourceName != null : !DATA_RESOURCE_NAME_EDEFAULT.equals(dataResourceName);
			case DataPackage.DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DataPackage.DATA__PARAMETER:
				return parameter != null;
			case DataPackage.DATA__PREFERRED_HANDLE:
				return PREFERRED_HANDLE_EDEFAULT == null ? preferredHandle != null : !PREFERRED_HANDLE_EDEFAULT.equals(preferredHandle);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", output: ");
		result.append(output);
		result.append(", dataResourceName: ");
		result.append(dataResourceName);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", preferredHandle: ");
		result.append(preferredHandle);
		result.append(')');
		return result.toString();
	}

} //DataImpl
