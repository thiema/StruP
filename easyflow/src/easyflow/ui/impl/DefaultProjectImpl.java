/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui.impl;

import easyflow.EasyflowFactory;
import easyflow.EasyflowPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.mxgraph.model.mxCell;

import easyflow.core.CoreFactory;
import easyflow.core.DefaultMetaData;
import easyflow.core.EasyflowTemplate;
import easyflow.core.IMetaData;
import easyflow.core.Workflow;
import easyflow.graph.jgraphx.JgraphxFactory;
import easyflow.sequencing.MetaData;
import easyflow.sequencing.SequencingFactory;
import easyflow.ui.DefaultProject;
import easyflow.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link easyflow.ui.impl.DefaultProjectImpl#getLogger <em>Logger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultProjectImpl extends EObjectImpl implements DefaultProject {
	/**
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflows;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<IMetaData> metaData;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated not
	 * @ordered
	 */
	//protected static final Logger LOGGER_EDEFAULT = (Logger)EasyflowFactory.eINSTANCE.createFromString(EasyflowPackage.eINSTANCE.getLogger(), "");
	protected static final Logger LOGGER_EDEFAULT = Logger.getLogger(DefaultProject.class);

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.DEFAULT_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectResolvingEList<Workflow>(Workflow.class, this, UiPackage.DEFAULT_PROJECT__WORKFLOWS);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IMetaData> getMetaData() {
		if (metaData == null) {
			metaData = new EObjectResolvingEList<IMetaData>(IMetaData.class, this, UiPackage.DEFAULT_PROJECT__META_DATA);
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DEFAULT_PROJECT__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readProjectJson() {
		
		JSONObject jsonObject=null;
		try {
			InputStream is=null;
			logger.debug(getFileName());
			is = new FileInputStream(getFileName());
			//logger.debug(IOUtils.toString(is)+" "+is+" "+getFileName());
			
			//jsonObject = (JSONObject) JSONSerializer.toJSON("{\"hello\": \"world\"}");
			//jsonObject = (JSONObject) JSONSerializer.toJSON(IOUtils.toString(is));
			jsonObject = JSONObject.fromObject(IOUtils.toString(is));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONObject projectCfg=jsonObject.getJSONObject("project");
		//logger.debug(jsonObject.entrySet());
		logger.debug(projectCfg.get("workflowTemplateFile")+" "+getFileName());
		
		Workflow workflow=CoreFactory.eINSTANCE.createWorkflow();
		workflow.setGraphUtil(JgraphxFactory.eINSTANCE.createUtil());
		workflow.getGraphUtil().setGraph(workflow.getGraph());
		//DefaultWorkflowTemplate workflowTemplate=CoreFactory.eINSTANCE.createDefaultWorkflowTemplate();
		EasyflowTemplate workflowTemplate=CoreFactory.eINSTANCE.createEasyflowTemplate();
		workflowTemplate.setFileName(createPath(projectCfg.getString("workflowTemplateFile")));
		workflow.setWorkflowTemplate(workflowTemplate);
		logger.debug(workflow.getWorkflowTemplate()+" "+workflow.getLastTasks().size());
		//MetaData metaData=SequencingFactory.eINSTANCE.createMetaData();
		DefaultMetaData metaData=CoreFactory.eINSTANCE.createDefaultMetaData();		
		metaData.setFileName(createPath(projectCfg.getString("metadataFile")));

		workflow.setMetaData(metaData);
		workflow.getGraphUtil().setMetaData(metaData);
		JSONObject workflowCfg=jsonObject.getJSONObject("workflow");
		workflow.setMode(workflowCfg.getString("mode"));
		//JSONArray tmp=workflowCfg.getJSONArray("defaultGroupingCriteria");
		//logger.debug(tmp.);
		for (int i=0; i<workflowCfg.getJSONArray("defaultGroupingCriteria").size();i++)
			workflow.getDefaultGroupingCriteria().add(workflowCfg.getJSONArray("defaultGroupingCriteria").getString(i));
		
		logger.debug(projectCfg.keySet()+" "+workflow.getGraphUtil());
		
		for (Object key:projectCfg.keySet()) {
			workflow.getGenericAttributes().put((String) key, projectCfg.get(key));	
		}
		workflow.setToolsSchemaDefinition(URI.createURI(getBasePath()+(String) workflow.getGenericAttributes().get("toolsSchemaDefinitionFile")));
		workflow.setToolsDescription(URI.createURI(getBasePath()+(String) workflow.getGenericAttributes().get("toolsDescriptionFile")));

		getWorkflows().add(workflow);

		/*JSONArray cms = jsonObject.getJSONArray("project");
		for (Object o : cms) {
		   JSONObject cm = (JSONObject) o;
		   logger.debug(cm.get(0));
		}*/

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void initProject() {

		//removing all cells from mxGraph object
		getActiveWorkflow().getGraph().selectAll();
		Object[] cells=getActiveWorkflow().getGraph().removeCells();
		logger.debug(cells.length);
		//logger.debug(getActiveWorkflow().getTasks().size());
		//getWorkflows().get(0).getGraph().removeSelectionCells(cells);
		
		//read the workflow template and set processing mode
		
		getActiveWorkflow().generateGraphFromTemplate();
		
		
		//XMLUtil.testMxGraphXML(getWorkflows().get(0).getGraph(), getWorkflows().get(0).getFirstNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String createPath(String fileName) {
		
		logger.debug(getBasePath()+" "+fileName+" "+DefaultProject.class.toString());
		//logger.debug(new ResourceWrapper("same.txt", "/com/littletutorials/res"));
		//return (getBasePath()+fileName);
		//logger.debug(getBasePath()+fileName+" "+DefaultProject.class.getResource(getBasePath()+fileName));
		return DefaultProject.class.getResource(getBasePath()+fileName).getFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyMetaData() {
		getActiveWorkflow().readMetaData();
		//getWorkflows().get(0)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void applyTraversalEvents() {
		//getActiveWorkflow().getGraph().printGraph((mxCell) getActiveWorkflow().getFirstNode());
		getActiveWorkflow().applyTraversalEvents();
/*
		while (getActiveWorkflow().getGraph().addTraversalEventsToQueue(
				(mxCell) getActiveWorkflow().getFirstNode(), "grouping")) {

			getActiveWorkflow().applyTraversalEvents();
			//getWorkflows().get(0).applyTraversalEvents("no_grouping", null);
		}
		getActiveWorkflow().getGraph().printGraph((mxCell) getActiveWorkflow().getFirstNode());
		while (getActiveWorkflow().getGraph().addTraversalEventsToQueue(
				(mxCell) getActiveWorkflow().getFirstNode(), "traversal")) {
			getActiveWorkflow().applyTraversalEvents();
			//getWorkflows().get(0).applyTraversalEvents("no_grouping", null);
		}
	*/	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void clearWorkflows() {
		if (getWorkflows().size()>0) getWorkflows().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Workflow getActiveWorkflow() {
		return getWorkflows().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void autoSetup() {
		//remove workflows
		clearWorkflows();
		setFileName(createPath("main.json"));
		logger.debug(createPath("main.json"));
		readProjectJson();
		initProject();
		applyMetaData();
		getActiveWorkflow().resolveTraversalEvents();
		//applyTraversalEvents();
		getActiveWorkflow().readTaskImplementation();

	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				return getWorkflows();
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				return getMetaData();
			case UiPackage.DEFAULT_PROJECT__FILE_NAME:
				return getFileName();
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				return getBasePath();
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return getLogger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				getWorkflows().clear();
				getWorkflows().addAll((Collection<? extends Workflow>)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				getMetaData().clear();
				getMetaData().addAll((Collection<? extends IMetaData>)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				setBasePath((String)newValue);
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
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				getWorkflows().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				getMetaData().clear();
				return;
			case UiPackage.DEFAULT_PROJECT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
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
			case UiPackage.DEFAULT_PROJECT__WORKFLOWS:
				return workflows != null && !workflows.isEmpty();
			case UiPackage.DEFAULT_PROJECT__META_DATA:
				return metaData != null && !metaData.isEmpty();
			case UiPackage.DEFAULT_PROJECT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UiPackage.DEFAULT_PROJECT__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case UiPackage.DEFAULT_PROJECT__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", logger: ");
		result.append(logger);
		result.append(')');
		return result.toString();
	}

} //DefaultProjectImpl
