/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EModelElement#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link ecoreDiffMM.EModelElement#getDiffeAnnotations <em>Diffe Annotations</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEModelElement()
 * @model abstract="true"
 * @generated
 */
public interface EModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>EAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAnnotation}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAnnotations</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEModelElement_EAnnotations()
	 * @see ecoreDiffMM.EAnnotation#getEModelElement
	 * @model opposite="eModelElement" containment="true"
	 * @generated
	 */
	EList<EAnnotation> getEAnnotations();

	/**
	 * Returns the value of the '<em><b>Diffe Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEModelElement_eAnnotations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Annotations</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEModelElement_DiffeAnnotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEModelElement_eAnnotations> getDiffeAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EAnnotation getEAnnotation(String source);

} // EModelElement
