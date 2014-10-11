/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.data.DataFormat;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.ResolvedParam#getParameter <em>Parameter</em>}</li>
 *   <li>{@link easyflow.tool.ResolvedParam#getValue <em>Value</em>}</li>
 *   <li>{@link easyflow.tool.ResolvedParam#getHandle <em>Handle</em>}</li>
 *   <li>{@link easyflow.tool.ResolvedParam#getDataFormat <em>Data Format</em>}</li>
 *   <li>{@link easyflow.tool.ResolvedParam#getConditionalParam <em>Conditional Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getResolvedParam()
 * @model
 * @generated
 */
public interface ResolvedParam extends DefaultToolElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see easyflow.tool.ToolPackage#getResolvedParam_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link easyflow.tool.ResolvedParam#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual argument value. If it is a string its used as is. If it is an Iteratable the 
	 * individual values are enumerated and joined to a string with delimiter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getResolvedParam_Value()
	 * @model dataType="easyflow.Object"
	 * @generated
	 */
	EList<Object> getValue();

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see easyflow.tool.ToolPackage#getResolvedParam_Handle()
	 * @model
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link easyflow.tool.ResolvedParam#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Format</em>' reference.
	 * @see #setDataFormat(DataFormat)
	 * @see easyflow.tool.ToolPackage#getResolvedParam_DataFormat()
	 * @model
	 * @generated
	 */
	DataFormat getDataFormat();

	/**
	 * Sets the value of the '{@link easyflow.tool.ResolvedParam#getDataFormat <em>Data Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' reference.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(DataFormat value);

	/**
	 * Returns the value of the '<em><b>Conditional Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Param</em>' attribute.
	 * @see #setConditionalParam(String)
	 * @see easyflow.tool.ToolPackage#getResolvedParam_ConditionalParam()
	 * @model
	 * @generated
	 */
	String getConditionalParam();

	/**
	 * Sets the value of the '{@link easyflow.tool.ResolvedParam#getConditionalParam <em>Conditional Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Param</em>' attribute.
	 * @see #getConditionalParam()
	 * @generated
	 */
	void setConditionalParam(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EList<String> generateCommandString(EMap<String, Object> constraints, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getArgValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String resolveName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model effectiveParamsMany="true"
	 * @generated
	 */
	EList<ResolvedParam> getEffectiveParameters(EList<ResolvedParam> effectiveParams);

} // ResolvedParam
