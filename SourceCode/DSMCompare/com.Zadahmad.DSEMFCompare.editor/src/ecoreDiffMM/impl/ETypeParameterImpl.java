/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffETypeParameter_eBounds;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.ETypeParameterImpl#getEBounds <em>EBounds</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.ETypeParameterImpl#getDiffeBounds <em>Diffe Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETypeParameterImpl extends ENamedElementImpl implements ETypeParameter {
	/**
	 * The cached value of the '{@link #getEBounds() <em>EBounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eBounds;

	/**
	 * The cached value of the '{@link #getDiffeBounds() <em>Diffe Bounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffETypeParameter_eBounds> diffeBounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getETypeParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getEBounds() {
		if (eBounds == null) {
			eBounds = new EObjectContainmentEList<EGenericType>(EGenericType.class, this, EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS);
		}
		return eBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffETypeParameter_eBounds> getDiffeBounds() {
		if (diffeBounds == null) {
			diffeBounds = new EObjectContainmentEList<DiffETypeParameter_eBounds>(DiffETypeParameter_eBounds.class, this, EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS);
		}
		return diffeBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS:
				return ((InternalEList<?>)getEBounds()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS:
				return ((InternalEList<?>)getDiffeBounds()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS:
				return getEBounds();
			case EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS:
				return getDiffeBounds();
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
			case EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS:
				getEBounds().clear();
				getEBounds().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS:
				getDiffeBounds().clear();
				getDiffeBounds().addAll((Collection<? extends DiffETypeParameter_eBounds>)newValue);
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
			case EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS:
				getEBounds().clear();
				return;
			case EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS:
				getDiffeBounds().clear();
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
			case EcoreDiffMMPackage.ETYPE_PARAMETER__EBOUNDS:
				return eBounds != null && !eBounds.isEmpty();
			case EcoreDiffMMPackage.ETYPE_PARAMETER__DIFFE_BOUNDS:
				return diffeBounds != null && !diffeBounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ETypeParameterImpl
