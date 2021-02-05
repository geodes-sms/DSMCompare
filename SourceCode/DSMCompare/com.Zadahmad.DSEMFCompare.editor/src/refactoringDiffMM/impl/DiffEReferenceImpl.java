/**
 */
package refactoringDiffMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import refactoringDiffMM.ClassOp;
import refactoringDiffMM.DiffEReference;
import refactoringDiffMM.RefactoringDiffMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.DiffEReferenceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEReferenceImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link refactoringDiffMM.impl.DiffEReferenceImpl#getNew_etype <em>New etype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEReferenceImpl extends EReferenceImpl implements DiffEReference {
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
	 * The default value of the '{@link #getNew_etype() <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_etype() <em>New etype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_etype()
	 * @generated
	 * @ordered
	 */
	protected String new_etype = NEW_ETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.DIFF_EREFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_etype() {
		return new_etype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_etype(String newNew_etype) {
		String oldNew_etype = new_etype;
		new_etype = newNew_etype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE, oldNew_etype, new_etype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				return getOperation();
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				return getNew_name();
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE:
				return getNew_etype();
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
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE:
				setNew_etype((String)newValue);
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
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE:
				setNew_etype(NEW_ETYPE_EDEFAULT);
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
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case RefactoringDiffMMPackage.DIFF_EREFERENCE__NEW_ETYPE:
				return NEW_ETYPE_EDEFAULT == null ? new_etype != null : !NEW_ETYPE_EDEFAULT.equals(new_etype);
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
		result.append(", new_etype: ");
		result.append(new_etype);
		result.append(')');
		return result.toString();
	}

} //DiffEReferenceImpl
