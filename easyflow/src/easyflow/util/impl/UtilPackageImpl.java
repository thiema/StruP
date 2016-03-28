/**
 */
package easyflow.util.impl;

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
import easyflow.traversal.TraversalPackage;
import easyflow.traversal.impl.TraversalPackageImpl;
import easyflow.ui.UiPackage;
import easyflow.ui.impl.UiPackageImpl;
import easyflow.util.Category;
import easyflow.util.ErrorInfo;
import easyflow.util.IReturnValue;
import easyflow.util.LogMessage;
import easyflow.util.LogMsgOutputMode;
import easyflow.util.ReturnValue;
import easyflow.util.ReturnValueBoolean;
import easyflow.util.ReturnValueInteger;
import easyflow.util.Severity;
import easyflow.util.UtilFactory;
import easyflow.util.UtilPackage;
import easyflow.util.maps.MapsPackage;
import easyflow.util.maps.impl.MapsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iReturnValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueIntegerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueBooleanEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorInfoEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logMsgOutputModeEEnum = null;

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
	 * @see easyflow.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

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
		TraversalPackageImpl theTraversalPackage = (TraversalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) instanceof TraversalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraversalPackage.eNS_URI) : TraversalPackage.eINSTANCE);
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI) : MapsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
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
		theTraversalPackage.createPackageContents();
		theMapsPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
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
		theTraversalPackage.initializePackageContents();
		theMapsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReturnValue() {
		return iReturnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReturnValue__IsEmpty() {
		return iReturnValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValue() {
		return returnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValue_Object() {
		return (EAttribute)returnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValueInteger() {
		return returnValueIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValueInteger_Value() {
		return (EAttribute)returnValueIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnValueBoolean() {
		return returnValueBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnValueBoolean_Value() {
		return (EAttribute)returnValueBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessage() {
		return logMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Name() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_LogMsg() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Category() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_HelpMsg() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Logger() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_EList() {
		return logMessageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Severity_EList() {
		return logMessageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_String_EList() {
		return logMessageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Severity_String_EList() {
		return logMessageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_String() {
		return logMessageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Severity_String() {
		return logMessageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_String_String() {
		return logMessageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Severity_String_String() {
		return logMessageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Severity() {
		return logMessageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_Exception_EList() {
		return logMessageEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogMessage__GenerateLogMsg__String_Category_Severity_Exception() {
		return logMessageEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorInfo() {
		return errorInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInfo_Task() {
		return (EReference)errorInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInfo_DataLink() {
		return (EReference)errorInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInfo_DataPort() {
		return (EReference)errorInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfo_Info() {
		return (EAttribute)errorInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfo_Final() {
		return (EAttribute)errorInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfo_Category() {
		return (EAttribute)errorInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfo_Logger() {
		return (EAttribute)errorInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getErrorInfo__Clear() {
		return errorInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getErrorInfo__Print() {
		return errorInfoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategory() {
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogMsgOutputMode() {
		return logMsgOutputModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
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
		iReturnValueEClass = createEClass(IRETURN_VALUE);
		createEOperation(iReturnValueEClass, IRETURN_VALUE___IS_EMPTY);

		returnValueEClass = createEClass(RETURN_VALUE);
		createEAttribute(returnValueEClass, RETURN_VALUE__OBJECT);

		returnValueIntegerEClass = createEClass(RETURN_VALUE_INTEGER);
		createEAttribute(returnValueIntegerEClass, RETURN_VALUE_INTEGER__VALUE);

		returnValueBooleanEClass = createEClass(RETURN_VALUE_BOOLEAN);
		createEAttribute(returnValueBooleanEClass, RETURN_VALUE_BOOLEAN__VALUE);

		logMessageEClass = createEClass(LOG_MESSAGE);
		createEAttribute(logMessageEClass, LOG_MESSAGE__NAME);
		createEAttribute(logMessageEClass, LOG_MESSAGE__LOG_MSG);
		createEAttribute(logMessageEClass, LOG_MESSAGE__CATEGORY);
		createEAttribute(logMessageEClass, LOG_MESSAGE__HELP_MSG);
		createEAttribute(logMessageEClass, LOG_MESSAGE__LOGGER);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_ELIST);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_ELIST);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING_ELIST);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING_ELIST);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_STRING_STRING);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY_STRING_STRING);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_SEVERITY);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_EXCEPTION_ELIST);
		createEOperation(logMessageEClass, LOG_MESSAGE___GENERATE_LOG_MSG__STRING_CATEGORY_SEVERITY_EXCEPTION);

		errorInfoEClass = createEClass(ERROR_INFO);
		createEReference(errorInfoEClass, ERROR_INFO__TASK);
		createEReference(errorInfoEClass, ERROR_INFO__DATA_LINK);
		createEReference(errorInfoEClass, ERROR_INFO__DATA_PORT);
		createEAttribute(errorInfoEClass, ERROR_INFO__INFO);
		createEAttribute(errorInfoEClass, ERROR_INFO__FINAL);
		createEAttribute(errorInfoEClass, ERROR_INFO__CATEGORY);
		createEAttribute(errorInfoEClass, ERROR_INFO__LOGGER);
		createEOperation(errorInfoEClass, ERROR_INFO___CLEAR);
		createEOperation(errorInfoEClass, ERROR_INFO___PRINT);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
		categoryEEnum = createEEnum(CATEGORY);
		logMsgOutputModeEEnum = createEEnum(LOG_MSG_OUTPUT_MODE);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMapsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		returnValueEClass.getESuperTypes().add(this.getIReturnValue());
		returnValueIntegerEClass.getESuperTypes().add(this.getIReturnValue());
		returnValueBooleanEClass.getESuperTypes().add(this.getIReturnValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(iReturnValueEClass, IReturnValue.class, "IReturnValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIReturnValue__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValue_Object(), theEasyflowPackage.getObject(), "object", null, 0, 1, ReturnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValueIntegerEClass, ReturnValueInteger.class, "ReturnValueInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValueInteger_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, ReturnValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnValueBooleanEClass, ReturnValueBoolean.class, "ReturnValueBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnValueBoolean_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, ReturnValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageEClass, LogMessage.class, "LogMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_LogMsg(), ecorePackage.getEString(), "logMsg", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Category(), this.getCategory(), "category", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_HelpMsg(), ecorePackage.getEString(), "helpMsg", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, LogMessage.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_EList(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Severity_EList(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_String_EList(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "helpMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Severity_String_EList(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "helpMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_String(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Severity_String(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_String_String(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "helpMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Severity_String_String(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "helpMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Severity(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_Exception_EList(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getException(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorVar", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogMessage__GenerateLogMsg__String_Category_Severity_Exception(), ecorePackage.getEString(), "generateLogMsg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "errorTpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "category", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeverity(), "severity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEasyflowPackage.getException(), "exception", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(errorInfoEClass, ErrorInfo.class, "ErrorInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorInfo_Task(), theCorePackage.getTask(), null, "task", null, 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorInfo_DataLink(), theDataPackage.getDataLink(), null, "dataLink", null, 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorInfo_DataPort(), theDataPackage.getDataPort(), null, "dataPort", null, 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInfo_Info(), ecorePackage.getEString(), "info", null, 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInfo_Final(), ecorePackage.getEBoolean(), "final", "false", 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInfo_Category(), this.getCategory(), "category", null, 0, 1, ErrorInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInfo_Logger(), theEasyflowPackage.getLogger(), "logger", null, 0, 1, ErrorInfo.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getErrorInfo__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getErrorInfo__Print(), null, "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.FATAL);
		addEEnumLiteral(severityEEnum, Severity.ERROR);
		addEEnumLiteral(severityEEnum, Severity.WARN);
		addEEnumLiteral(severityEEnum, Severity.INFO);
		addEEnumLiteral(severityEEnum, Severity.DEBUG);
		addEEnumLiteral(severityEEnum, Severity.TRACE);

		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.NO_CATEGORY);
		addEEnumLiteral(categoryEEnum, Category.PROJECT_CONFIGURATION);
		addEEnumLiteral(categoryEEnum, Category.METADATA_DEFINITION);
		addEEnumLiteral(categoryEEnum, Category.TASK_DEFINITION);
		addEEnumLiteral(categoryEEnum, Category.TOOL_DEFINITION);
		addEEnumLiteral(categoryEEnum, Category.WORKFLOW);
		addEEnumLiteral(categoryEEnum, Category.WORKFLOW_TEMPLATE_PARSING);
		addEEnumLiteral(categoryEEnum, Category.ABSTRACT_WORKFLOW_GENERATION);
		addEEnumLiteral(categoryEEnum, Category.TRAVERSAL_EVENT_CREATION);
		addEEnumLiteral(categoryEEnum, Category.SUBGRAPH_CREATION);
		addEEnumLiteral(categoryEEnum, Category.TRAVERSAL_EVENT_RESOLUTION);
		addEEnumLiteral(categoryEEnum, Category.DATA_GROUPING);
		addEEnumLiteral(categoryEEnum, Category.PARAMETER_GROUPING);
		addEEnumLiteral(categoryEEnum, Category.UTILITY_TASK_RESOLUTION);
		addEEnumLiteral(categoryEEnum, Category.INCOMPATIBLE_GROUPING_RESOLUTION);
		addEEnumLiteral(categoryEEnum, Category.TOOL_RESOLUTION);
		addEEnumLiteral(categoryEEnum, Category.EXECUTION_WORKFLOW_GENERATION);
		addEEnumLiteral(categoryEEnum, Category.GRAPH_UTIL);
		addEEnumLiteral(categoryEEnum, Category.UTIL);

		initEEnum(logMsgOutputModeEEnum, LogMsgOutputMode.class, "LogMsgOutputMode");
		addEEnumLiteral(logMsgOutputModeEEnum, LogMsgOutputMode.SILENT);
		addEEnumLiteral(logMsgOutputModeEEnum, LogMsgOutputMode.CONSOLE);
		addEEnumLiteral(logMsgOutputModeEEnum, LogMsgOutputMode.GUI);
		addEEnumLiteral(logMsgOutputModeEEnum, LogMsgOutputMode.ALL);
	}

} //UtilPackageImpl
