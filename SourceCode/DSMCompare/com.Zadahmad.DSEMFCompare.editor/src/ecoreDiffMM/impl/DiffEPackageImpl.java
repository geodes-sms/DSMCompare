/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.ClassOp;
import ecoreDiffMM.DiffEPackage;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEPackageImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEPackageImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEPackageImpl#getNew_nsURI <em>New ns URI</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEPackageImpl#getNew_nsPrefix <em>New ns Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEPackageImpl extends EPackageImpl implements DiffEPackage {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ClassOp OPERATION_EDEFAULT = ClassOp.ADD;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ClassOp operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name() <em>New name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name()
	 * @generated
	 * @ordered
	 */
	protected String new_name = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_nsURI() <em>New ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_nsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_nsURI() <em>New ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_nsURI()
	 * @generated
	 * @ordered
	 */
	protected String new_nsURI = NEW_NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_nsPrefix() <em>New ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_nsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_nsPrefix() <em>New ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_nsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String new_nsPrefix = NEW_NS_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDiffEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(ClassOp newOperation) {
		ClassOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_name() {
		return new_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_name(String newNew_name) {
		String oldNew_name = new_name;
		new_name = newNew_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_nsURI() {
		return new_nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_nsURI(String newNew_nsURI) {
		String oldNew_nsURI = new_nsURI;
		new_nsURI = newNew_nsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI, oldNew_nsURI, new_nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_nsPrefix() {
		return new_nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_nsPrefix(String newNew_nsPrefix) {
		String oldNew_nsPrefix = new_nsPrefix;
		new_nsPrefix = newNew_nsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX, oldNew_nsPrefix, new_nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME:
				return getNew_name();
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI:
				return getNew_nsURI();
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX:
				return getNew_nsPrefix();
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
			case EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI:
				setNew_nsURI((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX:
				setNew_nsPrefix((String)newValue);
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
			case EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI:
				setNew_nsURI(NEW_NS_URI_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX:
				setNew_nsPrefix(NEW_NS_PREFIX_EDEFAULT);
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
			case EcoreDiffMMPackage.DIFF_EPACKAGE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_URI:
				return NEW_NS_URI_EDEFAULT == null ? new_nsURI != null : !NEW_NS_URI_EDEFAULT.equals(new_nsURI);
			case EcoreDiffMMPackage.DIFF_EPACKAGE__NEW_NS_PREFIX:
				return NEW_NS_PREFIX_EDEFAULT == null ? new_nsPrefix != null : !NEW_NS_PREFIX_EDEFAULT.equals(new_nsPrefix);
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(", new_name: ");
		result.append(new_name);
		result.append(", new_nsURI: ");
		result.append(new_nsURI);
		result.append(", new_nsPrefix: ");
		result.append(new_nsPrefix);
		result.append(')');
		return result.toString();
	}

} //DiffEPackageImpl
