/**
 */
package arduinoRuleMM;

import arduinoDiffMM.ArduinoDiffMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see arduinoRuleMM.ArduinoRuleMMFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoRuleMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoRuleMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/arduinoRuleMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoRuleMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoRuleMMPackage eINSTANCE = arduinoRuleMM.impl.ArduinoRuleMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_HardwareImpl <em>Pattern Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_HardwareImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Hardware()
	 * @generated
	 */
	int PATTERN_HARDWARE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__NAME = ArduinoDiffMMPackage.HARDWARE__NAME;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__PLATFORMS = ArduinoDiffMMPackage.HARDWARE__PLATFORMS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__MODULES = ArduinoDiffMMPackage.HARDWARE__MODULES;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__CONNECTORS = ArduinoDiffMMPackage.HARDWARE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Diffplatforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__DIFFPLATFORMS = ArduinoDiffMMPackage.HARDWARE__DIFFPLATFORMS;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__DIFFMODULES = ArduinoDiffMMPackage.HARDWARE__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__DIFFCONNECTORS = ArduinoDiffMMPackage.HARDWARE__DIFFCONNECTORS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE__ID_PATTERN = ArduinoDiffMMPackage.HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE_FEATURE_COUNT = ArduinoDiffMMPackage.HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_HARDWARE_OPERATION_COUNT = ArduinoDiffMMPackage.HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_PlatformImpl <em>Pattern Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_PlatformImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Platform()
	 * @generated
	 */
	int PATTERN_PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__NAME = ArduinoDiffMMPackage.PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__DIGITAL_PINS = ArduinoDiffMMPackage.PLATFORM__DIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__ANALOG_PINS = ArduinoDiffMMPackage.PLATFORM__ANALOG_PINS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__IMAGE = ArduinoDiffMMPackage.PLATFORM__IMAGE;

	/**
	 * The feature id for the '<em><b>Diffdigital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__DIFFDIGITAL_PINS = ArduinoDiffMMPackage.PLATFORM__DIFFDIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Diffanalog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__DIFFANALOG_PINS = ArduinoDiffMMPackage.PLATFORM__DIFFANALOG_PINS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM__ID_PATTERN = ArduinoDiffMMPackage.PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM_FEATURE_COUNT = ArduinoDiffMMPackage.PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PLATFORM_OPERATION_COUNT = ArduinoDiffMMPackage.PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ModuleImpl <em>Pattern Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ModuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Module()
	 * @generated
	 */
	int PATTERN_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__NAME = ArduinoDiffMMPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__KIND = ArduinoDiffMMPackage.MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__IMAGE = ArduinoDiffMMPackage.MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__LEVEL = ArduinoDiffMMPackage.MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__LIBRARY = ArduinoDiffMMPackage.MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE__ID_PATTERN = ArduinoDiffMMPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DigitalPinImpl <em>Pattern Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DigitalPinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DigitalPin()
	 * @generated
	 */
	int PATTERN_DIGITAL_PIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIGITAL_PIN__ID = ArduinoDiffMMPackage.DIGITAL_PIN__ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIGITAL_PIN__ID_PATTERN = ArduinoDiffMMPackage.DIGITAL_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIGITAL_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.DIGITAL_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIGITAL_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.DIGITAL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_PinImpl <em>Pattern Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_PinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Pin()
	 * @generated
	 */
	int PATTERN_PIN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PIN__ID = ArduinoDiffMMPackage.PIN__ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PIN__ID_PATTERN = ArduinoDiffMMPackage.PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_AnalogPinImpl <em>Pattern Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_AnalogPinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_AnalogPin()
	 * @generated
	 */
	int PATTERN_ANALOG_PIN = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALOG_PIN__ID = ArduinoDiffMMPackage.ANALOG_PIN__ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALOG_PIN__ID_PATTERN = ArduinoDiffMMPackage.ANALOG_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALOG_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.ANALOG_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ANALOG_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.ANALOG_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_SketchImpl <em>Pattern Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_SketchImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Sketch()
	 * @generated
	 */
	int PATTERN_SKETCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__NAME = ArduinoDiffMMPackage.SKETCH__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__PREVIOUS = ArduinoDiffMMPackage.SKETCH__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__NEXT = ArduinoDiffMMPackage.SKETCH__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__DIFFPREVIOUS = ArduinoDiffMMPackage.SKETCH__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__DIFFNEXT = ArduinoDiffMMPackage.SKETCH__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__HARDWARE = ArduinoDiffMMPackage.SKETCH__HARDWARE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__INSTRUCTIONS = ArduinoDiffMMPackage.SKETCH__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__FUNCTIONS = ArduinoDiffMMPackage.SKETCH__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__DIFFHARDWARE = ArduinoDiffMMPackage.SKETCH__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.SKETCH__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Difffunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__DIFFFUNCTIONS = ArduinoDiffMMPackage.SKETCH__DIFFFUNCTIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH__ID_PATTERN = ArduinoDiffMMPackage.SKETCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH_FEATURE_COUNT = ArduinoDiffMMPackage.SKETCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SKETCH_OPERATION_COUNT = ArduinoDiffMMPackage.SKETCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ProjectImpl <em>Pattern Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ProjectImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Project()
	 * @generated
	 */
	int PATTERN_PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__HARDWARE = ArduinoDiffMMPackage.PROJECT__HARDWARE;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__SKETCH = ArduinoDiffMMPackage.PROJECT__SKETCH;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__MODULES = ArduinoDiffMMPackage.PROJECT__MODULES;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__PLATFORM = ArduinoDiffMMPackage.PROJECT__PLATFORM;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DOMAINSPECIFICDIFFS = ArduinoDiffMMPackage.PROJECT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DIFFHARDWARE = ArduinoDiffMMPackage.PROJECT__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffsketch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DIFFSKETCH = ArduinoDiffMMPackage.PROJECT__DIFFSKETCH;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DIFFMODULES = ArduinoDiffMMPackage.PROJECT__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffplatform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DIFFPLATFORM = ArduinoDiffMMPackage.PROJECT__DIFFPLATFORM;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__DIFFDOMAINSPECIFICDIFFS = ArduinoDiffMMPackage.PROJECT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT__ID_PATTERN = ArduinoDiffMMPackage.PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT_FEATURE_COUNT = ArduinoDiffMMPackage.PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROJECT_OPERATION_COUNT = ArduinoDiffMMPackage.PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_InstructionImpl <em>Pattern Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_InstructionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Instruction()
	 * @generated
	 */
	int PATTERN_INSTRUCTION = 8;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION__PREVIOUS = ArduinoDiffMMPackage.INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION__NEXT = ArduinoDiffMMPackage.INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION__DIFFPREVIOUS = ArduinoDiffMMPackage.INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION__DIFFNEXT = ArduinoDiffMMPackage.INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION__ID_PATTERN = ArduinoDiffMMPackage.INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION_FEATURE_COUNT = ArduinoDiffMMPackage.INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INSTRUCTION_OPERATION_COUNT = ArduinoDiffMMPackage.INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_StatusImpl <em>Pattern Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_StatusImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Status()
	 * @generated
	 */
	int PATTERN_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__PREVIOUS = ArduinoDiffMMPackage.STATUS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__NEXT = ArduinoDiffMMPackage.STATUS__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DIFFPREVIOUS = ArduinoDiffMMPackage.STATUS__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DIFFNEXT = ArduinoDiffMMPackage.STATUS__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DEFINITION = ArduinoDiffMMPackage.STATUS__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DIFFDEFINITION = ArduinoDiffMMPackage.STATUS__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__MODULE = ArduinoDiffMMPackage.STATUS__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DIFFMODULE = ArduinoDiffMMPackage.STATUS__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__VALUE = ArduinoDiffMMPackage.STATUS__VALUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__STATUS = ArduinoDiffMMPackage.STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__SENSOR = ArduinoDiffMMPackage.STATUS__SENSOR;

	/**
	 * The feature id for the '<em><b>Diffsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__DIFFSENSOR = ArduinoDiffMMPackage.STATUS__DIFFSENSOR;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS__ID_PATTERN = ArduinoDiffMMPackage.STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS_FEATURE_COUNT = ArduinoDiffMMPackage.STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_STATUS_OPERATION_COUNT = ArduinoDiffMMPackage.STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_LevelImpl <em>Pattern Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_LevelImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Level()
	 * @generated
	 */
	int PATTERN_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__PREVIOUS = ArduinoDiffMMPackage.LEVEL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__NEXT = ArduinoDiffMMPackage.LEVEL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DIFFPREVIOUS = ArduinoDiffMMPackage.LEVEL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DIFFNEXT = ArduinoDiffMMPackage.LEVEL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DEFINITION = ArduinoDiffMMPackage.LEVEL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DIFFDEFINITION = ArduinoDiffMMPackage.LEVEL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__MODULE = ArduinoDiffMMPackage.LEVEL__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DIFFMODULE = ArduinoDiffMMPackage.LEVEL__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__LEVEL = ArduinoDiffMMPackage.LEVEL__LEVEL;

	/**
	 * The feature id for the '<em><b>Difflevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__DIFFLEVEL = ArduinoDiffMMPackage.LEVEL__DIFFLEVEL;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL__ID_PATTERN = ArduinoDiffMMPackage.LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL_FEATURE_COUNT = ArduinoDiffMMPackage.LEVEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LEVEL_OPERATION_COUNT = ArduinoDiffMMPackage.LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ModuleInstructionImpl <em>Pattern Module Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ModuleInstructionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ModuleInstruction()
	 * @generated
	 */
	int PATTERN_MODULE_INSTRUCTION = 11;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__PREVIOUS = ArduinoDiffMMPackage.MODULE_INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__NEXT = ArduinoDiffMMPackage.MODULE_INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__DIFFPREVIOUS = ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__DIFFNEXT = ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__DEFINITION = ArduinoDiffMMPackage.MODULE_INSTRUCTION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__DIFFDEFINITION = ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__MODULE = ArduinoDiffMMPackage.MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__DIFFMODULE = ArduinoDiffMMPackage.MODULE_INSTRUCTION__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION__ID_PATTERN = ArduinoDiffMMPackage.MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION_FEATURE_COUNT = ArduinoDiffMMPackage.MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MODULE_INSTRUCTION_OPERATION_COUNT = ArduinoDiffMMPackage.MODULE_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ControlImpl <em>Pattern Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ControlImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Control()
	 * @generated
	 */
	int PATTERN_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__PREVIOUS = ArduinoDiffMMPackage.CONTROL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__NEXT = ArduinoDiffMMPackage.CONTROL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__DIFFPREVIOUS = ArduinoDiffMMPackage.CONTROL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__DIFFNEXT = ArduinoDiffMMPackage.CONTROL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__INSTRUCTIONS = ArduinoDiffMMPackage.CONTROL__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.CONTROL__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL__ID_PATTERN = ArduinoDiffMMPackage.CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL_FEATURE_COUNT = ArduinoDiffMMPackage.CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONTROL_OPERATION_COUNT = ArduinoDiffMMPackage.CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_UtilitiesImpl <em>Pattern Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_UtilitiesImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Utilities()
	 * @generated
	 */
	int PATTERN_UTILITIES = 13;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__PREVIOUS = ArduinoDiffMMPackage.UTILITIES__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__NEXT = ArduinoDiffMMPackage.UTILITIES__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__DIFFPREVIOUS = ArduinoDiffMMPackage.UTILITIES__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__DIFFNEXT = ArduinoDiffMMPackage.UTILITIES__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__DEFINITION = ArduinoDiffMMPackage.UTILITIES__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__DIFFDEFINITION = ArduinoDiffMMPackage.UTILITIES__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES__ID_PATTERN = ArduinoDiffMMPackage.UTILITIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES_FEATURE_COUNT = ArduinoDiffMMPackage.UTILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_UTILITIES_OPERATION_COUNT = ArduinoDiffMMPackage.UTILITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_IOImpl <em>Pattern IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_IOImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_IO()
	 * @generated
	 */
	int PATTERN_IO = 14;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO__PREVIOUS = ArduinoDiffMMPackage.IO__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO__NEXT = ArduinoDiffMMPackage.IO__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO__DIFFPREVIOUS = ArduinoDiffMMPackage.IO__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO__DIFFNEXT = ArduinoDiffMMPackage.IO__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO__ID_PATTERN = ArduinoDiffMMPackage.IO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO_FEATURE_COUNT = ArduinoDiffMMPackage.IO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IO_OPERATION_COUNT = ArduinoDiffMMPackage.IO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DelayImpl <em>Pattern Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DelayImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Delay()
	 * @generated
	 */
	int PATTERN_DELAY = 15;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__PREVIOUS = ArduinoDiffMMPackage.DELAY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__NEXT = ArduinoDiffMMPackage.DELAY__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__DIFFPREVIOUS = ArduinoDiffMMPackage.DELAY__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__DIFFNEXT = ArduinoDiffMMPackage.DELAY__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__DEFINITION = ArduinoDiffMMPackage.DELAY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__DIFFDEFINITION = ArduinoDiffMMPackage.DELAY__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__UNIT = ArduinoDiffMMPackage.DELAY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__VALUE = ArduinoDiffMMPackage.DELAY__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY__ID_PATTERN = ArduinoDiffMMPackage.DELAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY_FEATURE_COUNT = ArduinoDiffMMPackage.DELAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DELAY_OPERATION_COUNT = ArduinoDiffMMPackage.DELAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_InputModuleImpl <em>Pattern Input Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_InputModuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_InputModule()
	 * @generated
	 */
	int PATTERN_INPUT_MODULE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__NAME = ArduinoDiffMMPackage.INPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__KIND = ArduinoDiffMMPackage.INPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__IMAGE = ArduinoDiffMMPackage.INPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__LEVEL = ArduinoDiffMMPackage.INPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__LIBRARY = ArduinoDiffMMPackage.INPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE__ID_PATTERN = ArduinoDiffMMPackage.INPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.INPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_INPUT_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.INPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_OutputModuleImpl <em>Pattern Output Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_OutputModuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_OutputModule()
	 * @generated
	 */
	int PATTERN_OUTPUT_MODULE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__NAME = ArduinoDiffMMPackage.OUTPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__KIND = ArduinoDiffMMPackage.OUTPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__IMAGE = ArduinoDiffMMPackage.OUTPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__LEVEL = ArduinoDiffMMPackage.OUTPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__LIBRARY = ArduinoDiffMMPackage.OUTPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE__ID_PATTERN = ArduinoDiffMMPackage.OUTPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.OUTPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OUTPUT_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.OUTPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_NamedElementImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_NamedElement()
	 * @generated
	 */
	int PATTERN_NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__NAME = ArduinoDiffMMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT__ID_PATTERN = ArduinoDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_FEATURE_COUNT = ArduinoDiffMMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NAMED_ELEMENT_OPERATION_COUNT = ArduinoDiffMMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ConnectorImpl <em>Pattern Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ConnectorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Connector()
	 * @generated
	 */
	int PATTERN_CONNECTOR = 19;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR__PIN = ArduinoDiffMMPackage.CONNECTOR__PIN;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR__MODULE = ArduinoDiffMMPackage.CONNECTOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR__DIFFPIN = ArduinoDiffMMPackage.CONNECTOR__DIFFPIN;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR__DIFFMODULE = ArduinoDiffMMPackage.CONNECTOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR__ID_PATTERN = ArduinoDiffMMPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR_FEATURE_COUNT = ArduinoDiffMMPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONNECTOR_OPERATION_COUNT = ArduinoDiffMMPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_RepeatImpl <em>Pattern Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_RepeatImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Repeat()
	 * @generated
	 */
	int PATTERN_REPEAT = 20;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__PREVIOUS = ArduinoDiffMMPackage.REPEAT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__NEXT = ArduinoDiffMMPackage.REPEAT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__DIFFPREVIOUS = ArduinoDiffMMPackage.REPEAT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__DIFFNEXT = ArduinoDiffMMPackage.REPEAT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__INSTRUCTIONS = ArduinoDiffMMPackage.REPEAT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.REPEAT__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__ITERATION = ArduinoDiffMMPackage.REPEAT__ITERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT__ID_PATTERN = ArduinoDiffMMPackage.REPEAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT_FEATURE_COUNT = ArduinoDiffMMPackage.REPEAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REPEAT_OPERATION_COUNT = ArduinoDiffMMPackage.REPEAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_SensorImpl <em>Pattern Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_SensorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Sensor()
	 * @generated
	 */
	int PATTERN_SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__PREVIOUS = ArduinoDiffMMPackage.SENSOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__NEXT = ArduinoDiffMMPackage.SENSOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFPREVIOUS = ArduinoDiffMMPackage.SENSOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFNEXT = ArduinoDiffMMPackage.SENSOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DEFINITION = ArduinoDiffMMPackage.SENSOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFDEFINITION = ArduinoDiffMMPackage.SENSOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__MODULE = ArduinoDiffMMPackage.SENSOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFMODULE = ArduinoDiffMMPackage.SENSOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__VALUE = ArduinoDiffMMPackage.SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__LEFT = ArduinoDiffMMPackage.SENSOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__RIGHT = ArduinoDiffMMPackage.SENSOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__OPERATOR = ArduinoDiffMMPackage.SENSOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFLEFT = ArduinoDiffMMPackage.SENSOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFRIGHT = ArduinoDiffMMPackage.SENSOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__STATUS = ArduinoDiffMMPackage.SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Diffstatus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__DIFFSTATUS = ArduinoDiffMMPackage.SENSOR__DIFFSTATUS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR__ID_PATTERN = ArduinoDiffMMPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR_FEATURE_COUNT = ArduinoDiffMMPackage.SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SENSOR_OPERATION_COUNT = ArduinoDiffMMPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_WhileImpl <em>Pattern While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_WhileImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_While()
	 * @generated
	 */
	int PATTERN_WHILE = 22;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__PREVIOUS = ArduinoDiffMMPackage.WHILE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__NEXT = ArduinoDiffMMPackage.WHILE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__DIFFPREVIOUS = ArduinoDiffMMPackage.WHILE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__DIFFNEXT = ArduinoDiffMMPackage.WHILE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__INSTRUCTIONS = ArduinoDiffMMPackage.WHILE__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.WHILE__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__CONDITION = ArduinoDiffMMPackage.WHILE__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__DIFFCONDITION = ArduinoDiffMMPackage.WHILE__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE__ID_PATTERN = ArduinoDiffMMPackage.WHILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE_FEATURE_COUNT = ArduinoDiffMMPackage.WHILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_WHILE_OPERATION_COUNT = ArduinoDiffMMPackage.WHILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_MathOperatorImpl <em>Pattern Math Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_MathOperatorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_MathOperator()
	 * @generated
	 */
	int PATTERN_MATH_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__PREVIOUS = ArduinoDiffMMPackage.MATH_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__NEXT = ArduinoDiffMMPackage.MATH_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DIFFPREVIOUS = ArduinoDiffMMPackage.MATH_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DIFFNEXT = ArduinoDiffMMPackage.MATH_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DEFINITION = ArduinoDiffMMPackage.MATH_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DIFFDEFINITION = ArduinoDiffMMPackage.MATH_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__VALUE = ArduinoDiffMMPackage.MATH_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__LEFT = ArduinoDiffMMPackage.MATH_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__RIGHT = ArduinoDiffMMPackage.MATH_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__OPERATOR = ArduinoDiffMMPackage.MATH_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DIFFLEFT = ArduinoDiffMMPackage.MATH_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__DIFFRIGHT = ArduinoDiffMMPackage.MATH_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR__ID_PATTERN = ArduinoDiffMMPackage.MATH_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Math Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR_FEATURE_COUNT = ArduinoDiffMMPackage.MATH_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Math Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_MATH_OPERATOR_OPERATION_COUNT = ArduinoDiffMMPackage.MATH_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_VariableImpl <em>Pattern Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_VariableImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Variable()
	 * @generated
	 */
	int PATTERN_VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__PREVIOUS = ArduinoDiffMMPackage.VARIABLE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__NEXT = ArduinoDiffMMPackage.VARIABLE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__DIFFPREVIOUS = ArduinoDiffMMPackage.VARIABLE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__DIFFNEXT = ArduinoDiffMMPackage.VARIABLE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__DEFINITION = ArduinoDiffMMPackage.VARIABLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__DIFFDEFINITION = ArduinoDiffMMPackage.VARIABLE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__VALUE = ArduinoDiffMMPackage.VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__NAME = ArduinoDiffMMPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE__ID_PATTERN = ArduinoDiffMMPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE_FEATURE_COUNT = ArduinoDiffMMPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VARIABLE_OPERATION_COUNT = ArduinoDiffMMPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_SetImpl <em>Pattern Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_SetImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Set()
	 * @generated
	 */
	int PATTERN_SET = 25;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__PREVIOUS = ArduinoDiffMMPackage.SET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__NEXT = ArduinoDiffMMPackage.SET__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__DIFFPREVIOUS = ArduinoDiffMMPackage.SET__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__DIFFNEXT = ArduinoDiffMMPackage.SET__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__VARIABLE = ArduinoDiffMMPackage.SET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__VALUE = ArduinoDiffMMPackage.SET__VALUE;

	/**
	 * The feature id for the '<em><b>Diffvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__DIFFVARIABLE = ArduinoDiffMMPackage.SET__DIFFVARIABLE;

	/**
	 * The feature id for the '<em><b>Diffvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__DIFFVALUE = ArduinoDiffMMPackage.SET__DIFFVALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET__ID_PATTERN = ArduinoDiffMMPackage.SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET_FEATURE_COUNT = ArduinoDiffMMPackage.SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SET_OPERATION_COUNT = ArduinoDiffMMPackage.SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_NumericalOperatorImpl <em>Pattern Numerical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_NumericalOperatorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_NumericalOperator()
	 * @generated
	 */
	int PATTERN_NUMERICAL_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__PREVIOUS = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__NEXT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DIFFPREVIOUS = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DIFFNEXT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DEFINITION = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DIFFDEFINITION = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__VALUE = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__LEFT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__RIGHT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__OPERATOR = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DIFFLEFT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__DIFFRIGHT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR__ID_PATTERN = ArduinoDiffMMPackage.NUMERICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR_FEATURE_COUNT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_NUMERICAL_OPERATOR_OPERATION_COUNT = ArduinoDiffMMPackage.NUMERICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_BooleanOperatorImpl <em>Pattern Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_BooleanOperatorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_BooleanOperator()
	 * @generated
	 */
	int PATTERN_BOOLEAN_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__PREVIOUS = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__NEXT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DIFFPREVIOUS = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DIFFNEXT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DEFINITION = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DIFFDEFINITION = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__VALUE = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__LEFT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__RIGHT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__OPERATOR = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DIFFLEFT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__DIFFRIGHT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR__ID_PATTERN = ArduinoDiffMMPackage.BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR_FEATURE_COUNT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_BOOLEAN_OPERATOR_OPERATION_COUNT = ArduinoDiffMMPackage.BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ValueImpl <em>Pattern Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ValueImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Value()
	 * @generated
	 */
	int PATTERN_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__PREVIOUS = ArduinoDiffMMPackage.VALUE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__NEXT = ArduinoDiffMMPackage.VALUE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__DIFFPREVIOUS = ArduinoDiffMMPackage.VALUE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__DIFFNEXT = ArduinoDiffMMPackage.VALUE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__DEFINITION = ArduinoDiffMMPackage.VALUE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__DIFFDEFINITION = ArduinoDiffMMPackage.VALUE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__VALUE = ArduinoDiffMMPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE__ID_PATTERN = ArduinoDiffMMPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE_FEATURE_COUNT = ArduinoDiffMMPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_VALUE_OPERATION_COUNT = ArduinoDiffMMPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ConstantImpl <em>Pattern Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ConstantImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Constant()
	 * @generated
	 */
	int PATTERN_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__PREVIOUS = ArduinoDiffMMPackage.CONSTANT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__NEXT = ArduinoDiffMMPackage.CONSTANT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__DIFFPREVIOUS = ArduinoDiffMMPackage.CONSTANT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__DIFFNEXT = ArduinoDiffMMPackage.CONSTANT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__DEFINITION = ArduinoDiffMMPackage.CONSTANT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__DIFFDEFINITION = ArduinoDiffMMPackage.CONSTANT__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__VALUE = ArduinoDiffMMPackage.CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT__ID_PATTERN = ArduinoDiffMMPackage.CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT_FEATURE_COUNT = ArduinoDiffMMPackage.CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTANT_OPERATION_COUNT = ArduinoDiffMMPackage.CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_IfImpl <em>Pattern If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_IfImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_If()
	 * @generated
	 */
	int PATTERN_IF = 30;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__PREVIOUS = ArduinoDiffMMPackage.IF__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__NEXT = ArduinoDiffMMPackage.IF__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__DIFFPREVIOUS = ArduinoDiffMMPackage.IF__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__DIFFNEXT = ArduinoDiffMMPackage.IF__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__INSTRUCTIONS = ArduinoDiffMMPackage.IF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.IF__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__CONDITION = ArduinoDiffMMPackage.IF__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__DIFFCONDITION = ArduinoDiffMMPackage.IF__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF__ID_PATTERN = ArduinoDiffMMPackage.IF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF_FEATURE_COUNT = ArduinoDiffMMPackage.IF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_IF_OPERATION_COUNT = ArduinoDiffMMPackage.IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_FunctionImpl <em>Pattern Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_FunctionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Function()
	 * @generated
	 */
	int PATTERN_FUNCTION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__NAME = ArduinoDiffMMPackage.FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Param Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__PARAM_DEFS = ArduinoDiffMMPackage.FUNCTION__PARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__INSTRUCTIONS = ArduinoDiffMMPackage.FUNCTION__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffparam Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__DIFFPARAM_DEFS = ArduinoDiffMMPackage.FUNCTION__DIFFPARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.FUNCTION__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION__ID_PATTERN = ArduinoDiffMMPackage.FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_FEATURE_COUNT = ArduinoDiffMMPackage.FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_OPERATION_COUNT = ArduinoDiffMMPackage.FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ParameterDefinitionImpl <em>Pattern Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ParameterDefinitionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ParameterDefinition()
	 * @generated
	 */
	int PATTERN_PARAMETER_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_DEFINITION__TYPE = ArduinoDiffMMPackage.PARAMETER_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_DEFINITION__NAME = ArduinoDiffMMPackage.PARAMETER_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_DEFINITION__ID_PATTERN = ArduinoDiffMMPackage.PARAMETER_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_DEFINITION_FEATURE_COUNT = ArduinoDiffMMPackage.PARAMETER_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_DEFINITION_OPERATION_COUNT = ArduinoDiffMMPackage.PARAMETER_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ParameterImpl <em>Pattern Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ParameterImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Parameter()
	 * @generated
	 */
	int PATTERN_PARAMETER = 33;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER__DEFINITION = ArduinoDiffMMPackage.PARAMETER__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER__DIFFDEFINITION = ArduinoDiffMMPackage.PARAMETER__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER__ID_PATTERN = ArduinoDiffMMPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_FEATURE_COUNT = ArduinoDiffMMPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_OPERATION_COUNT = ArduinoDiffMMPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_FunctionCallImpl <em>Pattern Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_FunctionCallImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_FunctionCall()
	 * @generated
	 */
	int PATTERN_FUNCTION_CALL = 34;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__PREVIOUS = ArduinoDiffMMPackage.FUNCTION_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__NEXT = ArduinoDiffMMPackage.FUNCTION_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__DIFFPREVIOUS = ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__DIFFNEXT = ArduinoDiffMMPackage.FUNCTION_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__DEFINITION = ArduinoDiffMMPackage.FUNCTION_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__PARAMETERS = ArduinoDiffMMPackage.FUNCTION_CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__DIFFDEFINITION = ArduinoDiffMMPackage.FUNCTION_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Diffparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__DIFFPARAMETERS = ArduinoDiffMMPackage.FUNCTION_CALL__DIFFPARAMETERS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL__ID_PATTERN = ArduinoDiffMMPackage.FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL_FEATURE_COUNT = ArduinoDiffMMPackage.FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FUNCTION_CALL_OPERATION_COUNT = ArduinoDiffMMPackage.FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_ParameterCallImpl <em>Pattern Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_ParameterCallImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ParameterCall()
	 * @generated
	 */
	int PATTERN_PARAMETER_CALL = 35;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__PREVIOUS = ArduinoDiffMMPackage.PARAMETER_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__NEXT = ArduinoDiffMMPackage.PARAMETER_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__DIFFPREVIOUS = ArduinoDiffMMPackage.PARAMETER_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__DIFFNEXT = ArduinoDiffMMPackage.PARAMETER_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__DEFINITION = ArduinoDiffMMPackage.PARAMETER_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__DIFFDEFINITION = ArduinoDiffMMPackage.PARAMETER_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL__ID_PATTERN = ArduinoDiffMMPackage.PARAMETER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL_FEATURE_COUNT = ArduinoDiffMMPackage.PARAMETER_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PARAMETER_CALL_OPERATION_COUNT = ArduinoDiffMMPackage.PARAMETER_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DomainSpecificDiffImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DomainSpecificDiff()
	 * @generated
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__NAME = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__NAME;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Hardware</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_HARDWARE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PLATFORM;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Digital Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DIGITAL_PIN;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PIN;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Analog Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_ANALOG_PIN;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Sketch</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SKETCH;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_STATUS;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_LEVEL;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Module Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MODULE_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONTROL;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Utilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_UTILITIES;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff IO</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IO;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Delay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_DELAY;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Input Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_INPUT_MODULE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Output Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_OUTPUT_MODULE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Named Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Repeat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_REPEAT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SENSOR;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff While</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_WHILE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Math Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_MATH_OPERATOR;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VARIABLE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_SET;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Numerical Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_NUMERICAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Boolean Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_BOOLEAN_OPERATOR;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Constant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_CONSTANT;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff If</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_IF;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_DEFINITION;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Function Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_FUNCTION_CALL;

	/**
	 * The feature id for the '<em><b>Domain Specific Diff Parameter Call</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF__DOMAIN_SPECIFIC_DIFF_PARAMETER_CALL;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Domain Specific Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT = ArduinoDiffMMPackage.DOMAIN_SPECIFIC_DIFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffHardwareImpl <em>Pattern Diff Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffHardwareImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware()
	 * @generated
	 */
	int PATTERN_DIFF_HARDWARE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__NAME = ArduinoDiffMMPackage.DIFF_HARDWARE__NAME;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__PLATFORMS = ArduinoDiffMMPackage.DIFF_HARDWARE__PLATFORMS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__MODULES = ArduinoDiffMMPackage.DIFF_HARDWARE__MODULES;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__CONNECTORS = ArduinoDiffMMPackage.DIFF_HARDWARE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Diffplatforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__DIFFPLATFORMS = ArduinoDiffMMPackage.DIFF_HARDWARE__DIFFPLATFORMS;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__DIFFMODULES = ArduinoDiffMMPackage.DIFF_HARDWARE__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__DIFFCONNECTORS = ArduinoDiffMMPackage.DIFF_HARDWARE__DIFFCONNECTORS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__OPERATION = ArduinoDiffMMPackage.DIFF_HARDWARE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__NEW_NAME = ArduinoDiffMMPackage.DIFF_HARDWARE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_platformsImpl <em>Pattern Diff Hardware platforms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffHardware_platformsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_platforms()
	 * @generated
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS = 38;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS__OPERATION = ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS__ETYPE = ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Hardware platforms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Hardware platforms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_PLATFORMS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_PLATFORMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_modulesImpl <em>Pattern Diff Hardware modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffHardware_modulesImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_modules()
	 * @generated
	 */
	int PATTERN_DIFF_HARDWARE_MODULES = 39;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_MODULES__OPERATION = ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_MODULES__ETYPE = ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_MODULES__ID_PATTERN = ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Hardware modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_MODULES_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Hardware modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_MODULES_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_MODULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_connectorsImpl <em>Pattern Diff Hardware connectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffHardware_connectorsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_connectors()
	 * @generated
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS = 40;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS__OPERATION = ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS__ETYPE = ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Hardware connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Hardware connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_HARDWARE_CONNECTORS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_HARDWARE_CONNECTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatformImpl <em>Pattern Diff Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffPlatformImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform()
	 * @generated
	 */
	int PATTERN_DIFF_PLATFORM = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__NAME = ArduinoDiffMMPackage.DIFF_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__DIGITAL_PINS = ArduinoDiffMMPackage.DIFF_PLATFORM__DIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__ANALOG_PINS = ArduinoDiffMMPackage.DIFF_PLATFORM__ANALOG_PINS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__IMAGE = ArduinoDiffMMPackage.DIFF_PLATFORM__IMAGE;

	/**
	 * The feature id for the '<em><b>Diffdigital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__DIFFDIGITAL_PINS = ArduinoDiffMMPackage.DIFF_PLATFORM__DIFFDIGITAL_PINS;

	/**
	 * The feature id for the '<em><b>Diffanalog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__DIFFANALOG_PINS = ArduinoDiffMMPackage.DIFF_PLATFORM__DIFFANALOG_PINS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__OPERATION = ArduinoDiffMMPackage.DIFF_PLATFORM__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__NEW_NAME = ArduinoDiffMMPackage.DIFF_PLATFORM__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__NEW_IMAGE = ArduinoDiffMMPackage.DIFF_PLATFORM__NEW_IMAGE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatform_digitalPinsImpl <em>Pattern Diff Platform digital Pins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffPlatform_digitalPinsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform_digitalPins()
	 * @generated
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS = 42;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS__OPERATION = ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS__ETYPE = ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Platform digital Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Platform digital Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_DIGITAL_PINS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_DIGITAL_PINS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatform_analogPinsImpl <em>Pattern Diff Platform analog Pins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffPlatform_analogPinsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform_analogPins()
	 * @generated
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS = 43;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS__OPERATION = ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS__ETYPE = ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Platform analog Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Platform analog Pins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PLATFORM_ANALOG_PINS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PLATFORM_ANALOG_PINS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffDigitalPinImpl <em>Pattern Diff Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffDigitalPinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffDigitalPin()
	 * @generated
	 */
	int PATTERN_DIFF_DIGITAL_PIN = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN__ID = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN__OPERATION = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN__NEW_ID = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN__ID_PATTERN = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DIGITAL_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_DIGITAL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffAnalogPinImpl <em>Pattern Diff Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffAnalogPinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffAnalogPin()
	 * @generated
	 */
	int PATTERN_DIFF_ANALOG_PIN = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN__ID = ArduinoDiffMMPackage.DIFF_ANALOG_PIN__ID;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN__OPERATION = ArduinoDiffMMPackage.DIFF_ANALOG_PIN__OPERATION;

	/**
	 * The feature id for the '<em><b>New id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN__NEW_ID = ArduinoDiffMMPackage.DIFF_ANALOG_PIN__NEW_ID;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN__ID_PATTERN = ArduinoDiffMMPackage.DIFF_ANALOG_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_ANALOG_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_ANALOG_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_ANALOG_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSketchImpl <em>Pattern Diff Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSketchImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch()
	 * @generated
	 */
	int PATTERN_DIFF_SKETCH = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__NAME = ArduinoDiffMMPackage.DIFF_SKETCH__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__PREVIOUS = ArduinoDiffMMPackage.DIFF_SKETCH__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__NEXT = ArduinoDiffMMPackage.DIFF_SKETCH__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_SKETCH__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__DIFFNEXT = ArduinoDiffMMPackage.DIFF_SKETCH__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__HARDWARE = ArduinoDiffMMPackage.DIFF_SKETCH__HARDWARE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__INSTRUCTIONS = ArduinoDiffMMPackage.DIFF_SKETCH__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__FUNCTIONS = ArduinoDiffMMPackage.DIFF_SKETCH__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__DIFFHARDWARE = ArduinoDiffMMPackage.DIFF_SKETCH__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.DIFF_SKETCH__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Difffunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__DIFFFUNCTIONS = ArduinoDiffMMPackage.DIFF_SKETCH__DIFFFUNCTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__OPERATION = ArduinoDiffMMPackage.DIFF_SKETCH__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__NEW_NAME = ArduinoDiffMMPackage.DIFF_SKETCH__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SKETCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_hardwareImpl <em>Pattern Diff Sketch hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSketch_hardwareImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_hardware()
	 * @generated
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE = 47;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE__OPERATION = ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE__ETYPE = ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sketch hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sketch hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_HARDWARE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_instructionsImpl <em>Pattern Diff Sketch instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSketch_instructionsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_instructions()
	 * @generated
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS = 48;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS__OPERATION = ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS__ETYPE = ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sketch instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sketch instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_INSTRUCTIONS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_functionsImpl <em>Pattern Diff Sketch functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSketch_functionsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_functions()
	 * @generated
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS = 49;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS__OPERATION = ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS__ETYPE = ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sketch functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sketch functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SKETCH_FUNCTIONS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SKETCH_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProjectImpl <em>Pattern Diff Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProjectImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT = 50;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__HARDWARE = ArduinoDiffMMPackage.DIFF_PROJECT__HARDWARE;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__SKETCH = ArduinoDiffMMPackage.DIFF_PROJECT__SKETCH;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__MODULES = ArduinoDiffMMPackage.DIFF_PROJECT__MODULES;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__PLATFORM = ArduinoDiffMMPackage.DIFF_PROJECT__PLATFORM;

	/**
	 * The feature id for the '<em><b>Domainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DOMAINSPECIFICDIFFS = ArduinoDiffMMPackage.DIFF_PROJECT__DOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Diffhardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DIFFHARDWARE = ArduinoDiffMMPackage.DIFF_PROJECT__DIFFHARDWARE;

	/**
	 * The feature id for the '<em><b>Diffsketch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DIFFSKETCH = ArduinoDiffMMPackage.DIFF_PROJECT__DIFFSKETCH;

	/**
	 * The feature id for the '<em><b>Diffmodules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DIFFMODULES = ArduinoDiffMMPackage.DIFF_PROJECT__DIFFMODULES;

	/**
	 * The feature id for the '<em><b>Diffplatform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DIFFPLATFORM = ArduinoDiffMMPackage.DIFF_PROJECT__DIFFPLATFORM;

	/**
	 * The feature id for the '<em><b>Diffdomainspecificdiffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__DIFFDOMAINSPECIFICDIFFS = ArduinoDiffMMPackage.DIFF_PROJECT__DIFFDOMAINSPECIFICDIFFS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_hardwareImpl <em>Pattern Diff Project hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProject_hardwareImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_hardware()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE = 51;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE__ETYPE = ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_HARDWARE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_sketchImpl <em>Pattern Diff Project sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProject_sketchImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_sketch()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT_SKETCH = 52;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_SKETCH__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_SKETCH__ETYPE = ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_SKETCH__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_SKETCH_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_SKETCH_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_SKETCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_modulesImpl <em>Pattern Diff Project modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProject_modulesImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_modules()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT_MODULES = 53;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_MODULES__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT_MODULES__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_MODULES__ETYPE = ArduinoDiffMMPackage.DIFF_PROJECT_MODULES__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_MODULES__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_MODULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_MODULES_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_MODULES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_MODULES_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_MODULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_platformImpl <em>Pattern Diff Project platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProject_platformImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_platform()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM = 54;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM__ETYPE = ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_PLATFORM_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_domainspecificdiffsImpl <em>Pattern Diff Project domainspecificdiffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffProject_domainspecificdiffsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_domainspecificdiffs()
	 * @generated
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS = 55;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS__OPERATION = ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS__ETYPE = ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Project domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Project domainspecificdiffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PROJECT_DOMAINSPECIFICDIFFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffInstruction_previousImpl <em>Pattern Diff Instruction previous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffInstruction_previousImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInstruction_previous()
	 * @generated
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS = 56;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS__OPERATION = ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS__ETYPE = ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Instruction previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Instruction previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_PREVIOUS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_INSTRUCTION_PREVIOUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffInstruction_nextImpl <em>Pattern Diff Instruction next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffInstruction_nextImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInstruction_next()
	 * @generated
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT = 57;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT__OPERATION = ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT__ETYPE = ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Instruction next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Instruction next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INSTRUCTION_NEXT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_INSTRUCTION_NEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffStatusImpl <em>Pattern Diff Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffStatusImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffStatus()
	 * @generated
	 */
	int PATTERN_DIFF_STATUS = 58;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__PREVIOUS = ArduinoDiffMMPackage.DIFF_STATUS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__NEXT = ArduinoDiffMMPackage.DIFF_STATUS__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_STATUS__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DIFFNEXT = ArduinoDiffMMPackage.DIFF_STATUS__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DEFINITION = ArduinoDiffMMPackage.DIFF_STATUS__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_STATUS__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__MODULE = ArduinoDiffMMPackage.DIFF_STATUS__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DIFFMODULE = ArduinoDiffMMPackage.DIFF_STATUS__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__VALUE = ArduinoDiffMMPackage.DIFF_STATUS__VALUE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__STATUS = ArduinoDiffMMPackage.DIFF_STATUS__STATUS;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__SENSOR = ArduinoDiffMMPackage.DIFF_STATUS__SENSOR;

	/**
	 * The feature id for the '<em><b>Diffsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__DIFFSENSOR = ArduinoDiffMMPackage.DIFF_STATUS__DIFFSENSOR;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__OPERATION = ArduinoDiffMMPackage.DIFF_STATUS__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__NEW_VALUE = ArduinoDiffMMPackage.DIFF_STATUS__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__NEW_STATUS = ArduinoDiffMMPackage.DIFF_STATUS__NEW_STATUS;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffStatus_sensorImpl <em>Pattern Diff Status sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffStatus_sensorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffStatus_sensor()
	 * @generated
	 */
	int PATTERN_DIFF_STATUS_SENSOR = 59;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_SENSOR__OPERATION = ArduinoDiffMMPackage.DIFF_STATUS_SENSOR__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_SENSOR__ETYPE = ArduinoDiffMMPackage.DIFF_STATUS_SENSOR__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_SENSOR__ID_PATTERN = ArduinoDiffMMPackage.DIFF_STATUS_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Status sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_SENSOR_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_STATUS_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Status sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_STATUS_SENSOR_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_STATUS_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffLevelImpl <em>Pattern Diff Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffLevelImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffLevel()
	 * @generated
	 */
	int PATTERN_DIFF_LEVEL = 60;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__PREVIOUS = ArduinoDiffMMPackage.DIFF_LEVEL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__NEXT = ArduinoDiffMMPackage.DIFF_LEVEL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_LEVEL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DIFFNEXT = ArduinoDiffMMPackage.DIFF_LEVEL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DEFINITION = ArduinoDiffMMPackage.DIFF_LEVEL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_LEVEL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__MODULE = ArduinoDiffMMPackage.DIFF_LEVEL__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DIFFMODULE = ArduinoDiffMMPackage.DIFF_LEVEL__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__LEVEL = ArduinoDiffMMPackage.DIFF_LEVEL__LEVEL;

	/**
	 * The feature id for the '<em><b>Difflevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__DIFFLEVEL = ArduinoDiffMMPackage.DIFF_LEVEL__DIFFLEVEL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__OPERATION = ArduinoDiffMMPackage.DIFF_LEVEL__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL__ID_PATTERN = ArduinoDiffMMPackage.DIFF_LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_LEVEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffLevel_levelImpl <em>Pattern Diff Level level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffLevel_levelImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffLevel_level()
	 * @generated
	 */
	int PATTERN_DIFF_LEVEL_LEVEL = 61;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_LEVEL__OPERATION = ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_LEVEL__ETYPE = ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_LEVEL__ID_PATTERN = ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Level level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_LEVEL_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Level level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_LEVEL_LEVEL_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_LEVEL_LEVEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffModuleInstruction_moduleImpl <em>Pattern Diff Module Instruction module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffModuleInstruction_moduleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffModuleInstruction_module()
	 * @generated
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE = 62;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE__OPERATION = ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE__ETYPE = ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Module Instruction module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Module Instruction module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MODULE_INSTRUCTION_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_MODULE_INSTRUCTION_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffControl_instructionsImpl <em>Pattern Diff Control instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffControl_instructionsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffControl_instructions()
	 * @generated
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS = 63;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS__OPERATION = ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS__ETYPE = ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Control instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Control instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONTROL_INSTRUCTIONS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_CONTROL_INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffDelayImpl <em>Pattern Diff Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffDelayImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffDelay()
	 * @generated
	 */
	int PATTERN_DIFF_DELAY = 64;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__PREVIOUS = ArduinoDiffMMPackage.DIFF_DELAY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__NEXT = ArduinoDiffMMPackage.DIFF_DELAY__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_DELAY__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__DIFFNEXT = ArduinoDiffMMPackage.DIFF_DELAY__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__DEFINITION = ArduinoDiffMMPackage.DIFF_DELAY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_DELAY__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__UNIT = ArduinoDiffMMPackage.DIFF_DELAY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__VALUE = ArduinoDiffMMPackage.DIFF_DELAY__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__OPERATION = ArduinoDiffMMPackage.DIFF_DELAY__OPERATION;

	/**
	 * The feature id for the '<em><b>New unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__NEW_UNIT = ArduinoDiffMMPackage.DIFF_DELAY__NEW_UNIT;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__NEW_VALUE = ArduinoDiffMMPackage.DIFF_DELAY__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY__ID_PATTERN = ArduinoDiffMMPackage.DIFF_DELAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_DELAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_DELAY_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_DELAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffInputModuleImpl <em>Pattern Diff Input Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffInputModuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInputModule()
	 * @generated
	 */
	int PATTERN_DIFF_INPUT_MODULE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NAME = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__KIND = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__IMAGE = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__LEVEL = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__LIBRARY = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__OPERATION = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NEW_NAME = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NEW_KIND = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NEW_KIND;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NEW_IMAGE = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NEW_IMAGE;

	/**
	 * The feature id for the '<em><b>New level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NEW_LEVEL = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NEW_LEVEL;

	/**
	 * The feature id for the '<em><b>New library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__NEW_LIBRARY = ArduinoDiffMMPackage.DIFF_INPUT_MODULE__NEW_LIBRARY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_INPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_INPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Input Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_INPUT_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_INPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffOutputModuleImpl <em>Pattern Diff Output Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffOutputModuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffOutputModule()
	 * @generated
	 */
	int PATTERN_DIFF_OUTPUT_MODULE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NAME = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__KIND = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__KIND;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__IMAGE = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__IMAGE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__LEVEL = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__LEVEL;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__LIBRARY = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__OPERATION = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NEW_NAME = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>New kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NEW_KIND = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_KIND;

	/**
	 * The feature id for the '<em><b>New image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NEW_IMAGE = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_IMAGE;

	/**
	 * The feature id for the '<em><b>New level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NEW_LEVEL = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LEVEL;

	/**
	 * The feature id for the '<em><b>New library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__NEW_LIBRARY = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE__NEW_LIBRARY;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Output Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_OUTPUT_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_OUTPUT_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffConnectorImpl <em>Pattern Diff Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffConnectorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector()
	 * @generated
	 */
	int PATTERN_DIFF_CONNECTOR = 67;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__PIN = ArduinoDiffMMPackage.DIFF_CONNECTOR__PIN;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__MODULE = ArduinoDiffMMPackage.DIFF_CONNECTOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__DIFFPIN = ArduinoDiffMMPackage.DIFF_CONNECTOR__DIFFPIN;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__DIFFMODULE = ArduinoDiffMMPackage.DIFF_CONNECTOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__OPERATION = ArduinoDiffMMPackage.DIFF_CONNECTOR__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR__ID_PATTERN = ArduinoDiffMMPackage.DIFF_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffConnector_pinImpl <em>Pattern Diff Connector pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffConnector_pinImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector_pin()
	 * @generated
	 */
	int PATTERN_DIFF_CONNECTOR_PIN = 68;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_PIN__OPERATION = ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_PIN__ETYPE = ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_PIN__ID_PATTERN = ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Connector pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_PIN_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Connector pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_PIN_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffConnector_moduleImpl <em>Pattern Diff Connector module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffConnector_moduleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector_module()
	 * @generated
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE = 69;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE__OPERATION = ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE__ETYPE = ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Connector module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Connector module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONNECTOR_MODULE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_CONNECTOR_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffRepeatImpl <em>Pattern Diff Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffRepeatImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffRepeat()
	 * @generated
	 */
	int PATTERN_DIFF_REPEAT = 70;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__PREVIOUS = ArduinoDiffMMPackage.DIFF_REPEAT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__NEXT = ArduinoDiffMMPackage.DIFF_REPEAT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_REPEAT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__DIFFNEXT = ArduinoDiffMMPackage.DIFF_REPEAT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__INSTRUCTIONS = ArduinoDiffMMPackage.DIFF_REPEAT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.DIFF_REPEAT__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__ITERATION = ArduinoDiffMMPackage.DIFF_REPEAT__ITERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__OPERATION = ArduinoDiffMMPackage.DIFF_REPEAT__OPERATION;

	/**
	 * The feature id for the '<em><b>New iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__NEW_ITERATION = ArduinoDiffMMPackage.DIFF_REPEAT__NEW_ITERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_REPEAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_REPEAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_REPEAT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_REPEAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSensorImpl <em>Pattern Diff Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSensorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSensor()
	 * @generated
	 */
	int PATTERN_DIFF_SENSOR = 71;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__PREVIOUS = ArduinoDiffMMPackage.DIFF_SENSOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__NEXT = ArduinoDiffMMPackage.DIFF_SENSOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFNEXT = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DEFINITION = ArduinoDiffMMPackage.DIFF_SENSOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__MODULE = ArduinoDiffMMPackage.DIFF_SENSOR__MODULE;

	/**
	 * The feature id for the '<em><b>Diffmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFMODULE = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFMODULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__VALUE = ArduinoDiffMMPackage.DIFF_SENSOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__LEFT = ArduinoDiffMMPackage.DIFF_SENSOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__RIGHT = ArduinoDiffMMPackage.DIFF_SENSOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__OPERATOR = ArduinoDiffMMPackage.DIFF_SENSOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFLEFT = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFRIGHT = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__STATUS = ArduinoDiffMMPackage.DIFF_SENSOR__STATUS;

	/**
	 * The feature id for the '<em><b>Diffstatus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__DIFFSTATUS = ArduinoDiffMMPackage.DIFF_SENSOR__DIFFSTATUS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__OPERATION = ArduinoDiffMMPackage.DIFF_SENSOR__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__NEW_VALUE = ArduinoDiffMMPackage.DIFF_SENSOR__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__NEW_OPERATOR = ArduinoDiffMMPackage.DIFF_SENSOR__NEW_OPERATOR;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSensor_statusImpl <em>Pattern Diff Sensor status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSensor_statusImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSensor_status()
	 * @generated
	 */
	int PATTERN_DIFF_SENSOR_STATUS = 72;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_STATUS__OPERATION = ArduinoDiffMMPackage.DIFF_SENSOR_STATUS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_STATUS__ETYPE = ArduinoDiffMMPackage.DIFF_SENSOR_STATUS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_STATUS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SENSOR_STATUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Sensor status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_STATUS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SENSOR_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Sensor status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SENSOR_STATUS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SENSOR_STATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffWhileImpl <em>Pattern Diff While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffWhileImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffWhile()
	 * @generated
	 */
	int PATTERN_DIFF_WHILE = 73;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__PREVIOUS = ArduinoDiffMMPackage.DIFF_WHILE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__NEXT = ArduinoDiffMMPackage.DIFF_WHILE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_WHILE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__DIFFNEXT = ArduinoDiffMMPackage.DIFF_WHILE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__INSTRUCTIONS = ArduinoDiffMMPackage.DIFF_WHILE__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.DIFF_WHILE__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__CONDITION = ArduinoDiffMMPackage.DIFF_WHILE__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__DIFFCONDITION = ArduinoDiffMMPackage.DIFF_WHILE__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__OPERATION = ArduinoDiffMMPackage.DIFF_WHILE__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_WHILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_WHILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_WHILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffWhile_conditionImpl <em>Pattern Diff While condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffWhile_conditionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffWhile_condition()
	 * @generated
	 */
	int PATTERN_DIFF_WHILE_CONDITION = 74;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_CONDITION__OPERATION = ArduinoDiffMMPackage.DIFF_WHILE_CONDITION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_CONDITION__ETYPE = ArduinoDiffMMPackage.DIFF_WHILE_CONDITION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_CONDITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_WHILE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff While condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_CONDITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_WHILE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff While condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_WHILE_CONDITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_WHILE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffMathOperator_leftImpl <em>Pattern Diff Math Operator left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffMathOperator_leftImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffMathOperator_left()
	 * @generated
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT = 75;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT__OPERATION = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT__ETYPE = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Math Operator left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Math Operator left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_LEFT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_LEFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffMathOperator_rightImpl <em>Pattern Diff Math Operator right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffMathOperator_rightImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffMathOperator_right()
	 * @generated
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT = 76;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT__OPERATION = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT__ETYPE = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Math Operator right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Math Operator right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_MATH_OPERATOR_RIGHT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_MATH_OPERATOR_RIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffVariableImpl <em>Pattern Diff Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffVariableImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffVariable()
	 * @generated
	 */
	int PATTERN_DIFF_VARIABLE = 77;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__PREVIOUS = ArduinoDiffMMPackage.DIFF_VARIABLE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__NEXT = ArduinoDiffMMPackage.DIFF_VARIABLE__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_VARIABLE__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__DIFFNEXT = ArduinoDiffMMPackage.DIFF_VARIABLE__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__DEFINITION = ArduinoDiffMMPackage.DIFF_VARIABLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_VARIABLE__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__VALUE = ArduinoDiffMMPackage.DIFF_VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__NAME = ArduinoDiffMMPackage.DIFF_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__OPERATION = ArduinoDiffMMPackage.DIFF_VARIABLE__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__NEW_VALUE = ArduinoDiffMMPackage.DIFF_VARIABLE__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__NEW_NAME = ArduinoDiffMMPackage.DIFF_VARIABLE__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_VARIABLE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSetImpl <em>Pattern Diff Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSetImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet()
	 * @generated
	 */
	int PATTERN_DIFF_SET = 78;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__PREVIOUS = ArduinoDiffMMPackage.DIFF_SET__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__NEXT = ArduinoDiffMMPackage.DIFF_SET__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_SET__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__DIFFNEXT = ArduinoDiffMMPackage.DIFF_SET__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__VARIABLE = ArduinoDiffMMPackage.DIFF_SET__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__VALUE = ArduinoDiffMMPackage.DIFF_SET__VALUE;

	/**
	 * The feature id for the '<em><b>Diffvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__DIFFVARIABLE = ArduinoDiffMMPackage.DIFF_SET__DIFFVARIABLE;

	/**
	 * The feature id for the '<em><b>Diffvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__DIFFVALUE = ArduinoDiffMMPackage.DIFF_SET__DIFFVALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__OPERATION = ArduinoDiffMMPackage.DIFF_SET__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSet_variableImpl <em>Pattern Diff Set variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSet_variableImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet_variable()
	 * @generated
	 */
	int PATTERN_DIFF_SET_VARIABLE = 79;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VARIABLE__OPERATION = ArduinoDiffMMPackage.DIFF_SET_VARIABLE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VARIABLE__ETYPE = ArduinoDiffMMPackage.DIFF_SET_VARIABLE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VARIABLE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SET_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Set variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VARIABLE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SET_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Set variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VARIABLE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SET_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffSet_valueImpl <em>Pattern Diff Set value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffSet_valueImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet_value()
	 * @generated
	 */
	int PATTERN_DIFF_SET_VALUE = 80;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VALUE__OPERATION = ArduinoDiffMMPackage.DIFF_SET_VALUE__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VALUE__ETYPE = ArduinoDiffMMPackage.DIFF_SET_VALUE__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VALUE__ID_PATTERN = ArduinoDiffMMPackage.DIFF_SET_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Set value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VALUE_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_SET_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Set value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_SET_VALUE_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_SET_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffNumericalOperatorImpl <em>Pattern Diff Numerical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffNumericalOperatorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffNumericalOperator()
	 * @generated
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR = 81;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__PREVIOUS = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__NEXT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DIFFNEXT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DEFINITION = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__VALUE = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__LEFT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__RIGHT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__OPERATOR = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DIFFLEFT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__DIFFRIGHT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__OPERATION = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__NEW_VALUE = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__NEW_OPERATOR = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR__NEW_OPERATOR;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR__ID_PATTERN = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Numerical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_NUMERICAL_OPERATOR_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_NUMERICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffBooleanOperatorImpl <em>Pattern Diff Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffBooleanOperatorImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffBooleanOperator()
	 * @generated
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR = 82;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__PREVIOUS = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__NEXT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DIFFNEXT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DEFINITION = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__VALUE = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__VALUE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__LEFT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__RIGHT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__OPERATOR = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Diffleft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DIFFLEFT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DIFFLEFT;

	/**
	 * The feature id for the '<em><b>Diffright</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__DIFFRIGHT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__DIFFRIGHT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__OPERATION = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__NEW_VALUE = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>New operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__NEW_OPERATOR = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR__NEW_OPERATOR;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR__ID_PATTERN = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_BOOLEAN_OPERATOR_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_BOOLEAN_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffConstantImpl <em>Pattern Diff Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffConstantImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConstant()
	 * @generated
	 */
	int PATTERN_DIFF_CONSTANT = 83;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__PREVIOUS = ArduinoDiffMMPackage.DIFF_CONSTANT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__NEXT = ArduinoDiffMMPackage.DIFF_CONSTANT__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_CONSTANT__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__DIFFNEXT = ArduinoDiffMMPackage.DIFF_CONSTANT__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__DEFINITION = ArduinoDiffMMPackage.DIFF_CONSTANT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_CONSTANT__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__VALUE = ArduinoDiffMMPackage.DIFF_CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__OPERATION = ArduinoDiffMMPackage.DIFF_CONSTANT__OPERATION;

	/**
	 * The feature id for the '<em><b>New value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__NEW_VALUE = ArduinoDiffMMPackage.DIFF_CONSTANT__NEW_VALUE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT__ID_PATTERN = ArduinoDiffMMPackage.DIFF_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_CONSTANT_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffIfImpl <em>Pattern Diff If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffIfImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffIf()
	 * @generated
	 */
	int PATTERN_DIFF_IF = 84;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__PREVIOUS = ArduinoDiffMMPackage.DIFF_IF__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__NEXT = ArduinoDiffMMPackage.DIFF_IF__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_IF__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__DIFFNEXT = ArduinoDiffMMPackage.DIFF_IF__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__INSTRUCTIONS = ArduinoDiffMMPackage.DIFF_IF__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.DIFF_IF__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__CONDITION = ArduinoDiffMMPackage.DIFF_IF__CONDITION;

	/**
	 * The feature id for the '<em><b>Diffcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__DIFFCONDITION = ArduinoDiffMMPackage.DIFF_IF__DIFFCONDITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__OPERATION = ArduinoDiffMMPackage.DIFF_IF__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF__ID_PATTERN = ArduinoDiffMMPackage.DIFF_IF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_IF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffIf_conditionImpl <em>Pattern Diff If condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffIf_conditionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffIf_condition()
	 * @generated
	 */
	int PATTERN_DIFF_IF_CONDITION = 85;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_CONDITION__OPERATION = ArduinoDiffMMPackage.DIFF_IF_CONDITION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_CONDITION__ETYPE = ArduinoDiffMMPackage.DIFF_IF_CONDITION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_CONDITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_IF_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff If condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_CONDITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_IF_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff If condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_IF_CONDITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_IF_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionImpl <em>Pattern Diff Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunctionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__NAME = ArduinoDiffMMPackage.DIFF_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Param Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__PARAM_DEFS = ArduinoDiffMMPackage.DIFF_FUNCTION__PARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__INSTRUCTIONS = ArduinoDiffMMPackage.DIFF_FUNCTION__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Diffparam Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__DIFFPARAM_DEFS = ArduinoDiffMMPackage.DIFF_FUNCTION__DIFFPARAM_DEFS;

	/**
	 * The feature id for the '<em><b>Diffinstructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__DIFFINSTRUCTIONS = ArduinoDiffMMPackage.DIFF_FUNCTION__DIFFINSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION__OPERATION;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__NEW_NAME = ArduinoDiffMMPackage.DIFF_FUNCTION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunction_paramDefsImpl <em>Pattern Diff Function param Defs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunction_paramDefsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction_paramDefs()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS = 87;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS__ETYPE = ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function param Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function param Defs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_PARAM_DEFS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_PARAM_DEFS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunction_instructionsImpl <em>Pattern Diff Function instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunction_instructionsImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction_instructions()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS = 88;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS__ETYPE = ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_INSTRUCTIONS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl <em>Pattern Diff Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterDefinition()
	 * @generated
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION = 89;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__TYPE = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__NAME = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__OPERATION = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION__OPERATION;

	/**
	 * The feature id for the '<em><b>New type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__NEW_TYPE = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION__NEW_TYPE;

	/**
	 * The feature id for the '<em><b>New name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__NEW_NAME = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION__NEW_NAME;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_DEFINITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffParameter_to_definitionImpl <em>Pattern Diff Parameter to definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffParameter_to_definitionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameter_to_definition()
	 * @generated
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION = 90;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION__OPERATION = ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION__ETYPE = ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Parameter to definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Parameter to definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_TO_DEFINITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_TO_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCallImpl <em>Pattern Diff Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCallImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION_CALL = 91;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__PREVIOUS = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__NEXT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__DIFFNEXT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__DEFINITION = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__PARAMETERS = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Diffparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__DIFFPARAMETERS = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__DIFFPARAMETERS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCall_definitionImpl <em>Pattern Diff Function Call definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCall_definitionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall_definition()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION = 92;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION__ETYPE = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_DEFINITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCall_parametersImpl <em>Pattern Diff Function Call parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCall_parametersImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall_parameters()
	 * @generated
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS = 93;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS__OPERATION = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS__ETYPE = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS__ID_PATTERN = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Function Call parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Function Call parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_FUNCTION_CALL_PARAMETERS_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_FUNCTION_CALL_PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterCallImpl <em>Pattern Diff Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffParameterCallImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterCall()
	 * @generated
	 */
	int PATTERN_DIFF_PARAMETER_CALL = 94;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__PREVIOUS = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__NEXT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Diffprevious</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__DIFFPREVIOUS = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__DIFFPREVIOUS;

	/**
	 * The feature id for the '<em><b>Diffnext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__DIFFNEXT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__DIFFNEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__DEFINITION = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Diffdefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__DIFFDEFINITION = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__DIFFDEFINITION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__OPERATION = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL__OPERATION;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterCall_definitionImpl <em>Pattern Diff Parameter Call definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.Pattern_DiffParameterCall_definitionImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterCall_definition()
	 * @generated
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION = 95;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION__OPERATION = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION__OPERATION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION__ETYPE = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION__ETYPE;

	/**
	 * The feature id for the '<em><b>ID Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION__ID_PATTERN = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Diff Parameter Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION_FEATURE_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Diff Parameter Call definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_DIFF_PARAMETER_CALL_DEFINITION_OPERATION_COUNT = ArduinoDiffMMPackage.DIFF_PARAMETER_CALL_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoRuleMM.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoRuleMM.impl.RuleImpl
	 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Hardware <em>Pattern Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Hardware</em>'.
	 * @see arduinoRuleMM.Pattern_Hardware
	 * @generated
	 */
	EClass getPattern_Hardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Hardware#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Hardware#getID_Pattern()
	 * @see #getPattern_Hardware()
	 * @generated
	 */
	EAttribute getPattern_Hardware_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Platform <em>Pattern Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Platform</em>'.
	 * @see arduinoRuleMM.Pattern_Platform
	 * @generated
	 */
	EClass getPattern_Platform();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Platform#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Platform#getID_Pattern()
	 * @see #getPattern_Platform()
	 * @generated
	 */
	EAttribute getPattern_Platform_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Module <em>Pattern Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Module</em>'.
	 * @see arduinoRuleMM.Pattern_Module
	 * @generated
	 */
	EClass getPattern_Module();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Module#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Module#getID_Pattern()
	 * @see #getPattern_Module()
	 * @generated
	 */
	EAttribute getPattern_Module_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DigitalPin <em>Pattern Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Digital Pin</em>'.
	 * @see arduinoRuleMM.Pattern_DigitalPin
	 * @generated
	 */
	EClass getPattern_DigitalPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DigitalPin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DigitalPin#getID_Pattern()
	 * @see #getPattern_DigitalPin()
	 * @generated
	 */
	EAttribute getPattern_DigitalPin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Pin <em>Pattern Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Pin</em>'.
	 * @see arduinoRuleMM.Pattern_Pin
	 * @generated
	 */
	EClass getPattern_Pin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Pin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Pin#getID_Pattern()
	 * @see #getPattern_Pin()
	 * @generated
	 */
	EAttribute getPattern_Pin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_AnalogPin <em>Pattern Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Analog Pin</em>'.
	 * @see arduinoRuleMM.Pattern_AnalogPin
	 * @generated
	 */
	EClass getPattern_AnalogPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_AnalogPin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_AnalogPin#getID_Pattern()
	 * @see #getPattern_AnalogPin()
	 * @generated
	 */
	EAttribute getPattern_AnalogPin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Sketch <em>Pattern Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Sketch</em>'.
	 * @see arduinoRuleMM.Pattern_Sketch
	 * @generated
	 */
	EClass getPattern_Sketch();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Sketch#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Sketch#getID_Pattern()
	 * @see #getPattern_Sketch()
	 * @generated
	 */
	EAttribute getPattern_Sketch_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Project <em>Pattern Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Project</em>'.
	 * @see arduinoRuleMM.Pattern_Project
	 * @generated
	 */
	EClass getPattern_Project();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Project#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Project#getID_Pattern()
	 * @see #getPattern_Project()
	 * @generated
	 */
	EAttribute getPattern_Project_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Instruction <em>Pattern Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Instruction</em>'.
	 * @see arduinoRuleMM.Pattern_Instruction
	 * @generated
	 */
	EClass getPattern_Instruction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Instruction#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Instruction#getID_Pattern()
	 * @see #getPattern_Instruction()
	 * @generated
	 */
	EAttribute getPattern_Instruction_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Status <em>Pattern Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Status</em>'.
	 * @see arduinoRuleMM.Pattern_Status
	 * @generated
	 */
	EClass getPattern_Status();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Status#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Status#getID_Pattern()
	 * @see #getPattern_Status()
	 * @generated
	 */
	EAttribute getPattern_Status_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Level <em>Pattern Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Level</em>'.
	 * @see arduinoRuleMM.Pattern_Level
	 * @generated
	 */
	EClass getPattern_Level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Level#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Level#getID_Pattern()
	 * @see #getPattern_Level()
	 * @generated
	 */
	EAttribute getPattern_Level_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_ModuleInstruction <em>Pattern Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Module Instruction</em>'.
	 * @see arduinoRuleMM.Pattern_ModuleInstruction
	 * @generated
	 */
	EClass getPattern_ModuleInstruction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_ModuleInstruction#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_ModuleInstruction#getID_Pattern()
	 * @see #getPattern_ModuleInstruction()
	 * @generated
	 */
	EAttribute getPattern_ModuleInstruction_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Control <em>Pattern Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Control</em>'.
	 * @see arduinoRuleMM.Pattern_Control
	 * @generated
	 */
	EClass getPattern_Control();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Control#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Control#getID_Pattern()
	 * @see #getPattern_Control()
	 * @generated
	 */
	EAttribute getPattern_Control_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Utilities <em>Pattern Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Utilities</em>'.
	 * @see arduinoRuleMM.Pattern_Utilities
	 * @generated
	 */
	EClass getPattern_Utilities();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Utilities#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Utilities#getID_Pattern()
	 * @see #getPattern_Utilities()
	 * @generated
	 */
	EAttribute getPattern_Utilities_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_IO <em>Pattern IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern IO</em>'.
	 * @see arduinoRuleMM.Pattern_IO
	 * @generated
	 */
	EClass getPattern_IO();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_IO#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_IO#getID_Pattern()
	 * @see #getPattern_IO()
	 * @generated
	 */
	EAttribute getPattern_IO_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Delay <em>Pattern Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Delay</em>'.
	 * @see arduinoRuleMM.Pattern_Delay
	 * @generated
	 */
	EClass getPattern_Delay();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Delay#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Delay#getID_Pattern()
	 * @see #getPattern_Delay()
	 * @generated
	 */
	EAttribute getPattern_Delay_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_InputModule <em>Pattern Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Input Module</em>'.
	 * @see arduinoRuleMM.Pattern_InputModule
	 * @generated
	 */
	EClass getPattern_InputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_InputModule#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_InputModule#getID_Pattern()
	 * @see #getPattern_InputModule()
	 * @generated
	 */
	EAttribute getPattern_InputModule_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_OutputModule <em>Pattern Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Output Module</em>'.
	 * @see arduinoRuleMM.Pattern_OutputModule
	 * @generated
	 */
	EClass getPattern_OutputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_OutputModule#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_OutputModule#getID_Pattern()
	 * @see #getPattern_OutputModule()
	 * @generated
	 */
	EAttribute getPattern_OutputModule_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_NamedElement <em>Pattern Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Named Element</em>'.
	 * @see arduinoRuleMM.Pattern_NamedElement
	 * @generated
	 */
	EClass getPattern_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_NamedElement#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_NamedElement#getID_Pattern()
	 * @see #getPattern_NamedElement()
	 * @generated
	 */
	EAttribute getPattern_NamedElement_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Connector <em>Pattern Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Connector</em>'.
	 * @see arduinoRuleMM.Pattern_Connector
	 * @generated
	 */
	EClass getPattern_Connector();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Connector#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Connector#getID_Pattern()
	 * @see #getPattern_Connector()
	 * @generated
	 */
	EAttribute getPattern_Connector_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Repeat <em>Pattern Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Repeat</em>'.
	 * @see arduinoRuleMM.Pattern_Repeat
	 * @generated
	 */
	EClass getPattern_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Repeat#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Repeat#getID_Pattern()
	 * @see #getPattern_Repeat()
	 * @generated
	 */
	EAttribute getPattern_Repeat_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Sensor <em>Pattern Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Sensor</em>'.
	 * @see arduinoRuleMM.Pattern_Sensor
	 * @generated
	 */
	EClass getPattern_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Sensor#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Sensor#getID_Pattern()
	 * @see #getPattern_Sensor()
	 * @generated
	 */
	EAttribute getPattern_Sensor_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_While <em>Pattern While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern While</em>'.
	 * @see arduinoRuleMM.Pattern_While
	 * @generated
	 */
	EClass getPattern_While();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_While#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_While#getID_Pattern()
	 * @see #getPattern_While()
	 * @generated
	 */
	EAttribute getPattern_While_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_MathOperator <em>Pattern Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Math Operator</em>'.
	 * @see arduinoRuleMM.Pattern_MathOperator
	 * @generated
	 */
	EClass getPattern_MathOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_MathOperator#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_MathOperator#getID_Pattern()
	 * @see #getPattern_MathOperator()
	 * @generated
	 */
	EAttribute getPattern_MathOperator_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Variable <em>Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Variable</em>'.
	 * @see arduinoRuleMM.Pattern_Variable
	 * @generated
	 */
	EClass getPattern_Variable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Variable#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Variable#getID_Pattern()
	 * @see #getPattern_Variable()
	 * @generated
	 */
	EAttribute getPattern_Variable_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Set <em>Pattern Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Set</em>'.
	 * @see arduinoRuleMM.Pattern_Set
	 * @generated
	 */
	EClass getPattern_Set();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Set#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Set#getID_Pattern()
	 * @see #getPattern_Set()
	 * @generated
	 */
	EAttribute getPattern_Set_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_NumericalOperator <em>Pattern Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Numerical Operator</em>'.
	 * @see arduinoRuleMM.Pattern_NumericalOperator
	 * @generated
	 */
	EClass getPattern_NumericalOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_NumericalOperator#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_NumericalOperator#getID_Pattern()
	 * @see #getPattern_NumericalOperator()
	 * @generated
	 */
	EAttribute getPattern_NumericalOperator_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_BooleanOperator <em>Pattern Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Boolean Operator</em>'.
	 * @see arduinoRuleMM.Pattern_BooleanOperator
	 * @generated
	 */
	EClass getPattern_BooleanOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_BooleanOperator#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_BooleanOperator#getID_Pattern()
	 * @see #getPattern_BooleanOperator()
	 * @generated
	 */
	EAttribute getPattern_BooleanOperator_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Value <em>Pattern Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Value</em>'.
	 * @see arduinoRuleMM.Pattern_Value
	 * @generated
	 */
	EClass getPattern_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Value#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Value#getID_Pattern()
	 * @see #getPattern_Value()
	 * @generated
	 */
	EAttribute getPattern_Value_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Constant <em>Pattern Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Constant</em>'.
	 * @see arduinoRuleMM.Pattern_Constant
	 * @generated
	 */
	EClass getPattern_Constant();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Constant#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Constant#getID_Pattern()
	 * @see #getPattern_Constant()
	 * @generated
	 */
	EAttribute getPattern_Constant_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_If <em>Pattern If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern If</em>'.
	 * @see arduinoRuleMM.Pattern_If
	 * @generated
	 */
	EClass getPattern_If();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_If#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_If#getID_Pattern()
	 * @see #getPattern_If()
	 * @generated
	 */
	EAttribute getPattern_If_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Function <em>Pattern Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Function</em>'.
	 * @see arduinoRuleMM.Pattern_Function
	 * @generated
	 */
	EClass getPattern_Function();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Function#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Function#getID_Pattern()
	 * @see #getPattern_Function()
	 * @generated
	 */
	EAttribute getPattern_Function_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_ParameterDefinition <em>Pattern Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Parameter Definition</em>'.
	 * @see arduinoRuleMM.Pattern_ParameterDefinition
	 * @generated
	 */
	EClass getPattern_ParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_ParameterDefinition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_ParameterDefinition#getID_Pattern()
	 * @see #getPattern_ParameterDefinition()
	 * @generated
	 */
	EAttribute getPattern_ParameterDefinition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_Parameter <em>Pattern Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Parameter</em>'.
	 * @see arduinoRuleMM.Pattern_Parameter
	 * @generated
	 */
	EClass getPattern_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_Parameter#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_Parameter#getID_Pattern()
	 * @see #getPattern_Parameter()
	 * @generated
	 */
	EAttribute getPattern_Parameter_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_FunctionCall <em>Pattern Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Function Call</em>'.
	 * @see arduinoRuleMM.Pattern_FunctionCall
	 * @generated
	 */
	EClass getPattern_FunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_FunctionCall#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_FunctionCall#getID_Pattern()
	 * @see #getPattern_FunctionCall()
	 * @generated
	 */
	EAttribute getPattern_FunctionCall_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_ParameterCall <em>Pattern Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Parameter Call</em>'.
	 * @see arduinoRuleMM.Pattern_ParameterCall
	 * @generated
	 */
	EClass getPattern_ParameterCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_ParameterCall#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_ParameterCall#getID_Pattern()
	 * @see #getPattern_ParameterCall()
	 * @generated
	 */
	EAttribute getPattern_ParameterCall_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DomainSpecificDiff <em>Pattern Domain Specific Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Domain Specific Diff</em>'.
	 * @see arduinoRuleMM.Pattern_DomainSpecificDiff
	 * @generated
	 */
	EClass getPattern_DomainSpecificDiff();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DomainSpecificDiff#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DomainSpecificDiff#getID_Pattern()
	 * @see #getPattern_DomainSpecificDiff()
	 * @generated
	 */
	EAttribute getPattern_DomainSpecificDiff_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffHardware <em>Pattern Diff Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Hardware</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware
	 * @generated
	 */
	EClass getPattern_DiffHardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffHardware#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware#getID_Pattern()
	 * @see #getPattern_DiffHardware()
	 * @generated
	 */
	EAttribute getPattern_DiffHardware_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffHardware_platforms <em>Pattern Diff Hardware platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Hardware platforms</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_platforms
	 * @generated
	 */
	EClass getPattern_DiffHardware_platforms();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffHardware_platforms#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_platforms#getID_Pattern()
	 * @see #getPattern_DiffHardware_platforms()
	 * @generated
	 */
	EAttribute getPattern_DiffHardware_platforms_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffHardware_modules <em>Pattern Diff Hardware modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Hardware modules</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_modules
	 * @generated
	 */
	EClass getPattern_DiffHardware_modules();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffHardware_modules#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_modules#getID_Pattern()
	 * @see #getPattern_DiffHardware_modules()
	 * @generated
	 */
	EAttribute getPattern_DiffHardware_modules_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffHardware_connectors <em>Pattern Diff Hardware connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Hardware connectors</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_connectors
	 * @generated
	 */
	EClass getPattern_DiffHardware_connectors();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffHardware_connectors#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffHardware_connectors#getID_Pattern()
	 * @see #getPattern_DiffHardware_connectors()
	 * @generated
	 */
	EAttribute getPattern_DiffHardware_connectors_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffPlatform <em>Pattern Diff Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Platform</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform
	 * @generated
	 */
	EClass getPattern_DiffPlatform();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffPlatform#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform#getID_Pattern()
	 * @see #getPattern_DiffPlatform()
	 * @generated
	 */
	EAttribute getPattern_DiffPlatform_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins <em>Pattern Diff Platform digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Platform digital Pins</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_digitalPins
	 * @generated
	 */
	EClass getPattern_DiffPlatform_digitalPins();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffPlatform_digitalPins#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_digitalPins#getID_Pattern()
	 * @see #getPattern_DiffPlatform_digitalPins()
	 * @generated
	 */
	EAttribute getPattern_DiffPlatform_digitalPins_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffPlatform_analogPins <em>Pattern Diff Platform analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Platform analog Pins</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_analogPins
	 * @generated
	 */
	EClass getPattern_DiffPlatform_analogPins();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffPlatform_analogPins#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffPlatform_analogPins#getID_Pattern()
	 * @see #getPattern_DiffPlatform_analogPins()
	 * @generated
	 */
	EAttribute getPattern_DiffPlatform_analogPins_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffDigitalPin <em>Pattern Diff Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Digital Pin</em>'.
	 * @see arduinoRuleMM.Pattern_DiffDigitalPin
	 * @generated
	 */
	EClass getPattern_DiffDigitalPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffDigitalPin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffDigitalPin#getID_Pattern()
	 * @see #getPattern_DiffDigitalPin()
	 * @generated
	 */
	EAttribute getPattern_DiffDigitalPin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffAnalogPin <em>Pattern Diff Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Analog Pin</em>'.
	 * @see arduinoRuleMM.Pattern_DiffAnalogPin
	 * @generated
	 */
	EClass getPattern_DiffAnalogPin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffAnalogPin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffAnalogPin#getID_Pattern()
	 * @see #getPattern_DiffAnalogPin()
	 * @generated
	 */
	EAttribute getPattern_DiffAnalogPin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSketch <em>Pattern Diff Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sketch</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch
	 * @generated
	 */
	EClass getPattern_DiffSketch();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSketch#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch#getID_Pattern()
	 * @see #getPattern_DiffSketch()
	 * @generated
	 */
	EAttribute getPattern_DiffSketch_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSketch_hardware <em>Pattern Diff Sketch hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sketch hardware</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_hardware
	 * @generated
	 */
	EClass getPattern_DiffSketch_hardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSketch_hardware#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_hardware#getID_Pattern()
	 * @see #getPattern_DiffSketch_hardware()
	 * @generated
	 */
	EAttribute getPattern_DiffSketch_hardware_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSketch_instructions <em>Pattern Diff Sketch instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sketch instructions</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_instructions
	 * @generated
	 */
	EClass getPattern_DiffSketch_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSketch_instructions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_instructions#getID_Pattern()
	 * @see #getPattern_DiffSketch_instructions()
	 * @generated
	 */
	EAttribute getPattern_DiffSketch_instructions_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSketch_functions <em>Pattern Diff Sketch functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sketch functions</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_functions
	 * @generated
	 */
	EClass getPattern_DiffSketch_functions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSketch_functions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSketch_functions#getID_Pattern()
	 * @see #getPattern_DiffSketch_functions()
	 * @generated
	 */
	EAttribute getPattern_DiffSketch_functions_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject <em>Pattern Diff Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject
	 * @generated
	 */
	EClass getPattern_DiffProject();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject#getID_Pattern()
	 * @see #getPattern_DiffProject()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject_hardware <em>Pattern Diff Project hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project hardware</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_hardware
	 * @generated
	 */
	EClass getPattern_DiffProject_hardware();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject_hardware#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_hardware#getID_Pattern()
	 * @see #getPattern_DiffProject_hardware()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_hardware_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject_sketch <em>Pattern Diff Project sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project sketch</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_sketch
	 * @generated
	 */
	EClass getPattern_DiffProject_sketch();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject_sketch#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_sketch#getID_Pattern()
	 * @see #getPattern_DiffProject_sketch()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_sketch_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject_modules <em>Pattern Diff Project modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project modules</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_modules
	 * @generated
	 */
	EClass getPattern_DiffProject_modules();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject_modules#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_modules#getID_Pattern()
	 * @see #getPattern_DiffProject_modules()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_modules_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject_platform <em>Pattern Diff Project platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project platform</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_platform
	 * @generated
	 */
	EClass getPattern_DiffProject_platform();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject_platform#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_platform#getID_Pattern()
	 * @see #getPattern_DiffProject_platform()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_platform_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs <em>Pattern Diff Project domainspecificdiffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Project domainspecificdiffs</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs
	 * @generated
	 */
	EClass getPattern_DiffProject_domainspecificdiffs();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffProject_domainspecificdiffs#getID_Pattern()
	 * @see #getPattern_DiffProject_domainspecificdiffs()
	 * @generated
	 */
	EAttribute getPattern_DiffProject_domainspecificdiffs_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffInstruction_previous <em>Pattern Diff Instruction previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Instruction previous</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_previous
	 * @generated
	 */
	EClass getPattern_DiffInstruction_previous();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffInstruction_previous#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_previous#getID_Pattern()
	 * @see #getPattern_DiffInstruction_previous()
	 * @generated
	 */
	EAttribute getPattern_DiffInstruction_previous_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffInstruction_next <em>Pattern Diff Instruction next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Instruction next</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_next
	 * @generated
	 */
	EClass getPattern_DiffInstruction_next();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffInstruction_next#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInstruction_next#getID_Pattern()
	 * @see #getPattern_DiffInstruction_next()
	 * @generated
	 */
	EAttribute getPattern_DiffInstruction_next_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffStatus <em>Pattern Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Status</em>'.
	 * @see arduinoRuleMM.Pattern_DiffStatus
	 * @generated
	 */
	EClass getPattern_DiffStatus();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffStatus#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffStatus#getID_Pattern()
	 * @see #getPattern_DiffStatus()
	 * @generated
	 */
	EAttribute getPattern_DiffStatus_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffStatus_sensor <em>Pattern Diff Status sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Status sensor</em>'.
	 * @see arduinoRuleMM.Pattern_DiffStatus_sensor
	 * @generated
	 */
	EClass getPattern_DiffStatus_sensor();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffStatus_sensor#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffStatus_sensor#getID_Pattern()
	 * @see #getPattern_DiffStatus_sensor()
	 * @generated
	 */
	EAttribute getPattern_DiffStatus_sensor_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffLevel <em>Pattern Diff Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Level</em>'.
	 * @see arduinoRuleMM.Pattern_DiffLevel
	 * @generated
	 */
	EClass getPattern_DiffLevel();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffLevel#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffLevel#getID_Pattern()
	 * @see #getPattern_DiffLevel()
	 * @generated
	 */
	EAttribute getPattern_DiffLevel_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffLevel_level <em>Pattern Diff Level level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Level level</em>'.
	 * @see arduinoRuleMM.Pattern_DiffLevel_level
	 * @generated
	 */
	EClass getPattern_DiffLevel_level();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffLevel_level#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffLevel_level#getID_Pattern()
	 * @see #getPattern_DiffLevel_level()
	 * @generated
	 */
	EAttribute getPattern_DiffLevel_level_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffModuleInstruction_module <em>Pattern Diff Module Instruction module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Module Instruction module</em>'.
	 * @see arduinoRuleMM.Pattern_DiffModuleInstruction_module
	 * @generated
	 */
	EClass getPattern_DiffModuleInstruction_module();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffModuleInstruction_module#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffModuleInstruction_module#getID_Pattern()
	 * @see #getPattern_DiffModuleInstruction_module()
	 * @generated
	 */
	EAttribute getPattern_DiffModuleInstruction_module_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffControl_instructions <em>Pattern Diff Control instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Control instructions</em>'.
	 * @see arduinoRuleMM.Pattern_DiffControl_instructions
	 * @generated
	 */
	EClass getPattern_DiffControl_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffControl_instructions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffControl_instructions#getID_Pattern()
	 * @see #getPattern_DiffControl_instructions()
	 * @generated
	 */
	EAttribute getPattern_DiffControl_instructions_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffDelay <em>Pattern Diff Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Delay</em>'.
	 * @see arduinoRuleMM.Pattern_DiffDelay
	 * @generated
	 */
	EClass getPattern_DiffDelay();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffDelay#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffDelay#getID_Pattern()
	 * @see #getPattern_DiffDelay()
	 * @generated
	 */
	EAttribute getPattern_DiffDelay_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffInputModule <em>Pattern Diff Input Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Input Module</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInputModule
	 * @generated
	 */
	EClass getPattern_DiffInputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffInputModule#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffInputModule#getID_Pattern()
	 * @see #getPattern_DiffInputModule()
	 * @generated
	 */
	EAttribute getPattern_DiffInputModule_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffOutputModule <em>Pattern Diff Output Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Output Module</em>'.
	 * @see arduinoRuleMM.Pattern_DiffOutputModule
	 * @generated
	 */
	EClass getPattern_DiffOutputModule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffOutputModule#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffOutputModule#getID_Pattern()
	 * @see #getPattern_DiffOutputModule()
	 * @generated
	 */
	EAttribute getPattern_DiffOutputModule_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffConnector <em>Pattern Diff Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Connector</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector
	 * @generated
	 */
	EClass getPattern_DiffConnector();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffConnector#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector#getID_Pattern()
	 * @see #getPattern_DiffConnector()
	 * @generated
	 */
	EAttribute getPattern_DiffConnector_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffConnector_pin <em>Pattern Diff Connector pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Connector pin</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector_pin
	 * @generated
	 */
	EClass getPattern_DiffConnector_pin();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffConnector_pin#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector_pin#getID_Pattern()
	 * @see #getPattern_DiffConnector_pin()
	 * @generated
	 */
	EAttribute getPattern_DiffConnector_pin_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffConnector_module <em>Pattern Diff Connector module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Connector module</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector_module
	 * @generated
	 */
	EClass getPattern_DiffConnector_module();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffConnector_module#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConnector_module#getID_Pattern()
	 * @see #getPattern_DiffConnector_module()
	 * @generated
	 */
	EAttribute getPattern_DiffConnector_module_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffRepeat <em>Pattern Diff Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Repeat</em>'.
	 * @see arduinoRuleMM.Pattern_DiffRepeat
	 * @generated
	 */
	EClass getPattern_DiffRepeat();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffRepeat#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffRepeat#getID_Pattern()
	 * @see #getPattern_DiffRepeat()
	 * @generated
	 */
	EAttribute getPattern_DiffRepeat_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSensor <em>Pattern Diff Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sensor</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSensor
	 * @generated
	 */
	EClass getPattern_DiffSensor();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSensor#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSensor#getID_Pattern()
	 * @see #getPattern_DiffSensor()
	 * @generated
	 */
	EAttribute getPattern_DiffSensor_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSensor_status <em>Pattern Diff Sensor status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Sensor status</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSensor_status
	 * @generated
	 */
	EClass getPattern_DiffSensor_status();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSensor_status#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSensor_status#getID_Pattern()
	 * @see #getPattern_DiffSensor_status()
	 * @generated
	 */
	EAttribute getPattern_DiffSensor_status_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffWhile <em>Pattern Diff While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff While</em>'.
	 * @see arduinoRuleMM.Pattern_DiffWhile
	 * @generated
	 */
	EClass getPattern_DiffWhile();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffWhile#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffWhile#getID_Pattern()
	 * @see #getPattern_DiffWhile()
	 * @generated
	 */
	EAttribute getPattern_DiffWhile_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffWhile_condition <em>Pattern Diff While condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff While condition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffWhile_condition
	 * @generated
	 */
	EClass getPattern_DiffWhile_condition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffWhile_condition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffWhile_condition#getID_Pattern()
	 * @see #getPattern_DiffWhile_condition()
	 * @generated
	 */
	EAttribute getPattern_DiffWhile_condition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffMathOperator_left <em>Pattern Diff Math Operator left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Math Operator left</em>'.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_left
	 * @generated
	 */
	EClass getPattern_DiffMathOperator_left();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffMathOperator_left#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_left#getID_Pattern()
	 * @see #getPattern_DiffMathOperator_left()
	 * @generated
	 */
	EAttribute getPattern_DiffMathOperator_left_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffMathOperator_right <em>Pattern Diff Math Operator right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Math Operator right</em>'.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_right
	 * @generated
	 */
	EClass getPattern_DiffMathOperator_right();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffMathOperator_right#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffMathOperator_right#getID_Pattern()
	 * @see #getPattern_DiffMathOperator_right()
	 * @generated
	 */
	EAttribute getPattern_DiffMathOperator_right_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffVariable <em>Pattern Diff Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Variable</em>'.
	 * @see arduinoRuleMM.Pattern_DiffVariable
	 * @generated
	 */
	EClass getPattern_DiffVariable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffVariable#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffVariable#getID_Pattern()
	 * @see #getPattern_DiffVariable()
	 * @generated
	 */
	EAttribute getPattern_DiffVariable_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSet <em>Pattern Diff Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Set</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet
	 * @generated
	 */
	EClass getPattern_DiffSet();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSet#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet#getID_Pattern()
	 * @see #getPattern_DiffSet()
	 * @generated
	 */
	EAttribute getPattern_DiffSet_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSet_variable <em>Pattern Diff Set variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Set variable</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet_variable
	 * @generated
	 */
	EClass getPattern_DiffSet_variable();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSet_variable#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet_variable#getID_Pattern()
	 * @see #getPattern_DiffSet_variable()
	 * @generated
	 */
	EAttribute getPattern_DiffSet_variable_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffSet_value <em>Pattern Diff Set value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Set value</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet_value
	 * @generated
	 */
	EClass getPattern_DiffSet_value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffSet_value#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffSet_value#getID_Pattern()
	 * @see #getPattern_DiffSet_value()
	 * @generated
	 */
	EAttribute getPattern_DiffSet_value_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffNumericalOperator <em>Pattern Diff Numerical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Numerical Operator</em>'.
	 * @see arduinoRuleMM.Pattern_DiffNumericalOperator
	 * @generated
	 */
	EClass getPattern_DiffNumericalOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffNumericalOperator#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffNumericalOperator#getID_Pattern()
	 * @see #getPattern_DiffNumericalOperator()
	 * @generated
	 */
	EAttribute getPattern_DiffNumericalOperator_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffBooleanOperator <em>Pattern Diff Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Boolean Operator</em>'.
	 * @see arduinoRuleMM.Pattern_DiffBooleanOperator
	 * @generated
	 */
	EClass getPattern_DiffBooleanOperator();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffBooleanOperator#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffBooleanOperator#getID_Pattern()
	 * @see #getPattern_DiffBooleanOperator()
	 * @generated
	 */
	EAttribute getPattern_DiffBooleanOperator_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffConstant <em>Pattern Diff Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Constant</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConstant
	 * @generated
	 */
	EClass getPattern_DiffConstant();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffConstant#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffConstant#getID_Pattern()
	 * @see #getPattern_DiffConstant()
	 * @generated
	 */
	EAttribute getPattern_DiffConstant_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffIf <em>Pattern Diff If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff If</em>'.
	 * @see arduinoRuleMM.Pattern_DiffIf
	 * @generated
	 */
	EClass getPattern_DiffIf();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffIf#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffIf#getID_Pattern()
	 * @see #getPattern_DiffIf()
	 * @generated
	 */
	EAttribute getPattern_DiffIf_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffIf_condition <em>Pattern Diff If condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff If condition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffIf_condition
	 * @generated
	 */
	EClass getPattern_DiffIf_condition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffIf_condition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffIf_condition#getID_Pattern()
	 * @see #getPattern_DiffIf_condition()
	 * @generated
	 */
	EAttribute getPattern_DiffIf_condition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunction <em>Pattern Diff Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction
	 * @generated
	 */
	EClass getPattern_DiffFunction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunction#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction#getID_Pattern()
	 * @see #getPattern_DiffFunction()
	 * @generated
	 */
	EAttribute getPattern_DiffFunction_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunction_paramDefs <em>Pattern Diff Function param Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function param Defs</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction_paramDefs
	 * @generated
	 */
	EClass getPattern_DiffFunction_paramDefs();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunction_paramDefs#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction_paramDefs#getID_Pattern()
	 * @see #getPattern_DiffFunction_paramDefs()
	 * @generated
	 */
	EAttribute getPattern_DiffFunction_paramDefs_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunction_instructions <em>Pattern Diff Function instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function instructions</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction_instructions
	 * @generated
	 */
	EClass getPattern_DiffFunction_instructions();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunction_instructions#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunction_instructions#getID_Pattern()
	 * @see #getPattern_DiffFunction_instructions()
	 * @generated
	 */
	EAttribute getPattern_DiffFunction_instructions_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffParameterDefinition <em>Pattern Diff Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Parameter Definition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterDefinition
	 * @generated
	 */
	EClass getPattern_DiffParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffParameterDefinition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterDefinition#getID_Pattern()
	 * @see #getPattern_DiffParameterDefinition()
	 * @generated
	 */
	EAttribute getPattern_DiffParameterDefinition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffParameter_to_definition <em>Pattern Diff Parameter to definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Parameter to definition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameter_to_definition
	 * @generated
	 */
	EClass getPattern_DiffParameter_to_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffParameter_to_definition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameter_to_definition#getID_Pattern()
	 * @see #getPattern_DiffParameter_to_definition()
	 * @generated
	 */
	EAttribute getPattern_DiffParameter_to_definition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunctionCall <em>Pattern Diff Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function Call</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall
	 * @generated
	 */
	EClass getPattern_DiffFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunctionCall#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall#getID_Pattern()
	 * @see #getPattern_DiffFunctionCall()
	 * @generated
	 */
	EAttribute getPattern_DiffFunctionCall_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunctionCall_definition <em>Pattern Diff Function Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function Call definition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_definition
	 * @generated
	 */
	EClass getPattern_DiffFunctionCall_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunctionCall_definition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_definition#getID_Pattern()
	 * @see #getPattern_DiffFunctionCall_definition()
	 * @generated
	 */
	EAttribute getPattern_DiffFunctionCall_definition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffFunctionCall_parameters <em>Pattern Diff Function Call parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Function Call parameters</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_parameters
	 * @generated
	 */
	EClass getPattern_DiffFunctionCall_parameters();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffFunctionCall_parameters#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffFunctionCall_parameters#getID_Pattern()
	 * @see #getPattern_DiffFunctionCall_parameters()
	 * @generated
	 */
	EAttribute getPattern_DiffFunctionCall_parameters_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffParameterCall <em>Pattern Diff Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Parameter Call</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall
	 * @generated
	 */
	EClass getPattern_DiffParameterCall();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffParameterCall#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall#getID_Pattern()
	 * @see #getPattern_DiffParameterCall()
	 * @generated
	 */
	EAttribute getPattern_DiffParameterCall_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Pattern_DiffParameterCall_definition <em>Pattern Diff Parameter Call definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Diff Parameter Call definition</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall_definition
	 * @generated
	 */
	EClass getPattern_DiffParameterCall_definition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Pattern_DiffParameterCall_definition#getID_Pattern <em>ID Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Pattern</em>'.
	 * @see arduinoRuleMM.Pattern_DiffParameterCall_definition#getID_Pattern()
	 * @see #getPattern_DiffParameterCall_definition()
	 * @generated
	 */
	EAttribute getPattern_DiffParameterCall_definition_ID_Pattern();

	/**
	 * Returns the meta object for class '{@link arduinoRuleMM.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see arduinoRuleMM.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link arduinoRuleMM.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoRuleMM.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute list '{@link arduinoRuleMM.Rule#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see arduinoRuleMM.Rule#getConstraints()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoRuleMM.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see arduinoRuleMM.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoRuleMMFactory getArduinoRuleMMFactory();

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
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_HardwareImpl <em>Pattern Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_HardwareImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Hardware()
		 * @generated
		 */
		EClass PATTERN_HARDWARE = eINSTANCE.getPattern_Hardware();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_HARDWARE__ID_PATTERN = eINSTANCE.getPattern_Hardware_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_PlatformImpl <em>Pattern Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_PlatformImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Platform()
		 * @generated
		 */
		EClass PATTERN_PLATFORM = eINSTANCE.getPattern_Platform();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PLATFORM__ID_PATTERN = eINSTANCE.getPattern_Platform_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ModuleImpl <em>Pattern Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ModuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Module()
		 * @generated
		 */
		EClass PATTERN_MODULE = eINSTANCE.getPattern_Module();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_MODULE__ID_PATTERN = eINSTANCE.getPattern_Module_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DigitalPinImpl <em>Pattern Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DigitalPinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DigitalPin()
		 * @generated
		 */
		EClass PATTERN_DIGITAL_PIN = eINSTANCE.getPattern_DigitalPin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIGITAL_PIN__ID_PATTERN = eINSTANCE.getPattern_DigitalPin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_PinImpl <em>Pattern Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_PinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Pin()
		 * @generated
		 */
		EClass PATTERN_PIN = eINSTANCE.getPattern_Pin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PIN__ID_PATTERN = eINSTANCE.getPattern_Pin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_AnalogPinImpl <em>Pattern Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_AnalogPinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_AnalogPin()
		 * @generated
		 */
		EClass PATTERN_ANALOG_PIN = eINSTANCE.getPattern_AnalogPin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_ANALOG_PIN__ID_PATTERN = eINSTANCE.getPattern_AnalogPin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_SketchImpl <em>Pattern Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_SketchImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Sketch()
		 * @generated
		 */
		EClass PATTERN_SKETCH = eINSTANCE.getPattern_Sketch();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SKETCH__ID_PATTERN = eINSTANCE.getPattern_Sketch_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ProjectImpl <em>Pattern Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ProjectImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Project()
		 * @generated
		 */
		EClass PATTERN_PROJECT = eINSTANCE.getPattern_Project();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PROJECT__ID_PATTERN = eINSTANCE.getPattern_Project_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_InstructionImpl <em>Pattern Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_InstructionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Instruction()
		 * @generated
		 */
		EClass PATTERN_INSTRUCTION = eINSTANCE.getPattern_Instruction();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INSTRUCTION__ID_PATTERN = eINSTANCE.getPattern_Instruction_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_StatusImpl <em>Pattern Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_StatusImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Status()
		 * @generated
		 */
		EClass PATTERN_STATUS = eINSTANCE.getPattern_Status();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_STATUS__ID_PATTERN = eINSTANCE.getPattern_Status_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_LevelImpl <em>Pattern Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_LevelImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Level()
		 * @generated
		 */
		EClass PATTERN_LEVEL = eINSTANCE.getPattern_Level();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LEVEL__ID_PATTERN = eINSTANCE.getPattern_Level_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ModuleInstructionImpl <em>Pattern Module Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ModuleInstructionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ModuleInstruction()
		 * @generated
		 */
		EClass PATTERN_MODULE_INSTRUCTION = eINSTANCE.getPattern_ModuleInstruction();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_MODULE_INSTRUCTION__ID_PATTERN = eINSTANCE.getPattern_ModuleInstruction_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ControlImpl <em>Pattern Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ControlImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Control()
		 * @generated
		 */
		EClass PATTERN_CONTROL = eINSTANCE.getPattern_Control();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONTROL__ID_PATTERN = eINSTANCE.getPattern_Control_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_UtilitiesImpl <em>Pattern Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_UtilitiesImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Utilities()
		 * @generated
		 */
		EClass PATTERN_UTILITIES = eINSTANCE.getPattern_Utilities();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_UTILITIES__ID_PATTERN = eINSTANCE.getPattern_Utilities_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_IOImpl <em>Pattern IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_IOImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_IO()
		 * @generated
		 */
		EClass PATTERN_IO = eINSTANCE.getPattern_IO();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_IO__ID_PATTERN = eINSTANCE.getPattern_IO_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DelayImpl <em>Pattern Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DelayImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Delay()
		 * @generated
		 */
		EClass PATTERN_DELAY = eINSTANCE.getPattern_Delay();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DELAY__ID_PATTERN = eINSTANCE.getPattern_Delay_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_InputModuleImpl <em>Pattern Input Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_InputModuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_InputModule()
		 * @generated
		 */
		EClass PATTERN_INPUT_MODULE = eINSTANCE.getPattern_InputModule();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_INPUT_MODULE__ID_PATTERN = eINSTANCE.getPattern_InputModule_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_OutputModuleImpl <em>Pattern Output Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_OutputModuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_OutputModule()
		 * @generated
		 */
		EClass PATTERN_OUTPUT_MODULE = eINSTANCE.getPattern_OutputModule();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_OUTPUT_MODULE__ID_PATTERN = eINSTANCE.getPattern_OutputModule_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_NamedElementImpl <em>Pattern Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_NamedElementImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_NamedElement()
		 * @generated
		 */
		EClass PATTERN_NAMED_ELEMENT = eINSTANCE.getPattern_NamedElement();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NAMED_ELEMENT__ID_PATTERN = eINSTANCE.getPattern_NamedElement_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ConnectorImpl <em>Pattern Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ConnectorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Connector()
		 * @generated
		 */
		EClass PATTERN_CONNECTOR = eINSTANCE.getPattern_Connector();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONNECTOR__ID_PATTERN = eINSTANCE.getPattern_Connector_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_RepeatImpl <em>Pattern Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_RepeatImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Repeat()
		 * @generated
		 */
		EClass PATTERN_REPEAT = eINSTANCE.getPattern_Repeat();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_REPEAT__ID_PATTERN = eINSTANCE.getPattern_Repeat_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_SensorImpl <em>Pattern Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_SensorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Sensor()
		 * @generated
		 */
		EClass PATTERN_SENSOR = eINSTANCE.getPattern_Sensor();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SENSOR__ID_PATTERN = eINSTANCE.getPattern_Sensor_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_WhileImpl <em>Pattern While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_WhileImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_While()
		 * @generated
		 */
		EClass PATTERN_WHILE = eINSTANCE.getPattern_While();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_WHILE__ID_PATTERN = eINSTANCE.getPattern_While_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_MathOperatorImpl <em>Pattern Math Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_MathOperatorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_MathOperator()
		 * @generated
		 */
		EClass PATTERN_MATH_OPERATOR = eINSTANCE.getPattern_MathOperator();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_MATH_OPERATOR__ID_PATTERN = eINSTANCE.getPattern_MathOperator_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_VariableImpl <em>Pattern Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_VariableImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Variable()
		 * @generated
		 */
		EClass PATTERN_VARIABLE = eINSTANCE.getPattern_Variable();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_VARIABLE__ID_PATTERN = eINSTANCE.getPattern_Variable_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_SetImpl <em>Pattern Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_SetImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Set()
		 * @generated
		 */
		EClass PATTERN_SET = eINSTANCE.getPattern_Set();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SET__ID_PATTERN = eINSTANCE.getPattern_Set_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_NumericalOperatorImpl <em>Pattern Numerical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_NumericalOperatorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_NumericalOperator()
		 * @generated
		 */
		EClass PATTERN_NUMERICAL_OPERATOR = eINSTANCE.getPattern_NumericalOperator();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_NUMERICAL_OPERATOR__ID_PATTERN = eINSTANCE.getPattern_NumericalOperator_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_BooleanOperatorImpl <em>Pattern Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_BooleanOperatorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_BooleanOperator()
		 * @generated
		 */
		EClass PATTERN_BOOLEAN_OPERATOR = eINSTANCE.getPattern_BooleanOperator();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_BOOLEAN_OPERATOR__ID_PATTERN = eINSTANCE.getPattern_BooleanOperator_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ValueImpl <em>Pattern Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ValueImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Value()
		 * @generated
		 */
		EClass PATTERN_VALUE = eINSTANCE.getPattern_Value();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_VALUE__ID_PATTERN = eINSTANCE.getPattern_Value_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ConstantImpl <em>Pattern Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ConstantImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Constant()
		 * @generated
		 */
		EClass PATTERN_CONSTANT = eINSTANCE.getPattern_Constant();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_CONSTANT__ID_PATTERN = eINSTANCE.getPattern_Constant_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_IfImpl <em>Pattern If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_IfImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_If()
		 * @generated
		 */
		EClass PATTERN_IF = eINSTANCE.getPattern_If();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_IF__ID_PATTERN = eINSTANCE.getPattern_If_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_FunctionImpl <em>Pattern Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_FunctionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Function()
		 * @generated
		 */
		EClass PATTERN_FUNCTION = eINSTANCE.getPattern_Function();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FUNCTION__ID_PATTERN = eINSTANCE.getPattern_Function_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ParameterDefinitionImpl <em>Pattern Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ParameterDefinitionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ParameterDefinition()
		 * @generated
		 */
		EClass PATTERN_PARAMETER_DEFINITION = eINSTANCE.getPattern_ParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PARAMETER_DEFINITION__ID_PATTERN = eINSTANCE.getPattern_ParameterDefinition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ParameterImpl <em>Pattern Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ParameterImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_Parameter()
		 * @generated
		 */
		EClass PATTERN_PARAMETER = eINSTANCE.getPattern_Parameter();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PARAMETER__ID_PATTERN = eINSTANCE.getPattern_Parameter_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_FunctionCallImpl <em>Pattern Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_FunctionCallImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_FunctionCall()
		 * @generated
		 */
		EClass PATTERN_FUNCTION_CALL = eINSTANCE.getPattern_FunctionCall();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_FUNCTION_CALL__ID_PATTERN = eINSTANCE.getPattern_FunctionCall_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_ParameterCallImpl <em>Pattern Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_ParameterCallImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_ParameterCall()
		 * @generated
		 */
		EClass PATTERN_PARAMETER_CALL = eINSTANCE.getPattern_ParameterCall();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_PARAMETER_CALL__ID_PATTERN = eINSTANCE.getPattern_ParameterCall_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DomainSpecificDiffImpl <em>Pattern Domain Specific Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DomainSpecificDiffImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DomainSpecificDiff()
		 * @generated
		 */
		EClass PATTERN_DOMAIN_SPECIFIC_DIFF = eINSTANCE.getPattern_DomainSpecificDiff();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DOMAIN_SPECIFIC_DIFF__ID_PATTERN = eINSTANCE.getPattern_DomainSpecificDiff_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffHardwareImpl <em>Pattern Diff Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffHardwareImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware()
		 * @generated
		 */
		EClass PATTERN_DIFF_HARDWARE = eINSTANCE.getPattern_DiffHardware();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_HARDWARE__ID_PATTERN = eINSTANCE.getPattern_DiffHardware_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_platformsImpl <em>Pattern Diff Hardware platforms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffHardware_platformsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_platforms()
		 * @generated
		 */
		EClass PATTERN_DIFF_HARDWARE_PLATFORMS = eINSTANCE.getPattern_DiffHardware_platforms();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_HARDWARE_PLATFORMS__ID_PATTERN = eINSTANCE.getPattern_DiffHardware_platforms_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_modulesImpl <em>Pattern Diff Hardware modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffHardware_modulesImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_modules()
		 * @generated
		 */
		EClass PATTERN_DIFF_HARDWARE_MODULES = eINSTANCE.getPattern_DiffHardware_modules();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_HARDWARE_MODULES__ID_PATTERN = eINSTANCE.getPattern_DiffHardware_modules_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffHardware_connectorsImpl <em>Pattern Diff Hardware connectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffHardware_connectorsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffHardware_connectors()
		 * @generated
		 */
		EClass PATTERN_DIFF_HARDWARE_CONNECTORS = eINSTANCE.getPattern_DiffHardware_connectors();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_HARDWARE_CONNECTORS__ID_PATTERN = eINSTANCE.getPattern_DiffHardware_connectors_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatformImpl <em>Pattern Diff Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffPlatformImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLATFORM = eINSTANCE.getPattern_DiffPlatform();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLATFORM__ID_PATTERN = eINSTANCE.getPattern_DiffPlatform_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatform_digitalPinsImpl <em>Pattern Diff Platform digital Pins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffPlatform_digitalPinsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform_digitalPins()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLATFORM_DIGITAL_PINS = eINSTANCE.getPattern_DiffPlatform_digitalPins();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLATFORM_DIGITAL_PINS__ID_PATTERN = eINSTANCE.getPattern_DiffPlatform_digitalPins_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffPlatform_analogPinsImpl <em>Pattern Diff Platform analog Pins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffPlatform_analogPinsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffPlatform_analogPins()
		 * @generated
		 */
		EClass PATTERN_DIFF_PLATFORM_ANALOG_PINS = eINSTANCE.getPattern_DiffPlatform_analogPins();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PLATFORM_ANALOG_PINS__ID_PATTERN = eINSTANCE.getPattern_DiffPlatform_analogPins_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffDigitalPinImpl <em>Pattern Diff Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffDigitalPinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffDigitalPin()
		 * @generated
		 */
		EClass PATTERN_DIFF_DIGITAL_PIN = eINSTANCE.getPattern_DiffDigitalPin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_DIGITAL_PIN__ID_PATTERN = eINSTANCE.getPattern_DiffDigitalPin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffAnalogPinImpl <em>Pattern Diff Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffAnalogPinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffAnalogPin()
		 * @generated
		 */
		EClass PATTERN_DIFF_ANALOG_PIN = eINSTANCE.getPattern_DiffAnalogPin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_ANALOG_PIN__ID_PATTERN = eINSTANCE.getPattern_DiffAnalogPin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSketchImpl <em>Pattern Diff Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSketchImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch()
		 * @generated
		 */
		EClass PATTERN_DIFF_SKETCH = eINSTANCE.getPattern_DiffSketch();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SKETCH__ID_PATTERN = eINSTANCE.getPattern_DiffSketch_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_hardwareImpl <em>Pattern Diff Sketch hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSketch_hardwareImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_hardware()
		 * @generated
		 */
		EClass PATTERN_DIFF_SKETCH_HARDWARE = eINSTANCE.getPattern_DiffSketch_hardware();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SKETCH_HARDWARE__ID_PATTERN = eINSTANCE.getPattern_DiffSketch_hardware_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_instructionsImpl <em>Pattern Diff Sketch instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSketch_instructionsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_instructions()
		 * @generated
		 */
		EClass PATTERN_DIFF_SKETCH_INSTRUCTIONS = eINSTANCE.getPattern_DiffSketch_instructions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SKETCH_INSTRUCTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffSketch_instructions_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSketch_functionsImpl <em>Pattern Diff Sketch functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSketch_functionsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSketch_functions()
		 * @generated
		 */
		EClass PATTERN_DIFF_SKETCH_FUNCTIONS = eINSTANCE.getPattern_DiffSketch_functions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SKETCH_FUNCTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffSketch_functions_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProjectImpl <em>Pattern Diff Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProjectImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT = eINSTANCE.getPattern_DiffProject();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT__ID_PATTERN = eINSTANCE.getPattern_DiffProject_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_hardwareImpl <em>Pattern Diff Project hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProject_hardwareImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_hardware()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT_HARDWARE = eINSTANCE.getPattern_DiffProject_hardware();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT_HARDWARE__ID_PATTERN = eINSTANCE.getPattern_DiffProject_hardware_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_sketchImpl <em>Pattern Diff Project sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProject_sketchImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_sketch()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT_SKETCH = eINSTANCE.getPattern_DiffProject_sketch();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT_SKETCH__ID_PATTERN = eINSTANCE.getPattern_DiffProject_sketch_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_modulesImpl <em>Pattern Diff Project modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProject_modulesImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_modules()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT_MODULES = eINSTANCE.getPattern_DiffProject_modules();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT_MODULES__ID_PATTERN = eINSTANCE.getPattern_DiffProject_modules_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_platformImpl <em>Pattern Diff Project platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProject_platformImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_platform()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT_PLATFORM = eINSTANCE.getPattern_DiffProject_platform();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT_PLATFORM__ID_PATTERN = eINSTANCE.getPattern_DiffProject_platform_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffProject_domainspecificdiffsImpl <em>Pattern Diff Project domainspecificdiffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffProject_domainspecificdiffsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffProject_domainspecificdiffs()
		 * @generated
		 */
		EClass PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS = eINSTANCE.getPattern_DiffProject_domainspecificdiffs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PROJECT_DOMAINSPECIFICDIFFS__ID_PATTERN = eINSTANCE.getPattern_DiffProject_domainspecificdiffs_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffInstruction_previousImpl <em>Pattern Diff Instruction previous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffInstruction_previousImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInstruction_previous()
		 * @generated
		 */
		EClass PATTERN_DIFF_INSTRUCTION_PREVIOUS = eINSTANCE.getPattern_DiffInstruction_previous();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INSTRUCTION_PREVIOUS__ID_PATTERN = eINSTANCE.getPattern_DiffInstruction_previous_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffInstruction_nextImpl <em>Pattern Diff Instruction next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffInstruction_nextImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInstruction_next()
		 * @generated
		 */
		EClass PATTERN_DIFF_INSTRUCTION_NEXT = eINSTANCE.getPattern_DiffInstruction_next();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INSTRUCTION_NEXT__ID_PATTERN = eINSTANCE.getPattern_DiffInstruction_next_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffStatusImpl <em>Pattern Diff Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffStatusImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffStatus()
		 * @generated
		 */
		EClass PATTERN_DIFF_STATUS = eINSTANCE.getPattern_DiffStatus();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_STATUS__ID_PATTERN = eINSTANCE.getPattern_DiffStatus_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffStatus_sensorImpl <em>Pattern Diff Status sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffStatus_sensorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffStatus_sensor()
		 * @generated
		 */
		EClass PATTERN_DIFF_STATUS_SENSOR = eINSTANCE.getPattern_DiffStatus_sensor();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_STATUS_SENSOR__ID_PATTERN = eINSTANCE.getPattern_DiffStatus_sensor_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffLevelImpl <em>Pattern Diff Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffLevelImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffLevel()
		 * @generated
		 */
		EClass PATTERN_DIFF_LEVEL = eINSTANCE.getPattern_DiffLevel();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_LEVEL__ID_PATTERN = eINSTANCE.getPattern_DiffLevel_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffLevel_levelImpl <em>Pattern Diff Level level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffLevel_levelImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffLevel_level()
		 * @generated
		 */
		EClass PATTERN_DIFF_LEVEL_LEVEL = eINSTANCE.getPattern_DiffLevel_level();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_LEVEL_LEVEL__ID_PATTERN = eINSTANCE.getPattern_DiffLevel_level_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffModuleInstruction_moduleImpl <em>Pattern Diff Module Instruction module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffModuleInstruction_moduleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffModuleInstruction_module()
		 * @generated
		 */
		EClass PATTERN_DIFF_MODULE_INSTRUCTION_MODULE = eINSTANCE.getPattern_DiffModuleInstruction_module();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_MODULE_INSTRUCTION_MODULE__ID_PATTERN = eINSTANCE.getPattern_DiffModuleInstruction_module_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffControl_instructionsImpl <em>Pattern Diff Control instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffControl_instructionsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffControl_instructions()
		 * @generated
		 */
		EClass PATTERN_DIFF_CONTROL_INSTRUCTIONS = eINSTANCE.getPattern_DiffControl_instructions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_CONTROL_INSTRUCTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffControl_instructions_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffDelayImpl <em>Pattern Diff Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffDelayImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffDelay()
		 * @generated
		 */
		EClass PATTERN_DIFF_DELAY = eINSTANCE.getPattern_DiffDelay();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_DELAY__ID_PATTERN = eINSTANCE.getPattern_DiffDelay_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffInputModuleImpl <em>Pattern Diff Input Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffInputModuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffInputModule()
		 * @generated
		 */
		EClass PATTERN_DIFF_INPUT_MODULE = eINSTANCE.getPattern_DiffInputModule();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_INPUT_MODULE__ID_PATTERN = eINSTANCE.getPattern_DiffInputModule_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffOutputModuleImpl <em>Pattern Diff Output Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffOutputModuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffOutputModule()
		 * @generated
		 */
		EClass PATTERN_DIFF_OUTPUT_MODULE = eINSTANCE.getPattern_DiffOutputModule();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_OUTPUT_MODULE__ID_PATTERN = eINSTANCE.getPattern_DiffOutputModule_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffConnectorImpl <em>Pattern Diff Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffConnectorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector()
		 * @generated
		 */
		EClass PATTERN_DIFF_CONNECTOR = eINSTANCE.getPattern_DiffConnector();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_CONNECTOR__ID_PATTERN = eINSTANCE.getPattern_DiffConnector_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffConnector_pinImpl <em>Pattern Diff Connector pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffConnector_pinImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector_pin()
		 * @generated
		 */
		EClass PATTERN_DIFF_CONNECTOR_PIN = eINSTANCE.getPattern_DiffConnector_pin();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_CONNECTOR_PIN__ID_PATTERN = eINSTANCE.getPattern_DiffConnector_pin_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffConnector_moduleImpl <em>Pattern Diff Connector module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffConnector_moduleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConnector_module()
		 * @generated
		 */
		EClass PATTERN_DIFF_CONNECTOR_MODULE = eINSTANCE.getPattern_DiffConnector_module();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_CONNECTOR_MODULE__ID_PATTERN = eINSTANCE.getPattern_DiffConnector_module_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffRepeatImpl <em>Pattern Diff Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffRepeatImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffRepeat()
		 * @generated
		 */
		EClass PATTERN_DIFF_REPEAT = eINSTANCE.getPattern_DiffRepeat();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_REPEAT__ID_PATTERN = eINSTANCE.getPattern_DiffRepeat_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSensorImpl <em>Pattern Diff Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSensorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSensor()
		 * @generated
		 */
		EClass PATTERN_DIFF_SENSOR = eINSTANCE.getPattern_DiffSensor();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SENSOR__ID_PATTERN = eINSTANCE.getPattern_DiffSensor_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSensor_statusImpl <em>Pattern Diff Sensor status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSensor_statusImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSensor_status()
		 * @generated
		 */
		EClass PATTERN_DIFF_SENSOR_STATUS = eINSTANCE.getPattern_DiffSensor_status();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SENSOR_STATUS__ID_PATTERN = eINSTANCE.getPattern_DiffSensor_status_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffWhileImpl <em>Pattern Diff While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffWhileImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffWhile()
		 * @generated
		 */
		EClass PATTERN_DIFF_WHILE = eINSTANCE.getPattern_DiffWhile();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_WHILE__ID_PATTERN = eINSTANCE.getPattern_DiffWhile_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffWhile_conditionImpl <em>Pattern Diff While condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffWhile_conditionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffWhile_condition()
		 * @generated
		 */
		EClass PATTERN_DIFF_WHILE_CONDITION = eINSTANCE.getPattern_DiffWhile_condition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_WHILE_CONDITION__ID_PATTERN = eINSTANCE.getPattern_DiffWhile_condition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffMathOperator_leftImpl <em>Pattern Diff Math Operator left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffMathOperator_leftImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffMathOperator_left()
		 * @generated
		 */
		EClass PATTERN_DIFF_MATH_OPERATOR_LEFT = eINSTANCE.getPattern_DiffMathOperator_left();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_MATH_OPERATOR_LEFT__ID_PATTERN = eINSTANCE.getPattern_DiffMathOperator_left_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffMathOperator_rightImpl <em>Pattern Diff Math Operator right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffMathOperator_rightImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffMathOperator_right()
		 * @generated
		 */
		EClass PATTERN_DIFF_MATH_OPERATOR_RIGHT = eINSTANCE.getPattern_DiffMathOperator_right();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_MATH_OPERATOR_RIGHT__ID_PATTERN = eINSTANCE.getPattern_DiffMathOperator_right_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffVariableImpl <em>Pattern Diff Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffVariableImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffVariable()
		 * @generated
		 */
		EClass PATTERN_DIFF_VARIABLE = eINSTANCE.getPattern_DiffVariable();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_VARIABLE__ID_PATTERN = eINSTANCE.getPattern_DiffVariable_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSetImpl <em>Pattern Diff Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSetImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet()
		 * @generated
		 */
		EClass PATTERN_DIFF_SET = eINSTANCE.getPattern_DiffSet();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SET__ID_PATTERN = eINSTANCE.getPattern_DiffSet_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSet_variableImpl <em>Pattern Diff Set variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSet_variableImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet_variable()
		 * @generated
		 */
		EClass PATTERN_DIFF_SET_VARIABLE = eINSTANCE.getPattern_DiffSet_variable();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SET_VARIABLE__ID_PATTERN = eINSTANCE.getPattern_DiffSet_variable_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffSet_valueImpl <em>Pattern Diff Set value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffSet_valueImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffSet_value()
		 * @generated
		 */
		EClass PATTERN_DIFF_SET_VALUE = eINSTANCE.getPattern_DiffSet_value();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_SET_VALUE__ID_PATTERN = eINSTANCE.getPattern_DiffSet_value_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffNumericalOperatorImpl <em>Pattern Diff Numerical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffNumericalOperatorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffNumericalOperator()
		 * @generated
		 */
		EClass PATTERN_DIFF_NUMERICAL_OPERATOR = eINSTANCE.getPattern_DiffNumericalOperator();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_NUMERICAL_OPERATOR__ID_PATTERN = eINSTANCE.getPattern_DiffNumericalOperator_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffBooleanOperatorImpl <em>Pattern Diff Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffBooleanOperatorImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffBooleanOperator()
		 * @generated
		 */
		EClass PATTERN_DIFF_BOOLEAN_OPERATOR = eINSTANCE.getPattern_DiffBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_BOOLEAN_OPERATOR__ID_PATTERN = eINSTANCE.getPattern_DiffBooleanOperator_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffConstantImpl <em>Pattern Diff Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffConstantImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffConstant()
		 * @generated
		 */
		EClass PATTERN_DIFF_CONSTANT = eINSTANCE.getPattern_DiffConstant();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_CONSTANT__ID_PATTERN = eINSTANCE.getPattern_DiffConstant_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffIfImpl <em>Pattern Diff If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffIfImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffIf()
		 * @generated
		 */
		EClass PATTERN_DIFF_IF = eINSTANCE.getPattern_DiffIf();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_IF__ID_PATTERN = eINSTANCE.getPattern_DiffIf_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffIf_conditionImpl <em>Pattern Diff If condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffIf_conditionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffIf_condition()
		 * @generated
		 */
		EClass PATTERN_DIFF_IF_CONDITION = eINSTANCE.getPattern_DiffIf_condition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_IF_CONDITION__ID_PATTERN = eINSTANCE.getPattern_DiffIf_condition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionImpl <em>Pattern Diff Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunctionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION = eINSTANCE.getPattern_DiffFunction();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION__ID_PATTERN = eINSTANCE.getPattern_DiffFunction_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunction_paramDefsImpl <em>Pattern Diff Function param Defs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunction_paramDefsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction_paramDefs()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION_PARAM_DEFS = eINSTANCE.getPattern_DiffFunction_paramDefs();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION_PARAM_DEFS__ID_PATTERN = eINSTANCE.getPattern_DiffFunction_paramDefs_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunction_instructionsImpl <em>Pattern Diff Function instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunction_instructionsImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunction_instructions()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION_INSTRUCTIONS = eINSTANCE.getPattern_DiffFunction_instructions();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION_INSTRUCTIONS__ID_PATTERN = eINSTANCE.getPattern_DiffFunction_instructions_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl <em>Pattern Diff Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffParameterDefinitionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterDefinition()
		 * @generated
		 */
		EClass PATTERN_DIFF_PARAMETER_DEFINITION = eINSTANCE.getPattern_DiffParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PARAMETER_DEFINITION__ID_PATTERN = eINSTANCE.getPattern_DiffParameterDefinition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffParameter_to_definitionImpl <em>Pattern Diff Parameter to definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffParameter_to_definitionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameter_to_definition()
		 * @generated
		 */
		EClass PATTERN_DIFF_PARAMETER_TO_DEFINITION = eINSTANCE.getPattern_DiffParameter_to_definition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PARAMETER_TO_DEFINITION__ID_PATTERN = eINSTANCE.getPattern_DiffParameter_to_definition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCallImpl <em>Pattern Diff Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCallImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION_CALL = eINSTANCE.getPattern_DiffFunctionCall();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION_CALL__ID_PATTERN = eINSTANCE.getPattern_DiffFunctionCall_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCall_definitionImpl <em>Pattern Diff Function Call definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCall_definitionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall_definition()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION_CALL_DEFINITION = eINSTANCE.getPattern_DiffFunctionCall_definition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION_CALL_DEFINITION__ID_PATTERN = eINSTANCE.getPattern_DiffFunctionCall_definition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffFunctionCall_parametersImpl <em>Pattern Diff Function Call parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffFunctionCall_parametersImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffFunctionCall_parameters()
		 * @generated
		 */
		EClass PATTERN_DIFF_FUNCTION_CALL_PARAMETERS = eINSTANCE.getPattern_DiffFunctionCall_parameters();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_FUNCTION_CALL_PARAMETERS__ID_PATTERN = eINSTANCE.getPattern_DiffFunctionCall_parameters_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterCallImpl <em>Pattern Diff Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffParameterCallImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterCall()
		 * @generated
		 */
		EClass PATTERN_DIFF_PARAMETER_CALL = eINSTANCE.getPattern_DiffParameterCall();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PARAMETER_CALL__ID_PATTERN = eINSTANCE.getPattern_DiffParameterCall_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.Pattern_DiffParameterCall_definitionImpl <em>Pattern Diff Parameter Call definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.Pattern_DiffParameterCall_definitionImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getPattern_DiffParameterCall_definition()
		 * @generated
		 */
		EClass PATTERN_DIFF_PARAMETER_CALL_DEFINITION = eINSTANCE.getPattern_DiffParameterCall_definition();

		/**
		 * The meta object literal for the '<em><b>ID Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_DIFF_PARAMETER_CALL_DEFINITION__ID_PATTERN = eINSTANCE.getPattern_DiffParameterCall_definition_ID_Pattern();

		/**
		 * The meta object literal for the '{@link arduinoRuleMM.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoRuleMM.impl.RuleImpl
		 * @see arduinoRuleMM.impl.ArduinoRuleMMPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONSTRAINTS = eINSTANCE.getRule_Constraints();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

	}

} //ArduinoRuleMMPackage
