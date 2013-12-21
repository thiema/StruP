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

import easyflow.tool.Command;
import easyflow.tool.Data;
import easyflow.tool.DataFormat;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.DocumentProperties;
import easyflow.tool.IToolElement;
import easyflow.tool.InOutParameter;
import easyflow.tool.Interpreter;
import easyflow.tool.Key;
import easyflow.tool.Parameter;
import easyflow.tool.Requirement;
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
	private EClass interpreterEClass = null;

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
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormatEClass = null;

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
	public EReference getTool_Interpreter() {
		return (EReference)toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Command() {
		return (EReference)toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Package() {
		return (EReference)toolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Requirements() {
		return (EReference)toolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Executables() {
		return (EReference)toolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Data() {
		return (EReference)toolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpreter() {
		return interpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpreter_Exe() {
		return (EAttribute)interpreterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterpreter_Logger() {
		return (EAttribute)interpreterEClass.getEStructuralFeatures().get(1);
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
	public EReference getCommand_Parameters() {
		return (EReference)commandEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Optional() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Multiple() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MultipleValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ValueType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Prefix() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_OptionKey() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Delimiter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ValueDelimiter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Keys() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Named() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Label() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Help() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MinOcc() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_MaxOcc() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Advanced() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Values() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(19);
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
	public EReference getParameter_Data() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(22);
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
	public EAttribute getInOutParameter_Handles() {
		return (EAttribute)inOutParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInOutParameter_Formats() {
		return (EAttribute)inOutParameterEClass.getEStructuralFeatures().get(1);
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
	public EReference getPackage_Parameters() {
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
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Label() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Port() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Output() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Format() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormat() {
		return dataFormatEClass;
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

		toolDefinitionsEClass = createEClass(TOOL_DEFINITIONS);
		createEAttribute(toolDefinitionsEClass, TOOL_DEFINITIONS__TOOL_DEFINITIONS);
		createEReference(toolDefinitionsEClass, TOOL_DEFINITIONS__TOOL_SCHEMATA);
		createEAttribute(toolDefinitionsEClass, TOOL_DEFINITIONS__LOGGER);
		createEReference(toolDefinitionsEClass, TOOL_DEFINITIONS__PROPERTIES);

		iToolElementEClass = createEClass(ITOOL_ELEMENT);

		defaultToolElementEClass = createEClass(DEFAULT_TOOL_ELEMENT);
		createEAttribute(defaultToolElementEClass, DEFAULT_TOOL_ELEMENT__NAME);
		createEAttribute(defaultToolElementEClass, DEFAULT_TOOL_ELEMENT__DESCRIPTION);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__LOGGER);
		createEAttribute(toolEClass, TOOL__ID);
		createEAttribute(toolEClass, TOOL__VERSION);
		createEReference(toolEClass, TOOL__INTERPRETER);
		createEReference(toolEClass, TOOL__COMMAND);
		createEReference(toolEClass, TOOL__PACKAGE);
		createEReference(toolEClass, TOOL__REQUIREMENTS);
		createEReference(toolEClass, TOOL__EXECUTABLES);
		createEReference(toolEClass, TOOL__DATA);

		interpreterEClass = createEClass(INTERPRETER);
		createEAttribute(interpreterEClass, INTERPRETER__EXE);
		createEAttribute(interpreterEClass, INTERPRETER__LOGGER);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__EXECUTABLE);
		createEAttribute(commandEClass, COMMAND__LOGGER);
		createEReference(commandEClass, COMMAND__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__LOGGER);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
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
		createEReference(parameterEClass, PARAMETER__VALUES);
		createEAttribute(parameterEClass, PARAMETER__POSITIONAL);
		createEAttribute(parameterEClass, PARAMETER__GROUPING);
		createEReference(parameterEClass, PARAMETER__DATA);

		inOutParameterEClass = createEClass(IN_OUT_PARAMETER);
		createEAttribute(inOutParameterEClass, IN_OUT_PARAMETER__HANDLES);
		createEAttribute(inOutParameterEClass, IN_OUT_PARAMETER__FORMATS);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PARAMETERS);
		createEAttribute(packageEClass, PACKAGE__ID);
		createEAttribute(packageEClass, PACKAGE__VERSION);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__LABEL);
		createEReference(dataEClass, DATA__PORT);
		createEAttribute(dataEClass, DATA__OUTPUT);
		createEAttribute(dataEClass, DATA__FORMAT);

		dataFormatEClass = createEClass(DATA_FORMAT);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__VALUE);
		createEAttribute(keyEClass, KEY__DELIMITER);
		createEAttribute(keyEClass, KEY__PREFIX);
		createEAttribute(keyEClass, KEY__TYPE);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__TYPE);
		createEAttribute(requirementEClass, REQUIREMENT__VERSION);
		createEAttribute(requirementEClass, REQUIREMENT__VALUE);

		documentPropertiesEClass = createEClass(DOCUMENT_PROPERTIES);
		createEAttribute(documentPropertiesEClass, DOCUMENT_PROPERTIES__SOURCE_URI);
		createEAttribute(documentPropertiesEClass, DOCUMENT_PROPERTIES__FROM_JAR);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		toolEClass.getESuperTypes().add(this.getIToolElement());
		toolEClass.getESuperTypes().add(this.getDefaultToolElement());
		interpreterEClass.getESuperTypes().add(this.getIToolElement());
		interpreterEClass.getESuperTypes().add(this.getDefaultToolElement());
		commandEClass.getESuperTypes().add(this.getIToolElement());
		commandEClass.getESuperTypes().add(this.getDefaultToolElement());
		parameterEClass.getESuperTypes().add(this.getIToolElement());
		parameterEClass.getESuperTypes().add(this.getDefaultToolElement());
		inOutParameterEClass.getESuperTypes().add(this.getParameter());
		packageEClass.getESuperTypes().add(this.getIToolElement());
		packageEClass.getESuperTypes().add(this.getDefaultToolElement());
		dataEClass.getESuperTypes().add(this.getDefaultToolElement());
		dataFormatEClass.getESuperTypes().add(this.getDefaultToolElement());
		keyEClass.getESuperTypes().add(this.getDefaultToolElement());
		requirementEClass.getESuperTypes().add(this.getDefaultToolElement());

		// Initialize classes and features; add operations and parameters
		initEClass(toolSchemataEClass, ToolSchemata.class, "ToolSchemata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolSchemata_Schemata(), theMapsPackage.getStringToSchemaMap(), null, "schemata", null, 0, -1, ToolSchemata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolSchemata_SchemataURI(), theMapsPackage.getStringToURIMap(), null, "schemataURI", null, 0, -1, ToolSchemata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolSchemata_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolSchemata.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(toolSchemataEClass, theEasyflowPackage.getSchema(), "readSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xsdSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		op = addEOperation(toolSchemataEClass, theEasyflowPackage.getSchema(), "readSchemata", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xsdSource", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		addEOperation(toolSchemataEClass, theEasyflowPackage.getSchema(), "getDefaultSchema", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolSchemataEClass, theEasyflowPackage.getSchema(), "getSchemaFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(toolDefinitionsEClass, ToolDefinitions.class, "ToolDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolDefinitions_ToolDefinitions(), theEasyflowPackage.getDocument(), "toolDefinitions", null, 0, -1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDefinitions_ToolSchemata(), this.getToolSchemata(), null, "toolSchemata", null, 0, 1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolDefinitions_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ToolDefinitions.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolDefinitions_Properties(), theMapsPackage.getStringToDocumentPropertiesMap(), null, "properties", null, 0, -1, ToolDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(toolDefinitionsEClass, ecorePackage.getEBoolean(), "validateToolDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getURI(), "xmlSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isFromJar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getFileNotFoundException());

		initEClass(iToolElementEClass, IToolElement.class, "IToolElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iToolElementEClass, null, "readImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultToolElementEClass, DefaultToolElement.class, "DefaultToolElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultToolElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefaultToolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultToolElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DefaultToolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Tool.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Version(), ecorePackage.getEString(), "version", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Interpreter(), this.getInterpreter(), null, "interpreter", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Command(), this.getCommand(), null, "command", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Package(), this.getPackage(), null, "package", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Executables(), theMapsPackage.getStringToURIMap(), null, "executables", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Data(), theMapsPackage.getStringToDataMap(), null, "data", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(toolEClass, null, "writeModelToXML", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolEClass, ecorePackage.getEBoolean(), "canProcessMultiplesInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = addEOperation(toolEClass, ecorePackage.getEBoolean(), "canFilterInstancesFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getDataPortNotFoundException());

		op = addEOperation(toolEClass, ecorePackage.getEBoolean(), "requiresGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolEClass, ecorePackage.getEBoolean(), "providesGrouping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "groupingCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolEClass, ecorePackage.getEString(), "getGroupingsForInputPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(toolEClass, ecorePackage.getEString(), "getGroupingsForOutputPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interpreterEClass, Interpreter.class, "Interpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterpreter_Exe(), ecorePackage.getEString(), "exe", null, 0, 1, Interpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterpreter_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Interpreter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Executable(), ecorePackage.getEBoolean(), "executable", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Command.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Parameters(), theMapsPackage.getStringToParameterMap(), null, "parameters", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(commandEClass, ecorePackage.getEString(), "generateCommandString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandEClass, ecorePackage.getEBoolean(), "resolvePorts", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(commandEClass, ecorePackage.getEBoolean(), "resolveStaticPorts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, theMapsPackage.getStringToURIMap(), "getInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToChunksMap(), "chunks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, theMapsPackage.getStringToURIMap(), "getOutputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToChunksMap(), "chunks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, theMapsPackage.getStringToURIMap(), "getStaticInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToChunksMap(), "chunks", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, ecorePackage.getEString(), "getGroupingsForDataPort", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "required", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(commandEClass, this.getParameter(), "getParameterForDataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getDataPort(), "dataPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theEasyflowPackage.getParameterNotFoundException());

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, Parameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), theEasyflowPackage.getObject(), "value", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Multiple(), ecorePackage.getEBoolean(), "multiple", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MultipleValue(), ecorePackage.getEBoolean(), "multipleValue", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Prefix(), ecorePackage.getEString(), "prefix", "-", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_OptionKey(), ecorePackage.getEString(), "optionKey", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ValueDelimiter(), ecorePackage.getEString(), "valueDelimiter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Keys(), this.getKey(), null, "keys", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Named(), ecorePackage.getEBoolean(), "named", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Help(), ecorePackage.getEString(), "help", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MinOcc(), ecorePackage.getEInt(), "minOcc", "1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_MaxOcc(), ecorePackage.getEInt(), "maxOcc", "1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Advanced(), ecorePackage.getEBoolean(), "advanced", "false", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Values(), theMapsPackage.getStringToParameterMap(), null, "values", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Positional(), ecorePackage.getEBoolean(), "positional", "true", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Grouping(), ecorePackage.getEString(), "grouping", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Data(), this.getData(), null, "data", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEString(), "generateCommandString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMapsPackage.getStringToObjectMap(), "constaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, ecorePackage.getEString(), "getArgKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, ecorePackage.getEString(), "getArgValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, ecorePackage.getEString(), "getArgDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, ecorePackage.getEString(), "getArgValueDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inOutParameterEClass, InOutParameter.class, "InOutParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInOutParameter_Handles(), ecorePackage.getEString(), "handles", null, 0, -1, InOutParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInOutParameter_Formats(), ecorePackage.getEString(), "formats", null, 0, -1, InOutParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, easyflow.tool.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Parameters(), theMapsPackage.getStringToParameterMap(), null, "parameters", null, 0, -1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Id(), ecorePackage.getEString(), "id", null, 0, 1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 0, 1, easyflow.tool.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Label(), ecorePackage.getEString(), "label", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Port(), theCorePackage.getDataPort(), null, "port", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Output(), ecorePackage.getEBoolean(), "output", "false", 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Format(), ecorePackage.getEString(), "format", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFormatEClass, DataFormat.class, "DataFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Value(), ecorePackage.getEString(), "value", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Type(), ecorePackage.getEString(), "type", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Type(), ecorePackage.getEString(), "type", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Version(), ecorePackage.getEString(), "version", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Value(), ecorePackage.getEString(), "value", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentPropertiesEClass, DocumentProperties.class, "DocumentProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentProperties_SourceURI(), theEasyflowPackage.getURI(), "sourceURI", null, 0, 1, DocumentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentProperties_FromJar(), ecorePackage.getEBoolean(), "fromJar", "false", 0, 1, DocumentProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ToolPackageImpl
