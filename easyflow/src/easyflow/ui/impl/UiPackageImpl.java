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

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;
import easyflow.impl.EasyflowPackageImpl;

import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.dataformat.DataformatPackage;

import easyflow.sequencing.dataformat.impl.DataformatPackageImpl;

import easyflow.sequencing.grouping.GroupingPackage;

import easyflow.sequencing.grouping.impl.GroupingPackageImpl;

import easyflow.sequencing.impl.SequencingPackageImpl;

import easyflow.ui.DefaultProject;
import easyflow.ui.IProject;
import easyflow.ui.UiFactory;
import easyflow.ui.UiPackage;

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
		SequencingPackageImpl theSequencingPackage = (SequencingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) instanceof SequencingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) : SequencingPackage.eINSTANCE);
		GroupingPackageImpl theGroupingPackage = (GroupingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) instanceof GroupingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) : GroupingPackage.eINSTANCE);
		DataformatPackageImpl theDataformatPackage = (DataformatPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) instanceof DataformatPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) : DataformatPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theSequencingPackage.createPackageContents();
		theGroupingPackage.createPackageContents();
		theDataformatPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theSequencingPackage.initializePackageContents();
		theGroupingPackage.initializePackageContents();
		theDataformatPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();

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
	public EAttribute getDefaultProject_FileName() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(2);
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
	public EReference getDefaultProject_GraphUtil() {
		return (EReference)defaultProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultProject_BasePath() {
		return (EAttribute)defaultProjectEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__FILE_NAME);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__BASE_PATH);
		createEAttribute(defaultProjectEClass, DEFAULT_PROJECT__LOGGER);
		createEReference(defaultProjectEClass, DEFAULT_PROJECT__GRAPH_UTIL);
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
		JgraphxPackage theJgraphxPackage = (JgraphxPackage)EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultProjectEClass.getESuperTypes().add(this.getIProject());

		// Initialize classes and features; add operations and parameters
		initEClass(iProjectEClass, IProject.class, "IProject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProjectEClass, null, "readProjectJson", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "initProject", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "autoSetup", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "applyMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "applyTraversalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, null, "clearWorkflows", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProjectEClass, theCorePackage.getWorkflow(), "getActiveWorkflow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultProjectEClass, DefaultProject.class, "DefaultProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultProject_Workflows(), theCorePackage.getWorkflow(), null, "workflows", null, 0, -1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultProject_MetaData(), theCorePackage.getIMetaData(), null, "metaData", null, 0, -1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultProject_Logger(), theEasyflowPackage.getLogger(), "logger", "", 0, 1, DefaultProject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultProject_GraphUtil(), theJgraphxPackage.getUtil(), null, "graphUtil", null, 0, 1, DefaultProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UiPackageImpl
