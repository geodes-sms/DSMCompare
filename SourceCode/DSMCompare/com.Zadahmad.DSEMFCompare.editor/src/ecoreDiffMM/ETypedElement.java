/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.ETypedElement#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#isMany <em>Many</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#isRequired <em>Required</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getEType <em>EType</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getEGenericType <em>EGeneric Type</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getDiffeType <em>Diffe Type</em>}</li>
 *   <li>{@link ecoreDiffMM.ETypedElement#getDiffeGenericType <em>Diffe Generic Type</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidLowerBound ValidUpperBound ConsistentBounds ValidType'"
 * @generated
 */
public interface ETypedElement extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_Ordered()
	 * @model default="true" dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_Unique()
	 * @model default="true" dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_LowerBound()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_UpperBound()
	 * @model default="1" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_Many()
	 * @model dataType="ecoreDiffMM.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_Required()
	 * @model dataType="ecoreDiffMM.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EClassifier)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_EType()
	 * @model unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EClassifier getEType();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #setEGenericType(EGenericType)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_EGenericType()
	 * @model containment="true" unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EGenericType getEGenericType();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.ETypedElement#getEGenericType <em>EGeneric Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #getEGenericType()
	 * @generated
	 */
	void setEGenericType(EGenericType value);

	/**
	 * Returns the value of the '<em><b>Diffe Type</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffETypedElement_eType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Type</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_DiffeType()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffETypedElement_eType> getDiffeType();

	/**
	 * Returns the value of the '<em><b>Diffe Generic Type</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffETypedElement_eGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Generic Type</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getETypedElement_DiffeGenericType()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffETypedElement_eGenericType> getDiffeGenericType();

} // ETypedElement
