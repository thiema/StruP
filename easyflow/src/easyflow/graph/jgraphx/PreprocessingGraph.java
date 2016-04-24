/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import com.mxgraph.model.mxICell;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.graph.DefaultGraph;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preprocessing Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.PreprocessingGraph#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.graph.jgraphx.JgraphxPackage#getPreprocessingGraph()
 * @model
 * @generated
 */
public interface PreprocessingGraph extends DefaultGraph {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see easyflow.graph.jgraphx.JgraphxPackage#getPreprocessingGraph_Graph()
	 * @model
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link easyflow.graph.jgraphx.PreprocessingGraph#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.TaskNotFoundException" vertexDataType="easyflow.mxICell" cellDataType="easyflow.mxICell"
	 * @generated
	 */
	boolean resolvePreprocessingTask(mxICell vertex, mxICell cell) throws DataLinkNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.CellToCellListMap<easyflow.mxICell, easyflow.mxICell>"
	 * @generated
	 */
	EMap<mxICell, EList<mxICell>> findCellsWherePreprocessingIsRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<UntranslatedLink> findCellsWithUntranslatedDataLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.TaskNotFoundException easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException" edgesDataType="easyflow.mxICell" edgesMany="true"
	 * @generated
	 */
	boolean resolveEdge(Task target, EList<mxICell> edges) throws TaskNotFoundException, DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException;

} // PreprocessingGraph
