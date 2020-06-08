/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.DBServer#getName <em>Name</em>}</li>
 *   <li>{@link empresa.DBServer#getSystemManager <em>System Manager</em>}</li>
 *   <li>{@link empresa.DBServer#getToken <em>Token</em>}</li>
 *   <li>{@link empresa.DBServer#getPassword <em>Password</em>}</li>
 *   <li>{@link empresa.DBServer#getRelatedCollections <em>Related Collections</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getDBServer()
 * @model
 * @generated
 */
public interface DBServer extends EObject {
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
	 * @see empresa.EmpresaPackage#getDBServer_Name()
	 * @model default="" unique="false" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empresa.DBServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Manager</b></em>' attribute.
	 * The default value is <code>"MONGODB"</code>.
	 * The literals are from the enumeration {@link empresa.DBSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Manager</em>' attribute.
	 * @see empresa.DBSystem
	 * @see #setSystemManager(DBSystem)
	 * @see empresa.EmpresaPackage#getDBServer_SystemManager()
	 * @model default="MONGODB" unique="false"
	 * @generated
	 */
	DBSystem getSystemManager();

	/**
	 * Sets the value of the '{@link empresa.DBServer#getSystemManager <em>System Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Manager</em>' attribute.
	 * @see empresa.DBSystem
	 * @see #getSystemManager()
	 * @generated
	 */
	void setSystemManager(DBSystem value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see empresa.EmpresaPackage#getDBServer_Token()
	 * @model default=""
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link empresa.DBServer#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see empresa.EmpresaPackage#getDBServer_Password()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link empresa.DBServer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Related Collections</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Collections</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getDBServer_RelatedCollections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Collection> getRelatedCollections();

} // DBServer
