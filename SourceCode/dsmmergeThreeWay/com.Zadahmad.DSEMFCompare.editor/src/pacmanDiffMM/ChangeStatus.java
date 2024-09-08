/**
 */
package pacmanDiffMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Change Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pacmanDiffMM.PacmanDiffMMPackage#getChangeStatus()
 * @model
 * @generated
 */
public enum ChangeStatus implements Enumerator {
	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(0, "EQUIVALENT", "EQUIVALENT"),

	/**
	 * The '<em><b>CONTRADICTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRADICTING_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRADICTING(1, "CONTRADICTING", "CONTRADICTING"),

	/**
	 * The '<em><b>NON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_VALUE
	 * @generated
	 * @ordered
	 */
	NON(2, "NON", "NON");

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 0;

	/**
	 * The '<em><b>CONTRADICTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRADICTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRADICTING_VALUE = 1;

	/**
	 * The '<em><b>NON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_VALUE = 2;

	/**
	 * An array of all the '<em><b>Change Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeStatus[] VALUES_ARRAY =
		new ChangeStatus[] {
			EQUIVALENT,
			CONTRADICTING,
			NON,
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
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case CONTRADICTING_VALUE: return CONTRADICTING;
			case NON_VALUE: return NON;
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
