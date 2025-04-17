/**
 */
package dssmmDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Decision Support model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffDecisionSupport_model#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.DiffDecisionSupport_model#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffDecisionSupport_model()
 * @model
 * @generated
 */
public interface DiffDecisionSupport_model extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.AscDiffKind
	 * @see #setDiff_kind_Left(AscDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffDecisionSupport_model_Diff_kind_Left()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see dssmmDiffMM.AscDiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see dssmmDiffMM.AscDiffKind
	 * @see #setDiff_kind_Right(AscDiffKind)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffDecisionSupport_model_Diff_kind_Right()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffDecisionSupport_model#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see dssmmDiffMM.AscDiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmmDiffMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffDecisionSupport_model_ChangeStatus()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffDecisionSupport_model#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see dssmmDiffMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Model)
	 * @see dssmmDiffMM.DssmmDiffMMPackage#getDiffDecisionSupport_model_EType()
	 * @model required="true"
	 * @generated
	 */
	Model getEType();

	/**
	 * Sets the value of the '{@link dssmmDiffMM.DiffDecisionSupport_model#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Model value);

} // DiffDecisionSupport_model
