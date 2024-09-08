package com.zadahmad.dsmcompare.core.RuleEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import dsmcompare.mmextension.utils.EMFUtils;
import dsmcompare.mmextension.utils.EMFUtils.SrcRefTrgt;

public class DsDiffModelToDsDiffRule {
	//-------------------------------------------------
	public 	String 		dsDiffModelFolder 		= "";
	public 	String 		dsDiffModelFileName 	= "";
	public 	String 		dsDiffModelPath 		= "";
	public 	String 		dsDiffRuleFolder 		= "";
	public 	String 		dsDiffRuleFileName 		= "";
	public 	String 		dsDiffRulePath 			= "";
	//-------------------------------------------------
	public 	String 		diffMM2Way_eNSURI 		= "";
	public	Object 		diffMM2Way_eIN			= null;
	public  EFactory 	diffMM2WayFactory_eIN  	= null;
	//-------------------------------------------------	
	public  String 		ruleMM2Way_eNSURI 		= "";
	public  Object 		ruleMM2Way_eIN 			= null;
	public  EFactory 	ruleMM2WayFactory_eIN  	= null;
	//-------------------------------------------------	
	public String 		diffMM_eNSURI 			= "";
	public Object 		diffMM_eIN  			= null;
	public EFactory 	diffMMFactory_eIN		= null;
	//-------------------------------------------------		
	private	PrintWriter out;
	//-------------------------------------------------
	
	public void Transform() {
		dsDiffModelPath			=	dsDiffModelFolder + dsDiffModelFileName;	
		dsDiffRulePath			=	dsDiffRuleFolder + dsDiffRuleFileName;
		File ruleFile = new File(dsDiffRulePath);
		ruleFile.delete();
		 	
		transform(dsDiffModelPath, dsDiffRulePath);		 	
	}
	
