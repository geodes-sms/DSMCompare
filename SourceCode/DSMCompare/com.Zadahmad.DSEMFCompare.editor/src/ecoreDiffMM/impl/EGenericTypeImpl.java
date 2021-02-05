/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEGenericType_eClassifier;
import ecoreDiffMM.DiffEGenericType_eLowerBound;
import ecoreDiffMM.DiffEGenericType_eRawType;
import ecoreDiffMM.DiffEGenericType_eTypeArguments;
import ecoreDiffMM.DiffEGenericType_eTypeParameter;
import ecoreDiffMM.DiffEGenericType_eUpperBound;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getERawType <em>ERaw Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getELowerBound <em>ELower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeUpperBound <em>Diffe Upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeTypeArguments <em>Diffe Type Arguments</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeRawType <em>Diffe Raw Type</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeLowerBound <em>Diffe Lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeTypeParameter <em>Diffe Type Parameter</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EGenericTypeImpl#getDiffeClassifier <em>Diffe Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EGenericTypeImpl extends MinimalEObjectImpl.Container implements EGenericType {
	/**
	 * The cached value of the '{@link #getEUpperBound() <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eUpperBound;

	/**
	 * The cached value of the '{@link #getETypeArguments() <em>EType Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eTypeArguments;

	/**
	 * The cached value of the '{@link #getERawType() <em>ERaw Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERawType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eRawType;

	/**
	 * The cached value of the '{@link #getELowerBound() <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELowerBound()
	 * @generated
	 * @ordered
	 */
	protected EGenericType eLowerBound;

	/**
	 * The cached value of the '{@link #getETypeParameter() <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameter()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter eTypeParameter;

	/**
	 * The cached value of the '{@link #getEClassifier() <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifier()
	 * @generated
	 * @ordered
	 */
	protected EClassifier eClassifier;

	/**
	 * The cached value of the '{@link #getDiffeUpperBound() <em>Diffe Upper Bound</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eUpperBound> diffeUpperBound;

	/**
	 * The cached value of the '{@link #getDiffeTypeArguments() <em>Diffe Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eTypeArguments> diffeTypeArguments;

	/**
	 * The cached value of the '{@link #getDiffeRawType() <em>Diffe Raw Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeRawType()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eRawType> diffeRawType;

	/**
	 * The cached value of the '{@link #getDiffeLowerBound() <em>Diffe Lower Bound</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eLowerBound> diffeLowerBound;

	/**
	 * The cached value of the '{@link #getDiffeTypeParameter() <em>Diffe Type Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eTypeParameter> diffeTypeParameter;

	/**
	 * The cached value of the '{@link #getDiffeClassifier() <em>Diffe Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEGenericType_eClassifier> diffeClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EGenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEGenericType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getEUpperBound() {
		return eUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEUpperBound(EGenericType newEUpperBound, NotificationChain msgs) {
		EGenericType oldEUpperBound = eUpperBound;
		eUpperBound = newEUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND, oldEUpperBound, newEUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEUpperBound(EGenericType newEUpperBound) {
		if (newEUpperBound != eUpperBound) {
			NotificationChain msgs = null;
			if (eUpperBound != null)
				msgs = ((InternalEObject)eUpperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND, null, msgs);
			if (newEUpperBound != null)
				msgs = ((InternalEObject)newEUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND, null, msgs);
			msgs = basicSetEUpperBound(newEUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND, newEUpperBound, newEUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getETypeArguments() {
		if (eTypeArguments == null) {
			eTypeArguments = new EObjectContainmentEList<EGenericType>(EGenericType.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS);
		}
		return eTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getERawType() {
		if (eRawType != null && eRawType.eIsProxy()) {
			InternalEObject oldERawType = (InternalEObject)eRawType;
			eRawType = (EClassifier)eResolveProxy(oldERawType);
			if (eRawType != oldERawType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreDiffMMPackage.EGENERIC_TYPE__ERAW_TYPE, oldERawType, eRawType));
			}
		}
		return eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetERawType() {
		return eRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getELowerBound() {
		return eLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELowerBound(EGenericType newELowerBound, NotificationChain msgs) {
		EGenericType oldELowerBound = eLowerBound;
		eLowerBound = newELowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND, oldELowerBound, newELowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setELowerBound(EGenericType newELowerBound) {
		if (newELowerBound != eLowerBound) {
			NotificationChain msgs = null;
			if (eLowerBound != null)
				msgs = ((InternalEObject)eLowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND, null, msgs);
			if (newELowerBound != null)
				msgs = ((InternalEObject)newELowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND, null, msgs);
			msgs = basicSetELowerBound(newELowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND, newELowerBound, newELowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETypeParameter getETypeParameter() {
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setETypeParameter(ETypeParameter newETypeParameter) {
		ETypeParameter oldETypeParameter = eTypeParameter;
		eTypeParameter = newETypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER, oldETypeParameter, eTypeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getEClassifier() {
		if (eClassifier != null && eClassifier.eIsProxy()) {
			InternalEObject oldEClassifier = (InternalEObject)eClassifier;
			eClassifier = (EClassifier)eResolveProxy(oldEClassifier);
			if (eClassifier != oldEClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER, oldEClassifier, eClassifier));
			}
		}
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetEClassifier() {
		return eClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEClassifier(EClassifier newEClassifier) {
		EClassifier oldEClassifier = eClassifier;
		eClassifier = newEClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER, oldEClassifier, eClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eUpperBound> getDiffeUpperBound() {
		if (diffeUpperBound == null) {
			diffeUpperBound = new EObjectContainmentEList<DiffEGenericType_eUpperBound>(DiffEGenericType_eUpperBound.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND);
		}
		return diffeUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eTypeArguments> getDiffeTypeArguments() {
		if (diffeTypeArguments == null) {
			diffeTypeArguments = new EObjectContainmentEList<DiffEGenericType_eTypeArguments>(DiffEGenericType_eTypeArguments.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS);
		}
		return diffeTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eRawType> getDiffeRawType() {
		if (diffeRawType == null) {
			diffeRawType = new EObjectContainmentEList<DiffEGenericType_eRawType>(DiffEGenericType_eRawType.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE);
		}
		return diffeRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eLowerBound> getDiffeLowerBound() {
		if (diffeLowerBound == null) {
			diffeLowerBound = new EObjectContainmentEList<DiffEGenericType_eLowerBound>(DiffEGenericType_eLowerBound.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND);
		}
		return diffeLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eTypeParameter> getDiffeTypeParameter() {
		if (diffeTypeParameter == null) {
			diffeTypeParameter = new EObjectContainmentEList<DiffEGenericType_eTypeParameter>(DiffEGenericType_eTypeParameter.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER);
		}
		return diffeTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEGenericType_eClassifier> getDiffeClassifier() {
		if (diffeClassifier == null) {
			diffeClassifier = new EObjectContainmentEList<DiffEGenericType_eClassifier>(DiffEGenericType_eClassifier.class, this, EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER);
		}
		return diffeClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstance(Object object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND:
				return basicSetEUpperBound(null, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return ((InternalEList<?>)getETypeArguments()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND:
				return basicSetELowerBound(null, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND:
				return ((InternalEList<?>)getDiffeUpperBound()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getDiffeTypeArguments()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE:
				return ((InternalEList<?>)getDiffeRawType()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND:
				return ((InternalEList<?>)getDiffeLowerBound()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER:
				return ((InternalEList<?>)getDiffeTypeParameter()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER:
				return ((InternalEList<?>)getDiffeClassifier()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND:
				return getEUpperBound();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return getETypeArguments();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ERAW_TYPE:
				if (resolve) return getERawType();
				return basicGetERawType();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND:
				return getELowerBound();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				return getETypeParameter();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER:
				if (resolve) return getEClassifier();
				return basicGetEClassifier();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND:
				return getDiffeUpperBound();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS:
				return getDiffeTypeArguments();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE:
				return getDiffeRawType();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND:
				return getDiffeLowerBound();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER:
				return getDiffeTypeParameter();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER:
				return getDiffeClassifier();
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
			case EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND:
				setEUpperBound((EGenericType)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				getETypeArguments().clear();
				getETypeArguments().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND:
				setELowerBound((EGenericType)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				setETypeParameter((ETypeParameter)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER:
				setEClassifier((EClassifier)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND:
				getDiffeUpperBound().clear();
				getDiffeUpperBound().addAll((Collection<? extends DiffEGenericType_eUpperBound>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS:
				getDiffeTypeArguments().clear();
				getDiffeTypeArguments().addAll((Collection<? extends DiffEGenericType_eTypeArguments>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE:
				getDiffeRawType().clear();
				getDiffeRawType().addAll((Collection<? extends DiffEGenericType_eRawType>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND:
				getDiffeLowerBound().clear();
				getDiffeLowerBound().addAll((Collection<? extends DiffEGenericType_eLowerBound>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER:
				getDiffeTypeParameter().clear();
				getDiffeTypeParameter().addAll((Collection<? extends DiffEGenericType_eTypeParameter>)newValue);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER:
				getDiffeClassifier().clear();
				getDiffeClassifier().addAll((Collection<? extends DiffEGenericType_eClassifier>)newValue);
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
			case EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND:
				setEUpperBound((EGenericType)null);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				getETypeArguments().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND:
				setELowerBound((EGenericType)null);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				setETypeParameter((ETypeParameter)null);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER:
				setEClassifier((EClassifier)null);
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND:
				getDiffeUpperBound().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS:
				getDiffeTypeArguments().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE:
				getDiffeRawType().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND:
				getDiffeLowerBound().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER:
				getDiffeTypeParameter().clear();
				return;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER:
				getDiffeClassifier().clear();
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
			case EcoreDiffMMPackage.EGENERIC_TYPE__EUPPER_BOUND:
				return eUpperBound != null;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_ARGUMENTS:
				return eTypeArguments != null && !eTypeArguments.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__ERAW_TYPE:
				return eRawType != null;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ELOWER_BOUND:
				return eLowerBound != null;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ETYPE_PARAMETER:
				return eTypeParameter != null;
			case EcoreDiffMMPackage.EGENERIC_TYPE__ECLASSIFIER:
				return eClassifier != null;
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_UPPER_BOUND:
				return diffeUpperBound != null && !diffeUpperBound.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_ARGUMENTS:
				return diffeTypeArguments != null && !diffeTypeArguments.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_RAW_TYPE:
				return diffeRawType != null && !diffeRawType.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_LOWER_BOUND:
				return diffeLowerBound != null && !diffeLowerBound.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_TYPE_PARAMETER:
				return diffeTypeParameter != null && !diffeTypeParameter.isEmpty();
			case EcoreDiffMMPackage.EGENERIC_TYPE__DIFFE_CLASSIFIER:
				return diffeClassifier != null && !diffeClassifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcoreDiffMMPackage.EGENERIC_TYPE___IS_INSTANCE__OBJECT:
				return isInstance(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EGenericTypeImpl
