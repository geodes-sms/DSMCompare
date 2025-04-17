package com.zadahmad.dsemfcompare.editor.dsmcHenshin;

import com.google.common.base.Objects;

import ca.umontreal.geodes.dsmcompare.core.DsmComparatorController;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.ConstraintCompareType;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.ConstraintType;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.EReferenceType;
import ca.umontreal.geodes.dsmcompare.dsmcHenshin.RuleAttributes;
import ca.umontreal.geodes.dsmcompare.mmextension.utils.DsmcHelpers;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
public class TransformCRRuleToHenshin {
  private ArrayList<EObject> allDsDiffRuleNodes = new ArrayList<EObject>();

  private ArrayList<EReferenceType> allDsDiffRuleAssocCollection = new ArrayList<EReferenceType>();

  private ArrayList<ConstraintType> leftConstraintCollection = new ArrayList<ConstraintType>();

  private ArrayList<ConstraintType> rightConstraintCollection = new ArrayList<ConstraintType>();

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

  public ArrayList<RuleAttributes> rulesFilter = new ArrayList<RuleAttributes>();

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

  public void runPostRuleGenerator() {
    this.henshinRulesDSDiffPostRulePath = (((this.dsmCasePath + this.dsmCaseHenshinRulesFolderName) + this.dsmName) + "RulesDSDiffPostRules.henshin_text");
    this.setRulesFilter();
    this.setRulesFilePaths();
    this.generatePostRules(this.dsmCaseRuleFilePaths, this.henshinRulesDSDiffPostRulePath);
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
    for (final String ruleFileName : this.dsmCaseRuleFileNames) {
      int _length = ruleFileName.length();
      int _minus = (_length - 4);
      String _substring = ruleFileName.substring(0, _minus);
      RuleAttributes _ruleAttributes = new RuleAttributes(_substring, (-1), (-1));
      this.rulesFilter.add(_ruleAttributes);
    }
  }

  public ConstraintType cloneConstraintType(final ConstraintType ctLeft, final String varLR, final String rVal) {
    ConstraintType ctRight = new ConstraintType();
    ctRight.lhs = ctLeft.lhs;
    ctRight.rhs = ctLeft.rhs;
    ctRight.operation = ctLeft.operation;
    ctRight.id_PatternLhs = ctLeft.id_PatternLhs;
    ctRight.nodeLhs = ctLeft.nodeLhs;
    ctRight.attrLhs = ctLeft.attrLhs;
    ctRight.varInLhs = ((("n" + ctRight.id_PatternLhs) + ctRight.attrLhs) + varLR);
    ctRight.attrTypeLhs = ctLeft.attrTypeLhs;
    ctRight.constraintCompareType = ctLeft.constraintCompareType;
    ctRight.id_PatternRhs = ctLeft.id_PatternRhs;
    ctRight.nodeRhs = ctLeft.nodeRhs;
    ctRight.attrRhs = ctLeft.attrRhs;
    ctRight.varInRhs = ctLeft.varInRhs;
    ctRight.attrTypeRhs = ctLeft.attrTypeRhs;
    ctRight.ruleInLhs = ((("VAR " + ctRight.varInLhs) + ":") + ctRight.attrTypeLhs);
    ctRight.conditionName = (("condition" + ctRight.varInLhs) + ctRight.varInRhs);
    ctRight.conditionText = (((((("(" + ctRight.varInLhs) + " ") + ctRight.operation) + " ") + rVal) + ")");
    return ctRight;
  }

