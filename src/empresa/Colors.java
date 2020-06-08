/**
 */
package empresa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see empresa.EmpresaPackage#getColors()
 * @model
 * @generated
 */
public enum Colors implements Enumerator {
	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(0, "white", "#FFFFFF"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(1, "blue", "#0000FF"),

	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(2, "red", "#FF0000"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(3, "green", "#00FF00"),

	/**
	 * The '<em><b>Gray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(4, "gray", "#808080"),

	/**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(5, "yellow", "#FFFF00"),

	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(6, "black", "#000000"),

	/**
	 * The '<em><b>Cyan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(8, "cyan", "#00FFFF"),

	/**
	 * The '<em><b>Magenta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	MAGENTA(9, "magenta", "#FF00FF"),

	/**
	 * The '<em><b>Silver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILVER_VALUE
	 * @generated
	 * @ordered
	 */
	SILVER(10, "silver", "#C0C0C0"),

	/**
	 * The '<em><b>Maroon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAROON_VALUE
	 * @generated
	 * @ordered
	 */
	MAROON(11, "maroon", "#800000"),

	/**
	 * The '<em><b>Olive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OLIVE(12, "olive", "#808000"),

	/**
	 * The '<em><b>Purple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(13, "purple", "#800080"),

	/**
	 * The '<em><b>Teal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAL_VALUE
	 * @generated
	 * @ordered
	 */
	TEAL(14, "teal", "#008080"),

	/**
	 * The '<em><b>Navy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVY_VALUE
	 * @generated
	 * @ordered
	 */
	NAVY(15, "navy", "#000080");

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model name="white" literal="#FFFFFF"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 0;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model name="blue" literal="#0000FF"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 1;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="red" literal="#FF0000"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 2;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model name="green" literal="#00FF00"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 3;

	/**
	 * The '<em><b>Gray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model name="gray" literal="#808080"
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 4;

	/**
	 * The '<em><b>Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW
	 * @model name="yellow" literal="#FFFF00"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 5;

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model name="black" literal="#000000"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 6;

	/**
	 * The '<em><b>Cyan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN
	 * @model name="cyan" literal="#00FFFF"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 8;

	/**
	 * The '<em><b>Magenta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGENTA
	 * @model name="magenta" literal="#FF00FF"
	 * @generated
	 * @ordered
	 */
	public static final int MAGENTA_VALUE = 9;

	/**
	 * The '<em><b>Silver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILVER
	 * @model name="silver" literal="#C0C0C0"
	 * @generated
	 * @ordered
	 */
	public static final int SILVER_VALUE = 10;

	/**
	 * The '<em><b>Maroon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAROON
	 * @model name="maroon" literal="#800000"
	 * @generated
	 * @ordered
	 */
	public static final int MAROON_VALUE = 11;

	/**
	 * The '<em><b>Olive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLIVE
	 * @model name="olive" literal="#808000"
	 * @generated
	 * @ordered
	 */
	public static final int OLIVE_VALUE = 12;

	/**
	 * The '<em><b>Purple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model name="purple" literal="#800080"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 13;

	/**
	 * The '<em><b>Teal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAL
	 * @model name="teal" literal="#008080"
	 * @generated
	 * @ordered
	 */
	public static final int TEAL_VALUE = 14;

	/**
	 * The '<em><b>Navy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVY
	 * @model name="navy" literal="#000080"
	 * @generated
	 * @ordered
	 */
	public static final int NAVY_VALUE = 15;

	/**
	 * An array of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Colors[] VALUES_ARRAY =
		new Colors[] {
			WHITE,
			BLUE,
			RED,
			GREEN,
			GRAY,
			YELLOW,
			BLACK,
			CYAN,
			MAGENTA,
			SILVER,
			MAROON,
			OLIVE,
			PURPLE,
			TEAL,
			NAVY,
		};

	/**
	 * A public read-only list of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Colors> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Colors get(int value) {
		switch (value) {
			case WHITE_VALUE: return WHITE;
			case BLUE_VALUE: return BLUE;
			case RED_VALUE: return RED;
			case GREEN_VALUE: return GREEN;
			case GRAY_VALUE: return GRAY;
			case YELLOW_VALUE: return YELLOW;
			case BLACK_VALUE: return BLACK;
			case CYAN_VALUE: return CYAN;
			case MAGENTA_VALUE: return MAGENTA;
			case SILVER_VALUE: return SILVER;
			case MAROON_VALUE: return MAROON;
			case OLIVE_VALUE: return OLIVE;
			case PURPLE_VALUE: return PURPLE;
			case TEAL_VALUE: return TEAL;
			case NAVY_VALUE: return NAVY;
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
	private Colors(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Colors
