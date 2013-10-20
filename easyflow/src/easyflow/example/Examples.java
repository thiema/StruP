/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.example;

import easyflow.ui.DefaultProject;
import java.net.URI;

import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.example.Examples#getLocator <em>Locator</em>}</li>
 *   <li>{@link easyflow.example.Examples#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.example.Examples#getExamples <em>Examples</em>}</li>
 *   <li>{@link easyflow.example.Examples#isFromJar <em>From Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.example.ExamplePackage#getExamples()
 * @model
 * @generated
 */
public interface Examples extends EObject {
	/**
	 * Returns the value of the '<em><b>Locator</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator</em>' attribute.
	 * @see #setLocator(String)
	 * @see easyflow.example.ExamplePackage#getExamples_Locator()
	 * @model default="true"
	 * @generated
	 */
	String getLocator();

	/**
	 * Sets the value of the '{@link easyflow.example.Examples#getLocator <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' attribute.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(String value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.example.ExamplePackage#getExamples_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.ui.DefaultProject},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' map.
	 * @see easyflow.example.ExamplePackage#getExamples_Examples()
	 * @model mapType="easyflow.util.maps.StringToProjectMap<org.eclipse.emf.ecore.EString, easyflow.ui.DefaultProject>"
	 * @generated
	 */
	EMap<String, DefaultProject> getExamples();

	/**
	 * Returns the value of the '<em><b>From Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Jar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Jar</em>' attribute.
	 * @see #setFromJar(boolean)
	 * @see easyflow.example.ExamplePackage#getExamples_FromJar()
	 * @model
	 * @generated
	 */
	boolean isFromJar();

	/**
	 * Sets the value of the '{@link easyflow.example.Examples#isFromJar <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Jar</em>' attribute.
	 * @see #isFromJar()
	 * @generated
	 */
	void setFromJar(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> readExamples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void readRepository();

} // Examples
