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

public class DiffClassWithCustomMap implements IMMExtension {

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
				EClassifier diff_kindEClassifier = srcClass.getEPackage().getEClassifier("_mapClassDiffKind");
				EDataType stringDataType = EcorePackage.eINSTANCE.getEString();				
				EMFUtils.createEReference("diff_kind", diffClass, diff_kindEClassifier, 1, -1, true);	
				for(EAttribute attr:srcClass.getEAllAttributes())
				{
					if(!attr.isID()) {
						String newAttributeName="new_"+attr.getName();
						EClass customMapType = null;
						EDataType attrType = attr.getEAttributeType();// EMFUtils.primitiveToObject(attr.getEAttributeType());
						if(attr.getUpperBound() ==1) {	
							customMapType = EMFUtils.createCustomMapType(stringDataType, attrType, pack, 1, 1, "", false);	
						}
						else{	
							customMapType = EMFUtils.createCustomMapType(stringDataType, attrType, pack, 1, -1, "", false);	
						}
						EMFUtils.createEReference(newAttributeName, diffClass, customMapType, 0, -1, true);
					}						
				}
				//EAttribute attrIsForbidden = EMFUtils.createEAttribute("isForbidden", diffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false);
				//attrIsForbidden.setDefaultValue(false);
				
			}
		}
	}
}
