/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import java.net.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.DocumentProperties#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link easyflow.tool.DocumentProperties#isFromJar <em>From Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getDocumentProperties()
 * @model
 * @generated
 */
public interface DocumentProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URI</em>' attribute.
	 * @see #setSourceURI(URI)
	 * @see easyflow.tool.ToolPackage#getDocumentProperties_SourceURI()
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI getSourceURI();

	/**
	 * Sets the value of the '{@link easyflow.tool.DocumentProperties#getSourceURI <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source URI</em>' attribute.
	 * @see #getSourceURI()
	 * @generated
	 */
	void setSourceURI(URI value);

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
	 * @see easyflow.tool.ToolPackage#getDocumentProperties_FromJar()
	 * @model
	 * @generated
	 */
	boolean isFromJar();

	/**
	 * Sets the value of the '{@link easyflow.tool.DocumentProperties#isFromJar <em>From Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Jar</em>' attribute.
	 * @see #isFromJar()
	 * @generated
	 */
	void setFromJar(boolean value);

} // DocumentProperties
