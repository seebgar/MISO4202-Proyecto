/**
 */
package empresa.impl;

import empresa.Data;
import empresa.EmpresaPackage;
import empresa.Graphic;
import empresa.Label;
import empresa.PositionOptions;

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
 * An implementation of the model object '<em><b>Graphic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.GraphicImpl#getData <em>Data</em>}</li>
 *   <li>{@link empresa.impl.GraphicImpl#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link empresa.impl.GraphicImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphicImpl extends ElementImpl implements Graphic {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The default value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PositionOptions LEGEND_POSITION_EDEFAULT = PositionOptions.BOTTOM;

	/**
	 * The cached value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionOptions legendPosition = LEGEND_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.GRAPHIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, EmpresaPackage.GRAPHIC__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionOptions getLegendPosition() {
		return legendPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegendPosition(PositionOptions newLegendPosition) {
		PositionOptions oldLegendPosition = legendPosition;
		legendPosition = newLegendPosition == null ? LEGEND_POSITION_EDEFAULT : newLegendPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC__LEGEND_POSITION, oldLegendPosition, legendPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<Label>(Label.class, this, EmpresaPackage.GRAPHIC__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmpresaPackage.GRAPHIC__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case EmpresaPackage.GRAPHIC__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case EmpresaPackage.GRAPHIC__DATA:
				return getData();
			case EmpresaPackage.GRAPHIC__LEGEND_POSITION:
				return getLegendPosition();
			case EmpresaPackage.GRAPHIC__LABELS:
				return getLabels();
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
			case EmpresaPackage.GRAPHIC__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case EmpresaPackage.GRAPHIC__LEGEND_POSITION:
				setLegendPosition((PositionOptions)newValue);
				return;
			case EmpresaPackage.GRAPHIC__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case EmpresaPackage.GRAPHIC__DATA:
				getData().clear();
				return;
			case EmpresaPackage.GRAPHIC__LEGEND_POSITION:
				setLegendPosition(LEGEND_POSITION_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC__LABELS:
				getLabels().clear();
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
			case EmpresaPackage.GRAPHIC__DATA:
				return data != null && !data.isEmpty();
			case EmpresaPackage.GRAPHIC__LEGEND_POSITION:
				return legendPosition != LEGEND_POSITION_EDEFAULT;
			case EmpresaPackage.GRAPHIC__LABELS:
				return labels != null && !labels.isEmpty();
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
		result.append(" (legendPosition: ");
		result.append(legendPosition);
		result.append(')');
		return result.toString();
	}

} //GraphicImpl
