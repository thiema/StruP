/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

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
 *   <li>{@link easyflow.tool.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isMultipleValue <em>Multiple Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValueType <em>Value Type</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getOptionKey <em>Option Key</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValueDelimiter <em>Value Delimiter</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getKeys <em>Keys</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isNamed <em>Named</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getLabel <em>Label</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getHelp <em>Help</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMinOcc <em>Min Occ</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getMaxOcc <em>Max Occ</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isAdvanced <em>Advanced</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getValues <em>Values</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#isPositional <em>Positional</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link easyflow.tool.Parameter#getData <em>Data</em>}</li>
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
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

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
	 * @see #setMultiple(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Multiple()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

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
	 * @see #setMultipleValue(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_MultipleValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultipleValue();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isMultipleValue <em>Multiple Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Value</em>' attribute.
	 * @see #isMultipleValue()
	 * @generated
	 */
	void setMultipleValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Parameter},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see easyflow.tool.ToolPackage#getParameter_Values()
	 * @model mapType="easyflow.util.maps.StringToParameterMap<org.eclipse.emf.ecore.EString, easyflow.tool.Parameter>"
	 * @generated
	 */
	EMap<String, Parameter> getValues();

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
	 * @see #setPositional(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Positional()
	 * @model default="true"
	 * @generated
	 */
	boolean isPositional();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isPositional <em>Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positional</em>' attribute.
	 * @see #isPositional()
	 * @generated
	 */
	void setPositional(boolean value);

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
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getParameter_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constaintsMapType="easyflow.util.maps.StringToObjectMap<org.eclipse.emf.ecore.EString, easyflow.Object>"
	 * @generated
	 */
	String generateCommandString(EMap<String, Object> constaints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getArgKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getArgValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getArgDelimiter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getArgValueDelimiter();

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
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see easyflow.tool.ToolPackage#getParameter_Prefix()
	 * @model default="-"
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
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual argument value. If it is a string its used as is. If it is an Iteratable the 
	 * individual values are enumerated and joined to a string with delimiter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see easyflow.tool.ToolPackage#getParameter_Value()
	 * @model dataType="easyflow.Object"
	 * @generated
	 */
	EList<Object> getValue();

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
	 * @see #setNamed(boolean)
	 * @see easyflow.tool.ToolPackage#getParameter_Named()
	 * @model default="false"
	 * @generated
	 */
	boolean isNamed();

	/**
	 * Sets the value of the '{@link easyflow.tool.Parameter#isNamed <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named</em>' attribute.
	 * @see #isNamed()
	 * @generated
	 */
	void setNamed(boolean value);

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

} // Parameter
