/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.ResolvingParameterFailedException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.GlobalVar;
import easyflow.data.DataLink;
import easyflow.execution.IExecutionSystem;
import easyflow.graph.jgraphx.ExecutionGraph;
import easyflow.graph.jgraphx.Execution;
import easyflow.graph.jgraphx.Graph;
import easyflow.graph.jgraphx.JgraphxPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import easyflow.tool.ToolFactory;
import java.lang.reflect.InvocationTargetException;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.core.ErrorControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.ExecutionGraphImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link easyflow.graph.jgraphx.impl.ExecutionGraphImpl#getErrorControl <em>Error Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionGraphImpl extends MinimalEObjectImpl.Container implements ExecutionGraph {
	
	
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	/**
	 * The cached value of the '{@link #getErrorControl() <em>Error Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControl()
	 * @generated
	 * @ordered
	 */
	protected ErrorControl errorControl;
	private static Logger logger = Logger.getLogger(Execution.class);
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean generateWorkflowForExecutionSystem(mxICell root, IExecutionSystem executionSystem) {

		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseTopologicalOrder(root, executionSystem.getJgraphxVisitor());
			JGraphXUtil.layoutGraph();
			
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}

		return true;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolvePipes(mxICell root) {

		boolean rc = true;
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task task = JGraphXUtil.loadTask(vertex);
					logger.debug("resolvePipes(): "+task.getUniqueString()+" "+task.hashCode());
					EList<DataLink> dataLinks = new BasicEList<DataLink>();
					EList<Task>     parents   = new BasicEList<Task>();
					Object edges[] = GlobalVar
							.getGraph()
								.getIncomingEdges(
										GlobalVar.getCells()
											.get(task.getUniqueString()));
					for (Object inEdge : edges)
					{
						DataLink dataLink = JGraphXUtil.loadDataLink(inEdge);
						Task     parent   = JGraphXUtil.getSourceTask((mxCell) inEdge);
						if (dataLink.getPipe() != null && dataLink.getPipe())
						{
							dataLinks.add(dataLink);
							parents.add(parent);
						}
					}
					if (dataLinks.size() > 1)
						for (DataLink dataLink : dataLinks)
							dataLink.setPipe(false);
					else if (dataLinks.size() == 1)
					{
						if (parents.get(0).getRule() == null)
							parents.get(0).setRule(ToolFactory.eINSTANCE.createRule());
						task.setRule(parents.get(0).getRule());
					}
					
					dataLinks.clear();
					edges = GlobalVar
							.getGraph()
								.getOutgoingEdges(
										GlobalVar.getCells()
											.get(task.getUniqueString()));
					for (Object outEdge : edges)
					{
						DataLink dataLink = JGraphXUtil.loadDataLink(outEdge);
						if (dataLink.getPipe() != null && dataLink.getPipe())
						{
							dataLinks.add(dataLink);
						}						
					}
					if (dataLinks.size() > 1)
						for (DataLink dataLink : dataLinks)
							dataLink.setPipe(false);
										
				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		
		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseTopologicalOrder(root, visitor);
			JGraphXUtil.layoutGraph();
			
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
	
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean resolveToolParams(mxICell root) {

		boolean rc = true;
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task task = JGraphXUtil.loadTask(vertex);
					task.resolveDataPortParams(task.getOutputs(), task.getPreferredTool(), true);
					task.resolveDataPortParams(task.getInputs(),  task.getPreferredTool(), false);
					//task.resolveParams();

				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParameterNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoValidInOutDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ResolvingParameterFailedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/* catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				return true;
			}
		};
		
		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseTopologicalOrder(root, visitor);
			JGraphXUtil.layoutGraph();
			
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JgraphxPackage.EXECUTION_GRAPH__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
			case JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL:
				if (resolve) return getErrorControl();
				return basicGetErrorControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JgraphxPackage.EXECUTION_GRAPH__GRAPH:
				setGraph((Graph)newValue);
				return;
			case JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL:
				setErrorControl((ErrorControl)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JgraphxPackage.EXECUTION_GRAPH__GRAPH:
				setGraph((Graph)null);
				return;
			case JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL:
				setErrorControl((ErrorControl)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JgraphxPackage.EXECUTION_GRAPH__GRAPH:
				return graph != null;
			case JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL:
				return errorControl != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JgraphxPackage.EXECUTION_GRAPH___GENERATE_WORKFLOW_FOR_EXECUTION_SYSTEM__MXICELL_IEXECUTIONSYSTEM:
				return generateWorkflowForExecutionSystem((mxICell)arguments.get(0), (IExecutionSystem)arguments.get(1));
			case JgraphxPackage.EXECUTION_GRAPH___RESOLVE_TOOL_PARAMS__MXICELL:
				return resolveToolParams((mxICell)arguments.get(0));
			case JgraphxPackage.EXECUTION_GRAPH___RESOLVE_PIPES__MXICELL:
				return resolvePipes((mxICell)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.EXECUTION_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (Graph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.EXECUTION_GRAPH__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.EXECUTION_GRAPH__GRAPH, oldGraph, graph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorControl getErrorControl() {
		if (errorControl != null && errorControl.eIsProxy()) {
			InternalEObject oldErrorControl = (InternalEObject)errorControl;
			errorControl = (ErrorControl)eResolveProxy(oldErrorControl);
			if (errorControl != oldErrorControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL, oldErrorControl, errorControl));
			}
		}
		return errorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorControl basicGetErrorControl() {
		return errorControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorControl(ErrorControl newErrorControl) {
		ErrorControl oldErrorControl = errorControl;
		errorControl = newErrorControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.EXECUTION_GRAPH__ERROR_CONTROL, oldErrorControl, errorControl));
	}

} //ExecutionImpl
