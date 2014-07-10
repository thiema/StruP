/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.data.DataPort;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Command#isExecutable <em>Executable</em>}</li>
 *   <li>{@link easyflow.tool.Command#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.Command#getResolvedParams <em>Resolved Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends IToolElement, DefaultToolElement, BaseCommand {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(boolean)
	 * @see easyflow.tool.ToolPackage#getCommand_Executable()
	 * @model
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link easyflow.tool.Command#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #isExecutable()
	 * @generated
	 */
	void setExecutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getCommand_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Resolved Params</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.ResolvedParam},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Params</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Params</em>' map.
	 * @see easyflow.tool.ToolPackage#getCommand_ResolvedParams()
	 * @model mapType="easyflow.util.maps.StringToResolvedParamMap<org.eclipse.emf.ecore.EString, easyflow.tool.ResolvedParam>"
	 * @generated
	 */
	EMap<String, ResolvedParam> getResolvedParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getPositionalParameterNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getOptionalParameterNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getInterperter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getExe();

} // Command
