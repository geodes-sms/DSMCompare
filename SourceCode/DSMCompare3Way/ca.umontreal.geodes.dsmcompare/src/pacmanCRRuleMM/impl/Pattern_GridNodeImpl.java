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
import pacmanCRRuleMM.Pattern_DiffGridNode_down;
import pacmanCRRuleMM.Pattern_DiffGridNode_left;
import pacmanCRRuleMM.Pattern_DiffGridNode_right;
import pacmanCRRuleMM.Pattern_DiffGridNode_up;
import pacmanCRRuleMM.Pattern_GridNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Grid Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getUp <em>Up</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getDown <em>Down</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getDiffdown <em>Diffdown</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link pacmanCRRuleMM.impl.Pattern_GridNodeImpl#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pattern_GridNodeImpl extends MinimalEObjectImpl.Container implements Pattern_GridNode {
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
	 * The cached value of the '{@link #getUp() <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUp()
	 * @generated
	 * @ordered
	 */
	protected Pattern_GridNode up;

	/**
	 * The cached value of the '{@link #getDown() <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDown()
	 * @generated
	 * @ordered
	 */
	protected Pattern_GridNode down;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Pattern_GridNode left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Pattern_GridNode right;

	/**
	 * The cached value of the '{@link #getDiffup() <em>Diffup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffup()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_up> diffup;

	/**
	 * The cached value of the '{@link #getDiffdown() <em>Diffdown</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdown()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_down> diffdown;

	/**
	 * The cached value of the '{@link #getDiffleft() <em>Diffleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffleft()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_left> diffleft;

	/**
	 * The cached value of the '{@link #getDiffright() <em>Diffright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffright()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern_DiffGridNode_right> diffright;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern_GridNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanCRRuleMMPackage.Literals.PATTERN_GRID_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID_PATTERN, oldID_Pattern, iD_Pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__IS_FORBIDDEN, oldIsForbidden, isForbidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode getUp() {
		if (up != null && up.eIsProxy()) {
			InternalEObject oldUp = (InternalEObject)up;
			up = (Pattern_GridNode)eResolveProxy(oldUp);
			if (up != oldUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP, oldUp, up));
			}
		}
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode basicGetUp() {
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUp(Pattern_GridNode newUp) {
		Pattern_GridNode oldUp = up;
		up = newUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode getDown() {
		if (down != null && down.eIsProxy()) {
			InternalEObject oldDown = (InternalEObject)down;
			down = (Pattern_GridNode)eResolveProxy(oldDown);
			if (down != oldDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN, oldDown, down));
			}
		}
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode basicGetDown() {
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDown(Pattern_GridNode newDown) {
		Pattern_GridNode oldDown = down;
		down = newDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN, oldDown, down));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Pattern_GridNode)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Pattern_GridNode newLeft) {
		Pattern_GridNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Pattern_GridNode)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern_GridNode basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Pattern_GridNode newRight) {
		Pattern_GridNode oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_up> getDiffup() {
		if (diffup == null) {
			diffup = new EObjectContainmentEList<Pattern_DiffGridNode_up>(Pattern_DiffGridNode_up.class, this, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP);
		}
		return diffup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_down> getDiffdown() {
		if (diffdown == null) {
			diffdown = new EObjectContainmentEList<Pattern_DiffGridNode_down>(Pattern_DiffGridNode_down.class, this, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN);
		}
		return diffdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_left> getDiffleft() {
		if (diffleft == null) {
			diffleft = new EObjectContainmentEList<Pattern_DiffGridNode_left>(Pattern_DiffGridNode_left.class, this, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT);
		}
		return diffleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern_DiffGridNode_right> getDiffright() {
		if (diffright == null) {
			diffright = new EObjectContainmentEList<Pattern_DiffGridNode_right>(Pattern_DiffGridNode_right.class, this, PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT);
		}
		return diffright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP:
				return ((InternalEList<?>)getDiffup()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN:
				return ((InternalEList<?>)getDiffdown()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT:
				return ((InternalEList<?>)getDiffleft()).basicRemove(otherEnd, msgs);
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT:
				return ((InternalEList<?>)getDiffright()).basicRemove(otherEnd, msgs);
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
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID_PATTERN:
				return getID_Pattern();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__IS_FORBIDDEN:
				return isIsForbidden();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID:
				return getId();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP:
				if (resolve) return getUp();
				return basicGetUp();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN:
				if (resolve) return getDown();
				return basicGetDown();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP:
				return getDiffup();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN:
				return getDiffdown();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT:
				return getDiffleft();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT:
				return getDiffright();
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
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID_PATTERN:
				setID_Pattern((Integer)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID:
				setId((String)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP:
				setUp((Pattern_GridNode)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN:
				setDown((Pattern_GridNode)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT:
				setLeft((Pattern_GridNode)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT:
				setRight((Pattern_GridNode)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP:
				getDiffup().clear();
				getDiffup().addAll((Collection<? extends Pattern_DiffGridNode_up>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN:
				getDiffdown().clear();
				getDiffdown().addAll((Collection<? extends Pattern_DiffGridNode_down>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				getDiffleft().addAll((Collection<? extends Pattern_DiffGridNode_left>)newValue);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT:
				getDiffright().clear();
				getDiffright().addAll((Collection<? extends Pattern_DiffGridNode_right>)newValue);
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
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID_PATTERN:
				setID_Pattern(ID_PATTERN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP:
				setUp((Pattern_GridNode)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN:
				setDown((Pattern_GridNode)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT:
				setLeft((Pattern_GridNode)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT:
				setRight((Pattern_GridNode)null);
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP:
				getDiffup().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN:
				getDiffdown().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				return;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT:
				getDiffright().clear();
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
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID_PATTERN:
				return iD_Pattern != ID_PATTERN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__UP:
				return up != null;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DOWN:
				return down != null;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__LEFT:
				return left != null;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__RIGHT:
				return right != null;
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFUP:
				return diffup != null && !diffup.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFDOWN:
				return diffdown != null && !diffdown.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFLEFT:
				return diffleft != null && !diffleft.isEmpty();
			case PacmanCRRuleMMPackage.PATTERN_GRID_NODE__DIFFRIGHT:
				return diffright != null && !diffright.isEmpty();
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

} //Pattern_GridNodeImpl
