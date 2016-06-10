/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.data.impl;

import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.data.Data;
import easyflow.data.DataMatch;
import easyflow.data.DataPackage;
import java.lang.reflect.InvocationTargetException;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.data.impl.DataMatchImpl#getParentData <em>Parent Data</em>}</li>
 *   <li>{@link easyflow.data.impl.DataMatchImpl#getChildData <em>Child Data</em>}</li>
 *   <li>{@link easyflow.data.impl.DataMatchImpl#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMatchImpl extends MinimalEObjectImpl.Container implements DataMatch {
	
	private static Logger logger = Logger.getLogger(DataMatch.class);
	
	/**
	 * The cached value of the '{@link #getParentData() <em>Parent Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentData()
	 * @generated
	 * @ordered
	 */
	protected Data parentData;

	/**
	 * The cached value of the '{@link #getChildData() <em>Child Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildData()
	 * @generated
	 * @ordered
	 */
	protected Data childData;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final long SCORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected long score = SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getParentData() {
		if (parentData != null && parentData.eIsProxy()) {
			InternalEObject oldParentData = (InternalEObject)parentData;
			parentData = (Data)eResolveProxy(oldParentData);
			if (parentData != oldParentData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_MATCH__PARENT_DATA, oldParentData, parentData));
			}
		}
		return parentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetParentData() {
		return parentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentData(Data newParentData) {
		Data oldParentData = parentData;
		parentData = newParentData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_MATCH__PARENT_DATA, oldParentData, parentData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getChildData() {
		if (childData != null && childData.eIsProxy()) {
			InternalEObject oldChildData = (InternalEObject)childData;
			childData = (Data)eResolveProxy(oldChildData);
			if (childData != oldChildData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_MATCH__CHILD_DATA, oldChildData, childData));
			}
		}
		return childData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetChildData() {
		return childData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildData(Data newChildData) {
		Data oldChildData = childData;
		childData = newChildData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_MATCH__CHILD_DATA, oldChildData, childData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(long newScore) {
		long oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_MATCH__SCORE, oldScore, score));
	}

	static final long matchingPreferredHandleMask = 0x1000;
	static final long matchingSecondaryHandleMask = 0x0100;
	static final long parentDefinedMask           = 0x0010;
	static final long childDefinedMask            = 0x0001;
	static final long defaultScore                = 0x0000;


	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public long computeScore(EMap<String, String> constraints) {
		
		
		
		String preferredHandle;
		long score = defaultScore;
		
		if (constraints.containsKey(GlobalConstants.PREFERRED_HANDLE_PARAM_NAME))
			preferredHandle = constraints.get(GlobalConstants.PREFERRED_HANDLE_PARAM_NAME);
		else
			preferredHandle = GlobalConfig.getDefaultHandle();
		
		
		if (getChildData() != null && getParentData() != null)
		{
			score|=childDefinedMask;
			score|=parentDefinedMask;
			if (getChildData().getSupportedHandles().contains(preferredHandle) &&	
			    getParentData().getSupportedHandles().contains(preferredHandle))
				score|=matchingPreferredHandleMask;
			
			if (//(score & matchingPreferredHandleMask) == matchingPreferredHandleMask) ||
				(getChildData().getSupportedHandles().contains(preferredHandle) && getChildData().getSupportedHandles().size() > 1) ||
				!getChildData().getSupportedHandles().isEmpty()
				&&
				(getParentData().getSupportedHandles().contains(preferredHandle) && getParentData().getSupportedHandles().size() > 1) ||
				!getParentData().getSupportedHandles().isEmpty()
				)
			{
				for (String handle : getChildData().getSupportedHandles())
					if (!handle.equals(preferredHandle) && getParentData().getSupportedHandles().contains(handle))
					{
						score|=matchingSecondaryHandleMask;
						break;
					}
			}
		}
		else if (getChildData() == null && getParentData() != null)
		{
			score|=parentDefinedMask;
			 if (getParentData().getSupportedHandles().contains(preferredHandle))
				 score|=matchingPreferredHandleMask;
			 else if (!getParentData().getSupportedHandles().isEmpty())
				 score|=matchingSecondaryHandleMask;
			 
		}	
		else if (getParentData() == null && getChildData()  != null)
		{
			score|=childDefinedMask;
			 if (getChildData().getSupportedHandles().contains(preferredHandle))
				 score|=matchingPreferredHandleMask;
			 else if (!getChildData().getSupportedHandles().isEmpty())
				 score|=matchingSecondaryHandleMask;			
		}
		
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPipable() {
		
		logger.debug("isPipable(): supported child/parent handles="
				+(getChildData() != null ? getChildData().getSupportedHandles() : null)+"/"
				+(getParentData()!= null ? getParentData().getSupportedHandles() : null));
		if (getChildData()  != null && getChildData().getSupportedHandles().contains(GlobalConstants.NAME_PIPE_HANDLE) &&
		    getParentData() != null && getParentData().getSupportedHandles().contains(GlobalConstants.NAME_PIPE_HANDLE))
		    	  return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_MATCH__PARENT_DATA:
				if (resolve) return getParentData();
				return basicGetParentData();
			case DataPackage.DATA_MATCH__CHILD_DATA:
				if (resolve) return getChildData();
				return basicGetChildData();
			case DataPackage.DATA_MATCH__SCORE:
				return getScore();
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
			case DataPackage.DATA_MATCH__PARENT_DATA:
				setParentData((Data)newValue);
				return;
			case DataPackage.DATA_MATCH__CHILD_DATA:
				setChildData((Data)newValue);
				return;
			case DataPackage.DATA_MATCH__SCORE:
				setScore((Long)newValue);
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
			case DataPackage.DATA_MATCH__PARENT_DATA:
				setParentData((Data)null);
				return;
			case DataPackage.DATA_MATCH__CHILD_DATA:
				setChildData((Data)null);
				return;
			case DataPackage.DATA_MATCH__SCORE:
				setScore(SCORE_EDEFAULT);
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
			case DataPackage.DATA_MATCH__PARENT_DATA:
				return parentData != null;
			case DataPackage.DATA_MATCH__CHILD_DATA:
				return childData != null;
			case DataPackage.DATA_MATCH__SCORE:
				return score != SCORE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.DATA_MATCH___COMPUTE_SCORE__EMAP:
				return computeScore((EMap<String, String>)arguments.get(0));
			case DataPackage.DATA_MATCH___IS_PIPABLE:
				return isPipable();
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
		result.append(" (score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //DataMatchImpl
