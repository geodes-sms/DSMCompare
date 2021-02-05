/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.DiffGridNode_bottom;
import PacmanGoDiffMM.DiffGridNode_left;
import PacmanGoDiffMM.DiffGridNode_right;
import PacmanGoDiffMM.DiffGridNode_up;
import PacmanGoDiffMM.GridNode;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getUp <em>Up</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getDiffup <em>Diffup</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getDiffbottom <em>Diffbottom</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getDiffleft <em>Diffleft</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.GridNodeImpl#getDiffright <em>Diffright</em>}</li>
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
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected GridNode bottom;

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
	 * The cached value of the '{@link #getDiffbottom() <em>Diffbottom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffbottom()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffGridNode_bottom> diffbottom;

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
		return PacmanGoDiffMMPackage.Literals.GRID_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridNode getUp() {
		if (up != null && up.eIsProxy()) {
			InternalEObject oldUp = (InternalEObject)up;
			up = (GridNode)eResolveProxy(oldUp);
			if (up != oldUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoDiffMMPackage.GRID_NODE__UP, oldUp, up));
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
	@Override
	public void setUp(GridNode newUp) {
		GridNode oldUp = up;
		up = newUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GRID_NODE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridNode getBottom() {
		if (bottom != null && bottom.eIsProxy()) {
			InternalEObject oldBottom = (InternalEObject)bottom;
			bottom = (GridNode)eResolveProxy(oldBottom);
			if (bottom != oldBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoDiffMMPackage.GRID_NODE__BOTTOM, oldBottom, bottom));
			}
		}
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottom(GridNode newBottom) {
		GridNode oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GRID_NODE__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridNode getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (GridNode)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoDiffMMPackage.GRID_NODE__LEFT, oldLeft, left));
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
	@Override
	public void setLeft(GridNode newLeft) {
		GridNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GRID_NODE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridNode getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (GridNode)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoDiffMMPackage.GRID_NODE__RIGHT, oldRight, right));
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
	@Override
	public void setRight(GridNode newRight) {
		GridNode oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GRID_NODE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.GRID_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGridNode_up> getDiffup() {
		if (diffup == null) {
			diffup = new EObjectContainmentEList<DiffGridNode_up>(DiffGridNode_up.class, this, PacmanGoDiffMMPackage.GRID_NODE__DIFFUP);
		}
		return diffup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGridNode_bottom> getDiffbottom() {
		if (diffbottom == null) {
			diffbottom = new EObjectContainmentEList<DiffGridNode_bottom>(DiffGridNode_bottom.class, this, PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM);
		}
		return diffbottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGridNode_left> getDiffleft() {
		if (diffleft == null) {
			diffleft = new EObjectContainmentEList<DiffGridNode_left>(DiffGridNode_left.class, this, PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT);
		}
		return diffleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffGridNode_right> getDiffright() {
		if (diffright == null) {
			diffright = new EObjectContainmentEList<DiffGridNode_right>(DiffGridNode_right.class, this, PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT);
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
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFUP:
				return ((InternalEList<?>)getDiffup()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM:
				return ((InternalEList<?>)getDiffbottom()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT:
				return ((InternalEList<?>)getDiffleft()).basicRemove(otherEnd, msgs);
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanGoDiffMMPackage.GRID_NODE__UP:
				if (resolve) return getUp();
				return basicGetUp();
			case PacmanGoDiffMMPackage.GRID_NODE__BOTTOM:
				if (resolve) return getBottom();
				return basicGetBottom();
			case PacmanGoDiffMMPackage.GRID_NODE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanGoDiffMMPackage.GRID_NODE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanGoDiffMMPackage.GRID_NODE__ID:
				return getId();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFUP:
				return getDiffup();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM:
				return getDiffbottom();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT:
				return getDiffleft();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanGoDiffMMPackage.GRID_NODE__UP:
				setUp((GridNode)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__BOTTOM:
				setBottom((GridNode)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__LEFT:
				setLeft((GridNode)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__RIGHT:
				setRight((GridNode)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__ID:
				setId((String)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFUP:
				getDiffup().clear();
				getDiffup().addAll((Collection<? extends DiffGridNode_up>)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM:
				getDiffbottom().clear();
				getDiffbottom().addAll((Collection<? extends DiffGridNode_bottom>)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				getDiffleft().addAll((Collection<? extends DiffGridNode_left>)newValue);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanGoDiffMMPackage.GRID_NODE__UP:
				setUp((GridNode)null);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__BOTTOM:
				setBottom((GridNode)null);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__LEFT:
				setLeft((GridNode)null);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__RIGHT:
				setRight((GridNode)null);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFUP:
				getDiffup().clear();
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM:
				getDiffbottom().clear();
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT:
				getDiffleft().clear();
				return;
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
			case PacmanGoDiffMMPackage.GRID_NODE__UP:
				return up != null;
			case PacmanGoDiffMMPackage.GRID_NODE__BOTTOM:
				return bottom != null;
			case PacmanGoDiffMMPackage.GRID_NODE__LEFT:
				return left != null;
			case PacmanGoDiffMMPackage.GRID_NODE__RIGHT:
				return right != null;
			case PacmanGoDiffMMPackage.GRID_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFUP:
				return diffup != null && !diffup.isEmpty();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFBOTTOM:
				return diffbottom != null && !diffbottom.isEmpty();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFLEFT:
				return diffleft != null && !diffleft.isEmpty();
			case PacmanGoDiffMMPackage.GRID_NODE__DIFFRIGHT:
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
