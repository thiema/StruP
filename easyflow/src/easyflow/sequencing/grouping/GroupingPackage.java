/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.grouping;

import easyflow.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see easyflow.sequencing.grouping.GroupingFactory
 * @model kind="package"
 * @generated
 */
public interface GroupingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grouping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/sequencing/grouping/easyflow.core/1.0.0";

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
	GroupingPackage eINSTANCE = easyflow.sequencing.grouping.impl.GroupingPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.IGroupingCriterion <em>IGrouping Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.IGroupingCriterion
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getIGroupingCriterion()
	 * @generated
	 */
	int IGROUPING_CRITERION = 5;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.SampleImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__ID = CorePackage.GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__DESCRIPTION = CorePackage.GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__MODE = CorePackage.GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__MULTIPLE_INSTANCES = CorePackage.GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__SEPERATE_INPUT_PORTS = CorePackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__LOGGER = CorePackage.GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__RECORDS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__LIBRARIES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Read Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__READ_GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_FEATURE_COUNT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.ReadGroupImpl <em>Read Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.ReadGroupImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getReadGroup()
	 * @generated
	 */
	int READ_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__ID = CorePackage.GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__DESCRIPTION = CorePackage.GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__MODE = CorePackage.GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__MULTIPLE_INSTANCES = CorePackage.GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__SEPERATE_INPUT_PORTS = CorePackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__LOGGER = CorePackage.GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__PLATFORM = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__PLATFORM_UNIT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__RECORDS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__SAMPLES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP__LIBRARIES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Read Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_GROUP_FEATURE_COUNT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.LibraryImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = CorePackage.GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = CorePackage.GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MODE = CorePackage.GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MULTIPLE_INSTANCES = CorePackage.GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SEPERATE_INPUT_PORTS = CorePackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOGGER = CorePackage.GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Outer Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__OUTER_DISTANCE = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paired End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PAIRED_END = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__READ_LENGTH = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Read Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__READ_TYPE = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SAMPLES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__READ_GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__RECORDS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.GroupImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = CorePackage.GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = CorePackage.GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MODE = CorePackage.GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MULTIPLE_INSTANCES = CorePackage.GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SEPERATE_INPUT_PORTS = CorePackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOGGER = CorePackage.GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SAMPLES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RECORDS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LIBRARIES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Read Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__READ_GROUPS = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.RecordImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ID = CorePackage.GROUPING_CRITERION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DESCRIPTION = CorePackage.GROUPING_CRITERION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MODE = CorePackage.GROUPING_CRITERION__MODE;

	/**
	 * The feature id for the '<em><b>Multiple Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MULTIPLE_INSTANCES = CorePackage.GROUPING_CRITERION__MULTIPLE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Seperate Input Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SEPERATE_INPUT_PORTS = CorePackage.GROUPING_CRITERION__SEPERATE_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__LOGGER = CorePackage.GROUPING_CRITERION__LOGGER;

	/**
	 * The feature id for the '<em><b>Generic Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GENERIC_ATTRIBUTES = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__URI_LIST = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GROUP = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sample</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SAMPLE = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__LIBRARY = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Read Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__READ_GROUP = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = CorePackage.GROUPING_CRITERION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>IGrouping Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGROUPING_CRITERION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.StringToSampleMapImpl <em>String To Sample Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.StringToSampleMapImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToSampleMap()
	 * @generated
	 */
	int STRING_TO_SAMPLE_MAP = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SAMPLE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SAMPLE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Sample Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SAMPLE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.StringToReadGroupMapImpl <em>String To Read Group Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.StringToReadGroupMapImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToReadGroupMap()
	 * @generated
	 */
	int STRING_TO_READ_GROUP_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_READ_GROUP_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_READ_GROUP_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Read Group Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_READ_GROUP_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.StringToLibraryMapImpl <em>String To Library Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.StringToLibraryMapImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToLibraryMap()
	 * @generated
	 */
	int STRING_TO_LIBRARY_MAP = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LIBRARY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LIBRARY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Library Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_LIBRARY_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.StringToGroupMapImpl <em>String To Group Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.StringToGroupMapImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToGroupMap()
	 * @generated
	 */
	int STRING_TO_GROUP_MAP = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUP_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUP_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Group Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUP_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link easyflow.sequencing.grouping.impl.StringToRecordMapImpl <em>String To Record Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.sequencing.grouping.impl.StringToRecordMapImpl
	 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToRecordMap()
	 * @generated
	 */
	int STRING_TO_RECORD_MAP = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RECORD_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RECORD_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Record Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RECORD_MAP_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see easyflow.sequencing.grouping.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Sample#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see easyflow.sequencing.grouping.Sample#getRecords()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_Records();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Sample#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see easyflow.sequencing.grouping.Sample#getLibraries()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_Libraries();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Sample#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see easyflow.sequencing.grouping.Sample#getGroups()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_Groups();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Sample#getReadGroups <em>Read Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Groups</em>'.
	 * @see easyflow.sequencing.grouping.Sample#getReadGroups()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_ReadGroups();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.ReadGroup <em>Read Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Group</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup
	 * @generated
	 */
	EClass getReadGroup();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.ReadGroup#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getPlatform()
	 * @see #getReadGroup()
	 * @generated
	 */
	EAttribute getReadGroup_Platform();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.ReadGroup#getPlatformUnit <em>Platform Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Unit</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getPlatformUnit()
	 * @see #getReadGroup()
	 * @generated
	 */
	EAttribute getReadGroup_PlatformUnit();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.ReadGroup#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getRecords()
	 * @see #getReadGroup()
	 * @generated
	 */
	EReference getReadGroup_Records();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.ReadGroup#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Samples</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getSamples()
	 * @see #getReadGroup()
	 * @generated
	 */
	EReference getReadGroup_Samples();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.ReadGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getGroups()
	 * @see #getReadGroup()
	 * @generated
	 */
	EReference getReadGroup_Groups();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.ReadGroup#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see easyflow.sequencing.grouping.ReadGroup#getLibraries()
	 * @see #getReadGroup()
	 * @generated
	 */
	EReference getReadGroup_Libraries();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see easyflow.sequencing.grouping.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.Library#getOuterDistance <em>Outer Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Distance</em>'.
	 * @see easyflow.sequencing.grouping.Library#getOuterDistance()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_OuterDistance();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.Library#isPairedEnd <em>Paired End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paired End</em>'.
	 * @see easyflow.sequencing.grouping.Library#isPairedEnd()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_PairedEnd();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.Library#getReadLength <em>Read Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Length</em>'.
	 * @see easyflow.sequencing.grouping.Library#getReadLength()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_ReadLength();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.Library#getReadType <em>Read Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Type</em>'.
	 * @see easyflow.sequencing.grouping.Library#getReadType()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_ReadType();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Library#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Samples</em>'.
	 * @see easyflow.sequencing.grouping.Library#getSamples()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Samples();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Library#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see easyflow.sequencing.grouping.Library#getGroups()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Groups();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Library#getReadGroups <em>Read Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Groups</em>'.
	 * @see easyflow.sequencing.grouping.Library#getReadGroups()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ReadGroups();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Library#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see easyflow.sequencing.grouping.Library#getRecords()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Records();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see easyflow.sequencing.grouping.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Group#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Samples</em>'.
	 * @see easyflow.sequencing.grouping.Group#getSamples()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Samples();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Group#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see easyflow.sequencing.grouping.Group#getRecords()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Records();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Group#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Libraries</em>'.
	 * @see easyflow.sequencing.grouping.Group#getLibraries()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Libraries();

	/**
	 * Returns the meta object for the reference list '{@link easyflow.sequencing.grouping.Group#getReadGroups <em>Read Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read Groups</em>'.
	 * @see easyflow.sequencing.grouping.Group#getReadGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ReadGroups();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see easyflow.sequencing.grouping.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the attribute '{@link easyflow.sequencing.grouping.Record#getUriList <em>Uri List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri List</em>'.
	 * @see easyflow.sequencing.grouping.Record#getUriList()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_UriList();

	/**
	 * Returns the meta object for the reference '{@link easyflow.sequencing.grouping.Record#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see easyflow.sequencing.grouping.Record#getGroup()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Group();

	/**
	 * Returns the meta object for the reference '{@link easyflow.sequencing.grouping.Record#getSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sample</em>'.
	 * @see easyflow.sequencing.grouping.Record#getSample()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Sample();

	/**
	 * Returns the meta object for the reference '{@link easyflow.sequencing.grouping.Record#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see easyflow.sequencing.grouping.Record#getLibrary()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Library();

	/**
	 * Returns the meta object for the reference '{@link easyflow.sequencing.grouping.Record#getReadGroup <em>Read Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Group</em>'.
	 * @see easyflow.sequencing.grouping.Record#getReadGroup()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_ReadGroup();

	/**
	 * Returns the meta object for class '{@link easyflow.sequencing.grouping.IGroupingCriterion <em>IGrouping Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGrouping Criterion</em>'.
	 * @see easyflow.sequencing.grouping.IGroupingCriterion
	 * @generated
	 */
	EClass getIGroupingCriterion();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Sample Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Sample Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.sequencing.grouping.Sample"
	 * @generated
	 */
	EClass getStringToSampleMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSampleMap()
	 * @generated
	 */
	EAttribute getStringToSampleMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSampleMap()
	 * @generated
	 */
	EReference getStringToSampleMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Read Group Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Read Group Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.sequencing.grouping.ReadGroup"
	 * @generated
	 */
	EClass getStringToReadGroupMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToReadGroupMap()
	 * @generated
	 */
	EAttribute getStringToReadGroupMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToReadGroupMap()
	 * @generated
	 */
	EReference getStringToReadGroupMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Library Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Library Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.sequencing.grouping.Library"
	 * @generated
	 */
	EClass getStringToLibraryMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToLibraryMap()
	 * @generated
	 */
	EAttribute getStringToLibraryMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToLibraryMap()
	 * @generated
	 */
	EReference getStringToLibraryMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Group Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Group Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.sequencing.grouping.Group"
	 * @generated
	 */
	EClass getStringToGroupMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupMap()
	 * @generated
	 */
	EAttribute getStringToGroupMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupMap()
	 * @generated
	 */
	EReference getStringToGroupMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Record Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Record Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.sequencing.grouping.Record"
	 * @generated
	 */
	EClass getStringToRecordMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToRecordMap()
	 * @generated
	 */
	EAttribute getStringToRecordMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToRecordMap()
	 * @generated
	 */
	EReference getStringToRecordMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupingFactory getGroupingFactory();

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
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.SampleImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getSample()
		 * @generated
		 */
		EClass SAMPLE = eINSTANCE.getSample();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__RECORDS = eINSTANCE.getSample_Records();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__LIBRARIES = eINSTANCE.getSample_Libraries();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__GROUPS = eINSTANCE.getSample_Groups();

		/**
		 * The meta object literal for the '<em><b>Read Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__READ_GROUPS = eINSTANCE.getSample_ReadGroups();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.ReadGroupImpl <em>Read Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.ReadGroupImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getReadGroup()
		 * @generated
		 */
		EClass READ_GROUP = eINSTANCE.getReadGroup();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_GROUP__PLATFORM = eINSTANCE.getReadGroup_Platform();

		/**
		 * The meta object literal for the '<em><b>Platform Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_GROUP__PLATFORM_UNIT = eINSTANCE.getReadGroup_PlatformUnit();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_GROUP__RECORDS = eINSTANCE.getReadGroup_Records();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_GROUP__SAMPLES = eINSTANCE.getReadGroup_Samples();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_GROUP__GROUPS = eINSTANCE.getReadGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_GROUP__LIBRARIES = eINSTANCE.getReadGroup_Libraries();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.LibraryImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Outer Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__OUTER_DISTANCE = eINSTANCE.getLibrary_OuterDistance();

		/**
		 * The meta object literal for the '<em><b>Paired End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__PAIRED_END = eINSTANCE.getLibrary_PairedEnd();

		/**
		 * The meta object literal for the '<em><b>Read Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__READ_LENGTH = eINSTANCE.getLibrary_ReadLength();

		/**
		 * The meta object literal for the '<em><b>Read Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__READ_TYPE = eINSTANCE.getLibrary_ReadType();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__SAMPLES = eINSTANCE.getLibrary_Samples();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__GROUPS = eINSTANCE.getLibrary_Groups();

		/**
		 * The meta object literal for the '<em><b>Read Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__READ_GROUPS = eINSTANCE.getLibrary_ReadGroups();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__RECORDS = eINSTANCE.getLibrary_Records();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.GroupImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SAMPLES = eINSTANCE.getGroup_Samples();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__RECORDS = eINSTANCE.getGroup_Records();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__LIBRARIES = eINSTANCE.getGroup_Libraries();

		/**
		 * The meta object literal for the '<em><b>Read Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__READ_GROUPS = eINSTANCE.getGroup_ReadGroups();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.RecordImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Uri List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__URI_LIST = eINSTANCE.getRecord_UriList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__GROUP = eINSTANCE.getRecord_Group();

		/**
		 * The meta object literal for the '<em><b>Sample</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__SAMPLE = eINSTANCE.getRecord_Sample();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__LIBRARY = eINSTANCE.getRecord_Library();

		/**
		 * The meta object literal for the '<em><b>Read Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__READ_GROUP = eINSTANCE.getRecord_ReadGroup();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.IGroupingCriterion <em>IGrouping Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.IGroupingCriterion
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getIGroupingCriterion()
		 * @generated
		 */
		EClass IGROUPING_CRITERION = eINSTANCE.getIGroupingCriterion();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.StringToSampleMapImpl <em>String To Sample Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.StringToSampleMapImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToSampleMap()
		 * @generated
		 */
		EClass STRING_TO_SAMPLE_MAP = eINSTANCE.getStringToSampleMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_SAMPLE_MAP__KEY = eINSTANCE.getStringToSampleMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_SAMPLE_MAP__VALUE = eINSTANCE.getStringToSampleMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.StringToReadGroupMapImpl <em>String To Read Group Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.StringToReadGroupMapImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToReadGroupMap()
		 * @generated
		 */
		EClass STRING_TO_READ_GROUP_MAP = eINSTANCE.getStringToReadGroupMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_READ_GROUP_MAP__KEY = eINSTANCE.getStringToReadGroupMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_READ_GROUP_MAP__VALUE = eINSTANCE.getStringToReadGroupMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.StringToLibraryMapImpl <em>String To Library Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.StringToLibraryMapImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToLibraryMap()
		 * @generated
		 */
		EClass STRING_TO_LIBRARY_MAP = eINSTANCE.getStringToLibraryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_LIBRARY_MAP__KEY = eINSTANCE.getStringToLibraryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_LIBRARY_MAP__VALUE = eINSTANCE.getStringToLibraryMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.StringToGroupMapImpl <em>String To Group Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.StringToGroupMapImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToGroupMap()
		 * @generated
		 */
		EClass STRING_TO_GROUP_MAP = eINSTANCE.getStringToGroupMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUP_MAP__KEY = eINSTANCE.getStringToGroupMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUP_MAP__VALUE = eINSTANCE.getStringToGroupMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.sequencing.grouping.impl.StringToRecordMapImpl <em>String To Record Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.sequencing.grouping.impl.StringToRecordMapImpl
		 * @see easyflow.sequencing.grouping.impl.GroupingPackageImpl#getStringToRecordMap()
		 * @generated
		 */
		EClass STRING_TO_RECORD_MAP = eINSTANCE.getStringToRecordMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_RECORD_MAP__KEY = eINSTANCE.getStringToRecordMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_RECORD_MAP__VALUE = eINSTANCE.getStringToRecordMap_Value();

	}

} //GroupingPackage
