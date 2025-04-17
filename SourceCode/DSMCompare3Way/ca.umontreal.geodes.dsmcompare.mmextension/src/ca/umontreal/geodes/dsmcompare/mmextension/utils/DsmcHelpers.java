package ca.umontreal.geodes.dsmcompare.mmextension.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.ReferenceChange;
//import org.eclipse.emf.compare.DifferenceKind;
//import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EEnum;
//import org.eclipse.emf.ecore.EEnumLiteral;
//import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;



public class DsmcHelpers {
	
	
	public static String formatContainsStringConstraint(String varInLhs, String varInRhs, boolean equalOrNotEqual) {
		varInRhs = varInRhs.replace("\"","");
		if(equalOrNotEqual)
			return String.format("(\"%s.contains('%s')\" ==  'true' )",varInLhs, varInRhs, equalOrNotEqual);
		else 
			return String.format("(\"%s.contains('%s')\" !=  'true' )",varInLhs, varInRhs, equalOrNotEqual);
	}
	
	 public static ResourceSet setResourceSet(String rPath, String eNSURI, Object eINS ) 
	 {
		 
		File v = new File(rPath);
		URI uri = URI.createFileURI(v.getPath()); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getPackageRegistry().put(eNSURI, eINS);
		resourceSet.getResource(uri, true);		
		return resourceSet;
	  }
	
	public static Set<EObject> getAllNodes(Resource resource){
		//Set<EObject> allNodes = new HashSet<EObject>();
		ArrayList<EObject> ns= new ArrayList<EObject>();
		
	  	for(int i=0; i< resource.getContents().size();i++)
	  	{
	  		EObject node = resource.getContents().get(i);
	  		getAllNodesHelperRecursive(node, ns);
	  	}
	  	
	  	Set<EObject> allDsDiffRuleNodesSet = new HashSet<EObject>(ns);		
		return allDsDiffRuleNodesSet;
	}
		
	
	public static boolean setContainment(EObject container, EReference ref, EObject containment) {//Feature
		try
		{				
			((EList<EObject>) container.eGet(ref)).add((EObject) containment);	
		}
		catch(Exception ex)
		{
			try {
				container.eSet(ref,containment);}
			catch(Exception ex2)
			{
				 System.out.println("Error: SetEFeature(EObject ERoot");
				 System.out.println("ex2 : " + ex2.getLocalizedMessage());
				 return false;
			}
		}
		return true;
	}
	
	public static EObject clone(EObject object) {//Clone EAttributes   
		EClass 		objectEClass 	= object.eClass();
		EFactory factory = objectEClass.getEPackage().getEFactoryInstance();
		
		EObject cloneObject = factory.create(objectEClass);			
		for(EAttribute attr:objectEClass.getEAllAttributes())
		{
			cloneObject.eSet(attr, object.eGet(attr));
		}
		return cloneObject;
	}
	
	public static EObject copyToType(EObject copyFromObject, EClass copyToEClass) {//Clone EAttributes  
		EFactory copyToFactory = copyToEClass.getEPackage().getEFactoryInstance();		
		EObject copyToObject = copyToFactory.create(copyToEClass);			
		for(EAttribute attr:copyToEClass.getEAllAttributes())
		{			
			copyToObject.eSet(attr, getAttrValueByAttrNameNullDefault(copyFromObject, attr.getName()));
		}
		return copyToObject;
	}
	
	//Check Equality of to EObjects In terms of type and Attributes
	public static boolean isEqual(EObject object1, EObject object2) {
		if(!object1.eClass().equals(object2.eClass()))
			return false;
		for(EAttribute attr:object1.eClass().getEAllAttributes()) {
			Object attrVal1 = getAttrValueByAttrNameNullDefault(object1,attr.getName());
			Object attrVal2 = getAttrValueByAttrNameNullDefault(object2,attr.getName());
			if((attrVal1 != null && attrVal2 != null && !attrVal1.equals(attrVal2)) || (attrVal1 == null && attrVal2 != null) || (attrVal1 != null && attrVal2 == null) ) {
				return false;
			}
		}		
		return true;
	}
	
	//Check Equality of to EObjects In terms of Attributes but types will not be checked
	//We consider object1 as base, and we do not consider extra attributes of object2 which are not exist in object1
	public static float isEqualAttributesinCaAndDiff(EObject objectV012, EObject objectDiff) {
		//We need to have attrChangeStatus = NON, Contradicting, Equivalent, changedInLeft, changedInRight
		try {			
		
			EAttribute idAttrV = objectV012.eClass().getEIDAttribute();
			EAttribute idAttrD = objectDiff.eClass().getEIDAttribute();
			Object idAttrV_Value = getAttrValueByAttrNameNullDefault(objectV012,idAttrV.getName());
			Object idAttrD_Value = getAttrValueByAttrNameNullDefault(objectDiff,idAttrD.getName());
			
			
			if((objectDiff.eClass().equals(objectV012.eClass()) 
					|| objectDiff.eClass().getEAllSuperTypes().contains(objectV012.eClass()))
				&& ((idAttrV == null && idAttrD ==null) || (idAttrV != null && idAttrD !=null 
					&&  ((idAttrV_Value == null && idAttrD_Value == null) 
							|| (idAttrV_Value.equals(idAttrD_Value)) ) )))
			{		
				float size = objectV012.eClass().getEAllAttributes().size();
				if(size == 0)
					return 1;
				float similarity = 1;	//It already idAttrV_Value.equals(idAttrD_Value)
				for(EAttribute attr:objectV012.eClass().getEAllAttributes()) 
				{
					if(attr.equals(idAttrV))
						continue;
					
					Object attrValInV012 = getAttrValueByAttrNameNullDefault(objectV012,attr.getName());
					Object attrValCA = getAttrValueByAttrNameNullDefault(objectDiff,attr.getName());
					Object attrValLeft = getAttrValueByAttrNameNullDefault(objectDiff,"new_"+attr.getName()+"_Leftt");
					Object attrValRight = getAttrValueByAttrNameNullDefault(objectDiff,"new_"+attr.getName()+"_Right");
					if( (attrValInV012 != null && 
							((attrValCA != null && !attrValInV012.equals(attrValCA)) 
							&& (attrValLeft != null && !attrValInV012.equals(attrValLeft))
							&& (attrValRight != null && !attrValInV012.equals(attrValRight))
							))
							|| (attrValInV012 == null && (attrValCA != null && attrValRight != null && attrValRight != null))
							|| (attrValInV012 != null && (attrValCA == null && attrValRight == null && attrValRight == null)))
					{
						similarity -= 1;
					}
					else {
						similarity += 1;
					}
				}		
				return similarity/size;
			}
			return 0;	
		}catch(Exception ex) {
			return 0;
		}
	}
	
	
	public static boolean hasSameValueForIdAttribute(EObject object1, EObject object2) {
		if(!object1.eClass().equals(object2.eClass()))
			return false;
		
		List<EAttribute> idAttrs = object1.eClass().getEAllAttributes().stream().filter(a->a.isID()).collect(Collectors.toList());
		if(idAttrs.size()==0)
			return false;
		
		Object attrVal1 = getAttrValueByAttrNameNullDefault(object1,idAttrs.get(0).getName());
		Object attrVal2 = getAttrValueByAttrNameNullDefault(object2,idAttrs.get(0).getName());
		
		if((attrVal1 != null && attrVal2 != null && !attrVal1.equals(attrVal2)) || (attrVal1 == null && attrVal2 != null) || (attrVal1 != null && attrVal2 == null) ) {
			return false;
		}
		return true;
	}
	
	
	
	//Sort ArrayList of EObjects by propertyName
	public static ArrayList sortByPropertyName(ArrayList<EObject> list, String propertyName) {
		Collections.sort(list, new Comparator<EObject>(){
		    public int compare(EObject n1, EObject n2) {
		    	int id1=(int)(DsmcHelpers.getAttrValueByAttrNameNullDefault(n1,propertyName));
		    	int id2=(int)(DsmcHelpers.getAttrValueByAttrNameNullDefault(n2,propertyName));
		        return id1-id2;
		    }
		});
		return list;
	}
	
	
	public static Comparison loadEMFCompareComparisonFromFile(String ComparisonFileVirtualPath) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();

        // register UML
        Map packageRegistry = resourceSet.getPackageRegistry();
        packageRegistry.put(org.eclipse.emf.compare.ComparePackage.eNS_URI, org.eclipse.emf.compare.ComparePackage.eINSTANCE);
        //packageRegistry.put(list.ListPackage.eNS_URI, list.ListPackage.eINSTANCE);

        // Register XML resource as UMLResource.Factory.Instance
        Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
        extensionFactoryMap.put("compare", new XMIResourceFactoryImpl());
        Resource resource = (Resource) resourceSet.createResource(URI.createURI(ComparisonFileVirtualPath));
        // try to load the file into resource
        resource.load(null);		
        Comparison comparison = (Comparison) resource.getContents().get(0);	
		
