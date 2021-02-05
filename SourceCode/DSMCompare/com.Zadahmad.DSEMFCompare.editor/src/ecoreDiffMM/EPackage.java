/**
 */
package ecoreDiffMM;

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
 *   <li>{@link ecoreDiffMM.EPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getESuperPackage <em>ESuper Package</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDomainspecificdiffs <em>Domainspecificdiffs</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDiffeFactoryInstance <em>Diffe Factory Instance</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDiffeClassifiers <em>Diffe Classifiers</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDiffeSubpackages <em>Diffe Subpackages</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDiffeSuperPackage <em>Diffe Super Package</em>}</li>
 *   <li>{@link ecoreDiffMM.EPackage#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs'"
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_NsURI()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EPackage#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_NsPrefix()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>EFactory Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFactory Instance</em>' reference.
	 * @see #setEFactoryInstance(EFactory)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_EFactoryInstance()
	 * @see ecoreDiffMM.EFactory#getEPackage
	 * @model opposite="ePackage" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EFactory getEFactoryInstance();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EPackage#getEFactoryInstance <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFactory Instance</em>' reference.
	 * @see #getEFactoryInstance()
	 * @generated
	 */
	void setEFactoryInstance(EFactory value);

	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EClassifier}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_EClassifiers()
	 * @see ecoreDiffMM.EClassifier#getEPackage
	 * @model opposite="ePackage" containment="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

	/**
	 * Returns the value of the '<em><b>ESubpackages</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.EPackage}.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESubpackages</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_ESubpackages()
	 * @see ecoreDiffMM.EPackage#getESuperPackage
	 * @model opposite="eSuperPackage" containment="true"
	 * @generated
	 */
	EList<EPackage> getESubpackages();

	/**
	 * Returns the value of the '<em><b>ESuper Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Package</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_ESuperPackage()
	 * @see ecoreDiffMM.EPackage#getESubpackages
	 * @model opposite="eSubpackages" changeable="false"
	 * @generated
	 */
	EPackage getESuperPackage();

	/**
	 * Returns the value of the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DomainSpecificDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainspecificdiffs</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_Domainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecificDiff> getDomainspecificdiffs();

	/**
	 * Returns the value of the '<em><b>Diffe Factory Instance</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEPackage_eFactoryInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Factory Instance</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_DiffeFactoryInstance()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEPackage_eFactoryInstance> getDiffeFactoryInstance();

	/**
	 * Returns the value of the '<em><b>Diffe Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEPackage_eClassifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Classifiers</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_DiffeClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_eClassifiers> getDiffeClassifiers();

	/**
	 * Returns the value of the '<em><b>Diffe Subpackages</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEPackage_eSubpackages}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Subpackages</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_DiffeSubpackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_eSubpackages> getDiffeSubpackages();

	/**
	 * Returns the value of the '<em><b>Diffe Super Package</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEPackage_eSuperPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Super Package</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_DiffeSuperPackage()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEPackage_eSuperPackage> getDiffeSuperPackage();

	/**
	 * Returns the value of the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEPackage_domainspecificdiffs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffdomainspecificdiffs</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEPackage_Diffdomainspecificdiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffEPackage_domainspecificdiffs> getDiffdomainspecificdiffs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecoreDiffMM.EString"
	 * @generated
	 */
	EClassifier getEClassifier(String name);

} // EPackage
