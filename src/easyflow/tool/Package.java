/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import java.net.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Package#getResolvedParams <em>Resolved Params</em>}</li>
 *   <li>{@link easyflow.tool.Package#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.tool.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link easyflow.tool.Package#getResolveUriMap <em>Resolve Uri Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends IToolElement, DefaultToolElement, BaseCommand {

	/**
	 * Returns the value of the '<em><b>Resolved Params</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.ResolvedParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Params</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Params</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getPackage_ResolvedParams()
	 * @model
	 * @generated
	 */
	EList<ResolvedParam> getResolvedParams();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see easyflow.tool.ToolPackage#getPackage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see easyflow.tool.ToolPackage#getPackage_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link easyflow.tool.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Resolve Uri Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Uri Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Uri Map</em>' map.
	 * @see easyflow.tool.ToolPackage#getPackage_ResolveUriMap()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getResolveUriMap();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getExe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ResolvedParam> getInterpreterParams();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getInterpreter();
} // Package