		return comparison;
	}
	
	
	public static void removeDuplicatesFromCsv(String filePath, boolean doOrder) throws IOException {
		File csvFile = new File(filePath);
		Scanner sc = new Scanner(csvFile);  
		sc.useDelimiter(";");   //sets the delimiter pattern 
		ArrayList<String> csvEntries = new ArrayList<String>();
		while (sc.hasNextLine())  //returns a boolean value  
		{  
			String nextLine = sc.nextLine();
			if(!csvEntries.contains(nextLine))
				csvEntries.add(nextLine);			
		}   
		sc.close();  //closes the scanner  
		
		FileWriter csvWriter = new FileWriter(filePath);		
		if(doOrder && csvEntries.size()>=2) {
			String header = csvEntries.remove(0);			
			//csvEntries.sort(null);
			Collections.sort(csvEntries);
			csvEntries.add(0, header);
		}
		
		for(String str: csvEntries) {
			csvWriter.write(str + System.lineSeparator());
			}
		csvWriter.close();		
	}
	
	public static ResourceSet getResourceSetXMI(String resourceSetPath, String eNSURI, Object eINS ){	
		ResourceSet resourceSet = null;
		try {
			File v = new File(resourceSetPath);
			URI uri = URI.createFileURI(v.getPath()); 
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resourceSet = new ResourceSetImpl();		
			resourceSet.getPackageRegistry().put(eNSURI, eINS);
			resourceSet.getResource(uri, true);		
			return resourceSet;
		}
		catch(Exception ex) {
			//System.out.println("Problem getting resource set: " + ex.getMessage());
		}
		return resourceSet;
	}
	
	public static ResourceSet getResourceSet(String rPath, String eNSURI, Object eINS ) 
	 {		 
		File v = new File(rPath);
		URI uri = URI.createFileURI(v.getPath()); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getPackageRegistry().put(eNSURI, eINS);
		resourceSet.getResource(uri, true);		
		return resourceSet;
	  }
	
	
	public static Resource getResource(String resourcePath, ResourceSet resourceSet) {		
		var resourceFile = new File(resourcePath);				
		var resource = resourceSet.getResource(URI.createFileURI(resourceFile.getAbsolutePath()), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resource;
	}
	
	
	public static Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
	     for (String fileext : fileextensions) {
	        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
	     }		
	     URI uri = URI.createFileURI(outputFile);
	     Resource resource = rs.createResource(uri);
	     ((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap());
	     return resource;
	}
	
	public static void saveResource(Resource resource) {
	     Map saveOptions = ((XMLResource)resource).getDefaultSaveOptions();
	     saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
	     saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
	     try {
	        resource.save(saveOptions);
	     } catch (IOException e) {
	        throw new RuntimeException(e);
	     }
	}
	
	
	public static Resource getResource(EPackage ePackage, String resourcePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
        // register package
        Map packageRegistry = resourceSet.getPackageRegistry();
        packageRegistry.put(ePackage.getNsURI(), ePackage.getEFactoryInstance());
        // Register XML resource as UMLResource.Factory.Instance
        Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
        extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
        Resource resource = (Resource) resourceSet.createResource(URI.createFileURI(resourcePath));
        // try to load the file into resource
        try {
			resource.load(null);
			EObject rootDSDiff5 = resource.getContents().get(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        return resource;
	}
	
	public static ResourceSet getResourceSet(EPackage ePackage, String resourcePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
        // register package
        Map packageRegistry = resourceSet.getPackageRegistry();
        packageRegistry.put(ePackage.getNsURI(), ePackage.getEFactoryInstance());
        // Register XML resource as UMLResource.Factory.Instance
        Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
        extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
        Resource resource = (Resource) resourceSet.createResource(URI.createFileURI(resourcePath));
        return resource.getResourceSet();
	}
	
	static public String setAuthor(String ChangeStatus,String n31diff_kind_Left,String n31diff_kind_Right) {
		return "\"EQUAL\"";
	}
	
	static public class SrcRefTrgtMM {
		public EClass 		source= null;
		public EReference 	eReference= null;
		public EClass 		target= null;
		public SrcRefTrgtMM(EClass s, EReference r, EClass t){
			source=s; eReference=r;target=t;
		}
	}
	static public class SrcRefTrgt {
		public EObject 		source= null;
		public EReference 	eReference= null;
		public EObject 		target= null;
		public SrcRefTrgt(EObject s, EReference r, EObject t){
			source=s; eReference=r;target=t;
		}
	}
	
	static public boolean SetEFeature(EObject ERoot, EStructuralFeature feature, Object object){
		 if(ERoot == null || feature == null) {
			 //System.out.println("Cannot set the feature!");
			 //System.out.println("ERoot : " + ERoot);
			 //System.out.println("feature : " + feature);
			 //System.out.println("newValue : " + object);
			 return false;
		 }
			 
		try
		{
			((EList<EObject>) ERoot.eGet(feature)).add((EObject) object);	
		}
		catch(Exception ex)
		{
			try {
			ERoot.eSet(feature,object);
			}
			catch(Exception ex2) {
				return false;
			}
		}
		return true;
	 }
	
	
	static public boolean UnSetEFeature(EObject ERoot, EStructuralFeature feature){
		 if(ERoot == null || feature == null) {
			 return false;
		 }
			 
		try
		{
			((EList<EObject>) ERoot.eGet(feature)).clear();	
		}
		catch(Exception ex)
		{
			try {
			ERoot.eSet(feature,null);
			}
			catch(Exception ex2) {
				return false;
			}
		}
		return true;
	 }
	
	
	
	static public boolean setAttribute(EObject object, String attributeName, Object attrValue) 
	 {	 
		 try {			 
		 	 EAttribute attribute = getEAttributeByName(object, attributeName);
		 	 if(attribute == null)
		 		 return false;
		 	 SetEFeature(object, attribute, attrValue);
			 
		 }catch(Throwable ex) {
			System.out.println("Cannot setAttribute  " + attributeName + " - " + ex.getMessage());
			return false;
		 }
		 return true;
	 }
	
	
	static public class RefTrgtMM {
		public EReference 	eReference= null;
		public EClass 		target= null;
	}
	static public class SrcRefMM {
		public EClass 		source= null;
		public EReference 	eReference= null;
	}
	
	static public enum ChangeStatus // EQUIVALENT: Fine-grained equivalent change
	{
		NON, EQUIVALENT, CONTRADICTING, 
		MERGE_ADD, MERGE_DELETE, MERGE_MODIFY,
		MERGE_DELETE_CREATE;
		// EQUIVALENT		: 	Fine-grained equivalent change
		// CONTRADICTING	: 	Fine-grained contradicting change
		//	Create - MERGE_ADD
		//	Preserve - MERGE_DELETE
		//	Preserve - MERGE_MODIFY
		//	Create - MERGE_DELETE_CREATE (used only in the transforming DsCRRules to HCRRules)
		
	}	
	
	static public enum AUTHOR //Version			
	{
		NON, LEFT, RIGHT, EQUAL, MIXED; 
		// LEFT:		Done by left user
		// LEFT:		Done by right user
		// EQUIVALENT:	Same/Identical/Pseudo change/conflict
		// LEFT:		A part of semantic differences are belong to the left version and a part related to right version
	}
	
	static public enum DiffKind			
	{
		NON, ADD, DELETE, MODIFY;
	}
	
	static public enum ConflictResolutionType			
	{
		Pending,
		Resolved;
		//Automatic,
		//Manual;//,
		//Suggestion;
	}
	
	static public enum ConflictResolutionStrategy			
	{
		NIL,										//Not resolved yet
		Keep_Left, 									//Manual
		Keep_Right, 								//Manual  
		Keep_Semantic_Difference, 					//Automatic
		Apply_None, 								//Manual  
		Apply_Left_Then_Right, 						//Manual (Update/Update) 
		Apply_Right_Then_Left, 						//Manual (Update/Update) 	
		Apply_A_User_Defined_Resolution_Pattern, 	//Automatic	
		Custom_Change_At_Time_Of_Merge,				//Manual 
		Suggest_A_Resolution_Needing_Approval;		//Automatic	Suggestion - Manual approval
		//Keep_Semantic_Diff, 						//Automatic (transformed to Keep_Left, Keep_Right)
		//Keep_Semantic_Diff_With_Less_Fine_Differences,
		//Keep_Semantic_Diff_With_Higher_Ranking
	}
	/*
	static public enum CRAction{ //We use it in conflict resolution
		NIL,	//No action (preserve)
		ADD,	//create (Element ADD)
		MODIFY,	//create (Attribute value)
		REMOVE;	//delete
	}*/
	
	static public enum ConflictGranularity{ //We use it in conflict resolution
		NIL,	//No action (preserve)
		Semantic_Semantic, 	//Conflict between two semantic differences
		Semantic_Fine,		//Conflict between one semantic difference and one fine-grained difference
		Fine_Fine;			//Conflict between two fine-grained differences
	}
	
	
	/*
	static public enum ClassDiffKind			
	{
		ADD, DELETE, MODIFY, NON;
	}
	 
	static public enum AscDiffKind
	{
		ADD, DELETE, NON;
	}*/
	
	/*	static public enum AttributeDiffKind			
	{
		ADD, DELETE, CHANGE;
	}*/
	
	static public EDataType primitiveToObject(EDataType p) {
		if(p == EcorePackage.eINSTANCE.getEInt()) {
			return EcorePackage.eINSTANCE.getEIntegerObject();
		} else if(p == EcorePackage.eINSTANCE.getELong()) {
			return EcorePackage.eINSTANCE.getELongObject();
		} else if(p == EcorePackage.eINSTANCE.getEDouble()) {
			return EcorePackage.eINSTANCE.getEDoubleObject();
		} else if(p == EcorePackage.eINSTANCE.getEFloat()) {
			return EcorePackage.eINSTANCE.getEFloatObject();
		} else if(p == EcorePackage.eINSTANCE.getEBoolean()) {
			return EcorePackage.eINSTANCE.getEBooleanObject();
		} else if(p == EcorePackage.eINSTANCE.getEShort()) {
			return EcorePackage.eINSTANCE.getEShortObject();
		}else if(p == EcorePackage.eINSTANCE.getEChar()) {
			return EcorePackage.eINSTANCE.getECharacterObject();
		}else if(p == EcorePackage.eINSTANCE.getEByte()) {
			return EcorePackage.eINSTANCE.getEByteObject();
		}
		return p;		
	}
	
	static public EClass createListType(EDataType valueType, EPackage pack, int lowerBound, int upperBound, 
			boolean isTransient, boolean isOrdered, boolean isUnique) {
		String listClassName = "_List" + valueType.getName();
		EClassifier eClassifier = pack.getEClassifier(listClassName);
		if(eClassifier != null)
			return (EClass) eClassifier;
		EClass listClass = DsmcHelpers.createEClass(listClassName, true, pack);
		EAttribute att = DsmcHelpers.createEAttribute("value", listClass, valueType, lowerBound, upperBound, false, false, false, false);
		att.setTransient(isTransient);	
		att.setOrdered(isOrdered);
		att.setUnique(isUnique);
		return listClass;		
	}
	
	static public EClass createCustomMapType(EDataType keyType,EDataType valueType, EPackage pack, 
			int lowerBound, int upperBound, String customMapClassName, boolean isDiffKind) {
		//Create class representing the Map
		String customMapClassNamePrefix = "_map";		
		if(upperBound != 1)
			customMapClassNamePrefix	+=	"List";
		
		if(customMapClassName == null || customMapClassName.trim().isEmpty())
			customMapClassName = keyType.getName()+valueType.getName();
		customMapClassName = customMapClassNamePrefix + customMapClassName;		
		EClassifier eClassifier = pack.getEClassifier(customMapClassName);
		if(eClassifier != null)
			return (EClass) eClassifier;
		
		//ETypeParameter eTypeParam = EcoreFactory.eINSTANCE.createETypeParameter();
		EClass customClassMap = DsmcHelpers.createEClass(customMapClassName, true, pack);
		//customClassMap.setInstanceTypeName("java.util.Map$Entry");	
		//Add key-value attributes
		EAttribute keyAttr 		= 
				DsmcHelpers.createEAttribute("key", customClassMap, keyType,  0, 1, false, false, false, false);			
		EAttribute valueAttr 	= 
				DsmcHelpers.createEAttribute("value", customClassMap, valueType, lowerBound, upperBound, false, false, false, false);
		//Used for Custom Map//EAttribute attrIsForbidden = DsmcHelpers.createEAttribute("isForbidden", customClassMap, EcorePackage.eINSTANCE.getEBoolean(), 1, 1, false, false);
		//Used for Custom Map//attrIsForbidden.setDefaultValue(false);		
		
		/* //Used for Custom Map//
		 if(!isDiffKind){
			EDataType stringDataType = EcorePackage.eINSTANCE.getEString();	
			EAttribute attrName 	= 
					DsmcHelpers.createEAttribute("attributeName", customClassMap, stringDataType, 0, 1, false, false);
		}*/
		return customClassMap;
	}
	
	static public EGenericType createMapListType(EDataType keyType,EGenericType valueType) {
		//Using EMAP
		EGenericType _mapType = EcoreFactory.eINSTANCE.createEGenericType();
		_mapType.setEClassifier(EcorePackage.eINSTANCE.getEMap());
		// set key-type
		EGenericType key = EcoreFactory.eINSTANCE.createEGenericType();
		key.setEClassifier(keyType);//EcorePackage.eINSTANCE.getEString());
		//set EList-type
		EGenericType listType = EcoreFactory.eINSTANCE.createEGenericType();
		listType.setEClassifier(EcorePackage.eINSTANCE.getEEList());
		// set list-value-type		
		listType.getETypeArguments().add(valueType);
		// add them
		_mapType.getETypeArguments().add(key);
		_mapType.getETypeArguments().add(listType);
		return _mapType;
		//DsmcHelpers.createEAttribute("new_"+attr.getName(), diffClass,_mapType, attr.getLowerBound(), -1, false, true);		
	}
	
	static public EGenericType createMapType(EDataType keyType,EDataType valueType) {
		//Using EMAP
		EGenericType _mapType = EcoreFactory.eINSTANCE.createEGenericType();
		_mapType.setEClassifier(EcorePackage.eINSTANCE.getEMap());
		// set key-type
		EGenericType key = EcoreFactory.eINSTANCE.createEGenericType();
		key.setEClassifier(keyType);//EcorePackage.eINSTANCE.getEString());
		// set value-type
		EGenericType value = EcoreFactory.eINSTANCE.createEGenericType();
		if(valueType == EcorePackage.eINSTANCE.getEInt())//attr.getEType()
			value.setEClassifier(EcorePackage.eINSTANCE.getEIntegerObject());
		else
			value.setEClassifier(valueType);//attr.getEType());//EcorePackage.eINSTANCE.getEObject());
		// add them
		_mapType.getETypeArguments().add(key);
		_mapType.getETypeArguments().add(value);
		return _mapType;
		//DsmcHelpers.createEAttribute("new_"+attr.getName(), diffClass,_mapType, attr.getLowerBound(), -1, false, true);		
	}
	
	static public EGenericType createMapType(EDataType keyType,EClassifier valueTypeEClassifier) {
		//Using EMAP
		EGenericType _mapType = EcoreFactory.eINSTANCE.createEGenericType();
		_mapType.setEClassifier(EcorePackage.eINSTANCE.getEMap());
		// set key-type
		EGenericType key = EcoreFactory.eINSTANCE.createEGenericType();
		key.setEClassifier(keyType);//EcorePackage.eINSTANCE.getEString());
		// set value-type
		EGenericType value = EcoreFactory.eINSTANCE.createEGenericType();
		value.setEClassifier(valueTypeEClassifier);//attr.getEType());//EcorePackage.eINSTANCE.getEObject());
		// add them
		_mapType.getETypeArguments().add(key);
		_mapType.getETypeArguments().add(value);
		return _mapType;
		//DsmcHelpers.createEAttribute("new_"+attr.getName(), diffClass,_mapType, attr.getLowerBound(), -1, false, true);		
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
	
	static public EReference createEReference (String name, EClass source, EClassifier target, int lowerbound, int upperbound, boolean containment, boolean ordered) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(name);
		ref.setEType(target);
		ref.setLowerBound(lowerbound);
		ref.setUpperBound(upperbound);
		ref.setContainment(containment);
		ref.setOrdered(ordered);		
		source.getEStructuralFeatures().add(ref);
		return ref;
	}
	
	static public EAttribute createEAttribute (String name, EClass source, EClassifier type, int lowerbound, 
			int upperbound, boolean isID, boolean isTransient, boolean isOrdered, boolean isUnique, Object defaultValue) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(name);
		att.setEType(type);
		att.setLowerBound(lowerbound);
		att.setUpperBound(upperbound);
		att.setID(isID);
		att.setTransient(isTransient);	
		att.setOrdered(isOrdered);
		att.setUnique(isUnique);
		att.setDefaultValue(defaultValue);
		source.getEStructuralFeatures().add(att);
		return att;
	}
	
	static public EAttribute createEAttribute (String name, EClass source, EClassifier type, int lowerbound, 
			int upperbound, boolean isID, boolean isTransient, boolean isOrdered, boolean isUnique) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(name);
		att.setEType(type);
		att.setLowerBound(lowerbound);
		att.setUpperBound(upperbound);
		att.setID(isID);
		att.setTransient(isTransient);	
		att.setOrdered(isOrdered);
		att.setUnique(isUnique);
		source.getEStructuralFeatures().add(att);
		return att;
	}
	
	static public EAttribute createEAttribute (String name, EClass source, EClassifier type, int lowerbound, int upperbound, boolean isID, boolean isTransient, EGenericType eGenericType) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(name);
		att.setEType(type);
		att.setLowerBound(lowerbound);
		att.setUpperBound(upperbound);
		att.setID(isID);
		att.setTransient(isTransient);	
		att.getEGenericType().getETypeArguments().add(eGenericType);
		source.getEStructuralFeatures().add(att);
		return att;
	}
	
	static public EAttribute createEAttribute (String name, EClass source, EGenericType type, int lowerbound, int upperbound, boolean isID, boolean isTransient) {
		EAttribute att = EcoreFactory.eINSTANCE.createEAttribute();
		att.setName(name);
		att.setEGenericType(type);
		att.setLowerBound(lowerbound);
		att.setUpperBound(upperbound);
		att.setID(isID);
		att.setTransient(isTransient);	
		source.getEStructuralFeatures().add(att);
		return att;
	}
	
	public static void doEMFSetup(String MM_eNSURI, Object MM_eIN) {
		EPackage.Registry.INSTANCE.put(MM_eNSURI, MM_eIN);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}
	
	public static ArrayList<EClass> getAllNodesMM(EClass n, Boolean isRecursive, Boolean excludeRule)
	{
		ArrayList<EClass> ns= new ArrayList<EClass>();
		if(!isRecursive)
			getAllNodesHelperFlatMM(n, ns);
		else
			getAllNodesHelperRecursiveMM(n, ns);
		
		if(excludeRule)
			ns.remove(n);
		
		return ns;
	}
	
	
	public static void getAllNodesHelperFlatMM(EClass n, ArrayList<EClass> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			var features = new ArrayList<EStructuralFeature>(n.getEStructuralFeatures());
			for (EStructuralFeature r : features) {
				if(r instanceof  EReference){
					ArrayList<EClass> targets = new ArrayList<EClass>();
					EClass t = (EClass)r.getEType();
					if(t!=null)
						targets.add(t);
				  	for(EClass nI : targets)
				  	{	  		
				  		ns.add(nI);
				  	} 	
				}
			} 			
		}
	 }	
			
	public static void getAllNodesHelperRecursiveMM(EClass n, ArrayList<EClass> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			try {
				var features = new ArrayList<EStructuralFeature>(n.getEStructuralFeatures());
				for (EStructuralFeature r : features) {
					if(r instanceof  EReference){
						ArrayList<EClass> targets = new ArrayList<EClass>();
						EClass t = (EClass)r.getEType();
						if(t!=null)
							targets.add(t);
					  	for(EClass nI : targets)
					  	{	  		
					  		getAllNodesHelperRecursiveMM(nI, ns);
					  	} 
					}
				} 
				/*
				if(n.eCrossReferences()!=null && n.eCrossReferences().size()>0)
				{
				  	for(EClass nI : n.eCrossReferences())
				  	{
				  		if(n!=nI) {
				  			getAllNodesHelperRecursiveMM(nI, ns);
				  		}
				  	} 			
				}*/
			}catch(Exception ex)
			{
				
			}
		}
	 }
	
	
	
	
	public static ArrayList<EObject> getAllNodes(EObject n, Boolean isRecursive, Boolean excludeRule)
	{
		ArrayList<EObject> ns= new ArrayList<EObject>();
		if(!isRecursive)
			getAllNodesHelperFlat(n, ns);
		else
			getAllNodesHelperRecursive(n, ns);
		
		if(excludeRule)
			ns.remove(n);
		
		return ns;
	}
	
	
	public static void getAllNodesHelperFlat(EObject n, ArrayList<EObject> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			if(n.eContents()!=null && n.eContents().size()>0)
			{
			  	for(EObject nI : n.eContents())
			  	{	  		
			  		ns.add(nI);
			  	} 			
			} 			
		}
	 }	
			
	public static void getAllNodesHelperRecursive(EObject n, ArrayList<EObject> ns)
	{
		if(!ns.contains(n))//Visited
		{	
			ns.add(n);
			try {
				if(n.eContents()!=null && n.eContents().size()>0)
				{
				  	for(EObject nI : n.eContents())
				  	{	  		
				  		getAllNodesHelperRecursive(nI, ns);
				  	} 			
				} 
				
				if(n.eCrossReferences()!=null && n.eCrossReferences().size()>0)
				{
				  	for(EObject nI : n.eCrossReferences())
				  	{
				  		if(n!=nI) {
				  			getAllNodesHelperRecursive(nI, ns);
				  		}
				  	} 			
				}
			}catch(Exception ex)
			{
				
			}
		}
	 }	
	
	public static ArrayList<EClass> getAllSubClassesMM(EClass superClass) {
		ArrayList<EClass> subClasses = new ArrayList<EClass>();	
		EPackage ePackage = superClass.getEPackage();
		EList<EClassifier> eClassifiers = ePackage.getEClassifiers();		
	    for(EClassifier c:eClassifiers){
	    	if(c instanceof EClass){
		    	EClass cClass = (EClass) c;		    	
		    	if(cClass.getEAllSuperTypes().contains(superClass)){
		    		subClasses.add(cClass);
		    	}
	    	}
	    } 
		 return subClasses;
	}
	
	
	public static ArrayList<EClass> getAllTargetsMM(EClass source, EReference r) {
		ArrayList<EClass> targets = new ArrayList<EClass>();	
		var features = new ArrayList<EStructuralFeature>(source.getEStructuralFeatures());
		for (EStructuralFeature f : features) {
			if(f instanceof  EReference && f.getName().equals(r.getName())){
				targets.add((EClass) f.getEType());
			}
		} 
		 return targets;
	}
	
	public static List<EObject> getAllTargets(EObject source, EReference r) {
		List<EObject> targets = new ArrayList<EObject>();				 
		 try
		 {
			 targets= (List<EObject>) source.eGet(r);
		 }
		 catch(Exception ex1)
		 {				 
			 targets.add((EObject) source.eGet(r));
		 }		 
		 		 
		 return targets;
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
	 
	 public static String getSuperClassName(EObject n)
	 {
		 	return n.eClass().getESuperTypes().get(0).getName();
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
	 
	 public static String getEAttributeTypeByName(EObject eObj,String aAttrName)
	 {
		 try
		 {
		 return getEAttributeByName(eObj,aAttrName).getEType().getName();
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
	 }
	 
	 public static EAttribute getIdEAttribute(EObject eObj)
	 {
		 try
		 {
			 return eObj.eClass().getEAllAttributes().stream().filter(a -> a.isID()).findFirst().get();
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
		
		public static Object getAttrValueByAttrNameNullDefault(EObject obj, String AttrName){
		 	try{
		 		return  obj.eGet(getEAttributeByName(obj,AttrName.trim()));
		 	}
		 	catch(Exception ex){
		 		return null;
		 	}
		 }
		
		public static List<EAttribute> getAllAttributesByAttrNameNullDefault(EObject obj, String AttrName){
		 	try{
		 		return obj.eClass().getEAllAttributes().stream().filter(
		 				r -> r.getName().toLowerCase().contains(
		 						AttrName.trim().toLowerCase())).collect(Collectors.toList());		 		
		 	}
		 	catch(Exception ex){
		 		return null;
		 	}
		 }
		
		public static EReference getEReferenceByNameNullDefault(EObject eObject, String eReferenceName){
			 try
			 {
				 return eObject.eClass().getEAllReferences().stream().filter(
						 r -> r.getName().toLowerCase().contains(eReferenceName.toLowerCase())).findFirst().get();
			 }
			 catch(Exception ex)
			 {
				 return null;
			 }
		 }

		public static ArrayList<EObject> getERefTargetByERefName(EObject eObject, String eReferenceName){
			ArrayList<EObject> target = new ArrayList<EObject>();
			 try
			 {
				 EReference r= getEReferenceByNameNullDefault(eObject, eReferenceName);
				 if(r.getUpperBound()==1) {
					 EObject result = (EObject) eObject.eGet(r);
					 if(result!=null)
						 target.add(result);
				 } else if(r.getUpperBound()>1 || r.getUpperBound()==-1) {
					 EList<EObject> result = (EList<EObject>) eObject.eGet(r);
					 if(result!=null && result.size()>0)
						 target.addAll(result);
				 }
				 
			 }
			 catch(Exception ex)
			 {
				 return target;
			 }
			 return target;
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
