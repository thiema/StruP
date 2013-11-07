/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.traversal.TraversalChunk;
import java.net.URI;
import java.util.Map;
import org.apache.log4j.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Command#isExecutable <em>Executable</em>}</li>
 *   <li>{@link easyflow.tool.Command#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.Command#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends IToolElement, DefaultToolElement {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(boolean)
	 * @see easyflow.tool.ToolPackage#getCommand_Executable()
	 * @model
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link easyflow.tool.Command#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #isExecutable()
	 * @generated
	 */
	void setExecutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getCommand_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Parameter},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see easyflow.tool.ToolPackage#getCommand_Parameters()
	 * @model mapType="easyflow.util.maps.StringToParameterMap<org.eclipse.emf.ecore.EString, easyflow.tool.Parameter>"
	 * @generated
	 */
	EMap<String, Parameter> getParameters();

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
	 * <!-- begin-model-doc -->
	 * Generates the input/output files (e.g. the file name), that correspond to the 
	 * inputs/output ports, as provided the parent tasks and are consumed by the childs.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean resolvePorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the static input files (e.g. the file name), that are not dependant on the previous task.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean resolveStaticPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the concrete input ports (e.g. file names) and with respect to the given 
	 * chunks. The returned keys correspond to the name of data format.
	 * <!-- end-model-doc -->
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>" chunksMapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, URI> getInputs(EMap<String, EList<TraversalChunk>> chunks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>" chunksMapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, URI> getOutputs(EMap<String, EList<TraversalChunk>> chunks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the concrete input ports (e.g. file names). The keys correspond to the
	 * name of data format.
	 * <!-- end-model-doc -->
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>" chunksMapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, URI> getStaticInputs(EMap<String, EList<TraversalChunk>> chunks);

} // Command
