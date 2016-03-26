package easyflow.custom.util;

import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;

import sun.security.action.GetLongAction;
import easyflow.core.Category;
import easyflow.core.CoreFactory;
import easyflow.core.LogMessage;
import easyflow.core.Severity;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.GroupingCriterionNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.data.DataFactory;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.metadata.DefaultMetaData;
import easyflow.metadata.GroupingInstance;
import easyflow.metadata.MetadataFactory;
import easyflow.tool.Command;
import easyflow.tool.ResolvedParam;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalCriterion;
import easyflow.traversal.TraversalEvent;
import easyflow.traversal.TraversalFactory;

public class GraphUtil {
	
	private static Logger     logger     = Logger.getLogger(GraphUtil.class);
	private static LogMessage logMessage = null;
	
	public static void initLogMessage()
	{
		if (logMessage == null)
		{
			logMessage = CoreFactory.eINSTANCE.createLogMessage();
		//if (logMessage.getCategory() == null)
			logMessage.setCategory(Category.GRAPH_UTIL);
		}
	}
	
	public static LogMessage getLogMessage()
	{
		initLogMessage();
		return logMessage;
	}
	
	public static boolean shallProcess(EList<String> tasks,
								EList<GroupingInstance> groupingInstances,
								String groupingStr,
								EList<String> jexl,
								boolean inverse)
	{
		
		boolean rc = false;
		boolean requireAll = false;
		
		//return true if at least one task indicates a valid processing
		for (String taskStr:tasks)
		{
			Task task = GlobalVar.getTasks().get(taskStr);
			rc = task.shallProcess(groupingInstances, groupingStr, 
				jexl,
				inverse);
			logger.trace("shallProcess(): test "+task.getUniqueString()+" groupingStr="+groupingStr+" jexl="+jexl+" inverse="+inverse);
			if (requireAll && !rc)
				break;
		}
		
		return rc;
	}


	
	private static DataLink createDataLinkParam(DataLink dataLink, Task task, String paramStr)
	{
		DataLink newDataLink = EcoreUtil.copy(dataLink);
		newDataLink.setId(0);
		newDataLink.setParamStr(paramStr);
		if (newDataLink.getGroupingStr() == null)
			newDataLink.setGroupingStr(newDataLink.getParentGroupingStr());
		//newDataLink.setDataPort(EcoreUtil.copy(dataLink.getDataPort()));
		//newDataLink.setInDataPort(EcoreUtil.copy(dataLink.getInDataPort()));
		
		newDataLink.setProcessed(true);
		if (dataLink.getChunks().containsKey(paramStr))
			addTraversalChunksToDataLink(newDataLink, paramStr, dataLink.getChunks().get(paramStr));
		if (!newDataLink.getDataPort().getFormat().match(newDataLink.getInDataPort().getFormat()))
		{
			logger.error("invalid data formats foudn for datalink="+newDataLink.getUniqueString(true));
		}
		return newDataLink;
	}
	
	private static DataLink createDataLinkGrouping(DataLink dataLink, Task task, String groupingStr, String parentGroupingStr, DataPort dataPort)
	{
		DataLink newDataLink = null;
		newDataLink = DataFactory.eINSTANCE.createDataLink();
		newDataLink.setTerminal(dataLink.isTerminal());
		
			/*if (groupingStr == null)
				newDataLink.setTerminal(true);
			else*/
		if (groupingStr != null)
			newDataLink.setGroupingStr(groupingStr);
			newDataLink.setParamStr(dataLink.getParamStr());
			
			if (dataLink.getCondition()!=null && !dataLink.getCondition().isUnconditional())
				newDataLink.setCondition(dataLink.getCondition());
			if (parentGroupingStr != null)
			{
				newDataLink.setParentGroupingStr(parentGroupingStr);
				if (!newDataLink.isTerminal() && newDataLink.getGroupingStr() == null)
				{
					logger.debug("createDataLinkGrouping(): no grouping string set for datalink: "+
							newDataLink.getUniqueString()
							+".");
					newDataLink.setGroupingStr(null);
				}
			}
			if (dataPort != null)
			{
				newDataLink.setDataPort(EcoreUtil.copy(dataPort));
				newDataLink.setInDataPort(EcoreUtil.copy(dataPort));
			}
			else
			{
				newDataLink.setDataPort(EcoreUtil.copy(dataLink.getDataPort()));
				newDataLink.setInDataPort(EcoreUtil.copy(dataLink.getInDataPort()));
			}

		logger.debug("createDataLinkGrouping(): groupcrits assigend to ingoing dataport: "
				+ "template: "+(dataLink.getInDataPort() != null ? dataLink.getInDataPort().getGroupingCriteria().size() : "undef")
				+" new:"+(newDataLink.getInDataPort() != null ? newDataLink.getInDataPort().getGroupingCriteria().size() : "undef")
				);
		return newDataLink;
	}
	
