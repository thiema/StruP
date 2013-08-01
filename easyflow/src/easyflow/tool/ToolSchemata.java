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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link easyflow.tool.ToolSchemata#getSchemata <em>Schemata</em>}</li>
 *   <li>{@link easyflow.tool.ToolSchemata#getSchemataURI <em>Schemata URI</em>}</li>
 *   <li>{@link easyflow.tool.ToolSchemata#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getToolSchemata()
 * @model
 * @generated
 */
public interface ToolSchemata extends EObject {
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
	 * @see easyflow.tool.ToolPackage#getToolSchemata_Schemata()
	 * @model mapType="easyflow.util.maps.StringToSchemaMap<org.eclipse.emf.ecore.EString, easyflow.Schema>"
	 * @generated
	 */
	EMap<String, Schema> getSchemata();

	/**
	 * Returns the value of the '<em><b>Schemata URI</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemata URI</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemata URI</em>' map.
	 * @see easyflow.tool.ToolPackage#getToolSchemata_SchemataURI()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getSchemataURI();

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getToolSchemata_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Schema" exceptions="easyflow.FileNotFoundException" xsdSourceDataType="easyflow.URI"
	 * @generated
	 */
	Schema readSchema(URI xsdSource, boolean isFromJar) throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Schema" exceptions="easyflow.FileNotFoundException" xsdSourceDataType="easyflow.URI" xsdSourceMany="true"
	 * @generated
	 */
	Schema readSchemata(EList<URI> xsdSource, boolean isFromJar) throws FileNotFoundException;

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

} // ToolSchemata
