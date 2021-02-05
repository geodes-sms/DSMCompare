/**
 */
package oracleDiffMM.impl;

import java.util.Collection;

import oracleDiffMM.B;
import oracleDiffMM.D;
import oracleDiffMM.DiffB_bd;
import oracleDiffMM.OracleDiffMMPackage;

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
 * An implementation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.impl.BImpl#getBd <em>Bd</em>}</li>
 *   <li>{@link oracleDiffMM.impl.BImpl#getId <em>Id</em>}</li>
 *   <li>{@link oracleDiffMM.impl.BImpl#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.impl.BImpl#getDiffbd <em>Diffbd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BImpl extends MinimalEObjectImpl.Container implements B {
	/**
	 * The cached value of the '{@link #getBd() <em>Bd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBd()
	 * @generated
	 * @ordered
	 */
	protected EList<D> bd;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiffbd() <em>Diffbd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffbd()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffB_bd> diffbd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OracleDiffMMPackage.Literals.B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<D> getBd() {
		if (bd == null) {
			bd = new EObjectContainmentEList<D>(D.class, this, OracleDiffMMPackage.B__BD);
		}
		return bd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.B__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.B__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffB_bd> getDiffbd() {
		if (diffbd == null) {
			diffbd = new EObjectContainmentEList<DiffB_bd>(DiffB_bd.class, this, OracleDiffMMPackage.B__DIFFBD);
		}
		return diffbd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OracleDiffMMPackage.B__BD:
				return ((InternalEList<?>)getBd()).basicRemove(otherEnd, msgs);
			case OracleDiffMMPackage.B__DIFFBD:
				return ((InternalEList<?>)getDiffbd()).basicRemove(otherEnd, msgs);
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
			case OracleDiffMMPackage.B__BD:
				return getBd();
			case OracleDiffMMPackage.B__ID:
				return getId();
			case OracleDiffMMPackage.B__NAME:
				return getName();
			case OracleDiffMMPackage.B__DIFFBD:
				return getDiffbd();
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
			case OracleDiffMMPackage.B__BD:
				getBd().clear();
				getBd().addAll((Collection<? extends D>)newValue);
				return;
			case OracleDiffMMPackage.B__ID:
				setId((Integer)newValue);
				return;
			case OracleDiffMMPackage.B__NAME:
				setName((String)newValue);
				return;
			case OracleDiffMMPackage.B__DIFFBD:
				getDiffbd().clear();
				getDiffbd().addAll((Collection<? extends DiffB_bd>)newValue);
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
			case OracleDiffMMPackage.B__BD:
				getBd().clear();
				return;
			case OracleDiffMMPackage.B__ID:
				setId(ID_EDEFAULT);
				return;
			case OracleDiffMMPackage.B__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OracleDiffMMPackage.B__DIFFBD:
				getDiffbd().clear();
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
			case OracleDiffMMPackage.B__BD:
				return bd != null && !bd.isEmpty();
			case OracleDiffMMPackage.B__ID:
				return id != ID_EDEFAULT;
			case OracleDiffMMPackage.B__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OracleDiffMMPackage.B__DIFFBD:
				return diffbd != null && !diffbd.isEmpty();
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
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BImpl
