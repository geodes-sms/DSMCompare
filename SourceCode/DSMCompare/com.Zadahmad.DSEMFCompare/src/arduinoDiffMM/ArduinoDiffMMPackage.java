/**
 */
package arduinoDiffMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduinoDiffMM.ArduinoDiffMMFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoDiffMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoDiffMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/arduinoDiffMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoDiffMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoDiffMMPackage eINSTANCE = arduinoDiffMM.impl.ArduinoDiffMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.NamedElementImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.HardwareImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__PLATFORMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__MODULES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffplatforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DIFFPLATFORMS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DIFFMODULES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diffconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DIFFCONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.PlatformImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DIGITAL_PINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__ANALOG_PINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__IMAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffdigital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DIFFDIGITAL_PINS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffanalog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DIFFANALOG_PINS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ModuleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LIBRARY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.PinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ID = 0;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DigitalPinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDigitalPin()
	 * @generated
	 */
	int DIGITAL_PIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__ID = PIN__ID;

	/**
	 * The number of structural features of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.AnalogPinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getAnalogPin()
	 * @generated
	 */
	int ANALOG_PIN = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__ID = PIN__ID;

	/**
	 * The number of structural features of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.SketchImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__PREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__DIFFPREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__DIFFNEXT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__HARDWARE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__INSTRUCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__DIFFHARDWARE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__DIFFINSTRUCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Difffunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__DIFFFUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ProjectImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HARDWARE = 0;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SKETCH = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODULES = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PLATFORM = 3;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DOMAINSPECIFICDIFFS = 4;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIFFHARDWARE = 5;

	/**
	 * The feature id for the '<em><b>Diffsketch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIFFSKETCH = 6;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIFFMODULES = 7;

	/**
	 * The feature id for the '<em><b>Diffplatform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIFFPLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DIFFDOMAINSPECIFICDIFFS = 9;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.InstructionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 8;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__DIFFPREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__DIFFNEXT = 3;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ModuleInstructionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModuleInstruction()
	 * @generated
	 */
	int MODULE_INSTRUCTION = 11;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__DEFINITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__DIFFDEFINITION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__MODULE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__DIFFMODULE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.StatusImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__PREVIOUS = MODULE_INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NEXT = MODULE_INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DIFFPREVIOUS = MODULE_INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DIFFNEXT = MODULE_INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DEFINITION = MODULE_INSTRUCTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DIFFDEFINITION = MODULE_INSTRUCTION__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__MODULE = MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DIFFMODULE = MODULE_INSTRUCTION__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__VALUE = MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__STATUS = MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__SENSOR = MODULE_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DIFFSENSOR = MODULE_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = MODULE_INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = MODULE_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.LevelImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__PREVIOUS = MODULE_INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NEXT = MODULE_INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIFFPREVIOUS = MODULE_INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIFFNEXT = MODULE_INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DEFINITION = MODULE_INSTRUCTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIFFDEFINITION = MODULE_INSTRUCTION__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MODULE = MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIFFMODULE = MODULE_INSTRUCTION__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__LEVEL = MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Difflevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__DIFFLEVEL = MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = MODULE_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = MODULE_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ControlImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DIFFINSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.UtilitiesImpl <em>Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.UtilitiesImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getUtilities()
	 * @generated
	 */
	int UTILITIES = 13;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__DEFINITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__DIFFDEFINITION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.IOImpl <em>IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.IOImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getIO()
	 * @generated
	 */
	int IO = 14;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The number of structural features of the '<em>IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DelayImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 15;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PREVIOUS = UTILITIES__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NEXT = UTILITIES__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DIFFPREVIOUS = UTILITIES__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DIFFNEXT = UTILITIES__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DEFINITION = UTILITIES__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DIFFDEFINITION = UTILITIES__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__UNIT = UTILITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__VALUE = UTILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = UTILITIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = UTILITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.InputModuleImpl <em>Input Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.InputModuleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getInputModule()
	 * @generated
	 */
	int INPUT_MODULE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE__KIND = MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE__IMAGE = MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE__LEVEL = MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE__LIBRARY = MODULE__LIBRARY;

	/**
	 * The number of structural features of the '<em>Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.OutputModuleImpl <em>Output Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.OutputModuleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getOutputModule()
	 * @generated
	 */
	int OUTPUT_MODULE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE__KIND = MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE__IMAGE = MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE__LEVEL = MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE__LIBRARY = MODULE__LIBRARY;

	/**
	 * The number of structural features of the '<em>Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ConnectorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 19;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PIN = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Diffpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DIFFPIN = 2;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DIFFMODULE = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.RepeatImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 20;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__PREVIOUS = CONTROL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__NEXT = CONTROL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__DIFFPREVIOUS = CONTROL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__DIFFNEXT = CONTROL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__INSTRUCTIONS = CONTROL__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__DIFFINSTRUCTIONS = CONTROL__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ITERATION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.SensorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PREVIOUS = MODULE_INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NEXT = MODULE_INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFPREVIOUS = MODULE_INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFNEXT = MODULE_INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEFINITION = MODULE_INSTRUCTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFDEFINITION = MODULE_INSTRUCTION__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODULE = MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFMODULE = MODULE_INSTRUCTION__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE = MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LEFT = MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__RIGHT = MODULE_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OPERATOR = MODULE_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFLEFT = MODULE_INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFRIGHT = MODULE_INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__STATUS = MODULE_INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diffstatus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DIFFSTATUS = MODULE_INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = MODULE_INSTRUCTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = MODULE_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.WhileImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 22;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__PREVIOUS = CONTROL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NEXT = CONTROL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DIFFPREVIOUS = CONTROL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DIFFNEXT = CONTROL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INSTRUCTIONS = CONTROL__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DIFFINSTRUCTIONS = CONTROL__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DIFFCONDITION = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ValueImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 28;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DEFINITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DIFFDEFINITION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.MathOperatorImpl <em>Math Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.MathOperatorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getMathOperator()
	 * @generated
	 */
	int MATH_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__PREVIOUS = VALUE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__NEXT = VALUE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DIFFPREVIOUS = VALUE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DIFFNEXT = VALUE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DEFINITION = VALUE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DIFFDEFINITION = VALUE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__VALUE = VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__LEFT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__RIGHT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__OPERATOR = VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DIFFLEFT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR__DIFFRIGHT = VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Math Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Math Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATOR_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.VariableImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PREVIOUS = VALUE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NEXT = VALUE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DIFFPREVIOUS = VALUE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DIFFNEXT = VALUE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFINITION = VALUE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DIFFDEFINITION = VALUE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.SetImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSet()
	 * @generated
	 */
	int SET = 25;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DIFFVARIABLE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DIFFVALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.NumericalOperatorImpl <em>Numerical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.NumericalOperatorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getNumericalOperator()
	 * @generated
	 */
	int NUMERICAL_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__PREVIOUS = MATH_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__NEXT = MATH_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DIFFPREVIOUS = MATH_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DIFFNEXT = MATH_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DEFINITION = MATH_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DIFFDEFINITION = MATH_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__VALUE = MATH_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__LEFT = MATH_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__RIGHT = MATH_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__OPERATOR = MATH_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DIFFLEFT = MATH_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR__DIFFRIGHT = MATH_OPERATOR__DIFFRIGHT;

	/**
	 * The number of structural features of the '<em>Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR_FEATURE_COUNT = MATH_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_OPERATOR_OPERATION_COUNT = MATH_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.BooleanOperatorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__PREVIOUS = MATH_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__NEXT = MATH_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DIFFPREVIOUS = MATH_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DIFFNEXT = MATH_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DEFINITION = MATH_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DIFFDEFINITION = MATH_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__VALUE = MATH_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__LEFT = MATH_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__RIGHT = MATH_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__OPERATOR = MATH_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DIFFLEFT = MATH_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR__DIFFRIGHT = MATH_OPERATOR__DIFFRIGHT;

	/**
	 * The number of structural features of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_FEATURE_COUNT = MATH_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATOR_OPERATION_COUNT = MATH_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ConstantImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__PREVIOUS = VALUE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NEXT = VALUE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DIFFPREVIOUS = VALUE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DIFFNEXT = VALUE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DEFINITION = VALUE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DIFFDEFINITION = VALUE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.IfImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getIf()
	 * @generated
	 */
	int IF = 30;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PREVIOUS = CONTROL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NEXT = CONTROL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DIFFPREVIOUS = CONTROL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DIFFNEXT = CONTROL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__INSTRUCTIONS = CONTROL__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DIFFINSTRUCTIONS = CONTROL__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DIFFCONDITION = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.FunctionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Param Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAM_DEFS = 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Diffparam Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DIFFPARAM_DEFS = 3;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DIFFINSTRUCTIONS = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ParameterDefinitionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ParameterImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 33;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIFFDEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.FunctionCallImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 34;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DEFINITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DIFFDEFINITION = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diffparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DIFFPARAMETERS = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.ParameterCallImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterCall()
	 * @generated
	 */
	int PARAMETER_CALL = 35;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__DIFFPREVIOUS = INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__DIFFNEXT = INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__DEFINITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__DIFFDEFINITION = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DomainSpecificDiffImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDomainSpecificDiff()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_DIFF = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Hardware</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE = 1;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM = 2;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Digital Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN = 4;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN = 5;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Analog Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN = 6;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Sketch</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH = 7;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION = 8;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Module Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION = 11;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Utilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES = 13;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff IO</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO = 14;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Delay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY = 15;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Input Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE = 16;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Output Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE = 17;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR = 19;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Repeat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT = 20;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff While</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE = 22;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Math Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET = 25;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Numerical Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Boolean Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff If</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF = 30;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION = 31;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER = 33;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Function Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL = 34;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL = 35;

	/**
	 * The number of structural features of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = 36;

	/**
	 * The number of operations of the '<em>Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffHardwareImpl <em>Diff Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffHardwareImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware()
	 * @generated
	 */
	int DIFF_HARDWARE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__NAME = HARDWARE__NAME;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__PLATFORMS = HARDWARE__PLATFORMS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__MODULES = HARDWARE__MODULES;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__CONNECTORS = HARDWARE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Diffplatforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__DIFFPLATFORMS = HARDWARE__DIFFPLATFORMS;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__DIFFMODULES = HARDWARE__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__DIFFCONNECTORS = HARDWARE__DIFFCONNECTORS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__OPERATION = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE__NEW_NAME = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffHardware_platformsImpl <em>Diff Hardware platforms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffHardware_platformsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_platforms()
	 * @generated
	 */
	int DIFF_HARDWARE_PLATFORMS = 38;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_PLATFORMS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_PLATFORMS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Hardware platforms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_PLATFORMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Hardware platforms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_PLATFORMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffHardware_modulesImpl <em>Diff Hardware modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffHardware_modulesImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_modules()
	 * @generated
	 */
	int DIFF_HARDWARE_MODULES = 39;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_MODULES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_MODULES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Hardware modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_MODULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Hardware modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffHardware_connectorsImpl <em>Diff Hardware connectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffHardware_connectorsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_connectors()
	 * @generated
	 */
	int DIFF_HARDWARE_CONNECTORS = 40;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_CONNECTORS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_CONNECTORS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Hardware connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_CONNECTORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Hardware connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_HARDWARE_CONNECTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffPlatformImpl <em>Diff Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffPlatformImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform()
	 * @generated
	 */
	int DIFF_PLATFORM = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__NAME = PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__DIGITAL_PINS = PLATFORM__DIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__ANALOG_PINS = PLATFORM__ANALOG_PINS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__IMAGE = PLATFORM__IMAGE;

	/**
	 * The feature id for the '<em><b>Diffdigital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__DIFFDIGITAL_PINS = PLATFORM__DIFFDIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Diffanalog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__DIFFANALOG_PINS = PLATFORM__DIFFANALOG_PINS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__OPERATION = PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__NEW_NAME = PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM__NEW_IMAGE = PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_FEATURE_COUNT = PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_OPERATION_COUNT = PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffPlatform_digitalPinsImpl <em>Diff Platform digital Pins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffPlatform_digitalPinsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform_digitalPins()
	 * @generated
	 */
	int DIFF_PLATFORM_DIGITAL_PINS = 42;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_DIGITAL_PINS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_DIGITAL_PINS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Platform digital Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_DIGITAL_PINS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Platform digital Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_DIGITAL_PINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffPlatform_analogPinsImpl <em>Diff Platform analog Pins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffPlatform_analogPinsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform_analogPins()
	 * @generated
	 */
	int DIFF_PLATFORM_ANALOG_PINS = 43;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_ANALOG_PINS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_ANALOG_PINS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Platform analog Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_ANALOG_PINS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Platform analog Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PLATFORM_ANALOG_PINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffDigitalPinImpl <em>Diff Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffDigitalPinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffDigitalPin()
	 * @generated
	 */
	int DIFF_DIGITAL_PIN = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DIGITAL_PIN__ID = DIGITAL_PIN__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DIGITAL_PIN__OPERATION = DIGITAL_PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DIGITAL_PIN__NEW_ID = DIGITAL_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DIGITAL_PIN_FEATURE_COUNT = DIGITAL_PIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DIGITAL_PIN_OPERATION_COUNT = DIGITAL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffAnalogPinImpl <em>Diff Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffAnalogPinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffAnalogPin()
	 * @generated
	 */
	int DIFF_ANALOG_PIN = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ANALOG_PIN__ID = ANALOG_PIN__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ANALOG_PIN__OPERATION = ANALOG_PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ANALOG_PIN__NEW_ID = ANALOG_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ANALOG_PIN_FEATURE_COUNT = ANALOG_PIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ANALOG_PIN_OPERATION_COUNT = ANALOG_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSketchImpl <em>Diff Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSketchImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch()
	 * @generated
	 */
	int DIFF_SKETCH = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__NAME = SKETCH__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__PREVIOUS = SKETCH__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__NEXT = SKETCH__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__DIFFPREVIOUS = SKETCH__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__DIFFNEXT = SKETCH__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__HARDWARE = SKETCH__HARDWARE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__INSTRUCTIONS = SKETCH__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__FUNCTIONS = SKETCH__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__DIFFHARDWARE = SKETCH__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__DIFFINSTRUCTIONS = SKETCH__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Difffunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__DIFFFUNCTIONS = SKETCH__DIFFFUNCTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__OPERATION = SKETCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH__NEW_NAME = SKETCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_FEATURE_COUNT = SKETCH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_OPERATION_COUNT = SKETCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSketch_hardwareImpl <em>Diff Sketch hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSketch_hardwareImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_hardware()
	 * @generated
	 */
	int DIFF_SKETCH_HARDWARE = 47;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_HARDWARE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_HARDWARE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Sketch hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_HARDWARE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Sketch hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSketch_instructionsImpl <em>Diff Sketch instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSketch_instructionsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_instructions()
	 * @generated
	 */
	int DIFF_SKETCH_INSTRUCTIONS = 48;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_INSTRUCTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_INSTRUCTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Sketch instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_INSTRUCTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Sketch instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSketch_functionsImpl <em>Diff Sketch functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSketch_functionsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_functions()
	 * @generated
	 */
	int DIFF_SKETCH_FUNCTIONS = 49;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_FUNCTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_FUNCTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Sketch functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_FUNCTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Sketch functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SKETCH_FUNCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProjectImpl <em>Diff Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProjectImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject()
	 * @generated
	 */
	int DIFF_PROJECT = 50;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__HARDWARE = PROJECT__HARDWARE;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__SKETCH = PROJECT__SKETCH;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__MODULES = PROJECT__MODULES;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__PLATFORM = PROJECT__PLATFORM;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DOMAINSPECIFICDIFFS = PROJECT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DIFFHARDWARE = PROJECT__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffsketch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DIFFSKETCH = PROJECT__DIFFSKETCH;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DIFFMODULES = PROJECT__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffplatform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DIFFPLATFORM = PROJECT__DIFFPLATFORM;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__DIFFDOMAINSPECIFICDIFFS = PROJECT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT__OPERATION = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_OPERATION_COUNT = PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProject_hardwareImpl <em>Diff Project hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProject_hardwareImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_hardware()
	 * @generated
	 */
	int DIFF_PROJECT_HARDWARE = 51;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_HARDWARE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_HARDWARE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Project hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_HARDWARE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Project hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProject_sketchImpl <em>Diff Project sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProject_sketchImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_sketch()
	 * @generated
	 */
	int DIFF_PROJECT_SKETCH = 52;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_SKETCH__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_SKETCH__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Project sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_SKETCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Project sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_SKETCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProject_modulesImpl <em>Diff Project modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProject_modulesImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_modules()
	 * @generated
	 */
	int DIFF_PROJECT_MODULES = 53;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_MODULES__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_MODULES__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Project modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_MODULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Project modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_MODULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProject_platformImpl <em>Diff Project platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProject_platformImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_platform()
	 * @generated
	 */
	int DIFF_PROJECT_PLATFORM = 54;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_PLATFORM__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_PLATFORM__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Project platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_PLATFORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Project platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffProject_domainspecificdiffsImpl <em>Diff Project domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffProject_domainspecificdiffsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_domainspecificdiffs()
	 * @generated
	 */
	int DIFF_PROJECT_DOMAINSPECIFICDIFFS = 55;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_DOMAINSPECIFICDIFFS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_DOMAINSPECIFICDIFFS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Project domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_DOMAINSPECIFICDIFFS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Project domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PROJECT_DOMAINSPECIFICDIFFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffInstruction_previousImpl <em>Diff Instruction previous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffInstruction_previousImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInstruction_previous()
	 * @generated
	 */
	int DIFF_INSTRUCTION_PREVIOUS = 56;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_PREVIOUS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_PREVIOUS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Instruction previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_PREVIOUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Instruction previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_PREVIOUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffInstruction_nextImpl <em>Diff Instruction next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffInstruction_nextImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInstruction_next()
	 * @generated
	 */
	int DIFF_INSTRUCTION_NEXT = 57;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_NEXT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_NEXT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Instruction next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_NEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Instruction next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INSTRUCTION_NEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffStatusImpl <em>Diff Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffStatusImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffStatus()
	 * @generated
	 */
	int DIFF_STATUS = 58;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__PREVIOUS = STATUS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__NEXT = STATUS__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DIFFPREVIOUS = STATUS__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DIFFNEXT = STATUS__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DEFINITION = STATUS__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DIFFDEFINITION = STATUS__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__MODULE = STATUS__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DIFFMODULE = STATUS__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__VALUE = STATUS__VALUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__STATUS = STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__SENSOR = STATUS__SENSOR;

	/**
	 * The feature id for the '<em><b>Diffsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__DIFFSENSOR = STATUS__DIFFSENSOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__OPERATION = STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__NEW_VALUE = STATUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS__NEW_STATUS = STATUS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_FEATURE_COUNT = STATUS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_OPERATION_COUNT = STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffStatus_sensorImpl <em>Diff Status sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffStatus_sensorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffStatus_sensor()
	 * @generated
	 */
	int DIFF_STATUS_SENSOR = 59;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_SENSOR__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_SENSOR__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Status sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_SENSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Status sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STATUS_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffLevelImpl <em>Diff Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffLevelImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffLevel()
	 * @generated
	 */
	int DIFF_LEVEL = 60;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__PREVIOUS = LEVEL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__NEXT = LEVEL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DIFFPREVIOUS = LEVEL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DIFFNEXT = LEVEL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DEFINITION = LEVEL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DIFFDEFINITION = LEVEL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__MODULE = LEVEL__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DIFFMODULE = LEVEL__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__LEVEL = LEVEL__LEVEL;

	/**
	 * The feature id for the '<em><b>Difflevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__DIFFLEVEL = LEVEL__DIFFLEVEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL__OPERATION = LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_FEATURE_COUNT = LEVEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_OPERATION_COUNT = LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffLevel_levelImpl <em>Diff Level level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffLevel_levelImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffLevel_level()
	 * @generated
	 */
	int DIFF_LEVEL_LEVEL = 61;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_LEVEL__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_LEVEL__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Level level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_LEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Level level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_LEVEL_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffModuleInstruction_moduleImpl <em>Diff Module Instruction module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffModuleInstruction_moduleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffModuleInstruction_module()
	 * @generated
	 */
	int DIFF_MODULE_INSTRUCTION_MODULE = 62;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODULE_INSTRUCTION_MODULE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODULE_INSTRUCTION_MODULE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Module Instruction module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODULE_INSTRUCTION_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Module Instruction module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODULE_INSTRUCTION_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffControl_instructionsImpl <em>Diff Control instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffControl_instructionsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffControl_instructions()
	 * @generated
	 */
	int DIFF_CONTROL_INSTRUCTIONS = 63;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTROL_INSTRUCTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTROL_INSTRUCTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Control instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTROL_INSTRUCTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Control instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTROL_INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffDelayImpl <em>Diff Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffDelayImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffDelay()
	 * @generated
	 */
	int DIFF_DELAY = 64;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__PREVIOUS = DELAY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__NEXT = DELAY__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__DIFFPREVIOUS = DELAY__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__DIFFNEXT = DELAY__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__DEFINITION = DELAY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__DIFFDEFINITION = DELAY__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__UNIT = DELAY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__VALUE = DELAY__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__OPERATION = DELAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__NEW_UNIT = DELAY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY__NEW_VALUE = DELAY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY_FEATURE_COUNT = DELAY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_DELAY_OPERATION_COUNT = DELAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffInputModuleImpl <em>Diff Input Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffInputModuleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInputModule()
	 * @generated
	 */
	int DIFF_INPUT_MODULE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NAME = INPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__KIND = INPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__IMAGE = INPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__LEVEL = INPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__LIBRARY = INPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__OPERATION = INPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NEW_NAME = INPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NEW_KIND = INPUT_MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NEW_IMAGE = INPUT_MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NEW_LEVEL = INPUT_MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE__NEW_LIBRARY = INPUT_MODULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE_FEATURE_COUNT = INPUT_MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_INPUT_MODULE_OPERATION_COUNT = INPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffOutputModuleImpl <em>Diff Output Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffOutputModuleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffOutputModule()
	 * @generated
	 */
	int DIFF_OUTPUT_MODULE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NAME = OUTPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__KIND = OUTPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__IMAGE = OUTPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__LEVEL = OUTPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__LIBRARY = OUTPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__OPERATION = OUTPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NEW_NAME = OUTPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NEW_KIND = OUTPUT_MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NEW_IMAGE = OUTPUT_MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NEW_LEVEL = OUTPUT_MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE__NEW_LIBRARY = OUTPUT_MODULE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Diff Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE_FEATURE_COUNT = OUTPUT_MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Diff Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OUTPUT_MODULE_OPERATION_COUNT = OUTPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffConnectorImpl <em>Diff Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffConnectorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector()
	 * @generated
	 */
	int DIFF_CONNECTOR = 67;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR__PIN = CONNECTOR__PIN;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR__MODULE = CONNECTOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR__DIFFPIN = CONNECTOR__DIFFPIN;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR__DIFFMODULE = CONNECTOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR__OPERATION = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffConnector_pinImpl <em>Diff Connector pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffConnector_pinImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector_pin()
	 * @generated
	 */
	int DIFF_CONNECTOR_PIN = 68;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_PIN__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_PIN__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Connector pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_PIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Connector pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffConnector_moduleImpl <em>Diff Connector module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffConnector_moduleImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector_module()
	 * @generated
	 */
	int DIFF_CONNECTOR_MODULE = 69;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_MODULE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_MODULE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Connector module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Connector module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONNECTOR_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffRepeatImpl <em>Diff Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffRepeatImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffRepeat()
	 * @generated
	 */
	int DIFF_REPEAT = 70;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__PREVIOUS = REPEAT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__NEXT = REPEAT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__DIFFPREVIOUS = REPEAT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__DIFFNEXT = REPEAT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__INSTRUCTIONS = REPEAT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__DIFFINSTRUCTIONS = REPEAT__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__ITERATION = REPEAT__ITERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__OPERATION = REPEAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT__NEW_ITERATION = REPEAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT_FEATURE_COUNT = REPEAT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REPEAT_OPERATION_COUNT = REPEAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSensorImpl <em>Diff Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSensorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSensor()
	 * @generated
	 */
	int DIFF_SENSOR = 71;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__PREVIOUS = SENSOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__NEXT = SENSOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFPREVIOUS = SENSOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFNEXT = SENSOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DEFINITION = SENSOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFDEFINITION = SENSOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__MODULE = SENSOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFMODULE = SENSOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__VALUE = SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__LEFT = SENSOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__RIGHT = SENSOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__OPERATOR = SENSOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFLEFT = SENSOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFRIGHT = SENSOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__STATUS = SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Diffstatus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__DIFFSTATUS = SENSOR__DIFFSTATUS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__OPERATION = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__NEW_VALUE = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR__NEW_OPERATOR = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSensor_statusImpl <em>Diff Sensor status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSensor_statusImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSensor_status()
	 * @generated
	 */
	int DIFF_SENSOR_STATUS = 72;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_STATUS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_STATUS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Sensor status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Sensor status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SENSOR_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffWhileImpl <em>Diff While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffWhileImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffWhile()
	 * @generated
	 */
	int DIFF_WHILE = 73;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__PREVIOUS = WHILE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__NEXT = WHILE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__DIFFPREVIOUS = WHILE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__DIFFNEXT = WHILE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__INSTRUCTIONS = WHILE__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__DIFFINSTRUCTIONS = WHILE__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__CONDITION = WHILE__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__DIFFCONDITION = WHILE__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE__OPERATION = WHILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_FEATURE_COUNT = WHILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_OPERATION_COUNT = WHILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffWhile_conditionImpl <em>Diff While condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffWhile_conditionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffWhile_condition()
	 * @generated
	 */
	int DIFF_WHILE_CONDITION = 74;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_CONDITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_CONDITION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff While condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff While condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_WHILE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffMathOperator_leftImpl <em>Diff Math Operator left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffMathOperator_leftImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffMathOperator_left()
	 * @generated
	 */
	int DIFF_MATH_OPERATOR_LEFT = 75;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_LEFT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_LEFT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Math Operator left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_LEFT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Math Operator left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_LEFT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffMathOperator_rightImpl <em>Diff Math Operator right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffMathOperator_rightImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffMathOperator_right()
	 * @generated
	 */
	int DIFF_MATH_OPERATOR_RIGHT = 76;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_RIGHT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_RIGHT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Math Operator right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_RIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Math Operator right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MATH_OPERATOR_RIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffVariableImpl <em>Diff Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffVariableImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffVariable()
	 * @generated
	 */
	int DIFF_VARIABLE = 77;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__PREVIOUS = VARIABLE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__NEXT = VARIABLE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__DIFFPREVIOUS = VARIABLE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__DIFFNEXT = VARIABLE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__DEFINITION = VARIABLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__DIFFDEFINITION = VARIABLE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__OPERATION = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__NEW_VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE__NEW_NAME = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSetImpl <em>Diff Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSetImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet()
	 * @generated
	 */
	int DIFF_SET = 78;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__PREVIOUS = SET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__NEXT = SET__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__DIFFPREVIOUS = SET__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__DIFFNEXT = SET__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__VARIABLE = SET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__VALUE = SET__VALUE;

	/**
	 * The feature id for the '<em><b>Diffvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__DIFFVARIABLE = SET__DIFFVARIABLE;

	/**
	 * The feature id for the '<em><b>Diffvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__DIFFVALUE = SET__DIFFVALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET__OPERATION = SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_FEATURE_COUNT = SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_OPERATION_COUNT = SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSet_variableImpl <em>Diff Set variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSet_variableImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet_variable()
	 * @generated
	 */
	int DIFF_SET_VARIABLE = 79;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VARIABLE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VARIABLE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Set variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Set variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffSet_valueImpl <em>Diff Set value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffSet_valueImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet_value()
	 * @generated
	 */
	int DIFF_SET_VALUE = 80;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VALUE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VALUE__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Set value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Set value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_SET_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffNumericalOperatorImpl <em>Diff Numerical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffNumericalOperatorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffNumericalOperator()
	 * @generated
	 */
	int DIFF_NUMERICAL_OPERATOR = 81;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__PREVIOUS = NUMERICAL_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__NEXT = NUMERICAL_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DIFFPREVIOUS = NUMERICAL_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DIFFNEXT = NUMERICAL_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DEFINITION = NUMERICAL_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DIFFDEFINITION = NUMERICAL_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__VALUE = NUMERICAL_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__LEFT = NUMERICAL_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__RIGHT = NUMERICAL_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__OPERATOR = NUMERICAL_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DIFFLEFT = NUMERICAL_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__DIFFRIGHT = NUMERICAL_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__OPERATION = NUMERICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__NEW_VALUE = NUMERICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR__NEW_OPERATOR = NUMERICAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR_FEATURE_COUNT = NUMERICAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_NUMERICAL_OPERATOR_OPERATION_COUNT = NUMERICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffBooleanOperatorImpl <em>Diff Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffBooleanOperatorImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffBooleanOperator()
	 * @generated
	 */
	int DIFF_BOOLEAN_OPERATOR = 82;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__PREVIOUS = BOOLEAN_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__NEXT = BOOLEAN_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DIFFPREVIOUS = BOOLEAN_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DIFFNEXT = BOOLEAN_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DEFINITION = BOOLEAN_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DIFFDEFINITION = BOOLEAN_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__VALUE = BOOLEAN_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__LEFT = BOOLEAN_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__RIGHT = BOOLEAN_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__OPERATOR = BOOLEAN_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DIFFLEFT = BOOLEAN_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__DIFFRIGHT = BOOLEAN_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__OPERATION = BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__NEW_VALUE = BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR__NEW_OPERATOR = BOOLEAN_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR_FEATURE_COUNT = BOOLEAN_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_BOOLEAN_OPERATOR_OPERATION_COUNT = BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffConstantImpl <em>Diff Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffConstantImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConstant()
	 * @generated
	 */
	int DIFF_CONSTANT = 83;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__PREVIOUS = CONSTANT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__NEXT = CONSTANT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__DIFFPREVIOUS = CONSTANT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__DIFFNEXT = CONSTANT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__DEFINITION = CONSTANT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__DIFFDEFINITION = CONSTANT__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__VALUE = CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__OPERATION = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT__NEW_VALUE = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffIfImpl <em>Diff If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffIfImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffIf()
	 * @generated
	 */
	int DIFF_IF = 84;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__PREVIOUS = IF__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__NEXT = IF__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__DIFFPREVIOUS = IF__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__DIFFNEXT = IF__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__INSTRUCTIONS = IF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__DIFFINSTRUCTIONS = IF__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__CONDITION = IF__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__DIFFCONDITION = IF__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF__OPERATION = IF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_FEATURE_COUNT = IF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_OPERATION_COUNT = IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffIf_conditionImpl <em>Diff If condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffIf_conditionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffIf_condition()
	 * @generated
	 */
	int DIFF_IF_CONDITION = 85;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_CONDITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_CONDITION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff If condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff If condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_IF_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunctionImpl <em>Diff Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunctionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction()
	 * @generated
	 */
	int DIFF_FUNCTION = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Param Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__PARAM_DEFS = FUNCTION__PARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__INSTRUCTIONS = FUNCTION__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffparam Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__DIFFPARAM_DEFS = FUNCTION__DIFFPARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__DIFFINSTRUCTIONS = FUNCTION__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__OPERATION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION__NEW_NAME = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diff Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diff Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunction_paramDefsImpl <em>Diff Function param Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunction_paramDefsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction_paramDefs()
	 * @generated
	 */
	int DIFF_FUNCTION_PARAM_DEFS = 87;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_PARAM_DEFS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_PARAM_DEFS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Function param Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_PARAM_DEFS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Function param Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_PARAM_DEFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunction_instructionsImpl <em>Diff Function instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunction_instructionsImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction_instructions()
	 * @generated
	 */
	int DIFF_FUNCTION_INSTRUCTIONS = 88;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_INSTRUCTIONS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_INSTRUCTIONS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Function instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_INSTRUCTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Function instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffParameterDefinitionImpl <em>Diff Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffParameterDefinitionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterDefinition()
	 * @generated
	 */
	int DIFF_PARAMETER_DEFINITION = 89;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION__TYPE = PARAMETER_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION__NAME = PARAMETER_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION__OPERATION = PARAMETER_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION__NEW_TYPE = PARAMETER_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION__NEW_NAME = PARAMETER_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diff Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION_FEATURE_COUNT = PARAMETER_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diff Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_DEFINITION_OPERATION_COUNT = PARAMETER_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffParameter_to_definitionImpl <em>Diff Parameter to definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffParameter_to_definitionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameter_to_definition()
	 * @generated
	 */
	int DIFF_PARAMETER_TO_DEFINITION = 90;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_TO_DEFINITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_TO_DEFINITION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Parameter to definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_TO_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Parameter to definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_TO_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunctionCallImpl <em>Diff Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunctionCallImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall()
	 * @generated
	 */
	int DIFF_FUNCTION_CALL = 91;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__PREVIOUS = FUNCTION_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__NEXT = FUNCTION_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__DIFFPREVIOUS = FUNCTION_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__DIFFNEXT = FUNCTION_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__DEFINITION = FUNCTION_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__PARAMETERS = FUNCTION_CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__DIFFDEFINITION = FUNCTION_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Diffparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__DIFFPARAMETERS = FUNCTION_CALL__DIFFPARAMETERS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL__OPERATION = FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_FEATURE_COUNT = FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_OPERATION_COUNT = FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunctionCall_definitionImpl <em>Diff Function Call definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunctionCall_definitionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall_definition()
	 * @generated
	 */
	int DIFF_FUNCTION_CALL_DEFINITION = 92;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_DEFINITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_DEFINITION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Function Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Function Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffFunctionCall_parametersImpl <em>Diff Function Call parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffFunctionCall_parametersImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall_parameters()
	 * @generated
	 */
	int DIFF_FUNCTION_CALL_PARAMETERS = 93;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_PARAMETERS__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_PARAMETERS__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Function Call parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Function Call parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FUNCTION_CALL_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffParameterCallImpl <em>Diff Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffParameterCallImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterCall()
	 * @generated
	 */
	int DIFF_PARAMETER_CALL = 94;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__PREVIOUS = PARAMETER_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__NEXT = PARAMETER_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__DIFFPREVIOUS = PARAMETER_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__DIFFNEXT = PARAMETER_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__DEFINITION = PARAMETER_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__DIFFDEFINITION = PARAMETER_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL__OPERATION = PARAMETER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_FEATURE_COUNT = PARAMETER_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diff Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_OPERATION_COUNT = PARAMETER_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.impl.DiffParameterCall_definitionImpl <em>Diff Parameter Call definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.impl.DiffParameterCall_definitionImpl
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterCall_definition()
	 * @generated
	 */
	int DIFF_PARAMETER_CALL_DEFINITION = 95;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_DEFINITION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_DEFINITION__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Diff Parameter Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Diff Parameter Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_PARAMETER_CALL_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.Time <em>Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.Time
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 96;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.ModuleKind <em>Module Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.ModuleKind
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModuleKind()
	 * @generated
	 */
	int MODULE_KIND = 97;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.OperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.OperatorKind
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getOperatorKind()
	 * @generated
	 */
	int OPERATOR_KIND = 98;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.Library <em>Library</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.Library
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 99;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.ParameterType
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 100;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.ClassOp <em>Class Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.ClassOp
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getClassOp()
	 * @generated
	 */
	int CLASS_OP = 101;

	/**
	 * The meta object id for the '{@link arduinoDiffMM.AscOp <em>Asc Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoDiffMM.AscOp
	 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getAscOp()
	 * @generated
	 */
	int ASC_OP = 102;


	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see arduinoDiffMM.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.Hardware#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Platforms</em>'.
	 * @see arduinoDiffMM.Hardware#getPlatforms()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Platforms();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.Hardware#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see arduinoDiffMM.Hardware#getModules()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Hardware#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see arduinoDiffMM.Hardware#getConnectors()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Hardware#getDiffplatforms <em>Diffplatforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplatforms</em>'.
	 * @see arduinoDiffMM.Hardware#getDiffplatforms()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Diffplatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Hardware#getDiffmodules <em>Diffmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodules</em>'.
	 * @see arduinoDiffMM.Hardware#getDiffmodules()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Diffmodules();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Hardware#getDiffconnectors <em>Diffconnectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffconnectors</em>'.
	 * @see arduinoDiffMM.Hardware#getDiffconnectors()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Diffconnectors();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see arduinoDiffMM.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Platform#getDigitalPins <em>Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Pins</em>'.
	 * @see arduinoDiffMM.Platform#getDigitalPins()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_DigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Platform#getAnalogPins <em>Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analog Pins</em>'.
	 * @see arduinoDiffMM.Platform#getAnalogPins()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_AnalogPins();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Platform#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see arduinoDiffMM.Platform#getImage()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Platform#getDiffdigitalPins <em>Diffdigital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdigital Pins</em>'.
	 * @see arduinoDiffMM.Platform#getDiffdigitalPins()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_DiffdigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Platform#getDiffanalogPins <em>Diffanalog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffanalog Pins</em>'.
	 * @see arduinoDiffMM.Platform#getDiffanalogPins()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_DiffanalogPins();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see arduinoDiffMM.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Module#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see arduinoDiffMM.Module#getKind()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Kind();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Module#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see arduinoDiffMM.Module#getImage()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Image();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Module#isLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see arduinoDiffMM.Module#isLevel()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Module#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see arduinoDiffMM.Module#getLibrary()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Library();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Pin</em>'.
	 * @see arduinoDiffMM.DigitalPin
	 * @generated
	 */
	EClass getDigitalPin();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see arduinoDiffMM.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Pin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see arduinoDiffMM.Pin#getId()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Id();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Pin</em>'.
	 * @see arduinoDiffMM.AnalogPin
	 * @generated
	 */
	EClass getAnalogPin();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see arduinoDiffMM.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Sketch#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware</em>'.
	 * @see arduinoDiffMM.Sketch#getHardware()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Hardware();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sketch#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see arduinoDiffMM.Sketch#getInstructions()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sketch#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see arduinoDiffMM.Sketch#getFunctions()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sketch#getDiffhardware <em>Diffhardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffhardware</em>'.
	 * @see arduinoDiffMM.Sketch#getDiffhardware()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Diffhardware();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sketch#getDiffinstructions <em>Diffinstructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinstructions</em>'.
	 * @see arduinoDiffMM.Sketch#getDiffinstructions()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Diffinstructions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sketch#getDifffunctions <em>Difffunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difffunctions</em>'.
	 * @see arduinoDiffMM.Sketch#getDifffunctions()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Difffunctions();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see arduinoDiffMM.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoDiffMM.Project#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hardware</em>'.
	 * @see arduinoDiffMM.Project#getHardware()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Hardware();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoDiffMM.Project#getSketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sketch</em>'.
	 * @see arduinoDiffMM.Project#getSketch()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sketch();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see arduinoDiffMM.Project#getModules()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform</em>'.
	 * @see arduinoDiffMM.Project#getPlatform()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDomainspecificdiffs <em>Domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainspecificdiffs</em>'.
	 * @see arduinoDiffMM.Project#getDomainspecificdiffs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Domainspecificdiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDiffhardware <em>Diffhardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffhardware</em>'.
	 * @see arduinoDiffMM.Project#getDiffhardware()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Diffhardware();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDiffsketch <em>Diffsketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsketch</em>'.
	 * @see arduinoDiffMM.Project#getDiffsketch()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Diffsketch();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDiffmodules <em>Diffmodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodules</em>'.
	 * @see arduinoDiffMM.Project#getDiffmodules()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Diffmodules();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDiffplatform <em>Diffplatform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffplatform</em>'.
	 * @see arduinoDiffMM.Project#getDiffplatform()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Diffplatform();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Project#getDiffdomainspecificdiffs <em>Diffdomainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdomainspecificdiffs</em>'.
	 * @see arduinoDiffMM.Project#getDiffdomainspecificdiffs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Diffdomainspecificdiffs();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see arduinoDiffMM.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Instruction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see arduinoDiffMM.Instruction#getPrevious()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Previous();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Instruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see arduinoDiffMM.Instruction#getNext()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Instruction#getDiffprevious <em>Diffprevious</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffprevious</em>'.
	 * @see arduinoDiffMM.Instruction#getDiffprevious()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Diffprevious();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Instruction#getDiffnext <em>Diffnext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffnext</em>'.
	 * @see arduinoDiffMM.Instruction#getDiffnext()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Diffnext();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see arduinoDiffMM.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Status#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see arduinoDiffMM.Status#isStatus()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Status();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Status#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see arduinoDiffMM.Status#getSensor()
	 * @see #getStatus()
	 * @generated
	 */
	EReference getStatus_Sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Status#getDiffsensor <em>Diffsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffsensor</em>'.
	 * @see arduinoDiffMM.Status#getDiffsensor()
	 * @see #getStatus()
	 * @generated
	 */
	EReference getStatus_Diffsensor();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see arduinoDiffMM.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Level#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see arduinoDiffMM.Level#getLevel()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Level#getDifflevel <em>Difflevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difflevel</em>'.
	 * @see arduinoDiffMM.Level#getDifflevel()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Difflevel();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.ModuleInstruction <em>Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instruction</em>'.
	 * @see arduinoDiffMM.ModuleInstruction
	 * @generated
	 */
	EClass getModuleInstruction();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.ModuleInstruction#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see arduinoDiffMM.ModuleInstruction#getModule()
	 * @see #getModuleInstruction()
	 * @generated
	 */
	EReference getModuleInstruction_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.ModuleInstruction#getDiffmodule <em>Diffmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodule</em>'.
	 * @see arduinoDiffMM.ModuleInstruction#getDiffmodule()
	 * @see #getModuleInstruction()
	 * @generated
	 */
	EReference getModuleInstruction_Diffmodule();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see arduinoDiffMM.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Control#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see arduinoDiffMM.Control#getInstructions()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Control#getDiffinstructions <em>Diffinstructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinstructions</em>'.
	 * @see arduinoDiffMM.Control#getDiffinstructions()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Diffinstructions();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Utilities <em>Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilities</em>'.
	 * @see arduinoDiffMM.Utilities
	 * @generated
	 */
	EClass getUtilities();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.IO <em>IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO</em>'.
	 * @see arduinoDiffMM.IO
	 * @generated
	 */
	EClass getIO();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see arduinoDiffMM.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Delay#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see arduinoDiffMM.Delay#getUnit()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Unit();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Delay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoDiffMM.Delay#getValue()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Value();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.InputModule <em>Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Module</em>'.
	 * @see arduinoDiffMM.InputModule
	 * @generated
	 */
	EClass getInputModule();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.OutputModule <em>Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Module</em>'.
	 * @see arduinoDiffMM.OutputModule
	 * @generated
	 */
	EClass getOutputModule();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see arduinoDiffMM.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoDiffMM.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see arduinoDiffMM.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Connector#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin</em>'.
	 * @see arduinoDiffMM.Connector#getPin()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Pin();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Connector#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see arduinoDiffMM.Connector#getModule()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Connector#getDiffpin <em>Diffpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffpin</em>'.
	 * @see arduinoDiffMM.Connector#getDiffpin()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Diffpin();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Connector#getDiffmodule <em>Diffmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffmodule</em>'.
	 * @see arduinoDiffMM.Connector#getDiffmodule()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Diffmodule();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see arduinoDiffMM.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Repeat#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see arduinoDiffMM.Repeat#getIteration()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Iteration();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see arduinoDiffMM.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.Sensor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Status</em>'.
	 * @see arduinoDiffMM.Sensor#getStatus()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Sensor#getDiffstatus <em>Diffstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffstatus</em>'.
	 * @see arduinoDiffMM.Sensor#getDiffstatus()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Diffstatus();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see arduinoDiffMM.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see arduinoDiffMM.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.While#getDiffcondition <em>Diffcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffcondition</em>'.
	 * @see arduinoDiffMM.While#getDiffcondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Diffcondition();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operator</em>'.
	 * @see arduinoDiffMM.MathOperator
	 * @generated
	 */
	EClass getMathOperator();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.MathOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see arduinoDiffMM.MathOperator#getLeft()
	 * @see #getMathOperator()
	 * @generated
	 */
	EReference getMathOperator_Left();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.MathOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see arduinoDiffMM.MathOperator#getRight()
	 * @see #getMathOperator()
	 * @generated
	 */
	EReference getMathOperator_Right();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.MathOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see arduinoDiffMM.MathOperator#getOperator()
	 * @see #getMathOperator()
	 * @generated
	 */
	EAttribute getMathOperator_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.MathOperator#getDiffleft <em>Diffleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffleft</em>'.
	 * @see arduinoDiffMM.MathOperator#getDiffleft()
	 * @see #getMathOperator()
	 * @generated
	 */
	EReference getMathOperator_Diffleft();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.MathOperator#getDiffright <em>Diffright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffright</em>'.
	 * @see arduinoDiffMM.MathOperator#getDiffright()
	 * @see #getMathOperator()
	 * @generated
	 */
	EReference getMathOperator_Diffright();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see arduinoDiffMM.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoDiffMM.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see arduinoDiffMM.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Set#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see arduinoDiffMM.Set#getVariable()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Variable();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Set#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see arduinoDiffMM.Set#getValue()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Set#getDiffvariable <em>Diffvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvariable</em>'.
	 * @see arduinoDiffMM.Set#getDiffvariable()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Diffvariable();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Set#getDiffvalue <em>Diffvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffvalue</em>'.
	 * @see arduinoDiffMM.Set#getDiffvalue()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Diffvalue();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.NumericalOperator <em>Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Operator</em>'.
	 * @see arduinoDiffMM.NumericalOperator
	 * @generated
	 */
	EClass getNumericalOperator();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operator</em>'.
	 * @see arduinoDiffMM.BooleanOperator
	 * @generated
	 */
	EClass getBooleanOperator();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see arduinoDiffMM.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoDiffMM.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see arduinoDiffMM.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see arduinoDiffMM.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see arduinoDiffMM.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.If#getDiffcondition <em>Diffcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffcondition</em>'.
	 * @see arduinoDiffMM.If#getDiffcondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Diffcondition();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see arduinoDiffMM.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoDiffMM.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Function#getParamDefs <em>Param Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Defs</em>'.
	 * @see arduinoDiffMM.Function#getParamDefs()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ParamDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Function#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see arduinoDiffMM.Function#getInstructions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Function#getDiffparamDefs <em>Diffparam Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffparam Defs</em>'.
	 * @see arduinoDiffMM.Function#getDiffparamDefs()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_DiffparamDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Function#getDiffinstructions <em>Diffinstructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffinstructions</em>'.
	 * @see arduinoDiffMM.Function#getDiffinstructions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Diffinstructions();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see arduinoDiffMM.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.ParameterDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see arduinoDiffMM.ParameterDefinition#getType()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EAttribute getParameterDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.ParameterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoDiffMM.ParameterDefinition#getName()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EAttribute getParameterDefinition_Name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see arduinoDiffMM.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.Parameter#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see arduinoDiffMM.Parameter#getDefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.Parameter#getDiffdefinition <em>Diffdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdefinition</em>'.
	 * @see arduinoDiffMM.Parameter#getDiffdefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Diffdefinition();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see arduinoDiffMM.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.FunctionCall#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see arduinoDiffMM.FunctionCall#getDefinition()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Definition();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.FunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see arduinoDiffMM.FunctionCall#getParameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.FunctionCall#getDiffdefinition <em>Diffdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdefinition</em>'.
	 * @see arduinoDiffMM.FunctionCall#getDiffdefinition()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Diffdefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.FunctionCall#getDiffparameters <em>Diffparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffparameters</em>'.
	 * @see arduinoDiffMM.FunctionCall#getDiffparameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Diffparameters();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see arduinoDiffMM.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.ParameterCall#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see arduinoDiffMM.ParameterCall#getDefinition()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoDiffMM.ParameterCall#getDiffdefinition <em>Diffdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffdefinition</em>'.
	 * @see arduinoDiffMM.ParameterCall#getDiffdefinition()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Diffdefinition();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DomainSpecificDiff <em>Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Diff</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff
	 * @generated
	 */
	EClass getDomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DomainSpecificDiff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getName()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EAttribute getDomainSpecificDiff_Name();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Hardware <em>Domain Specific Diff Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Hardware</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Hardware()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Hardware();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Platform <em>Domain Specific Diff Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Platform</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Platform()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Platform();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Module <em>Domain Specific Diff Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Module</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Module()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Module();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DigitalPin <em>Domain Specific Diff Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Digital Pin</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_DigitalPin()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_DigitalPin();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pin <em>Domain Specific Diff Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Pin</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Pin()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Pin();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_AnalogPin <em>Domain Specific Diff Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Analog Pin</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_AnalogPin()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_AnalogPin();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sketch <em>Domain Specific Diff Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Sketch</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sketch()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Sketch();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Instruction <em>Domain Specific Diff Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Instruction</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Instruction()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Instruction();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Status <em>Domain Specific Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Status</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Status()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Status();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Level <em>Domain Specific Diff Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Level</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Level()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Level();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ModuleInstruction <em>Domain Specific Diff Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Module Instruction</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ModuleInstruction()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ModuleInstruction();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Control <em>Domain Specific Diff Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Control</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Control()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Control();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Utilities <em>Domain Specific Diff Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Utilities</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Utilities()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Utilities();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_IO <em>Domain Specific Diff IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff IO</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_IO()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_IO();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Delay <em>Domain Specific Diff Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Delay</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Delay()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Delay();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_InputModule <em>Domain Specific Diff Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Input Module</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_InputModule()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_InputModule();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_OutputModule <em>Domain Specific Diff Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Output Module</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_OutputModule()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_OutputModule();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NamedElement <em>Domain Specific Diff Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Named Element</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NamedElement()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Connector <em>Domain Specific Diff Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Connector</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Connector()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Connector();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Repeat <em>Domain Specific Diff Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Repeat</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Repeat()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Repeat();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sensor <em>Domain Specific Diff Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Sensor</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Sensor()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Sensor();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_While <em>Domain Specific Diff While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff While</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_While()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_While();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_MathOperator <em>Domain Specific Diff Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Math Operator</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_MathOperator()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_MathOperator();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Variable <em>Domain Specific Diff Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Variable</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Variable()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Variable();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Set <em>Domain Specific Diff Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Set</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Set()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Set();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NumericalOperator <em>Domain Specific Diff Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Numerical Operator</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_NumericalOperator()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_NumericalOperator();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_BooleanOperator <em>Domain Specific Diff Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Boolean Operator</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_BooleanOperator()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_BooleanOperator();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Value <em>Domain Specific Diff Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Value</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Value()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Value();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Constant <em>Domain Specific Diff Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Constant</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Constant()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Constant();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_If <em>Domain Specific Diff If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff If</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_If()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_If();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Function <em>Domain Specific Diff Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Function</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Function()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Function();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterDefinition <em>Domain Specific Diff Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Parameter Definition</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterDefinition()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ParameterDefinition();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Parameter <em>Domain Specific Diff Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Parameter</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_Parameter()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_Parameter();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_FunctionCall <em>Domain Specific Diff Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Function Call</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_FunctionCall()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_FunctionCall();

	/**
	 * Returns the meta object for the reference list '{@link arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterCall <em>Domain Specific Diff Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Specific Diff Parameter Call</em>'.
	 * @see arduinoDiffMM.DomainSpecificDiff#getDomainSpecificDiff_ParameterCall()
	 * @see #getDomainSpecificDiff()
	 * @generated
	 */
	EReference getDomainSpecificDiff_DomainSpecificDiff_ParameterCall();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffHardware <em>Diff Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Hardware</em>'.
	 * @see arduinoDiffMM.DiffHardware
	 * @generated
	 */
	EClass getDiffHardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffHardware#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffHardware#getOperation()
	 * @see #getDiffHardware()
	 * @generated
	 */
	EAttribute getDiffHardware_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffHardware#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffHardware#getNew_name()
	 * @see #getDiffHardware()
	 * @generated
	 */
	EAttribute getDiffHardware_New_name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffHardware_platforms <em>Diff Hardware platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Hardware platforms</em>'.
	 * @see arduinoDiffMM.DiffHardware_platforms
	 * @generated
	 */
	EClass getDiffHardware_platforms();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffHardware_platforms#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffHardware_platforms#getOperation()
	 * @see #getDiffHardware_platforms()
	 * @generated
	 */
	EAttribute getDiffHardware_platforms_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffHardware_platforms#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffHardware_platforms#getEType()
	 * @see #getDiffHardware_platforms()
	 * @generated
	 */
	EReference getDiffHardware_platforms_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffHardware_modules <em>Diff Hardware modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Hardware modules</em>'.
	 * @see arduinoDiffMM.DiffHardware_modules
	 * @generated
	 */
	EClass getDiffHardware_modules();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffHardware_modules#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffHardware_modules#getOperation()
	 * @see #getDiffHardware_modules()
	 * @generated
	 */
	EAttribute getDiffHardware_modules_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffHardware_modules#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffHardware_modules#getEType()
	 * @see #getDiffHardware_modules()
	 * @generated
	 */
	EReference getDiffHardware_modules_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffHardware_connectors <em>Diff Hardware connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Hardware connectors</em>'.
	 * @see arduinoDiffMM.DiffHardware_connectors
	 * @generated
	 */
	EClass getDiffHardware_connectors();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffHardware_connectors#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffHardware_connectors#getOperation()
	 * @see #getDiffHardware_connectors()
	 * @generated
	 */
	EAttribute getDiffHardware_connectors_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffHardware_connectors#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffHardware_connectors#getEType()
	 * @see #getDiffHardware_connectors()
	 * @generated
	 */
	EReference getDiffHardware_connectors_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffPlatform <em>Diff Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Platform</em>'.
	 * @see arduinoDiffMM.DiffPlatform
	 * @generated
	 */
	EClass getDiffPlatform();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffPlatform#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffPlatform#getOperation()
	 * @see #getDiffPlatform()
	 * @generated
	 */
	EAttribute getDiffPlatform_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffPlatform#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffPlatform#getNew_name()
	 * @see #getDiffPlatform()
	 * @generated
	 */
	EAttribute getDiffPlatform_New_name();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffPlatform#getNew_image <em>New image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New image</em>'.
	 * @see arduinoDiffMM.DiffPlatform#getNew_image()
	 * @see #getDiffPlatform()
	 * @generated
	 */
	EAttribute getDiffPlatform_New_image();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffPlatform_digitalPins <em>Diff Platform digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Platform digital Pins</em>'.
	 * @see arduinoDiffMM.DiffPlatform_digitalPins
	 * @generated
	 */
	EClass getDiffPlatform_digitalPins();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffPlatform_digitalPins#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffPlatform_digitalPins#getOperation()
	 * @see #getDiffPlatform_digitalPins()
	 * @generated
	 */
	EAttribute getDiffPlatform_digitalPins_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffPlatform_digitalPins#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffPlatform_digitalPins#getEType()
	 * @see #getDiffPlatform_digitalPins()
	 * @generated
	 */
	EReference getDiffPlatform_digitalPins_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffPlatform_analogPins <em>Diff Platform analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Platform analog Pins</em>'.
	 * @see arduinoDiffMM.DiffPlatform_analogPins
	 * @generated
	 */
	EClass getDiffPlatform_analogPins();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffPlatform_analogPins#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffPlatform_analogPins#getOperation()
	 * @see #getDiffPlatform_analogPins()
	 * @generated
	 */
	EAttribute getDiffPlatform_analogPins_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffPlatform_analogPins#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffPlatform_analogPins#getEType()
	 * @see #getDiffPlatform_analogPins()
	 * @generated
	 */
	EReference getDiffPlatform_analogPins_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffDigitalPin <em>Diff Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Digital Pin</em>'.
	 * @see arduinoDiffMM.DiffDigitalPin
	 * @generated
	 */
	EClass getDiffDigitalPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffDigitalPin#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffDigitalPin#getOperation()
	 * @see #getDiffDigitalPin()
	 * @generated
	 */
	EAttribute getDiffDigitalPin_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffDigitalPin#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see arduinoDiffMM.DiffDigitalPin#getNew_id()
	 * @see #getDiffDigitalPin()
	 * @generated
	 */
	EAttribute getDiffDigitalPin_New_id();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffAnalogPin <em>Diff Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Analog Pin</em>'.
	 * @see arduinoDiffMM.DiffAnalogPin
	 * @generated
	 */
	EClass getDiffAnalogPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffAnalogPin#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffAnalogPin#getOperation()
	 * @see #getDiffAnalogPin()
	 * @generated
	 */
	EAttribute getDiffAnalogPin_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffAnalogPin#getNew_id <em>New id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New id</em>'.
	 * @see arduinoDiffMM.DiffAnalogPin#getNew_id()
	 * @see #getDiffAnalogPin()
	 * @generated
	 */
	EAttribute getDiffAnalogPin_New_id();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSketch <em>Diff Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sketch</em>'.
	 * @see arduinoDiffMM.DiffSketch
	 * @generated
	 */
	EClass getDiffSketch();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSketch#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSketch#getOperation()
	 * @see #getDiffSketch()
	 * @generated
	 */
	EAttribute getDiffSketch_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSketch#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffSketch#getNew_name()
	 * @see #getDiffSketch()
	 * @generated
	 */
	EAttribute getDiffSketch_New_name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSketch_hardware <em>Diff Sketch hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sketch hardware</em>'.
	 * @see arduinoDiffMM.DiffSketch_hardware
	 * @generated
	 */
	EClass getDiffSketch_hardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSketch_hardware#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSketch_hardware#getOperation()
	 * @see #getDiffSketch_hardware()
	 * @generated
	 */
	EAttribute getDiffSketch_hardware_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSketch_hardware#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSketch_hardware#getEType()
	 * @see #getDiffSketch_hardware()
	 * @generated
	 */
	EReference getDiffSketch_hardware_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSketch_instructions <em>Diff Sketch instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sketch instructions</em>'.
	 * @see arduinoDiffMM.DiffSketch_instructions
	 * @generated
	 */
	EClass getDiffSketch_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSketch_instructions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSketch_instructions#getOperation()
	 * @see #getDiffSketch_instructions()
	 * @generated
	 */
	EAttribute getDiffSketch_instructions_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSketch_instructions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSketch_instructions#getEType()
	 * @see #getDiffSketch_instructions()
	 * @generated
	 */
	EReference getDiffSketch_instructions_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSketch_functions <em>Diff Sketch functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sketch functions</em>'.
	 * @see arduinoDiffMM.DiffSketch_functions
	 * @generated
	 */
	EClass getDiffSketch_functions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSketch_functions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSketch_functions#getOperation()
	 * @see #getDiffSketch_functions()
	 * @generated
	 */
	EAttribute getDiffSketch_functions_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSketch_functions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSketch_functions#getEType()
	 * @see #getDiffSketch_functions()
	 * @generated
	 */
	EReference getDiffSketch_functions_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject <em>Diff Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project</em>'.
	 * @see arduinoDiffMM.DiffProject
	 * @generated
	 */
	EClass getDiffProject();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject#getOperation()
	 * @see #getDiffProject()
	 * @generated
	 */
	EAttribute getDiffProject_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject_hardware <em>Diff Project hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project hardware</em>'.
	 * @see arduinoDiffMM.DiffProject_hardware
	 * @generated
	 */
	EClass getDiffProject_hardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject_hardware#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject_hardware#getOperation()
	 * @see #getDiffProject_hardware()
	 * @generated
	 */
	EAttribute getDiffProject_hardware_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffProject_hardware#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffProject_hardware#getEType()
	 * @see #getDiffProject_hardware()
	 * @generated
	 */
	EReference getDiffProject_hardware_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject_sketch <em>Diff Project sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project sketch</em>'.
	 * @see arduinoDiffMM.DiffProject_sketch
	 * @generated
	 */
	EClass getDiffProject_sketch();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject_sketch#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject_sketch#getOperation()
	 * @see #getDiffProject_sketch()
	 * @generated
	 */
	EAttribute getDiffProject_sketch_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffProject_sketch#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffProject_sketch#getEType()
	 * @see #getDiffProject_sketch()
	 * @generated
	 */
	EReference getDiffProject_sketch_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject_modules <em>Diff Project modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project modules</em>'.
	 * @see arduinoDiffMM.DiffProject_modules
	 * @generated
	 */
	EClass getDiffProject_modules();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject_modules#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject_modules#getOperation()
	 * @see #getDiffProject_modules()
	 * @generated
	 */
	EAttribute getDiffProject_modules_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffProject_modules#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffProject_modules#getEType()
	 * @see #getDiffProject_modules()
	 * @generated
	 */
	EReference getDiffProject_modules_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject_platform <em>Diff Project platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project platform</em>'.
	 * @see arduinoDiffMM.DiffProject_platform
	 * @generated
	 */
	EClass getDiffProject_platform();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject_platform#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject_platform#getOperation()
	 * @see #getDiffProject_platform()
	 * @generated
	 */
	EAttribute getDiffProject_platform_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffProject_platform#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffProject_platform#getEType()
	 * @see #getDiffProject_platform()
	 * @generated
	 */
	EReference getDiffProject_platform_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffProject_domainspecificdiffs <em>Diff Project domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Project domainspecificdiffs</em>'.
	 * @see arduinoDiffMM.DiffProject_domainspecificdiffs
	 * @generated
	 */
	EClass getDiffProject_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffProject_domainspecificdiffs#getOperation()
	 * @see #getDiffProject_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getDiffProject_domainspecificdiffs_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffProject_domainspecificdiffs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffProject_domainspecificdiffs#getEType()
	 * @see #getDiffProject_domainspecificdiffs()
	 * @generated
	 */
	EReference getDiffProject_domainspecificdiffs_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffInstruction_previous <em>Diff Instruction previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Instruction previous</em>'.
	 * @see arduinoDiffMM.DiffInstruction_previous
	 * @generated
	 */
	EClass getDiffInstruction_previous();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInstruction_previous#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffInstruction_previous#getOperation()
	 * @see #getDiffInstruction_previous()
	 * @generated
	 */
	EAttribute getDiffInstruction_previous_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffInstruction_previous#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffInstruction_previous#getEType()
	 * @see #getDiffInstruction_previous()
	 * @generated
	 */
	EReference getDiffInstruction_previous_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffInstruction_next <em>Diff Instruction next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Instruction next</em>'.
	 * @see arduinoDiffMM.DiffInstruction_next
	 * @generated
	 */
	EClass getDiffInstruction_next();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInstruction_next#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffInstruction_next#getOperation()
	 * @see #getDiffInstruction_next()
	 * @generated
	 */
	EAttribute getDiffInstruction_next_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffInstruction_next#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffInstruction_next#getEType()
	 * @see #getDiffInstruction_next()
	 * @generated
	 */
	EReference getDiffInstruction_next_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffStatus <em>Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Status</em>'.
	 * @see arduinoDiffMM.DiffStatus
	 * @generated
	 */
	EClass getDiffStatus();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffStatus#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffStatus#getOperation()
	 * @see #getDiffStatus()
	 * @generated
	 */
	EAttribute getDiffStatus_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffStatus#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffStatus#getNew_value()
	 * @see #getDiffStatus()
	 * @generated
	 */
	EAttribute getDiffStatus_New_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffStatus#isNew_status <em>New status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New status</em>'.
	 * @see arduinoDiffMM.DiffStatus#isNew_status()
	 * @see #getDiffStatus()
	 * @generated
	 */
	EAttribute getDiffStatus_New_status();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffStatus_sensor <em>Diff Status sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Status sensor</em>'.
	 * @see arduinoDiffMM.DiffStatus_sensor
	 * @generated
	 */
	EClass getDiffStatus_sensor();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffStatus_sensor#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffStatus_sensor#getOperation()
	 * @see #getDiffStatus_sensor()
	 * @generated
	 */
	EAttribute getDiffStatus_sensor_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffStatus_sensor#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffStatus_sensor#getEType()
	 * @see #getDiffStatus_sensor()
	 * @generated
	 */
	EReference getDiffStatus_sensor_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffLevel <em>Diff Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Level</em>'.
	 * @see arduinoDiffMM.DiffLevel
	 * @generated
	 */
	EClass getDiffLevel();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffLevel#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffLevel#getOperation()
	 * @see #getDiffLevel()
	 * @generated
	 */
	EAttribute getDiffLevel_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffLevel_level <em>Diff Level level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Level level</em>'.
	 * @see arduinoDiffMM.DiffLevel_level
	 * @generated
	 */
	EClass getDiffLevel_level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffLevel_level#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffLevel_level#getOperation()
	 * @see #getDiffLevel_level()
	 * @generated
	 */
	EAttribute getDiffLevel_level_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffLevel_level#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffLevel_level#getEType()
	 * @see #getDiffLevel_level()
	 * @generated
	 */
	EReference getDiffLevel_level_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffModuleInstruction_module <em>Diff Module Instruction module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Module Instruction module</em>'.
	 * @see arduinoDiffMM.DiffModuleInstruction_module
	 * @generated
	 */
	EClass getDiffModuleInstruction_module();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffModuleInstruction_module#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffModuleInstruction_module#getOperation()
	 * @see #getDiffModuleInstruction_module()
	 * @generated
	 */
	EAttribute getDiffModuleInstruction_module_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffModuleInstruction_module#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffModuleInstruction_module#getEType()
	 * @see #getDiffModuleInstruction_module()
	 * @generated
	 */
	EReference getDiffModuleInstruction_module_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffControl_instructions <em>Diff Control instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Control instructions</em>'.
	 * @see arduinoDiffMM.DiffControl_instructions
	 * @generated
	 */
	EClass getDiffControl_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffControl_instructions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffControl_instructions#getOperation()
	 * @see #getDiffControl_instructions()
	 * @generated
	 */
	EAttribute getDiffControl_instructions_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffControl_instructions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffControl_instructions#getEType()
	 * @see #getDiffControl_instructions()
	 * @generated
	 */
	EReference getDiffControl_instructions_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffDelay <em>Diff Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Delay</em>'.
	 * @see arduinoDiffMM.DiffDelay
	 * @generated
	 */
	EClass getDiffDelay();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffDelay#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffDelay#getOperation()
	 * @see #getDiffDelay()
	 * @generated
	 */
	EAttribute getDiffDelay_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffDelay#getNew_unit <em>New unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New unit</em>'.
	 * @see arduinoDiffMM.DiffDelay#getNew_unit()
	 * @see #getDiffDelay()
	 * @generated
	 */
	EAttribute getDiffDelay_New_unit();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffDelay#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffDelay#getNew_value()
	 * @see #getDiffDelay()
	 * @generated
	 */
	EAttribute getDiffDelay_New_value();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffInputModule <em>Diff Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Input Module</em>'.
	 * @see arduinoDiffMM.DiffInputModule
	 * @generated
	 */
	EClass getDiffInputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffInputModule#getOperation()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffInputModule#getNew_name()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_New_name();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#getNew_kind <em>New kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New kind</em>'.
	 * @see arduinoDiffMM.DiffInputModule#getNew_kind()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_New_kind();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#getNew_image <em>New image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New image</em>'.
	 * @see arduinoDiffMM.DiffInputModule#getNew_image()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_New_image();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#isNew_level <em>New level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New level</em>'.
	 * @see arduinoDiffMM.DiffInputModule#isNew_level()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_New_level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffInputModule#getNew_library <em>New library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New library</em>'.
	 * @see arduinoDiffMM.DiffInputModule#getNew_library()
	 * @see #getDiffInputModule()
	 * @generated
	 */
	EAttribute getDiffInputModule_New_library();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffOutputModule <em>Diff Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Output Module</em>'.
	 * @see arduinoDiffMM.DiffOutputModule
	 * @generated
	 */
	EClass getDiffOutputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#getOperation()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#getNew_name()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_New_name();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#getNew_kind <em>New kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New kind</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#getNew_kind()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_New_kind();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#getNew_image <em>New image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New image</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#getNew_image()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_New_image();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#isNew_level <em>New level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New level</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#isNew_level()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_New_level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffOutputModule#getNew_library <em>New library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New library</em>'.
	 * @see arduinoDiffMM.DiffOutputModule#getNew_library()
	 * @see #getDiffOutputModule()
	 * @generated
	 */
	EAttribute getDiffOutputModule_New_library();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffConnector <em>Diff Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Connector</em>'.
	 * @see arduinoDiffMM.DiffConnector
	 * @generated
	 */
	EClass getDiffConnector();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffConnector#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffConnector#getOperation()
	 * @see #getDiffConnector()
	 * @generated
	 */
	EAttribute getDiffConnector_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffConnector_pin <em>Diff Connector pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Connector pin</em>'.
	 * @see arduinoDiffMM.DiffConnector_pin
	 * @generated
	 */
	EClass getDiffConnector_pin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffConnector_pin#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffConnector_pin#getOperation()
	 * @see #getDiffConnector_pin()
	 * @generated
	 */
	EAttribute getDiffConnector_pin_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffConnector_pin#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffConnector_pin#getEType()
	 * @see #getDiffConnector_pin()
	 * @generated
	 */
	EReference getDiffConnector_pin_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffConnector_module <em>Diff Connector module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Connector module</em>'.
	 * @see arduinoDiffMM.DiffConnector_module
	 * @generated
	 */
	EClass getDiffConnector_module();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffConnector_module#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffConnector_module#getOperation()
	 * @see #getDiffConnector_module()
	 * @generated
	 */
	EAttribute getDiffConnector_module_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffConnector_module#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffConnector_module#getEType()
	 * @see #getDiffConnector_module()
	 * @generated
	 */
	EReference getDiffConnector_module_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffRepeat <em>Diff Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Repeat</em>'.
	 * @see arduinoDiffMM.DiffRepeat
	 * @generated
	 */
	EClass getDiffRepeat();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffRepeat#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffRepeat#getOperation()
	 * @see #getDiffRepeat()
	 * @generated
	 */
	EAttribute getDiffRepeat_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffRepeat#getNew_iteration <em>New iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New iteration</em>'.
	 * @see arduinoDiffMM.DiffRepeat#getNew_iteration()
	 * @see #getDiffRepeat()
	 * @generated
	 */
	EAttribute getDiffRepeat_New_iteration();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSensor <em>Diff Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sensor</em>'.
	 * @see arduinoDiffMM.DiffSensor
	 * @generated
	 */
	EClass getDiffSensor();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSensor#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSensor#getOperation()
	 * @see #getDiffSensor()
	 * @generated
	 */
	EAttribute getDiffSensor_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSensor#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffSensor#getNew_value()
	 * @see #getDiffSensor()
	 * @generated
	 */
	EAttribute getDiffSensor_New_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSensor#getNew_operator <em>New operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New operator</em>'.
	 * @see arduinoDiffMM.DiffSensor#getNew_operator()
	 * @see #getDiffSensor()
	 * @generated
	 */
	EAttribute getDiffSensor_New_operator();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSensor_status <em>Diff Sensor status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Sensor status</em>'.
	 * @see arduinoDiffMM.DiffSensor_status
	 * @generated
	 */
	EClass getDiffSensor_status();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSensor_status#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSensor_status#getOperation()
	 * @see #getDiffSensor_status()
	 * @generated
	 */
	EAttribute getDiffSensor_status_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSensor_status#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSensor_status#getEType()
	 * @see #getDiffSensor_status()
	 * @generated
	 */
	EReference getDiffSensor_status_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffWhile <em>Diff While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff While</em>'.
	 * @see arduinoDiffMM.DiffWhile
	 * @generated
	 */
	EClass getDiffWhile();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffWhile#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffWhile#getOperation()
	 * @see #getDiffWhile()
	 * @generated
	 */
	EAttribute getDiffWhile_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffWhile_condition <em>Diff While condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff While condition</em>'.
	 * @see arduinoDiffMM.DiffWhile_condition
	 * @generated
	 */
	EClass getDiffWhile_condition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffWhile_condition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffWhile_condition#getOperation()
	 * @see #getDiffWhile_condition()
	 * @generated
	 */
	EAttribute getDiffWhile_condition_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffWhile_condition#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffWhile_condition#getEType()
	 * @see #getDiffWhile_condition()
	 * @generated
	 */
	EReference getDiffWhile_condition_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffMathOperator_left <em>Diff Math Operator left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Math Operator left</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_left
	 * @generated
	 */
	EClass getDiffMathOperator_left();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffMathOperator_left#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_left#getOperation()
	 * @see #getDiffMathOperator_left()
	 * @generated
	 */
	EAttribute getDiffMathOperator_left_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffMathOperator_left#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_left#getEType()
	 * @see #getDiffMathOperator_left()
	 * @generated
	 */
	EReference getDiffMathOperator_left_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffMathOperator_right <em>Diff Math Operator right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Math Operator right</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_right
	 * @generated
	 */
	EClass getDiffMathOperator_right();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffMathOperator_right#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_right#getOperation()
	 * @see #getDiffMathOperator_right()
	 * @generated
	 */
	EAttribute getDiffMathOperator_right_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffMathOperator_right#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffMathOperator_right#getEType()
	 * @see #getDiffMathOperator_right()
	 * @generated
	 */
	EReference getDiffMathOperator_right_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffVariable <em>Diff Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Variable</em>'.
	 * @see arduinoDiffMM.DiffVariable
	 * @generated
	 */
	EClass getDiffVariable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffVariable#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffVariable#getOperation()
	 * @see #getDiffVariable()
	 * @generated
	 */
	EAttribute getDiffVariable_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffVariable#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffVariable#getNew_value()
	 * @see #getDiffVariable()
	 * @generated
	 */
	EAttribute getDiffVariable_New_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffVariable#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffVariable#getNew_name()
	 * @see #getDiffVariable()
	 * @generated
	 */
	EAttribute getDiffVariable_New_name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSet <em>Diff Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Set</em>'.
	 * @see arduinoDiffMM.DiffSet
	 * @generated
	 */
	EClass getDiffSet();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSet#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSet#getOperation()
	 * @see #getDiffSet()
	 * @generated
	 */
	EAttribute getDiffSet_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSet_variable <em>Diff Set variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Set variable</em>'.
	 * @see arduinoDiffMM.DiffSet_variable
	 * @generated
	 */
	EClass getDiffSet_variable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSet_variable#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSet_variable#getOperation()
	 * @see #getDiffSet_variable()
	 * @generated
	 */
	EAttribute getDiffSet_variable_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSet_variable#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSet_variable#getEType()
	 * @see #getDiffSet_variable()
	 * @generated
	 */
	EReference getDiffSet_variable_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffSet_value <em>Diff Set value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Set value</em>'.
	 * @see arduinoDiffMM.DiffSet_value
	 * @generated
	 */
	EClass getDiffSet_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffSet_value#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffSet_value#getOperation()
	 * @see #getDiffSet_value()
	 * @generated
	 */
	EAttribute getDiffSet_value_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffSet_value#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffSet_value#getEType()
	 * @see #getDiffSet_value()
	 * @generated
	 */
	EReference getDiffSet_value_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffNumericalOperator <em>Diff Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Numerical Operator</em>'.
	 * @see arduinoDiffMM.DiffNumericalOperator
	 * @generated
	 */
	EClass getDiffNumericalOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffNumericalOperator#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffNumericalOperator#getOperation()
	 * @see #getDiffNumericalOperator()
	 * @generated
	 */
	EAttribute getDiffNumericalOperator_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffNumericalOperator#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffNumericalOperator#getNew_value()
	 * @see #getDiffNumericalOperator()
	 * @generated
	 */
	EAttribute getDiffNumericalOperator_New_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffNumericalOperator#getNew_operator <em>New operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New operator</em>'.
	 * @see arduinoDiffMM.DiffNumericalOperator#getNew_operator()
	 * @see #getDiffNumericalOperator()
	 * @generated
	 */
	EAttribute getDiffNumericalOperator_New_operator();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffBooleanOperator <em>Diff Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Boolean Operator</em>'.
	 * @see arduinoDiffMM.DiffBooleanOperator
	 * @generated
	 */
	EClass getDiffBooleanOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffBooleanOperator#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffBooleanOperator#getOperation()
	 * @see #getDiffBooleanOperator()
	 * @generated
	 */
	EAttribute getDiffBooleanOperator_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffBooleanOperator#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffBooleanOperator#getNew_value()
	 * @see #getDiffBooleanOperator()
	 * @generated
	 */
	EAttribute getDiffBooleanOperator_New_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffBooleanOperator#getNew_operator <em>New operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New operator</em>'.
	 * @see arduinoDiffMM.DiffBooleanOperator#getNew_operator()
	 * @see #getDiffBooleanOperator()
	 * @generated
	 */
	EAttribute getDiffBooleanOperator_New_operator();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffConstant <em>Diff Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Constant</em>'.
	 * @see arduinoDiffMM.DiffConstant
	 * @generated
	 */
	EClass getDiffConstant();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffConstant#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffConstant#getOperation()
	 * @see #getDiffConstant()
	 * @generated
	 */
	EAttribute getDiffConstant_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffConstant#getNew_value <em>New value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New value</em>'.
	 * @see arduinoDiffMM.DiffConstant#getNew_value()
	 * @see #getDiffConstant()
	 * @generated
	 */
	EAttribute getDiffConstant_New_value();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffIf <em>Diff If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff If</em>'.
	 * @see arduinoDiffMM.DiffIf
	 * @generated
	 */
	EClass getDiffIf();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffIf#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffIf#getOperation()
	 * @see #getDiffIf()
	 * @generated
	 */
	EAttribute getDiffIf_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffIf_condition <em>Diff If condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff If condition</em>'.
	 * @see arduinoDiffMM.DiffIf_condition
	 * @generated
	 */
	EClass getDiffIf_condition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffIf_condition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffIf_condition#getOperation()
	 * @see #getDiffIf_condition()
	 * @generated
	 */
	EAttribute getDiffIf_condition_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffIf_condition#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffIf_condition#getEType()
	 * @see #getDiffIf_condition()
	 * @generated
	 */
	EReference getDiffIf_condition_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunction <em>Diff Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function</em>'.
	 * @see arduinoDiffMM.DiffFunction
	 * @generated
	 */
	EClass getDiffFunction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunction#getOperation()
	 * @see #getDiffFunction()
	 * @generated
	 */
	EAttribute getDiffFunction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunction#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffFunction#getNew_name()
	 * @see #getDiffFunction()
	 * @generated
	 */
	EAttribute getDiffFunction_New_name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunction_paramDefs <em>Diff Function param Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function param Defs</em>'.
	 * @see arduinoDiffMM.DiffFunction_paramDefs
	 * @generated
	 */
	EClass getDiffFunction_paramDefs();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunction_paramDefs#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunction_paramDefs#getOperation()
	 * @see #getDiffFunction_paramDefs()
	 * @generated
	 */
	EAttribute getDiffFunction_paramDefs_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffFunction_paramDefs#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffFunction_paramDefs#getEType()
	 * @see #getDiffFunction_paramDefs()
	 * @generated
	 */
	EReference getDiffFunction_paramDefs_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunction_instructions <em>Diff Function instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function instructions</em>'.
	 * @see arduinoDiffMM.DiffFunction_instructions
	 * @generated
	 */
	EClass getDiffFunction_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunction_instructions#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunction_instructions#getOperation()
	 * @see #getDiffFunction_instructions()
	 * @generated
	 */
	EAttribute getDiffFunction_instructions_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffFunction_instructions#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffFunction_instructions#getEType()
	 * @see #getDiffFunction_instructions()
	 * @generated
	 */
	EReference getDiffFunction_instructions_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffParameterDefinition <em>Diff Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Parameter Definition</em>'.
	 * @see arduinoDiffMM.DiffParameterDefinition
	 * @generated
	 */
	EClass getDiffParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameterDefinition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffParameterDefinition#getOperation()
	 * @see #getDiffParameterDefinition()
	 * @generated
	 */
	EAttribute getDiffParameterDefinition_Operation();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameterDefinition#getNew_type <em>New type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New type</em>'.
	 * @see arduinoDiffMM.DiffParameterDefinition#getNew_type()
	 * @see #getDiffParameterDefinition()
	 * @generated
	 */
	EAttribute getDiffParameterDefinition_New_type();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameterDefinition#getNew_name <em>New name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New name</em>'.
	 * @see arduinoDiffMM.DiffParameterDefinition#getNew_name()
	 * @see #getDiffParameterDefinition()
	 * @generated
	 */
	EAttribute getDiffParameterDefinition_New_name();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffParameter_to_definition <em>Diff Parameter to definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Parameter to definition</em>'.
	 * @see arduinoDiffMM.DiffParameter_to_definition
	 * @generated
	 */
	EClass getDiffParameter_to_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameter_to_definition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffParameter_to_definition#getOperation()
	 * @see #getDiffParameter_to_definition()
	 * @generated
	 */
	EAttribute getDiffParameter_to_definition_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffParameter_to_definition#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffParameter_to_definition#getEType()
	 * @see #getDiffParameter_to_definition()
	 * @generated
	 */
	EReference getDiffParameter_to_definition_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunctionCall <em>Diff Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function Call</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall
	 * @generated
	 */
	EClass getDiffFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunctionCall#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall#getOperation()
	 * @see #getDiffFunctionCall()
	 * @generated
	 */
	EAttribute getDiffFunctionCall_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunctionCall_definition <em>Diff Function Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function Call definition</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_definition
	 * @generated
	 */
	EClass getDiffFunctionCall_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunctionCall_definition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_definition#getOperation()
	 * @see #getDiffFunctionCall_definition()
	 * @generated
	 */
	EAttribute getDiffFunctionCall_definition_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffFunctionCall_definition#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_definition#getEType()
	 * @see #getDiffFunctionCall_definition()
	 * @generated
	 */
	EReference getDiffFunctionCall_definition_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffFunctionCall_parameters <em>Diff Function Call parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Function Call parameters</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_parameters
	 * @generated
	 */
	EClass getDiffFunctionCall_parameters();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffFunctionCall_parameters#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_parameters#getOperation()
	 * @see #getDiffFunctionCall_parameters()
	 * @generated
	 */
	EAttribute getDiffFunctionCall_parameters_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffFunctionCall_parameters#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffFunctionCall_parameters#getEType()
	 * @see #getDiffFunctionCall_parameters()
	 * @generated
	 */
	EReference getDiffFunctionCall_parameters_EType();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffParameterCall <em>Diff Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Parameter Call</em>'.
	 * @see arduinoDiffMM.DiffParameterCall
	 * @generated
	 */
	EClass getDiffParameterCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameterCall#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffParameterCall#getOperation()
	 * @see #getDiffParameterCall()
	 * @generated
	 */
	EAttribute getDiffParameterCall_Operation();

	/**
	 * Returns the meta object for class '{@link arduinoDiffMM.DiffParameterCall_definition <em>Diff Parameter Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Parameter Call definition</em>'.
	 * @see arduinoDiffMM.DiffParameterCall_definition
	 * @generated
	 */
	EClass getDiffParameterCall_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoDiffMM.DiffParameterCall_definition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see arduinoDiffMM.DiffParameterCall_definition#getOperation()
	 * @see #getDiffParameterCall_definition()
	 * @generated
	 */
	EAttribute getDiffParameterCall_definition_Operation();

	/**
	 * Returns the meta object for the reference '{@link arduinoDiffMM.DiffParameterCall_definition#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see arduinoDiffMM.DiffParameterCall_definition#getEType()
	 * @see #getDiffParameterCall_definition()
	 * @generated
	 */
	EReference getDiffParameterCall_definition_EType();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time</em>'.
	 * @see arduinoDiffMM.Time
	 * @generated
	 */
	EEnum getTime();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.ModuleKind <em>Module Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Kind</em>'.
	 * @see arduinoDiffMM.ModuleKind
	 * @generated
	 */
	EEnum getModuleKind();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.OperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see arduinoDiffMM.OperatorKind
	 * @generated
	 */
	EEnum getOperatorKind();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library</em>'.
	 * @see arduinoDiffMM.Library
	 * @generated
	 */
	EEnum getLibrary();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see arduinoDiffMM.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.ClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Op</em>'.
	 * @see arduinoDiffMM.ClassOp
	 * @generated
	 */
	EEnum getClassOp();

	/**
	 * Returns the meta object for enum '{@link arduinoDiffMM.AscOp <em>Asc Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asc Op</em>'.
	 * @see arduinoDiffMM.AscOp
	 * @generated
	 */
	EEnum getAscOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoDiffMMFactory getArduinoDiffMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.HardwareImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__PLATFORMS = eINSTANCE.getHardware_Platforms();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__MODULES = eINSTANCE.getHardware_Modules();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__CONNECTORS = eINSTANCE.getHardware_Connectors();

		/**
		 * The meta object literal for the '<em><b>Diffplatforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__DIFFPLATFORMS = eINSTANCE.getHardware_Diffplatforms();

		/**
		 * The meta object literal for the '<em><b>Diffmodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__DIFFMODULES = eINSTANCE.getHardware_Diffmodules();

		/**
		 * The meta object literal for the '<em><b>Diffconnectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__DIFFCONNECTORS = eINSTANCE.getHardware_Diffconnectors();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.PlatformImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__DIGITAL_PINS = eINSTANCE.getPlatform_DigitalPins();

		/**
		 * The meta object literal for the '<em><b>Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__ANALOG_PINS = eINSTANCE.getPlatform_AnalogPins();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__IMAGE = eINSTANCE.getPlatform_Image();

		/**
		 * The meta object literal for the '<em><b>Diffdigital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__DIFFDIGITAL_PINS = eINSTANCE.getPlatform_DiffdigitalPins();

		/**
		 * The meta object literal for the '<em><b>Diffanalog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__DIFFANALOG_PINS = eINSTANCE.getPlatform_DiffanalogPins();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ModuleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__KIND = eINSTANCE.getModule_Kind();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IMAGE = eINSTANCE.getModule_Image();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LEVEL = eINSTANCE.getModule_Level();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LIBRARY = eINSTANCE.getModule_Library();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DigitalPinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDigitalPin()
		 * @generated
		 */
		EClass DIGITAL_PIN = eINSTANCE.getDigitalPin();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.PinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__ID = eINSTANCE.getPin_Id();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.AnalogPinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getAnalogPin()
		 * @generated
		 */
		EClass ANALOG_PIN = eINSTANCE.getAnalogPin();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.SketchImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__HARDWARE = eINSTANCE.getSketch_Hardware();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__INSTRUCTIONS = eINSTANCE.getSketch_Instructions();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__FUNCTIONS = eINSTANCE.getSketch_Functions();

		/**
		 * The meta object literal for the '<em><b>Diffhardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__DIFFHARDWARE = eINSTANCE.getSketch_Diffhardware();

		/**
		 * The meta object literal for the '<em><b>Diffinstructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__DIFFINSTRUCTIONS = eINSTANCE.getSketch_Diffinstructions();

		/**
		 * The meta object literal for the '<em><b>Difffunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__DIFFFUNCTIONS = eINSTANCE.getSketch_Difffunctions();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ProjectImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__HARDWARE = eINSTANCE.getProject_Hardware();

		/**
		 * The meta object literal for the '<em><b>Sketch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SKETCH = eINSTANCE.getProject_Sketch();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MODULES = eINSTANCE.getProject_Modules();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PLATFORM = eINSTANCE.getProject_Platform();

		/**
		 * The meta object literal for the '<em><b>Domainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DOMAINSPECIFICDIFFS = eINSTANCE.getProject_Domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Diffhardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIFFHARDWARE = eINSTANCE.getProject_Diffhardware();

		/**
		 * The meta object literal for the '<em><b>Diffsketch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIFFSKETCH = eINSTANCE.getProject_Diffsketch();

		/**
		 * The meta object literal for the '<em><b>Diffmodules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIFFMODULES = eINSTANCE.getProject_Diffmodules();

		/**
		 * The meta object literal for the '<em><b>Diffplatform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIFFPLATFORM = eINSTANCE.getProject_Diffplatform();

		/**
		 * The meta object literal for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DIFFDOMAINSPECIFICDIFFS = eINSTANCE.getProject_Diffdomainspecificdiffs();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.InstructionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PREVIOUS = eINSTANCE.getInstruction_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__NEXT = eINSTANCE.getInstruction_Next();

		/**
		 * The meta object literal for the '<em><b>Diffprevious</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__DIFFPREVIOUS = eINSTANCE.getInstruction_Diffprevious();

		/**
		 * The meta object literal for the '<em><b>Diffnext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__DIFFNEXT = eINSTANCE.getInstruction_Diffnext();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.StatusImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__STATUS = eINSTANCE.getStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS__SENSOR = eINSTANCE.getStatus_Sensor();

		/**
		 * The meta object literal for the '<em><b>Diffsensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS__DIFFSENSOR = eINSTANCE.getStatus_Diffsensor();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.LevelImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__LEVEL = eINSTANCE.getLevel_Level();

		/**
		 * The meta object literal for the '<em><b>Difflevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__DIFFLEVEL = eINSTANCE.getLevel_Difflevel();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ModuleInstructionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModuleInstruction()
		 * @generated
		 */
		EClass MODULE_INSTRUCTION = eINSTANCE.getModuleInstruction();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTRUCTION__MODULE = eINSTANCE.getModuleInstruction_Module();

		/**
		 * The meta object literal for the '<em><b>Diffmodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTRUCTION__DIFFMODULE = eINSTANCE.getModuleInstruction_Diffmodule();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ControlImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__INSTRUCTIONS = eINSTANCE.getControl_Instructions();

		/**
		 * The meta object literal for the '<em><b>Diffinstructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__DIFFINSTRUCTIONS = eINSTANCE.getControl_Diffinstructions();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.UtilitiesImpl <em>Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.UtilitiesImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getUtilities()
		 * @generated
		 */
		EClass UTILITIES = eINSTANCE.getUtilities();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.IOImpl <em>IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.IOImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getIO()
		 * @generated
		 */
		EClass IO = eINSTANCE.getIO();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DelayImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__UNIT = eINSTANCE.getDelay_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__VALUE = eINSTANCE.getDelay_Value();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.InputModuleImpl <em>Input Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.InputModuleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getInputModule()
		 * @generated
		 */
		EClass INPUT_MODULE = eINSTANCE.getInputModule();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.OutputModuleImpl <em>Output Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.OutputModuleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getOutputModule()
		 * @generated
		 */
		EClass OUTPUT_MODULE = eINSTANCE.getOutputModule();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.NamedElementImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ConnectorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PIN = eINSTANCE.getConnector_Pin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__MODULE = eINSTANCE.getConnector_Module();

		/**
		 * The meta object literal for the '<em><b>Diffpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DIFFPIN = eINSTANCE.getConnector_Diffpin();

		/**
		 * The meta object literal for the '<em><b>Diffmodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DIFFMODULE = eINSTANCE.getConnector_Diffmodule();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.RepeatImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__ITERATION = eINSTANCE.getRepeat_Iteration();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.SensorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__STATUS = eINSTANCE.getSensor_Status();

		/**
		 * The meta object literal for the '<em><b>Diffstatus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__DIFFSTATUS = eINSTANCE.getSensor_Diffstatus();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.WhileImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '<em><b>Diffcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__DIFFCONDITION = eINSTANCE.getWhile_Diffcondition();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.MathOperatorImpl <em>Math Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.MathOperatorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getMathOperator()
		 * @generated
		 */
		EClass MATH_OPERATOR = eINSTANCE.getMathOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATOR__LEFT = eINSTANCE.getMathOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATOR__RIGHT = eINSTANCE.getMathOperator_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATH_OPERATOR__OPERATOR = eINSTANCE.getMathOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Diffleft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATOR__DIFFLEFT = eINSTANCE.getMathOperator_Diffleft();

		/**
		 * The meta object literal for the '<em><b>Diffright</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATOR__DIFFRIGHT = eINSTANCE.getMathOperator_Diffright();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.VariableImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.SetImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__VARIABLE = eINSTANCE.getSet_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__VALUE = eINSTANCE.getSet_Value();

		/**
		 * The meta object literal for the '<em><b>Diffvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__DIFFVARIABLE = eINSTANCE.getSet_Diffvariable();

		/**
		 * The meta object literal for the '<em><b>Diffvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__DIFFVALUE = eINSTANCE.getSet_Diffvalue();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.NumericalOperatorImpl <em>Numerical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.NumericalOperatorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getNumericalOperator()
		 * @generated
		 */
		EClass NUMERICAL_OPERATOR = eINSTANCE.getNumericalOperator();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.BooleanOperatorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ValueImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ConstantImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.IfImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Diffcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__DIFFCONDITION = eINSTANCE.getIf_Diffcondition();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.FunctionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Param Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAM_DEFS = eINSTANCE.getFunction_ParamDefs();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INSTRUCTIONS = eINSTANCE.getFunction_Instructions();

		/**
		 * The meta object literal for the '<em><b>Diffparam Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DIFFPARAM_DEFS = eINSTANCE.getFunction_DiffparamDefs();

		/**
		 * The meta object literal for the '<em><b>Diffinstructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DIFFINSTRUCTIONS = eINSTANCE.getFunction_Diffinstructions();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ParameterDefinitionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION__TYPE = eINSTANCE.getParameterDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ParameterImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFINITION = eINSTANCE.getParameter_Definition();

		/**
		 * The meta object literal for the '<em><b>Diffdefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DIFFDEFINITION = eINSTANCE.getParameter_Diffdefinition();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.FunctionCallImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__DEFINITION = eINSTANCE.getFunctionCall_Definition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Diffdefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__DIFFDEFINITION = eINSTANCE.getFunctionCall_Diffdefinition();

		/**
		 * The meta object literal for the '<em><b>Diffparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__DIFFPARAMETERS = eINSTANCE.getFunctionCall_Diffparameters();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.ParameterCallImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterCall()
		 * @generated
		 */
		EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__DEFINITION = eINSTANCE.getParameterCall_Definition();

		/**
		 * The meta object literal for the '<em><b>Diffdefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__DIFFDEFINITION = eINSTANCE.getParameterCall_Diffdefinition();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DomainSpecificDiffImpl <em>Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DomainSpecificDiffImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDomainSpecificDiff()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_DIFF = eINSTANCE.getDomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_DIFF__NAME = eINSTANCE.getDomainSpecificDiff_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Hardware</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Hardware();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Platform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Platform();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Module();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Digital Pin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_DigitalPin();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Pin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Pin();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Analog Pin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_AnalogPin();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Sketch</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Sketch();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Instruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Instruction();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Status</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Status();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Level();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Module Instruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_ModuleInstruction();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Control();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Utilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Utilities();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff IO</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_IO();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Delay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Delay();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Input Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_InputModule();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Output Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_OutputModule();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Named Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Connector();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Repeat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Repeat();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Sensor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Sensor();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff While</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_While();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Math Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_MathOperator();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Variable();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Set();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Numerical Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_NumericalOperator();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Boolean Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_BooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Value();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Constant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Constant();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff If</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_If();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Function();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Parameter Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_ParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_Parameter();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Function Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_FunctionCall();

		/**
		 * The meta object literal for the '<em><b>Domain Specific Diff Parameter Call</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL = eINSTANCE.getDomainSpecificDiff_DomainSpecificDiff_ParameterCall();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffHardwareImpl <em>Diff Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffHardwareImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware()
		 * @generated
		 */
		EClass DIFF_HARDWARE = eINSTANCE.getDiffHardware();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_HARDWARE__OPERATION = eINSTANCE.getDiffHardware_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_HARDWARE__NEW_NAME = eINSTANCE.getDiffHardware_New_name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffHardware_platformsImpl <em>Diff Hardware platforms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffHardware_platformsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_platforms()
		 * @generated
		 */
		EClass DIFF_HARDWARE_PLATFORMS = eINSTANCE.getDiffHardware_platforms();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_HARDWARE_PLATFORMS__OPERATION = eINSTANCE.getDiffHardware_platforms_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_HARDWARE_PLATFORMS__ETYPE = eINSTANCE.getDiffHardware_platforms_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffHardware_modulesImpl <em>Diff Hardware modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffHardware_modulesImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_modules()
		 * @generated
		 */
		EClass DIFF_HARDWARE_MODULES = eINSTANCE.getDiffHardware_modules();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_HARDWARE_MODULES__OPERATION = eINSTANCE.getDiffHardware_modules_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_HARDWARE_MODULES__ETYPE = eINSTANCE.getDiffHardware_modules_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffHardware_connectorsImpl <em>Diff Hardware connectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffHardware_connectorsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffHardware_connectors()
		 * @generated
		 */
		EClass DIFF_HARDWARE_CONNECTORS = eINSTANCE.getDiffHardware_connectors();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_HARDWARE_CONNECTORS__OPERATION = eINSTANCE.getDiffHardware_connectors_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_HARDWARE_CONNECTORS__ETYPE = eINSTANCE.getDiffHardware_connectors_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffPlatformImpl <em>Diff Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffPlatformImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform()
		 * @generated
		 */
		EClass DIFF_PLATFORM = eINSTANCE.getDiffPlatform();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLATFORM__OPERATION = eINSTANCE.getDiffPlatform_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLATFORM__NEW_NAME = eINSTANCE.getDiffPlatform_New_name();

		/**
		 * The meta object literal for the '<em><b>New image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLATFORM__NEW_IMAGE = eINSTANCE.getDiffPlatform_New_image();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffPlatform_digitalPinsImpl <em>Diff Platform digital Pins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffPlatform_digitalPinsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform_digitalPins()
		 * @generated
		 */
		EClass DIFF_PLATFORM_DIGITAL_PINS = eINSTANCE.getDiffPlatform_digitalPins();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLATFORM_DIGITAL_PINS__OPERATION = eINSTANCE.getDiffPlatform_digitalPins_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PLATFORM_DIGITAL_PINS__ETYPE = eINSTANCE.getDiffPlatform_digitalPins_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffPlatform_analogPinsImpl <em>Diff Platform analog Pins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffPlatform_analogPinsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffPlatform_analogPins()
		 * @generated
		 */
		EClass DIFF_PLATFORM_ANALOG_PINS = eINSTANCE.getDiffPlatform_analogPins();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PLATFORM_ANALOG_PINS__OPERATION = eINSTANCE.getDiffPlatform_analogPins_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PLATFORM_ANALOG_PINS__ETYPE = eINSTANCE.getDiffPlatform_analogPins_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffDigitalPinImpl <em>Diff Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffDigitalPinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffDigitalPin()
		 * @generated
		 */
		EClass DIFF_DIGITAL_PIN = eINSTANCE.getDiffDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DIGITAL_PIN__OPERATION = eINSTANCE.getDiffDigitalPin_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DIGITAL_PIN__NEW_ID = eINSTANCE.getDiffDigitalPin_New_id();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffAnalogPinImpl <em>Diff Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffAnalogPinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffAnalogPin()
		 * @generated
		 */
		EClass DIFF_ANALOG_PIN = eINSTANCE.getDiffAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ANALOG_PIN__OPERATION = eINSTANCE.getDiffAnalogPin_Operation();

		/**
		 * The meta object literal for the '<em><b>New id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ANALOG_PIN__NEW_ID = eINSTANCE.getDiffAnalogPin_New_id();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSketchImpl <em>Diff Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSketchImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch()
		 * @generated
		 */
		EClass DIFF_SKETCH = eINSTANCE.getDiffSketch();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SKETCH__OPERATION = eINSTANCE.getDiffSketch_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SKETCH__NEW_NAME = eINSTANCE.getDiffSketch_New_name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSketch_hardwareImpl <em>Diff Sketch hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSketch_hardwareImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_hardware()
		 * @generated
		 */
		EClass DIFF_SKETCH_HARDWARE = eINSTANCE.getDiffSketch_hardware();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SKETCH_HARDWARE__OPERATION = eINSTANCE.getDiffSketch_hardware_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SKETCH_HARDWARE__ETYPE = eINSTANCE.getDiffSketch_hardware_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSketch_instructionsImpl <em>Diff Sketch instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSketch_instructionsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_instructions()
		 * @generated
		 */
		EClass DIFF_SKETCH_INSTRUCTIONS = eINSTANCE.getDiffSketch_instructions();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SKETCH_INSTRUCTIONS__OPERATION = eINSTANCE.getDiffSketch_instructions_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SKETCH_INSTRUCTIONS__ETYPE = eINSTANCE.getDiffSketch_instructions_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSketch_functionsImpl <em>Diff Sketch functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSketch_functionsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSketch_functions()
		 * @generated
		 */
		EClass DIFF_SKETCH_FUNCTIONS = eINSTANCE.getDiffSketch_functions();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SKETCH_FUNCTIONS__OPERATION = eINSTANCE.getDiffSketch_functions_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SKETCH_FUNCTIONS__ETYPE = eINSTANCE.getDiffSketch_functions_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProjectImpl <em>Diff Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProjectImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject()
		 * @generated
		 */
		EClass DIFF_PROJECT = eINSTANCE.getDiffProject();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT__OPERATION = eINSTANCE.getDiffProject_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProject_hardwareImpl <em>Diff Project hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProject_hardwareImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_hardware()
		 * @generated
		 */
		EClass DIFF_PROJECT_HARDWARE = eINSTANCE.getDiffProject_hardware();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT_HARDWARE__OPERATION = eINSTANCE.getDiffProject_hardware_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PROJECT_HARDWARE__ETYPE = eINSTANCE.getDiffProject_hardware_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProject_sketchImpl <em>Diff Project sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProject_sketchImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_sketch()
		 * @generated
		 */
		EClass DIFF_PROJECT_SKETCH = eINSTANCE.getDiffProject_sketch();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT_SKETCH__OPERATION = eINSTANCE.getDiffProject_sketch_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PROJECT_SKETCH__ETYPE = eINSTANCE.getDiffProject_sketch_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProject_modulesImpl <em>Diff Project modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProject_modulesImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_modules()
		 * @generated
		 */
		EClass DIFF_PROJECT_MODULES = eINSTANCE.getDiffProject_modules();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT_MODULES__OPERATION = eINSTANCE.getDiffProject_modules_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PROJECT_MODULES__ETYPE = eINSTANCE.getDiffProject_modules_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProject_platformImpl <em>Diff Project platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProject_platformImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_platform()
		 * @generated
		 */
		EClass DIFF_PROJECT_PLATFORM = eINSTANCE.getDiffProject_platform();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT_PLATFORM__OPERATION = eINSTANCE.getDiffProject_platform_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PROJECT_PLATFORM__ETYPE = eINSTANCE.getDiffProject_platform_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffProject_domainspecificdiffsImpl <em>Diff Project domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffProject_domainspecificdiffsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffProject_domainspecificdiffs()
		 * @generated
		 */
		EClass DIFF_PROJECT_DOMAINSPECIFICDIFFS = eINSTANCE.getDiffProject_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PROJECT_DOMAINSPECIFICDIFFS__OPERATION = eINSTANCE.getDiffProject_domainspecificdiffs_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PROJECT_DOMAINSPECIFICDIFFS__ETYPE = eINSTANCE.getDiffProject_domainspecificdiffs_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffInstruction_previousImpl <em>Diff Instruction previous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffInstruction_previousImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInstruction_previous()
		 * @generated
		 */
		EClass DIFF_INSTRUCTION_PREVIOUS = eINSTANCE.getDiffInstruction_previous();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INSTRUCTION_PREVIOUS__OPERATION = eINSTANCE.getDiffInstruction_previous_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INSTRUCTION_PREVIOUS__ETYPE = eINSTANCE.getDiffInstruction_previous_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffInstruction_nextImpl <em>Diff Instruction next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffInstruction_nextImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInstruction_next()
		 * @generated
		 */
		EClass DIFF_INSTRUCTION_NEXT = eINSTANCE.getDiffInstruction_next();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INSTRUCTION_NEXT__OPERATION = eINSTANCE.getDiffInstruction_next_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_INSTRUCTION_NEXT__ETYPE = eINSTANCE.getDiffInstruction_next_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffStatusImpl <em>Diff Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffStatusImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffStatus()
		 * @generated
		 */
		EClass DIFF_STATUS = eINSTANCE.getDiffStatus();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_STATUS__OPERATION = eINSTANCE.getDiffStatus_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_STATUS__NEW_VALUE = eINSTANCE.getDiffStatus_New_value();

		/**
		 * The meta object literal for the '<em><b>New status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_STATUS__NEW_STATUS = eINSTANCE.getDiffStatus_New_status();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffStatus_sensorImpl <em>Diff Status sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffStatus_sensorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffStatus_sensor()
		 * @generated
		 */
		EClass DIFF_STATUS_SENSOR = eINSTANCE.getDiffStatus_sensor();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_STATUS_SENSOR__OPERATION = eINSTANCE.getDiffStatus_sensor_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_STATUS_SENSOR__ETYPE = eINSTANCE.getDiffStatus_sensor_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffLevelImpl <em>Diff Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffLevelImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffLevel()
		 * @generated
		 */
		EClass DIFF_LEVEL = eINSTANCE.getDiffLevel();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEVEL__OPERATION = eINSTANCE.getDiffLevel_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffLevel_levelImpl <em>Diff Level level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffLevel_levelImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffLevel_level()
		 * @generated
		 */
		EClass DIFF_LEVEL_LEVEL = eINSTANCE.getDiffLevel_level();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_LEVEL_LEVEL__OPERATION = eINSTANCE.getDiffLevel_level_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_LEVEL_LEVEL__ETYPE = eINSTANCE.getDiffLevel_level_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffModuleInstruction_moduleImpl <em>Diff Module Instruction module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffModuleInstruction_moduleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffModuleInstruction_module()
		 * @generated
		 */
		EClass DIFF_MODULE_INSTRUCTION_MODULE = eINSTANCE.getDiffModuleInstruction_module();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODULE_INSTRUCTION_MODULE__OPERATION = eINSTANCE.getDiffModuleInstruction_module_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MODULE_INSTRUCTION_MODULE__ETYPE = eINSTANCE.getDiffModuleInstruction_module_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffControl_instructionsImpl <em>Diff Control instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffControl_instructionsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffControl_instructions()
		 * @generated
		 */
		EClass DIFF_CONTROL_INSTRUCTIONS = eINSTANCE.getDiffControl_instructions();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONTROL_INSTRUCTIONS__OPERATION = eINSTANCE.getDiffControl_instructions_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTROL_INSTRUCTIONS__ETYPE = eINSTANCE.getDiffControl_instructions_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffDelayImpl <em>Diff Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffDelayImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffDelay()
		 * @generated
		 */
		EClass DIFF_DELAY = eINSTANCE.getDiffDelay();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DELAY__OPERATION = eINSTANCE.getDiffDelay_Operation();

		/**
		 * The meta object literal for the '<em><b>New unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DELAY__NEW_UNIT = eINSTANCE.getDiffDelay_New_unit();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_DELAY__NEW_VALUE = eINSTANCE.getDiffDelay_New_value();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffInputModuleImpl <em>Diff Input Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffInputModuleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffInputModule()
		 * @generated
		 */
		EClass DIFF_INPUT_MODULE = eINSTANCE.getDiffInputModule();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__OPERATION = eINSTANCE.getDiffInputModule_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__NEW_NAME = eINSTANCE.getDiffInputModule_New_name();

		/**
		 * The meta object literal for the '<em><b>New kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__NEW_KIND = eINSTANCE.getDiffInputModule_New_kind();

		/**
		 * The meta object literal for the '<em><b>New image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__NEW_IMAGE = eINSTANCE.getDiffInputModule_New_image();

		/**
		 * The meta object literal for the '<em><b>New level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__NEW_LEVEL = eINSTANCE.getDiffInputModule_New_level();

		/**
		 * The meta object literal for the '<em><b>New library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_INPUT_MODULE__NEW_LIBRARY = eINSTANCE.getDiffInputModule_New_library();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffOutputModuleImpl <em>Diff Output Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffOutputModuleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffOutputModule()
		 * @generated
		 */
		EClass DIFF_OUTPUT_MODULE = eINSTANCE.getDiffOutputModule();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__OPERATION = eINSTANCE.getDiffOutputModule_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__NEW_NAME = eINSTANCE.getDiffOutputModule_New_name();

		/**
		 * The meta object literal for the '<em><b>New kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__NEW_KIND = eINSTANCE.getDiffOutputModule_New_kind();

		/**
		 * The meta object literal for the '<em><b>New image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__NEW_IMAGE = eINSTANCE.getDiffOutputModule_New_image();

		/**
		 * The meta object literal for the '<em><b>New level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__NEW_LEVEL = eINSTANCE.getDiffOutputModule_New_level();

		/**
		 * The meta object literal for the '<em><b>New library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_OUTPUT_MODULE__NEW_LIBRARY = eINSTANCE.getDiffOutputModule_New_library();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffConnectorImpl <em>Diff Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffConnectorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector()
		 * @generated
		 */
		EClass DIFF_CONNECTOR = eINSTANCE.getDiffConnector();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONNECTOR__OPERATION = eINSTANCE.getDiffConnector_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffConnector_pinImpl <em>Diff Connector pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffConnector_pinImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector_pin()
		 * @generated
		 */
		EClass DIFF_CONNECTOR_PIN = eINSTANCE.getDiffConnector_pin();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONNECTOR_PIN__OPERATION = eINSTANCE.getDiffConnector_pin_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONNECTOR_PIN__ETYPE = eINSTANCE.getDiffConnector_pin_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffConnector_moduleImpl <em>Diff Connector module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffConnector_moduleImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConnector_module()
		 * @generated
		 */
		EClass DIFF_CONNECTOR_MODULE = eINSTANCE.getDiffConnector_module();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONNECTOR_MODULE__OPERATION = eINSTANCE.getDiffConnector_module_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONNECTOR_MODULE__ETYPE = eINSTANCE.getDiffConnector_module_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffRepeatImpl <em>Diff Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffRepeatImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffRepeat()
		 * @generated
		 */
		EClass DIFF_REPEAT = eINSTANCE.getDiffRepeat();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_REPEAT__OPERATION = eINSTANCE.getDiffRepeat_Operation();

		/**
		 * The meta object literal for the '<em><b>New iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_REPEAT__NEW_ITERATION = eINSTANCE.getDiffRepeat_New_iteration();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSensorImpl <em>Diff Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSensorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSensor()
		 * @generated
		 */
		EClass DIFF_SENSOR = eINSTANCE.getDiffSensor();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SENSOR__OPERATION = eINSTANCE.getDiffSensor_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SENSOR__NEW_VALUE = eINSTANCE.getDiffSensor_New_value();

		/**
		 * The meta object literal for the '<em><b>New operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SENSOR__NEW_OPERATOR = eINSTANCE.getDiffSensor_New_operator();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSensor_statusImpl <em>Diff Sensor status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSensor_statusImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSensor_status()
		 * @generated
		 */
		EClass DIFF_SENSOR_STATUS = eINSTANCE.getDiffSensor_status();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SENSOR_STATUS__OPERATION = eINSTANCE.getDiffSensor_status_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SENSOR_STATUS__ETYPE = eINSTANCE.getDiffSensor_status_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffWhileImpl <em>Diff While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffWhileImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffWhile()
		 * @generated
		 */
		EClass DIFF_WHILE = eINSTANCE.getDiffWhile();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_WHILE__OPERATION = eINSTANCE.getDiffWhile_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffWhile_conditionImpl <em>Diff While condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffWhile_conditionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffWhile_condition()
		 * @generated
		 */
		EClass DIFF_WHILE_CONDITION = eINSTANCE.getDiffWhile_condition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_WHILE_CONDITION__OPERATION = eINSTANCE.getDiffWhile_condition_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_WHILE_CONDITION__ETYPE = eINSTANCE.getDiffWhile_condition_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffMathOperator_leftImpl <em>Diff Math Operator left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffMathOperator_leftImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffMathOperator_left()
		 * @generated
		 */
		EClass DIFF_MATH_OPERATOR_LEFT = eINSTANCE.getDiffMathOperator_left();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MATH_OPERATOR_LEFT__OPERATION = eINSTANCE.getDiffMathOperator_left_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MATH_OPERATOR_LEFT__ETYPE = eINSTANCE.getDiffMathOperator_left_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffMathOperator_rightImpl <em>Diff Math Operator right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffMathOperator_rightImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffMathOperator_right()
		 * @generated
		 */
		EClass DIFF_MATH_OPERATOR_RIGHT = eINSTANCE.getDiffMathOperator_right();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MATH_OPERATOR_RIGHT__OPERATION = eINSTANCE.getDiffMathOperator_right_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MATH_OPERATOR_RIGHT__ETYPE = eINSTANCE.getDiffMathOperator_right_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffVariableImpl <em>Diff Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffVariableImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffVariable()
		 * @generated
		 */
		EClass DIFF_VARIABLE = eINSTANCE.getDiffVariable();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VARIABLE__OPERATION = eINSTANCE.getDiffVariable_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VARIABLE__NEW_VALUE = eINSTANCE.getDiffVariable_New_value();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_VARIABLE__NEW_NAME = eINSTANCE.getDiffVariable_New_name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSetImpl <em>Diff Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSetImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet()
		 * @generated
		 */
		EClass DIFF_SET = eINSTANCE.getDiffSet();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SET__OPERATION = eINSTANCE.getDiffSet_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSet_variableImpl <em>Diff Set variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSet_variableImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet_variable()
		 * @generated
		 */
		EClass DIFF_SET_VARIABLE = eINSTANCE.getDiffSet_variable();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SET_VARIABLE__OPERATION = eINSTANCE.getDiffSet_variable_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SET_VARIABLE__ETYPE = eINSTANCE.getDiffSet_variable_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffSet_valueImpl <em>Diff Set value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffSet_valueImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffSet_value()
		 * @generated
		 */
		EClass DIFF_SET_VALUE = eINSTANCE.getDiffSet_value();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_SET_VALUE__OPERATION = eINSTANCE.getDiffSet_value_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_SET_VALUE__ETYPE = eINSTANCE.getDiffSet_value_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffNumericalOperatorImpl <em>Diff Numerical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffNumericalOperatorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffNumericalOperator()
		 * @generated
		 */
		EClass DIFF_NUMERICAL_OPERATOR = eINSTANCE.getDiffNumericalOperator();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_NUMERICAL_OPERATOR__OPERATION = eINSTANCE.getDiffNumericalOperator_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_NUMERICAL_OPERATOR__NEW_VALUE = eINSTANCE.getDiffNumericalOperator_New_value();

		/**
		 * The meta object literal for the '<em><b>New operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_NUMERICAL_OPERATOR__NEW_OPERATOR = eINSTANCE.getDiffNumericalOperator_New_operator();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffBooleanOperatorImpl <em>Diff Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffBooleanOperatorImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffBooleanOperator()
		 * @generated
		 */
		EClass DIFF_BOOLEAN_OPERATOR = eINSTANCE.getDiffBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_BOOLEAN_OPERATOR__OPERATION = eINSTANCE.getDiffBooleanOperator_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_BOOLEAN_OPERATOR__NEW_VALUE = eINSTANCE.getDiffBooleanOperator_New_value();

		/**
		 * The meta object literal for the '<em><b>New operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_BOOLEAN_OPERATOR__NEW_OPERATOR = eINSTANCE.getDiffBooleanOperator_New_operator();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffConstantImpl <em>Diff Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffConstantImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffConstant()
		 * @generated
		 */
		EClass DIFF_CONSTANT = eINSTANCE.getDiffConstant();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONSTANT__OPERATION = eINSTANCE.getDiffConstant_Operation();

		/**
		 * The meta object literal for the '<em><b>New value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CONSTANT__NEW_VALUE = eINSTANCE.getDiffConstant_New_value();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffIfImpl <em>Diff If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffIfImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffIf()
		 * @generated
		 */
		EClass DIFF_IF = eINSTANCE.getDiffIf();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_IF__OPERATION = eINSTANCE.getDiffIf_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffIf_conditionImpl <em>Diff If condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffIf_conditionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffIf_condition()
		 * @generated
		 */
		EClass DIFF_IF_CONDITION = eINSTANCE.getDiffIf_condition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_IF_CONDITION__OPERATION = eINSTANCE.getDiffIf_condition_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_IF_CONDITION__ETYPE = eINSTANCE.getDiffIf_condition_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunctionImpl <em>Diff Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunctionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction()
		 * @generated
		 */
		EClass DIFF_FUNCTION = eINSTANCE.getDiffFunction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION__OPERATION = eINSTANCE.getDiffFunction_Operation();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION__NEW_NAME = eINSTANCE.getDiffFunction_New_name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunction_paramDefsImpl <em>Diff Function param Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunction_paramDefsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction_paramDefs()
		 * @generated
		 */
		EClass DIFF_FUNCTION_PARAM_DEFS = eINSTANCE.getDiffFunction_paramDefs();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION_PARAM_DEFS__OPERATION = eINSTANCE.getDiffFunction_paramDefs_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FUNCTION_PARAM_DEFS__ETYPE = eINSTANCE.getDiffFunction_paramDefs_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunction_instructionsImpl <em>Diff Function instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunction_instructionsImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunction_instructions()
		 * @generated
		 */
		EClass DIFF_FUNCTION_INSTRUCTIONS = eINSTANCE.getDiffFunction_instructions();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION_INSTRUCTIONS__OPERATION = eINSTANCE.getDiffFunction_instructions_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FUNCTION_INSTRUCTIONS__ETYPE = eINSTANCE.getDiffFunction_instructions_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffParameterDefinitionImpl <em>Diff Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffParameterDefinitionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterDefinition()
		 * @generated
		 */
		EClass DIFF_PARAMETER_DEFINITION = eINSTANCE.getDiffParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_DEFINITION__OPERATION = eINSTANCE.getDiffParameterDefinition_Operation();

		/**
		 * The meta object literal for the '<em><b>New type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_DEFINITION__NEW_TYPE = eINSTANCE.getDiffParameterDefinition_New_type();

		/**
		 * The meta object literal for the '<em><b>New name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_DEFINITION__NEW_NAME = eINSTANCE.getDiffParameterDefinition_New_name();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffParameter_to_definitionImpl <em>Diff Parameter to definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffParameter_to_definitionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameter_to_definition()
		 * @generated
		 */
		EClass DIFF_PARAMETER_TO_DEFINITION = eINSTANCE.getDiffParameter_to_definition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_TO_DEFINITION__OPERATION = eINSTANCE.getDiffParameter_to_definition_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PARAMETER_TO_DEFINITION__ETYPE = eINSTANCE.getDiffParameter_to_definition_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunctionCallImpl <em>Diff Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunctionCallImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall()
		 * @generated
		 */
		EClass DIFF_FUNCTION_CALL = eINSTANCE.getDiffFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION_CALL__OPERATION = eINSTANCE.getDiffFunctionCall_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunctionCall_definitionImpl <em>Diff Function Call definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunctionCall_definitionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall_definition()
		 * @generated
		 */
		EClass DIFF_FUNCTION_CALL_DEFINITION = eINSTANCE.getDiffFunctionCall_definition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION_CALL_DEFINITION__OPERATION = eINSTANCE.getDiffFunctionCall_definition_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FUNCTION_CALL_DEFINITION__ETYPE = eINSTANCE.getDiffFunctionCall_definition_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffFunctionCall_parametersImpl <em>Diff Function Call parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffFunctionCall_parametersImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffFunctionCall_parameters()
		 * @generated
		 */
		EClass DIFF_FUNCTION_CALL_PARAMETERS = eINSTANCE.getDiffFunctionCall_parameters();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_FUNCTION_CALL_PARAMETERS__OPERATION = eINSTANCE.getDiffFunctionCall_parameters_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_FUNCTION_CALL_PARAMETERS__ETYPE = eINSTANCE.getDiffFunctionCall_parameters_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffParameterCallImpl <em>Diff Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffParameterCallImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterCall()
		 * @generated
		 */
		EClass DIFF_PARAMETER_CALL = eINSTANCE.getDiffParameterCall();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_CALL__OPERATION = eINSTANCE.getDiffParameterCall_Operation();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.impl.DiffParameterCall_definitionImpl <em>Diff Parameter Call definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.impl.DiffParameterCall_definitionImpl
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getDiffParameterCall_definition()
		 * @generated
		 */
		EClass DIFF_PARAMETER_CALL_DEFINITION = eINSTANCE.getDiffParameterCall_definition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_PARAMETER_CALL_DEFINITION__OPERATION = eINSTANCE.getDiffParameterCall_definition_Operation();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_PARAMETER_CALL_DEFINITION__ETYPE = eINSTANCE.getDiffParameterCall_definition_EType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.Time <em>Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.Time
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getTime()
		 * @generated
		 */
		EEnum TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.ModuleKind <em>Module Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.ModuleKind
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getModuleKind()
		 * @generated
		 */
		EEnum MODULE_KIND = eINSTANCE.getModuleKind();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.OperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.OperatorKind
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getOperatorKind()
		 * @generated
		 */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.Library <em>Library</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.Library
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getLibrary()
		 * @generated
		 */
		EEnum LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.ParameterType
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.ClassOp <em>Class Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.ClassOp
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getClassOp()
		 * @generated
		 */
		EEnum CLASS_OP = eINSTANCE.getClassOp();

		/**
		 * The meta object literal for the '{@link arduinoDiffMM.AscOp <em>Asc Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoDiffMM.AscOp
		 * @see arduinoDiffMM.impl.ArduinoDiffMMPackageImpl#getAscOp()
		 * @generated
		 */
		EEnum ASC_OP = eINSTANCE.getAscOp();

	}

} //ArduinoDiffMMPackage
