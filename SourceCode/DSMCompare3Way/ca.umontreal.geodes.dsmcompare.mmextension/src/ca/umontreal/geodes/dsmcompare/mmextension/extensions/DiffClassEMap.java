package ca.umontreal.geodes.dsmcompare.mmextension.extensions;


import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

public class DiffClassEMap implements IMMExtension {

	@Override
	public void extend(EObject element) {
		if (element instanceof EClass) {
			EClass srcClass = (EClass)element;
			EObject root=DsmcHelpers.getTheRoot(srcClass.getEPackage());
			EPackage pack=	srcClass.getEPackage();
			String srcClassName = srcClass.getName();
		
			if (!srcClass.isAbstract()) { 
				EClass diffClass = DsmcHelpers.createEClass("Diff" + srcClassName, true, pack, srcClass);
				EGenericType diff_kindSourceMap = 
						DsmcHelpers.createMapType(EcorePackage.eINSTANCE.getEString(), 
								srcClass.getEPackage().getEClassifier("DiffKind"));
				EDataType stringDataType = EcorePackage.eINSTANCE.getEString();				
				DsmcHelpers.createEAttribute("diff_kind", diffClass,diff_kindSourceMap, 1, 1, false, true);					
				for(EAttribute attr:srcClass.getEAllAttributes())
				{	
					EDataType primitiveObjectType = DsmcHelpers.primitiveToObject(attr.getEAttributeType());
					if(!attr.isID()) {
						String newAttributeName="new_"+attr.getName();
						if(attr.getUpperBound() ==1) {
							EGenericType attributeSourceMap = DsmcHelpers.createMapType(stringDataType, attr.getEType());
							if(primitiveObjectType != attr.getEType())
								attributeSourceMap = DsmcHelpers.createMapType(stringDataType, primitiveObjectType);	
							
							DsmcHelpers.createEAttribute(newAttributeName, diffClass, attributeSourceMap, attr.getLowerBound(), 1, false, true);
						}else{								
							EGenericType valueType = EcoreFactory.eINSTANCE.createEGenericType();
							if(primitiveObjectType != attr.getEType())
							{
								valueType.setEClassifier(primitiveObjectType);									
							}
							else {
								valueType.setEClassifier(attr.getEType());
							}							
							EGenericType attributeSourceMap = DsmcHelpers.createMapListType(stringDataType, valueType);	
							DsmcHelpers.createEAttribute(newAttributeName, diffClass, attributeSourceMap, attr.getLowerBound(), 1, false, true);
						}
					}						
				}
				EAttribute attrIsForbidden = DsmcHelpers.createEAttribute("isForbidden", diffClass, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false, false, false);
				attrIsForbidden.setDefaultValue(false);	
			}
		}
	}
	
}
