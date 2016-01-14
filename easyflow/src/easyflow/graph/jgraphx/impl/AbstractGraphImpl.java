/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.util.Map.Entry;

import easyflow.core.Task;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.graph.jgraphx.AbstractGraph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GraphUtil;
import easyflow.data.DataFactory;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.graph.jgraphx.Abstract;
import easyflow.graph.jgraphx.Graph;
import easyflow.graph.jgraphx.JgraphxPackage;
import org.eclipse.emf.common.notify.Notification;
import easyflow.graph.jgraphx.ToolDependencies;
import easyflow.traversal.TraversalEvent;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph.mxICellVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.AbstractGraphImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractGraphImpl extends EObjectImpl implements AbstractGraph {
	
	
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	private static Logger logger = Logger.getLogger(Abstract.class);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGraphImpl() {
		super();
	}

	public boolean resolveTraversalEvents(mxICell root) throws TaskNotFoundException, CellNotFoundException {
		
		return resolveTraversalEvents_Grouping(root) && resolveTraversalEvents_Param(root);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JgraphxPackage.ABSTRACT_GRAPH__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
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
			case JgraphxPackage.ABSTRACT_GRAPH__GRAPH:
				setGraph((Graph)newValue);
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
			case JgraphxPackage.ABSTRACT_GRAPH__GRAPH:
				setGraph((Graph)null);
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
			case JgraphxPackage.ABSTRACT_GRAPH__GRAPH:
				return graph != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean resolveTraversalEvents_Param(mxICell root)
	{
		boolean rc = true;
		// map to track all processed traversalevents: <grouping>_<mode>_<te's root> x <Traversalevent>
		final EMap<String, TraversalEvent> allTraversalEvents = new BasicEMap<String, TraversalEvent>();
		// track deprecated traversalevents : <task> x <te name>
		final EMap<String, EList<String>> deprecatedTraversalEvents = new BasicEMap<String, EList<String>>();
		
		mxICellVisitor visitor=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task   task       = JGraphXUtil.loadTask(vertex);
					String taskString = task.getUniqueString();
					Task   parentTask = null;
					
					if (edge !=null)
						parentTask = JGraphXUtil.getSourceTask((mxCell) edge);
					
					//logger.debug("task="+task.getUniqueString());
					for (Entry<String, TraversalEvent> entry : task.getTraversalEvents()) {
						
						
						if (entry.getValue().isGrouping())
							continue;
						
						//logger.debug("te="+entry.getKey()+" keyset="+allTraversalEvents.keySet());
						TraversalEvent traversalEvent = entry.getValue();
						
						if (allTraversalEvents.containsKey(entry.getKey()))
						{
							traversalEvent = allTraversalEvents.get(entry.getKey());
							if (entry.getValue().getSplitTask() == null && !entry.getValue().getMergeTask().isEmpty())
							{
								if (parentTask == null)
								//	traversalEvent.getMergeTask().add(parentTask);
								//else
									logger.error("resolveTraversalEvents_Param(): no parent task found.");
								
								//traversalEvent.getMergeTasksParamCrit().addAll(entry.getValue().getMergeTask());
								traversalEvent.getMergeTask().addAll(entry.getValue().getMergeTask());
								EList<String> depricatedTEs = null;
								if (deprecatedTraversalEvents.containsKey(taskString))
									depricatedTEs = deprecatedTraversalEvents.get(taskString);
								else
									depricatedTEs = new BasicEList<String>();
								if (!depricatedTEs.contains(entry.getKey()))
									depricatedTEs.add(entry.getKey());
								deprecatedTraversalEvents.put(taskString, depricatedTEs);
							}
							else
							{
								logger.error("resolveTraversalEvents_Param(): merge task expected but no merge task found.");
								//rc = false;
							}

						}
						else
						{
							//logger.debug("add:"+entry.getKey()+" "+entry.getValue());
							//allTraversalEvents.add(entry);
							allTraversalEvents.put(entry.getKey(), entry.getValue());
						}
					}
					
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		getGraph().getGraph().getModel().beginUpdate();try{
			getGraph().getGraph().traverse(root, true, visitor);			
		
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		JGraphXUtil.layoutGraph();
		removeDeprecatedTraversalEvents(deprecatedTraversalEvents, allTraversalEvents);
		
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * enumerate all unique paths and update the traversal events.
	 * the traversal events are supposed to be unmerged. I.e. traversal events of the same type
	 * might occur along subsequent nodes on a path.
	 * Main concern is to merge all traversal events, that have a common splitting task. 
	 * This requires appropriate finding of
	 * the traversal event, and update the mergeTask reference attribute and finally remove 
	 * all obsolete traversal event (that are used to extend the parent tasks traversal event)
	 * so that only one (representing the splitting task) remains.
	 * TEs sharing same split and/or merging tasks might exist.
	 * <!-- end-user-doc -->
	 * @generated not
	 */	
	public boolean resolveTraversalEvents_Grouping(mxICell root) throws TaskNotFoundException, CellNotFoundException {
		
		logger.debug("############ graph="+getGraph());
		// map to track all processed traversalevents: <grouping>_<mode>_<te's root> x <Traversalevent>
		final EMap<String, TraversalEvent> allTraversalEvents = new BasicEMap<String, TraversalEvent>();
		// track deprecated traversalevents : <task> x <te name>
		final EMap<String, EList<String>> deprecatedTraversalEvents = new BasicEMap<String, EList<String>>();
		
		mxICellVisitor visitor=new mxICellVisitor() {
			String debug="resolveTraversalEvents(): ";
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				// set the current task
				//Task task=XMLUtil.loadTaskFromVertex(vertex);
				Task task         = null;
				Task parentTask   = null;
				String taskString = null;
				DataLink dataLink = null;
				try {
					task = JGraphXUtil.loadTask(vertex);
				
					taskString = task.getUniqueString();
					// set vertex's parent task
					
					if (edge != null)
					{
						parentTask = JGraphXUtil.getSourceTask((mxCell) edge);
						dataLink   = JGraphXUtil.loadDataLink(edge);
					}
					
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				debug = (parentTask==null?"null":parentTask.getUniqueString())+"=>"+task.getUniqueString()+": ";
							
				String parentTaskString = parentTask != null ? parentTask.getUniqueString() : "root";
				
				// check defined TraversalEvents for task
				for (String te : task.getTraversalEvents().keySet()) {
					
					TraversalEvent traversalEvent = task.getTraversalEvents().get(te);
					// set unique te string
					String te_unique=task.getTraversalEvents().get(te).getTraversalCriterion().getId()+"_"+
							task.getTraversalEvents().get(te).getTraversalCriterion().getMode();

					if (task.isRoot())// && traversalEvent.getMergeTask().isEmpty())
					{
						if (!traversalEvent.getMergeTask().contains(task))
							traversalEvent.getMergeTask().add(task);
						allTraversalEvents.put(te_unique+"_"+taskString, traversalEvent);
						continue;
					}
					if (!dataLink.getDataPort().isCompatible(traversalEvent.getTraversalCriterion().getDataPort()))
					{
						allTraversalEvents.put(te_unique+"_"+taskString, traversalEvent);
						continue;
					}
					TraversalEvent parentTraversalEvent = null;


					// get traversal event of parent
					if (parentTask != null &&
							parentTask.getTraversalEvents().keySet().contains(te) &&
							parentTask.getTraversalEvents().get(te).getTraversalCriterion().getMode().equals(
									task.getTraversalEvents().get(te).getTraversalCriterion().getMode()))
					{
						parentTraversalEvent = parentTask.getTraversalEvents().get(te);

					// te to be extended for this particular path
						
					//if (parentTraversalEvent != null)
					//{
						debug+="(extend:";
						// maintain merge tasks
						parentTraversalEvent.getMergeTask().add(task);

						// remove parent from parents merge task and deprecate current te only in case an unconditional edge is observed 
						if (dataLink.isUnconditional())
						{

							if (parentTraversalEvent.getMergeTask().contains(parentTask))
							{
								debug+=" remove merge task:"+parentTaskString;
								parentTraversalEvent.getMergeTask().remove(parentTask);
							}

							EList<String> depricatedTEs = null;
							if (deprecatedTraversalEvents.containsKey(taskString))
								depricatedTEs = deprecatedTraversalEvents.get(taskString);
							else
								depricatedTEs = new BasicEList<String>();
							if (!depricatedTEs.contains(te))
								depricatedTEs.add(te);
							deprecatedTraversalEvents.put(taskString, depricatedTEs);
							debug+=" change te "+te+" of task:"+taskString+" to use te of task:"+parentTaskString;
							
							task.getTraversalEvents().put(te, parentTraversalEvent);
							//traversalEvent = parentTraversalEvent;
						}
					}
					// a new te for this particular path,
					else
					{
						/*if (deprecatedTraversalEvents.containsKey(taskString))
						{
							if (deprecatedTraversalEvents.get(taskString).contains(te))
							{
								logger.debug("te found");
								TraversalEvent te2 = traversalEvent;
								traversalEvent = TraversalFactory.eINSTANCE.createTraversalEvent();
								traversalEvent.setSplitTask(task);
								traversalEvent.getMergeTask().add(task);
								traversalEvent.getParentTask().add(parentTask);
								traversalEvent.setTraversalCriterion(te2.getTraversalCriterion());
								task.getTraversalEvents().put(te, traversalEvent);
								deprecatedTraversalEvents.get(taskString).remove(te);
							}
						}*/
						
						debug+="(new:";
						// if no parent set 
						if (parentTask == null)
						{
							debug+=" no parent ";
						}
						else
						{
							debug+=" parent="+parentTaskString+" ";
							// known at the overall graph
							if (!traversalEvent.getParentTask().contains(parentTask))
							{
								traversalEvent.getParentTask().add(parentTask);
							}
							else
							{
								debug+=" but known for whole graph ";
							}
						}
						// set the traversal events merge task
						if (!traversalEvent.getMergeTask().contains(task) && traversalEvent.isGrouping())
							traversalEvent.getMergeTask().add(task);
						
						allTraversalEvents.put(te_unique+"_"+taskString, traversalEvent);
					}
					debug+=" ("+te_unique+"))";					
				}
				
				//debug+="\n";
				logger.debug(debug);
				
				//add terminal edge (dataport)
				BasicEList<DataPort> dataPorts = null;
				for (DataPort dataPort : task.getUnresolvedOutDataPorts())
				{
					if (dataPorts == null)
						dataPorts = new BasicEList<DataPort>();
					DataLink termDataLink = DataFactory.eINSTANCE.createDataLink();
					termDataLink.setInDataPort(dataPort);
					termDataLink.setTerminal(true);
					logger.debug("resolveTraversalEvents_Grouping(): add terminal edge for "+dataPort.getName()+" "+dataPort.getFormat().getName());
					getGraph().getGraph().insertEdgeEasyFlow(null, null, vertex, null, termDataLink);
					dataPorts.add(dataPort);
					
				}
				if (dataPorts != null && !dataPorts.isEmpty())
					task.getUnresolvedOutDataPorts().removeAll(dataPorts);
				
				return true;
			}
		};
		
		getGraph().getGraph().getModel().beginUpdate();try{
			getGraph().getGraph().traverseAllPaths(root, true, visitor, null);
			//getGraph().traverse(root, true, visitor);
		
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		JGraphXUtil.layoutGraph();
		removeDeprecatedTraversalEvents(deprecatedTraversalEvents, allTraversalEvents);

		
		// traverse graph to resolve traversal events implied by conditional edges
		mxICellVisitor visitor1=new mxICellVisitor() {
			
			@Override
			public boolean visit(Object vertex, Object edge) {
				try {
					Task     task     = JGraphXUtil.loadTask(vertex);
					DataLink dataLink = null;
					if (edge!= null)
					{
						dataLink = JGraphXUtil.loadDataLink(edge);
						Task parentTask = JGraphXUtil.getSourceTask((mxCell) edge);
						if (!dataLink.isUnconditional())
						{
							logger.debug("resolve traversal event for conditional edge of task="
						+parentTask.getUniqueString()+"=>"+task.getUniqueString()
						+" "+task.getTraversalEvents());
						}
					}
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DataLinkNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return true;
			}
		};
		
		getGraph().getGraph().getModel().beginUpdate();try{
			getGraph().getGraph().traverseAllPaths(root, true, visitor1, null);
		JGraphXUtil.layoutGraph();
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		//logger.debug("#traversalEvents="+getTraversalEvents().size()+" #"+getTraversalEvents(getDefaultRootCell(), true).size()+" root"+getDefaultRootCell());
		return true;
	}


	private boolean removeDeprecatedTraversalEvents(EMap<String, EList<String>> deprecatedTraversalEvents, EMap<String, TraversalEvent> allTraversalEvents)
	{
		boolean rc = true;
		// remove deprecated traversal events
		for (String task: deprecatedTraversalEvents.keySet())
		{
			for (String te : deprecatedTraversalEvents.get(task))
			{
				logger.debug("resolveTraversalEvents(): "
						+"removed traversal event "
						+((TraversalEvent)GlobalVar.getTasks().get(task).getTraversalEvents().get(te)).hashCode()
						+" "+te+" from task "+task);
				if (GlobalVar.getTasks().get(task).getTraversalEvents().removeKey(te)==null)
					rc = false;
			}
		}
		
		for (String key:allTraversalEvents.keySet()) {
			//System.out.println(key+" "+traversalEventsByParent.get(key).keySet());
			
				String parentTasks="("+StringUtils.join(GraphUtil.getTaskStringList(allTraversalEvents.get(key).getParentTask()), ", ")+")";
				String mergeTasks="("+StringUtils.join(GraphUtil.getTaskStringList(allTraversalEvents.get(key).getMergeTask()), ", ")+")";
				String paramMergeTasks="("+StringUtils.join(GraphUtil.getTaskStringList(allTraversalEvents.get(key).getMergeTasksParamCrit()), ", ")+")";
				TraversalEvent traversalEvent=allTraversalEvents.get(key);
				//if (traversalEvent.getType().equals("grouping"))
				logger.debug("resolveTraversalEvents(): "+"processed traversal event "+key+" with"
						+" Parent:"+parentTasks
						+" Split:"+(traversalEvent.getSplitTask() != null ? 
								traversalEvent.getSplitTask().getUniqueString():null)
						+" Merge:"+mergeTasks+", paramMerge="+paramMergeTasks+""
						+" DataPort:"+(traversalEvent.getTraversalCriterion().getDataPort()!=null?
								traversalEvent.getTraversalCriterion().getDataPort().getName():null)
						+" te_type="+traversalEvent.getType()+" crit="+traversalEvent.getTraversalCriterion().getId()
						+" te_mode="+traversalEvent.getTraversalCriterion().getMode()
						//+traversalEvent.isFoundMergeTask()
						//+" "+traversalEvent.hashCode()
						);
		}
		return rc;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.ABSTRACT_GRAPH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.ABSTRACT_GRAPH__GRAPH, oldGraph, graph));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.ABSTRACT_GRAPH__GRAPH, oldGraph, graph));
	}

} //AbstractImpl
