/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.DefaultToolElement;
import easyflow.tool.Interpreter;
import easyflow.tool.ToolPackage;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpreter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.InterpreterImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.tool.impl.InterpreterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link easyflow.tool.impl.InterpreterImpl#getExe <em>Exe</em>}</li>
 *   <li>{@link easyflow.tool.impl.InterpreterImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterpreterImpl extends EObjectImpl implements Interpreter {
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
	 * The default value of the '{@link #getExe() <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExe()
	 * @generated
	 * @ordered
	 */
	protected static final String EXE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExe() <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExe()
	 * @generated
	 * @ordered
	 */
	protected String exe = EXE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpreterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolPackage.Literals.INTERPRETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.INTERPRETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.INTERPRETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExe() {
		return exe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExe(String newExe) {
		String oldExe = exe;
		exe = newExe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.INTERPRETER__EXE, oldExe, exe));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.INTERPRETER__NAME:
				return getName();
			case ToolPackage.INTERPRETER__DESCRIPTION:
				return getDescription();
			case ToolPackage.INTERPRETER__EXE:
				return getExe();
			case ToolPackage.INTERPRETER__LOGGER:
				return getLogger();
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
			case ToolPackage.INTERPRETER__NAME:
				setName((String)newValue);
				return;
			case ToolPackage.INTERPRETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ToolPackage.INTERPRETER__EXE:
				setExe((String)newValue);
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
			case ToolPackage.INTERPRETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolPackage.INTERPRETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ToolPackage.INTERPRETER__EXE:
				setExe(EXE_EDEFAULT);
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
			case ToolPackage.INTERPRETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolPackage.INTERPRETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ToolPackage.INTERPRETER__EXE:
				return EXE_EDEFAULT == null ? exe != null : !EXE_EDEFAULT.equals(exe);
			case ToolPackage.INTERPRETER__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
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
				case ToolPackage.INTERPRETER__NAME: return ToolPackage.DEFAULT_TOOL_ELEMENT__NAME;
				case ToolPackage.INTERPRETER__DESCRIPTION: return ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION;
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
				case ToolPackage.DEFAULT_TOOL_ELEMENT__NAME: return ToolPackage.INTERPRETER__NAME;
				case ToolPackage.DEFAULT_TOOL_ELEMENT__DESCRIPTION: return ToolPackage.INTERPRETER__DESCRIPTION;
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
		result.append(", exe: ");
		result.append(exe);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //InterpreterImpl
