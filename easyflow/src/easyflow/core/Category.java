/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see easyflow.core.CorePackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator {
	/**
	 * The '<em><b>PROJECT CONFIGURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT_CONFIGURATION(10, "PROJECT_CONFIGURATION", "PROJECT_CONFIGURATION"), /**
	 * The '<em><b>METADATA DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA_DEFINITION(15, "METADATA_DEFINITION", "METADATA_DEFINITION"), /**
	 * The '<em><b>TASK DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_DEFINITION(16, "TASK_DEFINITION", "TASK_DEFINITION"), /**
	 * The '<em><b>TOOL DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL_DEFINITION(17, "TOOL_DEFINITION", "TOOL_DEFINITION"),

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW(20, "WORKFLOW", "WORKFLOW"), /**
	 * The '<em><b>WORKFLOW TEMPLATE PARSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_TEMPLATE_PARSING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_TEMPLATE_PARSING(25, "WORKFLOW_TEMPLATE_PARSING", "WORKFLOW_TEMPLATE_PARSING"), /**
	 * The '<em><b>ABSTRACT WORKFLOW GENERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_WORKFLOW_GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_WORKFLOW_GENERATION(30, "ABSTRACT_WORKFLOW_GENERATION", "ABSTRACT_WORKFLOW_GENERATION"), /**
	 * The '<em><b>TRAVERSAL EVENT CREATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSAL_EVENT_CREATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSAL_EVENT_CREATION(33, "TRAVERSAL_EVENT_CREATION", "TRAVERSAL_EVENT_CREATION"), /**
	 * The '<em><b>SUBGRAPH CREATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBGRAPH_CREATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBGRAPH_CREATION(35, "SUBGRAPH_CREATION", "SUBGRAPH_CREATION"), /**
	 * The '<em><b>TRAVERSAL EVENT RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSAL_EVENT_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSAL_EVENT_RESOLUTION(40, "TRAVERSAL_EVENT_RESOLUTION", "TRAVERSAL_EVENT_RESOLUTION"), /**
	 * The '<em><b>DATA GROUPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_GROUPING_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_GROUPING(41, "DATA_GROUPING", "DATA_GROUPING"), /**
	 * The '<em><b>PARAMETER GROUPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_GROUPING_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_GROUPING(42, "PARAMETER_GROUPING", "PARAMETER_GROUPING"), /**
	 * The '<em><b>UTILITY TASK RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILITY_TASK_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	UTILITY_TASK_RESOLUTION(50, "UTILITY_TASK_RESOLUTION", "UTILITY_TASK_RESOLUTION"), /**
	 * The '<em><b>INCOMPATIBLE GROUPING RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOMPATIBLE_GROUPING_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPATIBLE_GROUPING_RESOLUTION(51, "INCOMPATIBLE_GROUPING_RESOLUTION", "INCOMPATIBLE_GROUPING_RESOLUTION"), /**
	 * The '<em><b>TOOL RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL_RESOLUTION(60, "TOOL_RESOLUTION", "TOOL_RESOLUTION"), /**
	 * The '<em><b>EXECUTION WORKFLOW GENERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_WORKFLOW_GENERATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTION_WORKFLOW_GENERATION(70, "EXECUTION_WORKFLOW_GENERATION", "EXECUTION_WORKFLOW_GENERATION"), /**
	 * The '<em><b>GRAPH UTIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_UTIL_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_UTIL(200, "GRAPH_UTIL", "GRAPH_UTIL"), /**
	 * The '<em><b>UTIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTIL_VALUE
	 * @generated
	 * @ordered
	 */
	UTIL(300, "UTIL", "UTIL");

	/**
	 * The '<em><b>PROJECT CONFIGURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROJECT CONFIGURATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROJECT_CONFIGURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_CONFIGURATION_VALUE = 10;

	/**
	 * The '<em><b>METADATA DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METADATA DEFINITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METADATA_DEFINITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_DEFINITION_VALUE = 15;

	/**
	 * The '<em><b>TASK DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASK DEFINITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK_DEFINITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DEFINITION_VALUE = 16;

	/**
	 * The '<em><b>TOOL DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOOL DEFINITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOL_DEFINITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_DEFINITION_VALUE = 17;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORKFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 20;

	/**
	 * The '<em><b>WORKFLOW TEMPLATE PARSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORKFLOW TEMPLATE PARSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_TEMPLATE_PARSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TEMPLATE_PARSING_VALUE = 25;

	/**
	 * The '<em><b>ABSTRACT WORKFLOW GENERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABSTRACT WORKFLOW GENERATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_WORKFLOW_GENERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_WORKFLOW_GENERATION_VALUE = 30;

	/**
	 * The '<em><b>TRAVERSAL EVENT CREATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSAL EVENT CREATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSAL_EVENT_CREATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSAL_EVENT_CREATION_VALUE = 33;

	/**
	 * The '<em><b>SUBGRAPH CREATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBGRAPH CREATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBGRAPH_CREATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBGRAPH_CREATION_VALUE = 35;

	/**
	 * The '<em><b>TRAVERSAL EVENT RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSAL EVENT RESOLUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSAL_EVENT_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSAL_EVENT_RESOLUTION_VALUE = 40;

	/**
	 * The '<em><b>DATA GROUPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA GROUPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_GROUPING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_GROUPING_VALUE = 41;

	/**
	 * The '<em><b>PARAMETER GROUPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARAMETER GROUPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_GROUPING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_GROUPING_VALUE = 42;

	/**
	 * The '<em><b>UTILITY TASK RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTILITY TASK RESOLUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILITY_TASK_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UTILITY_TASK_RESOLUTION_VALUE = 50;

	/**
	 * The '<em><b>INCOMPATIBLE GROUPING RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCOMPATIBLE GROUPING RESOLUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCOMPATIBLE_GROUPING_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPATIBLE_GROUPING_RESOLUTION_VALUE = 51;

	/**
	 * The '<em><b>TOOL RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOOL RESOLUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOL_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_RESOLUTION_VALUE = 60;

	/**
	 * The '<em><b>EXECUTION WORKFLOW GENERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXECUTION WORKFLOW GENERATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_WORKFLOW_GENERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTION_WORKFLOW_GENERATION_VALUE = 70;

	/**
	 * The '<em><b>GRAPH UTIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAPH UTIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPH_UTIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_UTIL_VALUE = 200;

	/**
	 * The '<em><b>UTIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UTIL_VALUE = 300;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[] {
			PROJECT_CONFIGURATION,
			METADATA_DEFINITION,
			TASK_DEFINITION,
			TOOL_DEFINITION,
			WORKFLOW,
			WORKFLOW_TEMPLATE_PARSING,
			ABSTRACT_WORKFLOW_GENERATION,
			TRAVERSAL_EVENT_CREATION,
			SUBGRAPH_CREATION,
			TRAVERSAL_EVENT_RESOLUTION,
			DATA_GROUPING,
			PARAMETER_GROUPING,
			UTILITY_TASK_RESOLUTION,
			INCOMPATIBLE_GROUPING_RESOLUTION,
			TOOL_RESOLUTION,
			EXECUTION_WORKFLOW_GENERATION,
			GRAPH_UTIL,
			UTIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Category get(int value) {
		switch (value) {
			case PROJECT_CONFIGURATION_VALUE: return PROJECT_CONFIGURATION;
			case METADATA_DEFINITION_VALUE: return METADATA_DEFINITION;
			case TASK_DEFINITION_VALUE: return TASK_DEFINITION;
			case TOOL_DEFINITION_VALUE: return TOOL_DEFINITION;
			case WORKFLOW_VALUE: return WORKFLOW;
			case WORKFLOW_TEMPLATE_PARSING_VALUE: return WORKFLOW_TEMPLATE_PARSING;
			case ABSTRACT_WORKFLOW_GENERATION_VALUE: return ABSTRACT_WORKFLOW_GENERATION;
			case TRAVERSAL_EVENT_CREATION_VALUE: return TRAVERSAL_EVENT_CREATION;
			case SUBGRAPH_CREATION_VALUE: return SUBGRAPH_CREATION;
			case TRAVERSAL_EVENT_RESOLUTION_VALUE: return TRAVERSAL_EVENT_RESOLUTION;
			case DATA_GROUPING_VALUE: return DATA_GROUPING;
			case PARAMETER_GROUPING_VALUE: return PARAMETER_GROUPING;
			case UTILITY_TASK_RESOLUTION_VALUE: return UTILITY_TASK_RESOLUTION;
			case INCOMPATIBLE_GROUPING_RESOLUTION_VALUE: return INCOMPATIBLE_GROUPING_RESOLUTION;
			case TOOL_RESOLUTION_VALUE: return TOOL_RESOLUTION;
			case EXECUTION_WORKFLOW_GENERATION_VALUE: return EXECUTION_WORKFLOW_GENERATION;
			case GRAPH_UTIL_VALUE: return GRAPH_UTIL;
			case UTIL_VALUE: return UTIL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Category(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Category
