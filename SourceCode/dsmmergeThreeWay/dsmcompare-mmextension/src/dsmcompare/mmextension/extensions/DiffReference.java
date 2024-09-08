package dsmcompare.mmextension.extensions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import dsmcompare.mmextension.utils.EMFUtils;

public class DiffReference implements IMMExtension {
	
	@Override
	public void extend (EObject element) {
		if (element instanceof EReference) {
			EReference reference=(EReference)element;
			EClass      srcClass  = reference.getEContainingClass();
			EClassifier tarClass  = reference.getEType();				
			if(!srcClass.getName().contains("Root"))//Need to revise
			{				
				EPackage    pack      = srcClass.getEPackage();
				String      name     = "Diff" + srcClass.getName() + "_" + reference.getName(); 
				EClassifier diffRefClass = pack.getEClassifier(name);
				if (diffRefClass==null || !(diffRefClass instanceof EClass)) {
					diffRefClass = EMFUtils.createEClass(name, true, pack);	
					EMFUtils.createEAttribute("diff_kind_Left", (EClass) diffRefClass, pack.getEClassifier("DiffKind"), 1, 1,
							false, false, true, false, "NON");
					EMFUtils.createEAttribute("diff_kind_Right", (EClass) diffRefClass, pack.getEClassifier("DiffKind"), 1, 1,
							false, false, true, false, "NON");
					//EMFUtils.createEAttribute("isEqChange", (EClass) diffRefClass, EcorePackage.eINSTANCE.getEBoolean(),1, 1, false, false, true, false);
					EMFUtils.createEAttribute("changeStatus", (EClass) diffRefClass, pack.getEClassifier("ChangeStatus"), 1, 1, 
							false, false, true, false, "NON");
					EMFUtils.createEReference("diff" + reference.getName(), srcClass, diffRefClass, 0, -1, true);
					EMFUtils.createEReference("eType", (EClass)diffRefClass, tarClass, 1, 1, false);
				}
			}
		}
	}

}
