/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

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
import easyflow.tool.BaseCommand;
import easyflow.tool.Command;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.DocumentProperties;
import easyflow.tool.IToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.Key;
import easyflow.tool.OptionValue;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolFactory;
import easyflow.tool.ToolPackage;
import easyflow.tool.ToolSchemata;
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
public class ToolPackageImpl extends EPackageImpl implements ToolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolSchemataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iToolElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultToolElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvedParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inOutParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseCommandEClass = null;

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
	 * @see easyflow.tool.ToolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolPackageImpl() {
		super(eNS_URI, ToolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolPackage init() {
		if (isInited) return (ToolPackage)EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);

		// Obtain or create and register package
		ToolPackageImpl theToolPackage = (ToolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToolPackageImpl());

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
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) instanceof MetadataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI) : MetadataPackage.eINSTANCE);
		TraversalPackageImpl theTraversalPackage = (TraversalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) instanceof TraversalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) : TraversalPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theToolPackage.createPackageContents();
		theEasyflowPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theUiPackage.createPackageContents();
		theJgraphxPackage.createPackageContents();
		theExamplePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		thePegasusPackage.createPackageContents();
		theShellPackage.createPackageContents();
		theMakeflowPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theTraversalPackage.createPackageContents();
		theMapsPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theToolPackage.initializePackageContents();
		theEasyflowPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theJgraphxPackage.initializePackageContents();
		theExamplePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		thePegasusPackage.initializePackageContents();
		theShellPackage.initializePackageContents();
		theMakeflowPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theTraversalPackage.initializePackageContents();
		theMapsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolPackage.eNS_URI, theToolPackage);
		return theToolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolSchemata() {
		return toolSchemataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolSchemata_Schemata() {
		return (EReference)toolSchemataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolSchemata_SchemataURI() {
		return (EReference)toolSchemataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolSchemata_Logger() {
		return (EAttribute)toolSchemataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolSchemata__ReadSchema__URI_boolean() {
		return toolSchemataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolSchemata__ReadSchemata__EList_boolean() {
		return toolSchemataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolSchemata__GetDefaultSchema() {
		return toolSchemataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolSchemata__GetSchemaFor__Document() {
		return toolSchemataEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolDefinitions() {
		return toolDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolDefinitions_ToolDefinitions() {
		return (EAttribute)toolDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDefinitions_ToolSchemata() {
		return (EReference)toolDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolDefinitions_Logger() {
		return (EAttribute)toolDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolDefinitions_Properties() {
		return (EReference)toolDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToolDefinitions__ValidateToolDefinition__URI_boolean() {
		return toolDefinitionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIToolElement() {
		return iToolElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultToolElement() {
		return defaultToolElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultToolElement_Name() {
		return (EAttribute)defaultToolElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultToolElement_Description() {
		return (EAttribute)defaultToolElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Logger() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Id() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Version() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Package() {
		return (EReference)toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Requirements() {
		return (EReference)toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Executables() {
		return (EReference)toolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Data() {
		return (EReference)toolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_FilenamePrefix() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_AnalysisType() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Command() {
		return (EReference)toolEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_ResolvedParams() {
		return (EReference)toolEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Root() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__WriteModelToXML() {
		return toolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanFilterInstancesFor__DataPort() {
		return toolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__RequiresGrouping__String_DataPort() {
		return toolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__ProvidesGrouping__String_DataPort() {
		return toolEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetGroupingsForInputPort__DataPort_boolean() {
		return toolEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetGroupingsForOutputPort__DataPort_boolean() {
		return toolEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetAnalysisTypeOfPackage__EList() {
		return toolEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetDataForParam__Parameter_EMap() {
		return toolEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetTemplateParameter() {
		return toolEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__AssumeDataParamPositional() {
		return toolEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__OmitPrefixIfNoArgKey() {
		return toolEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetCmdPartDelimiter() {
		return toolEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetInterpreterParams() {
		return toolEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetExe() {
		return toolEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetModuleParams() {
		return toolEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__GetInterpreter() {
		return toolEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProvideMultipleInputsFor__DataPort() {
		return toolEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProvideMultipleInstancesFor__DataPort() {
		return toolEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProvideMultipleInstancesPerInputFor__DataPort() {
		return toolEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProcessMultipleInputsFor__DataPort() {
		return toolEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProcessMultipleInstancesPerInputFor__DataPort() {
		return toolEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__CanProcessMultipleInstancesFor__DataPort() {
		return toolEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProcessMultipleInstancesPerInputFor__DataPort() {
		return toolEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProcessMultipleInstancesFor__DataPort() {
		return toolEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProcessMultipleInputsFor__DataPort() {
		return toolEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProvideMultipleInstancesPerInputFor__DataPort() {
		return toolEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProvideMultipleInstancesFor__DataPort() {
		return toolEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTool__SetProvideMultipleInputsFor__DataPort() {
		return toolEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Executable() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Logger() {
		return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_ResolvedParams() {
		return (EReference)commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__GetPositionalParameterNames() {
		return commandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__GetOptionalParameterNames() {
		return commandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__GetInterperter() {
		return commandEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__GetExe() {
		return commandEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolvedParam() {
		return resolvedParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedParam_Parameter() {
		return (EReference)resolvedParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolvedParam_Value() {
		return (EAttribute)resolvedParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResolvedParam__GenerateCommandString__EMap_Parameter() {
		return resolvedParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResolvedParam__GetArgValue() {
		return resolvedParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Logger() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Optional() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Multiple() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MultipleValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ValueType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Prefix() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_OptionKey() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Delimiter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ValueDelimiter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Keys() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Named() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Label() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Help() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MinOcc() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MaxOcc() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Advanced() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Values() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_OptionValues() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Positional() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Grouping() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DataDeprecated() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_FixedArgValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Parent() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Handles() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_GeneralValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Output() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DataParam() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_CmdPart() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MultipleInstances() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MultipleInstancesPerInput() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetArgKey__String() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetArgDelimiter__String() {
		return parameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetArgValueDelimiter__String() {
		return parameterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetPrefix__String() {
		return parameterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetParameterForAnalysisType__EList() {
		return parameterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsAnalysisType() {
		return parameterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetSupportedHandles__boolean() {
		return parameterEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetEffectiveParentParameter__boolean() {
		return parameterEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GetEffectiveParameters__EList() {
		return parameterEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateCommandStringURI__EMap_EList_Parameter() {
		return parameterEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateCommandString__EMap_EList_Parameter() {
		return parameterEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateCommandString__EMap_Object_Parameter() {
		return parameterEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateCommandString__EMap_OptionValue_Parameter() {
		return parameterEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__GenerateCommandString__EMap_URI_Parameter() {
		return parameterEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsOptional__Boolean() {
		return parameterEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsMultiple__Boolean() {
		return parameterEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsMultipleInstances__Boolean() {
		return parameterEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsMultipleInstancesPerInput__Boolean() {
		return parameterEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsNamed__Boolean() {
		return parameterEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsPositional__Boolean() {
		return parameterEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsFixedArgValue__Boolean() {
		return parameterEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__IsMultipleValue__Boolean() {
		return parameterEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInOutParameter() {
		return inOutParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInOutParameter_Formats() {
		return (EAttribute)inOutParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ResolvedParams() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Id() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetInterpreter() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetExe() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetInterpreterParams() {
		return packageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Value() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Delimiter() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Prefix() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Type() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKey__ResolveArgKey__String() {
		return keyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Type() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Version() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Value() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProperties() {
		return documentPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentProperties_SourceURI() {
		return (EAttribute)documentPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentProperties_FromJar() {
		return (EAttribute)documentPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionValue() {
		return optionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionValue_Condition() {
		return (EAttribute)optionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionValue_Help() {
		return (EAttribute)optionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionValue_Exe() {
		return (EAttribute)optionValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionValue__ResolveValue() {
		return optionValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseCommand() {
		return baseCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCommand_CommandPattern() {
		return (EAttribute)baseCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseCommand_TemplateParam() {
		return (EReference)baseCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCommand_AssumeDataParamPositional() {
		return (EAttribute)baseCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCommand_CmdPartDelimiter() {
		return (EAttribute)baseCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolFactory getToolFactory() {
		return (ToolFactory)getEFactoryInstance();
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
		toolSchemataEClass = createEClass(TOOL_SCHEMATA);
		createEReference(toolSchemataEClass, TOOL_SCHEMATA__SCHEMATA);
		createEReference(toolSchemataEClass, TOOL_SCHEMATA__SCHEMATA_URI);
		createEAttribute(toolSchemataEClass, TOOL_SCHEMATA__LOGGER);
		createEOperation(toolSchemataEClass, TOOL_SCHEMATA___READ_SCHEMA__URI_BOOLEAN);
		createEOperation(toolSchemataEClass, TOOL_SCHEMATA___READ_SCHEMATA__ELIST_BOOLEAN);
		createEOperation(toolSchemataEClass, TOOL_SCHEMATA___GET_DEFAULT_SCHEMA);
		createEOperation(toolSchemataEClass, TOOL_SCHEMATA___GET_SCHEMA_FOR__DOCUMENT);

		toolDefinitionsEClass = createEClass(TOOL_DEFINITIONS);
		createEAttribute(toolDefinitionsEClass, TOOL_DEFINITIONS__TOOL_DEFINITIONS);
		createEReference(toolDefinitionsEClass, TOOL_DEFINITIONS__TOOL_SCHEMATA);
		createEAttribute(toolDefinitionsEClass, TOOL_DEFINITIONS__LOGGER);
		createEReference(toolDefinitionsEClass, TOOL_DEFINITIONS__PROPERTIES);
		createEOperation(toolDefinitionsEClass, TOOL_DEFINITIONS___VALIDATE_TOOL_DEFINITION__URI_BOOLEAN);

		iToolElementEClass = createEClass(ITOOL_ELEMENT);

		defaultToolElementEClass = createEClass(DEFAULT_TOOL_ELEMENT);
		createEAttribute(defaultToolElementEClass, DEFAULT_TOOL_ELEMENT__NAME);
		createEAttribute(defaultToolElementEClass, DEFAULT_TOOL_ELEMENT__DESCRIPTION);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__LOGGER);
		createEAttribute(toolEClass, TOOL__ID);
		createEAttribute(toolEClass, TOOL__VERSION);
		createEReference(toolEClass, TOOL__PACKAGE);
		createEReference(toolEClass, TOOL__REQUIREMENTS);
		createEReference(toolEClass, TOOL__EXECUTABLES);
		createEReference(toolEClass, TOOL__DATA);
		createEAttribute(toolEClass, TOOL__FILENAME_PREFIX);
		createEAttribute(toolEClass, TOOL__ANALYSIS_TYPE);
		createEReference(toolEClass, TOOL__COMMAND);
		createEReference(toolEClass, TOOL__RESOLVED_PARAMS);
		createEAttribute(toolEClass, TOOL__ROOT);
		createEOperation(toolEClass, TOOL___WRITE_MODEL_TO_XML);
		createEOperation(toolEClass, TOOL___CAN_FILTER_INSTANCES_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___REQUIRES_GROUPING__STRING_DATAPORT);
		createEOperation(toolEClass, TOOL___PROVIDES_GROUPING__STRING_DATAPORT);
		createEOperation(toolEClass, TOOL___GET_GROUPINGS_FOR_INPUT_PORT__DATAPORT_BOOLEAN);
		createEOperation(toolEClass, TOOL___GET_GROUPINGS_FOR_OUTPUT_PORT__DATAPORT_BOOLEAN);
		createEOperation(toolEClass, TOOL___GET_ANALYSIS_TYPE_OF_PACKAGE__ELIST);
		createEOperation(toolEClass, TOOL___GET_DATA_FOR_PARAM__PARAMETER_EMAP);
		createEOperation(toolEClass, TOOL___GET_TEMPLATE_PARAMETER);
		createEOperation(toolEClass, TOOL___ASSUME_DATA_PARAM_POSITIONAL);
		createEOperation(toolEClass, TOOL___OMIT_PREFIX_IF_NO_ARG_KEY);
		createEOperation(toolEClass, TOOL___GET_CMD_PART_DELIMITER);
		createEOperation(toolEClass, TOOL___GET_INTERPRETER_PARAMS);
		createEOperation(toolEClass, TOOL___GET_EXE);
		createEOperation(toolEClass, TOOL___GET_MODULE_PARAMS);
		createEOperation(toolEClass, TOOL___GET_INTERPRETER);
		createEOperation(toolEClass, TOOL___CAN_PROVIDE_MULTIPLE_INPUTS_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___CAN_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___CAN_PROCESS_MULTIPLE_INPUTS_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___CAN_PROCESS_MULTIPLE_INSTANCES_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROCESS_MULTIPLE_INSTANCES_PER_INPUT_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROCESS_MULTIPLE_INSTANCES_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROCESS_MULTIPLE_INPUTS_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROVIDE_MULTIPLE_INSTANCES_PER_INPUT_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROVIDE_MULTIPLE_INSTANCES_FOR__DATAPORT);
		createEOperation(toolEClass, TOOL___SET_PROVIDE_MULTIPLE_INPUTS_FOR__DATAPORT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__LOGGER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__VALUES);
		createEReference(parameterEClass, PARAMETER__OPTION_VALUES);
		createEAttribute(parameterEClass, PARAMETER__OPTIONAL);
		createEAttribute(parameterEClass, PARAMETER__MULTIPLE);
		createEAttribute(parameterEClass, PARAMETER__MULTIPLE_VALUE);
		createEAttribute(parameterEClass, PARAMETER__VALUE_TYPE);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEAttribute(parameterEClass, PARAMETER__PREFIX);
		createEAttribute(parameterEClass, PARAMETER__OPTION_KEY);
		createEAttribute(parameterEClass, PARAMETER__DELIMITER);
		createEAttribute(parameterEClass, PARAMETER__VALUE_DELIMITER);
		createEReference(parameterEClass, PARAMETER__KEYS);
		createEAttribute(parameterEClass, PARAMETER__NAMED);
		createEAttribute(parameterEClass, PARAMETER__LABEL);
		createEAttribute(parameterEClass, PARAMETER__HELP);
		createEAttribute(parameterEClass, PARAMETER__MIN_OCC);
		createEAttribute(parameterEClass, PARAMETER__MAX_OCC);
		createEAttribute(parameterEClass, PARAMETER__ADVANCED);
		createEAttribute(parameterEClass, PARAMETER__POSITIONAL);
		createEAttribute(parameterEClass, PARAMETER__GROUPING);
		createEReference(parameterEClass, PARAMETER__DATA_DEPRECATED);
		createEAttribute(parameterEClass, PARAMETER__FIXED_ARG_VALUE);
		createEReference(parameterEClass, PARAMETER__PARENT);
		createEAttribute(parameterEClass, PARAMETER__HANDLES);
		createEAttribute(parameterEClass, PARAMETER__GENERAL_VALUE);
		createEAttribute(parameterEClass, PARAMETER__OUTPUT);
		createEAttribute(parameterEClass, PARAMETER__DATA_PARAM);
		createEAttribute(parameterEClass, PARAMETER__CMD_PART);
		createEAttribute(parameterEClass, PARAMETER__MULTIPLE_INSTANCES);
		createEAttribute(parameterEClass, PARAMETER__MULTIPLE_INSTANCES_PER_INPUT);
		createEOperation(parameterEClass, PARAMETER___GET_ARG_KEY__STRING);
		createEOperation(parameterEClass, PARAMETER___GET_ARG_DELIMITER__STRING);
		createEOperation(parameterEClass, PARAMETER___GET_ARG_VALUE_DELIMITER__STRING);
		createEOperation(parameterEClass, PARAMETER___GET_PREFIX__STRING);
		createEOperation(parameterEClass, PARAMETER___GET_PARAMETER_FOR_ANALYSIS_TYPE__ELIST);
		createEOperation(parameterEClass, PARAMETER___IS_ANALYSIS_TYPE);
		createEOperation(parameterEClass, PARAMETER___GET_SUPPORTED_HANDLES__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___GET_EFFECTIVE_PARENT_PARAMETER__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___GET_EFFECTIVE_PARAMETERS__ELIST);
		createEOperation(parameterEClass, PARAMETER___GENERATE_COMMAND_STRING_URI__EMAP_ELIST_PARAMETER);
		createEOperation(parameterEClass, PARAMETER___GENERATE_COMMAND_STRING__EMAP_ELIST_PARAMETER);
		createEOperation(parameterEClass, PARAMETER___GENERATE_COMMAND_STRING__EMAP_OBJECT_PARAMETER);
		createEOperation(parameterEClass, PARAMETER___GENERATE_COMMAND_STRING__EMAP_OPTIONVALUE_PARAMETER);
		createEOperation(parameterEClass, PARAMETER___GENERATE_COMMAND_STRING__EMAP_URI_PARAMETER);
		createEOperation(parameterEClass, PARAMETER___IS_OPTIONAL__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_MULTIPLE__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_MULTIPLE_INSTANCES__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_MULTIPLE_INSTANCES_PER_INPUT__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_NAMED__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_POSITIONAL__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_FIXED_ARG_VALUE__BOOLEAN);
		createEOperation(parameterEClass, PARAMETER___IS_MULTIPLE_VALUE__BOOLEAN);

		inOutParameterEClass = createEClass(IN_OUT_PARAMETER);
		createEAttribute(inOutParameterEClass, IN_OUT_PARAMETER__FORMATS);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__VALUE);
		createEAttribute(keyEClass, KEY__DELIMITER);
		createEAttribute(keyEClass, KEY__PREFIX);
		createEAttribute(keyEClass, KEY__TYPE);
		createEOperation(keyEClass, KEY___RESOLVE_ARG_KEY__STRING);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__TYPE);
		createEAttribute(requirementEClass, REQUIREMENT__VERSION);
		createEAttribute(requirementEClass, REQUIREMENT__VALUE);

		documentPropertiesEClass = createEClass(DOCUMENT_PROPERTIES);
		createEAttribute(documentPropertiesEClass, DOCUMENT_PROPERTIES__SOURCE_URI);
		createEAttribute(documentPropertiesEClass, DOCUMENT_PROPERTIES__FROM_JAR);

		optionValueEClass = createEClass(OPTION_VALUE);
		createEAttribute(optionValueEClass, OPTION_VALUE__CONDITION);
		createEAttribute(optionValueEClass, OPTION_VALUE__HELP);
		createEAttribute(optionValueEClass, OPTION_VALUE__EXE);
		createEOperation(optionValueEClass, OPTION_VALUE___RESOLVE_VALUE);

		baseCommandEClass = createEClass(BASE_COMMAND);
		createEAttribute(baseCommandEClass, BASE_COMMAND__COMMAND_PATTERN);
		createEReference(baseCommandEClass, BASE_COMMAND__TEMPLATE_PARAM);
		createEAttribute(baseCommandEClass, BASE_COMMAND__ASSUME_DATA_PARAM_POSITIONAL);
		createEAttribute(baseCommandEClass, BASE_COMMAND__CMD_PART_DELIMITER);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__RESOLVED_PARAMS);
		createEAttribute(packageEClass, PACKAGE__ID);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEOperation(packageEClass, PACKAGE___GET_INTERPRETER);
		createEOperation(packageEClass, PACKAGE___GET_EXE);
		createEOperation(packageEClass, PACKAGE___GET_INTERPRETER_PARAMS);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__EXECUTABLE);
		createEAttribute(commandEClass, COMMAND__LOGGER);
		createEReference(commandEClass, COMMAND__RESOLVED_PARAMS);
		createEOperation(commandEClass, COMMAND___GET_POSITIONAL_PARAMETER_NAMES);
		createEOperation(commandEClass, COMMAND___GET_OPTIONAL_PARAMETER_NAMES);
		createEOperation(commandEClass, COMMAND___GET_INTERPERTER);
		createEOperation(commandEClass, COMMAND___GET_EXE);

		resolvedParamEClass = createEClass(RESOLVED_PARAM);
		createEReference(resolvedParamEClass, RESOLVED_PARAM__PARAMETER);
		createEAttribute(resolvedParamEClass, RESOLVED_PARAM__VALUE);
		createEOperation(resolvedParamEClass, RESOLVED_PARAM___GENERATE_COMMAND_STRING__EMAP_PARAMETER);
		createEOperation(resolvedParamEClass, RESOLVED_PARAM___GET_ARG_VALUE);
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
		MapsPackage theMapsPackage = (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);
		EasyflowPackage theEasyflowPackage = (EasyflowPackage)EPackage.Registry.INSTANCE.getEPackage(EasyflowPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		TraversalPackage theTraversalPackage = (TraversalPackage)EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toolEClass.getESuperTypes().add(this.getIToolElement());
		toolEClass.getESuperTypes().add(this.getDefaultToolElement());
		parameterEClass.getESuperTypes().add(this.getIToolElement());
		parameterEClass.getESuperTypes().add(this.getDefaultToolElement());
		inOutParameterEClass.getESuperTypes().add(this.getParameter());
		keyEClass.getESuperTypes().add(this.getDefaultToolElement());
		requirementEClass.getESuperTypes().add(this.getDefaultToolElement());
		optionValueEClass.getESuperTypes().add(this.getDefaultToolElement());
		packageEClass.getESuperTypes().add(this.getIToolElement());
		packageEClass.getESuperTypes().add(this.getDefaultToolElement());
		packageEClass.getESuperTypes().add(this.getBaseCommand());
		commandEClass.getESuperTypes().add(this.getIToolElement());
		commandEClass.getESuperTypes().add(this.getDefaultToolElement());
		commandEClass.getESuperTypes().add(this.getBaseCommand());
		resolvedParamEClass.getESuperTypes().add(this.getDefaultToolElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(toolSchemataEClass, ToolSchemata.class, "ToolSchemata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolSchemata_Schemata(), theMapsPackage.getStringToSchemaMap(), null, "schemata", null, 0, -1, ToolSchemata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolSchemata_SchemataURI(), theMapsPackage.getStringToURIMap(), null, "schemataURI", null, 0, -1, ToolSchemata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolSchemata_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolSchemata.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getToolSchemata__ReadSchema__URI_boolean(), theEasyflowPackage.getSchema(), "readSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xsdSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		op = initEOperation(getToolSchemata__ReadSchemata__EList_boolean(), theEasyflowPackage.getSchema(), "readSchemata", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xsdSource", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		initEOperation(getToolSchemata__GetDefaultSchema(), theEasyflowPackage.getSchema(), "getDefaultSchema", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getToolSchemata__GetSchemaFor__Document(), theEasyflowPackage.getSchema(), "getSchemaFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toolDefinitionsEClass, ToolDefinitions.class, "ToolDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolDefinitions_ToolDefinitions(), theEasyflowPackage.getDocument(), "toolDefinitions", null, 0, -1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDefinitions_ToolSchemata(), this.getToolSchemata(), null, "toolSchemata", null, 0, 1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolDefinitions_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolDefinitions.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDefinitions_Properties(), theMapsPackage.getStringToDocumentPropertiesMap(), null, "properties", null, 0, -1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getToolDefinitions__ValidateToolDefinition__URI_boolean(), ecorePackage.getEBoolean(), "validateToolDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xmlSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		initEClass(iToolElementEClass, IToolElement.class, "IToolElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultToolElementEClass, DefaultToolElement.class, "DefaultToolElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultToolElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefaultToolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultToolElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DefaultToolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Tool.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Version(), ecorePackage.getEString(), "version", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Package(), this.getPackage(), null, "package", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Executables(), theMapsPackage.getStringToURIMap(), null, "executables", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Data(), theMapsPackage.getStringToDataListMap(), null, "data", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_FilenamePrefix(), ecorePackage.getEString(), "filenamePrefix", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_AnalysisType(), ecorePackage.getEString(), "analysisType", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Command(), this.getCommand(), null, "command", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_ResolvedParams(), theMapsPackage.getStringToResolvedParamMap(), null, "resolvedParams", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTool__WriteModelToXML(), null, "writeModelToXML", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__CanFilterInstancesFor__DataPort(), ecorePackage.getEBoolean(), "canFilterInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__RequiresGrouping__String_DataPort(), ecorePackage.getEBoolean(), "requiresGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__ProvidesGrouping__String_DataPort(), ecorePackage.getEBoolean(), "providesGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__GetGroupingsForInputPort__DataPort_boolean(), ecorePackage.getEString(), "getGroupingsForInputPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__GetGroupingsForOutputPort__DataPort_boolean(), ecorePackage.getEString(), "getGroupingsForOutputPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__GetAnalysisTypeOfPackage__EList(), theEasyflowPackage.getTuple(), "getAnalysisTypeOfPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "records", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__GetDataForParam__Parameter_EMap(), theDataPackage.getData(), "getDataForParam", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToStringMap(), "constraints", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetTemplateParameter(), this.getParameter(), "getTemplateParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__AssumeDataParamPositional(), ecorePackage.getEBoolean(), "assumeDataParamPositional", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__OmitPrefixIfNoArgKey(), ecorePackage.getEBoolean(), "omitPrefixIfNoArgKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetCmdPartDelimiter(), ecorePackage.getEString(), "getCmdPartDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetInterpreterParams(), theMapsPackage.getStringToResolvedParamMap(), "getInterpreterParams", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetExe(), this.getResolvedParam(), "getExe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetModuleParams(), theMapsPackage.getStringToResolvedParamMap(), "getModuleParams", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTool__GetInterpreter(), this.getResolvedParam(), "getInterpreter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTool__CanProvideMultipleInputsFor__DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__CanProvideMultipleInstancesFor__DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__CanProvideMultipleInstancesPerInputFor__DataPort(), ecorePackage.getEBoolean(), "canProvideMultipleInstancesPerInputFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__CanProcessMultipleInputsFor__DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__CanProcessMultipleInstancesPerInputFor__DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInstancesPerInputFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__CanProcessMultipleInstancesFor__DataPort(), ecorePackage.getEBoolean(), "canProcessMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProcessMultipleInstancesPerInputFor__DataPort(), null, "setProcessMultipleInstancesPerInputFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProcessMultipleInstancesFor__DataPort(), null, "setProcessMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProcessMultipleInputsFor__DataPort(), null, "setProcessMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProvideMultipleInstancesPerInputFor__DataPort(), null, "setProvideMultipleInstancesPerInputFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProvideMultipleInstancesFor__DataPort(), null, "setProvideMultipleInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = initEOperation(getTool__SetProvideMultipleInputsFor__DataPort(), null, "setProvideMultipleInputsFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Parameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Values(), theMapsPackage.getStringToParameterListMap(), null, "values", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_OptionValues(), this.getOptionValue(), null, "optionValues", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Optional(), ecorePackage.getEBooleanObject(), "optional", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Multiple(), ecorePackage.getEBooleanObject(), "multiple", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MultipleValue(), ecorePackage.getEBooleanObject(), "multipleValue", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Prefix(), ecorePackage.getEString(), "prefix", "", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_OptionKey(), ecorePackage.getEString(), "optionKey", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ValueDelimiter(), ecorePackage.getEString(), "valueDelimiter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Keys(), this.getKey(), null, "keys", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Named(), ecorePackage.getEBooleanObject(), "named", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Help(), ecorePackage.getEString(), "help", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MinOcc(), ecorePackage.getEInt(), "minOcc", "1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MaxOcc(), ecorePackage.getEInt(), "maxOcc", "1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Advanced(), ecorePackage.getEBoolean(), "advanced", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Positional(), ecorePackage.getEBooleanObject(), "positional", "true", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Grouping(), ecorePackage.getEString(), "grouping", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DataDeprecated(), theDataPackage.getData(), null, "dataDeprecated", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_FixedArgValue(), ecorePackage.getEBooleanObject(), "fixedArgValue", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Parent(), this.getParameter(), null, "parent", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Handles(), ecorePackage.getEString(), "handles", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_GeneralValue(), theEasyflowPackage.getObject(), "generalValue", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Output(), ecorePackage.getEBoolean(), "output", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DataParam(), ecorePackage.getEBoolean(), "dataParam", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_CmdPart(), ecorePackage.getEString(), "cmdPart", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MultipleInstances(), ecorePackage.getEBooleanObject(), "multipleInstances", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MultipleInstancesPerInput(), ecorePackage.getEBooleanObject(), "multipleInstancesPerInput", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParameter__GetArgKey__String(), ecorePackage.getEString(), "getArgKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetArgDelimiter__String(), ecorePackage.getEString(), "getArgDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetArgValueDelimiter__String(), ecorePackage.getEString(), "getArgValueDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetPrefix__String(), ecorePackage.getEString(), "getPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetParameterForAnalysisType__EList(), this.getParameter(), "getParameterForAnalysisType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTraversalPackage.getTraversalChunk(), "records", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__IsAnalysisType(), ecorePackage.getEBoolean(), "isAnalysisType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetSupportedHandles__boolean(), ecorePackage.getEString(), "getSupportedHandles", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "applyConfig", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetEffectiveParentParameter__boolean(), this.getParameter(), "getEffectiveParentParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "first", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GetEffectiveParameters__EList(), this.getParameter(), "getEffectiveParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "effectiveParams", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateCommandStringURI__EMap_EList_Parameter(), ecorePackage.getEString(), "generateCommandStringURI", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "value", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateCommandString__EMap_EList_Parameter(), ecorePackage.getEString(), "generateCommandString", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getObject(), "value", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateCommandString__EMap_Object_Parameter(), ecorePackage.getEString(), "generateCommandString", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateCommandString__EMap_OptionValue_Parameter(), ecorePackage.getEString(), "generateCommandString", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionValue(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__GenerateCommandString__EMap_URI_Parameter(), ecorePackage.getEString(), "generateCommandString", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsOptional__Boolean(), ecorePackage.getEBoolean(), "isOptional", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsMultiple__Boolean(), ecorePackage.getEBoolean(), "isMultiple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsMultipleInstances__Boolean(), ecorePackage.getEBoolean(), "isMultipleInstances", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsMultipleInstancesPerInput__Boolean(), ecorePackage.getEBoolean(), "isMultipleInstancesPerInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsNamed__Boolean(), ecorePackage.getEBoolean(), "isNamed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsPositional__Boolean(), ecorePackage.getEBoolean(), "isPositional", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsFixedArgValue__Boolean(), ecorePackage.getEBoolean(), "isFixedArgValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__IsMultipleValue__Boolean(), ecorePackage.getEBoolean(), "isMultipleValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inOutParameterEClass, InOutParameter.class, "InOutParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInOutParameter_Formats(), ecorePackage.getEString(), "formats", null, 0, -1, InOutParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Value(), ecorePackage.getEString(), "value", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Type(), ecorePackage.getEString(), "type", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getKey__ResolveArgKey__String(), ecorePackage.getEString(), "resolveArgKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Type(), ecorePackage.getEString(), "type", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Version(), ecorePackage.getEString(), "version", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Value(), ecorePackage.getEString(), "value", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentPropertiesEClass, DocumentProperties.class, "DocumentProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentProperties_SourceURI(), theEasyflowPackage.getURI(), "sourceURI", null, 0, 1, DocumentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentProperties_FromJar(), ecorePackage.getEBoolean(), "fromJar", "false", 0, 1, DocumentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionValueEClass, OptionValue.class, "OptionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionValue_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, OptionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionValue_Help(), ecorePackage.getEString(), "help", null, 0, 1, OptionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionValue_Exe(), ecorePackage.getEString(), "exe", null, 0, 1, OptionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptionValue__ResolveValue(), ecorePackage.getEString(), "resolveValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(baseCommandEClass, BaseCommand.class, "BaseCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseCommand_CommandPattern(), ecorePackage.getEString(), "commandPattern", null, 0, 1, BaseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseCommand_TemplateParam(), this.getParameter(), null, "templateParam", null, 0, 1, BaseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCommand_AssumeDataParamPositional(), ecorePackage.getEBooleanObject(), "assumeDataParamPositional", null, 0, 1, BaseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCommand_CmdPartDelimiter(), ecorePackage.getEString(), "cmdPartDelimiter", null, 0, 1, BaseCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, easyflow.tool.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_ResolvedParams(), theMapsPackage.getStringToResolvedParamMap(), null, "resolvedParams", null, 0, -1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Id(), ecorePackage.getEString(), "id", null, 0, 1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 0, 1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPackage__GetInterpreter(), this.getResolvedParam(), "getInterpreter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPackage__GetExe(), this.getResolvedParam(), "getExe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPackage__GetInterpreterParams(), theMapsPackage.getStringToResolvedParamMap(), "getInterpreterParams", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Executable(), ecorePackage.getEBoolean(), "executable", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Command.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_ResolvedParams(), theMapsPackage.getStringToResolvedParamMap(), null, "resolvedParams", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommand__GetPositionalParameterNames(), ecorePackage.getEString(), "getPositionalParameterNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommand__GetOptionalParameterNames(), ecorePackage.getEString(), "getOptionalParameterNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommand__GetInterperter(), this.getResolvedParam(), "getInterperter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommand__GetExe(), this.getResolvedParam(), "getExe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resolvedParamEClass, ResolvedParam.class, "ResolvedParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolvedParam_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, ResolvedParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolvedParam_Value(), theEasyflowPackage.getObject(), "value", null, 0, -1, ResolvedParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResolvedParam__GenerateCommandString__EMap_Parameter(), ecorePackage.getEString(), "generateCommandString", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constraints", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "templateParam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResolvedParam__GetArgValue(), ecorePackage.getEString(), "getArgValue", 0, -1, IS_UNIQUE, IS_ORDERED);
	}

} //ToolPackageImpl
