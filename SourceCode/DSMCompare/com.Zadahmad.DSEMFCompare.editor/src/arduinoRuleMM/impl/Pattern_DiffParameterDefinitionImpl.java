/**
 */
package arduinoRuleMM.impl;

import arduinoDiffMM.impl.DiffParameterDefinitionImpl;

import arduinoRuleMM.ArduinoRuleMMPackage;
import arduinoRuleMM.Pattern_DiffParameterDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffParameterDefinitionImpl extends DiffParameterDefinitionImpl implements Pattern_DiffParameterDefinition {
	/**
	 * The default value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATTERN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Pattern() <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Pattern()
	 * @generated
	 * @ordered
	 */
	protected int iD_Pattern = ID_PATTERN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoRuleMMPackage.Literals.PATTERN_DIFF_PARAMETER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(boolean newFilter) {
		boolean oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN:
				return getID_Pattern();
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__FILTER:
				return isFilter();
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
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__FILTER:
				setFilter((Boolean)newValue);
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
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case ArduinoRuleMMPackage.PATTERN_DIFF_PARAMETER_DEFINITION__FILTER:
				return filter != FILTER_EDEFAULT;
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
		result.append(" (ID_Pattern: ");
		result.append(iD_Pattern);
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffParameterDefinitionImpl
