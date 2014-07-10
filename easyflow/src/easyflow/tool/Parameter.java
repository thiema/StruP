/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.data.Data;
import easyflow.traversal.TraversalChunk;
import java.net.URI;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Parameter#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValues <em>Values</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getOptionValues <em>Option Values</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMultipleValue <em>Multiple Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValueType <em>Value Type</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getOptionKey <em>Option Key</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValueDelimiter <em>Value Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getKeys <em>Keys</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getLabel <em>Label</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getHelp <em>Help</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMinOcc <em>Min Occ</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMaxOcc <em>Max Occ</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getPositional <em>Positional</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getDataDeprecated <em>Data Deprecated</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getFixedArgValue <em>Fixed Arg Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getParent <em>Parent</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getHandles <em>Handles</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getGeneralValue <em>General Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isOutput <em>Output</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isDataParam <em>Data Param</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getCmdPart <em>Cmd Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends IToolElement, DefaultToolElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.tool.Parameter},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see easyflow.tool.ToolPackage#getParameter_Values()
	 * @model mapType="easyflow.util.maps.StringToParameterListMap<org.eclipse.emf.ecore.EString, easyflow.tool.Parameter>"
	 * @generated
	 */
	EMap<String, EList<Parameter>> getValues();

	/**
	 * Returns the value of the '<em><b>Option Values</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.OptionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Values</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getParameter_OptionValues()
	 * @model
	 * @generated
	 */
	EList<OptionValue> getOptionValues();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Optional()
	 * @model default="false"
	 * @generated
	 */
	Boolean getOptional();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Multiple()
	 * @model default="false"
	 * @generated
	 */
	Boolean getMultiple();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(Boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Value</em>' attribute.
	 * @see #setMultipleValue(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_MultipleValue()
	 * @model default="false"
	 * @generated
	 */
	Boolean getMultipleValue();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getMultipleValue <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Value</em>' attribute.
	 * @see #getMultipleValue()
	 * @generated
	 */
	void setMultipleValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getParameter_Grouping()
	 * @model
	 * @generated
	 */
	EList<String> getGrouping();

	/**
	 * Returns the value of the '<em><b>Data Deprecated</b></em>' reference list.
	 * The list contents are of type {@link easyflow.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Deprecated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Deprecated</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getParameter_DataDeprecated()
	 * @model
	 * @generated
	 */
	EList<Data> getDataDeprecated();

	/**
	 * Returns the value of the '<em><b>Fixed Arg Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Arg Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Arg Value</em>' attribute.
	 * @see #setFixedArgValue(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_FixedArgValue()
	 * @model default="false"
	 * @generated
	 */
	Boolean getFixedArgValue();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getFixedArgValue <em>Fixed Arg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Arg Value</em>' attribute.
	 * @see #getFixedArgValue()
	 * @generated
	 */
	void setFixedArgValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Parameter)
	 * @see easyflow.tool.ToolPackage#getParameter_Parent()
	 * @model
	 * @generated
	 */
	Parameter getParent();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Parameter value);

	/**
	 * Returns the value of the '<em><b>Handles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handles</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getParameter_Handles()
	 * @model
	 * @generated
	 */
	EList<String> getHandles();

	/**
	 * Returns the value of the '<em><b>General Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual argument value. If it is a string its used as is. If it is an Iteratable the 
	 * individual values are enumerated and joined to a string with delimiter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Value</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getParameter_GeneralValue()
	 * @model dataType="easyflow.Object"
	 * @generated
	 */
	EList<Object> getGeneralValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getArgValueDelimiter(String defaultDelimiter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPrefix(String defaultPrefix);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Output()
	 * @model
	 * @generated
	 */
	boolean isOutput();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #isOutput()
	 * @generated
	 */
	void setOutput(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Param</em>' attribute.
	 * @see #setDataParam(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_DataParam()
	 * @model
	 * @generated
	 */
	boolean isDataParam();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isDataParam <em>Data Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Param</em>' attribute.
	 * @see #isDataParam()
	 * @generated
	 */
	void setDataParam(boolean value);

	/**
	 * Returns the value of the '<em><b>Cmd Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Part</em>' attribute.
	 * @see #setCmdPart(String)
	 * @see easyflow.tool.ToolPackage#getParameter_CmdPart()
	 * @model
	 * @generated
	 */
	String getCmdPart();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getCmdPart <em>Cmd Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Part</em>' attribute.
	 * @see #getCmdPart()
	 * @generated
	 */
	void setCmdPart(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getArgKey(String defaultPrefix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getArgDelimiter(String defaultDelimiter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model recordsMany="true"
	 * @generated
	 */
	Parameter getParameterForAnalysisType(EList<TraversalChunk> records);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isAnalysisType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getSupportedHandles(boolean applyConfig);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Parameter getEffectiveParentParameter(boolean first);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model effectiveParamsMany="true"
	 * @generated
	 */
	EList<Parameter> getEffectiveParameters(EList<Parameter> effectiveParams);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>" valueDataType="easyflow.URI" valueMany="true"
	 * @generated
	 */
	EList<String> generateCommandStringURI(EMap<String, Object> constraints, EList<URI> value, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>" valueDataType="easyflow.Object" valueMany="true"
	 * @generated
	 */
	EList<String> generateCommandString(EMap<String, Object> constraints, EList<Object> value, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>" valueDataType="easyflow.Object"
	 * @generated
	 */
	EList<String> generateCommandString(EMap<String, Object> constraints, Object value, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	EList<String> generateCommandString(EMap<String, Object> constraints, OptionValue value, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>" valueDataType="easyflow.URI"
	 * @generated
	 */
	EList<String> generateCommandString(EMap<String, Object> constraints, URI value, Parameter templateParam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isOptional(Boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isMultiple(Boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isNamed(Boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isPositional(Boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isFixedArgValue(Boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isMultipleValue(Boolean default_);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see easyflow.tool.ToolPackage#getParameter_ValueType()
	 * @model
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see easyflow.tool.ToolPackage#getParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Delimiter()
	 * @model
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Value Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Delimiter</em>' attribute.
	 * @see #setValueDelimiter(String)
	 * @see easyflow.tool.ToolPackage#getParameter_ValueDelimiter()
	 * @model
	 * @generated
	 */
	String getValueDelimiter();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getValueDelimiter <em>Value Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Delimiter</em>' attribute.
	 * @see #getValueDelimiter()
	 * @generated
	 */
	void setValueDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Prefix()
	 * @model default=""
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Option Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Key</em>' attribute.
	 * @see #setOptionKey(String)
	 * @see easyflow.tool.ToolPackage#getParameter_OptionKey()
	 * @model
	 * @generated
	 */
	String getOptionKey();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getOptionKey <em>Option Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Key</em>' attribute.
	 * @see #getOptionKey()
	 * @generated
	 */
	void setOptionKey(String value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getParameter_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getParameter_Keys()
	 * @model
	 * @generated
	 */
	EList<Key> getKeys();

	/**
	 * Returns the value of the '<em><b>Named</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named</em>' attribute.
	 * @see #setNamed(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Named()
	 * @model default="false"
	 * @generated
	 */
	Boolean getNamed();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getNamed <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named</em>' attribute.
	 * @see #getNamed()
	 * @generated
	 */
	void setNamed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see #setHelp(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Help()
	 * @model
	 * @generated
	 */
	String getHelp();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(String value);

	/**
	 * Returns the value of the '<em><b>Min Occ</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occ</em>' attribute.
	 * @see #setMinOcc(int)
	 * @see easyflow.tool.ToolPackage#getParameter_MinOcc()
	 * @model default="1"
	 * @generated
	 */
	int getMinOcc();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getMinOcc <em>Min Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occ</em>' attribute.
	 * @see #getMinOcc()
	 * @generated
	 */
	void setMinOcc(int value);

	/**
	 * Returns the value of the '<em><b>Max Occ</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occ</em>' attribute.
	 * @see #setMaxOcc(int)
	 * @see easyflow.tool.ToolPackage#getParameter_MaxOcc()
	 * @model default="1"
	 * @generated
	 */
	int getMaxOcc();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getMaxOcc <em>Max Occ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occ</em>' attribute.
	 * @see #getMaxOcc()
	 * @generated
	 */
	void setMaxOcc(int value);

	/**
	 * Returns the value of the '<em><b>Advanced</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advanced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advanced</em>' attribute.
	 * @see #setAdvanced(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Advanced()
	 * @model default="false"
	 * @generated
	 */
	boolean isAdvanced();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isAdvanced <em>Advanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advanced</em>' attribute.
	 * @see #isAdvanced()
	 * @generated
	 */
	void setAdvanced(boolean value);

	/**
	 * Returns the value of the '<em><b>Positional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positional</em>' attribute.
	 * @see #setPositional(Boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Positional()
	 * @model default="true"
	 * @generated
	 */
	Boolean getPositional();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#getPositional <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positional</em>' attribute.
	 * @see #getPositional()
	 * @generated
	 */
	void setPositional(Boolean value);

} // Parameter
