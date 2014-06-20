/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import org.eclipse.emf.common.util.EMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Package#getParameters <em>Parameters</em>}</li>
 *   <li>{@link easyflow.tool.Package#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.tool.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link easyflow.tool.Package#getExe <em>Exe</em>}</li>
 *   <li>{@link easyflow.tool.Package#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link easyflow.tool.Package#getCommandPattern <em>Command Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends IToolElement, DefaultToolElement {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Parameter},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see easyflow.tool.ToolPackage#getPackage_Parameters()
	 * @model mapType="easyflow.util.maps.StringToParameterMap<org.eclipse.emf.ecore.EString, easyflow.tool.Parameter>"
	 * @generated
	 */
	EMap<String, Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see easyflow.tool.ToolPackage#getPackage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see easyflow.tool.ToolPackage#getPackage_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see easyflow.tool.ToolPackage#getPackage_Exe()
	 * @model
	 * @generated
	 */
	String getExe();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getExe <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe</em>' attribute.
	 * @see #getExe()
	 * @generated
	 */
	void setExe(String value);

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
	 * @see easyflow.tool.ToolPackage#getPackage_Interpreter()
	 * @model
	 * @generated
	 */
	String getInterpreter();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getInterpreter <em>Interpreter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter</em>' attribute.
	 * @see #getInterpreter()
	 * @generated
	 */
	void setInterpreter(String value);

	/**
	 * Returns the value of the '<em><b>Command Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Pattern</em>' attribute.
	 * @see #setCommandPattern(String)
	 * @see easyflow.tool.ToolPackage#getPackage_CommandPattern()
	 * @model
	 * @generated
	 */
	String getCommandPattern();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getCommandPattern <em>Command Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Pattern</em>' attribute.
	 * @see #getCommandPattern()
	 * @generated
	 */
	void setCommandPattern(String value);
} // Package
