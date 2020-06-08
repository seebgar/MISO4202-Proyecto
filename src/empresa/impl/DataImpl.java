/**
 */
package empresa.impl;

import empresa.Attribute;
import empresa.Colors;
import empresa.Data;
import empresa.EmpresaPackage;
import empresa.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getData <em>Data</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getBorderDash <em>Border Dash</em>}</li>
 *   <li>{@link empresa.impl.DataImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> data;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors BORDER_COLOR_EDEFAULT = Colors.WHITE;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected Colors borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors BACKGROUND_COLOR_EDEFAULT = Colors.WHITE;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Colors backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderDash() <em>Border Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderDash()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_DASH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderDash() <em>Border Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderDash()
	 * @generated
	 * @ordered
	 */
	protected int borderDash = BORDER_DASH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Entity>(Entity.class, this, EmpresaPackage.DATA__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(Colors newBorderColor) {
		Colors oldBorderColor = borderColor;
		borderColor = newBorderColor == null ? BORDER_COLOR_EDEFAULT : newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colors getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(Colors newBackgroundColor) {
		Colors oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBorderDash() {
		return borderDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderDash(int newBorderDash) {
		int oldBorderDash = borderDash;
		borderDash = newBorderDash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__BORDER_DASH, oldBorderDash, borderDash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmpresaPackage.DATA__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DATA__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpresaPackage.DATA__NAME:
				return getName();
			case EmpresaPackage.DATA__CATEGORY:
				return getCategory();
			case EmpresaPackage.DATA__DATA:
				return getData();
			case EmpresaPackage.DATA__BORDER_COLOR:
				return getBorderColor();
			case EmpresaPackage.DATA__BACKGROUND_COLOR:
				return getBackgroundColor();
			case EmpresaPackage.DATA__FILL:
				return isFill();
			case EmpresaPackage.DATA__BORDER_DASH:
				return getBorderDash();
			case EmpresaPackage.DATA__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmpresaPackage.DATA__NAME:
				setName((String)newValue);
				return;
			case EmpresaPackage.DATA__CATEGORY:
				setCategory((String)newValue);
				return;
			case EmpresaPackage.DATA__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Entity>)newValue);
				return;
			case EmpresaPackage.DATA__BORDER_COLOR:
				setBorderColor((Colors)newValue);
				return;
			case EmpresaPackage.DATA__BACKGROUND_COLOR:
				setBackgroundColor((Colors)newValue);
				return;
			case EmpresaPackage.DATA__FILL:
				setFill((Boolean)newValue);
				return;
			case EmpresaPackage.DATA__BORDER_DASH:
				setBorderDash((Integer)newValue);
				return;
			case EmpresaPackage.DATA__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmpresaPackage.DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmpresaPackage.DATA__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case EmpresaPackage.DATA__DATA:
				getData().clear();
				return;
			case EmpresaPackage.DATA__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case EmpresaPackage.DATA__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case EmpresaPackage.DATA__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case EmpresaPackage.DATA__BORDER_DASH:
				setBorderDash(BORDER_DASH_EDEFAULT);
				return;
			case EmpresaPackage.DATA__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmpresaPackage.DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmpresaPackage.DATA__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case EmpresaPackage.DATA__DATA:
				return data != null && !data.isEmpty();
			case EmpresaPackage.DATA__BORDER_COLOR:
				return borderColor != BORDER_COLOR_EDEFAULT;
			case EmpresaPackage.DATA__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case EmpresaPackage.DATA__FILL:
				return fill != FILL_EDEFAULT;
			case EmpresaPackage.DATA__BORDER_DASH:
				return borderDash != BORDER_DASH_EDEFAULT;
			case EmpresaPackage.DATA__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", category: ");
		result.append(category);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", fill: ");
		result.append(fill);
		result.append(", borderDash: ");
		result.append(borderDash);
		result.append(')');
		return result.toString();
	}

} //DataImpl
