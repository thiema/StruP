/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping.impl;

import easyflow.core.CorePackage;
import easyflow.core.DefaultRecord;
import easyflow.core.impl.GroupingCriterionImpl;
import easyflow.core.impl.StringToObjectMapImpl;
import easyflow.sequencing.grouping.Group;
import easyflow.sequencing.grouping.GroupingPackage;
import easyflow.sequencing.grouping.IGroupingCriterion;
import easyflow.sequencing.grouping.Library;
import easyflow.sequencing.grouping.ReadGroup;
import easyflow.sequencing.grouping.Record;

import easyflow.sequencing.grouping.Sample;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * @implements IGroupingCriterion
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getGenericAttributes <em>Generic Attributes</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getUriList <em>Uri List</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link easyflow.sequencing.grouping.impl.RecordImpl#getReadGroup <em>Read Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends GroupingCriterionImpl implements Record, IGroupingCriterion {
	/**
	 * The cached value of the '{@link #getGenericAttributes() <em>Generic Attributes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttributes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Object> genericAttributes;

	/**
	 * The cached value of the '{@link #getUriList() <em>Uri List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriList()
	 * @generated
	 * @ordered
	 */
	protected EList<URI> uriList;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getSample() <em>Sample</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample()
	 * @generated
	 * @ordered
	 */
	protected Sample sample;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Library library;

	/**
	 * The cached value of the '{@link #getReadGroup() <em>Read Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadGroup()
	 * @generated
	 * @ordered
	 */
	protected ReadGroup readGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupingPackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URI> getUriList() {
		return uriList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriList(EList<URI> newUriList) {
		EList<URI> oldUriList = uriList;
		uriList = newUriList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.RECORD__URI_LIST, oldUriList, uriList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (Group)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupingPackage.RECORD__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.RECORD__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample getSample() {
		if (sample != null && sample.eIsProxy()) {
			InternalEObject oldSample = (InternalEObject)sample;
			sample = (Sample)eResolveProxy(oldSample);
			if (sample != oldSample) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupingPackage.RECORD__SAMPLE, oldSample, sample));
			}
		}
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample basicGetSample() {
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSample(Sample newSample) {
		Sample oldSample = sample;
		sample = newSample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.RECORD__SAMPLE, oldSample, sample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getLibrary() {
		if (library != null && library.eIsProxy()) {
			InternalEObject oldLibrary = (InternalEObject)library;
			library = (Library)eResolveProxy(oldLibrary);
			if (library != oldLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupingPackage.RECORD__LIBRARY, oldLibrary, library));
			}
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library basicGetLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Library newLibrary) {
		Library oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.RECORD__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadGroup getReadGroup() {
		if (readGroup != null && readGroup.eIsProxy()) {
			InternalEObject oldReadGroup = (InternalEObject)readGroup;
			readGroup = (ReadGroup)eResolveProxy(oldReadGroup);
			if (readGroup != oldReadGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupingPackage.RECORD__READ_GROUP, oldReadGroup, readGroup));
			}
		}
		return readGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadGroup basicGetReadGroup() {
		return readGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadGroup(ReadGroup newReadGroup) {
		ReadGroup oldReadGroup = readGroup;
		readGroup = newReadGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupingPackage.RECORD__READ_GROUP, oldReadGroup, readGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Object> getGenericAttributes() {
		if (genericAttributes == null) {
			genericAttributes = new EcoreEMap<String,Object>(CorePackage.Literals.STRING_TO_OBJECT_MAP, StringToObjectMapImpl.class, this, GroupingPackage.RECORD__GENERIC_ATTRIBUTES);
		}
		return genericAttributes;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupingPackage.RECORD__GENERIC_ATTRIBUTES:
				return ((InternalEList<?>)getGenericAttributes()).basicRemove(otherEnd, msgs);
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
			case GroupingPackage.RECORD__GENERIC_ATTRIBUTES:
				if (coreType) return getGenericAttributes();
				else return getGenericAttributes().map();
			case GroupingPackage.RECORD__URI_LIST:
				return getUriList();
			case GroupingPackage.RECORD__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case GroupingPackage.RECORD__SAMPLE:
				if (resolve) return getSample();
				return basicGetSample();
			case GroupingPackage.RECORD__LIBRARY:
				if (resolve) return getLibrary();
				return basicGetLibrary();
			case GroupingPackage.RECORD__READ_GROUP:
				if (resolve) return getReadGroup();
				return basicGetReadGroup();
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
			case GroupingPackage.RECORD__GENERIC_ATTRIBUTES:
				((EStructuralFeature.Setting)getGenericAttributes()).set(newValue);
				return;
			case GroupingPackage.RECORD__URI_LIST:
				setUriList((EList<URI>)newValue);
				return;
			case GroupingPackage.RECORD__GROUP:
				setGroup((Group)newValue);
				return;
			case GroupingPackage.RECORD__SAMPLE:
				setSample((Sample)newValue);
				return;
			case GroupingPackage.RECORD__LIBRARY:
				setLibrary((Library)newValue);
				return;
			case GroupingPackage.RECORD__READ_GROUP:
				setReadGroup((ReadGroup)newValue);
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
			case GroupingPackage.RECORD__GENERIC_ATTRIBUTES:
				getGenericAttributes().clear();
				return;
			case GroupingPackage.RECORD__URI_LIST:
				setUriList((EList<URI>)null);
				return;
			case GroupingPackage.RECORD__GROUP:
				setGroup((Group)null);
				return;
			case GroupingPackage.RECORD__SAMPLE:
				setSample((Sample)null);
				return;
			case GroupingPackage.RECORD__LIBRARY:
				setLibrary((Library)null);
				return;
			case GroupingPackage.RECORD__READ_GROUP:
				setReadGroup((ReadGroup)null);
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
			case GroupingPackage.RECORD__GENERIC_ATTRIBUTES:
				return genericAttributes != null && !genericAttributes.isEmpty();
			case GroupingPackage.RECORD__URI_LIST:
				return uriList != null;
			case GroupingPackage.RECORD__GROUP:
				return group != null;
			case GroupingPackage.RECORD__SAMPLE:
				return sample != null;
			case GroupingPackage.RECORD__LIBRARY:
				return library != null;
			case GroupingPackage.RECORD__READ_GROUP:
				return readGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IGroupingCriterion.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefaultRecord.class) {
			switch (derivedFeatureID) {
				case GroupingPackage.RECORD__GENERIC_ATTRIBUTES: return CorePackage.DEFAULT_RECORD__GENERIC_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IGroupingCriterion.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DefaultRecord.class) {
			switch (baseFeatureID) {
				case CorePackage.DEFAULT_RECORD__GENERIC_ATTRIBUTES: return GroupingPackage.RECORD__GENERIC_ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uriList: ");
		result.append(uriList);
		result.append(')');
		return result.toString();
	}

} //RecordImpl
