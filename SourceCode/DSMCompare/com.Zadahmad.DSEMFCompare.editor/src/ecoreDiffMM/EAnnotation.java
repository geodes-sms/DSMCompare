/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getDetails <em>Details</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getContents <em>Contents</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getReferences <em>References</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getDiffdetails <em>Diffdetails</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getDiffeModelElement <em>Diffe Model Element</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getDiffcontents <em>Diffcontents</em>}</li>
 *   <li>{@link ecoreDiffMM.EAnnotation#getDiffreferences <em>Diffreferences</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormed WellFormedSourceURI'"
 * @generated
 */
public interface EAnnotation extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Source()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EAnnotation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' map.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Details()
	 * @model mapType="ecoreDiffMM.EStringToStringMapEntry&lt;ecoreDiffMM.EString, ecoreDiffMM.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getDetails();

	/**
	 * Returns the value of the '<em><b>EModel Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EModel Element</em>' container reference.
	 * @see #setEModelElement(EModelElement)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_EModelElement()
	 * @see ecoreDiffMM.EModelElement#getEAnnotations
	 * @model opposite="eAnnotations" resolveProxies="false"
	 * @generated
	 */
	EModelElement getEModelElement();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EAnnotation#getEModelElement <em>EModel Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EModel Element</em>' container reference.
	 * @see #getEModelElement()
	 * @generated
	 */
	void setEModelElement(EModelElement value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_References()
	 * @model
	 * @generated
	 */
	EList<EObject> getReferences();

	/**
	 * Returns the value of the '<em><b>Diffdetails</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEAnnotation_details}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdetails</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Diffdetails()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEAnnotation_details> getDiffdetails();

	/**
	 * Returns the value of the '<em><b>Diffe Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEAnnotation_eModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Model Element</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_DiffeModelElement()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEAnnotation_eModelElement> getDiffeModelElement();

	/**
	 * Returns the value of the '<em><b>Diffcontents</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEAnnotation_contents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffcontents</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Diffcontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEAnnotation_contents> getDiffcontents();

	/**
	 * Returns the value of the '<em><b>Diffreferences</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEAnnotation_references}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffreferences</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAnnotation_Diffreferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEAnnotation_references> getDiffreferences();

} // EAnnotation
