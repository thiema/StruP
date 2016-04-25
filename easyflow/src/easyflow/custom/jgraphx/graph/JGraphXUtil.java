package easyflow.custom.jgraphx.graph;

import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Element;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.util.Category;
import easyflow.core.CoreFactory;
import easyflow.util.Severity;
import easyflow.core.Task;
import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.GraphUtil;
import easyflow.custom.util.Util;
import easyflow.custom.util.XMLUtil;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.graph.jgraphx.Graph;
import easyflow.traversal.TraversalChunk;

public class JGraphXUtil {

	
	private static Logger logger = Logger.getLogger(JGraphXUtil.class);
	static         Graph  graph;
	static         mxGraphComponent graphComponent;
	
	
	public static void layoutGraph()
	{
		final mxHierarchicalLayout layout = new mxHierarchicalLayout(graph.getGraph());
		
		int width = GlobalVar.getGraphComponent().getWidth();
		double graphWidth = graph.getGraph().getGraphBounds().getWidth();
		logger.debug("viewport="+width+" graph="+graphWidth);
		if (width > graphWidth)

			graph.getGraph().getView().setTranslate(new mxPoint((width - graphWidth)/2, 5));

		else
			graph.getGraph().getView().setTranslate(new mxPoint(5,5)); 
		
		graph.getGraph().getView().clear(graph.getGraph().getDefaultParent(), false, false);
		graph.getGraph().getView().validate();
    	layout.setIntraCellSpacing(10);
    	layout.setFineTuning(true);
    	layout.execute(graph.getGraph().getDefaultParent());
	}
	
	/**
	 * task map to quickly retrieve the task associated to a node (using its unique name as a string)
	 * 	also it circumvents to xml serialize/deserialize the task object, which is currently
	 * 	not properly implemented.
	 * Might improve performance
	*/
	/**
	 * mxcell map to retrieve mxcell by tasks name/unique string or any string
	 */

	public static mxICell cloneCell(mxICell cell)
	{
		try {
			return (mxCell) cell.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static mxCell getSource(mxCell edge)
	{
		mxCell source=(mxCell) graph.getGraph().getView().getVisibleTerminal(edge, true);
		return source;
	}
	
	public static mxCell getTarget(mxCell edge)
	{
		mxCell target=(mxCell) graph.getGraph().getView().getVisibleTerminal(edge, false);
		return target;
	}
	
	public static Task getSourceTask(mxCell edge) throws TaskNotFoundException
	{
		mxCell source=getSource(edge);
		return loadTask(source);
	}
	
	public static Task getTargetTask(mxCell edge) throws TaskNotFoundException
	{
		mxCell target=getTarget(edge);
		return loadTask(target);
	}
	
	
	public static EList<Task> getChildTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		final EList<Task> tasks = new BasicEList<Task>(); 
		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				if (edge!=null)
					try {
						tasks.add(loadTask(vertex));
					} catch (TaskNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				return true;
			}
		};
		if (GlobalVar.getCells().contains(task.getUniqueString()))
			graph.getGraph().traverse(GlobalVar.getCells().get(task.getUniqueString()), true, visitor);
		else
			throw new CellNotFoundException();
		return tasks;
	}

	public static EList<Task> getSiblingTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		final EList<Task> tasks = new BasicEList<Task>();		
		final Object stopVertex=GlobalVar.getCells().get(task.getUniqueString()); 
		if (stopVertex==null)
			throw new CellNotFoundException();

