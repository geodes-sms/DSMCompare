package ca.umontreal.geodes.dsmcompare.dsmcHenshin;

import org.eclipse.emf.ecore.EObject;

public class ConstraintType{
		public ConstraintCompareType 	constraintCompareType;
		public String 					lhs;
		public String 					rhs;
		public String 					operation;
		public String 					id_PatternLhs;
		public String 					id_PatternRhs;
		public EObject 					nodeLhs;
		public EObject 					nodeRhs;
		public String 					attrLhs;
		public String 					attrTypeLhs;
		public String 					attrRhs;
		public String 					attrTypeRhs;	
		public String 					varInLhs;	
		public String 					varInRhs;
		public String 					ruleInLhs;
		public String 					ruleInRhs;
		public String 					conditionName;
		public String 					conditionText;
	}
