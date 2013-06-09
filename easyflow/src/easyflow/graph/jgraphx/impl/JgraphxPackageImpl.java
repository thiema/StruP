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

import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.Util;

import easyflow.impl.EasyflowPackageImpl;

import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.dataformat.DataformatPackage;

import easyflow.sequencing.dataformat.impl.DataformatPackageImpl;

import easyflow.sequencing.grouping.GroupingPackage;

import easyflow.sequencing.grouping.impl.GroupingPackageImpl;

import easyflow.sequencing.impl.SequencingPackageImpl;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

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
		SequencingPackageImpl theSequencingPackage = (SequencingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) instanceof SequencingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) : SequencingPackage.eINSTANCE);
		GroupingPackageImpl theGroupingPackage = (GroupingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) instanceof GroupingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) : GroupingPackage.eINSTANCE);
		DataformatPackageImpl theDataformatPackage = (DataformatPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) instanceof DataformatPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) : DataformatPackage.eINSTANCE);

		// Create package meta-data objects
		theJgraphxPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
		theSequencingPackage.createPackageContents();
		theGroupingPackage.createPackageContents();
		theDataformatPackage.createPackageContents();

		// Initialize created meta-data
		theJgraphxPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theSequencingPackage.initializePackageContents();
		theGroupingPackage.initializePackageContents();
		theDataformatPackage.initializePackageContents();

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
	public EReference getUtil_DepricatedTasks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_MostProcessedTasks() {
		return (EReference)utilEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_MetaData() {
		return (EReference)utilEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtil_DefaultRootCell() {
		return (EAttribute)utilEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_ProcessedEdgesCopyGraph() {
		return (EReference)utilEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_ProcessedEdges() {
		return (EReference)utilEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_AddEdges() {
		return (EReference)utilEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtil_CopiedCells() {
		return (EReference)utilEClass.getEStructuralFeatures().get(11);
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
		createEReference(utilEClass, UTIL__DEPRICATED_TASKS);
		createEReference(utilEClass, UTIL__MOST_PROCESSED_TASKS);
		createEReference(utilEClass, UTIL__META_DATA);
		createEAttribute(utilEClass, UTIL__DEFAULT_ROOT_CELL);
		createEReference(utilEClass, UTIL__PROCESSED_EDGES_COPY_GRAPH);
		createEReference(utilEClass, UTIL__PROCESSED_EDGES);
		createEReference(utilEClass, UTIL__ADD_EDGES);
		createEReference(utilEClass, UTIL__COPIED_CELLS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(utilEClass, Util.class, "Util", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtil_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Util.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_Graph(), theEasyflowPackage.getEasyFlowGraph(), "graph", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_Tasks(), theCorePackage.getStringToTaskMap(), null, "tasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_Cells(), theCorePackage.getStringToGraphCellMap(), null, "cells", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_DepricatedTasks(), theCorePackage.getStringToStringMap(), null, "depricatedTasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_MostProcessedTasks(), theCorePackage.getStringToStringMap(), null, "mostProcessedTasks", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_MetaData(), theCorePackage.getDefaultMetaData(), null, "metaData", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtil_DefaultRootCell(), theEasyflowPackage.getmxICell(), "defaultRootCell", null, 0, 1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_ProcessedEdgesCopyGraph(), theCorePackage.getStringToStringMap(), null, "processedEdgesCopyGraph", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_ProcessedEdges(), theCorePackage.getStringToStringMap(), null, "processedEdges", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_AddEdges(), theCorePackage.getStringToStringMap(), null, "addEdges", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtil_CopiedCells(), theCorePackage.getStringToGraphCellMap(), null, "copiedCells", null, 0, -1, Util.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(utilEClass, ecorePackage.getEBoolean(), "resolveTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theEasyflowPackage.getmxICell(), "computeSubgraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theCorePackage.getTraversalEvent(), "getNewTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, null, "applyTraversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "instanceStr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getGroupingInstance(), "groupingInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theEasyflowPackage.getmxICell(), "applyTraversalEventCopyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getGroupingInstance(), "groupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, null, "printGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theCorePackage.getTraversalEvent(), "getTraversalEvents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theEasyflowPackage.getmxICell(), "getCells", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTask(), "tasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, ecorePackage.getEBoolean(), "removeSubGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getmxICell(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingStr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(utilEClass, theCorePackage.getGroupingInstance(), "getGroupingInstances", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getTraversalEvent(), "traversalEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(utilEClass, null, "resetFlags", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //JgraphxPackageImpl
