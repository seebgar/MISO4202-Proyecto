/**
 */
package empresa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empresa.Data#getName <em>Name</em>}</li>
 *   <li>{@link empresa.Data#getCategory <em>Category</em>}</li>
 *   <li>{@link empresa.Data#getData <em>Data</em>}</li>
 *   <li>{@link empresa.Data#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link empresa.Data#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link empresa.Data#isFill <em>Fill</em>}</li>
 *   <li>{@link empresa.Data#getBorderDash <em>Border Dash</em>}</li>
 *   <li>{@link empresa.Data#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see empresa.EmpresaPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see empresa.EmpresaPackage#getData_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empresa.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see empresa.EmpresaPackage#getData_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link empresa.Data#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link empresa.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see empresa.EmpresaPackage#getData_Data()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getData();

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * The literals are from the enumeration {@link empresa.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see empresa.Colors
	 * @see #setBorderColor(Colors)
	 * @see empresa.EmpresaPackage#getData_BorderColor()
	 * @model
	 * @generated
	 */
	Colors getBorderColor();

	/**
	 * Sets the value of the '{@link empresa.Data#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see empresa.Colors
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(Colors value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link empresa.Colors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see empresa.Colors
	 * @see #setBackgroundColor(Colors)
	 * @see empresa.EmpresaPackage#getData_BackgroundColor()
	 * @model
	 * @generated
	 */
	Colors getBackgroundColor();

	/**
	 * Sets the value of the '{@link empresa.Data#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see empresa.Colors
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Colors value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see empresa.EmpresaPackage#getData_Fill()
	 * @model
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link empresa.Data#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Border Dash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Dash</em>' attribute.
	 * @see #setBorderDash(int)
	 * @see empresa.EmpresaPackage#getData_BorderDash()
	 * @model
	 * @generated
	 */
	int getBorderDash();

	/**
	 * Sets the value of the '{@link empresa.Data#getBorderDash <em>Border Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Dash</em>' attribute.
	 * @see #getBorderDash()
	 * @generated
	 */
	void setBorderDash(int value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see empresa.EmpresaPackage#getData_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link empresa.Data#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // Data
