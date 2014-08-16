/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util.maps.impl;

import easyflow.core.Task;
import easyflow.data.DataPort;
import easyflow.util.maps.MapsPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task To Data Ports Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.util.maps.impl.TaskToDataPortsMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link easyflow.util.maps.impl.TaskToDataPortsMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskToDataPortsMapImpl extends EObjectImpl implements BasicEMap.Entry<Task,EList<DataPort>> {
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected Task key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskToDataPortsMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapsPackage.Literals.TASK_TO_DATA_PORTS_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTypedKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Task)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(Task newKey) {
		Task oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getTypedValue() {
		if (value == null) {
			value = new EObjectResolvingEList<DataPort>(DataPort.class, this, MapsPackage.TASK_TO_DATA_PORTS_MAP__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY:
				if (resolve) return getTypedKey();
				return basicGetTypedKey();
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__VALUE:
				return getTypedValue();
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
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY:
				setTypedKey((Task)newValue);
				return;
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__VALUE:
				getTypedValue().clear();
				getTypedValue().addAll((Collection<? extends DataPort>)newValue);
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
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY:
				setTypedKey((Task)null);
				return;
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__VALUE:
				getTypedValue().clear();
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
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__KEY:
				return key != null;
			case MapsPackage.TASK_TO_DATA_PORTS_MAP__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Task key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> setValue(EList<DataPort> value) {
		EList<DataPort> oldValue = getValue();
		getTypedValue().clear();
		getTypedValue().addAll(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<Task, EList<DataPort>> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<Task, EList<DataPort>>)container.eGet(eContainmentFeature());
	}

} //TaskToDataPortsMapImpl
