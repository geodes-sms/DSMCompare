/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEEnum_eLiterals;
import ecoreDiffMM.EEnum;
import ecoreDiffMM.EEnumLiteral;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EEnumImpl#getELiterals <em>ELiterals</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EEnumImpl#getDiffeLiterals <em>Diffe Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEnumImpl extends EDataTypeImpl implements EEnum {
	/**
	 * The cached value of the '{@link #getELiterals() <em>ELiterals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnumLiteral> eLiterals;

	/**
	 * The cached value of the '{@link #getDiffeLiterals() <em>Diffe Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEEnum_eLiterals> diffeLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEnumLiteral> getELiterals() {
		if (eLiterals == null) {
			eLiterals = new EObjectContainmentWithInverseEList<EEnumLiteral>(EEnumLiteral.class, this, EcoreDiffMMPackage.EENUM__ELITERALS, EcoreDiffMMPackage.EENUM_LITERAL__EENUM);
		}
		return eLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEEnum_eLiterals> getDiffeLiterals() {
		if (diffeLiterals == null) {
			diffeLiterals = new EObjectContainmentEList<DiffEEnum_eLiterals>(DiffEEnum_eLiterals.class, this, EcoreDiffMMPackage.EENUM__DIFFE_LITERALS);
		}
		return diffeLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnumLiteral getEEnumLiteral(String name) {
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
	public EEnumLiteral getEEnumLiteral(int value) {
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
	public EEnumLiteral getEEnumLiteralByLiteral(String literal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getELiterals()).basicAdd(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				return ((InternalEList<?>)getELiterals()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EENUM__DIFFE_LITERALS:
				return ((InternalEList<?>)getDiffeLiterals()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				return getELiterals();
			case EcoreDiffMMPackage.EENUM__DIFFE_LITERALS:
				return getDiffeLiterals();
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				getELiterals().clear();
				getELiterals().addAll((Collection<? extends EEnumLiteral>)newValue);
				return;
			case EcoreDiffMMPackage.EENUM__DIFFE_LITERALS:
				getDiffeLiterals().clear();
				getDiffeLiterals().addAll((Collection<? extends DiffEEnum_eLiterals>)newValue);
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				getELiterals().clear();
				return;
			case EcoreDiffMMPackage.EENUM__DIFFE_LITERALS:
				getDiffeLiterals().clear();
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
			case EcoreDiffMMPackage.EENUM__ELITERALS:
				return eLiterals != null && !eLiterals.isEmpty();
			case EcoreDiffMMPackage.EENUM__DIFFE_LITERALS:
				return diffeLiterals != null && !diffeLiterals.isEmpty();
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
			case EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL__STRING:
				return getEEnumLiteral((String)arguments.get(0));
			case EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL__INT:
				return getEEnumLiteral((Integer)arguments.get(0));
			case EcoreDiffMMPackage.EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING:
				return getEEnumLiteralByLiteral((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EEnumImpl
