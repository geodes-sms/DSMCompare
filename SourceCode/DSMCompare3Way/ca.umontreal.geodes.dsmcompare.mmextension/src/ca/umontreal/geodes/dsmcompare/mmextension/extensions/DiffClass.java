package ca.umontreal.geodes.dsmcompare.mmextension.extensions;


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

import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;

public class DiffClass implements IMMExtension {

	@Override
	public void extend(EObject element) {
		if (element instanceof EClass) {
			EClass srcClass = (EClass)element;
			EObject root=DsmcHelpers.getTheRoot(srcClass.getEPackage());
			EPackage pack=	srcClass.getEPackage();
			String srcClassName = srcClass.getName();
			if (!srcClass.isAbstract()) { 
				EClass diffClass = 
						DsmcHelpers.createEClass("Diff" + srcClassName, true, pack, srcClass);
				EAttribute attrDiff_kind_Left = 
						DsmcHelpers.createEAttribute("diff_kind_Left", diffClass, pack.getEClassifier("DiffKind"), 1, 1, 
								false, false, true, false, "NON");
				EAttribute attrDiff_kind_Right = 
						DsmcHelpers.createEAttribute("diff_kind_Right", diffClass, pack.getEClassifier("DiffKind"), 1, 1, 
								false, false, true, false, "NON");
				//To prevent deleting a diff element, in addition to the rule metamodel, We add a filter attribute to diff model. In this way instead of deleting we will make the diff element inviable 
				DsmcHelpers.createEAttribute("filter", diffClass, EcorePackage.eINSTANCE.getEBoolean(), 
						1, 1, false, false, true, true);
				DsmcHelpers.createEAttribute("isMerged", diffClass, EcorePackage.eINSTANCE.getEBoolean(), 
						1, 1, false, false, true, true);
				
				//DsmcHelpers.createEAttribute("isEqChange", diffClass, EcorePackage.eINSTANCE.getEBoolean(),1, 1, false, false, true, false);
				DsmcHelpers.createEAttribute("changeStatus", diffClass, pack.getEClassifier("ChangeStatus"), 1, 1, 
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
							DsmcHelpers.createEAttribute(newAttributeNameLeft,  diffClass, attrType, 1, 1, 
									false, false, true, false);	
							DsmcHelpers.createEAttribute(newAttributeNameRight, diffClass, attrType, 1, 1, 
									false, false, true, false);	
						}
						else{	
							listClassType = DsmcHelpers.createListType(attrType, pack, attr.getLowerBound(), attr.getUpperBound(), 
									attr.isTransient(), attr.isOrdered(), attr.isUnique());
							DsmcHelpers.createEReference(newAttributeNameLeft,  diffClass, listClassType, 1, 1, true);
							DsmcHelpers.createEReference(newAttributeNameRight, diffClass, listClassType, 1, 1, true);							
						}	
						//DsmcHelpers.createEAttribute(isEqChange, diffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, true, false);	
						DsmcHelpers.createEAttribute(attrChangeStatus, diffClass, pack.getEClassifier("ChangeStatus"), 1, 1, 
								false, false, true, false, "NON");					}						
				}			
			}
		}
	}
}
