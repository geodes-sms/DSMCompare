/**
 */
package dssmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dssmm.Option#getOptionID <em>Option ID</em>}</li>
 *   <li>{@link dssmm.Option#getName <em>Name</em>}</li>
 *   <li>{@link dssmm.Option#getSort <em>Sort</em>}</li>
 *   <li>{@link dssmm.Option#getCost <em>Cost</em>}</li>
 *   <li>{@link dssmm.Option#getNumOtherCosts <em>Num Other Costs</em>}</li>
 *   <li>{@link dssmm.Option#getVendor <em>Vendor</em>}</li>
 *   <li>{@link dssmm.Option#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see dssmm.DssmmPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Option ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option ID</em>' attribute.
	 * @see #setOptionID(int)
	 * @see dssmm.DssmmPackage#getOption_OptionID()
	 * @model
	 * @generated
	 */
	int getOptionID();

	/**
	 * Sets the value of the '{@link dssmm.Option#getOptionID <em>Option ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option ID</em>' attribute.
	 * @see #getOptionID()
	 * @generated
	 */
	void setOptionID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dssmm.DssmmPackage#getOption_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dssmm.Option#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' attribute.
	 * @see #setSort(int)
	 * @see dssmm.DssmmPackage#getOption_Sort()
	 * @model
	 * @generated
	 */
	int getSort();

	/**
	 * Sets the value of the '{@link dssmm.Option#getSort <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' attribute.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see dssmm.DssmmPackage#getOption_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link dssmm.Option#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Num Other Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Other Costs</em>' attribute.
	 * @see #setNumOtherCosts(int)
	 * @see dssmm.DssmmPackage#getOption_NumOtherCosts()
	 * @model
	 * @generated
	 */
	int getNumOtherCosts();

	/**
	 * Sets the value of the '{@link dssmm.Option#getNumOtherCosts <em>Num Other Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Other Costs</em>' attribute.
	 * @see #getNumOtherCosts()
	 * @generated
	 */
	void setNumOtherCosts(int value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see dssmm.DssmmPackage#getOption_Vendor()
	 * @model
	 * @generated
	 */
	Vendor getVendor();

	/**
	 * Sets the value of the '{@link dssmm.Option#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dssmm.DssmmPackage#getOption_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dssmm.Option#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Option
