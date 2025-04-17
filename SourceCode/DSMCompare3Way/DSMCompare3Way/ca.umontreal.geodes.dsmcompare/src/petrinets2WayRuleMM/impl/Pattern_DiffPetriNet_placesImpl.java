/**
 */
package petrinets2WayRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinets2WayDiffMM.impl.DiffPetriNet_placesImpl;

import petrinets2WayRuleMM.Pattern_DiffPetriNet_places;
import petrinets2WayRuleMM.Petrinets2WayRuleMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Petri Net places</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link petrinets2WayRuleMM.impl.Pattern_DiffPetriNet_placesImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffPetriNet_placesImpl extends DiffPetriNet_placesImpl implements Pattern_DiffPetriNet_places {
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
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_DiffPetriNet_placesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinets2WayRuleMMPackage.Literals.PATTERN_DIFF_PETRI_NET_PLACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Pattern() {
		return iD_Pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Pattern(int newID_Pattern) {
		int oldID_Pattern = iD_Pattern;
		iD_Pattern = newID_Pattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN, oldID_Pattern, iD_Pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(boolean newFilter) {
		boolean oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN, oldIsForbidden, isForbidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN:
				return getID_Pattern();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__FILTER:
				return isFilter();
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN:
				return isIsForbidden();
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
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__FILTER:
				setFilter((Boolean)newValue);
				return;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
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
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
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
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__FILTER:
				return filter != FILTER_EDEFAULT;
			case Petrinets2WayRuleMMPackage.PATTERN_DIFF_PETRI_NET_PLACES__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
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
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(')');
		return result.toString();
	}

} //Pattern_DiffPetriNet_placesImpl
