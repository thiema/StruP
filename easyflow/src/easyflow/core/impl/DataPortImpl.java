/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.core.CorePackage;
import easyflow.core.DataFormat;
import easyflow.core.DataPort;
import easyflow.core.GroupingCriterion;

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
 * An implementation of the model object '<em><b>Data Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.core.impl.DataPortImpl#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.impl.DataPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.core.impl.DataPortImpl#getDataFormat <em>Data Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPortImpl extends EObjectImpl implements DataPort {
	/**
	 * The cached value of the '{@link #getGroupingCriteria() <em>Grouping Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupingCriterion> groupingCriteria;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final short CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected short cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected DataFormat dataFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DATA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupingCriterion> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EObjectResolvingEList<GroupingCriterion>(GroupingCriterion.class, this, CorePackage.DATA_PORT__GROUPING_CRITERIA);
		}
		return groupingCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(short newCardinality) {
		short oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_PORT__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat getDataFormat() {
		if (dataFormat != null && dataFormat.eIsProxy()) {
			InternalEObject oldDataFormat = (InternalEObject)dataFormat;
			dataFormat = (DataFormat)eResolveProxy(oldDataFormat);
			if (dataFormat != oldDataFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DATA_PORT__DATA_FORMAT, oldDataFormat, dataFormat));
			}
		}
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat basicGetDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataFormat(DataFormat newDataFormat) {
		DataFormat oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_PORT__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DATA_PORT__GROUPING_CRITERIA:
				return getGroupingCriteria();
			case CorePackage.DATA_PORT__CARDINALITY:
				return getCardinality();
			case CorePackage.DATA_PORT__DATA_FORMAT:
				if (resolve) return getDataFormat();
				return basicGetDataFormat();
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
			case CorePackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				getGroupingCriteria().addAll((Collection<? extends GroupingCriterion>)newValue);
				return;
			case CorePackage.DATA_PORT__CARDINALITY:
				setCardinality((Short)newValue);
				return;
			case CorePackage.DATA_PORT__DATA_FORMAT:
				setDataFormat((DataFormat)newValue);
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
			case CorePackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				return;
			case CorePackage.DATA_PORT__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case CorePackage.DATA_PORT__DATA_FORMAT:
				setDataFormat((DataFormat)null);
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
			case CorePackage.DATA_PORT__GROUPING_CRITERIA:
				return groupingCriteria != null && !groupingCriteria.isEmpty();
			case CorePackage.DATA_PORT__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case CorePackage.DATA_PORT__DATA_FORMAT:
				return dataFormat != null;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //DataPortImpl
