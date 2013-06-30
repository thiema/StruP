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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseInterpreter(Interpreter object) {
				return createInterpreterAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseDataPort(DataPort object) {
				return createDataPortAdapter();
			}
			@Override
			public Adapter caseDataFormat(DataFormat object) {
				return createDataFormatAdapter();
			}
			@Override
			public Adapter caseIWorkflowTemplate(IWorkflowTemplate object) {
				return createIWorkflowTemplateAdapter();
			}
			@Override
			public Adapter caseDefaultWorkflowTemplate(DefaultWorkflowTemplate object) {
				return createDefaultWorkflowTemplateAdapter();
			}
			@Override
			public Adapter caseEasyflowTemplate(EasyflowTemplate object) {
				return createEasyflowTemplateAdapter();
			}
			@Override
			public Adapter caseITaskReader(ITaskReader object) {
				return createITaskReaderAdapter();
			}
			@Override
			public Adapter caseEasyflowTaskReader(EasyflowTaskReader object) {
				return createEasyflowTaskReaderAdapter();
			}
			@Override
			public Adapter caseGalaxyTaskReader(GalaxyTaskReader object) {
				return createGalaxyTaskReaderAdapter();
			}
			@Override
			public Adapter caseIMetaData(IMetaData object) {
				return createIMetaDataAdapter();
			}
			@Override
			public Adapter caseDefaultMetaData(DefaultMetaData object) {
				return createDefaultMetaDataAdapter();
			}
			@Override
			public Adapter caseIProjectMetaData(IProjectMetaData object) {
				return createIProjectMetaDataAdapter();
			}
			@Override
			public Adapter caseGroupingCriterion(GroupingCriterion object) {
				return createGroupingCriterionAdapter();
			}
			@Override
			public Adapter caseTraversalCriterion(TraversalCriterion object) {
				return createTraversalCriterionAdapter();
			}
			@Override
			public Adapter caseTraversalEvent(TraversalEvent object) {
				return createTraversalEventAdapter();
			}
			@Override
			public Adapter caseTraversalOperation(TraversalOperation object) {
				return createTraversalOperationAdapter();
			}
			@Override
			public Adapter caseTraversalChunk(TraversalChunk object) {
				return createTraversalChunkAdapter();
			}
			@Override
			public Adapter caseDefaultRecord(DefaultRecord object) {
				return createDefaultRecordAdapter();
			}
			@Override
			public Adapter caseStringToTaskMap(Map.Entry<String, Task> object) {
				return createStringToTaskMapAdapter();
			}
			@Override
			public Adapter caseStringToTraversalEventMap(Map.Entry<String, TraversalEvent> object) {
				return createStringToTraversalEventMapAdapter();
			}
			@Override
			public Adapter caseStringToGraphCellMap(Map.Entry<String, mxICell> object) {
				return createStringToGraphCellMapAdapter();
			}
			@Override
			public Adapter caseStringToTraversalCriterionMap(Map.Entry<String, TraversalCriterion> object) {
				return createStringToTraversalCriterionMapAdapter();
			}
			@Override
			public Adapter caseStringToObjectMap(Map.Entry<String, Object> object) {
				return createStringToObjectMapAdapter();
			}
			@Override
			public Adapter caseStringToChunksMap(Map.Entry<String, EList<TraversalChunk>> object) {
				return createStringToChunksMapAdapter();
			}
			@Override
			public Adapter caseStringToChunkMap(Map.Entry<String, TraversalChunk> object) {
				return createStringToChunkMapAdapter();
			}
			@Override
			public Adapter caseStringToToolMap(Map.Entry<String, Tool> object) {
				return createStringToToolMapAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter caseStringToGroupingMap(Map.Entry<String, Grouping> object) {
				return createStringToGroupingMapAdapter();
			}
			@Override
			public Adapter caseStringToGroupingFeatureMap(Map.Entry<String, GroupingFeature> object) {
				return createStringToGroupingFeatureMapAdapter();
			}
			@Override
			public Adapter caseStringToGroupingInstanceListMap(Map.Entry<String, GroupingInstanceList> object) {
				return createStringToGroupingInstanceListMapAdapter();
			}
			@Override
			public Adapter caseStringToStringListMap(Map.Entry<String, EList<String>> object) {
				return createStringToStringListMapAdapter();
			}
			@Override
			public Adapter caseGrouping(Grouping object) {
				return createGroupingAdapter();
			}
			@Override
			public Adapter caseGroupingInstance(GroupingInstance object) {
				return createGroupingInstanceAdapter();
			}
			@Override
			public Adapter caseGroupingFeature(GroupingFeature object) {
				return createGroupingFeatureAdapter();
			}
			@Override
			public Adapter caseGroupingInstanceList(GroupingInstanceList object) {
				return createGroupingInstanceListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DataFormat
	 * @generated
	 */
	public Adapter createDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IWorkflowTemplate <em>IWorkflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IWorkflowTemplate
	 * @generated
	 */
	public Adapter createIWorkflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultWorkflowTemplate <em>Default Workflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultWorkflowTemplate
	 * @generated
	 */
	public Adapter createDefaultWorkflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.EasyflowTemplate <em>Easyflow Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.EasyflowTemplate
	 * @generated
	 */
	public Adapter createEasyflowTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.ITaskReader <em>ITask Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.ITaskReader
	 * @generated
	 */
	public Adapter createITaskReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.EasyflowTaskReader <em>Easyflow Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.EasyflowTaskReader
	 * @generated
	 */
	public Adapter createEasyflowTaskReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GalaxyTaskReader <em>Galaxy Task Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GalaxyTaskReader
	 * @generated
	 */
	public Adapter createGalaxyTaskReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IMetaData <em>IMeta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IMetaData
	 * @generated
	 */
	public Adapter createIMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultMetaData <em>Default Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultMetaData
	 * @generated
	 */
	public Adapter createDefaultMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.IProjectMetaData <em>IProject Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.IProjectMetaData
	 * @generated
	 */
	public Adapter createIProjectMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GroupingCriterion <em>Grouping Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GroupingCriterion
	 * @generated
	 */
	public Adapter createGroupingCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.TraversalCriterion <em>Traversal Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.TraversalCriterion
	 * @generated
	 */
	public Adapter createTraversalCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Task Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToTaskMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.TraversalEvent <em>Traversal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.TraversalEvent
	 * @generated
	 */
	public Adapter createTraversalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.TraversalOperation <em>Traversal Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.TraversalOperation
	 * @generated
	 */
	public Adapter createTraversalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.TraversalChunk <em>Traversal Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.TraversalChunk
	 * @generated
	 */
	public Adapter createTraversalChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Traversal Event Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToTraversalEventMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Graph Cell Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToGraphCellMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Traversal Criterion Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToTraversalCriterionMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.DefaultRecord <em>Default Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.DefaultRecord
	 * @generated
	 */
	public Adapter createDefaultRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Chunks Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToChunksMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Chunk Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToChunkMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Tool Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToToolMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Grouping Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToGroupingMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Grouping
	 * @generated
	 */
	public Adapter createGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GroupingInstance <em>Grouping Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GroupingInstance
	 * @generated
	 */
	public Adapter createGroupingInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GroupingFeature <em>Grouping Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GroupingFeature
	 * @generated
	 */
	public Adapter createGroupingFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Grouping Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToGroupingFeatureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Grouping Instance List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToGroupingInstanceListMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringListMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.GroupingInstanceList <em>Grouping Instance List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.GroupingInstanceList
	 * @generated
	 */
	public Adapter createGroupingInstanceListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Interpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Interpreter
	 * @generated
	 */
	public Adapter createInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.core.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.core.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
