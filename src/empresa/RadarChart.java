/**
 */
package empresa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radar Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.RadarChart#isAngleLinesDisplay <em>Angle Lines Display</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getRadarChart()
 * @model
 * @generated
 */
public interface RadarChart extends Graphic {
	/**
	 * Returns the value of the '<em><b>Angle Lines Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Lines Display</em>' attribute.
	 * @see #setAngleLinesDisplay(boolean)
	 * @see empresa.EmpresaPackage#getRadarChart_AngleLinesDisplay()
	 * @model
	 * @generated
	 */
	boolean isAngleLinesDisplay();

	/**
	 * Sets the value of the '{@link empresa.RadarChart#isAngleLinesDisplay <em>Angle Lines Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Lines Display</em>' attribute.
	 * @see #isAngleLinesDisplay()
	 * @generated
	 */
	void setAngleLinesDisplay(boolean value);

} // RadarChart