	void transform(String dsDiffModelPath, String dsDiffRulePath) {
		if(dsDiffRulePath!=""){
			try {	
				ResourceSet resourceSet		= EMFUtils.getResourceSetXMI(dsDiffModelPath,diffMM_eNSURI,diffMM2Way_eIN);
				Resource 	resourceDiffModel 	
											= EMFUtils.getResource(dsDiffModelPath, resourceSet);
				EObject diffEPackageObject 	= (EObject)resourceDiffModel.getContents().get(0);				
			    ResourceSet resourceSetRule = new ResourceSetImpl();
			    // Here the resource is created, with fileextensions "gast" and "xml" (adapt this to use your own file extension).
			    Resource resourceRule 		= EMFUtils.createAndAddResource(dsDiffRulePath, new String[] {"xmi"}, resourceSetRule);//"gast", 			    
			    EClass 		ruleEClass 		= (EClass)ruleMM2WayFactory_eIN.getEPackage().getEClassifier("Rule");	
			    EObject		ruleEObject		= ruleMM2WayFactory_eIN.create(ruleEClass);
			    EAttribute	attrName 		= EMFUtils.getEAttributeByName(ruleEObject, "name");
				EReference  refPattern		= EMFUtils.getEReferenceByNameNullDefault(ruleEObject, "pattern");
				String 		ruleName		= dsDiffRuleFileName.split("\\.")[0];
				//Single-Value Attribute
				ruleEObject.eSet(attrName, ruleName);	
				EClass 		ruleEPackageClass 	
											= (EClass)ruleMM2WayFactory_eIN.getEPackage().getEClassifier("Pattern_"+diffEPackageObject.eClass().getName());
			    EObject		ruleEPackageObject	
			    							= ruleMM2WayFactory_eIN.create(ruleEPackageClass);
				ruleEObject.eSet(refPattern,ruleEPackageObject);
				resourceRule.getContents().add(ruleEObject);
				
				Stack<EObject> diffStack= new Stack<EObject>();
				diffStack.add(diffEPackageObject);
				//BiMap<EObject,EObject> oo = HashBiMap.create();
				Set<SrcRefTrgt> srt = new HashSet<SrcRefTrgt>(); 
				srt.add(new SrcRefTrgt(diffEPackageObject,null,ruleEPackageObject));
				//oo.put(diffEPackageObject, ruleEPackageObject);
				//Clone dsDiffModel to Rule->Parent

				while(!diffStack.isEmpty()) {
					EObject diffEObj = diffStack.pop();
					EObject ruleEOBj = srt.stream().filter(f->f.source == diffEObj).collect(Collectors.toList()).get(0).target;				
					var features = new ArrayList<EStructuralFeature>(diffEObj.eClass().getEAllStructuralFeatures());
					for (EStructuralFeature r : features) {
						if(r instanceof  EReference){			
						  try{
							  	EList<EObject>  children = new BasicEList<EObject>();
							  	
							  	if(r.getUpperBound()==1)
							  		children.add((EObject) diffEObj.eGet(r));
							  	else
							  		children = (EList<EObject>) diffEObj.eGet(r);					  			
					  		  	if(children != null && children.size()>0){
						  		for (EObject child:children){
									diffStack.add(child);									
						  			EClass 	ruleEObjChildECls = 
						  					(EClass)ruleMM2WayFactory_eIN.getEPackage().getEClassifier(
						  							"Pattern_"+child.eClass().getName());
									EObject	ruleEObjChild = ruleMM2WayFactory_eIN.create(ruleEObjChildECls);
									EReference refInRuleParent = 
											ruleEOBj.eClass().getEAllReferences().stream().filter(
													ref->ref.getName().equals(r.getName())).collect(
															Collectors.toList()).get(0);
									EMFUtils.SetEFeature(ruleEOBj, refInRuleParent, ruleEObjChild);
									for(EAttribute attr:child.eClass().getEAllAttributes())
									{
										try{
											if((attr.getName().equals("diff_kind_Left") 
													|| attr.getName().equals("diff_kind_Right")) 
													&& child.eGet(attr) != null 
													&& !child.eGet(attr).toString().toLowerCase().equals("non")) {
												EAttribute attrChild = 
														ruleEObjChild.eClass().getEAllAttributes().stream().filter(a->a.getName().equals("diff_kind")).collect(Collectors.toList()).get(0);
												EClassifier diffKindEClassifier = attrChild.getEType();
												EClassifier diffKind2WayEClassifier = 
														diffMM2WayFactory_eIN.getEPackage().getEClassifier(diffKindEClassifier.getName());
												String diffDiffKindValue = child.eGet(attr).toString();
												Object ruleDiffKindValue = 
														diffMM2WayFactory_eIN.createFromString((EDataType)diffKind2WayEClassifier, diffDiffKindValue);
												ruleEObjChild.eSet(attrChild,ruleDiffKindValue);
											}else if(!attr.getName().contains("diff_kind") 
													&& !attr.getName().contains("changeStatus")) {
												EAttribute attrChild=ruleEObjChild.eClass().getEAllAttributes().stream().filter(
														a->a.getName().equals(attr.getName())).collect(
																Collectors.toList()).get(0);
												EMFUtils.SetEFeature(ruleEObjChild, attrChild, child.eGet(attr));
											}											
										}catch(Exception ex) {
											System.out.println(ex.getLocalizedMessage());
										}	
									}
									srt.add(new SrcRefTrgt(child,refInRuleParent,ruleEObjChild));
						  		}
					  		}
						  }catch(Exception ex) {
							  System.out.println(ex.getLocalizedMessage());
							  System.out.println(diffEObj);
						  }					
						}
					}					
				}			
				
				
				EObject ruleObject = resourceRule.getContents().get(0);
				EObject ruleRoot = EMFUtils.getERefTargetByERefName(ruleObject,"pattern").get(0);				
				EReference refTypeDSD = EMFUtils.getEReferenceByNameNullDefault(ruleRoot,"domainspecificdiffs");
				
				String   	dsdClassName 			= "Pattern_DomainSpecificDiff";						
				EClass dsdClassEClass	= 
						(EClass)ruleMM2WayFactory_eIN.getEPackage().getEClassifier(dsdClassName);
				EObject	dsdEObject = ruleMM2WayFactory_eIN.create(dsdClassEClass);	
				EAttribute	dsdAttrName = EMFUtils.getEAttributeByName(dsdEObject, "name");
				EMFUtils.SetEFeature(dsdEObject, dsdAttrName,ruleName);				
				EMFUtils.SetEFeature(ruleRoot, refTypeDSD,dsdEObject);
							
				Set<EObject>   visited = new HashSet<EObject>(); 
				Queue<EObject> q = new LinkedList<EObject>();
				q.add(ruleRoot);
				
				int i = 0;
				while(!q.isEmpty()) {
					EObject ruleEOBj= q.remove();
					visited.add(ruleEOBj);
					
					String refSecondSection = "";
					String dsdRefName = "";
					EReference refTypedsdRef = null;
					if(ruleEOBj.eClass().getEAllSuperTypes().size()>0)
						refSecondSection = ruleEOBj.eClass().getEAllSuperTypes().get(0).getName();
					
					if(refSecondSection.length()>0) {
						dsdRefName += "DomainSpecificDiff_"+refSecondSection;
						refTypedsdRef = EMFUtils.getEReferenceByNameNullDefault(dsdEObject,dsdRefName);
						if(ruleEOBj.eClass().getEAllSuperTypes().get(0).getEAllSuperTypes().size()>0) {
							refSecondSection = ruleEOBj.eClass().getEAllSuperTypes().get(0).getEAllSuperTypes().get(0).getName();
							dsdRefName += "DomainSpecificDiff_"+refSecondSection;
							refTypedsdRef = EMFUtils.getEReferenceByNameNullDefault(dsdEObject,dsdRefName);
						}
					}	
					if(refTypedsdRef != null) {
						if(refTypedsdRef.getUpperBound()==1) {
							EObject objT = (EObject) dsdEObject.eGet(refTypedsdRef);
							if(objT != null && !objT.equals(ruleEOBj))
								EMFUtils.SetEFeature(dsdEObject, refTypedsdRef,ruleEOBj);
						}else if(refTypedsdRef.getUpperBound()>1 || refTypedsdRef.getUpperBound()==-1) {
							EList<EObject> objT = (EList<EObject>) dsdEObject.eGet(refTypedsdRef);
							if(objT != null && (objT.size() == 0 || objT.size()>0 && !objT.contains(ruleEOBj)))
								EMFUtils.SetEFeature(dsdEObject, refTypedsdRef,ruleEOBj);
						}						
					}
					try {
						EAttribute attrIDPattern = 
								ruleEOBj.eClass().getEAllAttributes().stream().filter(
										f->f.getName().equals("ID_Pattern")).collect(Collectors.toList()).get(0);
						if(attrIDPattern!=null ) {
							ruleEOBj.eSet(attrIDPattern, i);
							i++;
						}
					}catch(Exception ex) {
						System.out.println("Cannot set ID_Pattern: "+ex.getLocalizedMessage());
					}
					
					var features = 
							new ArrayList<EStructuralFeature>(ruleEOBj.eClass().getEAllStructuralFeatures());
					for (EStructuralFeature r : features) {
						if(r instanceof  EReference){			
						  try{
							  EList<EObject>  children = new BasicEList<EObject>();
							  	
							  	if(r.getUpperBound()==1)
							  		children.add((EObject) ruleEOBj.eGet(r));
							  	else
							  		children = (EList<EObject>) ruleEOBj.eGet(r);
							  
							  
							  	//EList<EObject>  children = (EList<EObject>) ruleEOBj.eGet(r);					  			
					  		  	if(children != null && children.size()>0){
							  		for (EObject child:children){
							  			if(!visited.contains(child))
							  				q.add(child);	
							  		}
					  		  	}
						  }catch(Exception ex) {
							  System.out.println("set ID_Pattern: "+ex.getLocalizedMessage());
						  }
						}
					}	
					
				}				
				resourceRule.save(null);			    
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
		}		
	}


	//Remove associations from domainSpecificDiff (SemanticDiff) object to the (diff) objects their filter set to true
	public void RemoveFilteredReferencesFromDSDObjet() {
		dsDiffRulePath			=	dsDiffRuleFolder + dsDiffRuleFileName;
		if(dsDiffRulePath!=""){
			try {				
				ResourceSet resourceSet			= EMFUtils.getResourceSetXMI(dsDiffRulePath,ruleMM2Way_eNSURI,ruleMM2Way_eIN);
				Resource 	resourceRule 		= EMFUtils.getResource(dsDiffRulePath, resourceSet);
				EObject 	ruleObject 			= (EObject)resourceRule.getContents().get(0);	
				ArrayList<EObject> rootEObject	= EMFUtils.getERefTargetByERefName(ruleObject,"pattern");
				ArrayList<EObject> dsdEObjects	= EMFUtils.getERefTargetByERefName(rootEObject.get(0),"domainspecificdiffs");
				for(EObject dsdEObject:dsdEObjects) { //Normally it is only one instance
					var features = new ArrayList<EStructuralFeature>(dsdEObject.eClass().getEAllStructuralFeatures());
					for (EStructuralFeature r : features) {
						if(r instanceof  EReference){			
						  try{
							  	EList<EObject>  children = (EList<EObject>) dsdEObject.eGet(r);	
							  	ArrayList<EObject>  removeList = new ArrayList<EObject>();
					  		  	if(children != null && children.size()>0){
							  		for (EObject child:children){
							  			Object filter = EMFUtils.getAttrValueByAttrNameNullDefault(child,"filter");
							  			if(filter!=null && ((Boolean)filter)==true) {
							  				removeList.add(child);
							  			}
							  		}
					  		  	}
				  				//remove the association (reference) list
					  		  	for (EObject childR:removeList){
					  		  		EcoreUtil.remove(dsdEObject, r, childR);
					  		  	}					  		  	
						  }catch(Exception ex) {
							  System.out.println("Remove Filtered References From DSDObjet: "+ex.getLocalizedMessage());
						  }
						}
					}
				}				

				resourceRule.save(null);	
		    
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}	
		}
	}
}




















/*try {
	out = new PrintWriter(dsDiffRulePath);
} catch (FileNotFoundException e) {
	e.printStackTrace();
}*/

/*				
Charset charset = StandardCharsets.UTF_8;
String contentDsDiffModel = new String(Files.readAllBytes(dsDiffModelFile.toPath()), charset);
String content = new String(contentDsDiffModel);
content = content.replaceAll("DiffMM", "2WayRuleMM");
content = content.replaceAll("diff_kind_Left", "diff_kind");
content = content.replaceAll("diff_kind_Right", "diff_kind");
content = content.replaceAll("2WayRuleMM:", "2WayRuleMM:Pattern_");
File dsDiffRuleFile=new File(dsDiffRulePath);
Files.write(dsDiffRuleFile.toPath(), content.getBytes(charset));
*/	

