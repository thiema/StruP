/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.util.AbstractMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import java.util.Map.Entry;

import easyflow.core.PreprocessingTask;
import easyflow.util.Severity;
import easyflow.core.Task;
import easyflow.core.impl.TaskImpl;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.graph.jgraphx.Graph;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.ui.GlobalConfig;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GraphUtil;
import easyflow.custom.util.Util;
import easyflow.data.DataFactory;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.graph.impl.DefaultGraphImpl;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.PreprocessingGraph;
import easyflow.graph.jgraphx.Preprocessing;
import easyflow.graph.jgraphx.UntranslatedLink;
import easyflow.tool.Parameter;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalEvent;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph.mxICellVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preprocessing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.PreprocessingGraphImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreprocessingGraphImpl extends DefaultGraphImpl implements PreprocessingGraph {
	
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	private static Logger logger = Logger.getLogger(Preprocessing.class);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreprocessingGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EMap<mxICell, EList<mxICell>> findCellsWherePreprocessingIsRequired()
	{
		logger.debug("findCellsWherePreprocessingIsRequired(): defined utilityTasks="+GlobalVar.getUtilityTasks().keySet());
		final EMap<mxICell, EList<mxICell>> prepRequired = new BasicEMap<mxICell, EList<mxICell>>();
		final EList<mxICell> obsoleteCells = new BasicEList<mxICell>();
		final EList<Object> processedEdges = new BasicEList<Object>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				try {
					Task task = JGraphXUtil.loadTask(vertex);
					Task parentTask = JGraphXUtil.getSourceTask((mxCell) edge);
					
					if (!task.getPreprocessingTasks().isEmpty())
					{
						Iterator<PreprocessingTask> it = task.getPreprocessingTasks().iterator();
						boolean first = true;
						while (it.hasNext())
						{
							//boolean add = false;
							//PreprocessingTask prepTask = EcoreUtil.copy(it.next());
							PreprocessingTask prepTask = it.next();
							
							DataLink dataLink = null;
							Object   inEdge   = null;
							
							// get the incoming edge, which matches the port associated to the preptask
							DataPort requiredDataPort = task.getInDataPorts().get(prepTask.getDataPortIndex());
							logger.debug("findCellsWherePreprocessingIsRequired(): task="+task.getUniqueString()
									+" required dataport="+requiredDataPort.getName()
									+" "+requiredDataPort.getFormat().getName());
							for (Object edgeIn : getGraph().getGraph().getIncomingEdges(vertex))
							{
								DataLink testDataLink = JGraphXUtil.loadDataLink(edgeIn);
								logger.trace("findCellsWherePreprocessingIsRequired():  test against "+testDataLink.getInDataPort().getName());
								if (requiredDataPort.isCompatible(testDataLink.getInDataPort()))
								{
									dataLink = testDataLink;
									inEdge   = edgeIn;
									break;
								}
							}
							
							if (dataLink == null)
							{
								logger.info("findCellsWherePreprocessingIsRequired(): could not find dataport for preptask="+prepTask.getName()
										+" of task="+task.getUniqueString()+". assume new datalink.");
							}
							
							try 
							{
								logger.debug("findCellsWherePreprocessingIsRequired(): trying to find util task="
										+prepTask.getName()+" for task="+task.getUniqueString()
										+" for dataport="
										//+dataLink.getDataPort().getName()+" "+dataLink.getDataPort().getFormat().getName()
										+requiredDataPort.getFormat().getName()
										);
								Task utilTask = dataLink == null ?
										GraphUtil.getUtilityTask(requiredDataPort, prepTask.getName(), task) :
										GraphUtil.getUtilityTask(dataLink, prepTask.getName(), task);

								logger.debug("findCellsWherePreprocessingIsRequired(): util task="+utilTask.getUniqueString()+" found.");
								
								EList<mxICell> prepEdges = prepRequired.containsKey(vertex) ? prepRequired.get(vertex) : new BasicEList<mxICell>();

								//if (dataLink == null)
								{
									DataPort testDataPort = utilTask.getInDataPorts().get(0);
									// create edge(s) (copy from all ingoing edges, which matches the dataport)
									for (Object edgeIn : getGraph().getGraph().getIncomingEdges(vertex))
									{
										if (processedEdges.contains(edgeIn))
											continue;
										DataLink testDataLink = JGraphXUtil.loadDataLink(edgeIn);
										Task sourceTask = JGraphXUtil.getSourceTask((mxCell) edgeIn);
										mxICell source = JGraphXUtil.getSource((mxCell) edgeIn);
										if (testDataLink.getInDataPort().isCompatible(testDataPort))
										{
											if (dataLink == null || true)
											{
												PreprocessingTask prepTaskTmp = EcoreUtil.copy(prepTask);
												Task newPrepTask = EcoreUtil.copy(utilTask);
												GraphUtil.copyTask(utilTask, newPrepTask);
												newPrepTask.setName(newPrepTask.getName()+"_for_"+task.getName());
												newPrepTask.getChunks().addAll(EcoreUtil.copyAll(sourceTask.getChunks()));
												GlobalVar.getTasks().put(newPrepTask.getUniqueString(), newPrepTask);
	
												prepTaskTmp.setTask(newPrepTask);

												DataLink dataLinkTmp = DataFactory.eINSTANCE.createDataLink();
												dataLinkTmp.setInDataPort(requiredDataPort);
												//dataLink.setDataPort(requiredDataPort);
												//dataLink.setInDataPort(testDataPort);
												dataLinkTmp.setDataPort(testDataPort);
												dataLinkTmp.setId(0);
											
												logger.debug("findCellsWherePreprocessingIsRequired(): prepTask="+prepTaskTmp.getName()+": "+prepTaskTmp.getTask().getUniqueString()
														//+" first="+first+" insertEdge="+insertEdge
														);
												logger.debug("findCellsWherePreprocessingIsRequired(): insert Edge: "+sourceTask.getUniqueString()+" -> "+task.getUniqueString());
												dataLinkTmp.getIntermediateTasks().add(prepTaskTmp);
												
												Object e = getGraph().getGraph().insertEdgeEasyFlow(null, null, 
																source, vertex, dataLinkTmp);
												processedEdges.add(e);
												prepEdges.add((mxICell) e);
												if (dataLink != null)
													obsoleteCells.add((mxICell) edgeIn);
												
											}
											else
											{
												Task newPrepTask = EcoreUtil.copy(utilTask);
												GraphUtil.copyTask(utilTask, newPrepTask);

												newPrepTask.setName(newPrepTask.getName()+"_for_"+task.getName());
												newPrepTask.getChunks().addAll(EcoreUtil.copyAll(parentTask.getChunks()));
												GlobalVar.getTasks().put(newPrepTask.getUniqueString(), newPrepTask);
												prepTask.setTask(newPrepTask);
												logger.debug("findCellsWherePreprocessingIsRequired(): prepTask="+prepTask.getName()+": "+prepTask.getTask().getUniqueString());
												if (!prepEdges.contains(inEdge))
													prepEdges.add((mxICell) inEdge);
												dataLink.getIntermediateTasks().add(prepTask);
											}
										}
									}
								}
								/*else
								{
									Task newPrepTask = EcoreUtil.copy(utilTask);
									GraphUtil.copyTask(utilTask, newPrepTask);

									newPrepTask.setName(newPrepTask.getName()+"_for_"+task.getName());
									newPrepTask.getChunks().addAll(EcoreUtil.copyAll(parentTask.getChunks()));
									GlobalVar.getTasks().put(newPrepTask.getUniqueString(), newPrepTask);
									prepTask.setTask(newPrepTask);

									if (!prepEdges.contains(inEdge))
										prepEdges.add((mxICell) inEdge);
									dataLink.getIntermediateTasks().add(prepTask);
								}*/

								logger.debug("findCellsWherePreprocessingIsRequired(): preprocessing task "
										+prepTask.getName()+" added for "+task.getUniqueString());
								//getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_UTILITY_ADD_UTILITY_TASK_3, Severity.INFO,
									//	Util.generateStringList(prepTask.getName(), task.getUniqueString(), dataLink.getUniqueString()));
								prepRequired.put((mxICell) vertex, prepEdges);
							}
							catch (UtilityTaskNotFoundException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
								logger.warn("findCellsWherePreprocessingIsRequired(): omit preprocessing tasks for "+task.getUniqueString()
										+": Preptask="+prepTask.getName()+" expression="+prepTask.getExpression()
										+" found="+(GlobalVar.getUtilityTasks().get(prepTask.getName())!=null)
										+" dataport="+dataLink.getDataPort().getName()+" "+dataLink.getDataPort().getFormat().getName());
							}
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
		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverse(getGraph().getDefaultRootCell(), true, visitor);
			getGraph().getGraph().removeCells(obsoleteCells.toArray(), true);
			JGraphXUtil.layoutGraph();
			
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		return prepRequired;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws DataLinkNotFoundException 
	 * @throws TaskNotFoundException 
	 * @generated not
	 */
	public boolean resolvePreprocessingTask(mxICell vertex, mxICell edge) throws DataLinkNotFoundException, TaskNotFoundException {
		
		boolean nested = true;
		if (nested)
			return resolvePreprocessingTaskChained(vertex, edge);
		else
			return resolvePreprocessingTaskParallel(vertex, edge);
	}
		
		
	private boolean resolvePreprocessingTaskParallel(mxICell vertex, mxICell edge) throws TaskNotFoundException, DataLinkNotFoundException
	{
		boolean rc = false;
		Task task  = JGraphXUtil.loadTask(vertex);
		Iterator<PreprocessingTask> it = JGraphXUtil.loadDataLink(edge).getIntermediateTasks().iterator();
		DataLink dataLink              = JGraphXUtil.loadDataLink(edge);
		
		
		getGraph().getGraph().getModel().beginUpdate();		try		{
		
		while (it.hasNext())
		{
			
			PreprocessingTask prepTask = it.next();
			Task newPrepTask = prepTask.getTask();
			logger.trace("resolvePreprocessingTask(): insertPrepTask="+newPrepTask.getUniqueString()+" for "+task.getUniqueString()+" "+prepTask.getTask().getPreferredTool());
			rc = true;
			// insert the new vertex 
			Object newVertex = getGraph().getGraph().insertVertexEasyFlow(null, null, newPrepTask);
			GlobalVar.getCells().put(newPrepTask.getUniqueString(), (mxICell) newVertex);
			// link with parent
			getGraph().getGraph().insertEdgeEasyFlow(null, null, JGraphXUtil.getSource((mxCell) edge), newVertex, GraphUtil.copyDataLink(dataLink));
			// link with child
			getGraph().getGraph().insertEdgeEasyFlow(null, null, newVertex, vertex, GraphUtil.copyDataLink(dataLink));
			
		}

		// remove obsolet parent and child edge
		getGraph().getGraph().removeCells(new Object[]{edge}, true);

		
			
			JGraphXUtil.layoutGraph();
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		return rc;
		
		
	}
	
	private mxICell findExistingUtilityTaskFor(String utilTaskString, Task source, String key, TraversalChunk chunk) throws TaskNotFoundException, DataLinkNotFoundException
	{
		EList<TraversalChunk> chunks = new  BasicEList<TraversalChunk>();
		chunks.add(chunk);
		EMap<String, EList<TraversalChunk>> chunksMap = new BasicEMap<String, EList<TraversalChunk>>();
		chunksMap.put(key, chunks);
		return findExistingUtilityTaskFor(utilTaskString, source, chunksMap);
	}
	
	private mxICell findExistingUtilityTaskFor(String utilTaskString, Task source, EMap<String, EList<TraversalChunk>> chunks) throws TaskNotFoundException, DataLinkNotFoundException
	{
		mxICell sourceCell = (mxICell) GlobalVar.getCells().get(source.getUniqueString());
		logger.debug("findExistingUtilityTaskFor(): check for presence of utilitytask="+utilTaskString+" as direct child of task="+source.getUniqueString()+" with chunks="+Util.list2String(chunks.get(0).getValue(), null));
		for (Object edgeOut : getGraph().getGraph().getOutgoingEdges(sourceCell))
		{
			Task target = JGraphXUtil.getTargetTask((mxCell) edgeOut);
			if (!target.isUtil() && !target.getAnalysisTypes().equals(utilTaskString))
				continue;
			
			boolean missingKey = false;
			DataLink dataLink = JGraphXUtil.loadDataLink(edgeOut);
			boolean missingChunks = false;
			for (String key : chunks.keySet())
			{
				if (!dataLink.getChunks().containsKey(key))
				{
					missingKey = true;
					break;
				}

				if (dataLink.getChunks().get(key).size() != chunks.get(key).size())
				{
					missingChunks = true;
					break;
				}
				for (TraversalChunk tcProvided : dataLink.getChunks().get(key))
				{
					boolean found = false;
					for (TraversalChunk tcRequired : chunks.get(key))
					{
						if (tcRequired.getName().equals(tcProvided.getName()))
						{
							found = true;
							break;
						}
					}
					if (!found)
					{
						missingChunks = true;
						break;
					}
				}
				if (missingChunks)
					break;
					
			}
			if (missingChunks)
			{
				logger.debug("findExistingUtilityTaskFor(): skip target="+target.getUniqueString()+" (missing chunk(s))");
				continue;
			}
			if (missingKey)
			{
				logger.debug("findExistingUtilityTaskFor(): skip target="+target.getUniqueString()+" (missing key(s))");
				continue;
			}
			logger.debug("findExistingUtilityTaskFor(): found target="+target.getUniqueString()+" chunks="+dataLink.getChunks().keySet());
			return (mxICell) edgeOut;
		}
		return null;
	}
	
	private Task findExistingUtilityTaskFor(String utilTaskString, Object edge) throws TaskNotFoundException, DataLinkNotFoundException
	{
		Task   utilityTask = null;
		Object prepVertex  = null;
		Task source = JGraphXUtil.getSourceTask((mxCell) edge);
		Task target = JGraphXUtil.getTargetTask((mxCell) edge);
		mxICell sourceVertex = JGraphXUtil.getSource((mxCell) edge);
		logger.debug("findExistingUtilityTaskFor(): find existing utility task="+utilTaskString+" inbetween of "+source.getUniqueString()+" "+target.getUniqueString());
		if (GlobalVar.getUtilityTasks().containsKey(utilTaskString) && GlobalVar.getUtilityTasks().get(utilTaskString) != null)
		{
			Task tmp = GlobalVar.getUtilityTasks().get(utilTaskString);
			Object parent = findParentForPrepVertexForPrepTask(sourceVertex, tmp);
			if (parent != null)
				prepVertex = findPrepVertexForPrepTask(parent, tmp);
			if (prepVertex != null)
			{
				utilityTask = JGraphXUtil.loadTask(prepVertex);
				logger.debug("createUtilityTask(): found prep task="+utilityTask.getUniqueString());
			}
		}
		return utilityTask;
	}
	

	
	// go along "identity"-utility tasks (e.g. BAM->BAM) and find the most distant from vertex
	private Object findParentForPrepVertexForPrepTask(Object vertex, Task prepTask) throws TaskNotFoundException, DataLinkNotFoundException
	{
		Object parent = vertex;
		for (Object edgeOut : getGraph().getGraph().getOutgoingEdges(vertex))
		{
			DataLink dataLink = JGraphXUtil.loadDataLink(edgeOut);
			if (dataLink.isTerminal())
				continue;
			Task testTask = JGraphXUtil.getTargetTask((mxCell) edgeOut);
			if (testTask.isUtil() &&
				testTask.isIdentityTransformation(prepTask.getInDataPorts().get(0))
				)
			{
				parent = findParentForPrepVertexForPrepTask(JGraphXUtil.getTarget((mxCell) edgeOut), prepTask);
				break;
			}
		}
		return parent;
	}
	
	private boolean isIdenticalPrepTask(Task prepTask,  Task testTask)
	{
		return (testTask.isUtil() &&
				testTask.getAnalysisTypes().equals(prepTask.getAnalysisTypes()) &&
				prepTask.isCompatibleWithOutDataPortFor(testTask.getInDataPorts().get(0)) &&
				prepTask.isCompatibleWithInDataPortFor(testTask.getOutDataPorts().get(0))
				);
				

	}
	
	// check if there is already a preprocessing task (and vertex) inserted for prepTask
	private Object findPrepVertexForPrepTask(Object vertex, Task prepTask) throws TaskNotFoundException, DataLinkNotFoundException
	{
		
		if (isIdenticalPrepTask(prepTask, JGraphXUtil.loadTask(vertex)))
			return vertex;
		
		Object prepVertex = null;
		for (Object edgeOut : getGraph().getGraph().getOutgoingEdges(vertex))
		{
			DataLink dataLink = JGraphXUtil.loadDataLink(edgeOut);
			if (dataLink.isTerminal())
				continue;

			Task testTask = JGraphXUtil.getTargetTask((mxCell) edgeOut);
			if (isIdenticalPrepTask(prepTask, testTask))
			{
				prepVertex = JGraphXUtil.getTarget((mxCell) edgeOut);
				break;
			}
		}
		return prepVertex;
	}
	
	private boolean resolvePreprocessingTaskChained(mxICell vertex, mxICell edge) throws DataLinkNotFoundException, TaskNotFoundException {
		
		boolean  rc       = false;
		Task     task     = JGraphXUtil.loadTask(vertex);
		DataLink dataLink = JGraphXUtil.loadDataLink(edge);
		boolean  first    = true;
		mxICell  last     = null;
		
		logger.debug("resolvePreprocessingTask(): process intermediate tasks "
				+ "for task="+task.getUniqueString()+" dataLink="+dataLink.getUniqueString());
		Iterator<PreprocessingTask> it  = dataLink.getIntermediateTasks().iterator();

		// init with source
		Object lastCompatibleVertex = JGraphXUtil.getSource((mxCell) edge);

		boolean incompatibleParentFound = false;
		
		getGraph().getGraph().getModel().beginUpdate();		try		{
		
		while (it.hasNext())
		{
			mxICell           source      = first ? JGraphXUtil.getSource((mxCell) edge) : last;
			                  first       = false;
			PreprocessingTask prepTask    = it.next();
			Task              newPrepTask = prepTask.getTask();
			
			logger.debug("resolvePreprocessingTask(): insertPrepTask="+newPrepTask.getUniqueString()+" ("+newPrepTask.hashCode()+")"
					+" type="+newPrepTask.getAnalysisTypes()
					+" for "+task.getUniqueString()+" "
					+prepTask.getTask().getPreferredTool().getId()
					+" output compatibility to port="+dataLink.getInDataPort().getFormat().getName()
					+" ("+newPrepTask.isCompatibleWithInDataPortFor(dataLink.getInDataPort())+")"
					+" prep tasks dataport="+task.getInDataPorts().get(prepTask.getDataPortIndex()).getName());
			
			        rc             = true;
			boolean reusedPrepTask = false;
			Object  newVertex      = null;
			Object  newSource      = null;
			// check if this preprocessing task is already inserted
			if (incompatibleParentFound)
			{
				logger.debug("resolvePreprocessingTask(): check "+JGraphXUtil.loadTask(lastCompatibleVertex).getUniqueString()+" "+newPrepTask.getUniqueString());
				newSource = findParentForPrepVertexForPrepTask(lastCompatibleVertex, newPrepTask);
				logger.debug("resolvePreprocessingTask(): got new parent="+JGraphXUtil.loadTask(newSource).getUniqueString());
				//newVertex = findPrepVertexForPrepTask(lastCompatibleVertex, newPrepTask);
				newVertex = findPrepVertexForPrepTask(newSource, newPrepTask);
				if (newVertex != null)
				{
					logger.debug("resolvePreprocessingTask(): got final vertex="+JGraphXUtil.loadTask(newVertex).getUniqueString());
				}
			}
			else
			{
				logger.debug("resolvePreprocessingTask(): search parent for "
						+" preptask="+newPrepTask.getUniqueString()
						+" of task="+JGraphXUtil.loadTask(source).getUniqueString()
						);
				newSource = findParentForPrepVertexForPrepTask(source, newPrepTask);
				logger.debug("resolvePreprocessingTask(): got new parent="+JGraphXUtil.loadTask(newSource).getUniqueString());
				newVertex = findPrepVertexForPrepTask(newSource, newPrepTask);
				if (newVertex != null)
				{
					logger.debug("resolvePreprocessingTask(): got final vertex="+JGraphXUtil.loadTask(newVertex).getUniqueString());
				}
			}
			if (newSource != null)
				source = (mxICell) newSource;
			
			// insert the new vertex
			if (newVertex == null)
				newVertex = getGraph().getGraph().insertVertexEasyFlow(null, null, newPrepTask);
			else
				reusedPrepTask = true;
			
			if (incompatibleParentFound)
			{
				incompatibleParentFound = false;
				getGraph().getGraph().insertEdgeEasyFlow(null, null, lastCompatibleVertex, newVertex, 
						//copyDataLink(dataLink)
						GraphUtil.createDataLink(dataLink, JGraphXUtil.loadTask(lastCompatibleVertex), dataLink.getInDataPort())
						);
				logger.debug("resolvePreprocessingTask(): insert edge: "+JGraphXUtil.loadTask(lastCompatibleVertex).getUniqueString()+" => "+newPrepTask.getUniqueString());
			}

			if (newPrepTask.isCompatibleWithInDataPortFor(dataLink.getInDataPort()))
				lastCompatibleVertex = newVertex;
			else
			{
				incompatibleParentFound = true;
			}
			
			if (!reusedPrepTask)
			{
				GlobalVar.getCells().put(newPrepTask.getUniqueString(), (mxICell) newVertex);
			
				// link with parent
				getGraph().getGraph().insertEdgeEasyFlow(null, null, source, newVertex, 
						//copyDataLink(dataLink, loadTask(source))
						GraphUtil.createDataLink(dataLink, JGraphXUtil.loadTask(source), dataLink.getDataPort())
						);
				logger.debug("resolvePreprocessingTask(): insert edge: "+JGraphXUtil.loadTask(source).getUniqueString()+" => "+newPrepTask.getUniqueString());
			}
			last = (mxICell) newVertex;
		}
		
		if (incompatibleParentFound)
		{		 
			Task lastCompatibleTask = JGraphXUtil.loadTask(lastCompatibleVertex);
			logger.debug("trying to link with last compatible task="+lastCompatibleTask.getUniqueString()+"("+lastCompatibleVertex+")");
			DataLink newDataLink = GraphUtil.createDataLink(dataLink, lastCompatibleTask, dataLink.getInDataPort());
			getGraph().getGraph().insertEdgeEasyFlow(null, null, lastCompatibleVertex, vertex, 
					newDataLink
					);
			logger.debug("resolvePreprocessingTask(): insert edge:"+lastCompatibleTask.getUniqueString()+"=>"+JGraphXUtil.loadTask(vertex).getUniqueString());
		}
		Task lastTask = JGraphXUtil.loadTask(last);
		logger.debug("resolvePreprocessingTask(): trying to link with last task="+lastTask.getUniqueString());
		DataLink newDataLink = GraphUtil.createDataLink(dataLink, lastTask, dataLink.getInDataPort());
		Object o = getGraph().getGraph().insertEdgeEasyFlow(null, null, last, vertex, 
				newDataLink
				);
		logger.debug("resolvePreprocessingTask(): insert edge:"+lastTask.getUniqueString()+"=>"+JGraphXUtil.loadTask(vertex).getUniqueString());
		//DataLink testdl = JGraphXUtil.loadDataLink(o);
		
		// remove obsolet parent and child edge
		logger.debug("resolvePreprocessingTask(): remove obsolete edge: "
				+ "from task: "+JGraphXUtil.getSourceTask((mxCell) edge).getUniqueString()
				+ " to: "+JGraphXUtil.getTargetTask((mxCell) edge).getUniqueString());
		getGraph().getGraph().removeCells(new Object[]{edge}, true);
		
		JGraphXUtil.layoutGraph();	
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}
		
		return rc;
	}
	
	private EList<EList<Object>> stratifyByDataport(Object[] edges)
	{
		EList<EList<Object>> rc = new BasicEList<EList<Object>>();
		EList<Object> list = new BasicEList<Object>();
		for (Object e : edges)
		{
			list.add(e);	
		}
		
		rc.add(list);
		
		return rc;
	}

	/**
	 * 
	 * A tool can support the following dataport types as in/outgoing dataports:
	 * (assume all dataports are of same type/format e.g. BAM)
	 * 
	 *                                                1 1 1
	 *                                                | | |
	 *  - multiple dataports                         _| | |
	 *  - multiple (different) Instances in dataports___| |
	 *  - multiple Instances in single dataport      _____|
	 *
	 * Examples:
	 * 
	 * - Rec:ID1_PartA, Rec:ID1_PartB                 1 0 0
	 * - Rec:ID1, Rec:ID2                             0 1 0
	 * - Rec:ID1_ID2                                  0 0 1
	 * - Rec:ID1, Rec:ID2_ID3                         0 1 1
	 * - Rec:ID1_ID2, Rec:ID3_ID4                     0 1 1
	 * - Rec:ID1_PartA, Rec:ID1_PartB, Rec:ID2        1 1 0
	 * - Rec:ID1_PartA, Rec:ID1_PartB, Rec:ID2_ID3    1 1 1
	 * - In case of 0x001 then 0x010 is usually implied (if more then one dataport occurs)
	 * 
	 * Mixed chunks : (not sure if this works)
	 * 
	 * - Rec:ID1_ID2, Rec:ID2_ID3
	 * 
	 * <!-- begin-user-doc -->
	 * 
	 * find tasks and all incoming datalinks that cannot be directly processed, i.e.
	 * another task is required to prepare (e.g. filter/merge) the inputs.
	 *   
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<UntranslatedLink> findCellsWithUntranslatedDataLinks() {
		
		//final EMap<mxICell, EList<mxICell>> edges = new BasicEMap<mxICell, EList<mxICell>>();
		final EList<UntranslatedLink> untranslatedLinks = new BasicEList<UntranslatedLink>();
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge0)
			{
				EList<EList<Object>> outer = stratifyByDataport(getGraph().getGraph().getIncomingEdges(vertex));
				for (EList<Object> edges : outer)
				{
					UntranslatedLink untranslatedLink = null;
					int hasMultipleDataports = 0;
					int hasMultipleInstances = 0;
					int hasMultipleInstancesPerDataport = 0;
					if (edges.size() > 1)
					{
						 hasMultipleDataports = GlobalConstants.MULTIPLE_DATAPORTS;
						 //we assume instances to be different, currently there is no
						 //support for partial/chunked instances
						 hasMultipleInstances = GlobalConstants.MULTIPLE_INSTANCES;
					}
					
					for (Object edge : edges) try {
						
						int dataportState = hasMultipleDataports + hasMultipleInstances;
						DataLink dataLink = JGraphXUtil.loadDataLink(edge);
						if (dataLink.getDataPort().isStatic())
							continue;
	
						Task sourceTask = JGraphXUtil.getSourceTask((mxCell) edge);
						//Task targetTask=getTargetTask((mxCell) edge);
						Task task = JGraphXUtil.loadTask(vertex);
	
						EList<TraversalChunk> targetChunks  = task.getChunks().get(dataLink.getGroupingStr());
						EList<TraversalChunk> sourceChunks  = sourceTask.getChunks().get(dataLink.getParentGroupingStr());
						EList<TraversalChunk> inputs        = task.getInputs(true);
						EList<TraversalChunk> srcInputs  = sourceTask.getInputs(true);
						EList<TraversalChunk> records       = task.getRecords(true);
						EList<TraversalChunk> srcRecords = sourceTask.getRecords();
						
						if (inputs.size() > 1)
							hasMultipleInstancesPerDataport = GlobalConstants.MULTIPLE_INSTANCES_PER_DATAPORT;
						dataportState += hasMultipleInstancesPerDataport;
						
						
						String sourceBasicGrouping = GlobalConstants.METADATA_INPUT.equals(dataLink.getParentGroupingStr()) ? 
								GlobalConstants.METADATA_INPUT : GlobalConstants.TRAVERSAL_CRITERION_RECORD;
						String targetBasicGrouping = GlobalConstants.METADATA_INPUT.equals(dataLink.getGroupingStr())       ? 
								GlobalConstants.METADATA_INPUT : GlobalConstants.TRAVERSAL_CRITERION_RECORD;
						DataPort dataPortTarget  = dataLink.getDataPort();
						DataPort dataPortSource  = dataLink.getInDataPort();
						
						logger.debug("findCellsWithUntranslatedDataLinks(): "
								+"test "+task.getUniqueString()
								+" (against:"+sourceTask.getUniqueString()+"): "
								+ dataLink.getParentGroupingStr()+"= "
								+Util.list2String(sourceChunks, null)
								+" ==>> "+dataLink.getGroupingStr()+"= "
								+Util.list2String(targetChunks, null));
						logger.debug("findCellsWithUntranslatedDataLinks(): "
								+" groupings="+dataLink.getChunks().keySet()
								+" dataport="+dataPortTarget.getName()+" "
								+" grouping crits(source)="+Util.list2String(sourceTask.getGroupingCriteria().keySet(), null)
								+" grouping crits(port)="+Util.list2String(dataPortTarget.getGroupingCriteria(), null)
								);
						logger.debug("findCellsWithUntranslatedDataLinks(): "
								+"src inputs=["+Util.list2String(srcInputs, null)
								+"], src records=["+Util.list2String(srcRecords, null)
								+"]==>> "
								+ "inputs=["+Util.list2String(inputs, null)
								+"], records=["+Util.list2String(records, null)+"]"
								);
						
						boolean found = false;
						assert dataLink.getGroupingStr() != null;
												
						if (!dataLink.getGroupingStr().equals(dataLink.getParentGroupingStr()))// && !sourceTask.isRoot())
						{
							if (sourceTask.canProvideDataPort(null, dataPortTarget, dataLink.getGroupingStr(), null, false))
							{
								found = true;
								logger.debug("findCellsWithUntranslatedDataLinks(): source task can be configured to generate required grouping.");
							}
							// somehow get the relevant outdataport of source task
							else if (task.canConsumeDataPort(null, dataPortSource, dataLink.getParentGroupingStr(), null, false))
							{
								found = true;
								logger.debug("findCellsWithUntranslatedDataLinks(): task can be configured to accepted grouping as provided by source task.");
							}
							else if (GlobalConstants.METADATA_INPUT.equals(dataLink.getGroupingStr())
									&& sourceTask.canProvideDataPort(null, null, GlobalConstants.METADATA_INPUT, inputs, false))
							{
								found = true;
								logger.debug("findCellsWithUntranslatedDataLinks(): direct conversion found (of grouping="+dataLink.getGroupingStr()+").");
							}
							// check if the required chunk is entirely provided by the parent, i.e.
							// conversion: RG1 -> ID1
							// in metadata a record is defined to be "ID1 RG1 ..." and data RG1 is the same as data ID1 
							else if (!GlobalConstants.METADATA_INPUT.equals(dataLink.getGroupingStr())
									&& records.size() == sourceChunks.size()
									&& sourceTask.canProvideDataPort(null, null, GlobalConstants.TRAVERSAL_CRITERION_RECORD, records, false))
							{
								found = true;
								logger.debug("findCellsWithUntranslatedDataLinks(): direct conversion found.");
							}
						}
						// for identical groupings check if the instances are the same
						else if (((TaskImpl)task).isEqual(targetChunks, sourceChunks, true))
						{
							found = true;
							logger.debug("findCellsWithUntranslatedDataLinks(): direct conversion found (identical grouping="+dataLink.getGroupingStr()+").");
						}
						
						if (!found)
						{
							Parameter parameter = task.getPreferredTool().getCommand().getDataParamForDataPort(dataPortTarget, false).getParameter();
							parameter.merge(task.getPreferredTool().getTemplateParameter(parameter));
							
							boolean needConversion = true;
							if (dataportState > 0)
							{
								
								needConversion = false;
								
								logger.debug("findCellsWithUntranslatedDataLinks(): dataportState="+dataportState
									+" multi dataports="+
									parameter.isMultiple(null)
									//task.canProcessMultipleInputsFor(null, dataPortTarget)
									+"("+((dataportState & GlobalConstants.MULTIPLE_DATAPORTS) > 1)+")"
									+" multi instances="+
									parameter.isMultipleInstances(null)
									//task.canProcessMultipleInstancesFor(null, dataPortTarget)
									+"("+((dataportState & GlobalConstants.MULTIPLE_INSTANCES) > 1)+")"
									+" multi instances/dataport="+
									parameter.isMultipleInstancesPerDataport(null)
									//task.canProcessMultipleInstancesPerDataportFor(null, dataPortTarget)
									+"("+((dataportState & GlobalConstants.MULTIPLE_INSTANCES_PER_DATAPORT) > 1)+")");
							
								if ((dataportState & GlobalConstants.MULTIPLE_DATAPORTS) == GlobalConstants.MULTIPLE_DATAPORTS && 
									//!task.canProcessMultipleInputsFor(null, dataPortTarget)
									!parameter.isMultiple(null)
									)
									needConversion = true;
								if ((dataportState & GlobalConstants.MULTIPLE_INSTANCES) == GlobalConstants.MULTIPLE_INSTANCES && 
									//!task.canProcessMultipleInstancesFor(null, dataPortTarget)
									!parameter.isMultipleInstances(null)
									) 
									needConversion = true;
								if ((dataportState & GlobalConstants.MULTIPLE_INSTANCES_PER_DATAPORT) == GlobalConstants.MULTIPLE_INSTANCES_PER_DATAPORT &&
									//!task.canProcessMultipleInstancesPerDataportFor(null, dataPortTarget)
									!parameter.isMultipleInstancesPerDataport(null)
									)
									needConversion = true;
							}
							if (needConversion)
							{
								logger.debug("findCellsWithUntranslatedDataLinks(): special conversion is required. track task in map. ");
								if (untranslatedLink == null)
								{
									untranslatedLink = JgraphxFactory.eINSTANCE.createUntranslatedLink();
									//untranslatedLink.setSource(sourceTask);
									untranslatedLink.setTarget(task);
									
									untranslatedLink.getUntranslatedLinks().put(dataPortTarget.getName(), 
													JGraphXUtil.getInEdgesForDataPort(vertex, dataLink.getDataPort()));
								}
								
								// examples:
								// 1. task's input datalink has multiple chunks
								
								// check if the parent output has to be filtered
								// - 1) filtering not necessary (because it just outputs the equivalent of a single record/input entity)
								// - 2) filtering not necessary (because the parent can do it itself)
								logger.debug("findCellsWithUntranslatedDataLinks():"
										+ " #recs(source)="+srcRecords.size()+" "+sourceTask.getRecords().size()
										+ " source can provide filtering="+sourceTask.canProvideDataPort(null, null, sourceBasicGrouping, null, true)
										+ " tool isMultipleInstancesPerDataport="+parameter.isMultipleInstancesPerDataport(null));
								if (
										((//sourceBasicGrouping.equals(GlobalConstants.METADATA_INPUT) && 
										//(sourceTask.getRecords().size() == 1) ||
										srcRecords.size() == 1 ||
										//chunks.size() > sourceChunks.size() ||
										sourceTask.canProvideDataPort(null, null, sourceBasicGrouping, null, true)) || 
										(parameter.isMultipleInstancesPerDataport(null)) 
										)
									)
								{
									logger.debug("findCellsWithUntranslatedDataLinks(): mark to skip filtering.");
									//task.setFlags(task.getFlags() | GlobalConstants.UTILITY_TASK_DO_NOT_FILTER);
									dataLink.setFlags(dataLink.getFlags() | GlobalConstants.UTILITY_TASK_DO_NOT_FILTER);
								}
								
								// check if the parent output has to be merged
								// - 1) merging not necessary, because the task require only the equivalent of a single record)
								// - 2) merging not necessary, because the task can do merging itself
								else if (((targetBasicGrouping.equals(GlobalConstants.METADATA_INPUT) && inputs.size() == 1) || 
										  records.size() == 1 || 
										  task.canConsumeDataPort(null, null, targetBasicGrouping, null, true)
										  ) ||
										  (parameter.isMultiple(null) || parameter.isMultipleInstances(null))
										 )
								{
									logger.debug("findCellsWithUntranslatedDataLinks(): mark to skip merging.");
									task.setFlags(task.getFlags() | GlobalConstants.UTILITY_TASK_DO_NOT_MERGE);
									//dataLink.setFlags(dataLink.getFlags() | GlobalConstants.UTILITY_TASK_DO_NOT_MERGE);
								}
							}
						}
						
					} catch (DataLinkNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DataPortNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ToolNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (untranslatedLink != null)
						untranslatedLinks.add(untranslatedLink);
				}
				return true;
			}
		};
		getGraph().getGraph().traverse(getGraph().getDefaultRootCell(), true, visitor);
		
		logger.debug("findCellsWithUntranslatedDataLinks(): "+untranslatedLinks.size()+" untranslated dataLinks found.");
		return untranslatedLinks;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 	 * 1.   test if current task (entry key) and its DataPorts (entry value), which are going to be resolved
		 *   - have multiple inputs 
		 *   - have inputs consisting of more than one grouping instance
		 *   - have inputs consisting of instances of two or more different groups
		 * 1a.  test if the task can handle the inputs by its own 
		 *   - if yes: nothing to do
		 *   - else  : continue with step 2
		 *     
		 * 2. find the utility task that fits best to the input constellation as found in step 1
		 * 
		 * 3. create new filter task and insert into graph (using utility task from step 2 as template)
		 * 
		 * argument entry: the cell/task and all (ingoing) edges to this cell 
		 * 
	 * <!-- end-user-doc -->
	 * @throws TaskNotFoundException 
	 * @throws DataLinkNotFoundException 
	 * @throws ToolNotFoundException 
	 * @throws DataPortNotFoundException 
	 * @throws UtilityTaskNotFoundException 
	 * @generated not
	 */
	public boolean resolveEdge(Task target, EList<mxICell> edges) 
			throws 	TaskNotFoundException, 
					DataLinkNotFoundException, 
					DataPortNotFoundException, 
					ToolNotFoundException, 
					UtilityTaskNotFoundException 
	{				
		boolean rc = true;		
		int constellation = 0x00;
		
		// filter task can have multiple inputs
		int filterSupportMultipleInputs            = 0x01;
		// filter task can process multiple instances per single input
		int filterSupportMultipleInstancesPerInput = 0x02;
		// merge task can process multiple instances per single input
		int mergeSupportMultipleInstancesPerInput  = 0x04;
		
		
		//constellation|= filterSupportMultipleInputs;
		//constellation|= mergeSupportMultipleInstancesPerInput;
		//logger.debug("constellation: "+(constellation|filterSupportMultipleInputs)+" "+(constellation|filterSupportMultipleInstancesPerInput)+" ");
		logger.debug("resolveEdge(): constellation="+constellation);
		
		//Task task = JGraphXUtil.loadTask(entry.getKey());
		Task task = target;
		mxICell cell = (mxICell) GlobalVar.getCells().get(task.getUniqueString());
		logger.debug("resolveEdge(): apply filter for "+task.getUniqueString()+" "+edges.size());
		//if (!entry.getValue().isEmpty())
		if (edges != null && !edges.isEmpty())
		{
			
			mxICell   firstEdge    = edges.get(0);
			DataLink firstDataLink = JGraphXUtil.loadDataLink(firstEdge);
			
			getGraph().getGraph().getModel().beginUpdate(); try {
				
				//String filterGroupingStr = firstDataLink.getParentGroupingStr() != null ? 
					//						firstDataLink.getParentGroupingStr() :
						//					GlobalConfig.getGroupingCriterionForFilterTask();
				
				Task utilityTask = null;
				String groupingStr = GlobalConfig.getGroupingCriterionForFilterTask();
				try
				{
					utilityTask = GraphUtil.getUtilityTask(firstDataLink.getDataPort(), 
										firstDataLink.getInDataPort(), 
										GlobalConstants.UTILITY_TASK_FILTER_NAME,
										task);
					groupingStr = GraphUtil.getGroupingCriterionOfUtilityTask(utilityTask);
				}
				catch (UtilityTaskNotFoundException e)
				{
					//getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_UTILITY_TASK_ASSUME__0, severity, errorVar)
					logger.debug("createFilterTasks(): no filter task found for task "
							+task.getUniqueString()+". Assume parent provide chunks.");
				}

				// filter tasks can be the actual parent
				try
				{
					EMap<mxICell, DataLink> cellMap = createFilterTasks(cell, edges, 
						firstDataLink.getInDataPort(), groupingStr, constellation);
				
				EMap<String, EList<TraversalChunk>> traversalChunks = new BasicEMap<String, EList<TraversalChunk>>();
				
				if (!cellMap.isEmpty())
				{
					for (Entry<mxICell, DataLink> e:cellMap.entrySet())
					{
						Task t = JGraphXUtil.loadTask(e.getKey());
						if (t.getUniqueString().equals(task.getUniqueString()))
						{
							traversalChunks.put(GlobalConstants.TRAVERSAL_CRITERION_RECORD, t.getRecords(true));
						}
						else
						{
							for (Entry<String, EList<TraversalChunk>> e1:task.getChunks())
								traversalChunks.put(e1.getKey(), new BasicEList(EcoreUtil.copyAll(e1.getValue())));
						}
					}
					Task mergeTask = null;
					boolean existingMergeTaskFound = false;
					//if (((task.getFlags() >> 13) & 0x1) == 1)
					logger.debug("resolveEdge(): former condition="+((task.getFlags() >> 13) & 0x1)
						+" new cond="+((task.getFlags() & GlobalConstants.UTILITY_TASK_DO_NOT_MERGE) > 1));
					if ((task.getFlags() & GlobalConstants.UTILITY_TASK_DO_NOT_MERGE) > 1)
					{
						mergeTask=task;
					}
					else 
					{
						String utilTaskString = GraphUtil.getUtilityTaskKey(firstDataLink, GlobalConstants.UTILITY_TASK_MERGE_NAME, task);
						mergeTask = findExistingUtilityTaskFor(utilTaskString, firstEdge);
						if (mergeTask == null)
							mergeTask = JGraphXUtil.createNewUtilityTask(traversalChunks, utilTaskString, firstEdge);
						else
							existingMergeTaskFound = true;
					}

					mxICell mergeCell = (mxICell) GlobalVar.getCells().get(mergeTask.getUniqueString());
					if (!existingMergeTaskFound)
					{
						EList<String> groupings = new BasicEList<String>();
						for (Entry<mxICell, DataLink> e : cellMap.entrySet())
						{
							Task localSource = JGraphXUtil.loadTask(e.getKey());
							DataLink newDataLink = GraphUtil.createDataLink(e.getValue(), task, null);
							logger.debug("resolveEdge(): insert edge: (filter-merge)"
									+ localSource.getUniqueString()
									+ "->"
									+ mergeTask.getUniqueString()
									+ " test content of chunks="+localSource.getChunks().keySet()
									+" "+e.getValue().getParentGroupingStr()+" "+localSource.getChunks().keySet() 
									+ " " + newDataLink.getUniqueString(true));
							logger.debug(Util.list2String(localSource.getChunks().get(e.getValue().getParentGroupingStr()), "-"));
							if (localSource.getChunks().get(e.getValue().getParentGroupingStr()) != null)
								groupings.add(Util.list2String(localSource.getChunks().get(e.getValue().getParentGroupingStr()), "-"));
							
							getGraph().getGraph().insertEdgeEasyFlow(null, null, 
									e.getKey(),
									mergeCell, 
									newDataLink
									);
						}
						logger.debug(groupings);
						getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_UTILITY_MERGE_TASKS_3, 
								Severity.INFO, 
								Util.generateStringList(mergeTask.getUniqueString(), 
										Util.list2String(groupings, ","),
										task.getUniqueString()));

					}	
					//if (((task.getFlags() >> GlobalConstants.UTILITY_TASK_DO_NOT_MERGE_BIT_POS) & 0x1) != 1)
					if ((task.getFlags() & GlobalConstants.UTILITY_TASK_DO_NOT_MERGE) == 0)
					{
						logger.debug("resolveEdge(): insert edge: (merge-task) "
								+ mergeTask.getUniqueString() + "->"
								+ task.getUniqueString());
						DataLink newDataLink = GraphUtil.createDataLink(firstEdge, task, firstDataLink.getGroupingStr(), firstDataLink.getGroupingStr(), null);
						getGraph().getGraph()
								.insertEdgeEasyFlow(null, null,
											mergeCell,
											cell,
											newDataLink
											);
						/*getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_UTILITY_ADD_UTILITY_TASK_3, 
								Severity.INFO, 
								Util.generateStringList(mergeTask.getUniqueString(), task.getUniqueString(), newDataLink.getUniqueString()));*/

					}
				}
				}
				catch (UtilityTaskNotFoundException e) {
					GlobalVar.getLastErrorInfo().setDataLink(firstDataLink);
					throw e;
				}
			} finally {
				JGraphXUtil.layoutGraph();
				getGraph().getGraph().getModel().endUpdate(); 
			}
		}
		return rc;
	}

	/**
	 * 
	 * @param cell
	 * @param edges
	 * @param dataPort
	 * @param constellation
	 * @return Map: filter task (cell) -> edge (the source and the edge toward the task, for which filtering/merging has to done)
	 * @throws TaskNotFoundException
	 * @throws DataLinkNotFoundException
	 * @throws ToolNotFoundException
	 * @throws UtilityTaskNotFoundException
	 * @throws DataPortNotFoundException 
	 */
	private EMap<mxICell, DataLink> createFilterTasks(mxICell cell, EList<mxICell> edges, 
										DataPort dataPort,  
										String groupingStr, int constellation)
										
						throws TaskNotFoundException, 
								DataLinkNotFoundException, 
								ToolNotFoundException, 
								UtilityTaskNotFoundException, DataPortNotFoundException
	{
		
		//boolean rc = false;
		//boolean modeUnion=false;
		Task task = JGraphXUtil.loadTask(cell);
		EMap<mxICell, DataLink> cells = new BasicEMap<mxICell, DataLink>();
		EMap<String, EList<TraversalChunk>> coveredChunks = null;

		logger.debug("createFilterTasks(): find filterTasks for "+task.getUniqueString()
				+" for grouping="+groupingStr
				//+" (all groupings="+task.getChunks().keySet()+" "+dataPort.getFormat().getName()
				);
		
		for (mxICell edge:edges)
		{
			DataLink dataLink = JGraphXUtil.loadDataLink(edge);
			Task sourceTask   = JGraphXUtil.getSourceTask((mxCell) edge);
			Task targetTask   = JGraphXUtil.getTargetTask((mxCell) edge);
			
			logger.debug("createFilterTasks(): flags="+task.getFlags()
					+" skip? (flags>>12="+(task.getFlags() >> GlobalConstants.UTILITY_TASK_DO_NOT_FILTER_BIT_POS)+" new cond="+
					((task.getFlags() & GlobalConstants.UTILITY_TASK_DO_NOT_FILTER) > 1)+ ")"
					+" is root="+sourceTask.isRoot());
			//if (((task.getFlags() >> GlobalConstants.UTILITY_TASK_DO_NOT_FILTER_BIT_POS) & 0x1) == 1)
			if ((dataLink.getFlags() & GlobalConstants.UTILITY_TASK_DO_NOT_FILTER) > 1)
			{
				logger.debug("createFilterTasks(): no filtering necessary");
				cells.put(JGraphXUtil.getSource((mxCell) edge), dataLink);
				getGraph().getGraph().removeCells(new Object[]{edge}, true);
			}
			else
			{
				TraversalEvent te=task.getTraversalEvents().get(dataLink.getGroupingStr());
				logger.debug("createFilterTasks(): "+dataLink.getGroupingStr()+" "+dataLink.getParentGroupingStr()
						+(te!=null ? " type of te="+te.getType()+" "+te.getTraversalCriterion().getMode(): "")
						+" source tes="+sourceTask.getTraversalEvents().keySet());
				
				EMap<String, EList<TraversalChunk>> currentCoveredChunks = GraphUtil.getCoveredChunks(
					targetTask,
					sourceTask,
					dataLink.getDataPort(),
					groupingStr,
					true
				);
				
				logger.trace("createFilterTasks(): "+currentCoveredChunks.size()+" covered chunks found. "
						+" filter chunks from "+sourceTask.getUniqueString());
				
				if (currentCoveredChunks.isEmpty())
				{
					logger.debug("createFilterTasks(): no chunks found that can be translated.");	
				}
				else
				{
					if (coveredChunks==null)
						coveredChunks=currentCoveredChunks;
					else
						for (Entry<String, EList<TraversalChunk>> e:currentCoveredChunks.entrySet())
						{
							//if (coveredChunks.containsKey(e.getKey()))
							coveredChunks.get(e.getKey()).addAll(e.getValue());
						}

					logger.debug("createFilterTasks(): constallation="+(constellation & 0x04));
					if ((constellation & 0x04) > 0)
					{
						String utilTaskString = GraphUtil.getUtilityTaskKey(dataLink, GlobalConstants.UTILITY_TASK_FILTER_NAME, task);
						mxICell utilEdge = findExistingUtilityTaskFor(GlobalConstants.UTILITY_TASK_FILTER_NAME, sourceTask, coveredChunks);
						if (utilEdge != null)
						{
							cells.put(JGraphXUtil.getSource((mxCell) utilEdge), JGraphXUtil.loadDataLink(utilEdge));
						}
						else
						{
							Task utilTask         = JGraphXUtil.createNewUtilityTask(currentCoveredChunks, utilTaskString, edge);
							mxICell newCell       = (mxICell) GlobalVar.getCells().get(utilTask.getUniqueString());
							logger.debug("createFilterTasks(): insert edge: (parent-filter)"+sourceTask.getUniqueString()
								+"->"+utilTask.getUniqueString()+" coveredChunks="+coveredChunks.keySet());
							DataLink dataLinkCopy = //copyDataLink(dataLink);
								GraphUtil.createDataLink(dataLink, utilTask, null);
							mxICell newEdge       = (mxICell) getGraph().getGraph().insertEdgeEasyFlow(null, null, 
								JGraphXUtil.getSource((mxCell) edge), newCell, dataLinkCopy);
							cells.put(newCell, dataLinkCopy);
						}
					}
					else
					{
						for (Entry<String, EList<TraversalChunk>> e:currentCoveredChunks.entrySet())
						{
							for (TraversalChunk traversalChunk:e.getValue())
							{
								if (sourceTask.canProvideMultipleInputsFor(null, dataPort))
								{
									logger.debug("createFilterTasks(): no filter task necessary (parent provide multiple inputs.) insert edge: "
											+sourceTask.getUniqueString()+"->"+task.getUniqueString()+" with chunk="+e.getKey()+" "+traversalChunk.getName());
									DataLink dataLinkCopy = 
											//copyDataLinkChunk(dataLink, e.getKey(), traversalChunk);
											GraphUtil.createDataLink(dataLink, task, groupingStr, groupingStr, traversalChunk);
									mxICell newCell = (mxICell) GlobalVar.getCells().get(task.getUniqueString());
									mxICell newEdge = (mxICell) getGraph().getGraph().insertEdgeEasyFlow(null, null, 
											JGraphXUtil.getSource((mxCell) edge), newCell, dataLinkCopy);
									//cells.put(newCell, dataLinkCopy);
								}
								else 
								{
									EList<TraversalChunk> chunks = new BasicEList<TraversalChunk>();
									EMap<String, EList<TraversalChunk>> curCoveredChunks = new BasicEMap<String, EList<TraversalChunk>>();
									chunks.add(traversalChunk);
									curCoveredChunks.put(e.getKey(), chunks);
									mxICell utilEdge = findExistingUtilityTaskFor(GlobalConstants.UTILITY_TASK_FILTER_NAME, sourceTask, e.getKey(), traversalChunk);
									if (utilEdge != null)
									{
										cells.put(JGraphXUtil.getSource((mxCell) utilEdge), JGraphXUtil.loadDataLink(utilEdge));
									}
									else
									{
										String utilTaskString = GraphUtil.getUtilityTaskKey(dataLink, GlobalConstants.UTILITY_TASK_FILTER_NAME, task);
										Task   utilTask       = JGraphXUtil.createNewUtilityTask(curCoveredChunks, utilTaskString, edge);
									
										logger.debug("createFilterTasks(): insert edge: (parent-filter)"
												+sourceTask.getUniqueString()+"->"+utilTask.getUniqueString()
												+" coveredChunks="+curCoveredChunks.keySet()+" single chunk="+groupingStr+" "+traversalChunk.getName());
										DataLink dataLinkCopy = 
												//copyDataLinkChunk(dataLink, groupingStr, traversalChunk);
												GraphUtil.createDataLink(dataLink, utilTask, groupingStr, groupingStr, chunks);
										mxICell newCell       = (mxICell) GlobalVar.getCells().get(utilTask.getUniqueString());
										mxICell newEdge       = (mxICell) getGraph().getGraph().insertEdgeEasyFlow(null, null, 
												JGraphXUtil.getSource((mxCell) edge), newCell, dataLinkCopy);
										cells.put(newCell, dataLinkCopy);
									}
								}
							}
						}
					}
					getGraph().getGraph().removeCells(new Object[]{edge}, true);
				}
			}
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JgraphxPackage.PREPROCESSING_GRAPH__GRAPH:
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
			case JgraphxPackage.PREPROCESSING_GRAPH__GRAPH:
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
			case JgraphxPackage.PREPROCESSING_GRAPH__GRAPH:
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
			case JgraphxPackage.PREPROCESSING_GRAPH__GRAPH:
				return graph != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JgraphxPackage.PREPROCESSING_GRAPH___RESOLVE_PREPROCESSING_TASK__MXICELL_MXICELL:
				try {
					return resolvePreprocessingTask((mxICell)arguments.get(0), (mxICell)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JgraphxPackage.PREPROCESSING_GRAPH___FIND_CELLS_WHERE_PREPROCESSING_IS_REQUIRED:
				return findCellsWherePreprocessingIsRequired();
			case JgraphxPackage.PREPROCESSING_GRAPH___FIND_CELLS_WITH_UNTRANSLATED_DATA_LINKS:
				return findCellsWithUntranslatedDataLinks();
			case JgraphxPackage.PREPROCESSING_GRAPH___RESOLVE_EDGE__TASK_ELIST:
				try {
					return resolveEdge((Task)arguments.get(0), (EList<mxICell>)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		return JgraphxPackage.Literals.PREPROCESSING_GRAPH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.PREPROCESSING_GRAPH__GRAPH, oldGraph, graph));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.PREPROCESSING_GRAPH__GRAPH, oldGraph, graph));
	}

} //PreprocessingImpl
