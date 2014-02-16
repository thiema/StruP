/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.DataPort;
import easyflow.core.ParentTaskResult;
import easyflow.core.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Task Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.ParentTaskResultImpl#getParentTask <em>Parent Task</em>}</li>
 *   <li>{@link easyflow.core.impl.ParentTaskResultImpl#getCoveredPorts <em>Covered Ports</em>}</li>
 *   <li>{@link easyflow.core.impl.ParentTaskResultImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link easyflow.core.impl.ParentTaskResultImpl#isGeneric <em>Generic</em>}</li>
 *   <li>{@link easyflow.core.impl.ParentTaskResultImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentTaskResultImpl extends EObjectImpl implements ParentTaskResult {
	/**
	 * The cached value of the '{@link #getParentTask() <em>Parent Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTask()
	 * @generated
	 * @ordered
	 */
	protected Task parentTask;

	/**
	 * The cached value of the '{@link #getCoveredPorts() <em>Covered Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> coveredPorts;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeneric() <em>Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneric()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneric() <em>Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneric()
	 * @generated
	 * @ordered
	 */
	protected boolean generic = GENERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentTaskResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PARENT_TASK_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getParentTask() {
		if (parentTask != null && parentTask.eIsProxy()) {
			InternalEObject oldParentTask = (InternalEObject)parentTask;
			parentTask = (Task)eResolveProxy(oldParentTask);
			if (parentTask != oldParentTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.PARENT_TASK_RESULT__PARENT_TASK, oldParentTask, parentTask));
			}
		}
		return parentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetParentTask() {
		return parentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTask(Task newParentTask) {
		Task oldParentTask = parentTask;
		parentTask = newParentTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARENT_TASK_RESULT__PARENT_TASK, oldParentTask, parentTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getCoveredPorts() {
		if (coveredPorts == null) {
			coveredPorts = new EObjectResolvingEList<DataPort>(DataPort.class, this, CorePackage.PARENT_TASK_RESULT__COVERED_PORTS);
		}
		return coveredPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARENT_TASK_RESULT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeneric() {
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneric(boolean newGeneric) {
		boolean oldGeneric = generic;
		generic = newGeneric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARENT_TASK_RESULT__GENERIC, oldGeneric, generic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARENT_TASK_RESULT__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PARENT_TASK_RESULT__PARENT_TASK:
				if (resolve) return getParentTask();
				return basicGetParentTask();
			case CorePackage.PARENT_TASK_RESULT__COVERED_PORTS:
				return getCoveredPorts();
			case CorePackage.PARENT_TASK_RESULT__CONDITION:
				return getCondition();
			case CorePackage.PARENT_TASK_RESULT__GENERIC:
				return isGeneric();
			case CorePackage.PARENT_TASK_RESULT__RANK:
				return getRank();
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
			case CorePackage.PARENT_TASK_RESULT__PARENT_TASK:
				setParentTask((Task)newValue);
				return;
			case CorePackage.PARENT_TASK_RESULT__COVERED_PORTS:
				getCoveredPorts().clear();
				getCoveredPorts().addAll((Collection<? extends DataPort>)newValue);
				return;
			case CorePackage.PARENT_TASK_RESULT__CONDITION:
				setCondition((String)newValue);
				return;
			case CorePackage.PARENT_TASK_RESULT__GENERIC:
				setGeneric((Boolean)newValue);
				return;
			case CorePackage.PARENT_TASK_RESULT__RANK:
				setRank((Integer)newValue);
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
			case CorePackage.PARENT_TASK_RESULT__PARENT_TASK:
				setParentTask((Task)null);
				return;
			case CorePackage.PARENT_TASK_RESULT__COVERED_PORTS:
				getCoveredPorts().clear();
				return;
			case CorePackage.PARENT_TASK_RESULT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case CorePackage.PARENT_TASK_RESULT__GENERIC:
				setGeneric(GENERIC_EDEFAULT);
				return;
			case CorePackage.PARENT_TASK_RESULT__RANK:
				setRank(RANK_EDEFAULT);
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
			case CorePackage.PARENT_TASK_RESULT__PARENT_TASK:
				return parentTask != null;
			case CorePackage.PARENT_TASK_RESULT__COVERED_PORTS:
				return coveredPorts != null && !coveredPorts.isEmpty();
			case CorePackage.PARENT_TASK_RESULT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case CorePackage.PARENT_TASK_RESULT__GENERIC:
				return generic != GENERIC_EDEFAULT;
			case CorePackage.PARENT_TASK_RESULT__RANK:
				return rank != RANK_EDEFAULT;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", generic: ");
		result.append(generic);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ParentTaskResultImpl
