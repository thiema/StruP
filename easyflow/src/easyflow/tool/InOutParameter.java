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
 * A representation of the model object '<em><b>In Out Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.InOutParameter#isOutput <em>Output</em>}</li>
 *   <li>{@link easyflow.tool.InOutParameter#getExtension <em>Extension</em>}</li>
 *   <li>{@link easyflow.tool.InOutParameter#getFilenameCreation <em>Filename Creation</em>}</li>
 *   <li>{@link easyflow.tool.InOutParameter#getFormats <em>Formats</em>}</li>
 *   <li>{@link easyflow.tool.InOutParameter#getDataPort <em>Data Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getInOutParameter()
 * @model
 * @generated
 */
public interface InOutParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(boolean)
	 * @see easyflow.tool.ToolPackage#getInOutParameter_Output()
	 * @model
	 * @generated
	 */
	boolean isOutput();

	/**
	 * Sets the value of the '{@link easyflow.tool.InOutParameter#isOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #isOutput()
	 * @generated
	 */
	void setOutput(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(Boolean)
	 * @see easyflow.tool.ToolPackage#getInOutParameter_Extension()
	 * @model
	 * @generated
	 */
	Boolean getExtension();

	/**
	 * Sets the value of the '{@link easyflow.tool.InOutParameter#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Boolean value);

	/**
	 * Returns the value of the '<em><b>Filename Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename Creation</em>' attribute.
	 * @see #setFilenameCreation(String)
	 * @see easyflow.tool.ToolPackage#getInOutParameter_FilenameCreation()
	 * @model
	 * @generated
	 */
	String getFilenameCreation();

	/**
	 * Sets the value of the '{@link easyflow.tool.InOutParameter#getFilenameCreation <em>Filename Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename Creation</em>' attribute.
	 * @see #getFilenameCreation()
	 * @generated
	 */
	void setFilenameCreation(String value);

	/**
	 * Returns the value of the '<em><b>Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formats</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formats</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getInOutParameter_Formats()
	 * @model
	 * @generated
	 */
	EList<String> getFormats();

	/**
	 * Returns the value of the '<em><b>Data Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Port</em>' attribute.
	 * @see #setDataPort(String)
	 * @see easyflow.tool.ToolPackage#getInOutParameter_DataPort()
	 * @model
	 * @generated
	 */
	String getDataPort();

	/**
	 * Sets the value of the '{@link easyflow.tool.InOutParameter#getDataPort <em>Data Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Port</em>' attribute.
	 * @see #getDataPort()
	 * @generated
	 */
	void setDataPort(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean matches(InOutParameter templateParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean matches(Parameter templateParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void merge(Parameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean omitExtension();

} // InOutParameter