		mxICellVisitor visitor=new mxICellVisitor() {
			@Override
			public boolean visit(Object vertex, Object edge) {
				if (vertex.equals(stopVertex))
					return false;
				try {
					tasks.add(loadTask(vertex));
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		};
		graph.getGraph().traverse(graph.getDefaultRootCell(), true, visitor);
		return tasks;
	}
	
	public static EList<mxICell> getInEdgesForDataPort(Object vertex, DataPort dataPort) throws DataLinkNotFoundException, TaskNotFoundException
	{
		EList<mxICell> cells = new BasicEList<mxICell>();
		Task task = loadTask(vertex);
		logger.trace("getInEdgesForDataPort(): retrieving incoming edges for "+task.getUniqueString());
		for (Object edge : graph.getGraph().getIncomingEdges(vertex))
		{
			DataLink dataLink = loadDataLink(edge);
			Task   parentTask = getSourceTask((mxCell) edge);
			logger.trace("getInEdgesForDataPort(): check edge to "+parentTask.getUniqueString());
			if (dataPort.isCompatible(dataLink.getDataPort()))
			{
				cells.add((mxICell) edge);
				logger.trace("getInEdgesForDataPort(): compatible edge added");
			}
		}
		return cells;
	}
	
	public static Task createNewUtilityTask(
			EMap<String, EList<TraversalChunk>> chunks,
			String utilityTaskUniqueString,
			Object edge
			
			)
					throws TaskNotFoundException, DataLinkNotFoundException, UtilityTaskNotFoundException
	{
		
		Task source = getSourceTask((mxCell) edge);
		Task target = getTargetTask((mxCell) edge);		
		Task utilityTask = CoreFactory.eINSTANCE.createTask();
		
		logger.debug("createUtilityTask(): resolve prep task="+utilityTaskUniqueString
				+" inbetween of "+source.getUniqueString()+" "+target.getUniqueString());
		
		if (GlobalVar.getUtilityTasks().containsKey(utilityTaskUniqueString) && 
				GlobalVar.getUtilityTasks().get(utilityTaskUniqueString) != null)
			utilityTask = EcoreUtil.copy(GlobalVar.getUtilityTasks().get(utilityTaskUniqueString));
		else
		{
			DataLink dataLink = loadDataLink(edge);
			logger.error("createUtilityTask(): Utility task \""+utilityTaskUniqueString+"\" not found. "
					+ "(Known utilites: "+GlobalVar.getUtilityTasks().keySet()+")");
			String err = GraphUtil.getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_GRAPH_UTIL_NO_TASK_FOR_UTILLITY_TASK_4, 
					Severity.ERROR,
					Util.generateStringList(utilityTaskUniqueString,
							dataLink.getUniqueString(), 
							source.getUniqueString(), 
							target.getUniqueString()) 
					);
			GlobalVar.setLastErrorInfo(Category.GRAPH_UTIL, target, dataLink, err, true);
			throw new UtilityTaskNotFoundException();
		}
		
		//utilityTask.setName(utilityTask.getName()+"_"+target.getUniqueURIString());
		utilityTask.setName(utilityTask.getName());
		utilityTask.getChunks().clear();
		GraphUtil.copyTask(GlobalVar.getUtilityTasks().get(utilityTaskUniqueString), utilityTask);
		
		for (Entry<String, EList<TraversalChunk>> e:chunks.entrySet())
		{
			/*
			if (e.getKey().equals("Record") && (e.getValue().size()==1 && e.getValue().get(0).isDerived1by1()))
			{
				logger.debug("createUtilityTask(): do not create new utility task. 1-1 relation.");
				return null;
			}
			*/
			utilityTask.getChunks().put(e.getKey(), new BasicEList<TraversalChunk>(EcoreUtil.copyAll(e.getValue())));
			logger.trace("createUtilityTask(): set "+e.getValue().size()+" traversal chunks for "+e.getKey());
		}
		GlobalVar.getTasks().put(utilityTask.getUniqueString(), utilityTask);
		GlobalVar.getCells().put(utilityTask.getUniqueString(), (mxICell)graph.getGraph().insertVertexEasyFlow(null, null, utilityTask));
		logger.debug("createUtilityTask(): Utility task '"+utilityTask.getUniqueString()+"' created.");
		return utilityTask;
	}
	
