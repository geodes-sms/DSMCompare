package com.zadahmad.dsmcompare.core.twoWayRuleMatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConstraintCompareType;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConstraintType;
import com.zadahmad.dsmcompare.core.DsmComparatorController;
import dsmcompare.mmextension.utils.*;

public class RuleDetail {
	public String ruleFilePath			= "";
	public String ruleName				= "";
	public EObject semanticNode			= null;
	public String semanticName			= ""; //Rule.Pattern_DomainSpecificDiff.name
	public String ruleMM_eNSURI			= "";
	public Object ruleMM_eIN			= null;
	public ArrayList<EObject> allDsDiffRuleNodes 			= null;
	public ArrayList<ConstraintType> constraintCollection 	= null;
	public EObject rootDSDiff			= null;
	public EObject ruleNode				= null;
	public EReference refPattern		= null;
	public EObject	pattern				= null;
	public EReference refSemanticDiff	= null;
	
	public void init(String RulePath, String RuleMM_eNSURI, Object RuleMM_eIN, EObject RootDSDiff) {
		 ruleFilePath 	= RulePath;
		 ruleMM_eNSURI	= RuleMM_eNSURI;
		 ruleMM_eIN		= RuleMM_eIN;
		 rootDSDiff		= RootDSDiff;
		 ResourceSet rsetRule	= DsmComparatorController.setResourceSet(ruleFilePath,ruleMM_eNSURI, ruleMM_eIN);	
		 Resource rsourceRule	= rsetRule.getResource(URI.createFileURI(ruleFilePath) , true);
		 ruleNode 		= rsourceRule.getContents().get(0);		
		 ruleName		= (String) EMFUtils.getAttrValueByAttrName(ruleNode, "name");
		 
		 refPattern		= ruleNode.eClass().getEAllReferences().stream().filter(
					r->r.getName().equalsIgnoreCase("pattern")).collect(
									Collectors.toList()).get(0);
		 pattern		= (EObject) ruleNode.eGet(refPattern);			 
		 refSemanticDiff	= pattern.eClass().getEAllReferences().stream().filter(
					r->r.getName().equalsIgnoreCase("domainspecificdiffs")).collect(
									Collectors.toList()).get(0);
		 semanticNode	= ((List<EObject>) pattern.eGet(refSemanticDiff)).get(0);		 
		 semanticName	= (String) EMFUtils.getAttrValueByAttrName(semanticNode, "name");
	}
	
	 
	 public ArrayList<ConstraintType> calculateRuleConstraintsDetail() {		 
		 if(ruleNode != null){
		 		constraintCollection = new ArrayList<ConstraintType>();
			  	var consts = Arrays.asList(DsmComparatorController.getAttrValueByAttrName(ruleNode,"Constraints"))
			  				.stream().collect(Collectors.toList()).get(0).toString().trim();
				if(consts!=null && consts!="" && !consts.substring(1,consts.length()-1).equals("")){
					allDsDiffRuleNodes = DsmComparatorController.getAllNodes(ruleNode, true, false);//patternRootNode
					consts=consts.substring(1,consts.length()-1);
					String[] cs=consts.split(Pattern.quote(", Item"));
					for(var i=1;i<cs.length;i++){
						//After split the "Item" form the second rule until the end will be removed and we will need to return it again 
						cs[i] = "Item"+cs[i];
					}
				  	for(String constraintDsDiff: cs){ //	Item(3 , "value")  != Item(3 , "new_value")
				  		ConstraintType ct= constraintDsDiffToConstraintType(constraintDsDiff,allDsDiffRuleNodes);
				  		if(ct != null){
				  			constraintCollection.add(ct);
				  		}			  			
				  	} 
				}
				return constraintCollection;
		 	}
		 return null;
	 }
	 
	 
	 public ConstraintType constraintDsDiffToConstraintType(String constraintDsDiff, ArrayList<EObject> allDsDiffRuleNodes){
	  	try{
	  		String cons= constraintDsDiff;
	  		String[] lor=cons.split("[[<>!=]=]"); //[[<>!][=]?=]  !== 	
	  		String lhs	=	lor[0].trim();  	
	  		String rhs	=	lor[lor.length-1].trim();
		  		  	
	  		String operation="";
			var mr=DsmComparatorController.allMatches(Pattern.compile("[[<>!=]=]"), cons);
		  	for (MatchResult match :mr ) {
	  			operation+=match.group();	  
			}
				
			var ct= new ConstraintType();
			var attrNameOriginal = "";
			
			ct.lhs=lhs;			
			ct.rhs=rhs;	
			ct.operation=operation;
			ct.id_PatternLhs=lhs.substring(lhs.indexOf("(")+1,lhs.indexOf(",")).trim();
			ct.nodeLhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ct.id_PatternLhs);
			ct.attrLhs=lhs.substring(lhs.indexOf("\"")+1,lhs.indexOf("\"", lhs.indexOf("\"") + 1)).trim();	
			attrNameOriginal = ct.attrLhs;
			//if(ct.attrLhs.startsWith("new_"))
			//	ct.attrLhs+="_Left";			
			ct.varInLhs="n"+ct.id_PatternLhs+ct.attrLhs;
			ct.attrTypeLhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeLhs,attrNameOriginal);
			if(rhs.indexOf("Item")!=-1)
			{
				ct.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
				ct.id_PatternRhs=rhs.substring(rhs.indexOf("(")+1,rhs.indexOf(",")).trim();
				ct.nodeRhs=DsmComparatorController.getNodeByID_Pattern(allDsDiffRuleNodes, ct.id_PatternRhs);
				ct.attrRhs=rhs.substring(rhs.indexOf("\"")+1,rhs.indexOf("\"", rhs.indexOf("\"") + 1)).trim();	
				attrNameOriginal = ct.attrLhs;
				//if(ct.attrRhs.startsWith("new_"))
				//	ct.attrRhs+="_Left";			
				ct.varInRhs="n"+ct.id_PatternRhs+ct.attrRhs;
				ct.attrTypeRhs=DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeRhs,attrNameOriginal);
				
				ct.ruleInRhs="VAR "+ct.varInRhs+":"+ct.attrTypeRhs;
				
			}else{
				ct.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
				ct.id_PatternRhs="-1";
				ct.nodeRhs=null;
				ct.attrRhs="";
				ct.varInRhs= "";  // "var"+ct.varInLhs;
				ct.attrTypeRhs="";
				
				ct.operation = constraintDsDiff.substring(constraintDsDiff.indexOf(")")+1, constraintDsDiff.length());
			}
			
			ct.ruleInLhs="VAR "+ct.varInLhs+":"+ct.attrTypeLhs;
			
			ct.conditionName="condition"+ct.varInLhs+ct.varInRhs;
			ct.conditionText="("+ct.varInLhs+" "+ct.operation+" "+ct.varInRhs+")";
	  		  	
	  		return ct;
	  	}
	  	catch(Exception ex){
	  		return null;
	  	}
	 }	    


}
