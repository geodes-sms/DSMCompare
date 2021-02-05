/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeSuperTypes <em>Diffe Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeOperations <em>Diffe Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllAttributes <em>Diffe All Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllReferences <em>Diffe All References</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeReferences <em>Diffe References</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAttributes <em>Diffe Attributes</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllContainments <em>Diffe All Containments</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllOperations <em>Diffe All Operations</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllStructuralFeatures <em>Diffe All Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllSuperTypes <em>Diffe All Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeIDAttribute <em>Diffe ID Attribute</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeStructuralFeatures <em>Diffe Structural Features</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeGenericSuperTypes <em>Diffe Generic Super Types</em>}</li>
 *   <li>{@link ecoreDiffMM.EClass#getDiffeAllGenericSuperTypes <em>Diffe All Generic Super Types</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes DisjointFeatureAndOperationSignatures'"
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_Abstract()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_Interface()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_ESuperTypes()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClass> getESuperTypes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EOperation}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EOperations()
	 * @see ecoreDiffMM.EOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Attributes</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAllAttributes();

	/**
	 * Returns the value of the '<em><b>EAll References</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll References</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllReferences();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEReferences();

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Containments</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllContainments()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllContainments();

	/**
	 * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Operations</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EOperation> getEAllOperations();

	/**
	 * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Structural Features</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllStructuralFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Super Types</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EClass> getEAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID Attribute</em>' reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EIDAttribute()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EAttribute getEIDAttribute();

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EStructuralFeatures()
	 * @see ecoreDiffMM.EStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Super Types</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EGenericSuperTypes()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Generic Super Types</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_EAllGenericSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EGenericType> getEAllGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>Diffe Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eSuperTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Super Types</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eSuperTypes> getDiffeSuperTypes();

	/**
	 * Returns the value of the '<em><b>Diffe Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Operations</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eOperations> getDiffeOperations();

	/**
	 * Returns the value of the '<em><b>Diffe All Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Attributes</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllAttributes> getDiffeAllAttributes();

	/**
	 * Returns the value of the '<em><b>Diffe All References</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllReferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All References</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllReferences> getDiffeAllReferences();

	/**
	 * Returns the value of the '<em><b>Diffe References</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eReferences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe References</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eReferences> getDiffeReferences();

	/**
	 * Returns the value of the '<em><b>Diffe Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Attributes</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAttributes> getDiffeAttributes();

	/**
	 * Returns the value of the '<em><b>Diffe All Containments</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllContainments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Containments</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllContainments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllContainments> getDiffeAllContainments();

	/**
	 * Returns the value of the '<em><b>Diffe All Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Operations</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllOperations> getDiffeAllOperations();

	/**
	 * Returns the value of the '<em><b>Diffe All Structural Features</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllStructuralFeatures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Structural Features</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllStructuralFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllStructuralFeatures> getDiffeAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>Diffe All Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllSuperTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Super Types</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllSuperTypes> getDiffeAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>Diffe ID Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eIDAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe ID Attribute</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeIDAttribute()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEClass_eIDAttribute> getDiffeIDAttribute();

	/**
	 * Returns the value of the '<em><b>Diffe Structural Features</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eStructuralFeatures}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Structural Features</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeStructuralFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eStructuralFeatures> getDiffeStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>Diffe Generic Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eGenericSuperTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Generic Super Types</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeGenericSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eGenericSuperTypes> getDiffeGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>Diffe All Generic Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEClass_eAllGenericSuperTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe All Generic Super Types</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEClass_DiffeAllGenericSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEClass_eAllGenericSuperTypes> getDiffeAllGenericSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isSuperTypeOf(EClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureIDDataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureNameDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getOperationCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model operationIDDataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	EOperation getEOperation(int operationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getOperationID(EOperation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EOperation getOverride(EOperation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EGenericType getFeatureType(EStructuralFeature feature);

} // EClass
