package dsmcompare.mmextension.extensions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import dsmcompare.mmextension.utils.EMFUtils;

public class DiffReferenceWithCustomMap implements IMMExtension {
	
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
					EClassifier diff_kindEClassifier = srcClass.getEPackage().getEClassifier("_mapAscDiffKind");
					EDataType stringDataType=EcorePackage.eINSTANCE.getEString();				
					EMFUtils.createEReference("diff_kind", (EClass) diffRefClass, diff_kindEClassifier, 1, -1, true);
					EMFUtils.createEReference("diff" + reference.getName(), srcClass, diffRefClass, 0, -1, true);
					EMFUtils.createEReference("eType", (EClass)diffRefClass, tarClass, 1, 1, false);
				}
			}
		}
	}

}
