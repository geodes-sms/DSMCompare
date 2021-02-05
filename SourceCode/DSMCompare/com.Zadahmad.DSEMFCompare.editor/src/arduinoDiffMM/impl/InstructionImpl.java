/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffInstruction_next;
import arduinoDiffMM.DiffInstruction_previous;
import arduinoDiffMM.Instruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.InstructionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.InstructionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.InstructionImpl#getDiffprevious <em>Diffprevious</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.InstructionImpl#getDiffnext <em>Diffnext</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Instruction previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Instruction next;

	/**
	 * The cached value of the '{@link #getDiffprevious() <em>Diffprevious</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffprevious()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInstruction_previous> diffprevious;

	/**
	 * The cached value of the '{@link #getDiffnext() <em>Diffnext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffnext()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffInstruction_next> diffnext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Instruction)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious(Instruction newPrevious) {
		Instruction oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Instruction)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.INSTRUCTION__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(Instruction newNext) {
		Instruction oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.INSTRUCTION__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffInstruction_previous> getDiffprevious() {
		if (diffprevious == null) {
			diffprevious = new EObjectContainmentEList<DiffInstruction_previous>(DiffInstruction_previous.class, this, ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS);
		}
		return diffprevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiffInstruction_next> getDiffnext() {
		if (diffnext == null) {
			diffnext = new EObjectContainmentEList<DiffInstruction_next>(DiffInstruction_next.class, this, ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT);
		}
		return diffnext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS:
				return ((InternalEList<?>)getDiffprevious()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT:
				return ((InternalEList<?>)getDiffnext()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case ArduinoDiffMMPackage.INSTRUCTION__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS:
				return getDiffprevious();
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT:
				return getDiffnext();
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
			case ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS:
				setPrevious((Instruction)newValue);
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__NEXT:
				setNext((Instruction)newValue);
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS:
				getDiffprevious().clear();
				getDiffprevious().addAll((Collection<? extends DiffInstruction_previous>)newValue);
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT:
				getDiffnext().clear();
				getDiffnext().addAll((Collection<? extends DiffInstruction_next>)newValue);
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
			case ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS:
				setPrevious((Instruction)null);
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__NEXT:
				setNext((Instruction)null);
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS:
				getDiffprevious().clear();
				return;
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT:
				getDiffnext().clear();
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
			case ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS:
				return previous != null;
			case ArduinoDiffMMPackage.INSTRUCTION__NEXT:
				return next != null;
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS:
				return diffprevious != null && !diffprevious.isEmpty();
			case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT:
				return diffnext != null && !diffnext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstructionImpl
