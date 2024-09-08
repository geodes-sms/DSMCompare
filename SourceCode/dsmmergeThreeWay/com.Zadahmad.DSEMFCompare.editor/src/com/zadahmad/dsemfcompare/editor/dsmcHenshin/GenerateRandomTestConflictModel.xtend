package com.zadahmad.dsemfcompare.editor.dsmcHenshin

import com.zadahmad.dsmcompare.core.DsmComparatorController
import java.util.ArrayList
import java.util.Arrays
import java.util.regex.MatchResult
import java.util.regex.Pattern
import java.util.stream.Collectors
import org.eclipse.emf.common.util.URI
import java.io.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.PrintWriter

class GenerateRandomTestConflictModel{	 
	 ArrayList<EObject> 		allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
	 ArrayList<EReferenceType> 	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
	 ArrayList<ConstraintType> 	leftConstraintCollection    	= 	new ArrayList<ConstraintType>();
	 ArrayList<ConstraintType> 	rightConstraintCollection    	= 	new ArrayList<ConstraintType>();
	 String						ruleSignature					=   "";
	 String						totalConstraintDefinition    		= 	"";
	 ArrayList<String> 			leftAuthorConstraintCollection  = 	new ArrayList<String>();
	 ArrayList<String> 			rightAuthorConstraintCollection = 	new ArrayList<String>();
	 EObject					ruleNode						= 	null;		
	 EObject					patternRootNode					= 	null;	
	 String						rulesDefinitionsAndCallsInSequntialStarUnit    			= 	"";		 			
	 String						callsStarUnits   				= 	"";		 			
	 String						DefinitionsStarUnits 			= 	"";	
	 ArrayList<String>			signatureParameters				= 	new ArrayList<String>();	 
	 
	 public  String				dsmName					    	=	"";
	 public  String 			ruleMM_eNSURI 					= 	"";  	
 	 public  Object 			ruleMM_eIN	 					=	null;
	 public  String				dsmCasePath					    =	"";
	 public  String				dsmCaseRulesFolderName			=	"";
	 public  String				dsmCaseHenshinRulesFolderName	=	"";
	 public  ArrayList<String>	dsmCaseRuleFileNames			=	new ArrayList<String>();
	 public  ArrayList<String>	dsmCaseRuleFilePaths			=	new ArrayList<String>();
	 public  String   			henshinRulesDSDiffPath			= 	"";
	 public  String				henshinRulesDSDiffPostRulePath 	=	"";
	 public  String   			henshinRulesCpaPath				= 	"";
	 public  ArrayList<RuleAttributes> rulesFilter				=   new ArrayList<RuleAttributes>();
	         int				ruleFilterNumber				=    	0;
	         int				ruleElementNumber				=    	0;
	         int 				i								=		0;
     public  ArrayList<String>  edges							=   new ArrayList<String>();
     		 int 				varPostCount					= 	0;  
     
     
    //**************************************
    
    def void setVarPostCountToZero(){
    	varPostCount = 0;
    }
	
	 def Object getAttrValueByName(EObject obj, String AttrName){
	 	try{
	 		return  obj.eGet(DsmComparatorController.getEAttributeByName(obj,AttrName));
	 	}
	 	catch(Exception ex){
	 		return false;
	 	}
	 }	 	 
	 
	 def String getSuperClassName(EObject n)
	 {
	 	return n.eClass().getESuperTypes().get(0).name;
	 }	 	 
		
	def public void run(){
	 	henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "ConflictInjecterRules.henshin_text";
	 	setRulesFilter();
	 	setRulesFilePaths();
	 	generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	}
	 
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
	 
