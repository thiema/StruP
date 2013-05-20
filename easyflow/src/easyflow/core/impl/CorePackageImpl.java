/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.EasyflowPackage;

import easyflow.core.Command;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DataFormat;
import easyflow.core.DataPort;
import easyflow.core.DefaultMetaData;
import easyflow.core.DefaultRecord;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.EasyflowTaskReader;
import easyflow.core.EasyflowTemplate;
import easyflow.core.GalaxyTaskReader;
import easyflow.core.Grouping;
import easyflow.core.GroupingCriterion;
import easyflow.core.GroupingFeature;
import easyflow.core.GroupingInstance;
import easyflow.core.GroupingInstanceList;
import easyflow.core.IMetaData;
import easyflow.core.IProjectMetaData;
import easyflow.core.ITaskReader;
import easyflow.core.IWorkflowTemplate;
import easyflow.core.Interpreter;
import easyflow.core.StringToToolMap;
import easyflow.core.SplittingEvent;
import easyflow.core.Task;
import easyflow.core.Tool;
import easyflow.core.Tool_old;
import easyflow.core.TraversalChunk;
import easyflow.core.TraversalChunks;
import easyflow.core.TraversalCriterion;
import easyflow.core.TraversalEvent;
import easyflow.core.TraversalOperation;
import easyflow.core.Workflow;

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;
import easyflow.impl.EasyflowPackageImpl;

import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.dataformat.DataformatPackage;

import easyflow.sequencing.dataformat.impl.DataformatPackageImpl;

import easyflow.sequencing.grouping.GroupingPackage;

import easyflow.sequencing.grouping.impl.GroupingPackageImpl;

import easyflow.sequencing.impl.SequencingPackageImpl;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWorkflowTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultWorkflowTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyflowTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTaskReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass easyflowTaskReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galaxyTaskReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProjectMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTaskMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalChunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTraversalEventMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToGraphCellMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTraversalCriterionMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToChunksMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToChunkMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToToolMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToGroupingMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToGroupingFeatureMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToGroupingInstanceListMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingInstanceListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see easyflow.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		SequencingPackageImpl theSequencingPackage = (SequencingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) instanceof SequencingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) : SequencingPackage.eINSTANCE);
		GroupingPackageImpl theGroupingPackage = (GroupingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) instanceof GroupingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) : GroupingPackage.eINSTANCE);
		DataformatPackageImpl theDataformatPackage = (DataformatPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) instanceof DataformatPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) : DataformatPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theSequencingPackage.createPackageContents();
		theGroupingPackage.createPackageContents();
		theDataformatPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theSequencingPackage.initializePackageContents();
		theGroupingPackage.initializePackageContents();
		theDataformatPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Graph() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_FirstNode() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_KnownGroupingCriteria() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_KnownDataFormats() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_KnownTraversalCriteria() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_WorkflowTemplate() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_LastTasks() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Logger() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_MetaData() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Mode() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_DefaultGroupingCriteria() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_PreviousTaskName() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_GenericAttributes() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_ToolsSchemaDefinition() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_ToolsDescription() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Tools() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_GraphUtil() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_InDataPorts() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OutDataPorts() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ShallProcessJEXL() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Util() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_JexlEngine() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Logger() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_TraversalEvents() {
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Parents() {
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Chunks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_FullName() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CurrentTraversalEventDEPRICATED() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ProcessedTraversalEventsDEPRICATED() {
		return (EReference)taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Tools() {
		return (EReference)taskEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PreviousTaskStr() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Root() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Logger() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Name() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Id() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Version() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Description() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPort() {
		return dataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPort_GroupingCriteria() {
		return (EReference)dataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_Cardinality() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPort_DataFormat() {
		return (EReference)dataPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormat() {
		return dataFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormat_Name() {
		return (EAttribute)dataFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIWorkflowTemplate() {
		return iWorkflowTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultWorkflowTemplate() {
		return defaultWorkflowTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultWorkflowTemplate_Tasks() {
		return (EReference)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultWorkflowTemplate_FileName() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultWorkflowTemplate_Logger() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyflowTemplate() {
		return easyflowTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITaskReader() {
		return iTaskReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEasyflowTaskReader() {
		return easyflowTaskReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEasyflowTaskReader_Logger() {
		return (EAttribute)easyflowTaskReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGalaxyTaskReader() {
		return galaxyTaskReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalaxyTaskReader_Logger() {
		return (EAttribute)galaxyTaskReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMetaData() {
		return iMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultMetaData() {
		return defaultMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultMetaData_FileName() {
		return (EAttribute)defaultMetaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultMetaData_Logger() {
		return (EAttribute)defaultMetaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultMetaData_GroupingInstances() {
		return (EReference)defaultMetaDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultMetaData_GroupingInstancesByGroup() {
		return (EReference)defaultMetaDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultMetaData_Groupings() {
		return (EReference)defaultMetaDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProjectMetaData() {
		return iProjectMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingCriterion() {
		return groupingCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_MultipleInstances() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_SeperateInputPorts() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Logger() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Id() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Description() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Mode() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalCriterion() {
		return traversalCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalCriterion_Operation() {
		return (EReference)traversalCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalCriterion_Chunks() {
		return (EReference)traversalCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalCriterion_ChunkSource() {
		return (EAttribute)traversalCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToTaskMap() {
		return stringToTaskMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToTaskMap_Key() {
		return (EAttribute)stringToTaskMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToTaskMap_Value() {
		return (EReference)stringToTaskMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalEvent() {
		return traversalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_MergeTask() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_SplitTask() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_ParentTask() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_TraversalCriterion() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_Logger() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_MetaData() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_ProcessedDEPRICATED() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_QueuedDEPRECATED() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_FoundMergeTaskDEPRICATED() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_ParentCells() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalOperation() {
		return traversalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalOperation_Name() {
		return (EAttribute)traversalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalOperation_Logger() {
		return (EAttribute)traversalOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalOperation_Type() {
		return (EAttribute)traversalOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalChunk() {
		return traversalChunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalChunk_Name() {
		return (EAttribute)traversalChunkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalChunk_Logger() {
		return (EAttribute)traversalChunkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToTraversalEventMap() {
		return stringToTraversalEventMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToTraversalEventMap_Key() {
		return (EAttribute)stringToTraversalEventMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToTraversalEventMap_Value() {
		return (EReference)stringToTraversalEventMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToGraphCellMap() {
		return stringToGraphCellMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToGraphCellMap_Key() {
		return (EAttribute)stringToGraphCellMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToGraphCellMap_Value() {
		return (EAttribute)stringToGraphCellMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToTraversalCriterionMap() {
		return stringToTraversalCriterionMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToTraversalCriterionMap_Key() {
		return (EAttribute)stringToTraversalCriterionMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToTraversalCriterionMap_Value() {
		return (EReference)stringToTraversalCriterionMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultRecord() {
		return defaultRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultRecord_GenericAttributes() {
		return (EReference)defaultRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToObjectMap() {
		return stringToObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToObjectMap_Value() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToChunksMap() {
		return stringToChunksMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToChunksMap_Key() {
		return (EAttribute)stringToChunksMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToChunksMap_Value() {
		return (EReference)stringToChunksMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToChunkMap() {
		return stringToChunkMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToChunkMap_Key() {
		return (EAttribute)stringToChunkMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToChunkMap_Value() {
		return (EReference)stringToChunkMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToToolMap() {
		return stringToToolMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToToolMap_Key() {
		return (EAttribute)stringToToolMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToToolMap_Value() {
		return (EReference)stringToToolMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToGroupingMap() {
		return stringToGroupingMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToGroupingMap_Key() {
		return (EAttribute)stringToGroupingMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToGroupingMap_Value() {
		return (EReference)stringToGroupingMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrouping() {
		return groupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrouping_Name() {
		return (EAttribute)groupingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrouping_Description() {
		return (EAttribute)groupingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingInstance() {
		return groupingInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingInstance_Name() {
		return (EAttribute)groupingInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupingInstance_Features() {
		return (EReference)groupingInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingFeature() {
		return groupingFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingFeature_Name() {
		return (EAttribute)groupingFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingFeature_Value() {
		return (EAttribute)groupingFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToGroupingFeatureMap() {
		return stringToGroupingFeatureMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToGroupingFeatureMap_Key() {
		return (EAttribute)stringToGroupingFeatureMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToGroupingFeatureMap_Value() {
		return (EReference)stringToGroupingFeatureMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToGroupingInstanceListMap() {
		return stringToGroupingInstanceListMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToGroupingInstanceListMap_Key() {
		return (EAttribute)stringToGroupingInstanceListMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToGroupingInstanceListMap_Value() {
		return (EReference)stringToGroupingInstanceListMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingInstanceList() {
		return groupingInstanceListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupingInstanceList_Instances() {
		return (EReference)groupingInstanceListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToObjectMap_Key() {
		return (EAttribute)stringToObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpreter() {
		return interpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpreter_Exe() {
		return (EAttribute)interpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpreter_Logger() {
		return (EAttribute)interpreterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_ProgramName() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Executable() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Options() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Logger() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__GRAPH);
		createEAttribute(workflowEClass, WORKFLOW__FIRST_NODE);
		createEAttribute(workflowEClass, WORKFLOW__KNOWN_GROUPING_CRITERIA);
		createEAttribute(workflowEClass, WORKFLOW__KNOWN_DATA_FORMATS);
		createEAttribute(workflowEClass, WORKFLOW__KNOWN_TRAVERSAL_CRITERIA);
		createEReference(workflowEClass, WORKFLOW__WORKFLOW_TEMPLATE);
		createEAttribute(workflowEClass, WORKFLOW__LAST_TASKS);
		createEAttribute(workflowEClass, WORKFLOW__LOGGER);
		createEAttribute(workflowEClass, WORKFLOW__META_DATA);
		createEAttribute(workflowEClass, WORKFLOW__MODE);
		createEAttribute(workflowEClass, WORKFLOW__DEFAULT_GROUPING_CRITERIA);
		createEAttribute(workflowEClass, WORKFLOW__PREVIOUS_TASK_NAME);
		createEReference(workflowEClass, WORKFLOW__GENERIC_ATTRIBUTES);
		createEAttribute(workflowEClass, WORKFLOW__TOOLS_SCHEMA_DEFINITION);
		createEAttribute(workflowEClass, WORKFLOW__TOOLS_DESCRIPTION);
		createEReference(workflowEClass, WORKFLOW__TOOLS);
		createEReference(workflowEClass, WORKFLOW__GRAPH_UTIL);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__IN_DATA_PORTS);
		createEReference(taskEClass, TASK__OUT_DATA_PORTS);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__SHALL_PROCESS_JEXL);
		createEAttribute(taskEClass, TASK__UTIL);
		createEAttribute(taskEClass, TASK__JEXL_ENGINE);
		createEAttribute(taskEClass, TASK__LOGGER);
		createEReference(taskEClass, TASK__TRAVERSAL_EVENTS);
		createEReference(taskEClass, TASK__PARENTS);
		createEReference(taskEClass, TASK__CHUNKS);
		createEAttribute(taskEClass, TASK__FULL_NAME);
		createEAttribute(taskEClass, TASK__CURRENT_TRAVERSAL_EVENT_DEPRICATED);
		createEReference(taskEClass, TASK__PROCESSED_TRAVERSAL_EVENTS_DEPRICATED);
		createEReference(taskEClass, TASK__TOOLS);
		createEAttribute(taskEClass, TASK__PREVIOUS_TASK_STR);
		createEAttribute(taskEClass, TASK__ROOT);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__LOGGER);
		createEAttribute(toolEClass, TOOL__NAME);
		createEAttribute(toolEClass, TOOL__ID);
		createEAttribute(toolEClass, TOOL__VERSION);
		createEAttribute(toolEClass, TOOL__DESCRIPTION);

		interpreterEClass = createEClass(INTERPRETER);
		createEAttribute(interpreterEClass, INTERPRETER__EXE);
		createEAttribute(interpreterEClass, INTERPRETER__LOGGER);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__PROGRAM_NAME);
		createEAttribute(commandEClass, COMMAND__EXECUTABLE);
		createEAttribute(commandEClass, COMMAND__OPTIONS);
		createEAttribute(commandEClass, COMMAND__LOGGER);

		dataPortEClass = createEClass(DATA_PORT);
		createEReference(dataPortEClass, DATA_PORT__GROUPING_CRITERIA);
		createEAttribute(dataPortEClass, DATA_PORT__CARDINALITY);
		createEReference(dataPortEClass, DATA_PORT__DATA_FORMAT);

		dataFormatEClass = createEClass(DATA_FORMAT);
		createEAttribute(dataFormatEClass, DATA_FORMAT__NAME);

		iWorkflowTemplateEClass = createEClass(IWORKFLOW_TEMPLATE);

		defaultWorkflowTemplateEClass = createEClass(DEFAULT_WORKFLOW_TEMPLATE);
		createEReference(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__TASKS);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__LOGGER);

		easyflowTemplateEClass = createEClass(EASYFLOW_TEMPLATE);

		iTaskReaderEClass = createEClass(ITASK_READER);

		easyflowTaskReaderEClass = createEClass(EASYFLOW_TASK_READER);
		createEAttribute(easyflowTaskReaderEClass, EASYFLOW_TASK_READER__LOGGER);

		galaxyTaskReaderEClass = createEClass(GALAXY_TASK_READER);
		createEAttribute(galaxyTaskReaderEClass, GALAXY_TASK_READER__LOGGER);

		iMetaDataEClass = createEClass(IMETA_DATA);

		defaultMetaDataEClass = createEClass(DEFAULT_META_DATA);
		createEAttribute(defaultMetaDataEClass, DEFAULT_META_DATA__FILE_NAME);
		createEAttribute(defaultMetaDataEClass, DEFAULT_META_DATA__LOGGER);
		createEReference(defaultMetaDataEClass, DEFAULT_META_DATA__GROUPINGS);
		createEReference(defaultMetaDataEClass, DEFAULT_META_DATA__GROUPING_INSTANCES);
		createEReference(defaultMetaDataEClass, DEFAULT_META_DATA__GROUPING_INSTANCES_BY_GROUP);

		iProjectMetaDataEClass = createEClass(IPROJECT_META_DATA);

		groupingCriterionEClass = createEClass(GROUPING_CRITERION);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__ID);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__DESCRIPTION);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__MODE);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__MULTIPLE_INSTANCES);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__SEPERATE_INPUT_PORTS);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__LOGGER);

		traversalCriterionEClass = createEClass(TRAVERSAL_CRITERION);
		createEReference(traversalCriterionEClass, TRAVERSAL_CRITERION__OPERATION);
		createEReference(traversalCriterionEClass, TRAVERSAL_CRITERION__CHUNKS);
		createEAttribute(traversalCriterionEClass, TRAVERSAL_CRITERION__CHUNK_SOURCE);

		traversalEventEClass = createEClass(TRAVERSAL_EVENT);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__MERGE_TASK);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__SPLIT_TASK);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__PARENT_TASK);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__PARENT_CELLS);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__TRAVERSAL_CRITERION);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__LOGGER);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__META_DATA);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__PROCESSED_DEPRICATED);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__QUEUED_DEPRECATED);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__FOUND_MERGE_TASK_DEPRICATED);

		traversalOperationEClass = createEClass(TRAVERSAL_OPERATION);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__NAME);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__LOGGER);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__TYPE);

		traversalChunkEClass = createEClass(TRAVERSAL_CHUNK);
		createEAttribute(traversalChunkEClass, TRAVERSAL_CHUNK__NAME);
		createEAttribute(traversalChunkEClass, TRAVERSAL_CHUNK__LOGGER);

		defaultRecordEClass = createEClass(DEFAULT_RECORD);
		createEReference(defaultRecordEClass, DEFAULT_RECORD__GENERIC_ATTRIBUTES);

		stringToTaskMapEClass = createEClass(STRING_TO_TASK_MAP);
		createEAttribute(stringToTaskMapEClass, STRING_TO_TASK_MAP__KEY);
		createEReference(stringToTaskMapEClass, STRING_TO_TASK_MAP__VALUE);

		stringToTraversalEventMapEClass = createEClass(STRING_TO_TRAVERSAL_EVENT_MAP);
		createEAttribute(stringToTraversalEventMapEClass, STRING_TO_TRAVERSAL_EVENT_MAP__KEY);
		createEReference(stringToTraversalEventMapEClass, STRING_TO_TRAVERSAL_EVENT_MAP__VALUE);

		stringToGraphCellMapEClass = createEClass(STRING_TO_GRAPH_CELL_MAP);
		createEAttribute(stringToGraphCellMapEClass, STRING_TO_GRAPH_CELL_MAP__KEY);
		createEAttribute(stringToGraphCellMapEClass, STRING_TO_GRAPH_CELL_MAP__VALUE);

		stringToTraversalCriterionMapEClass = createEClass(STRING_TO_TRAVERSAL_CRITERION_MAP);
		createEAttribute(stringToTraversalCriterionMapEClass, STRING_TO_TRAVERSAL_CRITERION_MAP__KEY);
		createEReference(stringToTraversalCriterionMapEClass, STRING_TO_TRAVERSAL_CRITERION_MAP__VALUE);

		stringToObjectMapEClass = createEClass(STRING_TO_OBJECT_MAP);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__KEY);
		createEAttribute(stringToObjectMapEClass, STRING_TO_OBJECT_MAP__VALUE);

		stringToChunksMapEClass = createEClass(STRING_TO_CHUNKS_MAP);
		createEAttribute(stringToChunksMapEClass, STRING_TO_CHUNKS_MAP__KEY);
		createEReference(stringToChunksMapEClass, STRING_TO_CHUNKS_MAP__VALUE);

		stringToChunkMapEClass = createEClass(STRING_TO_CHUNK_MAP);
		createEAttribute(stringToChunkMapEClass, STRING_TO_CHUNK_MAP__KEY);
		createEReference(stringToChunkMapEClass, STRING_TO_CHUNK_MAP__VALUE);

		stringToToolMapEClass = createEClass(STRING_TO_TOOL_MAP);
		createEAttribute(stringToToolMapEClass, STRING_TO_TOOL_MAP__KEY);
		createEReference(stringToToolMapEClass, STRING_TO_TOOL_MAP__VALUE);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		stringToGroupingMapEClass = createEClass(STRING_TO_GROUPING_MAP);
		createEAttribute(stringToGroupingMapEClass, STRING_TO_GROUPING_MAP__KEY);
		createEReference(stringToGroupingMapEClass, STRING_TO_GROUPING_MAP__VALUE);

		stringToGroupingFeatureMapEClass = createEClass(STRING_TO_GROUPING_FEATURE_MAP);
		createEAttribute(stringToGroupingFeatureMapEClass, STRING_TO_GROUPING_FEATURE_MAP__KEY);
		createEReference(stringToGroupingFeatureMapEClass, STRING_TO_GROUPING_FEATURE_MAP__VALUE);

		stringToGroupingInstanceListMapEClass = createEClass(STRING_TO_GROUPING_INSTANCE_LIST_MAP);
		createEAttribute(stringToGroupingInstanceListMapEClass, STRING_TO_GROUPING_INSTANCE_LIST_MAP__KEY);
		createEReference(stringToGroupingInstanceListMapEClass, STRING_TO_GROUPING_INSTANCE_LIST_MAP__VALUE);

		groupingEClass = createEClass(GROUPING);
		createEAttribute(groupingEClass, GROUPING__NAME);
		createEAttribute(groupingEClass, GROUPING__DESCRIPTION);

		groupingInstanceEClass = createEClass(GROUPING_INSTANCE);
		createEAttribute(groupingInstanceEClass, GROUPING_INSTANCE__NAME);
		createEReference(groupingInstanceEClass, GROUPING_INSTANCE__FEATURES);

		groupingFeatureEClass = createEClass(GROUPING_FEATURE);
		createEAttribute(groupingFeatureEClass, GROUPING_FEATURE__NAME);
		createEAttribute(groupingFeatureEClass, GROUPING_FEATURE__VALUE);

		groupingInstanceListEClass = createEClass(GROUPING_INSTANCE_LIST);
		createEReference(groupingInstanceListEClass, GROUPING_INSTANCE_LIST__INSTANCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EasyflowPackage theEasyflowPackage = (EasyflowPackage)EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI);
		JgraphxPackage theJgraphxPackage = (JgraphxPackage)EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultWorkflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getDefaultWorkflowTemplate());
		easyflowTaskReaderEClass.getESuperTypes().add(this.getITaskReader());
		galaxyTaskReaderEClass.getESuperTypes().add(this.getITaskReader());
		defaultMetaDataEClass.getESuperTypes().add(this.getIMetaData());
		traversalCriterionEClass.getESuperTypes().add(this.getGroupingCriterion());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Graph(), theEasyflowPackage.getEasyFlowGraph(), "graph", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_FirstNode(), theEasyflowPackage.getObject(), "firstNode", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_KnownGroupingCriteria(), ecorePackage.getEString(), "knownGroupingCriteria", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_KnownDataFormats(), ecorePackage.getEString(), "knownDataFormats", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_KnownTraversalCriteria(), ecorePackage.getEString(), "knownTraversalCriteria", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_WorkflowTemplate(), this.getDefaultWorkflowTemplate(), null, "workflowTemplate", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_LastTasks(), theEasyflowPackage.getStack(), "lastTasks", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Workflow.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_MetaData(), theEasyflowPackage.getObject(), "metaData", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_DefaultGroupingCriteria(), ecorePackage.getEString(), "defaultGroupingCriteria", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getWorkflow_PreviousTaskName(), g1, "previousTaskName", null, 0, 1, Workflow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_GenericAttributes(), this.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_ToolsSchemaDefinition(), theEasyflowPackage.getURI(), "toolsSchemaDefinition", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_ToolsDescription(), theEasyflowPackage.getURI(), "toolsDescription", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Tools(), this.getStringToToolMap(), null, "tools", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_GraphUtil(), theJgraphxPackage.getUtil(), null, "graphUtil", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowEClass, null, "generateGraphFromTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readTaskImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readProjectMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(workflowEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "getParentTasksByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateParentTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateLastTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "applyTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parentToFix", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "shallProcessTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "evaluateJEXLString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_InDataPorts(), this.getDataPort(), null, "inDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutDataPorts(), this.getDataPort(), null, "outDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ShallProcessJEXL(), ecorePackage.getEString(), "shallProcessJEXL", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Util(), ecorePackage.getEBoolean(), "util", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_JexlEngine(), theEasyflowPackage.getJexlEngine(), "jexlEngine", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TraversalEvents(), this.getStringToTraversalEventMap(), null, "traversalEvents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Parents(), this.getTask(), null, "parents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Chunks(), this.getStringToChunksMap(), null, "chunks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CurrentTraversalEventDEPRICATED(), ecorePackage.getEString(), "currentTraversalEventDEPRICATED", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ProcessedTraversalEventsDEPRICATED(), this.getStringToTraversalEventMap(), null, "processedTraversalEventsDEPRICATED", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Tools(), this.getStringToToolMap(), null, "tools", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_PreviousTaskStr(), ecorePackage.getEString(), "previousTaskStr", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(taskEClass, null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "taskString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultMode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "shallProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEasyflowPackage.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "metaDataMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theEasyflowPackage.getObject(), "evaluateJexl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEasyflowPackage.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "metaDataMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, null, "parseDataFormatField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataFormatString", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getDataFormat());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(taskEClass, ecorePackage.getEString(), "getUniqueString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithOutDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithInDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getStringToChunksMap(), "getNonOveralppingTraversalChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Tool.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Version(), ecorePackage.getEString(), "version", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(toolEClass, null, "readImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interpreterEClass, Interpreter.class, "Interpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpreter_Exe(), ecorePackage.getEString(), "exe", null, 0, 1, Interpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterpreter_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Interpreter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(interpreterEClass, null, "readImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_ProgramName(), ecorePackage.getEString(), "programName", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Executable(), ecorePackage.getEBoolean(), "executable", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCommand_Options(), g1, "options", null, 0, 1, Command.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Command.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(commandEClass, null, "readImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPort_GroupingCriteria(), this.getGroupingCriterion(), null, "groupingCriteria", null, 0, -1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_Cardinality(), ecorePackage.getEShort(), "cardinality", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPort_DataFormat(), this.getDataFormat(), null, "dataFormat", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFormatEClass, DataFormat.class, "DataFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFormat_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iWorkflowTemplateEClass, IWorkflowTemplate.class, "IWorkflowTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iWorkflowTemplateEClass, null, "readTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultWorkflowTemplateEClass, DefaultWorkflowTemplate.class, "DefaultWorkflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultWorkflowTemplate_Tasks(), this.getTask(), null, "tasks", null, 0, -1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, DefaultWorkflowTemplate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(easyflowTemplateEClass, EasyflowTemplate.class, "EasyflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTaskReaderEClass, ITaskReader.class, "ITaskReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iTaskReaderEClass, null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyflowTaskReaderEClass, EasyflowTaskReader.class, "EasyflowTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyflowTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, EasyflowTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galaxyTaskReaderEClass, GalaxyTaskReader.class, "GalaxyTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalaxyTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GalaxyTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iMetaDataEClass, IMetaData.class, "IMetaData", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iMetaDataEClass, null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iMetaDataEClass, this.getGroupingCriterion(), "getInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parentField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultMetaDataEClass, DefaultMetaData.class, "DefaultMetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultMetaData_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, DefaultMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultMetaData_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, DefaultMetaData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultMetaData_Groupings(), this.getStringToGroupingMap(), null, "groupings", null, 0, -1, DefaultMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultMetaData_GroupingInstances(), this.getStringToGroupingInstanceListMap(), null, "groupingInstances", null, 0, -1, DefaultMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultMetaData_GroupingInstancesByGroup(), this.getStringToGroupingInstanceListMap(), null, "groupingInstancesByGroup", null, 0, -1, DefaultMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(defaultMetaDataEClass, null, "getDefaultRecords", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEasyflowPackage.getObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(iProjectMetaDataEClass, IProjectMetaData.class, "IProjectMetaData", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProjectMetaDataEClass, null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(groupingCriterionEClass, GroupingCriterion.class, "GroupingCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupingCriterion_Id(), ecorePackage.getEString(), "id", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Description(), ecorePackage.getEString(), "description", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_MultipleInstances(), ecorePackage.getEBoolean(), "multipleInstances", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_SeperateInputPorts(), ecorePackage.getEBoolean(), "seperateInputPorts", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GroupingCriterion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalCriterionEClass, TraversalCriterion.class, "TraversalCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalCriterion_Operation(), this.getTraversalOperation(), null, "operation", null, 0, 1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalCriterion_Chunks(), this.getStringToChunkMap(), null, "chunks", null, 0, -1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalCriterion_ChunkSource(), ecorePackage.getEString(), "chunkSource", null, 0, 1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalEventEClass, TraversalEvent.class, "TraversalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalEvent_MergeTask(), this.getTask(), null, "mergeTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_SplitTask(), this.getTask(), null, "splitTask", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_ParentTask(), this.getTask(), null, "parentTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_ParentCells(), theEasyflowPackage.getmxICell(), "parentCells", null, 0, -1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_TraversalCriterion(), this.getTraversalCriterion(), null, "traversalCriterion", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_MetaData(), theEasyflowPackage.getEObject(), "metaData", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_ProcessedDEPRICATED(), ecorePackage.getEBoolean(), "processedDEPRICATED", "false", 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_QueuedDEPRECATED(), ecorePackage.getEBoolean(), "queuedDEPRECATED", "false", 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_FoundMergeTaskDEPRICATED(), ecorePackage.getEBoolean(), "foundMergeTaskDEPRICATED", "false", 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "applyMetadata", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, null, "readChunks", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "isParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "parentTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "traversalChunkName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(traversalOperationEClass, TraversalOperation.class, "TraversalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraversalOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraversalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalOperation_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalOperation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalOperation_Type(), ecorePackage.getEString(), "type", null, 0, 1, TraversalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalChunkEClass, TraversalChunk.class, "TraversalChunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraversalChunk_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraversalChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalChunk_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalChunk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultRecordEClass, DefaultRecord.class, "DefaultRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultRecord_GenericAttributes(), this.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, DefaultRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTaskMapEClass, Map.Entry.class, "StringToTaskMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTaskMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToTaskMap_Value(), this.getTask(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTraversalEventMapEClass, Map.Entry.class, "StringToTraversalEventMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTraversalEventMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToTraversalEventMap_Value(), this.getTraversalEvent(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToGraphCellMapEClass, Map.Entry.class, "StringToGraphCellMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToGraphCellMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToGraphCellMap_Value(), theEasyflowPackage.getmxICell(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTraversalCriterionMapEClass, Map.Entry.class, "StringToTraversalCriterionMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTraversalCriterionMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToTraversalCriterionMap_Value(), this.getTraversalCriterion(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToObjectMapEClass, Map.Entry.class, "StringToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToObjectMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToObjectMap_Value(), theEasyflowPackage.getObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToChunksMapEClass, Map.Entry.class, "StringToChunksMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToChunksMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToChunksMap_Value(), this.getTraversalChunk(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToChunkMapEClass, Map.Entry.class, "StringToChunkMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToChunkMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToChunkMap_Value(), this.getTraversalChunk(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToToolMapEClass, Map.Entry.class, "StringToToolMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToToolMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToToolMap_Value(), this.getTool(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToGroupingMapEClass, Map.Entry.class, "StringToGroupingMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToGroupingMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToGroupingMap_Value(), this.getGrouping(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToGroupingFeatureMapEClass, Map.Entry.class, "StringToGroupingFeatureMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToGroupingFeatureMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToGroupingFeatureMap_Value(), this.getGroupingFeature(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToGroupingInstanceListMapEClass, Map.Entry.class, "StringToGroupingInstanceListMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToGroupingInstanceListMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToGroupingInstanceListMap_Value(), this.getGroupingInstanceList(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrouping_Name(), ecorePackage.getEString(), "name", null, 0, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrouping_Description(), ecorePackage.getEString(), "description", null, 0, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingInstanceEClass, GroupingInstance.class, "GroupingInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupingInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroupingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupingInstance_Features(), this.getStringToGroupingFeatureMap(), null, "features", null, 0, -1, GroupingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingFeatureEClass, GroupingFeature.class, "GroupingFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupingFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroupingFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, GroupingFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupingInstanceListEClass, GroupingInstanceList.class, "GroupingInstanceList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupingInstanceList_Instances(), this.getGroupingInstance(), null, "instances", null, 0, -1, GroupingInstanceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CorePackageImpl
