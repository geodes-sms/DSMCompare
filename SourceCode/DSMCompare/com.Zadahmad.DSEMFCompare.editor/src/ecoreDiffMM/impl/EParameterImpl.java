/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEParameter_eOperation;
import ecoreDiffMM.EOperation;
import ecoreDiffMM.EParameter;
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
 * An implementation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EParameterImpl#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EParameterImpl#getDiffeOperation <em>Diffe Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EParameterImpl extends ETypedElementImpl implements EParameter {
	/**
	 * The cached value of the '{@link #getDiffeOperation() <em>Diffe Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEParameter_eOperation> diffeOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEOperation() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.EPARAMETER__EOPERATION) return null;
		return (EOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEParameter_eOperation> getDiffeOperation() {
		if (diffeOperation == null) {
			diffeOperation = new EObjectContainmentEList<DiffEParameter_eOperation>(DiffEParameter_eOperation.class, this, EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION);
		}
		return diffeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EPARAMETER__EOPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoreDiffMMPackage.EPARAMETER__EOPERATION, msgs);
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
			case EcoreDiffMMPackage.EPARAMETER__EOPERATION:
				return eBasicSetContainer(null, EcoreDiffMMPackage.EPARAMETER__EOPERATION, msgs);
			case EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION:
				return ((InternalEList<?>)getDiffeOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcoreDiffMMPackage.EPARAMETER__EOPERATION:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.EOPERATION__EPARAMETERS, EOperation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.EPARAMETER__EOPERATION:
				return getEOperation();
			case EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION:
				return getDiffeOperation();
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
			case EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION:
				getDiffeOperation().clear();
				getDiffeOperation().addAll((Collection<? extends DiffEParameter_eOperation>)newValue);
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
			case EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION:
				getDiffeOperation().clear();
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
			case EcoreDiffMMPackage.EPARAMETER__EOPERATION:
				return getEOperation() != null;
			case EcoreDiffMMPackage.EPARAMETER__DIFFE_OPERATION:
				return diffeOperation != null && !diffeOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EParameterImpl
