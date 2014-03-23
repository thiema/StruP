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
import easyflow.core.DataLink;
import easyflow.core.DataPort;
import easyflow.core.DefaultRecord;
import easyflow.core.DefaultWorkflowTemplate;
import easyflow.core.EasyflowTemplate;
import easyflow.core.GalaxyTaskReader;
import easyflow.core.ITaskReader;
import easyflow.core.IWorkflowTemplate;
import easyflow.core.ParentTaskResult;
import easyflow.core.Task;
import easyflow.core.ToolMatch;
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
	private EClass dataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolMatchEClass = null;

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
	public EReference getWorkflow_PreviousTaskName() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Worker() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Tools() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(20);
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
	public EReference getWorkflow_GraphUtil() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Catalog() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ProcessingConfig() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_RootTask() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_StaticTasks() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ProcessedStates() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(17);
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
	public EReference getTask_ToolMatches() {
		return (EReference)taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PreviousTaskStr() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Root() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Flags() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_GroupingCriteria() {
		return (EReference)taskEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_InputDataPortValidator() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_OutputDataPortValidator() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_AnalysisTypes() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_CircumventingParents() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Records() {
		return (EReference)taskEClass.getEStructuralFeatures().get(23);
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
	public EReference getDataPort_DataFormats() {
		return (EReference)dataPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_Optional() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_BitPos() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_Name() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPort_Tools() {
		return (EReference)dataPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPort_Static() {
		return (EAttribute)dataPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLink() {
		return dataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_DataPort() {
		return (EReference)dataLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Chunks() {
		return (EReference)dataLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_Id() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_TraversalName() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_GroupingStr() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_ParentGroupingStr() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLink_IdenticalGrouping() {
		return (EAttribute)dataLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Condition() {
		return (EReference)dataLinkEClass.getEStructuralFeatures().get(7);
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
	public EClass getToolMatch() {
		return toolMatchEClass;
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
	public EAttribute getToolMatch_Logger() {
		return (EAttribute)toolMatchEClass.getEStructuralFeatures().get(0);
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
		createEReference(workflowEClass, WORKFLOW__GRAPH_UTIL);
		createEReference(workflowEClass, WORKFLOW__CATALOG);
		createEReference(workflowEClass, WORKFLOW__PROCESSING_CONFIG);
		createEReference(workflowEClass, WORKFLOW__ROOT_TASK);
		createEReference(workflowEClass, WORKFLOW__STATIC_TASKS);
		createEReference(workflowEClass, WORKFLOW__PROCESSED_STATES);
		createEReference(workflowEClass, WORKFLOW__PREVIOUS_TASK_NAME);
		createEAttribute(workflowEClass, WORKFLOW__WORKER);
		createEReference(workflowEClass, WORKFLOW__TOOLS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__IN_DATA_PORTS);
		createEReference(taskEClass, TASK__OUT_DATA_PORTS);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__JEXL_STRING);
		createEAttribute(taskEClass, TASK__UTIL);
		createEAttribute(taskEClass, TASK__JEXL_ENGINE);
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
		createEAttribute(taskEClass, TASK__INPUT_DATA_PORT_VALIDATOR);
		createEAttribute(taskEClass, TASK__OUTPUT_DATA_PORT_VALIDATOR);
		createEAttribute(taskEClass, TASK__ANALYSIS_TYPES);
		createEAttribute(taskEClass, TASK__CIRCUMVENTING_PARENTS);
		createEReference(taskEClass, TASK__RECORDS);

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

		iWorkflowTemplateEClass = createEClass(IWORKFLOW_TEMPLATE);

		defaultWorkflowTemplateEClass = createEClass(DEFAULT_WORKFLOW_TEMPLATE);
		createEReference(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__TASKS);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__READER);
		createEAttribute(defaultWorkflowTemplateEClass, DEFAULT_WORKFLOW_TEMPLATE__LOGGER);

		easyflowTemplateEClass = createEClass(EASYFLOW_TEMPLATE);

		iTaskReaderEClass = createEClass(ITASK_READER);

		galaxyTaskReaderEClass = createEClass(GALAXY_TASK_READER);
		createEAttribute(galaxyTaskReaderEClass, GALAXY_TASK_READER__LOGGER);

		defaultRecordEClass = createEClass(DEFAULT_RECORD);
		createEReference(defaultRecordEClass, DEFAULT_RECORD__GENERIC_ATTRIBUTES);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__ENTRIES);

		dataPortEClass = createEClass(DATA_PORT);
		createEReference(dataPortEClass, DATA_PORT__GROUPING_CRITERIA);
		createEAttribute(dataPortEClass, DATA_PORT__CARDINALITY);
		createEReference(dataPortEClass, DATA_PORT__DATA_FORMATS);
		createEAttribute(dataPortEClass, DATA_PORT__OPTIONAL);
		createEAttribute(dataPortEClass, DATA_PORT__BIT_POS);
		createEAttribute(dataPortEClass, DATA_PORT__NAME);
		createEReference(dataPortEClass, DATA_PORT__TOOLS);
		createEAttribute(dataPortEClass, DATA_PORT__STATIC);

		dataLinkEClass = createEClass(DATA_LINK);
		createEReference(dataLinkEClass, DATA_LINK__DATA_PORT);
		createEReference(dataLinkEClass, DATA_LINK__CHUNKS);
		createEAttribute(dataLinkEClass, DATA_LINK__ID);
		createEAttribute(dataLinkEClass, DATA_LINK__TRAVERSAL_NAME);
		createEAttribute(dataLinkEClass, DATA_LINK__GROUPING_STR);
		createEAttribute(dataLinkEClass, DATA_LINK__PARENT_GROUPING_STR);
		createEAttribute(dataLinkEClass, DATA_LINK__IDENTICAL_GROUPING);
		createEReference(dataLinkEClass, DATA_LINK__CONDITION);

		parentTaskResultEClass = createEClass(PARENT_TASK_RESULT);
		createEReference(parentTaskResultEClass, PARENT_TASK_RESULT__PARENT_TASK);
		createEReference(parentTaskResultEClass, PARENT_TASK_RESULT__COVERED_PORTS);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__CONDITION);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__GENERIC);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__RANK);
		createEAttribute(parentTaskResultEClass, PARENT_TASK_RESULT__POTENTIAL_CIRCUMVENTING_TASKS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__FORBIDDEN);
		createEAttribute(conditionEClass, CONDITION__CIRCUMVENTING_PARENTS);
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
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		ToolPackage theToolPackage = (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultWorkflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getIWorkflowTemplate());
		easyflowTemplateEClass.getESuperTypes().add(this.getDefaultWorkflowTemplate());
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
		initEReference(getWorkflow_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_GraphUtil(), theJgraphxPackage.getUtil(), null, "graphUtil", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Catalog(), this.getCatalog(), null, "catalog", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ProcessingConfig(), theMapsPackage.getStringToStringMap(), null, "processingConfig", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_RootTask(), this.getTask(), null, "rootTask", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_StaticTasks(), this.getTask(), null, "staticTasks", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ProcessedStates(), theMapsPackage.getStringToBooleanMap(), null, "processedStates", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_PreviousTaskName(), theMapsPackage.getStringToStringMap(), null, "previousTaskName", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Worker(), theEasyflowPackage.getEasyFlowOverallWorker(), "worker", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Tools(), theMapsPackage.getStringToToolMap(), null, "tools", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "generateGraphFromTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToToolMap(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "getParentTasksByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getTask());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateParentTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "validateLastTaskOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, null, "readMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, theMapsPackage.getTaskToDataLinksMap(), "getParentTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveMissingDataPortsByToolFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "readWorkfowTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "generateAbstractWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "applyGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "applyParameterCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveIncompatibleGroupings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "generateWorklowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEInt(), "runNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = addEOperation(workflowEClass, ecorePackage.getEInt(), "runPrevWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = addEOperation(workflowEClass, ecorePackage.getEInt(), "runEntireWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "hasNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEInt(), "getTotalNumberOfWorkflowSteps", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEString(), "getWorkflowStepLabelFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowEClass, ecorePackage.getEString(), "getWorkflowStepDescFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEInt(), "getNumberOfCurrentWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEString(), "getNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEString(), "getCurWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEClass, ecorePackage.getEBoolean(), "resetWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_InDataPorts(), this.getDataPort(), null, "inDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OutDataPorts(), this.getDataPort(), null, "outDataPorts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_JexlString(), ecorePackage.getEString(), "jexlString", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Util(), ecorePackage.getEBoolean(), "util", "false", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_JexlEngine(), theEasyflowPackage.getJexlEngine(), "jexlEngine", null, 0, 1, Task.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getTask_Inputs(), theMapsPackage.getStringToURIMap(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outputs(), theMapsPackage.getStringToURIMap(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_InputDataPortValidator(), theEasyflowPackage.getPattern(), "inputDataPortValidator", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_OutputDataPortValidator(), theEasyflowPackage.getPattern(), "outputDataPortValidator", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_AnalysisTypes(), ecorePackage.getEString(), "analysisTypes", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CircumventingParents(), ecorePackage.getEString(), "circumventingParents", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Records(), theTraversalPackage.getTraversalChunk(), null, "records", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(taskEClass, null, "readTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "taskString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultMode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultGroupingCriteria", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "shallProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "forGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "shallProcess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "forGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jexlStrings", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isInverse", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theEasyflowPackage.getObject(), "evaluateJexl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "metaDataMap", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "jexlString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theMapsPackage.getStringToObjectMap(), "createMetaDataMapForJexl", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "forGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, null, "parseDataFormatField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataFormatString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getPattern(), "pattern", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(theToolPackage.getDataFormat());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(taskEClass, ecorePackage.getEString(), "getUniqueString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithOutDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "isCompatibleWithInDataPortFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getTask(), "getParentTaskByOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theMapsPackage.getStringToChunksMap(), "getNonOveralppingTraversalChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, null, "readTools", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tools", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, theToolPackage.getTool(), "getPreferredTool", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getDataPort(), "getOverlappingDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPorts1", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPorts2", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, theMapsPackage.getStringToStringMap(), "createCommandLineMap", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "validateTool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEBoolean(), "validateTools", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getDataPort(), "getDataPortByDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "testDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getDataPort(), "getDataPortByNameOfFormat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, this.getDataPort(), "getDataPortByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataPortName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theMapsPackage.getTaskToDataPortsMap(), "resolveMissingDataPortsByTool", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theTraversalPackage.getTraversalChunk(), "getOverlappingChunksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "parentTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEString(), "getRequiredGroupingsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEString(), "getProvidedGroupingsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "hasMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "hasMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "hasMultipleGroupingsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canProcessMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canProcessMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canProcessMultipleGroupingsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canFilterInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, theTraversalPackage.getTraversalChunk(), "getRecords", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "intersect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, theTraversalPackage.getTraversalChunk(), "getOverlappingRecordsProvidedBy", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "testTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canProvideDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "grouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "traverslChunks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		op = addEOperation(taskEClass, ecorePackage.getEBoolean(), "canComsumeDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theToolPackage.getTool(), "tool", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "grouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "traverslChunks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());

		initEClass(toolMatchEClass, ToolMatch.class, "ToolMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolMatch_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolMatch.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_Task(), this.getTask(), null, "task", null, 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_Tool(), theToolPackage.getTool(), null, "tool", null, 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_Score(), ecorePackage.getELong(), "score", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_ExpectedScore(), ecorePackage.getELong(), "expectedScore", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_ExpectedToolScore(), ecorePackage.getELong(), "expectedToolScore", "0", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingInDataPorts(), this.getDataPort(), null, "missingInDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingOutDataPorts(), this.getDataPort(), null, "missingOutDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_MissingGroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "missingGroupingCriteria", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingInDataPorts(), this.getDataPort(), null, "reverseMissingInDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingOutDataPorts(), this.getDataPort(), null, "reverseMissingOutDataPorts", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolMatch_ReverseMissingGroupingCriteria(), theMapsPackage.getStringToStringMap(), null, "reverseMissingGroupingCriteria", null, 0, -1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolMatch_Valid(), ecorePackage.getEBoolean(), "valid", "false", 0, 1, ToolMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(toolMatchEClass, ecorePackage.getELong(), "computeScore", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(toolMatchEClass, ecorePackage.getELong(), "computeExpectedScore", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolMatchEClass, ecorePackage.getEBoolean(), "validateDataPorts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getPattern(), "pattern", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolMatchEClass, theMapsPackage.getTaskToDataPortsMap(), "resolveReverseMissingInDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolMatchEClass, theMapsPackage.getTaskToDataPortsMap(), "resolveReverseMissingOutDataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolMatchEClass, theMapsPackage.getTaskToDataPortsMap(), "getDataPortProvidingTasks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPorts", 0, -1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(galaxyTaskReaderEClass, GalaxyTaskReader.class, "GalaxyTaskReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalaxyTaskReader_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GalaxyTaskReader.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultRecordEClass, DefaultRecord.class, "DefaultRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultRecord_GenericAttributes(), theMapsPackage.getStringToObjectMap(), null, "genericAttributes", null, 0, -1, DefaultRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Entries(), theMapsPackage.getStringToObjectMap(), null, "entries", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPort_GroupingCriteria(), theTraversalPackage.getTraversalCriterion(), null, "groupingCriteria", null, 0, -1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_Cardinality(), ecorePackage.getEShort(), "cardinality", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPort_DataFormats(), theMapsPackage.getStringToDataFormatMap(), null, "dataFormats", null, 0, -1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_BitPos(), ecorePackage.getEShort(), "bitPos", "-1", 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPort_Tools(), theMapsPackage.getStringToToolMap(), null, "tools", null, 0, -1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPort_Static(), ecorePackage.getEBoolean(), "static", "false", 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataPortEClass, ecorePackage.getEBoolean(), "isCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataPortEClass, ecorePackage.getEBoolean(), "removeDataPortFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataPort(), "dataPort", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataLinkEClass, DataLink.class, "DataLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLink_DataPort(), this.getDataPort(), null, "dataPort", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLink_Chunks(), theTraversalPackage.getTraversalChunk(), null, "chunks", null, 0, -1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_Id(), ecorePackage.getEInt(), "id", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_TraversalName(), ecorePackage.getEString(), "traversalName", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_GroupingStr(), ecorePackage.getEString(), "groupingStr", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_ParentGroupingStr(), ecorePackage.getEString(), "parentGroupingStr", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataLink_IdenticalGrouping(), ecorePackage.getEBoolean(), "identicalGrouping", "false", 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLink_Condition(), this.getCondition(), null, "condition", null, 0, 1, DataLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dataLinkEClass, ecorePackage.getEBoolean(), "isUnconditional", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parentTaskResultEClass, ParentTaskResult.class, "ParentTaskResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentTaskResult_ParentTask(), this.getTask(), null, "parentTask", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentTaskResult_CoveredPorts(), this.getDataPort(), null, "coveredPorts", null, 0, -1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Generic(), ecorePackage.getEBoolean(), "generic", "false", 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentTaskResult_PotentialCircumventingTasks(), ecorePackage.getEString(), "potentialCircumventingTasks", null, 0, -1, ParentTaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Forbidden(), ecorePackage.getEString(), "forbidden", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_CircumventingParents(), ecorePackage.getEString(), "circumventingParents", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(conditionEClass, ecorePackage.getEBoolean(), "isUnconditional", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //CorePackageImpl