  public void setSignatureItems(final String henshinFileType) {
    this.ruleSignature = "";
    for (final EObject n : this.allDsDiffRuleNodes) {
      {
        String action = "preserve";
        Object _attrValueByName = this.getAttrValueByName(n, "isForbidden");
        boolean _equals = Objects.equal(_attrValueByName, Boolean.valueOf(true));
        if (_equals) {
          action = "forbid";
        } else {
          if ((this.getSuperClassName(n).toLowerCase().contains("semanticdiff") || (this.getAttrValueByName(n, "ID_Pattern").toString().contains("-") == true))) {
            action = "create";
          } else {
            Object _attrValueByName_1 = this.getAttrValueByName(n, "Filter");
            boolean _equals_1 = Objects.equal(_attrValueByName_1, Boolean.valueOf(true));
            if (_equals_1) {
              action = "delete";
            }
          }
        }
        String diffKindVal = "";
        String diffKindLeftDef = "";
        String diffKindRightDef = "";
        boolean _equals_2 = Objects.equal(henshinFileType, "DSDiff");
        if (_equals_2) {
          String attrName = "diff_kind";
          EAttribute attr = DsmComparatorController.getEAttributeByName(n, attrName);
          if (((!Objects.equal(attr, null)) && Objects.equal(attr.getEAttributeType().eClass().getName().toLowerCase(), "eenum"))) {
            String _string = n.eGet(attr).toString();
            String _plus = ("\"\\\"" + _string);
            String rVal = (_plus + "\\\"\"");
            ConstraintType ctLeft = new ConstraintType();
            ctLeft.lhs = "";
            ctLeft.rhs = "";
            ctLeft.operation = "==";
            ctLeft.id_PatternLhs = this.getAttrValueByName(n, "ID_Pattern").toString();
            ctLeft.nodeLhs = DsmComparatorController.getNodeByID_Pattern(this.allDsDiffRuleNodes, ctLeft.id_PatternLhs);
            ctLeft.attrLhs = attrName;
            ctLeft.varInLhs = ((("n" + ctLeft.id_PatternLhs) + ctLeft.attrLhs) + "_Left");
            ctLeft.attrTypeLhs = "EString";
            ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
            ctLeft.id_PatternRhs = "-1";
            ctLeft.nodeRhs = null;
            ctLeft.attrRhs = "";
            ctLeft.varInRhs = "";
            ctLeft.attrTypeRhs = "";
            ctLeft.ruleInLhs = ((("VAR " + ctLeft.varInLhs) + ":") + ctLeft.attrTypeLhs);
            ctLeft.conditionName = (("condition" + ctLeft.varInLhs) + ctLeft.varInRhs);
            ctLeft.conditionText = (((((("(" + ctLeft.varInLhs) + " ") + ctLeft.operation) + " ") + rVal) + ")");
            ConstraintType ctRight = this.cloneConstraintType(ctLeft, "_Right", rVal);
            this.leftAuthorConstraintCollection.add(ctLeft.conditionText);
            this.rightAuthorConstraintCollection.add(ctRight.conditionText);
            this.addParamToRuleSignature(ctLeft.ruleInLhs);
            this.addParamToRuleSignature(ctLeft.ruleInRhs);
            this.addParamToRuleSignature(ctRight.ruleInLhs);
            this.addParamToRuleSignature(ctRight.ruleInRhs);
          }
        }
      }
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
          this.rulesDefinitionsAndCallsInSequntialStarUnit = ("\n\t" + "unit unitSequntialStar(){");
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
          String _rulesDefinitionsAndCallsInSequntialStarUnit = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit + this.callsStarUnits);
          String _rulesDefinitionsAndCallsInSequntialStarUnit_1 = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit_1 + "\n\t}");
          String _rulesDefinitionsAndCallsInSequntialStarUnit_2 = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit_2 + this.DefinitionsStarUnits);
          out.print(this.rulesDefinitionsAndCallsInSequntialStarUnit);
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

  public void generatePostRules(final ArrayList<String> ruleFilePathes, final String henshin_textFilePath) {
    try {
      if (((!Objects.equal(ruleFilePathes, null)) && (ruleFilePathes.size() > 0))) {
        this.doEMFSetup();
        PrintWriter out = new PrintWriter(henshin_textFilePath);
        try {
          final ResourceSetImpl resourceSetPackage = new ResourceSetImpl();
          final Resource resourcePackage = resourceSetPackage.getResource(URI.createURI(ruleFilePathes.get(0)), true);
          EObject _get = resourcePackage.getContents().get(0);
          out.print(this.generatePackageImport(((EObject) _get)));
          this.rulesDefinitionsAndCallsInSequntialStarUnit = ("\n\t" + "unit unitSequntialStar(){");
          this.i = (-1);
          for (final String rulePath : ruleFilePathes) {
            {
              this.ruleFilterNumber = 0;
              this.ruleElementNumber = 0;
              final ResourceSetImpl resourceSet = new ResourceSetImpl();
              final Resource resource = resourceSet.getResource(URI.createURI(rulePath), true);
              EList<EObject> _contents = resource.getContents();
              for (final EObject content : _contents) {
                out.print(this.generatePostProcessorRule(((EObject) content)));
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
          String _rulesDefinitionsAndCallsInSequntialStarUnit = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit + this.callsStarUnits);
          String _rulesDefinitionsAndCallsInSequntialStarUnit_1 = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit_1 + "\n\t}");
          String _rulesDefinitionsAndCallsInSequntialStarUnit_2 = this.rulesDefinitionsAndCallsInSequntialStarUnit;
          this.rulesDefinitionsAndCallsInSequntialStarUnit = (_rulesDefinitionsAndCallsInSequntialStarUnit_2 + this.DefinitionsStarUnits);
          out.print(this.rulesDefinitionsAndCallsInSequntialStarUnit);
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
    _builder.append("ePackageImport  �eClass().getEPackage().getName().replace(\"2WayRule\",\"Diff\")�");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generateRule(final EObject it, final String henshinFileType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("�init(eContents().get(0))�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�defineStarUnitForRule(getAttrValueByName(it,\"name\").toString())�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�callStarUnitForRule(getAttrValueByName(it,\"name\").toString())�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�setSignatureItems(\"DSDiff\")�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�findRuleConstraintsAndRuleSignature()�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("rule �getAttrValueByName(it,\"name\").toString()�(�ruleSignature�)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("graph");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t  \t");
    _builder.append("�FOR n : allDsDiffRuleNodes�");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t");
    _builder.append("�IF getAttrValueByName(n,\"isForbidden\") == true �");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("�defineNode(n, \"forbid\", henshinFileType)�\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�ELSEIF getSuperClassName(n).toLowerCase().contains(\"semanticdiff\") ");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t");
    _builder.append("|| getAttrValueByName(n,\"ID_Pattern\").toString().contains(\"-\") == true�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("�defineNode(n,\"create\", henshinFileType)�");
    _builder.newLine();
    _builder.append("\t\t\t      \t");
    _builder.append("�ELSEIF getAttrValueByName(n,\"Filter\") == true �");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("�defineNode(n, \"delete\", henshinFileType)�");
    _builder.newLine();
    _builder.append("\t\t\t      \t");
    _builder.append("�ELSE�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("�defineNode(n,\"preserve\", henshinFileType)�\t\t\t      \t\t");
    _builder.newLine();
    _builder.append("\t\t\t      \t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t  \t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�defineEdges()�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF edges.size() > 0�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("edges[");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t");
    _builder.append("�FOR edg : edges�");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t\t");
    _builder.append("�edg�");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t      \t\t ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�\t\t      \t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�defineConstraints()� �cleanUpVariablesForNextRuleLoop()�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("//----------------------------------------------------------------------");
    _builder.newLine();
    return _builder;
  }

  protected CharSequence _generatePostProcessorRule(final EObject it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("�init(eContents().get(0))��getPostRuleNodes()�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�defineStarUnitForRule(getAttrValueByName(it,\"name\").toString()+\"Post\")�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�callStarUnitForRule(getAttrValueByName(it,\"name\").toString()+\"Post\")� �setVarPostCountToZero()�");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("rule �getAttrValueByName(it,\"name\").toString()+\"Post\"�(VAR nPostchangeStatus:EString, VAR nPostdiff_kind_Left:EString, VAR nPostdiff_kind_Right:EString)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("graph");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t  \t");
    _builder.append("�FOR n : allDsDiffRuleNodes�");
    _builder.newLine();
    _builder.append("\t\t\t  \t\t");
    _builder.append("�IF getAttrValueByName(n,\"isForbidden\") != true && getAttrValueByName(n,\"Filter\") != true�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("�defineNodePost(n, \"preserve\")�");
    _builder.newLine();
    _builder.append("\t\t\t      \t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t  \t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�defineEdges()�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF edges.size() > 0�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("edges[");
    _builder.newLine();
    _builder.append("\t\t  \t\t");
    _builder.append("�FOR edg : edges�");
    _builder.newLine();
    _builder.append("\t\t  \t\t\t");
    _builder.append("�IF !edg.contains(\"delete\")�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("�\"\\t\\t\\t\\t\\t\"+edg.replace(\"create\",\"preserve\")�");
    _builder.newLine();
    _builder.append("\t\t      \t\t");
    _builder.append("�ENDIF�\t\t\t  \t\t\t\t\t  \t\t\t");
    _builder.newLine();
    _builder.append("\t\t  \t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t      \t\t ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�\t\t      \t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
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
    this.leftConstraintCollection = _arrayList_2;
    ArrayList<String> _arrayList_3 = new ArrayList<String>();
    this.signatureParameters = _arrayList_3;
    this.ruleSignature = "";
    this.totalConstraintDefinition = "";
    this.ruleNode = null;
    this.ruleNode = root.eContainer();
    this.allDsDiffRuleNodes = DsmComparatorController.getAllNodes(root, Boolean.valueOf(true), Boolean.valueOf(false));
    int i = 1;
    for (i = 1; (i < this.ruleNode.eContents().size()); i++) {
      {
        EObject node = this.ruleNode.eContents().get(i);
        this.allDsDiffRuleNodes.addAll(DsmComparatorController.getAllNodes(node, Boolean.valueOf(true), Boolean.valueOf(false)));
      }
    }
    HashSet<EObject> set = new HashSet<EObject>(this.allDsDiffRuleNodes);
    this.allDsDiffRuleNodes.clear();
    this.allDsDiffRuleNodes.addAll(set);
    this.allDsDiffRuleNodes = DsmcHelpers.sortByPropertyName(this.allDsDiffRuleNodes, "ID_Pattern");
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
    this.ruleSignature = "";
    this.totalConstraintDefinition = "";
    this.leftAuthorConstraintCollection.clear();
    this.rightAuthorConstraintCollection.clear();
    this.leftConstraintCollection.clear();
    this.rightConstraintCollection.clear();
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
    String nodeDef = ("\t\t\t\t " + actionText);
    if ((Objects.equal(actionText, "preserve") || Objects.equal(actionText, "forbid"))) {
      String _nodeDef = nodeDef;
      nodeDef = (_nodeDef + "\t\t\t");
    } else {
      String _nodeDef_1 = nodeDef;
      nodeDef = (_nodeDef_1 + "\t\t\t\t");
    }
    boolean _equals = Objects.equal(actionText, "delete");
    if (_equals) {
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
    for (final ConstraintType ct : this.leftConstraintCollection) {
      if ((Objects.equal(ct.nodeLhs, n) || Objects.equal(ct.nodeRhs, n))) {
        ctNodes.add(ct);
      }
    }
    for (final ConstraintType ct_1 : this.rightConstraintCollection) {
      if ((Objects.equal(ct_1.nodeLhs, n) || Objects.equal(ct_1.nodeRhs, n))) {
        ctNodes.add(ct_1);
      }
    }
    String diffKindVal = "";
    String diffKindLeftDef = "";
    String diffKindRightDef = "";
    boolean _equals_1 = Objects.equal(henshinFileType, "DSDiff");
    if (_equals_1) {
      diffKindVal = this.getStringAttrDef(n, "diff_kind");
      boolean _contains = diffKindVal.contains("NON");
      boolean _not = (!_contains);
      if (_not) {
        diffKindLeftDef = diffKindVal.replace("diff_kind", "diff_kind_Left");
        diffKindRightDef = diffKindVal.replace("diff_kind", "diff_kind_Right");
      }
    }
    String domainspecificdiffNameAttrDef = "";
    boolean _contains_1 = this.getSuperClassName(n).toLowerCase().contains("semanticdiff");
    if (_contains_1) {
      domainspecificdiffNameAttrDef = this.getStringAttrDef(n, "name");
    }
    if (((((ctNodes.size() > 0) || (!Objects.equal(diffKindLeftDef, ""))) || 
      (!Objects.equal(diffKindRightDef, ""))) || (!Objects.equal(domainspecificdiffNameAttrDef, "")))) {
      String _nodeDef_3 = nodeDef;
      nodeDef = (_nodeDef_3 + "{");
      boolean _notEquals_1 = (!Objects.equal(domainspecificdiffNameAttrDef, ""));
      if (_notEquals_1) {
        String _nodeDef_4 = nodeDef;
        nodeDef = (_nodeDef_4 + ((("\n\t\t\t\t\t" + actionText) + " ") + domainspecificdiffNameAttrDef));
      }
      boolean _notEquals_2 = (!Objects.equal(diffKindLeftDef, ""));
      if (_notEquals_2) {
        String _nodeDef_5 = nodeDef;
        nodeDef = (_nodeDef_5 + ((("\n\t\t\t\t\t" + actionText) + " ") + diffKindLeftDef));
      }
      boolean _notEquals_3 = (!Objects.equal(diffKindRightDef, ""));
      if (_notEquals_3) {
        String _nodeDef_6 = nodeDef;
        nodeDef = (_nodeDef_6 + ((("\n\t\t\t\t\t" + actionText) + " ") + diffKindRightDef));
      }
      for (final ConstraintType ct_2 : ctNodes) {
        {
          if ((Objects.equal(ct_2.nodeLhs, n) && (!nodeDef.contains(((ct_2.attrLhs + " =  ") + ct_2.varInLhs))))) {
            String _nodeDef_7 = nodeDef;
            nodeDef = (_nodeDef_7 + ((((("\n\t\t\t\t\t" + actionText) + " ") + ct_2.attrLhs) + " =  ") + ct_2.varInLhs));
          }
          if ((Objects.equal(ct_2.nodeRhs, n) && (!nodeDef.contains(((ct_2.attrRhs + " =  ") + ct_2.varInRhs))))) {
            String _nodeDef_8 = nodeDef;
            nodeDef = (_nodeDef_8 + ((((("\n\t\t\t\t\t" + actionText) + " ") + ct_2.attrRhs) + " =  ") + ct_2.varInRhs));
          }
        }
      }
      String _nodeDef_7 = nodeDef;
      nodeDef = (_nodeDef_7 + ("\n" + "\t\t\t\t}"));
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
        String id_PatternLhs = this.getAttrValueByName(n, "ID_Pattern").toString();
        return ((((attrName + " = ") + "n") + id_PatternLhs) + attrName);
      } else {
        String _string = n.eGet(attr).toString();
        String _plus = (((attrName + " = ") + "\"\\\"") + _string);
        return (_plus + "\\\"\"");
      }
    }
  }

  public void defineEdges() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.edges = _arrayList;
    ArrayList<EReferenceType> _allAssocCollection = this.getAllAssocCollection();
    for (final EReferenceType ERefC : _allAssocCollection) {
      if ((this.allDsDiffRuleNodes.contains(ERefC.source) && this.allDsDiffRuleNodes.contains(ERefC.target))) {
        if ((Objects.equal(this.getAttrValueByName(ERefC.source, "isForbidden"), Boolean.valueOf(true)) || Objects.equal(this.getAttrValueByName(ERefC.target, "isForbidden"), Boolean.valueOf(true)))) {
          String _createNodeNumber = this.createNodeNumber(ERefC.source);
          String _plus = (("(" + 
            "forbid\t\t") + _createNodeNumber);
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
          if ((((ERefC.source.eClass().getName().toLowerCase().contains("semanticdiff") || ERefC.target.eClass().getName().toLowerCase().contains("semanticdiff")) || (this.getAttrValueByName(ERefC.source, "ID_Pattern").toString().contains("-") == true)) || (this.getAttrValueByName(ERefC.target, "ID_Pattern").toString().contains("-") == true))) {
            String _createNodeNumber_2 = this.createNodeNumber(ERefC.source);
            String _plus_5 = (("(" + 
              "create\t\t") + _createNodeNumber_2);
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
          } else {
            if ((Objects.equal(this.getAttrValueByName(ERefC.source, "Filter"), Boolean.valueOf(true)) || Objects.equal(this.getAttrValueByName(ERefC.target, "Filter"), Boolean.valueOf(true)))) {
              String _createNodeNumber_4 = this.createNodeNumber(ERefC.source);
              String _plus_10 = (("(" + 
                "delete\t\t") + _createNodeNumber_4);
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
              int _ruleFilterNumber = this.ruleFilterNumber;
              this.ruleFilterNumber = (_ruleFilterNumber + 1);
              int _ruleElementNumber = this.ruleElementNumber;
              this.ruleElementNumber = (_ruleElementNumber + 1);
            } else {
              boolean _contains = ERefC.source.eClass().getName().toLowerCase().contains("semanticdiff");
              boolean _not = (!_contains);
              if (_not) {
                String _createNodeNumber_6 = this.createNodeNumber(ERefC.source);
                String _plus_15 = (("(" + 
                  "preserve\t") + _createNodeNumber_6);
                String _plus_16 = (_plus_15 + 
                  "->");
                String _createNodeNumber_7 = this.createNodeNumber(ERefC.target);
                String _plus_17 = (_plus_16 + _createNodeNumber_7);
                String _plus_18 = (_plus_17 + 
                  ":");
                String _name_3 = ERefC.eReference.getName();
                String _plus_19 = (_plus_18 + _name_3);
                String AssocDef_3 = (_plus_19 + 
                  "),");
                this.edges.add(AssocDef_3);
                int _ruleElementNumber_1 = this.ruleElementNumber;
                this.ruleElementNumber = (_ruleElementNumber_1 + 1);
              }
            }
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

  public void findRuleConstraintsAndRuleSignature() {
    if ((this.ruleNode != null)) {
      ArrayList<ConstraintType> _arrayList = new ArrayList<ConstraintType>();
      this.leftConstraintCollection = _arrayList;
      String consts = Arrays.<Object>asList(this.getAttrValueByName(this.ruleNode, "Constraints")).stream().collect(Collectors.<Object>toList()).get(0).toString().trim();
      boolean _notEquals = (!Objects.equal(consts, ""));
      if (_notEquals) {
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
              this.leftConstraintCollection.add(ct);
            }
          }
        }
        for (final ConstraintType ctLeft : this.leftConstraintCollection) {
          {
            ConstraintType ctRight = new ConstraintType();
            ctRight.lhs = ctLeft.lhs;
            ctRight.rhs = ctLeft.rhs;
            ctRight.operation = ctLeft.operation;
            ctRight.id_PatternLhs = ctLeft.id_PatternLhs;
            ctRight.nodeLhs = ctLeft.nodeLhs;
            ctRight.attrLhs = ctLeft.attrLhs;
            boolean _startsWith = ctRight.attrLhs.startsWith("new_");
            if (_startsWith) {
              ctRight.attrLhs = ctRight.attrLhs.replace("_Left", "_Right");
            }
            ctRight.varInLhs = (("n" + ctRight.id_PatternLhs) + ctRight.attrLhs);
            ctRight.attrTypeLhs = ctLeft.attrTypeLhs;
            int _indexOf = ctRight.rhs.indexOf("Item");
            boolean _notEquals_1 = (_indexOf != (-1));
            if (_notEquals_1) {
              ctRight.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
              ctRight.id_PatternRhs = ctLeft.id_PatternRhs;
              ctRight.nodeRhs = ctLeft.nodeRhs;
              ctRight.attrRhs = ctLeft.attrRhs;
              boolean _startsWith_1 = ctRight.attrRhs.startsWith("new_");
              if (_startsWith_1) {
                ctRight.attrRhs = ctRight.attrRhs.replace("_Left", "_Right");
              }
              ctRight.varInRhs = (("n" + ctRight.id_PatternRhs) + ctRight.attrRhs);
              ctRight.attrTypeRhs = ctLeft.attrTypeRhs;
              ctRight.ruleInRhs = ((("VAR " + ctRight.varInRhs) + ":") + ctRight.attrTypeRhs);
            } else {
              ctRight.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
              ctRight.id_PatternRhs = "-1";
              ctRight.nodeRhs = null;
              ctRight.attrRhs = "";
              ctRight.varInRhs = "";
              ctRight.attrTypeRhs = "";
              ctRight.operation = ctLeft.operation;
            }
            ctRight.ruleInLhs = ((("VAR " + ctRight.varInLhs) + ":") + ctRight.attrTypeLhs);
            ctRight.conditionName = (("condition" + ctRight.varInLhs) + ctRight.varInRhs);
            boolean _equals = ctRight.operation.equals("contains");
            if (_equals) {
              ctRight.conditionText = ((((((((("(\"" + ctRight.varInLhs) + ".") + ctRight.operation) + "(") + ctRight.varInRhs) + ".replace(\'return;\',\'\'))\"") + " == ") + "\'true\'") + ")");
            } else {
              boolean _equals_1 = ctRight.operation.equals("containsMethod");
              if (_equals_1) {
                ctRight.conditionText = (((((((("(\"" + ctRight.varInLhs) + ".contains") + "(") + ctRight.varInRhs) + ".replace(\'()\',\'\'))\"") + " == ") + "\'true\'") + ")");
              } else {
                boolean _equals_2 = ctRight.operation.equals("containsMethodInvocation");
                if (_equals_2) {
                  ctRight.conditionText = (((((((("(\"" + ctRight.varInLhs) + ".contains") + "(\'method invocation; \' + ") + ctRight.varInRhs) + ".replace(\'()\',\';\'))\"") + " == ") + "\'true\'") + ")");
                } else {
                  boolean _equals_3 = ctRight.operation.equals("contains2");
                  if (_equals_3) {
                    ctRight.conditionText = (((((((("(\"" + ctRight.varInLhs) + ".contains") + "(") + ctRight.varInRhs) + ")\"") + " == ") + "\'true\'") + ")");
                  } else {
                    ctRight.conditionText = (((((("(" + ctRight.varInLhs) + " ") + ctRight.operation) + " ") + ctRight.varInRhs) + ")");
                  }
                }
              }
            }
            this.rightConstraintCollection.add(ctRight);
          }
        }
        for (final ConstraintType c : this.leftConstraintCollection) {
          {
            this.addParamToRuleSignature(c.ruleInLhs);
            this.addParamToRuleSignature(c.ruleInRhs);
          }
        }
        for (final ConstraintType c_1 : this.rightConstraintCollection) {
          {
            this.addParamToRuleSignature(c_1.ruleInLhs);
            this.addParamToRuleSignature(c_1.ruleInRhs);
          }
        }
      }
    }
  }

  public Boolean addParamToRuleSignature(final String param) {
    if ((((!Objects.equal(param, null)) && (!Objects.equal(param, ""))) && (!this.ruleSignature.contains(param)))) {
      if (((!Objects.equal(this.ruleSignature, "")) && (!Objects.equal(this.ruleSignature, null)))) {
        String _ruleSignature = this.ruleSignature;
        this.ruleSignature = (_ruleSignature + ("," + param));
      } else {
        String _ruleSignature_1 = this.ruleSignature;
        this.ruleSignature = (_ruleSignature_1 + param);
      }
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }

  public String defineConstraints() {
    this.ruleSignature = "";
    this.totalConstraintDefinition = "";
    if ((this.ruleNode != null)) {
      String leftAuthorConstraintDefinition = "";
      String rightAuthorConstraintDefinition = "";
      String leftConstraintDefinition = "";
      String rightConstraintDefinition = "";
      for (final String s : this.leftAuthorConstraintCollection) {
        if (((!Objects.equal(s, "")) && (!Objects.equal(s, "")))) {
          if (((!Objects.equal(leftAuthorConstraintDefinition, "")) && (!Objects.equal(leftAuthorConstraintDefinition, null)))) {
            String _leftAuthorConstraintDefinition = leftAuthorConstraintDefinition;
            leftAuthorConstraintDefinition = (_leftAuthorConstraintDefinition + (" AND " + s));
          } else {
            String _leftAuthorConstraintDefinition_1 = leftAuthorConstraintDefinition;
            leftAuthorConstraintDefinition = (_leftAuthorConstraintDefinition_1 + s);
          }
        }
      }
      for (final String s_1 : this.rightAuthorConstraintCollection) {
        if (((!Objects.equal(s_1, "")) && (!Objects.equal(s_1, null)))) {
          if (((!Objects.equal(rightAuthorConstraintDefinition, "")) && (!Objects.equal(rightAuthorConstraintDefinition, null)))) {
            String _rightAuthorConstraintDefinition = rightAuthorConstraintDefinition;
            rightAuthorConstraintDefinition = (_rightAuthorConstraintDefinition + (" AND " + s_1));
          } else {
            String _rightAuthorConstraintDefinition_1 = rightAuthorConstraintDefinition;
            rightAuthorConstraintDefinition = (_rightAuthorConstraintDefinition_1 + s_1);
          }
        }
      }
      for (final ConstraintType c : this.leftConstraintCollection) {
        {
          String s_2 = c.conditionText;
          if (((!Objects.equal(s_2, "")) && (!Objects.equal(s_2, "")))) {
            if (((!Objects.equal(leftConstraintDefinition, "")) && (!Objects.equal(leftConstraintDefinition, null)))) {
              String _leftConstraintDefinition = leftConstraintDefinition;
              leftConstraintDefinition = (_leftConstraintDefinition + (" AND " + s_2));
            } else {
              String _leftConstraintDefinition_1 = leftConstraintDefinition;
              leftConstraintDefinition = (_leftConstraintDefinition_1 + s_2);
            }
          }
        }
      }
      for (final ConstraintType c_1 : this.rightConstraintCollection) {
        {
          String s_2 = c_1.conditionText;
          if (((!Objects.equal(s_2, "")) && (!Objects.equal(s_2, null)))) {
            if (((!Objects.equal(rightConstraintDefinition, "")) && (!Objects.equal(rightConstraintDefinition, null)))) {
              String _rightConstraintDefinition = rightConstraintDefinition;
              rightConstraintDefinition = (_rightConstraintDefinition + (" AND " + s_2));
            } else {
              String _rightConstraintDefinition_1 = rightConstraintDefinition;
              rightConstraintDefinition = (_rightConstraintDefinition_1 + s_2);
            }
          }
        }
      }
      String totalLeftconstraintDefinition = "";
      String totalRightconstraintDefinition = "";
      if (((((!Objects.equal(leftConstraintDefinition, "")) && (!Objects.equal(leftConstraintDefinition, null))) && 
        (!Objects.equal(leftAuthorConstraintDefinition, ""))) && (!Objects.equal(leftAuthorConstraintDefinition, null)))) {
        totalLeftconstraintDefinition = ((leftConstraintDefinition + " AND ") + leftAuthorConstraintDefinition);
      } else {
        if ((((!Objects.equal(leftConstraintDefinition, "")) && (!Objects.equal(leftConstraintDefinition, null))) && (Objects.equal(leftAuthorConstraintDefinition, "") || Objects.equal(leftAuthorConstraintDefinition, null)))) {
          totalLeftconstraintDefinition = leftConstraintDefinition;
        } else {
          if ((((Objects.equal(leftConstraintDefinition, "") || Objects.equal(leftConstraintDefinition, null)) && 
            (!Objects.equal(leftAuthorConstraintDefinition, ""))) && (!Objects.equal(leftAuthorConstraintDefinition, null)))) {
            totalLeftconstraintDefinition = leftAuthorConstraintDefinition;
          } else {
            totalLeftconstraintDefinition = "";
          }
        }
      }
      if (((((!Objects.equal(rightConstraintDefinition, "")) && (!Objects.equal(rightConstraintDefinition, null))) && 
        (!Objects.equal(rightAuthorConstraintDefinition, ""))) && (!Objects.equal(rightAuthorConstraintDefinition, null)))) {
        totalRightconstraintDefinition = ((rightConstraintDefinition + " AND ") + rightAuthorConstraintDefinition);
      } else {
        if ((((!Objects.equal(rightConstraintDefinition, "")) && (!Objects.equal(rightConstraintDefinition, null))) && (Objects.equal(rightAuthorConstraintDefinition, "") || Objects.equal(rightAuthorConstraintDefinition, null)))) {
          totalRightconstraintDefinition = rightConstraintDefinition;
        } else {
          if ((((Objects.equal(rightConstraintDefinition, "") || Objects.equal(rightConstraintDefinition, null)) && 
            (!Objects.equal(rightAuthorConstraintDefinition, ""))) && (!Objects.equal(rightAuthorConstraintDefinition, null)))) {
            totalRightconstraintDefinition = rightAuthorConstraintDefinition;
          } else {
            totalRightconstraintDefinition = "";
          }
        }
      }
      if (((((!Objects.equal(totalLeftconstraintDefinition, "")) && (!Objects.equal(totalLeftconstraintDefinition, null))) && (!Objects.equal(totalRightconstraintDefinition, ""))) && (!Objects.equal(totalRightconstraintDefinition, null)))) {
        this.totalConstraintDefinition = (((("conditions [(" + totalLeftconstraintDefinition) + ") OR (") + totalRightconstraintDefinition) + ")]");
      } else {
        if ((((!Objects.equal(totalLeftconstraintDefinition, "")) && (!Objects.equal(totalLeftconstraintDefinition, null))) && (Objects.equal(totalRightconstraintDefinition, "") || Objects.equal(totalRightconstraintDefinition, null)))) {
          this.totalConstraintDefinition = (("conditions [" + totalLeftconstraintDefinition) + "]");
        } else {
          if (((Objects.equal(totalLeftconstraintDefinition, "") || Objects.equal(totalLeftconstraintDefinition, null)) && ((!Objects.equal(totalRightconstraintDefinition, "")) && (!Objects.equal(totalRightconstraintDefinition, null))))) {
            this.totalConstraintDefinition = (("conditions [" + totalRightconstraintDefinition) + "]");
          } else {
            this.totalConstraintDefinition = "";
          }
        }
      }
      return this.totalConstraintDefinition;
    }
    return null;
  }

  public String createNode(final EObject n) {
    String _createNodeNumber = this.createNodeNumber(n);
    return ("node " + _createNodeNumber);
  }

  public String createNodeNumber(final EObject n) {
    String _trim = this.getAttrValueByName(n, "ID_Pattern").toString().replace("-", "").trim();
    return ("n" + _trim);
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

  public ConstraintType constraintDsDiffToConstraintType(final String constraintDsDiff) {
    try {
      String cons = constraintDsDiff;
      String lhs = "";
      String rhs = "";
      String operation = "";
      boolean _contains = cons.contains(" contains ");
      if (_contains) {
        operation = "contains";
        String[] lor = cons.split("contains");
        lhs = (lor[0]).trim();
        final String[] _converted_lor = (String[])lor;
        int _size = ((List<String>)Conversions.doWrapArray(_converted_lor)).size();
        int _minus = (_size - 1);
        rhs = (lor[_minus]).trim();
      } else {
        boolean _contains_1 = cons.contains(" containsMethod ");
        if (_contains_1) {
          operation = "containsMethod";
          String[] lor_1 = cons.split("containsMethod");
          lhs = (lor_1[0]).trim();
          final String[] _converted_lor_1 = (String[])lor_1;
          int _size_1 = ((List<String>)Conversions.doWrapArray(_converted_lor_1)).size();
          int _minus_1 = (_size_1 - 1);
          rhs = (lor_1[_minus_1]).trim();
        } else {
          boolean _contains_2 = cons.contains(" containsMethodInvocation ");
          if (_contains_2) {
            operation = "containsMethodInvocation";
            String[] lor_2 = cons.split("containsMethodInvocation");
            lhs = (lor_2[0]).trim();
            final String[] _converted_lor_2 = (String[])lor_2;
            int _size_2 = ((List<String>)Conversions.doWrapArray(_converted_lor_2)).size();
            int _minus_2 = (_size_2 - 1);
            rhs = (lor_2[_minus_2]).trim();
          } else {
            boolean _contains_3 = cons.contains(" contains2 ");
            if (_contains_3) {
              operation = "contains2";
              String[] lor_3 = cons.split("contains2");
              lhs = (lor_3[0]).trim();
              final String[] _converted_lor_3 = (String[])lor_3;
              int _size_3 = ((List<String>)Conversions.doWrapArray(_converted_lor_3)).size();
              int _minus_3 = (_size_3 - 1);
              rhs = (lor_3[_minus_3]).trim();
            } else {
              String[] lor_4 = cons.split("[[<>!=]=]");
              lhs = (lor_4[0]).trim();
              final String[] _converted_lor_4 = (String[])lor_4;
              int _size_4 = ((List<String>)Conversions.doWrapArray(_converted_lor_4)).size();
              int _minus_4 = (_size_4 - 1);
              rhs = (lor_4[_minus_4]).trim();
              Iterable<MatchResult> mr = DsmComparatorController.allMatches(Pattern.compile("[[<>!=]=]"), cons);
              for (final MatchResult match : mr) {
                String _operation = operation;
                String _group = match.group();
                operation = (_operation + _group);
              }
            }
          }
        }
      }
      ConstraintType ctLeft = new ConstraintType();
      String attrNameOriginal = "";
      ctLeft.lhs = lhs;
      ctLeft.rhs = rhs;
      ctLeft.operation = operation;
      int _indexOf = lhs.indexOf("(");
      int _plus = (_indexOf + 1);
      ctLeft.id_PatternLhs = lhs.substring(_plus, lhs.indexOf(",")).trim();
      ctLeft.nodeLhs = DsmComparatorController.getNodeByID_Pattern(this.allDsDiffRuleNodes, ctLeft.id_PatternLhs);
      int _indexOf_1 = lhs.indexOf("\"");
      int _plus_1 = (_indexOf_1 + 1);
      int _indexOf_2 = lhs.indexOf("\"");
      int _plus_2 = (_indexOf_2 + 1);
      ctLeft.attrLhs = lhs.substring(_plus_1, lhs.indexOf("\"", _plus_2)).trim();
      attrNameOriginal = ctLeft.attrLhs;
      boolean _startsWith = ctLeft.attrLhs.startsWith("new_");
      if (_startsWith) {
        String _attrLhs = ctLeft.attrLhs;
        ctLeft.attrLhs = (_attrLhs + "_Left");
      }
      ctLeft.varInLhs = (("n" + ctLeft.id_PatternLhs) + ctLeft.attrLhs);
      ctLeft.attrTypeLhs = DsmComparatorController.getAttrDataTypeNameByAttrName(ctLeft.nodeLhs, attrNameOriginal);
      int _indexOf_3 = rhs.indexOf("Item");
      boolean _notEquals = (_indexOf_3 != (-1));
      if (_notEquals) {
        ctLeft.constraintCompareType = ConstraintCompareType.TwoAttrsSameObject;
        int _indexOf_4 = rhs.indexOf("(");
        int _plus_3 = (_indexOf_4 + 1);
        ctLeft.id_PatternRhs = rhs.substring(_plus_3, rhs.indexOf(",")).trim();
        ctLeft.nodeRhs = DsmComparatorController.getNodeByID_Pattern(this.allDsDiffRuleNodes, ctLeft.id_PatternRhs);
        int _indexOf_5 = rhs.indexOf("\"");
        int _plus_4 = (_indexOf_5 + 1);
        int _indexOf_6 = rhs.indexOf("\"");
        int _plus_5 = (_indexOf_6 + 1);
        ctLeft.attrRhs = rhs.substring(_plus_4, rhs.indexOf("\"", _plus_5)).trim();
        attrNameOriginal = ctLeft.attrLhs;
        boolean _startsWith_1 = ctLeft.attrRhs.startsWith("new_");
        if (_startsWith_1) {
          String _attrRhs = ctLeft.attrRhs;
          ctLeft.attrRhs = (_attrRhs + "_Left");
        }
        ctLeft.varInRhs = (("n" + ctLeft.id_PatternRhs) + ctLeft.attrRhs);
        ctLeft.attrTypeRhs = DsmComparatorController.getAttrDataTypeNameByAttrName(ctLeft.nodeRhs, attrNameOriginal);
        ctLeft.ruleInRhs = ((("VAR " + ctLeft.varInRhs) + ":") + ctLeft.attrTypeRhs);
      } else {
        ctLeft.constraintCompareType = ConstraintCompareType.OneAttrAndOneValue;
        ctLeft.id_PatternRhs = "-1";
        ctLeft.nodeRhs = null;
        ctLeft.attrRhs = "";
        ctLeft.varInRhs = "";
        ctLeft.attrTypeRhs = "";
        int _indexOf_7 = constraintDsDiff.indexOf(")");
        int _plus_6 = (_indexOf_7 + 1);
        ctLeft.operation = constraintDsDiff.substring(_plus_6, constraintDsDiff.length());
      }
      ctLeft.ruleInLhs = ((("VAR " + ctLeft.varInLhs) + ":") + ctLeft.attrTypeLhs);
      ctLeft.conditionName = (("condition" + ctLeft.varInLhs) + ctLeft.varInRhs);
      boolean _equals = ctLeft.operation.equals("contains");
      if (_equals) {
        ctLeft.conditionText = ((((((((("(\"" + ctLeft.varInLhs) + ".") + ctLeft.operation) + "(") + ctLeft.varInRhs) + ".replace(\'return;\',\'\'))\"") + " == ") + "\'true\'") + ")");
      } else {
        boolean _equals_1 = ctLeft.operation.equals("containsMethod");
        if (_equals_1) {
          ctLeft.conditionText = (((((((("(\"" + ctLeft.varInLhs) + ".contains") + "(") + ctLeft.varInRhs) + ".replace(\'()\',\'\'))\"") + " == ") + "\'true\'") + ")");
        } else {
          boolean _equals_2 = ctLeft.operation.equals("containsMethodInvocation");
          if (_equals_2) {
            ctLeft.conditionText = (((((((("(\"" + ctLeft.varInLhs) + ".contains") + "(\'method invocation; \' + ") + ctLeft.varInRhs) + ".replace(\'()\',\';\'))\"") + " == ") + "\'true\'") + ")");
          } else {
            boolean _equals_3 = ctLeft.operation.equals("contains2");
            if (_equals_3) {
              ctLeft.conditionText = (((((((("(\"" + ctLeft.varInLhs) + ".contains") + "(") + ctLeft.varInRhs) + ")\"") + " == ") + "\'true\'") + ")");
            } else {
              ctLeft.conditionText = (((((("(" + ctLeft.varInLhs) + " ") + ctLeft.operation) + " ") + ctLeft.varInRhs) + ")");
            }
          }
        }
      }
      return ctLeft;
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

  public CharSequence generatePostProcessorRule(final EObject it) {
    return _generatePostProcessorRule(it);
  }
}
