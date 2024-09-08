/**
 */
package refactoringDiffMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringDiffMM.SemanticConflict;
import refactoringDiffMM.SemanticDiff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.impl.SemanticConflictImpl#getSemanticdiffs <em>Semanticdiffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticConflictImpl extends SemanticObjectImpl implements SemanticConflict {
	/**
	 * The cached value of the '{@link #getSemanticdiffs() <em>Semanticdiffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticdiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticDiff> semanticdiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringDiffMMPackage.Literals.SEMANTIC_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticDiff> getSemanticdiffs() {
		if (semanticdiffs == null) {
			semanticdiffs = new EObjectContainmentEList<SemanticDiff>(SemanticDiff.class, this, RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS);
		}
		return semanticdiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS:
				return ((InternalEList<?>)getSemanticdiffs()).basicRemove(otherEnd, msgs);
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
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS:
				return getSemanticdiffs();
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
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS:
				getSemanticdiffs().clear();
				getSemanticdiffs().addAll((Collection<? extends SemanticDiff>)newValue);
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
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS:
				getSemanticdiffs().clear();
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
			case RefactoringDiffMMPackage.SEMANTIC_CONFLICT__SEMANTICDIFFS:
				return semanticdiffs != null && !semanticdiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticConflictImpl
