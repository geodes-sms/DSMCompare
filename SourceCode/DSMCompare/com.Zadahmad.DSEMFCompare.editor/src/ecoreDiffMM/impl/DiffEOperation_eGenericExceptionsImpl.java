/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.AscOp;
import ecoreDiffMM.DiffEOperation_eGenericExceptions;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EOperation eGeneric Exceptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEOperation_eGenericExceptionsImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEOperation_eGenericExceptionsImpl#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEOperation_eGenericExceptionsImpl extends MinimalEObjectImpl.Container implements DiffEOperation_eGenericExceptions {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final AscOp OPERATION_EDEFAULT = AscOp.ADD;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected AscOp operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEType()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEOperation_eGenericExceptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDiffEOperation_eGenericExceptions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AscOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(AscOp newOperation) {
		AscOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getEType() {
		if (eType != null && eType.eIsProxy()) {
			InternalEObject oldEType = (InternalEObject)eType;
			eType = (EGenericType)eResolveProxy(oldEType);
			if (eType != oldEType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE, oldEType, eType));
			}
		}
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetEType() {
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEType(EGenericType newEType) {
		EGenericType oldEType = eType;
		eType = newEType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE, oldEType, eType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
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
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION:
				setOperation((AscOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE:
				setEType((EGenericType)newValue);
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
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE:
				setEType((EGenericType)null);
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
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EOPERATION_EGENERIC_EXCEPTIONS__ETYPE:
				return eType != null;
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
		result.append(')');
		return result.toString();
	}

} //DiffEOperation_eGenericExceptionsImpl
