/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Table#getRegistersPerPage <em>Registers Per Page</em>}</li>
 *   <li>{@link empresa.Table#getActions <em>Actions</em>}</li>
 *   <li>{@link empresa.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link empresa.Table#isSearch <em>Search</em>}</li>
 *   <li>{@link empresa.Table#isAdd <em>Add</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Element {
	/**
	 * Returns the value of the '<em><b>Registers Per Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers Per Page</em>' attribute.
	 * @see #setRegistersPerPage(int)
	 * @see empresa.EmpresaPackage#getTable_RegistersPerPage()
	 * @model
	 * @generated
	 */
	int getRegistersPerPage();

	/**
	 * Sets the value of the '{@link empresa.Table#getRegistersPerPage <em>Registers Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registers Per Page</em>' attribute.
	 * @see #getRegistersPerPage()
	 * @generated
	 */
	void setRegistersPerPage(int value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Action)
	 * @see empresa.EmpresaPackage#getTable_Actions()
	 * @model containment="true"
	 * @generated
	 */
	Action getActions();

	/**
	 * Sets the value of the '{@link empresa.Table#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Action value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link empresa.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see empresa.EmpresaPackage#getTable_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' attribute.
	 * @see #setSearch(boolean)
	 * @see empresa.EmpresaPackage#getTable_Search()
	 * @model
	 * @generated
	 */
	boolean isSearch();

	/**
	 * Sets the value of the '{@link empresa.Table#isSearch <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' attribute.
	 * @see #isSearch()
	 * @generated
	 */
	void setSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' attribute.
	 * @see #setAdd(boolean)
	 * @see empresa.EmpresaPackage#getTable_Add()
	 * @model
	 * @generated
	 */
	boolean isAdd();

	/**
	 * Sets the value of the '{@link empresa.Table#isAdd <em>Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' attribute.
	 * @see #isAdd()
	 * @generated
	 */
	void setAdd(boolean value);

} // Table
