/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;
import easyflow.core.*;

import java.util.Map;
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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/core/easyflow.core/1.0.0"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.WORKFLOW: return createWorkflow();
			case CorePackage.TASK: return createTask();
			case CorePackage.TOOL: return createTool();
			case CorePackage.INTERPRETER: return createInterpreter();
			case CorePackage.COMMAND: return createCommand();
			case CorePackage.DATA_PORT: return createDataPort();
			case CorePackage.DATA_FORMAT: return createDataFormat();
			case CorePackage.DEFAULT_WORKFLOW_TEMPLATE: return createDefaultWorkflowTemplate();
			case CorePackage.EASYFLOW_TEMPLATE: return createEasyflowTemplate();
			case CorePackage.EASYFLOW_TASK_READER: return createEasyflowTaskReader();
			case CorePackage.GALAXY_TASK_READER: return createGalaxyTaskReader();
			case CorePackage.DEFAULT_META_DATA: return createDefaultMetaData();
			case CorePackage.GROUPING_CRITERION: return createGroupingCriterion();
			case CorePackage.TRAVERSAL_CRITERION: return createTraversalCriterion();
			case CorePackage.TRAVERSAL_EVENT: return createTraversalEvent();
			case CorePackage.TRAVERSAL_OPERATION: return createTraversalOperation();
			case CorePackage.TRAVERSAL_CHUNK: return createTraversalChunk();
			case CorePackage.DEFAULT_RECORD: return createDefaultRecord();
			case CorePackage.STRING_TO_TASK_MAP: return (EObject)createStringToTaskMap();
			case CorePackage.STRING_TO_TRAVERSAL_EVENT_MAP: return (EObject)createStringToTraversalEventMap();
			case CorePackage.STRING_TO_GRAPH_CELL_MAP: return (EObject)createStringToGraphCellMap();
			case CorePackage.STRING_TO_TRAVERSAL_CRITERION_MAP: return (EObject)createStringToTraversalCriterionMap();
			case CorePackage.STRING_TO_OBJECT_MAP: return (EObject)createStringToObjectMap();
			case CorePackage.STRING_TO_CHUNKS_MAP: return (EObject)createStringToChunksMap();
			case CorePackage.STRING_TO_CHUNK_MAP: return (EObject)createStringToChunkMap();
			case CorePackage.STRING_TO_TOOL_MAP: return (EObject)createStringToToolMap();
			case CorePackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case CorePackage.STRING_TO_GROUPING_MAP: return (EObject)createStringToGroupingMap();
			case CorePackage.STRING_TO_GROUPING_FEATURE_MAP: return (EObject)createStringToGroupingFeatureMap();
			case CorePackage.STRING_TO_GROUPING_INSTANCE_LIST_MAP: return (EObject)createStringToGroupingInstanceListMap();
			case CorePackage.STRING_TO_STRING_LIST_MAP: return (EObject)createStringToStringListMap();
			case CorePackage.GROUPING: return createGrouping();
			case CorePackage.GROUPING_INSTANCE: return createGroupingInstance();
			case CorePackage.GROUPING_FEATURE: return createGroupingFeature();
			case CorePackage.GROUPING_INSTANCE_LIST: return createGroupingInstanceList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat createDataFormat() {
		DataFormatImpl dataFormat = new DataFormatImpl();
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultWorkflowTemplate createDefaultWorkflowTemplate() {
		DefaultWorkflowTemplateImpl defaultWorkflowTemplate = new DefaultWorkflowTemplateImpl();
		return defaultWorkflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowTemplate createEasyflowTemplate() {
		EasyflowTemplateImpl easyflowTemplate = new EasyflowTemplateImpl();
		return easyflowTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowTaskReader createEasyflowTaskReader() {
		EasyflowTaskReaderImpl easyflowTaskReader = new EasyflowTaskReaderImpl();
		return easyflowTaskReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GalaxyTaskReader createGalaxyTaskReader() {
		GalaxyTaskReaderImpl galaxyTaskReader = new GalaxyTaskReaderImpl();
		return galaxyTaskReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultMetaData createDefaultMetaData() {
		DefaultMetaDataImpl defaultMetaData = new DefaultMetaDataImpl();
		return defaultMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCriterion createGroupingCriterion() {
		GroupingCriterionImpl groupingCriterion = new GroupingCriterionImpl();
		return groupingCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalCriterion createTraversalCriterion() {
		TraversalCriterionImpl traversalCriterion = new TraversalCriterionImpl();
		return traversalCriterion;
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
	public TraversalEvent createTraversalEvent() {
		TraversalEventImpl traversalEvent = new TraversalEventImpl();
		return traversalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalOperation createTraversalOperation() {
		TraversalOperationImpl traversalOperation = new TraversalOperationImpl();
		return traversalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalChunk createTraversalChunk() {
		TraversalChunkImpl traversalChunk = new TraversalChunkImpl();
		return traversalChunk;
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
	public DefaultRecord createDefaultRecord() {
		DefaultRecordImpl defaultRecord = new DefaultRecordImpl();
		return defaultRecord;
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
	public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingInstance createGroupingInstance() {
		GroupingInstanceImpl groupingInstance = new GroupingInstanceImpl();
		return groupingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingFeature createGroupingFeature() {
		GroupingFeatureImpl groupingFeature = new GroupingFeatureImpl();
		return groupingFeature;
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
	public GroupingInstanceList createGroupingInstanceList() {
		GroupingInstanceListImpl groupingInstanceList = new GroupingInstanceListImpl();
		return groupingInstanceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpreter createInterpreter() {
		InterpreterImpl interpreter = new InterpreterImpl();
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