	private static void addTraversalChunksToDataLink(DataLink dataLink, String parentGroupingStr, EList<TraversalChunk> chunks)
	{
		EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
		Iterator<TraversalChunk> it  = chunks.iterator();
		while (it.hasNext())
		{
			traversalChunks.add(it.next());
		}
		logger.trace("createDataLink(): "+chunks.size()+" chunks added from parent.");
		dataLink.getChunks().put(parentGroupingStr, traversalChunks);
		//newDataLink.setTraversalName(task.getChunks().get(i).getKey());
	}
	
/*	
	private void addGroupingInstancesToDataLink(DataLink dataLink, String parentGroupingStr, EList<GroupingInstance> groupingInstances, boolean isGrouping)
	{	
		if (groupingInstances != null && !groupingInstances.isEmpty())
		{
			for (GroupingInstance groupingInstance : groupingInstances)
			{
				TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
				traversalChunk.setName(groupingInstance.getName());
				logger.trace("addGroupingInstancesToDataLink(): add chunk from grouping instance="+groupingInstance.getName()+" with grouping="+groupingInstance.getGroupingStr());
				EList<TraversalChunk> chunks = null;
				String curGroupingStr = parentGroupingStr;
				if (groupingInstance.getGroupingStr()!=null && dataLink.getChunks().containsKey(groupingInstance.getGroupingStr()))
					curGroupingStr = groupingInstance.getGroupingStr();
				else if (!dataLink.getChunks().containsKey(parentGroupingStr))
				{
					chunks = new BasicEList<TraversalChunk>();
					dataLink.getChunks().put(parentGroupingStr, chunks);
					logger.trace("addGroupingInstancesToDataLink(): put into chunks map: "+parentGroupingStr);
				}
				chunks = dataLink.getChunks().get(curGroupingStr);
				chunks.add(traversalChunk);
				logger.trace("addGroupingInstancesToDataLink(): added chunks:"+traversalChunk.getName());
			}
			
		}
		else
		{
			logger.debug("addGroupingInstancesToDataLink(): no grouping instances defiend.");
		}
	}
*/	
	
	public static DataLink createDataLink(DataLink dataLink, Task task, DataPort dataPort) throws DataLinkNotFoundException
	{
		EList<TraversalChunk> chunks = dataLink.getChunks().get(dataLink.getParentGroupingStr());
		//if (checkDataPort)
			logger.debug("createDataLink(): datalink port="+dataLink.getInDataPort().getFormat().getName()
					+" tasks outport="+Util.list2String(task.getOutDataPorts(), ","));
		
		/*if (task.isUtil() && !task.getOutDataPorts().isEmpty())
		{
			dataLink.setInDataPort(task.getOutDataPorts().get(0));
			dataLink.setDataPort(task.getOutDataPorts().get(0));
		}*/
		return createDataLink(dataLink, task, dataLink.getGroupingStr(), dataLink.getParentGroupingStr(), chunks, null, dataPort);
	}
	
	public static DataLink createDataLink(Object edge, Task task, 
			String groupingStr, 
			String parentGroupingStr, 
			EList<TraversalChunk> chunks
			) throws DataLinkNotFoundException
	{
		DataLink dataLink = JGraphXUtil.loadDataLink(edge);
		return createDataLink(dataLink, task, groupingStr, parentGroupingStr, chunks, null, null);
	}
	
	public static DataLink createDataLink(DataLink dataLink, Task task, 
			String groupingStr, 
			String parentGroupingStr, 
			EList<TraversalChunk> chunks
			) throws DataLinkNotFoundException
	{
		return createDataLink(dataLink, task, groupingStr, parentGroupingStr, chunks, null, null);
	}

	public static DataLink createDataLink_Param_GroupingInstances(Object edge, Task task, 
			String paramStr, 
			EList<GroupingInstance> groupingInstances
			) throws DataLinkNotFoundException
	{
		DataLink dataLink = JGraphXUtil.loadDataLink(edge);
		if (!dataLink.getDataPort().getFormat().match(dataLink.getInDataPort().getFormat()))
		{
			logger.error("invalid data formats foudn for datalink="+dataLink.getUniqueString(true));
		}

		EList<TraversalChunk> chunks = groupingInstances2TraversalChunks(groupingInstances);
		DataLink newDataLink = createDataLink(dataLink, task, null, null, chunks, paramStr, null);
		if (!newDataLink.getDataPort().getFormat().match(newDataLink.getInDataPort().getFormat()))
		{
			logger.error("invalid data formats foudn for datalink="+newDataLink.getUniqueString(true));
		}
		
		return newDataLink;
	}

	
	public static DataLink createDataLink(Object edge, Task task, 
			String groupingStr, 
			String parentGroupingStr, 
			EList<TraversalChunk> chunks, 
			String paramStr) throws DataLinkNotFoundException
	{
		DataLink dataLink = JGraphXUtil.loadDataLink(edge);
		return createDataLink(dataLink, task, groupingStr, parentGroupingStr, chunks, paramStr, null);
	}
	
