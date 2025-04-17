/**
 */
package refactoring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import refactoring.EOperation;
import refactoring.RefactoringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoring.impl.EOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link refactoring.impl.EOperationImpl#getEparameters <em>Eparameters</em>}</li>
 *   <li>{@link refactoring.impl.EOperationImpl#getEtype <em>Etype</em>}</li>
 *   <li>{@link refactoring.impl.EOperationImpl#getMethodBody <em>Method Body</em>}</li>
 *   <li>{@link refactoring.impl.EOperationImpl#get__idKDM <em>id KDM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationImpl extends MinimalEObjectImpl.Container implements EOperation {
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
	 * The default value of the '{@link #getEparameters() <em>Eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparameters()
	 * @generated
	 * @ordered
	 */
	protected static final String EPARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEparameters() <em>Eparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEparameters()
	 * @generated
	 * @ordered
	 */
	protected String eparameters = EPARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtype() <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtype()
	 * @generated
	 * @ordered
	 */
	protected static final String ETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtype() <em>Etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtype()
	 * @generated
	 * @ordered
	 */
	protected String etype = ETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodBody() <em>Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBody()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodBody() <em>Method Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodBody()
	 * @generated
	 * @ordered
	 */
	protected String methodBody = METHOD_BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #get__idKDM() <em>id KDM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__idKDM()
	 * @generated
	 * @ordered
	 */
	protected static final String _ID_KDM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__idKDM() <em>id KDM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__idKDM()
	 * @generated
	 * @ordered
	 */
	protected String __idKDM = _ID_KDM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringPackage.Literals.EOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EOPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEparameters() {
		return eparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEparameters(String newEparameters) {
		String oldEparameters = eparameters;
		eparameters = newEparameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EOPERATION__EPARAMETERS, oldEparameters, eparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtype() {
		return etype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtype(String newEtype) {
		String oldEtype = etype;
		etype = newEtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EOPERATION__ETYPE, oldEtype, etype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodBody() {
		return methodBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBody(String newMethodBody) {
		String oldMethodBody = methodBody;
		methodBody = newMethodBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EOPERATION__METHOD_BODY, oldMethodBody, methodBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get__idKDM() {
		return __idKDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__idKDM(String new__idKDM) {
		String old__idKDM = __idKDM;
		__idKDM = new__idKDM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringPackage.EOPERATION__ID_KDM, old__idKDM, __idKDM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringPackage.EOPERATION__NAME:
				return getName();
			case RefactoringPackage.EOPERATION__EPARAMETERS:
				return getEparameters();
			case RefactoringPackage.EOPERATION__ETYPE:
				return getEtype();
			case RefactoringPackage.EOPERATION__METHOD_BODY:
				return getMethodBody();
			case RefactoringPackage.EOPERATION__ID_KDM:
				return get__idKDM();
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
			case RefactoringPackage.EOPERATION__NAME:
				setName((String)newValue);
				return;
			case RefactoringPackage.EOPERATION__EPARAMETERS:
				setEparameters((String)newValue);
				return;
			case RefactoringPackage.EOPERATION__ETYPE:
				setEtype((String)newValue);
				return;
			case RefactoringPackage.EOPERATION__METHOD_BODY:
				setMethodBody((String)newValue);
				return;
			case RefactoringPackage.EOPERATION__ID_KDM:
				set__idKDM((String)newValue);
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
			case RefactoringPackage.EOPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefactoringPackage.EOPERATION__EPARAMETERS:
				setEparameters(EPARAMETERS_EDEFAULT);
				return;
			case RefactoringPackage.EOPERATION__ETYPE:
				setEtype(ETYPE_EDEFAULT);
				return;
			case RefactoringPackage.EOPERATION__METHOD_BODY:
				setMethodBody(METHOD_BODY_EDEFAULT);
				return;
			case RefactoringPackage.EOPERATION__ID_KDM:
				set__idKDM(_ID_KDM_EDEFAULT);
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
			case RefactoringPackage.EOPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefactoringPackage.EOPERATION__EPARAMETERS:
				return EPARAMETERS_EDEFAULT == null ? eparameters != null : !EPARAMETERS_EDEFAULT.equals(eparameters);
			case RefactoringPackage.EOPERATION__ETYPE:
				return ETYPE_EDEFAULT == null ? etype != null : !ETYPE_EDEFAULT.equals(etype);
			case RefactoringPackage.EOPERATION__METHOD_BODY:
				return METHOD_BODY_EDEFAULT == null ? methodBody != null : !METHOD_BODY_EDEFAULT.equals(methodBody);
			case RefactoringPackage.EOPERATION__ID_KDM:
				return _ID_KDM_EDEFAULT == null ? __idKDM != null : !_ID_KDM_EDEFAULT.equals(__idKDM);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", eparameters: ");
		result.append(eparameters);
		result.append(", etype: ");
		result.append(etype);
		result.append(", methodBody: ");
		result.append(methodBody);
		result.append(", __idKDM: ");
		result.append(__idKDM);
		result.append(')');
		return result.toString();
	}

} //EOperationImpl
