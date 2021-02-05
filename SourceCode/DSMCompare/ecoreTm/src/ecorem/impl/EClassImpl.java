/**
 */
package ecorem.impl;

import ecorem.EAttribute;
import ecorem.EClass;
import ecorem.EOperation;
import ecorem.EReference;
import ecorem.EcoremPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecorem.impl.EClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecorem.impl.EClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecorem.impl.EClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecorem.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecorem.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecorem.impl.EClassImpl#getEReferences <em>EReferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEAttributes() <em>EAttributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> eAttributes;

	/**
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> eOperations;

	/**
	 * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eSuperTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return EcoremPackage.Literals.ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoremPackage.ECLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoremPackage.ECLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAttribute> getEAttributes() {
		if (eAttributes == null) {
			eAttributes = new EObjectContainmentWithInverseEList<EAttribute>(EAttribute.class, this, EcoremPackage.ECLASS__EATTRIBUTES, EcoremPackage.EATTRIBUTE__ECONTAINING_CLASS);
		}
		return eAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentWithInverseEList<EOperation>(EOperation.class, this, EcoremPackage.ECLASS__EOPERATIONS, EcoremPackage.EOPERATION__ECONTAINING_CLASS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getESuperTypes() {
		if (eSuperTypes == null) {
			eSuperTypes = new EObjectResolvingEList.Unsettable<EClass>(EClass.class, this, EcoremPackage.ECLASS__ESUPER_TYPES);
		}
		return eSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetESuperTypes() {
		if (eSuperTypes != null) ((InternalEList.Unsettable<?>)eSuperTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetESuperTypes() {
		return eSuperTypes != null && ((InternalEList.Unsettable<?>)eSuperTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EReference> getEReferences() {
		// TODO: implement this method to return the 'EReferences' containment reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoremPackage.ECLASS__EATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAttributes()).basicAdd(otherEnd, msgs);
			case EcoremPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoremPackage.ECLASS__EATTRIBUTES:
				return ((InternalEList<?>)getEAttributes()).basicRemove(otherEnd, msgs);
			case EcoremPackage.ECLASS__EOPERATIONS:
				return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
			case EcoremPackage.ECLASS__EREFERENCES:
				return ((InternalEList<?>)getEReferences()).basicRemove(otherEnd, msgs);
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
			case EcoremPackage.ECLASS__ABSTRACT:
				return isAbstract();
			case EcoremPackage.ECLASS__INTERFACE:
				return isInterface();
			case EcoremPackage.ECLASS__EATTRIBUTES:
				return getEAttributes();
			case EcoremPackage.ECLASS__EOPERATIONS:
				return getEOperations();
			case EcoremPackage.ECLASS__ESUPER_TYPES:
				return getESuperTypes();
			case EcoremPackage.ECLASS__EREFERENCES:
				return getEReferences();
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
			case EcoremPackage.ECLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EcoremPackage.ECLASS__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case EcoremPackage.ECLASS__EATTRIBUTES:
				getEAttributes().clear();
				getEAttributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case EcoremPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case EcoremPackage.ECLASS__ESUPER_TYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case EcoremPackage.ECLASS__EREFERENCES:
				getEReferences().clear();
				getEReferences().addAll((Collection<? extends EReference>)newValue);
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
			case EcoremPackage.ECLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EcoremPackage.ECLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case EcoremPackage.ECLASS__EATTRIBUTES:
				getEAttributes().clear();
				return;
			case EcoremPackage.ECLASS__EOPERATIONS:
				getEOperations().clear();
				return;
			case EcoremPackage.ECLASS__ESUPER_TYPES:
				unsetESuperTypes();
				return;
			case EcoremPackage.ECLASS__EREFERENCES:
				getEReferences().clear();
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
			case EcoremPackage.ECLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case EcoremPackage.ECLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case EcoremPackage.ECLASS__EATTRIBUTES:
				return eAttributes != null && !eAttributes.isEmpty();
			case EcoremPackage.ECLASS__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
			case EcoremPackage.ECLASS__ESUPER_TYPES:
				return isSetESuperTypes();
			case EcoremPackage.ECLASS__EREFERENCES:
				return !getEReferences().isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //EClassImpl
