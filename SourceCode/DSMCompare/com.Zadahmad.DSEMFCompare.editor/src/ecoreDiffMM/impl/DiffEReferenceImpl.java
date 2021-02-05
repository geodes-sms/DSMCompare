/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.ClassOp;
import ecoreDiffMM.DiffEReference;
import ecoreDiffMM.EcoreDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getNew_name <em>New name</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_ordered <em>New ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_unique <em>New unique</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getNew_lowerBound <em>New lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getNew_upperBound <em>New upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_many <em>New many</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_required <em>New required</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_changeable <em>New changeable</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_volatile <em>New volatile</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_transient <em>New transient</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getNew_defaultValueLiteral <em>New default Value Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#getNew_defaultValue <em>New default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_unsettable <em>New unsettable</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_derived <em>New derived</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_containment <em>New containment</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_container <em>New container</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.DiffEReferenceImpl#isNew_resolveProxies <em>New resolve Proxies</em>}</li>
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
	 * The default value of the '{@link #isNew_ordered() <em>New ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_ordered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_ordered() <em>New ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_ordered()
	 * @generated
	 * @ordered
	 */
	protected boolean new_ordered = NEW_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_unique() <em>New unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_unique() <em>New unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unique()
	 * @generated
	 * @ordered
	 */
	protected boolean new_unique = NEW_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_lowerBound() <em>New lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_lowerBound() <em>New lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_lowerBound()
	 * @generated
	 * @ordered
	 */
	protected int new_lowerBound = NEW_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_upperBound() <em>New upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_upperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_upperBound() <em>New upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_upperBound()
	 * @generated
	 * @ordered
	 */
	protected int new_upperBound = NEW_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_many() <em>New many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_many()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_many() <em>New many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_many()
	 * @generated
	 * @ordered
	 */
	protected boolean new_many = NEW_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_required() <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_required()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_required() <em>New required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_required()
	 * @generated
	 * @ordered
	 */
	protected boolean new_required = NEW_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_changeable() <em>New changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_changeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_CHANGEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_changeable() <em>New changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_changeable()
	 * @generated
	 * @ordered
	 */
	protected boolean new_changeable = NEW_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_volatile() <em>New volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_volatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_volatile() <em>New volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_volatile()
	 * @generated
	 * @ordered
	 */
	protected boolean new_volatile = NEW_VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_transient() <em>New transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_transient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_transient() <em>New transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_transient()
	 * @generated
	 * @ordered
	 */
	protected boolean new_transient = NEW_TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_defaultValueLiteral() <em>New default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_defaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_defaultValueLiteral() <em>New default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_defaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String new_defaultValueLiteral = NEW_DEFAULT_VALUE_LITERAL_EDEFAULT;

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
	 * The default value of the '{@link #isNew_unsettable() <em>New unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_UNSETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_unsettable() <em>New unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_unsettable()
	 * @generated
	 * @ordered
	 */
	protected boolean new_unsettable = NEW_UNSETTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_derived() <em>New derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_derived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_derived() <em>New derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_derived()
	 * @generated
	 * @ordered
	 */
	protected boolean new_derived = NEW_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_containment() <em>New containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_containment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_containment() <em>New containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_containment()
	 * @generated
	 * @ordered
	 */
	protected boolean new_containment = NEW_CONTAINMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_container() <em>New container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_container()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_container() <em>New container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_container()
	 * @generated
	 * @ordered
	 */
	protected boolean new_container = NEW_CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_resolveProxies() <em>New resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_resolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_RESOLVE_PROXIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_resolveProxies() <em>New resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_resolveProxies()
	 * @generated
	 * @ordered
	 */
	protected boolean new_resolveProxies = NEW_RESOLVE_PROXIES_EDEFAULT;

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
		return EcoreDiffMMPackage.eINSTANCE.getDiffEReference();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME, oldNew_name, new_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_ordered() {
		return new_ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_ordered(boolean newNew_ordered) {
		boolean oldNew_ordered = new_ordered;
		new_ordered = newNew_ordered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED, oldNew_ordered, new_ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_unique() {
		return new_unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_unique(boolean newNew_unique) {
		boolean oldNew_unique = new_unique;
		new_unique = newNew_unique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE, oldNew_unique, new_unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_lowerBound() {
		return new_lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_lowerBound(int newNew_lowerBound) {
		int oldNew_lowerBound = new_lowerBound;
		new_lowerBound = newNew_lowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND, oldNew_lowerBound, new_lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNew_upperBound() {
		return new_upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_upperBound(int newNew_upperBound) {
		int oldNew_upperBound = new_upperBound;
		new_upperBound = newNew_upperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND, oldNew_upperBound, new_upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_many() {
		return new_many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_many(boolean newNew_many) {
		boolean oldNew_many = new_many;
		new_many = newNew_many;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY, oldNew_many, new_many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_required() {
		return new_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_required(boolean newNew_required) {
		boolean oldNew_required = new_required;
		new_required = newNew_required;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED, oldNew_required, new_required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_changeable() {
		return new_changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_changeable(boolean newNew_changeable) {
		boolean oldNew_changeable = new_changeable;
		new_changeable = newNew_changeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE, oldNew_changeable, new_changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_volatile() {
		return new_volatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_volatile(boolean newNew_volatile) {
		boolean oldNew_volatile = new_volatile;
		new_volatile = newNew_volatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE, oldNew_volatile, new_volatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_transient() {
		return new_transient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_transient(boolean newNew_transient) {
		boolean oldNew_transient = new_transient;
		new_transient = newNew_transient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT, oldNew_transient, new_transient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNew_defaultValueLiteral() {
		return new_defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_defaultValueLiteral(String newNew_defaultValueLiteral) {
		String oldNew_defaultValueLiteral = new_defaultValueLiteral;
		new_defaultValueLiteral = newNew_defaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL, oldNew_defaultValueLiteral, new_defaultValueLiteral));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE, oldNew_defaultValue, new_defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_unsettable() {
		return new_unsettable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_unsettable(boolean newNew_unsettable) {
		boolean oldNew_unsettable = new_unsettable;
		new_unsettable = newNew_unsettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE, oldNew_unsettable, new_unsettable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_derived() {
		return new_derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_derived(boolean newNew_derived) {
		boolean oldNew_derived = new_derived;
		new_derived = newNew_derived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED, oldNew_derived, new_derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_containment() {
		return new_containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_containment(boolean newNew_containment) {
		boolean oldNew_containment = new_containment;
		new_containment = newNew_containment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT, oldNew_containment, new_containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_container() {
		return new_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_container(boolean newNew_container) {
		boolean oldNew_container = new_container;
		new_container = newNew_container;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER, oldNew_container, new_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNew_resolveProxies() {
		return new_resolveProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNew_resolveProxies(boolean newNew_resolveProxies) {
		boolean oldNew_resolveProxies = new_resolveProxies;
		new_resolveProxies = newNew_resolveProxies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES, oldNew_resolveProxies, new_resolveProxies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				return getOperation();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				return getNew_name();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED:
				return isNew_ordered();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE:
				return isNew_unique();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND:
				return getNew_lowerBound();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND:
				return getNew_upperBound();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY:
				return isNew_many();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED:
				return isNew_required();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE:
				return isNew_changeable();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE:
				return isNew_volatile();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT:
				return isNew_transient();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL:
				return getNew_defaultValueLiteral();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE:
				return getNew_defaultValue();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE:
				return isNew_unsettable();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED:
				return isNew_derived();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT:
				return isNew_containment();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER:
				return isNew_container();
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES:
				return isNew_resolveProxies();
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
			case EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				setOperation((ClassOp)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				setNew_name((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED:
				setNew_ordered((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE:
				setNew_unique((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND:
				setNew_lowerBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND:
				setNew_upperBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY:
				setNew_many((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED:
				setNew_required((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE:
				setNew_changeable((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE:
				setNew_volatile((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT:
				setNew_transient((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL:
				setNew_defaultValueLiteral((String)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE:
				setNew_defaultValue(newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE:
				setNew_unsettable((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED:
				setNew_derived((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT:
				setNew_containment((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER:
				setNew_container((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES:
				setNew_resolveProxies((Boolean)newValue);
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
			case EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				setNew_name(NEW_NAME_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED:
				setNew_ordered(NEW_ORDERED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE:
				setNew_unique(NEW_UNIQUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND:
				setNew_lowerBound(NEW_LOWER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND:
				setNew_upperBound(NEW_UPPER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY:
				setNew_many(NEW_MANY_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED:
				setNew_required(NEW_REQUIRED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE:
				setNew_changeable(NEW_CHANGEABLE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE:
				setNew_volatile(NEW_VOLATILE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT:
				setNew_transient(NEW_TRANSIENT_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL:
				setNew_defaultValueLiteral(NEW_DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE:
				setNew_defaultValue(NEW_DEFAULT_VALUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE:
				setNew_unsettable(NEW_UNSETTABLE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED:
				setNew_derived(NEW_DERIVED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT:
				setNew_containment(NEW_CONTAINMENT_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER:
				setNew_container(NEW_CONTAINER_EDEFAULT);
				return;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES:
				setNew_resolveProxies(NEW_RESOLVE_PROXIES_EDEFAULT);
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
			case EcoreDiffMMPackage.DIFF_EREFERENCE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? new_name != null : !NEW_NAME_EDEFAULT.equals(new_name);
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_ORDERED:
				return new_ordered != NEW_ORDERED_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNIQUE:
				return new_unique != NEW_UNIQUE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_LOWER_BOUND:
				return new_lowerBound != NEW_LOWER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UPPER_BOUND:
				return new_upperBound != NEW_UPPER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_MANY:
				return new_many != NEW_MANY_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_REQUIRED:
				return new_required != NEW_REQUIRED_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CHANGEABLE:
				return new_changeable != NEW_CHANGEABLE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_VOLATILE:
				return new_volatile != NEW_VOLATILE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_TRANSIENT:
				return new_transient != NEW_TRANSIENT_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE_LITERAL:
				return NEW_DEFAULT_VALUE_LITERAL_EDEFAULT == null ? new_defaultValueLiteral != null : !NEW_DEFAULT_VALUE_LITERAL_EDEFAULT.equals(new_defaultValueLiteral);
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DEFAULT_VALUE:
				return NEW_DEFAULT_VALUE_EDEFAULT == null ? new_defaultValue != null : !NEW_DEFAULT_VALUE_EDEFAULT.equals(new_defaultValue);
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_UNSETTABLE:
				return new_unsettable != NEW_UNSETTABLE_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_DERIVED:
				return new_derived != NEW_DERIVED_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINMENT:
				return new_containment != NEW_CONTAINMENT_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_CONTAINER:
				return new_container != NEW_CONTAINER_EDEFAULT;
			case EcoreDiffMMPackage.DIFF_EREFERENCE__NEW_RESOLVE_PROXIES:
				return new_resolveProxies != NEW_RESOLVE_PROXIES_EDEFAULT;
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
		result.append(", new_ordered: ");
		result.append(new_ordered);
		result.append(", new_unique: ");
		result.append(new_unique);
		result.append(", new_lowerBound: ");
		result.append(new_lowerBound);
		result.append(", new_upperBound: ");
		result.append(new_upperBound);
		result.append(", new_many: ");
		result.append(new_many);
		result.append(", new_required: ");
		result.append(new_required);
		result.append(", new_changeable: ");
		result.append(new_changeable);
		result.append(", new_volatile: ");
		result.append(new_volatile);
		result.append(", new_transient: ");
		result.append(new_transient);
		result.append(", new_defaultValueLiteral: ");
		result.append(new_defaultValueLiteral);
		result.append(", new_defaultValue: ");
		result.append(new_defaultValue);
		result.append(", new_unsettable: ");
		result.append(new_unsettable);
		result.append(", new_derived: ");
		result.append(new_derived);
		result.append(", new_containment: ");
		result.append(new_containment);
		result.append(", new_container: ");
		result.append(new_container);
		result.append(", new_resolveProxies: ");
		result.append(new_resolveProxies);
		result.append(')');
		return result.toString();
	}

} //DiffEReferenceImpl
