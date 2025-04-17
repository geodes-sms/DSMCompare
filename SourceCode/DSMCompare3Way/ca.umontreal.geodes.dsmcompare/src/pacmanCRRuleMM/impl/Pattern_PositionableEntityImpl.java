/**
 */
package pacmanCRRuleMM.impl;

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

import pacmanCRRuleMM.PacmanCRRuleMMPackage;
import pacmanCRRuleMM.Pattern_DiffPositionableEntity_on;
import pacmanCRRuleMM.Pattern_GridNode;
import pacmanCRRuleMM.Pattern_PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Positionable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl#getOn <em>On</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_PositionableEntityImpl#getDiffon <em>Diffon</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Pattern_PositionableEntityImpl extends MinimalEObjectImpl.Container implements Pattern_PositionableEntity {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected Pattern_GridNode on;

	/**
	 * The cached value of the '{@link #getDiffon() <em>Diffon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffon()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffPositionableEntity_on> diffon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_PositionableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_POSITIONABLE_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN, oldIsForbidden, isForbidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode getOn() {
		if (on != null && on.eIsProxy()) {
			InternalEObject oldOn = (InternalEObject)on;
			on = (Pattern_GridNode)eResolveProxy(oldOn);
			if (on != oldOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON, oldOn, on));
			}
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode basicGetOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(Pattern_GridNode newOn) {
		Pattern_GridNode oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffPositionableEntity_on> getDiffon() {
		if (diffon == null) {
			diffon = new EObjectContainmentEList<Pattern_DiffPositionableEntity_on>(Pattern_DiffPositionableEntity_on.class, this, PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON);
		}
		return diffon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON:
				return ((InternalEList<?>)getDiffon()).basicRemove(otherEnd, msgs);
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
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID_PATTERN:
				return getID_Pattern();
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN:
				return isIsForbidden();
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID:
				return getId();
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON:
				if (resolve) return getOn();
				return basicGetOn();
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON:
				return getDiffon();
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
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID:
				setId((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON:
				setOn((Pattern_GridNode)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON:
				getDiffon().clear();
				getDiffon().addAll((Collection<? extends Pattern_DiffPositionableEntity_on>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON:
				setOn((Pattern_GridNode)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON:
				getDiffon().clear();
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
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__ON:
				return on != null;
			case PacmanCRRuleMMPackage.PATTERN_POSITIONABLE_ENTITY__DIFFON:
				return diffon != null && !diffon.isEmpty();
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
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //Pattern_PositionableEntityImpl
