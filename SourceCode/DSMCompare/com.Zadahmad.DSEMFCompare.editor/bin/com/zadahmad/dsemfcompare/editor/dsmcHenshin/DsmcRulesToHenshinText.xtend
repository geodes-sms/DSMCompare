package com.zadahmad.dsemfcompare.editor.dsmcHenshin

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.common.util.EList;
import java.io.PrintWriter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.regex.*;
import com.zadahmad.dsemfcompare.editor.tests.DsmComparatorController.*;
import com.zadahmad.dsemfcompare.editor.client.DsmComparatorController

class DsmcRulesToHenshinText {	 
	 ArrayList<EObject> 		allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
	 ArrayList<EReferenceType> 	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
	 ArrayList<ConstraintType> 	constraintCollection    		= 	new ArrayList<ConstraintType>();
	 String						ruleSignature					=   "";
	 String						constraintDefination    		= 	"";
	 EObject					ruleNode						= 	null;		
	 EObject					patternRootNode					= 	null;	
	 String						unitSequntialStar    			= 	"";	
	 
	 
	 public  String				dsmName					    	=	"";
	 public  String 			ruleMM_eNSURI 					= 	"";  	
 	 public  Object 			ruleMM_eIN	 					=	null;
	 public  String				dsmCasePath					    =	"";
	 public  String				dsmCaseRulesFolderName			=	"";
	 public  String				dsmCaseHenshinRulesFolderName	=	"";
	 public  ArrayList<String>	dsmCaseRuleFileNames			=	new ArrayList<String>();
	 public  ArrayList<String>	dsmCaseRuleFilePaths			=	new ArrayList<String>();
	 public  String   			henshinRulesDSDiffPath			= 	"";
	 public  String   			henshinRulesCpaPath				= 	"";
	 public  ArrayList<RuleAttributes> rulesFilter				=   new ArrayList<RuleAttributes>();
	         int				ruleFilterNumber				=    	0;
	         int				ruleElementNumber				=    	0;
	         int 				i								=		0;
     public  ArrayList<String>  edges							=   new ArrayList<String>();
	 
 
	 def public void run(){
	 	henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";	  	
	  	henshinRulesCpaPath		=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
	 	setRulesFilter();
	 	setRulesFilePaths();
	 	generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	    generateCPA(dsmCaseRuleFilePaths,henshinRulesCpaPath)
	 }
	 
	 def public void run(boolean isATempFile){
	 	henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";	  	
	  	henshinRulesCpaPath		=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
	 	if(isATempFile){
	 		henshinRulesDSDiffPath +="TEMP";
	 		henshinRulesCpaPath +="TEMP";
	 	}
	 	setRulesFilter();
	 	setRulesFilePaths();
	 	generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	    generateCPA(dsmCaseRuleFilePaths,henshinRulesCpaPath)
	 }
	 
	/*	  
	 def static void main(String[] args) {
	  	//var ruleFileVPaths=new ArrayList<String>();
	  	setRulesFilePaths(dsmCaseRuleFilePaths);//com.zadahmad.dsemfcompare.editor.dsmcHenshin.DsmcRulesToHenshinText.
	  	henshinRulesDSDiffPath=dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";	  	
	  	henshinRulesCpaPath=dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
	  	if(args!=null && args.size()>=2){
	  		dsmName		 					= args.get(0);	
	  		dsmCasePath 					= args.get(1);	
	  		dsmCaseRulesFolderName			= args.get(2);	
	  		dsmCaseHenshinRulesFolderName	= args.get(3);
	  		//setRulesFilePaths(args.get(4).split("|"));
	  		henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";	  	
	  		henshinRulesCpaPath		=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
	  	}
	    new DsmcRulesToHenshinText().generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	    new DsmcRulesToHenshinText().generateCPA(dsmCaseRuleFilePaths,henshinRulesCpaPath)
	  } */ 
	 
	 //***********************************************   
	 def private setRulesFilePaths(){
		for(String ruleFileName:dsmCaseRuleFileNames){
			dsmCaseRuleFilePaths.add(dsmCasePath + dsmCaseRulesFolderName + ruleFileName);
		}	  	
	  }
	  
