/**
 */
package petrinetsDiffMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getChangeStatus()
 * @model
 * @generated
 */
public enum ChangeStatus implements Enumerator {
	/**
	 * The '<em><b>NON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_VALUE
	 * @generated
	 * @ordered
	 */
	NON(0, "NON", "NON"),

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(1, "EQUIVALENT", "EQUIVALENT"),

	/**
	 * The '<em><b>CONTRADICTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRADICTING_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRADICTING(2, "CONTRADICTING", "CONTRADICTING"),

	/**
	 * The '<em><b>MERGE ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_ADD(3, "MERGE_ADD", "MERGE_ADD"),

	/**
	 * The '<em><b>MERGE DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_DELETE(4, "MERGE_DELETE", "MERGE_DELETE"),

	/**
	 * The '<em><b>MERGE MODIFY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_MODIFY_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_MODIFY(5, "MERGE_MODIFY", "MERGE_MODIFY"),

	/**
	 * The '<em><b>MERGE DELETE CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_DELETE_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_DELETE_CREATE(6, "MERGE_DELETE_CREATE", "MERGE_DELETE_CREATE");

	/**
	 * The '<em><b>NON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_VALUE = 0;

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 1;

	/**
	 * The '<em><b>CONTRADICTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRADICTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRADICTING_VALUE = 2;

	/**
	 * The '<em><b>MERGE ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_ADD_VALUE = 3;

	/**
	 * The '<em><b>MERGE DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_DELETE_VALUE = 4;

	/**
	 * The '<em><b>MERGE MODIFY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_MODIFY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_MODIFY_VALUE = 5;

	/**
	 * The '<em><b>MERGE DELETE CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_DELETE_CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_DELETE_CREATE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Change Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeStatus[] VALUES_ARRAY =
		new ChangeStatus[] {
			NON,
			EQUIVALENT,
			CONTRADICTING,
			MERGE_ADD,
			MERGE_DELETE,
			MERGE_MODIFY,
			MERGE_DELETE_CREATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeStatus get(int value) {
		switch (value) {
			case NON_VALUE: return NON;
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case CONTRADICTING_VALUE: return CONTRADICTING;
			case MERGE_ADD_VALUE: return MERGE_ADD;
			case MERGE_DELETE_VALUE: return MERGE_DELETE;
			case MERGE_MODIFY_VALUE: return MERGE_MODIFY;
			case MERGE_DELETE_CREATE_VALUE: return MERGE_DELETE_CREATE;
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
	private ChangeStatus(int value, String name, String literal) {
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
	
} //ChangeStatus
