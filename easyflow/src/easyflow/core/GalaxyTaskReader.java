/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import org.apache.log4j.Logger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galaxy Task Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.GalaxyTaskReader#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getGalaxyTaskReader()
 * @model
 * @generated
 */
public interface GalaxyTaskReader extends ITaskReader {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(Logger)
	 * @see easyflow.core.CorePackage#getGalaxyTaskReader_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.GalaxyTaskReader#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

} // GalaxyTaskReader
