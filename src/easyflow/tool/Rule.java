/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.core.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Rule#getCmdLine <em>Cmd Line</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getTask <em>Task</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getTargets <em>Targets</em>}</li>
 *   <li>{@link easyflow.tool.Rule#isReadFromPipe <em>Read From Pipe</em>}</li>
 *   <li>{@link easyflow.tool.Rule#isWriteToPipe <em>Write To Pipe</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getInputParams <em>Input Params</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getOutputParams <em>Output Params</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getOptParams <em>Opt Params</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getPosParams <em>Pos Params</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getExe <em>Exe</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getExeParams <em>Exe Params</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getInterpreterParams <em>Interpreter Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends IRule {
	/**
	 * Returns the value of the '<em><b>Cmd Line</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Line</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Line</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_CmdLine()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCmdLine();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_Dependencies()
	 * @model
	 * @generated
	 */
	EList<String> getDependencies();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_Targets()
	 * @model
	 * @generated
	 */
	EList<String> getTargets();

	/**
	 * Returns the value of the '<em><b>Read From Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read From Pipe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read From Pipe</em>' attribute.
	 * @see #setReadFromPipe(boolean)
	 * @see easyflow.tool.ToolPackage#getRule_ReadFromPipe()
	 * @model
	 * @generated
	 */
	boolean isReadFromPipe();

	/**
	 * Sets the value of the '{@link easyflow.tool.Rule#isReadFromPipe <em>Read From Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read From Pipe</em>' attribute.
	 * @see #isReadFromPipe()
	 * @generated
	 */
	void setReadFromPipe(boolean value);

	/**
	 * Returns the value of the '<em><b>Write To Pipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write To Pipe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write To Pipe</em>' attribute.
	 * @see #setWriteToPipe(boolean)
	 * @see easyflow.tool.ToolPackage#getRule_WriteToPipe()
	 * @model
	 * @generated
	 */
	boolean isWriteToPipe();

	/**
	 * Sets the value of the '{@link easyflow.tool.Rule#isWriteToPipe <em>Write To Pipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write To Pipe</em>' attribute.
	 * @see #isWriteToPipe()
	 * @generated
	 */
	void setWriteToPipe(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_InputParams()
	 * @model
	 * @generated
	 */
	EList<String> getInputParams();

	/**
	 * Returns the value of the '<em><b>Output Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_OutputParams()
	 * @model
	 * @generated
	 */
	EList<String> getOutputParams();

	/**
	 * Returns the value of the '<em><b>Opt Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_OptParams()
	 * @model
	 * @generated
	 */
	EList<String> getOptParams();

	/**
	 * Returns the value of the '<em><b>Pos Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_PosParams()
	 * @model
	 * @generated
	 */
	EList<String> getPosParams();

	/**
	 * Returns the value of the '<em><b>Exe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exe</em>' attribute.
	 * @see #setExe(String)
	 * @see easyflow.tool.ToolPackage#getRule_Exe()
	 * @model
	 * @generated
	 */
	String getExe();

	/**
	 * Sets the value of the '{@link easyflow.tool.Rule#getExe <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe</em>' attribute.
	 * @see #getExe()
	 * @generated
	 */
	void setExe(String value);

	/**
	 * Returns the value of the '<em><b>Exe Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exe Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_ExeParams()
	 * @model
	 * @generated
	 */
	EList<String> getExeParams();

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpreter</em>' attribute.
	 * @see #setInterpreter(String)
	 * @see easyflow.tool.ToolPackage#getRule_Interpreter()
	 * @model
	 * @generated
	 */
	String getInterpreter();

	/**
	 * Sets the value of the '{@link easyflow.tool.Rule#getInterpreter <em>Interpreter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter</em>' attribute.
	 * @see #getInterpreter()
	 * @generated
	 */
	void setInterpreter(String value);

	/**
	 * Returns the value of the '<em><b>Interpreter Params</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpreter Params</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getRule_InterpreterParams()
	 * @model
	 * @generated
	 */
	EList<String> getInterpreterParams();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see easyflow.tool.ToolPackage#getRule_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link easyflow.tool.Rule#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resolveCommandLineParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String createCommandLine();

} // Rule
