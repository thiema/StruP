/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.tool;

import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.util.Tuple;
import easyflow.data.Data;
import easyflow.data.DataPort;
import easyflow.traversal.TraversalChunk;
import easyflow.util.LogMessage;
import java.net.URI;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tool represents the tool which is used to implement an processing step.
 * The tools behaviour is mainly implemented by its command reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link easyflow.tool.Tool#getLogger <em>Logger</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getId <em>Id</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getVersion <em>Version</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getPackage <em>Package</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getExecutables <em>Executables</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getData <em>Data</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getFilenamePrefix <em>Filename Prefix</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getCommand <em>Command</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getResolvedParams <em>Resolved Params</em>}</li>
 *   <li>{@link easyflow.tool.Tool#isRoot <em>Root</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getResolveUriMap <em>Resolve Uri Map</em>}</li>
 *   <li>{@link easyflow.tool.Tool#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see easyflow.tool.ToolPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends IToolElement, DefaultToolElement {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see easyflow.tool.ToolPackage#getTool_Logger()
	 * @model dataType="easyflow.Logger" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see easyflow.tool.ToolPackage#getTool_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see easyflow.tool.ToolPackage#getTool_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getInterpreter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProvideMultipleInstancesPerInputFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInstancesPerInputFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canProcessMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInstancesPerInputFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProcessMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInstancesPerInputFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInstancesFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	void setProvideMultipleInputsFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.URI"
	 * @generated
	 */
	URI resolvePath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean assumeParamPositional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexMapMapType="easyflow.util.maps.StringToIntMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" byParamIndexMapMapType="easyflow.util.maps.StringToIntMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	void createData(InOutParameter parameter, EMap<String, Integer> indexMap, EMap<String, Integer> byParamIndexMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexMapMapType="easyflow.util.maps.StringToIntMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>" byParamIndexMapMapType="easyflow.util.maps.StringToIntMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	void createData(ResolvedParam resolvedParameter, EMap<String, Integer> indexMap, EMap<String, Integer> byParamIndexMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initLogMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parametersMany="true"
	 * @generated
	 */
	Parameter getMatchingParameter(EList<Parameter> parameters, Parameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parametersMany="true"
	 * @generated
	 */
	Parameter getMatchingParameterByName(EList<Parameter> parameters, Parameter parameter);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(easyflow.tool.Package)
	 * @see easyflow.tool.ToolPackage#getTool_Package()
	 * @model
	 * @generated
	 */
	easyflow.tool.Package getPackage();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(easyflow.tool.Package value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link easyflow.tool.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see easyflow.tool.ToolPackage#getTool_Requirements()
	 * @model
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Executables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executables</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executables</em>' map.
	 * @see easyflow.tool.ToolPackage#getTool_Executables()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getExecutables();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link easyflow.data.Data},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' map.
	 * @see easyflow.tool.ToolPackage#getTool_Data()
	 * @model mapType="easyflow.util.maps.StringToDataListMap<org.eclipse.emf.ecore.EString, easyflow.data.Data>"
	 * @generated
	 */
	EMap<String, EList<Data>> getData();

	/**
	 * Returns the value of the '<em><b>Filename Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename Prefix</em>' attribute.
	 * @see #setFilenamePrefix(String)
	 * @see easyflow.tool.ToolPackage#getTool_FilenamePrefix()
	 * @model
	 * @generated
	 */
	String getFilenamePrefix();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getFilenamePrefix <em>Filename Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename Prefix</em>' attribute.
	 * @see #getFilenamePrefix()
	 * @generated
	 */
	void setFilenamePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Analysis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Type</em>' attribute.
	 * @see #setAnalysisType(String)
	 * @see easyflow.tool.ToolPackage#getTool_AnalysisType()
	 * @model
	 * @generated
	 */
	String getAnalysisType();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getAnalysisType <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Type</em>' attribute.
	 * @see #getAnalysisType()
	 * @generated
	 */
	void setAnalysisType(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see easyflow.tool.ToolPackage#getTool_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Resolved Params</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link easyflow.tool.ResolvedParam},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Params</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Params</em>' map.
	 * @see easyflow.tool.ToolPackage#getTool_ResolvedParams()
	 * @model mapType="easyflow.util.maps.StringToResolvedParamMap<org.eclipse.emf.ecore.EString, easyflow.tool.ResolvedParam>"
	 * @generated
	 */
	EMap<String, ResolvedParam> getResolvedParams();

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
	 * @see easyflow.tool.ToolPackage#getTool_Root()
	 * @model
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Resolve Uri Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.net.URI},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Uri Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Uri Map</em>' map.
	 * @see easyflow.tool.ToolPackage#getTool_ResolveUriMap()
	 * @model mapType="easyflow.util.maps.StringToURIMap<org.eclipse.emf.ecore.EString, easyflow.URI>"
	 * @generated
	 */
	EMap<String, URI> getResolveUriMap();

	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' reference.
	 * @see #setLogMessage(LogMessage)
	 * @see easyflow.tool.ToolPackage#getTool_LogMessage()
	 * @model
	 * @generated
	 */
	LogMessage getLogMessage();

	/**
	 * Sets the value of the '{@link easyflow.tool.Tool#getLogMessage <em>Log Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(LogMessage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void writeModelToXML();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="easyflow.DataPortNotFoundException"
	 * @generated
	 */
	boolean canFilterInstancesFor(DataPort dataPort) throws DataPortNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean requiresGrouping(String groupingCriterion, DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean providesGrouping(String groupingCriterion, DataPort dataPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getGroupingsForInputPort(DataPort dataPort, boolean required);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> getGroupingsForOutputPort(DataPort dataPort, boolean required);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="easyflow.Tuple" recordsMany="true"
	 * @generated
	 */
	Tuple getAnalysisTypeOfPackage(EList<TraversalChunk> records);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Parameter getTemplateParameter(Parameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Parameter getTemplateParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean assumeDataParamPositional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean omitPrefixIfNoArgKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCmdPartDelimiter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ResolvedParam> getInterpreterParams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ResolvedParam getExe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ResolvedParam> getModuleParams();

} // Tool
