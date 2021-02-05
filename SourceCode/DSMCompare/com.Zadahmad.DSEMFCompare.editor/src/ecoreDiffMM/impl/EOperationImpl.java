/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEOperation_eContainingClass;
import ecoreDiffMM.DiffEOperation_eExceptions;
import ecoreDiffMM.DiffEOperation_eGenericExceptions;
import ecoreDiffMM.DiffEOperation_eParameters;
import ecoreDiffMM.DiffEOperation_eTypeParameters;
import ecoreDiffMM.EClassifier;
import ecoreDiffMM.EGenericType;
import ecoreDiffMM.EOperation;
import ecoreDiffMM.EParameter;
import ecoreDiffMM.ETypeParameter;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getDiffeContainingClass <em>Diffe Containing Class</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getDiffeTypeParameters <em>Diffe Type Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getDiffeParameters <em>Diffe Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getDiffeExceptions <em>Diffe Exceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EOperationImpl#getDiffeGenericExceptions <em>Diffe Generic Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationImpl extends ETypedElementImpl implements EOperation {
	/**
	 * The cached value of the '{@link #getETypeParameters() <em>EType Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeParameter> eTypeParameters;

	/**
	 * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> eParameters;

	/**
	 * The cached value of the '{@link #getEExceptions() <em>EExceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eExceptions;

	/**
	 * The cached value of the '{@link #getEGenericExceptions() <em>EGeneric Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericExceptions;

	/**
	 * The cached value of the '{@link #getDiffeContainingClass() <em>Diffe Containing Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeContainingClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation_eContainingClass> diffeContainingClass;

	/**
	 * The cached value of the '{@link #getDiffeTypeParameters() <em>Diffe Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation_eTypeParameters> diffeTypeParameters;

	/**
	 * The cached value of the '{@link #getDiffeParameters() <em>Diffe Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation_eParameters> diffeParameters;

	/**
	 * The cached value of the '{@link #getDiffeExceptions() <em>Diffe Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation_eExceptions> diffeExceptions;

	/**
	 * The cached value of the '{@link #getDiffeGenericExceptions() <em>Diffe Generic Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeGenericExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEOperation_eGenericExceptions> diffeGenericExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ecoreDiffMM.EClass getEContainingClass() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS) return null;
		return (ecoreDiffMM.EClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ETypeParameter> getETypeParameters() {
		if (eTypeParameters == null) {
			eTypeParameters = new EObjectContainmentEList<ETypeParameter>(ETypeParameter.class, this, EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS);
		}
		return eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getEParameters() {
		if (eParameters == null) {
			eParameters = new EObjectContainmentWithInverseEList<EParameter>(EParameter.class, this, EcoreDiffMMPackage.EOPERATION__EPARAMETERS, EcoreDiffMMPackage.EPARAMETER__EOPERATION);
		}
		return eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClassifier> getEExceptions() {
		if (eExceptions == null) {
			eExceptions = new EObjectResolvingEList.Unsettable<EClassifier>(EClassifier.class, this, EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS);
		}
		return eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEExceptions() {
		if (eExceptions != null) ((InternalEList.Unsettable<?>)eExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEExceptions() {
		return eExceptions != null && ((InternalEList.Unsettable<?>)eExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EGenericType> getEGenericExceptions() {
		if (eGenericExceptions == null) {
			eGenericExceptions = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this, EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS);
		}
		return eGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericExceptions() {
		if (eGenericExceptions != null) ((InternalEList.Unsettable<?>)eGenericExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericExceptions() {
		return eGenericExceptions != null && ((InternalEList.Unsettable<?>)eGenericExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEOperation_eContainingClass> getDiffeContainingClass() {
		if (diffeContainingClass == null) {
			diffeContainingClass = new EObjectContainmentEList<DiffEOperation_eContainingClass>(DiffEOperation_eContainingClass.class, this, EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS);
		}
		return diffeContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEOperation_eTypeParameters> getDiffeTypeParameters() {
		if (diffeTypeParameters == null) {
			diffeTypeParameters = new EObjectContainmentEList<DiffEOperation_eTypeParameters>(DiffEOperation_eTypeParameters.class, this, EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS);
		}
		return diffeTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEOperation_eParameters> getDiffeParameters() {
		if (diffeParameters == null) {
			diffeParameters = new EObjectContainmentEList<DiffEOperation_eParameters>(DiffEOperation_eParameters.class, this, EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS);
		}
		return diffeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEOperation_eExceptions> getDiffeExceptions() {
		if (diffeExceptions == null) {
			diffeExceptions = new EObjectContainmentEList<DiffEOperation_eExceptions>(DiffEOperation_eExceptions.class, this, EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS);
		}
		return diffeExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEOperation_eGenericExceptions> getDiffeGenericExceptions() {
		if (diffeGenericExceptions == null) {
			diffeGenericExceptions = new EObjectContainmentEList<DiffEOperation_eGenericExceptions>(DiffEOperation_eGenericExceptions.class, this, EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS);
		}
		return diffeGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOperationID() {
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
	public boolean isOverrideOf(EOperation someOperation) {
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
			case EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEParameters()).basicAdd(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS:
				return eBasicSetContainer(null, EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS:
				return ((InternalEList<?>)getETypeParameters()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<?>)getEParameters()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return ((InternalEList<?>)getEGenericExceptions()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS:
				return ((InternalEList<?>)getDiffeContainingClass()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS:
				return ((InternalEList<?>)getDiffeTypeParameters()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS:
				return ((InternalEList<?>)getDiffeParameters()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS:
				return ((InternalEList<?>)getDiffeExceptions()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS:
				return ((InternalEList<?>)getDiffeGenericExceptions()).basicRemove(otherEnd, msgs);
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
			case EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.ECLASS__EOPERATIONS, ecoreDiffMM.EClass.class, msgs);
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
			case EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass();
			case EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS:
				return getETypeParameters();
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				return getEParameters();
			case EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS:
				return getEExceptions();
			case EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return getEGenericExceptions();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS:
				return getDiffeContainingClass();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS:
				return getDiffeTypeParameters();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS:
				return getDiffeParameters();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS:
				return getDiffeExceptions();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS:
				return getDiffeGenericExceptions();
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
			case EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				getEParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS:
				getEExceptions().clear();
				getEExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				getEGenericExceptions().clear();
				getEGenericExceptions().addAll((Collection<? extends EGenericType>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS:
				getDiffeContainingClass().clear();
				getDiffeContainingClass().addAll((Collection<? extends DiffEOperation_eContainingClass>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS:
				getDiffeTypeParameters().clear();
				getDiffeTypeParameters().addAll((Collection<? extends DiffEOperation_eTypeParameters>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS:
				getDiffeParameters().clear();
				getDiffeParameters().addAll((Collection<? extends DiffEOperation_eParameters>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS:
				getDiffeExceptions().clear();
				getDiffeExceptions().addAll((Collection<? extends DiffEOperation_eExceptions>)newValue);
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS:
				getDiffeGenericExceptions().clear();
				getDiffeGenericExceptions().addAll((Collection<? extends DiffEOperation_eGenericExceptions>)newValue);
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
			case EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS:
				unsetEExceptions();
				return;
			case EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				unsetEGenericExceptions();
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS:
				getDiffeContainingClass().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS:
				getDiffeTypeParameters().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS:
				getDiffeParameters().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS:
				getDiffeExceptions().clear();
				return;
			case EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS:
				getDiffeGenericExceptions().clear();
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
			case EcoreDiffMMPackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass() != null;
			case EcoreDiffMMPackage.EOPERATION__ETYPE_PARAMETERS:
				return eTypeParameters != null && !eTypeParameters.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__EPARAMETERS:
				return eParameters != null && !eParameters.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__EEXCEPTIONS:
				return isSetEExceptions();
			case EcoreDiffMMPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return isSetEGenericExceptions();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_CONTAINING_CLASS:
				return diffeContainingClass != null && !diffeContainingClass.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_TYPE_PARAMETERS:
				return diffeTypeParameters != null && !diffeTypeParameters.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_PARAMETERS:
				return diffeParameters != null && !diffeParameters.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_EXCEPTIONS:
				return diffeExceptions != null && !diffeExceptions.isEmpty();
			case EcoreDiffMMPackage.EOPERATION__DIFFE_GENERIC_EXCEPTIONS:
				return diffeGenericExceptions != null && !diffeGenericExceptions.isEmpty();
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
			case EcoreDiffMMPackage.EOPERATION___GET_OPERATION_ID:
				return getOperationID();
			case EcoreDiffMMPackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION:
				return isOverrideOf((EOperation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EOperationImpl
