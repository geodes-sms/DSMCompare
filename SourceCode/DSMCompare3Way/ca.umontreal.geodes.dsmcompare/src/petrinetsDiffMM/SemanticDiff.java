/**
 */
package petrinetsDiffMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsDiffMM.SemanticDiff#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticDiff()
 * @model
 * @generated
 */
public interface SemanticDiff extends SemanticObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"NON"</code>.
	 * The literals are from the enumeration {@link petrinetsDiffMM.AUTHOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see petrinetsDiffMM.AUTHOR
	 * @see #setAuthor(AUTHOR)
	 * @see petrinetsDiffMM.PetrinetsDiffMMPackage#getSemanticDiff_Author()
	 * @model default="NON" unique="false" required="true"
	 * @generated
	 */
	AUTHOR getAuthor();

	/**
	 * Sets the value of the '{@link petrinetsDiffMM.SemanticDiff#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see petrinetsDiffMM.AUTHOR
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AUTHOR value);

} // SemanticDiff
