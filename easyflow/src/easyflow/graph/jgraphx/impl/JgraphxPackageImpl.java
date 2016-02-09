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
import easyflow.graph.jgraphx.AbstractGraph;
import easyflow.graph.jgraphx.ExecutionGraph;
import easyflow.graph.jgraphx.Graph;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.PreprocessingGraph;
import easyflow.graph.jgraphx.SubGraph;
import easyflow.graph.jgraphx.ToolDependencyGraph;
import easyflow.graph.jgraphx.TraversalEventGraph;
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
	private EClass abstractGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversalEventGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessingGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolDependencyGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subGraphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

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
	public EClass getAbstractGraph() {
		return abstractGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGraph_Graph() {
		return (EReference)abstractGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGraph_ErrorControl() {
		return (EReference)abstractGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractGraph__ResolveTraversalEvents__mxICell() {
		return abstractGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversalEventGraph() {
		return traversalEventGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEventGraph_Graph() {
		return (EReference)traversalEventGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraversalEventGraph_ErrorControl() {
		return (EReference)traversalEventGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance() {
		return traversalEventGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList() {
		return traversalEventGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance() {
		return traversalEventGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList() {
		return traversalEventGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessingGraph() {
		return preprocessingGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocessingGraph_Graph() {
		return (EReference)preprocessingGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocessingGraph_ErrorControl() {
		return (EReference)preprocessingGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreprocessingGraph__ResolvePreprocessingTask__mxICell_mxICell() {
		return preprocessingGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreprocessingGraph__FindCellsWherePreprocessingIsRequired() {
		return preprocessingGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreprocessingGraph__FindCellsWithUntranslatedDataLinks() {
		return preprocessingGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreprocessingGraph__ResolveEdge__EMap() {
		return preprocessingGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolDependencyGraph() {
		return toolDependencyGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDependencyGraph_Graph() {
		return (EReference)toolDependencyGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDependencyGraph_ErrorControl() {
		return (EReference)toolDependencyGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolDependencyGraph__ResolveToolDependencies__mxICell_Catalog() {
		return toolDependencyGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionGraph() {
		return executionGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionGraph_Graph() {
		return (EReference)executionGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionGraph_ErrorControl() {
		return (EReference)executionGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem() {
		return executionGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionGraph__ResolveToolParams__mxICell() {
		return executionGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionGraph__ResolvePipes__mxICell() {
		return executionGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubGraph() {
		return subGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGraph_Graph() {
		return (EReference)subGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGraph_ErrorControl() {
		return (EReference)subGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubGraph__ComputeSubgraph__TraversalEvent_boolean() {
		return subGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Logger() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Graph() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_MostProcessedTasks() {
		return (EReference)graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_MetaData() {
		return (EReference)graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_DefaultRootCell() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ProcessedEdgesCopyGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_DeprecatedEdges() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_AddEdges() {
		return (EReference)graphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_CopiedCells() {
		return (EReference)graphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_CurrentSubGraphs() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_TraversalEvents() {
		return (EReference)graphEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_NewTraversalEvents() {
		return (EReference)graphEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_AbstractGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_SubGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_TraversalEventGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_PreprocessingGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ToolDependencyGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ExecutionGraph() {
		return (EReference)graphEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ErrorControl() {
		return (EReference)graphEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetNextTraversalEvent__boolean() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetTraversalEvents__mxICell_boolean() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetNewTraversalEvents__TraversalEvent_mxICell() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__RemoveSubGraph__mxICell_TraversalEvent() {
		return graphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Clear() {
		return graphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ComputeSubgraph__TraversalEvent_boolean() {
		return graphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem() {
		return graphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResolveToolDependencies__mxICell_Catalog() {
		return graphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResolvePreprocessingTask__mxICell_mxICell() {
		return graphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__FindCellsWherePreprocessingIsRequired() {
		return graphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__FindCellsWithUntranslatedDataLinks() {
		return graphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResolveEdge__EMap() {
		return graphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance() {
		return graphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList() {
		return graphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance() {
		return graphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList() {
		return graphEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResolveTraversalEvents__mxICell() {
		return graphEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResetFlag__int() {
		return graphEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__ResetFlags() {
		return graphEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__GetGroupingInstances__TraversalEvent() {
		return graphEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Init() {
		return graphEClass.getEOperations().get(20);
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
		abstractGraphEClass = createEClass(ABSTRACT_GRAPH);
		createEReference(abstractGraphEClass, ABSTRACT_GRAPH__GRAPH);
		createEReference(abstractGraphEClass, ABSTRACT_GRAPH__ERROR_CONTROL);
		createEOperation(abstractGraphEClass, ABSTRACT_GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL);

		traversalEventGraphEClass = createEClass(TRAVERSAL_EVENT_GRAPH);
		createEReference(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH__GRAPH);
		createEReference(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH__ERROR_CONTROL);
		createEOperation(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE);
		createEOperation(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST);
		createEOperation(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE);
		createEOperation(traversalEventGraphEClass, TRAVERSAL_EVENT_GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST);

		preprocessingGraphEClass = createEClass(PREPROCESSING_GRAPH);
		createEReference(preprocessingGraphEClass, PREPROCESSING_GRAPH__GRAPH);
		createEReference(preprocessingGraphEClass, PREPROCESSING_GRAPH__ERROR_CONTROL);
		createEOperation(preprocessingGraphEClass, PREPROCESSING_GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL);
		createEOperation(preprocessingGraphEClass, PREPROCESSING_GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED);
		createEOperation(preprocessingGraphEClass, PREPROCESSING_GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS);
		createEOperation(preprocessingGraphEClass, PREPROCESSING_GRAPH___RESOLVE_EDGE__EMAP);

		toolDependencyGraphEClass = createEClass(TOOL_DEPENDENCY_GRAPH);
		createEReference(toolDependencyGraphEClass, TOOL_DEPENDENCY_GRAPH__GRAPH);
		createEReference(toolDependencyGraphEClass, TOOL_DEPENDENCY_GRAPH__ERROR_CONTROL);
		createEOperation(toolDependencyGraphEClass, TOOL_DEPENDENCY_GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG);

		executionGraphEClass = createEClass(EXECUTION_GRAPH);
		createEReference(executionGraphEClass, EXECUTION_GRAPH__GRAPH);
		createEReference(executionGraphEClass, EXECUTION_GRAPH__ERROR_CONTROL);
		createEOperation(executionGraphEClass, EXECUTION_GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM);
		createEOperation(executionGraphEClass, EXECUTION_GRAPH___RESOLVE_TOOL_PARAMS__MXICELL);
		createEOperation(executionGraphEClass, EXECUTION_GRAPH___RESOLVE_PIPES__MXICELL);

		subGraphEClass = createEClass(SUB_GRAPH);
		createEReference(subGraphEClass, SUB_GRAPH__GRAPH);
		createEReference(subGraphEClass, SUB_GRAPH__ERROR_CONTROL);
		createEOperation(subGraphEClass, SUB_GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__LOGGER);
		createEAttribute(graphEClass, GRAPH__GRAPH);
		createEReference(graphEClass, GRAPH__MOST_PROCESSED_TASKS);
		createEReference(graphEClass, GRAPH__META_DATA);
		createEAttribute(graphEClass, GRAPH__DEFAULT_ROOT_CELL);
		createEReference(graphEClass, GRAPH__PROCESSED_EDGES_COPY_GRAPH);
		createEAttribute(graphEClass, GRAPH__DEPRECATED_EDGES);
		createEReference(graphEClass, GRAPH__ADD_EDGES);
		createEReference(graphEClass, GRAPH__COPIED_CELLS);
		createEAttribute(graphEClass, GRAPH__CURRENT_SUB_GRAPHS);
		createEReference(graphEClass, GRAPH__TRAVERSAL_EVENTS);
		createEReference(graphEClass, GRAPH__NEW_TRAVERSAL_EVENTS);
		createEReference(graphEClass, GRAPH__ABSTRACT_GRAPH);
		createEReference(graphEClass, GRAPH__SUB_GRAPH);
		createEReference(graphEClass, GRAPH__TRAVERSAL_EVENT_GRAPH);
		createEReference(graphEClass, GRAPH__PREPROCESSING_GRAPH);
		createEReference(graphEClass, GRAPH__TOOL_DEPENDENCY_GRAPH);
		createEReference(graphEClass, GRAPH__EXECUTION_GRAPH);
		createEReference(graphEClass, GRAPH__ERROR_CONTROL);
		createEOperation(graphEClass, GRAPH___GET_NEXT_TRAVERSAL_EVENT__BOOLEAN);
		createEOperation(graphEClass, GRAPH___GET_TRAVERSAL_EVENTS__MXICELL_BOOLEAN);
		createEOperation(graphEClass, GRAPH___GET_NEW_TRAVERSAL_EVENTS__TRAVERSALEVENT_MXICELL);
		createEOperation(graphEClass, GRAPH___REMOVE_SUB_GRAPH__MXICELL_TRAVERSALEVENT);
		createEOperation(graphEClass, GRAPH___CLEAR);
		createEOperation(graphEClass, GRAPH___COMPUTE_SUBGRAPH__TRAVERSALEVENT_BOOLEAN);
		createEOperation(graphEClass, GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM);
		createEOperation(graphEClass, GRAPH___RESOLVE_TOOL_DEPENDENCIES__MXICELL_CATALOG);
		createEOperation(graphEClass, GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL);
		createEOperation(graphEClass, GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED);
		createEOperation(graphEClass, GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS);
		createEOperation(graphEClass, GRAPH___RESOLVE_EDGE__EMAP);
		createEOperation(graphEClass, GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_GROUPINGINSTANCE);
		createEOperation(graphEClass, GRAPH___APPLY_TRAVERSAL_EVENT__MXICELL_TRAVERSALEVENT_STRING_ELIST);
		createEOperation(graphEClass, GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_GROUPINGINSTANCE);
		createEOperation(graphEClass, GRAPH___APPLY_TRAVERSAL_EVENT_COPY_GRAPH__MXICELL_TRAVERSALEVENT_ELIST);
		createEOperation(graphEClass, GRAPH___RESOLVE_TRAVERSAL_EVENTS__MXICELL);
		createEOperation(graphEClass, GRAPH___RESET_FLAG__INT);
		createEOperation(graphEClass, GRAPH___RESET_FLAGS);
		createEOperation(graphEClass, GRAPH___GET_GROUPING_INSTANCES__TRAVERSALEVENT);
		createEOperation(graphEClass, GRAPH___INIT);
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
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractGraphEClass, AbstractGraph.class, "AbstractGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, AbstractGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractGraph__ResolveTraversalEvents__mxICell(), ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEClass(traversalEventGraphEClass, TraversalEventGraph.class, "TraversalEventGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraversalEventGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, TraversalEventGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraversalEventGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, TraversalEventGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getTraversalEventGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getTraversalEventGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEClass(preprocessingGraphEClass, PreprocessingGraph.class, "PreprocessingGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreprocessingGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, PreprocessingGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreprocessingGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, PreprocessingGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPreprocessingGraph__ResolvePreprocessingTask__mxICell_mxICell(), ecorePackage.getEBoolean(), "resolvePreprocessingTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEOperation(getPreprocessingGraph__FindCellsWherePreprocessingIsRequired(), theMapsPackage.getCellToCellListMap(), "findCellsWherePreprocessingIsRequired", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPreprocessingGraph__FindCellsWithUntranslatedDataLinks(), theMapsPackage.getCellToCellListMap(), "findCellsWithUntranslatedDataLinks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPreprocessingGraph__ResolveEdge__EMap(), ecorePackage.getEBoolean(), "resolveEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getCellToCellListMap(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());

		initEClass(toolDependencyGraphEClass, ToolDependencyGraph.class, "ToolDependencyGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolDependencyGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, ToolDependencyGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDependencyGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, ToolDependencyGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getToolDependencyGraph__ResolveToolDependencies__mxICell_Catalog(), ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getCatalog(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		initEClass(executionGraphEClass, ExecutionGraph.class, "ExecutionGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, ExecutionGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, ExecutionGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExecutionGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem(), ecorePackage.getEBoolean(), "generateWorkflowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExecutionPackage.getIExecutionSystem(), "executionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionGraph__ResolveToolParams__mxICell(), ecorePackage.getEBoolean(), "resolveToolParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecutionGraph__ResolvePipes__mxICell(), ecorePackage.getEBoolean(), "resolvePipes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subGraphEClass, SubGraph.class, "SubGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubGraph_Graph(), this.getGraph(), null, "graph", null, 0, 1, SubGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, SubGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSubGraph__ComputeSubgraph__TraversalEvent_boolean(), theEasyflowPackage.getmxICell(), "computeSubgraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Graph.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Graph(), theEasyflowPackage.getEasyFlowGraph(), "graph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_MostProcessedTasks(), theMapsPackage.getStringToStringMap(), null, "mostProcessedTasks", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_MetaData(), theMetadataPackage.getDefaultMetaData(), null, "metaData", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_DefaultRootCell(), theEasyflowPackage.getmxICell(), "defaultRootCell", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ProcessedEdgesCopyGraph(), theMapsPackage.getStringToStringMap(), null, "processedEdgesCopyGraph", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_DeprecatedEdges(), theEasyflowPackage.getmxICell(), "deprecatedEdges", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_AddEdges(), theMapsPackage.getStringToStringMap(), null, "addEdges", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_CopiedCells(), theMapsPackage.getStringToGraphCellMap(), null, "copiedCells", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_CurrentSubGraphs(), theEasyflowPackage.getmxICell(), "currentSubGraphs", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_TraversalEvents(), theTraversalPackage.getTraversalEvent(), null, "traversalEvents", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_NewTraversalEvents(), theTraversalPackage.getTraversalEvent(), null, "newTraversalEvents", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_AbstractGraph(), this.getAbstractGraph(), null, "abstractGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_SubGraph(), this.getSubGraph(), null, "subGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_TraversalEventGraph(), this.getTraversalEventGraph(), null, "traversalEventGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_PreprocessingGraph(), this.getPreprocessingGraph(), null, "preprocessingGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ToolDependencyGraph(), this.getToolDependencyGraph(), null, "toolDependencyGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ExecutionGraph(), this.getExecutionGraph(), null, "executionGraph", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ErrorControl(), theCorePackage.getErrorControl(), null, "errorControl", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGraph__GetNextTraversalEvent__boolean(), theTraversalPackage.getTraversalEvent(), "getNextTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__GetTraversalEvents__mxICell_boolean(), theTraversalPackage.getTraversalEvent(), "getTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__GetNewTraversalEvents__TraversalEvent_mxICell(), theTraversalPackage.getTraversalEvent(), "getNewTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__RemoveSubGraph__mxICell_TraversalEvent(), ecorePackage.getEBoolean(), "removeSubGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__ComputeSubgraph__TraversalEvent_boolean(), theEasyflowPackage.getmxICell(), "computeSubgraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__GenerateWorkflowForExecutionSystem__mxICell_IExecutionSystem(), ecorePackage.getEBoolean(), "generateWorkflowForExecutionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExecutionPackage.getIExecutionSystem(), "executionSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__ResolveToolDependencies__mxICell_Catalog(), ecorePackage.getEBoolean(), "resolveToolDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getCatalog(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getNoValidInOutDataException());

		op = initEOperation(getGraph__ResolvePreprocessingTask__mxICell_mxICell(), ecorePackage.getEBoolean(), "resolvePreprocessingTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		initEOperation(getGraph__FindCellsWherePreprocessingIsRequired(), theMapsPackage.getCellToCellListMap(), "findCellsWherePreprocessingIsRequired", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__FindCellsWithUntranslatedDataLinks(), theMapsPackage.getCellToCellListMap(), "findCellsWithUntranslatedDataLinks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__ResolveEdge__EMap(), ecorePackage.getEBoolean(), "resolveEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getCellToCellListMap(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getTaskNotFoundException());
		addEException(op, theEasyflowPackage.getDataLinkNotFoundException());
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());
		addEException(op, theEasyflowPackage.getToolNotFoundException());
		addEException(op, theEasyflowPackage.getUtilityTaskNotFoundException());

		op = initEOperation(getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_GroupingInstance(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__ApplyTraversalEvent__mxICell_TraversalEvent_String_EList(), null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_GroupingInstance(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__ApplyTraversalEventCopyGraph__mxICell_TraversalEvent_EList(), theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetadataPackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__ResolveTraversalEvents__mxICell(), ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getCellNotFoundException());
		addEException(op, theEasyflowPackage.getTaskNotFoundException());

		op = initEOperation(getGraph__ResetFlag__int(), null, "resetFlag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "mask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__ResetFlags(), null, "resetFlags", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__GetGroupingInstances__TraversalEvent(), theMetadataPackage.getGroupingInstance(), "getGroupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getGroupingCriterionInstanceNotFoundException());

		initEOperation(getGraph__Init(), ecorePackage.getEBoolean(), "init", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //JgraphxPackageImpl
