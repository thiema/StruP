/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping.impl;

import easyflow.core.impl.GroupingCriterionImpl;
import easyflow.sequencing.grouping.Group;
import easyflow.core.CorePackage;
import easyflow.core.GroupingCriterion;
import easyflow.sequencing.grouping.GroupingPackage;
import easyflow.sequencing.grouping.IGroupingCriterion;
import easyflow.sequencing.grouping.Library;
import easyflow.sequencing.grouping.ReadGroup;
import easyflow.sequencing.grouping.Record;
import easyflow.sequencing.grouping.Sample;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * @implements IGroupingCriterion
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.impl.SampleImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.SampleImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.SampleImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.SampleImpl#getReadGroups <em>Read Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleImpl extends GroupingCriterionImpl implements Sample, IGroupingCriterion {
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
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupingPackage.Literals.SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, GroupingPackage.SAMPLE__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadGroup> getReadGroups() {
		if (readGroups == null) {
			readGroups = new EObjectResolvingEList<ReadGroup>(ReadGroup.class, this, GroupingPackage.SAMPLE__READ_GROUPS);
		}
		return readGroups;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupingPackage.SAMPLE__RECORDS:
				return getRecords();
			case GroupingPackage.SAMPLE__LIBRARIES:
				return getLibraries();
			case GroupingPackage.SAMPLE__GROUPS:
				return getGroups();
			case GroupingPackage.SAMPLE__READ_GROUPS:
				return getReadGroups();
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
			case GroupingPackage.SAMPLE__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends Record>)newValue);
				return;
			case GroupingPackage.SAMPLE__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case GroupingPackage.SAMPLE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GroupingPackage.SAMPLE__READ_GROUPS:
				getReadGroups().clear();
				getReadGroups().addAll((Collection<? extends ReadGroup>)newValue);
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
			case GroupingPackage.SAMPLE__RECORDS:
				getRecords().clear();
				return;
			case GroupingPackage.SAMPLE__LIBRARIES:
				getLibraries().clear();
				return;
			case GroupingPackage.SAMPLE__GROUPS:
				getGroups().clear();
				return;
			case GroupingPackage.SAMPLE__READ_GROUPS:
				getReadGroups().clear();
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
			case GroupingPackage.SAMPLE__RECORDS:
				return records != null && !records.isEmpty();
			case GroupingPackage.SAMPLE__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case GroupingPackage.SAMPLE__GROUPS:
				return groups != null && !groups.isEmpty();
			case GroupingPackage.SAMPLE__READ_GROUPS:
				return readGroups != null && !readGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecords() {
		if (records == null) {
			records = new EObjectResolvingEList<Record>(Record.class, this, GroupingPackage.SAMPLE__RECORDS);
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
			groups = new EObjectResolvingEList<Group>(Group.class, this, GroupingPackage.SAMPLE__GROUPS);
		}
		return groups;
	}

} //SampleImpl
