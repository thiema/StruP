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

		// Initialize classes and features; add operations and parameters
		initEClass(iProjectEClass, IProject.class, "IProject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, theCorePackage.getWorkflow(), "getActiveWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "clearWorkflows", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "readConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getJSONObject(), "config", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isDefault", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, theEasyflowPackage.getJSONObject(), "readProjectJson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		op = addEOperation(iProjectEClass, null, "setConfigAndBasePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "applyMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getEasyFlowGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "runEntireWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "resolveTraversalCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "generateAbstractGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "applyGroupingCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "applyParameterCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "resolveUtilityTasks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "resolvePreprocessingTasks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "generateWorklowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, null, "setWorker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getEasyFlowOverallWorker(), "worker", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEInt(), "runNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = addEOperation(iProjectEClass, ecorePackage.getEInt(), "runPrevWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "hasNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEString(), "getWorkflowStepLabelFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProjectEClass, ecorePackage.getEString(), "getWorkflowStepDescFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "step", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEInt(), "getTotalNumberOfWorkflowSteps", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEInt(), "getNumberOfCurrentWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEString(), "getNextWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEString(), "getCurWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, ecorePackage.getEBoolean(), "resetWorkflowStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, theExecutionPackage.getIExecutionSystem(), "getExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

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
	}

} //UiPackageImpl
