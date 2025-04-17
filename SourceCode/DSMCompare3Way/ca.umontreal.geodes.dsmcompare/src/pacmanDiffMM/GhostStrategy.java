/**
 */
package pacmanDiffMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ghost Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pacmanDiffMM.PacmanDiffMMPackage#getGhostStrategy()
 * @model
 * @generated
 */
public enum GhostStrategy implements Enumerator {
	/**
	 * The '<em><b>Blinky</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLINKY_VALUE
	 * @generated
	 * @ordered
	 */
	BLINKY(0, "Blinky", "Blinky"),

	/**
	 * The '<em><b>Pinky</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINKY_VALUE
	 * @generated
	 * @ordered
	 */
	PINKY(1, "Pinky", "Pinky"),

	/**
	 * The '<em><b>Inky</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INKY_VALUE
	 * @generated
	 * @ordered
	 */
	INKY(2, "Inky", "Inky"),

	/**
	 * The '<em><b>Clyde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLYDE_VALUE
	 * @generated
	 * @ordered
	 */
	CLYDE(3, "Clyde", "Clyde");

	/**
	 * The '<em><b>Blinky</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLINKY
	 * @model name="Blinky"
	 * @generated
	 * @ordered
	 */
	public static final int BLINKY_VALUE = 0;

	/**
	 * The '<em><b>Pinky</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINKY
	 * @model name="Pinky"
	 * @generated
	 * @ordered
	 */
	public static final int PINKY_VALUE = 1;

	/**
	 * The '<em><b>Inky</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INKY
	 * @model name="Inky"
	 * @generated
	 * @ordered
	 */
	public static final int INKY_VALUE = 2;

	/**
	 * The '<em><b>Clyde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLYDE
	 * @model name="Clyde"
	 * @generated
	 * @ordered
	 */
	public static final int CLYDE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ghost Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GhostStrategy[] VALUES_ARRAY =
		new GhostStrategy[] {
			BLINKY,
			PINKY,
			INKY,
			CLYDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ghost Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GhostStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ghost Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GhostStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ghost Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GhostStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ghost Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GhostStrategy get(int value) {
		switch (value) {
			case BLINKY_VALUE: return BLINKY;
			case PINKY_VALUE: return PINKY;
			case INKY_VALUE: return INKY;
			case CLYDE_VALUE: return CLYDE;
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
	private GhostStrategy(int value, String name, String literal) {
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
	
} //GhostStrategy