	public static DataLink createDataLink(DataLink dataLink, Task task, 
			String groupingStr, 
			String parentGroupingStr, 
			TraversalChunk chunk) throws DataLinkNotFoundException
	{
		EList<TraversalChunk> chunks = new BasicEList<TraversalChunk>();
		chunks.add(chunk);
		return createDataLink(dataLink, task, groupingStr, parentGroupingStr, chunks, null, null);
	}
	
	// if no chunks provided, fallback to all tasks chunks.
	public static DataLink createDataLink(DataLink dataLink, Task task, 
			String groupingStr, 
			String parentGroupingStr, 
			EList<TraversalChunk> chunks,
			String paramStr,
			DataPort dataPort) throws DataLinkNotFoundException
	{
		boolean isGrouping      = paramStr == null;
		boolean isSplittingTask = parentGroupingStr == null;
		
		if (parentGroupingStr == null)
			parentGroupingStr = dataLink.getParentGroupingStr();
		if (parentGroupingStr == null)
			parentGroupingStr = groupingStr;
		if (groupingStr == null)
			groupingStr = dataLink.getGroupingStr();

		logger.debug("createDataLink(): "
				+" dataPort="+(dataPort != null ? dataPort.getName()
						+" (format=" + (dataPort.getFormat() != null ? dataPort.getFormat().getName(): null)+")": null)
				+" isGrouping="+isGrouping
				+" paramStr="+paramStr
				+" groupingStr="+groupingStr
				+" dataLink's groupingStr="+dataLink.getGroupingStr()
				//+" effective parents groupingStr="+effectiveParentGroupingStr
				//+" root="+source != null ? source.isRoot() : "?"
				+" static="+((dataLink != null && dataLink.getDataPort()!=null) ? dataLink.getDataPort().isStatic() : "na")
				);
		if (!isGrouping)
			logger.debug("createDataLink(): create for parameter");
		
		DataLink newDataLink = isGrouping ?
				createDataLinkGrouping(dataLink, task, 
						groupingStr, parentGroupingStr, dataPort) :
				createDataLinkParam(dataLink, task, paramStr);
				
		if (dataLink.getDataPort() == null)
		{
			logger.warn("createDataLink(): data port not defined for"
					+" dataLink="+newDataLink.getUniqueString()
					+" created from="+dataLink.getUniqueString()
					);
		}
		else if (dataLink.getInDataPort() == null)
		{
			logger.warn("createDataLink(): invalid data formats found for"
					+" dataLink \""+newDataLink.getUniqueString()+"\""
					+" created from \""+dataLink.getUniqueString(true)+"\"");
		}
		else if (!dataLink.getDataPort().getFormat().match(dataLink.getInDataPort().getFormat()))
		{
			logger.debug("createDataLink(): data formats differ for"
					+" dataLink \""+newDataLink.getUniqueString()+"\""
					+" created from \""+dataLink.getUniqueString(true)+"\"");
		}
		
		if (chunks != null)
		{
			addTraversalChunksToDataLink(newDataLink, parentGroupingStr, chunks);
		}
		//else if (!isGrouping)
			//addTraversalChunksToDataLink(newDataLink, effectiveParentGroupingStr, dataLink.getChunks().get(effectiveParentGroupingStr));
		else 
		{
			int i = task.getChunks().indexOfKey(parentGroupingStr);
			if (i!=-1)
			{
				addTraversalChunksToDataLink(newDataLink, parentGroupingStr, task.getChunks().get(i).getValue());
			}
			else
			{
				logger.debug("createDataLink(): no chunks provided by parent task."
						+" dataLink="+newDataLink.getUniqueString()
						+" created from="+dataLink.getUniqueString()
						);
			}
		}	
				
		logger.debug("createDataLink(): chunks defined for="+newDataLink.getChunks().keySet()
				+" chunks for grouping="+parentGroupingStr
				+"=("+easyflow.custom.util.Util.list2String(newDataLink.getChunks().get(parentGroupingStr), null)+")"+" "+task.getUniqueString());
		if (!isGrouping && (!newDataLink.getChunks().containsKey(newDataLink.getParamStr()) && !isSplittingTask))
			logger.error("createDataLink(): no chunks for param "+newDataLink.getParamStr()+" found. "
					+" dataLink="+newDataLink.getUniqueString()
					+" created from="+dataLink.getUniqueString()
					);
		if (!newDataLink.getChunks().containsKey(parentGroupingStr))
			logger.error("createDataLink(): no chunks for grouping "+parentGroupingStr+" found."
					+" dataLink="+newDataLink.getUniqueString()
					+" created from="+dataLink.getUniqueString()
					);
		
		if (!newDataLink.isTerminal() && newDataLink.getDataPort() == null)
		{
			logger.warn("createDataLink(): data port not defined. "
					+" dataLink="+newDataLink.getUniqueString()
					+" created from="+dataLink.getUniqueString()
					);
		}
		else if (newDataLink.getInDataPort() == null)
		{
			logger.warn("createDataLink(): in data port not defined"
					+" dataLink="+newDataLink.getUniqueString()
					+" created from="+dataLink.getUniqueString()
					);

		}
		else if (!newDataLink.isTerminal() && !newDataLink.getDataPort().getFormat().match(newDataLink.getInDataPort().getFormat()))
		{
			logger.error("createDataLink(): invalid data formats found for"
					+" datalink="+newDataLink.getUniqueString(true)
					+" created from="+dataLink.getUniqueString()
					);
		}
		
		return newDataLink;

	}
	
