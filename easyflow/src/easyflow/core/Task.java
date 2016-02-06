/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.ResolvingParameterFailedException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.data.DataFormat;
import easyflow.data.DataLink;
import easyflow.data.DataPort;
import easyflow.metadata.GroupingInstance;
import easyflow.tool.Command;
import easyflow.tool.ResolvedParam;
import easyflow.tool.Rule;
import easyflow.tool.Tool;
import easyflow.traversal.TraversalChunk;
import easyflow.traversal.TraversalEvent;
import java.net.URI;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Task respresents a basic data processing unit. It transforms a number of Inputs into Outputs. The Task itself is independent of a concrete Tool that implements the Task and the processing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.core.Task#getInDataPorts <em>In Data Ports</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutDataPorts <em>Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.Task#getName <em>Name</em>}</li>
 *   <li>{@link easyflow.core.Task#getJexlString <em>Jexl String</em>}</li>
 *   <li>{@link easyflow.core.Task#isUtil <em>Util</em>}</li>
 *   <li>{@link easyflow.core.Task#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.core.Task#getTraversalEvents <em>Traversal Events</em>}</li>
 *   <li>{@link easyflow.core.Task#getParents <em>Parents</em>}</li>
 *   <li>{@link easyflow.core.Task#getChunks <em>Chunks</em>}</li>
 *   <li>{@link easyflow.core.Task#getToolNames <em>Tool Names</em>}</li>
 *   <li>{@link easyflow.core.Task#getTools <em>Tools</em>}</li>
 *   <li>{@link easyflow.core.Task#getToolMatches <em>Tool Matches</em>}</li>
 *   <li>{@link easyflow.core.Task#getPreviousTaskStr <em>Previous Task Str</em>}</li>
 *   <li>{@link easyflow.core.Task#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.core.Task#getFlags <em>Flags</em>}</li>
 *   <li>{@link easyflow.core.Task#getGroupingCriteria <em>Grouping Criteria</em>}</li>
 *   <li>{@link easyflow.core.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link easyflow.core.Task#getInputsByDataPort <em>Inputs By Data Port</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutputsByDataPort <em>Outputs By Data Port</em>}</li>
 *   <li>{@link easyflow.core.Task#getInputDataPortValidator <em>Input Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.Task#getOutputDataPortValidator <em>Output Data Port Validator</em>}</li>
 *   <li>{@link easyflow.core.Task#getAnalysisTypes <em>Analysis Types</em>}</li>
 *   <li>{@link easyflow.core.Task#getCircumventingParents <em>Circumventing Parents</em>}</li>
 *   <li>{@link easyflow.core.Task#getRecords <em>Records</em>}</li>
 *   <li>{@link easyflow.core.Task#getPreprocessingTasks <em>Preprocessing Tasks</em>}</li>
 *   <li>{@link easyflow.core.Task#getResolvedCommand <em>Resolved Command</em>}</li>
 *   <li>{@link easyflow.core.Task#getUnresolvedOutDataPorts <em>Unresolved Out Data Ports</em>}</li>
 *   <li>{@link easyflow.core.Task#getParams <em>Params</em>}</li>
 *   <li>{@link easyflow.core.Task#getStaticParams <em>Static Params</em>}</li>
 *   <li>{@link easyflow.core.Task#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.core.CorePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>In Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Data Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_InDataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getInDataPorts();

	/**
	 * Returns the value of the '<em><b>Out Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Data Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_OutDataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getOutDataPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see easyflow.core.CorePackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jexl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jexl String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jexl String</em>' attribute.
	 * @see #setJexlString(String)
	 * @see easyflow.core.CorePackage#getTask_JexlString()
	 * @model
	 * @generated
	 */
	String getJexlString();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getJexlString <em>Jexl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jexl String</em>' attribute.
	 * @see #getJexlString()
	 * @generated
	 */
	void setJexlString(String value);

	/**
	 * Returns the value of the '<em><b>Util</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Util</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Util</em>' attribute.
	 * @see #setUtil(boolean)
	 * @see easyflow.core.CorePackage#getTask_Util()
	 * @model default="false"
	 * @generated
	 */
	boolean isUtil();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#isUtil <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Util</em>' attribute.
	 * @see #isUtil()
	 * @generated
	 */
	void setUtil(boolean value);

	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see #setLogger(Logger)
	 * @see easyflow.core.CorePackage#getTask_Logger()
	 * @model dataType="easyflow.Logger" transient="true"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getLogger <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logger</em>' attribute.
	 * @see #getLogger()
	 * @generated
	 */
	void setLogger(Logger value);

	/**
	 * Returns the value of the '<em><b>Traversal Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.traversal.TraversalEvent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traversal Events</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traversal Events</em>' map.
	 * @see easyflow.core.CorePackage#getTask_TraversalEvents()
	 * @model mapType="easyflow.util.maps.StringToTraversalEventMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalEvent>"
	 * @generated
	 */
	EMap<String, TraversalEvent> getTraversalEvents();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.Task},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Parents()
	 * @model mapType="easyflow.util.maps.StringToTaskMap<org.eclipse.emf.ecore.EString, easyflow.core.Task>"
	 * @generated
	 */
	EMap<String, Task> getParents();

	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.traversal.TraversalChunk},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the tasks chunk (value) which corresponds to its traversal criterion (key). 
	 * Only set after traversal event has been applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chunks</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Chunks()
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getChunks();

	/**
	 * Returns the value of the '<em><b>Tool Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Names</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Names</em>' map.
	 * @see easyflow.core.CorePackage#getTask_ToolNames()
	 * @model mapType="easyflow.util.maps.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, EList<String>> getToolNames();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.Tool},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of processing tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Tools()
	 * @model mapType="easyflow.util.maps.StringToToolMap<org.eclipse.emf.ecore.EString, easyflow.tool.Tool>"
	 * @generated
	 */
	EMap<String, Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Tool Matches</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.core.ToolMatch},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Matches</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Matches</em>' map.
	 * @see easyflow.core.CorePackage#getTask_ToolMatches()
	 * @model mapType="easyflow.util.maps.StringToToolMatchMap<org.eclipse.emf.ecore.EString, easyflow.core.ToolMatch>"
	 * @generated
	 */
	EMap<String, ToolMatch> getToolMatches();

	/**
	 * Returns the value of the '<em><b>Previous Task Str</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Task Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task Str</em>' attribute.
	 * @see #setPreviousTaskStr(String)
	 * @see easyflow.core.CorePackage#getTask_PreviousTaskStr()
	 * @model default=""
	 * @generated
	 */
	String getPreviousTaskStr();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getPreviousTaskStr <em>Previous Task Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task Str</em>' attribute.
	 * @see #getPreviousTaskStr()
	 * @generated
	 */
	void setPreviousTaskStr(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see easyflow.core.CorePackage#getTask_Root()
	 * @model
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see easyflow.core.CorePackage#getTask_Flags()
	 * @model default="0"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Grouping Criteria</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Criteria</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Criteria</em>' map.
	 * @see easyflow.core.CorePackage#getTask_GroupingCriteria()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getGroupingCriteria();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.data.DataLink},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Inputs()
	 * @model mapType="easyflow.util.maps.StringToDataLinkMap<org.eclipse.emf.ecore.EString, easyflow.data.DataLink>"
	 * @generated
	 */
	EMap<String, DataLink> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.data.DataLink},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Outputs()
	 * @model mapType="easyflow.util.maps.StringToDataLinkMap<org.eclipse.emf.ecore.EString, easyflow.data.DataLink>"
	 * @generated
	 */
	EMap<String, DataLink> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs By Data Port</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs By Data Port</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs By Data Port</em>' map.
	 * @see easyflow.core.CorePackage#getTask_InputsByDataPort()
	 * @model mapType="easyflow.util.maps.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, EList<String>> getInputsByDataPort();

	/**
	 * Returns the value of the '<em><b>Outputs By Data Port</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs By Data Port</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs By Data Port</em>' map.
	 * @see easyflow.core.CorePackage#getTask_OutputsByDataPort()
	 * @model mapType="easyflow.util.maps.StringToStringListMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, EList<String>> getOutputsByDataPort();

	/**
	 * Returns the value of the '<em><b>Input Data Port Validator</b></em>' attribute list.
	 * The list contents are of type {@link java.util.regex.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Port Validator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Port Validator</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_InputDataPortValidator()
	 * @model dataType="easyflow.Pattern"
	 * @generated
	 */
	EList<Pattern> getInputDataPortValidator();

	/**
	 * Returns the value of the '<em><b>Output Data Port Validator</b></em>' attribute list.
	 * The list contents are of type {@link java.util.regex.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data Port Validator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Port Validator</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_OutputDataPortValidator()
	 * @model dataType="easyflow.Pattern"
	 * @generated
	 */
	EList<Pattern> getOutputDataPortValidator();

	/**
	 * Returns the value of the '<em><b>Analysis Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Types</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_AnalysisTypes()
	 * @model
	 * @generated
	 */
	EList<String> getAnalysisTypes();

	/**
	 * Returns the value of the '<em><b>Circumventing Parents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circumventing Parents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circumventing Parents</em>' attribute list.
	 * @see easyflow.core.CorePackage#getTask_CircumventingParents()
	 * @model
	 * @generated
	 */
	EList<String> getCircumventingParents();

	/**
	 * Returns the value of the '<em><b>Records</b></em>' reference list.
	 * The list contents are of type {@link easyflow.traversal.TraversalChunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_Records()
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getRecords();

	/**
	 * Returns the value of the '<em><b>Preprocessing Tasks</b></em>' reference list.
	 * The list contents are of type {@link easyflow.core.PreprocessingTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessing Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing Tasks</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_PreprocessingTasks()
	 * @model
	 * @generated
	 */
	EList<PreprocessingTask> getPreprocessingTasks();

	/**
	 * Returns the value of the '<em><b>Resolved Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Command</em>' containment reference.
	 * @see #setResolvedCommand(Command)
	 * @see easyflow.core.CorePackage#getTask_ResolvedCommand()
	 * @model containment="true"
	 * @generated
	 */
	Command getResolvedCommand();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getResolvedCommand <em>Resolved Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Command</em>' containment reference.
	 * @see #getResolvedCommand()
	 * @generated
	 */
	void setResolvedCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Unresolved Out Data Ports</b></em>' reference list.
	 * The list contents are of type {@link easyflow.data.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unresolved Out Data Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Out Data Ports</em>' reference list.
	 * @see easyflow.core.CorePackage#getTask_UnresolvedOutDataPorts()
	 * @model
	 * @generated
	 */
	EList<DataPort> getUnresolvedOutDataPorts();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' map.
	 * @see easyflow.core.CorePackage#getTask_Params()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getParams();

	/**
	 * Returns the value of the '<em><b>Static Params</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Params</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Params</em>' map.
	 * @see easyflow.core.CorePackage#getTask_StaticParams()
	 * @model mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getStaticParams();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Rule)
	 * @see easyflow.core.CorePackage#getTask_Rule()
	 * @model
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link easyflow.core.Task#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model defaultGroupingCriteriaMany="true"
	 * @generated
	 */
	void readTask(String taskString, String defaultMode, EList<String> defaultGroupingCriteria);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model groupingInstancesMany="true"
	 * @generated
	 */
	boolean shallProcess(EList<GroupingInstance> groupingInstances, String forGrouping);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model groupingInstancesMany="true" jexlStringsMany="true"
	 * @generated
	 */
	boolean shallProcess(EList<GroupingInstance> groupingInstances, String forGrouping, EList<String> jexlStrings, boolean isInverse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model many="false" patternDataType="easyflow.Pattern" patternMany="true"
	 * @generated
	 */
	EList<DataFormat> parseDataFormatField(String dataFormatString, EList<Pattern> pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUniqueString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUniqueURIString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatibleWithOutDataPortFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isCompatibleWithInDataPortFor(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Task getParentTaskByOutDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.StringToChunksMap<org.eclipse.emf.ecore.EString, easyflow.traversal.TraversalChunk>"
	 * @generated
	 */
	EMap<String, EList<TraversalChunk>> getNonOveralppingTraversalChunksFor(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model toolsMany="true"
	 * @generated
	 */
	void readTools(EList<Tool> tools);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Tool getPreferredTool();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataPorts1Many="true" dataPorts2Many="true"
	 * @generated
	 */
	EList<DataPort> getOverlappingDataPorts(EList<DataPort> dataPorts1, EList<DataPort> dataPorts2);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTool(Tool tool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTools();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByDataPort(DataPort testDataPort, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByNameOfFormat(String name, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort getDataPortByName(String dataPortName, boolean isOutDataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="easyflow.util.maps.TaskToDataPortsMap<easyflow.core.Task, easyflow.data.DataPort>" tasksMany="true"
	 * @generated
	 */
	EMap<Task, EList<DataPort>> resolveMissingDataPortsByTool(EList<Task> tasks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getOverlappingChunksFor(Task parentTask, String groupingStr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ToolNotFoundException"
	 * @generated
	 */
	EList<String> getRequiredGroupingsFor(Tool tool, DataPort dataPort, boolean required) throws ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ToolNotFoundException"
	 * @generated
	 */
	EList<String> getProvidedGroupingsFor(Tool tool, DataPort dataPort, boolean required) throws ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleGroupingsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ToolNotFoundException easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws ToolNotFoundException, DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInstancesPerInputFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInputsFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException"
	 * @generated
	 */
	boolean canFilterInstancesFor(Tool tool, DataPort dataPort) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getRecords(boolean intersect);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getInputs(boolean intersect);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TraversalChunk> getOverlappingRecordsProvidedBy(Task testTask);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException" traverslChunksMany="true"
	 * @generated
	 */
	boolean canProvideDataPort(Tool tool, DataPort dataPort, String grouping, EList<TraversalChunk> traverslChunks, boolean isPartial) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException easyflow.ToolNotFoundException" traverslChunksMany="true"
	 * @generated
	 */
	boolean canComsumeDataPort(Tool tool, DataPort dataPort, String grouping, EList<TraversalChunk> traverslChunks, boolean isPartial) throws DataPortNotFoundException, ToolNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	EList<URI> getOutputsForDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	EList<URI> getInputsForDataPort(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataLinkNotFoundException easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	void resolveParams() throws DataLinkNotFoundException, ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isIdentityTransformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isIdentityTransformation(DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resolveConditionalStaticParam(ResolvedParam parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean readFromPipe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean writeToPipe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException easyflow.ResolvingParameterFailedException easyflow.DataLinkNotFoundException"
	 * @generated
	 */
	Rule createRule() throws ParameterNotFoundException, NoValidInOutDataException, ResolvingParameterFailedException, DataLinkNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataPort retrieveDataPort(boolean isOutput, int strategy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException easyflow.ResolvingParameterFailedException" dataLinksMapType="easyflow.util.maps.StringToDataLinkMap<org.eclipse.emf.ecore.EString, easyflow.data.DataLink>"
	 * @generated
	 */
	void resolveDataPortParams(EMap<String, DataLink> dataLinks, Tool tool, boolean isOutput) throws ParameterNotFoundException, NoValidInOutDataException, ResolvingParameterFailedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resolveStaticParamsMapType="easyflow.util.maps.StringToResolvedParamMap<org.eclipse.emf.ecore.EString, easyflow.tool.ResolvedParam>"
	 * @generated
	 */
	void resolveStaticParams(EMap<String, ResolvedParam> resolveStaticParams);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDetailedString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" mapType="easyflow.util.maps.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getValidInOutDataPortCombinations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean readTraversalCriteria(String field);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model defaultCroupingCriteriaMany="true"
	 * @generated
	 */
	boolean readGroupingCriteria(String field, EList<String> defaultCroupingCriteria, String defaultMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean createGroupingCriteria(String field, DataPort defaultCroupingCriteria, String defaultMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	EList<String> resolveCommandLinePartExe() throws ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	String resolveCommandLinePartAnalysisType() throws ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	EList<String> resolveCommandLinePartInterpreter() throws ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.ParameterNotFoundException easyflow.NoValidInOutDataException"
	 * @generated
	 */
	EList<String> resolveCommandLinePart(String cmdLinePart, boolean omitInput, boolean omitOutput) throws ParameterNotFoundException, NoValidInOutDataException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCommandLinePattern();

} // Task
