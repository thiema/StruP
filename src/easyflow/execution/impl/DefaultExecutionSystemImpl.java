/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.impl;

import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Execution System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.impl.DefaultExecutionSystemImpl#isUnix <em>Unix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultExecutionSystemImpl extends IExecutionSystemImpl implements DefaultExecutionSystem {
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
	protected DefaultExecutionSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.DEFAULT_EXECUTION_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX, oldUnix, unix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX:
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
			case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX:
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
			case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX:
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
			case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unix: ");
		result.append(unix);
		result.append(')');
		return result.toString();
	}

} //DefaultExecutionSystemImpl
