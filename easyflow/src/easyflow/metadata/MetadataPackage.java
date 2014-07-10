/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.metadata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see easyflow.metadata.MetadataFactory
 * @model kind="package"
 * @generated
 */
public interface MetadataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metadata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/metadata/1.0.0";

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
	MetadataPackage eINSTANCE = easyflow.metadata.impl.MetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.metadata.IMetaData <em>IMeta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.IMetaData
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getIMetaData()
	 * @generated
	 */
	int IMETA_DATA = 0;

	/**
	 * The number of structural features of the '<em>IMeta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETA_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.metadata.impl.DefaultMetaDataImpl <em>Default Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.impl.DefaultMetaDataImpl
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getDefaultMetaData()
	 * @generated
	 */
	int DEFAULT_META_DATA = 1;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__READER = IMETA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__LOGGER = IMETA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groupings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__GROUPINGS = IMETA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grouping Instances</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__GROUPING_INSTANCES = IMETA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA__ALIASES = IMETA_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Default Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_META_DATA_FEATURE_COUNT = IMETA_DATA_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link easyflow.metadata.IProjectMetaData <em>IProject Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.IProjectMetaData
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getIProjectMetaData()
	 * @generated
	 */
	int IPROJECT_META_DATA = 2;

	/**
	 * The number of structural features of the '<em>IProject Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROJECT_META_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.metadata.impl.GroupingImpl <em>Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.impl.GroupingImpl
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getGrouping()
	 * @generated
	 */
	int GROUPING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.metadata.impl.GroupingInstanceImpl <em>Grouping Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.impl.GroupingInstanceImpl
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingInstance()
	 * @generated
	 */
	int GROUPING_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__GROUPING = 2;

	/**
	 * The feature id for the '<em><b>Grouping Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__GROUPING_STR = 3;

	/**
	 * The feature id for the '<em><b>Records</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE__RECORDS = 4;

	/**
	 * The number of structural features of the '<em>Grouping Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link easyflow.metadata.impl.GroupingFeatureImpl <em>Grouping Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.impl.GroupingFeatureImpl
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingFeature()
	 * @generated
	 */
	int GROUPING_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Grouping Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.metadata.impl.GroupingInstanceListImpl <em>Grouping Instance List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.metadata.impl.GroupingInstanceListImpl
	 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingInstanceList()
	 * @generated
	 */
	int GROUPING_INSTANCE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_LIST__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Grouping Instance List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_INSTANCE_LIST_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link easyflow.metadata.IMetaData <em>IMeta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMeta Data</em>'.
	 * @see easyflow.metadata.IMetaData
	 * @generated
	 */
	EClass getIMetaData();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.DefaultMetaData <em>Default Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Meta Data</em>'.
	 * @see easyflow.metadata.DefaultMetaData
	 * @generated
	 */
	EClass getDefaultMetaData();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.DefaultMetaData#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader</em>'.
	 * @see easyflow.metadata.DefaultMetaData#getReader()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EAttribute getDefaultMetaData_Reader();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.DefaultMetaData#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see easyflow.metadata.DefaultMetaData#getLogger()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EAttribute getDefaultMetaData_Logger();

	/**
	 * Returns the meta object for the map '{@link easyflow.metadata.DefaultMetaData#getGroupings <em>Groupings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Groupings</em>'.
	 * @see easyflow.metadata.DefaultMetaData#getGroupings()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_Groupings();

	/**
	 * Returns the meta object for the map '{@link easyflow.metadata.DefaultMetaData#getGroupingInstances <em>Grouping Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Grouping Instances</em>'.
	 * @see easyflow.metadata.DefaultMetaData#getGroupingInstances()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_GroupingInstances();

	/**
	 * Returns the meta object for the map '{@link easyflow.metadata.DefaultMetaData#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Aliases</em>'.
	 * @see easyflow.metadata.DefaultMetaData#getAliases()
	 * @see #getDefaultMetaData()
	 * @generated
	 */
	EReference getDefaultMetaData_Aliases();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.IProjectMetaData <em>IProject Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProject Meta Data</em>'.
	 * @see easyflow.metadata.IProjectMetaData
	 * @generated
	 */
	EClass getIProjectMetaData();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping</em>'.
	 * @see easyflow.metadata.Grouping
	 * @generated
	 */
	EClass getGrouping();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.Grouping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.metadata.Grouping#getName()
	 * @see #getGrouping()
	 * @generated
	 */
	EAttribute getGrouping_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.Grouping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see easyflow.metadata.Grouping#getDescription()
	 * @see #getGrouping()
	 * @generated
	 */
	EAttribute getGrouping_Description();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.GroupingInstance <em>Grouping Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Instance</em>'.
	 * @see easyflow.metadata.GroupingInstance
	 * @generated
	 */
	EClass getGroupingInstance();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.GroupingInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.metadata.GroupingInstance#getName()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EAttribute getGroupingInstance_Name();

	/**
	 * Returns the meta object for the map '{@link easyflow.metadata.GroupingInstance#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see easyflow.metadata.GroupingInstance#getFeatures()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EReference getGroupingInstance_Features();

	/**
	 * Returns the meta object for the reference '{@link easyflow.metadata.GroupingInstance#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grouping</em>'.
	 * @see easyflow.metadata.GroupingInstance#getGrouping()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EReference getGroupingInstance_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.GroupingInstance#getGroupingStr <em>Grouping Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Str</em>'.
	 * @see easyflow.metadata.GroupingInstance#getGroupingStr()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EAttribute getGroupingInstance_GroupingStr();

	/**
	 * Returns the meta object for the attribute list '{@link easyflow.metadata.GroupingInstance#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Records</em>'.
	 * @see easyflow.metadata.GroupingInstance#getRecords()
	 * @see #getGroupingInstance()
	 * @generated
	 */
	EAttribute getGroupingInstance_Records();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.GroupingFeature <em>Grouping Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Feature</em>'.
	 * @see easyflow.metadata.GroupingFeature
	 * @generated
	 */
	EClass getGroupingFeature();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.GroupingFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see easyflow.metadata.GroupingFeature#getName()
	 * @see #getGroupingFeature()
	 * @generated
	 */
	EAttribute getGroupingFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.metadata.GroupingFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see easyflow.metadata.GroupingFeature#getValue()
	 * @see #getGroupingFeature()
	 * @generated
	 */
	EAttribute getGroupingFeature_Value();

	/**
	 * Returns the meta object for class '{@link easyflow.metadata.GroupingInstanceList <em>Grouping Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping Instance List</em>'.
	 * @see easyflow.metadata.GroupingInstanceList
	 * @generated
	 */
	EClass getGroupingInstanceList();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.metadata.GroupingInstanceList#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see easyflow.metadata.GroupingInstanceList#getInstances()
	 * @see #getGroupingInstanceList()
	 * @generated
	 */
	EReference getGroupingInstanceList_Instances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetadataFactory getMetadataFactory();

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
		 * The meta object literal for the '{@link easyflow.metadata.IMetaData <em>IMeta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.IMetaData
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getIMetaData()
		 * @generated
		 */
		EClass IMETA_DATA = eINSTANCE.getIMetaData();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.impl.DefaultMetaDataImpl <em>Default Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.impl.DefaultMetaDataImpl
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getDefaultMetaData()
		 * @generated
		 */
		EClass DEFAULT_META_DATA = eINSTANCE.getDefaultMetaData();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_META_DATA__READER = eINSTANCE.getDefaultMetaData_Reader();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_META_DATA__LOGGER = eINSTANCE.getDefaultMetaData_Logger();

		/**
		 * The meta object literal for the '<em><b>Groupings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__GROUPINGS = eINSTANCE.getDefaultMetaData_Groupings();

		/**
		 * The meta object literal for the '<em><b>Grouping Instances</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__GROUPING_INSTANCES = eINSTANCE.getDefaultMetaData_GroupingInstances();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_META_DATA__ALIASES = eINSTANCE.getDefaultMetaData_Aliases();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.IProjectMetaData <em>IProject Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.IProjectMetaData
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getIProjectMetaData()
		 * @generated
		 */
		EClass IPROJECT_META_DATA = eINSTANCE.getIProjectMetaData();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.impl.GroupingImpl <em>Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.impl.GroupingImpl
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getGrouping()
		 * @generated
		 */
		EClass GROUPING = eINSTANCE.getGrouping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING__NAME = eINSTANCE.getGrouping_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING__DESCRIPTION = eINSTANCE.getGrouping_Description();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.impl.GroupingInstanceImpl <em>Grouping Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.impl.GroupingInstanceImpl
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingInstance()
		 * @generated
		 */
		EClass GROUPING_INSTANCE = eINSTANCE.getGroupingInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_INSTANCE__NAME = eINSTANCE.getGroupingInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_INSTANCE__FEATURES = eINSTANCE.getGroupingInstance_Features();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_INSTANCE__GROUPING = eINSTANCE.getGroupingInstance_Grouping();

		/**
		 * The meta object literal for the '<em><b>Grouping Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_INSTANCE__GROUPING_STR = eINSTANCE.getGroupingInstance_GroupingStr();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_INSTANCE__RECORDS = eINSTANCE.getGroupingInstance_Records();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.impl.GroupingFeatureImpl <em>Grouping Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.impl.GroupingFeatureImpl
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingFeature()
		 * @generated
		 */
		EClass GROUPING_FEATURE = eINSTANCE.getGroupingFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_FEATURE__NAME = eINSTANCE.getGroupingFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING_FEATURE__VALUE = eINSTANCE.getGroupingFeature_Value();

		/**
		 * The meta object literal for the '{@link easyflow.metadata.impl.GroupingInstanceListImpl <em>Grouping Instance List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.metadata.impl.GroupingInstanceListImpl
		 * @see easyflow.metadata.impl.MetadataPackageImpl#getGroupingInstanceList()
		 * @generated
		 */
		EClass GROUPING_INSTANCE_LIST = eINSTANCE.getGroupingInstanceList();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING_INSTANCE_LIST__INSTANCES = eINSTANCE.getGroupingInstanceList_Instances();

	}

} //MetadataPackage
