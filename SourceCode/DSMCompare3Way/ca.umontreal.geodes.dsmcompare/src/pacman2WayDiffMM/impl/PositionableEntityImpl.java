/**
 */
package pacman2WayDiffMM.impl;

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

import pacman2WayDiffMM.DiffPositionableEntity_on;
import pacman2WayDiffMM.GridNode;
import pacman2WayDiffMM.Pacman2WayDiffMMPackage;
import pacman2WayDiffMM.PositionableEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positionable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.impl.PositionableEntityImpl#getOn <em>On</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.PositionableEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link pacman2WayDiffMM.impl.PositionableEntityImpl#getDiffon <em>Diffon</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PositionableEntityImpl extends MinimalEObjectImpl.Container implements PositionableEntity {
	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected GridNode on;

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
	 * The cached value of the '{@link #getDiffon() <em>Diffon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffon()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffPositionableEntity_on> diffon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pacman2WayDiffMMPackage.Literals.POSITIONABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode getOn() {
		if (on != null && on.eIsProxy()) {
			InternalEObject oldOn = (InternalEObject)on;
			on = (GridNode)eResolveProxy(oldOn);
			if (on != oldOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON, oldOn, on));
			}
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridNode basicGetOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(GridNode newOn) {
		GridNode oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON, oldOn, on));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffPositionableEntity_on> getDiffon() {
		if (diffon == null) {
			diffon = new EObjectContainmentEList<DiffPositionableEntity_on>(DiffPositionableEntity_on.class, this, Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON);
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
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON:
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
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON:
				if (resolve) return getOn();
				return basicGetOn();
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID:
				return getId();
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON:
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
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON:
				setOn((GridNode)newValue);
				return;
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID:
				setId((String)newValue);
				return;
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON:
				getDiffon().clear();
				getDiffon().addAll((Collection<? extends DiffPositionableEntity_on>)newValue);
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
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON:
				setOn((GridNode)null);
				return;
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON:
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
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ON:
				return on != null;
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Pacman2WayDiffMMPackage.POSITIONABLE_ENTITY__DIFFON:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PositionableEntityImpl
