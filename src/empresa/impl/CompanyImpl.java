/**
 */
package empresa.impl;

import empresa.Company;
import empresa.DBServer;
import empresa.Dashboard;
import empresa.EmpresaPackage;

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
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.CompanyImpl#getDashboards <em>Dashboards</em>}</li>
 *   <li>{@link empresa.impl.CompanyImpl#getDBServers <em>DB Servers</em>}</li>
 *   <li>{@link empresa.impl.CompanyImpl#getNit <em>Nit</em>}</li>
 *   <li>{@link empresa.impl.CompanyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends MinimalEObjectImpl.Container implements Company {
	/**
	 * The cached value of the '{@link #getDashboards() <em>Dashboards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashboards()
	 * @generated
	 * @ordered
	 */
	protected EList<Dashboard> dashboards;

	/**
	 * The cached value of the '{@link #getDBServers() <em>DB Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBServers()
	 * @generated
	 * @ordered
	 */
	protected EList<DBServer> dbServers;

	/**
	 * The default value of the '{@link #getNit() <em>Nit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNit()
	 * @generated
	 * @ordered
	 */
	protected static final String NIT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNit() <em>Nit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNit()
	 * @generated
	 * @ordered
	 */
	protected String nit = NIT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dashboard> getDashboards() {
		if (dashboards == null) {
			dashboards = new EObjectContainmentEList<Dashboard>(Dashboard.class, this, EmpresaPackage.COMPANY__DASHBOARDS);
		}
		return dashboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DBServer> getDBServers() {
		if (dbServers == null) {
			dbServers = new EObjectContainmentEList<DBServer>(DBServer.class, this, EmpresaPackage.COMPANY__DB_SERVERS);
		}
		return dbServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNit() {
		return nit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNit(String newNit) {
		String oldNit = nit;
		nit = newNit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.COMPANY__NIT, oldNit, nit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.COMPANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmpresaPackage.COMPANY__DASHBOARDS:
				return ((InternalEList<?>)getDashboards()).basicRemove(otherEnd, msgs);
			case EmpresaPackage.COMPANY__DB_SERVERS:
				return ((InternalEList<?>)getDBServers()).basicRemove(otherEnd, msgs);
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
			case EmpresaPackage.COMPANY__DASHBOARDS:
				return getDashboards();
			case EmpresaPackage.COMPANY__DB_SERVERS:
				return getDBServers();
			case EmpresaPackage.COMPANY__NIT:
				return getNit();
			case EmpresaPackage.COMPANY__NAME:
				return getName();
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
			case EmpresaPackage.COMPANY__DASHBOARDS:
				getDashboards().clear();
				getDashboards().addAll((Collection<? extends Dashboard>)newValue);
				return;
			case EmpresaPackage.COMPANY__DB_SERVERS:
				getDBServers().clear();
				getDBServers().addAll((Collection<? extends DBServer>)newValue);
				return;
			case EmpresaPackage.COMPANY__NIT:
				setNit((String)newValue);
				return;
			case EmpresaPackage.COMPANY__NAME:
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
			case EmpresaPackage.COMPANY__DASHBOARDS:
				getDashboards().clear();
				return;
			case EmpresaPackage.COMPANY__DB_SERVERS:
				getDBServers().clear();
				return;
			case EmpresaPackage.COMPANY__NIT:
				setNit(NIT_EDEFAULT);
				return;
			case EmpresaPackage.COMPANY__NAME:
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
			case EmpresaPackage.COMPANY__DASHBOARDS:
				return dashboards != null && !dashboards.isEmpty();
			case EmpresaPackage.COMPANY__DB_SERVERS:
				return dbServers != null && !dbServers.isEmpty();
			case EmpresaPackage.COMPANY__NIT:
				return NIT_EDEFAULT == null ? nit != null : !NIT_EDEFAULT.equals(nit);
			case EmpresaPackage.COMPANY__NAME:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nit: ");
		result.append(nit);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
