/**
 */
package PacmanGoDiffMM.impl;

import PacmanGoDiffMM.ClassOp;
import PacmanGoDiffMM.DiffScoreboard;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Scoreboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PacmanGoDiffMM.impl.DiffScoreboardImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DiffScoreboardImpl#getNew_value <em>New value</em>}</li>
 *   <li>{@link PacmanGoDiffMM.impl.DiffScoreboardImpl#getNew_id <em>New id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffScoreboardImpl extends ScoreboardImpl implements DiffScoreboard {
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
	 * The default value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_value() <em>New value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_value()
	 * @generated
	 * @ordered
	 */
	protected int new_value = NEW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_id() <em>New id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_id()
	 * @generated
	 * @ordered
	 */
	protected int new_id = NEW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffScoreboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanGoDiffMMPackage.Literals.DIFF_SCOREBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ClassOp newOperation) {
		ClassOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_value(int newNew_value) {
		int oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE, oldNew_value, new_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_id() {
		return new_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_id(int newNew_id) {
		int oldNew_id = new_id;
		new_id = newNew_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID, oldNew_id, new_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION:
				return getOperation();
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE:
				return getNew_value();
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID:
				return getNew_id();
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
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE:
				setNew_value((Integer)newValue);
				return;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID:
				setNew_id((Integer)newValue);
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
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE:
				setNew_value(NEW_VALUE_EDEFAULT);
				return;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID:
				setNew_id(NEW_ID_EDEFAULT);
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
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_VALUE:
				return new_value != NEW_VALUE_EDEFAULT;
			case PacmanGoDiffMMPackage.DIFF_SCOREBOARD__NEW_ID:
				return new_id != NEW_ID_EDEFAULT;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(", new_value: ");
		result.append(new_value);
		result.append(", new_id: ");
		result.append(new_id);
		result.append(')');
		return result.toString();
	}

} //DiffScoreboardImpl
