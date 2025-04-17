/**
 */
package pacmanCRRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_Pacman;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Pacman</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PacmanImpl#getInitialPosition <em>Initial Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_PacmanImpl extends Pattern_PositionableEntityImpl implements Pattern_Pacman {
	/**
	 * The default value of the '{@link #getInitialPosition() <em>Initial Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialPosition() <em>Initial Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPosition()
	 * @generated
	 * @ordered
	 */
	protected String initialPosition = INITIAL_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_PacmanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_PACMAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialPosition() {
		return initialPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPosition(String newInitialPosition) {
		String oldInitialPosition = initialPosition;
		initialPosition = newInitialPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_PACMAN__INITIAL_POSITION, oldInitialPosition, initialPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_PACMAN__INITIAL_POSITION:
				return getInitialPosition();
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
			case PacmanCRRuleMMPackage.PATTERN_PACMAN__INITIAL_POSITION:
				setInitialPosition((String)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_PACMAN__INITIAL_POSITION:
				setInitialPosition(INITIAL_POSITION_EDEFAULT);
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
			case PacmanCRRuleMMPackage.PATTERN_PACMAN__INITIAL_POSITION:
				return INITIAL_POSITION_EDEFAULT == null ? initialPosition != null : !INITIAL_POSITION_EDEFAULT.equals(initialPosition);
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
		result.append(" (initialPosition: ");
		result.append(initialPosition);
		result.append(')');
		return result.toString();
	}

} //Pattern_PacmanImpl
