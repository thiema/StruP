package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JWindow;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.util.mxRectangle;

import easyflow.core.CoreFactory;
import easyflow.core.CorePackage;
import easyflow.core.DefaultMetaData;

import easyflow.core.Task;
import easyflow.core.TraversalEvent;
import easyflow.core.Workflow;
import easyflow.custom.util.XMLUtil;
import easyflow.graph.jgraphx.Util;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.core.DefaultMetaData;
import easyflow.example.ExampleFactory;
import easyflow.example.Examples;


public class EasyFlowToolBar extends JToolBar
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592403145874164000L;
	
	private static final DefaultProject defaultProject = UiFactory.eINSTANCE.createDefaultProject();
	private static final Logger         logger         = Logger.getLogger(EasyFlowToolBar.class);
	private              Util           graphUtil      = JgraphxFactory.eINSTANCE.createUtil();
	private final   Map<String, Object> objects        = new HashMap<String, Object>();
	private         DefaultMetaData     metaData;

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

		final Action calcAllProjectAction      = new CalcAllProjectAction();
		//final Action applyGroupingCritAction   = new ApplyGroupingCritAction();
		final Action configureProjectAction    = new ConfigureProjectAction();
		final Action checkToolsAction          = new CheckToolsAction();
		final Action applyTraversalCritAction  = new ApplyTraversalCritAction();
		final Action genAbstractWorkflowAction = new GenAbstractWorkflowAction();
		final Action deleteGraphAction         = new DeleteGraphAction();
		final Action validateGraphComponent    = new ValidateGraphComponentAction();
		final Action anyGraphComponent         = new AnyGraphComponentAction();
		final Action applyNextTraversalEvent    = new ApplyNextTraversalEventAction();


		final JButton btnConfigureProject      = add(configureProjectAction);
		final JButton btnCalcAll               = add(calcAllProjectAction);
		final JButton btnGenAbstractWorkflow   = add(genAbstractWorkflowAction);
		final JButton btnApplyTraversalCrit    = add(applyTraversalCritAction);
		//final JButton btnApplyGroupingCrit     = add(applyGroupingCritAction);
		final JButton btnDeleteGraph           = add(deleteGraphAction);
		final JButton btnCheckTools            = add(checkToolsAction);
		final JButton btnValidate              = add(validateGraphComponent);
		final JButton btnAny                   = add(anyGraphComponent);
		final JButton btnApplyNextTraversalEvent= add(applyNextTraversalEvent);
		
		//btnGenAbstractW.setEnabled(false);
		//btnApplyGroupingCrit.setEnabled(false);
		btnApplyTraversalCrit.setEnabled(false);
		
		btnConfigureProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ConfigureProjectDialog(editor, defaultProject);
			}
		});
		
		btnCalcAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				defaultProject.setGraphUtil(getGraphUtil());
				defaultProject.setBasePath((String) objects.get("basePath"));
				defaultProject.autoSetup();
				Workflow workflow = defaultProject.getActiveWorkflow();
				defaultProject.applyTraversalEvents();
			}
		});
		btnGenAbstractWorkflow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
				defaultProject.setGraphUtil(getGraphUtil());
				//defaultProject.setBasePath("/easyflow/sequencing/examples/");
				defaultProject.setBasePath((String) objects.get("basePath"));
				defaultProject.autoSetup();
				btnCheckTools.setEnabled(true);
				btnApplyTraversalCrit.setEnabled(true);
				getGraphUtil().layoutGraph();
				objects.put("traversalEvents", getGraphUtil().getTraversalEvents((mxICell) getGraphUtil().getDefaultRootCell(), true));
				objects.put("state", State.NONE);
				objects.put("event", Event.NONE);
			}
		});

		btnCheckTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnApplyTraversalCrit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				defaultProject.applyTraversalEvents();
			}
		});		

		btnDeleteGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnValidate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				editor.getGraphComponent().validate();				
			}
		});
		
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
		
		
		
		btnApplyNextTraversalEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				traversalEvent = getGraphUtil().getNextTraversalEvent();
				if (traversalEvent != null)
					defaultProject.getActiveWorkflow().applyTraversalEvent(traversalEvent);
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
	
	private class ConfigureProjectAction extends AbstractAction {
		
		public ConfigureProjectAction() {
			putValue(NAME, "Config");
			putValue(SHORT_DESCRIPTION, "Configure Project.");
		}
		@Override
		public void actionPerformed(ActionEvent e) {}
	}
	
	private class CheckToolsAction extends AbstractAction {
		public CheckToolsAction() {
			putValue(NAME, "CheckTools");
			putValue(SHORT_DESCRIPTION, "Check Tools definitions.");	
		}
		@Override
		public void actionPerformed(ActionEvent e) {}
	}
	
	private class DeleteGraphAction extends AbstractAction {

		public DeleteGraphAction() {
			putValue(NAME, "DrawGraph");
			putValue(SHORT_DESCRIPTION, "Draw Graph.");
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {}
	}
	
	private class CalcAllProjectAction extends AbstractAction {
		public CalcAllProjectAction() {
			putValue(NAME, "CalcAll");
			putValue(SHORT_DESCRIPTION, "Perform whole analysis.");
		}
		public void actionPerformed(ActionEvent e) {}
	}

	private class GenAbstractWorkflowAction extends AbstractAction {
		public GenAbstractWorkflowAction() {
			putValue(NAME, "GenAbsW");
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
	
	//private class TestDialog 
	
	private class ConfigureProjectDialog extends JWindow implements ActionListener {
		
		JFileChooser fc               = new JFileChooser();
		JButton      selectFileButton = new JButton("Select File");
		JButton      closeButton      = new JButton("Close");
		JTextField   selectedFileText = new JTextField();
		JPanel       panel            = new JPanel(new GridLayout(0, 1));
		JPanel       sfPanel          = new JPanel(new GridLayout(0, 2));
		JDialog      dialog           = new JDialog();// nicht modal
		final ButtonGroup group       = new ButtonGroup();
		/**/
		
		public ConfigureProjectDialog(SchemaEditor editor, final DefaultProject defaultProject)
		{
			super();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        //fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        
	        selectFileButton.addActionListener(this);
	        closeButton.addActionListener(this);
	        sfPanel.add(selectFileButton);
	        sfPanel.add(closeButton);
	        panel.add(sfPanel);
			// add the radio buttons to select predefined configs
	        logger.debug(defaultProject.getExamples().getExamples());
			for (final String exampleName : defaultProject.getExamples().getExamples())
			{
				//popup.add(newContentPane);
				JRadioButton radioButton = new JRadioButton(exampleName);
				radioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						logger.debug("set filename to");
						defaultProject.setConfigFileName("");
					}
				});
				radioButton.setActionCommand(exampleName);
				radioButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						selectFileButton.setEnabled(false);
						selectedFileText.setEnabled(false);
						selectedFileText.setText(defaultProject.getExamples().getConfigByName(exampleName).toString());
					}
				});
				//radioButton.setSelected(true);
				//Group the radio buttons.
				group.add(radioButton);
				panel.add(radioButton);
			}
			JRadioButton radioButton = new JRadioButton("user input");
			radioButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					selectFileButton.setEnabled(true);
					selectedFileText.setEnabled(true);
					defaultProject.setFromJar(false);
				}
			});

			radioButton.setActionCommand("userInput");
			radioButton.setSelected(true);
			radioButton.addActionListener(this);
			//Group the radio buttons.
			group.add(radioButton);
			panel.add(radioButton);
			
			panel.add(selectedFileText);
			dialog.setBounds(editor.getGraphComponent().getX(), 
	        		editor.getGraphComponent().getY(), 300, 150);
			dialog.add(panel);
			dialog.setModal(true);
			dialog.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			logger.debug("action performed");
            if (e.getSource() == selectFileButton) {
                int returnVal = fc.showOpenDialog(panel);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would open the file.
                    logger.debug("Opening: " + file.getName() + ".");
                    selectedFileText.setText(file.getName());
                } else {
                	logger.debug("Open command cancelled by user.");
                }
            }
            else if (e.getSource() == closeButton)
            {
            	logger.debug("close action");
            	//dialog.dispose();
            	dialog.setVisible(false);
            }
            else
            	logger.debug("no action defined.");
            
            
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
