/**
 */
package refactoringDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link refactoringDiffMM.SemanticDiff#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see refactoringDiffMM.RefactoringDiffMMPackage#getSemanticDiff()
 * @model
 * @generated
 */
public interface SemanticDiff extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link refactoringDiffMM.AUTHOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see refactoringDiffMM.AUTHOR
	 * @see #setAuthor(AUTHOR)
	 * @see refactoringDiffMM.RefactoringDiffMMPackage#getSemanticDiff_Author()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AUTHOR getAuthor();

	/**
	 * Sets the value of the '{@link refactoringDiffMM.SemanticDiff#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see refactoringDiffMM.AUTHOR
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AUTHOR value);

} // SemanticDiff
