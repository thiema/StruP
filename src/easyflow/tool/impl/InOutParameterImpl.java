/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.tool.InOutParameter;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Out Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getFilenameCreation <em>Filename Creation</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getFormats <em>Formats</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getDataPort <em>Data Port</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getConvertGrouping <em>Convert Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InOutParameterImpl extends ParameterImpl implements InOutParameter {
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
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected Boolean extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilenameCreation() <em>Filename Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameCreation()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilenameCreation() <em>Filename Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameCreation()
	 * @generated
	 * @ordered
	 */
	protected String filenameCreation = FILENAME_CREATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormats() <em>Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formats;
	/**
	 * The default value of the '{@link #getDataPort() <em>Data Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataPort() <em>Data Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPort()
	 * @generated
	 * @ordered
	 */
	protected String dataPort = DATA_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConvertGrouping() <em>Convert Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERT_GROUPING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConvertGrouping() <em>Convert Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertGrouping()
	 * @generated
	 * @ordered
	 */
	protected String convertGrouping = CONVERT_GROUPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InOutParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.IN_OUT_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.IN_OUT_PARAMETER__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Boolean newExtension) {
		Boolean oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.IN_OUT_PARAMETER__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilenameCreation() {
		return filenameCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilenameCreation(String newFilenameCreation) {
		String oldFilenameCreation = filenameCreation;
		filenameCreation = newFilenameCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION, oldFilenameCreation, filenameCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormats() {
		if (formats == null) {
			formats = new EDataTypeUniqueEList<String>(String.class, this, ToolPackage.IN_OUT_PARAMETER__FORMATS);
		}
		return formats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataPort() {
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPort(String newDataPort) {
		String oldDataPort = dataPort;
		dataPort = newDataPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.IN_OUT_PARAMETER__DATA_PORT, oldDataPort, dataPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConvertGrouping() {
		return convertGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertGrouping(String newConvertGrouping) {
		String oldConvertGrouping = convertGrouping;
		convertGrouping = newConvertGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.IN_OUT_PARAMETER__CONVERT_GROUPING, oldConvertGrouping, convertGrouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean omitExtension() {
		if (getExtension() == null)
			return false;
		else
			return !getExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isAllowedConversion(String groupingStrFrom, String groupingStrTo) {
		
		String convertGrouping = getConvertGrouping(null); 
		if (convertGrouping.equalsIgnoreCase(GlobalConstants.CONVERT_GROUPING_ANY))
			return true;
		else if (convertGrouping.equalsIgnoreCase(GlobalConstants.CONVERT_GROUPING_NONE))
			return false;
		else if (groupingStrFrom.equalsIgnoreCase(groupingStrTo))
			return true;
		else if ((groupingStrFrom+"_to_"+groupingStrTo).equalsIgnoreCase(convertGrouping))
			return true;
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getConvertGrouping(String default_) {
		if (getConvertGrouping() != null)
			return getConvertGrouping();
		else if (default_ != null)
			return default_;
		else
			return GlobalConfig.getConvertGrouping();
			
	}

	public boolean matches(InOutParameter templateParameter) {
		
		// ckeck format
		boolean doesFormatMatch = 
				templateParameter.getFormats().isEmpty() ||
				templateParameter.getFormats().containsAll(getFormats());
				
		// check output/input match
		boolean doesInOutDataMatch = false;
		if (isOutput() && templateParameter.isOutput() ||
				!isOutput() && !templateParameter.isOutput())
			doesInOutDataMatch = true;
			
		return doesFormatMatch && doesInOutDataMatch && ((Parameter)this).matches((Parameter)templateParameter);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				return isOutput();
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				return getExtension();
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				return getFilenameCreation();
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				return getFormats();
			case ToolPackage.IN_OUT_PARAMETER__DATA_PORT:
				return getDataPort();
			case ToolPackage.IN_OUT_PARAMETER__CONVERT_GROUPING:
				return getConvertGrouping();
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
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				setOutput((Boolean)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				setExtension((Boolean)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				setFilenameCreation((String)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				getFormats().clear();
				getFormats().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__DATA_PORT:
				setDataPort((String)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__CONVERT_GROUPING:
				setConvertGrouping((String)newValue);
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
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				setFilenameCreation(FILENAME_CREATION_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				getFormats().clear();
				return;
			case ToolPackage.IN_OUT_PARAMETER__DATA_PORT:
				setDataPort(DATA_PORT_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__CONVERT_GROUPING:
				setConvertGrouping(CONVERT_GROUPING_EDEFAULT);
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
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				return output != OUTPUT_EDEFAULT;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				return FILENAME_CREATION_EDEFAULT == null ? filenameCreation != null : !FILENAME_CREATION_EDEFAULT.equals(filenameCreation);
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				return formats != null && !formats.isEmpty();
			case ToolPackage.IN_OUT_PARAMETER__DATA_PORT:
				return DATA_PORT_EDEFAULT == null ? dataPort != null : !DATA_PORT_EDEFAULT.equals(dataPort);
			case ToolPackage.IN_OUT_PARAMETER__CONVERT_GROUPING:
				return CONVERT_GROUPING_EDEFAULT == null ? convertGrouping != null : !CONVERT_GROUPING_EDEFAULT.equals(convertGrouping);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ToolPackage.IN_OUT_PARAMETER___OMIT_EXTENSION:
				return omitExtension();
			case ToolPackage.IN_OUT_PARAMETER___IS_ALLOWED_CONVERSION__STRING_STRING:
				return isAllowedConversion((String)arguments.get(0), (String)arguments.get(1));
			case ToolPackage.IN_OUT_PARAMETER___GET_CONVERT_GROUPING__STRING:
				return getConvertGrouping((String)arguments.get(0));
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
		result.append(" (output: ");
		result.append(output);
		result.append(", extension: ");
		result.append(extension);
		result.append(", filenameCreation: ");
		result.append(filenameCreation);
		result.append(", formats: ");
		result.append(formats);
		result.append(", dataPort: ");
		result.append(dataPort);
		result.append(", convertGrouping: ");
		result.append(convertGrouping);
		result.append(')');
		return result.toString();
	}

} //InOutParameterImpl
