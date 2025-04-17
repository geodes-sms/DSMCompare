/**
 */
package petrinetsCRRuleMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Semantic Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetsCRRuleMM.Pattern_SemanticDiff#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticDiff()
 * @model
 * @generated
 */
public interface Pattern_SemanticDiff extends Pattern_SemanticObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinetsCRRuleMM.AUTHOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see petrinetsCRRuleMM.AUTHOR
	 * @see #setAuthor(AUTHOR)
	 * @see petrinetsCRRuleMM.PetrinetsCRRuleMMPackage#getPattern_SemanticDiff_Author()
	 * @model unique="false" required="true"
	 * @generated
	 */
	AUTHOR getAuthor();

	/**
	 * Sets the value of the '{@link petrinetsCRRuleMM.Pattern_SemanticDiff#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see petrinetsCRRuleMM.AUTHOR
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AUTHOR value);

} // Pattern_SemanticDiff
