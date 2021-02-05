/**
 */
package ecoreRuleMM.impl;

import ecoreDiffMM.impl.DiffEObjectImpl;

import ecoreRuleMM.EcoreRuleMMPackage;
import ecoreRuleMM.Pattern_DiffEObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreRuleMM.impl.Pattern_DiffEObjectImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link ecoreRuleMM.impl.Pattern_DiffEObjectImpl#isFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffEObjectImpl extends DiffEObjectImpl implements Pattern_DiffEObject {
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
	protected Pattern_DiffEObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreRuleMMPackage.Literals.PATTERN_DIFF_EOBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__ID_PATTERN:
				return getID_Pattern();
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__FILTER:
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
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__FILTER:
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
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__FILTER:
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
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case EcoreRuleMMPackage.PATTERN_DIFF_EOBJECT__FILTER:
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

} //Pattern_DiffEObjectImpl
