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

public class DiffClass implements IMMExtension {

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
				EAttribute attrDiff_kind_Left = 
						EMFUtils.createEAttribute("diff_kind_Left", diffClass, pack.getEClassifier("DiffKind"), 1, 1, 
								false, false, true, false, "NON");
				EAttribute attrDiff_kind_Right = 
						EMFUtils.createEAttribute("diff_kind_Right", diffClass, pack.getEClassifier("DiffKind"), 1, 1, 
								false, false, true, false, "NON");
				
				//EMFUtils.createEAttribute("isEqChange", diffClass, EcorePackage.eINSTANCE.getEBoolean(),1, 1, false, false, true, false);
				EMFUtils.createEAttribute("changeStatus", diffClass, pack.getEClassifier("ChangeStatus"), 1, 1, 
						false, false, true, false, "NON");
				
				//EDataType stringDataType = EcorePackage.eINSTANCE.getEString();				
				
				
				for(EAttribute attr:srcClass.getEAllAttributes())
				{
					if(attr.getName().compareToIgnoreCase("__idKDM") != 0) 
					{
						String newAttributeNameLeft="new_"+attr.getName()+"_Left";
						String newAttributeNameRight="new_"+attr.getName()+"_Right";
						//String isEqChange = attr.getName()+"_isEqChange";
						String attrChangeStatus = attr.getName()+"ChangeStatus";
						EClass listClassType = null;
						EDataType attrType = attr.getEAttributeType();
						if(attr.getUpperBound() ==1) {	
							EMFUtils.createEAttribute(newAttributeNameLeft,  diffClass, attrType, 1, 1, 
									false, false, true, false);	
							EMFUtils.createEAttribute(newAttributeNameRight, diffClass, attrType, 1, 1, 
									false, false, true, false);	
						}
						else{	
							listClassType = EMFUtils.createListType(attrType, pack, attr.getLowerBound(), attr.getUpperBound(), 
									attr.isTransient(), attr.isOrdered(), attr.isUnique());
							EMFUtils.createEReference(newAttributeNameLeft,  diffClass, listClassType, 1, 1, true);
							EMFUtils.createEReference(newAttributeNameRight, diffClass, listClassType, 1, 1, true);							
						}	
						//EMFUtils.createEAttribute(isEqChange, diffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, true, false);	
						EMFUtils.createEAttribute(attrChangeStatus, diffClass, pack.getEClassifier("ChangeStatus"), 1, 1, 
								false, false, true, false, "NON");
					}						
				}			
			}
		}
	}
}
