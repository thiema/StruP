/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.EasyflowPackage;

import easyflow.core.Catalog;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultRecord;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.EasyflowTaskReader;
import easyflow.core.EasyflowTemplate;
import easyflow.core.GalaxyTaskReader;
import easyflow.core.ITaskReader;
import easyflow.core.IWorkflowTemplate;
import easyflow.core.Task;
import easyflow.core.Workflow;

import easyflow.example.ExamplePackage;

import easyflow.example.impl.ExamplePackageImpl;

import easyflow.execution.ExecutionPackage;

import easyflow.execution.impl.ExecutionPackageImpl;

import easyflow.execution.makeflow.MakeflowPackage;
import easyflow.execution.makeflow.impl.MakeflowPackageImpl;
import easyflow.execution.pegasus.PegasusPackage;

import easyflow.execution.pegasus.impl.PegasusPackageImpl;

import easyflow.execution.shell.ShellPackage;

import easyflow.execution.shell.impl.ShellPackageImpl;

import easyflow.graph.jgraphx.JgraphxPackage;

import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;

import easyflow.impl.EasyflowPackageImpl;

import easyflow.metadata.MetadataPackage;

import easyflow.metadata.impl.MetadataPackageImpl;

import easyflow.tool.ToolPackage;

import easyflow.tool.impl.ToolPackageImpl;

import easyflow.traversal.TraversalPackage;

import easyflow.traversal.impl.TraversalPackageImpl;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

import easyflow.util.maps.MapsPackage;

