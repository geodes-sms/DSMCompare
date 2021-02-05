/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffETypedElement_eGenericType;
import ecoreDiffMM.DiffETypedElement_eType;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.ETypedElement;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#isMany <em>Many</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getEType <em>EType</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getEGenericType <em>EGeneric Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getDiffeType <em>Diffe Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypedElementImpl#getDiffeGenericType <em>Diffe Generic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ETypedElementImpl extends ENamedElementImpl implements ETypedElement {
	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getDiffeType() <em>Diffe Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeType()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffETypedElement_eType> diffeType;

	/**
	 * The cached value of the '{@link #getDiffeGenericType() <em>Diffe Generic Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeGenericType()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffETypedElement_eGenericType> diffeGenericType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getETypedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMany() {
		// TODO: implement this method to return the 'Many' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		// TODO: implement this method to return the 'Required' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getEType() {
		EClassifier eType = basicGetEType();
		return eType != null && eType.eIsProxy() ? (EClassifier)eResolveProxy((InternalEObject)eType) : eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEType() {
		// TODO: implement this method to return the 'EType' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEType(EClassifier newEType) {
		// TODO: implement this method to set the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEType() {
		// TODO: implement this method to unset the 'EType' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEType() {
		// TODO: implement this method to return whether the 'EType' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getEGenericType() {
		// TODO: implement this method to return the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEGenericType(EGenericType newEGenericType, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'EGeneric Type' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEGenericType(EGenericType newEGenericType) {
		// TODO: implement this method to set the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEGenericType(NotificationChain msgs) {
		// TODO: implement this method to unset the contained 'EGeneric Type' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericType() {
		// TODO: implement this method to unset the 'EGeneric Type' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericType() {
		// TODO: implement this method to return whether the 'EGeneric Type' containment reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffETypedElement_eType> getDiffeType() {
		if (diffeType == null) {
			diffeType = new EObjectContainmentEList<DiffETypedElement_eType>(DiffETypedElement_eType.class, this, EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE);
		}
		return diffeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffETypedElement_eGenericType> getDiffeGenericType() {
		if (diffeGenericType == null) {
			diffeGenericType = new EObjectContainmentEList<DiffETypedElement_eGenericType>(DiffETypedElement_eGenericType.class, this, EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE);
		}
		return diffeGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE:
				return basicUnsetEGenericType(msgs);
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE:
				return ((InternalEList<?>)getDiffeType()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE:
				return ((InternalEList<?>)getDiffeGenericType()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED:
				return isOrdered();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE:
				return isUnique();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND:
				return getLowerBound();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND:
				return getUpperBound();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__MANY:
				return isMany();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__REQUIRED:
				return isRequired();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE:
				return getEGenericType();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE:
				return getDiffeType();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE:
				return getDiffeGenericType();
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
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ETYPE:
				setEType((EClassifier)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE:
				setEGenericType((EGenericType)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE:
				getDiffeType().clear();
				getDiffeType().addAll((Collection<? extends DiffETypedElement_eType>)newValue);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE:
				getDiffeGenericType().clear();
				getDiffeGenericType().addAll((Collection<? extends DiffETypedElement_eGenericType>)newValue);
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
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ETYPE:
				unsetEType();
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE:
				unsetEGenericType();
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE:
				getDiffeType().clear();
				return;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE:
				getDiffeGenericType().clear();
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
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__MANY:
				return isMany() != MANY_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case EcoreDiffMMPackage.ETYPED_ELEMENT__ETYPE:
				return isSetEType();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__EGENERIC_TYPE:
				return isSetEGenericType();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_TYPE:
				return diffeType != null && !diffeType.isEmpty();
			case EcoreDiffMMPackage.ETYPED_ELEMENT__DIFFE_GENERIC_TYPE:
				return diffeGenericType != null && !diffeGenericType.isEmpty();
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
		result.append(" (ordered: ");
		result.append(ordered);
		result.append(", unique: ");
		result.append(unique);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //ETypedElementImpl
