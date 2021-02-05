/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EAttribute#isID <em>ID</em>}</li>
 *   <li>{@link ecoreDiffMM.EAttribute#getEAttributeType <em>EAttribute Type</em>}</li>
 *   <li>{@link ecoreDiffMM.EAttribute#getDiffeAttributeType <em>Diffe Attribute Type</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentTransient'"
 * @generated
 */
public interface EAttribute extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAttribute_ID()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isID();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EAttribute#isID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isID()
	 * @generated
	 */
	void setID(boolean value);

	/**
	 * Returns the value of the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute Type</em>' reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAttribute_EAttributeType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EDataType getEAttributeType();

	/**
	 * Returns the value of the '<em><b>Diffe Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEAttribute_eAttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Attribute Type</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEAttribute_DiffeAttributeType()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEAttribute_eAttributeType> getDiffeAttributeType();

} // EAttribute
