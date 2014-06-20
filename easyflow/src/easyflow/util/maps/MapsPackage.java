/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util.maps;

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
 * @see easyflow.util.maps.MapsFactory
 * @model kind="package"
 * @generated
 */
public interface MapsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/util/maps/1.0.0";

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
	MapsPackage eINSTANCE = easyflow.util.maps.impl.MapsPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToTaskMapImpl <em>String To Task Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToTaskMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTaskMap()
	 * @generated
	 */
	int STRING_TO_TASK_MAP = 23;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToTraversalEventMapImpl <em>String To Traversal Event Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToTraversalEventMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTraversalEventMap()
	 * @generated
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP = 25;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToGraphCellMapImpl <em>String To Graph Cell Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToGraphCellMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGraphCellMap()
	 * @generated
	 */
	int STRING_TO_GRAPH_CELL_MAP = 13;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToTraversalCriterionMapImpl <em>String To Traversal Criterion Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToTraversalCriterionMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTraversalCriterionMap()
	 * @generated
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP = 26;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToObjectMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToObjectMap()
	 * @generated
	 */
	int STRING_TO_OBJECT_MAP = 15;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToChunksMapImpl <em>String To Chunks Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToChunksMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToChunksMap()
	 * @generated
	 */
	int STRING_TO_CHUNKS_MAP = 3;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToChunkMapImpl <em>String To Chunk Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToChunkMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToChunkMap()
	 * @generated
	 */
	int STRING_TO_CHUNK_MAP = 2;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToToolMapImpl <em>String To Tool Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToToolMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToToolMap()
	 * @generated
	 */
	int STRING_TO_TOOL_MAP = 24;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToStringMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 22;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToGroupingMapImpl <em>String To Grouping Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToGroupingMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_MAP = 12;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToGroupingFeatureMapImpl <em>String To Grouping Feature Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToGroupingFeatureMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingFeatureMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_FEATURE_MAP = 9;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToGroupingInstanceListMapImpl <em>String To Grouping Instance List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToGroupingInstanceListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingInstanceListMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP = 11;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToGroupingInstanceMapMapImpl <em>String To Grouping Instance Map Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToGroupingInstanceMapMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingInstanceMapMap()
	 * @generated
	 */
	int STRING_TO_GROUPING_INSTANCE_MAP_MAP = 10;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToStringListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToStringListMap()
	 * @generated
	 */
	int STRING_TO_STRING_LIST_MAP = 21;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToURIMapImpl <em>String To URI Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToURIMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToURIMap()
	 * @generated
	 */
	int STRING_TO_URI_MAP = 27;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToSchemaMapImpl <em>String To Schema Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToSchemaMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToSchemaMap()
	 * @generated
	 */
	int STRING_TO_SCHEMA_MAP = 14;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToProjectMapImpl <em>String To Project Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToProjectMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToProjectMap()
	 * @generated
	 */
	int STRING_TO_PROJECT_MAP = 19;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToParameterMapImpl <em>String To Parameter Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToParameterMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToParameterMap()
	 * @generated
	 */
	int STRING_TO_PARAMETER_MAP = 17;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToDocumentPropertiesMapImpl <em>String To Document Properties Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToDocumentPropertiesMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDocumentPropertiesMap()
	 * @generated
	 */
	int STRING_TO_DOCUMENT_PROPERTIES_MAP = 8;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToPackageMapImpl <em>String To Package Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToPackageMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToPackageMap()
	 * @generated
	 */
	int STRING_TO_PACKAGE_MAP = 16;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToDataMapImpl <em>String To Data Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToDataMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataMap()
	 * @generated
	 */
	int STRING_TO_DATA_MAP = 4;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToDataListMapImpl <em>String To Data List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToDataListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataListMap()
	 * @generated
	 */
	int STRING_TO_DATA_LIST_MAP = 5;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToDataFormatMapImpl <em>String To Data Format Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToDataFormatMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataFormatMap()
	 * @generated
	 */
	int STRING_TO_DATA_FORMAT_MAP = 6;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToToolMatchMapImpl <em>String To Tool Match Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToToolMatchMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToToolMatchMap()
	 * @generated
	 */
	int STRING_TO_TOOL_MATCH_MAP = 28;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.TaskToDataPortsMapImpl <em>Task To Data Ports Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.TaskToDataPortsMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getTaskToDataPortsMap()
	 * @generated
	 */
	int TASK_TO_DATA_PORTS_MAP = 29;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToDataLinkMapImpl <em>String To Data Link Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToDataLinkMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataLinkMap()
	 * @generated
	 */
	int STRING_TO_DATA_LINK_MAP = 7;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.CellToCellListMapImpl <em>Cell To Cell List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.CellToCellListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getCellToCellListMap()
	 * @generated
	 */
	int CELL_TO_CELL_LIST_MAP = 0;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToBooleanMapImpl <em>String To Boolean Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToBooleanMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToBooleanMap()
	 * @generated
	 */
	int STRING_TO_BOOLEAN_MAP = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TO_CELL_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TO_CELL_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Cell To Cell List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TO_CELL_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell To Cell List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TO_CELL_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOLEAN_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOLEAN_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Boolean Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOLEAN_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Boolean Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOLEAN_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Chunk Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Chunk Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNK_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Chunks Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Chunks Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CHUNKS_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Data Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Data Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Data List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Data List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_FORMAT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_FORMAT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Data Format Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_FORMAT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Data Format Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_FORMAT_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LINK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LINK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Data Link Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LINK_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Data Link Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DATA_LINK_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOCUMENT_PROPERTIES_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOCUMENT_PROPERTIES_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Document Properties Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOCUMENT_PROPERTIES_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Document Properties Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOCUMENT_PROPERTIES_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Grouping Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_FEATURE_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_MAP_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_MAP_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Instance Map Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_MAP_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Grouping Instance Map Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_MAP_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Instance List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Grouping Instance List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_INSTANCE_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Grouping Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Grouping Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GROUPING_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Graph Cell Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Graph Cell Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_GRAPH_CELL_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Schema Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Schema Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_SCHEMA_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PACKAGE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PACKAGE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Package Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PACKAGE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Package Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PACKAGE_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.TaskToDataLinkListMapImpl <em>Task To Data Link List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.TaskToDataLinkListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getTaskToDataLinkListMap()
	 * @generated
	 */
	int TASK_TO_DATA_LINK_LIST_MAP = 30;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToParameterListMapImpl <em>String To Parameter List Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToParameterListMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToParameterListMap()
	 * @generated
	 */
	int STRING_TO_PARAMETER_LIST_MAP = 18;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Parameter List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Parameter List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PARAMETER_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Project Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Project Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link easyflow.util.maps.impl.StringToResolvedParamMapImpl <em>String To Resolved Param Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.util.maps.impl.StringToResolvedParamMapImpl
	 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToResolvedParamMap()
	 * @generated
	 */
	int STRING_TO_RESOLVED_PARAM_MAP = 20;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOLVED_PARAM_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOLVED_PARAM_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Resolved Param Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOLVED_PARAM_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Resolved Param Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOLVED_PARAM_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Task Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Task Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TASK_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Tool Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Tool Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Traversal Event Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Traversal Event Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_EVENT_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Traversal Criterion Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Traversal Criterion Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TRAVERSAL_CRITERION_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To URI Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To URI Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_URI_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MATCH_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MATCH_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Tool Match Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MATCH_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Tool Match Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TOOL_MATCH_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_PORTS_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_PORTS_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Task To Data Ports Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_PORTS_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task To Data Ports Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_PORTS_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_LINK_LIST_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_LINK_LIST_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Task To Data Link List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_LINK_LIST_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task To Data Link List Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TO_DATA_LINK_LIST_MAP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Task Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Task Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.Task"
	 * @generated
	 */
	EClass getStringToTaskMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTaskMap()
	 * @generated
	 */
	EAttribute getStringToTaskMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTaskMap()
	 * @generated
	 */
	EReference getStringToTaskMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Traversal Event Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Traversal Event Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.traversal.TraversalEvent"
	 * @generated
	 */
	EClass getStringToTraversalEventMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalEventMap()
	 * @generated
	 */
	EAttribute getStringToTraversalEventMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalEventMap()
	 * @generated
	 */
	EReference getStringToTraversalEventMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Graph Cell Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Graph Cell Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.mxICell"
	 * @generated
	 */
	EClass getStringToGraphCellMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGraphCellMap()
	 * @generated
	 */
	EAttribute getStringToGraphCellMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGraphCellMap()
	 * @generated
	 */
	EAttribute getStringToGraphCellMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Traversal Criterion Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Traversal Criterion Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.traversal.TraversalCriterion"
	 * @generated
	 */
	EClass getStringToTraversalCriterionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalCriterionMap()
	 * @generated
	 */
	EAttribute getStringToTraversalCriterionMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTraversalCriterionMap()
	 * @generated
	 */
	EReference getStringToTraversalCriterionMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.Object"
	 * @generated
	 */
	EClass getStringToObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToObjectMap()
	 * @generated
	 */
	EAttribute getStringToObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Chunks Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Chunks Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.traversal.TraversalChunk" valueMany="true"
	 * @generated
	 */
	EClass getStringToChunksMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunksMap()
	 * @generated
	 */
	EAttribute getStringToChunksMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunksMap()
	 * @generated
	 */
	EReference getStringToChunksMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Chunk Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Chunk Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.traversal.TraversalChunk"
	 * @generated
	 */
	EClass getStringToChunkMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunkMap()
	 * @generated
	 */
	EAttribute getStringToChunkMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToChunkMap()
	 * @generated
	 */
	EReference getStringToChunkMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Tool Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Tool Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.Tool"
	 * @generated
	 */
	EClass getStringToToolMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMap()
	 * @generated
	 */
	EAttribute getStringToToolMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMap()
	 * @generated
	 */
	EReference getStringToToolMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.metadata.Grouping"
	 * @generated
	 */
	EClass getStringToGroupingMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingMap()
	 * @generated
	 */
	EAttribute getStringToGroupingMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingMap()
	 * @generated
	 */
	EReference getStringToGroupingMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Feature Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.metadata.GroupingFeature"
	 * @generated
	 */
	EClass getStringToGroupingFeatureMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingFeatureMap()
	 * @generated
	 */
	EAttribute getStringToGroupingFeatureMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingFeatureMap()
	 * @generated
	 */
	EReference getStringToGroupingFeatureMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Instance List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Instance List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.metadata.GroupingInstanceList"
	 * @generated
	 */
	EClass getStringToGroupingInstanceListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceListMap()
	 * @generated
	 */
	EAttribute getStringToGroupingInstanceListMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceListMap()
	 * @generated
	 */
	EReference getStringToGroupingInstanceListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Grouping Instance Map Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Grouping Instance Map Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueMapType="easyflow.util.maps.StringToGroupingInstanceListMap<org.eclipse.emf.ecore.EString, easyflow.metadata.GroupingInstanceList>"
	 * @generated
	 */
	EClass getStringToGroupingInstanceMapMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceMapMap()
	 * @generated
	 */
	EAttribute getStringToGroupingInstanceMapMap_Key();

	/**
	 * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToGroupingInstanceMapMap()
	 * @generated
	 */
	EReference getStringToGroupingInstanceMapMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueMany="true"
	 * @generated
	 */
	EClass getStringToStringListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringListMap()
	 * @generated
	 */
	EAttribute getStringToStringListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To URI Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To URI Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.URI"
	 * @generated
	 */
	EClass getStringToURIMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToURIMap()
	 * @generated
	 */
	EAttribute getStringToURIMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToURIMap()
	 * @generated
	 */
	EAttribute getStringToURIMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Schema Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Schema Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="easyflow.Schema"
	 * @generated
	 */
	EClass getStringToSchemaMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSchemaMap()
	 * @generated
	 */
	EAttribute getStringToSchemaMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToSchemaMap()
	 * @generated
	 */
	EAttribute getStringToSchemaMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Project Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Project Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.ui.DefaultProject"
	 * @generated
	 */
	EClass getStringToProjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToProjectMap()
	 * @generated
	 */
	EAttribute getStringToProjectMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToProjectMap()
	 * @generated
	 */
	EReference getStringToProjectMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Resolved Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Resolved Param Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.ResolvedParam"
	 * @generated
	 */
	EClass getStringToResolvedParamMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToResolvedParamMap()
	 * @generated
	 */
	EAttribute getStringToResolvedParamMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToResolvedParamMap()
	 * @generated
	 */
	EReference getStringToResolvedParamMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Parameter Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.Parameter"
	 * @generated
	 */
	EClass getStringToParameterMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterMap()
	 * @generated
	 */
	EAttribute getStringToParameterMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterMap()
	 * @generated
	 */
	EReference getStringToParameterMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Document Properties Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Document Properties Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.DocumentProperties"
	 * @generated
	 */
	EClass getStringToDocumentPropertiesMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDocumentPropertiesMap()
	 * @generated
	 */
	EAttribute getStringToDocumentPropertiesMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDocumentPropertiesMap()
	 * @generated
	 */
	EReference getStringToDocumentPropertiesMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Package Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Package Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.Package"
	 * @generated
	 */
	EClass getStringToPackageMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPackageMap()
	 * @generated
	 */
	EAttribute getStringToPackageMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPackageMap()
	 * @generated
	 */
	EReference getStringToPackageMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Data Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Data Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.data.Data"
	 * @generated
	 */
	EClass getStringToDataMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataMap()
	 * @generated
	 */
	EAttribute getStringToDataMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataMap()
	 * @generated
	 */
	EReference getStringToDataMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Data List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Data List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.data.Data" valueMany="true"
	 * @generated
	 */
	EClass getStringToDataListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataListMap()
	 * @generated
	 */
	EAttribute getStringToDataListMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataListMap()
	 * @generated
	 */
	EReference getStringToDataListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Data Format Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Data Format Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.data.DataFormat"
	 * @generated
	 */
	EClass getStringToDataFormatMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataFormatMap()
	 * @generated
	 */
	EAttribute getStringToDataFormatMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataFormatMap()
	 * @generated
	 */
	EReference getStringToDataFormatMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Tool Match Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Tool Match Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.core.ToolMatch"
	 * @generated
	 */
	EClass getStringToToolMatchMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMatchMap()
	 * @generated
	 */
	EAttribute getStringToToolMatchMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToToolMatchMap()
	 * @generated
	 */
	EReference getStringToToolMatchMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Task To Data Ports Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task To Data Ports Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="easyflow.core.Task"
	 *        valueType="easyflow.data.DataPort" valueMany="true"
	 * @generated
	 */
	EClass getTaskToDataPortsMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTaskToDataPortsMap()
	 * @generated
	 */
	EReference getTaskToDataPortsMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTaskToDataPortsMap()
	 * @generated
	 */
	EReference getTaskToDataPortsMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Task To Data Link List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task To Data Link List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="easyflow.core.Task"
	 *        valueType="easyflow.data.DataLink" valueMany="true"
	 * @generated
	 */
	EClass getTaskToDataLinkListMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTaskToDataLinkListMap()
	 * @generated
	 */
	EReference getTaskToDataLinkListMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTaskToDataLinkListMap()
	 * @generated
	 */
	EReference getTaskToDataLinkListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Parameter List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Parameter List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.tool.Parameter" valueMany="true"
	 * @generated
	 */
	EClass getStringToParameterListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterListMap()
	 * @generated
	 */
	EAttribute getStringToParameterListMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToParameterListMap()
	 * @generated
	 */
	EReference getStringToParameterListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Data Link Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Data Link Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="easyflow.data.DataLink"
	 * @generated
	 */
	EClass getStringToDataLinkMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataLinkMap()
	 * @generated
	 */
	EAttribute getStringToDataLinkMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDataLinkMap()
	 * @generated
	 */
	EReference getStringToDataLinkMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Cell To Cell List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell To Cell List Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="easyflow.mxICell"
	 *        valueDataType="easyflow.mxICell" valueMany="true"
	 * @generated
	 */
	EClass getCellToCellListMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCellToCellListMap()
	 * @generated
	 */
	EAttribute getCellToCellListMap_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCellToCellListMap()
	 * @generated
	 */
	EAttribute getCellToCellListMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Boolean Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Boolean Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EBooleanObject"
	 * @generated
	 */
	EClass getStringToBooleanMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBooleanMap()
	 * @generated
	 */
	EAttribute getStringToBooleanMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBooleanMap()
	 * @generated
	 */
	EAttribute getStringToBooleanMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MapsFactory getMapsFactory();

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
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToTaskMapImpl <em>String To Task Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToTaskMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTaskMap()
		 * @generated
		 */
		EClass STRING_TO_TASK_MAP = eINSTANCE.getStringToTaskMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TASK_MAP__KEY = eINSTANCE.getStringToTaskMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TASK_MAP__VALUE = eINSTANCE.getStringToTaskMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToTraversalEventMapImpl <em>String To Traversal Event Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToTraversalEventMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTraversalEventMap()
		 * @generated
		 */
		EClass STRING_TO_TRAVERSAL_EVENT_MAP = eINSTANCE.getStringToTraversalEventMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TRAVERSAL_EVENT_MAP__KEY = eINSTANCE.getStringToTraversalEventMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TRAVERSAL_EVENT_MAP__VALUE = eINSTANCE.getStringToTraversalEventMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToGraphCellMapImpl <em>String To Graph Cell Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToGraphCellMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGraphCellMap()
		 * @generated
		 */
		EClass STRING_TO_GRAPH_CELL_MAP = eINSTANCE.getStringToGraphCellMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GRAPH_CELL_MAP__KEY = eINSTANCE.getStringToGraphCellMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GRAPH_CELL_MAP__VALUE = eINSTANCE.getStringToGraphCellMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToTraversalCriterionMapImpl <em>String To Traversal Criterion Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToTraversalCriterionMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToTraversalCriterionMap()
		 * @generated
		 */
		EClass STRING_TO_TRAVERSAL_CRITERION_MAP = eINSTANCE.getStringToTraversalCriterionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TRAVERSAL_CRITERION_MAP__KEY = eINSTANCE.getStringToTraversalCriterionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TRAVERSAL_CRITERION_MAP__VALUE = eINSTANCE.getStringToTraversalCriterionMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToObjectMapImpl <em>String To Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToObjectMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToObjectMap()
		 * @generated
		 */
		EClass STRING_TO_OBJECT_MAP = eINSTANCE.getStringToObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_OBJECT_MAP__KEY = eINSTANCE.getStringToObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_OBJECT_MAP__VALUE = eINSTANCE.getStringToObjectMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToChunksMapImpl <em>String To Chunks Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToChunksMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToChunksMap()
		 * @generated
		 */
		EClass STRING_TO_CHUNKS_MAP = eINSTANCE.getStringToChunksMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CHUNKS_MAP__KEY = eINSTANCE.getStringToChunksMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CHUNKS_MAP__VALUE = eINSTANCE.getStringToChunksMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToChunkMapImpl <em>String To Chunk Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToChunkMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToChunkMap()
		 * @generated
		 */
		EClass STRING_TO_CHUNK_MAP = eINSTANCE.getStringToChunkMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CHUNK_MAP__KEY = eINSTANCE.getStringToChunkMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CHUNK_MAP__VALUE = eINSTANCE.getStringToChunkMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToToolMapImpl <em>String To Tool Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToToolMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToToolMap()
		 * @generated
		 */
		EClass STRING_TO_TOOL_MAP = eINSTANCE.getStringToToolMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TOOL_MAP__KEY = eINSTANCE.getStringToToolMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TOOL_MAP__VALUE = eINSTANCE.getStringToToolMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToStringMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToGroupingMapImpl <em>String To Grouping Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToGroupingMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_MAP = eINSTANCE.getStringToGroupingMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_MAP__KEY = eINSTANCE.getStringToGroupingMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_MAP__VALUE = eINSTANCE.getStringToGroupingMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToGroupingFeatureMapImpl <em>String To Grouping Feature Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToGroupingFeatureMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingFeatureMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_FEATURE_MAP = eINSTANCE.getStringToGroupingFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_FEATURE_MAP__KEY = eINSTANCE.getStringToGroupingFeatureMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_FEATURE_MAP__VALUE = eINSTANCE.getStringToGroupingFeatureMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToGroupingInstanceListMapImpl <em>String To Grouping Instance List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToGroupingInstanceListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingInstanceListMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_INSTANCE_LIST_MAP = eINSTANCE.getStringToGroupingInstanceListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_INSTANCE_LIST_MAP__KEY = eINSTANCE.getStringToGroupingInstanceListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_INSTANCE_LIST_MAP__VALUE = eINSTANCE.getStringToGroupingInstanceListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToGroupingInstanceMapMapImpl <em>String To Grouping Instance Map Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToGroupingInstanceMapMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToGroupingInstanceMapMap()
		 * @generated
		 */
		EClass STRING_TO_GROUPING_INSTANCE_MAP_MAP = eINSTANCE.getStringToGroupingInstanceMapMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_GROUPING_INSTANCE_MAP_MAP__KEY = eINSTANCE.getStringToGroupingInstanceMapMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_GROUPING_INSTANCE_MAP_MAP__VALUE = eINSTANCE.getStringToGroupingInstanceMapMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToStringListMapImpl <em>String To String List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToStringListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToStringListMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_LIST_MAP = eINSTANCE.getStringToStringListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__KEY = eINSTANCE.getStringToStringListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_LIST_MAP__VALUE = eINSTANCE.getStringToStringListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToURIMapImpl <em>String To URI Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToURIMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToURIMap()
		 * @generated
		 */
		EClass STRING_TO_URI_MAP = eINSTANCE.getStringToURIMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_URI_MAP__KEY = eINSTANCE.getStringToURIMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_URI_MAP__VALUE = eINSTANCE.getStringToURIMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToSchemaMapImpl <em>String To Schema Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToSchemaMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToSchemaMap()
		 * @generated
		 */
		EClass STRING_TO_SCHEMA_MAP = eINSTANCE.getStringToSchemaMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_SCHEMA_MAP__KEY = eINSTANCE.getStringToSchemaMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_SCHEMA_MAP__VALUE = eINSTANCE.getStringToSchemaMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToProjectMapImpl <em>String To Project Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToProjectMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToProjectMap()
		 * @generated
		 */
		EClass STRING_TO_PROJECT_MAP = eINSTANCE.getStringToProjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PROJECT_MAP__KEY = eINSTANCE.getStringToProjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PROJECT_MAP__VALUE = eINSTANCE.getStringToProjectMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToResolvedParamMapImpl <em>String To Resolved Param Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToResolvedParamMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToResolvedParamMap()
		 * @generated
		 */
		EClass STRING_TO_RESOLVED_PARAM_MAP = eINSTANCE.getStringToResolvedParamMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_RESOLVED_PARAM_MAP__KEY = eINSTANCE.getStringToResolvedParamMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_RESOLVED_PARAM_MAP__VALUE = eINSTANCE.getStringToResolvedParamMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToParameterMapImpl <em>String To Parameter Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToParameterMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToParameterMap()
		 * @generated
		 */
		EClass STRING_TO_PARAMETER_MAP = eINSTANCE.getStringToParameterMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PARAMETER_MAP__KEY = eINSTANCE.getStringToParameterMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PARAMETER_MAP__VALUE = eINSTANCE.getStringToParameterMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToDocumentPropertiesMapImpl <em>String To Document Properties Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToDocumentPropertiesMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDocumentPropertiesMap()
		 * @generated
		 */
		EClass STRING_TO_DOCUMENT_PROPERTIES_MAP = eINSTANCE.getStringToDocumentPropertiesMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DOCUMENT_PROPERTIES_MAP__KEY = eINSTANCE.getStringToDocumentPropertiesMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_DOCUMENT_PROPERTIES_MAP__VALUE = eINSTANCE.getStringToDocumentPropertiesMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToPackageMapImpl <em>String To Package Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToPackageMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToPackageMap()
		 * @generated
		 */
		EClass STRING_TO_PACKAGE_MAP = eINSTANCE.getStringToPackageMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PACKAGE_MAP__KEY = eINSTANCE.getStringToPackageMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PACKAGE_MAP__VALUE = eINSTANCE.getStringToPackageMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToDataMapImpl <em>String To Data Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToDataMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataMap()
		 * @generated
		 */
		EClass STRING_TO_DATA_MAP = eINSTANCE.getStringToDataMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DATA_MAP__KEY = eINSTANCE.getStringToDataMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_DATA_MAP__VALUE = eINSTANCE.getStringToDataMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToDataListMapImpl <em>String To Data List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToDataListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataListMap()
		 * @generated
		 */
		EClass STRING_TO_DATA_LIST_MAP = eINSTANCE.getStringToDataListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DATA_LIST_MAP__KEY = eINSTANCE.getStringToDataListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_DATA_LIST_MAP__VALUE = eINSTANCE.getStringToDataListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToDataFormatMapImpl <em>String To Data Format Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToDataFormatMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataFormatMap()
		 * @generated
		 */
		EClass STRING_TO_DATA_FORMAT_MAP = eINSTANCE.getStringToDataFormatMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DATA_FORMAT_MAP__KEY = eINSTANCE.getStringToDataFormatMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_DATA_FORMAT_MAP__VALUE = eINSTANCE.getStringToDataFormatMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToToolMatchMapImpl <em>String To Tool Match Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToToolMatchMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToToolMatchMap()
		 * @generated
		 */
		EClass STRING_TO_TOOL_MATCH_MAP = eINSTANCE.getStringToToolMatchMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TOOL_MATCH_MAP__KEY = eINSTANCE.getStringToToolMatchMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TOOL_MATCH_MAP__VALUE = eINSTANCE.getStringToToolMatchMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.TaskToDataPortsMapImpl <em>Task To Data Ports Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.TaskToDataPortsMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getTaskToDataPortsMap()
		 * @generated
		 */
		EClass TASK_TO_DATA_PORTS_MAP = eINSTANCE.getTaskToDataPortsMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TO_DATA_PORTS_MAP__KEY = eINSTANCE.getTaskToDataPortsMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TO_DATA_PORTS_MAP__VALUE = eINSTANCE.getTaskToDataPortsMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.TaskToDataLinkListMapImpl <em>Task To Data Link List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.TaskToDataLinkListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getTaskToDataLinkListMap()
		 * @generated
		 */
		EClass TASK_TO_DATA_LINK_LIST_MAP = eINSTANCE.getTaskToDataLinkListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TO_DATA_LINK_LIST_MAP__KEY = eINSTANCE.getTaskToDataLinkListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TO_DATA_LINK_LIST_MAP__VALUE = eINSTANCE.getTaskToDataLinkListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToParameterListMapImpl <em>String To Parameter List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToParameterListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToParameterListMap()
		 * @generated
		 */
		EClass STRING_TO_PARAMETER_LIST_MAP = eINSTANCE.getStringToParameterListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PARAMETER_LIST_MAP__KEY = eINSTANCE.getStringToParameterListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PARAMETER_LIST_MAP__VALUE = eINSTANCE.getStringToParameterListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToDataLinkMapImpl <em>String To Data Link Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToDataLinkMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToDataLinkMap()
		 * @generated
		 */
		EClass STRING_TO_DATA_LINK_MAP = eINSTANCE.getStringToDataLinkMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DATA_LINK_MAP__KEY = eINSTANCE.getStringToDataLinkMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_DATA_LINK_MAP__VALUE = eINSTANCE.getStringToDataLinkMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.CellToCellListMapImpl <em>Cell To Cell List Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.CellToCellListMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getCellToCellListMap()
		 * @generated
		 */
		EClass CELL_TO_CELL_LIST_MAP = eINSTANCE.getCellToCellListMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TO_CELL_LIST_MAP__KEY = eINSTANCE.getCellToCellListMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TO_CELL_LIST_MAP__VALUE = eINSTANCE.getCellToCellListMap_Value();

		/**
		 * The meta object literal for the '{@link easyflow.util.maps.impl.StringToBooleanMapImpl <em>String To Boolean Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.util.maps.impl.StringToBooleanMapImpl
		 * @see easyflow.util.maps.impl.MapsPackageImpl#getStringToBooleanMap()
		 * @generated
		 */
		EClass STRING_TO_BOOLEAN_MAP = eINSTANCE.getStringToBooleanMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BOOLEAN_MAP__KEY = eINSTANCE.getStringToBooleanMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BOOLEAN_MAP__VALUE = eINSTANCE.getStringToBooleanMap_Value();

	}

} //MapsPackage
