/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.Interpreter#getExe <em>Exe</em>}</li>
 *   <li>{@link easyflow.core.Interpreter#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getInterpreter()
 * @model
 * @generated
 */
public interface Interpreter extends EObject {
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
	 * @see easyflow.core.CorePackage#getInterpreter_Exe()
	 * @model
	 * @generated
	 */
	String getExe();

	/**
	 * Sets the value of the '{@link easyflow.core.Interpreter#getExe <em>Exe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe</em>' attribute.
	 * @see #getExe()
	 * @generated
	 */
	void setExe(String value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.core.CorePackage#getInterpreter_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementDataType="easyflow.Element"
	 * @generated
	 */
	void readImplementation(Element element);

} // Interpreter
