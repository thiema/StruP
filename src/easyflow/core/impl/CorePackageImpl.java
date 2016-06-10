/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core.impl;

import easyflow.EasyflowPackage;
import easyflow.core.Catalog;
import easyflow.core.Condition;
import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultRecord;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.EasyflowTemplate;
import easyflow.core.GalaxyTaskReader;
import easyflow.core.ITaskReader;
import easyflow.core.IWorkflowTemplate;
import easyflow.core.ParentTaskResult;
import easyflow.core.PreprocessingTask;
import easyflow.core.Task;
import easyflow.core.ToolMatch;
import easyflow.core.Workflow;
import easyflow.data.DataPackage;
import easyflow.data.impl.DataPackageImpl;
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
import easyflow.graph.GraphPackage;
import easyflow.graph.impl.GraphPackageImpl;
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
import easyflow.util.UtilPackage;
import easyflow.util.impl.UtilPackageImpl;
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
	private EClass preprocessingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolMatchEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentTaskResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

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
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);
		ExamplePackageImpl theExamplePackage = (ExamplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) instanceof ExamplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) : ExamplePackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		PegasusPackageImpl thePegasusPackage = (PegasusPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) instanceof PegasusPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) : PegasusPackage.eINSTANCE);
		ShellPackageImpl theShellPackage = (ShellPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) instanceof ShellPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) : ShellPackage.eINSTANCE);
		MakeflowPackageImpl theMakeflowPackage = (MakeflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) instanceof MakeflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) : MakeflowPackage.eINSTANCE);
		ToolPackageImpl theToolPackage = (ToolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) instanceof ToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) : ToolPackage.eINSTANCE);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) instanceof MetadataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) : MetadataPackage.eINSTANCE);
		TraversalPackageImpl theTraversalPackage = (TraversalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) instanceof TraversalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) : TraversalPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theGraphPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();
		theExamplePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		thePegasusPackage.createPackageContents();
		theShellPackage.createPackageContents();
		theMakeflowPackage.createPackageContents();
		theToolPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theTraversalPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theMapsPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theGraphPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();
		theExamplePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		thePegasusPackage.initializePackageContents();
		theShellPackage.initializePackageContents();
		theMakeflowPackage.initializePackageContents();
		theToolPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theTraversalPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theMapsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

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
	public EReference getWorkflow_GenericAttributes() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Catalog() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_RootTask() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_StaticTasks() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ProcessedStates() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_PreviousTaskName() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Worker() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ExecutionSystem() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_CurrentRule() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Jgraph() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_LogMessage() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GenerateGraphFromTemplate__EMap() {
		return workflowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetParentTaskByOutDataPort__DataPort_Task() {
		return workflowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetParentTasksByOutDataPort__DataPort() {
		return workflowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ValidateParentTaskOutDataPort__DataPort_Task() {
		return workflowEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ValidateLastTaskOutDataPort__DataPort() {
		return workflowEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ReadMetaData() {
		return workflowEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetParentTasksFor__Task() {
		return workflowEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResolveMissingDataPortsByToolFor__Task() {
		return workflowEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ReadWorkfowTemplate() {
		return workflowEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GenerateAbstractWorkflow() {
		return workflowEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ApplyGroupingCriteria() {
		return workflowEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ApplyParameterCriteria() {
		return workflowEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ApplyTraversalEvent__TraversalEvent() {
		return workflowEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResolveTraversalEvents() {
		return workflowEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResolveIncompatibleGroupings() {
		return workflowEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResolvePreprocessingTasks() {
		return workflowEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResolveToolDependencies() {
		return workflowEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GenerateWorklowForExecutionSystem() {
		return workflowEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__RunNextWorkflowStep() {
		return workflowEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__RunPrevWorkflowStep() {
		return workflowEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__RunEntireWorkflow() {
		return workflowEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__HasNextWorkflowStep() {
		return workflowEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetTotalNumberOfWorkflowSteps() {
		return workflowEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetWorkflowStepLabelFor__String() {
		return workflowEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetWorkflowStepDescFor__String() {
		return workflowEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetNumberOfCurrentWorkflowStep() {
		return workflowEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetNextWorkflowStep() {
		return workflowEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__GetCurWorkflowStep() {
		return workflowEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__Delete() {
		return workflowEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__ResetWorkflowStep() {
		return workflowEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__PrintWorkflowStepMsgOnStart__String() {
		return workflowEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__PrintWorkflowStepMsgOnEnd__boolean_String_String_String() {
		return workflowEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__Init() {
		return workflowEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__RenderToString() {
		return workflowEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWorkflow__InitLogMessage() {
		return workflowEClass.getEOperations().get(34);
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
	public EAttribute getTask_JexlString() {
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
	public EAttribute getTask_Logger() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_TraversalEvents() {
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Parents() {
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Chunks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ToolNames() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Tools() {
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ToolMatches() {
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
	public EReference getTask_InputsByDataPort() {
		return (EReference)taskEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OutputsByDataPort() {
		return (EReference)taskEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_InputDataPortValidator() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_OutputDataPortValidator() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_AnalysisTypes() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CircumventingParents() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Records() {
		return (EReference)taskEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PreprocessingTasks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ResolvedCommand() {
		return (EReference)taskEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_UnresolvedOutDataPorts() {
		return (EReference)taskEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Params() {
		return (EReference)taskEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_StaticParams() {
		return (EReference)taskEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Rule() {
		return (EReference)taskEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_LogMessage() {
		return (EReference)taskEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_SimpleName() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ReadTask__String_String_EList() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ShallProcess__EList_String() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ShallProcess__EList_String_EList_boolean() {
		return taskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ParseDataFormatField__String_EList() {
		return taskEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetUniqueString() {
		return taskEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetUniqueURIString() {
		return taskEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsCompatibleWithOutDataPortFor__DataPort() {
		return taskEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsCompatibleWithInDataPortFor__DataPort() {
		return taskEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetParentTaskByOutDataPort__DataPort() {
		return taskEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetNonOveralppingTraversalChunksFor__Task() {
		return taskEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ReadTools__EList() {
		return taskEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetPreferredTool() {
		return taskEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetOverlappingDataPorts__EList_EList() {
		return taskEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveCommandLinePartInterpreter() {
		return taskEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveCommandLinePartExe() {
		return taskEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveCommandLinePartAnalysisType() {
		return taskEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveCommandLinePart__String_boolean_boolean() {
		return taskEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetCommandLinePattern() {
		return taskEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ValidateTool__Tool() {
		return taskEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ValidateTools() {
		return taskEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetDataPortByDataPort__DataPort_boolean() {
		return taskEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetDataPortByNameOfFormat__String_boolean() {
		return taskEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetDataPortByName__String_boolean() {
		return taskEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveMissingDataPortsByTool__EList() {
		return taskEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetOverlappingChunksFor__Task_String() {
		return taskEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetRequiredGroupingsFor__Tool_DataPort_boolean() {
		return taskEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetProvidedGroupingsFor__Tool_DataPort_boolean() {
		return taskEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProvideMultipleGroupingsFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProvideMultipleInputsFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProvideMultipleInstancesFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProvideMultipleInstancesPerDataportFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProcessMultipleInputsFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProcessMultipleInstancesFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProcessMultipleInstancesPerDataportFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProcessMultipleInstancesPerDataportFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProcessMultipleInstancesFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProcessMultipleInputsFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProvideMultipleInstancesPerDataportFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProvideMultipleInstancesFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetProvideMultipleInputsFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanFilterInstancesFor__Tool_DataPort() {
		return taskEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetRecords__boolean() {
		return taskEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetInputs__boolean() {
		return taskEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetOverlappingRecordsProvidedBy__Task() {
		return taskEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanProvideDataPort__Tool_DataPort_String_EList_boolean() {
		return taskEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CanConsumeDataPort__Tool_DataPort_String_EList_boolean() {
		return taskEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetOutputsForDataPort__DataPort() {
		return taskEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetInputsForDataPort__DataPort() {
		return taskEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveParams() {
		return taskEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsIdentityTransformation() {
		return taskEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__IsIdentityTransformation__DataPort() {
		return taskEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveConditionalStaticParam__ResolvedParam() {
		return taskEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ReadFromPipe() {
		return taskEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__WriteToPipe() {
		return taskEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CreateRule() {
		return taskEClass.getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__RetrieveDataPort__boolean_int() {
		return taskEClass.getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveDataPortParams__EMap_Tool_boolean() {
		return taskEClass.getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ResolveStaticParams__EMap() {
		return taskEClass.getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetDetailedString() {
		return taskEClass.getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetValidInOutDataPortCombinations() {
		return taskEClass.getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ReadTraversalCriteria__String() {
		return taskEClass.getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__ReadGroupingCriteria__String_EList_String() {
		return taskEClass.getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__CreateGroupingCriteria__String_DataPort_String() {
		return taskEClass.getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__InitLogMessage() {
		return taskEClass.getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessingTask() {
		return preprocessingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingTask_Name() {
		return (EAttribute)preprocessingTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocessingTask_Task() {
		return (EReference)preprocessingTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingTask_Expression() {
		return (EAttribute)preprocessingTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingTask_DataPortIndex() {
		return (EAttribute)preprocessingTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolMatch() {
		return toolMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolMatch_Logger() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_Task() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_Tool() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolMatch_Score() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolMatch_ExpectedScore() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolMatch_ExpectedToolScore() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_MissingInDataPorts() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_MissingOutDataPorts() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_MissingGroupingCriteria() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_ReverseMissingInDataPorts() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_ReverseMissingOutDataPorts() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolMatch_ReverseMissingGroupingCriteria() {
		return (EReference)toolMatchEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolMatch_Valid() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__ComputeScore__EMap() {
		return toolMatchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__ComputeExpectedScore() {
		return toolMatchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__ValidateDataPorts__EList_EList() {
		return toolMatchEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__ResolveReverseMissingInDataPorts__EList() {
		return toolMatchEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__ResolveReverseMissingOutDataPorts__EList() {
		return toolMatchEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolMatch__GetDataPortProvidingTasks__EList_EList() {
		return toolMatchEClass.getEOperations().get(5);
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
	public EOperation getIWorkflowTemplate__ReadTemplate__String_EList() {
		return iWorkflowTemplateEClass.getEOperations().get(0);
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
	public EAttribute getDefaultWorkflowTemplate_UtilTaskReader() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultWorkflowTemplate_Logger() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultWorkflowTemplate_LogMessage() {
		return (EReference)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultWorkflowTemplate_FileName() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultWorkflowTemplate_UtilTaskFileName() {
		return (EAttribute)defaultWorkflowTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefaultWorkflowTemplate__InitLogMessage() {
		return defaultWorkflowTemplateEClass.getEOperations().get(0);
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
	public EOperation getITaskReader__ReadTask() {
		return iTaskReaderEClass.getEOperations().get(0);
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
	public EClass getParentTaskResult() {
		return parentTaskResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentTaskResult_ParentTask() {
		return (EReference)parentTaskResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentTaskResult_CoveredPorts() {
		return (EReference)parentTaskResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentTaskResult_Condition() {
		return (EAttribute)parentTaskResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentTaskResult_Generic() {
		return (EAttribute)parentTaskResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentTaskResult_Rank() {
		return (EAttribute)parentTaskResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentTaskResult_PotentialCircumventingTasks() {
		return (EAttribute)parentTaskResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentTaskResult_Logger() {
		return (EAttribute)parentTaskResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Forbidden() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_CircumventingParents() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Logger() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__IsUnconditional() {
		return conditionEClass.getEOperations().get(0);
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
		createEReference(workflowEClass, WORKFLOW__GENERIC_ATTRIBUTES);
		createEReference(workflowEClass, WORKFLOW__CATALOG);
		createEReference(workflowEClass, WORKFLOW__ROOT_TASK);
		createEReference(workflowEClass, WORKFLOW__STATIC_TASKS);
		createEReference(workflowEClass, WORKFLOW__PROCESSED_STATES);
		createEReference(workflowEClass, WORKFLOW__PREVIOUS_TASK_NAME);
		createEAttribute(workflowEClass, WORKFLOW__WORKER);
		createEReference(workflowEClass, WORKFLOW__EXECUTION_SYSTEM);
		createEReference(workflowEClass, WORKFLOW__CURRENT_RULE);
		createEReference(workflowEClass, WORKFLOW__JGRAPH);
		createEReference(workflowEClass, WORKFLOW__LOG_MESSAGE);
		createEOperation(workflowEClass, WORKFLOW___GENERATE_GRAPH_FROM_TEMPLATE__EMAP);
		createEOperation(workflowEClass, WORKFLOW___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT_TASK);
		createEOperation(workflowEClass, WORKFLOW___GET_PARENT_TASKS_BY_OUT_DATA_PORT__DATAPORT);
		createEOperation(workflowEClass, WORKFLOW___VALIDATE_PARENT_TASK_OUT_DATA_PORT__DATAPORT_TASK);
		createEOperation(workflowEClass, WORKFLOW___VALIDATE_LAST_TASK_OUT_DATA_PORT__DATAPORT);
		createEOperation(workflowEClass, WORKFLOW___READ_META_DATA);
		createEOperation(workflowEClass, WORKFLOW___GET_PARENT_TASKS_FOR__TASK);
		createEOperation(workflowEClass, WORKFLOW___RESOLVE_MISSING_DATA_PORTS_BY_TOOL_FOR__TASK);
		createEOperation(workflowEClass, WORKFLOW___READ_WORKFOW_TEMPLATE);
		createEOperation(workflowEClass, WORKFLOW___GENERATE_ABSTRACT_WORKFLOW);
		createEOperation(workflowEClass, WORKFLOW___APPLY_GROUPING_CRITERIA);
		createEOperation(workflowEClass, WORKFLOW___APPLY_PARAMETER_CRITERIA);
		createEOperation(workflowEClass, WORKFLOW___APPLY_TRAVERSAL_EVENT__TRAVERSALEVENT);
		createEOperation(workflowEClass, WORKFLOW___RESOLVE_TRAVERSAL_EVENTS);
		createEOperation(workflowEClass, WORKFLOW___RESOLVE_INCOMPATIBLE_GROUPINGS);
		createEOperation(workflowEClass, WORKFLOW___RESOLVE_PREPROCESSING_TASKS);
		createEOperation(workflowEClass, WORKFLOW___RESOLVE_TOOL_DEPENDENCIES);
		createEOperation(workflowEClass, WORKFLOW___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM);
		createEOperation(workflowEClass, WORKFLOW___RUN_NEXT_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___RUN_PREV_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___RUN_ENTIRE_WORKFLOW);
		createEOperation(workflowEClass, WORKFLOW___HAS_NEXT_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS);
		createEOperation(workflowEClass, WORKFLOW___GET_WORKFLOW_STEP_LABEL_FOR__STRING);
		createEOperation(workflowEClass, WORKFLOW___GET_WORKFLOW_STEP_DESC_FOR__STRING);
		createEOperation(workflowEClass, WORKFLOW___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___GET_NEXT_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___GET_CUR_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___DELETE);
		createEOperation(workflowEClass, WORKFLOW___RESET_WORKFLOW_STEP);
		createEOperation(workflowEClass, WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_START__STRING);
		createEOperation(workflowEClass, WORKFLOW___PRINT_WORKFLOW_STEP_MSG_ON_END__BOOLEAN_STRING_STRING_STRING);
		createEOperation(workflowEClass, WORKFLOW___INIT);
		createEOperation(workflowEClass, WORKFLOW___RENDER_TO_STRING);
		createEOperation(workflowEClass, WORKFLOW___INIT_LOG_MESSAGE);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__IN_DATA_PORTS);
		createEReference(taskEClass, TASK__OUT_DATA_PORTS);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__JEXL_STRING);
		createEAttribute(taskEClass, TASK__UTIL);
		createEAttribute(taskEClass, TASK__LOGGER);
		createEReference(taskEClass, TASK__TRAVERSAL_EVENTS);
		createEReference(taskEClass, TASK__PARENTS);
		createEReference(taskEClass, TASK__CHUNKS);
		createEReference(taskEClass, TASK__TOOL_NAMES);
		createEReference(taskEClass, TASK__TOOLS);
		createEReference(taskEClass, TASK__TOOL_MATCHES);
		createEAttribute(taskEClass, TASK__PREVIOUS_TASK_STR);
		createEAttribute(taskEClass, TASK__ROOT);
		createEAttribute(taskEClass, TASK__FLAGS);
		createEReference(taskEClass, TASK__GROUPING_CRITERIA);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);
		createEReference(taskEClass, TASK__INPUTS_BY_DATA_PORT);
		createEReference(taskEClass, TASK__OUTPUTS_BY_DATA_PORT);
		createEAttribute(taskEClass, TASK__INPUT_DATA_PORT_VALIDATOR);
		createEAttribute(taskEClass, TASK__OUTPUT_DATA_PORT_VALIDATOR);
		createEAttribute(taskEClass, TASK__ANALYSIS_TYPES);
		createEAttribute(taskEClass, TASK__CIRCUMVENTING_PARENTS);
		createEReference(taskEClass, TASK__RECORDS);
		createEReference(taskEClass, TASK__PREPROCESSING_TASKS);
		createEReference(taskEClass, TASK__RESOLVED_COMMAND);
		createEReference(taskEClass, TASK__UNRESOLVED_OUT_DATA_PORTS);
		createEReference(taskEClass, TASK__PARAMS);
		createEReference(taskEClass, TASK__STATIC_PARAMS);
		createEReference(taskEClass, TASK__RULE);
		createEReference(taskEClass, TASK__LOG_MESSAGE);
		createEAttribute(taskEClass, TASK__SIMPLE_NAME);
		createEOperation(taskEClass, TASK___READ_TASK__STRING_STRING_ELIST);
		createEOperation(taskEClass, TASK___SHALL_PROCESS__ELIST_STRING);
		createEOperation(taskEClass, TASK___SHALL_PROCESS__ELIST_STRING_ELIST_BOOLEAN);
		createEOperation(taskEClass, TASK___PARSE_DATA_FORMAT_FIELD__STRING_ELIST);
		createEOperation(taskEClass, TASK___GET_UNIQUE_STRING);
		createEOperation(taskEClass, TASK___GET_UNIQUE_URI_STRING);
		createEOperation(taskEClass, TASK___IS_COMPATIBLE_WITH_OUT_DATA_PORT_FOR__DATAPORT);
		createEOperation(taskEClass, TASK___IS_COMPATIBLE_WITH_IN_DATA_PORT_FOR__DATAPORT);
		createEOperation(taskEClass, TASK___GET_PARENT_TASK_BY_OUT_DATA_PORT__DATAPORT);
		createEOperation(taskEClass, TASK___GET_NON_OVERALPPING_TRAVERSAL_CHUNKS_FOR__TASK);
		createEOperation(taskEClass, TASK___READ_TOOLS__ELIST);
		createEOperation(taskEClass, TASK___GET_PREFERRED_TOOL);
		createEOperation(taskEClass, TASK___GET_OVERLAPPING_DATA_PORTS__ELIST_ELIST);
		createEOperation(taskEClass, TASK___RESOLVE_COMMAND_LINE_PART_INTERPRETER);
		createEOperation(taskEClass, TASK___RESOLVE_COMMAND_LINE_PART_EXE);
		createEOperation(taskEClass, TASK___RESOLVE_COMMAND_LINE_PART_ANALYSIS_TYPE);
		createEOperation(taskEClass, TASK___RESOLVE_COMMAND_LINE_PART__STRING_BOOLEAN_BOOLEAN);
		createEOperation(taskEClass, TASK___GET_COMMAND_LINE_PATTERN);
		createEOperation(taskEClass, TASK___VALIDATE_TOOL__TOOL);
		createEOperation(taskEClass, TASK___VALIDATE_TOOLS);
		createEOperation(taskEClass, TASK___GET_DATA_PORT_BY_DATA_PORT__DATAPORT_BOOLEAN);
		createEOperation(taskEClass, TASK___GET_DATA_PORT_BY_NAME_OF_FORMAT__STRING_BOOLEAN);
		createEOperation(taskEClass, TASK___GET_DATA_PORT_BY_NAME__STRING_BOOLEAN);
		createEOperation(taskEClass, TASK___RESOLVE_MISSING_DATA_PORTS_BY_TOOL__ELIST);
		createEOperation(taskEClass, TASK___GET_OVERLAPPING_CHUNKS_FOR__TASK_STRING);
		createEOperation(taskEClass, TASK___GET_REQUIRED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN);
		createEOperation(taskEClass, TASK___GET_PROVIDED_GROUPINGS_FOR__TOOL_DATAPORT_BOOLEAN);
		createEOperation(taskEClass, TASK___CAN_PROVIDE_MULTIPLE_GROUPINGS_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_PROCESS_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROCESS_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROCESS_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROCESS_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROVIDE_MULTIPLE_INSTANCES_PER_DATAPORT_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROVIDE_MULTIPLE_INSTANCES_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___SET_PROVIDE_MULTIPLE_INPUTS_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___CAN_FILTER_INSTANCES_FOR__TOOL_DATAPORT);
		createEOperation(taskEClass, TASK___GET_RECORDS__BOOLEAN);
		createEOperation(taskEClass, TASK___GET_INPUTS__BOOLEAN);
		createEOperation(taskEClass, TASK___GET_OVERLAPPING_RECORDS_PROVIDED_BY__TASK);
		createEOperation(taskEClass, TASK___CAN_PROVIDE_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN);
		createEOperation(taskEClass, TASK___CAN_CONSUME_DATA_PORT__TOOL_DATAPORT_STRING_ELIST_BOOLEAN);
		createEOperation(taskEClass, TASK___GET_OUTPUTS_FOR_DATA_PORT__DATAPORT);
		createEOperation(taskEClass, TASK___GET_INPUTS_FOR_DATA_PORT__DATAPORT);
		createEOperation(taskEClass, TASK___RESOLVE_PARAMS);
		createEOperation(taskEClass, TASK___IS_IDENTITY_TRANSFORMATION);
		createEOperation(taskEClass, TASK___IS_IDENTITY_TRANSFORMATION__DATAPORT);
		createEOperation(taskEClass, TASK___RESOLVE_CONDITIONAL_STATIC_PARAM__RESOLVEDPARAM);
		createEOperation(taskEClass, TASK___READ_FROM_PIPE);
		createEOperation(taskEClass, TASK___WRITE_TO_PIPE);
		createEOperation(taskEClass, TASK___CREATE_RULE);
		createEOperation(taskEClass, TASK___RETRIEVE_DATA_PORT__BOOLEAN_INT);
		createEOperation(taskEClass, TASK___RESOLVE_DATA_PORT_PARAMS__EMAP_TOOL_BOOLEAN);
		createEOperation(taskEClass, TASK___RESOLVE_STATIC_PARAMS__EMAP);
		createEOperation(taskEClass, TASK___GET_DETAILED_STRING);
		createEOperation(taskEClass, TASK___GET_VALID_IN_OUT_DATA_PORT_COMBINATIONS);
		createEOperation(taskEClass, TASK___READ_TRAVERSAL_CRITERIA__STRING);
		createEOperation(taskEClass, TASK___READ_GROUPING_CRITERIA__STRING_ELIST_STRING);
		createEOperation(taskEClass, TASK___CREATE_GROUPING_CRITERIA__STRING_DATAPORT_STRING);
		createEOperation(taskEClass, TASK___INIT_LOG_MESSAGE);

		preprocessingTaskEClass = createEClass(PREPROCESSING_TASK);
		createEAttribute(preprocessingTaskEClass, PREPROCESSING_TASK__NAME);
		createEReference(preprocessingTaskEClass, PREPROCESSING_TASK__TASK);
		createEAttribute(preprocessingTaskEClass, PREPROCESSING_TASK__EXPRESSION);
		createEAttribute(preprocessingTaskEClass, PREPROCESSING_TASK__DATA_PORT_INDEX);

		toolMatchEClass = createEClass(TOOL_MATCH);
		createEAttribute(toolMatchEClass, TOOL_MATCH__LOGGER);
		createEReference(toolMatchEClass, TOOL_MATCH__TASK);
		createEReference(toolMatchEClass, TOOL_MATCH__TOOL);
		createEAttribute(toolMatchEClass, TOOL_MATCH__SCORE);
		createEAttribute(toolMatchEClass, TOOL_MATCH__EXPECTED_SCORE);
		createEAttribute(toolMatchEClass, TOOL_MATCH__EXPECTED_TOOL_SCORE);
		createEReference(toolMatchEClass, TOOL_MATCH__MISSING_IN_DATA_PORTS);
		createEReference(toolMatchEClass, TOOL_MATCH__MISSING_OUT_DATA_PORTS);
		createEReference(toolMatchEClass, TOOL_MATCH__MISSING_GROUPING_CRITERIA);
		createEReference(toolMatchEClass, TOOL_MATCH__REVERSE_MISSING_IN_DATA_PORTS);
		createEReference(toolMatchEClass, TOOL_MATCH__REVERSE_MISSING_OUT_DATA_PORTS);
		createEReference(toolMatchEClass, TOOL_MATCH__REVERSE_MISSING_GROUPING_CRITERIA);
		createEAttribute(toolMatchEClass, TOOL_MATCH__VALID);
		createEOperation(toolMatchEClass, TOOL_MATCH___COMPUTE_SCORE__EMAP);
		createEOperation(toolMatchEClass, TOOL_MATCH___COMPUTE_EXPECTED_SCORE);
		createEOperation(toolMatchEClass, TOOL_MATCH___VALIDATE_DATA_PORTS__ELIST_ELIST);
		createEOperation(toolMatchEClass, TOOL_MATCH___RESOLVE_REVERSE_MISSING_IN_DATA_PORTS__ELIST);
		createEOperation(toolMatchEClass, TOOL_MATCH___RESOLVE_REVERSE_MISSING_OUT_DATA_PORTS__ELIST);
		createEOperation(toolMatchEClass, TOOL_MATCH___GET_DATA_PORT_PROVIDING_TASKS__ELIST_ELIST);

		iWorkflowTemplateEClass = createEClass(IWORKFLOW_TEMPLATE);
		createEOperation(iWorkflowTemplateEClass, IWORKFLOW_TEMPLATE___READ_TEMPLATE__STRING_ELIST);

		defaultWorkflowTemplateEClass = createEClass(DEFAULT_WORKFLOW_TEMPLATE);
		createEReference(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__TASKS);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__READER);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_READER);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__LOGGER);
		createEReference(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__LOG_MESSAGE);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__FILE_NAME);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__UTIL_TASK_FILE_NAME);
		createEOperation(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE___INIT_LOG_MESSAGE);

		easyflowTemplateEClass = createEClass(EASYFLOW_TEMPLATE);

		iTaskReaderEClass = createEClass(ITASK_READER);
		createEOperation(iTaskReaderEClass, ITASK_READER___READ_TASK);

		galaxyTaskReaderEClass = createEClass(GALAXY_TASK_READER);
		createEAttribute(galaxyTaskReaderEClass, GALAXY_TASK_READER__LOGGER);

		defaultRecordEClass = createEClass(DEFAULT_RECORD);
		createEReference(defaultRecordEClass, DEFAULT_RECORD__GENERIC_ATTRIBUTES);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__ENTRIES);

		parentTaskResultEClass = createEClass(PARENT_TASK_RESULT);
		createEReference(parentTaskResultEClass, PARENT_TASK_RESULT__PARENT_TASK);
		createEReference(parentTaskResultEClass, PARENT_TASK_RESULT__COVERED_PORTS);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__CONDITION);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__GENERIC);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__RANK);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__POTENTIAL_CIRCUMVENTING_TASKS);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__LOGGER);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__FORBIDDEN);
		createEAttribute(conditionEClass, CONDITION__CIRCUMVENTING_PARENTS);
		createEAttribute(conditionEClass, CONDITION__LOGGER);
		createEOperation(conditionEClass, CONDITION___IS_UNCONDITIONAL);
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
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ToolPackage theToolPackage = (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);
		JgraphxPackage theJgraphxPackage = (JgraphxPackage)EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultWorkflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getDefaultWorkflowTemplate());
		galaxyTaskReaderEClass.getESuperTypes().add(this.getITaskReader());

		// Initialize classes, features, and operations; add parameters
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
		initEReference(getWorkflow_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Catalog(), this.getCatalog(), null, "catalog", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_RootTask(), this.getTask(), null, "rootTask", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_StaticTasks(), this.getTask(), null, "staticTasks", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ProcessedStates(), theMapsPackage.getStringToBooleanMap(), null, "processedStates", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_PreviousTaskName(), theMapsPackage.getStringToStringMap(), null, "previousTaskName", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Worker(), theEasyflowPackage.getEasyFlowOverallWorker(), "worker", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ExecutionSystem(), theExecutionPackage.getIExecutionSystem(), null, "executionSystem", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_CurrentRule(), theToolPackage.getRule(), null, "currentRule", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Jgraph(), theJgraphxPackage.getGraph(), null, "jgraph", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_LogMessage(), theUtilPackage.getLogMessage(), null, "logMessage", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getWorkflow__GenerateGraphFromTemplate__EMap(), ecorePackage.getEInt(), "generateGraphFromTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToToolMap(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__GetParentTaskByOutDataPort__DataPort_Task(), this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__GetParentTasksByOutDataPort__DataPort(), null, "getParentTasksByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getWorkflow__ValidateParentTaskOutDataPort__DataPort_Task(), ecorePackage.getEBoolean(), "validateParentTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__ValidateLastTaskOutDataPort__DataPort(), ecorePackage.getEBoolean(), "validateLastTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ReadMetaData(), null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__GetParentTasksFor__Task(), theMapsPackage.getTaskToDataLinkListMap(), "getParentTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__ResolveMissingDataPortsByToolFor__Task(), ecorePackage.getEBoolean(), "resolveMissingDataPortsByToolFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ReadWorkfowTemplate(), ecorePackage.getEBoolean(), "readWorkfowTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GenerateAbstractWorkflow(), ecorePackage.getEBoolean(), "generateAbstractWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ApplyGroupingCriteria(), ecorePackage.getEBoolean(), "applyGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ApplyParameterCriteria(), ecorePackage.getEBoolean(), "applyParameterCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__ApplyTraversalEvent__TraversalEvent(), ecorePackage.getEBoolean(), "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ResolveTraversalEvents(), ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ResolveIncompatibleGroupings(), ecorePackage.getEBoolean(), "resolveIncompatibleGroupings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ResolvePreprocessingTasks(), ecorePackage.getEBoolean(), "resolvePreprocessingTasks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ResolveToolDependencies(), ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GenerateWorklowForExecutionSystem(), ecorePackage.getEBoolean(), "generateWorklowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__RunNextWorkflowStep(), ecorePackage.getEInt(), "runNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__RunPrevWorkflowStep(), ecorePackage.getEInt(), "runPrevWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__RunEntireWorkflow(), ecorePackage.getEInt(), "runEntireWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__HasNextWorkflowStep(), ecorePackage.getEBoolean(), "hasNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GetTotalNumberOfWorkflowSteps(), ecorePackage.getEInt(), "getTotalNumberOfWorkflowSteps", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__GetWorkflowStepLabelFor__String(), ecorePackage.getEString(), "getWorkflowStepLabelFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__GetWorkflowStepDescFor__String(), ecorePackage.getEString(), "getWorkflowStepDescFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GetNumberOfCurrentWorkflowStep(), ecorePackage.getEInt(), "getNumberOfCurrentWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GetNextWorkflowStep(), ecorePackage.getEString(), "getNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__GetCurWorkflowStep(), ecorePackage.getEString(), "getCurWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__Delete(), ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__ResetWorkflowStep(), ecorePackage.getEBoolean(), "resetWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__PrintWorkflowStepMsgOnStart__String(), null, "printWorkflowStepMsgOnStart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWorkflow__PrintWorkflowStepMsgOnEnd__boolean_String_String_String(), null, "printWorkflowStepMsgOnEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "rc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "helpMsg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__RenderToString(), ecorePackage.getEString(), "renderToString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWorkflow__InitLogMessage(), null, "initLogMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_InDataPorts(), theDataPackage.getDataPort(), null, "inDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutDataPorts(), theDataPackage.getDataPort(), null, "outDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_JexlString(), ecorePackage.getEString(), "jexlString", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Util(), ecorePackage.getEBoolean(), "util", "false", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TraversalEvents(), theMapsPackage.getStringToTraversalEventMap(), null, "traversalEvents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Parents(), theMapsPackage.getStringToTaskMap(), null, "parents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Chunks(), theMapsPackage.getStringToChunksMap(), null, "chunks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ToolNames(), theMapsPackage.getStringToStringListMap(), null, "toolNames", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Tools(), theMapsPackage.getStringToToolMap(), null, "tools", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ToolMatches(), theMapsPackage.getStringToToolMatchMap(), null, "toolMatches", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_PreviousTaskStr(), ecorePackage.getEString(), "previousTaskStr", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_GroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "groupingCriteria", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), theMapsPackage.getStringToDataLinkMap(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outputs(), theMapsPackage.getStringToDataLinkMap(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_InputsByDataPort(), theMapsPackage.getStringToStringListMap(), null, "inputsByDataPort", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutputsByDataPort(), theMapsPackage.getStringToStringListMap(), null, "outputsByDataPort", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_InputDataPortValidator(), theEasyflowPackage.getPattern(), "inputDataPortValidator", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_OutputDataPortValidator(), theEasyflowPackage.getPattern(), "outputDataPortValidator", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_AnalysisTypes(), ecorePackage.getEString(), "analysisTypes", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CircumventingParents(), ecorePackage.getEString(), "circumventingParents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Records(), theTraversalPackage.getTraversalChunk(), null, "records", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_PreprocessingTasks(), this.getPreprocessingTask(), null, "preprocessingTasks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ResolvedCommand(), theToolPackage.getCommand(), null, "resolvedCommand", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_UnresolvedOutDataPorts(), theDataPackage.getDataPort(), null, "unresolvedOutDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Params(), theMapsPackage.getStringToStringMap(), null, "params", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_StaticParams(), theMapsPackage.getStringToStringMap(), null, "staticParams", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Rule(), theToolPackage.getRule(), null, "rule", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_LogMessage(), theUtilPackage.getLogMessage(), null, "logMessage", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTask__ReadTask__String_String_EList(), ecorePackage.getEBoolean(), "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "taskString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultMode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ShallProcess__EList_String(), ecorePackage.getEBoolean(), "shallProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "forGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ShallProcess__EList_String_EList_boolean(), ecorePackage.getEBoolean(), "shallProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "forGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jexlStrings", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isInverse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ParseDataFormatField__String_EList(), null, "parseDataFormatField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataFormatString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getPattern(), "pattern", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(theDataPackage.getDataFormat());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getTask__GetUniqueString(), ecorePackage.getEString(), "getUniqueString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetUniqueURIString(), ecorePackage.getEString(), "getUniqueURIString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__IsCompatibleWithOutDataPortFor__DataPort(), ecorePackage.getEBoolean(), "isCompatibleWithOutDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__IsCompatibleWithInDataPortFor__DataPort(), ecorePackage.getEBoolean(), "isCompatibleWithInDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetParentTaskByOutDataPort__DataPort(), this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetNonOveralppingTraversalChunksFor__Task(), theMapsPackage.getStringToChunksMap(), "getNonOveralppingTraversalChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ReadTools__EList(), null, "readTools", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetPreferredTool(), theToolPackage.getTool(), "getPreferredTool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetOverlappingDataPorts__EList_EList(), theDataPackage.getDataPort(), "getOverlappingDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPorts1", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPorts2", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ResolveCommandLinePartInterpreter(), ecorePackage.getEString(), "resolveCommandLinePartInterpreter", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getTask__ResolveCommandLinePartExe(), ecorePackage.getEString(), "resolveCommandLinePartExe", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getTask__ResolveCommandLinePartAnalysisType(), ecorePackage.getEString(), "resolveCommandLinePartAnalysisType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getTask__ResolveCommandLinePart__String_boolean_boolean(), ecorePackage.getEString(), "resolveCommandLinePart", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cmdLinePart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "omitInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "omitOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEOperation(getTask__GetCommandLinePattern(), ecorePackage.getEString(), "getCommandLinePattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ValidateTool__Tool(), ecorePackage.getEBoolean(), "validateTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__ValidateTools(), ecorePackage.getEBoolean(), "validateTools", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetDataPortByDataPort__DataPort_boolean(), theDataPackage.getDataPort(), "getDataPortByDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "testDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetDataPortByNameOfFormat__String_boolean(), theDataPackage.getDataPort(), "getDataPortByNameOfFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetDataPortByName__String_boolean(), theDataPackage.getDataPort(), "getDataPortByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataPortName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ResolveMissingDataPortsByTool__EList(), theMapsPackage.getTaskToDataPortsMap(), "resolveMissingDataPortsByTool", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetOverlappingChunksFor__Task_String(), theTraversalPackage.getTraversalChunk(), "getOverlappingChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "parentTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetRequiredGroupingsFor__Tool_DataPort_boolean(), ecorePackage.getEString(), "getRequiredGroupingsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__GetProvidedGroupingsFor__Tool_DataPort_boolean(), ecorePackage.getEString(), "getProvidedGroupingsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProvideMultipleGroupingsFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleGroupingsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProvideMultipleInputsFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProvideMultipleInstancesFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProvideMultipleInstancesPerDataportFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInstancesPerDataportFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProcessMultipleInputsFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProcessMultipleInstancesFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanProcessMultipleInstancesPerDataportFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInstancesPerDataportFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProcessMultipleInstancesPerDataportFor__Tool_DataPort(), null, "setProcessMultipleInstancesPerDataportFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProcessMultipleInstancesFor__Tool_DataPort(), null, "setProcessMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProcessMultipleInputsFor__Tool_DataPort(), null, "setProcessMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProvideMultipleInstancesPerDataportFor__Tool_DataPort(), null, "setProvideMultipleInstancesPerDataportFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProvideMultipleInstancesFor__Tool_DataPort(), null, "setProvideMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__SetProvideMultipleInputsFor__Tool_DataPort(), null, "setProvideMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTask__CanFilterInstancesFor__Tool_DataPort(), ecorePackage.getEBoolean(), "canFilterInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__GetRecords__boolean(), theTraversalPackage.getTraversalChunk(), "getRecords", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "intersect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetInputs__boolean(), theTraversalPackage.getTraversalChunk(), "getInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "intersect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetOverlappingRecordsProvidedBy__Task(), theTraversalPackage.getTraversalChunk(), "getOverlappingRecordsProvidedBy", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "testTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__CanProvideDataPort__Tool_DataPort_String_EList_boolean(), ecorePackage.getEBoolean(), "canProvideDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "grouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "traverslChunks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isPartial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__CanConsumeDataPort__Tool_DataPort_String_EList_boolean(), ecorePackage.getEBoolean(), "canConsumeDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "grouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "traverslChunks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isPartial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = initEOperation(getTask__GetOutputsForDataPort__DataPort(), theEasyflowPackage.getURI(), "getOutputsForDataPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__GetInputsForDataPort__DataPort(), theEasyflowPackage.getURI(), "getInputsForDataPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ResolveParams(), null, "resolveParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEOperation(getTask__IsIdentityTransformation(), ecorePackage.getEBoolean(), "isIdentityTransformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__IsIdentityTransformation__DataPort(), ecorePackage.getEBoolean(), "isIdentityTransformation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ResolveConditionalStaticParam__ResolvedParam(), null, "resolveConditionalStaticParam", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getResolvedParam(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__ReadFromPipe(), ecorePackage.getEBoolean(), "readFromPipe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__WriteToPipe(), ecorePackage.getEBoolean(), "writeToPipe", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__CreateRule(), theToolPackage.getRule(), "createRule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());
		addEException(op, theEasyflowPackage.getResolvingParameterFailedException());
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());

		op = initEOperation(getTask__RetrieveDataPort__boolean_int(), theDataPackage.getDataPort(), "retrieveDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "strategy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ResolveDataPortParams__EMap_Tool_boolean(), null, "resolveDataPortParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToDataLinkMap(), "dataLinks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());
		addEException(op, theEasyflowPackage.getResolvingParameterFailedException());

		op = initEOperation(getTask__ResolveStaticParams__EMap(), null, "resolveStaticParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToResolvedParamMap(), "resolveStaticParams", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetDetailedString(), ecorePackage.getEString(), "getDetailedString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__GetValidInOutDataPortCombinations(), theMapsPackage.getStringToStringMap(), "getValidInOutDataPortCombinations", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ReadTraversalCriteria__String(), ecorePackage.getEBoolean(), "readTraversalCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__ReadGroupingCriteria__String_EList_String(), ecorePackage.getEBoolean(), "readGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultCroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultMode", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTask__CreateGroupingCriteria__String_DataPort_String(), ecorePackage.getEBoolean(), "createGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "defaultCroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultMode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTask__InitLogMessage(), null, "initLogMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(preprocessingTaskEClass, PreprocessingTask.class, "PreprocessingTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreprocessingTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, PreprocessingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreprocessingTask_Task(), this.getTask(), null, "task", null, 0, 1, PreprocessingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingTask_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, PreprocessingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingTask_DataPortIndex(), ecorePackage.getEInt(), "dataPortIndex", null, 0, 1, PreprocessingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolMatchEClass, ToolMatch.class, "ToolMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolMatch_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolMatch.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_Task(), this.getTask(), null, "task", null, 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_Tool(), theToolPackage.getTool(), null, "tool", null, 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_Score(), ecorePackage.getELong(), "score", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_ExpectedScore(), ecorePackage.getELong(), "expectedScore", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_ExpectedToolScore(), ecorePackage.getELong(), "expectedToolScore", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingInDataPorts(), theDataPackage.getDataPort(), null, "missingInDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingOutDataPorts(), theDataPackage.getDataPort(), null, "missingOutDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingGroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "missingGroupingCriteria", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingInDataPorts(), theDataPackage.getDataPort(), null, "reverseMissingInDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingOutDataPorts(), theDataPackage.getDataPort(), null, "reverseMissingOutDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingGroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "reverseMissingGroupingCriteria", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_Valid(), ecorePackage.getEBoolean(), "valid", "false", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getToolMatch__ComputeScore__EMap(), ecorePackage.getELong(), "computeScore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToStringMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToolMatch__ComputeExpectedScore(), ecorePackage.getELong(), "computeExpectedScore", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getToolMatch__ValidateDataPorts__EList_EList(), ecorePackage.getEBoolean(), "validateDataPorts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getPattern(), "pattern", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getToolMatch__ResolveReverseMissingInDataPorts__EList(), theMapsPackage.getTaskToDataPortsMap(), "resolveReverseMissingInDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getToolMatch__ResolveReverseMissingOutDataPorts__EList(), theMapsPackage.getTaskToDataPortsMap(), "resolveReverseMissingOutDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getToolMatch__GetDataPortProvidingTasks__EList_EList(), theMapsPackage.getTaskToDataPortsMap(), "getDataPortProvidingTasks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(iWorkflowTemplateEClass, IWorkflowTemplate.class, "IWorkflowTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIWorkflowTemplate__ReadTemplate__String_EList(), ecorePackage.getEBoolean(), "readTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultWorkflowTemplateEClass, DefaultWorkflowTemplate.class, "DefaultWorkflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultWorkflowTemplate_Tasks(), this.getTask(), null, "tasks", null, 0, -1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_Reader(), theEasyflowPackage.getBufferedReader(), "reader", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_UtilTaskReader(), theEasyflowPackage.getBufferedReader(), "utilTaskReader", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, DefaultWorkflowTemplate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultWorkflowTemplate_LogMessage(), theUtilPackage.getLogMessage(), null, "logMessage", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultWorkflowTemplate_UtilTaskFileName(), ecorePackage.getEString(), "utilTaskFileName", null, 0, 1, DefaultWorkflowTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDefaultWorkflowTemplate__InitLogMessage(), null, "initLogMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(easyflowTemplateEClass, EasyflowTemplate.class, "EasyflowTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTaskReaderEClass, ITaskReader.class, "ITaskReader", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getITaskReader__ReadTask(), null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(galaxyTaskReaderEClass, GalaxyTaskReader.class, "GalaxyTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalaxyTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GalaxyTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultRecordEClass, DefaultRecord.class, "DefaultRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultRecord_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, DefaultRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Entries(), theMapsPackage.getStringToObjectMap(), null, "entries", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentTaskResultEClass, ParentTaskResult.class, "ParentTaskResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentTaskResult_ParentTask(), this.getTask(), null, "parentTask", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentTaskResult_CoveredPorts(), theDataPackage.getDataPort(), null, "coveredPorts", null, 0, -1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Generic(), ecorePackage.getEBoolean(), "generic", "false", 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_PotentialCircumventingTasks(), ecorePackage.getEString(), "potentialCircumventingTasks", null, 0, -1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ParentTaskResult.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Forbidden(), ecorePackage.getEString(), "forbidden", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_CircumventingParents(), ecorePackage.getEString(), "circumventingParents", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Condition.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCondition__IsUnconditional(), ecorePackage.getEBoolean(), "isUnconditional", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //CorePackageImpl
