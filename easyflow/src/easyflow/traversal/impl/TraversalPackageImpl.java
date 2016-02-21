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

import easyflow.traversal.GroupingCriterion;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalDependency;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalDependencyEClass = null;

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
		GraphPackageImpl theGraphPackage = (GraphPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) instanceof GraphPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI) : GraphPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);
		ExamplePackageImpl theExamplePackage = (ExamplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) instanceof ExamplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExamplePackage.eNS_URI) : ExamplePackage.eINSTANCE);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) instanceof ExecutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI) : ExecutionPackage.eINSTANCE);
		PegasusPackageImpl thePegasusPackage = (PegasusPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) instanceof PegasusPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PegasusPackage.eNS_URI) : PegasusPackage.eINSTANCE);
		ShellPackageImpl theShellPackage = (ShellPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) instanceof ShellPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShellPackage.eNS_URI) : ShellPackage.eINSTANCE);
		MakeflowPackageImpl theMakeflowPackage = (MakeflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) instanceof MakeflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MakeflowPackage.eNS_URI) : MakeflowPackage.eINSTANCE);
		ToolPackageImpl theToolPackage = (ToolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) instanceof ToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI) : ToolPackage.eINSTANCE);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) instanceof MetadataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) : MetadataPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theTraversalPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
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
		theMapsPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theTraversalPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
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
		theMapsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

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
	public EReference getTraversalEvent_MergeTasksParamCrit() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_ParentCells() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_TraversalCriterion() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_Logger() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalEvent_MetaData() {
		return (EAttribute)traversalEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEvent_Dependancy() {
		return (EReference)traversalEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__ApplyMetadata() {
		return traversalEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__ReadChunks() {
		return traversalEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__IsGrouping() {
		return traversalEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__IsParent__Task_String() {
		return traversalEventEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__GetType() {
		return traversalEventEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__GetDepNum() {
		return traversalEventEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__IncDep() {
		return traversalEventEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__DecDep() {
		return traversalEventEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEvent__HasDep() {
		return traversalEventEClass.getEOperations().get(8);
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
	public EAttribute getGroupingCriterion_Name() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Description() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Mode() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_MultipleInstances() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_SeperateInputPorts() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingCriterion_Logger() {
		return (EAttribute)groupingCriterionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupingCriterion_DataPort() {
		return (EReference)groupingCriterionEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getTraversalChunk_Derived1by1() {
		return (EAttribute)traversalChunkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalChunk_GroupingInstance() {
		return (EReference)traversalChunkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalChunk__AsGroupingInstance() {
		return traversalChunkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalDependency() {
		return traversalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalDependency_Number() {
		return (EAttribute)traversalDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraversalDependency_ProcessedCells() {
		return (EAttribute)traversalDependencyEClass.getEStructuralFeatures().get(1);
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
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__MERGE_TASKS_PARAM_CRIT);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__PARENT_CELLS);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__TRAVERSAL_CRITERION);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__LOGGER);
		createEAttribute(traversalEventEClass, TRAVERSAL_EVENT__META_DATA);
		createEReference(traversalEventEClass, TRAVERSAL_EVENT__DEPENDANCY);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___APPLY_METADATA);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___READ_CHUNKS);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___IS_GROUPING);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___IS_PARENT__TASK_STRING);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___GET_TYPE);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___GET_DEP_NUM);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___INC_DEP);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___DEC_DEP);
		createEOperation(traversalEventEClass, TRAVERSAL_EVENT___HAS_DEP);

		groupingCriterionEClass = createEClass(GROUPING_CRITERION);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__ID);
		createEAttribute(groupingCriterionEClass, GROUPING_CRITERION__NAME);
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
		createEAttribute(traversalChunkEClass, TRAVERSAL_CHUNK__DERIVED1BY1);
		createEReference(traversalChunkEClass, TRAVERSAL_CHUNK__GROUPING_INSTANCE);
		createEOperation(traversalChunkEClass, TRAVERSAL_CHUNK___AS_GROUPING_INSTANCE);

		traversalDependencyEClass = createEClass(TRAVERSAL_DEPENDENCY);
		createEAttribute(traversalDependencyEClass, TRAVERSAL_DEPENDENCY__NUMBER);
		createEAttribute(traversalDependencyEClass, TRAVERSAL_DEPENDENCY__PROCESSED_CELLS);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traversalCriterionEClass.getESuperTypes().add(this.getGroupingCriterion());

		// Initialize classes, features, and operations; add parameters
		initEClass(traversalEventEClass, TraversalEvent.class, "TraversalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalEvent_MergeTask(), theCorePackage.getTask(), null, "mergeTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_SplitTask(), theCorePackage.getTask(), null, "splitTask", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_ParentTask(), theCorePackage.getTask(), null, "parentTask", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_MergeTasksParamCrit(), theCorePackage.getTask(), null, "mergeTasksParamCrit", null, 0, -1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_ParentCells(), theEasyflowPackage.getmxICell(), "parentCells", null, 0, -1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_TraversalCriterion(), this.getTraversalCriterion(), null, "traversalCriterion", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalEvent_MetaData(), theEasyflowPackage.getEObject(), "metaData", null, 0, 1, TraversalEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEvent_Dependancy(), this.getTraversalDependency(), null, "dependancy", null, 0, 1, TraversalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTraversalEvent__ApplyMetadata(), ecorePackage.getEBoolean(), "applyMetadata", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__ReadChunks(), null, "readChunks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__IsGrouping(), ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTraversalEvent__IsParent__Task_String(), ecorePackage.getEBoolean(), "isParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "parentTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "traversalChunkName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__GetDepNum(), ecorePackage.getEInt(), "getDepNum", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__IncDep(), null, "incDep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__DecDep(), null, "decDep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTraversalEvent__HasDep(), ecorePackage.getEBoolean(), "hasDep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(groupingCriterionEClass, GroupingCriterion.class, "GroupingCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupingCriterion_Id(), ecorePackage.getEString(), "id", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Description(), ecorePackage.getEString(), "description", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_MultipleInstances(), ecorePackage.getEBoolean(), "multipleInstances", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_SeperateInputPorts(), ecorePackage.getEBoolean(), "seperateInputPorts", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupingCriterion_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, GroupingCriterion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupingCriterion_DataPort(), theDataPackage.getDataPort(), null, "dataPort", null, 0, 1, GroupingCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getTraversalChunk_Derived1by1(), ecorePackage.getEBoolean(), "derived1by1", "false", 0, 1, TraversalChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalChunk_GroupingInstance(), theMetadataPackage.getGroupingInstance(), null, "groupingInstance", null, 0, 1, TraversalChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTraversalChunk__AsGroupingInstance(), theMetadataPackage.getGroupingInstance(), "asGroupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(traversalDependencyEClass, TraversalDependency.class, "TraversalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraversalDependency_Number(), ecorePackage.getEInt(), "number", "0", 0, 1, TraversalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraversalDependency_ProcessedCells(), theEasyflowPackage.getmxICell(), "processedCells", null, 0, -1, TraversalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TraversalPackageImpl
