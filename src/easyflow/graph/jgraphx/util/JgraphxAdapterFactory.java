/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.util;

import easyflow.graph.DefaultGraph;
import easyflow.graph.IGraph;
import easyflow.graph.jgraphx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see easyflow.graph.jgraphx.JgraphxPackage
 * @generated
 */
public class JgraphxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JgraphxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JgraphxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JgraphxSwitch<Adapter> modelSwitch =
		new JgraphxSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractGraph(AbstractGraph object) {
				return createAbstractGraphAdapter();
			}
			@Override
			public Adapter caseTraversalEventGraph(TraversalEventGraph object) {
				return createTraversalEventGraphAdapter();
			}
			@Override
			public Adapter casePreprocessingGraph(PreprocessingGraph object) {
				return createPreprocessingGraphAdapter();
			}
			@Override
			public Adapter caseToolDependencyGraph(ToolDependencyGraph object) {
				return createToolDependencyGraphAdapter();
			}
			@Override
			public Adapter caseExecutionGraph(ExecutionGraph object) {
				return createExecutionGraphAdapter();
			}
			@Override
			public Adapter caseSubGraph(SubGraph object) {
				return createSubGraphAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseUntranslatedLink(UntranslatedLink object) {
				return createUntranslatedLinkAdapter();
			}
			@Override
			public Adapter caseIGraph(IGraph object) {
				return createIGraphAdapter();
			}
			@Override
			public Adapter caseDefaultGraph(DefaultGraph object) {
				return createDefaultGraphAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.AbstractGraph
	 * @generated
	 */
	public Adapter createAbstractGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.TraversalEventGraph <em>Traversal Event Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.TraversalEventGraph
	 * @generated
	 */
	public Adapter createTraversalEventGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.PreprocessingGraph <em>Preprocessing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.PreprocessingGraph
	 * @generated
	 */
	public Adapter createPreprocessingGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.ToolDependencyGraph <em>Tool Dependency Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.ToolDependencyGraph
	 * @generated
	 */
	public Adapter createToolDependencyGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.ExecutionGraph <em>Execution Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.ExecutionGraph
	 * @generated
	 */
	public Adapter createExecutionGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.SubGraph
	 * @generated
	 */
	public Adapter createSubGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.jgraphx.UntranslatedLink <em>Untranslated Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.jgraphx.UntranslatedLink
	 * @generated
	 */
	public Adapter createUntranslatedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.IGraph <em>IGraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.IGraph
	 * @generated
	 */
	public Adapter createIGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link easyflow.graph.DefaultGraph <em>Default Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see easyflow.graph.DefaultGraph
	 * @generated
	 */
	public Adapter createDefaultGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JgraphxAdapterFactory
