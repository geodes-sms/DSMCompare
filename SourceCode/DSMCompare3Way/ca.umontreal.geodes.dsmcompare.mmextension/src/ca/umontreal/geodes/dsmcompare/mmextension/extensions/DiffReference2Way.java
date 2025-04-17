package ca.umontreal.geodes.dsmcompare.mmextension.extensions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;

public class DiffReference2Way implements IMMExtension {
	
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
					diffRefClass = DsmcHelpers.createEClass(name, true, pack);	
					DsmcHelpers.createEAttribute("diff_kind", (EClass) diffRefClass, 
							pack.getEClassifier("DiffKind"), 1, 1, false, false, true, false, "NON");
					DsmcHelpers.createEReference("diff" + reference.getName(), 
							srcClass, diffRefClass, 0, -1, true);
					DsmcHelpers.createEReference("eType", (EClass)diffRefClass, tarClass, 1, 1, false);
				}
			}
		}
	}

}