	public static void copyTask(Task fromTask, Task toTask)
	{		
		Command cmd = fromTask.getResolvedCommand() != null ? fromTask.getResolvedCommand() : 
						fromTask.getPreferredTool() != null ? fromTask.getPreferredTool().getCommand() : null; 
								
		if (cmd != null)
		{
			toTask.setResolvedCommand(EcoreUtil.copy(cmd));
			Iterator<Entry<String, ResolvedParam>> it1 = cmd.getResolvedParams().iterator();
			while (it1.hasNext())
			{
				Entry<String, ResolvedParam> e = it1.next();
				toTask.getResolvedCommand().getResolvedParams().put(e.getKey(), e.getValue().deepCopy());
			}
		}
	}
	
	

	public static Task createTask_Param(Task task, String groupingStr, EList<GroupingInstance> groupingInstances)
	{
		Task copyTask=EcoreUtil.copy(GlobalVar.getTasks().get(task.getUniqueString()));
		copyTask(task, copyTask);
		copyTask.setPreviousTaskStr(task.getUniqueString());
		logger.trace("createTask(): (param traversal) "+copyTask.getChunks().keySet()+" from task="+task.getUniqueString());
		
		EList<TraversalChunk> traversalChunks = copyTask.getChunks().get(groupingStr);
		if (traversalChunks == null)
		{
			copyTask.getChunks().put(groupingStr, groupingInstances2TraversalChunks(groupingInstances));
		}
		else
			traversalChunks.addAll(groupingInstances2TraversalChunks(groupingInstances));
		//if (keepCell)
			//task.setFlags(task.getFlags() | 0x0010);
		if (!copyTask.getChunks().keySet().contains(groupingStr))
			copyTask.getChunks().put(groupingStr, new BasicEList<TraversalChunk>());
		return copyTask;
	}

	private static EList<TraversalChunk> groupingInstances2TraversalChunks(EList<GroupingInstance> groupingInstances)
	{
		EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
		Iterator<GroupingInstance> it = groupingInstances.iterator();
		while (it.hasNext())
		{
			TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
			traversalChunk.setName(it.next().getName());
			traversalChunks.add(traversalChunk);
		}
		return traversalChunks;
	}
	
	public static Task createTask(Task task, String groupingStr, EList<GroupingInstance> groupingInstances)
	{
		logger.trace("createTask(): create new Task from "+task.getUniqueString()+" with chunks="
				+task.getChunks().keySet()+" and grouping="+groupingStr);
		if (!task.getGroupingCriteria().containsKey(groupingStr))
		{
			// don't remove this task
			task.setFlags(task.getFlags() | 0x0010);
			logger.trace("createTask(): mark to keep="+task.getUniqueString()+" "+task.getFlags());
			return task;
		}
		Task copyTask=EcoreUtil.copy(GlobalVar.getTasks().get(task.getUniqueString()));
		copyTask(task, copyTask);
		logger.debug("createTask(): task copied.");
		copyTask.setPreviousTaskStr(task.getUniqueString());
		//logger.debug(" copy:"+copyTask.getTraversalEvents().get(groupingStr).getTraversalCriterion().getDataPort()+
			//	" orig:"+getTasks().get(task.getUniqueString()).getTraversalEvents().get(groupingStr).getTraversalCriterion().getDataPort());
		
		if (task.getGroupingCriteria().containsKey(groupingStr))
			// exclude from copy subgraph
			copyTask.setFlags(copyTask.getFlags() | 0x0001);
		
		if (!copyTask.getChunks().containsKey(groupingStr))
		{
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			copyTask.getChunks().put(groupingStr, traversalChunks);
		}
		
		EList<TraversalChunk> traversalChunks = copyTask.getChunks().get(groupingStr);
		Iterator<GroupingInstance> it = groupingInstances.iterator();
		while (it.hasNext())
			addTraversalChunk(traversalChunks, it.next());
		
		//copyTaskAttributes(task, copyTask);
		logger.trace("createTask(): "+traversalChunks.size()+"("
				+copyTask.getChunks().get(groupingStr).size()+") " +
						"chunks added for Task="+copyTask.getUniqueString()
		);

		return copyTask;
	}
	
