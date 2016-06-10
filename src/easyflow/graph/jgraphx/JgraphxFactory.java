/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.graph.jgraphx.JgraphxPackage
 * @generated
 */
public interface JgraphxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JgraphxFactory eINSTANCE = easyflow.graph.jgraphx.impl.JgraphxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Graph</em>'.
	 * @generated
	 */
	AbstractGraph createAbstractGraph();

	/**
	 * Returns a new object of class '<em>Traversal Event Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traversal Event Graph</em>'.
	 * @generated
	 */
	TraversalEventGraph createTraversalEventGraph();

	/**
	 * Returns a new object of class '<em>Preprocessing Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessing Graph</em>'.
	 * @generated
	 */
	PreprocessingGraph createPreprocessingGraph();

	/**
	 * Returns a new object of class '<em>Tool Dependency Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Dependency Graph</em>'.
	 * @generated
	 */
	ToolDependencyGraph createToolDependencyGraph();

	/**
	 * Returns a new object of class '<em>Execution Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Graph</em>'.
	 * @generated
	 */
	ExecutionGraph createExecutionGraph();

	/**
	 * Returns a new object of class '<em>Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Graph</em>'.
	 * @generated
	 */
	SubGraph createSubGraph();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Untranslated Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Untranslated Link</em>'.
	 * @generated
	 */
	UntranslatedLink createUntranslatedLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JgraphxPackage getJgraphxPackage();

} //JgraphxFactory
