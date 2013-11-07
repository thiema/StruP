/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.DataFormat;
import easyflow.tool.DataPort;
import easyflow.tool.ToolPackage;
import easyflow.traversal.GroupingCriterion;

import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToDataFormatMapImpl;
import java.util.Collection;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.tool.impl.DataPortImpl#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.tool.impl.DataPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link easyflow.tool.impl.DataPortImpl#getDataFormats <em>Data Formats</em>}</li>
 *   <li>{@link easyflow.tool.impl.DataPortImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.impl.DataPortImpl#getBitPos <em>Bit Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPortImpl extends DefaultToolElementImpl implements DataPort {
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
	 * The cached value of the '{@link #getDataFormats() <em>Data Formats</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormats()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, DataFormat> dataFormats;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitPos() <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitPos()
	 * @generated
	 * @ordered
	 */
	protected static final short BIT_POS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getBitPos() <em>Bit Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitPos()
	 * @generated
	 * @ordered
	 */
	protected short bitPos = BIT_POS_EDEFAULT;

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
		return ToolPackage.Literals.DATA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupingCriterion> getGroupingCriteria() {
		if (groupingCriteria == null) {
			groupingCriteria = new EObjectResolvingEList<GroupingCriterion>(GroupingCriterion.class, this, ToolPackage.DATA_PORT__GROUPING_CRITERIA);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.DATA_PORT__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, DataFormat> getDataFormats() {
		if (dataFormats == null) {
			dataFormats = new EcoreEMap<String,DataFormat>(MapsPackage.Literals.STRING_TO_DATA_FORMAT_MAP, StringToDataFormatMapImpl.class, this, ToolPackage.DATA_PORT__DATA_FORMATS);
		}
		return dataFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.DATA_PORT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getBitPos() {
		return bitPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitPos(short newBitPos) {
		short oldBitPos = bitPos;
		bitPos = newBitPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.DATA_PORT__BIT_POS, oldBitPos, bitPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompatible(DataPort dataPort) {
		for (Entry<String, DataFormat> entryDataFormat:getDataFormats().entrySet())
		{
			for (Entry<String, DataFormat> entryDataFormat2:dataPort.getDataFormats().entrySet())
				if (entryDataFormat.getValue().getName().equalsIgnoreCase(entryDataFormat2.getValue().getName()))
					return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolPackage.DATA_PORT__DATA_FORMATS:
				return ((InternalEList<?>)getDataFormats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolPackage.DATA_PORT__GROUPING_CRITERIA:
				return getGroupingCriteria();
			case ToolPackage.DATA_PORT__CARDINALITY:
				return getCardinality();
			case ToolPackage.DATA_PORT__DATA_FORMATS:
				if (coreType) return getDataFormats();
				else return getDataFormats().map();
			case ToolPackage.DATA_PORT__OPTIONAL:
				return isOptional();
			case ToolPackage.DATA_PORT__BIT_POS:
				return getBitPos();
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
			case ToolPackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				getGroupingCriteria().addAll((Collection<? extends GroupingCriterion>)newValue);
				return;
			case ToolPackage.DATA_PORT__CARDINALITY:
				setCardinality((Short)newValue);
				return;
			case ToolPackage.DATA_PORT__DATA_FORMATS:
				((EStructuralFeature.Setting)getDataFormats()).set(newValue);
				return;
			case ToolPackage.DATA_PORT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ToolPackage.DATA_PORT__BIT_POS:
				setBitPos((Short)newValue);
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
			case ToolPackage.DATA_PORT__GROUPING_CRITERIA:
				getGroupingCriteria().clear();
				return;
			case ToolPackage.DATA_PORT__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case ToolPackage.DATA_PORT__DATA_FORMATS:
				getDataFormats().clear();
				return;
			case ToolPackage.DATA_PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ToolPackage.DATA_PORT__BIT_POS:
				setBitPos(BIT_POS_EDEFAULT);
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
			case ToolPackage.DATA_PORT__GROUPING_CRITERIA:
				return groupingCriteria != null && !groupingCriteria.isEmpty();
			case ToolPackage.DATA_PORT__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case ToolPackage.DATA_PORT__DATA_FORMATS:
				return dataFormats != null && !dataFormats.isEmpty();
			case ToolPackage.DATA_PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ToolPackage.DATA_PORT__BIT_POS:
				return bitPos != BIT_POS_EDEFAULT;
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
		result.append(", optional: ");
		result.append(optional);
		result.append(", bitPos: ");
		result.append(bitPos);
		result.append(')');
		return result.toString();
	}

} //DataPortImpl
