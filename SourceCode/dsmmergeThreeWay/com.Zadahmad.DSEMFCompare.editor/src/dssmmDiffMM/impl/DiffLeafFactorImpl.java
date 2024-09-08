/**
 */
package dssmmDiffMM.impl;

import dssmmDiffMM.ChangeStatus;
import dssmmDiffMM.ClassDiffKind;
import dssmmDiffMM.DiffLeafFactor;
import dssmmDiffMM.DssmmDiffMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Leaf Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getDiff_kind_Left <em>Diff kind Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getDiff_kind_Right <em>Diff kind Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getChangeStatus <em>Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_FactorID_Left <em>New Factor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_FactorID_Right <em>New Factor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getFactorIDChangeStatus <em>Factor ID Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Name_Left <em>New Name Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Name_Right <em>New Name Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNameChangeStatus <em>Name Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Descr_Left <em>New Descr Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Descr_Right <em>New Descr Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getDescrChangeStatus <em>Descr Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_GW_Left <em>New GW Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_GW_Right <em>New GW Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getGWChangeStatus <em>GW Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_LW_Left <em>New LW Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_LW_Right <em>New LW Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getLWChangeStatus <em>LW Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Del_Left <em>New Del Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Del_Right <em>New Del Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getDelChangeStatus <em>Del Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#isNew_HideOnLine_Left <em>New Hide On Line Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#isNew_HideOnLine_Right <em>New Hide On Line Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getHideOnLineChangeStatus <em>Hide On Line Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Hierarchy_Left <em>New Hierarchy Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_Hierarchy_Right <em>New Hierarchy Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getHierarchyChangeStatus <em>Hierarchy Change Status</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_MasterFactorID_Left <em>New Master Factor ID Left</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getNew_MasterFactorID_Right <em>New Master Factor ID Right</em>}</li>
 *   <li>{@link dssmmDiffMM.impl.DiffLeafFactorImpl#getMasterFactorIDChangeStatus <em>Master Factor ID Change Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffLeafFactorImpl extends LeafFactorImpl implements DiffLeafFactor {
	/**
	 * The default value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_LEFT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Left() <em>Diff kind Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Left()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Left = DIFF_KIND_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDiffKind DIFF_KIND_RIGHT_EDEFAULT = ClassDiffKind.NON;

	/**
	 * The cached value of the '{@link #getDiff_kind_Right() <em>Diff kind Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff_kind_Right()
	 * @generated
	 * @ordered
	 */
	protected ClassDiffKind diff_kind_Right = DIFF_KIND_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeStatus() <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getChangeStatus() <em>Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus changeStatus = CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_FactorID_Left() <em>New Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_FACTOR_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_FactorID_Left() <em>New Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_FactorID_Left = NEW_FACTOR_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_FactorID_Right() <em>New Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_FACTOR_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_FactorID_Right() <em>New Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_FactorID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_FactorID_Right = NEW_FACTOR_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactorIDChangeStatus() <em>Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus FACTOR_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getFactorIDChangeStatus() <em>Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus factorIDChangeStatus = FACTOR_ID_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Left() <em>New Name Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Left = NEW_NAME_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Name_Right() <em>New Name Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Name_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Name_Right = NEW_NAME_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameChangeStatus() <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus NAME_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getNameChangeStatus() <em>Name Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus nameChangeStatus = NAME_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Left() <em>New Descr Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Left = NEW_DESCR_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DESCR_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Descr_Right() <em>New Descr Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Descr_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Descr_Right = NEW_DESCR_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DESCR_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDescrChangeStatus() <em>Descr Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescrChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus descrChangeStatus = DESCR_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_GW_Left() <em>New GW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW_Left()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_GW_LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_GW_Left() <em>New GW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW_Left()
	 * @generated
	 * @ordered
	 */
	protected float new_GW_Left = NEW_GW_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_GW_Right() <em>New GW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW_Right()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_GW_RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_GW_Right() <em>New GW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_GW_Right()
	 * @generated
	 * @ordered
	 */
	protected float new_GW_Right = NEW_GW_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGWChangeStatus() <em>GW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGWChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus GW_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getGWChangeStatus() <em>GW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGWChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus gwChangeStatus = GW_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_LW_Left() <em>New LW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW_Left()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_LW_LEFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_LW_Left() <em>New LW Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW_Left()
	 * @generated
	 * @ordered
	 */
	protected float new_LW_Left = NEW_LW_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_LW_Right() <em>New LW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW_Right()
	 * @generated
	 * @ordered
	 */
	protected static final float NEW_LW_RIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNew_LW_Right() <em>New LW Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_LW_Right()
	 * @generated
	 * @ordered
	 */
	protected float new_LW_Right = NEW_LW_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLWChangeStatus() <em>LW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLWChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus LW_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getLWChangeStatus() <em>LW Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLWChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus lwChangeStatus = LW_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Del_Left() <em>New Del Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del_Left()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_DEL_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Del_Left() <em>New Del Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del_Left()
	 * @generated
	 * @ordered
	 */
	protected Boolean new_Del_Left = NEW_DEL_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Del_Right() <em>New Del Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del_Right()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_DEL_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Del_Right() <em>New Del Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Del_Right()
	 * @generated
	 * @ordered
	 */
	protected Boolean new_Del_Right = NEW_DEL_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelChangeStatus() <em>Del Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus DEL_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getDelChangeStatus() <em>Del Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus delChangeStatus = DEL_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_HideOnLine_Left() <em>New Hide On Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine_Left()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_HIDE_ON_LINE_LEFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_HideOnLine_Left() <em>New Hide On Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine_Left()
	 * @generated
	 * @ordered
	 */
	protected boolean new_HideOnLine_Left = NEW_HIDE_ON_LINE_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNew_HideOnLine_Right() <em>New Hide On Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine_Right()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_HIDE_ON_LINE_RIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNew_HideOnLine_Right() <em>New Hide On Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNew_HideOnLine_Right()
	 * @generated
	 * @ordered
	 */
	protected boolean new_HideOnLine_Right = NEW_HIDE_ON_LINE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHideOnLineChangeStatus() <em>Hide On Line Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideOnLineChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus HIDE_ON_LINE_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getHideOnLineChangeStatus() <em>Hide On Line Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideOnLineChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus hideOnLineChangeStatus = HIDE_ON_LINE_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Hierarchy_Left() <em>New Hierarchy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy_Left()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_HIERARCHY_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Hierarchy_Left() <em>New Hierarchy Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy_Left()
	 * @generated
	 * @ordered
	 */
	protected String new_Hierarchy_Left = NEW_HIERARCHY_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_Hierarchy_Right() <em>New Hierarchy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy_Right()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_HIERARCHY_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_Hierarchy_Right() <em>New Hierarchy Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_Hierarchy_Right()
	 * @generated
	 * @ordered
	 */
	protected String new_Hierarchy_Right = NEW_HIERARCHY_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHierarchyChangeStatus() <em>Hierarchy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus HIERARCHY_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getHierarchyChangeStatus() <em>Hierarchy Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus hierarchyChangeStatus = HIERARCHY_CHANGE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MasterFactorID_Left() <em>New Master Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID_Left()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MASTER_FACTOR_ID_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MasterFactorID_Left() <em>New Master Factor ID Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID_Left()
	 * @generated
	 * @ordered
	 */
	protected int new_MasterFactorID_Left = NEW_MASTER_FACTOR_ID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_MasterFactorID_Right() <em>New Master Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID_Right()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_MASTER_FACTOR_ID_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNew_MasterFactorID_Right() <em>New Master Factor ID Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_MasterFactorID_Right()
	 * @generated
	 * @ordered
	 */
	protected int new_MasterFactorID_Right = NEW_MASTER_FACTOR_ID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterFactorIDChangeStatus() <em>Master Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFactorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeStatus MASTER_FACTOR_ID_CHANGE_STATUS_EDEFAULT = ChangeStatus.NON;

	/**
	 * The cached value of the '{@link #getMasterFactorIDChangeStatus() <em>Master Factor ID Change Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFactorIDChangeStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeStatus masterFactorIDChangeStatus = MASTER_FACTOR_ID_CHANGE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffLeafFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DssmmDiffMMPackage.Literals.DIFF_LEAF_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Left() {
		return diff_kind_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Left(ClassDiffKind newDiff_kind_Left) {
		ClassDiffKind oldDiff_kind_Left = diff_kind_Left;
		diff_kind_Left = newDiff_kind_Left == null ? DIFF_KIND_LEFT_EDEFAULT : newDiff_kind_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_LEFT, oldDiff_kind_Left, diff_kind_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiffKind getDiff_kind_Right() {
		return diff_kind_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff_kind_Right(ClassDiffKind newDiff_kind_Right) {
		ClassDiffKind oldDiff_kind_Right = diff_kind_Right;
		diff_kind_Right = newDiff_kind_Right == null ? DIFF_KIND_RIGHT_EDEFAULT : newDiff_kind_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT, oldDiff_kind_Right, diff_kind_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getChangeStatus() {
		return changeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeStatus(ChangeStatus newChangeStatus) {
		ChangeStatus oldChangeStatus = changeStatus;
		changeStatus = newChangeStatus == null ? CHANGE_STATUS_EDEFAULT : newChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__CHANGE_STATUS, oldChangeStatus, changeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_FactorID_Left() {
		return new_FactorID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_FactorID_Left(int newNew_FactorID_Left) {
		int oldNew_FactorID_Left = new_FactorID_Left;
		new_FactorID_Left = newNew_FactorID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT, oldNew_FactorID_Left, new_FactorID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_FactorID_Right() {
		return new_FactorID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_FactorID_Right(int newNew_FactorID_Right) {
		int oldNew_FactorID_Right = new_FactorID_Right;
		new_FactorID_Right = newNew_FactorID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT, oldNew_FactorID_Right, new_FactorID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getFactorIDChangeStatus() {
		return factorIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactorIDChangeStatus(ChangeStatus newFactorIDChangeStatus) {
		ChangeStatus oldFactorIDChangeStatus = factorIDChangeStatus;
		factorIDChangeStatus = newFactorIDChangeStatus == null ? FACTOR_ID_CHANGE_STATUS_EDEFAULT : newFactorIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS, oldFactorIDChangeStatus, factorIDChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Left() {
		return new_Name_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Left(String newNew_Name_Left) {
		String oldNew_Name_Left = new_Name_Left;
		new_Name_Left = newNew_Name_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_LEFT, oldNew_Name_Left, new_Name_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Name_Right() {
		return new_Name_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Name_Right(String newNew_Name_Right) {
		String oldNew_Name_Right = new_Name_Right;
		new_Name_Right = newNew_Name_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_RIGHT, oldNew_Name_Right, new_Name_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getNameChangeStatus() {
		return nameChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameChangeStatus(ChangeStatus newNameChangeStatus) {
		ChangeStatus oldNameChangeStatus = nameChangeStatus;
		nameChangeStatus = newNameChangeStatus == null ? NAME_CHANGE_STATUS_EDEFAULT : newNameChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS, oldNameChangeStatus, nameChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Left() {
		return new_Descr_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Left(String newNew_Descr_Left) {
		String oldNew_Descr_Left = new_Descr_Left;
		new_Descr_Left = newNew_Descr_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_LEFT, oldNew_Descr_Left, new_Descr_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Descr_Right() {
		return new_Descr_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Descr_Right(String newNew_Descr_Right) {
		String oldNew_Descr_Right = new_Descr_Right;
		new_Descr_Right = newNew_Descr_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT, oldNew_Descr_Right, new_Descr_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDescrChangeStatus() {
		return descrChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescrChangeStatus(ChangeStatus newDescrChangeStatus) {
		ChangeStatus oldDescrChangeStatus = descrChangeStatus;
		descrChangeStatus = newDescrChangeStatus == null ? DESCR_CHANGE_STATUS_EDEFAULT : newDescrChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS, oldDescrChangeStatus, descrChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_GW_Left() {
		return new_GW_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_GW_Left(float newNew_GW_Left) {
		float oldNew_GW_Left = new_GW_Left;
		new_GW_Left = newNew_GW_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_LEFT, oldNew_GW_Left, new_GW_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_GW_Right() {
		return new_GW_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_GW_Right(float newNew_GW_Right) {
		float oldNew_GW_Right = new_GW_Right;
		new_GW_Right = newNew_GW_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_RIGHT, oldNew_GW_Right, new_GW_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getGWChangeStatus() {
		return gwChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGWChangeStatus(ChangeStatus newGWChangeStatus) {
		ChangeStatus oldGWChangeStatus = gwChangeStatus;
		gwChangeStatus = newGWChangeStatus == null ? GW_CHANGE_STATUS_EDEFAULT : newGWChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__GW_CHANGE_STATUS, oldGWChangeStatus, gwChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_LW_Left() {
		return new_LW_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_LW_Left(float newNew_LW_Left) {
		float oldNew_LW_Left = new_LW_Left;
		new_LW_Left = newNew_LW_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_LEFT, oldNew_LW_Left, new_LW_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNew_LW_Right() {
		return new_LW_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_LW_Right(float newNew_LW_Right) {
		float oldNew_LW_Right = new_LW_Right;
		new_LW_Right = newNew_LW_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_RIGHT, oldNew_LW_Right, new_LW_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getLWChangeStatus() {
		return lwChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLWChangeStatus(ChangeStatus newLWChangeStatus) {
		ChangeStatus oldLWChangeStatus = lwChangeStatus;
		lwChangeStatus = newLWChangeStatus == null ? LW_CHANGE_STATUS_EDEFAULT : newLWChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__LW_CHANGE_STATUS, oldLWChangeStatus, lwChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNew_Del_Left() {
		return new_Del_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Del_Left(Boolean newNew_Del_Left) {
		Boolean oldNew_Del_Left = new_Del_Left;
		new_Del_Left = newNew_Del_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_LEFT, oldNew_Del_Left, new_Del_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNew_Del_Right() {
		return new_Del_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Del_Right(Boolean newNew_Del_Right) {
		Boolean oldNew_Del_Right = new_Del_Right;
		new_Del_Right = newNew_Del_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_RIGHT, oldNew_Del_Right, new_Del_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getDelChangeStatus() {
		return delChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelChangeStatus(ChangeStatus newDelChangeStatus) {
		ChangeStatus oldDelChangeStatus = delChangeStatus;
		delChangeStatus = newDelChangeStatus == null ? DEL_CHANGE_STATUS_EDEFAULT : newDelChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS, oldDelChangeStatus, delChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew_HideOnLine_Left() {
		return new_HideOnLine_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_HideOnLine_Left(boolean newNew_HideOnLine_Left) {
		boolean oldNew_HideOnLine_Left = new_HideOnLine_Left;
		new_HideOnLine_Left = newNew_HideOnLine_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT, oldNew_HideOnLine_Left, new_HideOnLine_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNew_HideOnLine_Right() {
		return new_HideOnLine_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_HideOnLine_Right(boolean newNew_HideOnLine_Right) {
		boolean oldNew_HideOnLine_Right = new_HideOnLine_Right;
		new_HideOnLine_Right = newNew_HideOnLine_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT, oldNew_HideOnLine_Right, new_HideOnLine_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getHideOnLineChangeStatus() {
		return hideOnLineChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideOnLineChangeStatus(ChangeStatus newHideOnLineChangeStatus) {
		ChangeStatus oldHideOnLineChangeStatus = hideOnLineChangeStatus;
		hideOnLineChangeStatus = newHideOnLineChangeStatus == null ? HIDE_ON_LINE_CHANGE_STATUS_EDEFAULT : newHideOnLineChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS, oldHideOnLineChangeStatus, hideOnLineChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Hierarchy_Left() {
		return new_Hierarchy_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Hierarchy_Left(String newNew_Hierarchy_Left) {
		String oldNew_Hierarchy_Left = new_Hierarchy_Left;
		new_Hierarchy_Left = newNew_Hierarchy_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT, oldNew_Hierarchy_Left, new_Hierarchy_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_Hierarchy_Right() {
		return new_Hierarchy_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_Hierarchy_Right(String newNew_Hierarchy_Right) {
		String oldNew_Hierarchy_Right = new_Hierarchy_Right;
		new_Hierarchy_Right = newNew_Hierarchy_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT, oldNew_Hierarchy_Right, new_Hierarchy_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getHierarchyChangeStatus() {
		return hierarchyChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyChangeStatus(ChangeStatus newHierarchyChangeStatus) {
		ChangeStatus oldHierarchyChangeStatus = hierarchyChangeStatus;
		hierarchyChangeStatus = newHierarchyChangeStatus == null ? HIERARCHY_CHANGE_STATUS_EDEFAULT : newHierarchyChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS, oldHierarchyChangeStatus, hierarchyChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MasterFactorID_Left() {
		return new_MasterFactorID_Left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MasterFactorID_Left(int newNew_MasterFactorID_Left) {
		int oldNew_MasterFactorID_Left = new_MasterFactorID_Left;
		new_MasterFactorID_Left = newNew_MasterFactorID_Left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT, oldNew_MasterFactorID_Left, new_MasterFactorID_Left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNew_MasterFactorID_Right() {
		return new_MasterFactorID_Right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_MasterFactorID_Right(int newNew_MasterFactorID_Right) {
		int oldNew_MasterFactorID_Right = new_MasterFactorID_Right;
		new_MasterFactorID_Right = newNew_MasterFactorID_Right;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT, oldNew_MasterFactorID_Right, new_MasterFactorID_Right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStatus getMasterFactorIDChangeStatus() {
		return masterFactorIDChangeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterFactorIDChangeStatus(ChangeStatus newMasterFactorIDChangeStatus) {
		ChangeStatus oldMasterFactorIDChangeStatus = masterFactorIDChangeStatus;
		masterFactorIDChangeStatus = newMasterFactorIDChangeStatus == null ? MASTER_FACTOR_ID_CHANGE_STATUS_EDEFAULT : newMasterFactorIDChangeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DssmmDiffMMPackage.DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS, oldMasterFactorIDChangeStatus, masterFactorIDChangeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_LEFT:
				return getDiff_kind_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT:
				return getDiff_kind_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__CHANGE_STATUS:
				return getChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT:
				return getNew_FactorID_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT:
				return getNew_FactorID_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS:
				return getFactorIDChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_LEFT:
				return getNew_Name_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_RIGHT:
				return getNew_Name_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS:
				return getNameChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_LEFT:
				return getNew_Descr_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT:
				return getNew_Descr_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS:
				return getDescrChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_LEFT:
				return getNew_GW_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_RIGHT:
				return getNew_GW_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__GW_CHANGE_STATUS:
				return getGWChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_LEFT:
				return getNew_LW_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_RIGHT:
				return getNew_LW_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__LW_CHANGE_STATUS:
				return getLWChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_LEFT:
				return getNew_Del_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_RIGHT:
				return getNew_Del_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS:
				return getDelChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT:
				return isNew_HideOnLine_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT:
				return isNew_HideOnLine_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS:
				return getHideOnLineChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT:
				return getNew_Hierarchy_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT:
				return getNew_Hierarchy_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS:
				return getHierarchyChangeStatus();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT:
				return getNew_MasterFactorID_Left();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT:
				return getNew_MasterFactorID_Right();
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS:
				return getMasterFactorIDChangeStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_LEFT:
				setDiff_kind_Left((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right((ClassDiffKind)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__CHANGE_STATUS:
				setChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT:
				setNew_FactorID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT:
				setNew_FactorID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS:
				setFactorIDChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_LEFT:
				setNew_Name_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_RIGHT:
				setNew_Name_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS:
				setNameChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_LEFT:
				setNew_Descr_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT:
				setNew_Descr_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS:
				setDescrChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_LEFT:
				setNew_GW_Left((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_RIGHT:
				setNew_GW_Right((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__GW_CHANGE_STATUS:
				setGWChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_LEFT:
				setNew_LW_Left((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_RIGHT:
				setNew_LW_Right((Float)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__LW_CHANGE_STATUS:
				setLWChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_LEFT:
				setNew_Del_Left((Boolean)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_RIGHT:
				setNew_Del_Right((Boolean)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS:
				setDelChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT:
				setNew_HideOnLine_Left((Boolean)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT:
				setNew_HideOnLine_Right((Boolean)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS:
				setHideOnLineChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT:
				setNew_Hierarchy_Left((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT:
				setNew_Hierarchy_Right((String)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS:
				setHierarchyChangeStatus((ChangeStatus)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT:
				setNew_MasterFactorID_Left((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT:
				setNew_MasterFactorID_Right((Integer)newValue);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS:
				setMasterFactorIDChangeStatus((ChangeStatus)newValue);
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
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_LEFT:
				setDiff_kind_Left(DIFF_KIND_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT:
				setDiff_kind_Right(DIFF_KIND_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__CHANGE_STATUS:
				setChangeStatus(CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT:
				setNew_FactorID_Left(NEW_FACTOR_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT:
				setNew_FactorID_Right(NEW_FACTOR_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS:
				setFactorIDChangeStatus(FACTOR_ID_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_LEFT:
				setNew_Name_Left(NEW_NAME_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_RIGHT:
				setNew_Name_Right(NEW_NAME_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS:
				setNameChangeStatus(NAME_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_LEFT:
				setNew_Descr_Left(NEW_DESCR_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT:
				setNew_Descr_Right(NEW_DESCR_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS:
				setDescrChangeStatus(DESCR_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_LEFT:
				setNew_GW_Left(NEW_GW_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_RIGHT:
				setNew_GW_Right(NEW_GW_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__GW_CHANGE_STATUS:
				setGWChangeStatus(GW_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_LEFT:
				setNew_LW_Left(NEW_LW_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_RIGHT:
				setNew_LW_Right(NEW_LW_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__LW_CHANGE_STATUS:
				setLWChangeStatus(LW_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_LEFT:
				setNew_Del_Left(NEW_DEL_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_RIGHT:
				setNew_Del_Right(NEW_DEL_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS:
				setDelChangeStatus(DEL_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT:
				setNew_HideOnLine_Left(NEW_HIDE_ON_LINE_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT:
				setNew_HideOnLine_Right(NEW_HIDE_ON_LINE_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS:
				setHideOnLineChangeStatus(HIDE_ON_LINE_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT:
				setNew_Hierarchy_Left(NEW_HIERARCHY_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT:
				setNew_Hierarchy_Right(NEW_HIERARCHY_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS:
				setHierarchyChangeStatus(HIERARCHY_CHANGE_STATUS_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT:
				setNew_MasterFactorID_Left(NEW_MASTER_FACTOR_ID_LEFT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT:
				setNew_MasterFactorID_Right(NEW_MASTER_FACTOR_ID_RIGHT_EDEFAULT);
				return;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS:
				setMasterFactorIDChangeStatus(MASTER_FACTOR_ID_CHANGE_STATUS_EDEFAULT);
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
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_LEFT:
				return diff_kind_Left != DIFF_KIND_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DIFF_KIND_RIGHT:
				return diff_kind_Right != DIFF_KIND_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__CHANGE_STATUS:
				return changeStatus != CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_LEFT:
				return new_FactorID_Left != NEW_FACTOR_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_FACTOR_ID_RIGHT:
				return new_FactorID_Right != NEW_FACTOR_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__FACTOR_ID_CHANGE_STATUS:
				return factorIDChangeStatus != FACTOR_ID_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_LEFT:
				return NEW_NAME_LEFT_EDEFAULT == null ? new_Name_Left != null : !NEW_NAME_LEFT_EDEFAULT.equals(new_Name_Left);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_NAME_RIGHT:
				return NEW_NAME_RIGHT_EDEFAULT == null ? new_Name_Right != null : !NEW_NAME_RIGHT_EDEFAULT.equals(new_Name_Right);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NAME_CHANGE_STATUS:
				return nameChangeStatus != NAME_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_LEFT:
				return NEW_DESCR_LEFT_EDEFAULT == null ? new_Descr_Left != null : !NEW_DESCR_LEFT_EDEFAULT.equals(new_Descr_Left);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DESCR_RIGHT:
				return NEW_DESCR_RIGHT_EDEFAULT == null ? new_Descr_Right != null : !NEW_DESCR_RIGHT_EDEFAULT.equals(new_Descr_Right);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DESCR_CHANGE_STATUS:
				return descrChangeStatus != DESCR_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_LEFT:
				return new_GW_Left != NEW_GW_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_GW_RIGHT:
				return new_GW_Right != NEW_GW_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__GW_CHANGE_STATUS:
				return gwChangeStatus != GW_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_LEFT:
				return new_LW_Left != NEW_LW_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_LW_RIGHT:
				return new_LW_Right != NEW_LW_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__LW_CHANGE_STATUS:
				return lwChangeStatus != LW_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_LEFT:
				return NEW_DEL_LEFT_EDEFAULT == null ? new_Del_Left != null : !NEW_DEL_LEFT_EDEFAULT.equals(new_Del_Left);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_DEL_RIGHT:
				return NEW_DEL_RIGHT_EDEFAULT == null ? new_Del_Right != null : !NEW_DEL_RIGHT_EDEFAULT.equals(new_Del_Right);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__DEL_CHANGE_STATUS:
				return delChangeStatus != DEL_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_LEFT:
				return new_HideOnLine_Left != NEW_HIDE_ON_LINE_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIDE_ON_LINE_RIGHT:
				return new_HideOnLine_Right != NEW_HIDE_ON_LINE_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIDE_ON_LINE_CHANGE_STATUS:
				return hideOnLineChangeStatus != HIDE_ON_LINE_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_LEFT:
				return NEW_HIERARCHY_LEFT_EDEFAULT == null ? new_Hierarchy_Left != null : !NEW_HIERARCHY_LEFT_EDEFAULT.equals(new_Hierarchy_Left);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_HIERARCHY_RIGHT:
				return NEW_HIERARCHY_RIGHT_EDEFAULT == null ? new_Hierarchy_Right != null : !NEW_HIERARCHY_RIGHT_EDEFAULT.equals(new_Hierarchy_Right);
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__HIERARCHY_CHANGE_STATUS:
				return hierarchyChangeStatus != HIERARCHY_CHANGE_STATUS_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_LEFT:
				return new_MasterFactorID_Left != NEW_MASTER_FACTOR_ID_LEFT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__NEW_MASTER_FACTOR_ID_RIGHT:
				return new_MasterFactorID_Right != NEW_MASTER_FACTOR_ID_RIGHT_EDEFAULT;
			case DssmmDiffMMPackage.DIFF_LEAF_FACTOR__MASTER_FACTOR_ID_CHANGE_STATUS:
				return masterFactorIDChangeStatus != MASTER_FACTOR_ID_CHANGE_STATUS_EDEFAULT;
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
		result.append(" (diff_kind_Left: ");
		result.append(diff_kind_Left);
		result.append(", diff_kind_Right: ");
		result.append(diff_kind_Right);
		result.append(", changeStatus: ");
		result.append(changeStatus);
		result.append(", new_FactorID_Left: ");
		result.append(new_FactorID_Left);
		result.append(", new_FactorID_Right: ");
		result.append(new_FactorID_Right);
		result.append(", FactorIDChangeStatus: ");
		result.append(factorIDChangeStatus);
		result.append(", new_Name_Left: ");
		result.append(new_Name_Left);
		result.append(", new_Name_Right: ");
		result.append(new_Name_Right);
		result.append(", NameChangeStatus: ");
		result.append(nameChangeStatus);
		result.append(", new_Descr_Left: ");
		result.append(new_Descr_Left);
		result.append(", new_Descr_Right: ");
		result.append(new_Descr_Right);
		result.append(", DescrChangeStatus: ");
		result.append(descrChangeStatus);
		result.append(", new_GW_Left: ");
		result.append(new_GW_Left);
		result.append(", new_GW_Right: ");
		result.append(new_GW_Right);
		result.append(", GWChangeStatus: ");
		result.append(gwChangeStatus);
		result.append(", new_LW_Left: ");
		result.append(new_LW_Left);
		result.append(", new_LW_Right: ");
		result.append(new_LW_Right);
		result.append(", LWChangeStatus: ");
		result.append(lwChangeStatus);
		result.append(", new_Del_Left: ");
		result.append(new_Del_Left);
		result.append(", new_Del_Right: ");
		result.append(new_Del_Right);
		result.append(", DelChangeStatus: ");
		result.append(delChangeStatus);
		result.append(", new_HideOnLine_Left: ");
		result.append(new_HideOnLine_Left);
		result.append(", new_HideOnLine_Right: ");
		result.append(new_HideOnLine_Right);
		result.append(", HideOnLineChangeStatus: ");
		result.append(hideOnLineChangeStatus);
		result.append(", new_Hierarchy_Left: ");
		result.append(new_Hierarchy_Left);
		result.append(", new_Hierarchy_Right: ");
		result.append(new_Hierarchy_Right);
		result.append(", HierarchyChangeStatus: ");
		result.append(hierarchyChangeStatus);
		result.append(", new_MasterFactorID_Left: ");
		result.append(new_MasterFactorID_Left);
		result.append(", new_MasterFactorID_Right: ");
		result.append(new_MasterFactorID_Right);
		result.append(", MasterFactorIDChangeStatus: ");
		result.append(masterFactorIDChangeStatus);
		result.append(')');
		return result.toString();
	}

} //DiffLeafFactorImpl
