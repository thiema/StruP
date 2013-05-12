/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping.impl;

import easyflow.core.impl.GroupingCriterionImpl;
import easyflow.sequencing.grouping.Group;
import easyflow.sequencing.grouping.GroupingPackage;
import easyflow.sequencing.grouping.IGroupingCriterion;
import easyflow.sequencing.grouping.Library;
import easyflow.sequencing.grouping.ReadGroup;

import easyflow.sequencing.grouping.Record;
import easyflow.sequencing.grouping.Sample;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Group</b></em>'.
 * @implements IGroupingCriterion
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getPlatformUnit <em>Platform Unit</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.ReadGroupImpl#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadGroupImpl extends GroupingCriterionImpl implements ReadGroup, IGroupingCriterion {
	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;
	/**
	 * The default value of the '{@link #getPlatformUnit() <em>Platform Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_UNIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPlatformUnit() <em>Platform Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformUnit()
	 * @generated
	 * @ordered
	 */
	protected String platformUnit = PLATFORM_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Record> records;
	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> samples;
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;
	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupingPackage.Literals.READ_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.READ_GROUP__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformUnit() {
		return platformUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformUnit(String newPlatformUnit) {
		String oldPlatformUnit = platformUnit;
		platformUnit = newPlatformUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.READ_GROUP__PLATFORM_UNIT, oldPlatformUnit, platformUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, GroupingPackage.READ_GROUP__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraryList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSampleList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadGroup> getReadGroupList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecord() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroupList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectResolvingEList<Sample>(Sample.class, this, GroupingPackage.READ_GROUP__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecords() {
		if (records == null) {
			records = new EObjectResolvingEList<Record>(Record.class, this, GroupingPackage.READ_GROUP__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<Group>(Group.class, this, GroupingPackage.READ_GROUP__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupingPackage.READ_GROUP__PLATFORM:
				return getPlatform();
			case GroupingPackage.READ_GROUP__PLATFORM_UNIT:
				return getPlatformUnit();
			case GroupingPackage.READ_GROUP__RECORDS:
				return getRecords();
			case GroupingPackage.READ_GROUP__SAMPLES:
				return getSamples();
			case GroupingPackage.READ_GROUP__GROUPS:
				return getGroups();
			case GroupingPackage.READ_GROUP__LIBRARIES:
				return getLibraries();
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
			case GroupingPackage.READ_GROUP__PLATFORM:
				setPlatform((String)newValue);
				return;
			case GroupingPackage.READ_GROUP__PLATFORM_UNIT:
				setPlatformUnit((String)newValue);
				return;
			case GroupingPackage.READ_GROUP__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends Record>)newValue);
				return;
			case GroupingPackage.READ_GROUP__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
				return;
			case GroupingPackage.READ_GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GroupingPackage.READ_GROUP__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
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
			case GroupingPackage.READ_GROUP__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case GroupingPackage.READ_GROUP__PLATFORM_UNIT:
				setPlatformUnit(PLATFORM_UNIT_EDEFAULT);
				return;
			case GroupingPackage.READ_GROUP__RECORDS:
				getRecords().clear();
				return;
			case GroupingPackage.READ_GROUP__SAMPLES:
				getSamples().clear();
				return;
			case GroupingPackage.READ_GROUP__GROUPS:
				getGroups().clear();
				return;
			case GroupingPackage.READ_GROUP__LIBRARIES:
				getLibraries().clear();
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
			case GroupingPackage.READ_GROUP__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case GroupingPackage.READ_GROUP__PLATFORM_UNIT:
				return PLATFORM_UNIT_EDEFAULT == null ? platformUnit != null : !PLATFORM_UNIT_EDEFAULT.equals(platformUnit);
			case GroupingPackage.READ_GROUP__RECORDS:
				return records != null && !records.isEmpty();
			case GroupingPackage.READ_GROUP__SAMPLES:
				return samples != null && !samples.isEmpty();
			case GroupingPackage.READ_GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
			case GroupingPackage.READ_GROUP__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
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
		result.append(" (platform: ");
		result.append(platform);
		result.append(", platformUnit: ");
		result.append(platformUnit);
		result.append(')');
		return result.toString();
	}

} //ReadGroupImpl
