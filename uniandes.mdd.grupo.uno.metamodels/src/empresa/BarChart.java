/**
 */
package empresa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.BarChart#getBarPercentage <em>Bar Percentage</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getBarChart()
 * @model
 * @generated
 */
public interface BarChart extends Graphic2D {
	/**
	 * Returns the value of the '<em><b>Bar Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Percentage</em>' attribute.
	 * @see #setBarPercentage(float)
	 * @see empresa.EmpresaPackage#getBarChart_BarPercentage()
	 * @model
	 * @generated
	 */
	float getBarPercentage();

	/**
	 * Sets the value of the '{@link empresa.BarChart#getBarPercentage <em>Bar Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Percentage</em>' attribute.
	 * @see #getBarPercentage()
	 * @generated
	 */
	void setBarPercentage(float value);

} // BarChart
