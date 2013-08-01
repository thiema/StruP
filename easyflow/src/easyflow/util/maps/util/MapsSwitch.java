/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.util.maps.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see easyflow.util.maps.MapsPackage
 * @generated
 */
public class MapsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsSwitch() {
		if (modelPackage == null) {
			modelPackage = MapsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MapsPackage.STRING_TO_TASK_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Task> stringToTaskMap = (Map.Entry<String, Task>)theEObject;
				T result = caseStringToTaskMap(stringToTaskMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_TRAVERSAL_EVENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalEvent> stringToTraversalEventMap = (Map.Entry<String, TraversalEvent>)theEObject;
				T result = caseStringToTraversalEventMap(stringToTraversalEventMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_GRAPH_CELL_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, mxICell> stringToGraphCellMap = (Map.Entry<String, mxICell>)theEObject;
				T result = caseStringToGraphCellMap(stringToGraphCellMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_TRAVERSAL_CRITERION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalCriterion> stringToTraversalCriterionMap = (Map.Entry<String, TraversalCriterion>)theEObject;
				T result = caseStringToTraversalCriterionMap(stringToTraversalCriterionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Object> stringToObjectMap = (Map.Entry<String, Object>)theEObject;
				T result = caseStringToObjectMap(stringToObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_CHUNKS_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<TraversalChunk>> stringToChunksMap = (Map.Entry<String, EList<TraversalChunk>>)theEObject;
				T result = caseStringToChunksMap(stringToChunksMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_CHUNK_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalChunk> stringToChunkMap = (Map.Entry<String, TraversalChunk>)theEObject;
				T result = caseStringToChunkMap(stringToChunkMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_TOOL_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Tool> stringToToolMap = (Map.Entry<String, Tool>)theEObject;
				T result = caseStringToToolMap(stringToToolMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_STRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_GROUPING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Grouping> stringToGroupingMap = (Map.Entry<String, Grouping>)theEObject;
				T result = caseStringToGroupingMap(stringToGroupingMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_GROUPING_FEATURE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, GroupingFeature> stringToGroupingFeatureMap = (Map.Entry<String, GroupingFeature>)theEObject;
				T result = caseStringToGroupingFeatureMap(stringToGroupingFeatureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_GROUPING_INSTANCE_LIST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, GroupingInstanceList> stringToGroupingInstanceListMap = (Map.Entry<String, GroupingInstanceList>)theEObject;
				T result = caseStringToGroupingInstanceListMap(stringToGroupingInstanceListMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_STRING_LIST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<String>> stringToStringListMap = (Map.Entry<String, EList<String>>)theEObject;
				T result = caseStringToStringListMap(stringToStringListMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_URI_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, URI> stringToURIMap = (Map.Entry<String, URI>)theEObject;
				T result = caseStringToURIMap(stringToURIMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_SCHEMA_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Schema> stringToSchemaMap = (Map.Entry<String, Schema>)theEObject;
				T result = caseStringToSchemaMap(stringToSchemaMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_PROJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, DefaultProject> stringToProjectMap = (Map.Entry<String, DefaultProject>)theEObject;
				T result = caseStringToProjectMap(stringToProjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MapsPackage.STRING_TO_PARAMETER_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Parameter> stringToParameterMap = (Map.Entry<String, Parameter>)theEObject;
				T result = caseStringToParameterMap(stringToParameterMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Task Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Task Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToTaskMap(Map.Entry<String, Task> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Traversal Event Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Traversal Event Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToTraversalEventMap(Map.Entry<String, TraversalEvent> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Graph Cell Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Graph Cell Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGraphCellMap(Map.Entry<String, mxICell> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Traversal Criterion Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Traversal Criterion Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToTraversalCriterionMap(Map.Entry<String, TraversalCriterion> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToObjectMap(Map.Entry<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Chunks Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Chunks Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToChunksMap(Map.Entry<String, EList<TraversalChunk>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Chunk Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Chunk Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToChunkMap(Map.Entry<String, TraversalChunk> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Tool Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Tool Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToToolMap(Map.Entry<String, Tool> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMap(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Grouping Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Grouping Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGroupingMap(Map.Entry<String, Grouping> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Grouping Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Grouping Feature Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGroupingFeatureMap(Map.Entry<String, GroupingFeature> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Grouping Instance List Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Grouping Instance List Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGroupingInstanceListMap(Map.Entry<String, GroupingInstanceList> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String List Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringListMap(Map.Entry<String, EList<String>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To URI Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To URI Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToURIMap(Map.Entry<String, URI> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Schema Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Schema Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToSchemaMap(Map.Entry<String, Schema> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Project Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Project Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToProjectMap(Map.Entry<String, DefaultProject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Parameter Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Parameter Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToParameterMap(Map.Entry<String, Parameter> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MapsSwitch
