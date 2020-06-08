/**
 */
package empresa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Action#getColumnTitle <em>Column Title</em>}</li>
 *   <li>{@link empresa.Action#isAdd <em>Add</em>}</li>
 *   <li>{@link empresa.Action#isFilter <em>Filter</em>}</li>
 *   <li>{@link empresa.Action#isEdit <em>Edit</em>}</li>
 *   <li>{@link empresa.Action#isDelete <em>Delete</em>}</li>
 *   <li>{@link empresa.Action#getPosition <em>Position</em>}</li>
 *   <li>{@link empresa.Action#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Title</em>' attribute.
	 * @see #setColumnTitle(String)
	 * @see empresa.EmpresaPackage#getAction_ColumnTitle()
	 * @model
	 * @generated
	 */
	String getColumnTitle();

	/**
	 * Sets the value of the '{@link empresa.Action#getColumnTitle <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Title</em>' attribute.
	 * @see #getColumnTitle()
	 * @generated
	 */
	void setColumnTitle(String value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' attribute.
	 * @see #setAdd(boolean)
	 * @see empresa.EmpresaPackage#getAction_Add()
	 * @model
	 * @generated
	 */
	boolean isAdd();

	/**
	 * Sets the value of the '{@link empresa.Action#isAdd <em>Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' attribute.
	 * @see #isAdd()
	 * @generated
	 */
	void setAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see empresa.EmpresaPackage#getAction_Filter()
	 * @model
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link empresa.Action#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit</em>' attribute.
	 * @see #setEdit(boolean)
	 * @see empresa.EmpresaPackage#getAction_Edit()
	 * @model
	 * @generated
	 */
	boolean isEdit();

	/**
	 * Sets the value of the '{@link empresa.Action#isEdit <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit</em>' attribute.
	 * @see #isEdit()
	 * @generated
	 */
	void setEdit(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see #setDelete(boolean)
	 * @see empresa.EmpresaPackage#getAction_Delete()
	 * @model
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link empresa.Action#isDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see #isDelete()
	 * @generated
	 */
	void setDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link empresa.PositionOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see empresa.PositionOptions
	 * @see #setPosition(PositionOptions)
	 * @see empresa.EmpresaPackage#getAction_Position()
	 * @model
	 * @generated
	 */
	PositionOptions getPosition();

	/**
	 * Sets the value of the '{@link empresa.Action#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see empresa.PositionOptions
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionOptions value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see empresa.EmpresaPackage#getAction_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empresa.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Action
