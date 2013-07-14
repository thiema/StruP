/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.core.Workflow;

import java.io.FileNotFoundException;
import java.net.URI;
import javax.xml.validation.Schema;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see easyflow.ui.UiPackage#getIProject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProject extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model exceptions="easyflow.FileNotFoundException" sourceDataType="easyflow.URI"
	 * @generated
	 */
	void readProjectJson(URI source) throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void initProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String createPath(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void autoSetup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void applyMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyTraversalEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearWorkflows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Workflow getActiveWorkflow();

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
	 * @model dataType="easyflow.Document" exceptions="easyflow.FileNotFoundException" xmlSourceDataType="easyflow.URI"
	 * @generated
	 */
	Document readToolDefinition(URI xmlSource) throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.FileNotFoundException"
	 * @generated
	 */
	void readConfiguration() throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Document" sourceXMLDataType="easyflow.URI"
	 * @generated
	 */
	Document getSchemaFor(URI sourceXML);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="easyflow.Schema"
	 * @generated
	 */
	Schema getDefaultSchema();

} // IProject
