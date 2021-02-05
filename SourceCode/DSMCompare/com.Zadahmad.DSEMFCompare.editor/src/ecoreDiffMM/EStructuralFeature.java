/**
 */
package ecoreDiffMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecoreDiffMM.EStructuralFeature#getDiffeContainingClass <em>Diffe Containing Class</em>}</li>
 * </ul>
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDefaultValueLiteral'"
 * @generated
 */
public interface EStructuralFeature extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_Changeable()
	 * @model default="true" dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_Volatile()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_Transient()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_DefaultValueLiteral()
	 * @model dataType="ecoreDiffMM.EString"
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_DefaultValue()
	 * @model dataType="ecoreDiffMM.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_Unsettable()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */
	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_Derived()
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link ecoreDiffMM.EStructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecoreDiffMM.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_EContainingClass()
	 * @see ecoreDiffMM.EClass#getEStructuralFeatures
	 * @model opposite="eStructuralFeatures" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Returns the value of the '<em><b>Diffe Containing Class</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreDiffMM.DiffEStructuralFeature_eContainingClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffe Containing Class</em>' containment reference list.
	 * @see ecoreDiffMM.EcoreDiffMMPackage#getEStructuralFeature_DiffeContainingClass()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<DiffEStructuralFeature_eContainingClass> getDiffeContainingClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EInt"
	 * @generated
	 */
	int getFeatureID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ecoreDiffMM.EJavaClass&lt;?&gt;"
	 * @generated
	 */
	Class<?> getContainerClass();

} // EStructuralFeature
