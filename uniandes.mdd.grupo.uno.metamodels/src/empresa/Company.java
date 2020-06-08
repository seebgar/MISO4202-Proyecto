/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Company#getDashboards <em>Dashboards</em>}</li>
 *   <li>{@link empresa.Company#getDBServers <em>DB Servers</em>}</li>
 *   <li>{@link empresa.Company#getNit <em>Nit</em>}</li>
 *   <li>{@link empresa.Company#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Dashboards</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Dashboard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dashboards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dashboards</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getCompany_Dashboards()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dashboard> getDashboards();

	/**
	 * Returns the value of the '<em><b>DB Servers</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.DBServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB Servers</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getCompany_DBServers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DBServer> getDBServers();

	/**
	 * Returns the value of the '<em><b>Nit</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nit</em>' attribute.
	 * @see #setNit(String)
	 * @see empresa.EmpresaPackage#getCompany_Nit()
	 * @model default=""
	 * @generated
	 */
	String getNit();

	/**
	 * Sets the value of the '{@link empresa.Company#getNit <em>Nit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nit</em>' attribute.
	 * @see #getNit()
	 * @generated
	 */
	void setNit(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see empresa.EmpresaPackage#getCompany_Name()
	 * @model default="" unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empresa.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Company
