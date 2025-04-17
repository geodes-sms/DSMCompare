/**
 */
package pacmanCRRuleMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_Energizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Energizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_EnergizerImpl#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_EnergizerImpl extends Pattern_PositionableEntityImpl implements Pattern_Energizer {
	/**
	 * The cached value of the '{@link #getDurations() <em>Durations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> durations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_EnergizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_ENERGIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDurations() {
		if (durations == null) {
			durations = new EDataTypeUniqueEList<Integer>(Integer.class, this, PacmanCRRuleMMPackage.PATTERN_ENERGIZER__DURATIONS);
		}
		return durations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_ENERGIZER__DURATIONS:
				return getDurations();
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
			case PacmanCRRuleMMPackage.PATTERN_ENERGIZER__DURATIONS:
				getDurations().clear();
				getDurations().addAll((Collection<? extends Integer>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_ENERGIZER__DURATIONS:
				getDurations().clear();
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
			case PacmanCRRuleMMPackage.PATTERN_ENERGIZER__DURATIONS:
				return durations != null && !durations.isEmpty();
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
		result.append(" (durations: ");
		result.append(durations);
		result.append(')');
		return result.toString();
	}

} //Pattern_EnergizerImpl
