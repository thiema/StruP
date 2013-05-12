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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * @implements IGroupingCriterion
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.impl.GroupImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.GroupImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.GroupImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.GroupImpl#getReadGroups <em>Read Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends GroupingCriterionImpl implements Group, IGroupingCriterion {
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
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupingPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, GroupingPackage.GROUP__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectResolvingEList<Sample>(Sample.class, this, GroupingPackage.GROUP__SAMPLES);
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
			readGroups = new EObjectResolvingEList<ReadGroup>(ReadGroup.class, this, GroupingPackage.GROUP__READ_GROUPS);
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
			case GroupingPackage.GROUP__SAMPLES:
				return getSamples();
			case GroupingPackage.GROUP__RECORDS:
				return getRecords();
			case GroupingPackage.GROUP__LIBRARIES:
				return getLibraries();
			case GroupingPackage.GROUP__READ_GROUPS:
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
			case GroupingPackage.GROUP__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
				return;
			case GroupingPackage.GROUP__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends Record>)newValue);
				return;
			case GroupingPackage.GROUP__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case GroupingPackage.GROUP__READ_GROUPS:
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
			case GroupingPackage.GROUP__SAMPLES:
				getSamples().clear();
				return;
			case GroupingPackage.GROUP__RECORDS:
				getRecords().clear();
				return;
			case GroupingPackage.GROUP__LIBRARIES:
				getLibraries().clear();
				return;
			case GroupingPackage.GROUP__READ_GROUPS:
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
			case GroupingPackage.GROUP__SAMPLES:
				return samples != null && !samples.isEmpty();
			case GroupingPackage.GROUP__RECORDS:
				return records != null && !records.isEmpty();
			case GroupingPackage.GROUP__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case GroupingPackage.GROUP__READ_GROUPS:
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
			records = new EObjectResolvingEList<Record>(Record.class, this, GroupingPackage.GROUP__RECORDS);
		}
		return records;
	}

} //GroupImpl
