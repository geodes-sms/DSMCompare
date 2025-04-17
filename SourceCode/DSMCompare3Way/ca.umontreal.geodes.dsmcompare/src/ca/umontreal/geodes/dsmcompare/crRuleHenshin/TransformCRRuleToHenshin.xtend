package ca.umontreal.geodes.dsmcompare.crRuleHenshin

import ca.umontreal.geodes.dsmcompare.core.DsmComparatorController
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
import java.util.Set
import java.util.HashSet
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.EReferenceType
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.ConstraintType
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.RuleAttributes
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.ConstraintCompareType
import org.eclipse.emf.cdo.common.model.EMFUtil
import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers

class TransformCRRuleToHenshin {	 
	 ArrayList<EObject> 		allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
	 ArrayList<EReferenceType> 	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
	 ArrayList<ConstraintType> 	leftConstraintCollection    	= 	new ArrayList<ConstraintType>();
	 ArrayList<ConstraintType> 	rightConstraintCollection    	= 	new ArrayList<ConstraintType>();
	 String						ruleSignature					=   "";
	 String						totalConstraintDefinition    		= 	"";
	 ArrayList<String> 			leftAuthorConstraintCollection  = 	new ArrayList<String>();
	 ArrayList<String> 			rightAuthorConstraintCollection = 	new ArrayList<String>();
	 EObject					ruleNode						= 	null;		
	 //EObject					patternRootNode					= 	null;	
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
     		 
     public  boolean 			useWhileLoop					= true;
     
