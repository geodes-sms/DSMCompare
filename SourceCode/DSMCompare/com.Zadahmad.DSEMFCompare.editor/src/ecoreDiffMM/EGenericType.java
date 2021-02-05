/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGeneric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EGenericType#getEUpperBound <em>EUpper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getETypeArguments <em>EType Arguments</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getERawType <em>ERaw Type</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getELowerBound <em>ELower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getETypeParameter <em>EType Parameter</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getEClassifier <em>EClassifier</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeUpperBound <em>Diffe Upper Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeTypeArguments <em>Diffe Type Arguments</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeRawType <em>Diffe Raw Type</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeLowerBound <em>Diffe Lower Bound</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeTypeParameter <em>Diffe Type Parameter</em>}</li>
 *   <li>{@link ecoreDiffMM.EGenericType#getDiffeClassifier <em>Diffe Classifier</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentType ConsistentBounds ConsistentArguments'"
 * @generated
 */
public interface EGenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #setEUpperBound(EGenericType)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_EUpperBound()
	 * @model containment="true"
	 * @generated
	 */
	EGenericType getEUpperBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EGenericType#getEUpperBound <em>EUpper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUpper Bound</em>' containment reference.
	 * @see #getEUpperBound()
	 * @generated
	 */
	void setEUpperBound(EGenericType value);

	/**
	 * Returns the value of the '<em><b>EType Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Arguments</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_ETypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<EGenericType> getETypeArguments();

	/**
	 * Returns the value of the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERaw Type</em>' reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_ERawType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EClassifier getERawType();

	/**
	 * Returns the value of the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELower Bound</em>' containment reference.
	 * @see #setELowerBound(EGenericType)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_ELowerBound()
	 * @model containment="true"
	 * @generated
	 */
	EGenericType getELowerBound();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EGenericType#getELowerBound <em>ELower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELower Bound</em>' containment reference.
	 * @see #getELowerBound()
	 * @generated
	 */
	void setELowerBound(EGenericType value);

	/**
	 * Returns the value of the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameter</em>' reference.
	 * @see #setETypeParameter(ETypeParameter)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_ETypeParameter()
	 * @model resolveProxies="false"
	 * @generated
	 */
	ETypeParameter getETypeParameter();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EGenericType#getETypeParameter <em>EType Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType Parameter</em>' reference.
	 * @see #getETypeParameter()
	 * @generated
	 */
	void setETypeParameter(ETypeParameter value);

	/**
	 * Returns the value of the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifier</em>' reference.
	 * @see #setEClassifier(EClassifier)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_EClassifier()
	 * @model
	 * @generated
	 */
	EClassifier getEClassifier();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EGenericType#getEClassifier <em>EClassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClassifier</em>' reference.
	 * @see #getEClassifier()
	 * @generated
	 */
	void setEClassifier(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Diffe Upper Bound</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eUpperBound}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Upper Bound</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeUpperBound()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEGenericType_eUpperBound> getDiffeUpperBound();

	/**
	 * Returns the value of the '<em><b>Diffe Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eTypeArguments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Type Arguments</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeTypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEGenericType_eTypeArguments> getDiffeTypeArguments();

	/**
	 * Returns the value of the '<em><b>Diffe Raw Type</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eRawType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Raw Type</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeRawType()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEGenericType_eRawType> getDiffeRawType();

	/**
	 * Returns the value of the '<em><b>Diffe Lower Bound</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eLowerBound}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Lower Bound</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeLowerBound()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEGenericType_eLowerBound> getDiffeLowerBound();

	/**
	 * Returns the value of the '<em><b>Diffe Type Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Type Parameter</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeTypeParameter()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEGenericType_eTypeParameter> getDiffeTypeParameter();

	/**
	 * Returns the value of the '<em><b>Diffe Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEGenericType_eClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Classifier</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEGenericType_DiffeClassifier()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEGenericType_eClassifier> getDiffeClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean" objectDataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	boolean isInstance(Object object);

} // EGenericType
