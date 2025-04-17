/**
 */
package dssmm.impl;

import dssmm.CompositeFactor;
import dssmm.DssmmPackage;
import dssmm.Factor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmm.impl.CompositeFactorImpl#getSubFactors <em>Sub Factors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeFactorImpl extends FactorImpl implements CompositeFactor {
	/**
	 * The cached value of the '{@link #getSubFactors() <em>Sub Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> subFactors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmPackage.Literals.COMPOSITE_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getSubFactors() {
		if (subFactors == null) {
			subFactors = new EObjectContainmentEList<Factor>(Factor.class, this, DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS);
		}
		return subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return ((InternalEList<?>)getSubFactors()).basicRemove(otherEnd, msgs);
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
			case DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return getSubFactors();
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
			case DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				getSubFactors().clear();
				getSubFactors().addAll((Collection<? extends Factor>)newValue);
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
			case DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				getSubFactors().clear();
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
			case DssmmPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return subFactors != null && !subFactors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeFactorImpl
