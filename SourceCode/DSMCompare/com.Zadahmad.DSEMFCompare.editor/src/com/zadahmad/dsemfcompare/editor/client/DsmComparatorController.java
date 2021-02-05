package com.zadahmad.dsemfcompare.editor.client;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.MultiCdaSolver;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.*;
import com.zadahmad.dsemfcompare.editor.DsEMFComparator;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.dsvcshenshin;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Edge;
import com.zadahmad.dsemfcompare.editor.verstexSorting.EdgeType;
import com.zadahmad.dsemfcompare.editor.verstexSorting.Vertex;
import com.zadahmad.dsemfcompare.editor.verstexSorting.VertexSorting;

import dsmcompare.mmextension.MMExtension;
import dsmcompare.mmextension.utils.*;

/*
import refactoringDiffMM.RefactoringDiffMMFactory;
import refactoringDiffMM.RefactoringDiffMMPackage;
import refactoringRuleMM.RefactoringRuleMMFactory;
import refactoringRuleMM.RefactoringRuleMMPackage;*/


import com.google.common.base.Function;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.cpa.result.Conflict;
import org.eclipse.emf.henshin.cpa.result.CriticalPair;
import org.eclipse.emf.henshin.cpa.result.Dependency;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.junit.Test;
import mainPkg.IntentPrettyPrinter;

/*
import PacmanGoAugmented.AscOp;
import PacmanGoAugmented.ClassOp;
import PacmanGoAugmented.PacmanGoAugmentedFactory;
import PacmanGoAugmented.PacmanGoAugmentedPackage;
*/
import PacmanGo.PacmanGoFactory;
import PacmanGo.PacmanGoPackage;

import PacmanGoDiffMM.PacmanGoDiffMMFactory;
import PacmanGoDiffMM.PacmanGoDiffMMPackage;
//import PacmanGoDiffMM.AscOp;
//import PacmanGoDiffMM.ClassOp;

import PacmanGoRuleMM.PacmanGoRuleMMFactory;
import PacmanGoRuleMM.PacmanGoRuleMMPackage;

import arduino.ArduinoFactory;
import arduino.ArduinoPackage;

import arduinoDiffMM.ArduinoDiffMMFactory;
import arduinoDiffMM.ArduinoDiffMMPackage;
//%%%%//import arduinoDiffMM.AscOp;
//%%%%/import arduinoDiffMM.ClassOp;

