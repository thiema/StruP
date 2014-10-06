/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.InOutParameter;
import easyflow.tool.Parameter;
import easyflow.tool.ToolPackage;
import java.util.Collection;

import org.eclipse.core.runtime.content.IContentTypeManager.ISelectionPolicy;
import org.eclipse.emf.common.notify.Notification;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getFormats <em>Formats</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link easyflow.tool.impl.InOutParameterImpl#getFilenameCreation <em>Filename Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InOutParameterImpl extends ParameterImpl implements InOutParameter {
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
	 * @generated not
	 */
	public boolean omitExtension() {
		if (getExtension() == null)
			return false;
		else
			return !getExtension();
	}

	public boolean matches(InOutParameter templateParameter) {
		
		// ckeck format
		boolean doesFormatMatch = 
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
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				return getFormats();
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				return isOutput();
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				return getExtension();
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				return getFilenameCreation();
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
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				getFormats().clear();
				getFormats().addAll((Collection<? extends String>)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				setOutput((Boolean)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				setExtension((Boolean)newValue);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				setFilenameCreation((String)newValue);
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
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				getFormats().clear();
				return;
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				setFilenameCreation(FILENAME_CREATION_EDEFAULT);
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
			case ToolPackage.IN_OUT_PARAMETER__FORMATS:
				return formats != null && !formats.isEmpty();
			case ToolPackage.IN_OUT_PARAMETER__OUTPUT:
				return output != OUTPUT_EDEFAULT;
			case ToolPackage.IN_OUT_PARAMETER__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case ToolPackage.IN_OUT_PARAMETER__FILENAME_CREATION:
				return FILENAME_CREATION_EDEFAULT == null ? filenameCreation != null : !FILENAME_CREATION_EDEFAULT.equals(filenameCreation);
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
		result.append(" (formats: ");
		result.append(formats);
		result.append(", output: ");
		result.append(output);
		result.append(", extension: ");
		result.append(extension);
		result.append(", filenameCreation: ");
		result.append(filenameCreation);
		result.append(')');
		return result.toString();
	}

} //InOutParameterImpl
