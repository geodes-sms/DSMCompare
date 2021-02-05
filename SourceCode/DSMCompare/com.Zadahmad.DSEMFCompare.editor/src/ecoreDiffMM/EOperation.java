/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EOperation#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getDiffeContainingClass <em>Diffe Containing Class</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getDiffeTypeParameters <em>Diffe Type Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getDiffeParameters <em>Diffe Parameters</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getDiffeExceptions <em>Diffe Exceptions</em>}</li>
 *   <li>{@link ecoreDiffMM.EOperation#getDiffeGenericExceptions <em>Diffe Generic Exceptions</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid'"
 * @generated
 */
public interface EOperation extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_EContainingClass()
	 * @see ecoreDiffMM.EClass#getEOperations
	 * @model opposite="eOperations" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EParameter}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_EParameters()
	 * @see ecoreDiffMM.EParameter#getEOperation
	 * @model opposite="eOperation" containment="true"
	 * @generated
	 */
	EList<EParameter> getEParameters();

	/**
	 * Returns the value of the '<em><b>EExceptions</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExceptions</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_EExceptions()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClassifier> getEExceptions();

	/**
	 * Returns the value of the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Exceptions</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_EGenericExceptions()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericExceptions();

	/**
	 * Returns the value of the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEOperation_eContainingClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Containing Class</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_DiffeContainingClass()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEOperation_eContainingClass> getDiffeContainingClass();

	/**
	 * Returns the value of the '<em><b>Diffe Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEOperation_eTypeParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Type Parameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_DiffeTypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEOperation_eTypeParameters> getDiffeTypeParameters();

	/**
	 * Returns the value of the '<em><b>Diffe Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEOperation_eParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Parameters</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_DiffeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEOperation_eParameters> getDiffeParameters();

	/**
	 * Returns the value of the '<em><b>Diffe Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEOperation_eExceptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Exceptions</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_DiffeExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEOperation_eExceptions> getDiffeExceptions();

	/**
	 * Returns the value of the '<em><b>Diffe Generic Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEOperation_eGenericExceptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Generic Exceptions</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEOperation_DiffeGenericExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEOperation_eGenericExceptions> getDiffeGenericExceptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getOperationID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isOverrideOf(EOperation someOperation);

} // EOperation
