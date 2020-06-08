/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Dashboard#getPanels <em>Panels</em>}</li>
 *   <li>{@link empresa.Dashboard#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Panel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panels</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getDashboard_Panels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Panel> getPanels();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see empresa.EmpresaPackage#getDashboard_Name()
	 * @model default="" unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empresa.Dashboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Dashboard
