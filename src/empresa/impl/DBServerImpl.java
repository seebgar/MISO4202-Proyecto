/**
 */
package empresa.impl;

import empresa.DBServer;
import empresa.DBSystem;
import empresa.EmpresaPackage;
import empresa.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.DBServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link empresa.impl.DBServerImpl#getSystemManager <em>System Manager</em>}</li>
 *   <li>{@link empresa.impl.DBServerImpl#getToken <em>Token</em>}</li>
 *   <li>{@link empresa.impl.DBServerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link empresa.impl.DBServerImpl#getRelatedCollections <em>Related Collections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBServerImpl extends MinimalEObjectImpl.Container implements DBServer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getSystemManager() <em>System Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemManager()
	 * @generated
	 * @ordered
	 */
	protected static final DBSystem SYSTEM_MANAGER_EDEFAULT = DBSystem.MONGODB;

	/**
	 * The cached value of the '{@link #getSystemManager() <em>System Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemManager()
	 * @generated
	 * @ordered
	 */
	protected DBSystem systemManager = SYSTEM_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedCollections() <em>Related Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> relatedCollections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.DB_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DB_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBSystem getSystemManager() {
		return systemManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemManager(DBSystem newSystemManager) {
		DBSystem oldSystemManager = systemManager;
		systemManager = newSystemManager == null ? SYSTEM_MANAGER_EDEFAULT : newSystemManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DB_SERVER__SYSTEM_MANAGER, oldSystemManager, systemManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DB_SERVER__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.DB_SERVER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getRelatedCollections() {
		if (relatedCollections == null) {
			relatedCollections = new EObjectContainmentEList<Entity>(Entity.class, this, EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS);
		}
		return relatedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS:
				return ((InternalEList<?>)getRelatedCollections()).basicRemove(otherEnd, msgs);
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
			case EmpresaPackage.DB_SERVER__NAME:
				return getName();
			case EmpresaPackage.DB_SERVER__SYSTEM_MANAGER:
				return getSystemManager();
			case EmpresaPackage.DB_SERVER__TOKEN:
				return getToken();
			case EmpresaPackage.DB_SERVER__PASSWORD:
				return getPassword();
			case EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS:
				return getRelatedCollections();
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
			case EmpresaPackage.DB_SERVER__NAME:
				setName((String)newValue);
				return;
			case EmpresaPackage.DB_SERVER__SYSTEM_MANAGER:
				setSystemManager((DBSystem)newValue);
				return;
			case EmpresaPackage.DB_SERVER__TOKEN:
				setToken((String)newValue);
				return;
			case EmpresaPackage.DB_SERVER__PASSWORD:
				setPassword((String)newValue);
				return;
			case EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS:
				getRelatedCollections().clear();
				getRelatedCollections().addAll((Collection<? extends Entity>)newValue);
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
			case EmpresaPackage.DB_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmpresaPackage.DB_SERVER__SYSTEM_MANAGER:
				setSystemManager(SYSTEM_MANAGER_EDEFAULT);
				return;
			case EmpresaPackage.DB_SERVER__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case EmpresaPackage.DB_SERVER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS:
				getRelatedCollections().clear();
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
			case EmpresaPackage.DB_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmpresaPackage.DB_SERVER__SYSTEM_MANAGER:
				return systemManager != SYSTEM_MANAGER_EDEFAULT;
			case EmpresaPackage.DB_SERVER__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case EmpresaPackage.DB_SERVER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EmpresaPackage.DB_SERVER__RELATED_COLLECTIONS:
				return relatedCollections != null && !relatedCollections.isEmpty();
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
		result.append(", systemManager: ");
		result.append(systemManager);
		result.append(", token: ");
		result.append(token);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //DBServerImpl
