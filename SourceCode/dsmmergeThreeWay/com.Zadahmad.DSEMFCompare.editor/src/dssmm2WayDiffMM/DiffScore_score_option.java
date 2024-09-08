/**
 */
package dssmm2WayDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Score score option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm2WayDiffMM.DiffScore_score_option#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link dssmm2WayDiffMM.DiffScore_score_option#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_score_option()
 * @model
 * @generated
 */
public interface DiffScore_score_option extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link dssmm2WayDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.AscDiffKind
	 * @see #setDiff_kind(AscDiffKind)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_score_option_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore_score_option#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see dssmm2WayDiffMM.AscDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Option)
	 * @see dssmm2WayDiffMM.Dssmm2WayDiffMMPackage#getDiffScore_score_option_EType()
	 * @model required="true"
	 * @generated
	 */
	Option getEType();

	/**
	 * Sets the value of the '{@link dssmm2WayDiffMM.DiffScore_score_option#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Option value);

} // DiffScore_score_option
