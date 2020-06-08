/**
 */
package empresa.impl;

import empresa.EmpresaPackage;
import empresa.RadarChart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radar Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.RadarChartImpl#isAngleLinesDisplay <em>Angle Lines Display</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadarChartImpl extends GraphicImpl implements RadarChart {
	/**
	 * The default value of the '{@link #isAngleLinesDisplay() <em>Angle Lines Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngleLinesDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANGLE_LINES_DISPLAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAngleLinesDisplay() <em>Angle Lines Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngleLinesDisplay()
	 * @generated
	 * @ordered
	 */
	protected boolean angleLinesDisplay = ANGLE_LINES_DISPLAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadarChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.RADAR_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAngleLinesDisplay() {
		return angleLinesDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleLinesDisplay(boolean newAngleLinesDisplay) {
		boolean oldAngleLinesDisplay = angleLinesDisplay;
		angleLinesDisplay = newAngleLinesDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.RADAR_CHART__ANGLE_LINES_DISPLAY, oldAngleLinesDisplay, angleLinesDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpresaPackage.RADAR_CHART__ANGLE_LINES_DISPLAY:
				return isAngleLinesDisplay();
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
			case EmpresaPackage.RADAR_CHART__ANGLE_LINES_DISPLAY:
				setAngleLinesDisplay((Boolean)newValue);
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
			case EmpresaPackage.RADAR_CHART__ANGLE_LINES_DISPLAY:
				setAngleLinesDisplay(ANGLE_LINES_DISPLAY_EDEFAULT);
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
			case EmpresaPackage.RADAR_CHART__ANGLE_LINES_DISPLAY:
				return angleLinesDisplay != ANGLE_LINES_DISPLAY_EDEFAULT;
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
		result.append(" (angleLinesDisplay: ");
		result.append(angleLinesDisplay);
		result.append(')');
		return result.toString();
	}

} //RadarChartImpl
