/**
 */
package pacman2WayRuleMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pacman2WayDiffMM.impl.DiffGridNode_upImpl;

import pacman2WayRuleMM.Pacman2WayRuleMMPackage;
import pacman2WayRuleMM.Pattern_DiffGridNode_up;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Diff Grid Node up</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacman2WayRuleMM.impl.Pattern_DiffGridNode_upImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_DiffGridNode_upImpl extends DiffGridNode_upImpl implements Pattern_DiffGridNode_up {
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
	protected Pattern_DiffGridNode_upImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pacman2WayRuleMMPackage.Literals.PATTERN_DIFF_GRID_NODE_UP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__FILTER, oldFilter, filter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN, oldIsForbidden, isForbidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN:
				return getID_Pattern();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__FILTER:
				return isFilter();
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN:
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
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__FILTER:
				setFilter((Boolean)newValue);
				return;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN:
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
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN:
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
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__FILTER:
				return filter != FILTER_EDEFAULT;
			case Pacman2WayRuleMMPackage.PATTERN_DIFF_GRID_NODE_UP__IS_FORBIDDEN:
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

} //Pattern_DiffGridNode_upImpl
