/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.ui;

import easyflow.core.Workflow;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.EasyFlowOverallWorker;
import java.io.FileNotFoundException;
import java.net.URI;
import javax.xml.validation.Schema;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see easyflow.ui.UiPackage#getIProject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProject extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model exceptions="easyflow.FileNotFoundException" sourceDataType="easyflow.URI"
	 * @generated
	 */
	void readProjectJson(URI source) throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void applyMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearWorkflows();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Workflow getActiveWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean readConfiguration() throws FileNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setConfigAndBasePath(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateWorklowForExecutionSystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model workerDataType="easyflow.EasyFlowOverallWorker"
	 * @generated
	 */
	void setWorker(EasyFlowOverallWorker worker);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	int runNextWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	int runPrevWorkflowStep() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasNextWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getWorkflowStepLabelFor(String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getWorkflowStepDescFor(String step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getTotalNumberOfWorkflowSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNumberOfCurrentWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getNextWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCurWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean resetWorkflowStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolveTraversalCriteria() throws CellNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean resolveToolDependencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolveUtilityTasks() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.TaskNotFoundException"
	 * @generated
	 */
	boolean resolvePreprocessingTasks() throws ToolNotFoundException, UtilityTaskNotFoundException, DataLinkNotFoundException, TaskNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.DataPortNotFoundException easyflow.ToolNotFoundException easyflow.UtilityTaskNotFoundException easyflow.TaskNotFoundException easyflow.CellNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean runEntireWorkflow() throws DataLinkNotFoundException, DataPortNotFoundException, ToolNotFoundException, UtilityTaskNotFoundException, TaskNotFoundException, CellNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateAbstractGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean applyGroupingCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.CellNotFoundException easyflow.TaskNotFoundException easyflow.GroupingCriterionInstanceNotFoundException"
	 * @generated
	 */
	boolean applyParameterCriteria() throws CellNotFoundException, TaskNotFoundException, GroupingCriterionInstanceNotFoundException;

} // IProject
