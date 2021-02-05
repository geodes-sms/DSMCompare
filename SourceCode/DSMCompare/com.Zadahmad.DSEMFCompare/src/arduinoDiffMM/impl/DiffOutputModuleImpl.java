/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.ClassOp;
import arduinoDiffMM.DiffOutputModule;
import arduinoDiffMM.Library;
import arduinoDiffMM.ModuleKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Output Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#getNew_kind <em>New kind</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#getNew_image <em>New image</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#isNew_level <em>New level</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.DiffOutputModuleImpl#getNew_library <em>New library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffOutputModuleImpl extends OutputModuleImpl implements DiffOutputModule {
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
	 * The default value of the '{@link #getNew_kind() <em>New kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_kind()
	 * @generated
	 * @ordered
	 */
	protected static final ModuleKind NEW_KIND_EDEFAULT = ModuleKind.DIGITAL;

	/**
	 * The cached value of the '{@link #getNew_kind() <em>New kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_kind()
	 * @generated
	 * @ordered
	 */
	protected ModuleKind new_kind = NEW_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_image() <em>New image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_image()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_image() <em>New image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_image()
	 * @generated
	 * @ordered
	 */
	protected String new_image = NEW_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_level() <em>New level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_level()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_LEVEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_level() <em>New level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_level()
	 * @generated
	 * @ordered
	 */
	protected boolean new_level = NEW_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_library() <em>New library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_library()
	 * @generated
	 * @ordered
	 */
	protected static final Library NEW_LIBRARY_EDEFAULT = Library.NONE;

	/**
	 * The cached value of the '{@link #getNew_library() <em>New library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_library()
	 * @generated
	 * @ordered
	 */
	protected Library new_library = NEW_LIBRARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffOutputModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.DIFF_OUTPUT_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name() {
		return new_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name(String newNew_name) {
		String oldNew_name = new_name;
		new_name = newNew_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKind getNew_kind() {
		return new_kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_kind(ModuleKind newNew_kind) {
		ModuleKind oldNew_kind = new_kind;
		new_kind = newNew_kind == null ? NEW_KIND_EDEFAULT : newNew_kind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND, oldNew_kind, new_kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_image() {
		return new_image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_image(String newNew_image) {
		String oldNew_image = new_image;
		new_image = newNew_image;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE, oldNew_image, new_image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew_level() {
		return new_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_level(boolean newNew_level) {
		boolean oldNew_level = new_level;
		new_level = newNew_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL, oldNew_level, new_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library getNew_library() {
		return new_library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_library(Library newNew_library) {
		Library oldNew_library = new_library;
		new_library = newNew_library == null ? NEW_LIBRARY_EDEFAULT : newNew_library;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY, oldNew_library, new_library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION:
				return getOperation();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME:
				return getNew_name();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND:
				return getNew_kind();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE:
				return getNew_image();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL:
				return isNew_level();
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY:
				return getNew_library();
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
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND:
				setNew_kind((ModuleKind)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE:
				setNew_image((String)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL:
				setNew_level((Boolean)newValue);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY:
				setNew_library((Library)newValue);
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
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND:
				setNew_kind(NEW_KIND_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE:
				setNew_image(NEW_IMAGE_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL:
				setNew_level(NEW_LEVEL_EDEFAULT);
				return;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY:
				setNew_library(NEW_LIBRARY_EDEFAULT);
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
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND:
				return new_kind != NEW_KIND_EDEFAULT;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE:
				return NEW_IMAGE_EDEFAULT == null ? new_image != null : !NEW_IMAGE_EDEFAULT.equals(new_image);
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL:
				return new_level != NEW_LEVEL_EDEFAULT;
			case ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY:
				return new_library != NEW_LIBRARY_EDEFAULT;
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
		result.append(", new_kind: ");
		result.append(new_kind);
		result.append(", new_image: ");
		result.append(new_image);
		result.append(", new_level: ");
		result.append(new_level);
		result.append(", new_library: ");
		result.append(new_library);
		result.append(')');
		return result.toString();
	}

} //DiffOutputModuleImpl
