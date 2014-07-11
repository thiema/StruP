/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.OptionValue#getCondition <em>Condition</em>}</li>
 *   <li>{@link easyflow.tool.OptionValue#getHelp <em>Help</em>}</li>
 *   <li>{@link easyflow.tool.OptionValue#getExe <em>Exe</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getOptionValue()
 * @model
 * @generated
 */
public interface OptionValue extends DefaultToolElement {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see easyflow.tool.ToolPackage#getOptionValue_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link easyflow.tool.OptionValue#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

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
	 * @see easyflow.tool.ToolPackage#getOptionValue_Help()
	 * @model
	 * @generated
	 */
	String getHelp();

	/**
	 * Sets the value of the '{@link easyflow.tool.OptionValue#getHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(String value);

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
	 * @see easyflow.tool.ToolPackage#getOptionValue_Exe()
	 * @model
	 * @generated
	 */
	String getExe();

	/**
	 * Sets the value of the '{@link easyflow.tool.OptionValue#getExe <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe</em>' attribute.
	 * @see #getExe()
	 * @generated
	 */
	void setExe(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String resolveValue();
} // OptionValue
