package dsmcompare.mmextension.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EEnum;
//import org.eclipse.emf.ecore.EEnumLiteral;
//import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

public class EMFUtils {
	
	static public enum ClassOp			
	{
		ADD, DELETE, MODIFY;
	}
	 
	static public enum AscOp
	{
		ADD, DELETE;
	}
	
	static public EClass createEClass (String name, boolean concrete, EPackage container, EClass... superclasses) {
		EClass cl = EcoreFactory.eINSTANCE.createEClass();
		cl.setName(name);
		cl.setAbstract(!concrete);
		cl.getESuperTypes().addAll(Arrays.asList(superclasses));
		if (container != null) container.getEClassifiers().add(cl);
		return cl;
	}
	
	static public EReference createEReference (String name, EClass source, EClassifier target, int lowerbound, int upperbound, boolean containment) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(name);
		ref.setEType(target);
		ref.setLowerBound(lowerbound);
		ref.setUpperBound(upperbound);
		ref.setContainment(containment);
		source.getEStructuralFeatures().add(ref);
		return ref;
	}
	
	static public EAttribute createEAttribute (String name, EClass source, EClassifier type, int lowerbound, int upperbound, boolean isID) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(name);
		att.setEType(type);
		att.setLowerBound(lowerbound);
		att.setUpperBound(upperbound);
		att.setID(isID);
		source.getEStructuralFeatures().add(att);
		return att;
	}
	
	 public static EObject getEObjectByClassName(EPackage pack,String className)
	 {
		 try
		 {
			 EObject eObj = pack.eContents().stream().filter(c -> getAttrValueByAttrName(c, "name").toString().toLowerCase().contains(className.toLowerCase())).findFirst().get();
			 return eObj;
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
	 }
	 
	 //Find EAttribute by Name from EObject	 
	 public static EAttribute getEAttributeByName(EObject eObj,String aAttrName)
	 {
		 try
		 {
		 return eObj.eClass().getEAllAttributes().stream().filter(a -> a.getName().toLowerCase().contains(aAttrName.toLowerCase())).findFirst().get();
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
	 }	
	 
		public static Object getAttrValueByAttrName(EObject obj, String AttrName){
		 	try{
		 		return  obj.eGet(getEAttributeByName(obj,AttrName));
		 	}
		 	catch(Exception ex){
		 		return false;
		 	}
		 }
		

	//!!!!!!!!!!!!!!!!!!!! It is duplicated
	  static public final List<EObject> getReferencingObjects(EObject target) 
	 {
	    LinkedList<EObject> result = new LinkedList<EObject>();
	    
	    Collection<EStructuralFeature.Setting> settings = UsageCrossReferencer.find(target, target.eResource().getResourceSet());
	    //Same as above //CrossReferencer.find(target.eResource().getContents()).get(target);
	    //same as above//UsageCrossReferencer.find(source.eResource().getContents()).get(source);
	    
	    EList<EReference> refs=target.eClass().getEAllContainments();
	    
	    if (settings == null) {
	        return Collections.emptyList();
	    }
	    
	    for (Setting setting : settings) {
	        result.add(setting.getEObject());
	        //System.out.println("setting.getEStructuralFeature: "+setting.getEStructuralFeature().toString());
	    }
	    return result;
	}
	  
	  
	 
	  static public EObject Root=null;
	  static public EObject getTheRoot(EPackage pack)
	  {
			List<EObject> elmWithoutRoot=pack.eContents().stream().filter(a -> a.eClass() == EcorePackage.eINSTANCE.getEClass() && getReferencingObjects(a).size()==0).collect(Collectors.toList());
			//EcorePackage.eINSTANCE.getEClass() means that root should be an EClass type
			//elmWithoutRoot.forEach(System.out::println);			
			elmWithoutRoot.forEach(x -> 
			{				
				if(x.eCrossReferences().stream().filter(e -> e.eClass().getName().toLowerCase().contains("egenerictype")).collect(Collectors.toList()).size()==0)
					Root=x;					
			});		
			return Root;
	  }
	 
	
}

/*
     static public enum OpType			
	{
		ClassType,AssociationType;
	}    
	
 	static public EEnum eeClassOp = EcoreFactory.eINSTANCE.createEEnum();
	{
		eeClassOp.setName("ClassOp");
		for(ClassOp cOp:ClassOp.values())
		{
			EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
			eEnumLiteral.setName(cOp.name());
		    eEnumLiteral.setLiteral(cOp.name());
		    eEnumLiteral.setValue(cOp.ordinal()); 
		    eeClassOp.getELiterals().add(eEnumLiteral);	
		}
	}

	static public EEnum eeAscOp = EcoreFactory.eINSTANCE.createEEnum();
	{
		eeAscOp.setName("AscOp");
		for(AscOp ascOp:AscOp.values())
		{
			EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
			eEnumLiteral.setName(ascOp.name());
		    eEnumLiteral.setLiteral(ascOp.name());
		    eEnumLiteral.setValue(ascOp.ordinal()); 
		    eeAscOp.getELiterals().add(eEnumLiteral);	
		}
	}
 */
