/**
 */
package ecoreDiffMM.impl;

import ecoreDiffMM.DiffEAnnotation_contents;
import ecoreDiffMM.DiffEAnnotation_details;
import ecoreDiffMM.DiffEAnnotation_eModelElement;
import ecoreDiffMM.DiffEAnnotation_references;
import ecoreDiffMM.EAnnotation;
import ecoreDiffMM.EModelElement;
import ecoreDiffMM.EObject;
import ecoreDiffMM.EcoreDiffMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getDiffdetails <em>Diffdetails</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getDiffeModelElement <em>Diffe Model Element</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getDiffcontents <em>Diffcontents</em>}</li>
 *   <li>{@link ecoreDiffMM.impl.EAnnotationImpl#getDiffreferences <em>Diffreferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAnnotationImpl extends EModelElementImpl implements EAnnotation {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> details;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> contents;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> references;

	/**
	 * The cached value of the '{@link #getDiffdetails() <em>Diffdetails</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffdetails()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAnnotation_details> diffdetails;

	/**
	 * The cached value of the '{@link #getDiffeModelElement() <em>Diffe Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffeModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAnnotation_eModelElement> diffeModelElement;

	/**
	 * The cached value of the '{@link #getDiffcontents() <em>Diffcontents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffcontents()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAnnotation_contents> diffcontents;

	/**
	 * The cached value of the '{@link #getDiffreferences() <em>Diffreferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffEAnnotation_references> diffreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreDiffMMPackage.eINSTANCE.getEAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EANNOTATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getDetails() {
		if (details == null) {
			details = new EcoreEMap<String,String>(EcoreDiffMMPackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, EcoreDiffMMPackage.EANNOTATION__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EModelElement getEModelElement() {
		if (eContainerFeatureID() != EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT) return null;
		return (EModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEModelElement(EModelElement newEModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEModelElement, EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEModelElement(EModelElement newEModelElement) {
		if (newEModelElement != eInternalContainer() || (eContainerFeatureID() != EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT && newEModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newEModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEModelElement != null)
				msgs = ((InternalEObject)newEModelElement).eInverseAdd(this, EcoreDiffMMPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
			msgs = basicSetEModelElement(newEModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT, newEModelElement, newEModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<EObject>(EObject.class, this, EcoreDiffMMPackage.EANNOTATION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<EObject>(EObject.class, this, EcoreDiffMMPackage.EANNOTATION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEAnnotation_details> getDiffdetails() {
		if (diffdetails == null) {
			diffdetails = new EObjectContainmentEList<DiffEAnnotation_details>(DiffEAnnotation_details.class, this, EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS);
		}
		return diffdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEAnnotation_eModelElement> getDiffeModelElement() {
		if (diffeModelElement == null) {
			diffeModelElement = new EObjectContainmentEList<DiffEAnnotation_eModelElement>(DiffEAnnotation_eModelElement.class, this, EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT);
		}
		return diffeModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEAnnotation_contents> getDiffcontents() {
		if (diffcontents == null) {
			diffcontents = new EObjectContainmentEList<DiffEAnnotation_contents>(DiffEAnnotation_contents.class, this, EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS);
		}
		return diffcontents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffEAnnotation_references> getDiffreferences() {
		if (diffreferences == null) {
			diffreferences = new EObjectContainmentEList<DiffEAnnotation_references>(DiffEAnnotation_references.class, this, EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES);
		}
		return diffreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEModelElement((EModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				return basicSetEModelElement(null, msgs);
			case EcoreDiffMMPackage.EANNOTATION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS:
				return ((InternalEList<?>)getDiffdetails()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT:
				return ((InternalEList<?>)getDiffeModelElement()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS:
				return ((InternalEList<?>)getDiffcontents()).basicRemove(otherEnd, msgs);
			case EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES:
				return ((InternalEList<?>)getDiffreferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, EcoreDiffMMPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__SOURCE:
				return getSource();
			case EcoreDiffMMPackage.EANNOTATION__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement();
			case EcoreDiffMMPackage.EANNOTATION__CONTENTS:
				return getContents();
			case EcoreDiffMMPackage.EANNOTATION__REFERENCES:
				return getReferences();
			case EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS:
				return getDiffdetails();
			case EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT:
				return getDiffeModelElement();
			case EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS:
				return getDiffcontents();
			case EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES:
				return getDiffreferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__SOURCE:
				setSource((String)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends EObject>)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends EObject>)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS:
				getDiffdetails().clear();
				getDiffdetails().addAll((Collection<? extends DiffEAnnotation_details>)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT:
				getDiffeModelElement().clear();
				getDiffeModelElement().addAll((Collection<? extends DiffEAnnotation_eModelElement>)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS:
				getDiffcontents().clear();
				getDiffcontents().addAll((Collection<? extends DiffEAnnotation_contents>)newValue);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES:
				getDiffreferences().clear();
				getDiffreferences().addAll((Collection<? extends DiffEAnnotation_references>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EcoreDiffMMPackage.EANNOTATION__DETAILS:
				getDetails().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case EcoreDiffMMPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS:
				getDiffdetails().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT:
				getDiffeModelElement().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS:
				getDiffcontents().clear();
				return;
			case EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES:
				getDiffreferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcoreDiffMMPackage.EANNOTATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EcoreDiffMMPackage.EANNOTATION__DETAILS:
				return details != null && !details.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement() != null;
			case EcoreDiffMMPackage.EANNOTATION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__REFERENCES:
				return references != null && !references.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__DIFFDETAILS:
				return diffdetails != null && !diffdetails.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__DIFFE_MODEL_ELEMENT:
				return diffeModelElement != null && !diffeModelElement.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__DIFFCONTENTS:
				return diffcontents != null && !diffcontents.isEmpty();
			case EcoreDiffMMPackage.EANNOTATION__DIFFREFERENCES:
				return diffreferences != null && !diffreferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //EAnnotationImpl
