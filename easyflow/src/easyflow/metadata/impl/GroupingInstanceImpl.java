/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata.impl;

import easyflow.metadata.Grouping;
import easyflow.metadata.GroupingFeature;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.MetadataPackage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.StringToGroupingFeatureMapImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.metadata.impl.GroupingInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.metadata.impl.GroupingInstanceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link easyflow.metadata.impl.GroupingInstanceImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.metadata.impl.GroupingInstanceImpl#getGroupingStr <em>Grouping Str</em>}</li>
 *   <li>{@link easyflow.metadata.impl.GroupingInstanceImpl#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupingInstanceImpl extends EObjectImpl implements GroupingInstance {
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, GroupingFeature> features;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected Grouping grouping;

	/**
	 * The default value of the '{@link #getGroupingStr() <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPING_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupingStr() <em>Grouping Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingStr()
	 * @generated
	 * @ordered
	 */
	protected String groupingStr = GROUPING_STR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> records;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupingInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetadataPackage.Literals.GROUPING_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.GROUPING_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, GroupingFeature> getFeatures() {
		if (features == null) {
			features = new EcoreEMap<String,GroupingFeature>(MapsPackage.Literals.STRING_TO_GROUPING_FEATURE_MAP, StringToGroupingFeatureMapImpl.class, this, MetadataPackage.GROUPING_INSTANCE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouping getGrouping() {
		if (grouping != null && grouping.eIsProxy()) {
			InternalEObject oldGrouping = (InternalEObject)grouping;
			grouping = (Grouping)eResolveProxy(oldGrouping);
			if (grouping != oldGrouping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetadataPackage.GROUPING_INSTANCE__GROUPING, oldGrouping, grouping));
			}
		}
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouping basicGetGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(Grouping newGrouping) {
		Grouping oldGrouping = grouping;
		grouping = newGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.GROUPING_INSTANCE__GROUPING, oldGrouping, grouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupingStr() {
		return groupingStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingStr(String newGroupingStr) {
		String oldGroupingStr = groupingStr;
		groupingStr = newGroupingStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetadataPackage.GROUPING_INSTANCE__GROUPING_STR, oldGroupingStr, groupingStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRecords() {
		if (records == null) {
			records = new EDataTypeUniqueEList<String>(String.class, this, MetadataPackage.GROUPING_INSTANCE__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<String> getOverlappingRecords(EList<String> records) {
		EList<String> overlaps = new BasicEList<String>();
		for (String rec1:records)
			if (getRecords().contains(rec1))
				overlaps.add(rec1);
		return overlaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetadataPackage.GROUPING_INSTANCE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case MetadataPackage.GROUPING_INSTANCE__NAME:
				return getName();
			case MetadataPackage.GROUPING_INSTANCE__FEATURES:
				if (coreType) return getFeatures();
				else return getFeatures().map();
			case MetadataPackage.GROUPING_INSTANCE__GROUPING:
				if (resolve) return getGrouping();
				return basicGetGrouping();
			case MetadataPackage.GROUPING_INSTANCE__GROUPING_STR:
				return getGroupingStr();
			case MetadataPackage.GROUPING_INSTANCE__RECORDS:
				return getRecords();
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
			case MetadataPackage.GROUPING_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case MetadataPackage.GROUPING_INSTANCE__FEATURES:
				((EStructuralFeature.Setting)getFeatures()).set(newValue);
				return;
			case MetadataPackage.GROUPING_INSTANCE__GROUPING:
				setGrouping((Grouping)newValue);
				return;
			case MetadataPackage.GROUPING_INSTANCE__GROUPING_STR:
				setGroupingStr((String)newValue);
				return;
			case MetadataPackage.GROUPING_INSTANCE__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends String>)newValue);
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
			case MetadataPackage.GROUPING_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetadataPackage.GROUPING_INSTANCE__FEATURES:
				getFeatures().clear();
				return;
			case MetadataPackage.GROUPING_INSTANCE__GROUPING:
				setGrouping((Grouping)null);
				return;
			case MetadataPackage.GROUPING_INSTANCE__GROUPING_STR:
				setGroupingStr(GROUPING_STR_EDEFAULT);
				return;
			case MetadataPackage.GROUPING_INSTANCE__RECORDS:
				getRecords().clear();
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
			case MetadataPackage.GROUPING_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetadataPackage.GROUPING_INSTANCE__FEATURES:
				return features != null && !features.isEmpty();
			case MetadataPackage.GROUPING_INSTANCE__GROUPING:
				return grouping != null;
			case MetadataPackage.GROUPING_INSTANCE__GROUPING_STR:
				return GROUPING_STR_EDEFAULT == null ? groupingStr != null : !GROUPING_STR_EDEFAULT.equals(groupingStr);
			case MetadataPackage.GROUPING_INSTANCE__RECORDS:
				return records != null && !records.isEmpty();
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
		result.append(", groupingStr: ");
		result.append(groupingStr);
		result.append(", records: ");
		result.append(records);
		result.append(')');
		return result.toString();
	}

} //GroupingInstanceImpl
