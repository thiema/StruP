/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.impl;

import com.mxgraph.model.mxICell;

import com.mxgraph.view.mxGraph;

import com.mxgraph.view.mxGraph.mxICellVisitor;
import easyflow.*;

import easyflow.custom.exception.CellNotFoundException;
import easyflow.custom.exception.DataLinkNotFoundException;
import easyflow.custom.exception.DataPortNotFoundException;
import easyflow.custom.exception.GroupingCriterionInstanceNotFoundException;
import easyflow.custom.exception.GroupingCriterionNotFoundException;
import easyflow.custom.exception.NoValidInOutDataException;
import easyflow.custom.exception.ParameterCriterionInstanceNotFoundException;
import easyflow.custom.exception.ParameterCriterionNotFoundException;
import easyflow.custom.exception.ParameterNotFoundException;
import easyflow.custom.exception.TaskNotFoundException;
import easyflow.custom.exception.ToolNotFoundException;
import easyflow.custom.exception.UtilityTaskNotFoundException;
import easyflow.custom.jgraphx.EasyFlowOverallWorker;
import easyflow.custom.jgraphx.editor.EasyFlowGraph;

import easyflow.custom.util.Tuple;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Stack;

import java.util.regex.Pattern;
import javax.xml.validation.Schema;
import net.sf.json.JSONObject;
import org.apache.commons.jexl2.JexlEngine;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EasyflowFactoryImpl extends EFactoryImpl implements EasyflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyflowFactory init() {
		try {
			EasyflowFactory theEasyflowFactory = (EasyflowFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/thiema/easyflow/easyflow.core/1.0.0"); 
			if (theEasyflowFactory != null) {
				return theEasyflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EasyflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.MX_GRAPH:
				return createmxGraphFromString(eDataType, initialValue);
			case EasyflowPackage.MX_ICELL:
				return createmxICellFromString(eDataType, initialValue);
			case EasyflowPackage.MX_ICELL_VISITOR:
				return createmxICellVisitorFromString(eDataType, initialValue);
			case EasyflowPackage.EASY_FLOW_GRAPH:
				return createEasyFlowGraphFromString(eDataType, initialValue);
			case EasyflowPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case EasyflowPackage.JEXL_ENGINE:
				return createJexlEngineFromString(eDataType, initialValue);
			case EasyflowPackage.STACK:
				return createStackFromString(eDataType, initialValue);
			case EasyflowPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case EasyflowPackage.EOBJECT:
				return createEObjectFromString(eDataType, initialValue);
			case EasyflowPackage.DOCUMENT:
				return createDocumentFromString(eDataType, initialValue);
			case EasyflowPackage.ELEMENT:
				return createElementFromString(eDataType, initialValue);
			case EasyflowPackage.SCHEMA:
				return createSchemaFromString(eDataType, initialValue);
			case EasyflowPackage.JSON_OBJECT:
				return createJSONObjectFromString(eDataType, initialValue);
			case EasyflowPackage.BUFFERED_READER:
				return createBufferedReaderFromString(eDataType, initialValue);
			case EasyflowPackage.BUFFERED_WRITER:
				return createBufferedWriterFromString(eDataType, initialValue);
			case EasyflowPackage.PATTERN:
				return createPatternFromString(eDataType, initialValue);
			case EasyflowPackage.EASY_FLOW_OVERALL_WORKER:
				return createEasyFlowOverallWorkerFromString(eDataType, initialValue);
			case EasyflowPackage.CELL_NOT_FOUND_EXCEPTION:
				return createCellNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.FILE_NOT_FOUND_EXCEPTION:
				return createFileNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.TASK_NOT_FOUND_EXCEPTION:
				return createTaskNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.DATA_PORT_NOT_FOUND_EXCEPTION:
				return createDataPortNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.DATA_LINK_NOT_FOUND_EXCEPTION:
				return createDataLinkNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.TOOL_NOT_FOUND_EXCEPTION:
				return createToolNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.GROUPING_CRITERION_NOT_FOUND_EXCEPTION:
				return createGroupingCriterionNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.GROUPING_CRITERION_INSTANCE_NOT_FOUND_EXCEPTION:
				return createGroupingCriterionInstanceNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.PARAMETER_CRITERION_NOT_FOUND_EXCEPTION:
				return createParameterCriterionNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.PARAMETER_CRITERION_INSTANCE_NOT_FOUND_EXCEPTION:
				return createParameterCriterionInstanceNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.PARAMETER_NOT_FOUND_EXCEPTION:
				return createParameterNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.UTILITY_TASK_NOT_FOUND_EXCEPTION:
				return createUtilityTaskNotFoundExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.NO_VALID_IN_OUT_DATA_EXCEPTION:
				return createNoValidInOutDataExceptionFromString(eDataType, initialValue);
			case EasyflowPackage.TUPLE:
				return createTupleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EasyflowPackage.MX_GRAPH:
				return convertmxGraphToString(eDataType, instanceValue);
			case EasyflowPackage.MX_ICELL:
				return convertmxICellToString(eDataType, instanceValue);
			case EasyflowPackage.MX_ICELL_VISITOR:
				return convertmxICellVisitorToString(eDataType, instanceValue);
			case EasyflowPackage.EASY_FLOW_GRAPH:
				return convertEasyFlowGraphToString(eDataType, instanceValue);
			case EasyflowPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case EasyflowPackage.JEXL_ENGINE:
				return convertJexlEngineToString(eDataType, instanceValue);
			case EasyflowPackage.STACK:
				return convertStackToString(eDataType, instanceValue);
			case EasyflowPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case EasyflowPackage.EOBJECT:
				return convertEObjectToString(eDataType, instanceValue);
			case EasyflowPackage.DOCUMENT:
				return convertDocumentToString(eDataType, instanceValue);
			case EasyflowPackage.ELEMENT:
				return convertElementToString(eDataType, instanceValue);
			case EasyflowPackage.SCHEMA:
				return convertSchemaToString(eDataType, instanceValue);
			case EasyflowPackage.JSON_OBJECT:
				return convertJSONObjectToString(eDataType, instanceValue);
			case EasyflowPackage.BUFFERED_READER:
				return convertBufferedReaderToString(eDataType, instanceValue);
			case EasyflowPackage.BUFFERED_WRITER:
				return convertBufferedWriterToString(eDataType, instanceValue);
			case EasyflowPackage.PATTERN:
				return convertPatternToString(eDataType, instanceValue);
			case EasyflowPackage.EASY_FLOW_OVERALL_WORKER:
				return convertEasyFlowOverallWorkerToString(eDataType, instanceValue);
			case EasyflowPackage.CELL_NOT_FOUND_EXCEPTION:
				return convertCellNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.FILE_NOT_FOUND_EXCEPTION:
				return convertFileNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.TASK_NOT_FOUND_EXCEPTION:
				return convertTaskNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.DATA_PORT_NOT_FOUND_EXCEPTION:
				return convertDataPortNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.DATA_LINK_NOT_FOUND_EXCEPTION:
				return convertDataLinkNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.TOOL_NOT_FOUND_EXCEPTION:
				return convertToolNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.GROUPING_CRITERION_NOT_FOUND_EXCEPTION:
				return convertGroupingCriterionNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.GROUPING_CRITERION_INSTANCE_NOT_FOUND_EXCEPTION:
				return convertGroupingCriterionInstanceNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.PARAMETER_CRITERION_NOT_FOUND_EXCEPTION:
				return convertParameterCriterionNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.PARAMETER_CRITERION_INSTANCE_NOT_FOUND_EXCEPTION:
				return convertParameterCriterionInstanceNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.PARAMETER_NOT_FOUND_EXCEPTION:
				return convertParameterNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.UTILITY_TASK_NOT_FOUND_EXCEPTION:
				return convertUtilityTaskNotFoundExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.NO_VALID_IN_OUT_DATA_EXCEPTION:
				return convertNoValidInOutDataExceptionToString(eDataType, instanceValue);
			case EasyflowPackage.TUPLE:
				return convertTupleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxGraph createmxGraphFromString(EDataType eDataType, String initialValue) {
		return (mxGraph)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmxGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxICell createmxICellFromString(EDataType eDataType, String initialValue) {
		return (mxICell)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmxICellToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexlEngine createJexlEngineFromString(EDataType eDataType, String initialValue) {
		return (JexlEngine)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJexlEngineToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStackFromString(EDataType eDataType, String initialValue) {
		return (Stack)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowGraph createEasyFlowGraphFromString(EDataType eDataType, String initialValue) {
		return (EasyFlowGraph)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEasyFlowGraphToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject createEObjectFromString(EDataType eDataType, String initialValue) {
		return (EObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocumentFromString(EDataType eDataType, String initialValue) {
		return (Document)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElementFromString(EDataType eDataType, String initialValue) {
		return (Element)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchemaFromString(EDataType eDataType, String initialValue) {
		return (Schema)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObjectFromString(EDataType eDataType, String initialValue) {
		return (JSONObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedReader createBufferedReaderFromString(EDataType eDataType, String initialValue) {
		return (BufferedReader)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedReaderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedWriter createBufferedWriterFromString(EDataType eDataType, String initialValue) {
		return (BufferedWriter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedWriterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNotFoundException createFileNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (FileNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mxICellVisitor createmxICellVisitorFromString(EDataType eDataType, String initialValue) {
		return (mxICellVisitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmxICellVisitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPatternFromString(EDataType eDataType, String initialValue) {
		return (Pattern)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellNotFoundException createCellNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (CellNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskNotFoundException createTaskNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (TaskNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPortNotFoundException createDataPortNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (DataPortNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataPortNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLinkNotFoundException createDataLinkNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (DataLinkNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLinkNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolNotFoundException createToolNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ToolNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToolNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCriterionNotFoundException createGroupingCriterionNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (GroupingCriterionNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingCriterionNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCriterionInstanceNotFoundException createGroupingCriterionInstanceNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (GroupingCriterionInstanceNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingCriterionInstanceNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCriterionNotFoundException createParameterCriterionNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ParameterCriterionNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterCriterionNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCriterionInstanceNotFoundException createParameterCriterionInstanceNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ParameterCriterionInstanceNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterCriterionInstanceNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterNotFoundException createParameterNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ParameterNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityTaskNotFoundException createUtilityTaskNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (UtilityTaskNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUtilityTaskNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoValidInOutDataException createNoValidInOutDataExceptionFromString(EDataType eDataType, String initialValue) {
		return (NoValidInOutDataException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoValidInOutDataExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple createTupleFromString(EDataType eDataType, String initialValue) {
		return (Tuple)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTupleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyFlowOverallWorker createEasyFlowOverallWorkerFromString(EDataType eDataType, String initialValue) {
		return (EasyFlowOverallWorker)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEasyFlowOverallWorkerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyflowPackage getEasyflowPackage() {
		return (EasyflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EasyflowPackage getPackage() {
		return EasyflowPackage.eINSTANCE;
	}

} //EasyflowFactoryImpl
