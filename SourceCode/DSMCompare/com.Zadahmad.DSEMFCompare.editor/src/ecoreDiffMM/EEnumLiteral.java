/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EEnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link ecoreDiffMM.EEnumLiteral#getInstance <em>Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.EEnumLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.EEnumLiteral#getEEnum <em>EEnum</em>}</li>
 *   <li>{@link ecoreDiffMM.EEnumLiteral#getDiffeEnum <em>Diffe Enum</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral()
 * @model
 * @generated
 */
public interface EEnumLiteral extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral_Value()
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EEnumLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(Enumerator)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral_Instance()
	 * @model dataType="ecoreDiffMM.EEnumerator" transient="true"
	 * @generated
	 */
	Enumerator getInstance();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EEnumLiteral#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral_Literal()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EEnumLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral_EEnum()
	 * @see ecoreDiffMM.EEnum#getELiterals
	 * @model opposite="eLiterals" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EEnum getEEnum();

	/**
	 * Returns the value of the '<em><b>Diffe Enum</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEEnumLiteral_eEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Enum</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnumLiteral_DiffeEnum()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEEnumLiteral_eEnum> getDiffeEnum();

} // EEnumLiteral
