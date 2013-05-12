/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.util;

import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;
import easyflow.core.*;

import java.util.Map;
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
 * @see easyflow.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERPRETER: {
				Interpreter interpreter = (Interpreter)theEObject;
				T result = caseInterpreter(interpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_PORT: {
				DataPort dataPort = (DataPort)theEObject;
				T result = caseDataPort(dataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_FORMAT: {
				DataFormat dataFormat = (DataFormat)theEObject;
				T result = caseDataFormat(dataFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IWORKFLOW_TEMPLATE: {
				IWorkflowTemplate iWorkflowTemplate = (IWorkflowTemplate)theEObject;
				T result = caseIWorkflowTemplate(iWorkflowTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE: {
				DefaultWorkflowTemplate defaultWorkflowTemplate = (DefaultWorkflowTemplate)theEObject;
				T result = caseDefaultWorkflowTemplate(defaultWorkflowTemplate);
				if (result == null) result = caseIWorkflowTemplate(defaultWorkflowTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EASYFLOW_TEMPLATE: {
				EasyflowTemplate easyflowTemplate = (EasyflowTemplate)theEObject;
				T result = caseEasyflowTemplate(easyflowTemplate);
				if (result == null) result = caseDefaultWorkflowTemplate(easyflowTemplate);
				if (result == null) result = caseIWorkflowTemplate(easyflowTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ITASK_READER: {
				ITaskReader iTaskReader = (ITaskReader)theEObject;
				T result = caseITaskReader(iTaskReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EASYFLOW_TASK_READER: {
				EasyflowTaskReader easyflowTaskReader = (EasyflowTaskReader)theEObject;
				T result = caseEasyflowTaskReader(easyflowTaskReader);
				if (result == null) result = caseITaskReader(easyflowTaskReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GALAXY_TASK_READER: {
				GalaxyTaskReader galaxyTaskReader = (GalaxyTaskReader)theEObject;
				T result = caseGalaxyTaskReader(galaxyTaskReader);
				if (result == null) result = caseITaskReader(galaxyTaskReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMETA_DATA: {
				IMetaData iMetaData = (IMetaData)theEObject;
				T result = caseIMetaData(iMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_META_DATA: {
				DefaultMetaData defaultMetaData = (DefaultMetaData)theEObject;
				T result = caseDefaultMetaData(defaultMetaData);
				if (result == null) result = caseIMetaData(defaultMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IPROJECT_META_DATA: {
				IProjectMetaData iProjectMetaData = (IProjectMetaData)theEObject;
				T result = caseIProjectMetaData(iProjectMetaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING_CRITERION: {
				GroupingCriterion groupingCriterion = (GroupingCriterion)theEObject;
				T result = caseGroupingCriterion(groupingCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRAVERSAL_CRITERION: {
				TraversalCriterion traversalCriterion = (TraversalCriterion)theEObject;
				T result = caseTraversalCriterion(traversalCriterion);
				if (result == null) result = caseGroupingCriterion(traversalCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRAVERSAL_EVENT: {
				TraversalEvent traversalEvent = (TraversalEvent)theEObject;
				T result = caseTraversalEvent(traversalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRAVERSAL_OPERATION: {
				TraversalOperation traversalOperation = (TraversalOperation)theEObject;
				T result = caseTraversalOperation(traversalOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRAVERSAL_CHUNK: {
				TraversalChunk traversalChunk = (TraversalChunk)theEObject;
				T result = caseTraversalChunk(traversalChunk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_RECORD: {
				DefaultRecord defaultRecord = (DefaultRecord)theEObject;
				T result = caseDefaultRecord(defaultRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_TASK_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Task> stringToTaskMap = (Map.Entry<String, Task>)theEObject;
				T result = caseStringToTaskMap(stringToTaskMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_TRAVERSAL_EVENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalEvent> stringToTraversalEventMap = (Map.Entry<String, TraversalEvent>)theEObject;
				T result = caseStringToTraversalEventMap(stringToTraversalEventMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_GRAPH_CELL_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, mxICell> stringToGraphCellMap = (Map.Entry<String, mxICell>)theEObject;
				T result = caseStringToGraphCellMap(stringToGraphCellMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_TRAVERSAL_CRITERION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalCriterion> stringToTraversalCriterionMap = (Map.Entry<String, TraversalCriterion>)theEObject;
				T result = caseStringToTraversalCriterionMap(stringToTraversalCriterionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Object> stringToObjectMap = (Map.Entry<String, Object>)theEObject;
				T result = caseStringToObjectMap(stringToObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_CHUNKS_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<TraversalChunk>> stringToChunksMap = (Map.Entry<String, EList<TraversalChunk>>)theEObject;
				T result = caseStringToChunksMap(stringToChunksMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_CHUNK_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, TraversalChunk> stringToChunkMap = (Map.Entry<String, TraversalChunk>)theEObject;
				T result = caseStringToChunkMap(stringToChunkMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_TOOL_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Tool> stringToToolMap = (Map.Entry<String, Tool>)theEObject;
				T result = caseStringToToolMap(stringToToolMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_STRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_GROUPING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Grouping> stringToGroupingMap = (Map.Entry<String, Grouping>)theEObject;
				T result = caseStringToGroupingMap(stringToGroupingMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_GROUPING_FEATURE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, GroupingFeature> stringToGroupingFeatureMap = (Map.Entry<String, GroupingFeature>)theEObject;
				T result = caseStringToGroupingFeatureMap(stringToGroupingFeatureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_GROUPING_INSTANCE_LIST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, GroupingInstanceList> stringToGroupingInstanceListMap = (Map.Entry<String, GroupingInstanceList>)theEObject;
				T result = caseStringToGroupingInstanceListMap(stringToGroupingInstanceListMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING: {
				Grouping grouping = (Grouping)theEObject;
				T result = caseGrouping(grouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING_INSTANCE: {
				GroupingInstance groupingInstance = (GroupingInstance)theEObject;
				T result = caseGroupingInstance(groupingInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING_FEATURE: {
				GroupingFeature groupingFeature = (GroupingFeature)theEObject;
				T result = caseGroupingFeature(groupingFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING_INSTANCE_LIST: {
				GroupingInstanceList groupingInstanceList = (GroupingInstanceList)theEObject;
				T result = caseGroupingInstanceList(groupingInstanceList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPort(DataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFormat(DataFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWorkflow Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWorkflow Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWorkflowTemplate(IWorkflowTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Workflow Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Workflow Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultWorkflowTemplate(DefaultWorkflowTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Easyflow Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Easyflow Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEasyflowTemplate(EasyflowTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITask Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITask Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITaskReader(ITaskReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Easyflow Task Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Easyflow Task Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEasyflowTaskReader(EasyflowTaskReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Galaxy Task Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Galaxy Task Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalaxyTaskReader(GalaxyTaskReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMeta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMeta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMetaData(IMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultMetaData(DefaultMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProject Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProject Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProjectMetaData(IProjectMetaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingCriterion(GroupingCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversal Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversal Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversalCriterion(TraversalCriterion object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Traversal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversalEvent(TraversalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversal Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversal Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversalOperation(TraversalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversal Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversal Chunk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraversalChunk(TraversalChunk object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Default Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultRecord(DefaultRecord object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrouping(Grouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingInstance(GroupingInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingFeature(GroupingFeature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Instance List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Instance List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingInstanceList(GroupingInstanceList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpreter(Interpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
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

} //CoreSwitch
