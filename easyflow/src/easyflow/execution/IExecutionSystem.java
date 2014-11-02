/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.execution;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.tool.Rule;
import java.io.BufferedWriter;
import org.apache.log4j.Logger;
import easyflow.core.Task;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.tool.Tool;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IExecution System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.execution.IExecutionSystem#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.execution.IExecutionSystem#getWriter <em>Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.execution.ExecutionPackage#getIExecutionSystem()
 * @model abstract="true"
 * @generated
 */
public interface IExecutionSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.execution.ExecutionPackage#getIExecutionSystem_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Writer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' attribute.
	 * @see #setWriter(BufferedWriter)
	 * @see easyflow.execution.ExecutionPackage#getIExecutionSystem_Writer()
	 * @model dataType="easyflow.BufferedWriter"
	 * @generated
	 */
	BufferedWriter getWriter();

	/**
	 * Sets the value of the '{@link easyflow.execution.IExecutionSystem#getWriter <em>Writer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' attribute.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(BufferedWriter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="easyflow.mxICellVisitor"
	 * @generated
	 */
	mxICellVisitor getJgraphxVisitor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateExecutionString(Rule rule);

} // IExecutionSystem