	private static boolean addTraversalChunk(EList<TraversalChunk> traversalChunks, 
			GroupingInstance groupingInstance)
	{
		for (TraversalChunk tc:traversalChunks)
			if (groupingInstance.getName().equals(tc.getName()))
				return false;
		TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
		traversalChunk.setName(groupingInstance.getName());
		traversalChunks.add(traversalChunk);
		return true;
	}
	
	public static TraversalEvent getNewTraversalEventBySplittingTask(Task task, TraversalEvent traversalEvent)
	{
		
		EMap<String, EList<TraversalChunk>> nonOverlappingChunks = 
				traversalEvent.getSplitTask().getNonOveralppingTraversalChunksFor(task);
		logger.debug("getNewTravEventBySplittingTask(): specialize "+traversalEvent.getSplitTask().getUniqueString()
				+" to "+task.getUniqueString());
		//if (nonOverlappingChunks.isEmpty())
			//return traversalEvent;
			
		TraversalEvent newTraversalEvent = EcoreUtil.copy(traversalEvent);
		newTraversalEvent.setSplitTask(task);
		return newTraversalEvent;
	}

	
	public static EList<String> getTaskStringList(EList<Task> tasks)
	{
		EList<String> taskStrings = new BasicEList<String>();
		for (Task task:tasks)
			taskStrings.add(task.getUniqueString());
		return taskStrings;
	}	
	
	// used in getNewTraversalEvents
	public static boolean isValidConversion(Task taskFrom, Task taskTo)
	{
		//boolean isValid = false;
		for (String groupingStr : taskTo.getChunks().keySet())
			for (TraversalChunk traversalChunk : taskTo.getChunks().get(groupingStr))
				if (!isValidConversion(taskFrom.getChunks(), groupingStr, traversalChunk.getName()))
				{
					logger.debug("isValidConversion(): not valid: "+taskFrom.getUniqueString()+" -> "+taskTo.getUniqueString());
					return false;
				}
		logger.debug("isValidConversion(): valid: "+taskFrom.getUniqueString()+" -> "+taskTo.getUniqueString());
		return true;
	}


	// used in applyTraversalEventCopyGraph
	public static boolean isValidConversion(
			EMap<String, EList<TraversalChunk>> traversalChunks,
			String groupingStr,
			EList<GroupingInstance> groupingInstances
			)
	{
		for (GroupingInstance groupingInstance : groupingInstances)
		{
			if (isValidConversion(traversalChunks, groupingStr, groupingInstance.getName()))
				return true;
		}
		return false;
	}
	
	// internally used
	private static boolean isValidConversion(
			EMap<String, EList<TraversalChunk>> traversalChunks,
			String groupingStr, String instanceStr)
	{
		for (String parentGroupStr : traversalChunks.keySet())
		{
			boolean isValid = false;
			for (TraversalChunk traversalChunk : traversalChunks.get(parentGroupStr))
			{
				String key = parentGroupStr+"_"+groupingStr+"_"+traversalChunk.getName();
				//logger.debug("isValidConversion(): "+key+" contains:"+getMetaData().getGroupingInstancesByGroup().containsKey(key));
				if (parentGroupStr.equals(groupingStr))
				{
					if (traversalChunk.getName().equals(instanceStr))
					{
						isValid = true;
						break;
					}
				}
				else //if (getMetaData().getGroupingInstancesByGroup().containsKey(key))
				{
					for (GroupingInstance groupingInstance : 
						GlobalVar.getMetaData().
							getInstances(parentGroupStr, 
									groupingStr, traversalChunk.getName()))
					{
						if (groupingInstance.getName().equals(instanceStr))
						{
							isValid = true;
							break;
						}
					}
				}
			}
			if (!isValid)
				return false;
		}
		return true;
	}
	
