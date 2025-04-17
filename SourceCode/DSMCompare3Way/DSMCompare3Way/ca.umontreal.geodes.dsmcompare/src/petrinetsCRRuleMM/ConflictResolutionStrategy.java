/**
 */
package petrinetsCRRuleMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conflict Resolution Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getConflictResolutionStrategy()
 * @model
 * @generated
 */
public enum ConflictResolutionStrategy implements Enumerator {
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
	 * The '<em><b>Keep Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_LEFT(1, "Keep_Left", "Keep_Left"),

	/**
	 * The '<em><b>Keep Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_RIGHT(2, "Keep_Right", "Keep_Right"),

	/**
	 * The '<em><b>Keep Semantic Difference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_SEMANTIC_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP_SEMANTIC_DIFFERENCE(3, "Keep_Semantic_Difference", "Keep_Semantic_Difference"),

	/**
	 * The '<em><b>Apply None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY_NONE(4, "Apply_None", "Apply_None"),

	/**
	 * The '<em><b>Apply Left Then Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_LEFT_THEN_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY_LEFT_THEN_RIGHT(5, "Apply_Left_Then_Right", "Apply_Left_Then_Right"),

	/**
	 * The '<em><b>Apply Right Then Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_RIGHT_THEN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY_RIGHT_THEN_LEFT(6, "Apply_Right_Then_Left", "Apply_Right_Then_Left"),

	/**
	 * The '<em><b>Apply AUser Defined Resolution Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_AUSER_DEFINED_RESOLUTION_PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	APPLY_AUSER_DEFINED_RESOLUTION_PATTERN(7, "Apply_A_User_Defined_Resolution_Pattern", "Apply_A_User_Defined_Resolution_Pattern"),

	/**
	 * The '<em><b>Custom Change At Time Of Merge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_CHANGE_AT_TIME_OF_MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_CHANGE_AT_TIME_OF_MERGE(8, "Custom_Change_At_Time_Of_Merge", "Custom_Change_At_Time_Of_Merge"),

	/**
	 * The '<em><b>Suggest AResolution Needing Approval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGGEST_ARESOLUTION_NEEDING_APPROVAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUGGEST_ARESOLUTION_NEEDING_APPROVAL(9, "Suggest_A_Resolution_Needing_Approval", "Suggest_A_Resolution_Needing_Approval");

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
	 * The '<em><b>Keep Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_LEFT
	 * @model name="Keep_Left"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Keep Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_RIGHT
	 * @model name="Keep_Right"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Keep Semantic Difference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_SEMANTIC_DIFFERENCE
	 * @model name="Keep_Semantic_Difference"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_SEMANTIC_DIFFERENCE_VALUE = 3;

	/**
	 * The '<em><b>Apply None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_NONE
	 * @model name="Apply_None"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_NONE_VALUE = 4;

	/**
	 * The '<em><b>Apply Left Then Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_LEFT_THEN_RIGHT
	 * @model name="Apply_Left_Then_Right"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_LEFT_THEN_RIGHT_VALUE = 5;

	/**
	 * The '<em><b>Apply Right Then Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_RIGHT_THEN_LEFT
	 * @model name="Apply_Right_Then_Left"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_RIGHT_THEN_LEFT_VALUE = 6;

	/**
	 * The '<em><b>Apply AUser Defined Resolution Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLY_AUSER_DEFINED_RESOLUTION_PATTERN
	 * @model name="Apply_A_User_Defined_Resolution_Pattern"
	 * @generated
	 * @ordered
	 */
	public static final int APPLY_AUSER_DEFINED_RESOLUTION_PATTERN_VALUE = 7;

	/**
	 * The '<em><b>Custom Change At Time Of Merge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_CHANGE_AT_TIME_OF_MERGE
	 * @model name="Custom_Change_At_Time_Of_Merge"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_CHANGE_AT_TIME_OF_MERGE_VALUE = 8;

	/**
	 * The '<em><b>Suggest AResolution Needing Approval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGGEST_ARESOLUTION_NEEDING_APPROVAL
	 * @model name="Suggest_A_Resolution_Needing_Approval"
	 * @generated
	 * @ordered
	 */
	public static final int SUGGEST_ARESOLUTION_NEEDING_APPROVAL_VALUE = 9;

	/**
	 * An array of all the '<em><b>Conflict Resolution Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConflictResolutionStrategy[] VALUES_ARRAY =
		new ConflictResolutionStrategy[] {
			NIL,
			KEEP_LEFT,
			KEEP_RIGHT,
			KEEP_SEMANTIC_DIFFERENCE,
			APPLY_NONE,
			APPLY_LEFT_THEN_RIGHT,
			APPLY_RIGHT_THEN_LEFT,
			APPLY_AUSER_DEFINED_RESOLUTION_PATTERN,
			CUSTOM_CHANGE_AT_TIME_OF_MERGE,
			SUGGEST_ARESOLUTION_NEEDING_APPROVAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Conflict Resolution Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConflictResolutionStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conflict Resolution Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictResolutionStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConflictResolutionStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conflict Resolution Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictResolutionStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConflictResolutionStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conflict Resolution Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConflictResolutionStrategy get(int value) {
		switch (value) {
			case NIL_VALUE: return NIL;
			case KEEP_LEFT_VALUE: return KEEP_LEFT;
			case KEEP_RIGHT_VALUE: return KEEP_RIGHT;
			case KEEP_SEMANTIC_DIFFERENCE_VALUE: return KEEP_SEMANTIC_DIFFERENCE;
			case APPLY_NONE_VALUE: return APPLY_NONE;
			case APPLY_LEFT_THEN_RIGHT_VALUE: return APPLY_LEFT_THEN_RIGHT;
			case APPLY_RIGHT_THEN_LEFT_VALUE: return APPLY_RIGHT_THEN_LEFT;
			case APPLY_AUSER_DEFINED_RESOLUTION_PATTERN_VALUE: return APPLY_AUSER_DEFINED_RESOLUTION_PATTERN;
			case CUSTOM_CHANGE_AT_TIME_OF_MERGE_VALUE: return CUSTOM_CHANGE_AT_TIME_OF_MERGE;
			case SUGGEST_ARESOLUTION_NEEDING_APPROVAL_VALUE: return SUGGEST_ARESOLUTION_NEEDING_APPROVAL;
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
	private ConflictResolutionStrategy(int value, String name, String literal) {
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
	
} //ConflictResolutionStrategy
