/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.ClassOp;
import ecoreDiffMM.DiffEEnum;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EEnum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getNew_instanceClassName <em>New instance Class Name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getNew_instanceClass <em>New instance Class</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getNew_defaultValue <em>New default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#getNew_instanceTypeName <em>New instance Type Name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEEnumImpl#isNew_serializable <em>New serializable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffEEnumImpl extends EEnumImpl implements DiffEEnum {
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
	 * The default value of the '{@link #getNew_instanceClassName() <em>New instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_instanceClassName() <em>New instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String new_instanceClassName = NEW_INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNew_instanceClass() <em>New instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instanceClass()
	 * @generated
	 * @ordered
	 */
	protected Class new_instanceClass;

	/**
	 * The default value of the '{@link #getNew_defaultValue() <em>New default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_defaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object NEW_DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_defaultValue() <em>New default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_defaultValue()
	 * @generated
	 * @ordered
	 */
	protected Object new_defaultValue = NEW_DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_instanceTypeName() <em>New instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_INSTANCE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_instanceTypeName() <em>New instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_instanceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String new_instanceTypeName = NEW_INSTANCE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_serializable() <em>New serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_serializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_SERIALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_serializable() <em>New serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_serializable()
	 * @generated
	 * @ordered
	 */
	protected boolean new_serializable = NEW_SERIALIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffEEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getDiffEEnum();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_instanceClassName() {
		return new_instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_instanceClassName(String newNew_instanceClassName) {
		String oldNew_instanceClassName = new_instanceClassName;
		new_instanceClassName = newNew_instanceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME, oldNew_instanceClassName, new_instanceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class getNew_instanceClass() {
		return new_instanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_instanceClass(Class newNew_instanceClass) {
		Class oldNew_instanceClass = new_instanceClass;
		new_instanceClass = newNew_instanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS, oldNew_instanceClass, new_instanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNew_defaultValue() {
		return new_defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_defaultValue(Object newNew_defaultValue) {
		Object oldNew_defaultValue = new_defaultValue;
		new_defaultValue = newNew_defaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE, oldNew_defaultValue, new_defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_instanceTypeName() {
		return new_instanceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_instanceTypeName(String newNew_instanceTypeName) {
		String oldNew_instanceTypeName = new_instanceTypeName;
		new_instanceTypeName = newNew_instanceTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME, oldNew_instanceTypeName, new_instanceTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_serializable() {
		return new_serializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_serializable(boolean newNew_serializable) {
		boolean oldNew_serializable = new_serializable;
		new_serializable = newNew_serializable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE, oldNew_serializable, new_serializable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EENUM__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME:
				return getNew_name();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME:
				return getNew_instanceClassName();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS:
				return getNew_instanceClass();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE:
				return getNew_defaultValue();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME:
				return getNew_instanceTypeName();
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE:
				return isNew_serializable();
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
			case EcoreDiffMMPackage.DIFF_EENUM__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME:
				setNew_instanceClassName((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS:
				setNew_instanceClass((Class)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE:
				setNew_defaultValue(newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME:
				setNew_instanceTypeName((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE:
				setNew_serializable((Boolean)newValue);
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
			case EcoreDiffMMPackage.DIFF_EENUM__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME:
				setNew_instanceClassName(NEW_INSTANCE_CLASS_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS:
				setNew_instanceClass((Class)null);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE:
				setNew_defaultValue(NEW_DEFAULT_VALUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME:
				setNew_instanceTypeName(NEW_INSTANCE_TYPE_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE:
				setNew_serializable(NEW_SERIALIZABLE_EDEFAULT);
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
			case EcoreDiffMMPackage.DIFF_EENUM__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS_NAME:
				return NEW_INSTANCE_CLASS_NAME_EDEFAULT == null ? new_instanceClassName != null : !NEW_INSTANCE_CLASS_NAME_EDEFAULT.equals(new_instanceClassName);
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_CLASS:
				return new_instanceClass != null;
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_DEFAULT_VALUE:
				return NEW_DEFAULT_VALUE_EDEFAULT == null ? new_defaultValue != null : !NEW_DEFAULT_VALUE_EDEFAULT.equals(new_defaultValue);
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_INSTANCE_TYPE_NAME:
				return NEW_INSTANCE_TYPE_NAME_EDEFAULT == null ? new_instanceTypeName != null : !NEW_INSTANCE_TYPE_NAME_EDEFAULT.equals(new_instanceTypeName);
			case EcoreDiffMMPackage.DIFF_EENUM__NEW_SERIALIZABLE:
				return new_serializable != NEW_SERIALIZABLE_EDEFAULT;
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
		result.append(", new_instanceClassName: ");
		result.append(new_instanceClassName);
		result.append(", new_instanceClass: ");
		result.append(new_instanceClass);
		result.append(", new_defaultValue: ");
		result.append(new_defaultValue);
		result.append(", new_instanceTypeName: ");
		result.append(new_instanceTypeName);
		result.append(", new_serializable: ");
		result.append(new_serializable);
		result.append(')');
		return result.toString();
	}

} //DiffEEnumImpl
