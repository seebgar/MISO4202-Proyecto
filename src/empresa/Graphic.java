/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Graphic#getData <em>Data</em>}</li>
 *   <li>{@link empresa.Graphic#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link empresa.Graphic#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getGraphic()
 * @model abstract="true"
 * @generated
 */
public interface Graphic extends Element {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getGraphic_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Legend Position</b></em>' attribute.
	 * The default value is <code>"bottom"</code>.
	 * The literals are from the enumeration {@link empresa.PositionOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Position</em>' attribute.
	 * @see empresa.PositionOptions
	 * @see #setLegendPosition(PositionOptions)
	 * @see empresa.EmpresaPackage#getGraphic_LegendPosition()
	 * @model default="bottom"
	 * @generated
	 */
	PositionOptions getLegendPosition();

	/**
	 * Sets the value of the '{@link empresa.Graphic#getLegendPosition <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Position</em>' attribute.
	 * @see empresa.PositionOptions
	 * @see #getLegendPosition()
	 * @generated
	 */
	void setLegendPosition(PositionOptions value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getGraphic_Labels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Label> getLabels();

} // Graphic
