/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool.impl;

import easyflow.tool.Command;
import easyflow.tool.DataFormat;
import easyflow.tool.DataPort;
import easyflow.tool.DefaultToolElement;
import easyflow.tool.Interpreter;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;
import easyflow.tool.ToolDefinitions;
import easyflow.tool.ToolFactory;
import easyflow.tool.ToolPackage;
import easyflow.tool.ToolSchemata;
import easyflow.tool.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolFactoryImpl extends EFactoryImpl implements ToolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToolFactory init() {
		try {
			ToolFactory theToolFactory = (ToolFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/tool/1.0.0"); 
			if (theToolFactory != null) {
				return theToolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToolPackage.TOOL_SCHEMATA: return createToolSchemata();
			case ToolPackage.TOOL_DEFINITIONS: return createToolDefinitions();
			case ToolPackage.TOOL: return createTool();
			case ToolPackage.DEFAULT_TOOL_ELEMENT: return createDefaultToolElement();
			case ToolPackage.INTERPRETER: return createInterpreter();
			case ToolPackage.COMMAND: return createCommand();
			case ToolPackage.PARAMETER: return createParameter();
			case ToolPackage.PACKAGE: return createPackage();
			case ToolPackage.DATA_PORT: return createDataPort();
			case ToolPackage.DATA_FORMAT: return createDataFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolSchemata createToolSchemata() {
		ToolSchemataImpl toolSchemata = new ToolSchemataImpl();
		return toolSchemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinitions createToolDefinitions() {
		ToolDefinitionsImpl toolDefinitions = new ToolDefinitionsImpl();
		return toolDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultToolElement createDefaultToolElement() {
		DefaultToolElementImpl defaultToolElement = new DefaultToolElementImpl();
		return defaultToolElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interpreter createInterpreter() {
		InterpreterImpl interpreter = new InterpreterImpl();
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public easyflow.tool.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormat createDataFormat() {
		DataFormatImpl dataFormat = new DataFormatImpl();
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolPackage getToolPackage() {
		return (ToolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToolPackage getPackage() {
		return ToolPackage.eINSTANCE;
	}

} //ToolFactoryImpl
