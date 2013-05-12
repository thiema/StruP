/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping.impl;

import easyflow.sequencing.grouping.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupingFactoryImpl extends EFactoryImpl implements GroupingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroupingFactory init() {
		try {
			GroupingFactory theGroupingFactory = (GroupingFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/sequencing/grouping/easyflow.core/1.0.0"); 
			if (theGroupingFactory != null) {
				return theGroupingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroupingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GroupingPackage.SAMPLE: return createSample();
			case GroupingPackage.READ_GROUP: return createReadGroup();
			case GroupingPackage.LIBRARY: return createLibrary();
			case GroupingPackage.GROUP: return createGroup();
			case GroupingPackage.RECORD: return createRecord();
			case GroupingPackage.STRING_TO_SAMPLE_MAP: return (EObject)createStringToSampleMap();
			case GroupingPackage.STRING_TO_READ_GROUP_MAP: return (EObject)createStringToReadGroupMap();
			case GroupingPackage.STRING_TO_LIBRARY_MAP: return (EObject)createStringToLibraryMap();
			case GroupingPackage.STRING_TO_GROUP_MAP: return (EObject)createStringToGroupMap();
			case GroupingPackage.STRING_TO_RECORD_MAP: return (EObject)createStringToRecordMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sample createSample() {
		SampleImpl sample = new SampleImpl();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadGroup createReadGroup() {
		ReadGroupImpl readGroup = new ReadGroupImpl();
		return readGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Sample> createStringToSampleMap() {
		StringToSampleMapImpl stringToSampleMap = new StringToSampleMapImpl();
		return stringToSampleMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ReadGroup> createStringToReadGroupMap() {
		StringToReadGroupMapImpl stringToReadGroupMap = new StringToReadGroupMapImpl();
		return stringToReadGroupMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Library> createStringToLibraryMap() {
		StringToLibraryMapImpl stringToLibraryMap = new StringToLibraryMapImpl();
		return stringToLibraryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Group> createStringToGroupMap() {
		StringToGroupMapImpl stringToGroupMap = new StringToGroupMapImpl();
		return stringToGroupMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Record> createStringToRecordMap() {
		StringToRecordMapImpl stringToRecordMap = new StringToRecordMapImpl();
		return stringToRecordMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingPackage getGroupingPackage() {
		return (GroupingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroupingPackage getPackage() {
		return GroupingPackage.eINSTANCE;
	}

} //GroupingFactoryImpl
