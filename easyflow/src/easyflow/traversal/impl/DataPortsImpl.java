/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.core.Task;

import easyflow.tool.DataPort;

import easyflow.traversal.DataPorts;
import easyflow.traversal.TraversalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.traversal.impl.DataPortsImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.traversal.impl.DataPortsImpl#getDataPorts <em>Data Ports</em>}</li>
 *   <li>{@link easyflow.traversal.impl.DataPortsImpl#getLastTasks <em>Last Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPortsImpl extends EObjectImpl implements DataPorts {
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
	 * The cached value of the '{@link #getDataPorts() <em>Data Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> dataPorts;

	/**
	 * The cached value of the '{@link #getLastTasks() <em>Last Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> lastTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraversalPackage.Literals.DATA_PORTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraversalPackage.DATA_PORTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getDataPorts() {
		if (dataPorts == null) {
			dataPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, TraversalPackage.DATA_PORTS__DATA_PORTS);
		}
		return dataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getLastTasks() {
		if (lastTasks == null) {
			lastTasks = new EObjectResolvingEList<Task>(Task.class, this, TraversalPackage.DATA_PORTS__LAST_TASKS);
		}
		return lastTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraversalPackage.DATA_PORTS__NAME:
				return getName();
			case TraversalPackage.DATA_PORTS__DATA_PORTS:
				return getDataPorts();
			case TraversalPackage.DATA_PORTS__LAST_TASKS:
				return getLastTasks();
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
			case TraversalPackage.DATA_PORTS__NAME:
				setName((String)newValue);
				return;
			case TraversalPackage.DATA_PORTS__DATA_PORTS:
				getDataPorts().clear();
				getDataPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case TraversalPackage.DATA_PORTS__LAST_TASKS:
				getLastTasks().clear();
				getLastTasks().addAll((Collection<? extends Task>)newValue);
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
			case TraversalPackage.DATA_PORTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TraversalPackage.DATA_PORTS__DATA_PORTS:
				getDataPorts().clear();
				return;
			case TraversalPackage.DATA_PORTS__LAST_TASKS:
				getLastTasks().clear();
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
			case TraversalPackage.DATA_PORTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TraversalPackage.DATA_PORTS__DATA_PORTS:
				return dataPorts != null && !dataPorts.isEmpty();
			case TraversalPackage.DATA_PORTS__LAST_TASKS:
				return lastTasks != null && !lastTasks.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataPortsImpl
