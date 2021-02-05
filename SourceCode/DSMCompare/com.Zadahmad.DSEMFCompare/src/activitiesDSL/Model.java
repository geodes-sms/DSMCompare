/**
 */
package activitiesDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitiesDSL.Model#getCultures <em>Cultures</em>}</li>
 *   <li>{@link activitiesDSL.Model#getResourceKinds <em>Resource Kinds</em>}</li>
 * </ul>
 *
 * @see activitiesDSL.ActivitiesDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Cultures</b></em>' containment reference list.
	 * The list contents are of type {@link activitiesDSL.Culture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cultures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cultures</em>' containment reference list.
	 * @see activitiesDSL.ActivitiesDSLPackage#getModel_Cultures()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Culture> getCultures();

	/**
	 * Returns the value of the '<em><b>Resource Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link activitiesDSL.ResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Kinds</em>' containment reference list.
	 * @see activitiesDSL.ActivitiesDSLPackage#getModel_ResourceKinds()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ResourceKind> getResourceKinds();

} // Model