	 //***********************************************   
	 def public setRulesFilter(){
		for(String ruleFileName:dsmCaseRuleFileNames){
			rulesFilter.add(new RuleAttributes(ruleFileName.substring(0,ruleFileName.length-4), -1,-1));
		}	  		 	
	 }
	 //***********************************************   
	 def generateCPA(ArrayList<String> ruleFilePathes, String henshin_textFilePath){	    
	    if(ruleFilePathes!=null && ruleFilePathes.size() > 0){
	    	doEMFSetup
		    // initialize output writer
		    var PrintWriter out = new PrintWriter(henshin_textFilePath); 
		    try{
			    val resourceSetPackage = new ResourceSetImpl
				val resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true)
				out.print(generatePackageImport(resourcePackage.contents.get(0) as EObject));
				
			    for (rulePath : ruleFilePathes) {
				    // generate Rule
				    val resourceSet = new ResourceSetImpl
				    val resource = resourceSet.getResource(URI.createURI(rulePath), true)
				    for (content : resource.contents) {
						out.print(generateRule(content as EObject, "CPA"));
				    }
				    
				    allDsDiffRuleNodes.clear();
				    allDsDiffRuleAssocCollection.clear();
			    }
			    out.close; 		    
	    	}catch(Exception ex){
	    		System.out.println(ex.message);
	    		out.close; 
	    	}		    
	    } 
	  }
	  
	 def generateDSDiff(ArrayList<String> ruleFilePathes, String henshin_textFilePath){	    
	 	
	    if(ruleFilePathes!=null && ruleFilePathes.size() > 0){
	    	doEMFSetup	   		 	
	    	
		    // initialize output writer
		    var PrintWriter out = new PrintWriter(henshin_textFilePath); 
		    try{
			    val resourceSetPackage = new ResourceSetImpl
				val resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true)
				out.print(generatePackageImport(resourcePackage.contents.get(0) as EObject));
				
				unitSequntialStar = "\n\tunit unitSequntialStar(){";				
				
				i=-1;
			    for (rulePath : ruleFilePathes) {			    	
	 				ruleFilterNumber  = 0;
	 				ruleElementNumber = 0;
				    // generate Rule
				    val resourceSet = new ResourceSetImpl
				    val resource = resourceSet.getResource(URI.createURI(rulePath), true)
				    for (content : resource.contents) {
						out.print(generateRule(content as EObject , "DSDiff"));
				    }
				    i++;
				    rulesFilter.get(i)._filtersCount 	= ruleFilterNumber;
				    rulesFilter.get(i)._elementsCount 	= ruleElementNumber;
				    allDsDiffRuleNodes.clear();
				    allDsDiffRuleAssocCollection.clear();
			    }
			    unitSequntialStar += "\n\t}";
			    out.print(unitSequntialStar);
			    out.close; 		    
	    	}catch(Exception ex){
	    		System.out.print(ex.message); 
	    		out.close; 
	    	}		    
	    } 
	  }
	  
	 def doEMFSetup() {
		EPackage$Registry.INSTANCE.put(ruleMM_eNSURI, ruleMM_eIN)
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	  }
	 
	 //***********************************************    
	 def dispatch generatePackageImport(EObject it) '''
ePackageImport  «eClass().getEPackage().getName().replace("Rule","Diff")»
	  '''
	  
	  // «init(it)»
	
	 def dispatch generateRule(EObject it, String henshinFileType) '''
		«init(eContents().get(0))»
		«setSchedule(getAttrValueByName(it,"name").toString())»

		rule «getAttrValueByName(it,"name").toString()»(«ruleSignature»)
		{
			graph
			{
			  	«FOR n : allDsDiffRuleNodes»
			  		«IF getSuperClassName(n).toLowerCase() == "domainspecificdiff" 
			  			|| getAttrValueByName(n,"ID_Pattern").toString().contains("-") == true»
							«defineNode(n,"create", henshinFileType)»
			      	«ELSE» 			  			
			      		«IF getAttrValueByName(n,"Filter") == false »
							«defineNode(n, "preserve", henshinFileType)»
			      		«ELSE»
							«defineNode(n,"delete", henshinFileType)»
			      		«ENDIF»
			      	«ENDIF»	
			  	«ENDFOR»
			«defineEdges()»
			«IF edges.size() > 0»
			edges[
			  		«FOR edg : edges»
			  			«edg»
			  		«ENDFOR»
	      		 ]
			«ENDIF»		      		
			}
			«constraintDefination»
		}
//----------------------------------------------------------------------
	  '''
	 
	 //***********************************************   
	 def void init(EObject root){
 			allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
		  	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
		  	constraintCollection    		= 	new ArrayList<ConstraintType>();
		  	ruleSignature					=   "";
		  	constraintDefination    		= 	"";
		  	ruleNode						= 	null;	
	 		patternRootNode					=	root;
	 		ruleNode						=	patternRootNode.eContainer();
	  		allDsDiffRuleNodes				=	DsmComparatorController.getAllNodes(patternRootNode, true, false);
		  	//allDsDiffRuleNodes.remove(patternRootNode);
		  	defineConstraints();
	  }
	 
	 def void setSchedule(String ruleName){
		    unitSequntialStar +="\n\t\twhile{\n\t\t\t";
		    unitSequntialStar +=ruleName+"()"
		    unitSequntialStar +="\n\t\t}";
	 }
	 //***********************************************   
	 def String defineNode(EObject n, String actionText, String henshinFileType)
	 {
	 	var nodeDef="\t\t\t\t "+actionText;
	 	if(actionText == "preserve")
	 		nodeDef+= "\t\t\t"
	 	else
	 		nodeDef+= "\t\t\t\t"
	 		
	 	if(actionText == "delete")
			ruleFilterNumber+=1;
			
		if(actionText != "create")
			ruleElementNumber+=1;	 
	 	
	 	nodeDef += createNode(n)+":"+getSuperClassName(n);
	 	var ctNodes= new ArrayList<ConstraintType>();
	 	for(ConstraintType ct:constraintCollection)
	 	{
	 		if(ct.nodeLhs == n || ct.nodeRhs == n)
	 		{
	 			ctNodes.add(ct);
	 		}
	 	}
	 	
	 	var operationAttrDef= "";
	 	if(henshinFileType=="DSDiff"){
	 		operationAttrDef = getStringAttrDef(n,"operation");
	 	}	
	 	
	 	var domainspecificdiffNameAttrDef= "";	 	
	 	if(getSuperClassName(n).toLowerCase() == "domainspecificdiff"){
	 		domainspecificdiffNameAttrDef = getStringAttrDef(n,"name");
	 	}	 	
	 	
	 	if(ctNodes.size() > 0 || operationAttrDef != "" || domainspecificdiffNameAttrDef != ""){
	 		nodeDef += "{";
	 		
	 		if(domainspecificdiffNameAttrDef!=""){
	 			nodeDef += "\n\t\t\t\t\t" + actionText + " " + domainspecificdiffNameAttrDef;
	 		}
	 		
	 		if(operationAttrDef!=""){
	 			nodeDef += "\n\t\t\t\t\t" + actionText + " " + operationAttrDef;
	 		}
	 		
		 	for(ConstraintType ct:ctNodes)
		 	{
		 		if(ct.nodeLhs == n && !nodeDef.contains(ct.attrLhs+ " =  "+ct.varInLhs))
		 		{
		 			nodeDef += "\n\t\t\t\t\t" + actionText + " "+ct.attrLhs+ " =  "+ct.varInLhs;
		 		}
		 		if(ct.nodeRhs == n && !nodeDef.contains(ct.attrRhs+ " =  "+ct.varInRhs)){
		 			nodeDef += "\n\t\t\t\t\t" + actionText + " "+ct.attrRhs+ " =  "+ct.varInRhs;
	 			}
		 	}
		 	nodeDef +="\n" + "\t\t\t\t}";	 	
	 	}
	 	
	 	return nodeDef;
	 } 
	 
	 def String getStringAttrDef(EObject n, String attrName)
	 {
	 	var attr= DsmComparatorController.getEAttributeByName(n,attrName);
	 	if(attr==null){
	 		return "";
	 	}	 		
	 	else{
	 		if(attr.getEAttributeType().eClass().getName().toLowerCase()=="eenum"){
	 			//return attrName + " = " + "\"" + attr.getEAttributeType().getName() + "." + n.eGet(attr).toString()+ "\"";
				return attrName + " = " + "\"" + n.eGet(attr).toString()+ "\"";	 	 			
	 		}
	 		else{
	 			return attrName + " = " + "\"\\\"" + n.eGet(attr).toString()+ "\\\"\"";
	 		}
	 	}
	 }
	 
	 def void defineEdges(){
	  	edges= new ArrayList<String>();
	  	for(EReferenceType ERefC: getAllAssocCollection()){
	  		if(ERefC.source.eClass().getName().toLowerCase().contains("domainspecificdiff")  
	  			||	ERefC.target.eClass().getName().toLowerCase().contains("domainspecificdiff")
	  			||  (getAttrValueByName(ERefC.source,"ID_Pattern").toString().contains("-") == true)
	  			||  (getAttrValueByName(ERefC.target,"ID_Pattern").toString().contains("-") == true))
	  		{
	  			var AssocDef= 	
	  						"("+
	  						"create\t\t" + 
	  						createNodeNumber(ERefC.source)+
	  						"->" + 
	  						createNodeNumber(ERefC.target)+
	  						":"+
	  						ERefC.eReference.getName()+
	  						"),";
				edges.add(AssocDef);
	  		}
	  		else if(getAttrValueByName(ERefC.source,"Filter") == true || getAttrValueByName(ERefC.target,"Filter") == true)
	  		{
	  			var AssocDef= 	
	  						"("+
	  						"delete\t\t" + 
	  						createNodeNumber(ERefC.source)+
	  						"->" + 
	  						createNodeNumber(ERefC.target)+
	  						":"+
	  						ERefC.eReference.getName()+
	  						"),";
				edges.add(AssocDef);
				ruleFilterNumber +=1;		
				ruleElementNumber+=1;			
	  		}
	  		else if(!ERefC.source.eClass().getName().toLowerCase().contains("domainspecificdiff"))
	  		{
	  			var AssocDef= 	
	  						"("+
	  						"preserve\t" + 
	  						createNodeNumber(ERefC.source)+
	  						"->" + 
	  						createNodeNumber(ERefC.target)+
	  						":"+
	  						ERefC.eReference.getName()+
	  						"),";
				edges.add(AssocDef);		
				ruleElementNumber+=1;
	  		}   		
		}
		if(edges.size()>0)	 
		{
	  		var s =edges.get(edges.size()-1);
	  		s= s.substring(0, s.length() - 1);
	  		edges.set(edges.size()-1,s);
		}
	  }
	  
	 def defineConstraints(){
	  	//ArrayList<ConstraintType>
	  	ruleSignature =   "";
	  	constraintDefination = 	"";
	  	if(ruleNode !== null){
		  	constraintCollection = new ArrayList<ConstraintType>();
		  	var consts = Arrays.asList(getAttrValueByName(ruleNode,"Constraints"))
		  				.stream().collect(Collectors.toList()).get(0).toString().trim();
			if(consts == "")
				return "";
			consts=consts.substring(1,consts.length-1);
			var cs=consts.split(Pattern.quote(", Item"));
			for(var i=1;i<cs.size();i++){
				cs.set(i,"Item"+cs.get(i));
			}
		  	for(String constraint: cs){ //	Item(3 , "value")  != Item(3 , "new_value")
		  		var ct= constraintDsDiffToConstraintType(constraint);
		  		if(ct !== null){
		  			constraintCollection.add(ct);
		  		}			  			
		  	}
		  	
		  	if(constraintCollection.size()>0){
		  		constraintDefination = "conditions [";
		  		if(constraintCollection.size()>1){
		  			for(var i=0;i<constraintCollection.size()-1;i++ ){
		  				var ct=constraintCollection.get(i);
		  				constraintDefination+=ct.conditionText+", ";
		  				if(!ruleSignature.contains(ct.ruleInLhs))
		  					ruleSignature+=ct.ruleInLhs+", ";
		  				if(!ruleSignature.contains(ct.ruleInRhs))
		  					ruleSignature+=ct.ruleInRhs+", ";	
	  							
						ruleElementNumber+=1;
		  			}
		  			var ct=constraintCollection.get(constraintCollection.size()-1);
		  			constraintDefination+=ct.conditionText;
	  				if(!ruleSignature.contains(ct.ruleInLhs))
	  					ruleSignature+=ct.ruleInLhs+", ";
	  				if(ct.ruleInRhs!=null && !ct.ruleInRhs.contains(":") && !ruleSignature.contains(ct.ruleInRhs))
	  					ruleSignature+=ct.ruleInRhs+", ";	
		  		}
		  		else{
		  			var ct=constraintCollection.get(0);
		  			constraintDefination+=ct.conditionText;
	  				if(!ruleSignature.contains(ct.ruleInLhs))
	  					ruleSignature+=ct.ruleInLhs+", ";
	  				if(!ruleSignature.contains(ct.ruleInRhs))
	  					ruleSignature+=ct.ruleInRhs+", ";	
		  		}
		  		ruleSignature=ruleSignature.trim();
		  		ruleSignature=ruleSignature.substring(0,ruleSignature.length-1);
		  		constraintDefination += "]";
		  	}
	  	}	
	  }
	    
	 //***********************************************   
	 def String createNode(EObject n)
	 {
	 	return "node " + createNodeNumber(n);
	 }	 
	 
	 def String createNodeNumber(EObject n)
	 {
	 	return "n" + getAttrValueByName(n,"ID_Pattern").toString().replace("-","").trim();
	 }
	 
	 def String getSuperClassName(EObject n)
	 {
	 	return n.eClass().getESuperTypes().get(0).name;
	 }	 

	 //***********************************************   
	 def ArrayList<EReferenceType> getAllAssocCollection(){
	  	
	  	for(EObject node: allDsDiffRuleNodes){
	  		var nodeAssocCollection = getAllNodeAssocCollection(node);
	  		if(nodeAssocCollection.size()>0){
	  			allDsDiffRuleAssocCollection.addAll(nodeAssocCollection);
	  		}	  		
	  	}
	  	
	  	return allDsDiffRuleAssocCollection;
	  }
	  
	 def ArrayList<EReferenceType> getAllNodeAssocCollection(EObject src)
	  {
	  	var allNodeAssociations = new ArrayList<EReferenceType>();
	  	
	  	for (EReference r:src.eClass().getEAllReferences()){
	  		try{
	  			var AllTargets= DsmComparatorController.getAllTargets(src,r);
		  		if(AllTargets !== null && AllTargets.size()>0){
			  		for (EObject tgt:AllTargets){
			  			var newERef= new EReferenceType();
			  			newERef.source=src;
			  			newERef.target=tgt;
			  			newERef.eReference=r;
			  			allNodeAssociations.add(newERef);
			  		}
		  		}
	  		}catch(Exception ex){
	  			
	  		}

	  	}
	  	return allNodeAssociations;
	  }

	 def Object getAttrValueByName(EObject obj, String AttrName){
	 	try{
	 		return  obj.eGet(DsmComparatorController.getEAttributeByName(obj,AttrName));
	 	}
	 	catch(Exception ex){
	 		return false;
	 	}
	 }	 	 
	 
	 //***********************************************   
	 def ConstraintType constraintDsDiffToConstraintType(String constraintDsDiff){
	  	try{
		  	var cons= constraintDsDiff;// constraintDsDiff.substring(1, constraintDsDiff.length-1);
		  	var lor=cons.split("[[<>!=]=]"); //[[<>!][=]?=]  !== 	
		  	var lhs	=	lor.get(0).trim();  	
		  	var rhs	=	lor.get(lor.size()-1).trim();
		  		  	
			var operation="";
			var mr=DsmComparatorController.allMatches(Pattern.compile("[[<>!=]=]"), cons);
		  	for (MatchResult match :mr ) {
	  			operation+=match.group();	  
			}
				
			var ct= new ConstraintType();
			ct.lhs=lhs;			
			ct.rhs=rhs;	
			ct.operation=operation;
			ct.id_PatternLhs=lhs.substring(lhs.indexOf("(")+1,lhs.indexOf(",")).trim();
			ct.nodeLhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ct.id_PatternLhs);
			ct.attrLhs=lhs.substring(lhs.indexOf("\"")+1,lhs.indexOf("\"", lhs.indexOf("\"") + 1)).trim();				
			ct.varInLhs="n"+ct.id_PatternLhs+ct.attrLhs;
			ct.attrTypeLhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeLhs,ct.attrLhs);
			if(rhs.indexOf("Item")!=-1)
			{
				ct.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
				ct.id_PatternRhs=rhs.substring(rhs.indexOf("(")+1,rhs.indexOf(",")).trim();				
				ct.nodeRhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ct.id_PatternRhs);
				ct.attrRhs=rhs.substring(rhs.indexOf("\"")+1,rhs.indexOf("\"", rhs.indexOf("\"") + 1)).trim();
				ct.varInRhs="n"+ct.id_PatternRhs+ct.attrRhs;
				ct.attrTypeRhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeRhs,ct.attrRhs);
				
				ct.ruleInRhs="VAR "+ct.varInRhs+":"+ct.attrTypeRhs;
				
			}else{
				ct.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
				ct.id_PatternRhs="-1";
				ct.nodeRhs=null;
				ct.attrRhs="";
				ct.varInRhs= "";  // "var"+ct.varInLhs;
				ct.attrTypeRhs="";
				
				ct.operation = constraintDsDiff.substring(constraintDsDiff.indexOf(")")+1, constraintDsDiff.length);
			}
			
			ct.ruleInLhs="VAR "+ct.varInLhs+":"+ct.attrTypeLhs;
			
			ct.conditionName="condition"+ct.varInLhs+ct.varInRhs;
			ct.conditionText=ct.varInLhs+" "+ct.operation+" "+ct.varInRhs;
	  		  	
	  		return ct;
	  	}
	  	catch(Exception ex){
	  		return null;
	  	}
	  }	    

}