import arduinoRuleMM.ArduinoRuleMMFactory;
import arduinoRuleMM.ArduinoRuleMMPackage;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.eclipse.emf.ecore.EFactory;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DsmComparatorController {
	
	public static Iterable<MatchResult> allMatches(
		      final Pattern p, final CharSequence input) {
		  return new Iterable<MatchResult>() {
		    public Iterator<MatchResult> iterator() {
		      return new Iterator<MatchResult>() {
		        // Use a matcher internally.
		        final Matcher matcher = p.matcher(input);
		        // Keep a match around that supports any interleaving of hasNext/next calls.
		        MatchResult pending;

		        public boolean hasNext() {
		          // Lazily fill pending, and avoid calling find() multiple times if the
		          // clients call hasNext() repeatedly before sampling via next().
		          if (pending == null && matcher.find()) {
		            pending = matcher.toMatchResult();
		          }
		          return pending != null;
		        }

		        public MatchResult next() {
		          // Fill pending if necessary (as when clients call next() without
		          // checking hasNext()), throw if not possible.
		          if (!hasNext()) { throw new NoSuchElementException(); }
		          // Consume pending so next call to hasNext() does a find().
		          MatchResult next = pending;
		          pending = null;
		          return next;
		        }

		        /** Required to satisfy the interface, but unsupported. */
		        public void remove() { throw new UnsupportedOperationException(); }
		      };
		    }
		  };
		}
	
	public static EObject getNodeByID_Pattern(ArrayList<EObject> nodes, String idPatternValue )
	{
		try {
		EObject node=nodes.stream()
				.filter(n->idPatternValue.equals(getAttrValueByAttrName(n,"ID_Pattern").toString()))
				.collect(Collectors.toList()).get(0);
	
		return node;
		}
		catch(Exception ex) {
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
	
	public static String getAttrDataTypeNameByAttrName(EObject obj, String AttrName){
	 	try{
	 		return  getEAttributeByName(obj,AttrName).getEAttributeType().getName();
	 	}
	 	catch(Exception ex){
	 		return "";
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
			
			
			
	
	String Root				= 	"";
	String RootApp			= 	"";
	
	String MMRootPath     	= 	"";
	String DSMMPath  		= 	"";
	String DSDiffMMPath  	= 	"";
	String DSRuleMMPath  	= 	"";
	
	String ModelRootPath  	= 	"";
	String VerBasePath 		= 	"";
 	String VerNewPath  		= 	"";		
	String result      		= 	"";	
 	String DSMDiffPath 		= 	"";	
 	
 	String RuleRootPath		= 	"";
 	
 	
 	String MMPackageName		= 	""; 	
 	String DiffMMPackageName	= 	""; 
 	String RuleMMPackageName	= 	""; 
 	
 	String DiffMM_eNSURI 	= 	"";  	
 	Object DiffMM_eIN	 	=	null;
 	EFactory DiffMM_Factory	= 	null; 
 	
 	String RuleMM_eNSURI 	= 	""; 	
 	Object RuleMM_eIN	 	=	null;
 	EFactory RuleMM_Factory	=	null;
 	
 	//EEnum ClassOp= EcoreFactory.eINSTANCE.createEEnum();
 	//EEnum AscOp=EcoreFactory.eINSTANCE.createEEnum();
 	
 	List<MRN>			visitedMRN	= 	new ArrayList<MRN>();
 	List<DSRuleSpec>	DSRuleSpecs	= new ArrayList<DSRuleSpec>(); 	
 	List<String> 		rulesList	=	new ArrayList<String>();
 	
 	//All the following variables should be replaced by metaModelFilePhysicalPath, modelFilePhysicalPath, v1FileName, v2FileName, rulesFolderPhysicalPath or easier
 	public boolean setPathes(
 			String metaModelFolderPhysicalPath, 
 			String modelFolderPhysicalPath, 
 			String rulesFolderPhysicalPath, 
 			String dsdiffFolderPhysicalPath, 
 			String metaModelFileName, 
 			String v1FileName, 
 			String v2FileName) {
 		try {
 			MMRootPath			=	metaModelFolderPhysicalPath;
 			DSMMPath  			= 	MMRootPath + metaModelFileName;	
 			DSDiffMMPath  		= 	MMRootPath + "DSDiffMM.ecore";
 			DSRuleMMPath  		= 	MMRootPath + "DSRuleMM.ecore";
 			ModelRootPath		=	modelFolderPhysicalPath;
 			VerBasePath 		= 	ModelRootPath + v1FileName;
 		 	VerNewPath  		= 	ModelRootPath + v2FileName; 		
 			result      		= 	dsdiffFolderPhysicalPath + "result.txt";	
 		 	DSMDiffPath 		= 	dsdiffFolderPhysicalPath + "DSMDiff.xmi";	
 		 	RuleRootPath		= 	rulesFolderPhysicalPath;
 			return true;
 		}catch(Exception ex) {
 			return false;
 		}
 	}
 	
 	public boolean setDsdRulePackages(
 			ArrayList<String> RulesList, 
 			String diffMM_eNSURI, 
 			Object diffMM_eIN, 
 			EFactory diffMM_Factory,
 			String ruleMM_eNSURI, 
 			Object ruleMM_eIN, 
 			EFactory ruleMM_Factory,
 			String mmPackageName) {		
 		try {
 		 	rulesList			=	RulesList;
 		 	DiffMM_eNSURI		= 	diffMM_eNSURI;
 		 	DiffMM_eIN			=	diffMM_eIN;
 		 	DiffMM_Factory		= 	diffMM_Factory;
 		 	RuleMM_eNSURI		= 	ruleMM_eNSURI;
 		 	RuleMM_eIN			= 	ruleMM_eIN;
 		 	RuleMM_Factory		=	ruleMM_Factory;
 		 	MMPackageName		=	mmPackageName;
 		 	DiffMMPackageName 	=	MMPackageName +"DiffMM";
 		 	RuleMMPackageName	=	MMPackageName +"RuleMM";
 		 	return true;
 		}catch(Exception ex) {
 			return false;
 		}
 	}
 	
	
	//final String RootApp= "R:/Thesis/DSMCompare/";
	/*
	final String RootApp= "D:/_UdeM/trunk/Thesis/DSMCompare/DSMCompare/";
	
	final String MMRootPath     = RootApp+"com.Zadahmad.DSEMFCompare/ardMMs/";
	final String DSMMPath  		= MMRootPath + "arduino.ecore";	
	final String DSDiffMMPath  	= MMRootPath + "DSDiffMM.ecore";
	final String DSRuleMMPath  	= MMRootPath + "DSRuleMM.ecore";
	
	final String ModelRootPath  = RootApp+"com.Zadahmad.DSEMFCompare.editor/model/ard/";
	final String VerOriginPath 	= "";//ModelRootPath + "test/V0.xmi";
	
	final String caseName		= "fadelight";
	
	final String VerBasePath 	=  ModelRootPath + caseName +"/"+ "v3_GenerateWhile" + ".xmi";
 	final String VerNewPath  	=  ModelRootPath + caseName +"/"+ "v5_Fedlight" + ".xmi";
	final String result      	=  ModelRootPath + caseName +"/"+ "result_FedlightV3_V5" + ".txt";
	final String DSMDiffPath 	=  ModelRootPath + caseName +"/"+ "DSMDiff_FedlightV3_V5" + ".xmi";
		 	 	
 	String MMFileName   		= "arduino";
 	String MMPackageName		= "arduino"; 
 	
 	String DiffMMFileName   	= "arduinoDiffMM";
 	String DiffMMPackageName	= "arduinoDiffMM";
 	
 	String RuleMMFileName   	= "arduinoRuleMM";
 	String RuleMMPackageName	= "arduinoRuleMM";
 	
 	String DiffMM_eNSURI 		= ArduinoDiffMMPackage.eNS_URI; 	
 	Object DiffMM_eIN	 		= ArduinoDiffMMPackage.eINSTANCE;
 	Object DiffMM_Factory	 	= ArduinoDiffMMFactory.eINSTANCE;
 	
 	String RuleMM_eNSURI 		= ArduinoRuleMMPackage.eNS_URI; 	
 	Object RuleMM_eIN	 		= ArduinoRuleMMPackage.eINSTANCE;
 	Object RuleMM_Factory	 	= ArduinoRuleMMFactory.eINSTANCE;
	*/
	
 	
 	 //**********UTILITIES*********
 	
	 public static void copyFile( File from, File to ) throws IOException {
		    Files.copy( from.toPath(), to.toPath() );
		}

	
	 //********* EMF UTILITIES*****
	 public ResourceSet setResourceSet(String rPath, String eNSURI, Object eINS ) 
	 {
		 
		File v = new File(rPath);
		URI uri = URI.createFileURI(v.getPath()); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getPackageRegistry().put(eNSURI, eINS);
		resourceSet.getResource(uri, true);		
		return resourceSet;
	  }

	 void SetEFeature(EObject ERoot, EStructuralFeature feature, EObject newValue)
	 {
			try
			{
				((EList<EObject>) ERoot.eGet(feature)).add((EObject) newValue);	
			}
			catch(Exception ex)
			{
				ERoot.eSet(feature,newValue);
			}
	 }
	 
	 public static final List<EObject> getReferencingObjects(EObject target) {
		    LinkedList<EObject> result = new LinkedList<EObject>();
		    Collection<EStructuralFeature.Setting> settings = null;
		    try {//%%%%%%%%%%%Need a review
			     settings = UsageCrossReferencer.find(target, target.eResource().getResourceSet());

		    }
			catch(Exception ex)
			{
				settings =null;
			}
		    //Same as above //CrossReferencer.find(target.eResource().getContents()).get(target);
		    //same as above//UsageCrossReferencer.find(source.eResource().getContents()).get(source);
		    
		    if (settings == null) {
		        return Collections.emptyList();
		    }
		    
		    for (Setting setting : settings) {
		        result.add(setting.getEObject());
		        //System.out.println("setting.getEStructuralFeature: "+setting.getEStructuralFeature().toString());
		    }
		    return result;
		}
 
	 public Resource retPackResouceMM(String MMPath)
	 {	 	
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = URI.createFileURI(MMPath);//ecore.getFullPath().toOSString());		
		Resource resource = resourceSet.getResource(fileURI, true);	
		return resource;
	 }
	 
	 public Resource retPackResouceM(String modelPath, String eNSURI, Object eIN)
	 {	 	
		ResourceSet resourceSet = setResourceSet(modelPath,eNSURI, eIN);
		URI fileURI = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(fileURI, true);	
		return resource;
	 }
	 
	 public List<EPackage> retPackMM(Resource resourceMM)
	 {
		ResourceSet resourceSet=resourceMM.getResourceSet();
		List<EPackage> metamodel = new ArrayList<EPackage>();
		for (EObject obj : resourceMM.getContents()) {
			if (obj instanceof EPackage) {
				EPackage.Registry.INSTANCE.put		(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
				resourceSet.getPackageRegistry().put(((EPackage)obj).getNsURI(), ((EPackage)obj).getEFactoryInstance().getEPackage());
				metamodel.add((EPackage)obj);
			}
		}
		return metamodel;
	 }
	 
	 public EPackage retPackHavingEClassNameMM(List<EPackage> metamodel, String eClassName)
	 {
		 //EClassName = "rule"
		 //other criteria are to find EClass of "domainspecific" name or with patternPrefix = "pattern_"
		 for(EPackage pack: metamodel)
		 {
			 if(pack.eContents().stream().filter(e -> e.eClass().getName().toLowerCase().contains(eClassName.toLowerCase().trim())).findAny() != null)
				 return pack;
		 }
		 return null;
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

	 	 
	 public static EReference getEReferenceByName(EObject eObj,String eRefName)
	 {
		 try
		 {
			 return eObj.eClass().getEReferences().stream().filter(a -> a.getName().toLowerCase().contains(eRefName.toLowerCase())).findFirst().get();
		 }
		 catch(Exception ex)
		 {
			 return null;
		 }
		 
	 }
	 
	 protected <K,V> Map<K, Map<K,List<V>>> groupByFields2 (List<V> modelList,Function<? super V, ? extends K> classifier1,Function<? super V, ? extends K> classifier2) 
	  {

		    Collector<V, ?, Map<K, List<V>>> groupingBy2 = Collectors.groupingBy(classifier2);
		    Collector<V, ?, Map<K, Map<K,List<V>>>> groupingBy = Collectors.groupingBy(classifier1, groupingBy2);
		    return modelList.stream().collect(groupingBy);
	  }
	 
	 
	 //*******REPORT UTILITIES**********
	 void PrintMRN(MRN MatchedRN, String printHeader)
	 {		
		System.out.println(printHeader);
		System.out.println("Rule   Ref :--- "+MatchedRN.Ref);
		System.out.println("Rule   Clas:--- "+MatchedRN.Clas);	
		System.out.println("Rule   Node:--- "+MatchedRN.ruleNode.toString());
		System.out.println("DSDiff Node:--- "+MatchedRN.matchedNode.toString());			
			
		Map map = groupByFields2(MatchedRN.refMRN , MRN::getRef, MRN::getClas);
		//System.out.println(">>==============");
		for(Object R:map.entrySet())
		{
			//System.out.println(">>-------------");
			 System.out.println();
			 System.out.println(((Map.Entry)R).getKey());//** /
			 Map<Class, List<MRN>> dd= (Map<Class, List<MRN>>) (((Map.Entry)R).getValue());
			 for(Object d:dd.entrySet())
			 {
				 printHeader=">>.............";
				 System.out.println();
				 System.out.println(((Map.Entry)d).getKey());//** /
				 List<MRN> mm= (List<MRN>) ((Map.Entry)d).getValue();
				 
				 Map<EObject,List<MRN>> mmm=  mm.stream().collect(Collectors.groupingBy(MRN::getRuleNode));
				 
				 for(Object m3:mmm.entrySet())
				 {
					 
					 List<MRN> m3Values= (List<MRN>) ((Map.Entry)m3).getValue();
					 
					 System.out.println();
					 System.out.println("----Size: " + m3Values.size() + " -- of Rule Node ---" + ((Map.Entry)m3).getKey());
					 
					 
					 for(MRN m:m3Values)
					 {
						 PrintMRN(m, printHeader);
					 }
				 }
				 
				 /*
				 for(MRN m:mm)
				 {
					 //** /System.out.println(m.matchedNode);
					 PrintMRN(m, printHeader);
				 }*/
				 System.out.println();
			 }			 
		}

	 }
 
	 
	 //*******MATCHING UTILITIES********
	 boolean matchRoots(EObject DiffModelObject, EObject RuleObject)
	 {
	     System.out.println("***************Root Match");
	     System.out.println(DiffModelObject.eClass().getName() + " -|vs|- " +RuleObject.eClass().getName());
		 if(!classTypeMatcher(DiffModelObject,RuleObject))
			 return false;
		 //We  checked the modified attribute values and checked for
		 // equality of objects which are not modified
		 if(!attributeMatcher(DiffModelObject,RuleObject))
			 return false;		
		
		 return true;
	 }
	 
	 //***
	 boolean classTypeMatcher(EObject DiffModelObject, EObject RuleObject)
	 {
	     System.out.println(">>>Match EClass Type: ");
		 if(DiffModelObject.eClass().getESuperTypes().contains(RuleObject.eClass()))
			 return false;
		 System.out.println(".............................  EClass Types are matched!");		 
		 return true;
	 }
	 
	 //****
	 boolean attributeMatcher(EObject DiffModelObject, EObject RuleObject)
	 {
		 System.out.println(">>>Match EAttributes: " + DiffModelObject + " --|--"+ RuleObject);
		 final List<EAttribute> allEAttrR = RuleObject.eClass().getEAllAttributes();
		 
		 if(allEAttrR!=null)	
		 {
			 //The constraints will be applied in the final
			 return attrMatchAllForEquality(DiffModelObject, RuleObject, allEAttrR);
		 }			 	 

		 System.out.println(".............................  EAttributes  are matched!");
		 return true;
	 }
	 
	 //***
	 boolean attrMatchAllForEquality(EObject DiffModelObject, EObject RuleObject, List<EAttribute> allEAttrR)
	 {
		 allEAttrR= allEAttrR.stream()
				 .filter(a -> !a.getName().toLowerCase().startsWith("id_pattern") 
						 && !a.getName().toLowerCase().startsWith("new_") 
						 && !a.getName().toLowerCase().equals(("id"))
						 && !a.getName().toLowerCase().equals(("filter"))
						 && !a.getName().toLowerCase().equals(("operation"))
						 )
				 .collect(Collectors.toList());
		 				//We do not have post anymore: Removed=>; !a.getName().toLowerCase().startsWith("post_") 
		 
		 for(EAttribute attOrgR : allEAttrR)
		 {
			 // *****
			 System.out.println(attOrgR);
			 
			 final Object valAttOrgR  = RuleObject.eGet(attOrgR);
			 if(valAttOrgR==null)
				 continue;
			 			 			 
			 String attrName=attOrgR.getName();
			 EAttribute attOrgD= DiffModelObject.eClass().getEAllAttributes().stream().filter(a -> a.getName().equals(attrName)).findFirst().get();
			 if(attOrgD==null)
				 return false;
			 final Object valAttOrgD  = RuleObject.eGet(attOrgD);
			 if(valAttOrgD==null)
				 return false;
			 if(!(valAttOrgR == valAttOrgD))
				 return false;
		 }	
		 System.out.println(".............................  EAttributes  are matched!");
		 return true;
	 }
	 	 
	 //***
	 //boolean noMatch=false;
	 boolean refMatcher(MRN MatchedRN)
	 {
		 //if(!noMatch)
		 {
			 EObject DiffModelObject = MatchedRN.matchedNode;
			 EObject RuleObject      = MatchedRN.ruleNode;
			 if(RuleObject.eContents().size()==0 &&  RuleObject.eCrossReferences().size()==0)
				 return true;
		 
			 List<EObject> objsInR = getReferencingObjects(RuleObject);
			 
			 List<EObject> toRemoveInRs= objsInR.stream()
			 .filter(r->r.eClass().getName()
					 .toLowerCase().contains("DomainSpecificDiff".toLowerCase()))
			 .collect(Collectors.toList());
			 
			 objsInR.removeAll(toRemoveInRs);
			 
			 
			 List<EObject> objsInD = getReferencingObjects(DiffModelObject);
		 
			 int sizeRefsInR=objsInR.size();
			 int sizeRefsInD=objsInD.size();
			 
			 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
			 System.out.println("&&&&---> "+RuleObject + " : "+ DiffModelObject);
			 System.out.println("&&&& sizeRefsInR: "+sizeRefsInR+ " : " + "sizeRefsInD: "+sizeRefsInD);
			 
			 
			 if(sizeRefsInD < sizeRefsInR)
			 {
				 System.out.println("***RETURNED");
				 return false;
			 }
			 
			 while(objsInR!=null && objsInR.size() > 0)  
			 {
				 EObject objInR=objsInR.get(0);
				 Class  classObjInR=objInR.getClass().getSuperclass();
				 boolean found=false;
				 
				 for(int j= 0;j < objsInD.size();j++ )
				 {
					 EObject objInD=objsInD.get(j);
					 Class  classObjInD=objInD.getClass();
					 // ** // eclassObjInR==eclassObjInD &&
					 if(classObjInR==classObjInD && attributeMatcher(DiffModelObject,RuleObject))
					 {					 
						 objsInD.remove(objInD);
						 objsInR.remove(objInR);
						 found=true;
						 break;
					 }					 
				 }
	
				 if(found==false)
				 {
					 return false;
				 }
			 }		 
			 
			 EList<EReference> refsOutEClassR = RuleObject.eClass().getEAllReferences();
			 //System.out.println("--- "+RuleObject+"---> refsOutEClassR: "+ refsOutEClassR);
			 //refsOutEClassR.forEach(r ->  System.out.println(r));
			 //System.out.println("-----------------------------");
			 //ArrayList<DSRuleMatched> dsrMatchs= new ArrayList<DSRuleMatched>();	
			 		 
			 for(EReference refOutEClassR:refsOutEClassR)
			 {
				 
				 if(refOutEClassR.getName().toLowerCase().contains("domainspecificdiffs"))
					 continue;
				 
				 
				 MRN matchedRuleNode= new MRN();
				 matchedRuleNode.ruleNode=RuleObject;
				 matchedRuleNode.matchedNode=DiffModelObject;
				 //*//RefObjPer	refObjPer= null;
				 MRN	refObjPer= null;
						 
				 List<EObject> refsOutRObjects = new ArrayList<EObject>();				 
				 try
				 {
				    refsOutRObjects= (List<EObject>) RuleObject.eGet(refOutEClassR);
				 }
				 catch(Exception ex1)
				 {				 
					 refsOutRObjects.add((EObject) RuleObject.eGet(refOutEClassR));
				 }
				 
					 
				 List<EObject> refsOutDObjects = new ArrayList<EObject>();;
				 try
				 {
					 refsOutDObjects= (List<EObject>) DiffModelObject.eGet(refOutEClassR);
				 }
				 catch(Exception ex2)
				 {
					 refsOutDObjects.add((EObject) DiffModelObject.eGet(refOutEClassR));
				 }	
				 
			 	int sizeOutR=0, sizeOutD=0;
			 	
				try 
				{				
				 sizeOutR  = refsOutRObjects.size();
				}
				catch(Exception ex2)
				{
					sizeOutR=0;
				}	 			 
	
				try 
				{	
				 sizeOutD  = refsOutDObjects.size();			 
				}
				catch(Exception ex2)
				{
					sizeOutD=0;
				}
				
				 System.out.println("&&&& sizeOutR: " + sizeOutR + " : " +  "sizeOutD: "+  sizeOutD); 
				 if(sizeOutR==0)
					 continue;
					 //return true;
				 
				 if(sizeOutD < sizeOutR)
				 {
					 System.out.println("***RETURNED");
					 return false;	
				 }					 
				 
				 Map<Object,List<EObject>> RR=refsOutRObjects.stream().collect(Collectors.groupingBy(p -> p.getClass()));				 
				 //System.out.println("RR: ");
				 //RR.forEach((k,vs) -> System.out.println(k+ " : "+vs));
				 //System.out.println("--------");				 
				 Map<Object,List<EObject>> DD=refsOutDObjects.stream().collect(Collectors.groupingBy(p -> p.getClass()));
				 
				 for(Entry<Object, List<EObject>> R:RR.entrySet())
				 {
					 for(int i=0; i<R.getValue().size();i++)
					 {
						 EObject refsOutRObject=R.getValue().get(i);
						 boolean found=false;
						 
						 System.out.println("((Class)R.getKey())                     : " + ((Class)R.getKey()));
						 
						 Class superClassR=((Class)R.getKey()).getSuperclass();
						 
						 Object keyObjectD=null;
							
						 for(Entry<Object, List<EObject>> d:DD.entrySet())
						 {
							Class KeyD=((Class)d.getKey());
							if(KeyD.equals(superClassR))
							{
								keyObjectD=d.getKey();
							}
						 }						 
						 
						 List<EObject> ds=DD.get(keyObjectD); // ***//DD.get(R.getKey());
						 System.out.println("DD.get(keyObjectD): " + ds);
						 System.out.println("refsOutRObject    : " +refsOutRObject);
						 
						 
						 List<EObject> dsMatched=null;
						 try {//%%%%%%%%%%%%%%%%% Need a Hard review
		 						 dsMatched= ds.stream().filter(d -> attributeMatcher(d,refsOutRObject)).collect(Collectors.toList());

						 }catch(Exception ex) {
							 dsMatched=null;
						 }
						 if(dsMatched!=null && dsMatched.size()>0)
						 {
							 found=true;
							
							 
							 for(EObject mch:dsMatched)
							 {						  
								 //*//refObjPer= new 	RefObjPer();	
								 refObjPer= new 	MRN();
								 refObjPer.Ref=refOutEClassR;
								 refObjPer.ruleNode=refsOutRObject;
								 
								 //System.out.println(R.getKey());
								 
								 refObjPer.Clas=(Class) R.getKey();
								 refObjPer.matchedNode=refsOutRObject;
								 refObjPer.matchedNode=mch;
								 //!!!!!!!!!!!!
								 MatchedRN.refMRN.add(refObjPer);
							 }
								 
							//*//refObjPer.refObjPer.addAll(dsMatched);
						 }
						 
						 if(found==false)
						 {
							 System.out.println("######Matching Attribute####: "+refsOutRObject +"--Not found in---: " + ds);
							 System.out.println("*********NNNNN************* ");
							 return false;
						 }						 			 
					 }
				 }
				 System.out.println();
			 }
			 
			 
			 System.out.println();
			 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> MatchedRN: " );
			 System.out.println("Rule   Ref :--- "+MatchedRN.Ref);
			 System.out.println("Rule   Clas:--- "+MatchedRN.Clas);	
			 System.out.println("Rule   Node:--- "+MatchedRN.ruleNode.toString());
			 System.out.println("DSDiff Node:--- "+MatchedRN.matchedNode.toString());	
			 for(MRN d: MatchedRN.refMRN)
			 {
				 System.out.println("---------------------> MatchedRN.refMRN: " );
				 System.out.println("Rule   Ref : "+d.Ref);
				 System.out.println("Rule   Clas: "+d.Clas);	
				 System.out.println("Rule   Node: "+d.ruleNode);
				 System.out.println("DSDiff Node: "+d.matchedNode);				 
			 }
	
			 
			 List<MRN> toRemoveObjs=new ArrayList<MRN>();
			 for(MRN m: MatchedRN.refMRN)
			 {
				 Boolean visited=false;
				 for(MRN v: visitedMRN)
					 if(v.matchedNode == m.matchedNode) {
						 visited=true;
						 break;
					 }
				 if( visited==true) {
					 continue;
				 }						 
				 visitedMRN.add(m);
				 boolean mtch= refMatcher(m);
				 if(mtch==false)
					 toRemoveObjs.add(m);	 
			 }
			 if(toRemoveObjs!=null && toRemoveObjs.size()>0)
			 {
				 MatchedRN.refMRN.removeAll(toRemoveObjs);
	
				 System.out.println("====Removed in Root===> ");
				 System.out.println("Rule   Node:--- "+MatchedRN.ruleNode.eClass());
				 System.out.println("DSDiff Node:--- "+MatchedRN.matchedNode.eClass());
				 
				 for(MRN r: toRemoveObjs)
				 {
					 System.out.println("====Removes===> ");
					 System.out.println("Rule   Ref : "+r.Ref);
					 System.out.println("Rule   Clas: "+r.Clas);	
					 System.out.println("Rule   Node: "+r.ruleNode.eClass());
					 System.out.println("DSDiff Node: "+r.matchedNode.eClass());	
				 }
					 
			 }
			 
			 if(toRemoveObjs!=null && toRemoveObjs.size()>0 && MatchedRN.refMRN !=null && MatchedRN.refMRN.size()==0)
			 {
				 System.out.println("*********NNNNN************* ");
				 System.out.println("@@@@@@@@@@ return false @@@@@:  MatchedRN.refMRN.size()==0");
				 System.out.println("MatchedRN: "+ MatchedRN.matchedNode);				 
				 return false;
			 }		 
			 System.out.println("<-Eref Matched for-> " + DiffModelObject+" /-- and --/ "+RuleObject);
			 return true;
			 
			 //Manoel rimer's work to look
			 //All possible match
			 //Conflicts!!!
		 }
	 }

	 //***
	 private EObject findInDiffMatchs(EObject[][] diffsMatch, EObject match, int s)
	 {
		 //System.out.println("match: "+match);

	    if (match == null || diffsMatch == null) return null;

	    for(int rowIndex=0;rowIndex<=s;rowIndex++)//int rowIndex = 0; rowIndex < diffsMatch.length; rowIndex++ ) 
	    {
	    	EObject[] row = diffsMatch[rowIndex];
	    	if (row != null) 
	    	{	
	    		try
	    		{
		    		if (match.equals(row[0]))//((ReferenceChange)row[0]).getValue())) 
		    			return row[2];	    			
	    		}
	    		catch(Exception ex)
	    		{
	    		}
	    		try
	    		{
		    		if (match.equals(row[1]))//((ReferenceChange)row[0]).getValue())) 
		    			return row[2];	    			
	    		}
	    		catch(Exception ex)
	    		{
	    		}
	    	}
       }
	    return null; // value not found in array
	 }
	 	 
	 	 
	 //MAIN MODULES
	 //*************MM ===to===> DIFF-MM && RULE-MM************* 	 
	 //@Test
	 public void generateDIFFMM_RuleMM(String rootClassName)
	 {
		 URI fileURI = URI.createFileURI(DSMMPath);
		 MMExtension extender    = new MMExtension();
		 Resource       mmextension = extender.extend2(fileURI, rootClassName);
		 System.out.println("MMs generated!");
	 }
	 
	 	 
	 //*************CREATE DS-FINE-GRANULAR-DIFFS************* 	
	 
	 
	 public ArrayList<Diff> SortByDependencies( EList<Diff> diffs, boolean throwOnCycle /*= false */)
	 {
	     var sorted = new ArrayList<Diff>();
	     var visited = new HashSet<Diff>();

	     for( Diff item : diffs )
	         Visit( item, visited, sorted, throwOnCycle );

	     return sorted;
	 }

	 private void Visit(Diff item, HashSet<Diff> visited, ArrayList<Diff> sorted, boolean throwOnCycle )
	 {
	     if(!visited.contains(item ))
	     {
	         visited.add( item );

	         for( Diff dep : item.getRequiredBy() )
	             Visit( dep, visited, sorted, throwOnCycle );

	         sorted.add( item );
	     }
	     else
	     {
	         if( throwOnCycle && !sorted.contains( item ) )
	             System.out.println( "Cyclic dependency found: " + item.toString() );
	     }
	 }
	 
	 
	 public void MapEmfCompareDiffsToFineGranularDSMDiffs(String VerBasePath, String VerNewPath, String DSMDiffPath, String result) throws IOException
	 {

			System.out.println("The start of transforming EMF-Diff to DSMC-Diff");
		 
		 /* Map EmfCompare Diffs (EDiff) To Fine Granular DSMDiffs 
		  	2.   EMFCompare(MBase,Mnew) -> EDiff

			3.1. Convert EDiff -> DiffElements'

			3.2. Add DiffElements' on MBase' -> DSMDiff'
		  */
			
					 
		 	File VerBase_File=new File(VerBasePath);
			File VerNew_File=new File(VerNewPath);
			//For ThreeWay Test Begin
			//File VerOrigin_File=new File(VerOriginPath);
			//For ThreeWay Test End
			Charset charset = StandardCharsets.UTF_8;
			String contentBaseFile = new String(Files.readAllBytes(VerBase_File.toPath()), charset);
			String contentNewFile = new String(Files.readAllBytes(VerNew_File.toPath()), charset);
			Resource rsourceDSMDiff = null;
		    try {
		    	
		    	String content = new String(contentBaseFile);		    	
		    	content = content.replaceAll(MMPackageName, DiffMMPackageName);
		    	//content = content.replaceAll(MMFileName, DiffMMFileName);
				Files.write(VerBase_File.toPath(), content.getBytes(charset));
		    	
				
				content = new String(contentNewFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				//content = content.replaceAll(MMFileName, DiffMMFileName);
				Files.write(VerNew_File.toPath(), content.getBytes(charset));
		    	
		    	
				FileOutputStream fileOutputStream=new FileOutputStream(result);
				PrintStream printStream=new PrintStream(fileOutputStream);
				
				
				//For ThreeWay Test Begin
				/*
				String contentOriginFile = new String(Files.readAllBytes(VerOrigin_File.toPath()), charset);
				content = new String(contentOriginFile);
				content = content.replaceAll(MMPackageName, DiffMMPackageName);
				Files.write(VerOrigin_File.toPath(), content.getBytes(charset));
				ResourceSet rsOrigin=setResourceSet(VerOriginPath,DiffMM_eNSURI, DiffMM_eIN);
				*/
				//For ThreeWay Test End
				
				
				ResourceSet rsBase=setResourceSet(VerBasePath,DiffMM_eNSURI, DiffMM_eIN), 
							rsNew=setResourceSet(VerNewPath, DiffMM_eNSURI, DiffMM_eIN);
				
				
				final Comparison comparisonBaseNew = new DsEMFComparator().compareCore2(rsNew, rsBase); //.compareCoreThreeWay(rsNew, rsBase, rsOrigin);//
				final EList<Diff> differences=comparisonBaseNew.getDifferences();
				
				
				IntentPrettyPrinter.printDifferences(differences, printStream); 
							
				Files.deleteIfExists(new File(DSMDiffPath).toPath());
				
				
				File DSMDiff_File=new File(DSMDiffPath);
				// Transform all objects that were in first (Base) version 
				Files.copy( (new File(VerBasePath)).toPath(), DSMDiff_File.toPath());
				
				ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,DiffMM_eNSURI, DiffMM_eIN);
				//ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,PacmanGoAugmentedPackage.eNS_URI, PacmanGoAugmentedPackage.eINSTANCE);
				final Comparison comparisonBaseDSMDiff = new DsEMFComparator().compareCore2(rsetDSMDiff, rsBase); 
				
				final Comparison comparisonNewDSMDiff = new DsEMFComparator().compareCore2(rsetDSMDiff, rsNew); 
				
				//rsetDSMDiff=setResourceSet(DSMDiffPath,PacmanGoDiffMMPackage.eNS_URI, PacmanGoDiffMMPackage.eINSTANCE);
				rsourceDSMDiff=rsetDSMDiff.getResource(URI.createFileURI(DSMDiffPath) , true);				

				((XMLResource) rsourceDSMDiff).getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_PROCESS_DANGLING_HREF,Boolean.FALSE);					
							
				//PacmanGoAugmented.Root rootDSMDiff= (PacmanGoAugmented.Root)rsourceDSMDiff.getContents().get(0);
				//PacmanGoDiffMM.Game rootDSMDiff=(PacmanGoDiffMM.Game)rsourceDSMDiff.getContents().get(0);				
				
				EObject[][] diffsMatch = new EObject[differences.size()][3];
									
				int s=-1;
				
				//Transform Diffs representing classes which are added or deleted
				ArrayList<Diff> differencesToLookAgain= new ArrayList<Diff>();
				final ArrayList<Diff> differencesToReview= SortByDependencies(differences, false);
				ArrayList<Diff> differencesOfEOtherTypes= new ArrayList<Diff>();
				ArrayList<EObject> objectsToDelete= new ArrayList<EObject>();
				
				//differencesToReview = SortByDependencies(differences, false);
				
				
				differences.forEach(d->{
					if(d != null){
							EList<Diff> requiredByList= d.getRequiredBy();
							
						}
					}
				);				
				
				
/*				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && (((ReferenceChange)d).getValue().getClass().getName().contains("EClass")) && d.getKind()==DifferenceKind.ADD) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}
				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && (((ReferenceChange)d).getValue().getClass().getName().contains("EClass")) && d.getKind()==DifferenceKind.DELETE) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}							
*/				
				differences.forEach(d->{
						if((d instanceof ReferenceChange)
								&&(d.getKind()==DifferenceKind.DELETE)
								&&!differencesToReview.contains(d)
								/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
							differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);
				differences.forEach(d->{
					if((d instanceof ReferenceChange)
							&&(d.getKind()==DifferenceKind.ADD)
							&&!differencesToReview.contains(d)
							/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
						differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);	
				
				
/*				
				for(Diff d:differences){
					if(d instanceof ReferenceChange && d.getKind()==DifferenceKind.MOVE) {
						String leftContainerType= "", rightContainerType= "";	
						try {
							leftContainerType=d.getMatch().getLeft().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							leftContainerType="";
						}
						try {
							rightContainerType=d.getMatch().getRight().eContainer().eClass().getName();
						}catch(Exception ex)
						{
							rightContainerType="";
						}					
						
						if(leftContainerType.equals("EPackage") || rightContainerType.equals("EPackage")) {
								differencesToReview.add(d);
						}
					}
				}				
*/
				
				differences.forEach(d->{
					if((d instanceof ReferenceChange)
							&&(d.getKind()==DifferenceKind.MOVE)
							&&!differencesToReview.contains(d)
							/*&&(((ReferenceChange)d).getValue().getClass().getName().contains("EClass"))*/) {
							differencesToReview.add(d);//differencesOfEClassType
						}
					}
				);
				
				differences.forEach(d->{
					if(!differencesToReview.contains(d)){
						differencesToReview.add(d);
						}
					}
				);
				
				/*
				for(Diff diff:differencesToReview)
				{
					if(diff.getMatch().getLeft().eContainer().eClass().getName().equals("EPackage"))
					{
						int itemPos = differencesToReview.indexOf(diff);
						differencesToReview.remove(itemPos);
						differencesToReview.add(itemPos, diff);
					}
				}*/
				
				
				//differencesToReview.sort
				
				
				//differencesOfEOtherTypes.forEach(d->differencesToReview.add(d));
				
//********************************************				
				//int rep=0;
				//do {
					//rep++;
					//System.out.println("** N"+rep);
				//do {
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof ReferenceChange  
							&& (diff.getKind() == DifferenceKind.DELETE 
								|| diff.getKind() == DifferenceKind.ADD 
								|| diff.getKind() == DifferenceKind.MOVE))
					{
						final ReferenceChange refAddDel = (ReferenceChange)diff;											
						//Target of the association  == refAddDel.getValue()
						//in DifferenceKind.DELETE, getValue returns value in the (Base) version , 
						// and in DifferenceKind.ADD, it returns value in the (New) version
						EObject 	EDiffObject			= refAddDel.getValue(); 
						EObject 	DSDiffObject		= findInDiffMatchs(diffsMatch, EDiffObject,s);
						
						EClass 		EDiffObjectEClass 	= EDiffObject.eClass();								
						EClassifier DSDiffEClassifier	= EDiffObjectEClass.getEPackage().getEClassifier("Diff"+EDiffObjectEClass.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;						
						if(DSDiffObject==null) {
							DSDiffObject		=    DiffMM_Factory.create(DSDiffEClass);//  PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
							// %%% Can be solved next by inheritance DiffMM_FactoryClass inherits from ArduinoDiffMMFactory
							//DiffMM_Factory = ArduinoDiffMMFactory, PacmanGoDiffMMFactory.eINSTANCE;
								
							//PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
							//EObject 	DSDiffObject		= PacmanGoAugmentedFactory.eINSTANCE.create(DSDiffEClass);
						
							for(EAttribute attr:EDiffObjectEClass.getEAllAttributes())
							{
								DSDiffObject.eSet(attr,EDiffObject.eGet(attr));
							}
						}												
						
						EAttribute attrOperation=DSDiffEClass.getEAllAttributes().stream().filter(f->f.getName()=="operation").collect(Collectors.toList()).get(0);
						/*
						for(EAttribute attr:DSDiffEClass.getEAllAttributes())
						{
							if(attr.getName()=="operation")
								attrOperation=attr;
						}*/	
						
						
						//As we have both roots (match) in the left and right of the value
						//i.e. // (!Objects.equal(refChange.getMatch().getRight(), null) && !Objects.equal(refChange.getMatch().getLeft(), null))
						//We take right because we have decided to build the DSMDiff from base
						EObject rootMatchBase = null;
						EObject rootMatchDSMDiff = null;
						
						try {//TO-DO: Need to investigate
								if(refAddDel.getSource() == DifferenceSource.LEFT) {
									try {
									rootMatchBase=refAddDel.getMatch().getRight(); //Source of the association
									rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();
									}
									catch(Exception ex) {
										rootMatchBase=refAddDel.getMatch().getLeft(); //Source of the association
										rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getRight();
									}
								}
								else {
									try {
								
									rootMatchBase=refAddDel.getMatch().getLeft(); //Source of the association
									rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getRight();
									}
									catch(Exception ex) {
										rootMatchBase=refAddDel.getMatch().getRight(); //Source of the association
										rootMatchDSMDiff=comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();
									}
								
								}
						}
						catch(Exception ex) {
							rootMatchDSMDiff=findInDiffMatchs(diffsMatch, rootMatchBase,s);
							if(rootMatchDSMDiff==null)
								rootMatchDSMDiff=findInDiffMatchs(diffsMatch,EDiffObject.eContainer(), s);
							System.out.println("\n" + s+ ". Exception - line 1217 - Kind: "+refAddDel.getKind()+"\n  -DSDiffObject= "+DSDiffObject.toString() + "\n  -refAddDel:"+refAddDel);// + "/ root= "+rootMatchDSMDiff!=null?rootMatchDSMDiff.toString():"");
							System.out.println("  -ex= "+ex);
							System.out.println("  -rootMatchBase= "+rootMatchBase);
							differencesToLookAgain.add(diff);
							//differences.add(diff);
							//continue;
						}						
						
						EEnum ClassOpType = (EEnum)  EDiffObjectEClass.getEPackage().getEClassifier("ClassOp");//DiffMM_Factory.create((EClass)						
						Object ClassOpAdd = DiffMM_Factory.createFromString(ClassOpType, "ADD");
						//refAddDel.getKind() == DifferenceKind.ADD || refAddDel.getKind() == DifferenceKind.MOVE
						
						DSDiffObject.eSet(attrOperation,ClassOpAdd);						
						Object ClassOpDelete = DiffMM_Factory.createFromString(ClassOpType, "DELETE");
						
						if(refAddDel.getKind() == DifferenceKind.DELETE)
							DSDiffObject.eSet(attrOperation,ClassOpDelete);
						//if(refAddDel.getKind() == DifferenceKind.ADD)
							//DSDiffObject.eSet(attrOperation,ClassOp.ADD);
						

						//System.out.println(DSDiffObject);
						if(rootMatchDSMDiff==null) {//%%%%%%  Highly need to check
							// %%%%%%%%
							// It needs a post processing
							// We need to sor this kind of class-diffs in an array and review them again 
							//		untill they all finish 
							// %%%%%%%%
							//The root container exists and it also is a kind of diff
							// but enters to the loop later than its child (the current diff)
							
							//DSDiffObject.eContainer().
							
							
							
							/*///&&&&&&&&&&&&&&&&&&&&&
							EObject theRoot= EDiffObject.eContainer();
							//%%%%%% rootMatchBase = findInDiffMatchs(diffsMatch, theRoot,s) returns null
							
							
							if(theRoot!=null)
								System.out.println("theRoot= EDiffObject.eContainer() = "+theRoot.toString());
							else
								System.out.println("theRoot= EDiffObject.eContainer() also was null");
							
							rsourceDSMDiff.getContents().add(DSDiffObject);		
							&&&&&&&&&&&&&&&&&&&&&&&&&& */
							try {//***// DSDiffObject did not added anywhere
								////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
								//***//rsourceDSMDiff.save(null);
							}
							catch(Exception exF) {
								System.out.println(s +" : Not saved (1238): " + exF.toString());
							}
							
						}
						else
						{
							EReference refType=null;	
							
							refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase(refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
							
							/*for(EReference ref:rootMatchDSMDiff.eClass().getEAllReferences()) //rootDSMDiff
							{
								if(ref.getName()==refAddDel.getReference().getName()) //ref.getEReferenceType().getName()==refAddDel.eClass().getName() &&
									refType=ref;					//TO-DO: Did not work : if(ref.getName().equals("diff"+refAddDel.getReference().getName())) 
							}*/
							
							//System.out.println(rootMatchDSMDiff.eContents());
							
							
							try {//TO-DO
								//if(refType!=null) {
									SetEFeature(rootMatchDSMDiff, refType, DSDiffObject);
									//***//rsourceDSMDiff.save(null);
								//}
							}catch(Exception ex) {
								try
								{
									refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase("diff"+refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
									/*for(EReference ref:rootMatchDSMDiff.eClass().getEAllReferences()) //rootDSMDiff
									{
										if(ref.getName()=="diff"+refAddDel.getReference().getName()) 
											refType=ref;					
									}*/
									//if(refType!=null) {
										SetEFeature(rootMatchDSMDiff, refType, DSDiffObject);
										//***//rsourceDSMDiff.save(null);
									//}
								}
								catch(Exception ex1) {
									//The following works for refactoring.ecore
									//refType=rsourceDSMDiff.getContents().get(0).eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase("eclassifiers")).collect(Collectors.toList()).get(0);
									//SetEFeature(rsourceDSMDiff.getContents().get(0), refType, DSDiffObject);
									//rsourceDSMDiff.getContents().add(DSDiffObject);
									try {//***// DSDiffObject did not added anywhere
										////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
										//***//rsourceDSMDiff.save(null);
									}
									catch(Exception exF) {
										System.out.println(s + " : Not saved (1294): " + exF.toString());										
									}
									
								}								
							}
						}										
						
						
						
						//System.out.println(rootMatchDSMDiff.eContents());

						s++;
						if(refAddDel.getKind() == DifferenceKind.DELETE)// refAddDel.getKind() == DifferenceKind.MOVE
						{
							diffsMatch[s][0]=EDiffObject;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(EDiffObject).getLeft();	
							//if(!getAttrValueByAttrName(eObjectToDelete, "name").toString().contains("Diff"))
							System.out.println("\ns = " +s+ ",DifferenceKind.DELETE,  eObjectToDelete= "+ eObjectToDelete + " refAddDel ="+refAddDel);
							
							EcoreUtil.delete(eObjectToDelete);	
							objectsToDelete.add(eObjectToDelete);
						}
						if(refAddDel.getKind() == DifferenceKind.ADD)
						{							
							diffsMatch[s][0]=null;
							diffsMatch[s][1]=EDiffObject;
							diffsMatch[s][2]=DSDiffObject;	
						}

						if(refAddDel.getKind() == DifferenceKind.MOVE)
						{					
							diffsMatch[s][0]=EDiffObject;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject DSDiffObjectCopy=null;
							try {
								EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(comparisonNewDSMDiff.getMatch(EDiffObject).getLeft()).getLeft();							
								EObject eObjectToDeleteContainer=eObjectToDelete.eContainer();
								System.out.println("\ns = " +s+ ",DifferenceKind.MOVE,  eObjectToDelete= "+ eObjectToDelete + " refAddDel ="+refAddDel);
								
								EcoreUtil.delete(eObjectToDelete);
								objectsToDelete.add(eObjectToDelete);
								// As we do not have MOVE in our MM (Move interpreted as DELETE from/ADD to
								
								DSDiffObjectCopy=EcoreUtil.copy(DSDiffObject);
								EAttribute attrOperationD= DSDiffObjectCopy.eClass().getEAllAttributes().stream().filter(f->f.getName()=="operation").collect(Collectors.toList()).get(0);
								DSDiffObjectCopy.eSet(attrOperationD,ClassOpDelete);	
								EReference refType=null;								
								refType= rootMatchDSMDiff.eClass().getEAllReferences().stream().filter(r->r.getName().equalsIgnoreCase(refAddDel.getReference().getName())).collect(Collectors.toList()).get(0);
								SetEFeature(eObjectToDeleteContainer, refType, DSDiffObjectCopy);
							}
							catch(Exception ex2) 
							{
								//addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObjectCopy);
								System.out.println("\n" + s+ ". Exception -line 1368 - Kind: "+ refAddDel.getKind()+ "\n  -DSDiffObject=" +DSDiffObject+ "\n  -refAddDel=" +refAddDel.toString()+"; Broken. NEED to be solved later");
								System.out.println("  -ex Move= "+ex2);
								System.out.println("  -rootMatchBase= "+rootMatchBase);
							}
							
							
						}
					}
				}
				//differencesToReview.clear();
				//differencesToLookAgain.forEach(d->differencesToReview.add(d));
			//}while(differencesToReview.size()>0);
				
//***************************************				
				//Transform Diffs representing references which are added or deleted
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof ReferenceChange && diff.getKind() == DifferenceKind.CHANGE)
					{
						final ReferenceChange  refChange= (ReferenceChange)diff;
						
						EObject 	EDiffObjectTarget			= refChange.getValue(); //in Delete case getValue returns value in the (Base) version , and in Add it returns value in the (New) version
						EClass 		EDiffObjectEClassTarget 	= EDiffObjectTarget.eClass();
						EObject 	DSDiffObjectTarget			= null;					
						
						//As we have both roots (match) in the left and right of the value
						//i.e. // (!Objects.equal(refChange.getMatch().getRight(), null) && !Objects.equal(refChange.getMatch().getLeft(), null))
						//We take right as we build the DSMDiff from base						
						
						EObject rootMatchSource 		= null;//refChange.getMatch().getRight(); 
						EObject rootMatchDSMDiffSource 	= null;//comparisonBaseDSMDiff.getMatch(rootMatchBase).getLeft();						
						
						try {//TO-DO: Need to fix
							if(refChange.getSource()==DifferenceSource.RIGHT)
							{
								
								try {
								rootMatchSource			= refChange.getMatch().getLeft();
								if(rootMatchSource==null) {
									rootMatchSource			= refChange.getMatch().getRight();
								}
								
								}catch(Exception ex1) {
									rootMatchSource			= refChange.getMatch().getRight();	
								}								
								
								rootMatchDSMDiffSource= findInDiffMatchs(diffsMatch, rootMatchSource,s);							
								if(rootMatchDSMDiffSource==null)							
									rootMatchDSMDiffSource	= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(rootMatchSource).getRight()).getLeft();
								DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(EDiffObjectTarget).getRight()).getLeft();
							}
							else if(refChange.getSource()==DifferenceSource.LEFT)			
							{
								try {
									rootMatchSource			= refChange.getMatch().getRight();	
									if(rootMatchSource==null) {
										rootMatchSource			= refChange.getMatch().getLeft();
									}
								
								}catch(Exception ex1) {
									//%%%%%%//Need to be considered 2019-10-28   rootMatchSource			= refChange.getMatch().getLeft();
								}					
								rootMatchDSMDiffSource= findInDiffMatchs(diffsMatch, rootMatchSource,s);							
								if(rootMatchDSMDiffSource==null)
									rootMatchDSMDiffSource	= comparisonBaseDSMDiff.getMatch(rootMatchSource).getLeft();								
								DSDiffObjectTarget	= findInDiffMatchs(diffsMatch, EDiffObjectTarget,s);	
								if (DSDiffObjectTarget == null )
								{
									try {
									DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(EDiffObjectTarget).getLeft();
									}
									catch(Exception ex3) {
										DSDiffObjectTarget		= comparisonNewDSMDiff.getMatch(EDiffObjectTarget).getLeft();
									}								

								}
							}
						}catch(Exception ex) {
							
							try {
									DSDiffObjectTarget		= comparisonBaseDSMDiff.getMatch(comparisonBaseNew.getMatch(EDiffObjectTarget).getRight()).getLeft();
							}catch(Exception ex2) {
								System.out.println("//%%%%%%//Need to be considered 2019-10-28");
								System.out.println(refChange.getSource().toString());
								System.out.println(diff.getKind().toString());
								System.out.println(refChange.getReference().getName());
								System.out.println(refChange.getReference().toString());
								System.out.println(ex.toString());	
								System.out.println("------------------------------------------");
								continue; //%%%%%%//Need to be considered 2019-10-28
							}
						}				 
						
						
						
						String refName="diff"+refChange.getReference().getName();
						EReference refType=null;						
						for(EReference ref:rootMatchDSMDiffSource.eClass().getEAllReferences()) //rootDSMDiff
						{
							if(ref.getName().contains(refName))
								refType=ref;
						}					
						String refTypeName= ((EClass)refType.eCrossReferences().get(0)).getName();
						//Corresponding class for Association
						String DiffEReferenceClassName	= refTypeName;// "Diff"+ refChange.getReference().getEReferenceType().getName()+"_"+refChange.getReference().getName();
						EClassifier DSDiffEClassifier	= EDiffObjectEClassTarget.getEPackage().getEClassifier(DiffEReferenceClassName);// EDiffObjectEClassTarget.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;						
						EObject 	DSDiffObject		= DiffMM_Factory.create(DSDiffEClass);// PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
																//ArduinoDiffMMFactory , PacmanGoDiffMMFactory
						//EObject 	DSDiffObject		= PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);
													
					
						EAttribute 	attrOperation=DSDiffEClass.getEAllAttributes().stream().filter(f->f.getName()=="operation").collect(Collectors.toList()).get(0);

						/*
						for(EAttribute attr:DSDiffEClass.getEAllAttributes())
						{
							if(attr.getName()=="operation")
								attrOperation=attr;
						}*/
						
						EEnum AscOpType = (EEnum)  EDiffObjectEClassTarget.getEPackage().getEClassifier("AscOp");								
						Object AscOpMODIFY = DiffMM_Factory.createFromString(AscOpType, "ADD");	

						
						
						DSDiffObject.eSet(attrOperation, AscOpMODIFY); 
						if (refChange.getMatch().getRight()!=null && refChange.getMatch().getRight().eCrossReferences()!=null)
						  for (EContentsEList.FeatureIterator featureIterator = 
							        (EContentsEList.FeatureIterator)refChange.getMatch().getRight().eCrossReferences().iterator();
							       featureIterator.hasNext(); )
							  {
							  	featureIterator.next();
							    EReference eReference = (EReference)featureIterator.feature();
							    if(eReference == refChange.getReference()) {
							    	Object AscOpDELETE = DiffMM_Factory.createFromString(AscOpType, "DELETE");	
							    	DSDiffObject.eSet(attrOperation, AscOpDELETE); 
							    }
							  }			
						
						EReference refType1= rootMatchDSMDiffSource.eClass().getEAllReferences().stream().filter(f->f.getEReferenceType().getName()==DSDiffObject.eClass().getName()).collect(Collectors.toList()).get(0);
						
						/*
						for(EReference ref:rootMatchDSMDiffSource.eClass().getEAllReferences()) 
						{
							if(ref.getEReferenceType().getName()==DSDiffObject.eClass().getName())
								refType1=ref;
						}*/

						try {//TO-DO: fix
							
							SetEFeature(rootMatchDSMDiffSource, refType1, DSDiffObject);
						}catch(Exception ex) {

							System.out.println("Error: Exception "+DSDiffObject.eContainer().toString() +" / "+DSDiffObject.toString());
						}
						
						
						EReference refType2=DSDiffObject.eClass().getEAllReferences().stream().filter(f->f.getName().contains("eType")).collect(Collectors.toList()).get(0);
						/*
						for(EReference ref:DSDiffObject.eClass().getEAllReferences())
						{
							if(ref.getName().contains("eType"))//ref.getEReferenceType().getName().toLowerCase()==refChange.getValue().eClass().getName())
								refType2=ref;
						}*/
												
						try {//TO-DO: fix
						SetEFeature(DSDiffObject, refType2, DSDiffObjectTarget);
						}
						catch(Exception ex) {
							System.out.println(ex.toString());
						}
						//System.out.println(DSDiffObject.eGet(refType2));
						
						//System.out.println();
						try {//TO-DO: fix
							//***//rsourceDSMDiff.save(null);	
						}
						catch(Exception ex) {
							System.out.println("Error: Exception "+DSDiffObject.eContainer().toString() +" / "+DSDiffObject.toString());
						}					
					}
					
				}
				
//****************************************				
				
				//Transform Diffs representing attributes which are modified
				for(Diff diff:differencesToReview)
				{
					if (diff instanceof AttributeChange) 
					{
						final AttributeChange attChange = (AttributeChange)diff;
						
					    EObject 	EDiffObjectBase		= attChange.getMatch().getRight(); 					// (Base) version
						
						EClass 		EDiffObjectEClass 	= EDiffObjectBase.eClass();								
						EClassifier DSDiffEClassifier	= EDiffObjectEClass.getEPackage().getEClassifier("Diff"+EDiffObjectEClass.getName());	
						EClass		DSDiffEClass		= (EClass)DSDiffEClassifier;
						
						EObject 	DSDiffObject		=findInDiffMatchs(diffsMatch, EDiffObjectBase,s);
						if(DSDiffObject==null)
						{
							DSDiffObject		=  DiffMM_Factory.create(DSDiffEClass);// PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);	
							// %%%%%%%
							// DSDiffObject		= ArduinoDiffMMFactory , 
							//PacmanGoDiffMMFactory.eINSTANCE.create(DSDiffEClass);											
							//EObject 	DSDiffObject		= PacmanGoAugmentedFactory.eINSTANCE.create(DSDiffEClass);				
							
							for(EAttribute attr:EDiffObjectEClass.getEAllAttributes())
							{
								DSDiffObject.eSet(attr,EDiffObjectBase.eGet(attr));
							}			
						}
						EAttribute attrOperation 	= null;
						EAttribute attrNew 			= null;
						
						List<EAttribute> lstEAtrrsNoNew= DSDiffEClass.getEAllAttributes().stream().filter(at -> !at.getName().contains("new_")).collect(Collectors.toList());

						for(EAttribute eAtrrsNoNew:lstEAtrrsNoNew)
						{
							if(eAtrrsNoNew.getName()!="operation")
							{
								EAttribute eAtrrNewEq=DSDiffEClass.getEAllAttributes().stream().filter(at -> at.getName().contains("new_" + eAtrrsNoNew.getName())).collect(Collectors.toList()).get(0);
								if(eAtrrNewEq!=null) {
									DSDiffObject.eSet(eAtrrNewEq,DSDiffObject.eGet(eAtrrsNoNew));
									if(eAtrrNewEq.getName().contains("new_"+attChange.getAttribute().getName()))
									{
										attrNew=eAtrrNewEq;
										DSDiffObject.eSet(attrNew,attChange.getValue());
									}										
								}
							}
							else if(eAtrrsNoNew.getName()=="operation") {
								EEnum ClassOpType = (EEnum)  EDiffObjectEClass.getEPackage().getEClassifier("ClassOp");//DiffMM_Factory.create((EClass)						
								Object ClassOpMODIFY = DiffMM_Factory.createFromString(ClassOpType, "MODIFY");																				
								
								//EEnum ClassOp = (EEnum) EDiffObjectEClass.getEPackage().getEClassifier("ClassOp"); //DiffMM_Factory.create((EClass)
								attrOperation=eAtrrsNoNew;
								DSDiffObject.eSet(attrOperation,ClassOpMODIFY);
							}
						}						
						//DSDiffObject.eSet(attrNew,attChange.getValue());					
						
						
						//There maybe multiple attribute change for the same object
						//For the first one we come accross, a new DSDiffObject will be created
						//for the others, we extract it from the diffsMatch array
						EObject 	DSDiffObjectOfBase		= findInDiffMatchs(diffsMatch, EDiffObjectBase,s);	// (DSD) version of Base Vesrion 							
						if(	DSDiffObjectOfBase==null)
						{
							DSDiffObjectOfBase				= comparisonBaseDSMDiff.getMatch(EDiffObjectBase).getLeft();	
							EcoreUtil.replace(DSDiffObjectOfBase, DSDiffObject);
							s++;
							diffsMatch[s][0]=EDiffObjectBase;
							diffsMatch[s][1]=null;
							diffsMatch[s][2]=DSDiffObject;
							EObject eObjectToDelete=comparisonBaseDSMDiff.getMatch(EDiffObjectBase).getLeft();	
						}		
						
						try {//TO-DO: Need to fix					;
							//***//rsourceDSMDiff.save(null);
						}catch(Exception ex) {//***// DSDiffObject did not added anywhere
							////addToPackage(rsourceDSMDiff.getContents().get(0), DSDiffObject);
							////rsourceDSMDiff.getContents().add(DSDiffObject);
							//***//rsourceDSMDiff.save(null);
							System.out.println(ex.toString());
						}
						//EcoreUtil.delete(eObjectToDelete);	
					}					
				}		
//***********************************				
				
				
				
				try {//TO-DO: fix
					rsourceDSMDiff.save(null);
					}
				catch(Exception ex) {
					System.out.println(ex.toString());
				}				
				
				//objectsToDelete.forEach(obj->{EcoreUtil.delete(obj);});
	    	} 
		    catch (Throwable _e) 
	    	{
				Files.write(VerBase_File.toPath(), contentBaseFile.getBytes(charset));
				Files.write(VerNew_File.toPath(), contentNewFile.getBytes(charset));
		    	System.out.println(_e);   	
		    	//rsourceDSMDiff.save(null);
				//For ThreeWay Test Begin
				//Files.write(VerOrigin_File.toPath(), contentNewFile.getBytes(charset));
				//For ThreeWay Test End
				
				System.out.println("The end of transforming EMF-Diff to DSMC-Diff -- Inside last catch");
		    	
	    		throw Exceptions.sneakyThrow(_e);
	    	}	
		    
			Files.write(VerBase_File.toPath(), contentBaseFile.getBytes(charset));
			Files.write(VerNew_File.toPath(), contentNewFile.getBytes(charset));
			//For ThreeWay Test Begin
			//Files.write(VerOrigin_File.toPath(), contentNewFile.getBytes(charset));
			//For ThreeWay Test End
			
			System.out.println("The end of transforming EMF-Diff to DSMC-Diff");
		 
	 }
	 private boolean isRepeatetive(EObject e, EObject d) {
		 return e.eClass().getName().equals(d.eClass().getName()) 
				 && getAttrValueByAttrName(e, "name").equals(getAttrValueByAttrName(d,"name"));
	 }
	 
	 private boolean addToPackage(EObject p, EObject DSDiffObject) {
		 //p=rsourceDSMDiff.getContents().get(0); == The root of the Package
		 try {
		 int s= p.eContents().stream().filter(
				 e-> isRepeatetive(e,DSDiffObject)
				 ).collect(Collectors.toList()).size();
		 if( s > 0)
		 {
		 		return true;
		 }}
		 catch(Exception ex) {
			 return false;
		 }
		 for(EReference refType:p.eClass().getEAllReferences()) {
			 try {	
				 //getattributevalue
				 	/*if( p.eContents().stream().filter(
				 			e-> getAttrValueByAttrName(e, "name").equals(
				 					getAttrValueByAttrName(DSDiffObject,"name")))
				 			.collect(Collectors.toList()).size() > 0) */
				 	
				 	SetEFeature(p, refType, DSDiffObject);
				 	return true;
			 }catch(Exception ex) {
				 return false;
			 }
		 }
		 return false;		 
	 }

	 
	 //*************MATCHING***********	
	 
	 public DSRuleSpec ruleMatcher(String RulePath, Resource dsDiffRes)
	 {
		 Resource 	ruleRes		= retPackResouceM(RulePath, RuleMM_eNSURI, RuleMM_eIN);			 
		 
		 //Test equality of root eclass in both rule and diff element
		 EObject 	rootDSDiff 	= dsDiffRes.getContents().get(0);	
		 //All elements in rule package are inherited from diff package: 
		 //	=>	ruleRes.eClass().getESuperTypes().contains(rootDSDiff.eClass())
		 EObject 	rootRule 	= ruleRes.getContents().get(0).eContents().stream()
				 					.filter(c -> c.eClass().getESuperTypes()
				 							.contains(rootDSDiff.eClass()))
				 					.findFirst().get();	
		 
		 if(rootRule==null)
		 {
			 System.out.println("Eclass are not equal: ");
			 return null;
		 }			 
		 
		 System.out.println("Eclass are equal: ");
		 System.out.println(ruleRes.getContents());
		 System.out.println(rootRule);
		 System.out.println(rootDSDiff);	
		 
		 EObject dsdiffElement= rootRule.eContents().stream().filter(r -> r.eClass().getName().toLowerCase().equals("Pattern_DomainSpecificDiff".toLowerCase())).findFirst().get();
		 EAttribute nameEAttribute= getEAttributeByName(dsdiffElement,"name"); 
		 System.out.println("dsdiffElement: ");		 		 
		 System.out.println(dsdiffElement);
		 System.out.println(dsdiffElement.eGet(nameEAttribute));	
		 dsdiffElement.eContents().forEach(e ->System.out.println(e));		 
		 
		 DSRuleSpec dSRuleSpec= new DSRuleSpec();	
		 dSRuleSpec.filePath= RulePath;
		 //Doc// R:/Thesis/DSMCompare/com.Zadahmad.DSEMFCompare.editor/model/Pacman/PacmanEatFood/Rule.xmi
		 dSRuleSpec.EClassName=dsdiffElement.eGet(nameEAttribute).toString();
		 //Doc// PacmanEatFood
		 dsdiffElement.eContents().forEach(e ->dSRuleSpec.dsDiffReqs.add(e));
		 dsdiffElement.eContents().forEach(e ->dSRuleSpec.dsDiffReqEClassifiers.add(e.eClass().getESuperTypes().get(0)));	
		 //Doc//  org.eclipse.emf.ecore.impl.EClassImpl@6acdbdf5 (name: DiffFood) (instanceClassName: null) (abstract: false, interface: false)
		 //Doc//  org.eclipse.emf.ecore.impl.EClassImpl@79be0360 (name: Pacman) (instanceClassName: null) (abstract: false, interface: false)
		 		  
		 DSRuleMatched dsRuleMatched= new DSRuleMatched();
		 dsRuleMatched.dsRuleSpec=dSRuleSpec;	
		
		if(matchRoots(rootDSDiff,rootRule))
		{
			dsRuleMatched.RootD=rootDSDiff;
			dsRuleMatched.RootR=rootRule;
			
			MRN rootM= new 	MRN();
			rootM.Ref=null;
			rootM.Clas=rootRule.getClass();
			rootM.ruleNode=rootRule;
			//RootM.matchedNodes.add(rootDSDiff);
			rootM.matchedNode=rootDSDiff;
			
			dsRuleMatched.RootM=rootM;
			
			dsRuleMatched.isMached=partialRuleMatcher(dsRuleMatched.RootM); 
			
			visitedMRN.clear();
				
			System.out.println();
			System.out.println();
			System.out.println();
			PrintMRN(dsRuleMatched.RootM, "########################>>FINAL---> MatchedRN: ");	

			System.out.println();
			System.out.println();
			System.out.println();
			exactRuleMatcher(dsRuleMatched);
			
			if(dsRuleMatched.isMached)
			{
				dsRuleMatched.ruleRes=ruleRes;
				CheckForConstraints(dsRuleMatched);
				CreateRHS(dsRuleMatched);
			}
			else
				System.out.println("There is not a match for " + dsRuleMatched.RootR);
			
			/*
			
			if(dsRuleMatched.isMached)
			{
				CreateRHS(dsRuleMatched);
			}
			else
				System.out.println("There is not a match for " + dsRuleMatched.RootR);
			*/
			
		}
			
		//!!!!!!!!!!!!!!!!!!!!!!!!! Should be set
		//dsRuleMatched.matchedRuleNode 
		 	 
		 return dSRuleSpec;		 
	 }
	  
	//---
	 
	 boolean partialRuleMatcher(MRN RootM)
	 {		 
		 System.out.println("Match EReferences: ");
		 visitedMRN.add(RootM);
		 if(!refMatcher(RootM))
			 return false;
		 System.out.println(".............................  EReferences  are matched!");
		 
		 return true;		 
	 }
	 
	 //---
	 public void notFoundExactMatchInMVariantAction(DSRuleMatched dsRuleMatched,EObject ruleNode)
	 {
		 dsRuleMatched.matchVariant.clear();
			System.out.println("No match found for" + ruleNode);
			dsRuleMatched.isMached=false;
			dsRuleMatched.countOfMatchs=0;
	 }
	  
	 //--- 
	 public void exactRuleMatcher(DSRuleMatched dsRuleMatched)
	 {		 
		 
		MRN 		rootM = dsRuleMatched.RootM;	
		EObject 	rootR = dsRuleMatched.RootR;
	 
		//MRN 		rmNode=rootM;
		//EObject 	rrNode=rootR;
		
		
		MatchVariant newMV= new MatchVariant();
		MVItem mvRoot= new MVItem();
		mvRoot.parentRule = null;
		mvRoot.parentDSD  = null;
		mvRoot.nodeRule   = rootM.ruleNode;
		mvRoot.nodeDSD    = rootM.matchedNode;
		newMV.matchList.add(mvRoot);
		dsRuleMatched.matchVariant.add(newMV);
		
		System.out.println(rootM.ruleNode + " :: " + rootM.matchedNode);
		//node.visited = true;
		
		dsRuleMatched.isMached	= true;
		dsRuleMatched.countOfMatchs=1;		
		
		ArrayList<MRN> Mrns= new ArrayList<MRN>();
		Mrns.add(rootM);
		ArrayList<EObject> rNodes= new ArrayList<EObject>();
		rNodes.add(rootR);
		
		int rnSize=rNodes.size();
		
		for(int index=0; index < rnSize; index++) {
			EObject ruleNode = rNodes.get(index);//(EObject)	rootR;
			MRN 	mrnNode=null;
			try
			{
				mrnNode = Mrns.get(index);//rootM;
			}
			catch(Exception ex)
			{
				notFoundExactMatchInMVariantAction(dsRuleMatched,ruleNode);
				return;
			}
			
			if(mrnNode.ruleNode!=ruleNode)
			{
				notFoundExactMatchInMVariantAction(dsRuleMatched,ruleNode);
				return;
			}
			
			ArrayList<EObject> rPatterns= new ArrayList<EObject>();
			EObject dsdPattern=null;
			
			for(EObject p:ruleNode.eContents())
			{
				List<MRN> pMatchs= mrnNode.refMRN.stream().filter(m->m.ruleNode==p).collect(Collectors.toList());
				if(pMatchs.size()==0 && !p.toString().toLowerCase().contains("domainspecificdiff"))
				{
					notFoundExactMatchInMVariantAction(dsRuleMatched,ruleNode);
					return;
				}
				
				if(!p.toString().toLowerCase().contains("domainspecificdiff"))
					rPatterns.add(p);
				else
					dsdPattern=p;
			}
			
			//For the current node
			dsRuleMatched.isMached = true;			
			
			for(EObject p:rPatterns)
			{
				List<MRN> rmObj= mrnNode.refMRN.stream().filter(m->m.ruleNode==p).collect(Collectors.toList());
				p.eContents();
				p.eCrossReferences();
				
				ArrayList<MatchVariant> newMatchVariants= new  ArrayList<MatchVariant>();
				for(MRN mrn:rmObj)
				{				
					MVItem mvItemX= null;
					mvItemX= new MVItem();
					mvItemX.parentRule = mrnNode.ruleNode;
					mvItemX.parentDSD  = mrnNode.matchedNode;
					mvItemX.nodeRule   = mrn.ruleNode;		//p;
					mvItemX.nodeDSD    = mrn.matchedNode;
					
					EAttribute attrID_Pattern 	= getEAttributeByName(mvItemX.nodeRule,"ID_Pattern");
					Object     valID_Pattern  	= mvItemX.nodeRule.eGet(attrID_Pattern);
					
					
					ArrayList<EObject> linkedObjects= new ArrayList<EObject>();
					mvItemX.nodeDSD.eContents().forEach(n->linkedObjects.add(n));
					mvItemX.nodeDSD.eCrossReferences().forEach(n->linkedObjects.add(n));
					getReferencingObjects(mvItemX.nodeDSD).forEach(n->linkedObjects.add(n));
					
					boolean isAdded=false;
					if(linkedObjects.size() > 0)
						for(MatchVariant m:dsRuleMatched.matchVariant)
						{
							if(m.matchList.stream()
									.filter(n->linkedObjects.contains(n.nodeDSD))
									.collect(Collectors.toList()).size() > 0)
							{
								m.matchList.add(mvItemX);
								isAdded=true;
								break;
							}
						}
					
					if(isAdded==false)
					{
						//Find deep links
						//Such as diffFood.diffOn.gridnode(1)
						ArrayList<EObject> deepLinkedObjects= new ArrayList<EObject>();
						linkedObjects.forEach(l->deepLinkedObjects.add(l));
						
						if(deepLinkedObjects.size() > 0)
						{
							int S=deepLinkedObjects.size();
							for(int i=0;i<S;i++)
							{
								EObject lnkObj=deepLinkedObjects.get(i);
								for(EObject n:lnkObj.eContents())
								{
									if(n!=mrn.matchedNode && !deepLinkedObjects.contains(n))
									{
										deepLinkedObjects.add(n);
										S++;
									}
										
								}//mvItemX.nodeDSD
								for(EObject n:lnkObj.eCrossReferences())
								{
									if(n!=mrn.matchedNode && !deepLinkedObjects.contains(n))
									{
										deepLinkedObjects.add(n);
										S++;
									}
								}
							}
						}
						
						deepLinkedObjects.removeAll(linkedObjects);
						
						if(deepLinkedObjects.size() > 0)
							for(MatchVariant m:dsRuleMatched.matchVariant)
							{
								if(m.matchList.stream()
										.filter(n->deepLinkedObjects.contains(n.nodeDSD))
										.collect(Collectors.toList()).size() > 0)
								{
									m.matchList.add(mvItemX);
									isAdded=true;
									break;
								}
							}						
					}
					
					if(isAdded==false)	
					{
						for(MatchVariant m:dsRuleMatched.matchVariant)
						{
							List<MVItem> ps= m.matchList.stream()
									.filter(i-> i.nodeRule
											.eGet(getEAttributeByName(i.nodeRule,"ID_Pattern" ))
											.equals(valID_Pattern))
									.collect(Collectors.toList());
							
							if(ps.size()==0)
								m.matchList.add(mvItemX);
							else
							{
								MatchVariant newV= new MatchVariant();
								m.matchList.forEach(a ->{
									if(!ps.contains(a))
										newV.matchList.add(a);
								});	
								newMatchVariants.add(newV);
							}
						}
					}
					
					for(MatchVariant n: newMatchVariants)
					{
						n.matchList.add(mvItemX);
						dsRuleMatched.matchVariant.add(n);
					}
					
					if(mvItemX.nodeRule.eContents().size() > 0)
					{
						for(EObject nxtRNode:mvItemX.nodeRule.eContents())
						{//mvItemX.nodeDSD
							List<MRN> mrns = mrnNode.refMRN.stream()
									.filter(m->m.matchedNode == mrn.matchedNode && m.refMRN.stream()
											.filter(c->c.ruleNode==nxtRNode)
											.collect(Collectors.toList()).size() > 0)
									.collect(Collectors.toList());
							
							if(mrns.size() == 0)
							{
								notFoundExactMatchInMVariantAction(dsRuleMatched,nxtRNode);
								return;
							}
							
							for(MRN mr:mrns)
							{
								rNodes.add(mvItemX.nodeRule); //mrn.ruleNode // nxtRNode
								Mrns.add(mr);
								rnSize++;
							}
						
						}						
					}			
					
				}
			}						
		}	
	 }
	 
	 //---CONSTRAINTS CHECKER 
	 public void CheckForConstraints(DSRuleMatched dsRuleMatched) 
	 {
		 System.out.println("There are " + dsRuleMatched.matchVariant.size() +" matches before applying constraints!");
		 dsRuleMatched.matchVariant.forEach(v->{
			 System.out.println("___________"+v);
			 v.matchList.forEach(i->{
				 System.out.println(i.parentDSD + " =====> "+ i.nodeDSD);
			 });
		 });
		 System.out.println("___________");

		 EObject ruleParent=dsRuleMatched.ruleRes.getContents().get(0);	
		 EAttribute attrConstraints=getEAttributeByName(ruleParent,"constraints");		 
		 ArrayList<String> Constraints= new ArrayList<String>();
		 if(Constraints.size()==0)
		 {
			 System.out.println("Applied!");
		 	return;
		 }
		 ((List<Object>) ruleParent.eGet(attrConstraints)).forEach(o->Constraints.add((String) o));

		 ArrayList<String>   NSsPackage	= new 	ArrayList<String>();
		 NSsPackage.add("com.zadahmad.dsemfcompare.editor.tests");
		 ArrayList<String>   NSsClass	= new 	ArrayList<String>();
		 NSsClass.add("org.eclipse.emf.ecore.EObject");
		 NSsClass.add("org.eclipse.emf.ecore.EAttribute");
		 ConstraintChecker cc= new ConstraintChecker(NSsPackage, NSsClass, Constraints);
		 ArrayList<MatchVariant> mvToRemove= new ArrayList<MatchVariant>();
		 for(int j=0; j< dsRuleMatched.matchVariant.size();j++)
		 {
			 System.out.println("___________________________________________________________________________");
			 System.out.println("**************Check "+ (j+1) +"'s match out of "+  dsRuleMatched.matchVariant.size() +" candidate againes constraints");
			 
			 MatchVariant mVar	=	dsRuleMatched.matchVariant.get(j);

			 cc.matchVariant	= 	mVar;
			 boolean mResult=cc.checkByBeanShell();
			 if(!mResult)
			 {
				 mvToRemove.add(mVar);
				 System.out.println("Not Applied!");
			 }
			 else
				 System.out.println("Applied!");
		 }
		 
		 mvToRemove.forEach(r->dsRuleMatched.matchVariant.remove(r));	
		 
		 System.out.println("\nThere are " + dsRuleMatched.matchVariant.size() +" matches after applying constraints!");
		 dsRuleMatched.matchVariant.forEach(v->{
			 System.out.println("___________"+v);
			 v.matchList.forEach(i->{
				 System.out.println(i.parentDSD + " =====> "+ i.nodeDSD);
			 });
		 });
		 System.out.println("___________");
	 }
	 		  
	 
	 //---CREATE RIGHT-HAND-SIDE (DSD)
	 public void CreateRHS(DSRuleMatched dsRuleMatched)
	 {
		 System.out.println();
		 System.out.println("There are " + dsRuleMatched.matchVariant.size() +" matches after applying constraints!");
		 System.out.println();
		 
		 if(dsRuleMatched.matchVariant.size()>0)
		 {
			 
			 ResourceSet rsetDSMDiff=setResourceSet(DSMDiffPath,DiffMM_eNSURI, DiffMM_eIN);
			 Resource rsourceDSMDiff=rsetDSMDiff.getResource(URI.createFileURI(DSMDiffPath) , true); 
				
			 EObject 	rootR = dsRuleMatched.RootR;
			 
			 EObject 	rootD = dsRuleMatched.RootD;
			 
			 EObject    rootDRes=  rsourceDSMDiff.getContents().get(0);			 
			 
			 List<EObject> rDsdHeads=rootR.eContents().stream()
									 .filter(p->p.toString().toLowerCase()
											 .contains("domainspecificdiff"))
									 .collect(Collectors.toList());
			 
			 EObject rDsdHead=rDsdHeads.get(0);
			 List<EObject> rRHSObjs= rDsdHead.eCrossReferences();   
			 
			 System.out.println(rDsdHead.eClass());
			 System.out.println(rDsdHead.eClass().getESuperTypes().get(0));
			 
			 EClass dsdEClass= rDsdHead.eClass().getESuperTypes().get(0);

			 System.out.println("rDsdHead: " + rDsdHead);
			 System.out.println("rRHSObjs: " + rRHSObjs);
			 
			  
			 EReference dsdEReference= (EReference) dsRuleMatched.RootD
					 .eClass().eCrossReferences().stream()
					 .filter(r->((EReference)r).getEType() == dsdEClass)
					 .collect(Collectors.toList()).get(0);
			 
			 System.out.println("dsdEReference: " + dsdEReference.getName());
					 
			 
			 EAttribute attrNameRule 	= getEAttributeByName(rDsdHead,"Name");
			 Object     valAttrName = rDsdHead.eGet(attrNameRule);	
			 
			 
			 System.out.println("*****rootDRes.eContents(): "+rootDRes.eContents());
			 
			 List<EObject> toRemoveDSD= rootDRes.eContents().stream().filter(f->f.eClass().toString().toLowerCase().contains("domainspecificdiff")).collect(Collectors.toList());
			 
			 System.out.println(toRemoveDSD);
			 
			//%%%%%%%%%%%%%%%%% Need a Hard review
			 //It should be done once 
			 //EcoreUtil.removeAll(toRemoveDSD);
			 
			 System.out.println(dsdEReference.getEType());			 
			 
			 for(MatchVariant v:dsRuleMatched.matchVariant)
			 {				 
				 System.out.println("----------");				 
				 List<MVItem> pMtchs=  v.matchList.stream().filter(p-> rRHSObjs.contains(p.nodeRule)).collect(Collectors.toList());			 
				 			 
				 
				 EObject 	DSDiffObject	= DiffMM_Factory.create((EClass) dsdEReference.getEType());// PacmanGoDiffMMFactory.eINSTANCE.create((EClass) dsdEReference.getEType()); 
				 								// ArduinoDiffMMFactory, PacmanGoDiffMMFactory.eINSTANCE.create((EClass) dsdEReference.getEType());
				 
				 EAttribute attrNameDsd 	= getEAttributeByName(DSDiffObject,"name");
				 
				 DSDiffObject.eSet(attrNameDsd, valAttrName);
				 
				 SetEFeature(rootDRes, dsdEReference, DSDiffObject);
				 
				 for(MVItem m: pMtchs)
				 {
					 System.out.println("---->" + m.nodeRule);
					 System.out.println("====>" + m.nodeDSD);
					 String Name=m.nodeDSD.eClass().getName();
					 System.out.println("====>" + Name);
					 //System.out.println(m.nodeDSD.eClass().eContents().get(0));
					 
					 //System.out.println(DSDiffObject.eClass().getEAllReferences());
					 
					 EReference ref=null;
					 
					 try
					 {
						 ref = getEReferenceByName(DSDiffObject,Name);
					 }
					 catch(Exception ex)
					 {
						 
					 }
					 
					 if(ref==null) 
					 {
						 try
						 {
							 Name=m.nodeDSD.eClass().getESuperTypes().get(0).getName();
							 ref = getEReferenceByName(DSDiffObject,Name);
						 }
						 catch(Exception ex)
						 {
							 
						 }
					 }
					 
					 SetEFeature(DSDiffObject, ref, m.nodeDSD);
					
					 System.out.println(ref);
					 System.out.println();
				 }
				 
			 }
			 try {
				rsourceDSMDiff.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	 	 	 
//***************************************
	 
	 //@Test
	 public void matchingContainerForPacman() throws IOException 
	 {
		  setPathes("R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/pacman/metamodels/", 
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/pacman/versionsfortest/", 
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/pacman/dsdiffrules/",
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/pacman/dsdiffafterruningatest/",
				 	"PacManGo.ecore", "V1.xmi", "V2.xmi");
		 
		  setDsdRulePackages(
				 new ArrayList<String>(Arrays.asList("pacmanmovesright.xmi", "pacmaneatsfood.xmi")), 
		 		 PacmanGoDiffMMPackage.eNS_URI, PacmanGoDiffMMPackage.eINSTANCE, PacmanGoDiffMMFactory.eINSTANCE, 		 		 	
		 		 PacmanGoRuleMMPackage.eNS_URI, PacmanGoRuleMMPackage.eINSTANCE, PacmanGoRuleMMFactory.eINSTANCE,
		 		 "PacmanGo");
		 PacmanGoDiffMM.ClassOp.ADD.getValue();
		 
		 //generateDIFFMM_RuleMM();
		 MapEmfCompareDiffsToFineGranularDSMDiffs(VerBasePath, VerNewPath, DSMDiffPath, result);		 
		 		
		 for(String rule: rulesList){		 	
			 DSRuleSpecs.add(ruleMatcher(RuleRootPath + rule, retPackResouceM(DSMDiffPath, DiffMM_eNSURI, DiffMM_eIN)));
		 }
		 		 
	 }	 
	 
	 //@Test
	 public void matchingContainerForArd() throws IOException 
	 {
		 setPathes(	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/ard/metamodels/", 
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/ard/versionsfortest/", 
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/ard/dsdiffrules/",
				 	"R:/_udemRepo/DSMCompare-Project/srcCode/DSMCompare/com.Zadahmad.DSEMFCompare.editor/dsls/ard/dsdiffafterruningatest/",
				 	"arduino.ecore", "tiggertail1.xmi", "tiggertail2.xmi");
		 setDsdRulePackages(
		 			new ArrayList<String>(Arrays.asList("testrule.xmi")), 
		 			arduinoDiffMM.ArduinoDiffMMPackage.eNS_URI, arduinoDiffMM.ArduinoDiffMMPackage.eINSTANCE, arduinoDiffMM.ArduinoDiffMMFactory.eINSTANCE, 		 		 	
		 			arduinoRuleMM.ArduinoRuleMMPackage.eNS_URI, arduinoRuleMM.ArduinoRuleMMPackage.eINSTANCE, arduinoRuleMM.ArduinoRuleMMFactory.eINSTANCE,
		 		 	"arduino");
		 generateDIFFMM_RuleMM("");
		 MapEmfCompareDiffsToFineGranularDSMDiffs(VerBasePath, VerNewPath, DSMDiffPath, result);		 
		 		
		 for(String rule: rulesList){		 	
			 DSRuleSpecs.add(ruleMatcher(RuleRootPath + rule, retPackResouceM(DSMDiffPath, DiffMM_eNSURI, DiffMM_eIN)));
		 }		 
	 }
 
	 
//***************************************	 
  
}