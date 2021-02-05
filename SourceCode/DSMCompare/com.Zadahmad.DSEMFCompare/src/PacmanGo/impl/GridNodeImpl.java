/**
 */
package PacmanGo.impl;

import PacmanGo.GridNode;
import PacmanGo.PacmanGoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PacmanGo.impl.GridNodeImpl#getUp <em>Up</em>}</li>
 *   <li>{@link PacmanGo.impl.GridNodeImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link PacmanGo.impl.GridNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link PacmanGo.impl.GridNodeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link PacmanGo.impl.GridNodeImpl#getId <em>Id</em>}</li>
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
		return PacmanGoPackage.Literals.GRID_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoPackage.GRID_NODE__UP, oldUp, up));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoPackage.GRID_NODE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getBottom() {
		if (bottom != null && bottom.eIsProxy()) {
			InternalEObject oldBottom = (InternalEObject)bottom;
			bottom = (GridNode)eResolveProxy(oldBottom);
			if (bottom != oldBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoPackage.GRID_NODE__BOTTOM, oldBottom, bottom));
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
	public void setBottom(GridNode newBottom) {
		GridNode oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoPackage.GRID_NODE__BOTTOM, oldBottom, bottom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoPackage.GRID_NODE__LEFT, oldLeft, left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoPackage.GRID_NODE__LEFT, oldLeft, left));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PacmanGoPackage.GRID_NODE__RIGHT, oldRight, right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoPackage.GRID_NODE__RIGHT, oldRight, right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoPackage.GRID_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanGoPackage.GRID_NODE__UP:
				if (resolve) return getUp();
				return basicGetUp();
			case PacmanGoPackage.GRID_NODE__BOTTOM:
				if (resolve) return getBottom();
				return basicGetBottom();
			case PacmanGoPackage.GRID_NODE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case PacmanGoPackage.GRID_NODE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case PacmanGoPackage.GRID_NODE__ID:
				return getId();
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
			case PacmanGoPackage.GRID_NODE__UP:
				setUp((GridNode)newValue);
				return;
			case PacmanGoPackage.GRID_NODE__BOTTOM:
				setBottom((GridNode)newValue);
				return;
			case PacmanGoPackage.GRID_NODE__LEFT:
				setLeft((GridNode)newValue);
				return;
			case PacmanGoPackage.GRID_NODE__RIGHT:
				setRight((GridNode)newValue);
				return;
			case PacmanGoPackage.GRID_NODE__ID:
				setId((String)newValue);
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
			case PacmanGoPackage.GRID_NODE__UP:
				setUp((GridNode)null);
				return;
			case PacmanGoPackage.GRID_NODE__BOTTOM:
				setBottom((GridNode)null);
				return;
			case PacmanGoPackage.GRID_NODE__LEFT:
				setLeft((GridNode)null);
				return;
			case PacmanGoPackage.GRID_NODE__RIGHT:
				setRight((GridNode)null);
				return;
			case PacmanGoPackage.GRID_NODE__ID:
				setId(ID_EDEFAULT);
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
			case PacmanGoPackage.GRID_NODE__UP:
				return up != null;
			case PacmanGoPackage.GRID_NODE__BOTTOM:
				return bottom != null;
			case PacmanGoPackage.GRID_NODE__LEFT:
				return left != null;
			case PacmanGoPackage.GRID_NODE__RIGHT:
				return right != null;
			case PacmanGoPackage.GRID_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GridNodeImpl
