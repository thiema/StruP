/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util.maps.impl;

import com.mxgraph.model.mxICell;

import easyflow.core.Task;

import easyflow.metadata.Grouping;
import easyflow.metadata.GroupingFeature;
import easyflow.metadata.GroupingInstanceList;

import easyflow.tool.Parameter;
import easyflow.tool.Tool;

import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;

import easyflow.ui.DefaultProject;

import easyflow.util.maps.*;

import java.net.URI;

import java.util.Map;

import javax.xml.validation.Schema;

import org.eclipse.emf.common.util.EList;

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
public class MapsFactoryImpl extends EFactoryImpl implements MapsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapsFactory init() {
		try {
			MapsFactory theMapsFactory = (MapsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/util/maps/1.0.0"); 
			if (theMapsFactory != null) {
				return theMapsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MapsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsFactoryImpl() {
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
			case MapsPackage.STRING_TO_TASK_MAP: return (EObject)createStringToTaskMap();
			case MapsPackage.STRING_TO_TRAVERSAL_EVENT_MAP: return (EObject)createStringToTraversalEventMap();
			case MapsPackage.STRING_TO_GRAPH_CELL_MAP: return (EObject)createStringToGraphCellMap();
			case MapsPackage.STRING_TO_TRAVERSAL_CRITERION_MAP: return (EObject)createStringToTraversalCriterionMap();
			case MapsPackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
			case MapsPackage.STRING_TO_CHUNKS_MAP: return (EObject)createStringToChunksMap();
			case MapsPackage.STRING_TO_CHUNK_MAP: return (EObject)createStringToChunkMap();
			case MapsPackage.STRING_TO_TOOL_MAP: return (EObject)createStringToToolMap();
			case MapsPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case MapsPackage.STRING_TO_GROUPING_MAP: return (EObject)createStringToGroupingMap();
			case MapsPackage.STRING_TO_GROUPING_FEATURE_MAP: return (EObject)createStringToGroupingFeatureMap();
			case MapsPackage.STRING_TO_GROUPING_INSTANCE_LIST_MAP: return (EObject)createStringToGroupingInstanceListMap();
			case MapsPackage.STRING_TO_STRING_LIST_MAP: return (EObject)createStringToStringListMap();
			case MapsPackage.STRING_TO_URI_MAP: return (EObject)createStringToURIMap();
			case MapsPackage.STRING_TO_SCHEMA_MAP: return (EObject)createStringToSchemaMap();
			case MapsPackage.STRING_TO_PROJECT_MAP: return (EObject)createStringToProjectMap();
			case MapsPackage.STRING_TO_PARAMETER_MAP: return (EObject)createStringToParameterMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Task> createStringToTaskMap() {
		StringToTaskMapImpl stringToTaskMap = new StringToTaskMapImpl();
		return stringToTaskMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, TraversalEvent> createStringToTraversalEventMap() {
		StringToTraversalEventMapImpl stringToTraversalEventMap = new StringToTraversalEventMapImpl();
		return stringToTraversalEventMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, mxICell> createStringToGraphCellMap() {
		StringToGraphCellMapImpl stringToGraphCellMap = new StringToGraphCellMapImpl();
		return stringToGraphCellMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, TraversalCriterion> createStringToTraversalCriterionMap() {
		StringToTraversalCriterionMapImpl stringToTraversalCriterionMap = new StringToTraversalCriterionMapImpl();
		return stringToTraversalCriterionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createStringToObjectMap() {
		StringToObjectMapImpl stringToObjectMap = new StringToObjectMapImpl();
		return stringToObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<TraversalChunk>> createStringToChunksMap() {
		StringToChunksMapImpl stringToChunksMap = new StringToChunksMapImpl();
		return stringToChunksMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, TraversalChunk> createStringToChunkMap() {
		StringToChunkMapImpl stringToChunkMap = new StringToChunkMapImpl();
		return stringToChunkMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Tool> createStringToToolMap() {
		StringToToolMapImpl stringToToolMap = new StringToToolMapImpl();
		return stringToToolMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Grouping> createStringToGroupingMap() {
		StringToGroupingMapImpl stringToGroupingMap = new StringToGroupingMapImpl();
		return stringToGroupingMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, GroupingFeature> createStringToGroupingFeatureMap() {
		StringToGroupingFeatureMapImpl stringToGroupingFeatureMap = new StringToGroupingFeatureMapImpl();
		return stringToGroupingFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, GroupingInstanceList> createStringToGroupingInstanceListMap() {
		StringToGroupingInstanceListMapImpl stringToGroupingInstanceListMap = new StringToGroupingInstanceListMapImpl();
		return stringToGroupingInstanceListMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<String>> createStringToStringListMap() {
		StringToStringListMapImpl stringToStringListMap = new StringToStringListMapImpl();
		return stringToStringListMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, URI> createStringToURIMap() {
		StringToURIMapImpl stringToURIMap = new StringToURIMapImpl();
		return stringToURIMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Schema> createStringToSchemaMap() {
		StringToSchemaMapImpl stringToSchemaMap = new StringToSchemaMapImpl();
		return stringToSchemaMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, DefaultProject> createStringToProjectMap() {
		StringToProjectMapImpl stringToProjectMap = new StringToProjectMapImpl();
		return stringToProjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Parameter> createStringToParameterMap() {
		StringToParameterMapImpl stringToParameterMap = new StringToParameterMapImpl();
		return stringToParameterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsPackage getMapsPackage() {
		return (MapsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MapsPackage getPackage() {
		return MapsPackage.eINSTANCE;
	}

} //MapsFactoryImpl
