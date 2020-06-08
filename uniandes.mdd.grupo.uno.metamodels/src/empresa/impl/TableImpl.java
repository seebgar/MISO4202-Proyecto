/**
 */
package empresa.impl;

import empresa.Action;
import empresa.Column;
import empresa.EmpresaPackage;
import empresa.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.TableImpl#getRegistersPerPage <em>Registers Per Page</em>}</li>
 *   <li>{@link empresa.impl.TableImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link empresa.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link empresa.impl.TableImpl#isSearch <em>Search</em>}</li>
 *   <li>{@link empresa.impl.TableImpl#isAdd <em>Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends ElementImpl implements Table {
	/**
	 * The default value of the '{@link #getRegistersPerPage() <em>Registers Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistersPerPage()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTERS_PER_PAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistersPerPage() <em>Registers Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistersPerPage()
	 * @generated
	 * @ordered
	 */
	protected int registersPerPage = REGISTERS_PER_PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected Action actions;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The default value of the '{@link #isSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean search = SEARCH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistersPerPage() {
		return registersPerPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistersPerPage(int newRegistersPerPage) {
		int oldRegistersPerPage = registersPerPage;
		registersPerPage = newRegistersPerPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.TABLE__REGISTERS_PER_PAGE, oldRegistersPerPage, registersPerPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(Action newActions, NotificationChain msgs) {
		Action oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmpresaPackage.TABLE__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(Action newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmpresaPackage.TABLE__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmpresaPackage.TABLE__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.TABLE__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, EmpresaPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(boolean newSearch) {
		boolean oldSearch = search;
		search = newSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.TABLE__SEARCH, oldSearch, search));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.TABLE__ADD, oldAdd, add));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmpresaPackage.TABLE__ACTIONS:
				return basicSetActions(null, msgs);
			case EmpresaPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpresaPackage.TABLE__REGISTERS_PER_PAGE:
				return getRegistersPerPage();
			case EmpresaPackage.TABLE__ACTIONS:
				return getActions();
			case EmpresaPackage.TABLE__COLUMNS:
				return getColumns();
			case EmpresaPackage.TABLE__SEARCH:
				return isSearch();
			case EmpresaPackage.TABLE__ADD:
				return isAdd();
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
			case EmpresaPackage.TABLE__REGISTERS_PER_PAGE:
				setRegistersPerPage((Integer)newValue);
				return;
			case EmpresaPackage.TABLE__ACTIONS:
				setActions((Action)newValue);
				return;
			case EmpresaPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case EmpresaPackage.TABLE__SEARCH:
				setSearch((Boolean)newValue);
				return;
			case EmpresaPackage.TABLE__ADD:
				setAdd((Boolean)newValue);
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
			case EmpresaPackage.TABLE__REGISTERS_PER_PAGE:
				setRegistersPerPage(REGISTERS_PER_PAGE_EDEFAULT);
				return;
			case EmpresaPackage.TABLE__ACTIONS:
				setActions((Action)null);
				return;
			case EmpresaPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case EmpresaPackage.TABLE__SEARCH:
				setSearch(SEARCH_EDEFAULT);
				return;
			case EmpresaPackage.TABLE__ADD:
				setAdd(ADD_EDEFAULT);
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
			case EmpresaPackage.TABLE__REGISTERS_PER_PAGE:
				return registersPerPage != REGISTERS_PER_PAGE_EDEFAULT;
			case EmpresaPackage.TABLE__ACTIONS:
				return actions != null;
			case EmpresaPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case EmpresaPackage.TABLE__SEARCH:
				return search != SEARCH_EDEFAULT;
			case EmpresaPackage.TABLE__ADD:
				return add != ADD_EDEFAULT;
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
		result.append(" (registersPerPage: ");
		result.append(registersPerPage);
		result.append(", search: ");
		result.append(search);
		result.append(", add: ");
		result.append(add);
		result.append(')');
		return result.toString();
	}

} //TableImpl
