/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#isContainer <em>Container</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getEKeys <em>EKeys</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getDiffeOpposite <em>Diffe Opposite</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getDiffeReferenceType <em>Diffe Reference Type</em>}</li>
 *   <li>{@link ecoreDiffMM.EReference#getDiffeKeys <em>Diffe Keys</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentOpposite SingleContainer ConsistentKeys ConsistentUnique ConsistentContainer'"
 * @generated
 */
public interface EReference extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_Containment()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_Container()
	 * @model dataType="ecoreDiffMM.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_ResolveProxies()
	 * @model default="true" dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOpposite</em>' reference.
	 * @see #setEOpposite(EReference)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_EOpposite()
	 * @model
	 * @generated
	 */
	EReference getEOpposite();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EReference#getEOpposite <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOpposite</em>' reference.
	 * @see #getEOpposite()
	 * @generated
	 */
	void setEOpposite(EReference value);

	/**
	 * Returns the value of the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Type</em>' reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_EReferenceType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getEReferenceType();

	/**
	 * Returns the value of the '<em><b>EKeys</b></em>' reference list.
	 * The list contents are of type {@link ecoreDiffMM.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EKeys</em>' reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_EKeys()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getEKeys();

	/**
	 * Returns the value of the '<em><b>Diffe Opposite</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEReference_eOpposite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Opposite</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_DiffeOpposite()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEReference_eOpposite> getDiffeOpposite();

	/**
	 * Returns the value of the '<em><b>Diffe Reference Type</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEReference_eReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Reference Type</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_DiffeReferenceType()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEReference_eReferenceType> getDiffeReferenceType();

	/**
	 * Returns the value of the '<em><b>Diffe Keys</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEReference_eKeys}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Keys</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEReference_DiffeKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEReference_eKeys> getDiffeKeys();

} // EReference
