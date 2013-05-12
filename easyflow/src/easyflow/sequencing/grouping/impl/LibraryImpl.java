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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * @implements IGroupingCriterion
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getOuterDistance <em>Outer Distance</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#isPairedEnd <em>Paired End</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getReadLength <em>Read Length</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getReadType <em>Read Type</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getReadGroups <em>Read Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.LibraryImpl#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends GroupingCriterionImpl implements Library, IGroupingCriterion {
	/**
	 * The default value of the '{@link #getOuterDistance() <em>Outer Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTER_DISTANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOuterDistance() <em>Outer Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterDistance()
	 * @generated
	 * @ordered
	 */
	protected String outerDistance = OUTER_DISTANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #isPairedEnd() <em>Paired End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPairedEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAIRED_END_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPairedEnd() <em>Paired End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPairedEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean pairedEnd = PAIRED_END_EDEFAULT;
	/**
	 * The default value of the '{@link #getReadLength() <em>Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLength()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_LENGTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getReadLength() <em>Read Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLength()
	 * @generated
	 * @ordered
	 */
	protected int readLength = READ_LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getReadType() <em>Read Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadType()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReadType() <em>Read Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadType()
	 * @generated
	 * @ordered
	 */
	protected String readType = READ_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getReadGroups() <em>Read Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadGroup> readGroups;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupingPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOuterDistance() {
		return outerDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterDistance(String newOuterDistance) {
		String oldOuterDistance = outerDistance;
		outerDistance = newOuterDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.LIBRARY__OUTER_DISTANCE, oldOuterDistance, outerDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPairedEnd() {
		return pairedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPairedEnd(boolean newPairedEnd) {
		boolean oldPairedEnd = pairedEnd;
		pairedEnd = newPairedEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.LIBRARY__PAIRED_END, oldPairedEnd, pairedEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReadLength() {
		return readLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLength(int newReadLength) {
		int oldReadLength = readLength;
		readLength = newReadLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.LIBRARY__READ_LENGTH, oldReadLength, readLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReadType() {
		return readType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadType(String newReadType) {
		String oldReadType = readType;
		readType = newReadType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.LIBRARY__READ_TYPE, oldReadType, readType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectResolvingEList<Sample>(Sample.class, this, GroupingPackage.LIBRARY__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadGroup> getReadGroups() {
		if (readGroups == null) {
			readGroups = new EObjectResolvingEList<ReadGroup>(ReadGroup.class, this, GroupingPackage.LIBRARY__READ_GROUPS);
		}
		return readGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecords() {
		if (records == null) {
			records = new EObjectResolvingEList<Record>(Record.class, this, GroupingPackage.LIBRARY__RECORDS);
		}
		return records;
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
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<Group>(Group.class, this, GroupingPackage.LIBRARY__GROUPS);
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
			case GroupingPackage.LIBRARY__OUTER_DISTANCE:
				return getOuterDistance();
			case GroupingPackage.LIBRARY__PAIRED_END:
				return isPairedEnd();
			case GroupingPackage.LIBRARY__READ_LENGTH:
				return getReadLength();
			case GroupingPackage.LIBRARY__READ_TYPE:
				return getReadType();
			case GroupingPackage.LIBRARY__SAMPLES:
				return getSamples();
			case GroupingPackage.LIBRARY__GROUPS:
				return getGroups();
			case GroupingPackage.LIBRARY__READ_GROUPS:
				return getReadGroups();
			case GroupingPackage.LIBRARY__RECORDS:
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
			case GroupingPackage.LIBRARY__OUTER_DISTANCE:
				setOuterDistance((String)newValue);
				return;
			case GroupingPackage.LIBRARY__PAIRED_END:
				setPairedEnd((Boolean)newValue);
				return;
			case GroupingPackage.LIBRARY__READ_LENGTH:
				setReadLength((Integer)newValue);
				return;
			case GroupingPackage.LIBRARY__READ_TYPE:
				setReadType((String)newValue);
				return;
			case GroupingPackage.LIBRARY__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
				return;
			case GroupingPackage.LIBRARY__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GroupingPackage.LIBRARY__READ_GROUPS:
				getReadGroups().clear();
				getReadGroups().addAll((Collection<? extends ReadGroup>)newValue);
				return;
			case GroupingPackage.LIBRARY__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends Record>)newValue);
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
			case GroupingPackage.LIBRARY__OUTER_DISTANCE:
				setOuterDistance(OUTER_DISTANCE_EDEFAULT);
				return;
			case GroupingPackage.LIBRARY__PAIRED_END:
				setPairedEnd(PAIRED_END_EDEFAULT);
				return;
			case GroupingPackage.LIBRARY__READ_LENGTH:
				setReadLength(READ_LENGTH_EDEFAULT);
				return;
			case GroupingPackage.LIBRARY__READ_TYPE:
				setReadType(READ_TYPE_EDEFAULT);
				return;
			case GroupingPackage.LIBRARY__SAMPLES:
				getSamples().clear();
				return;
			case GroupingPackage.LIBRARY__GROUPS:
				getGroups().clear();
				return;
			case GroupingPackage.LIBRARY__READ_GROUPS:
				getReadGroups().clear();
				return;
			case GroupingPackage.LIBRARY__RECORDS:
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
			case GroupingPackage.LIBRARY__OUTER_DISTANCE:
				return OUTER_DISTANCE_EDEFAULT == null ? outerDistance != null : !OUTER_DISTANCE_EDEFAULT.equals(outerDistance);
			case GroupingPackage.LIBRARY__PAIRED_END:
				return pairedEnd != PAIRED_END_EDEFAULT;
			case GroupingPackage.LIBRARY__READ_LENGTH:
				return readLength != READ_LENGTH_EDEFAULT;
			case GroupingPackage.LIBRARY__READ_TYPE:
				return READ_TYPE_EDEFAULT == null ? readType != null : !READ_TYPE_EDEFAULT.equals(readType);
			case GroupingPackage.LIBRARY__SAMPLES:
				return samples != null && !samples.isEmpty();
			case GroupingPackage.LIBRARY__GROUPS:
				return groups != null && !groups.isEmpty();
			case GroupingPackage.LIBRARY__READ_GROUPS:
				return readGroups != null && !readGroups.isEmpty();
			case GroupingPackage.LIBRARY__RECORDS:
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
		result.append(" (outerDistance: ");
		result.append(outerDistance);
		result.append(", pairedEnd: ");
		result.append(pairedEnd);
		result.append(", readLength: ");
		result.append(readLength);
		result.append(", readType: ");
		result.append(readType);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
