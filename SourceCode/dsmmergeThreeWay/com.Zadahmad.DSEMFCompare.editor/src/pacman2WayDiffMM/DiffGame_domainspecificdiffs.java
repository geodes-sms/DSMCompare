/**
 */
package pacman2WayDiffMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Game domainspecificdiffs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getDiff_kind <em>Diff kind</em>}</li>
 *   <li>{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_domainspecificdiffs()
 * @model
 * @generated
 */
public interface DiffGame_domainspecificdiffs extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff kind</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link pacman2WayDiffMM.AscDiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.AscDiffKind
	 * @see #setDiff_kind(AscDiffKind)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_domainspecificdiffs_Diff_kind()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AscDiffKind getDiff_kind();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getDiff_kind <em>Diff kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind</em>' attribute.
	 * @see pacman2WayDiffMM.AscDiffKind
	 * @see #getDiff_kind()
	 * @generated
	 */
	void setDiff_kind(AscDiffKind value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(DomainSpecificDiff)
	 * @see pacman2WayDiffMM.Pacman2WayDiffMMPackage#getDiffGame_domainspecificdiffs_EType()
	 * @model required="true"
	 * @generated
	 */
	DomainSpecificDiff getEType();

	/**
	 * Sets the value of the '{@link pacman2WayDiffMM.DiffGame_domainspecificdiffs#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(DomainSpecificDiff value);

} // DiffGame_domainspecificdiffs
