/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Menu#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends Element {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getMenu_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Menu
