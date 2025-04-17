/**
 */
package dssmm2WayDiffMM.impl;

import dssmm2WayDiffMM.CompositeFactor;
import dssmm2WayDiffMM.DiffCompositeFactor_subFactors;
import dssmm2WayDiffMM.Dssmm2WayDiffMMPackage;
import dssmm2WayDiffMM.Factor;

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
 *   <li>{@link dssmm2WayDiffMM.impl.CompositeFactorImpl#getSubFactors <em>Sub Factors</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.impl.CompositeFactorImpl#getDiffsubFactors <em>Diffsub Factors</em>}</li>
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
	 * The cached value of the '{@link #getDiffsubFactors() <em>Diffsub Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffsubFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffCompositeFactor_subFactors> diffsubFactors;

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
		return Dssmm2WayDiffMMPackage.Literals.COMPOSITE_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getSubFactors() {
		if (subFactors == null) {
			subFactors = new EObjectContainmentEList<Factor>(Factor.class, this, Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS);
		}
		return subFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffCompositeFactor_subFactors> getDiffsubFactors() {
		if (diffsubFactors == null) {
			diffsubFactors = new EObjectContainmentEList<DiffCompositeFactor_subFactors>(DiffCompositeFactor_subFactors.class, this, Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS);
		}
		return diffsubFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return ((InternalEList<?>)getSubFactors()).basicRemove(otherEnd, msgs);
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS:
				return ((InternalEList<?>)getDiffsubFactors()).basicRemove(otherEnd, msgs);
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
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return getSubFactors();
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS:
				return getDiffsubFactors();
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
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				getSubFactors().clear();
				getSubFactors().addAll((Collection<? extends Factor>)newValue);
				return;
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS:
				getDiffsubFactors().clear();
				getDiffsubFactors().addAll((Collection<? extends DiffCompositeFactor_subFactors>)newValue);
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
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				getSubFactors().clear();
				return;
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS:
				getDiffsubFactors().clear();
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
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__SUB_FACTORS:
				return subFactors != null && !subFactors.isEmpty();
			case Dssmm2WayDiffMMPackage.COMPOSITE_FACTOR__DIFFSUB_FACTORS:
				return diffsubFactors != null && !diffsubFactors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeFactorImpl
