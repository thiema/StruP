/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.BaseCommand#getCommandPattern <em>Command Pattern</em>}</li>
 *   <li>{@link easyflow.tool.BaseCommand#getTemplateParam <em>Template Param</em>}</li>
 *   <li>{@link easyflow.tool.BaseCommand#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}</li>
 *   <li>{@link easyflow.tool.BaseCommand#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getBaseCommand()
 * @model
 * @generated
 */
public interface BaseCommand extends EObject {
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
	 * @see easyflow.tool.ToolPackage#getBaseCommand_CommandPattern()
	 * @model
	 * @generated
	 */
	String getCommandPattern();

	/**
	 * Sets the value of the '{@link easyflow.tool.BaseCommand#getCommandPattern <em>Command Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Pattern</em>' attribute.
	 * @see #getCommandPattern()
	 * @generated
	 */
	void setCommandPattern(String value);

	/**
	 * Returns the value of the '<em><b>Template Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Param</em>' reference.
	 * @see #setTemplateParam(Parameter)
	 * @see easyflow.tool.ToolPackage#getBaseCommand_TemplateParam()
	 * @model
	 * @generated
	 */
	Parameter getTemplateParam();

	/**
	 * Sets the value of the '{@link easyflow.tool.BaseCommand#getTemplateParam <em>Template Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Param</em>' reference.
	 * @see #getTemplateParam()
	 * @generated
	 */
	void setTemplateParam(Parameter value);

	/**
	 * Returns the value of the '<em><b>Assume Data Param Positional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assume Data Param Positional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assume Data Param Positional</em>' attribute.
	 * @see #setAssumeDataParamPositional(Boolean)
	 * @see easyflow.tool.ToolPackage#getBaseCommand_AssumeDataParamPositional()
	 * @model
	 * @generated
	 */
	Boolean getAssumeDataParamPositional();

	/**
	 * Sets the value of the '{@link easyflow.tool.BaseCommand#getAssumeDataParamPositional <em>Assume Data Param Positional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assume Data Param Positional</em>' attribute.
	 * @see #getAssumeDataParamPositional()
	 * @generated
	 */
	void setAssumeDataParamPositional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cmd Part Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Part Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Part Delimiter</em>' attribute.
	 * @see #setCmdPartDelimiter(String)
	 * @see easyflow.tool.ToolPackage#getBaseCommand_CmdPartDelimiter()
	 * @model
	 * @generated
	 */
	String getCmdPartDelimiter();

	/**
	 * Sets the value of the '{@link easyflow.tool.BaseCommand#getCmdPartDelimiter <em>Cmd Part Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Part Delimiter</em>' attribute.
	 * @see #getCmdPartDelimiter()
	 * @generated
	 */
	void setCmdPartDelimiter(String value);

} // BaseCommand
