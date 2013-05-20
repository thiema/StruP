/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing;

import easyflow.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.SequencingFactory
 * @model kind="package"
 * @generated
 */
public interface SequencingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequencing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/sequencing/easyflow.core/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencingPackage eINSTANCE = easyflow.sequencing.impl.SequencingPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.sequencing.impl.RefBasedProjectMetaDataImpl <em>Ref Based Project Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.impl.RefBasedProjectMetaDataImpl
	 * @see easyflow.sequencing.impl.SequencingPackageImpl#getRefBasedProjectMetaData()
	 * @generated
	 */
	int REF_BASED_PROJECT_META_DATA = 0;

	/**
	 * The number of structural features of the '<em>Ref Based Project Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_BASED_PROJECT_META_DATA_FEATURE_COUNT = CorePackage.IPROJECT_META_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.impl.MetaDataImpl
	 * @see easyflow.sequencing.impl.SequencingPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__FILE_NAME = CorePackage.IMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__LOGGER = CorePackage.IMETA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groupings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__GROUPINGS = CorePackage.IMETA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grouping Instances</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__GROUPING_INSTANCES = CorePackage.IMETA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grouping Instances By Group</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__GROUPING_INSTANCES_BY_GROUP = CorePackage.IMETA_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__SAMPLES = CorePackage.IMETA_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Records</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__RECORDS = CorePackage.IMETA_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Read Groups</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__READ_GROUPS = CorePackage.IMETA_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__LIBRARIES = CorePackage.IMETA_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__GROUPS = CorePackage.IMETA_DATA_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = CorePackage.IMETA_DATA_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.RefBasedProjectMetaData <em>Ref Based Project Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Based Project Meta Data</em>'.
	 * @see easyflow.sequencing.RefBasedProjectMetaData
	 * @generated
	 */
	EClass getRefBasedProjectMetaData();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see easyflow.sequencing.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the map '{@link easyflow.sequencing.MetaData#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Samples</em>'.
	 * @see easyflow.sequencing.MetaData#getSamples()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Samples();

	/**
	 * Returns the meta object for the map '{@link easyflow.sequencing.MetaData#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Records</em>'.
	 * @see easyflow.sequencing.MetaData#getRecords()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Records();

	/**
	 * Returns the meta object for the map '{@link easyflow.sequencing.MetaData#getReadGroups <em>Read Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Read Groups</em>'.
	 * @see easyflow.sequencing.MetaData#getReadGroups()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_ReadGroups();

	/**
	 * Returns the meta object for the map '{@link easyflow.sequencing.MetaData#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Libraries</em>'.
	 * @see easyflow.sequencing.MetaData#getLibraries()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Libraries();

	/**
	 * Returns the meta object for the map '{@link easyflow.sequencing.MetaData#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Groups</em>'.
	 * @see easyflow.sequencing.MetaData#getGroups()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Groups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequencingFactory getSequencingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.sequencing.impl.RefBasedProjectMetaDataImpl <em>Ref Based Project Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.impl.RefBasedProjectMetaDataImpl
		 * @see easyflow.sequencing.impl.SequencingPackageImpl#getRefBasedProjectMetaData()
		 * @generated
		 */
		EClass REF_BASED_PROJECT_META_DATA = eINSTANCE.getRefBasedProjectMetaData();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.impl.MetaDataImpl
		 * @see easyflow.sequencing.impl.SequencingPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__SAMPLES = eINSTANCE.getMetaData_Samples();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__RECORDS = eINSTANCE.getMetaData_Records();

		/**
		 * The meta object literal for the '<em><b>Read Groups</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__READ_GROUPS = eINSTANCE.getMetaData_ReadGroups();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__LIBRARIES = eINSTANCE.getMetaData_Libraries();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__GROUPS = eINSTANCE.getMetaData_Groups();

	}

} //SequencingPackage
