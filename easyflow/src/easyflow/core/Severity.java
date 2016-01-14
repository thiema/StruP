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
 * A representation of the literals of the enumeration '<em><b>Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see easyflow.core.CorePackage#getSeverity()
 * @model
 * @generated
 */
public enum Severity implements Enumerator {
	/**
	 * The '<em><b>FATAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATAL_VALUE
	 * @generated
	 * @ordered
	 */
	FATAL(0, "FATAL", "FATAL"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(1, "ERROR", "ERROR"),

	/**
	 * The '<em><b>WARN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARN_VALUE
	 * @generated
	 * @ordered
	 */
	WARN(2, "WARN", "WARN"),

	/**
	 * The '<em><b>INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_VALUE
	 * @generated
	 * @ordered
	 */
	INFO(3, "INFO", "INFO"),

	/**
	 * The '<em><b>DEBUG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBUG_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUG(4, "DEBUG", "DEBUG"),

	/**
	 * The '<em><b>TRACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(5, "TRACE", "TRACE");

	/**
	 * The '<em><b>FATAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FATAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FATAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FATAL_VALUE = 0;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 1;

	/**
	 * The '<em><b>WARN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARN_VALUE = 2;

	/**
	 * The '<em><b>INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFO_VALUE = 3;

	/**
	 * The '<em><b>DEBUG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEBUG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBUG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBUG_VALUE = 4;

	/**
	 * The '<em><b>TRACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Severity[] VALUES_ARRAY =
		new Severity[] {
			FATAL,
			ERROR,
			WARN,
			INFO,
			DEBUG,
			TRACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Severity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Severity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Severity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Severity get(int value) {
		switch (value) {
			case FATAL_VALUE: return FATAL;
			case ERROR_VALUE: return ERROR;
			case WARN_VALUE: return WARN;
			case INFO_VALUE: return INFO;
			case DEBUG_VALUE: return DEBUG;
			case TRACE_VALUE: return TRACE;
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
	private Severity(int value, String name, String literal) {
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
	
} //Severity
