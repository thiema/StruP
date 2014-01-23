package easyflow.custom.jgraphx.editor;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JWindow;


import javax.swing.JPanel;

import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import org.apache.log4j.Logger;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;


import com.mxgraph.model.mxICell;

import easyflow.core.CorePackage;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.ComposeWorkflowPanel;
import easyflow.custom.util.GlobalVar;
import easyflow.custom.util.URIUtil;
import easyflow.graph.jgraphx.Util;
import easyflow.traversal.TraversalEvent;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiFactory;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.metadata.DefaultMetaData;

import easyflow.example.ExampleFactory;
import easyflow.example.Examples;


public class EasyFlowToolBar extends JToolBar
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592403145874164000L;
	
	private static final boolean		isFromJar	   = false;
	private static final String         repositoryJar  = "/easyflow/custom/examples";
	private static final String         repositoryFS   = "/home/heinz/git/easyflow/easyflow/src/easyflow/custom/examples";
	private static       DefaultProject defaultProject = null;
	private static final Logger         logger         = Logger.getLogger(EasyFlowToolBar.class);
	private static       Examples       examples       = null;
	private              Util           graphUtil      = JgraphxFactory.eINSTANCE.createUtil();
	private final   Map<String, Object> objects        = new HashMap<String, Object>();
	private         DefaultMetaData     metaData;
	private  ComposeWorkflowPanel composeWorkflowPanel = null;

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
	public EasyFlowToolBar(final EasyFlowGraphEditor editor, int orientation)
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
		final Action drawGraphAction         = new DrawGraphAction();
		final Action validateGraphComponent    = new ValidateGraphComponentAction();
		final Action anyGraphComponent         = new AnyGraphComponentAction();
		final Action applyNextTraversalEvent   = new ApplyNextTraversalEventAction();
		final Action resolveUtilityTasksAction = new ResolveUtilityTaskAction();


		final JButton btnConfigureProject      = add(configureProjectAction);
		final JButton btnCalcAll               = add(calcAllProjectAction);
		final JButton btnGenAbstractWorkflow   = add(genAbstractWorkflowAction);
		final JButton btnApplyTraversalCrit    = add(applyTraversalCritAction);
		final JButton btnResolveUtilityTask    = add(resolveUtilityTasksAction);
	  //final JButton btnApplyGroupingCrit     = add(applyGroupingCritAction);
		final JButton btnDeleteGraph           = add(deleteGraphAction);
		final JButton btnDrawGraph             = add(drawGraphAction);
		final JButton btnCheckTools            = add(checkToolsAction);
		final JButton btnValidate              = add(validateGraphComponent);
		final JButton btnAny                   = add(anyGraphComponent);
		final JButton btnApplyNextTraversalEvent= add(applyNextTraversalEvent);
		
		
		//btnGenAbstractW.setEnabled(false);
		//btnApplyGroupingCrit.setEnabled(false);
		btnApplyTraversalCrit.setEnabled(false);
		btnResolveUtilityTask.setEnabled(false);
		
		// init with a defaultproject
		
		GlobalVar.setDefaultProject(getExamples().getExamples().get("sequencing"));
		setDefaultProject(GlobalVar.getDefaultProject());
		
		GlobalVar.getDefaultProject().setFromJar(isFromJar);
		getGraphUtil().setGraph((EasyFlowGraph) editor.getGraphComponent().getGraph());
		//GlobalVar.setEditor(editor);
		GlobalVar.setUtil(getGraphUtil());
		GlobalVar.getDefaultProject().setGraphUtil(getGraphUtil());
		getDefaultProject().init();
		editor.getComposeWorkflowPanel().setDefaultProject(GlobalVar.getDefaultProject());
		setComposeWorkflowPanel(editor.getComposeWorkflowPanel());
		GlobalVar.setGuiMode(true);
		GlobalVar.setComposeWorkflowPanel(getComposeWorkflowPanel());
		
		if (GlobalVar.getDefaultProject()!=null)
		{
			getComposeWorkflowPanel().getRunButton().setEnabled(true);
			getComposeWorkflowPanel().getNextButton().setEnabled(true);
		}
		btnConfigureProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ConfigureProjectDialog(editor);
			}
		});
		
		btnResolveUtilityTask.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (defaultProject.resolveUtilityTasks())
					{
						
					}
				} catch (DataLinkNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DataPortNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ToolNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UtilityTaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnCalcAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					logger.debug(defaultProject.getActiveWorkflow());
					if (defaultProject.generateAbstractGraph()
							&& defaultProject.resolveTraversalCriteria()
							&& defaultProject.applyGroupingCriteria())
					{
						btnResolveUtilityTask.setEnabled(true);
					}
				} catch (CellNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (TaskNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (GroupingCriterionInstanceNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGenAbstractWorkflow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				if (defaultProject.generateAbstractGraph())
				{
					btnCheckTools.setEnabled(true);
					btnApplyTraversalCrit.setEnabled(true);
				}
				//objects.put("traversalEvents", getGraphUtil().getTraversalEvents((mxICell) getGraphUtil().getDefaultRootCell(), true));
				//objects.put("state", State.NONE);
				//objects.put("event", Event.NONE);
			}
		});

		btnCheckTools.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnApplyTraversalCrit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					if (defaultProject.applyGroupingCriteria())
						btnResolveUtilityTask.setEnabled(true);
				} catch (CellNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (GroupingCriterionInstanceNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});		

		btnDeleteGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnDrawGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getGraphUtil().layoutGraph();
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
				
				EasyFlowGraph graph = (EasyFlowGraph) editor.getGraphComponent().getGraph();
				Object parent = graph.getDefaultParent();
				graph.getModel().beginUpdate();
				try
				{
					/*Task t1 = CoreFactory.eINSTANCE.createTask();
					t1.setName("task1");
					Task t2 = CoreFactory.eINSTANCE.createTask();
					t2.setName("task2");
					//mxCell v1 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t1),20, 20, 80, 20);
					mxCell v1 = (mxCell) graph.insertVertexEasyFlow(parent, null, t1);

					v1.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
					//mxCell v2 = (mxCell) graph.insertVertex(parent, null, XMLUtil.getElement(t2),280, 20, 80, 20);
					mxCell v2 = (mxCell) graph.insertVertexEasyFlow(parent, null, t2);
					v2.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
					*/
					//mxGraph graph = editor.getGraphComponent().getGraph();
					Object[] cells = graph.getAllEdges(
							new Object[]{defaultProject.getActiveWorkflow().getFirstNode()});
					graph.removeCells(cells, true);
					//editor.getGraphComponent().getGraph().selectAll();
					//editor.getGraphComponent().getGraph().removeCells();

				
				}
				finally
				{
					graph.getModel().endUpdate();
				}
				

			}
		});
		
		
		
		btnApplyNextTraversalEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				try {
					traversalEvent = getGraphUtil().getNextTraversalEvent();
					if (traversalEvent != null)
						getDefaultProject().getActiveWorkflow().applyTraversalEvent(traversalEvent);
				} catch (CellNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TaskNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (GroupingCriterionInstanceNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public static DefaultProject getDefaultProject() {return defaultProject;}
	public static void setDefaultProject(DefaultProject newDefaultProject) {defaultProject = newDefaultProject;}
	private Examples getExamples()
	{
		if (examples == null)
		{
			examples = ExampleFactory.eINSTANCE.createExamples();
			if (isFromJar)
				examples.setLocator(repositoryJar);
			else
				examples.setLocator(repositoryFS);
				
			examples.readRepository();
		}
		return examples;
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
	
	private TraversalEvent getNextTraversalEvent() throws CellNotFoundException, TaskNotFoundException
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
	
	private class DrawGraphAction extends AbstractAction {
		public DrawGraphAction() {
			putValue(NAME, "DrawGraph");
			putValue(SHORT_DESCRIPTION, "Draw Graph.");
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {}
	}
	
	private class DeleteGraphAction extends AbstractAction {

		public DeleteGraphAction() {
			putValue(NAME, "DeleteGraph");
			putValue(SHORT_DESCRIPTION, "Delete Graph.");
			
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
	
	private class ResolveUtilityTaskAction extends AbstractAction
	{
		public ResolveUtilityTaskAction()
		{
			putValue(NAME, "util");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	private class ConfigureProjectDialog extends JWindow implements ActionListener {
		
		JFileChooser fc               = new JFileChooser();
		JButton      selectFileButton = new JButton("Select Path");
		JButton      validateButton   = new JButton("Validate");
		JButton      closeButton      = new JButton("Close");
		JTextField   uriTextField     = new JTextField("https://bitbucket.org/thiema/easyflow/downloads/main.json");
		JTextField   selectedFileText = new JTextField("/home/heinz/git/easyflow/easyflow/src/easyflow/custom/examples/sequencing");
		JPanel       panel            = new JPanel(new GridLayout(0, 1));
		JPanel       sfPanel          = new JPanel(new GridLayout(0, 3));
		JDialog      dialog           = new JDialog();// nicht modal
		DefaultProject curProject     = null;
		DefaultProject userProject    = UiFactory.eINSTANCE.createDefaultProject();
		
		final ButtonGroup group       = new ButtonGroup();
		/**/
		
		public ConfigureProjectDialog(EasyFlowGraphEditor editor)
		{
			super();
			//fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        fc.setToolTipText("Either select the main configuration file in the json format or the directory where the file main.json is located.");
	        selectFileButton.addActionListener(this);
	        validateButton.addActionListener(this);
	        closeButton.addActionListener(this);
	        sfPanel.add(selectFileButton);
	        sfPanel.add(validateButton);
	        sfPanel.add(closeButton);
	        panel.add(sfPanel);
	        uriTextField.setEnabled(false);
	        userProject.setFromJar(false);    
	        
			// add the radio buttons to select predefined configs
	        
			for (final String exampleName : getExamples().getExamples().keySet())
			{
				//popup.add(newContentPane);
				JRadioButton radioButton = new JRadioButton(exampleName);
				radioButton.setActionCommand(exampleName);
				radioButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						selectFileButton.setEnabled(false);
						selectedFileText.setEnabled(false);
						uriTextField.setEnabled(false);
						//selectedFileText.setText(getExamples().getExamples().get(exampleName).getConfigSource().toString());
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
					uriTextField.setEnabled(false);
				}
			});

			radioButton.setActionCommand("userInputFile");
			radioButton.setSelected(true);
			radioButton.addActionListener(this);
			
			JRadioButton uriRadioButton = new JRadioButton("uri");
			uriRadioButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					uriTextField.setEnabled(true);
				}
			});
			uriRadioButton.setActionCommand("userInputURI");
			uriRadioButton.setSelected(true);
			uriRadioButton.addActionListener(this);

			//Group the radio buttons.
			group.add(radioButton);
			group.add(uriRadioButton);
			panel.add(radioButton);
			panel.add(uriRadioButton);
			
			panel.add(selectedFileText);
			panel.add(uriTextField);
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
                   	userProject.setConfigAndBasePath(file.getPath());
                } else {
                	logger.debug("Open command cancelled by user.");
                }
            }
            else if (e.getSource() == closeButton)
            {
            	logger.debug("close action");
            	if (setProject() && getDefaultProject().validate())
            	{
            		logger.debug("valid project found, set default. "+getDefaultProject().hashCode());
            		//setDefaultProject(curProject);
            	}
            	
            	//dialog.dispose();
            	dialog.setVisible(false);
            }
            else if (e.getSource() == validateButton)
            {
            	setProject();
            	logger.debug(curProject.getBaseURI()+" "+curProject.getConfigSource());
            	if (curProject != null && curProject.validate())
            		JOptionPane.showMessageDialog(this, "Project settings are valid !");
            	else
            		JOptionPane.showMessageDialog(this, "Unvalid project settings found !",
            				"Inane error", JOptionPane.ERROR_MESSAGE);
            }
            else
            	logger.debug("no action defined.");
            
            
		}
		private boolean setProject() {
			boolean rc = true;
			if (group.getSelection().getActionCommand().equals("userInputFile"))
        	{
        		curProject = userProject;
        		curProject.setConfigAndBasePath(selectedFileText.getText());
        	}
        	else if (group.getSelection().getActionCommand().equals("userInputURI"))
        	{
        		curProject = userProject;
        		try {
					curProject.setConfigSource(
							URIUtil.createURI(uriTextField.getText(), null));
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        	else if (getExamples().getExamples().containsKey(group.getSelection().getActionCommand()))
        		curProject = getExamples().getExamples().get(group.getSelection().getActionCommand());
        	else
        		rc = false;
			if (rc)
				setDefaultProject(curProject);
			return rc;
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

	public ComposeWorkflowPanel getComposeWorkflowPanel() {
		return composeWorkflowPanel;
	}

	public void setComposeWorkflowPanel(ComposeWorkflowPanel composeWorkflowPanel) {
		this.composeWorkflowPanel = composeWorkflowPanel;
	}
}