	 def ConstraintType cloneConstraintType(ConstraintType ctLeft, String varLR, String rVal){
	 	var ctRight = new ConstraintType();	
		ctRight.lhs = ctLeft.lhs;
		ctRight.rhs = ctLeft.rhs;
		ctRight.operation = ctLeft.operation;
		ctRight.id_PatternLhs = ctLeft.id_PatternLhs;
		ctRight.nodeLhs = ctLeft.nodeLhs;
		ctRight.attrLhs = ctLeft.attrLhs;
		ctRight.varInLhs = "n"+ctRight.id_PatternLhs+ctRight.attrLhs+varLR;//"_Right";
		ctRight.attrTypeLhs = ctLeft.attrTypeLhs;
		ctRight.constraintCompareType = ctLeft.constraintCompareType;
		ctRight.id_PatternRhs=ctLeft.id_PatternRhs;
		ctRight.nodeRhs=ctLeft.nodeRhs;
		ctRight.attrRhs=ctLeft.attrRhs;
		ctRight.varInRhs= ctLeft.varInRhs;
		ctRight.attrTypeRhs=ctLeft.attrTypeRhs;
		ctRight.ruleInLhs="VAR "+ctRight.varInLhs+":"+ctRight.attrTypeLhs; 
		ctRight.conditionName="condition"+ctRight.varInLhs+ctRight.varInRhs;
		ctRight.conditionText="("+ctRight.varInLhs+" "+ctRight.operation+" "+rVal+ ")";//  "\"\\\"" + n.eGet(attr).toString()+ "\\\"\")";
		return ctRight;
	 }

