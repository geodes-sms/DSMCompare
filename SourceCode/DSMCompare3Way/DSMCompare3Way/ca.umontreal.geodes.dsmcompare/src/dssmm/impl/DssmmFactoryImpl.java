/**
 */
package dssmm.impl;

import dssmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DssmmFactoryImpl extends EFactoryImpl implements DssmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DssmmFactory init() {
		try {
			DssmmFactory theDssmmFactory = (DssmmFactory)EPackage.Registry.INSTANCE.getEFactory(DssmmPackage.eNS_URI);
			if (theDssmmFactory != null) {
				return theDssmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DssmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DssmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DssmmPackage.DECISION_SUPPORT: return createDecisionSupport();
			case DssmmPackage.MODEL: return createModel();
			case DssmmPackage.LEAF_FACTOR: return createLeafFactor();
			case DssmmPackage.COMPOSITE_FACTOR: return createCompositeFactor();
			case DssmmPackage.OPTION: return createOption();
			case DssmmPackage.VENDOR: return createVendor();
			case DssmmPackage.SCORE: return createScore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupport createDecisionSupport() {
		DecisionSupportImpl decisionSupport = new DecisionSupportImpl();
		return decisionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafFactor createLeafFactor() {
		LeafFactorImpl leafFactor = new LeafFactorImpl();
		return leafFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFactor createCompositeFactor() {
		CompositeFactorImpl compositeFactor = new CompositeFactorImpl();
		return compositeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor createVendor() {
		VendorImpl vendor = new VendorImpl();
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score createScore() {
		ScoreImpl score = new ScoreImpl();
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DssmmPackage getDssmmPackage() {
		return (DssmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DssmmPackage getPackage() {
		return DssmmPackage.eINSTANCE;
	}

} //DssmmFactoryImpl
