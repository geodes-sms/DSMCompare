/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getName <em>Name</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAttribute <em>Domain Specific Diff EAttribute</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EAnnotation <em>Domain Specific Diff EAnnotation</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClass <em>Domain Specific Diff EClass</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EClassifier <em>Domain Specific Diff EClassifier</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EDataType <em>Domain Specific Diff EData Type</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnum <em>Domain Specific Diff EEnum</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EEnumLiteral <em>Domain Specific Diff EEnum Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EFactory <em>Domain Specific Diff EFactory</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EModelElement <em>Domain Specific Diff EModel Element</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ENamedElement <em>Domain Specific Diff ENamed Element</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EObject <em>Domain Specific Diff EObject</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EOperation <em>Domain Specific Diff EOperation</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EParameter <em>Domain Specific Diff EParameter</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EReference <em>Domain Specific Diff EReference</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EStructuralFeature <em>Domain Specific Diff EStructural Feature</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypedElement <em>Domain Specific Diff ETyped Element</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_EGenericType <em>Domain Specific Diff EGeneric Type</em>}</li>
 *   <li>{@link ecoreDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ETypeParameter <em>Domain Specific Diff EType Parameter</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff()
 * @model
 * @generated
 */
public interface DomainSpecificDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.DomainSpecificDiff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EAttribute</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EAttribute</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EAttribute()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getDomainSpecificDiff_EAttribute();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EAnnotation</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EAnnotation</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EAnnotation()
	 * @model
	 * @generated
	 */
	EList<EAnnotation> getDomainSpecificDiff_EAnnotation();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EClass</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EClass</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EClass()
	 * @model
	 * @generated
	 */
	EList<EClass> getDomainSpecificDiff_EClass();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EClassifier</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EClassifier</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EClassifier()
	 * @model
	 * @generated
	 */
	EList<EClassifier> getDomainSpecificDiff_EClassifier();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EData Type</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EData Type</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EDataType()
	 * @model
	 * @generated
	 */
	EList<EDataType> getDomainSpecificDiff_EDataType();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EEnum</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EEnum</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EEnum()
	 * @model
	 * @generated
	 */
	EList<EEnum> getDomainSpecificDiff_EEnum();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EEnum Literal</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EEnum Literal</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EEnumLiteral()
	 * @model
	 * @generated
	 */
	EList<EEnumLiteral> getDomainSpecificDiff_EEnumLiteral();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EFactory</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EFactory</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EFactory()
	 * @model
	 * @generated
	 */
	EList<EFactory> getDomainSpecificDiff_EFactory();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EModel Element</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EModel Element</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EModelElement()
	 * @model
	 * @generated
	 */
	EList<EModelElement> getDomainSpecificDiff_EModelElement();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff ENamed Element</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.ENamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff ENamed Element</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ENamedElement()
	 * @model
	 * @generated
	 */
	EList<ENamedElement> getDomainSpecificDiff_ENamedElement();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EObject</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EObject</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EObject()
	 * @model
	 * @generated
	 */
	EList<ecoreDiffMM.EObject> getDomainSpecificDiff_EObject();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EOperation</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EOperation</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EOperation()
	 * @model
	 * @generated
	 */
	EList<EOperation> getDomainSpecificDiff_EOperation();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EParameter</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EParameter</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EParameter()
	 * @model
	 * @generated
	 */
	EList<EParameter> getDomainSpecificDiff_EParameter();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EReference</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EReference</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EReference()
	 * @model
	 * @generated
	 */
	EList<EReference> getDomainSpecificDiff_EReference();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EStructural Feature</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EStructural Feature</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EStructuralFeature()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getDomainSpecificDiff_EStructuralFeature();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff ETyped Element</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff ETyped Element</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ETypedElement()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getDomainSpecificDiff_ETypedElement();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EGeneric Type</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EGeneric Type</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_EGenericType()
	 * @model
	 * @generated
	 */
	EList<EGenericType> getDomainSpecificDiff_EGenericType();

	/**
	 * Returns the value of the '<em><b>Domain Specific Diff EType Parameter</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specific Diff EType Parameter</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getDomainSpecificDiff_DomainSpecificDiff_ETypeParameter()
	 * @model
	 * @generated
	 */
	EList<ETypeParameter> getDomainSpecificDiff_ETypeParameter();

} // DomainSpecificDiff
