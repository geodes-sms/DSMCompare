package com.zadahmad.dsemfcompare.editor.client;

public class RuleDefiner {

}

//*************DEFINE A NEW RULE************* 	 
/*
@Test
public void defineAnewRule() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
{
	final String modelRootPath  = RootApp+"com.Zadahmad.DSEMFCompare.editor/model/Pacman/";
	final String rulesRootPath  = modelRootPath + "Rules/";
	String ruleName = "PacmanEatFood";
	final String rulesTemplPath = rulesRootPath + "RuleTemplate.xmi";
	final String verBPath 		= rulesRootPath + ruleName+ "/V1.xmi";
	final String verNPath  		= rulesRootPath + ruleName+ "/V2.xmi"; 						
	final String result      	= rulesRootPath + ruleName+ "/result.txt";	
	final String DSMDPath 		= rulesRootPath + ruleName+ "/DSMDiff.xmi";	
	final String rulePath 		= rulesRootPath + ruleName+ "/Rule.xmi";		 	
	
	
    String rootClassName    = "Game"; //@@@ Get By code and all followings
  	String MMFileName   	= "PacManGo";
	String MMPackageName	= "PacmanGo"; 
	
	String DiffMMFileName   = MMFileName 	+ "DiffMM";
	String DiffMMPackageName= MMPackageName + "DiffMM";
	
	
	String ruleClassName    = "Rule";
	String RuleMMFileName   = MMFileName 	+ "RuleMM";
	String RuleMMPackageName= MMPackageName + "RuleMM";
	
	String DiffMM_eNSURI = 	PacmanGoDiffMMPackage.eNS_URI; 	
	Object DiffMM_eIN	 =	PacmanGoDiffMMPackage.eINSTANCE;
	
	String RuleMM_eNSURI = 	PacmanGoRuleMMPackage.eNS_URI; 	
	Object RuleMM_eIN	 =	PacmanGoRuleMMPackage.eINSTANCE;	 	 
	
	 //1. Create DS-Diffs
	
	
	 try 
	 {
		MapEmfCompareDiffsToFineGranularDSMDiffs(verBPath, verNPath, DSMDPath, result);
	 } catch (IOException e) 
	 {			
		e.printStackTrace();
		return;
	 }
	 
	//2. Copy Template Rule to new Rule path
	//File fileRulesTempl = new File(rulesTemplPath);	 	
	File fileDSMD = new File(DSMDPath);
   File fileNewRule = new File(rulePath);
   
	Files.deleteIfExists(fileNewRule.toPath());
	////Files.copy( fileDSMD.toPath(), fileNewRule.toPath());

	
	//3. Change DS-Diffs to a Rule Pattern
	
	String   dsdNodeName  = DiffMMPackageName+":"+rootClassName;
	String   ruleNodeName = RuleMMPackageName+":"+ruleClassName;
	
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
   DocumentBuilder db = dbf.newDocumentBuilder();
   //Document docNewRule = db.parse(new File(rulePath));
   Document docDSDiff = db.parse(new File(DSMDPath));
   
   //Document fileRule = db.newDocument();   // db.parse(new File(RulePath));
   
   //NodeList nodeList = fileRuleTemplate.getChildNodes();
   
   
   
   
   System.out.println("__________Attributes_____Sample: ");
   NodeList nodeList = docDSDiff.getElementsByTagName(dsdNodeName);
   Node ruleNode=nodeList.item(0);
	docDSDiff.renameNode(ruleNode, null, "pp");
	
	Node attrR			=	ruleNode.getAttributes().getNamedItem("xmlns"+":"+DiffMMPackageName);
	Node attrRChanged	=	docDSDiff.renameNode(attrR, null, "xmlns"+":"+RuleMMPackageName);
	attrRChanged.setNodeValue(RuleMM_eNSURI);
	
	((Element)ruleNode).setAttribute("xsi:schemaLocation",RuleMM_eNSURI+" ../../../../com.Zadahmad.DSEMFCompare/MetaModel/PacManGoRuleMM.ecore");
	((Element)ruleNode).setAttribute("name",ruleName);
	
	
	Element elemPattern= docDSDiff.createElement("pattern");
	int ID_Pattern=1;
	elemPattern.setAttribute("ID_Pattern",Integer.toString(ID_Pattern));
	
	NodeList ruleChildren =ruleNode.getChildNodes();
	int rclength=ruleChildren.getLength();
	for(int i=0;i<rclength;i++)
	{
		Node node=ruleChildren.item(i).cloneNode(true);
		ID_Pattern+=1;
		//((Element)node).setAttribute("ID_Pattern",Integer.toString(ID_Pattern));
		//              //@   =>  //@pattern/@ ===> @ => @pattern/@
		
		try {
			Node attrType =	node.getAttributes().getNamedItem("xsi:type");
   		String attrTypeValue= attrType.getNodeValue();
   		String attrTypeValueNew=RuleMMPackageName+":Pattern_"+attrTypeValue.split(":")[1];
   		attrType.setNodeValue(attrTypeValueNew);
		}catch(Exception ex) {}
		
		try
		{
   		NamedNodeMap attrs=node.getAttributes();
   		int attrLength=attrs.getLength();
   		for(int j=0;j<attrLength;j++)
   		{
   			Node attr=attrs.item(j);
   			String attrVal=attr.getNodeValue();
   			if(attrVal.contains("@"));
   				attr.setNodeValue(attrVal.replace("@", "@pattern/@"));
   		}
		}catch(Exception ex) {}
		
		elemPattern.appendChild(node);
	}
	
	
	/*
	for(int i=0;i<rclength;i++)
	{
		Node node=ruleChildren.item(i);
		while (node.hasChildNodes())
	        node.removeChild(node.getFirstChild());
	}
	* /
	
	while (ruleNode.hasChildNodes())
		ruleNode.removeChild(ruleNode.getFirstChild());
	
	ruleNode.appendChild(elemPattern);
	
	
	
	Element elemConstraints= docDSDiff.createElement("constraints");
	elemConstraints.appendChild(docDSDiff.createTextNode("Item(3 , &quot;value&quot;)  != Item(3 , &quot;new_value&quot;)"));
	ruleNode.appendChild(elemConstraints);
	

	
	
   
   
   /*
   Node attrX=nodeList.item(0).getAttributes().getNamedItem("xmlns"+":"+DiffMMPackageName);
   System.out.println("attrX 		= " 	+ 	attrX);
	System.out.println("NodeName	= "	+	attrX.getNodeName());
	System.out.println("NodeType	= "	+	attrX.getNodeType());
	System.out.println("NodeValue	= "+	attrX.getNodeValue());
	
	
	NodeList nodeListR 	= 	docNewRule.getElementsByTagName(dsdNode);
	Node attrR			=	nodeListR.item(0).getAttributes().getNamedItem("xmlns"+":"+DiffMMPackageName);
	Node attrRChanged	=	docNewRule.renameNode(attrR, null, "xmlns"+":"+RuleMMPackageName);
   System.out.println("attrRChanged 	= " 	+ 	attrRChanged);
	System.out.println("NodeName		= "	+	attrRChanged.getNodeName());
	System.out.println("NodeType		= "	+	attrRChanged.getNodeType());
	System.out.println("NodeValue		= "+	attrRChanged.getNodeValue());    	
	* /
	
	Transformer transformer = null;
	try {
		transformer = TransformerFactory.newInstance().newTransformer();
	} catch (TransformerConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerFactoryConfigurationError e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Result output = new StreamResult(fileNewRule);
	Source input = new DOMSource(docDSDiff);

	try {
		transformer.transform(input, output);
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	/*
   for(int x=0,size= nodeList.getLength(); x<size; x++) {
   	System.out.println(nodeList.item(x).getNodeName());
   	System.out.println(nodeList.item(x).getNodeType());
   	System.out.println(nodeList.item(x).getNodeValue());
   	
   	System.out.println("__________Attributes");
   	for(int i=0; i<nodeList.item(x).getAttributes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
   	System.out.println("__________ChildNodes");
   	for(int i=0; i<nodeList.item(x).getChildNodes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
      // System.out.println(nodeList.item(x).getAttributes().getNamedItem("name").getNodeValue());
   }
   
   System.out.println("********************");
   
   nodeList = docNewRule.getElementsByTagName("pattern");
   for(int x=0,size= nodeList.getLength(); x<size; x++) {
   	System.out.println(nodeList.item(x).getNodeName());
   	System.out.println(nodeList.item(x).getNodeType());
   	System.out.println(nodeList.item(x).getNodeValue());
   	
   	System.out.println("__________Attributes");
   	for(int i=0; i<nodeList.item(x).getAttributes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
   	System.out.println("__________ChildNodes");
   	for(int i=0; i<nodeList.item(x).getChildNodes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
       //System.out.println(nodeList.item(x).getAttributes().getNamedItem("name").getNodeValue());
   }
   
   System.out.println("********************XPATH");
   System.out.println(">>>>>>>>>>>>expression = \"//constraints\"");
   
   XPath xPath = XPathFactory.newInstance().newXPath();
   String expression = "//constraints";///PacmanGoRuleMM:Rule/constraints
   nodeList = (NodeList) xPath.compile(expression).evaluate(docNewRule, XPathConstants.NODESET);
   for(int x=0,size= nodeList.getLength(); x<size; x++) {
   	System.out.println(nodeList.item(x).getNodeName());
   	System.out.println(nodeList.item(x).getNodeType());
   	System.out.println(nodeList.item(x).getNodeValue());
   	
   	System.out.println("__________Attributes");
   	for(int i=0; i<nodeList.item(x).getAttributes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
   	System.out.println("__________ChildNodes");
   	for(int i=0; i<nodeList.item(x).getChildNodes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   }



   System.out.println(">>>>>>>>>>>>>expression = \"//pattern/entities\"");
   
   expression = "//pattern/entities";///PacmanGoRuleMM:Rule/constraints
   nodeList = (NodeList) xPath.compile(expression).evaluate(docNewRule, XPathConstants.NODESET);
   for(int x=0,size= nodeList.getLength(); x<size; x++) {
   	System.out.println(nodeList.item(x).getNodeName());
   	System.out.println(nodeList.item(x).getNodeType());
   	System.out.println(nodeList.item(x).getNodeValue());
   	
   	System.out.println("__________Attributes");
   	for(int i=0; i<nodeList.item(x).getAttributes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getAttributes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   	
   	System.out.println("__________ChildNodes");
   	for(int i=0; i<nodeList.item(x).getChildNodes().getLength();i++)
   	{
   		System.out.println("----");
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeName());        		
   		System.out.println(nodeList.item(x).getChildNodes().item(i).getNodeValue());
   	}
   	System.out.println("__________");
   }
	* /
	
	
	/*
	 //2. Change DS-Diffs to a Rule Pattern
	 ResourceSet rsetDSMDiff=setResourceSet(DSMDPath,DiffMM_eNSURI, DiffMM_eIN);
	 Resource rsourceDSMDiff=rsetDSMDiff.getResource(URI.createFileURI(DSMDPath) , true);
		
	 //PacmanGoDiffMM.Game rootDSMDiff=(PacmanGoDiffMM.Game)rsourceDSMDiff.getContents().get(0);
	 EObject rootDSMDiff= rsourceDSMDiff.getContents().get(0);
	 //EClass  classRoot=rootDSMDiff.eClass();
	 EObject rootRule = createRuleEqOfDSDiffClass(rootDSMDiff);
	 ArrayList<EObject> ruleContent= new ArrayList<EObject>();
	 ruleContent.add(rootRule);
	 
	 copyDSDEObjectToRuleEObject(rootDSMDiff, rootRule, 1);
	 * /
}


EObject createRuleEqOfDSDiffClass(EObject Source)
{
	 EClass sourceEClass=Source.eClass();
	 String sourceEclassName=sourceEClass.getName().toLowerCase();
	 
	 List<EClassifier> stEClassifiers = ((EPackage) RuleMM_eIN).getEClassifiers().stream()
	 .filter(c->c.getName().toLowerCase().contains(sourceEclassName))
	 .collect(Collectors.toList());
	 
	 EClass targetEClass= (EClass) stEClassifiers.stream()
			 .filter(c->c.getName().toLowerCase().equals("pattern_"+sourceEclassName))
			 .collect(Collectors.toList()).get(0); 
	 
	 return EcoreUtil.create(targetEClass);
}

void copyDSDEObjectToRuleEObject(EObject Source, EObject target, int ID_Pattern)
{

	 
	 //((EPackage) RuleMM_eIN).
	 
	 	//String RuleMM_eNSURI = 	PacmanGoRuleMMPackage.eNS_URI; 	
	 	//Object RuleMM_eIN	 =	PacmanGoRuleMMPackage.eINSTANCE;
	 
	 //target.eSet(feature, newValue);
	 
	 EAttribute ID_PatternEAttr = getEAttributeByName(target,"ID_Pattern");
	 target.eSet(ID_PatternEAttr, ID_Pattern);
	 
	 
	 for(EAttribute sourceEAttr:Source.eClass().getEAllAttributes())
	 {
		 EAttribute targetEAttr = getEAttributeByName(target,sourceEAttr.getName());
		 Object valSourceEAttr  = Source.eGet(sourceEAttr);
		 target.eSet(targetEAttr, valSourceEAttr);			 
	 }
	 
	 ArrayList<EObject> TeContents= new ArrayList<EObject>();
	 for (EObject eObj:Source.eContents())
	 {
			 ID_Pattern++;
			 EObject theNextTarget = createRuleEqOfDSDiffClass(eObj);	
			 //theNextTarget.eContainer().eSet(feature, newValue);
			 TeContents.add(theNextTarget);
			 copyDSDEObjectToRuleEObject(eObj, theNextTarget, ID_Pattern);			 
	 }
	 if(TeContents.size()>0)
		 target.eContents().addAll(TeContents);
	 /*
	 
	 ArrayList<EObject> TeCrossRefs= new ArrayList<EObject>();
	 for (EObject eObj:Source.eCrossReferences())
	 {
		 ID_Pattern++;
		 EReference theNextTarget = null;
		 TeCrossRefs.add(theNextTarget);
		 copyDSDEObjectToRuleEObject(eObj, theNextTarget, ID_Pattern);
	 }
	 if(TeCrossRefs.size()>0)
		 target.eCrossReferences().addAll(TeCrossRefs);
		 * /
	 
}
*/
//************************** 	 