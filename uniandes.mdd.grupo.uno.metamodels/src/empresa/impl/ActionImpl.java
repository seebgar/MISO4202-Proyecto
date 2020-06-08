/**
 */
package empresa.impl;

import empresa.Action;
import empresa.EmpresaPackage;
import empresa.PositionOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.ActionImpl#getColumnTitle <em>Column Title</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#isAdd <em>Add</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#isEdit <em>Edit</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link empresa.impl.ActionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getColumnTitle() <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnTitle() <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTitle()
	 * @generated
	 * @ordered
	 */
	protected String columnTitle = COLUMN_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdd() <em>Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdd() <em>Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean add = ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEdit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEdit()
	 * @generated
	 * @ordered
	 */
	protected boolean edit = EDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionOptions POSITION_EDEFAULT = PositionOptions.LEFT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionOptions position = POSITION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnTitle() {
		return columnTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnTitle(String newColumnTitle) {
		String oldColumnTitle = columnTitle;
		columnTitle = newColumnTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__COLUMN_TITLE, oldColumnTitle, columnTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(boolean newAdd) {
		boolean oldAdd = add;
		add = newAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__ADD, oldAdd, add));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(boolean newFilter) {
		boolean oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEdit() {
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit(boolean newEdit) {
		boolean oldEdit = edit;
		edit = newEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__EDIT, oldEdit, edit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(boolean newDelete) {
		boolean oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOptions getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionOptions newPosition) {
		PositionOptions oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpresaPackage.ACTION__COLUMN_TITLE:
				return getColumnTitle();
			case EmpresaPackage.ACTION__ADD:
				return isAdd();
			case EmpresaPackage.ACTION__FILTER:
				return isFilter();
			case EmpresaPackage.ACTION__EDIT:
				return isEdit();
			case EmpresaPackage.ACTION__DELETE:
				return isDelete();
			case EmpresaPackage.ACTION__POSITION:
				return getPosition();
			case EmpresaPackage.ACTION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmpresaPackage.ACTION__COLUMN_TITLE:
				setColumnTitle((String)newValue);
				return;
			case EmpresaPackage.ACTION__ADD:
				setAdd((Boolean)newValue);
				return;
			case EmpresaPackage.ACTION__FILTER:
				setFilter((Boolean)newValue);
				return;
			case EmpresaPackage.ACTION__EDIT:
				setEdit((Boolean)newValue);
				return;
			case EmpresaPackage.ACTION__DELETE:
				setDelete((Boolean)newValue);
				return;
			case EmpresaPackage.ACTION__POSITION:
				setPosition((PositionOptions)newValue);
				return;
			case EmpresaPackage.ACTION__NAME:
				setName((String)newValue);
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
			case EmpresaPackage.ACTION__COLUMN_TITLE:
				setColumnTitle(COLUMN_TITLE_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__ADD:
				setAdd(ADD_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__EDIT:
				setEdit(EDIT_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case EmpresaPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
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
			case EmpresaPackage.ACTION__COLUMN_TITLE:
				return COLUMN_TITLE_EDEFAULT == null ? columnTitle != null : !COLUMN_TITLE_EDEFAULT.equals(columnTitle);
			case EmpresaPackage.ACTION__ADD:
				return add != ADD_EDEFAULT;
			case EmpresaPackage.ACTION__FILTER:
				return filter != FILTER_EDEFAULT;
			case EmpresaPackage.ACTION__EDIT:
				return edit != EDIT_EDEFAULT;
			case EmpresaPackage.ACTION__DELETE:
				return delete != DELETE_EDEFAULT;
			case EmpresaPackage.ACTION__POSITION:
				return position != POSITION_EDEFAULT;
			case EmpresaPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnTitle: ");
		result.append(columnTitle);
		result.append(", add: ");
		result.append(add);
		result.append(", filter: ");
		result.append(filter);
		result.append(", edit: ");
		result.append(edit);
		result.append(", delete: ");
		result.append(delete);
		result.append(", position: ");
		result.append(position);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