	 		 String				nttttt 							= "\n\t\t\t\t\t";
     
     
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
	 	if(n.eClass().getESuperTypes().size()>0)
	 		{return n.eClass().getESuperTypes().get(0).name;}
	 	else
	 		{return "";}
	 }	 	 
		
	def public void run(){
	 	henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";	  	
	 	setRulesFilter();
	 	setRulesFilePaths();
	 	generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	}
	 
	def public void run(boolean isATempFile){
	 	henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "CRRules.henshin_text";	  	
	  	//henshinRulesCpaPath		=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
	 	//if(isATempFile){
	 	//	henshinRulesDSDiffPath +="TEMP";
	 	//	henshinRulesCpaPath +="TEMP";
	 	//}
	 	setRulesFilter();
	 	setRulesFilePaths();
	 	generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
	    //generateCPA(dsmCaseRuleFilePaths,henshinRulesCpaPath)
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
	 		else if(n.eClass().getName().toLowerCase().contains("conflictresolution") //getSuperClassName(n).toLowerCase().contains("semanticdiff") 
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
	 			var diff_kindValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, attrName);
		 		if(attr!=null && diff_kindValue != null && !diff_kindValue.toString().contains("NON") && attr.getEAttributeType().eClass().getName().toLowerCase()=="eenum"){			
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
	 		
	 		var allChangeStatusAttributes = DsmcHelpers.getAllAttributesByAttrNameNullDefault(n,"changestatus");
		 	var sizeCSA = allChangeStatusAttributes.size();
		 	var i = 0;
		 	for(i=0;i<sizeCSA;i++){		 		
		 		var csAttr = allChangeStatusAttributes.get(i);
		 		var csAttrValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, csAttr.getName());
		 		if(csAttrValue != null && !csAttrValue.toString().contains("NON") 
		 			&& (csAttrValue.toString().equals("MERGE_DELETE") ||csAttrValue.toString().equals("MERGE_MODIFY")))
		 		{
		 			var id_Pattern=getAttrValueByName(n,"ID_Pattern").toString();	
		 			var csParam = "VAR n" + id_Pattern + csAttr.getName() + ":" + "EString";
					addParamToRuleSignature(csParam);
					
		 			if(csAttr.getName().length() > "changestatus".length()){//It is an attribute change status
		 				var attributeName = csAttr.getName().replace("ChangeStatus", "");
						var attrType = DsmcHelpers.getEAttributeTypeByName(n,attributeName);
						if(attrType.toLowerCase().equals("eenum")){
							attrType="EString";
						}
						var attrParam = "VAR n" + id_Pattern + attributeName + ":" + attrType;
						addParamToRuleSignature(attrParam);
		 			}
		 		}		 	
		 	}
		 }	
	}

 
	 //***********************************************  
	 def generateDSDiff(ArrayList<String> ruleFilePathes, String henshin_textFilePath){	   
	    if(ruleFilePathes!=null && ruleFilePathes.size() > 0){
	    	doEMFSetup	   		 	
	    	
		    // initialize output writer
		    var PrintWriter out = new PrintWriter(henshin_textFilePath); 
		    try{
		    	val resourceSetPackage = new ResourceSetImpl
				val resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true) // //pathDS
				
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
	  	  
	 //***********************************************  
	 def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(ruleMM_eNSURI, ruleMM_eIN)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	  }
	 
	 //***********************************************     
	 def dispatch generatePackageImport(EObject it) '''
ePackageImport  «eClass().getEPackage().getName().replace("CRRule","Diff")»
	  '''
	  
	  //«init(it)»
	  //«defineWileLoopForRule(getAttrValueByName(it,"name").toString())»
	  
	 def dispatch generateRule(EObject it, String henshinFileType) '''
		«init(it.eContents().get(0))»
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
					«ELSEIF n.eClass().getName().toLowerCase().contains("conflictresolution") // getSuperClassName(n).toLowerCase().contains("semanticdiff") 
			  			|| getAttrValueByName(n,"ChangeStatus").toString().equals("MERGE_ADD") /*getAttrValueByName(n,"ID_Pattern").toString().contains("-") == true*/
			  			|| getAttrValueByName(n,"ChangeStatus").toString().equals("MERGE_DELETE_CREATE")»
							«defineNode(n,"create", henshinFileType)»
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
	 def void init(EObject root){
 			allDsDiffRuleNodes           	= 	new ArrayList<EObject>();	
		  	allDsDiffRuleAssocCollection 	= 	new ArrayList<EReferenceType>();
		  	leftConstraintCollection    	= 	new ArrayList<ConstraintType>();
		  	signatureParameters				= 	new ArrayList<String>();
		  	ruleSignature					=   "";
		  	totalConstraintDefinition    	= 	"";
		  	ruleNode						= 	null;	
	 		//patternRootNode					=	root;
	 		ruleNode						=	root.eContainer();
	  		allDsDiffRuleNodes				=	DsmComparatorController.getAllNodes(root, true, false);//DsmComparatorController.getAllNodes(ruleNode, true, true);
		  	var i=1;
		  	for(i=1; i< ruleNode.eContents().size();i++)
		  	{
		  		var node = ruleNode.eContents().get(i);
		  		allDsDiffRuleNodes.addAll(DsmComparatorController.getAllNodes(node, true, false));
		  	}
		  	
		  	var set = new HashSet<EObject>(allDsDiffRuleNodes);
			allDsDiffRuleNodes.clear();
			allDsDiffRuleNodes.addAll(set);
			allDsDiffRuleNodes = DsmcHelpers.sortByPropertyName(allDsDiffRuleNodes, "ID_Pattern");
			
		  	//allDsDiffRuleNodes.remove(patternRootNode);
		  	//defineConstraints();
		  	//findRuleConstraintsAndRuleSignature();
	 }
	  	 
	 //*********************************************** 
	 def void cleanUpVariablesForNextRuleLoop(){
	 	ruleSignature						= "";
	 	totalConstraintDefinition    		= 	"";
 		leftAuthorConstraintCollection.clear();
  		rightAuthorConstraintCollection.clear();
	  	leftConstraintCollection.clear();
	  	rightConstraintCollection.clear();
	 }
	 
	 //*********************************************** 
	 def String defineWileLoopPerRule(String ruleName){
	 	var wileLoopForRule = "";
 		wileLoopForRule = "while{\n\t\t\t";	
	    wileLoopForRule +=ruleName+"()"
	    wileLoopForRule +="\n\t\t}";
	 }
	 
	 //*********************************************** 	 
	 def String defineForLoopPerRule(String ruleName){
	 	var wileLoopForRule = "";
		wileLoopForRule = "for(300){\n\t\t\t";
	    wileLoopForRule +=ruleName+"()"
	    wileLoopForRule +="\n\t\t}";
	 }
	 
	 //*********************************************** 
	 def void defineStarUnitForRule(String ruleName){
	 		var starUnitDefinitionForRule = "\n\t"+"unit unit"+ruleName+"Star(){\n\t\t";
		    starUnitDefinitionForRule +=defineWileLoopPerRule(ruleName);
		    starUnitDefinitionForRule +="\n\t}";
		    DefinitionsStarUnits += starUnitDefinitionForRule;
	 }
	 
	 //*********************************************** 
	 def void callStarUnitForRule(String ruleName){
	 		 callsStarUnits+= "\n\t\t"+"unit"+ruleName+"Star()";
	 }
	 
 
	 //***********************************************   
	 def String defineNode(EObject n, String ActionText, String henshinFileType)
	 {
	 	var actionText = ActionText;
	 	var changeStatusAttrValue = 
	 		DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "changeStatus");
		if(changeStatusAttrValue != null && 
			(changeStatusAttrValue.toString().contains("MERGE_ADD")
				|| changeStatusAttrValue.toString().contains("MERGE_MODIFY")
				|| changeStatusAttrValue.toString().contains("MERGE_DELETE_CREATE")))
		{
			actionText = "create";
		}
		
		var isGeneratedSemanticConflict = false;
	 	var conflict_kindAttrValue = 
	 		DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "conflict_kind");
	 	if(conflict_kindAttrValue != null && 
			(conflict_kindAttrValue.toString().contains("NON") 
				&& n.eClass().getName().contains("SemanticConflict")))
		{
			actionText = "create";
			isGeneratedSemanticConflict = true;
		}
		
		
	 	var nodeDef="\t\t\t\t "+actionText;
	 	if(actionText == "preserve" || actionText == "forbid")
	 		nodeDef+= "\t\t\t"
	 	else
	 		nodeDef+= "\t\t\t\t"
	 		
	 	if(actionText == "delete")
			ruleFilterNumber+=1;
			
		if(actionText != "create")
			ruleElementNumber+=1;	 
	 	
	 	var nodeType = "";
	 	var ase = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "apply_for_all_similar_entities"); 
	 	if(ase == null || ase.toString().equals("false")){
	 		nodeType = n.eClass().getName();
	 	} else {
	 		nodeType = getSuperClassName(n);
	 	}
	 	nodeType = nodeType.replace("Pattern_","");
	 	
	 	nodeDef += createNode(n)+":"+nodeType; 	
	 	//nodeDef += createNode(n)+":"+getSuperClassName(n);
	 	
	 	var nodeContent = "";
	 	
	 	var name = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "name"); 
	 	if(name != null && name.toString() != "")	 	
	 		nodeContent +=  getSimpleStringAttrDef(n, "name", actionText, nttttt);
	 	
	 	
	 	if(n.eClass().getName().toLowerCase().contains("conflictresolution")){
	 		//nodeDef += "{";
	 		//nodeContent +=  getSimpleStringAttrDef(n, "name", actionText, nttttt);
	 		nodeContent +=  getSimpleStringAttrDef(n, "ResolutionType", actionText, nttttt);
	 		nodeContent +=  getSimpleStringAttrDef(n, "ResolutionStrategy", actionText, nttttt);	 		
	 		//nodeDef +="\n\t\t\t\t}";	 		
	 	}
	 	else if(n.eClass().getName().toLowerCase().contains("semanticconflict")){
	 		//nodeDef += "{";
	 		//nodeContent +=  getSimpleStringAttrDef(n, "name", actionText, nttttt);
	 		if(isGeneratedSemanticConflict != true){
	 			nodeContent +=  getSimpleStringAttrDef(n, "conflict_kind", actionText, nttttt);
	 		}
	 		else{
	 			nodeContent +=  nttttt + actionText + " conflict_kind =  "+ "\"" + "\\" + "\"" + "CONTRADICTING" + "\\" + "\"" + "\"" ;
	 		}
	 			
	 		nodeContent +=  getSimpleStringAttrDef(n, "conflict_Granularity", actionText, nttttt);
	 		//nodeDef +="\n\t\t\t\t}";	 		
	 	}
	 	
	 	
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
	 		var diff_kindValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "diff_kind");
		 	if(diff_kindValue != null && !diff_kindValue.toString().contains("NON")){
		 		diffKindVal = getStringAttrDef(n,"diff_kind");
		 		//if(!diffKindVal.contains("NON")){
		 			diffKindLeftDef  = diffKindVal.replace("diff_kind","diff_kind_Left");	 
		 			diffKindRightDef  = diffKindVal.replace("diff_kind","diff_kind_Right");	
		 		//}
		 	}	
		 	
		 	var allChangeStatusAttributes = DsmcHelpers.getAllAttributesByAttrNameNullDefault(n,"changestatus");
		 	var sizeCSA = allChangeStatusAttributes.size();
		 	var i = 0;
		 	for(i=0;i<sizeCSA;i++){
		 		var csAttr = allChangeStatusAttributes.get(i);
		 		var csAttrValue = DsmcHelpers.getAttrValueByAttrNameNullDefault(n, csAttr.getName());
			 	if(csAttrValue != null && !csAttrValue.toString().contains("NON")){
			 		//var csAttrVal = getStringAttrDef(n,csAttr.getName());			 				 	
				 	if(csAttrValue.toString().equals("MERGE_DELETE")){	 		
				 		// in case actionText of preserve
				 		nodeContent +=  nttttt + actionText + " " + getStringAttrDef(n,csAttr.getName());		
				 		nodeContent +=  nttttt + "set		" + csAttr.getName() + " =  "+ "\"" + "\\" + "\"" + "MERGE_DELETE" + "\\" + "\"" + "\"" ;
				 	}
				 	else if(csAttrValue.toString().equals("MERGE_MODIFY")){			 		
				 		// in case actionText of preserve
				 		nodeContent +=  nttttt + actionText + " " + getStringAttrDef(n,csAttr.getName());
				 		nodeContent +=  nttttt + "set		" + csAttr.getName() + " =  "+ "\"" + "\\" + "\"" + "MERGE_MODIFY" + "\\" + "\"" + "\"" ;
				 	   if(csAttr.getName().length() > "changestatus".length()){
					 		var attributeName = csAttr.getName().replace("ChangeStatus", "");
					 		var id_Pattern=getAttrValueByName(n,"ID_Pattern").toString();
					 		var paramDef = "n" + id_Pattern + attributeName;
					 		
					 		nodeContent +=  nttttt + actionText + " " + attributeName + " = " + paramDef;
					 		nodeContent +=  nttttt + "set		" + attributeName + " =  "+ "\"" + "\\" + "\"" + DsmcHelpers.getAttrValueByAttrNameNullDefault(n, attributeName).toString() + "\\" + "\"" + "\"" ;				 		
				 		}
				 	}	
				 	else if(csAttrValue.toString().equals("MERGE_DELETE_CREATE")){	 			
				 		nodeContent +=  nttttt + actionText + " " + "changeStatus" + " = " + "\"" + "\\" + "\"" + "MERGE_DELETE" + "\\" + "\"" + "\"" ;
				 	}
				 	else{
				 		nodeContent +=  getSimpleStringAttrDef(n,csAttr.getName(), actionText, nttttt);			 		
				 	}		 	
			 	}			 			 		
		 	}
	 	}	
	 	
	 	/*
	 	var domainspecificdiffNameAttrDef= "";	 	
	 	if(n.eClass().getName().toLowerCase().contains("semanticdiff")){//getSuperClassName(n).toLowerCase().contains("semanticdiff")
	 		//domainspecificdiffNameAttrDef = getStringAttrDef(n,"name");
	 		
	 	}	 	*/
	 	
	 	if(n.eClass().getName().toLowerCase().equals("pattern_semanticdiff") && !DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "author").toString().equals("NON")){//domainspecificdiffNameAttrDef!=""
	 			//nodeContent += nttttt + actionText + " " + domainspecificdiffNameAttrDef;
	 			nodeContent += nttttt + actionText + " author" + " =  " + "\"" + "\\" + "\"" + DsmcHelpers.getAttrValueByAttrNameNullDefault(n, "author").toString()  + "\\" + "\"" + "\"" ;
	 			
	 	}
	 	
	 	if(ctNodes.size() > 0 || diffKindLeftDef != "" || 
	 		diffKindRightDef !="" )//|| domainspecificdiffNameAttrDef != ""
	 		{//|| attributeNameAttrDef !=""
	 		//nodeDef += "{";
	 		
	 		//if(attributeNameAttrDef!=""){
	 		//	nodeDef += nttttt + actionText + " " + attributeNameAttrDef;
	 		//}
	 		
	 		if(diffKindLeftDef!=""){
	 			nodeContent += nttttt + actionText + " " + diffKindLeftDef;
	 		}
	 		if(diffKindRightDef!=""){
	 			nodeContent += nttttt + actionText + " " + diffKindRightDef;
	 		}
	 		
	 		var constraintAttrDefList = new HashSet<String>();
 		 	for(ConstraintType ct:ctNodes)
		 	{
		 		if(ct.nodeLhs == n && !nodeDef.contains(ct.attrLhs+ " =  "+ct.varInLhs))
		 		{
		 			constraintAttrDefList.add(nttttt + actionText + " "+ct.attrLhs+ " =  "+ct.varInLhs);
		 			//nodeContent += nttttt + actionText + " "+ct.attrLhs+ " =  "+ct.varInLhs;
		 		}
		 		if(ct.nodeRhs == n && !nodeDef.contains(ct.attrRhs+ " =  "+ct.varInRhs)){
		 			constraintAttrDefList.add(nttttt + actionText + " "+ct.attrRhs+ " =  "+ct.varInRhs);
		 			//nodeContent += nttttt + actionText + " "+ct.attrRhs+ " =  "+ct.varInRhs;
	 			}
		 	}
		 	for (String c : constraintAttrDefList) {
		 		nodeContent +=c;
		 	}
		 	//nodeContent +="\n" + "\t\t\t\t}";	 	
	 	}
	 	
	 	if(!nodeContent.equals("")){
	 		nodeDef += "{";
	 		nodeDef += nodeContent; 		
	 		nodeDef +="\n\t\t\t\t}";	
	 	}
	 	
	 	return nodeDef;
	 } 

	 //*********************************************** 	 
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
	 
	 //------------------------------------------------
	 def String getSimpleStringAttrDef(EObject n, String attrName, String actionText, String indenting){
	 	try{
	 		return indenting + actionText + " " + attrName + " =  "+ "\"" + "\\" + "\"" + DsmcHelpers.getAttrValueByAttrNameNullDefault(n, attrName).toString() + "\\" + "\"" + "\"" ;
	 	}catch(Exception ex){
	 		System.out.println("getSimpleStringAttrDef: " + ex.toString());
	 		return "";
	 	}
	 }
	 
	 //*********************************************** 
	 def void defineEdges(){
	  	edges= new ArrayList<String>();
	  	for(EReferenceType ERefC: getAllAssocCollection()){
	  		//-------------------------------------------------------------------------------------------
	  		var isGeneratedSemanticConflict_Source = false;
	  		var isGeneratedSemanticConflict_Target = false;
	  			  		
	  		var conflict_kindAttrValue_Source = 
	 			DsmcHelpers.getAttrValueByAttrNameNullDefault(ERefC.source, "conflict_kind");
		 	if(conflict_kindAttrValue_Source != null && 
				(conflict_kindAttrValue_Source.toString().contains("NON") 
					&& ERefC.source.eClass().getName().contains("SemanticConflict")))
			{
				isGeneratedSemanticConflict_Source = true;
			}
			
			var conflict_kindAttrValue_Target = 
	 			DsmcHelpers.getAttrValueByAttrNameNullDefault(ERefC.target, "conflict_kind");
		 	if(conflict_kindAttrValue_Target != null && 
				(conflict_kindAttrValue_Target.toString().contains("NON") 
					&& ERefC.target.eClass().getName().contains("SemanticConflict")))
			{
				isGeneratedSemanticConflict_Target = true;
			}
	  		//-------------------------------------------------------------------------------------------
	  		
	  		
	  		if(allDsDiffRuleNodes.contains(ERefC.source) && allDsDiffRuleNodes.contains(ERefC.target))
	  		{
		  		if(!(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  			&& getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_ADD"))
		  			
		  			&& !(getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_ADD") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
		  			&&	!(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  			&& getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_DELETE_CREATE"))
		  			
		  			&& !(getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_DELETE_CREATE") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
	  				&& !(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  				&& ERefC.target.eClass().getName().toLowerCase().contains("conflictresolution"))
		  				
		  			&& !(ERefC.source.eClass().getName().toLowerCase().contains("conflictresolution") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
		  			&& !isGeneratedSemanticConflict_Source
		  			
		  			&& !isGeneratedSemanticConflict_Target
		  				
		  			&& (getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
	  					|| getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))	)
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
		  		else if(
		  			!(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  			&& getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_ADD"))
		  			
		  			&& !(getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_ADD") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
		  			&& !(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  			&& getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_DELETE_CREATE"))
		  			
		  			&& !(getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_DELETE_CREATE") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
	  				&& !(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  				&& ERefC.target.eClass().getName().toLowerCase().contains("conflictresolution"))
		  				
		  			&& !(ERefC.source.eClass().getName().toLowerCase().contains("conflictresolution") 
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
	  				&& !(getAttrValueByName(ERefC.source,"isForbidden").toString().equals("true")
		  			&& isGeneratedSemanticConflict_Target)
		  			
		  			&& !(isGeneratedSemanticConflict_Source
		  				&& getAttrValueByName(ERefC.target,"isForbidden").toString().equals("true"))
		  				
		  			&& ( isGeneratedSemanticConflict_Source || isGeneratedSemanticConflict_Target
		  				|| getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_ADD") 
			  			||	getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_ADD")	
			  			
		  				|| getAttrValueByName(ERefC.source,"changeStatus").toString().equals("MERGE_DELETE_CREATE") 
			  			||	getAttrValueByName(ERefC.target,"changeStatus").toString().equals("MERGE_DELETE_CREATE")
			  				
				  		|| 	ERefC.source.eClass().getName().toLowerCase().contains("conflictresolution") // semanticdiff
				  		||	ERefC.target.eClass().getName().toLowerCase().contains("conflictresolution") //semanticdiff
				  		
				  		||  (getAttrValueByName(ERefC.source,"ID_Pattern").toString().contains("-") == true)
				  		||  (getAttrValueByName(ERefC.target,"ID_Pattern").toString().contains("-") == true))	)
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
		  		else if(
		  			//getAttrValueByName(ERefC.source,"Action").toString().equals("REMOVE") 
		  			//|| getAttrValueByName(ERefC.target,"Action").toString().equals("REMOVE") ||	
		  			getAttrValueByName(ERefC.source,"Filter") == true 
		  			|| getAttrValueByName(ERefC.target,"Filter") == true)
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
		  		else if(!ERefC.source.eClass().getName().toLowerCase().contains("conflictresolution")) //semanticdiff
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

	 //*********************************************** 
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
			  	
			  	/*for(ctLeft:leftConstraintCollection){
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
						
					}else if(ctRight.operation.equals("matchAnyOfValues")){
						ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
						ctLeft.id_PatternRhs="-1";
						ctLeft.nodeRhs=null;
						ctLeft.attrRhs="";
						ctLeft.varInRhs= ctLeft.varInRhs
						ctLeft.attrTypeRhs="";				
						ctLeft.operation = ctLeft.operation;			
							
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
					
					if(ctRight.operation.equals("contains")){
						//"\"MODIFY\""
						ctRight.conditionText = 
							'("'+ctRight.varInLhs+"."+ctRight.operation+'('+ctRight.varInRhs+'.replace(\'return;\',\'\'))"'+ " == " + "'true'" + ")";
					}// 
					else if(ctRight.operation.equals("containsMethod")){
						//"\"MODIFY\""
						ctRight.conditionText = 
							'("'+ctRight.varInLhs+".contains"+'('+ctRight.varInRhs+'.replace(\'()\',\'\'))"'+ " == " + "'true'" + ")";
					}
					else if(ctRight.operation.equals("containsMethodInvocation")){
						//"\"MODIFY\""
						ctRight.conditionText = 
							'("'+ctRight.varInLhs+".contains"+"(\'method invocation; \' + "+ctRight.varInRhs+'.replace(\'()\',\';\'))"'+ " == " + "'true'" + ")";
					}					
					else if(ctRight.operation.equals("contains2")){
						//"\"MODIFY\""
						ctRight.conditionText = 
							'("'+ctRight.varInLhs+".contains"+'('+ctRight.varInRhs+')"'+ " == " + "'true'" + ")";
					}					
					else if(ctRight.operation.equals("matchAnyOfValues")){
						ctRight.conditionText = ctLeft.conditionText;
						// *
						var names = ctRight.varInRhs.split(",");
						var matches = "";
						for(var i=0;i<names.length-1;i++){
							matches+="\""+names.get(i).trim()+"\"|";
						}
						if(names.length>0){
							matches+="\""+names.get(names.length-1).trim()+"\"";
						}
						
						ctRight.conditionText = 
							'("'+ctRight.varInLhs+".matchAnyOfValues"+'('+matches+')"'+ " == " + "'true'" + ")";						
					 	// * /
					
					}
					else{
						ctRight.conditionText = "("+ctRight.varInLhs+" "+ctRight.operation+" "+ctRight.varInRhs+")";
					}					
					
					rightConstraintCollection.add(ctRight); 
			  	}*/
			  	
			  	
			  	for(c:leftConstraintCollection){
			  		addParamToRuleSignature(c.ruleInLhs);
			  		addParamToRuleSignature(c.ruleInRhs);		 	
		 		}	
		 		/* 
		 		for(c:rightConstraintCollection){
			  		addParamToRuleSignature(c.ruleInLhs);
			  		addParamToRuleSignature(c.ruleInRhs);		 	
		 		}*/		  	
	  		}
	 	}
	 }
	 
	 	 //***********************************************   
	 def ConstraintType constraintDsDiffToConstraintType(String constraintDsDiff){
	  	try{
		  	var cons= constraintDsDiff;// constraintDsDiff.substring(1, constraintDsDiff.length-1);
		  	
		  	var lhs="";
		  	var rhs="";
		  	var operation="";
		  	if(cons.contains(" contains ")){
		  		operation = "contains";
		  		var lor=cons.split("contains");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	}
		  	else if(cons.contains(" containsMethod ")){
		  		operation = "containsMethod";
		  		var lor=cons.split("containsMethod");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	}
		  	else if(cons.contains(" containsMethodInvocation ")){
		  		operation = "containsMethodInvocation";
		  		var lor=cons.split("containsMethodInvocation");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	}
		  	else if(cons.contains(" contains2 ")){
		  		operation = "contains2";
		  		var lor=cons.split("contains2");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	} 
		  	else if(cons.contains(" notcontains2 ")){
		  		operation = "notcontains2";
		  		var lor=cons.split("notcontains2");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	} 
		  	else if(cons.contains(" matchAnyOfValues ")){
		  		operation = "matchAnyOfValues";
		  		var lor=cons.split("matchAnyOfValues");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	} 
		  	else if(cons.contains(" notMatchAnyOfValues ")){
		  		operation = "notMatchAnyOfValues";
		  		var lor=cons.split("notMatchAnyOfValues");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	} 
		  	 
		  	else if(cons.contains(" containsAnyOfValues ")){
		  		operation = "containsAnyOfValues";
		  		var lor=cons.split("containsAnyOfValues");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	} 
		  	else if(cons.contains(" notContainsAnyOfValues ")){
		  		operation = "notContainsAnyOfValues";
		  		var lor=cons.split("notContainsAnyOfValues");
		  		lhs	=	lor.get(0).trim();  	
		  		rhs	=	lor.get(lor.size()-1).trim(); 
		  	}		  	
		  	else{
		  		var lor=cons.split("[[<>!=]=]"); //[[<>!][=]?=]  !== 	
			  	lhs	=	lor.get(0).trim();  	
			  	rhs	=	lor.get(lor.size()-1).trim();  		  	
				
				var mr=DsmComparatorController.allMatches(Pattern.compile("[[<>!=]=]"), cons);
			  	for (MatchResult match :mr ) {
		  			operation+=match.group();	  
				}
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
				
			}else if(operation.equals("matchAnyOfValues") || operation.equals("notMatchAnyOfValues") 
				|| operation.equals("containsMatchAnyOfValues") || operation.equals("notContainsMatchAnyOfValues")
			){
				ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
				ctLeft.id_PatternRhs="-1";
				ctLeft.nodeRhs=null;
				ctLeft.attrRhs="";
				ctLeft.varInRhs= rhs
				ctLeft.attrTypeRhs="";				
				ctLeft.operation = operation;			
					
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
			if(ctLeft.operation.equals("contains")){
				//ctLeft.conditionText="("+ctLeft.varInLhs+"."+ctLeft.operation+"("+ctLeft.varInRhs+")"+")";
				ctLeft.conditionText = 
							'("'+ctLeft.varInLhs+"."+ctLeft.operation+'('+ctLeft.varInRhs+'.replace(\'return;\',\'\'))"'+ " == " + "'true'" + ")";
			}
			else if(ctLeft.operation.equals("containsMethod")){
				ctLeft.conditionText = 
					'("'+ctLeft.varInLhs+".contains"+'('+ctLeft.varInRhs+'.replace(\'()\',\'\'))"'+ " == " + "'true'" + ")";
			}
			else if(ctLeft.operation.equals("containsMethodInvocation")){
						//"\"MODIFY\""
				ctLeft.conditionText = 
							'("'+ctLeft.varInLhs+".contains"+"(\'method invocation; \' + "+ctLeft.varInRhs+'.replace(\'()\',\';\'))"'+ " == " + "'true'" + ")";
			}
			else if(ctLeft.operation.contains("notcontains2")){
				if(ctLeft.varInRhs.equals("")){
					ctLeft.varInRhs = rhs.replace("\"","");							
					ctLeft.conditionText = DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, ctLeft.varInRhs, false);
				}
				else{					
					ctLeft.conditionText = 
					'("'+ctLeft.varInLhs+".contains"+'('+ctLeft.varInRhs+')"'+ " != " + "'true'" + ")";				
					}
			
				//"\"MODIFY\""
			}	
			else if(ctLeft.operation.contains("contains2")){
				if(ctLeft.varInRhs.equals("")){
					ctLeft.varInRhs = rhs.replace("\"","");
					ctLeft.conditionText = DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, ctLeft.varInRhs, true);
				}
				else{
					ctLeft.conditionText = 
					'("'+ctLeft.varInLhs+".contains"+'('+ctLeft.varInRhs+')"'+ " == " + "'true'" + ")";
				}
				
			}					
			else if(ctLeft.operation.equals("notMatchAnyOfValues")){
				var names = ctLeft.varInRhs.split(",");
				var matches = "";
				for(var i=0;i<names.length-1;i++){
					matches+=names.get(i).trim()+"|";
				}
				if(names.length>0){
					matches+=names.get(names.length-1).trim();
				}
				
				ctLeft.conditionText = 
					'("'+ctLeft.varInLhs+".matches"+'(\\'+matches+')"'+ " != " + "'true'" + ")";
				ctLeft.conditionText = ctLeft.conditionText.replace("\")\" !=","\\\")\" !=");
			}				
			else if(ctLeft.operation.equals("matchAnyOfValues")){
				var names = ctLeft.varInRhs.split(",");
				var matches = "";
				for(var i=0;i<names.length-1;i++){
					matches+=names.get(i).trim()+"|";
				}
				if(names.length>0){
					matches+=names.get(names.length-1).trim();
				}
				
				ctLeft.conditionText = 
					'("'+ctLeft.varInLhs+".matches"+'(\\'+matches+')"'+ " == " + "'true'" + ")";
				ctLeft.conditionText = ctLeft.conditionText.replace("\")\" ==","\\\")\" ==");
			}					
			else if(ctLeft.operation.contains("notContainsAnyOfValues")){
				if(ctLeft.varInRhs.equals("")){
					ctLeft.varInRhs = rhs.replace("\"","");
				}
				
				var names = ctLeft.varInRhs.split(",");
				ctLeft.conditionText = "";
				for(var i=0;i<names.length-1;i++){
					ctLeft.conditionText += DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, names.get(i), false);
					ctLeft.conditionText += " AND ";
				}
				
				ctLeft.conditionText += DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, names.get(names.length-1), false);
				ctLeft.conditionText = "(" + ctLeft.conditionText +")";					
				
			}				
			else if(ctLeft.operation.contains("containsAnyOfValues")){
				if(ctLeft.varInRhs.equals("")){
					ctLeft.varInRhs = rhs.replace("\"","");
				}
				
				var names = ctLeft.varInRhs.split(",");
				ctLeft.conditionText = "";
				for(var i=0;i<names.length-1;i++){
					ctLeft.conditionText += DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, names.get(i), true);
					ctLeft.conditionText += " OR ";
				}
				
				ctLeft.conditionText += DsmcHelpers.formatContainsStringConstraint(ctLeft.varInLhs, names.get(names.length-1), true);
				ctLeft.conditionText = "(" + ctLeft.conditionText +")";	
				
			}
			else{
				ctLeft.conditionText="("+ctLeft.varInLhs+" "+ctLeft.operation+" "+ctLeft.varInRhs+")";
			}		
			
			
	  		  	
	  		return ctLeft;
	  	}
	  	catch(Exception ex){
	  		return null;
	  	}
	  }	    
	  
	  
	 //*********************************************** 
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
	  
	 //***********************************************  
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
	 
	 //*********************************************** 
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
	  
	 //***********************************************  
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
}


//*************************************************************************













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









