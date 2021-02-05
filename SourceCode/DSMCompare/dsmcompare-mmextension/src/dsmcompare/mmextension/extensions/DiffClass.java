package dsmcompare.mmextension.extensions;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

//import org.eclipse.emf.ecore.EClassifier;

import dsmcompare.mmextension.utils.EMFUtils;

public class DiffClass implements IMMExtension {

	@Override
	public void extend(EObject element) {
		if (element instanceof EClass) {
			EClass srcClass = (EClass)element;
			EObject root=EMFUtils.getTheRoot(srcClass.getEPackage());
			//if(!element.equals(root))//!srcClass.getName().contains("Root"))////"Root" is the Root element
			{				
				if (!srcClass.isAbstract()) { 
					EClass diffClass = EMFUtils.createEClass("Diff" + srcClass.getName(), true, srcClass.getEPackage(), srcClass);
					EMFUtils.createEAttribute("operation", diffClass,srcClass.getEPackage().getEClassifier("ClassOp"), 1, 1, false);			
					for(EAttribute attr:srcClass.getEAllAttributes())//.getEAttributes())
					{
						EMFUtils.createEAttribute("new_"+attr.getName(), diffClass,attr.getEType(), attr.getLowerBound(), attr.getUpperBound(), false);
						//EMFUtils.createEAttribute("post_"+attr.getName(), diffClass,EcorePackage.Literals.ESTRING, attr.getLowerBound(), attr.getUpperBound());
					}
				}
				else
				{

				}
			}

			//srcClass.getEAttributes()
		}
	}
	
}
