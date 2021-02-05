package dsmcompare.mmextension.extensions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dsmcompare.mmextension.utils.EMFUtils;

public class DiffReference implements IMMExtension {
	
	@Override
	public void extend (EObject element) {
		if (element instanceof EReference) {
			EReference reference=(EReference)element;
			EClass      srcClass  = reference.getEContainingClass();
			EClassifier tarClass  = reference.getEType();				
			if(!srcClass.getName().contains("Root"))//"Root" is the Root element
			{				
				EPackage    pack      = srcClass.getEPackage();
				String      name     = "Diff" + srcClass.getName() + "_" + reference.getName(); 
				EClassifier diffRefClass = pack.getEClassifier(name);
				if (diffRefClass==null || !(diffRefClass instanceof EClass)) {
					diffRefClass = EMFUtils.createEClass(name, true, pack);
					EMFUtils.createEAttribute("operation", (EClass)diffRefClass,srcClass.getEPackage().getEClassifier("AscOp"), 1, 1, false);	
					
					EMFUtils.createEReference("diff" + reference.getName(), srcClass, diffRefClass, 0, reference.getUpperBound()==-1? -1 : 2*reference.getUpperBound(), true);
					EMFUtils.createEReference("eType", (EClass)diffRefClass, tarClass, 1, 1, false);
				}
			}
		}
	}

}
