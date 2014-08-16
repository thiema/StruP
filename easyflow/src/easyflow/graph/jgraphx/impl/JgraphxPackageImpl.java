/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

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
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.Util;

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
public class JgraphxPackageImpl extends EPackageImpl implements JgraphxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilEClass = null;

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
	 * @see easyflow.graph.jgraphx.JgraphxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JgraphxPackageImpl() {
		super(eNS_URI, JgraphxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JgraphxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JgraphxPackage init() {
		if (isInited) return (JgraphxPackage)EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI);

		// Obtain or create and register package
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JgraphxPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
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
		theJgraphxPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
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
		theJgraphxPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
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
		theJgraphxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JgraphxPackage.eNS_URI, theJgraphxPackage);
		return theJgraphxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtil() {
		return utilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_Logger() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_Graph() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_Tasks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_Cells() {
		return (EReference)utilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_MostProcessedTasks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_MetaData() {
		return (EReference)utilEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_DefaultRootCell() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_ProcessedEdgesCopyGraph() {
		return (EReference)utilEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_DeprecatedEdges() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_AddEdges() {
		return (EReference)utilEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_CopiedCells() {
		return (EReference)utilEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_CurrentSubGraphs() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_TraversalEvents() {
		return (EReference)utilEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_NewTraversalEvents() {
		return (EReference)utilEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_DataLinks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_UtilityTasks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_UtilityTaskCells() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ResolveTraversalEvents__mxICell() {
		return utilEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ComputeSubgraph__TraversalEvent_boolean() {
		return utilEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance() {
		return utilEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList() {
		return utilEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance() {
		return utilEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList() {
		return utilEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ResolvePreprocessingTask__mxICell_mxICell() {
		return utilEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__FindCellsWherePreprocessingIsRequired() {
		return utilEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ResolveToolDependencies__mxICell_Catalog() {
		return utilEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__FindCellsWithUntranslatedDataLinks() {
		return utilEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ResolveEdge__EMap() {
		return utilEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem() {
		return utilEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetTraversalEvents__mxICell_boolean() {
		return utilEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetNewTraversalEvents__TraversalEvent_mxICell() {
		return utilEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetNextTraversalEvent__boolean() {
		return utilEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetCells__EList() {
		return utilEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__RemoveSubGraph__mxICell_TraversalEvent() {
		return utilEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetGroupingInstances__TraversalEvent() {
		return utilEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__ResetFlags() {
		return utilEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__TraversalEventToString__TraversalEvent() {
		return utilEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__LayoutGraph() {
		return utilEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__IsChildOf__Task_Task() {
		return utilEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetParentDataPortsFor__Task() {
		return utilEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetChildDataPortsFor__Task() {
		return utilEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__LoadTask__Object() {
		return utilEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__LoadDataLink__Object() {
		return utilEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetChildTasksFor__Task() {
		return utilEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetSiblingTasksFor__Task() {
		return utilEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtil__GetParentTasksFor__Task() {
		return utilEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxFactory getJgraphxFactory() {
		return (JgraphxFactory)getEFactoryInstance();
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
		utilEClass = createEClass(UTIL);
		createEAttribute(utilEClass, UTIL__LOGGER);
		createEAttribute(utilEClass, UTIL__GRAPH);
		createEReference(utilEClass, UTIL__TASKS);
		createEReference(utilEClass, UTIL__CELLS);
		createEReference(utilEClass, UTIL__MOST_PROCESSED_TASKS);
		createEReference(utilEClass, UTIL__META_DATA);
		createEAttribute(utilEClass, UTIL__DEFAULT_ROOT_CELL);
		createEReference(utilEClass, UTIL__PROCESSED_EDGES_COPY_GRAPH);
		createEAttribute(utilEClass, UTIL__DEPRECATED_EDGES);
		createEReference(utilEClass, UTIL__ADD_EDGES);
		createEReference(utilEClass, UTIL__COPIED_CELLS);
		createEAttribute(utilEClass, UTIL__CURRENT_SUB_GRAPHS);
		createEReference(utilEClass, UTIL__TRAVERSAL_EVENTS);
		createEReference(utilEClass, UTIL__NEW_TRAVERSAL_EVENTS);
		createEReference(utilEClass, UTIL__DATA_LINKS);
		createEReference(utilEClass, UTIL__UTILITY_TASKS);
		createEAttribute(utilEClass, UTIL__UTILITY_TASK_CELLS);
		createEOperation(utilEClass, UTIL___RESOLVE_TRAVERSAL_EVENTS__MXICELL);
		createEOperation(utilEClass, UTIL___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN);
		createEOperation(utilEClass, UTIL___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE);
		createEOperation(utilEClass, UTIL___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST);
		createEOperation(utilEClass, UTIL___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE);
		createEOperation(utilEClass, UTIL___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST);
		createEOperation(utilEClass, UTIL___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL);
		createEOperation(utilEClass, UTIL___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED);
		createEOperation(utilEClass, UTIL___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG);
		createEOperation(utilEClass, UTIL___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS);
		createEOperation(utilEClass, UTIL___RESOLVE_EDGE__EMAP);
		createEOperation(utilEClass, UTIL___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM);
		createEOperation(utilEClass, UTIL___GET_TRAVERSAL_EVENTS__MXICELL_BOOLEAN);
		createEOperation(utilEClass, UTIL___GET_NEW_TRAVERSAL_EVENTS__TRAVERSALEVENT_MXICELL);
		createEOperation(utilEClass, UTIL___GET_NEXT_TRAVERSAL_EVENT__BOOLEAN);
		createEOperation(utilEClass, UTIL___GET_CELLS__ELIST);
		createEOperation(utilEClass, UTIL___REMOVE_SUB_GRAPH__MXICELL_TRAVERSALEVENT);
		createEOperation(utilEClass, UTIL___GET_GROUPING_INSTANCES__TRAVERSALEVENT);
		createEOperation(utilEClass, UTIL___RESET_FLAGS);
		createEOperation(utilEClass, UTIL___TRAVERSAL_EVENT_TO_STRING__TRAVERSALEVENT);
		createEOperation(utilEClass, UTIL___LAYOUT_GRAPH);
		createEOperation(utilEClass, UTIL___IS_CHILD_OF__TASK_TASK);
		createEOperation(utilEClass, UTIL___GET_PARENT_DATA_PORTS_FOR__TASK);
		createEOperation(utilEClass, UTIL___GET_CHILD_DATA_PORTS_FOR__TASK);
		createEOperation(utilEClass, UTIL___LOAD_TASK__OBJECT);
		createEOperation(utilEClass, UTIL___LOAD_DATA_LINK__OBJECT);
		createEOperation(utilEClass, UTIL___GET_CHILD_TASKS_FOR__TASK);
		createEOperation(utilEClass, UTIL___GET_SIBLING_TASKS_FOR__TASK);
		createEOperation(utilEClass, UTIL___GET_PARENT_TASKS_FOR__TASK);
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
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(utilEClass, Util.class, "Util", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtil_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Util.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_Graph(), theEasyflowPackage.getEasyFlowGraph(), "graph", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_Tasks(), theMapsPackage.getStringToTaskMap(), null, "tasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_Cells(), theMapsPackage.getStringToGraphCellMap(), null, "cells", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_MostProcessedTasks(), theMapsPackage.getStringToStringMap(), null, "mostProcessedTasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_MetaData(), theMetadataPackage.getDefaultMetaData(), null, "metaData", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_DefaultRootCell(), theEasyflowPackage.getmxICell(), "defaultRootCell", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_ProcessedEdgesCopyGraph(), theMapsPackage.getStringToStringMap(), null, "processedEdgesCopyGraph", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_DeprecatedEdges(), theEasyflowPackage.getmxICell(), "deprecatedEdges", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_AddEdges(), theMapsPackage.getStringToStringMap(), null, "addEdges", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_CopiedCells(), theMapsPackage.getStringToGraphCellMap(), null, "copiedCells", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_CurrentSubGraphs(), theEasyflowPackage.getmxICell(), "currentSubGraphs", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_TraversalEvents(), theTraversalPackage.getTraversalEvent(), null, "traversalEvents", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_NewTraversalEvents(), theTraversalPackage.getTraversalEvent(), null, "newTraversalEvents", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_DataLinks(), theMapsPackage.getStringToDataLinkMap(), null, "dataLinks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_UtilityTasks(), theMapsPackage.getStringToTaskMap(), null, "utilityTasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_UtilityTaskCells(), theEasyflowPackage.getmxICell(), "utilityTaskCells", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUtil__ResolveTraversalEvents__mxICell(), ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ComputeSubgraph__TraversalEvent_boolean(), theEasyflowPackage.getmxICell(), "computeSubgraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__ResolvePreprocessingTask__mxICell_mxICell(), ecorePackage.getEBoolean(), "resolvePreprocessingTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEOperation(getUtil__FindCellsWherePreprocessingIsRequired(), theMapsPackage.getCellToCellListMap(), "findCellsWherePreprocessingIsRequired", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__ResolveToolDependencies__mxICell_Catalog(), ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getCatalog(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEOperation(getUtil__FindCellsWithUntranslatedDataLinks(), theMapsPackage.getCellToCellListMap(), "findCellsWithUntranslatedDataLinks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__ResolveEdge__EMap(), ecorePackage.getEBoolean(), "resolveEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getCellToCellListMap(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());

		op = initEOperation(getUtil__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem(), ecorePackage.getEBoolean(), "generateWorkflowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExecutionPackage.getIExecutionSystem(), "executionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__GetTraversalEvents__mxICell_boolean(), theTraversalPackage.getTraversalEvent(), "getTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__GetNewTraversalEvents__TraversalEvent_mxICell(), theTraversalPackage.getTraversalEvent(), "getNewTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__GetNextTraversalEvent__boolean(), theTraversalPackage.getTraversalEvent(), "getNextTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__GetCells__EList(), theEasyflowPackage.getmxICell(), "getCells", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__RemoveSubGraph__mxICell_TraversalEvent(), ecorePackage.getEBoolean(), "removeSubGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__GetGroupingInstances__TraversalEvent(), theMetadataPackage.getGroupingInstance(), "getGroupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		initEOperation(getUtil__ResetFlags(), null, "resetFlags", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__TraversalEventToString__TraversalEvent(), ecorePackage.getEString(), "traversalEventToString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUtil__LayoutGraph(), null, "layoutGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__IsChildOf__Task_Task(), ecorePackage.getEBoolean(), "isChildOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "child", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUtil__GetParentDataPortsFor__Task(), theDataPackage.getDataPort(), "getParentDataPortsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());

		op = initEOperation(getUtil__GetChildDataPortsFor__Task(), theDataPackage.getDataPort(), "getChildDataPortsFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());

		op = initEOperation(getUtil__LoadTask__Object(), theCorePackage.getTask(), "loadTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getObject(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__LoadDataLink__Object(), theDataPackage.getDataLink(), "loadDataLink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getObject(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());

		op = initEOperation(getUtil__GetChildTasksFor__Task(), theCorePackage.getTask(), "getChildTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__GetSiblingTasksFor__Task(), theCorePackage.getTask(), "getSiblingTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getUtil__GetParentTasksFor__Task(), theCorePackage.getTask(), "getParentTasksFor", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
	}

} //JgraphxPackageImpl
