/**
 */
package arduinoDiffMM.impl;

import arduinoDiffMM.ArduinoDiffMMPackage;
import arduinoDiffMM.DiffInstruction_next;
import arduinoDiffMM.DiffInstruction_previous;
import arduinoDiffMM.DiffSketch_functions;
import arduinoDiffMM.DiffSketch_hardware;
import arduinoDiffMM.DiffSketch_instructions;
import arduinoDiffMM.Function;
import arduinoDiffMM.Hardware;
import arduinoDiffMM.Instruction;
import arduinoDiffMM.Sketch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getDiffprevious <em>Diffprevious</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getDiffnext <em>Diffnext</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getDiffhardware <em>Diffhardware</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getDiffinstructions <em>Diffinstructions</em>}</li>
 *   <li>{@link arduinoDiffMM.impl.SketchImpl#getDifffunctions <em>Difffunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SketchImpl extends NamedElementImpl implements Sketch {
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
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected Hardware hardware;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getDiffhardware() <em>Diffhardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffhardware()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSketch_hardware> diffhardware;

	/**
	 * The cached value of the '{@link #getDiffinstructions() <em>Diffinstructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffinstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSketch_instructions> diffinstructions;

	/**
	 * The cached value of the '{@link #getDifffunctions() <em>Difffunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifffunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiffSketch_functions> difffunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SketchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoDiffMMPackage.Literals.SKETCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Instruction)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SKETCH__PREVIOUS, oldPrevious, previous));
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
	public void setPrevious(Instruction newPrevious) {
		Instruction oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SKETCH__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Instruction)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SKETCH__NEXT, oldNext, next));
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
	public void setNext(Instruction newNext) {
		Instruction oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SKETCH__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInstruction_previous> getDiffprevious() {
		if (diffprevious == null) {
			diffprevious = new EObjectContainmentEList<DiffInstruction_previous>(DiffInstruction_previous.class, this, ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS);
		}
		return diffprevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffInstruction_next> getDiffnext() {
		if (diffnext == null) {
			diffnext = new EObjectContainmentEList<DiffInstruction_next>(DiffInstruction_next.class, this, ArduinoDiffMMPackage.SKETCH__DIFFNEXT);
		}
		return diffnext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getHardware() {
		if (hardware != null && hardware.eIsProxy()) {
			InternalEObject oldHardware = (InternalEObject)hardware;
			hardware = (Hardware)eResolveProxy(oldHardware);
			if (hardware != oldHardware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoDiffMMPackage.SKETCH__HARDWARE, oldHardware, hardware));
			}
		}
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware basicGetHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(Hardware newHardware) {
		Hardware oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoDiffMMPackage.SKETCH__HARDWARE, oldHardware, hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, ArduinoDiffMMPackage.SKETCH__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffSketch_hardware> getDiffhardware() {
		if (diffhardware == null) {
			diffhardware = new EObjectContainmentEList<DiffSketch_hardware>(DiffSketch_hardware.class, this, ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE);
		}
		return diffhardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffSketch_instructions> getDiffinstructions() {
		if (diffinstructions == null) {
			diffinstructions = new EObjectContainmentEList<DiffSketch_instructions>(DiffSketch_instructions.class, this, ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS);
		}
		return diffinstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiffSketch_functions> getDifffunctions() {
		if (difffunctions == null) {
			difffunctions = new EObjectContainmentEList<DiffSketch_functions>(DiffSketch_functions.class, this, ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS);
		}
		return difffunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS:
				return ((InternalEList<?>)getDiffprevious()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__DIFFNEXT:
				return ((InternalEList<?>)getDiffnext()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE:
				return ((InternalEList<?>)getDiffhardware()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS:
				return ((InternalEList<?>)getDiffinstructions()).basicRemove(otherEnd, msgs);
			case ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS:
				return ((InternalEList<?>)getDifffunctions()).basicRemove(otherEnd, msgs);
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
			case ArduinoDiffMMPackage.SKETCH__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case ArduinoDiffMMPackage.SKETCH__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS:
				return getDiffprevious();
			case ArduinoDiffMMPackage.SKETCH__DIFFNEXT:
				return getDiffnext();
			case ArduinoDiffMMPackage.SKETCH__HARDWARE:
				if (resolve) return getHardware();
				return basicGetHardware();
			case ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS:
				return getInstructions();
			case ArduinoDiffMMPackage.SKETCH__FUNCTIONS:
				return getFunctions();
			case ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE:
				return getDiffhardware();
			case ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS:
				return getDiffinstructions();
			case ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS:
				return getDifffunctions();
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
			case ArduinoDiffMMPackage.SKETCH__PREVIOUS:
				setPrevious((Instruction)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__NEXT:
				setNext((Instruction)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS:
				getDiffprevious().clear();
				getDiffprevious().addAll((Collection<? extends DiffInstruction_previous>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFNEXT:
				getDiffnext().clear();
				getDiffnext().addAll((Collection<? extends DiffInstruction_next>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__HARDWARE:
				setHardware((Hardware)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE:
				getDiffhardware().clear();
				getDiffhardware().addAll((Collection<? extends DiffSketch_hardware>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS:
				getDiffinstructions().clear();
				getDiffinstructions().addAll((Collection<? extends DiffSketch_instructions>)newValue);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS:
				getDifffunctions().clear();
				getDifffunctions().addAll((Collection<? extends DiffSketch_functions>)newValue);
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
			case ArduinoDiffMMPackage.SKETCH__PREVIOUS:
				setPrevious((Instruction)null);
				return;
			case ArduinoDiffMMPackage.SKETCH__NEXT:
				setNext((Instruction)null);
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS:
				getDiffprevious().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFNEXT:
				getDiffnext().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__HARDWARE:
				setHardware((Hardware)null);
				return;
			case ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__FUNCTIONS:
				getFunctions().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE:
				getDiffhardware().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS:
				getDiffinstructions().clear();
				return;
			case ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS:
				getDifffunctions().clear();
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
			case ArduinoDiffMMPackage.SKETCH__PREVIOUS:
				return previous != null;
			case ArduinoDiffMMPackage.SKETCH__NEXT:
				return next != null;
			case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS:
				return diffprevious != null && !diffprevious.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__DIFFNEXT:
				return diffnext != null && !diffnext.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__HARDWARE:
				return hardware != null;
			case ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE:
				return diffhardware != null && !diffhardware.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS:
				return diffinstructions != null && !diffinstructions.isEmpty();
			case ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS:
				return difffunctions != null && !difffunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (derivedFeatureID) {
				case ArduinoDiffMMPackage.SKETCH__PREVIOUS: return ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS;
				case ArduinoDiffMMPackage.SKETCH__NEXT: return ArduinoDiffMMPackage.INSTRUCTION__NEXT;
				case ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS: return ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS;
				case ArduinoDiffMMPackage.SKETCH__DIFFNEXT: return ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Instruction.class) {
			switch (baseFeatureID) {
				case ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS: return ArduinoDiffMMPackage.SKETCH__PREVIOUS;
				case ArduinoDiffMMPackage.INSTRUCTION__NEXT: return ArduinoDiffMMPackage.SKETCH__NEXT;
				case ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS: return ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS;
				case ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT: return ArduinoDiffMMPackage.SKETCH__DIFFNEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SketchImpl