import easyflow.util.maps.impl.MapsPackageImpl;

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
	private EClass defaultRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

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
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);
		ExamplePackageImpl theExamplePackage = (ExamplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) instanceof ExamplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) : ExamplePackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		PegasusPackageImpl thePegasusPackage = (PegasusPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) instanceof PegasusPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) : PegasusPackage.eINSTANCE);
		ShellPackageImpl theShellPackage = (ShellPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) instanceof ShellPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) : ShellPackage.eINSTANCE);
		MakeflowPackageImpl theMakeflowPackage = (MakeflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) instanceof MakeflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) : MakeflowPackage.eINSTANCE);
		ToolPackageImpl theToolPackage = (ToolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) instanceof ToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) : ToolPackage.eINSTANCE);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) instanceof MetadataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) : MetadataPackage.eINSTANCE);
		TraversalPackageImpl theTraversalPackage = (TraversalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) instanceof TraversalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) : TraversalPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();
		theExamplePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		thePegasusPackage.createPackageContents();
		theShellPackage.createPackageContents();
		theMakeflowPackage.createPackageContents();
		theToolPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theTraversalPackage.createPackageContents();
		theMapsPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();
		theExamplePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		thePegasusPackage.initializePackageContents();
		theShellPackage.initializePackageContents();
		theMakeflowPackage.initializePackageContents();
		theToolPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theTraversalPackage.initializePackageContents();
		theMapsPackage.initializePackageContents();

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
	public EReference getWorkflow_GraphUtil() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Catalog() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ProcessingConfig() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(15);
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
	public EReference getTask_ToolNames() {
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Tools() {
		return (EReference)taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PreviousTaskStr() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Root() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Flags() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_GroupingCriteria() {
		return (EReference)taskEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(17);
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
	public EAttribute getDefaultWorkflowTemplate_Reader() {
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
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Entries() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
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
		createEReference(workflowEClass, WORKFLOW__GRAPH_UTIL);
		createEReference(workflowEClass, WORKFLOW__CATALOG);
		createEReference(workflowEClass, WORKFLOW__PROCESSING_CONFIG);

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
		createEReference(taskEClass, TASK__TOOL_NAMES);
		createEReference(taskEClass, TASK__TOOLS);
		createEAttribute(taskEClass, TASK__PREVIOUS_TASK_STR);
		createEAttribute(taskEClass, TASK__ROOT);
		createEAttribute(taskEClass, TASK__FLAGS);
		createEReference(taskEClass, TASK__GROUPING_CRITERIA);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);

		iWorkflowTemplateEClass = createEClass(IWORKFLOW_TEMPLATE);

		defaultWorkflowTemplateEClass = createEClass(DEFAULT_WORKFLOW_TEMPLATE);
		createEReference(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__TASKS);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__READER);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__LOGGER);

		easyflowTemplateEClass = createEClass(EASYFLOW_TEMPLATE);

		iTaskReaderEClass = createEClass(ITASK_READER);

		easyflowTaskReaderEClass = createEClass(EASYFLOW_TASK_READER);
		createEAttribute(easyflowTaskReaderEClass, EASYFLOW_TASK_READER__LOGGER);

		galaxyTaskReaderEClass = createEClass(GALAXY_TASK_READER);
		createEAttribute(galaxyTaskReaderEClass, GALAXY_TASK_READER__LOGGER);

		defaultRecordEClass = createEClass(DEFAULT_RECORD);
		createEReference(defaultRecordEClass, DEFAULT_RECORD__GENERIC_ATTRIBUTES);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__ENTRIES);
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
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);
		JgraphxPackage theJgraphxPackage = (JgraphxPackage)EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI);
		ToolPackage theToolPackage = (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultWorkflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getDefaultWorkflowTemplate());
		easyflowTaskReaderEClass.getESuperTypes().add(this.getITaskReader());
		galaxyTaskReaderEClass.getESuperTypes().add(this.getITaskReader());

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
		initEReference(getWorkflow_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_GraphUtil(), theJgraphxPackage.getUtil(), null, "graphUtil", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Catalog(), this.getCatalog(), null, "catalog", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ProcessingConfig(), theMapsPackage.getStringToStringMap(), null, "processingConfig", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "generateGraphFromTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToToolMap(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "getParentTasksByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateParentTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateLastTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "applyTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "shallProcessTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "evaluateJEXLString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "readWorkfowTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, this.getTask(), "getParentTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "generateWorklowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_InDataPorts(), theToolPackage.getDataPort(), null, "inDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutDataPorts(), theToolPackage.getDataPort(), null, "outDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ShallProcessJEXL(), ecorePackage.getEString(), "shallProcessJEXL", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Util(), ecorePackage.getEBoolean(), "util", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_JexlEngine(), theEasyflowPackage.getJexlEngine(), "jexlEngine", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TraversalEvents(), theMapsPackage.getStringToTraversalEventMap(), null, "traversalEvents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Parents(), theMapsPackage.getStringToTaskMap(), null, "parents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Chunks(), theMapsPackage.getStringToChunksMap(), null, "chunks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ToolNames(), theMapsPackage.getStringToStringListMap(), null, "toolNames", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Tools(), theMapsPackage.getStringToToolMap(), null, "tools", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_PreviousTaskStr(), ecorePackage.getEString(), "previousTaskStr", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_GroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "groupingCriteria", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), theMapsPackage.getStringToURIMap(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outputs(), theMapsPackage.getStringToURIMap(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEasyflowPackage.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "metaDataMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, null, "parseDataFormatField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataFormatString", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(theToolPackage.getDataFormat());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(taskEClass, ecorePackage.getEString(), "getUniqueString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithOutDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithInDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theMapsPackage.getStringToChunksMap(), "getNonOveralppingTraversalChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, null, "readTools", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, theToolPackage.getTool(), "getPreferredTool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theToolPackage.getDataPort(), "getOverlappingDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPorts1", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getDataPort(), "dataPorts2", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, theMapsPackage.getStringToStringMap(), "createCommandLineMap", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "validateTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iWorkflowTemplateEClass, IWorkflowTemplate.class, "IWorkflowTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iWorkflowTemplateEClass, ecorePackage.getEBoolean(), "readTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultWorkflowTemplateEClass, DefaultWorkflowTemplate.class, "DefaultWorkflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultWorkflowTemplate_Tasks(), this.getTask(), null, "tasks", null, 0, -1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_Reader(), theEasyflowPackage.getBufferedReader(), "reader", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, DefaultWorkflowTemplate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(easyflowTemplateEClass, EasyflowTemplate.class, "EasyflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTaskReaderEClass, ITaskReader.class, "ITaskReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iTaskReaderEClass, null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyflowTaskReaderEClass, EasyflowTaskReader.class, "EasyflowTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEasyflowTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, EasyflowTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galaxyTaskReaderEClass, GalaxyTaskReader.class, "GalaxyTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalaxyTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GalaxyTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultRecordEClass, DefaultRecord.class, "DefaultRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultRecord_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, DefaultRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Entries(), theMapsPackage.getStringToObjectMap(), null, "entries", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CorePackageImpl
