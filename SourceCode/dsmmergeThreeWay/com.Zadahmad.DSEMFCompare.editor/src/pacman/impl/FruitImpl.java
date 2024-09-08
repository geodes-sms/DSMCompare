/**
 */
package pacman.impl;

import org.eclipse.emf.ecore.EClass;

import pacman.Fruit;
import pacman.PacmanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fruit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FruitImpl extends FoodImpl implements Fruit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FruitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanPackage.Literals.FRUIT;
	}

} //FruitImpl
