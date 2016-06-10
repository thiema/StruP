/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow.impl;

import easyflow.execution.DefaultExecutionSystem;
import easyflow.execution.ExecutionPackage;
import easyflow.execution.impl.IExecutionSystemImpl;
import easyflow.execution.makeflow.Makeflow;
import easyflow.execution.makeflow.MakeflowPackage;
import easyflow.tool.Rule;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Makeflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.execution.makeflow.impl.MakeflowImpl#isUnix <em>Unix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MakeflowImpl extends IExecutionSystemImpl implements Makeflow {
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
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(Makeflow.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MakeflowPackage.Literals.MAKEFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MakeflowPackage.MAKEFLOW__UNIX, oldUnix, unix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MakeflowPackage.MAKEFLOW__UNIX:
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
			case MakeflowPackage.MAKEFLOW__UNIX:
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
			case MakeflowPackage.MAKEFLOW__UNIX:
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
			case MakeflowPackage.MAKEFLOW__UNIX:
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
				case MakeflowPackage.MAKEFLOW__UNIX: return ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX;
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
				case ExecutionPackage.DEFAULT_EXECUTION_SYSTEM__UNIX: return MakeflowPackage.MAKEFLOW__UNIX;
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

	/**
	 * <!-- begin-user-doc -->
	 *  a makeflow rule is of the form:
	 * 
	 *  targetA targetB: dep1 dep2 dep3
	 *  	command arg1 arg2 optX optY input1 input2 input3 targetA targetB

	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String generateExecutionString(Rule rule) {
		
		String cmd     = rule.createCommandLine();
		
		if (rule.isWriteToPipe())
			return null;
		
		String delim   = " ";
		String targets = StringUtils.join(rule.getTargets(), delim);
		String deps    = StringUtils.join(rule.getDependencies(), delim);
		
		return targets+": "+deps+"\n\t"+cmd+"\n\n";
	}

} //MakeflowImpl
