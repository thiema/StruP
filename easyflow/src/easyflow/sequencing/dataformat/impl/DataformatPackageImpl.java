/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.dataformat.impl;

import easyflow.EasyflowPackage;

import easyflow.core.CorePackage;

import easyflow.core.impl.CorePackageImpl;

import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.impl.JgraphxPackageImpl;
import easyflow.impl.EasyflowPackageImpl;

import easyflow.sequencing.SequencingPackage;

import easyflow.sequencing.dataformat.DataFormat;
import easyflow.sequencing.dataformat.DataformatFactory;
import easyflow.sequencing.dataformat.DataformatPackage;

import easyflow.sequencing.grouping.GroupingPackage;

import easyflow.sequencing.grouping.impl.GroupingPackageImpl;

import easyflow.sequencing.impl.SequencingPackageImpl;

import easyflow.ui.UiPackage;

import easyflow.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataformatPackageImpl extends EPackageImpl implements DataformatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataFormatEEnum = null;

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
	 * @see easyflow.sequencing.dataformat.DataformatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataformatPackageImpl() {
		super(eNS_URI, DataformatFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataformatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataformatPackage init() {
		if (isInited) return (DataformatPackage)EPackage.Registry.INSTANCE.getEPackage(DataformatPackage.eNS_URI);

		// Obtain or create and register package
		DataformatPackageImpl theDataformatPackage = (DataformatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataformatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataformatPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EasyflowPackageImpl theEasyflowPackage = (EasyflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) instanceof EasyflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI) : EasyflowPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		SequencingPackageImpl theSequencingPackage = (SequencingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) instanceof SequencingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SequencingPackage.eNS_URI) : SequencingPackage.eINSTANCE);
		GroupingPackageImpl theGroupingPackage = (GroupingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) instanceof GroupingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupingPackage.eNS_URI) : GroupingPackage.eINSTANCE);
		JgraphxPackageImpl theJgraphxPackage = (JgraphxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) instanceof JgraphxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JgraphxPackage.eNS_URI) : JgraphxPackage.eINSTANCE);

		// Create package meta-data objects
		theDataformatPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
		theSequencingPackage.createPackageContents();
		theGroupingPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();

		// Initialize created meta-data
		theDataformatPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theSequencingPackage.initializePackageContents();
		theGroupingPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataformatPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataformatPackage.eNS_URI, theDataformatPackage);
		return theDataformatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataFormat() {
		return dataFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformatFactory getDataformatFactory() {
		return (DataformatFactory)getEFactoryInstance();
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

		// Create enums
		dataFormatEEnum = createEEnum(DATA_FORMAT);
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

		// Initialize enums and add enum literals
		initEEnum(dataFormatEEnum, DataFormat.class, "DataFormat");
		addEEnumLiteral(dataFormatEEnum, DataFormat.FAST_Q);
		addEEnumLiteral(dataFormatEEnum, DataFormat.SAM);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BAM);
		addEEnumLiteral(dataFormatEEnum, DataFormat.BED);
		addEEnumLiteral(dataFormatEEnum, DataFormat.TXT);
		addEEnumLiteral(dataFormatEEnum, DataFormat.CSV);
		addEEnumLiteral(dataFormatEEnum, DataFormat.FAST_A);
	}

} //DataformatPackageImpl