	/*
	// used in applyTraversalEvent (for param crit merge task)
	private boolean isValidConversion(
			EList<TraversalChunk> traversalChunks,
			EList<GroupingInstance> groupingInstances) {

		if (traversalChunks.isEmpty())
			return true;

		for (GroupingInstance groupingInstance : groupingInstances) 
		{
			if (isValidConversion(traversalChunks, groupingInstance.getName()))
				return true;
		}
		return false;
	}
	
	private boolean isValidConversion(EList<TraversalChunk> traversalChunks, String instanceStr)
	{
		boolean isValid = false; 
		for (TraversalChunk traversalChunk : traversalChunks)
		{
			if (traversalChunk.getName().equals(instanceStr))
				{
					isValid = true;
					break;
				}
		}
		return isValid;


	}
	*/	
	
	public static boolean containsTask(EList<Task> tasks, Task task)
	{
		for (Task t:tasks)
		{
			//logger.debug(t.getUniqueString()+" vs "+task.getUniqueString());
			if (task.getUniqueString().equals(t.getUniqueString()))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public static String traversalEventToString(TraversalEvent traversalEvent) {
		String parentTasks="(";
		for (Task parentTask : traversalEvent.getParentTask()) {
			parentTasks+=parentTask.getUniqueString()+" ";
		}
		parentTasks+=")";
		String mergeTasks="(";
		for (Task mergeTask : traversalEvent.getMergeTask()) {
			mergeTasks+=mergeTask.getUniqueString()+" ";
		}
		
		mergeTasks+=")";
		DefaultMetaData m=(DefaultMetaData)GlobalVar.getMetaData();
		String key=traversalEvent.getTraversalCriterion().getId();
		String str = traversalEvent.getTraversalCriterion().getId()+" "
				+traversalEvent.getTraversalCriterion().getMode()
				+" parentTasks="  +parentTasks
				+" splittingTask="+traversalEvent.getSplitTask().getUniqueString()
				+" mergeTasks="   +mergeTasks
				+" #instances="   +(m.getGroupingInstances().containsKey(key)?
					m.getGroupingInstances().get(key).getInstances().size():null); 
		//logger.debug("applyTraversalEvents(): "+str);

		return str;
	}
	
	
	public static DataLink copyDataLink(DataLink dataLink, Task source)
	{
		DataLink dataLinkCopy = copyDataLink(dataLink);
		if (!source.getOutDataPorts().isEmpty() && !source.isCompatibleWithInDataPortFor(dataLinkCopy.getDataPort()))
			dataLinkCopy.setDataPort(source.getOutDataPorts().get(0));
		return dataLinkCopy;
	}
	
	public static DataLink copyDataLink(DataLink dataLink)
	{
		return copyDataLinkChunks(dataLink, null, null);
	}
	
	public static DataLink copyDataLinkChunk(DataLink dataLink, String grouping, TraversalChunk traversalChunk)
	{
		EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
		traversalChunks.add(traversalChunk);
		return copyDataLinkChunks(dataLink, grouping, traversalChunks);
	}
	
	// fallback to copy all chunks from template datalink
	public static DataLink copyDataLinkChunks(DataLink dataLink, String grouping, EList<TraversalChunk> traversalChunks)
	{
		DataLink dataLinkCopy = EcoreUtil.copy(dataLink);
		dataLinkCopy.setId(dataLinkCopy.hashCode());
		dataLinkCopy.setDataPort(EcoreUtil.copy(dataLink.getDataPort()));
		dataLinkCopy.setInDataPort(EcoreUtil.copy(dataLink.getInDataPort()));
		if (grouping == null)
			for (Entry<String, EList<TraversalChunk>> e: dataLink.getChunks().entrySet())
			{
				if (grouping == null)
					grouping = e.getKey();
				dataLinkCopy.getChunks().put(e.getKey(), new BasicEList<TraversalChunk>(EcoreUtil.copyAll(e.getValue())));
			}
		else
		{
			dataLinkCopy.getChunks().clear();
			if (traversalChunks == null)
			{
				if (dataLink.getChunks().containsKey(grouping))
					dataLinkCopy.getChunks().put(grouping, new BasicEList<TraversalChunk>(EcoreUtil.copyAll(dataLink.getChunks().get(grouping))));
				//else
					
			}
			else
			{
				
				dataLinkCopy.getChunks().put(grouping, traversalChunks);
			}
		}
		
		logger.debug("copyDataLinkChunks(): chunks="+easyflow.custom.util.Util.list2String(dataLinkCopy.getChunks().get(grouping), null)
				+" dataport="+easyflow.custom.util.Util.list2String(dataLinkCopy.getDataPort().getGroupingCriteria(), null)
				+" indataport="+easyflow.custom.util.Util.list2String(dataLinkCopy.getInDataPort().getGroupingCriteria(), null)
				);
		//dataLinkCopy.setData(EcoreUtil.copy(dataLink.getData()));
		
		return dataLinkCopy;
	}
		
	public static EMap<String, EList<TraversalChunk>> getCoveredChunks(Task task, Task sourceTask, 
			DataPort dataPort, String groupingStr, boolean modeUnion) throws ToolNotFoundException
	{
		EMap<String, EList<TraversalChunk>> allCoveredChunks = new BasicEMap<String, EList<TraversalChunk>>();
		logger.trace("getCoveredChunks(): sourceTask="+sourceTask.getUniqueString()+" task="+task.getUniqueString());
		
		if (allCoveredChunks.isEmpty())
		{
			EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
			EList<String>         tcStrings       = new BasicEList<String>();
			
			for (TraversalChunk traversalChunk : getChunksFor(sourceTask, groupingStr, modeUnion))
			{
				logger.trace("getCoveredChunks(): check "+traversalChunk.getName()+" against "
						+getRecordsForChunks(task, modeUnion).size()
						+" target chunks. modeUnion="+modeUnion);
				
				boolean found = false;
				for (TraversalChunk targetTC : getChunksFor(task, groupingStr, modeUnion))
				{
					if (traversalChunk.getName().equals(targetTC.getName()))
					{
						logger.trace("getCoveredChunks(): chunk "+traversalChunk.getName()+" added");
						if (targetTC.isDerived1by1())
							traversalChunk.setDerived1by1(targetTC.isDerived1by1());
						traversalChunks.add(traversalChunk);
						tcStrings.add(traversalChunk.getName());
						found = true;
					}
				}
				if (!modeUnion && !found)
				{
					allCoveredChunks.clear();
					break;
				}
			}
			if (!traversalChunks.isEmpty())
			{
				logger.trace("getCoveredChunks(): add "+traversalChunks.size()+" traversal chunks for record. ("+StringUtils.join(tcStrings.iterator(), ", ")+")");
				allCoveredChunks.put(groupingStr, traversalChunks);
			}					
		}
		return allCoveredChunks;

	}	

	
	public static EList<TraversalChunk> getChunksFor(Task task, String groupingStr, boolean intersect)
	{	
		EList<TraversalChunk> records = task.getRecords(intersect);
		EList<String> recordStr = new BasicEList<String>();
		EList<TraversalChunk> traversalChunks = new BasicEList<TraversalChunk>();
		for (TraversalChunk record:records)
		{
			recordStr.add(record.getName());
		}
		logger.debug("getChunksFor(): Found recs=("+StringUtils.join(recordStr, ",")+") ");
		EList<GroupingInstance> groupingInstances = GlobalVar.getMetaData().getInstancesForRecords(groupingStr, recordStr);
		for (GroupingInstance groupingInstance:groupingInstances)
		{
			TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
			traversalChunk.setName(groupingInstance.getName());
			traversalChunks.add(traversalChunk);
		}
		logger.debug("getChunksFor(): Found isntances=("+Util.list2String(traversalChunks, ",")+") for group "+groupingStr);
		return traversalChunks;
		
		/*
		EMap<String, TraversalChunk> traversalChunks = new BasicEMap<String, TraversalChunk>();
		boolean firstRound = true;
		for (Entry<String, EList<TraversalChunk>> entry:task.getChunks())
		{
			for (TraversalChunk chunk:entry.getValue())
			{
				EList<GroupingInstance> groupingInstances = GlobalVar.getGraphUtil().getMetaData().getInstances(groupingStr, entry.getKey(), chunk.getName());
				logger.debug("getChunksFor() got "+groupingInstances.size()+" chunks for transforming instance "+chunk.getName()+" from "+groupingStr+" to "+entry.getKey());
				if (!groupingInstances.isEmpty())
				{
					for (GroupingInstance groupingInstance:groupingInstances)
					{
						String key = groupingInstance.getName();
						
						if (!traversalChunks.containsKey(key) || firstRound)
						{
							TraversalChunk traversalChunk = TraversalFactory.eINSTANCE.createTraversalChunk();
							traversalChunk.setName(key);
							traversalChunks.put(key, traversalChunk);
						}
						else if (!firstRound && !traversalChunks.containsKey(key))
						{
							logger.debug("getChunksFor(): found non intersecting chunk "+key);
						}
					}
				}
			}
			if (firstRound && intersect)
				firstRound = false;
		}
		return new BasicEList<TraversalChunk>(traversalChunks.values());
		*/
	}
	
	private static EList<TraversalChunk> getRecordsForChunks(Task task, boolean modeUnion)
	{
		return task.getRecords(!modeUnion);
		// union=true ->return all found records
		// union=false->require records to match each traversalchunk group
	}
	
	public static String getGroupingCriterionOfUtilityTask(Task task)
	{
		return task.getGroupingCriteria().get(0).getKey();
	}
	
	public static Task getUtilityTask(DataPort inDataPort, String analysisType, Task task) throws UtilityTaskNotFoundException
	{
		//if (analysisType.equalsIgnoreCase(GlobalConstants.ANALYSIS_TYPE_INDEX))
		//{
			for (String utilTaskString : GlobalVar.getUtilityTasks().keySet())
			{
				if (utilTaskString.endsWith(inDataPort.getFormat().getName()+"_"+analysisType))
				{
					return GlobalVar.getUtilityTasks().get(utilTaskString);
				}	
			}
		//}
			String err = getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_GRAPH_UTIL_NO_TASK_FOR_ANALYSIS_TYPE_3, 
					Severity.ERROR,
					Util.generateStringList(inDataPort.getName(), task.getUniqueString(), analysisType));
			GlobalVar.setLastErrorInfo(Category.GRAPH_UTIL, task, null,
					err, true);
		throw new UtilityTaskNotFoundException();
	}
	
	public static Task getUtilityTask(DataLink dataLink, String analysisType, Task task) 
			throws UtilityTaskNotFoundException
	{
		return getUtilityTask(dataLink.getDataPort(), dataLink.getInDataPort(), analysisType, task);
	}
		
	public static Task getUtilityTask(DataPort inDataPort, DataPort dataPort, 
			String analysisType, Task task)  
					throws UtilityTaskNotFoundException
	{
		String utilityTaskUniqueString = getUtilityTaskKey(inDataPort, dataPort, analysisType, task);
		logger.debug("utilityTaskUniqueString(): trying to get utility task="+utilityTaskUniqueString);
		if (GlobalVar.getUtilityTasks().containsKey(utilityTaskUniqueString) && 
				GlobalVar.getUtilityTasks().get(utilityTaskUniqueString) != null)
		{
			return GlobalVar.getUtilityTasks().get(utilityTaskUniqueString);
		}
		else
		{
			String err = getLogMessage().generateLogMsg(GlobalConstants.LOG_MSG_GRAPH_UTIL_NO_TASK_FOR_ANALYSIS_TYPE_3, 
					Severity.ERROR,
					Util.generateStringList(inDataPort.getName(), task.getUniqueString(), analysisType));
			GlobalVar.setLastErrorInfo(Category.GRAPH_UTIL, task, null,
					err, true);
			throw new UtilityTaskNotFoundException();
		}
	}
	
	private static boolean validateDataPortForUtilityTaskSearch(DataPort dataPort, String direction,
			String analysisType, Task task)
	{
		if (dataPort == null || dataPort.getFormat() == null)
		{
			String err = getLogMessage().generateLogMsg(
							GlobalConstants.LOG_MSG_GRAPH_UTIL_INVALID_DATAPORRT_FOR_TASK_3, Severity.ERROR, 
							Util.generateStringList(direction, analysisType, task.getUniqueString()));
			GlobalVar.setLastErrorInfo(Category.GRAPH_UTIL, task, null,
					err, true);
			return false;
		}
		return true;
	}
	
	private static boolean validateDataLinkForUtilityTaskSearch(DataLink dataLink, String analysisType, Task task)
	{
		if (!validateDataPortForUtilityTaskSearch(dataLink.getInDataPort(), "ingoing", analysisType, task))
		{
			GlobalVar.getLastErrorInfo().setDataLink(dataLink);
			return false;
		}
		else if (!validateDataPortForUtilityTaskSearch(dataLink.getDataPort(), "outgoing", analysisType, task))
		{
			GlobalVar.getLastErrorInfo().setDataLink(dataLink);
			return false;
		}
		
		return true;
	}

	public static String getUtilityTaskKey(DataPort in, DataPort out, String analysisType, Task task)
	{	
		if ( !(validateDataPortForUtilityTaskSearch(in, "ingoing", analysisType, task) && 
				validateDataPortForUtilityTaskSearch(out, "outgoing", analysisType, task)))
		{
			return null;
		}
		String utilityTaskUniqueString = 
				in.getFormat().getName()
				+"_"+out.getFormat().getName()
				+"_"+analysisType;
		return utilityTaskUniqueString;
	}	
	
	public static String getUtilityTaskKey(DataLink dataLink, String analysisType, Task task)
	{
		if (!validateDataLinkForUtilityTaskSearch(dataLink, analysisType, task))
		{
			return null;
		}
		String utilityTaskUniqueString = 
				dataLink.getInDataPort().getFormat().getName()
				+"_"+dataLink.getDataPort().getFormat().getName()
				+"_"+analysisType;
		return utilityTaskUniqueString;
	}	
}

