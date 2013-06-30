package easyflow.custom.jgraphx.editor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.mxgraph.examples.swing.editor.BasicGraphEditor;
import com.mxgraph.io.mxCodecRegistry;
import com.mxgraph.io.mxObjectCodec;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;
import easyflow.core.GroupingInstance;
import easyflow.core.Task;
import easyflow.core.TraversalEvent;
import easyflow.core.Workflow;
import easyflow.custom.util.XMLUtil;
import easyflow.graph.jgraphx.Util;
import easyflow.sequencing.SequencingFactory;
import easyflow.sequencing.ResequencingProject;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.core.DefaultMetaData;


public class EasyFlowToolBar extends JToolBar
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592403145874164000L;
	
	private static final ResequencingProject resequencingProject=SequencingFactory.eINSTANCE.createResequencingProject();
	private static final Logger logger = Logger.getLogger(EasyFlowToolBar.class);
	private Util graphUtil = JgraphxFactory.eINSTANCE.createUtil();
	private final Map<String, Object> objects=new HashMap<String, Object>();
	private DefaultMetaData metaData;

	//static int counter = 0, iteration = 1;
	static String lastParent=null;
	
	public enum State {
		NONE,
		COMPUTE_SUBGRAPH,
		COPY_GRAPH, 
		APPLY_TRAVERSAL_EVENT, 
		REMOVE_SUBGRAPH;
		
	}
	
	public enum Event {
		NONE,
		NEXT;		
	}
	
	
	mxICell subGraphRoot;
	TraversalEvent traversalEvent;
	
	
	/**
	 * 
	 */
	//public EasyFlowToolBar(final BasicGraphEditor editor, int orientation)
	public EasyFlowToolBar(final SchemaEditor editor, int orientation)
	{
		super(orientation);
		
		register();
		
		setBorder(BorderFactory.createCompoundBorder(BorderFactory
				.createEmptyBorder(3, 3, 3, 3), getBorder()));
		setFloatable(false);

		final Action autoSetupProjectAction = new AutoSetupAction();
		final Action applyGroupingCritAction = new ApplyGroupingCritAction();

		final Action applyTraversalCritAction = new ApplyTraversalCritAction();
		final Action initWorkflowAction = new InitWorkflowAction();
		final Action drawGraphAction = new DrawGraphAction();
		
		
		final JButton btnAutoSetup = add(autoSetupProjectAction);
		final JButton btnInitW = add(initWorkflowAction);
		final JButton btnApplyTraversalCrit = add(applyTraversalCritAction);
		final JButton btnApplyGroupingCrit = add(applyGroupingCritAction);
		final JButton btnDrawGraph = add(drawGraphAction);
		
		final Action removeInactiveTasksAction = new RemoveInactiveTasksAction();
		final JButton btnRemoveInactiveTasks = add(removeInactiveTasksAction);
		btnRemoveInactiveTasks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		final Action validateGraphComponent=new ValidateGraphComponentAction();
		final JButton btnValidate = add(validateGraphComponent);
		btnValidate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				editor.getGraphComponent().validate();
				
			}
		});
		final Action refreshGraphComponent=new RefreshGraphComponentAction();
		final JButton btnRefresh = add(refreshGraphComponent);
		btnRefresh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.debug(editor.getGraphComponent().getGraph().hashCode());
				//if (getGraphUtil().getGraph() == null)
					getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				//EasyFlowGraph graph=workflow.getGraph();
				//setGraphUtil(workflow.getGraphUtil());
				logger.debug(getGraphUtil().getGraph().hashCode());
				logger.debug(editor.getGraphComponent().getGraph().hashCode());
				getGraphUtil().testSomething();
				editor.getGraphComponent().refresh();
				
			}
		});
		
		final Action anyGraphComponent=new AnyGraphComponentAction();
		final JButton btnAny = add(anyGraphComponent);
		btnAny.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				EasyFlowGraphUtil graph = (EasyFlowGraphUtil) editor.getGraphComponent().getGraph();
				Object parent = graph.getDefaultParent();
				graph.getModel().beginUpdate();
				try
				{
					Task t1 = CoreFactory.eINSTANCE.createTask();
					t1.setName("task1");
					Task t2 = CoreFactory.eINSTANCE.createTask();
					t2.setName("task2");
					//mxCell v1 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t1),20, 20, 80, 20);
					mxCell v1 = (mxCell) graph.insertVertexEasyFlow(parent, null, t1);

					v1.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
					//mxCell v2 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t2),280, 20, 80, 20);
					mxCell v2 = (mxCell) graph.insertVertexEasyFlow(parent, null, t2);
					v2.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
				}
				finally
				{
					graph.getModel().endUpdate();
				}
				// TODO Auto-generated method stub
				
				/*mxGraph graph = editor.getGraphComponent().getGraph();
				Object[] cells = graph.getAllEdges(
						new Object[]{resequencingProject.getActiveWorkflow().getFirstNode()});
				graph.removeCells(cells, true);*/
				//editor.getGraphComponent().getGraph().selectAll();
				//editor.getGraphComponent().getGraph().removeCells();

			}
		});

		
		//btnGenAbstractW.setEnabled(false);
		btnApplyGroupingCrit.setEnabled(false);
		btnApplyTraversalCrit.setEnabled(false);
		
		btnAutoSetup.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				resequencingProject.setGraphUtil(getGraphUtil());
				logger.debug(getGraphUtil().getGraph().hashCode());
				resequencingProject.setBasePath("/easyflow/sequencing/examples/");
				logger.debug(getGraphUtil().getGraph().hashCode());
				resequencingProject.autoSetup();
				Workflow workflow = resequencingProject.getActiveWorkflow();
				logger.debug(getGraphUtil().getGraph().hashCode());
				//
				logger.debug(getGraphUtil().getGraph().hashCode());
				resequencingProject.applyTraversalEvents();
				//setGraphUtil(workflow.getGraphUtil());
				//getGraphUtil().layoutGraph();
				//editor.getGraphComponent().validate();
				//setEditorGraph(editor);
				
			}
		});
		final Action applyNextTraversalCrit     = new ApplyNextTraversalCriterion();
		final JButton btnApplyNextTraversalCrit = add(applyNextTraversalCrit);
		
		btnInitW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				
				resequencingProject.setGraphUtil(getGraphUtil());
				
				//if (getGraphUtil().getGraph() == null)
					//getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				//EasyFlowGraph graph=workflow.getGraph();
				resequencingProject.setBasePath("/easyflow/sequencing/examples/");
				resequencingProject.autoSetup();
				logger.debug(resequencingProject.getActiveWorkflow().getFirstNode().hashCode());
				logger.debug(getGraphUtil().getDefaultRootCell().hashCode());
				btnApplyTraversalCrit.setEnabled(true);
				getGraphUtil().layoutGraph();
				//Workflow workflow = resequencingProject.getActiveWorkflow();
				//setGraphUtil(workflow.getGraphUtil());
				//setMetaData((DefaultMetaData) workflow.getMetaData());
				
				//editor.getGraphComponent().validate();

				//setEditorGraph(editor);
				logger.debug(getGraphUtil().getDefaultRootCell().hashCode()+" "+resequencingProject.getActiveWorkflow().getFirstNode().hashCode());
				objects.put("traversalEvents", getGraphUtil().getTraversalEvents((mxICell) getGraphUtil().getDefaultRootCell(), true));
				logger.debug(objects.get("traversalEvents"));
				logger.debug("btnInitW "+editor.getGraphComponent().getGraph().getClass().getName()+" "+editor.getGraphComponent().getGraph());
				objects.put("state", State.NONE);
				objects.put("event", Event.NONE);
				/*
				graph.addTraversalEventsToQueue(
						(mxCell) resequencingProject.getActiveWorkflow().getFirstNode(), "grouping");
				objects.put("grouping", graph.getUnprocessedTraversalEvents((mxCell)resequencingProject.getActiveWorkflow().getFirstNode()));
				logger.debug(objects.get("grouping"));
				editor.getGraphComponent().validate();
				setEditorGraph(editor);
*/
				/*
				resequencingProject.clearWorkflows();
				resequencingProject.setFileName(resequencingProject.createPath("main.json"));
				resequencingProject.readProjectJson();
				resequencingProject.initProject();
				resequencingProject.applyMetaData();
				//resequencingProject.applyTraversalEvents();
				btnApplyTraversalCrit.setEnabled(true);
				btnApplyGroupingCrit.setEnabled(true);
				btnDrawGraph.setEnabled(true);
				btnApplyNextTraversalCrit.setEnabled(true);
				objects.put("graphCells", resequencingProject.getActiveWorkflow().getGraphCells());
				objects.put("traversalEvents", resequencingProject.getActiveWorkflow().getGraph().
						getNonoverlappingTraversalEvents((mxCell)resequencingProject.getActiveWorkflow().getFirstNode()));
				logger.debug(resequencingProject.getActiveWorkflow().getTasks().size()+" "+
						resequencingProject.getActiveWorkflow().getGraphCells().size());
				counter=0;

			*/
			}
		});
		
		
		btnApplyNextTraversalCrit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				traversalEvent = getGraphUtil().getNextTraversalEvent();
				if (traversalEvent != null)
					resequencingProject.getActiveWorkflow().applyTraversalEvent(traversalEvent);
				
				if (false)
				{
				
				objects.put("event", Event.NEXT);
				
				if(traversalEvent == null || objects.get("state").equals(State.NONE))
				{
					traversalEvent = getNextTraversalEvent();
					if (objects.get("state").equals(State.NONE))
						objects.put("state", State.REMOVE_SUBGRAPH);
				}
				if (traversalEvent != null)
				{
					
					if (objects.get("event").equals(Event.NEXT) && 
						objects.get("state").equals(State.REMOVE_SUBGRAPH))
					{
						subGraphRoot = getGraphUtil().computeSubgraph(traversalEvent, true);
						objects.put("state", State.COMPUTE_SUBGRAPH);
					}
					else if (objects.get("event").equals(Event.NEXT) && 
						objects.get("state").equals(State.COMPUTE_SUBGRAPH))
					{
						for (GroupingInstance groupingInstance :
							((DefaultMetaData) getMetaData()).getGroupingInstances().get(traversalEvent.getTraversalCriterion().getId()).getInstances())
						{
							//String instanceStr = groupingInstance.getName();
							logger.debug("applyTraversalEvents(): applying metadata "+groupingInstance.getName()+" with features="+
									groupingInstance.getFeatures().keySet()+" for criterion="+traversalEvent.getTraversalCriterion().getId()
									+" "+subGraphRoot);
							
							logger.trace("applyTraversalEvents(): graphUtil: "+getGraphUtil().getTasks().keySet().size()+" "+getGraphUtil().getTasks().hashCode()+" "+getGraphUtil().getTasks().keySet());
							//logger.trace("applyTraversalEvents(): XMLUtil:"+((EMap<String,Task>)XMLUtil.container.get("tasks")).size()+" "+((EMap<String,Task>)XMLUtil.container.get("tasks")).keySet());
							
							mxICell copyRoot = getGraphUtil().applyTraversalEventCopyGraph(subGraphRoot, 
									traversalEvent.getTraversalCriterion().getId(), 
									groupingInstance);
	
							logger.trace("applyTraversalEvents(): graphUtil: "+getGraphUtil().getTasks().keySet().size()+" "+getGraphUtil().getTasks().keySet());
							//logger.trace("applyTraversalEvents(): XMLUtil:"+((EMap<String,Task>)XMLUtil.container.get("tasks")).size()+" "+((EMap<String,Task>)XMLUtil.container.get("tasks")).keySet());
							getGraphUtil().applyTraversalEvent(copyRoot, traversalEvent, 
									traversalEvent.getTraversalCriterion().getId(),
									groupingInstance.getName());
						}
						objects.put("state", State.APPLY_TRAVERSAL_EVENT);
						traversalEvent = null;
					}
					else if (objects.get("event").equals(Event.NEXT) && 
						objects.get("state").equals(State.APPLY_TRAVERSAL_EVENT))
					{
						if (getGraphUtil().getNewTraversalEvents().isEmpty())
						{
						// clearup and reset
						for (mxICell subGraphRoot1 : getGraphUtil().getCurrentSubGraphs())
							getGraphUtil().removeSubGraph(
									subGraphRoot1, 
									traversalEvent.getTraversalCriterion().getId());
						getGraphUtil().resetFlags();
						getGraphUtil().getCurrentSubGraphs().clear();
						}
						objects.put("state", State.REMOVE_SUBGRAPH);
						
					}
				}
				}
			}
		});
		
		btnApplyTraversalCrit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				resequencingProject.applyTraversalEvents();
			}
		});
		
		btnDrawGraph.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getGraphUtil().layoutGraph();
				/*
				mxCodecRegistry.addPackage("easyflow.impl"); 
				mxCodecRegistry.register(new mxObjectCodec(new easyflow.impl.TaskImpl()));
				final mxGraph graph=editor.getGraphComponent().getGraph();
				
				logger.debug(easyflow);
				editor.getGraphComponent().setGraph(
						workflowUtil.convertDagToGraphXML(easyflow.getDag(), 
								graph));
				Rectangle bounds=editor.getGraphComponent().getBounds();
				Point point=new Point();
				point.setLocation(-bounds.getX() - (bounds.getWidth() - getWidth()) / 2,
					      -bounds.getY() - (bounds.getHeight() - getHeight()) / 2);
				logger.debug(point);
				//point.setLocation(380, 380);
				
				
				logger.debug("graphcomp viewport border: "+editor.getGraphComponent().getViewportBorderBounds());
				logger.debug("graphcomp bounds: "+editor.getGraphComponent().getBounds());
				logger.debug("graphcomp visible rect:"+editor.getGraphComponent().getVisibleRect());
				logger.debug("graphcomp graphcontrol align x "+editor.getGraphComponent().getGraphControl().getAlignmentX());
				logger.debug("graphcomp graphcontrol align y "+editor.getGraphComponent().getGraphControl().getAlignmentY());
				//graph.getView().setScale(1);
				//editor.getGraphComponent().getGraphControl().setTranslate(point);
				//editor.getGraphComponent().setCenterPage(true);
				//editor.graphLayout("verticalHierarchical", true);

				//.getView().scaleAndTranslate(1.3, 390,500);
				
				
					//easyflowTpl.generateGraphFromTemplateFile();
					//workflow.setGraph();
				//mxOrganicLayout layout = new mxOrganicLayout(graph);
				logger.debug(graph.getGraphBounds());
				mxHierarchicalLayout layout=new mxHierarchicalLayout(graph);
				layout.setFixRoots(false);
				//mxCompactTreeLayout layout = new mxCompactTreeLayout(graph);
				layout.setVertexLocation(graph.getDefaultParent(), 0.5, 0.5);
				layout.execute(graph.getDefaultParent());
				logger.debug(layout.getOrientation()+" "+layout.getParentBorder()+" "+graph.getGraphBounds());
				logger.debug(graph.getCellGeometry(graph.getDefaultParent())+" "+layout.isFixRoots());
				logger.debug(editor.CENTER_ALIGNMENT);
				//layout.setParentBorder(1);
				//mxGraphComponent graphComponent = new mxGraphComponent(layout.getGraph());
				*/
			}
		});
		
	}
	private Util getGraphUtil()
	{
		return graphUtil;
	}
	private void setGraphUtil(Util util)
	{
		graphUtil = util;
	}
	
	private DefaultMetaData getMetaData()
	{
		return metaData;
	}
	
	private void setMetaData(DefaultMetaData newMetaData)
	{
		metaData = newMetaData;
	}
	
	private TraversalEvent getNextTraversalEvent()
	{
		
		return getGraphUtil().getNextTraversalEvent();
	}
		
	private class DrawGraphAction extends AbstractAction {

		public DrawGraphAction() {
			putValue(NAME, "DrawGraph");
			putValue(SHORT_DESCRIPTION, "Draw Graph.");
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	private class AutoSetupAction extends AbstractAction {
		public AutoSetupAction() {
			putValue(NAME, "AutoSetup");
			putValue(SHORT_DESCRIPTION, "Automatically setup default project.");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

	private class InitWorkflowAction extends AbstractAction {
		public InitWorkflowAction() {
			putValue(NAME, "initW");
			putValue(SHORT_DESCRIPTION, "Initialize workflow from template file");
			
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("GenAbstW");
		}
		
	}
	private class ApplyGroupingCritAction extends AbstractAction {
		public ApplyGroupingCritAction() {
			putValue(NAME, "groupCrit");
			putValue(SHORT_DESCRIPTION, "apply metadata (i.e. sample, readgroup, group, ...)");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("ApplyGroupingCrit");
		}
	}
	private class ApplyTraversalCritAction extends AbstractAction {
		public ApplyTraversalCritAction() {
			putValue(NAME, "travCrit");
			putValue(SHORT_DESCRIPTION, "apply any defined splitting criterion");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("ApplySplitCrit");

		}
	}
	private class ValidateGraphComponentAction extends AbstractAction {
		public ValidateGraphComponentAction() {
			putValue(NAME, "validate");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class RefreshGraphComponentAction extends AbstractAction {
		public RefreshGraphComponentAction() {
			putValue(NAME, "refresh");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class AnyGraphComponentAction extends AbstractAction {
		public AnyGraphComponentAction() {
			putValue(NAME, "any");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class ApplyNextTraversalEventAction extends AbstractAction {
		public ApplyNextTraversalEventAction() {
			putValue(NAME, "next");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	private class ApplyNextTraversalCriterion extends AbstractAction {
		public ApplyNextTraversalCriterion() {
			putValue(NAME, "next");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class RemoveInactiveTasksAction extends AbstractAction {
		public RemoveInactiveTasksAction() {
			putValue(NAME, "removeInactiveCells");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private ResourceSet resourceSet;

	/**
	  * Create the resource manager.
	  */
	 private void register() {
	  
	  resourceSet = createResourceSet();

	  // register factories
	  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

	  // register packages
	  CorePackage.eINSTANCE.eClass();
	  //ChangePackage.eINSTANCE.eClass(); // only if using EMF change feature
	 }

	 /**
	  * Create the resource set.
	  */
	 private ResourceSet createResourceSet() {
	  ResourceSet rs = new ResourceSetImpl();
	  // Register the default resource factory -- only needed for stand-alone
	  rs.getResourceFactoryRegistry()
	    .getExtensionToFactoryMap()
	    .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
	      new XMIResourceFactoryImpl());
	  //rs.setURIConverter(new URIConverter()); 

	  return rs;
	 }
}
