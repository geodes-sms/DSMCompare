package com.zadahmad.dsemfcompare.editor.dsmcHenshin;

import com.google.common.base.Objects;
import com.zadahmad.dsemfcompare.editor.client.DsmComparatorController;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConstraintCompareType;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.ConstraintType;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.EReferenceType;
import com.zadahmad.dsemfcompare.editor.dsmcHenshin.RuleAttributes;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DsmcRulesToHenshinText {
  private ArrayList<EObject> allDsDiffRuleNodes = new ArrayList<EObject>();
  
  private ArrayList<EReferenceType> allDsDiffRuleAssocCollection = new ArrayList<EReferenceType>();
  
  private ArrayList<ConstraintType> constraintCollection = new ArrayList<ConstraintType>();
  
  private String ruleSignature = "";
  
  private String constraintDefination = "";
  
  private EObject ruleNode = null;
  
  private EObject patternRootNode = null;
  
  private String unitSequntialStar = "";
  
  public String dsmName = "";
  
  public String ruleMM_eNSURI = "";
  
  public Object ruleMM_eIN = null;
  
  public String dsmCasePath = "";
  
  public String dsmCaseRulesFolderName = "";
  
  public String dsmCaseHenshinRulesFolderName = "";
  
  public ArrayList<String> dsmCaseRuleFileNames = new ArrayList<String>();
  
  public ArrayList<String> dsmCaseRuleFilePaths = new ArrayList<String>();
  
  public String henshinRulesDSDiffPath = "";
  
  public String henshinRulesCpaPath = "";
  
  public ArrayList<RuleAttributes> rulesFilter = new ArrayList<RuleAttributes>();
  
  private int ruleFilterNumber = 0;
  
  private int ruleElementNumber = 0;
  
  private int i = 0;
  
  public ArrayList<String> edges = new ArrayList<String>();
  
  public void run() {
    this.henshinRulesDSDiffPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesDSDiff.henshin_text");
    this.henshinRulesCpaPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesCPA.henshin_text");
    this.setRulesFilter();
    this.setRulesFilePaths();
    this.generateDSDiff(this.dsmCaseRuleFilePaths, this.henshinRulesDSDiffPath);
    this.generateCPA(this.dsmCaseRuleFilePaths, this.henshinRulesCpaPath);
  }
  
  public void run(final boolean isATempFile) {
    this.henshinRulesDSDiffPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesDSDiff.henshin_text");
    this.henshinRulesCpaPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesCPA.henshin_text");
    if (isATempFile) {
      String _henshinRulesDSDiffPath = this.henshinRulesDSDiffPath;
      this.henshinRulesDSDiffPath = (_henshinRulesDSDiffPath + "TEMP");
      String _henshinRulesCpaPath = this.henshinRulesCpaPath;
      this.henshinRulesCpaPath = (_henshinRulesCpaPath + "TEMP");
    }
    this.setRulesFilter();
    this.setRulesFilePaths();
    this.generateDSDiff(this.dsmCaseRuleFilePaths, this.henshinRulesDSDiffPath);
    this.generateCPA(this.dsmCaseRuleFilePaths, this.henshinRulesCpaPath);
  }
  
  /**
   * def static void main(String[] args) {
   * //var ruleFileVPaths=new ArrayList<String>();
   * setRulesFilePaths(dsmCaseRuleFilePaths);//com.zadahmad.dsemfcompare.editor.dsmcHenshin.DsmcRulesToHenshinText.
   * henshinRulesDSDiffPath=dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";
   * henshinRulesCpaPath=dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
   * if(args!=null && args.size()>=2){
   * dsmName		 					= args.get(0);
   * dsmCasePath 					= args.get(1);
   * dsmCaseRulesFolderName			= args.get(2);
   * dsmCaseHenshinRulesFolderName	= args.get(3);
   * //setRulesFilePaths(args.get(4).split("|"));
   * henshinRulesDSDiffPath	=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesDSDiff.henshin_text";
   * henshinRulesCpaPath		=	dsmCasePath + dsmCaseHenshinRulesFolderName + dsmName + "RulesCPA.henshin_text";
   * }
   * new DsmcRulesToHenshinText().generateDSDiff(dsmCaseRuleFilePaths,henshinRulesDSDiffPath)
   * new DsmcRulesToHenshinText().generateCPA(dsmCaseRuleFilePaths,henshinRulesCpaPath)
   * }
   */
  private void setRulesFilePaths() {
    for (final String ruleFileName : this.dsmCaseRuleFileNames) {
      this.dsmCaseRuleFilePaths.add(((this.dsmCasePath + this.dsmCaseRulesFolderName) + ruleFileName));
    }
  }
  
  public void setRulesFilter() {
    for (final String ruleFileName : this.dsmCaseRuleFileNames) {
      int _length = ruleFileName.length();
      int _minus = (_length - 4);
      String _substring = ruleFileName.substring(0, _minus);
      RuleAttributes _ruleAttributes = new RuleAttributes(_substring, (-1), (-1));
      this.rulesFilter.add(_ruleAttributes);
    }
  }
  
  public void generateCPA(final ArrayList<String> ruleFilePathes, final String henshin_textFilePath) {
    try {
      if (((!Objects.equal(ruleFilePathes, null)) && (ruleFilePathes.size() > 0))) {
        this.doEMFSetup();
        PrintWriter out = new PrintWriter(henshin_textFilePath);
        try {
          final ResourceSetImpl resourceSetPackage = new ResourceSetImpl();
          final Resource resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true);
          EObject _get = resourcePackage.getContents().get(0);
          out.print(this.generatePackageImport(((EObject) _get)));
          for (final String rulePath : ruleFilePathes) {
            {
              final ResourceSetImpl resourceSet = new ResourceSetImpl();
              final Resource resource = resourceSet.getResource(URI.createURI(rulePath), true);
              EList<EObject> _contents = resource.getContents();
              for (final EObject content : _contents) {
                out.print(this.generateRule(((EObject) content), "CPA"));
              }
              this.allDsDiffRuleNodes.clear();
              this.allDsDiffRuleAssocCollection.clear();
            }
          }
          out.close();
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            System.out.println(ex.getMessage());
            out.close();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generateDSDiff(final ArrayList<String> ruleFilePathes, final String henshin_textFilePath) {
    try {
      if (((!Objects.equal(ruleFilePathes, null)) && (ruleFilePathes.size() > 0))) {
        this.doEMFSetup();
        PrintWriter out = new PrintWriter(henshin_textFilePath);
        try {
          final ResourceSetImpl resourceSetPackage = new ResourceSetImpl();
          final Resource resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true);
          EObject _get = resourcePackage.getContents().get(0);
          out.print(this.generatePackageImport(((EObject) _get)));
          this.unitSequntialStar = "\n\tunit unitSequntialStar(){";
          this.i = (-1);
          for (final String rulePath : ruleFilePathes) {
            {
              this.ruleFilterNumber = 0;
              this.ruleElementNumber = 0;
              final ResourceSetImpl resourceSet = new ResourceSetImpl();
              final Resource resource = resourceSet.getResource(URI.createURI(rulePath), true);
              EList<EObject> _contents = resource.getContents();
              for (final EObject content : _contents) {
                out.print(this.generateRule(((EObject) content), "DSDiff"));
              }
              this.i++;
              RuleAttributes _get_1 = this.rulesFilter.get(this.i);
              _get_1._filtersCount = this.ruleFilterNumber;
              RuleAttributes _get_2 = this.rulesFilter.get(this.i);
              _get_2._elementsCount = this.ruleElementNumber;
              this.allDsDiffRuleNodes.clear();
              this.allDsDiffRuleAssocCollection.clear();
            }
          }
          String _unitSequntialStar = this.unitSequntialStar;
          this.unitSequntialStar = (_unitSequntialStar + "\n\t}");
          out.print(this.unitSequntialStar);
          out.close();
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            System.out.print(ex.getMessage());
            out.close();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object doEMFSetup() {
    Object _xblockexpression = null;
    {
      EPackage.Registry.INSTANCE.put(this.ruleMM_eNSURI, this.ruleMM_eIN);
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generatePackageImport(final EObject it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ePackageImport  ");
    String _replace = it.eClass().getEPackage().getName().replace("Rule", "Diff");
    _builder.append(_replace);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateRule(final EObject it, final String henshinFileType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    this.init(it.eContents().get(0));
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.setSchedule(this.getAttrValueByName(it, "name").toString());
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("rule ");
    String _string = this.getAttrValueByName(it, "name").toString();
    _builder.append(_string, "\t\t");
    _builder.append("(");
    _builder.append(this.ruleSignature, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("graph");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    {
      for(final EObject n : this.allDsDiffRuleNodes) {
        {
          if ((Objects.equal(this.getSuperClassName(n).toLowerCase(), "domainspecificdiff") || (this.getAttrValueByName(n, "ID_Pattern").toString().contains("-") == true))) {
            String _defineNode = this.defineNode(n, "create", henshinFileType);
            _builder.append(_defineNode);
            _builder.newLineIfNotEmpty();
          } else {
            {
              Object _attrValueByName = this.getAttrValueByName(n, "Filter");
              boolean _equals = Objects.equal(_attrValueByName, Boolean.valueOf(false));
              if (_equals) {
                String _defineNode_1 = this.defineNode(n, "preserve", henshinFileType);
                _builder.append(_defineNode_1);
                _builder.newLineIfNotEmpty();
              } else {
                String _defineNode_2 = this.defineNode(n, "delete", henshinFileType);
                _builder.append(_defineNode_2);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t\t");
    this.defineEdges();
    _builder.newLineIfNotEmpty();
    {
      int _size = this.edges.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t\t\t");
        _builder.append("edges[");
        _builder.newLine();
        {
          for(final String edg : this.edges) {
            _builder.append("\t\t\t");
            _builder.append("  \t\t");
            _builder.append(edg, "\t\t\t  \t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t      \t\t ");
        _builder.append("]");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(this.constraintDefination, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("//----------------------------------------------------------------------");
    _builder.newLine();
    return _builder;
  }
  
  public void init(final EObject root) {
    ArrayList<EObject> _arrayList = new ArrayList<EObject>();
    this.allDsDiffRuleNodes = _arrayList;
    ArrayList<EReferenceType> _arrayList_1 = new ArrayList<EReferenceType>();
    this.allDsDiffRuleAssocCollection = _arrayList_1;
    ArrayList<ConstraintType> _arrayList_2 = new ArrayList<ConstraintType>();
    this.constraintCollection = _arrayList_2;
    this.ruleSignature = "";
    this.constraintDefination = "";
    this.ruleNode = null;
    this.patternRootNode = root;
    this.ruleNode = this.patternRootNode.eContainer();
    this.allDsDiffRuleNodes = DsmComparatorController.getAllNodes(this.patternRootNode, Boolean.valueOf(true), Boolean.valueOf(false));
    this.defineConstraints();
  }
  
  public void setSchedule(final String ruleName) {
    String _unitSequntialStar = this.unitSequntialStar;
    this.unitSequntialStar = (_unitSequntialStar + "\n\t\twhile{\n\t\t\t");
    String _unitSequntialStar_1 = this.unitSequntialStar;
    this.unitSequntialStar = (_unitSequntialStar_1 + (ruleName + "()"));
    String _unitSequntialStar_2 = this.unitSequntialStar;
    this.unitSequntialStar = (_unitSequntialStar_2 + "\n\t\t}");
  }
  
  public String defineNode(final EObject n, final String actionText, final String henshinFileType) {
    String nodeDef = ("\t\t\t\t " + actionText);
    boolean _equals = Objects.equal(actionText, "preserve");
    if (_equals) {
      String _nodeDef = nodeDef;
      nodeDef = (_nodeDef + "\t\t\t");
    } else {
      String _nodeDef_1 = nodeDef;
      nodeDef = (_nodeDef_1 + "\t\t\t\t");
    }
    boolean _equals_1 = Objects.equal(actionText, "delete");
    if (_equals_1) {
      int _ruleFilterNumber = this.ruleFilterNumber;
      this.ruleFilterNumber = (_ruleFilterNumber + 1);
    }
    boolean _notEquals = (!Objects.equal(actionText, "create"));
    if (_notEquals) {
      int _ruleElementNumber = this.ruleElementNumber;
      this.ruleElementNumber = (_ruleElementNumber + 1);
    }
    String _nodeDef_2 = nodeDef;
    String _createNode = this.createNode(n);
    String _plus = (_createNode + ":");
    String _superClassName = this.getSuperClassName(n);
    String _plus_1 = (_plus + _superClassName);
    nodeDef = (_nodeDef_2 + _plus_1);
    ArrayList<ConstraintType> ctNodes = new ArrayList<ConstraintType>();
    for (final ConstraintType ct : this.constraintCollection) {
      if ((Objects.equal(ct.nodeLhs, n) || Objects.equal(ct.nodeRhs, n))) {
        ctNodes.add(ct);
      }
    }
    String operationAttrDef = "";
    boolean _equals_2 = Objects.equal(henshinFileType, "DSDiff");
    if (_equals_2) {
      operationAttrDef = this.getStringAttrDef(n, "operation");
    }
    String domainspecificdiffNameAttrDef = "";
    String _lowerCase = this.getSuperClassName(n).toLowerCase();
    boolean _equals_3 = Objects.equal(_lowerCase, "domainspecificdiff");
    if (_equals_3) {
      domainspecificdiffNameAttrDef = this.getStringAttrDef(n, "name");
    }
    if ((((ctNodes.size() > 0) || (!Objects.equal(operationAttrDef, ""))) || (!Objects.equal(domainspecificdiffNameAttrDef, "")))) {
      String _nodeDef_3 = nodeDef;
      nodeDef = (_nodeDef_3 + "{");
      boolean _notEquals_1 = (!Objects.equal(domainspecificdiffNameAttrDef, ""));
      if (_notEquals_1) {
        String _nodeDef_4 = nodeDef;
        nodeDef = (_nodeDef_4 + ((("\n\t\t\t\t\t" + actionText) + " ") + domainspecificdiffNameAttrDef));
      }
      boolean _notEquals_2 = (!Objects.equal(operationAttrDef, ""));
      if (_notEquals_2) {
        String _nodeDef_5 = nodeDef;
        nodeDef = (_nodeDef_5 + ((("\n\t\t\t\t\t" + actionText) + " ") + operationAttrDef));
      }
      for (final ConstraintType ct_1 : ctNodes) {
        {
          if ((Objects.equal(ct_1.nodeLhs, n) && (!nodeDef.contains(((ct_1.attrLhs + " =  ") + ct_1.varInLhs))))) {
            String _nodeDef_6 = nodeDef;
            nodeDef = (_nodeDef_6 + ((((("\n\t\t\t\t\t" + actionText) + " ") + ct_1.attrLhs) + " =  ") + ct_1.varInLhs));
          }
          if ((Objects.equal(ct_1.nodeRhs, n) && (!nodeDef.contains(((ct_1.attrRhs + " =  ") + ct_1.varInRhs))))) {
            String _nodeDef_7 = nodeDef;
            nodeDef = (_nodeDef_7 + ((((("\n\t\t\t\t\t" + actionText) + " ") + ct_1.attrRhs) + " =  ") + ct_1.varInRhs));
          }
        }
      }
      String _nodeDef_6 = nodeDef;
      nodeDef = (_nodeDef_6 + ("\n" + "\t\t\t\t}"));
    }
    return nodeDef;
  }
  
  public String getStringAttrDef(final EObject n, final String attrName) {
    EAttribute attr = DsmComparatorController.getEAttributeByName(n, attrName);
    boolean _equals = Objects.equal(attr, null);
    if (_equals) {
      return "";
    } else {
      String _lowerCase = attr.getEAttributeType().eClass().getName().toLowerCase();
      boolean _equals_1 = Objects.equal(_lowerCase, "eenum");
      if (_equals_1) {
        String _string = n.eGet(attr).toString();
        String _plus = (((attrName + " = ") + "\"") + _string);
        return (_plus + "\"");
      } else {
        String _string_1 = n.eGet(attr).toString();
        String _plus_1 = (((attrName + " = ") + "\"\\\"") + _string_1);
        return (_plus_1 + "\\\"\"");
      }
    }
  }
  
  public void defineEdges() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.edges = _arrayList;
    ArrayList<EReferenceType> _allAssocCollection = this.getAllAssocCollection();
    for (final EReferenceType ERefC : _allAssocCollection) {
      if ((((ERefC.source.eClass().getName().toLowerCase().contains("domainspecificdiff") || ERefC.target.eClass().getName().toLowerCase().contains("domainspecificdiff")) || (this.getAttrValueByName(ERefC.source, "ID_Pattern").toString().contains("-") == true)) || (this.getAttrValueByName(ERefC.target, "ID_Pattern").toString().contains("-") == true))) {
        String _createNodeNumber = this.createNodeNumber(ERefC.source);
        String _plus = (("(" + 
          "create\t\t") + _createNodeNumber);
        String _plus_1 = (_plus + 
          "->");
        String _createNodeNumber_1 = this.createNodeNumber(ERefC.target);
        String _plus_2 = (_plus_1 + _createNodeNumber_1);
        String _plus_3 = (_plus_2 + 
          ":");
        String _name = ERefC.eReference.getName();
        String _plus_4 = (_plus_3 + _name);
        String AssocDef = (_plus_4 + 
          "),");
        this.edges.add(AssocDef);
      } else {
        if ((Objects.equal(this.getAttrValueByName(ERefC.source, "Filter"), Boolean.valueOf(true)) || Objects.equal(this.getAttrValueByName(ERefC.target, "Filter"), Boolean.valueOf(true)))) {
          String _createNodeNumber_2 = this.createNodeNumber(ERefC.source);
          String _plus_5 = (("(" + 
            "delete\t\t") + _createNodeNumber_2);
          String _plus_6 = (_plus_5 + 
            "->");
          String _createNodeNumber_3 = this.createNodeNumber(ERefC.target);
          String _plus_7 = (_plus_6 + _createNodeNumber_3);
          String _plus_8 = (_plus_7 + 
            ":");
          String _name_1 = ERefC.eReference.getName();
          String _plus_9 = (_plus_8 + _name_1);
          String AssocDef_1 = (_plus_9 + 
            "),");
          this.edges.add(AssocDef_1);
          int _ruleFilterNumber = this.ruleFilterNumber;
          this.ruleFilterNumber = (_ruleFilterNumber + 1);
          int _ruleElementNumber = this.ruleElementNumber;
          this.ruleElementNumber = (_ruleElementNumber + 1);
        } else {
          boolean _contains = ERefC.source.eClass().getName().toLowerCase().contains("domainspecificdiff");
          boolean _not = (!_contains);
          if (_not) {
            String _createNodeNumber_4 = this.createNodeNumber(ERefC.source);
            String _plus_10 = (("(" + 
              "preserve\t") + _createNodeNumber_4);
            String _plus_11 = (_plus_10 + 
              "->");
            String _createNodeNumber_5 = this.createNodeNumber(ERefC.target);
            String _plus_12 = (_plus_11 + _createNodeNumber_5);
            String _plus_13 = (_plus_12 + 
              ":");
            String _name_2 = ERefC.eReference.getName();
            String _plus_14 = (_plus_13 + _name_2);
            String AssocDef_2 = (_plus_14 + 
              "),");
            this.edges.add(AssocDef_2);
            int _ruleElementNumber_1 = this.ruleElementNumber;
            this.ruleElementNumber = (_ruleElementNumber_1 + 1);
          }
        }
      }
    }
    int _size = this.edges.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _size_1 = this.edges.size();
      int _minus = (_size_1 - 1);
      String s = this.edges.get(_minus);
      int _length = s.length();
      int _minus_1 = (_length - 1);
      s = s.substring(0, _minus_1);
      int _size_2 = this.edges.size();
      int _minus_2 = (_size_2 - 1);
      this.edges.set(_minus_2, s);
    }
  }
  
  public String defineConstraints() {
    String _xblockexpression = null;
    {
      this.ruleSignature = "";
      this.constraintDefination = "";
      String _xifexpression = null;
      if ((this.ruleNode != null)) {
        String _xblockexpression_1 = null;
        {
          ArrayList<ConstraintType> _arrayList = new ArrayList<ConstraintType>();
          this.constraintCollection = _arrayList;
          String consts = Arrays.<Object>asList(this.getAttrValueByName(this.ruleNode, "Constraints")).stream().collect(Collectors.<Object>toList()).get(0).toString().trim();
          boolean _equals = Objects.equal(consts, "");
          if (_equals) {
            return "";
          }
          int _length = consts.length();
          int _minus = (_length - 1);
          consts = consts.substring(1, _minus);
          String[] cs = consts.split(Pattern.quote(", Item"));
          for (int i = 1; (i < ((List<String>)Conversions.doWrapArray(cs)).size()); i++) {
            String _get = cs[i];
            String _plus = ("Item" + _get);
            cs[i] = _plus;
          }
          for (final String constraint : cs) {
            {
              ConstraintType ct = this.constraintDsDiffToConstraintType(constraint);
              if ((ct != null)) {
                this.constraintCollection.add(ct);
              }
            }
          }
          String _xifexpression_1 = null;
          int _size = this.constraintCollection.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            String _xblockexpression_2 = null;
            {
              this.constraintDefination = "conditions [";
              int _size_1 = this.constraintCollection.size();
              boolean _greaterThan_1 = (_size_1 > 1);
              if (_greaterThan_1) {
                for (int i = 0; (i < (this.constraintCollection.size() - 1)); i++) {
                  {
                    ConstraintType ct = this.constraintCollection.get(i);
                    String _constraintDefination = this.constraintDefination;
                    this.constraintDefination = (_constraintDefination + (ct.conditionText + ", "));
                    boolean _contains = this.ruleSignature.contains(ct.ruleInLhs);
                    boolean _not = (!_contains);
                    if (_not) {
                      String _ruleSignature = this.ruleSignature;
                      this.ruleSignature = (_ruleSignature + (ct.ruleInLhs + ", "));
                    }
                    boolean _contains_1 = this.ruleSignature.contains(ct.ruleInRhs);
                    boolean _not_1 = (!_contains_1);
                    if (_not_1) {
                      String _ruleSignature_1 = this.ruleSignature;
                      this.ruleSignature = (_ruleSignature_1 + (ct.ruleInRhs + ", "));
                    }
                    int _ruleElementNumber = this.ruleElementNumber;
                    this.ruleElementNumber = (_ruleElementNumber + 1);
                  }
                }
                int _size_2 = this.constraintCollection.size();
                int _minus_1 = (_size_2 - 1);
                ConstraintType ct = this.constraintCollection.get(_minus_1);
                String _constraintDefination = this.constraintDefination;
                this.constraintDefination = (_constraintDefination + ct.conditionText);
                boolean _contains = this.ruleSignature.contains(ct.ruleInLhs);
                boolean _not = (!_contains);
                if (_not) {
                  String _ruleSignature = this.ruleSignature;
                  this.ruleSignature = (_ruleSignature + (ct.ruleInLhs + ", "));
                }
                if ((((!Objects.equal(ct.ruleInRhs, null)) && (!ct.ruleInRhs.contains(":"))) && (!this.ruleSignature.contains(ct.ruleInRhs)))) {
                  String _ruleSignature_1 = this.ruleSignature;
                  this.ruleSignature = (_ruleSignature_1 + (ct.ruleInRhs + ", "));
                }
              } else {
                ConstraintType ct_1 = this.constraintCollection.get(0);
                String _constraintDefination_1 = this.constraintDefination;
                this.constraintDefination = (_constraintDefination_1 + ct_1.conditionText);
                boolean _contains_1 = this.ruleSignature.contains(ct_1.ruleInLhs);
                boolean _not_1 = (!_contains_1);
                if (_not_1) {
                  String _ruleSignature_2 = this.ruleSignature;
                  this.ruleSignature = (_ruleSignature_2 + (ct_1.ruleInLhs + ", "));
                }
                boolean _contains_2 = this.ruleSignature.contains(ct_1.ruleInRhs);
                boolean _not_2 = (!_contains_2);
                if (_not_2) {
                  String _ruleSignature_3 = this.ruleSignature;
                  this.ruleSignature = (_ruleSignature_3 + (ct_1.ruleInRhs + ", "));
                }
              }
              this.ruleSignature = this.ruleSignature.trim();
              int _length_1 = this.ruleSignature.length();
              int _minus_2 = (_length_1 - 1);
              this.ruleSignature = this.ruleSignature.substring(0, _minus_2);
              String _constraintDefination_2 = this.constraintDefination;
              _xblockexpression_2 = this.constraintDefination = (_constraintDefination_2 + "]");
            }
            _xifexpression_1 = _xblockexpression_2;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String createNode(final EObject n) {
    String _createNodeNumber = this.createNodeNumber(n);
    return ("node " + _createNodeNumber);
  }
  
  public String createNodeNumber(final EObject n) {
    String _trim = this.getAttrValueByName(n, "ID_Pattern").toString().replace("-", "").trim();
    return ("n" + _trim);
  }
  
  public String getSuperClassName(final EObject n) {
    return n.eClass().getESuperTypes().get(0).getName();
  }
  
  public ArrayList<EReferenceType> getAllAssocCollection() {
    for (final EObject node : this.allDsDiffRuleNodes) {
      {
        ArrayList<EReferenceType> nodeAssocCollection = this.getAllNodeAssocCollection(node);
        int _size = nodeAssocCollection.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          this.allDsDiffRuleAssocCollection.addAll(nodeAssocCollection);
        }
      }
    }
    return this.allDsDiffRuleAssocCollection;
  }
  
  public ArrayList<EReferenceType> getAllNodeAssocCollection(final EObject src) {
    ArrayList<EReferenceType> allNodeAssociations = new ArrayList<EReferenceType>();
    EList<EReference> _eAllReferences = src.eClass().getEAllReferences();
    for (final EReference r : _eAllReferences) {
      try {
        List<EObject> AllTargets = DsmComparatorController.getAllTargets(src, r);
        if (((AllTargets != null) && (AllTargets.size() > 0))) {
          for (final EObject tgt : AllTargets) {
            {
              EReferenceType newERef = new EReferenceType();
              newERef.source = src;
              newERef.target = tgt;
              newERef.eReference = r;
              allNodeAssociations.add(newERef);
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return allNodeAssociations;
  }
  
  public Object getAttrValueByName(final EObject obj, final String AttrName) {
    try {
      return obj.eGet(DsmComparatorController.getEAttributeByName(obj, AttrName));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return Boolean.valueOf(false);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public ConstraintType constraintDsDiffToConstraintType(final String constraintDsDiff) {
    try {
      String cons = constraintDsDiff;
      String[] lor = cons.split("[[<>!=]=]");
      String lhs = (lor[0]).trim();
      final String[] _converted_lor = (String[])lor;
      int _size = ((List<String>)Conversions.doWrapArray(_converted_lor)).size();
      int _minus = (_size - 1);
      String rhs = (lor[_minus]).trim();
      String operation = "";
      Iterable<MatchResult> mr = DsmComparatorController.allMatches(Pattern.compile("[[<>!=]=]"), cons);
      for (final MatchResult match : mr) {
        String _operation = operation;
        String _group = match.group();
        operation = (_operation + _group);
      }
      ConstraintType ct = new ConstraintType();
      ct.lhs = lhs;
      ct.rhs = rhs;
      ct.operation = operation;
      int _indexOf = lhs.indexOf("(");
      int _plus = (_indexOf + 1);
      ct.id_PatternLhs = lhs.substring(_plus, lhs.indexOf(",")).trim();
      ct.nodeLhs = DsmComparatorController.getNodeByID_Pattern(this.allDsDiffRuleNodes, ct.id_PatternLhs);
      int _indexOf_1 = lhs.indexOf("\"");
      int _plus_1 = (_indexOf_1 + 1);
      int _indexOf_2 = lhs.indexOf("\"");
      int _plus_2 = (_indexOf_2 + 1);
      ct.attrLhs = lhs.substring(_plus_1, lhs.indexOf("\"", _plus_2)).trim();
      ct.varInLhs = (("n" + ct.id_PatternLhs) + ct.attrLhs);
      ct.attrTypeLhs = DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeLhs, ct.attrLhs);
      int _indexOf_3 = rhs.indexOf("Item");
      boolean _notEquals = (_indexOf_3 != (-1));
      if (_notEquals) {
        ct.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
        int _indexOf_4 = rhs.indexOf("(");
        int _plus_3 = (_indexOf_4 + 1);
        ct.id_PatternRhs = rhs.substring(_plus_3, rhs.indexOf(",")).trim();
        ct.nodeRhs = DsmComparatorController.getNodeByID_Pattern(this.allDsDiffRuleNodes, ct.id_PatternRhs);
        int _indexOf_5 = rhs.indexOf("\"");
        int _plus_4 = (_indexOf_5 + 1);
        int _indexOf_6 = rhs.indexOf("\"");
        int _plus_5 = (_indexOf_6 + 1);
        ct.attrRhs = rhs.substring(_plus_4, rhs.indexOf("\"", _plus_5)).trim();
        ct.varInRhs = (("n" + ct.id_PatternRhs) + ct.attrRhs);
        ct.attrTypeRhs = DsmComparatorController.getAttrDataTypeNameByAttrName(ct.nodeRhs, ct.attrRhs);
        ct.ruleInRhs = ((("VAR " + ct.varInRhs) + ":") + ct.attrTypeRhs);
      } else {
        ct.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
        ct.id_PatternRhs = "-1";
        ct.nodeRhs = null;
        ct.attrRhs = "";
        ct.varInRhs = "";
        ct.attrTypeRhs = "";
        int _indexOf_7 = constraintDsDiff.indexOf(")");
        int _plus_6 = (_indexOf_7 + 1);
        ct.operation = constraintDsDiff.substring(_plus_6, constraintDsDiff.length());
      }
      ct.ruleInLhs = ((("VAR " + ct.varInLhs) + ":") + ct.attrTypeLhs);
      ct.conditionName = (("condition" + ct.varInLhs) + ct.varInRhs);
      ct.conditionText = ((((ct.varInLhs + " ") + ct.operation) + " ") + ct.varInRhs);
      return ct;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public CharSequence generatePackageImport(final EObject it) {
    return _generatePackageImport(it);
  }
  
  public CharSequence generateRule(final EObject it, final String henshinFileType) {
    return _generateRule(it, henshinFileType);
  }
}
