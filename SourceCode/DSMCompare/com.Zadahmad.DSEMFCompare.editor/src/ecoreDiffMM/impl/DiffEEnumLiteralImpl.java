/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.ClassOp;
import ecoreDiffMM.DiffEEnumLiteral;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl#getNew_value <em>New value</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl#getNew_instance <em>New instance</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumLiteralImpl#getNew_literal <em>New literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEEnumLiteralImpl extends EEnumLiteralImpl implements DiffEEnumLiteral {
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
	 * The default value of the '{@link #getNew_instance() <em>New instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instance()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator NEW_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_instance() <em>New instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instance()
	 * @generated
	 * @ordered
	 */
	protected Enumerator new_instance = NEW_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_literal() <em>New literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_literal()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_literal() <em>New literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_literal()
	 * @generated
	 * @ordered
	 */
	protected String new_literal = NEW_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDiffEEnumLiteral();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_value() {
		return new_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_value(int newNew_value) {
		int oldNew_value = new_value;
		new_value = newNew_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE, oldNew_value, new_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerator getNew_instance() {
		return new_instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_instance(Enumerator newNew_instance) {
		Enumerator oldNew_instance = new_instance;
		new_instance = newNew_instance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE, oldNew_instance, new_instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_literal() {
		return new_literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_literal(String newNew_literal) {
		String oldNew_literal = new_literal;
		new_literal = newNew_literal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL, oldNew_literal, new_literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME:
				return getNew_name();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE:
				return getNew_value();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE:
				return getNew_instance();
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL:
				return getNew_literal();
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
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE:
				setNew_value((Integer)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE:
				setNew_instance((Enumerator)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL:
				setNew_literal((String)newValue);
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
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE:
				setNew_value(NEW_VALUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE:
				setNew_instance(NEW_INSTANCE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL:
				setNew_literal(NEW_LITERAL_EDEFAULT);
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
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_VALUE:
				return new_value != NEW_VALUE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_INSTANCE:
				return NEW_INSTANCE_EDEFAULT == null ? new_instance != null : !NEW_INSTANCE_EDEFAULT.equals(new_instance);
			case EcoreDiffMMPackage.DIFF_EENUM_LITERAL__NEW_LITERAL:
				return NEW_LITERAL_EDEFAULT == null ? new_literal != null : !NEW_LITERAL_EDEFAULT.equals(new_literal);
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
		result.append(", new_value: ");
		result.append(new_value);
		result.append(", new_instance: ");
		result.append(new_instance);
		result.append(", new_literal: ");
		result.append(new_literal);
		result.append(')');
		return result.toString();
	}

} //DiffEEnumLiteralImpl
