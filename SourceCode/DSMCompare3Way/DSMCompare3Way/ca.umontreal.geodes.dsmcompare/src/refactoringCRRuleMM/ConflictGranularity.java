/**
 */
package refactoringCRRuleMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conflict Granularity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see refactoringCRRuleMM.RefactoringCRRuleMMPackage#getConflictGranularity()
 * @model
 * @generated
 */
public enum ConflictGranularity implements Enumerator {
	/**
	 * The '<em><b>NIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIL_VALUE
	 * @generated
	 * @ordered
	 */
	NIL(0, "NIL", "NIL"),

	/**
	 * The '<em><b>Semantic Semantic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTIC_SEMANTIC_VALUE
	 * @generated
	 * @ordered
	 */
	SEMANTIC_SEMANTIC(1, "Semantic_Semantic", "Semantic_Semantic"),

	/**
	 * The '<em><b>Semantic Fine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTIC_FINE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMANTIC_FINE(2, "Semantic_Fine", "Semantic_Fine"),

	/**
	 * The '<em><b>Fine Fine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINE_FINE_VALUE
	 * @generated
	 * @ordered
	 */
	FINE_FINE(3, "Fine_Fine", "Fine_Fine");

	/**
	 * The '<em><b>NIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIL_VALUE = 0;

	/**
	 * The '<em><b>Semantic Semantic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTIC_SEMANTIC
	 * @model name="Semantic_Semantic"
	 * @generated
	 * @ordered
	 */
	public static final int SEMANTIC_SEMANTIC_VALUE = 1;

	/**
	 * The '<em><b>Semantic Fine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTIC_FINE
	 * @model name="Semantic_Fine"
	 * @generated
	 * @ordered
	 */
	public static final int SEMANTIC_FINE_VALUE = 2;

	/**
	 * The '<em><b>Fine Fine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINE_FINE
	 * @model name="Fine_Fine"
	 * @generated
	 * @ordered
	 */
	public static final int FINE_FINE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Conflict Granularity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConflictGranularity[] VALUES_ARRAY =
		new ConflictGranularity[] {
			NIL,
			SEMANTIC_SEMANTIC,
			SEMANTIC_FINE,
			FINE_FINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Conflict Granularity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConflictGranularity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conflict Granularity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictGranularity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConflictGranularity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conflict Granularity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictGranularity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConflictGranularity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conflict Granularity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictGranularity get(int value) {
		switch (value) {
			case NIL_VALUE: return NIL;
			case SEMANTIC_SEMANTIC_VALUE: return SEMANTIC_SEMANTIC;
			case SEMANTIC_FINE_VALUE: return SEMANTIC_FINE;
			case FINE_FINE_VALUE: return FINE_FINE;
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
	private ConflictGranularity(int value, String name, String literal) {
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
	
} //ConflictGranularity
