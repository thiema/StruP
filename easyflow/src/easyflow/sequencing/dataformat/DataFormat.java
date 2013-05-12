/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package easyflow.sequencing.dataformat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see easyflow.sequencing.dataformat.DataformatPackage#getDataFormat()
 * @model
 * @generated
 */
public enum DataFormat implements Enumerator {
	/**
	 * The '<em><b>Fast Q</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAST_Q_VALUE
	 * @generated
	 * @ordered
	 */
	FAST_Q(0, "FastQ", "FastQ"),

	/**
	 * The '<em><b>SAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAM_VALUE
	 * @generated
	 * @ordered
	 */
	SAM(1, "SAM", "SAM"),

	/**
	 * The '<em><b>BAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAM_VALUE
	 * @generated
	 * @ordered
	 */
	BAM(2, "BAM", "BAM"),

	/**
	 * The '<em><b>BED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BED_VALUE
	 * @generated
	 * @ordered
	 */
	BED(3, "BED", "BED"),

	/**
	 * The '<em><b>TXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TXT_VALUE
	 * @generated
	 * @ordered
	 */
	TXT(4, "TXT", "TXT"),

	/**
	 * The '<em><b>CSV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV_VALUE
	 * @generated
	 * @ordered
	 */
	CSV(5, "CSV", "CSV"),

	/**
	 * The '<em><b>Fast A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAST_A_VALUE
	 * @generated
	 * @ordered
	 */
	FAST_A(6, "FastA", "FastA");

	/**
	 * The '<em><b>Fast Q</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fast Q</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAST_Q
	 * @model name="FastQ"
	 * @generated
	 * @ordered
	 */
	public static final int FAST_Q_VALUE = 0;

	/**
	 * The '<em><b>SAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAM_VALUE = 1;

	/**
	 * The '<em><b>BAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAM_VALUE = 2;

	/**
	 * The '<em><b>BED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BED_VALUE = 3;

	/**
	 * The '<em><b>TXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TXT_VALUE = 4;

	/**
	 * The '<em><b>CSV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSV_VALUE = 5;

	/**
	 * The '<em><b>Fast A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fast A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAST_A
	 * @model name="FastA"
	 * @generated
	 * @ordered
	 */
	public static final int FAST_A_VALUE = 6;

	/**
	 * An array of all the '<em><b>Data Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataFormat[] VALUES_ARRAY =
		new DataFormat[] {
			FAST_Q,
			SAM,
			BAM,
			BED,
			TXT,
			CSV,
			FAST_A,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFormat get(int value) {
		switch (value) {
			case FAST_Q_VALUE: return FAST_Q;
			case SAM_VALUE: return SAM;
			case BAM_VALUE: return BAM;
			case BED_VALUE: return BED;
			case TXT_VALUE: return TXT;
			case CSV_VALUE: return CSV;
			case FAST_A_VALUE: return FAST_A;
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
	private DataFormat(int value, String name, String literal) {
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
	
} //DataFormat
