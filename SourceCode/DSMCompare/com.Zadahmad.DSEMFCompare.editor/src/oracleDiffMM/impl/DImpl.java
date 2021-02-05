/**
 */
package oracleDiffMM.impl;

import java.util.Collection;

import oracleDiffMM.D;
import oracleDiffMM.DiffD_dd;
import oracleDiffMM.OracleDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oracleDiffMM.impl.DImpl#getDd <em>Dd</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DImpl#getId <em>Id</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DImpl#getName <em>Name</em>}</li>
 *   <li>{@link oracleDiffMM.impl.DImpl#getDiffdd <em>Diffdd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DImpl extends MinimalEObjectImpl.Container implements D {
	/**
	 * The cached value of the '{@link #getDd() <em>Dd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDd()
	 * @generated
	 * @ordered
	 */
	protected EList<D> dd;

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
	 * The cached value of the '{@link #getDiffdd() <em>Diffdd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdd()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffD_dd> diffdd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OracleDiffMMPackage.Literals.D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<D> getDd() {
		if (dd == null) {
			dd = new EObjectResolvingEList<D>(D.class, this, OracleDiffMMPackage.D__DD);
		}
		return dd;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.D__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OracleDiffMMPackage.D__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffD_dd> getDiffdd() {
		if (diffdd == null) {
			diffdd = new EObjectContainmentEList<DiffD_dd>(DiffD_dd.class, this, OracleDiffMMPackage.D__DIFFDD);
		}
		return diffdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OracleDiffMMPackage.D__DIFFDD:
				return ((InternalEList<?>)getDiffdd()).basicRemove(otherEnd, msgs);
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
			case OracleDiffMMPackage.D__DD:
				return getDd();
			case OracleDiffMMPackage.D__ID:
				return getId();
			case OracleDiffMMPackage.D__NAME:
				return getName();
			case OracleDiffMMPackage.D__DIFFDD:
				return getDiffdd();
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
			case OracleDiffMMPackage.D__DD:
				getDd().clear();
				getDd().addAll((Collection<? extends D>)newValue);
				return;
			case OracleDiffMMPackage.D__ID:
				setId((Integer)newValue);
				return;
			case OracleDiffMMPackage.D__NAME:
				setName((String)newValue);
				return;
			case OracleDiffMMPackage.D__DIFFDD:
				getDiffdd().clear();
				getDiffdd().addAll((Collection<? extends DiffD_dd>)newValue);
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
			case OracleDiffMMPackage.D__DD:
				getDd().clear();
				return;
			case OracleDiffMMPackage.D__ID:
				setId(ID_EDEFAULT);
				return;
			case OracleDiffMMPackage.D__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OracleDiffMMPackage.D__DIFFDD:
				getDiffdd().clear();
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
			case OracleDiffMMPackage.D__DD:
				return dd != null && !dd.isEmpty();
			case OracleDiffMMPackage.D__ID:
				return id != ID_EDEFAULT;
			case OracleDiffMMPackage.D__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OracleDiffMMPackage.D__DIFFDD:
				return diffdd != null && !diffdd.isEmpty();
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

} //DImpl
