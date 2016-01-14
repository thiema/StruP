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
	 * The '<em><b>METADATA DEFINITON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_DEFINITON_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA_DEFINITON(1, "METADATA_DEFINITON", "METADATA_DEFINITON"),

	/**
	 * The '<em><b>TASK DEFINITON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_DEFINITON_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_DEFINITON(0, "TASK_DEFINITON", "TASK_DEFINITON"),

	/**
	 * The '<em><b>TOOL DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL_DEFINITION(2, "TOOL_DEFINITION", "TOOL_DEFINITION"),

	/**
	 * The '<em><b>WORKFLOW TEMPLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_TEMPLATE(4, "WORKFLOW_TEMPLATE", "WORKFLOW_TEMPLATE"),

	/**
	 * The '<em><b>ABSTRACT WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_WORKFLOW(10, "ABSTRACT_WORKFLOW", "ABSTRACT_WORKFLOW"),

	/**
	 * The '<em><b>DATA GROUPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_GROUPING_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_GROUPING(20, "DATA_GROUPING", "INFO"),

	/**
	 * The '<em><b>PARAMETER GROUPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_GROUPING_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_GROUPING(21, "PARAMETER_GROUPING", "PARAMETER_GROUPING"),

	/**
	 * The '<em><b>PREPROCESSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	PREPROCESSING(30, "PREPROCESSING", "PREPROCESSING"),

	/**
	 * The '<em><b>TOOL RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL_RESOLUTION(40, "TOOL_RESOLUTION", "TOOL_RESOLUTION"),

	/**
	 * The '<em><b>EXECUTION WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTION_WORKFLOW(50, "EXECUTION_WORKFLOW", "EXECUTION_WORKFLOW");

	/**
	 * The '<em><b>METADATA DEFINITON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METADATA DEFINITON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METADATA_DEFINITON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_DEFINITON_VALUE = 1;

	/**
	 * The '<em><b>TASK DEFINITON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASK DEFINITON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK_DEFINITON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DEFINITON_VALUE = 0;

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
	public static final int TOOL_DEFINITION_VALUE = 2;

	/**
	 * The '<em><b>WORKFLOW TEMPLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORKFLOW TEMPLATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_TEMPLATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TEMPLATE_VALUE = 4;

	/**
	 * The '<em><b>ABSTRACT WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABSTRACT WORKFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_WORKFLOW_VALUE = 10;

	/**
	 * The '<em><b>DATA GROUPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA GROUPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_GROUPING
	 * @model literal="INFO"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_GROUPING_VALUE = 20;

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
	public static final int PARAMETER_GROUPING_VALUE = 21;

	/**
	 * The '<em><b>PREPROCESSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREPROCESSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREPROCESSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREPROCESSING_VALUE = 30;

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
	public static final int TOOL_RESOLUTION_VALUE = 40;

	/**
	 * The '<em><b>EXECUTION WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXECUTION WORKFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTION_WORKFLOW_VALUE = 50;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[] {
			METADATA_DEFINITON,
			TASK_DEFINITON,
			TOOL_DEFINITION,
			WORKFLOW_TEMPLATE,
			ABSTRACT_WORKFLOW,
			DATA_GROUPING,
			PARAMETER_GROUPING,
			PREPROCESSING,
			TOOL_RESOLUTION,
			EXECUTION_WORKFLOW,
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
			case METADATA_DEFINITON_VALUE: return METADATA_DEFINITON;
			case TASK_DEFINITON_VALUE: return TASK_DEFINITON;
			case TOOL_DEFINITION_VALUE: return TOOL_DEFINITION;
			case WORKFLOW_TEMPLATE_VALUE: return WORKFLOW_TEMPLATE;
			case ABSTRACT_WORKFLOW_VALUE: return ABSTRACT_WORKFLOW;
			case DATA_GROUPING_VALUE: return DATA_GROUPING;
			case PARAMETER_GROUPING_VALUE: return PARAMETER_GROUPING;
			case PREPROCESSING_VALUE: return PREPROCESSING;
			case TOOL_RESOLUTION_VALUE: return TOOL_RESOLUTION;
			case EXECUTION_WORKFLOW_VALUE: return EXECUTION_WORKFLOW;
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
