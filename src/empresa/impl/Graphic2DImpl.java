/**
 */
package empresa.impl;

import empresa.EmpresaPackage;
import empresa.Graphic2D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empresa.impl.Graphic2DImpl#getLabelStringXAxes <em>Label String XAxes</em>}</li>
 *   <li>{@link empresa.impl.Graphic2DImpl#isDisplayGridLinesXAxes <em>Display Grid Lines XAxes</em>}</li>
 *   <li>{@link empresa.impl.Graphic2DImpl#getColorGridLinesXAxes <em>Color Grid Lines XAxes</em>}</li>
 *   <li>{@link empresa.impl.Graphic2DImpl#getLabelStringYAxes <em>Label String YAxes</em>}</li>
 *   <li>{@link empresa.impl.Graphic2DImpl#isDisplayGridLinesYAxes <em>Display Grid Lines YAxes</em>}</li>
 *   <li>{@link empresa.impl.Graphic2DImpl#getColorGridLinesYAxes <em>Color Grid Lines YAxes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Graphic2DImpl extends GraphicImpl implements Graphic2D {
	/**
	 * The default value of the '{@link #getLabelStringXAxes() <em>Label String XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringXAxes()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_STRING_XAXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelStringXAxes() <em>Label String XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringXAxes()
	 * @generated
	 * @ordered
	 */
	protected String labelStringXAxes = LABEL_STRING_XAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayGridLinesXAxes() <em>Display Grid Lines XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayGridLinesXAxes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_GRID_LINES_XAXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayGridLinesXAxes() <em>Display Grid Lines XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayGridLinesXAxes()
	 * @generated
	 * @ordered
	 */
	protected boolean displayGridLinesXAxes = DISPLAY_GRID_LINES_XAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorGridLinesXAxes() <em>Color Grid Lines XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorGridLinesXAxes()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_GRID_LINES_XAXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorGridLinesXAxes() <em>Color Grid Lines XAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorGridLinesXAxes()
	 * @generated
	 * @ordered
	 */
	protected String colorGridLinesXAxes = COLOR_GRID_LINES_XAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelStringYAxes() <em>Label String YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringYAxes()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_STRING_YAXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelStringYAxes() <em>Label String YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringYAxes()
	 * @generated
	 * @ordered
	 */
	protected String labelStringYAxes = LABEL_STRING_YAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayGridLinesYAxes() <em>Display Grid Lines YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayGridLinesYAxes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_GRID_LINES_YAXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayGridLinesYAxes() <em>Display Grid Lines YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayGridLinesYAxes()
	 * @generated
	 * @ordered
	 */
	protected boolean displayGridLinesYAxes = DISPLAY_GRID_LINES_YAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorGridLinesYAxes() <em>Color Grid Lines YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorGridLinesYAxes()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_GRID_LINES_YAXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorGridLinesYAxes() <em>Color Grid Lines YAxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorGridLinesYAxes()
	 * @generated
	 * @ordered
	 */
	protected String colorGridLinesYAxes = COLOR_GRID_LINES_YAXES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Graphic2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmpresaPackage.Literals.GRAPHIC2_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelStringXAxes() {
		return labelStringXAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelStringXAxes(String newLabelStringXAxes) {
		String oldLabelStringXAxes = labelStringXAxes;
		labelStringXAxes = newLabelStringXAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__LABEL_STRING_XAXES, oldLabelStringXAxes, labelStringXAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayGridLinesXAxes() {
		return displayGridLinesXAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayGridLinesXAxes(boolean newDisplayGridLinesXAxes) {
		boolean oldDisplayGridLinesXAxes = displayGridLinesXAxes;
		displayGridLinesXAxes = newDisplayGridLinesXAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES, oldDisplayGridLinesXAxes, displayGridLinesXAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColorGridLinesXAxes() {
		return colorGridLinesXAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorGridLinesXAxes(String newColorGridLinesXAxes) {
		String oldColorGridLinesXAxes = colorGridLinesXAxes;
		colorGridLinesXAxes = newColorGridLinesXAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_XAXES, oldColorGridLinesXAxes, colorGridLinesXAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelStringYAxes() {
		return labelStringYAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelStringYAxes(String newLabelStringYAxes) {
		String oldLabelStringYAxes = labelStringYAxes;
		labelStringYAxes = newLabelStringYAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__LABEL_STRING_YAXES, oldLabelStringYAxes, labelStringYAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayGridLinesYAxes() {
		return displayGridLinesYAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayGridLinesYAxes(boolean newDisplayGridLinesYAxes) {
		boolean oldDisplayGridLinesYAxes = displayGridLinesYAxes;
		displayGridLinesYAxes = newDisplayGridLinesYAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES, oldDisplayGridLinesYAxes, displayGridLinesYAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColorGridLinesYAxes() {
		return colorGridLinesYAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorGridLinesYAxes(String newColorGridLinesYAxes) {
		String oldColorGridLinesYAxes = colorGridLinesYAxes;
		colorGridLinesYAxes = newColorGridLinesYAxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_YAXES, oldColorGridLinesYAxes, colorGridLinesYAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_XAXES:
				return getLabelStringXAxes();
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES:
				return isDisplayGridLinesXAxes();
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_XAXES:
				return getColorGridLinesXAxes();
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_YAXES:
				return getLabelStringYAxes();
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES:
				return isDisplayGridLinesYAxes();
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_YAXES:
				return getColorGridLinesYAxes();
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
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_XAXES:
				setLabelStringXAxes((String)newValue);
				return;
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES:
				setDisplayGridLinesXAxes((Boolean)newValue);
				return;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_XAXES:
				setColorGridLinesXAxes((String)newValue);
				return;
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_YAXES:
				setLabelStringYAxes((String)newValue);
				return;
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES:
				setDisplayGridLinesYAxes((Boolean)newValue);
				return;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_YAXES:
				setColorGridLinesYAxes((String)newValue);
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
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_XAXES:
				setLabelStringXAxes(LABEL_STRING_XAXES_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES:
				setDisplayGridLinesXAxes(DISPLAY_GRID_LINES_XAXES_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_XAXES:
				setColorGridLinesXAxes(COLOR_GRID_LINES_XAXES_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_YAXES:
				setLabelStringYAxes(LABEL_STRING_YAXES_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES:
				setDisplayGridLinesYAxes(DISPLAY_GRID_LINES_YAXES_EDEFAULT);
				return;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_YAXES:
				setColorGridLinesYAxes(COLOR_GRID_LINES_YAXES_EDEFAULT);
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
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_XAXES:
				return LABEL_STRING_XAXES_EDEFAULT == null ? labelStringXAxes != null : !LABEL_STRING_XAXES_EDEFAULT.equals(labelStringXAxes);
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES:
				return displayGridLinesXAxes != DISPLAY_GRID_LINES_XAXES_EDEFAULT;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_XAXES:
				return COLOR_GRID_LINES_XAXES_EDEFAULT == null ? colorGridLinesXAxes != null : !COLOR_GRID_LINES_XAXES_EDEFAULT.equals(colorGridLinesXAxes);
			case EmpresaPackage.GRAPHIC2_D__LABEL_STRING_YAXES:
				return LABEL_STRING_YAXES_EDEFAULT == null ? labelStringYAxes != null : !LABEL_STRING_YAXES_EDEFAULT.equals(labelStringYAxes);
			case EmpresaPackage.GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES:
				return displayGridLinesYAxes != DISPLAY_GRID_LINES_YAXES_EDEFAULT;
			case EmpresaPackage.GRAPHIC2_D__COLOR_GRID_LINES_YAXES:
				return COLOR_GRID_LINES_YAXES_EDEFAULT == null ? colorGridLinesYAxes != null : !COLOR_GRID_LINES_YAXES_EDEFAULT.equals(colorGridLinesYAxes);
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
		result.append(" (labelStringXAxes: ");
		result.append(labelStringXAxes);
		result.append(", displayGridLinesXAxes: ");
		result.append(displayGridLinesXAxes);
		result.append(", colorGridLinesXAxes: ");
		result.append(colorGridLinesXAxes);
		result.append(", labelStringYAxes: ");
		result.append(labelStringYAxes);
		result.append(", displayGridLinesYAxes: ");
		result.append(displayGridLinesYAxes);
		result.append(", colorGridLinesYAxes: ");
		result.append(colorGridLinesYAxes);
		result.append(')');
		return result.toString();
	}

} //Graphic2DImpl
