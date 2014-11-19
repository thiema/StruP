/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.graph.jgraphx.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map.Entry;

import easyflow.core.Catalog;
import easyflow.core.Task;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.graph.jgraphx.Graph;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.jgraphx.graph.JGraphXUtil;
import easyflow.custom.util.GlobalConstants;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.Tuple;
import easyflow.custom.util.URIUtil;
import easyflow.data.Data;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.graph.jgraphx.JgraphxPackage;
import easyflow.graph.jgraphx.ToolDependencyGraph;
import easyflow.graph.jgraphx.ToolDependencies;
import org.eclipse.emf.common.notify.Notification;

import easyflow.tool.Command;
import easyflow.tool.InOutParameter;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalCriterion;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph.mxICellVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.graph.jgraphx.impl.ToolDependencyGraphImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolDependencyGraphImpl extends EObjectImpl implements ToolDependencyGraph {
	
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;
	
	private static Logger logger = Logger.getLogger(ToolDependencies.class);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolDependencyGraphImpl() {
		super();
	}

	// 
	
	// set the tools ToolDependency, InputFiles, OutputFiles attributes
	// resolve the output and input pairs of parent/child tasks (connected by an edge
	// and associated datalink)
	
	// algorithm:
	// iterate the graph in topological order
	//   for a vertex get all ingoing parents and set the static and non-static inputs (the operation is performed on the datalinks associated to each cell) 
	//   	set the member attribute data of datalink which contains the name of the input resource 
	//		(usually a file name, but we use here type URI)
	//      special case: the resource name of the available input data is not setable
	//		              (i.e. the tool expects a fixed name) either symlink, copy or move the resource to the fixed name 
	//		              
	
	private URI getURIFromObject(Object object)
	{
		URI uri = null;
		try {
			if (object instanceof String)
			uri = new URI((String)object);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uri;
	}
	
	
	private boolean isStaticPort(Data data, Task task)
	{
		boolean isStatic = data.getPort().isStatic();
		if (!isStatic)
		{
			for (DataPort dataPort:task.getOutDataPorts())
			{
				//logger.debug("test dataPort="+dataPort.getName()+" "+dataPort.isStatic());
				if (dataPort.isCompatible(data.getPort()))
				{
					logger.trace("isStaticPort(): found compatible port="+dataPort.getName()+" static="+dataPort.isStatic());
					isStatic = dataPort.isStatic();
				}
			}
		}
		return isStatic;
	}
	
	public boolean resolveToolDependencies(mxICell root, final Catalog catalog) throws NoValidInOutDataException
	{
		boolean rc = true;
		final EMap<String, DataPort> staticInputs = new BasicEMap<String, DataPort>();
		final EMap<String, DataPort> inputs       = new BasicEMap<String, DataPort>();
		final EList<String>          rcTraversal  = new BasicEList<String>();
		
		final String inputDir = (String) (catalog.getEntries().containsKey(GlobalConstants.DATA_INPUT_DIR) ? 
				catalog.getEntries().get(GlobalConstants.DATA_INPUT_DIR) : "");
		final String workDir  = (String) (catalog.getEntries().containsKey(GlobalConstants.DATA_WORK_DIR) ? 
				catalog.getEntries().get(GlobalConstants.DATA_WORK_DIR) : "");
		final String tmpDir   = (String) (catalog.getEntries().containsKey(GlobalConstants.DATA_TMP_DIR) ? 
				catalog.getEntries().get(GlobalConstants.DATA_TMP_DIR) : "");
		final String resourceDir = "";
		
		for (DataPort dataPort: GlobalVar.getRootTask().getOutDataPorts())
		{
			if (dataPort.isStatic())
			{
				staticInputs.put(dataPort.getName(), dataPort);
			}
			else
			{
				inputs.put(dataPort.getName(), dataPort);
			}
			logger.debug("resolveToolDependencies(): found data port="+dataPort.getName()
					+" with formats="+dataPort.getDataFormats().keySet()
					+" isStatic="+dataPort.isStatic());
			
		}
		
		logger.debug("resolveToolDependencies(): staticInputs="+staticInputs.keySet());
		
		
		mxICellVisitor visitor=new mxICellVisitor()
		{
			@Override
			public boolean visit(Object vertex, Object edge) {
				
				try {
					Task task = JGraphXUtil.loadTask(vertex);
					logger.debug("resolveToolDependencies(): ================================ resolve for task="+task.getUniqueString()+" ===================================================");
					//logger.debug("resolveToolDependencies(): process task="+task.getUniqueString());
					if (task.getTools().isEmpty())
					{
						logger.error("resolveToolDependencies(): no tool. nothing to do.");
					}
					else
					{
						if (getGraph().getGraph().getOutgoingEdges(vertex).length == 0)
						{
							logger.debug("resolveToolDependencies(): no outgoing dataports. nothing to do.");
						}
						else
						{
							int i=0;
							Tool tool = task.getPreferredTool();
							//logger.debug("resolveToolDependencies(): tool="+tool.getId()+" data="+tool.getData().keySet());
							for (Object edgeOut : getGraph().getGraph().getOutgoingEdges(vertex))
							{
								i++;
								try {
									Task     child         = JGraphXUtil.getTargetTask((mxCell) edgeOut);
									Tool     childTool     = child == null ? null : child.getPreferredTool();
									DataLink dataLink      = JGraphXUtil.loadDataLink(edgeOut);
									//DataPort dataPort      = null;
									//String   firstInstance = getFirstInstance(task, dataLink);
									String   groupingStr   = dataLink.getParentGroupingStr();
									String   paramStr      = dataLink.getParamStr();
									String   firstInstanceDL = null;
									String   chunksResult  ="";
									
									String debugTool = "rmdup";
									//String debugTool = "view";
									if (debugTool.equals(tool.getName()))
									{
										logger.debug("debug tool="+debugTool);
									}
									
									EList<Data> parentData = new BasicEList<Data>();
									try
									{
										// retrieve the parent tool data
										// ParentTool -----------> ChildTool
										// tool       dataLink---> childTool 
										parentData = getToolDataForDataLink(tool.getData(), dataLink, false);
									}
									catch (NoValidInOutDataException e)
									{
										logger.error("resolveToolDependencies(): no ingoing tool data found.");
										//e.printStackTrace();
										//boolean noChildDataAvail = true;
									}
									
									if (parentData.size() == 0)
									{
										logger.warn("resolveToolDependencies(): no data port found");
									}
									else if (parentData.size() > 1)
									{
										logger.warn("resolveToolDependencies(): ambigous data port (found "+parentData.size()+" ports)");
									}
									
									if (!dataLink.getChunks().isEmpty())
									{
										/*if (paramStr != null && !paramStr.equals("") 
												&& dataLink.getChunks().containsKey(paramStr) 
												&& !dataLink.getChunks().get(paramStr).isEmpty())
											firstInstanceDL=dataLink.getChunks().get(paramStr).get(0).getName();
										else */
										if (dataLink.getChunks().get(groupingStr) == null)
											//logger.debug("resolveToolDependencies(): no chunks found for grouping="+groupingStr);
											chunksResult="no chunk found for grouping="+groupingStr;
										else if (!dataLink.getChunks().get(groupingStr).isEmpty())
										{
											if (dataLink.getChunks().get(groupingStr).size() > 1)
											{
												logger.warn("resolveToolDependencies(): more than one chunk found. Use only first one.");
												chunksResult="more than one chunk found";
											}
											else
												chunksResult="chunk found";	
											firstInstanceDL=dataLink.getChunks().get(groupingStr).get(0).getName();
											//logger.debug("resolveToolDependencies(): chunks found in datalink to resolve tool output.");
										}
									}
									else
										chunksResult ="no chunk found in datalink";
									
									//boolean  isMetadata    = false;
									boolean  isStaticInput = false;
									boolean  isGenericInput= false;
									
									String   specString    = "========= resolve datalink #"+(i)
											+" (Tool="+tool.getName()+")=>"+(child!=null?child.getUniqueString():null)
											+" (Tool="+(childTool!=null?childTool.getName():null)+")"
											+" ===================";
									//boolean  assumeHiddenInput = false;
									
									logger.debug("resolveToolDependencies(): "+specString
												+" datalink="+dataLink.getId()+" "+dataLink.getFormat().getName()
											+"\n   ---group="+groupingStr+" firstInstance="+firstInstanceDL+" "+chunksResult
												+task.getTraversalEvents().keySet()+" childs:"+(child == null ? "null":child.getTraversalEvents().keySet())
											+"\n   ---dataPort (Out)="+(dataLink.getDataPort() != null ? (dataLink.getDataPort().getName()
												+" "+dataLink.getDataPort().getParameterName()+" "+dataLink.getDataPort().hashCode()) : null)
											+" dataPort (In)="+(dataLink.getInDataPort() != null ?
													(dataLink.getInDataPort().getName()+" "+dataLink.getInDataPort().getParameterName()
												+" "+dataLink.getInDataPort().hashCode()):null)
												+" found "+parentData.size()+" ports (for tool)"
									);
									
									//EList<Data> parentData = getToolDataForDataLink(tool.getData(), dataLink, task.isRoot());
									
									EList<Data> childData  = null;
									if (childTool != null)
									{
										try
										{
											childData = getToolDataForDataLink(childTool.getData(), dataLink, true);
										}
										catch (NoValidInOutDataException e)
										{
											e.printStackTrace();
											//boolean noChildDataAvail = true;
										}
									}
									else if (!dataLink.isTerminal())
										logger.error("resolveToolDependencies(): no child tool found."+" ("+specString+")");
									
									
									// get the desired data matching both parent and child 
									Tuple<Data, Data> matchingData = findMatchingData(parentData, childData, dataLink.getFormat());
									if (matchingData == null)
										throw new NoValidInOutDataException();
									//
									if (matchingData.parent != null)
									{
										Data data = EcoreUtil.copy(matchingData.parent);
										ResolvedParam rp = task.getResolvedCommand().getDataParamForDataPort(data.getPort(), true, GlobalConstants.PARAM_DATA_MATCH_STRATEGY_DATA_FORMAT);
										if (rp == null)
											logger.error("no valid parameter found.");
										else
										{
											logger.debug(""+rp.renderToString());
											data.setResolvedParam(rp);
											//if (data.getSupportedHandles(true).contains(GlobalConstants.NAME_PIPE_HANDLE))
												//isPipable = true;
										}
										dataLink.setInData(data);
									}
									else
										logger.error("Parent_NoValidInOutDataException");
										//throw new NoValidInOutDataException();
									
									if (matchingData.child != null)
									{
										Data data = EcoreUtil.copy(matchingData.child);
										ResolvedParam rp = child.getResolvedCommand().getDataParamForDataPort(data.getPort(), false, GlobalConstants.PARAM_DATA_MATCH_STRATEGY_DATA_FORMAT);
										if (rp == null)
											logger.error("no valid parameter found.");
										else
										{
											logger.debug(""+rp.renderToString());
											data.setResolvedParam(rp);
											//if (!data.getSupportedHandles(true).contains(GlobalConstants.NAME_PIPE_HANDLE))
												//isPipable = false;
										}
										dataLink.setData(data);
									}
									else
										logger.error("Child_NoValidInOutDataException");
									
									if (matchingData.parent != null)
										dataLink.getInDataPort().setParameterName(matchingData.parent.getParameter().getEffectiveParentParameter(true).getName());

									if (dataLink.getInDataPort() == null)
										throw new NoValidInOutDataException();
									
									if (dataLink.getInDataPort().getParameterName() == null)
										if (!task.isRoot())
											logger.error("resolveToolDependencies(): parametername could not be resolved. " +
													"parent="+(matchingData.parent != null ? matchingData.parent.getName() : null));
									
									if (matchingData.child != null)
										dataLink.getDataPort().setParameterName(matchingData.child.getParameter().getEffectiveParentParameter(true).getName());
									
									if (!dataLink.isTerminal() && matchingData.child == null) //dataLink.getInDataPort().getParameterName() == null)
									{
										logger.error("resolveToolDependencies(): child parametername could not be resolved.");
										DataLink parentDataLink = getFirstParentDataLink(task, task.getInDataPorts().get(0));
										if (parentDataLink != null && parentDataLink.getDataResourceName() != null)
										{
											InOutParameter p = (InOutParameter) matchingData.parent.getParameter();
											
											logger.info("resolveToolDependencies():"
													+" assume parameter=" +p.resolveName()
													+" to be hidden. use parent datalink="+parentDataLink.getUniqueString()+" to set resource."
													+" output filename creation: "+p.getFilenameCreation());
											URI uri = parentDataLink.getDataResourceName();
											if (GlobalConstants.ADD_EXTENSION_TO_FILENAME.equals(p.getFilenameCreation()))
											{
												uri = URIUtil.addExtensionToURI(uri, 
														dataLink.getInDataPort().getFormat().getName(), false);
											}
											else
											{
												uri = URIUtil.addExtensionToURI(
														uri, 
														dataLink.getInDataPort().getFormat().getName(), true);
												
											}
											dataLink.setDataResourceName(uri);
											continue;
										}
									}
									
									// decide if the port is a static one. assume non-static port if outgoing datalink is not set 
									boolean isStatic = dataLink.getData() != null ? isStaticPort(dataLink.getData(), task) : false;

									TraversalCriterion tc = dataLink.isTerminal() ?
											(task.getTraversalEvents().containsKey(groupingStr) ? 
											task.getTraversalEvents().get(groupingStr).getTraversalCriterion() : null)
											:
											(child.getTraversalEvents().containsKey(groupingStr) ? 
											child.getTraversalEvents().get(groupingStr).getTraversalCriterion() : null);
													
									logger.debug("resolveToolDependencies(): "
											+"... continue ..."
											+" travcrit=("+(tc != null ? 
													(tc.getChunkSource()+" "+tc.getId()+" "+tc.getName()+" "+tc.getMode()+" "+tc.getOperation().getName()):null)+") all:"
													+task.getTraversalEvents().keySet()+" childs:"+(child != null ? child.getTraversalEvents().keySet() : null)
											+" static="+isStatic
											+"\n datalink="+dataLink.getId()+" "+dataLink.getDataResourceName()
											+"\n   ---paramName out="+dataLink.getInDataPort().getParameterName()+" in="+(dataLink.getDataPort() != null ? 
													dataLink.getDataPort().getParameterName() : null)
											+"\n   ---parent data=("+(matchingData.parent != null ?
													("format="+matchingData.parent.getFormat().getName()+" name="+matchingData.parent.getName()
															+" port="+matchingData.parent.getPort().getName()) 
															+" param="+matchingData.parent.getPort().getParameterName()+" "
															+" handle="+matchingData.parent.getHandle()+" isOutput="+matchingData.parent.isOutput() : null)+")"
											+"\n   ---child data=("+(matchingData.child != null ?
													("format="+matchingData.child.getFormat().getName()+" name="+matchingData.child.getName()
															+" port="+matchingData.child.getPort().getName()
															+" param="+matchingData.child.getPort().getParameterName()
															+" handle="+matchingData.child.getHandle())+" isOutput="+matchingData.child.isOutput() : null)+")"
									);
									
										// set inputs from DataLinks first instance
										if (!isStatic && firstInstanceDL != null && tc != null 
												&& GlobalConstants.METADATA_INPUT.equalsIgnoreCase(tc.getChunkSource()) 
												&& "metadata".equalsIgnoreCase(tc.getOperation().getName()))
										{
											dataLink.setDataResourceName(getURIFromObject(URIUtil.createPath(inputDir, firstInstanceDL)));
											logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (metadata (cached))");
										}
/*										else if (!isStatic && paramStr != null && !paramStr.equals("") && firstInstanceDL != null)
										{
											dataLink.getData().setDataResourceName(getURIFromObject(firstInstanceDL));
											logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (param criterion (preset))");
										}
										*/
										// special handling for root:
										// set inputs from metadata file
										else if (task.isRoot() && !isStatic)// && tc != null)
										{
											if (firstInstanceDL == null)
											{
												logger.error("resolveToolDependencies(): cannot process non static root with undefined instance");
											}
											// test if groupingStr is a valid key for metadata
											else if (GlobalConstants.METADATA_INPUT.equals(groupingStr) || !getGraph().getMetaData().containsColumn(groupingStr))
											{
												// try using the firstInstance
												dataLink.setDataResourceName(getURIFromObject(URIUtil.createPath(inputDir, firstInstanceDL)));
												logger.debug("resolveToolDependencies(): set dataresource="+firstInstanceDL+" (metadata (cached, directly resolve/unknown traversal criterion))");
											}
											else
											// read from metadata
											// get inputfile defined in metadata for the first non-empty record w.r.t. inputfile column 
											// retrieved for first defined instance
											for (String record:getGraph().getMetaData().getRecordsBy(groupingStr, firstInstanceDL))
											{
												logger.trace("resolveToolDependencies(): "+getGraph().getMetaData().getRow(record).get(GlobalConstants.METADATA_INPUT)+" rec="+record);
												
												String inputFile = getGraph().getMetaData().getRow(record).get(GlobalConstants.METADATA_INPUT);
												if (inputFile != null)
												{
													logger.debug("resolveToolDependencies(): set dataresource="+inputFile+" (metadata)");
													dataLink.setDataResourceName(getURIFromObject(URIUtil.createPath(inputDir, inputFile)));
													// assume the first non-null-record in metadata has the correct inputfile name/uri
													break;
												}
												else
												{
													//logger.debug("resolveToolDependencies(): no file defined for record="+record);
												}
											}
										}

										// set from catalog
										else if (isStatic)
										{
											if (catalog.getEntries().containsKey(dataLink.getData().getName()))
											{
												logger.debug("resolveToolDependencies(): "
														+"set dataresource="+catalog.getEntries().get(dataLink.getData().getName())+" (catalog)");
												dataLink.setDataResourceName(getURIFromObject(catalog.getEntries().get(dataLink.getData().getName())));
											}
											// try to get via data port
											else
											{
												boolean found = false;
												for (Entry<String, DataPort> e : staticInputs)
												{
													//logger.debug(e.getValue()+" "+dataLink.getDataPort());
													if (dataLink.getDataPort().isCompatible(e.getValue()))
													{
														logger.debug("resolveToolDependencies(): found matching static port="+e.getKey());
														if (catalog.getEntries().containsKey(e.getKey()))
														{
															logger.debug("resolveToolDependencies(): "
																	+"set dataresource="+catalog.getEntries().get(e.getKey())+" (catalog)");
															dataLink.setDataResourceName(getURIFromObject(
																	URIUtil.createPath(resourceDir, 
																	(String) catalog.getEntries().get(e.getKey()))));
															found = true;
															break;
														}
													}
												}
												if (!found)
													logger.error("resolveToolDependencies(): could not resolve static data port.");	
											}
										}
										// set from grouping criterion
										else if (!isStatic)
										{
											//if (task.is)
											String fileName = task.getUniqueURIString()+"."+dataLink.getFormat().renderAsFileExtension();
											
											dataLink.setDataResourceName(getURIFromObject(
													URIUtil.createPath(workDir, fileName)));
											logger.debug("resolveToolDependencies(): "
													+"set dataresource="+fileName+" (task's grouping)");
											if (paramStr != null && !paramStr.equals(""))
											{
												String paramNameStr = dataLink.getParamNameStr();
												/*if (tool.getCommand().resolveParameter(paramNameStr, dataLink.getChunks().get(paramStr)))
													logger.debug("resolveToolDependencies(): param="+paramNameStr+" resolved !");
												else
													logger.debug("resolveToolDependencies(): could not resolve param="+paramNameStr+" !");*/
												logger.debug("resolveToolDependencies(): parameter criterion id="+paramStr
														+" name="+paramNameStr
														+" with instances="
														+easyflow.custom.util.Util.list2String(dataLink.getChunks().get(paramStr), null));
											}
										}
										else
										{
											logger.error("resolveToolDependencies(): no input resource found !");
										}
										
									//}
									//else
									{
										
									}
									//
/*									
									// read from catalog
									
									// generate uri from group and its data port
									
									*/
									logger.debug("=================================================================================================================================");
							
								} catch (TaskNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (DataLinkNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (NoValidInOutDataException e) {
									// TODO Auto-generated catch block
									logger.error("failed to resolve tool "+tool.getName()+" task="+task.getUniqueString());
									e.printStackTrace();
									rcTraversal.add("NoValidInOutDataFoundException");
									return false;
								} catch (URISyntaxException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
				catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				return true;
			}

		};
		getGraph().getGraph().getModel().beginUpdate();		try		{
			getGraph().getGraph().traverseTopologicalOrder(root, visitor);
			JGraphXUtil.layoutGraph();
			
		}		finally		{			getGraph().getGraph().getModel().endUpdate();		}

		if (rcTraversal.contains("NoValidInOutDataFoundException"))
			//throw new NoValidInOutDataException();
			rc = false;

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
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH:
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
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH:
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
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH:
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
			case JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH:
				return graph != null;
		}
		return super.eIsSet(featureID);
	}

	// return the in/out data defined for the tool, for given datalink
	// special handling needed for:
	//   - root tool (only out-data port available)
	//   - terminal tools (which have only in-data port defined)
	//   - data, which have no parameter defined (->isAllowed() function)
	
	private EList<Data> getToolDataForDataLink(
								EMap<String, EList<Data>> dataMap,
								DataLink dataLink,
								boolean useOutDataPort) throws NoValidInOutDataException {
		
		EList<Data> data = new BasicEList<Data>();
		
		if (dataMap.isEmpty() && dataLink.getData() != null)
			data.add(dataLink.getData());
		else if (dataMap.isEmpty())
		{
			
		}
		else
		{
			for (EList<Data> dataList : dataMap.values())
			{
				for (Data curData : dataList)
				{
					DataPort tmp = useOutDataPort ? dataLink.getDataPort() : dataLink.getInDataPort();
					logger.debug(curData.getPort().getFormat().getName()+" ("+curData.getPort().getName()+") vs: "
								+tmp.getFormat().getName()+"("+tmp.getName()+") iscompatible="+(curData.getPort().isCompatible(tmp))
							+" isAllowed="+curData.isAllowed()+" isOutput="+curData.isOutput()
							+" matching in-out port="+((useOutDataPort && !curData.isOutput()) || (!useOutDataPort && curData.isOutput()))
							);
					if (
							((useOutDataPort && !curData.isOutput()) || (!useOutDataPort && curData.isOutput())) &&
							curData.isAllowed() && 
							curData.getPort().isCompatible(tmp)
					   )
						data.add(curData);
				}
			}
			if (data.isEmpty())
			{
				throw new NoValidInOutDataException();
			}
		}
		if (data.size()==0)
			logger.error("getToolDataForDataLink(): could not find tool for datalink="+dataLink.getUniqueString(true));
		
		return data;
	}
	
	// compare given 2 data and do at least:
	//  - resolve the handle -> set preferred handle
	// if only one data is non-null check the only one return the non null data 
	// in the correct tuples value 
	private Tuple<Data,Data> findMatchingData(EList<Data> parentData,
			EList<Data> childData,
			DataFormat dataFormat) 
	{
		EList<Data> tmpData = null;
		//String dummy;
		if ((parentData == null || parentData.isEmpty()) && childData != null && !childData.isEmpty())
			tmpData = childData;
		else if ((childData == null || childData.isEmpty()) && parentData != null && !parentData.isEmpty())
			tmpData = parentData;

		if (tmpData != null)
		{
			for (Data d : tmpData)
			{
				if (d.matchFormat(dataFormat))
				{
/*					EList<String> tmpHandleList = d.getSupportedHandles(false); 
					if (tmpHandleList!=null && !tmpHandleList.isEmpty())
					{
						d.setPreferredHandle(tmpHandleList.get(0));
						return new Tuple<Data, Data>((parentData == null || parentData.isEmpty())? null : d, 
								(childData == null || childData.isEmpty()) ? null : d);
					}
					*/
					
					return new Tuple<Data, Data>(
											(parentData == null || parentData.isEmpty()) ? null : d, 
											(childData  == null || childData.isEmpty())  ? null : d
												);
				}
			}
		}
		else if (childData != null)
		{
			for (Data child : childData)
			{
				if (!child.isOutput())				
					for (Data parent : parentData)
					{
						if (parent.isOutput() && child.match(parent))
							return new Tuple<Data, Data>(parent, child);
					}
			}
		}
		else if (parentData == null)
			return null;
		
		if (parentData != null)	
			for (Data parent : parentData)
			{
				if (parent.matchFormat(dataFormat))
				{
					//get the first dataformat matching data
					return new Tuple<Data, Data>(parent, null);
				}
			}

		if (childData != null)
			for (Data child : childData)
			{
				if (child.matchFormat(dataFormat))
				{
					//get the first dataformat matching data
					return new easyflow.custom.util.Tuple<Data, Data>(null, child);
				}
			}
		
		return null;
	}

	
	private DataLink getFirstParentDataLink(Task task, DataPort dataPort) throws DataLinkNotFoundException, TaskNotFoundException
	{
		//DataLink parentDataLink;
		for (Object o : JGraphXUtil.getInEdgesForDataPort(GlobalVar.getCells().get(task.getUniqueString()), dataPort))
		{
			return JGraphXUtil.loadDataLink(o);
		}
		return null;
	}
	
	private String getFirstInstance(Task task, DataLink dataLink)
	{
		String firstInstanceStr = null;

		for (TraversalCriterion traversalCriterion : dataLink.getInDataPort().getGroupingCriteria())
		{
			if (task.getChunks().containsKey(traversalCriterion.getId()))
			{
				logger.trace("getFirstInstance(): "+traversalCriterion.getId()+" "+task.getChunks().get(traversalCriterion.getId()).size());
				if (task.getChunks().get(traversalCriterion.getId()).isEmpty())
				{
					logger.error("getFirstInstance(): no instances found  for "+traversalCriterion.getId());
				}
				else
				{
					firstInstanceStr = task.getChunks().get(traversalCriterion.getId()).get(0).getName();
				}
			}
			else
			{
				logger.trace("getFirstInstance(): no chunks for "+traversalCriterion.getId()+" in task "+task.getUniqueString()+" found.");
			}
		}
		
		logger.debug("getFirstInstance(): " 
				+"task="+task.getName()
				+" in="+easyflow.custom.util.Util.list2String(dataLink.getInDataPort().getGroupingCriteria(), null)
				+"; task chunk keys="+task.getChunks().keySet()+" "
				+"; chunks for "+dataLink.getParentGroupingStr()+" "
				+easyflow.custom.util.Util.list2String(dataLink.getChunks().get(dataLink.getParentGroupingStr()), null)
				+" firstInstance="+firstInstanceStr
				+" dataport="+(dataLink.getDataPort() != null ? (dataLink.getDataPort().getName()+" static="+dataLink.getDataPort().isStatic()): "na"));

		return firstInstanceStr;
		
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JgraphxPackage.Literals.TOOL_DEPENDENCY_GRAPH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH, oldGraph, graph));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JgraphxPackage.TOOL_DEPENDENCY_GRAPH__GRAPH, oldGraph, graph));
	}

} //ToolDependenciesImpl
