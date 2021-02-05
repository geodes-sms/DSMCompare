/**
 */
package ecorem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecorem.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 * </ul>
 *
 * @see ecorem.EcoremPackage#getEPackage()
 * @model
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link ecorem.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see ecorem.EcoremPackage#getEPackage_EClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

} // EPackage
