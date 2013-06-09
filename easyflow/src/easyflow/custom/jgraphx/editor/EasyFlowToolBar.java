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

import com.mxgraph.examples.swing.editor.BasicGraphEditor;
import com.mxgraph.io.mxCodecRegistry;
import com.mxgraph.io.mxObjectCodec;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraph.mxICellVisitor;

import easyflow.core.CoreFactory;
import easyflow.core.DefaultMetaData;
import easyflow.core.GroupingInstance;
import easyflow.core.Task;
import easyflow.core.TraversalEvent;
import easyflow.core.Workflow;
import easyflow.custom.util.XMLUtil;
import easyflow.graph.jgraphx.Util;
import easyflow.ui.ResequencingProject;
import easyflow.ui.UiFactory;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.core.DefaultMetaData;


public class EasyFlowToolBar extends JToolBar
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592403145874164000L;
	
	private static final ResequencingProject resequencingProject=UiFactory.eINSTANCE.createResequencingProject();
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
	public EasyFlowToolBar(final BasicGraphEditor editor, int orientation)
	{
		super(orientation);
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
				editor.getGraphComponent().refresh();
				
			}
		});
		
		final Action anyGraphComponent=new AnyGraphComponentAction();
		final JButton btnAny = add(anyGraphComponent);
		btnAny.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				editor.getGraphComponent().getGraph().selectAll();
				editor.getGraphComponent().getGraph().removeCells();

			}
		});

		
		//btnGenAbstractW.setEnabled(false);
		btnApplyGroupingCrit.setEnabled(false);
		btnApplyTraversalCrit.setEnabled(false);
		
		btnAutoSetup.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				resequencingProject.setBasePath("/easyflow/sequencing/examples/");

				resequencingProject.autoSetup();
				resequencingProject.applyTraversalEvents();
				editor.getGraphComponent().validate();
				setEditorGraph(editor);
				
			}
		});
		final Action applyNextTraversalCrit =new ApplyNextTraversalCriterion();
		final JButton btnApplyNextTraversalCrit =add(applyNextTraversalCrit);
		
		btnInitW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				resequencingProject.setBasePath("/easyflow/sequencing/examples/");
				resequencingProject.autoSetup();
				btnApplyTraversalCrit.setEnabled(true);
				Workflow workflow = resequencingProject.getActiveWorkflow();
				EasyFlowGraph graph=workflow.getGraph();
				setGraphUtil(workflow.getGraphUtil());
				setMetaData((DefaultMetaData) workflow.getMetaData());
				
				objects.put("traversalEvents", getGraphUtil().getTraversalEvents((mxICell) workflow.getFirstNode(), true));
				logger.debug(objects.get("traversalEvents"));
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
						// remove deprecated cells (from both: graph and graph/cell map)
						getGraphUtil().removeSubGraph(subGraphRoot, traversalEvent.getTraversalCriterion().getId());
						objects.put("state", State.REMOVE_SUBGRAPH);
						
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
				setEditorGraph(editor);
				
				editor.getGraphComponent().validate();
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
		EList traversalEvents = (EList<TraversalEvent>) objects.get("traversalEvents");
		EList newTraversalEvents = null;
		logger.debug(traversalEvents.size());
		if (objects.containsKey("newTraversalEvents"))
			newTraversalEvents = (EList<TraversalEvent>) objects.get("newTraversalEvents");
		
		if (newTraversalEvents != null && !newTraversalEvents.isEmpty())
		{
			logger.debug(newTraversalEvents.size());
			//TraversalEvent traversalEvent = (TraversalEvent) newTraversalEvents.get(0);
			return (TraversalEvent) newTraversalEvents.remove(0);
		} 
		else if (!traversalEvents.isEmpty())
		{
			TraversalEvent traversalEvent = (TraversalEvent) traversalEvents.remove(0);;
			
			objects.put("newTraversalEvents", 
					getGraphUtil().getNewTraversalEvents(
							traversalEvent, getGraphUtil().getDefaultRootCell()));
			logger.debug(objects.get("newTraversalEvents"));
			return getNextTraversalEvent();
		}
		return null;
	}
	
	private void setEditorGraph(BasicGraphEditor editor) {
		mxCodecRegistry.addPackage("easyflow"); 
		mxCodecRegistry.register(new mxObjectCodec(CoreFactory.eINSTANCE.createTask()));
		
		editor.getGraphComponent().setGraph(resequencingProject.
				getWorkflows().get(0).getGraph());
		
		final mxGraph graph=editor.getGraphComponent().getGraph();
		graph.getModel().beginUpdate();
        try {
        	//Hierarchical Layout
        	mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
        	layout.setIntraCellSpacing(10);
        	//layout.setOrientation(SwingConstants.NORTH);
        	layout.setFineTuning(true);
        	layout.execute(graph.getDefaultParent());
         } finally {
                 graph.getModel().endUpdate();
         }

		//mxHierarchicalLayout layout=new mxHierarchicalLayout(graph);
		//layout.execute(graph.getDefaultParent());
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
}
