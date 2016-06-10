/**
 */
package easyflow.graph;

import easyflow.util.LogMessage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.DefaultGraph#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.GraphPackage#getDefaultGraph()
 * @model
 * @generated
 */
public interface DefaultGraph extends IGraph {
	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' reference.
	 * @see #setLogMessage(LogMessage)
	 * @see easyflow.graph.GraphPackage#getDefaultGraph_LogMessage()
	 * @model
	 * @generated
	 */
	LogMessage getLogMessage();

	/**
	 * Sets the value of the '{@link easyflow.graph.DefaultGraph#getLogMessage <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(LogMessage value);

} // DefaultGraph
