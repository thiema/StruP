/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

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
 *   <li>{@link easyflow.tool.Rule#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link easyflow.tool.Rule#getTargets <em>Targets</em>}</li>
 *   <li>{@link easyflow.tool.Rule#isReadFromPipe <em>Read From Pipe</em>}</li>
 *   <li>{@link easyflow.tool.Rule#isWriteToPipe <em>Write To Pipe</em>}</li>
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
	 * @model
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

} // Rule
