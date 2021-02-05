package dsmcompare.mmextension.utils;

import java.util.ArrayList;
import java.util.List;

public class DSDIFF {
	public String Name;
	public List<DiffRef> DRefs = new ArrayList<DiffRef>(); 
	public List<DiffRef> getDiffRef()
	{
		return DRefs;
	}
}

