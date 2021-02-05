/**
 */
package PacmanGo.impl;

import PacmanGo.Ghost;
import PacmanGo.PacmanGoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ghost</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GhostImpl extends PositionableEntityImpl implements Ghost {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GhostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PacmanGoPackage.Literals.GHOST;
	}

} //GhostImpl
