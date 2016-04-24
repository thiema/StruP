/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import easyflow.graph.jgraphx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JgraphxFactoryImpl extends EFactoryImpl implements JgraphxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JgraphxFactory init() {
		try {
			JgraphxFactory theJgraphxFactory = (JgraphxFactory)EPackage.Registry.INSTANCE.getEFactory(JgraphxPackage.eNS_URI);
			if (theJgraphxFactory != null) {
				return theJgraphxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JgraphxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JgraphxPackage.ABSTRACT_GRAPH: return createAbstractGraph();
			case JgraphxPackage.TRAVERSAL_EVENT_GRAPH: return createTraversalEventGraph();
			case JgraphxPackage.PREPROCESSING_GRAPH: return createPreprocessingGraph();
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH: return createToolDependencyGraph();
			case JgraphxPackage.EXECUTION_GRAPH: return createExecutionGraph();
			case JgraphxPackage.SUB_GRAPH: return createSubGraph();
			case JgraphxPackage.GRAPH: return createGraph();
			case JgraphxPackage.UNTRANSLATED_LINK: return createUntranslatedLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraph createAbstractGraph() {
		AbstractGraphImpl abstractGraph = new AbstractGraphImpl();
		return abstractGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraversalEventGraph createTraversalEventGraph() {
		TraversalEventGraphImpl traversalEventGraph = new TraversalEventGraphImpl();
		return traversalEventGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingGraph createPreprocessingGraph() {
		PreprocessingGraphImpl preprocessingGraph = new PreprocessingGraphImpl();
		return preprocessingGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDependencyGraph createToolDependencyGraph() {
		ToolDependencyGraphImpl toolDependencyGraph = new ToolDependencyGraphImpl();
		return toolDependencyGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionGraph createExecutionGraph() {
		ExecutionGraphImpl executionGraph = new ExecutionGraphImpl();
		return executionGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGraph createSubGraph() {
		SubGraphImpl subGraph = new SubGraphImpl();
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntranslatedLink createUntranslatedLink() {
		UntranslatedLinkImpl untranslatedLink = new UntranslatedLinkImpl();
		return untranslatedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JgraphxPackage getJgraphxPackage() {
		return (JgraphxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JgraphxPackage getPackage() {
		return JgraphxPackage.eINSTANCE;
	}

} //JgraphxFactoryImpl
