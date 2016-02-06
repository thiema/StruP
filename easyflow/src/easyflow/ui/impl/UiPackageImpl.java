/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui.impl;

import easyflow.EasyflowPackage;

import easyflow.core.CorePackage;

import easyflow.core.impl.CorePackageImpl;

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

import easyflow.graph.jgraphx.JgraphxPackage;

import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;

import easyflow.impl.EasyflowPackageImpl;

import easyflow.metadata.MetadataPackage;

import easyflow.metadata.impl.MetadataPackageImpl;

import easyflow.tool.ToolPackage;

import easyflow.tool.impl.ToolPackageImpl;

import easyflow.traversal.TraversalPackage;

import easyflow.traversal.impl.TraversalPackageImpl;

import easyflow.ui.DefaultProject;
import easyflow.ui.IProject;
import easyflow.ui.UiFactory;
import easyflow.ui.UiPackage;

import easyflow.util.maps.MapsPackage;

import easyflow.util.maps.impl.MapsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultProjectEClass = null;

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
	 * @see easyflow.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
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
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
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
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
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
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProject() {
		return iProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__Validate() {
		return iProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetActiveWorkflow() {
		return iProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ClearWorkflows() {
		return iProjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ReadConfiguration__JSONObject_boolean() {
		return iProjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ReadProjectJson__URI() {
		return iProjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__SetConfigAndBasePath__String() {
		return iProjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ApplyMetaData() {
		return iProjectEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__Init__EasyFlowGraph() {
		return iProjectEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__Delete() {
		return iProjectEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__RunEntireWorkflow() {
		return iProjectEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ResolveTraversalCriteria() {
		return iProjectEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GenerateAbstractGraph() {
		return iProjectEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ApplyGroupingCriteria() {
		return iProjectEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ApplyParameterCriteria() {
		return iProjectEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ResolveUtilityTasks() {
		return iProjectEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ResolvePreprocessingTasks() {
		return iProjectEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ResolveToolDependencies() {
		return iProjectEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GenerateWorklowForExecutionSystem() {
		return iProjectEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__SetWorker__EasyFlowOverallWorker() {
		return iProjectEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__RunNextWorkflowStep() {
		return iProjectEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__RunPrevWorkflowStep() {
		return iProjectEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__HasNextWorkflowStep() {
		return iProjectEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetWorkflowStepLabelFor__String() {
		return iProjectEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetWorkflowStepDescFor__String() {
		return iProjectEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetTotalNumberOfWorkflowSteps() {
		return iProjectEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetNumberOfCurrentWorkflowStep() {
		return iProjectEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetNextWorkflowStep() {
		return iProjectEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetCurWorkflowStep() {
		return iProjectEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__ResetWorkflowStep() {
		return iProjectEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProject__GetExecutionSystem() {
		return iProjectEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultProject() {
		return defaultProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultProject_Workflows() {
		return (EReference)defaultProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultProject_MetaData() {
		return (EReference)defaultProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_ConfigSource() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_BaseURI() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_Logger() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_FromJar() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_DefaultConfigSourceString() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultProject_ToolDefinitions() {
		return (EReference)defaultProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultProject_Packages() {
		return (EReference)defaultProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_ConfigWorkflowDefFile() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_ConfigUtilityDefFile() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_ConfigMetadataFile() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
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
		iProjectEClass = createEClass(IPROJECT);
		createEOperation(iProjectEClass, IPROJECT___VALIDATE);
		createEOperation(iProjectEClass, IPROJECT___GET_ACTIVE_WORKFLOW);
		createEOperation(iProjectEClass, IPROJECT___CLEAR_WORKFLOWS);
		createEOperation(iProjectEClass, IPROJECT___READ_CONFIGURATION__JSONOBJECT_BOOLEAN);
		createEOperation(iProjectEClass, IPROJECT___READ_PROJECT_JSON__URI);
		createEOperation(iProjectEClass, IPROJECT___SET_CONFIG_AND_BASE_PATH__STRING);
		createEOperation(iProjectEClass, IPROJECT___APPLY_META_DATA);
		createEOperation(iProjectEClass, IPROJECT___INIT__EASYFLOWGRAPH);
		createEOperation(iProjectEClass, IPROJECT___DELETE);
		createEOperation(iProjectEClass, IPROJECT___RUN_ENTIRE_WORKFLOW);
		createEOperation(iProjectEClass, IPROJECT___RESOLVE_TRAVERSAL_CRITERIA);
		createEOperation(iProjectEClass, IPROJECT___GENERATE_ABSTRACT_GRAPH);
		createEOperation(iProjectEClass, IPROJECT___APPLY_GROUPING_CRITERIA);
		createEOperation(iProjectEClass, IPROJECT___APPLY_PARAMETER_CRITERIA);
		createEOperation(iProjectEClass, IPROJECT___RESOLVE_UTILITY_TASKS);
		createEOperation(iProjectEClass, IPROJECT___RESOLVE_PREPROCESSING_TASKS);
		createEOperation(iProjectEClass, IPROJECT___RESOLVE_TOOL_DEPENDENCIES);
		createEOperation(iProjectEClass, IPROJECT___GENERATE_WORKLOW_FOR_EXECUTION_SYSTEM);
		createEOperation(iProjectEClass, IPROJECT___SET_WORKER__EASYFLOWOVERALLWORKER);
		createEOperation(iProjectEClass, IPROJECT___RUN_NEXT_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___RUN_PREV_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___HAS_NEXT_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___GET_WORKFLOW_STEP_LABEL_FOR__STRING);
		createEOperation(iProjectEClass, IPROJECT___GET_WORKFLOW_STEP_DESC_FOR__STRING);
		createEOperation(iProjectEClass, IPROJECT___GET_TOTAL_NUMBER_OF_WORKFLOW_STEPS);
		createEOperation(iProjectEClass, IPROJECT___GET_NUMBER_OF_CURRENT_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___GET_NEXT_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___GET_CUR_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___RESET_WORKFLOW_STEP);
		createEOperation(iProjectEClass, IPROJECT___GET_EXECUTION_SYSTEM);

		defaultProjectEClass = createEClass(DEFAULT_PROJECT);
		createEReference(defaultProjectEClass, DEFAULT_PROJECT__WORKFLOWS);
		createEReference(defaultProjectEClass, DEFAULT_PROJECT__META_DATA);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__CONFIG_SOURCE);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__BASE_URI);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__LOGGER);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__FROM_JAR);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__DEFAULT_CONFIG_SOURCE_STRING);
		createEReference(defaultProjectEClass, DEFAULT_PROJECT__TOOL_DEFINITIONS);
		createEReference(defaultProjectEClass, DEFAULT_PROJECT__PACKAGES);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__CONFIG_WORKFLOW_DEF_FILE);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__CONFIG_UTILITY_DEF_FILE);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__CONFIG_METADATA_FILE);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EasyflowPackage theEasyflowPackage = (EasyflowPackage)EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		ToolPackage theToolPackage = (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultProjectEClass.getESuperTypes().add(this.getIProject());

		// Initialize classes, features, and operations; add parameters
		initEClass(iProjectEClass, IProject.class, "IProject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIProject__Validate(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetActiveWorkflow(), theCorePackage.getWorkflow(), "getActiveWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__ClearWorkflows(), null, "clearWorkflows", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getIProject__ReadConfiguration__JSONObject_boolean(), ecorePackage.getEBoolean(), "readConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getJSONObject(), "config", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isDefault", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__ReadProjectJson__URI(), theEasyflowPackage.getJSONObject(), "readProjectJson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		op = initEOperation(getIProject__SetConfigAndBasePath__String(), null, "setConfigAndBasePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__ApplyMetaData(), null, "applyMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__Init__EasyFlowGraph(), ecorePackage.getEBoolean(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getEasyFlowGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__Delete(), ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__RunEntireWorkflow(), ecorePackage.getEBoolean(), "runEntireWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getIProject__ResolveTraversalCriteria(), ecorePackage.getEBoolean(), "resolveTraversalCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEOperation(getIProject__GenerateAbstractGraph(), ecorePackage.getEBoolean(), "generateAbstractGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__ApplyGroupingCriteria(), ecorePackage.getEBoolean(), "applyGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = initEOperation(getIProject__ApplyParameterCriteria(), ecorePackage.getEBoolean(), "applyParameterCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = initEOperation(getIProject__ResolveUtilityTasks(), ecorePackage.getEBoolean(), "resolveUtilityTasks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getIProject__ResolvePreprocessingTasks(), ecorePackage.getEBoolean(), "resolvePreprocessingTasks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getIProject__ResolveToolDependencies(), ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEOperation(getIProject__GenerateWorklowForExecutionSystem(), ecorePackage.getEBoolean(), "generateWorklowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__SetWorker__EasyFlowOverallWorker(), null, "setWorker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getEasyFlowOverallWorker(), "worker", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__RunNextWorkflowStep(), ecorePackage.getEInt(), "runNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getIProject__RunPrevWorkflowStep(), ecorePackage.getEInt(), "runPrevWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEOperation(getIProject__HasNextWorkflowStep(), ecorePackage.getEBoolean(), "hasNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__GetWorkflowStepLabelFor__String(), ecorePackage.getEString(), "getWorkflowStepLabelFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProject__GetWorkflowStepDescFor__String(), ecorePackage.getEString(), "getWorkflowStepDescFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetTotalNumberOfWorkflowSteps(), ecorePackage.getEInt(), "getTotalNumberOfWorkflowSteps", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetNumberOfCurrentWorkflowStep(), ecorePackage.getEInt(), "getNumberOfCurrentWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetNextWorkflowStep(), ecorePackage.getEString(), "getNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetCurWorkflowStep(), ecorePackage.getEString(), "getCurWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__ResetWorkflowStep(), ecorePackage.getEBoolean(), "resetWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProject__GetExecutionSystem(), theExecutionPackage.getIExecutionSystem(), "getExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultProjectEClass, DefaultProject.class, "DefaultProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultProject_Workflows(), theCorePackage.getWorkflow(), null, "workflows", null, 0, -1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultProject_MetaData(), theMetadataPackage.getIMetaData(), null, "metaData", null, 0, -1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_ConfigSource(), theEasyflowPackage.getURI(), "configSource", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_BaseURI(), theEasyflowPackage.getURI(), "baseURI", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_Logger(), theEasyflowPackage.getLogger(), "logger", "", 0, 1, DefaultProject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_FromJar(), ecorePackage.getEBoolean(), "fromJar", "true", 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_DefaultConfigSourceString(), ecorePackage.getEString(), "DefaultConfigSourceString", "main.json", 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultProject_ToolDefinitions(), theToolPackage.getToolDefinitions(), null, "toolDefinitions", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultProject_Packages(), theMapsPackage.getStringToPackageMap(), null, "packages", null, 0, -1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_ConfigWorkflowDefFile(), ecorePackage.getEString(), "configWorkflowDefFile", "", 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_ConfigUtilityDefFile(), ecorePackage.getEString(), "configUtilityDefFile", "", 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_ConfigMetadataFile(), ecorePackage.getEString(), "configMetadataFile", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UiPackageImpl
