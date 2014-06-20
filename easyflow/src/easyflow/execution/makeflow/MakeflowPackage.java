/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution.makeflow;

import easyflow.execution.ExecutionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see easyflow.execution.makeflow.MakeflowFactory
 * @model kind="package"
 * @generated
 */
public interface MakeflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "makeflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/thiema/easyflow/execution/makeflow/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "easyflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MakeflowPackage eINSTANCE = easyflow.execution.makeflow.impl.MakeflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link easyflow.execution.makeflow.impl.MakeflowImpl <em>Makeflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see easyflow.execution.makeflow.impl.MakeflowImpl
	 * @see easyflow.execution.makeflow.impl.MakeflowPackageImpl#getMakeflow()
	 * @generated
	 */
	int MAKEFLOW = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW__PROJECT = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW__LOGGER = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW__WRITER = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Makeflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW_FEATURE_COUNT = ExecutionPackage.IEXECUTION_SYSTEM_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Get Jgraphx Visitor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___GET_JGRAPHX_VISITOR = ExecutionPackage.IEXECUTION_SYSTEM___GET_JGRAPHX_VISITOR;

	/**
	 * The operation id for the '<em>Create Command Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___CREATE_COMMAND_LINE__STRING_TASK = ExecutionPackage.IEXECUTION_SYSTEM___CREATE_COMMAND_LINE__STRING_TASK;

	/**
	 * The operation id for the '<em>Create Command Line</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___CREATE_COMMAND_LINE__STRING_TOOL = ExecutionPackage.IEXECUTION_SYSTEM___CREATE_COMMAND_LINE__STRING_TOOL;

	/**
	 * The operation id for the '<em>Get Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___GET_DEPENDENCIES__TOOL = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Targets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___GET_TARGETS__TOOL = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW___CREATE_RULE = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Makeflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKEFLOW_OPERATION_COUNT = ExecutionPackage.IEXECUTION_SYSTEM_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link easyflow.execution.makeflow.Makeflow <em>Makeflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Makeflow</em>'.
	 * @see easyflow.execution.makeflow.Makeflow
	 * @generated
	 */
	EClass getMakeflow();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.makeflow.Makeflow#getDependencies(easyflow.tool.Tool) <em>Get Dependencies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dependencies</em>' operation.
	 * @see easyflow.execution.makeflow.Makeflow#getDependencies(easyflow.tool.Tool)
	 * @generated
	 */
	EOperation getMakeflow__GetDependencies__Tool();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.makeflow.Makeflow#getTargets(easyflow.tool.Tool) <em>Get Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Targets</em>' operation.
	 * @see easyflow.execution.makeflow.Makeflow#getTargets(easyflow.tool.Tool)
	 * @generated
	 */
	EOperation getMakeflow__GetTargets__Tool();

	/**
	 * Returns the meta object for the '{@link easyflow.execution.makeflow.Makeflow#createRule() <em>Create Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rule</em>' operation.
	 * @see easyflow.execution.makeflow.Makeflow#createRule()
	 * @generated
	 */
	EOperation getMakeflow__CreateRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MakeflowFactory getMakeflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link easyflow.execution.makeflow.impl.MakeflowImpl <em>Makeflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see easyflow.execution.makeflow.impl.MakeflowImpl
		 * @see easyflow.execution.makeflow.impl.MakeflowPackageImpl#getMakeflow()
		 * @generated
		 */
		EClass MAKEFLOW = eINSTANCE.getMakeflow();
		/**
		 * The meta object literal for the '<em><b>Get Dependencies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKEFLOW___GET_DEPENDENCIES__TOOL = eINSTANCE.getMakeflow__GetDependencies__Tool();
		/**
		 * The meta object literal for the '<em><b>Get Targets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKEFLOW___GET_TARGETS__TOOL = eINSTANCE.getMakeflow__GetTargets__Tool();
		/**
		 * The meta object literal for the '<em><b>Create Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAKEFLOW___CREATE_RULE = eINSTANCE.getMakeflow__CreateRule();

	}

} //MakeflowPackage
