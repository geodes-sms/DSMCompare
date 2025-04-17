/**
 */
package pacmanDiffMM.impl;

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

import pacmanDiffMM.DiffGridNode_down;
import pacmanDiffMM.DiffGridNode_left;
import pacmanDiffMM.DiffGridNode_right;
import pacmanDiffMM.DiffGridNode_up;
import pacmanDiffMM.GridNode;
import pacmanDiffMM.PacmanDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getUp <em>Up</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getDown <em>Down</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getDiffdown <em>Diffdown</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link pacmanDiffMM.impl.GridNodeImpl#getDiffright <em>Diffright</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridNodeImpl extends MinimalEObjectImpl.Container implements GridNode {
	/**
	 * The cached value of the '{@link #getUp() <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUp()
	 * @generated
	 * @ordered
	 */
	protected GridNode up;

	/**
	 * The cached value of the '{@link #getDown() <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDown()
	 * @generated
	 * @ordered
	 */
	protected GridNode down;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected GridNode left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected GridNode right;

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
	 * The cached value of the '{@link #getDiffup() <em>Diffup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffup()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_up> diffup;

	/**
	 * The cached value of the '{@link #getDiffdown() <em>Diffdown</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdown()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_down> diffdown;

	/**
	 * The cached value of the '{@link #getDiffleft() <em>Diffleft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffleft()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_left> diffleft;

	/**
	 * The cached value of the '{@link #getDiffright() <em>Diffright</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffright()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_right> diffright;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanDiffMMPackage.Literals.GRID_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getUp() {
		if (up != null && up.eIsProxy()) {
			InternalEObject oldUp = (InternalEObject)up;
			up = (GridNode)eResolveProxy(oldUp);
			if (up != oldUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanDiffMMPackage.GRID_NODE__UP, oldUp, up));
			}
		}
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetUp() {
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUp(GridNode newUp) {
		GridNode oldUp = up;
		up = newUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GRID_NODE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getDown() {
		if (down != null && down.eIsProxy()) {
			InternalEObject oldDown = (InternalEObject)down;
			down = (GridNode)eResolveProxy(oldDown);
			if (down != oldDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanDiffMMPackage.GRID_NODE__DOWN, oldDown, down));
			}
		}
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetDown() {
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDown(GridNode newDown) {
		GridNode oldDown = down;
		down = newDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GRID_NODE__DOWN, oldDown, down));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (GridNode)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanDiffMMPackage.GRID_NODE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(GridNode newLeft) {
		GridNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GRID_NODE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (GridNode)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanDiffMMPackage.GRID_NODE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(GridNode newRight) {
		GridNode oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GRID_NODE__RIGHT, oldRight, right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanDiffMMPackage.GRID_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_up> getDiffup() {
		if (diffup == null) {
			diffup = new EObjectContainmentEList<DiffGridNode_up>(DiffGridNode_up.class, this, PacmanDiffMMPackage.GRID_NODE__DIFFUP);
		}
		return diffup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_down> getDiffdown() {
		if (diffdown == null) {
			diffdown = new EObjectContainmentEList<DiffGridNode_down>(DiffGridNode_down.class, this, PacmanDiffMMPackage.GRID_NODE__DIFFDOWN);
		}
		return diffdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_left> getDiffleft() {
		if (diffleft == null) {
			diffleft = new EObjectContainmentEList<DiffGridNode_left>(DiffGridNode_left.class, this, PacmanDiffMMPackage.GRID_NODE__DIFFLEFT);
		}
		return diffleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffGridNode_right> getDiffright() {
		if (diffright == null) {
			diffright = new EObjectContainmentEList<DiffGridNode_right>(DiffGridNode_right.class, this, PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT);
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
			case PacmanDiffMMPackage.GRID_NODE__DIFFUP:
				return ((InternalEList<?>)getDiffup()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GRID_NODE__DIFFDOWN:
				return ((InternalEList<?>)getDiffdown()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GRID_NODE__DIFFLEFT:
				return ((InternalEList<?>)getDiffleft()).basicRemove(otherEnd, msgs);
			case PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanDiffMMPackage.GRID_NODE__UP:
				if (resolve) return getUp();
				return basicGetUp();
			case PacmanDiffMMPackage.GRID_NODE__DOWN:
				if (resolve) return getDown();
				return basicGetDown();
			case PacmanDiffMMPackage.GRID_NODE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanDiffMMPackage.GRID_NODE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanDiffMMPackage.GRID_NODE__ID:
				return getId();
			case PacmanDiffMMPackage.GRID_NODE__DIFFUP:
				return getDiffup();
			case PacmanDiffMMPackage.GRID_NODE__DIFFDOWN:
				return getDiffdown();
			case PacmanDiffMMPackage.GRID_NODE__DIFFLEFT:
				return getDiffleft();
			case PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanDiffMMPackage.GRID_NODE__UP:
				setUp((GridNode)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DOWN:
				setDown((GridNode)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__LEFT:
				setLeft((GridNode)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__RIGHT:
				setRight((GridNode)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__ID:
				setId((String)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFUP:
				getDiffup().clear();
				getDiffup().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFDOWN:
				getDiffdown().clear();
				getDiffdown().addAll((Collection<? extends DiffGridNode_down>)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				getDiffleft().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT:
				getDiffright().clear();
				getDiffright().addAll((Collection<? extends DiffGridNode_right>)newValue);
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
			case PacmanDiffMMPackage.GRID_NODE__UP:
				setUp((GridNode)null);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DOWN:
				setDown((GridNode)null);
				return;
			case PacmanDiffMMPackage.GRID_NODE__LEFT:
				setLeft((GridNode)null);
				return;
			case PacmanDiffMMPackage.GRID_NODE__RIGHT:
				setRight((GridNode)null);
				return;
			case PacmanDiffMMPackage.GRID_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFUP:
				getDiffup().clear();
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFDOWN:
				getDiffdown().clear();
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				return;
			case PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanDiffMMPackage.GRID_NODE__UP:
				return up != null;
			case PacmanDiffMMPackage.GRID_NODE__DOWN:
				return down != null;
			case PacmanDiffMMPackage.GRID_NODE__LEFT:
				return left != null;
			case PacmanDiffMMPackage.GRID_NODE__RIGHT:
				return right != null;
			case PacmanDiffMMPackage.GRID_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanDiffMMPackage.GRID_NODE__DIFFUP:
				return diffup != null && !diffup.isEmpty();
			case PacmanDiffMMPackage.GRID_NODE__DIFFDOWN:
				return diffdown != null && !diffdown.isEmpty();
			case PacmanDiffMMPackage.GRID_NODE__DIFFLEFT:
				return diffleft != null && !diffleft.isEmpty();
			case PacmanDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GridNodeImpl
