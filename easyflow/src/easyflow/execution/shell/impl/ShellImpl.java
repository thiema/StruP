/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.shell.impl;

import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;
import easyflow.execution.impl.IExecutionSystemImpl;
import easyflow.execution.shell.Shell;
import easyflow.execution.shell.ShellPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.shell.impl.ShellImpl#isUnix <em>Unix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShellImpl extends IExecutionSystemImpl implements Shell {
	/**
	 * The default value of the '{@link #isUnix() <em>Unix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIX_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isUnix() <em>Unix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnix()
	 * @generated
	 * @ordered
	 */
	protected boolean unix = UNIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShellPackage.Literals.SHELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnix() {
		return unix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnix(boolean newUnix) {
		boolean oldUnix = unix;
		unix = newUnix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShellPackage.SHELL__UNIX, oldUnix, unix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShellPackage.SHELL__UNIX:
				return isUnix();
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
			case ShellPackage.SHELL__UNIX:
				setUnix((Boolean)newValue);
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
			case ShellPackage.SHELL__UNIX:
				setUnix(UNIX_EDEFAULT);
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
			case ShellPackage.SHELL__UNIX:
				return unix != UNIX_EDEFAULT;
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (derivedFeatureID) {
				case ShellPackage.SHELL__UNIX: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX;
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
		if (baseClass == DefaultExecutionSystem.class) {
			switch (baseFeatureID) {
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX: return ShellPackage.SHELL__UNIX;
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
		result.append(" (unix: ");
		result.append(unix);
		result.append(')');
		return result.toString();
	}

} //ShellImpl
