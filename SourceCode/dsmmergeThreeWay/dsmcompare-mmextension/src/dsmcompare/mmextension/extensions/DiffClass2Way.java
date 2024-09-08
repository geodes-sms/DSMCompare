package dsmcompare.mmextension.extensions;


import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ETypeParameterImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;

//import org.eclipse.emf.ecore.EClassifier;

import dsmcompare.mmextension.utils.EMFUtils;

public class DiffClass2Way implements IMMExtension {

	@Override
	public void extend(EObject element) {
		if (element instanceof EClass) {
			EClass srcClass = (EClass)element;
			EObject root=EMFUtils.getTheRoot(srcClass.getEPackage());
			EPackage pack=	srcClass.getEPackage();
			String srcClassName = srcClass.getName();
			if (!srcClass.isAbstract()) { 
				EClass diffClass = 
						EMFUtils.createEClass("Diff" + srcClassName, true, pack, srcClass);
				EAttribute attrDiff_kind = 
						EMFUtils.createEAttribute("diff_kind", diffClass, 
								pack.getEClassifier("DiffKind"), 1, 1, false, false, true, false, "NON");
				for(EAttribute attr:srcClass.getEAllAttributes())
				{
					if(attr.getName().compareToIgnoreCase("__idKDM") != 0) 
					{
						String newAttributeName="new_"+attr.getName();
						EClass listClassType = null;
						EDataType attrType = attr.getEAttributeType();
						if(attr.getUpperBound() ==1) {	
							EMFUtils.createEAttribute(newAttributeName,  diffClass, attrType, 1, 1, 
									false, false, true, false);	
						}
						else{	
							listClassType = EMFUtils.createListType(attrType, pack, attr.getLowerBound(), 
									attr.getUpperBound(), attr.isTransient(), attr.isOrdered(), attr.isUnique());
							EMFUtils.createEReference(newAttributeName,  diffClass, listClassType, 1, 1, true);
						}	
					}						
				}			
			}
		}
	}
}
