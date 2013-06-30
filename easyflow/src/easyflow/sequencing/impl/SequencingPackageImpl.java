/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.impl;

import easyflow.EasyflowPackage;

import easyflow.core.CorePackage;

import easyflow.core.impl.CorePackageImpl;

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;
import easyflow.impl.EasyflowPackageImpl;

import easyflow.sequencing.MetaData;
import easyflow.sequencing.RefBasedProjectMetaData;
import easyflow.sequencing.ResequencingProject;
import easyflow.sequencing.SequencingFactory;
import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.dataformat.DataformatPackage;

import easyflow.sequencing.dataformat.impl.DataformatPackageImpl;

import easyflow.sequencing.grouping.GroupingPackage;

import easyflow.sequencing.grouping.impl.GroupingPackageImpl;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencingPackageImpl extends EPackageImpl implements SequencingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refBasedProjectMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resequencingProjectEClass = null;

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
	 * @see easyflow.sequencing.SequencingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SequencingPackageImpl() {
		super(eNS_URI, SequencingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SequencingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SequencingPackage init() {
		if (isInited) return (SequencingPackage)EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI);

		// Obtain or create and register package
		SequencingPackageImpl theSequencingPackage = (SequencingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SequencingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SequencingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		GroupingPackageImpl theGroupingPackage = (GroupingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) instanceof GroupingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) : GroupingPackage.eINSTANCE);
		DataformatPackageImpl theDataformatPackage = (DataformatPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) instanceof DataformatPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI) : DataformatPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);

		// Create package meta-data objects
		theSequencingPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
		theGroupingPackage.createPackageContents();
		theDataformatPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();

		// Initialize created meta-data
		theSequencingPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theGroupingPackage.initializePackageContents();
		theDataformatPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSequencingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SequencingPackage.eNS_URI, theSequencingPackage);
		return theSequencingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefBasedProjectMetaData() {
		return refBasedProjectMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaData_Samples() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaData_Records() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaData_ReadGroups() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaData_Libraries() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaData_Groups() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResequencingProject() {
		return resequencingProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResequencingProject_RefBasedProjectMetaData() {
		return (EReference)resequencingProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencingFactory getSequencingFactory() {
		return (SequencingFactory)getEFactoryInstance();
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
		refBasedProjectMetaDataEClass = createEClass(REF_BASED_PROJECT_META_DATA);

		metaDataEClass = createEClass(META_DATA);
		createEReference(metaDataEClass, META_DATA__SAMPLES);
		createEReference(metaDataEClass, META_DATA__RECORDS);
		createEReference(metaDataEClass, META_DATA__READ_GROUPS);
		createEReference(metaDataEClass, META_DATA__LIBRARIES);
		createEReference(metaDataEClass, META_DATA__GROUPS);

		resequencingProjectEClass = createEClass(RESEQUENCING_PROJECT);
		createEReference(resequencingProjectEClass, RESEQUENCING_PROJECT__REF_BASED_PROJECT_META_DATA);
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
		GroupingPackage theGroupingPackage = (GroupingPackage)EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI);
		DataformatPackage theDataformatPackage = (DataformatPackage)EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGroupingPackage);
		getESubpackages().add(theDataformatPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		refBasedProjectMetaDataEClass.getESuperTypes().add(theCorePackage.getIProjectMetaData());
		metaDataEClass.getESuperTypes().add(theCorePackage.getIMetaData());
		metaDataEClass.getESuperTypes().add(theCorePackage.getDefaultMetaData());
		resequencingProjectEClass.getESuperTypes().add(theUiPackage.getDefaultProject());

		// Initialize classes and features; add operations and parameters
		initEClass(refBasedProjectMetaDataEClass, RefBasedProjectMetaData.class, "RefBasedProjectMetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaData_Samples(), theGroupingPackage.getStringToSampleMap(), null, "samples", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaData_Records(), theGroupingPackage.getStringToRecordMap(), null, "records", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaData_ReadGroups(), theGroupingPackage.getStringToReadGroupMap(), null, "readGroups", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaData_Libraries(), theGroupingPackage.getStringToLibraryMap(), null, "libraries", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaData_Groups(), theGroupingPackage.getStringToGroupMap(), null, "groups", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resequencingProjectEClass, ResequencingProject.class, "ResequencingProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResequencingProject_RefBasedProjectMetaData(), this.getRefBasedProjectMetaData(), null, "refBasedProjectMetaData", null, 0, -1, ResequencingProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SequencingPackageImpl
