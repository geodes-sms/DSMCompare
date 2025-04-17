package ca.umontreal.geodes.dsmcompare.dsmcHenshin;

public class RuleAttributes {
	public String 	_ruleName;
	public int 		_filtersCount  = 0;
	public int 		_elementsCount = 0;
	public int 		_diffElementsCount = 0;
	public RuleAttributes(String ruleName, int filtersCount, int elementsCount, int diffElementsCount) {
		_ruleName		=	ruleName;
		_filtersCount	=	filtersCount;
		_elementsCount = elementsCount;
		_diffElementsCount = diffElementsCount;
	}
	public RuleAttributes(String ruleName, int filtersCount, int elementsCount) {
		_ruleName		=	ruleName;
		_filtersCount	=	filtersCount;
		_elementsCount = elementsCount;
		_diffElementsCount = -1;
	}
}
