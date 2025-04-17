/**
 */
package pacmanCRRuleMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Diff Positionable Entity on</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern <em>ID Pattern</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isFilter <em>Filter</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsMerged <em>Is Merged</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_Group <em>Diff Group</em>}</li>
 *   <li>{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getEType <em>EType</em>}</li>
 * </ul>
 *
 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on()
 * @model
 * @generated
 */
public interface Pattern_DiffPositionableEntity_on extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Pattern</em>' attribute.
	 * @see #setID_Pattern(int)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_ID_Pattern()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getID_Pattern();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getID_Pattern <em>ID Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Pattern</em>' attribute.
	 * @see #getID_Pattern()
	 * @generated
	 */
	void setID_Pattern(int value);

	/**
	 * Returns the value of the '<em><b>Is Forbidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbidden</em>' attribute.
	 * @see #setIsForbidden(boolean)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_IsForbidden()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbidden();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsForbidden <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbidden</em>' attribute.
	 * @see #isIsForbidden()
	 * @generated
	 */
	void setIsForbidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Diff kind Left</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Left(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_Diff_kind_Left()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Left();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Left <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Left</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #getDiff_kind_Left()
	 * @generated
	 */
	void setDiff_kind_Left(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Diff kind Right</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.DiffKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #setDiff_kind_Right(DiffKind)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_Diff_kind_Right()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DiffKind getDiff_kind_Right();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_kind_Right <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff kind Right</em>' attribute.
	 * @see pacmanCRRuleMM.DiffKind
	 * @see #getDiff_kind_Right()
	 * @generated
	 */
	void setDiff_kind_Right(DiffKind value);

	/**
	 * Returns the value of the '<em><b>Change Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pacmanCRRuleMM.ChangeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #setChangeStatus(ChangeStatus)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_ChangeStatus()
	 * @model unique="false" required="true"
	 * @generated
	 */
	ChangeStatus getChangeStatus();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getChangeStatus <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Status</em>' attribute.
	 * @see pacmanCRRuleMM.ChangeStatus
	 * @see #getChangeStatus()
	 * @generated
	 */
	void setChangeStatus(ChangeStatus value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(boolean)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_Filter()
	 * @model required="true"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Merged</em>' attribute.
	 * @see #setIsMerged(boolean)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_IsMerged()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMerged();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#isIsMerged <em>Is Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Merged</em>' attribute.
	 * @see #isIsMerged()
	 * @generated
	 */
	void setIsMerged(boolean value);

	/**
	 * Returns the value of the '<em><b>Diff Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Group</em>' attribute.
	 * @see #setDiff_Group(String)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_Diff_Group()
	 * @model required="true"
	 * @generated
	 */
	String getDiff_Group();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getDiff_Group <em>Diff Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Group</em>' attribute.
	 * @see #getDiff_Group()
	 * @generated
	 */
	void setDiff_Group(String value);

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(Pattern_GridNode)
	 * @see pacmanCRRuleMM.PacmanCRRuleMMPackage#getPattern_DiffPositionableEntity_on_EType()
	 * @model required="true"
	 * @generated
	 */
	Pattern_GridNode getEType();

	/**
	 * Sets the value of the '{@link pacmanCRRuleMM.Pattern_DiffPositionableEntity_on#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(Pattern_GridNode value);

} // Pattern_DiffPositionableEntity_on
