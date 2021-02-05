/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EEnum#getELiterals <em>ELiterals</em>}</li>
 *   <li>{@link ecoreDiffMM.EEnum#getDiffeLiterals <em>Diffe Literals</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnum()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEnumeratorNames UniqueEnumeratorLiterals'"
 * @generated
 */
public interface EEnum extends EDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnum_ELiterals()
	 * @see ecoreDiffMM.EEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true"
	 * @generated
	 */
	EList<EEnumLiteral> getELiterals();

	/**
	 * Returns the value of the '<em><b>Diffe Literals</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEEnum_eLiterals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Literals</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEEnum_DiffeLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEEnum_eLiterals> getDiffeLiterals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteralByLiteral(String literal);

} // EEnum
