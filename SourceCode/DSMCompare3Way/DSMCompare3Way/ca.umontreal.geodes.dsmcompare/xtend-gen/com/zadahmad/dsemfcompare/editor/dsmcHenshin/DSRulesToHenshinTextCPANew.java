package com.zadahmad.dsemfcompare.editor.dsmcHenshin;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DSRulesToHenshinTextCPANew {
  private ArrayList<EObject> allDsDiffRuleNodes = new ArrayList<EObject>();

  private /* ArrayList<EReferenceType> */Object allDsDiffRuleAssocCollection /* Skipped initializer because of errors */;

  private /* ArrayList<ConstraintType> */Object leftConstraintCollection /* Skipped initializer because of errors */;

  private /* ArrayList<ConstraintType> */Object rightConstraintCollection /* Skipped initializer because of errors */;

  private String ruleSignature = "";

  private String totalConstraintDefinition = "";

  private ArrayList<String> leftAuthorConstraintCollection = new ArrayList<String>();

  private ArrayList<String> rightAuthorConstraintCollection = new ArrayList<String>();

  private EObject ruleNode = null;

  private String rulesDefinitionsAndCallsInSequntialStarUnit = "";

  private String callsStarUnits = "";

  private String DefinitionsStarUnits = "";

  private ArrayList<String> signatureParameters = new ArrayList<String>();

  public String dsmName = "";

  public String ruleMM_eNSURI = "";

  public Object ruleMM_eIN = null;

  public String dsmCasePath = "";

  public String dsmCaseRulesFolderName = "";

  public String dsmCaseHenshinRulesFolderName = "";

  public ArrayList<String> dsmCaseRuleFileNames = new ArrayList<String>();

  public ArrayList<String> dsmCaseRuleFilePaths = new ArrayList<String>();

  public String henshinRulesDSDiffPath = "";

  public String henshinRulesDSDiffPostRulePath = "";

  public String henshinRulesCpaPath = "";

  public /* ArrayList<RuleAttributes> */Object rulesFilter /* Skipped initializer because of errors */;

  private int ruleFilterNumber = 0;

  private int ruleElementNumber = 0;

  private int i = 0;

  public ArrayList<String> edges = new ArrayList<String>();

  private int varPostCount = 0;

  public boolean useWhileLoop = true;

  public void setVarPostCountToZero() {
    this.varPostCount = 0;
  }

  public Object getAttrValueByName(final EObject obj, final String AttrName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\ngetEAttributeByName cannot be resolved");
  }

  public String getSuperClassName(final EObject n) {
    int _size = n.eClass().getESuperTypes().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      return n.eClass().getESuperTypes().get(0).getName();
    } else {
      return "";
    }
  }

  public void run() {
    this.henshinRulesDSDiffPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesDSDiff.henshin_text");
    this.setRulesFilter();
    this.setRulesFilePaths();
    this.generateDSDiff(this.dsmCaseRuleFilePaths, this.henshinRulesDSDiffPath);
  }

  public void runForCPA() {
    this.henshinRulesCpaPath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesCPA.henshin_text");
    this.setRulesFilter();
    this.setRulesFilePaths();
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
  }

  private void setRulesFilePaths() {
    for (final String ruleFileName : this.dsmCaseRuleFileNames) {
      this.dsmCaseRuleFilePaths.add(((this.dsmCasePath + this.dsmCaseRulesFolderName) + ruleFileName));
    }
  }

  public void setRulesFilter() {
    throw new Error("Unresolved compilation problems:"
      + "\nRuleAttributes cannot be resolved."
      + "\nThe field DSRulesToHenshinTextCPANew.rulesFilter refers to the missing type RuleAttributes");
  }

  public /* ConstraintType */Object cloneConstraintType(final /* ConstraintType */Object ctLeft, final String varLR, final String rVal) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstraintType cannot be resolved."
      + "\nlhs cannot be resolved"
      + "\nlhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconditionName cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved");
  }

  public Boolean addParamToRuleSignature(final String param) {
    if ((((!Objects.equal(param, null)) && (!Objects.equal(param, ""))) && (!this.ruleSignature.contains(param)))) {
      if (((!Objects.equal(this.ruleSignature, "")) && (!Objects.equal(this.ruleSignature, null)))) {
        boolean _endsWith = param.trim().endsWith(":");
        if (_endsWith) {
          String _ruleSignature = this.ruleSignature;
          this.ruleSignature = (_ruleSignature + (("," + param) + "EString"));
        } else {
          String _ruleSignature_1 = this.ruleSignature;
          this.ruleSignature = (_ruleSignature_1 + ("," + param));
        }
      } else {
        boolean _endsWith_1 = param.trim().endsWith(":");
        if (_endsWith_1) {
          String _ruleSignature_2 = this.ruleSignature;
          this.ruleSignature = (_ruleSignature_2 + (param + "EString"));
        } else {
          String _ruleSignature_3 = this.ruleSignature;
          this.ruleSignature = (_ruleSignature_3 + param);
        }
      }
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }

  public void setSignatureItems(final String henshinFileType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nConstraintType cannot be resolved."
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field ConstraintCompareType is undefined"
      + "\nThe method cloneConstraintType(ConstraintType, String, String) from the type DSRulesToHenshinTextCPANew refers to the missing type ConstraintType"
      + "\ngetEAttributeByName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ngetEAttributeType cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\n== cannot be resolved"
      + "\nlhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\ngetNodeByID_Pattern cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nOneAttrAndOneValue cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconditionName cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nruleInRhs cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nruleInRhs cannot be resolved");
  }

  public void generateCPA(final ArrayList<String> ruleFilePathes, final String henshin_textFilePath) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DSRulesToHenshinTextCPANew.allDsDiffRuleAssocCollection refers to the missing type EReferenceType");
  }

  public void generateDSDiff(final ArrayList<String> ruleFilePathes, final String henshin_textFilePath) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DSRulesToHenshinTextCPANew.rulesFilter refers to the missing type RuleAttributes"
      + "\nThe field DSRulesToHenshinTextCPANew.rulesFilter refers to the missing type RuleAttributes"
      + "\nThe field DSRulesToHenshinTextCPANew.allDsDiffRuleAssocCollection refers to the missing type EReferenceType"
      + "\n_filtersCount cannot be resolved"
      + "\n_elementsCount cannot be resolved");
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
    String _replace = it.eClass().getEPackage().getName().replace("2WayRule", "Diff");
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
    this.defineStarUnitForRule(this.getAttrValueByName(it, "name").toString());
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.callStarUnitForRule(this.getAttrValueByName(it, "name").toString());
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.setSignatureItems("DSDiff");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.findRuleConstraintsAndRuleSignature();
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
          Object _attrValueByName = this.getAttrValueByName(n, "isForbidden");
          boolean _equals = Objects.equal(_attrValueByName, Boolean.valueOf(true));
          if (_equals) {
            String _defineNode = this.defineNode(n, "forbid", henshinFileType);
            _builder.append(_defineNode);
            _builder.append("\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            if ((((this.getSuperClassName(n).toLowerCase().contains("semanticdiff") || (this.getAttrValueByName(n, "diff_kind").toString().contains("ADD") == true)) || (this.getAttrValueByName(n, "diff_kind").toString().contains("MODIFY") == true)) || (this.getAttrValueByName(n, "ID_Pattern").toString().contains("-") == true))) {
              String _defineNode_1 = this.defineNode(n, "create", henshinFileType);
              _builder.append(_defineNode_1);
              _builder.newLineIfNotEmpty();
            } else {
              boolean _contains = this.getAttrValueByName(n, "diff_kind").toString().contains("DELETE");
              boolean _equals_1 = (_contains == true);
              if (_equals_1) {
                String _defineNode_2 = this.defineNode(n, "delete", henshinFileType);
                _builder.append(_defineNode_2);
                _builder.newLineIfNotEmpty();
              } else {
                String _defineNode_3 = this.defineNode(n, "preserve", henshinFileType);
                _builder.append(_defineNode_3);
                _builder.append("\t\t\t      \t\t");
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
    String _defineConstraints = this.defineConstraints();
    _builder.append(_defineConstraints, "\t\t\t");
    _builder.append(" ");
    this.cleanUpVariablesForNextRuleLoop();
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("//----------------------------------------------------------------------");
    _builder.newLine();
    return _builder;
  }

  public void init(final EObject root) {
    throw new Error("Unresolved compilation problems:"
      + "\nEReferenceType cannot be resolved to a type."
      + "\nConstraintType cannot be resolved to a type."
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe field DSRulesToHenshinTextCPANew.allDsDiffRuleAssocCollection refers to the missing type EReferenceType"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\ngetAllNodes cannot be resolved"
      + "\ngetAllNodes cannot be resolved");
  }

  public void getPostRuleNodes() {
    int sizeNodes = this.allDsDiffRuleNodes.size();
    int i = 0;
    int j = 0;
    ArrayList<EObject> rmv = new ArrayList<EObject>();
    for (i = 2; (i < (sizeNodes - 1)); i++) {
      {
        EObject parent = this.allDsDiffRuleNodes.get((i - 1));
        if (((!this.allDsDiffRuleNodes.get(i).eContainer().equals(parent)) && (!rmv.contains(parent)))) {
          rmv.add(parent);
        }
      }
    }
    for (final EObject r : rmv) {
      this.allDsDiffRuleNodes.remove(r);
    }
  }

  public void cleanUpVariablesForNextRuleLoop() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.rightConstraintCollection refers to the missing type ConstraintType");
  }

  public String defineWileLoopPerRule(final String ruleName) {
    String _xblockexpression = null;
    {
      String wileLoopForRule = "";
      wileLoopForRule = "while{\n\t\t\t";
      String _wileLoopForRule = wileLoopForRule;
      wileLoopForRule = (_wileLoopForRule + (ruleName + "()"));
      String _wileLoopForRule_1 = wileLoopForRule;
      _xblockexpression = wileLoopForRule = (_wileLoopForRule_1 + "\n\t\t}");
    }
    return _xblockexpression;
  }

  public String defineForLoopPerRule(final String ruleName) {
    String _xblockexpression = null;
    {
      String wileLoopForRule = "";
      wileLoopForRule = "for(300){\n\t\t\t";
      String _wileLoopForRule = wileLoopForRule;
      wileLoopForRule = (_wileLoopForRule + (ruleName + "()"));
      String _wileLoopForRule_1 = wileLoopForRule;
      _xblockexpression = wileLoopForRule = (_wileLoopForRule_1 + "\n\t\t}");
    }
    return _xblockexpression;
  }

  public void defineStarUnitForRule(final String ruleName) {
    String starUnitDefinitionForRule = ((("\n\t" + "unit unit") + ruleName) + "Star(){\n\t\t");
    String _starUnitDefinitionForRule = starUnitDefinitionForRule;
    String _defineWileLoopPerRule = this.defineWileLoopPerRule(ruleName);
    starUnitDefinitionForRule = (_starUnitDefinitionForRule + _defineWileLoopPerRule);
    String _starUnitDefinitionForRule_1 = starUnitDefinitionForRule;
    starUnitDefinitionForRule = (_starUnitDefinitionForRule_1 + "\n\t}");
    String _DefinitionsStarUnits = this.DefinitionsStarUnits;
    this.DefinitionsStarUnits = (_DefinitionsStarUnits + starUnitDefinitionForRule);
  }

  public void callStarUnitForRule(final String ruleName) {
    String _callsStarUnits = this.callsStarUnits;
    this.callsStarUnits = (_callsStarUnits + ((("\n\t\t" + "unit") + ruleName) + "Star()"));
  }

  public String defineNodePost(final EObject n, final String actionText) {
    String nodeDef = ("\t\t\t\t " + actionText);
    if ((Objects.equal(actionText, "preserve") || Objects.equal(actionText, "forbid"))) {
      String _nodeDef = nodeDef;
      nodeDef = (_nodeDef + "\t\t\t");
    }
    String _nodeDef_1 = nodeDef;
    String _createNode = this.createNode(n);
    String _plus = (_createNode + ":");
    String _superClassName = this.getSuperClassName(n);
    String _plus_1 = (_plus + _superClassName);
    nodeDef = (_nodeDef_1 + _plus_1);
    String diffKindVal = this.getStringAttrDef(n, "diff_kind");
    if (((((this.varPostCount == 0) && (!Objects.equal(diffKindVal, ""))) && (!Objects.equal(this.getAttrValueByName(n, "diff_kind").toString(), "MODIFY"))) && (!Objects.equal(this.getAttrValueByName(n, "diff_kind").toString(), "NON")))) {
      this.varPostCount = 1;
      String _nodeDef_2 = nodeDef;
      nodeDef = (_nodeDef_2 + "{");
      String _nodeDef_3 = nodeDef;
      nodeDef = (_nodeDef_3 + ("\n\t\t\t\t\t" + "preserve\tchangeStatus \t= \tnPostchangeStatus"));
      String _nodeDef_4 = nodeDef;
      nodeDef = (_nodeDef_4 + ("\n\t\t\t\t\t" + "preserve\tdiff_kind_Left \t= \tnPostdiff_kind_Left"));
      String _nodeDef_5 = nodeDef;
      nodeDef = (_nodeDef_5 + ("\n\t\t\t\t\t" + "preserve\tdiff_kind_Right\t= \tnPostdiff_kind_Right"));
      String _nodeDef_6 = nodeDef;
      nodeDef = (_nodeDef_6 + ("\n" + "\t\t\t\t}"));
    }
    String domainspecificdiffNameAttrDef = "";
    boolean _contains = this.getSuperClassName(n).toLowerCase().contains("semanticdiff");
    if (_contains) {
      domainspecificdiffNameAttrDef = this.getStringAttrDef(n, "name");
      String _nodeDef_7 = nodeDef;
      nodeDef = (_nodeDef_7 + "{");
      String _nodeDef_8 = nodeDef;
      nodeDef = (_nodeDef_8 + (("\n\t\t\t\t\t" + "preserve\t") + domainspecificdiffNameAttrDef));
      String _nodeDef_9 = nodeDef;
      nodeDef = (_nodeDef_9 + ("\n\t\t\t\t\t" + "create\t\tauthor\t\t=  \"(nPostchangeStatus.toString().replace(\'EQUIVALENT\',\'EQUAL\') + nPostdiff_kind_Right.toString().replaceAll(\'ADD|DELETE|MODIFY\',\'RIGHT\') +  nPostdiff_kind_Left.toString().replaceAll(\'ADD|DELETE|MODIFY\',\'LEFT\')).replaceAll(\'NON\',\'\').replaceAll(\'EQUALRIGHTLEFT|RIGHTLEFT\',\'EQUAL\');\""));
      String _nodeDef_10 = nodeDef;
      nodeDef = (_nodeDef_10 + ("\n" + "\t\t\t\t}"));
    }
    return nodeDef;
  }

  public String defineNode(final EObject n, final String actionText, final String henshinFileType) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstraintType cannot be resolved to a type."
      + "\nConstraintType cannot be resolved to a type."
      + "\nConstraintType cannot be resolved to a type."
      + "\nConstraintType cannot be resolved to a type."
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.rightConstraintCollection refers to the missing type ConstraintType"
      + "\nnodeLhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved");
  }

  public String getStringAttrDef(final EObject n, final String attrName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\ngetEAttributeByName cannot be resolved"
      + "\n== cannot be resolved"
      + "\ngetEAttributeType cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\n== cannot be resolved");
  }

  public void defineEdges() {
    throw new Error("Unresolved compilation problems:"
      + "\nEReferenceType cannot be resolved to a type."
      + "\nThe method getAllAssocCollection() from the type DSRulesToHenshinTextCPANew refers to the missing type EReferenceType"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neReference cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nsource cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nsource cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nsource cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nsource cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neReference cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neReference cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nsource cannot be resolved"
      + "\neClass cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neReference cannot be resolved"
      + "\ngetName cannot be resolved");
  }

  public void findRuleConstraintsAndRuleSignature() {
    throw new Error("Unresolved compilation problems:"
      + "\nConstraintType cannot be resolved to a type."
      + "\nConstraintType cannot be resolved."
      + "\nThe method or field ConstraintCompareType is undefined"
      + "\nThe method or field ConstraintCompareType is undefined"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe method constraintDsDiffToConstraintType(String) from the type DSRulesToHenshinTextCPANew refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.rightConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.rightConstraintCollection refers to the missing type ConstraintType"
      + "\n!== cannot be resolved"
      + "\nlhs cannot be resolved"
      + "\nlhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nTwoAttrsSameObject cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nreplace cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nruleInRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nOneAttrAndOneValue cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconditionName cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nruleInRhs cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nruleInRhs cannot be resolved");
  }

  public String defineConstraints() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DSRulesToHenshinTextCPANew.leftConstraintCollection refers to the missing type ConstraintType"
      + "\nThe field DSRulesToHenshinTextCPANew.rightConstraintCollection refers to the missing type ConstraintType"
      + "\nconditionText cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n!= cannot be resolved");
  }

  public String createNode(final EObject n) {
    String _createNodeNumber = this.createNodeNumber(n);
    return ("node " + _createNodeNumber);
  }

  public String createNodeNumber(final EObject n) {
    String _trim = this.getAttrValueByName(n, "ID_Pattern").toString().replace("-", "").trim();
    return ("n" + _trim);
  }

  public /* ArrayList<EReferenceType> */Object getAllAssocCollection() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getAllNodeAssocCollection(EObject) from the type DSRulesToHenshinTextCPANew refers to the missing type EReferenceType"
      + "\nThe field DSRulesToHenshinTextCPANew.allDsDiffRuleAssocCollection refers to the missing type EReferenceType"
      + "\nThe field DSRulesToHenshinTextCPANew.allDsDiffRuleAssocCollection refers to the missing type EReferenceType");
  }

  public /* ArrayList<EReferenceType> */Object getAllNodeAssocCollection(final EObject src) {
    throw new Error("Unresolved compilation problems:"
      + "\nEReferenceType cannot be resolved to a type."
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nEReferenceType cannot be resolved."
      + "\ngetAllTargets cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\neReference cannot be resolved");
  }

  public /* ConstraintType */Object constraintDsDiffToConstraintType(final String constraintDsDiff) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nConstraintType cannot be resolved."
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field ConstraintCompareType is undefined"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field DsmComparatorController is undefined"
      + "\nThe method or field ConstraintCompareType is undefined"
      + "\nallMatches cannot be resolved"
      + "\nlhs cannot be resolved"
      + "\nrhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\ngetNodeByID_Pattern cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nid_PatternLhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\ngetAttrDataTypeNameByAttrName cannot be resolved"
      + "\nnodeLhs cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nTwoAttrsSameObject cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\ngetNodeByID_Pattern cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrLhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\ngetAttrDataTypeNameByAttrName cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nruleInRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\nconstraintCompareType cannot be resolved"
      + "\nOneAttrAndOneValue cannot be resolved"
      + "\nid_PatternRhs cannot be resolved"
      + "\nnodeRhs cannot be resolved"
      + "\nattrRhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nattrTypeRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nruleInLhs cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nattrTypeLhs cannot be resolved"
      + "\nconditionName cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\nvarInRhs cannot be resolved"
      + "\nconditionText cannot be resolved"
      + "\nvarInLhs cannot be resolved"
      + "\noperation cannot be resolved"
      + "\nvarInRhs cannot be resolved");
  }

  public CharSequence generatePackageImport(final EObject it) {
    return _generatePackageImport(it);
  }

  public CharSequence generateRule(final EObject it, final String henshinFileType) {
    return _generateRule(it, henshinFileType);
  }
}
