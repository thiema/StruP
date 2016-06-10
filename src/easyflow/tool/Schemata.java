/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import java.io.FileNotFoundException;

import java.net.URI;

import javax.xml.validation.Schema;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schemata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Schemata#getSchemata <em>Schemata</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getSchemata()
 * @model
 * @generated
 */
public interface Schemata extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemata</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link javax.xml.validation.Schema},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemata</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemata</em>' map.
	 * @see easyflow.tool.ToolPackage#getSchemata_Schemata()
	 * @model mapType="easyflow.core.StringToSchemaMap<org.eclipse.emf.ecore.EString, easyflow.Schema>"
	 * @generated
	 */
	EMap<String, Schema> getSchemata();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Schema" exceptions="easyflow.FileNotFoundException" xsdSourceDataType="easyflow.URI"
	 * @generated
	 */
	Schema readSchema(URI xsdSource) throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="easyflow.Schema"
	 * @generated
	 */
	Schema getDefaultSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Schema" documentDataType="easyflow.Document"
	 * @generated
	 */
	Schema getSchemaFor(Document document);

} // Schemata
