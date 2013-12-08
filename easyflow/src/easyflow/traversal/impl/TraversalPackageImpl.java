/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.traversal.impl;

import easyflow.EasyflowPackage;

import easyflow.core.CorePackage;

import easyflow.core.impl.CorePackageImpl;

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

import easyflow.traversal.GroupingCriterion;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;
import easyflow.traversal.TraversalOperation;
import easyflow.traversal.TraversalPackage;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

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
public class TraversalPackageImpl extends EPackageImpl implements TraversalPackage {
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
	private EClass traversalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalChunkEClass = null;

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
	 * @see easyflow.traversal.TraversalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraversalPackageImpl() {
		super(eNS_URI, TraversalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraversalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraversalPackage init() {
		if (isInited) return (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);

		// Obtain or create and register package
		TraversalPackageImpl theTraversalPackage = (TraversalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TraversalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TraversalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);
		ExamplePackageImpl theExamplePackage = (ExamplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) instanceof ExamplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) : ExamplePackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		PegasusPackageImpl thePegasusPackage = (PegasusPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) instanceof PegasusPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) : PegasusPackage.eINSTANCE);
		ShellPackageImpl theShellPackage = (ShellPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) instanceof ShellPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) : ShellPackage.eINSTANCE);
		MakeflowPackageImpl theMakeflowPackage = (MakeflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) instanceof MakeflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) : MakeflowPackage.eINSTANCE);
		ToolPackageImpl theToolPackage = (ToolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) instanceof ToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) : ToolPackage.eINSTANCE);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) instanceof MetadataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) : MetadataPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);

		// Create package meta-data objects
		theTraversalPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();
		theExamplePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		thePegasusPackage.createPackageContents();
		theShellPackage.createPackageContents();
		theMakeflowPackage.createPackageContents();
		theToolPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theMapsPackage.createPackageContents();

		// Initialize created meta-data
		theTraversalPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();
		theExamplePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		thePegasusPackage.initializePackageContents();
		theShellPackage.initializePackageContents();
		theMakeflowPackage.initializePackageContents();
		theToolPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theMapsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraversalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraversalPackage.eNS_URI, theTraversalPackage);
		return theTraversalPackage;
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
	public EAttribute getTraversalEvent_ParentCells() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(3);
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
	public EClass getGroupingCriterion() {
		return groupingCriterionEClass;
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
	public EReference getGroupingCriterion_DataPort() {
		return (EReference)groupingCriterionEClass.getEStructuralFeatures().get(6);
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
	public TraversalFactory getTraversalFactory() {
		return (TraversalFactory)getEFactoryInstance();
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
		traversalEventEClass = createEClass(TRAVERSAL_EVENT);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__MERGE_TASK);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__SPLIT_TASK);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__PARENT_TASK);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__PARENT_CELLS);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__TRAVERSAL_CRITERION);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__LOGGER);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__META_DATA);

		groupingCriterionEClass = createEClass(GROUPING_CRITERION);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__ID);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__DESCRIPTION);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__MODE);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__MULTIPLE_INSTANCES);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__SEPERATE_INPUT_PORTS);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__LOGGER);
		createEReference(groupingCriterionEClass, GROUPING_CRITERION__DATA_PORT);

		traversalCriterionEClass = createEClass(TRAVERSAL_CRITERION);
		createEReference(traversalCriterionEClass, TRAVERSAL_CRITERION__OPERATION);
		createEReference(traversalCriterionEClass, TRAVERSAL_CRITERION__CHUNKS);
		createEAttribute(traversalCriterionEClass, TRAVERSAL_CRITERION__CHUNK_SOURCE);

		traversalOperationEClass = createEClass(TRAVERSAL_OPERATION);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__NAME);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__LOGGER);
		createEAttribute(traversalOperationEClass, TRAVERSAL_OPERATION__TYPE);

		traversalChunkEClass = createEClass(TRAVERSAL_CHUNK);
		createEAttribute(traversalChunkEClass, TRAVERSAL_CHUNK__NAME);
		createEAttribute(traversalChunkEClass, TRAVERSAL_CHUNK__LOGGER);
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
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traversalCriterionEClass.getESuperTypes().add(this.getGroupingCriterion());

		// Initialize classes and features; add operations and parameters
		initEClass(traversalEventEClass, TraversalEvent.class, "TraversalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalEvent_MergeTask(), theCorePackage.getTask(), null, "mergeTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_SplitTask(), theCorePackage.getTask(), null, "splitTask", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_ParentTask(), theCorePackage.getTask(), null, "parentTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_ParentCells(), theEasyflowPackage.getmxICell(), "parentCells", null, 0, -1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_TraversalCriterion(), this.getTraversalCriterion(), null, "traversalCriterion", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_MetaData(), theEasyflowPackage.getEObject(), "metaData", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "applyMetadata", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, null, "readChunks", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(traversalEventEClass, ecorePackage.getEBoolean(), "isParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "parentTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "traversalChunkName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(traversalEventEClass, ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(groupingCriterionEClass, GroupingCriterion.class, "GroupingCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupingCriterion_Id(), ecorePackage.getEString(), "id", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Description(), ecorePackage.getEString(), "description", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_MultipleInstances(), ecorePackage.getEBoolean(), "multipleInstances", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_SeperateInputPorts(), ecorePackage.getEBoolean(), "seperateInputPorts", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GroupingCriterion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupingCriterion_DataPort(), theCorePackage.getDataPort(), null, "dataPort", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalCriterionEClass, TraversalCriterion.class, "TraversalCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalCriterion_Operation(), this.getTraversalOperation(), null, "operation", null, 0, 1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalCriterion_Chunks(), theMapsPackage.getStringToChunkMap(), null, "chunks", null, 0, -1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalCriterion_ChunkSource(), ecorePackage.getEString(), "chunkSource", null, 0, 1, TraversalCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalOperationEClass, TraversalOperation.class, "TraversalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraversalOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraversalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalOperation_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalOperation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalOperation_Type(), ecorePackage.getEString(), "type", null, 0, 1, TraversalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversalChunkEClass, TraversalChunk.class, "TraversalChunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraversalChunk_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraversalChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalChunk_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalChunk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TraversalPackageImpl