	public static EList<Task> getParentTasksFor(Task task) throws CellNotFoundException, TaskNotFoundException
	{
		
		if (GlobalVar.getCells().contains(task.getUniqueString()))
		{
			Object[] es = graph.getGraph().getEdgesBetween(graph.getDefaultRootCell(), 
					GlobalVar.getCells().get(task.getUniqueString()), true);
			return getTasksForCells(es);
		}
			
		else
			throw new CellNotFoundException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public static Task loadTask(Object vertex) throws TaskNotFoundException {
		
		if (vertex instanceof mxCell)
		{
			Object value=((mxCell)vertex).getValue();
			
			if (value==null)
				throw new TaskNotFoundException();
			if (value instanceof Element)
				return XMLUtil.loadTaskFromValue(value);
			else if (value instanceof String)
			{
				if (value.equals(GlobalConstants.TEMPLATE_TASK_NAME))
					return GlobalVar.getTemplateTask();
				return GlobalVar.getTasks().get(value);
			}
		}
		else
		{
			//todo: handle wrong type exception
		}
		return  null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public static DataLink loadDataLink(Object edge) throws DataLinkNotFoundException {
		
		if (edge instanceof mxCell)
		{
			Object value=((mxCell)edge).getValue();
			
			if (value instanceof Element)
			{
				return XMLUtil.loadDataLinkFromEdge(edge);
			}
			else if (value instanceof String)
			{
				if (value.equals(GlobalConstants.TEMPLATE_DATA_PORT_NAME))
					return GlobalVar.getTemplateLink();
				return GlobalVar.getDataLinks().get((String)value);
			}
			else if (value instanceof Integer)
			{
				return GlobalVar.getDataLinks().get(Integer.toString((Integer) value));
			}
			else
			{
				logger.warn("loadDataLink(): unknown instance-type of value "+value.getClass().getCanonicalName());
			}
		}
		else
		{
			//todo: handle wrong type exception
			logger.warn("loadDataLink(): unknown instance-type of edge "+edge.getClass().getCanonicalName());
			
		}
		throw new DataLinkNotFoundException();
	}

	public static DataPort getDataPortBySource(Object e)
	{
		String dataPortName=(String) ((mxCell)e).getValue();
		Object c=getSource((mxCell) e);
		//getGraph().getView().getVisibleTerminal(e, true);
		String parentTaskName = (String) ((mxCell)c).getValue();
		Task parentTask = GlobalVar.getTasks().get(parentTaskName);
		return parentTask.getDataPortByName(dataPortName, true);
	}
	
	public static DataPort getDataPortByTarget(Object e)
	{
		String dataPortName=(String) ((mxCell)e).getValue();
		Object c=getTarget((mxCell) e);
		//getGraph().getView().getVisibleTerminal(e, false);
		String childTaskName = (String) ((mxCell)c).getValue();
		Task childTask = GlobalVar.getTasks().get(childTaskName);
		return childTask.getDataPortByName(dataPortName, false);
	}
	
	public static EList<Task> getTasksForCells(Object[] os) throws TaskNotFoundException
	{
		EList<Task> tasks = new BasicEList<Task>();
		for (Object o:os)
		{
			tasks.add(loadTask(o));
		}
		return tasks;
	}

	public static String getTaskNameForCell(Object cell)
	{
		for (String name : GlobalVar.getCells().keySet())
			if (GlobalVar.getCells().get(name).equals(cell))
				return name;
		return null;
	}
	
	public static boolean isChildOf(Task child, Task parent)
	{
		Object childCell  = GlobalVar.getCells().get(child.getUniqueString());
		Object parentCell = GlobalVar.getCells().get(parent.getUniqueString());
		//logger.trace("test child="+child.getUniqueString()+" vs. parent="+parent.getUniqueString());
		for (Object cell : graph.getGraph().getVertices(parentCell, false))
		{
			//logger.trace("child="+getTaskNameForCell(cell)+" vs="+getTaskNameForCell(childCell)
				//	+" isChild="+(cell==childCell)+" "+cell.hashCode()+" "+childCell.hashCode());
			if (cell == childCell )
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public static EList<mxICell> getCells(EList<Task> tasks) {
		final EList<mxICell> cells=new BasicEList<mxICell>();
		for (Task task:tasks)
			cells.add((mxICell) GlobalVar.getCells().get(task.getUniqueString()));
	
		return cells;
	}
	
	public static boolean isEdgeInGraph(Task parentTask, Task childTask, DataLink dataLink) throws TaskNotFoundException, DataLinkNotFoundException
	{
		logger.trace("isEdgeInGraph(): "+parentTask.getUniqueString()+" "+childTask.getUniqueString()+" "+dataLink.getUniqueString());
		boolean rc = false;
		String parentTaskName = parentTask.getUniqueString();
		String childTaskName  = childTask.getUniqueString();
		if (GlobalVar.getTasks().containsKey(parentTaskName) && GlobalVar.getCells().containsKey(parentTaskName))
		{
			mxICell parentVertex = (mxICell) GlobalVar.getCells().get(parentTaskName);
			for (Object edgeOut : graph.getGraph().getOutgoingEdges(parentVertex))
			{
				logger.trace("isEdgeInGraph(): "+parentTaskName);
				if (getTargetTask((mxCell) edgeOut) != null && getTargetTask((mxCell) edgeOut).getUniqueString().equals(childTaskName))
				{
					if (dataLink != null)
					{
						DataLink curDataLink = loadDataLink(edgeOut);
						if (
								dataLink.getDataPort().getName().equals(curDataLink.getDataPort().getName()) &&
								(
										(dataLink.getGroupingStr() == null && curDataLink.getGroupingStr() == null)||
										(dataLink.getGroupingStr() != null &&
										dataLink.getGroupingStr().equals(curDataLink.getGroupingStr()))
								)
							)
							rc = true;
					}
					else
					{
						rc = true;
					}
					
					if (rc)
						break;
				}
			}
		}
		return rc;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public static EList<DataPort> getParentDataPortsFor(Task task) throws CellNotFoundException {
		EList<DataPort> parents = new BasicEList<DataPort>();
		if (!GlobalVar.getCells().containsKey(task.getUniqueString()))
			throw new CellNotFoundException();
		logger.trace(graph.getGraph().getIncomingEdges(GlobalVar.getCells().get(task)));
		for (Object e : graph.getGraph().getIncomingEdges(GlobalVar.getCells().get(task)))
		{
			DataPort dataPort=JGraphXUtil.getDataPortBySource(e);
			if (dataPort != null)
				parents.add(dataPort);
		}
			
		return parents;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CellNotFoundException 
	 * @generated not
	 */
	public EList<DataPort> getChildDataPortsFor(Task task) throws CellNotFoundException {
		
		EList<DataPort> childs = new BasicEList<DataPort>();
		if (!GlobalVar.getCells().containsKey(task.getUniqueString()))
			throw new CellNotFoundException();
		
		for (Object e : graph.getGraph().getOutgoingEdges(GlobalVar.getCells().get(task)))
		{
			childs.add(JGraphXUtil.getDataPortByTarget(e));
		}
		return childs;
	}

	public static void setGraph(Graph graph2) {
		graph = graph2;
	}
}
