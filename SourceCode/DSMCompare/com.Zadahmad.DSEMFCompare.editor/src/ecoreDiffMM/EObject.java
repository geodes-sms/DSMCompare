/**
 */
package ecoreDiffMM;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ecoreDiffMM.EcoreDiffMMPackage#getEObject()
 * @model
 * @generated
 */
public interface EObject extends org.eclipse.emf.ecore.EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EClass eClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean eIsProxy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EResource"
	 * @generated
	 */
	Resource eResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject eContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EStructuralFeature eContainingFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EReference eContainmentFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EEList&lt;ecoreDiffMM.EObject&gt;" many="false"
	 * @generated
	 */
	EList<org.eclipse.emf.ecore.EObject> eContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.ETreeIterator&lt;ecoreDiffMM.EObject&gt;"
	 * @generated
	 */
	TreeIterator<org.eclipse.emf.ecore.EObject> eAllContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EEList&lt;ecoreDiffMM.EObject&gt;" many="false"
	 * @generated
	 */
	EList<org.eclipse.emf.ecore.EObject> eCrossReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	Object eGet(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EJavaObject" resolveDataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	Object eGet(EStructuralFeature feature, boolean resolve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newValueDataType="ecoreDiffMM.EJavaObject"
	 * @generated
	 */
	void eSet(EStructuralFeature feature, Object newValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EBoolean"
	 * @generated
	 */
	boolean eIsSet(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eUnset(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ecoreDiffMM.EJavaObject" exceptions="ecoreDiffMM.EInvocationTargetException" argumentsDataType="ecoreDiffMM.EEList&lt;?&gt;" argumentsMany="false"
	 * @generated
	 */
	Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException;

} // EObject