	 def void setSignatureItems(String henshinFileType)
	 {
	 	ruleSignature	=   "";
	 	for(EObject n : allDsDiffRuleNodes)
	 	{	
	 		var action	=	"preserve";	 		 	
	 		if(getAttrValueByName(n,"isForbidden") == true)
	 			{	action="forbid";	}	 		
	 		else if(getSuperClassName(n).toLowerCase() == "domainspecificdiff" 
	 			|| getAttrValueByName(n,"ID_Pattern").toString().contains("-") == true)
	 			{	action="create";	}		 		
	 		else if(getAttrValueByName(n,"Filter") == true)
	 			{	action="delete";	}	
	 			
	 		var diffKindVal = "";
	 		var diffKindLeftDef= "";
	 		var diffKindRightDef= "";
	 		if(henshinFileType=="DSDiff")
	 		{	 
	 			var attrName = "diff_kind";	 				
	 			var attr= DsmComparatorController.getEAttributeByName(n,attrName);
		 		if(attr!=null && attr.getEAttributeType().eClass().getName().toLowerCase()=="eenum"){			
					var rVal = "\"\\\"" + n.eGet(attr).toString()+ "\\\"\"";	
					var ctLeft= new ConstraintType();			  					
					ctLeft.lhs= "";//lhs; We don't need it beacuse it is not a constraint defined by user		
					ctLeft.rhs= "";//rhs;	
					ctLeft.operation= "==";
					ctLeft.id_PatternLhs=getAttrValueByName(n,"ID_Pattern").toString();
					ctLeft.nodeLhs= DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ctLeft.id_PatternLhs);
					ctLeft.attrLhs=attrName;//lhs.substring(lhs.indexOf("\"")+1,lhs.indexOf("\"", lhs.indexOf("\"") + 1)).trim();				
					ctLeft.varInLhs="n"+ctLeft.id_PatternLhs+ctLeft.attrLhs+"_Left";
					ctLeft.attrTypeLhs= "EString";// DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeLhs,ct.attrLhs);
					ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
					ctLeft.id_PatternRhs="-1";
					ctLeft.nodeRhs=null;
					ctLeft.attrRhs="";
					ctLeft.varInRhs= "";  
					ctLeft.attrTypeRhs="";
					ctLeft.ruleInLhs="VAR "+ctLeft.varInLhs+":"+ctLeft.attrTypeLhs;       //"\"\\\"" + n.eGet(attr).toString()+ "\\\"\"";
					ctLeft.conditionName="condition"+ctLeft.varInLhs+ctLeft.varInRhs;				
					ctLeft.conditionText="("+ctLeft.varInLhs+" "+ctLeft.operation+" "+ rVal+ ")";//   +ct.varInRhs;	
					var ctRight = cloneConstraintType(ctLeft, "_Right", rVal);
					
					leftAuthorConstraintCollection.add(ctLeft.conditionText);
					rightAuthorConstraintCollection.add(ctRight.conditionText);	
					addParamToRuleSignature(ctLeft.ruleInLhs);
					addParamToRuleSignature(ctLeft.ruleInRhs);
					addParamToRuleSignature(ctRight.ruleInLhs);
					addParamToRuleSignature(ctRight.ruleInRhs);		
		 		}			
	 		}
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
				
				rulesDefinitionsAndCallsInSequntialStarUnit = "\n\t"+"unit unitSequntialStar(){";				
				
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
			    rulesDefinitionsAndCallsInSequntialStarUnit += callsStarUnits;
			    rulesDefinitionsAndCallsInSequntialStarUnit += "\n\t}";
			    rulesDefinitionsAndCallsInSequntialStarUnit += DefinitionsStarUnits;
			    out.print(rulesDefinitionsAndCallsInSequntialStarUnit);
			    out.close; 		    
	    	}catch(Exception ex){
	    		System.out.print(ex.message); 
	    		out.close; 
	    	}		    
	    } 
	  }
	  
	  
	 def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(ruleMM_eNSURI, ruleMM_eIN)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	  }
	 
	 //***********************************************    
	 def dispatch generatePackageImport(EObject it) '''
ePackageImport  «eClass().getEPackage().getName().replace("2WayRule","Diff")»
	  '''
	  
	  // «init(it)»
	  //«defineWileLoopForRule(getAttrValueByName(it,"name").toString())»
	
	 def dispatch generateRule(EObject it, String henshinFileType) '''
		«init(eContents().get(0))»
		«defineStarUnitForRule(getAttrValueByName(it,"name").toString())»
		«callStarUnitForRule(getAttrValueByName(it,"name").toString())»
		«setSignatureItems("DSDiff")»
		«findRuleConstraintsAndRuleSignature()»

		rule «getAttrValueByName(it,"name").toString()»(«ruleSignature»)
		{
			graph
			{
			  	«FOR n : allDsDiffRuleNodes»
			  		«IF getAttrValueByName(n,"isForbidden") == true »
							«defineNode(n, "forbid", henshinFileType)»					
					«ELSEIF getSuperClassName(n).toLowerCase() == "domainspecificdiff" 
			  			|| getAttrValueByName(n,"ID_Pattern").toString().contains("-") == true»
							«defineNode(n,"create", henshinFileType)»
			      	«ELSEIF getAttrValueByName(n,"Filter") == true »
							«defineNode(n, "delete", henshinFileType)»
			      	«ELSE»
							«defineNode(n,"preserve", henshinFileType)»			      		
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
			«defineConstraints()» «cleanUpVariablesForNextRuleLoop()»
		}
//----------------------------------------------------------------------
	  '''

	 //*********************************************** 

	
	 def dispatch generatePostProcessorRule(EObject it) '''
		«init(eContents().get(0))»«getPostRuleNodes()»
		«defineStarUnitForRule(getAttrValueByName(it,"name").toString()+"Post")»
		«callStarUnitForRule(getAttrValueByName(it,"name").toString()+"Post")» «setVarPostCountToZero()»

		rule «getAttrValueByName(it,"name").toString()+"Post"»(VAR nPostchangeStatus:EString, VAR nPostdiff_kind_Left:EString, VAR nPostdiff_kind_Right:EString)
		{
			graph
			{
			  	«FOR n : allDsDiffRuleNodes»
			  		«IF getAttrValueByName(n,"isForbidden") != true && getAttrValueByName(n,"Filter") != true»
							«defineNodePost(n, "preserve")»
			      	«ENDIF»
			  	«ENDFOR»
			«defineEdges()»
			«IF edges.size() > 0»
			edges[
		  		«FOR edg : edges»
		  			«IF !edg.contains("delete")»
					«"\t\t\t\t\t"+edg.replace("create","preserve")»
		      		«ENDIF»			  					  			
		  		«ENDFOR»
	      		 ]
			«ENDIF»		      		
			}
		}
//----------------------------------------------------------------------
	  '''
	 
	 //***********************************************   
	 def void init(EObject root){
 			allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
		  	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
		  	leftConstraintCollection    	= 	new ArrayList<ConstraintType>();
		  	signatureParameters				= 	new ArrayList<String>();
		  	ruleSignature					=   "";
		  	totalConstraintDefinition    	= 	"";
		  	ruleNode						= 	null;	
	 		patternRootNode					=	root;
	 		ruleNode						=	patternRootNode.eContainer();
	  		allDsDiffRuleNodes				=	DsmComparatorController.getAllNodes(patternRootNode, true, false);
		  	//allDsDiffRuleNodes.remove(patternRootNode);
		  	//defineConstraints();
		  	//findRuleConstraintsAndRuleSignature();
	 }
	 
	 def void getPostRuleNodes(){
	 	var sizeNodes = allDsDiffRuleNodes.size();
	 	var i=0;//i=0 is the root node, we will ignore it
	 	var j=0;
	 	var rmv = new ArrayList<EObject>();
	 	for(i=2;i<sizeNodes-1;i++){
	 		var parent 	=	allDsDiffRuleNodes.get(i-1); 
	 		if(!allDsDiffRuleNodes.get(i).eContainer().equals(parent) && !rmv.contains(parent)){
	 				rmv.add(parent);
	 		} 		
	 	}	 	
 		for(r:rmv){
 			allDsDiffRuleNodes.remove(r);
 		}
	 }
	 
	 
	 
	 def void cleanUpVariablesForNextRuleLoop(){
	 	ruleSignature						= "";
	 	totalConstraintDefinition    		= 	"";
 		leftAuthorConstraintCollection.clear();
  		rightAuthorConstraintCollection.clear();
	  	leftConstraintCollection.clear();
	  	rightConstraintCollection.clear();
	 }
	 
	 def String defineWileLoopForRule(String ruleName){
	 		var wileLoopForRule = "while{\n\t\t\t";
		    wileLoopForRule +=ruleName+"()"
		    wileLoopForRule +="\n\t\t}";
	 }
	 
	 def void defineStarUnitForRule(String ruleName){
	 		var starUnitDefinitionForRule = "\n\t"+"unit unit"+ruleName+"Star(){\n\t\t";
		    starUnitDefinitionForRule +=defineWileLoopForRule(ruleName);
		    starUnitDefinitionForRule +="\n\t}";
		    DefinitionsStarUnits += starUnitDefinitionForRule;
	 }
	 
	 def void callStarUnitForRule(String ruleName){
	 		 callsStarUnits+= "\n\t\t"+"unit"+ruleName+"Star()";
	 }
	 
	 //***********************************************   
	 def String defineNodePost(EObject n, String actionText)
	 {	 
	 	var nodeDef="\t\t\t\t "+actionText;
	 	if(actionText == "preserve" || actionText == "forbid")
	 		nodeDef+= "\t\t\t";
	 		
	 	nodeDef += createNode(n)+":"+getSuperClassName(n);
	 	
		var diffKindVal = getStringAttrDef(n,"diff_kind");
		if(varPostCount ==0 && diffKindVal !="" && getAttrValueByName(n,"diff_kind").toString() !="MODIFY")
		{
			varPostCount = 1;
			nodeDef += "{";	
	 		nodeDef += "\n\t\t\t\t\t" + "preserve	changeStatus 	= 	nPostchangeStatus";
	 		nodeDef += "\n\t\t\t\t\t" + "preserve	diff_kind_Left 	= 	nPostdiff_kind_Left";
	 		nodeDef += "\n\t\t\t\t\t" + "preserve	diff_kind_Right	= 	nPostdiff_kind_Right";
	 		nodeDef +="\n" + "\t\t\t\t}";	
	 	}	
	 	
	 	var domainspecificdiffNameAttrDef= "";	 	
	 	if(getSuperClassName(n).toLowerCase() == "domainspecificdiff"){
	 		domainspecificdiffNameAttrDef = getStringAttrDef(n,"name");
	 		nodeDef += "{";
 			nodeDef += "\n\t\t\t\t\t" + "preserve	"	+ domainspecificdiffNameAttrDef;
	 		nodeDef += "\n\t\t\t\t\t" + "create		author		=  \"(nPostchangeStatus.toString().replace('EQUIVALENT','EQUAL') + nPostdiff_kind_Right.toString().replaceAll('ADD|DELETE|MODIFY','RIGHT') +  nPostdiff_kind_Left.toString().replaceAll('ADD|DELETE|MODIFY','LEFT')).replaceAll('NON','').replaceAll('EQUALRIGHTLEFT|RIGHTLEFT','EQUAL');\"";
	 		nodeDef +="\n" + "\t\t\t\t}";	
	 	} 		
	 	return nodeDef;	 	
	 }
	 
	 //***********************************************   
	 def String defineNode(EObject n, String actionText, String henshinFileType)
	 {
	 	var nodeDef="\t\t\t\t "+actionText;
	 	if(actionText == "preserve" || actionText == "forbid")
	 		nodeDef+= "\t\t\t"
	 	else
	 		nodeDef+= "\t\t\t\t"
	 		
	 	if(actionText == "delete")
			ruleFilterNumber+=1;
			
		if(actionText != "create")
			ruleElementNumber+=1;	 
	 	
	 	nodeDef += createNode(n)+":"+getSuperClassName(n);
	 	var ctNodes= new ArrayList<ConstraintType>();
	 	for(ConstraintType ct:leftConstraintCollection)
	 	{
	 		if(ct.nodeLhs == n || ct.nodeRhs == n)
	 		{
	 			ctNodes.add(ct);
	 		}
	 	}
	 	
	 	for(ConstraintType ct:rightConstraintCollection)
	 	{
	 		if(ct.nodeLhs == n || ct.nodeRhs == n)
	 		{
	 			ctNodes.add(ct);
	 		}
	 	}	 	
	 	
	 	var diffKindVal = "";
	 	var diffKindLeftDef= "";
	 	var diffKindRightDef= "";
	 	if(henshinFileType=="DSDiff"){
	 		diffKindVal = getStringAttrDef(n,"diff_kind");
	 		if(!diffKindVal.contains("NON")){
	 			diffKindLeftDef  = diffKindVal.replace("diff_kind","diff_kind_Left");	 
	 			diffKindRightDef  = diffKindVal.replace("diff_kind","diff_kind_Right");	
	 		}		
	 	}	
	 	
	 	var domainspecificdiffNameAttrDef= "";	 	
	 	if(getSuperClassName(n).toLowerCase() == "domainspecificdiff"){
	 		domainspecificdiffNameAttrDef = getStringAttrDef(n,"name");
	 	}	 	
	 	
	 	if(ctNodes.size() > 0 || diffKindLeftDef != "" || 
	 		diffKindRightDef !="" || domainspecificdiffNameAttrDef != "")
	 		{//|| attributeNameAttrDef !=""
	 		nodeDef += "{";
	 		
	 		if(domainspecificdiffNameAttrDef!=""){
	 			nodeDef += "\n\t\t\t\t\t" + actionText + " " + domainspecificdiffNameAttrDef;
	 		}
	 		
	 		//if(attributeNameAttrDef!=""){
	 		//	nodeDef += "\n\t\t\t\t\t" + actionText + " " + attributeNameAttrDef;
	 		//}
	 		
	 		if(diffKindLeftDef!=""){
	 			nodeDef += "\n\t\t\t\t\t" + actionText + " " + diffKindLeftDef;
	 		}
	 		if(diffKindRightDef!=""){
	 			nodeDef += "\n\t\t\t\t\t" + actionText + " " + diffKindRightDef;
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
	 			var id_PatternLhs=getAttrValueByName(n,"ID_Pattern").toString();			
				return  attrName +" = " + "n" + id_PatternLhs + attrName;	 		}
	 		else{
	 			return attrName + " = " + "\"\\\"" + n.eGet(attr).toString()+ "\\\"\"";
	 		}
	 	}
	 }
	 
	 
	 def void defineEdges(){
	  	edges= new ArrayList<String>();
	  	for(EReferenceType ERefC: getAllAssocCollection()){
	  		if(allDsDiffRuleNodes.contains(ERefC.source) && allDsDiffRuleNodes.contains(ERefC.target))
	  		{
		  		if(getAttrValueByName(ERefC.source,"isForbidden") == true || getAttrValueByName(ERefC.target,"isForbidden") == true)
		  		{
		  			var AssocDef= 	
		  						"("+
		  						"forbid\t\t" + 
		  						createNodeNumber(ERefC.source)+
		  						"->" + 
		  						createNodeNumber(ERefC.target)+
		  						":"+
		  						ERefC.eReference.getName()+
		  						"),";
					edges.add(AssocDef);		
		  		}	  		 
		  		else if(ERefC.source.eClass().getName().toLowerCase().contains("domainspecificdiff")  
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
		}
		if(edges.size()>0)	 
		{
	  		var s =edges.get(edges.size()-1);
	  		s= s.substring(0, s.length() - 1);
	  		edges.set(edges.size()-1,s);
		}
	  }


	 def findRuleConstraintsAndRuleSignature(){
	 	if(ruleNode !== null){
	 		leftConstraintCollection = new ArrayList<ConstraintType>();
		  	var consts = Arrays.asList(getAttrValueByName(ruleNode,"Constraints"))
		  				.stream().collect(Collectors.toList()).get(0).toString().trim();
			if(consts != ""){
				consts=consts.substring(1,consts.length-1);
				var cs=consts.split(Pattern.quote(", Item"));
				for(var i=1;i<cs.size();i++){
					cs.set(i,"Item"+cs.get(i));
				}
			  	for(String constraint: cs){ //	Item(3 , "value")  != Item(3 , "new_value")
			  		var ct= constraintDsDiffToConstraintType(constraint);
			  		if(ct !== null){
			  			leftConstraintCollection.add(ct);
			  		}			  			
			  	} 
			  	
			  	for(ctLeft:leftConstraintCollection){
			  		var ctRight= new ConstraintType();
			
					ctRight.lhs=ctLeft.lhs;		
					ctRight.rhs=ctLeft.rhs;	
					ctRight.operation=ctLeft.operation;
					ctRight.id_PatternLhs=ctLeft.id_PatternLhs;
					ctRight.nodeLhs=ctLeft.nodeLhs;
					ctRight.attrLhs=ctLeft.attrLhs;	
					if(ctRight.attrLhs.startsWith("new_"))
						ctRight.attrLhs=ctRight.attrLhs.replace("_Left","_Right");			
					ctRight.varInLhs="n"+ctRight.id_PatternLhs+ctRight.attrLhs;
					ctRight.attrTypeLhs=ctLeft.attrTypeLhs;
					if(ctRight.rhs.indexOf("Item")!=-1)
					{
						ctRight.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
						ctRight.id_PatternRhs=ctLeft.id_PatternRhs;
						ctRight.nodeRhs=ctLeft.nodeRhs;
						ctRight.attrRhs=ctLeft.attrRhs;
						if(ctRight.attrRhs.startsWith("new_"))
							ctRight.attrRhs=ctRight.attrRhs.replace("_Left","_Right");		
						ctRight.varInRhs="n"+ctRight.id_PatternRhs+ctRight.attrRhs;
						ctRight.attrTypeRhs=ctLeft.attrTypeRhs;
						
						ctRight.ruleInRhs="VAR "+ctRight.varInRhs+":"+ctRight.attrTypeRhs;
						
					}else{
						ctRight.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
						ctRight.id_PatternRhs="-1";
						ctRight.nodeRhs=null;
						ctRight.attrRhs="";
						ctRight.varInRhs= "";  // "var"+ct.varInLhs;
						ctRight.attrTypeRhs="";
						
						ctRight.operation = ctLeft.operation;
					}
					
					ctRight.ruleInLhs="VAR "+ctRight.varInLhs+":"+ctRight.attrTypeLhs;
					
					ctRight.conditionName="condition"+ctRight.varInLhs+ctRight.varInRhs;
					ctRight.conditionText="("+ctRight.varInLhs+" "+ctRight.operation+" "+ctRight.varInRhs+")";
					rightConstraintCollection.add(ctRight); 
			  	}
			  	
			  	
			  	for(c:leftConstraintCollection){
			  		addParamToRuleSignature(c.ruleInLhs);
			  		addParamToRuleSignature(c.ruleInRhs);		 	
		 		}	
		 		for(c:rightConstraintCollection){
			  		addParamToRuleSignature(c.ruleInLhs);
			  		addParamToRuleSignature(c.ruleInRhs);		 	
		 		}		  	
	  		}
	 	}
	 }
	 
	 def Boolean addParamToRuleSignature(String param){
	  	if(param!=null && param!="" && !ruleSignature.contains(param)){
			if(ruleSignature!="" && ruleSignature!=null)
			 	{ ruleSignature += "," + param; }
			else 
			 	{ ruleSignature += param; }	
			return true;	
		}
		return false;	 	
	 }
	  
	 def defineConstraints(){
	  	ruleSignature 				=   "";
	  	totalConstraintDefinition 	= 	"";		
	  	
	  		  	
	  	if(ruleNode !== null){	  	
		  	//var authorsConstraintDefinition = "";
		  	var leftAuthorConstraintDefinition = "";
		  	var rightAuthorConstraintDefinition = "";	  	
		  	//var constraintDefinition = "";
		  	var leftConstraintDefinition = "";
		  	var rightConstraintDefinition = "";
		  	
		  	for(s:leftAuthorConstraintCollection)
		  		if(s!="" && s!="")
		  			if(leftAuthorConstraintDefinition!="" && leftAuthorConstraintDefinition!=null)
		  				{ leftAuthorConstraintDefinition += " AND " + s; }
		  			else 
		  				{ leftAuthorConstraintDefinition += s; }
		  				
		    for(s:rightAuthorConstraintCollection)
		  		if(s!="" && s!=null)
		  			if(rightAuthorConstraintDefinition!="" && rightAuthorConstraintDefinition!=null)
		  				{ rightAuthorConstraintDefinition += " AND " + s; }
		  			else 
		  				{ rightAuthorConstraintDefinition += s; }
		  				
		  				
		  	//Both left/right Author Constraint Definitions are empty or not empty. There is not an XOR situation.
		  	/*if(leftAuthorConstraintDefinition!="" && leftAuthorConstraintDefinition!=null 
		  		&&  rightAuthorConstraintDefinition!="" && rightAuthorConstraintDefinition!=null)
		  		{ authorsConstraintDefinition += "((" + leftAuthorConstraintDefinition + ") OR (" + rightAuthorConstraintDefinition +"))"; }
		  	else
		  		{ authorsConstraintDefinition = ""; }*/
		  		
		  		
		  	for(c:leftConstraintCollection){
		  		var s=c.conditionText;
		  		if(s!="" && s!="")
		  			if(leftConstraintDefinition!="" && leftConstraintDefinition!=null)
		  				{ leftConstraintDefinition += " AND " + s; }
		  			else 
		  				{ leftConstraintDefinition += s; }		  				
		  	}
		  				
		    for(c:rightConstraintCollection){
		  		var s=c.conditionText;
		  		if(s!="" && s!=null)
		  			if(rightConstraintDefinition!="" && rightConstraintDefinition!=null)
		  				{ rightConstraintDefinition += " AND " + s; }
		  			else 
		  				{ rightConstraintDefinition += s; }
		  	}			
		  				
		  	//Both left/right Constraint Definitions are empty or not empty. There is not an XOR situation.
		  	/*if(leftConstraintDefinition!="" && leftConstraintDefinition!=null 
		  		&&  rightConstraintDefinition!="" && rightConstraintDefinition!=null)
		  		{ constraintDefinition += "((" + leftConstraintDefinition + ") OR (" + rightConstraintDefinition +"))"; }
		  	else
		  		{ constraintDefinition = ""; }*/
	  		
	  		
		 	/*for(ct:leftConstraintCollection){
		 		var s= ct.conditionText;
	  			if(s!="" && s!=null)
	  				if(constraintDefinition!="" && constraintDefinition!=null)
	  					{ constraintDefinition += " AND " + s; }
	  				else 
	  					{ constraintDefinition += s; }	  					
	  		}*/
	  		
	  		var totalLeftconstraintDefinition = "";
	  		var totalRightconstraintDefinition = "";
	  		
	  		if(leftConstraintDefinition!="" && leftConstraintDefinition!=null && 
	  			leftAuthorConstraintDefinition!="" && leftAuthorConstraintDefinition!=null)
	  		{
	  			totalLeftconstraintDefinition = leftConstraintDefinition + " AND " + leftAuthorConstraintDefinition;
	  		} else if(leftConstraintDefinition!="" && leftConstraintDefinition!=null && 
	  			(leftAuthorConstraintDefinition=="" || leftAuthorConstraintDefinition==null))
	  		{
	  			totalLeftconstraintDefinition = leftConstraintDefinition;
	  		}else if((leftConstraintDefinition=="" || leftConstraintDefinition==null) && 
	  			leftAuthorConstraintDefinition!="" && leftAuthorConstraintDefinition!=null)
	  		{
	  			totalLeftconstraintDefinition = leftAuthorConstraintDefinition;
	  		}else{
	  			totalLeftconstraintDefinition="";
	  		}
	  		
	  		if(rightConstraintDefinition!="" && rightConstraintDefinition!=null && 
	  			rightAuthorConstraintDefinition!="" && rightAuthorConstraintDefinition!=null)
	  		{
	  			totalRightconstraintDefinition = rightConstraintDefinition + " AND " + rightAuthorConstraintDefinition;
	  		} else if(rightConstraintDefinition!="" && rightConstraintDefinition!=null && 
	  			(rightAuthorConstraintDefinition=="" || rightAuthorConstraintDefinition==null))
	  		{
	  			totalRightconstraintDefinition = rightConstraintDefinition;
	  		}else if((rightConstraintDefinition=="" || rightConstraintDefinition==null) && 
	  			rightAuthorConstraintDefinition!="" && rightAuthorConstraintDefinition!=null)
	  		{
	  			totalRightconstraintDefinition = rightAuthorConstraintDefinition;
	  		}else{
	  			totalRightconstraintDefinition="";
	  		}	  		
	  		
	  		
		  	if(totalLeftconstraintDefinition!="" && totalLeftconstraintDefinition!=null 
	  		&&  totalRightconstraintDefinition!="" && totalRightconstraintDefinition!=null)
	  			{ totalConstraintDefinition = "conditions [(" +  totalLeftconstraintDefinition 
	  				+ ") OR (" + totalRightconstraintDefinition +")]";
	  			}
	  		else if(totalLeftconstraintDefinition!="" && totalLeftconstraintDefinition!=null 
	  		&&  (totalRightconstraintDefinition =="" || totalRightconstraintDefinition==null))
	  			{ totalConstraintDefinition = "conditions [" +  totalLeftconstraintDefinition +"]"; } 
	  		else if((totalLeftconstraintDefinition=="" || totalLeftconstraintDefinition==null)
	  		&&  (totalRightconstraintDefinition !="" && totalRightconstraintDefinition!=null))
	  			{ totalConstraintDefinition = "conditions [" +  totalRightconstraintDefinition +"]"; } 
	  		else
	  			{ totalConstraintDefinition = ""; }
	 
		  	return totalConstraintDefinition;
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
				
			var ctLeft= new ConstraintType();
			var attrNameOriginal = "";
			
			ctLeft.lhs=lhs;			
			ctLeft.rhs=rhs;	
			ctLeft.operation=operation;
			ctLeft.id_PatternLhs=lhs.substring(lhs.indexOf("(")+1,lhs.indexOf(",")).trim();
			ctLeft.nodeLhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ctLeft.id_PatternLhs);
			ctLeft.attrLhs=lhs.substring(lhs.indexOf("\"")+1,lhs.indexOf("\"", lhs.indexOf("\"") + 1)).trim();	
			attrNameOriginal = ctLeft.attrLhs;
			if(ctLeft.attrLhs.startsWith("new_"))
				ctLeft.attrLhs+="_Left";			
			ctLeft.varInLhs="n"+ctLeft.id_PatternLhs+ctLeft.attrLhs;
			ctLeft.attrTypeLhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ctLeft.nodeLhs,attrNameOriginal);
			if(rhs.indexOf("Item")!=-1)
			{
				ctLeft.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
				ctLeft.id_PatternRhs=rhs.substring(rhs.indexOf("(")+1,rhs.indexOf(",")).trim();
				ctLeft.nodeRhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ctLeft.id_PatternRhs);
				ctLeft.attrRhs=rhs.substring(rhs.indexOf("\"")+1,rhs.indexOf("\"", rhs.indexOf("\"") + 1)).trim();	
				attrNameOriginal = ctLeft.attrLhs;
				if(ctLeft.attrRhs.startsWith("new_"))
					ctLeft.attrRhs+="_Left";			
				ctLeft.varInRhs="n"+ctLeft.id_PatternRhs+ctLeft.attrRhs;
				ctLeft.attrTypeRhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ctLeft.nodeRhs,attrNameOriginal);
				
				ctLeft.ruleInRhs="VAR "+ctLeft.varInRhs+":"+ctLeft.attrTypeRhs;
				
			}else{
				ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
				ctLeft.id_PatternRhs="-1";
				ctLeft.nodeRhs=null;
				ctLeft.attrRhs="";
				ctLeft.varInRhs= "";  // "var"+ct.varInLhs;
				ctLeft.attrTypeRhs="";
				
				ctLeft.operation = constraintDsDiff.substring(constraintDsDiff.indexOf(")")+1, constraintDsDiff.length);
			}
			
			ctLeft.ruleInLhs="VAR "+ctLeft.varInLhs+":"+ctLeft.attrTypeLhs;
			
			ctLeft.conditionName="condition"+ctLeft.varInLhs+ctLeft.varInRhs;
			ctLeft.conditionText="("+ctLeft.varInLhs+" "+ctLeft.operation+" "+ctLeft.varInRhs+")";
	  		  	
	  		return ctLeft;
	  	}
	  	catch(Exception ex){
	  		return null;
	  	}
	  }	    

	 //*********************************************** 
	 
}















//(((((((((NOT USED ANYMORE))))))))))))
	
	 
	 /*def Boolean isInRuleSignature(String s){
	 	try{
	 		for(String f:signatureParameters){
	 			if(f.contains(s))
	 				return true;
	 		}	 	
	 	}catch(Exception ex){
	 		return false;
	 	}
	 	return false;
	 	
	 }*/









